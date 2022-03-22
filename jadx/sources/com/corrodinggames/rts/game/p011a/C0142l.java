package com.corrodinggames.rts.game.p011a;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/l.class */
public class C0142l extends AbstractC0138h {

    /* renamed from: a */
    float f682a = 0.0f;

    @Override // com.corrodinggames.rts.game.p011a.AbstractC0145o, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1095a(this.f630B.size());
        Iterator it = this.f630B.iterator();
        while (it.hasNext()) {
            apVar.mo1144a((AbstractC0515r) it.next());
        }
        apVar.mo1130c(1);
        apVar.mo1095a(this.f631C.size());
        Iterator it2 = this.f631C.iterator();
        while (it2.hasNext()) {
            apVar.mo1144a((AbstractC0515r) it2.next());
        }
        apVar.mo1096a(this.f682a);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.game.p011a.AbstractC0145o
    /* renamed from: a */
    public void mo3722a(C0707k kVar) {
        m3784l();
        int f = kVar.m1062f();
        for (int i = 0; i < f; i++) {
            AbstractC0515r o = kVar.m1053o();
            if (o != null) {
                m3791a(o);
            }
        }
        if (kVar.m1065d() >= 1) {
            this.f631C.clear();
            int f2 = kVar.m1062f();
            for (int i2 = 0; i2 < f2; i2++) {
                AbstractC0515r o2 = kVar.m1053o();
                if (o2 != null) {
                    this.f631C.add(o2);
                }
            }
            this.f682a = kVar.m1061g();
        }
        super.mo3722a(kVar);
    }

    public C0142l(C0118a aVar) {
        super(aVar);
    }

    @Override // com.corrodinggames.rts.game.p011a.AbstractC0138h
    /* renamed from: a */
    public void mo3731a(float f) {
        m3786i();
        if (!m3787h()) {
            this.f682a += f;
        }
        Iterator it = this.f630B.iterator();
        while (it.hasNext()) {
            AbstractC0515r rVar = (AbstractC0515r) it.next();
            if (m3719c((AbstractC0210af) rVar) < 3600.0f && rVar.f1501cp == null) {
                if (rVar.f3449ar == this) {
                    rVar.f3449ar = null;
                }
                it.remove();
            }
        }
        if (this.f630B.size() == 0 || this.f682a > 5000.0f) {
            mo3716k();
        }
    }

    /* renamed from: c */
    public void m3732c(AbstractC0515r rVar) {
        m3791a(rVar);
        this.f631C.add(rVar);
    }
}
