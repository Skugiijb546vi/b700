package com.ninja.engine;

import android.content.ComponentName;
import android.content.IntentFilter;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageParser;
import android.content.pm.PermissionGroupInfo;
import android.content.pm.PermissionInfo;
import android.content.pm.ProviderInfo;
import android.content.pm.ServiceInfo;
import android.content.pm.Signature;
import android.os.Bundle;
import android.util.DisplayMetrics;
import java.io.File;
import java.util.List;
@InterfaceC0158o00Oo0O0("android.content.pm.PackageParser")
/* renamed from: com.ninja.engine.oooO0OO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1960oooO0OO0 {

    @InterfaceC0158o00Oo0O0("android.content.pm.PackageParser$Activity")
    /* renamed from: com.ninja.engine.oooO0OO0$OooO00o */
    /* loaded from: classes.dex */
    public interface OooO00o {
        @InterfaceC0160o00Oo0o
        ActivityInfo info();
    }

    @InterfaceC0158o00Oo0O0("android.content.pm.PackageParser$Component")
    /* renamed from: com.ninja.engine.oooO0OO0$OooO0O0 */
    /* loaded from: classes.dex */
    public interface OooO0O0 {
        @InterfaceC0160o00Oo0o
        String className();

        @InterfaceC0160o00Oo0o
        ComponentName componentName();

        @InterfaceC0160o00Oo0o
        List<IntentFilter> intents();
    }

    @InterfaceC0158o00Oo0O0("android.content.pm.PackageParser$Package")
    /* renamed from: com.ninja.engine.oooO0OO0$OooO0OO */
    /* loaded from: classes.dex */
    public interface OooO0OO {
        @InterfaceC0160o00Oo0o
        List activities();

        @InterfaceC0160o00Oo0o
        Bundle mAppMetaData();

        @InterfaceC0160o00Oo0o
        String mSharedUserId();

        @InterfaceC0160o00Oo0o
        Signature[] mSignatures();

        @InterfaceC0160o00Oo0o
        Object mSigningDetails();

        @InterfaceC0160o00Oo0o
        Integer mVersionCode();

        @InterfaceC0160o00Oo0o
        String packageName();

        @InterfaceC0160o00Oo0o
        List permissionGroups();

        @InterfaceC0160o00Oo0o
        List permissions();

        @InterfaceC0160o00Oo0o
        List<String> protectedBroadcasts();

        @InterfaceC0160o00Oo0o
        List providers();

        @InterfaceC0160o00Oo0o
        List receivers();

        @InterfaceC0160o00Oo0o
        List<String> requestedPermissions();

        @InterfaceC0160o00Oo0o
        List services();
    }

    @InterfaceC0158o00Oo0O0("android.content.pm.PackageParser$Permission")
    /* renamed from: com.ninja.engine.oooO0OO0$OooO0Oo  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public interface InterfaceC1961OooO0Oo {
        @InterfaceC0160o00Oo0o
        PermissionInfo info();
    }

    @InterfaceC0158o00Oo0O0("android.content.pm.PackageParser$Provider")
    /* renamed from: com.ninja.engine.oooO0OO0$OooO0o */
    /* loaded from: classes.dex */
    public interface OooO0o {
        @InterfaceC0160o00Oo0o
        ProviderInfo info();
    }

    @InterfaceC0158o00Oo0O0("android.content.pm.PackageParser$PermissionGroup")
    /* renamed from: com.ninja.engine.oooO0OO0$OooO0o0  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public interface InterfaceC1962OooO0o0 {
        @InterfaceC0160o00Oo0o
        PermissionGroupInfo info();
    }

    @InterfaceC0158o00Oo0O0("android.content.pm.PackageParser$Service")
    /* renamed from: com.ninja.engine.oooO0OO0$OooO0oO  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public interface InterfaceC1963OooO0oO {
        @InterfaceC0160o00Oo0o
        ServiceInfo info();
    }

    @InterfaceC0158o00Oo0O0("android.content.pm.PackageParser$SigningDetails")
    /* renamed from: com.ninja.engine.oooO0OO0$OooO0oo  reason: case insensitive filesystem */
    /* loaded from: classes.dex */
    public interface InterfaceC1964OooO0oo {
        @InterfaceC0153o00Oo
        Boolean hasPastSigningCertificates();

        @InterfaceC0153o00Oo
        Boolean hasSignatures();

        @InterfaceC0160o00Oo0o
        Signature[] pastSigningCertificates();

        @InterfaceC0160o00Oo0o
        Signature[] signatures();
    }

    @InterfaceC0159o00Oo0Oo
    PackageParser _new(String str);

    @InterfaceC0153o00Oo
    void collectCertificates(PackageParser.Package r1, int i);

    @InterfaceC0153o00Oo
    PackageParser.Package parsePackage(File file, String str, DisplayMetrics displayMetrics, int i);
}
