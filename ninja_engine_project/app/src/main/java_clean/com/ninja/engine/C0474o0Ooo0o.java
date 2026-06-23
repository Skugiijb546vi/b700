package com.ninja.engine;

import android.text.InputFilter;
import android.text.method.PasswordTransformationMethod;
import android.text.method.TransformationMethod;
import android.util.SparseArray;
import android.widget.TextView;
/* renamed from: com.ninja.engine.o0Ooo0o  reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0474o0Ooo0o extends AbstractC0694o0ooooo0 {
    public final C0485o0OoooO0 OooOo0;
    public final TextView OooOo00;
    public boolean OooOo0O = true;

    public C0474o0Ooo0o(TextView textView) {
        this.OooOo00 = textView;
        this.OooOo0 = new C0485o0OoooO0(textView);
    }
    public void OoooO0O() {}
    public void OoooO0() {}

    @Override // com.ninja.engine.AbstractC0694o0ooooo0
    public final InputFilter[] OooOoO(InputFilter[] inputFilterArr) {
        if (!this.OooOo0O) {
            SparseArray sparseArray = new SparseArray(1);
            for (int i = 0; i < inputFilterArr.length; i++) {
                InputFilter inputFilter = inputFilterArr[i];
                if (inputFilter instanceof C0485o0OoooO0) {
                    sparseArray.put(i, inputFilter);
                }
            }
            if (sparseArray.size() != 0) {
                int length = inputFilterArr.length;
                InputFilter[] inputFilterArr2 = new InputFilter[inputFilterArr.length - sparseArray.size()];
                int i2 = 0;
                for (int i3 = 0; i3 < length; i3++) {
                    if (sparseArray.indexOfKey(i3) < 0) {
                        inputFilterArr2[i2] = inputFilterArr[i3];
                        i2++;
                    }
                }
                return inputFilterArr2;
            }
            return inputFilterArr;
        }
        int length2 = inputFilterArr.length;
        int i4 = 0;
        while (true) {
            C0485o0OoooO0 c0485o0OoooO0 = this.OooOo0;
            if (i4 < length2) {
                if (inputFilterArr[i4] != c0485o0OoooO0) {
                    i4++;
                } else {
                    return inputFilterArr;
                }
            } else {
                InputFilter[] inputFilterArr3 = new InputFilter[inputFilterArr.length + 1];
                System.arraycopy(inputFilterArr, 0, inputFilterArr3, 0, length2);
                inputFilterArr3[length2] = c0485o0OoooO0;
                return inputFilterArr3;
            }
        }
    }

    @Override // com.ninja.engine.AbstractC0694o0ooooo0
    public final void Oooo(boolean z) {
        this.OooOo0O = z;
        o000oOoO();
        TextView textView = this.OooOo00;
        textView.setFilters(OooOoO(textView.getFilters()));
    }

    @Override // com.ninja.engine.AbstractC0694o0ooooo0
    public final void Oooo0oo(boolean z) {
        if (z) {
            o000oOoO();
        }
    }

    public final void o000oOoO() {
        TextView textView = this.OooOo00;
        TransformationMethod transformationMethod = textView.getTransformationMethod();
        if (this.OooOo0O) {
            if (!(transformationMethod instanceof C0482o0Oooo0) && !(transformationMethod instanceof PasswordTransformationMethod)) {
                transformationMethod = new C0482o0Oooo0(transformationMethod);
            }
        } else if (transformationMethod instanceof C0482o0Oooo0) {
            transformationMethod = ((C0482o0Oooo0) transformationMethod).OooO00o;
        }
        textView.setTransformationMethod(transformationMethod);
    }
}


