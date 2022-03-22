package com.corrodinggames.rts.gameFramework.p040k;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p012b.C0147a;
import com.corrodinggames.rts.game.p012b.C0154f;
import com.corrodinggames.rts.game.units.custom.C0311ag;
import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0325au;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p040k.p041a.C0764b;
import com.corrodinggames.rts.gameFramework.p040k.p041a.C0765c;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.k.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/c.class */
public class C0767c {
    /* renamed from: a */
    public static C0762a m801a(C0781f fVar, C0147a aVar) {
        try {
            AbstractC0789l u = AbstractC0789l.m638u();
            String str = aVar.f710b;
            if (str == null) {
                str = "NULL";
            }
            String b = aVar.m3708b("id");
            if (b != null && !b.equals("")) {
                str = b;
            }
            String trim = str.trim();
            String str2 = aVar.f712d;
            if (str2 != null) {
                EnumC0769e a = EnumC0769e.m799a(str2);
                if (a == null) {
                    C0781f.m780c("Error: Unknown type:" + str2 + " found on " + trim);
                    return null;
                }
                C0762a aVar2 = new C0762a();
                aVar2.f5331t = aVar;
                aVar2.f5318g = a;
                aVar2.f5313b = trim;
                int i = 0;
                Iterator it = fVar.f5406J.iterator();
                while (it.hasNext()) {
                    if (((C0762a) it.next()).f5313b.equalsIgnoreCase(aVar2.f5313b)) {
                        i++;
                    }
                }
                aVar2.f5314c = aVar2.f5313b;
                if (i != 0) {
                    aVar2.f5314c += "_" + i;
                }
                aVar2.f5312a = aVar.f710b;
                Integer d = aVar2.m813d("team");
                if (d != null) {
                    aVar2.f5336y = AbstractC0171m.m3436n(d.intValue());
                    if (aVar2.f5336y == null) {
                        aVar2.m810g("Cannot find team:" + d);
                        return null;
                    }
                }
                aVar2.f5329r = aVar2.m818b("delay", aVar2.f5329r);
                aVar2.f5327p = aVar2.m818b("repeatDelay", aVar2.f5327p);
                aVar2.f5326o = aVar2.m827a("repeatCount", aVar2.f5326o);
                aVar2.f5328q = aVar2.m818b("resetActivationAfter", aVar2.f5328q);
                aVar2.f5319h = aVar2.m822a("allToActivate", false);
                aVar2.f5315d.f5358b = aVar2.f5319h;
                aVar2.f5330s = aVar2.m818b("warmup", aVar2.f5330s);
                aVar2.f5334w = aVar2.m828a("textOffsetX", 0.0f);
                aVar2.f5335x = aVar2.m828a("textOffsetY", 0.0f);
                if (aVar2.f5318g == EnumC0769e.mapText || aVar2.f5318g == EnumC0769e.objective) {
                    aVar2.f5337z = aVar2.m826a("text", (C0311ag) null);
                }
                if (aVar2.f5318g == EnumC0769e.mapText) {
                    fVar.f5379i = true;
                    aVar2.f5338A = new Paint();
                    aVar2.f5338A.m4173a(true);
                    aVar2.f5338A.m4186a(Paint.Align.CENTER);
                    aVar2.f5338A.mo837a(Typeface.m4101a(Typeface.f239c, 1));
                    aVar2.f5338A.m4169b(aVar2.m815c("textColor", -1));
                    u.m723a(aVar2.f5338A, aVar2.m827a("textSize", 20));
                    if (aVar2.f5338A.m4155f() == 0) {
                        aVar2.m810g("Text has an alpha of 0");
                    }
                    String b2 = aVar2.m819b("style");
                    if (b2 != null && !b2.equals("")) {
                        if (b2.equalsIgnoreCase("arrow")) {
                            aVar2.f5339B = true;
                        } else {
                            aVar2.m810g("Unknown style: " + b2);
                        }
                    }
                }
                if (aVar2.f5318g == EnumC0769e.event_unitAdd) {
                    try {
                        aVar2.f5333v = C0325au.m3064a(aVar2.m819b("spawnUnits"), "<unitAdd>", "spawnUnits");
                    } catch (C0324at e) {
                        C0781f.m780c(e.getMessage());
                        return null;
                    }
                }
                if (aVar2.f5318g == EnumC0769e.event_teamTags) {
                    aVar2.m829a("addTeamTags");
                    aVar2.m829a("removeTeamTags");
                }
                if (aVar2.f5318g == EnumC0769e.trigger_unitDetect) {
                    aVar2.m830a(C0765c.m806b(aVar2));
                }
                if (aVar2.f5318g == EnumC0769e.trigger_teamTagDetect) {
                    aVar2.m830a(C0764b.m808b(aVar2));
                }
                aVar2.m829a("comment");
                aVar2.m829a("team");
                aVar2.m829a("globalMessage");
                aVar2.m829a("globalMessage_delayPerChar");
                aVar2.m829a("globalMessage_textColor");
                aVar2.m829a("debugMessage");
                aVar2.m829a("showOnMap");
                aVar2.m829a("text");
                aVar2.m829a("target");
                aVar2.m829a("onlyIfEmpty");
                if (aVar2.f5318g == EnumC0769e.event_move) {
                    aVar2.m829a("unload");
                }
                if (aVar2.f5318g == EnumC0769e.event_unitRemove) {
                    aVar2.m829a("onlyIfEmpty");
                }
                return aVar2;
            }
            C0781f.m780c("Error: no type field set for: " + trim);
            return null;
        } catch (RuntimeException e2) {
            throw new C0154f("Error while reading: " + aVar.m3709b(), e2);
        }
    }
}
