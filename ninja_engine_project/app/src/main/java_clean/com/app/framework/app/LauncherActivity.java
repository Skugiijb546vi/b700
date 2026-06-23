package com.app.framework.app;

import android.app.Activity;
import android.content.Intent;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.animation.DecelerateInterpolator;
import android.view.animation.OvershootInterpolator;
import android.widget.ImageView;
import android.widget.TextView;
import com.app.framework.BlackBoxCore;
import com.app.framework.R;
import com.ninja.engine.RunnableC0061o00000oO;
import com.ninja.engine.RunnableC0381o0OOo0Oo;
/* loaded from: classes.dex */
public class LauncherActivity extends Activity {
    public static final String KEY_INTENT = "launch_intent";
    public static final String KEY_PKG = "launch_pkg";
    public static final String KEY_USER_ID = "launch_user_id";
    public static final String TAG = "SplashScreen";
    private boolean isRunning = false;

    private PackageInfo getPackageInfoWithFallback(String str, int i) {
        try {
            return BlackBoxCore.getBPackageManager().getPackageInfo(str, 0, i);
        } catch (Exception e) {
            e.getMessage();
            try {
                return BlackBoxCore.getBPackageManager().getPackageInfo(str, 128, i);
            } catch (Exception e2) {
                e2.getMessage();
                try {
                    ApplicationInfo applicationInfo = BlackBoxCore.getBPackageManager().getApplicationInfo(str, 0, i);
                    if (applicationInfo != null) {
                        PackageInfo packageInfo = new PackageInfo();
                        packageInfo.packageName = str;
                        packageInfo.applicationInfo = applicationInfo;
                        packageInfo.versionCode = 1;
                        packageInfo.versionName = "1.0";
                        packageInfo.firstInstallTime = System.currentTimeMillis();
                        packageInfo.lastUpdateTime = System.currentTimeMillis();
                        return packageInfo;
                    }
                    return null;
                } catch (Exception e3) {
                    e3.getMessage();
                    return null;
                }
            }
        }
    }

    public static /* synthetic */ void lambda$launchAppAsync$1(Exception exc) {
        try {
            exc.getMessage();
        } catch (Exception unused) {
        }
    }

    public /* synthetic */ void lambda$launchAppAsync$2(Intent intent, int i) {
        try {
            Thread.sleep(100L);
            BlackBoxCore.getBActivityManager().startActivity(intent, i);
        } catch (Exception e) {
            runOnUiThread(new RunnableC0061o00000oO(13, e));
        }
    }

    public static /* synthetic */ void lambda$onCreate$0(ImageView imageView) {
        imageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(150L).setInterpolator(new DecelerateInterpolator()).start();
    }

    public static void launch(Intent intent, int i) {
        try {
            Intent intent2 = new Intent();
            intent2.setClass(BlackBoxCore.getContext(), LauncherActivity.class);
            intent2.setFlags(268435456);
            intent2.putExtra(KEY_INTENT, intent);
            intent2.putExtra(KEY_PKG, intent.getPackage());
            intent2.putExtra(KEY_USER_ID, i);
            BlackBoxCore.getContext().startActivity(intent2);
            intent.getPackage();
        } catch (Exception unused) {
        }
    }

    private void launchAppAsync(Intent intent, int i) {
        new Thread(new RunnableC0381o0OOo0Oo(this, intent, i), "AppLaunchThread").start();
    }

    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        try {
            super.onCreate(bundle);
            Intent intent = getIntent();
            if (intent == null) {
                finish();
                return;
            }
            Intent intent2 = (Intent) intent.getParcelableExtra(KEY_INTENT);
            String stringExtra = intent.getStringExtra(KEY_PKG);
            int intExtra = intent.getIntExtra(KEY_USER_ID, 0);
            if (intent2 != null && stringExtra != null) {
                PackageInfo packageInfoWithFallback = getPackageInfoWithFallback(stringExtra, intExtra);
                Drawable drawable = null;
                if (packageInfoWithFallback != null) {
                    try {
                        if (packageInfoWithFallback.applicationInfo != null) {
                            PackageManager packageManager = getPackageManager();
                            drawable = packageManager.getApplicationIcon(packageInfoWithFallback.applicationInfo);
                            CharSequence applicationLabel = packageManager.getApplicationLabel(packageInfoWithFallback.applicationInfo);
                            if (applicationLabel != null) {
                                stringExtra = applicationLabel.toString();
                            }
                        }
                    } catch (Exception e) {
                        e.getMessage();
                    }
                }
                setContentView(R.layout.activity_launcher);
                ImageView imageView = (ImageView) findViewById(R.id.iv_icon);
                TextView textView = (TextView) findViewById(R.id.tv_app_name);
                if (textView != null) {
                    textView.setText(stringExtra);
                    textView.setAlpha(0.0f);
                    textView.animate().alpha(1.0f).setDuration(500L).setStartDelay(200L).start();
                }
                if (imageView != null && drawable != null) {
                    imageView.setImageDrawable(drawable);
                    imageView.setScaleX(0.7f);
                    imageView.setScaleY(0.7f);
                    imageView.setAlpha(0.0f);
                    imageView.animate().scaleX(1.1f).scaleY(1.1f).alpha(1.0f).setDuration(350L).setInterpolator(new OvershootInterpolator()).withEndAction(new RunnableC0061o00000oO(12, imageView)).start();
                }
                launchAppAsync(intent2, intExtra);
                return;
            }
            finish();
        } catch (Exception unused) {
            finish();
        }
    }

    @Override // android.app.Activity
    public void onPause() {
        super.onPause();
        this.isRunning = true;
    }

    @Override // android.app.Activity
    public void onResume() {
        super.onResume();
        if (this.isRunning) {
            finish();
        }
    }
}


