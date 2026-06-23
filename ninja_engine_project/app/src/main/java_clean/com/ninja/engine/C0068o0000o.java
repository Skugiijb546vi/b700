package com.ninja.engine;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import androidx.core.widget.NestedScrollView;
import java.lang.ref.WeakReference;
/* renamed from: com.ninja.engine.o0000o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0068o0000o {
    public Button OooO;
    public final Context OooO00o;
    public final DialogInterfaceC0074o0000oOO OooO0O0;
    public final Window OooO0OO;
    public CharSequence OooO0Oo;
    public View OooO0o;
    public AlertController$RecycleListView OooO0o0;
    public int OooO0oO;
    public Button OooOO0;
    public Button OooOO0O;
    public NestedScrollView OooOO0o;
    public Drawable OooOOO;
    public ImageView OooOOOO;
    public TextView OooOOOo;
    public View OooOOo;
    public TextView OooOOo0;
    public ListAdapter OooOOoo;
    public final int OooOo;
    public final int OooOo0;
    public final int OooOo0O;
    public final int OooOo0o;
    public final HandlerC0070o0000o0O OooOoO;
    public final boolean OooOoO0;
    public boolean OooO0oo = false;
    public int OooOOO0 = 0;
    public int OooOo00 = -1;
    public final View$OnClickListenerC0176o00Ooo OooOoOO = new View$OnClickListenerC0176o00Ooo(1, this);

    public C0068o0000o(Context context, DialogInterfaceC0074o0000oOO dialogInterfaceC0074o0000oOO, Window window) {
        this.OooO00o = context;
        this.OooO0O0 = dialogInterfaceC0074o0000oOO;
        this.OooO0OO = window;
        HandlerC0070o0000o0O handlerC0070o0000o0O = new HandlerC0070o0000o0O();
        handlerC0070o0000o0O.OooO0O0 = new WeakReference(dialogInterfaceC0074o0000oOO);
        this.OooOoO = handlerC0070o0000o0O;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(null, AbstractC1039oOOOoo0o.OooO0o0, R.attr.alertDialogStyle, 0);
        this.OooOo0 = obtainStyledAttributes.getResourceId(0, 0);
        obtainStyledAttributes.getResourceId(2, 0);
        this.OooOo0O = obtainStyledAttributes.getResourceId(4, 0);
        obtainStyledAttributes.getResourceId(5, 0);
        this.OooOo0o = obtainStyledAttributes.getResourceId(7, 0);
        this.OooOo = obtainStyledAttributes.getResourceId(3, 0);
        this.OooOoO0 = obtainStyledAttributes.getBoolean(6, true);
        obtainStyledAttributes.getDimensionPixelSize(1, 0);
        obtainStyledAttributes.recycle();
        dialogInterfaceC0074o0000oOO.OooO0o().OooO0o(1);
    }

    public static boolean OooO00o(View view) {
        if (view.onCheckIsTextEditor()) {
            return true;
        }
        if (!(view instanceof ViewGroup)) {
            return false;
        }
        ViewGroup viewGroup = (ViewGroup) view;
        int childCount = viewGroup.getChildCount();
        while (childCount > 0) {
            childCount--;
            if (OooO00o(viewGroup.getChildAt(childCount))) {
                return true;
            }
        }
        return false;
    }

    public static void OooO0O0(View view, View view2, View view3) {
        int i;
        int i2 = 4;
        if (view2 != null) {
            if (view.canScrollVertically(-1)) {
                i = 0;
            } else {
                i = 4;
            }
            view2.setVisibility(i);
        }
        if (view3 != null) {
            if (view.canScrollVertically(1)) {
                i2 = 0;
            }
            view3.setVisibility(i2);
        }
    }

    public static ViewGroup OooO0OO(View view, View view2) {
        if (view == null) {
            if (view2 instanceof ViewStub) {
                view2 = ((ViewStub) view2).inflate();
            }
            return (ViewGroup) view2;
        }
        if (view2 != null) {
            ViewParent parent = view2.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(view2);
            }
        }
        if (view instanceof ViewStub) {
            view = ((ViewStub) view).inflate();
        }
        return (ViewGroup) view;
    }
}


