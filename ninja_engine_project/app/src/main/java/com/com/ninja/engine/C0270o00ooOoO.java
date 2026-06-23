package com.ninja.engine;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.carousel.CarouselLayoutManager;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
/* renamed from: com.ninja.engine.o00ooOoO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0270o00ooOoO extends AbstractC1065oOOo0OOo {
    public final Paint OooO00o;
    public final List OooO0O0;

    public C0270o00ooOoO() {
        Paint paint = new Paint();
        this.OooO00o = paint;
        this.OooO0O0 = Collections.unmodifiableList(new ArrayList());
        paint.setStrokeWidth(5.0f);
        paint.setColor(-65281);
    }

    @Override // com.ninja.engine.AbstractC1065oOOo0OOo
    public final void OooO0O0(Canvas canvas, RecyclerView recyclerView) {
        float OooO0O0;
        float OooO0OO;
        float f;
        Canvas canvas2;
        float f2;
        Paint paint = this.OooO00o;
        paint.setStrokeWidth(recyclerView.getResources().getDimension(R.dimen.m3_carousel_debug_keyline_width));
        for (AbstractC1794ooOOOOoO abstractC1794ooOOOOoO : this.OooO0O0) {
            abstractC1794ooOOOOoO.getClass();
            ThreadLocal threadLocal = o0O0OO0.OooO00o;
            float f3 = 1.0f - 0.0f;
            paint.setColor(Color.argb((int) ((Color.alpha(-16776961) * 0.0f) + (Color.alpha(-65281) * f3)), (int) ((Color.red(-16776961) * 0.0f) + (Color.red(-65281) * f3)), (int) ((Color.green(-16776961) * 0.0f) + (Color.green(-65281) * f3)), (int) ((Color.blue(-16776961) * 0.0f) + (Color.blue(-65281) * f3))));
            if (((CarouselLayoutManager) recyclerView.getLayoutManager()).o000000O()) {
                f2 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).OooOOo0.OooO0o0();
                f = ((CarouselLayoutManager) recyclerView.getLayoutManager()).OooOOo0.OooO00o();
                OooO0OO = 0.0f;
                abstractC1794ooOOOOoO.getClass();
                canvas2 = canvas;
                OooO0O0 = 0.0f;
            } else {
                OooO0O0 = ((CarouselLayoutManager) recyclerView.getLayoutManager()).OooOOo0.OooO0O0();
                OooO0OO = ((CarouselLayoutManager) recyclerView.getLayoutManager()).OooOOo0.OooO0OO();
                f = 0.0f;
                abstractC1794ooOOOOoO.getClass();
                canvas2 = canvas;
                f2 = 0.0f;
            }
            canvas2.drawLine(OooO0O0, f2, OooO0OO, f, paint);
        }
    }
}
