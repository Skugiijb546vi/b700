package com.ninja.engine;

import java.io.File;
import java.io.FileOutputStream;
/* renamed from: com.ninja.engine.oOO0oOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0953oOO0oOOo {
    /* JADX WARN: Can't wrap try/catch for region: R(16:15|16|17|18|19|(1:21)|22|(7:67|68|69|(2:70|(1:72)(1:73))|74|(2:77|(1:79)(10:80|(1:84)|85|86|25|(1:66)(1:29)|30|31|32|(2:34|35)(9:(1:37)(1:63)|(1:39)|40|(1:42)(1:62)|43|44|45|46|(1:(2:49|50)(2:51|52))(2:53|54))))|76)|24|25|(1:27)|66|30|31|32|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x011a, code lost:
        r15 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:65:0x011e  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0125  */
    /* JADX WARN: Type inference failed for: r20v0, types: [com.ninja.engine.oOO0oOO0] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ninja.engine.C0952oOO0oOOO OooO00o(android.content.Context r21) {
        /*
            Method dump skipped, instructions count: 486
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC0953oOO0oOOo.OooO00o(android.content.Context):com.ninja.engine.oOO0oOOO");
    }

    public static String OooO0O0(String str) {
        if (str == null) {
            return null;
        }
        StringBuilder sb = new StringBuilder();
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isDigit(charAt) && charAt != '.') {
                if (z) {
                    break;
                }
            } else {
                sb.append(charAt);
                z = true;
            }
        }
        String sb2 = sb.toString();
        if (sb2.isEmpty()) {
            return null;
        }
        String[] split = sb2.split("\\.");
        if (split.length < 3 || split[0].isEmpty() || split[1].isEmpty() || split[2].isEmpty()) {
            return null;
        }
        return split[0] + "." + split[1] + "." + split[2];
    }

    public static void OooO0OO(byte[] bArr, File file) {
        File parentFile = file.getParentFile();
        if (parentFile != null && !parentFile.exists()) {
            parentFile.mkdirs();
        }
        File file2 = new File(parentFile, file.getName() + ".tmp");
        FileOutputStream fileOutputStream = new FileOutputStream(file2);
        try {
            fileOutputStream.write(bArr);
            fileOutputStream.getFD().sync();
            fileOutputStream.close();
            if (!file2.renameTo(file)) {
                fileOutputStream = new FileOutputStream(file);
                try {
                    fileOutputStream.write(bArr);
                    fileOutputStream.getFD().sync();
                    fileOutputStream.close();
                    file2.delete();
                } catch (Throwable th) {
                    throw th;
                }
            }
        } finally {
            try {
                fileOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
        }
    }
}


