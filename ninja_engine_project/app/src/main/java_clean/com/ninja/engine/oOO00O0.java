package com.ninja.engine;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import com.app.framework.utils.ShellUtils;
import java.util.ArrayList;
/* loaded from: classes.dex */
public final class oOO00O0 {
    public final C1218oOoOOoo OooO00o = new C1218oOoOOoo();
    public final C1218oOoOOoo OooO0O0 = new C1218oOoOOoo();

    public static oOO00O0 OooO00o(Context context, int i) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i);
            if (loadAnimator instanceof AnimatorSet) {
                return OooO0O0(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return OooO0O0(arrayList);
        } catch (Exception unused) {
            Integer.toHexString(i);
            return null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v1, types: [java.lang.Object, com.ninja.engine.oOO00O0O] */
    public static oOO00O0 OooO0O0(ArrayList arrayList) {
        oOO00O0 ooo00o0 = new oOO00O0();
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            Animator animator = (Animator) arrayList.get(i);
            if (animator instanceof ObjectAnimator) {
                ObjectAnimator objectAnimator = (ObjectAnimator) animator;
                ooo00o0.OooO0O0.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
                String propertyName = objectAnimator.getPropertyName();
                long startDelay = objectAnimator.getStartDelay();
                long duration = objectAnimator.getDuration();
                TimeInterpolator interpolator = objectAnimator.getInterpolator();
                if (!(interpolator instanceof AccelerateDecelerateInterpolator) && interpolator != null) {
                    if (interpolator instanceof AccelerateInterpolator) {
                        interpolator = o000OO0O.OooO0OO;
                    } else if (interpolator instanceof DecelerateInterpolator) {
                        interpolator = o000OO0O.OooO0Oo;
                    }
                } else {
                    interpolator = o000OO0O.OooO0O0;
                }
                Object obj = new Object();
                obj.OooO0Oo = 0;
                obj.OooO0o0 = 1;
                obj.OooO00o = startDelay;
                obj.OooO0O0 = duration;
                obj.OooO0OO = interpolator;
                obj.OooO0Oo = objectAnimator.getRepeatCount();
                obj.OooO0o0 = objectAnimator.getRepeatMode();
                ooo00o0.OooO00o.put(propertyName, obj);
            } else {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
        }
        return ooo00o0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof oOO00O0)) {
            return false;
        }
        return this.OooO00o.equals(((oOO00O0) obj).OooO00o);
    }

    public final int hashCode() {
        return this.OooO00o.hashCode();
    }

    public final String toString() {
        return ShellUtils.COMMAND_LINE_END + oOO00O0.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.OooO00o + "}\n";
    }
}



