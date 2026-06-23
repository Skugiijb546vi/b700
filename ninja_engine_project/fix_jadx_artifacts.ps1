$projectDir = "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine"

# 1. Create C0592o0oOoOo.java
$c0592Content = @"
package com.ninja.engine;

public interface C0592o0oOoOo extends InterfaceC0319o0O0o0oo {
}
"@
Set-Content -Path "$projectDir\C0592o0oOoOo.java" -Value $c0592Content -Encoding UTF8

# 2. Fix animation files
$animDir = "$projectDir\animation"
New-Item -ItemType Directory -Force -Path $animDir | Out-Null

$animFiles = Get-ChildItem -Path $projectDir -Filter "animation_*.java"
foreach ($file in $animFiles) {
    $newName = $file.Name -replace "^animation_", ""
    $content = Get-Content -Path $file.FullName -Raw
    $content = $content -replace "package com.ninja.engine;", "package com.ninja.engine.animation;"
    $content = $content -replace "class animation\.", "class "
    Set-Content -Path "$animDir\$newName" -Value $content -Encoding UTF8
    Remove-Item -Path $file.FullName -Force
}

# 3. Fix Abstractanimation files
$absAnimDir = "$projectDir\Abstractanimation"
New-Item -ItemType Directory -Force -Path $absAnimDir | Out-Null

$absAnimFiles = Get-ChildItem -Path $projectDir -Filter "Abstractanimation_*.java"
foreach ($file in $absAnimFiles) {
    $newName = $file.Name -replace "^Abstractanimation_", ""
    $content = Get-Content -Path $file.FullName -Raw
    $content = $content -replace "package com.ninja.engine;", "package com.ninja.engine.Abstractanimation;"
    $content = $content -replace "class Abstractanimation\.", "class "
    Set-Content -Path "$absAnimDir\$newName" -Value $content -Encoding UTF8
    Remove-Item -Path $file.FullName -Force
}

# Fix imports in all files
Get-ChildItem -Path "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean" -Filter "*.java" -Recurse | foreach {
    $content = Get-Content -Path $_.FullName -Raw
    $changed = $false
    if ($content -match "import com.ninja.engine.animation_") {
        $content = $content -replace "import com.ninja.engine.animation_", "import com.ninja.engine.animation."
        $changed = $true
    }
    if ($content -match "import com.ninja.engine.Abstractanimation_") {
        $content = $content -replace "import com.ninja.engine.Abstractanimation_", "import com.ninja.engine.Abstractanimation."
        $changed = $true
    }
    if ($content -match "extends Abstractanimation\.") {
        $content = $content -replace "extends Abstractanimation\.", "extends com.ninja.engine.Abstractanimation."
        $changed = $true
    }
    if ($content -match "animation\.(InterpolatorC1047oOOo0|Animation`$AnimationListener)") {
        $content = $content -replace "animation\.(InterpolatorC1047oOOo0|Animation`$AnimationListener)", "$1"
        $changed = $true
    }
    if ($changed) {
        Set-Content -Path $_.FullName -Value $content -Encoding UTF8
    }
}

# 4. Remove duplicate methods in C1803ooOOOooo.java
$c1803Path = "$projectDir\C1803ooOOOooo.java"
$lines = Get-Content -Path $c1803Path
$newLines = @()
$skip = $false
foreach ($line in $lines) {
    if ($line -match "public final Editable delete") { $skip = $true }
    elseif ($line -match "public final Editable insert") { $skip = $true }
    elseif ($line -match "public final Editable replace") { $skip = $true }
    elseif ($line -match "public final Editable append") { $skip = $true }
    elseif ($line -match "public final Appendable append") { $skip = $true }
    
    if (!$skip) {
        $newLines += $line
    }
    
    if ($skip -and $line -match "^\s*\}\s*$") {
        $skip = $false
    }
}
Set-Content -Path $c1803Path -Value ($newLines -join "`n") -Encoding UTF8

# 5. Fix C1086oOOoOO00.java (duplicate varargs)
$c1086Path = "$projectDir\C1086oOOoOO00.java"
$content = Get-Content -Path $c1086Path -Raw
$content = $content -replace 'public /\* bridge \*/ /\* synthetic \*/ C1086oOOoOO00 constructor\(Class\[\] clsArr\) \{\s*return constructor\(\(Class\<\?\>\[\]\) clsArr\);\s*\}', ''
$content = $content -replace 'public /\* bridge \*/ /\* synthetic \*/ C1086oOOoOO00 method\(String str, Class\[\] clsArr\) \{\s*return method\(str, \(Class\<\?\>\[\]\) clsArr\);\s*\}', ''
Set-Content -Path $c1086Path -Value $content -Encoding UTF8

# 6. Fix C0655o0ooOO0.java (duplicate methods setContentDescription, setTooltipText)
$c0655Path = "$projectDir\C0655o0ooOO0.java"
$lines = Get-Content -Path $c0655Path
$newLines = @()
$skip = $false
$seenContent = 0
$seenTooltip = 0
foreach ($line in $lines) {
    if ($line -match "public final InterfaceMenuItemC1272oOoo0OOo setContentDescription") {
        $seenContent++
        if ($seenContent -gt 1) { $skip = $true }
    }
    if ($line -match "public final InterfaceMenuItemC1272oOoo0OOo setTooltipText") {
        $seenTooltip++
        if ($seenTooltip -gt 1) { $skip = $true }
    }
    
    if (!$skip) {
        $newLines += $line
    }
    
    if ($skip -and $line -match "^\s*\}\s*$") {
        $skip = $false
    }
}
Set-Content -Path $c0655Path -Value ($newLines -join "`n") -Encoding UTF8

