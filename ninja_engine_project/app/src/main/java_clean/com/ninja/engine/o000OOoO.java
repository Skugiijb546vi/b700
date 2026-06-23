package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
/* loaded from: classes.dex */
public final class o000OOoO extends CheckedTextView implements InterfaceC1322oOooo0 {
    public final C0086o000Oo00 OooO00o;
    public final o0000OO0 OooO0O0;
    public final o00O0OO OooO0OO;
    public C0116o000ooO0 OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0086 A[Catch: all -> 0x0066, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004e, B:5:0x0054, B:7:0x005a, B:16:0x007f, B:18:0x0086, B:19:0x008d, B:21:0x0094, B:11:0x0068, B:13:0x006e, B:15:0x0074), top: B:29:0x004e }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0094 A[Catch: all -> 0x0066, TRY_LEAVE, TryCatch #1 {all -> 0x0066, blocks: (B:3:0x004e, B:5:0x0054, B:7:0x005a, B:16:0x007f, B:18:0x0086, B:19:0x008d, B:21:0x0094, B:11:0x0068, B:13:0x006e, B:15:0x0074), top: B:29:0x004e }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public o000OOoO(android.content.Context r10, android.util.AttributeSet r11) {
        super(r10, r11, 2130968769);
        /*
            r9 = this;
            com.ninja.engine.AbstractC1320oOooOooo.OooO00o(r10)
            r6 = 2130968769(0x7f0400c1, float:1.75462E38)
            r9.<init>(r10, r11, r6)
            android.content.Context r10 = r9.getContext()
            com.ninja.engine.AbstractC1313oOooOo0.OooO00o(r9, r10)
            com.ninja.engine.o00O0OO r10 = new com.ninja.engine.o00O0OO
            r10.<init>(r9)
            r9.OooO0OO = r10
            r10.OooO0o(r11, r6)
            r10.OooO0O0()
            com.ninja.engine.o0000OO0 r10 = new com.ninja.engine.o0000OO0
            r10.<init>(r9)
            r9.OooO0O0 = r10
            r10.OooOO0O(r11, r6)
            com.ninja.engine.o000Oo00 r10 = new com.ninja.engine.o000Oo00
            r10.<init>(r9)
            r9.OooO00o = r10
            android.content.Context r10 = r9.getContext()
            int[] r2 = com.ninja.engine.AbstractC1039oOOOoo0o.OooOO0o
            r7 = 0
            com.ninja.engine.o00O0o r10 = com.ninja.engine.C0131o00O0o.Oooo0O0(r10, r11, r2, r6, r7)
            java.lang.Object r0 = r10.OooO0O0
            r8 = r0
            android.content.res.TypedArray r8 = (android.content.res.TypedArray) r8
            android.content.Context r1 = r9.getContext()
            java.lang.Object r0 = r10.OooO0O0
            r4 = r0
            android.content.res.TypedArray r4 = (android.content.res.TypedArray) r4
            r0 = r9
            r3 = r11
            r5 = r6
            com.ninja.engine.AbstractC1460oo0O00oo.OooOOOO(r0, r1, r2, r3, r4, r5)
            r0 = 1
            boolean r1 = r8.hasValue(r0)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L68
            int r0 = r8.getResourceId(r0, r7)     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L68
            android.content.Context r1 = r9.getContext()     // Catch: java.lang.Throwable -> L66 android.content.res.Resources.NotFoundException -> L68
            android.graphics.drawable.Drawable r0 = com.ninja.engine.AbstractC0692o0ooooOo.OooOo0(r1, r0)     // Catch: java.lang.Throwable -> L66 android.content.res.Resources.NotFoundException -> L68
            r9.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> L66 android.content.res.Resources.NotFoundException -> L68
            goto L7f
        L66:
            r11 = move-exception
            goto Lac
        L68:
            boolean r0 = r8.hasValue(r7)     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L7f
            int r0 = r8.getResourceId(r7, r7)     // Catch: java.lang.Throwable -> L66
            if (r0 == 0) goto L7f
            android.content.Context r1 = r9.getContext()     // Catch: java.lang.Throwable -> L66
            android.graphics.drawable.Drawable r0 = com.ninja.engine.AbstractC0692o0ooooOo.OooOo0(r1, r0)     // Catch: java.lang.Throwable -> L66
            r9.setCheckMarkDrawable(r0)     // Catch: java.lang.Throwable -> L66
        L7f:
            r0 = 2
            boolean r1 = r8.hasValue(r0)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto L8d
            android.content.res.ColorStateList r0 = r10.OooOo0O(r0)     // Catch: java.lang.Throwable -> L66
            r9.setCheckMarkTintList(r0)     // Catch: java.lang.Throwable -> L66
        L8d:
            r0 = 3
            boolean r1 = r8.hasValue(r0)     // Catch: java.lang.Throwable -> L66
            if (r1 == 0) goto La1
            r1 = -1
            int r0 = r8.getInt(r0, r1)     // Catch: java.lang.Throwable -> L66
            r1 = 0
            android.graphics.PorterDuff$Mode r0 = com.ninja.engine.AbstractC0420o0Oo0Oo.OooO0O0(r0, r1)     // Catch: java.lang.Throwable -> L66
            r9.setCheckMarkTintMode(r0)     // Catch: java.lang.Throwable -> L66
        La1:
            r10.Oooo0o0()
            com.ninja.engine.o000ooO0 r10 = r9.getEmojiTextViewHelper()
            r10.OooO00o(r11, r6)
            return
        Lac:
            r10.Oooo0o0()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o000OOoO.<init>(android.content.Context, android.util.AttributeSet):void");
    }

    private C0116o000ooO0 getEmojiTextViewHelper() {
        if (this.OooO0Oo == null) {
            this.OooO0Oo = new C0116o000ooO0(this);
        }
        return this.OooO0Oo;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o00O0OO o00o0oo = this.OooO0OO;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            o0000oo0.OooO00o();
        }
        C0086o000Oo00 c0086o000Oo00 = this.OooO00o;
        if (c0086o000Oo00 != null) {
            c0086o000Oo00.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return AbstractC1094oOOoOOo0.OooOoO0(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            return o0000oo0.OooO0oo();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            return o0000oo0.OooO();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        C0086o000Oo00 c0086o000Oo00 = this.OooO00o;
        if (c0086o000Oo00 != null) {
            return (ColorStateList) c0086o000Oo00.OooO00o;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        C0086o000Oo00 c0086o000Oo00 = this.OooO00o;
        if (c0086o000Oo00 != null) {
            return (PorterDuff.Mode) c0086o000Oo00.OooO0O0;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.OooO0OO.OooO0Oo();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.OooO0OO.OooO0o0();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        AbstractC0809oO0OooOO.OoooOO0(onCreateInputConnection, editorInfo, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z) {
        super.setAllCaps(z);
        getEmojiTextViewHelper().OooO0O0(z);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            o0000oo0.OooOOO0();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            o0000oo0.OooOOO(i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i) {
        setCheckMarkDrawable(AbstractC0692o0ooooOo.OooOo0(getContext(), i));
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        o00O0OO o00o0oo = this.OooO0OO;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        o00O0OO o00o0oo = this.OooO0OO;
        if (o00o0oo != null) {
            o00o0oo.OooO0O0();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(AbstractC1094oOOoOOo0.OooOoO(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        getEmojiTextViewHelper().OooO0OO(z);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            o0000oo0.OooOo00(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        o0000OO0 o0000oo0 = this.OooO0O0;
        if (o0000oo0 != null) {
            o0000oo0.OooOo0(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        C0086o000Oo00 c0086o000Oo00 = this.OooO00o;
        if (c0086o000Oo00 != null) {
            c0086o000Oo00.OooO00o = colorStateList;
            c0086o000Oo00.OooO0OO = true;
            c0086o000Oo00.OooO0O0();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        C0086o000Oo00 c0086o000Oo00 = this.OooO00o;
        if (c0086o000Oo00 != null) {
            c0086o000Oo00.OooO0O0 = mode;
            c0086o000Oo00.OooO0Oo = true;
            c0086o000Oo00.OooO0O0();
        }
    }

    @Override // com.ninja.engine.InterfaceC1322oOooo0
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        o00O0OO o00o0oo = this.OooO0OO;
        o00o0oo.OooOO0o(colorStateList);
        o00o0oo.OooO0O0();
    }

    @Override // com.ninja.engine.InterfaceC1322oOooo0
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        o00O0OO o00o0oo = this.OooO0OO;
        o00o0oo.OooOOO0(mode);
        o00o0oo.OooO0O0();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        o00O0OO o00o0oo = this.OooO0OO;
        if (o00o0oo != null) {
            o00o0oo.OooO0oO(context, i);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        C0086o000Oo00 c0086o000Oo00 = this.OooO00o;
        if (c0086o000Oo00 != null) {
            if (c0086o000Oo00.OooO0o0) {
                c0086o000Oo00.OooO0o0 = false;
                return;
            }
            c0086o000Oo00.OooO0o0 = true;
            c0086o000Oo00.OooO0O0();
        }
    }
}


