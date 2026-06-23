package com.ninja.engine;
/* renamed from: com.ninja.engine.oOOoOO0O  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1087oOOoOO0O extends RuntimeException {
    public C1087oOOoOO0O(Class cls) {
        super("Failed to find result encoder for resource class: " + cls + ", you may need to consider registering a new Encoder for the requested type or DiskCacheStrategy.DATA/DiskCacheStrategy.NONE if caching your transformed resource is unnecessary.");
    }
}
