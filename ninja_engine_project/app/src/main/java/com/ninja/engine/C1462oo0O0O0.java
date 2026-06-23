package com.ninja.engine;

import android.content.Context;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.OverScroller;
import com.android.volley.toolbox.ImageRequest;
import java.util.Arrays;
/* renamed from: com.ninja.engine.oo0O0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1462oo0O0O0 {
    public static final InterpolatorC1047oOOo0 OooOo0O = new InterpolatorC1047oOOo0(1);
    public int[] OooO;
    public int OooO00o;
    public final int OooO0O0;
    public float[] OooO0Oo;
    public float[] OooO0o;
    public float[] OooO0o0;
    public float[] OooO0oO;
    public int[] OooO0oo;
    public int[] OooOO0;
    public int OooOO0O;
    public VelocityTracker OooOO0o;
    public final float OooOOO;
    public final float OooOOO0;
    public final int OooOOOO;
    public final OverScroller OooOOOo;
    public View OooOOo;
    public final AbstractC1094oOOoOOo0 OooOOo0;
    public boolean OooOOoo;
    public final ViewGroup OooOo00;
    public int OooO0OO = -1;
    public final o00000OO OooOo0 = new o00000OO(17, this);

    public C1462oo0O0O0(Context context, ViewGroup viewGroup, AbstractC1094oOOoOOo0 abstractC1094oOOoOOo0) {
        if (viewGroup != null) {
            if (abstractC1094oOOoOOo0 != null) {
                this.OooOo00 = viewGroup;
                this.OooOOo0 = abstractC1094oOOoOOo0;
                ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
                this.OooOOOO = (int) ((context.getResources().getDisplayMetrics().density * 20.0f) + 0.5f);
                this.OooO0O0 = viewConfiguration.getScaledTouchSlop();
                this.OooOOO0 = viewConfiguration.getScaledMaximumFlingVelocity();
                this.OooOOO = viewConfiguration.getScaledMinimumFlingVelocity();
                this.OooOOOo = new OverScroller(context, OooOo0O);
                return;
            }
            throw new IllegalArgumentException("Callback may not be null");
        }
        throw new IllegalArgumentException("Parent view may not be null");
    }

    public final void OooO(MotionEvent motionEvent) {
        boolean z;
        int i;
        int actionMasked = motionEvent.getActionMasked();
        int actionIndex = motionEvent.getActionIndex();
        if (actionMasked == 0) {
            OooO00o();
        }
        if (this.OooOO0o == null) {
            this.OooOO0o = VelocityTracker.obtain();
        }
        this.OooOO0o.addMovement(motionEvent);
        int i2 = 0;
        if (actionMasked != 0) {
            if (actionMasked != 1) {
                AbstractC1094oOOoOOo0 abstractC1094oOOoOOo0 = this.OooOOo0;
                if (actionMasked != 2) {
                    if (actionMasked != 3) {
                        if (actionMasked != 5) {
                            if (actionMasked == 6) {
                                int pointerId = motionEvent.getPointerId(actionIndex);
                                if (this.OooO00o == 1 && pointerId == this.OooO0OO) {
                                    int pointerCount = motionEvent.getPointerCount();
                                    while (true) {
                                        if (i2 < pointerCount) {
                                            int pointerId2 = motionEvent.getPointerId(i2);
                                            if (pointerId2 != this.OooO0OO) {
                                                View OooO0oO = OooO0oO((int) motionEvent.getX(i2), (int) motionEvent.getY(i2));
                                                View view = this.OooOOo;
                                                if (OooO0oO == view && OooOOOo(view, pointerId2)) {
                                                    i = this.OooO0OO;
                                                    break;
                                                }
                                            }
                                            i2++;
                                        } else {
                                            i = -1;
                                            break;
                                        }
                                    }
                                    if (i == -1) {
                                        OooOO0();
                                    }
                                }
                                OooO0Oo(pointerId);
                                return;
                            }
                            return;
                        }
                        int pointerId3 = motionEvent.getPointerId(actionIndex);
                        float x = motionEvent.getX(actionIndex);
                        float y = motionEvent.getY(actionIndex);
                        OooOO0O(x, y, pointerId3);
                        if (this.OooO00o == 0) {
                            OooOOOo(OooO0oO((int) x, (int) y), pointerId3);
                            int i3 = this.OooO0oo[pointerId3];
                            return;
                        }
                        int i4 = (int) x;
                        int i5 = (int) y;
                        View view2 = this.OooOOo;
                        if (view2 != null && i4 >= view2.getLeft() && i4 < view2.getRight() && i5 >= view2.getTop() && i5 < view2.getBottom()) {
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            OooOOOo(this.OooOOo, pointerId3);
                            return;
                        }
                        return;
                    } else if (this.OooO00o == 1) {
                        this.OooOOoo = true;
                        abstractC1094oOOoOOo0.OooOOo(this.OooOOo, 0.0f, 0.0f);
                        this.OooOOoo = false;
                        if (this.OooO00o == 1) {
                            OooOOO0(0);
                        }
                    }
                } else {
                    if (this.OooO00o == 1) {
                        int i6 = this.OooO0OO;
                        if ((this.OooOO0O & (1 << i6)) != 0) {
                            i2 = 1;
                        }
                        if (i2 != 0) {
                            int findPointerIndex = motionEvent.findPointerIndex(i6);
                            float x2 = motionEvent.getX(findPointerIndex);
                            float y2 = motionEvent.getY(findPointerIndex);
                            float[] fArr = this.OooO0o;
                            int i7 = this.OooO0OO;
                            int i8 = (int) (x2 - fArr[i7]);
                            int i9 = (int) (y2 - this.OooO0oO[i7]);
                            int left = this.OooOOo.getLeft() + i8;
                            int top = this.OooOOo.getTop() + i9;
                            int left2 = this.OooOOo.getLeft();
                            int top2 = this.OooOOo.getTop();
                            if (i8 != 0) {
                                left = abstractC1094oOOoOOo0.OooO00o(this.OooOOo, left);
                                AbstractC1460oo0O00oo.OooOO0(this.OooOOo, left - left2);
                            }
                            if (i9 != 0) {
                                top = abstractC1094oOOoOOo0.OooO0O0(this.OooOOo, top);
                                AbstractC1460oo0O00oo.OooOO0O(this.OooOOo, top - top2);
                            }
                            if (i8 != 0 || i9 != 0) {
                                abstractC1094oOOoOOo0.OooOOo0(this.OooOOo, left, top);
                            }
                        } else {
                            return;
                        }
                    } else {
                        int pointerCount2 = motionEvent.getPointerCount();
                        for (int i10 = 0; i10 < pointerCount2; i10++) {
                            int pointerId4 = motionEvent.getPointerId(i10);
                            if ((this.OooOO0O & (1 << pointerId4)) != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (z) {
                                float x3 = motionEvent.getX(i10);
                                float y3 = motionEvent.getY(i10);
                                float f = x3 - this.OooO0Oo[pointerId4];
                                float f2 = y3 - this.OooO0o0[pointerId4];
                                Math.abs(f);
                                Math.abs(f2);
                                int i11 = this.OooO0oo[pointerId4];
                                Math.abs(f2);
                                Math.abs(f);
                                int i12 = this.OooO0oo[pointerId4];
                                Math.abs(f);
                                Math.abs(f2);
                                int i13 = this.OooO0oo[pointerId4];
                                Math.abs(f2);
                                Math.abs(f);
                                int i14 = this.OooO0oo[pointerId4];
                                if (this.OooO00o == 1) {
                                    break;
                                }
                                View OooO0oO2 = OooO0oO((int) x3, (int) y3);
                                if (OooO0OO(OooO0oO2, f, f2) && OooOOOo(OooO0oO2, pointerId4)) {
                                    break;
                                }
                            }
                        }
                    }
                    OooOO0o(motionEvent);
                    return;
                }
            } else if (this.OooO00o == 1) {
                OooOO0();
            }
            OooO00o();
            return;
        }
        float x4 = motionEvent.getX();
        float y4 = motionEvent.getY();
        int pointerId5 = motionEvent.getPointerId(0);
        View OooO0oO3 = OooO0oO((int) x4, (int) y4);
        OooOO0O(x4, y4, pointerId5);
        OooOOOo(OooO0oO3, pointerId5);
        int i15 = this.OooO0oo[pointerId5];
    }

    public final void OooO00o() {
        this.OooO0OO = -1;
        float[] fArr = this.OooO0Oo;
        if (fArr != null) {
            Arrays.fill(fArr, 0.0f);
            Arrays.fill(this.OooO0o0, 0.0f);
            Arrays.fill(this.OooO0o, 0.0f);
            Arrays.fill(this.OooO0oO, 0.0f);
            Arrays.fill(this.OooO0oo, 0);
            Arrays.fill(this.OooO, 0);
            Arrays.fill(this.OooOO0, 0);
            this.OooOO0O = 0;
        }
        VelocityTracker velocityTracker = this.OooOO0o;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.OooOO0o = null;
        }
    }

    public final void OooO0O0(View view, int i) {
        ViewParent parent = view.getParent();
        ViewGroup viewGroup = this.OooOo00;
        if (parent == viewGroup) {
            this.OooOOo = view;
            this.OooO0OO = i;
            this.OooOOo0.OooOOOO(view, i);
            OooOOO0(1);
            return;
        }
        throw new IllegalArgumentException("captureChildView: parameter must be a descendant of the ViewDragHelper's tracked parent view (" + viewGroup + ")");
    }

    public final boolean OooO0OO(View view, float f, float f2) {
        boolean z;
        boolean z2;
        if (view == null) {
            return false;
        }
        AbstractC1094oOOoOOo0 abstractC1094oOOoOOo0 = this.OooOOo0;
        if (abstractC1094oOOoOOo0.OooOO0(view) > 0) {
            z = true;
        } else {
            z = false;
        }
        if (abstractC1094oOOoOOo0.OooOO0O() > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && z2) {
            float f3 = f2 * f2;
            int i = this.OooO0O0;
            if (f3 + (f * f) <= i * i) {
                return false;
            }
            return true;
        } else if (z) {
            if (Math.abs(f) <= this.OooO0O0) {
                return false;
            }
            return true;
        } else if (!z2 || Math.abs(f2) <= this.OooO0O0) {
            return false;
        } else {
            return true;
        }
    }

    public final void OooO0Oo(int i) {
        float[] fArr = this.OooO0Oo;
        if (fArr != null) {
            int i2 = this.OooOO0O;
            int i3 = 1 << i;
            if ((i2 & i3) != 0) {
                fArr[i] = 0.0f;
                this.OooO0o0[i] = 0.0f;
                this.OooO0o[i] = 0.0f;
                this.OooO0oO[i] = 0.0f;
                this.OooO0oo[i] = 0;
                this.OooO[i] = 0;
                this.OooOO0[i] = 0;
                this.OooOO0O = (~i3) & i2;
            }
        }
    }

    public final boolean OooO0o() {
        if (this.OooO00o == 2) {
            OverScroller overScroller = this.OooOOOo;
            boolean computeScrollOffset = overScroller.computeScrollOffset();
            int currX = overScroller.getCurrX();
            int currY = overScroller.getCurrY();
            int left = currX - this.OooOOo.getLeft();
            int top = currY - this.OooOOo.getTop();
            if (left != 0) {
                AbstractC1460oo0O00oo.OooOO0(this.OooOOo, left);
            }
            if (top != 0) {
                AbstractC1460oo0O00oo.OooOO0O(this.OooOOo, top);
            }
            if (left != 0 || top != 0) {
                this.OooOOo0.OooOOo0(this.OooOOo, currX, currY);
            }
            if (computeScrollOffset && currX == overScroller.getFinalX() && currY == overScroller.getFinalY()) {
                overScroller.abortAnimation();
                computeScrollOffset = false;
            }
            if (!computeScrollOffset) {
                this.OooOo00.post(this.OooOo0);
            }
        }
        if (this.OooO00o != 2) {
            return false;
        }
        return true;
    }

    public final int OooO0o0(int i, int i2, int i3) {
        int width;
        int abs;
        if (i == 0) {
            return 0;
        }
        float width2 = this.OooOo00.getWidth() / 2;
        float sin = (((float) Math.sin((Math.min(1.0f, Math.abs(i) / width) - 0.5f) * 0.47123894f)) * width2) + width2;
        int abs2 = Math.abs(i2);
        if (abs2 > 0) {
            abs = Math.round(Math.abs(sin / abs2) * 1000.0f) * 4;
        } else {
            abs = (int) (((Math.abs(i) / i3) + 1.0f) * 256.0f);
        }
        return Math.min(abs, 600);
    }

    public final View OooO0oO(int i, int i2) {
        ViewGroup viewGroup = this.OooOo00;
        for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
            this.OooOOo0.getClass();
            View childAt = viewGroup.getChildAt(childCount);
            if (i >= childAt.getLeft() && i < childAt.getRight() && i2 >= childAt.getTop() && i2 < childAt.getBottom()) {
                return childAt;
            }
        }
        return null;
    }

    public final boolean OooO0oo(int i, int i2, int i3, int i4) {
        float f;
        float f2;
        float f3;
        float f4;
        int left = this.OooOOo.getLeft();
        int top = this.OooOOo.getTop();
        int i5 = i - left;
        int i6 = i2 - top;
        OverScroller overScroller = this.OooOOOo;
        if (i5 == 0 && i6 == 0) {
            overScroller.abortAnimation();
            OooOOO0(0);
            return false;
        }
        View view = this.OooOOo;
        int i7 = (int) this.OooOOO;
        int i8 = (int) this.OooOOO0;
        int abs = Math.abs(i3);
        if (abs < i7) {
            i3 = 0;
        } else if (abs > i8) {
            if (i3 > 0) {
                i3 = i8;
            } else {
                i3 = -i8;
            }
        }
        int abs2 = Math.abs(i4);
        if (abs2 < i7) {
            i4 = 0;
        } else if (abs2 > i8) {
            if (i4 > 0) {
                i4 = i8;
            } else {
                i4 = -i8;
            }
        }
        int abs3 = Math.abs(i5);
        int abs4 = Math.abs(i6);
        int abs5 = Math.abs(i3);
        int abs6 = Math.abs(i4);
        int i9 = abs5 + abs6;
        int i10 = abs3 + abs4;
        if (i3 != 0) {
            f = abs5;
            f2 = i9;
        } else {
            f = abs3;
            f2 = i10;
        }
        float f5 = f / f2;
        if (i4 != 0) {
            f3 = abs6;
            f4 = i9;
        } else {
            f3 = abs4;
            f4 = i10;
        }
        float f6 = f3 / f4;
        AbstractC1094oOOoOOo0 abstractC1094oOOoOOo0 = this.OooOOo0;
        overScroller.startScroll(left, top, i5, i6, (int) ((OooO0o0(i6, i4, abstractC1094oOOoOOo0.OooOO0O()) * f6) + (OooO0o0(i5, i3, abstractC1094oOOoOOo0.OooOO0(view)) * f5)));
        OooOOO0(2);
        return true;
    }

    public final void OooOO0() {
        VelocityTracker velocityTracker = this.OooOO0o;
        float f = this.OooOOO0;
        velocityTracker.computeCurrentVelocity(ImageRequest.DEFAULT_IMAGE_TIMEOUT_MS, f);
        float xVelocity = this.OooOO0o.getXVelocity(this.OooO0OO);
        float f2 = this.OooOOO;
        float abs = Math.abs(xVelocity);
        float f3 = 0.0f;
        if (abs < f2) {
            xVelocity = 0.0f;
        } else if (abs > f) {
            if (xVelocity > 0.0f) {
                xVelocity = f;
            } else {
                xVelocity = -f;
            }
        }
        float yVelocity = this.OooOO0o.getYVelocity(this.OooO0OO);
        float abs2 = Math.abs(yVelocity);
        if (abs2 >= f2) {
            if (abs2 > f) {
                if (yVelocity <= 0.0f) {
                    f = -f;
                }
                f3 = f;
            } else {
                f3 = yVelocity;
            }
        }
        this.OooOOoo = true;
        this.OooOOo0.OooOOo(this.OooOOo, xVelocity, f3);
        this.OooOOoo = false;
        if (this.OooO00o == 1) {
            OooOOO0(0);
        }
    }

    public final void OooOO0O(float f, float f2, int i) {
        float[] fArr = this.OooO0Oo;
        int i2 = 0;
        if (fArr == null || fArr.length <= i) {
            int i3 = i + 1;
            float[] fArr2 = new float[i3];
            float[] fArr3 = new float[i3];
            float[] fArr4 = new float[i3];
            float[] fArr5 = new float[i3];
            int[] iArr = new int[i3];
            int[] iArr2 = new int[i3];
            int[] iArr3 = new int[i3];
            if (fArr != null) {
                System.arraycopy(fArr, 0, fArr2, 0, fArr.length);
                float[] fArr6 = this.OooO0o0;
                System.arraycopy(fArr6, 0, fArr3, 0, fArr6.length);
                float[] fArr7 = this.OooO0o;
                System.arraycopy(fArr7, 0, fArr4, 0, fArr7.length);
                float[] fArr8 = this.OooO0oO;
                System.arraycopy(fArr8, 0, fArr5, 0, fArr8.length);
                int[] iArr4 = this.OooO0oo;
                System.arraycopy(iArr4, 0, iArr, 0, iArr4.length);
                int[] iArr5 = this.OooO;
                System.arraycopy(iArr5, 0, iArr2, 0, iArr5.length);
                int[] iArr6 = this.OooOO0;
                System.arraycopy(iArr6, 0, iArr3, 0, iArr6.length);
            }
            this.OooO0Oo = fArr2;
            this.OooO0o0 = fArr3;
            this.OooO0o = fArr4;
            this.OooO0oO = fArr5;
            this.OooO0oo = iArr;
            this.OooO = iArr2;
            this.OooOO0 = iArr3;
        }
        float[] fArr9 = this.OooO0Oo;
        this.OooO0o[i] = f;
        fArr9[i] = f;
        float[] fArr10 = this.OooO0o0;
        this.OooO0oO[i] = f2;
        fArr10[i] = f2;
        int[] iArr7 = this.OooO0oo;
        int i4 = (int) f;
        int i5 = (int) f2;
        ViewGroup viewGroup = this.OooOo00;
        int left = viewGroup.getLeft();
        int i6 = this.OooOOOO;
        if (i4 < left + i6) {
            i2 = 1;
        }
        if (i5 < viewGroup.getTop() + i6) {
            i2 |= 4;
        }
        if (i4 > viewGroup.getRight() - i6) {
            i2 |= 2;
        }
        if (i5 > viewGroup.getBottom() - i6) {
            i2 |= 8;
        }
        iArr7[i] = i2;
        this.OooOO0O |= 1 << i;
    }

    public final void OooOO0o(MotionEvent motionEvent) {
        int pointerCount = motionEvent.getPointerCount();
        for (int i = 0; i < pointerCount; i++) {
            int pointerId = motionEvent.getPointerId(i);
            if ((this.OooOO0O & (1 << pointerId)) != 0) {
                float x = motionEvent.getX(i);
                float y = motionEvent.getY(i);
                this.OooO0o[pointerId] = x;
                this.OooO0oO[pointerId] = y;
            }
        }
    }

    public final boolean OooOOO(int i, int i2) {
        if (this.OooOOoo) {
            return OooO0oo(i, i2, (int) this.OooOO0o.getXVelocity(this.OooO0OO), (int) this.OooOO0o.getYVelocity(this.OooO0OO));
        }
        throw new IllegalStateException("Cannot settleCapturedViewAt outside of a call to Callback#onViewReleased");
    }

    public final void OooOOO0(int i) {
        this.OooOo00.removeCallbacks(this.OooOo0);
        if (this.OooO00o != i) {
            this.OooO00o = i;
            this.OooOOo0.OooOOOo(i);
            if (this.OooO00o == 0) {
                this.OooOOo = null;
            }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00cc, code lost:
        if (r12 != r11) goto L54;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean OooOOOO(android.view.MotionEvent r18) {
        /*
            Method dump skipped, instructions count: 322
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C1462oo0O0O0.OooOOOO(android.view.MotionEvent):boolean");
    }

    public final boolean OooOOOo(View view, int i) {
        if (view == this.OooOOo && this.OooO0OO == i) {
            return true;
        }
        if (view != null && this.OooOOo0.OooOo(view, i)) {
            this.OooO0OO = i;
            OooO0O0(view, i);
            return true;
        }
        return false;
    }
}

