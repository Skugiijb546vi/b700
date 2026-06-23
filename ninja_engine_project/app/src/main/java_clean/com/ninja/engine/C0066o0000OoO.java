package com.ninja.engine;

import android.content.DialogInterface;
import android.view.View;
import android.widget.AdapterView;
/* renamed from: com.ninja.engine.o0000OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0066o0000OoO implements AdapterView.OnItemClickListener {
    public final /* synthetic */ C0068o0000o OooO00o;
    public final /* synthetic */ C0069o0000o0 OooO0O0;

    public C0066o0000OoO(C0069o0000o0 c0069o0000o0, C0068o0000o c0068o0000o) {
        this.OooO0O0 = c0069o0000o0;
        this.OooO00o = c0068o0000o;
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        C0069o0000o0 c0069o0000o0 = this.OooO0O0;
        DialogInterface.OnClickListener onClickListener = c0069o0000o0.OooO0oo;
        C0068o0000o c0068o0000o = this.OooO00o;
        onClickListener.onClick(c0068o0000o.OooO0O0, i);
        if (!c0069o0000o0.OooOO0) {
            c0068o0000o.OooO0O0.dismiss();
        }
    }
}


