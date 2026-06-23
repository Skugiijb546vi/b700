package com.ninja.engine;

import android.content.Context;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.MenuItem;
/* loaded from: classes.dex */
public final class oOO0O00O implements InterfaceC1165oOo00o00 {
    public AbstractC2087ooooOoOO OooO00o;
    public boolean OooO0O0;
    public int OooO0OO;

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO(boolean z) {
        boolean z2;
        o00OOOO0 o00oooo0;
        if (this.OooO0O0) {
            return;
        }
        if (z) {
            this.OooO00o.OooO0O0();
            return;
        }
        AbstractC2087ooooOoOO abstractC2087ooooOoOO = this.OooO00o;
        MenuC0887oO0oo0oo menuC0887oO0oo0oo = abstractC2087ooooOoOO.OooOooo;
        if (menuC0887oO0oo0oo != null && abstractC2087ooooOoOO.OooO0o != null) {
            int size = menuC0887oO0oo0oo.OooO0o.size();
            if (size != abstractC2087ooooOoOO.OooO0o.length) {
                abstractC2087ooooOoOO.OooO0O0();
                return;
            }
            int i = abstractC2087ooooOoOO.OooO0oO;
            for (int i2 = 0; i2 < size; i2++) {
                MenuItem item = abstractC2087ooooOoOO.OooOooo.getItem(i2);
                if (item.isChecked()) {
                    abstractC2087ooooOoOO.OooO0oO = item.getItemId();
                    abstractC2087ooooOoOO.OooO0oo = i2;
                }
            }
            if (i != abstractC2087ooooOoOO.OooO0oO && (o00oooo0 = abstractC2087ooooOoOO.OooO00o) != null) {
                AbstractC1349oo000.OooO00o(abstractC2087ooooOoOO, o00oooo0);
            }
            int i3 = abstractC2087ooooOoOO.OooO0o0;
            int size2 = abstractC2087ooooOoOO.OooOooo.OooOO0o().size();
            if (i3 != -1 ? i3 == 0 : size2 > 3) {
                z2 = true;
            } else {
                z2 = false;
            }
            for (int i4 = 0; i4 < size; i4++) {
                abstractC2087ooooOoOO.OooOooO.OooO0O0 = true;
                abstractC2087ooooOoOO.OooO0o[i4].setLabelVisibilityMode(abstractC2087ooooOoOO.OooO0o0);
                abstractC2087ooooOoOO.OooO0o[i4].setShifting(z2);
                abstractC2087ooooOoOO.OooO0o[i4].OooO0O0((C0892oO0ooO0o) abstractC2087ooooOoOO.OooOooo.getItem(i4));
                abstractC2087ooooOoOO.OooOooO.OooO0O0 = false;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooO0OO(SubMenuC1265oOoo0O subMenuC1265oOoo0O) {
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0o(Parcelable parcelable) {
        SparseArray sparseArray;
        C0177o00Ooo0 c0177o00Ooo0;
        if (parcelable instanceof oOO0O000) {
            AbstractC2087ooooOoOO abstractC2087ooooOoOO = this.OooO00o;
            oOO0O000 ooo0o000 = (oOO0O000) parcelable;
            int i = ooo0o000.OooO00o;
            int size = abstractC2087ooooOoOO.OooOooo.OooO0o.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                MenuItem item = abstractC2087ooooOoOO.OooOooo.getItem(i2);
                if (i == item.getItemId()) {
                    abstractC2087ooooOoOO.OooO0oO = i;
                    abstractC2087ooooOoOO.OooO0oo = i2;
                    item.setChecked(true);
                    break;
                }
                i2++;
            }
            Context context = this.OooO00o.getContext();
            C0991oOOO0ooo c0991oOOO0ooo = ooo0o000.OooO0O0;
            SparseArray sparseArray2 = new SparseArray(c0991oOOO0ooo.size());
            for (int i3 = 0; i3 < c0991oOOO0ooo.size(); i3++) {
                int keyAt = c0991oOOO0ooo.keyAt(i3);
                C0179o00Ooo0O c0179o00Ooo0O = (C0179o00Ooo0O) c0991oOOO0ooo.valueAt(i3);
                if (c0179o00Ooo0O != null) {
                    c0177o00Ooo0 = new C0177o00Ooo0(context, c0179o00Ooo0O);
                } else {
                    c0177o00Ooo0 = null;
                }
                sparseArray2.put(keyAt, c0177o00Ooo0);
            }
            AbstractC2087ooooOoOO abstractC2087ooooOoOO2 = this.OooO00o;
            abstractC2087ooooOoOO2.getClass();
            int i4 = 0;
            while (true) {
                int size2 = sparseArray2.size();
                sparseArray = abstractC2087ooooOoOO2.OooOOoo;
                if (i4 >= size2) {
                    break;
                }
                int keyAt2 = sparseArray2.keyAt(i4);
                if (sparseArray.indexOfKey(keyAt2) < 0) {
                    sparseArray.append(keyAt2, (C0177o00Ooo0) sparseArray2.get(keyAt2));
                }
                i4++;
            }
            AbstractC0921oOO00ooO[] abstractC0921oOO00ooOArr = abstractC2087ooooOoOO2.OooO0o;
            if (abstractC0921oOO00ooOArr != null) {
                for (AbstractC0921oOO00ooO abstractC0921oOO00ooO : abstractC0921oOO00ooOArr) {
                    C0177o00Ooo0 c0177o00Ooo02 = (C0177o00Ooo0) sparseArray.get(abstractC0921oOO00ooO.getId());
                    if (c0177o00Ooo02 != null) {
                        abstractC0921oOO00ooO.setBadge(c0177o00Ooo02);
                    }
                }
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0o0(Context context, MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        this.OooO00o.OooOooo = menuC0887oO0oo0oo;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooO0oo(C0892oO0ooO0o c0892oO0ooO0o) {
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final int OooOO0() {
        return this.OooO0OO;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooOO0O() {
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.oOO0O000, android.os.Parcelable, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r2v0, types: [android.util.SparseArray, com.ninja.engine.oOOO0ooo] */
    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final Parcelable OooOO0o() {
        C0179o00Ooo0O c0179o00Ooo0O;
        Object obj = new Object();
        obj.OooO00o = this.OooO00o.getSelectedItemId();
        SparseArray<C0177o00Ooo0> badgeDrawables = this.OooO00o.getBadgeDrawables();
        SparseArray sparseArray = new SparseArray();
        for (int i = 0; i < badgeDrawables.size(); i++) {
            int keyAt = badgeDrawables.keyAt(i);
            C0177o00Ooo0 valueAt = badgeDrawables.valueAt(i);
            if (valueAt != null) {
                c0179o00Ooo0O = valueAt.OooO0o0.OooO00o;
            } else {
                c0179o00Ooo0O = null;
            }
            sparseArray.put(keyAt, c0179o00Ooo0O);
        }
        obj.OooO0O0 = sparseArray;
        return obj;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final boolean OooOOO(C0892oO0ooO0o c0892oO0ooO0o) {
        return false;
    }

    @Override // com.ninja.engine.InterfaceC1165oOo00o00
    public final void OooO0O0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, boolean z) {
    }
}



