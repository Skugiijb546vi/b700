package androidx.appcompat.view.menu;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import com.ninja.engine.C0131o00O0o;
import com.ninja.engine.C0892oO0ooO0o;
import com.ninja.engine.InterfaceC0885oO0oo0o;
import com.ninja.engine.MenuC0887oO0oo0oo;
import com.ninja.engine.oO;
/* loaded from: classes.dex */
public final class ExpandedMenuView extends ListView implements InterfaceC0885oO0oo0o, oO, AdapterView.OnItemClickListener {
    public static final int[] OooO0O0 = {16842964, 16843049};
    public MenuC0887oO0oo0oo OooO00o;

    public ExpandedMenuView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setOnItemClickListener(this);
        C0131o00O0o Oooo0O0 = C0131o00O0o.Oooo0O0(context, attributeSet, OooO0O0, 16842868, 0);
        TypedArray typedArray = (TypedArray) Oooo0O0.OooO0O0;
        if (typedArray.hasValue(0)) {
            setBackgroundDrawable(Oooo0O0.OooOo0o(0));
        }
        if (typedArray.hasValue(1)) {
            setDivider(Oooo0O0.OooOo0o(1));
        }
        Oooo0O0.Oooo0o0();
    }

    @Override // com.ninja.engine.oO
    public final void OooO00o(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        this.OooO00o = menuC0887oO0oo0oo;
    }

    @Override // com.ninja.engine.InterfaceC0885oO0oo0o
    public final boolean OooO0OO(C0892oO0ooO0o c0892oO0ooO0o) {
        return this.OooO00o.OooOOo0(c0892oO0ooO0o, null, 0);
    }

    public int getWindowAnimations() {
        return 0;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        setChildrenDrawingCacheEnabled(false);
    }

    @Override // android.widget.AdapterView.OnItemClickListener
    public final void onItemClick(AdapterView adapterView, View view, int i, long j) {
        OooO0OO((C0892oO0ooO0o) getAdapter().getItem(i));
    }
}
