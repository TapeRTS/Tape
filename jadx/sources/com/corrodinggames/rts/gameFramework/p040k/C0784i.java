package com.corrodinggames.rts.gameFramework.p040k;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p011a.C0118a;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.k.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/i.class */
class C0784i {

    /* renamed from: a */
    boolean f5428a;

    /* renamed from: b */
    C0835m f5429b = new C0835m();

    /* renamed from: c */
    final /* synthetic */ C0781f f5430c;

    C0784i(C0781f fVar) {
        this.f5430c = fVar;
    }

    /* renamed from: a */
    public void m764a(AbstractC0268al alVar, int i) {
        AbstractC0268al c = C0368l.m2768c(alVar);
        if (c != null) {
            alVar = c;
        }
        m763b(alVar, i);
    }

    /* renamed from: b */
    public void m763b(AbstractC0268al alVar, int i) {
        Iterator it = this.f5429b.iterator();
        while (it.hasNext()) {
            C0785j jVar = (C0785j) it.next();
            if (jVar.f5431a == alVar) {
                jVar.f5432b += i;
                return;
            }
        }
        C0785j jVar2 = new C0785j(this);
        jVar2.f5431a = alVar;
        jVar2.f5432b = i;
        this.f5429b.add(jVar2);
    }

    /* renamed from: a */
    public void m765a(float f, float f2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        int i = 0;
        AbstractC0171m n = AbstractC0171m.m3436n(1);
        if (n == null) {
            AbstractC0789l.m670d("Warning: Creating missing wave team AI");
            n = new C0118a(1);
            n.f1245o = 100;
            n.f1269J = true;
        }
        Iterator it = this.f5429b.iterator();
        while (it.hasNext()) {
            C0785j jVar = (C0785j) it.next();
            for (int i2 = 0; i2 < jVar.f5432b; i2++) {
                AbstractC0210af a = jVar.f5431a.mo2799a();
                a.f5842dH = f + C0654f.m1512a(-85, 85, i + 0);
                a.f5843dI = f2 + C0654f.m1512a(-85, 85, i + 1);
                a.f1471bL = C0654f.m1512a(-180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, i + 2);
                i += 3;
                a.mo2305a(n);
                if (a.f5842dH < 0.0f) {
                    a.f5842dH = 0.0f;
                }
                if (a.f5843dI < 0.0f) {
                    a.f5843dI = 0.0f;
                }
                if (a.f5842dH > u.f5511bt.m3649f()) {
                    a.f5842dH = u.f5511bt.m3649f();
                }
                if (a.f5843dI > u.f5511bt.m3646g()) {
                    a.f5843dI = u.f5511bt.m3646g();
                }
                if (i2 == 0) {
                    u.f5522bE.m1628a(a);
                }
            }
        }
    }

    public String toString() {
        if (this.f5429b.size() == 0) {
            return "No units";
        }
        String str = "";
        boolean z = true;
        Iterator it = this.f5429b.iterator();
        while (it.hasNext()) {
            C0785j jVar = (C0785j) it.next();
            if (!z) {
                str = str + ", ";
            }
            z = false;
            str = (str + jVar.f5432b + "x ") + jVar.f5431a.mo2762e();
        }
        return str;
    }
}
