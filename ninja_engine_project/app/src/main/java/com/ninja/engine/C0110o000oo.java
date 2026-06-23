package com.ninja.engine;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
/* renamed from: com.ninja.engine.o000oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0110o000oo extends EditText implements oOOO000o, InterfaceC1322oOooo0 {
    public final o0000OO0 OooO00o;
    public final o00O0OO OooO0O0;
    public final C0415o0Oo0O0O OooO0OO;
    public final C1309oOooOOOo OooO0Oo;
    public C0114o000oo0o OooO0o;
    public final C0415o0Oo0O0O OooO0o0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Type inference failed for: r4v5, types: [java.lang.Object, com.ninja.engine.oOooOOOo] */
    public C0110o000oo(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, R.attr.editTextStyle);
        AbstractC1320oOooOooo.OooO00o(context);
        AbstractC1313oOooOo0.OooO00o(this, getContext());
        o0000OO0 o0000oo0 = new o0000OO0(this);
        this.OooO00o = o0000oo0;
        o0000oo0.OooOO0O(attributeSet, R.attr.editTextStyle);
        o00O0OO o00o0oo = new o00O0OO(this);
        this.OooO0O0 = o00o0oo;
        o00o0oo.OooO0o(attributeSet, R.attr.editTextStyle);
        o00o0oo.OooO0O0();
        C0415o0Oo0O0O c0415o0Oo0O0O = new C0415o0Oo0O0O(6, false);
        c0415o0Oo0O0O.OooO0O0 = this;
        this.OooO0OO = c0415o0Oo0O0O;
        this.OooO0Oo = new Object();
        C0415o0Oo0O0O c0415o0Oo0O0O2 = new C0415o0Oo0O0O(this, 5);
        this.OooO0o0 = c0415o0Oo0O0O2;
        c0415o0Oo0O0O2.Oooo00O(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (!(keyListener instanceof NumberKeyListener)) {
            boolean isFocusable = super.isFocusable();
            boolean isClickable = super.isClickable();
            boolean isLongClickable = super.isLongClickable();
            int inputType = super.getInputType();
            KeyListener OooOooO = c0415o0Oo0O0O2.OooOooO(keyListener);
            if (OooOooO != keyListener) {
                super.setKeyListener(OooOooO);
                super.setRawInputType(inputType);
                super.setFocusable(isFocusable);
                super.setClickable(isClickable);
                super.setLongClickable(isLongClickable);
            }
        }
    }

    private C0114o000oo0o getSuperCaller() {
        if (this.OooO0o == null) {
            this.OooO0o = new C0114o000oo0o(this);
        }
        return this.OooO0o;
    }

    @Override // com.ninja.engine.oOOO000o
    public final C0323o0O0oO0o OooO00o(C0323o0O0oO0o c0323o0O0oO0o) {
        this.OooO0Oo.getClass();
        return C1309oOooOOOo.OooO00o(this, c0323o0O0oO0o);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooO00o();
        }
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1094oOOoOOo0.OooOoO0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            return o0000oo0.OooO0oo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            return o0000oo0.OooO();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.OooO0O0.OooO0Oo();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.OooO0O0.OooO0o0();
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    public TextClassifier getTextClassifier() {
        C0415o0Oo0O0O c0415o0Oo0O0O;
        if (Build.VERSION.SDK_INT < 28 && (c0415o0Oo0O0O = this.OooO0OO) != null) {
            TextClassifier textClassifier = (TextClassifier) c0415o0Oo0O0O.OooO0OO;
            if (textClassifier == null) {
                return o00O0.OooO00o((TextView) c0415o0Oo0O0O.OooO0O0);
            }
            return textClassifier;
        }
        return super.getTextClassifier();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0055, code lost:
        if (r1 != null) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0057, code lost:
        r6 = r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x006a, code lost:
        if (r1 != null) goto L18;
     */
    @Override // android.widget.TextView, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public android.view.inputmethod.InputConnection onCreateInputConnection(android.view.inputmethod.EditorInfo r8) {
        /*
            r7 = this;
            android.view.inputmethod.InputConnection r0 = super.onCreateInputConnection(r8)
            com.ninja.engine.o00O0OO r1 = r7.OooO0O0
            r1.getClass()
            com.ninja.engine.o00O0OO.OooO0oo(r7, r0, r8)
            com.ninja.engine.AbstractC0809oO0OooOO.OoooOO0(r0, r8, r7)
            if (r0 == 0) goto L77
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 30
            if (r1 > r2) goto L77
            java.lang.String[] r2 = com.ninja.engine.AbstractC1460oo0O00oo.OooO0oO(r7)
            if (r2 == 0) goto L77
            java.lang.String r3 = "android.support.v13.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            java.lang.String r4 = "androidx.core.view.inputmethod.EditorInfoCompat.CONTENT_MIME_TYPES"
            r5 = 25
            if (r1 < r5) goto L29
            com.ninja.engine.AbstractC0456o0OoOo0O.OooO00o(r8, r2)
            goto L3e
        L29:
            android.os.Bundle r6 = r8.extras
            if (r6 != 0) goto L34
            android.os.Bundle r6 = new android.os.Bundle
            r6.<init>()
            r8.extras = r6
        L34:
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r4, r2)
            android.os.Bundle r6 = r8.extras
            r6.putStringArray(r3, r2)
        L3e:
            com.ninja.engine.o0OoO000 r2 = new com.ninja.engine.o0OoO000
            r6 = 2
            r2.<init>(r6, r7)
            if (r1 < r5) goto L4d
            com.ninja.engine.oOOoOOO0 r1 = new com.ninja.engine.oOOoOOO0
            r1.<init>(r0, r2)
        L4b:
            r0 = r1
            goto L77
        L4d:
            java.lang.String[] r6 = com.ninja.engine.AbstractC0809oO0OooOO.OooO0o
            if (r1 < r5) goto L59
            java.lang.String[] r1 = com.ninja.engine.AbstractC0456o0OoOo0O.OooO0O0(r8)
            if (r1 == 0) goto L6d
        L57:
            r6 = r1
            goto L6d
        L59:
            android.os.Bundle r1 = r8.extras
            if (r1 != 0) goto L5e
            goto L6d
        L5e:
            java.lang.String[] r1 = r1.getStringArray(r4)
            if (r1 != 0) goto L6a
            android.os.Bundle r1 = r8.extras
            java.lang.String[] r1 = r1.getStringArray(r3)
        L6a:
            if (r1 == 0) goto L6d
            goto L57
        L6d:
            int r1 = r6.length
            if (r1 != 0) goto L71
            goto L77
        L71:
            com.ninja.engine.oO00OoOO r1 = new com.ninja.engine.oO00OoOO
            r1.<init>(r0, r2)
            goto L4b
        L77:
            com.ninja.engine.o0Oo0O0O r1 = r7.OooO0o0
            com.ninja.engine.o0Ooo0O r8 = r1.Oooo00o(r0, r8)
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0110o000oo.onCreateInputConnection(android.view.inputmethod.EditorInfo):android.view.inputmethod.InputConnection");
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i >= 30 && i < 33) {
            ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i = Build.VERSION.SDK_INT;
        boolean z = false;
        if (i < 31 && i >= 24 && dragEvent.getLocalState() == null && AbstractC1460oo0O00oo.OooO0oO(this) != null) {
            Context context = getContext();
            while (true) {
                if (context instanceof ContextWrapper) {
                    if (context instanceof Activity) {
                        activity = (Activity) context;
                        break;
                    }
                    context = ((ContextWrapper) context).getBaseContext();
                } else {
                    activity = null;
                    break;
                }
            }
            if (activity == null) {
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = AbstractC0335o0O0ooO.OooO00o(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        ClipData primaryClip;
        InterfaceC1982oooOO0 interfaceC1982oooOO0;
        int i2;
        int i3 = Build.VERSION.SDK_INT;
        if (i3 < 31 && AbstractC1460oo0O00oo.OooO0oO(this) != null && (i == 16908322 || i == 16908337)) {
            ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
            if (clipboardManager == null) {
                primaryClip = null;
            } else {
                primaryClip = clipboardManager.getPrimaryClip();
            }
            if (primaryClip != null && primaryClip.getItemCount() > 0) {
                if (i3 >= 31) {
                    interfaceC1982oooOO0 = new o00O(primaryClip, 1);
                } else {
                    C0321o0O0oO0 c0321o0O0oO0 = new C0321o0O0oO0();
                    c0321o0O0oO0.OooO0O0 = primaryClip;
                    c0321o0O0oO0.OooO0OO = 1;
                    interfaceC1982oooOO0 = c0321o0O0oO0;
                }
                if (i == 16908322) {
                    i2 = 0;
                } else {
                    i2 = 1;
                }
                interfaceC1982oooOO0.OooOoo(i2);
                AbstractC1460oo0O00oo.OooOO0o(this, interfaceC1982oooOO0.OooO0oo());
            }
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooOOO0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooOOO(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1094oOOoOOo0.OooOoO(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.OooO0o0.Oooo0oo(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.OooO0o0.OooOooO(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooOo00(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooOo0(mode);
        }
    }

    @Override // com.ninja.engine.InterfaceC1322oOooo0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o00O0OO o00o0oo = this.OooO0O0;
        o00o0oo.OooOO0o(colorStateList);
        o00o0oo.OooO0O0();
    }

    @Override // com.ninja.engine.InterfaceC1322oOooo0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o00O0OO o00o0oo = this.OooO0O0;
        o00o0oo.OooOOO0(mode);
        o00o0oo.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00O0OO o00o0oo = this.OooO0O0;
        if (o00o0oo != null) {
            o00o0oo.OooO0oO(context, i);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        C0415o0Oo0O0O c0415o0Oo0O0O;
        if (Build.VERSION.SDK_INT >= 28 || (c0415o0Oo0O0O = this.OooO0OO) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            c0415o0Oo0O0O.OooO0OO = textClassifier;
        }
    }
}
