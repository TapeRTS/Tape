package com.corrodinggames.rts.game.units.p013a;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0465h;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.p032d.C0623f;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/p.class */
public abstract class AbstractC0194p extends AbstractC0197s {
    public AbstractC0194p(String str) {
        super("c__cut_" + str);
        this.f1354f = 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public int mo2416b(AbstractC0210af afVar, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public int mo2415c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: i */
    public AbstractC0268al mo2412i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public EnumC0199u mo2377e() {
        return EnumC0199u.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public EnumC0198t mo2376f() {
        return EnumC0198t.infoOnly;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: g */
    public boolean mo2413g() {
        return false;
    }

    /* renamed from: t */
    public AbstractC0515r m3389t() {
        AbstractC0515r rVar = null;
        Iterator it = AbstractC0854w.f5846dK.iterator();
        while (it.hasNext()) {
            AbstractC0854w wVar = (AbstractC0854w) it.next();
            if (wVar instanceof AbstractC0515r) {
                AbstractC0515r rVar2 = (AbstractC0515r) wVar;
                if (rVar2.f1494ci) {
                    rVar = rVar2;
                }
            }
        }
        return rVar;
    }

    /* renamed from: H */
    public boolean m3390H() {
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0515r t = m3389t();
        if (t != null) {
            return (t instanceof C0465h) || u.f5493bb == t.f1461bB;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public String mo2378d() {
        return mo2379b();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public String mo2414c(AbstractC0210af afVar) {
        return mo2380a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: o */
    public boolean mo3361o() {
        if (!m3390H()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: D */
    public boolean mo3364D() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: j */
    public float mo2375j() {
        if (!C0623f.f4404bx) {
            return 1.0f;
        }
        return 1.0f;
    }
}
