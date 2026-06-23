package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.net.Uri;
import android.util.AttributeSet;
import android.widget.ImageView;
/* renamed from: com.ninja.engine.o000ooo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0119o000ooo0 extends ImageView {
    public final o0000OO0 OooO00o;
    public final C0117o000ooOO OooO0O0;
    public boolean OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0119o000ooo0(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        AbstractC1320oOooOooo.OooO00o(context);
        this.OooO0OO = false;
        AbstractC1313oOooOo0.OooO00o(this, getContext());
        o0000OO0 o0000oo0 = new o0000OO0(this);
        this.OooO00o = o0000oo0;
        o0000oo0.OooOO0O(attributeSet, i);
        C0117o000ooOO c0117o000ooOO = new C0117o000ooOO(this);
        this.OooO0O0 = c0117o000ooOO;
        c0117o000ooOO.OooO0O0(attributeSet, i);
    }

    @Override // android.widget.ImageView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        o0000OO0 o0000oo0 = this.OooO00o;
        if (o0000oo0 != null) {
            o0000oo0.OooO00o();
        }
        C0117o000ooOO c0117o000ooOO = this.OooO0O0;
        if (c0117o000ooOO != null) {
            c0117o000ooOO.OooO00o();
        }
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

    public ColorStateList getSupportImageTintList() {
        C1324oOooo000 c1324oOooo000;
        C0117o000ooOO c0117o000ooOO = this.OooO0O0;
        if (c0117o000ooOO == null || (c1324oOooo000 = c0117o000ooOO.OooO0O0) == null) {
            return null;
        }
        return c1324oOooo000.OooO00o;
    }

    public PorterDuff.Mode getSupportImageTintMode() {
        C1324oOooo000 c1324oOooo000;
        C0117o000ooOO c0117o000ooOO = this.OooO0O0;
        if (c0117o000ooOO == null || (c1324oOooo000 = c0117o000ooOO.OooO0O0) == null) {
            return null;
        }
        return c1324oOooo000.OooO0O0;
    }

    @Override // android.widget.ImageView, android.view.View
    public final boolean hasOverlappingRendering() {
        if ((!(this.OooO0O0.OooO00o.getBackground() instanceof RippleDrawable)) && super.hasOverlappingRendering()) {
            return true;
        }
        return false;
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

    @Override // android.widget.ImageView
    public void setImageBitmap(Bitmap bitmap) {
        super.setImageBitmap(bitmap);
        C0117o000ooOO c0117o000ooOO = this.OooO0O0;
        if (c0117o000ooOO != null) {
            c0117o000ooOO.OooO00o();
        }
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(Drawable drawable) {
        C0117o000ooOO c0117o000ooOO = this.OooO0O0;
        if (c0117o000ooOO != null && drawable != null && !this.OooO0OO) {
            c0117o000ooOO.OooO0Oo = drawable.getLevel();
        }
        super.setImageDrawable(drawable);
        if (c0117o000ooOO != null) {
            c0117o000ooOO.OooO00o();
            if (!this.OooO0OO) {
                ImageView imageView = c0117o000ooOO.OooO00o;
                if (imageView.getDrawable() != null) {
                    imageView.getDrawable().setLevel(c0117o000ooOO.OooO0Oo);
                }
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageLevel(int i) {
        super.setImageLevel(i);
        this.OooO0OO = true;
    }

    @Override // android.widget.ImageView
    public void setImageResource(int i) {
        Drawable drawable;
        C0117o000ooOO c0117o000ooOO = this.OooO0O0;
        if (c0117o000ooOO != null) {
            ImageView imageView = c0117o000ooOO.OooO00o;
            if (i != 0) {
                drawable = AbstractC0692o0ooooOo.OooOo0(imageView.getContext(), i);
                if (drawable != null) {
                    AbstractC0420o0Oo0Oo.OooO00o(drawable);
                }
            } else {
                drawable = null;
            }
            imageView.setImageDrawable(drawable);
            c0117o000ooOO.OooO00o();
        }
    }

    @Override // android.widget.ImageView
    public void setImageURI(Uri uri) {
        super.setImageURI(uri);
        C0117o000ooOO c0117o000ooOO = this.OooO0O0;
        if (c0117o000ooOO != null) {
            c0117o000ooOO.OooO00o();
        }
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

    /* JADX WARN: Type inference failed for: r1v2, types: [com.ninja.engine.oOooo000, java.lang.Object] */
    public void setSupportImageTintList(ColorStateList colorStateList) {
        C0117o000ooOO c0117o000ooOO = this.OooO0O0;
        if (c0117o000ooOO != null) {
            if (c0117o000ooOO.OooO0O0 == null) {
                c0117o000ooOO.OooO0O0 = new C1324oOooo000();
            }
            C1324oOooo000 c1324oOooo000 = c0117o000ooOO.OooO0O0;
            c1324oOooo000.OooO00o = colorStateList;
            c1324oOooo000.OooO0Oo = true;
            c0117o000ooOO.OooO00o();
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.ninja.engine.oOooo000, java.lang.Object] */
    public void setSupportImageTintMode(PorterDuff.Mode mode) {
        C0117o000ooOO c0117o000ooOO = this.OooO0O0;
        if (c0117o000ooOO != null) {
            if (c0117o000ooOO.OooO0O0 == null) {
                c0117o000ooOO.OooO0O0 = new C1324oOooo000();
            }
            C1324oOooo000 c1324oOooo000 = c0117o000ooOO.OooO0O0;
            c1324oOooo000.OooO0O0 = mode;
            c1324oOooo000.OooO0OO = true;
            c0117o000ooOO.OooO00o();
        }
    }
}


