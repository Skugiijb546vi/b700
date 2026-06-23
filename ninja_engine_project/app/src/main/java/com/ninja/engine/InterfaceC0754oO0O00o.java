package com.ninja.engine;

import android.content.pm.Signature;
import android.os.Bundle;
import java.lang.reflect.Field;
import java.util.List;
@InterfaceC0157o00Oo0O("android.content.pm.PackageParser$Package")
/* renamed from: com.ninja.engine.oO0O00o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC0754oO0O00o {
    @InterfaceC0162o00Oo0oO
    Field _check_activities();

    @InterfaceC0162o00Oo0oO
    Field _check_mAppMetaData();

    @InterfaceC0162o00Oo0oO
    Field _check_mSharedUserId();

    @InterfaceC0162o00Oo0oO
    Field _check_mSignatures();

    @InterfaceC0162o00Oo0oO
    Field _check_mSigningDetails();

    @InterfaceC0162o00Oo0oO
    Field _check_mVersionCode();

    @InterfaceC0162o00Oo0oO
    Field _check_packageName();

    @InterfaceC0162o00Oo0oO
    Field _check_permissionGroups();

    @InterfaceC0162o00Oo0oO
    Field _check_permissions();

    @InterfaceC0162o00Oo0oO
    Field _check_protectedBroadcasts();

    @InterfaceC0162o00Oo0oO
    Field _check_providers();

    @InterfaceC0162o00Oo0oO
    Field _check_receivers();

    @InterfaceC0162o00Oo0oO
    Field _check_requestedPermissions();

    @InterfaceC0162o00Oo0oO
    Field _check_services();

    @InterfaceC0563o0oOO
    void _set_activities(Object obj);

    @InterfaceC0563o0oOO
    void _set_mAppMetaData(Object obj);

    @InterfaceC0563o0oOO
    void _set_mSharedUserId(Object obj);

    @InterfaceC0563o0oOO
    void _set_mSignatures(Object obj);

    @InterfaceC0563o0oOO
    void _set_mSigningDetails(Object obj);

    @InterfaceC0563o0oOO
    void _set_mVersionCode(Object obj);

    @InterfaceC0563o0oOO
    void _set_packageName(Object obj);

    @InterfaceC0563o0oOO
    void _set_permissionGroups(Object obj);

    @InterfaceC0563o0oOO
    void _set_permissions(Object obj);

    @InterfaceC0563o0oOO
    void _set_protectedBroadcasts(Object obj);

    @InterfaceC0563o0oOO
    void _set_providers(Object obj);

    @InterfaceC0563o0oOO
    void _set_receivers(Object obj);

    @InterfaceC0563o0oOO
    void _set_requestedPermissions(Object obj);

    @InterfaceC0563o0oOO
    void _set_services(Object obj);

    @InterfaceC0163o00Oo0oo
    List activities();

    @InterfaceC0163o00Oo0oo
    Bundle mAppMetaData();

    @InterfaceC0163o00Oo0oo
    String mSharedUserId();

    @InterfaceC0163o00Oo0oo
    Signature[] mSignatures();

    @InterfaceC0163o00Oo0oo
    Object mSigningDetails();

    @InterfaceC0163o00Oo0oo
    Integer mVersionCode();

    @InterfaceC0163o00Oo0oo
    String packageName();

    @InterfaceC0163o00Oo0oo
    List permissionGroups();

    @InterfaceC0163o00Oo0oo
    List permissions();

    @InterfaceC0163o00Oo0oo
    List<String> protectedBroadcasts();

    @InterfaceC0163o00Oo0oo
    List providers();

    @InterfaceC0163o00Oo0oo
    List receivers();

    @InterfaceC0163o00Oo0oo
    List<String> requestedPermissions();

    @InterfaceC0163o00Oo0oo
    List services();
}
