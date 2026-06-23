package com.ninja.engine;

import android.content.Context;
import android.net.Uri;
import android.util.Log;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
/* renamed from: com.ninja.engine.o0OO0oOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0349o0OO0oOO implements InterfaceC0346o0OO0o0 {
    public final /* synthetic */ int OooO00o;
    public final Comparable OooO0O0;
    public final Object OooO0OO;
    public Object OooO0Oo;

    public /* synthetic */ C0349o0OO0oOO(int i, Comparable comparable, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = comparable;
        this.OooO0OO = obj;
    }

    public static C0349o0OO0oOO OooO0O0(Context context, Uri uri, InterfaceC1315oOooOoOO interfaceC1315oOooOoOO) {
        return new C0349o0OO0oOO(2, uri, new oOO00OOO(com.bumptech.glide.OooO00o.OooO00o(context).OooO0OO.OooO0O0().OooO0o(), interfaceC1315oOooOoOO, com.bumptech.glide.OooO00o.OooO00o(context).OooO0Oo, context.getContentResolver()));
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x002c, code lost:
        if (r5 != null) goto L6;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x002e, code lost:
        r5.close();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0031, code lost:
        r6 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0040, code lost:
        if (r5 != null) goto L6;
     */
    /* JADX WARN: Removed duplicated region for block: B:56:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00d0  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0093 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:79:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.io.InputStream OooO() {
        /*
            r12 = this;
            java.lang.String r0 = "ThumbStreamOpener"
            java.lang.Comparable r1 = r12.OooO0O0
            android.net.Uri r1 = (android.net.Uri) r1
            java.lang.Object r2 = r12.OooO0OO
            com.ninja.engine.oOO00OOO r2 = (com.ninja.engine.oOO00OOO) r2
            r2.getClass()
            r3 = 3
            r4 = 0
            java.lang.Object r5 = r2.OooO00o     // Catch: java.lang.Throwable -> L33 java.lang.SecurityException -> L36
            com.ninja.engine.oOooOoOO r5 = (com.ninja.engine.InterfaceC1315oOooOoOO) r5     // Catch: java.lang.Throwable -> L33 java.lang.SecurityException -> L36
            android.database.Cursor r5 = r5.OooO0O0(r1)     // Catch: java.lang.Throwable -> L33 java.lang.SecurityException -> L36
            if (r5 == 0) goto L2c
            boolean r6 = r5.moveToFirst()     // Catch: java.lang.Throwable -> L28 java.lang.SecurityException -> L37
            if (r6 == 0) goto L2c
            r6 = 0
            java.lang.String r6 = r5.getString(r6)     // Catch: java.lang.Throwable -> L28 java.lang.SecurityException -> L37
            r5.close()
            goto L43
        L28:
            r0 = move-exception
            r4 = r5
            goto Lce
        L2c:
            if (r5 == 0) goto L31
        L2e:
            r5.close()
        L31:
            r6 = r4
            goto L43
        L33:
            r0 = move-exception
            goto Lce
        L36:
            r5 = r4
        L37:
            boolean r6 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> L28
            if (r6 == 0) goto L40
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> L28
        L40:
            if (r5 == 0) goto L31
            goto L2e
        L43:
            boolean r5 = android.text.TextUtils.isEmpty(r6)
            java.lang.Object r7 = r2.OooO0OO
            android.content.ContentResolver r7 = (android.content.ContentResolver) r7
            if (r5 == 0) goto L4f
        L4d:
            r5 = r4
            goto L90
        L4f:
            java.io.File r5 = new java.io.File
            r5.<init>(r6)
            boolean r6 = r5.exists()
            if (r6 == 0) goto L4d
            long r8 = r5.length()
            r10 = 0
            int r6 = (r10 > r8 ? 1 : (r10 == r8 ? 0 : -1))
            if (r6 >= 0) goto L4d
            android.net.Uri r5 = android.net.Uri.fromFile(r5)
            java.io.InputStream r5 = r7.openInputStream(r5)     // Catch: java.lang.NullPointerException -> L6d
            goto L90
        L6d:
            r0 = move-exception
            java.io.FileNotFoundException r2 = new java.io.FileNotFoundException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "NPE opening uri: "
            r3.<init>(r4)
            r3.append(r1)
            java.lang.String r1 = " -> "
            r3.append(r1)
            r3.append(r5)
            java.lang.String r1 = r3.toString()
            r2.<init>(r1)
            java.lang.Throwable r0 = r2.initCause(r0)
            java.io.FileNotFoundException r0 = (java.io.FileNotFoundException) r0
            throw r0
        L90:
            r6 = -1
            if (r5 == 0) goto Lc4
            java.io.InputStream r4 = r7.openInputStream(r1)     // Catch: java.lang.Throwable -> Lab java.lang.Throwable -> Lad
            java.lang.Object r7 = r2.OooO0Oo     // Catch: java.lang.Throwable -> Lab java.lang.Throwable -> Lad
            java.util.List r7 = (java.util.List) r7     // Catch: java.lang.Throwable -> Lab java.lang.Throwable -> Lad
            java.lang.Object r2 = r2.OooO0O0     // Catch: java.lang.Throwable -> Lab java.lang.Throwable -> Lad
            com.ninja.engine.oO0o0oO0 r2 = (com.ninja.engine.C0836oO0o0oO0) r2     // Catch: java.lang.Throwable -> Lab java.lang.Throwable -> Lad
            int r0 = com.ninja.engine.AbstractC0692o0ooooOo.OooOo(r7, r4, r2)     // Catch: java.lang.Throwable -> Lab java.lang.Throwable -> Lad
            if (r4 == 0) goto Lc5
            r4.close()     // Catch: java.io.IOException -> La9
            goto Lc5
        La9:
            goto Lc5
        Lab:
            r0 = move-exception
            goto Lbe
        Lad:
            boolean r0 = android.util.Log.isLoggable(r0, r3)     // Catch: java.lang.Throwable -> Lab
            if (r0 == 0) goto Lb6
            java.util.Objects.toString(r1)     // Catch: java.lang.Throwable -> Lab
        Lb6:
            if (r4 == 0) goto Lc4
            r4.close()     // Catch: java.io.IOException -> Lbc
            goto Lc4
        Lbc:
            goto Lc4
        Lbe:
            if (r4 == 0) goto Lc3
            r4.close()     // Catch: java.io.IOException -> Lc3
        Lc3:
            throw r0
        Lc4:
            r0 = -1
        Lc5:
            if (r0 == r6) goto Lcd
            com.ninja.engine.o0o00o r1 = new com.ninja.engine.o0o00o
            r1.<init>(r5, r0)
            r5 = r1
        Lcd:
            return r5
        Lce:
            if (r4 == 0) goto Ld3
            r4.close()
        Ld3:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0349o0OO0oOO.OooO():java.io.InputStream");
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final Class OooO00o() {
        switch (this.OooO00o) {
            case 0:
                ((C0455o0OoOo00) this.OooO0OO).getClass();
                return InputStream.class;
            case 1:
                return ((C0601o0oOooO0) this.OooO0OO).OooO0Oo();
            default:
                return InputStream.class;
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void OooO0OO() {
        switch (this.OooO00o) {
            case 0:
                try {
                    ((C0455o0OoOo00) this.OooO0OO).getClass();
                    ((ByteArrayInputStream) this.OooO0Oo).close();
                    return;
                } catch (IOException unused) {
                    return;
                }
            case 1:
                Object obj = this.OooO0Oo;
                if (obj != null) {
                    try {
                        ((C0601o0oOooO0) this.OooO0OO).OooO0O0(obj);
                        return;
                    } catch (IOException unused2) {
                        return;
                    }
                }
                return;
            default:
                InputStream inputStream = (InputStream) this.OooO0Oo;
                if (inputStream != null) {
                    try {
                        inputStream.close();
                        return;
                    } catch (IOException unused3) {
                        return;
                    }
                }
                return;
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final int OooO0o() {
        switch (this.OooO00o) {
            case 0:
                return 1;
            case 1:
                return 1;
            default:
                return 1;
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void OooO0o0(EnumC1000oOOOO0oo enumC1000oOOOO0oo, o0OO0o00 o0oo0o00) {
        switch (this.OooO00o) {
            case 0:
                try {
                    ((C0455o0OoOo00) this.OooO0OO).getClass();
                    ByteArrayInputStream OooOo0 = C0455o0OoOo00.OooOo0((String) this.OooO0O0);
                    this.OooO0Oo = OooOo0;
                    o0oo0o00.OooO0Oo(OooOo0);
                    return;
                } catch (IllegalArgumentException e) {
                    o0oo0o00.OooO0O0(e);
                    return;
                }
            case 1:
                try {
                    Object OooO0oO = ((C0601o0oOooO0) this.OooO0OO).OooO0oO((File) this.OooO0O0);
                    this.OooO0Oo = OooO0oO;
                    o0oo0o00.OooO0Oo(OooO0oO);
                    return;
                } catch (FileNotFoundException e2) {
                    Log.isLoggable("FileLoader", 3);
                    o0oo0o00.OooO0O0(e2);
                    return;
                }
            default:
                try {
                    InputStream OooO = OooO();
                    this.OooO0Oo = OooO;
                    o0oo0o00.OooO0Oo(OooO);
                    return;
                } catch (FileNotFoundException e3) {
                    Log.isLoggable("MediaStoreThumbFetcher", 3);
                    o0oo0o00.OooO0O0(e3);
                    return;
                }
        }
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final void cancel() {
        int i = this.OooO00o;
    }

    private final void OooO0Oo() {
    }

    private final void OooO0oO() {
    }

    private final void OooO0oo() {
    }
}
