package com.ninja.engine;

import android.content.res.AssetFileDescriptor;
import android.graphics.Matrix;
import android.graphics.Path;
import android.media.MediaExtractor;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.os.ParcelFileDescriptor;
import android.text.Spannable;
import android.view.View;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.ByteBuffer;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.List;
/* renamed from: com.ninja.engine.oOO00oOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0919oOO00oOo implements InterfaceC0353o0OO0ooo, oOOO00Oo, InterfaceC1004oOOOOo0o, InterfaceC0526o0o0O0, oOO000o {
    public static boolean OooO = true;
    public static C0919oOO00oOo OooO0O0 = null;
    public static boolean OooO0OO = true;
    public static Method OooO0Oo = null;
    public static Field OooO0o = null;
    public static boolean OooO0o0 = false;
    public static boolean OooO0oO = false;
    public static boolean OooO0oo = true;
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ C0919oOO00oOo(int i) {
        this.OooO00o = i;
    }

    public static Path OooO0OO(float f, float f2, float f3, float f4) {
        Path path = new Path();
        path.moveTo(f, f2);
        path.lineTo(f3, f4);
        return path;
    }

    public boolean OooO(Object obj) {
        return ((C0575o0oOo0) obj).OooO0Oo;
    }

    public float OooO0O0(float f, float f2) {
        return 1.0f;
    }

    @Override // com.ninja.engine.oOO000o
    public InterfaceC0904oOO000o0 OooO0Oo(oOO00OOO ooo00ooo) {
        switch (this.OooO00o) {
            case 13:
                return new C1261oOoo00Oo(ooo00ooo.OooOO0(Uri.class, AssetFileDescriptor.class), 0);
            case 14:
                return new C1261oOoo00Oo(ooo00ooo.OooOO0(Uri.class, ParcelFileDescriptor.class), 0);
            case 15:
                return new C1261oOoo00Oo(ooo00ooo.OooOO0(Uri.class, InputStream.class), 0);
            case 16:
            case 17:
            case 18:
            default:
                return new C1398oo00OO0O(ooo00ooo.OooOO0(oO0000O.class, InputStream.class));
            case 19:
                return new C1261oOoo00Oo(ooo00ooo.OooOO0(oO0000O.class, InputStream.class), 1);
        }
    }

    public int OooO0o(Object obj) {
        return ((C0575o0oOo0) obj).OooO0OO;
    }

    public float OooO0o0(View view) {
        if (OooO0OO) {
            try {
                return AbstractC1481oo0O0oo0.OooO00o(view);
            } catch (NoSuchMethodError unused) {
                OooO0OO = false;
            }
        }
        return view.getAlpha();
    }

    public void OooO0oO(MediaExtractor mediaExtractor, Object obj) {
        switch (this.OooO00o) {
            case 22:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaExtractor.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                return;
            case 23:
                mediaExtractor.setDataSource(new C1440oo00ooO((ByteBuffer) obj));
                return;
            default:
                mediaExtractor.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                return;
        }
    }

    public void OooO0oo(MediaMetadataRetriever mediaMetadataRetriever, Object obj) {
        switch (this.OooO00o) {
            case 22:
                AssetFileDescriptor assetFileDescriptor = (AssetFileDescriptor) obj;
                mediaMetadataRetriever.setDataSource(assetFileDescriptor.getFileDescriptor(), assetFileDescriptor.getStartOffset(), assetFileDescriptor.getLength());
                return;
            case 23:
                mediaMetadataRetriever.setDataSource(new C1440oo00ooO((ByteBuffer) obj));
                return;
            default:
                mediaMetadataRetriever.setDataSource(((ParcelFileDescriptor) obj).getFileDescriptor());
                return;
        }
    }

    public boolean OooOO0(Spannable spannable) {
        return false;
    }

    public void OooOO0o(View view, int i, int i2, int i3, int i4) {
        if (!OooO0o0) {
            try {
                Class cls = Integer.TYPE;
                Method declaredMethod = View.class.getDeclaredMethod("setFrame", cls, cls, cls, cls);
                OooO0Oo = declaredMethod;
                declaredMethod.setAccessible(true);
            } catch (NoSuchMethodException unused) {
            }
            OooO0o0 = true;
        }
        Method method = OooO0Oo;
        if (method != null) {
            try {
                method.invoke(view, Integer.valueOf(i), Integer.valueOf(i2), Integer.valueOf(i3), Integer.valueOf(i4));
            } catch (IllegalAccessException unused2) {
            } catch (InvocationTargetException e) {
                throw new RuntimeException(e.getCause());
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC0526o0o0O0
    public Object OooOOO() {
        try {
            return new C1188oOoOO000(MessageDigest.getInstance("SHA-256"));
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    public void OooOOO0(View view, float f) {
        if (OooO0OO) {
            try {
                AbstractC1481oo0O0oo0.OooO0O0(view, f);
                return;
            } catch (NoSuchMethodError unused) {
                OooO0OO = false;
            }
        }
        view.setAlpha(f);
    }

    public void OooOOOO(View view, int i) {
        if (!OooO0oO) {
            try {
                Field declaredField = View.class.getDeclaredField("mViewFlags");
                OooO0o = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused) {
            }
            OooO0oO = true;
        }
        Field field = OooO0o;
        if (field != null) {
            try {
                OooO0o.setInt(view, i | (field.getInt(view) & (-13)));
            } catch (IllegalAccessException unused2) {
            }
        }
    }

    public void OooOOOo(View view, Matrix matrix) {
        if (OooO0oo) {
            try {
                AbstractC1480oo0O0oo.OooO0O0(view, matrix);
            } catch (NoSuchMethodError unused) {
                OooO0oo = false;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC1004oOOOOo0o
    public void OooOOo(int i, Object obj) {
        switch (this.OooO00o) {
            case 4:
                return;
            default:
                if (i == 6 || i == 7 || i == 8) {
                    Throwable th = (Throwable) obj;
                    return;
                }
                return;
        }
    }

    public void OooOOoo(View view, Matrix matrix) {
        if (OooO) {
            try {
                AbstractC1480oo0O0oo.OooO0OO(view, matrix);
            } catch (NoSuchMethodError unused) {
                OooO = false;
            }
        }
    }

    @Override // com.ninja.engine.InterfaceC0353o0OO0ooo
    public C0647o0ooO0O0 OooOoO(int i) {
        return null;
    }

    @Override // com.ninja.engine.InterfaceC0353o0OO0ooo
    public List OooOoOO(int i) {
        return null;
    }

    @Override // com.ninja.engine.InterfaceC0353o0OO0ooo
    public void OooOo0o(C0647o0ooO0O0 c0647o0ooO0O0) {
    }

    @Override // com.ninja.engine.InterfaceC0353o0OO0ooo
    public void remove(int i) {
    }

    private final void OooOO0O(int i, Object obj) {
    }

    @Override // com.ninja.engine.oOOO00Oo
    public void OooO00o(byte[] bArr, Object obj, MessageDigest messageDigest) {
    }

    @Override // com.ninja.engine.InterfaceC0353o0OO0ooo
    public void OooOOo0(int i, long j, long j2) {
    }
}
