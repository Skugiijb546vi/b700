@echo off
setlocal enabledelayedexpansion
cd /d "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean"

set count=0
set fixed=0

echo Scanning for ackage declarations...

for /r %%F in (*.java) do (
    set /a count+=1
    if !count! equ 100 echo Processed: !count! files
    if !count! equ 500 echo Processed: !count! files
    if !count! equ 1000 echo Processed: !count! files
    if !count! equ 1500 echo Processed: !count! files
    if !count! equ 2000 echo Processed: !count! files
    if !count! equ 2500 echo Processed: !count! files
    
    for /f "delims=" %%L in ('type "%%F" ^| findstr /B "ackage"') do (
        if not "%%L"=="" (
            powershell -Command "(Get-Content '%%F' -Raw) -replace '^ackage ', 'package ' | Set-Content '%%F' -Encoding UTF8"
            set /a fixed+=1
            echo [FIXED] %%~nxF
        )
    )
)

echo.
echo ========== SUMMARY ==========
echo Total files scanned: !count!
echo Files fixed: !fixed!
echo ============================

pause
