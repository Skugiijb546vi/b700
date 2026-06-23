package com.ninja.engine;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.Objects;
/* loaded from: classes.dex */
public final class oOOOOoO0 {
    public final int OooO00o;
    public final int OooO0O0;
    public final long OooO0OO;
    public final long OooO0Oo;

    public oOOOOoO0(int i, int i2, long j, long j2) {
        this.OooO00o = i;
        this.OooO0O0 = i2;
        this.OooO0OO = j;
        this.OooO0Oo = j2;
    }

    public static oOOOOoO0 OooO00o(File file) {
        DataInputStream dataInputStream = new DataInputStream(new FileInputStream(file));
        try {
            oOOOOoO0 ooooooo0 = new oOOOOoO0(dataInputStream.readInt(), dataInputStream.readInt(), dataInputStream.readLong(), dataInputStream.readLong());
            dataInputStream.close();
            return ooooooo0;
        } catch (Throwable th) {
            try {
                dataInputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final void OooO0O0(File file) {
        file.delete();
        DataOutputStream dataOutputStream = new DataOutputStream(new FileOutputStream(file));
        try {
            dataOutputStream.writeInt(this.OooO00o);
            dataOutputStream.writeInt(this.OooO0O0);
            dataOutputStream.writeLong(this.OooO0OO);
            dataOutputStream.writeLong(this.OooO0Oo);
            dataOutputStream.close();
        } catch (Throwable th) {
            try {
                dataOutputStream.close();
            } catch (Throwable th2) {
                th.addSuppressed(th2);
            }
            throw th;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof oOOOOoO0)) {
            return false;
        }
        oOOOOoO0 ooooooo0 = (oOOOOoO0) obj;
        if (this.OooO0O0 == ooooooo0.OooO0O0 && this.OooO0OO == ooooooo0.OooO0OO && this.OooO00o == ooooooo0.OooO00o && this.OooO0Oo == ooooooo0.OooO0Oo) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Integer.valueOf(this.OooO0O0), Long.valueOf(this.OooO0OO), Integer.valueOf(this.OooO00o), Long.valueOf(this.OooO0Oo));
    }
}


