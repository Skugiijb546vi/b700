package com.ninja.engine;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.graphics.PorterDuff;
import android.util.AttributeSet;
import android.util.Xml;
import android.view.InflateException;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.SubMenu;
import java.io.IOException;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: com.ninja.engine.oOoo0OOO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1271oOoo0OOO extends MenuInflater {
    public static final Class[] OooO0o;
    public static final Class[] OooO0o0;
    public final Object[] OooO00o;
    public final Object[] OooO0O0;
    public final Context OooO0OO;
    public Object OooO0Oo;

    static {
        Class[] clsArr = {Context.class};
        OooO0o0 = clsArr;
        OooO0o = clsArr;
    }

    public C1271oOoo0OOO(Context context) {
        super(context);
        this.OooO0OO = context;
        Object[] objArr = {context};
        this.OooO00o = objArr;
        this.OooO0O0 = objArr;
    }

    public static Object OooO00o(Context context) {
        if (context instanceof Activity) {
            return context;
        }
        if (context instanceof ContextWrapper) {
            return OooO00o(((ContextWrapper) context).getBaseContext());
        }
        return context;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r4v62 */
    public final void OooO0O0(XmlResourceParser xmlResourceParser, AttributeSet attributeSet, Menu menu) {
        ?? r4;
        int i;
        char charAt;
        char charAt2;
        int i2;
        ActionProvider$VisibilityListenerC0888oO0ooO actionProvider$VisibilityListenerC0888oO0ooO;
        PorterDuff.Mode mode;
        ColorStateList colorStateList;
        int resourceId;
        C1269oOoo0OO c1269oOoo0OO = new C1269oOoo0OO(this, menu);
        int eventType = xmlResourceParser.getEventType();
        while (true) {
            r4 = 1;
            i = 2;
            if (eventType == 2) {
                String name = xmlResourceParser.getName();
                if (name.equals("menu")) {
                    eventType = xmlResourceParser.next();
                } else {
                    throw new RuntimeException("Expecting menu, got ".concat(name));
                }
            } else {
                eventType = xmlResourceParser.next();
                if (eventType == 1) {
                    break;
                }
            }
        }
        boolean z = false;
        boolean z2 = false;
        String str = null;
        while (!z) {
            if (eventType != r4) {
                if (eventType != i) {
                    if (eventType == 3) {
                        String name2 = xmlResourceParser.getName();
                        if (z2 && name2.equals(str)) {
                            z2 = false;
                            str = null;
                        } else if (name2.equals("group")) {
                            c1269oOoo0OO.OooO0O0 = 0;
                            c1269oOoo0OO.OooO0OO = 0;
                            c1269oOoo0OO.OooO0Oo = 0;
                            c1269oOoo0OO.OooO0o0 = 0;
                            c1269oOoo0OO.OooO0o = r4;
                            c1269oOoo0OO.OooO0oO = r4;
                        } else if (name2.equals("item")) {
                            if (!c1269oOoo0OO.OooO0oo) {
                                ActionProvider$VisibilityListenerC0888oO0ooO actionProvider$VisibilityListenerC0888oO0ooO2 = c1269oOoo0OO.OooOoO;
                                if (actionProvider$VisibilityListenerC0888oO0ooO2 != null && actionProvider$VisibilityListenerC0888oO0ooO2.OooO0O0.hasSubMenu()) {
                                    c1269oOoo0OO.OooO0oo = r4;
                                    c1269oOoo0OO.OooO0O0(c1269oOoo0OO.OooO00o.addSubMenu(c1269oOoo0OO.OooO0O0, c1269oOoo0OO.OooO, c1269oOoo0OO.OooOO0, c1269oOoo0OO.OooOO0O).getItem());
                                } else {
                                    c1269oOoo0OO.OooO0oo = r4;
                                    c1269oOoo0OO.OooO0O0(c1269oOoo0OO.OooO00o.add(c1269oOoo0OO.OooO0O0, c1269oOoo0OO.OooO, c1269oOoo0OO.OooOO0, c1269oOoo0OO.OooOO0O));
                                }
                            }
                        } else if (name2.equals("menu")) {
                            z = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = 1;
                        i = 2;
                    }
                } else if (!z2) {
                    String name3 = xmlResourceParser.getName();
                    boolean equals = name3.equals("group");
                    C1271oOoo0OOO c1271oOoo0OOO = c1269oOoo0OO.OooOooo;
                    if (equals) {
                        TypedArray obtainStyledAttributes = c1271oOoo0OOO.OooO0OO.obtainStyledAttributes(attributeSet, AbstractC1039oOOOoo0o.OooOOOo);
                        c1269oOoo0OO.OooO0O0 = obtainStyledAttributes.getResourceId(r4, 0);
                        c1269oOoo0OO.OooO0OO = obtainStyledAttributes.getInt(3, 0);
                        c1269oOoo0OO.OooO0Oo = obtainStyledAttributes.getInt(4, 0);
                        c1269oOoo0OO.OooO0o0 = obtainStyledAttributes.getInt(5, 0);
                        c1269oOoo0OO.OooO0o = obtainStyledAttributes.getBoolean(2, r4);
                        c1269oOoo0OO.OooO0oO = obtainStyledAttributes.getBoolean(0, r4);
                        obtainStyledAttributes.recycle();
                    } else if (name3.equals("item")) {
                        Context context = c1271oOoo0OOO.OooO0OO;
                        TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(attributeSet, AbstractC1039oOOOoo0o.OooOOo0);
                        c1269oOoo0OO.OooO = obtainStyledAttributes2.getResourceId(2, 0);
                        c1269oOoo0OO.OooOO0 = (obtainStyledAttributes2.getInt(5, c1269oOoo0OO.OooO0OO) & (-65536)) | (obtainStyledAttributes2.getInt(6, c1269oOoo0OO.OooO0Oo) & 65535);
                        c1269oOoo0OO.OooOO0O = obtainStyledAttributes2.getText(7);
                        c1269oOoo0OO.OooOO0o = obtainStyledAttributes2.getText(8);
                        c1269oOoo0OO.OooOOO0 = obtainStyledAttributes2.getResourceId(0, 0);
                        String string = obtainStyledAttributes2.getString(9);
                        if (string == null) {
                            charAt = 0;
                        } else {
                            charAt = string.charAt(0);
                        }
                        c1269oOoo0OO.OooOOO = charAt;
                        c1269oOoo0OO.OooOOOO = obtainStyledAttributes2.getInt(16, 4096);
                        String string2 = obtainStyledAttributes2.getString(10);
                        if (string2 == null) {
                            charAt2 = 0;
                        } else {
                            charAt2 = string2.charAt(0);
                        }
                        c1269oOoo0OO.OooOOOo = charAt2;
                        c1269oOoo0OO.OooOOo0 = obtainStyledAttributes2.getInt(20, 4096);
                        if (obtainStyledAttributes2.hasValue(11)) {
                            i2 = obtainStyledAttributes2.getBoolean(11, false);
                        } else {
                            i2 = c1269oOoo0OO.OooO0o0;
                        }
                        c1269oOoo0OO.OooOOo = i2;
                        c1269oOoo0OO.OooOOoo = obtainStyledAttributes2.getBoolean(3, false);
                        c1269oOoo0OO.OooOo00 = obtainStyledAttributes2.getBoolean(4, c1269oOoo0OO.OooO0o);
                        c1269oOoo0OO.OooOo0 = obtainStyledAttributes2.getBoolean(1, c1269oOoo0OO.OooO0oO);
                        c1269oOoo0OO.OooOo0O = obtainStyledAttributes2.getInt(21, -1);
                        c1269oOoo0OO.OooOoO0 = obtainStyledAttributes2.getString(12);
                        c1269oOoo0OO.OooOo0o = obtainStyledAttributes2.getResourceId(13, 0);
                        c1269oOoo0OO.OooOo = obtainStyledAttributes2.getString(15);
                        String string3 = obtainStyledAttributes2.getString(14);
                        if (string3 != null && c1269oOoo0OO.OooOo0o == 0 && c1269oOoo0OO.OooOo == null) {
                            actionProvider$VisibilityListenerC0888oO0ooO = (ActionProvider$VisibilityListenerC0888oO0ooO) c1269oOoo0OO.OooO00o(string3, OooO0o, c1271oOoo0OOO.OooO0O0);
                        } else {
                            actionProvider$VisibilityListenerC0888oO0ooO = null;
                        }
                        c1269oOoo0OO.OooOoO = actionProvider$VisibilityListenerC0888oO0ooO;
                        c1269oOoo0OO.OooOoOO = obtainStyledAttributes2.getText(17);
                        c1269oOoo0OO.OooOoo0 = obtainStyledAttributes2.getText(22);
                        if (obtainStyledAttributes2.hasValue(19)) {
                            mode = AbstractC0420o0Oo0Oo.OooO0O0(obtainStyledAttributes2.getInt(19, -1), c1269oOoo0OO.OooOooO);
                        } else {
                            mode = null;
                        }
                        c1269oOoo0OO.OooOooO = mode;
                        if (obtainStyledAttributes2.hasValue(18)) {
                            if (!obtainStyledAttributes2.hasValue(18) || (resourceId = obtainStyledAttributes2.getResourceId(18, 0)) == 0 || (colorStateList = AbstractC0809oO0OooOO.OooOoo(context, resourceId)) == null) {
                                colorStateList = obtainStyledAttributes2.getColorStateList(18);
                            }
                            c1269oOoo0OO.OooOoo = colorStateList;
                        } else {
                            c1269oOoo0OO.OooOoo = null;
                        }
                        obtainStyledAttributes2.recycle();
                        c1269oOoo0OO.OooO0oo = false;
                    } else {
                        if (name3.equals("menu")) {
                            c1269oOoo0OO.OooO0oo = true;
                            SubMenu addSubMenu = c1269oOoo0OO.OooO00o.addSubMenu(c1269oOoo0OO.OooO0O0, c1269oOoo0OO.OooO, c1269oOoo0OO.OooOO0, c1269oOoo0OO.OooOO0O);
                            c1269oOoo0OO.OooO0O0(addSubMenu.getItem());
                            OooO0O0(xmlResourceParser, attributeSet, addSubMenu);
                        } else {
                            str = name3;
                            z2 = true;
                        }
                        eventType = xmlResourceParser.next();
                        r4 = 1;
                        i = 2;
                    }
                }
                eventType = xmlResourceParser.next();
                r4 = 1;
                i = 2;
            } else {
                throw new RuntimeException("Unexpected end of document");
            }
        }
    }

    @Override // android.view.MenuInflater
    public final void inflate(int i, Menu menu) {
        if (!(menu instanceof MenuC0887oO0oo0oo)) {
            super.inflate(i, menu);
            return;
        }
        XmlResourceParser xmlResourceParser = null;
        boolean z = false;
        try {
            try {
                xmlResourceParser = this.OooO0OO.getResources().getLayout(i);
                AttributeSet asAttributeSet = Xml.asAttributeSet(xmlResourceParser);
                if (menu instanceof MenuC0887oO0oo0oo) {
                    MenuC0887oO0oo0oo menuC0887oO0oo0oo = (MenuC0887oO0oo0oo) menu;
                    if (!menuC0887oO0oo0oo.OooOOOo) {
                        menuC0887oO0oo0oo.OooOo0o();
                        z = true;
                    }
                }
                OooO0O0(xmlResourceParser, asAttributeSet, menu);
                if (z) {
                    ((MenuC0887oO0oo0oo) menu).OooOo0O();
                }
                xmlResourceParser.close();
            } catch (IOException e) {
                throw new InflateException("Error inflating menu XML", e);
            } catch (XmlPullParserException e2) {
                throw new InflateException("Error inflating menu XML", e2);
            }
        } catch (Throwable th) {
            if (z) {
                ((MenuC0887oO0oo0oo) menu).OooOo0O();
            }
            if (xmlResourceParser != null) {
                xmlResourceParser.close();
            }
            throw th;
        }
    }
}
