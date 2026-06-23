package com.ninja.engine;

import android.graphics.Bitmap;
import android.os.Build;
import java.util.ArrayDeque;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;
/* renamed from: com.ninja.engine.oOooo0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1330oOooo0Oo implements InterfaceC0840oO0o0ooo {
    public static final Bitmap.Config[] OooO0Oo;
    public static final Bitmap.Config[] OooO0o;
    public static final Bitmap.Config[] OooO0o0;
    public static final Bitmap.Config[] OooO0oO;
    public static final Bitmap.Config[] OooO0oo;
    public final C0834oO0o0o0o OooO00o = new C0834oO0o0o0o(1);
    public final C0415o0Oo0O0O OooO0O0 = new C0415o0Oo0O0O(21);
    public final HashMap OooO0OO = new HashMap();

    static {
        Bitmap.Config config;
        Bitmap.Config[] configArr = {Bitmap.Config.ARGB_8888, null};
        if (Build.VERSION.SDK_INT >= 26) {
            configArr = (Bitmap.Config[]) Arrays.copyOf(configArr, 3);
            config = Bitmap.Config.RGBA_F16;
            configArr[configArr.length - 1] = config;
        }
        OooO0Oo = configArr;
        OooO0o0 = configArr;
        OooO0o = new Bitmap.Config[]{Bitmap.Config.RGB_565};
        OooO0oO = new Bitmap.Config[]{Bitmap.Config.ARGB_4444};
        OooO0oo = new Bitmap.Config[]{Bitmap.Config.ALPHA_8};
    }

    public static String OooO0OO(int i, Bitmap.Config config) {
        return "[" + i + "](" + config + ")";
    }

    public final void OooO00o(Integer num, Bitmap bitmap) {
        NavigableMap OooO0Oo2 = OooO0Oo(bitmap.getConfig());
        Integer num2 = (Integer) OooO0Oo2.get(num);
        if (num2 != null) {
            if (num2.intValue() == 1) {
                OooO0Oo2.remove(num);
                return;
            } else {
                OooO0Oo2.put(num, Integer.valueOf(num2.intValue() - 1));
                return;
            }
        }
        throw new NullPointerException("Tried to decrement empty size, size: " + num + ", removed: " + OooO0OO(AbstractC1401oo00OOO0.OooO0OO(bitmap), bitmap.getConfig()) + ", this: " + this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00a7 A[EDGE_INSN: B:46:0x00a7->B:41:0x00a7 ?: BREAK  , SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v7 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.graphics.Bitmap OooO0O0(int r12, int r13, android.graphics.Bitmap.Config r14) {
        /*
            r11 = this;
            r0 = 0
            r1 = 1
            int r2 = r12 * r13
            int r3 = com.ninja.engine.AbstractC1401oo00OOO0.OooO0Oo(r14)
            int r3 = r3 * r2
            com.ninja.engine.oO0o0o0o r2 = r11.OooO00o
            java.lang.Object r4 = r2.OooO00o
            java.util.ArrayDeque r4 = (java.util.ArrayDeque) r4
            java.lang.Object r4 = r4.poll()
            com.ninja.engine.oOOOO00o r4 = (com.ninja.engine.InterfaceC0994oOOOO00o) r4
            if (r4 != 0) goto L1c
            com.ninja.engine.oOOOO00o r4 = r2.OooO0O0()
        L1c:
            com.ninja.engine.ooOOO0oo r4 = (com.ninja.engine.C1784ooOOO0oo) r4
            r4.OooO0O0 = r3
            r4.OooO0OO = r14
            int r5 = android.os.Build.VERSION.SDK_INT
            r6 = 26
            if (r5 < r6) goto L35
            android.graphics.Bitmap$Config r5 = com.ninja.engine.AbstractC1008oOOOOoo0.OooO0OO()
            boolean r5 = r5.equals(r14)
            if (r5 == 0) goto L35
            android.graphics.Bitmap$Config[] r5 = com.ninja.engine.C1330oOooo0Oo.OooO0o0
            goto L58
        L35:
            int[] r5 = com.ninja.engine.AbstractC1227oOoOo0O.OooO00o
            int r6 = r14.ordinal()
            r5 = r5[r6]
            if (r5 == r1) goto L56
            r6 = 2
            if (r5 == r6) goto L53
            r6 = 3
            if (r5 == r6) goto L50
            r6 = 4
            if (r5 == r6) goto L4d
            android.graphics.Bitmap$Config[] r5 = new android.graphics.Bitmap.Config[r1]
            r5[r0] = r14
            goto L58
        L4d:
            android.graphics.Bitmap$Config[] r5 = com.ninja.engine.C1330oOooo0Oo.OooO0oo
            goto L58
        L50:
            android.graphics.Bitmap$Config[] r5 = com.ninja.engine.C1330oOooo0Oo.OooO0oO
            goto L58
        L53:
            android.graphics.Bitmap$Config[] r5 = com.ninja.engine.C1330oOooo0Oo.OooO0o
            goto L58
        L56:
            android.graphics.Bitmap$Config[] r5 = com.ninja.engine.C1330oOooo0Oo.OooO0Oo
        L58:
            int r6 = r5.length
        L59:
            if (r0 >= r6) goto La7
            r7 = r5[r0]
            java.util.NavigableMap r8 = r11.OooO0Oo(r7)
            java.lang.Integer r9 = java.lang.Integer.valueOf(r3)
            java.lang.Object r8 = r8.ceilingKey(r9)
            java.lang.Integer r8 = (java.lang.Integer) r8
            if (r8 == 0) goto La5
            int r9 = r8.intValue()
            int r10 = r3 * 8
            if (r9 > r10) goto La5
            int r0 = r8.intValue()
            if (r0 != r3) goto L86
            if (r7 != 0) goto L80
            if (r14 == 0) goto La7
            goto L86
        L80:
            boolean r0 = r7.equals(r14)
            if (r0 != 0) goto La7
        L86:
            r2.OooO00o(r4)
            int r0 = r8.intValue()
            java.lang.Object r1 = r2.OooO00o
            java.util.ArrayDeque r1 = (java.util.ArrayDeque) r1
            java.lang.Object r1 = r1.poll()
            com.ninja.engine.oOOOO00o r1 = (com.ninja.engine.InterfaceC0994oOOOO00o) r1
            if (r1 != 0) goto L9d
            com.ninja.engine.oOOOO00o r1 = r2.OooO0O0()
        L9d:
            r4 = r1
            com.ninja.engine.ooOOO0oo r4 = (com.ninja.engine.C1784ooOOO0oo) r4
            r4.OooO0O0 = r0
            r4.OooO0OO = r7
            goto La7
        La5:
            int r0 = r0 + r1
            goto L59
        La7:
            com.ninja.engine.o0Oo0O0O r0 = r11.OooO0O0
            java.lang.Object r0 = r0.OooOoO(r4)
            android.graphics.Bitmap r0 = (android.graphics.Bitmap) r0
            if (r0 == 0) goto Lbd
            int r1 = r4.OooO0O0
            java.lang.Integer r1 = java.lang.Integer.valueOf(r1)
            r11.OooO00o(r1, r0)
            r0.reconfigure(r12, r13, r14)
        Lbd:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1330oOooo0Oo.OooO0O0(int, int, android.graphics.Bitmap$Config):android.graphics.Bitmap");
    }

    public final NavigableMap OooO0Oo(Bitmap.Config config) {
        HashMap hashMap = this.OooO0OO;
        NavigableMap navigableMap = (NavigableMap) hashMap.get(config);
        if (navigableMap == null) {
            TreeMap treeMap = new TreeMap();
            hashMap.put(config, treeMap);
            return treeMap;
        }
        return navigableMap;
    }

    public final void OooO0o0(Bitmap bitmap) {
        int OooO0OO = AbstractC1401oo00OOO0.OooO0OO(bitmap);
        Bitmap.Config config = bitmap.getConfig();
        C0834oO0o0o0o c0834oO0o0o0o = this.OooO00o;
        InterfaceC0994oOOOO00o interfaceC0994oOOOO00o = (InterfaceC0994oOOOO00o) ((ArrayDeque) c0834oO0o0o0o.OooO00o).poll();
        if (interfaceC0994oOOOO00o == null) {
            interfaceC0994oOOOO00o = c0834oO0o0o0o.OooO0O0();
        }
        C1784ooOOO0oo c1784ooOOO0oo = (C1784ooOOO0oo) interfaceC0994oOOOO00o;
        c1784ooOOO0oo.OooO0O0 = OooO0OO;
        c1784ooOOO0oo.OooO0OO = config;
        this.OooO0O0.Oooo0OO(c1784ooOOO0oo, bitmap);
        NavigableMap OooO0Oo2 = OooO0Oo(bitmap.getConfig());
        Integer num = (Integer) OooO0Oo2.get(Integer.valueOf(c1784ooOOO0oo.OooO0O0));
        Integer valueOf = Integer.valueOf(c1784ooOOO0oo.OooO0O0);
        int i = 1;
        if (num != null) {
            i = 1 + num.intValue();
        }
        OooO0Oo2.put(valueOf, Integer.valueOf(i));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("SizeConfigStrategy{groupedMap=");
        sb.append(this.OooO0O0);
        sb.append(", sortedSizes=(");
        HashMap hashMap = this.OooO0OO;
        for (Object obj : hashMap.entrySet()) {
            Map.Entry entry = (Map.Entry) obj;
            sb.append(entry.getKey());
            sb.append('[');
            sb.append(entry.getValue());
            sb.append("], ");
        }
        if (!hashMap.isEmpty()) {
            sb.replace(sb.length() - 2, sb.length(), "");
        }
        sb.append(")}");
        return sb.toString();
    }
}


