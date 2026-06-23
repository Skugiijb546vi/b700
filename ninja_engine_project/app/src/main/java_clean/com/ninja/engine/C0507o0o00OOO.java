package com.ninja.engine;

import com.app.framework.core.system.JarConfig;
import java.io.ByteArrayInputStream;
import java.io.DataInput;
import java.io.DataInputStream;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteOrder;
/* renamed from: com.ninja.engine.o0o00OOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0507o0o00OOO extends InputStream implements DataInput {
    public final DataInputStream OooO00o;
    public ByteOrder OooO0O0;
    public int OooO0OO;
    public byte[] OooO0Oo;
    public static final ByteOrder OooO0o0 = ByteOrder.LITTLE_ENDIAN;
    public static final ByteOrder OooO0o = ByteOrder.BIG_ENDIAN;

    public C0507o0o00OOO(InputStream inputStream) {
        this(inputStream, ByteOrder.BIG_ENDIAN);
    }

    public final void OooO00o(int i) {
        int i2 = 0;
        while (i2 < i) {
            DataInputStream dataInputStream = this.OooO00o;
            int i3 = i - i2;
            int skip = (int) dataInputStream.skip(i3);
            if (skip <= 0) {
                if (this.OooO0Oo == null) {
                    this.OooO0Oo = new byte[JarConfig.DEFAULT_BUFFER_SIZE];
                }
                skip = dataInputStream.read(this.OooO0Oo, 0, Math.min((int) JarConfig.DEFAULT_BUFFER_SIZE, i3));
                if (skip == -1) {
                    throw new EOFException("Reached EOF while skipping " + i + " bytes.");
                }
            }
            i2 += skip;
        }
        this.OooO0OO += i2;
    }

    @Override // java.io.InputStream
    public final int available() {
        return this.OooO00o.available();
    }

    @Override // java.io.InputStream
    public final void mark(int i) {
        throw new UnsupportedOperationException("Mark is currently unsupported");
    }

    @Override // java.io.InputStream
    public final int read() {
        this.OooO0OO++;
        return this.OooO00o.read();
    }

    @Override // java.io.DataInput
    public final boolean readBoolean() {
        this.OooO0OO++;
        return this.OooO00o.readBoolean();
    }

    @Override // java.io.DataInput
    public final byte readByte() {
        this.OooO0OO++;
        int read = this.OooO00o.read();
        if (read >= 0) {
            return (byte) read;
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final char readChar() {
        this.OooO0OO += 2;
        return this.OooO00o.readChar();
    }

    @Override // java.io.DataInput
    public final double readDouble() {
        return Double.longBitsToDouble(readLong());
    }

    @Override // java.io.DataInput
    public final float readFloat() {
        return Float.intBitsToFloat(readInt());
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr) {
        this.OooO0OO += bArr.length;
        this.OooO00o.readFully(bArr);
    }

    @Override // java.io.DataInput
    public final int readInt() {
        this.OooO0OO += 4;
        DataInputStream dataInputStream = this.OooO00o;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        if ((read | read2 | read3 | read4) >= 0) {
            ByteOrder byteOrder = this.OooO0O0;
            if (byteOrder == OooO0o0) {
                return (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == OooO0o) {
                return (read << 24) + (read2 << 16) + (read3 << 8) + read4;
            }
            throw new IOException("Invalid byte order: " + this.OooO0O0);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readLine() {
        return null;
    }

    @Override // java.io.DataInput
    public final long readLong() {
        this.OooO0OO += 8;
        DataInputStream dataInputStream = this.OooO00o;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        int read3 = dataInputStream.read();
        int read4 = dataInputStream.read();
        int read5 = dataInputStream.read();
        int read6 = dataInputStream.read();
        int read7 = dataInputStream.read();
        int read8 = dataInputStream.read();
        if ((read | read2 | read3 | read4 | read5 | read6 | read7 | read8) >= 0) {
            ByteOrder byteOrder = this.OooO0O0;
            if (byteOrder == OooO0o0) {
                return (read8 << 56) + (read7 << 48) + (read6 << 40) + (read5 << 32) + (read4 << 24) + (read3 << 16) + (read2 << 8) + read;
            }
            if (byteOrder == OooO0o) {
                return (read << 56) + (read2 << 48) + (read3 << 40) + (read4 << 32) + (read5 << 24) + (read6 << 16) + (read7 << 8) + read8;
            }
            throw new IOException("Invalid byte order: " + this.OooO0O0);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final short readShort() {
        this.OooO0OO += 2;
        DataInputStream dataInputStream = this.OooO00o;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.OooO0O0;
            if (byteOrder == OooO0o0) {
                return (short) ((read2 << 8) + read);
            }
            if (byteOrder == OooO0o) {
                return (short) ((read << 8) + read2);
            }
            throw new IOException("Invalid byte order: " + this.OooO0O0);
        }
        throw new EOFException();
    }

    @Override // java.io.DataInput
    public final String readUTF() {
        this.OooO0OO += 2;
        return this.OooO00o.readUTF();
    }

    @Override // java.io.DataInput
    public final int readUnsignedByte() {
        this.OooO0OO++;
        return this.OooO00o.readUnsignedByte();
    }

    @Override // java.io.DataInput
    public final int readUnsignedShort() {
        this.OooO0OO += 2;
        DataInputStream dataInputStream = this.OooO00o;
        int read = dataInputStream.read();
        int read2 = dataInputStream.read();
        if ((read | read2) >= 0) {
            ByteOrder byteOrder = this.OooO0O0;
            if (byteOrder == OooO0o0) {
                return (read2 << 8) + read;
            }
            if (byteOrder == OooO0o) {
                return (read << 8) + read2;
            }
            throw new IOException("Invalid byte order: " + this.OooO0O0);
        }
        throw new EOFException();
    }

    @Override // java.io.InputStream
    public final void reset() {
        throw new UnsupportedOperationException("Reset is currently unsupported");
    }

    @Override // java.io.DataInput
    public final int skipBytes(int i) {
        throw new UnsupportedOperationException("skipBytes is currently unsupported");
    }

    public C0507o0o00OOO(InputStream inputStream, ByteOrder byteOrder) {
        this.OooO0O0 = ByteOrder.BIG_ENDIAN;
        DataInputStream dataInputStream = new DataInputStream(inputStream);
        this.OooO00o = dataInputStream;
        dataInputStream.mark(0);
        this.OooO0OO = 0;
        this.OooO0O0 = byteOrder;
    }

    @Override // java.io.InputStream
    public final int read(byte[] bArr, int i, int i2) {
        int read = this.OooO00o.read(bArr, i, i2);
        this.OooO0OO += read;
        return read;
    }

    @Override // java.io.DataInput
    public final void readFully(byte[] bArr, int i, int i2) {
        this.OooO0OO += i2;
        this.OooO00o.readFully(bArr, i, i2);
    }

    public C0507o0o00OOO(byte[] bArr) {
        this(new ByteArrayInputStream(bArr), ByteOrder.BIG_ENDIAN);
    }
}


