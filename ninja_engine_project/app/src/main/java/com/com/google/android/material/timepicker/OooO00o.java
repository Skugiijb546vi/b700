package com.google.android.material.timepicker;

import android.text.Editable;
import android.text.TextUtils;
import com.google.android.material.chip.Chip;
import com.ninja.engine.AbstractC1310oOooOOo;
/* loaded from: classes.dex */
public final class OooO00o extends AbstractC1310oOooOOo {
    public final /* synthetic */ ChipTextInputComboView OooO00o;

    public OooO00o(ChipTextInputComboView chipTextInputComboView) {
        this.OooO00o = chipTextInputComboView;
    }

    @Override // android.text.TextWatcher
    public final void afterTextChanged(Editable editable) {
        boolean isEmpty = TextUtils.isEmpty(editable);
        ChipTextInputComboView chipTextInputComboView = this.OooO00o;
        if (isEmpty) {
            chipTextInputComboView.OooO00o.setText(ChipTextInputComboView.OooO00o(chipTextInputComboView, "00"));
            return;
        }
        String OooO00o = ChipTextInputComboView.OooO00o(chipTextInputComboView, editable);
        Chip chip = chipTextInputComboView.OooO00o;
        if (TextUtils.isEmpty(OooO00o)) {
            OooO00o = ChipTextInputComboView.OooO00o(chipTextInputComboView, "00");
        }
        chip.setText(OooO00o);
    }
}
