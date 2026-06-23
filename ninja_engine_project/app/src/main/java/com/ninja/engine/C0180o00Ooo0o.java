package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.content.res.XmlResourceParser;
import android.os.Build;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.Xml;
import java.io.IOException;
import java.util.Locale;
import org.xmlpull.v1.XmlPullParserException;
/* renamed from: com.ninja.engine.o00Ooo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0180o00Ooo0o {
    public final int OooO;
    public final C0179o00Ooo0O OooO00o;
    public final C0179o00Ooo0O OooO0O0;
    public final float OooO0OO;
    public final float OooO0Oo;
    public final float OooO0o;
    public final float OooO0o0;
    public final float OooO0oO;
    public final float OooO0oo;
    public final int OooOO0;
    public final int OooOO0O;

    /* JADX WARN: Type inference failed for: r2v0, types: [com.ninja.engine.o00Ooo0O, java.lang.Object] */
    public C0180o00Ooo0o(Context context, C0179o00Ooo0O c0179o00Ooo0O) {
        AttributeSet attributeSet;
        int i;
        int i2;
        boolean z;
        int intValue;
        int intValue2;
        int intValue3;
        int intValue4;
        int intValue5;
        int intValue6;
        int intValue7;
        int intValue8;
        int intValue9;
        int intValue10;
        int intValue11;
        int intValue12;
        int intValue13;
        int intValue14;
        int intValue15;
        int intValue16;
        boolean booleanValue;
        Locale locale;
        Locale.Category category;
        int next;
        Object obj = new Object();
        obj.OooO = 255;
        obj.OooOO0O = -2;
        obj.OooOO0o = -2;
        obj.OooOOO0 = -2;
        obj.OooOo00 = Boolean.TRUE;
        this.OooO0O0 = obj;
        int i3 = c0179o00Ooo0O.OooO00o;
        if (i3 != 0) {
            try {
                XmlResourceParser xml = context.getResources().getXml(i3);
                do {
                    next = xml.next();
                    if (next == 2) {
                        break;
                    }
                } while (next != 1);
                if (next == 2) {
                    if (TextUtils.equals(xml.getName(), "badge")) {
                        AttributeSet asAttributeSet = Xml.asAttributeSet(xml);
                        i = asAttributeSet.getStyleAttribute();
                        attributeSet = asAttributeSet;
                    } else {
                        throw new XmlPullParserException("Must have a <" + ((Object) "badge") + "> start tag");
                    }
                } else {
                    throw new XmlPullParserException("No start tag found");
                }
            } catch (IOException | XmlPullParserException e) {
                Resources.NotFoundException notFoundException = new Resources.NotFoundException("Can't load badge resource ID #0x" + Integer.toHexString(i3));
                notFoundException.initCause(e);
                throw notFoundException;
            }
        } else {
            attributeSet = null;
            i = 0;
        }
        if (i == 0) {
            i2 = 2131952637;
        } else {
            i2 = i;
        }
        TypedArray Oooo0OO = AbstractC0692o0ooooOo.Oooo0OO(context, attributeSet, AbstractC1038oOOOoo0O.OooO00o, R.attr.badgeStyle, i2, new int[0]);
        Resources resources = context.getResources();
        this.OooO0OO = Oooo0OO.getDimensionPixelSize(4, -1);
        this.OooO = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_horizontal_edge_offset);
        this.OooOO0 = context.getResources().getDimensionPixelSize(R.dimen.mtrl_badge_text_horizontal_edge_offset);
        this.OooO0Oo = Oooo0OO.getDimensionPixelSize(14, -1);
        this.OooO0o0 = Oooo0OO.getDimension(12, resources.getDimension(R.dimen.m3_badge_size));
        this.OooO0oO = Oooo0OO.getDimension(17, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.OooO0o = Oooo0OO.getDimension(3, resources.getDimension(R.dimen.m3_badge_size));
        this.OooO0oo = Oooo0OO.getDimension(13, resources.getDimension(R.dimen.m3_badge_with_text_size));
        this.OooOO0O = Oooo0OO.getInt(24, 1);
        C0179o00Ooo0O c0179o00Ooo0O2 = this.OooO0O0;
        int i4 = c0179o00Ooo0O.OooO;
        c0179o00Ooo0O2.OooO = i4 == -2 ? 255 : i4;
        int i5 = c0179o00Ooo0O.OooOO0O;
        if (i5 != -2) {
            c0179o00Ooo0O2.OooOO0O = i5;
        } else if (Oooo0OO.hasValue(23)) {
            this.OooO0O0.OooOO0O = Oooo0OO.getInt(23, 0);
        } else {
            this.OooO0O0.OooOO0O = -1;
        }
        String str = c0179o00Ooo0O.OooOO0;
        if (str != null) {
            this.OooO0O0.OooOO0 = str;
        } else if (Oooo0OO.hasValue(7)) {
            this.OooO0O0.OooOO0 = Oooo0OO.getString(7);
        }
        C0179o00Ooo0O c0179o00Ooo0O3 = this.OooO0O0;
        c0179o00Ooo0O3.OooOOOO = c0179o00Ooo0O.OooOOOO;
        CharSequence charSequence = c0179o00Ooo0O.OooOOOo;
        c0179o00Ooo0O3.OooOOOo = charSequence == null ? context.getString(R.string.mtrl_badge_numberless_content_description) : charSequence;
        C0179o00Ooo0O c0179o00Ooo0O4 = this.OooO0O0;
        int i6 = c0179o00Ooo0O.OooOOo0;
        c0179o00Ooo0O4.OooOOo0 = i6 == 0 ? R.plurals.mtrl_badge_content_description : i6;
        int i7 = c0179o00Ooo0O.OooOOo;
        c0179o00Ooo0O4.OooOOo = i7 == 0 ? R.string.mtrl_exceed_max_badge_number_content_description : i7;
        Boolean bool = c0179o00Ooo0O.OooOo00;
        if (bool != null && !bool.booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        c0179o00Ooo0O4.OooOo00 = Boolean.valueOf(z);
        C0179o00Ooo0O c0179o00Ooo0O5 = this.OooO0O0;
        int i8 = c0179o00Ooo0O.OooOO0o;
        c0179o00Ooo0O5.OooOO0o = i8 == -2 ? Oooo0OO.getInt(21, -2) : i8;
        C0179o00Ooo0O c0179o00Ooo0O6 = this.OooO0O0;
        int i9 = c0179o00Ooo0O.OooOOO0;
        c0179o00Ooo0O6.OooOOO0 = i9 == -2 ? Oooo0OO.getInt(22, -2) : i9;
        C0179o00Ooo0O c0179o00Ooo0O7 = this.OooO0O0;
        Integer num = c0179o00Ooo0O.OooO0o0;
        if (num == null) {
            intValue = Oooo0OO.getResourceId(5, 2131951982);
        } else {
            intValue = num.intValue();
        }
        c0179o00Ooo0O7.OooO0o0 = Integer.valueOf(intValue);
        C0179o00Ooo0O c0179o00Ooo0O8 = this.OooO0O0;
        Integer num2 = c0179o00Ooo0O.OooO0o;
        if (num2 == null) {
            intValue2 = Oooo0OO.getResourceId(6, 0);
        } else {
            intValue2 = num2.intValue();
        }
        c0179o00Ooo0O8.OooO0o = Integer.valueOf(intValue2);
        C0179o00Ooo0O c0179o00Ooo0O9 = this.OooO0O0;
        Integer num3 = c0179o00Ooo0O.OooO0oO;
        if (num3 == null) {
            intValue3 = Oooo0OO.getResourceId(15, 2131951982);
        } else {
            intValue3 = num3.intValue();
        }
        c0179o00Ooo0O9.OooO0oO = Integer.valueOf(intValue3);
        C0179o00Ooo0O c0179o00Ooo0O10 = this.OooO0O0;
        Integer num4 = c0179o00Ooo0O.OooO0oo;
        if (num4 == null) {
            intValue4 = Oooo0OO.getResourceId(16, 0);
        } else {
            intValue4 = num4.intValue();
        }
        c0179o00Ooo0O10.OooO0oo = Integer.valueOf(intValue4);
        C0179o00Ooo0O c0179o00Ooo0O11 = this.OooO0O0;
        Integer num5 = c0179o00Ooo0O.OooO0O0;
        if (num5 == null) {
            intValue5 = AbstractC0809oO0OooOO.OooOooO(context, Oooo0OO, 1).getDefaultColor();
        } else {
            intValue5 = num5.intValue();
        }
        c0179o00Ooo0O11.OooO0O0 = Integer.valueOf(intValue5);
        C0179o00Ooo0O c0179o00Ooo0O12 = this.OooO0O0;
        Integer num6 = c0179o00Ooo0O.OooO0Oo;
        if (num6 == null) {
            intValue6 = Oooo0OO.getResourceId(8, 2131952124);
        } else {
            intValue6 = num6.intValue();
        }
        c0179o00Ooo0O12.OooO0Oo = Integer.valueOf(intValue6);
        Integer num7 = c0179o00Ooo0O.OooO0OO;
        if (num7 != null) {
            this.OooO0O0.OooO0OO = num7;
        } else if (Oooo0OO.hasValue(9)) {
            this.OooO0O0.OooO0OO = Integer.valueOf(AbstractC0809oO0OooOO.OooOooO(context, Oooo0OO, 9).getDefaultColor());
        } else {
            int intValue17 = this.OooO0O0.OooO0Oo.intValue();
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(intValue17, AbstractC1038oOOOoo0O.OooOooo);
            obtainStyledAttributes.getDimension(0, 0.0f);
            ColorStateList OooOooO = AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 3);
            AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 4);
            AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 5);
            obtainStyledAttributes.getInt(2, 0);
            obtainStyledAttributes.getInt(1, 1);
            int i10 = obtainStyledAttributes.hasValue(12) ? 12 : 10;
            obtainStyledAttributes.getResourceId(i10, 0);
            obtainStyledAttributes.getString(i10);
            obtainStyledAttributes.getBoolean(14, false);
            AbstractC0809oO0OooOO.OooOooO(context, obtainStyledAttributes, 6);
            obtainStyledAttributes.getFloat(7, 0.0f);
            obtainStyledAttributes.getFloat(8, 0.0f);
            obtainStyledAttributes.getFloat(9, 0.0f);
            obtainStyledAttributes.recycle();
            TypedArray obtainStyledAttributes2 = context.obtainStyledAttributes(intValue17, AbstractC1038oOOOoo0O.OooOo0);
            obtainStyledAttributes2.hasValue(0);
            obtainStyledAttributes2.getFloat(0, 0.0f);
            obtainStyledAttributes2.recycle();
            this.OooO0O0.OooO0OO = Integer.valueOf(OooOooO.getDefaultColor());
        }
        C0179o00Ooo0O c0179o00Ooo0O13 = this.OooO0O0;
        Integer num8 = c0179o00Ooo0O.OooOOoo;
        if (num8 == null) {
            intValue7 = Oooo0OO.getInt(2, 8388661);
        } else {
            intValue7 = num8.intValue();
        }
        c0179o00Ooo0O13.OooOOoo = Integer.valueOf(intValue7);
        C0179o00Ooo0O c0179o00Ooo0O14 = this.OooO0O0;
        Integer num9 = c0179o00Ooo0O.OooOo0;
        if (num9 == null) {
            intValue8 = Oooo0OO.getDimensionPixelSize(11, resources.getDimensionPixelSize(R.dimen.mtrl_badge_long_text_horizontal_padding));
        } else {
            intValue8 = num9.intValue();
        }
        c0179o00Ooo0O14.OooOo0 = Integer.valueOf(intValue8);
        C0179o00Ooo0O c0179o00Ooo0O15 = this.OooO0O0;
        Integer num10 = c0179o00Ooo0O.OooOo0O;
        if (num10 == null) {
            intValue9 = Oooo0OO.getDimensionPixelSize(10, resources.getDimensionPixelSize(R.dimen.m3_badge_with_text_vertical_padding));
        } else {
            intValue9 = num10.intValue();
        }
        c0179o00Ooo0O15.OooOo0O = Integer.valueOf(intValue9);
        C0179o00Ooo0O c0179o00Ooo0O16 = this.OooO0O0;
        Integer num11 = c0179o00Ooo0O.OooOo0o;
        if (num11 == null) {
            intValue10 = Oooo0OO.getDimensionPixelOffset(18, 0);
        } else {
            intValue10 = num11.intValue();
        }
        c0179o00Ooo0O16.OooOo0o = Integer.valueOf(intValue10);
        C0179o00Ooo0O c0179o00Ooo0O17 = this.OooO0O0;
        Integer num12 = c0179o00Ooo0O.OooOo;
        if (num12 == null) {
            intValue11 = Oooo0OO.getDimensionPixelOffset(25, 0);
        } else {
            intValue11 = num12.intValue();
        }
        c0179o00Ooo0O17.OooOo = Integer.valueOf(intValue11);
        C0179o00Ooo0O c0179o00Ooo0O18 = this.OooO0O0;
        Integer num13 = c0179o00Ooo0O.OooOoO0;
        if (num13 == null) {
            intValue12 = Oooo0OO.getDimensionPixelOffset(19, c0179o00Ooo0O18.OooOo0o.intValue());
        } else {
            intValue12 = num13.intValue();
        }
        c0179o00Ooo0O18.OooOoO0 = Integer.valueOf(intValue12);
        C0179o00Ooo0O c0179o00Ooo0O19 = this.OooO0O0;
        Integer num14 = c0179o00Ooo0O.OooOoO;
        if (num14 == null) {
            intValue13 = Oooo0OO.getDimensionPixelOffset(26, c0179o00Ooo0O19.OooOo.intValue());
        } else {
            intValue13 = num14.intValue();
        }
        c0179o00Ooo0O19.OooOoO = Integer.valueOf(intValue13);
        C0179o00Ooo0O c0179o00Ooo0O20 = this.OooO0O0;
        Integer num15 = c0179o00Ooo0O.OooOoo;
        if (num15 == null) {
            intValue14 = Oooo0OO.getDimensionPixelOffset(20, 0);
        } else {
            intValue14 = num15.intValue();
        }
        c0179o00Ooo0O20.OooOoo = Integer.valueOf(intValue14);
        C0179o00Ooo0O c0179o00Ooo0O21 = this.OooO0O0;
        Integer num16 = c0179o00Ooo0O.OooOoOO;
        if (num16 == null) {
            intValue15 = 0;
        } else {
            intValue15 = num16.intValue();
        }
        c0179o00Ooo0O21.OooOoOO = Integer.valueOf(intValue15);
        C0179o00Ooo0O c0179o00Ooo0O22 = this.OooO0O0;
        Integer num17 = c0179o00Ooo0O.OooOoo0;
        if (num17 == null) {
            intValue16 = 0;
        } else {
            intValue16 = num17.intValue();
        }
        c0179o00Ooo0O22.OooOoo0 = Integer.valueOf(intValue16);
        C0179o00Ooo0O c0179o00Ooo0O23 = this.OooO0O0;
        Boolean bool2 = c0179o00Ooo0O.OooOooO;
        if (bool2 == null) {
            booleanValue = Oooo0OO.getBoolean(0, false);
        } else {
            booleanValue = bool2.booleanValue();
        }
        c0179o00Ooo0O23.OooOooO = Boolean.valueOf(booleanValue);
        Oooo0OO.recycle();
        Locale locale2 = c0179o00Ooo0O.OooOOO;
        if (locale2 == null) {
            C0179o00Ooo0O c0179o00Ooo0O24 = this.OooO0O0;
            if (Build.VERSION.SDK_INT >= 24) {
                category = Locale.Category.FORMAT;
                locale = Locale.getDefault(category);
            } else {
                locale = Locale.getDefault();
            }
            c0179o00Ooo0O24.OooOOO = locale;
        } else {
            this.OooO0O0.OooOOO = locale2;
        }
        this.OooO00o = c0179o00Ooo0O;
    }
}

