package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.TextView;
import com.app.framework.utils.FileUtils;
import java.lang.ref.WeakReference;
import java.util.Arrays;
/* loaded from: classes.dex */
public final class o00O0OO {
    public final C0234o00oOOo OooO;
    public final TextView OooO00o;
    public C1324oOooo000 OooO0O0;
    public C1324oOooo000 OooO0OO;
    public C1324oOooo000 OooO0Oo;
    public C1324oOooo000 OooO0o;
    public C1324oOooo000 OooO0o0;
    public C1324oOooo000 OooO0oO;
    public C1324oOooo000 OooO0oo;
    public int OooOO0 = 0;
    public int OooOO0O = -1;
    public Typeface OooOO0o;
    public boolean OooOOO0;

    public o00O0OO(TextView textView) {
        this.OooO00o = textView;
        this.OooO = new C0234o00oOOo(textView);
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [com.ninja.engine.oOooo000, java.lang.Object] */
    public static C1324oOooo000 OooO0OO(Context context, C0113o000oo0O c0113o000oo0O, int i) {
        ColorStateList OooO;
        synchronized (c0113o000oo0O) {
            OooO = c0113o000oo0O.OooO00o.OooO(context, i);
        }
        if (OooO != null) {
            C1324oOooo000 obj = new C1324oOooo000();
            obj.OooO0Oo = true;
            obj.OooO00o = OooO;
            return obj;
        }
        return null;
    }

    public static void OooO0oo(TextView textView, InputConnection inputConnection, EditorInfo editorInfo) {
        int i;
        int i2;
        int i3;
        CharSequence subSequence;
        int i4 = Build.VERSION.SDK_INT;
        if (i4 < 30 && inputConnection != null) {
            CharSequence text = textView.getText();
            if (i4 >= 30) {
                AbstractC0030Oooo.OooO0Oo(editorInfo, text);
                return;
            }
            text.getClass();
            if (i4 >= 30) {
                AbstractC0030Oooo.OooO0Oo(editorInfo, text);
                return;
            }
            int i5 = editorInfo.initialSelStart;
            int i6 = editorInfo.initialSelEnd;
            if (i5 > i6) {
                i = i6;
            } else {
                i = i5;
            }
            if (i5 <= i6) {
                i5 = i6;
            }
            int length = text.length();
            if (i >= 0 && i5 <= length && (i2 = editorInfo.inputType & 4095) != 129 && i2 != 225 && i2 != 18) {
                if (length <= 2048) {
                    AbstractC0809oO0OooOO.Ooooooo(editorInfo, text, i, i5);
                    return;
                }
                int i7 = i5 - i;
                if (i7 > 1024) {
                    i3 = 0;
                } else {
                    i3 = i7;
                }
                int i8 = FileUtils.FileMode.MODE_ISUID - i3;
                int min = Math.min(text.length() - i5, i8 - Math.min(i, (int) (i8 * 0.8d)));
                int min2 = Math.min(i, i8 - min);
                int i9 = i - min2;
                if (Character.isLowSurrogate(text.charAt(i9))) {
                    i9++;
                    min2--;
                }
                if (Character.isHighSurrogate(text.charAt((i5 + min) - 1))) {
                    min--;
                }
                int i10 = min2 + i3;
                int i11 = i10 + min;
                if (i3 != i7) {
                    subSequence = TextUtils.concat(text.subSequence(i9, i9 + min2), text.subSequence(i5, min + i5));
                } else {
                    subSequence = text.subSequence(i9, i11 + i9);
                }
                AbstractC0809oO0OooOO.Ooooooo(editorInfo, subSequence, min2, i10);
                return;
            }
            AbstractC0809oO0OooOO.Ooooooo(editorInfo, null, 0, 0);
        }
    }

    public final void OooO(int i, int i2, int i3, int i4) {
        C0234o00oOOo c0234o00oOOo = this.OooO;
        if (c0234o00oOOo.OooOO0()) {
            DisplayMetrics displayMetrics = c0234o00oOOo.OooOO0.getResources().getDisplayMetrics();
            c0234o00oOOo.OooOO0O(TypedValue.applyDimension(i4, i, displayMetrics), TypedValue.applyDimension(i4, i2, displayMetrics), TypedValue.applyDimension(i4, i3, displayMetrics));
            if (c0234o00oOOo.OooO0oo()) {
                c0234o00oOOo.OooO00o();
            }
        }
    }

    public final void OooO00o(Drawable drawable, C1324oOooo000 c1324oOooo000) {
        if (drawable != null && c1324oOooo000 != null) {
            C0113o000oo0O.OooO0o0(drawable, c1324oOooo000, this.OooO00o.getDrawableState());
        }
    }

    public final void OooO0O0() {
        C1324oOooo000 c1324oOooo000 = this.OooO0O0;
        TextView textView = this.OooO00o;
        if (c1324oOooo000 != null || this.OooO0OO != null || this.OooO0Oo != null || this.OooO0o0 != null) {
            Drawable[] compoundDrawables = textView.getCompoundDrawables();
            OooO00o(compoundDrawables[0], this.OooO0O0);
            OooO00o(compoundDrawables[1], this.OooO0OO);
            OooO00o(compoundDrawables[2], this.OooO0Oo);
            OooO00o(compoundDrawables[3], this.OooO0o0);
        }
        if (this.OooO0o != null || this.OooO0oO != null) {
            Drawable[] compoundDrawablesRelative = textView.getCompoundDrawablesRelative();
            OooO00o(compoundDrawablesRelative[0], this.OooO0o);
            OooO00o(compoundDrawablesRelative[2], this.OooO0oO);
        }
    }

    public final ColorStateList OooO0Oo() {
        C1324oOooo000 c1324oOooo000 = this.OooO0oo;
        if (c1324oOooo000 != null) {
            return c1324oOooo000.OooO00o;
        }
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:115:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0243  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0249  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0252  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0258  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x0287  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x02aa  */
    /* JADX WARN: Removed duplicated region for block: B:159:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x02f1  */
    /* JADX WARN: Removed duplicated region for block: B:172:0x0326  */
    /* JADX WARN: Removed duplicated region for block: B:174:0x032d  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0335  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x033a  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:183:0x0349  */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0351  */
    /* JADX WARN: Removed duplicated region for block: B:187:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:190:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:191:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:194:0x036c  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x0371  */
    /* JADX WARN: Removed duplicated region for block: B:232:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:235:0x03ce  */
    /* JADX WARN: Removed duplicated region for block: B:238:0x03d4  */
    /* JADX WARN: Removed duplicated region for block: B:241:0x03da  */
    /* JADX WARN: Removed duplicated region for block: B:245:0x03e8  */
    /* JADX WARN: Removed duplicated region for block: B:261:0x041c  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:276:0x046d  */
    /* JADX WARN: Removed duplicated region for block: B:279:0x0476  */
    /* JADX WARN: Removed duplicated region for block: B:281:0x047b  */
    /* JADX WARN: Removed duplicated region for block: B:284:0x0484  */
    /* JADX WARN: Removed duplicated region for block: B:292:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0106  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x010d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0o(android.util.AttributeSet r29, int r30) {
        /*
            Method dump skipped, instructions count: 1193
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.o00O0OO.OooO0o(android.util.AttributeSet, int):void");
    }

    public final PorterDuff.Mode OooO0o0() {
        C1324oOooo000 c1324oOooo000 = this.OooO0oo;
        if (c1324oOooo000 != null) {
            return c1324oOooo000.OooO0O0;
        }
        return null;
    }

    public final void OooO0oO(Context context, int i) {
        String string;
        ColorStateList OooOo0O;
        ColorStateList OooOo0O2;
        ColorStateList OooOo0O3;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1039oOOOoo0o.OooOo0O);
        C0131o00O0o c0131o00O0o = new C0131o00O0o(context, obtainStyledAttributes);
        boolean hasValue = obtainStyledAttributes.hasValue(14);
        TextView textView = this.OooO00o;
        if (hasValue) {
            textView.setAllCaps(obtainStyledAttributes.getBoolean(14, false));
        }
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 23) {
            if (obtainStyledAttributes.hasValue(3) && (OooOo0O3 = c0131o00O0o.OooOo0O(3)) != null) {
                textView.setTextColor(OooOo0O3);
            }
            if (obtainStyledAttributes.hasValue(5) && (OooOo0O2 = c0131o00O0o.OooOo0O(5)) != null) {
                textView.setLinkTextColor(OooOo0O2);
            }
            if (obtainStyledAttributes.hasValue(4) && (OooOo0O = c0131o00O0o.OooOo0O(4)) != null) {
                textView.setHintTextColor(OooOo0O);
            }
        }
        if (obtainStyledAttributes.hasValue(0) && obtainStyledAttributes.getDimensionPixelSize(0, -1) == 0) {
            textView.setTextSize(0, 0.0f);
        }
        OooOOO(context, c0131o00O0o);
        if (i2 >= 26 && obtainStyledAttributes.hasValue(13) && (string = obtainStyledAttributes.getString(13)) != null) {
            o00O0OO0.OooO0Oo(textView, string);
        }
        c0131o00O0o.Oooo0o0();
        Typeface typeface = this.OooOO0o;
        if (typeface != null) {
            textView.setTypeface(typeface, this.OooOO0);
        }
    }

    public final void OooOO0(int[] iArr, int i) {
        C0234o00oOOo c0234o00oOOo = this.OooO;
        if (c0234o00oOOo.OooOO0()) {
            int length = iArr.length;
            if (length > 0) {
                int[] iArr2 = new int[length];
                if (i == 0) {
                    iArr2 = Arrays.copyOf(iArr, length);
                } else {
                    DisplayMetrics displayMetrics = c0234o00oOOo.OooOO0.getResources().getDisplayMetrics();
                    for (int i2 = 0; i2 < length; i2++) {
                        iArr2[i2] = Math.round(TypedValue.applyDimension(i, iArr[i2], displayMetrics));
                    }
                }
                c0234o00oOOo.OooO0o = C0234o00oOOo.OooO0O0(iArr2);
                if (!c0234o00oOOo.OooO()) {
                    throw new IllegalArgumentException("None of the preset sizes is valid: " + Arrays.toString(iArr));
                }
            } else {
                c0234o00oOOo.OooO0oO = false;
            }
            if (c0234o00oOOo.OooO0oo()) {
                c0234o00oOOo.OooO00o();
            }
        }
    }

    public final void OooOO0O(int i) {
        C0234o00oOOo c0234o00oOOo = this.OooO;
        if (c0234o00oOOo.OooOO0()) {
            if (i != 0) {
                if (i == 1) {
                    DisplayMetrics displayMetrics = c0234o00oOOo.OooOO0.getResources().getDisplayMetrics();
                    c0234o00oOOo.OooOO0O(TypedValue.applyDimension(2, 12.0f, displayMetrics), TypedValue.applyDimension(2, 112.0f, displayMetrics), 1.0f);
                    if (c0234o00oOOo.OooO0oo()) {
                        c0234o00oOOo.OooO00o();
                        return;
                    }
                    return;
                }
                throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "Unknown auto-size text type: "));
            }
            c0234o00oOOo.OooO00o = 0;
            c0234o00oOOo.OooO0Oo = -1.0f;
            c0234o00oOOo.OooO0o0 = -1.0f;
            c0234o00oOOo.OooO0OO = -1.0f;
            c0234o00oOOo.OooO0o = new int[0];
            c0234o00oOOo.OooO0O0 = false;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ninja.engine.oOooo000, java.lang.Object] */
    public final void OooOO0o(ColorStateList colorStateList) {
        boolean z;
        if (this.OooO0oo == null) {
            this.OooO0oo = new C1324oOooo000();
        }
        C1324oOooo000 c1324oOooo000 = this.OooO0oo;
        c1324oOooo000.OooO00o = colorStateList;
        if (colorStateList != null) {
            z = true;
        } else {
            z = false;
        }
        c1324oOooo000.OooO0Oo = z;
        this.OooO0O0 = c1324oOooo000;
        this.OooO0OO = c1324oOooo000;
        this.OooO0Oo = c1324oOooo000;
        this.OooO0o0 = c1324oOooo000;
        this.OooO0o = c1324oOooo000;
        this.OooO0oO = c1324oOooo000;
    }

    public final void OooOOO(Context context, C0131o00O0o c0131o00O0o) {
        String string;
        Typeface create;
        boolean z;
        boolean z2;
        Typeface typeface;
        int i = this.OooOO0;
        TypedArray typedArray = (TypedArray) c0131o00O0o.OooO0O0;
        this.OooOO0 = typedArray.getInt(2, i);
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 28) {
            int i3 = typedArray.getInt(11, -1);
            this.OooOO0O = i3;
            if (i3 != -1) {
                this.OooOO0 &= 2;
            }
        }
        int i4 = 10;
        boolean z3 = false;
        if (!typedArray.hasValue(10) && !typedArray.hasValue(12)) {
            if (typedArray.hasValue(1)) {
                this.OooOOO0 = false;
                int i5 = typedArray.getInt(1, 1);
                if (i5 != 1) {
                    if (i5 != 2) {
                        if (i5 == 3) {
                            typeface = Typeface.MONOSPACE;
                        } else {
                            return;
                        }
                    } else {
                        typeface = Typeface.SERIF;
                    }
                } else {
                    typeface = Typeface.SANS_SERIF;
                }
                this.OooOO0o = typeface;
                return;
            }
            return;
        }
        this.OooOO0o = null;
        if (typedArray.hasValue(12)) {
            i4 = 12;
        }
        int i6 = this.OooOO0O;
        int i7 = this.OooOO0;
        if (!context.isRestricted()) {
            try {
                Typeface OooOoO0 = c0131o00O0o.OooOoO0(i4, this.OooOO0, new o00O0O00(this, i6, i7, new WeakReference(this.OooO00o)));
                if (OooOoO0 != null) {
                    if (i2 >= 28 && this.OooOO0O != -1) {
                        Typeface create2 = Typeface.create(OooOoO0, 0);
                        int i8 = this.OooOO0O;
                        if ((this.OooOO0 & 2) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        OooOoO0 = AbstractC1563oo0o0O0.OooO00o(create2, i8, z2);
                    }
                    this.OooOO0o = OooOoO0;
                }
                if (this.OooOO0o == null) {
                    z = true;
                } else {
                    z = false;
                }
                this.OooOOO0 = z;
            } catch (Resources.NotFoundException | UnsupportedOperationException unused) {
            }
        }
        if (this.OooOO0o == null && (string = typedArray.getString(i4)) != null) {
            if (Build.VERSION.SDK_INT >= 28 && this.OooOO0O != -1) {
                Typeface create3 = Typeface.create(string, 0);
                int i9 = this.OooOO0O;
                if ((this.OooOO0 & 2) != 0) {
                    z3 = true;
                }
                create = AbstractC1563oo0o0O0.OooO00o(create3, i9, z3);
            } else {
                create = Typeface.create(string, this.OooOO0);
            }
            this.OooOO0o = create;
        }
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ninja.engine.oOooo000, java.lang.Object] */
    public final void OooOOO0(PorterDuff.Mode mode) {
        boolean z;
        if (this.OooO0oo == null) {
            this.OooO0oo = new C1324oOooo000();
        }
        C1324oOooo000 c1324oOooo000 = this.OooO0oo;
        c1324oOooo000.OooO0O0 = mode;
        if (mode != null) {
            z = true;
        } else {
            z = false;
        }
        c1324oOooo000.OooO0OO = z;
        this.OooO0O0 = c1324oOooo000;
        this.OooO0OO = c1324oOooo000;
        this.OooO0Oo = c1324oOooo000;
        this.OooO0o0 = c1324oOooo000;
        this.OooO0o = c1324oOooo000;
        this.OooO0oO = c1324oOooo000;
    }
}



