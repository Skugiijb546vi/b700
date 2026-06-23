package com.app.framework.core.system.pm;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.AtomicFile;
import com.app.framework.core.env.BEnvironment;
import com.app.framework.utils.FileUtils;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class SharedUserSetting implements Parcelable {
    public static final String TAG = "SharedUserSetting";
    String name;
    int seInfoTargetSdkVersion;
    int userId;
    public static final Map<String, SharedUserSetting> sSharedUsers = new HashMap();
    public static final Parcelable.Creator<SharedUserSetting> CREATOR = new Parcelable.Creator<SharedUserSetting>() { // from class: com.app.framework.core.system.pm.SharedUserSetting.1
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SharedUserSetting createFromParcel(Parcel parcel) {
            SharedUserSetting sharedUserSetting = new SharedUserSetting();
            sharedUserSetting.readFromParcel(parcel);
            return sharedUserSetting;
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        public SharedUserSetting[] newArray(int i) {
            return new SharedUserSetting[i];
        }
    };

    public SharedUserSetting() {
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x005c A[Catch: all -> 0x0064, TRY_ENTER, TryCatch #4 {all -> 0x002c, blocks: (B:3:0x0004, B:5:0x000e, B:8:0x0012, B:10:0x0017, B:11:0x0020, B:18:0x002b, B:21:0x002e, B:22:0x0042, B:28:0x004d, B:31:0x0052, B:32:0x0059, B:33:0x005b, B:34:0x005c, B:35:0x005f), top: B:48:0x0004 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static void loadSharedUsers() {
        /*
            android.os.Parcel r0 = android.os.Parcel.obtain()
            java.io.File r1 = com.app.framework.core.env.BEnvironment.getSharedUserConf()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            byte[] r1 = com.app.framework.utils.FileUtils.toByteArray(r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            if (r1 == 0) goto L4e
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            if (r2 != 0) goto L12
            goto L4e
        L12:
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            r3 = 100
            if (r2 >= r3) goto L2e
            java.io.File r1 = com.app.framework.core.env.BEnvironment.getSharedUserConf()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            r1.delete()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            java.util.Map<java.lang.String, com.app.framework.core.system.pm.SharedUserSetting> r1 = com.app.framework.core.system.pm.SharedUserSetting.sSharedUsers     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            r1.clear()     // Catch: java.lang.Throwable -> L29
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            r0.recycle()
            return
        L29:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L29
            throw r2     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
        L2c:
            r1 = move-exception
            goto L67
        L2e:
            int r2 = r1.length     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            r3 = 0
            r0.unmarshall(r1, r3, r2)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            r0.setDataPosition(r3)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            java.lang.Class<com.app.framework.core.system.pm.SharedUserSetting> r1 = com.app.framework.core.system.pm.SharedUserSetting.class
            java.lang.ClassLoader r1 = r1.getClassLoader()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            java.util.HashMap r1 = r0.readHashMap(r1)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            java.util.Map<java.lang.String, com.app.framework.core.system.pm.SharedUserSetting> r2 = com.app.framework.core.system.pm.SharedUserSetting.sSharedUsers     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            monitor-enter(r2)     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
            r2.clear()     // Catch: java.lang.Throwable -> L4b
            r2.putAll(r1)     // Catch: java.lang.Throwable -> L4b
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            goto L60
        L4b:
            r1 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L4b
            throw r1     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L52
        L4e:
            r0.recycle()
            return
        L52:
            java.io.File r1 = com.app.framework.core.env.BEnvironment.getSharedUserConf()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L59
            r1.delete()     // Catch: java.lang.Throwable -> L2c java.lang.Exception -> L59
        L59:
            java.util.Map<java.lang.String, com.app.framework.core.system.pm.SharedUserSetting> r1 = com.app.framework.core.system.pm.SharedUserSetting.sSharedUsers     // Catch: java.lang.Throwable -> L2c
            monitor-enter(r1)     // Catch: java.lang.Throwable -> L2c
            r1.clear()     // Catch: java.lang.Throwable -> L64
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
        L60:
            r0.recycle()
            return
        L64:
            r2 = move-exception
            monitor-exit(r1)     // Catch: java.lang.Throwable -> L64
            throw r2     // Catch: java.lang.Throwable -> L2c
        L67:
            r0.recycle()
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.core.system.pm.SharedUserSetting.loadSharedUsers():void");
    }

    public static void saveSharedUsers() {
        Parcel obtain = Parcel.obtain();
        AtomicFile atomicFile = new AtomicFile(BEnvironment.getSharedUserConf());
        FileOutputStream fileOutputStream = null;
        try {
            try {
                obtain.writeMap(sSharedUsers);
                fileOutputStream = atomicFile.startWrite();
                FileUtils.writeParcelToOutput(obtain, fileOutputStream);
                atomicFile.finishWrite(fileOutputStream);
            } catch (Exception e) {
                e.printStackTrace();
                atomicFile.failWrite(fileOutputStream);
            }
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public void readFromParcel(Parcel parcel) {
        this.name = parcel.readString();
        this.userId = parcel.readInt();
        this.seInfoTargetSdkVersion = parcel.readInt();
    }

    public String toString() {
        return "SharedUserSetting{" + Integer.toHexString(System.identityHashCode(this)) + " " + this.name + "/" + this.userId + "}";
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(this.name);
        parcel.writeInt(this.userId);
        parcel.writeInt(this.seInfoTargetSdkVersion);
    }

    public SharedUserSetting(String str) {
        this.name = str;
    }
}


