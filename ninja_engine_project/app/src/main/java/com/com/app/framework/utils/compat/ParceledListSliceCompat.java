package com.app.framework.utils.compat;

import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1743ooOO00;
import com.ninja.engine.InterfaceC1760ooOO0Oo0;
import com.ninja.engine.o0O00OOO;
import java.lang.reflect.Method;
import java.util.Iterator;
import java.util.List;
/* loaded from: classes.dex */
public class ParceledListSliceCompat {
    public static Object create(List<?> list) {
        Object _new = ((InterfaceC1760ooOO0Oo0) C0217o00o0oO0.create(InterfaceC1760ooOO0Oo0.class, null, false))._new(list);
        if (_new != null) {
            return _new;
        }
        Object _new2 = ((InterfaceC1760ooOO0Oo0) C0217o00o0oO0.create(InterfaceC1760ooOO0Oo0.class, null, false))._new();
        Iterator<?> it = list.iterator();
        while (it.hasNext()) {
            ((InterfaceC1743ooOO00) C0217o00o0oO0.create(InterfaceC1743ooOO00.class, _new2, false)).append(it.next());
        }
        ((InterfaceC1743ooOO00) C0217o00o0oO0.create(InterfaceC1743ooOO00.class, _new2, false)).setLastSlice(true);
        return _new2;
    }

    public static boolean isParceledListSlice(Object obj) {
        return obj != null && obj.getClass() == o0O00OOO.classReady(InterfaceC1743ooOO00.class);
    }

    public static boolean isReturnParceledListSlice(Method method) {
        return method != null && method.getReturnType() == o0O00OOO.classReady(InterfaceC1743ooOO00.class);
    }
}
