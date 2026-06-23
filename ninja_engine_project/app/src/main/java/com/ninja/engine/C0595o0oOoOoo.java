package com.ninja.engine;

import java.util.concurrent.ThreadPoolExecutor;
/* renamed from: com.ninja.engine.o0oOoOoo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0595o0oOoOoo extends AbstractC0809oO0OooOO {
    public final /* synthetic */ AbstractC0809oO0OooOO OooOo0;
    public final /* synthetic */ ThreadPoolExecutor OooOo0O;

    public C0595o0oOoOoo(AbstractC0809oO0OooOO abstractC0809oO0OooOO, ThreadPoolExecutor threadPoolExecutor) {
        this.OooOo0 = abstractC0809oO0OooOO;
        this.OooOo0O = threadPoolExecutor;
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final void OoooOOO(oOO00OOO ooo00ooo) {
        ThreadPoolExecutor threadPoolExecutor = this.OooOo0O;
        try {
            this.OooOo0.OoooOOO(ooo00ooo);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }

    @Override // com.ninja.engine.AbstractC0809oO0OooOO
    public final void o000oOoO(Throwable th) {
        ThreadPoolExecutor threadPoolExecutor = this.OooOo0O;
        try {
            this.OooOo0.o000oOoO(th);
        } finally {
            threadPoolExecutor.shutdown();
        }
    }
}
