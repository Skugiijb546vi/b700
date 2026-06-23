package com.ninja.engine;

import android.os.Build;
import android.os.StrictMode;
import com.app.framework.utils.ShellUtils;
import java.io.BufferedWriter;
import java.io.Closeable;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintStream;
import java.io.Writer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
/* renamed from: com.ninja.engine.o0OOooo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0403o0OOooo implements Closeable {
    public BufferedWriter OooO;
    public final File OooO00o;
    public final File OooO0O0;
    public final File OooO0OO;
    public final File OooO0Oo;
    public final long OooO0o;
    public int OooOO0O;
    public long OooO0oo = 0;
    public final LinkedHashMap OooOO0 = new LinkedHashMap(0, 0.75f, true);
    public long OooOO0o = 0;
    public final ThreadPoolExecutor OooOOO0 = new ThreadPoolExecutor(0, 1, 60, TimeUnit.SECONDS, new LinkedBlockingQueue(), (ThreadFactory) new Object());
    public final CallableC0401o0OOooOO OooOOO = new CallableC0401o0OOooOO(this);
    public final int OooO0o0 = 1;
    public final int OooO0oO = 1;

    /* JADX WARN: Type inference failed for: r15v0, types: [java.lang.Object, java.util.concurrent.ThreadFactory] */
    public C0403o0OOooo(File file, long j) {
        this.OooO00o = file;
        this.OooO0O0 = new File(file, "journal");
        this.OooO0OO = new File(file, "journal.tmp");
        this.OooO0Oo = new File(file, "journal.bkp");
        this.OooO0o = j;
    }

    public static void OooO00o(C0403o0OOooo c0403o0OOooo, C0067o0000Ooo c0067o0000Ooo, boolean z) {
        synchronized (c0403o0OOooo) {
            C0404o0OOooo0 c0404o0OOooo0 = (C0404o0OOooo0) c0067o0000Ooo.OooO0O0;
            if (c0404o0OOooo0.OooO0o == c0067o0000Ooo) {
                if (z && !c0404o0OOooo0.OooO0o0) {
                    for (int i = 0; i < c0403o0OOooo.OooO0oO; i++) {
                        if (((boolean[]) c0067o0000Ooo.OooO0OO)[i]) {
                            if (!c0404o0OOooo0.OooO0Oo[i].exists()) {
                                c0067o0000Ooo.OooO0OO();
                                break;
                            }
                        } else {
                            c0067o0000Ooo.OooO0OO();
                            throw new IllegalStateException("Newly created entry didn't create value for index " + i);
                        }
                    }
                }
                for (int i2 = 0; i2 < c0403o0OOooo.OooO0oO; i2++) {
                    File file = c0404o0OOooo0.OooO0Oo[i2];
                    if (z) {
                        if (file.exists()) {
                            File file2 = c0404o0OOooo0.OooO0OO[i2];
                            file.renameTo(file2);
                            long j = c0404o0OOooo0.OooO0O0[i2];
                            long length = file2.length();
                            c0404o0OOooo0.OooO0O0[i2] = length;
                            c0403o0OOooo.OooO0oo = (c0403o0OOooo.OooO0oo - j) + length;
                        }
                    } else {
                        OooO0OO(file);
                    }
                }
                c0403o0OOooo.OooOO0O++;
                c0404o0OOooo0.OooO0o = null;
                if (c0404o0OOooo0.OooO0o0 | z) {
                    c0404o0OOooo0.OooO0o0 = true;
                    c0403o0OOooo.OooO.append((CharSequence) "CLEAN");
                    c0403o0OOooo.OooO.append(' ');
                    c0403o0OOooo.OooO.append((CharSequence) c0404o0OOooo0.OooO00o);
                    c0403o0OOooo.OooO.append((CharSequence) c0404o0OOooo0.OooO00o());
                    c0403o0OOooo.OooO.append('\n');
                    if (z) {
                        c0403o0OOooo.OooOO0o++;
                        c0404o0OOooo0.getClass();
                    }
                } else {
                    c0403o0OOooo.OooOO0.remove(c0404o0OOooo0.OooO00o);
                    c0403o0OOooo.OooO.append((CharSequence) "REMOVE");
                    c0403o0OOooo.OooO.append(' ');
                    c0403o0OOooo.OooO.append((CharSequence) c0404o0OOooo0.OooO00o);
                    c0403o0OOooo.OooO.append('\n');
                }
                OooO0o0(c0403o0OOooo.OooO);
                if (c0403o0OOooo.OooO0oo > c0403o0OOooo.OooO0o || c0403o0OOooo.OooO0oO()) {
                    c0403o0OOooo.OooOOO0.submit(c0403o0OOooo.OooOOO);
                }
            } else {
                throw new IllegalStateException();
            }
        }
    }

    public static void OooO0O0(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.close();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.close();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static void OooO0OO(File file) {
        if (file.exists() && !file.delete()) {
            throw new IOException();
        }
    }

    public static void OooO0o0(Writer writer) {
        StrictMode.ThreadPolicy.Builder permitUnbufferedIo;
        if (Build.VERSION.SDK_INT < 26) {
            writer.flush();
            return;
        }
        StrictMode.ThreadPolicy threadPolicy = StrictMode.getThreadPolicy();
        permitUnbufferedIo = new StrictMode.ThreadPolicy.Builder(threadPolicy).permitUnbufferedIo();
        StrictMode.setThreadPolicy(permitUnbufferedIo.build());
        try {
            writer.flush();
        } finally {
            StrictMode.setThreadPolicy(threadPolicy);
        }
    }

    public static C0403o0OOooo OooO0oo(File file, long j) {
        if (j > 0) {
            File file2 = new File(file, "journal.bkp");
            if (file2.exists()) {
                File file3 = new File(file, "journal");
                if (file3.exists()) {
                    file2.delete();
                } else {
                    OooOOO0(file2, file3, false);
                }
            }
            C0403o0OOooo c0403o0OOooo = new C0403o0OOooo(file, j);
            if (c0403o0OOooo.OooO0O0.exists()) {
                try {
                    c0403o0OOooo.OooOO0();
                    c0403o0OOooo.OooO();
                    return c0403o0OOooo;
                } catch (IOException e) {
                    PrintStream printStream = System.out;
                    printStream.println("DiskLruCache " + file + " is corrupt: " + e.getMessage() + ", removing");
                    c0403o0OOooo.close();
                    AbstractC1400oo00OOO.OooO00o(c0403o0OOooo.OooO00o);
                }
            }
            file.mkdirs();
            C0403o0OOooo c0403o0OOooo2 = new C0403o0OOooo(file, j);
            c0403o0OOooo2.OooOO0o();
            return c0403o0OOooo2;
        }
        throw new IllegalArgumentException("maxSize <= 0");
    }

    public static void OooOOO0(File file, File file2, boolean z) {
        if (z) {
            OooO0OO(file2);
        }
        if (file.renameTo(file2)) {
            return;
        }
        throw new IOException();
    }

    public final void OooO() {
        OooO0OO(this.OooO0OO);
        Iterator it = this.OooOO0.values().iterator();
        while (it.hasNext()) {
            C0404o0OOooo0 c0404o0OOooo0 = (C0404o0OOooo0) it.next();
            C0067o0000Ooo c0067o0000Ooo = c0404o0OOooo0.OooO0o;
            int i = this.OooO0oO;
            int i2 = 0;
            if (c0067o0000Ooo == null) {
                while (i2 < i) {
                    this.OooO0oo += c0404o0OOooo0.OooO0O0[i2];
                    i2++;
                }
            } else {
                c0404o0OOooo0.OooO0o = null;
                while (i2 < i) {
                    OooO0OO(c0404o0OOooo0.OooO0OO[i2]);
                    OooO0OO(c0404o0OOooo0.OooO0Oo[i2]);
                    i2++;
                }
                it.remove();
            }
        }
    }

    public final C0067o0000Ooo OooO0Oo(String str) {
        synchronized (this) {
            try {
                if (this.OooO != null) {
                    C0404o0OOooo0 c0404o0OOooo0 = (C0404o0OOooo0) this.OooOO0.get(str);
                    if (c0404o0OOooo0 == null) {
                        c0404o0OOooo0 = new C0404o0OOooo0(this, str);
                        this.OooOO0.put(str, c0404o0OOooo0);
                    } else if (c0404o0OOooo0.OooO0o != null) {
                        return null;
                    }
                    C0067o0000Ooo c0067o0000Ooo = new C0067o0000Ooo(this, c0404o0OOooo0);
                    c0404o0OOooo0.OooO0o = c0067o0000Ooo;
                    this.OooO.append((CharSequence) "DIRTY");
                    this.OooO.append(' ');
                    this.OooO.append((CharSequence) str);
                    this.OooO.append('\n');
                    OooO0o0(this.OooO);
                    return c0067o0000Ooo;
                }
                throw new IllegalStateException("cache is closed");
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    public final synchronized C0331o0O0oo OooO0o(String str) {
        if (this.OooO != null) {
            C0404o0OOooo0 c0404o0OOooo0 = (C0404o0OOooo0) this.OooOO0.get(str);
            if (c0404o0OOooo0 == null) {
                return null;
            }
            if (!c0404o0OOooo0.OooO0o0) {
                return null;
            }
            for (File file : c0404o0OOooo0.OooO0OO) {
                if (!file.exists()) {
                    return null;
                }
            }
            this.OooOO0O++;
            this.OooO.append((CharSequence) "READ");
            this.OooO.append(' ');
            this.OooO.append((CharSequence) str);
            this.OooO.append('\n');
            if (OooO0oO()) {
                this.OooOOO0.submit(this.OooOOO);
            }
            return new C0331o0O0oo(8, c0404o0OOooo0.OooO0OO);
        }
        throw new IllegalStateException("cache is closed");
    }

    public final boolean OooO0oO() {
        int i = this.OooOO0O;
        if (i >= 2000 && i >= this.OooOO0.size()) {
            return true;
        }
        return false;
    }

    public final void OooOO0() {
        File file = this.OooO0O0;
        C1260oOoo00OO c1260oOoo00OO = new C1260oOoo00OO(new FileInputStream(file), AbstractC1400oo00OOO.OooO00o);
        try {
            String OooO00o = c1260oOoo00OO.OooO00o();
            String OooO00o2 = c1260oOoo00OO.OooO00o();
            String OooO00o3 = c1260oOoo00OO.OooO00o();
            String OooO00o4 = c1260oOoo00OO.OooO00o();
            String OooO00o5 = c1260oOoo00OO.OooO00o();
            if ("libcore.io.DiskLruCache".equals(OooO00o) && "1".equals(OooO00o2) && Integer.toString(this.OooO0o0).equals(OooO00o3) && Integer.toString(this.OooO0oO).equals(OooO00o4) && "".equals(OooO00o5)) {
                int i = 0;
                while (true) {
                    try {
                        OooOO0O(c1260oOoo00OO.OooO00o());
                        i++;
                    } catch (EOFException unused) {
                        this.OooOO0O = i - this.OooOO0.size();
                        if (c1260oOoo00OO.OooO0o0 == -1) {
                            OooOO0o();
                        } else {
                            this.OooO = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(file, true), AbstractC1400oo00OOO.OooO00o));
                        }
                        try {
                            c1260oOoo00OO.close();
                            return;
                        } catch (RuntimeException e) {
                            throw e;
                        } catch (Exception unused2) {
                            return;
                        }
                    }
                }
            } else {
                throw new IOException("unexpected journal header: [" + OooO00o + ", " + OooO00o2 + ", " + OooO00o4 + ", " + OooO00o5 + "]");
            }
        } catch (Throwable th) {
            try {
                c1260oOoo00OO.close();
            } catch (RuntimeException e2) {
                throw e2;
            } catch (Exception unused3) {
            }
            throw th;
        }
    }

    public final void OooOO0O(String str) {
        String substring;
        int indexOf = str.indexOf(32);
        if (indexOf != -1) {
            int i = indexOf + 1;
            int indexOf2 = str.indexOf(32, i);
            LinkedHashMap linkedHashMap = this.OooOO0;
            if (indexOf2 == -1) {
                substring = str.substring(i);
                if (indexOf == 6 && str.startsWith("REMOVE")) {
                    linkedHashMap.remove(substring);
                    return;
                }
            } else {
                substring = str.substring(i, indexOf2);
            }
            C0404o0OOooo0 c0404o0OOooo0 = (C0404o0OOooo0) linkedHashMap.get(substring);
            if (c0404o0OOooo0 == null) {
                c0404o0OOooo0 = new C0404o0OOooo0(this, substring);
                linkedHashMap.put(substring, c0404o0OOooo0);
            }
            if (indexOf2 != -1 && indexOf == 5 && str.startsWith("CLEAN")) {
                String[] split = str.substring(indexOf2 + 1).split(" ");
                c0404o0OOooo0.OooO0o0 = true;
                c0404o0OOooo0.OooO0o = null;
                if (split.length == c0404o0OOooo0.OooO0oO.OooO0oO) {
                    for (int i2 = 0; i2 < split.length; i2++) {
                        try {
                            c0404o0OOooo0.OooO0O0[i2] = Long.parseLong(split[i2]);
                        } catch (NumberFormatException unused) {
                            throw new IOException("unexpected journal line: " + Arrays.toString(split));
                        }
                    }
                    return;
                }
                throw new IOException("unexpected journal line: " + Arrays.toString(split));
            } else if (indexOf2 == -1 && indexOf == 5 && str.startsWith("DIRTY")) {
                c0404o0OOooo0.OooO0o = new C0067o0000Ooo(this, c0404o0OOooo0);
                return;
            } else if (indexOf2 == -1 && indexOf == 4 && str.startsWith("READ")) {
                return;
            } else {
                throw new IOException("unexpected journal line: ".concat(str));
            }
        }
        throw new IOException("unexpected journal line: ".concat(str));
    }

    public final synchronized void OooOO0o() {
        String str;
        try {
            BufferedWriter bufferedWriter = this.OooO;
            if (bufferedWriter != null) {
                OooO0O0(bufferedWriter);
            }
            BufferedWriter bufferedWriter2 = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.OooO0OO), AbstractC1400oo00OOO.OooO00o));
            bufferedWriter2.write("libcore.io.DiskLruCache");
            bufferedWriter2.write(ShellUtils.COMMAND_LINE_END);
            bufferedWriter2.write("1");
            bufferedWriter2.write(ShellUtils.COMMAND_LINE_END);
            bufferedWriter2.write(Integer.toString(this.OooO0o0));
            bufferedWriter2.write(ShellUtils.COMMAND_LINE_END);
            bufferedWriter2.write(Integer.toString(this.OooO0oO));
            bufferedWriter2.write(ShellUtils.COMMAND_LINE_END);
            bufferedWriter2.write(ShellUtils.COMMAND_LINE_END);
            for (C0404o0OOooo0 c0404o0OOooo0 : this.OooOO0.values()) {
                if (c0404o0OOooo0.OooO0o != null) {
                    str = "DIRTY " + c0404o0OOooo0.OooO00o + '\n';
                } else {
                    str = "CLEAN " + c0404o0OOooo0.OooO00o + c0404o0OOooo0.OooO00o() + '\n';
                }
                bufferedWriter2.write(str);
            }
            OooO0O0(bufferedWriter2);
            if (this.OooO0O0.exists()) {
                OooOOO0(this.OooO0O0, this.OooO0Oo, true);
            }
            OooOOO0(this.OooO0OO, this.OooO0O0, false);
            this.OooO0Oo.delete();
            this.OooO = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(this.OooO0O0, true), AbstractC1400oo00OOO.OooO00o));
        } catch (Throwable th) {
            throw th;
        }
    }

    public final void OooOOO() {
        while (this.OooO0oo > this.OooO0o) {
            String str = (String) ((Map.Entry) this.OooOO0.entrySet().iterator().next()).getKey();
            synchronized (this) {
                try {
                    if (this.OooO != null) {
                        C0404o0OOooo0 c0404o0OOooo0 = (C0404o0OOooo0) this.OooOO0.get(str);
                        if (c0404o0OOooo0 != null && c0404o0OOooo0.OooO0o == null) {
                            for (int i = 0; i < this.OooO0oO; i++) {
                                File file = c0404o0OOooo0.OooO0OO[i];
                                if (file.exists() && !file.delete()) {
                                    throw new IOException("failed to delete " + file);
                                }
                                long j = this.OooO0oo;
                                long[] jArr = c0404o0OOooo0.OooO0O0;
                                this.OooO0oo = j - jArr[i];
                                jArr[i] = 0;
                            }
                            this.OooOO0O++;
                            this.OooO.append((CharSequence) "REMOVE");
                            this.OooO.append(' ');
                            this.OooO.append((CharSequence) str);
                            this.OooO.append('\n');
                            this.OooOO0.remove(str);
                            if (OooO0oO()) {
                                this.OooOOO0.submit(this.OooOOO);
                            }
                        }
                    } else {
                        throw new IllegalStateException("cache is closed");
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() {
        try {
            if (this.OooO == null) {
                return;
            }
            Iterator it = new ArrayList(this.OooOO0.values()).iterator();
            while (it.hasNext()) {
                C0067o0000Ooo c0067o0000Ooo = ((C0404o0OOooo0) it.next()).OooO0o;
                if (c0067o0000Ooo != null) {
                    c0067o0000Ooo.OooO0OO();
                }
            }
            OooOOO();
            OooO0O0(this.OooO);
            this.OooO = null;
        } catch (Throwable th) {
            throw th;
        }
    }
}


