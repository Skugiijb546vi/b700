package com.app.framework.proxy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.app.framework.BlackBoxCore;
import com.app.framework.proxy.record.ProxyPendingRecord;
import java.util.Objects;
/* loaded from: classes.dex */
public class ProxyPendingActivity extends Activity {
    public static final String TAG = "ProxyPendingActivity";

    /* loaded from: classes.dex */
    public static class P0 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P1 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P10 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P11 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P12 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P13 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P14 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P15 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P16 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P17 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P18 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P19 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P2 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P20 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P21 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P22 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P23 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P24 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P25 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P26 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P27 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P28 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P29 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P3 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P30 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P31 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P32 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P33 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P34 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P35 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P36 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P37 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P38 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P39 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P4 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P40 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P41 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P42 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P43 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P44 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P45 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P46 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P47 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P48 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P49 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P5 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P6 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P7 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P8 extends ProxyPendingActivity {
    }

    /* loaded from: classes.dex */
    public static class P9 extends ProxyPendingActivity {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
        ProxyPendingRecord create = ProxyPendingRecord.create(getIntent());
        Objects.toString(create);
        Intent intent = create.mTarget;
        if (intent == null) {
            return;
        }
        intent.addFlags(268435456);
        create.mTarget.setExtrasClassLoader(BlackBoxCore.getApplication().getClassLoader());
        startActivity(create.mTarget);
    }
}


