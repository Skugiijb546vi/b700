package com.ninja.engine;

import java.util.Collection;
/* loaded from: classes.dex */
public abstract class o0O0O0Oo extends AbstractC0334o0O0oo0o {
    public static int o00O0O(Iterable iterable) {
        if (iterable instanceof Collection) {
            return ((Collection) iterable).size();
        }
        return 10;
    }
}
