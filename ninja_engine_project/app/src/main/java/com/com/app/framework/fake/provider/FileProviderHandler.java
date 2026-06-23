package com.app.framework.fake.provider;

import android.content.Context;
import android.content.pm.ProviderInfo;
import android.net.Uri;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.BActivityThread;
import com.app.framework.utils.compat.BuildCompat;
import java.io.File;
/* loaded from: classes.dex */
public class FileProviderHandler {
    public static File convertFile(Context context, Uri uri) {
        for (ProviderInfo providerInfo : BActivityThread.getProviders()) {
            try {
                File fileForUri = FileProvider.getFileForUri(context, providerInfo.authority, uri);
                if (fileForUri != null && fileForUri.exists()) {
                    return fileForUri;
                }
            } catch (Exception unused) {
            }
        }
        return null;
    }

    public static Uri convertFileUri(Context context, Uri uri) {
        if (BuildCompat.isN()) {
            File convertFile = convertFile(context, uri);
            if (convertFile == null) {
                return null;
            }
            return BlackBoxCore.getBStorageManager().getUriForFile(convertFile.getAbsolutePath());
        }
        return uri;
    }
}
