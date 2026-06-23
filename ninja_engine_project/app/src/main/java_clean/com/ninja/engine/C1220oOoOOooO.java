package com.ninja.engine;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import android.util.Log;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
/* renamed from: com.ninja.engine.oOoOOooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1220oOoOOooO implements InterfaceC1098oOOoOo00, InterfaceC1334oOooo0oo, InterfaceC1124oOOooO0O {
    public static final boolean OooOoOO = Log.isLoggable("GlideRequest", 2);
    public final int OooO;
    public final C1251oOoOoooo OooO00o;
    public final Object OooO0O0;
    public final InterfaceC1097oOOoOo OooO0OO;
    public final Context OooO0Oo;
    public final Object OooO0o;
    public final C1932ooo0Oo0 OooO0o0;
    public final Class OooO0oO;
    public final AbstractC0186o00Ooooo OooO0oo;
    public final int OooOO0;
    public final EnumC1000oOOOO0oo OooOO0O;
    public final InterfaceC1292oOooO00O OooOO0o;
    public final C0919oOO00oOo OooOOO;
    public final List OooOOO0;
    public final Executor OooOOOO;
    public InterfaceC1108oOOoo OooOOOo;
    public volatile C0496o0o000OO OooOOo;
    public C0131o00O0o OooOOo0;
    public Drawable OooOOoo;
    public boolean OooOo;
    public Drawable OooOo0;
    public Drawable OooOo00;
    public int OooOo0O;
    public int OooOo0o;
    public int OooOoO;
    public final RuntimeException OooOoO0;

    /* JADX WARN: Type inference failed for: r3v1, types: [com.ninja.engine.oOoOoooo, java.lang.Object] */
    public C1220oOoOOooO(Context context, C1932ooo0Oo0 c1932ooo0Oo0, Object obj, Object obj2, Class cls, AbstractC0186o00Ooooo abstractC0186o00Ooooo, int i, int i2, EnumC1000oOOOO0oo enumC1000oOOOO0oo, InterfaceC1292oOooO00O interfaceC1292oOooO00O, ArrayList arrayList, InterfaceC1097oOOoOo interfaceC1097oOOoOo, C0496o0o000OO c0496o0o000OO, C0919oOO00oOo c0919oOO00oOo) {
        ExecutorC0093o000Ooo0 executorC0093o000Ooo0 = AbstractC0692o0ooooOo.OooOOO;
        if (OooOoOO) {
            String.valueOf(hashCode());
        }
        this.OooO00o = new C1251oOoOoooo();
        this.OooO0O0 = obj;
        this.OooO0Oo = context;
        this.OooO0o0 = c1932ooo0Oo0;
        this.OooO0o = obj2;
        this.OooO0oO = cls;
        this.OooO0oo = abstractC0186o00Ooooo;
        this.OooO = i;
        this.OooOO0 = i2;
        this.OooOO0O = enumC1000oOOOO0oo;
        this.OooOO0o = interfaceC1292oOooO00O;
        this.OooOOO0 = arrayList;
        this.OooO0OO = interfaceC1097oOOoOo;
        this.OooOOo = c0496o0o000OO;
        this.OooOOO = c0919oOO00oOo;
        this.OooOOOO = executorC0093o000Ooo0;
        this.OooOoO = 1;
        if (this.OooOoO0 == null && ((Map) c1932ooo0Oo0.OooO0oo.OooO0O0).containsKey(AbstractC0694o0ooooo0.class)) {
            this.OooOoO0 = new RuntimeException("Glide request origin trace");
        }
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final void OooO() {
        synchronized (this.OooO0O0) {
            try {
                if (isRunning()) {
                    clear();
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean OooO00o() {
        boolean z;
        synchronized (this.OooO0O0) {
            if (this.OooOoO == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void OooO0O0() {
        if (!this.OooOo) {
            this.OooO00o.OooO00o();
            this.OooOO0o.OooO(this);
            C0131o00O0o c0131o00O0o = this.OooOOo0;
            if (c0131o00O0o != null) {
                synchronized (((C0496o0o000OO) c0131o00O0o.OooO0Oo)) {
                    ((C0500o0o000oo) c0131o00O0o.OooO0O0).OooOO0((InterfaceC1124oOOooO0O) c0131o00O0o.OooO0OO);
                }
                this.OooOOo0 = null;
                return;
            }
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean OooO0OO(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        int i;
        int i2;
        Object obj;
        Class cls;
        AbstractC0186o00Ooooo abstractC0186o00Ooooo;
        EnumC1000oOOOO0oo enumC1000oOOOO0oo;
        int i3;
        int i4;
        int i5;
        Object obj2;
        Class cls2;
        AbstractC0186o00Ooooo abstractC0186o00Ooooo2;
        EnumC1000oOOOO0oo enumC1000oOOOO0oo2;
        int i6;
        boolean equals;
        boolean OooO0o0;
        if (!(interfaceC1098oOOoOo00 instanceof C1220oOoOOooO)) {
            return false;
        }
        synchronized (this.OooO0O0) {
            try {
                i = this.OooO;
                i2 = this.OooOO0;
                obj = this.OooO0o;
                cls = this.OooO0oO;
                abstractC0186o00Ooooo = this.OooO0oo;
                enumC1000oOOOO0oo = this.OooOO0O;
                List list = this.OooOOO0;
                if (list != null) {
                    i3 = list.size();
                } else {
                    i3 = 0;
                }
            } finally {
            }
        }
        C1220oOoOOooO c1220oOoOOooO = (C1220oOoOOooO) interfaceC1098oOOoOo00;
        synchronized (c1220oOoOOooO.OooO0O0) {
            try {
                i4 = c1220oOoOOooO.OooO;
                i5 = c1220oOoOOooO.OooOO0;
                obj2 = c1220oOoOOooO.OooO0o;
                cls2 = c1220oOoOOooO.OooO0oO;
                abstractC0186o00Ooooo2 = c1220oOoOOooO.OooO0oo;
                enumC1000oOOOO0oo2 = c1220oOoOOooO.OooOO0O;
                List list2 = c1220oOoOOooO.OooOOO0;
                if (list2 != null) {
                    i6 = list2.size();
                } else {
                    i6 = 0;
                }
            } finally {
            }
        }
        if (i == i4 && i2 == i5) {
            char[] cArr = AbstractC1401oo00OOO0.OooO00o;
            if (obj == null) {
                if (obj2 == null) {
                    equals = true;
                } else {
                    equals = false;
                }
            } else {
                equals = obj.equals(obj2);
            }
            if (equals && cls.equals(cls2)) {
                if (abstractC0186o00Ooooo == null) {
                    if (abstractC0186o00Ooooo2 == null) {
                        OooO0o0 = true;
                    } else {
                        OooO0o0 = false;
                    }
                } else {
                    OooO0o0 = abstractC0186o00Ooooo.OooO0o0(abstractC0186o00Ooooo2);
                }
                if (OooO0o0 && enumC1000oOOOO0oo == enumC1000oOOOO0oo2 && i3 == i6) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Drawable OooO0Oo() {
        int i;
        if (this.OooOo00 == null) {
            AbstractC0186o00Ooooo abstractC0186o00Ooooo = this.OooO0oo;
            Drawable drawable = abstractC0186o00Ooooo.OooO0oO;
            this.OooOo00 = drawable;
            if (drawable == null && (i = abstractC0186o00Ooooo.OooO0oo) > 0) {
                Resources.Theme theme = abstractC0186o00Ooooo.OooOo0;
                Context context = this.OooO0Oo;
                if (theme == null) {
                    theme = context.getTheme();
                }
                this.OooOo00 = AbstractC0692o0ooooOo.OooOo0O(context, context, i, theme);
            }
        }
        return this.OooOo00;
    }

    public final void OooO0o(InterfaceC1108oOOoo interfaceC1108oOOoo, int i, boolean z) {
        Object obj;
        String str;
        this.OooO00o.OooO00o();
        InterfaceC1108oOOoo interfaceC1108oOOoo2 = null;
        try {
            synchronized (this.OooO0O0) {
                try {
                    this.OooOOo0 = null;
                    if (interfaceC1108oOOoo == null) {
                        OooO0o0(new C0695o0oooooO("Expected to receive a Resource<R> with an object of " + this.OooO0oO + " inside, but instead got null."), 5);
                        return;
                    }
                    Object obj2 = (Object) interfaceC1108oOOoo.get();
                    try {
                        if (obj2 != null && this.OooO0oO.isAssignableFrom(obj2.getClass())) {
                            InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO0OO;
                            if (interfaceC1097oOOoOo != null && !interfaceC1097oOOoOo.OooOO0o(this)) {
                                this.OooOOOo = null;
                                this.OooOoO = 4;
                                this.OooOOo.getClass();
                                C0496o0o000OO.OooO0o(interfaceC1108oOOoo);
                                return;
                            }
                            OooO0oo(interfaceC1108oOOoo, obj2, i);
                            return;
                        }
                        this.OooOOOo = null;
                        StringBuilder sb = new StringBuilder("Expected to receive an object of ");
                        sb.append(this.OooO0oO);
                        sb.append(" but instead got ");
                        if (obj2 != null) {
                            obj = obj2.getClass();
                        } else {
                            obj = "";
                        }
                        sb.append(obj);
                        sb.append("{");
                        sb.append(obj2);
                        sb.append("} inside Resource{");
                        sb.append(interfaceC1108oOOoo);
                        sb.append("}.");
                        if (obj2 != null) {
                            str = "";
                        } else {
                            str = " To indicate failure return a null Resource object, rather than a Resource object containing null data.";
                        }
                        sb.append(str);
                        OooO0o0(new C0695o0oooooO(sb.toString()), 5);
                        this.OooOOo.getClass();
                        C0496o0o000OO.OooO0o(interfaceC1108oOOoo);
                    } catch (Throwable th) {
                        interfaceC1108oOOoo2 = interfaceC1108oOOoo;
                        throw th;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } catch (Throwable th3) {
            if (interfaceC1108oOOoo2 != null) {
                this.OooOOo.getClass();
                C0496o0o000OO.OooO0o(interfaceC1108oOOoo2);
            }
            throw th3;
        }
    }

    public final void OooO0o0(C0695o0oooooO c0695o0oooooO, int i) {
        int i2;
        int i3;
        this.OooO00o.OooO00o();
        synchronized (this.OooO0O0) {
            try {
                c0695o0oooooO.getClass();
                int i4 = this.OooO0o0.OooO;
                if (i4 <= i) {
                    Objects.toString(this.OooO0o);
                    if (i4 <= 4) {
                        ArrayList arrayList = new ArrayList();
                        C0695o0oooooO.OooO00o(c0695o0oooooO, arrayList);
                        int size = arrayList.size();
                        int i5 = 0;
                        while (i5 < size) {
                            int i6 = i5 + 1;
                            Throwable th = (Throwable) arrayList.get(i5);
                            i5 = i6;
                        }
                    }
                }
                Drawable drawable = null;
                this.OooOOo0 = null;
                this.OooOoO = 5;
                InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO0OO;
                if (interfaceC1097oOOoOo != null) {
                    interfaceC1097oOOoOo.OooO0Oo(this);
                }
                this.OooOo = true;
                List list = this.OooOOO0;
                if (list != null) {
                    Iterator it = list.iterator();
                    if (it.hasNext()) {
                        AbstractC1230oOoOo0o.OooOO0O(it.next());
                        InterfaceC1097oOOoOo interfaceC1097oOOoOo2 = this.OooO0OO;
                        if (interfaceC1097oOOoOo2 != null) {
                            interfaceC1097oOOoOo2.OooO0oo().OooO00o();
                        }
                        throw null;
                    }
                }
                InterfaceC1097oOOoOo interfaceC1097oOOoOo3 = this.OooO0OO;
                if (interfaceC1097oOOoOo3 == null || interfaceC1097oOOoOo3.OooO0o0(this)) {
                    if (this.OooO0o == null) {
                        if (this.OooOo0 == null) {
                            AbstractC0186o00Ooooo abstractC0186o00Ooooo = this.OooO0oo;
                            Drawable drawable2 = abstractC0186o00Ooooo.OooOOOO;
                            this.OooOo0 = drawable2;
                            if (drawable2 == null && (i3 = abstractC0186o00Ooooo.OooOOOo) > 0) {
                                Resources.Theme theme = abstractC0186o00Ooooo.OooOo0;
                                Context context = this.OooO0Oo;
                                if (theme == null) {
                                    theme = context.getTheme();
                                }
                                this.OooOo0 = AbstractC0692o0ooooOo.OooOo0O(context, context, i3, theme);
                            }
                        }
                        drawable = this.OooOo0;
                    }
                    if (drawable == null) {
                        if (this.OooOOoo == null) {
                            AbstractC0186o00Ooooo abstractC0186o00Ooooo2 = this.OooO0oo;
                            Drawable drawable3 = abstractC0186o00Ooooo2.OooO0o0;
                            this.OooOOoo = drawable3;
                            if (drawable3 == null && (i2 = abstractC0186o00Ooooo2.OooO0o) > 0) {
                                Resources.Theme theme2 = abstractC0186o00Ooooo2.OooOo0;
                                Context context2 = this.OooO0Oo;
                                if (theme2 == null) {
                                    theme2 = context2.getTheme();
                                }
                                this.OooOOoo = AbstractC0692o0ooooOo.OooOo0O(context2, context2, i2, theme2);
                            }
                        }
                        drawable = this.OooOOoo;
                    }
                    if (drawable == null) {
                        drawable = OooO0Oo();
                    }
                    this.OooOO0o.OooO00o(drawable);
                }
                this.OooOo = false;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean OooO0oO() {
        boolean z;
        synchronized (this.OooO0O0) {
            if (this.OooOoO == 6) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void OooO0oo(InterfaceC1108oOOoo interfaceC1108oOOoo, Object obj, int i) {
        InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO0OO;
        if (interfaceC1097oOOoOo != null) {
            interfaceC1097oOOoOo.OooO0oo().OooO00o();
        }
        this.OooOoO = 4;
        this.OooOOOo = interfaceC1108oOOoo;
        if (this.OooO0o0.OooO <= 3) {
            Objects.toString(this.OooO0o);
            int i2 = oO0o0000.OooO00o;
            SystemClock.elapsedRealtimeNanos();
        }
        if (interfaceC1097oOOoOo != null) {
            interfaceC1097oOOoOo.OooO0o(this);
        }
        this.OooOo = true;
        try {
            List list = this.OooOOO0;
            if (list != null) {
                Iterator it = list.iterator();
                if (it.hasNext()) {
                    AbstractC1230oOoOo0o.OooOO0O(it.next());
                    throw null;
                }
            }
            this.OooOOO.getClass();
            this.OooOO0o.OooO0oo(obj);
            this.OooOo = false;
        } catch (Throwable th) {
            this.OooOo = false;
            throw th;
        }
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final void OooOO0() {
        InterfaceC1097oOOoOo interfaceC1097oOOoOo;
        int i;
        synchronized (this.OooO0O0) {
            try {
                if (!this.OooOo) {
                    this.OooO00o.OooO00o();
                    int i2 = oO0o0000.OooO00o;
                    SystemClock.elapsedRealtimeNanos();
                    int i3 = 3;
                    if (this.OooO0o == null) {
                        if (AbstractC1401oo00OOO0.OooO(this.OooO, this.OooOO0)) {
                            this.OooOo0O = this.OooO;
                            this.OooOo0o = this.OooOO0;
                        }
                        if (this.OooOo0 == null) {
                            AbstractC0186o00Ooooo abstractC0186o00Ooooo = this.OooO0oo;
                            Drawable drawable = abstractC0186o00Ooooo.OooOOOO;
                            this.OooOo0 = drawable;
                            if (drawable == null && (i = abstractC0186o00Ooooo.OooOOOo) > 0) {
                                Resources.Theme theme = abstractC0186o00Ooooo.OooOo0;
                                Context context = this.OooO0Oo;
                                if (theme == null) {
                                    theme = context.getTheme();
                                }
                                this.OooOo0 = AbstractC0692o0ooooOo.OooOo0O(context, context, i, theme);
                            }
                        }
                        if (this.OooOo0 == null) {
                            i3 = 5;
                        }
                        OooO0o0(new C0695o0oooooO("Received null model"), i3);
                        return;
                    }
                    int i4 = this.OooOoO;
                    if (i4 != 2) {
                        if (i4 == 4) {
                            OooO0o(this.OooOOOo, 5, false);
                            return;
                        }
                        List<Object> list = this.OooOOO0;
                        if (list != null) {
                            for (Object obj : list) {
                                AbstractC1230oOoOo0o.OooOO0O(obj);
                            }
                        }
                        this.OooOoO = 3;
                        if (AbstractC1401oo00OOO0.OooO(this.OooO, this.OooOO0)) {
                            OooOO0o(this.OooO, this.OooOO0);
                        } else {
                            this.OooOO0o.OooO0o0(this);
                        }
                        int i5 = this.OooOoO;
                        if ((i5 == 2 || i5 == 3) && ((interfaceC1097oOOoOo = this.OooO0OO) == null || interfaceC1097oOOoOo.OooO0o0(this))) {
                            this.OooOO0o.OooO0Oo(OooO0Oo());
                        }
                        if (OooOoOO) {
                            SystemClock.elapsedRealtimeNanos();
                        }
                        return;
                    }
                    throw new IllegalArgumentException("Cannot restart a running request");
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean OooOO0O() {
        boolean z;
        synchronized (this.OooO0O0) {
            if (this.OooOoO == 4) {
                z = true;
            } else {
                z = false;
            }
        }
        return z;
    }

    public final void OooOO0o(int i, int i2) {
        Object obj;
        int round;
        int i3 = i;
        this.OooO00o.OooO00o();
        Object obj2 = this.OooO0O0;
        synchronized (obj2) {
            try {
                try {
                    boolean z = OooOoOO;
                    if (z) {
                        int i4 = oO0o0000.OooO00o;
                        SystemClock.elapsedRealtimeNanos();
                    }
                    if (this.OooOoO == 3) {
                        this.OooOoO = 2;
                        float f = this.OooO0oo.OooO0O0;
                        if (i3 != Integer.MIN_VALUE) {
                            i3 = Math.round(i3 * f);
                        }
                        this.OooOo0O = i3;
                        if (i2 == Integer.MIN_VALUE) {
                            round = i2;
                        } else {
                            round = Math.round(f * i2);
                        }
                        this.OooOo0o = round;
                        if (z) {
                            int i5 = oO0o0000.OooO00o;
                            SystemClock.elapsedRealtimeNanos();
                        }
                        C0496o0o000OO c0496o0o000OO = this.OooOOo;
                        C1932ooo0Oo0 c1932ooo0Oo0 = this.OooO0o0;
                        Object obj3 = this.OooO0o;
                        AbstractC0186o00Ooooo abstractC0186o00Ooooo = this.OooO0oo;
                        try {
                            obj = obj2;
                            try {
                                this.OooOOo0 = c0496o0o000OO.OooO00o(c1932ooo0Oo0, obj3, abstractC0186o00Ooooo.OooOO0o, this.OooOo0O, this.OooOo0o, abstractC0186o00Ooooo.OooOOoo, this.OooO0oO, this.OooOO0O, abstractC0186o00Ooooo.OooO0OO, abstractC0186o00Ooooo.OooOOo, abstractC0186o00Ooooo.OooOOO0, abstractC0186o00Ooooo.OooOoO0, abstractC0186o00Ooooo.OooOOo0, abstractC0186o00Ooooo.OooO, abstractC0186o00Ooooo.OooOo0o, abstractC0186o00Ooooo.OooOoO, abstractC0186o00Ooooo.OooOo, this, this.OooOOOO);
                                if (this.OooOoO != 2) {
                                    this.OooOOo0 = null;
                                }
                                if (z) {
                                    int i6 = oO0o0000.OooO00o;
                                    SystemClock.elapsedRealtimeNanos();
                                }
                            } catch (Throwable th) {
                                throw th;
                            }
                        } catch (Throwable th2) {
                            obj = obj2;
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    obj = obj2;
                    throw th3;
                }
            } catch (Throwable th4) {
                throw th4;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final void clear() {
        synchronized (this.OooO0O0) {
            try {
                if (!this.OooOo) {
                    this.OooO00o.OooO00o();
                    if (this.OooOoO == 6) {
                        return;
                    }
                    OooO0O0();
                    InterfaceC1108oOOoo interfaceC1108oOOoo = this.OooOOOo;
                    if (interfaceC1108oOOoo != null) {
                        this.OooOOOo = null;
                    } else {
                        interfaceC1108oOOoo = null;
                    }
                    InterfaceC1097oOOoOo interfaceC1097oOOoOo = this.OooO0OO;
                    if (interfaceC1097oOOoOo == null || interfaceC1097oOOoOo.OooO0O0(this)) {
                        this.OooOO0o.OooO0oO(OooO0Oo());
                    }
                    this.OooOoO = 6;
                    if (interfaceC1108oOOoo != null) {
                        this.OooOOo.getClass();
                        C0496o0o000OO.OooO0o(interfaceC1108oOOoo);
                        return;
                    }
                    return;
                }
                throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1098oOOoOo00
    public final boolean isRunning() {
        boolean z;
        synchronized (this.OooO0O0) {
            int i = this.OooOoO;
            if (i != 2 && i != 3) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    public final String toString() {
        Object obj;
        Class cls;
        synchronized (this.OooO0O0) {
            obj = this.OooO0o;
            cls = this.OooO0oO;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}



