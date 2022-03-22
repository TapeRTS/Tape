package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.p011a.C0118a;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.AbstractC0202x;
import com.corrodinggames.rts.game.units.p013a.C0180b;
import com.corrodinggames.rts.game.units.p013a.C0186h;
import com.corrodinggames.rts.game.units.p013a.C0200v;
import com.corrodinggames.rts.game.units.p013a.EnumC0198t;
import com.corrodinggames.rts.game.units.p013a.EnumC0199u;
import com.corrodinggames.rts.game.units.p023d.AbstractC0416k;
import com.corrodinggames.rts.game.units.p023d.C0422o;
import com.corrodinggames.rts.game.units.p025e.AbstractC0444j;
import com.corrodinggames.rts.game.units.p025e.C0434b;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p029a.C0530e;
import com.corrodinggames.rts.gameFramework.p032d.p033a.AbstractC0611i;
import com.corrodinggames.rts.gameFramework.p032d.p033a.C0604c;
import com.corrodinggames.rts.gameFramework.p032d.p033a.C0606e;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p035f.C0657b;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h.class */
public class C0465h extends AbstractC0444j implements AbstractC0384d {

    /* renamed from: c */
    boolean f3291c;

    /* renamed from: d */
    static Paint f3292d;

    /* renamed from: e */
    static Paint f3293e;

    /* renamed from: f */
    static Paint f3294f;

    /* renamed from: p */
    String f3295p;

    /* renamed from: z */
    static ArrayList f3296z;

