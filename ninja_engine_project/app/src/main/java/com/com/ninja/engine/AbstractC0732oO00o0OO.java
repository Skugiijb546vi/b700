package com.ninja.engine;
/* renamed from: com.ninja.engine.oO00o0OO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0732oO00o0OO {
    public static final Integer OooO00o;

    static {
        Integer num;
        Object obj;
        Integer num2 = null;
        try {
            obj = Class.forName("android.os.Build$VERSION").getField("SDK_INT").get(null);
        } catch (Throwable unused) {
        }
        if (obj instanceof Integer) {
            num = (Integer) obj;
            if (num != null && num.intValue() > 0) {
                num2 = num;
            }
            OooO00o = num2;
        }
        num = null;
        if (num != null) {
            num2 = num;
        }
        OooO00o = num2;
    }
}
