package com.ninja.engine;

import android.app.Activity;
import android.app.Dialog;
import android.app.UiModeManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.AndroidRuntimeException;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.ContentFrameLayout;
import androidx.appcompat.widget.Toolbar;
import java.lang.ref.WeakReference;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o000oOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class LayoutInflater$Factory2C0109o000oOoo extends AbstractC0094o000OooO implements InterfaceC0886oO0oo0o0, LayoutInflater.Factory2 {
    public static final C1218oOoOOoo Oooooo = new C1218oOoOOoo(0);
    public static final int[] OoooooO = {16842836};
    public static final boolean Ooooooo = !"robolectric".equals(Build.FINGERPRINT);
    public final Object OooOO0;
    public final Context OooOO0O;
    public Window OooOO0o;
    public final o000OOO OooOOO;
    public Window$CallbackC0102o000o0OO OooOOO0;
    public C1511oo0OOoo0 OooOOOO;
    public C1271oOoo0OOO OooOOOo;
    public InterfaceC0356o0OOO0o0 OooOOo;
    public CharSequence OooOOo0;
    public C0097o000o000 OooOOoo;
    public RunnableC0095o000Oooo OooOo;
    public o00000O OooOo0;
    public C0096o000o00 OooOo00;
    public ActionBarContextView OooOo0O;
    public PopupWindow OooOo0o;
    public boolean OooOoO;
    public ViewGroup OooOoOO;
    public View OooOoo;
    public TextView OooOoo0;
    public boolean OooOooO;
    public boolean OooOooo;
    public boolean Oooo;
    public boolean Oooo0;
    public boolean Oooo000;
    public boolean Oooo00O;
    public boolean Oooo00o;
    public boolean Oooo0O0;
    public boolean Oooo0OO;
    public C0107o000o0oo Oooo0o;
    public C0107o000o0oo[] Oooo0o0;
    public boolean Oooo0oO;
    public boolean Oooo0oo;
    public int OoooO;
    public Configuration OoooO0;
    public boolean OoooO00;
    public final int OoooO0O;
    public int OoooOO0;
    public C0103o000o0Oo OoooOOO;
    public C0103o000o0Oo OoooOOo;
    public boolean OoooOo0;
    public int OoooOoO;
    public boolean Ooooo00;
    public Rect Ooooo0o;
    public Rect OooooO0;
    public C0135o00O0o0o OooooOO;
    public OnBackInvokedDispatcher OooooOo;
    public OnBackInvokedCallback Oooooo0;
    public boolean o000oOoO;
    public C1470oo0O0OoO OooOoO0 = null;
    public final RunnableC0095o000Oooo OoooOoo = new RunnableC0095o000Oooo(this, 0);

    public LayoutInflater$Factory2C0109o000oOoo(Context context, Window window, o000OOO o000ooo, Object obj) {
        o000OO00 o000oo00 = null;
        this.OoooO0O = -100;
        this.OooOO0O = context;
        this.OooOOO = o000ooo;
        this.OooOO0 = obj;
        if (obj instanceof Dialog) {
            while (true) {
                if (context != null) {
                    if (context instanceof o000OO00) {
                        o000oo00 = (o000OO00) context;
                        break;
                    } else if (!(context instanceof ContextWrapper)) {
                        break;
                    } else {
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                } else {
                    break;
                }
            }
            if (o000oo00 != null) {
                this.OoooO0O = ((LayoutInflater$Factory2C0109o000oOoo) o000oo00.OooOOoo()).OoooO0O;
            }
        }
        if (this.OoooO0O == -100) {
            C1218oOoOOoo c1218oOoOOoo = Oooooo;
            Integer num = (Integer) c1218oOoOOoo.get(this.OooOO0.getClass().getName());
            if (num != null) {
                this.OoooO0O = num.intValue();
                c1218oOoOOoo.remove(this.OooOO0.getClass().getName());
            }
        }
        if (window != null) {
            OooOO0o(window);
        }
        C0113o000oo0O.OooO0Oo();
    }

    public static C0798oO0OoOO OooOOO0(Context context) {
        C0798oO0OoOO c0798oO0OoOO;
        C0798oO0OoOO OooO0O0;
        Locale locale;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33 || (c0798oO0OoOO = AbstractC0094o000OooO.OooO0OO) == null) {
            return null;
        }
        C0798oO0OoOO OooOo = OooOo(context.getApplicationContext().getResources().getConfiguration());
        InterfaceC0803oO0Ooo interfaceC0803oO0Ooo = c0798oO0OoOO.OooO00o;
        if (i >= 24) {
            if (interfaceC0803oO0Ooo.isEmpty()) {
                OooO0O0 = C0798oO0OoOO.OooO0O0;
            } else {
                LinkedHashSet linkedHashSet = new LinkedHashSet();
                for (int i2 = 0; i2 < OooOo.OooO00o.size() + interfaceC0803oO0Ooo.size(); i2++) {
                    if (i2 < interfaceC0803oO0Ooo.size()) {
                        locale = interfaceC0803oO0Ooo.get(i2);
                    } else {
                        locale = OooOo.OooO00o.get(i2 - interfaceC0803oO0Ooo.size());
                    }
                    if (locale != null) {
                        linkedHashSet.add(locale);
                    }
                }
                OooO0O0 = C0798oO0OoOO.OooO00o((Locale[]) linkedHashSet.toArray(new Locale[linkedHashSet.size()]));
            }
        } else if (interfaceC0803oO0Ooo.isEmpty()) {
            OooO0O0 = C0798oO0OoOO.OooO0O0;
        } else {
            OooO0O0 = C0798oO0OoOO.OooO0O0(AbstractC0099o000o00o.OooO0O0(interfaceC0803oO0Ooo.get(0)));
        }
        if (!OooO0O0.OooO00o.isEmpty()) {
            return OooO0O0;
        }
        return OooOo;
    }

    public static Configuration OooOOo0(Context context, int i, C0798oO0OoOO c0798oO0OoOO, Configuration configuration, boolean z) {
        int i2;
        if (i != 1) {
            if (i != 2) {
                if (z) {
                    i2 = 0;
                } else {
                    i2 = context.getApplicationContext().getResources().getConfiguration().uiMode & 48;
                }
            } else {
                i2 = 32;
            }
        } else {
            i2 = 16;
        }
        Configuration configuration2 = new Configuration();
        configuration2.fontScale = 0.0f;
        if (configuration != null) {
            configuration2.setTo(configuration);
        }
        configuration2.uiMode = i2 | (configuration2.uiMode & (-49));
        if (c0798oO0OoOO != null) {
            if (Build.VERSION.SDK_INT >= 24) {
                AbstractC2054oooo00o.OooO0Oo(configuration2, c0798oO0OoOO);
            } else {
                InterfaceC0803oO0Ooo interfaceC0803oO0Ooo = c0798oO0OoOO.OooO00o;
                configuration2.setLocale(interfaceC0803oO0Ooo.get(0));
                configuration2.setLayoutDirection(interfaceC0803oO0Ooo.get(0));
            }
        }
        return configuration2;
    }

    public static C0798oO0OoOO OooOo(Configuration configuration) {
        if (Build.VERSION.SDK_INT >= 24) {
            return AbstractC2054oooo00o.OooO0O0(configuration);
        }
        return C0798oO0OoOO.OooO0O0(AbstractC0099o000o00o.OooO0O0(configuration.locale));
    }

    @Override // com.ninja.engine.AbstractC0094o000OooO
    public final void OooO(View view, ViewGroup.LayoutParams layoutParams) {
        OooOo00();
        ViewGroup viewGroup = (ViewGroup) this.OooOoOO.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view, layoutParams);
        this.OooOOO0.OooO00o(this.OooOO0o.getCallback());
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0048, code lost:
        if (r6.OooO0oO() != false) goto L19;
     */
    @Override // com.ninja.engine.InterfaceC0886oO0oo0o0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO00o(com.ninja.engine.MenuC0887oO0oo0oo r6) {
        /*
            Method dump skipped, instructions count: 246
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.LayoutInflater$Factory2C0109o000oOoo.OooO00o(com.ninja.engine.oO0oo0oo):void");
    }

    @Override // com.ninja.engine.AbstractC0094o000OooO
    public final void OooO0OO() {
        String str;
        this.Oooo0oo = true;
        OooOO0O(false, true);
        OooOo0O();
        Object obj = this.OooOO0;
        if (obj instanceof Activity) {
            try {
                Activity activity = (Activity) obj;
                try {
                    str = AbstractC0692o0ooooOo.OooOoOO(activity, activity.getComponentName());
                } catch (PackageManager.NameNotFoundException e) {
                    throw new IllegalArgumentException(e);
                }
            } catch (IllegalArgumentException unused) {
                str = null;
            }
            if (str != null) {
                C1511oo0OOoo0 c1511oo0OOoo0 = this.OooOOOO;
                if (c1511oo0OOoo0 == null) {
                    this.Ooooo00 = true;
                } else {
                    c1511oo0OOoo0.OoooOo0(true);
                }
            }
            synchronized (AbstractC0094o000OooO.OooO0oo) {
                AbstractC0094o000OooO.OooO0o0(this);
                AbstractC0094o000OooO.OooO0oO.add(new WeakReference(this));
            }
        }
        this.OoooO0 = new Configuration(this.OooOO0O.getResources().getConfiguration());
        this.Oooo = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    @Override // com.ninja.engine.AbstractC0094o000OooO
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0Oo() {
        /*
            r3 = this;
            java.lang.Object r0 = r3.OooOO0
            boolean r0 = r0 instanceof android.app.Activity
            if (r0 == 0) goto L11
            java.lang.Object r0 = com.ninja.engine.AbstractC0094o000OooO.OooO0oo
            monitor-enter(r0)
            com.ninja.engine.AbstractC0094o000OooO.OooO0o0(r3)     // Catch: java.lang.Throwable -> Le
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            goto L11
        Le:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> Le
            throw r1
        L11:
            boolean r0 = r3.OoooOo0
            if (r0 == 0) goto L20
            android.view.Window r0 = r3.OooOO0o
            android.view.View r0 = r0.getDecorView()
            com.ninja.engine.o000Oooo r1 = r3.OoooOoo
            r0.removeCallbacks(r1)
        L20:
            r0 = 1
            r3.OoooO00 = r0
            int r0 = r3.OoooO0O
            r1 = -100
            if (r0 == r1) goto L4d
            java.lang.Object r0 = r3.OooOO0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L4d
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r0 = r0.isChangingConfigurations()
            if (r0 == 0) goto L4d
            com.ninja.engine.oOoOOoo r0 = com.ninja.engine.LayoutInflater$Factory2C0109o000oOoo.Oooooo
            java.lang.Object r1 = r3.OooOO0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            int r2 = r3.OoooO0O
            java.lang.Integer r2 = java.lang.Integer.valueOf(r2)
            r0.put(r1, r2)
            goto L5c
        L4d:
            com.ninja.engine.oOoOOoo r0 = com.ninja.engine.LayoutInflater$Factory2C0109o000oOoo.Oooooo
            java.lang.Object r1 = r3.OooOO0
            java.lang.Class r1 = r1.getClass()
            java.lang.String r1 = r1.getName()
            r0.remove(r1)
        L5c:
            com.ninja.engine.o000o0Oo r0 = r3.OoooOOO
            if (r0 == 0) goto L63
            r0.OooO0o0()
        L63:
            com.ninja.engine.o000o0Oo r0 = r3.OoooOOo
            if (r0 == 0) goto L6a
            r0.OooO0o0()
        L6a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.LayoutInflater$Factory2C0109o000oOoo.OooO0Oo():void");
    }

    @Override // com.ninja.engine.AbstractC0094o000OooO
    public final boolean OooO0o(int i) {
        if (i == 8) {
            i = 108;
        } else if (i == 9) {
            i = 109;
        }
        if (this.Oooo0O0 && i == 108) {
            return false;
        }
        if (this.Oooo000 && i == 1) {
            this.Oooo000 = false;
        }
        if (i != 1) {
            if (i != 2) {
                if (i != 5) {
                    if (i != 10) {
                        if (i != 108) {
                            if (i != 109) {
                                return this.OooOO0o.requestFeature(i);
                            }
                            Oooo00O();
                            this.Oooo00O = true;
                            return true;
                        }
                        Oooo00O();
                        this.Oooo000 = true;
                        return true;
                    }
                    Oooo00O();
                    this.Oooo00o = true;
                    return true;
                }
                Oooo00O();
                this.OooOooo = true;
                return true;
            }
            Oooo00O();
            this.OooOooO = true;
            return true;
        }
        Oooo00O();
        this.Oooo0O0 = true;
        return true;
    }

    @Override // com.ninja.engine.AbstractC0094o000OooO
    public final void OooO0oO(int i) {
        OooOo00();
        ViewGroup viewGroup = (ViewGroup) this.OooOoOO.findViewById(16908290);
        viewGroup.removeAllViews();
        LayoutInflater.from(this.OooOO0O).inflate(i, viewGroup);
        this.OooOOO0.OooO00o(this.OooOO0o.getCallback());
    }

    @Override // com.ninja.engine.AbstractC0094o000OooO
    public final void OooO0oo(View view) {
        OooOo00();
        ViewGroup viewGroup = (ViewGroup) this.OooOoOO.findViewById(16908290);
        viewGroup.removeAllViews();
        viewGroup.addView(view);
        this.OooOOO0.OooO00o(this.OooOO0o.getCallback());
    }

    @Override // com.ninja.engine.AbstractC0094o000OooO
    public final void OooOO0(CharSequence charSequence) {
        this.OooOOo0 = charSequence;
        InterfaceC0356o0OOO0o0 interfaceC0356o0OOO0o0 = this.OooOOo;
        if (interfaceC0356o0OOO0o0 != null) {
            interfaceC0356o0OOO0o0.setWindowTitle(charSequence);
            return;
        }
        C1511oo0OOoo0 c1511oo0OOoo0 = this.OooOOOO;
        if (c1511oo0OOoo0 != null) {
            C1339oOoooOO0 c1339oOoooOO0 = (C1339oOoooOO0) c1511oo0OOoo0.OooOo;
            if (!c1339oOoooOO0.OooO0oO) {
                c1339oOoooOO0.OooO0oo = charSequence;
                if ((c1339oOoooOO0.OooO0O0 & 8) != 0) {
                    Toolbar toolbar = c1339oOoooOO0.OooO00o;
                    toolbar.setTitle(charSequence);
                    if (c1339oOoooOO0.OooO0oO) {
                        AbstractC1460oo0O00oo.OooOOo0(toolbar.getRootView(), charSequence);
                        return;
                    }
                    return;
                }
                return;
            }
            return;
        }
        TextView textView = this.OooOoo0;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:174:0x0224  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x022c  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0236  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x023d  */
    /* JADX WARN: Removed duplicated region for block: B:188:0x025c  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0264  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:198:0x027f  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0099  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x00c5  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x00fb A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOO0O(boolean r17, boolean r18) {
        /*
            Method dump skipped, instructions count: 647
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.LayoutInflater$Factory2C0109o000oOoo.OooOO0O(boolean, boolean):boolean");
    }

    public final void OooOO0o(Window window) {
        Drawable drawable;
        OnBackInvokedDispatcher onBackInvokedDispatcher;
        OnBackInvokedCallback onBackInvokedCallback;
        int resourceId;
        if (this.OooOO0o == null) {
            Window.Callback callback = window.getCallback();
            if (!(callback instanceof Window$CallbackC0102o000o0OO)) {
                Window$CallbackC0102o000o0OO window$CallbackC0102o000o0OO = new Window$CallbackC0102o000o0OO(this, callback);
                this.OooOOO0 = window$CallbackC0102o000o0OO;
                window.setCallback(window$CallbackC0102o000o0OO);
                int[] iArr = OoooooO;
                Context context = this.OooOO0O;
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes((AttributeSet) null, iArr);
                if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
                    C0113o000oo0O OooO00o = C0113o000oo0O.OooO00o();
                    synchronized (OooO00o) {
                        drawable = OooO00o.OooO00o.OooO0oO(context, resourceId, true);
                    }
                } else {
                    drawable = null;
                }
                if (drawable != null) {
                    window.setBackgroundDrawable(drawable);
                }
                obtainStyledAttributes.recycle();
                this.OooOO0o = window;
                if (Build.VERSION.SDK_INT >= 33 && (onBackInvokedDispatcher = this.OooooOo) == null) {
                    if (onBackInvokedDispatcher != null && (onBackInvokedCallback = this.Oooooo0) != null) {
                        AbstractC0100o000o0O.OooO0OO(onBackInvokedDispatcher, onBackInvokedCallback);
                        this.Oooooo0 = null;
                    }
                    Object obj = this.OooOO0;
                    if (obj instanceof Activity) {
                        Activity activity = (Activity) obj;
                        if (activity.getWindow() != null) {
                            this.OooooOo = AbstractC0100o000o0O.OooO00o(activity);
                            Oooo00o();
                            return;
                        }
                    }
                    this.OooooOo = null;
                    Oooo00o();
                    return;
                }
                return;
            }
            throw new IllegalStateException("AppCompat has already installed itself into the Window");
        }
        throw new IllegalStateException("AppCompat has already installed itself into the Window");
    }

    public final void OooOOO(int i, C0107o000o0oo c0107o000o0oo, MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        if (menuC0887oO0oo0oo == null) {
            if (c0107o000o0oo == null && i >= 0) {
                C0107o000o0oo[] c0107o000o0ooArr = this.Oooo0o0;
                if (i < c0107o000o0ooArr.length) {
                    c0107o000o0oo = c0107o000o0ooArr[i];
                }
            }
            if (c0107o000o0oo != null) {
                menuC0887oO0oo0oo = c0107o000o0oo.OooO0oo;
            }
        }
        if ((c0107o000o0oo == null || c0107o000o0oo.OooOOO0) && !this.OoooO00) {
            Window$CallbackC0102o000o0OO window$CallbackC0102o000o0OO = this.OooOOO0;
            Window.Callback callback = this.OooOO0o.getCallback();
            window$CallbackC0102o000o0OO.getClass();
            try {
                window$CallbackC0102o000o0OO.OooO0Oo = true;
                callback.onPanelClosed(i, menuC0887oO0oo0oo);
            } finally {
                window$CallbackC0102o000o0OO.OooO0Oo = false;
            }
        }
    }

    public final void OooOOOO(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        o000000 o000000Var;
        if (this.Oooo0OO) {
            return;
        }
        this.Oooo0OO = true;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) this.OooOOo;
        actionBarOverlayLayout.OooOO0O();
        ActionMenuView actionMenuView = ((C1339oOoooOO0) actionBarOverlayLayout.OooO0o0).OooO00o.OooO00o;
        if (actionMenuView != null && (o000000Var = actionMenuView.OooOo00) != null) {
            o000000Var.OooO0Oo();
            C0355o0OOO0o c0355o0OOO0o = o000000Var.OooOo0;
            if (c0355o0OOO0o != null && c0355o0OOO0o.OooO0O0()) {
                c0355o0OOO0o.OooOO0.dismiss();
            }
        }
        Window.Callback callback = this.OooOO0o.getCallback();
        if (callback != null && !this.OoooO00) {
            callback.onPanelClosed(108, menuC0887oO0oo0oo);
        }
        this.Oooo0OO = false;
    }

    public final void OooOOOo(C0107o000o0oo c0107o000o0oo, boolean z) {
        C0106o000o0oO c0106o000o0oO;
        InterfaceC0356o0OOO0o0 interfaceC0356o0OOO0o0;
        o000000 o000000Var;
        if (z && c0107o000o0oo.OooO00o == 0 && (interfaceC0356o0OOO0o0 = this.OooOOo) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0356o0OOO0o0;
            actionBarOverlayLayout.OooOO0O();
            ActionMenuView actionMenuView = ((C1339oOoooOO0) actionBarOverlayLayout.OooO0o0).OooO00o.OooO00o;
            if (actionMenuView != null && (o000000Var = actionMenuView.OooOo00) != null && o000000Var.OooO0oO()) {
                OooOOOO(c0107o000o0oo.OooO0oo);
                return;
            }
        }
        WindowManager windowManager = (WindowManager) this.OooOO0O.getSystemService("window");
        if (windowManager != null && c0107o000o0oo.OooOOO0 && (c0106o000o0oO = c0107o000o0oo.OooO0o0) != null) {
            windowManager.removeView(c0106o000o0oO);
            if (z) {
                OooOOO(c0107o000o0oo.OooO00o, c0107o000o0oo, null);
            }
        }
        c0107o000o0oo.OooOO0O = false;
        c0107o000o0oo.OooOO0o = false;
        c0107o000o0oo.OooOOO0 = false;
        c0107o000o0oo.OooO0o = null;
        c0107o000o0oo.OooOOO = true;
        if (this.Oooo0o == c0107o000o0oo) {
            this.Oooo0o = null;
        }
        if (c0107o000o0oo.OooO00o == 0) {
            Oooo00o();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:64:0x00db, code lost:
        if (r7.OooO0Oo() != false) goto L61;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0101, code lost:
        if (r7.OooOOOO() != false) goto L61;
     */
    /* JADX WARN: Removed duplicated region for block: B:105:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:94:0x012c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOOo(android.view.KeyEvent r7) {
        /*
            Method dump skipped, instructions count: 325
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.LayoutInflater$Factory2C0109o000oOoo.OooOOo(android.view.KeyEvent):boolean");
    }

    public final void OooOOoo(int i) {
        C0107o000o0oo OooOoO0 = OooOoO0(i);
        if (OooOoO0.OooO0oo != null) {
            Bundle bundle = new Bundle();
            OooOoO0.OooO0oo.OooOo00(bundle);
            if (bundle.size() > 0) {
                OooOoO0.OooOOOo = bundle;
            }
            OooOoO0.OooO0oo.OooOo0o();
            OooOoO0.OooO0oo.clear();
        }
        OooOoO0.OooOOOO = true;
        OooOoO0.OooOOO = true;
        if ((i == 108 || i == 0) && this.OooOOo != null) {
            C0107o000o0oo OooOoO02 = OooOoO0(0);
            OooOoO02.OooOO0O = false;
            Oooo000(OooOoO02, null);
        }
    }

    @Override // com.ninja.engine.InterfaceC0886oO0oo0o0
    public final boolean OooOo0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, MenuItem menuItem) {
        int i;
        C0107o000o0oo c0107o000o0oo;
        Window.Callback callback = this.OooOO0o.getCallback();
        if (callback != null && !this.OoooO00) {
            MenuC0887oO0oo0oo OooOO0O = menuC0887oO0oo0oo.OooOO0O();
            C0107o000o0oo[] c0107o000o0ooArr = this.Oooo0o0;
            if (c0107o000o0ooArr != null) {
                i = c0107o000o0ooArr.length;
            } else {
                i = 0;
            }
            int i2 = 0;
            while (true) {
                if (i2 < i) {
                    c0107o000o0oo = c0107o000o0ooArr[i2];
                    if (c0107o000o0oo != null && c0107o000o0oo.OooO0oo == OooOO0O) {
                        break;
                    }
                    i2++;
                } else {
                    c0107o000o0oo = null;
                    break;
                }
            }
            if (c0107o000o0oo != null) {
                return callback.onMenuItemSelected(c0107o000o0oo.OooO00o, menuItem);
            }
        }
        return false;
    }

    public final void OooOo00() {
        int i;
        ViewGroup viewGroup;
        CharSequence charSequence;
        Context context;
        if (!this.OooOoO) {
            int[] iArr = AbstractC1039oOOOoo0o.OooOO0;
            Context context2 = this.OooOO0O;
            TypedArray obtainStyledAttributes = context2.obtainStyledAttributes(iArr);
            if (obtainStyledAttributes.hasValue(117)) {
                if (obtainStyledAttributes.getBoolean(126, false)) {
                    OooO0o(1);
                } else if (obtainStyledAttributes.getBoolean(117, false)) {
                    OooO0o(108);
                }
                if (obtainStyledAttributes.getBoolean(118, false)) {
                    OooO0o(109);
                }
                if (obtainStyledAttributes.getBoolean(119, false)) {
                    OooO0o(10);
                }
                this.Oooo0 = obtainStyledAttributes.getBoolean(0, false);
                obtainStyledAttributes.recycle();
                OooOo0O();
                this.OooOO0o.getDecorView();
                LayoutInflater from = LayoutInflater.from(context2);
                if (!this.Oooo0O0) {
                    if (this.Oooo0) {
                        viewGroup = (ViewGroup) from.inflate(R.layout.abc_dialog_title_material, (ViewGroup) null);
                        this.Oooo00O = false;
                        this.Oooo000 = false;
                    } else if (this.Oooo000) {
                        TypedValue typedValue = new TypedValue();
                        context2.getTheme().resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            context = new o0O0oo00(context2, typedValue.resourceId);
                        } else {
                            context = context2;
                        }
                        viewGroup = (ViewGroup) LayoutInflater.from(context).inflate(R.layout.abc_screen_toolbar, (ViewGroup) null);
                        InterfaceC0356o0OOO0o0 interfaceC0356o0OOO0o0 = (InterfaceC0356o0OOO0o0) viewGroup.findViewById(R.id.decor_content_parent);
                        this.OooOOo = interfaceC0356o0OOO0o0;
                        interfaceC0356o0OOO0o0.setWindowCallback(this.OooOO0o.getCallback());
                        if (this.Oooo00O) {
                            ((ActionBarOverlayLayout) this.OooOOo).OooOO0(109);
                        }
                        if (this.OooOooO) {
                            ((ActionBarOverlayLayout) this.OooOOo).OooOO0(2);
                        }
                        if (this.OooOooo) {
                            ((ActionBarOverlayLayout) this.OooOOo).OooOO0(5);
                        }
                    } else {
                        viewGroup = null;
                    }
                } else {
                    if (this.Oooo00o) {
                        i = R.layout.abc_screen_simple_overlay_action_mode;
                    } else {
                        i = R.layout.abc_screen_simple;
                    }
                    viewGroup = (ViewGroup) from.inflate(i, (ViewGroup) null);
                }
                if (viewGroup != null) {
                    C0097o000o000 c0097o000o000 = new C0097o000o000(this);
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    AbstractC1452oo0O000o.OooOOO0(viewGroup, c0097o000o000);
                    if (this.OooOOo == null) {
                        this.OooOoo0 = (TextView) viewGroup.findViewById(R.id.title);
                    }
                    boolean z = AbstractC1479oo0O0oOo.OooO00o;
                    try {
                        Method method = viewGroup.getClass().getMethod("makeOptionalFitsSystemWindows", null);
                        if (!method.isAccessible()) {
                            method.setAccessible(true);
                        }
                        method.invoke(viewGroup, null);
                    } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                    }
                    ContentFrameLayout contentFrameLayout = (ContentFrameLayout) viewGroup.findViewById(R.id.action_bar_activity_content);
                    ViewGroup viewGroup2 = (ViewGroup) this.OooOO0o.findViewById(16908290);
                    if (viewGroup2 != null) {
                        while (viewGroup2.getChildCount() > 0) {
                            View childAt = viewGroup2.getChildAt(0);
                            viewGroup2.removeViewAt(0);
                            contentFrameLayout.addView(childAt);
                        }
                        viewGroup2.setId(-1);
                        contentFrameLayout.setId(16908290);
                        if (viewGroup2 instanceof FrameLayout) {
                            ((FrameLayout) viewGroup2).setForeground(null);
                        }
                    }
                    this.OooOO0o.setContentView(viewGroup);
                    contentFrameLayout.setAttachListener(new C0096o000o00(this));
                    this.OooOoOO = viewGroup;
                    Object obj = this.OooOO0;
                    if (obj instanceof Activity) {
                        charSequence = ((Activity) obj).getTitle();
                    } else {
                        charSequence = this.OooOOo0;
                    }
                    if (!TextUtils.isEmpty(charSequence)) {
                        InterfaceC0356o0OOO0o0 interfaceC0356o0OOO0o02 = this.OooOOo;
                        if (interfaceC0356o0OOO0o02 != null) {
                            interfaceC0356o0OOO0o02.setWindowTitle(charSequence);
                        } else {
                            C1511oo0OOoo0 c1511oo0OOoo0 = this.OooOOOO;
                            if (c1511oo0OOoo0 != null) {
                                C1339oOoooOO0 c1339oOoooOO0 = (C1339oOoooOO0) c1511oo0OOoo0.OooOo;
                                if (!c1339oOoooOO0.OooO0oO) {
                                    c1339oOoooOO0.OooO0oo = charSequence;
                                    if ((c1339oOoooOO0.OooO0O0 & 8) != 0) {
                                        Toolbar toolbar = c1339oOoooOO0.OooO00o;
                                        toolbar.setTitle(charSequence);
                                        if (c1339oOoooOO0.OooO0oO) {
                                            AbstractC1460oo0O00oo.OooOOo0(toolbar.getRootView(), charSequence);
                                        }
                                    }
                                }
                            } else {
                                TextView textView = this.OooOoo0;
                                if (textView != null) {
                                    textView.setText(charSequence);
                                }
                            }
                        }
                    }
                    ContentFrameLayout contentFrameLayout2 = (ContentFrameLayout) this.OooOoOO.findViewById(16908290);
                    View decorView = this.OooOO0o.getDecorView();
                    contentFrameLayout2.OooO0oO.set(decorView.getPaddingLeft(), decorView.getPaddingTop(), decorView.getPaddingRight(), decorView.getPaddingBottom());
                    if (contentFrameLayout2.isLaidOut()) {
                        contentFrameLayout2.requestLayout();
                    }
                    TypedArray obtainStyledAttributes2 = context2.obtainStyledAttributes(iArr);
                    obtainStyledAttributes2.getValue(124, contentFrameLayout2.getMinWidthMajor());
                    obtainStyledAttributes2.getValue(125, contentFrameLayout2.getMinWidthMinor());
                    if (obtainStyledAttributes2.hasValue(122)) {
                        obtainStyledAttributes2.getValue(122, contentFrameLayout2.getFixedWidthMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(123)) {
                        obtainStyledAttributes2.getValue(123, contentFrameLayout2.getFixedWidthMinor());
                    }
                    if (obtainStyledAttributes2.hasValue(120)) {
                        obtainStyledAttributes2.getValue(120, contentFrameLayout2.getFixedHeightMajor());
                    }
                    if (obtainStyledAttributes2.hasValue(121)) {
                        obtainStyledAttributes2.getValue(121, contentFrameLayout2.getFixedHeightMinor());
                    }
                    obtainStyledAttributes2.recycle();
                    contentFrameLayout2.requestLayout();
                    this.OooOoO = true;
                    C0107o000o0oo OooOoO0 = OooOoO0(0);
                    if (!this.OoooO00 && OooOoO0.OooO0oo == null) {
                        OooOoOO(108);
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException("AppCompat does not support the current theme features: { windowActionBar: " + this.Oooo000 + ", windowActionBarOverlay: " + this.Oooo00O + ", android:windowIsFloating: " + this.Oooo0 + ", windowActionModeOverlay: " + this.Oooo00o + ", windowNoTitle: " + this.Oooo0O0 + " }");
            }
            obtainStyledAttributes.recycle();
            throw new IllegalStateException("You need to use a Theme.AppCompat theme (or descendant) with this activity.");
        }
    }

    public final void OooOo0O() {
        if (this.OooOO0o == null) {
            Object obj = this.OooOO0;
            if (obj instanceof Activity) {
                OooOO0o(((Activity) obj).getWindow());
            }
        }
        if (this.OooOO0o != null) {
            return;
        }
        throw new IllegalStateException("We have not been given a Window");
    }

    public final AbstractC0104o000o0o OooOo0o(Context context) {
        if (this.OoooOOO == null) {
            if (C0131o00O0o.OooO0oO == null) {
                Context applicationContext = context.getApplicationContext();
                C0131o00O0o.OooO0oO = new C0131o00O0o(applicationContext, (LocationManager) applicationContext.getSystemService("location"));
            }
            this.OoooOOO = new C0103o000o0Oo(this, C0131o00O0o.OooO0oO);
        }
        return this.OoooOOO;
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:19:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOoO() {
        /*
            r3 = this;
            r3.OooOo00()
            boolean r0 = r3.Oooo000
            if (r0 == 0) goto L33
            com.ninja.engine.oo0OOoo0 r0 = r3.OooOOOO
            if (r0 == 0) goto Lc
            goto L33
        Lc:
            java.lang.Object r0 = r3.OooOO0
            boolean r1 = r0 instanceof android.app.Activity
            if (r1 == 0) goto L1e
            com.ninja.engine.oo0OOoo0 r1 = new com.ninja.engine.oo0OOoo0
            android.app.Activity r0 = (android.app.Activity) r0
            boolean r2 = r3.Oooo00O
            r1.<init>(r0, r2)
        L1b:
            r3.OooOOOO = r1
            goto L2a
        L1e:
            boolean r1 = r0 instanceof android.app.Dialog
            if (r1 == 0) goto L2a
            com.ninja.engine.oo0OOoo0 r1 = new com.ninja.engine.oo0OOoo0
            android.app.Dialog r0 = (android.app.Dialog) r0
            r1.<init>(r0)
            goto L1b
        L2a:
            com.ninja.engine.oo0OOoo0 r0 = r3.OooOOOO
            if (r0 == 0) goto L33
            boolean r1 = r3.Ooooo00
            r0.OoooOo0(r1)
        L33:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.LayoutInflater$Factory2C0109o000oOoo.OooOoO():void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v3, types: [com.ninja.engine.o000o0oo, java.lang.Object] */
    public final C0107o000o0oo OooOoO0(int i) {
        Object[] objArr = this.Oooo0o0;
        if (objArr == null || objArr.length <= i) {
            C0107o000o0oo[] c0107o000o0ooArr = new C0107o000o0oo[i + 1];
            if (objArr != null) {
                System.arraycopy(objArr, 0, c0107o000o0ooArr, 0, objArr.length);
            }
            this.Oooo0o0 = c0107o000o0ooArr;
            objArr = c0107o000o0ooArr;
        }
        C0107o000o0oo c0107o000o0oo = objArr[i];
        if (c0107o000o0oo == 0) {
            Object obj = new Object();
            obj.OooO00o = i;
            obj.OooOOO = false;
            objArr[i] = obj;
            return obj;
        }
        return c0107o000o0oo;
    }

    public final void OooOoOO(int i) {
        this.OoooOoO = (1 << i) | this.OoooOoO;
        if (!this.OoooOo0) {
            View decorView = this.OooOO0o.getDecorView();
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            decorView.postOnAnimation(this.OoooOoo);
            this.OoooOo0 = true;
        }
    }

    public final boolean OooOoo() {
        InterfaceC0357o0OOO0oO interfaceC0357o0OOO0oO;
        C1332oOooo0o0 c1332oOooo0o0;
        C0892oO0ooO0o c0892oO0ooO0o;
        boolean z = this.Oooo0oO;
        this.Oooo0oO = false;
        C0107o000o0oo OooOoO0 = OooOoO0(0);
        if (OooOoO0.OooOOO0) {
            if (!z) {
                OooOOOo(OooOoO0, true);
            }
            return true;
        }
        o00000O o00000o = this.OooOo0;
        if (o00000o != null) {
            o00000o.OooO0O0();
            return true;
        }
        OooOoO();
        C1511oo0OOoo0 c1511oo0OOoo0 = this.OooOOOO;
        if (c1511oo0OOoo0 == null || (interfaceC0357o0OOO0oO = c1511oo0OOoo0.OooOo) == null || (c1332oOooo0o0 = ((C1339oOoooOO0) interfaceC0357o0OOO0oO).OooO00o.Oooo0o0) == null || c1332oOooo0o0.OooO0O0 == null) {
            return false;
        }
        C1332oOooo0o0 c1332oOooo0o02 = ((C1339oOoooOO0) interfaceC0357o0OOO0oO).OooO00o.Oooo0o0;
        if (c1332oOooo0o02 == null) {
            c0892oO0ooO0o = null;
        } else {
            c0892oO0ooO0o = c1332oOooo0o02.OooO0O0;
        }
        if (c0892oO0ooO0o != null) {
            c0892oO0ooO0o.collapseActionView();
        }
        return true;
    }

    public final int OooOoo0(Context context, int i) {
        if (i == -100) {
            return -1;
        }
        if (i != -1) {
            if (i != 0) {
                if (i != 1 && i != 2) {
                    if (i == 3) {
                        if (this.OoooOOo == null) {
                            this.OoooOOo = new C0103o000o0Oo(this, context);
                        }
                        return this.OoooOOo.OooO0oo();
                    }
                    throw new IllegalStateException("Unknown value set for night mode. Please use one of the MODE_NIGHT values from AppCompatDelegate.");
                }
            } else if (Build.VERSION.SDK_INT >= 23 && ((UiModeManager) context.getApplicationContext().getSystemService("uimode")).getNightMode() == 0) {
                return -1;
            } else {
                return OooOo0o(context).OooO0oo();
            }
        }
        return i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:76:0x0150, code lost:
        if (r3 != null) goto L56;
     */
    /* JADX WARN: Code restructure failed: missing block: B:87:0x0170, code lost:
        if (r3.OooO0o.getCount() > 0) goto L65;
     */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01ce  */
    /* JADX WARN: Removed duplicated region for block: B:104:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOooO(com.ninja.engine.C0107o000o0oo r18, android.view.KeyEvent r19) {
        /*
            Method dump skipped, instructions count: 469
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.LayoutInflater$Factory2C0109o000oOoo.OooOooO(com.ninja.engine.o000o0oo, android.view.KeyEvent):void");
    }

    public final boolean OooOooo(C0107o000o0oo c0107o000o0oo, int i, KeyEvent keyEvent) {
        MenuC0887oO0oo0oo menuC0887oO0oo0oo;
        if (keyEvent.isSystem()) {
            return false;
        }
        if ((!c0107o000o0oo.OooOO0O && !Oooo000(c0107o000o0oo, keyEvent)) || (menuC0887oO0oo0oo = c0107o000o0oo.OooO0oo) == null) {
            return false;
        }
        return menuC0887oO0oo0oo.performShortcut(i, keyEvent, 1);
    }

    public final boolean Oooo000(C0107o000o0oo c0107o000o0oo, KeyEvent keyEvent) {
        boolean z;
        InterfaceC0356o0OOO0o0 interfaceC0356o0OOO0o0;
        InterfaceC0356o0OOO0o0 interfaceC0356o0OOO0o02;
        Resources.Theme theme;
        int i;
        boolean z2;
        InterfaceC0356o0OOO0o0 interfaceC0356o0OOO0o03;
        InterfaceC0356o0OOO0o0 interfaceC0356o0OOO0o04;
        if (this.OoooO00) {
            return false;
        }
        if (c0107o000o0oo.OooOO0O) {
            return true;
        }
        C0107o000o0oo c0107o000o0oo2 = this.Oooo0o;
        if (c0107o000o0oo2 != null && c0107o000o0oo2 != c0107o000o0oo) {
            OooOOOo(c0107o000o0oo2, false);
        }
        Window.Callback callback = this.OooOO0o.getCallback();
        int i2 = c0107o000o0oo.OooO00o;
        if (callback != null) {
            c0107o000o0oo.OooO0oO = callback.onCreatePanelView(i2);
        }
        if (i2 != 0 && i2 != 108) {
            z = false;
        } else {
            z = true;
        }
        if (z && (interfaceC0356o0OOO0o04 = this.OooOOo) != null) {
            ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0356o0OOO0o04;
            actionBarOverlayLayout.OooOO0O();
            ((C1339oOoooOO0) actionBarOverlayLayout.OooO0o0).OooOO0o = true;
        }
        if (c0107o000o0oo.OooO0oO == null) {
            MenuC0887oO0oo0oo menuC0887oO0oo0oo = c0107o000o0oo.OooO0oo;
            if (menuC0887oO0oo0oo == null || c0107o000o0oo.OooOOOO) {
                if (menuC0887oO0oo0oo == null) {
                    Context context = this.OooOO0O;
                    if ((i2 == 0 || i2 == 108) && this.OooOOo != null) {
                        TypedValue typedValue = new TypedValue();
                        Resources.Theme theme2 = context.getTheme();
                        theme2.resolveAttribute(R.attr.actionBarTheme, typedValue, true);
                        if (typedValue.resourceId != 0) {
                            theme = context.getResources().newTheme();
                            theme.setTo(theme2);
                            theme.applyStyle(typedValue.resourceId, true);
                            theme.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                        } else {
                            theme2.resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
                            theme = null;
                        }
                        if (typedValue.resourceId != 0) {
                            if (theme == null) {
                                theme = context.getResources().newTheme();
                                theme.setTo(theme2);
                            }
                            theme.applyStyle(typedValue.resourceId, true);
                        }
                        if (theme != null) {
                            o0O0oo00 o0o0oo00 = new o0O0oo00(context, 0);
                            o0o0oo00.getTheme().setTo(theme);
                            context = o0o0oo00;
                        }
                    }
                    MenuC0887oO0oo0oo menuC0887oO0oo0oo2 = new MenuC0887oO0oo0oo(context);
                    menuC0887oO0oo0oo2.OooO0o0 = this;
                    MenuC0887oO0oo0oo menuC0887oO0oo0oo3 = c0107o000o0oo.OooO0oo;
                    if (menuC0887oO0oo0oo2 != menuC0887oO0oo0oo3) {
                        if (menuC0887oO0oo0oo3 != null) {
                            menuC0887oO0oo0oo3.OooOOo(c0107o000o0oo.OooO);
                        }
                        c0107o000o0oo.OooO0oo = menuC0887oO0oo0oo2;
                        oO0OOO0 oo0ooo0 = c0107o000o0oo.OooO;
                        if (oo0ooo0 != null) {
                            menuC0887oO0oo0oo2.OooO0O0(oo0ooo0, menuC0887oO0oo0oo2.OooO00o);
                        }
                    }
                    if (c0107o000o0oo.OooO0oo == null) {
                        return false;
                    }
                }
                if (z && (interfaceC0356o0OOO0o02 = this.OooOOo) != null) {
                    if (this.OooOOoo == null) {
                        this.OooOOoo = new C0097o000o000(this);
                    }
                    ((ActionBarOverlayLayout) interfaceC0356o0OOO0o02).OooOO0o(c0107o000o0oo.OooO0oo, this.OooOOoo);
                }
                c0107o000o0oo.OooO0oo.OooOo0o();
                if (!callback.onCreatePanelMenu(i2, c0107o000o0oo.OooO0oo)) {
                    MenuC0887oO0oo0oo menuC0887oO0oo0oo4 = c0107o000o0oo.OooO0oo;
                    if (menuC0887oO0oo0oo4 != null) {
                        if (menuC0887oO0oo0oo4 != null) {
                            menuC0887oO0oo0oo4.OooOOo(c0107o000o0oo.OooO);
                        }
                        c0107o000o0oo.OooO0oo = null;
                    }
                    if (z && (interfaceC0356o0OOO0o0 = this.OooOOo) != null) {
                        ((ActionBarOverlayLayout) interfaceC0356o0OOO0o0).OooOO0o(null, this.OooOOoo);
                    }
                    return false;
                }
                c0107o000o0oo.OooOOOO = false;
            }
            c0107o000o0oo.OooO0oo.OooOo0o();
            Bundle bundle = c0107o000o0oo.OooOOOo;
            if (bundle != null) {
                c0107o000o0oo.OooO0oo.OooOOoo(bundle);
                c0107o000o0oo.OooOOOo = null;
            }
            if (!callback.onPreparePanel(0, c0107o000o0oo.OooO0oO, c0107o000o0oo.OooO0oo)) {
                if (z && (interfaceC0356o0OOO0o03 = this.OooOOo) != null) {
                    ((ActionBarOverlayLayout) interfaceC0356o0OOO0o03).OooOO0o(null, this.OooOOoo);
                }
                c0107o000o0oo.OooO0oo.OooOo0O();
                return false;
            }
            if (keyEvent != null) {
                i = keyEvent.getDeviceId();
            } else {
                i = -1;
            }
            if (KeyCharacterMap.load(i).getKeyboardType() != 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            c0107o000o0oo.OooO0oo.setQwertyMode(z2);
            c0107o000o0oo.OooO0oo.OooOo0O();
        }
        c0107o000o0oo.OooOO0O = true;
        c0107o000o0oo.OooOO0o = false;
        this.Oooo0o = c0107o000o0oo;
        return true;
    }

    public final void Oooo00O() {
        if (!this.OooOoO) {
            return;
        }
        throw new AndroidRuntimeException("Window feature must be requested before adding content");
    }

    public final void Oooo00o() {
        OnBackInvokedCallback onBackInvokedCallback;
        OnBackInvokedCallback onBackInvokedCallback2;
        if (Build.VERSION.SDK_INT >= 33) {
            boolean z = false;
            if (this.OooooOo != null && (OooOoO0(0).OooOOO0 || this.OooOo0 != null)) {
                z = true;
            }
            if (z && this.Oooooo0 == null) {
                onBackInvokedCallback2 = AbstractC0100o000o0O.OooO0O0(this.OooooOo, this);
            } else if (!z && (onBackInvokedCallback = this.Oooooo0) != null) {
                AbstractC0100o000o0O.OooO0OO(this.OooooOo, onBackInvokedCallback);
                onBackInvokedCallback2 = null;
            } else {
                return;
            }
            this.Oooooo0 = onBackInvokedCallback2;
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00e9, code lost:
        if (r13.equals("ImageButton") == false) goto L20;
     */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:114:0x01bc -> B:142:0x01c2). Please submit an issue!!! */
    @Override // android.view.LayoutInflater.Factory2
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.View onCreateView(android.view.View r12, java.lang.String r13, android.content.Context r14, android.util.AttributeSet r15) {
        /*
            Method dump skipped, instructions count: 696
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.LayoutInflater$Factory2C0109o000oOoo.onCreateView(android.view.View, java.lang.String, android.content.Context, android.util.AttributeSet):android.view.View");
    }

    @Override // android.view.LayoutInflater.Factory
    public final View onCreateView(String str, Context context, AttributeSet attributeSet) {
        return onCreateView(null, str, context, attributeSet);
    }
}

