package com.ninja.engine;

import android.content.res.Configuration;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Typeface;
import android.os.Build;
import android.os.Handler;
import android.os.Looper;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.View;
import android.view.ViewGroup;
import com.android.volley.toolbox.ImageRequest;
import org.xmlpull.v1.XmlPullParser;
/* renamed from: com.ninja.engine.oOOoooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1137oOOoooO {
    public static boolean OooO00o = true;

    public static TypedArray OooO(Resources resources, Resources.Theme theme, AttributeSet attributeSet, int[] iArr) {
        if (theme == null) {
            return resources.obtainAttributes(attributeSet, iArr);
        }
        return theme.obtainStyledAttributes(attributeSet, iArr, 0, 0);
    }

    public static int OooO0O0(C1080oOOoO0O c1080oOOoO0O, AbstractC0462o0OoOoo abstractC0462o0OoOoo, View view, View view2, AbstractC1066oOOo0Oo abstractC1066oOOo0Oo, boolean z) {
        if (abstractC1066oOOo0Oo.OooOo0O() != 0 && c1080oOOoO0O.OooO0O0() != 0 && view != null && view2 != null) {
            if (!z) {
                return Math.abs(AbstractC1066oOOo0Oo.Oooo00o(view) - AbstractC1066oOOo0Oo.Oooo00o(view2)) + 1;
            }
            return Math.min(abstractC0462o0OoOoo.OooOO0o(), abstractC0462o0OoOoo.OooO0O0(view2) - abstractC0462o0OoOoo.OooO0o0(view));
        }
        return 0;
    }

    public static int OooO0OO(C1080oOOoO0O c1080oOOoO0O, AbstractC0462o0OoOoo abstractC0462o0OoOoo, View view, View view2, AbstractC1066oOOo0Oo abstractC1066oOOo0Oo, boolean z, boolean z2) {
        int max;
        if (abstractC1066oOOo0Oo.OooOo0O() == 0 || c1080oOOoO0O.OooO0O0() == 0 || view == null || view2 == null) {
            return 0;
        }
        int min = Math.min(AbstractC1066oOOo0Oo.Oooo00o(view), AbstractC1066oOOo0Oo.Oooo00o(view2));
        int max2 = Math.max(AbstractC1066oOOo0Oo.Oooo00o(view), AbstractC1066oOOo0Oo.Oooo00o(view2));
        if (z2) {
            max = Math.max(0, (c1080oOOoO0O.OooO0O0() - max2) - 1);
        } else {
            max = Math.max(0, min);
        }
        if (!z) {
            return max;
        }
        return Math.round((max * (Math.abs(abstractC0462o0OoOoo.OooO0O0(view2) - abstractC0462o0OoOoo.OooO0o0(view)) / (Math.abs(AbstractC1066oOOo0Oo.Oooo00o(view) - AbstractC1066oOOo0Oo.Oooo00o(view2)) + 1))) + (abstractC0462o0OoOoo.OooOO0O() - abstractC0462o0OoOoo.OooO0o0(view)));
    }

    public static int OooO0Oo(C1080oOOoO0O c1080oOOoO0O, AbstractC0462o0OoOoo abstractC0462o0OoOoo, View view, View view2, AbstractC1066oOOo0Oo abstractC1066oOOo0Oo, boolean z) {
        if (abstractC1066oOOo0Oo.OooOo0O() != 0 && c1080oOOoO0O.OooO0O0() != 0 && view != null && view2 != null) {
            if (!z) {
                return c1080oOOoO0O.OooO0O0();
            }
            return (int) (((abstractC0462o0OoOoo.OooO0O0(view2) - abstractC0462o0OoOoo.OooO0o0(view)) / (Math.abs(AbstractC1066oOOo0Oo.Oooo00o(view) - AbstractC1066oOOo0Oo.Oooo00o(view2)) + 1)) * c1080oOOoO0O.OooO0O0());
        }
        return 0;
    }

    public static String OooO0o(TypedArray typedArray, XmlResourceParser xmlResourceParser, String str, int i) {
        if (!OooO0oO(xmlResourceParser, str)) {
            return null;
        }
        return typedArray.getString(i);
    }

    public static o0O0OO OooO0o0(TypedArray typedArray, XmlPullParser xmlPullParser, Resources.Theme theme, String str, int i) {
        o0O0OO o0o0oo;
        if (OooO0oO(xmlPullParser, str)) {
            TypedValue typedValue = new TypedValue();
            typedArray.getValue(i, typedValue);
            int i2 = typedValue.type;
            if (i2 >= 28 && i2 <= 31) {
                return new o0O0OO(null, null, typedValue.data);
            }
            try {
                o0o0oo = o0O0OO.OooO00o(typedArray.getResourceId(i, 0), theme, typedArray.getResources());
            } catch (Exception unused) {
                o0o0oo = null;
            }
            if (o0o0oo != null) {
                return o0o0oo;
            }
        }
        return new o0O0OO(null, null, 0);
    }

    public static boolean OooO0oO(XmlPullParser xmlPullParser, String str) {
        if (xmlPullParser.getAttributeValue("http://schemas.android.com/apk/res/android", str) != null) {
            return true;
        }
        return false;
    }

    public static Typeface OooO0oo(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        int weight;
        int i3;
        Typeface create;
        if (Build.VERSION.SDK_INT >= 31) {
            i = configuration.fontWeightAdjustment;
            if (i != Integer.MAX_VALUE) {
                i2 = configuration.fontWeightAdjustment;
                if (i2 != 0 && typeface != null) {
                    weight = typeface.getWeight();
                    i3 = configuration.fontWeightAdjustment;
                    create = Typeface.create(typeface, AbstractC0809oO0OooOO.OooOo00(i3 + weight, 1, ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS), typeface.isItalic());
                    return create;
                }
                return null;
            }
            return null;
        }
        return null;
    }

    public static final void OooOO0o(View view, InterfaceC1192oOoOO0OO interfaceC1192oOoOO0OO) {
        AbstractC0809oO0OooOO.OooOOOo(view, "<this>");
        view.setTag(R.id.view_tree_saved_state_registry_owner, interfaceC1192oOoOO0OO);
    }

    public static void OooOOOO(View view, CharSequence charSequence) {
        if (Build.VERSION.SDK_INT >= 26) {
            AbstractC1340oOoooo.OooO00o(view, charSequence);
            return;
        }
        View$OnLongClickListenerC1341oOooooO view$OnLongClickListenerC1341oOooooO = View$OnLongClickListenerC1341oOooooO.OooOO0O;
        if (view$OnLongClickListenerC1341oOooooO != null && view$OnLongClickListenerC1341oOooooO.OooO00o == view) {
            View$OnLongClickListenerC1341oOooooO.OooO0O0(null);
        }
        if (TextUtils.isEmpty(charSequence)) {
            View$OnLongClickListenerC1341oOooooO view$OnLongClickListenerC1341oOooooO2 = View$OnLongClickListenerC1341oOooooO.OooOO0o;
            if (view$OnLongClickListenerC1341oOooooO2 != null && view$OnLongClickListenerC1341oOooooO2.OooO00o == view) {
                view$OnLongClickListenerC1341oOooooO2.OooO00o();
            }
            view.setOnLongClickListener(null);
            view.setLongClickable(false);
            view.setOnHoverListener(null);
            return;
        }
        new View$OnLongClickListenerC1341oOooooO(view, charSequence);
    }

    public static void OooOOo0(ViewGroup viewGroup, boolean z) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1463oo0O0O0O.OooO0O0(viewGroup, z);
        } else if (OooO00o) {
            try {
                AbstractC1463oo0O0O0O.OooO0O0(viewGroup, z);
            } catch (NoSuchMethodError unused) {
                OooO00o = false;
            }
        }
    }

    public void OooO00o(int i) {
        new Handler(Looper.getMainLooper()).post(new RunnableC1138oOOoooO0(i, 0, this));
    }

    public abstract void OooOO0(int i);

    public abstract void OooOO0O(Typeface typeface);

    public abstract void OooOOOo();

    public void OooOOO(boolean z) {
    }

    public void OooOOO0(boolean z) {
    }
}
