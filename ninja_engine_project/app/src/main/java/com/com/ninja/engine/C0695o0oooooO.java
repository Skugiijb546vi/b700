package com.ninja.engine;

import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.ninja.engine.o0oooooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0695o0oooooO extends Exception {
    public static final StackTraceElement[] OooO0o = new StackTraceElement[0];
    public final List OooO00o;
    public InterfaceC0745oO00oOo OooO0O0;
    public int OooO0OO;
    public Class OooO0Oo;
    public final String OooO0o0;

    public C0695o0oooooO(String str) {
        this(str, Collections.emptyList());
    }

    public static void OooO00o(Throwable th, ArrayList arrayList) {
        if (th instanceof C0695o0oooooO) {
            for (Throwable th2 : ((C0695o0oooooO) th).OooO00o) {
                OooO00o(th2, arrayList);
            }
            return;
        }
        arrayList.add(th);
    }

    public static void OooO0O0(List list, C0693o0ooooo c0693o0ooooo) {
        try {
            OooO0OO(list, c0693o0ooooo);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void OooO0OO(List list, C0693o0ooooo c0693o0ooooo) {
        int size = list.size();
        int i = 0;
        while (i < size) {
            c0693o0ooooo.append("Cause (");
            int i2 = i + 1;
            c0693o0ooooo.append(String.valueOf(i2));
            c0693o0ooooo.append(" of ");
            c0693o0ooooo.append(String.valueOf(size));
            c0693o0ooooo.append("): ");
            Throwable th = (Throwable) list.get(i);
            if (th instanceof C0695o0oooooO) {
                ((C0695o0oooooO) th).OooO0o0(c0693o0ooooo);
            } else {
                OooO0Oo(th, c0693o0ooooo);
            }
            i = i2;
        }
    }

    public static void OooO0Oo(Throwable th, Appendable appendable) {
        try {
            appendable.append(th.getClass().toString()).append(": ").append(th.getMessage()).append('\n');
        } catch (IOException unused) {
            throw new RuntimeException(th);
        }
    }

    public final void OooO0o0(Appendable appendable) {
        OooO0Oo(this, appendable);
        OooO0O0(this.OooO00o, new C0693o0ooooo(appendable));
    }

    @Override // java.lang.Throwable
    public final String getMessage() {
        String str;
        String str2;
        String str3;
        StringBuilder sb = new StringBuilder(71);
        sb.append(this.OooO0o0);
        String str4 = "";
        if (this.OooO0Oo == null) {
            str = "";
        } else {
            str = ", " + this.OooO0Oo;
        }
        sb.append(str);
        int i = this.OooO0OO;
        if (i == 0) {
            str2 = "";
        } else {
            str2 = ", ".concat(AbstractC1230oOoOo0o.OooOOo0(i));
        }
        sb.append(str2);
        if (this.OooO0O0 != null) {
            str4 = ", " + this.OooO0O0;
        }
        sb.append(str4);
        ArrayList arrayList = new ArrayList();
        OooO00o(this, arrayList);
        if (arrayList.isEmpty()) {
            return sb.toString();
        }
        if (arrayList.size() == 1) {
            str3 = "\nThere was 1 root cause:";
        } else {
            sb.append("\nThere were ");
            sb.append(arrayList.size());
            str3 = " root causes:";
        }
        sb.append(str3);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Throwable th = (Throwable) it.next();
            sb.append('\n');
            sb.append(th.getClass().getName());
            sb.append('(');
            sb.append(th.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }

    @Override // java.lang.Throwable
    public final void printStackTrace() {
        OooO0o0(System.err);
    }

    public C0695o0oooooO(String str, List list) {
        this.OooO0o0 = str;
        setStackTrace(OooO0o);
        this.OooO00o = list;
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintStream printStream) {
        OooO0o0(printStream);
    }

    @Override // java.lang.Throwable
    public final void printStackTrace(PrintWriter printWriter) {
        OooO0o0(printWriter);
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        return this;
    }
}
