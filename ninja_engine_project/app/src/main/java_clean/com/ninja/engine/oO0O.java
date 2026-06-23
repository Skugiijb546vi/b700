package com.ninja.engine;
/* loaded from: classes.dex */
public final class oO0O {
    public int OooO;
    public int OooO00o;
    public int OooO0O0;
    public int[] OooO0OO;
    public int OooO0Oo;
    public int OooO0o;
    public int OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public boolean OooOO0;
    public int OooOO0O;

    public final void OooO00o() {
        int i = this.OooO0oO;
        if (i >= 0) {
            if (this.OooOO0O >= 0) {
                if (this.OooO0oo == 0) {
                    if (this.OooO0O0 > 0 && i == 0) {
                        throw new IllegalArgumentException("Rounded corners without gap are not supported in contiguous indeterminate animation.");
                    }
                    if (this.OooO0OO.length < 3) {
                        throw new IllegalArgumentException("Contiguous indeterminate animation must be used with 3 or more indicator colors.");
                    }
                    return;
                }
                return;
            }
            throw new IllegalArgumentException("Stop indicator size must be >= 0.");
        }
        throw new IllegalArgumentException("indicatorTrackGapSize must be >= 0.");
    }
}


