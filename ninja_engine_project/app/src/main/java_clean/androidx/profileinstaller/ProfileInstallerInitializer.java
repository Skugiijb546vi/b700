package androidx.profileinstaller;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import androidx.profileinstaller.ProfileInstallerInitializer;
import com.android.volley.toolbox.ImageRequest;
import com.ninja.engine.C0919oOO00oOo;
import com.ninja.engine.InterfaceC0718oO00OoO;
import java.util.Collections;
import java.util.List;
import java.util.Random;
/* loaded from: classes.dex */
public class ProfileInstallerInitializer implements InterfaceC0718oO00OoO {
    @Override // com.ninja.engine.InterfaceC0718oO00OoO
    public final List OooO00o() {
        return Collections.emptyList();
    }

    @Override // com.ninja.engine.InterfaceC0718oO00OoO
    public final Object OooO0O0(Context context) {
        if (Build.VERSION.SDK_INT < 24) {
            return new C0919oOO00oOo(6);
        }
        final Context applicationContext = context.getApplicationContext();
        Choreographer.getInstance().postFrameCallback(new Choreographer.FrameCallback() { // from class: com.ninja.engine.oOOOOo
            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j) {
                Handler handler;
                ProfileInstallerInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = Handler.createAsync(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new RunnableC0087o000Oo0O(applicationContext, 2), new Random().nextInt(Math.max((int) ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, 1)) + 5000);
            }
        });
        return new C0919oOO00oOo(6);
    }
}


