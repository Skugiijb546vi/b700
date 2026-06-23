package com.ninja.engine;

import android.util.Log;
import java.io.File;
import java.io.IOException;
import java.util.HashMap;
import java.util.Objects;
/* renamed from: com.ninja.engine.o0Oo00o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0409o0Oo00o0 implements InterfaceC0398o0OOoo0o {
    public final File OooO0O0;
    public final long OooO0OO;
    public C0403o0OOooo OooO0o0;
    public final C0415o0Oo0O0O OooO0Oo = new C0415o0Oo0O0O(13);
    public final C1126oOOooOO OooO00o = new C1126oOOooOO(1);

    public C0409o0Oo00o0(File file, long j) {
        this.OooO0O0 = file;
        this.OooO0OO = j;
    }

    public final synchronized C0403o0OOooo OooO00o() {
        try {
            if (this.OooO0o0 == null) {
                this.OooO0o0 = C0403o0OOooo.OooO0oo(this.OooO0O0, this.OooO0OO);
            }
        } catch (Throwable th) {
            throw th;
        }
        return this.OooO0o0;
    }

    @Override // com.ninja.engine.InterfaceC0398o0OOoo0o
    public final void OooO0OO(InterfaceC0745oO00oOo interfaceC0745oO00oOo, C0131o00O0o c0131o00O0o) {
        C0399o0OOooO c0399o0OOooO;
        C0403o0OOooo OooO00o;
        boolean z;
        String OooOO0O = this.OooO00o.OooOO0O(interfaceC0745oO00oOo);
        C0415o0Oo0O0O c0415o0Oo0O0O = this.OooO0Oo;
        synchronized (c0415o0Oo0O0O) {
            try {
                c0399o0OOooO = (C0399o0OOooO) ((HashMap) c0415o0Oo0O0O.OooO0O0).get(OooOO0O);
                if (c0399o0OOooO == null) {
                    c0399o0OOooO = ((C0235o00oOOo0) c0415o0Oo0O0O.OooO0OO).OooO00o();
                    ((HashMap) c0415o0Oo0O0O.OooO0O0).put(OooOO0O, c0399o0OOooO);
                }
                c0399o0OOooO.OooO0O0++;
            } catch (Throwable th) {
                throw th;
            }
        }
        c0399o0OOooO.OooO00o.lock();
        try {
            if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
                Objects.toString(interfaceC0745oO00oOo);
            }
            try {
                OooO00o = OooO00o();
            } catch (IOException unused) {
                Log.isLoggable("DiskLruCacheWrapper", 5);
            }
            if (OooO00o.OooO0o(OooOO0O) != null) {
                return;
            }
            C0067o0000Ooo OooO0Oo = OooO00o.OooO0Oo(OooOO0O);
            if (OooO0Oo != null) {
                try {
                    if (((InterfaceC0488o0Ooooo) c0131o00O0o.OooO0O0).OooO0o0(c0131o00O0o.OooO0OO, OooO0Oo.OooO0o(), (C0973oOOO00o) c0131o00O0o.OooO0Oo)) {
                        C0403o0OOooo.OooO00o((C0403o0OOooo) OooO0Oo.OooO0Oo, OooO0Oo, true);
                        OooO0Oo.OooO00o = true;
                    }
                    if (!z) {
                        try {
                            OooO0Oo.OooO0OO();
                        } catch (IOException unused2) {
                        }
                    }
                    return;
                } finally {
                    if (!OooO0Oo.OooO00o) {
                        try {
                            OooO0Oo.OooO0OO();
                        } catch (IOException unused3) {
                        }
                    }
                }
            }
            throw new IllegalStateException("Had two simultaneous puts for: ".concat(OooOO0O));
        } finally {
            this.OooO0Oo.Oooo0o(OooOO0O);
        }
    }

    @Override // com.ninja.engine.InterfaceC0398o0OOoo0o
    public final File OooOOOo(InterfaceC0745oO00oOo interfaceC0745oO00oOo) {
        String OooOO0O = this.OooO00o.OooOO0O(interfaceC0745oO00oOo);
        if (Log.isLoggable("DiskLruCacheWrapper", 2)) {
            Objects.toString(interfaceC0745oO00oOo);
        }
        try {
            C0331o0O0oo OooO0o = OooO00o().OooO0o(OooOO0O);
            if (OooO0o == null) {
                return null;
            }
            return ((File[]) OooO0o.OooO0O0)[0];
        } catch (IOException unused) {
            Log.isLoggable("DiskLruCacheWrapper", 5);
            return null;
        }
    }
}
