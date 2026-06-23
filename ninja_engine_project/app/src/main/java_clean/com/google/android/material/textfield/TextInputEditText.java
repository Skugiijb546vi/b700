package com.google.android.material.textfield;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Point;
import android.graphics.Rect;
import android.os.Build;
import android.text.Editable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import com.ninja.engine.AbstractC0692o0ooooOo;
import com.ninja.engine.AbstractC1038oOOOoo0O;
import com.ninja.engine.AbstractC1230oOoOo0o;
import com.ninja.engine.C0110o000oo;
import com.ninja.engine.R;
import java.util.Locale;
/* loaded from: classes.dex */
public class TextInputEditText extends C0110o000oo {
    public final Rect OooO0oO;
    public boolean OooO0oo;

    public TextInputEditText(Context context, AttributeSet attributeSet) {
        super(AbstractC0692o0ooooOo.Oooooo(context, attributeSet, R.attr.editTextStyle, 0), attributeSet, 0);
        this.OooO0oO = new Rect();
        int[] iArr = AbstractC1038oOOOoo0O.Oooo000;
        AbstractC0692o0ooooOo.OooOO0(context, attributeSet, R.attr.editTextStyle, 2131952452);
        AbstractC0692o0ooooOo.OooOO0O(context, attributeSet, iArr, R.attr.editTextStyle, 2131952452, new int[0]);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, R.attr.editTextStyle, 2131952452);
        setTextInputLayoutFocusedRectEnabled(obtainStyledAttributes.getBoolean(0, false));
        obtainStyledAttributes.recycle();
    }

    private CharSequence getHintFromLayout() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null) {
            return textInputLayout.getHint();
        }
        return null;
    }

    private TextInputLayout getTextInputLayout() {
        for (ViewParent parent = getParent(); parent instanceof View; parent = parent.getParent()) {
            if (parent instanceof TextInputLayout) {
                return (TextInputLayout) parent;
            }
        }
        return null;
    }

    @Override // android.widget.TextView, android.view.View
    public final void getFocusedRect(Rect rect) {
        super.getFocusedRect(rect);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.OooO0oo && rect != null) {
            Rect rect2 = this.OooO0oO;
            textInputLayout.getFocusedRect(rect2);
            rect.bottom = rect2.bottom;
        }
    }

    @Override // android.view.View
    public final boolean getGlobalVisibleRect(Rect rect, Point point) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.OooO0oo) {
            boolean globalVisibleRect = textInputLayout.getGlobalVisibleRect(rect, point);
            if (globalVisibleRect && point != null) {
                point.offset(-getScrollX(), -getScrollY());
            }
            return globalVisibleRect;
        }
        return super.getGlobalVisibleRect(rect, point);
    }

    @Override // android.widget.TextView
    public CharSequence getHint() {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.OooOooo) {
            return textInputLayout.getHint();
        }
        return super.getHint();
    }

    @Override // android.widget.TextView, android.view.View
    public final void onAttachedToWindow() {
        String str;
        super.onAttachedToWindow();
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && textInputLayout.OooOooo && super.getHint() == null) {
            String str2 = Build.MANUFACTURER;
            if (str2 == null) {
                str = "";
            } else {
                str = str2.toLowerCase(Locale.ENGLISH);
            }
            if (str.equals("meizu")) {
                setHint("");
            }
        }
    }

    @Override // com.ninja.engine.C0110o000oo, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (onCreateInputConnection != null && editorInfo.hintText == null) {
            editorInfo.hintText = getHintFromLayout();
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        String str;
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        TextInputLayout textInputLayout = getTextInputLayout();
        if (Build.VERSION.SDK_INT < 23 && textInputLayout != null) {
            Editable text = getText();
            CharSequence hint = textInputLayout.getHint();
            boolean z = !TextUtils.isEmpty(text);
            String str2 = "";
            if (!(!TextUtils.isEmpty(hint))) {
                str = "";
            } else {
                str = hint.toString();
            }
            if (z) {
                StringBuilder sb = new StringBuilder();
                sb.append((Object) text);
                if (!TextUtils.isEmpty(str)) {
                    str2 = AbstractC1230oOoOo0o.OooOO0o(", ", str);
                }
                sb.append(str2);
                str2 = sb.toString();
            } else if (!TextUtils.isEmpty(str)) {
                str2 = str;
            }
            accessibilityNodeInfo.setText(str2);
        }
    }

    @Override // android.view.View
    public final boolean requestRectangleOnScreen(Rect rect) {
        TextInputLayout textInputLayout = getTextInputLayout();
        if (textInputLayout != null && this.OooO0oo && rect != null) {
            int height = textInputLayout.getHeight() - getHeight();
            int i = rect.left;
            int i2 = rect.top;
            int i3 = rect.right;
            int i4 = rect.bottom + height;
            Rect rect2 = this.OooO0oO;
            rect2.set(i, i2, i3, i4);
            return super.requestRectangleOnScreen(rect2);
        }
        return super.requestRectangleOnScreen(rect);
    }

    public void setTextInputLayoutFocusedRectEnabled(boolean z) {
        this.OooO0oo = z;
    }
}


