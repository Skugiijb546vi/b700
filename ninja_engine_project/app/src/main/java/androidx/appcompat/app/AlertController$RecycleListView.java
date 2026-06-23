package androidx.appcompat.app;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.widget.ListView;
import com.ninja.engine.AbstractC1039oOOOoo0o;
/* loaded from: classes.dex */
public class AlertController$RecycleListView extends ListView {
    public final int OooO00o;
    public final int OooO0O0;

    public AlertController$RecycleListView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1039oOOOoo0o.OooOo00);
        this.OooO0O0 = obtainStyledAttributes.getDimensionPixelOffset(0, -1);
        this.OooO00o = obtainStyledAttributes.getDimensionPixelOffset(1, -1);
    }
}
