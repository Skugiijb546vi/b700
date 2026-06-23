package com.ninja.engine;

import android.view.KeyboardShortcutGroup;
import android.view.Menu;
import android.view.Window;
import java.util.List;
/* renamed from: com.ninja.engine.oo0OOo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1506oo0OOo0o {
    public static void OooO00o(Window.Callback callback, List<KeyboardShortcutGroup> list, Menu menu, int i) {
        callback.onProvideKeyboardShortcuts(list, menu, i);
    }
}
