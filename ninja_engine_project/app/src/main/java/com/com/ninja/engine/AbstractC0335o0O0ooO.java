package com.ninja.engine;

import android.app.Activity;
import android.content.ClipData;
import android.os.Build;
import android.text.Selection;
import android.text.Spannable;
import android.view.DragEvent;
import android.view.View;
import android.widget.TextView;
/* renamed from: com.ninja.engine.o0O0ooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC0335o0O0ooO {
    public static boolean OooO00o(DragEvent dragEvent, TextView textView, Activity activity) {
        InterfaceC1982oooOO0 interfaceC1982oooOO0;
        activity.requestDragAndDropPermissions(dragEvent);
        int offsetForPosition = textView.getOffsetForPosition(dragEvent.getX(), dragEvent.getY());
        textView.beginBatchEdit();
        try {
            Selection.setSelection((Spannable) textView.getText(), offsetForPosition);
            ClipData clipData = dragEvent.getClipData();
            if (Build.VERSION.SDK_INT >= 31) {
                interfaceC1982oooOO0 = new o00O(clipData, 3);
            } else {
                C0321o0O0oO0 c0321o0O0oO0 = new C0321o0O0oO0();
                c0321o0O0oO0.OooO0O0 = clipData;
                c0321o0O0oO0.OooO0OO = 3;
                interfaceC1982oooOO0 = c0321o0O0oO0;
            }
            AbstractC1460oo0O00oo.OooOO0o(textView, interfaceC1982oooOO0.OooO0oo());
            textView.endBatchEdit();
            return true;
        } catch (Throwable th) {
            textView.endBatchEdit();
            throw th;
        }
    }

    public static boolean OooO0O0(DragEvent dragEvent, View view, Activity activity) {
        InterfaceC1982oooOO0 interfaceC1982oooOO0;
        activity.requestDragAndDropPermissions(dragEvent);
        ClipData clipData = dragEvent.getClipData();
        if (Build.VERSION.SDK_INT >= 31) {
            interfaceC1982oooOO0 = new o00O(clipData, 3);
        } else {
            C0321o0O0oO0 c0321o0O0oO0 = new C0321o0O0oO0();
            c0321o0O0oO0.OooO0O0 = clipData;
            c0321o0O0oO0.OooO0OO = 3;
            interfaceC1982oooOO0 = c0321o0O0oO0;
        }
        AbstractC1460oo0O00oo.OooOO0o(view, interfaceC1982oooOO0.OooO0oo());
        return true;
    }
}
