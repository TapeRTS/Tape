package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Paint;

/* renamed from: com.corrodinggames.rts.gameFramework.l.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/i.class */
public class C0938i extends C0928ae {

    /* renamed from: a */
    int f6437a;

    /* renamed from: b */
    boolean f6438b;

    public C0938i(String str, boolean z) {
        super(str);
        this.f6437a = -99;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0928ae
    /* renamed from: a */
    public boolean mo1012a() {
        return this.f6438b;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0928ae
    /* renamed from: b */
    public boolean mo1010b() {
        boolean z = false;
        if (-16711936 != this.f6437a) {
            m1063a("teamColor", -16711936);
            z = true;
            this.f6437a = -16711936;
        }
        return z;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0928ae
    /* renamed from: a */
    public boolean mo1011a(Paint paint, C0934e c0934e) {
        boolean z = false;
        if (c0934e instanceof C0937h) {
            C0937h c0937h = (C0937h) c0934e;
            if (c0937h.f6433D != this.f6437a) {
                m1063a("teamColor", c0937h.f6433D);
                z = true;
                this.f6437a = c0937h.f6433D;
            }
        }
        super.mo1011a(paint, c0934e);
        return z;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.C0928ae
    /* renamed from: c */
    public void mo1009c() {
        super.mo1009c();
    }
}
