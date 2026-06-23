package com.app.framework.utils;

import com.app.framework.core.system.JarConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.zip.ZipInputStream;
/* loaded from: classes.dex */
public class JarUtils {
    private static final String TAG = "JarUtils";

    public static String calculateFileHash(File file) {
        int i;
        if (file != null && file.exists()) {
            try {
                MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[JarConfig.DEFAULT_BUFFER_SIZE];
                while (true) {
                    int read = fileInputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    messageDigest.update(bArr, 0, read);
                }
                fileInputStream.close();
                byte[] digest = messageDigest.digest();
                StringBuilder sb = new StringBuilder();
                for (byte b : digest) {
                    String hexString = Integer.toHexString(b & 255);
                    if (hexString.length() == 1) {
                        sb.append('0');
                    }
                    sb.append(hexString);
                }
                return sb.toString();
            } catch (IOException | NoSuchAlgorithmException unused) {
            }
        }
        return null;
    }

    public static void copyFileWithProgress(InputStream inputStream, File file, String str) {
        FileOutputStream fileOutputStream;
        File file2;
        if (inputStream == null) {
            throw new IOException("Input stream is null");
        }
        if (file == null) {
            throw new IOException("Target file is null");
        }
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Failed to create target directory: " + parentFile);
        }
        try {
            try {
                file2 = File.createTempFile(file.getName(), ".tmp", parentFile);
                try {
                    fileOutputStream = new FileOutputStream(file2);
                } catch (IOException e) {
                    e = e;
                }
            } catch (IOException e2) {
                e = e2;
                file2 = null;
            }
        } catch (Throwable th) {
            th = th;
            fileOutputStream = null;
        }
        try {
            byte[] bArr = new byte[JarConfig.DEFAULT_BUFFER_SIZE];
            long j = 0;
            loop0: while (true) {
                long currentTimeMillis = System.currentTimeMillis();
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break loop0;
                    }
                    fileOutputStream.write(bArr, 0, read);
                    j += read;
                    if (j % 102400 != 0 || System.currentTimeMillis() - currentTimeMillis <= 1000) {
                    }
                }
            }
            fileOutputStream.flush();
            fileOutputStream.close();
            if (file2.renameTo(file)) {
                return;
            }
            throw new IOException("Failed to move temporary file to target: " + file);
        } catch (IOException e3) {
            e = e3;
            if (file2 != null && file2.exists() && !file2.delete()) {
                file2.toString();
            }
            throw e;
        } catch (Throwable th2) {
            th = th2;
            if (fileOutputStream != null) {
                try {
                    fileOutputStream.close();
                } catch (IOException unused) {
                }
            }
            throw th;
        }
    }

    public static boolean createDirectory(File file) {
        if (file == null) {
            return false;
        }
        if (file.exists()) {
            return file.isDirectory();
        }
        if (file.mkdirs()) {
            file.setReadable(true, true);
            file.setWritable(true, true);
            return true;
        }
        return false;
    }

    public static String getJarInfo(File file) {
        if (file == null || !file.exists()) {
            return "File not found";
        }
        StringBuilder sb = new StringBuilder("Size: ");
        sb.append(file.length());
        sb.append(" bytes, ");
        sb.append(verifyJarFile(file) ? "Valid JAR" : "Invalid JAR");
        String calculateFileHash = calculateFileHash(file);
        if (calculateFileHash != null) {
            sb.append(", Hash: ");
            sb.append(calculateFileHash.substring(0, Math.min(16, calculateFileHash.length())));
        }
        return sb.toString();
    }

    public static int getOptimalBufferSize() {
        long maxMemory = Runtime.getRuntime().maxMemory();
        if (maxMemory > 536870912) {
            return JarConfig.MAX_BUFFER_SIZE;
        }
        if (maxMemory > 268435456) {
            return 16384;
        }
        return JarConfig.DEFAULT_BUFFER_SIZE;
    }

    public static boolean safeDelete(File file) {
        if (file == null || !file.exists()) {
            return true;
        }
        int i = 0;
        while (i < 3) {
            if (file.delete()) {
                return true;
            }
            i++;
            if (i < 3) {
                try {
                    Thread.sleep(i * 100);
                } catch (InterruptedException unused) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        file.toString();
        return false;
    }

    public static boolean verifyJarFile(File file) {
        if (file == null || !file.exists() || file.length() == 0) {
            return false;
        }
        try {
            ZipInputStream zipInputStream = new ZipInputStream(new FileInputStream(file));
            int i = 0;
            while (zipInputStream.getNextEntry() != null && (i = i + 1) <= 10) {
                zipInputStream.closeEntry();
            }
            boolean z = i > 0;
            zipInputStream.close();
            return z;
        } catch (IOException unused) {
            file.getName();
            return false;
        }
    }
}


