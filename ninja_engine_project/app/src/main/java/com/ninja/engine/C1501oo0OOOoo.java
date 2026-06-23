package com.ninja.engine;

import com.app.framework.utils.ShellUtils;
import java.io.PrintStream;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
/* renamed from: com.ninja.engine.oo0OOOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1501oo0OOOoo {
    public static int OooO0o;
    public ArrayList OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public ArrayList OooO0Oo;
    public int OooO0o0;

    public final void OooO00o(ArrayList arrayList) {
        int size = this.OooO00o.size();
        if (this.OooO0o0 != -1 && size > 0) {
            for (int i = 0; i < arrayList.size(); i++) {
                C1501oo0OOOoo c1501oo0OOOoo = (C1501oo0OOOoo) arrayList.get(i);
                if (this.OooO0o0 == c1501oo0OOOoo.OooO0O0) {
                    OooO0OO(this.OooO0OO, c1501oo0OOOoo);
                }
            }
        }
        if (size == 0) {
            arrayList.remove(this);
        }
    }

    public final int OooO0O0(oO0OO0O oo0oo0o, int i) {
        int OooOOO;
        C0304o0O0OoO c0304o0O0OoO;
        ArrayList arrayList = this.OooO00o;
        if (arrayList.size() == 0) {
            return 0;
        }
        C0580o0oOo0O0 c0580o0oOo0O0 = (C0580o0oOo0O0) ((C0316o0O0o0o) arrayList.get(0)).OoooO;
        oo0oo0o.OooOo00();
        c0580o0oOo0O0.OooO0O0(oo0oo0o, false);
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            ((C0316o0O0o0o) arrayList.get(i2)).OooO0O0(oo0oo0o, false);
        }
        if (i == 0 && c0580o0oOo0O0.o0OO00O > 0) {
            AbstractC0809oO0OooOO.OooO0OO(c0580o0oOo0O0, oo0oo0o, arrayList, 0);
        }
        if (i == 1 && c0580o0oOo0O0.oo0o0Oo > 0) {
            AbstractC0809oO0OooOO.OooO0OO(c0580o0oOo0O0, oo0oo0o, arrayList, 1);
        }
        try {
            oo0oo0o.OooOOOo();
        } catch (Exception e) {
            PrintStream printStream = System.err;
            printStream.println(e.toString() + ShellUtils.COMMAND_LINE_END + Arrays.toString(e.getStackTrace()).replace("[", "   at ").replace(",", "\n   at").replace("]", ""));
        }
        this.OooO0Oo = new ArrayList();
        for (int i3 = 0; i3 < arrayList.size(); i3++) {
            C0316o0O0o0o c0316o0O0o0o = (C0316o0O0o0o) arrayList.get(i3);
            C0919oOO00oOo c0919oOO00oOo = new C0919oOO00oOo(27);
            new WeakReference(c0316o0O0o0o);
            oO0OO0O.OooOOO(c0316o0O0o0o.Oooo0);
            oO0OO0O.OooOOO(c0316o0O0o0o.Oooo0O0);
            oO0OO0O.OooOOO(c0316o0O0o0o.Oooo0OO);
            oO0OO0O.OooOOO(c0316o0O0o0o.Oooo0o0);
            oO0OO0O.OooOOO(c0316o0O0o0o.Oooo0o);
            this.OooO0Oo.add(c0919oOO00oOo);
        }
        if (i == 0) {
            OooOOO = oO0OO0O.OooOOO(c0580o0oOo0O0.Oooo0);
            c0304o0O0OoO = c0580o0oOo0O0.Oooo0OO;
        } else {
            OooOOO = oO0OO0O.OooOOO(c0580o0oOo0O0.Oooo0O0);
            c0304o0O0OoO = c0580o0oOo0O0.Oooo0o0;
        }
        int OooOOO2 = oO0OO0O.OooOOO(c0304o0O0OoO);
        oo0oo0o.OooOo00();
        return OooOOO2 - OooOOO;
    }

    public final void OooO0OO(int i, C1501oo0OOOoo c1501oo0OOOoo) {
        Iterator it = this.OooO00o.iterator();
        while (it.hasNext()) {
            C0316o0O0o0o c0316o0O0o0o = (C0316o0O0o0o) it.next();
            ArrayList arrayList = c1501oo0OOOoo.OooO00o;
            if (!arrayList.contains(c0316o0O0o0o)) {
                arrayList.add(c0316o0O0o0o);
            }
            int i2 = c1501oo0OOOoo.OooO0O0;
            if (i == 0) {
                c0316o0O0o0o.o00Oo0 = i2;
            } else {
                c0316o0O0o0o.o00Ooo = i2;
            }
        }
        this.OooO0o0 = c1501oo0OOOoo.OooO0O0;
    }

    public final String toString() {
        String str;
        Iterator it;
        StringBuilder sb = new StringBuilder();
        int i = this.OooO0OO;
        if (i == 0) {
            str = "Horizontal";
        } else if (i == 1) {
            str = "Vertical";
        } else if (i == 2) {
            str = "Both";
        } else {
            str = "Unknown";
        }
        sb.append(str);
        sb.append(" [");
        sb.append(this.OooO0O0);
        sb.append("] <");
        String sb2 = sb.toString();
        while (this.OooO00o.iterator().hasNext()) {
            sb2 = sb2 + " " + ((C0316o0O0o0o) it.next()).Oooooo;
        }
        return AbstractC1230oOoOo0o.OooO0oO(sb2, " >");
    }
}
