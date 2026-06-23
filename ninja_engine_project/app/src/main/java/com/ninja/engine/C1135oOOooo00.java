package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.os.Build;
import android.util.TypedValue;
import java.lang.ref.WeakReference;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOOooo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1135oOOooo00 {
    public static C1135oOOooo00 OooO;
    public static final PorterDuff.Mode OooO0oo = PorterDuff.Mode.SRC_IN;
    public static final C1131oOOooOoO OooOO0 = new C0839oO0o0ooO(6);
    public WeakHashMap OooO00o;
    public C1218oOoOOoo OooO0O0;
    public C1236oOoOoO00 OooO0OO;
    public final WeakHashMap OooO0Oo = new WeakHashMap(0);
    public boolean OooO0o;
    public TypedValue OooO0o0;
    public C0111o000oo0 OooO0oO;

    public static synchronized C1135oOOooo00 OooO0Oo() {
        C1135oOOooo00 c1135oOOooo00;
        synchronized (C1135oOOooo00.class) {
            try {
                if (OooO == null) {
                    C1135oOOooo00 c1135oOOooo002 = new C1135oOOooo00();
                    OooO = c1135oOOooo002;
                    OooOO0(c1135oOOooo002);
                }
                c1135oOOooo00 = OooO;
            } catch (Throwable th) {
                throw th;
            }
        }
        return c1135oOOooo00;
    }

    public static synchronized PorterDuffColorFilter OooO0oo(int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter porterDuffColorFilter;
        synchronized (C1135oOOooo00.class) {
            C1131oOOooOoO c1131oOOooOoO = OooOO0;
            c1131oOOooOoO.getClass();
            int i2 = (31 + i) * 31;
            porterDuffColorFilter = (PorterDuffColorFilter) c1131oOOooOoO.OooO0o(Integer.valueOf(mode.hashCode() + i2));
            if (porterDuffColorFilter == null) {
                porterDuffColorFilter = new PorterDuffColorFilter(i, mode);
                PorterDuffColorFilter porterDuffColorFilter2 = (PorterDuffColorFilter) c1131oOOooOoO.OooOO0(Integer.valueOf(mode.hashCode() + i2), porterDuffColorFilter);
            }
        }
        return porterDuffColorFilter;
    }

    public static void OooOO0(C1135oOOooo00 c1135oOOooo00) {
        if (Build.VERSION.SDK_INT < 24) {
            c1135oOOooo00.OooO00o("vector", new C1132oOOooOoo(3));
            c1135oOOooo00.OooO00o("animated-vector", new C1132oOOooOoo(2));
            c1135oOOooo00.OooO00o("animated-selector", new C1132oOOooOoo(1));
            c1135oOOooo00.OooO00o("drawable", new C1132oOOooOoo(0));
        }
    }

    public final synchronized ColorStateList OooO(Context context, int i) {
        ColorStateList colorStateList;
        C1236oOoOoO00 c1236oOoOoO00;
        WeakHashMap weakHashMap = this.OooO00o;
        ColorStateList colorStateList2 = null;
        if (weakHashMap != null && (c1236oOoOoO00 = (C1236oOoOoO00) weakHashMap.get(context)) != null) {
            colorStateList = (ColorStateList) c1236oOoOoO00.OooO0OO(i);
        } else {
            colorStateList = null;
        }
        if (colorStateList == null) {
            C0111o000oo0 c0111o000oo0 = this.OooO0oO;
            if (c0111o000oo0 != null) {
                colorStateList2 = c0111o000oo0.OooO0Oo(context, i);
            }
            if (colorStateList2 != null) {
                if (this.OooO00o == null) {
                    this.OooO00o = new WeakHashMap();
                }
                C1236oOoOoO00 c1236oOoOoO002 = (C1236oOoOoO00) this.OooO00o.get(context);
                if (c1236oOoOoO002 == null) {
                    c1236oOoOoO002 = new C1236oOoOoO00();
                    this.OooO00o.put(context, c1236oOoOoO002);
                }
                c1236oOoOoO002.OooO00o(i, colorStateList2);
            }
            colorStateList = colorStateList2;
        }
        return colorStateList;
    }

    public final void OooO00o(String str, C1132oOOooOoo c1132oOOooOoo) {
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new C1218oOoOOoo(0);
        }
        this.OooO0O0.put(str, c1132oOOooOoo);
    }

    public final synchronized void OooO0O0(Context context, long j, Drawable drawable) {
        try {
            Drawable.ConstantState constantState = drawable.getConstantState();
            if (constantState != null) {
                C0832oO0o0o00 c0832oO0o0o00 = (C0832oO0o0o00) this.OooO0Oo.get(context);
                if (c0832oO0o0o00 == null) {
                    c0832oO0o0o00 = new C0832oO0o0o00();
                    this.OooO0Oo.put(context, c0832oO0o0o00);
                }
                c0832oO0o0o00.OooO0oO(j, new WeakReference(constantState));
            }
        } catch (Throwable th) {
            throw th;
        }
    }

    public final Drawable OooO0OO(Context context, int i) {
        int i2;
        if (this.OooO0o0 == null) {
            this.OooO0o0 = new TypedValue();
        }
        TypedValue typedValue = this.OooO0o0;
        context.getResources().getValue(i, typedValue, true);
        long j = (typedValue.assetCookie << 32) | typedValue.data;
        Drawable OooO0o0 = OooO0o0(context, j);
        if (OooO0o0 != null) {
            return OooO0o0;
        }
        LayerDrawable layerDrawable = null;
        if (this.OooO0oO != null) {
            if (i == R.drawable.abc_cab_background_top_material) {
                layerDrawable = new LayerDrawable(new Drawable[]{OooO0o(context, R.drawable.abc_cab_background_internal_bg), OooO0o(context, R.drawable.abc_cab_background_top_mtrl_alpha)});
            } else {
                if (i == R.drawable.abc_ratingbar_material) {
                    i2 = R.dimen.abc_star_big;
                } else if (i == R.drawable.abc_ratingbar_indicator_material) {
                    i2 = R.dimen.abc_star_medium;
                } else if (i == R.drawable.abc_ratingbar_small_material) {
                    i2 = R.dimen.abc_star_small;
                }
                layerDrawable = C0111o000oo0.OooO0OO(this, context, i2);
            }
        }
        if (layerDrawable != null) {
            layerDrawable.setChangingConfigurations(typedValue.changingConfigurations);
            OooO0O0(context, j, layerDrawable);
        }
        return layerDrawable;
    }

    public final synchronized Drawable OooO0o(Context context, int i) {
        return OooO0oO(context, i, false);
    }

    public final synchronized Drawable OooO0o0(Context context, long j) {
        C0832oO0o0o00 c0832oO0o0o00 = (C0832oO0o0o00) this.OooO0Oo.get(context);
        if (c0832oO0o0o00 == null) {
            return null;
        }
        WeakReference weakReference = (WeakReference) c0832oO0o0o00.OooO0Oo(j);
        if (weakReference != null) {
            Drawable.ConstantState constantState = (Drawable.ConstantState) weakReference.get();
            if (constantState != null) {
                return constantState.newDrawable(context.getResources());
            }
            int OooO0o0 = AbstractC0694o0ooooo0.OooO0o0(c0832oO0o0o00.OooO0O0, c0832oO0o0o00.OooO0Oo, j);
            if (OooO0o0 >= 0) {
                Object[] objArr = c0832oO0o0o00.OooO0OO;
                Object obj = objArr[OooO0o0];
                Object obj2 = AbstractC0809oO0OooOO.OooO0oO;
                if (obj != obj2) {
                    objArr[OooO0o0] = obj2;
                    c0832oO0o0o00.OooO00o = true;
                }
            }
        }
        return null;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x004b, code lost:
        if (r11.OooO0O0.get(r0) != null) goto L17;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x0109, code lost:
        r12.setTintMode(r2);
     */
    /* JADX WARN: Removed duplicated region for block: B:52:0x00da A[Catch: all -> 0x00df, TryCatch #1 {all -> 0x00df, blocks: (B:3:0x0001, B:12:0x0026, B:14:0x002b, B:16:0x0031, B:18:0x0037, B:21:0x0045, B:25:0x0057, B:27:0x005b, B:28:0x0062, B:52:0x00da, B:56:0x00e4, B:58:0x00ea, B:60:0x00f0, B:67:0x0109, B:65:0x0105, B:69:0x010f, B:73:0x0126, B:74:0x0149, B:81:0x015c, B:82:0x0180, B:89:0x018d, B:31:0x007c, B:33:0x0080, B:35:0x008c, B:36:0x0094, B:41:0x00a0, B:43:0x00b3, B:46:0x00c0, B:47:0x00c9, B:48:0x00d0, B:50:0x00d3, B:24:0x0050, B:6:0x0007, B:8:0x0012, B:10:0x0016, B:93:0x0193, B:94:0x019c), top: B:98:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00e4 A[Catch: all -> 0x00df, TryCatch #1 {all -> 0x00df, blocks: (B:3:0x0001, B:12:0x0026, B:14:0x002b, B:16:0x0031, B:18:0x0037, B:21:0x0045, B:25:0x0057, B:27:0x005b, B:28:0x0062, B:52:0x00da, B:56:0x00e4, B:58:0x00ea, B:60:0x00f0, B:67:0x0109, B:65:0x0105, B:69:0x010f, B:73:0x0126, B:74:0x0149, B:81:0x015c, B:82:0x0180, B:89:0x018d, B:31:0x007c, B:33:0x0080, B:35:0x008c, B:36:0x0094, B:41:0x00a0, B:43:0x00b3, B:46:0x00c0, B:47:0x00c9, B:48:0x00d0, B:50:0x00d3, B:24:0x0050, B:6:0x0007, B:8:0x0012, B:10:0x0016, B:93:0x0193, B:94:0x019c), top: B:98:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00ea A[Catch: all -> 0x00df, TryCatch #1 {all -> 0x00df, blocks: (B:3:0x0001, B:12:0x0026, B:14:0x002b, B:16:0x0031, B:18:0x0037, B:21:0x0045, B:25:0x0057, B:27:0x005b, B:28:0x0062, B:52:0x00da, B:56:0x00e4, B:58:0x00ea, B:60:0x00f0, B:67:0x0109, B:65:0x0105, B:69:0x010f, B:73:0x0126, B:74:0x0149, B:81:0x015c, B:82:0x0180, B:89:0x018d, B:31:0x007c, B:33:0x0080, B:35:0x008c, B:36:0x0094, B:41:0x00a0, B:43:0x00b3, B:46:0x00c0, B:47:0x00c9, B:48:0x00d0, B:50:0x00d3, B:24:0x0050, B:6:0x0007, B:8:0x0012, B:10:0x0016, B:93:0x0193, B:94:0x019c), top: B:98:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x018d A[Catch: all -> 0x00df, TRY_LEAVE, TryCatch #1 {all -> 0x00df, blocks: (B:3:0x0001, B:12:0x0026, B:14:0x002b, B:16:0x0031, B:18:0x0037, B:21:0x0045, B:25:0x0057, B:27:0x005b, B:28:0x0062, B:52:0x00da, B:56:0x00e4, B:58:0x00ea, B:60:0x00f0, B:67:0x0109, B:65:0x0105, B:69:0x010f, B:73:0x0126, B:74:0x0149, B:81:0x015c, B:82:0x0180, B:89:0x018d, B:31:0x007c, B:33:0x0080, B:35:0x008c, B:36:0x0094, B:41:0x00a0, B:43:0x00b3, B:46:0x00c0, B:47:0x00c9, B:48:0x00d0, B:50:0x00d3, B:24:0x0050, B:6:0x0007, B:8:0x0012, B:10:0x0016, B:93:0x0193, B:94:0x019c), top: B:98:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final synchronized android.graphics.drawable.Drawable OooO0oO(android.content.Context r12, int r13, boolean r14) {
        /*
            Method dump skipped, instructions count: 415
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1135oOOooo00.OooO0oO(android.content.Context, int, boolean):android.graphics.drawable.Drawable");
    }

    public final synchronized void OooOO0O(Context context) {
        C0832oO0o0o00 c0832oO0o0o00 = (C0832oO0o0o00) this.OooO0Oo.get(context);
        if (c0832oO0o0o00 != null) {
            c0832oO0o0o00.OooO0O0();
        }
    }

    public final synchronized void OooOO0o(C0111o000oo0 c0111o000oo0) {
        this.OooO0oO = c0111o000oo0;
    }

    /* JADX WARN: Removed duplicated region for block: B:24:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:38:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOOO0(android.content.Context r7, int r8, android.graphics.drawable.Drawable r9) {
        /*
            r6 = this;
            com.ninja.engine.o000oo0 r0 = r6.OooO0oO
            r1 = 0
            if (r0 == 0) goto L70
            android.graphics.PorterDuff$Mode r2 = com.ninja.engine.C0113o000oo0O.OooO0O0
            int[] r3 = r0.OooO00o
            boolean r3 = com.ninja.engine.C0111o000oo0.OooO00o(r3, r8)
            r4 = 1
            r5 = -1
            if (r3 == 0) goto L17
            r8 = 2130968829(0x7f0400fd, float:1.7546323E38)
        L14:
            r0 = -1
        L15:
            r3 = 1
            goto L51
        L17:
            int[] r3 = r0.OooO0OO
            boolean r3 = com.ninja.engine.C0111o000oo0.OooO00o(r3, r8)
            if (r3 == 0) goto L23
            r8 = 2130968827(0x7f0400fb, float:1.7546319E38)
            goto L14
        L23:
            int[] r0 = r0.OooO0Oo
            boolean r0 = com.ninja.engine.C0111o000oo0.OooO00o(r0, r8)
            r3 = 16842801(0x1010031, float:2.3693695E-38)
            if (r0 == 0) goto L34
            android.graphics.PorterDuff$Mode r2 = android.graphics.PorterDuff.Mode.MULTIPLY
        L30:
            r8 = 16842801(0x1010031, float:2.3693695E-38)
            goto L14
        L34:
            r0 = 2131230799(0x7f08004f, float:1.807766E38)
            if (r8 != r0) goto L48
            r8 = 1109603123(0x42233333, float:40.8)
            int r8 = java.lang.Math.round(r8)
            r0 = 16842800(0x1010030, float:2.3693693E-38)
            r0 = r8
            r8 = 16842800(0x1010030, float:2.3693693E-38)
            goto L15
        L48:
            r0 = 2131230781(0x7f08003d, float:1.8077624E38)
            if (r8 != r0) goto L4e
            goto L30
        L4e:
            r8 = 0
            r0 = -1
            r3 = 0
        L51:
            if (r3 == 0) goto L70
            android.graphics.drawable.Drawable r9 = r9.mutate()
            int r7 = com.ninja.engine.AbstractC1313oOooOo0.OooO0OO(r7, r8)
            java.lang.Class<com.ninja.engine.o000oo0O> r8 = com.ninja.engine.C0113o000oo0O.class
            monitor-enter(r8)
            android.graphics.PorterDuffColorFilter r7 = OooO0oo(r7, r2)     // Catch: java.lang.Throwable -> L6d
            monitor-exit(r8)
            r9.setColorFilter(r7)
            if (r0 == r5) goto L6b
            r9.setAlpha(r0)
        L6b:
            r1 = 1
            goto L70
        L6d:
            r7 = move-exception
            monitor-exit(r8)
            throw r7
        L70:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1135oOOooo00.OooOOO0(android.content.Context, int, android.graphics.drawable.Drawable):boolean");
    }
}
