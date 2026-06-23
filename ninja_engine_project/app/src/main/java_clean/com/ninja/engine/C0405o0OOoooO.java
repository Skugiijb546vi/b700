package com.ninja.engine;

import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
/* renamed from: com.ninja.engine.o0OOoooO  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0405o0OOoooO extends SQLiteOpenHelper {
    public C0405o0OOoooO(android.content.Context context) { super(context, "prdownloader.db", null, 1); }
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS prdownloader( id INTEGER PRIMARY KEY, url VARCHAR, etag VARCHAR, dir_path VARCHAR, file_name VARCHAR, total_bytes INTEGER, downloaded_bytes INTEGER, last_modified_at INTEGER )");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
    }
}


