$ErrorActionPreference = 'Stop'
Set-Location -Path "C:\Users\sarko\Downloads\ninja_engine_project"

Write-Host "Parsing errors from build_errors_test.txt..."
$output = Get-Content -Path "build_errors_test.txt" -Raw
$errors = @()

$lines = $output -split "`r?`n"
foreach ($line in $lines) {
    if ($line -match "^(.*?\.java):(\d+): error: (.*)$") {
        $errors += [PSCustomObject]@{
            File = $matches[1].Trim()
            Line = [int]$matches[2]
            Msg  = $matches[3].Trim()
        }
    }
}

Write-Host "Total errors found: $($errors.Count)"

$simplifiedMsgs = @()
foreach ($e in $errors) {
    $msg = $e.Msg
    $msg = $msg -replace ': [^\s]+ cannot be converted to [^\s]+', ': TYPE cannot be converted to TYPE'
    $msg = $msg -replace 'variable [^\s]+', 'variable VAR'
    $msg = $msg -replace 'method [^\s]+ in class [^\s]+ cannot be applied to given types', 'method METHOD in class CLASS cannot be applied to given types'
    $msg = $msg -replace 'constructor [^\s]+ in class [^\s]+ cannot be applied to given types', 'constructor CONSTRUCTOR in class CLASS cannot be applied to given types'
    $msg = $msg -replace 'not an enclosing class: [^\s]+', 'not an enclosing class: CLASS'
    $msg = $msg -replace 'cannot find symbol', 'cannot find symbol'
    $simplifiedMsgs += $msg
}

$grouped = $simplifiedMsgs | Group-Object | Sort-Object Count -Descending
Write-Host "`nTop 20 most common error types:"
for ($i=0; $i -lt 20 -and $i -lt $grouped.Count; $i++) {
    Write-Host "$($grouped[$i].Count): $($grouped[$i].Name)"
}
