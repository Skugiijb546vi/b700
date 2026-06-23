package com.ninja.engine;

import android.content.ClipDescription;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Typeface;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Bundle;
import android.os.ParcelFileDescriptor;
import android.os.Trace;
import android.text.Editable;
import android.text.Selection;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.util.TypedValue;
import android.view.Choreographer;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import androidx.recyclerview.widget.RecyclerView;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import com.ninja.engine.view.update.UpdateRequiredActivity;
import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
import java.util.WeakHashMap;
import java.util.concurrent.CopyOnWriteArrayList;
/* renamed from: com.ninja.engine.o00O0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0131o00O0o implements InterfaceC1134oOOooo0, oOOOO0O0, InterfaceC0721oO00OoOo, InterfaceC0965oOO0ooo {
    public static final Object OooO0o = new Object();
    public static volatile C0131o00O0o OooO0o0;
    public static C0131o00O0o OooO0oO;
    public final /* synthetic */ int OooO00o;
    public Object OooO0O0;
    public Object OooO0OO;
    public Object OooO0Oo;

    public /* synthetic */ C0131o00O0o(int i) {
        this.OooO00o = i;
    }

    public static boolean OooOOO0(Editable editable, KeyEvent keyEvent, boolean z) {
        C1375oo000o0O[] c1375oo000o0OArr;
        if (!KeyEvent.metaStateHasNoModifiers(keyEvent.getMetaState())) {
            return false;
        }
        int selectionStart = Selection.getSelectionStart(editable);
        int selectionEnd = Selection.getSelectionEnd(editable);
        if (selectionStart != -1 && selectionEnd != -1 && selectionStart == selectionEnd && (c1375oo000o0OArr = (C1375oo000o0O[]) editable.getSpans(selectionStart, selectionEnd, C1375oo000o0O.class)) != null && c1375oo000o0OArr.length > 0) {
            for (C1375oo000o0O c1375oo000o0O : c1375oo000o0OArr) {
                int spanStart = editable.getSpanStart(c1375oo000o0O);
                int spanEnd = editable.getSpanEnd(c1375oo000o0O);
                if ((z && spanStart == selectionStart) || ((!z && spanEnd == selectionStart) || (selectionStart > spanStart && selectionStart < spanEnd))) {
                    editable.delete(spanStart, spanEnd);
                    return true;
                }
            }
        }
        return false;
    }

    public static C0131o00O0o OooOoo0(Context context) {
        if (OooO0o0 == null) {
            synchronized (OooO0o) {
                try {
                    if (OooO0o0 == null) {
                        OooO0o0 = new C0131o00O0o(context);
                    }
                } finally {
                }
            }
        }
        return OooO0o0;
    }

    public static C0131o00O0o Oooo0O0(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2) {
        return new C0131o00O0o(context, context.obtainStyledAttributes(attributeSet, iArr, i, i2));
    }

    @Override // com.ninja.engine.oOOOO0O0
    public Object OooO() {
        Object OooO = ((oOOOO0O0) this.OooO0Oo).OooO();
        if (OooO == null) {
            OooO = ((InterfaceC0526o0o0O0) this.OooO0O0).OooOOO();
            if (Log.isLoggable("FactoryPools", 2)) {
                OooO.getClass().toString();
            }
        }
        if (OooO instanceof InterfaceC0532o0o0O0O0) {
            ((InterfaceC0532o0o0O0O0) OooO).OooO0OO().OooO00o = false;
        }
        return OooO;
    }

    @Override // com.ninja.engine.InterfaceC0965oOO0ooo
    public void OooO00o() {
        UpdateRequiredActivity updateRequiredActivity = (UpdateRequiredActivity) this.OooO0O0;
        updateRequiredActivity.runOnUiThread(new RunnableC0090o000OoOO(updateRequiredActivity, 9, (Button) this.OooO0Oo));
    }

    @Override // com.ninja.engine.InterfaceC0721oO00OoOo
    public ClipDescription OooO0O0() {
        return (ClipDescription) this.OooO0OO;
    }

    @Override // com.ninja.engine.oOOOO0O0
    public boolean OooO0OO(Object obj) {
        if (obj instanceof InterfaceC0532o0o0O0O0) {
            ((InterfaceC0532o0o0O0O0) obj).OooO0OO().OooO00o = true;
        }
        ((C0601o0oOooO0) this.OooO0OO).OooO0oo(obj);
        return ((oOOOO0O0) this.OooO0Oo).OooO0OO(obj);
    }

    @Override // com.ninja.engine.InterfaceC0721oO00OoOo
    public Object OooO0Oo() {
        return null;
    }

    @Override // com.ninja.engine.InterfaceC0965oOO0ooo
    public void OooO0o() {
        UpdateRequiredActivity updateRequiredActivity = (UpdateRequiredActivity) this.OooO0O0;
        updateRequiredActivity.runOnUiThread(new RunnableC0564o0oOO0Oo(updateRequiredActivity, (File) this.OooO0OO, (Button) this.OooO0Oo, 2));
    }

    @Override // com.ninja.engine.InterfaceC0721oO00OoOo
    public Uri OooO0o0() {
        return (Uri) this.OooO0O0;
    }

    @Override // com.ninja.engine.InterfaceC0721oO00OoOo
    public Uri OooO0oo() {
        return (Uri) this.OooO0Oo;
    }

    public void OooOO0(View view, int i, boolean z) {
        int OooOoo;
        C1060oOOo0O0 c1060oOOo0O0 = (C1060oOOo0O0) this.OooO0O0;
        if (i < 0) {
            OooOoo = c1060oOOo0O0.OooO00o.getChildCount();
        } else {
            OooOoo = OooOoo(i);
        }
        ((o0O000o0) this.OooO0OO).OooO0o0(OooOoo, z);
        if (z) {
            Oooo00O(view);
        }
        c1060oOOo0O0.OooO00o.addView(view, OooOoo);
        RecyclerView.Oooo0(view);
    }

    public void OooOO0O(View view, int i, ViewGroup.LayoutParams layoutParams, boolean z) {
        int OooOoo;
        C1060oOOo0O0 c1060oOOo0O0 = (C1060oOOo0O0) this.OooO0O0;
        if (i < 0) {
            OooOoo = c1060oOOo0O0.OooO00o.getChildCount();
        } else {
            OooOoo = OooOoo(i);
        }
        ((o0O000o0) this.OooO0OO).OooO0o0(OooOoo, z);
        if (z) {
            Oooo00O(view);
        }
        c1060oOOo0O0.getClass();
        AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(view);
        RecyclerView recyclerView = c1060oOOo0O0.OooO00o;
        if (Oooo0 != null) {
            if (!Oooo0.OooOOO0() && !Oooo0.OooOOo()) {
                throw new IllegalArgumentException("Called attach on a child which is not detached: " + Oooo0 + recyclerView.OooOoO0());
            }
            Oooo0.OooOO0 &= -257;
        }
        recyclerView.publicAttachViewToParent(view, OooOoo, layoutParams);
    }

    public Bitmap OooOO0o(BitmapFactory.Options options) {
        switch (this.OooO00o) {
            case 13:
                return BitmapFactory.decodeStream(new C0239o00oOo0O(AbstractC0242o00oOoO0.OooO0OO((ByteBuffer) this.OooO0O0)), null, options);
            case 14:
                C1057oOOo00oO c1057oOOo00oO = (C1057oOOo00oO) ((o00O) this.OooO0O0).OooO0O0;
                c1057oOOo00oO.reset();
                return BitmapFactory.decodeStream(c1057oOOo00oO, null, options);
            default:
                return BitmapFactory.decodeFileDescriptor(((com.bumptech.glide.load.data.OooO00o) this.OooO0Oo).OooO00o().getFileDescriptor(), null, options);
        }
    }

    public void OooOOO(int i) {
        AbstractC1083oOOoO0o Oooo0;
        int OooOoo = OooOoo(i);
        ((o0O000o0) this.OooO0OO).OooO0o(OooOoo);
        RecyclerView recyclerView = ((C1060oOOo0O0) this.OooO0O0).OooO00o;
        View childAt = recyclerView.getChildAt(OooOoo);
        if (childAt != null && (Oooo0 = RecyclerView.Oooo0(childAt)) != null) {
            if (Oooo0.OooOOO0() && !Oooo0.OooOOo()) {
                throw new IllegalArgumentException("called detach on an already detached child " + Oooo0 + recyclerView.OooOoO0());
            }
            Oooo0.OooO0O0(256);
        }
        recyclerView.publicDetachViewFromParent(OooOoo);
    }

    public void OooOOOO(Bundle bundle) {
        HashSet hashSet;
        String string = ((Context) this.OooO0Oo).getString(R.string.androidx_startup);
        if (bundle != null) {
            try {
                HashSet hashSet2 = new HashSet();
                Iterator<String> it = bundle.keySet().iterator();
                while (true) {
                    boolean hasNext = it.hasNext();
                    hashSet = (HashSet) this.OooO0OO;
                    if (!hasNext) {
                        break;
                    }
                    String next = it.next();
                    if (string.equals(bundle.getString(next, null))) {
                        Class<?> cls = Class.forName(next);
                        if (InterfaceC0718oO00OoO.class.isAssignableFrom(cls)) {
                            hashSet.add(cls);
                        }
                    }
                }
                Iterator it2 = hashSet.iterator();
                while (it2.hasNext()) {
                    OooOOOo((Class) it2.next(), hashSet2);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public Object OooOOOo(Class cls, HashSet hashSet) {
        Object obj;
        if (AbstractC1091oOOoOOOO.OooOo0()) {
            try {
                AbstractC1091oOOoOOOO.OooO00o(cls.getSimpleName());
            } catch (Throwable th) {
                Trace.endSection();
                throw th;
            }
        }
        if (!hashSet.contains(cls)) {
            HashMap hashMap = (HashMap) this.OooO0O0;
            if (!hashMap.containsKey(cls)) {
                hashSet.add(cls);
                InterfaceC0718oO00OoO interfaceC0718oO00OoO = null;
                try {
                    interfaceC0718oO00OoO = (InterfaceC0718oO00OoO) cls.getDeclaredConstructor(null).newInstance(null);
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                List<Class> OooO00o = interfaceC0718oO00OoO.OooO00o();
                if (!OooO00o.isEmpty()) {
                    for (Class cls2 : OooO00o) {
                        if (!hashMap.containsKey(cls2)) {
                            OooOOOo(cls2, hashSet);
                        }
                    }
                }
                obj = interfaceC0718oO00OoO.OooO0O0((Context) this.OooO0Oo);
                hashSet.remove(cls);
                hashMap.put(cls, obj);
            } else {
                obj = hashMap.get(cls);
            }
            Trace.endSection();
            return obj;
        }
        String name = cls.getName();
        throw new IllegalStateException("Cannot initialize " + name + ". Cycle detected.");
    }

    @Override // com.ninja.engine.InterfaceC1134oOOooo0
    public InterfaceC1108oOOoo OooOOo(InterfaceC1108oOOoo interfaceC1108oOOoo, C0973oOOO00o c0973oOOO00o) {
        Object obj;
        Drawable drawable = (Drawable) interfaceC1108oOOoo.get();
        if (drawable instanceof BitmapDrawable) {
            interfaceC1108oOOoo = C0207o00o0OOo.OooO0OO(((BitmapDrawable) drawable).getBitmap(), (InterfaceC0206o00o0OOO) this.OooO0O0);
            obj = this.OooO0OO;
        } else if (drawable instanceof C0680o0oooOO) {
            obj = this.OooO0Oo;
        } else {
            return null;
        }
        return ((InterfaceC1134oOOooo0) obj).OooOOo(interfaceC1108oOOoo, c0973oOOO00o);
    }

    public void OooOOo0(FileOutputStream fileOutputStream) {
        if (fileOutputStream == null) {
            return;
        }
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused2) {
        }
        File file = (File) this.OooO0OO;
        if (!file.delete()) {
            Objects.toString(file);
        }
    }

    public void OooOOoo(FileOutputStream fileOutputStream) {
        try {
            fileOutputStream.getFD().sync();
        } catch (IOException unused) {
        }
        try {
            fileOutputStream.close();
        } catch (IOException unused2) {
        }
        File file = (File) this.OooO0OO;
        File file2 = (File) this.OooO0O0;
        if (file2.isDirectory() && !file2.delete()) {
            file2.toString();
        }
        if (!file.renameTo(file2)) {
            file.toString();
            file2.toString();
        }
    }

    public Drawable OooOo(int i) {
        int resourceId;
        Drawable OooO0oO2;
        if (((TypedArray) this.OooO0O0).hasValue(i) && (resourceId = ((TypedArray) this.OooO0O0).getResourceId(i, 0)) != 0) {
            C0113o000oo0O OooO00o = C0113o000oo0O.OooO00o();
            Context context = (Context) this.OooO0Oo;
            synchronized (OooO00o) {
                OooO0oO2 = OooO00o.OooO00o.OooO0oO(context, resourceId, true);
            }
            return OooO0oO2;
        }
        return null;
    }

    public int OooOo0() {
        return ((C1060oOOo0O0) this.OooO0O0).OooO00o.getChildCount() - ((ArrayList) this.OooO0Oo).size();
    }

    public View OooOo00(int i) {
        return ((C1060oOOo0O0) this.OooO0O0).OooO00o.getChildAt(OooOoo(i));
    }

    public ColorStateList OooOo0O(int i) {
        int resourceId;
        ColorStateList OooOoo;
        TypedArray typedArray = (TypedArray) this.OooO0O0;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0 && (OooOoo = AbstractC0809oO0OooOO.OooOoo((Context) this.OooO0Oo, resourceId)) != null) {
            return OooOoo;
        }
        return typedArray.getColorStateList(i);
    }

    public Drawable OooOo0o(int i) {
        int resourceId;
        TypedArray typedArray = (TypedArray) this.OooO0O0;
        if (typedArray.hasValue(i) && (resourceId = typedArray.getResourceId(i, 0)) != 0) {
            return AbstractC0692o0ooooOo.OooOo0((Context) this.OooO0Oo, resourceId);
        }
        return typedArray.getDrawable(i);
    }

    public int OooOoO() throws Exception {
        switch (this.OooO00o) {
            case 13:
                ByteBuffer OooO0OO = AbstractC0242o00oOoO0.OooO0OO((ByteBuffer) this.OooO0O0);
                C0836oO0o0oO0 c0836oO0o0oO0 = (C0836oO0o0oO0) this.OooO0Oo;
                if (OooO0OO == null) {
                    return -1;
                }
                List list = (List) this.OooO0OO;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    try {
                        int OooO0O0 = ((oO00Oo00) list.get(i)).OooO0O0(OooO0OO, c0836oO0o0oO0);
                        if (OooO0O0 != -1) {
                            return OooO0O0;
                        }
                    } finally {
                        AbstractC0242o00oOoO0.OooO0OO(OooO0OO);
                    }
                }
                return -1;
            case 14:
                C1057oOOo00oO c1057oOOo00oO = (C1057oOOo00oO) ((o00O) this.OooO0O0).OooO0O0;
                c1057oOOo00oO.reset();
                return AbstractC0692o0ooooOo.OooOo((List) this.OooO0Oo, c1057oOOo00oO, (C0836oO0o0oO0) this.OooO0OO);
            default:
                com.bumptech.glide.load.data.OooO00o oooO00o = (com.bumptech.glide.load.data.OooO00o) this.OooO0Oo;
                C0836oO0o0oO0 c0836oO0o0oO02 = (C0836oO0o0oO0) this.OooO0O0;
                List list2 = (List) this.OooO0OO;
                int size2 = list2.size();
                for (int i2 = 0; i2 < size2; i2++) {
                    oO00Oo00 oo00oo00 = (oO00Oo00) list2.get(i2);
                    C1057oOOo00oO c1057oOOo00oO2 = null;
                    try {
                        c1057oOOo00oO2 = new C1057oOOo00oO(new FileInputStream(oooO00o.OooO00o().getFileDescriptor()), c0836oO0o0oO02);
                        int OooO0OO2 = oo00oo00.OooO0OO(c1057oOOo00oO2, c0836oO0o0oO02);
                        c1057oOOo00oO2.OooO0O0();
                        oooO00o.OooO00o();
                        if (OooO0OO2 != -1) {
                            return OooO0OO2;
                        }
                    } catch (Throwable th) {
                        if (c1057oOOo00oO2 != null) {
                            c1057oOOo00oO2.OooO0O0();
                        }
                        oooO00o.OooO00o();
                        throw th;
                    }
                }
                return -1;
        }
    }

    public Typeface OooOoO0(int i, int i2, o00O0O00 o00o0o00) {
        int resourceId = ((TypedArray) this.OooO0O0).getResourceId(i, 0);
        if (resourceId == 0) {
            return null;
        }
        if (((TypedValue) this.OooO0OO) == null) {
            this.OooO0OO = new TypedValue();
        }
        TypedValue typedValue = (TypedValue) this.OooO0OO;
        ThreadLocal threadLocal = AbstractC1139oOOoooOO.OooO00o;
        Context context = (Context) this.OooO0Oo;
        if (context.isRestricted()) {
            return null;
        }
        return AbstractC1139oOOoooOO.OooO0OO(context, resourceId, typedValue, i2, o00o0o00, true, false);
    }

    public ImageHeaderParser$ImageType OooOoOO() throws Exception {
        switch (this.OooO00o) {
            case 13:
                return AbstractC0692o0ooooOo.OooOooO((List) this.OooO0OO, AbstractC0242o00oOoO0.OooO0OO((ByteBuffer) this.OooO0O0));
            case 14:
                C1057oOOo00oO c1057oOOo00oO = (C1057oOOo00oO) ((o00O) this.OooO0O0).OooO0O0;
                c1057oOOo00oO.reset();
                return AbstractC0692o0ooooOo.OooOoo((List) this.OooO0Oo, c1057oOOo00oO, (C0836oO0o0oO0) this.OooO0OO);
            default:
                com.bumptech.glide.load.data.OooO00o oooO00o = (com.bumptech.glide.load.data.OooO00o) this.OooO0Oo;
                C0836oO0o0oO0 c0836oO0o0oO0 = (C0836oO0o0oO0) this.OooO0O0;
                List list = (List) this.OooO0OO;
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    oO00Oo00 oo00oo00 = (oO00Oo00) list.get(i);
                    C1057oOOo00oO c1057oOOo00oO2 = null;
                    try {
                        c1057oOOo00oO2 = new C1057oOOo00oO(new FileInputStream(oooO00o.OooO00o().getFileDescriptor()), c0836oO0o0oO0);
                        ImageHeaderParser$ImageType OooO0Oo = oo00oo00.OooO0Oo(c1057oOOo00oO2);
                        c1057oOOo00oO2.OooO0O0();
                        oooO00o.OooO00o();
                        if (OooO0Oo != ImageHeaderParser$ImageType.UNKNOWN) {
                            return OooO0Oo;
                        }
                    } catch (Throwable th) {
                        if (c1057oOOo00oO2 != null) {
                            c1057oOOo00oO2.OooO0O0();
                        }
                        oooO00o.OooO00o();
                        throw th;
                    }
                }
                return ImageHeaderParser$ImageType.UNKNOWN;
        }
    }

    public int OooOoo(int i) {
        if (i < 0) {
            return -1;
        }
        int childCount = ((C1060oOOo0O0) this.OooO0O0).OooO00o.getChildCount();
        int i2 = i;
        while (i2 < childCount) {
            o0O000o0 o0o000o0 = (o0O000o0) this.OooO0OO;
            int OooO0O0 = i - (i2 - o0o000o0.OooO0O0(i2));
            if (OooO0O0 == 0) {
                while (o0o000o0.OooO0Oo(i2)) {
                    i2++;
                }
                return i2;
            }
            i2 += OooO0O0;
        }
        return -1;
    }

    public View OooOooO(int i) {
        return ((C1060oOOo0O0) this.OooO0O0).OooO00o.getChildAt(i);
    }

    public int OooOooo() {
        return ((C1060oOOo0O0) this.OooO0O0).OooO00o.getChildCount();
    }

    public boolean Oooo0(int i, o0O0o000 o0o0o000, C0316o0O0o0o c0316o0O0o0o) {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        int[] iArr = c0316o0O0o0o.o00o0O;
        int i2 = iArr[0];
        C0189o00o00 c0189o00o00 = (C0189o00o00) this.OooO0OO;
        c0189o00o00.OooO00o = i2;
        c0189o00o00.OooO0O0 = iArr[1];
        c0189o00o00.OooO0OO = c0316o0O0o0o.OooOOo0();
        c0189o00o00.OooO0Oo = c0316o0O0o0o.OooOO0O();
        c0189o00o00.OooO = false;
        c0189o00o00.OooOO0 = i;
        if (c0189o00o00.OooO00o == 3) {
            z = true;
        } else {
            z = false;
        }
        if (c0189o00o00.OooO0O0 == 3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z && c0316o0O0o0o.OoooOOO > 0.0f) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z2 && c0316o0O0o0o.OoooOOO > 0.0f) {
            z4 = true;
        } else {
            z4 = false;
        }
        int[] iArr2 = c0316o0O0o0o.OooOo00;
        if (z3 && iArr2[0] == 4) {
            c0189o00o00.OooO00o = 1;
        }
        if (z4 && iArr2[1] == 4) {
            c0189o00o00.OooO0O0 = 1;
        }
        o0o0o000.OooO0O0(c0316o0O0o0o, c0189o00o00);
        c0316o0O0o0o.Oooo0oo(c0189o00o00.OooO0o0);
        c0316o0O0o0o.Oooo0o0(c0189o00o00.OooO0o);
        c0316o0O0o0o.OooOooo = c0189o00o00.OooO0oo;
        c0316o0O0o0o.Oooo0(c0189o00o00.OooO0oO);
        c0189o00o00.OooOO0 = 0;
        return c0189o00o00.OooO;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x00bd, code lost:
        if (r6 >= r7) goto L9;
     */
    /* JADX WARN: Removed duplicated region for block: B:50:0x010b  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x010e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public boolean Oooo000(java.lang.CharSequence r10, int r11, int r12, com.ninja.engine.C1373oo000o0 r13) {
        /*
            Method dump skipped, instructions count: 283
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ninja.engine.C0131o00O0o.Oooo000(java.lang.CharSequence, int, int, com.ninja.engine.oo000o0):boolean");
    }

    public void Oooo00O(View view) {
        ((ArrayList) this.OooO0Oo).add(view);
        C1060oOOo0O0 c1060oOOo0O0 = (C1060oOOo0O0) this.OooO0O0;
        c1060oOOo0O0.getClass();
        AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(view);
        if (Oooo0 != null) {
            int i = Oooo0.OooOOo0;
            View view2 = Oooo0.OooO00o;
            if (i != -1) {
                Oooo0.OooOOOo = i;
            } else {
                WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                Oooo0.OooOOOo = view2.getImportantForAccessibility();
            }
            RecyclerView recyclerView = c1060oOOo0O0.OooO00o;
            if (recyclerView.Oooo0o0()) {
                Oooo0.OooOOo0 = 4;
                recyclerView.o00Ooo.add(Oooo0);
                return;
            }
            WeakHashMap weakHashMap2 = AbstractC1460oo0O00oo.OooO00o;
            view2.setImportantForAccessibility(4);
        }
    }

    public boolean Oooo00o(View view) {
        return ((ArrayList) this.OooO0Oo).contains(view);
    }

    public Object Oooo0OO(CharSequence charSequence, int i, int i2, int i3, boolean z, InterfaceC0473o0Ooo0Oo interfaceC0473o0Ooo0Oo) {
        C0902oOO0000o c0902oOO0000o;
        char c;
        C0902oOO0000o c0902oOO0000o2 = null;
        C0475o0Ooo0o0 c0475o0Ooo0o0 = new C0475o0Ooo0o0((C0902oOO0000o) ((oOO00OOO) this.OooO0OO).OooO0OO, false, null);
        int i4 = i;
        int codePointAt = Character.codePointAt(charSequence, i);
        int i5 = 0;
        boolean z2 = true;
        int i6 = i4;
        while (i6 < i2 && i5 < i3 && z2) {
            SparseArray sparseArray = c0475o0Ooo0o0.OooO0OO.OooO00o;
            if (sparseArray == null) {
                c0902oOO0000o = c0902oOO0000o2;
            } else {
                c0902oOO0000o = (C0902oOO0000o) sparseArray.get(codePointAt);
            }
            if (c0475o0Ooo0o0.OooO00o != 2) {
                if (c0902oOO0000o == null) {
                    c0475o0Ooo0o0.OooO00o();
                    c = 1;
                } else {
                    c0475o0Ooo0o0.OooO00o = 2;
                    c0475o0Ooo0o0.OooO0OO = c0902oOO0000o;
                    c0475o0Ooo0o0.OooO0o = 1;
                    c = 2;
                }
            } else {
                if (c0902oOO0000o != null) {
                    c0475o0Ooo0o0.OooO0OO = c0902oOO0000o;
                    c0475o0Ooo0o0.OooO0o++;
                } else {
                    if (codePointAt != 65038) {
                        if (codePointAt != 65039) {
                            C0902oOO0000o c0902oOO0000o3 = c0475o0Ooo0o0.OooO0OO;
                            if (c0902oOO0000o3.OooO0O0 != null) {
                                if (c0475o0Ooo0o0.OooO0o == 1) {
                                    if (c0475o0Ooo0o0.OooO0O0()) {
                                        c0902oOO0000o3 = c0475o0Ooo0o0.OooO0OO;
                                    }
                                }
                                c0475o0Ooo0o0.OooO0Oo = c0902oOO0000o3;
                                c0475o0Ooo0o0.OooO00o();
                                c = 3;
                            }
                        }
                    }
                    c0475o0Ooo0o0.OooO00o();
                    c = 1;
                }
                c = 2;
            }
            c0475o0Ooo0o0.OooO0o0 = codePointAt;
            if (c != 1) {
                if (c != 2) {
                    if (c == 3) {
                        if (z || !Oooo000(charSequence, i4, i6, c0475o0Ooo0o0.OooO0Oo.OooO0O0)) {
                            z2 = interfaceC0473o0Ooo0Oo.OooO0oO(charSequence, i4, i6, c0475o0Ooo0o0.OooO0Oo.OooO0O0);
                            i5++;
                        }
                    }
                } else {
                    int charCount = Character.charCount(codePointAt) + i6;
                    if (charCount < i2) {
                        codePointAt = Character.codePointAt(charSequence, charCount);
                    }
                    i6 = charCount;
                }
                c0902oOO0000o2 = null;
            } else {
                i6 = Character.charCount(Character.codePointAt(charSequence, i4)) + i4;
                if (i6 < i2) {
                    codePointAt = Character.codePointAt(charSequence, i6);
                }
            }
            i4 = i6;
            c0902oOO0000o2 = null;
        }
        if (c0475o0Ooo0o0.OooO00o == 2 && c0475o0Ooo0o0.OooO0OO.OooO0O0 != null && ((c0475o0Ooo0o0.OooO0o > 1 || c0475o0Ooo0o0.OooO0O0()) && i5 < i3 && z2 && (z || !Oooo000(charSequence, i4, i6, c0475o0Ooo0o0.OooO0OO.OooO0O0)))) {
            interfaceC0473o0Ooo0Oo.OooO0oO(charSequence, i4, i6, c0475o0Ooo0o0.OooO0OO.OooO0O0);
        }
        return interfaceC0473o0Ooo0Oo.OooO00o();
    }

    public void Oooo0o(C0580o0oOo0O0 c0580o0oOo0O0, int i, int i2, int i3) {
        c0580o0oOo0O0.getClass();
        int i4 = c0580o0oOo0O0.Ooooo00;
        int i5 = c0580o0oOo0O0.Ooooo0o;
        c0580o0oOo0O0.Ooooo00 = 0;
        c0580o0oOo0O0.Ooooo0o = 0;
        c0580o0oOo0O0.Oooo0oo(i2);
        c0580o0oOo0O0.Oooo0o0(i3);
        if (i4 < 0) {
            c0580o0oOo0O0.Ooooo00 = 0;
        } else {
            c0580o0oOo0O0.Ooooo00 = i4;
        }
        if (i5 < 0) {
            c0580o0oOo0O0.Ooooo0o = 0;
        } else {
            c0580o0oOo0O0.Ooooo0o = i5;
        }
        C0580o0oOo0O0 c0580o0oOo0O02 = (C0580o0oOo0O0) this.OooO0Oo;
        c0580o0oOo0O02.o00oO0O = i;
        c0580o0oOo0O02.OoooOO0();
    }

    public void Oooo0o0() {
        ((TypedArray) this.OooO0O0).recycle();
    }

    public FileOutputStream Oooo0oO() throws IOException {
        File file = (File) this.OooO0OO;
        File file2 = (File) this.OooO0Oo;
        if (file2.exists()) {
            File file3 = (File) this.OooO0O0;
            if (file3.isDirectory() && !file3.delete()) {
                file3.toString();
            }
            if (!file2.renameTo(file3)) {
                file2.toString();
                file3.toString();
            }
        }
        try {
            return new FileOutputStream(file);
        } catch (FileNotFoundException unused) {
            if (file.getParentFile().mkdirs()) {
                try {
                    return new FileOutputStream(file);
                } catch (FileNotFoundException e) {
                    throw new IOException("Failed to create new file " + file, e);
                }
            }
            throw new IOException("Failed to create directory for " + file);
        }
    }

    public void Oooo0oo() {
        switch (this.OooO00o) {
            case 13:
                return;
            case 14:
                C1057oOOo00oO c1057oOOo00oO = (C1057oOOo00oO) ((o00O) this.OooO0O0).OooO0O0;
                synchronized (c1057oOOo00oO) {
                    c1057oOOo00oO.OooO0OO = c1057oOOo00oO.OooO00o.length;
                }
                return;
            default:
                return;
        }
    }

    public void OoooO0(View view) {
        if (((ArrayList) this.OooO0Oo).remove(view)) {
            C1060oOOo0O0 c1060oOOo0O0 = (C1060oOOo0O0) this.OooO0O0;
            c1060oOOo0O0.getClass();
            AbstractC1083oOOoO0o Oooo0 = RecyclerView.Oooo0(view);
            if (Oooo0 != null) {
                int i = Oooo0.OooOOOo;
                RecyclerView recyclerView = c1060oOOo0O0.OooO00o;
                if (recyclerView.Oooo0o0()) {
                    Oooo0.OooOOo0 = i;
                    recyclerView.o00Ooo.add(Oooo0);
                } else {
                    WeakHashMap weakHashMap = AbstractC1460oo0O00oo.OooO00o;
                    Oooo0.OooO00o.setImportantForAccessibility(i);
                }
                Oooo0.OooOOOo = 0;
            }
        }
    }

    public void OoooO0O(C0580o0oOo0O0 c0580o0oOo0O0) {
        ArrayList arrayList = (ArrayList) this.OooO0O0;
        arrayList.clear();
        int size = c0580o0oOo0O0.o00ooo.size();
        for (int i = 0; i < size; i++) {
            C0316o0O0o0o c0316o0O0o0o = (C0316o0O0o0o) c0580o0oOo0O0.o00ooo.get(i);
            int[] iArr = c0316o0O0o0o.o00o0O;
            if (iArr[0] == 3 || iArr[1] == 3) {
                arrayList.add(c0316o0O0o0o);
            }
        }
        c0580o0oOo0O0.o00oO0o.OooO0O0 = true;
    }

    public String toString() {
        switch (this.OooO00o) {
            case 5:
                return ((o0O000o0) this.OooO0OO).toString() + ", hidden list:" + ((ArrayList) this.OooO0Oo).size();
            default:
                return super.toString();
        }
    }

    public C0131o00O0o(Context context) {
        this.OooO00o = 0;
        this.OooO0Oo = context.getApplicationContext();
        this.OooO0OO = new HashSet();
        this.OooO0O0 = new HashMap();
    }

    public C0131o00O0o(Context context, TypedArray typedArray) {
        this.OooO00o = 18;
        this.OooO0Oo = context;
        this.OooO0O0 = typedArray;
    }

    public C0131o00O0o(Context context, LocationManager locationManager) {
        this.OooO00o = 19;
        this.OooO0OO = new Object();
        this.OooO0Oo = context;
        this.OooO0O0 = locationManager;
    }

    public C0131o00O0o(ParcelFileDescriptor parcelFileDescriptor, List list, C0836oO0o0oO0 c0836oO0o0oO0) {
        this.OooO00o = 15;
        AbstractC0694o0ooooo0.OooOO0O(c0836oO0o0oO0, "Argument must not be null");
        this.OooO0O0 = c0836oO0o0oO0;
        AbstractC0694o0ooooo0.OooOO0O(list, "Argument must not be null");
        this.OooO0OO = list;
        this.OooO0Oo = new com.bumptech.glide.load.data.OooO00o(parcelFileDescriptor);
    }

    public C0131o00O0o(o00O o00o) {
        this.OooO00o = 1;
        this.OooO0O0 = o00o;
        this.OooO0OO = Choreographer.getInstance();
        this.OooO0Oo = new o000O0(this);
    }

    public C0131o00O0o(C0580o0oOo0O0 c0580o0oOo0O0) {
        this.OooO00o = 3;
        this.OooO0O0 = new ArrayList();
        this.OooO0OO = new Object();
        this.OooO0Oo = c0580o0oOo0O0;
    }

    public C0131o00O0o(C0496o0o000OO c0496o0o000OO, InterfaceC1124oOOooO0O interfaceC1124oOOooO0O, C0500o0o000oo c0500o0o000oo) {
        this.OooO00o = 10;
        this.OooO0Oo = c0496o0o000OO;
        this.OooO0OO = interfaceC1124oOOooO0O;
        this.OooO0O0 = c0500o0o000oo;
    }

    public C0131o00O0o(C0851oO0oO0oo c0851oO0oO0oo, List list, C0836oO0o0oO0 c0836oO0o0oO0) {
        this.OooO00o = 14;
        AbstractC0694o0ooooo0.OooOO0O(c0836oO0o0oO0, "Argument must not be null");
        this.OooO0OO = c0836oO0o0oO0;
        AbstractC0694o0ooooo0.OooOO0O(list, "Argument must not be null");
        this.OooO0Oo = list;
        this.OooO0O0 = new o00O(c0851oO0oO0oo, c0836oO0o0oO0);
    }

    public C0131o00O0o(oOO00OOO ooo00ooo, C0601o0oOooO0 c0601o0oOooO0, o0OOOO0 o0oooo0, Set set) {
        this.OooO00o = 9;
        this.OooO0O0 = c0601o0oOooO0;
        this.OooO0OO = ooo00ooo;
        this.OooO0Oo = o0oooo0;
        if (set.isEmpty()) {
            return;
        }
        Iterator it = set.iterator();
        while (it.hasNext()) {
            int[] iArr = (int[]) it.next();
            String str = new String(iArr, 0, iArr.length);
            Oooo0OO(str, 0, str.length(), 1, true, new o00O(10, str));
        }
    }

    public C0131o00O0o(C0996oOOOO0Oo c0996oOOOO0Oo, InterfaceC0526o0o0O0 interfaceC0526o0o0O0, C0601o0oOooO0 c0601o0oOooO0) {
        this.OooO00o = 11;
        this.OooO0Oo = c0996oOOOO0Oo;
        this.OooO0O0 = interfaceC0526o0o0O0;
        this.OooO0OO = c0601o0oOooO0;
    }

    public C0131o00O0o(C1060oOOo0O0 c1060oOOo0O0) {
        this.OooO00o = 5;
        this.OooO0O0 = c1060oOOo0O0;
        this.OooO0OO = new o0O000o0();
        this.OooO0Oo = new ArrayList();
    }

    public C0131o00O0o(File file, int i) {
        this.OooO00o = i;
        switch (i) {
            case 12:
                try {
                    RandomAccessFile randomAccessFile = new RandomAccessFile(file, "rw");
                    this.OooO0Oo = randomAccessFile;
                    this.OooO0OO = randomAccessFile.getFD();
                    this.OooO0O0 = new BufferedOutputStream(new FileOutputStream(randomAccessFile.getFD()));
                } catch (Exception e) {
                    throw new RuntimeException(e);
                }
                return;
            default:
                this.OooO0O0 = file;
                this.OooO0OO = new File(file.getPath() + ".new");
                this.OooO0Oo = new File(file.getPath() + ".bak");
                return;
        }
    }

    public /* synthetic */ C0131o00O0o(Object obj, Object obj2, Object obj3, int i) {
        this.OooO00o = i;
        this.OooO0O0 = obj;
        this.OooO0OO = obj2;
        this.OooO0Oo = obj3;
    }

    public C0131o00O0o(Runnable runnable) {
        this.OooO00o = 17;
        this.OooO0Oo = new CopyOnWriteArrayList();
        this.OooO0O0 = new HashMap();
        this.OooO0OO = runnable;
    }

    private final void Oooo() {
    }

    private final void OoooO00() {
    }

    @Override // com.ninja.engine.InterfaceC0721oO00OoOo
    public void OooO0oO() {
    }
}


