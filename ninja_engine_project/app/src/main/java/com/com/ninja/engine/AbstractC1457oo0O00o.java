package com.ninja.engine;

import android.view.ContentInfo;
import android.view.View;
import java.util.Objects;
/* renamed from: com.ninja.engine.oo0O00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1457oo0O00o {
    public static String[] OooO00o(View view) {
        return view.getReceiveContentMimeTypes();
    }

    public static C0323o0O0oO0o OooO0O0(View view, C0323o0O0oO0o c0323o0O0oO0o) {
        ContentInfo OooOOo0 = c0323o0O0oO0o.OooO00o.OooOOo0();
        Objects.requireNonNull(OooOOo0);
        ContentInfo performReceiveContent = view.performReceiveContent(OooOOo0);
        if (performReceiveContent == null) {
            return null;
        }
        if (performReceiveContent == OooOOo0) {
            return c0323o0O0oO0o;
        }
        return new C0323o0O0oO0o(new C0331o0O0oo(performReceiveContent));
    }
}
