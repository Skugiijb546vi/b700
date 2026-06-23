$sourceDir = "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine"
$fixedCount = 0
$totalProcessed = 0

Get-ChildItem -Path $sourceDir -Filter "*.java" -Recurse | ForEach-Object {
    $totalProcessed++
    if ($_.FullName -like "*\engine\*") {
        $content = Get-Content $_.FullName -Raw -Encoding UTF8 -ErrorAction SilentlyContinue
        if ($content -and $content.StartsWith("ackage com.ninja.engine")) {
            $newContent = "p" + $content
            Set-Content $_.FullName $newContent -Encoding UTF8 -ErrorAction SilentlyContinue
            $fixedCount++
        }
    }
}

Write-Host "Fixed $fixedCount files out of $totalProcessed processed"
Write-Host "Starting rebuild..."

Push-Location "C:\Users\sarko\Downloads\ninja_engine_project"
$buildOutput = .\gradlew.bat compileDebugJavaWithJavac --no-build-cache 2>&1 | Tee-Object -FilePath "rebuild_output.txt"
$errorCount = ($buildOutput | Select-String "error:").Count

Write-Host ""
Write-Host "===== COMPILATION STATISTICS ====="
Write-Host "Files Fixed: $fixedCount"
Write-Host "Errors Before Fix: 505"
Write-Host "Errors After Fix: $errorCount"
Write-Host "Errors Reduced: $((505 - $errorCount))"
Write-Host "====================================="

Pop-Location
