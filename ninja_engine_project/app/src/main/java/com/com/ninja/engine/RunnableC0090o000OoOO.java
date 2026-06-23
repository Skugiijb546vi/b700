package com.ninja.engine;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.IBinder;
import android.os.IInterface;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;
import com.app.framework.app.BActivityThread;
import com.app.framework.core.system.location.BLocationManagerService;
import com.app.framework.entity.am.ReceiverData;
import com.app.framework.entity.location.BLocation;
import com.ninja.engine.view.update.UpdateRequiredActivity;
/* renamed from: com.ninja.engine.o000OoOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0090o000OoOO implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;
    public final /* synthetic */ Object OooO0OO;

    public /* synthetic */ RunnableC0090o000OoOO(Object obj, int i, Object obj2) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                Runnable runnable = (Runnable) this.OooO0OO;
                ExecutorC0091o000OoOo executorC0091o000OoOo = (ExecutorC0091o000OoOo) this.OooO0O0;
                executorC0091o000OoOo.getClass();
                try {
                    runnable.run();
                    return;
                } finally {
                    executorC0091o000OoOo.OooO00o();
                }
            case 1:
                ((BActivityThread) this.OooO0O0).lambda$scheduleReceiver$3((ReceiverData) this.OooO0OO);
                return;
            case 2:
                BActivityThread.lambda$handleNewIntent$2((Intent) this.OooO0O0, (IBinder) this.OooO0OO);
                return;
            case 3:
                BLocationManagerService.OooO00o((IInterface) this.OooO0O0, (BLocation) this.OooO0OO);
                return;
            case 4:
                BLocationManagerService.OooO0O0((BLocationManagerService) this.OooO0O0, (IBinder) this.OooO0OO);
                return;
            case 5:
                C0792oO0Oo0Oo c0792oO0Oo0Oo = (C0792oO0Oo0Oo) this.OooO0O0;
                String str = (String) this.OooO0OO;
                c0792oO0Oo0Oo.OoooOo0 = false;
                if (c0792oO0Oo0Oo.OooOOOo()) {
                    if (str != null) {
                        c0792oO0Oo0Oo.OoooOO0.setText(str);
                        Toast.makeText(c0792oO0Oo0Oo.OooO(), str, 1).show();
                        c0792oO0Oo0Oo.OoooOOo.setEnabled(false);
                        c0792oO0Oo0Oo.OoooOOo.setText(R.string.game_not_found);
                        return;
                    }
                    c0792oO0Oo0Oo.OoooOo0();
                    return;
                }
                return;
            case 6:
                ((View) this.OooO0O0).setVisibility(8);
                Button button = (Button) this.OooO0OO;
                button.setText(R.string.download_failed);
                button.setClickable(true);
                button.setEnabled(true);
                return;
            case 7:
                ((AbstractC1137oOOoooO) this.OooO0O0).OooOO0O((Typeface) this.OooO0OO);
                return;
            case 8:
                int i = UpdateRequiredActivity.Oooo000;
                UpdateRequiredActivity updateRequiredActivity = (UpdateRequiredActivity) this.OooO0OO;
                AbstractC0809oO0OooOO.OooOOOo(updateRequiredActivity, "this$0");
                C1006oOOOOoOO c1006oOOOOoOO = (C1006oOOOOoOO) this.OooO0O0;
                long j = c1006oOOOOoOO.OooO0O0;
                long j2 = 0;
                if (j <= 0) {
                    updateRequiredActivity.OooOooo(0);
                    return;
                }
                long j3 = 100;
                long j4 = (c1006oOOOOoOO.OooO00o * 100) / j;
                if (j4 >= 0) {
                    j2 = j4;
                }
                if (j2 <= 100) {
                    j3 = j2;
                }
                updateRequiredActivity.OooOooo((int) j3);
                return;
            default:
                UpdateRequiredActivity updateRequiredActivity2 = (UpdateRequiredActivity) this.OooO0O0;
                AbstractC0809oO0OooOO.OooOOOo(updateRequiredActivity2, "this$0");
                Button button2 = (Button) this.OooO0OO;
                AbstractC0809oO0OooOO.OooOOOo(button2, "$downloadBtn");
                updateRequiredActivity2.OooOoo0 = false;
                updateRequiredActivity2.OooOoo0();
                button2.setText(R.string.download_failed);
                button2.setClickable(true);
                button2.setEnabled(true);
                return;
        }
    }
}
