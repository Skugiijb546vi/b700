package com.ninja.engine;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextDirectionHeuristics;
import android.widget.TextView;
/* renamed from: com.ninja.engine.o00O0OoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0129o00O0OoO extends C0133o00O0o00 {
    @Override // com.ninja.engine.C0133o00O0o00
    public void OooO00o(StaticLayout.Builder builder, TextView textView) {
        builder.setTextDirection((TextDirectionHeuristic) C0234o00oOOo.OooO0o0(textView, "getTextDirectionHeuristic", TextDirectionHeuristics.FIRSTSTRONG_LTR));
    }
}
