package com.ninja.engine;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Locale;
/* renamed from: com.ninja.engine.oO0Ooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0804oO0Ooo0 implements InterfaceC0803oO0Ooo {
    public static final Locale[] OooO0OO = new Locale[0];
    public final Locale[] OooO00o;
    public final String OooO0O0;

    static {
        new Locale("en", "XA");
        new Locale("ar", "XB");
        String[] split = "en-Latn".split("-", -1);
        if (split.length > 2) {
            new Locale(split[0], split[1], split[2]);
        } else if (split.length > 1) {
            new Locale(split[0], split[1]);
        } else if (split.length == 1) {
            new Locale(split[0]);
        } else {
            throw new IllegalArgumentException("Can not parse language tag: [en-Latn]");
        }
    }

    public C0804oO0Ooo0(Locale... localeArr) {
        if (localeArr.length == 0) {
            this.OooO00o = OooO0OO;
            this.OooO0O0 = "";
            return;
        }
        ArrayList arrayList = new ArrayList();
        HashSet hashSet = new HashSet();
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < localeArr.length; i++) {
            Locale locale = localeArr[i];
            if (locale != null) {
                if (!hashSet.contains(locale)) {
                    Locale locale2 = (Locale) locale.clone();
                    arrayList.add(locale2);
                    sb.append(locale2.getLanguage());
                    String country = locale2.getCountry();
                    if (country != null && !country.isEmpty()) {
                        sb.append('-');
                        sb.append(locale2.getCountry());
                    }
                    if (i < localeArr.length - 1) {
                        sb.append(',');
                    }
                    hashSet.add(locale2);
                }
            } else {
                throw new NullPointerException("list[" + i + "] is null");
            }
        }
        this.OooO00o = (Locale[]) arrayList.toArray(new Locale[0]);
        this.OooO0O0 = sb.toString();
    }

    @Override // com.ninja.engine.InterfaceC0803oO0Ooo
    public final String OooO00o() {
        return this.OooO0O0;
    }

    @Override // com.ninja.engine.InterfaceC0803oO0Ooo
    public final Object OooO0O0() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C0804oO0Ooo0)) {
            return false;
        }
        Locale[] localeArr = ((C0804oO0Ooo0) obj).OooO00o;
        Locale[] localeArr2 = this.OooO00o;
        if (localeArr2.length != localeArr.length) {
            return false;
        }
        for (int i = 0; i < localeArr2.length; i++) {
            if (!localeArr2[i].equals(localeArr[i])) {
                return false;
            }
        }
        return true;
    }

    @Override // com.ninja.engine.InterfaceC0803oO0Ooo
    public final Locale get(int i) {
        if (i >= 0) {
            Locale[] localeArr = this.OooO00o;
            if (i < localeArr.length) {
                return localeArr[i];
            }
        }
        return null;
    }

    public final int hashCode() {
        int i = 1;
        for (Locale locale : this.OooO00o) {
            i = (i * 31) + locale.hashCode();
        }
        return i;
    }

    @Override // com.ninja.engine.InterfaceC0803oO0Ooo
    public final boolean isEmpty() {
        if (this.OooO00o.length == 0) {
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.InterfaceC0803oO0Ooo
    public final int size() {
        return this.OooO00o.length;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("[");
        int i = 0;
        while (true) {
            Locale[] localeArr = this.OooO00o;
            if (i < localeArr.length) {
                sb.append(localeArr[i]);
                if (i < localeArr.length - 1) {
                    sb.append(',');
                }
                i++;
            } else {
                sb.append("]");
                return sb.toString();
            }
        }
    }
}


