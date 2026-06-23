package com.ninja.engine;

import android.os.LocaleList;
import java.util.Locale;
/* renamed from: com.ninja.engine.oO0OooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0807oO0OooO implements InterfaceC0803oO0Ooo {
    public final LocaleList OooO00o;

    public C0807oO0OooO(Object obj) {
        this.OooO00o = AbstractC0031Oooo00O.OooO0o0(obj);
    }

    @Override // com.ninja.engine.InterfaceC0803oO0Ooo
    public final String OooO00o() {
        String languageTags;
        languageTags = this.OooO00o.toLanguageTags();
        return languageTags;
    }

    @Override // com.ninja.engine.InterfaceC0803oO0Ooo
    public final Object OooO0O0() {
        return this.OooO00o;
    }

    public final boolean equals(Object obj) {
        boolean equals;
        equals = this.OooO00o.equals(((InterfaceC0803oO0Ooo) obj).OooO0O0());
        return equals;
    }

    @Override // com.ninja.engine.InterfaceC0803oO0Ooo
    public final Locale get(int i) {
        Locale locale;
        locale = this.OooO00o.get(i);
        return locale;
    }

    public final int hashCode() {
        int hashCode;
        hashCode = this.OooO00o.hashCode();
        return hashCode;
    }

    @Override // com.ninja.engine.InterfaceC0803oO0Ooo
    public final boolean isEmpty() {
        boolean isEmpty;
        isEmpty = this.OooO00o.isEmpty();
        return isEmpty;
    }

    @Override // com.ninja.engine.InterfaceC0803oO0Ooo
    public final int size() {
        int size;
        size = this.OooO00o.size();
        return size;
    }

    public final String toString() {
        String localeList;
        localeList = this.OooO00o.toString();
        return localeList;
    }
}


