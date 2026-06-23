package com.ninja.engine;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import java.io.InputStream;
import java.util.concurrent.LinkedBlockingDeque;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.ninja.engine.o0OOoOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0393o0OOoOo implements oOO000o, InterfaceC0397o0OOoo0O, InterfaceC0467o0Ooo00 {
    public final /* synthetic */ int OooO00o;
    public final Context OooO0O0;

    public C0393o0OOoOo(Context context) {
        this.OooO00o = 1;
        this.OooO0O0 = context.getApplicationContext();
    }

    @Override // com.ninja.engine.InterfaceC0397o0OOoo0O
    public Class OooO00o() {
        return Drawable.class;
    }

    @Override // com.ninja.engine.InterfaceC0467o0Ooo00
    public void OooO0O0(AbstractC0809oO0OooOO abstractC0809oO0OooOO) {
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(0, 1, 15L, TimeUnit.SECONDS, new LinkedBlockingDeque(), new ThreadFactoryC0300o0O0Oo("EmojiCompatInitializer"));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        threadPoolExecutor.execute(new RunnableC0564o0oOO0Oo(this, abstractC0809oO0OooOO, threadPoolExecutor, 0));
    }

    @Override // com.ninja.engine.InterfaceC0397o0OOoo0O
    public Object OooO0OO(int i, Resources.Theme theme, Resources resources) {
        Context context = this.OooO0O0;
        return AbstractC0692o0ooooOo.OooOo0O(context, context, i, theme);
    }

    @Override // com.ninja.engine.oOO000o
    public InterfaceC0904oOO000o0 OooO0Oo(oOO00OOO ooo00ooo) {
        switch (this.OooO00o) {
            case 0:
                return new C0549o0o0Oo(this.OooO0O0, this);
            case 1:
            default:
                return new C0549o0o0Oo(this.OooO0O0, ooo00ooo.OooOO0(Integer.class, InputStream.class));
            case 2:
                return new C0877oO0oo0(this.OooO0O0, 0);
            case 3:
                return new C0877oO0oo0(this.OooO0O0, 2);
        }
    }

    @Override // com.ninja.engine.InterfaceC0397o0OOoo0O
    public /* bridge */ /* synthetic */ void OooO0o0(Object obj) {
        Drawable drawable = (Drawable) obj;
    }

    public /* synthetic */ C0393o0OOoOo(Context context, int i) {
        this.OooO00o = i;
        this.OooO0O0 = context;
    }
}
