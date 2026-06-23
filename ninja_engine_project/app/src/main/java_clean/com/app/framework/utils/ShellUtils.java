package com.app.framework.utils;

import java.util.List;
/* loaded from: classes.dex */
public class ShellUtils {
    public static final String COMMAND_EXIT = "exit\n";
    public static final String COMMAND_LINE_END = "\n";
    public static final String COMMAND_SH = "sh";
    public static final String COMMAND_SU = "su";

    /* loaded from: classes.dex */
    public static class CommandResult {
        public int result;
        public String successMsg;

        public CommandResult(int i) {
            this.result = i;
        }

        public CommandResult(int i, String str) {
            this.result = i;
            this.successMsg = str;
        }
    }

    private ShellUtils() {
        throw new AssertionError();
    }

    public static boolean checkRootPermission() {
        return execCommand("echo root", true, false).result == 0;
    }

    public static CommandResult execCommand(String str, boolean z) {
        return execCommand(new String[]{str}, z, true);
    }

    public static CommandResult execCommand(String str, boolean z, boolean z2) {
        return execCommand(new String[]{str}, z, z2);
    }

    public static CommandResult execCommand(List<String> list, boolean z) {
        return execCommand(list == null ? null : (String[]) list.toArray(new String[0]), z, true);
    }

    public static CommandResult execCommand(List<String> list, boolean z, boolean z2) {
        return execCommand(list == null ? null : (String[]) list.toArray(new String[0]), z, z2);
    }

    public static CommandResult execCommand(String[] strArr, boolean z) {
        return execCommand(strArr, z, true);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:(12:6|7|(1:9)(1:116)|10|11|12|13|14|15|(4:18|(2:20|21)(2:23|24)|22|16)|25|26)|(11:28|29|30|(3:32|33|(1:35)(0))|37|(1:39)|41|42|(1:44)|45|46)(1:97)|36|37|(0)|41|42|(0)|45|46) */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00ad, code lost:
        r9 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00ae, code lost:
        r9.printStackTrace();
     */
    /* JADX WARN: Code restructure failed: missing block: B:81:0x00dc, code lost:
        if (r8 == null) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x00f9, code lost:
        if (r8 == null) goto L42;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0117 A[Catch: IOException -> 0x0113, TRY_LEAVE, TryCatch #3 {IOException -> 0x0113, blocks: (B:105:0x010f, B:109:0x0117), top: B:117:0x010f }] */
    /* JADX WARN: Removed duplicated region for block: B:113:0x0120  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x010f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:119:0x00cd A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x00ea A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00a8 A[Catch: IOException -> 0x00ad, TRY_LEAVE, TryCatch #10 {IOException -> 0x00ad, blocks: (B:56:0x00a3, B:58:0x00a8), top: B:123:0x00a3 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x00d5 A[Catch: IOException -> 0x00d1, TRY_LEAVE, TryCatch #4 {IOException -> 0x00d1, blocks: (B:74:0x00cd, B:78:0x00d5), top: B:119:0x00cd }] */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00f2 A[Catch: IOException -> 0x00ee, TRY_LEAVE, TryCatch #12 {IOException -> 0x00ee, blocks: (B:88:0x00ea, B:92:0x00f2), top: B:125:0x00ea }] */
    /* JADX WARN: Type inference failed for: r2v0, types: [int] */
    /* JADX WARN: Type inference failed for: r2v1 */
    /* JADX WARN: Type inference failed for: r2v10, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r2v11 */
    /* JADX WARN: Type inference failed for: r2v12 */
    /* JADX WARN: Type inference failed for: r2v14 */
    /* JADX WARN: Type inference failed for: r2v15, types: [java.io.OutputStream, java.io.DataOutputStream] */
    /* JADX WARN: Type inference failed for: r2v18 */
    /* JADX WARN: Type inference failed for: r2v2 */
    /* JADX WARN: Type inference failed for: r2v3 */
    /* JADX WARN: Type inference failed for: r2v5 */
    /* JADX WARN: Type inference failed for: r2v6 */
    /* JADX WARN: Type inference failed for: r2v7 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [java.io.OutputStream] */
    /* JADX WARN: Type inference failed for: r8v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r8v1 */
    /* JADX WARN: Type inference failed for: r8v12, types: [com.app.framework.utils.ShellUtils$CommandResult] */
    /* JADX WARN: Type inference failed for: r8v3 */
    /* JADX WARN: Type inference failed for: r9v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r9v1 */
    /* JADX WARN: Type inference failed for: r9v10 */
    /* JADX WARN: Type inference failed for: r9v11, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r9v12, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r9v13 */
    /* JADX WARN: Type inference failed for: r9v14, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r9v15 */
    /* JADX WARN: Type inference failed for: r9v16 */
    /* JADX WARN: Type inference failed for: r9v17 */
    /* JADX WARN: Type inference failed for: r9v18 */
    /* JADX WARN: Type inference failed for: r9v19 */
    /* JADX WARN: Type inference failed for: r9v20 */
    /* JADX WARN: Type inference failed for: r9v21, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r9v22, types: [java.lang.Throwable, java.io.IOException] */
    /* JADX WARN: Type inference failed for: r9v24 */
    /* JADX WARN: Type inference failed for: r9v26 */
    /* JADX WARN: Type inference failed for: r9v27, types: [java.io.BufferedReader] */
    /* JADX WARN: Type inference failed for: r9v28 */
    /* JADX WARN: Type inference failed for: r9v3 */
    /* JADX WARN: Type inference failed for: r9v7 */
    /* JADX WARN: Type inference failed for: r9v8 */
    /* JADX WARN: Type inference failed for: r9v9, types: [java.io.BufferedReader] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.app.framework.utils.ShellUtils.CommandResult execCommand(java.lang.String[] r7, boolean r8, boolean r9) {
        /*
            Method dump skipped, instructions count: 298
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.app.framework.utils.ShellUtils.execCommand(java.lang.String[], boolean, boolean):com.app.framework.utils.ShellUtils$CommandResult");
    }
}


