package com.ninja.engine;

import android.text.Editable;
import android.text.SpannableStringBuilder;
import java.lang.reflect.Array;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.ooOOOooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1803ooOOOooo extends SpannableStringBuilder {
    public final Class OooO00o;
    public final ArrayList OooO0O0;

    public C1803ooOOOooo(Class cls, CharSequence charSequence) {
        super(charSequence);
        this.OooO0O0 = new ArrayList();
        AbstractC0809oO0OooOO.OooOOO(cls, "watcherClass cannot be null");
        this.OooO00o = cls;
    }

    public final void OooO00o() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooO0O0;
            if (i < arrayList.size()) {
                ((C1222oOoOo) arrayList.get(i)).OooO0O0.incrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    public final void OooO0O0() {
        OooO0o0();
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooO0O0;
            if (i < arrayList.size()) {
                ((C1222oOoOo) arrayList.get(i)).onTextChanged(this, 0, length(), length());
                i++;
            } else {
                return;
            }
        }
    }

    public final C1222oOoOo OooO0OO(Object obj) {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooO0O0;
            if (i < arrayList.size()) {
                C1222oOoOo c1222oOoOo = (C1222oOoOo) arrayList.get(i);
                if (c1222oOoOo.OooO00o == obj) {
                    return c1222oOoOo;
                }
                i++;
            } else {
                return null;
            }
        }
    }

    public final boolean OooO0Oo(Object obj) {
        if (obj != null) {
            if (this.OooO00o == obj.getClass()) {
                return true;
            }
        }
        return false;
    }

    public final void OooO0o0() {
        int i = 0;
        while (true) {
            ArrayList arrayList = this.OooO0O0;
            if (i < arrayList.size()) {
                ((C1222oOoOo) arrayList.get(i)).OooO0O0.decrementAndGet();
                i++;
            } else {
                return;
            }
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanEnd(Object obj) {
        C1222oOoOo OooO0OO;
        if (OooO0Oo(obj) && (OooO0OO = OooO0OO(obj)) != null) {
            obj = OooO0OO;
        }
        return super.getSpanEnd(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanFlags(Object obj) {
        C1222oOoOo OooO0OO;
        if (OooO0Oo(obj) && (OooO0OO = OooO0OO(obj)) != null) {
            obj = OooO0OO;
        }
        return super.getSpanFlags(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int getSpanStart(Object obj) {
        C1222oOoOo OooO0OO;
        if (OooO0Oo(obj) && (OooO0OO = OooO0OO(obj)) != null) {
            obj = OooO0OO;
        }
        return super.getSpanStart(obj);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final Object[] getSpans(int i, int i2, Class cls) {
        if (this.OooO00o == cls) {
            C1222oOoOo[] c1222oOoOoArr = (C1222oOoOo[]) super.getSpans(i, i2, C1222oOoOo.class);
            Object[] objArr = (Object[]) Array.newInstance(cls, c1222oOoOoArr.length);
            for (int i3 = 0; i3 < c1222oOoOoArr.length; i3++) {
                objArr[i3] = c1222oOoOoArr[i3].OooO00o;
            }
            return objArr;
        }
        return super.getSpans(i, i2, cls);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spanned
    public final int nextSpanTransition(int i, int i2, Class cls) {
        return super.nextSpanTransition(i, i2, (cls == null || this.OooO00o == cls) ? C1222oOoOo.class : C1222oOoOo.class);
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void removeSpan(Object obj) {
        C1222oOoOo c1222oOoOo;
        if (OooO0Oo(obj)) {
            c1222oOoOo = OooO0OO(obj);
            if (c1222oOoOo != null) {
                obj = c1222oOoOo;
            }
        } else {
            c1222oOoOo = null;
        }
        super.removeSpan(obj);
        if (c1222oOoOo != null) {
            this.OooO0O0.remove(c1222oOoOo);
        }
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence) {
        replace(i, i2, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Spannable
    public final void setSpan(Object obj, int i, int i2, int i3) {
        if (OooO0Oo(obj)) {
            C1222oOoOo c1222oOoOo = new C1222oOoOo(obj);
            this.OooO0O0.add(c1222oOoOo);
            obj = c1222oOoOo;
        }
        super.setSpan(obj, i, i2, i3);
    }

    @Override // android.text.SpannableStringBuilder, java.lang.CharSequence
    public final CharSequence subSequence(int i, int i2) {
        return new C1803ooOOOooo(this.OooO00o, this, i, i2);
    }

    public C1803ooOOOooo(Class cls, CharSequence charSequence, int i, int i2) {
        super(charSequence, i, i2);
        this.OooO0O0 = new ArrayList();
        AbstractC0809oO0OooOO.OooOOO(cls, "watcherClass cannot be null");
        this.OooO00o = cls;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder delete(int i, int i2) {
        super.delete(i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final Editable insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final /* bridge */ /* synthetic */ Editable replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        replace(i, i2, charSequence, i3, i4);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Editable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence) {
        super.insert(i, charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence) {
        OooO00o();
        super.replace(i, i2, charSequence);
        OooO0o0();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder insert(int i, CharSequence charSequence, int i2, int i3) {
        super.insert(i, charSequence, i2, i3);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable
    public final SpannableStringBuilder replace(int i, int i2, CharSequence charSequence, int i3, int i4) {
        OooO00o();
        super.replace(i, i2, charSequence, i3, i4);
        OooO0o0();
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final SpannableStringBuilder append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }

    @Override // android.text.SpannableStringBuilder
    public final SpannableStringBuilder append(CharSequence charSequence, Object obj, int i) {
        super.append(charSequence, obj, i);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(char c) {
        super.append(c);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence) {
        super.append(charSequence);
        return this;
    }

    @Override // android.text.SpannableStringBuilder, android.text.Editable, java.lang.Appendable
    public final Appendable append(CharSequence charSequence, int i, int i2) {
        super.append(charSequence, i, i2);
        return this;
    }
}
