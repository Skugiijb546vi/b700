package com.bumptech.glide;

import android.content.ComponentCallbacks2;
import android.content.Context;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.text.TextUtils;
import android.util.Log;
import com.ninja.engine.AbstractC0694o0ooooo0;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.AbstractC1401oo00OOO0;
import com.ninja.engine.C0145o00OO0oO;
import com.ninja.engine.C0331o0O0oo;
import com.ninja.engine.C0455o0OoOo00;
import com.ninja.engine.C0496o0o000OO;
import com.ninja.engine.C0601o0oOooO0;
import com.ninja.engine.C0814oO0o;
import com.ninja.engine.C0835oO0o0oO;
import com.ninja.engine.C0836oO0o0oO0;
import com.ninja.engine.C0838oO0o0oo;
import com.ninja.engine.C0881oO0oo0O;
import com.ninja.engine.C0883oO0oo0OO;
import com.ninja.engine.C1218oOoOOoo;
import com.ninja.engine.C1228oOoOo0O0;
import com.ninja.engine.C1932ooo0Oo0;
import com.ninja.engine.ComponentCallbacks2C1106oOOoOoo0;
import com.ninja.engine.InterfaceC0206o00o0OOO;
import com.ninja.engine.ThreadFactoryC0059o00000Oo;
import com.ninja.engine.o;
import com.ninja.engine.o00O;
import com.ninja.engine.oO00000;
import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* loaded from: classes.dex */
public final class OooO00o implements ComponentCallbacks2 {
    public static volatile boolean OooO;
    public static volatile OooO00o OooO0oo;
    public final InterfaceC0206o00o0OOO OooO00o;
    public final C0814oO0o OooO0O0;
    public final C1932ooo0Oo0 OooO0OO;
    public final C0836oO0o0oO0 OooO0Oo;
    public final C0455o0OoOo00 OooO0o;
    public final com.bumptech.glide.manager.OooO00o OooO0o0;
    public final ArrayList OooO0oO = new ArrayList();

    public OooO00o(Context context, C0496o0o000OO c0496o0o000OO, C0814oO0o c0814oO0o, InterfaceC0206o00o0OOO interfaceC0206o00o0OOO, C0836oO0o0oO0 c0836oO0o0oO0, com.bumptech.glide.manager.OooO00o oooO00o, C0455o0OoOo00 c0455o0OoOo00, int i, C0601o0oOooO0 c0601o0oOooO0, C0145o00OO0oO c0145o00OO0oO, List list, ArrayList arrayList, AbstractC0694o0ooooo0 abstractC0694o0ooooo0, o00O o00o) {
        this.OooO00o = interfaceC0206o00o0OOO;
        this.OooO0Oo = c0836oO0o0oO0;
        this.OooO0O0 = c0814oO0o;
        this.OooO0o0 = oooO00o;
        this.OooO0o = c0455o0OoOo00;
        this.OooO0OO = new C1932ooo0Oo0(context, c0836oO0o0oO0, new C1228oOoOo0O0(this, arrayList, abstractC0694o0ooooo0), new C0601o0oOooO0(23), c0601o0oOooO0, c0145o00OO0oO, list, c0496o0o000OO, o00o, i);
    }

