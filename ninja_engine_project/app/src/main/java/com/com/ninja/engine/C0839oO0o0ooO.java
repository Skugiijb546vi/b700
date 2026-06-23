package com.ninja.engine;

import android.view.View;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;
import java.util.ArrayList;
import java.util.LinkedHashMap;
/* renamed from: com.ninja.engine.oO0o0ooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0839oO0o0ooO {
    public final /* synthetic */ int OooO00o;
    public int OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public final Object OooO0o;
    public int OooO0o0;
    public final Object OooO0oO;

    public C0839oO0o0ooO(int i) {
        this.OooO00o = 0;
        this.OooO0O0 = i;
        if (i <= 0) {
            throw new IllegalArgumentException("maxSize <= 0".toString());
        }
        this.OooO0o = new o00O(15);
        this.OooO0oO = new C0601o0oOooO0(26);
    }

    public int OooO(int i) {
        int i2 = this.OooO0O0;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.OooO0o).size() == 0) {
            return i;
        }
        View view = (View) ((ArrayList) this.OooO0o).get(0);
        this.OooO0O0 = ((StaggeredGridLayoutManager) this.OooO0oO).OooOOo.OooO0o0(view);
        ((C1246oOoOoo0) view.getLayoutParams()).getClass();
        return this.OooO0O0;
    }

    public void OooO00o() {
        ArrayList arrayList = (ArrayList) this.OooO0o;
        View view = (View) arrayList.get(arrayList.size() - 1);
        this.OooO0OO = ((StaggeredGridLayoutManager) this.OooO0oO).OooOOo.OooO0O0(view);
        ((C1246oOoOoo0) view.getLayoutParams()).getClass();
    }

    public void OooO0O0() {
        ((ArrayList) this.OooO0o).clear();
        this.OooO0O0 = Integer.MIN_VALUE;
        this.OooO0OO = Integer.MIN_VALUE;
        this.OooO0Oo = 0;
    }

    public int OooO0OO() {
        boolean z = ((StaggeredGridLayoutManager) this.OooO0oO).OooOo0o;
        ArrayList arrayList = (ArrayList) this.OooO0o;
        if (z) {
            return OooO0o0(arrayList.size() - 1, -1);
        }
        return OooO0o0(0, arrayList.size());
    }

    public int OooO0Oo() {
        boolean z = ((StaggeredGridLayoutManager) this.OooO0oO).OooOo0o;
        ArrayList arrayList = (ArrayList) this.OooO0o;
        if (z) {
            return OooO0o0(0, arrayList.size());
        }
        return OooO0o0(arrayList.size() - 1, -1);
    }

    public Object OooO0o(Object obj) {
        AbstractC0809oO0OooOO.OooOOOo(obj, "key");
        synchronized (((C0601o0oOooO0) this.OooO0oO)) {
            o00O o00o = (o00O) this.OooO0o;
            o00o.getClass();
            Object obj2 = ((LinkedHashMap) o00o.OooO0O0).get(obj);
            if (obj2 != null) {
                this.OooO0Oo++;
                return obj2;
            }
            this.OooO0o0++;
            return null;
        }
    }

    public int OooO0o0(int i, int i2) {
        int i3;
        boolean z;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.OooO0oO;
        int OooOO0O = staggeredGridLayoutManager.OooOOo.OooOO0O();
        int OooO0oO = staggeredGridLayoutManager.OooOOo.OooO0oO();
        if (i2 > i) {
            i3 = 1;
        } else {
            i3 = -1;
        }
        while (i != i2) {
            View view = (View) ((ArrayList) this.OooO0o).get(i);
            int OooO0o0 = staggeredGridLayoutManager.OooOOo.OooO0o0(view);
            int OooO0O0 = staggeredGridLayoutManager.OooOOo.OooO0O0(view);
            boolean z2 = false;
            if (OooO0o0 <= OooO0oO) {
                z = true;
            } else {
                z = false;
            }
            if (OooO0O0 >= OooOO0O) {
                z2 = true;
            }
            if (z && z2 && (OooO0o0 < OooOO0O || OooO0O0 > OooO0oO)) {
                return AbstractC1066oOOo0Oo.Oooo00o(view);
            }
            i += i3;
        }
        return -1;
    }

    public int OooO0oO(int i) {
        int i2 = this.OooO0OO;
        if (i2 != Integer.MIN_VALUE) {
            return i2;
        }
        if (((ArrayList) this.OooO0o).size() == 0) {
            return i;
        }
        OooO00o();
        return this.OooO0OO;
    }

    public View OooO0oo(int i, int i2) {
        ArrayList arrayList = (ArrayList) this.OooO0o;
        StaggeredGridLayoutManager staggeredGridLayoutManager = (StaggeredGridLayoutManager) this.OooO0oO;
        View view = null;
        if (i2 == -1) {
            int size = arrayList.size();
            int i3 = 0;
            while (i3 < size) {
                View view2 = (View) arrayList.get(i3);
                if ((staggeredGridLayoutManager.OooOo0o && AbstractC1066oOOo0Oo.Oooo00o(view2) <= i) || ((!staggeredGridLayoutManager.OooOo0o && AbstractC1066oOOo0Oo.Oooo00o(view2) >= i) || !view2.hasFocusable())) {
                    break;
                }
                i3++;
                view = view2;
            }
        } else {
            int size2 = arrayList.size() - 1;
            while (size2 >= 0) {
                View view3 = (View) arrayList.get(size2);
                if ((staggeredGridLayoutManager.OooOo0o && AbstractC1066oOOo0Oo.Oooo00o(view3) >= i) || ((!staggeredGridLayoutManager.OooOo0o && AbstractC1066oOOo0Oo.Oooo00o(view3) <= i) || !view3.hasFocusable())) {
                    break;
                }
                size2--;
                view = view3;
            }
        }
        return view;
    }

    public Object OooOO0(Object obj, Object obj2) {
        Object put;
        AbstractC0809oO0OooOO.OooOOOo(obj, "key");
        synchronized (((C0601o0oOooO0) this.OooO0oO)) {
            this.OooO0OO++;
            o00O o00o = (o00O) this.OooO0o;
            o00o.getClass();
            put = ((LinkedHashMap) o00o.OooO0O0).put(obj, obj2);
            if (put != null) {
                this.OooO0OO--;
            }
        }
        OooOO0O(this.OooO0O0);
        return put;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00a2, code lost:
        throw new java.lang.IllegalStateException("LruCache.sizeOf() is reporting inconsistent results!".toString());
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void OooOO0O(int r6) {
        /*
            r5 = this;
        L0:
            java.lang.Object r0 = r5.OooO0oO
            com.ninja.engine.o0oOooO0 r0 = (com.ninja.engine.C0601o0oOooO0) r0
            monitor-enter(r0)
            int r1 = r5.OooO0OO     // Catch: java.lang.Throwable -> L1c
            if (r1 < 0) goto L97
            java.lang.Object r1 = r5.OooO0o     // Catch: java.lang.Throwable -> L1c
            com.ninja.engine.o00O r1 = (com.ninja.engine.o00O) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.OooO0O0     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L1f
            int r1 = r5.OooO0OO     // Catch: java.lang.Throwable -> L1c
            if (r1 != 0) goto L97
            goto L1f
        L1c:
            r6 = move-exception
            goto La3
        L1f:
            int r1 = r5.OooO0OO     // Catch: java.lang.Throwable -> L1c
            if (r1 <= r6) goto L95
            java.lang.Object r1 = r5.OooO0o     // Catch: java.lang.Throwable -> L1c
            com.ninja.engine.o00O r1 = (com.ninja.engine.o00O) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.OooO0O0     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r1 == 0) goto L32
            goto L95
        L32:
            java.lang.Object r1 = r5.OooO0o     // Catch: java.lang.Throwable -> L1c
            com.ninja.engine.o00O r1 = (com.ninja.engine.o00O) r1     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r1 = r1.OooO0O0     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r1 = (java.util.LinkedHashMap) r1     // Catch: java.lang.Throwable -> L1c
            java.util.Set r1 = r1.entrySet()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r2 = "map.entries"
            com.ninja.engine.AbstractC0809oO0OooOO.OooOOOO(r1, r2)     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1 instanceof java.util.List     // Catch: java.lang.Throwable -> L1c
            r3 = 0
            if (r2 == 0) goto L57
            java.util.List r1 = (java.util.List) r1     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.isEmpty()     // Catch: java.lang.Throwable -> L1c
            if (r2 == 0) goto L51
            goto L66
        L51:
            r2 = 0
            java.lang.Object r3 = r1.get(r2)     // Catch: java.lang.Throwable -> L1c
            goto L66
        L57:
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L1c
            boolean r2 = r1.hasNext()     // Catch: java.lang.Throwable -> L1c
            if (r2 != 0) goto L62
            goto L66
        L62:
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L1c
        L66:
            java.util.Map$Entry r3 = (java.util.Map.Entry) r3     // Catch: java.lang.Throwable -> L1c
            if (r3 != 0) goto L6c
            monitor-exit(r0)
            return
        L6c:
            java.lang.Object r1 = r3.getKey()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r2 = r3.getValue()     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r5.OooO0o     // Catch: java.lang.Throwable -> L1c
            com.ninja.engine.o00O r3 = (com.ninja.engine.o00O) r3     // Catch: java.lang.Throwable -> L1c
            r3.getClass()     // Catch: java.lang.Throwable -> L1c
            java.lang.String r4 = "key"
            com.ninja.engine.AbstractC0809oO0OooOO.OooOOOo(r1, r4)     // Catch: java.lang.Throwable -> L1c
            java.lang.Object r3 = r3.OooO0O0     // Catch: java.lang.Throwable -> L1c
            java.util.LinkedHashMap r3 = (java.util.LinkedHashMap) r3     // Catch: java.lang.Throwable -> L1c
            r3.remove(r1)     // Catch: java.lang.Throwable -> L1c
            int r1 = r5.OooO0OO     // Catch: java.lang.Throwable -> L1c
            java.lang.String r3 = "value"
            com.ninja.engine.AbstractC0809oO0OooOO.OooOOOo(r2, r3)     // Catch: java.lang.Throwable -> L1c
            int r1 = r1 + (-1)
            r5.OooO0OO = r1     // Catch: java.lang.Throwable -> L1c
            monitor-exit(r0)
            goto L0
        L95:
            monitor-exit(r0)
            return
        L97:
            java.lang.String r6 = "LruCache.sizeOf() is reporting inconsistent results!"
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch: java.lang.Throwable -> L1c
            java.lang.String r6 = r6.toString()     // Catch: java.lang.Throwable -> L1c
            r1.<init>(r6)     // Catch: java.lang.Throwable -> L1c
            throw r1     // Catch: java.lang.Throwable -> L1c
        La3:
            monitor-exit(r0)
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0839oO0o0ooO.OooOO0O(int):void");
    }

    public String toString() {
        int i;
        String str;
        switch (this.OooO00o) {
            case 0:
                synchronized (((C0601o0oOooO0) this.OooO0oO)) {
                    try {
                        int i2 = this.OooO0Oo;
                        int i3 = this.OooO0o0 + i2;
                        if (i3 != 0) {
                            i = (i2 * 100) / i3;
                        } else {
                            i = 0;
                        }
                        str = "LruCache[maxSize=" + this.OooO0O0 + ",hits=" + this.OooO0Oo + ",misses=" + this.OooO0o0 + ",hitRate=" + i + "%]";
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                return str;
            default:
                return super.toString();
        }
    }

    public C0839oO0o0ooO(StaggeredGridLayoutManager staggeredGridLayoutManager, int i) {
        this.OooO00o = 1;
        this.OooO0oO = staggeredGridLayoutManager;
        this.OooO0o = new ArrayList();
        this.OooO0O0 = Integer.MIN_VALUE;
        this.OooO0OO = Integer.MIN_VALUE;
        this.OooO0Oo = 0;
        this.OooO0o0 = i;
    }
}
