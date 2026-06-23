package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
/* renamed from: com.ninja.engine.o0O0o00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0311o0O0o00 {
    public final float OooO00o;
    public final float OooO0O0;
    public final float OooO0OO;
    public final float OooO0Oo;
    public final int OooO0o0;

    public C0311o0O0o00(Context context, XmlResourceParser xmlResourceParser) {
        this.OooO00o = Float.NaN;
        this.OooO0O0 = Float.NaN;
        this.OooO0OO = Float.NaN;
        this.OooO0Oo = Float.NaN;
        this.OooO0o0 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1031oOOOoOOo.OooOO0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.OooO0o0);
                this.OooO0o0 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0317o0O0o0o0().OooO0O0((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            } else if (index == 1) {
                this.OooO0Oo = obtainStyledAttributes.getDimension(index, this.OooO0Oo);
            } else if (index == 2) {
                this.OooO0O0 = obtainStyledAttributes.getDimension(index, this.OooO0O0);
            } else if (index == 3) {
                this.OooO0OO = obtainStyledAttributes.getDimension(index, this.OooO0OO);
            } else if (index == 4) {
                this.OooO00o = obtainStyledAttributes.getDimension(index, this.OooO00o);
            }
        }
        obtainStyledAttributes.recycle();
    }
}
