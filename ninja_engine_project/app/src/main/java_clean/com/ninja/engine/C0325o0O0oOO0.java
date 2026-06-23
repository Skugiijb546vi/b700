package com.ninja.engine;

import android.content.Context;
import java.io.File;
import java.util.concurrent.CopyOnWriteArraySet;
/* renamed from: com.ninja.engine.o0O0oOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0325o0O0oOO0 implements oO00000o {
    public final Object OooO00o;
    public volatile Object OooO0O0;

    public C0325o0O0oOO0() {
        this.OooO00o = new CopyOnWriteArraySet();
    }

    public InterfaceC0398o0OOoo0o OooO00o() {
        if (((InterfaceC0398o0OOoo0o) this.OooO0O0) == null) {
            synchronized (this) {
                try {
                    if (((InterfaceC0398o0OOoo0o) this.OooO0O0) == null) {
                        C0415o0Oo0O0O c0415o0Oo0O0O = (C0415o0Oo0O0O) ((C0331o0O0oo) this.OooO00o).OooO0O0;
                        File cacheDir = ((Context) c0415o0Oo0O0O.OooO0O0).getCacheDir();
                        C0409o0Oo00o0 c0409o0Oo00o0 = null;
                        if (cacheDir == null) {
                            cacheDir = null;
                        } else {
                            String str = (String) c0415o0Oo0O0O.OooO0OO;
                            if (str != null) {
                                cacheDir = new File(cacheDir, str);
                            }
                        }
                        if (cacheDir != null && (cacheDir.isDirectory() || cacheDir.mkdirs())) {
                            c0409o0Oo00o0 = new C0409o0Oo00o0(cacheDir, 262144000L);
                        }
                        this.OooO0O0 = c0409o0Oo00o0;
                    }
                    if (((InterfaceC0398o0OOoo0o) this.OooO0O0) == null) {
                        this.OooO0O0 = new C0455o0OoOo00(28);
                    }
                } finally {
                }
            }
        }
        return (InterfaceC0398o0OOoo0o) this.OooO0O0;
    }

    @Override // com.ninja.engine.oO00000o
    public Object get() {
        if (this.OooO0O0 == null) {
            synchronized (this) {
                try {
                    if (this.OooO0O0 == null) {
                        Object obj = ((oO00000o) this.OooO00o).get();
                        AbstractC0694o0ooooo0.OooOO0O(obj, "Argument must not be null");
                        this.OooO0O0 = obj;
                    }
                } finally {
                }
            }
        }
        return this.OooO0O0;
    }

    public /* synthetic */ C0325o0O0oOO0(Object obj) {
        this.OooO00o = obj;
    }
}


