package com.ninja.engine;

import android.transition.Transition;
import android.transition.TransitionManager;
import android.transition.TransitionSet;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.ninja.engine.o0oo0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0619o0oo0O0 extends AbstractC0621o0oo0O0o {
    public static boolean OooOO0o(Transition transition) {
        if (AbstractC0621o0oo0O0o.OooO0o0(transition.getTargetIds()) && AbstractC0621o0oo0O0o.OooO0o0(transition.getTargetNames()) && AbstractC0621o0oo0O0o.OooO0o0(transition.getTargetTypes())) {
            return false;
        }
        return true;
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooO(Object obj, Object obj2, ArrayList arrayList) {
        ((Transition) obj).addListener(new C0608o0oo0(this, obj2, arrayList));
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooO00o(View view, Object obj) {
        ((Transition) obj).addTarget(view);
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooO0O0(Object obj, ArrayList arrayList) {
        Transition transition = (Transition) obj;
        if (transition == null) {
            return;
        }
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                OooO0O0(transitionSet.getTransitionAt(i), arrayList);
                i++;
            }
        } else if (!OooOO0o(transition) && AbstractC0621o0oo0O0o.OooO0o0(transition.getTargets())) {
            int size = arrayList.size();
            while (i < size) {
                transition.addTarget((View) arrayList.get(i));
                i++;
            }
        }
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooO0OO(ViewGroup viewGroup, Object obj) {
        TransitionManager.beginDelayedTransition(viewGroup, (Transition) obj);
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final Object OooO0Oo() {
        return null;
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final Object OooO0o(Object obj, Object obj2) {
        Transition transition = (Transition) obj;
        Transition transition2 = (Transition) obj2;
        if (transition != null && transition2 != null) {
            return new TransitionSet().addTransition(transition).addTransition(transition2).setOrdering(1);
        }
        if (transition == null) {
            if (transition2 != null) {
                return transition2;
            }
            return null;
        }
        return transition;
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final Object OooO0oO(Object obj, Object obj2) {
        TransitionSet transitionSet = new TransitionSet();
        if (obj != null) {
            transitionSet.addTransition((Transition) obj);
        }
        transitionSet.addTransition((Transition) obj2);
        return transitionSet;
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooO0oo(Object obj, View view, ArrayList arrayList) {
        ((Transition) obj).addListener(new C0617o0oo00oo(view, arrayList));
    }

    public final void OooOOO0(Object obj, ArrayList arrayList, ArrayList arrayList2) {
        List<View> targets;
        int size;
        Transition transition = (Transition) obj;
        int i = 0;
        if (transition instanceof TransitionSet) {
            TransitionSet transitionSet = (TransitionSet) transition;
            int transitionCount = transitionSet.getTransitionCount();
            while (i < transitionCount) {
                OooOOO0(transitionSet.getTransitionAt(i), arrayList, arrayList2);
                i++;
            }
        } else if (!OooOO0o(transition) && (targets = transition.getTargets()) != null && targets.size() == arrayList.size() && targets.containsAll(arrayList)) {
            if (arrayList2 == null) {
                size = 0;
            } else {
                size = arrayList2.size();
            }
            while (i < size) {
                transition.addTarget((View) arrayList2.get(i));
                i++;
            }
            for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                transition.removeTarget((View) arrayList.get(size2));
            }
        }
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooOO0(Object obj) {
    }

    @Override // com.ninja.engine.AbstractC0621o0oo0O0o
    public final void OooOO0O(ArrayList arrayList, ArrayList arrayList2) {
    }
}


