import os
import re

files = [
    r"C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java\androidx\recyclerview\widget\RecyclerView.java",
    r"C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java\com\ninja\engine\C0534o0o0O0o.java",
    r"C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java\com\ninja\engine\C0592o0oOoOo.java",
    r"C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java\com\ninja\engine\C0655o0ooOO0.java",
    r"C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java\com\ninja\engine\C1086oOOoOO00.java",
    r"C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java\com\ninja\engine\C1462oo0O0O0.java",
    r"C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java\com\ninja\engine\C1803ooOOOooo.java",
    r"C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java\com\ninja\engine\RunnableC1082oOOoO0Oo.java",
    r"C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java\com\ninja\engine\animation\InterpolatorC1047oOOo0.java",
    r"C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java\com\ninja\engine\animation\Animation$AnimationListenerC0371o0OOOoo.java",
    r"C:\Users\sarko\Downloads\ninja_engine_project\app\src\main\java\com\ninja\engine\Abstractanimation\InterpolatorC0831oO0o0o0.java"
]

for file_path in files:
    if not os.path.exists(file_path):
        continue
    with open(file_path, "rb") as f:
        content_bytes = f.read()
    
    # Remove BOM if present
    if content_bytes.startswith(b'\xef\xbb\xbf'):
        content_bytes = content_bytes[3:]
    
    content = content_bytes.decode('utf-8')
    
    # Fix RecyclerView
    if "RecyclerView.java" in file_path:
        content = content.replace("import com.ninja.engine.;", "import com.ninja.engine.animation.InterpolatorC1047oOOo0;")
        content = content.replace("public static final  o0ooOoO;", "public static final InterpolatorC1047oOOo0 o0ooOoO;")
        content = content.replace("o0ooOoO = new (0);", "o0ooOoO = new InterpolatorC1047oOOo0(0);")
    
    # Fix C0534o0o0O0o
    if "C0534o0o0O0o.java" in file_path:
        content = content.replace("import com.ninja.engine.Abstractanimation.;", "import com.ninja.engine.Abstractanimation.InterpolatorC0831oO0o0o0;")
    
    # Fix C1462oo0O0O0
    if "C1462oo0O0O0.java" in file_path:
        content = content.replace("public static final  OooOo0O = new (1);", "public static final InterpolatorC1047oOOo0 OooOo0O = new InterpolatorC1047oOOo0(1);")

    with open(file_path, "w", encoding="utf-8", newline='\n') as f:
        f.write(content)