    public static OooO00o OooO00o(Context context) {
        GeneratedAppGlideModule generatedAppGlideModule;
        if (OooO0oo == null) {
            try {
                generatedAppGlideModule = (GeneratedAppGlideModule) Class.forName("com.bumptech.glide.GeneratedAppGlideModuleImpl").getDeclaredConstructor(Context.class).newInstance(context.getApplicationContext().getApplicationContext());
            } catch (ClassNotFoundException unused) {
                Log.isLoggable("Glide", 5);
                generatedAppGlideModule = null;
            } catch (IllegalAccessException e) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e);
            } catch (InstantiationException e2) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e2);
            } catch (NoSuchMethodException e3) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e3);
            } catch (InvocationTargetException e4) {
                throw new IllegalStateException("GeneratedAppGlideModuleImpl is implemented incorrectly. If you've manually implemented this class, remove your implementation. The Annotation processor will generate a correct implementation.", e4);
            }
            synchronized (OooO00o.class) {
                if (OooO0oo == null) {
                    if (!OooO) {
                        OooO = true;
                        OooO0O0(context, generatedAppGlideModule);
                        OooO = false;
                    } else {
                        throw new IllegalStateException("Glide has been called recursively, this is probably an internal library error!");
                    }
                }
            }
        }
        return OooO0oo;
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [com.ninja.engine.o00OO0oO, com.ninja.engine.oOoOOoo] */
    /* JADX WARN: Type inference failed for: r6v8, types: [com.ninja.engine.oO0o0oo, com.ninja.engine.oO0o] */
    public static void OooO0O0(Context context, GeneratedAppGlideModule generatedAppGlideModule) {
        int i;
        oO00000 oo00000;
        InterfaceC0206o00o0OOO c0455o0OoOo00;
        C1218oOoOOoo c1218oOoOOoo = new C1218oOoOOoo(0);
        C0331o0O0oo c0331o0O0oo = new C0331o0O0oo(15);
        C0601o0oOooO0 c0601o0oOooO0 = new C0601o0oOooO0(21);
        Context applicationContext = context.getApplicationContext();
        Collections.emptyList();
        Log.isLoggable("ManifestParser", 3);
        ArrayList arrayList = new ArrayList();
        try {
            ApplicationInfo applicationInfo = applicationContext.getPackageManager().getApplicationInfo(applicationContext.getPackageName(), 128);
            if (applicationInfo != null && applicationInfo.metaData != null) {
                if (Log.isLoggable("ManifestParser", 2)) {
                    Objects.toString(applicationInfo.metaData);
                }
                for (String str : applicationInfo.metaData.keySet()) {
                    if ("GlideModule".equals(applicationInfo.metaData.get(str))) {
                        AbstractC0694o0ooooo0.Oooo0(str);
                        throw null;
                    }
                }
            }
            Log.isLoggable("ManifestParser", 3);
        } catch (PackageManager.NameNotFoundException unused) {
            Log.isLoggable("ManifestParser", 6);
        }
        if (generatedAppGlideModule != null && !new HashSet().isEmpty()) {
            new HashSet();
            Iterator it = arrayList.iterator();
            if (it.hasNext()) {
                AbstractC1230oOoOo0o.OooOO0O(it.next());
                throw null;
            }
        }
        if (Log.isLoggable("Glide", 3)) {
            Iterator it2 = arrayList.iterator();
            if (it2.hasNext()) {
                AbstractC1230oOoOo0o.OooOO0O(it2.next());
                throw null;
            }
        }
        Iterator it3 = arrayList.iterator();
        if (!it3.hasNext()) {
            ThreadFactoryC0059o00000Oo threadFactoryC0059o00000Oo = new ThreadFactoryC0059o00000Oo(1);
            if (oO00000.OooO0OO == 0) {
                oO00000.OooO0OO = Math.min(4, Runtime.getRuntime().availableProcessors());
            }
            int i2 = oO00000.OooO0OO;
            if (!TextUtils.isEmpty("source")) {
                TimeUnit timeUnit = TimeUnit.MILLISECONDS;
                oO00000 oo000002 = new oO00000(new ThreadPoolExecutor(i2, i2, 0L, timeUnit, new PriorityBlockingQueue(), new o(threadFactoryC0059o00000Oo, "source", false)));
                ThreadFactoryC0059o00000Oo threadFactoryC0059o00000Oo2 = new ThreadFactoryC0059o00000Oo(1);
                if (!TextUtils.isEmpty("disk-cache")) {
                    oO00000 oo000003 = new oO00000(new ThreadPoolExecutor(1, 1, 0L, timeUnit, new PriorityBlockingQueue(), new o(threadFactoryC0059o00000Oo2, "disk-cache", true)));
                    if (oO00000.OooO0OO == 0) {
                        oO00000.OooO0OO = Math.min(4, Runtime.getRuntime().availableProcessors());
                    }
                    if (oO00000.OooO0OO >= 4) {
                        i = 2;
                    } else {
                        i = 1;
                    }
                    ThreadFactoryC0059o00000Oo threadFactoryC0059o00000Oo3 = new ThreadFactoryC0059o00000Oo(1);
                    if (!TextUtils.isEmpty("animation")) {
                        oO00000 oo000004 = new oO00000(new ThreadPoolExecutor(i, i, 0L, timeUnit, new PriorityBlockingQueue(), new o(threadFactoryC0059o00000Oo3, "animation", true)));
                        C0883oO0oo0OO c0883oO0oo0OO = new C0883oO0oo0OO(new C0881oO0oo0O(applicationContext));
                        C0455o0OoOo00 c0455o0OoOo002 = new C0455o0OoOo00(26);
                        int i3 = c0883oO0oo0OO.OooO00o;
                        if (i3 > 0) {
                            oo00000 = oo000004;
                            c0455o0OoOo00 = new C0835oO0o0oO(i3);
                        } else {
                            oo00000 = oo000004;
                            c0455o0OoOo00 = new C0455o0OoOo00(12);
                        }
                        C0836oO0o0oO0 c0836oO0o0oO0 = new C0836oO0o0oO0(c0883oO0oo0OO.OooO0OO);
                        C0838oO0o0oo c0838oO0o0oo = new C0838oO0o0oo(c0883oO0oo0OO.OooO0O0);
                        OooO00o oooO00o = new OooO00o(applicationContext, new C0496o0o000OO(c0838oO0o0oo, new C0331o0O0oo(applicationContext), oo000003, oo000002, new oO00000(new ThreadPoolExecutor(0, Integer.MAX_VALUE, oO00000.OooO0O0, timeUnit, new SynchronousQueue(), new o(new ThreadFactoryC0059o00000Oo(1), "source-unlimited", false))), oo00000), c0838oO0o0oo, c0455o0OoOo00, c0836oO0o0oO0, new com.bumptech.glide.manager.OooO00o(null), c0455o0OoOo002, 4, c0601o0oOooO0, c1218oOoOOoo, Collections.emptyList(), arrayList, generatedAppGlideModule, new o00O(c0331o0O0oo));
                        applicationContext.registerComponentCallbacks(oooO00o);
                        OooO0oo = oooO00o;
                        return;
                    }
                    throw new IllegalArgumentException("Name must be non-null and non-empty, but given: animation");
                }
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: disk-cache");
            }
            throw new IllegalArgumentException("Name must be non-null and non-empty, but given: source");
        }
        AbstractC1230oOoOo0o.OooOO0O(it3.next());
        throw null;
    }

    public static ComponentCallbacks2C1106oOOoOoo0 OooO0Oo(Context context) {
        AbstractC0694o0ooooo0.OooOO0O(context, "You cannot start a load on a not yet attached View or a Fragment where getActivity() returns null (which usually occurs when getActivity() is called before the Fragment is attached or after the Fragment is destroyed).");
        return OooO00o(context).OooO0o0.OooO0O0(context);
    }

    public final void OooO0OO(ComponentCallbacks2C1106oOOoOoo0 componentCallbacks2C1106oOOoOoo0) {
        synchronized (this.OooO0oO) {
            try {
                if (this.OooO0oO.contains(componentCallbacks2C1106oOOoOoo0)) {
                    this.OooO0oO.remove(componentCallbacks2C1106oOOoOoo0);
                } else {
                    throw new IllegalStateException("Cannot unregister not yet registered manager");
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
    }

    @Override // android.content.ComponentCallbacks
    public final void onLowMemory() {
        AbstractC1401oo00OOO0.OooO00o();
        this.OooO0O0.OooO0o0(0L);
        this.OooO00o.OooOOo0();
        this.OooO0Oo.OooO00o();
    }

    @Override // android.content.ComponentCallbacks2
    public final void onTrimMemory(int i) {
        AbstractC1401oo00OOO0.OooO00o();
        synchronized (this.OooO0oO) {
            try {
                Iterator it = this.OooO0oO.iterator();
                while (it.hasNext()) {
                    ((ComponentCallbacks2C1106oOOoOoo0) it.next()).getClass();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        this.OooO0O0.OooO0o(i);
        this.OooO00o.OooOOO(i);
        this.OooO0Oo.OooO(i);
    }
}
