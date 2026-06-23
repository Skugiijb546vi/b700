package com.ninja.engine;

import android.os.Parcel;
import android.os.Parcelable;
/* renamed from: com.ninja.engine.OooOOOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0016OooOOOo implements Parcelable.ClassLoaderCreator {
    public final /* synthetic */ int OooO00o;

    public /* synthetic */ C0016OooOOOo(int i) {
        this.OooO00o = i;
    }

    @Override // android.os.Parcelable.Creator
    public final Object createFromParcel(Parcel parcel) {
        switch (this.OooO00o) {
            case 0:
                if (parcel.readParcelable(null) == null) {
                    return AbstractC0018OooOOo0.OooO0O0;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0226o00oO00o(parcel, (ClassLoader) null);
            case 2:
                return new C0460o0OoOoOO(parcel, null);
            case 3:
                return new C0330o0O0oOoo(parcel, null);
            case 4:
                return new C0853oO0oOO00(parcel, null);
            case 5:
                return new oOO0O0O0(parcel, null);
            case 6:
                return new C0991oOOO0ooo(parcel, null);
            case 7:
                return new C1076oOOo0oOO(parcel, null);
            case 8:
                return new C1219oOoOOoo0(parcel, (ClassLoader) null);
            case 9:
                return new C1301oOooOO(parcel, null);
            default:
                return new C1337oOoooO0O(parcel, null);
        }
    }

    @Override // android.os.Parcelable.Creator
    public final Object[] newArray(int i) {
        switch (this.OooO00o) {
            case 0:
                return new AbstractC0018OooOOo0[i];
            case 1:
                return new C0226o00oO00o[i];
            case 2:
                return new C0460o0OoOoOO[i];
            case 3:
                return new C0330o0O0oOoo[i];
            case 4:
                return new C0853oO0oOO00[i];
            case 5:
                return new oOO0O0O0[i];
            case 6:
                return new C0991oOOO0ooo[i];
            case 7:
                return new C1076oOOo0oOO[i];
            case 8:
                return new C1219oOoOOoo0[i];
            case 9:
                return new C1301oOooOO[i];
            default:
                return new C1337oOoooO0O[i];
        }
    }

    @Override // android.os.Parcelable.ClassLoaderCreator
    public final Object createFromParcel(Parcel parcel, ClassLoader classLoader) {
        switch (this.OooO00o) {
            case 0:
                if (parcel.readParcelable(classLoader) == null) {
                    return AbstractC0018OooOOo0.OooO0O0;
                }
                throw new IllegalStateException("superState must be null");
            case 1:
                return new C0226o00oO00o(parcel, classLoader);
            case 2:
                return new C0460o0OoOoOO(parcel, classLoader);
            case 3:
                return new C0330o0O0oOoo(parcel, classLoader);
            case 4:
                return new C0853oO0oOO00(parcel, classLoader);
            case 5:
                return new oOO0O0O0(parcel, classLoader);
            case 6:
                return new C0991oOOO0ooo(parcel, classLoader);
            case 7:
                return new C1076oOOo0oOO(parcel, classLoader);
            case 8:
                return new C1219oOoOOoo0(parcel, classLoader);
            case 9:
                return new C1301oOooOO(parcel, classLoader);
            default:
                return new C1337oOoooO0O(parcel, classLoader);
        }
    }
}
