package com.app.framework.core;

import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
/* loaded from: classes.dex */
public interface IEmpty extends IInterface {
    public static final String DESCRIPTOR = "com.app.framework.core.IEmpty";

    /* loaded from: classes.dex */
    public static class Default implements IEmpty {
        @Override // android.os.IInterface
        public IBinder asBinder() {
            return null;
        }
    }

    /* loaded from: classes.dex */
    public static abstract class Stub extends Binder implements IEmpty {

        /* loaded from: classes.dex */
        public static class Proxy implements IEmpty {
            private IBinder mRemote;

            public Proxy(IBinder iBinder) {
                this.mRemote = iBinder;
            }

            @Override // android.os.IInterface
            public IBinder asBinder() {
                return this.mRemote;
            }

            public String getInterfaceDescriptor() {
                return IEmpty.DESCRIPTOR;
            }
        }

        public Stub() {
            attachInterface(this, IEmpty.DESCRIPTOR);
        }

        public static IEmpty asInterface(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface(IEmpty.DESCRIPTOR);
            return (queryLocalInterface == null || !(queryLocalInterface instanceof IEmpty)) ? new Proxy(iBinder) : (IEmpty) queryLocalInterface;
        }

        @Override // android.os.IInterface
        public IBinder asBinder() {
            return this;
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            if (i != 1598968902) {
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel2.writeString(IEmpty.DESCRIPTOR);
            return true;
        }
    }
}
