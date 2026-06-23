package com.ninja.engine;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.RectF;
import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.method.TransformationMethod;
import android.util.TypedValue;
import android.widget.TextView;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.concurrent.ConcurrentHashMap;
/* renamed from: com.ninja.engine.o00oOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0234o00oOOo {
    public static final RectF OooOO0o = new RectF();
    public static final ConcurrentHashMap OooOOO0 = new ConcurrentHashMap();
    public final TextView OooO;
    public TextPaint OooO0oo;
    public final Context OooOO0;
    public final C0133o00O0o00 OooOO0O;
    public int OooO00o = 0;
    public boolean OooO0O0 = false;
    public float OooO0OO = -1.0f;
    public float OooO0Oo = -1.0f;
    public float OooO0o0 = -1.0f;
    public int[] OooO0o = new int[0];
    public boolean OooO0oO = false;

    public C0234o00oOOo(TextView textView) {
        C0133o00O0o00 c0133o00O0o00;
        this.OooO = textView;
        this.OooOO0 = textView.getContext();
        int i = Build.VERSION.SDK_INT;
        if (i >= 29) {
            c0133o00O0o00 = new C0130o00O0Ooo();
        } else if (i >= 23) {
            c0133o00O0o00 = new C0129o00O0OoO();
        } else {
            c0133o00O0o00 = new C0133o00O0o00();
        }
        this.OooOO0O = c0133o00O0o00;
    }

    public static int[] OooO0O0(int[] iArr) {
        int length = iArr.length;
        if (length == 0) {
            return iArr;
        }
        Arrays.sort(iArr);
        ArrayList arrayList = new ArrayList();
        for (int i : iArr) {
            if (i > 0 && Collections.binarySearch(arrayList, Integer.valueOf(i)) < 0) {
                arrayList.add(Integer.valueOf(i));
            }
        }
        if (length == arrayList.size()) {
            return iArr;
        }
        int size = arrayList.size();
        int[] iArr2 = new int[size];
        for (int i2 = 0; i2 < size; i2++) {
            iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
        }
        return iArr2;
    }

    public static Method OooO0Oo(String str) {
        try {
            ConcurrentHashMap concurrentHashMap = OooOOO0;
            Method method = (Method) concurrentHashMap.get(str);
            if (method == null && (method = TextView.class.getDeclaredMethod(str, null)) != null) {
                method.setAccessible(true);
                concurrentHashMap.put(str, method);
            }
            return method;
        } catch (Exception unused) {
            return null;
        }
    }

    public static Object OooO0o0(Object obj, String str, Object obj2) {
        try {
            return OooO0Oo(str).invoke(obj, null);
        } catch (Exception unused) {
            return obj2;
        }
    }

    public final boolean OooO() {
        boolean z;
        int[] iArr = this.OooO0o;
        int length = iArr.length;
        if (length > 0) {
            z = true;
        } else {
            z = false;
        }
        this.OooO0oO = z;
        if (z) {
            this.OooO00o = 1;
            this.OooO0Oo = iArr[0];
            this.OooO0o0 = iArr[length - 1];
            this.OooO0OO = -1.0f;
        }
        return z;
    }

    public final void OooO00o() {
        int measuredWidth;
        if (!OooO0o()) {
            return;
        }
        if (this.OooO0O0) {
            if (this.OooO.getMeasuredHeight() > 0 && this.OooO.getMeasuredWidth() > 0) {
                if (this.OooOO0O.OooO0O0(this.OooO)) {
                    measuredWidth = 1048576;
                } else {
                    measuredWidth = (this.OooO.getMeasuredWidth() - this.OooO.getTotalPaddingLeft()) - this.OooO.getTotalPaddingRight();
                }
                int height = (this.OooO.getHeight() - this.OooO.getCompoundPaddingBottom()) - this.OooO.getCompoundPaddingTop();
                if (measuredWidth > 0 && height > 0) {
                    RectF rectF = OooOO0o;
                    synchronized (rectF) {
                        try {
                            rectF.setEmpty();
                            rectF.right = measuredWidth;
                            rectF.bottom = height;
                            float OooO0OO = OooO0OO(rectF);
                            if (OooO0OO != this.OooO.getTextSize()) {
                                OooO0oO(0, OooO0OO);
                            }
                        } finally {
                        }
                    }
                } else {
                    return;
                }
            } else {
                return;
            }
        }
        this.OooO0O0 = true;
    }

    public final int OooO0OO(RectF rectF) {
        StaticLayout staticLayout;
        CharSequence transformation;
        int length = this.OooO0o.length;
        if (length != 0) {
            int i = length - 1;
            int i2 = 1;
            int i3 = 0;
            while (i2 <= i) {
                int i4 = (i2 + i) / 2;
                int i5 = this.OooO0o[i4];
                TextView textView = this.OooO;
                CharSequence text = textView.getText();
                TransformationMethod transformationMethod = textView.getTransformationMethod();
                if (transformationMethod != null && (transformation = transformationMethod.getTransformation(text, textView)) != null) {
                    text = transformation;
                }
                int maxLines = textView.getMaxLines();
                TextPaint textPaint = this.OooO0oo;
                if (textPaint == null) {
                    this.OooO0oo = new TextPaint();
                } else {
                    textPaint.reset();
                }
                this.OooO0oo.set(textView.getPaint());
                this.OooO0oo.setTextSize(i5);
                Layout.Alignment alignment = (Layout.Alignment) OooO0o0(textView, "getLayoutAlignment", Layout.Alignment.ALIGN_NORMAL);
                int round = Math.round(rectF.right);
                if (Build.VERSION.SDK_INT >= 23) {
                    staticLayout = AbstractC0127o00O0Oo.OooO00o(text, alignment, round, maxLines, this.OooO, this.OooO0oo, this.OooOO0O);
                } else {
                    staticLayout = new StaticLayout(text, this.OooO0oo, round, alignment, textView.getLineSpacingMultiplier(), textView.getLineSpacingExtra(), textView.getIncludeFontPadding());
                }
                if ((maxLines != -1 && (staticLayout.getLineCount() > maxLines || staticLayout.getLineEnd(staticLayout.getLineCount() - 1) != text.length())) || staticLayout.getHeight() > rectF.bottom) {
                    i3 = i4 - 1;
                    i = i3;
                } else {
                    int i6 = i4 + 1;
                    i3 = i2;
                    i2 = i6;
                }
            }
            return this.OooO0o[i3];
        }
        throw new IllegalStateException("No available text sizes to choose from.");
    }

    public final boolean OooO0o() {
        if (OooOO0() && this.OooO00o != 0) {
            return true;
        }
        return false;
    }

    public final void OooO0oO(int i, float f) {
        Resources resources;
        Context context = this.OooOO0;
        if (context == null) {
            resources = Resources.getSystem();
        } else {
            resources = context.getResources();
        }
        float applyDimension = TypedValue.applyDimension(i, f, resources.getDisplayMetrics());
        TextView textView = this.OooO;
        if (applyDimension != textView.getPaint().getTextSize()) {
            textView.getPaint().setTextSize(applyDimension);
            boolean isInLayout = textView.isInLayout();
            if (textView.getLayout() != null) {
                this.OooO0O0 = false;
                try {
                    Method OooO0Oo = OooO0Oo("nullLayouts");
                    if (OooO0Oo != null) {
                        OooO0Oo.invoke(textView, null);
                    }
                } catch (Exception unused) {
                }
                if (!isInLayout) {
                    textView.requestLayout();
                } else {
                    textView.forceLayout();
                }
                textView.invalidate();
            }
        }
    }

    public final boolean OooO0oo() {
        if (OooOO0() && this.OooO00o == 1) {
            if (!this.OooO0oO || this.OooO0o.length == 0) {
                int floor = ((int) Math.floor((this.OooO0o0 - this.OooO0Oo) / this.OooO0OO)) + 1;
                int[] iArr = new int[floor];
                for (int i = 0; i < floor; i++) {
                    iArr[i] = Math.round((i * this.OooO0OO) + this.OooO0Oo);
                }
                this.OooO0o = OooO0O0(iArr);
            }
            this.OooO0O0 = true;
        } else {
            this.OooO0O0 = false;
        }
        return this.OooO0O0;
    }

    public final boolean OooOO0() {
        return !(this.OooO instanceof C0110o000oo);
    }

    public final void OooOO0O(float f, float f2, float f3) {
        if (f > 0.0f) {
            if (f2 > f) {
                if (f3 > 0.0f) {
                    this.OooO00o = 1;
                    this.OooO0Oo = f;
                    this.OooO0o0 = f2;
                    this.OooO0OO = f3;
                    this.OooO0oO = false;
                    return;
                }
                throw new IllegalArgumentException("The auto-size step granularity (" + f3 + "px) is less or equal to (0px)");
            }
            throw new IllegalArgumentException("Maximum auto-size text size (" + f2 + "px) is less or equal to minimum auto-size text size (" + f + "px)");
        }
        throw new IllegalArgumentException("Minimum auto-size text size (" + f + "px) is less or equal to (0px)");
    }
}
