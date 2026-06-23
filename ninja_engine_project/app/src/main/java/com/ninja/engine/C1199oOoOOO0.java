package com.ninja.engine;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.widget.TextView;
import java.util.TimerTask;
/* renamed from: com.ninja.engine.oOoOOO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1199oOoOOO0 extends TimerTask {
    public final /* synthetic */ TextView OooO00o;
    public final /* synthetic */ TextView OooO0O0;
    public final /* synthetic */ TextView OooO0OO;
    public final /* synthetic */ TextView OooO0Oo;
    public final /* synthetic */ TextView OooO0o;
    public final /* synthetic */ ActivityManager OooO0o0;
    public final /* synthetic */ C1201oOoOOO0O OooO0oO;

    public C1199oOoOOO0(C1201oOoOOO0O c1201oOoOOO0O, TextView textView, TextView textView2, TextView textView3, TextView textView4, ActivityManager activityManager, TextView textView5) {
        this.OooO0oO = c1201oOoOOO0O;
        this.OooO00o = textView;
        this.OooO0O0 = textView2;
        this.OooO0OO = textView3;
        this.OooO0Oo = textView4;
        this.OooO0o0 = activityManager;
        this.OooO0o = textView5;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        C1201oOoOOO0O c1201oOoOOO0O = this.OooO0oO;
        if (c1201oOoOOO0O.OooO0oO() == null) {
            return;
        }
        o000OO00 Oooo000 = c1201oOoOOO0O.Oooo000();
        final TextView textView = this.OooO00o;
        final TextView textView2 = this.OooO0O0;
        final TextView textView3 = this.OooO0OO;
        final TextView textView4 = this.OooO0Oo;
        final ActivityManager activityManager = this.OooO0o0;
        final TextView textView5 = this.OooO0o;
        Oooo000.runOnUiThread(new Runnable() { // from class: com.ninja.engine.oOoOOO00
            @Override // java.lang.Runnable
            public final void run() {
                long parseLong;
                String valueOf;
                String valueOf2;
                String valueOf3;
                String valueOf4;
                C1201oOoOOO0O c1201oOoOOO0O2 = C1199oOoOOO0.this.OooO0oO;
                if (c1201oOoOOO0O2.OooO0oO() != null) {
                    float parseLong2 = (float) (c1201oOoOOO0O2.OoooOO0 - Long.parseLong(String.valueOf(System.currentTimeMillis()).substring(0, String.valueOf(System.currentTimeMillis()).length() - 3)));
                    long abs = (long) Math.abs(Math.floor(parseLong2 / 86400.0f));
                    long abs2 = (long) Math.abs(Math.floor((parseLong2 / 3600.0f) % 24.0f));
                    long abs3 = (long) Math.abs(Math.floor((parseLong2 / 60.0f) % 60.0f));
                    long abs4 = (long) Math.abs(Math.floor(parseLong % 60));
                    if (abs < 10) {
                        valueOf = "0" + abs;
                    } else {
                        valueOf = String.valueOf(abs);
                    }
                    TextView textView6 = textView;
                    textView6.setText(valueOf);
                    if (abs2 < 10) {
                        valueOf2 = "0" + abs2;
                    } else {
                        valueOf2 = String.valueOf(abs2);
                    }
                    TextView textView7 = textView2;
                    textView7.setText(valueOf2);
                    if (abs3 < 10) {
                        valueOf3 = "0" + abs3;
                    } else {
                        valueOf3 = String.valueOf(abs3);
                    }
                    TextView textView8 = textView3;
                    textView8.setText(valueOf3);
                    if (abs4 < 10) {
                        valueOf4 = "0" + abs4;
                    } else {
                        valueOf4 = String.valueOf(abs4);
                    }
                    TextView textView9 = textView4;
                    textView9.setText(valueOf4);
                    if (textView6.getText().equals("00") && textView7.getText().equals("00") && textView8.getText().equals("00") && textView9.getText().equals("00")) {
                        activityManager.killBackgroundProcesses("com.miniclip.eightballpool");
                        SharedPreferences sharedPreferences = MainActivity.OooO00o;
                        if (sharedPreferences != null) {
                            sharedPreferences.edit().remove("user-status").apply();
                        }
                        TextView textView10 = textView5;
                        textView10.setText(R.string.status_expired);
                        textView10.setTextColor(-44462);
                        c1201oOoOOO0O2.Oooo000().recreate();
                    }
                }
            }
        });
    }
}
