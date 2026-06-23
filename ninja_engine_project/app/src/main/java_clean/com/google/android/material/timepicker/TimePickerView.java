package com.google.android.material.timepicker;

import android.content.Context;
import android.util.AttributeSet;
import android.view.GestureDetector;
import android.view.LayoutInflater;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.material.button.MaterialButtonToggleGroup;
import com.google.android.material.chip.Chip;
import com.ninja.engine.R;
import com.ninja.engine.View$OnTouchListenerC0777oO0OOo;
/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class TimePickerView extends ConstraintLayout {
    public static final /* synthetic */ int OooOOo = 0;
    public final Chip OooOOo0;

    public TimePickerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        View$OnClickListenerC0006OooO0o0 view$OnClickListenerC0006OooO0o0 = new View$OnClickListenerC0006OooO0o0(this);
        LayoutInflater.from(context).inflate(R.layout.material_timepicker, this);
        ClockFaceView clockFaceView = (ClockFaceView) findViewById(R.id.material_clock_face);
        ((MaterialButtonToggleGroup) findViewById(R.id.material_clock_period_toggle)).OooO0OO.add(new C0005OooO0Oo(this));
        Chip chip = (Chip) findViewById(R.id.material_minute_tv);
        Chip chip2 = (Chip) findViewById(R.id.material_hour_tv);
        this.OooOOo0 = chip2;
        ClockHandView clockHandView = (ClockHandView) findViewById(R.id.material_clock_hand);
        View$OnTouchListenerC0777oO0OOo view$OnTouchListenerC0777oO0OOo = new View$OnTouchListenerC0777oO0OOo(1, new GestureDetector(getContext(), new OooO0o(this)));
        chip.setOnTouchListener(view$OnTouchListenerC0777oO0OOo);
        chip2.setOnTouchListener(view$OnTouchListenerC0777oO0OOo);
        chip.setTag(R.id.selection_type, 12);
        chip2.setTag(R.id.selection_type, 10);
        chip.setOnClickListener(view$OnClickListenerC0006OooO0o0);
        chip2.setOnClickListener(view$OnClickListenerC0006OooO0o0);
        chip.setAccessibilityClassName("android.view.View");
        chip2.setAccessibilityClassName("android.view.View");
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (view == this && i == 0) {
            this.OooOOo0.sendAccessibilityEvent(8);
        }
    }
}


