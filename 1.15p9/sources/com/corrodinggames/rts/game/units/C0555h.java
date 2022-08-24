package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.p013a.AbstractC0229x;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0207b;
import com.corrodinggames.rts.game.units.p013a.C0213h;
import com.corrodinggames.rts.game.units.p013a.C0227v;
import com.corrodinggames.rts.game.units.p013a.EnumC0225t;
import com.corrodinggames.rts.game.units.p013a.EnumC0226u;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;
import com.corrodinggames.rts.game.units.p024d.NukeLaucher;
import com.corrodinggames.rts.game.units.p026e.AbstractC0529j;
import com.corrodinggames.rts.game.units.p026e.Builder;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0765c;
import com.corrodinggames.rts.gameFramework.p037f.p038a.C0767e;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0841ae;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h.class */
public class C0555h extends AbstractC0529j implements InterfaceC0469d {

    /* renamed from: a */
    PointF[] f3757a;

    /* renamed from: b */
    PointF[] f3758b;

    /* renamed from: c */
    boolean f3759c;

    /* renamed from: d */
    static Paint f3760d;

    /* renamed from: e */
    static Paint f3761e;

    /* renamed from: f */
    static Paint f3762f;

    /* renamed from: g */
    static C0934e f3763g;

    /* renamed from: r */
    String f3764r;

    /* renamed from: C */
    static ArrayList f3765C;

    /* renamed from: D */
    C0824b f3766D;

    /* renamed from: E */
    AbstractC0603o f3767E;

    /* renamed from: F */
    AbstractC0596n f3768F;

    /* renamed from: G */
    String f3769G;

    /* renamed from: H */
    boolean f3770H;

    /* renamed from: I */
    String f3771I;

