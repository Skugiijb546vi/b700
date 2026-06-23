package com.app.framework.app;

import android.net.Uri;
import android.util.Base64;
import com.app.framework.core.env.BEnvironment;
import com.ninja.engine.AbstractC1230oOoOo0o;
import java.io.File;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.util.Arrays;
import java.util.Collection;
import org.json.JSONArray;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class FacebookSignInHelper {
    private static final String FB_APP_ID = "165073083517174";
    private static final String GAME_PACKAGE = "com.miniclip.eightballpool";
    private static final String PREFS_FILE = "com.facebook.AccessTokenManager.SharedPreferences";
    private static final String PREFS_KEY = "com.facebook.AccessTokenManager.CachedAccessToken";
    private static final String TAG = "FBSignInHelper";

    private static JSONObject buildAccessTokenJson(String str, String str2, long j, long j2, long j3, Collection<String> collection) {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 3);
        jSONObject.put("token", str);
        jSONObject.put("appID", FB_APP_ID);
        jSONObject.put("userID", str2);
        JSONArray jSONArray = new JSONArray();
        for (String str3 : collection) {
            jSONArray.put(str3);
        }
        jSONObject.put("permissions", jSONArray);
        jSONObject.put("declinedPermissions", new JSONArray());
        jSONObject.put("expiredPermissions", new JSONArray());
        jSONObject.put("tokenSource", "WEB_VIEW");
        jSONObject.put("expirationTime", j);
        jSONObject.put("lastRefreshTime", j2);
        jSONObject.put("dataAccessExpirationTime", j3);
        jSONObject.put("graph_domain", "facebook");
        return jSONObject;
    }

    public static void cacheTokenFromRedirect(Uri uri, int i) {
        char c;
        try {
            String fragment = uri.getFragment();
            if (fragment == null) {
                fragment = uri.getQuery();
            }
            if (fragment == null) {
                uri.toString();
                return;
            }
            String[] split = fragment.split("&");
            int length = split.length;
            String str = null;
            int i2 = 0;
            long j = 5183944;
            String str2 = null;
            int i3 = 0;
            long j2 = 0;
            while (i3 < length) {
                String str3 = split[i3];
                int indexOf = str3.indexOf(61);
                if (indexOf >= 1) {
                    String substring = str3.substring(i2, indexOf);
                    String decode = Uri.decode(str3.substring(indexOf + 1));
                    switch (substring.hashCode()) {
                        case -1938933922:
                            if (substring.equals("access_token")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case -833810928:
                            if (substring.equals("expires_in")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case -147132913:
                            if (substring.equals("user_id")) {
                                c = 1;
                                break;
                            }
                            c = 65535;
                            break;
                        case -29832777:
                            if (substring.equals("data_access_expiration_time")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1991322732:
                            if (substring.equals("signed_request")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c == 0) {
                        str2 = decode;
                    } else if (c == 1) {
                        str = decode;
                    } else if (c == 2) {
                        j = Long.parseLong(decode);
                    } else if (c == 3) {
                        try {
                            j2 = Long.parseLong(decode);
                        } catch (Exception unused) {
                        }
                    } else if (c == 4 && str == null) {
                        str = extractUserIdFromSignedRequest(decode);
                    }
                }
                i3++;
                i2 = 0;
            }
            if (str2 == null) {
                return;
            }
            String str4 = str == null ? "unknown" : str;
            long currentTimeMillis = System.currentTimeMillis();
            long j3 = (j * 1000) + currentTimeMillis;
            writeToVirtualPrefs(buildAccessTokenJson(str2, str4, j3, currentTimeMillis, j2 > 0 ? j2 * 1000 : j3, Arrays.asList("public_profile", "email")).toString(), i);
        } catch (Exception unused2) {
        }
    }

    private static String extractUserIdFromSignedRequest(String str) {
        try {
            String[] split = str.split("\\.", 2);
            if (split.length < 2) {
                return null;
            }
            return new JSONObject(new String(Base64.decode(split[1].replace('-', '+').replace('_', '/'), 0), StandardCharsets.UTF_8)).optString("user_id", null);
        } catch (Exception e) {
            e.getMessage();
            return null;
        }
    }

    private static void writeToVirtualPrefs(String str, int i) {
        File file = new File(BEnvironment.getDataDir(GAME_PACKAGE, i), "shared_prefs");
        if (!file.exists() && !file.mkdirs()) {
            file.toString();
        }
        File file2 = new File(file, "com.facebook.AccessTokenManager.SharedPreferences.xml");
        String OooO0oo = AbstractC1230oOoOo0o.OooO0oo("<?xml version='1.0' encoding='utf-8' standalone='yes' ?>\n<map>\n    <string name=\"com.facebook.AccessTokenManager.CachedAccessToken\">", str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;"), "</string>\n</map>\n");
        OutputStreamWriter outputStreamWriter = new OutputStreamWriter(new FileOutputStream(file2), StandardCharsets.UTF_8);
        try {
            outputStreamWriter.write(OooO0oo);
            outputStreamWriter.close();
            file2.getAbsolutePath();
        } catch (Throwable th) {
            try {
                outputStreamWriter.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }
}
