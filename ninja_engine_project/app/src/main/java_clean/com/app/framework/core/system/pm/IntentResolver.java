package com.app.framework.core.system.pm;

import android.content.Intent;
import android.content.IntentFilter;
import android.net.Uri;
import android.util.ArrayMap;
import android.util.MutableInt;
import android.util.PrintWriterPrinter;
import com.app.framework.core.system.pm.BPackage;
import com.app.framework.core.system.pm.BPackage.IntentInfo;
import com.ninja.engine.AbstractC1230oOoOo0o;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Objects;
import java.util.Set;
/* loaded from: classes.dex */
public abstract class IntentResolver<F extends BPackage.IntentInfo, R> {
    private static final boolean DEBUG = false;
    private static final String TAG = "IntentResolver";
    private static final boolean localLOGV = false;
    private static final boolean localVerificationLOGV = false;
    private static final Comparator mResolvePrioritySorter = new Comparator() { // from class: com.app.framework.core.system.pm.IntentResolver.1
        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            int priority = ((IntentFilter) obj).getPriority();
            int priority2 = ((IntentFilter) obj2).getPriority();
            if (priority > priority2) {
                return -1;
            }
            return priority < priority2 ? 1 : 0;
        }
    };
    private final HashSet<F> mFilters = new HashSet<>();
    private final ArrayMap<String, F[]> mTypeToFilter = new ArrayMap<>();
    private final ArrayMap<String, F[]> mBaseTypeToFilter = new ArrayMap<>();
    private final ArrayMap<String, F[]> mWildTypeToFilter = new ArrayMap<>();
    private final ArrayMap<String, F[]> mSchemeToFilter = new ArrayMap<>();
    private final ArrayMap<String, F[]> mActionToFilter = new ArrayMap<>();
    private final ArrayMap<String, F[]> mTypedActionToFilter = new ArrayMap<>();

    /* loaded from: classes.dex */
    public class IteratorWrapper implements Iterator<F> {
        private F mCur;
        private final Iterator<F> mI;

        public IteratorWrapper(Iterator<F> it) {
            this.mI = it;
        }

        @Override // java.util.Iterator
        public boolean hasNext() {
            return this.mI.hasNext();
        }

        @Override // java.util.Iterator
        public F next() {
            F next = this.mI.next();
            this.mCur = next;
            return next;
        }

        @Override // java.util.Iterator
        public void remove() {
            F f = this.mCur;
            if (f != null) {
                IntentResolver.this.removeFilterInternal(f);
            }
            this.mI.remove();
        }
    }

    private final void addFilter(ArrayMap<String, F[]> arrayMap, String str, F f) {
        F[] fArr = arrayMap.get(str);
        if (fArr == null) {
            F[] newArray = newArray(2);
            arrayMap.put(str, newArray);
            newArray[0] = f;
            return;
        }
        int length = fArr.length;
        int i = length;
        while (i > 0 && fArr[i - 1] == null) {
            i--;
        }
        if (i < length) {
            fArr[i] = f;
            return;
        }
        F[] newArray2 = newArray((length * 3) / 2);
        System.arraycopy(fArr, 0, newArray2, 0, length);
        newArray2[length] = f;
        arrayMap.put(str, newArray2);
    }

    private void buildResolveList(Intent intent, FastImmutableArraySet<String> fastImmutableArraySet, boolean z, boolean z2, String str, String str2, F[] fArr, List<R> list, int i) {
        int match;
        F[] fArr2 = fArr;
        String action = intent.getAction();
        Uri data = intent.getData();
        String str3 = intent.getPackage();
        int length = fArr2 != null ? fArr2.length : 0;
        int i2 = 0;
        boolean z3 = false;
        while (i2 < length) {
            F f = fArr2[i2];
            if (f == null) {
                break;
            }
            if (z) {
                f.toString();
            }
            if ((str3 == null || isPackageForFilter(str3, f)) && allowFilterResult(f, list) && (match = f.intentFilter.match(action, str, str2, data, fastImmutableArraySet, TAG)) >= 0) {
                if (z) {
                    Integer.toHexString(match);
                    f.intentFilter.hasCategory("android.intent.category.DEFAULT");
                }
                if (!z2 || f.intentFilter.hasCategory("android.intent.category.DEFAULT")) {
                    R newResult = newResult(f, match, i);
                    if (z) {
                        Objects.toString(newResult);
                    }
                    if (newResult != null) {
                        list.add(newResult);
                    }
                } else {
                    z3 = true;
                }
            }
            i2++;
            fArr2 = fArr;
        }
        if (z && z3 && list.size() != 0) {
            list.size();
        }
    }

    private ArrayList<F> collectFilters(F[] fArr, IntentFilter intentFilter) {
        F f;
        ArrayList<F> arrayList = null;
        if (fArr != null) {
            for (int i = 0; i < fArr.length && (f = fArr[i]) != null; i++) {
                if (filterEquals(f.intentFilter, intentFilter)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(f);
                }
            }
        }
        return arrayList;
    }

    public static boolean filterEquals(IntentFilter intentFilter, IntentFilter intentFilter2) {
        int countActions = intentFilter.countActions();
        if (countActions != intentFilter2.countActions()) {
            return false;
        }
        for (int i = 0; i < countActions; i++) {
            if (!intentFilter2.hasAction(intentFilter.getAction(i))) {
                return false;
            }
        }
        int countCategories = intentFilter.countCategories();
        if (countCategories != intentFilter2.countCategories()) {
            return false;
        }
        for (int i2 = 0; i2 < countCategories; i2++) {
            if (!intentFilter2.hasCategory(intentFilter.getCategory(i2))) {
                return false;
            }
        }
        int countDataSchemes = intentFilter.countDataSchemes();
        if (countDataSchemes != intentFilter2.countDataSchemes()) {
            return false;
        }
        for (int i3 = 0; i3 < countDataSchemes; i3++) {
            if (!intentFilter2.hasDataScheme(intentFilter.getDataScheme(i3))) {
                return false;
            }
        }
        return intentFilter.countDataSchemeSpecificParts() == intentFilter2.countDataSchemeSpecificParts();
    }

    private static FastImmutableArraySet<String> getFastIntentCategories(Intent intent) {
        Set<String> categories = intent.getCategories();
        if (categories == null) {
            return null;
        }
        return new FastImmutableArraySet<>((String[]) categories.toArray(new String[categories.size()]));
    }

    private final int register_intent_filter(F f, Iterator<String> it, ArrayMap<String, F[]> arrayMap, String str) {
        int i = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            i++;
            addFilter(arrayMap, it.next(), f);
        }
        return i;
    }

    private final int register_mime_types(F f, String str) {
        String str2;
        Iterator<String> typesIterator = f.intentFilter.typesIterator();
        if (typesIterator == null) {
            return 0;
        }
        int i = 0;
        while (typesIterator.hasNext()) {
            String next = typesIterator.next();
            i++;
            int indexOf = next.indexOf(47);
            if (indexOf > 0) {
                str2 = next.substring(0, indexOf).intern();
            } else {
                str2 = next;
                next = next.concat("/*");
            }
            addFilter(this.mTypeToFilter, next, f);
            addFilter(indexOf > 0 ? this.mBaseTypeToFilter : this.mWildTypeToFilter, str2, f);
        }
        return i;
    }

    private final void remove_all_objects(ArrayMap<String, F[]> arrayMap, String str, Object obj) {
        F[] fArr = arrayMap.get(str);
        if (fArr != null) {
            int length = fArr.length - 1;
            while (length >= 0 && fArr[length] == null) {
                length--;
            }
            int i = length;
            while (length >= 0) {
                if (fArr[length] == obj) {
                    int i2 = i - length;
                    if (i2 > 0) {
                        System.arraycopy(fArr, length + 1, fArr, length, i2);
                    }
                    fArr[i] = null;
                    i--;
                }
                length--;
            }
            if (i < 0) {
                arrayMap.remove(str);
            } else if (i < fArr.length / 2) {
                F[] newArray = newArray(i + 2);
                System.arraycopy(fArr, 0, newArray, 0, i + 1);
                arrayMap.put(str, newArray);
            }
        }
    }

    private final int unregister_intent_filter(F f, Iterator<String> it, ArrayMap<String, F[]> arrayMap, String str) {
        int i = 0;
        if (it == null) {
            return 0;
        }
        while (it.hasNext()) {
            i++;
            remove_all_objects(arrayMap, it.next(), f);
        }
        return i;
    }

    private final int unregister_mime_types(F f, String str) {
        String str2;
        Iterator<String> typesIterator = f.intentFilter.typesIterator();
        if (typesIterator == null) {
            return 0;
        }
        int i = 0;
        while (typesIterator.hasNext()) {
            String next = typesIterator.next();
            i++;
            int indexOf = next.indexOf(47);
            if (indexOf > 0) {
                str2 = next.substring(0, indexOf).intern();
            } else {
                str2 = next;
                next = next.concat("/*");
            }
            remove_all_objects(this.mTypeToFilter, next, f);
            remove_all_objects(indexOf > 0 ? this.mBaseTypeToFilter : this.mWildTypeToFilter, str2, f);
        }
        return i;
    }

    public boolean allowFilterResult(F f, List<R> list) {
        return true;
    }

    public void dumpFilter(PrintWriter printWriter, String str, F f) {
        printWriter.print(str);
        printWriter.println(f);
    }

    public void dumpFilterLabel(PrintWriter printWriter, String str, Object obj, int i) {
        printWriter.print(str);
        printWriter.print(obj);
        printWriter.print(": ");
        printWriter.println(i);
    }

    public boolean dumpMap(PrintWriter printWriter, String str, String str2, String str3, ArrayMap<String, F[]> arrayMap, String str4, boolean z, boolean z2) {
        boolean z3;
        String str5;
        F f;
        PrintWriterPrinter printWriterPrinter;
        boolean z4;
        ArrayMap<String, F[]> arrayMap2 = arrayMap;
        String OooO0oO = AbstractC1230oOoOo0o.OooO0oO(str3, "  ");
        String OooO0oO2 = AbstractC1230oOoOo0o.OooO0oO(str3, "    ");
        ArrayMap arrayMap3 = new ArrayMap();
        String str6 = str2;
        int i = 0;
        boolean z5 = false;
        PrintWriterPrinter printWriterPrinter2 = null;
        while (i < arrayMap.size()) {
            F[] valueAt = arrayMap2.valueAt(i);
            int length = valueAt.length;
            if (!z2 || z) {
                z3 = z5;
                str6 = str6;
                printWriterPrinter2 = printWriterPrinter2;
                int i2 = 0;
                boolean z6 = false;
                while (i2 < length) {
                    F f2 = valueAt[i2];
                    if (f2 == null) {
                        break;
                    }
                    if (str4 == null || isPackageForFilter(str4, f2)) {
                        if (str6 != null) {
                            printWriter.print(str);
                            printWriter.println(str6);
                            str6 = null;
                        }
                        if (!z6) {
                            printWriter.print(OooO0oO);
                            printWriter.print(arrayMap2.keyAt(i));
                            printWriter.println(":");
                            z6 = true;
                        }
                        dumpFilter(printWriter, OooO0oO2, f2);
                        if (z) {
                            if (printWriterPrinter2 == null) {
                                printWriterPrinter2 = new PrintWriterPrinter(printWriter);
                            }
                            f2.intentFilter.dump(printWriterPrinter2, OooO0oO2 + "  ");
                        }
                        z3 = true;
                    }
                    i2++;
                    arrayMap2 = arrayMap;
                }
            } else {
                arrayMap3.clear();
                int i3 = 0;
                while (true) {
                    str5 = str6;
                    if (i3 >= length || (f = valueAt[i3]) == null) {
                        break;
                    }
                    if (str4 == null || isPackageForFilter(str4, f)) {
                        Object filterToLabel = filterToLabel(f);
                        printWriterPrinter = printWriterPrinter2;
                        int indexOfKey = arrayMap3.indexOfKey(filterToLabel);
                        if (indexOfKey < 0) {
                            z4 = z5;
                            arrayMap3.put(filterToLabel, new MutableInt(1));
                        } else {
                            z4 = z5;
                            ((MutableInt) arrayMap3.valueAt(indexOfKey)).value++;
                        }
                    } else {
                        z4 = z5;
                        printWriterPrinter = printWriterPrinter2;
                    }
                    i3++;
                    str6 = str5;
                    printWriterPrinter2 = printWriterPrinter;
                    z5 = z4;
                }
                z3 = z5;
                PrintWriterPrinter printWriterPrinter3 = printWriterPrinter2;
                str6 = str5;
                int i4 = 0;
                boolean z7 = false;
                while (i4 < arrayMap3.size()) {
                    if (str6 != null) {
                        printWriter.print(str);
                        printWriter.println(str6);
                        str6 = null;
                    }
                    if (!z7) {
                        printWriter.print(OooO0oO);
                        printWriter.print(arrayMap2.keyAt(i));
                        printWriter.println(":");
                        z7 = true;
                    }
                    dumpFilterLabel(printWriter, OooO0oO2, arrayMap3.keyAt(i4), ((MutableInt) arrayMap3.valueAt(i4)).value);
                    i4++;
                    z3 = true;
                }
                printWriterPrinter2 = printWriterPrinter3;
            }
            z5 = z3;
            i++;
            arrayMap2 = arrayMap;
        }
        return z5;
    }

    public Iterator<F> filterIterator() {
        return new IteratorWrapper(this.mFilters.iterator());
    }

    public void filterResults(List<R> list) {
    }

    public Set<F> filterSet() {
        return Collections.unmodifiableSet(this.mFilters);
    }

    public Object filterToLabel(F f) {
        return "IntentFilter";
    }

    public ArrayList<F> findFilters(IntentFilter intentFilter) {
        if (intentFilter.countDataSchemes() == 1) {
            return collectFilters(this.mSchemeToFilter.get(intentFilter.getDataScheme(0)), intentFilter);
        }
        if (intentFilter.countDataTypes() == 0 || intentFilter.countActions() != 1) {
            if (intentFilter.countDataTypes() == 0 && intentFilter.countDataSchemes() == 0 && intentFilter.countActions() == 1) {
                return collectFilters(this.mActionToFilter.get(intentFilter.getAction(0)), intentFilter);
            }
            Iterator<F> it = this.mFilters.iterator();
            ArrayList<F> arrayList = null;
            while (it.hasNext()) {
                F next = it.next();
                if (filterEquals(next.intentFilter, intentFilter)) {
                    if (arrayList == null) {
                        arrayList = new ArrayList<>();
                    }
                    arrayList.add(next);
                }
            }
            return arrayList;
        }
        return collectFilters(this.mTypedActionToFilter.get(intentFilter.getAction(0)), intentFilter);
    }

    public boolean isFilterStopped(F f, int i) {
        return false;
    }

    public abstract boolean isPackageForFilter(String str, F f);

    public abstract F[] newArray(int i);

    /* JADX WARN: Multi-variable type inference failed */
    public R newResult(F f, int i, int i2) {
        return f;
    }

    /* JADX WARN: Removed duplicated region for block: B:44:0x00b1  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00c2 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:59:0x00e4  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x010e  */
    /* JADX WARN: Removed duplicated region for block: B:65:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:68:0x013d A[LOOP:0: B:68:0x013d->B:70:0x0143, LOOP_START, PHI: r14 
      PHI: (r14v1 int) = (r14v0 int), (r14v2 int) binds: [B:67:0x013b, B:70:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public java.util.List<R> queryIntent(android.content.Intent r21, java.lang.String r22, boolean r23, int r24) {
        /*
            Method dump skipped, instructions count: 334
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.core.system.pm.IntentResolver.queryIntent(android.content.Intent, java.lang.String, boolean, int):java.util.List");
    }

    public List<R> queryIntentFromList(Intent intent, String str, boolean z, ArrayList<F[]> arrayList, int i) {
        ArrayList arrayList2 = new ArrayList();
        boolean z2 = (intent.getFlags() & 8) != 0;
        FastImmutableArraySet<String> fastIntentCategories = getFastIntentCategories(intent);
        String scheme = intent.getScheme();
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            buildResolveList(intent, fastIntentCategories, z2, z, str, scheme, arrayList.get(i2), arrayList2, i);
        }
        filterResults(arrayList2);
        return arrayList2;
    }

    public void removeFilter(F f) {
        removeFilterInternal(f);
        this.mFilters.remove(f);
    }

    public void removeFilterInternal(F f) {
        int unregister_intent_filter = unregister_intent_filter(f, f.intentFilter.schemesIterator(), this.mSchemeToFilter, "      Scheme: ");
        int unregister_mime_types = unregister_mime_types(f, "      Type: ");
        if (unregister_intent_filter == 0 && unregister_mime_types == 0) {
            unregister_intent_filter(f, f.intentFilter.actionsIterator(), this.mActionToFilter, "      Action: ");
        }
        if (unregister_mime_types != 0) {
            unregister_intent_filter(f, f.intentFilter.actionsIterator(), this.mTypedActionToFilter, "      TypedAction: ");
        }
    }

    public void sortResults(List<R> list) {
        Collections.sort(list, mResolvePrioritySorter);
    }

    public void addFilter(F f) {
        this.mFilters.add(f);
        int register_intent_filter = register_intent_filter(f, f.intentFilter.schemesIterator(), this.mSchemeToFilter, "      Scheme: ");
        int register_mime_types = register_mime_types(f, "      Type: ");
        if (register_intent_filter == 0 && register_mime_types == 0) {
            register_intent_filter(f, f.intentFilter.actionsIterator(), this.mActionToFilter, "      Action: ");
        }
        if (register_mime_types != 0) {
            register_intent_filter(f, f.intentFilter.actionsIterator(), this.mTypedActionToFilter, "      TypedAction: ");
        }
    }
}


