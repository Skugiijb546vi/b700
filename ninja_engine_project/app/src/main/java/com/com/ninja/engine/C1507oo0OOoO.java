package com.ninja.engine;

import android.view.View;
import androidx.appcompat.widget.ActionBarOverlayLayout;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.oo0OOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1507oo0OOoO extends AbstractC1473oo0O0o0 {
    public final /* synthetic */ int OooO00o;
    public final /* synthetic */ C1511oo0OOoo0 OooO0O0;

    public /* synthetic */ C1507oo0OOoO(C1511oo0OOoo0 c1511oo0OOoo0, int i) {
        this.OooO00o = i;
        this.OooO0O0 = c1511oo0OOoo0;
    }

    @Override // com.ninja.engine.InterfaceC1474oo0O0o00
    public final void OooO00o() {
        View view;
        C1511oo0OOoo0 c1511oo0OOoo0 = this.OooO0O0;
        switch (this.OooO00o) {
            case 0:
                if (c1511oo0OOoo0.Oooo00o && (view = c1511oo0OOoo0.OooOoO) != null) {
                    view.setTranslationY(0.0f);
                    c1511oo0OOoo0.OooOo0o.setTranslationY(0.0f);
                }
                c1511oo0OOoo0.OooOo0o.setVisibility(8);
                c1511oo0OOoo0.OooOo0o.setTransitioning(false);
                c1511oo0OOoo0.Oooo0o0 = null;
                o00000O0 o00000o0 = c1511oo0OOoo0.OooOooO;
                if (o00000o0 != null) {
                    o00000o0.OooO0oo(c1511oo0OOoo0.OooOoo);
                    c1511oo0OOoo0.OooOoo = null;
                    c1511oo0OOoo0.OooOooO = null;
                }
                ActionBarOverlayLayout actionBarOverlayLayout = c1511oo0OOoo0.OooOo0O;
                if (actionBarOverlayLayout != null) {
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    AbstractC1449oo0O000.OooO0OO(actionBarOverlayLayout);
                    return;
                }
                return;
            default:
                c1511oo0OOoo0.Oooo0o0 = null;
                c1511oo0OOoo0.OooOo0o.requestLayout();
                return;
        }
    }
}
