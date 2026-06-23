package com.app.framework.utils.compat;

import android.os.IBinder;
import android.os.IInterface;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1554oo0o000o;
import com.ninja.engine.InterfaceC1909ooOoo0oO;
/* loaded from: classes.dex */
public class ApplicationThreadCompat {
    public static IInterface asInterface(IBinder iBinder) {
        return BuildCompat.isOreo() ? ((InterfaceC1554oo0o000o) C0217o00o0oO0.create(InterfaceC1554oo0o000o.class, null, false)).asInterface(iBinder) : ((InterfaceC1909ooOoo0oO) C0217o00o0oO0.create(InterfaceC1909ooOoo0oO.class, null, false)).asInterface(iBinder);
    }
}
