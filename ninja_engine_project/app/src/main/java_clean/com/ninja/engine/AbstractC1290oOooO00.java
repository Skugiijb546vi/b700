package com.ninja.engine;

import android.os.Build;
import android.view.View;
import java.nio.ByteBuffer;
/* renamed from: com.ninja.engine.oOooO00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1290oOooO00 {
    public int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public Object OooO0Oo;

    public AbstractC1290oOooO00() {
        if (C0919oOO00oOo.OooO0O0 == null) {
            C0919oOO00oOo.OooO0O0 = new C0919oOO00oOo(21);
        }
    }

    public int OooO00o(int i) {
        if (i < this.OooO0OO) {
            return ((ByteBuffer) this.OooO0Oo).getShort(this.OooO0O0 + i);
        }
        return 0;
    }

    public abstract Object OooO0O0(View view);

    public abstract void OooO0OO(View view, Object obj);

    public Object OooO0Oo(View view) {
        if (Build.VERSION.SDK_INT >= this.OooO0O0) {
            return OooO0O0(view);
        }
        Object tag = view.getTag(this.OooO00o);
        if (((Class) this.OooO0Oo).isInstance(tag)) {
            return tag;
        }
        return null;
    }

    public abstract boolean OooO0o(Object obj, Object obj2);

    public void OooO0o0(View view, Object obj) {
        C0028OooOooO c0028OooOooO;
        if (Build.VERSION.SDK_INT >= this.OooO0O0) {
            OooO0OO(view, obj);
        } else if (OooO0o(OooO0Oo(view), obj)) {
            View.AccessibilityDelegate OooO0OO = AbstractC1460oo0O00oo.OooO0OO(view);
            if (OooO0OO == null) {
                c0028OooOooO = null;
            } else if (OooO0OO instanceof C0026OooOoo) {
                c0028OooOooO = ((C0026OooOoo) OooO0OO).OooO00o;
            } else {
                c0028OooOooO = new C0028OooOooO(OooO0OO);
            }
            if (c0028OooOooO == null) {
                c0028OooOooO = new C0028OooOooO();
            }
            AbstractC1460oo0O00oo.OooOOOo(view, c0028OooOooO);
            view.setTag(this.OooO00o, obj);
            AbstractC1460oo0O00oo.OooO(view, this.OooO0OO);
        }
    }
}