    /* renamed from: g */
    static AbstractC0197s f3297g = new AbstractC0197s("reloadUnits") { // from class: com.corrodinggames.rts.game.units.h.1
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2458a(AbstractC0210af afVar, boolean z) {
            if (C0465h.m2510w()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Reload all unit data from disk (for modding)";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            return "Reload units";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2502c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public int mo2503b(AbstractC0210af afVar, boolean z) {
            return -1;
        }

        /* renamed from: d_ */
        public EnumC0215ak mo2499i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: e */
        public EnumC0199u mo2449e() {
            return EnumC0199u.f1369a;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: f */
        public EnumC0198t mo2448f() {
            return EnumC0198t.f1364f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2500g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: h */
        public boolean mo2454h() {
            return true;
        }
    };

    /* renamed from: h */
    static AbstractC0197s f3298h = new AbstractC0197s("unitClone") { // from class: com.corrodinggames.rts.game.units.h.12
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Clones units at point x50";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            return "Unit Clone";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2502c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public int mo2503b(AbstractC0210af afVar, boolean z) {
            return -1;
        }

        /* renamed from: e_ */
        public EnumC0215ak mo2499i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: e */
        public EnumC0199u mo2449e() {
            return EnumC0199u.f1375g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: f */
        public EnumC0198t mo2448f() {
            return EnumC0198t.f1364f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2500g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2458a(AbstractC0210af afVar, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: h */
        public boolean mo2454h() {
            return true;
        }
    };

    /* renamed from: i */
    static AbstractC0197s f3299i = new AbstractC0197s("removeUnits") { // from class: com.corrodinggames.rts.game.units.h.14
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Delete all units at a point";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            return "Delete units at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public String mo2501c(AbstractC0210af afVar) {
            return mo2452a();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2502c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public int mo2503b(AbstractC0210af afVar, boolean z) {
            return -1;
        }

        /* renamed from: f_ */
        public EnumC0215ak mo2499i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: e */
        public EnumC0199u mo2449e() {
            return EnumC0199u.f1375g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: f */
        public EnumC0198t mo2448f() {
            return EnumC0198t.f1364f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2500g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2458a(AbstractC0210af afVar, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: h */
        public boolean mo2454h() {
            return true;
        }
    };

    /* renamed from: j */
    static AbstractC0197s f3300j = new AbstractC0197s("killUnits") { // from class: com.corrodinggames.rts.game.units.h.15
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Kill units at a point";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            return "Kill units at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public String mo2501c(AbstractC0210af afVar) {
            return mo2452a();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2502c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public int mo2503b(AbstractC0210af afVar, boolean z) {
            return -1;
        }

        /* renamed from: g_ */
        public EnumC0215ak mo2499i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: e */
        public EnumC0199u mo2449e() {
            return EnumC0199u.f1375g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: f */
        public EnumC0198t mo2448f() {
            return EnumC0198t.f1364f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2500g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2458a(AbstractC0210af afVar, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: h */
        public boolean mo2454h() {
            return true;
        }
    };

    /* renamed from: k */
    static AbstractC0197s f3301k = new AbstractC0197s("finishQueue") { // from class: com.corrodinggames.rts.game.units.h.16
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Finish all unit queues at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            return "Finish queue at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public String mo2501c(AbstractC0210af afVar) {
            return mo2452a();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2502c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public int mo2503b(AbstractC0210af afVar, boolean z) {
            return -1;
        }

        /* renamed from: h_ */
        public EnumC0215ak mo2499i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: e */
        public EnumC0199u mo2449e() {
            return EnumC0199u.f1375g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: f */
        public EnumC0198t mo2448f() {
            return EnumC0198t.f1364f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2500g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2458a(AbstractC0210af afVar, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: h */
        public boolean mo2454h() {
            return true;
        }
    };

    /* renamed from: l */
    static AbstractC0197s f3302l = new AbstractC0197s("nukeAt") { // from class: com.corrodinggames.rts.game.units.h.17
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Create a nuke at a point";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            return "Nuke at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public String mo2501c(AbstractC0210af afVar) {
            return mo2452a();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public int mo2502c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public int mo2503b(AbstractC0210af afVar, boolean z) {
            return -1;
        }

        /* renamed from: i_ */
        public EnumC0215ak mo2499i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: e */
        public EnumC0199u mo2449e() {
            return EnumC0199u.f1375g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: f */
        public EnumC0198t mo2448f() {
            return EnumC0198t.f1364f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: g */
        public boolean mo2500g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2458a(AbstractC0210af afVar, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: h */
        public boolean mo2454h() {
            return true;
        }
    };

    /* renamed from: m */
    static AbstractC0197s f3303m = new AbstractC0202x("freezeAI") { // from class: com.corrodinggames.rts.game.units.h.18
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Freeze high level AI logic (120secs)";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            return "Freeze AI";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: d */
        public String mo2450d() {
            String str = "Freeze AI";
            AbstractC0789l.m651u();
            C0465h K = C0465h.m2521K();
            if (K != null) {
                int i = -1;
                if (K.f1441bB instanceof C0118a) {
                    i = ((int) ((C0118a) K.f1441bB).f574bo) / 60;
                }
                if (i > 0) {
                    str = str + "(" + i + ")";
                }
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2458a(AbstractC0210af afVar, boolean z) {
            return afVar.f1441bB instanceof C0118a;
        }
    };

    /* renamed from: n */
    static AbstractC0197s f3304n = new AbstractC0202x("changeAlliance") { // from class: com.corrodinggames.rts.game.units.h.19
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Change selected player's alliance (players with the same letter are allied)";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            return "Ally:";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: d */
        public String mo2450d() {
            C0465h K;
            String str = "Ally";
            if (C0465h.m2521K() != null) {
                str = "Ally: " + K.f1441bB.m3705f();
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2458a(AbstractC0210af afVar, boolean z) {
            return true;
        }
    };

    /* renamed from: o */
    static AbstractC0197s f3305o = new AbstractC0202x("startRecording") { // from class: com.corrodinggames.rts.game.units.h.20
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Start recording a replay to file";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            return "Start Recording";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: d */
        public String mo2450d() {
            String str;
            if (!AbstractC0789l.m651u().f5490bJ.m1982i()) {
                str = "Start Recording";
            } else {
                str = "Stop Recording";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2458a(AbstractC0210af afVar, boolean z) {
            if (AbstractC0789l.m651u().f5490bJ.m1983h()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public boolean mo2497b(AbstractC0210af afVar) {
            return AbstractC0789l.m651u().f5490bJ.m1982i();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public boolean mo2496c(AbstractC0210af afVar, boolean z) {
            AbstractC0789l u = AbstractC0789l.m651u();
            AbstractC0789l.m683d("Start recording clicked");
            if (u.f5490bJ.m1983h()) {
                AbstractC0789l.m683d("Already in a replay");
                return false;
            }
            u.m733a(new Runnable() { // from class: com.corrodinggames.rts.game.units.h.20.1
                @Override // java.lang.Runnable
                public void run() {
                    AbstractC0789l u2 = AbstractC0789l.m651u();
                    if (!u2.f5490bJ.m1982i()) {
                        C0465h K = C0465h.m2521K();
                        u2.f5481bA.f4353b = true;
                        if (!u2.f5486bF.f4734z) {
                            long j = u2.f5486bF.f4731u;
                            u2.f5486bF.m1382J();
                            u2.f5486bF.f4731u = j;
                            u2.f5486bF.isGameStart_Hcat = true;
                            u2.f5585bg = 0;
                            u2.f5486bF.f4740R = u2.f5585bg + 1;
                            u2.f5486bF.m1229s();
                        }
                        String str = "[sandbox]" + u2.m719ac() + " [v" + u2.mo655o() + "] (" + C0654f.m1531a("d MMM yyyy HH.mm.ss") + ").replay";
                        u2.f5490bJ.m1988d(str);
                        u2.f5481bA.f4353b = false;
                        AbstractC0789l.m675f(null, "Replay started as: " + str);
                        C0465h K2 = C0465h.m2521K();
                        if (K2 == null || K == null) {
                            AbstractC0789l.m695b("Failed copySettingsFromAnotherEditor");
                            return;
                        }
                        K2.m2515a(K);
                        K2.f3295p = str;
                        return;
                    }
                    u2.f5490bJ.m1989d();
                }
            });
            return false;
        }
    };

    /* renamed from: q */
    static AbstractC0197s f3306q = new AbstractC0202x("startReplayPlayback") { // from class: com.corrodinggames.rts.game.units.h.2
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Start playback of last a replay";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            return "Start Playback";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: d */
        public String mo2450d() {
            String str;
            if (!AbstractC0789l.m651u().f5490bJ.m1983h()) {
                str = "Start Playback";
            } else {
                str = "Stop Playback";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2458a(AbstractC0210af afVar, boolean z) {
            return C0465h.m2521K().f3295p != null && !AbstractC0789l.m651u().f5490bJ.m1982i();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2453a(AbstractC0210af afVar) {
            return C0465h.m2521K().f3295p != null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public boolean mo2497b(AbstractC0210af afVar) {
            return AbstractC0789l.m651u().f5490bJ.m1983h();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public boolean mo2496c(AbstractC0210af afVar, boolean z) {
            final AbstractC0789l u = AbstractC0789l.m651u();
            final String str = C0465h.m2521K().f3295p;
            if (str == null) {
                u.m670h("No last replay found");
                return false;
            } else if (!u.f5490bJ.m1983h()) {
                final Runnable runnable = new Runnable() { // from class: com.corrodinggames.rts.game.units.h.2.1
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC0789l u2 = AbstractC0789l.m651u();
                        if (!u2.f5490bJ.m1983h()) {
                            boolean z2 = u2.f5474bt.f776A;
                            C0465h K = C0465h.m2521K();
                            u2.f5490bJ.f3949f = true;
                            u2.f5490bJ.m1990c(str);
                            u2.f5490bJ.f3949f = false;
                            C0465h K2 = C0465h.m2521K();
                            if (K2 == null || K == null) {
                                AbstractC0789l.m695b("Failed copySettingsFromAnotherEditor");
                            } else {
                                K2.m2515a(K);
                            }
                            u2.f5465be = true;
                            if (u2.f5474bt != null) {
                                u2.f5474bt.f776A = z2;
                            }
                            u2.f5525cB = true;
                            if (K2 != null) {
                                K2.m2520L();
                                return;
                            }
                            return;
                        }
                        AbstractC0789l.m683d("stopPlaybackRunnable: Already started");
                    }
                };
                final C0606e a = C0606e.m1853a("Start playback of last recording?", true);
                a.m1854a(C0652a.m1577a("menus.common.ok", new Object[0]), new AbstractC0611i() { // from class: com.corrodinggames.rts.game.units.h.2.2
                    @Override // com.corrodinggames.rts.gameFramework.p032d.p033a.AbstractC0611i
                    /* renamed from: a */
                    public boolean mo1221a(C0604c cVar) {
                        a.m1819i();
                        u.m733a(runnable);
                        return true;
                    }
                });
                u.f5481bA.m1762a(a);
                return false;
            } else {
                u.m733a(new Runnable() { // from class: com.corrodinggames.rts.game.units.h.2.3
                    @Override // java.lang.Runnable
                    public void run() {
                        AbstractC0789l u2 = AbstractC0789l.m651u();
                        if (!u2.f5490bJ.m1983h()) {
                            AbstractC0789l.m683d("stopPlaybackRunnable: Already stopped");
                            return;
                        }
                        u2.f5490bJ.m1989d();
                        u2.f5583bc = 1.0f;
                        u2.f5465be = true;
                        C0465h K = C0465h.m2521K();
                        if (K != null) {
                            u2.f5464bb = K.f1441bB;
                        }
                    }
                });
                return false;
            }
        }
    };

    /* renamed from: r */
    static AbstractC0197s f3307r = new AbstractC0202x("hideInterface") { // from class: com.corrodinggames.rts.game.units.h.3
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            String str = "Hide interface till the screen is clicked/pressed";
            if (AbstractC0789l.m710al()) {
                str = str + "\n-Enable mouse capture to also hide the mouse";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            return "Hide interface";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public boolean mo2496c(AbstractC0210af afVar, boolean z) {
            AbstractC0789l.m651u().f5525cB = true;
            return false;
        }
    };

    /* renamed from: s */
    static AbstractC0197s f3308s = new AbstractC0202x("freezeAllAI") { // from class: com.corrodinggames.rts.game.units.h.4
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Freeze full high level logic for all AI forever";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            return "Freeze AI";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: d */
        public String mo2450d() {
            String str = "Freeze AI";
            C0465h K = C0465h.m2521K();
            if (K != null && K.f3291c) {
                str = "Unfreeze AIs";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2458a(AbstractC0210af afVar, boolean z) {
            return true;
        }
    };

    /* renamed from: t */
    static AbstractC0197s f3309t = new AbstractC0202x("pauseGame") { // from class: com.corrodinggames.rts.game.units.h.5
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Pause Game";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            if (AbstractC0789l.m651u().f5583bc != 0.0f) {
                return "Pause: Off";
            }
            return "Pause: On";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public boolean mo2496c(AbstractC0210af afVar, boolean z) {
            AbstractC0789l u = AbstractC0789l.m651u();
            if (u.f5490bJ.m1983h()) {
            }
            if (u.f5583bc != 0.0f) {
                u.f5583bc = 0.0f;
                return false;
            }
            u.f5583bc = 1.0f;
            return false;
        }
    };

    /* renamed from: u */
    static AbstractC0197s f3310u = new AbstractC0202x("slowGame") { // from class: com.corrodinggames.rts.game.units.h.6
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Slow motion";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            if (AbstractC0789l.m651u().f5583bc != 0.1f) {
                return "Slow motion: Off";
            }
            return "Slow motion: On";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public boolean mo2496c(AbstractC0210af afVar, boolean z) {
            AbstractC0789l u = AbstractC0789l.m651u();
            if (u.f5490bJ.m1983h()) {
            }
            if (u.f5583bc == 1.0f) {
                u.f5583bc = 0.1f;
                return false;
            }
            u.f5583bc = 1.0f;
            return false;
        }
    };

    /* renamed from: v */
    static AbstractC0197s f3311v = new AbstractC0202x("fastForward") { // from class: com.corrodinggames.rts.game.units.h.7
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Fast Forward 1-5x";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            return "Fast Forward: " + AbstractC0789l.m651u().f5583bc;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: c */
        public boolean mo2496c(AbstractC0210af afVar, boolean z) {
            AbstractC0789l u = AbstractC0789l.m651u();
            if (u.f5490bJ.m1983h()) {
            }
            if (u.f5583bc == 1.0f) {
                u.f5583bc = 2.0f;
                return false;
            } else if (u.f5583bc == 2.0f) {
                u.f5583bc = 3.0f;
                return false;
            } else if (u.f5583bc == 3.0f) {
                u.f5583bc = 4.0f;
                return false;
            } else if (u.f5583bc == 4.0f) {
                u.f5583bc = 5.0f;
                return false;
            } else if (u.f5583bc == 5.0f) {
                u.f5583bc = 10.0f;
                return false;
            } else {
                u.f5583bc = 1.0f;
                return false;
            }
        }
    };

    /* renamed from: w */
    static AbstractC0197s f3312w = new AbstractC0202x("enableDebug") { // from class: com.corrodinggames.rts.game.units.h.8
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "Show hidden unit information in tooltips including flags, ammo, tags and resources";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            if (!AbstractC0789l.m651u().f5578aV) {
                return "Debug: Off";
            }
            return "Debug: On";
        }
    };

    /* renamed from: x */
    static AbstractC0197s f3313x = new AbstractC0202x("enableAIDebug") { // from class: com.corrodinggames.rts.game.units.h.9
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "AI debug view";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            AbstractC0789l.m651u();
            if (!C0118a.f509ab) {
                return "AI Debug: Off";
            }
            return "AI Debug: On";
        }
    };

    /* renamed from: y */
    static AbstractC0197s f3314y = new AbstractC0202x("enableTriggerDebug") { // from class: com.corrodinggames.rts.game.units.h.10
        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public String mo2452a() {
            return "For debugging autoTriggers. When enabled will log a message when any auto triggers fire on any selected units";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: b */
        public String mo2451b() {
            if (!AbstractC0789l.m651u().f5580aX) {
                return "Trigger Debug: Off";
            }
            return "Trigger Debug: On";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
        /* renamed from: a */
        public boolean mo2453a(AbstractC0210af afVar) {
            return AbstractC0789l.m651u().f5578aV;
        }
    };

    /* renamed from: C */
    static C0180b f3315C = new C0180b() { // from class: com.corrodinggames.rts.game.units.h.13
        @Override // com.corrodinggames.rts.game.units.p013a.C0180b
        public boolean isAvailable(AbstractC0197s sVar, AbstractC0210af afVar) {
            if (sVar instanceof C0186h) {
                sVar = ((C0186h) sVar).m3653t();
            }
            EnumC0502m mVar = C0465h.m2521K().f3319B;
            if (mVar == EnumC0502m.f3376a && C0465h.m2517a(sVar, afVar)) {
                return false;
            }
            if (mVar == EnumC0502m.f3382g && sVar == C0465h.f3297g) {
                return true;
            }
            if (sVar == C0465h.f3314y) {
                return C0465h.f3314y.mo2453a(afVar);
            }
            return mVar.mo2440a(sVar.mo2499i());
        }
    };

    /* renamed from: a */
    PointF[] f3316a = new PointF[6];

    /* renamed from: b */
    PointF[] f3317b = new PointF[this.f3316a.length];

    /* renamed from: A */
    C0657b f3318A = null;

    /* renamed from: B */
    EnumC0502m f3319B = EnumC0502m.f3376a;

    /* renamed from: f */
    public EnumC0215ak mo1648r() {
        return EnumC0215ak.f1634Y;
    }

    /* renamed from: w */
    public static boolean m2510w() {
        if (AbstractC0789l.m651u().f5490bJ.m1984g()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0384d
    /* renamed from: b */
    public PointF[] mo2485b() {
        return this.f3316a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0384d
    /* renamed from: c */
    public PointF[] mo2483c() {
        return this.f3317b;
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: v */
    public C0748e mo2407v() {
        if (this.f1441bB.f1230i == -1) {
            return null;
        }
        return f3186do[this.f1441bB.m3770M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public boolean mo2487a(AbstractC0210af afVar) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2419d() {
        if (this.f1520bz) {
            return C0434b.f3123b;
        }
        return C0434b.f3125d[this.f1441bB.m3770M()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: k */
    public C0748e mo2410k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: d */
    public C0748e mo2418d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: e */
    public boolean mo2416e() {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5480bz.m2044b(this.f5841dH, this.f5842dI, this.f5843dJ);
        this.f3387D = C0434b.f3123b;
        m406R(0);
        this.f1519by = false;
        u.f5475bu.m2166a(C0530e.f3576n, 0.8f, this.f5841dH, this.f5842dI);
        m2251bl();
        return true;
    }

    public C0465h(boolean z) {
        super(z);
        f3292d = new Paint();
        f3292d.m4448a(40, 0, 255, 0);
        f3292d.m4432a(true);
        f3292d.m4451a(2.0f);
        f3292d.m4444a(Paint.Cap.f202b);
        f3293e = new Paint();
        f3293e.m4442a(f3292d);
        f3293e.m4448a(55, 255, 60, 60);
        f3294f = new Paint();
        f3294f.m4448a(60, 255, 255, 255);
        m2089S(20);
        m2088T(20);
        this.f1447bO = 10.0f;
        this.f5841dH = -1000.0f;
        this.f5842dI = -1000.0f;
        this.f1448bP = this.f1447bO;
        this.f1451bZ = 170000.0f;
        this.f1450bY = this.f1451bZ;
        this.f3387D = C0434b.f3123b;
        for (int i = 0; i < this.f3316a.length; i++) {
            this.f3316a[i] = new PointF();
            this.f3317b[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m2518a(float f, AbstractC0384d dVar) {
        AbstractC0515r rVar = (AbstractC0515r) dVar;
        PointF[] b = dVar.mo2485b();
        PointF[] c = dVar.mo2483c();
        AbstractC0210af V = rVar.m2378V();
        rVar.f3436aC = V != null;
        if (V != null) {
            for (int i = 0; i < b.length; i++) {
                PointF pointF = b[i];
                PointF pointF2 = c[i];
                pointF.f224a = C0654f.m1562a(pointF.f224a, pointF2.f224a, 0.1f * f);
                pointF.f225b = C0654f.m1562a(pointF.f225b, pointF2.f225b, 0.1f * f);
                pointF.f224a += (pointF2.f224a - pointF.f224a) * 0.04f * f;
                pointF.f225b += (pointF2.f225b - pointF.f225b) * 0.04f * f;
                float f2 = V.f1447bO * 0.75f;
                if (C0654f.m1500c(pointF.f224a - pointF2.f224a) < 1.0f) {
                    pointF2.f224a = C0654f.m1489d(-f2, f2);
                }
                if (C0654f.m1500c(pointF.f225b - pointF2.f225b) < 1.0f) {
                    pointF2.f225b = C0654f.m1489d(-f2, f2);
                }
            }
        } else if (b[0].f224a != 0.0f || b[0].f225b != 0.0f) {
            for (int i2 = 0; i2 < b.length; i2++) {
                PointF pointF3 = b[i2];
                PointF pointF4 = c[i2];
                pointF3.f224a = 0.0f;
                pointF3.f225b = 0.0f;
                pointF4.f224a = 0.0f;
                pointF4.f225b = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p025e.AbstractC0444j, com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo1653a(float f) {
        if (f < 0.3f) {
            f = 0.3f;
        }
        if (this.f3488an && this.f1441bB.m3745b()) {
            int i = 0;
            while (true) {
                if (i < AbstractC0171m.f1275a) {
                    AbstractC0171m n = AbstractC0171m.m3688n(i);
                    if (n != null && !n.m3745b()) {
                        mo3544c(n);
                        break;
                    }
                    i++;
                } else {
                    break;
                }
            }
        }
        super.mo1653a(f);
        if (!this.f1520bz) {
            m2518a(f, this);
        }
        this.f1450bY = this.f1451bZ;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo2021a(float f, boolean z) {
        if (!this.f1520bz) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: e */
    public float mo2415e(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: f */
    public float mo2414f(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo2013c(float f) {
        if (!super.mo2013c(f)) {
            return false;
        }
        AbstractC0789l.m651u();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: a */
    public void mo2423a(AbstractC0210af afVar, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: x */
    public boolean mo2533x() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: y */
    public int mo2477y() {
        return 850000;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: b */
    public float mo2513b(AbstractC0210af afVar) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: c */
    public float mo2512c(AbstractC0210af afVar) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: m */
    public float mo2408m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: b */
    public float mo2422b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: z */
    public float mo2406z() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: A */
    public float mo2436A() {
        return 9.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: B */
    public float mo2435B() {
        return 9.35f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: c */
    public float mo2421c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: l */
    public boolean mo2409l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: C */
    public float mo2434C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: D */
    public float mo2433D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public void mo2467a(AbstractC0197s sVar, boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (sVar instanceof C0500k) {
            C0500k kVar = (C0500k) sVar;
            boolean z2 = true;
            if (z) {
                z2 = 1 == 0;
            }
            if (kVar.f3372a) {
                z2 = !z2;
            }
            if (z2) {
                AbstractC0171m mVar = null;
                int i = this.f1441bB.f1230i + 1;
                while (true) {
                    if (i < AbstractC0171m.f1275a) {
                        AbstractC0171m n = AbstractC0171m.m3688n(i);
                        if (n != null && !n.m3745b()) {
                            mVar = n;
                            break;
                        }
                        i++;
                    } else {
                        break;
                    }
                }
                if (mVar == null && this.f1441bB.f1230i < 4) {
                    mVar = AbstractC0171m.m3688n(this.f1441bB.f1230i + 1);
                    if (mVar == null) {
                        AbstractC0789l.m683d("Sandbox adding new team:" + this.f1441bB.f1230i);
                        C0118a aVar = new C0118a(this.f1441bB.f1230i + 1);
                        mVar = aVar;
                        mVar.f1236o = 1;
                        mVar.f1246v = true;
                        mVar.f1247w = true;
                        if (!this.f3291c) {
                            aVar.f574bo = 0.0f;
                        } else {
                            aVar.f574bo = Float.MAX_VALUE;
                        }
                    }
                }
                if (mVar == null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < AbstractC0171m.f1275a) {
                            AbstractC0171m n2 = AbstractC0171m.m3688n(i2);
                            if (n2 != null && !n2.m3745b()) {
                                mVar = n2;
                                break;
                            }
                            i2++;
                        } else {
                            break;
                        }
                    }
                }
                if (mVar != null) {
                    mo3544c(mVar);
                    if (!u.f5490bJ.m1983h()) {
                        u.f5464bb = mVar;
                    }
                }
            } else {
                AbstractC0171m mVar2 = null;
                int i3 = this.f1441bB.f1230i - 1;
                while (true) {
                    if (i3 >= 0) {
                        AbstractC0171m n3 = AbstractC0171m.m3688n(i3);
                        if (n3 != null && !n3.m3745b()) {
                            mVar2 = n3;
                            break;
                        }
                        i3--;
                    } else {
                        break;
                    }
                }
                if (mVar2 == null) {
                    int i4 = AbstractC0171m.f1275a - 1;
                    while (true) {
                        if (i4 >= 0) {
                            AbstractC0171m n4 = AbstractC0171m.m3688n(i4);
                            if (n4 != null && !n4.m3745b()) {
                                mVar2 = n4;
                                break;
                            }
                            i4--;
                        } else {
                            break;
                        }
                    }
                }
                if (mVar2 != null) {
                    mo3544c(mVar2);
                    if (!u.f5490bJ.m1983h()) {
                        u.f5464bb = mVar2;
                    }
                }
            }
        }
        if (sVar instanceof C0499j) {
            C0499j jVar = (C0499j) sVar;
            boolean z3 = true;
            if (z) {
                z3 = 1 == 0;
            }
            if (jVar.f3370a) {
                z3 = !z3;
            }
            ArrayList h = u.f5488bH.m1434h();
            if (h.size() == 0) {
                this.f3318A = null;
            } else if (z3) {
                if (this.f3318A == null) {
                    this.f3318A = (C0657b) h.get(0);
                } else {
                    C0657b bVar = null;
                    boolean z4 = false;
                    Iterator it = h.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C0657b bVar2 = (C0657b) it.next();
                        if (z4) {
                            bVar = bVar2;
                            break;
                        } else if (bVar2 == this.f3318A) {
                            z4 = true;
                        }
                    }
                    this.f3318A = bVar;
                }
            } else if (this.f3318A == null) {
                this.f3318A = (C0657b) h.get(h.size() - 1);
            } else {
                C0657b bVar3 = null;
                boolean z5 = false;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(h);
                Collections.reverse(arrayList);
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0657b bVar4 = (C0657b) it2.next();
                    if (z5) {
                        bVar3 = bVar4;
                        break;
                    } else if (bVar4 == this.f3318A) {
                        z5 = true;
                    }
                }
                this.f3318A = bVar3;
            }
        }
        if (sVar instanceof C0498i) {
            this.f1441bB.money_max(10000);
        }
        if (sVar instanceof C0501l) {
            ((C0501l) sVar).m2445l();
        }
    }

    /* renamed from: K */
    static C0465h m2521K() {
        return AbstractC0789l.m651u().f5481bA.m1716i();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public void mo2516a(AbstractC0197s sVar, boolean z, PointF pointF, AbstractC0210af afVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (sVar instanceof C0186h) {
            sVar = ((C0186h) sVar).m3653t();
        }
        if (sVar == f3297g) {
            if (m2510w()) {
                AbstractC0789l.m695b("Not reloading units: Need to keep network sync");
                return;
            } else if (!z) {
                if (u.f5488bH.m1436f() == 0) {
                    u.f5481bA.m1754a("No custom units to reload");
                    return;
                }
                AbstractC0789l.m683d("Reload units requested");
                u.f5488bH.m1445a(true);
                Iterator it = AbstractC0171m.m3730c().iterator();
                while (it.hasNext()) {
                    AbstractC0171m mVar = (AbstractC0171m) it.next();
                    if (mVar instanceof C0118a) {
                        ((C0118a) mVar).m4105aa();
                    }
                }
                u.f5481bA.m1754a("All custom unit files reloaded");
            } else {
                return;
            }
        }
        if (sVar == f3299i || sVar == f3300j || sVar == f3298h) {
            int i = 0;
            if (!z) {
                Iterator it2 = AbstractC0210af.m3550bt().iterator();
                while (it2.hasNext()) {
                    AbstractC0210af afVar2 = (AbstractC0210af) it2.next();
                    if ((afVar2 instanceof AbstractC0210af) && C0654f.m1561a(afVar2.f5841dH, afVar2.f5842dI, pointF.f224a, pointF.f225b) < 2500.0f) {
                        if (sVar == f3299i) {
                            if (afVar2.f1539cp == null && afVar2.f1540cq == null) {
                                afVar2.m3557bU();
                                if ((afVar2 instanceof AbstractC0515r) && afVar2.mo2748bw()) {
                                    u.f5483bC.m971a((AbstractC0515r) afVar2);
                                }
                            }
                        } else if (sVar == f3300j) {
                            if (afVar2.f1539cp == null && afVar2.f1540cq == null) {
                                afVar2.f1450bY = -1.0f;
                            }
                        } else if (sVar != f3298h) {
                            continue;
                        } else if (i > 4) {
                            return;
                        } else {
                            if (!afVar2.mo2748bw() && !(afVar2 instanceof C0209ae) && !afVar2.f1520bz && afVar2.f1539cp == null && afVar2.f1540cq == null) {
                                i++;
                                AbstractC0268al r = afVar2.mo1648r();
                                for (int i2 = -25; i2 < 25; i2++) {
                                    AbstractC0210af a = r.mo3453a();
                                    a.f5841dH = afVar2.f5841dH + (i2 * 0.5f) + 1.0f;
                                    a.f5842dI = afVar2.f5842dI + (i2 * 0.5f) + 1.0f;
                                    a.mo3582a(afVar2.f1441bB);
                                    AbstractC0171m.m3725c(a);
                                    a.f1444bL = C0654f.m1540a((AbstractC0854w) afVar2, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 25 + i2);
                                    if (a instanceof AbstractC0515r) {
                                        ((AbstractC0515r) a).f3425ao = true;
                                    }
                                }
                            }
                        }
                    }
                }
                return;
            }
            return;
        }
        if (sVar == f3302l) {
            if (!z) {
                C0163f a2 = C0422o.m2667a(this, pointF.f224a, pointF.f225b, pointF.f224a, pointF.f225b);
                if (a2 != null) {
                    a2.f5843dJ = 100.0f;
                    a2.f917j = null;
                }
            } else {
                return;
            }
        }
        if (sVar != f3301k) {
            if (sVar == f3303m) {
                AbstractC0171m mVar2 = this.f1441bB;
                if (mVar2 instanceof C0118a) {
                    C0118a aVar = (C0118a) mVar2;
                    if (aVar.f574bo > 0.0f) {
                        aVar.f574bo = 0.0f;
                    } else {
                        aVar.f574bo = 10800.0f;
                    }
                }
            }
            if (sVar == f3304n) {
                AbstractC0171m mVar3 = this.f1441bB;
                mVar3.f1236o++;
                if (mVar3.f1236o > 4) {
                    mVar3.f1236o = 0;
                }
            }
            if (sVar == f3308s) {
                boolean z2 = false;
                boolean z3 = false;
                Iterator it3 = AbstractC0171m.m3730c().iterator();
                while (it3.hasNext()) {
                    AbstractC0171m mVar4 = (AbstractC0171m) it3.next();
                    if (mVar4 instanceof C0118a) {
                        if (((C0118a) mVar4).f574bo > 0.0f) {
                            z2 = true;
                        }
                        z3 = true;
                    }
                }
                boolean z4 = !z2;
                if (!z3) {
                    z4 = !this.f3291c;
                }
                this.f3291c = z4;
                m2520L();
            }
            if (sVar == f3309t) {
            }
            if (sVar == f3310u) {
            }
            if (sVar == f3311v) {
            }
            if (sVar == f3312w) {
                u.f5578aV = !u.f5578aV;
            }
            if (sVar == f3313x) {
                C0118a.f509ab = !C0118a.f509ab;
            }
            if (sVar == f3314y) {
                u.f5580aX = !u.f5580aX;
            }
            super.mo2516a(sVar, z, pointF, afVar);
        } else if (!z) {
            Iterator it4 = AbstractC0210af.m3550bt().iterator();
            while (it4.hasNext()) {
                AbstractC0854w wVar = (AbstractC0854w) it4.next();
                if ((wVar instanceof AbstractC0515r) && (wVar instanceof AbstractC0416k) && C0654f.m1561a(wVar.f5841dH, wVar.f5842dI, pointF.f224a, pointF.f225b) < 2500.0f) {
                    ((AbstractC0416k) wVar).mo2687df();
                }
            }
        }
    }

    /* renamed from: L */
    public void m2520L() {
        Iterator it = AbstractC0171m.m3730c().iterator();
        while (it.hasNext()) {
            AbstractC0171m mVar = (AbstractC0171m) it.next();
            if (mVar instanceof C0118a) {
                C0118a aVar = (C0118a) mVar;
                if (!this.f3291c) {
                    aVar.f574bo = 0.0f;
                } else {
                    aVar.f574bo = Float.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m2517a(AbstractC0197s sVar, AbstractC0210af afVar) {
        if (sVar instanceof C0186h) {
            sVar = ((C0186h) sVar).m3653t();
        }
        if (sVar == f3303m || sVar == f3310u || sVar == f3311v || sVar == f3301k || sVar == f3299i || sVar == f3298h || sVar == f3312w || sVar == f3304n || sVar == f3305o || sVar == f3306q || sVar == f3307r || sVar == f3314y) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m2514a(ArrayList arrayList, int i) {
        if (i == 1) {
            f3296z = new ArrayList();
            f3296z.add(new C0500k(true, false));
            f3296z.add(new C0500k(true, true));
            f3296z.add(new C0500k(false, false));
            f3296z.add(new C0501l(true, false));
            f3296z.add(new C0501l(true, true));
            f3296z.add(new C0501l(false, false));
            f3296z.add(new C0499j(true, false));
            f3296z.add(new C0499j(true, true));
            f3296z.add(new C0499j(false, false));
            ArrayList arrayList2 = new ArrayList();
            arrayList2.add(new C0498i());
            arrayList2.add(f3297g);
            arrayList2.add(f3299i);
            arrayList2.add(f3298h);
            arrayList2.add(f3300j);
            arrayList2.add(f3302l);
            arrayList2.add(f3301k);
            arrayList2.add(f3308s);
            arrayList2.add(f3309t);
            arrayList2.add(f3310u);
            arrayList2.add(f3311v);
            arrayList2.add(f3312w);
            arrayList2.add(f3304n);
            arrayList2.add(f3305o);
            arrayList2.add(f3306q);
            arrayList2.add(f3307r);
            if (AbstractC0789l.f5549ao) {
                arrayList2.add(f3313x);
            }
            arrayList2.add(f3314y);
            Iterator it = arrayList2.iterator();
            while (it.hasNext()) {
                f3296z.add(new C0186h((AbstractC0197s) it.next(), f3315C, true));
            }
            ArrayList arrayList3 = new ArrayList();
            arrayList3.addAll(EnumC0215ak.f1639ad);
            Collections.sort(arrayList3, new Comparator() { // from class: com.corrodinggames.rts.game.units.h.11
                /* renamed from: a */
                public int compare(AbstractC0268al alVar, AbstractC0268al alVar2) {
                    AbstractC0210af c = AbstractC0210af.m3542c(alVar);
                    AbstractC0210af c2 = AbstractC0210af.m3542c(alVar2);
                    int compareTo = Boolean.valueOf(c.mo3374bD()).compareTo(Boolean.valueOf(c2.mo3374bD()));
                    if (compareTo != 0) {
                        return compareTo;
                    }
                    int compareTo2 = Boolean.valueOf(alVar.mo3442j()).compareTo(Boolean.valueOf(alVar2.mo3442j()));
                    if (compareTo2 != 0) {
                        return compareTo2;
                    }
                    int compareTo3 = Boolean.valueOf(c.mo3375bC()).compareTo(Boolean.valueOf(c2.mo3375bC()));
                    if (compareTo3 != 0) {
                        return compareTo3;
                    }
                    return alVar.mo3434u().m3098a(alVar2.mo3434u());
                }
            });
            Iterator it2 = arrayList3.iterator();
            while (it2.hasNext()) {
                AbstractC0268al alVar = (AbstractC0268al) it2.next();
                if (!(alVar == EnumC0215ak.f1618I || alVar.mo3443i().equals("test_tank") || alVar.mo3443i().equals("missing") || alVar == EnumC0215ak.f1605v || alVar == EnumC0215ak.f1600q || alVar == EnumC0215ak.f1627R || alVar == EnumC0215ak.f1617H || alVar == EnumC0215ak.f1632W || alVar == EnumC0215ak.f1633X || alVar == EnumC0215ak.f1634Y || !(AbstractC0210af.m3542c(alVar) instanceof AbstractC0515r) || ((alVar instanceof C0368l) && !((C0368l) alVar).f2522au))) {
                    C0186h hVar = new C0186h(new C0200v(alVar, 1, null), f3315C);
                    boolean z = false;
                    Iterator it3 = f3296z.iterator();
                    while (it3.hasNext()) {
                        if (((AbstractC0197s) it3.next()).equals(hVar)) {
                            z = true;
                        }
                    }
                    if (!z) {
                        f3296z.add(hVar);
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: M */
    public ArrayList mo2468M() {
        AbstractC0789l.m651u();
        return f3296z;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: E */
    public boolean mo2432E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: g */
    public float mo2413g(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: F */
    public boolean mo2431F() {
        return AbstractC0789l.m651u().f5479by.renderExtraShadows && !this.f1520bz;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: G */
    public float mo2430G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: H */
    public float mo2429H() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: o_ */
    public boolean mo1649o_() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0513p, com.corrodinggames.rts.game.units.AbstractC0515r
    /* renamed from: I */
    public boolean mo2428I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: d */
    public boolean mo2417d(AbstractC0210af afVar) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: J */
    public boolean mo2427J() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: a */
    public float mo2424a(AbstractC0210af afVar, float f, C0163f fVar) {
        return super.mo2424a(afVar, 0.0f, fVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: N */
    public void mo2519N() {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0210af
    /* renamed from: O */
    public boolean mo2426O() {
        return true;
    }

    /* renamed from: a */
    public void m2515a(C0465h hVar) {
        this.f3295p = hVar.f3295p;
        this.f3291c = hVar.f3291c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo1642a(C0690ap apVar) {
        apVar.m1175c(0);
        apVar.m1184a(this.f3319B);
        super.mo1642a(apVar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0515r, com.corrodinggames.rts.game.units.AbstractC0210af, com.corrodinggames.rts.gameFramework.AbstractC0567az, com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo2019a(C0707k kVar) {
        kVar.m1079d();
        this.f3319B = (EnumC0502m) kVar.m1083b(EnumC0502m.class);
        super.mo2019a(kVar);
    }
}
