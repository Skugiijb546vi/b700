package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import com.ninja.engine.AbstractC0692o0ooooOo;
/* loaded from: classes.dex */
public class ActivityChooserView$InnerLayout extends LinearLayout {
    public static final int[] OooO00o = {16842964};

    public ActivityChooserView$InnerLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        Drawable drawable;
        int resourceId;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, OooO00o);
        if (obtainStyledAttributes.hasValue(0) && (resourceId = obtainStyledAttributes.getResourceId(0, 0)) != 0) {
            drawable = AbstractC0692o0ooooOo.OooOo0(context, resourceId);
        } else {
            drawable = obtainStyledAttributes.getDrawable(0);
        }
        setBackgroundDrawable(drawable);
        obtainStyledAttributes.recycle();
    }
}
