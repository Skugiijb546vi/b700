package com.ninja.engine;

import android.view.ActionMode;
import android.view.SearchEvent;
import android.view.Window;
/* renamed from: com.ninja.engine.oo0OOo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1503oo0OOo0 {
    public static boolean OooO00o(Window.Callback callback, SearchEvent searchEvent) {
        return callback.onSearchRequested(searchEvent);
    }

    public static ActionMode OooO0O0(Window.Callback callback, ActionMode.Callback callback2, int i) {
        return callback.onWindowStartingActionMode(callback2, i);
    }
}
