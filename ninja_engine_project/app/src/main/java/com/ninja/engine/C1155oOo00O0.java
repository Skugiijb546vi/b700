package com.ninja.engine;

import java.util.ArrayList;
/* renamed from: com.ninja.engine.oOo00O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1155oOo00O0 {
    public AbstractC1504oo0OOo00 OooO00o;
    public ArrayList OooO0O0;

    public static long OooO00o(C0379o0OOo0O0 c0379o0OOo0O0, long j) {
        AbstractC1504oo0OOo00 abstractC1504oo0OOo00 = c0379o0OOo0O0.OooO0Oo;
        if (abstractC1504oo0OOo00 instanceof C1792ooOOOOOo) {
            return j;
        }
        ArrayList arrayList = c0379o0OOo0O0.OooOO0O;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0376o0OOo00O interfaceC0376o0OOo00O = (InterfaceC0376o0OOo00O) arrayList.get(i);
            if (interfaceC0376o0OOo00O instanceof C0379o0OOo0O0) {
                C0379o0OOo0O0 c0379o0OOo0O02 = (C0379o0OOo0O0) interfaceC0376o0OOo00O;
                if (c0379o0OOo0O02.OooO0Oo != abstractC1504oo0OOo00) {
                    j2 = Math.min(j2, OooO00o(c0379o0OOo0O02, c0379o0OOo0O02.OooO0o + j));
                }
            }
        }
        if (c0379o0OOo0O0 == abstractC1504oo0OOo00.OooO) {
            long OooOO0 = abstractC1504oo0OOo00.OooOO0();
            C0379o0OOo0O0 c0379o0OOo0O03 = abstractC1504oo0OOo00.OooO0oo;
            long j3 = j - OooOO0;
            return Math.min(Math.min(j2, OooO00o(c0379o0OOo0O03, j3)), j3 - c0379o0OOo0O03.OooO0o);
        }
        return j2;
    }

    public static long OooO0O0(C0379o0OOo0O0 c0379o0OOo0O0, long j) {
        AbstractC1504oo0OOo00 abstractC1504oo0OOo00 = c0379o0OOo0O0.OooO0Oo;
        if (abstractC1504oo0OOo00 instanceof C1792ooOOOOOo) {
            return j;
        }
        ArrayList arrayList = c0379o0OOo0O0.OooOO0O;
        int size = arrayList.size();
        long j2 = j;
        for (int i = 0; i < size; i++) {
            InterfaceC0376o0OOo00O interfaceC0376o0OOo00O = (InterfaceC0376o0OOo00O) arrayList.get(i);
            if (interfaceC0376o0OOo00O instanceof C0379o0OOo0O0) {
                C0379o0OOo0O0 c0379o0OOo0O02 = (C0379o0OOo0O0) interfaceC0376o0OOo00O;
                if (c0379o0OOo0O02.OooO0Oo != abstractC1504oo0OOo00) {
                    j2 = Math.max(j2, OooO0O0(c0379o0OOo0O02, c0379o0OOo0O02.OooO0o + j));
                }
            }
        }
        if (c0379o0OOo0O0 == abstractC1504oo0OOo00.OooO0oo) {
            long OooOO0 = abstractC1504oo0OOo00.OooOO0();
            C0379o0OOo0O0 c0379o0OOo0O03 = abstractC1504oo0OOo00.OooO;
            long j3 = j + OooOO0;
            return Math.max(Math.max(j2, OooO0O0(c0379o0OOo0O03, j3)), j3 - c0379o0OOo0O03.OooO0o);
        }
        return j2;
    }
}
