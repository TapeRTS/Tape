package com.corrodinggames.rts.gameFramework.p040k;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0651e;
import com.corrodinggames.rts.gameFramework.p032d.C0627j;
import com.corrodinggames.rts.gameFramework.p032d.EnumC0632n;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.k.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/d.class */
public class C0768d {
    /* renamed from: a */
    public static void m814a(C0781f fVar, C0762a aVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        boolean z = false;
        if (!aVar.f5318j) {
            z = true;
        }
        fVar.m806a(aVar);
        aVar.f5317i = true;
        aVar.f5318j = true;
        aVar.f5319k = u.f5467bh;
        boolean z2 = false;
        if (aVar.m833b("globalMessage") != null) {
            C0627j a = u.f5481bA.f4278e.m1697a(null, aVar.m833b("globalMessage"));
            if (a != null) {
                String b = aVar.m833b("globalMessage_delayPerChar");
                if (b != null) {
                    if (b.equals("slow")) {
                        a.f4430e = 18;
                    } else {
                        int b2 = aVar.m832b("globalMessage_delayPerChar", -1);
                        if (b2 != -1) {
                            a.f4430e = b2;
                        }
                    }
                }
                int c = aVar.m829c("globalMessage_textColor", -1);
                if (c != -1) {
                    a.f4431f = c;
                }
            }
            z2 = true;
        }
        String b3 = aVar.m833b("debugMessage");
        if (b3 != null) {
            aVar.m823h("Debug: " + b3);
            if (u.f5465be && u.f5578aV) {
                Hcat_Multiplaye.m1335a((String) null, "Debug: " + b3);
            }
            z2 = true;
        }
        if (aVar.m836a("showOnMap", false)) {
            u.f5485bE.m1687a(aVar.m835b(), aVar.m831c(), EnumC0632n.f4507d);
            z2 = true;
        }
        if (aVar.f5315g == EnumC0769e.f5359a) {
            if (z) {
                aVar.m823h("objective met");
            }
            z2 = true;
        }
        if (aVar.f5315g == EnumC0769e.f5369k) {
            z2 = true;
        }
        if (aVar.f5315g == EnumC0769e.f5367i) {
            z2 = true;
        }
        if (aVar.f5315g == EnumC0769e.f5368j) {
            z2 = true;
        }
        if (aVar.f5315g == EnumC0769e.f5365g) {
            z2 = true;
        }
        if (aVar.f5315g == EnumC0769e.f5366h) {
            z2 = true;
            u.m701b(aVar.m835b(), aVar.m831c());
        }
        if (aVar.f5315g == EnumC0769e.f5363e) {
            aVar.f5324v.m3283a(aVar.m835b(), aVar.m831c(), 0.0f, 0.0f, aVar.m846a(), false, null, null, false);
            z2 = true;
        }
        if (aVar.f5315g == EnumC0769e.f5361c) {
            AbstractC0171m a2 = aVar.m846a();
            if (a2 == null) {
                aVar.m824g("Team not set for changeCredits");
                return;
            }
            Integer d = aVar.m827d("set");
            if (d != null) {
                a2.money = d.intValue();
            }
            Integer d2 = aVar.m827d("add");
            if (d2 != null) {
                a2.money_max(d2.intValue());
            }
        } else if (aVar.f5315g == EnumC0769e.f5362d) {
            AbstractC0171m a3 = aVar.m846a();
            if (a3 == null) {
                aVar.m824g("Team not set for event_teamTags");
                return;
            }
            String a4 = aVar.m838a("addTeamTags", (String) null);
            if (a4 != null) {
                a3.m3790b(C0364h.m3115a(a4));
            }
            String a5 = aVar.m838a("removeTeamTags", (String) null);
            if (a5 != null) {
                a3.m3776c(C0364h.m3115a(a5));
            }
        } else if (aVar.f5315g == EnumC0769e.f5360b) {
            String b4 = aVar.m833b("target");
            if (b4 == null) {
                C0781f.m781i("Move trigger has no target id:" + aVar.f5312a);
                return;
            }
            PointF f = fVar.m786f(b4);
            if (f == null) {
                C0781f.m781i("Move trigger: Cannot find target for:" + aVar.f5312a + " target:" + b4);
                return;
            }
            AbstractC0171m a6 = aVar.m846a();
            if (a6 == null) {
                C0781f.m781i("Team not set map trigger:" + aVar.f5312a);
                return;
            }
            int i = 0;
            C0651e b5 = u.f5494bN.m1954b(a6);
            Iterator it = AbstractC0210af.f1473bj.iterator();
            while (it.hasNext()) {
                AbstractC0210af afVar = (AbstractC0210af) it.next();
                if (afVar.f1441bB == a6 && (afVar instanceof AbstractC0515r) && aVar.m845a(afVar) && aVar.m834b(afVar)) {
                    b5.m1616a((AbstractC0515r) afVar);
                    i++;
                }
            }
            b5.m1626a(f.f224a, f.f225b);
            if (z) {
                fVar.m797b("firstActivation: move at:" + u.f5467bh + " for teamId:" + a6.f1230i + " to targetId:" + b4 + " (#units:" + i + ")");
            }
            if (aVar.m833b("unload") != null) {
                Iterator it2 = AbstractC0210af.f1473bj.iterator();
                while (it2.hasNext()) {
                    AbstractC0210af afVar2 = (AbstractC0210af) it2.next();
                    if (afVar2.f1441bB == a6 && (afVar2 instanceof AbstractC0515r) && aVar.m845a(afVar2) && aVar.m834b(afVar2) && afVar2.mo2631cc()) {
                        AbstractC0515r rVar = (AbstractC0515r) afVar2;
                        C0651e b6 = u.f5494bN.m1954b(a6);
                        b6.f4568e = true;
                        b6.m1616a(rVar);
                        b6.m1621a(rVar.mo2632ca());
                    }
                }
            }
        } else {
            if (aVar.f5315g == EnumC0769e.f5364f) {
                C0835m mVar = new C0835m();
                Iterator it3 = AbstractC0210af.f1473bj.iterator();
                while (it3.hasNext()) {
                    AbstractC0210af afVar3 = (AbstractC0210af) it3.next();
                    if ((afVar3 instanceof AbstractC0515r) && aVar.m845a(afVar3) && aVar.m834b(afVar3)) {
                        mVar.add(afVar3);
                    }
                }
                if (mVar.size() > 0) {
                    Iterator it4 = mVar.iterator();
                    while (it4.hasNext()) {
                        ((AbstractC0210af) it4.next()).m3608bU();
                    }
                }
                z2 = true;
            }
            if (!z2) {
                aVar.m823h("Trigger activated with no effect");
            }
        }
    }
}
