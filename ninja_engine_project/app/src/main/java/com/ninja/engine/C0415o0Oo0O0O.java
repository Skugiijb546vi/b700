package com.ninja.engine;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.ImageDecoder;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Shader;
import android.graphics.drawable.AnimationDrawable;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.ClipDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.os.Build;
import android.text.Editable;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseIntArray;
import android.view.MenuItem;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.EditText;
import android.widget.ProgressBar;
import androidx.cardview.widget.CardView;
import com.app.framework.core.system.user.BUserHandle;
import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Objects;
import java.util.WeakHashMap;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.locks.ReentrantReadWriteLock;
/* renamed from: com.ninja.engine.o0Oo0O0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C0415o0Oo0O0O implements o00000O0, InterfaceC1128oOOooOOo, InterfaceC0265o00ooOO, InterfaceC0473o0Ooo0Oo {
    public static C0415o0Oo0O0O OooO0Oo;
    public static final int[] OooO0o0 = {16843067, 16843068};
    public final /* synthetic */ int OooO00o;
    public Object OooO0O0;
    public Object OooO0OO;

    public C0415o0Oo0O0O(int i) {
        this.OooO00o = i;
        switch (i) {
            case 13:
                this.OooO0O0 = new HashMap();
                this.OooO0OO = new C0235o00oOOo0(1);
                return;
            case 20:
                this.OooO0O0 = new SparseIntArray();
                this.OooO0OO = new SparseIntArray();
                return;
            case 21:
                this.OooO0O0 = new C0697oO0000o(null);
                this.OooO0OO = new HashMap();
                return;
            case 23:
                this.OooO0O0 = new HashMap();
                this.OooO0OO = new HashMap();
                return;
            case 27:
                this.OooO0O0 = new AtomicReference();
                this.OooO0OO = new C1218oOoOOoo();
                return;
            default:
                this.OooO0O0 = new ConcurrentHashMap();
                this.OooO0OO = new AtomicInteger();
                return;
        }
    }

    public static C0077o0000oo0 OooO0o(ImageDecoder.Source source, int i, int i2, C0973oOOO00o c0973oOOO00o) {
        Drawable decodeDrawable;
        decodeDrawable = ImageDecoder.decodeDrawable(source, new C0370o0OOOoOo(i, i2, c0973oOOO00o));
        if (AbstractC0032Oooo00o.OooOo(decodeDrawable)) {
            return new C0077o0000oo0(0, AbstractC0032Oooo00o.OooO0oO(decodeDrawable));
        }
        throw new IOException("Received unexpected drawable type for animated image, failing: " + decodeDrawable);
    }

    public static C0415o0Oo0O0O OooOoo(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O) {
        return new C0415o0Oo0O0O(interfaceC0760oO0O0o0O, ((InterfaceC1468oo0O0OOo) interfaceC0760oO0O0o0O).OooO0Oo());
    }

    public static C0415o0Oo0O0O OooOoo0() {
        if (OooO0Oo == null) {
            synchronized (C0415o0Oo0O0O.class) {
                try {
                    if (OooO0Oo == null) {
                        OooO0Oo = new C0415o0Oo0O0O(0);
                    }
                } finally {
                }
            }
        }
        return OooO0Oo;
    }

    public static int OooOooo(int i, int i2) {
        int i3 = 0;
        int i4 = 0;
        for (int i5 = 0; i5 < i; i5++) {
            i3++;
            if (i3 == i2) {
                i4++;
                i3 = 0;
            } else if (i3 > i2) {
                i4++;
                i3 = 1;
            }
        }
        if (i3 + 1 > i2) {
            return i4 + 1;
        }
        return i4;
    }

    public void OooO(boolean z) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = ((C0606o0oOoooO) this.OooO0OO).OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooO(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    @Override // com.ninja.engine.InterfaceC0473o0Ooo0Oo
    public Object OooO00o() {
        return (C1393oo00O0oO) this.OooO0O0;
    }

    @Override // com.ninja.engine.o00000O0
    public boolean OooO0O0(o00000O o00000o, MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        return ((o00000O0) this.OooO0O0).OooO0O0(o00000o, menuC0887oO0oo0oo);
    }

    @Override // com.ninja.engine.o00000O0
    public boolean OooO0OO(o00000O o00000o, MenuItem menuItem) {
        return ((o00000O0) this.OooO0O0).OooO0OO(o00000o, menuItem);
    }

    @Override // com.ninja.engine.o00000O0
    public boolean OooO0Oo(o00000O o00000o, MenuC0887oO0oo0oo menuC0887oO0oo0oo) {
        ViewGroup viewGroup = ((LayoutInflater$Factory2C0109o000oOoo) this.OooO0OO).OooOoOO;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        AbstractC1449oo0O000.OooO0OO(viewGroup);
        return ((o00000O0) this.OooO0O0).OooO0Oo(o00000o, menuC0887oO0oo0oo);
    }

    @Override // com.ninja.engine.InterfaceC0488o0Ooooo
    public boolean OooO0o0(Object obj, File file, C0973oOOO00o c0973oOOO00o) {
        return ((InterfaceC1128oOOooOOo) this.OooO0OO).OooO0o0(new C0207o00o0OOo(((BitmapDrawable) ((InterfaceC1108oOOoo) obj).get()).getBitmap(), (InterfaceC0206o00o0OOO) this.OooO0O0), file, c0973oOOO00o);
    }

    @Override // com.ninja.engine.InterfaceC0473o0Ooo0Oo
    public boolean OooO0oO(CharSequence charSequence, int i, int i2, C1373oo000o0 c1373oo000o0) {
        Spannable spannableString;
        if ((c1373oo000o0.OooO0OO & 4) > 0) {
            return true;
        }
        if (((C1393oo00O0oO) this.OooO0O0) == null) {
            if (charSequence instanceof Spannable) {
                spannableString = (Spannable) charSequence;
            } else {
                spannableString = new SpannableString(charSequence);
            }
            this.OooO0O0 = new C1393oo00O0oO(spannableString);
        }
        ((C0601o0oOooO0) this.OooO0OO).getClass();
        ((C1393oo00O0oO) this.OooO0O0).setSpan(new C1375oo000o0O(c1373oo000o0), i, i2, 33);
        return true;
    }

    @Override // com.ninja.engine.o00000O0
    public void OooO0oo(o00000O o00000o) {
        ((o00000O0) this.OooO0O0).OooO0oo(o00000o);
        LayoutInflater$Factory2C0109o000oOoo layoutInflater$Factory2C0109o000oOoo = (LayoutInflater$Factory2C0109o000oOoo) this.OooO0OO;
        if (layoutInflater$Factory2C0109o000oOoo.OooOo0o != null) {
            layoutInflater$Factory2C0109o000oOoo.OooOO0o.getDecorView().removeCallbacks(layoutInflater$Factory2C0109o000oOoo.OooOo);
        }
        if (layoutInflater$Factory2C0109o000oOoo.OooOo0O != null) {
            C1470oo0O0OoO c1470oo0O0OoO = layoutInflater$Factory2C0109o000oOoo.OooOoO0;
            if (c1470oo0O0OoO != null) {
                c1470oo0O0OoO.OooO0O0();
            }
            C1470oo0O0OoO OooO00o = AbstractC1460oo0O00oo.OooO00o(layoutInflater$Factory2C0109o000oOoo.OooOo0O);
            OooO00o.OooO00o(0.0f);
            layoutInflater$Factory2C0109o000oOoo.OooOoO0 = OooO00o;
            OooO00o.OooO0Oo(new C0098o000o00O(2, this));
        }
        layoutInflater$Factory2C0109o000oOoo.OooOo0 = null;
        ViewGroup viewGroup = layoutInflater$Factory2C0109o000oOoo.OooOoOO;
        WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
        AbstractC1449oo0O000.OooO0OO(viewGroup);
        layoutInflater$Factory2C0109o000oOoo.Oooo00o();
    }

    public void OooOO0(boolean z) {
        C0606o0oOoooO c0606o0oOoooO = (C0606o0oOoooO) this.OooO0OO;
        Context context = c0606o0oOoooO.OooOo00.Oooo00O;
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = c0606o0oOoooO.OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooOO0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    @Override // com.ninja.engine.InterfaceC0265o00ooOO
    public void OooOO0O() {
        ((Animator) this.OooO0O0).end();
        if (Log.isLoggable("FragmentManager", 2)) {
            Objects.toString((C1237oOoOoO0O) this.OooO0OO);
        }
    }

    public void OooOO0o(boolean z) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = ((C0606o0oOoooO) this.OooO0OO).OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooOO0o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    public void OooOOO(boolean z) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = ((C0606o0oOoooO) this.OooO0OO).OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooOOO(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    public void OooOOO0(boolean z) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = ((C0606o0oOoooO) this.OooO0OO).OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooOOO0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    public void OooOOOO(boolean z) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = ((C0606o0oOoooO) this.OooO0OO).OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooOOOO(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    public void OooOOOo(boolean z) {
        C0606o0oOoooO c0606o0oOoooO = (C0606o0oOoooO) this.OooO0OO;
        Context context = c0606o0oOoooO.OooOo00.Oooo00O;
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = c0606o0oOoooO.OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooOOOo(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    public void OooOOo(boolean z) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = ((C0606o0oOoooO) this.OooO0OO).OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooOOo(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    public void OooOOo0(boolean z) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = ((C0606o0oOoooO) this.OooO0OO).OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooOOo0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    public void OooOOoo(boolean z) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = ((C0606o0oOoooO) this.OooO0OO).OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooOOoo(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    public void OooOo(String str, PrintWriter printWriter) {
        C1236oOoOoO00 c1236oOoOoO00 = ((C0797oO0OoO00) this.OooO0OO).OooO0OO;
        if (c1236oOoOoO00.OooO0OO > 0) {
            printWriter.print(str);
            printWriter.println("Loaders:");
            if (c1236oOoOoO00.OooO0OO > 0) {
                AbstractC1230oOoOo0o.OooOO0O(c1236oOoOoO00.OooO0O0[0]);
                printWriter.print(str);
                printWriter.print("  #");
                printWriter.print(c1236oOoOoO00.OooO00o[0]);
                printWriter.print(": ");
                throw null;
            }
        }
    }

    public void OooOo0(boolean z) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = ((C0606o0oOoooO) this.OooO0OO).OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooOo0(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    public void OooOo00(boolean z) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = ((C0606o0oOoooO) this.OooO0OO).OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooOo00(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    public void OooOo0O(boolean z) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = ((C0606o0oOoooO) this.OooO0OO).OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooOo0O(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    public void OooOo0o(boolean z) {
        AbstractComponentCallbacksC0593o0oOoOo0 abstractComponentCallbacksC0593o0oOoOo0 = ((C0606o0oOoooO) this.OooO0OO).OooOo0O;
        if (abstractComponentCallbacksC0593o0oOoOo0 != null) {
            abstractComponentCallbacksC0593o0oOoOo0.OooOO0O().OooOO0o.OooOo0o(true);
        }
        Iterator it = ((CopyOnWriteArrayList) this.OooO0O0).iterator();
        if (it.hasNext()) {
            AbstractC1230oOoOo0o.OooOO0O(it.next());
            throw null;
        }
    }

    public Object OooOoO(InterfaceC0994oOOOO00o interfaceC0994oOOOO00o) {
        int i;
        HashMap hashMap = (HashMap) this.OooO0OO;
        C0697oO0000o c0697oO0000o = (C0697oO0000o) hashMap.get(interfaceC0994oOOOO00o);
        if (c0697oO0000o == null) {
            c0697oO0000o = new C0697oO0000o(interfaceC0994oOOOO00o);
            hashMap.put(interfaceC0994oOOOO00o, c0697oO0000o);
        } else {
            interfaceC0994oOOOO00o.OooO00o();
        }
        C0697oO0000o c0697oO0000o2 = c0697oO0000o.OooO0Oo;
        c0697oO0000o2.OooO0OO = c0697oO0000o.OooO0OO;
        c0697oO0000o.OooO0OO.OooO0Oo = c0697oO0000o2;
        C0697oO0000o c0697oO0000o3 = (C0697oO0000o) this.OooO0O0;
        c0697oO0000o.OooO0Oo = c0697oO0000o3;
        C0697oO0000o c0697oO0000o4 = c0697oO0000o3.OooO0OO;
        c0697oO0000o.OooO0OO = c0697oO0000o4;
        c0697oO0000o4.OooO0Oo = c0697oO0000o;
        c0697oO0000o.OooO0Oo.OooO0OO = c0697oO0000o;
        ArrayList arrayList = c0697oO0000o.OooO0O0;
        if (arrayList != null) {
            i = arrayList.size();
        } else {
            i = 0;
        }
        if (i > 0) {
            return c0697oO0000o.OooO0O0.remove(i - 1);
        }
        return null;
    }

    @Override // com.ninja.engine.InterfaceC1128oOOooOOo
    public int OooOoO0(C0973oOOO00o c0973oOOO00o) {
        return ((InterfaceC1128oOOooOOo) this.OooO0OO).OooOoO0(c0973oOOO00o);
    }

    public synchronized ArrayList OooOoOO(Class cls) {
        return ((oOO00OOO) this.OooO0O0).OooOOoo(cls);
    }

    public KeyListener OooOooO(KeyListener keyListener) {
        if (!(keyListener instanceof NumberKeyListener)) {
            ((C0415o0Oo0O0O) ((C0331o0O0oo) this.OooO0OO).OooO0O0).getClass();
            if (!(keyListener instanceof C0565o0oOOO0o)) {
                if (keyListener == null) {
                    return null;
                }
                if (!(keyListener instanceof NumberKeyListener)) {
                    return new C0565o0oOOO0o(keyListener);
                }
                return keyListener;
            }
            return keyListener;
        }
        return keyListener;
    }

    public void Oooo(int i, int i2, int i3, int i4) {
        CardView cardView = (CardView) this.OooO0OO;
        cardView.OooO0Oo.set(i, i2, i3, i4);
        Rect rect = cardView.OooO0OO;
        CardView.OooO00o(cardView, i + rect.left, i2 + rect.top, i3 + rect.right, i4 + rect.bottom);
    }

    public void Oooo0(C0571o0oOOoo0 c0571o0oOOoo0) {
        int i = c0571o0oOOoo0.OooO0O0;
        Executor executor = (Executor) this.OooO0OO;
        C1275oOoo0OoO c1275oOoo0OoO = (C1275oOoo0OoO) this.OooO0O0;
        if (i == 0) {
            executor.execute(new o0OO00O(c1275oOoo0OoO, c0571o0oOOoo0.OooO00o, 4, false));
        } else {
            executor.execute(new RunnableC0263o00ooO0O(i, 0, c1275oOoo0OoO));
        }
    }

    public void Oooo000() {
        ((SparseIntArray) this.OooO0O0).clear();
    }

    public void Oooo00O(AttributeSet attributeSet, int i) {
        switch (this.OooO00o) {
            case 1:
                ProgressBar progressBar = (ProgressBar) this.OooO0O0;
                C0131o00O0o Oooo0O0 = C0131o00O0o.Oooo0O0(progressBar.getContext(), attributeSet, OooO0o0, i, 0);
                Drawable OooOo = Oooo0O0.OooOo(0);
                if (OooOo != null) {
                    if (OooOo instanceof AnimationDrawable) {
                        AnimationDrawable animationDrawable = (AnimationDrawable) OooOo;
                        int numberOfFrames = animationDrawable.getNumberOfFrames();
                        AnimationDrawable animationDrawable2 = new AnimationDrawable();
                        animationDrawable2.setOneShot(animationDrawable.isOneShot());
                        for (int i2 = 0; i2 < numberOfFrames; i2++) {
                            Drawable OoooO00 = OoooO00(animationDrawable.getFrame(i2), true);
                            OoooO00.setLevel(BUserHandle.AID_APP_START);
                            animationDrawable2.addFrame(OoooO00, animationDrawable.getDuration(i2));
                        }
                        animationDrawable2.setLevel(BUserHandle.AID_APP_START);
                        OooOo = animationDrawable2;
                    }
                    progressBar.setIndeterminateDrawable(OooOo);
                }
                Drawable OooOo2 = Oooo0O0.OooOo(1);
                if (OooOo2 != null) {
                    progressBar.setProgressDrawable(OoooO00(OooOo2, false));
                }
                Oooo0O0.Oooo0o0();
                return;
            default:
                TypedArray obtainStyledAttributes = ((EditText) this.OooO0O0).getContext().obtainStyledAttributes(attributeSet, AbstractC1039oOOOoo0o.OooO, i, 0);
                try {
                    boolean z = true;
                    if (obtainStyledAttributes.hasValue(14)) {
                        z = obtainStyledAttributes.getBoolean(14, true);
                    }
                    obtainStyledAttributes.recycle();
                    Oooo0oo(z);
                    return;
                } catch (Throwable th) {
                    obtainStyledAttributes.recycle();
                    throw th;
                }
        }
    }

    public C0471o0Ooo0O Oooo00o(InputConnection inputConnection, EditorInfo editorInfo) {
        C0331o0O0oo c0331o0O0oo = (C0331o0O0oo) this.OooO0OO;
        if (inputConnection == null) {
            c0331o0O0oo.getClass();
            inputConnection = null;
        } else {
            C0415o0Oo0O0O c0415o0Oo0O0O = (C0415o0Oo0O0O) c0331o0O0oo.OooO0O0;
            c0415o0Oo0O0O.getClass();
            if (!(inputConnection instanceof C0471o0Ooo0O)) {
                inputConnection = new C0471o0Ooo0O((EditText) c0415o0Oo0O0O.OooO0O0, inputConnection, editorInfo);
            }
        }
        return (C0471o0Ooo0O) inputConnection;
    }

    /* JADX WARN: Code restructure failed: missing block: B:141:0x021c, code lost:
        continue;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void Oooo0O0(android.content.Context r12, android.content.res.XmlResourceParser r13) {
        /*
            Method dump skipped, instructions count: 644
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0415o0Oo0O0O.Oooo0O0(android.content.Context, android.content.res.XmlResourceParser):void");
    }

    public void Oooo0OO(InterfaceC0994oOOOO00o interfaceC0994oOOOO00o, Object obj) {
        HashMap hashMap = (HashMap) this.OooO0OO;
        C0697oO0000o c0697oO0000o = (C0697oO0000o) hashMap.get(interfaceC0994oOOOO00o);
        if (c0697oO0000o == null) {
            c0697oO0000o = new C0697oO0000o(interfaceC0994oOOOO00o);
            c0697oO0000o.OooO0OO = c0697oO0000o;
            c0697oO0000o.OooO0Oo = c0697oO0000o;
            C0697oO0000o c0697oO0000o2 = (C0697oO0000o) this.OooO0O0;
            c0697oO0000o.OooO0Oo = c0697oO0000o2.OooO0Oo;
            c0697oO0000o.OooO0OO = c0697oO0000o2;
            c0697oO0000o2.OooO0Oo = c0697oO0000o;
            c0697oO0000o.OooO0Oo.OooO0OO = c0697oO0000o;
            hashMap.put(interfaceC0994oOOOO00o, c0697oO0000o);
        } else {
            interfaceC0994oOOOO00o.OooO00o();
        }
        if (c0697oO0000o.OooO0O0 == null) {
            c0697oO0000o.OooO0O0 = new ArrayList();
        }
        c0697oO0000o.OooO0O0.add(obj);
    }

    public void Oooo0o(String str) {
        C0399o0OOooO c0399o0OOooO;
        synchronized (this) {
            try {
                Object obj = ((HashMap) this.OooO0O0).get(str);
                AbstractC0694o0ooooo0.OooOO0O(obj, "Argument must not be null");
                c0399o0OOooO = (C0399o0OOooO) obj;
                int i = c0399o0OOooO.OooO0O0;
                if (i >= 1) {
                    int i2 = i - 1;
                    c0399o0OOooO.OooO0O0 = i2;
                    if (i2 == 0) {
                        C0399o0OOooO c0399o0OOooO2 = (C0399o0OOooO) ((HashMap) this.OooO0O0).remove(str);
                        if (c0399o0OOooO2.equals(c0399o0OOooO)) {
                            ((C0235o00oOOo0) this.OooO0OO).OooO0O0(c0399o0OOooO2);
                        } else {
                            throw new IllegalStateException("Removed the wrong lock, expected to remove: " + c0399o0OOooO + ", but actually removed: " + c0399o0OOooO2 + ", safeKey: " + str);
                        }
                    }
                } else {
                    throw new IllegalStateException("Cannot release a lock that is not held, safeKey: " + str + ", interestedThreads: " + c0399o0OOooO.OooO0O0);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
        c0399o0OOooO.OooO00o.unlock();
    }

    public void Oooo0o0(Class cls, Class cls2, Class cls3, List list) {
        synchronized (((C0145o00OO0oO) this.OooO0OO)) {
            ((C0145o00OO0oO) this.OooO0OO).put(new C0907oOO00O0o(cls, cls2, cls3), list);
        }
    }

    public Object Oooo0oO() {
        int i;
        C0697oO0000o c0697oO0000o = (C0697oO0000o) this.OooO0O0;
        C0697oO0000o c0697oO0000o2 = c0697oO0000o.OooO0Oo;
        while (true) {
            Object obj = null;
            if (c0697oO0000o2.equals(c0697oO0000o)) {
                return null;
            }
            ArrayList arrayList = c0697oO0000o2.OooO0O0;
            if (arrayList != null) {
                i = arrayList.size();
            } else {
                i = 0;
            }
            if (i > 0) {
                obj = c0697oO0000o2.OooO0O0.remove(i - 1);
            }
            if (obj != null) {
                return obj;
            }
            C0697oO0000o c0697oO0000o3 = c0697oO0000o2.OooO0Oo;
            c0697oO0000o3.OooO0OO = c0697oO0000o2.OooO0OO;
            c0697oO0000o2.OooO0OO.OooO0Oo = c0697oO0000o3;
            Object obj2 = c0697oO0000o2.OooO00o;
            ((HashMap) this.OooO0OO).remove(obj2);
            ((InterfaceC0994oOOOO00o) obj2).OooO00o();
            c0697oO0000o2 = c0697oO0000o2.OooO0Oo;
        }
    }

    public void Oooo0oo(boolean z) {
        C0465o0Ooo c0465o0Ooo = (C0465o0Ooo) ((C0415o0Oo0O0O) ((C0331o0O0oo) this.OooO0OO).OooO0O0).OooO0OO;
        if (c0465o0Ooo.OooO0Oo != z) {
            if (c0465o0Ooo.OooO0OO != null) {
                C0469o0Ooo00O OooO00o = C0469o0Ooo00O.OooO00o();
                C0477o0Ooo0oo c0477o0Ooo0oo = c0465o0Ooo.OooO0OO;
                OooO00o.getClass();
                AbstractC0809oO0OooOO.OooOOO(c0477o0Ooo0oo, "initCallback cannot be null");
                ReentrantReadWriteLock reentrantReadWriteLock = OooO00o.OooO00o;
                reentrantReadWriteLock.writeLock().lock();
                try {
                    OooO00o.OooO0O0.remove(c0477o0Ooo0oo);
                } finally {
                    reentrantReadWriteLock.writeLock().unlock();
                }
            }
            c0465o0Ooo.OooO0Oo = z;
            if (z) {
                C0465o0Ooo.OooO00o(c0465o0Ooo.OooO00o, C0469o0Ooo00O.OooO00o().OooO0O0());
            }
        }
    }

    public Drawable OoooO00(Drawable drawable, boolean z) {
        boolean z2;
        if (drawable instanceof InterfaceC1544oo0OooOo) {
            C1546oo0Oooo0 c1546oo0Oooo0 = (C1546oo0Oooo0) ((InterfaceC1544oo0OooOo) drawable);
            Drawable drawable2 = c1546oo0Oooo0.OooO0o;
            if (drawable2 != null) {
                c1546oo0Oooo0.OooO0oO(OoooO00(drawable2, z));
            }
        } else if (drawable instanceof LayerDrawable) {
            LayerDrawable layerDrawable = (LayerDrawable) drawable;
            int numberOfLayers = layerDrawable.getNumberOfLayers();
            Drawable[] drawableArr = new Drawable[numberOfLayers];
            for (int i = 0; i < numberOfLayers; i++) {
                int id = layerDrawable.getId(i);
                Drawable drawable3 = layerDrawable.getDrawable(i);
                if (id != 16908301 && id != 16908303) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                drawableArr[i] = OoooO00(drawable3, z2);
            }
            LayerDrawable layerDrawable2 = new LayerDrawable(drawableArr);
            for (int i2 = 0; i2 < numberOfLayers; i2++) {
                layerDrawable2.setId(i2, layerDrawable.getId(i2));
                if (Build.VERSION.SDK_INT >= 23) {
                    AbstractC0121o000oooo.OooOo0(layerDrawable, layerDrawable2, i2);
                }
            }
            return layerDrawable2;
        } else if (drawable instanceof BitmapDrawable) {
            BitmapDrawable bitmapDrawable = (BitmapDrawable) drawable;
            Bitmap bitmap = bitmapDrawable.getBitmap();
            if (((Bitmap) this.OooO0OO) == null) {
                this.OooO0OO = bitmap;
            }
            ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(new float[]{5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f, 5.0f}, null, null));
            shapeDrawable.getPaint().setShader(new BitmapShader(bitmap, Shader.TileMode.REPEAT, Shader.TileMode.CLAMP));
            shapeDrawable.getPaint().setColorFilter(bitmapDrawable.getPaint().getColorFilter());
            if (z) {
                return new ClipDrawable(shapeDrawable, 3, 1);
            }
            return shapeDrawable;
        }
        return drawable;
    }

    public String toString() {
        int i;
        String hexString;
        int lastIndexOf;
        switch (this.OooO00o) {
            case 21:
                StringBuilder sb = new StringBuilder("GroupedLinkedMap( ");
                C0697oO0000o c0697oO0000o = (C0697oO0000o) this.OooO0O0;
                C0697oO0000o c0697oO0000o2 = c0697oO0000o.OooO0OO;
                boolean z = false;
                while (!c0697oO0000o2.equals(c0697oO0000o)) {
                    sb.append('{');
                    sb.append(c0697oO0000o2.OooO00o);
                    sb.append(':');
                    ArrayList arrayList = c0697oO0000o2.OooO0O0;
                    if (arrayList != null) {
                        i = arrayList.size();
                    } else {
                        i = 0;
                    }
                    sb.append(i);
                    sb.append("}, ");
                    c0697oO0000o2 = c0697oO0000o2.OooO0OO;
                    z = true;
                }
                if (z) {
                    sb.delete(sb.length() - 2, sb.length());
                }
                sb.append(" )");
                return sb.toString();
            case 25:
                StringBuilder sb2 = new StringBuilder(128);
                sb2.append("LoaderManager{");
                sb2.append(Integer.toHexString(System.identityHashCode(this)));
                sb2.append(" in ");
                InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O = (InterfaceC0760oO0O0o0O) this.OooO0O0;
                if (interfaceC0760oO0O0o0O == null) {
                    hexString = "null";
                } else {
                    String simpleName = interfaceC0760oO0O0o0O.getClass().getSimpleName();
                    if (simpleName.length() <= 0 && (lastIndexOf = (simpleName = interfaceC0760oO0O0o0O.getClass().getName()).lastIndexOf(46)) > 0) {
                        simpleName = simpleName.substring(lastIndexOf + 1);
                    }
                    sb2.append(simpleName);
                    sb2.append('{');
                    hexString = Integer.toHexString(System.identityHashCode(interfaceC0760oO0O0o0O));
                }
                sb2.append(hexString);
                sb2.append("}}");
                return sb2.toString();
            case 29:
                String str = "[ ";
                if (((C1232oOoOo0oO) this.OooO0O0) != null) {
                    for (int i2 = 0; i2 < 9; i2++) {
                        str = str + ((C1232oOoOo0oO) this.OooO0O0).OooO0oo[i2] + " ";
                    }
                }
                return str + "] " + ((C1232oOoOo0oO) this.OooO0O0);
            default:
                return super.toString();
        }
    }

    public C0415o0Oo0O0O(int i, int i2) {
        this.OooO00o = 19;
        this.OooO0O0 = new int[]{i, i2};
        this.OooO0OO = new float[]{0.0f, 1.0f};
    }

    public C0415o0Oo0O0O(int i, int i2, int i3) {
        this.OooO00o = 19;
        this.OooO0O0 = new int[]{i, i2, i3};
        this.OooO0OO = new float[]{0.0f, 0.5f, 1.0f};
    }

    public /* synthetic */ C0415o0Oo0O0O(int i, Object obj) {
        this.OooO00o = i;
        this.OooO0OO = obj;
    }

    public /* synthetic */ C0415o0Oo0O0O(int i, boolean z) {
        this.OooO00o = i;
    }

    public C0415o0Oo0O0O(Animator animator) {
        this.OooO00o = 16;
        this.OooO0O0 = null;
        this.OooO0OO = animator;
    }

    public C0415o0Oo0O0O(Context context, int i) {
        this.OooO00o = i;
        switch (i) {
            case 22:
                this.OooO0O0 = context;
                this.OooO0OO = "image_manager_disk_cache";
                return;
            default:
                TypedArray obtainStyledAttributes = context.obtainStyledAttributes(AbstractC0692o0ooooOo.OoooOo0(context, C0863oO0oOOoo.class.getCanonicalName(), R.attr.materialCalendarStyle).data, AbstractC1038oOOOoo0O.OooOOOo);
                C0455o0OoOo00.OooOo00(context, obtainStyledAttributes.getResourceId(4, 0));
                C0455o0OoOo00.OooOo00(context, obtainStyledAttributes.getResourceId(2, 0));
                C0455o0OoOo00.OooOo00(context, obtainStyledAttributes.getResourceId(3, 0));
                C0455o0OoOo00.OooOo00(context, obtainStyledAttributes.getResourceId(5, 0));
                ColorStateList OooOooO = AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 7);
                this.OooO0O0 = C0455o0OoOo00.OooOo00(context, obtainStyledAttributes.getResourceId(9, 0));
                C0455o0OoOo00.OooOo00(context, obtainStyledAttributes.getResourceId(8, 0));
                this.OooO0OO = C0455o0OoOo00.OooOo00(context, obtainStyledAttributes.getResourceId(10, 0));
                new Paint().setColor(OooOooO.getDefaultColor());
                obtainStyledAttributes.recycle();
                return;
        }
    }

    public C0415o0Oo0O0O(Animation animation) {
        this.OooO00o = 16;
        this.OooO0O0 = animation;
        this.OooO0OO = null;
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [android.text.Editable$Factory, com.ninja.engine.o0Ooo0] */
    public C0415o0Oo0O0O(EditText editText, int i) {
        this.OooO00o = i;
        switch (i) {
            case 14:
                this.OooO0O0 = editText;
                C0465o0Ooo c0465o0Ooo = new C0465o0Ooo(editText);
                this.OooO0OO = c0465o0Ooo;
                editText.addTextChangedListener(c0465o0Ooo);
                if (C0466o0Ooo0.OooO0O0 == null) {
                    synchronized (C0466o0Ooo0.OooO00o) {
                        try {
                            if (C0466o0Ooo0.OooO0O0 == null) {
                                Object factory = new Editable.Factory();
                                try {
                                    C0466o0Ooo0.OooO0OO = Class.forName("android.text.DynamicLayout$ChangeWatcher", false, C0466o0Ooo0.class.getClassLoader());
                                } catch (Throwable unused) {
                                }
                                C0466o0Ooo0.OooO0O0 = factory;
                            }
                        } finally {
                        }
                    }
                }
                editText.setEditableFactory(C0466o0Ooo0.OooO0O0);
                return;
            default:
                this.OooO0O0 = editText;
                this.OooO0OO = new C0331o0O0oo(editText);
                return;
        }
    }

    public C0415o0Oo0O0O(ProgressBar progressBar) {
        this.OooO00o = 1;
        this.OooO0O0 = progressBar;
    }

    public C0415o0Oo0O0O(C0131o00O0o c0131o00O0o) {
        this.OooO00o = 26;
        oOO00OOO ooo00ooo = new oOO00OOO(c0131o00O0o);
        this.OooO0OO = new o0OO0oO(1);
        this.OooO0O0 = ooo00ooo;
    }

    public C0415o0Oo0O0O(C0606o0oOoooO c0606o0oOoooO) {
        this.OooO00o = 17;
        this.OooO0O0 = new CopyOnWriteArrayList();
        this.OooO0OO = c0606o0oOoooO;
    }

    public C0415o0Oo0O0O(InterfaceC0760oO0O0o0O interfaceC0760oO0O0o0O, C1467oo0O0OOO c1467oo0O0OOO) {
        C0797oO0OoO00 c0797oO0OoO00;
        this.OooO00o = 25;
        this.OooO0O0 = interfaceC0760oO0O0o0O;
        AbstractC0809oO0OooOO.OooOOOo(c1467oo0O0OOO, "store");
        C0337o0O0ooOO c0337o0O0ooOO = C0337o0O0ooOO.OooO0O0;
        AbstractC0809oO0OooOO.OooOOOo(c0337o0O0ooOO, "defaultCreationExtras");
        String canonicalName = C0797oO0OoO00.class.getCanonicalName();
        if (canonicalName != null) {
            String concat = "androidx.lifecycle.ViewModelProvider.DefaultKey:".concat(canonicalName);
            AbstractC0809oO0OooOO.OooOOOo(concat, "key");
            LinkedHashMap linkedHashMap = c1467oo0O0OOO.OooO00o;
            AbstractC1466oo0O0OO0 abstractC1466oo0O0OO0 = (AbstractC1466oo0O0OO0) linkedHashMap.get(concat);
            if (C0797oO0OoO00.class.isInstance(abstractC1466oo0O0OO0)) {
                AbstractC0809oO0OooOO.OooOOO0(abstractC1466oo0O0OO0, "null cannot be cast to non-null type T of androidx.lifecycle.ViewModelProvider.get");
            } else {
                LinkedHashMap linkedHashMap2 = new LinkedHashMap();
                linkedHashMap2.putAll(c0337o0O0ooOO.OooO00o);
                linkedHashMap2.put(C0455o0OoOo00.OooO, concat);
                try {
                    c0797oO0OoO00 = new C0797oO0OoO00();
                } catch (AbstractMethodError unused) {
                    c0797oO0OoO00 = new C0797oO0OoO00();
                }
                abstractC1466oo0O0OO0 = c0797oO0OoO00;
                AbstractC1466oo0O0OO0 abstractC1466oo0O0OO02 = (AbstractC1466oo0O0OO0) linkedHashMap.put(concat, abstractC1466oo0O0OO0);
                if (abstractC1466oo0O0OO02 != null) {
                    abstractC1466oo0O0OO02.OooO00o();
                }
            }
            this.OooO0OO = (C0797oO0OoO00) abstractC1466oo0O0OO0;
            return;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }

    public C0415o0Oo0O0O(C0919oOO00oOo c0919oOO00oOo) {
        this.OooO00o = 24;
        this.OooO0O0 = new HashMap();
        this.OooO0OO = c0919oOO00oOo;
    }

    public /* synthetic */ C0415o0Oo0O0O(Object obj, int i, Object obj2) {
        this.OooO00o = i;
        this.OooO0OO = obj;
        this.OooO0O0 = obj2;
    }

    public /* synthetic */ C0415o0Oo0O0O(Object obj, Object obj2, int i, boolean z) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
    }

    public C0415o0Oo0O0O(ArrayList arrayList, ArrayList arrayList2) {
        this.OooO00o = 19;
        int size = arrayList.size();
        this.OooO0O0 = new int[size];
        this.OooO0OO = new float[size];
        for (int i = 0; i < size; i++) {
            ((int[]) this.OooO0O0)[i] = ((Integer) arrayList.get(i)).intValue();
            ((float[]) this.OooO0OO)[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }
}

