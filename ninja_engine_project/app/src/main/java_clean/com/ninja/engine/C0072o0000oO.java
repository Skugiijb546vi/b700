package com.ninja.engine;

import android.content.Intent;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.ninja.engine.o0000oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0072o0000oO extends AbstractC0809oO0OooOO {
    @Override public void o00Oo0(Object obj, float f) {}
    public final /* synthetic */ int OooOo0;

    public /* synthetic */ C0072o0000oO(int i) {
        this.OooOo0 = i;
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final Object OoooOOo(int i, Intent intent) {
        boolean z;
        switch (this.OooOo0) {
            case 0:
                C0486o0OoooOO c0486o0OoooOO = C0486o0OoooOO.OooO00o;
                if (i == -1 && intent != null) {
                    String[] stringArrayExtra = intent.getStringArrayExtra("androidx.activity.result.contract.extra.PERMISSIONS");
                    int[] intArrayExtra = intent.getIntArrayExtra("androidx.activity.result.contract.extra.PERMISSION_GRANT_RESULTS");
                    if (intArrayExtra != null && stringArrayExtra != null) {
                        ArrayList arrayList = new ArrayList(intArrayExtra.length);
                        for (int i2 : intArrayExtra) {
                            if (i2 == 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            arrayList.add(Boolean.valueOf(z));
                        }
                        ArrayList arrayList2 = new ArrayList();
                        for (String str : stringArrayExtra) {
                            if (str != null) {
                                arrayList2.add(str);
                            }
                        }
                        Iterator it = arrayList2.iterator();
                        Iterator it2 = arrayList.iterator();
                        ArrayList arrayList3 = new ArrayList(Math.min(o0O0O0Oo.o00O0O(arrayList2), o0O0O0Oo.o00O0O(arrayList)));
                        while (it.hasNext() && it2.hasNext()) {
                            arrayList3.add(new C0987oOOO0oO0(it.next(), it2.next()));
                        }
                        return AbstractC0850oO0oO0oO.o000OOo(arrayList3);
                    }
                    return c0486o0OoooOO;
                }
                return c0486o0OoooOO;
            case 1:
                return new o0000O00(i, intent);
            default:
                return new o0000O00(i, intent);
        }
    }
}



