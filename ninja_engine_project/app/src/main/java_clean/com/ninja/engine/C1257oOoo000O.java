package com.ninja.engine;

import android.os.Build;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.text.TextPaint;
import android.text.TextUtils;
import java.lang.reflect.Constructor;
/* renamed from: com.ninja.engine.oOoo000O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1257oOoo000O {
    public static boolean OooOOO;
    public static final int OooOOO0;
    public static Constructor OooOOOO;
    public static TextDirectionHeuristic OooOOOo;
    public CharSequence OooO00o;
    public final TextPaint OooO0O0;
    public final int OooO0OO;
    public int OooO0Oo;
    public boolean OooOO0O;
    public Layout.Alignment OooO0o0 = Layout.Alignment.ALIGN_NORMAL;
    public int OooO0o = Integer.MAX_VALUE;
    public float OooO0oO = 0.0f;
    public float OooO0oo = 1.0f;
    public int OooO = OooOOO0;
    public boolean OooOO0 = true;
    public TextUtils.TruncateAt OooOO0o = null;

    static {
        int i;
        if (Build.VERSION.SDK_INT >= 23) {
            i = 1;
        } else {
            i = 0;
        }
        OooOOO0 = i;
    }

    public C1257oOoo000O(CharSequence charSequence, TextPaint textPaint, int i) {
        this.OooO00o = charSequence;
        this.OooO0O0 = textPaint;
        this.OooO0OO = i;
        this.OooO0Oo = charSequence.length();
    }

    public final StaticLayout OooO00o() {
        boolean z;
        TextDirectionHeuristic textDirectionHeuristic;
        StaticLayout.Builder obtain;
        TextDirectionHeuristic textDirectionHeuristic2;
        StaticLayout build;
        TextPaint textPaint = this.OooO0O0;
        if (this.OooO00o == null) {
            this.OooO00o = "";
        }
        int max = Math.max(0, this.OooO0OO);
        CharSequence charSequence = this.OooO00o;
        if (this.OooO0o == 1) {
            charSequence = TextUtils.ellipsize(charSequence, textPaint, max, this.OooOO0o);
        }
        int min = Math.min(charSequence.length(), this.OooO0Oo);
        this.OooO0Oo = min;
        int i = Build.VERSION.SDK_INT;
        if (i >= 23) {
            if (this.OooOO0O && this.OooO0o == 1) {
                this.OooO0o0 = Layout.Alignment.ALIGN_OPPOSITE;
            }
            obtain = StaticLayout.Builder.obtain(charSequence, 0, min, textPaint, max);
            obtain.setAlignment(this.OooO0o0);
            obtain.setIncludePad(this.OooOO0);
            if (this.OooOO0O) {
                textDirectionHeuristic2 = TextDirectionHeuristics.RTL;
            } else {
                textDirectionHeuristic2 = TextDirectionHeuristics.LTR;
            }
            obtain.setTextDirection(textDirectionHeuristic2);
            TextUtils.TruncateAt truncateAt = this.OooOO0o;
            if (truncateAt != null) {
                obtain.setEllipsize(truncateAt);
            }
            obtain.setMaxLines(this.OooO0o);
            float f = this.OooO0oO;
            if (f != 0.0f || this.OooO0oo != 1.0f) {
                obtain.setLineSpacing(f, this.OooO0oo);
            }
            if (this.OooO0o > 1) {
                obtain.setHyphenationFrequency(this.OooO);
            }
            build = obtain.build();
            return build;
        }
        if (!OooOOO) {
            try {
                if (this.OooOO0O && i >= 23) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    textDirectionHeuristic = TextDirectionHeuristics.RTL;
                } else {
                    textDirectionHeuristic = TextDirectionHeuristics.LTR;
                }
                OooOOOo = textDirectionHeuristic;
                Class cls = Integer.TYPE;
                Class cls2 = Float.TYPE;
                Constructor declaredConstructor = StaticLayout.class.getDeclaredConstructor(CharSequence.class, cls, cls, TextPaint.class, cls, Layout.Alignment.class, TextDirectionHeuristic.class, cls2, cls2, Boolean.TYPE, TextUtils.TruncateAt.class, cls, cls);
                OooOOOO = declaredConstructor;
                declaredConstructor.setAccessible(true);
                OooOOO = true;
            } catch (Exception e) {
                throw new C1255oOoo000(e);
            }
        }
        try {
            Constructor constructor = OooOOOO;
            constructor.getClass();
            Integer valueOf = Integer.valueOf(this.OooO0Oo);
            Integer valueOf2 = Integer.valueOf(max);
            Layout.Alignment alignment = this.OooO0o0;
            TextDirectionHeuristic textDirectionHeuristic3 = OooOOOo;
            textDirectionHeuristic3.getClass();
            return (StaticLayout) constructor.newInstance(charSequence, 0, valueOf, textPaint, valueOf2, alignment, textDirectionHeuristic3, Float.valueOf(1.0f), Float.valueOf(0.0f), Boolean.valueOf(this.OooOO0), null, Integer.valueOf(max), Integer.valueOf(this.OooO0o));
        } catch (Exception e2) {
            throw new C1255oOoo000(e2);
        }
    }
}


