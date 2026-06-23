package com.ninja.engine;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ActivityInfo;
import android.content.pm.PackageManager;
import android.content.pm.ResolveInfo;
import android.text.Editable;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ArrayList;
/* renamed from: com.ninja.engine.oOooOOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class ActionMode$CallbackC1306oOooOOO implements ActionMode.Callback {
    public final ActionMode.Callback OooO00o;
    public final TextView OooO0O0;
    public Class OooO0OO;
    public Method OooO0Oo;
    public boolean OooO0o = false;
    public boolean OooO0o0;

    public ActionMode$CallbackC1306oOooOOO(ActionMode.Callback callback, TextView textView) {
        this.OooO00o = callback;
        this.OooO0O0 = textView;
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
        return this.OooO00o.onActionItemClicked(actionMode, menuItem);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
        return this.OooO00o.onCreateActionMode(actionMode, menu);
    }

    @Override // android.view.ActionMode.Callback
    public final void onDestroyActionMode(ActionMode actionMode) {
        this.OooO00o.onDestroyActionMode(actionMode);
    }

    @Override // android.view.ActionMode.Callback
    public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
        Method declaredMethod;
        boolean z;
        int checkSelfPermission;
        TextView textView = this.OooO0O0;
        Context context = textView.getContext();
        PackageManager packageManager = context.getPackageManager();
        if (!this.OooO0o) {
            this.OooO0o = true;
            try {
                Class<?> cls = Class.forName("com.android.internal.view.menu.MenuBuilder");
                this.OooO0OO = cls;
                this.OooO0Oo = cls.getDeclaredMethod("removeItemAt", Integer.TYPE);
                this.OooO0o0 = true;
            } catch (ClassNotFoundException | NoSuchMethodException unused) {
                this.OooO0OO = null;
                this.OooO0Oo = null;
                this.OooO0o0 = false;
            }
        }
        try {
            if (this.OooO0o0 && this.OooO0OO.isInstance(menu)) {
                declaredMethod = this.OooO0Oo;
            } else {
                declaredMethod = menu.getClass().getDeclaredMethod("removeItemAt", Integer.TYPE);
            }
            for (int size = menu.size() - 1; size >= 0; size--) {
                MenuItem item = menu.getItem(size);
                if (item.getIntent() != null && "android.intent.action.PROCESS_TEXT".equals(item.getIntent().getAction())) {
                    declaredMethod.invoke(menu, Integer.valueOf(size));
                }
            }
            ArrayList arrayList = new ArrayList();
            if (context instanceof Activity) {
                for (ResolveInfo resolveInfo : packageManager.queryIntentActivities(new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain"), 0)) {
                    if (!context.getPackageName().equals(resolveInfo.activityInfo.packageName)) {
                        ActivityInfo activityInfo = resolveInfo.activityInfo;
                        if (activityInfo.exported) {
                            String str = activityInfo.permission;
                            if (str != null) {
                                checkSelfPermission = context.checkSelfPermission(str);
                                if (checkSelfPermission == 0) {
                                }
                            }
                        }
                    }
                    arrayList.add(resolveInfo);
                }
            }
            for (int i = 0; i < arrayList.size(); i++) {
                ResolveInfo resolveInfo2 = (ResolveInfo) arrayList.get(i);
                MenuItem add = menu.add(0, 0, i + 100, resolveInfo2.loadLabel(packageManager));
                Intent type = new Intent().setAction("android.intent.action.PROCESS_TEXT").setType("text/plain");
                if ((textView instanceof Editable) && textView.onCheckIsTextEditor() && textView.isEnabled()) {
                    z = true;
                } else {
                    z = false;
                }
                Intent putExtra = type.putExtra("android.intent.extra.PROCESS_TEXT_READONLY", !z);
                ActivityInfo activityInfo2 = resolveInfo2.activityInfo;
                add.setIntent(putExtra.setClassName(activityInfo2.packageName, activityInfo2.name)).setShowAsAction(1);
            }
        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused2) {
        }
        return this.OooO00o.onPrepareActionMode(actionMode, menu);
    }
}
