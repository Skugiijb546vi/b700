package com.ninja.engine;

import android.content.Context;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.net.Uri;
import android.util.Log;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;
/* renamed from: com.ninja.engine.o0o0Oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0549o0o0Oo implements InterfaceC0904oOO000o0 {
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;
    public final Object OooO0OO;

    public C0549o0o0Oo(Context context, InterfaceC0397o0OOoo0O interfaceC0397o0OOoo0O) {
        this.OooO00o = 1;
        this.OooO0O0 = context.getApplicationContext();
        this.OooO0OO = interfaceC0397o0OOoo0O;
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final C0903oOO000Oo OooO00o(Object obj, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        Resources resources;
        C0903oOO000Oo OooO00o;
        Uri uri;
        switch (this.OooO00o) {
            case 0:
                Uri uri2 = (Uri) obj;
                return new C0903oOO000Oo(new C0947oOO0oO00(uri2), ((o00OOO0O) this.OooO0OO).OooOOOO((AssetManager) this.OooO0O0, uri2.toString().substring(22)));
            case 1:
                Integer num = (Integer) obj;
                Resources.Theme theme = (Resources.Theme) c0973oOOO00o.OooO0OO(C1127oOOooOOO.OooO0O0);
                if (theme != null) {
                    resources = theme.getResources();
                } else {
                    resources = ((Context) this.OooO0O0).getResources();
                }
                return new C0903oOO000Oo(new C0947oOO0oO00(num), new C0396o0OOoo0(theme, resources, (InterfaceC0397o0OOoo0O) this.OooO0OO, num.intValue()));
            case 2:
                List list = (List) this.OooO0O0;
                int size = list.size();
                ArrayList arrayList = new ArrayList(size);
                InterfaceC0745oO00oOo interfaceC0745oO00oOo = null;
                for (int i3 = 0; i3 < size; i3++) {
                    InterfaceC0904oOO000o0 interfaceC0904oOO000o0 = (InterfaceC0904oOO000o0) list.get(i3);
                    if (interfaceC0904oOO000o0.OooO0O0(obj) && (OooO00o = interfaceC0904oOO000o0.OooO00o(obj, i, i2, c0973oOOO00o)) != null) {
                        arrayList.add(OooO00o.OooO0OO);
                        interfaceC0745oO00oOo = OooO00o.OooO00o;
                    }
                }
                if (arrayList.isEmpty() || interfaceC0745oO00oOo == null) {
                    return null;
                }
                return new C0903oOO000Oo(interfaceC0745oO00oOo, new oOO00OO0(arrayList, (oOOOO0O0) this.OooO0OO));
            case 3:
                Integer num2 = (Integer) obj;
                Resources resources2 = (Resources) this.OooO0OO;
                try {
                    uri = Uri.parse("android.resource://" + resources2.getResourcePackageName(num2.intValue()) + '/' + resources2.getResourceTypeName(num2.intValue()) + '/' + resources2.getResourceEntryName(num2.intValue()));
                } catch (Resources.NotFoundException unused) {
                    Log.isLoggable("ResourceLoader", 5);
                    uri = null;
                }
                if (uri == null) {
                    return null;
                }
                return ((InterfaceC0904oOO000o0) this.OooO0O0).OooO00o(uri, i, i2, c0973oOOO00o);
            default:
                Uri uri3 = (Uri) obj;
                List<String> pathSegments = uri3.getPathSegments();
                int size2 = pathSegments.size();
                InterfaceC0904oOO000o0 interfaceC0904oOO000o02 = (InterfaceC0904oOO000o0) this.OooO0OO;
                C0903oOO000Oo c0903oOO000Oo = null;
                if (size2 == 1) {
                    try {
                        int parseInt = Integer.parseInt(uri3.getPathSegments().get(0));
                        if (parseInt == 0) {
                            if (Log.isLoggable("ResourceUriLoader", 5)) {
                                uri3.toString();
                            }
                        } else {
                            c0903oOO000Oo = interfaceC0904oOO000o02.OooO00o(Integer.valueOf(parseInt), i, i2, c0973oOOO00o);
                        }
                        return c0903oOO000Oo;
                    } catch (NumberFormatException unused2) {
                        if (Log.isLoggable("ResourceUriLoader", 5)) {
                            Objects.toString(uri3);
                            return c0903oOO000Oo;
                        }
                        return c0903oOO000Oo;
                    }
                } else if (pathSegments.size() == 2) {
                    List<String> pathSegments2 = uri3.getPathSegments();
                    String str = pathSegments2.get(1);
                    Context context = (Context) this.OooO0O0;
                    int identifier = context.getResources().getIdentifier(str, pathSegments2.get(0), context.getPackageName());
                    if (identifier == 0) {
                        if (!Log.isLoggable("ResourceUriLoader", 5)) {
                            return null;
                        }
                        uri3.toString();
                        return null;
                    }
                    return interfaceC0904oOO000o02.OooO00o(Integer.valueOf(identifier), i, i2, c0973oOOO00o);
                } else if (!Log.isLoggable("ResourceUriLoader", 5)) {
                    return null;
                } else {
                    uri3.toString();
                    return null;
                }
        }
    }

    @Override // com.ninja.engine.InterfaceC0904oOO000o0
    public final boolean OooO0O0(Object obj) {
        switch (this.OooO00o) {
            case 0:
                Uri uri = (Uri) obj;
                if (!"file".equals(uri.getScheme()) || uri.getPathSegments().isEmpty() || !"android_asset".equals(uri.getPathSegments().get(0))) {
                    return false;
                }
                return true;
            case 1:
                Integer num = (Integer) obj;
                return true;
            case 2:
                for (InterfaceC0904oOO000o0 interfaceC0904oOO000o0 : (List<InterfaceC0904oOO000o0>) this.OooO0O0) {
                    if (interfaceC0904oOO000o0.OooO0O0(obj)) {
                        return true;
                    }
                }
                return false;
            case 3:
                Integer num2 = (Integer) obj;
                return true;
            default:
                Uri uri2 = (Uri) obj;
                if ("android.resource".equals(uri2.getScheme()) && ((Context) this.OooO0O0).getPackageName().equals(uri2.getAuthority())) {
                    return true;
                }
                return false;
        }
    }

    public String toString() {
        switch (this.OooO00o) {
            case 2:
                return "MultiModelLoader{modelLoaders=" + Arrays.toString(((List) this.OooO0O0).toArray()) + '}';
            default:
                return super.toString();
        }
    }

    public C0549o0o0Oo(Context context, InterfaceC0904oOO000o0 interfaceC0904oOO000o0) {
        this.OooO00o = 4;
        this.OooO0O0 = context.getApplicationContext();
        this.OooO0OO = interfaceC0904oOO000o0;
    }

    public C0549o0o0Oo(Resources resources, InterfaceC0904oOO000o0 interfaceC0904oOO000o0) {
        this.OooO00o = 3;
        this.OooO0OO = resources;
        this.OooO0O0 = interfaceC0904oOO000o0;
    }

    public /* synthetic */ C0549o0o0Oo(Object obj, int i, Object obj2) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
    }
}


