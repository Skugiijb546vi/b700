package com.ninja.engine;

import android.content.pm.Signature;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
@InterfaceC0157o00Oo0O("android.content.pm.PackageParser$SigningDetails")
/* renamed from: com.ninja.engine.oo0o0oOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1579oo0o0oOO {
    @InterfaceC0166o00OoO00
    Method _check_hasPastSigningCertificates();

    @InterfaceC0166o00OoO00
    Method _check_hasSignatures();

    @InterfaceC0162o00Oo0oO
    Field _check_pastSigningCertificates();

    @InterfaceC0162o00Oo0oO
    Field _check_signatures();

    @InterfaceC0563o0oOO
    void _set_pastSigningCertificates(Object obj);

    @InterfaceC0563o0oOO
    void _set_signatures(Object obj);

    Boolean hasPastSigningCertificates();

    Boolean hasSignatures();

    @InterfaceC0163o00Oo0oo
    Signature[] pastSigningCertificates();

    @InterfaceC0163o00Oo0oo
    Signature[] signatures();
}


