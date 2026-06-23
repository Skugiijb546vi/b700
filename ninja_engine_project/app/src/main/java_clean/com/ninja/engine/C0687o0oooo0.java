package com.ninja.engine;

import android.os.Handler;
import android.os.Message;
/* renamed from: com.ninja.engine.o0oooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0687o0oooo0 implements Handler.Callback {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ C0687o0oooo0(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        switch (this.OooO00o) {
            case 0:
                int i = message.what;
                C0689o0oooo0O c0689o0oooo0O = (C0689o0oooo0O) this.OooO0O0;
                if (i == 1) {
                    c0689o0oooo0O.OooO0O0((C0685o0oooOoO) message.obj);
                    return true;
                }
                if (i == 2) {
                    c0689o0oooo0O.OooO0Oo.OooOO0o((C0685o0oooOoO) message.obj);
                }
                return false;
            default:
                if (message.what != 0) {
                    return false;
                }
                AbstractC1230oOoOo0o.OooOO0O(message.obj);
                synchronized (((C0044OoooOOO) this.OooO0O0).OooO00o) {
                    throw null;
                }
        }
    }
}


