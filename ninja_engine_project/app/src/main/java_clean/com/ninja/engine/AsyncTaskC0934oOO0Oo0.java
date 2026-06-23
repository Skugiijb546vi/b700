package com.ninja.engine;

import android.app.ProgressDialog;
import android.os.AsyncTask;
import com.app.framework.utils.ShellUtils;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.URLEncoder;
import java.nio.charset.StandardCharsets;
import java.util.Map;
import javax.net.ssl.HttpsURLConnection;
/* renamed from: com.ninja.engine.oOO0Oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class AsyncTaskC0934oOO0Oo0 extends AsyncTask {
    public boolean OooO00o;
    public C1892ooOoOoOO OooO0O0;
    public ProgressDialog OooO0OO;
    public C0435o0OoO000 OooO0Oo;

    public static String OooO00o(C1858ooOo0oOO c1858ooOo0oOO) {
        if (c1858ooOo0oOO == null) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        for (Map.Entry entry : c1858ooOo0oOO.entrySet()) {
            if (z) {
                z = false;
            } else {
                sb.append("&");
            }
            sb.append(URLEncoder.encode((String) entry.getKey(), "UTF-8"));
            sb.append("=");
            sb.append(URLEncoder.encode((String) entry.getValue(), "UTF-8"));
        }
        return sb.toString();
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ninja.engine.oOOO00O, java.lang.Object] */
    @Override // android.os.AsyncTask
    public final Object doInBackground(Object[] objArr) {
        int i;
        String str;
        C1892ooOoOoOO[] c1892ooOoOoOOArr = (C1892ooOoOoOO[]) objArr;
        StringBuilder sb = new StringBuilder();
        int i2 = -1;
        HttpsURLConnection httpsURLConnection = null;
        try {
            if (this.OooO00o) {
                this.OooO0O0.OooO0O0.toString();
            }
            HttpsURLConnection httpsURLConnection2 = (HttpsURLConnection) this.OooO0O0.OooO0O0.openConnection();
            try {
                try {
                    boolean z = true;
                    if (this.OooO0O0.OooO0Oo == 1) {
                        str = "POST";
                    } else {
                        str = "GET";
                    }
                    httpsURLConnection2.setRequestMethod(str);
                    if (this.OooO00o) {
                        int i3 = this.OooO0O0.OooO0Oo;
                    }
                    httpsURLConnection2.setConnectTimeout(30000);
                    httpsURLConnection2.setReadTimeout(30000);
                    httpsURLConnection2.setDoInput(true);
                    httpsURLConnection2.setDoOutput(true);
                    OutputStream outputStream = httpsURLConnection2.getOutputStream();
                    BufferedWriter bufferedWriter = new BufferedWriter(new OutputStreamWriter(outputStream, StandardCharsets.UTF_8));
                    bufferedWriter.write(OooO00o(this.OooO0O0.OooO0OO));
                    bufferedWriter.flush();
                    bufferedWriter.close();
                    outputStream.close();
                    i = httpsURLConnection2.getResponseCode();
                    try {
                        if (i == 200) {
                            int headerFieldInt = httpsURLConnection2.getHeaderFieldInt("X-xCode", -1);
                            if (headerFieldInt != -1) {
                                i2 = headerFieldInt;
                            } else {
                                i2 = i;
                            }
                            BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(httpsURLConnection2.getInputStream()));
                            while (true) {
                                String readLine = bufferedReader.readLine();
                                if (readLine == null) {
                                    break;
                                }
                                if (z) {
                                    z = false;
                                } else {
                                    sb.append(ShellUtils.COMMAND_LINE_END);
                                }
                                sb.append(readLine);
                            }
                            i = i2;
                        } else {
                            BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(httpsURLConnection2.getErrorStream()));
                            while (true) {
                                String readLine2 = bufferedReader2.readLine();
                                if (readLine2 == null) {
                                    break;
                                }
                                if (z) {
                                    z = false;
                                } else {
                                    sb.append(ShellUtils.COMMAND_LINE_END);
                                }
                                sb.append(readLine2);
                            }
                        }
                        httpsURLConnection2.disconnect();
                    } catch (Exception unused) {
                        i2 = i;
                        httpsURLConnection = httpsURLConnection2;
                        if (httpsURLConnection != null) {
                            httpsURLConnection.disconnect();
                        }
                        i = i2;
                        sb.trimToSize();
                        String sb2 = sb.toString();
                        Object obj = new Object();
                        obj.OooO00o = i;
                        obj.OooO0O0 = sb2;
                        return obj;
                    }
                } catch (Exception unused2) {
                }
            } catch (Throwable th) {
                th = th;
                httpsURLConnection = httpsURLConnection2;
                if (httpsURLConnection != null) {
                    httpsURLConnection.disconnect();
                }
                throw th;
            }
        } catch (Exception unused3) {
        } catch (Throwable th2) {
            th = th2;
        }
        sb.trimToSize();
        String sb22 = sb.toString();
        Object obj2 = new Object();
        obj2.OooO00o = i;
        obj2.OooO0O0 = sb22;
        return obj2;
    }

    @Override // android.os.AsyncTask
    public final void onPostExecute(Object obj) {
        int i;
        C0972oOOO00O c0972oOOO00O = (C0972oOOO00O) obj;
        super.onPostExecute(c0972oOOO00O);
        C0435o0OoO000 c0435o0OoO000 = this.OooO0Oo;
        c0435o0OoO000.getClass();
        String str = AbstractC2033oooOoo0.OooO00o;
        int i2 = c0972oOOO00O.OooO00o;
        InterfaceC2035oooOoo0O interfaceC2035oooOoo0O = (InterfaceC2035oooOoo0O) c0435o0OoO000.OooO0O0;
        int i3 = 0;
        if (i2 != 999) {
            switch (i2) {
                case 902:
                    i = 2;
                    interfaceC2035oooOoo0O.OooO00o(i);
                    break;
                case 903:
                    i = 3;
                    interfaceC2035oooOoo0O.OooO00o(i);
                    break;
                case 904:
                    i = 4;
                    interfaceC2035oooOoo0O.OooO00o(i);
                    break;
                default:
                    interfaceC2035oooOoo0O.OooO00o(0);
                    break;
            }
        } else {
            String str2 = c0972oOOO00O.OooO0O0;
            if (str2 == null) {
                interfaceC2035oooOoo0O.OooO00o(0);
            }
            long currentTimeMillis = System.currentTimeMillis();
            String[] split = AbstractC2033oooOoo0.OooO00o(str2).split(";");
            for (int i4 = 0; i4 < split.length; i4++) {
                split[i4] = AbstractC2033oooOoo0.OooO00o(split[i4]);
            }
            long parseLong = currentTimeMillis - Long.parseLong(split[0]);
            if (parseLong > -3333 && parseLong < 3333) {
                i3 = Integer.parseInt(split[1]);
            }
            interfaceC2035oooOoo0O.OooO00o(i3);
        }
        ProgressDialog progressDialog = this.OooO0OO;
        if (progressDialog != null) {
            progressDialog.cancel();
        }
    }

    @Override // android.os.AsyncTask
    public final void onPreExecute() {
        super.onPreExecute();
        if (this.OooO0O0.OooO00o != null) {
            ProgressDialog progressDialog = new ProgressDialog(this.OooO0O0.OooO00o);
            this.OooO0OO = progressDialog;
            progressDialog.setTitle("Connecting...");
            this.OooO0OO.setMessage("Connecting, please wait...");
            this.OooO0OO.setIndeterminate(false);
            this.OooO0OO.setCancelable(false);
            this.OooO0OO.show();
        }
    }
}



