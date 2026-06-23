package com.ninja.engine;

import android.app.Activity;
import android.app.Fragment;
import android.app.FragmentManager;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Paint;
import android.net.Uri;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import android.os.Process;
import android.os.StrictMode;
import android.util.LongSparseArray;
import android.view.ActionMode;
import android.view.View;
import android.widget.TextView;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.lang.reflect.Field;
import java.nio.MappedByteBuffer;
import java.nio.channels.FileChannel;
/* renamed from: com.ninja.engine.oOOoOOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1094oOOoOOo0 {
    public static Field OooO00o;
    public static boolean OooO0O0;
    public static Class OooO0OO;
    public static boolean OooO0Oo;
    public static boolean OooO0o;
    public static Field OooO0o0;
    public static Field OooO0oO;
    public static boolean OooO0oo;

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0061, code lost:
        if (r9 != 2) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0074, code lost:
        if (r4 != false) goto L31;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.ninja.engine.C0998oOOOO0o0 OooO(android.widget.TextView r9) {
        /*
            int r0 = android.os.Build.VERSION.SDK_INT
            r1 = 28
            if (r0 < r1) goto L10
            com.ninja.engine.oOOOO0o0 r0 = new com.ninja.engine.oOOOO0o0
            android.text.PrecomputedText$Params r9 = com.ninja.engine.AbstractC0408o0Oo00o.OooO0oo(r9)
            r0.<init>(r9)
            return r0
        L10:
            android.text.TextPaint r2 = new android.text.TextPaint
            android.text.TextPaint r3 = r9.getPaint()
            r2.<init>(r3)
            int r3 = android.os.Build.VERSION.SDK_INT
            r4 = 0
            r5 = 1
            r6 = 23
            if (r3 < r6) goto L24
            r3 = 1
            r7 = 1
            goto L26
        L24:
            r3 = 0
            r7 = 0
        L26:
            android.text.TextDirectionHeuristic r8 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            if (r0 < r6) goto L32
            int r3 = com.ninja.engine.AbstractC0121o000oooo.OooO00o(r9)
            int r7 = com.ninja.engine.AbstractC0121o000oooo.OooO0o0(r9)
        L32:
            android.text.method.TransformationMethod r6 = r9.getTransformationMethod()
            boolean r6 = r6 instanceof android.text.method.PasswordTransformationMethod
            if (r6 == 0) goto L3d
        L3a:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.LTR
            goto L81
        L3d:
            if (r0 < r1) goto L66
            int r0 = r9.getInputType()
            r0 = r0 & 15
            r1 = 3
            if (r0 != r1) goto L66
            java.util.Locale r9 = r9.getTextLocale()
            android.icu.text.DecimalFormatSymbols r9 = com.ninja.engine.AbstractC0795oO0OoO.OooO0OO(r9)
            java.lang.String[] r9 = com.ninja.engine.AbstractC0408o0Oo00o.OooO00o(r9)
            r9 = r9[r4]
            int r9 = r9.codePointAt(r4)
            byte r9 = java.lang.Character.getDirectionality(r9)
            if (r9 == r5) goto L63
            r0 = 2
            if (r9 != r0) goto L3a
        L63:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.RTL
            goto L81
        L66:
            int r0 = r9.getLayoutDirection()
            if (r0 != r5) goto L6d
            r4 = 1
        L6d:
            int r9 = r9.getTextDirection()
            switch(r9) {
                case 2: goto L7f;
                case 3: goto L3a;
                case 4: goto L63;
                case 5: goto L7c;
                case 6: goto L79;
                case 7: goto L76;
                default: goto L74;
            }
        L74:
            if (r4 == 0) goto L79
        L76:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_RTL
            goto L81
        L79:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.FIRSTSTRONG_LTR
            goto L81
        L7c:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.LOCALE
            goto L81
        L7f:
            android.text.TextDirectionHeuristic r9 = android.text.TextDirectionHeuristics.ANYRTL_LTR
        L81:
            com.ninja.engine.oOOOO0o0 r0 = new com.ninja.engine.oOOOO0o0
            r0.<init>(r2, r9, r3, r7)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.AbstractC1094oOOoOOo0.OooO(android.widget.TextView):com.ninja.engine.oOOOO0o0");
    }

    public static void OooO0OO(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    public static boolean OooO0Oo(File file, Resources resources, int i) {
        InputStream inputStream;
        try {
            inputStream = resources.openRawResource(i);
            try {
                boolean OooO0o02 = OooO0o0(inputStream, file);
                OooO0OO(inputStream);
                return OooO0o02;
            } catch (Throwable th) {
                th = th;
                OooO0OO(inputStream);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            inputStream = null;
        }
    }

    public static void OooO0o(Activity activity, oO0O0O0o oo0o0o0o) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        AbstractC0809oO0OooOO.OooOOOo(oo0o0o0o, "event");
        if (activity instanceof InterfaceC0760oO0O0o0O) {
            androidx.lifecycle.OooO00o OooO0o02 = ((InterfaceC0760oO0O0o0O) activity).OooO0o0();
            if (OooO0o02 instanceof androidx.lifecycle.OooO00o) {
                OooO0o02.OooO0Oo(oo0o0o0o);
            }
        }
    }

    public static boolean OooO0o0(InputStream inputStream, File file) {
        FileOutputStream fileOutputStream;
        StrictMode.ThreadPolicy allowThreadDiskWrites = StrictMode.allowThreadDiskWrites();
        FileOutputStream fileOutputStream2 = null;
        try {
            try {
                fileOutputStream = new FileOutputStream(file, false);
            } catch (IOException e) {
                e = e;
            }
        } catch (Throwable th) {
            th = th;
        }
        try {
            byte[] bArr = new byte[1024];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    fileOutputStream.write(bArr, 0, read);
                } else {
                    OooO0OO(fileOutputStream);
                    StrictMode.setThreadPolicy(allowThreadDiskWrites);
                    return true;
                }
            }
        } catch (IOException e2) {
            e = e2;
            fileOutputStream2 = fileOutputStream;
            e.getMessage();
            OooO0OO(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            return false;
        } catch (Throwable th2) {
            th = th2;
            fileOutputStream2 = fileOutputStream;
            OooO0OO(fileOutputStream2);
            StrictMode.setThreadPolicy(allowThreadDiskWrites);
            throw th;
        }
    }

    public static void OooO0oO(Object obj) {
        LongSparseArray longSparseArray;
        if (!OooO0Oo) {
            try {
                OooO0OO = Class.forName("android.content.res.ThemedResourceCache");
            } catch (ClassNotFoundException unused) {
            }
            OooO0Oo = true;
        }
        Class cls = OooO0OO;
        if (cls == null) {
            return;
        }
        if (!OooO0o) {
            try {
                Field declaredField = cls.getDeclaredField("mUnthemedEntries");
                OooO0o0 = declaredField;
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException unused2) {
            }
            OooO0o = true;
        }
        Field field = OooO0o0;
        if (field == null) {
            return;
        }
        try {
            longSparseArray = (LongSparseArray) field.get(obj);
        } catch (IllegalAccessException unused3) {
            longSparseArray = null;
        }
        if (longSparseArray != null) {
            longSparseArray.clear();
        }
    }

    public static File OooO0oo(Context context) {
        File cacheDir = context.getCacheDir();
        if (cacheDir == null) {
            return null;
        }
        String str = ".font" + Process.myPid() + "-" + Process.myTid() + "-";
        for (int i = 0; i < 100; i++) {
            File file = new File(cacheDir, str + i);
            if (file.createNewFile()) {
                return file;
            }
        }
        return null;
    }

    public static int OooOO0o(int i) {
        if (i != 1) {
            if (i == 2) {
                return 1;
            }
            if (i == 4) {
                return 2;
            }
            if (i != 8) {
                if (i == 16) {
                    return 4;
                }
                if (i != 32) {
                    if (i != 64) {
                        if (i != 128) {
                            if (i == 256) {
                                return 8;
                            }
                            throw new IllegalArgumentException(AbstractC1230oOoOo0o.OooO0o(i, "type needs to be >= FIRST and <= LAST, type="));
                        }
                        return 7;
                    }
                    return 6;
                }
                return 5;
            }
            return 3;
        }
        return 0;
    }

    public static MappedByteBuffer OooOOO(Context context, Uri uri) {
        try {
            ParcelFileDescriptor openFileDescriptor = context.getContentResolver().openFileDescriptor(uri, "r", null);
            if (openFileDescriptor == null) {
                if (openFileDescriptor != null) {
                    openFileDescriptor.close();
                }
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(openFileDescriptor.getFileDescriptor());
            FileChannel channel = fileInputStream.getChannel();
            MappedByteBuffer map = channel.map(FileChannel.MapMode.READ_ONLY, 0L, channel.size());
            fileInputStream.close();
            openFileDescriptor.close();
            return map;
        } catch (IOException unused) {
            return null;
        }
    }

    public static void OooOOO0(Activity activity) {
        AbstractC0809oO0OooOO.OooOOOo(activity, "activity");
        if (Build.VERSION.SDK_INT >= 29) {
            C1095oOOoOOoO.Companion.getClass();
            activity.registerActivityLifecycleCallbacks(new C1095oOOoOOoO());
        }
        FragmentManager fragmentManager = activity.getFragmentManager();
        if (fragmentManager.findFragmentByTag("androidx.lifecycle.LifecycleDispatcher.report_fragment_tag") == null) {
            fragmentManager.beginTransaction().add(new Fragment(), "androidx.lifecycle.LifecycleDispatcher.report_fragment_tag").commit();
            fragmentManager.executePendingTransactions();
        }
    }

    public static final void OooOOoo(View view, InterfaceC0963oOO0ooOO interfaceC0963oOO0ooOO) {
        AbstractC0809oO0OooOO.OooOOOo(view, "<this>");
        AbstractC0809oO0OooOO.OooOOOo(interfaceC0963oOO0ooOO, "onBackPressedDispatcherOwner");
        view.setTag(R.id.view_tree_on_back_pressed_dispatcher_owner, interfaceC0963oOO0ooOO);
    }

    public static void OooOo0(TextView textView, int i) {
        int i2;
        AbstractC0809oO0OooOO.OooOO0O(i);
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.bottom;
        } else {
            i2 = fontMetricsInt.descent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), textView.getPaddingTop(), textView.getPaddingRight(), i - i2);
        }
    }

    public static void OooOo00(TextView textView, int i) {
        int i2;
        AbstractC0809oO0OooOO.OooOO0O(i);
        if (Build.VERSION.SDK_INT >= 28) {
            AbstractC0408o0Oo00o.OooO(textView, i);
            return;
        }
        Paint.FontMetricsInt fontMetricsInt = textView.getPaint().getFontMetricsInt();
        if (textView.getIncludeFontPadding()) {
            i2 = fontMetricsInt.top;
        } else {
            i2 = fontMetricsInt.ascent;
        }
        if (i > Math.abs(i2)) {
            textView.setPadding(textView.getPaddingLeft(), i + i2, textView.getPaddingRight(), textView.getPaddingBottom());
        }
    }

    public static void OooOo0O(TextView textView, int i) {
        AbstractC0809oO0OooOO.OooOO0O(i);
        int fontMetricsInt = textView.getPaint().getFontMetricsInt(null);
        if (i != fontMetricsInt) {
            textView.setLineSpacing(i - fontMetricsInt, 1.0f);
        }
    }

    public static void OooOo0o(TextView textView, int i) {
        if (Build.VERSION.SDK_INT >= 23) {
            textView.setTextAppearance(i);
        } else {
            textView.setTextAppearance(textView.getContext(), i);
        }
    }

    public static ActionMode.Callback OooOoO(ActionMode.Callback callback, TextView textView) {
        int i = Build.VERSION.SDK_INT;
        if (i >= 26 && i <= 27 && !(callback instanceof ActionMode$CallbackC1306oOooOOO) && callback != null) {
            return new ActionMode$CallbackC1306oOooOOO(callback, textView);
        }
        return callback;
    }

    public static ActionMode.Callback OooOoO0(ActionMode.Callback callback) {
        if ((callback instanceof ActionMode$CallbackC1306oOooOOO) && Build.VERSION.SDK_INT >= 26) {
            return ((ActionMode$CallbackC1306oOooOOO) callback).OooO00o;
        }
        return callback;
    }

    public abstract int OooO00o(View view, int i);

    public abstract int OooO0O0(View view, int i);

    public int OooOO0(View view) {
        return 0;
    }

    public int OooOO0O() {
        return 0;
    }

    public abstract void OooOOOo(int i);

    public abstract void OooOOo(View view, float f, float f2);

    public abstract void OooOOo0(View view, int i, int i2);

    public abstract boolean OooOo(View view, int i);

    public void OooOOOO(View view, int i) {
    }
}


