package com.ninja.engine;

import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.Response;
import com.ninja.engine.encryption.EncryptorInstance;
import java.util.ArrayList;
import org.json.JSONArray;
import org.json.JSONObject;
/* renamed from: com.ninja.engine.oO0o0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0823oO0o0OO implements Response.Listener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ String OooO0O0;
    public final /* synthetic */ String OooO0OO;
    public final /* synthetic */ TextView OooO0Oo;
    public final /* synthetic */ RecyclerView OooO0o;
    public final /* synthetic */ TextView OooO0o0;
    public final /* synthetic */ AbstractComponentCallbacksC0593o0oOoOo0 OooO0oO;

    public /* synthetic */ C0823oO0o0OO(AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0, String str, String str2, TextView textView, TextView textView2, RecyclerView recyclerView, int i) {
        this.OooO00o = i;
        this.OooO0oO = abstractComponentCallbacksC0593o0oOoOo0;
        this.OooO0O0 = str;
        this.OooO0OO = str2;
        this.OooO0Oo = textView;
        this.OooO0o0 = textView2;
        this.OooO0o = recyclerView;
    }

    @Override // com.android.volley.Response.Listener
    public final void onResponse(Object obj) {
        int i;
        int i2;
        switch (this.OooO00o) {
            case 0:
                String str = this.OooO0O0;
                String str2 = this.OooO0OO;
                RecyclerView recyclerView = this.OooO0o;
                String str3 = (String) obj;
                C0829oO0o0Ooo c0829oO0o0Ooo = (C0829oO0o0Ooo) this.OooO0oO;
                c0829oO0o0Ooo.getClass();
                try {
                    JSONObject jSONObject = (JSONObject) new JSONArray(EncryptorInstance.decryptOpenSSL256bit(str3, str)).get(0);
                    int i3 = jSONObject.getInt("result");
                    TextView textView = this.OooO0Oo;
                    TextView textView2 = this.OooO0o0;
                    if (i3 == 9) {
                        String str4 = str2 + "/" + jSONObject.optString("icon_base", "");
                        String str5 = str2 + "/" + jSONObject.optString("image_base", "");
                        JSONArray jSONArray = jSONObject.getJSONArray("regions");
                        ArrayList arrayList = new ArrayList();
                        int i4 = 0;
                        while (i4 < jSONArray.length()) {
                            JSONObject jSONObject2 = jSONArray.getJSONObject(i4);
                            String string = jSONObject2.getString("name");
                            String optString = jSONObject2.optString("icon", "");
                            JSONArray jSONArray2 = jSONObject2.getJSONArray("resellers");
                            ArrayList arrayList2 = new ArrayList();
                            int i5 = 0;
                            while (i5 < jSONArray2.length()) {
                                JSONObject jSONObject3 = jSONArray2.getJSONObject(i5);
                                arrayList2.add(new C1109oOOoo0(jSONObject3.getString("un"), jSONObject3.optString("telegram_id", ""), jSONObject3.optString("whatsapp_id", "")));
                                i5++;
                                jSONArray2 = jSONArray2;
                                jSONArray = jSONArray;
                                recyclerView = recyclerView;
                                str5 = str5;
                            }
                            arrayList.add(new C1113oOOoo00o(string, optString, arrayList2));
                            i4++;
                            jSONArray = jSONArray;
                            recyclerView = recyclerView;
                            str5 = str5;
                        }
                        String str6 = str5;
                        RecyclerView recyclerView2 = recyclerView;
                        if (arrayList.isEmpty()) {
                            textView.setVisibility(8);
                            i = 0;
                        } else {
                            C1114oOOoo0O c1114oOOoo0O = new C1114oOOoo0O(c0829oO0o0Ooo.Oooo000(), str4, str6);
                            recyclerView2.setAdapter(c1114oOOoo0O);
                            c1114oOOoo0O.OooO0oO(arrayList);
                            textView.setVisibility(8);
                            recyclerView2.setVisibility(0);
                            return;
                        }
                    } else {
                        textView.setVisibility(8);
                        i = 0;
                    }
                    textView2.setVisibility(i);
                    return;
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
            default:
                String str7 = this.OooO0O0;
                String str8 = this.OooO0OO;
                RecyclerView recyclerView3 = this.OooO0o;
                String str9 = (String) obj;
                C1119oOOoo0oO c1119oOOoo0oO = (C1119oOOoo0oO) this.OooO0oO;
                c1119oOOoo0oO.getClass();
                try {
                    JSONObject jSONObject4 = (JSONObject) new JSONArray(EncryptorInstance.decryptOpenSSL256bit(str9, str7)).get(0);
                    if ("failed".equals(jSONObject4.optString("check-user"))) {
                        if (c1119oOOoo0oO.OooOOOo() && c1119oOOoo0oO.OooO0oO() != null) {
                            c1119oOOoo0oO.Oooo000().runOnUiThread(new RunnableC0061o00000oO(16, c1119oOOoo0oO));
                            return;
                        }
                        return;
                    }
                    int i6 = jSONObject4.getInt("result");
                    TextView textView3 = this.OooO0Oo;
                    TextView textView4 = this.OooO0o0;
                    if (i6 == 9) {
                        String str10 = str8 + "/" + jSONObject4.optString("icon_base", "");
                        String str11 = str8 + "/" + jSONObject4.optString("image_base", "");
                        JSONArray jSONArray3 = jSONObject4.getJSONArray("regions");
                        ArrayList arrayList3 = new ArrayList();
                        int i7 = 0;
                        while (i7 < jSONArray3.length()) {
                            JSONObject jSONObject5 = jSONArray3.getJSONObject(i7);
                            String string2 = jSONObject5.getString("name");
                            String optString2 = jSONObject5.optString("icon", "");
                            JSONArray jSONArray4 = jSONObject5.getJSONArray("resellers");
                            ArrayList arrayList4 = new ArrayList();
                            JSONArray jSONArray5 = jSONArray3;
                            int i8 = 0;
                            while (i8 < jSONArray4.length()) {
                                JSONObject jSONObject6 = jSONArray4.getJSONObject(i8);
                                arrayList4.add(new C1109oOOoo0(jSONObject6.getString("un"), jSONObject6.optString("telegram_id", ""), jSONObject6.optString("whatsapp_id", "")));
                                i8++;
                                jSONArray4 = jSONArray4;
                                recyclerView3 = recyclerView3;
                                str11 = str11;
                            }
                            arrayList3.add(new C1113oOOoo00o(string2, optString2, arrayList4));
                            i7++;
                            jSONArray3 = jSONArray5;
                            recyclerView3 = recyclerView3;
                            str11 = str11;
                        }
                        String str12 = str11;
                        RecyclerView recyclerView4 = recyclerView3;
                        if (arrayList3.isEmpty()) {
                            textView3.setVisibility(8);
                            i2 = 0;
                        } else {
                            C1114oOOoo0O c1114oOOoo0O2 = new C1114oOOoo0O(c1119oOOoo0oO.Oooo000(), str10, str12);
                            recyclerView4.setAdapter(c1114oOOoo0O2);
                            c1114oOOoo0O2.OooO0oO(arrayList3);
                            textView3.setVisibility(8);
                            recyclerView4.setVisibility(0);
                            return;
                        }
                    } else {
                        textView3.setVisibility(8);
                        i2 = 0;
                    }
                    textView4.setVisibility(i2);
                    return;
                } catch (Exception e2) {
                    throw new RuntimeException(e2);
                }
        }
    }
}


