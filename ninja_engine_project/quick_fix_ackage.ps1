$basePath = "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean"
$files = @(Get-ChildItem -Path $basePath -Filter "*.java" -Recurse)
$total = $files.Count
$fixed = 0
$i = 0

Write-Host "Fixing $total Java files..."

foreach ($file in $files) {
    $i = $i + 1
    if ($i % 500 -eq 0) { Write-Host "Progress: $i/$total" }
    
    try {
        $content = [System.IO.File]::ReadAllText($file.FullName, [System.Text.Encoding]::UTF8)
        if ($content.StartsWith("ackage ")) {
            $newContent = "package " + $content.Substring(7)
            [System.IO.File]::WriteAllText($file.FullName, $newContent, [System.Text.Encoding]::UTF8)
            $fixed = $fixed + 1
        }
    } catch { }
}

Write-Host "========== COMPLETE =========="
Write-Host "Files fixed: $fixed out of $total"