    /* renamed from: h */
    static Action f3772h = new Action("reloadUnits") { // from class: com.corrodinggames.rts.game.units.h.1
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            if (C0555h.m3489w()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Reload all unit data from disk (for modding)";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Reload units";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5221c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public int mo5222b(Unit unit, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: d_ */
        public UnitType mo6536i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: e */
        public EnumC0226u mo5220e() {
            return EnumC0226u.f1474a;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5218f() {
            return EnumC0225t.f1469f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5217g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: h */
        public boolean mo3475h() {
            return true;
        }
    };

    /* renamed from: i */
    static Action f3773i = new Action("reloadOnlyActiveUnits") { // from class: com.corrodinggames.rts.game.units.h.12
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            if (C0555h.m3489w()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Reload data only for active units on map (for modding). This is a faster than reload but will be incomplete.";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Quick reload";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5221c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public int mo5222b(Unit unit, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: k */
        public UnitType mo6536i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: e */
        public EnumC0226u mo5220e() {
            return EnumC0226u.f1474a;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5218f() {
            return EnumC0225t.f1469f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5217g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: h */
        public boolean mo3475h() {
            return true;
        }
    };

    /* renamed from: j */
    static Action f3774j = new Action("unitClone") { // from class: com.corrodinggames.rts.game.units.h.16
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Clones units at point x50";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Unit Clone";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5221c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public int mo5222b(Unit unit, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: k */
        public UnitType mo6536i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: e */
        public EnumC0226u mo5220e() {
            return EnumC0226u.f1480g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5218f() {
            return EnumC0225t.f1469f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5217g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: h */
        public boolean mo3475h() {
            return true;
        }
    };

    /* renamed from: k */
    static Action f3775k = new Action("removeUnits") { // from class: com.corrodinggames.rts.game.units.h.17
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Delete all units at a point";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Delete units at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: e_ */
        public boolean mo5219e_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5221c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public int mo5222b(Unit unit, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f_ */
        public UnitType mo6536i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: e */
        public EnumC0226u mo5220e() {
            return EnumC0226u.f1480g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5218f() {
            return EnumC0225t.f1469f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5217g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: h */
        public boolean mo3475h() {
            return true;
        }
    };

    /* renamed from: l */
    static Action f3776l = new Action("killUnits") { // from class: com.corrodinggames.rts.game.units.h.18
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Kill units at a point";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Kill units at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: e_ */
        public boolean mo5219e_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5221c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public int mo5222b(Unit unit, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g_ */
        public UnitType mo6536i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: e */
        public EnumC0226u mo5220e() {
            return EnumC0226u.f1480g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5218f() {
            return EnumC0225t.f1469f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5217g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: h */
        public boolean mo3475h() {
            return true;
        }
    };

    /* renamed from: m */
    static Action f3777m = new Action("finishQueue") { // from class: com.corrodinggames.rts.game.units.h.19
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Finish all unit queues at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Finish queue at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: e_ */
        public boolean mo5219e_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5221c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public int mo5222b(Unit unit, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: h_ */
        public UnitType mo6536i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: e */
        public EnumC0226u mo5220e() {
            return EnumC0226u.f1480g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5218f() {
            return EnumC0225t.f1469f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5217g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: h */
        public boolean mo3475h() {
            return true;
        }
    };

    /* renamed from: n */
    static Action f3778n = new Action("nukeAt") { // from class: com.corrodinggames.rts.game.units.h.20
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Create a nuke at a point";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Nuke at";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: e_ */
        public boolean mo5219e_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public int mo5221c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public int mo5222b(Unit unit, boolean z) {
            return -1;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: i_ */
        public UnitType mo6536i() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: e */
        public EnumC0226u mo5220e() {
            return EnumC0226u.f1480g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: f */
        public EnumC0225t mo5218f() {
            return EnumC0225t.f1469f;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: g */
        public boolean mo5217g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: h */
        public boolean mo3475h() {
            return true;
        }
    };

    /* renamed from: o */
    static Action f3779o = new AbstractC0229x("freezeAI") { // from class: com.corrodinggames.rts.game.units.h.21
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Freeze high level AI logic (120secs)";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Freeze AI";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: d */
        public String mo3470d() {
            String str = "Freeze AI";
            GameEngine.m1234A();
            C0555h m3500L = C0555h.m3500L();
            if (m3500L != null) {
                int i = -1;
                if (m3500L.f1608bV instanceof C0136a) {
                    i = ((int) ((C0136a) m3500L.f1608bV).f618bF) / 60;
                }
                if (i > 0) {
                    str = str + "(" + i + ")";
                }
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            return unit.f1608bV instanceof C0136a;
        }
    };

    /* renamed from: p */
    static Action f3780p = new AbstractC0229x("changeAlliance") { // from class: com.corrodinggames.rts.game.units.h.22
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Change selected player's alliance (players with the same letter are allied)";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Ally:";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: d */
        public String mo3470d() {
            C0555h m3500L;
            String str = "Ally";
            if (C0555h.m3500L() != null) {
                str = "Ally: " + m3500L.f1608bV.m5361h();
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            return true;
        }
    };

    /* renamed from: q */
    static Action f3781q = new AbstractC0229x("startRecording") { // from class: com.corrodinggames.rts.game.units.h.2
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Start recording a replay to file";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Start Recording";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: d */
        public String mo3470d() {
            String str;
            if (!GameEngine.m1234A().f6120cb.m2629i()) {
                str = "Start Recording";
            } else {
                str = "Stop Recording";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            if (GameEngine.m1234A().f6120cb.m2630h()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3473a(Unit unit) {
            return GameEngine.m1234A().f6120cb.m2629i();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public boolean mo3467c(Unit unit, boolean z) {
            GameEngine m1234A = GameEngine.m1234A();
            GameEngine.PrintLog("Start recording clicked");
            if (m1234A.f6120cb.m2630h()) {
                GameEngine.PrintLog("Already in a replay");
                return false;
            }
            m1234A.m1194a(new Runnable() { // from class: com.corrodinggames.rts.game.units.h.2.1
                @Override // java.lang.Runnable
                public void run() {
                    GameEngine m1234A2 = GameEngine.m1234A();
                    if (!m1234A2.f6120cb.m2629i()) {
                        C0555h m3500L = C0555h.m3500L();
                        m1234A2.f6111bS.f5191b = true;
                        if (!m1234A2.networkEngine.f5564B) {
                            long j = m1234A2.networkEngine.f5561w;
                            m1234A2.networkEngine.f5476o = true;
                            m1234A2.networkEngine.m1781R();
                            m1234A2.networkEngine.f5561w = j;
                            m1234A2.networkEngine.f5533bm = true;
                            m1234A2.f6233bx = 0;
                            m1234A2.networkEngine.f5574X = m1234A2.f6233bx + 1;
                            m1234A2.networkEngine.m1611w();
                        }
                        String str = "[sandbox]" + m1234A2.m1167ak() + " [v" + m1234A2.mo5479u() + "] (" + C0758f.m2331a("d MMM yyyy HH.mm.ss") + ").replay";
                        m1234A2.f6120cb.m2635d(str);
                        m1234A2.f6111bS.f5191b = false;
                        GameEngine.m1122f(null, "Replay started as: " + str);
                        C0555h m3500L2 = C0555h.m3500L();
                        if (m3500L2 != null && m3500L != null) {
                            m3500L2.m3494a(m3500L);
                            m3500L2.f3764r = str;
                            return;
                        }
                        GameEngine.m1145b("Failed copySettingsFromAnotherEditor");
                        return;
                    }
                    m1234A2.f6120cb.m2636d();
                }
            });
            return false;
        }
    };

    /* renamed from: s */
    static Action f3782s = new AbstractC0229x("startReplayPlayback") { // from class: com.corrodinggames.rts.game.units.h.3
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Start playback of last a replay";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Start Playback";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: d */
        public String mo3470d() {
            String str;
            if (!GameEngine.m1234A().f6120cb.m2630h()) {
                str = "Start Playback";
            } else {
                str = "Stop Playback";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            boolean m2629i = GameEngine.m1234A().f6120cb.m2629i();
            C0555h m3500L = C0555h.m3500L();
            return (m3500L == null || m3500L.f3764r == null || m2629i) ? false : true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public boolean mo3472b(Unit unit) {
            C0555h m3500L = C0555h.m3500L();
            return (m3500L == null || m3500L.f3764r == null) ? false : true;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3473a(Unit unit) {
            return GameEngine.m1234A().f6120cb.m2630h();
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public boolean mo3467c(Unit unit, boolean z) {
            final GameEngine m1234A = GameEngine.m1234A();
            final String str = C0555h.m3500L().f3764r;
            if (str == null) {
                m1234A.m1116i("No last replay found");
                return false;
            } else if (!m1234A.f6120cb.m2630h()) {
                final Runnable runnable = new Runnable() { // from class: com.corrodinggames.rts.game.units.h.3.1
                    @Override // java.lang.Runnable
                    public void run() {
                        GameEngine m1234A2 = GameEngine.m1234A();
                        if (!m1234A2.f6120cb.m2630h()) {
                            boolean z2 = m1234A2.f6104bL.f840E;
                            C0555h m3500L = C0555h.m3500L();
                            boolean z3 = m1234A2.f6261dp;
                            boolean z4 = m1234A2.f6262dq;
                            m1234A2.f6120cb.f4472f = true;
                            m1234A2.f6120cb.m2637c(str);
                            m1234A2.f6120cb.f4472f = false;
                            m1234A2.f6261dp = z3;
                            m1234A2.f6262dq = z4;
                            C0555h m3500L2 = C0555h.m3500L();
                            if (m3500L2 != null && m3500L != null) {
                                m3500L2.m3494a(m3500L);
                            } else {
                                GameEngine.m1145b("Failed copySettingsFromAnotherEditor");
                            }
                            m1234A2.f6094bv = true;
                            if (m1234A2.f6104bL != null) {
                                m1234A2.f6104bL.f840E = z2;
                            }
                            m1234A2.f6155cT = true;
                            if (m3500L2 != null) {
                                m3500L2.m3499M();
                                return;
                            }
                            return;
                        }
                        GameEngine.PrintLog("stopPlaybackRunnable: Already started");
                    }
                };
                final C0767e m2166a = C0767e.m2166a("Start playback of last recording?", true);
                m2166a.m2167a(C0820a.m1882a("menus.common.ok", new Object[0]), new AbstractC0772i() { // from class: com.corrodinggames.rts.game.units.h.3.2
                    @Override // com.corrodinggames.rts.gameFramework.p037f.p038a.AbstractC0772i
                    /* renamed from: a */
                    public boolean mo1607a(C0765c c0765c) {
                        m2166a.m2129i();
                        m1234A.m1194a(runnable);
                        return true;
                    }
                });
                m1234A.f6111bS.m2026a(m2166a);
                return false;
            } else {
                m1234A.m1194a(new Runnable() { // from class: com.corrodinggames.rts.game.units.h.3.3
                    @Override // java.lang.Runnable
                    public void run() {
                        GameEngine m1234A2 = GameEngine.m1234A();
                        if (!m1234A2.f6120cb.m2630h()) {
                            GameEngine.PrintLog("stopPlaybackRunnable: Already stopped");
                            return;
                        }
                        m1234A2.f6120cb.m2636d();
                        m1234A2.f6231bt = 1.0f;
                        m1234A2.f6094bv = true;
                        C0555h m3500L = C0555h.m3500L();
                        if (m3500L != null) {
                            m1234A2.f6093bs = m3500L.f1608bV;
                        }
                    }
                });
                return false;
            }
        }
    };

    /* renamed from: t */
    static Action f3783t = new AbstractC0229x("hideInterface") { // from class: com.corrodinggames.rts.game.units.h.4
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            String str = "Hide interface till the screen is clicked/pressed";
            if (GameEngine.m1157au()) {
                str = str + "\n-Enable mouse capture to also hide the mouse";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Hide interface";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public boolean mo3467c(Unit unit, boolean z) {
            GameEngine.m1234A().f6155cT = true;
            return false;
        }
    };

    /* renamed from: u */
    static Action f3784u = new AbstractC0229x("freezeAllAI") { // from class: com.corrodinggames.rts.game.units.h.5
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Freeze full high level logic for all AI forever";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Freeze AI";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: d */
        public String mo3470d() {
            String str = "Freeze AI";
            C0555h m3500L = C0555h.m3500L();
            if (m3500L != null && m3500L.f3759c) {
                str = "Unfreeze AIs";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public boolean mo3471a(Unit unit, boolean z) {
            return true;
        }
    };

    /* renamed from: v */
    static Action f3785v = new AbstractC0229x("pauseGame") { // from class: com.corrodinggames.rts.game.units.h.6
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Pause Game";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            if (GameEngine.m1234A().f6231bt != 0.0f) {
                return "Pause: Off";
            }
            return "Pause: On";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public boolean mo3467c(Unit unit, boolean z) {
            GameEngine m1234A = GameEngine.m1234A();
            if (m1234A.f6120cb.m2630h()) {
            }
            if (m1234A.f6231bt != 0.0f) {
                m1234A.f6231bt = 0.0f;
                return false;
            }
            m1234A.f6231bt = 1.0f;
            return false;
        }
    };

    /* renamed from: w */
    static Action f3786w = new AbstractC0229x("slowGame") { // from class: com.corrodinggames.rts.game.units.h.7
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Slow motion";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            if (GameEngine.m1234A().f6231bt != 0.1f) {
                return "Slow motion: Off";
            }
            return "Slow motion: On";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public boolean mo3467c(Unit unit, boolean z) {
            GameEngine m1234A = GameEngine.m1234A();
            if (m1234A.f6120cb.m2630h()) {
            }
            if (m1234A.f6231bt == 1.0f) {
                m1234A.f6231bt = 0.1f;
                return false;
            }
            m1234A.f6231bt = 1.0f;
            return false;
        }
    };

    /* renamed from: x */
    static Action f3787x = new AbstractC0229x("fastForward") { // from class: com.corrodinggames.rts.game.units.h.8
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Fast Forward 1-5x";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            return "Fast Forward: " + GameEngine.m1234A().f6231bt;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public boolean mo3467c(Unit unit, boolean z) {
            GameEngine m1234A = GameEngine.m1234A();
            if (m1234A.f6120cb.m2630h()) {
            }
            if (m1234A.f6231bt == 1.0f) {
                m1234A.f6231bt = 2.0f;
                return false;
            } else if (m1234A.f6231bt == 2.0f) {
                m1234A.f6231bt = 3.0f;
                return false;
            } else if (m1234A.f6231bt == 3.0f) {
                m1234A.f6231bt = 4.0f;
                return false;
            } else if (m1234A.f6231bt == 4.0f) {
                m1234A.f6231bt = 5.0f;
                return false;
            } else if (m1234A.f6231bt == 5.0f) {
                m1234A.f6231bt = 10.0f;
                return false;
            } else {
                m1234A.f6231bt = 1.0f;
                return false;
            }
        }
    };

    /* renamed from: y */
    static Action f3788y = new AbstractC0229x("search") { // from class: com.corrodinggames.rts.game.units.h.9
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: j */
        public C0934e mo5216j() {
            return C0555h.f3763g;
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Search for units";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            GameEngine.m1234A();
            C0555h m3500L = C0555h.m3500L();
            if (m3500L != null && m3500L.f3768F == AbstractC0596n.f3857e) {
                return "Search: " + C0758f.m2296b(m3500L.f3769G, 8);
            }
            return "Search units";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: c */
        public boolean mo3467c(Unit unit, boolean z) {
            GameEngine m1234A = GameEngine.m1234A();
            if (m1234A.f6120cb.m2631g()) {
                m1234A.m1137c("Reply active", "Changing search filter is currently not supported while recording a replay");
                return false;
            }
            C0841ae c0841ae = new C0841ae() { // from class: com.corrodinggames.rts.game.units.h.9.1
                @Override // com.corrodinggames.rts.gameFramework.p041i.C0841ae
                /* renamed from: a */
                public void mo1605a(String str) {
                    GameEngine.PrintLog("Searching for: " + str);
                    GameEngine m1234A2 = GameEngine.m1234A();
                    if (m1234A2.f6120cb.m2631g()) {
                        m1234A2.m1137c("Reply active", "Changing search filter is currently not supported while recording a replay");
                        return;
                    }
                    C0555h m3500L = C0555h.m3500L();
                    if (m3500L == null) {
                        GameEngine.PrintLog("search: No editor");
                    } else if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
                        GameEngine.PrintLog("search: No text entered");
                        if (m3500L.f3768F == AbstractC0596n.f3857e) {
                            m3500L.f3768F = AbstractC0596n.f3853a;
                        }
                        m3500L.f3769G = null;
                        m3500L.f3770H = true;
                        C0797f.m2065J();
                    } else {
                        m3500L.f3768F = AbstractC0596n.f3857e;
                        m3500L.f3769G = str;
                        m3500L.f3770H = true;
                        C0797f.m2065J();
                    }
                }

                @Override // com.corrodinggames.rts.gameFramework.p041i.C0841ae
                /* renamed from: a */
                public void mo1606a() {
                }
            };
            c0841ae.f5635b = "Search units by internal name or text title.";
            c0841ae.f5638e = "Search units";
            c0841ae.f5639f = "Search";
            c0841ae.f5640g = "Cancel";
            C0831ad.m1758a(c0841ae);
            return false;
        }
    };

    /* renamed from: z */
    static Action f3789z = new AbstractC0229x("enableDebug") { // from class: com.corrodinggames.rts.game.units.h.10
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "Show hidden unit information in tooltips including flags, ammo, tags and resources";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            if (!GameEngine.m1234A().f6225bl) {
                return "Debug: Off";
            }
            return "Debug: On";
        }
    };

    /* renamed from: A */
    static Action f3790A = new AbstractC0229x("enableAIDebug") { // from class: com.corrodinggames.rts.game.units.h.11
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "AI debug view";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            GameEngine.m1234A();
            if (!C0136a.f552ar) {
                return "AI Debug: Off";
            }
            return "AI Debug: On";
        }
    };

    /* renamed from: B */
    static Action f3791B = new AbstractC0229x("enableTriggerDebug") { // from class: com.corrodinggames.rts.game.units.h.13
        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: a */
        public String mo5225a() {
            return "For debugging autoTriggers. When enabled will log a message when any auto triggers fire on any selected units";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public String mo5223b() {
            if (!GameEngine.m1234A().f6227bn) {
                return "Trigger Debug: Off";
            }
            return "Trigger Debug: On";
        }

        @Override // com.corrodinggames.rts.game.units.p013a.Action
        /* renamed from: b */
        public boolean mo3472b(Unit unit) {
            return GameEngine.m1234A().f6225bl;
        }
    };

    /* renamed from: J */
    static C0207b f3792J = new C0207b() { // from class: com.corrodinggames.rts.game.units.h.15
        @Override // com.corrodinggames.rts.game.units.p013a.C0207b
        public boolean isAvailable(Action action, Unit unit) {
            if (action instanceof C0213h) {
                action = ((C0213h) action).m5235n_();
            }
            C0555h m3500L = C0555h.m3500L();
            if (m3500L == null) {
                return true;
            }
            AbstractC0596n abstractC0596n = m3500L.f3768F;
            if (abstractC0596n == AbstractC0596n.f3853a && C0555h.m3496a(action, unit)) {
                return false;
            }
            if (abstractC0596n == AbstractC0596n.f3856d && action == C0555h.f3772h) {
                return true;
            }
            if (abstractC0596n == AbstractC0596n.f3856d && action == C0555h.f3773i) {
                return true;
            }
            if (abstractC0596n == AbstractC0596n.f3857e && action == C0555h.f3788y) {
                return true;
            }
            if (action == C0555h.f3791B && !C0555h.f3791B.mo3472b(unit)) {
                return false;
            }
            return abstractC0596n.m3345a(action.mo6536i());
        }
    };

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: f */
    public UnitType mo6543r() {
        return UnitType.editorOrBuilder;
    }

    /* renamed from: w */
    public static boolean m3489w() {
        if (GameEngine.m1234A().f6120cb.m2631g()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: b */
    public PointF[] mo3453b() {
        return this.f3757a;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: c */
    public PointF[] mo3450c() {
        return this.f3758b;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public C0934e mo3252v() {
        if (this.f1608bV.f1305k == -1) {
            return null;
        }
        return f3645dL[this.f1608bV.m5441O()];
    }

    /* renamed from: K */
    public static void m3501K() {
        f3763g = GameEngine.m1234A().f6107bO.mo930a(C0067R.drawable.icon_search);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public boolean mo3455a(Unit unit) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3265d() {
        if (this.f1606bT) {
            return Builder.f3582b;
        }
        return Builder.f3584d[this.f1608bV.m5441O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3256k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3264d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3262e() {
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6110bR.m2537b(this.f6951ek, this.f6952el, this.f6953em);
        this.f3880L = Builder.f3582b;
        m472S(0);
        this.f1605bS = false;
        m1234A.f6105bM.m2997a(C0631e.f4044o, 0.8f, this.f6951ek, this.f6952el);
        mo3081bq();
        return true;
    }

    public C0555h(boolean z) {
        super(z);
        this.f3757a = new PointF[6];
        this.f3758b = new PointF[this.f3757a.length];
        f3760d = new Paint();
        f3760d.m6286a(40, 0, 255, 0);
        f3760d.mo6267a(true);
        f3760d.m6289a(2.0f);
        f3760d.m6281a(Paint.Cap.f201b);
        f3761e = new Paint();
        f3761e.m6278a(f3760d);
        f3761e.m6286a(55, 255, 60, 60);
        f3762f = new Paint();
        f3762f.m6286a(60, 255, 255, 255);
        this.f3766D = null;
        this.f3767E = AbstractC0603o.f3860a;
        this.f3768F = AbstractC0596n.f3853a;
        this.f3770H = true;
        m2879T(20);
        m2878U(20);
        this.f1620ch = 10.0f;
        this.f6951ek = -1000.0f;
        this.f6952el = -1000.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 170000.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = Builder.f3582b;
        for (int i = 0; i < this.f3757a.length; i++) {
            this.f3757a[i] = new PointF();
            this.f3758b[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m3497a(float f, InterfaceC0469d interfaceC0469d) {
        AbstractC0623y abstractC0623y = (AbstractC0623y) interfaceC0469d;
        PointF[] mo3453b = interfaceC0469d.mo3453b();
        PointF[] mo3450c = interfaceC0469d.mo3450c();
        Unit m3221X = abstractC0623y.m3221X();
        abstractC0623y.f3961aM = m3221X != null;
        if (m3221X != null) {
            for (int i = 0; i < mo3453b.length; i++) {
                PointF pointF = mo3453b[i];
                PointF pointF2 = mo3450c[i];
                pointF.f227a = C0758f.m2362a(pointF.f227a, pointF2.f227a, 0.1f * f);
                pointF.f228b = C0758f.m2362a(pointF.f228b, pointF2.f228b, 0.1f * f);
                pointF.f227a += (pointF2.f227a - pointF.f227a) * 0.04f * f;
                pointF.f228b += (pointF2.f228b - pointF.f228b) * 0.04f * f;
                float f2 = m3221X.f1620ch * 0.75f;
                if (C0758f.m2289c(pointF.f227a - pointF2.f227a) < 1.0f) {
                    pointF2.f227a = C0758f.m2277d(-f2, f2);
                }
                if (C0758f.m2289c(pointF.f228b - pointF2.f228b) < 1.0f) {
                    pointF2.f228b = C0758f.m2277d(-f2, f2);
                }
            }
        } else if (mo3453b[0].f227a != 0.0f || mo3453b[0].f228b != 0.0f) {
            for (int i2 = 0; i2 < mo3453b.length; i2++) {
                PointF pointF3 = mo3453b[i2];
                PointF pointF4 = mo3450c[i2];
                pointF3.f227a = 0.0f;
                pointF3.f228b = 0.0f;
                pointF4.f227a = 0.0f;
                pointF4.f228b = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        if (f < 0.3f) {
            f = 0.3f;
        }
        if (this.f3938aw && this.f1608bV.m5410b()) {
            int i = 0;
            while (true) {
                if (i < AbstractC0197n.f1364c) {
                    AbstractC0197n m5353k = AbstractC0197n.m5353k(i);
                    if (m5353k == null || m5353k.m5410b()) {
                        i++;
                    } else {
                        mo4188e(m5353k);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        super.mo470a(f);
        if (!this.f1606bT) {
            m3497a(f, this);
        }
        this.f1631cs = this.f1632ct;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo469a(float f, boolean z) {
        if (!this.f1606bT) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: e */
    public float mo3261e(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: f */
    public float mo3260f(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        if (!super.mo4810c(f)) {
            return false;
        }
        GameEngine.m1234A();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3269a(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: x */
    public boolean mo3522x() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: y */
    public int mo3442y() {
        return 850000;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public float mo3526b(Unit unit) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public float mo3525c(Unit unit) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3254m() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3268b(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3251z() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3282A() {
        return 9.8f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3281B() {
        return 9.35f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3267c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3255l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3280C() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3279D() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo3456a(Action action, boolean z) {
        GameEngine m1234A = GameEngine.m1234A();
        if (action instanceof C0593k) {
            C0593k c0593k = (C0593k) action;
            boolean z2 = true;
            if (z) {
                z2 = 1 == 0;
            }
            if (c0593k.f3847a) {
                z2 = !z2;
            }
            if (z2) {
                C0136a c0136a = null;
                int i = this.f1608bV.f1305k + 1;
                while (true) {
                    if (i < AbstractC0197n.f1364c) {
                        AbstractC0197n m5353k = AbstractC0197n.m5353k(i);
                        if (m5353k == null || m5353k.m5410b()) {
                            i++;
                        } else {
                            c0136a = m5353k;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (c0136a == null && this.f1608bV.f1305k < 4) {
                    c0136a = AbstractC0197n.m5353k(this.f1608bV.f1305k + 1);
                    if (c0136a == null) {
                        GameEngine.PrintLog("Sandbox adding new team:" + this.f1608bV.f1305k);
                        C0136a c0136a2 = new C0136a(this.f1608bV.f1305k + 1);
                        c0136a = c0136a2;
                        c0136a.f1311q = 1;
                        c0136a.f1328E = true;
                        c0136a.f1329F = true;
                        if (!this.f3759c) {
                            c0136a2.f618bF = 0.0f;
                        } else {
                            c0136a2.f618bF = Float.MAX_VALUE;
                        }
                    }
                }
                if (c0136a == null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < AbstractC0197n.f1364c) {
                            AbstractC0197n m5353k2 = AbstractC0197n.m5353k(i2);
                            if (m5353k2 == null || m5353k2.m5410b()) {
                                i2++;
                            } else {
                                c0136a = m5353k2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (c0136a != null) {
                    mo4188e(c0136a);
                    if (!m1234A.f6120cb.m2630h()) {
                        m1234A.f6093bs = c0136a;
                    }
                }
            } else {
                AbstractC0197n abstractC0197n = null;
                int i3 = this.f1608bV.f1305k - 1;
                while (true) {
                    if (i3 >= 0) {
                        AbstractC0197n m5353k3 = AbstractC0197n.m5353k(i3);
                        if (m5353k3 == null || m5353k3.m5410b()) {
                            i3--;
                        } else {
                            abstractC0197n = m5353k3;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (abstractC0197n == null) {
                    int i4 = AbstractC0197n.f1364c - 1;
                    while (true) {
                        if (i4 >= 0) {
                            AbstractC0197n m5353k4 = AbstractC0197n.m5353k(i4);
                            if (m5353k4 == null || m5353k4.m5410b()) {
                                i4--;
                            } else {
                                abstractC0197n = m5353k4;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (abstractC0197n != null) {
                    mo4188e(abstractC0197n);
                    if (!m1234A.f6120cb.m2630h()) {
                        m1234A.f6093bs = abstractC0197n;
                    }
                }
            }
        }
        if (action instanceof C0592j) {
            C0592j c0592j = (C0592j) action;
            boolean z3 = true;
            if (z) {
                z3 = 1 == 0;
            }
            if (c0592j.f3845a) {
                z3 = !z3;
            }
            ArrayList m1847j = m1234A.f6118bZ.m1847j();
            if (m1847j.size() == 0) {
                this.f3766D = null;
            } else if (z3) {
                if (this.f3766D == null) {
                    this.f3766D = (C0824b) m1847j.get(0);
                } else {
                    C0824b c0824b = null;
                    boolean z4 = false;
                    Iterator it = m1847j.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        C0824b c0824b2 = (C0824b) it.next();
                        if (z4) {
                            c0824b = c0824b2;
                            break;
                        } else if (c0824b2 == this.f3766D) {
                            z4 = true;
                        }
                    }
                    this.f3766D = c0824b;
                }
            } else if (this.f3766D == null) {
                this.f3766D = (C0824b) m1847j.get(m1847j.size() - 1);
            } else {
                C0824b c0824b3 = null;
                boolean z5 = false;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m1847j);
                Collections.reverse(arrayList);
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    C0824b c0824b4 = (C0824b) it2.next();
                    if (z5) {
                        c0824b3 = c0824b4;
                        break;
                    } else if (c0824b4 == this.f3766D) {
                        z5 = true;
                    }
                }
                this.f3766D = c0824b3;
            }
        }
        if (action instanceof C0594l) {
            C0594l c0594l = (C0594l) action;
            boolean z6 = true;
            if (z) {
                z6 = 1 == 0;
            }
            if (c0594l.f3849a) {
                z6 = !z6;
            }
            this.f3767E = this.f3767E.m3331a(!z6);
        }
        if (action instanceof C0591i) {
            this.f1608bV.m5380d(10000.0f);
        }
        if (action instanceof C0595m) {
            ((C0595m) action).m3348n();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: L */
    public static C0555h m3500L() {
        return GameEngine.m1234A().f6111bS.m1979i();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo3495a(Action action, boolean z, PointF pointF, Unit unit) {
        GameEngine m1234A = GameEngine.m1234A();
        if (action instanceof C0213h) {
            action = ((C0213h) action).m5235n_();
        }
        if (action == f3772h) {
            if (m3489w()) {
                GameEngine.m1145b("Not reloading units: Need to keep network sync");
                m1234A.f6111bS.m2004b("Not reloading units: Need to keep network sync");
                return;
            } else if (z) {
                return;
            } else {
                if (m1234A.f6118bZ.m1849h() == 0) {
                    m1234A.f6111bS.m2004b("No custom units to reload");
                    return;
                }
                GameEngine.PrintLog("Reload units requested");
                m1234A.f6118bZ.m1863a(true, false);
                Iterator it = AbstractC0197n.m5394c().iterator();
                while (it.hasNext()) {
                    AbstractC0197n abstractC0197n = (AbstractC0197n) it.next();
                    if (abstractC0197n instanceof C0136a) {
                        ((C0136a) abstractC0197n).m5878ah();
                    }
                }
                m1234A.f6111bS.m2004b("All custom unit files reloaded");
            }
        }
        if (action == f3773i) {
            if (m3489w()) {
                GameEngine.m1145b("Not reloading units: Need to keep network sync");
                return;
            } else if (z) {
                return;
            } else {
                if (m1234A.f6118bZ.m1849h() == 0) {
                    m1234A.f6111bS.m2004b("No custom units to reload");
                    return;
                }
                GameEngine.PrintLog("Reload active only requested");
                m1234A.f6118bZ.m1863a(true, true);
                Iterator it2 = AbstractC0197n.m5394c().iterator();
                while (it2.hasNext()) {
                    AbstractC0197n abstractC0197n2 = (AbstractC0197n) it2.next();
                    if (abstractC0197n2 instanceof C0136a) {
                        ((C0136a) abstractC0197n2).m5878ah();
                    }
                }
                int i = C0348af.f2192d;
                int i2 = 100;
                String str = "Quick reloaded changed data for " + i + " units active on map.";
                if (m1234A.f6109bQ.liveReloading && i == 0) {
                    str = str + " (Note: Live reloading is currently enabled, so changed units may have already be reloaded)";
                    i2 = 170;
                }
                m1234A.f6111bS.m2019a(str, i2);
            }
        }
        if (action == f3775k || action == f3776l || action == f3774j) {
            int i3 = 0;
            if (z) {
                return;
            }
            Iterator it3 = Unit.m4941bF().iterator();
            while (it3.hasNext()) {
                Unit unit2 = (Unit) it3.next();
                if ((unit2 instanceof Unit) && C0758f.m2361a(unit2.f6951ek, unit2.f6952el, pointF.f227a, pointF.f228b) < 2500.0f) {
                    if (action == f3775k) {
                        if (unit2.f1650cL == null && unit2.f1651cM == null) {
                            unit2.m4918ch();
                            if ((unit2 instanceof AbstractC0623y) && unit2.mo4246bI()) {
                                m1234A.f6113bU.m1312a((AbstractC0623y) unit2);
                            }
                        }
                    } else if (action == f3776l) {
                        if (unit2.f1650cL == null && unit2.f1651cM == null) {
                            unit2.f1631cs = -1.0f;
                        }
                    } else if (action != f3774j) {
                        continue;
                    } else if (i3 <= 4) {
                        if (!unit2.mo4246bI() && !(unit2 instanceof Tree) && !unit2.f1606bT && unit2.f1650cL == null && unit2.f1651cM == null) {
                            i3++;
                            InterfaceC0303as mo6543r = unit2.mo6543r();
                            for (int i4 = -25; i4 < 25; i4++) {
                                Unit mo4162a = mo6543r.mo4162a();
                                mo4162a.f6951ek = unit2.f6951ek + (i4 * 0.5f) + 1.0f;
                                mo4162a.f6952el = unit2.f6952el + (i4 * 0.5f) + 1.0f;
                                mo4162a.mo3113b(unit2.f1608bV);
                                AbstractC0197n.m5389c(mo4162a);
                                mo4162a.f1617ce = C0758f.m2340a((AbstractC1120w) unit2, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 25 + i4);
                                if (mo4162a instanceof AbstractC0623y) {
                                    ((AbstractC0623y) mo4162a).f3939ax = true;
                                }
                            }
                        }
                    } else {
                        return;
                    }
                }
            }
            return;
        }
        if (action == f3778n) {
            if (z) {
                return;
            }
            C0188f m3801a = NukeLaucher.m3801a(this, pointF.f227a, pointF.f228b, pointF.f227a, pointF.f228b);
            if (m3801a != null) {
                m3801a.f6953em = 100.0f;
                m3801a.f983j = null;
            }
        }
        if (action == f3777m) {
            if (z) {
                return;
            }
            Iterator it4 = Unit.m4941bF().iterator();
            while (it4.hasNext()) {
                AbstractC1120w abstractC1120w = (AbstractC1120w) it4.next();
                if ((abstractC1120w instanceof AbstractC0623y) && (abstractC1120w instanceof InterfaceC0501l) && C0758f.m2361a(abstractC1120w.f6951ek, abstractC1120w.f6952el, pointF.f227a, pointF.f228b) < 2500.0f) {
                    ((InterfaceC0501l) abstractC1120w).mo3825dw();
                }
            }
            return;
        }
        if (action == f3779o) {
            AbstractC0197n abstractC0197n3 = this.f1608bV;
            if (abstractC0197n3 instanceof C0136a) {
                C0136a c0136a = (C0136a) abstractC0197n3;
                if (c0136a.f618bF > 0.0f) {
                    c0136a.f618bF = 0.0f;
                } else {
                    c0136a.f618bF = 10800.0f;
                }
            }
        }
        if (action == f3780p) {
            AbstractC0197n abstractC0197n4 = this.f1608bV;
            abstractC0197n4.f1311q++;
            if (abstractC0197n4.f1311q > 4) {
                abstractC0197n4.f1311q = 0;
            }
        }
        if (action == f3784u) {
            boolean z2 = false;
            boolean z3 = false;
            Iterator it5 = AbstractC0197n.m5394c().iterator();
            while (it5.hasNext()) {
                AbstractC0197n abstractC0197n5 = (AbstractC0197n) it5.next();
                if (abstractC0197n5 instanceof C0136a) {
                    if (((C0136a) abstractC0197n5).f618bF > 0.0f) {
                        z2 = true;
                    }
                    z3 = true;
                }
            }
            boolean z4 = !z2;
            if (!z3) {
                z4 = !this.f3759c;
            }
            this.f3759c = z4;
            m3499M();
        }
        if (action == f3785v) {
        }
        if (action == f3786w) {
        }
        if (action == f3787x) {
        }
        if (action == f3789z) {
            m1234A.f6225bl = !m1234A.f6225bl;
        }
        if (action == f3790A) {
            C0136a.f552ar = !C0136a.f552ar;
        }
        if (action == f3791B) {
            m1234A.f6227bn = !m1234A.f6227bn;
        }
        if (action instanceof C0611q) {
            C0609p.m3320a(((C0611q) action).f3870a, pointF);
        }
        super.mo3495a(action, z, pointF, unit);
    }

    /* renamed from: M */
    public void m3499M() {
        Iterator it = AbstractC0197n.m5394c().iterator();
        while (it.hasNext()) {
            AbstractC0197n abstractC0197n = (AbstractC0197n) it.next();
            if (abstractC0197n instanceof C0136a) {
                C0136a c0136a = (C0136a) abstractC0197n;
                if (!this.f3759c) {
                    c0136a.f618bF = 0.0f;
                } else {
                    c0136a.f618bF = Float.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m3496a(Action action, Unit unit) {
        if (action instanceof C0213h) {
            action = ((C0213h) action).m5235n_();
        }
        if (action == f3779o || action == f3786w || action == f3787x || action == f3777m || action == f3775k || action == f3774j || action == f3789z || action == f3780p || action == f3781q || action == f3782s || action == f3783t || action == f3791B) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m3493a(ArrayList arrayList, int i) {
        if (i != 1) {
            return;
        }
        f3765C = new ArrayList();
        f3765C.add(new C0593k(true, false));
        f3765C.add(new C0593k(true, true));
        f3765C.add(new C0593k(false, false));
        f3765C.add(new C0595m(true, false));
        f3765C.add(new C0595m(true, true));
        f3765C.add(new C0595m(false, false));
        f3765C.add(new C0592j(true, false));
        f3765C.add(new C0592j(true, true));
        f3765C.add(new C0592j(false, false));
        f3765C.add(new C0594l(true, false));
        f3765C.add(new C0594l(true, true));
        f3765C.add(new C0594l(false, false));
        f3765C.add(new C0611q(EnumC0612r.f3871a));
        f3765C.add(new C0611q(EnumC0612r.f3872b));
        f3765C.add(new C0611q(EnumC0612r.f3873c));
        f3765C.add(new C0611q(EnumC0612r.f3874d));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0591i());
        arrayList2.add(f3788y);
        arrayList2.add(f3772h);
        arrayList2.add(f3773i);
        arrayList2.add(f3775k);
        arrayList2.add(f3774j);
        arrayList2.add(f3776l);
        arrayList2.add(f3778n);
        arrayList2.add(f3777m);
        arrayList2.add(f3784u);
        arrayList2.add(f3785v);
        arrayList2.add(f3786w);
        arrayList2.add(f3787x);
        arrayList2.add(f3789z);
        arrayList2.add(f3780p);
        arrayList2.add(f3781q);
        arrayList2.add(f3782s);
        arrayList2.add(f3783t);
        if (GameEngine.f6185at) {
            arrayList2.add(f3790A);
        }
        arrayList2.add(f3791B);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            f3765C.add(new C0213h((Action) it.next(), f3792J, true));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(UnitType.f1790ae);
        Collections.sort(arrayList3, new Comparator() { // from class: com.corrodinggames.rts.game.units.h.14
            @Override // java.util.Comparator
            /* renamed from: a */
            public int mo3486a(InterfaceC0303as interfaceC0303as, InterfaceC0303as interfaceC0303as2) {
                Unit m4930c = Unit.m4930c(interfaceC0303as);
                Unit m4930c2 = Unit.m4930c(interfaceC0303as2);
                int compareTo = Boolean.valueOf(m4930c.mo4770bP()).compareTo(Boolean.valueOf(m4930c2.mo4770bP()));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(interfaceC0303as.mo4110j()).compareTo(Boolean.valueOf(interfaceC0303as2.mo4110j()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                int compareTo3 = Boolean.valueOf(m4930c.mo4771bO()).compareTo(Boolean.valueOf(m4930c2.mo4771bO()));
                if (compareTo3 != 0) {
                    return compareTo3;
                }
                C0424b mo4089u = interfaceC0303as.mo4089u();
                C0424b mo4089u2 = interfaceC0303as2.mo4089u();
                C0424b mo4166B = interfaceC0303as.mo4166B();
                C0424b mo4166B2 = interfaceC0303as2.mo4166B();
                if (mo4166B != null) {
                    mo4089u = C0424b.m4457a(mo4089u, mo4166B);
                }
                if (mo4166B2 != null) {
                    mo4089u2 = C0424b.m4457a(mo4089u2, mo4166B2);
                }
                int m4459a = mo4089u.m4459a(mo4089u2);
                if (m4459a != 0) {
                    return m4459a;
                }
                return 0;
            }
        });
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) it2.next();
            if (interfaceC0303as != UnitType.wall_v && !interfaceC0303as.mo4112i().equals("test_tank") && !interfaceC0303as.mo4112i().equals("missing") && interfaceC0303as != UnitType.tankDestroyer && interfaceC0303as != UnitType.megaTank && interfaceC0303as != UnitType.fogRevealer && interfaceC0303as != UnitType.crystalResource && interfaceC0303as != UnitType.damagingBorder && interfaceC0303as != UnitType.zoneMarker && interfaceC0303as != UnitType.editorOrBuilder && interfaceC0303as != UnitType.dummyNonUnitWithTeam && (Unit.m4930c(interfaceC0303as) instanceof AbstractC0623y) && (!(interfaceC0303as instanceof C0453l) || ((C0453l) interfaceC0303as).f2946aE)) {
                C0213h c0213h = new C0213h(new C0227v(interfaceC0303as, 1, null), f3792J);
                boolean z = false;
                Iterator it3 = f3765C.iterator();
                while (it3.hasNext()) {
                    if (((Action) it3.next()).equals(c0213h)) {
                        z = true;
                    }
                }
                if (!z) {
                    f3765C.add(c0213h);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3803N() {
        GameEngine.m1234A();
        return f3765C;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo3278E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3259g(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3277F() {
        return GameEngine.m1234A().f6109bQ.renderExtraShadows && !this.f1606bT;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo3276G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3275H() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: u */
    public boolean mo3253u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0621w, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: I */
    public boolean mo3285I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public boolean mo3263d(Unit unit) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: J */
    public boolean mo3273J() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public float mo3270a(Unit unit, float f, C0188f c0188f) {
        return super.mo4980a(unit, 0.0f, c0188f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: O */
    public void mo3498O() {
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: P */
    public boolean mo3272P() {
        return true;
    }

    /* renamed from: a */
    public void m3494a(C0555h c0555h) {
        this.f3764r = c0555h.f3764r;
        this.f3759c = c0555h.f3759c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        c0859ar.m1554c(1);
        c0859ar.m1564a(this.f3768F);
        c0859ar.m1557b(this.f3769G);
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        byte m1457d = c0876k.m1457d();
        this.f3768F = (AbstractC0596n) c0876k.m1461b(AbstractC0596n.class);
        if (m1457d >= 1) {
            this.f3769G = c0876k.m1450j();
        }
        super.mo2872a(c0876k);
    }
}
