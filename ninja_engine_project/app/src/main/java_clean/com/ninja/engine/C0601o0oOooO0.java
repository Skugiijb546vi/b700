package com.ninja.engine;

import android.graphics.Bitmap;
import android.os.ParcelFileDescriptor;
import android.util.Log;
import com.app.framework.core.system.JarConfig;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
/* renamed from: com.ninja.engine.o0oOooO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0601o0oOooO0 implements InterfaceC0659o0ooOOOO, InterfaceC0526o0o0O0, InterfaceC1134oOOooo0, InterfaceC1128oOOooOOo {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ C0601o0oOooO0(int i) {
        this.OooO00o = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:33:0x0049, code lost:
        if (java.lang.Character.isHighSurrogate(r5) != false) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x0079, code lost:
        if (r11 != false) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0086, code lost:
        if (java.lang.Character.isLowSurrogate(r5) != false) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static boolean OooO0o(android.view.inputmethod.InputConnection r7, android.text.Editable r8, int r9, int r10, boolean r11) {
        /*
            Method dump skipped, instructions count: 244
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0601o0oOooO0.OooO0o(android.view.inputmethod.InputConnection, android.text.Editable, int, int, boolean):boolean");
    }

    public void OooO0O0(Object obj) {
        switch (this.OooO00o) {
            case 13:
                ((ParcelFileDescriptor) obj).close();
                return;
            default:
                ((InputStream) obj).close();
                return;
        }
    }

    public Class OooO0Oo() {
        switch (this.OooO00o) {
            case 13:
                return ParcelFileDescriptor.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.ninja.engine.InterfaceC0488o0Ooooo
    public boolean OooO0o0(Object obj, File file, C0973oOOO00o c0973oOOO00o) {
        try {
            AbstractC0242o00oOoO0.OooO0Oo(((C0689o0oooo0O) ((C0680o0oooOO) ((InterfaceC1108oOOoo) obj).get()).OooO00o.OooO0O0).OooO00o.OooO0Oo.asReadOnlyBuffer(), file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("GifEncoder", 5);
            return false;
        }
    }

    public Object OooO0oO(File file) {
        switch (this.OooO00o) {
            case 13:
                return ParcelFileDescriptor.open(file, 268435456);
            default:
                return new FileInputStream(file);
        }
    }

    public void OooO0oo(Object obj) {
        switch (this.OooO00o) {
            case JarConfig.MAX_CACHE_SIZE /* 10 */:
                return;
            default:
                ((List) obj).clear();
                return;
        }
    }

    @Override // com.ninja.engine.InterfaceC0526o0o0O0
    public Object OooOOO() {
        switch (this.OooO00o) {
            case 11:
                return new ArrayList();
            default:
                return new C0811oO0Oooo();
        }
    }

    @Override // com.ninja.engine.InterfaceC1134oOOooo0
    public InterfaceC1108oOOoo OooOOo(InterfaceC1108oOOoo interfaceC1108oOOoo, C0973oOOO00o c0973oOOO00o) {
        C0240o00oOo0o c0240o00oOo0o;
        byte[] bArr;
        ByteBuffer asReadOnlyBuffer = ((C0689o0oooo0O) ((C0680o0oooOO) interfaceC1108oOOoo.get()).OooO00o.OooO0O0).OooO00o.OooO0Oo.asReadOnlyBuffer();
        AtomicReference atomicReference = AbstractC0242o00oOoO0.OooO00o;
        if (!asReadOnlyBuffer.isReadOnly() && asReadOnlyBuffer.hasArray()) {
            c0240o00oOo0o = new C0240o00oOo0o(asReadOnlyBuffer.array(), asReadOnlyBuffer.arrayOffset(), asReadOnlyBuffer.limit());
        } else {
            c0240o00oOo0o = null;
        }
        if (c0240o00oOo0o != null && c0240o00oOo0o.OooO00o == 0) {
            if (c0240o00oOo0o.OooO0O0 == ((byte[]) c0240o00oOo0o.OooO0OO).length) {
                bArr = asReadOnlyBuffer.array();
                return new C0077o0000oo0(bArr);
            }
        }
        ByteBuffer asReadOnlyBuffer2 = asReadOnlyBuffer.asReadOnlyBuffer();
        byte[] bArr2 = new byte[asReadOnlyBuffer2.limit()];
        ByteBuffer byteBuffer = (ByteBuffer) asReadOnlyBuffer2.position(0);
        asReadOnlyBuffer2.get(bArr2);
        bArr = bArr2;
        return new C0077o0000oo0(bArr);
    }

    @Override // com.ninja.engine.InterfaceC1128oOOooOOo
    public int OooOoO0(C0973oOOO00o c0973oOOO00o) {
        return 1;
    }

    public C0601o0oOooO0(C0415o0Oo0O0O c0415o0Oo0O0O, C0606o0oOoooO c0606o0oOoooO) {
        this.OooO00o = 24;
    }

    private final void OooO(Object obj) {
    }

    @Override // com.ninja.engine.InterfaceC0659o0ooOOOO
    public void OooO0OO() {
    }

    @Override // com.ninja.engine.InterfaceC0659o0ooOOOO
    public void OooO00o(Bitmap bitmap, InterfaceC0206o00o0OOO interfaceC0206o00o0OOO) {
    }
}


