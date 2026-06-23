package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.util.SparseIntArray;
import android.view.View;
import android.view.ViewGroup;
import com.app.framework.core.system.JarConfig;
import com.app.framework.proxy.ProxyManifest;
import com.ninja.engine.AbstractC0307o0O0Ooo;
import com.ninja.engine.AbstractC0308o0O0Ooo0;
import com.ninja.engine.AbstractC0318o0O0o0oO;
import com.ninja.engine.AbstractC1031oOOOoOOo;
import com.ninja.engine.C0240o00oOo0o;
import com.ninja.engine.C0309o0O0OooO;
import com.ninja.engine.C0311o0O0o00;
import com.ninja.engine.C0316o0O0o0o;
import com.ninja.engine.C0317o0O0o0o0;
import com.ninja.engine.C0415o0Oo0O0O;
import com.ninja.engine.C0580o0oOo0O0;
import com.ninja.engine.C0698oO0000oO;
import com.ninja.engine.C0699oO0000oo;
import com.ninja.engine.C1215oOoOOoO0;
import com.ninja.engine.o0O0o000;
import com.ninja.engine.oO0OO0O;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import org.xmlpull.v1.XmlPullParserException;
/* loaded from: classes.dex */
public class ConstraintLayout extends ViewGroup {
    public static C1215oOoOOoO0 OooOOOo;
    public int OooO;
    public final SparseArray OooO00o;
    public final ArrayList OooO0O0;
    public final C0580o0oOo0O0 OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public boolean OooO0oo;
    public C0317o0O0o0o0 OooOO0;
    public C0415o0Oo0O0O OooOO0O;
    public int OooOO0o;
    public final SparseArray OooOOO;
    public HashMap OooOOO0;
    public final o0O0o000 OooOOOO;

