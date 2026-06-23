package com.ninja.engine;

import android.os.Build;
import android.view.accessibility.AccessibilityNodeInfo;
import com.app.framework.core.system.JarConfig;
import com.app.framework.utils.FileUtils;
/* renamed from: com.ninja.engine.Oooo0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0038Oooo0oo {
    public static final C0038Oooo0oo OooO;
    public static final C0038Oooo0oo OooO0o;
    public static final C0038Oooo0oo OooO0o0;
    public static final C0038Oooo0oo OooO0oO;
    public static final C0038Oooo0oo OooO0oo;
    public static final C0038Oooo0oo OooOO0;
    public static final C0038Oooo0oo OooOO0O;
    public static final C0038Oooo0oo OooOO0o;
    public final Object OooO00o;
    public final int OooO0O0;
    public final Class OooO0OO;
    public final InterfaceC0052OooooOO OooO0Oo;

    static {
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction2;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction3;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction4;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction5;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction6;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction7;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction8;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction9;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction10;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction11;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction12;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction13;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction14;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction15;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction16;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction17;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction18;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction19;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction20;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction21;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction22;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction23;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction24;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction25;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction26;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction27;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction28;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction29;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction30;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction31;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction32;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction33;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction34;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction35;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction36;
        new C0038Oooo0oo(1);
        new C0038Oooo0oo(2);
        new C0038Oooo0oo(4);
        new C0038Oooo0oo(8);
        OooO0o0 = new C0038Oooo0oo(16);
        new C0038Oooo0oo(32);
        new C0038Oooo0oo(64);
        new C0038Oooo0oo(128);
        new C0038Oooo0oo(256, AbstractC0045OoooOOo.class);
        new C0038Oooo0oo(512, AbstractC0045OoooOOo.class);
        new C0038Oooo0oo(1024, AbstractC0046OoooOo0.class);
        new C0038Oooo0oo(FileUtils.FileMode.MODE_ISUID, AbstractC0046OoooOo0.class);
        OooO0o = new C0038Oooo0oo(4096);
        OooO0oO = new C0038Oooo0oo(JarConfig.DEFAULT_BUFFER_SIZE);
        new C0038Oooo0oo(16384);
        new C0038Oooo0oo(JarConfig.MAX_BUFFER_SIZE);
        new C0038Oooo0oo(65536);
        new C0038Oooo0oo(131072, AbstractC0050Ooooo0o.class);
        OooO0oo = new C0038Oooo0oo(262144);
        OooO = new C0038Oooo0oo(524288);
        OooOO0 = new C0038Oooo0oo(1048576);
        new C0038Oooo0oo(2097152, AbstractC0051OooooO0.class);
        int i = Build.VERSION.SDK_INT;
        AccessibilityNodeInfo.AccessibilityAction accessibilityAction37 = null;
        if (i >= 23) {
            accessibilityAction = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_ON_SCREEN;
        } else {
            accessibilityAction = null;
        }
        new C0038Oooo0oo(accessibilityAction, 16908342, null, null, null);
        if (i >= 23) {
            accessibilityAction36 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_TO_POSITION;
            accessibilityAction2 = accessibilityAction36;
        } else {
            accessibilityAction2 = null;
        }
        new C0038Oooo0oo(accessibilityAction2, 16908343, null, null, AbstractC0048OoooOoo.class);
        if (i >= 23) {
            accessibilityAction35 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_UP;
            accessibilityAction3 = accessibilityAction35;
        } else {
            accessibilityAction3 = null;
        }
        OooOO0O = new C0038Oooo0oo(accessibilityAction3, 16908344, null, null, null);
        if (i >= 23) {
            accessibilityAction34 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_LEFT;
            accessibilityAction4 = accessibilityAction34;
        } else {
            accessibilityAction4 = null;
        }
        new C0038Oooo0oo(accessibilityAction4, 16908345, null, null, null);
        if (i >= 23) {
            accessibilityAction33 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_DOWN;
            accessibilityAction5 = accessibilityAction33;
        } else {
            accessibilityAction5 = null;
        }
        OooOO0o = new C0038Oooo0oo(accessibilityAction5, 16908346, null, null, null);
        if (i >= 23) {
            accessibilityAction32 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SCROLL_RIGHT;
            accessibilityAction6 = accessibilityAction32;
        } else {
            accessibilityAction6 = null;
        }
        new C0038Oooo0oo(accessibilityAction6, 16908347, null, null, null);
        if (i >= 29) {
            accessibilityAction7 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_UP;
        } else {
            accessibilityAction7 = null;
        }
        new C0038Oooo0oo(accessibilityAction7, 16908358, null, null, null);
        if (i >= 29) {
            accessibilityAction31 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_DOWN;
            accessibilityAction8 = accessibilityAction31;
        } else {
            accessibilityAction8 = null;
        }
        new C0038Oooo0oo(accessibilityAction8, 16908359, null, null, null);
        if (i >= 29) {
            accessibilityAction9 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_LEFT;
        } else {
            accessibilityAction9 = null;
        }
        new C0038Oooo0oo(accessibilityAction9, 16908360, null, null, null);
        if (i >= 29) {
            accessibilityAction30 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PAGE_RIGHT;
            accessibilityAction10 = accessibilityAction30;
        } else {
            accessibilityAction10 = null;
        }
        new C0038Oooo0oo(accessibilityAction10, 16908361, null, null, null);
        if (i >= 23) {
            accessibilityAction29 = AccessibilityNodeInfo.AccessibilityAction.ACTION_CONTEXT_CLICK;
            accessibilityAction11 = accessibilityAction29;
        } else {
            accessibilityAction11 = null;
        }
        new C0038Oooo0oo(accessibilityAction11, 16908348, null, null, null);
        if (i >= 24) {
            accessibilityAction28 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SET_PROGRESS;
            accessibilityAction12 = accessibilityAction28;
        } else {
            accessibilityAction12 = null;
        }
        new C0038Oooo0oo(accessibilityAction12, 16908349, null, null, AbstractC0049Ooooo00.class);
        if (i >= 26) {
            accessibilityAction13 = AccessibilityNodeInfo.AccessibilityAction.ACTION_MOVE_WINDOW;
        } else {
            accessibilityAction13 = null;
        }
        new C0038Oooo0oo(accessibilityAction13, 16908354, null, null, AbstractC0047OoooOoO.class);
        if (i >= 28) {
            accessibilityAction27 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TOOLTIP;
            accessibilityAction14 = accessibilityAction27;
        } else {
            accessibilityAction14 = null;
        }
        new C0038Oooo0oo(accessibilityAction14, 16908356, null, null, null);
        if (i >= 28) {
            accessibilityAction26 = AccessibilityNodeInfo.AccessibilityAction.ACTION_HIDE_TOOLTIP;
            accessibilityAction15 = accessibilityAction26;
        } else {
            accessibilityAction15 = null;
        }
        new C0038Oooo0oo(accessibilityAction15, 16908357, null, null, null);
        if (i >= 30) {
            accessibilityAction16 = AccessibilityNodeInfo.AccessibilityAction.ACTION_PRESS_AND_HOLD;
        } else {
            accessibilityAction16 = null;
        }
        new C0038Oooo0oo(accessibilityAction16, 16908362, null, null, null);
        if (i >= 30) {
            accessibilityAction25 = AccessibilityNodeInfo.AccessibilityAction.ACTION_IME_ENTER;
            accessibilityAction17 = accessibilityAction25;
        } else {
            accessibilityAction17 = null;
        }
        new C0038Oooo0oo(accessibilityAction17, 16908372, null, null, null);
        if (i >= 32) {
            accessibilityAction18 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_START;
        } else {
            accessibilityAction18 = null;
        }
        new C0038Oooo0oo(accessibilityAction18, 16908373, null, null, null);
        if (i >= 32) {
            accessibilityAction24 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_DROP;
            accessibilityAction19 = accessibilityAction24;
        } else {
            accessibilityAction19 = null;
        }
        new C0038Oooo0oo(accessibilityAction19, 16908374, null, null, null);
        if (i >= 32) {
            accessibilityAction23 = AccessibilityNodeInfo.AccessibilityAction.ACTION_DRAG_CANCEL;
            accessibilityAction20 = accessibilityAction23;
        } else {
            accessibilityAction20 = null;
        }
        new C0038Oooo0oo(accessibilityAction20, 16908375, null, null, null);
        if (i >= 33) {
            accessibilityAction22 = AccessibilityNodeInfo.AccessibilityAction.ACTION_SHOW_TEXT_SUGGESTIONS;
            accessibilityAction21 = accessibilityAction22;
        } else {
            accessibilityAction21 = null;
        }
        new C0038Oooo0oo(accessibilityAction21, 16908376, null, null, null);
        if (i >= 34) {
            accessibilityAction37 = AbstractC0040OoooO0.OooO00o();
        }
        new C0038Oooo0oo(accessibilityAction37, 16908382, null, null, null);
    }

    public C0038Oooo0oo(int i) {
        this(null, i, null, null, null);
    }

    public final int OooO00o() {
        return ((AccessibilityNodeInfo.AccessibilityAction) this.OooO00o).getId();
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof C0038Oooo0oo)) {
            return false;
        }
        Object obj2 = ((C0038Oooo0oo) obj).OooO00o;
        Object obj3 = this.OooO00o;
        if (obj3 == null) {
            if (obj2 != null) {
                return false;
            }
            return true;
        } else if (!obj3.equals(obj2)) {
            return false;
        } else {
            return true;
        }
    }

    public final int hashCode() {
        Object obj = this.OooO00o;
        if (obj != null) {
            return obj.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AccessibilityActionCompat: ");
        String OooO0Oo = C0039OoooO.OooO0Oo(this.OooO0O0);
        if (OooO0Oo.equals("ACTION_UNKNOWN")) {
            Object obj = this.OooO00o;
            if (((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel() != null) {
                OooO0Oo = ((AccessibilityNodeInfo.AccessibilityAction) obj).getLabel().toString();
            }
        }
        sb.append(OooO0Oo);
        return sb.toString();
    }

    public C0038Oooo0oo(int i, Class cls) {
        this(null, i, null, null, cls);
    }

    public C0038Oooo0oo(Object obj, int i, String str, InterfaceC0052OooooOO interfaceC0052OooooOO, Class cls) {
        this.OooO0O0 = i;
        this.OooO0Oo = interfaceC0052OooooOO;
        this.OooO00o = obj == null ? new AccessibilityNodeInfo.AccessibilityAction(i, str) : obj;
        this.OooO0OO = cls;
    }
}
