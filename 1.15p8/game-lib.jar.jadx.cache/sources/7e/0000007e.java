package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.ai.AI;
import com.corrodinggames.rts.game.units.buildings.AbstractC0483l;
import com.corrodinggames.rts.game.units.buildings.NukeLauncher;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadataFactory;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.land.AbstractC0511j;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.p012a.AbstractC0223x;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0201b;
import com.corrodinggames.rts.game.units.p012a.C0207h;
import com.corrodinggames.rts.game.units.p012a.C0221v;
import com.corrodinggames.rts.game.units.p012a.EnumC0219t;
import com.corrodinggames.rts.game.units.p012a.EnumC0220u;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.ModLoader.Mod;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.gui.p034a.AbstractC0691i;
import com.corrodinggames.rts.gameFramework.gui.p034a.C0684c;
import com.corrodinggames.rts.gameFramework.gui.p034a.menu_;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/h.class */
public class SandBoxAct extends AbstractC0511j implements AbstractC0451d {

    /* renamed from: c */
    boolean f3578c;

    /* renamed from: d */
    static Paint f3575d;

    /* renamed from: e */
    static Paint f3576e;

    /* renamed from: f */
    static Paint f3577f;

    /* renamed from: q */
    String f3579q;

    /* renamed from: A */
    static ArrayList f3574A;

