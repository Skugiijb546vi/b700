package com.ninja.engine;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.IBinder;
import android.os.Trace;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.app.LauncherActivity;
import com.app.framework.app.dispatcher.AppServiceDispatcher;
import com.app.framework.core.system.JarConfig;
import com.app.framework.core.system.JarManager;
import com.app.framework.entity.ServiceRecord;
import com.google.android.material.carousel.CarouselLayoutManager;
import com.google.android.material.sidesheet.SideSheetBehavior;
import com.google.android.material.textfield.TextInputLayout;
import com.ninja.engine.view.update.UpdateRequiredActivity;
import java.lang.reflect.Method;
import java.nio.MappedByteBuffer;
/* renamed from: com.ninja.engine.o00000oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0061o00000oO implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ RunnableC0061o00000oO(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        Object obj;
        switch (this.OooO00o) {
            case 0:
                Activity activity = (Activity) this.OooO0O0;
                if (!activity.isFinishing()) {
                    int i = Build.VERSION.SDK_INT;
                    if (i >= 28) {
                        Class cls = o0000.OooO00o;
                        activity.recreate();
                        return;
                    }
                    Class cls2 = o0000.OooO00o;
                    if (i != 26 && i != 27) {
                        z = false;
                    } else {
                        z = true;
                    }
                    Method method = o0000.OooO0o;
                    if ((!z || method != null) && (o0000.OooO0o0 != null || o0000.OooO0Oo != null)) {
                        try {
                            Object obj2 = o0000.OooO0OO.get(activity);
                            if (obj2 != null && (obj = o0000.OooO0O0.get(activity)) != null) {
                                Application application = activity.getApplication();
                                C0062o00000oo c0062o00000oo = new C0062o00000oo(activity);
                                application.registerActivityLifecycleCallbacks(c0062o00000oo);
                                Handler handler = o0000.OooO0oO;
                                handler.post(new o0OO00O(c0062o00000oo, obj2, 1, false));
                                if (i != 26 && i != 27) {
                                    activity.recreate();
                                } else {
                                    Boolean bool = Boolean.FALSE;
                                    method.invoke(obj, obj2, null, null, 0, bool, null, null, bool, bool);
                                }
                                handler.post(new o0OO00O(application, c0062o00000oo, 2, false));
                                return;
                            }
                        } catch (Throwable unused) {
                        }
                    }
                    activity.recreate();
                    return;
                }
                return;
            case 1:
                AppServiceDispatcher.OooO00o((ServiceRecord) this.OooO0O0);
                return;
            case 2:
                BActivityThread.lambda$finishActivity$1((IBinder) this.OooO0O0);
                return;
            case 3:
                ((BlackBoxCore) this.OooO0O0).lambda$startLogcat$1();
                return;
            case 4:
                ((CarouselLayoutManager) this.OooO0O0).Oooooo0();
                return;
            case 5:
                ((C0293o0O00o0o) this.OooO0O0).OooOo00(true);
                return;
            case 6:
                ((androidx.activity.OooO00o) this.OooO0O0).invalidateOptionsMenu();
                return;
            case 7:
                ExecutorC0478o0OooO0 executorC0478o0OooO0 = (ExecutorC0478o0OooO0) this.OooO0O0;
                Runnable runnable = executorC0478o0OooO0.OooO0O0;
                if (runnable != null) {
                    runnable.run();
                    executorC0478o0OooO0.OooO0O0 = null;
                    return;
                }
                return;
            case 8:
                DialogC0302o0O0Oo0O.OooO0O0((DialogC0302o0O0Oo0O) this.OooO0O0);
                return;
            case 9:
                C0434o0OoO0 c0434o0OoO0 = (C0434o0OoO0) this.OooO0O0;
                boolean isPopupShowing = c0434o0OoO0.OooO0oo.isPopupShowing();
                c0434o0OoO0.OooOo00(isPopupShowing);
                c0434o0OoO0.OooOOO0 = isPopupShowing;
                return;
            case JarConfig.MAX_CACHE_SIZE /* 10 */:
                C0558o0o0Ooo0 c0558o0o0Ooo0 = (C0558o0o0Ooo0) this.OooO0O0;
                synchronized (c0558o0o0Ooo0.OooO0Oo) {
                    try {
                        if (c0558o0o0Ooo0.OooO0oo != null) {
                            try {
                                C0575o0oOo0 OooO0Oo = c0558o0o0Ooo0.OooO0Oo();
                                int i2 = OooO0Oo.OooO0o0;
                                if (i2 == 2) {
                                    synchronized (c0558o0o0Ooo0.OooO0Oo) {
                                    }
                                }
                                if (i2 == 0) {
                                    int i3 = oo000000.OooO00o;
                                    Trace.beginSection("EmojiCompat.FontRequestEmojiCompatConfig.buildTypeface");
                                    C0601o0oOooO0 c0601o0oOooO0 = c0558o0o0Ooo0.OooO0OO;
                                    Context context = c0558o0o0Ooo0.OooO00o;
                                    c0601o0oOooO0.getClass();
                                    C0575o0oOo0[] c0575o0oOo0Arr = {OooO0Oo};
                                    AbstractC1091oOOoOOOO abstractC1091oOOoOOOO = AbstractC1367oo000OOO.OooO00o;
                                    AbstractC1091oOOoOOOO.OooO00o("TypefaceCompat.createFromFontInfo");
                                    Typeface OooO0o = AbstractC1367oo000OOO.OooO00o.OooO0o(context, c0575o0oOo0Arr, 0);
                                    Trace.endSection();
                                    MappedByteBuffer OooOOO = AbstractC1094oOOoOOo0.OooOOO(c0558o0o0Ooo0.OooO00o, OooO0Oo.OooO00o);
                                    if (OooOOO != null && OooO0o != null) {
                                        Trace.beginSection("EmojiCompat.MetadataRepo.create");
                                        oOO00OOO ooo00ooo = new oOO00OOO(OooO0o, AbstractC0694o0ooooo0.Oooo0OO(OooOOO));
                                        Trace.endSection();
                                        Trace.endSection();
                                        synchronized (c0558o0o0Ooo0.OooO0Oo) {
                                            AbstractC0809oO0OooOO abstractC0809oO0OooOO = c0558o0o0Ooo0.OooO0oo;
                                            if (abstractC0809oO0OooOO != null) {
                                                abstractC0809oO0OooOO.OoooOOO(ooo00ooo);
                                            }
                                        }
                                        c0558o0o0Ooo0.OooO00o();
                                        return;
                                    }
                                    throw new RuntimeException("Unable to open file.");
                                }
                                throw new RuntimeException("fetchFonts result is not OK. (" + i2 + ")");
                            } catch (Throwable th) {
                                synchronized (c0558o0o0Ooo0.OooO0Oo) {
                                    try {
                                        AbstractC0809oO0OooOO abstractC0809oO0OooOO2 = c0558o0o0Ooo0.OooO0oo;
                                        if (abstractC0809oO0OooOO2 != null) {
                                            abstractC0809oO0OooOO2.o000oOoO(th);
                                        }
                                        c0558o0o0Ooo0.OooO00o();
                                        return;
                                    } finally {
                                    }
                                }
                            }
                        }
                        return;
                    } finally {
                    }
                }
            case 11:
                ((JarManager) this.OooO0O0).lambda$initializeAsync$0();
                return;
            case 12:
                LauncherActivity.lambda$onCreate$0((ImageView) this.OooO0O0);
                return;
            case 13:
                LauncherActivity.lambda$launchAppAsync$1((Exception) this.OooO0O0);
                return;
            case 14:
                C1003oOOOOo0 c1003oOOOOo0 = (C1003oOOOOo0) this.OooO0O0;
                AbstractC0809oO0OooOO.OooOOOo(c1003oOOOOo0, "this$0");
                int i4 = c1003oOOOOo0.OooO0O0;
                androidx.lifecycle.OooO00o oooO00o = c1003oOOOOo0.OooO0o;
                if (i4 == 0) {
                    c1003oOOOOo0.OooO0OO = true;
                    oooO00o.OooO0Oo(oO0O0O0o.ON_PAUSE);
                }
                if (c1003oOOOOo0.OooO00o == 0 && c1003oOOOOo0.OooO0OO) {
                    oooO00o.OooO0Oo(oO0O0O0o.ON_STOP);
                    c1003oOOOOo0.OooO0Oo = true;
                    return;
                }
                return;
            case 15:
                ((AbstractC1051oOOo000o) this.OooO0O0).OooOOO0();
                return;
            case 16:
                C1119oOOoo0oO c1119oOOoo0oO = (C1119oOOoo0oO) this.OooO0O0;
                if (c1119oOOoo0oO.OooOOOo()) {
                    MainActivity.OooO00o.edit().remove("user-status").apply();
                    c1119oOOoo0oO.Oooo000().recreate();
                    return;
                }
                return;
            case 17:
                C0237o00oOo c0237o00oOo = (C0237o00oOo) this.OooO0O0;
                c0237o00oOo.OooO0OO = false;
                SideSheetBehavior sideSheetBehavior = (SideSheetBehavior) c0237o00oOo.OooO0o0;
                C1462oo0O0O0 c1462oo0O0O0 = sideSheetBehavior.OooO;
                if (c1462oo0O0O0 != null && c1462oo0O0O0.OooO0o()) {
                    c0237o00oOo.OooO00o(c0237o00oOo.OooO0O0);
                    return;
                } else if (sideSheetBehavior.OooO0oo == 2) {
                    sideSheetBehavior.OooOo0O(c0237o00oOo.OooO0O0);
                    return;
                } else {
                    return;
                }
            case 18:
                View view = (View) this.OooO0O0;
                ((InputMethodManager) view.getContext().getSystemService("input_method")).showSoftInput(view, 0);
                return;
            case 19:
                ((TextInputLayout) this.OooO0O0).OooO0Oo.requestLayout();
                return;
            default:
                int i5 = UpdateRequiredActivity.Oooo000;
                UpdateRequiredActivity updateRequiredActivity = (UpdateRequiredActivity) this.OooO0O0;
                AbstractC0809oO0OooOO.OooOOOo(updateRequiredActivity, "this$0");
                updateRequiredActivity.OooOooO();
                return;
        }
    }
}
