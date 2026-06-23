package com.ninja.engine;

import com.app.framework.core.system.user.BUserHandle;
import java.io.File;
import java.io.UnsupportedEncodingException;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicInteger;
/* renamed from: com.ninja.engine.o0Oo0O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0413o0Oo0O0 {
    public String OooO;
    public String OooO00o;
    public String OooO0O0;
    public String OooO0OO;
    public int OooO0Oo;
    public long OooO0o;
    public long OooO0o0;
    public int OooO0oO;
    public int OooO0oo;
    public InterfaceC0971oOOO000 OooOO0;
    public InterfaceC0965oOO0ooo OooOO0O;
    public int OooOO0o;
    public int OooOOO0;

    public static int OooO0OO() {
        C0303o0O0Oo0o c0303o0O0Oo0o = C0303o0O0Oo0o.OooO0o;
        if (c0303o0O0Oo0o.OooO0O0 == 0) {
            synchronized (C0303o0O0Oo0o.class) {
                try {
                    if (c0303o0O0Oo0o.OooO0O0 == 0) {
                        c0303o0O0Oo0o.OooO0O0 = BUserHandle.AID_CACHE_GID_START;
                    }
                } finally {
                }
            }
        }
        return c0303o0O0Oo0o.OooO0O0;
    }

    public final void OooO00o(C0601o0oOooO0 c0601o0oOooO0) {
        if (this.OooOOO0 != 5) {
            this.OooOOO0 = 6;
            ((o0OOOO00) C0331o0O0oo.OooOoO().OooO0O0).OooO0OO.execute(new RunnableC0414o0Oo0O00(this, c0601o0oOooO0));
        }
    }

    public final void OooO0O0() {
        if (this.OooOOO0 != 5) {
            ((o0OOOO00) C0331o0O0oo.OooOoO().OooO0O0).OooO0OO.execute(new RunnableC0414o0Oo0O00(this, 2));
        }
    }

    public final void OooO0Oo(InterfaceC0965oOO0ooo interfaceC0965oOO0ooo) {
        this.OooOO0O = interfaceC0965oOO0ooo;
        String str = this.OooO00o;
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        String str2 = File.separator;
        sb.append(str2);
        sb.append(this.OooO0O0);
        sb.append(str2);
        sb.append(this.OooO0OO);
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(sb.toString().getBytes("UTF-8"));
            StringBuilder sb2 = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    sb2.append("0");
                }
                sb2.append(Integer.toHexString(i));
            }
            this.OooOO0o = sb2.toString().hashCode();
            C0415o0Oo0O0O OooOoo0 = C0415o0Oo0O0O.OooOoo0();
            ((ConcurrentHashMap) OooOoo0.OooO0O0).put(Integer.valueOf(this.OooOO0o), this);
            this.OooOOO0 = 1;
            this.OooO0Oo = ((AtomicInteger) OooOoo0.OooO0OO).incrementAndGet();
            ((o0OOOO00) C0331o0O0oo.OooOoO().OooO0O0).OooO00o.submit(new RunnableC0412o0Oo0O(this));
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UnsupportedEncodingException", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("NoSuchAlgorithmException", e2);
        }
    }
}


