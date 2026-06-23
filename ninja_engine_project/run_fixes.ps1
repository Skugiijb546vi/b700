for ($i=1; $i -le 5; $i++) {
    Write-Host "--- Iteration $i ---"
    Write-Host "Running gradlew.bat assembleDebug..."
    .\gradlew.bat assembleDebug > build.log 2>&1
    
    $errCount = (Select-String -Path "build.log" -Pattern "error:" | Measure-Object).Count
    Write-Host "Found $errCount error lines in build.log."
    
    if ($errCount -le 5) { # Usually a few lines have 'error:' even in success
        Write-Host "Build seems to have succeeded or very few errors left!"
        break
    }
    
    .\auto_fixer.ps1
    
    Start-Sleep -Seconds 2
}
Write-Host "Done looping."
