package com.ninja.engine;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import com.app.framework.core.system.JarConfig;
import com.app.framework.utils.FileUtils;
/* renamed from: com.ninja.engine.o00Ooooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0186o00Ooooo implements Cloneable {
    public int OooO00o;
    public int OooO0o;
    public Drawable OooO0o0;
    public Drawable OooO0oO;
    public int OooO0oo;
    public boolean OooOOO0;
    public Drawable OooOOOO;
    public int OooOOOo;
    public boolean OooOo;
    public Resources.Theme OooOo0;
    public boolean OooOo00;
    public boolean OooOo0O;
    public boolean OooOo0o;
    public boolean OooOoO;
    public float OooO0O0 = 1.0f;
    public C0395o0OOoo OooO0OO = C0395o0OOoo.OooO0o0;
    public EnumC1000oOOOO0oo OooO0Oo = EnumC1000oOOOO0oo.OooO0OO;
    public boolean OooO = true;
    public int OooOO0 = -1;
    public int OooOO0O = -1;
    public InterfaceC0745oO00oOo OooOO0o = C0489o0Ooooo0.OooO0O0;
    public boolean OooOOO = true;
    public C0973oOOO00o OooOOo0 = new C0973oOOO00o();
    public C0257o00oo0o OooOOo = new C1218oOoOOoo(0);
    public Class OooOOoo = Object.class;
    public boolean OooOoO0 = true;

    public static boolean OooO0o(int i, int i2) {
        if ((i & i2) != 0) {
            return true;
        }
        return false;
    }

    public final AbstractC0186o00Ooooo OooO() {
        EnumC1000oOOOO0oo enumC1000oOOOO0oo = EnumC1000oOOOO0oo.OooO0Oo;
        if (this.OooOo0O) {
            return clone().OooO();
        }
        this.OooO0Oo = enumC1000oOOOO0oo;
        this.OooO00o |= 8;
        OooOO0();
        return this;
    }

    public AbstractC0186o00Ooooo OooO00o(AbstractC0186o00Ooooo abstractC0186o00Ooooo) {
        if (this.OooOo0O) {
            return clone().OooO00o(abstractC0186o00Ooooo);
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 2)) {
            this.OooO0O0 = abstractC0186o00Ooooo.OooO0O0;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 262144)) {
            this.OooOo0o = abstractC0186o00Ooooo.OooOo0o;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 1048576)) {
            this.OooOoO = abstractC0186o00Ooooo.OooOoO;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 4)) {
            this.OooO0OO = abstractC0186o00Ooooo.OooO0OO;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 8)) {
            this.OooO0Oo = abstractC0186o00Ooooo.OooO0Oo;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 16)) {
            this.OooO0o0 = abstractC0186o00Ooooo.OooO0o0;
            this.OooO0o = 0;
            this.OooO00o &= -33;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 32)) {
            this.OooO0o = abstractC0186o00Ooooo.OooO0o;
            this.OooO0o0 = null;
            this.OooO00o &= -17;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 64)) {
            this.OooO0oO = abstractC0186o00Ooooo.OooO0oO;
            this.OooO0oo = 0;
            this.OooO00o &= -129;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 128)) {
            this.OooO0oo = abstractC0186o00Ooooo.OooO0oo;
            this.OooO0oO = null;
            this.OooO00o &= -65;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 256)) {
            this.OooO = abstractC0186o00Ooooo.OooO;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 512)) {
            this.OooOO0O = abstractC0186o00Ooooo.OooOO0O;
            this.OooOO0 = abstractC0186o00Ooooo.OooOO0;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 1024)) {
            this.OooOO0o = abstractC0186o00Ooooo.OooOO0o;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 4096)) {
            this.OooOOoo = abstractC0186o00Ooooo.OooOOoo;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, JarConfig.DEFAULT_BUFFER_SIZE)) {
            this.OooOOOO = abstractC0186o00Ooooo.OooOOOO;
            this.OooOOOo = 0;
            this.OooO00o &= -16385;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 16384)) {
            this.OooOOOo = abstractC0186o00Ooooo.OooOOOo;
            this.OooOOOO = null;
            this.OooO00o &= -8193;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, JarConfig.MAX_BUFFER_SIZE)) {
            this.OooOo0 = abstractC0186o00Ooooo.OooOo0;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 65536)) {
            this.OooOOO = abstractC0186o00Ooooo.OooOOO;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 131072)) {
            this.OooOOO0 = abstractC0186o00Ooooo.OooOOO0;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, FileUtils.FileMode.MODE_ISUID)) {
            this.OooOOo.putAll(abstractC0186o00Ooooo.OooOOo);
            this.OooOoO0 = abstractC0186o00Ooooo.OooOoO0;
        }
        if (OooO0o(abstractC0186o00Ooooo.OooO00o, 524288)) {
            this.OooOo = abstractC0186o00Ooooo.OooOo;
        }
        if (!this.OooOOO) {
            this.OooOOo.clear();
            int i = this.OooO00o;
            this.OooOOO0 = false;
            this.OooO00o = i & (-133121);
            this.OooOoO0 = true;
        }
        this.OooO00o |= abstractC0186o00Ooooo.OooO00o;
        this.OooOOo0.OooO0O0.OooO0oO(abstractC0186o00Ooooo.OooOOo0.OooO0O0);
        OooOO0();
        return this;
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [com.ninja.engine.o00OO0oO, com.ninja.engine.o00oo0o, com.ninja.engine.oOoOOoo] */
    @Override // 
    /* renamed from: OooO0O0 */
    public AbstractC0186o00Ooooo clone() {
        try {
            AbstractC0186o00Ooooo abstractC0186o00Ooooo = (AbstractC0186o00Ooooo) super.clone();
            C0973oOOO00o c0973oOOO00o = new C0973oOOO00o();
            abstractC0186o00Ooooo.OooOOo0 = c0973oOOO00o;
            c0973oOOO00o.OooO0O0.OooO0oO(this.OooOOo0.OooO0O0);
            ?? c1218oOoOOoo = new C1218oOoOOoo(0);
            abstractC0186o00Ooooo.OooOOo = c1218oOoOOoo;
            c1218oOoOOoo.putAll(this.OooOOo);
            abstractC0186o00Ooooo.OooOo00 = false;
            abstractC0186o00Ooooo.OooOo0O = false;
            return abstractC0186o00Ooooo;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public final AbstractC0186o00Ooooo OooO0OO(Class cls) {
        if (this.OooOo0O) {
            return clone().OooO0OO(cls);
        }
        this.OooOOoo = cls;
        this.OooO00o |= 4096;
        OooOO0();
        return this;
    }

    public final AbstractC0186o00Ooooo OooO0Oo(C0395o0OOoo c0395o0OOoo) {
        if (this.OooOo0O) {
            return clone().OooO0Oo(c0395o0OOoo);
        }
        this.OooO0OO = c0395o0OOoo;
        this.OooO00o |= 4;
        OooOO0();
        return this;
    }

    public final boolean OooO0o0(AbstractC0186o00Ooooo abstractC0186o00Ooooo) {
        if (Float.compare(abstractC0186o00Ooooo.OooO0O0, this.OooO0O0) == 0 && this.OooO0o == abstractC0186o00Ooooo.OooO0o && AbstractC1401oo00OOO0.OooO0O0(this.OooO0o0, abstractC0186o00Ooooo.OooO0o0) && this.OooO0oo == abstractC0186o00Ooooo.OooO0oo && AbstractC1401oo00OOO0.OooO0O0(this.OooO0oO, abstractC0186o00Ooooo.OooO0oO) && this.OooOOOo == abstractC0186o00Ooooo.OooOOOo && AbstractC1401oo00OOO0.OooO0O0(this.OooOOOO, abstractC0186o00Ooooo.OooOOOO) && this.OooO == abstractC0186o00Ooooo.OooO && this.OooOO0 == abstractC0186o00Ooooo.OooOO0 && this.OooOO0O == abstractC0186o00Ooooo.OooOO0O && this.OooOOO0 == abstractC0186o00Ooooo.OooOOO0 && this.OooOOO == abstractC0186o00Ooooo.OooOOO && this.OooOo0o == abstractC0186o00Ooooo.OooOo0o && this.OooOo == abstractC0186o00Ooooo.OooOo && this.OooO0OO.equals(abstractC0186o00Ooooo.OooO0OO) && this.OooO0Oo == abstractC0186o00Ooooo.OooO0Oo && this.OooOOo0.equals(abstractC0186o00Ooooo.OooOOo0) && this.OooOOo.equals(abstractC0186o00Ooooo.OooOOo) && this.OooOOoo.equals(abstractC0186o00Ooooo.OooOOoo) && AbstractC1401oo00OOO0.OooO0O0(this.OooOO0o, abstractC0186o00Ooooo.OooOO0o) && AbstractC1401oo00OOO0.OooO0O0(this.OooOo0, abstractC0186o00Ooooo.OooOo0)) {
            return true;
        }
        return false;
    }

    public final AbstractC0186o00Ooooo OooO0oO(C0416o0Oo0OO c0416o0Oo0OO, AbstractC0209o00o0Oo0 abstractC0209o00o0Oo0) {
        if (this.OooOo0O) {
            return clone().OooO0oO(c0416o0Oo0OO, abstractC0209o00o0Oo0);
        }
        OooOO0O(C0416o0Oo0OO.OooO0oO, c0416o0Oo0OO);
        return OooOOO(abstractC0209o00o0Oo0, false);
    }

    public final AbstractC0186o00Ooooo OooO0oo(int i, int i2) {
        if (this.OooOo0O) {
            return clone().OooO0oo(i, i2);
        }
        this.OooOO0O = i;
        this.OooOO0 = i2;
        this.OooO00o |= 512;
        OooOO0();
        return this;
    }

    public final void OooOO0() {
        if (!this.OooOo00) {
            return;
        }
        throw new IllegalStateException("You cannot modify locked T, consider clone()");
    }

    public final AbstractC0186o00Ooooo OooOO0O(oOOO00o0 oooo00o0, Object obj) {
        if (this.OooOo0O) {
            return clone().OooOO0O(oooo00o0, obj);
        }
        AbstractC0694o0ooooo0.OooOO0(oooo00o0);
        this.OooOOo0.OooO0O0.put(oooo00o0, obj);
        OooOO0();
        return this;
    }

    public final AbstractC0186o00Ooooo OooOO0o(C0947oOO0oO00 c0947oOO0oO00) {
        if (this.OooOo0O) {
            return clone().OooOO0o(c0947oOO0oO00);
        }
        this.OooOO0o = c0947oOO0oO00;
        this.OooO00o |= 1024;
        OooOO0();
        return this;
    }

    public final AbstractC0186o00Ooooo OooOOO(InterfaceC1351oo00000O interfaceC1351oo00000O, boolean z) {
        if (this.OooOo0O) {
            return clone().OooOOO(interfaceC1351oo00000O, z);
        }
        C0598o0oOoo00 c0598o0oOoo00 = new C0598o0oOoo00(interfaceC1351oo00000O, z);
        OooOOOO(Bitmap.class, interfaceC1351oo00000O, z);
        OooOOOO(Drawable.class, c0598o0oOoo00, z);
        OooOOOO(BitmapDrawable.class, c0598o0oOoo00, z);
        OooOOOO(C0680o0oooOO.class, new C0684o0oooOo0(interfaceC1351oo00000O), z);
        OooOO0();
        return this;
    }

    public final AbstractC0186o00Ooooo OooOOO0() {
        if (this.OooOo0O) {
            return clone().OooOOO0();
        }
        this.OooO = false;
        this.OooO00o |= 256;
        OooOO0();
        return this;
    }

    public final AbstractC0186o00Ooooo OooOOOO(Class cls, InterfaceC1351oo00000O interfaceC1351oo00000O, boolean z) {
        if (this.OooOo0O) {
            return clone().OooOOOO(cls, interfaceC1351oo00000O, z);
        }
        AbstractC0694o0ooooo0.OooOO0(interfaceC1351oo00000O);
        this.OooOOo.put(cls, interfaceC1351oo00000O);
        int i = this.OooO00o;
        this.OooOOO = true;
        this.OooO00o = 67584 | i;
        this.OooOoO0 = false;
        if (z) {
            this.OooO00o = i | 198656;
            this.OooOOO0 = true;
        }
        OooOO0();
        return this;
    }

    public final AbstractC0186o00Ooooo OooOOOo() {
        if (this.OooOo0O) {
            return clone().OooOOOo();
        }
        this.OooOoO = true;
        this.OooO00o |= 1048576;
        OooOO0();
        return this;
    }

    public boolean equals(Object obj) {
        if (obj instanceof AbstractC0186o00Ooooo) {
            return OooO0o0((AbstractC0186o00Ooooo) obj);
        }
        return false;
    }

    public int hashCode() {
        float f = this.OooO0O0;
        char[] cArr = AbstractC1401oo00OOO0.OooO00o;
        return AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oO(this.OooOo ? 1 : 0, AbstractC1401oo00OOO0.OooO0oO(this.OooOo0o ? 1 : 0, AbstractC1401oo00OOO0.OooO0oO(this.OooOOO ? 1 : 0, AbstractC1401oo00OOO0.OooO0oO(this.OooOOO0 ? 1 : 0, AbstractC1401oo00OOO0.OooO0oO(this.OooOO0O, AbstractC1401oo00OOO0.OooO0oO(this.OooOO0, AbstractC1401oo00OOO0.OooO0oO(this.OooO ? 1 : 0, AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oO(this.OooOOOo, AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oO(this.OooO0oo, AbstractC1401oo00OOO0.OooO0oo(AbstractC1401oo00OOO0.OooO0oO(this.OooO0o, AbstractC1401oo00OOO0.OooO0oO(Float.floatToIntBits(f), 17)), this.OooO0o0)), this.OooO0oO)), this.OooOOOO)))))))), this.OooO0OO), this.OooO0Oo), this.OooOOo0), this.OooOOo), this.OooOOoo), this.OooOO0o), this.OooOo0);
    }
}
