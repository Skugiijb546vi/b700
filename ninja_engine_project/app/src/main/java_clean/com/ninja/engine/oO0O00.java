package com.ninja.engine;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
/* loaded from: classes.dex */
public final class oO0O00 {
    public static final Map OooO00o;

    static {
        String property = System.getProperty("http.agent");
        if (!TextUtils.isEmpty(property)) {
            int length = property.length();
            StringBuilder sb = new StringBuilder(property.length());
            for (int i = 0; i < length; i++) {
                char charAt = property.charAt(i);
                if ((charAt <= 31 && charAt != '\t') || charAt >= 127) {
                    charAt = '?';
                }
                sb.append(charAt);
            }
            property = sb.toString();
        }
        HashMap hashMap = new HashMap(2);
        if (!TextUtils.isEmpty(property)) {
            hashMap.put("User-Agent", Collections.singletonList(new oO0O00O(property)));
        }
        OooO00o = Collections.unmodifiableMap(hashMap);
    }
}


