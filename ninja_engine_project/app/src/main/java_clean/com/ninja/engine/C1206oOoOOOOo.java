package com.ninja.engine;

import android.graphics.Canvas;
import android.graphics.Matrix;
import java.util.ArrayList;
import java.util.List;
/* renamed from: com.ninja.engine.oOoOOOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1206oOoOOOOo extends AbstractC1211oOoOOo0 {
    public final /* synthetic */ List OooO0OO;
    public final /* synthetic */ Matrix OooO0Oo;

    public C1206oOoOOOOo(ArrayList arrayList, Matrix matrix) {
        this.OooO0OO = arrayList;
        this.OooO0Oo = matrix;
    }

    @Override // com.ninja.engine.AbstractC1211oOoOOo0
    public final void OooO00o(Matrix matrix, C1202oOoOOO0o c1202oOoOOO0o, int i, Canvas canvas) {
        for (Object obj : this.OooO0OO) {
            AbstractC1211oOoOOo0 abstractC1211oOoOOo0 = (AbstractC1211oOoOOo0) obj;
            abstractC1211oOoOOo0.OooO00o(this.OooO0Oo, c1202oOoOOO0o, i, canvas);
        }
    }
}


