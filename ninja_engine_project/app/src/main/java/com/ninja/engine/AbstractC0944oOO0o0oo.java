package com.ninja.engine;

import android.animation.ObjectAnimator;
import android.animation.TypeConverter;
import android.graphics.Path;
import android.util.Property;
/* renamed from: com.ninja.engine.oOO0o0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0944oOO0o0oo {
    public static <T, V> ObjectAnimator OooO00o(T t, Property<T, V> property, Path path) {
        return ObjectAnimator.ofObject(t, property, (TypeConverter) null, path);
    }
}
