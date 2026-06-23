package com.ninja.engine;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.SparseArray;
import android.view.KeyCharacterMap;
import android.view.KeyEvent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.SubMenu;
import android.view.View;
import android.view.ViewConfiguration;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.ninja.engine.oO0oo0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class MenuC0887oO0oo0oo implements Menu {
    public static final int[] OooOoO0 = {1, 4, 5, 3, 2, 0};
    public final ArrayList OooO;
    public final Context OooO00o;
    public final Resources OooO0O0;
    public boolean OooO0OO;
    public final boolean OooO0Oo;
    public final ArrayList OooO0o;
    public InterfaceC0886oO0oo0o0 OooO0o0;
    public final ArrayList OooO0oO;
    public boolean OooO0oo;
    public final ArrayList OooOO0;
    public boolean OooOO0O;
    public Drawable OooOOO;
    public CharSequence OooOOO0;
    public View OooOOOO;
    public boolean OooOo;
    public C0892oO0ooO0o OooOo0O;
    public int OooOO0o = 0;
    public boolean OooOOOo = false;
    public boolean OooOOo0 = false;
    public boolean OooOOo = false;
    public boolean OooOOoo = false;
    public final ArrayList OooOo00 = new ArrayList();
    public final CopyOnWriteArrayList OooOo0 = new CopyOnWriteArrayList();
    public boolean OooOo0o = false;

    public MenuC0887oO0oo0oo(Context context) {
        boolean z;
        boolean z2 = false;
        this.OooO00o = context;
        Resources resources = context.getResources();
        this.OooO0O0 = resources;
        this.OooO0o = new ArrayList();
        this.OooO0oO = new ArrayList();
        this.OooO0oo = true;
        this.OooO = new ArrayList();
        this.OooOO0 = new ArrayList();
        this.OooOO0O = true;
        if (resources.getConfiguration().keyboard != 1) {
            ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
            Method method = AbstractC1447oo0O0.OooO00o;
            if (Build.VERSION.SDK_INT >= 28) {
                z = AbstractC0408o0Oo00o.OooOO0(viewConfiguration);
            } else {
                Resources resources2 = context.getResources();
                int identifier = resources2.getIdentifier("config_showMenuShortcutsWhenKeyboardPresent", "bool", "android");
                if (identifier != 0 && resources2.getBoolean(identifier)) {
                    z = true;
                } else {
                    z = false;
                }
            }
            if (z) {
                z2 = true;
            }
        }
        this.OooO0Oo = z2;
    }

    public final void OooO() {
        ArrayList OooOO0o = OooOO0o();
        if (!this.OooOO0O) {
            return;
        }
        CopyOnWriteArrayList copyOnWriteArrayList = this.OooOo0;
        Iterator it = copyOnWriteArrayList.iterator();
        boolean z = false;
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1165oOo00o00 interfaceC1165oOo00o00 = (InterfaceC1165oOo00o00) weakReference.get();
            if (interfaceC1165oOo00o00 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z |= interfaceC1165oOo00o00.OooOO0O();
            }
        }
        ArrayList arrayList = this.OooO;
        ArrayList arrayList2 = this.OooOO0;
        arrayList.clear();
        arrayList2.clear();
        if (z) {
            int size = OooOO0o.size();
            for (int i = 0; i < size; i++) {
                C0892oO0ooO0o c0892oO0ooO0o = (C0892oO0ooO0o) OooOO0o.get(i);
                if (c0892oO0ooO0o.OooO0o()) {
                    arrayList.add(c0892oO0ooO0o);
                } else {
                    arrayList2.add(c0892oO0ooO0o);
                }
            }
        } else {
            arrayList2.addAll(OooOO0o());
        }
        this.OooOO0O = false;
    }

    public C0892oO0ooO0o OooO00o(int i, int i2, int i3, CharSequence charSequence) {
        int i4;
        int i5 = ((-65536) & i3) >> 16;
        if (i5 >= 0 && i5 < 6) {
            int i6 = (OooOoO0[i5] << 16) | (65535 & i3);
            C0892oO0ooO0o c0892oO0ooO0o = new C0892oO0ooO0o(this, i, i2, i3, i6, charSequence, this.OooOO0o);
            ArrayList arrayList = this.OooO0o;
            int size = arrayList.size() - 1;
            while (true) {
                if (size >= 0) {
                    if (((C0892oO0ooO0o) arrayList.get(size)).OooO0Oo <= i6) {
                        i4 = size + 1;
                        break;
                    }
                    size--;
                } else {
                    i4 = 0;
                    break;
                }
            }
            arrayList.add(i4, c0892oO0ooO0o);
            OooOOOo(true);
            return c0892oO0ooO0o;
        }
        throw new IllegalArgumentException("order does not contain a valid category.");
    }

    public final void OooO0O0(InterfaceC1165oOo00o00 interfaceC1165oOo00o00, Context context) {
        this.OooOo0.add(new WeakReference(interfaceC1165oOo00o00));
        interfaceC1165oOo00o00.OooO0o0(context, this);
        this.OooOO0O = true;
    }

    public final void OooO0OO(boolean z) {
        if (this.OooOOoo) {
            return;
        }
        this.OooOOoo = true;
        CopyOnWriteArrayList copyOnWriteArrayList = this.OooOo0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1165oOo00o00 interfaceC1165oOo00o00 = (InterfaceC1165oOo00o00) weakReference.get();
            if (interfaceC1165oOo00o00 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                interfaceC1165oOo00o00.OooO0O0(this, z);
            }
        }
        this.OooOOoo = false;
    }

    public boolean OooO0Oo(C0892oO0ooO0o c0892oO0ooO0o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.OooOo0;
        boolean z = false;
        if (!copyOnWriteArrayList.isEmpty() && this.OooOo0O == c0892oO0ooO0o) {
            OooOo0o();
            Iterator it = copyOnWriteArrayList.iterator();
            while (it.hasNext()) {
                WeakReference weakReference = (WeakReference) it.next();
                InterfaceC1165oOo00o00 interfaceC1165oOo00o00 = (InterfaceC1165oOo00o00) weakReference.get();
                if (interfaceC1165oOo00o00 == null) {
                    copyOnWriteArrayList.remove(weakReference);
                } else {
                    z = interfaceC1165oOo00o00.OooOOO(c0892oO0ooO0o);
                    if (z) {
                        break;
                    }
                }
            }
            OooOo0O();
            if (z) {
                this.OooOo0O = null;
            }
        }
        return z;
    }

    public boolean OooO0o(C0892oO0ooO0o c0892oO0ooO0o) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.OooOo0;
        boolean z = false;
        if (copyOnWriteArrayList.isEmpty()) {
            return false;
        }
        OooOo0o();
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1165oOo00o00 interfaceC1165oOo00o00 = (InterfaceC1165oOo00o00) weakReference.get();
            if (interfaceC1165oOo00o00 == null) {
                copyOnWriteArrayList.remove(weakReference);
            } else {
                z = interfaceC1165oOo00o00.OooO0oo(c0892oO0ooO0o);
                if (z) {
                    break;
                }
            }
        }
        OooOo0O();
        if (z) {
            this.OooOo0O = c0892oO0ooO0o;
        }
        return z;
    }

    public boolean OooO0o0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, MenuItem menuItem) {
        InterfaceC0886oO0oo0o0 interfaceC0886oO0oo0o0 = this.OooO0o0;
        if (interfaceC0886oO0oo0o0 != null && interfaceC0886oO0oo0o0.OooOo0(menuC0887oO0oo0oo, menuItem)) {
            return true;
        }
        return false;
    }

    public final C0892oO0ooO0o OooO0oO(int i, KeyEvent keyEvent) {
        char c;
        ArrayList arrayList = this.OooOo00;
        arrayList.clear();
        OooO0oo(arrayList, i, keyEvent);
        if (arrayList.isEmpty()) {
            return null;
        }
        int metaState = keyEvent.getMetaState();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        keyEvent.getKeyData(keyData);
        int size = arrayList.size();
        if (size == 1) {
            return (C0892oO0ooO0o) arrayList.get(0);
        }
        boolean OooOOO = OooOOO();
        for (int i2 = 0; i2 < size; i2++) {
            C0892oO0ooO0o c0892oO0ooO0o = (C0892oO0ooO0o) arrayList.get(i2);
            if (OooOOO) {
                c = c0892oO0ooO0o.OooOO0;
            } else {
                c = c0892oO0ooO0o.OooO0oo;
            }
            char[] cArr = keyData.meta;
            if ((c == cArr[0] && (metaState & 2) == 0) || ((c == cArr[2] && (metaState & 2) != 0) || (OooOOO && c == '\b' && i == 67))) {
                return c0892oO0ooO0o;
            }
        }
        return null;
    }

    public final void OooO0oo(ArrayList arrayList, int i, KeyEvent keyEvent) {
        char c;
        int i2;
        boolean OooOOO = OooOOO();
        int modifiers = keyEvent.getModifiers();
        KeyCharacterMap.KeyData keyData = new KeyCharacterMap.KeyData();
        if (!keyEvent.getKeyData(keyData) && i != 67) {
            return;
        }
        ArrayList arrayList2 = this.OooO0o;
        int size = arrayList2.size();
        for (int i3 = 0; i3 < size; i3++) {
            C0892oO0ooO0o c0892oO0ooO0o = (C0892oO0ooO0o) arrayList2.get(i3);
            if (c0892oO0ooO0o.hasSubMenu()) {
                c0892oO0ooO0o.OooOOOO.OooO0oo(arrayList, i, keyEvent);
            }
            if (OooOOO) {
                c = c0892oO0ooO0o.OooOO0;
            } else {
                c = c0892oO0ooO0o.OooO0oo;
            }
            if (OooOOO) {
                i2 = c0892oO0ooO0o.OooOO0O;
            } else {
                i2 = c0892oO0ooO0o.OooO;
            }
            if ((modifiers & 69647) == (i2 & 69647) && c != 0) {
                char[] cArr = keyData.meta;
                if (c != cArr[0] && c != cArr[2]) {
                    if (OooOOO && c == '\b') {
                        if (i != 67) {
                        }
                    }
                }
                if (c0892oO0ooO0o.isEnabled()) {
                    arrayList.add(c0892oO0ooO0o);
                }
            }
        }
    }

    public String OooOO0() {
        return "android:menu:actionviewstates";
    }

    public final ArrayList OooOO0o() {
        boolean z = this.OooO0oo;
        ArrayList arrayList = this.OooO0oO;
        if (!z) {
            return arrayList;
        }
        arrayList.clear();
        ArrayList arrayList2 = this.OooO0o;
        int size = arrayList2.size();
        for (int i = 0; i < size; i++) {
            C0892oO0ooO0o c0892oO0ooO0o = (C0892oO0ooO0o) arrayList2.get(i);
            if (c0892oO0ooO0o.isVisible()) {
                arrayList.add(c0892oO0ooO0o);
            }
        }
        this.OooO0oo = false;
        this.OooOO0O = true;
        return arrayList;
    }

    public boolean OooOOO() {
        return this.OooO0OO;
    }

    public boolean OooOOO0() {
        return this.OooOo0o;
    }

    public boolean OooOOOO() {
        return this.OooO0Oo;
    }

    public final void OooOOOo(boolean z) {
        if (!this.OooOOOo) {
            if (z) {
                this.OooO0oo = true;
                this.OooOO0O = true;
            }
            CopyOnWriteArrayList copyOnWriteArrayList = this.OooOo0;
            if (!copyOnWriteArrayList.isEmpty()) {
                OooOo0o();
                Iterator it = copyOnWriteArrayList.iterator();
                while (it.hasNext()) {
                    WeakReference weakReference = (WeakReference) it.next();
                    InterfaceC1165oOo00o00 interfaceC1165oOo00o00 = (InterfaceC1165oOo00o00) weakReference.get();
                    if (interfaceC1165oOo00o00 == null) {
                        copyOnWriteArrayList.remove(weakReference);
                    } else {
                        interfaceC1165oOo00o00.OooO(z);
                    }
                }
                OooOo0O();
                return;
            }
            return;
        }
        this.OooOOo0 = true;
        if (z) {
            this.OooOOo = true;
        }
    }

    public final void OooOOo(InterfaceC1165oOo00o00 interfaceC1165oOo00o00) {
        CopyOnWriteArrayList copyOnWriteArrayList = this.OooOo0;
        Iterator it = copyOnWriteArrayList.iterator();
        while (it.hasNext()) {
            WeakReference weakReference = (WeakReference) it.next();
            InterfaceC1165oOo00o00 interfaceC1165oOo00o002 = (InterfaceC1165oOo00o00) weakReference.get();
            if (interfaceC1165oOo00o002 == null || interfaceC1165oOo00o002 == interfaceC1165oOo00o00) {
                copyOnWriteArrayList.remove(weakReference);
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0056, code lost:
        if (r1 != false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0058, code lost:
        OooO0OO(true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x0068, code lost:
        if ((r9 & 1) == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00c7, code lost:
        if (r1 == false) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x00ca, code lost:
        return r1;
     */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x005d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOOo0(android.view.MenuItem r7, com.ninja.engine.InterfaceC1165oOo00o00 r8, int r9) {
        /*
            r6 = this;
            com.ninja.engine.oO0ooO0o r7 = (com.ninja.engine.C0892oO0ooO0o) r7
            r0 = 0
            if (r7 == 0) goto Lcb
            boolean r1 = r7.isEnabled()
            if (r1 != 0) goto Ld
            goto Lcb
        Ld:
            android.view.MenuItem$OnMenuItemClickListener r1 = r7.OooOOOo
            r2 = 1
            if (r1 == 0) goto L1a
            boolean r1 = r1.onMenuItemClick(r7)
            if (r1 == 0) goto L1a
        L18:
            r1 = 1
            goto L3c
        L1a:
            com.ninja.engine.oO0oo0oo r1 = r7.OooOOO
            boolean r3 = r1.OooO0o0(r1, r7)
            if (r3 == 0) goto L23
            goto L18
        L23:
            android.content.Intent r3 = r7.OooO0oO
            if (r3 == 0) goto L2e
            android.content.Context r1 = r1.OooO00o     // Catch: android.content.ActivityNotFoundException -> L2d
            r1.startActivity(r3)     // Catch: android.content.ActivityNotFoundException -> L2d
            goto L18
        L2d:
        L2e:
            com.ninja.engine.oO0ooO r1 = r7.OooOoOO
            if (r1 == 0) goto L3b
            android.view.ActionProvider r1 = r1.OooO0O0
            boolean r1 = r1.onPerformDefaultAction()
            if (r1 == 0) goto L3b
            goto L18
        L3b:
            r1 = 0
        L3c:
            com.ninja.engine.oO0ooO r3 = r7.OooOoOO
            if (r3 == 0) goto L4a
            android.view.ActionProvider r4 = r3.OooO0O0
            boolean r4 = r4.hasSubMenu()
            if (r4 == 0) goto L4a
            r4 = 1
            goto L4b
        L4a:
            r4 = 0
        L4b:
            boolean r5 = r7.OooO0o0()
            if (r5 == 0) goto L5d
            boolean r7 = r7.expandActionView()
            r1 = r1 | r7
            if (r1 == 0) goto Lca
        L58:
            r6.OooO0OO(r2)
            goto Lca
        L5d:
            boolean r5 = r7.hasSubMenu()
            if (r5 != 0) goto L6b
            if (r4 == 0) goto L66
            goto L6b
        L66:
            r7 = r9 & 1
            if (r7 != 0) goto Lca
            goto L58
        L6b:
            r9 = r9 & 4
            if (r9 != 0) goto L72
            r6.OooO0OO(r0)
        L72:
            boolean r9 = r7.hasSubMenu()
            if (r9 != 0) goto L86
            com.ninja.engine.oOoo0O r9 = new com.ninja.engine.oOoo0O
            android.content.Context r5 = r6.OooO00o
            r9.<init>(r5, r6, r7)
            r7.OooOOOO = r9
            java.lang.CharSequence r5 = r7.OooO0o0
            r9.setHeaderTitle(r5)
        L86:
            com.ninja.engine.oOoo0O r7 = r7.OooOOOO
            if (r4 == 0) goto L94
            com.ninja.engine.oOo00o0O r9 = r3.OooO0OO
            r9.getClass()
            android.view.ActionProvider r9 = r3.OooO0O0
            r9.onPrepareSubMenu(r7)
        L94:
            java.util.concurrent.CopyOnWriteArrayList r9 = r6.OooOo0
            boolean r3 = r9.isEmpty()
            if (r3 == 0) goto L9d
            goto Lc6
        L9d:
            if (r8 == 0) goto La3
            boolean r0 = r8.OooO0OO(r7)
        La3:
            java.util.Iterator r8 = r9.iterator()
        La7:
            boolean r3 = r8.hasNext()
            if (r3 == 0) goto Lc6
            java.lang.Object r3 = r8.next()
            java.lang.ref.WeakReference r3 = (java.lang.ref.WeakReference) r3
            java.lang.Object r4 = r3.get()
            com.ninja.engine.oOo00o00 r4 = (com.ninja.engine.InterfaceC1165oOo00o00) r4
            if (r4 != 0) goto Lbf
            r9.remove(r3)
            goto La7
        Lbf:
            if (r0 != 0) goto La7
            boolean r0 = r4.OooO0OO(r7)
            goto La7
        Lc6:
            r1 = r1 | r0
            if (r1 != 0) goto Lca
            goto L58
        Lca:
            return r1
        Lcb:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.MenuC0887oO0oo0oo.OooOOo0(android.view.MenuItem, com.ninja.engine.oOo00o00, int):boolean");
    }

    public final void OooOOoo(Bundle bundle) {
        MenuItem findItem;
        if (bundle == null) {
            return;
        }
        SparseArray<Parcelable> sparseParcelableArray = bundle.getSparseParcelableArray(OooOO0());
        int size = this.OooO0o.size();
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                actionView.restoreHierarchyState(sparseParcelableArray);
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1265oOoo0O) item.getSubMenu()).OooOOoo(bundle);
            }
        }
        int i2 = bundle.getInt("android:menu:expandedactionview");
        if (i2 > 0 && (findItem = findItem(i2)) != null) {
            findItem.expandActionView();
        }
    }

    public final void OooOo0(int i, CharSequence charSequence, int i2, Drawable drawable, View view) {
        if (view != null) {
            this.OooOOOO = view;
            this.OooOOO0 = null;
            this.OooOOO = null;
        } else {
            if (i > 0) {
                this.OooOOO0 = this.OooO0O0.getText(i);
            } else if (charSequence != null) {
                this.OooOOO0 = charSequence;
            }
            if (i2 > 0) {
                this.OooOOO = this.OooO00o.getDrawable(i2);
            } else if (drawable != null) {
                this.OooOOO = drawable;
            }
            this.OooOOOO = null;
        }
        OooOOOo(false);
    }

    public final void OooOo00(Bundle bundle) {
        int size = this.OooO0o.size();
        SparseArray<? extends Parcelable> sparseArray = null;
        for (int i = 0; i < size; i++) {
            MenuItem item = getItem(i);
            View actionView = item.getActionView();
            if (actionView != null && actionView.getId() != -1) {
                if (sparseArray == null) {
                    sparseArray = new SparseArray<>();
                }
                actionView.saveHierarchyState(sparseArray);
                if (item.isActionViewExpanded()) {
                    bundle.putInt("android:menu:expandedactionview", item.getItemId());
                }
            }
            if (item.hasSubMenu()) {
                ((SubMenuC1265oOoo0O) item.getSubMenu()).OooOo00(bundle);
            }
        }
        if (sparseArray != null) {
            bundle.putSparseParcelableArray(OooOO0(), sparseArray);
        }
    }

    public final void OooOo0O() {
        this.OooOOOo = false;
        if (this.OooOOo0) {
            this.OooOOo0 = false;
            OooOOOo(this.OooOOo);
        }
    }

    public final void OooOo0o() {
        if (!this.OooOOOo) {
            this.OooOOOo = true;
            this.OooOOo0 = false;
            this.OooOOo = false;
        }
    }

    @Override // android.view.Menu
    public final MenuItem add(int i) {
        return OooO00o(0, 0, 0, this.OooO0O0.getString(i));
    }

    @Override // android.view.Menu
    public final int addIntentOptions(int i, int i2, int i3, ComponentName componentName, Intent[] intentArr, Intent intent, int i4, MenuItem[] menuItemArr) {
        int i5;
        Intent intent2;
        int i6;
        PackageManager packageManager = this.OooO00o.getPackageManager();
        List<ResolveInfo> queryIntentActivityOptions = packageManager.queryIntentActivityOptions(componentName, intentArr, intent, 0);
        if (queryIntentActivityOptions != null) {
            i5 = queryIntentActivityOptions.size();
        } else {
            i5 = 0;
        }
        if ((i4 & 1) == 0) {
            removeGroup(i);
        }
        for (int i7 = 0; i7 < i5; i7++) {
            ResolveInfo resolveInfo = queryIntentActivityOptions.get(i7);
            int i8 = resolveInfo.specificIndex;
            if (i8 < 0) {
                intent2 = intent;
            } else {
                intent2 = intentArr[i8];
            }
            Intent intent3 = new Intent(intent2);
            ActivityInfo activityInfo = resolveInfo.activityInfo;
            intent3.setComponent(new ComponentName(activityInfo.applicationInfo.packageName, activityInfo.name));
            C0892oO0ooO0o OooO00o = OooO00o(i, i2, i3, resolveInfo.loadLabel(packageManager));
            OooO00o.setIcon(resolveInfo.loadIcon(packageManager));
            OooO00o.OooO0oO = intent3;
            if (menuItemArr != null && (i6 = resolveInfo.specificIndex) >= 0) {
                menuItemArr[i6] = OooO00o;
            }
        }
        return i5;
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i) {
        return addSubMenu(0, 0, 0, this.OooO0O0.getString(i));
    }

    @Override // android.view.Menu
    public final void clear() {
        C0892oO0ooO0o c0892oO0ooO0o = this.OooOo0O;
        if (c0892oO0ooO0o != null) {
            OooO0Oo(c0892oO0ooO0o);
        }
        this.OooO0o.clear();
        OooOOOo(true);
    }

    public final void clearHeader() {
        this.OooOOO = null;
        this.OooOOO0 = null;
        this.OooOOOO = null;
        OooOOOo(false);
    }

    @Override // android.view.Menu
    public final void close() {
        OooO0OO(true);
    }

    @Override // android.view.Menu
    public final MenuItem findItem(int i) {
        MenuItem findItem;
        ArrayList arrayList = this.OooO0o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0892oO0ooO0o c0892oO0ooO0o = (C0892oO0ooO0o) arrayList.get(i2);
            if (c0892oO0ooO0o.OooO00o == i) {
                return c0892oO0ooO0o;
            }
            if (c0892oO0ooO0o.hasSubMenu() && (findItem = c0892oO0ooO0o.OooOOOO.findItem(i)) != null) {
                return findItem;
            }
        }
        return null;
    }

    @Override // android.view.Menu
    public final MenuItem getItem(int i) {
        return (MenuItem) this.OooO0o.get(i);
    }

    @Override // android.view.Menu
    public final boolean hasVisibleItems() {
        if (this.OooOo) {
            return true;
        }
        ArrayList arrayList = this.OooO0o;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            if (((C0892oO0ooO0o) arrayList.get(i)).isVisible()) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean isShortcutKey(int i, KeyEvent keyEvent) {
        if (OooO0oO(i, keyEvent) != null) {
            return true;
        }
        return false;
    }

    @Override // android.view.Menu
    public final boolean performIdentifierAction(int i, int i2) {
        return OooOOo0(findItem(i), null, i2);
    }

    @Override // android.view.Menu
    public final boolean performShortcut(int i, KeyEvent keyEvent, int i2) {
        boolean z;
        C0892oO0ooO0o OooO0oO = OooO0oO(i, keyEvent);
        if (OooO0oO != null) {
            z = OooOOo0(OooO0oO, null, i2);
        } else {
            z = false;
        }
        if ((i2 & 2) != 0) {
            OooO0OO(true);
        }
        return z;
    }

    @Override // android.view.Menu
    public final void removeGroup(int i) {
        ArrayList arrayList = this.OooO0o;
        int size = arrayList.size();
        int i2 = 0;
        int i3 = 0;
        while (true) {
            if (i3 < size) {
                if (((C0892oO0ooO0o) arrayList.get(i3)).OooO0O0 == i) {
                    break;
                }
                i3++;
            } else {
                i3 = -1;
                break;
            }
        }
        if (i3 >= 0) {
            int size2 = arrayList.size() - i3;
            while (true) {
                int i4 = i2 + 1;
                if (i2 >= size2 || ((C0892oO0ooO0o) arrayList.get(i3)).OooO0O0 != i) {
                    break;
                }
                if (i3 >= 0) {
                    ArrayList arrayList2 = this.OooO0o;
                    if (i3 < arrayList2.size()) {
                        arrayList2.remove(i3);
                    }
                }
                i2 = i4;
            }
            OooOOOo(true);
        }
    }

    @Override // android.view.Menu
    public final void removeItem(int i) {
        ArrayList arrayList = this.OooO0o;
        int size = arrayList.size();
        int i2 = 0;
        while (true) {
            if (i2 < size) {
                if (((C0892oO0ooO0o) arrayList.get(i2)).OooO00o == i) {
                    break;
                }
                i2++;
            } else {
                i2 = -1;
                break;
            }
        }
        if (i2 >= 0) {
            ArrayList arrayList2 = this.OooO0o;
            if (i2 < arrayList2.size()) {
                arrayList2.remove(i2);
                OooOOOo(true);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupCheckable(int i, boolean z, boolean z2) {
        ArrayList arrayList = this.OooO0o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0892oO0ooO0o c0892oO0ooO0o = (C0892oO0ooO0o) arrayList.get(i2);
            if (c0892oO0ooO0o.OooO0O0 == i) {
                c0892oO0ooO0o.OooO0oO(z2);
                c0892oO0ooO0o.setCheckable(z);
            }
        }
    }

    @Override // android.view.Menu
    public void setGroupDividerEnabled(boolean z) {
        this.OooOo0o = z;
    }

    @Override // android.view.Menu
    public final void setGroupEnabled(int i, boolean z) {
        ArrayList arrayList = this.OooO0o;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            C0892oO0ooO0o c0892oO0ooO0o = (C0892oO0ooO0o) arrayList.get(i2);
            if (c0892oO0ooO0o.OooO0O0 == i) {
                c0892oO0ooO0o.setEnabled(z);
            }
        }
    }

    @Override // android.view.Menu
    public final void setGroupVisible(int i, boolean z) {
        int i2;
        ArrayList arrayList = this.OooO0o;
        int size = arrayList.size();
        boolean z2 = false;
        for (int i3 = 0; i3 < size; i3++) {
            C0892oO0ooO0o c0892oO0ooO0o = (C0892oO0ooO0o) arrayList.get(i3);
            if (c0892oO0ooO0o.OooO0O0 == i) {
                int i4 = c0892oO0ooO0o.OooOo;
                int i5 = i4 & (-9);
                if (z) {
                    i2 = 0;
                } else {
                    i2 = 8;
                }
                int i6 = i5 | i2;
                c0892oO0ooO0o.OooOo = i6;
                if (i4 != i6) {
                    z2 = true;
                }
            }
        }
        if (z2) {
            OooOOOo(true);
        }
    }

    @Override // android.view.Menu
    public void setQwertyMode(boolean z) {
        this.OooO0OO = z;
        OooOOOo(false);
    }

    @Override // android.view.Menu
    public final int size() {
        return this.OooO0o.size();
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, int i4) {
        return OooO00o(i, i2, i3, this.OooO0O0.getString(i4));
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(int i, int i2, int i3, int i4) {
        return addSubMenu(i, i2, i3, this.OooO0O0.getString(i4));
    }

    @Override // android.view.Menu
    public final MenuItem add(int i, int i2, int i3, CharSequence charSequence) {
        return OooO00o(i, i2, i3, charSequence);
    }

    @Override // android.view.Menu
    public SubMenu addSubMenu(int i, int i2, int i3, CharSequence charSequence) {
        C0892oO0ooO0o OooO00o = OooO00o(i, i2, i3, charSequence);
        SubMenuC1265oOoo0O subMenuC1265oOoo0O = new SubMenuC1265oOoo0O(this.OooO00o, this, OooO00o);
        OooO00o.OooOOOO = subMenuC1265oOoo0O;
        subMenuC1265oOoo0O.setHeaderTitle(OooO00o.OooO0o0);
        return subMenuC1265oOoo0O;
    }

    @Override // android.view.Menu
    public final MenuItem add(CharSequence charSequence) {
        return OooO00o(0, 0, 0, charSequence);
    }

    @Override // android.view.Menu
    public final SubMenu addSubMenu(CharSequence charSequence) {
        return addSubMenu(0, 0, 0, charSequence);
    }

    public MenuC0887oO0oo0oo OooOO0O() {
        return this;
    }
}
