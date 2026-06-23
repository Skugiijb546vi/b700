package com.app.framework.core.system;

import com.app.framework.core.system.JarConfig;
/* loaded from: classes.dex */
public class JarManagerTest {
    private static final String TAG = "JarManagerTest";

    public static void testConfiguration() {
        JarConfig.JarDefinition[] requiredJars = JarConfig.getRequiredJars();
        int length = requiredJars.length;
        for (JarConfig.JarDefinition jarDefinition : requiredJars) {
            jarDefinition.getAssetName();
            jarDefinition.getFileName();
            jarDefinition.getMinSize();
            jarDefinition.isRequired();
            jarDefinition.getDescription();
        }
        JarConfig.getOptimalBufferSize();
    }

    private static void testJarFileRetrieval(JarManager jarManager) {
        jarManager.getEmptyJar();
        jarManager.getJunitJar();
        jarManager.getJarFile("empty.jar");
    }

    public static void testJarManager() {
        try {
            JarManager jarManager = JarManager.getInstance();
            jarManager.initializeAsync();
            Thread.sleep(2000L);
            if (!jarManager.isReady()) {
                jarManager.initializeSync();
            }
            testJarFileRetrieval(jarManager);
            jarManager.getCacheStats();
            jarManager.getJarInfo("empty.jar");
            jarManager.getJarInfo("junit.jar");
        } catch (Exception unused) {
        }
    }
}
