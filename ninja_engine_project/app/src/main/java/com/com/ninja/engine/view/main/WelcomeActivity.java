package com.ninja.engine.view.main;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.C0172o00OoOo;
import com.ninja.engine.C0606o0oOoooO;
import com.ninja.engine.C1241oOoOoOOo;
import com.ninja.engine.R;
import com.ninja.engine.o000OO00;
/* loaded from: classes.dex */
public final class WelcomeActivity extends o000OO00 {
    @Override // com.ninja.engine.o000OO00, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        AbstractC0809oO0OooOO.OooOOOo(context, "newBase");
        super.attachBaseContext(AbstractC0692o0ooooOo.OooO0o(context));
    }

    @Override // com.ninja.engine.o000OO00, androidx.activity.OooO00o, com.ninja.engine.AbstractActivityC0301o0O0Oo0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            if (com.ninja.engine.MainActivity.OooO00o == null) {
                com.ninja.engine.MainActivity.OooO00o = getApplicationContext().getSharedPreferences("configuration-app", 0);
            }
        } catch (Exception unused) {
            if (com.ninja.engine.MainActivity.OooO00o == null) {
                com.ninja.engine.MainActivity.OooO00o = getSharedPreferences("configuration-app", 0);
            }
        }
        getWindow().setStatusBarColor(Color.parseColor("#0D0D1A"));
        getWindow().setNavigationBarColor(Color.parseColor("#0A0A1A"));
        setContentView(R.layout.activity_welcome);
        if (bundle == null) {
            C0606o0oOoooO OooOo00 = OooOo00();
            OooOo00.getClass();
            C0172o00OoOo c0172o00OoOo = new C0172o00OoOo(OooOo00);
            c0172o00OoOo.OooO0o0(R.id.fragmentContainerView, new C1241oOoOoOOo(), null, 2);
            c0172o00OoOo.OooO0Oo(false);
        }
    }
}
