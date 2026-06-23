package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.text.TextPaint;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import java.lang.ref.WeakReference;
import java.text.NumberFormat;
/* renamed from: com.ninja.engine.o00Ooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0177o00Ooo0 extends Drawable implements InterfaceC1288oOooO {
    public float OooO;
    public final WeakReference OooO00o;
    public final C0875oO0oOooo OooO0O0;
    public final C1303oOooOO00 OooO0OO;
    public final Rect OooO0Oo;
    public float OooO0o;
    public final C0180o00Ooo0o OooO0o0;
    public float OooO0oO;
    public final int OooO0oo;
    public float OooOO0;
    public float OooOO0O;
    public WeakReference OooOO0o;
    public WeakReference OooOOO0;

    public C0177o00Ooo0(Context context, C0179o00Ooo0O c0179o00Ooo0O) {
        int intValue;
        int intValue2;
        FrameLayout frameLayout;
        C1299oOooO0oO c1299oOooO0oO;
        WeakReference weakReference = new WeakReference(context);
        this.OooO00o = weakReference;
        AbstractC0692o0ooooOo.OooOO0o(context, AbstractC0692o0ooooOo.OooOoO, "Theme.MaterialComponents");
        this.OooO0Oo = new Rect();
        C1303oOooOO00 c1303oOooOO00 = new C1303oOooOO00(this);
        this.OooO0OO = c1303oOooOO00;
        TextPaint textPaint = c1303oOooOO00.OooO00o;
        textPaint.setTextAlign(Paint.Align.CENTER);
        C0180o00Ooo0o c0180o00Ooo0o = new C0180o00Ooo0o(context, c0179o00Ooo0O);
        this.OooO0o0 = c0180o00Ooo0o;
        boolean OooO0o0 = OooO0o0();
        C0179o00Ooo0O c0179o00Ooo0O2 = c0180o00Ooo0o.OooO0O0;
        if (OooO0o0) {
            intValue = c0179o00Ooo0O2.OooO0oO.intValue();
        } else {
            intValue = c0179o00Ooo0O2.OooO0o0.intValue();
        }
        if (OooO0o0()) {
            intValue2 = c0179o00Ooo0O2.OooO0oo.intValue();
        } else {
            intValue2 = c0179o00Ooo0O2.OooO0o.intValue();
        }
        C0875oO0oOooo c0875oO0oOooo = new C0875oO0oOooo(C1204oOoOOOO0.OooO00o(context, intValue, intValue2, new C0017OooOOo(0)).OooO00o());
        this.OooO0O0 = c0875oO0oOooo;
        OooO0oO();
        Context context2 = (Context) weakReference.get();
        if (context2 != null && c1303oOooOO00.OooO0oO != (c1299oOooO0oO = new C1299oOooO0oO(context2, c0179o00Ooo0O2.OooO0Oo.intValue()))) {
            c1303oOooOO00.OooO0O0(c1299oOooO0oO, context2);
            textPaint.setColor(c0179o00Ooo0O2.OooO0OO.intValue());
            invalidateSelf();
            OooO();
            invalidateSelf();
        }
        int i = c0179o00Ooo0O2.OooOO0o;
        if (i != -2) {
            this.OooO0oo = ((int) Math.pow(10.0d, i - 1.0d)) - 1;
        } else {
            this.OooO0oo = c0179o00Ooo0O2.OooOOO0;
        }
        c1303oOooOO00.OooO0o0 = true;
        OooO();
        invalidateSelf();
        c1303oOooOO00.OooO0o0 = true;
        OooO0oO();
        OooO();
        invalidateSelf();
        textPaint.setAlpha(getAlpha());
        invalidateSelf();
        ColorStateList valueOf = ColorStateList.valueOf(c0179o00Ooo0O2.OooO0O0.intValue());
        if (c0875oO0oOooo.OooO00o.OooO0OO != valueOf) {
            c0875oO0oOooo.OooOO0o(valueOf);
            invalidateSelf();
        }
        textPaint.setColor(c0179o00Ooo0O2.OooO0OO.intValue());
        invalidateSelf();
        WeakReference weakReference2 = this.OooOO0o;
        if (weakReference2 != null && weakReference2.get() != null) {
            View view = (View) this.OooOO0o.get();
            WeakReference weakReference3 = this.OooOOO0;
            if (weakReference3 != null) {
                frameLayout = (FrameLayout) weakReference3.get();
            } else {
                frameLayout = null;
            }
            OooO0oo(view, frameLayout);
        }
        OooO();
        setVisible(c0179o00Ooo0O2.OooOo00.booleanValue(), false);
    }

    /* JADX WARN: Code restructure failed: missing block: B:75:0x0178, code lost:
        if (r2.getLayoutDirection() == 0) goto L58;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x017a, code lost:
        r3 = (r5.right + r14.OooOO0) - r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x0183, code lost:
        r3 = (r5.left - r14.OooOO0) + r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0194, code lost:
        if (r2.getLayoutDirection() == 0) goto L104;
     */
    /* JADX WARN: Removed duplicated region for block: B:101:0x0209  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x0221  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x022a  */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0242  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0247  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x0254  */
    /* JADX WARN: Removed duplicated region for block: B:115:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x026e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO() {
        /*
            Method dump skipped, instructions count: 713
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0177o00Ooo0.OooO():void");
    }

    @Override // com.ninja.engine.InterfaceC1288oOooO
    public final void OooO00o() {
        invalidateSelf();
    }

    public final String OooO0O0() {
        boolean z;
        int i = this.OooO0oo;
        C0180o00Ooo0o c0180o00Ooo0o = this.OooO0o0;
        C0179o00Ooo0O c0179o00Ooo0O = c0180o00Ooo0o.OooO0O0;
        String str = c0179o00Ooo0O.OooOO0;
        if (str != null) {
            z = true;
        } else {
            z = false;
        }
        WeakReference weakReference = this.OooO00o;
        if (z) {
            int i2 = c0179o00Ooo0O.OooOO0o;
            if (i2 != -2 && str != null && str.length() > i2) {
                Context context = (Context) weakReference.get();
                if (context == null) {
                    return "";
                }
                return String.format(context.getString(R.string.m3_exceed_max_badge_text_suffix), str.substring(0, i2 - 1), "â€¦");
            }
            return str;
        } else if (OooO0o()) {
            C0179o00Ooo0O c0179o00Ooo0O2 = c0180o00Ooo0o.OooO0O0;
            if (i != -2 && OooO0Oo() > i) {
                Context context2 = (Context) weakReference.get();
                if (context2 == null) {
                    return "";
                }
                return String.format(c0179o00Ooo0O2.OooOOO, context2.getString(R.string.mtrl_exceed_max_badge_number_suffix), Integer.valueOf(i), "+");
            }
            return NumberFormat.getInstance(c0179o00Ooo0O2.OooOOO).format(OooO0Oo());
        } else {
            return null;
        }
    }

    public final FrameLayout OooO0OO() {
        WeakReference weakReference = this.OooOOO0;
        if (weakReference != null) {
            return (FrameLayout) weakReference.get();
        }
        return null;
    }

    public final int OooO0Oo() {
        int i = this.OooO0o0.OooO0O0.OooOO0O;
        if (i == -1) {
            return 0;
        }
        return i;
    }

    public final boolean OooO0o() {
        C0179o00Ooo0O c0179o00Ooo0O = this.OooO0o0.OooO0O0;
        if (c0179o00Ooo0O.OooOO0 == null && c0179o00Ooo0O.OooOO0O != -1) {
            return true;
        }
        return false;
    }

    public final boolean OooO0o0() {
        if (this.OooO0o0.OooO0O0.OooOO0 != null || OooO0o()) {
            return true;
        }
        return false;
    }

    public final void OooO0oO() {
        int intValue;
        int intValue2;
        Context context = (Context) this.OooO00o.get();
        if (context == null) {
            return;
        }
        boolean OooO0o0 = OooO0o0();
        C0180o00Ooo0o c0180o00Ooo0o = this.OooO0o0;
        if (OooO0o0) {
            intValue = c0180o00Ooo0o.OooO0O0.OooO0oO.intValue();
        } else {
            intValue = c0180o00Ooo0o.OooO0O0.OooO0o0.intValue();
        }
        if (OooO0o0()) {
            intValue2 = c0180o00Ooo0o.OooO0O0.OooO0oo.intValue();
        } else {
            intValue2 = c0180o00Ooo0o.OooO0O0.OooO0o.intValue();
        }
        this.OooO0O0.setShapeAppearanceModel(C1204oOoOOOO0.OooO00o(context, intValue, intValue2, new C0017OooOOo(0)).OooO00o());
        invalidateSelf();
    }

    public final void OooO0oo(View view, FrameLayout frameLayout) {
        this.OooOO0o = new WeakReference(view);
        this.OooOOO0 = new WeakReference(frameLayout);
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        viewGroup.setClipChildren(false);
        viewGroup.setClipToPadding(false);
        OooO();
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        String OooO0O0;
        int round;
        if (!getBounds().isEmpty() && getAlpha() != 0 && isVisible()) {
            this.OooO0O0.draw(canvas);
            if (OooO0o0() && (OooO0O0 = OooO0O0()) != null) {
                Rect rect = new Rect();
                C1303oOooOO00 c1303oOooOO00 = this.OooO0OO;
                c1303oOooOO00.OooO00o.getTextBounds(OooO0O0, 0, OooO0O0.length(), rect);
                float exactCenterY = this.OooO0oO - rect.exactCenterY();
                float f = this.OooO0o;
                if (rect.bottom <= 0) {
                    round = (int) exactCenterY;
                } else {
                    round = Math.round(exactCenterY);
                }
                canvas.drawText(OooO0O0, f, round, c1303oOooOO00.OooO00o);
            }
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final int getAlpha() {
        return this.OooO0o0.OooO0O0.OooO;
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return this.OooO0Oo.height();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return this.OooO0Oo.width();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return -3;
    }

    @Override // android.graphics.drawable.Drawable
    public final boolean isStateful() {
        return false;
    }

    @Override // android.graphics.drawable.Drawable, com.ninja.engine.InterfaceC1288oOooO
    public final boolean onStateChange(int[] iArr) {
        return super.onStateChange(iArr);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        C0180o00Ooo0o c0180o00Ooo0o = this.OooO0o0;
        c0180o00Ooo0o.OooO00o.OooO = i;
        c0180o00Ooo0o.OooO0O0.OooO = i;
        this.OooO0OO.OooO00o.setAlpha(getAlpha());
        invalidateSelf();
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
    }
}


