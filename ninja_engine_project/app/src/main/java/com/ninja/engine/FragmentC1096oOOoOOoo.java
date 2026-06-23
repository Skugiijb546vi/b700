package com.ninja.engine;

import android.app.Activity;
import android.app.Fragment;
import android.os.Build;
import android.os.Bundle;
/* renamed from: com.ninja.engine.oOOoOOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class FragmentC1096oOOoOOoo extends Fragment {
    public static final /* synthetic */ int OooO0O0 = 0;
    public C0331o0O0oo OooO00o;

    public final void OooO00o(oO0O0O0o oo0o0o0o) {
        if (Build.VERSION.SDK_INT < 29) {
            Activity activity = getActivity();
            AbstractC0809oO0OooOO.OooOOOO(activity, "activity");
            AbstractC1094oOOoOOo0.OooO0o(activity, oo0o0o0o);
        }
    }

    @Override // android.app.Fragment
    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        OooO00o(oO0O0O0o.ON_CREATE);
    }

    @Override // android.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        OooO00o(oO0O0O0o.ON_DESTROY);
        this.OooO00o = null;
    }

    @Override // android.app.Fragment
    public final void onPause() {
        super.onPause();
        OooO00o(oO0O0O0o.ON_PAUSE);
    }

    @Override // android.app.Fragment
    public final void onResume() {
        super.onResume();
        C0331o0O0oo c0331o0O0oo = this.OooO00o;
        if (c0331o0O0oo != null) {
            ((C1003oOOOOo0) c0331o0O0oo.OooO0O0).OooO0O0();
        }
        OooO00o(oO0O0O0o.ON_RESUME);
    }

    @Override // android.app.Fragment
    public final void onStart() {
        super.onStart();
        C0331o0O0oo c0331o0O0oo = this.OooO00o;
        if (c0331o0O0oo != null) {
            C1003oOOOOo0 c1003oOOOOo0 = (C1003oOOOOo0) c0331o0O0oo.OooO0O0;
            int i = c1003oOOOOo0.OooO00o + 1;
            c1003oOOOOo0.OooO00o = i;
            if (i == 1 && c1003oOOOOo0.OooO0Oo) {
                c1003oOOOOo0.OooO0o.OooO0Oo(oO0O0O0o.ON_START);
                c1003oOOOOo0.OooO0Oo = false;
            }
        }
        OooO00o(oO0O0O0o.ON_START);
    }

    @Override // android.app.Fragment
    public final void onStop() {
        super.onStop();
        OooO00o(oO0O0O0o.ON_STOP);
    }
}
