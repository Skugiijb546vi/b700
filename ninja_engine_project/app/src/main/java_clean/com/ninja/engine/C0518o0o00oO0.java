package com.ninja.engine;

import android.os.Bundle;
import android.view.View;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import com.app.framework.core.system.JarConfig;
import com.google.android.material.chip.Chip;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o0o00oO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0518o0o00oO0 extends C0044OoooOOO {
    public final /* synthetic */ o0O00 OooO0OO;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C0518o0o00oO0(o0O00 o0o00) {
        super(0);
        this.OooO0OO = o0o00;
    }

    @Override // com.ninja.engine.C0044OoooOOO
    public final C0039OoooO OooO00o(int i) {
        return new C0039OoooO(AccessibilityNodeInfo.obtain(this.OooO0OO.OooOOO(i).OooO00o));
    }

    @Override // com.ninja.engine.C0044OoooOOO
    public final C0039OoooO OooO0O0(int i) {
        int i2;
        o0O00 o0o00 = this.OooO0OO;
        if (i == 2) {
            i2 = o0o00.OooOO0O;
        } else {
            i2 = o0o00.OooOO0o;
        }
        if (i2 == Integer.MIN_VALUE) {
            return null;
        }
        return OooO00o(i2);
    }

    @Override // com.ninja.engine.C0044OoooOOO
    public final boolean OooO0Oo(int i, int i2, Bundle bundle) {
        int i3;
        o0O00 o0o00 = this.OooO0OO;
        View view = o0o00.OooO;
        if (i != -1) {
            boolean z = true;
            if (i2 != 1) {
                if (i2 != 2) {
                    boolean z2 = false;
                    if (i2 != 64) {
                        if (i2 != 128) {
                            if (i2 != 16) {
                                return false;
                            }
                            Chip chip = o0o00.OooOOO;
                            if (i == 0) {
                                return chip.performClick();
                            }
                            if (i != 1) {
                                return false;
                            }
                            chip.playSoundEffect(0);
                            View.OnClickListener onClickListener = chip.OooO0oo;
                            if (onClickListener != null) {
                                onClickListener.onClick(chip);
                                z2 = true;
                            }
                            if (chip.OooOOoo) {
                                chip.OooOOo.OooOOo0(1, 1);
                                return z2;
                            }
                            return z2;
                        }
                        if (o0o00.OooOO0O == i) {
                            o0o00.OooOO0O = Integer.MIN_VALUE;
                            view.invalidate();
                            o0o00.OooOOo0(i, 65536);
                        }
                        z = false;
                    } else {
                        AccessibilityManager accessibilityManager = o0o00.OooO0oo;
                        if (accessibilityManager.isEnabled() && accessibilityManager.isTouchExplorationEnabled() && (i3 = o0o00.OooOO0O) != i) {
                            if (i3 != Integer.MIN_VALUE) {
                                o0o00.OooOO0O = Integer.MIN_VALUE;
                                o0o00.OooO.invalidate();
                                o0o00.OooOOo0(i3, 65536);
                            }
                            o0o00.OooOO0O = i;
                            view.invalidate();
                            o0o00.OooOOo0(i, JarConfig.MAX_BUFFER_SIZE);
                        }
                        z = false;
                    }
                    return z;
                }
                return o0o00.OooOO0(i);
            }
            return o0o00.OooOOOo(i);
        }
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        return view.performAccessibilityAction(i2, bundle);
    }
}


