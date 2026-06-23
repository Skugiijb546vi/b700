# Fix all 'ackage' corruptions in java_clean directory
$basePath = "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean"
$count = 0
$fixed = 0

Write-Host "Scanning for corrupted 'ackage' declarations..."
$files = Get-ChildItem -Path $basePath -Filter "*.java" -Recurse

foreach ($file in $files) {
    $count++
    if ($count % 500 -eq 0) {
        Write-Host "Processed: $count files..."
    }
    
    try {
        $content = Get-Content $file.FullName -Raw -Encoding UTF8
        if ($content -like "*`nackage *" -or $content -like "ackage *") {
            $newContent = $content -replace "`nackage ", "`npackage " -replace "^ackage ", "package "
            if ($newContent -ne $content) {
                Set-Content -Path $file.FullName -Value $newContent -Encoding UTF8 -NoNewline
                $fixed++
                Write-Host "[FIXED] $($file.Name)"
            }
        }
    } catch {
        Write-Host "Error processing $($file.Name): $_"
    }
}

Write-Host "`n========== SUMMARY =========="
Write-Host "Total files scanned: $count"
Write-Host "Files fixed: $fixed"
Write-Host "============================"
