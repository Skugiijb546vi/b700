package com.ninja.engine;

import android.view.View;
import android.view.Window;
import com.app.framework.core.system.JarConfig;
/* renamed from: com.ninja.engine.oo0Ooo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1539oo0Ooo00 extends C1537oo0OoOoo {
    @Override // com.ninja.engine.AbstractC1137oOOoooO
    public final void OooOOO(boolean z) {
        if (z) {
            Window window = this.OooO0O0;
            window.clearFlags(67108864);
            window.addFlags(Integer.MIN_VALUE);
            View decorView = window.getDecorView();
            decorView.setSystemUiVisibility(8192 | decorView.getSystemUiVisibility());
            return;
        }
        OooOOo(JarConfig.DEFAULT_BUFFER_SIZE);
    }
}
