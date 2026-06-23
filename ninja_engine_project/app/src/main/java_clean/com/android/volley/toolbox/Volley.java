package com.android.volley.toolbox;

import android.content.Context;
import com.android.volley.Network;
import com.android.volley.RequestQueue;
import com.android.volley.toolbox.DiskBasedCache;
import java.io.File;
/* loaded from: classes.dex */
public class Volley {
    private static final String DEFAULT_CACHE_DIR = "volley";

    public static RequestQueue newRequestQueue(Context context) {
        return newRequestQueue(context, (BaseHttpStack) null);
    }

    private static RequestQueue newRequestQueue(Context context, Network network) {
        final Context applicationContext = context.getApplicationContext();
        RequestQueue requestQueue = new RequestQueue(new DiskBasedCache(new DiskBasedCache.FileSupplier() { // from class: com.android.volley.toolbox.Volley.1
            private File cacheDir = null;

            @Override // com.android.volley.toolbox.DiskBasedCache.FileSupplier
            public File get() {
                if (this.cacheDir == null) {
                    this.cacheDir = new File(applicationContext.getCacheDir(), Volley.DEFAULT_CACHE_DIR);
                }
                return this.cacheDir;
            }
        }), network);
        requestQueue.start();
        return requestQueue;
    }

    public static RequestQueue newRequestQueue(Context context, BaseHttpStack baseHttpStack) {
        return newRequestQueue(context, baseHttpStack == null ? new BasicNetwork((BaseHttpStack) new HurlStack()) : new BasicNetwork(baseHttpStack));
    }

    @Deprecated
    public static RequestQueue newRequestQueue(Context context, HttpStack httpStack) {
        return httpStack == null ? newRequestQueue(context, (BaseHttpStack) null) : newRequestQueue(context, new BasicNetwork(httpStack));
    }
}


