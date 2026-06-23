package com.ninja.engine;

import android.os.AsyncTask;
import android.os.Build;
import android.util.Base64;
import com.app.framework.utils.ShellUtils;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;
/* renamed from: com.ninja.engine.oooOoo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC2033oooOoo0 {
    public static String OooO00o;

    static {
        new ArrayList();
        OooO00o = "https://example.com/test/xapi/";
    }

    public static String OooO00o(String str) {
        int length = 4 - (str.length() % 4);
        String str2 = "";
        if (length != 4) {
            for (int i = 0; i < length; i++) {
                str2 = AbstractC1230oOoOo0o.OooO0oO(str2, "=");
            }
        }
        return new String(Base64.decode(AbstractC1230oOoOo0o.OooO0oO(str, str2), 0));
    }

    public static String OooO0O0() {
        String OooO0Oo = OooO0Oo(Build.MODEL);
        long j = Build.TIME;
        StringBuilder sb = new StringBuilder();
        sb.append(j);
        String OooO0Oo2 = OooO0Oo(sb.toString());
        return OooO0Oo(OooO0Oo + OooO0Oo2);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.util.AbstractMap, java.util.HashMap, com.ninja.engine.ooOo0oOO] */
    /* JADX WARN: Type inference failed for: r0v1, types: [com.ninja.engine.oOO0Oo0, android.os.AsyncTask] */
    /* JADX WARN: Type inference failed for: r5v7, types: [com.ninja.engine.ooOoOoOO, java.lang.Object] */
    public static void OooO0OO(C0131o00O0o c0131o00O0o, InterfaceC2035oooOoo0O interfaceC2035oooOoo0O) {
        URL url;
        HashMap hashMap = new HashMap();
        hashMap.put("x", OooO0Oo((String) c0131o00O0o.OooO0O0));
        hashMap.put("y", OooO0Oo((String) c0131o00O0o.OooO0OO));
        hashMap.put("z", OooO0Oo((String) c0131o00O0o.OooO0Oo));
        long currentTimeMillis = System.currentTimeMillis();
        StringBuilder sb = new StringBuilder();
        sb.append(currentTimeMillis);
        hashMap.put("w", OooO0Oo(sb.toString()));
        String OooO0oO = AbstractC1230oOoOo0o.OooO0oO(OooO00o, "l.php");
        Object obj = new Object();
        obj.OooO0Oo = 1;
        try {
            url = new URL(OooO0oO);
        } catch (MalformedURLException e) {
            e.printStackTrace();
            url = null;
        }
        obj.OooO00o = null;
        obj.OooO0O0 = url;
        obj.OooO0OO = hashMap;
        obj.OooO0Oo = 1;
        C0435o0OoO000 c0435o0OoO000 = new C0435o0OoO000(5, interfaceC2035oooOoo0O);
        AsyncTask asyncTask = new AsyncTask() {};
        asyncTask.OooO0O0 = obj;
        asyncTask.OooO0Oo = c0435o0OoO000;
        asyncTask.OooO00o = false;
        asyncTask.execute(new C1892ooOoOoOO[0]);
    }

    public static String OooO0Oo(String str) {
        return Base64.encodeToString(str.getBytes(), 9).replace(ShellUtils.COMMAND_LINE_END, "");
    }
}



