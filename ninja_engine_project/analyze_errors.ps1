$sourceDir = "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean"
$reportFile = "C:\Users\sarko\Downloads\ninja_engine_project\fix_report.txt"
$startTime = Get-Date

# Statistics
$stats = @{
    "totalErrorsDetected" = 0
    "errorsByType" = @{}
    "filesWithErrors" = 0
    "fileProcessed" = 0
    "errorsFixed" = 0
}

Write-Host "=== COMPILATION ERROR ANALYSIS ===" -ForegroundColor Cyan
Write-Host "Source: $sourceDir" -ForegroundColor Yellow
Write-Host "Start Time: $startTime" -ForegroundColor Yellow

# Parse existing error log
$errorLog = Get-Content "C:\Users\sarko\Downloads\ninja_engine_project\build_errors.txt" -Raw
$errors = $errorLog -split "`n" | Where-Object { $_ -match "error:" }

Write-Host "Total errors found in log: $($errors.Count)" -ForegroundColor Green
$stats.totalErrorsDetected = $errors.Count

# Categorize errors
foreach ($err in $errors) {
    if ($err -match "incompatible types.*cannot be converted to") {
        if (-not $stats.errorsByType.ContainsKey("Type Conversion")) {
            $stats.errorsByType["Type Conversion"] = 0
        }
        $stats.errorsByType["Type Conversion"] += 1
    }
    elseif ($err -match "is not abstract and does not override") {
        if (-not $stats.errorsByType.ContainsKey("Abstract Method Missing")) {
            $stats.errorsByType["Abstract Method Missing"] = 0
        }
        $stats.errorsByType["Abstract Method Missing"] += 1
    }
    elseif ($err -match "cannot find symbol") {
        if (-not $stats.errorsByType.ContainsKey("Cannot Find Symbol")) {
            $stats.errorsByType["Cannot Find Symbol"] = 0
        }
        $stats.errorsByType["Cannot Find Symbol"] += 1
    }
    elseif ($err -match "constructor.*cannot be applied") {
        if (-not $stats.errorsByType.ContainsKey("Constructor Mismatch")) {
            $stats.errorsByType["Constructor Mismatch"] = 0
        }
        $stats.errorsByType["Constructor Mismatch"] += 1
    }
    elseif ($err -match "package.*does not exist") {
        if (-not $stats.errorsByType.ContainsKey("Package Not Found")) {
            $stats.errorsByType["Package Not Found"] = 0
        }
        $stats.errorsByType["Package Not Found"] += 1
    }
    elseif ($err -match "cannot be instantiated") {
        if (-not $stats.errorsByType.ContainsKey("Instantiation Error")) {
            $stats.errorsByType["Instantiation Error"] = 0
        }
        $stats.errorsByType["Instantiation Error"] += 1
    }
    else {
        if (-not $stats.errorsByType.ContainsKey("Other")) {
            $stats.errorsByType["Other"] = 0
        }
        $stats.errorsByType["Other"] += 1
    }
}

# Display categorization
Write-Host "`n=== ERROR BREAKDOWN ===" -ForegroundColor Cyan
foreach ($type in $stats.errorsByType.GetEnumerator() | Sort-Object -Property Value -Descending) {
    Write-Host "$($type.Name): $($type.Value) errors" -ForegroundColor Yellow
}

Add-Content $reportFile "=== INITIAL ERROR ANALYSIS ===" 
Add-Content $reportFile "Total Errors: $($stats.totalErrorsDetected)"
Add-Content $reportFile "`nError Breakdown:"
foreach ($type in $stats.errorsByType.GetEnumerator() | Sort-Object -Property Value -Descending) {
    Add-Content $reportFile "  - $($type.Name): $($type.Value)"
}

Export-Clixml -Path "C:\Users\sarko\Downloads\ninja_engine_project\stats.xml" -InputObject $stats
