package com.ninja.engine.view.update;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
import androidx.core.content.FileProvider;
import com.google.android.material.progressindicator.LinearProgressIndicator;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC0809oO0OooOO;
import com.ninja.engine.AbstractC0955oOO0oOoO;
import com.ninja.engine.R;
import com.ninja.engine.View$OnClickListenerC0056OoooooO;
import com.ninja.engine.o000OO00;
import java.io.File;
/* loaded from: classes.dex */
public final class UpdateRequiredActivity extends o000OO00 {
    public static final /* synthetic */ int Oooo000 = 0;
    public File OooOo;
    public String OooOoO = "";
    public boolean OooOoO0;
    public Button OooOoOO;
    public View OooOoo;
    public boolean OooOoo0;
    public LinearProgressIndicator OooOooO;
    public TextView OooOooo;

    public static final void Oooo000(o000OO00 o000oo00, String str, String str2, String str3) {
        AbstractC0809oO0OooOO.OooOOOo(str, "currentVersion");
        AbstractC0809oO0OooOO.OooOOOo(str3, "url");
        Intent addFlags = new Intent(o000oo00, UpdateRequiredActivity.class).putExtra("current", str).putExtra("new", str2).putExtra("url", str3).addFlags(335544320);
        AbstractC0809oO0OooOO.OooOOOO(addFlags, "addFlags(...)");
        o000oo00.startActivity(addFlags);
    }

    public final void OooOoo(File file) {
        try {
            String packageName = getPackageName();
            Intent data = new Intent("android.intent.action.INSTALL_PACKAGE").addFlags(1).addFlags(67108864).putExtra("android.intent.extra.NOT_UNKNOWN_SOURCE", true).setData(FileProvider.OooO0Oo(this, packageName + ".provider", file));
            AbstractC0809oO0OooOO.OooOOOO(data, "setData(...)");
            startActivity(data);
        } catch (Exception unused) {
            Toast.makeText(this, getString(R.string.something_went_wrong), 0).show();
        }
    }

    public final void OooOoo0() {
        View view = this.OooOoo;
        if (view == null) {
            AbstractC0809oO0OooOO.o00oO0o("progressContainer");
            throw null;
        }
        view.setVisibility(8);
        LinearProgressIndicator linearProgressIndicator = this.OooOooO;
        if (linearProgressIndicator == null) {
            AbstractC0809oO0OooOO.o00oO0o("progressBar");
            throw null;
        }
        linearProgressIndicator.setProgress(0);
        TextView textView = this.OooOooo;
        if (textView != null) {
            textView.setText("0%");
        } else {
            AbstractC0809oO0OooOO.o00oO0o("progressPercent");
            throw null;
        }
    }

    public final void OooOooO() {
        Button button;
        int i;
        File file = this.OooOo;
        if (file == null || !file.exists() || file.length() <= 0) {
            button = this.OooOoOO;
            if (button == null) {
                AbstractC0809oO0OooOO.o00oO0o("downloadBtn");
                throw null;
            }
            i = R.string.update_download_btn;
        } else {
            button = this.OooOoOO;
            if (button == null) {
                AbstractC0809oO0OooOO.o00oO0o("downloadBtn");
                throw null;
            }
            i = R.string.update_install_btn;
        }
        button.setText(i);
    }

    public final void OooOooo(int i) {
        View view = this.OooOoo;
        if (view == null) {
            AbstractC0809oO0OooOO.o00oO0o("progressContainer");
            throw null;
        }
        view.setVisibility(0);
        LinearProgressIndicator linearProgressIndicator = this.OooOooO;
        if (linearProgressIndicator == null) {
            AbstractC0809oO0OooOO.o00oO0o("progressBar");
            throw null;
        }
        linearProgressIndicator.setIndeterminate(false);
        LinearProgressIndicator linearProgressIndicator2 = this.OooOooO;
        if (linearProgressIndicator2 == null) {
            AbstractC0809oO0OooOO.o00oO0o("progressBar");
            throw null;
        }
        linearProgressIndicator2.setProgress(i);
        TextView textView = this.OooOooo;
        if (textView == null) {
            AbstractC0809oO0OooOO.o00oO0o("progressPercent");
            throw null;
        }
        textView.setText(i + "%");
    }

    @Override // com.ninja.engine.o000OO00, android.app.Activity, android.view.ContextThemeWrapper, android.content.ContextWrapper
    public final void attachBaseContext(Context context) {
        AbstractC0809oO0OooOO.OooOOOo(context, "newBase");
        super.attachBaseContext(AbstractC0692o0ooooOo.OooO0o(context));
    }

    @Override // com.ninja.engine.o000OO00, androidx.activity.OooO00o, com.ninja.engine.AbstractActivityC0301o0O0Oo0, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        OooOOO0().OooO00o(this, new AbstractC0955oOO0oOoO(true));
        setFinishOnTouchOutside(false);
        setContentView(R.layout.dialog_update);
        String stringExtra = getIntent().getStringExtra("current");
        String str = "";
        if (stringExtra == null) {
            stringExtra = "";
        }
        String stringExtra2 = getIntent().getStringExtra("new");
        if (stringExtra2 == null) {
            stringExtra2 = "";
        }
        String stringExtra3 = getIntent().getStringExtra("url");
        if (stringExtra3 != null) {
            str = stringExtra3;
        }
        this.OooOoO = str;
        ((TextView) findViewById(R.id.update_current_version)).setText("v".concat(stringExtra));
        ((TextView) findViewById(R.id.update_new_version)).setText("v".concat(stringExtra2));
        View findViewById = findViewById(R.id.update_progress_container);
        AbstractC0809oO0OooOO.OooOOOO(findViewById, "findViewById(...)");
        this.OooOoo = findViewById;
        View findViewById2 = findViewById(R.id.update_progress_bar);
        AbstractC0809oO0OooOO.OooOOOO(findViewById2, "findViewById(...)");
        this.OooOooO = (LinearProgressIndicator) findViewById2;
        View findViewById3 = findViewById(R.id.update_progress_percent);
        AbstractC0809oO0OooOO.OooOOOO(findViewById3, "findViewById(...)");
        this.OooOooo = (TextView) findViewById3;
        View findViewById4 = findViewById(R.id.update_download_btn);
        AbstractC0809oO0OooOO.OooOOOO(findViewById4, "findViewById(...)");
        Button button = (Button) findViewById4;
        this.OooOoOO = button;
        button.setOnClickListener(new View$OnClickListenerC0056OoooooO(9, this));
        OooOooO();
    }

    @Override // com.ninja.engine.o000OO00, android.app.Activity
    public final void onResume() {
        boolean canRequestPackageInstalls;
        super.onResume();
        if (this.OooOoO0) {
            canRequestPackageInstalls = getPackageManager().canRequestPackageInstalls();
            if (canRequestPackageInstalls) {
                this.OooOoO0 = false;
                File file = this.OooOo;
                if (file != null && file.exists() && file.length() > 0) {
                    OooOoo(file);
                }
            }
        }
        OooOooO();
    }
}
