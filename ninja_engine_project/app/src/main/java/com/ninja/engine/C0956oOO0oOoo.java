package com.ninja.engine;

import java.util.ListIterator;
/* renamed from: com.ninja.engine.oOO0oOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0956oOO0oOoo extends AbstractC1823ooOOoOo0 implements InterfaceC0638o0oo0oo0 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ androidx.activity.OooO0O0 OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0956oOO0oOoo(androidx.activity.OooO0O0 oooO0O0, int i) {
        super(1);
        this.OooO00o = i;
        this.OooO0O0 = oooO0O0;
    }

    @Override // com.ninja.engine.InterfaceC0638o0oo0oo0
    public final Object OooO0O0(Object obj) {
        Object obj2;
        Object obj3;
        C0173o00OoOo0 c0173o00OoOo0 = (C0173o00OoOo0) obj;
        switch (this.OooO00o) {
            case 0:
                AbstractC0809oO0OooOO.OooOOOo(c0173o00OoOo0, "backEvent");
                androidx.activity.OooO0O0 oooO0O0 = this.OooO0O0;
                C0142o00OO00o c0142o00OO00o = oooO0O0.OooO0O0;
                ListIterator listIterator = c0142o00OO00o.listIterator(c0142o00OO00o.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj2 = listIterator.previous();
                        if (((AbstractC0955oOO0oOoO) obj2).OooO00o) {
                        }
                    } else {
                        obj2 = null;
                    }
                }
                oooO0O0.OooO0OO = (AbstractC0955oOO0oOoO) obj2;
                return C0455o0OoOo00.OooO0o0;
            default:
                AbstractC0809oO0OooOO.OooOOOo(c0173o00OoOo0, "backEvent");
                C0142o00OO00o c0142o00OO00o2 = this.OooO0O0.OooO0O0;
                ListIterator listIterator2 = c0142o00OO00o2.listIterator(c0142o00OO00o2.size());
                while (true) {
                    if (listIterator2.hasPrevious()) {
                        obj3 = listIterator2.previous();
                        if (((AbstractC0955oOO0oOoO) obj3).OooO00o) {
                        }
                    } else {
                        obj3 = null;
                    }
                }
                AbstractC0955oOO0oOoO abstractC0955oOO0oOoO = (AbstractC0955oOO0oOoO) obj3;
                return C0455o0OoOo00.OooO0o0;
        }
    }
}
