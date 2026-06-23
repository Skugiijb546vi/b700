package com.ninja.engine;

import android.widget.TextView;
import com.android.volley.Response;
import com.android.volley.VolleyError;
/* renamed from: com.ninja.engine.ooOOoOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1825ooOOoOoo implements Response.ErrorListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ TextView OooO0O0;
    public final /* synthetic */ TextView OooO0OO;

    public /* synthetic */ C1825ooOOoOoo(TextView textView, TextView textView2, int i) {
        this.OooO00o = i;
        this.OooO0O0 = textView;
        this.OooO0OO = textView2;
    }

    @Override // com.android.volley.Response.ErrorListener
    public final void onErrorResponse(VolleyError volleyError) {
        switch (this.OooO00o) {
            case 0:
                this.OooO0O0.setVisibility(8);
                this.OooO0OO.setVisibility(0);
                return;
            default:
                this.OooO0O0.setVisibility(8);
                this.OooO0OO.setVisibility(0);
                return;
        }
    }
}


