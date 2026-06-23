package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.util.Xml;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.o00oOo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0240o00oOo0o implements InterfaceC0954oOO0oOo {
    public final int OooO00o;
    public final int OooO0O0;
    public final Object OooO0OO;

    public C0240o00oOo0o(Context context, XmlResourceParser xmlResourceParser) {
        this.OooO0OO = new ArrayList();
        this.OooO0O0 = -1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(Xml.asAttributeSet(xmlResourceParser), AbstractC1031oOOOoOOo.OooO0oo);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 0) {
                this.OooO00o = obtainStyledAttributes.getResourceId(index, this.OooO00o);
            } else if (index == 1) {
                int resourceId = obtainStyledAttributes.getResourceId(index, this.OooO0O0);
                this.OooO0O0 = resourceId;
                String resourceTypeName = context.getResources().getResourceTypeName(resourceId);
                context.getResources().getResourceName(resourceId);
                if ("layout".equals(resourceTypeName)) {
                    new C0317o0O0o0o0().OooO0O0((ConstraintLayout) LayoutInflater.from(context).inflate(resourceId, (ViewGroup) null));
                }
            }
        }
        obtainStyledAttributes.recycle();
    }

    @Override // com.ninja.engine.InterfaceC0954oOO0oOo
    public C1536oo0OoOoO OooOO0o(View view, C1536oo0OoOoO c1536oo0OoOoO) {
        int i = c1536oo0OoOoO.OooO00o.OooO0o(7).OooO0O0;
        int i2 = this.OooO00o;
        View view2 = (View) this.OooO0OO;
        if (i2 >= 0) {
            view2.getLayoutParams().height = i2 + i;
            view2.setLayoutParams(view2.getLayoutParams());
        }
        view2.setPadding(view2.getPaddingLeft(), this.OooO0O0 + i, view2.getPaddingRight(), view2.getPaddingBottom());
        return c1536oo0OoOoO;
    }

    public C0240o00oOo0o(View view, int i, int i2) {
        this.OooO00o = i;
        this.OooO0OO = view;
        this.OooO0O0 = i2;
    }

    public C0240o00oOo0o(byte[] bArr, int i, int i2) {
        this.OooO0OO = bArr;
        this.OooO00o = i;
        this.OooO0O0 = i2;
    }
}
