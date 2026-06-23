package com.ninja.engine;

import com.app.framework.utils.DexFileRecovery;
import java.util.Comparator;
/* renamed from: com.ninja.engine.o0OOo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C0382o0OOo0o implements Comparator {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ C0382o0OOo0o(int i) {
        this.OooO00o = i;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.OooO00o) {
            case 0:
                return DexFileRecovery.OooO00o((DexFileRecovery.RecoveryStrategy) obj, (DexFileRecovery.RecoveryStrategy) obj2);
            default:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i = 0; i < bArr.length; i++) {
                    byte b = bArr[i];
                    byte b2 = bArr2[i];
                    if (b != b2) {
                        return b - b2;
                    }
                }
                return 0;
        }
    }
}


