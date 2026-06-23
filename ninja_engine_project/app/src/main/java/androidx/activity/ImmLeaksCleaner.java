package androidx.activity;

import android.app.Activity;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import com.ninja.engine.InterfaceC0760oO0O0o0O;
import com.ninja.engine.InterfaceC1800ooOOOoOo;
import com.ninja.engine.oO0O0O0o;
import java.lang.reflect.Field;
/* loaded from: classes.dex */
final class ImmLeaksCleaner implements InterfaceC1800ooOOOoOo {
    public static int OooO0O0;
    public static Field OooO0OO;
    public static Field OooO0Oo;
    public static Field OooO0o0;
    public Activity OooO00o;

    @Override // com.ninja.engine.InterfaceC1800ooOOOoOo
    public final void OooO0O0(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, oO0O0O0o oo0o0o0o) {
        if (oo0o0o0o != oO0O0O0o.ON_DESTROY) {
            return;
        }
        if (OooO0O0 == 0) {
            try {
                OooO0O0 = 2;
                Field declaredField = InputMethodManager.class.getDeclaredField("mServedView");
                OooO0Oo = declaredField;
                declaredField.setAccessible(true);
                Field declaredField2 = InputMethodManager.class.getDeclaredField("mNextServedView");
                OooO0o0 = declaredField2;
                declaredField2.setAccessible(true);
                Field declaredField3 = InputMethodManager.class.getDeclaredField("mH");
                OooO0OO = declaredField3;
                declaredField3.setAccessible(true);
                OooO0O0 = 1;
            } catch (NoSuchFieldException unused) {
            }
        }
        if (OooO0O0 == 1) {
            InputMethodManager inputMethodManager = (InputMethodManager) this.OooO00o.getSystemService("input_method");
            try {
                Object obj = OooO0OO.get(inputMethodManager);
                if (obj == null) {
                    return;
                }
                synchronized (obj) {
                    try {
                        try {
                            View view = (View) OooO0Oo.get(inputMethodManager);
                            if (view == null) {
                                return;
                            }
                            if (view.isAttachedToWindow()) {
                                return;
                            }
                            try {
                                OooO0o0.set(inputMethodManager, null);
                                inputMethodManager.isActive();
                            } catch (IllegalAccessException unused2) {
                            }
                        } catch (ClassCastException unused3) {
                        } catch (IllegalAccessException unused4) {
                        }
                    } catch (Throwable th) {
                        throw th;
                    }
                }
            } catch (IllegalAccessException unused5) {
            }
        }
    }
}
