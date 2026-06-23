package com.ninja.engine;

import android.content.ClipData;
import android.content.ClipDescription;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import com.android.volley.Response;
import com.android.volley.VolleyError;
/* renamed from: com.ninja.engine.o0OoO000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0435o0OoO000 implements Response.ErrorListener, oOO0O0 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ C0435o0OoO000(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    public boolean OooO00o(C0331o0O0oo c0331o0O0oo, int i, Bundle bundle) {
        InterfaceC1982oooOO0 interfaceC1982oooOO0;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 25 && (i & 1) != 0) {
            try {
                ((InterfaceC0721oO00OoOo) c0331o0O0oo.OooO0O0).OooO0oO();
                Parcelable parcelable = (Parcelable) ((InterfaceC0721oO00OoOo) c0331o0O0oo.OooO0O0).OooO0Oo();
                if (bundle == null) {
                    bundle = new Bundle();
                } else {
                    bundle = new Bundle(bundle);
                }
                bundle.putParcelable("androidx.core.view.extra.INPUT_CONTENT_INFO", parcelable);
            } catch (Exception unused) {
                return false;
            }
        }
        ClipDescription OooO0O0 = ((InterfaceC0721oO00OoOo) c0331o0O0oo.OooO0O0).OooO0O0();
        InterfaceC0721oO00OoOo interfaceC0721oO00OoOo = (InterfaceC0721oO00OoOo) c0331o0O0oo.OooO0O0;
        ClipData clipData = new ClipData(OooO0O0, new ClipData.Item(interfaceC0721oO00OoOo.OooO0o0()));
        if (i2 >= 31) {
            interfaceC1982oooOO0 = new o00O(clipData, 2);
        } else {
            C0321o0O0oO0 c0321o0O0oO0 = new C0321o0O0oO0();
            c0321o0O0oO0.OooO0O0 = clipData;
            c0321o0O0oO0.OooO0OO = 2;
            interfaceC1982oooOO0 = c0321o0O0oO0;
        }
        interfaceC1982oooOO0.OooOo0(interfaceC0721oO00OoOo.OooO0oo());
        interfaceC1982oooOO0.OooOO0O(bundle);
        if (AbstractC1460oo0O00oo.OooOO0o((View) this.OooO0O0, interfaceC1982oooOO0.OooO0oo()) != null) {
            return false;
        }
        return true;
    }

    @Override // com.android.volley.Response.ErrorListener
    public void onErrorResponse(VolleyError volleyError) {
        switch (this.OooO00o) {
            case 1:
                ((C0792oO0Oo0Oo) this.OooO0O0).getClass();
                if (volleyError.getCause() != null) {
                    volleyError.getCause();
                    return;
                } else {
                    new Exception(volleyError.toString());
                    return;
                }
            default:
                ((C0829oO0o0Ooo) this.OooO0O0).Oooo000().finish();
                return;
        }
    }
}


