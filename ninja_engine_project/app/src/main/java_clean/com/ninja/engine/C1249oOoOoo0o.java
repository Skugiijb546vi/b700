package com.ninja.engine;

import android.content.Context;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.ActionBarContextView;
import java.lang.ref.WeakReference;
/* renamed from: com.ninja.engine.oOoOoo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1249oOoOoo0o extends o00000O implements InterfaceC0886oO0oo0o0 {
    public Context OooO0OO;
    public ActionBarContextView OooO0Oo;
    public WeakReference OooO0o;
    public o00000O0 OooO0o0;
    public boolean OooO0oO;
    public MenuC0887oO0oo0oo OooO0oo;

    @Override // com.ninja.engine.o00000O
    public final boolean OooO() {
        return this.OooO0Oo.OooOOoo;
    }

    @Override // com.ninja.engine.InterfaceC0886oO0oo0o0
    public final void OooO00o(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        OooO0oo();
        o000000 o000000Var = this.OooO0Oo.OooO0Oo;
        if (o000000Var != null) {
            o000000Var.OooOOOO();
        }
    }

    @Override // com.ninja.engine.o00000O
    public final void OooO0O0() {
        if (this.OooO0oO) {
            return;
        }
        this.OooO0oO = true;
        this.OooO0o0.OooO0oo(this);
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
        return this.OooO0oo;
    }

    @Override // com.ninja.engine.o00000O
    public final CharSequence OooO0o() {
        return this.OooO0Oo.getSubtitle();
    }

    @Override // com.ninja.engine.o00000O
    public final MenuInflater OooO0o0() {
        return new C1271oOoo0OOO(this.OooO0Oo.getContext());
    }

    @Override // com.ninja.engine.o00000O
    public final CharSequence OooO0oO() {
        return this.OooO0Oo.getTitle();
    }

    @Override // com.ninja.engine.o00000O
    public final void OooO0oo() {
        this.OooO0o0.OooO0Oo(this, this.OooO0oo);
    }

    @Override // com.ninja.engine.o00000O
    public final void OooOO0(View view) {
        WeakReference weakReference;
        this.OooO0Oo.setCustomView(view);
        if (view != null) {
            weakReference = new WeakReference(view);
        } else {
            weakReference = null;
        }
        this.OooO0o = weakReference;
    }

    @Override // com.ninja.engine.o00000O
    public final void OooOO0O(int i) {
        OooOO0o(this.OooO0OO.getString(i));
    }

    @Override // com.ninja.engine.o00000O
    public final void OooOO0o(CharSequence charSequence) {
        this.OooO0Oo.setSubtitle(charSequence);
    }

    @Override // com.ninja.engine.o00000O
    public final void OooOOO(CharSequence charSequence) {
        this.OooO0Oo.setTitle(charSequence);
    }

    @Override // com.ninja.engine.o00000O
    public final void OooOOO0(int i) {
        OooOOO(this.OooO0OO.getString(i));
    }

    @Override // com.ninja.engine.o00000O
    public final void OooOOOO(boolean z) {
        this.OooO0O0 = z;
        this.OooO0Oo.setTitleOptional(z);
    }

    @Override // com.ninja.engine.InterfaceC0886oO0oo0o0
    public final boolean OooOo0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, MenuItem menuItem) {
        return this.OooO0o0.OooO0OO(this, menuItem);
    }
}


