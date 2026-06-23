package com.ninja.engine;

import java.io.BufferedOutputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileDescriptor;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.RandomAccessFile;
/* renamed from: com.ninja.engine.o0Oo0OO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0417o0Oo0OO0 {
    public int OooO;
    public final C0413o0Oo0O0 OooO00o;
    public HandlerC0070o0000o0O OooO0O0;
    public long OooO0OO;
    public long OooO0Oo;
    public C0131o00O0o OooO0o;
    public InputStream OooO0o0;
    public o0OOOO0o OooO0oO;
    public long OooO0oo;
    public String OooOO0;
    public boolean OooOO0O;
    public String OooOO0o;

    public C0417o0Oo0OO0(C0413o0Oo0O0 c0413o0Oo0O0) {
        this.OooO00o = c0413o0Oo0O0;
    }

    public static void OooO0OO(InputStream inputStream) {
        if (inputStream != null) {
            BufferedReader bufferedReader = null;
            try {
                try {
                    BufferedReader bufferedReader2 = new BufferedReader(new InputStreamReader(inputStream));
                    do {
                        try {
                        } catch (IOException unused) {
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                bufferedReader.close();
                            }
                            return;
                        } catch (Throwable th) {
                            th = th;
                            bufferedReader = bufferedReader2;
                            if (bufferedReader != null) {
                                try {
                                    bufferedReader.close();
                                } catch (IOException | NullPointerException unused2) {
                                }
                            }
                            throw th;
                        }
                    } while (bufferedReader2.readLine() != null);
                    bufferedReader2.close();
                } catch (IOException | NullPointerException unused3) {
                }
            } catch (IOException unused4) {
            } catch (Throwable th2) {
                th = th2;
            }
        }
    }

    public final void OooO(C0131o00O0o c0131o00O0o) {
        long j = this.OooO00o.OooO0o0;
        long currentTimeMillis = System.currentTimeMillis();
        long j2 = currentTimeMillis - this.OooO0OO;
        if (j - this.OooO0Oo > 65536 && j2 > 2000) {
            OooO0oo(c0131o00O0o);
            this.OooO0Oo = j;
            this.OooO0OO = currentTimeMillis;
        }
    }

    public final boolean OooO00o(C0647o0ooO0O0 c0647o0ooO0O0) {
        String str;
        String str2;
        if (this.OooO != 416 && ((str = this.OooOO0) == null || c0647o0ooO0O0 == null || (str2 = c0647o0ooO0O0.OooO0OO) == null || str2.equals(str))) {
            return false;
        }
        C0413o0Oo0O0 c0413o0Oo0O0 = this.OooO00o;
        C0303o0O0Oo0o c0303o0O0Oo0o = C0303o0O0Oo0o.OooO0o;
        if (c0647o0ooO0O0 != null) {
            c0303o0O0Oo0o.OooO00o().remove(c0413o0Oo0O0.OooOO0o);
        }
        OooO0o0();
        c0413o0Oo0O0.OooO0o0 = 0L;
        c0413o0Oo0O0.OooO0o = 0L;
        o0OOOO0o OooO0O0 = c0303o0O0Oo0o.OooO0O0();
        this.OooO0oO = OooO0O0;
        OooO0O0.OooO00o(c0413o0Oo0O0);
        o0OOOO0o OooOOoo = AbstractC1091oOOoOOOO.OooOOoo(this.OooO0oO, c0413o0Oo0O0);
        this.OooO0oO = OooOOoo;
        this.OooO = OooOOoo.OooO0O0();
        return true;
    }

    public final void OooO0O0(C0131o00O0o c0131o00O0o) {
        InputStream inputStream = this.OooO0o0;
        if (inputStream != null) {
            try {
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        try {
            if (c0131o00O0o != null) {
                try {
                    OooO0oo(c0131o00O0o);
                } catch (Exception e2) {
                    e2.printStackTrace();
                }
            }
            if (c0131o00O0o != null) {
                try {
                    ((BufferedOutputStream) c0131o00O0o.OooO0O0).close();
                    ((RandomAccessFile) c0131o00O0o.OooO0Oo).close();
                } catch (IOException e3) {
                    e3.printStackTrace();
                }
            }
        } catch (Throwable th) {
            try {
                ((BufferedOutputStream) c0131o00O0o.OooO0O0).close();
                ((RandomAccessFile) c0131o00O0o.OooO0Oo).close();
            } catch (IOException e4) {
                e4.printStackTrace();
            }
            throw th;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, com.ninja.engine.o0ooO0O0] */
    public final void OooO0Oo() {
        Object obj = new Object();
        C0413o0Oo0O0 c0413o0Oo0O0 = this.OooO00o;
        obj.OooO00o = c0413o0Oo0O0.OooOO0o;
        obj.OooO0O0 = c0413o0Oo0O0.OooO00o;
        obj.OooO0OO = this.OooOO0;
        obj.OooO0Oo = c0413o0Oo0O0.OooO0O0;
        obj.OooO0o0 = c0413o0Oo0O0.OooO0OO;
        obj.OooO0oO = c0413o0Oo0O0.OooO0o0;
        obj.OooO0o = this.OooO0oo;
        obj.OooO0oo = System.currentTimeMillis();
        C0303o0O0Oo0o.OooO0o.OooO00o().OooOo0o(obj);
    }

    public final C0647o0ooO0O0 OooO0o() {
        return C0303o0O0Oo0o.OooO0o.OooO00o().OooOoO(this.OooO00o.OooOO0o);
    }

    public final void OooO0o0() {
        File file = new File(this.OooOO0o);
        if (file.exists()) {
            file.delete();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, com.ninja.engine.oOOOOoOO] */
    public final void OooO0oO() {
        HandlerC0070o0000o0O handlerC0070o0000o0O;
        C0413o0Oo0O0 c0413o0Oo0O0 = this.OooO00o;
        if (c0413o0Oo0O0.OooOOO0 != 5 && (handlerC0070o0000o0O = this.OooO0O0) != 0) {
            long j = c0413o0Oo0O0.OooO0o0;
            long j2 = this.OooO0oo;
            Object obj = new Object();
            obj.OooO00o = j;
            obj.OooO0O0 = j2;
            handlerC0070o0000o0O.obtainMessage(1, obj).sendToTarget();
        }
    }

    public final void OooO0oo(C0131o00O0o c0131o00O0o) {
        try {
            ((BufferedOutputStream) c0131o00O0o.OooO0O0).flush();
            ((FileDescriptor) c0131o00O0o.OooO0OO).sync();
            if (this.OooOO0O) {
                InterfaceC0353o0OO0ooo OooO00o = C0303o0O0Oo0o.OooO0o.OooO00o();
                C0413o0Oo0O0 c0413o0Oo0O0 = this.OooO00o;
                OooO00o.OooOOo0(c0413o0Oo0O0.OooOO0o, c0413o0Oo0O0.OooO0o0, System.currentTimeMillis());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

