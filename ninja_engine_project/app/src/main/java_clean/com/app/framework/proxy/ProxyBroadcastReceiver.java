package com.app.framework.proxy;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.os.RemoteException;
import com.app.framework.BlackBoxCore;
import com.app.framework.entity.am.PendingResultData;
import com.app.framework.proxy.record.ProxyBroadcastRecord;
/* loaded from: classes.dex */
public class ProxyBroadcastReceiver extends BroadcastReceiver {
    public static final String TAG = "ProxyBroadcastReceiver";

    @Override // android.content.BroadcastReceiver
    public void onReceive(Context context, Intent intent) {
        intent.setExtrasClassLoader(context.getClassLoader());
        ProxyBroadcastRecord create = ProxyBroadcastRecord.create(intent);
        if (create.mIntent == null) {
            return;
        }
        BroadcastReceiver.PendingResult goAsync = goAsync();
        try {
            BlackBoxCore.getBActivityManager().scheduleBroadcastReceiver(create.mIntent, new PendingResultData(goAsync), create.mUserId);
        } catch (RemoteException unused) {
            goAsync.finish();
        }
    }
}


