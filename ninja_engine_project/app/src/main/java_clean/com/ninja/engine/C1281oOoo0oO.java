package com.ninja.engine;

import android.content.Context;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.View;
/* renamed from: com.ninja.engine.oOoo0oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1281oOoo0oO extends ActionMode {
    public final Context OooO00o;
    public final o00000O OooO0O0;

    public C1281oOoo0oO(Context context, o00000O o00000o) {
        this.OooO00o = context;
        this.OooO0O0 = o00000o;
    }

    @Override // android.view.ActionMode
    public final void finish() {
        this.OooO0O0.OooO0O0();
    }

    @Override // android.view.ActionMode
    public final View getCustomView() {
        return this.OooO0O0.OooO0OO();
    }

    @Override // android.view.ActionMode
    public final Menu getMenu() {
        return new oOO00000(this.OooO00o, this.OooO0O0.OooO0Oo());
    }

    @Override // android.view.ActionMode
    public final MenuInflater getMenuInflater() {
        return this.OooO0O0.OooO0o0();
    }

    @Override // android.view.ActionMode
    public final CharSequence getSubtitle() {
        return this.OooO0O0.OooO0o();
    }

    @Override // android.view.ActionMode
    public final Object getTag() {
        return this.OooO0O0.OooO00o;
    }

    @Override // android.view.ActionMode
    public final CharSequence getTitle() {
        return this.OooO0O0.OooO0oO();
    }

    @Override // android.view.ActionMode
    public final boolean getTitleOptionalHint() {
        return this.OooO0O0.OooO0O0;
    }

    @Override // android.view.ActionMode
    public final void invalidate() {
        this.OooO0O0.OooO0oo();
    }

    @Override // android.view.ActionMode
    public final boolean isTitleOptional() {
        return this.OooO0O0.OooO();
    }

    @Override // android.view.ActionMode
    public final void setCustomView(View view) {
        this.OooO0O0.OooOO0(view);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(int i) {
        this.OooO0O0.OooOO0O(i);
    }

    @Override // android.view.ActionMode
    public final void setTag(Object obj) {
        this.OooO0O0.OooO00o = obj;
    }

    @Override // android.view.ActionMode
    public final void setTitle(int i) {
        this.OooO0O0.OooOOO0(i);
    }

    @Override // android.view.ActionMode
    public final void setTitleOptionalHint(boolean z) {
        this.OooO0O0.OooOOOO(z);
    }

    @Override // android.view.ActionMode
    public final void setSubtitle(CharSequence charSequence) {
        this.OooO0O0.OooOO0o(charSequence);
    }

    @Override // android.view.ActionMode
    public final void setTitle(CharSequence charSequence) {
        this.OooO0O0.OooOOO(charSequence);
    }
}


