package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.widget.FrameLayout;
import com.ninja.engine.C0096o000o00;
import com.ninja.engine.C0355o0OOO0o;
import com.ninja.engine.C1339oOoooOO0;
import com.ninja.engine.C1470oo0O0OoO;
import com.ninja.engine.InterfaceC0333o0O0oo0O;
import com.ninja.engine.InterfaceC0356o0OOO0o0;
import com.ninja.engine.LayoutInflater$Factory2C0109o000oOoo;
import com.ninja.engine.MenuC0887oO0oo0oo;
import com.ninja.engine.o000000;
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {
    public TypedValue OooO00o;
    public TypedValue OooO0O0;
    public TypedValue OooO0OO;
    public TypedValue OooO0Oo;
    public TypedValue OooO0o;
    public TypedValue OooO0o0;
    public final Rect OooO0oO;
    public InterfaceC0333o0O0oo0O OooO0oo;

    public ContentFrameLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.OooO0oO = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.OooO0o0 == null) {
            this.OooO0o0 = new TypedValue();
        }
        return this.OooO0o0;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.OooO0o == null) {
            this.OooO0o = new TypedValue();
        }
        return this.OooO0o;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.OooO0OO == null) {
            this.OooO0OO = new TypedValue();
        }
        return this.OooO0OO;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.OooO0Oo == null) {
            this.OooO0Oo = new TypedValue();
        }
        return this.OooO0Oo;
    }

    public TypedValue getMinWidthMajor() {
        if (this.OooO00o == null) {
            this.OooO00o = new TypedValue();
        }
        return this.OooO00o;
    }

    public TypedValue getMinWidthMinor() {
        if (this.OooO0O0 == null) {
            this.OooO0O0 = new TypedValue();
        }
        return this.OooO0O0;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        InterfaceC0333o0O0oo0O interfaceC0333o0O0oo0O = this.OooO0oo;
        if (interfaceC0333o0O0oo0O != null) {
            interfaceC0333o0O0oo0O.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        o000000 o000000Var;
        super.onDetachedFromWindow();
        InterfaceC0333o0O0oo0O interfaceC0333o0O0oo0O = this.OooO0oo;
        if (interfaceC0333o0O0oo0O != null) {
            LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = ((C0096o000o00) interfaceC0333o0O0oo0O).OooO00o;
            InterfaceC0356o0OOO0o0 interfaceC0356o0OOO0o0 = layoutInflater$Factory2C0109o000oOoo.OooOOo;
            if (interfaceC0356o0OOO0o0 != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) interfaceC0356o0OOO0o0;
                actionBarOverlayLayout.OooOO0O();
                ActionMenuView actionMenuView = ((C1339oOoooOO0) actionBarOverlayLayout.OooO0o0).OooO00o.OooO00o;
                if (actionMenuView != null && (o000000Var = actionMenuView.OooOo00) != null) {
                    o000000Var.OooO0Oo();
                    C0355o0OOO0o c0355o0OOO0o = o000000Var.OooOo0;
                    if (c0355o0OOO0o != null && c0355o0OOO0o.OooO0O0()) {
                        c0355o0OOO0o.OooOO0.dismiss();
                    }
                }
            }
            if (layoutInflater$Factory2C0109o000oOoo.OooOo0o != null) {
                layoutInflater$Factory2C0109o000oOoo.OooOO0o.getDecorView().removeCallbacks(layoutInflater$Factory2C0109o000oOoo.OooOo);
                if (layoutInflater$Factory2C0109o000oOoo.OooOo0o.isShowing()) {
                    try {
                        layoutInflater$Factory2C0109o000oOoo.OooOo0o.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                layoutInflater$Factory2C0109o000oOoo.OooOo0o = null;
            }
            C1470oo0O0OoO c1470oo0O0OoO = layoutInflater$Factory2C0109o000oOoo.OooOoO0;
            if (c1470oo0O0OoO != null) {
                c1470oo0O0OoO.OooO0O0();
            }
            MenuC0887oO0oo0oo menuC0887oO0oo0oo = layoutInflater$Factory2C0109o000oOoo.OooOoO0(0).OooO0oo;
            if (menuC0887oO0oo0oo != null) {
                menuC0887oO0oo0oo.OooO0OO(true);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00b3  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:62:? A[RETURN, SYNTHETIC] */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onMeasure(int r17, int r18) {
        /*
            Method dump skipped, instructions count: 229
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.widget.ContentFrameLayout.onMeasure(int, int):void");
    }

    public void setAttachListener(InterfaceC0333o0O0oo0O interfaceC0333o0O0oo0O) {
        this.OooO0oo = interfaceC0333o0O0oo0O;
    }
}
