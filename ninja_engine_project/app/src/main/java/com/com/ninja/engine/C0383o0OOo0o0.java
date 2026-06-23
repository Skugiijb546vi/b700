package com.ninja.engine;

import android.content.res.AssetManager;
import android.os.Build;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.Serializable;
import java.util.concurrent.Executor;
/* renamed from: com.ninja.engine.o0OOo0o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0383o0OOo0o0 {
    public final Executor OooO00o;
    public final InterfaceC1004oOOOOo0o OooO0O0;
    public final byte[] OooO0OO;
    public final File OooO0Oo;
    public boolean OooO0o = false;
    public final String OooO0o0;
    public C0384o0OOo0oO[] OooO0oO;
    public byte[] OooO0oo;

    public C0383o0OOo0o0(AssetManager assetManager, Executor executor, InterfaceC1004oOOOOo0o interfaceC1004oOOOOo0o, String str, File file) {
        this.OooO00o = executor;
        this.OooO0O0 = interfaceC1004oOOOOo0o;
        this.OooO0o0 = str;
        this.OooO0Oo = file;
        int i = Build.VERSION.SDK_INT;
        byte[] bArr = null;
        if (i >= 24) {
            if (i >= 31) {
                bArr = AbstractC0694o0ooooo0.OooO0oO;
            } else {
                switch (i) {
                    case 24:
                    case 25:
                        bArr = AbstractC0694o0ooooo0.OooOO0O;
                        break;
                    case 26:
                        bArr = AbstractC0694o0ooooo0.OooOO0;
                        break;
                    case 27:
                        bArr = AbstractC0694o0ooooo0.OooO;
                        break;
                    case 28:
                    case 29:
                    case 30:
                        bArr = AbstractC0694o0ooooo0.OooO0oo;
                        break;
                }
            }
        }
        this.OooO0OO = bArr;
    }

    public final FileInputStream OooO00o(AssetManager assetManager, String str) {
        try {
            return assetManager.openFd(str).createInputStream();
        } catch (FileNotFoundException e) {
            String message = e.getMessage();
            if (message != null && message.contains("compressed")) {
                this.OooO0O0.getClass();
            }
            return null;
        }
    }

    public final void OooO0O0(int i, Serializable serializable) {
        this.OooO00o.execute(new RunnableC0381o0OOo0Oo(this, i, serializable));
    }
}
