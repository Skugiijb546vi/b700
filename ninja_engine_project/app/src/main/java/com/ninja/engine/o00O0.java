package com.ninja.engine;

import android.view.textclassifier.TextClassificationManager;
import android.view.textclassifier.TextClassifier;
import android.widget.TextView;
/* loaded from: classes.dex */
public abstract class o00O0 {
    public static TextClassifier OooO00o(TextView textView) {
        TextClassificationManager textClassificationManager = (TextClassificationManager) textView.getContext().getSystemService(TextClassificationManager.class);
        if (textClassificationManager != null) {
            return textClassificationManager.getTextClassifier();
        }
        return TextClassifier.NO_OP;
    }
}
