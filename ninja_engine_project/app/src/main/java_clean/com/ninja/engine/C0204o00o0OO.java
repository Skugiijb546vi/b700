package com.ninja.engine;

import android.graphics.Bitmap;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.ImageView;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o00o0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0204o00o0OO implements InterfaceC1292oOooO00O {
    public final View OooO00o;
    public final C1476oo0O0o0o OooO0O0;
    public Animatable OooO0OO;
    public final /* synthetic */ int OooO0Oo;

    public C0204o00o0OO(ImageView imageView, int i) {
        this.OooO0Oo = i;
        this.OooO00o = imageView;
        this.OooO0O0 = new C1476oo0O0o0o(imageView);
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO(InterfaceC1334oOooo0oo interfaceC1334oOooo0oo) {
        this.OooO0O0.OooO0O0.remove(interfaceC1334oOooo0oo);
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO00o(Drawable drawable) {
        OooOO0o(null);
        this.OooO0OO = null;
        ((ImageView) this.OooO00o).setImageDrawable(drawable);
    }

    @Override // com.ninja.engine.oO0O0Oo0
    public final void OooO0O0() {
        Animatable animatable = this.OooO0OO;
        if (animatable != null) {
            animatable.stop();
        }
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO0OO(InterfaceC1098oOOoOo00 interfaceC1098oOOoOo00) {
        this.OooO00o.setTag(R.id.glide_custom_view_target_tag, interfaceC1098oOOoOo00);
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO0Oo(Drawable drawable) {
        OooOO0o(null);
        this.OooO0OO = null;
        ((ImageView) this.OooO00o).setImageDrawable(drawable);
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final InterfaceC1098oOOoOo00 OooO0o() {
        Object tag = this.OooO00o.getTag(R.id.glide_custom_view_target_tag);
        if (tag != null) {
            if (tag instanceof InterfaceC1098oOOoOo00) {
                return (InterfaceC1098oOOoOo00) tag;
            }
            throw new IllegalArgumentException("You must not call setTag() on a view Glide is targeting");
        }
        return null;
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO0o0(InterfaceC1334oOooo0oo interfaceC1334oOooo0oo) {
        int i;
        C1476oo0O0o0o c1476oo0O0o0o = this.OooO0O0;
        View view = c1476oo0O0o0o.OooO00o;
        int paddingRight = view.getPaddingRight() + view.getPaddingLeft();
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        int i2 = 0;
        if (layoutParams != null) {
            i = layoutParams.width;
        } else {
            i = 0;
        }
        int OooO00o = c1476oo0O0o0o.OooO00o(view.getWidth(), i, paddingRight);
        View view2 = c1476oo0O0o0o.OooO00o;
        int paddingBottom = view2.getPaddingBottom() + view2.getPaddingTop();
        ViewGroup.LayoutParams layoutParams2 = view2.getLayoutParams();
        if (layoutParams2 != null) {
            i2 = layoutParams2.height;
        }
        int OooO00o2 = c1476oo0O0o0o.OooO00o(view2.getHeight(), i2, paddingBottom);
        if ((OooO00o <= 0 && OooO00o != Integer.MIN_VALUE) || (OooO00o2 <= 0 && OooO00o2 != Integer.MIN_VALUE)) {
            ArrayList arrayList = c1476oo0O0o0o.OooO0O0;
            if (!arrayList.contains(interfaceC1334oOooo0oo)) {
                arrayList.add(interfaceC1334oOooo0oo);
            }
            if (c1476oo0O0o0o.OooO0OO == null) {
                ViewTreeObserver viewTreeObserver = view2.getViewTreeObserver();
                ViewTreeObserver$OnPreDrawListenerC0329o0O0oOoO viewTreeObserver$OnPreDrawListenerC0329o0O0oOoO = new ViewTreeObserver$OnPreDrawListenerC0329o0O0oOoO(c1476oo0O0o0o);
                c1476oo0O0o0o.OooO0OO = viewTreeObserver$OnPreDrawListenerC0329o0O0oOoO;
                viewTreeObserver.addOnPreDrawListener(viewTreeObserver$OnPreDrawListenerC0329o0O0oOoO);
                return;
            }
            return;
        }
        ((C1220oOoOOooO) interfaceC1334oOooo0oo).OooOO0o(OooO00o, OooO00o2);
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO0oO(Drawable drawable) {
        C1476oo0O0o0o c1476oo0O0o0o = this.OooO0O0;
        ViewTreeObserver viewTreeObserver = c1476oo0O0o0o.OooO00o.getViewTreeObserver();
        if (viewTreeObserver.isAlive()) {
            viewTreeObserver.removeOnPreDrawListener(c1476oo0O0o0o.OooO0OO);
        }
        c1476oo0O0o0o.OooO0OO = null;
        c1476oo0O0o0o.OooO0O0.clear();
        Animatable animatable = this.OooO0OO;
        if (animatable != null) {
            animatable.stop();
        }
        OooOO0o(null);
        this.OooO0OO = null;
        ((ImageView) this.OooO00o).setImageDrawable(drawable);
    }

    @Override // com.ninja.engine.InterfaceC1292oOooO00O
    public final void OooO0oo(Object obj) {
        OooOO0o(obj);
        if (obj instanceof Animatable) {
            Animatable animatable = (Animatable) obj;
            this.OooO0OO = animatable;
            animatable.start();
            return;
        }
        this.OooO0OO = null;
    }

    @Override // com.ninja.engine.oO0O0Oo0
    public final void OooOO0() {
        Animatable animatable = this.OooO0OO;
        if (animatable != null) {
            animatable.start();
        }
    }

    public final void OooOO0o(Object obj) {
        switch (this.OooO0Oo) {
            case 0:
                ((ImageView) this.OooO00o).setImageBitmap((Bitmap) obj);
                return;
            default:
                ((ImageView) this.OooO00o).setImageDrawable((Drawable) obj);
                return;
        }
    }

    public final String toString() {
        return "Target for: " + this.OooO00o;
    }

    @Override // com.ninja.engine.oO0O0Oo0
    public final void OooOO0O() {
    }
}


