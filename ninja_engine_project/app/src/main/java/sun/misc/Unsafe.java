package sun.misc;

import java.lang.reflect.Field;

public final class Unsafe {
    public long objectFieldOffset(Field f) { return 0; }
    public long getLong(Object o, long offset) { return 0; }
    public void putLong(Object o, long offset, long x) {}
    public int getInt(long address) { return 0; }
}
