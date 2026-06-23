package com.ninja.engine;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.ninja.engine.oOOoo0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1114oOOoo0O extends AbstractC1061oOOo0O0O {
    public static final C1105oOOoOoo OooO0oO;
    public static final C1105oOOoOoo OooO0oo;
    public final ArrayList OooO0OO = new ArrayList();
    public final String OooO0Oo;
    public final Context OooO0o;
    public final String OooO0o0;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v0, types: [java.lang.Object, com.ninja.engine.oo00000O] */
    static {
        AbstractC0186o00Ooooo abstractC0186o00Ooooo = new AbstractC0186o00Ooooo() {};
        C0395o0OOoo c0395o0OOoo = C0395o0OOoo.OooO0O0;
        OooO0oO = (C1105oOOoOoo) ((C1105oOOoOoo) abstractC0186o00Ooooo.OooO0Oo(c0395o0OOoo)).OooOOO(new InterfaceC1351oo00000O() {
            public InterfaceC1108oOOoo OooO00o(C1932ooo0Oo0 c, InterfaceC1108oOOoo i, int i1, int i2) { return null; }
            public void OooO0O0(java.security.MessageDigest messageDigest) {}
        }, true);
        OooO0oo = (C1105oOOoOoo) new AbstractC0186o00Ooooo() {}.OooO0Oo(c0395o0OOoo);
    }

    public C1114oOOoo0O(o000OO00 o000oo00, String str, String str2) {
        this.OooO0o = o000oo00;
        this.OooO0Oo = str;
        this.OooO0o0 = str2;
    }

    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    public final int OooO00o() {
        return this.OooO0OO.size();
    }

    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    public final int OooO0OO(int i) {
        return !(this.OooO0OO.get(i) instanceof C1113oOOoo00o) ? 1 : 0;
    }

    /* JADX WARN: Type inference failed for: r5v1, types: [com.ninja.engine.oOOoO0o, com.ninja.engine.oOOoo0O0] */
    /* JADX WARN: Type inference failed for: r5v2, types: [com.ninja.engine.oOOoO0o, com.ninja.engine.oOOoo00O] */
    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    public final AbstractC1083oOOoO0o OooO0o(RecyclerView recyclerView, int i) {
        LayoutInflater from = LayoutInflater.from(recyclerView.getContext());
        if (i == 0) {
            View inflate = from.inflate(R.layout.item_region_header, (ViewGroup) recyclerView, false);
            AbstractC1083oOOoO0o abstractC1083oOOoO0o = new AbstractC1083oOOoO0o(inflate) {};
            abstractC1083oOOoO0o.OooOo00 = (ImageView) inflate.findViewById(R.id.region_icon);
            abstractC1083oOOoO0o.OooOo0 = (TextView) inflate.findViewById(R.id.region_name);
            return abstractC1083oOOoO0o;
        }
        View inflate2 = from.inflate(R.layout.item_reseller, (ViewGroup) recyclerView, false);
        AbstractC1083oOOoO0o abstractC1083oOOoO0o2 = new AbstractC1083oOOoO0o(inflate2) {};
        abstractC1083oOOoO0o2.OooOo00 = (TextView) inflate2.findViewById(R.id.reseller_initial);
        abstractC1083oOOoO0o2.OooOo0 = (ImageView) inflate2.findViewById(R.id.reseller_avatar);
        abstractC1083oOOoO0o2.OooOo0O = (TextView) inflate2.findViewById(R.id.reseller_username);
        abstractC1083oOOoO0o2.OooOo0o = (ImageView) inflate2.findViewById(R.id.reseller_copy);
        return abstractC1083oOOoO0o2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00da  */
    /* JADX WARN: Type inference failed for: r3v6, types: [java.lang.Object, com.ninja.engine.o00o0Oo0] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, com.ninja.engine.o00o0Oo0] */
    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0o0(com.ninja.engine.AbstractC1083oOOoO0o r8, int r9) {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1114oOOoo0O.OooO0o0(com.ninja.engine.oOOoO0o, int):void");
    }

    public final void OooO0oO(List list) {
        ArrayList arrayList = this.OooO0OO;
        arrayList.clear();
        Iterator it = ((ArrayList) list).iterator();
        while (it.hasNext()) {
            C1113oOOoo00o c1113oOOoo00o = (C1113oOOoo00o) it.next();
            arrayList.add(c1113oOOoo00o);
            for (Object obj : c1113oOOoo00o.OooO0OO) {
                C1109oOOoo0 c1109oOOoo0 = (C1109oOOoo0) obj;
                arrayList.add(c1109oOOoo0);
            }
        }
        this.OooO00o.OooO0O0();
    }
}



