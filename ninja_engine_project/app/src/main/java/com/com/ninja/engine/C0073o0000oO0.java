package com.ninja.engine;

import android.content.Context;
import android.content.DialogInterface;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.ListAdapter;
import android.widget.TextView;
import androidx.appcompat.app.AlertController$RecycleListView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.Collections;
/* renamed from: com.ninja.engine.o0000oO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0073o0000oO0 implements InterfaceC1134oOOooo0, InterfaceC0052OooooOO {
    public final int OooO00o;
    public final Object OooO0O0;

    public C0073o0000oO0(int i) {
        switch (i) {
            case 4:
                this.OooO00o = 1;
                this.OooO0O0 = Collections.singletonList(null);
                return;
            default:
                this.OooO0O0 = Bitmap.CompressFormat.JPEG;
                this.OooO00o = 100;
                return;
        }
    }

    public DialogInterfaceC0074o0000oOO OooO00o() {
        int i;
        C0069o0000o0 c0069o0000o0 = (C0069o0000o0) this.OooO0O0;
        DialogInterfaceC0074o0000oOO dialogInterfaceC0074o0000oOO = new DialogInterfaceC0074o0000oOO(c0069o0000o0.OooO00o, this.OooO00o);
        View view = c0069o0000o0.OooO0o0;
        C0068o0000o c0068o0000o = dialogInterfaceC0074o0000oOO.OooO0o;
        if (view != null) {
            c0068o0000o.OooOOo = view;
        } else {
            CharSequence charSequence = c0069o0000o0.OooO0Oo;
            if (charSequence != null) {
                c0068o0000o.OooO0Oo = charSequence;
                TextView textView = c0068o0000o.OooOOOo;
                if (textView != null) {
                    textView.setText(charSequence);
                }
            }
            Drawable drawable = c0069o0000o0.OooO0OO;
            if (drawable != null) {
                c0068o0000o.OooOOO = drawable;
                c0068o0000o.OooOOO0 = 0;
                ImageView imageView = c0068o0000o.OooOOOO;
                if (imageView != null) {
                    imageView.setVisibility(0);
                    c0068o0000o.OooOOOO.setImageDrawable(drawable);
                }
            }
        }
        if (c0069o0000o0.OooO0oO != null) {
            AlertController$RecycleListView alertController$RecycleListView = (AlertController$RecycleListView) c0069o0000o0.OooO0O0.inflate(c0068o0000o.OooOo0O, (ViewGroup) null);
            if (c0069o0000o0.OooOO0) {
                i = c0068o0000o.OooOo0o;
            } else {
                i = c0068o0000o.OooOo;
            }
            ListAdapter listAdapter = c0069o0000o0.OooO0oO;
            if (listAdapter == null) {
                listAdapter = new ArrayAdapter(c0069o0000o0.OooO00o, i, 16908308, (Object[]) null);
            }
            c0068o0000o.OooOOoo = listAdapter;
            c0068o0000o.OooOo00 = c0069o0000o0.OooOO0O;
            if (c0069o0000o0.OooO0oo != null) {
                alertController$RecycleListView.setOnItemClickListener(new C0066o0000OoO(c0069o0000o0, c0068o0000o));
            }
            if (c0069o0000o0.OooOO0) {
                alertController$RecycleListView.setChoiceMode(1);
            }
            c0068o0000o.OooO0o0 = alertController$RecycleListView;
        }
        View view2 = c0069o0000o0.OooO;
        if (view2 != null) {
            c0068o0000o.OooO0o = view2;
            c0068o0000o.OooO0oO = 0;
            c0068o0000o.OooO0oo = false;
        }
        dialogInterfaceC0074o0000oOO.setCancelable(true);
        dialogInterfaceC0074o0000oOO.setCanceledOnTouchOutside(true);
        dialogInterfaceC0074o0000oOO.setOnCancelListener(null);
        dialogInterfaceC0074o0000oOO.setOnDismissListener(null);
        DialogInterface.OnKeyListener onKeyListener = c0069o0000o0.OooO0o;
        if (onKeyListener != null) {
            dialogInterfaceC0074o0000oOO.setOnKeyListener(onKeyListener);
        }
        return dialogInterfaceC0074o0000oOO;
    }

    @Override // com.ninja.engine.InterfaceC0052OooooOO
    public boolean OooO0O0(View view) {
        ((BottomSheetBehavior) this.OooO0O0).Oooo000(this.OooO00o);
        return true;
    }

    @Override // com.ninja.engine.InterfaceC1134oOOooo0
    public InterfaceC1108oOOoo OooOOo(InterfaceC1108oOOoo interfaceC1108oOOoo, C0973oOOO00o c0973oOOO00o) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        ((Bitmap) interfaceC1108oOOoo.get()).compress((Bitmap.CompressFormat) this.OooO0O0, this.OooO00o, byteArrayOutputStream);
        interfaceC1108oOOoo.OooO0Oo();
        return new C0077o0000oo0(byteArrayOutputStream.toByteArray());
    }

    public /* synthetic */ C0073o0000oO0(int i, Object obj) {
        this.OooO0O0 = obj;
        this.OooO00o = i;
    }

    public C0073o0000oO0(Context context) {
        this(context, DialogInterfaceC0074o0000oOO.OooO(context, 0));
    }

    public C0073o0000oO0(Context context, int i) {
        this.OooO0O0 = new C0069o0000o0(new ContextThemeWrapper(context, DialogInterfaceC0074o0000oOO.OooO(context, i)));
        this.OooO00o = i;
    }

    public C0073o0000oO0(ArrayList arrayList) {
        this.OooO00o = 0;
        this.OooO0O0 = arrayList;
    }
}
