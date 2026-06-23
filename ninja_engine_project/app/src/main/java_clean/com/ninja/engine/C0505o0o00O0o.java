package com.ninja.engine;
/* renamed from: com.ninja.engine.o0o00O0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0505o0o00O0o implements InterfaceC1097oOOoOo, InterfaceC1098oOOoOo00 {
    public final Object OooO00o;
    public final InterfaceC1097oOOoOo OooO0O0;
    public volatile InterfaceC1098oOOoOo00 OooO0OO;
    public volatile InterfaceC1098oOOoOo00 OooO0Oo;
    public int OooO0o0 = 3;
    public int OooO0o = 3;

    public C0505o0o00O0o(Object obj, InterfaceC1097oOOoOo interfaceC1097oOOoOo) {
        this.OooO00o = obj;
        this.OooO0O0 = interfaceC1097oOOoOo;
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final void OooO() {
        synchronized (this.OooO00o) {
            try {
                if (this.OooO0o0 == 1) {
                    this.OooO0o0 = 2;
                    this.OooO0OO.OooO();
                }
                if (this.OooO0o == 1) {
                    this.OooO0o = 2;
                    this.OooO0Oo.OooO();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1097oOOoOo, com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.OooO00o) {
            try {
                if (!this.OooO0OO.OooO00o() && !this.OooO0Oo.OooO00o()) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // com.ninja.engine.InterfaceC1097oOOoOo
    public final boolean OooO0O0(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        boolean z;
        synchronized (this.OooO00o) {
            InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO0O0;
            if ((interfaceC1097oOOoOo == null || interfaceC1097oOOoOo.OooO0O0(this)) && interfaceC1098oOOoOo00.equals(this.OooO0OO)) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean OooO0OO(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        if (!(interfaceC1098oOOoOo00 instanceof C0505o0o00O0o)) {
            return false;
        }
        C0505o0o00O0o c0505o0o00O0o = (C0505o0o00O0o) interfaceC1098oOOoOo00;
        if (!this.OooO0OO.OooO0OO(c0505o0o00O0o.OooO0OO) || !this.OooO0Oo.OooO0OO(c0505o0o00O0o.OooO0Oo)) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.InterfaceC1097oOOoOo
    public final void OooO0Oo(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        synchronized (this.OooO00o) {
            try {
                if (!interfaceC1098oOOoOo00.equals(this.OooO0Oo)) {
                    this.OooO0o0 = 5;
                    if (this.OooO0o != 1) {
                        this.OooO0o = 1;
                        this.OooO0Oo.OooOO0();
                    }
                    return;
                }
                this.OooO0o = 5;
                InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO0O0;
                if (interfaceC1097oOOoOo != null) {
                    interfaceC1097oOOoOo.OooO0Oo(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1097oOOoOo
    public final void OooO0o(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        synchronized (this.OooO00o) {
            try {
                if (interfaceC1098oOOoOo00.equals(this.OooO0OO)) {
                    this.OooO0o0 = 4;
                } else if (interfaceC1098oOOoOo00.equals(this.OooO0Oo)) {
                    this.OooO0o = 4;
                }
                InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO0O0;
                if (interfaceC1097oOOoOo != null) {
                    interfaceC1097oOOoOo.OooO0o(this);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1097oOOoOo
    public final boolean OooO0o0(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        boolean z;
        boolean z2;
        int i;
        synchronized (this.OooO00o) {
            InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO0O0;
            z = false;
            if (interfaceC1097oOOoOo == null || interfaceC1097oOOoOo.OooO0o0(this)) {
                if (this.OooO0o0 != 5) {
                    z2 = interfaceC1098oOOoOo00.equals(this.OooO0OO);
                } else if (interfaceC1098oOOoOo00.equals(this.OooO0Oo) && ((i = this.OooO0o) == 4 || i == 5)) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    z = true;
                }
            }
        }
        return z;
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean OooO0oO() {
        boolean z;
        synchronized (this.OooO00o) {
            try {
                if (this.OooO0o0 == 3 && this.OooO0o == 3) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.ninja.engine.InterfaceC1097oOOoOo
    public final InterfaceC1097oOOoOo OooO0oo() {
        InterfaceC1097oOOoOo interfaceC1097oOOoOo;
        synchronized (this.OooO00o) {
            try {
                InterfaceC1097oOOoOo interfaceC1097oOOoOo2 = this.OooO0O0;
                if (interfaceC1097oOOoOo2 != null) {
                    interfaceC1097oOOoOo = interfaceC1097oOOoOo2.OooO0oo();
                } else {
                    interfaceC1097oOOoOo = this;
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return interfaceC1097oOOoOo;
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final void OooOO0() {
        synchronized (this.OooO00o) {
            try {
                if (this.OooO0o0 != 1) {
                    this.OooO0o0 = 1;
                    this.OooO0OO.OooOO0();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean OooOO0O() {
        boolean z;
        synchronized (this.OooO00o) {
            try {
                if (this.OooO0o0 != 4 && this.OooO0o != 4) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // com.ninja.engine.InterfaceC1097oOOoOo
    public final boolean OooOO0o(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        boolean z;
        synchronized (this.OooO00o) {
            InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO0O0;
            if (interfaceC1097oOOoOo != null && !interfaceC1097oOOoOo.OooOO0o(this)) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final void clear() {
        synchronized (this.OooO00o) {
            try {
                this.OooO0o0 = 3;
                this.OooO0OO.clear();
                if (this.OooO0o != 3) {
                    this.OooO0o = 3;
                    this.OooO0Oo.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean isRunning() {
        boolean z;
        synchronized (this.OooO00o) {
            try {
                z = true;
                if (this.OooO0o0 != 1 && this.OooO0o != 1) {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }
}


