package com.ninja.engine;

import android.content.Context;
import com.ninja.engine.app.App;
/* renamed from: com.ninja.engine.o00o0o0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0215o00o0o0o {
    public static final C0455o0OoOo00 OooO0Oo;
    public static final /* synthetic */ InterfaceC0741oO00oO0o[] OooO0o0;
    public final o00O OooO00o;
    public final o00O OooO0O0;
    public final o00O OooO0OO;

    static {
        C0909oOO00Oo c0909oOO00Oo = new C0909oOO00Oo("mHideRoot", "getMHideRoot()Z");
        AbstractC1079oOOoO.OooO00o.getClass();
        OooO0o0 = new InterfaceC0741oO00oO0o[]{c0909oOO00Oo, new C0909oOO00Oo("mHideXposed", "getMHideXposed()Z"), new C0909oOO00Oo("mDaemonEnable", "getMDaemonEnable()Z")};
        OooO0Oo = new C0455o0OoOo00(13);
    }

    public C0215o00o0o0o() {
        Context context = App.OooO00o;
        Context context2 = App.OooO00o;
        if (context2 != null) {
            this.OooO00o = new o00O(context2, 0);
            Context context3 = App.OooO00o;
            if (context3 != null) {
                this.OooO0O0 = new o00O(context3, 0);
                Context context4 = App.OooO00o;
                if (context4 != null) {
                    this.OooO0OO = new o00O(context4, 0);
                    return;
                } else {
                    AbstractC0809oO0OooOO.o00oO0o("mContext");
                    throw null;
                }
            }
            AbstractC0809oO0OooOO.o00oO0o("mContext");
            throw null;
        }
        AbstractC0809oO0OooOO.o00oO0o("mContext");
        throw null;
    }
}
