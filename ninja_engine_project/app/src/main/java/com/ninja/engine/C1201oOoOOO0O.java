package com.ninja.engine;

import android.app.ActivityManager;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatSpinner;
import java.util.Timer;
/* renamed from: com.ninja.engine.oOoOOO0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1201oOoOOO0O extends AbstractComponentCallbacksC0593o0oOoOo0 {
    public long OoooOO0 = 0;
    public Timer o000oOoO;

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final View OooOo0O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_settings, viewGroup, false);
        TextView textView = (TextView) inflate.findViewById(R.id.settings_username);
        TextView textView2 = (TextView) inflate.findViewById(R.id.settings_status);
        Button button = (Button) inflate.findViewById(R.id.btn_logout);
        AppCompatSpinner appCompatSpinner = (AppCompatSpinner) inflate.findViewById(R.id.settings_spinner_language);
        TextView textView3 = (TextView) inflate.findViewById(R.id.textview_days);
        TextView textView4 = (TextView) inflate.findViewById(R.id.textview_hours);
        TextView textView5 = (TextView) inflate.findViewById(R.id.textview_minutes);
        TextView textView6 = (TextView) inflate.findViewById(R.id.textview_seconds);
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(Oooo000(), R.array.languages, R.layout.spinner_item_white);
        createFromResource.setDropDownViewResource(R.layout.spinner_dropdown_item_white);
        appCompatSpinner.setAdapter((SpinnerAdapter) createFromResource);
        String OooOoo0 = AbstractC0692o0ooooOo.OooOoo0(Oooo000());
        char c = 65535;
        switch (OooOoo0.hashCode()) {
            case -1883983667:
                if (OooOoo0.equals("Chinese")) {
                    c = 0;
                    break;
                }
                break;
            case -1074763917:
                if (OooOoo0.equals("Russian")) {
                    c = 1;
                    break;
                }
                break;
            case 69730482:
                if (OooOoo0.equals("Hindi")) {
                    c = 2;
                    break;
                }
                break;
            case 699082148:
                if (OooOoo0.equals("Turkish")) {
                    c = 3;
                    break;
                }
                break;
            case 1301275074:
                if (OooOoo0.equals("Kurdish")) {
                    c = 4;
                    break;
                }
                break;
            case 1969163468:
                if (OooOoo0.equals("Arabic")) {
                    c = 5;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                i = 3;
                appCompatSpinner.setSelection(i);
                break;
            case 1:
                i = 4;
                appCompatSpinner.setSelection(i);
                break;
            case 2:
                appCompatSpinner.setSelection(5);
                break;
            case 3:
                appCompatSpinner.setSelection(2);
                break;
            case 4:
                i = 6;
                appCompatSpinner.setSelection(i);
                break;
            case 5:
                appCompatSpinner.setSelection(1);
                break;
            default:
                appCompatSpinner.setSelection(i);
                break;
        }
        appCompatSpinner.setOnTouchListener(new View$OnTouchListenerC0816oO0o000O(this, appCompatSpinner, 1));
        try {
            SharedPreferences sharedPreferences = MainActivity.OooO00o;
            if (sharedPreferences != null) {
                textView.setText(sharedPreferences.getString("username-activation", "—"));
            }
        } catch (Exception unused) {
        }
        Bundle bundle = this.OooO0o;
        if (bundle != null) {
            this.OoooOO0 = bundle.getLong("remaining-time", 0L);
        }
        Timer timer = new Timer();
        this.o000oOoO = timer;
        timer.scheduleAtFixedRate(new C1199oOoOOO0(this, textView3, textView4, textView5, textView6, (ActivityManager) Oooo000().getSystemService("activity"), textView2), 0L, 1000L);
        button.setOnClickListener(new View$OnClickListenerC0056OoooooO(8, this));
        return inflate;
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOo0o() {
        this.OooOoo = true;
        Timer timer = this.o000oOoO;
        if (timer != null) {
            timer.cancel();
            this.o000oOoO = null;
        }
    }
}
