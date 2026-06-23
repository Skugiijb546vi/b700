package com.ninja.engine;
/* loaded from: classes.dex */
public final class o0000O {
    public int OooO00o;
    public int OooO0O0;
    public Object OooO0OO;
    public int OooO0Oo;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || o0000O.class != obj.getClass()) {
            return false;
        }
        o0000O o0000o = (o0000O) obj;
        int i = this.OooO00o;
        if (i != o0000o.OooO00o) {
            return false;
        }
        if (i == 8 && Math.abs(this.OooO0Oo - this.OooO0O0) == 1 && this.OooO0Oo == o0000o.OooO0O0 && this.OooO0O0 == o0000o.OooO0Oo) {
            return true;
        }
        if (this.OooO0Oo != o0000o.OooO0Oo || this.OooO0O0 != o0000o.OooO0O0) {
            return false;
        }
        Object obj2 = this.OooO0OO;
        Object obj3 = o0000o.OooO0OO;
        if (obj2 != null) {
            if (!obj2.equals(obj3)) {
                return false;
            }
        } else if (obj3 != null) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return (((this.OooO00o * 31) + this.OooO0O0) * 31) + this.OooO0Oo;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        int i = this.OooO00o;
        if (i != 1) {
            if (i != 2) {
                if (i != 4) {
                    if (i != 8) {
                        str = "??";
                    } else {
                        str = "mv";
                    }
                } else {
                    str = "up";
                }
            } else {
                str = "rm";
            }
        } else {
            str = "add";
        }
        sb.append(str);
        sb.append(",s:");
        sb.append(this.OooO0O0);
        sb.append("c:");
        sb.append(this.OooO0Oo);
        sb.append(",p:");
        sb.append(this.OooO0OO);
        sb.append("]");
        return sb.toString();
    }
}
