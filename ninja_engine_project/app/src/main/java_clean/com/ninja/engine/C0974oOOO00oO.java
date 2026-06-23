package com.ninja.engine;

import android.graphics.Rect;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: com.ninja.engine.oOOO00oO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0974oOOO00oO extends AbstractC0462o0OoOoo {
    public final /* synthetic */ int OooO0Oo;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C0974oOOO00oO(AbstractC1066oOOo0Oo abstractC1066oOOo0Oo, int i) {
        super(abstractC1066oOOo0Oo);
        this.OooO0Oo = i;
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final int OooO() {
        switch (this.OooO0Oo) {
            case 0:
                return ((AbstractC1066oOOo0Oo) this.OooO0O0).OooOO0o;
            default:
                return ((AbstractC1066oOOo0Oo) this.OooO0O0).OooOOO0;
        }
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final int OooO0O0(View view) {
        switch (this.OooO0Oo) {
            case 0:
                ((AbstractC1066oOOo0Oo) this.OooO0O0).getClass();
                return view.getRight() + ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0.right + ((ViewGroup.MarginLayoutParams) ((C1068oOOo0OoO) view.getLayoutParams())).rightMargin;
            default:
                ((AbstractC1066oOOo0Oo) this.OooO0O0).getClass();
                return view.getBottom() + ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0.bottom + ((ViewGroup.MarginLayoutParams) ((C1068oOOo0OoO) view.getLayoutParams())).bottomMargin;
        }
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final int OooO0OO(View view) {
        switch (this.OooO0Oo) {
            case 0:
                C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) view.getLayoutParams();
                ((AbstractC1066oOOo0Oo) this.OooO0O0).getClass();
                return AbstractC1066oOOo0Oo.OooOoOO(view) + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).leftMargin + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).rightMargin;
            default:
                C1068oOOo0OoO c1068oOOo0OoO2 = (C1068oOOo0OoO) view.getLayoutParams();
                ((AbstractC1066oOOo0Oo) this.OooO0O0).getClass();
                return AbstractC1066oOOo0Oo.OooOoO(view) + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO2).topMargin + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO2).bottomMargin;
        }
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final int OooO0Oo(View view) {
        switch (this.OooO0Oo) {
            case 0:
                C1068oOOo0OoO c1068oOOo0OoO = (C1068oOOo0OoO) view.getLayoutParams();
                ((AbstractC1066oOOo0Oo) this.OooO0O0).getClass();
                return AbstractC1066oOOo0Oo.OooOoO(view) + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).topMargin + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO).bottomMargin;
            default:
                C1068oOOo0OoO c1068oOOo0OoO2 = (C1068oOOo0OoO) view.getLayoutParams();
                ((AbstractC1066oOOo0Oo) this.OooO0O0).getClass();
                return AbstractC1066oOOo0Oo.OooOoOO(view) + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO2).leftMargin + ((ViewGroup.MarginLayoutParams) c1068oOOo0OoO2).rightMargin;
        }
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final int OooO0o() {
        switch (this.OooO0Oo) {
            case 0:
                return ((AbstractC1066oOOo0Oo) this.OooO0O0).OooOOO;
            default:
                return ((AbstractC1066oOOo0Oo) this.OooO0O0).OooOOOO;
        }
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final int OooO0o0(View view) {
        switch (this.OooO0Oo) {
            case 0:
                ((AbstractC1066oOOo0Oo) this.OooO0O0).getClass();
                return (view.getLeft() - ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0.left) - ((ViewGroup.MarginLayoutParams) ((C1068oOOo0OoO) view.getLayoutParams())).leftMargin;
            default:
                ((AbstractC1066oOOo0Oo) this.OooO0O0).getClass();
                return (view.getTop() - ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0.top) - ((ViewGroup.MarginLayoutParams) ((C1068oOOo0OoO) view.getLayoutParams())).topMargin;
        }
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final int OooO0oO() {
        switch (this.OooO0Oo) {
            case 0:
                AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = (AbstractC1066oOOo0Oo) this.OooO0O0;
                return abstractC1066oOOo0Oo.OooOOO - abstractC1066oOOo0Oo.Oooo000();
            default:
                AbstractC1066oOOo0Oo abstractC1066oOOo0Oo2 = (AbstractC1066oOOo0Oo) this.OooO0O0;
                return abstractC1066oOOo0Oo2.OooOOOO - abstractC1066oOOo0Oo2.OooOooO();
        }
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final int OooO0oo() {
        switch (this.OooO0Oo) {
            case 0:
                return ((AbstractC1066oOOo0Oo) this.OooO0O0).Oooo000();
            default:
                return ((AbstractC1066oOOo0Oo) this.OooO0O0).OooOooO();
        }
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final int OooOO0() {
        switch (this.OooO0Oo) {
            case 0:
                return ((AbstractC1066oOOo0Oo) this.OooO0O0).OooOOO0;
            default:
                return ((AbstractC1066oOOo0Oo) this.OooO0O0).OooOO0o;
        }
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final int OooOO0O() {
        switch (this.OooO0Oo) {
            case 0:
                return ((AbstractC1066oOOo0Oo) this.OooO0O0).OooOooo();
            default:
                return ((AbstractC1066oOOo0Oo) this.OooO0O0).Oooo00O();
        }
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final int OooOO0o() {
        switch (this.OooO0Oo) {
            case 0:
                AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = (AbstractC1066oOOo0Oo) this.OooO0O0;
                return (abstractC1066oOOo0Oo.OooOOO - abstractC1066oOOo0Oo.OooOooo()) - abstractC1066oOOo0Oo.Oooo000();
            default:
                AbstractC1066oOOo0Oo abstractC1066oOOo0Oo2 = (AbstractC1066oOOo0Oo) this.OooO0O0;
                return (abstractC1066oOOo0Oo2.OooOOOO - abstractC1066oOOo0Oo2.Oooo00O()) - abstractC1066oOOo0Oo2.OooOooO();
        }
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final int OooOOO(View view) {
        switch (this.OooO0Oo) {
            case 0:
                Rect rect = (Rect) this.OooO0OO;
                ((AbstractC1066oOOo0Oo) this.OooO0O0).Oooo0OO(view, rect);
                return rect.right;
            default:
                Rect rect2 = (Rect) this.OooO0OO;
                ((AbstractC1066oOOo0Oo) this.OooO0O0).Oooo0OO(view, rect2);
                return rect2.bottom;
        }
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final int OooOOOO(View view) {
        switch (this.OooO0Oo) {
            case 0:
                Rect rect = (Rect) this.OooO0OO;
                ((AbstractC1066oOOo0Oo) this.OooO0O0).Oooo0OO(view, rect);
                return rect.left;
            default:
                Rect rect2 = (Rect) this.OooO0OO;
                ((AbstractC1066oOOo0Oo) this.OooO0O0).Oooo0OO(view, rect2);
                return rect2.top;
        }
    }

    @Override // com.ninja.engine.AbstractC0462o0OoOoo
    public final void OooOOOo(int i) {
        switch (this.OooO0Oo) {
            case 0:
                ((AbstractC1066oOOo0Oo) this.OooO0O0).Oooo0oo(i);
                return;
            default:
                ((AbstractC1066oOOo0Oo) this.OooO0O0).Oooo(i);
                return;
        }
    }
}


