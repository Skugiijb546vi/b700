package com.ninja.engine;

import android.text.method.PasswordTransformationMethod;
import android.view.View;
import android.widget.EditText;
/* renamed from: com.ninja.engine.oOOO0ooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0990oOOO0ooO extends AbstractC0494o0o000O {
    public EditText OooO0o;
    public final int OooO0o0;
    public final View$OnClickListenerC0056OoooooO OooO0oO;

    public C0990oOOO0ooO(C0495o0o000O0 c0495o0o000O0, int i) {
        super(c0495o0o000O0);
        this.OooO0o0 = R.drawable.design_password_eye;
        this.OooO0oO = new View$OnClickListenerC0056OoooooO(7, this);
        if (i != 0) {
            this.OooO0o0 = i;
        }
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooO0O0() {
        OooOOo0();
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final int OooO0OO() {
        return R.string.password_toggle_content_description;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final int OooO0Oo() {
        return this.OooO0o0;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final View.OnClickListener OooO0o() {
        return this.OooO0oO;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final boolean OooOO0O() {
        return true;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final boolean OooOO0o() {
        boolean z;
        EditText editText = this.OooO0o;
        if (editText != null && (editText.getTransformationMethod() instanceof PasswordTransformationMethod)) {
            z = true;
        } else {
            z = false;
        }
        return !z;
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooOOO0(EditText editText) {
        this.OooO0o = editText;
        OooOOo0();
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooOOo() {
        EditText editText = this.OooO0o;
        if (editText != null) {
            if (editText.getInputType() == 16 || editText.getInputType() == 128 || editText.getInputType() == 144 || editText.getInputType() == 224) {
                this.OooO0o.setTransformationMethod(PasswordTransformationMethod.getInstance());
            }
        }
    }

    @Override // com.ninja.engine.AbstractC0494o0o000O
    public final void OooOOoo() {
        EditText editText = this.OooO0o;
        if (editText != null) {
            editText.setTransformationMethod(PasswordTransformationMethod.getInstance());
        }
    }
}
