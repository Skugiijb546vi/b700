package com.ninja.engine;
/* renamed from: com.ninja.engine.oOooOoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1316oOooOoOo implements InterfaceC1097oOOoOo, InterfaceC1098oOOoOo00 {
    public final InterfaceC1097oOOoOo OooO00o;
    public final Object OooO0O0;
    public volatile InterfaceC1098oOOoOo00 OooO0OO;
    public volatile InterfaceC1098oOOoOo00 OooO0Oo;
    public boolean OooO0oO;
    public int OooO0o0 = 3;
    public int OooO0o = 3;

    public C1316oOooOoOo(Object obj, InterfaceC1097oOOoOo interfaceC1097oOOoOo) {
        this.OooO0O0 = obj;
        this.OooO00o = interfaceC1097oOOoOo;
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final void OooO() {
        synchronized (this.OooO0O0) {
            try {
                if (!AbstractC1230oOoOo0o.OooO0Oo(this.OooO0o)) {
                    this.OooO0o = 2;
                    this.OooO0Oo.OooO();
                }
                if (!AbstractC1230oOoOo0o.OooO0Oo(this.OooO0o0)) {
                    this.OooO0o0 = 2;
                    this.OooO0OO.OooO();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1097oOOoOo, com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.OooO0O0) {
            try {
                if (!this.OooO0Oo.OooO00o() && !this.OooO0OO.OooO00o()) {
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
        synchronized (this.OooO0O0) {
            try {
                InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO00o;
                if ((interfaceC1097oOOoOo == null || interfaceC1097oOOoOo.OooO0O0(this)) && interfaceC1098oOOoOo00.equals(this.OooO0OO) && this.OooO0o0 != 2) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean OooO0OO(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        if (!(interfaceC1098oOOoOo00 instanceof C1316oOooOoOo)) {
            return false;
        }
        C1316oOooOoOo c1316oOooOoOo = (C1316oOooOoOo) interfaceC1098oOOoOo00;
        if (this.OooO0OO == null) {
            if (c1316oOooOoOo.OooO0OO != null) {
                return false;
            }
        } else if (!this.OooO0OO.OooO0OO(c1316oOooOoOo.OooO0OO)) {
            return false;
        }
        if (this.OooO0Oo == null) {
            if (c1316oOooOoOo.OooO0Oo != null) {
                return false;
            }
        } else if (!this.OooO0Oo.OooO0OO(c1316oOooOoOo.OooO0Oo)) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.InterfaceC1097oOOoOo
    public final void OooO0Oo(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        synchronized (this.OooO0O0) {
            try {
                if (!interfaceC1098oOOoOo00.equals(this.OooO0OO)) {
                    this.OooO0o = 5;
                    return;
                }
                this.OooO0o0 = 5;
                InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO00o;
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
        synchronized (this.OooO0O0) {
            try {
                if (interfaceC1098oOOoOo00.equals(this.OooO0Oo)) {
                    this.OooO0o = 4;
                    return;
                }
                this.OooO0o0 = 4;
                InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO00o;
                if (interfaceC1097oOOoOo != null) {
                    interfaceC1097oOOoOo.OooO0o(this);
                }
                if (!AbstractC1230oOoOo0o.OooO0Oo(this.OooO0o)) {
                    this.OooO0Oo.clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1097oOOoOo
    public final boolean OooO0o0(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        boolean z;
        synchronized (this.OooO0O0) {
            try {
                InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO00o;
                if ((interfaceC1097oOOoOo == null || interfaceC1097oOOoOo.OooO0o0(this)) && interfaceC1098oOOoOo00.equals(this.OooO0OO) && !OooO00o()) {
                    z = true;
                } else {
                    z = false;
                }
            } finally {
            }
        }
        return z;
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean OooO0oO() {
        boolean z;
        synchronized (this.OooO0O0) {
            if (this.OooO0o0 == 3) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.ninja.engine.InterfaceC1097oOOoOo
    public final InterfaceC1097oOOoOo OooO0oo() {
        InterfaceC1097oOOoOo interfaceC1097oOOoOo;
        synchronized (this.OooO0O0) {
            try {
                InterfaceC1097oOOoOo interfaceC1097oOOoOo2 = this.OooO00o;
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
        synchronized (this.OooO0O0) {
            try {
                this.OooO0oO = true;
                if (this.OooO0o0 != 4 && this.OooO0o != 1) {
                    this.OooO0o = 1;
                    this.OooO0Oo.OooOO0();
                }
                if (this.OooO0oO && this.OooO0o0 != 1) {
                    this.OooO0o0 = 1;
                    this.OooO0OO.OooOO0();
                }
                this.OooO0oO = false;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean OooOO0O() {
        boolean z;
        synchronized (this.OooO0O0) {
            if (this.OooO0o0 == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    @Override // com.ninja.engine.InterfaceC1097oOOoOo
    public final boolean OooOO0o(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        boolean z;
        synchronized (this.OooO0O0) {
            try {
                InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO00o;
                if ((interfaceC1097oOOoOo != null && !interfaceC1097oOOoOo.OooOO0o(this)) || (!interfaceC1098oOOoOo00.equals(this.OooO0OO) && this.OooO0o0 == 4)) {
                    z = false;
                }
                z = true;
            } finally {
            }
        }
        return z;
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final void clear() {
        synchronized (this.OooO0O0) {
            this.OooO0oO = false;
            this.OooO0o0 = 3;
            this.OooO0o = 3;
            this.OooO0Oo.clear();
            this.OooO0OO.clear();
        }
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean isRunning() {
        boolean z;
        synchronized (this.OooO0O0) {
            z = true;
            if (this.OooO0o0 != 1) {
                z = false;
            }
        }
        return z;
    }
}
