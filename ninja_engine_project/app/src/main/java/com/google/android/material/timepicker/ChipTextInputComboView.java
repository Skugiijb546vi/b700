package com.google.android.material.timepicker;

import android.content.Context;
import android.content.res.Configuration;
import android.os.Build;
import android.os.LocaleList;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Checkable;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.google.android.material.chip.Chip;
import com.google.android.material.textfield.TextInputLayout;
import com.ninja.engine.AbstractC1460oo0O00oo;
import com.ninja.engine.R;
import com.ninja.engine.RunnableC0711oO000oo0;
import java.util.WeakHashMap;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class ChipTextInputComboView extends FrameLayout implements Checkable {
    public final Chip OooO00o;
    public final EditText OooO0O0;

    public ChipTextInputComboView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        LocaleList locales;
        LayoutInflater from = LayoutInflater.from(context);
        Chip chip = (Chip) from.inflate(R.layout.material_time_chip, (ViewGroup) this, false);
        this.OooO00o = chip;
        chip.setAccessibilityClassName("android.view.View");
        TextInputLayout textInputLayout = (TextInputLayout) from.inflate(R.layout.material_time_input, (ViewGroup) this, false);
        EditText editText = textInputLayout.getEditText();
        this.OooO0O0 = editText;
        editText.setVisibility(4);
        editText.addTextChangedListener(new OooO00o(this));
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            editText.setImeHintLocales(locales);
        }
        addView(chip);
        addView(textInputLayout);
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        editText.setId(View.generateViewId());
        ((TextView) findViewById(R.id.material_label)).setLabelFor(editText.getId());
        editText.setSaveEnabled(false);
        editText.setLongClickable(false);
    }

    public static String OooO00o(ChipTextInputComboView chipTextInputComboView, CharSequence charSequence) {
        try {
            return String.format(chipTextInputComboView.getResources().getConfiguration().locale, "%02d", Integer.valueOf(Integer.parseInt(String.valueOf(charSequence))));
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    @Override // android.widget.Checkable
    public final boolean isChecked() {
        return this.OooO00o.isChecked();
    }

    @Override // android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        LocaleList locales;
        super.onConfigurationChanged(configuration);
        if (Build.VERSION.SDK_INT >= 24) {
            locales = getContext().getResources().getConfiguration().getLocales();
            this.OooO0O0.setImeHintLocales(locales);
        }
    }

    @Override // android.widget.Checkable
    public final void setChecked(boolean z) {
        int i;
        Chip chip = this.OooO00o;
        chip.setChecked(z);
        int i2 = 0;
        if (z) {
            i = 0;
        } else {
            i = 4;
        }
        EditText editText = this.OooO0O0;
        editText.setVisibility(i);
        if (z) {
            i2 = 8;
        }
        chip.setVisibility(i2);
        if (chip.isChecked()) {
            editText.requestFocus();
            editText.post(new RunnableC0711oO000oo0(editText));
        }
    }

    @Override // android.view.View
    public final void setOnClickListener(View.OnClickListener onClickListener) {
        this.OooO00o.setOnClickListener(onClickListener);
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        this.OooO00o.setTag(i, obj);
    }

    @Override // android.widget.Checkable
    public final void toggle() {
        this.OooO00o.toggle();
    }
}
