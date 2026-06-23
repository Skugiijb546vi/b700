package com.ninja.engine.app;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;
import android.os.Build;
import android.webkit.WebView;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.system.user.BUserHandle;
import com.ninja.engine.AbstractC0140o00O0oo0;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.C0215o00o0o0o;
import com.ninja.engine.C0303o0O0Oo0o;
import com.ninja.engine.C0331o0O0oo;
import com.ninja.engine.C0415o0Oo0O0O;
import com.ninja.engine.C1278oOoo0o00;
import com.ninja.engine.MainActivity;
import com.ninja.engine.RunnableC1402oo00OOOO;
import com.ninja.engine.encryption.EncryptorInstance;
import com.ninja.engine.o00O;
import com.ninja.engine.o0OOOO00;
/* loaded from: classes.dex */
public final class App extends Application {
    public static volatile Context OooO00o;

    @Override // android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        try {
            super.attachBaseContext(context);
            AbstractC0809oO0OooOO.OooOO0o(context);
            OooO00o = context;
            try {
                BlackBoxCore.get().earlyBootstrap(context);
            } catch (Exception e) {
                e.getMessage();
            }
            if (AbstractC0694o0ooooo0.OooOooo(context)) {
                if (Build.VERSION.SDK_INT >= 28) {
                    WebView.setDataDirectorySuffix("webview");
                    return;
                }
                return;
            }
            try {
                BlackBoxCore.get().closeCodeInit();
            } catch (Exception e2) {
                e2.getMessage();
            }
            try {
                BlackBoxCore.get().onBeforeMainApplicationAttach(this, context);
            } catch (Exception e3) {
                e3.getMessage();
            }
            try {
                SharedPreferences sharedPreferences = MainActivity.OooO00o;
                MainActivity.OooO00o = context.getApplicationContext().getSharedPreferences("configuration-app", 0);
            } catch (Exception e4) {
                e4.getMessage();
            }
            try {
                String TextDecryptor = EncryptorInstance.TextDecryptor(MainActivity.getURL(1));
                String TextDecryptor2 = EncryptorInstance.TextDecryptor(MainActivity.getApplicationInfo(3));
                BlackBoxCore.setLogcatUploadUrl(TextDecryptor + TextDecryptor2 + "/upload/logcat.php");
            } catch (Exception e5) {
                e5.getMessage();
            }
            try {
                AbstractC0140o00O0oo0.OooO00o(context);
            } catch (Exception e6) {
                e6.getMessage();
            }
            try {
                BlackBoxCore.get().onAfterMainApplicationAttach(this, context);
            } catch (Exception e7) {
                e7.getMessage();
            }
        } catch (Exception e8) {
            e8.getMessage();
            if (context != null) {
                OooO00o = context;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v4, types: [java.lang.Object, java.lang.Runnable] */
    @Override // android.app.Application
    public final void onCreate() {
        try {
            super.onCreate();
            Object obj = new Object();
            Context applicationContext = getApplicationContext();
            C0303o0O0Oo0o c0303o0O0Oo0o = C0303o0O0Oo0o.OooO0o;
            c0303o0O0Oo0o.OooO00o = BUserHandle.AID_CACHE_GID_START;
            c0303o0O0Oo0o.OooO0O0 = BUserHandle.AID_CACHE_GID_START;
            c0303o0O0Oo0o.OooO0OO = "PRDownloader";
            c0303o0O0Oo0o.OooO0Oo = obj;
            c0303o0O0Oo0o.OooO0o0 = new o00O(applicationContext, 3);
            ((o0OOOO00) C0331o0O0oo.OooOoO().OooO0O0).OooO0O0.execute(new RunnableC1402oo00OOOO());
            C0415o0Oo0O0O.OooOoo0();
            Context context = OooO00o;
            if (context != null) {
                if (AbstractC0694o0ooooo0.OooOooo(context)) {
                    return;
                }
                C1278oOoo0o00 c1278oOoo0o00 = AbstractC0140o00O0oo0.OooO00o;
                if (OooO00o != null) {
                    try {
                        ((C0215o00o0o0o) AbstractC0140o00O0oo0.OooO00o.OooO00o()).getClass();
                        try {
                            BlackBoxCore.get().doCreate();
                            BlackBoxCore.get().addServiceAvailableCallback(new Object());
                        } catch (Exception e) {
                            e.getMessage();
                        }
                        return;
                    } catch (Exception e2) {
                        e2.getMessage();
                        return;
                    }
                }
                AbstractC0809oO0OooOO.o00oO0o("mContext");
                throw null;
            }
            AbstractC0809oO0OooOO.o00oO0o("mContext");
            throw null;
        } catch (Exception e3) {
            e3.getMessage();
        }
    }
}
