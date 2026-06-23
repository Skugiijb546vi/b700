package com.app.framework.core.system;

import android.content.Context;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.env.BEnvironment;
import com.app.framework.core.system.JarConfig;
import com.app.framework.utils.JarUtils;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.RunnableC0061o00000oO;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicBoolean;
/* loaded from: classes.dex */
public class JarManager {
    private static final long MAX_RETRY_DELAY = 5000;
    private static final String TAG = "JarManager";
    private static volatile JarManager sInstance;
    private static final JarConfig.JarDefinition[] REQUIRED_JARS = JarConfig.getRequiredJars();
    private static final int BUFFER_SIZE = JarUtils.getOptimalBufferSize();
    private final ConcurrentHashMap<String, File> mJarCache = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, String> mJarHashes = new ConcurrentHashMap<>();
    private final ConcurrentHashMap<String, JarConfig.JarDefinition> mJarDefinitions = new ConcurrentHashMap<>();
    private final AtomicBoolean mIsInitialized = new AtomicBoolean(false);
    private final AtomicBoolean mIsInitializing = new AtomicBoolean(false);

    private JarManager() {
    }

    private void copyJarFromAssets(Context context, JarConfig.JarDefinition jarDefinition, File file) {
        String assetName = jarDefinition.getAssetName();
        InputStream inputStream = null;
        try {
            InputStream open = context.getAssets().open(assetName);
            if (open == null) {
                throw new IOException("Asset not found: " + assetName);
            }
            File parentFile = file.getParentFile();
            if (!parentFile.exists() && !parentFile.mkdirs()) {
                throw new IOException("Failed to create target directory: " + parentFile);
            }
            JarUtils.copyFileWithProgress(open, file, assetName);
            try {
                open.close();
            } catch (IOException unused) {
            }
        } catch (Throwable th) {
            if (0 != 0) {
                try {
                    inputStream.close();
                } catch (IOException unused2) {
                }
            }
            throw th;
        }
    }

    public static JarManager getInstance() {
        if (sInstance == null) {
            synchronized (JarManager.class) {
                try {
                    if (sInstance == null) {
                        sInstance = new JarManager();
                    }
                } finally {
                }
            }
        }
        return sInstance;
    }

    private File getTargetFile(JarConfig.JarDefinition jarDefinition) {
        return new File(BEnvironment.getCacheDir(), jarDefinition.getFileName());
    }

    private void initializeJarEnvironment() {
        JarConfig.JarDefinition[] jarDefinitionArr;
        Context context = BlackBoxCore.getContext();
        if (context == null) {
            throw new IllegalStateException("BlackBoxCore context is null");
        }
        for (JarConfig.JarDefinition jarDefinition : REQUIRED_JARS) {
            try {
                processJarFile(context, jarDefinition);
            } catch (Exception unused) {
                jarDefinition.getAssetName();
            }
        }
        verifyJarEnvironment();
    }

    private boolean isFileValid(File file, JarConfig.JarDefinition jarDefinition) {
        if (!file.exists()) {
            file.toString();
            return false;
        } else if (file.length() == 0) {
            file.toString();
            return false;
        } else if (!JarConfig.validateFile(file, jarDefinition)) {
            jarDefinition.getAssetName();
            file.length();
            jarDefinition.getMinSize();
            return false;
        } else {
            String calculateFileHash = JarUtils.calculateFileHash(file);
            if (calculateFileHash != null) {
                this.mJarHashes.put(jarDefinition.getAssetName(), calculateFileHash);
                return true;
            }
            return true;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ void lambda$initializeAsync$0() {
        try {
            initializeJarEnvironment();
            this.mIsInitialized.set(true);
        } catch (Exception unused) {
        } catch (Throwable th) {
            this.mIsInitializing.set(false);
            throw th;
        }
        this.mIsInitializing.set(false);
    }

    private void processJarFile(Context context, JarConfig.JarDefinition jarDefinition) {
        String assetName = jarDefinition.getAssetName();
        jarDefinition.getDescription();
        this.mJarDefinitions.put(assetName, jarDefinition);
        File targetFile = getTargetFile(jarDefinition);
        if (targetFile != null) {
            if (!targetFile.exists() || !isFileValid(targetFile, jarDefinition)) {
                copyJarFromAssets(context, jarDefinition, targetFile);
                if (!isFileValid(targetFile, jarDefinition)) {
                    throw new IOException(AbstractC1230oOoOo0o.OooOO0o("JAR file verification failed: ", assetName));
                }
            }
            this.mJarCache.put(assetName, targetFile);
            return;
        }
        throw new IOException(AbstractC1230oOoOo0o.OooOO0o("Invalid JAR definition: ", assetName));
    }

    private void verifyJarEnvironment() {
        JarConfig.JarDefinition[] jarDefinitionArr;
        for (JarConfig.JarDefinition jarDefinition : REQUIRED_JARS) {
            File file = this.mJarCache.get(jarDefinition.getAssetName());
            if (file == null || !file.exists()) {
                jarDefinition.isRequired();
            }
        }
    }

    public void clearCache() {
        this.mJarCache.clear();
        this.mJarHashes.clear();
        this.mJarDefinitions.clear();
    }

    public String getCacheStats() {
        return String.format("JAR Cache Stats - Files: %d, Hashes: %d, Definitions: %d, Initialized: %s", Integer.valueOf(this.mJarCache.size()), Integer.valueOf(this.mJarHashes.size()), Integer.valueOf(this.mJarDefinitions.size()), Boolean.valueOf(this.mIsInitialized.get()));
    }

    public File getEmptyJar() {
        return getJarFile("empty.jar");
    }

    public File getJarFile(String str) {
        if (!this.mIsInitialized.get()) {
            initializeSync();
        }
        File file = this.mJarCache.get(str);
        if (file == null || !file.exists()) {
            return null;
        }
        return file;
    }

    public String getJarInfo(String str) {
        String str2;
        File file = this.mJarCache.get(str);
        JarConfig.JarDefinition jarDefinition = this.mJarDefinitions.get(str);
        String str3 = this.mJarHashes.get(str);
        if (file != null && jarDefinition != null) {
            Long valueOf = Long.valueOf(file.length());
            if (str3 != null) {
                str2 = str3.substring(0, Math.min(8, str3.length())) + "...";
            } else {
                str2 = "N/A";
            }
            return String.format("JAR: %s, Size: %d bytes, Hash: %s, Required: %s", str, valueOf, str2, Boolean.valueOf(jarDefinition.isRequired()));
        }
        return AbstractC1230oOoOo0o.OooOO0o("JAR not found: ", str);
    }

    public File getJunitJar() {
        return getJarFile("junit.jar");
    }

    public void initializeAsync() {
        if (this.mIsInitialized.get() || this.mIsInitializing.getAndSet(true)) {
            return;
        }
        new Thread(new RunnableC0061o00000oO(11, this), "JarManager-Init").start();
    }

    public void initializeSync() {
        if (this.mIsInitialized.get()) {
            return;
        }
        try {
            initializeJarEnvironment();
            this.mIsInitialized.set(true);
        } catch (Exception e) {
            throw new RuntimeException("JAR environment initialization failed", e);
        }
    }

    public boolean isReady() {
        return this.mIsInitialized.get();
    }
}
