@echo off
setlocal enabledelayedexpansion

REM Go to project root
cd /d "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean"

set fixed=0

REM Search for all files with ackage declarations
for /r %%F in (*.java) do (
    findstr /B "ackage " "%%F" >nul 2>&1
    if !errorlevel! equ 0 (
        REM File contains ackage at beginning - fix it
        powershell -NoProfile -Command "(Get-Content '%%F' -Raw -Encoding UTF8) -replace '^ackage ', 'package ' | Set-Content '%%F' -Encoding UTF8"
        set /a fixed=!fixed! + 1
        if !fixed! gtr 0 if !fixed! lss 11 echo Fixed: %%~nxF
        if !fixed! equ 100 echo ... 100 files fixed
        if !fixed! equ 500 echo ... 500 files fixed
        if !fixed! equ 1000 echo ... 1000 files fixed
    )
)

echo.
echo ===============================
echo Files fixed: !fixed!
echo ===============================
pause
