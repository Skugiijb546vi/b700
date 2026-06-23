package com.ninja.engine;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.WindowInsets;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.Objects;
/* renamed from: com.ninja.engine.oo0OoO00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1528oo0OoO00 extends C1533oo0OoOOo {
    public static Method OooO = null;
    public static boolean OooO0oo = false;
    public static Class OooOO0;
    public static Field OooOO0O;
    public static Field OooOO0o;
    public final WindowInsets OooO0OO;
    public C0724oO00OooO[] OooO0Oo;
    public C1536oo0OoOoO OooO0o;
    public C0724oO00OooO OooO0o0;
    public C0724oO00OooO OooO0oO;

    public AbstractC1528oo0OoO00(C1536oo0OoOoO c1536oo0OoOoO, WindowInsets windowInsets) {
        super(c1536oo0OoOoO);
        this.OooO0o0 = null;
        this.OooO0OO = windowInsets;
    }

    @SuppressLint({"WrongConstant"})
    private C0724oO00OooO OooOOo(int i, boolean z) {
        C0724oO00OooO c0724oO00OooO = C0724oO00OooO.OooO0o0;
        for (int i2 = 1; i2 <= 256; i2 <<= 1) {
            if ((i & i2) != 0) {
                c0724oO00OooO = C0724oO00OooO.OooO00o(c0724oO00OooO, OooOOoo(i2, z));
            }
        }
        return c0724oO00OooO;
    }

    private C0724oO00OooO OooOo0(View view) {
        if (Build.VERSION.SDK_INT < 30) {
            if (!OooO0oo) {
                OooOo0O();
            }
            Method method = OooO;
            if (method != null && OooOO0 != null && OooOO0O != null) {
                try {
                    Object invoke = method.invoke(view, null);
                    if (invoke == null) {
                        return null;
                    }
                    Rect rect = (Rect) OooOO0O.get(OooOO0o.get(invoke));
                    if (rect == null) {
                        return null;
                    }
                    return C0724oO00OooO.OooO0O0(rect.left, rect.top, rect.right, rect.bottom);
                } catch (ReflectiveOperationException e) {
                    e.getMessage();
                }
            }
            return null;
        }
        throw new UnsupportedOperationException("getVisibleInsets() should not be called on API >= 30. Use WindowInsets.isVisible() instead.");
    }

    private C0724oO00OooO OooOo00() {
        C1536oo0OoOoO c1536oo0OoOoO = this.OooO0o;
        if (c1536oo0OoOoO != null) {
            return c1536oo0OoOoO.OooO00o.OooO0oo();
        }
        return C0724oO00OooO.OooO0o0;
    }

    @SuppressLint({"PrivateApi"})
    private static void OooOo0O() {
        try {
            OooO = View.class.getDeclaredMethod("getViewRootImpl", null);
            Class<?> cls = Class.forName("android.view.View$AttachInfo");
            OooOO0 = cls;
            OooOO0O = cls.getDeclaredField("mVisibleInsets");
            OooOO0o = Class.forName("android.view.ViewRootImpl").getDeclaredField("mAttachInfo");
            OooOO0O.setAccessible(true);
            OooOO0o.setAccessible(true);
        } catch (ReflectiveOperationException e) {
            e.getMessage();
        }
        OooO0oo = true;
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public void OooO0Oo(View view) {
        C0724oO00OooO OooOo0 = OooOo0(view);
        if (OooOo0 == null) {
            OooOo0 = C0724oO00OooO.OooO0o0;
        }
        OooOo0o(OooOo0);
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public C0724oO00OooO OooO0o(int i) {
        return OooOOo(i, false);
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public final C0724oO00OooO OooOO0() {
        if (this.OooO0o0 == null) {
            WindowInsets windowInsets = this.OooO0OO;
            this.OooO0o0 = C0724oO00OooO.OooO0O0(windowInsets.getSystemWindowInsetLeft(), windowInsets.getSystemWindowInsetTop(), windowInsets.getSystemWindowInsetRight(), windowInsets.getSystemWindowInsetBottom());
        }
        return this.OooO0o0;
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public C1536oo0OoOoO OooOO0o(int i, int i2, int i3, int i4) {
        AbstractC1513oo0Oo c1523oo0Oo0o0;
        C1536oo0OoOoO OooO0oO = C1536oo0OoOoO.OooO0oO(null, this.OooO0OO);
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            c1523oo0Oo0o0 = new C1525oo0Oo0oo(OooO0oO);
        } else if (i5 >= 29) {
            c1523oo0Oo0o0 = new C1524oo0Oo0oO(OooO0oO);
        } else {
            c1523oo0Oo0o0 = new C1523oo0Oo0o0(OooO0oO);
        }
        c1523oo0Oo0o0.OooO0oO(C1536oo0OoOoO.OooO0o0(OooOO0(), i, i2, i3, i4));
        c1523oo0Oo0o0.OooO0o0(C1536oo0OoOoO.OooO0o0(OooO0oo(), i, i2, i3, i4));
        return c1523oo0Oo0o0.OooO0O0();
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public boolean OooOOO() {
        return this.OooO0OO.isRound();
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public void OooOOOO(C0724oO00OooO[] c0724oO00OooOArr) {
        this.OooO0Oo = c0724oO00OooOArr;
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public void OooOOOo(C1536oo0OoOoO c1536oo0OoOoO) {
        this.OooO0o = c1536oo0OoOoO;
    }

    public C0724oO00OooO OooOOoo(int i, boolean z) {
        int i2;
        C0410o0Oo00oO OooO0o0;
        int i3;
        int i4;
        int i5;
        int i6 = 0;
        if (i != 1) {
            C0724oO00OooO c0724oO00OooO = null;
            if (i != 2) {
                C0724oO00OooO c0724oO00OooO2 = C0724oO00OooO.OooO0o0;
                if (i != 8) {
                    if (i != 16) {
                        if (i != 32) {
                            if (i != 64) {
                                if (i != 128) {
                                    return c0724oO00OooO2;
                                }
                                C1536oo0OoOoO c1536oo0OoOoO = this.OooO0o;
                                if (c1536oo0OoOoO != null) {
                                    OooO0o0 = c1536oo0OoOoO.OooO00o.OooO0o0();
                                } else {
                                    OooO0o0 = OooO0o0();
                                }
                                if (OooO0o0 != null) {
                                    int i7 = Build.VERSION.SDK_INT;
                                    if (i7 >= 28) {
                                        i3 = AbstractC0408o0Oo00o.OooO0Oo(OooO0o0.OooO00o);
                                    } else {
                                        i3 = 0;
                                    }
                                    if (i7 >= 28) {
                                        i4 = AbstractC0408o0Oo00o.OooO0o(OooO0o0.OooO00o);
                                    } else {
                                        i4 = 0;
                                    }
                                    if (i7 >= 28) {
                                        i5 = AbstractC0408o0Oo00o.OooO0o0(OooO0o0.OooO00o);
                                    } else {
                                        i5 = 0;
                                    }
                                    if (i7 >= 28) {
                                        i6 = AbstractC0408o0Oo00o.OooO0OO(OooO0o0.OooO00o);
                                    }
                                    return C0724oO00OooO.OooO0O0(i3, i4, i5, i6);
                                }
                                return c0724oO00OooO2;
                            }
                            return OooOO0O();
                        }
                        return OooO0oO();
                    }
                    return OooO();
                }
                C0724oO00OooO[] c0724oO00OooOArr = this.OooO0Oo;
                if (c0724oO00OooOArr != null) {
                    c0724oO00OooO = c0724oO00OooOArr[AbstractC1094oOOoOOo0.OooOO0o(8)];
                }
                if (c0724oO00OooO != null) {
                    return c0724oO00OooO;
                }
                C0724oO00OooO OooOO02 = OooOO0();
                C0724oO00OooO OooOo00 = OooOo00();
                int i8 = OooOO02.OooO0Oo;
                if (i8 > OooOo00.OooO0Oo) {
                    return C0724oO00OooO.OooO0O0(0, 0, 0, i8);
                }
                C0724oO00OooO c0724oO00OooO3 = this.OooO0oO;
                if (c0724oO00OooO3 != null && !c0724oO00OooO3.equals(c0724oO00OooO2) && (i2 = this.OooO0oO.OooO0Oo) > OooOo00.OooO0Oo) {
                    return C0724oO00OooO.OooO0O0(0, 0, 0, i2);
                }
                return c0724oO00OooO2;
            } else if (z) {
                C0724oO00OooO OooOo002 = OooOo00();
                C0724oO00OooO OooO0oo2 = OooO0oo();
                return C0724oO00OooO.OooO0O0(Math.max(OooOo002.OooO00o, OooO0oo2.OooO00o), 0, Math.max(OooOo002.OooO0OO, OooO0oo2.OooO0OO), Math.max(OooOo002.OooO0Oo, OooO0oo2.OooO0Oo));
            } else {
                C0724oO00OooO OooOO03 = OooOO0();
                C1536oo0OoOoO c1536oo0OoOoO2 = this.OooO0o;
                if (c1536oo0OoOoO2 != null) {
                    c0724oO00OooO = c1536oo0OoOoO2.OooO00o.OooO0oo();
                }
                int i9 = OooOO03.OooO0Oo;
                if (c0724oO00OooO != null) {
                    i9 = Math.min(i9, c0724oO00OooO.OooO0Oo);
                }
                return C0724oO00OooO.OooO0O0(OooOO03.OooO00o, 0, OooOO03.OooO0OO, i9);
            }
        } else if (z) {
            return C0724oO00OooO.OooO0O0(0, Math.max(OooOo00().OooO0O0, OooOO0().OooO0O0), 0, 0);
        } else {
            return C0724oO00OooO.OooO0O0(0, OooOO0().OooO0O0, 0, 0);
        }
    }

    public void OooOo0o(C0724oO00OooO c0724oO00OooO) {
        this.OooO0oO = c0724oO00OooO;
    }

    @Override // com.ninja.engine.C1533oo0OoOOo
    public boolean equals(Object obj) {
        if (!super.equals(obj)) {
            return false;
        }
        return Objects.equals(this.OooO0oO, ((AbstractC1528oo0OoO00) obj).OooO0oO);
    }
}
