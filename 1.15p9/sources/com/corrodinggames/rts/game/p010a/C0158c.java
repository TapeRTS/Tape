package com.corrodinggames.rts.game.p010a;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.game.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/c.class */
public class C0158c {

    /* renamed from: a */
    HashMap f645a = new HashMap();

    /* renamed from: b */
    HashMap f646b = new HashMap();

    /* renamed from: c */
    HashMap f647c = new HashMap();

    /* renamed from: a */
    public Integer m6791a(boolean z, InterfaceC0303as interfaceC0303as, boolean z2) {
        if (z) {
            return (Integer) this.f647c.get(interfaceC0303as);
        }
        if (!z2) {
            return (Integer) this.f646b.get(interfaceC0303as);
        }
        return (Integer) this.f645a.get(interfaceC0303as);
    }

    /* renamed from: a */
    public void m6790a(boolean z, InterfaceC0303as interfaceC0303as, boolean z2, Integer num) {
        if (z) {
            this.f647c.put(interfaceC0303as, num);
        } else if (!z2) {
            this.f646b.put(interfaceC0303as, num);
        } else {
            this.f645a.put(interfaceC0303as, num);
        }
    }

    /* renamed from: a */
    public void m6794a() {
        this.f645a.clear();
        this.f646b.clear();
    }

    /* renamed from: a */
    public void m6793a(InterfaceC0303as interfaceC0303as) {
        this.f645a.put(interfaceC0303as, null);
        this.f646b.put(interfaceC0303as, null);
    }

    /* renamed from: a */
    public void m6792a(AbstractC0623y abstractC0623y) {
        this.f647c.put(abstractC0623y.f1688dx, null);
    }

    /* renamed from: b */
    public void m6789b() {
        this.f647c.clear();
    }
}
