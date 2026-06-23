package com.ninja.engine;

import com.app.framework.fake.frameworks.BUserManager;
/* renamed from: com.ninja.engine.Ooooooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0057Ooooooo implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ int OooO0O0;

    public /* synthetic */ RunnableC0057Ooooooo(int i, int i2) {
        this.OooO00o = i2;
        this.OooO0O0 = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (this.OooO00o) {
            case 0:
                try {
                    BUserManager.get().createUser(this.OooO0O0);
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                try {
                    BUserManager.get().deleteUser(this.OooO0O0);
                    return;
                } catch (Exception unused2) {
                    return;
                }
        }
    }
}
