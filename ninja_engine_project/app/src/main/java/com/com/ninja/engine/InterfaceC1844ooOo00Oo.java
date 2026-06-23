package com.ninja.engine;

import android.graphics.Bitmap;
import android.net.Uri;
@InterfaceC0158o00Oo0O0("mirror.android.content.pm.PackageInstaller")
/* renamed from: com.ninja.engine.ooOo00Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1844ooOo00Oo {

    @InterfaceC0158o00Oo0O0("android.content.pm.PackageInstaller$SessionInfo")
    /* renamed from: com.ninja.engine.ooOo00Oo$OooO00o */
    /* loaded from: classes.dex */
    public interface OooO00o {
        @InterfaceC0159o00Oo0Oo
        OooO00o _new();

        @InterfaceC0160o00Oo0o
        boolean active();

        @InterfaceC0160o00Oo0o
        Bitmap appIcon();

        @InterfaceC0160o00Oo0o
        CharSequence appLabel();

        @InterfaceC0160o00Oo0o
        String appPackageName();

        @InterfaceC0160o00Oo0o
        String installerPackageName();

        @InterfaceC0160o00Oo0o
        int mode();

        @InterfaceC0160o00Oo0o
        float progress();

        @InterfaceC0160o00Oo0o
        String resolvedBaseCodePath();

        @InterfaceC0160o00Oo0o
        boolean sealed();

        @InterfaceC0160o00Oo0o
        int sessionId();

        @InterfaceC0160o00Oo0o
        long sizeBytes();
    }

    @InterfaceC0158o00Oo0O0("android.content.pm.PackageInstaller$SessionParams")
    /* renamed from: com.ninja.engine.ooOo00Oo$OooO0O0 */
    /* loaded from: classes.dex */
    public interface OooO0O0 {
        @InterfaceC0160o00Oo0o
        String abiOverride();

        @InterfaceC0160o00Oo0o
        Bitmap appIcon();

        @InterfaceC0160o00Oo0o
        long appIconLastModified();

        @InterfaceC0160o00Oo0o
        String appLabel();

        @InterfaceC0160o00Oo0o
        String appPackageName();

        @InterfaceC0160o00Oo0o
        int installFlags();

        @InterfaceC0160o00Oo0o
        int installLocation();

        @InterfaceC0160o00Oo0o
        int mode();

        @InterfaceC0160o00Oo0o
        Uri originatingUri();

        @InterfaceC0160o00Oo0o
        Uri referrerUri();

        @InterfaceC0160o00Oo0o
        long sizeBytes();
    }

    @InterfaceC0158o00Oo0O0("android.content.pm.PackageInstaller$SessionParams")
    /* renamed from: com.ninja.engine.ooOo00Oo$OooO0OO */
    /* loaded from: classes.dex */
    public interface OooO0OO {
        @InterfaceC0160o00Oo0o
        String abiOverride();

        @InterfaceC0160o00Oo0o
        Bitmap appIcon();

        @InterfaceC0160o00Oo0o
        long appIconLastModified();

        @InterfaceC0160o00Oo0o
        String appLabel();

        @InterfaceC0160o00Oo0o
        String appPackageName();

        @InterfaceC0160o00Oo0o
        String[] grantedRuntimePermissions();

        @InterfaceC0160o00Oo0o
        int installFlags();

        @InterfaceC0160o00Oo0o
        int installLocation();

        @InterfaceC0160o00Oo0o
        int mode();

        @InterfaceC0160o00Oo0o
        Uri originatingUri();

        @InterfaceC0160o00Oo0o
        Uri referrerUri();

        @InterfaceC0160o00Oo0o
        long sizeBytes();

        @InterfaceC0160o00Oo0o
        String volumeUuid();
    }
}
