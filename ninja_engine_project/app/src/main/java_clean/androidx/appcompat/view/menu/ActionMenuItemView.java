package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import com.ninja.engine.AbstractC0662o0ooOoO;
import com.ninja.engine.AbstractC1039oOOOoo0o;
import com.ninja.engine.AbstractC1137oOOoooO;
import com.ninja.engine.C0660o0ooOOo;
import com.ninja.engine.C0892oO0ooO0o;
import com.ninja.engine.C1589oo0oOO0;
import com.ninja.engine.InterfaceC0885oO0oo0o;
import com.ninja.engine.InterfaceC0901oO0ooooo;
import com.ninja.engine.MenuC0887oO0oo0oo;
import com.ninja.engine.o000000O;
/* loaded from: classes.dex */
public class ActionMenuItemView extends C1589oo0oOO0 implements InterfaceC0901oO0ooooo, View.OnClickListener, o000000O {
    public CharSequence OooO;
    public C0892oO0ooO0o OooO0oo;
    public Drawable OooOO0;
    public InterfaceC0885oO0oo0o OooOO0O;
    public C0660o0ooOOo OooOO0o;
    public boolean OooOOO;
    public AbstractC0662o0ooOoO OooOOO0;
    public boolean OooOOOO;
    public final int OooOOOo;
    public final int OooOOo;
    public int OooOOo0;

