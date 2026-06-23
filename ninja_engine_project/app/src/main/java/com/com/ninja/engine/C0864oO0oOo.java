package com.ninja.engine;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.StateListDrawable;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.WindowInsetsController;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.app.framework.utils.ShellUtils;
import com.google.android.material.internal.CheckableImageButton;
import java.util.Calendar;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oO0oOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0864oO0oOo<S> extends DialogInterface$OnCancelListenerC0390o0OOoO0o {
    public final LinkedHashSet Ooooooo;
    public CharSequence o00000;
    public C0875oO0oOooo o000000;
    public boolean o000000O;
    public CharSequence o000000o;
    public CheckableImageButton o000OOo;
    public AbstractC0993oOOOO00 o00O0O;
    public o0O0o o00Oo0;
    public C0863oO0oOOoo o00Ooo;
    public int o00o0O;
    public int o00oO0O;
    public int o00oO0o;
    public CharSequence o00ooo;
    public TextView o0O0O00;
    public int o0OO00O;
    public int o0OOO0o;
    public CharSequence o0Oo0oo;
    public final LinkedHashSet o0OoOo0;
    public CharSequence o0ooOO0;
    public int o0ooOOo;
    public CharSequence o0ooOoO;
    public boolean oo000o;
    public CharSequence oo0o0Oo;
    public int ooOO;

    public C0864oO0oOo() {
        new LinkedHashSet();
        new LinkedHashSet();
        this.Ooooooo = new LinkedHashSet();
        this.o0OoOo0 = new LinkedHashSet();
    }

    public static int Oooo(Context context) {
        Resources resources = context.getResources();
        int dimensionPixelOffset = resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_content_padding);
        Calendar OooO0OO = AbstractC1399oo00OO0o.OooO0OO();
        OooO0OO.set(5, 1);
        Calendar OooO0O0 = AbstractC1399oo00OO0o.OooO0O0(OooO0OO);
        OooO0O0.get(2);
        OooO0O0.get(1);
        int maximum = OooO0O0.getMaximum(7);
        OooO0O0.getActualMaximum(5);
        OooO0O0.getTimeInMillis();
        int dimensionPixelSize = resources.getDimensionPixelSize(R.dimen.mtrl_calendar_day_width) * maximum;
        return ((maximum - 1) * resources.getDimensionPixelOffset(R.dimen.mtrl_calendar_month_horizontal_padding)) + dimensionPixelSize + (dimensionPixelOffset * 2);
    }

    public static boolean OoooO00(Context context, int i) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0692o0ooooOo.OoooOo0(context, C0863oO0oOOoo.class.getCanonicalName(), R.attr.materialCalendarStyle).data, new int[]{i});
        boolean z = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        return z;
    }

    @Override // com.ninja.engine.DialogInterface$OnCancelListenerC0390o0OOoO0o, com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOo0(Bundle bundle) {
        super.OooOo0(bundle);
        if (bundle == null) {
            bundle = this.OooO0o;
        }
        this.ooOO = bundle.getInt("OVERRIDE_THEME_RES_ID");
        AbstractC1230oOoOo0o.OooOO0(bundle.getParcelable("DATE_SELECTOR_KEY"));
        this.o00Oo0 = (o0O0o) bundle.getParcelable("CALENDAR_CONSTRAINTS_KEY");
        AbstractC1230oOoOo0o.OooOO0(bundle.getParcelable("DAY_VIEW_DECORATOR_KEY"));
        this.o00o0O = bundle.getInt("TITLE_TEXT_RES_ID_KEY");
        this.o00ooo = bundle.getCharSequence("TITLE_TEXT_KEY");
        this.o00oO0o = bundle.getInt("INPUT_MODE_KEY");
        this.o00oO0O = bundle.getInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY");
        this.o0ooOO0 = bundle.getCharSequence("POSITIVE_BUTTON_TEXT_KEY");
        this.o0ooOOo = bundle.getInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.o0ooOoO = bundle.getCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        this.o0OOO0o = bundle.getInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY");
        this.o0Oo0oo = bundle.getCharSequence("NEGATIVE_BUTTON_TEXT_KEY");
        this.o0OO00O = bundle.getInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY");
        this.oo0o0Oo = bundle.getCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY");
        CharSequence charSequence = this.o00ooo;
        if (charSequence == null) {
            charSequence = Oooo00O().getResources().getText(this.o00o0O);
        }
        this.o000000o = charSequence;
        if (charSequence != null) {
            CharSequence[] split = TextUtils.split(String.valueOf(charSequence), ShellUtils.COMMAND_LINE_END);
            if (split.length > 1) {
                charSequence = split[0];
            }
        } else {
            charSequence = null;
        }
        this.o00000 = charSequence;
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final View OooOo0O(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        int i;
        View findViewById;
        LinearLayout.LayoutParams layoutParams;
        int i2;
        if (this.oo000o) {
            i = R.layout.mtrl_picker_fullscreen;
        } else {
            i = R.layout.mtrl_picker_dialog;
        }
        View inflate = layoutInflater.inflate(i, viewGroup);
        Context context = inflate.getContext();
        if (this.oo000o) {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_frame);
            layoutParams = new LinearLayout.LayoutParams(Oooo(context), -2);
        } else {
            findViewById = inflate.findViewById(R.id.mtrl_calendar_main_pane);
            layoutParams = new LinearLayout.LayoutParams(Oooo(context), -1);
        }
        findViewById.setLayoutParams(layoutParams);
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        ((TextView) inflate.findViewById(R.id.mtrl_picker_header_selection_text)).setAccessibilityLiveRegion(1);
        this.o000OOo = (CheckableImageButton) inflate.findViewById(R.id.mtrl_picker_header_toggle);
        this.o0O0O00 = (TextView) inflate.findViewById(R.id.mtrl_picker_title_text);
        this.o000OOo.setTag("TOGGLE_BUTTON_TAG");
        CheckableImageButton checkableImageButton = this.o000OOo;
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842912}, AbstractC0692o0ooooOo.OooOo0(context, R.drawable.material_ic_calendar_black_24dp));
        boolean z = false;
        stateListDrawable.addState(new int[0], AbstractC0692o0ooooOo.OooOo0(context, R.drawable.material_ic_edit_black_24dp));
        checkableImageButton.setImageDrawable(stateListDrawable);
        CheckableImageButton checkableImageButton2 = this.o000OOo;
        if (this.o00oO0o != 0) {
            z = true;
        }
        checkableImageButton2.setChecked(z);
        AbstractC1460oo0O00oo.OooOOOo(this.o000OOo, null);
        CheckableImageButton checkableImageButton3 = this.o000OOo;
        int i3 = this.o00oO0o;
        Context context2 = checkableImageButton3.getContext();
        if (i3 == 1) {
            i2 = R.string.mtrl_picker_toggle_to_calendar_input_mode;
        } else {
            i2 = R.string.mtrl_picker_toggle_to_text_input_mode;
        }
        this.o000OOo.setContentDescription(context2.getString(i2));
        this.o000OOo.setOnClickListener(new View$OnClickListenerC0056OoooooO(6, this));
        Button button = (Button) inflate.findViewById(R.id.confirm_button);
        Oooo0oo();
        throw null;
    }

    /* JADX WARN: Type inference failed for: r2v2, types: [com.ninja.engine.o00oo0oO, java.lang.Object] */
    @Override // com.ninja.engine.DialogInterface$OnCancelListenerC0390o0OOoO0o, com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOoOO(Bundle bundle) {
        C0906oOO000oo c0906oOO000oo;
        C0906oOO000oo OooO0O0;
        super.OooOoOO(bundle);
        bundle.putInt("OVERRIDE_THEME_RES_ID", this.ooOO);
        bundle.putParcelable("DATE_SELECTOR_KEY", null);
        o0O0o o0o0o = this.o00Oo0;
        ?? obj = new Object();
        int i = C0259o00oo0oO.OooO0O0;
        int i2 = C0259o00oo0oO.OooO0O0;
        long j = o0o0o.OooO00o.OooO0o;
        long j2 = o0o0o.OooO0O0.OooO0o;
        obj.OooO00o = Long.valueOf(o0o0o.OooO0Oo.OooO0o);
        C0863oO0oOOoo c0863oO0oOOoo = this.o00Ooo;
        if (c0863oO0oOOoo == null) {
            c0906oOO000oo = null;
        } else {
            c0906oOO000oo = c0863oO0oOOoo.OoooOOo;
        }
        if (c0906oOO000oo != null) {
            obj.OooO00o = Long.valueOf(c0906oOO000oo.OooO0o);
        }
        Bundle bundle2 = new Bundle();
        bundle2.putParcelable("DEEP_COPY_VALIDATOR_KEY", o0o0o.OooO0OO);
        C0906oOO000oo OooO0O02 = C0906oOO000oo.OooO0O0(j);
        C0906oOO000oo OooO0O03 = C0906oOO000oo.OooO0O0(j2);
        C0350o0OO0oOo c0350o0OO0oOo = (C0350o0OO0oOo) bundle2.getParcelable("DEEP_COPY_VALIDATOR_KEY");
        Long l = obj.OooO00o;
        if (l == null) {
            OooO0O0 = null;
        } else {
            OooO0O0 = C0906oOO000oo.OooO0O0(l.longValue());
        }
        bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", new o0O0o(OooO0O02, OooO0O03, c0350o0OO0oOo, OooO0O0, o0o0o.OooO0o0));
        bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
        bundle.putInt("TITLE_TEXT_RES_ID_KEY", this.o00o0O);
        bundle.putCharSequence("TITLE_TEXT_KEY", this.o00ooo);
        bundle.putInt("INPUT_MODE_KEY", this.o00oO0o);
        bundle.putInt("POSITIVE_BUTTON_TEXT_RES_ID_KEY", this.o00oO0O);
        bundle.putCharSequence("POSITIVE_BUTTON_TEXT_KEY", this.o0ooOO0);
        bundle.putInt("POSITIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.o0ooOOo);
        bundle.putCharSequence("POSITIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.o0ooOoO);
        bundle.putInt("NEGATIVE_BUTTON_TEXT_RES_ID_KEY", this.o0OOO0o);
        bundle.putCharSequence("NEGATIVE_BUTTON_TEXT_KEY", this.o0Oo0oo);
        bundle.putInt("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_RES_ID_KEY", this.o0OO00O);
        bundle.putCharSequence("NEGATIVE_BUTTON_CONTENT_DESCRIPTION_KEY", this.oo0o0Oo);
    }

    @Override // com.ninja.engine.DialogInterface$OnCancelListenerC0390o0OOoO0o, com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOoo() {
        this.o00O0O.OoooOO0.clear();
        super.OooOoo();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.ninja.engine.DialogInterface$OnCancelListenerC0390o0OOoO0o, com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOoo0() {
        CharSequence charSequence;
        Integer num;
        boolean z;
        int i;
        int i2;
        boolean z2;
        WindowInsetsController insetsController;
        C1537oo0OoOoo c1537oo0OoOoo;
        boolean z3;
        WindowInsetsController insetsController2;
        C1537oo0OoOoo c1537oo0OoOoo2;
        WindowInsetsController insetsController3;
        WindowInsetsController insetsController4;
        super.OooOoo0();
        Dialog dialog = this.OooooOo;
        if (dialog != null) {
            Window window = dialog.getWindow();
            if (this.oo000o) {
                window.setLayout(-1, -1);
                window.setBackgroundDrawable(this.o000000);
                if (!this.o000000O) {
                    View findViewById = Oooo00o().findViewById(R.id.fullscreen_header);
                    ColorStateList OooOoO0 = AbstractC0694o0ooooo0.OooOoO0(findViewById.getBackground());
                    if (OooOoO0 != null) {
                        num = Integer.valueOf(OooOoO0.getDefaultColor());
                    } else {
                        num = null;
                    }
                    int i3 = Build.VERSION.SDK_INT;
                    if (num != null && num.intValue() != 0) {
                        z = false;
                    } else {
                        z = true;
                    }
                    int OooOo0o = AbstractC0694o0ooooo0.OooOo0o(window.getContext(), 16842801, -16777216);
                    if (z) {
                        num = Integer.valueOf(OooOo0o);
                    }
                    if (i3 >= 35) {
                        window.setDecorFitsSystemWindows(false);
                    } else if (i3 >= 30) {
                        AbstractC0030Oooo.OooO0OO(window, false);
                    } else {
                        View decorView = window.getDecorView();
                        decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 1792);
                    }
                    Context context = window.getContext();
                    if (i3 < 23) {
                        i = o0O0OO0.OooO0Oo(AbstractC0694o0ooooo0.OooOo0o(context, 16843857, -16777216), 128);
                    } else {
                        i = 0;
                    }
                    Context context2 = window.getContext();
                    if (i3 < 27) {
                        i2 = o0O0OO0.OooO0Oo(AbstractC0694o0ooooo0.OooOo0o(context2, 16843858, -16777216), 128);
                    } else {
                        i2 = 0;
                    }
                    window.setStatusBarColor(i);
                    window.setNavigationBarColor(i2);
                    boolean OooOoo = AbstractC0694o0ooooo0.OooOoo(num.intValue());
                    if (!AbstractC0694o0ooooo0.OooOoo(i) && (i != 0 || !OooOoo)) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    o00O o00o = new o00O(window.getDecorView());
                    int i4 = Build.VERSION.SDK_INT;
                    if (i4 >= 35) {
                        insetsController4 = window.getInsetsController();
                        C1541oo0Ooo0o c1541oo0Ooo0o = new C1541oo0Ooo0o(insetsController4, o00o);
                        c1541oo0Ooo0o.OooO0Oo = window;
                        c1537oo0OoOoo = c1541oo0Ooo0o;
                    } else if (i4 >= 30) {
                        insetsController = window.getInsetsController();
                        C1541oo0Ooo0o c1541oo0Ooo0o2 = new C1541oo0Ooo0o(insetsController, o00o);
                        c1541oo0Ooo0o2.OooO0Oo = window;
                        c1537oo0OoOoo = c1541oo0Ooo0o2;
                    } else if (i4 >= 26) {
                        c1537oo0OoOoo = new C1537oo0OoOoo(window, o00o);
                    } else if (i4 >= 23) {
                        c1537oo0OoOoo = new C1537oo0OoOoo(window, o00o);
                    } else {
                        c1537oo0OoOoo = new C1537oo0OoOoo(window, o00o);
                    }
                    c1537oo0OoOoo.OooOOO(z2);
                    boolean OooOoo2 = AbstractC0694o0ooooo0.OooOoo(OooOo0o);
                    if (!AbstractC0694o0ooooo0.OooOoo(i2) && (i2 != 0 || !OooOoo2)) {
                        z3 = false;
                    } else {
                        z3 = true;
                    }
                    o00O o00o2 = new o00O(window.getDecorView());
                    int i5 = Build.VERSION.SDK_INT;
                    if (i5 >= 35) {
                        insetsController3 = window.getInsetsController();
                        C1541oo0Ooo0o c1541oo0Ooo0o3 = new C1541oo0Ooo0o(insetsController3, o00o2);
                        c1541oo0Ooo0o3.OooO0Oo = window;
                        c1537oo0OoOoo2 = c1541oo0Ooo0o3;
                    } else if (i5 >= 30) {
                        insetsController2 = window.getInsetsController();
                        C1541oo0Ooo0o c1541oo0Ooo0o4 = new C1541oo0Ooo0o(insetsController2, o00o2);
                        c1541oo0Ooo0o4.OooO0Oo = window;
                        c1537oo0OoOoo2 = c1541oo0Ooo0o4;
                    } else if (i5 >= 26) {
                        c1537oo0OoOoo2 = new C1537oo0OoOoo(window, o00o2);
                    } else if (i5 >= 23) {
                        c1537oo0OoOoo2 = new C1537oo0OoOoo(window, o00o2);
                    } else {
                        c1537oo0OoOoo2 = new C1537oo0OoOoo(window, o00o2);
                    }
                    c1537oo0OoOoo2.OooOOO0(z3);
                    C0240o00oOo0o c0240o00oOo0o = new C0240o00oOo0o(findViewById, findViewById.getLayoutParams().height, findViewById.getPaddingTop());
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    AbstractC1452oo0O000o.OooOOO0(findViewById, c0240o00oOo0o);
                    this.o000000O = true;
                }
            } else {
                window.setLayout(-2, -2);
                int dimensionPixelOffset = OooOO0o().getDimensionPixelOffset(R.dimen.mtrl_calendar_dialog_background_inset);
                Rect rect = new Rect(dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset);
                window.setBackgroundDrawable(new InsetDrawable((Drawable) this.o000000, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset, dimensionPixelOffset));
                View decorView2 = window.getDecorView();
                Dialog dialog2 = this.OooooOo;
                if (dialog2 != null) {
                    decorView2.setOnTouchListener(new View$OnTouchListenerC0722oO00Ooo(dialog2, rect));
                } else {
                    throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
                }
            }
            Oooo00O();
            int i6 = this.ooOO;
            if (i6 != 0) {
                Oooo0oo();
                o0O0o o0o0o = this.o00Oo0;
                C0863oO0oOOoo c0863oO0oOOoo = new C0863oO0oOOoo();
                Bundle bundle = new Bundle();
                bundle.putInt("THEME_RES_ID_KEY", i6);
                bundle.putParcelable("GRID_SELECTOR_KEY", null);
                bundle.putParcelable("CALENDAR_CONSTRAINTS_KEY", o0o0o);
                bundle.putParcelable("DAY_VIEW_DECORATOR_KEY", null);
                bundle.putParcelable("CURRENT_MONTH_KEY", o0o0o.OooO0Oo);
                c0863oO0oOOoo.Oooo0OO(bundle);
                this.o00Ooo = c0863oO0oOOoo;
                AbstractC0993oOOOO00 abstractC0993oOOOO00 = c0863oO0oOOoo;
                if (this.o00oO0o == 1) {
                    Oooo0oo();
                    o0O0o o0o0o2 = this.o00Oo0;
                    AbstractC0993oOOOO00 c0871oO0oOoOo = new C0871oO0oOoOo();
                    Bundle bundle2 = new Bundle();
                    bundle2.putInt("THEME_RES_ID_KEY", i6);
                    bundle2.putParcelable("DATE_SELECTOR_KEY", null);
                    bundle2.putParcelable("CALENDAR_CONSTRAINTS_KEY", o0o0o2);
                    c0871oO0oOoOo.Oooo0OO(bundle2);
                    abstractC0993oOOOO00 = c0871oO0oOoOo;
                }
                this.o00O0O = abstractC0993oOOOO00;
                TextView textView = this.o0O0O00;
                if (this.o00oO0o == 1 && OooOO0o().getConfiguration().orientation == 2) {
                    charSequence = this.o00000;
                } else {
                    charSequence = this.o000000o;
                }
                textView.setText(charSequence);
                Oooo0oo();
                OooO();
                throw null;
            }
            Oooo0oo();
            throw null;
        }
        throw new IllegalStateException("DialogFragment " + this + " does not have a Dialog.");
    }

    @Override // com.ninja.engine.DialogInterface$OnCancelListenerC0390o0OOoO0o
    public final Dialog Oooo0oO() {
        Context Oooo00O = Oooo00O();
        Oooo00O();
        int i = this.ooOO;
        if (i != 0) {
            Dialog dialog = new Dialog(Oooo00O, i);
            Context context = dialog.getContext();
            this.oo000o = OoooO00(context, 16843277);
            this.o000000 = new C0875oO0oOooo(context, null, R.attr.materialCalendarStyle, 2131952679);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1038oOOOoo0O.OooOOOo, R.attr.materialCalendarStyle, 2131952679);
            int color = obtainStyledAttributes.getColor(1, 0);
            obtainStyledAttributes.recycle();
            this.o000000.OooOO0(context);
            this.o000000.OooOO0o(ColorStateList.valueOf(color));
            C0875oO0oOooo c0875oO0oOooo = this.o000000;
            View decorView = dialog.getWindow().getDecorView();
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            c0875oO0oOooo.OooOO0O(AbstractC1452oo0O000o.OooO0o0(decorView));
            return dialog;
        }
        Oooo0oo();
        throw null;
    }

    public final void Oooo0oo() {
        AbstractC1230oOoOo0o.OooOO0(this.OooO0o.getParcelable("DATE_SELECTOR_KEY"));
    }

    @Override // com.ninja.engine.DialogInterface$OnCancelListenerC0390o0OOoO0o, android.content.DialogInterface.OnCancelListener
    public final void onCancel(DialogInterface dialogInterface) {
        Iterator it = this.Ooooooo.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnCancelListener) it.next()).onCancel(dialogInterface);
        }
    }

    @Override // com.ninja.engine.DialogInterface$OnCancelListenerC0390o0OOoO0o, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Iterator it = this.o0OoOo0.iterator();
        while (it.hasNext()) {
            ((DialogInterface.OnDismissListener) it.next()).onDismiss(dialogInterface);
        }
        ViewGroup viewGroup = (ViewGroup) this.OooOooo;
        if (viewGroup != null) {
            viewGroup.removeAllViews();
        }
        super.onDismiss(dialogInterface);
    }
}
