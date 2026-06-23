package com.ninja.engine;

import android.text.TextUtils;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
/* loaded from: classes.dex */
public final class oO0O00o0 implements oO000Oo0 {
    public final Map OooO0O0;
    public volatile Map OooO0OO;

    public oO0O00o0(Map map) {
        this.OooO0O0 = Collections.unmodifiableMap(map);
    }

    @Override // com.ninja.engine.oO000Oo0
    public final Map OooO00o() {
        if (this.OooO0OO == null) {
            synchronized (this) {
                try {
                    if (this.OooO0OO == null) {
                        this.OooO0OO = Collections.unmodifiableMap(OooO0O0());
                    }
                } finally {
                }
            }
        }
        return this.OooO0OO;
    }

    public final HashMap OooO0O0() {
        HashMap hashMap = new HashMap();
        for (Object objEntry : this.OooO0O0.entrySet()) {
            Map.Entry entry = (Map.Entry) objEntry;
            List list = (List) entry.getValue();
            StringBuilder sb = new StringBuilder();
            int size = list.size();
            for (int i = 0; i < size; i++) {
                String str = ((oO0O00O) list.get(i)).OooO00o;
                if (!TextUtils.isEmpty(str)) {
                    sb.append(str);
                    if (i != list.size() - 1) {
                        sb.append(',');
                    }
                }
            }
            String sb2 = sb.toString();
            if (!TextUtils.isEmpty(sb2)) {
                hashMap.put(entry.getKey(), sb2);
            }
        }
        return hashMap;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof oO0O00o0) {
            return this.OooO0O0.equals(((oO0O00o0) obj).OooO0O0);
        }
        return false;
    }

    public final int hashCode() {
        return this.OooO0O0.hashCode();
    }

    public final String toString() {
        return "LazyHeaders{headers=" + this.OooO0O0 + '}';
    }
}


