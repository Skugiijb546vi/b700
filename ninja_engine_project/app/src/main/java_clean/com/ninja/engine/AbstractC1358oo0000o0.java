package com.ninja.engine;

import android.animation.Animator;
import android.animation.TimeInterpolator;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowId;
import android.widget.ListView;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oo0000o0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1358oo0000o0 implements Cloneable {
    public ArrayList OooOO0O;
    public ArrayList OooOO0o;
    public InterfaceC1356oo0000Oo[] OooOOO0;
    public static final Animator[] OooOo0o = new Animator[0];
    public static final int[] OooOo = {2, 1, 3, 4};
    public static final C0919oOO00oOo OooOoO0 = new C0919oOO00oOo(16);
    public static final ThreadLocal OooOoO = new ThreadLocal();
    public final String OooO00o = getClass().getName();
    public long OooO0O0 = -1;
    public long OooO0OO = -1;
    public TimeInterpolator OooO0Oo = null;
    public final ArrayList OooO0o0 = new ArrayList();
    public final ArrayList OooO0o = new ArrayList();
    public oOO00OOO OooO0oO = new oOO00OOO(8);
    public oOO00OOO OooO0oo = new oOO00OOO(8);
    public C1363oo000O0O OooO = null;
    public final int[] OooOO0 = OooOo;
    public final ArrayList OooOOO = new ArrayList();
    public Animator[] OooOOOO = OooOo0o;
    public int OooOOOo = 0;
    public boolean OooOOo0 = false;
    public boolean OooOOo = false;
    public AbstractC1358oo0000o0 OooOOoo = null;
    public ArrayList OooOo00 = null;
    public ArrayList OooOo0 = new ArrayList();
    public C0919oOO00oOo OooOo0O = OooOoO0;

    public static void OooO0OO(oOO00OOO ooo00ooo, View view, C1366oo000OO0 c1366oo000OO0) {
        ((C0145o00OO0oO) ooo00ooo.OooO00o).put(view, c1366oo000OO0);
        int id = view.getId();
        if (id >= 0) {
            SparseArray sparseArray = (SparseArray) ooo00ooo.OooO0O0;
            if (sparseArray.indexOfKey(id) >= 0) {
                sparseArray.put(id, null);
            } else {
                sparseArray.put(id, view);
            }
        }
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        String OooO0oO = AbstractC1452oo0O000o.OooO0oO(view);
        if (OooO0oO != null) {
            C0145o00OO0oO c0145o00OO0oO = (C0145o00OO0oO) ooo00ooo.OooO0Oo;
            if (c0145o00OO0oO.containsKey(OooO0oO)) {
                c0145o00OO0oO.put(OooO0oO, null);
            } else {
                c0145o00OO0oO.put(OooO0oO, view);
            }
        }
        if (view.getParent() instanceof ListView) {
            ListView listView = (ListView) view.getParent();
            if (listView.getAdapter().hasStableIds()) {
                long itemIdAtPosition = listView.getItemIdAtPosition(listView.getPositionForView(view));
                C0832oO0o0o00 c0832oO0o0o00 = (C0832oO0o0o00) ooo00ooo.OooO0OO;
                if (c0832oO0o0o00.OooO00o) {
                    int i = c0832oO0o0o00.OooO0Oo;
                    long[] jArr = c0832oO0o0o00.OooO0O0;
                    Object[] objArr = c0832oO0o0o00.OooO0OO;
                    int i2 = 0;
                    for (int i3 = 0; i3 < i; i3++) {
                        Object obj = objArr[i3];
                        if (obj != AbstractC0809oO0OooOO.OooO0oO) {
                            if (i3 != i2) {
                                jArr[i2] = jArr[i3];
                                objArr[i2] = obj;
                                objArr[i3] = null;
                            }
                            i2++;
                        }
                    }
                    c0832oO0o0o00.OooO00o = false;
                    c0832oO0o0o00.OooO0Oo = i2;
                }
                if (AbstractC0694o0ooooo0.OooO0o0(c0832oO0o0o00.OooO0O0, c0832oO0o0o00.OooO0Oo, itemIdAtPosition) >= 0) {
                    View view2 = (View) c0832oO0o0o00.OooO0Oo(itemIdAtPosition);
                    if (view2 != null) {
                        view2.setHasTransientState(false);
                        c0832oO0o0o00.OooO0oO(itemIdAtPosition, null);
                        return;
                    }
                    return;
                }
                view.setHasTransientState(true);
                c0832oO0o0o00.OooO0oO(itemIdAtPosition, view);
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [com.ninja.engine.o00OO0oO, java.lang.Object, com.ninja.engine.oOoOOoo] */
    public static C0145o00OO0oO OooOOo0() {
        ThreadLocal threadLocal = OooOoO;
        C0145o00OO0oO c0145o00OO0oO = (C0145o00OO0oO) threadLocal.get();
        if (c0145o00OO0oO == null) {
            C1218oOoOOoo c1218oOoOOoo = new C1218oOoOOoo();
            threadLocal.set(c1218oOoOOoo);
            return c1218oOoOOoo;
        }
        return c0145o00OO0oO;
    }

    public static boolean OooOo0O(C1366oo000OO0 c1366oo000OO0, C1366oo000OO0 c1366oo000OO02, String str) {
        Object obj = c1366oo000OO0.OooO00o.get(str);
        Object obj2 = c1366oo000OO02.OooO00o.get(str);
        if (obj == null && obj2 == null) {
            return false;
        }
        if (obj != null && obj2 != null) {
            return !obj.equals(obj2);
        }
        return true;
    }

    public final void OooO(ViewGroup viewGroup, boolean z) {
        oOO00OOO ooo00ooo;
        oOO00OOO ooo00ooo2;
        OooOO0(z);
        ArrayList arrayList = this.OooO0o0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.OooO0o;
        if (size <= 0 && arrayList2.size() <= 0) {
            OooO0o(viewGroup, z);
            return;
        }
        for (int i = 0; i < arrayList.size(); i++) {
            View findViewById = viewGroup.findViewById(((Integer) arrayList.get(i)).intValue());
            if (findViewById != null) {
                C1366oo000OO0 c1366oo000OO0 = new C1366oo000OO0(findViewById);
                if (z) {
                    OooO0oo(c1366oo000OO0);
                } else {
                    OooO0o0(c1366oo000OO0);
                }
                c1366oo000OO0.OooO0OO.add(this);
                OooO0oO(c1366oo000OO0);
                if (z) {
                    ooo00ooo2 = this.OooO0oO;
                } else {
                    ooo00ooo2 = this.OooO0oo;
                }
                OooO0OO(ooo00ooo2, findViewById, c1366oo000OO0);
            }
        }
        for (int i2 = 0; i2 < arrayList2.size(); i2++) {
            View view = (View) arrayList2.get(i2);
            C1366oo000OO0 c1366oo000OO02 = new C1366oo000OO0(view);
            if (z) {
                OooO0oo(c1366oo000OO02);
            } else {
                OooO0o0(c1366oo000OO02);
            }
            c1366oo000OO02.OooO0OO.add(this);
            OooO0oO(c1366oo000OO02);
            if (z) {
                ooo00ooo = this.OooO0oO;
            } else {
                ooo00ooo = this.OooO0oo;
            }
            OooO0OO(ooo00ooo, view, c1366oo000OO02);
        }
    }

    public void OooO00o(InterfaceC1356oo0000Oo interfaceC1356oo0000Oo) {
        if (this.OooOo00 == null) {
            this.OooOo00 = new ArrayList();
        }
        this.OooOo00.add(interfaceC1356oo0000Oo);
    }

    public void OooO0O0(View view) {
        this.OooO0o.add(view);
    }

    public void OooO0Oo() {
        ArrayList arrayList = this.OooOOO;
        int size = arrayList.size();
        Animator[] animatorArr = (Animator[]) arrayList.toArray(this.OooOOOO);
        this.OooOOOO = OooOo0o;
        for (int i = size - 1; i >= 0; i--) {
            Animator animator = animatorArr[i];
            animatorArr[i] = null;
            animator.cancel();
        }
        this.OooOOOO = animatorArr;
        OooOo0o(this, C0386o0OOoO.OooO0Oo);
    }

    public final void OooO0o(View view, boolean z) {
        oOO00OOO ooo00ooo;
        if (view == null) {
            return;
        }
        view.getId();
        if (view.getParent() instanceof ViewGroup) {
            C1366oo000OO0 c1366oo000OO0 = new C1366oo000OO0(view);
            if (z) {
                OooO0oo(c1366oo000OO0);
            } else {
                OooO0o0(c1366oo000OO0);
            }
            c1366oo000OO0.OooO0OO.add(this);
            OooO0oO(c1366oo000OO0);
            if (z) {
                ooo00ooo = this.OooO0oO;
            } else {
                ooo00ooo = this.OooO0oo;
            }
            OooO0OO(ooo00ooo, view, c1366oo000OO0);
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            for (int i = 0; i < viewGroup.getChildCount(); i++) {
                OooO0o(viewGroup.getChildAt(i), z);
            }
        }
    }

    public abstract void OooO0o0(C1366oo000OO0 c1366oo000OO0);

    public abstract void OooO0oo(C1366oo000OO0 c1366oo000OO0);

    public final void OooOO0(boolean z) {
        oOO00OOO ooo00ooo;
        if (z) {
            ((C0145o00OO0oO) this.OooO0oO.OooO00o).clear();
            ((SparseArray) this.OooO0oO.OooO0O0).clear();
            ooo00ooo = this.OooO0oO;
        } else {
            ((C0145o00OO0oO) this.OooO0oo.OooO00o).clear();
            ((SparseArray) this.OooO0oo.OooO0O0).clear();
            ooo00ooo = this.OooO0oo;
        }
        ((C0832oO0o0o00) ooo00ooo.OooO0OO).OooO0O0();
    }

    @Override // 
    /* renamed from: OooOO0O */
    public AbstractC1358oo0000o0 clone() {
        try {
            AbstractC1358oo0000o0 abstractC1358oo0000o0 = (AbstractC1358oo0000o0) super.clone();
            abstractC1358oo0000o0.OooOo0 = new ArrayList();
            abstractC1358oo0000o0.OooO0oO = new oOO00OOO(8);
            abstractC1358oo0000o0.OooO0oo = new oOO00OOO(8);
            abstractC1358oo0000o0.OooOO0O = null;
            abstractC1358oo0000o0.OooOO0o = null;
            abstractC1358oo0000o0.OooOOoo = this;
            abstractC1358oo0000o0.OooOo00 = null;
            return abstractC1358oo0000o0;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public Animator OooOO0o(ViewGroup viewGroup, C1366oo000OO0 c1366oo000OO0, C1366oo000OO0 c1366oo000OO02) {
        return null;
    }

    public final void OooOOO() {
        int i = this.OooOOOo - 1;
        this.OooOOOo = i;
        if (i == 0) {
            OooOo0o(this, C0386o0OOoO.OooO0OO);
            for (int i2 = 0; i2 < ((C0832oO0o0o00) this.OooO0oO.OooO0OO).OooO0oo(); i2++) {
                View view = (View) ((C0832oO0o0o00) this.OooO0oO.OooO0OO).OooO(i2);
                if (view != null) {
                    view.setHasTransientState(false);
                }
            }
            for (int i3 = 0; i3 < ((C0832oO0o0o00) this.OooO0oo.OooO0OO).OooO0oo(); i3++) {
                View view2 = (View) ((C0832oO0o0o00) this.OooO0oo.OooO0OO).OooO(i3);
                if (view2 != null) {
                    view2.setHasTransientState(false);
                }
            }
            this.OooOOo = true;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v10, types: [java.lang.Object, com.ninja.engine.oo0000OO] */
    public void OooOOO0(ViewGroup viewGroup, oOO00OOO ooo00ooo, oOO00OOO ooo00ooo2, ArrayList arrayList, ArrayList arrayList2) {
        int i;
        View view;
        C1366oo000OO0 c1366oo000OO0;
        Animator animator;
        C1366oo000OO0 c1366oo000OO02;
        C0145o00OO0oO OooOOo0 = OooOOo0();
        SparseIntArray sparseIntArray = new SparseIntArray();
        int size = arrayList.size();
        OooOOOo().getClass();
        int i2 = 0;
        while (i2 < size) {
            C1366oo000OO0 c1366oo000OO03 = (C1366oo000OO0) arrayList.get(i2);
            C1366oo000OO0 c1366oo000OO04 = (C1366oo000OO0) arrayList2.get(i2);
            if (c1366oo000OO03 != null && !c1366oo000OO03.OooO0OO.contains(this)) {
                c1366oo000OO03 = null;
            }
            if (c1366oo000OO04 != null && !c1366oo000OO04.OooO0OO.contains(this)) {
                c1366oo000OO04 = null;
            }
            if ((c1366oo000OO03 != null || c1366oo000OO04 != null) && (c1366oo000OO03 == null || c1366oo000OO04 == null || OooOo00(c1366oo000OO03, c1366oo000OO04))) {
                Animator OooOO0o = OooOO0o(viewGroup, c1366oo000OO03, c1366oo000OO04);
                if (OooOO0o != null) {
                    String str = this.OooO00o;
                    if (c1366oo000OO04 != null) {
                        String[] OooOOo = OooOOo();
                        view = c1366oo000OO04.OooO0O0;
                        if (OooOOo != null && OooOOo.length > 0) {
                            c1366oo000OO02 = new C1366oo000OO0(view);
                            C1366oo000OO0 c1366oo000OO05 = (C1366oo000OO0) ((C0145o00OO0oO) ooo00ooo2.OooO00o).get(view);
                            i = size;
                            if (c1366oo000OO05 != null) {
                                int i3 = 0;
                                while (i3 < OooOOo.length) {
                                    HashMap hashMap = c1366oo000OO02.OooO00o;
                                    String str2 = OooOOo[i3];
                                    hashMap.put(str2, c1366oo000OO05.OooO00o.get(str2));
                                    i3++;
                                    OooOOo = OooOOo;
                                }
                            }
                            int i4 = OooOOo0.OooO0OO;
                            int i5 = 0;
                            while (true) {
                                if (i5 < i4) {
                                    C1355oo0000OO c1355oo0000OO = (C1355oo0000OO) OooOOo0.get((Animator) OooOOo0.OooO0o(i5));
                                    if (c1355oo0000OO.OooO0OO != null && c1355oo0000OO.OooO00o == view && c1355oo0000OO.OooO0O0.equals(str) && c1355oo0000OO.OooO0OO.equals(c1366oo000OO02)) {
                                        animator = null;
                                        break;
                                    }
                                    i5++;
                                } else {
                                    animator = OooOO0o;
                                    break;
                                }
                            }
                        } else {
                            i = size;
                            animator = OooOO0o;
                            c1366oo000OO02 = null;
                        }
                        OooOO0o = animator;
                        c1366oo000OO0 = c1366oo000OO02;
                    } else {
                        i = size;
                        view = c1366oo000OO03.OooO0O0;
                        c1366oo000OO0 = null;
                    }
                    if (OooOO0o != null) {
                        WindowId windowId = viewGroup.getWindowId();
                        Object obj = new Object();
                        obj.OooO00o = view;
                        obj.OooO0O0 = str;
                        obj.OooO0OO = c1366oo000OO0;
                        obj.OooO0Oo = windowId;
                        obj.OooO0o0 = this;
                        obj.OooO0o = OooOO0o;
                        OooOOo0.put(OooOO0o, obj);
                        this.OooOo0.add(OooOO0o);
                    }
                    i2++;
                    size = i;
                }
            }
            i = size;
            i2++;
            size = i;
        }
        if (sparseIntArray.size() != 0) {
            for (int i6 = 0; i6 < sparseIntArray.size(); i6++) {
                C1355oo0000OO c1355oo0000OO2 = (C1355oo0000OO) OooOOo0.get((Animator) this.OooOo0.get(sparseIntArray.keyAt(i6)));
                long startDelay = c1355oo0000OO2.OooO0o.getStartDelay();
                c1355oo0000OO2.OooO0o.setStartDelay(startDelay + (sparseIntArray.valueAt(i6) - Long.MAX_VALUE));
            }
        }
    }

    public final C1366oo000OO0 OooOOOO(View view, boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2;
        C1363oo000O0O c1363oo000O0O = this.OooO;
        if (c1363oo000O0O != null) {
            return c1363oo000O0O.OooOOOO(view, z);
        }
        if (z) {
            arrayList = this.OooOO0O;
        } else {
            arrayList = this.OooOO0o;
        }
        if (arrayList == null) {
            return null;
        }
        int size = arrayList.size();
        int i = 0;
        while (true) {
            if (i < size) {
                C1366oo000OO0 c1366oo000OO0 = (C1366oo000OO0) arrayList.get(i);
                if (c1366oo000OO0 == null) {
                    return null;
                }
                if (c1366oo000OO0.OooO0O0 == view) {
                    break;
                }
                i++;
            } else {
                i = -1;
                break;
            }
        }
        if (i < 0) {
            return null;
        }
        if (z) {
            arrayList2 = this.OooOO0o;
        } else {
            arrayList2 = this.OooOO0O;
        }
        return (C1366oo000OO0) arrayList2.get(i);
    }

    public final AbstractC1358oo0000o0 OooOOOo() {
        C1363oo000O0O c1363oo000O0O = this.OooO;
        if (c1363oo000O0O != null) {
            return c1363oo000O0O.OooOOOo();
        }
        return this;
    }

    public String[] OooOOo() {
        return null;
    }

    public final C1366oo000OO0 OooOOoo(View view, boolean z) {
        oOO00OOO ooo00ooo;
        C1363oo000O0O c1363oo000O0O = this.OooO;
        if (c1363oo000O0O != null) {
            return c1363oo000O0O.OooOOoo(view, z);
        }
        if (z) {
            ooo00ooo = this.OooO0oO;
        } else {
            ooo00ooo = this.OooO0oo;
        }
        return (C1366oo000OO0) ((C0145o00OO0oO) ooo00ooo.OooO00o).get(view);
    }

    public void OooOo(View view) {
        if (!this.OooOOo) {
            ArrayList arrayList = this.OooOOO;
            int size = arrayList.size();
            Animator[] animatorArr = (Animator[]) arrayList.toArray(this.OooOOOO);
            this.OooOOOO = OooOo0o;
            for (int i = size - 1; i >= 0; i--) {
                Animator animator = animatorArr[i];
                animatorArr[i] = null;
                animator.pause();
            }
            this.OooOOOO = animatorArr;
            OooOo0o(this, C0386o0OOoO.OooO0o0);
            this.OooOOo0 = true;
        }
    }

    public final boolean OooOo0(View view) {
        int id = view.getId();
        ArrayList arrayList = this.OooO0o0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.OooO0o;
        if ((size == 0 && arrayList2.size() == 0) || arrayList.contains(Integer.valueOf(id)) || arrayList2.contains(view)) {
            return true;
        }
        return false;
    }

    public boolean OooOo00(C1366oo000OO0 c1366oo000OO0, C1366oo000OO0 c1366oo000OO02) {
        if (c1366oo000OO0 == null || c1366oo000OO02 == null) {
            return false;
        }
        String[] OooOOo = OooOOo();
        if (OooOOo != null) {
            for (String str : OooOOo) {
                if (!OooOo0O(c1366oo000OO0, c1366oo000OO02, str)) {
                }
            }
            return false;
        }
        for (String str2 : c1366oo000OO0.OooO00o.keySet()) {
            if (OooOo0O(c1366oo000OO0, c1366oo000OO02, str2)) {
            }
        }
        return false;
        return true;
    }

    public final void OooOo0o(AbstractC1358oo0000o0 abstractC1358oo0000o0, C0386o0OOoO c0386o0OOoO) {
        AbstractC1358oo0000o0 abstractC1358oo0000o02 = this.OooOOoo;
        if (abstractC1358oo0000o02 != null) {
            abstractC1358oo0000o02.OooOo0o(abstractC1358oo0000o0, c0386o0OOoO);
        }
        ArrayList arrayList = this.OooOo00;
        if (arrayList != null && !arrayList.isEmpty()) {
            int size = this.OooOo00.size();
            InterfaceC1356oo0000Oo[] interfaceC1356oo0000OoArr = this.OooOOO0;
            if (interfaceC1356oo0000OoArr == null) {
                interfaceC1356oo0000OoArr = new InterfaceC1356oo0000Oo[size];
            }
            this.OooOOO0 = null;
            InterfaceC1356oo0000Oo[] interfaceC1356oo0000OoArr2 = (InterfaceC1356oo0000Oo[]) this.OooOo00.toArray(interfaceC1356oo0000OoArr);
            for (int i = 0; i < size; i++) {
                c0386o0OOoO.OooO00o(interfaceC1356oo0000OoArr2[i], abstractC1358oo0000o0);
                interfaceC1356oo0000OoArr2[i] = null;
            }
            this.OooOOO0 = interfaceC1356oo0000OoArr2;
        }
    }

    public void OooOoO(View view) {
        this.OooO0o.remove(view);
    }

    public AbstractC1358oo0000o0 OooOoO0(InterfaceC1356oo0000Oo interfaceC1356oo0000Oo) {
        AbstractC1358oo0000o0 abstractC1358oo0000o0;
        ArrayList arrayList = this.OooOo00;
        if (arrayList == null) {
            return this;
        }
        if (!arrayList.remove(interfaceC1356oo0000Oo) && (abstractC1358oo0000o0 = this.OooOOoo) != null) {
            abstractC1358oo0000o0.OooOoO0(interfaceC1356oo0000Oo);
        }
        if (this.OooOo00.size() == 0) {
            this.OooOo00 = null;
        }
        return this;
    }

    public void OooOoOO(ViewGroup viewGroup) {
        if (this.OooOOo0) {
            if (!this.OooOOo) {
                ArrayList arrayList = this.OooOOO;
                int size = arrayList.size();
                Animator[] animatorArr = (Animator[]) arrayList.toArray(this.OooOOOO);
                this.OooOOOO = OooOo0o;
                for (int i = size - 1; i >= 0; i--) {
                    Animator animator = animatorArr[i];
                    animatorArr[i] = null;
                    animator.resume();
                }
                this.OooOOOO = animatorArr;
                OooOo0o(this, C0386o0OOoO.OooO0o);
            }
            this.OooOOo0 = false;
        }
    }

    public void OooOoo(long j) {
        this.OooO0OO = j;
    }

    public void OooOoo0() {
        Oooo0();
        C0145o00OO0oO OooOOo0 = OooOOo0();
        Iterator it = this.OooOo0.iterator();
        while (it.hasNext()) {
            Animator animator = (Animator) it.next();
            if (OooOOo0.containsKey(animator)) {
                Oooo0();
                if (animator != null) {
                    animator.addListener(new C1353oo0000O(this, OooOOo0));
                    long j = this.OooO0OO;
                    if (j >= 0) {
                        animator.setDuration(j);
                    }
                    long j2 = this.OooO0O0;
                    if (j2 >= 0) {
                        animator.setStartDelay(animator.getStartDelay() + j2);
                    }
                    TimeInterpolator timeInterpolator = this.OooO0Oo;
                    if (timeInterpolator != null) {
                        animator.setInterpolator(timeInterpolator);
                    }
                    animator.addListener(new C0200o00o0O(5, this));
                    animator.start();
                }
            }
        }
        this.OooOo0.clear();
        OooOOO();
    }

    public void OooOooo(TimeInterpolator timeInterpolator) {
        this.OooO0Oo = timeInterpolator;
    }

    public final void Oooo0() {
        if (this.OooOOOo == 0) {
            OooOo0o(this, C0386o0OOoO.OooO0O0);
            this.OooOOo = false;
        }
        this.OooOOOo++;
    }

    public void Oooo000(C0919oOO00oOo c0919oOO00oOo) {
        if (c0919oOO00oOo == null) {
            c0919oOO00oOo = OooOoO0;
        }
        this.OooOo0O = c0919oOO00oOo;
    }

    public void Oooo00o(long j) {
        this.OooO0O0 = j;
    }

    public String Oooo0O0(String str) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(getClass().getSimpleName());
        sb.append("@");
        sb.append(Integer.toHexString(hashCode()));
        sb.append(": ");
        if (this.OooO0OO != -1) {
            sb.append("dur(");
            sb.append(this.OooO0OO);
            sb.append(") ");
        }
        if (this.OooO0O0 != -1) {
            sb.append("dly(");
            sb.append(this.OooO0O0);
            sb.append(") ");
        }
        if (this.OooO0Oo != null) {
            sb.append("interp(");
            sb.append(this.OooO0Oo);
            sb.append(") ");
        }
        ArrayList arrayList = this.OooO0o0;
        int size = arrayList.size();
        ArrayList arrayList2 = this.OooO0o;
        if (size > 0 || arrayList2.size() > 0) {
            sb.append("tgts(");
            if (arrayList.size() > 0) {
                for (int i = 0; i < arrayList.size(); i++) {
                    if (i > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList.get(i));
                }
            }
            if (arrayList2.size() > 0) {
                for (int i2 = 0; i2 < arrayList2.size(); i2++) {
                    if (i2 > 0) {
                        sb.append(", ");
                    }
                    sb.append(arrayList2.get(i2));
                }
            }
            sb.append(")");
        }
        return sb.toString();
    }

    public final String toString() {
        return Oooo0O0("");
    }

    public void OooO0oO(C1366oo000OO0 c1366oo000OO0) {
    }

    public void OooOooO(AbstractC1094oOOoOOo0 abstractC1094oOOoOOo0) {
    }

    public void Oooo00O() {
    }
}



