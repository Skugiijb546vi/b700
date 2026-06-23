package com.ninja.engine;

import android.os.Parcelable;
import java.lang.reflect.Method;
import java.util.List;
@InterfaceC0157o00Oo0O("android.content.pm.ParceledListSlice")
/* renamed from: com.ninja.engine.ooOO00  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public interface InterfaceC1743ooOO00 {
    @InterfaceC0166o00OoO00
    Method _check_append(Object obj);

    @InterfaceC0166o00OoO00
    Method _check_getList();

    @InterfaceC0166o00OoO00
    Method _check_isLastSlice();

    @InterfaceC0166o00OoO00
    Method _check_populateList();

    @InterfaceC0166o00OoO00
    Method _check_setLastSlice(boolean z);

    Boolean append(Object obj);

    List<?> getList();

    Boolean isLastSlice();

    Parcelable populateList();

    Void setLastSlice(boolean z);
}


