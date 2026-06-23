package com.ninja.engine;

import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import org.xmlpull.v1.XmlPullParser;
/* loaded from: classes.dex */
public abstract class o0O0OO0O {
    public static Drawable OooO00o(Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        return Drawable.createFromXmlInner(resources, xmlPullParser, attributeSet, theme);
    }

    public static int OooO0O0(TypedArray typedArray) {
        return typedArray.getChangingConfigurations();
    }

    public static void OooO0OO(Drawable drawable, Resources resources, XmlPullParser xmlPullParser, AttributeSet attributeSet, Resources.Theme theme) {
        drawable.inflate(resources, xmlPullParser, attributeSet, theme);
    }
}