    public ActionMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        Resources resources = context.getResources();
        this.OooOOO = OooOOO();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1039oOOOoo0o.OooO0OO, 0, 0);
        this.OooOOOo = obtainStyledAttributes.getDimensionPixelSize(0, 0);
        obtainStyledAttributes.recycle();
        this.OooOOo = (int) ((resources.getDisplayMetrics().density * 32.0f) + 0.5f);
        setOnClickListener(this);
        this.OooOOo0 = -1;
        setSaveEnabled(false);
    }

    @Override // com.ninja.engine.o000000O
    public final boolean OooO00o() {
        return !TextUtils.isEmpty(getText());
    }

    @Override // com.ninja.engine.InterfaceC0901oO0ooooo
    public final void OooO0O0(C0892oO0ooO0o c0892oO0ooO0o) {
        int i;
        this.OooO0oo = c0892oO0ooO0o;
        setIcon(c0892oO0ooO0o.getIcon());
        setTitle(c0892oO0ooO0o.getTitleCondensed());
        setId(c0892oO0ooO0o.OooO00o);
        if (c0892oO0ooO0o.isVisible()) {
            i = 0;
        } else {
            i = 8;
        }
        setVisibility(i);
        setEnabled(c0892oO0ooO0o.isEnabled());
        if (c0892oO0ooO0o.hasSubMenu() && this.OooOO0o == null) {
            this.OooOO0o = new C0660o0ooOOo(this);
        }
    }

    @Override // com.ninja.engine.o000000O
    public final boolean OooO0OO() {
        if ((!TextUtils.isEmpty(getText())) && this.OooO0oo.getIcon() == null) {
            return true;
        }
        return false;
    }

    public final boolean OooOOO() {
        Configuration configuration = getContext().getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        return i >= 480 || (i >= 640 && configuration.screenHeightDp >= 480) || configuration.orientation == 2;
    }

    public final void OooOOOO() {
        CharSequence charSequence;
        boolean z = true;
        boolean z2 = !TextUtils.isEmpty(this.OooO);
        if (this.OooOO0 != null && ((this.OooO0oo.OooOoO0 & 4) != 4 || (!this.OooOOO && !this.OooOOOO))) {
            z = false;
        }
        boolean z3 = z2 & z;
        CharSequence charSequence2 = null;
        if (z3) {
            charSequence = this.OooO;
        } else {
            charSequence = null;
        }
        setText(charSequence);
        CharSequence charSequence3 = this.OooO0oo.OooOOo0;
        if (TextUtils.isEmpty(charSequence3)) {
            if (z3) {
                charSequence3 = null;
            } else {
                charSequence3 = this.OooO0oo.OooO0o0;
            }
        }
        setContentDescription(charSequence3);
        CharSequence charSequence4 = this.OooO0oo.OooOOo;
        if (TextUtils.isEmpty(charSequence4)) {
            if (!z3) {
                charSequence2 = this.OooO0oo.OooO0o0;
            }
            AbstractC1137oOOoooO.OooOOOO(this, charSequence2);
            return;
        }
        AbstractC1137oOOoooO.OooOOOO(this, charSequence4);
    }

    @Override // android.widget.TextView, android.view.View
    public CharSequence getAccessibilityClassName() {
        return Button.class.getName();
    }

    @Override // com.ninja.engine.InterfaceC0901oO0ooooo
    public C0892oO0ooO0o getItemData() {
        return this.OooO0oo;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        InterfaceC0885oO0oo0o interfaceC0885oO0oo0o = this.OooOO0O;
        if (interfaceC0885oO0oo0o != null) {
            interfaceC0885oO0oo0o.OooO0OO(this.OooO0oo);
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        this.OooOOO = OooOOO();
        OooOOOO();
    }

    @Override // com.ninja.engine.C1589oo0oOO0, android.widget.TextView, android.view.View
    public final void onMeasure(int i, int i2) {
        int i3;
        int i4;
        boolean z = !TextUtils.isEmpty(getText());
        if (z && (i4 = this.OooOOo0) >= 0) {
            super.setPadding(i4, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
        super.onMeasure(i, i2);
        int mode = View.MeasureSpec.getMode(i);
        int size = View.MeasureSpec.getSize(i);
        int measuredWidth = getMeasuredWidth();
        int i5 = this.OooOOOo;
        if (mode == Integer.MIN_VALUE) {
            i3 = Math.min(size, i5);
        } else {
            i3 = i5;
        }
        if (mode != 1073741824 && i5 > 0 && measuredWidth < i3) {
            super.onMeasure(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), i2);
        }
        if (!z && this.OooOO0 != null) {
            super.setPadding((getMeasuredWidth() - this.OooOO0.getBounds().width()) / 2, getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    @Override // android.widget.TextView, android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        super.onRestoreInstanceState(null);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        C0660o0ooOOo c0660o0ooOOo;
        if (this.OooO0oo.hasSubMenu() && (c0660o0ooOOo = this.OooOO0o) != null && c0660o0ooOOo.onTouch(this, motionEvent)) {
            return true;
        }
        return super.onTouchEvent(motionEvent);
    }

    public void setCheckable(boolean z) {
    }

    public void setChecked(boolean z) {
    }

    public void setExpandedFormat(boolean z) {
        if (this.OooOOOO != z) {
            this.OooOOOO = z;
            C0892oO0ooO0o c0892oO0ooO0o = this.OooO0oo;
            if (c0892oO0ooO0o != null) {
                MenuC0887oO0oo0oo menuC0887oO0oo0oo = c0892oO0ooO0o.OooOOO;
                menuC0887oO0oo0oo.OooOO0O = true;
                menuC0887oO0oo0oo.OooOOOo(true);
            }
        }
    }

    public void setIcon(Drawable drawable) {
        this.OooOO0 = drawable;
        if (drawable != null) {
            int intrinsicWidth = drawable.getIntrinsicWidth();
            int intrinsicHeight = drawable.getIntrinsicHeight();
            int i = this.OooOOo;
            if (intrinsicWidth > i) {
                intrinsicHeight = (int) (intrinsicHeight * (i / intrinsicWidth));
                intrinsicWidth = i;
            }
            if (intrinsicHeight > i) {
                intrinsicWidth = (int) (intrinsicWidth * (i / intrinsicHeight));
            } else {
                i = intrinsicHeight;
            }
            drawable.setBounds(0, 0, intrinsicWidth, i);
        }
        setCompoundDrawables(drawable, null, null, null);
        OooOOOO();
    }

    public void setItemInvoker(InterfaceC0885oO0oo0o interfaceC0885oO0oo0o) {
        this.OooOO0O = interfaceC0885oO0oo0o;
    }

    @Override // android.widget.TextView, android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        this.OooOOo0 = i;
        super.setPadding(i, i2, i3, i4);
    }

    public void setPopupCallback(AbstractC0662o0ooOoO abstractC0662o0ooOoO) {
        this.OooOOO0 = abstractC0662o0ooOoO;
    }

    public void setTitle(CharSequence charSequence) {
        this.OooO = charSequence;
        OooOOOO();
    }
}


