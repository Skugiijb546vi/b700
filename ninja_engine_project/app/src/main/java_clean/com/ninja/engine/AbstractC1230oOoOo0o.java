package com.ninja.engine;

import android.os.Parcelable;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import java.util.Objects;
/* renamed from: com.ninja.engine.oOoOo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1230oOoOo0o {
    public static String OooO(StringBuilder sb, String str, String str2) {
        sb.append(str);
        sb.append(str2);
        return sb.toString();
    }

    public static final void OooO00o(View view, int i) {
        int i2;
        int OooOOOo = OooOOOo(i);
        if (OooOOOo != 0) {
            if (OooOOOo != 1) {
                if (OooOOOo != 2) {
                    if (OooOOOo == 3) {
                        if (Log.isLoggable("FragmentManager", 2)) {
                            Objects.toString(view);
                        }
                        i2 = 4;
                    } else {
                        return;
                    }
                } else {
                    if (Log.isLoggable("FragmentManager", 2)) {
                        Objects.toString(view);
                    }
                    i2 = 8;
                }
            } else {
                if (Log.isLoggable("FragmentManager", 2)) {
                    Objects.toString(view);
                }
                i2 = 0;
            }
            view.setVisibility(i2);
            return;
        }
        ViewGroup viewGroup = (ViewGroup) view.getParent();
        if (viewGroup != null) {
            if (Log.isLoggable("FragmentManager", 2)) {
                view.toString();
                viewGroup.toString();
            }
            viewGroup.removeView(view);
        }
    }

    public static int OooO0O0(int i) {
        if (i != 0) {
            if (i == 4) {
                return 4;
            }
            if (i == 8) {
                return 3;
            }
            throw new IllegalArgumentException(OooO0o(i, "Unknown visibility "));
        }
        return 2;
    }

    public static int OooO0OO(View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return OooO0O0(view.getVisibility());
    }

    public static /* synthetic */ boolean OooO0Oo(int i) {
        if (i == 1 || i == 2 || i == 3) {
            return false;
        }
        if (i == 4 || i == 5) {
            return true;
        }
        throw null;
    }

    public static String OooO0o(int i, String str) {
        return str + i;
    }

    public static /* synthetic */ long OooO0o0(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        if (i == 5) {
                            return 4L;
                        }
                        throw null;
                    }
                    return 3L;
                }
                return 2L;
            }
            return 1L;
        }
        return 0L;
    }

    public static String OooO0oO(String str, String str2) {
        return str + str2;
    }

    public static String OooO0oo(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static /* synthetic */ void OooOO0(Parcelable parcelable) {
        if (parcelable != null) {
            throw new ClassCastException();
        }
    }

    public static /* synthetic */ void OooOO0O(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static String OooOO0o(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ String OooOOO(int i) {
        switch (i) {
            case 1:
                return "NONE";
            case 2:
                return "LEFT";
            case 3:
                return "TOP";
            case 4:
                return "RIGHT";
            case 5:
                return "BOTTOM";
            case 6:
                return "BASELINE";
            case 7:
                return "CENTER";
            case 8:
                return "CENTER_X";
            case 9:
                return "CENTER_Y";
            default:
                throw null;
        }
    }

    public static /* synthetic */ void OooOOO0(Object obj) {
        throw new ClassCastException();
    }

    public static /* synthetic */ String OooOOOO(int i) {
        if (i != 1) {
            if (i != 2) {
                if (i != 3) {
                    if (i == 4) {
                        return "MATCH_PARENT";
                    }
                    throw null;
                }
                return "MATCH_CONSTRAINT";
            }
            return "WRAP_CONTENT";
        }
        return "FIXED";
    }

    public static /* synthetic */ int OooOOOo(int i) {
        if (i != 0) {
            return i - 1;
        }
        throw null;
    }

    public static /* synthetic */ String OooOOo(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "DECODE_DATA" : "SWITCH_TO_SOURCE_SERVICE" : "INITIALIZE";
    }

    public static /* synthetic */ String OooOOo0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "null" : "MEMORY_CACHE" : "RESOURCE_DISK_CACHE" : "DATA_DISK_CACHE" : "REMOTE" : "LOCAL";
    }

    public static /* synthetic */ String OooOOoo(int i) {
        switch (i) {
            case 1:
                return "INITIALIZE";
            case 2:
                return "RESOURCE_CACHE";
            case 3:
                return "DATA_CACHE";
            case 4:
                return "SOURCE";
            case 5:
                return "ENCODE";
            case 6:
                return "FINISHED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String OooOo0(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "NONE" : "TRANSFORMED" : "SOURCE";
    }

    public static /* synthetic */ String OooOo00(int i) {
        switch (i) {
            case 1:
                return "UNKNOWN";
            case 2:
                return "HORIZONTAL_DIMENSION";
            case 3:
                return "VERTICAL_DIMENSION";
            case 4:
                return "LEFT";
            case 5:
                return "RIGHT";
            case 6:
                return "TOP";
            case 7:
                return "BOTTOM";
            case 8:
                return "BASELINE";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String OooOo0O(int i) {
        return i != 1 ? i != 2 ? i != 3 ? "null" : "REMOVING" : "ADDING" : "NONE";
    }

    public static /* synthetic */ String OooOo0o(int i) {
        return i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVISIBLE" : "GONE" : "VISIBLE" : "REMOVED";
    }
}


