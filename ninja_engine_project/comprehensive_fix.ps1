$sourceDir = "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean"
$reportFile = "C:\Users\sarko\Downloads\ninja_engine_project\fix_report_detailed.txt"
$stats = @{
    "totalFilesProcessed" = 0
    "totalErrorsFixed" = 0
    "errorCategoriesFix" = @{}
}

# Clear report
"=== DETAILED FIX REPORT ===" | Out-File $reportFile -Encoding UTF8

# Strategy: Fix Type Conversion errors first (most common)
# Pattern: Object cannot be converted to X -> add cast

function Fix-ObjectTypeCast {
    param([string]$filePath)
    
    $content = Get-Content $filePath -Raw -Encoding UTF8 -ErrorAction SilentlyContinue
    if (-not $content) { return 0 }
    
    $originalLength = $content.Length
    $fixedCount = 0
    
    # Fix Map.Entry Object conversion
    $patterns = @(
        @{
            "pattern" = '(\(Map\.Entry.*?\))\s*(\w+\.entrySet\(\))'
            "replacement" = '(java.util.Map.Entry) $2'
            "description" = "Map.Entry cast"
        },
        @{
            "pattern" = '\(\(Integer\)\s*(\w+\.get\([^\)]*\))\)'
            "replacement" = '((Integer) $1)'
            "description" = "Integer cast"
        },
        @{
            "pattern" = 'Object\s+(\w+)\s*=\s*(\w+\.get\([^\)]*\))'
            "replacement" = 'Object $1 = (Object) $2'
            "description" = "Object cast"
        }
    )
    
    foreach ($fix in $patterns) {
        if ($content -match $fix.pattern) {
            $newContent = $content -replace $fix.pattern, $fix.replacement
            if ($newContent -ne $content) {
                $fixedCount++
                $content = $newContent
            }
        }
    }
    
    if ($content.Length -ne $originalLength) {
        Set-Content $filePath $content -Encoding UTF8 -ErrorAction SilentlyContinue
        return $fixedCount
    }
    
    return 0
}

Write-Host "Starting comprehensive error fixes..." -ForegroundColor Cyan
"Starting comprehensive error fixes..." | Add-Content $reportFile -Encoding UTF8

$allFiles = @(Get-ChildItem -Path $sourceDir -Filter "*.java" -Recurse -ErrorAction SilentlyContinue)
$processed = 0

foreach ($file in $allFiles) {
    $processed++
    if ($processed % 500 -eq 0) {
        Write-Host "Processed: $processed / $($allFiles.Count) files" -ForegroundColor Yellow
        "Processed: $processed / $($allFiles.Count) files" | Add-Content $reportFile -Encoding UTF8
    }
    
    $fixCount = Fix-ObjectTypeCast -FilePath $file.FullName
    if ($fixCount -gt 0) {
        $stats.totalErrorsFixed += $fixCount
        Write-Host "Fixed $fixCount issues in $($file.Name)" -ForegroundColor Green
        "Fixed $fixCount issues in $($file.Name)" | Add-Content $reportFile -Encoding UTF8
    }
    $stats.totalFilesProcessed++
}

Write-Host "`n=== FIX SUMMARY ===" -ForegroundColor Cyan
Write-Host "Total Files Processed: $($stats.totalFilesProcessed)" -ForegroundColor Yellow
Write-Host "Total Errors Fixed: $($stats.totalErrorsFixed)" -ForegroundColor Yellow

"`n=== FIX SUMMARY ===" | Add-Content $reportFile -Encoding UTF8
"Total Files Processed: $($stats.totalFilesProcessed)" | Add-Content $reportFile -Encoding UTF8
"Total Errors Fixed: $($stats.totalErrorsFixed)" | Add-Content $reportFile -Encoding UTF8
