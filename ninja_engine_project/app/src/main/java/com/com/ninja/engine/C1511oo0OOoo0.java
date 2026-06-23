package com.ninja.engine;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.TypedValue;
import android.view.ContextThemeWrapper;
import android.view.View;
import android.view.animation.AccelerateInterpolator;
import android.view.animation.DecelerateInterpolator;
import androidx.appcompat.widget.ActionBarContainer;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import androidx.appcompat.widget.Toolbar;
import java.util.ArrayList;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oo0OOoo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1511oo0OOoo0 extends AbstractC0694o0ooooo0 implements InterfaceC1372oo000o {
    public static final AccelerateInterpolator OoooO0 = new AccelerateInterpolator();
    public static final DecelerateInterpolator OoooO0O = new DecelerateInterpolator();
    public InterfaceC0357o0OOO0oO OooOo;
    public Context OooOo0;
    public Context OooOo00;
    public ActionBarOverlayLayout OooOo0O;
    public ActionBarContainer OooOo0o;
    public final View OooOoO;
    public ActionBarContextView OooOoO0;
    public boolean OooOoOO;
    public C1509oo0OOoOo OooOoo;
    public C1509oo0OOoOo OooOoo0;
    public o00000O0 OooOooO;
    public boolean OooOooo;
    public final C1507oo0OOoO Oooo;
    public boolean Oooo0;
    public final ArrayList Oooo000;
    public int Oooo00O;
    public boolean Oooo00o;
    public boolean Oooo0O0;
    public boolean Oooo0OO;
    public boolean Oooo0o;
    public C1471oo0O0Ooo Oooo0o0;
    public boolean Oooo0oO;
    public final C1507oo0OOoO Oooo0oo;
    public final C1275oOoo0OoO OoooO00;

    public C1511oo0OOoo0(Activity activity, boolean z) {
        new ArrayList();
        this.Oooo000 = new ArrayList();
        this.Oooo00O = 0;
        this.Oooo00o = true;
        this.Oooo0OO = true;
        this.Oooo0oo = new C1507oo0OOoO(this, 0);
        this.Oooo = new C1507oo0OOoO(this, 1);
        this.OoooO00 = new C1275oOoo0OoO(this);
        View decorView = activity.getWindow().getDecorView();
        OoooOOo(decorView);
        if (z) {
            return;
        }
        this.OooOoO = decorView.findViewById(16908290);
    }

    public final Context OoooOOO() {
        if (this.OooOo0 == null) {
            TypedValue typedValue = new TypedValue();
            this.OooOo00.getTheme().resolveAttribute(R.attr.actionBarWidgetTheme, typedValue, true);
            int i = typedValue.resourceId;
            if (i != 0) {
                this.OooOo0 = new ContextThemeWrapper(this.OooOo00, i);
            } else {
                this.OooOo0 = this.OooOo00;
            }
        }
        return this.OooOo0;
    }

    public final void OoooOOo(View view) {
        String str;
        InterfaceC0357o0OOO0oO wrapper;
        boolean z;
        ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) view.findViewById(R.id.decor_content_parent);
        this.OooOo0O = actionBarOverlayLayout;
        if (actionBarOverlayLayout != null) {
            actionBarOverlayLayout.setActionBarVisibilityCallback(this);
        }
        View findViewById = view.findViewById(R.id.action_bar);
        if (findViewById instanceof InterfaceC0357o0OOO0oO) {
            wrapper = (InterfaceC0357o0OOO0oO) findViewById;
        } else if (findViewById instanceof Toolbar) {
            wrapper = ((Toolbar) findViewById).getWrapper();
        } else {
            if (findViewById != null) {
                str = findViewById.getClass().getSimpleName();
            } else {
                str = "null";
            }
            throw new IllegalStateException("Can't make a decor toolbar out of ".concat(str));
        }
        this.OooOo = wrapper;
        this.OooOoO0 = (ActionBarContextView) view.findViewById(R.id.action_context_bar);
        ActionBarContainer actionBarContainer = (ActionBarContainer) view.findViewById(R.id.action_bar_container);
        this.OooOo0o = actionBarContainer;
        InterfaceC0357o0OOO0oO interfaceC0357o0OOO0oO = this.OooOo;
        if (interfaceC0357o0OOO0oO != null && this.OooOoO0 != null && actionBarContainer != null) {
            Context context = ((C1339oOoooOO0) interfaceC0357o0OOO0oO).OooO00o.getContext();
            this.OooOo00 = context;
            if ((((C1339oOoooOO0) this.OooOo).OooO0O0 & 4) != 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.OooOoOO = true;
            }
            int i = context.getApplicationInfo().targetSdkVersion;
            this.OooOo.getClass();
            OoooOoO(context.getResources().getBoolean(R.bool.abc_action_bar_embed_tabs));
            TypedArray obtainStyledAttributes = this.OooOo00.obtainStyledAttributes(null, AbstractC1039oOOOoo0o.OooO00o, R.attr.actionBarStyle, 0);
            if (obtainStyledAttributes.getBoolean(14, false)) {
                ActionBarOverlayLayout actionBarOverlayLayout2 = this.OooOo0O;
                if (actionBarOverlayLayout2.OooO0oO) {
                    this.Oooo0oO = true;
                    actionBarOverlayLayout2.setHideOnContentScrollEnabled(true);
                } else {
                    throw new IllegalStateException("Action bar must be in overlay mode (Window.FEATURE_OVERLAY_ACTION_BAR) to enable hide on content scroll");
                }
            }
            int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(12, 0);
            if (dimensionPixelSize != 0) {
                ActionBarContainer actionBarContainer2 = this.OooOo0o;
                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                AbstractC1452oo0O000o.OooOO0o(actionBarContainer2, dimensionPixelSize);
            }
            obtainStyledAttributes.recycle();
            return;
        }
        throw new IllegalStateException(C1511oo0OOoo0.class.getSimpleName().concat(" can only be used with a compatible window decor layout"));
    }

    public final void OoooOo0(boolean z) {
        int i;
        if (!this.OooOoOO) {
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            C1339oOoooOO0 c1339oOoooOO0 = (C1339oOoooOO0) this.OooOo;
            int i2 = c1339oOoooOO0.OooO0O0;
            this.OooOoOO = true;
            c1339oOoooOO0.OooO00o((i & 4) | (i2 & (-5)));
        }
    }

    public final void OoooOoO(boolean z) {
        if (!z) {
            ((C1339oOoooOO0) this.OooOo).getClass();
            this.OooOo0o.setTabContainer(null);
        } else {
            this.OooOo0o.setTabContainer(null);
            ((C1339oOoooOO0) this.OooOo).getClass();
        }
        this.OooOo.getClass();
        ((C1339oOoooOO0) this.OooOo).OooO00o.setCollapsible(false);
        this.OooOo0O.setHasNonEmbeddedTabs(false);
    }

    public final void OoooOoo(boolean z) {
        boolean z2;
        int[] iArr;
        int[] iArr2;
        boolean z3 = this.Oooo0;
        if (this.Oooo0O0 || !z3) {
            z2 = true;
        } else {
            z2 = false;
        }
        View view = this.OooOoO;
        C1275oOoo0OoO c1275oOoo0OoO = this.OoooO00;
        if (z2) {
            if (!this.Oooo0OO) {
                this.Oooo0OO = true;
                C1471oo0O0Ooo c1471oo0O0Ooo = this.Oooo0o0;
                if (c1471oo0O0Ooo != null) {
                    c1471oo0O0Ooo.OooO00o();
                }
                this.OooOo0o.setVisibility(0);
                int i = this.Oooo00O;
                C1507oo0OOoO c1507oo0OOoO = this.Oooo;
                if (i == 0 && (this.Oooo0o || z)) {
                    this.OooOo0o.setTranslationY(0.0f);
                    float f = -this.OooOo0o.getHeight();
                    if (z) {
                        this.OooOo0o.getLocationInWindow(new int[]{0, 0});
                        f -= iArr2[1];
                    }
                    this.OooOo0o.setTranslationY(f);
                    C1471oo0O0Ooo c1471oo0O0Ooo2 = new C1471oo0O0Ooo();
                    C1470oo0O0OoO OooO00o = AbstractC1460oo0O00oo.OooO00o(this.OooOo0o);
                    OooO00o.OooO0o(0.0f);
                    OooO00o.OooO0o0(c1275oOoo0OoO);
                    boolean z4 = c1471oo0O0Ooo2.OooO0o0;
                    ArrayList arrayList = c1471oo0O0Ooo2.OooO00o;
                    if (!z4) {
                        arrayList.add(OooO00o);
                    }
                    if (this.Oooo00o && view != null) {
                        view.setTranslationY(f);
                        C1470oo0O0OoO OooO00o2 = AbstractC1460oo0O00oo.OooO00o(view);
                        OooO00o2.OooO0o(0.0f);
                        if (!c1471oo0O0Ooo2.OooO0o0) {
                            arrayList.add(OooO00o2);
                        }
                    }
                    DecelerateInterpolator decelerateInterpolator = OoooO0O;
                    boolean z5 = c1471oo0O0Ooo2.OooO0o0;
                    if (!z5) {
                        c1471oo0O0Ooo2.OooO0OO = decelerateInterpolator;
                    }
                    if (!z5) {
                        c1471oo0O0Ooo2.OooO0O0 = 250L;
                    }
                    if (!z5) {
                        c1471oo0O0Ooo2.OooO0Oo = c1507oo0OOoO;
                    }
                    this.Oooo0o0 = c1471oo0O0Ooo2;
                    c1471oo0O0Ooo2.OooO0O0();
                } else {
                    this.OooOo0o.setAlpha(1.0f);
                    this.OooOo0o.setTranslationY(0.0f);
                    if (this.Oooo00o && view != null) {
                        view.setTranslationY(0.0f);
                    }
                    c1507oo0OOoO.OooO00o();
                }
                ActionBarOverlayLayout actionBarOverlayLayout = this.OooOo0O;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    AbstractC1449oo0O000.OooO0OO(actionBarOverlayLayout);
                }
            }
        } else if (this.Oooo0OO) {
            this.Oooo0OO = false;
            C1471oo0O0Ooo c1471oo0O0Ooo3 = this.Oooo0o0;
            if (c1471oo0O0Ooo3 != null) {
                c1471oo0O0Ooo3.OooO00o();
            }
            int i2 = this.Oooo00O;
            C1507oo0OOoO c1507oo0OOoO2 = this.Oooo0oo;
            if (i2 == 0 && (this.Oooo0o || z)) {
                this.OooOo0o.setAlpha(1.0f);
                this.OooOo0o.setTransitioning(true);
                C1471oo0O0Ooo c1471oo0O0Ooo4 = new C1471oo0O0Ooo();
                float f2 = -this.OooOo0o.getHeight();
                if (z) {
                    this.OooOo0o.getLocationInWindow(new int[]{0, 0});
                    f2 -= iArr[1];
                }
                C1470oo0O0OoO OooO00o3 = AbstractC1460oo0O00oo.OooO00o(this.OooOo0o);
                OooO00o3.OooO0o(f2);
                OooO00o3.OooO0o0(c1275oOoo0OoO);
                boolean z6 = c1471oo0O0Ooo4.OooO0o0;
                ArrayList arrayList2 = c1471oo0O0Ooo4.OooO00o;
                if (!z6) {
                    arrayList2.add(OooO00o3);
                }
                if (this.Oooo00o && view != null) {
                    C1470oo0O0OoO OooO00o4 = AbstractC1460oo0O00oo.OooO00o(view);
                    OooO00o4.OooO0o(f2);
                    if (!c1471oo0O0Ooo4.OooO0o0) {
                        arrayList2.add(OooO00o4);
                    }
                }
                AccelerateInterpolator accelerateInterpolator = OoooO0;
                boolean z7 = c1471oo0O0Ooo4.OooO0o0;
                if (!z7) {
                    c1471oo0O0Ooo4.OooO0OO = accelerateInterpolator;
                }
                if (!z7) {
                    c1471oo0O0Ooo4.OooO0O0 = 250L;
                }
                if (!z7) {
                    c1471oo0O0Ooo4.OooO0Oo = c1507oo0OOoO2;
                }
                this.Oooo0o0 = c1471oo0O0Ooo4;
                c1471oo0O0Ooo4.OooO0O0();
                return;
            }
            c1507oo0OOoO2.OooO00o();
        }
    }

    public final void o000oOoO(boolean z) {
        C1470oo0O0OoO OooO;
        C1470oo0O0OoO c1470oo0O0OoO;
        long j;
        if (z) {
            if (!this.Oooo0O0) {
                this.Oooo0O0 = true;
                ActionBarOverlayLayout actionBarOverlayLayout = this.OooOo0O;
                if (actionBarOverlayLayout != null) {
                    actionBarOverlayLayout.setShowingForActionMode(true);
                }
                OoooOoo(false);
            }
        } else if (this.Oooo0O0) {
            this.Oooo0O0 = false;
            ActionBarOverlayLayout actionBarOverlayLayout2 = this.OooOo0O;
            if (actionBarOverlayLayout2 != null) {
                actionBarOverlayLayout2.setShowingForActionMode(false);
            }
            OoooOoo(false);
        }
        if (this.OooOo0o.isLaidOut()) {
            if (z) {
                C1339oOoooOO0 c1339oOoooOO0 = (C1339oOoooOO0) this.OooOo;
                OooO = AbstractC1460oo0O00oo.OooO00o(c1339oOoooOO0.OooO00o);
                OooO.OooO00o(0.0f);
                OooO.OooO0OO(100L);
                OooO.OooO0Oo(new C1338oOoooO0o(c1339oOoooOO0, 4));
                c1470oo0O0OoO = this.OooOoO0.OooO(0, 200L);
            } else {
                C1339oOoooOO0 c1339oOoooOO02 = (C1339oOoooOO0) this.OooOo;
                C1470oo0O0OoO OooO00o = AbstractC1460oo0O00oo.OooO00o(c1339oOoooOO02.OooO00o);
                OooO00o.OooO00o(1.0f);
                OooO00o.OooO0OO(200L);
                OooO00o.OooO0Oo(new C1338oOoooO0o(c1339oOoooOO02, 0));
                OooO = this.OooOoO0.OooO(8, 100L);
                c1470oo0O0OoO = OooO00o;
            }
            C1471oo0O0Ooo c1471oo0O0Ooo = new C1471oo0O0Ooo();
            ArrayList arrayList = c1471oo0O0Ooo.OooO00o;
            arrayList.add(OooO);
            View view = (View) OooO.OooO00o.get();
            if (view != null) {
                j = view.animate().getDuration();
            } else {
                j = 0;
            }
            View view2 = (View) c1470oo0O0OoO.OooO00o.get();
            if (view2 != null) {
                view2.animate().setStartDelay(j);
            }
            arrayList.add(c1470oo0O0OoO);
            c1471oo0O0Ooo.OooO0O0();
        } else if (z) {
            ((C1339oOoooOO0) this.OooOo).OooO00o.setVisibility(4);
            this.OooOoO0.setVisibility(0);
        } else {
            ((C1339oOoooOO0) this.OooOo).OooO00o.setVisibility(0);
            this.OooOoO0.setVisibility(8);
        }
    }

    public C1511oo0OOoo0(Dialog dialog) {
        new ArrayList();
        this.Oooo000 = new ArrayList();
        this.Oooo00O = 0;
        this.Oooo00o = true;
        this.Oooo0OO = true;
        this.Oooo0oo = new C1507oo0OOoO(this, 0);
        this.Oooo = new C1507oo0OOoO(this, 1);
        this.OoooO00 = new C1275oOoo0OoO(this);
        OoooOOo(dialog.getWindow().getDecorView());
    }
}