    public ConstraintLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO00o = new SparseArray();
        this.OooO0O0 = new ArrayList(4);
        this.OooO0OO = new C0580o0oOo0O0();
        this.OooO0Oo = 0;
        this.OooO0o0 = 0;
        this.OooO0o = Integer.MAX_VALUE;
        this.OooO0oO = Integer.MAX_VALUE;
        this.OooO0oo = true;
        this.OooO = 257;
        this.OooOO0 = null;
        this.OooOO0O = null;
        this.OooOO0o = -1;
        this.OooOOO0 = new HashMap();
        this.OooOOO = new SparseArray();
        this.OooOOOO = new o0O0o000(this, this);
        OooO(attributeSet, 0);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.o0O0OooO, android.view.ViewGroup$MarginLayoutParams] */
    public static C0309o0O0OooO OooO0oO() {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.OooO00o = -1;
        marginLayoutParams.OooO0O0 = -1;
        marginLayoutParams.OooO0OO = -1.0f;
        marginLayoutParams.OooO0Oo = true;
        marginLayoutParams.OooO0o0 = -1;
        marginLayoutParams.OooO0o = -1;
        marginLayoutParams.OooO0oO = -1;
        marginLayoutParams.OooO0oo = -1;
        marginLayoutParams.OooO = -1;
        marginLayoutParams.OooOO0 = -1;
        marginLayoutParams.OooOO0O = -1;
        marginLayoutParams.OooOO0o = -1;
        marginLayoutParams.OooOOO0 = -1;
        marginLayoutParams.OooOOO = -1;
        marginLayoutParams.OooOOOO = -1;
        marginLayoutParams.OooOOOo = -1;
        marginLayoutParams.OooOOo0 = 0;
        marginLayoutParams.OooOOo = 0.0f;
        marginLayoutParams.OooOOoo = -1;
        marginLayoutParams.OooOo00 = -1;
        marginLayoutParams.OooOo0 = -1;
        marginLayoutParams.OooOo0O = -1;
        marginLayoutParams.OooOo0o = Integer.MIN_VALUE;
        marginLayoutParams.OooOo = Integer.MIN_VALUE;
        marginLayoutParams.OooOoO0 = Integer.MIN_VALUE;
        marginLayoutParams.OooOoO = Integer.MIN_VALUE;
        marginLayoutParams.OooOoOO = Integer.MIN_VALUE;
        marginLayoutParams.OooOoo0 = Integer.MIN_VALUE;
        marginLayoutParams.OooOoo = Integer.MIN_VALUE;
        marginLayoutParams.OooOooO = 0;
        marginLayoutParams.OooOooo = 0.5f;
        marginLayoutParams.Oooo000 = 0.5f;
        marginLayoutParams.Oooo00O = null;
        marginLayoutParams.Oooo00o = -1.0f;
        marginLayoutParams.Oooo0 = -1.0f;
        marginLayoutParams.Oooo0O0 = 0;
        marginLayoutParams.Oooo0OO = 0;
        marginLayoutParams.Oooo0o0 = 0;
        marginLayoutParams.Oooo0o = 0;
        marginLayoutParams.Oooo0oO = 0;
        marginLayoutParams.Oooo0oo = 0;
        marginLayoutParams.Oooo = 0;
        marginLayoutParams.OoooO00 = 0;
        marginLayoutParams.OoooO0 = 1.0f;
        marginLayoutParams.OoooO0O = 1.0f;
        marginLayoutParams.OoooO = -1;
        marginLayoutParams.OoooOO0 = -1;
        marginLayoutParams.o000oOoO = -1;
        marginLayoutParams.OoooOOO = false;
        marginLayoutParams.OoooOOo = false;
        marginLayoutParams.OoooOo0 = null;
        marginLayoutParams.OoooOoO = 0;
        marginLayoutParams.OoooOoo = true;
        marginLayoutParams.Ooooo00 = true;
        marginLayoutParams.Ooooo0o = false;
        marginLayoutParams.OooooO0 = false;
        marginLayoutParams.OooooOO = false;
        marginLayoutParams.OooooOo = -1;
        marginLayoutParams.Oooooo0 = -1;
        marginLayoutParams.Oooooo = -1;
        marginLayoutParams.OoooooO = -1;
        marginLayoutParams.Ooooooo = Integer.MIN_VALUE;
        marginLayoutParams.o0OoOo0 = Integer.MIN_VALUE;
        marginLayoutParams.ooOO = 0.5f;
        marginLayoutParams.o00o0O = new C0316o0O0o0o();
        return marginLayoutParams;
    }

    private int getPaddingWidth() {
        int max = Math.max(0, getPaddingRight()) + Math.max(0, getPaddingLeft());
        int max2 = Math.max(0, getPaddingEnd()) + Math.max(0, getPaddingStart());
        return max2 > 0 ? max2 : max;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [com.ninja.engine.oOoOOoO0, java.lang.Object] */
    public static C1215oOoOOoO0 getSharedValues() {
        if (OooOOOo == null) {
            Object obj = new Object();
            new SparseIntArray();
            new HashMap();
            OooOOOo = obj;
        }
        return OooOOOo;
    }

    public final void OooO(AttributeSet attributeSet, int i) {
        C0580o0oOo0O0 c0580o0oOo0O0 = this.OooO0OO;
        c0580o0oOo0O0.OooooOo = this;
        o0O0o000 o0o0o000 = this.OooOOOO;
        c0580o0oOo0O0.o0ooOO0 = o0o0o000;
        c0580o0oOo0O0.o00oO0o.OooO0o = o0o0o000;
        this.OooO00o.put(getId(), this);
        this.OooOO0 = null;
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, AbstractC1031oOOOoOOo.OooO0O0, i, 0);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i2 = 0; i2 < indexCount; i2++) {
                int index = obtainStyledAttributes.getIndex(i2);
                if (index == 16) {
                    this.OooO0Oo = obtainStyledAttributes.getDimensionPixelOffset(index, this.OooO0Oo);
                } else if (index == 17) {
                    this.OooO0o0 = obtainStyledAttributes.getDimensionPixelOffset(index, this.OooO0o0);
                } else if (index == 14) {
                    this.OooO0o = obtainStyledAttributes.getDimensionPixelOffset(index, this.OooO0o);
                } else if (index == 15) {
                    this.OooO0oO = obtainStyledAttributes.getDimensionPixelOffset(index, this.OooO0oO);
                } else if (index == 113) {
                    this.OooO = obtainStyledAttributes.getInt(index, this.OooO);
                } else if (index == 56) {
                    int resourceId = obtainStyledAttributes.getResourceId(index, 0);
                    if (resourceId != 0) {
                        try {
                            OooOO0(resourceId);
                        } catch (Resources.NotFoundException unused) {
                            this.OooOO0O = null;
                        }
                    }
                } else if (index == 34) {
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, 0);
                    try {
                        C0317o0O0o0o0 c0317o0O0o0o0 = new C0317o0O0o0o0();
                        this.OooOO0 = c0317o0O0o0o0;
                        c0317o0O0o0o0.OooO0o0(getContext(), resourceId2);
                    } catch (Resources.NotFoundException unused2) {
                        this.OooOO0 = null;
                    }
                    this.OooOO0o = resourceId2;
                }
            }
            obtainStyledAttributes.recycle();
        }
        c0580o0oOo0O0.o000000 = this.OooO;
        oO0OO0O.OooOOo0 = c0580o0oOo0O0.OoooOOO(512);
    }

    public final C0316o0O0o0o OooO0oo(View view) {
        if (view == this) {
            return this.OooO0OO;
        }
        if (view != null) {
            if (!(view.getLayoutParams() instanceof C0309o0O0OooO)) {
                view.setLayoutParams(generateLayoutParams(view.getLayoutParams()));
                if (!(view.getLayoutParams() instanceof C0309o0O0OooO)) {
                    return null;
                }
            }
            return ((C0309o0O0OooO) view.getLayoutParams()).o00o0O;
        }
        return null;
    }

    public final void OooOO0(int i) {
        int eventType;
        C0240o00oOo0o c0240o00oOo0o;
        Context context = getContext();
        C0415o0Oo0O0O c0415o0Oo0O0O = new C0415o0Oo0O0O(11, false);
        c0415o0Oo0O0O.OooO0O0 = new SparseArray();
        c0415o0Oo0O0O.OooO0OO = new SparseArray();
        XmlResourceParser xml = context.getResources().getXml(i);
        try {
            eventType = xml.getEventType();
            c0240o00oOo0o = null;
        } catch (IOException | XmlPullParserException unused) {
        }
        while (true) {
            char c = 1;
            if (eventType != 1) {
                if (eventType != 2) {
                    continue;
                } else {
                    String name = xml.getName();
                    switch (name.hashCode()) {
                        case -1349929691:
                            if (name.equals("ConstraintSet")) {
                                c = 4;
                                break;
                            }
                            c = 65535;
                            break;
                        case 80204913:
                            if (name.equals("State")) {
                                c = 2;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1382829617:
                            if (name.equals("StateSet")) {
                                break;
                            }
                            c = 65535;
                            break;
                        case 1657696882:
                            if (name.equals("layoutDescription")) {
                                c = 0;
                                break;
                            }
                            c = 65535;
                            break;
                        case 1901439077:
                            if (name.equals("Variant")) {
                                c = 3;
                                break;
                            }
                            c = 65535;
                            break;
                        default:
                            c = 65535;
                            break;
                    }
                    if (c != 2) {
                        if (c != 3) {
                            if (c != 4) {
                                continue;
                            } else {
                                c0415o0Oo0O0O.Oooo0O0(context, xml);
                                continue;
                            }
                        } else {
                            C0311o0O0o00 c0311o0O0o00 = new C0311o0O0o00(context, xml);
                            if (c0240o00oOo0o != null) {
                                ((ArrayList) c0240o00oOo0o.OooO0OO).add(c0311o0O0o00);
                                continue;
                            } else {
                                continue;
                            }
                        }
                    } else {
                        C0240o00oOo0o c0240o00oOo0o2 = new C0240o00oOo0o(context, xml);
                        ((SparseArray) c0415o0Oo0O0O.OooO0O0).put(c0240o00oOo0o2.OooO00o, c0240o00oOo0o2);
                        c0240o00oOo0o = c0240o00oOo0o2;
                        continue;
                    }
                }
                eventType = xml.next();
            } else {
                this.OooOO0O = c0415o0Oo0O0O;
                return;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:104:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:166:0x0321  */
    /* JADX WARN: Removed duplicated region for block: B:175:0x033e  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x041d  */
    /* JADX WARN: Removed duplicated region for block: B:222:0x0429  */
    /* JADX WARN: Removed duplicated region for block: B:226:0x0430  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00ad  */
    /* JADX WARN: Removed duplicated region for block: B:286:0x04cc  */
    /* JADX WARN: Removed duplicated region for block: B:298:0x050c  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0511  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00cb  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00dc  */
    /* JADX WARN: Removed duplicated region for block: B:419:0x04d0 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0118  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x011f  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x0122  */
    /* JADX WARN: Removed duplicated region for block: B:55:0x0147  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0154  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b4 A[ADDED_TO_REGION] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void OooOO0O(com.ninja.engine.C0580o0oOo0O0 r26, int r27, int r28, int r29) {
        /*
            Method dump skipped, instructions count: 1736
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.OooOO0O(com.ninja.engine.o0oOo0O0, int, int, int):void");
    }

    public final void OooOO0o(C0316o0O0o0o c0316o0O0o0o, C0309o0O0OooO c0309o0O0OooO, SparseArray sparseArray, int i, int i2) {
        View view = (View) this.OooO00o.get(i);
        C0316o0O0o0o c0316o0O0o0o2 = (C0316o0O0o0o) sparseArray.get(i);
        if (c0316o0O0o0o2 != null && view != null && (view.getLayoutParams() instanceof C0309o0O0OooO)) {
            c0309o0O0OooO.Ooooo0o = true;
            if (i2 == 6) {
                C0309o0O0OooO c0309o0O0OooO2 = (C0309o0O0OooO) view.getLayoutParams();
                c0309o0O0OooO2.Ooooo0o = true;
                c0309o0O0OooO2.o00o0O.OooOooo = true;
            }
            c0316o0O0o0o.OooO(6).OooO0O0(c0316o0O0o0o2.OooO(i2), c0309o0O0OooO.OooOooO, c0309o0O0OooO.OooOoo, true);
            c0316o0O0o0o.OooOooo = true;
            c0316o0O0o0o.OooO(3).OooOO0();
            c0316o0O0o0o.OooO(5).OooOO0();
        }
    }

    @Override // android.view.ViewGroup
    public final boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof C0309o0O0OooO;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Object tag;
        int size;
        ArrayList arrayList = this.OooO0O0;
        if (arrayList != null && (size = arrayList.size()) > 0) {
            for (int i = 0; i < size; i++) {
                ((AbstractC0308o0O0Ooo0) arrayList.get(i)).getClass();
            }
        }
        super.dispatchDraw(canvas);
        if (isInEditMode()) {
            float width = getWidth();
            float height = getHeight();
            int childCount = getChildCount();
            for (int i2 = 0; i2 < childCount; i2++) {
                View childAt = getChildAt(i2);
                if (childAt.getVisibility() != 8 && (tag = childAt.getTag()) != null && (tag instanceof String)) {
                    String[] split = ((String) tag).split(",");
                    if (split.length == 4) {
                        int parseInt = Integer.parseInt(split[0]);
                        int parseInt2 = Integer.parseInt(split[1]);
                        int parseInt3 = Integer.parseInt(split[2]);
                        int i3 = (int) ((parseInt / 1080.0f) * width);
                        int i4 = (int) ((parseInt2 / 1920.0f) * height);
                        Paint paint = new Paint();
                        paint.setColor(-65536);
                        float f = i3;
                        float f2 = i4;
                        float f3 = i3 + ((int) ((parseInt3 / 1080.0f) * width));
                        canvas.drawLine(f, f2, f3, f2, paint);
                        float parseInt4 = i4 + ((int) ((Integer.parseInt(split[3]) / 1920.0f) * height));
                        canvas.drawLine(f3, f2, f3, parseInt4, paint);
                        canvas.drawLine(f3, parseInt4, f, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f, f2, paint);
                        paint.setColor(-16711936);
                        canvas.drawLine(f, f2, f3, parseInt4, paint);
                        canvas.drawLine(f, parseInt4, f3, f2, paint);
                    }
                }
            }
        }
    }

    @Override // android.view.View
    public final void forceLayout() {
        this.OooO0oo = true;
        super.forceLayout();
    }

    @Override // android.view.ViewGroup
    public final /* bridge */ /* synthetic */ ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return OooO0oO();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.o0O0OooO, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams, java.lang.Object] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(context, attributeSet);
        marginLayoutParams.OooO00o = -1;
        marginLayoutParams.OooO0O0 = -1;
        marginLayoutParams.OooO0OO = -1.0f;
        marginLayoutParams.OooO0Oo = true;
        marginLayoutParams.OooO0o0 = -1;
        marginLayoutParams.OooO0o = -1;
        marginLayoutParams.OooO0oO = -1;
        marginLayoutParams.OooO0oo = -1;
        marginLayoutParams.OooO = -1;
        marginLayoutParams.OooOO0 = -1;
        marginLayoutParams.OooOO0O = -1;
        marginLayoutParams.OooOO0o = -1;
        marginLayoutParams.OooOOO0 = -1;
        marginLayoutParams.OooOOO = -1;
        marginLayoutParams.OooOOOO = -1;
        marginLayoutParams.OooOOOo = -1;
        marginLayoutParams.OooOOo0 = 0;
        marginLayoutParams.OooOOo = 0.0f;
        marginLayoutParams.OooOOoo = -1;
        marginLayoutParams.OooOo00 = -1;
        marginLayoutParams.OooOo0 = -1;
        marginLayoutParams.OooOo0O = -1;
        marginLayoutParams.OooOo0o = Integer.MIN_VALUE;
        marginLayoutParams.OooOo = Integer.MIN_VALUE;
        marginLayoutParams.OooOoO0 = Integer.MIN_VALUE;
        marginLayoutParams.OooOoO = Integer.MIN_VALUE;
        marginLayoutParams.OooOoOO = Integer.MIN_VALUE;
        marginLayoutParams.OooOoo0 = Integer.MIN_VALUE;
        marginLayoutParams.OooOoo = Integer.MIN_VALUE;
        marginLayoutParams.OooOooO = 0;
        marginLayoutParams.OooOooo = 0.5f;
        marginLayoutParams.Oooo000 = 0.5f;
        marginLayoutParams.Oooo00O = null;
        marginLayoutParams.Oooo00o = -1.0f;
        marginLayoutParams.Oooo0 = -1.0f;
        marginLayoutParams.Oooo0O0 = 0;
        marginLayoutParams.Oooo0OO = 0;
        marginLayoutParams.Oooo0o0 = 0;
        marginLayoutParams.Oooo0o = 0;
        marginLayoutParams.Oooo0oO = 0;
        marginLayoutParams.Oooo0oo = 0;
        marginLayoutParams.Oooo = 0;
        marginLayoutParams.OoooO00 = 0;
        marginLayoutParams.OoooO0 = 1.0f;
        marginLayoutParams.OoooO0O = 1.0f;
        marginLayoutParams.OoooO = -1;
        marginLayoutParams.OoooOO0 = -1;
        marginLayoutParams.o000oOoO = -1;
        marginLayoutParams.OoooOOO = false;
        marginLayoutParams.OoooOOo = false;
        marginLayoutParams.OoooOo0 = null;
        marginLayoutParams.OoooOoO = 0;
        marginLayoutParams.OoooOoo = true;
        marginLayoutParams.Ooooo00 = true;
        marginLayoutParams.Ooooo0o = false;
        marginLayoutParams.OooooO0 = false;
        marginLayoutParams.OooooOO = false;
        marginLayoutParams.OooooOo = -1;
        marginLayoutParams.Oooooo0 = -1;
        marginLayoutParams.Oooooo = -1;
        marginLayoutParams.OoooooO = -1;
        marginLayoutParams.Ooooooo = Integer.MIN_VALUE;
        marginLayoutParams.o0OoOo0 = Integer.MIN_VALUE;
        marginLayoutParams.ooOO = 0.5f;
        marginLayoutParams.o00o0O = new C0316o0O0o0o();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, AbstractC1031oOOOoOOo.OooO0O0);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            int i2 = AbstractC0307o0O0Ooo.OooO00o.get(index);
            switch (i2) {
                case 1:
                    marginLayoutParams.o000oOoO = obtainStyledAttributes.getInt(index, marginLayoutParams.o000oOoO);
                    break;
                case 2:
                    int resourceId = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooOOOo);
                    marginLayoutParams.OooOOOo = resourceId;
                    if (resourceId == -1) {
                        marginLayoutParams.OooOOOo = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 3:
                    marginLayoutParams.OooOOo0 = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.OooOOo0);
                    break;
                case 4:
                    float f = obtainStyledAttributes.getFloat(index, marginLayoutParams.OooOOo) % 360.0f;
                    marginLayoutParams.OooOOo = f;
                    if (f < 0.0f) {
                        marginLayoutParams.OooOOo = (360.0f - f) % 360.0f;
                        break;
                    } else {
                        break;
                    }
                case 5:
                    marginLayoutParams.OooO00o = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.OooO00o);
                    break;
                case 6:
                    marginLayoutParams.OooO0O0 = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.OooO0O0);
                    break;
                case 7:
                    marginLayoutParams.OooO0OO = obtainStyledAttributes.getFloat(index, marginLayoutParams.OooO0OO);
                    break;
                case 8:
                    int resourceId2 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooO0o0);
                    marginLayoutParams.OooO0o0 = resourceId2;
                    if (resourceId2 == -1) {
                        marginLayoutParams.OooO0o0 = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 9:
                    int resourceId3 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooO0o);
                    marginLayoutParams.OooO0o = resourceId3;
                    if (resourceId3 == -1) {
                        marginLayoutParams.OooO0o = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case JarConfig.MAX_CACHE_SIZE /* 10 */:
                    int resourceId4 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooO0oO);
                    marginLayoutParams.OooO0oO = resourceId4;
                    if (resourceId4 == -1) {
                        marginLayoutParams.OooO0oO = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 11:
                    int resourceId5 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooO0oo);
                    marginLayoutParams.OooO0oo = resourceId5;
                    if (resourceId5 == -1) {
                        marginLayoutParams.OooO0oo = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 12:
                    int resourceId6 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooO);
                    marginLayoutParams.OooO = resourceId6;
                    if (resourceId6 == -1) {
                        marginLayoutParams.OooO = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 13:
                    int resourceId7 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooOO0);
                    marginLayoutParams.OooOO0 = resourceId7;
                    if (resourceId7 == -1) {
                        marginLayoutParams.OooOO0 = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 14:
                    int resourceId8 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooOO0O);
                    marginLayoutParams.OooOO0O = resourceId8;
                    if (resourceId8 == -1) {
                        marginLayoutParams.OooOO0O = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 15:
                    int resourceId9 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooOO0o);
                    marginLayoutParams.OooOO0o = resourceId9;
                    if (resourceId9 == -1) {
                        marginLayoutParams.OooOO0o = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 16:
                    int resourceId10 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooOOO0);
                    marginLayoutParams.OooOOO0 = resourceId10;
                    if (resourceId10 == -1) {
                        marginLayoutParams.OooOOO0 = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 17:
                    int resourceId11 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooOOoo);
                    marginLayoutParams.OooOOoo = resourceId11;
                    if (resourceId11 == -1) {
                        marginLayoutParams.OooOOoo = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 18:
                    int resourceId12 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooOo00);
                    marginLayoutParams.OooOo00 = resourceId12;
                    if (resourceId12 == -1) {
                        marginLayoutParams.OooOo00 = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 19:
                    int resourceId13 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooOo0);
                    marginLayoutParams.OooOo0 = resourceId13;
                    if (resourceId13 == -1) {
                        marginLayoutParams.OooOo0 = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 20:
                    int resourceId14 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooOo0O);
                    marginLayoutParams.OooOo0O = resourceId14;
                    if (resourceId14 == -1) {
                        marginLayoutParams.OooOo0O = obtainStyledAttributes.getInt(index, -1);
                        break;
                    } else {
                        break;
                    }
                case 21:
                    marginLayoutParams.OooOo0o = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.OooOo0o);
                    break;
                case 22:
                    marginLayoutParams.OooOo = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.OooOo);
                    break;
                case 23:
                    marginLayoutParams.OooOoO0 = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.OooOoO0);
                    break;
                case 24:
                    marginLayoutParams.OooOoO = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.OooOoO);
                    break;
                case 25:
                    marginLayoutParams.OooOoOO = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.OooOoOO);
                    break;
                case 26:
                    marginLayoutParams.OooOoo0 = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.OooOoo0);
                    break;
                case 27:
                    marginLayoutParams.OoooOOO = obtainStyledAttributes.getBoolean(index, marginLayoutParams.OoooOOO);
                    break;
                case 28:
                    marginLayoutParams.OoooOOo = obtainStyledAttributes.getBoolean(index, marginLayoutParams.OoooOOo);
                    break;
                case 29:
                    marginLayoutParams.OooOooo = obtainStyledAttributes.getFloat(index, marginLayoutParams.OooOooo);
                    break;
                case 30:
                    marginLayoutParams.Oooo000 = obtainStyledAttributes.getFloat(index, marginLayoutParams.Oooo000);
                    break;
                case 31:
                    marginLayoutParams.Oooo0o0 = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 32:
                    marginLayoutParams.Oooo0o = obtainStyledAttributes.getInt(index, 0);
                    break;
                case 33:
                    try {
                        marginLayoutParams.Oooo0oO = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.Oooo0oO);
                        break;
                    } catch (Exception unused) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.Oooo0oO) == -2) {
                            marginLayoutParams.Oooo0oO = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 34:
                    try {
                        marginLayoutParams.Oooo = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.Oooo);
                        break;
                    } catch (Exception unused2) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.Oooo) == -2) {
                            marginLayoutParams.Oooo = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 35:
                    marginLayoutParams.OoooO0 = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.OoooO0));
                    marginLayoutParams.Oooo0o0 = 2;
                    break;
                case 36:
                    try {
                        marginLayoutParams.Oooo0oo = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.Oooo0oo);
                        break;
                    } catch (Exception unused3) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.Oooo0oo) == -2) {
                            marginLayoutParams.Oooo0oo = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 37:
                    try {
                        marginLayoutParams.OoooO00 = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.OoooO00);
                        break;
                    } catch (Exception unused4) {
                        if (obtainStyledAttributes.getInt(index, marginLayoutParams.OoooO00) == -2) {
                            marginLayoutParams.OoooO00 = -2;
                            break;
                        } else {
                            break;
                        }
                    }
                case 38:
                    marginLayoutParams.OoooO0O = Math.max(0.0f, obtainStyledAttributes.getFloat(index, marginLayoutParams.OoooO0O));
                    marginLayoutParams.Oooo0o = 2;
                    break;
                default:
                    switch (i2) {
                        case 44:
                            C0317o0O0o0o0.OooO0oo(marginLayoutParams, obtainStyledAttributes.getString(index));
                            continue;
                        case 45:
                            marginLayoutParams.Oooo00o = obtainStyledAttributes.getFloat(index, marginLayoutParams.Oooo00o);
                            continue;
                        case 46:
                            marginLayoutParams.Oooo0 = obtainStyledAttributes.getFloat(index, marginLayoutParams.Oooo0);
                            continue;
                        case 47:
                            marginLayoutParams.Oooo0O0 = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 48:
                            marginLayoutParams.Oooo0OO = obtainStyledAttributes.getInt(index, 0);
                            continue;
                        case 49:
                            marginLayoutParams.OoooO = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.OoooO);
                            continue;
                        case ProxyManifest.FREE_COUNT /* 50 */:
                            marginLayoutParams.OoooOO0 = obtainStyledAttributes.getDimensionPixelOffset(index, marginLayoutParams.OoooOO0);
                            continue;
                        case 51:
                            marginLayoutParams.OoooOo0 = obtainStyledAttributes.getString(index);
                            continue;
                        case 52:
                            int resourceId15 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooOOO);
                            marginLayoutParams.OooOOO = resourceId15;
                            if (resourceId15 == -1) {
                                marginLayoutParams.OooOOO = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                continue;
                            }
                        case 53:
                            int resourceId16 = obtainStyledAttributes.getResourceId(index, marginLayoutParams.OooOOOO);
                            marginLayoutParams.OooOOOO = resourceId16;
                            if (resourceId16 == -1) {
                                marginLayoutParams.OooOOOO = obtainStyledAttributes.getInt(index, -1);
                                break;
                            } else {
                                continue;
                            }
                        case 54:
                            marginLayoutParams.OooOooO = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.OooOooO);
                            continue;
                        case 55:
                            marginLayoutParams.OooOoo = obtainStyledAttributes.getDimensionPixelSize(index, marginLayoutParams.OooOoo);
                            continue;
                        default:
                            switch (i2) {
                                case 64:
                                    C0317o0O0o0o0.OooO0oO(marginLayoutParams, obtainStyledAttributes, index, 0);
                                    continue;
                                case 65:
                                    C0317o0O0o0o0.OooO0oO(marginLayoutParams, obtainStyledAttributes, index, 1);
                                    continue;
                                case 66:
                                    marginLayoutParams.OoooOoO = obtainStyledAttributes.getInt(index, marginLayoutParams.OoooOoO);
                                    continue;
                                case 67:
                                    marginLayoutParams.OooO0Oo = obtainStyledAttributes.getBoolean(index, marginLayoutParams.OooO0Oo);
                                    continue;
                                    continue;
                            }
                    }
            }
        }
        obtainStyledAttributes.recycle();
        marginLayoutParams.OooO00o();
        return marginLayoutParams;
    }

    public int getMaxHeight() {
        return this.OooO0oO;
    }

    public int getMaxWidth() {
        return this.OooO0o;
    }

    public int getMinHeight() {
        return this.OooO0o0;
    }

    public int getMinWidth() {
        return this.OooO0Oo;
    }

    public int getOptimizationLevel() {
        return this.OooO0OO.o000000;
    }

    public String getSceneString() {
        int id;
        String str;
        StringBuilder sb = new StringBuilder();
        C0580o0oOo0O0 c0580o0oOo0O0 = this.OooO0OO;
        if (c0580o0oOo0O0.OooOO0 == null) {
            int id2 = getId();
            if (id2 != -1) {
                str = getContext().getResources().getResourceEntryName(id2);
            } else {
                str = "parent";
            }
            c0580o0oOo0O0.OooOO0 = str;
        }
        if (c0580o0oOo0O0.Oooooo == null) {
            c0580o0oOo0O0.Oooooo = c0580o0oOo0O0.OooOO0;
        }
        Iterator it = c0580o0oOo0O0.o00ooo.iterator();
        while (it.hasNext()) {
            C0316o0O0o0o c0316o0O0o0o = (C0316o0O0o0o) it.next();
            View view = (View) c0316o0O0o0o.OooooOo;
            if (view != null) {
                if (c0316o0O0o0o.OooOO0 == null && (id = view.getId()) != -1) {
                    c0316o0O0o0o.OooOO0 = getContext().getResources().getResourceEntryName(id);
                }
                if (c0316o0O0o0o.Oooooo == null) {
                    c0316o0O0o0o.Oooooo = c0316o0O0o0o.OooOO0;
                }
            }
        }
        c0580o0oOo0O0.OooOOO(sb);
        return sb.toString();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        boolean isInEditMode = isInEditMode();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            C0309o0O0OooO c0309o0O0OooO = (C0309o0O0OooO) childAt.getLayoutParams();
            C0316o0O0o0o c0316o0O0o0o = c0309o0O0OooO.o00o0O;
            if (childAt.getVisibility() != 8 || c0309o0O0OooO.OooooO0 || c0309o0O0OooO.OooooOO || isInEditMode) {
                int OooOOo = c0316o0O0o0o.OooOOo();
                int OooOOoo = c0316o0O0o0o.OooOOoo();
                childAt.layout(OooOOo, OooOOoo, c0316o0O0o0o.OooOOo0() + OooOOo, c0316o0O0o0o.OooOO0O() + OooOOoo);
            }
        }
        ArrayList arrayList = this.OooO0O0;
        int size = arrayList.size();
        if (size > 0) {
            for (int i6 = 0; i6 < size; i6++) {
                ((AbstractC0308o0O0Ooo0) arrayList.get(i6)).getClass();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:167:0x031b  */
    /* JADX WARN: Removed duplicated region for block: B:170:0x032f  */
    /* JADX WARN: Removed duplicated region for block: B:178:0x0356  */
    /* JADX WARN: Removed duplicated region for block: B:181:0x036b  */
    /* JADX WARN: Removed duplicated region for block: B:189:0x0391  */
    /* JADX WARN: Removed duplicated region for block: B:193:0x039e  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x03ba  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x03c2  */
    @Override // android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void onMeasure(int r24, int r25) {
        /*
            Method dump skipped, instructions count: 1467
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.constraintlayout.widget.ConstraintLayout.onMeasure(int, int):void");
    }

    @Override // android.view.ViewGroup
    public final void onViewAdded(View view) {
        super.onViewAdded(view);
        C0316o0O0o0o OooO0oo = OooO0oo(view);
        if ((view instanceof C0698oO0000oO) && !(OooO0oo instanceof C0699oO0000oo)) {
            C0309o0O0OooO c0309o0O0OooO = (C0309o0O0OooO) view.getLayoutParams();
            C0699oO0000oo c0699oO0000oo = new C0699oO0000oo();
            c0309o0O0OooO.o00o0O = c0699oO0000oo;
            c0309o0O0OooO.OooooO0 = true;
            c0699oO0000oo.OoooO0O(c0309o0O0OooO.o000oOoO);
        }
        if (view instanceof AbstractC0308o0O0Ooo0) {
            AbstractC0308o0O0Ooo0 abstractC0308o0O0Ooo0 = (AbstractC0308o0O0Ooo0) view;
            abstractC0308o0O0Ooo0.OooO();
            ((C0309o0O0OooO) view.getLayoutParams()).OooooOO = true;
            ArrayList arrayList = this.OooO0O0;
            if (!arrayList.contains(abstractC0308o0O0Ooo0)) {
                arrayList.add(abstractC0308o0O0Ooo0);
            }
        }
        this.OooO00o.put(view.getId(), view);
        this.OooO0oo = true;
    }

    @Override // android.view.ViewGroup
    public void onViewRemoved(View view) {
        super.onViewRemoved(view);
        this.OooO00o.remove(view.getId());
        C0316o0O0o0o OooO0oo = OooO0oo(view);
        this.OooO0OO.o00ooo.remove(OooO0oo);
        OooO0oo.OooOoo();
        this.OooO0O0.remove(view);
        this.OooO0oo = true;
    }

    @Override // android.view.View, android.view.ViewParent
    public final void requestLayout() {
        this.OooO0oo = true;
        super.requestLayout();
    }

    public void setConstraintSet(C0317o0O0o0o0 c0317o0O0o0o0) {
        this.OooOO0 = c0317o0O0o0o0;
    }

    @Override // android.view.View
    public void setId(int i) {
        int id = getId();
        SparseArray sparseArray = this.OooO00o;
        sparseArray.remove(id);
        super.setId(i);
        sparseArray.put(getId(), this);
    }

    public void setMaxHeight(int i) {
        if (i == this.OooO0oO) {
            return;
        }
        this.OooO0oO = i;
        requestLayout();
    }

    public void setMaxWidth(int i) {
        if (i == this.OooO0o) {
            return;
        }
        this.OooO0o = i;
        requestLayout();
    }

    public void setMinHeight(int i) {
        if (i == this.OooO0o0) {
            return;
        }
        this.OooO0o0 = i;
        requestLayout();
    }

    public void setMinWidth(int i) {
        if (i == this.OooO0Oo) {
            return;
        }
        this.OooO0Oo = i;
        requestLayout();
    }

    public void setOnConstraintsChanged(AbstractC0318o0O0o0oO abstractC0318o0O0o0oO) {
        C0415o0Oo0O0O c0415o0Oo0O0O = this.OooOO0O;
        if (c0415o0Oo0O0O != null) {
            c0415o0Oo0O0O.getClass();
        }
    }

    public void setOptimizationLevel(int i) {
        this.OooO = i;
        C0580o0oOo0O0 c0580o0oOo0O0 = this.OooO0OO;
        c0580o0oOo0O0.o000000 = i;
        oO0OO0O.OooOOo0 = c0580o0oOo0O0.OoooOOO(512);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public ConstraintLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.OooO00o = new SparseArray();
        this.OooO0O0 = new ArrayList(4);
        this.OooO0OO = new C0580o0oOo0O0();
        this.OooO0Oo = 0;
        this.OooO0o0 = 0;
        this.OooO0o = Integer.MAX_VALUE;
        this.OooO0oO = Integer.MAX_VALUE;
        this.OooO0oo = true;
        this.OooO = 257;
        this.OooOO0 = null;
        this.OooOO0O = null;
        this.OooOO0o = -1;
        this.OooOOO0 = new HashMap();
        this.OooOOO = new SparseArray();
        this.OooOOOO = new o0O0o000(this, this);
        OooO(attributeSet, i);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [com.ninja.engine.o0O0OooO, android.view.ViewGroup$LayoutParams, android.view.ViewGroup$MarginLayoutParams] */
    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(layoutParams);
        marginLayoutParams.OooO00o = -1;
        marginLayoutParams.OooO0O0 = -1;
        marginLayoutParams.OooO0OO = -1.0f;
        marginLayoutParams.OooO0Oo = true;
        marginLayoutParams.OooO0o0 = -1;
        marginLayoutParams.OooO0o = -1;
        marginLayoutParams.OooO0oO = -1;
        marginLayoutParams.OooO0oo = -1;
        marginLayoutParams.OooO = -1;
        marginLayoutParams.OooOO0 = -1;
        marginLayoutParams.OooOO0O = -1;
        marginLayoutParams.OooOO0o = -1;
        marginLayoutParams.OooOOO0 = -1;
        marginLayoutParams.OooOOO = -1;
        marginLayoutParams.OooOOOO = -1;
        marginLayoutParams.OooOOOo = -1;
        marginLayoutParams.OooOOo0 = 0;
        marginLayoutParams.OooOOo = 0.0f;
        marginLayoutParams.OooOOoo = -1;
        marginLayoutParams.OooOo00 = -1;
        marginLayoutParams.OooOo0 = -1;
        marginLayoutParams.OooOo0O = -1;
        marginLayoutParams.OooOo0o = Integer.MIN_VALUE;
        marginLayoutParams.OooOo = Integer.MIN_VALUE;
        marginLayoutParams.OooOoO0 = Integer.MIN_VALUE;
        marginLayoutParams.OooOoO = Integer.MIN_VALUE;
        marginLayoutParams.OooOoOO = Integer.MIN_VALUE;
        marginLayoutParams.OooOoo0 = Integer.MIN_VALUE;
        marginLayoutParams.OooOoo = Integer.MIN_VALUE;
        marginLayoutParams.OooOooO = 0;
        marginLayoutParams.OooOooo = 0.5f;
        marginLayoutParams.Oooo000 = 0.5f;
        marginLayoutParams.Oooo00O = null;
        marginLayoutParams.Oooo00o = -1.0f;
        marginLayoutParams.Oooo0 = -1.0f;
        marginLayoutParams.Oooo0O0 = 0;
        marginLayoutParams.Oooo0OO = 0;
        marginLayoutParams.Oooo0o0 = 0;
        marginLayoutParams.Oooo0o = 0;
        marginLayoutParams.Oooo0oO = 0;
        marginLayoutParams.Oooo0oo = 0;
        marginLayoutParams.Oooo = 0;
        marginLayoutParams.OoooO00 = 0;
        marginLayoutParams.OoooO0 = 1.0f;
        marginLayoutParams.OoooO0O = 1.0f;
        marginLayoutParams.OoooO = -1;
        marginLayoutParams.OoooOO0 = -1;
        marginLayoutParams.o000oOoO = -1;
        marginLayoutParams.OoooOOO = false;
        marginLayoutParams.OoooOOo = false;
        marginLayoutParams.OoooOo0 = null;
        marginLayoutParams.OoooOoO = 0;
        marginLayoutParams.OoooOoo = true;
        marginLayoutParams.Ooooo00 = true;
        marginLayoutParams.Ooooo0o = false;
        marginLayoutParams.OooooO0 = false;
        marginLayoutParams.OooooOO = false;
        marginLayoutParams.OooooOo = -1;
        marginLayoutParams.Oooooo0 = -1;
        marginLayoutParams.Oooooo = -1;
        marginLayoutParams.OoooooO = -1;
        marginLayoutParams.Ooooooo = Integer.MIN_VALUE;
        marginLayoutParams.o0OoOo0 = Integer.MIN_VALUE;
        marginLayoutParams.ooOO = 0.5f;
        marginLayoutParams.o00o0O = new C0316o0O0o0o();
        if (layoutParams instanceof ViewGroup.MarginLayoutParams) {
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).leftMargin = marginLayoutParams2.leftMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).rightMargin = marginLayoutParams2.rightMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).topMargin = marginLayoutParams2.topMargin;
            ((ViewGroup.MarginLayoutParams) marginLayoutParams).bottomMargin = marginLayoutParams2.bottomMargin;
            marginLayoutParams.setMarginStart(marginLayoutParams2.getMarginStart());
            marginLayoutParams.setMarginEnd(marginLayoutParams2.getMarginEnd());
        }
        if (layoutParams instanceof C0309o0O0OooO) {
            C0309o0O0OooO c0309o0O0OooO = (C0309o0O0OooO) layoutParams;
            marginLayoutParams.OooO00o = c0309o0O0OooO.OooO00o;
            marginLayoutParams.OooO0O0 = c0309o0O0OooO.OooO0O0;
            marginLayoutParams.OooO0OO = c0309o0O0OooO.OooO0OO;
            marginLayoutParams.OooO0Oo = c0309o0O0OooO.OooO0Oo;
            marginLayoutParams.OooO0o0 = c0309o0O0OooO.OooO0o0;
            marginLayoutParams.OooO0o = c0309o0O0OooO.OooO0o;
            marginLayoutParams.OooO0oO = c0309o0O0OooO.OooO0oO;
            marginLayoutParams.OooO0oo = c0309o0O0OooO.OooO0oo;
            marginLayoutParams.OooO = c0309o0O0OooO.OooO;
            marginLayoutParams.OooOO0 = c0309o0O0OooO.OooOO0;
            marginLayoutParams.OooOO0O = c0309o0O0OooO.OooOO0O;
            marginLayoutParams.OooOO0o = c0309o0O0OooO.OooOO0o;
            marginLayoutParams.OooOOO0 = c0309o0O0OooO.OooOOO0;
            marginLayoutParams.OooOOO = c0309o0O0OooO.OooOOO;
            marginLayoutParams.OooOOOO = c0309o0O0OooO.OooOOOO;
            marginLayoutParams.OooOOOo = c0309o0O0OooO.OooOOOo;
            marginLayoutParams.OooOOo0 = c0309o0O0OooO.OooOOo0;
            marginLayoutParams.OooOOo = c0309o0O0OooO.OooOOo;
            marginLayoutParams.OooOOoo = c0309o0O0OooO.OooOOoo;
            marginLayoutParams.OooOo00 = c0309o0O0OooO.OooOo00;
            marginLayoutParams.OooOo0 = c0309o0O0OooO.OooOo0;
            marginLayoutParams.OooOo0O = c0309o0O0OooO.OooOo0O;
            marginLayoutParams.OooOo0o = c0309o0O0OooO.OooOo0o;
            marginLayoutParams.OooOo = c0309o0O0OooO.OooOo;
            marginLayoutParams.OooOoO0 = c0309o0O0OooO.OooOoO0;
            marginLayoutParams.OooOoO = c0309o0O0OooO.OooOoO;
            marginLayoutParams.OooOoOO = c0309o0O0OooO.OooOoOO;
            marginLayoutParams.OooOoo0 = c0309o0O0OooO.OooOoo0;
            marginLayoutParams.OooOoo = c0309o0O0OooO.OooOoo;
            marginLayoutParams.OooOooO = c0309o0O0OooO.OooOooO;
            marginLayoutParams.OooOooo = c0309o0O0OooO.OooOooo;
            marginLayoutParams.Oooo000 = c0309o0O0OooO.Oooo000;
            marginLayoutParams.Oooo00O = c0309o0O0OooO.Oooo00O;
            marginLayoutParams.Oooo00o = c0309o0O0OooO.Oooo00o;
            marginLayoutParams.Oooo0 = c0309o0O0OooO.Oooo0;
            marginLayoutParams.Oooo0O0 = c0309o0O0OooO.Oooo0O0;
            marginLayoutParams.Oooo0OO = c0309o0O0OooO.Oooo0OO;
            marginLayoutParams.OoooOOO = c0309o0O0OooO.OoooOOO;
            marginLayoutParams.OoooOOo = c0309o0O0OooO.OoooOOo;
            marginLayoutParams.Oooo0o0 = c0309o0O0OooO.Oooo0o0;
            marginLayoutParams.Oooo0o = c0309o0O0OooO.Oooo0o;
            marginLayoutParams.Oooo0oO = c0309o0O0OooO.Oooo0oO;
            marginLayoutParams.Oooo = c0309o0O0OooO.Oooo;
            marginLayoutParams.Oooo0oo = c0309o0O0OooO.Oooo0oo;
            marginLayoutParams.OoooO00 = c0309o0O0OooO.OoooO00;
            marginLayoutParams.OoooO0 = c0309o0O0OooO.OoooO0;
            marginLayoutParams.OoooO0O = c0309o0O0OooO.OoooO0O;
            marginLayoutParams.OoooO = c0309o0O0OooO.OoooO;
            marginLayoutParams.OoooOO0 = c0309o0O0OooO.OoooOO0;
            marginLayoutParams.o000oOoO = c0309o0O0OooO.o000oOoO;
            marginLayoutParams.OoooOoo = c0309o0O0OooO.OoooOoo;
            marginLayoutParams.Ooooo00 = c0309o0O0OooO.Ooooo00;
            marginLayoutParams.Ooooo0o = c0309o0O0OooO.Ooooo0o;
            marginLayoutParams.OooooO0 = c0309o0O0OooO.OooooO0;
            marginLayoutParams.OooooOo = c0309o0O0OooO.OooooOo;
            marginLayoutParams.Oooooo0 = c0309o0O0OooO.Oooooo0;
            marginLayoutParams.Oooooo = c0309o0O0OooO.Oooooo;
            marginLayoutParams.OoooooO = c0309o0O0OooO.OoooooO;
            marginLayoutParams.Ooooooo = c0309o0O0OooO.Ooooooo;
            marginLayoutParams.o0OoOo0 = c0309o0O0OooO.o0OoOo0;
            marginLayoutParams.ooOO = c0309o0O0OooO.ooOO;
            marginLayoutParams.OoooOo0 = c0309o0O0OooO.OoooOo0;
            marginLayoutParams.OoooOoO = c0309o0O0OooO.OoooOoO;
            marginLayoutParams.o00o0O = c0309o0O0OooO.o00o0O;
        }
        return marginLayoutParams;
    }
}


