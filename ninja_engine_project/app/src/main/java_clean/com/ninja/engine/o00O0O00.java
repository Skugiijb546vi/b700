package com.ninja.engine;

import android.graphics.Typeface;
import android.os.Build;
import android.widget.TextView;
import java.lang.ref.WeakReference;
/* loaded from: classes.dex */
public final class o00O0O00 extends AbstractC1137oOOoooO {
    public final /* synthetic */ int OooO0O0;
    public final /* synthetic */ int OooO0OO;
    public final /* synthetic */ WeakReference OooO0Oo;
    public final /* synthetic */ o00O0OO OooO0o0;

    public o00O0O00(o00O0OO o00o0oo, int i, int i2, WeakReference weakReference) {
        this.OooO0o0 = o00o0oo;
        this.OooO0O0 = i;
        this.OooO0OO = i2;
        this.OooO0Oo = weakReference;
    }

    @Override // com.ninja.engine.AbstractC1137oOOoooO
    public final void OooOO0O(Typeface typeface) {
        int i;
        boolean z;
        if (Build.VERSION.SDK_INT >= 28 && (i = this.OooO0O0) != -1) {
            if ((this.OooO0OO & 2) != 0) {
                z = true;
            } else {
                z = false;
            }
            typeface = AbstractC1563oo0o0O0.OooO00o(typeface, i, z);
        }
        o00O0OO o00o0oo = this.OooO0o0;
        if (o00o0oo.OooOOO0) {
            o00o0oo.OooOO0o = typeface;
            TextView textView = (TextView) this.OooO0Oo.get();
            if (textView != null) {
                boolean isAttachedToWindow = textView.isAttachedToWindow();
                int i2 = o00o0oo.OooOO0;
                if (isAttachedToWindow) {
                    textView.post(new o00O0O0(textView, typeface, i2));
                } else {
                    textView.setTypeface(typeface, i2);
                }
            }
        }
    }

    @Override // com.ninja.engine.AbstractC1137oOOoooO
    public final void OooOO0(int i) {
    }
}


