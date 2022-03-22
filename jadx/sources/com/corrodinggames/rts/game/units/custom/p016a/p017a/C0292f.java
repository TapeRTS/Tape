package com.corrodinggames.rts.game.units.custom.p016a.p017a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0307ac;
import com.corrodinggames.rts.game.units.custom.C0311ag;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.p016a.AbstractC0286a;
import com.corrodinggames.rts.game.units.custom.p016a.C0301c;
import com.corrodinggames.rts.game.units.custom.p020d.C0345a;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/f.class */
public class C0292f extends AbstractC0286a {

    /* renamed from: a */
    C0311ag f1806a;

    /* renamed from: b */
    C0311ag f1807b;

    /* renamed from: c */
    C0311ag f1808c;

    /* renamed from: d */
    C0311ag f1809d;

    /* renamed from: e */
    C0311ag f1810e;

    /* renamed from: f */
    String f1811f;

    /* renamed from: g */
    static final Pattern f1812g = Pattern.compile("%\\{([^\\]]*?)\\}");

    /* renamed from: a */
    public static void m3416a(C0368l lVar, C0809ab abVar, String str, String str2, C0301c cVar, String str3, boolean z) {
        C0311ag a = C0307ac.m3356a(abVar, str, "showMessageToPlayer", (String) null);
        C0311ag a2 = C0307ac.m3356a(abVar, str, "showMessageToAllPlayers", (String) null);
        C0311ag a3 = C0307ac.m3356a(abVar, str, "showMessageToAllEnemyPlayers", (String) null);
        C0311ag a4 = C0307ac.m3356a(abVar, str, "showQuickWarLogToPlayer", (String) null);
        C0311ag a5 = C0307ac.m3356a(abVar, str, "showQuickWarLogToAllPlayers", (String) null);
        String b = abVar.m579b(str, "debugMessage", (String) null);
        if (a != null || a2 != null || a3 != null || a4 != null || a5 != null || b != null) {
            C0292f fVar = new C0292f();
            fVar.f1806a = a;
            fVar.f1807b = a2;
            fVar.f1808c = a3;
            fVar.f1809d = a4;
            fVar.f1810e = a5;
            fVar.f1811f = b;
            cVar.f1950W.add(fVar);
        }
    }

    /* renamed from: a */
    public static String m3417a(C0367k kVar, String str) {
        if (!str.contains("%{")) {
            return str;
        }
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        Matcher matcher = f1812g.matcher(str);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                AbstractC0789l.m695b("convertInlineBlocks: Too many loops while parsing: " + str);
                return str;
            }
            String str2 = null;
            String trim = matcher.group(1).trim();
            if (trim.equals("self.id")) {
                str2 = "" + kVar.f5835dA;
            }
            if (trim.equals("self.playerName")) {
                str2 = "" + kVar.f1441bB.f1238q;
            }
            if (trim.equals("self.teamName")) {
                str2 = "" + kVar.f1441bB.m3757f();
            }
            if (trim.equals("self.kills")) {
                str2 = "" + kVar.f1467cw;
            }
            if (trim.startsWith("self.resource.")) {
                C0345a h = kVar.mo1660r().m2920h(trim.substring("self.resource.".length()));
                if (h == null) {
                    str2 = "[Undefined resource: " + h + "]";
                } else {
                    str2 = C0654f.m1513c(h.mo3221a(kVar));
                }
            }
            if (str2 == null) {
                str2 = "[Unknown key: " + trim + "]";
            }
            matcher.appendReplacement(stringBuffer, str2);
        }
        matcher.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public String m3415b(C0367k kVar, String str) {
        if (str == null) {
            str = null;
        }
        return m3417a(kVar, str);
    }

    /* renamed from: a */
    public boolean mo3409a(C0367k kVar, AbstractC0197s sVar, PointF pointF, AbstractC0210af afVar, int i) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (this.f1806a != null && kVar.f1441bB == u.f5464bb) {
            Hcat_Multiplaye.m1335a((String) null, m3415b(kVar, this.f1806a.m3314b()));
        }
        if (this.f1807b != null) {
            Hcat_Multiplaye.m1335a((String) null, m3415b(kVar, this.f1807b.m3314b()));
        }
        if (!(this.f1808c == null || u.f5464bb == null || !kVar.f1441bB.m3778c(u.f5464bb))) {
            Hcat_Multiplaye.m1335a((String) null, m3415b(kVar, this.f1808c.m3314b()));
        }
        if (this.f1809d != null && kVar.f1441bB == u.f5464bb) {
            u.f5481bA.f4279f.m1636a(m3415b(kVar, this.f1809d.m3314b()));
        }
        if (this.f1810e != null) {
            u.f5481bA.f4279f.m1636a(m3415b(kVar, this.f1810e.m3314b()));
        }
        if (this.f1811f == null || !u.f5465be || !u.f5578aV) {
            return true;
        }
        Hcat_Multiplaye.m1335a((String) null, kVar.mo1660r().mo3494i() + "(" + kVar.f5835dA + ") Debug: " + m3415b(kVar, this.f1811f));
        return true;
    }
}
