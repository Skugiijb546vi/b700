package com.ninja.engine;

import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.app.framework.app.GoogleSignInHelper;
import com.google.android.material.button.MaterialButton;
import java.util.ArrayList;
import java.util.Iterator;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
/* renamed from: com.ninja.engine.ooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1741ooOO extends AbstractComponentCallbacksC0593o0oOoOo0 {
    public C0054Oooooo OoooOO0;
    public SharedPreferences OoooOOO;
    public ArrayList o000oOoO;

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final View OooOo0O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_account, viewGroup, false);
        RecyclerView recyclerView = (RecyclerView) inflate.findViewById(R.id.rv_accounts);
        MaterialButton materialButton = (MaterialButton) inflate.findViewById(R.id.btn_add_account);
        this.OoooOOO = Oooo000().getSharedPreferences("ninja_accounts", 0);
        Oooo000();
        recyclerView.setLayoutManager(new LinearLayoutManager(1));
        recyclerView.setOverScrollMode(2);
        C0054Oooooo c0054Oooooo = new C0054Oooooo();
        this.OoooOO0 = c0054Oooooo;
        recyclerView.setAdapter(c0054Oooooo);
        this.OoooOO0.OooO0o = new C0331o0O0oo(1, this);
        ArrayList arrayList = new ArrayList();
        String string = this.OoooOOO.getString("account_list", "");
        if (!string.isEmpty()) {
            try {
                JSONArray jSONArray = new JSONArray(string);
                int i2 = 0;
                while (i2 < jSONArray.length()) {
                    JSONObject jSONObject = jSONArray.getJSONObject(i2);
                    String optString = jSONObject.optString("platform", "Google");
                    int i3 = i2 + 1;
                    arrayList.add(new o00O0O(optString, jSONObject.optString("name", "Profile " + i3), jSONObject.optString("id", "—"), jSONObject.optInt("userId", i2)));
                    i2 = i3;
                }
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        this.o000oOoO = arrayList;
        if (arrayList.isEmpty()) {
            this.o000oOoO.add(new o00O0O("Google", "Profile 1", "—", 0));
        }
        C0054Oooooo c0054Oooooo2 = this.OoooOO0;
        ArrayList arrayList2 = this.o000oOoO;
        ArrayList arrayList3 = c0054Oooooo2.OooO0OO;
        arrayList3.clear();
        arrayList3.addAll(arrayList2);
        c0054Oooooo2.OooO0Oo = -1;
        c0054Oooooo2.OooO0o0 = -1;
        while (true) {
            if (i >= arrayList3.size()) {
                break;
            } else if (((o00O0O) arrayList3.get(i)).OooO0Oo) {
                c0054Oooooo2.OooO0Oo = i;
                break;
            } else {
                i++;
            }
        }
        c0054Oooooo2.OooO00o.OooO0O0();
        int i4 = this.OoooOOO.getInt("active_index", -1);
        if (i4 >= 0 && i4 < this.o000oOoO.size()) {
            int i5 = ((o00O0O) this.o000oOoO.get(i4)).OooO0o0;
            this.OoooOO0.OooO0oO(i4);
            this.OoooOOO.edit().putInt("active_user_id", i5).apply();
            GoogleSignInHelper.setActiveUserId(Oooo000(), i5);
        }
        materialButton.setOnClickListener(new View$OnClickListenerC0056OoooooO(0, this));
        return inflate;
    }

    public final void Oooo0o() {
        C0054Oooooo c0054Oooooo = this.OoooOO0;
        c0054Oooooo.getClass();
        ArrayList arrayList = new ArrayList(c0054Oooooo.OooO0OO);
        JSONArray jSONArray = new JSONArray();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            o00O0O o00o0o = (o00O0O) it.next();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("platform", o00o0o.OooO00o);
                jSONObject.put("name", o00o0o.OooO0O0);
                jSONObject.put("id", o00o0o.OooO0OO);
                jSONObject.put("userId", o00o0o.OooO0o0);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            jSONArray.put(jSONObject);
        }
        this.OoooOOO.edit().putString("account_list", jSONArray.toString()).putInt("active_index", this.OoooOO0.OooO0Oo).apply();
    }
}
