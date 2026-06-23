$sourceDir = "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean"
$reportFile = "C:\Users\sarko\Downloads\ninja_engine_project\fix_stats_report.txt"

$stats = @{
    "bomFilesFixed" = 0
    "encodingFilesFixed" = 0
    "totalFilesProcessed" = 0
    "errorsBefore" = 505
    "errorsAfter" = 0
}

"=== COMPREHENSIVE FIX REPORT ===" | Out-File $reportFile -Encoding UTF8 -Force
"Started: $(Get-Date)" | Add-Content $reportFile

# Step 1: Fix BOM characters
Write-Host "Step 1: Removing BOM characters from Java files..." -ForegroundColor Cyan
"Step 1: Removing BOM characters from Java files..." | Add-Content $reportFile

$allFiles = @(Get-ChildItem -Path $sourceDir -Filter "*.java" -Recurse -ErrorAction SilentlyContinue)
$bomFiles = 0
$processedCount = 0

foreach ($file in $allFiles) {
    $processedCount++
    if ($processedCount % 500 -eq 0) {
        Write-Host "  Processed: $processedCount / $($allFiles.Count)"
    }
    
    try {
        $content = Get-Content $file.FullName -Raw -Encoding UTF8 -ErrorAction SilentlyContinue
        if ($null -eq $content) {
            continue
        }
        
        # Check for BOM character
        if ($content.StartsWith([char]0xFEFF)) {
            $content = $content.Substring(1)
            Set-Content $file.FullName $content -Encoding UTF8 -ErrorAction SilentlyContinue
            $bomFiles++
            $stats.bomFilesFixed++
            Write-Host "  Fixed BOM: $($file.Name)" -ForegroundColor Green
            "  Fixed BOM: $($file.Name)" | Add-Content $reportFile
        }
        
        # Try to fix UTF-8 BOM encoding issues
        if ($file.Extension -eq ".java") {
            $bytes = [System.IO.File]::ReadAllBytes($file.FullName)
            if ($bytes[0] -eq 0xEF -and $bytes[1] -eq 0xBB -and $bytes[2] -eq 0xBF) {
                # Remove BOM bytes
                $newBytes = $bytes[3..($bytes.Length-1)]
                [System.IO.File]::WriteAllBytes($file.FullName, $newBytes)
                $stats.encodingFilesFixed++
            }
        }
    }
    catch {
        Write-Host "  Error processing $($file.Name): $_" -ForegroundColor Red
    }
}

Write-Host "BOM Fixes: $bomFiles files" -ForegroundColor Green
"BOM Fixes: $bomFiles files" | Add-Content $reportFile

Write-Host "`nStep 2: Recompiling project to get updated error count..." -ForegroundColor Cyan
"Step 2: Recompiling project..." | Add-Content $reportFile

# Step 2: Recompile
Push-Location "C:\Users\sarko\Downloads\ninja_engine_project"
$buildOutput = .\gradlew.bat compileDebugJavaWithJavac --no-build-cache 2>&1
Pop-Location

$newErrorCount = ($buildOutput | Select-String "error:").Count
$stats.errorsAfter = $newErrorCount

Write-Host "`n=== FINAL STATISTICS ===" -ForegroundColor Yellow
Write-Host "Errors Before: $($stats.errorsBefore)" -ForegroundColor Yellow
Write-Host "Errors After: $($stats.errorsAfter)" -ForegroundColor Yellow
Write-Host "Errors Fixed: $($stats.errorsBefore - $stats.errorsAfter)" -ForegroundColor Green
Write-Host "BOM Files Fixed: $($stats.bomFilesFixed)" -ForegroundColor Green
Write-Host "Encoding Files Fixed: $($stats.encodingFilesFixed)" -ForegroundColor Green

"`n=== FINAL STATISTICS ===" | Add-Content $reportFile
"Errors Before: $($stats.errorsBefore)" | Add-Content $reportFile
"Errors After: $($stats.errorsAfter)" | Add-Content $reportFile
"Errors Fixed: $($stats.errorsBefore - $stats.errorsAfter)" | Add-Content $reportFile
"BOM Files Fixed: $($stats.bomFilesFixed)" | Add-Content $reportFile
"Encoding Files Fixed: $($stats.encodingFilesFixed)" | Add-Content $reportFile
"Completed: $(Get-Date)" | Add-Content $reportFile

Write-Host "`nReport saved to: $reportFile" -ForegroundColor Cyan
