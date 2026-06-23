package com.ninja.engine;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
/* renamed from: com.ninja.engine.oo00OOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class RunnableC1402oo00OOOO implements Runnable {
    public final /* synthetic */ int OooO00o = 30;

    @Override // java.lang.Runnable
    public final void run() {
        C0303o0O0Oo0o c0303o0O0Oo0o = C0303o0O0Oo0o.OooO0o;
        List OooOoOO = c0303o0O0Oo0o.OooO00o().OooOoOO(this.OooO00o);
        if (OooOoOO != null) {
            Iterator it = ((ArrayList) OooOoOO).iterator();
            while (it.hasNext()) {
                C0647o0ooO0O0 c0647o0ooO0O0 = (C0647o0ooO0O0) it.next();
                String str = c0647o0ooO0O0.OooO0Oo;
                String str2 = c0647o0ooO0O0.OooO0o0;
                StringBuilder sb = new StringBuilder();
                sb.append(str + File.separator + str2);
                sb.append(".temp");
                String sb2 = sb.toString();
                c0303o0O0Oo0o.OooO00o().remove(c0647o0ooO0O0.OooO00o);
                File file = new File(sb2);
                if (file.exists()) {
                    file.delete();
                }
            }
        }
    }
}


