package com.ninja.engine;

import java.io.File;
import java.io.IOException;
import java.nio.charset.Charset;
/* renamed from: com.ninja.engine.oo00OOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1400oo00OOO {
    public static final Charset OooO00o = Charset.forName("US-ASCII");

    static {
        Charset.forName("UTF-8");
    }

    public static void OooO00o(File file) {
        File[] listFiles = file.listFiles();
        if (listFiles != null) {
            for (File file2 : listFiles) {
                if (file2.isDirectory()) {
                    OooO00o(file2);
                }
                if (!file2.delete()) {
                    throw new IOException("failed to delete file: " + file2);
                }
            }
            return;
        }
        throw new IOException("not a readable directory: " + file);
    }
}


