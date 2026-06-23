package com.ninja.engine;

import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.core.widget.NestedScrollView;
/* renamed from: com.ninja.engine.o0000oOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class DialogInterfaceC0074o0000oOO extends DialogC0302o0O0Oo0O implements DialogInterface, o000OOO {
    public LayoutInflater$Factory2C0109o000oOoo OooO0Oo;
    public final C0068o0000o OooO0o;
    public final C0112o000oo00 OooO0o0;

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Type inference failed for: r2v2, types: [com.ninja.engine.C0112o000oo00] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public DialogInterfaceC0074o0000oOO(android.content.Context r5, int r6) {
        /*
            r4 = this;
            int r6 = OooO(r5, r6)
            r0 = 1
            r1 = 2130968962(0x7f040182, float:1.7546592E38)
            if (r6 != 0) goto L19
            android.util.TypedValue r2 = new android.util.TypedValue
            r2.<init>()
            android.content.res.Resources$Theme r3 = r5.getTheme()
            r3.resolveAttribute(r1, r2, r0)
            int r2 = r2.resourceId
            goto L1a
        L19:
            r2 = r6
        L1a:
            r4.<init>(r5, r2)
            com.ninja.engine.C0112o000oo00 r2 = new com.ninja.engine.C0112o000oo00
            r2.<init>()
            r4.OooO0o0 = r2
            com.ninja.engine.o000OooO r2 = r4.OooO0o()
            if (r6 != 0) goto L38
            android.util.TypedValue r6 = new android.util.TypedValue
            r6.<init>()
            android.content.res.Resources$Theme r5 = r5.getTheme()
            r5.resolveAttribute(r1, r6, r0)
            int r6 = r6.resourceId
        L38:
            r5 = r2
            com.ninja.engine.o000oOoo r5 = (com.ninja.engine.LayoutInflater$Factory2C0109o000oOoo) r5
            r5.OoooO = r6
            r2.OooO0OO()
            com.ninja.engine.o0000o r5 = new com.ninja.engine.o0000o
            android.content.Context r6 = r4.getContext()
            android.view.Window r0 = r4.getWindow()
            r5.<init>(r6, r4, r0)
            r4.OooO0o = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.DialogInterfaceC0074o0000oOO.<init>(android.content.Context, int):void");
    }

    public static int OooO(Context context, int i) {
        if (((i >>> 24) & 255) >= 1) {
            return i;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.alertDialogTheme, typedValue, true);
        return typedValue.resourceId;
    }

    public final AbstractC0094o000OooO OooO0o() {
        if (this.OooO0Oo == null) {
            ExecutorC0091o000OoOo executorC0091o000OoOo = AbstractC0094o000OooO.OooO00o;
            this.OooO0Oo = new LayoutInflater$Factory2C0109o000oOoo(getContext(), getWindow(), this, this);
        }
        return this.OooO0Oo;
    }

    public final void OooO0oO() {
        AbstractC1091oOOoOOOO.OooOooo(getWindow().getDecorView(), this);
        AbstractC1137oOOoooO.OooOO0o(getWindow().getDecorView(), this);
        AbstractC1094oOOoOOo0.OooOOoo(getWindow().getDecorView(), this);
    }

    public final void OooO0oo(Bundle bundle) {
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooO0o();
        LayoutInflater from = LayoutInflater.from(layoutInflater$Factory2C0109o000oOoo.OooOO0O);
        if (from.getFactory() == null) {
            from.setFactory2(layoutInflater$Factory2C0109o000oOoo);
        } else {
            boolean z = from.getFactory2() instanceof LayoutInflater$Factory2C0109o000oOoo;
        }
        super.onCreate(bundle);
        OooO0o().OooO0OO();
    }

    public final void OooOO0(CharSequence charSequence) {
        super.setTitle(charSequence);
        OooO0o().OooOO0(charSequence);
    }

    public final boolean OooOO0O(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // com.ninja.engine.DialogC0302o0O0Oo0O, android.app.Dialog
    public final void addContentView(View view, ViewGroup.LayoutParams layoutParams) {
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooO0o();
        layoutInflater$Factory2C0109o000oOoo.OooOo00();
        ((ViewGroup) layoutInflater$Factory2C0109o000oOoo.OooOoOO.findViewById(16908290)).addView(view, layoutParams);
        layoutInflater$Factory2C0109o000oOoo.OooOOO0.OooO00o(layoutInflater$Factory2C0109o000oOoo.OooOO0o.getCallback());
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void dismiss() {
        super.dismiss();
        OooO0o().OooO0Oo();
    }

    @Override // android.app.Dialog, android.view.Window.Callback
    public final boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return AbstractC0809oO0OooOO.OooOoO(this.OooO0o0, getWindow().getDecorView(), this, keyEvent);
    }

    @Override // android.app.Dialog
    public final View findViewById(int i) {
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooO0o();
        layoutInflater$Factory2C0109o000oOoo.OooOo00();
        return layoutInflater$Factory2C0109o000oOoo.OooOO0o.findViewById(i);
    }

    @Override // android.app.Dialog
    public final void invalidateOptionsMenu() {
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooO0o();
        if (layoutInflater$Factory2C0109o000oOoo.OooOOOO != null) {
            layoutInflater$Factory2C0109o000oOoo.OooOoO();
            layoutInflater$Factory2C0109o000oOoo.OooOOOO.getClass();
            layoutInflater$Factory2C0109o000oOoo.OooOoOO(0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:102:0x027a, code lost:
        if (r0 != null) goto L135;
     */
    /* JADX WARN: Code restructure failed: missing block: B:103:0x027c, code lost:
        r0.setVisibility(0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x0270, code lost:
        if (r0 != null) goto L135;
     */
    @Override // com.ninja.engine.DialogC0302o0O0Oo0O, android.app.Dialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onCreate(android.os.Bundle r18) {
        /*
            Method dump skipped, instructions count: 821
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.DialogInterfaceC0074o0000oOO.onCreate(android.os.Bundle):void");
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyDown(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.OooO0o.OooOO0o;
        if (nestedScrollView != null && nestedScrollView.OooO(keyEvent)) {
            return true;
        }
        return super.onKeyDown(i, keyEvent);
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i, KeyEvent keyEvent) {
        NestedScrollView nestedScrollView = this.OooO0o.OooOO0o;
        if (nestedScrollView != null && nestedScrollView.OooO(keyEvent)) {
            return true;
        }
        return super.onKeyUp(i, keyEvent);
    }

    @Override // com.ninja.engine.DialogC0302o0O0Oo0O, android.app.Dialog
    public final void onStop() {
        super.onStop();
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) OooO0o();
        layoutInflater$Factory2C0109o000oOoo.OooOoO();
        C1511oo0OOoo0 c1511oo0OOoo0 = layoutInflater$Factory2C0109o000oOoo.OooOOOO;
        if (c1511oo0OOoo0 != null) {
            c1511oo0OOoo0.Oooo0o = false;
            C1471oo0O0Ooo c1471oo0O0Ooo = c1511oo0OOoo0.Oooo0o0;
            if (c1471oo0O0Ooo != null) {
                c1471oo0O0Ooo.OooO00o();
            }
        }
    }

    @Override // com.ninja.engine.DialogC0302o0O0Oo0O, android.app.Dialog
    public final void setContentView(int i) {
        OooO0oO();
        OooO0o().OooO0oO(i);
    }

    @Override // android.app.Dialog
    public final void setTitle(int i) {
        super.setTitle(i);
        OooO0o().OooOO0(getContext().getString(i));
    }

    @Override // com.ninja.engine.DialogC0302o0O0Oo0O, android.app.Dialog
    public final void setContentView(View view) {
        OooO0oO();
        OooO0o().OooO0oo(view);
    }

    @Override // android.app.Dialog
    public final void setTitle(CharSequence charSequence) {
        OooOO0(charSequence);
        C0068o0000o c0068o0000o = this.OooO0o;
        c0068o0000o.OooO0Oo = charSequence;
        TextView textView = c0068o0000o.OooOOOo;
        if (textView != null) {
            textView.setText(charSequence);
        }
    }

    @Override // com.ninja.engine.DialogC0302o0O0Oo0O, android.app.Dialog
    public final void setContentView(View view, ViewGroup.LayoutParams layoutParams) {
        OooO0oO();
        OooO0o().OooO(view, layoutParams);
    }
}


