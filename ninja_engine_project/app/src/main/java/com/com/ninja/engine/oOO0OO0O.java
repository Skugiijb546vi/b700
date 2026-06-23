package com.ninja.engine;

import android.view.View;
import android.view.ViewParent;
import java.util.Objects;
/* loaded from: classes.dex */
public final class oOO0OO0O {
    public ViewParent OooO00o;
    public ViewParent OooO0O0;
    public final View OooO0OO;
    public boolean OooO0Oo;
    public int[] OooO0o0;

    public oOO0OO0O(View view) {
        this.OooO0OO = view;
    }

    public final void OooO(int i) {
        ViewParent OooO0o = OooO0o(i);
        if (OooO0o != null) {
            boolean z = OooO0o instanceof InterfaceC0928oOO0OO0o;
            View view = this.OooO0OO;
            if (z) {
                ((InterfaceC0928oOO0OO0o) OooO0o).OooO0O0(view, i);
            } else if (i == 0) {
                try {
                    OooO0o.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                    Objects.toString(OooO0o);
                }
            }
            if (i != 0) {
                if (i == 1) {
                    this.OooO0O0 = null;
                    return;
                }
                return;
            }
            this.OooO00o = null;
        }
    }

    public final boolean OooO00o(float f, float f2, boolean z) {
        ViewParent OooO0o;
        if (!this.OooO0Oo || (OooO0o = OooO0o(0)) == null) {
            return false;
        }
        try {
            return OooO0o.onNestedFling(this.OooO0OO, f, f2, z);
        } catch (AbstractMethodError unused) {
            Objects.toString(OooO0o);
            return false;
        }
    }

    public final boolean OooO0O0(float f, float f2) {
        ViewParent OooO0o;
        if (!this.OooO0Oo || (OooO0o = OooO0o(0)) == null) {
            return false;
        }
        try {
            return OooO0o.onNestedPreFling(this.OooO0OO, f, f2);
        } catch (AbstractMethodError unused) {
            Objects.toString(OooO0o);
            return false;
        }
    }

    public final boolean OooO0OO(int i, int i2, int i3, int[] iArr, int[] iArr2) {
        ViewParent OooO0o;
        int i4;
        int i5;
        int[] iArr3;
        if (!this.OooO0Oo || (OooO0o = OooO0o(i3)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0) {
            if (iArr2 == null) {
                return false;
            }
            iArr2[0] = 0;
            iArr2[1] = 0;
            return false;
        }
        View view = this.OooO0OO;
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            i4 = iArr2[0];
            i5 = iArr2[1];
        } else {
            i4 = 0;
            i5 = 0;
        }
        if (iArr == null) {
            if (this.OooO0o0 == null) {
                this.OooO0o0 = new int[2];
            }
            iArr3 = this.OooO0o0;
        } else {
            iArr3 = iArr;
        }
        iArr3[0] = 0;
        iArr3[1] = 0;
        boolean z = OooO0o instanceof InterfaceC0928oOO0OO0o;
        View view2 = this.OooO0OO;
        if (z) {
            ((InterfaceC0928oOO0OO0o) OooO0o).OooO0OO(view2, i, i2, iArr3, i3);
        } else if (i3 == 0) {
            try {
                OooO0o.onNestedPreScroll(view2, i, i2, iArr3);
            } catch (AbstractMethodError unused) {
                Objects.toString(OooO0o);
            }
        }
        if (iArr2 != null) {
            view.getLocationInWindow(iArr2);
            iArr2[0] = iArr2[0] - i4;
            iArr2[1] = iArr2[1] - i5;
        }
        if (iArr3[0] == 0 && iArr3[1] == 0) {
            return false;
        }
        return true;
    }

    public final void OooO0Oo(int i, int i2, int i3, int[] iArr) {
        OooO0o0(0, i, 0, i2, null, i3, iArr);
    }

    public final ViewParent OooO0o(int i) {
        if (i != 0) {
            if (i != 1) {
                return null;
            }
            return this.OooO0O0;
        }
        return this.OooO00o;
    }

    public final boolean OooO0o0(int i, int i2, int i3, int i4, int[] iArr, int i5, int[] iArr2) {
        ViewParent OooO0o;
        int i6;
        int i7;
        int[] iArr3;
        if (!this.OooO0Oo || (OooO0o = OooO0o(i5)) == null) {
            return false;
        }
        if (i == 0 && i2 == 0 && i3 == 0 && i4 == 0) {
            if (iArr != null) {
                iArr[0] = 0;
                iArr[1] = 0;
            }
            return false;
        }
        View view = this.OooO0OO;
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            i6 = iArr[0];
            i7 = iArr[1];
        } else {
            i6 = 0;
            i7 = 0;
        }
        if (iArr2 == null) {
            if (this.OooO0o0 == null) {
                this.OooO0o0 = new int[2];
            }
            int[] iArr4 = this.OooO0o0;
            iArr4[0] = 0;
            iArr4[1] = 0;
            iArr3 = iArr4;
        } else {
            iArr3 = iArr2;
        }
        boolean z = OooO0o instanceof oOO0OO;
        View view2 = this.OooO0OO;
        if (z) {
            ((oOO0OO) OooO0o).OooO0Oo(view2, i, i2, i3, i4, i5, iArr3);
        } else {
            iArr3[0] = iArr3[0] + i3;
            iArr3[1] = iArr3[1] + i4;
            if (OooO0o instanceof InterfaceC0928oOO0OO0o) {
                ((InterfaceC0928oOO0OO0o) OooO0o).OooO0o0(view2, i, i2, i3, i4, i5);
            } else if (i5 == 0) {
                try {
                    OooO0o.onNestedScroll(view2, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                    Objects.toString(OooO0o);
                }
            }
        }
        if (iArr != null) {
            view.getLocationInWindow(iArr);
            iArr[0] = iArr[0] - i6;
            iArr[1] = iArr[1] - i7;
        }
        return true;
    }

    public final boolean OooO0oO(int i) {
        if (OooO0o(i) != null) {
            return true;
        }
        return false;
    }

    public final boolean OooO0oo(int i, int i2) {
        boolean onStartNestedScroll;
        if (OooO0oO(i2)) {
            return true;
        }
        if (this.OooO0Oo) {
            View view = this.OooO0OO;
            View view2 = view;
            for (ViewParent parent = view.getParent(); parent != null; parent = parent.getParent()) {
                boolean z = parent instanceof InterfaceC0928oOO0OO0o;
                if (z) {
                    onStartNestedScroll = ((InterfaceC0928oOO0OO0o) parent).OooO0o(view2, view, i, i2);
                } else {
                    if (i2 == 0) {
                        try {
                            onStartNestedScroll = parent.onStartNestedScroll(view2, view, i);
                        } catch (AbstractMethodError unused) {
                            Objects.toString(parent);
                        }
                    }
                    onStartNestedScroll = false;
                }
                if (onStartNestedScroll) {
                    if (i2 != 0) {
                        if (i2 == 1) {
                            this.OooO0O0 = parent;
                        }
                    } else {
                        this.OooO00o = parent;
                    }
                    if (z) {
                        ((InterfaceC0928oOO0OO0o) parent).OooO00o(view2, view, i, i2);
                    } else if (i2 == 0) {
                        try {
                            parent.onNestedScrollAccepted(view2, view, i);
                        } catch (AbstractMethodError unused2) {
                            Objects.toString(parent);
                        }
                    }
                    return true;
                }
                if (parent instanceof View) {
                    view2 = parent;
                }
            }
        }
        return false;
    }
}
