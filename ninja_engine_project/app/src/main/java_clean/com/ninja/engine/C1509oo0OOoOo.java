package com.ninja.engine;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
/* renamed from: com.ninja.engine.oo0OOoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1509oo0OOoOo extends o00000O implements InterfaceC0886oO0oo0o0 {
    public final Context OooO0OO;
    public final MenuC0887oO0oo0oo OooO0Oo;
    public WeakReference OooO0o;
    public o00000O0 OooO0o0;
    public final /* synthetic */ C1511oo0OOoo0 OooO0oO;

    public C1509oo0OOoOo(C1511oo0OOoo0 c1511oo0OOoo0, Context context, C0415o0Oo0O0O c0415o0Oo0O0O) {
        this.OooO0oO = c1511oo0OOoo0;
        this.OooO0OO = context;
        this.OooO0o0 = c0415o0Oo0O0O;
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = new MenuC0887oO0oo0oo(context);
        menuC0887oO0oo0oo.OooOO0o = 1;
        this.OooO0Oo = menuC0887oO0oo0oo;
        menuC0887oO0oo0oo.OooO0o0 = this;
    }

    @Override // com.ninja.engine.o00000O
    public final boolean OooO() {
        return this.OooO0oO.OooOoO0.OooOOoo;
    }

    @Override // com.ninja.engine.InterfaceC0886oO0oo0o0
    public final void OooO00o(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        if (this.OooO0o0 == null) {
            return;
        }
        OooO0oo();
        o000000 o000000Var = this.OooO0oO.OooOoO0.OooO0Oo;
        if (o000000Var != null) {
            o000000Var.OooOOOO();
        }
    }

    @Override // com.ninja.engine.o00000O
    public final void OooO0O0() {
        C1511oo0OOoo0 c1511oo0OOoo0 = this.OooO0oO;
        if (c1511oo0OOoo0.OooOoo0 != this) {
            return;
        }
        if (c1511oo0OOoo0.Oooo0) {
            c1511oo0OOoo0.OooOoo = this;
            c1511oo0OOoo0.OooOooO = this.OooO0o0;
        } else {
            this.OooO0o0.OooO0oo(this);
        }
        this.OooO0o0 = null;
        c1511oo0OOoo0.o000oOoO(false);
        ActionBarContextView actionBarContextView = c1511oo0OOoo0.OooOoO0;
        if (actionBarContextView.OooOO0O == null) {
            actionBarContextView.OooO0o0();
        }
        c1511oo0OOoo0.OooOo0O.setHideOnContentScrollEnabled(c1511oo0OOoo0.Oooo0oO);
        c1511oo0OOoo0.OooOoo0 = null;
    }

    @Override // com.ninja.engine.o00000O
    public final View OooO0OO() {
        WeakReference weakReference = this.OooO0o;
        if (weakReference != null) {
            return (View) weakReference.get();
        }
        return null;
    }

    @Override // com.ninja.engine.o00000O
    public final MenuC0887oO0oo0oo OooO0Oo() {
        return this.OooO0Oo;
    }

    @Override // com.ninja.engine.o00000O
    public final CharSequence OooO0o() {
        return this.OooO0oO.OooOoO0.getSubtitle();
    }

    @Override // com.ninja.engine.o00000O
    public final MenuInflater OooO0o0() {
        return new C1271oOoo0OOO(this.OooO0OO);
    }

    @Override // com.ninja.engine.o00000O
    public final CharSequence OooO0oO() {
        return this.OooO0oO.OooOoO0.getTitle();
    }

    @Override // com.ninja.engine.o00000O
    public final void OooO0oo() {
        if (this.OooO0oO.OooOoo0 != this) {
            return;
        }
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = this.OooO0Oo;
        menuC0887oO0oo0oo.OooOo0o();
        try {
            this.OooO0o0.OooO0Oo(this, menuC0887oO0oo0oo);
        } finally {
            menuC0887oO0oo0oo.OooOo0O();
        }
    }

    @Override // com.ninja.engine.o00000O
    public final void OooOO0(View view) {
        this.OooO0oO.OooOoO0.setCustomView(view);
        this.OooO0o = new WeakReference(view);
    }

    @Override // com.ninja.engine.o00000O
    public final void OooOO0O(int i) {
        OooOO0o(this.OooO0oO.OooOo00.getResources().getString(i));
    }

    @Override // com.ninja.engine.o00000O
    public final void OooOO0o(CharSequence charSequence) {
        this.OooO0oO.OooOoO0.setSubtitle(charSequence);
    }

    @Override // com.ninja.engine.o00000O
    public final void OooOOO(CharSequence charSequence) {
        this.OooO0oO.OooOoO0.setTitle(charSequence);
    }

    @Override // com.ninja.engine.o00000O
    public final void OooOOO0(int i) {
        OooOOO(this.OooO0oO.OooOo00.getResources().getString(i));
    }

    @Override // com.ninja.engine.o00000O
    public final void OooOOOO(boolean z) {
        this.OooO0O0 = z;
        this.OooO0oO.OooOoO0.setTitleOptional(z);
    }

    @Override // com.ninja.engine.InterfaceC0886oO0oo0o0
    public final boolean OooOo0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, MenuItem menuItem) {
        o00000O0 o00000o0 = this.OooO0o0;
        if (o00000o0 != null) {
            return o00000o0.OooO0OO(this, menuItem);
        }
        return false;
    }
}


