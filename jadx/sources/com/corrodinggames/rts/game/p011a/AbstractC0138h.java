package com.corrodinggames.rts.game.p011a;

import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/h.class */
public abstract class AbstractC0138h extends AbstractC0145o {

    /* renamed from: B */
    ArrayList f630B = new ArrayList();

    /* renamed from: C */
    ArrayList f631C = new ArrayList();

    /* renamed from: a */
    public abstract void mo3731a(float f);

    /* renamed from: g */
    public int m3788g() {
        return this.f630B.size();
    }

    /* renamed from: a */
    public boolean mo3792a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo3790b() {
        return false;
    }

    public AbstractC0138h(C0118a aVar) {
        super(aVar);
    }

    /* renamed from: h */
    public boolean m3787h() {
        Iterator it = this.f703R.f554aU.iterator();
        while (it.hasNext()) {
            AbstractC0145o oVar = (AbstractC0145o) it.next();
            if ((oVar instanceof C0144n) && ((C0144n) oVar).f695m == this) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: i */
    public void m3786i() {
        Iterator it = this.f630B.iterator();
        while (it.hasNext()) {
            AbstractC0515r rVar = (AbstractC0515r) it.next();
            if (rVar == null || rVar.f1459bz) {
                if (rVar != null && rVar.f3449ar == this) {
                    rVar.f3449ar = null;
                }
                if (rVar != null) {
                    this.f631C.remove(rVar);
                }
                it.remove();
            }
        }
    }

    /* renamed from: j */
    public void m3785j() {
        Iterator it = this.f631C.iterator();
        while (it.hasNext()) {
            AbstractC0515r rVar = (AbstractC0515r) it.next();
            if (rVar == null || rVar.f1459bz || rVar.f1501cp != null || rVar.f1502cq != null) {
                it.remove();
            }
        }
    }

    @Override // com.corrodinggames.rts.game.p011a.AbstractC0145o
    /* renamed from: k */
    public void mo3716k() {
        m3784l();
        this.f631C.clear();
        super.mo3716k();
    }

    /* renamed from: a */
    protected void m3791a(AbstractC0515r rVar) {
        if (rVar.f3449ar != null) {
            rVar.f3449ar.m3789b(rVar);
        }
        if (!(rVar.f1461bB == null || rVar.f1461bB == this.f703R)) {
            AbstractC0789l.m663f("unit.team:" + rVar.f1461bB.f1239i + ", ai:" + this.f703R.f1239i);
        }
        this.f630B.add(rVar);
        rVar.f3449ar = this;
    }

    /* renamed from: b */
    public void m3789b(AbstractC0515r rVar) {
        this.f630B.remove(rVar);
        this.f631C.remove(rVar);
        if (rVar.f3449ar == this) {
            rVar.f3449ar = null;
        }
    }

    /* renamed from: l */
    public void m3784l() {
        Iterator it = this.f630B.iterator();
        while (it.hasNext()) {
            AbstractC0515r rVar = (AbstractC0515r) it.next();
            if (rVar != null && rVar.f3449ar == this) {
                rVar.f3449ar = null;
            }
        }
        this.f630B.clear();
    }
}
