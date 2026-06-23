package com.app.framework.core.system.location;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.util.AtomicFile;
import android.util.SparseArray;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.env.BEnvironment;
import com.app.framework.core.system.ISystemService;
import com.app.framework.core.system.location.IBLocationManagerService;
import com.app.framework.entity.location.BCell;
import com.app.framework.entity.location.BLocation;
import com.app.framework.entity.location.BLocationConfig;
import com.app.framework.utils.CloseUtils;
import com.app.framework.utils.FileUtils;
import com.ninja.engine.C0217o00o0oO0;
import com.ninja.engine.InterfaceC0252o00oo00O;
import com.ninja.engine.InterfaceC0521o0o00oo;
import com.ninja.engine.RunnableC0090o000OoOO;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
/* loaded from: classes.dex */
public class BLocationManagerService extends IBLocationManagerService.Stub implements ISystemService {
    public static final String TAG = "BLocationManagerService";
    private static final BLocationManagerService sService = new BLocationManagerService();
    private final SparseArray<HashMap<String, BLocationConfig>> mLocationConfigs = new SparseArray<>();
    private final BLocationConfig mGlobalConfig = new BLocationConfig();
    private final Map<IBinder, LocationRecord> mLocationListeners = new HashMap();
    private final Executor mThreadPool = Executors.newCachedThreadPool();

    private void addTask(IBinder iBinder) {
        this.mThreadPool.execute(new RunnableC0090o000OoOO(this, 4, iBinder));
    }

    public static BLocationManagerService get() {
        return sService;
    }

