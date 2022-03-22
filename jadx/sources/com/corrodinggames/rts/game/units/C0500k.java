package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.p013a.AbstractC0202x;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.game.units.p013a.EnumC0199u;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.p032d.C0623f;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/k.class */
class C0500k extends AbstractC0202x {

    /* renamed from: a */
    boolean f3372a;

    /* renamed from: b */
    boolean f3373b;

    public C0500k(boolean z, boolean z2) {
        super("changeTeam" + z + "d:" + z2);
        this.f3372a = z;
        this.f3373b = z2;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public String mo2379b() {
        if (this.f3373b) {
            return "Selected player";
        }
        if (this.f3372a) {
            return "<- Set player";
        }
        return "Set player ->";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: d */
    public String mo2378d() {
        if (this.f3373b) {
            AbstractC0789l u = AbstractC0789l.m638u();
            AbstractC0171m mVar = null;
            Iterator it = AbstractC0854w.f5846dK.iterator();
            while (it.hasNext()) {
                AbstractC0854w wVar = (AbstractC0854w) it.next();
                if (wVar instanceof AbstractC0515r) {
                    AbstractC0515r rVar = (AbstractC0515r) wVar;
                    if (rVar.f1494ci && u.f5518bA.m1664m(rVar)) {
                        mVar = rVar.f1461bB;
                    }
                }
            }
            String str = "";
            if (mVar != null) {
                str = str + "Team - " + (mVar.f1239i + 1) + "";
            }
            return str;
        } else if (this.f3372a) {
            return "<-";
        } else {
            return "->";
        }
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public String mo2380a() {
        return "Change targeted player for editor";
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: j */
    public float mo2375j() {
        if (!C0623f.f4404bx) {
            return 0.8f;
        }
        return 0.5f;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: k */
    public int mo2374k() {
        if (this.f3373b) {
            return 2;
        }
        return 4;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0202x, com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public EnumC0198t mo2376f() {
        if (this.f3373b) {
            return EnumC0198t.infoOnly;
        }
        return super.mo2376f();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0202x, com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public EnumC0199u mo2377e() {
        if (this.f3373b) {
            return EnumC0199u.infoOnly;
        }
        return super.mo2377e();
    }
}
