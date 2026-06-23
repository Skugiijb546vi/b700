package com.ninja.engine;

import android.app.Notification;
import android.content.Context;
import android.graphics.Bitmap;
import android.os.Build;
import android.os.Bundle;
import android.text.TextUtils;
import java.util.ArrayList;
import java.util.Iterator;
/* renamed from: com.ninja.engine.oOO0OOo  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0930oOO0OOo {
    public Bundle OooO;
    public final Context OooO00o;
    public CharSequence OooO0o;
    public CharSequence OooO0o0;
    public int OooO0oO;
    public final String OooOO0;
    public final boolean OooOO0O;
    public final Notification OooOO0o;
    public final ArrayList OooOOO0;
    public final ArrayList OooO0O0 = new ArrayList();
    public final ArrayList OooO0OO = new ArrayList();
    public final ArrayList OooO0Oo = new ArrayList();
    public final boolean OooO0oo = true;

    public C0930oOO0OOo(Context context, String str) {
        Notification notification = new Notification();
        this.OooOO0o = notification;
        this.OooO00o = context;
        this.OooOO0 = str;
        notification.when = System.currentTimeMillis();
        notification.audioStreamType = -1;
        this.OooO0oO = 0;
        this.OooOOO0 = new ArrayList();
        this.OooOO0O = true;
    }

    public final Notification OooO00o() {
        Notification.Builder builder;
        boolean z;
        boolean z2;
        boolean z3;
        ArrayList arrayList;
        new ArrayList();
        Bundle bundle = new Bundle();
        int i = Build.VERSION.SDK_INT;
        Context context = this.OooO00o;
        String str = this.OooOO0;
        if (i >= 26) {
            builder = AbstractC0889oO0ooO0.OooO00o(context, str);
        } else {
            builder = new Notification.Builder(context);
        }
        Notification notification = this.OooOO0o;
        Notification.Builder lights = builder.setWhen(notification.when).setSmallIcon(notification.icon, notification.iconLevel).setContent(notification.contentView).setTicker(notification.tickerText, null).setVibrate(notification.vibrate).setLights(notification.ledARGB, notification.ledOnMS, notification.ledOffMS);
        boolean z4 = true;
        if ((notification.flags & 2) != 0) {
            z = true;
        } else {
            z = false;
        }
        Notification.Builder ongoing = lights.setOngoing(z);
        if ((notification.flags & 8) != 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        Notification.Builder onlyAlertOnce = ongoing.setOnlyAlertOnce(z2);
        if ((notification.flags & 16) != 0) {
            z3 = true;
        } else {
            z3 = false;
        }
        Notification.Builder deleteIntent = onlyAlertOnce.setAutoCancel(z3).setDefaults(notification.defaults).setContentTitle(this.OooO0o0).setContentText(this.OooO0o).setContentInfo(null).setContentIntent(null).setDeleteIntent(notification.deleteIntent);
        if ((notification.flags & 128) == 0) {
            z4 = false;
        }
        deleteIntent.setFullScreenIntent(null, z4).setNumber(0).setProgress(0, 0, false);
        if (i < 23) {
            builder.setLargeIcon((Bitmap) null);
        } else {
            AbstractC0121o000oooo.OooOOo0(builder);
        }
        builder.setSubText(null).setUsesChronometer(false).setPriority(this.OooO0oO);
        Iterator it = this.OooO0O0.iterator();
        if (!it.hasNext()) {
            Bundle bundle2 = this.OooO;
            if (bundle2 != null) {
                bundle.putAll(bundle2);
            }
            builder.setShowWhen(this.OooO0oo);
            builder.setLocalOnly(false);
            builder.setGroup(null);
            builder.setSortKey(null);
            builder.setGroupSummary(false);
            builder.setCategory(null);
            builder.setColor(0);
            builder.setVisibility(0);
            builder.setPublicVersion(null);
            builder.setSound(notification.sound, notification.audioAttributes);
            ArrayList<String> arrayList2 = this.OooOOO0;
            ArrayList arrayList3 = this.OooO0OO;
            if (i < 28) {
                if (arrayList3 == null) {
                    arrayList = null;
                } else {
                    arrayList = new ArrayList(arrayList3.size());
                    Iterator it2 = arrayList3.iterator();
                    if (it2.hasNext()) {
                        AbstractC1230oOoOo0o.OooOO0O(it2.next());
                        throw null;
                    }
                }
                if (arrayList != null) {
                    if (arrayList2 == null) {
                        arrayList2 = arrayList;
                    } else {
                        C1446oo0O c1446oo0O = new C1446oo0O(arrayList2.size() + arrayList.size());
                        c1446oo0O.addAll(arrayList);
                        c1446oo0O.addAll(arrayList2);
                        arrayList2 = new ArrayList(c1446oo0O);
                    }
                }
            }
            if (arrayList2 != null && !arrayList2.isEmpty()) {
                for (String str2 : arrayList2) {
                    builder.addPerson(str2);
                }
            }
            ArrayList arrayList4 = this.OooO0Oo;
            if (arrayList4.size() > 0) {
                if (this.OooO == null) {
                    this.OooO = new Bundle();
                }
                Bundle bundle3 = this.OooO.getBundle("android.car.EXTENSIONS");
                if (bundle3 == null) {
                    bundle3 = new Bundle();
                }
                Bundle bundle4 = new Bundle(bundle3);
                Bundle bundle5 = new Bundle();
                if (arrayList4.size() <= 0) {
                    bundle3.putBundle("invisible_actions", bundle5);
                    bundle4.putBundle("invisible_actions", bundle5);
                    if (this.OooO == null) {
                        this.OooO = new Bundle();
                    }
                    this.OooO.putBundle("android.car.EXTENSIONS", bundle3);
                    bundle.putBundle("android.car.EXTENSIONS", bundle4);
                } else {
                    Integer.toString(0);
                    AbstractC1230oOoOo0o.OooOO0O(arrayList4.get(0));
                    new Bundle();
                    throw null;
                }
            }
            int i2 = Build.VERSION.SDK_INT;
            if (i2 >= 24) {
                builder.setExtras(this.OooO);
                AbstractC0795oO0OoO.OooO0o0(builder);
            }
            if (i2 >= 26) {
                AbstractC0889oO0ooO0.OooO0o0(builder);
                AbstractC0889oO0ooO0.OooOO0O(builder);
                AbstractC0889oO0ooO0.OooOO0o(builder);
                AbstractC0889oO0ooO0.OooOOO0(builder);
                AbstractC0889oO0ooO0.OooO0oO(builder);
                if (!TextUtils.isEmpty(str)) {
                    builder.setSound(null).setDefaults(0).setLights(0, 0, 0).setVibrate(null);
                }
            }
            if (i2 >= 28) {
                Iterator it3 = arrayList3.iterator();
                if (it3.hasNext()) {
                    AbstractC1230oOoOo0o.OooOO0O(it3.next());
                    throw null;
                }
            }
            if (i2 >= 29) {
                AbstractC0139o00O0oo.OooO0o0(builder, this.OooOO0O);
                AbstractC0139o00O0oo.OooO0o(builder);
            }
            if (i2 < 26 && i2 < 24) {
                builder.setExtras(bundle);
            }
            return builder.build();
        }
        AbstractC1230oOoOo0o.OooOO0O(it.next());
        throw null;
    }
}
