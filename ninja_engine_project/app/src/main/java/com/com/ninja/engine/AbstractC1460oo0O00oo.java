package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import com.app.framework.utils.FileUtils;
import java.lang.ref.WeakReference;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Objects;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oo0O00oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1460oo0O00oo {
    public static WeakHashMap OooO00o = null;
    public static Field OooO0O0 = null;
    public static boolean OooO0OO = false;
    public static ThreadLocal OooO0Oo;
    public static final int[] OooO0o0 = {R.id.accessibility_custom_action_0, R.id.accessibility_custom_action_1, R.id.accessibility_custom_action_2, R.id.accessibility_custom_action_3, R.id.accessibility_custom_action_4, R.id.accessibility_custom_action_5, R.id.accessibility_custom_action_6, R.id.accessibility_custom_action_7, R.id.accessibility_custom_action_8, R.id.accessibility_custom_action_9, R.id.accessibility_custom_action_10, R.id.accessibility_custom_action_11, R.id.accessibility_custom_action_12, R.id.accessibility_custom_action_13, R.id.accessibility_custom_action_14, R.id.accessibility_custom_action_15, R.id.accessibility_custom_action_16, R.id.accessibility_custom_action_17, R.id.accessibility_custom_action_18, R.id.accessibility_custom_action_19, R.id.accessibility_custom_action_20, R.id.accessibility_custom_action_21, R.id.accessibility_custom_action_22, R.id.accessibility_custom_action_23, R.id.accessibility_custom_action_24, R.id.accessibility_custom_action_25, R.id.accessibility_custom_action_26, R.id.accessibility_custom_action_27, R.id.accessibility_custom_action_28, R.id.accessibility_custom_action_29, R.id.accessibility_custom_action_30, R.id.accessibility_custom_action_31};
    public static final C1445oo00oooo OooO0o = new Object();
    public static final ViewTreeObserver$OnGlobalLayoutListenerC1450oo0O0000 OooO0oO = new ViewTreeObserver$OnGlobalLayoutListenerC1450oo0O0000();

    public static void OooO(View view, int i) {
        boolean z;
        AccessibilityManager accessibilityManager = (AccessibilityManager) view.getContext().getSystemService("accessibility");
        if (!accessibilityManager.isEnabled()) {
            return;
        }
        if (OooO0Oo(view) != null && view.isShown() && view.getWindowVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        int i2 = 32;
        if (view.getAccessibilityLiveRegion() == 0 && !z) {
            if (i == 32) {
                AccessibilityEvent obtain = AccessibilityEvent.obtain();
                view.onInitializeAccessibilityEvent(obtain);
                obtain.setEventType(32);
                obtain.setContentChangeTypes(i);
                obtain.setSource(view);
                view.onPopulateAccessibilityEvent(obtain);
                obtain.getText().add(OooO0Oo(view));
                accessibilityManager.sendAccessibilityEvent(obtain);
                return;
            } else if (view.getParent() != null) {
                try {
                    view.getParent().notifySubtreeAccessibilityStateChanged(view, view, i);
                    return;
                } catch (AbstractMethodError unused) {
                    view.getParent().getClass();
                    return;
                }
            } else {
                return;
            }
        }
        AccessibilityEvent obtain2 = AccessibilityEvent.obtain();
        if (!z) {
            i2 = FileUtils.FileMode.MODE_ISUID;
        }
        obtain2.setEventType(i2);
        obtain2.setContentChangeTypes(i);
        if (z) {
            obtain2.getText().add(OooO0Oo(view));
            if (view.getImportantForAccessibility() == 0) {
                view.setImportantForAccessibility(1);
            }
        }
        view.sendAccessibilityEventUnchecked(obtain2);
    }

    public static C1470oo0O0OoO OooO00o(View view) {
        if (OooO00o == null) {
            OooO00o = new WeakHashMap();
        }
        C1470oo0O0OoO c1470oo0O0OoO = (C1470oo0O0OoO) OooO00o.get(view);
        if (c1470oo0O0OoO == null) {
            C1470oo0O0OoO c1470oo0O0OoO2 = new C1470oo0O0OoO(view);
            OooO00o.put(view, c1470oo0O0OoO2);
            return c1470oo0O0OoO2;
        }
        return c1470oo0O0OoO;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, com.ninja.engine.oo0O00oO] */
    public static boolean OooO0O0(View view, KeyEvent keyEvent) {
        if (Build.VERSION.SDK_INT >= 28) {
            return false;
        }
        ArrayList arrayList = C1459oo0O00oO.OooO0Oo;
        C1459oo0O00oO c1459oo0O00oO = (C1459oo0O00oO) view.getTag(R.id.tag_unhandled_key_event_manager);
        C1459oo0O00oO c1459oo0O00oO2 = c1459oo0O00oO;
        if (c1459oo0O00oO == null) {
            ?? obj = new Object();
            obj.OooO00o = null;
            obj.OooO0O0 = null;
            obj.OooO0OO = null;
            view.setTag(R.id.tag_unhandled_key_event_manager, obj);
            c1459oo0O00oO2 = obj;
        }
        if (keyEvent.getAction() == 0) {
            WeakHashMap weakHashMap = c1459oo0O00oO2.OooO00o;
            if (weakHashMap != null) {
                weakHashMap.clear();
            }
            ArrayList arrayList2 = C1459oo0O00oO.OooO0Oo;
            if (!arrayList2.isEmpty()) {
                synchronized (arrayList2) {
                    try {
                        if (c1459oo0O00oO2.OooO00o == null) {
                            c1459oo0O00oO2.OooO00o = new WeakHashMap();
                        }
                        for (int size = arrayList2.size() - 1; size >= 0; size--) {
                            ArrayList arrayList3 = C1459oo0O00oO.OooO0Oo;
                            View view2 = (View) ((WeakReference) arrayList3.get(size)).get();
                            if (view2 == null) {
                                arrayList3.remove(size);
                            } else {
                                c1459oo0O00oO2.OooO00o.put(view2, Boolean.TRUE);
                                for (ViewParent parent = view2.getParent(); parent instanceof View; parent = parent.getParent()) {
                                    c1459oo0O00oO2.OooO00o.put((View) parent, Boolean.TRUE);
                                }
                            }
                        }
                    } finally {
                    }
                }
            }
        }
        View OooO00o2 = c1459oo0O00oO2.OooO00o(view);
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (OooO00o2 != null && !KeyEvent.isModifierKey(keyCode)) {
                if (c1459oo0O00oO2.OooO0O0 == null) {
                    c1459oo0O00oO2.OooO0O0 = new SparseArray();
                }
                c1459oo0O00oO2.OooO0O0.put(keyCode, new WeakReference(OooO00o2));
            }
        }
        if (OooO00o2 == null) {
            return false;
        }
        return true;
    }

    public static View.AccessibilityDelegate OooO0OO(View view) {
        if (Build.VERSION.SDK_INT >= 29) {
            return AbstractC1456oo0O00Oo.OooO00o(view);
        }
        if (OooO0OO) {
            return null;
        }
        if (OooO0O0 == null) {
            try {
                Field declaredField = View.class.getDeclaredField("mAccessibilityDelegate");
                OooO0O0 = declaredField;
                declaredField.setAccessible(true);
            } catch (Throwable unused) {
                OooO0OO = true;
                return null;
            }
        }
        Object obj = OooO0O0.get(view);
        if (!(obj instanceof View.AccessibilityDelegate)) {
            return null;
        }
        return (View.AccessibilityDelegate) obj;
    }

    public static CharSequence OooO0Oo(View view) {
        Object tag;
        if (Build.VERSION.SDK_INT >= 28) {
            tag = AbstractC1455oo0O00OO.OooO00o(view);
        } else {
            tag = view.getTag(R.id.tag_accessibility_pane_title);
            if (!CharSequence.class.isInstance(tag)) {
                tag = null;
            }
        }
        return (CharSequence) tag;
    }

    public static Rect OooO0o() {
        if (OooO0Oo == null) {
            OooO0Oo = new ThreadLocal();
        }
        Rect rect = (Rect) OooO0Oo.get();
        if (rect == null) {
            rect = new Rect();
            OooO0Oo.set(rect);
        }
        rect.setEmpty();
        return rect;
    }

    public static ArrayList OooO0o0(View view) {
        ArrayList arrayList = (ArrayList) view.getTag(R.id.tag_accessibility_actions);
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList();
            view.setTag(R.id.tag_accessibility_actions, arrayList2);
            return arrayList2;
        }
        return arrayList;
    }

    public static String[] OooO0oO(View view) {
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1457oo0O00o.OooO00o(view);
        }
        return (String[]) view.getTag(R.id.tag_on_receive_content_mime_types);
    }

    public static C1536oo0OoOoO OooO0oo(View view) {
        if (Build.VERSION.SDK_INT >= 23) {
            return AbstractC1448oo0O00.OooO00o(view);
        }
        return AbstractC1452oo0O000o.OooO0o(view);
    }

    public static void OooOO0(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetLeftAndRight(i);
            return;
        }
        Rect OooO0o2 = OooO0o();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            OooO0o2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !OooO0o2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetLeftAndRight(i);
        if (view.getVisibility() == 0) {
            OooOOoo(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                OooOOoo((View) parent2);
            }
        }
        if (z && OooO0o2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(OooO0o2);
        }
    }

    public static void OooOO0O(View view, int i) {
        boolean z;
        if (Build.VERSION.SDK_INT >= 23) {
            view.offsetTopAndBottom(i);
            return;
        }
        Rect OooO0o2 = OooO0o();
        ViewParent parent = view.getParent();
        if (parent instanceof View) {
            View view2 = (View) parent;
            OooO0o2.set(view2.getLeft(), view2.getTop(), view2.getRight(), view2.getBottom());
            z = !OooO0o2.intersects(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        } else {
            z = false;
        }
        view.offsetTopAndBottom(i);
        if (view.getVisibility() == 0) {
            OooOOoo(view);
            ViewParent parent2 = view.getParent();
            if (parent2 instanceof View) {
                OooOOoo((View) parent2);
            }
        }
        if (z && OooO0o2.intersect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom())) {
            ((View) parent).invalidate(OooO0o2);
        }
    }

    public static C0323o0O0oO0o OooOO0o(View view, C0323o0O0oO0o c0323o0O0oO0o) {
        if (Log.isLoggable("ViewCompat", 3)) {
            Objects.toString(c0323o0O0oO0o);
            view.getClass();
            view.getId();
        }
        if (Build.VERSION.SDK_INT >= 31) {
            return AbstractC1457oo0O00o.OooO0O0(view, c0323o0O0oO0o);
        }
        C1309oOooOOOo c1309oOooOOOo = (C1309oOooOOOo) view.getTag(R.id.tag_on_receive_content_listener);
        oOOO000o oooo000o = OooO0o;
        if (c1309oOooOOOo != null) {
            C0323o0O0oO0o OooO00o2 = C1309oOooOOOo.OooO00o(view, c0323o0O0oO0o);
            if (OooO00o2 == null) {
                return null;
            }
            if (view instanceof oOOO000o) {
                oooo000o = (oOOO000o) view;
            }
            return oooo000o.OooO00o(OooO00o2);
        }
        if (view instanceof oOOO000o) {
            oooo000o = (oOOO000o) view;
        }
        return oooo000o.OooO00o(c0323o0O0oO0o);
    }

    public static void OooOOO(View view, C0038Oooo0oo c0038Oooo0oo, InterfaceC0052OooooOO interfaceC0052OooooOO) {
        C0028OooOooO c0028OooOooO;
        C0038Oooo0oo c0038Oooo0oo2 = new C0038Oooo0oo(null, c0038Oooo0oo.OooO0O0, null, interfaceC0052OooooOO, c0038Oooo0oo.OooO0OO);
        View.AccessibilityDelegate OooO0OO2 = OooO0OO(view);
        if (OooO0OO2 == null) {
            c0028OooOooO = null;
        } else if (OooO0OO2 instanceof C0026OooOoo) {
            c0028OooOooO = ((C0026OooOoo) OooO0OO2).OooO00o;
        } else {
            c0028OooOooO = new C0028OooOooO(OooO0OO2);
        }
        if (c0028OooOooO == null) {
            c0028OooOooO = new C0028OooOooO();
        }
        OooOOOo(view, c0028OooOooO);
        OooOOO0(view, c0038Oooo0oo2.OooO00o());
        OooO0o0(view).add(c0038Oooo0oo2);
        OooO(view, 0);
    }

    public static void OooOOO0(View view, int i) {
        ArrayList OooO0o02 = OooO0o0(view);
        for (int i2 = 0; i2 < OooO0o02.size(); i2++) {
            if (((C0038Oooo0oo) OooO0o02.get(i2)).OooO00o() == i) {
                OooO0o02.remove(i2);
                return;
            }
        }
    }

    public static void OooOOOO(View view, Context context, int[] iArr, AttributeSet attributeSet, TypedArray typedArray, int i) {
        if (Build.VERSION.SDK_INT >= 29) {
            AbstractC1456oo0O00Oo.OooO0O0(view, context, iArr, attributeSet, typedArray, i, 0);
        }
    }

    public static void OooOOOo(View view, C0028OooOooO c0028OooOooO) {
        C0026OooOoo c0026OooOoo;
        if (c0028OooOooO == null && (OooO0OO(view) instanceof C0026OooOoo)) {
            c0028OooOooO = new C0028OooOooO();
        }
        if (view.getImportantForAccessibility() == 0) {
            view.setImportantForAccessibility(1);
        }
        if (c0028OooOooO == null) {
            c0026OooOoo = null;
        } else {
            c0026OooOoo = c0028OooOooO.OooO0O0;
        }
        view.setAccessibilityDelegate(c0026OooOoo);
    }

    public static void OooOOo(View view, ColorStateList colorStateList) {
        boolean z;
        int i = Build.VERSION.SDK_INT;
        AbstractC1452oo0O000o.OooOO0(view, colorStateList);
        if (i == 21) {
            Drawable background = view.getBackground();
            if (AbstractC1452oo0O000o.OooO0OO(view) == null && AbstractC1452oo0O000o.OooO0Oo(view) == null) {
                z = false;
            } else {
                z = true;
            }
            if (background != null && z) {
                if (background.isStateful()) {
                    background.setState(view.getDrawableState());
                }
                view.setBackground(background);
            }
        }
    }

    public static void OooOOo0(View view, CharSequence charSequence) {
        boolean z;
        new C1348oo0(R.id.tag_accessibility_pane_title, CharSequence.class, 8, 28, 1).OooO0o0(view, charSequence);
        ViewTreeObserver$OnGlobalLayoutListenerC1450oo0O0000 viewTreeObserver$OnGlobalLayoutListenerC1450oo0O0000 = OooO0oO;
        if (charSequence != null) {
            WeakHashMap weakHashMap = viewTreeObserver$OnGlobalLayoutListenerC1450oo0O0000.OooO00o;
            if (view.isShown() && view.getWindowVisibility() == 0) {
                z = true;
            } else {
                z = false;
            }
            weakHashMap.put(view, Boolean.valueOf(z));
            view.addOnAttachStateChangeListener(viewTreeObserver$OnGlobalLayoutListenerC1450oo0O0000);
            if (view.isAttachedToWindow()) {
                view.getViewTreeObserver().addOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC1450oo0O0000);
                return;
            }
            return;
        }
        viewTreeObserver$OnGlobalLayoutListenerC1450oo0O0000.OooO00o.remove(view);
        view.removeOnAttachStateChangeListener(viewTreeObserver$OnGlobalLayoutListenerC1450oo0O0000);
        view.getViewTreeObserver().removeOnGlobalLayoutListener(viewTreeObserver$OnGlobalLayoutListenerC1450oo0O0000);
    }

    public static void OooOOoo(View view) {
        float translationY = view.getTranslationY();
        view.setTranslationY(1.0f + translationY);
        view.setTranslationY(translationY);
    }
}
