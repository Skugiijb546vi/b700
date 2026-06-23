package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.widget.ImageView;
/* renamed from: com.ninja.engine.o000ooOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0117o000ooOO {
    public final ImageView OooO00o;
    public C1324oOooo000 OooO0O0;
    public C1324oOooo000 OooO0OO;
    public int OooO0Oo = 0;

    public C0117o000ooOO(ImageView imageView) {
        this.OooO00o = imageView;
    }

    /* JADX WARN: Type inference failed for: r2v4, types: [com.ninja.engine.oOooo000, java.lang.Object] */
    public final void OooO00o() {
        ImageView imageView = this.OooO00o;
        Drawable drawable = imageView.getDrawable();
        if (drawable != null) {
            AbstractC0420o0Oo0Oo.OooO00o(drawable);
        }
        if (drawable != null) {
            int i = Build.VERSION.SDK_INT;
            if (i <= 21 && i == 21) {
                if (this.OooO0OO == null) {
                    this.OooO0OO = new C1324oOooo000();
                }
                C1324oOooo000 c1324oOooo000 = this.OooO0OO;
                c1324oOooo000.OooO00o = null;
                c1324oOooo000.OooO0Oo = false;
                c1324oOooo000.OooO0O0 = null;
                c1324oOooo000.OooO0OO = false;
                ColorStateList imageTintList = imageView.getImageTintList();
                if (imageTintList != null) {
                    c1324oOooo000.OooO0Oo = true;
                    c1324oOooo000.OooO00o = imageTintList;
                }
                PorterDuff.Mode imageTintMode = imageView.getImageTintMode();
                if (imageTintMode != null) {
                    c1324oOooo000.OooO0OO = true;
                    c1324oOooo000.OooO0O0 = imageTintMode;
                }
                if (c1324oOooo000.OooO0Oo || c1324oOooo000.OooO0OO) {
                    C0113o000oo0O.OooO0o0(drawable, c1324oOooo000, imageView.getDrawableState());
                    return;
                }
            }
            C1324oOooo000 c1324oOooo0002 = this.OooO0O0;
            if (c1324oOooo0002 != null) {
                C0113o000oo0O.OooO0o0(drawable, c1324oOooo0002, imageView.getDrawableState());
            }
        }
    }

    public final void OooO0O0(AttributeSet attributeSet, int i) {
        Drawable drawable;
        Drawable drawable2;
        int resourceId;
        ImageView imageView = this.OooO00o;
        Context context = imageView.getContext();
        int[] iArr = AbstractC1039oOOOoo0o.OooO0o;
        C0131o00O0o Oooo0O0 = C0131o00O0o.Oooo0O0(context, attributeSet, iArr, i, 0);
        AbstractC1460oo0O00oo.OooOOOO(imageView, imageView.getContext(), iArr, attributeSet, (TypedArray) Oooo0O0.OooO0O0, i);
        try {
            Drawable drawable3 = imageView.getDrawable();
            TypedArray typedArray = (TypedArray) Oooo0O0.OooO0O0;
            if (drawable3 == null && (resourceId = typedArray.getResourceId(1, -1)) != -1 && (drawable3 = AbstractC0692o0ooooOo.OooOo0(imageView.getContext(), resourceId)) != null) {
                imageView.setImageDrawable(drawable3);
            }
            if (drawable3 != null) {
                AbstractC0420o0Oo0Oo.OooO00o(drawable3);
            }
            if (typedArray.hasValue(2)) {
                ColorStateList OooOo0O = Oooo0O0.OooOo0O(2);
                int i2 = Build.VERSION.SDK_INT;
                imageView.setImageTintList(OooOo0O);
                if (i2 == 21 && (drawable2 = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable2.isStateful()) {
                        drawable2.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable2);
                }
            }
            if (typedArray.hasValue(3)) {
                PorterDuff.Mode OooO0O0 = AbstractC0420o0Oo0Oo.OooO0O0(typedArray.getInt(3, -1), null);
                int i3 = Build.VERSION.SDK_INT;
                imageView.setImageTintMode(OooO0O0);
                if (i3 == 21 && (drawable = imageView.getDrawable()) != null && imageView.getImageTintList() != null) {
                    if (drawable.isStateful()) {
                        drawable.setState(imageView.getDrawableState());
                    }
                    imageView.setImageDrawable(drawable);
                }
            }
            Oooo0O0.Oooo0o0();
        } catch (Throwable th) {
            Oooo0O0.Oooo0o0();
            throw th;
        }
    }
}


