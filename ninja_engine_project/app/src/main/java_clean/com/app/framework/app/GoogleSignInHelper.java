package com.app.framework.app;

import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Process;
import android.os.ResultReceiver;
import android.util.Base64;
import com.app.framework.BlackBoxCore;
import com.ninja.engine.AbstractC1230oOoOo0o;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.lang.reflect.Constructor;
import java.lang.reflect.Method;
import org.json.JSONObject;
/* loaded from: classes.dex */
public class GoogleSignInHelper {
    public static final String ACTION_GSI_CANCEL = "com.ninja.engine.GSI_CANCEL";
    public static final String ACTION_GSI_TOKEN = "com.ninja.engine.GSI_TOKEN";
    private static final String ACTIVE_USER_FILE = "gsi_active_user_id";
    private static final String BUNDLE_KEY_DISPLAY_NAME = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME";
    private static final String BUNDLE_KEY_FAMILY_NAME = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME";
    private static final String BUNDLE_KEY_GIVEN_NAME = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME";
    private static final String BUNDLE_KEY_ID = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID";
    private static final String BUNDLE_KEY_ID_TOKEN = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN";
    private static final String BUNDLE_KEY_PROFILE_PICTURE_URI = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI";
    private static final String BUNDLE_KEY_SUBTYPE = "com.google.android.libraries.identity.googleid.BUNDLE_KEY_GOOGLE_ID_TOKEN_SUBTYPE";
    public static final String EXTRA_USER_ID = "gsi_user_id";
    private static final String TAG = "PlayIntegrity";
    private static final String TOKEN_FILE = "gsi_cached_token";
    private static final String TYPE_GOOGLE_ID_TOKEN = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_CREDENTIAL";
    private static final String TYPE_SIWG = "com.google.android.libraries.identity.googleid.TYPE_GOOGLE_ID_TOKEN_SIWG_CREDENTIAL";
    private static volatile int sPendingUserId;

    public static void cacheToken(Context context, String str) {
        cacheToken(context, str, sPendingUserId);
    }

