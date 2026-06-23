package com.ninja.engine;

import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.widget.TextView;
/* renamed from: com.ninja.engine.o00O0Ooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0130o00O0Ooo extends C0129o00O0OoO {
    @Override // com.ninja.engine.C0129o00O0OoO, com.ninja.engine.C0133o00O0o00
    public void OooO00o(StaticLayout.Builder builder, TextView textView) {
        TextDirectionHeuristic textDirectionHeuristic;
        textDirectionHeuristic = textView.getTextDirectionHeuristic();
        builder.setTextDirection(textDirectionHeuristic);
    }

    @Override // com.ninja.engine.C0133o00O0o00
    public boolean OooO0O0(TextView textView) {
        boolean isHorizontallyScrollable;
        isHorizontallyScrollable = textView.isHorizontallyScrollable();
        return isHorizontallyScrollable;
    }
}


