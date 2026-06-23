package com.app.framework.core.system.notification;

import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.NotificationManager;
import android.os.Binder;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.system.BProcessManagerService;
import com.app.framework.core.system.ISystemService;
import com.app.framework.core.system.ProcessRecord;
import com.app.framework.core.system.notification.IBNotificationManagerService;
import com.app.framework.utils.compat.BuildCompat;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0775oO0OOOoO;
import com.ninja.engine.InterfaceC0790oO0Oo00O;
import com.ninja.engine.InterfaceC1631oo0ooOo0;
import com.ninja.engine.Oooo0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public class BNotificationManagerService extends IBNotificationManagerService.Stub implements ISystemService {
    public static final String CHANNEL_BLACK = "@black-";
    public static final String GROUP_BLACK = "@black-group-";
    private static final BNotificationManagerService sService = new BNotificationManagerService();
    private NotificationChannelManager mNotificationChannelManager;
    private final Map<String, NotificationRecord> mNotificationRecords = new HashMap();
    private final NotificationManager mRealNotificationManager = (NotificationManager) BlackBoxCore.getContext().getSystemService("notification");

    public static BNotificationManagerService get() {
        return sService;
    }

    private String getBlackChannelId(String str, int i) {
        if (str == null || str.contains(CHANNEL_BLACK)) {
            return str;
        }
        return str + CHANNEL_BLACK + i;
    }

    private String getBlackGroupId(String str, int i) {
        if (str == null || str.contains(GROUP_BLACK)) {
            return str;
        }
        return str + GROUP_BLACK + i;
    }

    public static int getNotificationId(int i, int i2, String str) {
        return (str + i + i2).hashCode();
    }

    private NotificationRecord getNotificationRecord(String str, int i) {
        NotificationRecord notificationRecord;
        String str2 = str + "-" + i;
        synchronized (this.mNotificationRecords) {
            try {
                notificationRecord = this.mNotificationRecords.get(str2);
                if (notificationRecord == null) {
                    notificationRecord = new NotificationRecord();
                    this.mNotificationRecords.put(str2, notificationRecord);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return notificationRecord;
    }

    private String getRealChannelId(String str) {
        return (str == null || !str.contains(CHANNEL_BLACK)) ? str : str.split(CHANNEL_BLACK)[0];
    }

    private String getRealGroupId(String str) {
        return (str == null || !str.contains(GROUP_BLACK)) ? str : str.split(GROUP_BLACK)[0];
    }

    @TargetApi(26)
    private void handleNotificationChannel(NotificationChannel notificationChannel, int i) {
        String group;
        InterfaceC0775oO0OOOoO interfaceC0775oO0OOOoO = (InterfaceC0775oO0OOOoO) C0217o00o0oO0.create(InterfaceC0775oO0OOOoO.class, notificationChannel, false);
        interfaceC0775oO0OOOoO._set_mId(getBlackChannelId(interfaceC0775oO0OOOoO.mId(), i));
        group = notificationChannel.getGroup();
        notificationChannel.setGroup(getBlackGroupId(group, i));
    }

    private void handleNotificationGroup(NotificationChannelGroup notificationChannelGroup, int i) {
        InterfaceC0790oO0Oo00O interfaceC0790oO0Oo00O = (InterfaceC0790oO0Oo00O) C0217o00o0oO0.create(InterfaceC0790oO0Oo00O.class, notificationChannelGroup, false);
        interfaceC0790oO0Oo00O._set_mId(getBlackGroupId(interfaceC0790oO0Oo00O.mId(), i));
        List<NotificationChannel> mChannels = interfaceC0790oO0Oo00O.mChannels();
        if (mChannels != null) {
            for (NotificationChannel notificationChannel : mChannels) {
                createNotificationChannel(Oooo0.OooO0O0(notificationChannel), i);
            }
        }
    }

    private void removeNotificationRecord(String str, int i) {
        String str2 = str + "-" + i;
        synchronized (this.mNotificationRecords) {
            this.mNotificationRecords.remove(str2);
        }
    }

    private void resetNotificationChannel(NotificationChannel notificationChannel) {
        InterfaceC0775oO0OOOoO interfaceC0775oO0OOOoO = (InterfaceC0775oO0OOOoO) C0217o00o0oO0.create(InterfaceC0775oO0OOOoO.class, notificationChannel, false);
        interfaceC0775oO0OOOoO._set_mId(getRealChannelId(interfaceC0775oO0OOOoO.mId()));
    }

    private void resetNotificationGroup(NotificationChannelGroup notificationChannelGroup) {
        InterfaceC0790oO0Oo00O interfaceC0790oO0Oo00O = (InterfaceC0790oO0Oo00O) C0217o00o0oO0.create(InterfaceC0790oO0Oo00O.class, notificationChannelGroup, false);
        interfaceC0790oO0Oo00O._set_mId(getRealGroupId(interfaceC0790oO0Oo00O.mId()));
        List<NotificationChannel> mChannels = interfaceC0790oO0Oo00O.mChannels();
        if (mChannels != null) {
            for (NotificationChannel notificationChannel : mChannels) {
                resetNotificationChannel(Oooo0.OooO0O0(notificationChannel));
            }
        }
    }

    @Override // com.app.framework.core.system.notification.IBNotificationManagerService
    public void cancelNotificationWithTag(int i, String str, int i2) {
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        int notificationId = getNotificationId(i2, i, findProcessByPid.getPackageName());
        this.mRealNotificationManager.cancel(notificationId);
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i2);
        synchronized (notificationRecord.mIds) {
            notificationRecord.mIds.remove(Integer.valueOf(notificationId));
        }
    }

    @Override // com.app.framework.core.system.notification.IBNotificationManagerService
    @TargetApi(26)
    public void createNotificationChannel(NotificationChannel notificationChannel, int i) {
        String id;
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        handleNotificationChannel(notificationChannel, i);
        this.mRealNotificationManager.createNotificationChannel(notificationChannel);
        resetNotificationChannel(notificationChannel);
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i);
        synchronized (notificationRecord.mNotificationChannels) {
            Map<String, NotificationChannel> map = notificationRecord.mNotificationChannels;
            id = notificationChannel.getId();
            map.put(id, notificationChannel);
        }
    }

    @Override // com.app.framework.core.system.notification.IBNotificationManagerService
    @TargetApi(26)
    public void createNotificationChannelGroup(NotificationChannelGroup notificationChannelGroup, int i) {
        String id;
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        handleNotificationGroup(notificationChannelGroup, i);
        this.mRealNotificationManager.createNotificationChannelGroup(notificationChannelGroup);
        resetNotificationGroup(notificationChannelGroup);
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i);
        synchronized (notificationRecord.mNotificationChannelGroups) {
            Map<String, NotificationChannelGroup> map = notificationRecord.mNotificationChannelGroups;
            id = notificationChannelGroup.getId();
            map.put(id, notificationChannelGroup);
        }
    }

    @Override // com.app.framework.core.system.notification.IBNotificationManagerService
    @TargetApi(26)
    public void deleteNotificationChannel(String str, int i) {
        String id;
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i);
        synchronized (notificationRecord.mNotificationChannels) {
            try {
                NotificationChannel OooO0O0 = Oooo0.OooO0O0(notificationRecord.mNotificationChannels.remove(str));
                if (OooO0O0 != null) {
                    id = OooO0O0.getId();
                    this.mRealNotificationManager.deleteNotificationChannel(getBlackChannelId(id, i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // com.app.framework.core.system.notification.IBNotificationManagerService
    @TargetApi(26)
    public void deleteNotificationChannelGroup(String str, int i) {
        String id;
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i);
        synchronized (notificationRecord.mNotificationChannelGroups) {
            try {
                NotificationChannelGroup OooO0Oo = Oooo0.OooO0Oo(notificationRecord.mNotificationChannelGroups.remove(str));
                if (OooO0Oo != null) {
                    id = OooO0Oo.getId();
                    this.mRealNotificationManager.deleteNotificationChannelGroup(getBlackGroupId(id, i));
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @SuppressLint({"NewApi"})
    public void deletePackageNotification(String str, int i) {
        String id;
        String id2;
        NotificationRecord notificationRecord = getNotificationRecord(str, i);
        if (BuildCompat.isOreo()) {
            for (NotificationChannelGroup notificationChannelGroup : notificationRecord.mNotificationChannelGroups.values()) {
                id2 = Oooo0.OooO0Oo(notificationChannelGroup).getId();
                this.mRealNotificationManager.deleteNotificationChannelGroup(getBlackGroupId(id2, i));
            }
            for (NotificationChannel notificationChannel : notificationRecord.mNotificationChannels.values()) {
                id = Oooo0.OooO0O0(notificationChannel).getId();
                this.mRealNotificationManager.deleteNotificationChannel(getBlackChannelId(id, i));
            }
        }
        for (Integer num : notificationRecord.mIds) {
            this.mRealNotificationManager.cancel(num.intValue());
        }
        removeNotificationRecord(str, i);
    }

    @Override // com.app.framework.core.system.notification.IBNotificationManagerService
    public void enqueueNotificationWithTag(int i, String str, Notification notification, int i2) {
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return;
        }
        int notificationId = getNotificationId(i2, i, findProcessByPid.getPackageName());
        if (BuildCompat.isOreo()) {
            InterfaceC1631oo0ooOo0 interfaceC1631oo0ooOo0 = (InterfaceC1631oo0ooOo0) C0217o00o0oO0.create(InterfaceC1631oo0ooOo0.class, notification, false);
            if (interfaceC1631oo0ooOo0._check_mChannelId() != null) {
                interfaceC1631oo0ooOo0._set_mChannelId(getBlackChannelId(interfaceC1631oo0ooOo0.mChannelId(), i2));
            }
            if (interfaceC1631oo0ooOo0._check_mGroupKey() != null) {
                interfaceC1631oo0ooOo0._set_mGroupKey(getBlackGroupId(interfaceC1631oo0ooOo0.mGroupKey(), i2));
            }
        }
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i2);
        synchronized (notificationRecord.mIds) {
            notificationRecord.mIds.add(Integer.valueOf(notificationId));
        }
        this.mRealNotificationManager.notify(notificationId, notification);
    }

    @Override // com.app.framework.core.system.notification.IBNotificationManagerService
    @TargetApi(26)
    public NotificationChannel getNotificationChannel(String str, int i) {
        NotificationChannel OooO0O0;
        ProcessRecord findProcessByPid = BProcessManagerService.get().findProcessByPid(Binder.getCallingPid());
        if (findProcessByPid == null) {
            return null;
        }
        NotificationRecord notificationRecord = getNotificationRecord(findProcessByPid.getPackageName(), i);
        synchronized (notificationRecord.mNotificationChannels) {
            OooO0O0 = Oooo0.OooO0O0(notificationRecord.mNotificationChannels.get(str));
        }
        return OooO0O0;
    }

    @Override // com.app.framework.core.system.notification.IBNotificationManagerService
    public List<NotificationChannelGroup> getNotificationChannelGroups(String str, int i) {
        ArrayList arrayList;
        NotificationRecord notificationRecord = getNotificationRecord(str, i);
        synchronized (notificationRecord.mNotificationChannelGroups) {
            arrayList = new ArrayList(notificationRecord.mNotificationChannelGroups.values());
        }
        return arrayList;
    }

    @Override // com.app.framework.core.system.notification.IBNotificationManagerService
    public List<NotificationChannel> getNotificationChannels(String str, int i) {
        ArrayList arrayList;
        NotificationRecord notificationRecord = getNotificationRecord(str, i);
        synchronized (notificationRecord.mNotificationChannels) {
            arrayList = new ArrayList(notificationRecord.mNotificationChannels.values());
        }
        return arrayList;
    }

    @Override // com.app.framework.core.system.ISystemService
    public void systemReady() {
        this.mNotificationChannelManager = NotificationChannelManager.get();
    }
}


