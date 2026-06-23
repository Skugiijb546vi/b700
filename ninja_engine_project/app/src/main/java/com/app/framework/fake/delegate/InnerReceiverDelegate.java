package com.app.framework.fake.delegate;

import android.content.IIntentReceiver;
import android.content.Intent;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import com.app.framework.BlackBoxCore;
import com.app.framework.proxy.record.ProxyBroadcastRecord;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC1875ooOoOO;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public class InnerReceiverDelegate extends IIntentReceiver.Stub {
    public static final String TAG = "InnerReceiverDelegate";
    private static final Map<IBinder, InnerReceiverDelegate> sInnerReceiverDelegate = new HashMap();
    private final WeakReference<IIntentReceiver> mIntentReceiver;

    private InnerReceiverDelegate(IIntentReceiver iIntentReceiver) {
        this.mIntentReceiver = new WeakReference<>(iIntentReceiver);
    }

    public static IIntentReceiver createProxy(IIntentReceiver iIntentReceiver) {
        if (iIntentReceiver instanceof InnerReceiverDelegate) {
            return iIntentReceiver;
        }
        final IBinder asBinder = iIntentReceiver.asBinder();
        InnerReceiverDelegate innerReceiverDelegate = sInnerReceiverDelegate.get(asBinder);
        if (innerReceiverDelegate == null) {
            try {
                asBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.app.framework.fake.delegate.InnerReceiverDelegate.1
                    @Override // android.os.IBinder.DeathRecipient
                    public void binderDied() {
                        InnerReceiverDelegate.sInnerReceiverDelegate.remove(asBinder);
                        asBinder.unlinkToDeath(this, 0);
                    }
                }, 0);
            } catch (RemoteException e) {
                e.printStackTrace();
            }
            InnerReceiverDelegate innerReceiverDelegate2 = new InnerReceiverDelegate(iIntentReceiver);
            sInnerReceiverDelegate.put(asBinder, innerReceiverDelegate2);
            return innerReceiverDelegate2;
        }
        return innerReceiverDelegate;
    }

    public static InnerReceiverDelegate getDelegate(IBinder iBinder) {
        return sInnerReceiverDelegate.get(iBinder);
    }

    @Override // android.content.IIntentReceiver
    public void performReceive(Intent intent, int i, String str, Bundle bundle, boolean z, boolean z2, int i2) {
        intent.setExtrasClassLoader(BlackBoxCore.getApplication().getClassLoader());
        ProxyBroadcastRecord create = ProxyBroadcastRecord.create(intent);
        Intent intent2 = create.mIntent;
        if (intent2 != null) {
            intent2.setExtrasClassLoader(BlackBoxCore.getApplication().getClassLoader());
            intent = create.mIntent;
        }
        Intent intent3 = intent;
        IIntentReceiver iIntentReceiver = this.mIntentReceiver.get();
        if (iIntentReceiver != null) {
            ((InterfaceC1875ooOoOO) C0217o00o0oO0.create(InterfaceC1875ooOoOO.class, iIntentReceiver, false)).performReceive(intent3, i, str, bundle, z, z2, i2);
        }
    }
}
