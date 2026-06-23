package com.ninja.engine;

import android.text.TextUtils;
import android.view.View;
/* renamed from: com.ninja.engine.oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1348oo0 extends AbstractC1290oOooO00 {
    public final /* synthetic */ int OooO0o0;

    public C1348oo0(int i, Class cls, int i2, int i3, int i4) {
        this.OooO0o0 = i4;
        this.OooO00o = i;
        this.OooO0Oo = cls;
        this.OooO0OO = i2;
        this.OooO0O0 = i3;
    }

    @Override // com.ninja.engine.AbstractC1290oOooO00
    public final Object OooO0O0(View view) {
        switch (this.OooO0o0) {
            case 0:
                return Boolean.valueOf(AbstractC1455oo0O00OO.OooO0OO(view));
            case 1:
                return AbstractC1455oo0O00OO.OooO00o(view);
            default:
                return Boolean.valueOf(AbstractC1455oo0O00OO.OooO0O0(view));
        }
    }

    @Override // com.ninja.engine.AbstractC1290oOooO00
    public final void OooO0OO(View view, Object obj) {
        switch (this.OooO0o0) {
            case 0:
                AbstractC1455oo0O00OO.OooO0o(view, ((Boolean) obj).booleanValue());
                return;
            case 1:
                AbstractC1455oo0O00OO.OooO0o0(view, (CharSequence) obj);
                return;
            default:
                AbstractC1455oo0O00OO.OooO0Oo(view, ((Boolean) obj).booleanValue());
                return;
        }
    }

    @Override // com.ninja.engine.AbstractC1290oOooO00
    public final boolean OooO0o(Object obj, Object obj2) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        switch (this.OooO0o0) {
            case 0:
                Boolean bool = (Boolean) obj;
                Boolean bool2 = (Boolean) obj2;
                boolean z5 = false;
                if (bool != null && bool.booleanValue()) {
                    z = true;
                } else {
                    z = false;
                }
                if (bool2 != null && bool2.booleanValue()) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z == z2) {
                    z5 = true;
                }
                return !z5;
            case 1:
                return !TextUtils.equals((CharSequence) obj, (CharSequence) obj2);
            default:
                Boolean bool3 = (Boolean) obj;
                Boolean bool4 = (Boolean) obj2;
                boolean z6 = false;
                if (bool3 != null && bool3.booleanValue()) {
                    z3 = true;
                } else {
                    z3 = false;
                }
                if (bool4 != null && bool4.booleanValue()) {
                    z4 = true;
                } else {
                    z4 = false;
                }
                if (z3 == z4) {
                    z6 = true;
                }
                return !z6;
        }
    }
}
