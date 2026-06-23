package androidx.core.graphics.drawable;

import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.PorterDuff;
import android.os.Build;
import android.os.Parcelable;
import androidx.versionedparcelable.CustomVersionedParcelable;
import com.ninja.engine.AbstractC0408o0Oo00o;
import java.lang.reflect.InvocationTargetException;
/* loaded from: classes.dex */
public class IconCompat extends CustomVersionedParcelable {
    public static final PorterDuff.Mode OooOO0O = PorterDuff.Mode.SRC_IN;
    public Object OooO0O0;
    public String OooOO0;
    public int OooO00o = -1;
    public byte[] OooO0OO = null;
    public Parcelable OooO0Oo = null;
    public int OooO0o0 = 0;
    public int OooO0o = 0;
    public ColorStateList OooO0oO = null;
    public PorterDuff.Mode OooO0oo = OooOO0O;
    public String OooO = null;

    public final String toString() {
        String str;
        int height;
        int i;
        int i2;
        if (this.OooO00o == -1) {
            return String.valueOf(this.OooO0O0);
        }
        StringBuilder sb = new StringBuilder("Icon(typ=");
        switch (this.OooO00o) {
            case 1:
                str = "BITMAP";
                break;
            case 2:
                str = "RESOURCE";
                break;
            case 3:
                str = "DATA";
                break;
            case 4:
                str = "URI";
                break;
            case 5:
                str = "BITMAP_MASKABLE";
                break;
            case 6:
                str = "URI_MASKABLE";
                break;
            default:
                str = "UNKNOWN";
                break;
        }
        sb.append(str);
        switch (this.OooO00o) {
            case 1:
            case 5:
                sb.append(" size=");
                sb.append(((Bitmap) this.OooO0O0).getWidth());
                sb.append("x");
                height = ((Bitmap) this.OooO0O0).getHeight();
                sb.append(height);
                break;
            case 2:
                sb.append(" pkg=");
                sb.append(this.OooOO0);
                sb.append(" id=");
                int i3 = this.OooO00o;
                if (i3 == -1 && (i2 = Build.VERSION.SDK_INT) >= 23) {
                    Object obj = this.OooO0O0;
                    if (i2 >= 28) {
                        i = AbstractC0408o0Oo00o.OooO0O0(obj);
                    } else {
                        try {
                            i = ((Integer) obj.getClass().getMethod("getResId", null).invoke(obj, null)).intValue();
                        } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
                            i = 0;
                        }
                    }
                } else if (i3 == 2) {
                    i = this.OooO0o0;
                } else {
                    throw new IllegalStateException("called getResId() on " + this);
                }
                sb.append(String.format("0x%08x", Integer.valueOf(i)));
                break;
            case 3:
                sb.append(" len=");
                sb.append(this.OooO0o0);
                if (this.OooO0o != 0) {
                    sb.append(" off=");
                    height = this.OooO0o;
                    sb.append(height);
                    break;
                }
                break;
            case 4:
            case 6:
                sb.append(" uri=");
                sb.append(this.OooO0O0);
                break;
        }
        if (this.OooO0oO != null) {
            sb.append(" tint=");
            sb.append(this.OooO0oO);
        }
        if (this.OooO0oo != OooOO0O) {
            sb.append(" mode=");
            sb.append(this.OooO0oo);
        }
        sb.append(")");
        return sb.toString();
    }
}