    public static void deliverError(Object obj, String str, String str2) {
        Method method;
        try {
            Method[] methods = obj.getClass().getMethods();
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    method = null;
                    break;
                }
                method = methods[i];
                if ("onError".equals(method.getName())) {
                    break;
                }
                i++;
            }
            if (method != null) {
                method.invoke(obj, str, str2);
            }
        } catch (Exception unused) {
        }
    }

    public static void deliverTokenViaCallback(Object obj, String str) {
        String[] split = str.split("\\.");
        if (split.length < 2) {
            throw new IllegalArgumentException("Invalid JWT");
        }
        JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1], 10)));
        String optString = jSONObject.optString("email", jSONObject.optString("sub", ""));
        String optString2 = jSONObject.optString("name", "");
        String optString3 = jSONObject.optString("given_name", "");
        String optString4 = jSONObject.optString("family_name", "");
        String optString5 = jSONObject.optString("picture", "");
        Bundle bundle = new Bundle();
        bundle.putString(BUNDLE_KEY_ID, optString);
        bundle.putString(BUNDLE_KEY_ID_TOKEN, str);
        bundle.putString(BUNDLE_KEY_DISPLAY_NAME, optString2);
        bundle.putString(BUNDLE_KEY_GIVEN_NAME, optString3);
        bundle.putString(BUNDLE_KEY_FAMILY_NAME, optString4);
        bundle.putString(BUNDLE_KEY_SUBTYPE, TYPE_SIWG);
        if (!optString5.isEmpty()) {
            bundle.putParcelable(BUNDLE_KEY_PROFILE_PICTURE_URI, Uri.parse(optString5));
        }
        Class<?> cls = Class.forName("android.credentials.Credential");
        Object newInstance = cls.getConstructor(String.class, Bundle.class).newInstance(TYPE_GOOGLE_ID_TOKEN, bundle);
        Class<?> cls2 = Class.forName("android.credentials.GetCredentialResponse");
        Object newInstance2 = cls2.getConstructor(cls).newInstance(newInstance);
        Method findMethod = findMethod(obj.getClass(), "onResponse", cls2);
        if (findMethod == null) {
            Method[] methods = obj.getClass().getMethods();
            int length = methods.length;
            int i = 0;
            while (true) {
                if (i >= length) {
                    break;
                }
                Method method = methods[i];
                if ("onResponse".equals(method.getName())) {
                    findMethod = method;
                    break;
                }
                i++;
            }
        }
        if (findMethod != null) {
            findMethod.invoke(obj, newInstance2);
        }
    }

    public static void deliverTokenViaResultReceiver(ResultReceiver resultReceiver, String str, ClassLoader classLoader) {
        Constructor<?> constructor;
        int parameterCount;
        String[] split = str.split("\\.");
        if (split.length < 2) {
            throw new IllegalArgumentException("Invalid JWT");
        }
        JSONObject jSONObject = new JSONObject(new String(Base64.decode(split[1], 10)));
        String optString = jSONObject.optString("email", jSONObject.optString("sub", ""));
        String optString2 = jSONObject.optString("name", "");
        String optString3 = jSONObject.optString("given_name", "");
        String optString4 = jSONObject.optString("family_name", "");
        String optString5 = jSONObject.optString("picture", "");
        Class<?> loadClass = classLoader.loadClass("com.google.android.gms.common.api.Status");
        Object newInstance = loadClass.getDeclaredConstructor(Integer.TYPE).newInstance(0);
        Class<?> loadClass2 = classLoader.loadClass("com.google.android.gms.auth.api.identity.SignInCredential");
        Constructor<?>[] declaredConstructors = loadClass2.getDeclaredConstructors();
        int length = declaredConstructors.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                constructor = null;
                break;
            }
            Constructor<?> constructor2 = declaredConstructors[i];
            parameterCount = constructor2.getParameterCount();
            if (parameterCount == 9) {
                constructor = constructor2;
                break;
            }
            i++;
        }
        if (constructor == null) {
            throw new Exception("SignInCredential ctor not found");
        }
        constructor.setAccessible(true);
        Object newInstance2 = constructor.newInstance(optString, optString2, optString3, optString4, !optString5.isEmpty() ? Uri.parse(optString5) : null, null, str, null, null);
        byte[] safeParcelToBytes = safeParcelToBytes(newInstance, loadClass);
        byte[] safeParcelToBytes2 = safeParcelToBytes(newInstance2, loadClass2);
        Intent intent = new Intent();
        intent.putExtra("status", safeParcelToBytes);
        intent.putExtra("sign_in_credential", safeParcelToBytes2);
        Bundle bundle = new Bundle();
        bundle.putBoolean("FAILURE_RESPONSE", false);
        bundle.putInt("ACTIVITY_REQUEST_CODE", 1);
        bundle.putParcelable("RESULT_DATA", intent);
        resultReceiver.send(-1, bundle);
    }

    private static Method findMethod(Class<?> cls, String str, Class<?>... clsArr) {
        try {
            return cls.getMethod(str, clsArr);
        } catch (NoSuchMethodException unused) {
            return null;
        }
    }

    public static int getActiveUserId(Context context) {
        try {
            File file = new File(getHostFilesDir(context), ACTIVE_USER_FILE);
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                return Integer.parseInt(new String(bArr, "UTF-8").trim());
            }
            return 0;
        } catch (Exception unused) {
            return 0;
        }
    }

    public static String getCachedIdToken(Context context) {
        return getCachedIdToken(context, 0);
    }

    private static File getHostFilesDir(Context context) {
        try {
            String hostPkg = BlackBoxCore.getHostPkg();
            if (hostPkg == null || hostPkg.isEmpty()) {
                hostPkg = context.getPackageName();
            }
            File filesDir = context.createPackageContext(hostPkg, 2).getFilesDir();
            Process.myPid();
            filesDir.getAbsolutePath();
            return filesDir;
        } catch (Exception unused) {
            return context.getFilesDir();
        }
    }

    public static int getPendingUserId() {
        return sPendingUserId;
    }

    public static boolean isTokenExpired(String str) {
        try {
            String[] split = str.split("\\.");
            if (split.length < 2) {
                return true;
            }
            return new JSONObject(new String(Base64.decode(split[1], 10))).optLong("exp", 0L) * 1000 < System.currentTimeMillis();
        } catch (Exception unused) {
            return true;
        }
    }

    public static void launchWebViewSignIn(Context context) {
        launchWebViewSignIn(context, sPendingUserId);
    }

    private static String readTokenFile(Context context, String str) {
        try {
            File file = new File(getHostFilesDir(context), str);
            file.getAbsolutePath();
            file.exists();
            if (file.exists()) {
                FileInputStream fileInputStream = new FileInputStream(file);
                byte[] bArr = new byte[(int) file.length()];
                fileInputStream.read(bArr);
                fileInputStream.close();
                String str2 = new String(bArr, "UTF-8");
                if (isTokenExpired(str2)) {
                    file.delete();
                    return null;
                }
                return str2;
            }
            return null;
        } catch (Exception unused) {
            return null;
        }
    }

    private static byte[] safeParcelToBytes(Object obj, Class<?> cls) {
        Parcel obtain = Parcel.obtain();
        cls.getMethod("writeToParcel", Parcel.class, Integer.TYPE).invoke(obj, obtain, 0);
        byte[] marshall = obtain.marshall();
        obtain.recycle();
        return marshall;
    }

    public static void setActiveUserId(Context context, int i) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(getHostFilesDir(context), ACTIVE_USER_FILE));
            fileOutputStream.write(String.valueOf(i).getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public static void setPendingUserId(int i) {
        sPendingUserId = i;
    }

    private static String tokenFileName(int i) {
        return AbstractC1230oOoOo0o.OooO0o(i, "gsi_cached_token_u");
    }

    private static void writeTokenFile(Context context, String str, String str2) {
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(new File(getHostFilesDir(context), str));
            fileOutputStream.write(str2.getBytes("UTF-8"));
            fileOutputStream.close();
        } catch (Exception unused) {
        }
    }

    public static void cacheToken(Context context, String str, int i) {
        getHostFilesDir(context).getAbsolutePath();
        writeTokenFile(context, tokenFileName(i), str);
        if (i == 0) {
            writeTokenFile(context, TOKEN_FILE, str);
        }
    }

    public static String getCachedIdToken(Context context, int i) {
        String str = tokenFileName(i);
        getHostFilesDir(context).getAbsolutePath();
        String readTokenFile = readTokenFile(context, str);
        if (readTokenFile != null) {
            return readTokenFile;
        }
        if (i == 0) {
            return readTokenFile(context, TOKEN_FILE);
        }
        return null;
    }

    public static void launchWebViewSignIn(Context context, int i) {
        Intent intent = new Intent(context, GoogleSignInWebViewActivity.class);
        intent.putExtra(EXTRA_USER_ID, i);
        intent.addFlags(268435456);
        context.startActivity(intent);
    }
}


