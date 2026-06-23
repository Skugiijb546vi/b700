package com.ninja.engine;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o0OoO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0434o0OoO0 extends AbstractC0494o0o000O {
    public final View$OnClickListenerC0056OoooooO OooO;
    public final int OooO0o;
    public final int OooO0o0;
    public final TimeInterpolator OooO0oO;
    public AutoCompleteTextView OooO0oo;
    public final View$OnFocusChangeListenerC0289o0O00Ooo OooOO0;
    public final C0435o0OoO000 OooOO0O;
    public boolean OooOO0o;
    public boolean OooOOO;
    public boolean OooOOO0;
    public long OooOOOO;
    public AccessibilityManager OooOOOo;
    public ValueAnimator OooOOo;
    public ValueAnimator OooOOo0;

    public C0434o0OoO0(C0495o0o000O0 c0495o0o000O0) {
        super(c0495o0o000O0);
        this.OooO = new View$OnClickListenerC0056OoooooO(3, this);
        this.OooOO0 = new View$OnFocusChangeListenerC0289o0O00Ooo(this, 1);
        this.OooOO0O = new C0435o0OoO000(0, this);
        this.OooOOOO = Long.MAX_VALUE;
        this.OooO0o = AbstractC0809oO0OooOO.OooooOO(c0495o0o000O0.getContext(), R.attr.motionDurationShort3, 67);
        this.OooO0o0 = AbstractC0809oO0OooOO.OooooOO(c0495o0o000O0.getContext(), R.attr.motionDurationShort3, 50);
        this.OooO0oO = AbstractC0809oO0OooOO.OooooOo(c0495o0o000O0.getContext(), R.attr.motionEasingLinearInterpolator, o000OO0O.OooO00o);
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final boolean OooO(int i) {
        if (i != 0) {
            return true;
        }
        return false;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooO00o() {
        if (this.OooOOOo.isTouchExplorationEnabled() && AbstractC0694o0ooooo0.OooOooO(this.OooO0oo) && !this.OooO0Oo.hasFocus()) {
            this.OooO0oo.dismissDropDown();
        }
        this.OooO0oo.post(new RunnableC0061o00000oO(9, this));
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final int OooO0OO() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final int OooO0Oo() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final View.OnClickListener OooO0o() {
        return this.OooO;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final View.OnFocusChangeListener OooO0o0() {
        return this.OooOO0;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final C0435o0OoO000 OooO0oo() {
        return this.OooOO0O;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final boolean OooOO0() {
        return this.OooOO0o;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final boolean OooOO0o() {
        return this.OooOOO;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooOOO(C0039OoooO c0039OoooO) {
        boolean OooO0o0;
        boolean OooOooO = AbstractC0694o0ooooo0.OooOooO(this.OooO0oo);
        AccessibilityNodeInfo accessibilityNodeInfo = c0039OoooO.OooO00o;
        if (!OooOooO) {
            accessibilityNodeInfo.setClassName(Spinner.class.getName());
        }
        if (Build.VERSION.SDK_INT >= 26) {
            OooO0o0 = accessibilityNodeInfo.isShowingHintText();
        } else {
            OooO0o0 = c0039OoooO.OooO0o0(4);
        }
        if (OooO0o0) {
            c0039OoooO.OooOO0(null);
        }
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooOOO0(EditText editText) {
        if (editText instanceof AutoCompleteTextView) {
            AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
            this.OooO0oo = autoCompleteTextView;
            autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.ninja.engine.o0Oo
                @Override // android.view.View.OnTouchListener
                public final boolean onTouch(View view, MotionEvent motionEvent) {
                    boolean z;
                    C0434o0OoO0 c0434o0OoO0 = C0434o0OoO0.this;
                    c0434o0OoO0.getClass();
                    if (motionEvent.getAction() == 1) {
                        long currentTimeMillis = System.currentTimeMillis() - c0434o0OoO0.OooOOOO;
                        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
                            z = false;
                        } else {
                            z = true;
                        }
                        if (z) {
                            c0434o0OoO0.OooOOO0 = false;
                        }
                        c0434o0OoO0.OooOo0();
                        c0434o0OoO0.OooOOO0 = true;
                        c0434o0OoO0.OooOOOO = System.currentTimeMillis();
                    }
                    return false;
                }
            });
            this.OooO0oo.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.ninja.engine.o0OooOoo
                @Override // android.widget.AutoCompleteTextView.OnDismissListener
                public final void onDismiss() {
                    C0434o0OoO0 c0434o0OoO0 = C0434o0OoO0.this;
                    c0434o0OoO0.OooOOO0 = true;
                    c0434o0OoO0.OooOOOO = System.currentTimeMillis();
                    c0434o0OoO0.OooOo00(false);
                }
            });
            this.OooO0oo.setThreshold(0);
            TextInputLayout textInputLayout = this.OooO00o;
            textInputLayout.setErrorIconDrawable((Drawable) null);
            if (!AbstractC0694o0ooooo0.OooOooO(editText) && this.OooOOOo.isTouchExplorationEnabled()) {
                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                this.OooO0Oo.setImportantForAccessibility(2);
            }
            textInputLayout.setEndIconVisible(true);
            return;
        }
        throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooOOOO(AccessibilityEvent accessibilityEvent) {
        boolean z;
        if (this.OooOOOo.isEnabled() && !AbstractC0694o0ooooo0.OooOooO(this.OooO0oo)) {
            if ((accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.OooOOO && !this.OooO0oo.isPopupShowing()) {
                z = true;
            } else {
                z = false;
            }
            if (accessibilityEvent.getEventType() == 1 || z) {
                OooOo0();
                this.OooOOO0 = true;
                this.OooOOOO = System.currentTimeMillis();
            }
        }
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooOOo() {
        ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.OooO0oO;
        ofFloat.setInterpolator(timeInterpolator);
        ofFloat.setDuration(this.OooO0o);
        ofFloat.addUpdateListener(new C0433o0Oo0ooo(0, this));
        this.OooOOo = ofFloat;
        ValueAnimator ofFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        ofFloat2.setInterpolator(timeInterpolator);
        ofFloat2.setDuration(this.OooO0o0);
        ofFloat2.addUpdateListener(new C0433o0Oo0ooo(0, this));
        this.OooOOo0 = ofFloat2;
        ofFloat2.addListener(new C0200o00o0O(2, this));
        this.OooOOOo = (AccessibilityManager) this.OooO0OO.getSystemService("accessibility");
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooOOoo() {
        AutoCompleteTextView autoCompleteTextView = this.OooO0oo;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.OooO0oo.setOnDismissListener(null);
        }
    }

    public final void OooOo0() {
        boolean z;
        if (this.OooO0oo == null) {
            return;
        }
        long currentTimeMillis = System.currentTimeMillis() - this.OooOOOO;
        if (currentTimeMillis >= 0 && currentTimeMillis <= 300) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            this.OooOOO0 = false;
        }
        if (!this.OooOOO0) {
            OooOo00(!this.OooOOO);
            if (this.OooOOO) {
                this.OooO0oo.requestFocus();
                this.OooO0oo.showDropDown();
                return;
            }
            this.OooO0oo.dismissDropDown();
            return;
        }
        this.OooOOO0 = false;
    }

    public final void OooOo00(boolean z) {
        if (this.OooOOO != z) {
            this.OooOOO = z;
            this.OooOOo.cancel();
            this.OooOOo0.start();
        }
    }
}


