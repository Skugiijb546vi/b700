package com.app.framework.core.system.am;

import java.util.Objects;
/* loaded from: classes.dex */
public class PendingIntentRecord {
    public String packageName;
    public int uid;

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof PendingIntentRecord) {
            PendingIntentRecord pendingIntentRecord = (PendingIntentRecord) obj;
            return this.uid == pendingIntentRecord.uid && Objects.equals(this.packageName, pendingIntentRecord.packageName);
        }
        return false;
    }

    public int hashCode() {
        return Objects.hash(Integer.valueOf(this.uid), this.packageName);
    }
}


