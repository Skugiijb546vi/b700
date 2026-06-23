package com.ninja.engine;

import android.net.ConnectivityManager;
import android.net.Network;
import android.net.NetworkCapabilities;
import android.net.NetworkInfo;
import android.os.Build;
import android.os.Handler;
import android.widget.Toast;
import com.app.framework.BlackBoxCore;
/* renamed from: com.ninja.engine.oO000oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0706oO000oO implements Runnable {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ C0792oO0Oo0Oo OooO0O0;

    public /* synthetic */ RunnableC0706oO000oO(C0792oO0Oo0Oo c0792oO0Oo0Oo, int i) {
        this.OooO00o = i;
        this.OooO0O0 = c0792oO0Oo0Oo;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Network activeNetwork;
        NetworkCapabilities networkCapabilities;
        RunnableC0706oO000oO runnableC0706oO000oO;
        String format;
        boolean z = false;
        C0792oO0Oo0Oo c0792oO0Oo0Oo = this.OooO0O0;
        switch (this.OooO00o) {
            case 0:
                if (c0792oO0Oo0Oo.OooOOOo()) {
                    MainActivity.OooO00o.edit().remove("user-status").apply();
                    c0792oO0Oo0Oo.Oooo000().recreate();
                    return;
                }
                return;
            case 1:
                if (c0792oO0Oo0Oo.OooOOOo()) {
                    MainActivity.OooO00o.edit().remove("user-status").apply();
                    c0792oO0Oo0Oo.Oooo000().recreate();
                    return;
                }
                return;
            case 2:
                C0792oO0Oo0Oo.Oooo0o(c0792oO0Oo0Oo);
                return;
            case 3:
                if (c0792oO0Oo0Oo.OooOOOo()) {
                    c0792oO0Oo0Oo.OoooOO0.setText(R.string.installing_game);
                    c0792oO0Oo0Oo.OoooOOo.setEnabled(false);
                    c0792oO0Oo0Oo.OoooOOo.setText(R.string.installing_btn);
                    return;
                }
                return;
            case 4:
                if (c0792oO0Oo0Oo.OooOOOo()) {
                    ConnectivityManager connectivityManager = (ConnectivityManager) c0792oO0Oo0Oo.Oooo00O().getSystemService("connectivity");
                    if (connectivityManager != null) {
                        if (Build.VERSION.SDK_INT >= 23) {
                            activeNetwork = connectivityManager.getActiveNetwork();
                            if (activeNetwork != null && (networkCapabilities = connectivityManager.getNetworkCapabilities(activeNetwork)) != null && networkCapabilities.hasCapability(12) && networkCapabilities.hasCapability(16)) {
                                return;
                            }
                        } else {
                            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
                            if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
                                return;
                            }
                        }
                    }
                    BlackBoxCore.get().stopPackage("com.miniclip.eightballpool", c0792oO0Oo0Oo.Oooo());
                    Toast.makeText(c0792oO0Oo0Oo.OooO(), c0792oO0Oo0Oo.OooOOO0(R.string.no_network_connection), 1).show();
                    return;
                }
                return;
            case 5:
                c0792oO0Oo0Oo.getClass();
                c0792oO0Oo0Oo.Ooooo00.post(new RunnableC0711oO000oo0(c0792oO0Oo0Oo, C0792oO0Oo0Oo.Oooo0oO()));
                return;
            case 6:
                Handler handler = c0792oO0Oo0Oo.Ooooo00;
                try {
                    try {
                        if (!c0792oO0Oo0Oo.OoooO0()) {
                            runnableC0706oO000oO = new RunnableC0706oO000oO(c0792oO0Oo0Oo, 2);
                        } else {
                            try {
                                z = c0792oO0Oo0Oo.OoooO0O();
                            } catch (Exception unused) {
                            }
                            if (z) {
                                runnableC0706oO000oO = new RunnableC0706oO000oO(c0792oO0Oo0Oo, 2);
                            } else {
                                c0792oO0Oo0Oo.Oooo0oo(true);
                                runnableC0706oO000oO = new RunnableC0706oO000oO(c0792oO0Oo0Oo, 2);
                            }
                        }
                    } catch (Throwable th) {
                        handler.post(new RunnableC0706oO000oO(c0792oO0Oo0Oo, 2));
                        throw th;
                    }
                } catch (Exception unused2) {
                    runnableC0706oO000oO = new RunnableC0706oO000oO(c0792oO0Oo0Oo, 2);
                }
                handler.post(runnableC0706oO000oO);
                return;
            case 7:
                Handler handler2 = c0792oO0Oo0Oo.Ooooo00;
                try {
                    if (!C0792oO0Oo0Oo.Oooo0oO()) {
                        format = c0792oO0Oo0Oo.OooOOO0(R.string.no_network_connection);
                    } else {
                        format = null;
                    }
                    if (format == null) {
                        try {
                            if (!c0792oO0Oo0Oo.OoooOoO()) {
                                handler2.post(new RunnableC0706oO000oO(c0792oO0Oo0Oo, 0));
                                return;
                            }
                        } catch (Exception unused3) {
                            format = c0792oO0Oo0Oo.OooOOO0(R.string.no_network_connection);
                        }
                    }
                    if (format == null) {
                        C0952oOO0oOOO OooO00o = AbstractC0953oOO0oOOo.OooO00o(c0792oO0Oo0Oo.Oooo000().getApplicationContext());
                        int i = OooO00o.OooO00o;
                        String str = OooO00o.OooO0O0;
                        if (i == 2) {
                            format = c0792oO0Oo0Oo.OooOOO0(R.string.version_unsupported);
                        } else if (i == 3 && ("auth".equals(str) || "no-credentials".equals(str))) {
                            handler2.post(new RunnableC0706oO000oO(c0792oO0Oo0Oo, 1));
                            return;
                        }
                    }
                    if (format == null) {
                        if (!c0792oO0Oo0Oo.Oooo0oo(false)) {
                            format = c0792oO0Oo0Oo.OooOOO0(R.string.setup_failed);
                        } else if (!c0792oO0Oo0Oo.OoooO()) {
                            format = c0792oO0Oo0Oo.OooOOO0(R.string.failed_to_start);
                        } else {
                            handler2.postDelayed(new RunnableC0706oO000oO(c0792oO0Oo0Oo, 4), 1000L);
                        }
                    }
                } catch (Exception e) {
                    format = String.format(c0792oO0Oo0Oo.OooOOO0(R.string.launch_error), e.getMessage());
                }
                handler2.post(new RunnableC0090o000OoOO(c0792oO0Oo0Oo, 5, format));
                return;
            default:
                if (c0792oO0Oo0Oo.OooOOOo()) {
                    MainActivity.OooO00o.edit().remove("user-status").apply();
                    c0792oO0Oo0Oo.Oooo000().recreate();
                    return;
                }
                return;
        }
    }
}


