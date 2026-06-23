package com.ninja.engine;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
/* renamed from: com.ninja.engine.o0OOoO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class DialogInterface$OnCancelListenerC0390o0OOoO0o extends AbstractComponentCallbacksC0593o0oOoOo0 implements DialogInterface.OnCancelListener, DialogInterface.OnDismissListener {
    public Handler OoooOO0;
    public boolean OooooO0;
    public Dialog OooooOo;
    public boolean Oooooo;
    public boolean Oooooo0;
    public final o00000OO o000oOoO = new o00000OO(7, this);
    public final DialogInterface$OnCancelListenerC0388o0OOoO00 OoooOOO = new DialogInterface$OnCancelListenerC0388o0OOoO00(this);
    public final DialogInterface$OnDismissListenerC0387o0OOoO0 OoooOOo = new DialogInterface$OnDismissListenerC0387o0OOoO0(this);
    public int OoooOo0 = 0;
    public int OoooOoO = 0;
    public boolean OoooOoo = true;
    public boolean Ooooo00 = true;
    public int Ooooo0o = -1;
    public final o00O OooooOO = new o00O(9, this);
    public boolean OoooooO = false;

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final AbstractC0692o0ooooOo OooO0O0() {
        return new C0389o0OOoO0O(this, new C0574o0oOo(this));
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOOoo() {
        this.OooOoo = true;
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOo() {
        this.OooOoo = true;
        if (!this.Oooooo) {
            this.Oooooo = true;
        }
        o00O o00o = this.OooooOO;
        androidx.lifecycle.OooO0O0 oooO0O0 = this.Oooo;
        oooO0O0.getClass();
        androidx.lifecycle.OooO0O0.OooO00o("removeObserver");
        AbstractC0791oO0Oo0O abstractC0791oO0Oo0O = (AbstractC0791oO0Oo0O) oooO0O0.OooO0O0.OooO0O0(o00o);
        if (abstractC0791oO0Oo0O != null) {
            abstractC0791oO0Oo0O.OooO0Oo();
            abstractC0791oO0Oo0O.OooO0OO(false);
        }
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public void OooOo0(Bundle bundle) {
        boolean z;
        super.OooOo0(bundle);
        this.OoooOO0 = new Handler();
        if (this.OooOo0o == 0) {
            z = true;
        } else {
            z = false;
        }
        this.Ooooo00 = z;
        if (bundle != null) {
            this.OoooOo0 = bundle.getInt("android:style", 0);
            this.OoooOoO = bundle.getInt("android:theme", 0);
            this.OoooOoo = bundle.getBoolean("android:cancelable", true);
            this.Ooooo00 = bundle.getBoolean("android:showsDialog", this.Ooooo00);
            this.Ooooo0o = bundle.getInt("android:backStackId", -1);
        }
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOo00(Context context) {
        super.OooOo00(context);
        this.Oooo.OooO0Oo(this.OooooOO);
        this.Oooooo = false;
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOo0o() {
        this.OooOoo = true;
        Dialog dialog = this.OooooOo;
        if (dialog != null) {
            this.Oooooo0 = true;
            dialog.setOnDismissListener(null);
            this.OooooOo.dismiss();
            if (!this.Oooooo) {
                onDismiss(this.OooooOo);
            }
            this.OooooOo = null;
            this.OoooooO = false;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0046 A[Catch: all -> 0x004e, TryCatch #0 {all -> 0x004e, blocks: (B:12:0x001a, B:14:0x0026, B:24:0x003e, B:26:0x0046, B:29:0x0050, B:20:0x0030, B:22:0x0036, B:23:0x003b, B:30:0x0068), top: B:45:0x001a }] */
    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final android.view.LayoutInflater OooOoO0(android.os.Bundle r8) {
        /*
            r7 = this;
            android.view.LayoutInflater r8 = super.OooOoO0(r8)
            boolean r0 = r7.Ooooo00
            java.lang.String r1 = "FragmentManager"
            r2 = 2
            if (r0 == 0) goto L87
            boolean r3 = r7.OooooO0
            if (r3 == 0) goto L11
            goto L87
        L11:
            if (r0 != 0) goto L14
            goto L71
        L14:
            boolean r0 = r7.OoooooO
            if (r0 != 0) goto L71
            r0 = 0
            r3 = 1
            r7.OooooO0 = r3     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.Oooo0oO()     // Catch: java.lang.Throwable -> L4e
            r7.OooooOo = r4     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.Ooooo00     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L68
            int r5 = r7.OoooOo0     // Catch: java.lang.Throwable -> L4e
            if (r5 == r3) goto L3b
            if (r5 == r2) goto L3b
            r6 = 3
            if (r5 == r6) goto L30
            goto L3e
        L30:
            android.view.Window r5 = r4.getWindow()     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L3b
            r6 = 24
            r5.addFlags(r6)     // Catch: java.lang.Throwable -> L4e
        L3b:
            r4.requestWindowFeature(r3)     // Catch: java.lang.Throwable -> L4e
        L3e:
            android.content.Context r4 = r7.OooO()     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r4 instanceof android.app.Activity     // Catch: java.lang.Throwable -> L4e
            if (r5 == 0) goto L50
            android.app.Dialog r5 = r7.OooooOo     // Catch: java.lang.Throwable -> L4e
            android.app.Activity r4 = (android.app.Activity) r4     // Catch: java.lang.Throwable -> L4e
            r5.setOwnerActivity(r4)     // Catch: java.lang.Throwable -> L4e
            goto L50
        L4e:
            r8 = move-exception
            goto L6e
        L50:
            android.app.Dialog r4 = r7.OooooOo     // Catch: java.lang.Throwable -> L4e
            boolean r5 = r7.OoooOoo     // Catch: java.lang.Throwable -> L4e
            r4.setCancelable(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.OooooOo     // Catch: java.lang.Throwable -> L4e
            com.ninja.engine.o0OOoO00 r5 = r7.OoooOOO     // Catch: java.lang.Throwable -> L4e
            r4.setOnCancelListener(r5)     // Catch: java.lang.Throwable -> L4e
            android.app.Dialog r4 = r7.OooooOo     // Catch: java.lang.Throwable -> L4e
            com.ninja.engine.o0OOoO0 r5 = r7.OoooOOo     // Catch: java.lang.Throwable -> L4e
            r4.setOnDismissListener(r5)     // Catch: java.lang.Throwable -> L4e
            r7.OoooooO = r3     // Catch: java.lang.Throwable -> L4e
            goto L6b
        L68:
            r3 = 0
            r7.OooooOo = r3     // Catch: java.lang.Throwable -> L4e
        L6b:
            r7.OooooO0 = r0
            goto L71
        L6e:
            r7.OooooO0 = r0
            throw r8
        L71:
            boolean r0 = android.util.Log.isLoggable(r1, r2)
            if (r0 == 0) goto L7a
            r7.toString()
        L7a:
            android.app.Dialog r0 = r7.OooooOo
            if (r0 == 0) goto L86
            android.content.Context r0 = r0.getContext()
            android.view.LayoutInflater r8 = r8.cloneInContext(r0)
        L86:
            return r8
        L87:
            boolean r0 = android.util.Log.isLoggable(r1, r2)
            if (r0 == 0) goto L90
            r7.toString()
        L90:
            return r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.DialogInterface$OnCancelListenerC0390o0OOoO0o.OooOoO0(android.os.Bundle):android.view.LayoutInflater");
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public void OooOoOO(Bundle bundle) {
        Dialog dialog = this.OooooOo;
        if (dialog != null) {
            Bundle onSaveInstanceState = dialog.onSaveInstanceState();
            onSaveInstanceState.putBoolean("android:dialogShowing", false);
            bundle.putBundle("android:savedDialogState", onSaveInstanceState);
        }
        int i = this.OoooOo0;
        if (i != 0) {
            bundle.putInt("android:style", i);
        }
        int i2 = this.OoooOoO;
        if (i2 != 0) {
            bundle.putInt("android:theme", i2);
        }
        boolean z = this.OoooOoo;
        if (!z) {
            bundle.putBoolean("android:cancelable", z);
        }
        boolean z2 = this.Ooooo00;
        if (!z2) {
            bundle.putBoolean("android:showsDialog", z2);
        }
        int i3 = this.Ooooo0o;
        if (i3 != -1) {
            bundle.putInt("android:backStackId", i3);
        }
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public void OooOoo() {
        this.OooOoo = true;
        Dialog dialog = this.OooooOo;
        if (dialog != null) {
            dialog.hide();
        }
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public void OooOoo0() {
        this.OooOoo = true;
        Dialog dialog = this.OooooOo;
        if (dialog != null) {
            this.Oooooo0 = false;
            dialog.show();
            View decorView = this.OooooOo.getWindow().getDecorView();
            AbstractC1091oOOoOOOO.OooOooo(decorView, this);
            decorView.setTag(R.id.view_tree_view_model_store_owner, this);
            AbstractC1137oOOoooO.OooOO0o(decorView, this);
        }
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOooO(Bundle bundle) {
        Bundle bundle2;
        this.OooOoo = true;
        if (this.OooooOo != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.OooooOo.onRestoreInstanceState(bundle2);
        }
    }

    @Override // com.ninja.engine.AbstractComponentCallbacksC0593o0oOoOo0
    public final void OooOooo(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Bundle bundle2;
        super.OooOooo(layoutInflater, viewGroup, bundle);
        if (this.OooOooo == null && this.OooooOo != null && bundle != null && (bundle2 = bundle.getBundle("android:savedDialogState")) != null) {
            this.OooooOo.onRestoreInstanceState(bundle2);
        }
    }

    public final void Oooo0o(boolean z, boolean z2) {
        if (this.Oooooo) {
            return;
        }
        this.Oooooo = true;
        Dialog dialog = this.OooooOo;
        if (dialog != null) {
            dialog.setOnDismissListener(null);
            this.OooooOo.dismiss();
            if (!z2) {
                if (Looper.myLooper() == this.OoooOO0.getLooper()) {
                    onDismiss(this.OooooOo);
                } else {
                    this.OoooOO0.post(this.o000oOoO);
                }
            }
        }
        this.Oooooo0 = true;
        if (this.Ooooo0o >= 0) {
            C0606o0oOoooO OooOO0O = OooOO0O();
            int i = this.Ooooo0o;
            if (i >= 0) {
                OooOO0O.OooOo0O(new C0604o0oOooo(OooOO0O, i), z);
                this.Ooooo0o = -1;
                return;
            }
            throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "Bad id: "));
        }
        C0172o00OoOo c0172o00OoOo = new C0172o00OoOo(OooOO0O());
        c0172o00OoOo.OooOOOO = true;
        C0606o0oOoooO c0606o0oOoooO = this.OooOOo;
        if (c0606o0oOoooO != null && c0606o0oOoooO != c0172o00OoOo.OooOOOo) {
            throw new IllegalStateException("Cannot remove Fragment attached to a different FragmentManager. Fragment " + toString() + " is already attached to a FragmentManager.");
        }
        c0172o00OoOo.OooO0O0(new C0614o0oo00o(3, this));
        if (z) {
            c0172o00OoOo.OooO0Oo(true);
        } else {
            c0172o00OoOo.OooO0Oo(false);
        }
    }

    public Dialog Oooo0oO() {
        if (Log.isLoggable("FragmentManager", 3)) {
            toString();
        }
        return new DialogC0302o0O0Oo0O(Oooo00O(), this.OoooOoO);
    }

    @Override // android.content.DialogInterface.OnDismissListener
    public void onDismiss(DialogInterface dialogInterface) {
        if (!this.Oooooo0) {
            if (Log.isLoggable("FragmentManager", 3)) {
                toString();
            }
            Oooo0o(true, true);
        }
    }

    @Override // android.content.DialogInterface.OnCancelListener
    public void onCancel(DialogInterface dialogInterface) {
    }
}


