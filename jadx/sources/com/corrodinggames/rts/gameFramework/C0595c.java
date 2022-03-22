package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.AbstractC0171m;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/c.class */
public class C0595c {

    /* renamed from: a */
    static final boolean f4090a = false;

    /* renamed from: b */
    public ArrayList f4091b = new ArrayList();

    /* renamed from: c */
    public ArrayList f4092c = new ArrayList();

    /* renamed from: d */
    public ArrayList f4093d = new ArrayList();

    /* renamed from: a */
    public void m1957a() {
        this.f4091b.clear();
        this.f4092c.clear();
        this.f4093d.clear();
    }

    /* renamed from: b */
    public C0651e m1955b() {
        C0651e eVar = new C0651e(this);
        if (f4090a) {
            AbstractC0789l.m683d("Tracing source");
            eVar.f4552b = AbstractC0789l.m725a(new Exception("Test"));
        }
        return eVar;
    }

    /* renamed from: a */
    public C0651e m1956a(AbstractC0171m mVar) {
        return m1954b(mVar);
    }

    /* renamed from: b */
    public C0651e m1954b(AbstractC0171m mVar) {
        if (mVar == null) {
            throw new RuntimeException("team==null");
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e eVar = new C0651e(this);
        eVar.f4555i = mVar;
        eVar.f4554d = u.f5467bh;
        if (f4090a) {
            AbstractC0789l.m683d("Tracing source");
            eVar.f4552b = AbstractC0789l.m725a(new Exception("Test"));
        }
        if (!u.f5486bF.f4734z) {
            if (!eVar.m1595l()) {
                AbstractC0789l.m695b("Command failed prepareAndCheckOnServer()");
            }
            this.f4091b.add(eVar);
        } else {
            this.f4093d.add(eVar);
        }
        return eVar;
    }

    /* renamed from: c */
    public void m1953c() {
        if (!AbstractC0789l.m651u().f5486bF.f4734z) {
            m1952d();
        } else {
            m1951e();
        }
    }

    /* renamed from: d */
    public void m1952d() {
        AbstractC0789l u = AbstractC0789l.m651u();
        int i = u.f5585bg;
        Iterator it = this.f4091b.iterator();
        while (it.hasNext()) {
            C0651e eVar = (C0651e) it.next();
            u.f5490bJ.m2012a(eVar, i);
            eVar.m1596k();
        }
        this.f4091b.clear();
    }

    /* renamed from: e */
    public void m1951e() {
        AbstractC0789l u = AbstractC0789l.m651u();
        int i = u.f5585bg;
        Iterator it = this.f4091b.iterator();
        while (it.hasNext()) {
            C0651e eVar = (C0651e) it.next();
            if (eVar.f4553c == i) {
                u.f5490bJ.m2012a(eVar, i);
                eVar.m1596k();
                it.remove();
            }
        }
    }
}