    private BLocationConfig getOrCreateConfig(int i, String str) {
        BLocationConfig bLocationConfig;
        synchronized (this.mLocationConfigs) {
            try {
                HashMap<String, BLocationConfig> hashMap = this.mLocationConfigs.get(i);
                if (hashMap == null) {
                    hashMap = new HashMap<>();
                    this.mLocationConfigs.put(i, hashMap);
                }
                bLocationConfig = hashMap.get(str);
                if (bLocationConfig == null) {
                    bLocationConfig = new BLocationConfig();
                    bLocationConfig.pattern = 0;
                    hashMap.put(str, bLocationConfig);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        return bLocationConfig;
    }

    public static void lambda$addTask$0(IInterface iInterface, BLocation bLocation) {
        ((InterfaceC0252o00oo00O) C0217o00o0oO0.create(InterfaceC0252o00oo00O.class, iInterface, false)).onLocationChanged(bLocation.convert2SystemLocation());
    }

    public void lambda$addTask$1(IBinder iBinder) {
        BLocation location;
        long currentTimeMillis = System.currentTimeMillis();
        BLocation bLocation = null;
        while (iBinder.pingBinder()) {
            IInterface asInterface = ((InterfaceC0521o0o00oo) C0217o00o0oO0.create(InterfaceC0521o0o00oo.class, null, false)).asInterface(iBinder);
            LocationRecord locationRecord = this.mLocationListeners.get(iBinder);
            if (locationRecord != null && (location = getLocation(locationRecord.userId, locationRecord.packageName)) != null) {
                if (!location.equals(bLocation) || System.currentTimeMillis() - currentTimeMillis >= 3000) {
                    currentTimeMillis = System.currentTimeMillis();
                    BlackBoxCore.get().getHandler().post(new RunnableC0090o000OoOO(asInterface, 3, location));
                    bLocation = location;
                } else {
                    try {
                        Thread.sleep(1000L);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public List<BCell> getAllCell(int i, String str) {
        BLocationConfig orCreateConfig = getOrCreateConfig(i, str);
        int i2 = orCreateConfig.pattern;
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            return orCreateConfig.allCell;
        }
        return this.mGlobalConfig.allCell;
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public BCell getCell(int i, String str) {
        BLocationConfig orCreateConfig = getOrCreateConfig(i, str);
        int i2 = orCreateConfig.pattern;
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            return orCreateConfig.cell;
        }
        return this.mGlobalConfig.cell;
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public BLocation getGlobalLocation() {
        BLocation bLocation;
        synchronized (this.mGlobalConfig) {
            bLocation = this.mGlobalConfig.location;
        }
        return bLocation;
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public List<BCell> getGlobalNeighboringCell() {
        List<BCell> list;
        synchronized (this.mGlobalConfig) {
            list = this.mGlobalConfig.neighboringCellInfo;
        }
        return list;
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public BLocation getLocation(int i, String str) {
        BLocationConfig orCreateConfig = getOrCreateConfig(i, str);
        int i2 = orCreateConfig.pattern;
        if (i2 != 1) {
            if (i2 != 2) {
                return null;
            }
            return orCreateConfig.location;
        }
        return this.mGlobalConfig.location;
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public List<BCell> getNeighboringCell(int i, String str) {
        List<BCell> list;
        synchronized (this.mLocationConfigs) {
            list = getOrCreateConfig(i, str).allCell;
        }
        return list;
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public int getPattern(int i, String str) {
        int i2;
        synchronized (this.mLocationConfigs) {
            i2 = getOrCreateConfig(i, str).pattern;
        }
        return i2;
    }

    public void loadConfig() {
        Throwable th;
        FileInputStream fileInputStream;
        Exception e;
        Parcel obtain = Parcel.obtain();
        try {
            try {
                if (!BEnvironment.getFakeLocationConf().exists()) {
                    obtain.recycle();
                    CloseUtils.close(null);
                    return;
                }
                fileInputStream = new FileInputStream(BEnvironment.getFakeLocationConf());
                try {
                    byte[] byteArray = FileUtils.toByteArray(fileInputStream);
                    obtain.unmarshall(byteArray, 0, byteArray.length);
                    obtain.setDataPosition(0);
                    synchronized (this.mGlobalConfig) {
                        this.mGlobalConfig.refresh(obtain);
                    }
                    synchronized (this.mLocationConfigs) {
                        try {
                            this.mLocationConfigs.clear();
                            int readInt = obtain.readInt();
                            for (int i = 0; i < readInt; i++) {
                                int readInt2 = obtain.readInt();
                                HashMap<String, BLocationConfig> readHashMap = obtain.readHashMap(BLocationConfig.class.getClassLoader());
                                this.mLocationConfigs.put(readInt2, readHashMap);
                                Objects.toString(readHashMap);
                            }
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                    obtain.recycle();
                    CloseUtils.close(fileInputStream);
                } catch (Exception e2) {
                    e = e2;
                    e.printStackTrace();
                    FileUtils.deleteDir(BEnvironment.getFakeLocationConf());
                    obtain.recycle();
                    CloseUtils.close(fileInputStream);
                }
            } catch (Throwable th3) {
                th = th3;
                obtain.recycle();
                CloseUtils.close(null);
                throw th;
            }
        } catch (Exception e3) {
            fileInputStream = null;
            e = e3;
        } catch (Throwable th4) {
            th = th4;
            obtain.recycle();
            CloseUtils.close(null);
            throw th;
        }
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public void removeUpdates(IBinder iBinder) {
        if (iBinder == null || !iBinder.pingBinder()) {
            return;
        }
        this.mLocationListeners.remove(iBinder);
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public void requestLocationUpdates(final IBinder iBinder, String str, int i) {
        if (iBinder == null || !iBinder.pingBinder() || this.mLocationListeners.containsKey(iBinder)) {
            return;
        }
        iBinder.linkToDeath(new IBinder.DeathRecipient() { // from class: com.app.framework.core.system.location.BLocationManagerService.1
            {
                BLocationManagerService.this = this;
            }

            @Override // android.os.IBinder.DeathRecipient
            public void binderDied() {
                iBinder.unlinkToDeath(this, 0);
                BLocationManagerService.this.mLocationListeners.remove(iBinder);
            }
        }, 0);
        this.mLocationListeners.put(iBinder, new LocationRecord(str, i));
        addTask(iBinder);
    }

    public void save() {
        synchronized (this.mGlobalConfig) {
            synchronized (this.mLocationConfigs) {
                Parcel obtain = Parcel.obtain();
                AtomicFile atomicFile = new AtomicFile(BEnvironment.getFakeLocationConf());
                FileOutputStream fileOutputStream = null;
                try {
                    this.mGlobalConfig.writeToParcel(obtain, 0);
                    obtain.writeInt(this.mLocationConfigs.size());
                    for (int i = 0; i < this.mLocationConfigs.size(); i++) {
                        obtain.writeInt(this.mLocationConfigs.keyAt(i));
                        obtain.writeMap(this.mLocationConfigs.valueAt(i));
                    }
                    obtain.setDataPosition(0);
                    fileOutputStream = atomicFile.startWrite();
                    FileUtils.writeParcelToOutput(obtain, fileOutputStream);
                    atomicFile.finishWrite(fileOutputStream);
                    obtain.recycle();
                    CloseUtils.close(fileOutputStream);
                } catch (Throwable th) {
                    try {
                        th.printStackTrace();
                        atomicFile.failWrite(fileOutputStream);
                        obtain.recycle();
                        CloseUtils.close(fileOutputStream);
                    } catch (Throwable th2) {
                        obtain.recycle();
                        CloseUtils.close(fileOutputStream);
                        throw th2;
                    }
                }
            }
        }
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public void setAllCell(int i, String str, List<BCell> list) {
        synchronized (this.mLocationConfigs) {
            getOrCreateConfig(i, str).allCell = list;
            save();
        }
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public void setCell(int i, String str, BCell bCell) {
        synchronized (this.mLocationConfigs) {
            getOrCreateConfig(i, str).cell = bCell;
            save();
        }
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public void setGlobalAllCell(List<BCell> list) {
        synchronized (this.mGlobalConfig) {
            this.mGlobalConfig.allCell = list;
            save();
        }
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public void setGlobalCell(BCell bCell) {
        synchronized (this.mGlobalConfig) {
            this.mGlobalConfig.cell = bCell;
            save();
        }
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public void setGlobalLocation(BLocation bLocation) {
        synchronized (this.mGlobalConfig) {
            this.mGlobalConfig.location = bLocation;
            save();
        }
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public void setGlobalNeighboringCell(List<BCell> list) {
        synchronized (this.mGlobalConfig) {
            this.mGlobalConfig.neighboringCellInfo = list;
            save();
        }
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public void setLocation(int i, String str, BLocation bLocation) {
        synchronized (this.mLocationConfigs) {
            getOrCreateConfig(i, str).location = bLocation;
            save();
        }
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public void setNeighboringCell(int i, String str, List<BCell> list) {
        synchronized (this.mLocationConfigs) {
            getOrCreateConfig(i, str).allCell = list;
            save();
        }
    }

    @Override // com.app.framework.core.system.location.IBLocationManagerService
    public void setPattern(int i, String str, int i2) {
        synchronized (this.mLocationConfigs) {
            getOrCreateConfig(i, str).pattern = i2;
            save();
        }
    }

    @Override // com.app.framework.core.system.ISystemService
    public void systemReady() {
        loadConfig();
        for (IBinder iBinder : this.mLocationListeners.keySet()) {
            addTask(iBinder);
        }
    }
}
