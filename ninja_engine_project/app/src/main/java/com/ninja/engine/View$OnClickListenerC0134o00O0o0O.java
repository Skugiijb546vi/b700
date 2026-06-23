package com.ninja.engine;

import android.content.Context;
import android.content.ContextWrapper;
import android.view.View;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
/* renamed from: com.ninja.engine.o00O0o0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class View$OnClickListenerC0134o00O0o0O implements View.OnClickListener {
    public final View OooO00o;
    public final String OooO0O0;
    public Method OooO0OO;
    public Context OooO0Oo;

    public View$OnClickListenerC0134o00O0o0O(View view, String str) {
        this.OooO00o = view;
        this.OooO0O0 = str;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int id;
        String str;
        Method method;
        if (this.OooO0OO == null) {
            View view2 = this.OooO00o;
            Context context = view2.getContext();
            while (true) {
                String str2 = this.OooO0O0;
                if (context != null) {
                    try {
                        if (!context.isRestricted() && (method = context.getClass().getMethod(str2, View.class)) != null) {
                            this.OooO0OO = method;
                            this.OooO0Oo = context;
                        }
                    } catch (NoSuchMethodException unused) {
                    }
                    if (context instanceof ContextWrapper) {
                        context = ((ContextWrapper) context).getBaseContext();
                    } else {
                        context = null;
                    }
                } else {
                    if (view2.getId() == -1) {
                        str = "";
                    } else {
                        str = " with id '" + view2.getContext().getResources().getResourceEntryName(id) + "'";
                    }
                    throw new IllegalStateException("Could not find method " + str2 + "(View) in a parent or ancestor Context for android:onClick attribute defined on view " + view2.getClass() + str);
                }
            }
        }
        try {
            this.OooO0OO.invoke(this.OooO0Oo, view);
        } catch (IllegalAccessException e) {
            throw new IllegalStateException("Could not execute non-public method for android:onClick", e);
        } catch (InvocationTargetException e2) {
            throw new IllegalStateException("Could not execute method for android:onClick", e2);
        }
    }
}
