package com.ninja.engine;

import java.io.Closeable;
import java.io.IOException;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
/* renamed from: com.ninja.engine.oo0O0OOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1467oo0O0OOO {
    public final LinkedHashMap OooO00o = new LinkedHashMap();

    public final void OooO00o() {
        for (AbstractC1466oo0O0OO0 abstractC1466oo0O0OO0 : this.OooO00o.values()) {
            HashMap hashMap = abstractC1466oo0O0OO0.OooO00o;
            if (hashMap != null) {
                synchronized (hashMap) {
                    try {
                        for (Object obj : abstractC1466oo0O0OO0.OooO00o.values()) {
                            if (obj instanceof Closeable) {
                                try {
                                    ((Closeable) obj).close();
                                } catch (IOException e) {
                                    throw new RuntimeException(e);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            LinkedHashSet linkedHashSet = abstractC1466oo0O0OO0.OooO0O0;
            if (linkedHashSet != null) {
                synchronized (linkedHashSet) {
                    try {
                        for (Closeable closeable : abstractC1466oo0O0OO0.OooO0O0) {
                            if (closeable instanceof Closeable) {
                                try {
                                    closeable.close();
                                } catch (IOException e2) {
                                    throw new RuntimeException(e2);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
            abstractC1466oo0O0OO0.OooO00o();
        }
        this.OooO00o.clear();
    }
}
