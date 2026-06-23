package com.ninja.engine;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.XmlResourceParser;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
/* renamed from: com.ninja.engine.oOOooOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1132oOOooOoo {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ C1132oOOooOoo(int i) {
        this.OooO00o = i;
    }

    public final Drawable OooO00o(Context context, XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Resources.Theme theme) {
        switch (this.OooO00o) {
            case 0:
                String classAttribute = attributeSet.getClassAttribute();
                if (classAttribute == null) {
                    return null;
                }
                try {
                    Drawable drawable = (Drawable) C1132oOOooOoo.class.getClassLoader().loadClass(classAttribute).asSubclass(Drawable.class).getDeclaredConstructor(null).newInstance(null);
                    o0O0OO0O.OooO0OO(drawable, context.getResources(), xmlResourceParser, attributeSet, theme);
                    return drawable;
                } catch (Exception unused) {
                    return null;
                }
            case 1:
                try {
                    return C0092o000Ooo.OooO0o0(context, context.getResources(), xmlResourceParser, attributeSet, theme);
                } catch (Exception unused2) {
                    return null;
                }
            case 2:
                try {
                    Resources resources = context.getResources();
                    o000O00O o000o00o = new o000O00O(context);
                    o000o00o.inflate(resources, xmlResourceParser, attributeSet, theme);
                    return o000o00o;
                } catch (Exception unused3) {
                    return null;
                }
            default:
                try {
                    Resources resources2 = context.getResources();
                    C1428oo00oOO c1428oo00oOO = new C1428oo00oOO();
                    c1428oo00oOO.inflate(resources2, xmlResourceParser, attributeSet, theme);
                    return c1428oo00oOO;
                } catch (Exception unused4) {
                    return null;
                }
        }
    }
}


