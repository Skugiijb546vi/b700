package com.ninja.engine;

import android.app.AlertDialog;
import android.content.Intent;
import android.content.SharedPreferences;
import android.net.Uri;
import android.os.Environment;
import android.text.Editable;
import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.webkit.URLUtil;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;
import com.app.framework.core.system.user.BUserHandle;
import com.ninja.engine.view.update.UpdateRequiredActivity;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Timer;
/* renamed from: com.ninja.engine.OoooooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class View$OnClickListenerC0056OoooooO implements View.OnClickListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ View$OnClickListenerC0056OoooooO(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    /* JADX WARN: Type inference failed for: r6v8, types: [com.ninja.engine.o0Oo0O0, java.lang.Object] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        String str;
        boolean canRequestPackageInstalls;
        switch (this.OooO00o) {
            case 0:
                C1741ooOO c1741ooOO = (C1741ooOO) this.OooO0O0;
                C0054Oooooo c0054Oooooo = c1741ooOO.OoooOO0;
                c0054Oooooo.getClass();
                Iterator it = new ArrayList(c0054Oooooo.OooO0OO).iterator();
                int i = 0;
                while (it.hasNext()) {
                    String str2 = ((o00O0O) it.next()).OooO0O0;
                    int i2 = 8;
                    if (!str2.startsWith("Profile ") && !str2.startsWith("Account ")) {
                        i2 = 0;
                    }
                    if (i2 > 0) {
                        try {
                            int parseInt = Integer.parseInt(str2.substring(i2).trim());
                            if (parseInt > i) {
                                i = parseInt;
                            }
                        } catch (NumberFormatException unused) {
                        }
                    }
                }
                int i3 = i + 1;
                C0054Oooooo c0054Oooooo2 = c1741ooOO.OoooOO0;
                c0054Oooooo2.getClass();
                Iterator it2 = new ArrayList(c0054Oooooo2.OooO0OO).iterator();
                int i4 = -1;
                while (it2.hasNext()) {
                    int i5 = ((o00O0O) it2.next()).OooO0o0;
                    if (i5 > i4) {
                        i4 = i5;
                    }
                }
                int i6 = i4 + 1;
                o00O0O o00o0o = new o00O0O("Google", AbstractC1230oOoOo0o.OooO0o(i3, "Profile "), "Ã¢â‚¬â€", i6);
                C0054Oooooo c0054Oooooo3 = c1741ooOO.OoooOO0;
                ArrayList arrayList = c0054Oooooo3.OooO0OO;
                arrayList.add(o00o0o);
                c0054Oooooo3.OooO00o.OooO0Oo(arrayList.size() - 1);
                c1741ooOO.Oooo0o();
                new Thread(new RunnableC0057Ooooooo(i6, 0), "CreateVirtualUser").start();
                return;
            case 1:
                ((AlertDialog) this.OooO0O0).dismiss();
                return;
            case 2:
                C0293o0O00o0o c0293o0O00o0o = (C0293o0O00o0o) this.OooO0O0;
                EditText editText = c0293o0O00o0o.OooO;
                if (editText == null) {
                    return;
                }
                Editable text = editText.getText();
                if (text != null) {
                    text.clear();
                }
                c0293o0O00o0o.OooOOo0();
                return;
            case 3:
                ((C0434o0OoO0) this.OooO0O0).OooOo0();
                return;
            case 4:
                C0792oO0Oo0Oo c0792oO0Oo0Oo = (C0792oO0Oo0Oo) this.OooO0O0;
                if (c0792oO0Oo0Oo.OoooOo0) {
                    return;
                }
                if (!c0792oO0Oo0Oo.OoooO0()) {
                    Toast.makeText(c0792oO0Oo0Oo.OooO(), c0792oO0Oo0Oo.OooOOO0(R.string.install_from_play_store), 1).show();
                    c0792oO0Oo0Oo.OoooOo0();
                    return;
                }
                String OooOOO0 = c0792oO0Oo0Oo.OooOOO0(R.string.launching_game);
                c0792oO0Oo0Oo.OoooOo0 = true;
                c0792oO0Oo0Oo.OoooOO0.setText(OooOOO0);
                c0792oO0Oo0Oo.OoooOOo.setEnabled(false);
                c0792oO0Oo0Oo.OoooOOo.setText(R.string.launching_btn);
                new Thread(new RunnableC0706oO000oO(c0792oO0Oo0Oo, 7), "HomeLaunchThread").start();
                return;
            case 5:
                ((DialogInterfaceC0074o0000oOO) this.OooO0O0).dismiss();
                return;
            case 6:
                ((C0864oO0oOo) this.OooO0O0).Oooo0oo();
                throw null;
            case 7:
                C0990oOOO0ooO c0990oOOO0ooO = (C0990oOOO0ooO) this.OooO0O0;
                EditText editText2 = c0990oOOO0ooO.OooO0o;
                if (editText2 == null) {
                    return;
                }
                int selectionEnd = editText2.getSelectionEnd();
                EditText editText3 = c0990oOOO0ooO.OooO0o;
                if (editText3 == null || !(editText3.getTransformationMethod() instanceof PasswordTransformationMethod)) {
                    c0990oOOO0ooO.OooO0o.setTransformationMethod(PasswordTransformationMethod.getInstance());
                } else {
                    c0990oOOO0ooO.OooO0o.setTransformationMethod(null);
                }
                if (selectionEnd >= 0) {
                    c0990oOOO0ooO.OooO0o.setSelection(selectionEnd);
                }
                c0990oOOO0ooO.OooOOo0();
                return;
            case 8:
                C1201oOoOOO0O c1201oOoOOO0O = (C1201oOoOOO0O) this.OooO0O0;
                c1201oOoOOO0O.getClass();
                try {
                    SharedPreferences sharedPreferences = MainActivity.OooO00o;
                    if (sharedPreferences != null) {
                        sharedPreferences.edit().clear().apply();
                    }
                    Timer timer = c1201oOoOOO0O.o000oOoO;
                    if (timer != null) {
                        timer.cancel();
                    }
                    Intent launchIntentForPackage = c1201oOoOOO0O.Oooo000().getPackageManager().getLaunchIntentForPackage(c1201oOoOOO0O.Oooo000().getPackageName());
                    if (launchIntentForPackage != null) {
                        launchIntentForPackage.addFlags(335544320);
                        c1201oOoOOO0O.Oooo0o0(launchIntentForPackage);
                        c1201oOoOOO0O.Oooo000().finish();
                        return;
                    }
                    return;
                } catch (Exception unused2) {
                    return;
                }
            default:
                int i7 = UpdateRequiredActivity.Oooo000;
                UpdateRequiredActivity updateRequiredActivity = (UpdateRequiredActivity) this.OooO0O0;
                AbstractC0809oO0OooOO.OooOOOo(updateRequiredActivity, "this$0");
                File file = updateRequiredActivity.OooOo;
                if (file != null && file.exists() && file.length() > 0) {
                    canRequestPackageInstalls = updateRequiredActivity.getPackageManager().canRequestPackageInstalls();
                    if (canRequestPackageInstalls) {
                        updateRequiredActivity.OooOoo(file);
                        return;
                    }
                    updateRequiredActivity.OooOoO0 = true;
                    String packageName = updateRequiredActivity.getPackageName();
                    updateRequiredActivity.startActivity(new Intent("android.settings.MANAGE_UNKNOWN_APP_SOURCES", Uri.parse("package:" + packageName)));
                    return;
                } else if (updateRequiredActivity.OooOoo0) {
                    return;
                } else {
                    Button button = updateRequiredActivity.OooOoOO;
                    if (button != null) {
                        String str3 = "update.apk";
                        String obj = AbstractC1268oOoo0O0O.Oooo000(updateRequiredActivity.OooOoO).toString();
                        if (obj.length() != 0 && (obj.startsWith("http://") || obj.startsWith("https://"))) {
                            try {
                                updateRequiredActivity.OooOoo0 = true;
                                button.setClickable(false);
                                button.setEnabled(false);
                                updateRequiredActivity.OooOooo(0);
                                try {
                                    str = URLUtil.guessFileName(obj, null, null);
                                } catch (Exception unused3) {
                                    str = "update.apk";
                                }
                                AbstractC0809oO0OooOO.OooOO0o(str);
                                if (!AbstractC1268oOoo0O0O.OooOoo(str)) {
                                    str3 = str;
                                }
                                File externalFilesDir = updateRequiredActivity.getExternalFilesDir(Environment.DIRECTORY_DOWNLOADS);
                                if (externalFilesDir == null) {
                                    throw new IllegalStateException("External files dir is null");
                                }
                                File file2 = new File(externalFilesDir, "update");
                                if (!file2.exists() && !file2.mkdirs()) {
                                    throw new IllegalStateException("Failed to create download dir");
                                }
                                File file3 = new File(file2, str3);
                                if (file3.exists() && file3.length() > 0) {
                                    updateRequiredActivity.OooOo = file3;
                                    updateRequiredActivity.runOnUiThread(new RunnableC0061o00000oO(20, updateRequiredActivity));
                                    updateRequiredActivity.OooOoo0 = false;
                                    return;
                                }
                                String absolutePath = file2.getAbsolutePath();
                                C0413o0Oo0O0 obj2 = new C0413o0Oo0O0();
                                obj2.OooO00o = obj;
                                obj2.OooO0O0 = absolutePath;
                                obj2.OooO0OO = str3;
                                C0303o0O0Oo0o c0303o0O0Oo0o = C0303o0O0Oo0o.OooO0o;
                                if (c0303o0O0Oo0o.OooO00o == 0) {
                                    synchronized (C0303o0O0Oo0o.class) {
                                        if (c0303o0O0Oo0o.OooO00o == 0) {
                                            c0303o0O0Oo0o.OooO00o = BUserHandle.AID_CACHE_GID_START;
                                        }
                                    }
                                }
                                obj2.OooO0oO = c0303o0O0Oo0o.OooO00o;
                                obj2.OooO0oo = C0413o0Oo0O0.OooO0OO();
                                obj2.OooO = null;
                                obj2.OooOO0 = new C0709oO000oOo(button, updateRequiredActivity);
                                obj2.OooO0Oo(new C0131o00O0o(updateRequiredActivity, file3, button, 20));
                                return;
                            } catch (Exception unused4) {
                                updateRequiredActivity.OooOoo0 = false;
                                updateRequiredActivity.OooOoo0();
                                Toast.makeText(updateRequiredActivity, updateRequiredActivity.getString(R.string.something_went_wrong), 0).show();
                                button.setClickable(true);
                                button.setEnabled(true);
                                return;
                            }
                        }
                        Toast.makeText(updateRequiredActivity, updateRequiredActivity.getString(R.string.link_not_available_now), 0).show();
                        return;
                    }
                    AbstractC0809oO0OooOO.o00oO0o("downloadBtn");
                    throw null;
                }
        }
    }
}



