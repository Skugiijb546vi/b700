package com.ninja.engine;

import android.content.Intent;
import android.net.Uri;
import android.os.ConditionVariable;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.app.framework.app.BActivityThread;
import java.io.File;
/* loaded from: classes.dex */
public final /* synthetic */ class o00Oo00 implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;
    public final /* synthetic */ Object OooO0OO;
    public final /* synthetic */ Object OooO0Oo;
    public final /* synthetic */ Object OooO0o0;

    public /* synthetic */ o00Oo00(Object obj, Object obj2, Object obj3, Object obj4, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
        this.OooO0Oo = obj3;
        this.OooO0o0 = obj4;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean canRequestPackageInstalls;
        switch (this.OooO00o) {
            case 0:
                ((BActivityThread) this.OooO0O0).lambda$bindApplication$0((String) this.OooO0OO, (String) this.OooO0Oo, (ConditionVariable) this.OooO0o0);
                return;
            default:
                File file = (File) this.OooO0Oo;
                Button button = (Button) this.OooO0o0;
                C0792oO0Oo0Oo c0792oO0Oo0Oo = (C0792oO0Oo0Oo) ((oOO00OOO) this.OooO0O0).OooO0Oo;
                ((View) this.OooO0OO).setVisibility(8);
                try {
                    try {
                        canRequestPackageInstalls = c0792oO0Oo0Oo.Oooo000().getPackageManager().canRequestPackageInstalls();
                        if (!canRequestPackageInstalls) {
                            c0792oO0Oo0Oo.Oooo0o0(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + c0792oO0Oo0Oo.Oooo000().getPackageName())));
                        } else {
                            Intent intent = new Intent("android.intent.action.INSTALL_PACKAGE");
                            intent.addFlags(1);
                            intent.addFlags(67108864);
                            intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
                            o000OO00 Oooo000 = c0792oO0Oo0Oo.Oooo000();
                            intent.setData(FileProvider.OooO0Oo(Oooo000, c0792oO0Oo0Oo.Oooo000().getPackageName() + ".provider", file));
                            c0792oO0Oo0Oo.Oooo0o0(intent);
                        }
                    } catch (Exception unused) {
                        c0792oO0Oo0Oo.getClass();
                        Toast.makeText(c0792oO0Oo0Oo.OooO(), c0792oO0Oo0Oo.OooOOO0(R.string.something_went_wrong), 0).show();
                    }
                    button.setClickable(true);
                    button.setEnabled(true);
                    return;
                } catch (Throwable th) {
                    button.setClickable(true);
                    button.setEnabled(true);
                    throw th;
                }
        }
    }
}


