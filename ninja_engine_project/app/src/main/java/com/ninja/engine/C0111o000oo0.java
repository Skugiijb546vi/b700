package com.ninja.engine;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.LayerDrawable;
/* renamed from: com.ninja.engine.o000oo0  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0111o000oo0 {
    public final int[] OooO00o = {R.drawable.abc_textfield_search_default_mtrl_alpha, R.drawable.abc_textfield_default_mtrl_alpha, R.drawable.abc_ab_share_pack_mtrl_alpha};
    public final int[] OooO0O0 = {R.drawable.abc_ic_commit_search_api_mtrl_alpha, R.drawable.abc_seekbar_tick_mark_material, R.drawable.abc_ic_menu_share_mtrl_alpha, R.drawable.abc_ic_menu_copy_mtrl_am_alpha, R.drawable.abc_ic_menu_cut_mtrl_alpha, R.drawable.abc_ic_menu_selectall_mtrl_alpha, R.drawable.abc_ic_menu_paste_mtrl_am_alpha};
    public final int[] OooO0OO = {R.drawable.abc_textfield_activated_mtrl_alpha, R.drawable.abc_textfield_search_activated_mtrl_alpha, R.drawable.abc_cab_background_top_mtrl_alpha, R.drawable.abc_text_cursor_material, R.drawable.abc_text_select_handle_left_mtrl, R.drawable.abc_text_select_handle_middle_mtrl, R.drawable.abc_text_select_handle_right_mtrl};
    public final int[] OooO0Oo = {R.drawable.abc_popup_background_mtrl_mult, R.drawable.abc_cab_background_internal_bg, R.drawable.abc_menu_hardkey_panel_mtrl_mult};
    public final int[] OooO0o0 = {R.drawable.abc_tab_indicator_material, R.drawable.abc_textfield_search_material};
    public final int[] OooO0o = {R.drawable.abc_btn_check_material, R.drawable.abc_btn_radio_material, R.drawable.abc_btn_check_material_anim, R.drawable.abc_btn_radio_material_anim};

    public static boolean OooO00o(int[] iArr, int i) {
        for (int i2 : iArr) {
            if (i2 == i) {
                return true;
            }
        }
        return false;
    }

    public static ColorStateList OooO0O0(Context context, int i) {
        int OooO0OO = AbstractC1313oOooOo0.OooO0OO(context, R.attr.colorControlHighlight);
        return new ColorStateList(new int[][]{AbstractC1313oOooOo0.OooO0O0, AbstractC1313oOooOo0.OooO0Oo, AbstractC1313oOooOo0.OooO0OO, AbstractC1313oOooOo0.OooO0o}, new int[]{AbstractC1313oOooOo0.OooO0O0(context, R.attr.colorButtonNormal), o0O0OO0.OooO0O0(OooO0OO, i), o0O0OO0.OooO0O0(OooO0OO, i), i});
    }

    public static LayerDrawable OooO0OO(C1135oOOooo00 c1135oOOooo00, Context context, int i) {
        BitmapDrawable bitmapDrawable;
        BitmapDrawable bitmapDrawable2;
        BitmapDrawable bitmapDrawable3;
        int dimensionPixelSize = context.getResources().getDimensionPixelSize(i);
        Drawable OooO0o = c1135oOOooo00.OooO0o(context, R.drawable.abc_star_black_48dp);
        Drawable OooO0o2 = c1135oOOooo00.OooO0o(context, R.drawable.abc_star_half_black_48dp);
        if ((OooO0o instanceof BitmapDrawable) && OooO0o.getIntrinsicWidth() == dimensionPixelSize && OooO0o.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable = (BitmapDrawable) OooO0o;
            bitmapDrawable2 = new BitmapDrawable(bitmapDrawable.getBitmap());
        } else {
            Bitmap createBitmap = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas = new Canvas(createBitmap);
            OooO0o.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            OooO0o.draw(canvas);
            bitmapDrawable = new BitmapDrawable(createBitmap);
            bitmapDrawable2 = new BitmapDrawable(createBitmap);
        }
        bitmapDrawable2.setTileModeX(Shader.TileMode.REPEAT);
        if ((OooO0o2 instanceof BitmapDrawable) && OooO0o2.getIntrinsicWidth() == dimensionPixelSize && OooO0o2.getIntrinsicHeight() == dimensionPixelSize) {
            bitmapDrawable3 = (BitmapDrawable) OooO0o2;
        } else {
            Bitmap createBitmap2 = Bitmap.createBitmap(dimensionPixelSize, dimensionPixelSize, Bitmap.Config.ARGB_8888);
            Canvas canvas2 = new Canvas(createBitmap2);
            OooO0o2.setBounds(0, 0, dimensionPixelSize, dimensionPixelSize);
            OooO0o2.draw(canvas2);
            bitmapDrawable3 = new BitmapDrawable(createBitmap2);
        }
        LayerDrawable layerDrawable = new LayerDrawable(new Drawable[]{bitmapDrawable, bitmapDrawable3, bitmapDrawable2});
        layerDrawable.setId(0, 16908288);
        layerDrawable.setId(1, 16908303);
        layerDrawable.setId(2, 16908301);
        return layerDrawable;
    }

    public static void OooO0o0(Drawable drawable, int i, PorterDuff.Mode mode) {
        PorterDuffColorFilter OooO0oo;
        Drawable mutate = drawable.mutate();
        if (mode == null) {
            mode = C0113o000oo0O.OooO0O0;
        }
        PorterDuff.Mode mode2 = C0113o000oo0O.OooO0O0;
        synchronized (C0113o000oo0O.class) {
            OooO0oo = C1135oOOooo00.OooO0oo(i, mode);
        }
        mutate.setColorFilter(OooO0oo);
    }

    public final ColorStateList OooO0Oo(Context context, int i) {
        if (i == R.drawable.abc_edit_text_material) {
            return AbstractC0809oO0OooOO.OooOoo(context, R.color.abc_tint_edittext);
        }
        if (i == R.drawable.abc_switch_track_mtrl_alpha) {
            return AbstractC0809oO0OooOO.OooOoo(context, R.color.abc_tint_switch_track);
        }
        if (i == R.drawable.abc_switch_thumb_material) {
            int[][] iArr = new int[3];
            int[] iArr2 = new int[3];
            ColorStateList OooO0Oo = AbstractC1313oOooOo0.OooO0Oo(context, R.attr.colorSwitchThumbNormal);
            if (OooO0Oo != null && OooO0Oo.isStateful()) {
                int[] iArr3 = AbstractC1313oOooOo0.OooO0O0;
                iArr[0] = iArr3;
                iArr2[0] = OooO0Oo.getColorForState(iArr3, 0);
                iArr[1] = AbstractC1313oOooOo0.OooO0o0;
                iArr2[1] = AbstractC1313oOooOo0.OooO0OO(context, R.attr.colorControlActivated);
                iArr[2] = AbstractC1313oOooOo0.OooO0o;
                iArr2[2] = OooO0Oo.getDefaultColor();
            } else {
                iArr[0] = AbstractC1313oOooOo0.OooO0O0;
                iArr2[0] = AbstractC1313oOooOo0.OooO0O0(context, R.attr.colorSwitchThumbNormal);
                iArr[1] = AbstractC1313oOooOo0.OooO0o0;
                iArr2[1] = AbstractC1313oOooOo0.OooO0OO(context, R.attr.colorControlActivated);
                iArr[2] = AbstractC1313oOooOo0.OooO0o;
                iArr2[2] = AbstractC1313oOooOo0.OooO0OO(context, R.attr.colorSwitchThumbNormal);
            }
            return new ColorStateList(iArr, iArr2);
        } else if (i == R.drawable.abc_btn_default_mtrl_shape) {
            return OooO0O0(context, AbstractC1313oOooOo0.OooO0OO(context, R.attr.colorButtonNormal));
        } else {
            if (i == R.drawable.abc_btn_borderless_material) {
                return OooO0O0(context, 0);
            }
            if (i == R.drawable.abc_btn_colored_material) {
                return OooO0O0(context, AbstractC1313oOooOo0.OooO0OO(context, R.attr.colorAccent));
            }
            if (i != R.drawable.abc_spinner_mtrl_am_alpha && i != R.drawable.abc_spinner_textfield_background_material) {
                if (OooO00o(this.OooO0O0, i)) {
                    return AbstractC1313oOooOo0.OooO0Oo(context, R.attr.colorControlNormal);
                }
                if (OooO00o(this.OooO0o0, i)) {
                    return AbstractC0809oO0OooOO.OooOoo(context, R.color.abc_tint_default);
                }
                if (OooO00o(this.OooO0o, i)) {
                    return AbstractC0809oO0OooOO.OooOoo(context, R.color.abc_tint_btn_checkable);
                }
                if (i == R.drawable.abc_seekbar_thumb_material) {
                    return AbstractC0809oO0OooOO.OooOoo(context, R.color.abc_tint_seek_thumb);
                }
                return null;
            }
            return AbstractC0809oO0OooOO.OooOoo(context, R.color.abc_tint_spinner);
        }
    }
}
