package com.ninja.engine;

import com.google.android.material.carousel.CarouselLayoutManager;
/* renamed from: com.ninja.engine.o00ooOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0271o00ooOoo {
    public final int OooO00o;
    public final /* synthetic */ int OooO0O0;
    public final /* synthetic */ CarouselLayoutManager OooO0OO;

    public C0271o00ooOoo(int i) {
        this.OooO00o = i;
    }

    public final int OooO00o() {
        switch (this.OooO0O0) {
            case 0:
                return this.OooO0OO.OooOOOO;
            default:
                CarouselLayoutManager carouselLayoutManager = this.OooO0OO;
                return carouselLayoutManager.OooOOOO - carouselLayoutManager.OooOooO();
        }
    }

    public final int OooO0O0() {
        switch (this.OooO0O0) {
            case 0:
                return this.OooO0OO.OooOooo();
            default:
                return 0;
        }
    }

    public final int OooO0OO() {
        switch (this.OooO0O0) {
            case 0:
                CarouselLayoutManager carouselLayoutManager = this.OooO0OO;
                return carouselLayoutManager.OooOOO - carouselLayoutManager.Oooo000();
            default:
                return this.OooO0OO.OooOOO;
        }
    }

    public final int OooO0Oo() {
        switch (this.OooO0O0) {
            case 0:
                return 0;
            default:
                CarouselLayoutManager carouselLayoutManager = this.OooO0OO;
                if (carouselLayoutManager.o000000o()) {
                    return carouselLayoutManager.OooOOO;
                }
                return 0;
        }
    }

    public final int OooO0o0() {
        switch (this.OooO0O0) {
            case 0:
                return 0;
            default:
                return this.OooO0OO.Oooo00O();
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C0271o00ooOoo(CarouselLayoutManager carouselLayoutManager, int i) {
        this(1);
        this.OooO0O0 = i;
        switch (i) {
            case 1:
                this.OooO0OO = carouselLayoutManager;
                this(0);
                return;
            default:
                this.OooO0OO = carouselLayoutManager;
                return;
        }
    }
}
