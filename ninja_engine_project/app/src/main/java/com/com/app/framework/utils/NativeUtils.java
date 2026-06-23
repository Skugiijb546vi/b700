package com.app.framework.utils;

import android.os.Build;
import com.app.framework.core.system.JarConfig;
import com.ninja.engine.AbstractC1230oOoOo0o;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Enumeration;
import java.util.zip.ZipEntry;
import java.util.zip.ZipFile;
/* loaded from: classes.dex */
public class NativeUtils {
    public static final String TAG = "VirtualM";

    public static void copyNativeLib(File file, File file2) {
        System.currentTimeMillis();
        if (!file2.exists()) {
            file2.mkdirs();
        }
        try {
            ZipFile zipFile = new ZipFile(file.getAbsolutePath());
            if (findAndCopyNativeLib(zipFile, Build.CPU_ABI, file2)) {
                zipFile.close();
                return;
            }
            findAndCopyNativeLib(zipFile, "armeabi", file2);
            zipFile.close();
        } finally {
            System.currentTimeMillis();
        }
    }

    private static void copySo(byte[] bArr, InputStream inputStream, OutputStream outputStream) {
        BufferedInputStream bufferedInputStream = new BufferedInputStream(inputStream);
        BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(outputStream);
        while (true) {
            int read = bufferedInputStream.read(bArr);
            if (read <= 0) {
                bufferedOutputStream.flush();
                bufferedOutputStream.close();
                outputStream.close();
                bufferedInputStream.close();
                inputStream.close();
                return;
            }
            bufferedOutputStream.write(bArr, 0, read);
        }
    }

    private static boolean findAndCopyNativeLib(ZipFile zipFile, String str, File file) {
        String OooO0oo = AbstractC1230oOoOo0o.OooO0oo("lib/", str, "/");
        Enumeration<? extends ZipEntry> entries = zipFile.entries();
        boolean z = false;
        byte[] bArr = null;
        boolean z2 = false;
        while (entries.hasMoreElements()) {
            ZipEntry nextElement = entries.nextElement();
            String name = nextElement.getName();
            if (z || name.startsWith("lib/")) {
                if (name.endsWith(".so") && name.startsWith(OooO0oo)) {
                    if (bArr == null) {
                        bArr = new byte[JarConfig.DEFAULT_BUFFER_SIZE];
                        z2 = true;
                    }
                    File file2 = new File(file, name.substring(name.lastIndexOf(47) + 1));
                    if (!file2.exists() || file2.length() != nextElement.getSize()) {
                        FileOutputStream fileOutputStream = new FileOutputStream(file2);
                        nextElement.getName();
                        copySo(bArr, zipFile.getInputStream(nextElement), fileOutputStream);
                    }
                }
                z = true;
            }
        }
        if (!z) {
            return true;
        }
        return z2;
    }
}
