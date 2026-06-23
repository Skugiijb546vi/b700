package com.ninja.engine;

import android.content.Intent;
import android.net.Uri;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.ninja.engine.view.update.UpdateRequiredActivity;
import java.io.File;
import java.util.concurrent.ThreadPoolExecutor;
/* renamed from: com.ninja.engine.o0oOO0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0564o0oOO0Oo implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;
    public final /* synthetic */ Object OooO0OO;
    public final /* synthetic */ Object OooO0Oo;

    public /* synthetic */ RunnableC0564o0oOO0Oo(Object obj, Object obj2, Object obj3, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
        this.OooO0Oo = obj3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        boolean canRequestPackageInstalls;
        switch (this.OooO00o) {
            case 0:
                C0393o0OOoOo c0393o0OOoOo = (C0393o0OOoOo) this.OooO0O0;
                AbstractC0809oO0OooOO abstractC0809oO0OooOO = (AbstractC0809oO0OooOO) this.OooO0OO;
                ThreadPoolExecutor threadPoolExecutor = (ThreadPoolExecutor) this.OooO0Oo;
                c0393o0OOoOo.getClass();
                try {
                    C0568o0oOOoOO OooOOO = AbstractC0694o0ooooo0.OooOOO(c0393o0OOoOo.OooO0O0);
                    if (OooOOO != null) {
                        C0558o0o0Ooo0 c0558o0o0Ooo0 = (C0558o0o0Ooo0) ((InterfaceC0467o0Ooo00) OooOOO.OooO0O0);
                        synchronized (c0558o0o0Ooo0.OooO0Oo) {
                            c0558o0o0Ooo0.OooO0o = threadPoolExecutor;
                        }
                        ((InterfaceC0467o0Ooo00) OooOOO.OooO0O0).OooO0O0(new C0595o0oOoOoo(abstractC0809oO0OooOO, threadPoolExecutor));
                        return;
                    }
                    throw new RuntimeException("EmojiCompat font provider not available on this device.");
                } catch (Throwable th) {
                    abstractC0809oO0OooOO.o000oOoO(th);
                    threadPoolExecutor.shutdown();
                    return;
                }
            case 1:
                C1006oOOOOoOO c1006oOOOOoOO = (C1006oOOOOoOO) this.OooO0O0;
                long j = c1006oOOOOoOO.OooO0O0;
                LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) this.OooO0OO;
                TextView textView = (TextView) this.OooO0Oo;
                long j2 = 0;
                if (j <= 0) {
                    linearProgressIndicator.setProgress(0);
                    str = "0%";
                } else {
                    long j3 = 100;
                    long j4 = (c1006oOOOOoOO.OooO00o * 100) / j;
                    if (j4 >= 0) {
                        j2 = j4;
                    }
                    if (j2 <= 100) {
                        j3 = j2;
                    }
                    linearProgressIndicator.setProgress((int) j3);
                    str = j3 + "%";
                }
                textView.setText(str);
                return;
            default:
                UpdateRequiredActivity updateRequiredActivity = (UpdateRequiredActivity) this.OooO0O0;
                AbstractC0809oO0OooOO.OooOOOo(updateRequiredActivity, "this$0");
                File file = (File) this.OooO0OO;
                AbstractC0809oO0OooOO.OooOOOo(file, "$file");
                Button button = (Button) this.OooO0Oo;
                AbstractC0809oO0OooOO.OooOOOo(button, "$downloadBtn");
                try {
                    try {
                        updateRequiredActivity.OooOo = file;
                        updateRequiredActivity.OooOoo0 = false;
                        updateRequiredActivity.OooOoo0();
                        canRequestPackageInstalls = updateRequiredActivity.getPackageManager().canRequestPackageInstalls();
                        if (!canRequestPackageInstalls) {
                            updateRequiredActivity.OooOoO0 = true;
                            updateRequiredActivity.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + updateRequiredActivity.getPackageName())));
                        } else {
                            updateRequiredActivity.OooOoo(file);
                        }
                    } catch (Exception unused) {
                        updateRequiredActivity.OooOoo0 = false;
                        updateRequiredActivity.OooOoo0();
                        Toast.makeText(updateRequiredActivity, updateRequiredActivity.getString(R.string.something_went_wrong), 0).show();
                    }
                    button.setClickable(true);
                    button.setEnabled(true);
                    updateRequiredActivity.OooOooO();
                    return;
                } catch (Throwable th2) {
                    button.setClickable(true);
                    button.setEnabled(true);
                    updateRequiredActivity.OooOooO();
                    throw th2;
                }
        }
    }
}


