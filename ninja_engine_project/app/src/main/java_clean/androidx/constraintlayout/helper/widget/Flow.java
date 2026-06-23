package androidx.constraintlayout.helper.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import com.ninja.engine.AbstractC0705oO000o0o;
import com.ninja.engine.AbstractC1031oOOOoOOo;
import com.ninja.engine.AbstractC1514oo0Oo0;
import com.ninja.engine.C0316o0O0o0o;
import com.ninja.engine.C0550o0o0Oo0;
import java.util.ArrayList;
import java.util.HashMap;
/* loaded from: classes.dex */
public class Flow extends AbstractC1514oo0Oo0 {
    public C0550o0o0Oo0 OooOO0;

    public Flow(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO00o = new int[32];
        this.OooO0oO = new HashMap();
        this.OooO0OO = context;
        OooO0oO(attributeSet);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.o0o0Oo0, com.ninja.engine.oO000o0o] */
    /* JADX WARN: Type inference failed for: r2v0, types: [com.ninja.engine.o00o00, java.lang.Object] */
    @Override // com.ninja.engine.AbstractC1514oo0Oo0, com.ninja.engine.AbstractC0308o0O0Ooo0
    public final void OooO0oO(AttributeSet attributeSet) {
        super.OooO0oO(attributeSet);
        AbstractC0705oO000o0o abstractC0705oO000o0o = new AbstractC0705oO000o0o();
        abstractC0705oO000o0o.o00oO0o = 0;
        abstractC0705oO000o0o.o00oO0O = 0;
        abstractC0705oO000o0o.o0ooOO0 = 0;
        abstractC0705oO000o0o.o0ooOOo = 0;
        abstractC0705oO000o0o.o0ooOoO = 0;
        abstractC0705oO000o0o.o0OOO0o = 0;
        abstractC0705oO000o0o.o0Oo0oo = false;
        abstractC0705oO000o0o.o0OO00O = 0;
        abstractC0705oO000o0o.oo0o0Oo = 0;
        abstractC0705oO000o0o.o0O0O00 = new Object();
        abstractC0705oO000o0o.o000OOo = null;
        abstractC0705oO000o0o.o000000 = -1;
        abstractC0705oO000o0o.o000000O = -1;
        abstractC0705oO000o0o.o000000o = -1;
        abstractC0705oO000o0o.o00000 = -1;
        abstractC0705oO000o0o.o00000O0 = -1;
        abstractC0705oO000o0o.o00000O = -1;
        abstractC0705oO000o0o.o00000OO = 0.5f;
        abstractC0705oO000o0o.o00000Oo = 0.5f;
        abstractC0705oO000o0o.o00000o0 = 0.5f;
        abstractC0705oO000o0o.o0000Ooo = 0.5f;
        abstractC0705oO000o0o.o00000oO = 0.5f;
        abstractC0705oO000o0o.o00000oo = 0.5f;
        abstractC0705oO000o0o.o0000 = 0;
        abstractC0705oO000o0o.o0000O00 = 0;
        abstractC0705oO000o0o.o0000oo = 2;
        abstractC0705oO000o0o.o0000oO = 2;
        abstractC0705oO000o0o.o0000O0 = 0;
        abstractC0705oO000o0o.o0000O0O = -1;
        abstractC0705oO000o0o.o000OO = 0;
        abstractC0705oO000o0o.o0000O = new ArrayList();
        abstractC0705oO000o0o.o0000OO0 = null;
        abstractC0705oO000o0o.o0000OO = null;
        abstractC0705oO000o0o.o0000OOO = null;
        abstractC0705oO000o0o.o0000Oo0 = 0;
        this.OooOO0 = abstractC0705oO000o0o;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1031oOOOoOOo.OooO0O0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 0) {
                    this.OooOO0.o000OO = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 1) {
                    C0550o0o0Oo0 c0550o0o0Oo0 = this.OooOO0;
                    int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0550o0o0Oo0.o00oO0o = dimensionPixelSize;
                    c0550o0o0Oo0.o00oO0O = dimensionPixelSize;
                    c0550o0o0Oo0.o0ooOO0 = dimensionPixelSize;
                    c0550o0o0Oo0.o0ooOOo = dimensionPixelSize;
                } else if (index == 18) {
                    C0550o0o0Oo0 c0550o0o0Oo02 = this.OooOO0;
                    int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                    c0550o0o0Oo02.o0ooOO0 = dimensionPixelSize2;
                    c0550o0o0Oo02.o0ooOoO = dimensionPixelSize2;
                    c0550o0o0Oo02.o0OOO0o = dimensionPixelSize2;
                } else if (index == 19) {
                    this.OooOO0.o0ooOOo = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 2) {
                    this.OooOO0.o0ooOoO = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 3) {
                    this.OooOO0.o00oO0o = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 4) {
                    this.OooOO0.o0OOO0o = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 5) {
                    this.OooOO0.o00oO0O = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 54) {
                    this.OooOO0.o0000O0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 44) {
                    this.OooOO0.o000000 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 53) {
                    this.OooOO0.o000000O = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 38) {
                    this.OooOO0.o000000o = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 46) {
                    this.OooOO0.o00000O0 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 40) {
                    this.OooOO0.o00000 = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 48) {
                    this.OooOO0.o00000O = obtainStyledAttributes.getInt(index, 0);
                } else if (index == 42) {
                    this.OooOO0.o00000OO = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 37) {
                    this.OooOO0.o00000o0 = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 45) {
                    this.OooOO0.o00000oO = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 39) {
                    this.OooOO0.o0000Ooo = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 47) {
                    this.OooOO0.o00000oo = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 51) {
                    this.OooOO0.o00000Oo = obtainStyledAttributes.getFloat(index, 0.5f);
                } else if (index == 41) {
                    this.OooOO0.o0000oo = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 50) {
                    this.OooOO0.o0000oO = obtainStyledAttributes.getInt(index, 2);
                } else if (index == 43) {
                    this.OooOO0.o0000 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 52) {
                    this.OooOO0.o0000O00 = obtainStyledAttributes.getDimensionPixelSize(index, 0);
                } else if (index == 49) {
                    this.OooOO0.o0000O0O = obtainStyledAttributes.getInt(index, -1);
                }
            }
            obtainStyledAttributes.recycle();
        }
        this.OooO0Oo = this.OooOO0;
        OooO();
    }

    @Override // com.ninja.engine.AbstractC0308o0O0Ooo0
    public final void OooO0oo(C0316o0O0o0o c0316o0O0o0o, boolean z) {
        C0550o0o0Oo0 c0550o0o0Oo0 = this.OooOO0;
        int i = c0550o0o0Oo0.o0ooOO0;
        if (i > 0 || c0550o0o0Oo0.o0ooOOo > 0) {
            if (z) {
                c0550o0o0Oo0.o0ooOoO = c0550o0o0Oo0.o0ooOOo;
                c0550o0o0Oo0.o0OOO0o = i;
                return;
            }
            c0550o0o0Oo0.o0ooOoO = i;
            c0550o0o0Oo0.o0OOO0o = c0550o0o0Oo0.o0ooOOo;
        }
    }

    @Override // com.ninja.engine.AbstractC1514oo0Oo0
    public final void OooOO0(C0550o0o0Oo0 c0550o0o0Oo0, int i, int i2) {
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int mode2 = View.MeasureSpec.getMode(i2);
        int size2 = View.MeasureSpec.getSize(i2);
        if (c0550o0o0Oo0 != null) {
            c0550o0o0Oo0.o000oOoO(mode, size, mode2, size2);
            setMeasuredDimension(c0550o0o0Oo0.o0OO00O, c0550o0o0Oo0.oo0o0Oo);
            return;
        }
        setMeasuredDimension(0, 0);
    }

    @Override // com.ninja.engine.AbstractC0308o0O0Ooo0, android.view.View
    public final void onMeasure(int i, int i2) {
        OooOO0(this.OooOO0, i, i2);
    }

    public void setFirstHorizontalBias(float f) {
        this.OooOO0.o00000o0 = f;
        requestLayout();
    }

    public void setFirstHorizontalStyle(int i) {
        this.OooOO0.o000000o = i;
        requestLayout();
    }

    public void setFirstVerticalBias(float f) {
        this.OooOO0.o0000Ooo = f;
        requestLayout();
    }

    public void setFirstVerticalStyle(int i) {
        this.OooOO0.o00000 = i;
        requestLayout();
    }

    public void setHorizontalAlign(int i) {
        this.OooOO0.o0000oo = i;
        requestLayout();
    }

    public void setHorizontalBias(float f) {
        this.OooOO0.o00000OO = f;
        requestLayout();
    }

    public void setHorizontalGap(int i) {
        this.OooOO0.o0000 = i;
        requestLayout();
    }

    public void setHorizontalStyle(int i) {
        this.OooOO0.o000000 = i;
        requestLayout();
    }

    public void setLastHorizontalBias(float f) {
        this.OooOO0.o00000oO = f;
        requestLayout();
    }

    public void setLastHorizontalStyle(int i) {
        this.OooOO0.o00000O0 = i;
        requestLayout();
    }

    public void setLastVerticalBias(float f) {
        this.OooOO0.o00000oo = f;
        requestLayout();
    }

    public void setLastVerticalStyle(int i) {
        this.OooOO0.o00000O = i;
        requestLayout();
    }

    public void setMaxElementsWrap(int i) {
        this.OooOO0.o0000O0O = i;
        requestLayout();
    }

    public void setOrientation(int i) {
        this.OooOO0.o000OO = i;
        requestLayout();
    }

    public void setPadding(int i) {
        C0550o0o0Oo0 c0550o0o0Oo0 = this.OooOO0;
        c0550o0o0Oo0.o00oO0o = i;
        c0550o0o0Oo0.o00oO0O = i;
        c0550o0o0Oo0.o0ooOO0 = i;
        c0550o0o0Oo0.o0ooOOo = i;
        requestLayout();
    }

    public void setPaddingBottom(int i) {
        this.OooOO0.o00oO0O = i;
        requestLayout();
    }

    public void setPaddingLeft(int i) {
        this.OooOO0.o0ooOoO = i;
        requestLayout();
    }

    public void setPaddingRight(int i) {
        this.OooOO0.o0OOO0o = i;
        requestLayout();
    }

    public void setPaddingTop(int i) {
        this.OooOO0.o00oO0o = i;
        requestLayout();
    }

    public void setVerticalAlign(int i) {
        this.OooOO0.o0000oO = i;
        requestLayout();
    }

    public void setVerticalBias(float f) {
        this.OooOO0.o00000Oo = f;
        requestLayout();
    }

    public void setVerticalGap(int i) {
        this.OooOO0.o0000O00 = i;
        requestLayout();
    }

    public void setVerticalStyle(int i) {
        this.OooOO0.o000000O = i;
        requestLayout();
    }

    public void setWrapMode(int i) {
        this.OooOO0.o0000O0 = i;
        requestLayout();
    }
}