    /* renamed from: g */
    static Action f3580g = new Action("reloadUnits") { // from class: com.corrodinggames.rts.game.units.h.1
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            if (SandBoxAct.m2746w()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Reload all unit data from disk (for modding)";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Reload units";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public int mo2738b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: d_ */
        public UnitType m2745d_() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: e */
        public EnumC0220u mo2698e() {
            return EnumC0220u.f1447a;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1442f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: h */
        public boolean mo2703h() {
            return true;
        }
    };

    /* renamed from: h */
    static Action f3581h = new Action("reloadOnlyActiveUnits") { // from class: com.corrodinggames.rts.game.units.h.12
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            if (SandBoxAct.m2746w()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Reload data only for active units on map (for modding). This is a faster than reload but will be incomplete.";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Quick reload";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public int mo2738b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: j */
        public UnitType m2744j() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: e */
        public EnumC0220u mo2698e() {
            return EnumC0220u.f1447a;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1442f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: h */
        public boolean mo2703h() {
            return true;
        }
    };

    /* renamed from: i */
    static Action f3582i = new Action("unitClone") { // from class: com.corrodinggames.rts.game.units.h.15
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Clones units at point x50";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Unit Clone";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public int mo2738b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: j */
        public UnitType m2742j() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: e */
        public EnumC0220u mo2698e() {
            return EnumC0220u.f1453g;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1442f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: h */
        public boolean mo2703h() {
            return true;
        }
    };

    /* renamed from: j */
    static Action f3583j = new Action("removeUnits") { // from class: com.corrodinggames.rts.game.units.h.16
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Delete all units at a point";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Delete units at";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: e_ */
        public boolean mo2736e_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public int mo2738b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: f_ */
        public UnitType m2741f_() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: e */
        public EnumC0220u mo2698e() {
            return EnumC0220u.f1453g;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1442f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: h */
        public boolean mo2703h() {
            return true;
        }
    };

    /* renamed from: k */
    static Action f3584k = new Action("killUnits") { // from class: com.corrodinggames.rts.game.units.h.17
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Kill units at a point";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Kill units at";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: e_ */
        public boolean mo2736e_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public int mo2738b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: g_ */
        public UnitType m2740g_() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: e */
        public EnumC0220u mo2698e() {
            return EnumC0220u.f1453g;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1442f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: h */
        public boolean mo2703h() {
            return true;
        }
    };

    /* renamed from: l */
    static Action f3585l = new Action("finishQueue") { // from class: com.corrodinggames.rts.game.units.h.18
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Finish all unit queues at";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Finish queue at";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: e_ */
        public boolean mo2736e_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public int mo2738b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: h_ */
        public UnitType m2739h_() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: e */
        public EnumC0220u mo2698e() {
            return EnumC0220u.f1453g;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1442f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: h */
        public boolean mo2703h() {
            return true;
        }
    };

    /* renamed from: m */
    static Action nukeAt = new Action("nukeAt") { // from class: com.corrodinggames.rts.game.units.h.19
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Create a nuke at a point";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Nuke at";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: e_ */
        public boolean mo2736e_() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public int getPrice() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public int mo2738b(Unit unit, boolean z) {
            return -1;
        }

        /* renamed from: i_ */
        public UnitType m2733i_() {
            return null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: e */
        public EnumC0220u mo2698e() {
            return EnumC0220u.f1453g;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: f */
        public EnumC0219t mo2697f() {
            return EnumC0219t.f1442f;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: g */
        public boolean mo2735g() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: h */
        public boolean mo2703h() {
            return true;
        }
    };

    /* renamed from: n */
    static Action f3587n = new AbstractC0223x("freezeAI") { // from class: com.corrodinggames.rts.game.units.h.20
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Freeze high level AI logic (120secs)";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Freeze AI";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: d */
        public String mo2699d() {
            String str = "Freeze AI";
            GameEngine.getInstance();
            SandBoxAct m2757K = SandBoxAct.m2757K();
            if (m2757K != null) {
                int i = -1;
                if (m2757K.team instanceof AI) {
                    i = ((int) ((AI) m2757K.team).f575bD) / 60;
                }
                if (i > 0) {
                    str = str + "(" + i + ")";
                }
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return unit.team instanceof AI;
        }
    };

    /* renamed from: o */
    static Action f3588o = new AbstractC0223x("changeAlliance") { // from class: com.corrodinggames.rts.game.units.h.21
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Change selected player's alliance (players with the same letter are allied)";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Ally:";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: d */
        public String mo2699d() {
            SandBoxAct m2757K;
            String str = "Ally";
            if (SandBoxAct.m2757K() != null) {
                str = "Ally: " + m2757K.team.getTeam();
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return true;
        }
    };

    /* renamed from: p */
    static Action f3589p = new AbstractC0223x("startRecording") { // from class: com.corrodinggames.rts.game.units.h.2
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Start recording a replay to file";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Start Recording";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: d */
        public String mo2699d() {
            String str;
            if (!GameEngine.getInstance().replayEngine.m2301i()) {
                str = "Start Recording";
            } else {
                str = "Stop Recording";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            if (GameEngine.getInstance().replayEngine.isPlaying()) {
                return false;
            }
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean mo2732a(Unit unit) {
            return GameEngine.getInstance().replayEngine.m2301i();
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public boolean mo2731c(Unit unit, boolean z) {
            GameEngine gameEngine = GameEngine.getInstance();
            GameEngine.PrintLOG("Start recording clicked");
            if (gameEngine.replayEngine.isPlaying()) {
                GameEngine.PrintLOG("Already in a replay");
                return false;
            }
            gameEngine.m889a(new Runnable() { // from class: com.corrodinggames.rts.game.units.h.2.1
                {
                    C05442.this = this;
                }

                @Override // java.lang.Runnable
                public void run() {
                    GameEngine gameEngine2 = GameEngine.getInstance();
                    if (!gameEngine2.replayEngine.m2301i()) {
                        SandBoxAct m2757K = SandBoxAct.m2757K();
                        gameEngine2.interfaceEngine.f4746b = true;
                        if (!gameEngine2.networkEngine.networked) {
                            long j = gameEngine2.networkEngine.unitId;
                            gameEngine2.networkEngine.mods = true;
                            gameEngine2.networkEngine.m1514N();
                            gameEngine2.networkEngine.unitId = j;
                            gameEngine2.networkEngine.gameHasStarted = true;
                            gameEngine2.frameNumber = 0;
                            gameEngine2.networkEngine.f5134W = gameEngine2.frameNumber + 1;
                            gameEngine2.networkEngine.m1355t();
                        }
                        String str = "[sandbox]" + gameEngine2.getMapNameE() + " [v" + gameEngine2.gameVersion() + "] (" + CommonUtils.SimpleDateFormatStr("d MMM yyyy HH.mm.ss") + ").replay";
                        gameEngine2.replayEngine.saveGameReplay(str);
                        gameEngine2.interfaceEngine.f4746b = false;
                        GameEngine.m823f(null, "Replay started as: " + str);
                        SandBoxAct m2757K2 = SandBoxAct.m2757K();
                        if (m2757K2 != null && m2757K != null) {
                            m2757K2.m2751a(m2757K);
                            m2757K2.f3579q = str;
                            return;
                        }
                        GameEngine.log("Failed copySettingsFromAnotherEditor");
                        return;
                    }
                    gameEngine2.replayEngine.m2308d();
                }
            });
            return false;
        }
    };

    /* renamed from: r */
    static Action f3590r = new AbstractC0223x("startReplayPlayback") { // from class: com.corrodinggames.rts.game.units.h.3
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Start playback of last a replay";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Start Playback";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: d */
        public String mo2699d() {
            String str;
            if (!GameEngine.getInstance().replayEngine.isPlaying()) {
                str = "Start Playback";
            } else {
                str = "Stop Playback";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return SandBoxAct.m2757K().f3579q != null && !GameEngine.getInstance().replayEngine.m2301i();
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public boolean isAvailable(Unit unit) {
            return SandBoxAct.m2757K().f3579q != null;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean mo2732a(Unit unit) {
            return GameEngine.getInstance().replayEngine.isPlaying();
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public boolean mo2731c(Unit unit, boolean z) {
            final GameEngine gameEngine = GameEngine.getInstance();
            final String str = SandBoxAct.m2757K().f3579q;
            if (str == null) {
                gameEngine.alertA("No last replay found");
                return false;
            } else if (!gameEngine.replayEngine.isPlaying()) {
                final Runnable runnable = new Runnable() { // from class: com.corrodinggames.rts.game.units.h.3.1
                    {
                        C05483.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        GameEngine gameEngine2 = GameEngine.getInstance();
                        if (!gameEngine2.replayEngine.isPlaying()) {
                            boolean z2 = gameEngine2.map.f818D;
                            SandBoxAct m2757K = SandBoxAct.m2757K();
                            boolean z3 = gameEngine2.f5976dq;
                            boolean z4 = gameEngine2.f5977dr;
                            gameEngine2.replayEngine.f4080f = true;
                            gameEngine2.replayEngine.m2309c(str);
                            gameEngine2.replayEngine.f4080f = false;
                            gameEngine2.f5976dq = z3;
                            gameEngine2.f5977dr = z4;
                            SandBoxAct m2757K2 = SandBoxAct.m2757K();
                            if (m2757K2 != null && m2757K != null) {
                                m2757K2.m2751a(m2757K);
                            } else {
                                GameEngine.log("Failed copySettingsFromAnotherEditor");
                            }
                            gameEngine2.editorMode = true;
                            if (gameEngine2.map != null) {
                                gameEngine2.map.f818D = z2;
                            }
                            gameEngine2.f5859cT = true;
                            if (m2757K2 != null) {
                                m2757K2.m2756L();
                                return;
                            }
                            return;
                        }
                        GameEngine.PrintLOG("stopPlaybackRunnable: Already started");
                    }
                };
                final menu_ m2014a = menu_.m2014a("Start playback of last recording?", true);
                m2014a.m2015a(LangLocale.getI18NText("menus.common.ok", new Object[0]), new AbstractC0691i() { // from class: com.corrodinggames.rts.game.units.h.3.2
                    {
                        C05483.this = this;
                    }

                    @Override // com.corrodinggames.rts.gameFramework.gui.p034a.AbstractC0691i
                    /* renamed from: a */
                    public boolean mo1348a(C0684c c0684c) {
                        m2014a.m1980i();
                        gameEngine.m889a(runnable);
                        return true;
                    }
                });
                gameEngine.interfaceEngine.m1888a(m2014a);
                return false;
            } else {
                gameEngine.m889a(new Runnable() { // from class: com.corrodinggames.rts.game.units.h.3.3
                    {
                        C05483.this = this;
                    }

                    @Override // java.lang.Runnable
                    public void run() {
                        GameEngine gameEngine2 = GameEngine.getInstance();
                        if (!gameEngine2.replayEngine.isPlaying()) {
                            GameEngine.PrintLOG("stopPlaybackRunnable: Already stopped");
                            return;
                        }
                        gameEngine2.replayEngine.m2308d();
                        gameEngine2.gameSpeed = 1.0f;
                        gameEngine2.editorMode = true;
                        SandBoxAct m2757K = SandBoxAct.m2757K();
                        if (m2757K != null) {
                            gameEngine2.playerTeam = m2757K.team;
                        }
                    }
                });
                return false;
            }
        }
    };

    /* renamed from: s */
    static Action f3591s = new AbstractC0223x("hideInterface") { // from class: com.corrodinggames.rts.game.units.h.4
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            String str = "Hide interface till the screen is clicked/pressed";
            if (GameEngine.isPC()) {
                str = str + "\n-Enable mouse capture to also hide the mouse";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Hide interface";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public boolean mo2731c(Unit unit, boolean z) {
            GameEngine.getInstance().f5859cT = true;
            return false;
        }
    };

    /* renamed from: t */
    static Action f3592t = new AbstractC0223x("freezeAllAI") { // from class: com.corrodinggames.rts.game.units.h.5
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Freeze full high level logic for all AI forever";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Freeze AI";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: d */
        public String mo2699d() {
            String str = "Freeze AI";
            SandBoxAct m2757K = SandBoxAct.m2757K();
            if (m2757K != null && m2757K.f3578c) {
                str = "Unfreeze AIs";
            }
            return str;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public boolean isActive(Unit unit, boolean z) {
            return true;
        }
    };

    /* renamed from: u */
    static Action f3593u = new AbstractC0223x("pauseGame") { // from class: com.corrodinggames.rts.game.units.h.6
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Pause Game";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            if (GameEngine.getInstance().gameSpeed != 0.0f) {
                return "Pause: Off";
            }
            return "Pause: On";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public boolean mo2731c(Unit unit, boolean z) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine.replayEngine.isPlaying()) {
            }
            if (gameEngine.gameSpeed != 0.0f) {
                gameEngine.gameSpeed = 0.0f;
                return false;
            }
            gameEngine.gameSpeed = 1.0f;
            return false;
        }
    };

    /* renamed from: v */
    static Action f3594v = new AbstractC0223x("slowGame") { // from class: com.corrodinggames.rts.game.units.h.7
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Slow motion";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            if (GameEngine.getInstance().gameSpeed != 0.1f) {
                return "Slow motion: Off";
            }
            return "Slow motion: On";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public boolean mo2731c(Unit unit, boolean z) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine.replayEngine.isPlaying()) {
            }
            if (gameEngine.gameSpeed == 1.0f) {
                gameEngine.gameSpeed = 0.1f;
                return false;
            }
            gameEngine.gameSpeed = 1.0f;
            return false;
        }
    };

    /* renamed from: w */
    static Action f3595w = new AbstractC0223x("fastForward") { // from class: com.corrodinggames.rts.game.units.h.8
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Fast Forward 1-5x";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            return "Fast Forward: " + GameEngine.getInstance().gameSpeed;
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: c */
        public boolean mo2731c(Unit unit, boolean z) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine.replayEngine.isPlaying()) {
            }
            if (gameEngine.gameSpeed == 1.0f) {
                gameEngine.gameSpeed = 2.0f;
                return false;
            } else if (gameEngine.gameSpeed == 2.0f) {
                gameEngine.gameSpeed = 3.0f;
                return false;
            } else if (gameEngine.gameSpeed == 3.0f) {
                gameEngine.gameSpeed = 4.0f;
                return false;
            } else if (gameEngine.gameSpeed == 4.0f) {
                gameEngine.gameSpeed = 5.0f;
                return false;
            } else if (gameEngine.gameSpeed == 5.0f) {
                gameEngine.gameSpeed = 10.0f;
                return false;
            } else {
                gameEngine.gameSpeed = 1.0f;
                return false;
            }
        }
    };

    /* renamed from: x */
    static Action f3596x = new AbstractC0223x("enableDebug") { // from class: com.corrodinggames.rts.game.units.h.9
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "Show hidden unit information in tooltips including flags, ammo, tags and resources";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            if (!GameEngine.getInstance().debugTempMode) {
                return "Debug: Off";
            }
            return "Debug: On";
        }
    };

    /* renamed from: y */
    static Action f3597y = new AbstractC0223x("enableAIDebug") { // from class: com.corrodinggames.rts.game.units.h.10
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "AI debug view";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            GameEngine.getInstance();
            if (!AI.f535ap) {
                return "AI Debug: Off";
            }
            return "AI Debug: On";
        }
    };

    /* renamed from: z */
    static Action f3598z = new AbstractC0223x("enableTriggerDebug") { // from class: com.corrodinggames.rts.game.units.h.11
        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: a */
        public String getDescription() {
            return "For debugging autoTriggers. When enabled will log a message when any auto triggers fire on any selected units";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public String getText() {
            if (!GameEngine.getInstance().triggerDebug) {
                return "Trigger Debug: Off";
            }
            return "Trigger Debug: On";
        }

        @Override // com.corrodinggames.rts.game.units.p012a.Action
        /* renamed from: b */
        public boolean isAvailable(Unit unit) {
            return GameEngine.getInstance().debugTempMode;
        }
    };

    /* renamed from: D */
    static C0201b f3599D = new C0201b() { // from class: com.corrodinggames.rts.game.units.h.14
        @Override // com.corrodinggames.rts.game.units.p012a.C0201b
        public boolean isAvailable(Action action, Unit unit) {
            if (action instanceof C0207h) {
                action = ((C0207h) action).m3848n_();
            }
            EnumC0570m enumC0570m = SandBoxAct.m2757K().f3603C;
            if (enumC0570m == EnumC0570m.all && SandBoxAct.m2753a(action, unit)) {
                return false;
            }
            if (enumC0570m == EnumC0570m.modded && action == SandBoxAct.f3580g) {
                return true;
            }
            if (enumC0570m == EnumC0570m.modded && action == SandBoxAct.f3581h) {
                return true;
            }
            if (action == SandBoxAct.f3598z && !SandBoxAct.f3598z.isAvailable(unit)) {
                return false;
            }
            return enumC0570m.mo2689a(action.mo2734i());
        }
    };

    /* renamed from: a */
    PointF[] f3600a = new PointF[6];

    /* renamed from: b */
    PointF[] f3601b = new PointF[this.f3600a.length];

    /* renamed from: B */
    Mod f3602B = null;

    /* renamed from: C */
    EnumC0570m f3603C = EnumC0570m.all;

    /* renamed from: f */
    public UnitType m2747f() {
        return UnitType.editorOrBuilder;
    }

    /* renamed from: w */
    public static boolean m2746w() {
        if (GameEngine.getInstance().replayEngine.m2303g()) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0451d
    /* renamed from: b */
    public PointF[] mo2725b() {
        return this.f3600a;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0451d
    /* renamed from: c */
    public PointF[] mo2724c() {
        return this.f3601b;
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0511j, com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public BitmapOrTexture mo2674v() {
        if (this.team.teamID == -1) {
            return null;
        }
        return f3465dE[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public boolean mo2621a(Unit unit) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead) {
            return Builder.f3403b;
        }
        return Builder.f3405d[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.effects.emitSmalExplosion(this.x, this.y, this.height);
        this.image = Builder.f3403b;
        setDrawLayer(0);
        this.collidable = false;
        gameEngine.audio.playSound(AudioEngine.f3869o, 0.8f, this.x, this.y);
        mo2507bp();
        return true;
    }

    public SandBoxAct(boolean z) {
        super(z);
        f3575d = new Paint();
        f3575d.m4717a(40, 0, 255, 0);
        f3575d.mo935a(true);
        f3575d.setStrokeWidth(2.0f);
        f3575d.m4713a(Paint.Cap.f202b);
        f3576e = new Paint();
        f3576e.m4711a(f3575d);
        f3576e.m4717a(55, 255, 60, 60);
        f3577f = new Paint();
        f3577f.m4717a(60, 255, 255, 255);
        setObjectWidth(20);
        setObjectHeight(20);
        this.radius = 10.0f;
        this.x = -1000.0f;
        this.y = -1000.0f;
        this.displayRadius = this.radius;
        this.maxHp = 170000.0f;
        this.hp = this.maxHp;
        this.image = Builder.f3403b;
        for (int i = 0; i < this.f3600a.length; i++) {
            this.f3600a[i] = new PointF();
            this.f3601b[i] = new PointF();
        }
    }

    /* renamed from: a */
    public static void m2754a(float f, AbstractC0451d abstractC0451d) {
        OrderableUnit orderableUnit = (OrderableUnit) abstractC0451d;
        PointF[] mo2725b = abstractC0451d.mo2725b();
        PointF[] mo2724c = abstractC0451d.mo2724c();
        Unit m2645W = orderableUnit.m2645W();
        orderableUnit.f3693aG = m2645W != null;
        if (m2645W != null) {
            for (int i = 0; i < mo2725b.length; i++) {
                PointF pointF = mo2725b[i];
                PointF pointF2 = mo2724c[i];
                pointF.x = CommonUtils.m1744a(pointF.x, pointF2.x, 0.1f * f);
                pointF.y = CommonUtils.m1744a(pointF.y, pointF2.y, 0.1f * f);
                pointF.x += (pointF2.x - pointF.x) * 0.04f * f;
                pointF.y += (pointF2.y - pointF.y) * 0.04f * f;
                float f2 = m2645W.radius * 0.75f;
                if (CommonUtils.absf(pointF.x - pointF2.x) < 1.0f) {
                    pointF2.x = CommonUtils.m1661d(-f2, f2);
                }
                if (CommonUtils.absf(pointF.y - pointF2.y) < 1.0f) {
                    pointF2.y = CommonUtils.m1661d(-f2, f2);
                }
            }
        } else if (mo2725b[0].x != 0.0f || mo2725b[0].y != 0.0f) {
            for (int i2 = 0; i2 < mo2725b.length; i2++) {
                PointF pointF3 = mo2725b[i2];
                PointF pointF4 = mo2724c[i2];
                pointF3.x = 0.0f;
                pointF3.y = 0.0f;
                pointF4.x = 0.0f;
                pointF4.y = 0.0f;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.land.AbstractC0511j, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        if (f < 0.3f) {
            f = 0.3f;
        }
        if (this.f3778aq && this.team.m3945b()) {
            int i = 0;
            while (true) {
                if (i < Team.playerNumMax) {
                    Team team = Team.getTeam(i);
                    if (team == null || team.m3945b()) {
                        i++;
                    } else {
                        mo3151e(team);
                        break;
                    }
                } else {
                    break;
                }
            }
        }
        super.update(f);
        if (!this.dead) {
            m2754a(f, this);
        }
        this.hp = this.maxHp;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo431a(float f, boolean z) {
        if (!this.dead) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: e */
    public float mo2483e(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: f */
    public float mo2481f(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        if (!super.draw(f)) {
            return false;
        }
        GameEngine.getInstance();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: x */
    public boolean mo2435x() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: y */
    public int mo2719y() {
        return 850000;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public float mo2749b(Unit unit) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public float mo2748c(Unit unit) {
        return 1.0E7f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return 30.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return 100.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return 9.8f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return 9.35f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return 0.04f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return 0.1f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo2711a(Action action, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (action instanceof C0568k) {
            C0568k c0568k = (C0568k) action;
            boolean z2 = true;
            if (z) {
                z2 = 1 == 0;
            }
            if (c0568k.f3656a) {
                z2 = !z2;
            }
            if (z2) {
                AI ai = null;
                int i = this.team.teamID + 1;
                while (true) {
                    if (i < Team.playerNumMax) {
                        Team team = Team.getTeam(i);
                        if (team == null || team.m3945b()) {
                            i++;
                        } else {
                            ai = team;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (ai == null && this.team.teamID < 4) {
                    ai = Team.getTeam(this.team.teamID + 1);
                    if (ai == null) {
                        GameEngine.PrintLOG("Sandbox adding new team:" + this.team.teamID);
                        AI ai2 = new AI(this.team.teamID + 1);
                        ai = ai2;
                        ai.allyGroup = 1;
                        ai.f1285C = true;
                        ai.f1286D = true;
                        if (!this.f3578c) {
                            ai2.f575bD = 0.0f;
                        } else {
                            ai2.f575bD = Float.MAX_VALUE;
                        }
                    }
                }
                if (ai == null) {
                    int i2 = 0;
                    while (true) {
                        if (i2 < Team.playerNumMax) {
                            Team team2 = Team.getTeam(i2);
                            if (team2 == null || team2.m3945b()) {
                                i2++;
                            } else {
                                ai = team2;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (ai != null) {
                    mo3151e(ai);
                    if (!gameEngine.replayEngine.isPlaying()) {
                        gameEngine.playerTeam = ai;
                    }
                }
            } else {
                Team team3 = null;
                int i3 = this.team.teamID - 1;
                while (true) {
                    if (i3 >= 0) {
                        Team team4 = Team.getTeam(i3);
                        if (team4 == null || team4.m3945b()) {
                            i3--;
                        } else {
                            team3 = team4;
                            break;
                        }
                    } else {
                        break;
                    }
                }
                if (team3 == null) {
                    int i4 = Team.playerNumMax - 1;
                    while (true) {
                        if (i4 >= 0) {
                            Team team5 = Team.getTeam(i4);
                            if (team5 == null || team5.m3945b()) {
                                i4--;
                            } else {
                                team3 = team5;
                                break;
                            }
                        } else {
                            break;
                        }
                    }
                }
                if (team3 != null) {
                    mo3151e(team3);
                    if (!gameEngine.replayEngine.isPlaying()) {
                        gameEngine.playerTeam = team3;
                    }
                }
            }
        }
        if (action instanceof C0567j) {
            C0567j c0567j = (C0567j) action;
            boolean z3 = true;
            if (z) {
                z3 = 1 == 0;
            }
            if (c0567j.f3654a) {
                z3 = !z3;
            }
            ArrayList m1572i = gameEngine.ModEngine.m1572i();
            if (m1572i.size() == 0) {
                this.f3602B = null;
            } else if (z3) {
                if (this.f3602B == null) {
                    this.f3602B = (Mod) m1572i.get(0);
                } else {
                    Mod mod = null;
                    boolean z4 = false;
                    Iterator it = m1572i.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        Mod mod2 = (Mod) it.next();
                        if (z4) {
                            mod = mod2;
                            break;
                        } else if (mod2 == this.f3602B) {
                            z4 = true;
                        }
                    }
                    this.f3602B = mod;
                }
            } else if (this.f3602B == null) {
                this.f3602B = (Mod) m1572i.get(m1572i.size() - 1);
            } else {
                Mod mod3 = null;
                boolean z5 = false;
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(m1572i);
                Collections.reverse(arrayList);
                Iterator it2 = arrayList.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    Mod mod4 = (Mod) it2.next();
                    if (z5) {
                        mod3 = mod4;
                        break;
                    } else if (mod4 == this.f3602B) {
                        z5 = true;
                    }
                }
                this.f3602B = mod3;
            }
        }
        if (action instanceof C0566i) {
            this.team.checkMoneyMaxLimit(10000.0f);
        }
        if (action instanceof C0569l) {
            ((C0569l) action).m2694m();
        }
    }

    /* renamed from: K */
    public static SandBoxAct m2757K() {
        return GameEngine.getInstance().interfaceEngine.m1841i();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo2752a(Action action, boolean z, PointF pointF, Unit unit) {
        GameEngine game = GameEngine.getInstance();
        if (action instanceof C0207h) {
            action = ((C0207h) action).m3848n_();
        }
        if (action == f3580g) {
            if (m2746w()) {
                GameEngine.log("Not reloading units: Need to keep network sync");
                return;
            } else if (z) {
                return;
            } else {
                if (game.ModEngine.m1575g() == 0) {
                    game.interfaceEngine.m1879a("No custom units to reload");
                    return;
                }
                GameEngine.PrintLOG("Reload units requested");
                game.ModEngine.m1587a(true, false);
                Iterator it = Team.m3929c().iterator();
                while (it.hasNext()) {
                    Team team = (Team) it.next();
                    if (team instanceof AI) {
                        ((AI) team).m4347ae();
                    }
                }
                game.interfaceEngine.m1879a("All custom unit files reloaded");
            }
        }
        if (action == f3581h) {
            if (m2746w()) {
                GameEngine.log("Not reloading units: Need to keep network sync");
                return;
            } else if (z) {
                return;
            } else {
                if (game.ModEngine.m1575g() == 0) {
                    game.interfaceEngine.m1879a("No custom units to reload");
                    return;
                }
                GameEngine.PrintLOG("Reload active only requested");
                game.ModEngine.m1587a(true, true);
                Iterator it2 = Team.m3929c().iterator();
                while (it2.hasNext()) {
                    Team team2 = (Team) it2.next();
                    if (team2 instanceof AI) {
                        ((AI) team2).m4347ae();
                    }
                }
                int i = CustomUnitMetadataFactory.f2124c;
                int i2 = 100;
                String str = "Quick reloaded changed data for " + i + " units active on map.";
                if (game.curSettings.liveReloading && i == 0) {
                    str = str + " (Note: Live reloading is currently enabled, so changed units may have already be reloaded)";
                    i2 = 170;
                }
                game.interfaceEngine.m1878a(str, i2);
            }
        }
        if (action == f3583j || action == f3584k || action == f3582i) {
            int i3 = 0;
            if (z) {
                return;
            }
            Iterator it3 = Unit.m3767bE().iterator();
            while (it3.hasNext()) {
                Unit unit2 = (Unit) it3.next();
                if ((unit2 instanceof Unit) && CommonUtils.distanceSq(unit2.x, unit2.y, pointF.x, pointF.y) < 2500.0f) {
                    if (action == f3583j) {
                        if (unit2.transportedBy == null && unit2.f1630cF == null) {
                            unit2.m3745cg();
                            if ((unit2 instanceof OrderableUnit) && unit2.mo2975bH()) {
                                game.PathEngine.m1102a((OrderableUnit) unit2);
                            }
                        }
                    } else if (action == f3584k) {
                        if (unit2.transportedBy == null && unit2.f1630cF == null) {
                            unit2.hp = -1.0f;
                        }
                    } else if (action != f3582i) {
                        continue;
                    } else if (i3 <= 4) {
                        if (!unit2.mo2975bH() && !(unit2 instanceof Tree) && !unit2.dead && unit2.transportedBy == null && unit2.f1630cF == null) {
                            i3++;
                            UnitType unitType = unit2.getUnitType();
                            for (int i4 = -25; i4 < 25; i4++) {
                                Unit createUnit = unitType.createUnit();
                                createUnit.x = unit2.x + (i4 * 0.5f) + 1.0f;
                                createUnit.y = unit2.y + (i4 * 0.5f) + 1.0f;
                                createUnit.mo2537b(unit2.team);
                                Team.m3924c(createUnit);
                                createUnit.direction = CommonUtils.m1722a((GameObject) unit2, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 25 + i4);
                                if (createUnit instanceof OrderableUnit) {
                                    ((OrderableUnit) createUnit).f3699ar = true;
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
        if (action == nukeAt) {
            if (z) {
                return;
            }
            Projectile p = NukeLauncher.createNuke(this, pointF.x, pointF.y, pointF.x, pointF.y);
            if (p != null) {
                p.height = 100.0f;
                p.source = null;
            }
        }
        if (action == f3585l) {
            if (z) {
                return;
            }
            Iterator it4 = Unit.m3767bE().iterator();
            while (it4.hasNext()) {
                GameObject gameObject = (GameObject) it4.next();
                if ((gameObject instanceof OrderableUnit) && (gameObject instanceof AbstractC0483l) && CommonUtils.distanceSq(gameObject.x, gameObject.y, pointF.x, pointF.y) < 2500.0f) {
                    ((AbstractC0483l) gameObject).mo2909du();
                }
            }
            return;
        }
        if (action == f3587n) {
            Team team3 = this.team;
            if (team3 instanceof AI) {
                AI ai = (AI) team3;
                if (ai.f575bD > 0.0f) {
                    ai.f575bD = 0.0f;
                } else {
                    ai.f575bD = 10800.0f;
                }
            }
        }
        if (action == f3588o) {
            Team team4 = this.team;
            team4.allyGroup++;
            if (team4.allyGroup > 4) {
                team4.allyGroup = 0;
            }
        }
        if (action == f3592t) {
            boolean z2 = false;
            boolean z3 = false;
            Iterator it5 = Team.m3929c().iterator();
            while (it5.hasNext()) {
                Team team5 = (Team) it5.next();
                if (team5 instanceof AI) {
                    if (((AI) team5).f575bD > 0.0f) {
                        z2 = true;
                    }
                    z3 = true;
                }
            }
            boolean z4 = !z2;
            if (!z3) {
                z4 = !this.f3578c;
            }
            this.f3578c = z4;
            m2756L();
        }
        if (action == f3593u) {
        }
        if (action == f3594v) {
        }
        if (action == f3595w) {
        }
        if (action == f3596x) {
            game.debugTempMode = !game.debugTempMode;
        }
        if (action == f3597y) {
            AI.f535ap = !AI.f535ap;
        }
        if (action == f3598z) {
            game.triggerDebug = !game.triggerDebug;
        }
        super.mo2752a(action, z, pointF, unit);
    }

    /* renamed from: L */
    public void m2756L() {
        Iterator it = Team.m3929c().iterator();
        while (it.hasNext()) {
            Team team = (Team) it.next();
            if (team instanceof AI) {
                AI ai = (AI) team;
                if (!this.f3578c) {
                    ai.f575bD = 0.0f;
                } else {
                    ai.f575bD = Float.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: a */
    public static boolean m2753a(Action action, Unit unit) {
        if (action instanceof C0207h) {
            action = ((C0207h) action).m3848n_();
        }
        if (action == f3587n || action == f3594v || action == f3595w || action == f3585l || action == f3583j || action == f3582i || action == f3596x || action == f3588o || action == f3589p || action == f3590r || action == f3591s || action == f3598z) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public static void m2750a(ArrayList arrayList, int i) {
        if (i != 1) {
            return;
        }
        f3574A = new ArrayList();
        f3574A.add(new C0568k(true, false));
        f3574A.add(new C0568k(true, true));
        f3574A.add(new C0568k(false, false));
        f3574A.add(new C0569l(true, false));
        f3574A.add(new C0569l(true, true));
        f3574A.add(new C0569l(false, false));
        f3574A.add(new C0567j(true, false));
        f3574A.add(new C0567j(true, true));
        f3574A.add(new C0567j(false, false));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C0566i());
        arrayList2.add(f3580g);
        arrayList2.add(f3581h);
        arrayList2.add(f3583j);
        arrayList2.add(f3582i);
        arrayList2.add(f3584k);
        arrayList2.add(nukeAt);
        arrayList2.add(f3585l);
        arrayList2.add(f3592t);
        arrayList2.add(f3593u);
        arrayList2.add(f3594v);
        arrayList2.add(f3595w);
        arrayList2.add(f3596x);
        arrayList2.add(f3588o);
        arrayList2.add(f3589p);
        arrayList2.add(f3590r);
        arrayList2.add(f3591s);
        if (GameEngine.isTestingBuild) {
            arrayList2.add(f3597y);
        }
        arrayList2.add(f3598z);
        Iterator it = arrayList2.iterator();
        while (it.hasNext()) {
            f3574A.add(new C0207h((Action) it.next(), f3599D, true));
        }
        ArrayList arrayList3 = new ArrayList();
        arrayList3.addAll(UnitType.f1702ae);
        Collections.sort(arrayList3, new Comparator() { // from class: com.corrodinggames.rts.game.units.h.13
            /* renamed from: a */
            public int m2743a(UnitType unitType, UnitType unitType2) {
                Unit m3756c = Unit.m3756c(unitType);
                Unit m3756c2 = Unit.m3756c(unitType2);
                int compareTo = Boolean.valueOf(m3756c.mo3197bO()).compareTo(Boolean.valueOf(m3756c2.mo3197bO()));
                if (compareTo != 0) {
                    return compareTo;
                }
                int compareTo2 = Boolean.valueOf(unitType.mo3085j()).compareTo(Boolean.valueOf(unitType2.mo3085j()));
                if (compareTo2 != 0) {
                    return compareTo2;
                }
                int compareTo3 = Boolean.valueOf(m3756c.mo3198bN()).compareTo(Boolean.valueOf(m3756c2.mo3198bN()));
                if (compareTo3 != 0) {
                    return compareTo3;
                }
                C0407b mo3067u = unitType.mo3067u();
                C0407b mo3067u2 = unitType2.mo3067u();
                C0407b mo3137B = unitType.mo3137B();
                C0407b mo3137B2 = unitType2.mo3137B();
                if (mo3137B != null) {
                    mo3067u = C0407b.m3397a(mo3067u, mo3137B);
                }
                if (mo3137B2 != null) {
                    mo3067u2 = C0407b.m3397a(mo3067u2, mo3137B2);
                }
                int m3399a = mo3067u.m3399a(mo3067u2);
                if (m3399a != 0) {
                    return m3399a;
                }
                return 0;
            }
        });
        Iterator it2 = arrayList3.iterator();
        while (it2.hasNext()) {
            UnitType unitType = (UnitType) it2.next();
            if (unitType != UnitType.wall_v && !unitType.mo3087i().equals("test_tank") && !unitType.mo3087i().equals("missing") && unitType != UnitType.tankDestroyer && unitType != UnitType.megaTank && unitType != UnitType.fogRevealer && unitType != UnitType.crystalResource && unitType != UnitType.damagingBorder && unitType != UnitType.zoneMarker && unitType != UnitType.editorOrBuilder && unitType != UnitType.dummyNonUnitWithTeam && (Unit.m3756c(unitType) instanceof OrderableUnit) && (!(unitType instanceof CustomUnitMetadata) || ((CustomUnitMetadata) unitType).core_showInEditor)) {
                C0207h c0207h = new C0207h(new C0221v(unitType, 1, null), f3599D);
                boolean z = false;
                Iterator it3 = f3574A.iterator();
                while (it3.hasNext()) {
                    if (((Action) it3.next()).equals(c0207h)) {
                        z = true;
                    }
                }
                if (!z) {
                    f3574A.add(c0207h);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        GameEngine.getInstance();
        return f3574A;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public boolean isFixedFiring() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return 10.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public boolean mo2663F() {
        return GameEngine.getInstance().curSettings.renderExtraShadows && !this.dead;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: G */
    public float mo2661G() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: H */
    public float mo2659H() {
        return 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: u */
    public boolean mo1773u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0582q, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: I */
    public boolean mo2657I() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public boolean mo2679d(Unit unit) {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: J */
    public boolean mo2684J() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public float mo2681a(Unit unit, float f, Projectile projectile) {
        return super.mo2681a(unit, 0.0f, projectile);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public void mo2755N() {
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: O */
    public boolean mo2683O() {
        return true;
    }

    /* renamed from: a */
    public void m2751a(SandBoxAct sandBoxAct) {
        this.f3579q = sandBoxAct.f3579q;
        this.f3578c = sandBoxAct.f3578c;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeByte(0);
        outputNetStream.writeEnum(this.f3603C);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        inputNetStream.readByte();
        this.f3603C = (EnumC0570m) inputNetStream.readEnum(EnumC0570m.class);
        super.mo427a(inputNetStream);
    }
}