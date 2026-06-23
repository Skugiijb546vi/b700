package androidx.lifecycle;

import android.app.Application;
import android.content.Context;
import android.os.Handler;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC1181oOo0oooO;
import com.ninja.engine.C0131o00O0o;
import com.ninja.engine.C0484o0OoooO;
import com.ninja.engine.C1003oOOOOo0;
import com.ninja.engine.InterfaceC0718oO00OoO;
import com.ninja.engine.oO0O0O0o;
import com.ninja.engine.oO0O0OO;
import com.ninja.engine.oOOOOo00;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public final class ProcessLifecycleInitializer implements InterfaceC0718oO00OoO {
    @Override // com.ninja.engine.InterfaceC0718oO00OoO
    public final List OooO00o() {
        return C0484o0OoooO.OooO00o;
    }

    @Override // com.ninja.engine.InterfaceC0718oO00OoO
    public final Object OooO0O0(Context context) {
        AbstractC0809oO0OooOO.OooOOOo(context, "context");
        C0131o00O0o OooOoo0 = C0131o00O0o.OooOoo0(context);
        AbstractC0809oO0OooOO.OooOOOO(OooOoo0, "getInstance(context)");
        if (((HashSet) OooOoo0.OooO0OO).contains(ProcessLifecycleInitializer.class)) {
            if (!AbstractC1181oOo0oooO.OooO00o.getAndSet(true)) {
                Context applicationContext = context.getApplicationContext();
                AbstractC0809oO0OooOO.OooOOO0(applicationContext, "null cannot be cast to non-null type android.app.Application");
                ((Application) applicationContext).registerActivityLifecycleCallbacks(new oO0O0OO());
            }
            C1003oOOOOo0 c1003oOOOOo0 = C1003oOOOOo0.OooO;
            c1003oOOOOo0.getClass();
            c1003oOOOOo0.OooO0o0 = new Handler();
            c1003oOOOOo0.OooO0o.OooO0Oo(oO0O0O0o.ON_CREATE);
            Context applicationContext2 = context.getApplicationContext();
            AbstractC0809oO0OooOO.OooOOO0(applicationContext2, "null cannot be cast to non-null type android.app.Application");
            ((Application) applicationContext2).registerActivityLifecycleCallbacks(new oOOOOo00(c1003oOOOOo0));
            return c1003oOOOOo0;
        }
        throw new IllegalStateException("ProcessLifecycleInitializer cannot be initialized lazily.\n               Please ensure that you have:\n               <meta-data\n                   android:name='androidx.lifecycle.ProcessLifecycleInitializer'\n                   android:value='androidx.startup' />\n               under InitializationProvider in your AndroidManifest.xml".toString());
    }
}
