package com.ninja.engine;

import android.content.ClipDescription;
import android.net.Uri;
import android.view.inputmethod.InputContentInfo;
/* renamed from: com.ninja.engine.oO0oOOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0859oO0oOOOo implements InterfaceC0721oO00OoOo {
    public final InputContentInfo OooO00o;

    public C0859oO0oOOOo(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.OooO00o = new InputContentInfo(uri, clipDescription, uri2);
    }

    @Override // com.ninja.engine.InterfaceC0721oO00OoOo
    public final ClipDescription OooO0O0() {
        return this.OooO00o.getDescription();
    }

    @Override // com.ninja.engine.InterfaceC0721oO00OoOo
    public final Object OooO0Oo() {
        return this.OooO00o;
    }

    @Override // com.ninja.engine.InterfaceC0721oO00OoOo
    public final Uri OooO0o0() {
        return this.OooO00o.getContentUri();
    }

    @Override // com.ninja.engine.InterfaceC0721oO00OoOo
    public final void OooO0oO() {
        this.OooO00o.requestPermission();
    }

    @Override // com.ninja.engine.InterfaceC0721oO00OoOo
    public final Uri OooO0oo() {
        return this.OooO00o.getLinkUri();
    }

    public C0859oO0oOOOo(Object obj) {
        this.OooO00o = (InputContentInfo) obj;
    }
}
