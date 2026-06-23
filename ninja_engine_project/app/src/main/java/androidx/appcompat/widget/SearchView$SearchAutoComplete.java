package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.Configuration;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.KeyEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import com.ninja.engine.AbstractC1197oOoOO0oo;
import com.ninja.engine.C0439o0OoO0o;
import com.ninja.engine.o00000OO;
/* loaded from: classes.dex */
public class SearchView$SearchAutoComplete extends C0439o0OoO0o {
    public boolean OooO0o;
    public int OooO0o0;
    public final o00000OO OooO0oO;

    public SearchView$SearchAutoComplete(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.OooO0oO = new o00000OO(13, this);
        this.OooO0o0 = getThreshold();
    }

    private int getSearchViewTextMinWidthDp() {
        Configuration configuration = getResources().getConfiguration();
        int i = configuration.screenWidthDp;
        int i2 = configuration.screenHeightDp;
        if (i < 960 || i2 < 720 || configuration.orientation != 2) {
            if (i < 600) {
                return (i < 640 || i2 < 480) ? 160 : 192;
            }
            return 192;
        }
        return 256;
    }

    @Override // android.widget.AutoCompleteTextView
    public final boolean enoughToFilter() {
        return this.OooO0o0 <= 0 || super.enoughToFilter();
    }

    @Override // com.ninja.engine.C0439o0OoO0o, android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        if (this.OooO0o) {
            o00000OO o00000oo = this.OooO0oO;
            removeCallbacks(o00000oo);
            post(o00000oo);
        }
        return onCreateInputConnection;
    }

    @Override // android.view.View
    public final void onFinishInflate() {
        super.onFinishInflate();
        setMinWidth((int) TypedValue.applyDimension(1, getSearchViewTextMinWidthDp(), getResources().getDisplayMetrics()));
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onFocusChanged(boolean z, int i, Rect rect) {
        super.onFocusChanged(z, i, rect);
        throw null;
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final boolean onKeyPreIme(int i, KeyEvent keyEvent) {
        if (i == 4) {
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
                if (keyDispatcherState != null) {
                    keyDispatcherState.startTracking(keyEvent, this);
                }
                return true;
            } else if (keyEvent.getAction() == 1) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.handleUpEvent(keyEvent);
                }
                if (keyEvent.isTracking() && !keyEvent.isCanceled()) {
                    throw null;
                }
            }
        }
        return super.onKeyPreIme(i, keyEvent);
    }

    @Override // android.widget.AutoCompleteTextView, android.widget.TextView, android.view.View
    public final void onWindowFocusChanged(boolean z) {
        super.onWindowFocusChanged(z);
        if (z) {
            throw null;
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public final void performCompletion() {
    }

    @Override // android.widget.AutoCompleteTextView
    public final void replaceText(CharSequence charSequence) {
    }

    public void setImeVisibility(boolean z) {
        InputMethodManager inputMethodManager = (InputMethodManager) getContext().getSystemService("input_method");
        o00000OO o00000oo = this.OooO0oO;
        if (!z) {
            this.OooO0o = false;
            removeCallbacks(o00000oo);
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        } else if (!inputMethodManager.isActive(this)) {
            this.OooO0o = true;
        } else {
            this.OooO0o = false;
            removeCallbacks(o00000oo);
            inputMethodManager.showSoftInput(this, 0);
        }
    }

    @Override // android.widget.AutoCompleteTextView
    public void setThreshold(int i) {
        super.setThreshold(i);
        this.OooO0o0 = i;
    }

    public void setSearchView(AbstractC1197oOoOO0oo abstractC1197oOoOO0oo) {
    }
}
