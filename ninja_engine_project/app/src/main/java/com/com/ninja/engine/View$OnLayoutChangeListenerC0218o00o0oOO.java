package com.ninja.engine;

import android.graphics.Rect;
import android.view.View;
import android.widget.ImageView;
import com.google.android.material.bottomappbar.BottomAppBar$Behavior;
/* renamed from: com.ninja.engine.o00o0oOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnLayoutChangeListenerC0218o00o0oOO implements View.OnLayoutChangeListener {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ Object OooO0O0;

    public /* synthetic */ View$OnLayoutChangeListenerC0218o00o0oOO(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    @Override // android.view.View.OnLayoutChangeListener
    public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
        C0177o00Ooo0 c0177o00Ooo0;
        switch (this.OooO00o) {
            case 0:
                ((BottomAppBar$Behavior) this.OooO0O0).getClass();
                throw null;
            default:
                AbstractC0921oOO00ooO abstractC0921oOO00ooO = (AbstractC0921oOO00ooO) this.OooO0O0;
                if (abstractC0921oOO00ooO.OooOOO.getVisibility() == 0 && (c0177o00Ooo0 = abstractC0921oOO00ooO.Oooo000) != null) {
                    Rect rect = new Rect();
                    ImageView imageView = abstractC0921oOO00ooO.OooOOO;
                    imageView.getDrawingRect(rect);
                    c0177o00Ooo0.setBounds(rect);
                    c0177o00Ooo0.OooO0oo(imageView, null);
                    return;
                }
                return;
        }
    }
}
