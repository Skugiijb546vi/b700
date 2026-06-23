$files = @(
    "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\androidx\recyclerview\widget\RecyclerView.java",
    "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine\C0534o0o0O0o.java",
    "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine\C0592o0oOoOo.java",
    "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine\C0655o0ooOO0.java",
    "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine\C1086oOOoOO00.java",
    "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine\C1462oo0O0O0.java",
    "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine\C1803ooOOOooo.java",
    "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine\RunnableC1082oOOoO0Oo.java",
    "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine\animation\InterpolatorC1047oOOo0.java",
    "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine\animation\Animation$AnimationListenerC0371o0OOOoo.java",
    "C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java_clean\com\ninja\engine\Abstractanimation\InterpolatorC0831oO0o0o0.java"
)
foreach ($file in $files) {
    if (Test-Path $file) {
        $content = Get-Content $file -Raw
        
        $content = $content -replace "import com.ninja.engine.;", "import com.ninja.engine.animation.InterpolatorC1047oOOo0;"
        $content = $content -replace "public static final  o0ooOoO;", "public static final InterpolatorC1047oOOo0 o0ooOoO;"
        $content = $content -replace "o0ooOoO = new \(0\);", "o0ooOoO = new InterpolatorC1047oOOo0(0);"
        $content = $content -replace "import com.ninja.engine.Abstractanimation.;", "import com.ninja.engine.Abstractanimation.InterpolatorC0831oO0o0o0;"
        $content = $content -replace "public static final  OooOo0O = new \(1\);", "public static final InterpolatorC1047oOOo0 OooOo0O = new InterpolatorC1047oOOo0(1);"
        
        $utf8NoBomEncoding = New-Object System.Text.UTF8Encoding $False
        [System.IO.File]::WriteAllText($file, $content, $utf8NoBomEncoding)
    }
}
