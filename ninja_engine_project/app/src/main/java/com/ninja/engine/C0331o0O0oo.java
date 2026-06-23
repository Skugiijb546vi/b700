package com.ninja.engine;

import android.content.ClipData;
import android.content.ClipDescription;
import android.content.ContentProviderClient;
import android.content.Context;
import android.content.res.AssetManager;
import android.database.Cursor;
import android.net.Uri;
import android.os.Build;
import android.os.RemoteException;
import android.util.Log;
import android.view.ContentInfo;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Objects;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.ninja.engine.o0O0oo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0331o0O0oo implements InterfaceC0886oO0oo0o0, o00O0OOO, oOO000o, o00OOO0O, InterfaceC0322o0O0oO0O, o0OOOOO, InterfaceC0526o0o0O0, InterfaceC0553o0o0Oo0o, InterfaceC0076o0000oo, InterfaceC0870oO0oOoOO, InterfaceC1444oo00oooO, InterfaceC0265o00ooOO {
    public static C0331o0O0oo OooO0OO;
    public final /* synthetic */ int OooO00o;
    public final Object OooO0O0;

    public C0331o0O0oo(int i) {
        this.OooO00o = i;
        switch (i) {
            case 15:
                this.OooO0O0 = new HashMap();
                return;
            case 16:
                this.OooO0O0 = new C0331o0O0oo(22);
                return;
            case 22:
                this.OooO0O0 = new C0838oO0o0oo(500L);
                return;
            case 27:
                this.OooO0O0 = new ArrayList();
                return;
            default:
                this.OooO0O0 = new o0OOOO00();
                return;
        }
    }

    public static C0331o0O0oo OooOoO() {
        if (OooO0OO == null) {
            synchronized (C0331o0O0oo.class) {
                try {
                    if (OooO0OO == null) {
                        OooO0OO = new C0331o0O0oo(0);
                    }
                } finally {
                }
            }
        }
        return OooO0OO;
    }

    @Override // com.ninja.engine.InterfaceC0553o0o0Oo0o
    public Cursor OooO(Uri uri, String[] strArr, String[] strArr2) {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.OooO0O0;
        if (contentProviderClient == null) {
            return null;
        }
        try {
            return contentProviderClient.query(uri, strArr, "query = ?", strArr2, null, null);
        } catch (RemoteException unused) {
            return null;
        }
    }

    @Override // com.ninja.engine.InterfaceC0886oO0oo0o0
    public void OooO00o(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        switch (this.OooO00o) {
            case 2:
                InterfaceC0886oO0oo0o0 interfaceC0886oO0oo0o0 = ((ActionMenuView) this.OooO0O0).OooOo0O;
                if (interfaceC0886oO0oo0o0 != null) {
                    interfaceC0886oO0oo0o0.OooO00o(menuC0887oO0oo0oo);
                    return;
                }
                return;
            default:
                return;
        }
    }

    @Override // com.ninja.engine.InterfaceC0322o0O0oO0O
    public ClipData OooO0O0() {
        ClipData clip;
        clip = ((ContentInfo) this.OooO0O0).getClip();
        return clip;
    }

    @Override // com.ninja.engine.InterfaceC0076o0000oo
    public void OooO0OO(Object obj) {
        o0000O00 o0000o00 = (o0000O00) obj;
        C0606o0oOoooO c0606o0oOoooO = (C0606o0oOoooO) this.OooO0O0;
        C0603o0oOooOo c0603o0oOooOo = (C0603o0oOooOo) c0606o0oOoooO.OooOoo.pollFirst();
        if (c0603o0oOooOo != null) {
            AbstractComponentCallbacksC0593o0oOoOo0 OooOOOO = c0606o0oOoooO.OooO0OO.OooOOOO(c0603o0oOooOo.OooO00o);
            if (OooOOOO != null) {
                int i = o0000o00.OooO00o;
                if (Log.isLoggable("FragmentManager", 2)) {
                    OooOOOO.toString();
                    Objects.toString(o0000o00.OooO0O0);
                }
            }
        }
    }

    @Override // com.ninja.engine.oOO000o
    public InterfaceC0904oOO000o0 OooO0Oo(oOO00OOO ooo00ooo) {
        switch (this.OooO00o) {
            case 4:
                return new C0549o0o0Oo((AssetManager) this.OooO0O0, 0, this);
            default:
                return new oO00O0o0((C0331o0O0oo) this.OooO0O0);
        }
    }

    @Override // com.ninja.engine.o0OOOOO
    public long OooO0o0(long j) {
        if (j < 0) {
            return 0L;
        }
        long j2 = j;
        while (j2 > 0) {
            InputStream inputStream = (InputStream) this.OooO0O0;
            long skip = inputStream.skip(j2);
            if (skip > 0) {
                j2 -= skip;
            } else if (inputStream.read() == -1) {
                break;
            } else {
                j2--;
            }
        }
        return j - j2;
    }

    @Override // com.ninja.engine.o0OOOOO
    public int OooO0oO(byte[] bArr, int i) {
        int i2 = 0;
        int i3 = 0;
        while (i2 < i && (i3 = ((InputStream) this.OooO0O0).read(bArr, i2, i - i2)) != -1) {
            i2 += i3;
        }
        if (i2 == 0 && i3 == -1) {
            throw new o0OOOOO0();
        }
        return i2;
    }

    @Override // com.ninja.engine.o0OOOOO
    public short OooO0oo() {
        int read = ((InputStream) this.OooO0O0).read();
        if (read != -1) {
            return (short) read;
        }
        throw new o0OOOOO0();
    }

    @Override // com.ninja.engine.InterfaceC1444oo00oooO
    public int OooOO0() {
        AbstractC1066oOOo0Oo abstractC1066oOOo0Oo = (AbstractC1066oOOo0Oo) this.OooO0O0;
        return abstractC1066oOOo0Oo.OooOOO - abstractC1066oOOo0Oo.Oooo000();
    }

    @Override // com.ninja.engine.InterfaceC0265o00ooOO
    public void OooOO0O() {
        ((C1237oOoOoO0O) this.OooO0O0).OooO00o();
    }

    @Override // com.ninja.engine.o0OOOOO
    public int OooOO0o() {
        return (OooO0oo() << 8) | OooO0oo();
    }

    @Override // com.ninja.engine.InterfaceC0526o0o0O0
    public Object OooOOO() {
        o0O0OO o0o0oo = (o0O0OO) this.OooO0O0;
        return new o0OOO0OO((C0325o0O0oOO0) o0o0oo.OooO0O0, (C0131o00O0o) o0o0oo.OooO0OO);
    }

    @Override // com.ninja.engine.InterfaceC1444oo00oooO
    public int OooOOO0(View view) {
        ((AbstractC1066oOOo0Oo) this.OooO0O0).getClass();
        return (view.getLeft() - ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0.left) - ((ViewGroup.MarginLayoutParams) ((C1068oOOo0OoO) view.getLayoutParams())).leftMargin;
    }

    @Override // com.ninja.engine.o00OOO0O
    public InterfaceC0346o0OO0o0 OooOOOO(AssetManager assetManager, String str) {
        return new C0538o0o0OO(assetManager, str, 0);
    }

    @Override // com.ninja.engine.InterfaceC0322o0O0oO0O
    public int OooOOOo() {
        int flags;
        flags = ((ContentInfo) this.OooO0O0).getFlags();
        return flags;
    }

    @Override // com.ninja.engine.InterfaceC0322o0O0oO0O
    public ContentInfo OooOOo0() {
        return (ContentInfo) this.OooO0O0;
    }

    @Override // com.ninja.engine.InterfaceC1444oo00oooO
    public View OooOOoo(int i) {
        return ((AbstractC1066oOOo0Oo) this.OooO0O0).OooOo0(i);
    }

    @Override // com.ninja.engine.InterfaceC1444oo00oooO
    public int OooOo(View view) {
        ((AbstractC1066oOOo0Oo) this.OooO0O0).getClass();
        return view.getRight() + ((C1068oOOo0OoO) view.getLayoutParams()).OooO0O0.right + ((ViewGroup.MarginLayoutParams) ((C1068oOOo0OoO) view.getLayoutParams())).rightMargin;
    }

    @Override // com.ninja.engine.InterfaceC0886oO0oo0o0
    public boolean OooOo0(MenuC0887oO0oo0oo menuC0887oO0oo0oo, MenuItem menuItem) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0;
        Object obj = this.OooO0O0;
        switch (this.OooO00o) {
            case 2:
                o00000 o00000Var = ((ActionMenuView) obj).OooOoOO;
                if (o00000Var == null) {
                    return false;
                }
                Iterator it = ((CopyOnWriteArrayList) ((Toolbar) ((o00O) o00000Var).OooO0O0).Oooo00O.OooO0Oo).iterator();
                while (it.hasNext()) {
                    if (((C0599o0oOoo0O) it.next()).OooO00o.OooOOOO()) {
                        return true;
                    }
                }
                return false;
            default:
                oOO0O0O ooo0o0o = (oOO0O0O) obj;
                ooo0o0o.getClass();
                oOO0O0 ooo0o0 = ooo0o0o.OooO0o0;
                if (ooo0o0 == null) {
                    return false;
                }
                C0435o0OoO000 c0435o0OoO000 = (C0435o0OoO000) ooo0o0;
                c0435o0OoO000.getClass();
                int i = com.ninja.engine.view.main.MainActivity.OooOooO;
                com.ninja.engine.view.main.MainActivity mainActivity = (com.ninja.engine.view.main.MainActivity) c0435o0OoO000.OooO0O0;
                AbstractC0809oO0OooOO.OooOOOo(mainActivity, "this$0");
                AbstractC0809oO0OooOO.OooOOOo(menuItem, "item");
                int itemId = menuItem.getItemId();
                if (itemId == R.id.nav_home) {
                    abstractComponentCallbacksC0593o0oOoOo0 = mainActivity.OooOoO0;
                } else if (itemId == R.id.nav_account) {
                    abstractComponentCallbacksC0593o0oOoOo0 = mainActivity.OooOoO;
                } else if (itemId == R.id.nav_resellers) {
                    abstractComponentCallbacksC0593o0oOoOo0 = mainActivity.OooOoOO;
                } else if (itemId == R.id.nav_settings) {
                    abstractComponentCallbacksC0593o0oOoOo0 = mainActivity.OooOoo0;
                } else {
                    return true;
                }
                mainActivity.OooOoo0(abstractComponentCallbacksC0593o0oOoOo0);
                return false;
        }
    }

    @Override // com.ninja.engine.InterfaceC1444oo00oooO
    public int OooOo00() {
        return ((AbstractC1066oOOo0Oo) this.OooO0O0).OooOooo();
    }

    @Override // com.ninja.engine.InterfaceC0322o0O0oO0O
    public int OooOo0O() {
        int source;
        source = ((ContentInfo) this.OooO0O0).getSource();
        return source;
    }

    public synchronized InterfaceC1128oOOooOOo OooOoO0(Class cls) {
        int size = ((ArrayList) this.OooO0O0).size();
        for (int i = 0; i < size; i++) {
            C1130oOOooOo0 c1130oOOooOo0 = (C1130oOOooOo0) ((ArrayList) this.OooO0O0).get(i);
            if (c1130oOOooOo0.OooO00o.isAssignableFrom(cls)) {
                return c1130oOOooOo0.OooO0O0;
            }
        }
        return null;
    }

    public void OooOoOO() {
        ((C0589o0oOoOO0) this.OooO0O0).Oooo0.Oooo0OO();
    }

    public void OooOoo() {
        View view;
        View view2 = (View) this.OooO0O0;
        if (view2 == null) {
            return;
        }
        if (!view2.isInEditMode() && !view2.onCheckIsTextEditor()) {
            view = view2.getRootView().findFocus();
        } else {
            view2.requestFocus();
            view = view2;
        }
        if (view == null) {
            view = view2.getRootView().findViewById(16908290);
        }
        if (view != null && view.hasWindowFocus()) {
            view.post(new RunnableC0061o00000oO(18, view));
        }
    }

    @Override // com.ninja.engine.InterfaceC0553o0o0Oo0o
    public void close() {
        ContentProviderClient contentProviderClient = (ContentProviderClient) this.OooO0O0;
        if (contentProviderClient != null) {
            contentProviderClient.release();
        }
    }

    public String toString() {
        switch (this.OooO00o) {
            case 6:
                return "ContentInfoCompat{" + ((ContentInfo) this.OooO0O0) + "}";
            default:
                return super.toString();
        }
    }

    public /* synthetic */ C0331o0O0oo(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
    }

    public C0331o0O0oo(Context context) {
        this.OooO00o = 18;
        this.OooO0O0 = new C0415o0Oo0O0O(context, 22);
    }

    public C0331o0O0oo(Context context, Uri uri) {
        this.OooO00o = 12;
        this.OooO0O0 = context.getContentResolver().acquireUnstableContentProviderClient(uri);
    }

    public C0331o0O0oo(Uri uri, ClipDescription clipDescription, Uri uri2) {
        this.OooO00o = 17;
        this.OooO0O0 = Build.VERSION.SDK_INT >= 25 ? new C0859oO0oOOOo(uri, clipDescription, uri2) : new C0131o00O0o(uri, clipDescription, uri2, 16);
    }

    public C0331o0O0oo(ContentInfo contentInfo) {
        this.OooO00o = 6;
        contentInfo.getClass();
        this.OooO0O0 = AbstractC0187o00o.OooO0oO(contentInfo);
    }

    public C0331o0O0oo(EditText editText) {
        this.OooO00o = 9;
        AbstractC0809oO0OooOO.OooOOO(editText, "editText cannot be null");
        this.OooO0O0 = new C0415o0Oo0O0O(editText, 14);
    }

    public C0331o0O0oo(TextView textView) {
        this.OooO00o = 10;
        AbstractC0809oO0OooOO.OooOOO(textView, "textView cannot be null");
        this.OooO0O0 = new C0476o0Ooo0oO(textView);
    }

    private final void OooOoo0(MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
    }

    public void OooO0o(int i) {
    }

    public void OooOOo(int i) {
    }

    public void OooOo0o(int i, float f) {
    }
}
