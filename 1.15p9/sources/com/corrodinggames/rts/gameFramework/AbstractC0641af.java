package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/af.class */
public abstract class AbstractC0641af {

    /* renamed from: a */
    public int f4148a = -1;

    /* renamed from: b */
    public int f4149b = 0;

    /* renamed from: c */
    protected boolean f4150c;

    /* renamed from: d */
    public boolean f4151d;

    /* renamed from: a */
    public abstract boolean mo2937a();

    /* renamed from: b */
    public abstract boolean mo2935b();

    /* renamed from: c */
    public abstract String mo2934c();

    /* renamed from: d */
    public abstract boolean mo2933d();

    /* renamed from: a */
    public boolean mo2936a(AbstractC0641af abstractC0641af) {
        if (this.f4149b != abstractC0641af.f4149b || this.f4148a != abstractC0641af.f4148a) {
            return false;
        }
        return true;
    }
}
