package com.ninja.engine;

public class C0763oO0O0oO0 {
    public EnumC0759oO0O0o OooO00o;
    public InterfaceC1800ooOOOoOo OooO0O0;

    public C0763oO0O0oO0() {
    }

    public void OooO00o(InterfaceC0760oO0O0o0O owner, oO0O0O0o event) {
        EnumC0759oO0O0o targetState = event.OooO00o();
        if (this.OooO00o != null && targetState != null && targetState.compareTo(this.OooO00o) < 0) {
            this.OooO00o = targetState;
        } else if (this.OooO00o == null) {
            this.OooO00o = targetState;
        }
        if (this.OooO0O0 != null) {
            this.OooO0O0.OooO0O0(owner, event);
        }
        this.OooO00o = targetState;
    }
}


