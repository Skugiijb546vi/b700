package com.ninja.engine;

import android.graphics.drawable.Drawable;
/* loaded from: classes.dex */
public final class o000O0O implements Drawable.Callback {
    public final /* synthetic */ int OooO00o = 1;
    public Object OooO0O0;

    public /* synthetic */ o000O0O() {
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void invalidateDrawable(Drawable drawable) {
        switch (this.OooO00o) {
            case 0:
                ((o000O00O) this.OooO0O0).invalidateSelf();
                return;
            default:
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        switch (this.OooO00o) {
            case 0:
                ((o000O00O) this.OooO0O0).scheduleSelf(runnable, j);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.OooO0O0;
                if (callback != null) {
                    callback.scheduleDrawable(drawable, runnable, j);
                    return;
                }
                return;
        }
    }

    @Override // android.graphics.drawable.Drawable.Callback
    public final void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        switch (this.OooO00o) {
            case 0:
                ((o000O00O) this.OooO0O0).unscheduleSelf(runnable);
                return;
            default:
                Drawable.Callback callback = (Drawable.Callback) this.OooO0O0;
                if (callback != null) {
                    callback.unscheduleDrawable(drawable, runnable);
                    return;
                }
                return;
        }
    }

    public o000O0O(o000O00O o000o00o) {
        this.OooO0O0 = o000o00o;
    }

    private final void OooO00o(Drawable drawable) {
    }
}


