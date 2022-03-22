package com.corrodinggames.rts.gameFramework.p032d;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.gameFramework.AbstractC0585bi;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.v */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/v.class */
public class C0646v extends AbstractC0585bi {

    /* renamed from: i */
    private final C0599a f4532i;

    /* renamed from: a */
    public ArrayList f4533a = new ArrayList();

    /* renamed from: b */
    public float f4534b;

    /* renamed from: c */
    public long f4535c;

    /* renamed from: d */
    public float f4536d;

    /* renamed from: e */
    public float f4537e;

    /* renamed from: f */
    public float f4538f;

    /* renamed from: g */
    public boolean f4539g;

    /* renamed from: h */
    public boolean f4540h;

    public C0646v(C0599a aVar, boolean z) {
        this.f4532i = aVar;
        this.f4539g = z;
    }

    /* renamed from: a */
    public void m1601a() {
        AbstractC0210af afVar = null;
        Iterator it = this.f4533a.iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar2 = (AbstractC0210af) it.next();
            if (!afVar2.f1459bz && afVar2.f1501cp == null && this.f4532i.f4105a.m1670j(afVar2)) {
                afVar = afVar2;
            }
        }
        if (this.f4535c > AbstractC0789l.m747N() - 700 && afVar != null) {
            this.f4532i.f4106b.m688b(afVar.f5842dH, afVar.f5843dI);
        }
        this.f4535c = AbstractC0789l.m747N();
    }

    /* renamed from: b */
    public void m1599b() {
        this.f4533a.clear();
    }

    /* renamed from: c */
    public void m1598c() {
        Iterator it = AbstractC0854w.f5846dK.iterator();
        while (it.hasNext()) {
            AbstractC0854w wVar = (AbstractC0854w) it.next();
            if (wVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) wVar;
                if (rVar.f1494ci && !this.f4533a.contains(rVar)) {
                    this.f4533a.add(rVar);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        m1597d();
        apVar.mo1096a(this.f4534b);
        apVar.mo1148a(this.f4535c);
        apVar.mo1095a(this.f4533a.size());
        Iterator it = this.f4533a.iterator();
        while (it.hasNext()) {
            apVar.mo1094a((AbstractC0210af) it.next());
        }
        apVar.mo1130c(0);
    }

    /* renamed from: a */
    public void m1600a(C0707k kVar) {
        this.f4534b = kVar.m1061g();
        this.f4535c = kVar.m1059i();
        this.f4533a.clear();
        int f = kVar.m1062f();
        for (int i = 0; i < f; i++) {
            AbstractC0210af n = kVar.m1054n();
            if (n != null) {
                this.f4533a.add(n);
            }
        }
        kVar.m1065d();
    }

    /* renamed from: d */
    public void m1597d() {
        if (this.f4533a.size() != 0) {
            Iterator it = this.f4533a.iterator();
            while (it.hasNext()) {
                if (((AbstractC0210af) it.next()).f1459bz) {
                    it.remove();
                }
            }
        }
    }

    /* renamed from: e */
    public void m1596e() {
        if (this.f4533a.size() != 0) {
            ArrayList arrayList = new ArrayList();
            Iterator it = this.f4533a.iterator();
            while (it.hasNext()) {
                AbstractC0210af a = AbstractC0854w.m401a(((AbstractC0210af) it.next()).f5835dA, true);
                if (a != null && !a.f1459bz) {
                    arrayList.add(a);
                }
            }
            this.f4533a = arrayList;
        }
    }
}
