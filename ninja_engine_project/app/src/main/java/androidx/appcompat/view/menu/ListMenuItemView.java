package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RadioButton;
import android.widget.TextView;
import com.ninja.engine.AbstractC1039oOOOoo0o;
import com.ninja.engine.C0131o00O0o;
import com.ninja.engine.C0892oO0ooO0o;
import com.ninja.engine.InterfaceC0901oO0ooooo;
import com.ninja.engine.R;
/* loaded from: classes.dex */
public class ListMenuItemView extends LinearLayout implements InterfaceC0901oO0ooooo, AbsListView.SelectionBoundsAdjuster {
    public LinearLayout OooO;
    public C0892oO0ooO0o OooO00o;
    public ImageView OooO0O0;
    public RadioButton OooO0OO;
    public TextView OooO0Oo;
    public TextView OooO0o;
    public CheckBox OooO0o0;
    public ImageView OooO0oO;
    public ImageView OooO0oo;
    public final Drawable OooOO0;
    public final int OooOO0O;
    public final Context OooOO0o;
    public final Drawable OooOOO;
    public boolean OooOOO0;
    public final boolean OooOOOO;
    public LayoutInflater OooOOOo;
    public boolean OooOOo0;

    public ListMenuItemView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        C0131o00O0o Oooo0O0 = C0131o00O0o.Oooo0O0(getContext(), attributeSet, AbstractC1039oOOOoo0o.OooOOo, R.attr.listMenuViewStyle, 0);
        this.OooOO0 = Oooo0O0.OooOo0o(5);
        TypedArray typedArray = (TypedArray) Oooo0O0.OooO0O0;
        this.OooOO0O = typedArray.getResourceId(1, -1);
        this.OooOOO0 = typedArray.getBoolean(7, false);
        this.OooOO0o = context;
        this.OooOOO = Oooo0O0.OooOo0o(8);
        TypedArray obtainStyledAttributes = context.getTheme().obtainStyledAttributes(null, new int[]{16843049}, R.attr.dropDownListViewStyle, 0);
        this.OooOOOO = obtainStyledAttributes.hasValue(0);
        Oooo0O0.Oooo0o0();
        obtainStyledAttributes.recycle();
    }

    private LayoutInflater getInflater() {
        if (this.OooOOOo == null) {
            this.OooOOOo = LayoutInflater.from(getContext());
        }
        return this.OooOOOo;
    }

    private void setSubMenuArrowVisible(boolean z) {
        ImageView imageView = this.OooO0oO;
        if (imageView != null) {
            imageView.setVisibility(z ? 0 : 8);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x005c, code lost:
        if (r0 == false) goto L56;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0063  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x011a  */
    @Override // com.ninja.engine.InterfaceC0901oO0ooooo
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooO0O0(com.ninja.engine.C0892oO0ooO0o r11) {
        /*
            Method dump skipped, instructions count: 314
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.appcompat.view.menu.ListMenuItemView.OooO0O0(com.ninja.engine.oO0ooO0o):void");
    }

    @Override // android.widget.AbsListView.SelectionBoundsAdjuster
    public final void adjustListItemSelectionBounds(Rect rect) {
        ImageView imageView = this.OooO0oo;
        if (imageView == null || imageView.getVisibility() != 0) {
            return;
        }
        LinearLayout.LayoutParams layoutParams = (LinearLayout.LayoutParams) this.OooO0oo.getLayoutParams();
        rect.top = this.OooO0oo.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin + rect.top;
    }

    @Override // com.ninja.engine.InterfaceC0901oO0ooooo
    public C0892oO0ooO0o getItemData() {
        return this.OooO00o;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setBackground(this.OooOO0);
        TextView textView = (TextView) findViewById(R.id.title);
        this.OooO0Oo = textView;
        int i = this.OooOO0O;
        if (i != -1) {
            textView.setTextAppearance(this.OooOO0o, i);
        }
        this.OooO0o = (TextView) findViewById(R.id.shortcut);
        ImageView imageView = (ImageView) findViewById(R.id.submenuarrow);
        this.OooO0oO = imageView;
        if (imageView != null) {
            imageView.setImageDrawable(this.OooOOO);
        }
        this.OooO0oo = (ImageView) findViewById(R.id.group_divider);
        this.OooO = (LinearLayout) findViewById(R.id.content);
    }

    @Override // android.widget.LinearLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        if (this.OooO0O0 != null && this.OooOOO0) {
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) this.OooO0O0.getLayoutParams();
            int i3 = layoutParams.height;
            if (i3 > 0 && layoutParams2.width <= 0) {
                layoutParams2.width = i3;
            }
        }
        super.onMeasure(i, i2);
    }

    public void setCheckable(boolean z) {
        CompoundButton compoundButton;
        View view;
        if (!z && this.OooO0OO == null && this.OooO0o0 == null) {
            return;
        }
        if ((this.OooO00o.OooOo & 4) != 0) {
            if (this.OooO0OO == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.OooO0OO = radioButton;
                LinearLayout linearLayout = this.OooO;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.OooO0OO;
            view = this.OooO0o0;
        } else {
            if (this.OooO0o0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.OooO0o0 = checkBox;
                LinearLayout linearLayout2 = this.OooO;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.OooO0o0;
            view = this.OooO0OO;
        }
        if (z) {
            compoundButton.setChecked(this.OooO00o.isChecked());
            if (compoundButton.getVisibility() != 0) {
                compoundButton.setVisibility(0);
            }
            if (view != null && view.getVisibility() != 8) {
                view.setVisibility(8);
                return;
            }
            return;
        }
        CheckBox checkBox2 = this.OooO0o0;
        if (checkBox2 != null) {
            checkBox2.setVisibility(8);
        }
        RadioButton radioButton2 = this.OooO0OO;
        if (radioButton2 != null) {
            radioButton2.setVisibility(8);
        }
    }

    public void setChecked(boolean z) {
        CompoundButton compoundButton;
        if ((this.OooO00o.OooOo & 4) != 0) {
            if (this.OooO0OO == null) {
                RadioButton radioButton = (RadioButton) getInflater().inflate(R.layout.abc_list_menu_item_radio, (ViewGroup) this, false);
                this.OooO0OO = radioButton;
                LinearLayout linearLayout = this.OooO;
                if (linearLayout != null) {
                    linearLayout.addView(radioButton, -1);
                } else {
                    addView(radioButton, -1);
                }
            }
            compoundButton = this.OooO0OO;
        } else {
            if (this.OooO0o0 == null) {
                CheckBox checkBox = (CheckBox) getInflater().inflate(R.layout.abc_list_menu_item_checkbox, (ViewGroup) this, false);
                this.OooO0o0 = checkBox;
                LinearLayout linearLayout2 = this.OooO;
                if (linearLayout2 != null) {
                    linearLayout2.addView(checkBox, -1);
                } else {
                    addView(checkBox, -1);
                }
            }
            compoundButton = this.OooO0o0;
        }
        compoundButton.setChecked(z);
    }

    public void setForceShowIcon(boolean z) {
        this.OooOOo0 = z;
        this.OooOOO0 = z;
    }

    public void setGroupDividerEnabled(boolean z) {
        ImageView imageView = this.OooO0oo;
        if (imageView != null) {
            imageView.setVisibility((this.OooOOOO || !z) ? 8 : 0);
        }
    }

    public void setIcon(Drawable drawable) {
        this.OooO00o.OooOOO.getClass();
        boolean z = this.OooOOo0;
        if (!z && !this.OooOOO0) {
            return;
        }
        ImageView imageView = this.OooO0O0;
        if (imageView == null && drawable == null && !this.OooOOO0) {
            return;
        }
        if (imageView == null) {
            ImageView imageView2 = (ImageView) getInflater().inflate(R.layout.abc_list_menu_item_icon, (ViewGroup) this, false);
            this.OooO0O0 = imageView2;
            LinearLayout linearLayout = this.OooO;
            if (linearLayout != null) {
                linearLayout.addView(imageView2, 0);
            } else {
                addView(imageView2, 0);
            }
        }
        if (drawable == null && !this.OooOOO0) {
            this.OooO0O0.setVisibility(8);
            return;
        }
        ImageView imageView3 = this.OooO0O0;
        if (!z) {
            drawable = null;
        }
        imageView3.setImageDrawable(drawable);
        if (this.OooO0O0.getVisibility() != 0) {
            this.OooO0O0.setVisibility(0);
        }
    }

    public void setTitle(CharSequence charSequence) {
        int i;
        TextView textView;
        if (charSequence != null) {
            this.OooO0Oo.setText(charSequence);
            if (this.OooO0Oo.getVisibility() == 0) {
                return;
            }
            textView = this.OooO0Oo;
            i = 0;
        } else {
            i = 8;
            if (this.OooO0Oo.getVisibility() == 8) {
                return;
            }
            textView = this.OooO0Oo;
        }
        textView.setVisibility(i);
    }
}
