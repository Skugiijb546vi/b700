package com.ninja.engine;

import android.content.DialogInterface;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import java.lang.ref.WeakReference;
/* renamed from: com.ninja.engine.o0000o0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class HandlerC0070o0000o0O extends Handler {
    public final /* synthetic */ int OooO00o = 0;
    public Object OooO0O0;

    public /* synthetic */ HandlerC0070o0000o0O() {
    }

    @Override // android.os.Handler
    public final void handleMessage(Message message) {
        switch (this.OooO00o) {
            case 0:
                int i = message.what;
                if (i != -3 && i != -2 && i != -1) {
                    if (i == 1) {
                        ((DialogInterface) message.obj).dismiss();
                        return;
                    }
                    return;
                }
                ((DialogInterface.OnClickListener) message.obj).onClick((DialogInterface) ((WeakReference) this.OooO0O0).get(), message.what);
                return;
            default:
                if (message.what != 1) {
                    super.handleMessage(message);
                    return;
                }
                InterfaceC0971oOOO000 interfaceC0971oOOO000 = (InterfaceC0971oOOO000) this.OooO0O0;
                if (interfaceC0971oOOO000 != null) {
                    interfaceC0971oOOO000.OooO00o((C1006oOOOOoOO) message.obj);
                    return;
                }
                return;
        }
    }

    public HandlerC0070o0000o0O(InterfaceC0971oOOO000 interfaceC0971oOOO000) {
        super(Looper.getMainLooper());
        this.OooO0O0 = interfaceC0971oOOO000;
    }
}
