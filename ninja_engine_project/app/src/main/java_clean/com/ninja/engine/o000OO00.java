package com.ninja.engine;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import java.util.ArrayList;
import java.util.Objects;
/* loaded from: classes.dex */
public abstract class o000OO00 extends androidx.activity.OooO00o implements o000OOO {
    public boolean OooOo0;
    public boolean OooOo00;
    public LayoutInflater$Factory2C0109o000oOoo OooOo0o;
    public final C0331o0O0oo OooOOo = new C0331o0O0oo(13, new C0589o0oOoOO0(this));
    public final androidx.lifecycle.OooO00o OooOOoo = new androidx.lifecycle.OooO00o(this);
    public boolean OooOo0O = true;

    public o000OO00() {
        ((C0086o000Oo00) this.OooO0o0.OooO0Oo).OooO0o0("android:support:lifecycle", new o0O0OOO(1, this));
        OooO0oo(new InterfaceC0319o0O0o0oo(this) { // from class: com.ninja.engine.o0oOoO
            public final /* synthetic */ o000OO00 OooO0O0;

            {
                this.OooO0O0 = this;
            }

            @Override // com.ninja.engine.InterfaceC0319o0O0o0oo
            public final void OooO00o(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        this.OooO0O0.OooOOo.OooOoOO();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        this.OooO0O0.OooOOo.OooOoOO();
                        return;
                }
            }
        });
        this.OooOOO0.add(new InterfaceC0319o0O0o0oo(this) { // from class: com.ninja.engine.o0oOoO
            public final /* synthetic */ o000OO00 OooO0O0;

            {
                this.OooO0O0 = this;
            }

            @Override // com.ninja.engine.InterfaceC0319o0O0o0oo
            public final void OooO00o(Object obj) {
                switch (r2) {
                    case 0:
                        Configuration configuration = (Configuration) obj;
                        this.OooO0O0.OooOOo.OooOoOO();
                        return;
                    default:
                        Intent intent = (Intent) obj;
                        this.OooO0O0.OooOOo.OooOoOO();
                        return;
                }
            }
        });
        OooO(new o0O0OOOo(this, 1));
        ((C0086o000Oo00) this.OooO0o0.OooO0Oo).OooO0o0("androidx:appcompat", new C0082o000O0oo(this));
        OooO(new o000O(this));
    }

    public static boolean OooOo0O(C0606o0oOoooO c0606o0oOoooO) {
        o000OO00 o000oo00;
        boolean z = false;
        for (AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 : c0606o0oOoooO.OooO0OO.OooOo00()) {
            if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
                C0589o0oOoOO0 c0589o0oOoOO0 = abstractComponentCallbacksC0593o0oOoOo0.OooOOoo;
                if (c0589o0oOoOO0 == null) {
                    o000oo00 = null;
                } else {
                    o000oo00 = c0589o0oOoOO0.Oooo0O0;
                }
                if (o000oo00 != null) {
                    z |= OooOo0O(abstractComponentCallbacksC0593o0oOoOo0.OooO0oo());
                }
                C0622o0oo0OO c0622o0oo0OO = abstractComponentCallbacksC0593o0oOoOo0.Oooo0oo;
                EnumC0759oO0O0o enumC0759oO0O0o = EnumC0759oO0O0o.OooO0Oo;
                if (c0622o0oo0OO != null) {
                    c0622o0oo0OO.OooO0o();
                    if (c0622o0oo0OO.OooO0OO.OooO0OO.compareTo(enumC0759oO0O0o) >= 0) {
                        abstractComponentCallbacksC0593o0oOoOo0.Oooo0oo.OooO0OO.OooO0oO();
                        z = true;
                    }
                }
                if (abstractComponentCallbacksC0593o0oOoOo0.Oooo0oO.OooO0OO.compareTo(enumC0759oO0O0o) >= 0) {
                    abstractComponentCallbacksC0593o0oOoOo0.Oooo0oO.OooO0oO();
                    z = true;
                }
            }
        }
        return z;
    }

    public final AbstractC0094o000OooO OooOOoo() {
        if (this.OooOo0o == null) {
            ExecutorC0091o000OoOo executorC0091o000OoOo = AbstractC0094o000OooO.OooO00o;
            this.OooOo0o = new LayoutInflater$Factory2C0109o000oOoo(this, null, this, this);
        }
        return this.OooOo0o;
    }

    public final boolean OooOo(int i, MenuItem menuItem) {
        if (super.onMenuItemSelected(i, menuItem)) {
            return true;
        }
        if (i == 6) {
            return ((C0589o0oOoOO0) this.OooOOo.OooO0O0).Oooo0.OooO();
        }
        return false;
    }

    public final void OooOo0() {
        AbstractC1091oOOoOOOO.OooOooo(getWindow().getDecorView(), this);
        View decorView = getWindow().getDecorView();
        AbstractC0809oO0OooOO.OooOOOo(decorView, "<this>");
        decorView.setTag(R.id.view_tree_view_model_store_owner, this);
        AbstractC1137oOOoooO.OooOO0o(getWindow().getDecorView(), this);
        AbstractC1094oOOoOOo0.OooOOoo(getWindow().getDecorView(), this);
    }

    public final C0606o0oOoooO OooOo00() {
        return ((C0589o0oOoOO0) this.OooOOo.OooO0O0).Oooo0;
    }

    public final void OooOo0o() {
        super.onDestroy();
        ((C0589o0oOoOO0) this.OooOOo.OooO0O0).Oooo0.OooOO0O();
        this.OooOOoo.OooO0Oo(oO0O0O0o.ON_DESTROY);
    }

    public final void OooOoO() {
        C0331o0O0oo c0331o0O0oo = this.OooOOo;
        c0331o0O0oo.OooOoOO();
        super.onStart();
        this.OooOo0O = false;
        boolean z = this.OooOo00;
        C0589o0oOoOO0 c0589o0oOoOO0 = (C0589o0oOoOO0) c0331o0O0oo.OooO0O0;
        if (!z) {
            this.OooOo00 = true;
            C0606o0oOoooO c0606o0oOoooO = c0589o0oOoOO0.Oooo0;
            c0606o0oOoooO.OooOooo = false;
            c0606o0oOoooO.Oooo000 = false;
            c0606o0oOoooO.Oooo0o0.OooO0oo = false;
            c0606o0oOoooO.OooOo00(4);
        }
        c0589o0oOoOO0.Oooo0.OooOo(true);
        this.OooOOoo.OooO0Oo(oO0O0O0o.ON_START);
        C0606o0oOoooO c0606o0oOoooO2 = c0589o0oOoOO0.Oooo0;
        c0606o0oOoooO2.OooOooo = false;
        c0606o0oOoooO2.Oooo000 = false;
        c0606o0oOoooO2.Oooo0o0.OooO0oo = false;
        c0606o0oOoooO2.OooOo00(5);
    }

    public final void OooOoO0() {
        super.onPostResume();
        this.OooOOoo.OooO0Oo(oO0O0O0o.ON_RESUME);
        C0606o0oOoooO c0606o0oOoooO = ((C0589o0oOoOO0) this.OooOOo.OooO0O0).Oooo0;
        c0606o0oOoooO.OooOooo = false;
        c0606o0oOoooO.Oooo000 = false;
        c0606o0oOoooO.Oooo0o0.OooO0oo = false;
        c0606o0oOoooO.OooOo00(7);
    }

    public final void OooOoOO() {
        super.onStop();
        this.OooOo0O = true;
        do {
        } while (OooOo0O(OooOo00()));
        C0606o0oOoooO c0606o0oOoooO = ((C0589o0oOoOO0) this.OooOOo.OooO0O0).Oooo0;
        c0606o0oOoooO.Oooo000 = true;
        c0606o0oOoooO.Oooo0o0.OooO0oo = true;
        c0606o0oOoooO.OooOo00(4);
        this.OooOOoo.OooO0Oo(oO0O0O0o.ON_STOP);
    }

    @Override // android.app.Activity
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        OooOo0();
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooOOoo();
        layoutInflater$Factory2C0109o000oOoo.OooOo00();
        ((ViewGroup) layoutInflater$Factory2C0109o000oOoo.OooOoOO.findViewById(16908290)).addView(view, layoutParams);
        layoutInflater$Factory2C0109o000oOoo.OooOOO0.OooO00o(layoutInflater$Factory2C0109o000oOoo.OooOO0o.getCallback());
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public void attachBaseContext(Context context) {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8;
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooOOoo();
        layoutInflater$Factory2C0109o000oOoo.Oooo0oo = true;
        int i9 = layoutInflater$Factory2C0109o000oOoo.OoooO0O;
        if (i9 == -100) {
            i9 = AbstractC0094o000OooO.OooO0O0;
        }
        int OooOoo0 = layoutInflater$Factory2C0109o000oOoo.OooOoo0(context, i9);
        if (AbstractC0094o000OooO.OooO0O0(context) && AbstractC0094o000OooO.OooO0O0(context)) {
            if (Build.VERSION.SDK_INT >= 33) {
                if (!AbstractC0094o000OooO.OooO0o) {
                    AbstractC0094o000OooO.OooO00o.execute(new RunnableC0087o000Oo0O(context, 0));
                }
            } else {
                synchronized (AbstractC0094o000OooO.OooO) {
                    try {
                        C0798oO0OoOO c0798oO0OoOO = AbstractC0094o000OooO.OooO0OO;
                        if (c0798oO0OoOO == null) {
                            if (AbstractC0094o000OooO.OooO0Oo == null) {
                                AbstractC0094o000OooO.OooO0Oo = C0798oO0OoOO.OooO0O0(AbstractC0694o0ooooo0.Oooo0o(context));
                            }
                            if (!AbstractC0094o000OooO.OooO0Oo.OooO00o.isEmpty()) {
                                AbstractC0094o000OooO.OooO0OO = AbstractC0094o000OooO.OooO0Oo;
                            }
                        } else if (!c0798oO0OoOO.equals(AbstractC0094o000OooO.OooO0Oo)) {
                            C0798oO0OoOO c0798oO0OoOO2 = AbstractC0094o000OooO.OooO0OO;
                            AbstractC0094o000OooO.OooO0Oo = c0798oO0OoOO2;
                            AbstractC0694o0ooooo0.Oooo0O0(context, c0798oO0OoOO2.OooO00o.OooO00o());
                        }
                    } finally {
                    }
                }
            }
        }
        C0798oO0OoOO OooOOO0 = LayoutInflater$Factory2C0109o000oOoo.OooOOO0(context);
        Configuration configuration = null;
        if (context instanceof ContextThemeWrapper) {
            try {
                ((ContextThemeWrapper) context).applyOverrideConfiguration(LayoutInflater$Factory2C0109o000oOoo.OooOOo0(context, OooOoo0, OooOOO0, null, false));
            } catch (IllegalStateException unused) {
            }
            super.attachBaseContext(context);
        }
        if (context instanceof o0O0oo00) {
            try {
                ((o0O0oo00) context).OooO00o(LayoutInflater$Factory2C0109o000oOoo.OooOOo0(context, OooOoo0, OooOOO0, null, false));
            } catch (IllegalStateException unused2) {
            }
            super.attachBaseContext(context);
        }
        if (LayoutInflater$Factory2C0109o000oOoo.Ooooooo) {
            Configuration configuration2 = new Configuration();
            configuration2.uiMode = -1;
            configuration2.fontScale = 0.0f;
            Configuration configuration3 = context.createConfigurationContext(configuration2).getResources().getConfiguration();
            Configuration configuration4 = context.getResources().getConfiguration();
            configuration3.uiMode = configuration4.uiMode;
            if (!configuration3.equals(configuration4)) {
                configuration = new Configuration();
                configuration.fontScale = 0.0f;
                if (configuration3.diff(configuration4) != 0) {
                    float f = configuration3.fontScale;
                    float f2 = configuration4.fontScale;
                    if (f != f2) {
                        configuration.fontScale = f2;
                    }
                    int i10 = configuration3.mcc;
                    int i11 = configuration4.mcc;
                    if (i10 != i11) {
                        configuration.mcc = i11;
                    }
                    int i12 = configuration3.mnc;
                    int i13 = configuration4.mnc;
                    if (i12 != i13) {
                        configuration.mnc = i13;
                    }
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 24) {
                        AbstractC2054oooo00o.OooO00o(configuration3, configuration4, configuration);
                    } else if (!Objects.equals(configuration3.locale, configuration4.locale)) {
                        configuration.locale = configuration4.locale;
                    }
                    int i15 = configuration3.touchscreen;
                    int i16 = configuration4.touchscreen;
                    if (i15 != i16) {
                        configuration.touchscreen = i16;
                    }
                    int i17 = configuration3.keyboard;
                    int i18 = configuration4.keyboard;
                    if (i17 != i18) {
                        configuration.keyboard = i18;
                    }
                    int i19 = configuration3.keyboardHidden;
                    int i20 = configuration4.keyboardHidden;
                    if (i19 != i20) {
                        configuration.keyboardHidden = i20;
                    }
                    int i21 = configuration3.navigation;
                    int i22 = configuration4.navigation;
                    if (i21 != i22) {
                        configuration.navigation = i22;
                    }
                    int i23 = configuration3.navigationHidden;
                    int i24 = configuration4.navigationHidden;
                    if (i23 != i24) {
                        configuration.navigationHidden = i24;
                    }
                    int i25 = configuration3.orientation;
                    int i26 = configuration4.orientation;
                    if (i25 != i26) {
                        configuration.orientation = i26;
                    }
                    int i27 = configuration3.screenLayout & 15;
                    int i28 = configuration4.screenLayout & 15;
                    if (i27 != i28) {
                        configuration.screenLayout |= i28;
                    }
                    int i29 = configuration3.screenLayout & 192;
                    int i30 = configuration4.screenLayout & 192;
                    if (i29 != i30) {
                        configuration.screenLayout |= i30;
                    }
                    int i31 = configuration3.screenLayout & 48;
                    int i32 = configuration4.screenLayout & 48;
                    if (i31 != i32) {
                        configuration.screenLayout |= i32;
                    }
                    int i33 = configuration3.screenLayout & 768;
                    int i34 = configuration4.screenLayout & 768;
                    if (i33 != i34) {
                        configuration.screenLayout |= i34;
                    }
                    if (i14 >= 26) {
                        i = configuration3.colorMode;
                        int i35 = i & 3;
                        i2 = configuration4.colorMode;
                        if (i35 != (i2 & 3)) {
                            i7 = configuration.colorMode;
                            i8 = configuration4.colorMode;
                            configuration.colorMode = i7 | (i8 & 3);
                        }
                        i3 = configuration3.colorMode;
                        int i36 = i3 & 12;
                        i4 = configuration4.colorMode;
                        if (i36 != (i4 & 12)) {
                            i5 = configuration.colorMode;
                            i6 = configuration4.colorMode;
                            configuration.colorMode = i5 | (i6 & 12);
                        }
                    }
                    int i37 = configuration3.uiMode & 15;
                    int i38 = configuration4.uiMode & 15;
                    if (i37 != i38) {
                        configuration.uiMode |= i38;
                    }
                    int i39 = configuration3.uiMode & 48;
                    int i40 = configuration4.uiMode & 48;
                    if (i39 != i40) {
                        configuration.uiMode |= i40;
                    }
                    int i41 = configuration3.screenWidthDp;
                    int i42 = configuration4.screenWidthDp;
                    if (i41 != i42) {
                        configuration.screenWidthDp = i42;
                    }
                    int i43 = configuration3.screenHeightDp;
                    int i44 = configuration4.screenHeightDp;
                    if (i43 != i44) {
                        configuration.screenHeightDp = i44;
                    }
                    int i45 = configuration3.smallestScreenWidthDp;
                    int i46 = configuration4.smallestScreenWidthDp;
                    if (i45 != i46) {
                        configuration.smallestScreenWidthDp = i46;
                    }
                    int i47 = configuration3.densityDpi;
                    int i48 = configuration4.densityDpi;
                    if (i47 != i48) {
                        configuration.densityDpi = i48;
                    }
                }
            }
            Configuration OooOOo0 = LayoutInflater$Factory2C0109o000oOoo.OooOOo0(context, OooOoo0, OooOOO0, configuration, true);
            o0O0oo00 o0o0oo00 = new o0O0oo00(context, 2131952157);
            o0o0oo00.OooO00o(OooOOo0);
            try {
                if (context.getTheme() != null) {
                    AbstractC1091oOOoOOOO.OooOoo(o0o0oo00.getTheme());
                }
            } catch (NullPointerException unused3) {
            }
            context = o0o0oo00;
        }
        super.attachBaseContext(context);
    }

    @Override // android.app.Activity
    public final void closeOptionsMenu() {
        ((LayoutInflater$Factory2C0109o000oOoo) OooOOoo()).OooOoO();
        if (getWindow().hasFeature(0)) {
            super.closeOptionsMenu();
        }
    }

    @Override // com.ninja.engine.AbstractActivityC0301o0O0Oo0, android.app.Activity, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        keyEvent.getKeyCode();
        ((LayoutInflater$Factory2C0109o000oOoo) OooOOoo()).OooOoO();
        return super.dispatchKeyEvent(keyEvent);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0022, code lost:
        if (android.os.Build.VERSION.SDK_INT < 26) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0024, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0033, code lost:
        if (android.os.Build.VERSION.SDK_INT < 29) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x003c, code lost:
        if (r2.equals("--list-dumpables") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0045, code lost:
        if (r2.equals("--dump-dumpable") == false) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x004c, code lost:
        if (android.os.Build.VERSION.SDK_INT < 33) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x005c, code lost:
        if (android.os.Build.VERSION.SDK_INT < 31) goto L26;
     */
    @Override // android.app.Activity
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void dump(java.lang.String r5, java.io.FileDescriptor r6, java.io.PrintWriter r7, java.lang.String[] r8) {
        /*
            r4 = this;
            super.dump(r5, r6, r7, r8)
            r0 = 1
            r1 = 0
            if (r8 == 0) goto L5f
            int r2 = r8.length
            if (r2 != 0) goto Lb
            goto L5f
        Lb:
            r2 = r8[r1]
            int r3 = r2.hashCode()
            switch(r3) {
                case -645125871: goto L4f;
                case 100470631: goto L3f;
                case 472614934: goto L36;
                case 1159329357: goto L26;
                case 1455016274: goto L15;
                default: goto L14;
            }
        L14:
            goto L5f
        L15:
            java.lang.String r3 = "--autofill"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L1e
            goto L5f
        L1e:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 26
            if (r2 < r3) goto L5f
        L24:
            r1 = 1
            goto L5f
        L26:
            java.lang.String r3 = "--contentcapture"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L2f
            goto L5f
        L2f:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 29
            if (r2 < r3) goto L5f
            goto L24
        L36:
            java.lang.String r3 = "--list-dumpables"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L48
            goto L5f
        L3f:
            java.lang.String r3 = "--dump-dumpable"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L48
            goto L5f
        L48:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 33
            if (r2 < r3) goto L5f
            goto L24
        L4f:
            java.lang.String r3 = "--translation"
            boolean r2 = r2.equals(r3)
            if (r2 != 0) goto L58
            goto L5f
        L58:
            int r2 = android.os.Build.VERSION.SDK_INT
            r3 = 31
            if (r2 < r3) goto L5f
            goto L24
        L5f:
            r0 = r0 ^ r1
            if (r0 != 0) goto L63
            return
        L63:
            r7.print(r5)
            java.lang.String r0 = "Local FragmentActivity "
            r7.print(r0)
            int r0 = java.lang.System.identityHashCode(r4)
            java.lang.String r0 = java.lang.Integer.toHexString(r0)
            r7.print(r0)
            java.lang.String r0 = " State:"
            r7.println(r0)
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            r0.<init>()
            r0.append(r5)
            java.lang.String r1 = "  "
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            r7.print(r0)
            java.lang.String r1 = "mCreated="
            r7.print(r1)
            boolean r1 = r4.OooOo00
            r7.print(r1)
            java.lang.String r1 = " mResumed="
            r7.print(r1)
            boolean r1 = r4.OooOo0
            r7.print(r1)
            java.lang.String r1 = " mStopped="
            r7.print(r1)
            boolean r1 = r4.OooOo0O
            r7.print(r1)
            android.app.Application r1 = r4.getApplication()
            if (r1 == 0) goto Lba
            com.ninja.engine.o0Oo0O0O r1 = com.ninja.engine.C0415o0Oo0O0O.OooOoo(r4)
            r1.OooOo(r0, r7)
        Lba:
            com.ninja.engine.o0O0oo r0 = r4.OooOOo
            java.lang.Object r0 = r0.OooO0O0
            com.ninja.engine.o0oOoOO0 r0 = (com.ninja.engine.C0589o0oOoOO0) r0
            com.ninja.engine.o0oOoooO r0 = r0.Oooo0
            r0.OooOo0(r5, r6, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o000OO00.dump(java.lang.String, java.io.FileDescriptor, java.io.PrintWriter, java.lang.String[]):void");
    }

    @Override // android.app.Activity
    public final View findViewById(int i) {
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooOOoo();
        layoutInflater$Factory2C0109o000oOoo.OooOo00();
        return layoutInflater$Factory2C0109o000oOoo.OooOO0o.findViewById(i);
    }

    @Override // android.app.Activity
    public final MenuInflater getMenuInflater() {
        Context context;
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooOOoo();
        if (layoutInflater$Factory2C0109o000oOoo.OooOOOo == null) {
            layoutInflater$Factory2C0109o000oOoo.OooOoO();
            C1511oo0OOoo0 c1511oo0OOoo0 = layoutInflater$Factory2C0109o000oOoo.OooOOOO;
            if (c1511oo0OOoo0 != null) {
                context = c1511oo0OOoo0.OoooOOO();
            } else {
                context = layoutInflater$Factory2C0109o000oOoo.OooOO0O;
            }
            layoutInflater$Factory2C0109o000oOoo.OooOOOo = new C1271oOoo0OOO(context);
        }
        return layoutInflater$Factory2C0109o000oOoo.OooOOOo;
    }

    @Override // android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final Resources getResources() {
        int i = AbstractC1430oo00oOOO.OooO00o;
        return super.getResources();
    }

    @Override // android.app.Activity
    public final void invalidateOptionsMenu() {
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooOOoo();
        if (layoutInflater$Factory2C0109o000oOoo.OooOOOO != null) {
            layoutInflater$Factory2C0109o000oOoo.OooOoO();
            layoutInflater$Factory2C0109o000oOoo.OooOOOO.getClass();
            layoutInflater$Factory2C0109o000oOoo.OooOoOO(0);
        }
    }

    @Override // androidx.activity.OooO00o, android.app.Activity
    public final void onActivityResult(int i, int i2, Intent intent) {
        this.OooOOo.OooOoOO();
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.activity.OooO00o, android.app.Activity, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooOOoo();
        if (layoutInflater$Factory2C0109o000oOoo.Oooo000 && layoutInflater$Factory2C0109o000oOoo.OooOoO) {
            layoutInflater$Factory2C0109o000oOoo.OooOoO();
            C1511oo0OOoo0 c1511oo0OOoo0 = layoutInflater$Factory2C0109o000oOoo.OooOOOO;
            if (c1511oo0OOoo0 != null) {
                c1511oo0OOoo0.OoooOoO(c1511oo0OOoo0.OooOo00.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            }
        }
        C0113o000oo0O OooO00o = C0113o000oo0O.OooO00o();
        Context context = layoutInflater$Factory2C0109o000oOoo.OooOO0O;
        synchronized (OooO00o) {
            OooO00o.OooO00o.OooOO0O(context);
        }
        layoutInflater$Factory2C0109o000oOoo.OoooO0 = new Configuration(layoutInflater$Factory2C0109o000oOoo.OooOO0O.getResources().getConfiguration());
        layoutInflater$Factory2C0109o000oOoo.OooOO0O(false, false);
    }

    @Override // androidx.activity.OooO00o, com.ninja.engine.AbstractActivityC0301o0O0Oo0, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.OooOOoo.OooO0Oo(oO0O0O0o.ON_CREATE);
        C0606o0oOoooO c0606o0oOoooO = ((C0589o0oOoOO0) this.OooOOo.OooO0O0).Oooo0;
        c0606o0oOoooO.OooOooo = false;
        c0606o0oOoooO.Oooo000 = false;
        c0606o0oOoooO.Oooo0o0.OooO0oo = false;
        c0606o0oOoooO.OooOo00(1);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory2
    public final View onCreateView(View view, String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0589o0oOoOO0) this.OooOOo.OooO0O0).Oooo0.OooO0o.onCreateView(view, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(view, str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity
    public final void onDestroy() {
        OooOo0o();
        OooOOoo().OooO0Oo();
    }

    @Override // android.app.Activity, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        Window window;
        if (Build.VERSION.SDK_INT < 26 && !keyEvent.isCtrlPressed() && !KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState()) && keyEvent.getRepeatCount() == 0 && !KeyEvent.isModifierKey(keyEvent.getKeyCode()) && (window = getWindow()) != null && window.getDecorView() != null && window.getDecorView().dispatchKeyShortcutEvent(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // androidx.activity.OooO00o, android.app.Activity, android.view.Window.Callback
    public final boolean onMenuItemSelected(int i, MenuItem menuItem) {
        Intent OooOoO0;
        if (OooOo(i, menuItem)) {
            return true;
        }
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooOOoo();
        layoutInflater$Factory2C0109o000oOoo.OooOoO();
        C1511oo0OOoo0 c1511oo0OOoo0 = layoutInflater$Factory2C0109o000oOoo.OooOOOO;
        if (menuItem.getItemId() == 16908332 && c1511oo0OOoo0 != null && (((C1339oOoooOO0) c1511oo0OOoo0.OooOo).OooO0O0 & 4) != 0 && (OooOoO0 = AbstractC0692o0ooooOo.OooOoO0(this)) != null) {
            if (shouldUpRecreateTask(OooOoO0)) {
                ArrayList arrayList = new ArrayList();
                Intent OooOoO02 = AbstractC0692o0ooooOo.OooOoO0(this);
                if (OooOoO02 == null) {
                    OooOoO02 = AbstractC0692o0ooooOo.OooOoO0(this);
                }
                if (OooOoO02 != null) {
                    ComponentName component = OooOoO02.getComponent();
                    if (component == null) {
                        component = OooOoO02.resolveActivity(getPackageManager());
                    }
                    int size = arrayList.size();
                    while (true) {
                        try {
                            Intent OooOoO = AbstractC0692o0ooooOo.OooOoO(this, component);
                            if (OooOoO == null) {
                                break;
                            }
                            arrayList.add(size, OooOoO);
                            component = OooOoO.getComponent();
                        } catch (PackageManager.NameNotFoundException e) {
                            throw new IllegalArgumentException(e);
                        }
                    }
                    arrayList.add(OooOoO02);
                }
                if (!arrayList.isEmpty()) {
                    Intent[] intentArr = (Intent[]) arrayList.toArray(new Intent[0]);
                    intentArr[0] = new Intent(intentArr[0]).addFlags(268484608);
                    startActivities(intentArr, null);
                    try {
                        finishAffinity();
                        return true;
                    } catch (IllegalStateException unused) {
                        finish();
                        return true;
                    }
                }
                throw new IllegalStateException("No intents added to TaskStackBuilder; cannot startActivities");
            }
            navigateUpTo(OooOoO0);
            return true;
        }
        return false;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean onMenuOpened(int i, Menu menu) {
        return super.onMenuOpened(i, menu);
    }

    @Override // androidx.activity.OooO00o, android.app.Activity, android.view.Window.Callback
    public final void onPanelClosed(int i, Menu menu) {
        super.onPanelClosed(i, menu);
    }

    @Override // android.app.Activity
    public final void onPause() {
        super.onPause();
        this.OooOo0 = false;
        ((C0589o0oOoOO0) this.OooOOo.OooO0O0).Oooo0.OooOo00(5);
        this.OooOOoo.OooO0Oo(oO0O0O0o.ON_PAUSE);
    }

    @Override // android.app.Activity
    public final void onPostCreate(Bundle bundle) {
        super.onPostCreate(bundle);
        ((LayoutInflater$Factory2C0109o000oOoo) OooOOoo()).OooOo00();
    }

    @Override // android.app.Activity
    public final void onPostResume() {
        OooOoO0();
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooOOoo();
        layoutInflater$Factory2C0109o000oOoo.OooOoO();
        C1511oo0OOoo0 c1511oo0OOoo0 = layoutInflater$Factory2C0109o000oOoo.OooOOOO;
        if (c1511oo0OOoo0 != null) {
            c1511oo0OOoo0.Oooo0o = true;
        }
    }

    @Override // androidx.activity.OooO00o, android.app.Activity
    public final void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        this.OooOOo.OooOoOO();
        super.onRequestPermissionsResult(i, strArr, iArr);
    }

    @Override // android.app.Activity
    public void onResume() {
        C0331o0O0oo c0331o0O0oo = this.OooOOo;
        c0331o0O0oo.OooOoOO();
        super.onResume();
        this.OooOo0 = true;
        ((C0589o0oOoOO0) c0331o0O0oo.OooO0O0).Oooo0.OooOo(true);
    }

    @Override // android.app.Activity
    public final void onStart() {
        OooOoO();
        ((LayoutInflater$Factory2C0109o000oOoo) OooOOoo()).OooOO0O(true, false);
    }

    @Override // android.app.Activity
    public final void onStateNotSaved() {
        this.OooOOo.OooOoOO();
    }

    @Override // android.app.Activity
    public final void onStop() {
        OooOoOO();
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooOOoo();
        layoutInflater$Factory2C0109o000oOoo.OooOoO();
        C1511oo0OOoo0 c1511oo0OOoo0 = layoutInflater$Factory2C0109o000oOoo.OooOOOO;
        if (c1511oo0OOoo0 != null) {
            c1511oo0OOoo0.Oooo0o = false;
            C1471oo0O0Ooo c1471oo0O0Ooo = c1511oo0OOoo0.Oooo0o0;
            if (c1471oo0O0Ooo != null) {
                c1471oo0O0Ooo.OooO00o();
            }
        }
    }

    @Override // android.app.Activity
    public final void onTitleChanged(CharSequence charSequence, int i) {
        super.onTitleChanged(charSequence, i);
        OooOOoo().OooOO0(charSequence);
    }

    @Override // android.app.Activity
    public final void openOptionsMenu() {
        ((LayoutInflater$Factory2C0109o000oOoo) OooOOoo()).OooOoO();
        if (getWindow().hasFeature(0)) {
            super.openOptionsMenu();
        }
    }

    @Override // android.app.Activity
    public final void setContentView(int i) {
        OooOo0();
        OooOOoo().OooO0oO(i);
    }

    @Override // android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper, android.content.Context
    public final void setTheme(int i) {
        super.setTheme(i);
        ((LayoutInflater$Factory2C0109o000oOoo) OooOOoo()).OoooO = i;
    }

    @Override // androidx.activity.OooO00o, android.app.Activity
    public void setContentView(View view) {
        OooOo0();
        OooOOoo().OooO0oo(view);
    }

    @Override // android.app.Activity
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        OooOo0();
        OooOOoo().OooO(view, layoutParams);
    }

    @Override // android.app.Activity, android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        View onCreateView = ((C0589o0oOoOO0) this.OooOOo.OooO0O0).Oooo0.OooO0o.onCreateView(null, str, context, attributeSet);
        return onCreateView == null ? super.onCreateView(str, context, attributeSet) : onCreateView;
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final void onContentChanged() {
    }
}


