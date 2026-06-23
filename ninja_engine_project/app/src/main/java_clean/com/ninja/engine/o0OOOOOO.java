package com.ninja.engine;

import android.util.Log;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;
/* loaded from: classes.dex */
public final class o0OOOOOO implements oO00Oo00 {
    public static final byte[] OooO00o = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    public static final int[] OooO0O0 = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    public static ImageHeaderParser$ImageType OooO0o(o0OOOOO o0ooooo) {
        boolean z;
        try {
            int OooOO0o = o0ooooo.OooOO0o();
            if (OooOO0o == 65496) {
                return ImageHeaderParser$ImageType.JPEG;
            }
            int OooO0oo = (OooOO0o << 8) | o0ooooo.OooO0oo();
            if (OooO0oo == 4671814) {
                return ImageHeaderParser$ImageType.GIF;
            }
            int OooO0oo2 = (OooO0oo << 8) | o0ooooo.OooO0oo();
            if (OooO0oo2 == -1991225785) {
                o0ooooo.OooO0o0(21L);
                try {
                    if (o0ooooo.OooO0oo() >= 3) {
                        return ImageHeaderParser$ImageType.PNG_A;
                    }
                    return ImageHeaderParser$ImageType.PNG;
                } catch (o0OOOOO0 unused) {
                    return ImageHeaderParser$ImageType.PNG;
                }
            } else if (OooO0oo2 != 1380533830) {
                if (((o0ooooo.OooOO0o() << 16) | o0ooooo.OooOO0o()) == 1718909296) {
                    int OooOO0o2 = (o0ooooo.OooOO0o() << 16) | o0ooooo.OooOO0o();
                    if (OooOO0o2 != 1635150195) {
                        int i = 0;
                        if (OooOO0o2 == 1635150182) {
                            z = true;
                        } else {
                            z = false;
                        }
                        o0ooooo.OooO0o0(4L);
                        int i2 = OooO0oo2 - 16;
                        if (i2 % 4 == 0) {
                            while (i < 5 && i2 > 0) {
                                int OooOO0o3 = (o0ooooo.OooOO0o() << 16) | o0ooooo.OooOO0o();
                                if (OooOO0o3 != 1635150195) {
                                    if (OooOO0o3 == 1635150182) {
                                        z = true;
                                    }
                                    i++;
                                    i2 -= 4;
                                }
                            }
                        }
                        if (z) {
                            return ImageHeaderParser$ImageType.AVIF;
                        }
                    }
                    return ImageHeaderParser$ImageType.ANIMATED_AVIF;
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
            } else {
                o0ooooo.OooO0o0(4L);
                if (((o0ooooo.OooOO0o() << 16) | o0ooooo.OooOO0o()) != 1464156752) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int OooOO0o4 = (o0ooooo.OooOO0o() << 16) | o0ooooo.OooOO0o();
                if ((OooOO0o4 & (-256)) != 1448097792) {
                    return ImageHeaderParser$ImageType.UNKNOWN;
                }
                int i3 = OooOO0o4 & 255;
                if (i3 == 88) {
                    o0ooooo.OooO0o0(4L);
                    short OooO0oo3 = o0ooooo.OooO0oo();
                    if ((OooO0oo3 & 2) != 0) {
                        return ImageHeaderParser$ImageType.ANIMATED_WEBP;
                    }
                    if ((OooO0oo3 & 16) != 0) {
                        return ImageHeaderParser$ImageType.WEBP_A;
                    }
                    return ImageHeaderParser$ImageType.WEBP;
                } else if (i3 == 76) {
                    o0ooooo.OooO0o0(4L);
                    if ((o0ooooo.OooO0oo() & 8) != 0) {
                        return ImageHeaderParser$ImageType.WEBP_A;
                    }
                    return ImageHeaderParser$ImageType.WEBP;
                } else {
                    return ImageHeaderParser$ImageType.WEBP;
                }
            }
        } catch (o0OOOOO0 unused2) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public static int OooO0o0(o0OOOOO o0ooooo, C0836oO0o0oO0 c0836oO0o0oO0) {
        int i;
        try {
            int OooOO0o = o0ooooo.OooOO0o();
            if ((OooOO0o & 65496) != 65496 && OooOO0o != 19789 && OooOO0o != 18761) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            while (o0ooooo.OooO0oo() == 255) {
                short OooO0oo = o0ooooo.OooO0oo();
                if (OooO0oo == 218) {
                    break;
                } else if (OooO0oo != 217) {
                    i = o0ooooo.OooOO0o() - 2;
                    if (OooO0oo == 225) {
                        break;
                    }
                    long j = i;
                    if (o0ooooo.OooO0o0(j) != j) {
                        break;
                    }
                } else {
                    break;
                }
            }
            Log.isLoggable("DfltImageHeaderParser", 3);
            i = -1;
            if (i == -1) {
                Log.isLoggable("DfltImageHeaderParser", 3);
                return -1;
            }
            byte[] bArr = (byte[]) c0836oO0o0oO0.OooO0Oo(i, byte[].class);
            int OooO0oO = OooO0oO(o0ooooo, bArr, i);
            c0836oO0o0oO0.OooO0oo(bArr);
            return OooO0oO;
        } catch (o0OOOOO0 unused) {
            return -1;
        }
    }

    public static int OooO0oO(o0OOOOO o0ooooo, byte[] bArr, int i) {
        boolean z;
        ByteOrder byteOrder;
        int i2;
        int i3;
        int i4;
        if (o0ooooo.OooO0oO(bArr, i) != i) {
            Log.isLoggable("DfltImageHeaderParser", 3);
            return -1;
        }
        byte[] bArr2 = OooO00o;
        if (bArr != null && i > bArr2.length) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            int i5 = 0;
            while (true) {
                if (i5 >= bArr2.length) {
                    break;
                } else if (bArr[i5] != bArr2[i5]) {
                    z = false;
                    break;
                } else {
                    i5++;
                }
            }
        }
        if (z) {
            o0OOOO o0oooo = new o0OOOO(bArr, i);
            short OooO0O02 = o0oooo.OooO0O0(6);
            if (OooO0O02 != 18761) {
                if (OooO0O02 != 19789) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                }
                byteOrder = ByteOrder.BIG_ENDIAN;
            } else {
                byteOrder = ByteOrder.LITTLE_ENDIAN;
            }
            ByteBuffer byteBuffer = o0oooo.OooO00o;
            byteBuffer.order(byteOrder);
            if (byteBuffer.remaining() - 10 >= 4) {
                i2 = byteBuffer.getInt(10);
            } else {
                i2 = -1;
            }
            short OooO0O03 = o0oooo.OooO0O0(i2 + 6);
            for (int i6 = 0; i6 < OooO0O03; i6++) {
                int i7 = (i6 * 12) + i2 + 8;
                if (o0oooo.OooO0O0(i7) == 274) {
                    short OooO0O04 = o0oooo.OooO0O0(i7 + 2);
                    if (OooO0O04 >= 1 && OooO0O04 <= 12) {
                        int i8 = i7 + 4;
                        if (byteBuffer.remaining() - i8 >= 4) {
                            i3 = byteBuffer.getInt(i8);
                        } else {
                            i3 = -1;
                        }
                        if (i3 >= 0) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                            int i9 = i3 + OooO0O0[OooO0O04];
                            if (i9 <= 4 && (i4 = i7 + 8) >= 0 && i4 <= byteBuffer.remaining() && i9 >= 0 && i9 + i4 <= byteBuffer.remaining()) {
                                return o0oooo.OooO0O0(i4);
                            }
                        }
                    }
                    Log.isLoggable("DfltImageHeaderParser", 3);
                }
            }
            return -1;
        }
        Log.isLoggable("DfltImageHeaderParser", 3);
        return -1;
    }

    @Override // com.ninja.engine.oO00Oo00
    public final ImageHeaderParser$ImageType OooO00o(ByteBuffer byteBuffer) {
        AbstractC0694o0ooooo0.OooOO0O(byteBuffer, "Argument must not be null");
        return OooO0o(new C0247o00oOooO(byteBuffer, 1));
    }

    @Override // com.ninja.engine.oO00Oo00
    public final int OooO0O0(ByteBuffer byteBuffer, C0836oO0o0oO0 c0836oO0o0oO0) {
        AbstractC0694o0ooooo0.OooOO0O(byteBuffer, "Argument must not be null");
        C0247o00oOooO c0247o00oOooO = new C0247o00oOooO(byteBuffer, 1);
        AbstractC0694o0ooooo0.OooOO0O(c0836oO0o0oO0, "Argument must not be null");
        return OooO0o0(c0247o00oOooO, c0836oO0o0oO0);
    }

    @Override // com.ninja.engine.oO00Oo00
    public final int OooO0OO(InputStream inputStream, C0836oO0o0oO0 c0836oO0o0oO0) {
        AbstractC0694o0ooooo0.OooOO0O(inputStream, "Argument must not be null");
        C0331o0O0oo c0331o0O0oo = new C0331o0O0oo(7, inputStream);
        AbstractC0694o0ooooo0.OooOO0O(c0836oO0o0oO0, "Argument must not be null");
        return OooO0o0(c0331o0O0oo, c0836oO0o0oO0);
    }

    @Override // com.ninja.engine.oO00Oo00
    public final ImageHeaderParser$ImageType OooO0Oo(InputStream inputStream) {
        AbstractC0694o0ooooo0.OooOO0O(inputStream, "Argument must not be null");
        return OooO0o(new C0331o0O0oo(7, inputStream));
    }
}


