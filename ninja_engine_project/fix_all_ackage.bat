@echo off
setlocal enabledelayedexpansion

REM Find and fix all files with "ackage" corruption
REM This script searches for files starting with "ackage" and replaces with "package"

cd /d "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine"

set count=0
for /r . %%F in (*.java) do (
    for /f "usebackq tokens=1" %%A in ("%%F") do (
        if "%%A"=="ackage" (
            echo Fixing %%F
            powershell -Command "(Get-Content '%%F' -Raw).Replace('ackage com.ninja.engine', 'package com.ninja.engine') | Set-Content '%%F'"
            set /a count=!count!+1
        )
    )
)

echo.
echo Fixed !count! files with corrupted package declarations
echo.
echo Rebuilding project...

cd /d "C:\Users\sarko\Downloads\ninja_engine_project"
call .\gradlew.bat compileDebugJavaWithJavac --no-build-cache > build_after_fix.txt 2>&1

REM Count errors in the new build
for /f "usebackq tokens=1" %%E in (`find /c "error:" build_after_fix.txt`) do (
    echo.
    echo Total errors after fix: %%E
)

echo.
echo Statistics:
echo - Files fixed: !count!
echo - Check build_after_fix.txt for detailed build output
