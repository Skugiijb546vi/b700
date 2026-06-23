package com.ninja.engine;

import android.content.UriMatcher;
import java.io.InputStream;
/* renamed from: com.ninja.engine.oOoo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1254oOoo00 extends o00OOO0 {
    public static final UriMatcher OooO0o0;

    static {
        UriMatcher uriMatcher = new UriMatcher(-1);
        OooO0o0 = uriMatcher;
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*/#", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/lookup/*", 1);
        uriMatcher.addURI("com.android.contacts", "contacts/#/photo", 2);
        uriMatcher.addURI("com.android.contacts", "contacts/#", 3);
        uriMatcher.addURI("com.android.contacts", "contacts/#/display_photo", 4);
        uriMatcher.addURI("com.android.contacts", "phone_lookup/*", 5);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0025 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0026  */
    @Override // com.ninja.engine.o00OOO0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object OooO(android.net.Uri r4, android.content.ContentResolver r5) {
        /*
            r3 = this;
            android.content.UriMatcher r0 = com.ninja.engine.C1254oOoo00.OooO0o0
            int r0 = r0.match(r4)
            r1 = 1
            if (r0 == r1) goto L19
            r2 = 3
            if (r0 == r2) goto L14
            r2 = 5
            if (r0 == r2) goto L19
            java.io.InputStream r5 = r5.openInputStream(r4)
            goto L23
        L14:
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r4, r1)
            goto L23
        L19:
            android.net.Uri r0 = android.provider.ContactsContract.Contacts.lookupContact(r5, r4)
            if (r0 == 0) goto L3a
            java.io.InputStream r5 = android.provider.ContactsContract.Contacts.openContactPhotoInputStream(r5, r0, r1)
        L23:
            if (r5 == 0) goto L26
            return r5
        L26:
            java.io.FileNotFoundException r5 = new java.io.FileNotFoundException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "InputStream is null for "
            r0.<init>(r1)
            r0.append(r4)
            java.lang.String r4 = r0.toString()
            r5.<init>(r4)
            throw r5
        L3a:
            java.io.FileNotFoundException r4 = new java.io.FileNotFoundException
            java.lang.String r5 = "Contact cannot be found"
            r4.<init>(r5)
            throw r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1254oOoo00.OooO(android.net.Uri, android.content.ContentResolver):java.lang.Object");
    }

    @Override // com.ninja.engine.InterfaceC0346o0OO0o0
    public final Class OooO00o() {
        return InputStream.class;
    }

    @Override // com.ninja.engine.o00OOO0
    public final void OooO0oO(Object obj) {
        ((InputStream) obj).close();
    }
}
