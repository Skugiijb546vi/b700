package com.ninja.engine;

import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import androidx.recyclerview.widget.RecyclerView;
import com.app.framework.BlackBoxCore;
import com.app.framework.app.FacebookWebViewActivity;
import com.app.framework.app.GoogleSignInHelper;
import com.app.framework.core.env.BEnvironment;
import com.google.android.material.button.MaterialButton;
import java.io.File;
import java.io.FileInputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
/* renamed from: com.ninja.engine.Oooooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0054Oooooo extends AbstractC1061oOOo0O0O {
    public static final String FACEBOOK_OAUTH_URL = "https://www.facebook.com/dialog/oauth?client_id=165073083517174&redirect_uri=" + Uri.encode("fbconnect://cct.com.miniclip.eightballpool") + "&scope=public_profile,email&response_type=token,signed_request,graph_domain&sdk=android";
    public C0331o0O0oo OooO0o;
    public final ArrayList OooO0OO = new ArrayList();
    public int OooO0Oo = -1;
    public int OooO0o0 = -1;

    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    public final int OooO00o() {
        return this.OooO0OO.size();
    }

    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    public final AbstractC1083oOOoO0o OooO0o(RecyclerView recyclerView, int i) {
        return new C0055Oooooo0(this, LayoutInflater.from(recyclerView.getContext()).inflate(R.layout.item_account_card, (ViewGroup) recyclerView, false));
    }

    @Override // com.ninja.engine.AbstractC1061oOOo0O0O
    public final void OooO0o0(AbstractC1083oOOoO0o abstractC1083oOOoO0o, int i) {
        boolean z;
        int i2;
        boolean z2;
        boolean z3;
        boolean z4;
        int i3;
        byte[] bArr;
        final C0055Oooooo0 c0055Oooooo0 = (C0055Oooooo0) abstractC1083oOOoO0o;
        o00O0O o00o0o = (o00O0O) this.OooO0OO.get(i);
        if (i == this.OooO0Oo) {
            z = true;
        } else {
            z = false;
        }
        String str = o00o0o.OooO0O0;
        int i4 = o00o0o.OooO0o0;
        c0055Oooooo0.OooOo.setText(str);
        if (i == c0055Oooooo0.OooOooo.OooO0o0) {
            i2 = 0;
        } else {
            i2 = 8;
        }
        c0055Oooooo0.OooOo0O.setVisibility(i2);
        Context context = c0055Oooooo0.OooO00o.getContext();
        try {
            String hostPkg = BlackBoxCore.getHostPkg();
            if (hostPkg == null || hostPkg.isEmpty()) {
                hostPkg = context.getPackageName();
            }
            File filesDir = context.createPackageContext(hostPkg, 2).getFilesDir();
            z2 = new File(filesDir, "gsi_cached_token_u" + i4).exists();
        } catch (Exception unused) {
            z2 = false;
        }
        try {
            z3 = new File(BEnvironment.getDataDir("com.miniclip.eightballpool", i4), "shared_prefs/com.facebook.AccessTokenManager.SharedPreferences.xml").exists();
        } catch (Exception unused2) {
            z3 = false;
        }
        try {
            File file = new File(new File(BEnvironment.getDataDir("com.miniclip.eightballpool", i4), "files"), "Contents/Documents/__user_defaults__");
            File file2 = new File(file, "__default__.plist");
            File file3 = new File(file, "56.22.0.plist");
            file2.getAbsolutePath();
            file2.exists();
            if (file2.exists()) {
                file2.length();
            }
            if (file2.exists() || file3.exists()) {
                if (!file2.exists()) {
                    file2 = file3;
                }
                if (file2.length() >= 180) {
                    try {
                        FileInputStream fileInputStream = new FileInputStream(file2);
                        bArr = new byte[(int) file2.length()];
                        fileInputStream.read(bArr);
                        fileInputStream.close();
                    } catch (Exception unused3) {
                        bArr = null;
                    }
                    if (bArr != null) {
                        Matcher matcher = Pattern.compile("(\\d{8,12})").matcher(new String(bArr, StandardCharsets.UTF_8));
                        while (matcher.find()) {
                            String group = matcher.group(1);
                            if (!group.startsWith("20") && !group.startsWith("19") && !group.startsWith("56")) {
                                z4 = true;
                                break;
                            }
                        }
                    }
                }
            }
        } catch (Exception unused4) {
        }
        z4 = false;
        MaterialButton materialButton = c0055Oooooo0.OooOoo0;
        C0055Oooooo0.OooOo00(materialButton, context, z2);
        MaterialButton materialButton2 = c0055Oooooo0.OooOoo;
        C0055Oooooo0.OooOo00(materialButton2, context, z3);
        C0055Oooooo0.OooOo00(c0055Oooooo0.OooOooO, context, z4);
        View view = c0055Oooooo0.OooOo00;
        View view2 = c0055Oooooo0.OooOo0o;
        MaterialButton materialButton3 = c0055Oooooo0.OooOoO;
        if (z) {
            view.setBackgroundResource(R.drawable.bg_account_card_active);
            view2.setBackgroundColor(-6467875);
            view2.setVisibility(0);
            materialButton3.setText(R.string.active_account);
            materialButton3.setEnabled(false);
            i3 = -11920789;
        } else {
            view.setBackgroundResource(R.drawable.bg_account_card_inactive);
            view2.setBackgroundColor(16777215);
            view2.setVisibility(4);
            materialButton3.setText(R.string.use_account);
            materialButton3.setEnabled(true);
            i3 = -8507778;
        }
        materialButton3.setBackgroundColor(i3);
        c0055Oooooo0.OooOo0.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.OooooOo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                final int OooO0OO;
                int OooO0OO2;
                int OooO0OO3;
                int i5;
                int OooO0OO4;
                int OooO0OO5;
                int r2 = 0; switch (r2) {
                    case 0:
                        C0055Oooooo0 c0055Oooooo02 = c0055Oooooo0;
                        int OooO0OO6 = c0055Oooooo02.OooO0OO();
                        if (OooO0OO6 >= 0) {
                            C0054Oooooo c0054Oooooo = c0055Oooooo02.OooOooo;
                            if (OooO0OO6 < c0054Oooooo.OooO0OO.size()) {
                                int i6 = c0054Oooooo.OooO0o0;
                                if (i6 == OooO0OO6) {
                                    c0054Oooooo.OooO0o0 = -1;
                                } else {
                                    c0054Oooooo.OooO0o0 = OooO0OO6;
                                    ArrayList arrayList = c0054Oooooo.OooO0OO;
                                    if (i6 >= 0 && i6 < arrayList.size()) {
                                        c0054Oooooo.OooO0Oo(i6);
                                    }
                                    if (OooO0OO6 < 0 || OooO0OO6 >= arrayList.size()) {
                                        return;
                                    }
                                }
                                c0054Oooooo.OooO0Oo(OooO0OO6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        C0055Oooooo0 c0055Oooooo03 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo2 = c0055Oooooo03.OooOooo;
                        if (c0054Oooooo2.OooO0o != null && (OooO0OO = c0055Oooooo03.OooO0OO()) >= 0) {
                            ArrayList arrayList2 = c0054Oooooo2.OooO0OO;
                            if (OooO0OO < arrayList2.size()) {
                                final C1741ooOO c1741ooOO = (C1741ooOO) c0054Oooooo2.OooO0o.OooO0O0;
                                View inflate = LayoutInflater.from(c1741ooOO.Oooo000()).inflate(R.layout.dialog_rename_account, (ViewGroup) null);
                                final EditText editText = (EditText) inflate.findViewById(R.id.et_rename);
                                MaterialButton materialButton4 = (MaterialButton) inflate.findViewById(R.id.btn_save);
                                MaterialButton materialButton5 = (MaterialButton) inflate.findViewById(R.id.btn_cancel);
                                editText.setText(((o00O0O) arrayList2.get(OooO0OO)).OooO0O0);
                                editText.setSelection(editText.getText().length());
                                final AlertDialog create = new AlertDialog.Builder(c1741ooOO.Oooo000()).setView(inflate).setCancelable(true).create();
                                if (create.getWindow() != null) {
                                    create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                                }
                                materialButton4.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.o0OoOo0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view4) {
                                        C1741ooOO c1741ooOO2 = c1741ooOO;
                                        c1741ooOO2.getClass();
                                        String trim = editText.getText().toString().trim();
                                        if (!trim.isEmpty()) {
                                            C0054Oooooo c0054Oooooo3 = c1741ooOO2.OoooOO0;
                                            int i7 = OooO0OO;
                                            if (i7 >= 0) {
                                                ArrayList arrayList3 = c0054Oooooo3.OooO0OO;
                                                if (i7 < arrayList3.size()) {
                                                    ((o00O0O) arrayList3.get(i7)).OooO0O0 = trim;
                                                    c0054Oooooo3.OooO0Oo(i7);
                                                }
                                            } else {
                                                c0054Oooooo3.getClass();
                                            }
                                            c1741ooOO2.Oooo0o();
                                        }
                                        create.dismiss();
                                    }
                                });
                                materialButton5.setOnClickListener(new View$OnClickListenerC0056OoooooO(1, create));
                                create.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        C0055Oooooo0 c0055Oooooo04 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo3 = c0055Oooooo04.OooOooo;
                        if (c0054Oooooo3.OooO0o != null && (OooO0OO2 = c0055Oooooo04.OooO0OO()) >= 0) {
                            ArrayList arrayList3 = c0054Oooooo3.OooO0OO;
                            if (OooO0OO2 < arrayList3.size()) {
                                C0331o0O0oo c0331o0O0oo = c0054Oooooo3.OooO0o;
                                c0331o0O0oo.getClass();
                                int i7 = ((o00O0O) arrayList3.get(OooO0OO2)).OooO0o0;
                                C1741ooOO c1741ooOO2 = (C1741ooOO) c0331o0O0oo.OooO0O0;
                                c1741ooOO2.OoooOOO.edit().putInt("active_user_id", i7).apply();
                                GoogleSignInHelper.setActiveUserId(c1741ooOO2.Oooo000(), i7);
                                c1741ooOO2.OoooOO0.OooO0oO(OooO0OO2);
                                c1741ooOO2.Oooo0o();
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        C0055Oooooo0 c0055Oooooo05 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo4 = c0055Oooooo05.OooOooo;
                        if (c0054Oooooo4.OooO0o != null && (OooO0OO3 = c0055Oooooo05.OooO0OO()) >= 0) {
                            ArrayList arrayList4 = c0054Oooooo4.OooO0OO;
                            if (OooO0OO3 < arrayList4.size()) {
                                C0331o0O0oo c0331o0O0oo2 = c0054Oooooo4.OooO0o;
                                c0331o0O0oo2.getClass();
                                int i8 = ((o00O0O) arrayList4.get(OooO0OO3)).OooO0o0;
                                C1741ooOO c1741ooOO3 = (C1741ooOO) c0331o0O0oo2.OooO0O0;
                                C0054Oooooo c0054Oooooo5 = c1741ooOO3.OoooOO0;
                                if (OooO0OO3 >= 0) {
                                    ArrayList arrayList5 = c0054Oooooo5.OooO0OO;
                                    if (OooO0OO3 < arrayList5.size()) {
                                        int i9 = c0054Oooooo5.OooO0Oo;
                                        if (OooO0OO3 == i9) {
                                            i5 = -1;
                                        } else {
                                            if (OooO0OO3 < i9) {
                                                i5 = i9 - 1;
                                            }
                                            arrayList5.remove(OooO0OO3);
                                            c0054Oooooo5.OooO00o.OooO0o0(OooO0OO3);
                                        }
                                        c0054Oooooo5.OooO0Oo = i5;
                                        arrayList5.remove(OooO0OO3);
                                        c0054Oooooo5.OooO00o.OooO0o0(OooO0OO3);
                                    }
                                } else {
                                    c0054Oooooo5.getClass();
                                }
                                c1741ooOO3.Oooo0o();
                                new Thread(new RunnableC0057Ooooooo(i8, 1), "DeleteVirtualUser").start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        C0055Oooooo0 c0055Oooooo06 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo6 = c0055Oooooo06.OooOooo;
                        if (c0054Oooooo6.OooO0o != null && (OooO0OO4 = c0055Oooooo06.OooO0OO()) >= 0) {
                            ArrayList arrayList6 = c0054Oooooo6.OooO0OO;
                            if (OooO0OO4 < arrayList6.size()) {
                                C0331o0O0oo c0331o0O0oo3 = c0054Oooooo6.OooO0o;
                                o00O0O o00o0o2 = (o00O0O) arrayList6.get(OooO0OO4);
                                c0331o0O0oo3.getClass();
                                GoogleSignInHelper.setPendingUserId(o00o0o2.OooO0o0);
                                GoogleSignInHelper.launchWebViewSignIn(((C1741ooOO) c0331o0O0oo3.OooO0O0).Oooo000(), o00o0o2.OooO0o0);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        C0055Oooooo0 c0055Oooooo07 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo7 = c0055Oooooo07.OooOooo;
                        if (c0054Oooooo7.OooO0o != null && (OooO0OO5 = c0055Oooooo07.OooO0OO()) >= 0) {
                            ArrayList arrayList7 = c0054Oooooo7.OooO0OO;
                            if (OooO0OO5 < arrayList7.size()) {
                                C0331o0O0oo c0331o0O0oo4 = c0054Oooooo7.OooO0o;
                                o00O0O o00o0o3 = (o00O0O) arrayList7.get(OooO0OO5);
                                C1741ooOO c1741ooOO4 = (C1741ooOO) c0331o0O0oo4.OooO0O0;
                                c1741ooOO4.OoooOOO.edit().putInt("active_user_id", o00o0o3.OooO0o0).apply();
                                Intent intent = new Intent(c1741ooOO4.Oooo000(), FacebookWebViewActivity.class);
                                intent.putExtra(FacebookWebViewActivity.EXTRA_URL, FACEBOOK_OAUTH_URL);
                                intent.putExtra(FacebookWebViewActivity.EXTRA_USER_ID, o00o0o3.OooO0o0);
                                c1741ooOO4.Oooo000().startActivity(intent);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        c0055Oooooo0.OooOoO0.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.OooooOo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                final int OooO0OO;
                int OooO0OO2;
                int OooO0OO3;
                int i5;
                int OooO0OO4;
                int OooO0OO5;
                int r2 = 0; switch (r2) {
                    case 0:
                        C0055Oooooo0 c0055Oooooo02 = c0055Oooooo0;
                        int OooO0OO6 = c0055Oooooo02.OooO0OO();
                        if (OooO0OO6 >= 0) {
                            C0054Oooooo c0054Oooooo = c0055Oooooo02.OooOooo;
                            if (OooO0OO6 < c0054Oooooo.OooO0OO.size()) {
                                int i6 = c0054Oooooo.OooO0o0;
                                if (i6 == OooO0OO6) {
                                    c0054Oooooo.OooO0o0 = -1;
                                } else {
                                    c0054Oooooo.OooO0o0 = OooO0OO6;
                                    ArrayList arrayList = c0054Oooooo.OooO0OO;
                                    if (i6 >= 0 && i6 < arrayList.size()) {
                                        c0054Oooooo.OooO0Oo(i6);
                                    }
                                    if (OooO0OO6 < 0 || OooO0OO6 >= arrayList.size()) {
                                        return;
                                    }
                                }
                                c0054Oooooo.OooO0Oo(OooO0OO6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        C0055Oooooo0 c0055Oooooo03 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo2 = c0055Oooooo03.OooOooo;
                        if (c0054Oooooo2.OooO0o != null && (OooO0OO = c0055Oooooo03.OooO0OO()) >= 0) {
                            ArrayList arrayList2 = c0054Oooooo2.OooO0OO;
                            if (OooO0OO < arrayList2.size()) {
                                final C1741ooOO c1741ooOO = (C1741ooOO) c0054Oooooo2.OooO0o.OooO0O0;
                                View inflate = LayoutInflater.from(c1741ooOO.Oooo000()).inflate(R.layout.dialog_rename_account, (ViewGroup) null);
                                final EditText editText = (EditText) inflate.findViewById(R.id.et_rename);
                                MaterialButton materialButton4 = (MaterialButton) inflate.findViewById(R.id.btn_save);
                                MaterialButton materialButton5 = (MaterialButton) inflate.findViewById(R.id.btn_cancel);
                                editText.setText(((o00O0O) arrayList2.get(OooO0OO)).OooO0O0);
                                editText.setSelection(editText.getText().length());
                                final AlertDialog create = new AlertDialog.Builder(c1741ooOO.Oooo000()).setView(inflate).setCancelable(true).create();
                                if (create.getWindow() != null) {
                                    create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                                }
                                materialButton4.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.o0OoOo0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view4) {
                                        C1741ooOO c1741ooOO2 = c1741ooOO;
                                        c1741ooOO2.getClass();
                                        String trim = editText.getText().toString().trim();
                                        if (!trim.isEmpty()) {
                                            C0054Oooooo c0054Oooooo3 = c1741ooOO2.OoooOO0;
                                            int i7 = OooO0OO;
                                            if (i7 >= 0) {
                                                ArrayList arrayList3 = c0054Oooooo3.OooO0OO;
                                                if (i7 < arrayList3.size()) {
                                                    ((o00O0O) arrayList3.get(i7)).OooO0O0 = trim;
                                                    c0054Oooooo3.OooO0Oo(i7);
                                                }
                                            } else {
                                                c0054Oooooo3.getClass();
                                            }
                                            c1741ooOO2.Oooo0o();
                                        }
                                        create.dismiss();
                                    }
                                });
                                materialButton5.setOnClickListener(new View$OnClickListenerC0056OoooooO(1, create));
                                create.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        C0055Oooooo0 c0055Oooooo04 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo3 = c0055Oooooo04.OooOooo;
                        if (c0054Oooooo3.OooO0o != null && (OooO0OO2 = c0055Oooooo04.OooO0OO()) >= 0) {
                            ArrayList arrayList3 = c0054Oooooo3.OooO0OO;
                            if (OooO0OO2 < arrayList3.size()) {
                                C0331o0O0oo c0331o0O0oo = c0054Oooooo3.OooO0o;
                                c0331o0O0oo.getClass();
                                int i7 = ((o00O0O) arrayList3.get(OooO0OO2)).OooO0o0;
                                C1741ooOO c1741ooOO2 = (C1741ooOO) c0331o0O0oo.OooO0O0;
                                c1741ooOO2.OoooOOO.edit().putInt("active_user_id", i7).apply();
                                GoogleSignInHelper.setActiveUserId(c1741ooOO2.Oooo000(), i7);
                                c1741ooOO2.OoooOO0.OooO0oO(OooO0OO2);
                                c1741ooOO2.Oooo0o();
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        C0055Oooooo0 c0055Oooooo05 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo4 = c0055Oooooo05.OooOooo;
                        if (c0054Oooooo4.OooO0o != null && (OooO0OO3 = c0055Oooooo05.OooO0OO()) >= 0) {
                            ArrayList arrayList4 = c0054Oooooo4.OooO0OO;
                            if (OooO0OO3 < arrayList4.size()) {
                                C0331o0O0oo c0331o0O0oo2 = c0054Oooooo4.OooO0o;
                                c0331o0O0oo2.getClass();
                                int i8 = ((o00O0O) arrayList4.get(OooO0OO3)).OooO0o0;
                                C1741ooOO c1741ooOO3 = (C1741ooOO) c0331o0O0oo2.OooO0O0;
                                C0054Oooooo c0054Oooooo5 = c1741ooOO3.OoooOO0;
                                if (OooO0OO3 >= 0) {
                                    ArrayList arrayList5 = c0054Oooooo5.OooO0OO;
                                    if (OooO0OO3 < arrayList5.size()) {
                                        int i9 = c0054Oooooo5.OooO0Oo;
                                        if (OooO0OO3 == i9) {
                                            i5 = -1;
                                        } else {
                                            if (OooO0OO3 < i9) {
                                                i5 = i9 - 1;
                                            }
                                            arrayList5.remove(OooO0OO3);
                                            c0054Oooooo5.OooO00o.OooO0o0(OooO0OO3);
                                        }
                                        c0054Oooooo5.OooO0Oo = i5;
                                        arrayList5.remove(OooO0OO3);
                                        c0054Oooooo5.OooO00o.OooO0o0(OooO0OO3);
                                    }
                                } else {
                                    c0054Oooooo5.getClass();
                                }
                                c1741ooOO3.Oooo0o();
                                new Thread(new RunnableC0057Ooooooo(i8, 1), "DeleteVirtualUser").start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        C0055Oooooo0 c0055Oooooo06 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo6 = c0055Oooooo06.OooOooo;
                        if (c0054Oooooo6.OooO0o != null && (OooO0OO4 = c0055Oooooo06.OooO0OO()) >= 0) {
                            ArrayList arrayList6 = c0054Oooooo6.OooO0OO;
                            if (OooO0OO4 < arrayList6.size()) {
                                C0331o0O0oo c0331o0O0oo3 = c0054Oooooo6.OooO0o;
                                o00O0O o00o0o2 = (o00O0O) arrayList6.get(OooO0OO4);
                                c0331o0O0oo3.getClass();
                                GoogleSignInHelper.setPendingUserId(o00o0o2.OooO0o0);
                                GoogleSignInHelper.launchWebViewSignIn(((C1741ooOO) c0331o0O0oo3.OooO0O0).Oooo000(), o00o0o2.OooO0o0);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        C0055Oooooo0 c0055Oooooo07 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo7 = c0055Oooooo07.OooOooo;
                        if (c0054Oooooo7.OooO0o != null && (OooO0OO5 = c0055Oooooo07.OooO0OO()) >= 0) {
                            ArrayList arrayList7 = c0054Oooooo7.OooO0OO;
                            if (OooO0OO5 < arrayList7.size()) {
                                C0331o0O0oo c0331o0O0oo4 = c0054Oooooo7.OooO0o;
                                o00O0O o00o0o3 = (o00O0O) arrayList7.get(OooO0OO5);
                                C1741ooOO c1741ooOO4 = (C1741ooOO) c0331o0O0oo4.OooO0O0;
                                c1741ooOO4.OoooOOO.edit().putInt("active_user_id", o00o0o3.OooO0o0).apply();
                                Intent intent = new Intent(c1741ooOO4.Oooo000(), FacebookWebViewActivity.class);
                                intent.putExtra(FacebookWebViewActivity.EXTRA_URL, FACEBOOK_OAUTH_URL);
                                intent.putExtra(FacebookWebViewActivity.EXTRA_USER_ID, o00o0o3.OooO0o0);
                                c1741ooOO4.Oooo000().startActivity(intent);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        materialButton3.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.OooooOo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                final int OooO0OO;
                int OooO0OO2;
                int OooO0OO3;
                int i5;
                int OooO0OO4;
                int OooO0OO5;
                int r2 = 0; switch (r2) {
                    case 0:
                        C0055Oooooo0 c0055Oooooo02 = c0055Oooooo0;
                        int OooO0OO6 = c0055Oooooo02.OooO0OO();
                        if (OooO0OO6 >= 0) {
                            C0054Oooooo c0054Oooooo = c0055Oooooo02.OooOooo;
                            if (OooO0OO6 < c0054Oooooo.OooO0OO.size()) {
                                int i6 = c0054Oooooo.OooO0o0;
                                if (i6 == OooO0OO6) {
                                    c0054Oooooo.OooO0o0 = -1;
                                } else {
                                    c0054Oooooo.OooO0o0 = OooO0OO6;
                                    ArrayList arrayList = c0054Oooooo.OooO0OO;
                                    if (i6 >= 0 && i6 < arrayList.size()) {
                                        c0054Oooooo.OooO0Oo(i6);
                                    }
                                    if (OooO0OO6 < 0 || OooO0OO6 >= arrayList.size()) {
                                        return;
                                    }
                                }
                                c0054Oooooo.OooO0Oo(OooO0OO6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        C0055Oooooo0 c0055Oooooo03 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo2 = c0055Oooooo03.OooOooo;
                        if (c0054Oooooo2.OooO0o != null && (OooO0OO = c0055Oooooo03.OooO0OO()) >= 0) {
                            ArrayList arrayList2 = c0054Oooooo2.OooO0OO;
                            if (OooO0OO < arrayList2.size()) {
                                final C1741ooOO c1741ooOO = (C1741ooOO) c0054Oooooo2.OooO0o.OooO0O0;
                                View inflate = LayoutInflater.from(c1741ooOO.Oooo000()).inflate(R.layout.dialog_rename_account, (ViewGroup) null);
                                final EditText editText = (EditText) inflate.findViewById(R.id.et_rename);
                                MaterialButton materialButton4 = (MaterialButton) inflate.findViewById(R.id.btn_save);
                                MaterialButton materialButton5 = (MaterialButton) inflate.findViewById(R.id.btn_cancel);
                                editText.setText(((o00O0O) arrayList2.get(OooO0OO)).OooO0O0);
                                editText.setSelection(editText.getText().length());
                                final AlertDialog create = new AlertDialog.Builder(c1741ooOO.Oooo000()).setView(inflate).setCancelable(true).create();
                                if (create.getWindow() != null) {
                                    create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                                }
                                materialButton4.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.o0OoOo0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view4) {
                                        C1741ooOO c1741ooOO2 = c1741ooOO;
                                        c1741ooOO2.getClass();
                                        String trim = editText.getText().toString().trim();
                                        if (!trim.isEmpty()) {
                                            C0054Oooooo c0054Oooooo3 = c1741ooOO2.OoooOO0;
                                            int i7 = OooO0OO;
                                            if (i7 >= 0) {
                                                ArrayList arrayList3 = c0054Oooooo3.OooO0OO;
                                                if (i7 < arrayList3.size()) {
                                                    ((o00O0O) arrayList3.get(i7)).OooO0O0 = trim;
                                                    c0054Oooooo3.OooO0Oo(i7);
                                                }
                                            } else {
                                                c0054Oooooo3.getClass();
                                            }
                                            c1741ooOO2.Oooo0o();
                                        }
                                        create.dismiss();
                                    }
                                });
                                materialButton5.setOnClickListener(new View$OnClickListenerC0056OoooooO(1, create));
                                create.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        C0055Oooooo0 c0055Oooooo04 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo3 = c0055Oooooo04.OooOooo;
                        if (c0054Oooooo3.OooO0o != null && (OooO0OO2 = c0055Oooooo04.OooO0OO()) >= 0) {
                            ArrayList arrayList3 = c0054Oooooo3.OooO0OO;
                            if (OooO0OO2 < arrayList3.size()) {
                                C0331o0O0oo c0331o0O0oo = c0054Oooooo3.OooO0o;
                                c0331o0O0oo.getClass();
                                int i7 = ((o00O0O) arrayList3.get(OooO0OO2)).OooO0o0;
                                C1741ooOO c1741ooOO2 = (C1741ooOO) c0331o0O0oo.OooO0O0;
                                c1741ooOO2.OoooOOO.edit().putInt("active_user_id", i7).apply();
                                GoogleSignInHelper.setActiveUserId(c1741ooOO2.Oooo000(), i7);
                                c1741ooOO2.OoooOO0.OooO0oO(OooO0OO2);
                                c1741ooOO2.Oooo0o();
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        C0055Oooooo0 c0055Oooooo05 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo4 = c0055Oooooo05.OooOooo;
                        if (c0054Oooooo4.OooO0o != null && (OooO0OO3 = c0055Oooooo05.OooO0OO()) >= 0) {
                            ArrayList arrayList4 = c0054Oooooo4.OooO0OO;
                            if (OooO0OO3 < arrayList4.size()) {
                                C0331o0O0oo c0331o0O0oo2 = c0054Oooooo4.OooO0o;
                                c0331o0O0oo2.getClass();
                                int i8 = ((o00O0O) arrayList4.get(OooO0OO3)).OooO0o0;
                                C1741ooOO c1741ooOO3 = (C1741ooOO) c0331o0O0oo2.OooO0O0;
                                C0054Oooooo c0054Oooooo5 = c1741ooOO3.OoooOO0;
                                if (OooO0OO3 >= 0) {
                                    ArrayList arrayList5 = c0054Oooooo5.OooO0OO;
                                    if (OooO0OO3 < arrayList5.size()) {
                                        int i9 = c0054Oooooo5.OooO0Oo;
                                        if (OooO0OO3 == i9) {
                                            i5 = -1;
                                        } else {
                                            if (OooO0OO3 < i9) {
                                                i5 = i9 - 1;
                                            }
                                            arrayList5.remove(OooO0OO3);
                                            c0054Oooooo5.OooO00o.OooO0o0(OooO0OO3);
                                        }
                                        c0054Oooooo5.OooO0Oo = i5;
                                        arrayList5.remove(OooO0OO3);
                                        c0054Oooooo5.OooO00o.OooO0o0(OooO0OO3);
                                    }
                                } else {
                                    c0054Oooooo5.getClass();
                                }
                                c1741ooOO3.Oooo0o();
                                new Thread(new RunnableC0057Ooooooo(i8, 1), "DeleteVirtualUser").start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        C0055Oooooo0 c0055Oooooo06 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo6 = c0055Oooooo06.OooOooo;
                        if (c0054Oooooo6.OooO0o != null && (OooO0OO4 = c0055Oooooo06.OooO0OO()) >= 0) {
                            ArrayList arrayList6 = c0054Oooooo6.OooO0OO;
                            if (OooO0OO4 < arrayList6.size()) {
                                C0331o0O0oo c0331o0O0oo3 = c0054Oooooo6.OooO0o;
                                o00O0O o00o0o2 = (o00O0O) arrayList6.get(OooO0OO4);
                                c0331o0O0oo3.getClass();
                                GoogleSignInHelper.setPendingUserId(o00o0o2.OooO0o0);
                                GoogleSignInHelper.launchWebViewSignIn(((C1741ooOO) c0331o0O0oo3.OooO0O0).Oooo000(), o00o0o2.OooO0o0);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        C0055Oooooo0 c0055Oooooo07 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo7 = c0055Oooooo07.OooOooo;
                        if (c0054Oooooo7.OooO0o != null && (OooO0OO5 = c0055Oooooo07.OooO0OO()) >= 0) {
                            ArrayList arrayList7 = c0054Oooooo7.OooO0OO;
                            if (OooO0OO5 < arrayList7.size()) {
                                C0331o0O0oo c0331o0O0oo4 = c0054Oooooo7.OooO0o;
                                o00O0O o00o0o3 = (o00O0O) arrayList7.get(OooO0OO5);
                                C1741ooOO c1741ooOO4 = (C1741ooOO) c0331o0O0oo4.OooO0O0;
                                c1741ooOO4.OoooOOO.edit().putInt("active_user_id", o00o0o3.OooO0o0).apply();
                                Intent intent = new Intent(c1741ooOO4.Oooo000(), FacebookWebViewActivity.class);
                                intent.putExtra(FacebookWebViewActivity.EXTRA_URL, FACEBOOK_OAUTH_URL);
                                intent.putExtra(FacebookWebViewActivity.EXTRA_USER_ID, o00o0o3.OooO0o0);
                                c1741ooOO4.Oooo000().startActivity(intent);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        c0055Oooooo0.OooOoOO.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.OooooOo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                final int OooO0OO;
                int OooO0OO2;
                int OooO0OO3;
                int i5;
                int OooO0OO4;
                int OooO0OO5;
                int r2 = 0; switch (r2) {
                    case 0:
                        C0055Oooooo0 c0055Oooooo02 = c0055Oooooo0;
                        int OooO0OO6 = c0055Oooooo02.OooO0OO();
                        if (OooO0OO6 >= 0) {
                            C0054Oooooo c0054Oooooo = c0055Oooooo02.OooOooo;
                            if (OooO0OO6 < c0054Oooooo.OooO0OO.size()) {
                                int i6 = c0054Oooooo.OooO0o0;
                                if (i6 == OooO0OO6) {
                                    c0054Oooooo.OooO0o0 = -1;
                                } else {
                                    c0054Oooooo.OooO0o0 = OooO0OO6;
                                    ArrayList arrayList = c0054Oooooo.OooO0OO;
                                    if (i6 >= 0 && i6 < arrayList.size()) {
                                        c0054Oooooo.OooO0Oo(i6);
                                    }
                                    if (OooO0OO6 < 0 || OooO0OO6 >= arrayList.size()) {
                                        return;
                                    }
                                }
                                c0054Oooooo.OooO0Oo(OooO0OO6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        C0055Oooooo0 c0055Oooooo03 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo2 = c0055Oooooo03.OooOooo;
                        if (c0054Oooooo2.OooO0o != null && (OooO0OO = c0055Oooooo03.OooO0OO()) >= 0) {
                            ArrayList arrayList2 = c0054Oooooo2.OooO0OO;
                            if (OooO0OO < arrayList2.size()) {
                                final C1741ooOO c1741ooOO = (C1741ooOO) c0054Oooooo2.OooO0o.OooO0O0;
                                View inflate = LayoutInflater.from(c1741ooOO.Oooo000()).inflate(R.layout.dialog_rename_account, (ViewGroup) null);
                                final EditText editText = (EditText) inflate.findViewById(R.id.et_rename);
                                MaterialButton materialButton4 = (MaterialButton) inflate.findViewById(R.id.btn_save);
                                MaterialButton materialButton5 = (MaterialButton) inflate.findViewById(R.id.btn_cancel);
                                editText.setText(((o00O0O) arrayList2.get(OooO0OO)).OooO0O0);
                                editText.setSelection(editText.getText().length());
                                final AlertDialog create = new AlertDialog.Builder(c1741ooOO.Oooo000()).setView(inflate).setCancelable(true).create();
                                if (create.getWindow() != null) {
                                    create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                                }
                                materialButton4.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.o0OoOo0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view4) {
                                        C1741ooOO c1741ooOO2 = c1741ooOO;
                                        c1741ooOO2.getClass();
                                        String trim = editText.getText().toString().trim();
                                        if (!trim.isEmpty()) {
                                            C0054Oooooo c0054Oooooo3 = c1741ooOO2.OoooOO0;
                                            int i7 = OooO0OO;
                                            if (i7 >= 0) {
                                                ArrayList arrayList3 = c0054Oooooo3.OooO0OO;
                                                if (i7 < arrayList3.size()) {
                                                    ((o00O0O) arrayList3.get(i7)).OooO0O0 = trim;
                                                    c0054Oooooo3.OooO0Oo(i7);
                                                }
                                            } else {
                                                c0054Oooooo3.getClass();
                                            }
                                            c1741ooOO2.Oooo0o();
                                        }
                                        create.dismiss();
                                    }
                                });
                                materialButton5.setOnClickListener(new View$OnClickListenerC0056OoooooO(1, create));
                                create.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        C0055Oooooo0 c0055Oooooo04 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo3 = c0055Oooooo04.OooOooo;
                        if (c0054Oooooo3.OooO0o != null && (OooO0OO2 = c0055Oooooo04.OooO0OO()) >= 0) {
                            ArrayList arrayList3 = c0054Oooooo3.OooO0OO;
                            if (OooO0OO2 < arrayList3.size()) {
                                C0331o0O0oo c0331o0O0oo = c0054Oooooo3.OooO0o;
                                c0331o0O0oo.getClass();
                                int i7 = ((o00O0O) arrayList3.get(OooO0OO2)).OooO0o0;
                                C1741ooOO c1741ooOO2 = (C1741ooOO) c0331o0O0oo.OooO0O0;
                                c1741ooOO2.OoooOOO.edit().putInt("active_user_id", i7).apply();
                                GoogleSignInHelper.setActiveUserId(c1741ooOO2.Oooo000(), i7);
                                c1741ooOO2.OoooOO0.OooO0oO(OooO0OO2);
                                c1741ooOO2.Oooo0o();
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        C0055Oooooo0 c0055Oooooo05 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo4 = c0055Oooooo05.OooOooo;
                        if (c0054Oooooo4.OooO0o != null && (OooO0OO3 = c0055Oooooo05.OooO0OO()) >= 0) {
                            ArrayList arrayList4 = c0054Oooooo4.OooO0OO;
                            if (OooO0OO3 < arrayList4.size()) {
                                C0331o0O0oo c0331o0O0oo2 = c0054Oooooo4.OooO0o;
                                c0331o0O0oo2.getClass();
                                int i8 = ((o00O0O) arrayList4.get(OooO0OO3)).OooO0o0;
                                C1741ooOO c1741ooOO3 = (C1741ooOO) c0331o0O0oo2.OooO0O0;
                                C0054Oooooo c0054Oooooo5 = c1741ooOO3.OoooOO0;
                                if (OooO0OO3 >= 0) {
                                    ArrayList arrayList5 = c0054Oooooo5.OooO0OO;
                                    if (OooO0OO3 < arrayList5.size()) {
                                        int i9 = c0054Oooooo5.OooO0Oo;
                                        if (OooO0OO3 == i9) {
                                            i5 = -1;
                                        } else {
                                            if (OooO0OO3 < i9) {
                                                i5 = i9 - 1;
                                            }
                                            arrayList5.remove(OooO0OO3);
                                            c0054Oooooo5.OooO00o.OooO0o0(OooO0OO3);
                                        }
                                        c0054Oooooo5.OooO0Oo = i5;
                                        arrayList5.remove(OooO0OO3);
                                        c0054Oooooo5.OooO00o.OooO0o0(OooO0OO3);
                                    }
                                } else {
                                    c0054Oooooo5.getClass();
                                }
                                c1741ooOO3.Oooo0o();
                                new Thread(new RunnableC0057Ooooooo(i8, 1), "DeleteVirtualUser").start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        C0055Oooooo0 c0055Oooooo06 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo6 = c0055Oooooo06.OooOooo;
                        if (c0054Oooooo6.OooO0o != null && (OooO0OO4 = c0055Oooooo06.OooO0OO()) >= 0) {
                            ArrayList arrayList6 = c0054Oooooo6.OooO0OO;
                            if (OooO0OO4 < arrayList6.size()) {
                                C0331o0O0oo c0331o0O0oo3 = c0054Oooooo6.OooO0o;
                                o00O0O o00o0o2 = (o00O0O) arrayList6.get(OooO0OO4);
                                c0331o0O0oo3.getClass();
                                GoogleSignInHelper.setPendingUserId(o00o0o2.OooO0o0);
                                GoogleSignInHelper.launchWebViewSignIn(((C1741ooOO) c0331o0O0oo3.OooO0O0).Oooo000(), o00o0o2.OooO0o0);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        C0055Oooooo0 c0055Oooooo07 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo7 = c0055Oooooo07.OooOooo;
                        if (c0054Oooooo7.OooO0o != null && (OooO0OO5 = c0055Oooooo07.OooO0OO()) >= 0) {
                            ArrayList arrayList7 = c0054Oooooo7.OooO0OO;
                            if (OooO0OO5 < arrayList7.size()) {
                                C0331o0O0oo c0331o0O0oo4 = c0054Oooooo7.OooO0o;
                                o00O0O o00o0o3 = (o00O0O) arrayList7.get(OooO0OO5);
                                C1741ooOO c1741ooOO4 = (C1741ooOO) c0331o0O0oo4.OooO0O0;
                                c1741ooOO4.OoooOOO.edit().putInt("active_user_id", o00o0o3.OooO0o0).apply();
                                Intent intent = new Intent(c1741ooOO4.Oooo000(), FacebookWebViewActivity.class);
                                intent.putExtra(FacebookWebViewActivity.EXTRA_URL, FACEBOOK_OAUTH_URL);
                                intent.putExtra(FacebookWebViewActivity.EXTRA_USER_ID, o00o0o3.OooO0o0);
                                c1741ooOO4.Oooo000().startActivity(intent);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        materialButton.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.OooooOo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                final int OooO0OO;
                int OooO0OO2;
                int OooO0OO3;
                int i5;
                int OooO0OO4;
                int OooO0OO5;
                int r2 = 0; switch (r2) {
                    case 0:
                        C0055Oooooo0 c0055Oooooo02 = c0055Oooooo0;
                        int OooO0OO6 = c0055Oooooo02.OooO0OO();
                        if (OooO0OO6 >= 0) {
                            C0054Oooooo c0054Oooooo = c0055Oooooo02.OooOooo;
                            if (OooO0OO6 < c0054Oooooo.OooO0OO.size()) {
                                int i6 = c0054Oooooo.OooO0o0;
                                if (i6 == OooO0OO6) {
                                    c0054Oooooo.OooO0o0 = -1;
                                } else {
                                    c0054Oooooo.OooO0o0 = OooO0OO6;
                                    ArrayList arrayList = c0054Oooooo.OooO0OO;
                                    if (i6 >= 0 && i6 < arrayList.size()) {
                                        c0054Oooooo.OooO0Oo(i6);
                                    }
                                    if (OooO0OO6 < 0 || OooO0OO6 >= arrayList.size()) {
                                        return;
                                    }
                                }
                                c0054Oooooo.OooO0Oo(OooO0OO6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        C0055Oooooo0 c0055Oooooo03 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo2 = c0055Oooooo03.OooOooo;
                        if (c0054Oooooo2.OooO0o != null && (OooO0OO = c0055Oooooo03.OooO0OO()) >= 0) {
                            ArrayList arrayList2 = c0054Oooooo2.OooO0OO;
                            if (OooO0OO < arrayList2.size()) {
                                final C1741ooOO c1741ooOO = (C1741ooOO) c0054Oooooo2.OooO0o.OooO0O0;
                                View inflate = LayoutInflater.from(c1741ooOO.Oooo000()).inflate(R.layout.dialog_rename_account, (ViewGroup) null);
                                final EditText editText = (EditText) inflate.findViewById(R.id.et_rename);
                                MaterialButton materialButton4 = (MaterialButton) inflate.findViewById(R.id.btn_save);
                                MaterialButton materialButton5 = (MaterialButton) inflate.findViewById(R.id.btn_cancel);
                                editText.setText(((o00O0O) arrayList2.get(OooO0OO)).OooO0O0);
                                editText.setSelection(editText.getText().length());
                                final AlertDialog create = new AlertDialog.Builder(c1741ooOO.Oooo000()).setView(inflate).setCancelable(true).create();
                                if (create.getWindow() != null) {
                                    create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                                }
                                materialButton4.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.o0OoOo0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view4) {
                                        C1741ooOO c1741ooOO2 = c1741ooOO;
                                        c1741ooOO2.getClass();
                                        String trim = editText.getText().toString().trim();
                                        if (!trim.isEmpty()) {
                                            C0054Oooooo c0054Oooooo3 = c1741ooOO2.OoooOO0;
                                            int i7 = OooO0OO;
                                            if (i7 >= 0) {
                                                ArrayList arrayList3 = c0054Oooooo3.OooO0OO;
                                                if (i7 < arrayList3.size()) {
                                                    ((o00O0O) arrayList3.get(i7)).OooO0O0 = trim;
                                                    c0054Oooooo3.OooO0Oo(i7);
                                                }
                                            } else {
                                                c0054Oooooo3.getClass();
                                            }
                                            c1741ooOO2.Oooo0o();
                                        }
                                        create.dismiss();
                                    }
                                });
                                materialButton5.setOnClickListener(new View$OnClickListenerC0056OoooooO(1, create));
                                create.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        C0055Oooooo0 c0055Oooooo04 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo3 = c0055Oooooo04.OooOooo;
                        if (c0054Oooooo3.OooO0o != null && (OooO0OO2 = c0055Oooooo04.OooO0OO()) >= 0) {
                            ArrayList arrayList3 = c0054Oooooo3.OooO0OO;
                            if (OooO0OO2 < arrayList3.size()) {
                                C0331o0O0oo c0331o0O0oo = c0054Oooooo3.OooO0o;
                                c0331o0O0oo.getClass();
                                int i7 = ((o00O0O) arrayList3.get(OooO0OO2)).OooO0o0;
                                C1741ooOO c1741ooOO2 = (C1741ooOO) c0331o0O0oo.OooO0O0;
                                c1741ooOO2.OoooOOO.edit().putInt("active_user_id", i7).apply();
                                GoogleSignInHelper.setActiveUserId(c1741ooOO2.Oooo000(), i7);
                                c1741ooOO2.OoooOO0.OooO0oO(OooO0OO2);
                                c1741ooOO2.Oooo0o();
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        C0055Oooooo0 c0055Oooooo05 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo4 = c0055Oooooo05.OooOooo;
                        if (c0054Oooooo4.OooO0o != null && (OooO0OO3 = c0055Oooooo05.OooO0OO()) >= 0) {
                            ArrayList arrayList4 = c0054Oooooo4.OooO0OO;
                            if (OooO0OO3 < arrayList4.size()) {
                                C0331o0O0oo c0331o0O0oo2 = c0054Oooooo4.OooO0o;
                                c0331o0O0oo2.getClass();
                                int i8 = ((o00O0O) arrayList4.get(OooO0OO3)).OooO0o0;
                                C1741ooOO c1741ooOO3 = (C1741ooOO) c0331o0O0oo2.OooO0O0;
                                C0054Oooooo c0054Oooooo5 = c1741ooOO3.OoooOO0;
                                if (OooO0OO3 >= 0) {
                                    ArrayList arrayList5 = c0054Oooooo5.OooO0OO;
                                    if (OooO0OO3 < arrayList5.size()) {
                                        int i9 = c0054Oooooo5.OooO0Oo;
                                        if (OooO0OO3 == i9) {
                                            i5 = -1;
                                        } else {
                                            if (OooO0OO3 < i9) {
                                                i5 = i9 - 1;
                                            }
                                            arrayList5.remove(OooO0OO3);
                                            c0054Oooooo5.OooO00o.OooO0o0(OooO0OO3);
                                        }
                                        c0054Oooooo5.OooO0Oo = i5;
                                        arrayList5.remove(OooO0OO3);
                                        c0054Oooooo5.OooO00o.OooO0o0(OooO0OO3);
                                    }
                                } else {
                                    c0054Oooooo5.getClass();
                                }
                                c1741ooOO3.Oooo0o();
                                new Thread(new RunnableC0057Ooooooo(i8, 1), "DeleteVirtualUser").start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        C0055Oooooo0 c0055Oooooo06 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo6 = c0055Oooooo06.OooOooo;
                        if (c0054Oooooo6.OooO0o != null && (OooO0OO4 = c0055Oooooo06.OooO0OO()) >= 0) {
                            ArrayList arrayList6 = c0054Oooooo6.OooO0OO;
                            if (OooO0OO4 < arrayList6.size()) {
                                C0331o0O0oo c0331o0O0oo3 = c0054Oooooo6.OooO0o;
                                o00O0O o00o0o2 = (o00O0O) arrayList6.get(OooO0OO4);
                                c0331o0O0oo3.getClass();
                                GoogleSignInHelper.setPendingUserId(o00o0o2.OooO0o0);
                                GoogleSignInHelper.launchWebViewSignIn(((C1741ooOO) c0331o0O0oo3.OooO0O0).Oooo000(), o00o0o2.OooO0o0);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        C0055Oooooo0 c0055Oooooo07 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo7 = c0055Oooooo07.OooOooo;
                        if (c0054Oooooo7.OooO0o != null && (OooO0OO5 = c0055Oooooo07.OooO0OO()) >= 0) {
                            ArrayList arrayList7 = c0054Oooooo7.OooO0OO;
                            if (OooO0OO5 < arrayList7.size()) {
                                C0331o0O0oo c0331o0O0oo4 = c0054Oooooo7.OooO0o;
                                o00O0O o00o0o3 = (o00O0O) arrayList7.get(OooO0OO5);
                                C1741ooOO c1741ooOO4 = (C1741ooOO) c0331o0O0oo4.OooO0O0;
                                c1741ooOO4.OoooOOO.edit().putInt("active_user_id", o00o0o3.OooO0o0).apply();
                                Intent intent = new Intent(c1741ooOO4.Oooo000(), FacebookWebViewActivity.class);
                                intent.putExtra(FacebookWebViewActivity.EXTRA_URL, FACEBOOK_OAUTH_URL);
                                intent.putExtra(FacebookWebViewActivity.EXTRA_USER_ID, o00o0o3.OooO0o0);
                                c1741ooOO4.Oooo000().startActivity(intent);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
        materialButton2.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.OooooOo
            @Override // android.view.View.OnClickListener
            public final void onClick(View view3) {
                final int OooO0OO;
                int OooO0OO2;
                int OooO0OO3;
                int i5;
                int OooO0OO4;
                int OooO0OO5;
                int r2 = 0; switch (r2) {
                    case 0:
                        C0055Oooooo0 c0055Oooooo02 = c0055Oooooo0;
                        int OooO0OO6 = c0055Oooooo02.OooO0OO();
                        if (OooO0OO6 >= 0) {
                            C0054Oooooo c0054Oooooo = c0055Oooooo02.OooOooo;
                            if (OooO0OO6 < c0054Oooooo.OooO0OO.size()) {
                                int i6 = c0054Oooooo.OooO0o0;
                                if (i6 == OooO0OO6) {
                                    c0054Oooooo.OooO0o0 = -1;
                                } else {
                                    c0054Oooooo.OooO0o0 = OooO0OO6;
                                    ArrayList arrayList = c0054Oooooo.OooO0OO;
                                    if (i6 >= 0 && i6 < arrayList.size()) {
                                        c0054Oooooo.OooO0Oo(i6);
                                    }
                                    if (OooO0OO6 < 0 || OooO0OO6 >= arrayList.size()) {
                                        return;
                                    }
                                }
                                c0054Oooooo.OooO0Oo(OooO0OO6);
                                return;
                            }
                            return;
                        }
                        return;
                    case 1:
                        C0055Oooooo0 c0055Oooooo03 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo2 = c0055Oooooo03.OooOooo;
                        if (c0054Oooooo2.OooO0o != null && (OooO0OO = c0055Oooooo03.OooO0OO()) >= 0) {
                            ArrayList arrayList2 = c0054Oooooo2.OooO0OO;
                            if (OooO0OO < arrayList2.size()) {
                                final C1741ooOO c1741ooOO = (C1741ooOO) c0054Oooooo2.OooO0o.OooO0O0;
                                View inflate = LayoutInflater.from(c1741ooOO.Oooo000()).inflate(R.layout.dialog_rename_account, (ViewGroup) null);
                                final EditText editText = (EditText) inflate.findViewById(R.id.et_rename);
                                MaterialButton materialButton4 = (MaterialButton) inflate.findViewById(R.id.btn_save);
                                MaterialButton materialButton5 = (MaterialButton) inflate.findViewById(R.id.btn_cancel);
                                editText.setText(((o00O0O) arrayList2.get(OooO0OO)).OooO0O0);
                                editText.setSelection(editText.getText().length());
                                final AlertDialog create = new AlertDialog.Builder(c1741ooOO.Oooo000()).setView(inflate).setCancelable(true).create();
                                if (create.getWindow() != null) {
                                    create.getWindow().setBackgroundDrawable(new ColorDrawable(0));
                                }
                                materialButton4.setOnClickListener(new View.OnClickListener() { // from class: com.ninja.engine.o0OoOo0
                                    @Override // android.view.View.OnClickListener
                                    public final void onClick(View view4) {
                                        C1741ooOO c1741ooOO2 = c1741ooOO;
                                        c1741ooOO2.getClass();
                                        String trim = editText.getText().toString().trim();
                                        if (!trim.isEmpty()) {
                                            C0054Oooooo c0054Oooooo3 = c1741ooOO2.OoooOO0;
                                            int i7 = OooO0OO;
                                            if (i7 >= 0) {
                                                ArrayList arrayList3 = c0054Oooooo3.OooO0OO;
                                                if (i7 < arrayList3.size()) {
                                                    ((o00O0O) arrayList3.get(i7)).OooO0O0 = trim;
                                                    c0054Oooooo3.OooO0Oo(i7);
                                                }
                                            } else {
                                                c0054Oooooo3.getClass();
                                            }
                                            c1741ooOO2.Oooo0o();
                                        }
                                        create.dismiss();
                                    }
                                });
                                materialButton5.setOnClickListener(new View$OnClickListenerC0056OoooooO(1, create));
                                create.show();
                                return;
                            }
                            return;
                        }
                        return;
                    case 2:
                        C0055Oooooo0 c0055Oooooo04 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo3 = c0055Oooooo04.OooOooo;
                        if (c0054Oooooo3.OooO0o != null && (OooO0OO2 = c0055Oooooo04.OooO0OO()) >= 0) {
                            ArrayList arrayList3 = c0054Oooooo3.OooO0OO;
                            if (OooO0OO2 < arrayList3.size()) {
                                C0331o0O0oo c0331o0O0oo = c0054Oooooo3.OooO0o;
                                c0331o0O0oo.getClass();
                                int i7 = ((o00O0O) arrayList3.get(OooO0OO2)).OooO0o0;
                                C1741ooOO c1741ooOO2 = (C1741ooOO) c0331o0O0oo.OooO0O0;
                                c1741ooOO2.OoooOOO.edit().putInt("active_user_id", i7).apply();
                                GoogleSignInHelper.setActiveUserId(c1741ooOO2.Oooo000(), i7);
                                c1741ooOO2.OoooOO0.OooO0oO(OooO0OO2);
                                c1741ooOO2.Oooo0o();
                                return;
                            }
                            return;
                        }
                        return;
                    case 3:
                        C0055Oooooo0 c0055Oooooo05 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo4 = c0055Oooooo05.OooOooo;
                        if (c0054Oooooo4.OooO0o != null && (OooO0OO3 = c0055Oooooo05.OooO0OO()) >= 0) {
                            ArrayList arrayList4 = c0054Oooooo4.OooO0OO;
                            if (OooO0OO3 < arrayList4.size()) {
                                C0331o0O0oo c0331o0O0oo2 = c0054Oooooo4.OooO0o;
                                c0331o0O0oo2.getClass();
                                int i8 = ((o00O0O) arrayList4.get(OooO0OO3)).OooO0o0;
                                C1741ooOO c1741ooOO3 = (C1741ooOO) c0331o0O0oo2.OooO0O0;
                                C0054Oooooo c0054Oooooo5 = c1741ooOO3.OoooOO0;
                                if (OooO0OO3 >= 0) {
                                    ArrayList arrayList5 = c0054Oooooo5.OooO0OO;
                                    if (OooO0OO3 < arrayList5.size()) {
                                        int i9 = c0054Oooooo5.OooO0Oo;
                                        if (OooO0OO3 == i9) {
                                            i5 = -1;
                                        } else {
                                            if (OooO0OO3 < i9) {
                                                i5 = i9 - 1;
                                            }
                                            arrayList5.remove(OooO0OO3);
                                            c0054Oooooo5.OooO00o.OooO0o0(OooO0OO3);
                                        }
                                        c0054Oooooo5.OooO0Oo = i5;
                                        arrayList5.remove(OooO0OO3);
                                        c0054Oooooo5.OooO00o.OooO0o0(OooO0OO3);
                                    }
                                } else {
                                    c0054Oooooo5.getClass();
                                }
                                c1741ooOO3.Oooo0o();
                                new Thread(new RunnableC0057Ooooooo(i8, 1), "DeleteVirtualUser").start();
                                return;
                            }
                            return;
                        }
                        return;
                    case 4:
                        C0055Oooooo0 c0055Oooooo06 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo6 = c0055Oooooo06.OooOooo;
                        if (c0054Oooooo6.OooO0o != null && (OooO0OO4 = c0055Oooooo06.OooO0OO()) >= 0) {
                            ArrayList arrayList6 = c0054Oooooo6.OooO0OO;
                            if (OooO0OO4 < arrayList6.size()) {
                                C0331o0O0oo c0331o0O0oo3 = c0054Oooooo6.OooO0o;
                                o00O0O o00o0o2 = (o00O0O) arrayList6.get(OooO0OO4);
                                c0331o0O0oo3.getClass();
                                GoogleSignInHelper.setPendingUserId(o00o0o2.OooO0o0);
                                GoogleSignInHelper.launchWebViewSignIn(((C1741ooOO) c0331o0O0oo3.OooO0O0).Oooo000(), o00o0o2.OooO0o0);
                                return;
                            }
                            return;
                        }
                        return;
                    default:
                        C0055Oooooo0 c0055Oooooo07 = c0055Oooooo0;
                        C0054Oooooo c0054Oooooo7 = c0055Oooooo07.OooOooo;
                        if (c0054Oooooo7.OooO0o != null && (OooO0OO5 = c0055Oooooo07.OooO0OO()) >= 0) {
                            ArrayList arrayList7 = c0054Oooooo7.OooO0OO;
                            if (OooO0OO5 < arrayList7.size()) {
                                C0331o0O0oo c0331o0O0oo4 = c0054Oooooo7.OooO0o;
                                o00O0O o00o0o3 = (o00O0O) arrayList7.get(OooO0OO5);
                                C1741ooOO c1741ooOO4 = (C1741ooOO) c0331o0O0oo4.OooO0O0;
                                c1741ooOO4.OoooOOO.edit().putInt("active_user_id", o00o0o3.OooO0o0).apply();
                                Intent intent = new Intent(c1741ooOO4.Oooo000(), FacebookWebViewActivity.class);
                                intent.putExtra(FacebookWebViewActivity.EXTRA_URL, FACEBOOK_OAUTH_URL);
                                intent.putExtra(FacebookWebViewActivity.EXTRA_USER_ID, o00o0o3.OooO0o0);
                                c1741ooOO4.Oooo000().startActivity(intent);
                                return;
                            }
                            return;
                        }
                        return;
                }
            }
        });
    }

    public final void OooO0oO(int i) {
        int i2 = this.OooO0Oo;
        ArrayList arrayList = this.OooO0OO;
        if (i2 >= 0 && i2 < arrayList.size()) {
            ((o00O0O) arrayList.get(this.OooO0Oo)).OooO0Oo = false;
            OooO0Oo(this.OooO0Oo);
        }
        this.OooO0Oo = i;
        if (i >= 0 && i < arrayList.size()) {
            ((o00O0O) arrayList.get(i)).OooO0Oo = true;
            OooO0Oo(i);
        }
    }
}



