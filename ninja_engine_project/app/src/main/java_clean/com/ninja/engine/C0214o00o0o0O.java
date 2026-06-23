package com.ninja.engine;

import android.content.Context;
import com.app.framework.app.configuration.ClientConfiguration;
import java.io.File;
/* renamed from: com.ninja.engine.o00o0o0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0214o00o0o0O extends ClientConfiguration {
    public final /* synthetic */ Context OooO00o;
    public final /* synthetic */ C0215o00o0o0o OooO0O0;

    public C0214o00o0o0O(Context context, C0215o00o0o0o c0215o00o0o0o) {
        this.OooO00o = context;
        this.OooO0O0 = c0215o00o0o0o;
    }

    @Override // com.app.framework.app.configuration.ClientConfiguration
    public final String getHostPackageName() {
        String packageName = this.OooO00o.getPackageName();
        AbstractC0809oO0OooOO.OooOOOO(packageName, "getPackageName(...)");
        return packageName;
    }

    @Override // com.app.framework.app.configuration.ClientConfiguration
    public final boolean isEnableDaemonService() {
        try {
            C0215o00o0o0o c0215o00o0o0o = this.OooO0O0;
            c0215o00o0o0o.getClass();
            return ((Boolean) c0215o00o0o0o.OooO0OO.OooOooO(c0215o00o0o0o, C0215o00o0o0o.OooO0o0[2])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.app.framework.app.configuration.ClientConfiguration
    public final boolean isEnableLauncherActivity() {
        return false;
    }

    @Override // com.app.framework.app.configuration.ClientConfiguration
    public final boolean isHideRoot() {
        try {
            C0215o00o0o0o c0215o00o0o0o = this.OooO0O0;
            c0215o00o0o0o.getClass();
            return ((Boolean) c0215o00o0o0o.OooO00o.OooOooO(c0215o00o0o0o, C0215o00o0o0o.OooO0o0[0])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.app.framework.app.configuration.ClientConfiguration
    public final boolean isHideXposed() {
        try {
            C0215o00o0o0o c0215o00o0o0o = this.OooO0O0;
            c0215o00o0o0o.getClass();
            return ((Boolean) c0215o00o0o0o.OooO0O0.OooOooO(c0215o00o0o0o, C0215o00o0o0o.OooO0o0[1])).booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    @Override // com.app.framework.app.configuration.ClientConfiguration
    public final boolean requestInstallPackage(File file, int i) {
        return false;
    }
}


