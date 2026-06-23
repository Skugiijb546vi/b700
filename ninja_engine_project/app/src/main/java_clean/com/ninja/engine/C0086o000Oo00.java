package com.ninja.engine;

import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.widget.CheckedTextView;
import android.widget.CompoundButton;
import android.widget.TextView;
import java.util.LinkedHashSet;
/* renamed from: com.ninja.engine.o000Oo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0086o000Oo00 {
    public Parcelable OooO00o;
    public Object OooO0O0;
    public boolean OooO0OO;
    public boolean OooO0Oo;
    public final Object OooO0o;
    public boolean OooO0o0;

    public C0086o000Oo00() {
        this.OooO0o = new C1182oOoO();
        this.OooO0o0 = true;
    }

    public void OooO00o() {
        CompoundButton compoundButton = (CompoundButton) this.OooO0o;
        Drawable OooOo0O = AbstractC0694o0ooooo0.OooOo0O(compoundButton);
        if (OooOo0O != null) {
            if (this.OooO0OO || this.OooO0Oo) {
                Drawable mutate = AbstractC0809oO0OooOO.o0ooOoO(OooOo0O).mutate();
                if (this.OooO0OO) {
                    mutate.setTintList((ColorStateList) this.OooO00o);
                }
                if (this.OooO0Oo) {
                    mutate.setTintMode((PorterDuff.Mode) this.OooO0O0);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    public void OooO0O0() {
        CheckedTextView checkedTextView = (CheckedTextView) this.OooO0o;
        Drawable checkMarkDrawable = checkedTextView.getCheckMarkDrawable();
        if (checkMarkDrawable != null) {
            if (this.OooO0OO || this.OooO0Oo) {
                Drawable mutate = AbstractC0809oO0OooOO.o0ooOoO(checkMarkDrawable).mutate();
                if (this.OooO0OO) {
                    mutate.setTintList((ColorStateList) this.OooO00o);
                }
                if (this.OooO0Oo) {
                    mutate.setTintMode((PorterDuff.Mode) this.OooO0O0);
                }
                if (mutate.isStateful()) {
                    mutate.setState(checkedTextView.getDrawableState());
                }
                checkedTextView.setCheckMarkDrawable(mutate);
            }
        }
    }

    public Bundle OooO0OO(String str) {
        if (this.OooO0Oo) {
            Bundle bundle = (Bundle) this.OooO00o;
            if (bundle == null) {
                return null;
            }
            Bundle bundle2 = bundle.getBundle(str);
            Bundle bundle3 = (Bundle) this.OooO00o;
            if (bundle3 != null) {
                bundle3.remove(str);
            }
            Bundle bundle4 = (Bundle) this.OooO00o;
            if (bundle4 == null || bundle4.isEmpty()) {
                this.OooO00o = null;
            }
            return bundle2;
        }
        throw new IllegalStateException("You can consumeRestoredStateForKey only after super.onCreate of corresponding component".toString());
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x005c A[Catch: all -> 0x003c, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0024, B:5:0x002a, B:7:0x0030, B:16:0x0055, B:18:0x005c, B:19:0x0063, B:21:0x006a, B:11:0x003e, B:13:0x0044, B:15:0x004a), top: B:29:0x0024 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006a A[Catch: all -> 0x003c, TRY_LEAVE, TryCatch #1 {all -> 0x003c, blocks: (B:3:0x0024, B:5:0x002a, B:7:0x0030, B:16:0x0055, B:18:0x005c, B:19:0x0063, B:21:0x006a, B:11:0x003e, B:13:0x0044, B:15:0x004a), top: B:29:0x0024 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooO0Oo(android.util.AttributeSet r11, int r12) {
        /*
            r10 = this;
            java.lang.Object r0 = r10.OooO0o
            android.widget.CompoundButton r0 = (android.widget.CompoundButton) r0
            android.content.Context r1 = r0.getContext()
            int[] r3 = com.ninja.engine.AbstractC1039oOOOoo0o.OooOOO0
            r7 = 0
            com.ninja.engine.o00O0o r8 = com.ninja.engine.C0131o00O0o.Oooo0O0(r1, r11, r3, r12, r7)
            java.lang.Object r1 = r8.OooO0O0
            r9 = r1
            android.content.res.TypedArray r9 = (android.content.res.TypedArray) r9
            android.content.Context r2 = r0.getContext()
            java.lang.Object r1 = r8.OooO0O0
            r5 = r1
            android.content.res.TypedArray r5 = (android.content.res.TypedArray) r5
            r1 = r0
            r4 = r11
            r6 = r12
            com.ninja.engine.AbstractC1460oo0O00oo.OooOOOO(r1, r2, r3, r4, r5, r6)
            r11 = 1
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L3c
            if (r12 == 0) goto L3e
            int r11 = r9.getResourceId(r11, r7)     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L3e
            android.content.Context r12 = r0.getContext()     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3e
            android.graphics.drawable.Drawable r11 = com.ninja.engine.AbstractC0692o0ooooOo.OooOo0(r12, r11)     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3e
            r0.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L3c android.content.res.Resources.NotFoundException -> L3e
            goto L55
        L3c:
            r11 = move-exception
            goto L7b
        L3e:
            boolean r11 = r9.hasValue(r7)     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L55
            int r11 = r9.getResourceId(r7, r7)     // Catch: java.lang.Throwable -> L3c
            if (r11 == 0) goto L55
            android.content.Context r12 = r0.getContext()     // Catch: java.lang.Throwable -> L3c
            android.graphics.drawable.Drawable r11 = com.ninja.engine.AbstractC0692o0ooooOo.OooOo0(r12, r11)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonDrawable(r11)     // Catch: java.lang.Throwable -> L3c
        L55:
            r11 = 2
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L3c
            if (r12 == 0) goto L63
            android.content.res.ColorStateList r11 = r8.OooOo0O(r11)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonTintList(r11)     // Catch: java.lang.Throwable -> L3c
        L63:
            r11 = 3
            boolean r12 = r9.hasValue(r11)     // Catch: java.lang.Throwable -> L3c
            if (r12 == 0) goto L77
            r12 = -1
            int r11 = r9.getInt(r11, r12)     // Catch: java.lang.Throwable -> L3c
            r12 = 0
            android.graphics.PorterDuff$Mode r11 = com.ninja.engine.AbstractC0420o0Oo0Oo.OooO0O0(r11, r12)     // Catch: java.lang.Throwable -> L3c
            r0.setButtonTintMode(r11)     // Catch: java.lang.Throwable -> L3c
        L77:
            r8.Oooo0o0()
            return
        L7b:
            r8.Oooo0o0()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0086o000Oo00.OooO0Oo(android.util.AttributeSet, int):void");
    }

    public void OooO0o() {
        if (this.OooO0o0) {
            C0082o000O0oo c0082o000O0oo = (C0082o000O0oo) this.OooO0O0;
            if (c0082o000O0oo == null) {
                c0082o000O0oo = new C0082o000O0oo(this);
            }
            this.OooO0O0 = c0082o000O0oo;
            try {
                oO0O0O00.class.getDeclaredConstructor(null);
                C0082o000O0oo c0082o000O0oo2 = (C0082o000O0oo) this.OooO0O0;
                if (c0082o000O0oo2 != null) {
                    ((LinkedHashSet) c0082o000O0oo2.OooO0O0).add(oO0O0O00.class.getName());
                    return;
                }
                return;
            } catch (NoSuchMethodException e) {
                throw new IllegalArgumentException("Class " + oO0O0O00.class.getSimpleName() + " must have default constructor in order to be automatically recreated", e);
            }
        }
        throw new IllegalStateException("Can not perform this action after onSaveInstanceState".toString());
    }

    public void OooO0o0(String str, InterfaceC1213oOoOOo0O interfaceC1213oOoOOo0O) {
        Object obj;
        AbstractC0809oO0OooOO.OooOOOo(interfaceC1213oOoOOo0O, "provider");
        C1182oOoO c1182oOoO = (C1182oOoO) this.OooO0o;
        C1183oOoO0oo OooO00o = c1182oOoO.OooO00o(str);
        if (OooO00o != null) {
            obj = OooO00o.OooO0O0;
        } else {
            C1183oOoO0oo c1183oOoO0oo = new C1183oOoO0oo(str, interfaceC1213oOoOOo0O);
            c1182oOoO.OooO0Oo++;
            C1183oOoO0oo c1183oOoO0oo2 = c1182oOoO.OooO0O0;
            if (c1183oOoO0oo2 == null) {
                c1182oOoO.OooO00o = c1183oOoO0oo;
            } else {
                c1183oOoO0oo2.OooO0OO = c1183oOoO0oo;
                c1183oOoO0oo.OooO0Oo = c1183oOoO0oo2;
            }
            c1182oOoO.OooO0O0 = c1183oOoO0oo;
            obj = null;
        }
        if (((InterfaceC1213oOoOOo0O) obj) == null) {
            return;
        }
        throw new IllegalArgumentException("SavedStateProvider with the given key is already registered".toString());
    }

    public /* synthetic */ C0086o000Oo00(TextView textView) {
        this.OooO00o = null;
        this.OooO0O0 = null;
        this.OooO0OO = false;
        this.OooO0Oo = false;
        this.OooO0o = textView;
    }
}


