package com.ninja.engine;

import android.graphics.Bitmap;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
/* renamed from: com.ninja.engine.oO0o0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0835oO0o0oO implements InterfaceC0206o00o0OOO {
    public static final Bitmap.Config OooO0o = Bitmap.Config.ARGB_8888;
    public final InterfaceC0840oO0o0ooo OooO00o;
    public final Set OooO0O0;
    public final C0601o0oOooO0 OooO0OO;
    public final long OooO0Oo;
    public long OooO0o0;

    public C0835oO0o0oO(long j) {
        Bitmap.Config config;
        C1330oOooo0Oo c1330oOooo0Oo = new C1330oOooo0Oo();
        HashSet hashSet = new HashSet(Arrays.asList(Bitmap.Config.values()));
        int i = Build.VERSION.SDK_INT;
        hashSet.add(null);
        if (i >= 26) {
            config = Bitmap.Config.HARDWARE;
            hashSet.remove(config);
        }
        Set unmodifiableSet = Collections.unmodifiableSet(hashSet);
        this.OooO0Oo = j;
        this.OooO00o = c1330oOooo0Oo;
        this.OooO0O0 = unmodifiableSet;
        this.OooO0OO = new C0601o0oOooO0(28);
    }

    @Override // com.ninja.engine.InterfaceC0206o00o0OOO
    public final synchronized void OooO(Bitmap bitmap) {
        try {
            if (bitmap != null) {
                if (!bitmap.isRecycled()) {
                    if (bitmap.isMutable()) {
                        ((C1330oOooo0Oo) this.OooO00o).getClass();
                        if (AbstractC1401oo00OOO0.OooO0OO(bitmap) <= this.OooO0Oo && this.OooO0O0.contains(bitmap.getConfig())) {
                            ((C1330oOooo0Oo) this.OooO00o).getClass();
                            int OooO0OO = AbstractC1401oo00OOO0.OooO0OO(bitmap);
                            ((C1330oOooo0Oo) this.OooO00o).OooO0o0(bitmap);
                            this.OooO0OO.getClass();
                            this.OooO0o0 += OooO0OO;
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                ((C1330oOooo0Oo) this.OooO00o).getClass();
                                C1330oOooo0Oo.OooO0OO(AbstractC1401oo00OOO0.OooO0OO(bitmap), bitmap.getConfig());
                            }
                            if (Log.isLoggable("LruBitmapPool", 2)) {
                                Objects.toString(this.OooO00o);
                            }
                            OooO0O0(this.OooO0Oo);
                            return;
                        }
                    }
                    if (Log.isLoggable("LruBitmapPool", 2)) {
                        ((C1330oOooo0Oo) this.OooO00o).getClass();
                        C1330oOooo0Oo.OooO0OO(AbstractC1401oo00OOO0.OooO0OO(bitmap), bitmap.getConfig());
                        bitmap.isMutable();
                        this.OooO0O0.contains(bitmap.getConfig());
                    }
                    bitmap.recycle();
                    return;
                }
                throw new IllegalStateException("Cannot pool recycled bitmap");
            }
            throw new NullPointerException("Bitmap must not be null");
        } catch (Throwable th) {
            throw th;
        }
    }

    public final synchronized Bitmap OooO00o(int i, int i2, Bitmap.Config config) {
        Bitmap.Config config2;
        Bitmap.Config config3;
        Bitmap OooO0O0;
        try {
            if (Build.VERSION.SDK_INT >= 26) {
                config2 = Bitmap.Config.HARDWARE;
                if (config == config2) {
                    throw new IllegalArgumentException("Cannot create a mutable Bitmap with config: " + config + ". Consider setting Downsampler#ALLOW_HARDWARE_CONFIG to false in your RequestOptions and/or in GlideBuilder.setDefaultRequestOptions");
                }
            }
            InterfaceC0840oO0o0ooo interfaceC0840oO0o0ooo = this.OooO00o;
            if (config != null) {
                config3 = config;
            } else {
                config3 = OooO0o;
            }
            OooO0O0 = ((C1330oOooo0Oo) interfaceC0840oO0o0ooo).OooO0O0(i, i2, config3);
            if (OooO0O0 == null) {
                if (Log.isLoggable("LruBitmapPool", 3)) {
                    ((C1330oOooo0Oo) this.OooO00o).getClass();
                    C1330oOooo0Oo.OooO0OO(AbstractC1401oo00OOO0.OooO0Oo(config) * i * i2, config);
                }
            } else {
                long j = this.OooO0o0;
                ((C1330oOooo0Oo) this.OooO00o).getClass();
                this.OooO0o0 = j - AbstractC1401oo00OOO0.OooO0OO(OooO0O0);
                this.OooO0OO.getClass();
                OooO0O0.setHasAlpha(true);
                OooO0O0.setPremultiplied(true);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                ((C1330oOooo0Oo) this.OooO00o).getClass();
                C1330oOooo0Oo.OooO0OO(AbstractC1401oo00OOO0.OooO0Oo(config) * i * i2, config);
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.OooO00o);
            }
        } catch (Throwable th) {
            throw th;
        }
        return OooO0O0;
    }

    public final synchronized void OooO0O0(long j) {
        while (this.OooO0o0 > j) {
            C1330oOooo0Oo c1330oOooo0Oo = (C1330oOooo0Oo) this.OooO00o;
            Bitmap bitmap = (Bitmap) c1330oOooo0Oo.OooO0O0.Oooo0oO();
            if (bitmap != null) {
                c1330oOooo0Oo.OooO00o(Integer.valueOf(AbstractC1401oo00OOO0.OooO0OO(bitmap)), bitmap);
            }
            if (bitmap == null) {
                if (Log.isLoggable("LruBitmapPool", 5)) {
                    Objects.toString(this.OooO00o);
                }
                this.OooO0o0 = 0L;
                return;
            }
            this.OooO0OO.getClass();
            long j2 = this.OooO0o0;
            ((C1330oOooo0Oo) this.OooO00o).getClass();
            this.OooO0o0 = j2 - AbstractC1401oo00OOO0.OooO0OO(bitmap);
            if (Log.isLoggable("LruBitmapPool", 3)) {
                ((C1330oOooo0Oo) this.OooO00o).getClass();
                C1330oOooo0Oo.OooO0OO(AbstractC1401oo00OOO0.OooO0OO(bitmap), bitmap.getConfig());
            }
            if (Log.isLoggable("LruBitmapPool", 2)) {
                Objects.toString(this.OooO00o);
            }
            bitmap.recycle();
        }
    }

    @Override // com.ninja.engine.InterfaceC0206o00o0OOO
    public final Bitmap OooO0oO(int i, int i2, Bitmap.Config config) {
        Bitmap OooO00o = OooO00o(i, i2, config);
        if (OooO00o == null) {
            if (config == null) {
                config = OooO0o;
            }
            return Bitmap.createBitmap(i, i2, config);
        }
        return OooO00o;
    }

    @Override // com.ninja.engine.InterfaceC0206o00o0OOO
    public final Bitmap OooO0oo(int i, int i2, Bitmap.Config config) {
        Bitmap OooO00o = OooO00o(i, i2, config);
        if (OooO00o != null) {
            OooO00o.eraseColor(0);
            return OooO00o;
        }
        if (config == null) {
            config = OooO0o;
        }
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.ninja.engine.InterfaceC0206o00o0OOO
    public final void OooOOO(int i) {
        Log.isLoggable("LruBitmapPool", 3);
        if (i < 40 && (Build.VERSION.SDK_INT < 23 || i < 20)) {
            if (i >= 20 || i == 15) {
                OooO0O0(this.OooO0Oo / 2);
                return;
            }
            return;
        }
        OooOOo0();
    }

    @Override // com.ninja.engine.InterfaceC0206o00o0OOO
    public final void OooOOo0() {
        Log.isLoggable("LruBitmapPool", 3);
        OooO0O0(0L);
    }
}
