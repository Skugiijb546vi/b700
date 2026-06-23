package com.ninja.engine;

import android.os.Parcelable;
import java.util.List;
@InterfaceC0158o00Oo0O0("android.content.pm.ParceledListSlice")
/* renamed from: com.ninja.engine.ooO0oO0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1725ooO0oO0o {
    @InterfaceC0168o00OoOO
    Parcelable.Creator CREATOR();

    @InterfaceC0159o00Oo0Oo
    Object _new();

    @InterfaceC0159o00Oo0Oo
    Object _new(List<?> list);

    @InterfaceC0153o00Oo
    Boolean append(Object obj);

    @InterfaceC0153o00Oo
    List<?> getList();

    @InterfaceC0153o00Oo
    Boolean isLastSlice();

    @InterfaceC0153o00Oo
    Parcelable populateList();

    @InterfaceC0153o00Oo
    void setLastSlice(boolean z);
}


