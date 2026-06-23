package com.ninja.engine;

import java.util.Collection;
import java.util.Iterator;
import java.util.NoSuchElementException;
/* renamed from: com.ninja.engine.oOoo0O0O */
/* loaded from: classes.dex */
public abstract class AbstractC1268oOoo0O0O extends AbstractC1266oOoo0O0 {
    public static final int OooOoOO(int i, CharSequence charSequence, String str, boolean z) {
        char upperCase;
        char upperCase2;
        if (!z && (charSequence instanceof String)) {
            return ((String) charSequence).indexOf(str, i);
        }
        int length = charSequence.length();
        if (i < 0) {
            i = 0;
        }
        int length2 = charSequence.length();
        if (length > length2) {
            length = length2;
        }
        AbstractC0784oO0OOoOo abstractC0784oO0OOoOo = new AbstractC0784oO0OOoOo(i, length, 1);
        boolean z2 = charSequence instanceof String;
        int i2 = abstractC0784oO0OOoOo.OooO0O0;
        if (z2) {
            if (i <= i2) {
                while (!OooOooO(0, i, str.length(), str, (String) charSequence, z)) {
                    if (i != i2) {
                        i++;
                    }
                }
                return i;
            }
        } else if (i <= i2) {
            while (true) {
                int length3 = str.length();
                if (i >= 0 && str.length() - length3 >= 0 && i <= charSequence.length() - length3) {
                    for (int i3 = 0; i3 < length3; i3++) {
                        char charAt = str.charAt(i3);
                        char charAt2 = charSequence.charAt(i + i3);
                        if (charAt == charAt2 || (z && ((upperCase = Character.toUpperCase(charAt)) == (upperCase2 = Character.toUpperCase(charAt2)) || Character.toLowerCase(upperCase) == Character.toLowerCase(upperCase2)))) {
                        }
                    }
                    return i;
                }
                if (i == i2) {
                    break;
                }
                i++;
            }
        }
        return -1;
    }

    public static boolean OooOoo(String str) {
        if (str.length() == 0) {
            return true;
        }
        AbstractC0784oO0OOoOo abstractC0784oO0OOoOo = new AbstractC0784oO0OOoOo(0, str.length() - 1, 1);
        if ((abstractC0784oO0OOoOo instanceof Collection) && ((Collection) abstractC0784oO0OOoOo).isEmpty()) {
            return true;
        }
        Iterator it = abstractC0784oO0OOoOo.iterator();
        while (((oO00o000) it).OooO0OO) {
            oO00o000 oo00o000 = (oO00o000) it;
            int i = oo00o000.OooO0Oo;
            if (i == oo00o000.OooO0O0) {
                if (oo00o000.OooO0OO) {
                    oo00o000.OooO0OO = false;
                } else {
                    throw new NoSuchElementException();
                }
            } else {
                oo00o000.OooO0Oo = oo00o000.OooO00o + i;
            }
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                return false;
            }
        }
        return true;
    }

    public static /* synthetic */ int OooOoo0(int i, CharSequence charSequence, String str, boolean z) {
        if ((i & 4) != 0) {
            z = false;
        }
        return OooOoOO(0, charSequence, str, z);
    }

    public static final boolean OooOooO(int i, int i2, int i3, String str, String str2, boolean z) {
        AbstractC0809oO0OooOO.OooOOOo(str, "<this>");
        if (!z) {
            return str.regionMatches(i, str2, i2, i3);
        }
        return str.regionMatches(z, i, str2, i2, i3);
    }

    public static String OooOooo(String str) {
        AbstractC0809oO0OooOO.OooOOOo(str, "<this>");
        AbstractC0809oO0OooOO.OooOOOo(str, "missingDelimiterValue");
        int lastIndexOf = str.lastIndexOf(46, str.length() - 1);
        if (lastIndexOf != -1) {
            String substring = str.substring(lastIndexOf + 1, str.length());
            AbstractC0809oO0OooOO.OooOOOO(substring, "substring(...)");
            return substring;
        }
        return str;
    }

    public static CharSequence Oooo000(String str) {
        int i;
        boolean z;
        AbstractC0809oO0OooOO.OooOOOo(str, "<this>");
        int length = str.length() - 1;
        int i2 = 0;
        boolean z2 = false;
        while (i2 <= length) {
            if (!z2) {
                i = i2;
            } else {
                i = length;
            }
            char charAt = str.charAt(i);
            if (!Character.isWhitespace(charAt) && !Character.isSpaceChar(charAt)) {
                z = false;
            } else {
                z = true;
            }
            if (!z2) {
                if (!z) {
                    z2 = true;
                } else {
                    i2++;
                }
            } else if (!z) {
                break;
            } else {
                length--;
            }
        }
        return str.subSequence(i2, length + 1);
    }
}
