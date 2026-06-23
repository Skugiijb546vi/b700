package com.ninja.engine;

import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.ColorMatrix;
import android.graphics.ColorMatrixColorFilter;
import android.graphics.drawable.ColorDrawable;
import android.net.ConnectivityManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.os.Handler;
import android.os.Looper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.android.volley.toolbox.HttpHeaderParser;
import com.android.volley.toolbox.Volley;
import com.app.framework.BlackBoxCore;
import com.app.framework.core.system.user.BUserHandle;
import com.app.framework.entity.pm.InstallResult;
import com.app.framework.entity.pm.InstalledPackage;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.ninja.engine.encryption.EncryptorInstance;
import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.net.HttpURLConnection;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.util.List;
import java.util.Objects;
import org.json.JSONObject;
/* renamed from: com.ninja.engine.oO0Oo0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0792oO0Oo0Oo extends AbstractComponentCallbacksC0593o0oOoOo0 {
    public TextView OoooOO0;
    public ImageView OoooOOO;
    public Button OoooOOo;
    public DialogInterfaceC0074o0000oOO Ooooo0o;
    public TextView o000oOoO;
    public volatile boolean OoooOo0 = false;
    public volatile boolean OoooOoO = false;
    public volatile long OoooOoo = 0;
    public final Handler Ooooo00 = new Handler(Looper.getMainLooper());
    public boolean OooooO0 = false;

    public static /* synthetic */ void Oooo0o(C0792oO0Oo0Oo c0792oO0Oo0Oo) {
        if (c0792oO0Oo0Oo.OooOOOo()) {
            c0792oO0Oo0Oo.OoooOO0();
            if (!c0792oO0Oo0Oo.OoooOo0) {
                c0792oO0Oo0Oo.OoooOo0();
            }
        }
    }

    public static boolean Oooo0oO() {
        String str;
        HttpURLConnection httpURLConnection;
        Throwable th;
        HttpURLConnection httpURLConnection2 = null;
        boolean z = true;
        try {
            str = (EncryptorInstance.TextDecryptor(MainActivity.getURL(1)) + EncryptorInstance.TextDecryptor(MainActivity.getApplicationInfo(3))) + "/upload/check-version.php";
        } catch (Exception unused) {
            str = null;
        }
        if (str != null && !str.isEmpty()) {
            try {
                httpURLConnection = (HttpURLConnection) new URL(str).openConnection();
                try {
                    httpURLConnection.setConnectTimeout(3000);
                    httpURLConnection.setReadTimeout(3000);
                    httpURLConnection.setRequestMethod("POST");
                    httpURLConnection.setDoOutput(true);
                    httpURLConnection.setUseCaches(false);
                    httpURLConnection.setRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, "application/x-www-form-urlencoded");
                    OutputStream outputStream = httpURLConnection.getOutputStream();
                    outputStream.write("probe=1".getBytes(StandardCharsets.UTF_8));
                    outputStream.close();
                    if (httpURLConnection.getResponseCode() <= 0) {
                        z = false;
                    }
                    httpURLConnection.disconnect();
                    return z;
                } catch (Exception unused2) {
                    httpURLConnection2 = httpURLConnection;
                    if (httpURLConnection2 != null) {
                        httpURLConnection2.disconnect();
                    }
                    return false;
                } catch (Throwable th2) {
                    th = th2;
                    if (httpURLConnection != null) {
                        httpURLConnection.disconnect();
                    }
                    throw th;
                }
            } catch (Exception unused3) {
            } catch (Throwable th3) {
                httpURLConnection = null;
                th = th3;
            }
        }
        return false;
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final View OooOo0O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        String str;
        Bundle bundle = this.OooO0o;
        String str2 = null;
        if (bundle != null && !bundle.getString("username-activation", "").isEmpty() && !bundle.getString("password-activation", "").isEmpty() && "success".equals(bundle.getString("check-user"))) {
            View inflate = layoutInflater.inflate(R.layout.fragment_home, viewGroup, false);
            this.OoooOO0 = (TextView) inflate.findViewById(R.id.statusText);
            this.o000oOoO = (TextView) inflate.findViewById(R.id.versionBadge);
            this.OoooOOO = (ImageView) inflate.findViewById(R.id.appIcon);
            Button button = (Button) inflate.findViewById(R.id.launchButton);
            this.OoooOOo = button;
            button.setVisibility(4);
            this.OoooOOo.setEnabled(false);
            this.OoooOOo.setOnClickListener(new View$OnClickListenerC0056OoooooO(4, this));
            OoooOO0();
            OoooOo0();
            this.OoooOOo.setVisibility(4);
            this.OoooOOo.setEnabled(false);
            new Thread(new RunnableC0706oO000oO(this, 5), "LaunchButtonAvailabilityThread").start();
            if (!this.OoooOoO) {
                this.OoooOoO = true;
                new Thread(new RunnableC0706oO000oO(this, 6), "HomeAutoInstallThread").start();
            }
            if (!this.OooooO0 && OooOOOo()) {
                Bundle bundle2 = this.OooO0o;
                if (bundle2 != null) {
                    str = bundle2.getString("username-activation");
                } else {
                    str = null;
                }
                if (bundle2 != null) {
                    str2 = bundle2.getString("password-activation");
                }
                String str3 = str2;
                if (str != null && !str.isEmpty() && str3 != null && !str3.isEmpty()) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) Oooo000().getSystemService("connectivity");
                    if (connectivityManager.getActiveNetworkInfo() != null && connectivityManager.getActiveNetworkInfo().isConnected()) {
                        String generateTokenKey = MainActivity.generateTokenKey();
                        try {
                            String str4 = EncryptorInstance.TextDecryptor(MainActivity.getURL(1)) + EncryptorInstance.TextDecryptor(MainActivity.getApplicationInfo(3));
                            Volley.newRequestQueue(Oooo000()).add(new C0710oO000oo(AbstractC1230oOoOo0o.OooO0oO(str4, "/upload/check-version.php"), new C0709oO000oOo(this, generateTokenKey), new C0435o0OoO000(1, this), generateTokenKey, str, str3, AbstractC2033oooOoo0.OooO0O0(), OoooO00()));
                        } catch (Exception unused) {
                        }
                    }
                }
            }
            return inflate;
        }
        Oooo000().finish();
        return null;
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOoO() {
        this.OooOoo = true;
        OoooOO0();
        if (!this.OoooOo0) {
            OoooOo0();
        }
        this.OoooOOo.setVisibility(4);
        this.OoooOOo.setEnabled(false);
        new Thread(new RunnableC0706oO000oO(this, 5), "LaunchButtonAvailabilityThread").start();
    }

    public final int Oooo() {
        try {
            return Oooo000().getSharedPreferences("ninja_accounts", 0).getInt("active_user_id", 0);
        } catch (Exception unused) {
            return 0;
        }
    }

    public final boolean Oooo0oo(boolean z) {
        BlackBoxCore blackBoxCore = BlackBoxCore.get();
        int Oooo = Oooo();
        o000oOoO(false);
        if (OoooO0O()) {
            return true;
        }
        if (!OoooO0()) {
            return false;
        }
        if (!z) {
            this.Ooooo00.post(new RunnableC0706oO000oO(this, 3));
        }
        InstallResult installPackageAsUser = blackBoxCore.installPackageAsUser("com.miniclip.eightballpool", Oooo);
        boolean z2 = installPackageAsUser.success;
        o000oOoO(true);
        if (!installPackageAsUser.success || !OoooO0O()) {
            return false;
        }
        return true;
    }

    public final boolean OoooO() {
        o000oOoO(false);
        int Oooo = Oooo();
        for (int i = 1; i <= 3; i++) {
            try {
                Intent launchIntentForPackage = BlackBoxCore.getBPackageManager().getLaunchIntentForPackage("com.miniclip.eightballpool", Oooo);
                if (launchIntentForPackage != null) {
                    launchIntentForPackage.addFlags(268435456);
                    Objects.toString(launchIntentForPackage.getComponent());
                    BlackBoxCore.getBActivityManager().startActivity(launchIntentForPackage, Oooo);
                    return true;
                }
                Intent intent = new Intent("android.intent.action.MAIN");
                intent.addCategory("android.intent.category.LAUNCHER");
                intent.setComponent(new ComponentName("com.miniclip.eightballpool", "com.miniclip.eightballpool.EightBallPoolActivity"));
                intent.addFlags(268435456);
                BlackBoxCore.getBActivityManager().startActivity(intent, Oooo);
                return true;
            } catch (Exception unused) {
                try {
                    Thread.sleep(250L);
                } catch (InterruptedException unused2) {
                    Thread.currentThread().interrupt();
                }
            }
        }
        return false;
    }

    public final boolean OoooO0() {
        try {
            Oooo000().getPackageManager().getApplicationInfo("com.miniclip.eightballpool", 0);
            return true;
        } catch (Exception unused) {
            return false;
        }
    }

    public final String OoooO00() {
        try {
            return Oooo000().getPackageManager().getPackageInfo(Oooo000().getPackageName(), 0).versionName;
        } catch (Exception unused) {
            return OooOOO0(R.string.version_name).replace("v", "");
        }
    }

    public final boolean OoooO0O() {
        int Oooo = Oooo();
        try {
            List<InstalledPackage> installedPackagesAsUser = BlackBoxCore.getBPackageManager().getInstalledPackagesAsUser(Oooo);
            if (installedPackagesAsUser != null) {
                for (InstalledPackage installedPackage : installedPackagesAsUser) {
                    if (installedPackage != null && "com.miniclip.eightballpool".equals(installedPackage.packageName)) {
                        return true;
                    }
                }
            }
        } catch (Throwable unused) {
        }
        try {
            return BlackBoxCore.get().isInstalled("com.miniclip.eightballpool", Oooo);
        } catch (Throwable unused2) {
            return false;
        }
    }

    public final void OoooOO0() {
        try {
            PackageInfo packageInfo = Oooo000().getPackageManager().getPackageInfo("com.miniclip.eightballpool", 0);
            String str = packageInfo.versionName;
            packageInfo.getLongVersionCode();
            TextView textView = this.o000oOoO;
            textView.setText("v" + str);
            this.o000oOoO.setVisibility(0);
            OoooOOO(false);
        } catch (PackageManager.NameNotFoundException unused) {
            this.o000oOoO.setText(R.string.not_installed);
            this.o000oOoO.setVisibility(0);
            OoooOOO(true);
        } catch (Exception e) {
            e.getMessage();
            this.o000oOoO.setVisibility(8);
        }
    }

    public final void OoooOOO(boolean z) {
        ImageView imageView;
        float f;
        if (z) {
            ColorMatrix colorMatrix = new ColorMatrix();
            colorMatrix.setSaturation(0.0f);
            this.OoooOOO.setColorFilter(new ColorMatrixColorFilter(colorMatrix));
            imageView = this.OoooOOO;
            f = 0.5f;
        } else {
            this.OoooOOO.clearColorFilter();
            imageView = this.OoooOOO;
            f = 1.0f;
        }
        imageView.setAlpha(f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r15v1, types: [android.content.DialogInterface$OnKeyListener, java.lang.Object] */
    public final void OoooOOo(String str, String str2, final String str3) {
        if (OooOOOo() && !Oooo000().isFinishing()) {
            DialogInterfaceC0074o0000oOO dialogInterfaceC0074o0000oOO = this.Ooooo0o;
            if (dialogInterfaceC0074o0000oOO != null && dialogInterfaceC0074o0000oOO.isShowing()) {
                return;
            }
            C0073o0000oO0 c0073o0000oO0 = new C0073o0000oO0(Oooo000(), (int) R.style.UpdateDialogTheme);
            LayoutInflater layoutInflater = this.Oooo0O0;
            if (layoutInflater == null) {
                layoutInflater = OooOoO0(null);
                this.Oooo0O0 = layoutInflater;
            }
            View inflate = layoutInflater.inflate(R.layout.dialog_update, (ViewGroup) null);
            final Button button = (Button) inflate.findViewById(R.id.update_download_btn);
            final View findViewById = inflate.findViewById(R.id.update_progress_container);
            final TextView textView = (TextView) inflate.findViewById(R.id.update_progress_percent);
            final LinearProgressIndicator linearProgressIndicator = (LinearProgressIndicator) inflate.findViewById(R.id.update_progress_bar);
            ((TextView) inflate.findViewById(R.id.update_current_version)).setText("v" + str);
            ((TextView) inflate.findViewById(R.id.update_new_version)).setText("v".concat(str2));
            findViewById.setVisibility(8);
            linearProgressIndicator.setIndeterminate(false);
            linearProgressIndicator.setProgress(0);
            textView.setText("0%");
            button.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.oO0Ooo0O
                /* JADX WARN: Type inference failed for: r13v3, types: [com.ninja.engine.o0Oo0O0, java.lang.Object] */
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    String str4;
                    String str5;
                    boolean canRequestPackageInstalls;
                    Intent intent;
                    final Button button2 = button;
                    View view2 = findViewById;
                    final LinearProgressIndicator linearProgressIndicator2 = linearProgressIndicator;
                    final TextView textView2 = textView;
                    String str6 = "update.apk";
                    C0792oO0Oo0Oo c0792oO0Oo0Oo = C0792oO0Oo0Oo.this;
                    String str7 = str3;
                    if (str7 != null) {
                        c0792oO0Oo0Oo.getClass();
                        if (!str7.trim().isEmpty()) {
                            String trim = str7.trim();
                            if (!trim.startsWith("http://") && !trim.startsWith("https://")) {
                                Toast.makeText(c0792oO0Oo0Oo.OooO(), c0792oO0Oo0Oo.OooOOO0(R.string.link_not_available_now), 0).show();
                                return;
                            }
                            try {
                                button2.setClickable(false);
                                button2.setEnabled(false);
                                try {
                                    str4 = URLUtil.guessFileName(trim, null, null);
                                } catch (Exception unused) {
                                    str4 = "update.apk";
                                }
                                if (str4 != null && !str4.trim().isEmpty()) {
                                    str6 = str4;
                                }
                                try {
                                    str5 = EncryptorInstance.TextDecryptor(MainActivity.getApplicationInfo(3));
                                } catch (Exception unused2) {
                                    str5 = "Ninja";
                                }
                                File externalFilesDir = c0792oO0Oo0Oo.Oooo000().getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                                if (externalFilesDir != null) {
                                    File file = new File(externalFilesDir, str5);
                                    if (!file.exists() && !file.mkdirs()) {
                                        throw new IllegalStateException("Failed to create download dir");
                                    }
                                    File file2 = new File(file, str6);
                                    if (file2.exists() && file2.length() > 0) {
                                        canRequestPackageInstalls = c0792oO0Oo0Oo.Oooo000().getPackageManager().canRequestPackageInstalls();
                                        if (!canRequestPackageInstalls) {
                                            intent = new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + c0792oO0Oo0Oo.Oooo000().getPackageName()));
                                        } else {
                                            intent = new Intent("android.intent.action.INSTALL_PACKAGE");
                                            intent.addFlags(1);
                                            intent.addFlags(67108864);
                                            intent.putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true);
                                            o000OO00 Oooo000 = c0792oO0Oo0Oo.Oooo000();
                                            intent.setData(FileProvider.OooO0Oo(Oooo000, c0792oO0Oo0Oo.Oooo000().getPackageName() + ".provider", file2));
                                        }
                                        c0792oO0Oo0Oo.Oooo0o0(intent);
                                        button2.setClickable(true);
                                        button2.setEnabled(true);
                                        return;
                                    }
                                    view2.setVisibility(0);
                                    linearProgressIndicator2.setProgress(0);
                                    textView2.setText("0%");
                                    String absolutePath = file.getAbsolutePath();
                                    Object obj = new Object();
                                    obj.OooO00o = trim;
                                    obj.OooO0O0 = absolutePath;
                                    obj.OooO0OO = str6;
                                    C0303o0O0Oo0o c0303o0O0Oo0o = C0303o0O0Oo0o.OooO0o;
                                    if (c0303o0O0Oo0o.OooO00o == 0) {
                                        synchronized (C0303o0O0Oo0o.class) {
                                            if (c0303o0O0Oo0o.OooO00o == 0) {
                                                c0303o0O0Oo0o.OooO00o = BUserHandle.AID_CACHE_GID_START;
                                            }
                                        }
                                    }
                                    obj.OooO0oO = c0303o0O0Oo0o.OooO00o;
                                    obj.OooO0oo = C0413o0Oo0O0.OooO0OO();
                                    obj.OooO = null;
                                    obj.OooOO0 = new InterfaceC0971oOOO000() { // from class: com.ninja.engine.oO0Ooo0o
                                        @Override // com.ninja.engine.InterfaceC0971oOOO000
                                        public final void OooO00o(C1006oOOOOoOO c1006oOOOOoOO) {
                                            button2.post(new RunnableC0564o0oOO0Oo(c1006oOOOOoOO, linearProgressIndicator2, textView2, 1));
                                        }
                                    };
                                    obj.OooO0Oo(new oOO00OOO(c0792oO0Oo0Oo, view2, file2, button2));
                                    return;
                                }
                                throw new IllegalStateException("External files dir is null");
                            } catch (Exception unused3) {
                                Toast.makeText(c0792oO0Oo0Oo.OooO(), c0792oO0Oo0Oo.OooOOO0(R.string.something_went_wrong), 0).show();
                                view2.setVisibility(8);
                                button2.setClickable(true);
                                button2.setEnabled(true);
                                return;
                            }
                        }
                    }
                    Toast.makeText(c0792oO0Oo0Oo.OooO(), c0792oO0Oo0Oo.OooOOO0(R.string.link_not_available_now), 0).show();
                }
            });
            ((C0069o0000o0) c0073o0000oO0.OooO0O0).OooO = inflate;
            DialogInterfaceC0074o0000oOO OooO00o = c0073o0000oO0.OooO00o();
            this.Ooooo0o = OooO00o;
            OooO00o.setCancelable(false);
            this.Ooooo0o.setCanceledOnTouchOutside(false);
            this.Ooooo0o.setOnKeyListener(new Object());
            Window window = this.Ooooo0o.getWindow();
            if (window != null) {
                window.setBackgroundDrawable(new ColorDrawable(0));
                window.setLayout(-1, -2);
                window.getDecorView().setPadding(48, 0, 48, 0);
            }
            this.Ooooo0o.show();
        }
    }

    public final void OoooOo0() {
        boolean z;
        if (!this.OoooOo0 && OooOOOo()) {
            boolean OoooO0 = OoooO0();
            try {
                z = OoooO0O();
            } catch (Exception unused) {
                z = false;
            }
            if (z) {
                this.OoooOO0.setText(R.string.game_ready);
                this.OoooOOo.setText(R.string.launch_game);
                this.OoooOOo.setEnabled(true);
                OoooOOO(false);
            } else if (OoooO0) {
                this.OoooOO0.setText(R.string.preparing_game);
                this.OoooOOo.setText(R.string.install_and_launch);
                this.OoooOOo.setEnabled(true);
                OoooOOO(false);
            } else {
                this.OoooOO0.setText(R.string.install_from_play_store_short);
                this.OoooOOo.setText(R.string.game_not_found);
                this.OoooOOo.setEnabled(false);
                OoooOOO(true);
            }
        }
    }

    public final boolean OoooOoO() {
        String str;
        String str2;
        HttpURLConnection httpURLConnection;
        Bundle bundle = this.OooO0o;
        HttpURLConnection httpURLConnection2 = null;
        if (bundle != null) {
            str = bundle.getString("username-activation");
        } else {
            str = null;
        }
        if (bundle != null) {
            str2 = bundle.getString("password-activation");
        } else {
            str2 = null;
        }
        if (str == null || str.isEmpty() || str2 == null || str2.isEmpty()) {
            return false;
        }
        String str3 = EncryptorInstance.TextDecryptor(MainActivity.getURL(1)) + EncryptorInstance.TextDecryptor(MainActivity.getApplicationInfo(3)) + "/upload/check-version.php";
        String generateTokenKey = MainActivity.generateTokenKey();
        String OooO0O0 = AbstractC2033oooOoo0.OooO0O0();
        String OoooO00 = OoooO00();
        String str4 = "token-key=" + Uri.encode(generateTokenKey) + "&username-activation=" + Uri.encode(str) + "&password-activation=" + Uri.encode(str2) + "&user-device-id=" + Uri.encode(OooO0O0) + "&app-version=" + Uri.encode(OoooO00);
        try {
            httpURLConnection = (HttpURLConnection) new URL(str3).openConnection();
        } catch (Throwable th) {
            th = th;
        }
        try {
            httpURLConnection.setConnectTimeout(5000);
            httpURLConnection.setReadTimeout(5000);
            httpURLConnection.setRequestMethod("POST");
            httpURLConnection.setDoOutput(true);
            httpURLConnection.setUseCaches(false);
            httpURLConnection.setRequestProperty(HttpHeaderParser.HEADER_CONTENT_TYPE, "application/x-www-form-urlencoded");
            OutputStream outputStream = httpURLConnection.getOutputStream();
            Charset charset = StandardCharsets.UTF_8;
            outputStream.write(str4.getBytes(charset));
            outputStream.close();
            StringBuilder sb = new StringBuilder();
            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpURLConnection.getInputStream(), charset));
            while (true) {
                String readLine = bufferedReader.readLine();
                if (readLine != null) {
                    sb.append(readLine);
                } else {
                    bufferedReader.close();
                    boolean z = !"failed".equals(new JSONObject(EncryptorInstance.decryptOpenSSL256bit(sb.toString(), generateTokenKey)).optString("check-user"));
                    httpURLConnection.disconnect();
                    return z;
                }
            }
        } catch (Throwable th2) {
            th = th2;
            httpURLConnection2 = httpURLConnection;
            if (httpURLConnection2 != null) {
                httpURLConnection2.disconnect();
            }
            throw th;
        }
    }

    public final void o000oOoO(boolean z) {
        try {
            long currentTimeMillis = System.currentTimeMillis();
            if (!z && currentTimeMillis - this.OoooOoo < 1500) {
                return;
            }
            this.OoooOoo = currentTimeMillis;
            BlackBoxCore.getBPackageManager().resetTransactionThrottler();
            BlackBoxCore.getBPackageManager().forceReinitialize();
        } catch (Exception unused) {
        }
    }
}

