$logPath = "build.log"
$logContent = Get-Content $logPath -Raw
$regex = "(?m)^(C:\\[^:]+\.java):(\d+):\s*(?:\r?\n)?\s*error:\s+(.+)$"
$matches = [regex]::Matches($logContent, $regex)

$filesToProcess = @{}

foreach ($match in $matches) {
    $file = $match.Groups[1].Value -replace "[\r\n]", ""
    $lineNum = [int]$match.Groups[2].Value
    $errorMsg = $match.Groups[3].Value
    
    if (-not $filesToProcess.ContainsKey($file)) {
        $filesToProcess[$file] = @{}
    }
    
    if (-not $filesToProcess[$file].ContainsKey($lineNum)) {
        $filesToProcess[$file][$lineNum] = @()
    }
    
    $filesToProcess[$file][$lineNum] += $errorMsg
}

$modifiedCount = 0

foreach ($file in $filesToProcess.Keys) {
    $lines = Get-Content $file
    $modified = $false
    
    $lineNums = $filesToProcess[$file].Keys | Sort-Object -Descending
    
    foreach ($lineNum in $lineNums) {
        $errorMsgs = $filesToProcess[$file][$lineNum]
        $index = $lineNum - 1
        
        if ($index -ge $lines.Length) { continue }
        
        $currentLine = $lines[$index]
        
        foreach ($msg in $errorMsgs) {
            # Fix: unreported exception IOException
            if ($msg -match "unreported exception ([\w.]+);") {
                $searchIndex = $index
                while ($searchIndex -ge 0 -and $searchIndex -ge $index - 20) {
                    if ($lines[$searchIndex] -match "(public|protected|private|static).*?\([^\)]*\)") {
                        if ($lines[$searchIndex] -notmatch "throws Exception") {
                            if ($lines[$searchIndex] -match "\{") {
                                $lines[$searchIndex] = $lines[$searchIndex] -replace "\{", "throws Exception {"
                            } else {
                                $lines[$searchIndex] = $lines[$searchIndex] + " throws Exception"
                            }
                            $modified = $true
                        }
                        break
                    }
                    $searchIndex--
                }
            }
            
            # Fix: incompatible types: Object cannot be converted to X
            if ($msg -match "incompatible types: Object cannot be converted to ([\w.]+)") {
                $targetType = $matches[1]
                if ($currentLine -match "Object\s+(\w+)\s*=\s*new\s+Object\(\);") {
                    $varName = $matches[1]
                    $lines[$index] = $currentLine -replace "Object\s+$varName\s*=\s*new\s+Object\(\);", "$targetType $varName = new ${targetType}();"
                    $modified = $true
                } elseif ($currentLine -match "new\s+Object\(\)") {
                    $lines[$index] = $currentLine -replace "new\s+Object\(\)", "new ${targetType}()"
                    $modified = $true
                } else {
                    # Maybe it's `(X) obj` needed
                    $lines[$index] = $currentLine + " // TODO: Cast to $targetType"
                }
            }
            
            # Fix: incomparable types: boolean and int
            if ($msg -match "incomparable types: boolean and int") {
                if ($currentLine -match "==\s*0") {
                    $lines[$index] = $currentLine -replace "==\s*0", "== false"
                    $modified = $true
                } elseif ($currentLine -match "!=\s*0") {
                    $lines[$index] = $currentLine -replace "!=\s*0", "!= false"
                    $modified = $true
                } elseif ($currentLine -match "==\s*1") {
                    $lines[$index] = $currentLine -replace "==\s*1", "== true"
                    $modified = $true
                } elseif ($currentLine -match "!=\s*1") {
                    $lines[$index] = $currentLine -replace "!=\s*1", "!= true"
                    $modified = $true
                }
            }
            
            # Fix: incompatible types: int cannot be converted to boolean
            if ($msg -match "incompatible types: int cannot be converted to boolean") {
                if ($currentLine -match "return\s+1\s*;") {
                    $lines[$index] = $currentLine -replace "return\s+1\s*;", "return true;"
                    $modified = $true
                } elseif ($currentLine -match "return\s+0\s*;") {
                    $lines[$index] = $currentLine -replace "return\s+0\s*;", "return false;"
                    $modified = $true
                } elseif ($currentLine -match "=\s*1\s*;") {
                    $lines[$index] = $currentLine -replace "=\s*1\s*;", "= true;"
                    $modified = $true
                } elseif ($currentLine -match "=\s*0\s*;") {
                    $lines[$index] = $currentLine -replace "=\s*0\s*;", "= false;"
                    $modified = $true
                }
            }
            
            # Fix: exception NameNotFoundException is never thrown
            if ($msg -match "exception [\w.]+ is never thrown") {
                if ($currentLine -match "catch\s*\([^\)]+\s+(\w+)\)") {
                    $varName = $matches[1]
                    $lines[$index] = $currentLine -replace "catch\s*\([^\)]+\s+$varName\)", "catch (Exception $varName)"
                    $modified = $true
                }
            }
            
            # Fix: X is abstract; cannot be instantiated
            if ($msg -match "([\w.]+) is abstract; cannot be instantiated") {
                $absClass = $matches[1]
                if ($currentLine -match "new\s+$absClass\s*\(\)") {
                    $lines[$index] = $currentLine -replace "new\s+$absClass\s*\(\)", "new $absClass() {}"
                    $modified = $true
                }
            }
        }
    }
    
    if ($modified) {
        [System.IO.File]::WriteAllLines($file, $lines)
        $modifiedCount++
    }
}

Write-Host "Auto-fixed $modifiedCount files."
