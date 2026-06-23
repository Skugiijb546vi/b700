package com.ninja.engine.view.main;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.view.MotionEvent;
import android.view.View;
import com.app.framework.BlackBoxCore;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1268oOoo0O0O;
import com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0;
import com.ninja.engine.C0172o00OoOo;
import com.ninja.engine.C0435o0OoO000;
import com.ninja.engine.C0606o0oOoooO;
import com.ninja.engine.C0614o0oo00o;
import com.ninja.engine.C0792oO0Oo0Oo;
import com.ninja.engine.C1119oOOoo0oO;
import com.ninja.engine.C1201oOoOOO0O;
import com.ninja.engine.C1741ooOO;
import com.ninja.engine.R;
import com.ninja.engine.o000OO00;
/* loaded from: classes.dex */
public final class MainActivity extends o000OO00 {
    public static final /* synthetic */ int OooOooO = 0;
    public BottomNavigationView OooOo;
    public final C1741ooOO OooOoO;
    public final C0792oO0Oo0Oo OooOoO0;
    public final C1119oOOoo0oO OooOoOO;
    public AbstractComponentCallbacksC0593o0oOoOo0 OooOoo;
    public final C1201oOoOOO0O OooOoo0;

    public MainActivity() {
        C0792oO0Oo0Oo c0792oO0Oo0Oo = new C0792oO0Oo0Oo();
        this.OooOoO0 = c0792oO0Oo0Oo;
        this.OooOoO = new C1741ooOO();
        this.OooOoOO = new C1119oOOoo0oO();
        this.OooOoo0 = new C1201oOoOOO0O();
        this.OooOoo = c0792oO0Oo0Oo;
    }

    public final void OooOoo0(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0) {
        if (AbstractC0809oO0OooOO.OooO0o0(abstractComponentCallbacksC0593o0oOoOo0, this.OooOoo)) {
            return;
        }
        C0606o0oOoooO OooOo00 = OooOo00();
        OooOo00.getClass();
        C0172o00OoOo c0172o00OoOo = new C0172o00OoOo(OooOo00);
        c0172o00OoOo.OooO0oO(this.OooOoo);
        C0606o0oOoooO c0606o0oOoooO = abstractComponentCallbacksC0593o0oOoOo0.OooOOo;
        if (c0606o0oOoooO != null && c0606o0oOoooO != c0172o00OoOo.OooOOOo) {
            throw new IllegalStateException("Cannot show Fragment attached to a different FragmentManager. Fragment " + abstractComponentCallbacksC0593o0oOoOo0.toString() + " is already attached to a FragmentManager.");
        }
        c0172o00OoOo.OooO0O0(new C0614o0oo00o(5, abstractComponentCallbacksC0593o0oOoOo0));
        c0172o00OoOo.OooO0Oo(false);
        this.OooOoo = abstractComponentCallbacksC0593o0oOoOo0;
    }

    @Override // com.ninja.engine.o000OO00, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        AbstractC0809oO0OooOO.OooOOOo(context, "newBase");
        super.attachBaseContext(AbstractC0692o0ooooOo.OooO0o(context));
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        try {
            return super.dispatchTouchEvent(motionEvent);
        } catch (SecurityException e) {
            String message = e.getMessage();
            if (message != null && AbstractC1268oOoo0O0O.OooOoo0(2, message, "doesn't match source uid", false) >= 0) {
                e.getMessage();
                return false;
            }
            throw e;
        }
    }

    @Override // com.ninja.engine.o000OO00, androidx.activity.OooO00o, com.ninja.engine.AbstractActivityC0301o0O0Oo0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        try {
            BlackBoxCore.get().onBeforeMainActivityOnCreate(this);
        } catch (Exception e) {
            e.getMessage();
        }
        getWindow().setStatusBarColor(Color.parseColor("#0D0D1A"));
        getWindow().setNavigationBarColor(Color.parseColor("#0F0F1E"));
        setContentView(R.layout.activity_main);
        View findViewById = findViewById(R.id.bottom_navigation);
        AbstractC0809oO0OooOO.OooOOOO(findViewById, "findViewById(...)");
        this.OooOo = (BottomNavigationView) findViewById;
        Bundle extras = getIntent().getExtras();
        C0792oO0Oo0Oo c0792oO0Oo0Oo = this.OooOoO0;
        C1201oOoOOO0O c1201oOoOOO0O = this.OooOoo0;
        C1741ooOO c1741ooOO = this.OooOoO;
        if (extras != null) {
            Bundle bundle2 = new Bundle(extras);
            c0792oO0Oo0Oo.Oooo0OO(bundle2);
            c1741ooOO.Oooo0OO(bundle2);
            c1201oOoOOO0O.Oooo0OO(bundle2);
        }
        if (bundle == null) {
            C0606o0oOoooO OooOo00 = OooOo00();
            OooOo00.getClass();
            C0172o00OoOo c0172o00OoOo = new C0172o00OoOo(OooOo00);
            c0172o00OoOo.OooO0o0(R.id.fragment_container, c1201oOoOOO0O, "settings", 1);
            c0172o00OoOo.OooO0oO(c1201oOoOOO0O);
            C1119oOOoo0oO c1119oOOoo0oO = this.OooOoOO;
            c0172o00OoOo.OooO0o0(R.id.fragment_container, c1119oOOoo0oO, "resellers", 1);
            c0172o00OoOo.OooO0oO(c1119oOOoo0oO);
            c0172o00OoOo.OooO0o0(R.id.fragment_container, c1741ooOO, "account", 1);
            c0172o00OoOo.OooO0oO(c1741ooOO);
            c0172o00OoOo.OooO0o0(R.id.fragment_container, c0792oO0Oo0Oo, "home", 1);
            c0172o00OoOo.OooO0Oo(false);
        }
        BottomNavigationView bottomNavigationView = this.OooOo;
        if (bottomNavigationView != null) {
            bottomNavigationView.setOnItemSelectedListener(new C0435o0OoO000(4, this));
            try {
                BlackBoxCore.get().onAfterMainActivityOnCreate(this);
                return;
            } catch (Exception e2) {
                e2.getMessage();
                return;
            }
        }
        AbstractC0809oO0OooOO.o00oO0o("bottomNav");
        throw null;
    }
}


