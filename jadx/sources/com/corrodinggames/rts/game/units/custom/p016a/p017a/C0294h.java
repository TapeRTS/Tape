package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.C0376s;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p027g.C0464c;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0814ag;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/h.class */
public class C0294h extends AbstractC0286a {

    /* renamed from: a */
    boolean f1818a;

    /* renamed from: b */
    boolean f1819b;

    /* renamed from: c */
    boolean f1820c;

    /* renamed from: e */
    boolean f1822e;

    /* renamed from: f */
    float f1823f;

    /* renamed from: g */
    float f1824g;

    /* renamed from: h */
    C0376s f1825h;

    /* renamed from: j */
    C0814ag f1827j;

    /* renamed from: d */
    int f1821d = Integer.MIN_VALUE;

    /* renamed from: i */
    float f1826i = -1.0f;

    /* renamed from: a */
    public static void m3198a(C0368l lVar, C0809ab abVar, String str, String str2, C0301c cVar, String str3, boolean z) {
        boolean booleanValue = abVar.m594a(str, str2 + "deleteSelf", (Boolean) false).booleanValue();
        if (booleanValue) {
            C0294h hVar = new C0294h();
            hVar.f1818a = booleanValue;
            cVar.f1920W.add(hVar);
        }
        boolean booleanValue2 = abVar.m594a(str, str2 + "switchToNeutralTeam", (Boolean) false).booleanValue();
        boolean booleanValue3 = abVar.m594a(str, str2 + "switchToAggressiveTeam", (Boolean) false).booleanValue();
        if (booleanValue2 || booleanValue3) {
            C0294h hVar2 = new C0294h();
            hVar2.f1819b = booleanValue2;
            hVar2.f1820c = booleanValue3;
            cVar.f1920W.add(hVar2);
        }
        int intValue = abVar.m580b(str, str2 + "setBodyRotation", (Integer) Integer.MIN_VALUE).intValue();
        if (intValue != Integer.MIN_VALUE) {
            C0294h hVar3 = new C0294h();
            hVar3.f1821d = intValue;
            cVar.f1920W.add(hVar3);
        }
        float floatValue = abVar.m592a(str, str2 + "setBuilt", Float.valueOf(-1.0f)).floatValue();
        if (floatValue > 1.0f) {
            throw new C0324at("[" + str + "] setBuilt cannot be greater than 1");
        }
        boolean booleanValue4 = abVar.m594a(str, str2 + "clearAllActionCooldowns", (Boolean) false).booleanValue();
        float floatValue2 = abVar.m575c(str, str2 + "addAllActionCooldownsTime", Float.valueOf(0.0f)).floatValue();
        if (floatValue2 == 0.0f) {
            floatValue2 = abVar.m575c(str, str2 + "addAllActionCooldownsFor", Float.valueOf(0.0f)).floatValue();
        }
        float floatValue3 = abVar.m575c(str, str2 + "addActionCooldownTime", Float.valueOf(0.0f)).floatValue();
        if (floatValue3 == 0.0f) {
            floatValue3 = abVar.m575c(str, str2 + "addActionCooldownFor", Float.valueOf(0.0f)).floatValue();
        }
        C0376s a = abVar.m607a(lVar, str, str2 + "addActionCooldownApplyToActions", (C0376s) null);
        C0814ag a2 = abVar.m595a(str, str2 + "offsetSelfAbsolute", (C0814ag) null);
        if (a != null && floatValue3 <= 0.0f) {
            throw new C0324at("[" + str + "]addActionCooldownApplyToActions requires addActionCooldownTime to be set");
        } else if (floatValue3 > 0.0f || floatValue2 > 0.0f || booleanValue4 || floatValue >= 0.0f || a2 != null) {
            C0294h hVar4 = new C0294h();
            hVar4.f1822e = booleanValue4;
            hVar4.f1823f = floatValue2;
            hVar4.f1824g = floatValue3;
            hVar4.f1825h = a;
            hVar4.f1826i = floatValue;
            hVar4.f1827j = a2;
            cVar.f1920W.add(hVar4);
        }
    }

    @Override // com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a
    /* renamed from: a */
    public boolean mo3194a(C0367k kVar, AbstractC0197s sVar, PointF pointF, AbstractC0210af afVar, int i) {
        if (this.f1818a) {
            kVar.m3319bU();
            if (kVar.mo2643bw()) {
                AbstractC0789l.m638u().f5520bC.m957a(kVar);
            }
        }
        if (this.f1819b) {
            kVar.mo2854c(AbstractC0171m.f1236g);
        }
        if (this.f1820c) {
            kVar.mo2854c(AbstractC0171m.f1235f);
        }
        if (this.f1821d != Integer.MIN_VALUE) {
            kVar.mo2171h(this.f1821d);
        }
        if (this.f1822e) {
            C0464c.m2435c(kVar, AbstractC0197s.f1356h);
        }
        if (this.f1823f > 0.0f) {
            C0464c.m2439a(kVar, AbstractC0197s.f1356h, (int) this.f1823f);
        }
        if (this.f1824g > 0.0f) {
            if (this.f1825h == null) {
                C0464c.m2439a(kVar, sVar.m3387J(), (int) this.f1824g);
            } else {
                Iterator it = this.f1825h.m2723a().iterator();
                while (it.hasNext()) {
                    C0464c.m2439a(kVar, ((AbstractC0197s) it.next()).m3387J(), (int) this.f1824g);
                }
            }
        }
        if (this.f1826i >= 0.0f) {
            kVar.m3291q(this.f1826i);
        }
        if (this.f1827j == null) {
            return true;
        }
        kVar.m2225b(kVar.f5842dH + this.f1827j.f5735a, kVar.f5843dI + this.f1827j.f5736b);
        kVar.f5844dJ += this.f1827j.f5737c;
        kVar.f1498cm = true;
        return true;
    }
}
