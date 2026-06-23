package com.ninja.engine;

import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public final class o00OO000 extends AbstractC1137oOOoooO {
    public static volatile o00OO000 OooO0OO;
    public final Object OooO0O0;

    public o00OO000(int i) {
        switch (i) {
            case 1:
                this.OooO0O0 = new Object();
                Executors.newFixedThreadPool(4, new ThreadFactoryC0375o0OOo00());
                return;
            default:
                this.OooO0O0 = new o00OO000(1);
                return;
        }
    }

    public static o00OO000 OooOOo() {
        if (OooO0OO != null) {
            return OooO0OO;
        }
        synchronized (o00OO000.class) {
            try {
                if (OooO0OO == null) {
                    OooO0OO = new o00OO000(0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return OooO0OO;
    }
    public Object OooO0oo(android.content.res.AssetManager assetManager, String str) { return null; }
    public void OooOOOo() {}
    public void OooOO0O(android.graphics.Typeface typeface) {}
    public void OooOO0(int i) {}
}


