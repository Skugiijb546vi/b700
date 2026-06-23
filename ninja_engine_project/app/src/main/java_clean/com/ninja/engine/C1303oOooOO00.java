package com.ninja.engine;

import android.content.Context;
import android.text.TextPaint;
import java.lang.ref.WeakReference;
/* renamed from: com.ninja.engine.oOooOO00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1303oOooOO00 {
    public float OooO0OO;
    public float OooO0Oo;
    public final WeakReference OooO0o;
    public C1299oOooO0oO OooO0oO;
    public final TextPaint OooO00o = new TextPaint(1);
    public final C0663o0ooOoOO OooO0O0 = new C0663o0ooOoOO(1, this);
    public boolean OooO0o0 = true;

    public C1303oOooOO00(InterfaceC1288oOooO interfaceC1288oOooO) {
        this.OooO0o = new WeakReference(null);
        this.OooO0o = new WeakReference(interfaceC1288oOooO);
    }

    public final void OooO00o(String str) {
        float measureText;
        TextPaint textPaint = this.OooO00o;
        float f = 0.0f;
        if (str == null) {
            measureText = 0.0f;
        } else {
            measureText = textPaint.measureText((CharSequence) str, 0, str.length());
        }
        this.OooO0OO = measureText;
        if (str != null) {
            f = Math.abs(textPaint.getFontMetrics().ascent);
        }
        this.OooO0Oo = f;
        this.OooO0o0 = false;
    }

    public final void OooO0O0(C1299oOooO0oO c1299oOooO0oO, Context context) {
        if (this.OooO0oO != c1299oOooO0oO) {
            this.OooO0oO = c1299oOooO0oO;
            if (c1299oOooO0oO != null) {
                TextPaint textPaint = this.OooO00o;
                C0663o0ooOoOO c0663o0ooOoOO = this.OooO0O0;
                c1299oOooO0oO.OooO0o(context, textPaint, c0663o0ooOoOO);
                InterfaceC1288oOooO interfaceC1288oOooO = (InterfaceC1288oOooO) this.OooO0o.get();
                if (interfaceC1288oOooO != null) {
                    textPaint.drawableState = interfaceC1288oOooO.getState();
                }
                c1299oOooO0oO.OooO0o0(context, textPaint, c0663o0ooOoOO);
                this.OooO0o0 = true;
            }
            InterfaceC1288oOooO interfaceC1288oOooO2 = (InterfaceC1288oOooO) this.OooO0o.get();
            if (interfaceC1288oOooO2 != null) {
                interfaceC1288oOooO2.OooO00o();
                interfaceC1288oOooO2.onStateChange(interfaceC1288oOooO2.getState());
            }
        }
    }
}


