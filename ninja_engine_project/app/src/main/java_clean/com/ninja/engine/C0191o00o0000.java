package com.ninja.engine;

import android.os.Handler;
import android.os.Message;
/* renamed from: com.ninja.engine.o00o0000  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0191o00o0000 implements Handler.Callback {
    public final /* synthetic */ int OooO00o;

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.OooO00o) {
            case 0:
                int i = message.what;
                if (i != 0) {
                    if (i != 1) {
                        return false;
                    }
                    AbstractC1230oOoOo0o.OooOO0O(message.obj);
                    throw null;
                }
                AbstractC1230oOoOo0o.OooOO0O(message.obj);
                throw null;
            default:
                if (message.what == 1) {
                    ((InterfaceC1108oOOoo) message.obj).OooO0Oo();
                    return true;
                }
                return false;
        }
    }
}


