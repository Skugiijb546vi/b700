package com.ninja.engine;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.ninja.engine.o0oO0O0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0561o0oO0O0o extends AbstractC0296o0O0O0oo {
    public static boolean o00Oo0(Iterable iterable, Object obj) {
        int i;
        AbstractC0809oO0OooOO.OooOOOo(iterable, "<this>");
        if (iterable instanceof Collection) {
            return ((Collection) iterable).contains(obj);
        }
        if (iterable instanceof List) {
            i = ((List) iterable).indexOf(obj);
        } else {
            Iterator it = iterable.iterator();
            int i2 = 0;
            while (true) {
                if (it.hasNext()) {
                    Object next = it.next();
                    if (i2 >= 0) {
                        if (AbstractC0809oO0OooOO.OooO0o0(obj, next)) {
                            i = i2;
                            break;
                        }
                        i2++;
                    } else {
                        throw new ArithmeticException("Index overflow has happened.");
                    }
                } else {
                    i = -1;
                    break;
                }
            }
        }
        if (i < 0) {
            return false;
        }
        return true;
    }
}


