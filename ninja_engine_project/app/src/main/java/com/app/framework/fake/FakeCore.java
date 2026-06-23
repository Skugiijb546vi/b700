package com.app.framework.fake;

import android.app.ActivityThread;
import com.app.bridge.ReflectCore;
/* loaded from: classes.dex */
public class FakeCore {
    public static void init() {
        ReflectCore.set(ActivityThread.class);
    }
}
