package com.ninja.engine;

import android.content.Context;
import android.content.IntentFilter;
import android.os.PowerManager;
/* renamed from: com.ninja.engine.o000o0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0103o000o0Oo extends AbstractC0104o000o0o {
    public final /* synthetic */ int OooO0OO = 0;
    public final /* synthetic */ LayoutInflater$Factory2C0109o000oOoo OooO0Oo;
    public final Object OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0103o000o0Oo(LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo, Context context) {
        super(layoutInflater$Factory2C0109o000oOoo);
        this.OooO0Oo = layoutInflater$Factory2C0109o000oOoo;
        this.OooO0o0 = (PowerManager) context.getApplicationContext().getSystemService("power");
    }

    @Override // com.ninja.engine.AbstractC0104o000o0o
    public final IntentFilter OooO0oO() {
        switch (this.OooO0OO) {
            case 0:
                IntentFilter intentFilter = new IntentFilter();
                intentFilter.addAction("android.os.action.POWER_SAVE_MODE_CHANGED");
                return intentFilter;
            default:
                IntentFilter intentFilter2 = new IntentFilter();
                intentFilter2.addAction("android.intent.action.TIME_SET");
                intentFilter2.addAction("android.intent.action.TIMEZONE_CHANGED");
                intentFilter2.addAction("android.intent.action.TIME_TICK");
                return intentFilter2;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00e1  */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, com.ninja.engine.oo0OOOO] */
    @Override // com.ninja.engine.AbstractC0104o000o0o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final int OooO0oo() {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0103o000o0Oo.OooO0oo():int");
    }

    @Override // com.ninja.engine.AbstractC0104o000o0o
    public final void OooOO0o() {
        switch (this.OooO0OO) {
            case 0:
                this.OooO0Oo.OooOO0O(true, true);
                return;
            default:
                this.OooO0Oo.OooOO0O(true, true);
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0103o000o0Oo(LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo, C0131o00O0o c0131o00O0o) {
        super(layoutInflater$Factory2C0109o000oOoo);
        this.OooO0Oo = layoutInflater$Factory2C0109o000oOoo;
        this.OooO0o0 = c0131o00O0o;
    }
}
