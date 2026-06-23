package com.ninja.engine;

import android.content.ClipData;
import android.net.Uri;
import android.os.Bundle;
import android.view.ContentInfo;
import java.util.Locale;
/* renamed from: com.ninja.engine.o0O0oO0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0321o0O0oO0 implements InterfaceC1982oooOO0, InterfaceC0322o0O0oO0O {
    public final /* synthetic */ int OooO00o = 0;
    public ClipData OooO0O0;
    public int OooO0OO;
    public int OooO0Oo;
    public Bundle OooO0o;
    public Uri OooO0o0;

    public /* synthetic */ C0321o0O0oO0() {
    }

    @Override // com.ninja.engine.InterfaceC0322o0O0oO0O
    public ClipData OooO0O0() {
        return this.OooO0O0;
    }

    @Override // com.ninja.engine.InterfaceC1982oooOO0
    public C0323o0O0oO0o OooO0oo() {
        return new C0323o0O0oO0o(new C0321o0O0oO0(this));
    }

    @Override // com.ninja.engine.InterfaceC1982oooOO0
    public void OooOO0O(Bundle bundle) {
        this.OooO0o = bundle;
    }

    @Override // com.ninja.engine.InterfaceC0322o0O0oO0O
    public int OooOOOo() {
        return this.OooO0Oo;
    }

    @Override // com.ninja.engine.InterfaceC0322o0O0oO0O
    public ContentInfo OooOOo0() {
        return null;
    }

    @Override // com.ninja.engine.InterfaceC1982oooOO0
    public void OooOo0(Uri uri) {
        this.OooO0o0 = uri;
    }

    @Override // com.ninja.engine.InterfaceC0322o0O0oO0O
    public int OooOo0O() {
        return this.OooO0OO;
    }

    @Override // com.ninja.engine.InterfaceC1982oooOO0
    public void OooOoo(int i) {
        this.OooO0Oo = i;
    }

    public String toString() {
        String str;
        String valueOf;
        Uri uri;
        String str2;
        switch (this.OooO00o) {
            case 1:
                StringBuilder sb = new StringBuilder("ContentInfoCompat{clip=");
                sb.append(this.OooO0O0.getDescription());
                sb.append(", source=");
                int i = this.OooO0OO;
                if (i != 0) {
                    if (i != 1) {
                        if (i != 2) {
                            if (i != 3) {
                                if (i != 4) {
                                    if (i != 5) {
                                        str = String.valueOf(i);
                                    } else {
                                        str = "SOURCE_PROCESS_TEXT";
                                    }
                                } else {
                                    str = "SOURCE_AUTOFILL";
                                }
                            } else {
                                str = "SOURCE_DRAG_AND_DROP";
                            }
                        } else {
                            str = "SOURCE_INPUT_METHOD";
                        }
                    } else {
                        str = "SOURCE_CLIPBOARD";
                    }
                } else {
                    str = "SOURCE_APP";
                }
                sb.append(str);
                sb.append(", flags=");
                int i2 = this.OooO0Oo;
                if ((i2 & 1) != 0) {
                    valueOf = "FLAG_CONVERT_TO_PLAIN_TEXT";
                } else {
                    valueOf = String.valueOf(i2);
                }
                sb.append(valueOf);
                String str3 = "";
                if (this.OooO0o0 == null) {
                    str2 = "";
                } else {
                    str2 = ", hasLinkUri(" + uri.toString().length() + ")";
                }
                sb.append(str2);
                if (this.OooO0o != null) {
                    str3 = ", hasExtras";
                }
                return AbstractC1230oOoOo0o.OooO(sb, str3, "}");
            default:
                return super.toString();
        }
    }

    public C0321o0O0oO0(C0321o0O0oO0 c0321o0O0oO0) {
        ClipData clipData = c0321o0O0oO0.OooO0O0;
        clipData.getClass();
        this.OooO0O0 = clipData;
        int i = c0321o0O0oO0.OooO0OO;
        if (i < 0) {
            Locale locale = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too low)");
        } else if (i <= 5) {
            this.OooO0OO = i;
            int i2 = c0321o0O0oO0.OooO0Oo;
            if ((i2 & 1) == i2) {
                this.OooO0Oo = i2;
                this.OooO0o0 = c0321o0O0oO0.OooO0o0;
                this.OooO0o = c0321o0O0oO0.OooO0o;
                return;
            }
            throw new IllegalArgumentException("Requested flags 0x" + Integer.toHexString(i2) + ", but only 0x" + Integer.toHexString(1) + " are allowed");
        } else {
            Locale locale2 = Locale.US;
            throw new IllegalArgumentException("source is out of range of [0, 5] (too high)");
        }
    }
}


