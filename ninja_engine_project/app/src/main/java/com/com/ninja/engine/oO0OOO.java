package com.ninja.engine;

import android.view.View;
import android.widget.AdapterView;
/* loaded from: classes.dex */
public final class oO0OOO implements AdapterView.OnItemSelectedListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ oO0OOO(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onItemSelected(AdapterView adapterView, View view, int i, long j) {
        C0432o0Oo0ooO c0432o0Oo0ooO;
        switch (this.OooO00o) {
            case 0:
                if (i != -1 && (c0432o0Oo0ooO = ((C0781oO0OOoO) this.OooO0O0).OooO0OO) != null) {
                    c0432o0Oo0ooO.setListSelectionHidden(false);
                    return;
                }
                return;
            case 1:
                String[] strArr = {"English", "Arabic", "Turkish", "Chinese", "Russian", "Hindi", "Kurdish"};
                if (i >= 0 && i < 7) {
                    C0829oO0o0Ooo c0829oO0o0Ooo = (C0829oO0o0Ooo) this.OooO0O0;
                    c0829oO0o0Ooo.Oooo000().getSharedPreferences("configuration-app", 0).edit().putString("language", strArr[i]).putBoolean("language_user_set", true).apply();
                    c0829oO0o0Ooo.Oooo000().finish();
                    c0829oO0o0Ooo.Oooo0o0(c0829oO0o0Ooo.Oooo000().getPackageManager().getLaunchIntentForPackage(c0829oO0o0Ooo.Oooo000().getPackageName()));
                    return;
                }
                return;
            default:
                String[] strArr2 = {"English", "Arabic", "Turkish", "Chinese", "Russian", "Hindi", "Kurdish"};
                if (i >= 0 && i < 7) {
                    C1201oOoOOO0O c1201oOoOOO0O = (C1201oOoOOO0O) this.OooO0O0;
                    c1201oOoOOO0O.Oooo000().getSharedPreferences("configuration-app", 0).edit().putString("language", strArr2[i]).putBoolean("language_user_set", true).apply();
                    c1201oOoOOO0O.Oooo000().finish();
                    c1201oOoOOO0O.Oooo0o0(c1201oOoOOO0O.Oooo000().getPackageManager().getLaunchIntentForPackage(c1201oOoOOO0O.Oooo000().getPackageName()));
                    return;
                }
                return;
        }
    }

    @Override // android.widget.AdapterView.OnItemSelectedListener
    public final void onNothingSelected(AdapterView adapterView) {
        int i = this.OooO00o;
    }

    private final void OooO00o(AdapterView adapterView) {
    }

    private final void OooO0O0(AdapterView adapterView) {
    }

    private final void OooO0OO(AdapterView adapterView) {
    }
}
