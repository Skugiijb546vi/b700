# PowerShell script to fix common compilation errors in the decompiled Android project

$sourceDir = "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean"
$logFile = "C:\Users\sarko\Downloads\ninja_engine_project\fix_log.txt"
$fixedCount = 0

Write-Host "Starting to fix compilation errors..." -ForegroundColor Green
Add-Content $logFile "=== Compilation Error Fixes ===" -Encoding UTF8

# Function to add cast if missing
function Fix-TypeCastIssues {
    param([string]$filePath)
    
    $content = Get-Content $filePath -Raw -Encoding UTF8
    $originalContent = $content
    
    # Fix: Object cannot be converted to Entry -> cast to (Map.Entry)
    $content = $content -replace '(\(Map\.Entry\<[^\)]+\>)\s+(\w+)\s*=\s*(\w+\.get\([^\)]+\))', '(Map.Entry) $3'
    
    # Fix: Object cannot be converted to Integer -> add cast
    $content = $content -replace '(\(Integer\))\s+(\w+\.get\([^\)]+\))', '(Integer) $2'
    
    # Fix: int to boolean conversion - change condition
    $content = $content -replace '(?<!=)\s*(\d+)\s*\?', '($1 != 0) ?'
    
    if ($content -ne $originalContent) {
        Set-Content $filePath $content -Encoding UTF8
        return $true
    }
    return $false
}

# Function to add missing abstract method implementations
function Fix-AbstractMethods {
    param([string]$filePath)
    
    $content = Get-Content $filePath -Raw -Encoding UTF8
    
    # This is more complex and needs to be handled carefully per file
    return $content
}

# Get all Java files
$javaFiles = Get-ChildItem -Path $sourceDir -Filter "*.java" -Recurse -ErrorAction SilentlyContinue

Write-Host "Found $($javaFiles.Count) Java files to process"

$processedCount = 0
foreach ($file in $javaFiles) {
    $processedCount++
    
    if ($processedCount % 100 -eq 0) {
        Write-Host "Processing: $processedCount / $($javaFiles.Count)" -ForegroundColor Yellow
    }
    
    try {
        if (Fix-TypeCastIssues -FilePath $file.FullName) {
            $fixedCount++
        }
    } catch {
        Add-Content $logFile "Error processing $($file.Name): $_" -Encoding UTF8
    }
}

Write-Host "Fixed $fixedCount files" -ForegroundColor Green
Add-Content $logFile "Total files fixed: $fixedCount" -Encoding UTF8
