package androidx.emoji2.text;

import android.content.Context;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import androidx.lifecycle.OooO00o;
import androidx.lifecycle.ProcessLifecycleInitializer;
import com.ninja.engine.AbstractC0310o0O0Oooo;
import com.ninja.engine.AbstractC0462o0OoOoo;
import com.ninja.engine.C0131o00O0o;
import com.ninja.engine.C0393o0OOoOo;
import com.ninja.engine.C0469o0Ooo00O;
import com.ninja.engine.InterfaceC0363o0OOOo;
import com.ninja.engine.InterfaceC0718oO00OoO;
import com.ninja.engine.InterfaceC0760oO0O0o0O;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
/* loaded from: classes.dex */
public class EmojiCompatInitializer implements InterfaceC0718oO00OoO {
    @Override // com.ninja.engine.InterfaceC0718oO00OoO
    public final List OooO00o() {
        return Collections.singletonList(ProcessLifecycleInitializer.class);
    }

    @Override // com.ninja.engine.InterfaceC0718oO00OoO
    public final /* bridge */ /* synthetic */ Object OooO0O0(Context context) {
        OooO0OO(context);
        return Boolean.TRUE;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.o0oOOoOO, com.ninja.engine.o0OoOoo] */
    public final void OooO0OO(Context context) {
        AbstractC0462o0OoOoo abstractC0462o0OoOoo = new AbstractC0462o0OoOoo(new C0393o0OOoOo(context));
        abstractC0462o0OoOoo.OooO00o = 1;
        if (C0469o0Ooo00O.OooOO0O == null) {
            synchronized (C0469o0Ooo00O.OooOO0) {
                try {
                    if (C0469o0Ooo00O.OooOO0O == null) {
                        C0469o0Ooo00O.OooOO0O = new C0469o0Ooo00O(abstractC0462o0OoOoo);
                    }
                } finally {
                }
            }
        }
        OooO0Oo(context);
    }

    public final void OooO0Oo(Context context) {
        Object obj;
        C0131o00O0o OooOoo0 = C0131o00O0o.OooOoo0(context);
        OooOoo0.getClass();
        synchronized (C0131o00O0o.OooO0o) {
            try {
                obj = ((HashMap) OooOoo0.OooO0O0).get(ProcessLifecycleInitializer.class);
                if (obj == null) {
                    obj = OooOoo0.OooOOOo(ProcessLifecycleInitializer.class, new HashSet());
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        final OooO00o OooO0o0 = ((InterfaceC0760oO0O0o0O) obj).OooO0o0();
        OooO0o0.OooO00o(new InterfaceC0363o0OOOo() { // from class: androidx.emoji2.text.EmojiCompatInitializer.1
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.lang.Runnable] */
            @Override // com.ninja.engine.InterfaceC0363o0OOOo
            public final void OooO00o() {
                Handler handler;
                EmojiCompatInitializer.this.getClass();
                if (Build.VERSION.SDK_INT >= 28) {
                    handler = AbstractC0310o0O0Oooo.OooO00o(Looper.getMainLooper());
                } else {
                    handler = new Handler(Looper.getMainLooper());
                }
                handler.postDelayed(new Object(), 500L);
                OooO0o0.OooO0o(this);
            }
        });
    }
}
