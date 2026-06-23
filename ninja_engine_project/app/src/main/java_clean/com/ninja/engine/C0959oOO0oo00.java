package com.ninja.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.ListIterator;
/* renamed from: com.ninja.engine.oOO0oo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0959oOO0oo00 extends AbstractC1823ooOOoOo0 implements InterfaceC0625o0oo0OOo {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0959oOO0oo00(int i, Object obj) {
        super(0);
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // com.ninja.engine.InterfaceC0625o0oo0OOo
    public final Object OooO00o() {
        Object obj;
        AbstractC0339o0O0ooo0 abstractC0339o0O0ooo0;
        switch (this.OooO00o) {
            case 0:
                ((androidx.activity.OooO0O0) this.OooO0O0).OooO0O0();
                return C0455o0OoOo00.OooO0o0;
            case 1:
                androidx.activity.OooO0O0 oooO0O0 = (androidx.activity.OooO0O0) this.OooO0O0;
                C0142o00OO00o c0142o00OO00o = oooO0O0.OooO0O0;
                ListIterator listIterator = c0142o00OO00o.listIterator(c0142o00OO00o.size());
                while (true) {
                    if (listIterator.hasPrevious()) {
                        obj = listIterator.previous();
                        if (((AbstractC0955oOO0oOoO) obj).OooO00o) {
                        }
                    } else {
                        obj = null;
                    }
                }
                AbstractC0955oOO0oOoO abstractC0955oOO0oOoO = (AbstractC0955oOO0oOoO) obj;
                oooO0O0.OooO0OO = null;
                return C0455o0OoOo00.OooO0o0;
            case 2:
                ((androidx.activity.OooO0O0) this.OooO0O0).OooO0O0();
                return C0455o0OoOo00.OooO0o0;
            default:
                InterfaceC1468oo0O0OOo interfaceC1468oo0O0OOo = (InterfaceC1468oo0O0OOo) this.OooO0O0;
                AbstractC0809oO0OooOO.OooOOOo(interfaceC1468oo0O0OOo, "<this>");
                ArrayList arrayList = new ArrayList();
                AbstractC1079oOOoO.OooO00o.getClass();
                Class OooO00o = new o0O00OO(C1190oOoOO00o.class).OooO00o();
                AbstractC0809oO0OooOO.OooOOO0(OooO00o, "null cannot be cast to non-null type java.lang.Class<T of kotlin.jvm.JvmClassMappingKt.<get-java>>");
                arrayList.add(new C1465oo0O0OO(OooO00o));
                C1465oo0O0OO[] c1465oo0O0OOArr = (C1465oo0O0OO[]) arrayList.toArray(new C1465oo0O0OO[0]);
                C1465oo0O0OO[] c1465oo0O0OOArr2 = (C1465oo0O0OO[]) Arrays.copyOf(c1465oo0O0OOArr, c1465oo0O0OOArr.length);
                AbstractC0809oO0OooOO.OooOOOo(c1465oo0O0OOArr2, "initializers");
                C1467oo0O0OOO OooO0Oo = interfaceC1468oo0O0OOo.OooO0Oo();
                if (interfaceC1468oo0O0OOo instanceof InterfaceC0786oO0OOooO) {
                    abstractC0339o0O0ooo0 = ((InterfaceC0786oO0OOooO) interfaceC1468oo0O0OOo).OooO0OO();
                } else {
                    abstractC0339o0O0ooo0 = C0337o0O0ooOO.OooO0O0;
                }
                AbstractC0809oO0OooOO.OooOOOo(OooO0Oo, "store");
                AbstractC0809oO0OooOO.OooOOOo(abstractC0339o0O0ooo0, "defaultCreationExtras");
                LinkedHashMap linkedHashMap = OooO0Oo.OooO00o;
                AbstractC1466oo0O0OO0 abstractC1466oo0O0OO0 = (AbstractC1466oo0O0OO0) linkedHashMap.get("androidx.lifecycle.internal.SavedStateHandlesVM");
                if (C1190oOoOO00o.class.isInstance(abstractC1466oo0O0OO0)) {
                    AbstractC0809oO0OooOO.OooOOO0(abstractC1466oo0O0OO0, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
                } else {
                    C0910oOO00Oo0 c0910oOO00Oo0 = new C0910oOO00Oo0(abstractC0339o0O0ooo0);
                    c0910oOO00Oo0.OooO00o.put(C0455o0OoOo00.OooO, "androidx.lifecycle.internal.SavedStateHandlesVM");
                    try {
                        AbstractC1466oo0O0OO0 abstractC1466oo0O0OO02 = null;
                        for (C1465oo0O0OO c1465oo0O0OO : c1465oo0O0OOArr2) {
                            if (AbstractC0809oO0OooOO.OooO0o0(c1465oo0O0OO.OooO00o, C1190oOoOO00o.class)) {
                                Object OooO0O0 = c1465oo0O0OO.OooO0O0.OooO0O0(c0910oOO00Oo0);
                                if (OooO0O0 instanceof AbstractC1466oo0O0OO0) {
                                    abstractC1466oo0O0OO02 = (AbstractC1466oo0O0OO0) OooO0O0;
                                } else {
                                    abstractC1466oo0O0OO02 = null;
                                }
                            }
                        }
                        if (abstractC1466oo0O0OO02 != null) {
                            AbstractC1466oo0O0OO0 abstractC1466oo0O0OO03 = (AbstractC1466oo0O0OO0) linkedHashMap.put("androidx.lifecycle.internal.SavedStateHandlesVM", abstractC1466oo0O0OO02);
                            if (abstractC1466oo0O0OO03 != null) {
                                abstractC1466oo0O0OO03.OooO00o();
                            }
                            abstractC1466oo0O0OO0 = abstractC1466oo0O0OO02;
                        } else {
                            throw new IllegalArgumentException("No initializer set for given class ".concat(C1190oOoOO00o.class.getName()));
                        }
                    } catch (AbstractMethodError unused) {
                        throw new UnsupportedOperationException("Factory.create(String) is unsupported.  This Factory requires `CreationExtras` to be passed into `create` method.");
                    }
                }
                return (C1190oOoOO00o) abstractC1466oo0O0OO0;
        }
    }
}


