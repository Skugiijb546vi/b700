package com.app.framework.proxy;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import com.app.framework.BlackBoxCore;
import com.app.framework.fake.hook.HookManager;
import com.app.framework.fake.service.HCallbackProxy;
import com.app.framework.proxy.record.ProxyActivityRecord;
/* loaded from: classes.dex */
public class ProxyActivity extends Activity {
    public static final String TAG = "ProxyActivity";

    /* loaded from: classes.dex */
    public static class P0 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P1 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P10 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P11 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P12 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P13 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P14 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P15 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P16 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P17 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P18 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P19 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P2 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P20 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P21 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P22 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P23 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P24 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P25 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P26 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P27 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P28 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P29 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P3 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P30 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P31 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P32 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P33 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P34 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P35 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P36 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P37 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P38 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P39 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P4 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P40 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P41 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P42 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P43 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P44 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P45 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P46 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P47 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P48 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P49 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P5 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P6 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P7 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P8 extends ProxyActivity {
    }

    /* loaded from: classes.dex */
    public static class P9 extends ProxyActivity {
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        finish();
        HookManager.get().checkEnv(HCallbackProxy.class);
        ProxyActivityRecord create = ProxyActivityRecord.create(getIntent());
        Intent intent = create.mTarget;
        if (intent != null) {
            intent.setExtrasClassLoader(BlackBoxCore.getApplication().getClassLoader());
            startActivity(create.mTarget);
        }
    }
}
