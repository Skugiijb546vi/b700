package com.ninja.engine;

import android.animation.TimeInterpolator;
import android.util.AndroidRuntimeException;
import android.view.View;
import android.view.ViewGroup;
import com.app.framework.utils.ShellUtils;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.ninja.engine.oo000O0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C1363oo000O0O extends AbstractC1358oo0000o0 {
    public int OooOoo;
    public ArrayList OooOoOO = new ArrayList();
    public boolean OooOoo0 = true;
    public boolean OooOooO = false;
    public int OooOooo = 0;

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooO00o(InterfaceC1356oo0000Oo interfaceC1356oo0000Oo) {
        super.OooO00o(interfaceC1356oo0000Oo);
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooO0O0(View view) {
        for (int i = 0; i < this.OooOoOO.size(); i++) {
            ((AbstractC1358oo0000o0) this.OooOoOO.get(i)).OooO0O0(view);
        }
        this.OooO0o.add(view);
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooO0Oo() {
        super.OooO0Oo();
        int size = this.OooOoOO.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1358oo0000o0) this.OooOoOO.get(i)).OooO0Oo();
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooO0o0(C1366oo000OO0 c1366oo000OO0) {
        if (OooOo0(c1366oo000OO0.OooO0O0)) {
            Iterator it = this.OooOoOO.iterator();
            while (it.hasNext()) {
                AbstractC1358oo0000o0 abstractC1358oo0000o0 = (AbstractC1358oo0000o0) it.next();
                if (abstractC1358oo0000o0.OooOo0(c1366oo000OO0.OooO0O0)) {
                    abstractC1358oo0000o0.OooO0o0(c1366oo000OO0);
                    c1366oo000OO0.OooO0OO.add(abstractC1358oo0000o0);
                }
            }
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooO0oO(C1366oo000OO0 c1366oo000OO0) {
        int size = this.OooOoOO.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1358oo0000o0) this.OooOoOO.get(i)).OooO0oO(c1366oo000OO0);
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooO0oo(C1366oo000OO0 c1366oo000OO0) {
        if (OooOo0(c1366oo000OO0.OooO0O0)) {
            Iterator it = this.OooOoOO.iterator();
            while (it.hasNext()) {
                AbstractC1358oo0000o0 abstractC1358oo0000o0 = (AbstractC1358oo0000o0) it.next();
                if (abstractC1358oo0000o0.OooOo0(c1366oo000OO0.OooO0O0)) {
                    abstractC1358oo0000o0.OooO0oo(c1366oo000OO0);
                    c1366oo000OO0.OooO0OO.add(abstractC1358oo0000o0);
                }
            }
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    /* renamed from: OooOO0O */
    public final AbstractC1358oo0000o0 clone() {
        C1363oo000O0O c1363oo000O0O = (C1363oo000O0O) super.clone();
        c1363oo000O0O.OooOoOO = new ArrayList();
        int size = this.OooOoOO.size();
        for (int i = 0; i < size; i++) {
            AbstractC1358oo0000o0 clone = ((AbstractC1358oo0000o0) this.OooOoOO.get(i)).clone();
            c1363oo000O0O.OooOoOO.add(clone);
            clone.OooO = c1363oo000O0O;
        }
        return c1363oo000O0O;
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooOOO0(ViewGroup viewGroup, oOO00OOO ooo00ooo, oOO00OOO ooo00ooo2, ArrayList arrayList, ArrayList arrayList2) {
        long j = this.OooO0O0;
        int size = this.OooOoOO.size();
        for (int i = 0; i < size; i++) {
            AbstractC1358oo0000o0 abstractC1358oo0000o0 = (AbstractC1358oo0000o0) this.OooOoOO.get(i);
            if (j > 0 && (this.OooOoo0 || i == 0)) {
                long j2 = abstractC1358oo0000o0.OooO0O0;
                if (j2 > 0) {
                    abstractC1358oo0000o0.Oooo00o(j2 + j);
                } else {
                    abstractC1358oo0000o0.Oooo00o(j);
                }
            }
            abstractC1358oo0000o0.OooOOO0(viewGroup, ooo00ooo, ooo00ooo2, arrayList, arrayList2);
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooOo(View view) {
        super.OooOo(view);
        int size = this.OooOoOO.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1358oo0000o0) this.OooOoOO.get(i)).OooOo(view);
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooOoO(View view) {
        for (int i = 0; i < this.OooOoOO.size(); i++) {
            ((AbstractC1358oo0000o0) this.OooOoOO.get(i)).OooOoO(view);
        }
        this.OooO0o.remove(view);
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final AbstractC1358oo0000o0 OooOoO0(InterfaceC1356oo0000Oo interfaceC1356oo0000Oo) {
        super.OooOoO0(interfaceC1356oo0000Oo);
        return this;
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooOoOO(ViewGroup viewGroup) {
        super.OooOoOO(viewGroup);
        int size = this.OooOoOO.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1358oo0000o0) this.OooOoOO.get(i)).OooOoOO(viewGroup);
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooOoo0() {
        if (this.OooOoOO.isEmpty()) {
            Oooo0();
            OooOOO();
            return;
        }
        C1362oo000O0 c1362oo000O0 = new C1362oo000O0();
        c1362oo000O0.OooO0O0 = this;
        Iterator it = this.OooOoOO.iterator();
        while (it.hasNext()) {
            ((AbstractC1358oo0000o0) it.next()).OooO00o(c1362oo000O0);
        }
        this.OooOoo = this.OooOoOO.size();
        if (!this.OooOoo0) {
            for (int i = 1; i < this.OooOoOO.size(); i++) {
                ((AbstractC1358oo0000o0) this.OooOoOO.get(i - 1)).OooO00o(new C1362oo000O0((AbstractC1358oo0000o0) this.OooOoOO.get(i)));
            }
            AbstractC1358oo0000o0 abstractC1358oo0000o0 = (AbstractC1358oo0000o0) this.OooOoOO.get(0);
            if (abstractC1358oo0000o0 != null) {
                abstractC1358oo0000o0.OooOoo0();
                return;
            }
            return;
        }
        Iterator it2 = this.OooOoOO.iterator();
        while (it2.hasNext()) {
            ((AbstractC1358oo0000o0) it2.next()).OooOoo0();
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void OooOooO(AbstractC1094oOOoOOo0 abstractC1094oOOoOOo0) {
        this.OooOooo |= 8;
        int size = this.OooOoOO.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1358oo0000o0) this.OooOoOO.get(i)).OooOooO(abstractC1094oOOoOOo0);
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void Oooo000(C0919oOO00oOo c0919oOO00oOo) {
        super.Oooo000(c0919oOO00oOo);
        this.OooOooo |= 4;
        if (this.OooOoOO != null) {
            for (int i = 0; i < this.OooOoOO.size(); i++) {
                ((AbstractC1358oo0000o0) this.OooOoOO.get(i)).Oooo000(c0919oOO00oOo);
            }
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void Oooo00O() {
        this.OooOooo |= 2;
        int size = this.OooOoOO.size();
        for (int i = 0; i < size; i++) {
            ((AbstractC1358oo0000o0) this.OooOoOO.get(i)).Oooo00O();
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final void Oooo00o(long j) {
        this.OooO0O0 = j;
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    public final String Oooo0O0(String str) {
        String Oooo0O0 = super.Oooo0O0(str);
        for (int i = 0; i < this.OooOoOO.size(); i++) {
            StringBuilder sb = new StringBuilder();
            sb.append(Oooo0O0);
            sb.append(ShellUtils.COMMAND_LINE_END);
            sb.append(((AbstractC1358oo0000o0) this.OooOoOO.get(i)).Oooo0O0(str + "  "));
            Oooo0O0 = sb.toString();
        }
        return Oooo0O0;
    }

    public final void Oooo0OO(AbstractC1358oo0000o0 abstractC1358oo0000o0) {
        this.OooOoOO.add(abstractC1358oo0000o0);
        abstractC1358oo0000o0.OooO = this;
        long j = this.OooO0OO;
        if (j >= 0) {
            abstractC1358oo0000o0.OooOoo(j);
        }
        if ((this.OooOooo & 1) != 0) {
            abstractC1358oo0000o0.OooOooo(this.OooO0Oo);
        }
        if ((this.OooOooo & 2) != 0) {
            abstractC1358oo0000o0.Oooo00O();
        }
        if ((this.OooOooo & 4) != 0) {
            abstractC1358oo0000o0.Oooo000(this.OooOo0O);
        }
        if ((this.OooOooo & 8) != 0) {
            abstractC1358oo0000o0.OooOooO(null);
        }
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    /* renamed from: Oooo0o */
    public final void OooOooo(TimeInterpolator timeInterpolator) {
        this.OooOooo |= 1;
        ArrayList arrayList = this.OooOoOO;
        if (arrayList != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1358oo0000o0) this.OooOoOO.get(i)).OooOooo(timeInterpolator);
            }
        }
        this.OooO0Oo = timeInterpolator;
    }

    @Override // com.ninja.engine.AbstractC1358oo0000o0
    /* renamed from: Oooo0o0 */
    public final void OooOoo(long j) {
        ArrayList arrayList;
        this.OooO0OO = j;
        if (j >= 0 && (arrayList = this.OooOoOO) != null) {
            int size = arrayList.size();
            for (int i = 0; i < size; i++) {
                ((AbstractC1358oo0000o0) this.OooOoOO.get(i)).OooOoo(j);
            }
        }
    }

    public final void Oooo0oO(int i) {
        if (i != 0) {
            if (i == 1) {
                this.OooOoo0 = false;
                return;
            }
            throw new AndroidRuntimeException(AbstractC1230oOoOo0o.OooO0o(i, "Invalid parameter for TransitionSet ordering: "));
        }
        this.OooOoo0 = true;
    }
}


