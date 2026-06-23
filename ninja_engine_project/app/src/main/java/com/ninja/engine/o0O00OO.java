package com.ninja.engine;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class o0O00OO implements InterfaceC1173oOo00ooo, o0O00O {
    public static final Map OooO0O0;
    public final Class OooO00o;

    static {
        int i = 0;
        List asList = Arrays.asList(InterfaceC0625o0oo0OOo.class, InterfaceC0638o0oo0oo0.class, InterfaceC0643o0ooO000.class, InterfaceC0642o0ooO00.class, InterfaceC0644o0ooO00O.class, InterfaceC0645o0ooO00o.class, InterfaceC0646o0ooO0O.class, InterfaceC0648o0ooO0OO.class, InterfaceC0649o0ooO0Oo.class, InterfaceC0651o0ooO0o0.class, InterfaceC0626o0oo0Oo.class, InterfaceC0627o0oo0OoO.class, InterfaceC0628o0oo0Ooo.class, InterfaceC0631o0oo0o00.class, InterfaceC0630o0oo0o0.class, InterfaceC0632o0oo0o0O.class, InterfaceC0633o0oo0o0o.class, InterfaceC0635o0oo0oO0.class, InterfaceC0634o0oo0oO.class, InterfaceC0636o0oo0oOo.class, InterfaceC0637o0oo0oo.class, InterfaceC0639o0oo0ooO.class, InterfaceC0640o0oo0ooo.class);
        AbstractC0809oO0OooOO.OooOOOO(asList, "asList(...)");
        List list = asList;
        ArrayList arrayList = new ArrayList(o0O0O0Oo.o00O0O(list));
        for (Object obj : list) {
            int i2 = i + 1;
            if (i >= 0) {
                arrayList.add(new C0987oOOO0oO0((Class) obj, Integer.valueOf(i)));
                i = i2;
            } else {
                throw new ArithmeticException("Index overflow has happened.");
            }
        }
        OooO0O0 = AbstractC0850oO0oO0oO.o000OOo(arrayList);
        HashMap hashMap = new HashMap();
        hashMap.put("boolean", "kotlin.Boolean");
        hashMap.put("char", "kotlin.Char");
        hashMap.put("byte", "kotlin.Byte");
        hashMap.put("short", "kotlin.Short");
        hashMap.put("int", "kotlin.Int");
        hashMap.put("float", "kotlin.Float");
        hashMap.put("long", "kotlin.Long");
        hashMap.put("double", "kotlin.Double");
        HashMap hashMap2 = new HashMap();
        hashMap2.put("java.lang.Boolean", "kotlin.Boolean");
        hashMap2.put("java.lang.Character", "kotlin.Char");
        hashMap2.put("java.lang.Byte", "kotlin.Byte");
        hashMap2.put("java.lang.Short", "kotlin.Short");
        hashMap2.put("java.lang.Integer", "kotlin.Int");
        hashMap2.put("java.lang.Float", "kotlin.Float");
        hashMap2.put("java.lang.Long", "kotlin.Long");
        hashMap2.put("java.lang.Double", "kotlin.Double");
        HashMap hashMap3 = new HashMap();
        hashMap3.put("java.lang.Object", "kotlin.Any");
        hashMap3.put("java.lang.String", "kotlin.String");
        hashMap3.put("java.lang.CharSequence", "kotlin.CharSequence");
        hashMap3.put("java.lang.Throwable", "kotlin.Throwable");
        hashMap3.put("java.lang.Cloneable", "kotlin.Cloneable");
        hashMap3.put("java.lang.Number", "kotlin.Number");
        hashMap3.put("java.lang.Comparable", "kotlin.Comparable");
        hashMap3.put("java.lang.Enum", "kotlin.Enum");
        hashMap3.put("java.lang.annotation.Annotation", "kotlin.Annotation");
        hashMap3.put("java.lang.Iterable", "kotlin.collections.Iterable");
        hashMap3.put("java.util.Iterator", "kotlin.collections.Iterator");
        hashMap3.put("java.util.Collection", "kotlin.collections.Collection");
        hashMap3.put("java.util.List", "kotlin.collections.List");
        hashMap3.put("java.util.Set", "kotlin.collections.Set");
        hashMap3.put("java.util.ListIterator", "kotlin.collections.ListIterator");
        hashMap3.put("java.util.Map", "kotlin.collections.Map");
        hashMap3.put("java.util.Map$Entry", "kotlin.collections.Map.Entry");
        hashMap3.put("kotlin.jvm.internal.StringCompanionObject", "kotlin.String.Companion");
        hashMap3.put("kotlin.jvm.internal.EnumCompanionObject", "kotlin.Enum.Companion");
        hashMap3.putAll(hashMap);
        hashMap3.putAll(hashMap2);
        Collection<String> values = hashMap.values();
        AbstractC0809oO0OooOO.OooOOOO(values, "<get-values>(...)");
        for (String str : values) {
            StringBuilder sb = new StringBuilder("kotlin.jvm.internal.");
            AbstractC0809oO0OooOO.OooOO0o(str);
            sb.append(AbstractC1268oOoo0O0O.OooOooo(str));
            sb.append("CompanionObject");
            hashMap3.put(sb.toString(), str.concat(".Companion"));
        }
        for (Map.Entry entry : OooO0O0.entrySet()) {
            int intValue = ((Number) entry.getValue()).intValue();
            String name = ((Class) entry.getKey()).getName();
            hashMap3.put(name, "kotlin.Function" + intValue);
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(AbstractC0850oO0oO0oO.o0O0O00(hashMap3.size()));
        for (Map.Entry entry2 : hashMap3.entrySet()) {
            linkedHashMap.put(entry2.getKey(), AbstractC1268oOoo0O0O.OooOooo((String) entry2.getValue()));
        }
    }

    public o0O00OO(Class cls) {
        AbstractC0809oO0OooOO.OooOOOo(cls, "jClass");
        this.OooO00o = cls;
    }

    @Override // com.ninja.engine.o0O00O
    public final Class OooO00o() {
        return this.OooO00o;
    }

    public final boolean equals(Object obj) {
        if ((obj instanceof o0O00OO) && AbstractC0809oO0OooOO.OooO0o0(AbstractC0694o0ooooo0.OooOoOO(this), AbstractC0694o0ooooo0.OooOoOO((InterfaceC1173oOo00ooo) obj))) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC0694o0ooooo0.OooOoOO(this).hashCode();
    }

    public final String toString() {
        return this.OooO00o.toString() + " (Kotlin reflection is not available)";
    }
}
