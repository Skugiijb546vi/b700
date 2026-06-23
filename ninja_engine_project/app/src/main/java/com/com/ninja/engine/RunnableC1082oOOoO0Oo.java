package com.ninja.engine;

import android.os.Build;
import android.view.animation.Interpolator;
import android.widget.OverScroller;
import androidx.recyclerview.widget.RecyclerView;
import java.util.Arrays;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oOOoO0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1082oOOoO0Oo implements Runnable {
    public int OooO00o;
    public int OooO0O0;
    public OverScroller OooO0OO;
    public Interpolator OooO0Oo;
    public boolean OooO0o;
    public boolean OooO0o0;
    public final /* synthetic */ RecyclerView OooO0oO;

    public RunnableC1082oOOoO0Oo(RecyclerView recyclerView) {
        this.OooO0oO = recyclerView;
         animation_interpolatorc1047oooo0 = RecyclerView.o0ooOoO;
        this.OooO0Oo = animation_interpolatorc1047oooo0;
        this.OooO0o0 = false;
        this.OooO0o = false;
        this.OooO0OO = new OverScroller(recyclerView.getContext(), animation_interpolatorc1047oooo0);
    }

    public final void OooO00o() {
        if (this.OooO0o0) {
            this.OooO0o = true;
            return;
        }
        RecyclerView recyclerView = this.OooO0oO;
        recyclerView.removeCallbacks(this);
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        recyclerView.postOnAnimation(this);
    }

    public final void OooO0O0(int i, int i2, int i3, Interpolator interpolator) {
        boolean z;
        int height;
        int i4;
        RecyclerView recyclerView = this.OooO0oO;
        if (i3 == Integer.MIN_VALUE) {
            int abs = Math.abs(i);
            int abs2 = Math.abs(i2);
            if (abs > abs2) {
                z = true;
            } else {
                z = false;
            }
            int sqrt = (int) Math.sqrt(0);
            int sqrt2 = (int) Math.sqrt((i2 * i2) + (i * i));
            if (z) {
                height = recyclerView.getWidth();
            } else {
                height = recyclerView.getHeight();
            }
            int i5 = height / 2;
            float f = height;
            float f2 = i5;
            float sin = (((float) Math.sin((Math.min(1.0f, (sqrt2 * 1.0f) / f) - 0.5f) * 0.47123894f)) * f2) + f2;
            if (sqrt > 0) {
                i4 = Math.round(Math.abs(sin / sqrt) * 1000.0f) * 4;
            } else {
                if (!z) {
                    abs = abs2;
                }
                i4 = (int) (((abs / f) + 1.0f) * 300.0f);
            }
            i3 = Math.min(i4, 2000);
        }
        int i6 = i3;
        if (interpolator == null) {
            interpolator = RecyclerView.o0ooOoO;
        }
        if (this.OooO0Oo != interpolator) {
            this.OooO0Oo = interpolator;
            this.OooO0OO = new OverScroller(recyclerView.getContext(), interpolator);
        }
        this.OooO0O0 = 0;
        this.OooO00o = 0;
        recyclerView.setScrollState(2);
        this.OooO0OO.startScroll(0, 0, i, i2, i6);
        if (Build.VERSION.SDK_INT < 23) {
            this.OooO0OO.computeScrollOffset();
        }
        OooO00o();
    }

    @Override // java.lang.Runnable
    public final void run() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean awakenScrollBars;
        boolean z;
        boolean z2;
        boolean z3;
        int i5;
        RecyclerView recyclerView = this.OooO0oO;
        if (recyclerView.OooOOO0 == null) {
            recyclerView.removeCallbacks(this);
            this.OooO0OO.abortAnimation();
            return;
        }
        this.OooO0o = false;
        this.OooO0o0 = true;
        recyclerView.OooOOO0();
        OverScroller overScroller = this.OooO0OO;
        if (overScroller.computeScrollOffset()) {
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int i6 = currX - this.OooO00o;
            int i7 = currY - this.OooO0O0;
            this.OooO00o = currX;
            this.OooO0O0 = currY;
            int[] iArr = recyclerView.o00Oo0;
            iArr[0] = 0;
            iArr[1] = 0;
            boolean OooOOo = recyclerView.OooOOo(i6, i7, 1, iArr, null);
            int[] iArr2 = recyclerView.o00Oo0;
            if (OooOOo) {
                i6 -= iArr2[0];
                i7 -= iArr2[1];
            }
            if (recyclerView.getOverScrollMode() != 2) {
                recyclerView.OooOO0o(i6, i7);
            }
            if (recyclerView.OooOO0o != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
                recyclerView.OoooOoO(i6, i7, iArr2);
                int i8 = iArr2[0];
                int i9 = iArr2[1];
                int i10 = i6 - i8;
                int i11 = i7 - i9;
                oO0OO00 oo0oo00 = recyclerView.OooOOO0.OooO0o0;
                if (oo0oo00 != null && !oo0oo00.OooO0Oo && oo0oo00.OooO0o0) {
                    int OooO0O0 = recyclerView.Ooooo00.OooO0O0();
                    if (OooO0O0 == 0) {
                        oo0oo00.OooO();
                    } else {
                        if (oo0oo00.OooO00o >= OooO0O0) {
                            oo0oo00.OooO00o = OooO0O0 - 1;
                        }
                        oo0oo00.OooO0oO(i8, i9);
                    }
                }
                i4 = i8;
                i = i10;
                i2 = i11;
                i3 = i9;
            } else {
                i = i6;
                i2 = i7;
                i3 = 0;
                i4 = 0;
            }
            if (!recyclerView.OooOOO.isEmpty()) {
                recyclerView.invalidate();
            }
            int[] iArr3 = recyclerView.o00Oo0;
            iArr3[0] = 0;
            iArr3[1] = 0;
            int i12 = i3;
            recyclerView.OooOOoo(i4, i3, i, i2, null, 1, iArr3);
            int i13 = i - iArr2[0];
            int i14 = i2 - iArr2[1];
            if (i4 != 0 || i12 != 0) {
                recyclerView.OooOo00(i4, i12);
            }
            awakenScrollBars = recyclerView.awakenScrollBars();
            if (!awakenScrollBars) {
                recyclerView.invalidate();
            }
            if (overScroller.getCurrX() == overScroller.getFinalX()) {
                z = true;
            } else {
                z = false;
            }
            if (overScroller.getCurrY() == overScroller.getFinalY()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!overScroller.isFinished() && ((!z && i13 == 0) || (!z2 && i14 == 0))) {
                z3 = false;
            } else {
                z3 = true;
            }
            oO0OO00 oo0oo002 = recyclerView.OooOOO0.OooO0o0;
            if ((oo0oo002 == null || !oo0oo002.OooO0Oo) && z3) {
                if (recyclerView.getOverScrollMode() != 2) {
                    int currVelocity = (int) overScroller.getCurrVelocity();
                    if (i13 < 0) {
                        i5 = -currVelocity;
                    } else if (i13 > 0) {
                        i5 = currVelocity;
                    } else {
                        i5 = 0;
                    }
                    if (i14 < 0) {
                        currVelocity = -currVelocity;
                    } else if (i14 <= 0) {
                        currVelocity = 0;
                    }
                    if (i5 < 0) {
                        recyclerView.OooOo0O();
                        if (recyclerView.Oooo000.isFinished()) {
                            recyclerView.Oooo000.onAbsorb(-i5);
                        }
                    } else if (i5 > 0) {
                        recyclerView.OooOo0o();
                        if (recyclerView.Oooo00o.isFinished()) {
                            recyclerView.Oooo00o.onAbsorb(i5);
                        }
                    }
                    if (currVelocity < 0) {
                        recyclerView.OooOo();
                        if (recyclerView.Oooo00O.isFinished()) {
                            recyclerView.Oooo00O.onAbsorb(-currVelocity);
                        }
                    } else if (currVelocity > 0) {
                        recyclerView.OooOo0();
                        if (recyclerView.Oooo0.isFinished()) {
                            recyclerView.Oooo0.onAbsorb(currVelocity);
                        }
                    }
                    if (i5 != 0 || currVelocity != 0) {
                        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                        recyclerView.postInvalidateOnAnimation();
                    }
                }
                if (RecyclerView.o0ooOO0) {
                    C0671o0ooo0O c0671o0ooo0O = recyclerView.OoooOoo;
                    int[] iArr4 = (int[]) c0671o0ooo0O.OooO0Oo;
                    if (iArr4 != null) {
                        Arrays.fill(iArr4, -1);
                    }
                    c0671o0ooo0O.OooO0OO = 0;
                }
            } else {
                OooO00o();
                RunnableC0672o0ooo0o runnableC0672o0ooo0o = recyclerView.OoooOoO;
                if (runnableC0672o0ooo0o != null) {
                    runnableC0672o0ooo0o.OooO00o(recyclerView, i4, i12);
                }
            }
        }
        oO0OO00 oo0oo003 = recyclerView.OooOOO0.OooO0o0;
        if (oo0oo003 != null && oo0oo003.OooO0Oo) {
            oo0oo003.OooO0oO(0, 0);
        }
        this.OooO0o0 = false;
        if (this.OooO0o) {
            recyclerView.removeCallbacks(this);
            WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
            recyclerView.postOnAnimation(this);
            return;
        }
        recyclerView.setScrollState(0);
        recyclerView.OooooOO(1);
    }
}

