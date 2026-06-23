package com.ninja.engine;

import android.graphics.Rect;
import java.util.Comparator;
/* renamed from: com.ninja.engine.o0o0Oo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0552o0o0Oo0O implements Comparator {
    public final Rect OooO00o = new Rect();
    public final Rect OooO0O0 = new Rect();
    public final boolean OooO0OO;
    public final C0601o0oOooO0 OooO0Oo;

    public C0552o0o0Oo0O(boolean z, C0601o0oOooO0 c0601o0oOooO0) {
        this.OooO0OO = z;
        this.OooO0Oo = c0601o0oOooO0;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        this.OooO0Oo.getClass();
        Rect rect = this.OooO00o;
        ((C0039OoooO) obj).OooO0o(rect);
        Rect rect2 = this.OooO0O0;
        ((C0039OoooO) obj2).OooO0o(rect2);
        int i = rect.top;
        int i2 = rect2.top;
        if (i < i2) {
            return -1;
        }
        if (i > i2) {
            return 1;
        }
        int i3 = rect.left;
        int i4 = rect2.left;
        boolean z = this.OooO0OO;
        if (i3 < i4) {
            if (!z) {
                return -1;
            }
            return 1;
        } else if (i3 > i4) {
            if (z) {
                return -1;
            }
            return 1;
        } else {
            int i5 = rect.bottom;
            int i6 = rect2.bottom;
            if (i5 < i6) {
                return -1;
            }
            if (i5 > i6) {
                return 1;
            }
            int i7 = rect.right;
            int i8 = rect2.right;
            if (i7 < i8) {
                if (!z) {
                    return -1;
                }
                return 1;
            } else if (i7 > i8) {
                if (z) {
                    return -1;
                }
                return 1;
            } else {
                return 0;
            }
        }
    }
}
