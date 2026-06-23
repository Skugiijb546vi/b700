package com.ninja.engine;

import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOOoO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1083oOOoO0o {
    public static final List OooOOoo = Collections.emptyList();
    public final View OooO00o;
    public WeakReference OooO0O0;
    public int OooOO0;
    public RecyclerView OooOOo;
    public int OooO0OO = -1;
    public int OooO0Oo = -1;
    public long OooO0o0 = -1;
    public int OooO0o = -1;
    public int OooO0oO = -1;
    public AbstractC1083oOOoO0o OooO0oo = null;
    public AbstractC1083oOOoO0o OooO = null;
    public ArrayList OooOO0O = null;
    public List OooOO0o = null;
    public int OooOOO0 = 0;
    public C1070oOOo0o OooOOO = null;
    public boolean OooOOOO = false;
    public int OooOOOo = 0;
    public int OooOOo0 = -1;

    public AbstractC1083oOOoO0o(View view) {
        if (view != null) {
            this.OooO00o = view;
            return;
        }
        throw new IllegalArgumentException("itemView may not be null");
    }

    public final boolean OooO() {
        if ((this.OooOO0 & 4) != 0) {
            return true;
        }
        return false;
    }

    public final void OooO00o(Object obj) {
        if (obj == null) {
            OooO0O0(1024);
        } else if ((1024 & this.OooOO0) == 0) {
            if (this.OooOO0O == null) {
                ArrayList arrayList = new ArrayList();
                this.OooOO0O = arrayList;
                this.OooOO0o = Collections.unmodifiableList(arrayList);
            }
            this.OooOO0O.add(obj);
        }
    }

    public final void OooO0O0(int i) {
        this.OooOO0 = i | this.OooOO0;
    }

    public final int OooO0OO() {
        RecyclerView recyclerView = this.OooOOo;
        if (recyclerView == null) {
            return -1;
        }
        return recyclerView.Oooo000(this);
    }

    public final int OooO0Oo() {
        int i = this.OooO0oO;
        if (i == -1) {
            return this.OooO0OO;
        }
        return i;
    }

    public final boolean OooO0o(int i) {
        if ((i & this.OooOO0) != 0) {
            return true;
        }
        return false;
    }

    public final List OooO0o0() {
        ArrayList arrayList;
        int i = this.OooOO0 & 1024;
        List list = OooOOoo;
        if (i == 0 && (arrayList = this.OooOO0O) != null && arrayList.size() != 0) {
            return this.OooOO0o;
        }
        return list;
    }

    public final boolean OooO0oO() {
        View view = this.OooO00o;
        if (view.getParent() != null && view.getParent() != this.OooOOo) {
            return true;
        }
        return false;
    }

    public final boolean OooO0oo() {
        if ((this.OooOO0 & 1) != 0) {
            return true;
        }
        return false;
    }

    public final boolean OooOO0() {
        if ((this.OooOO0 & 16) == 0) {
            WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
            if (!this.OooO00o.hasTransientState()) {
                return true;
            }
        }
        return false;
    }

    public final boolean OooOO0O() {
        if ((this.OooOO0 & 8) != 0) {
            return true;
        }
        return false;
    }

    public final boolean OooOO0o() {
        if (this.OooOOO != null) {
            return true;
        }
        return false;
    }

    public final boolean OooOOO() {
        if ((this.OooOO0 & 2) != 0) {
            return true;
        }
        return false;
    }

    public final boolean OooOOO0() {
        if ((this.OooOO0 & 256) != 0) {
            return true;
        }
        return false;
    }

    public final void OooOOOO(int i, boolean z) {
        if (this.OooO0Oo == -1) {
            this.OooO0Oo = this.OooO0OO;
        }
        if (this.OooO0oO == -1) {
            this.OooO0oO = this.OooO0OO;
        }
        if (z) {
            this.OooO0oO += i;
        }
        this.OooO0OO += i;
        View view = this.OooO00o;
        if (view.getLayoutParams() != null) {
            ((C1068oOOo0OoO) view.getLayoutParams()).OooO0OO = true;
        }
    }

    public final void OooOOOo() {
        this.OooOO0 = 0;
        this.OooO0OO = -1;
        this.OooO0Oo = -1;
        this.OooO0o0 = -1L;
        this.OooO0oO = -1;
        this.OooOOO0 = 0;
        this.OooO0oo = null;
        this.OooO = null;
        ArrayList arrayList = this.OooOO0O;
        if (arrayList != null) {
            arrayList.clear();
        }
        this.OooOO0 &= -1025;
        this.OooOOOo = 0;
        this.OooOOo0 = -1;
        RecyclerView.OooOO0(this);
    }

    public final boolean OooOOo() {
        if ((this.OooOO0 & 128) != 0) {
            return true;
        }
        return false;
    }

    public final void OooOOo0(boolean z) {
        int i;
        int i2;
        int i3 = this.OooOOO0;
        if (z) {
            i = i3 - 1;
        } else {
            i = i3 + 1;
        }
        this.OooOOO0 = i;
        if (i < 0) {
            this.OooOOO0 = 0;
            toString();
            return;
        }
        if (!z && i == 1) {
            i2 = this.OooOO0 | 16;
        } else if (z && i == 0) {
            i2 = this.OooOO0 & (-17);
        } else {
            return;
        }
        this.OooOO0 = i2;
    }

    public final boolean OooOOoo() {
        if ((this.OooOO0 & 32) != 0) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String simpleName;
        String str;
        if (getClass().isAnonymousClass()) {
            simpleName = "ViewHolder";
        } else {
            simpleName = getClass().getSimpleName();
        }
        StringBuilder sb = new StringBuilder(simpleName + "{" + Integer.toHexString(hashCode()) + " position=" + this.OooO0OO + " id=" + this.OooO0o0 + ", oldPos=" + this.OooO0Oo + ", pLpos:" + this.OooO0oO);
        if (OooOO0o()) {
            sb.append(" scrap ");
            if (this.OooOOOO) {
                str = "[changeScrap]";
            } else {
                str = "[attachedScrap]";
            }
            sb.append(str);
        }
        if (OooO()) {
            sb.append(" invalid");
        }
        if (!OooO0oo()) {
            sb.append(" unbound");
        }
        if ((this.OooOO0 & 2) != 0) {
            sb.append(" update");
        }
        if (OooOO0O()) {
            sb.append(" removed");
        }
        if (OooOOo()) {
            sb.append(" ignored");
        }
        if (OooOOO0()) {
            sb.append(" tmpDetached");
        }
        if (!OooOO0()) {
            sb.append(" not recyclable(" + this.OooOOO0 + ")");
        }
        if ((this.OooOO0 & 512) != 0 || OooO()) {
            sb.append(" undefined adapter position");
        }
        if (this.OooO00o.getParent() == null) {
            sb.append(" no parent");
        }
        sb.append("}");
        return sb.toString();
    }
}
