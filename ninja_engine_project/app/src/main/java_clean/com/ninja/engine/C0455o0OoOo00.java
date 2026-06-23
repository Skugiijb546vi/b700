package com.ninja.engine;

import android.app.Activity;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.pm.Signature;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.Base64;
import android.util.Log;
import android.view.View;
import androidx.cardview.widget.CardView;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.WeakHashMap;
/* renamed from: com.ninja.engine.o0OoOo00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0455o0OoOo00 implements oOO000o, InterfaceC1134oOOooo0, InterfaceC0899oO0oooo, oO0O0O, InterfaceC0206o00o0OOO, InterfaceC1933ooo0OoO, InterfaceC0654o0ooOO, InterfaceC0488o0Ooooo, InterfaceC0398o0OOoo0o, InterfaceC0624o0oo0OOO {
    public final /* synthetic */ int OooO00o;
    public static final C0455o0OoOo00 OooO0O0 = new C0455o0OoOo00(1);
    public static final C0455o0OoOo00 OooO0OO = new C0455o0OoOo00(2);
    public static final C0455o0OoOo00 OooO0Oo = new C0455o0OoOo00(3);
    public static final C0455o0OoOo00 OooO0o0 = new C0455o0OoOo00(4);
    public static final C0455o0OoOo00 OooO0o = new C0455o0OoOo00(5);
    public static final C0455o0OoOo00 OooO0oO = new C0455o0OoOo00(6);
    public static final C0455o0OoOo00 OooO0oo = new C0455o0OoOo00(7);
    public static final C0455o0OoOo00 OooO = new C0455o0OoOo00(8);

    public /* synthetic */ C0455o0OoOo00(int i) {
        this.OooO00o = i;
    }

    public static ByteArrayInputStream OooOo0(String str) {
        if (str.startsWith("data:image")) {
            int indexOf = str.indexOf(44);
            if (indexOf != -1) {
                if (str.substring(0, indexOf).endsWith(";base64")) {
                    return new ByteArrayInputStream(Base64.decode(str.substring(indexOf + 1), 0));
                }
                throw new IllegalArgumentException("Not a base64 image data URL.");
            }
            throw new IllegalArgumentException("Missing comma in data URL.");
        }
        throw new IllegalArgumentException("Not a valid image data URL.");
    }

    public static C0455o0OoOo00 OooOo00(Context context, int i) {
        boolean z;
        if (i != 0) {
            z = true;
        } else {
            z = false;
        }
        AbstractC0809oO0OooOO.OooOO0("Cannot create a CalendarItemStyle with a styleResId of 0", z);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(i, AbstractC1038oOOOoo0O.OooOOo0);
        Rect rect = new Rect(obtainStyledAttributes.getDimensionPixelOffset(0, 0), obtainStyledAttributes.getDimensionPixelOffset(2, 0), obtainStyledAttributes.getDimensionPixelOffset(1, 0), obtainStyledAttributes.getDimensionPixelOffset(3, 0));
        ColorStateList OooOooO = AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 4);
        ColorStateList OooOooO2 = AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 9);
        ColorStateList OooOooO3 = AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 7);
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(8, 0);
        C1204oOoOOOO0 OooO00o = C1204oOoOOOO0.OooO00o(context, obtainStyledAttributes.getResourceId(5, 0), obtainStyledAttributes.getResourceId(6, 0), new C0017OooOOo(0)).OooO00o();
        obtainStyledAttributes.recycle();
        return new C0455o0OoOo00(OooOooO, OooOooO2, OooOooO3, dimensionPixelSize, OooO00o, rect);
    }

    @Override // com.ninja.engine.InterfaceC0206o00o0OOO
    public void OooO(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // com.ninja.engine.InterfaceC0654o0ooOO
    public Class OooO00o() {
        switch (this.OooO00o) {
            case 15:
                return ByteBuffer.class;
            default:
                return InputStream.class;
        }
    }

    @Override // com.ninja.engine.oOO000o
    public InterfaceC0904oOO000o0 OooO0Oo(oOO00OOO ooo00ooo) {
        switch (this.OooO00o) {
            case 5:
                return C1390oo00O0Oo.OooO0O0;
            case 16:
                return new C0230o00oOO(0, new C0455o0OoOo00(15));
            case 18:
                return new C0230o00oOO(0, new C0455o0OoOo00(17));
            default:
                return new C1390oo00O0Oo(1);
        }
    }

    @Override // com.ninja.engine.InterfaceC0899oO0oooo
    public boolean OooO0o(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        return false;
    }

    @Override // com.ninja.engine.InterfaceC0488o0Ooooo
    public boolean OooO0o0(Object obj, File file, C0973oOOO00o c0973oOOO00o) {
        try {
            AbstractC0242o00oOoO0.OooO0Oo((ByteBuffer) obj, file);
            return true;
        } catch (IOException unused) {
            Log.isLoggable("ByteBufferEncoder", 3);
            return false;
        }
    }

    @Override // com.ninja.engine.InterfaceC0206o00o0OOO
    public Bitmap OooO0oO(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.ninja.engine.InterfaceC0206o00o0OOO
    public Bitmap OooO0oo(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // com.ninja.engine.InterfaceC0654o0ooOO
    public Object OooOO0(byte[] bArr) {
        switch (this.OooO00o) {
            case 15:
                return ByteBuffer.wrap(bArr);
            default:
                return new ByteArrayInputStream(bArr);
        }
    }

    @Override // com.ninja.engine.oO0O0O
    public void OooOO0o(oO0O0Oo0 oo0o0oo0) {
        oo0o0oo0.OooOO0();
    }

    @Override // com.ninja.engine.InterfaceC1933ooo0OoO
    public C1536oo0OoOoO OooOOOO(View view, C1536oo0OoOoO c1536oo0OoOoO, C1598oo0oOOoO c1598oo0oOOoO) {
        int i;
        c1598oo0oOOoO.OooO0Oo = c1536oo0OoOoO.OooO00o() + c1598oo0oOOoO.OooO0Oo;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        boolean z = true;
        if (view.getLayoutDirection() != 1) {
            z = false;
        }
        int OooO0O02 = c1536oo0OoOoO.OooO0O0();
        int OooO0OO2 = c1536oo0OoOoO.OooO0OO();
        int i2 = c1598oo0oOOoO.OooO00o;
        if (z) {
            i = OooO0OO2;
        } else {
            i = OooO0O02;
        }
        int i3 = i2 + i;
        c1598oo0oOOoO.OooO00o = i3;
        int i4 = c1598oo0oOOoO.OooO0OO;
        if (!z) {
            OooO0O02 = OooO0OO2;
        }
        int i5 = i4 + OooO0O02;
        c1598oo0oOOoO.OooO0OO = i5;
        view.setPaddingRelative(i3, c1598oo0oOOoO.OooO0O0, i5, c1598oo0oOOoO.OooO0Oo);
        return c1536oo0OoOoO;
    }

    @Override // com.ninja.engine.InterfaceC0398o0OOoo0o
    public File OooOOOo(InterfaceC0745oO00oOo interfaceC0745oO00oOo) {
        return null;
    }

    public int OooOOoo(CharSequence charSequence, int i) {
        int i2 = 2;
        for (int i3 = 0; i3 < i && i2 == 2; i3++) {
            byte directionality = Character.getDirectionality(charSequence.charAt(i3));
            C0224o00oO000 c0224o00oO000 = AbstractC1300oOooO0oo.OooO00o;
            if (directionality != 0) {
                if (directionality != 1 && directionality != 2) {
                    switch (directionality) {
                        case 14:
                        case 15:
                            break;
                        case 16:
                        case 17:
                            break;
                        default:
                            i2 = 2;
                            break;
                    }
                }
                i2 = 0;
            }
            i2 = 1;
        }
        return i2;
    }

    public void OooOo(C0415o0Oo0O0O c0415o0Oo0O0O, float f) {
        C1146oOo0000 c1146oOo0000 = (C1146oOo0000) ((Drawable) c0415o0Oo0O0O.OooO0O0);
        CardView cardView = (CardView) c0415o0Oo0O0O.OooO0OO;
        boolean useCompatPadding = cardView.getUseCompatPadding();
        boolean preventCornerOverlap = cardView.getPreventCornerOverlap();
        if (f != c1146oOo0000.OooO0o0 || c1146oOo0000.OooO0o != useCompatPadding || c1146oOo0000.OooO0oO != preventCornerOverlap) {
            c1146oOo0000.OooO0o0 = f;
            c1146oOo0000.OooO0o = useCompatPadding;
            c1146oOo0000.OooO0oO = preventCornerOverlap;
            c1146oOo0000.OooO0O0(null);
            c1146oOo0000.invalidateSelf();
        }
        if (!cardView.getUseCompatPadding()) {
            c0415o0Oo0O0O.Oooo(0, 0, 0, 0);
            return;
        }
        C1146oOo0000 c1146oOo00002 = (C1146oOo0000) ((Drawable) c0415o0Oo0O0O.OooO0O0);
        float f2 = c1146oOo00002.OooO0o0;
        float f3 = c1146oOo00002.OooO00o;
        int ceil = (int) Math.ceil(AbstractC1145oOo000.OooO00o(f2, f3, cardView.getPreventCornerOverlap()));
        int ceil2 = (int) Math.ceil(AbstractC1145oOo000.OooO0O0(f2, f3, cardView.getPreventCornerOverlap()));
        c0415o0Oo0O0O.Oooo(ceil, ceil2, ceil, ceil2);
    }

    public C0455o0OoOo00() {}
    public Signature[] OooOo0O(PackageManager packageManager, String str) {
        return packageManager.getPackageInfo(str, 64).signatures;
    }

    public void OooOo0o(Throwable th) {
        Log.isLoggable("GlideExecutor", 6);
    }

    public String toString() {
        switch (this.OooO00o) {
            case 4:
                return "kotlin.Unit";
            default:
                return super.toString();
        }
    }

    public C0455o0OoOo00(ColorStateList colorStateList, ColorStateList colorStateList2, ColorStateList colorStateList3, int i, C1204oOoOOOO0 c1204oOoOOOO0, Rect rect) {
        this.OooO00o = 22;
        AbstractC0809oO0OooOO.OooOO0O(rect.left);
        AbstractC0809oO0OooOO.OooOO0O(rect.top);
        AbstractC0809oO0OooOO.OooOO0O(rect.right);
        AbstractC0809oO0OooOO.OooOO0O(rect.bottom);
    }

    public C0455o0OoOo00(AbstractC1794ooOOOOoO abstractC1794ooOOOOoO, AbstractC1794ooOOOOoO abstractC1794ooOOOOoO2) {
        this.OooO00o = 24;
        abstractC1794ooOOOOoO.getClass();
        abstractC1794ooOOOOoO2.getClass();
        if (0.0f > 0.0f) {
            throw new IllegalArgumentException();
        }
    }

    @Override // com.ninja.engine.InterfaceC0624o0oo0OOO
    public void OooOO0O(Activity activity) {
    }

    @Override // com.ninja.engine.InterfaceC0206o00o0OOO
    public void OooOOO(int i) {
    }

    @Override // com.ninja.engine.oO0O0O
    public void OooOOO0(oO0O0Oo0 oo0o0oo0) {
    }

    @Override // com.ninja.engine.InterfaceC0206o00o0OOO
    public void OooOOo0() {
    }

    @Override // com.ninja.engine.InterfaceC0899oO0oooo
    public void OooO0O0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, boolean z) {
    }

    @Override // com.ninja.engine.InterfaceC0398o0OOoo0o
    public void OooO0OO(InterfaceC0745oO00oOo interfaceC0745oO00oOo, C0131o00O0o c0131o00O0o) {
    }

    @Override // com.ninja.engine.InterfaceC1134oOOooo0
    public InterfaceC1108oOOoo OooOOo(InterfaceC1108oOOoo interfaceC1108oOOoo, C0973oOOO00o c0973oOOO00o) {
        return interfaceC1108oOOoo;
    }
}


