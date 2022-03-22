package com.corrodinggames.rts.gameFramework.p032d;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/y.class */
public class C0649y {

    /* renamed from: a */
    private AbstractC0789l f4548a;

    /* renamed from: b */
    private Paint f4549b;

    /* renamed from: c */
    private ArrayList f4550c = new ArrayList();

    public C0649y(AbstractC0789l lVar) {
        this.f4548a = lVar;
        m1587a();
    }

    /* renamed from: a */
    public void m1587a() {
        this.f4549b = new Paint();
        this.f4549b.m4189a(255, 255, 255, 255);
        this.f4549b.m4173a(true);
        this.f4549b.m4162c(true);
        this.f4549b.mo837a(Typeface.m4101a(Typeface.f239c, 1));
        this.f4548a.m723a(this.f4549b, 14.0f);
    }

    /* renamed from: b */
    public synchronized void m1582b() {
        this.f4550c.clear();
    }

    /* renamed from: a */
    public synchronized void m1585a(AbstractC0210af afVar) {
        C0615aa aaVar = new C0615aa(afVar.f5842dH, afVar.f5843dI, afVar.mo1606r());
        aaVar.f4257c = AbstractC0789l.m747N();
        m1584a(aaVar);
    }

    /* renamed from: b */
    public synchronized void m1581b(AbstractC0210af afVar) {
        C0617ac acVar = new C0617ac(afVar.f5842dH, afVar.f5843dI, afVar.mo1606r());
        acVar.f4257c = AbstractC0789l.m747N();
        m1584a(acVar);
    }

    /* renamed from: c */
    public synchronized void m1579c(AbstractC0210af afVar) {
        C0616ab abVar = new C0616ab(afVar.f5842dH, afVar.f5843dI, afVar.mo2643bw());
        abVar.f4257c = AbstractC0789l.m747N();
        m1584a(abVar);
    }

    /* renamed from: a */
    public synchronized void m1583a(String str) {
        C0650z zVar = new C0650z(str);
        zVar.f4257c = AbstractC0789l.m747N();
        m1584a(zVar);
    }

    /* renamed from: a */
    private void m1584a(AbstractC0618ad adVar) {
        boolean z = false;
        Iterator it = this.f4550c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0618ad adVar2 = (AbstractC0618ad) it.next();
            if (adVar2.mo1576a(adVar)) {
                adVar2.mo1575b(adVar);
                z = true;
                break;
            }
        }
        if (z) {
            Collections.sort(this.f4550c);
        } else {
            this.f4550c.add(0, adVar);
        }
    }

    /* renamed from: a */
    public synchronized void m1586a(float f) {
        m1580c();
        AbstractC0789l u = AbstractC0789l.m638u();
        if (u.f5516by.showWarLogOnScreen) {
            int i = (int) (u.f5537bT - (130.0f * u.f5534bQ));
            int i2 = (int) (20.0f * u.f5534bQ);
            Iterator it = this.f4550c.iterator();
            while (it.hasNext()) {
                AbstractC0618ad adVar = (AbstractC0618ad) it.next();
                String a = adVar.mo1577a();
                if (adVar.f4257c + 5000 >= System.currentTimeMillis()) {
                    if (adVar.f4261g) {
                        this.f4549b.m4189a(255, 160, 160, 160);
                    } else {
                        this.f4549b.m4189a(255, 255, 255, 255);
                    }
                    u.f5514bw.mo158a(a, 20, i, this.f4549b);
                    i -= i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public synchronized void m1580c() {
        Iterator it = this.f4550c.iterator();
        while (it.hasNext()) {
            if (((AbstractC0618ad) it.next()).f4257c + 20000 < System.currentTimeMillis()) {
                it.remove();
            }
        }
    }

    /* renamed from: d */
    public synchronized void m1578d() {
        if (!this.f4550c.isEmpty()) {
            Iterator it = this.f4550c.iterator();
            while (it.hasNext()) {
                AbstractC0618ad adVar = (AbstractC0618ad) it.next();
                if (!adVar.f4261g) {
                    adVar.f4261g = true;
                    this.f4548a.m688b(adVar.f4258d, adVar.f4259e);
                    return;
                }
            }
        }
    }
}
