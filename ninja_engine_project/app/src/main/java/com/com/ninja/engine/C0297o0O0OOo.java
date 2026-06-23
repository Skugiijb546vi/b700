package com.ninja.engine;

import android.content.Intent;
import android.os.Bundle;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: com.ninja.engine.o0O0OOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0297o0O0OOo {
    public final HashMap OooO00o = new HashMap();
    public final HashMap OooO0O0 = new HashMap();
    public final HashMap OooO0OO = new HashMap();
    public ArrayList OooO0Oo = new ArrayList();
    public final transient HashMap OooO0o0 = new HashMap();
    public final HashMap OooO0o = new HashMap();
    public final Bundle OooO0oO = new Bundle();

    public final boolean OooO00o(int i, int i2, Intent intent) {
        InterfaceC0076o0000oo interfaceC0076o0000oo;
        String str = (String) this.OooO00o.get(Integer.valueOf(i));
        if (str == null) {
            return false;
        }
        o0000O0 o0000o0 = (o0000O0) this.OooO0o0.get(str);
        if (o0000o0 != null && (interfaceC0076o0000oo = o0000o0.OooO00o) != null && this.OooO0Oo.contains(str)) {
            interfaceC0076o0000oo.OooO0OO(o0000o0.OooO0O0.OoooOOo(i2, intent));
            this.OooO0Oo.remove(str);
            return true;
        }
        this.OooO0o.remove(str);
        this.OooO0oO.putParcelable(str, new o0000O00(i2, intent));
        return true;
    }

    public final C0415o0Oo0O0O OooO0O0(String str, AbstractC0809oO0OooOO abstractC0809oO0OooOO, InterfaceC0076o0000oo interfaceC0076o0000oo) {
        int i;
        HashMap hashMap;
        HashMap hashMap2 = this.OooO0O0;
        if (((Integer) hashMap2.get(str)) == null) {
            AbstractC1053oOOo00O0.OooO00o.getClass();
            int nextInt = AbstractC1053oOOo00O0.OooO0O0.OooO00o().nextInt(2147418112);
            while (true) {
                i = nextInt + 65536;
                hashMap = this.OooO00o;
                if (!hashMap.containsKey(Integer.valueOf(i))) {
                    break;
                }
                AbstractC1053oOOo00O0.OooO00o.getClass();
                nextInt = AbstractC1053oOOo00O0.OooO0O0.OooO00o().nextInt(2147418112);
            }
            hashMap.put(Integer.valueOf(i), str);
            hashMap2.put(str, Integer.valueOf(i));
        }
        this.OooO0o0.put(str, new o0000O0(interfaceC0076o0000oo, abstractC0809oO0OooOO));
        HashMap hashMap3 = this.OooO0o;
        if (hashMap3.containsKey(str)) {
            Object obj = hashMap3.get(str);
            hashMap3.remove(str);
            interfaceC0076o0000oo.OooO0OO(obj);
        }
        Bundle bundle = this.OooO0oO;
        o0000O00 o0000o00 = (o0000O00) bundle.getParcelable(str);
        if (o0000o00 != null) {
            bundle.remove(str);
            interfaceC0076o0000oo.OooO0OO(abstractC0809oO0OooOO.OoooOOo(o0000o00.OooO00o, o0000o00.OooO0O0));
        }
        return new C0415o0Oo0O0O(this, 2, str);
    }
}
