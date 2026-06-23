package com.ninja.engine;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.os.Build;
import android.util.Log;
import java.util.Arrays;
import java.util.HashSet;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
/* renamed from: com.ninja.engine.oo0000O0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1354oo0000O0 {
    public static final Paint OooO00o = new Paint(6);
    public static final Paint OooO0O0 = new Paint(7);
    public static final Paint OooO0OO;
    public static final Lock OooO0Oo;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [java.util.concurrent.locks.Lock] */
    /* JADX WARN: Type inference failed for: r0v8 */
    static {
        ReentrantLock reentrantLock;
        if (new HashSet(Arrays.asList("XT1085", "XT1092", "XT1093", "XT1094", "XT1095", "XT1096", "XT1097", "XT1098", "XT1031", "XT1028", "XT937C", "XT1032", "XT1008", "XT1033", "XT1035", "XT1034", "XT939G", "XT1039", "XT1040", "XT1042", "XT1045", "XT1063", "XT1064", "XT1068", "XT1069", "XT1072", "XT1077", "XT1078", "XT1079")).contains(Build.MODEL)) {
            reentrantLock = new ReentrantLock();
        } else {
            reentrantLock = new ReentrantLock();
        }
        OooO0Oo = reentrantLock;
        Paint paint = new Paint(7);
        OooO0OO = paint;
        paint.setXfermode(new PorterDuffXfermode(PorterDuff.Mode.SRC_IN));
    }

    public static void OooO00o(Bitmap bitmap, Bitmap bitmap2, Matrix matrix) {
        Lock lock = OooO0Oo;
        lock.lock();
        try {
            Canvas canvas = new Canvas(bitmap2);
            canvas.drawBitmap(bitmap, matrix, OooO00o);
            canvas.setBitmap(null);
        } finally {
            lock.unlock();
        }
    }

    public static Bitmap OooO0O0(InterfaceC0206o00o0OOO interfaceC0206o00o0OOO, Bitmap bitmap, int i, int i2) {
        Bitmap.Config config;
        if (bitmap.getWidth() == i && bitmap.getHeight() == i2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        float min = Math.min(i / bitmap.getWidth(), i2 / bitmap.getHeight());
        int round = Math.round(bitmap.getWidth() * min);
        int round2 = Math.round(bitmap.getHeight() * min);
        if (bitmap.getWidth() == round && bitmap.getHeight() == round2) {
            Log.isLoggable("TransformationUtils", 2);
            return bitmap;
        }
        int width = (int) (bitmap.getWidth() * min);
        int height = (int) (bitmap.getHeight() * min);
        if (bitmap.getConfig() != null) {
            config = bitmap.getConfig();
        } else {
            config = Bitmap.Config.ARGB_8888;
        }
        Bitmap OooO0oo = interfaceC0206o00o0OOO.OooO0oo(width, height, config);
        OooO0oo.setHasAlpha(bitmap.hasAlpha());
        if (Log.isLoggable("TransformationUtils", 2)) {
            bitmap.getWidth();
            bitmap.getHeight();
            OooO0oo.getWidth();
            OooO0oo.getHeight();
        }
        Matrix matrix = new Matrix();
        matrix.setScale(min, min);
        OooO00o(bitmap, OooO0oo, matrix);
        return OooO0oo;
    }
}


