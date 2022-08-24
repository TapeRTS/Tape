package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.C0185c;
import com.corrodinggames.rts.game.C0187e;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EditorOrBuilder;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.C0401bb;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0863av;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p045m.C1049f;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.gameFramework.utility.C1104o;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.EOFException;
import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/y.class */
public class C1122y {

    /* renamed from: a */
    public static boolean f6957a = false;

    /* renamed from: b */
    final boolean f6958b;

    /* renamed from: c */
    int f6959c;

    /* renamed from: d */
    int f6960d;

    public C1122y() {
        if (!GameEngine.f6184as) {
        }
        this.f6958b = false;
        this.f6959c = -9999;
        this.f6960d = -9999;
    }

    /* renamed from: a */
    public File m448a(String str, boolean z) {
        return m449a(str, "saves/", z);
    }

    /* renamed from: a */
    public static File m449a(String str, String str2, boolean z) {
        return C0750a.m2461a(str, str2, z);
    }

    /* renamed from: b */
    public void m444b(String str, boolean z) {
        File m448a;
        File m448a2;
        GameEngine gameEngine = GameEngine.getInstance();
        String str2 = str;
        if (str2 != null && !str2.endsWith(".rwsave")) {
            str2 = str2 + ".rwsave";
        }
        File file = null;
        boolean z2 = false;
        try {
            m448a = m448a(str2 + ".tmp", true);
            if (m448a.exists()) {
                m448a = m448a(str2 + ".tmp2", true);
            }
            m448a2 = m448a(str2, true);
            GameEngine.PrintLog("Saving game to: " + m448a2.getAbsolutePath());
            OutputStream m2464a = C0750a.m2464a(m448a, false);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m2464a);
            if (!f6957a) {
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
                try {
                    m453a(new C0859ar(dataOutputStream));
                    dataOutputStream.close();
                    bufferedOutputStream.close();
                    m2464a.close();
                } catch (Throwable th) {
                    dataOutputStream.close();
                    bufferedOutputStream.close();
                    m2464a.close();
                    throw th;
                }
            } else {
                PrintStream printStream = new PrintStream(bufferedOutputStream);
                try {
                    m453a(new C0863av(printStream));
                    printStream.close();
                    bufferedOutputStream.close();
                    m2464a.close();
                    GameEngine.m1106n("DEBUG plain text save created");
                } catch (Throwable th2) {
                    printStream.close();
                    bufferedOutputStream.close();
                    m2464a.close();
                    throw th2;
                }
            }
            if (z && GameEngine.m1159as() && C0750a.m2443h(m448a2.getAbsolutePath())) {
                GameEngine.PrintLog("Autosave file already exists: " + m448a2.getAbsolutePath());
                if (!C0750a.m2457b(m448a2)) {
                    GameEngine.PrintLog("Old autosave failed to delete");
                }
            }
            GameEngine.PrintLog("Finished writing save, renaming to final filename");
        } catch (Exception e) {
            if (z) {
                GameEngine.PrintLog("Auto save failed: " + e.getMessage());
                return;
            }
            e.printStackTrace();
            gameEngine.m1192a("Error saving game to SD card, please check permissions, disk space, etc. (" + CommonUtils.m2304b(e) + ")", 1);
            if (0 != 0 && C0750a.m2443h(file.getAbsolutePath())) {
                GameEngine.PrintLog("saveGame: Removing temp save file after crash");
                C0750a.m2457b((File) null);
            }
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            gameEngine.m1192a("Error. Run out of memory error while saving game to SD card.", 1);
            if (0 != 0 && C0750a.m2443h(file.getAbsolutePath())) {
                GameEngine.PrintLog("saveGame: Removing temp save file after crash");
                C0750a.m2457b((File) null);
            }
        }
        if (!C0750a.m2456b(m448a, m448a2)) {
            GameEngine.PrintLog("Failed to rename to final file");
            throw new IOException("Failed to rename to final file. Check file permissions of storage.");
        }
        C0750a.m2452c(m448a2);
        z2 = true;
        if (z2) {
            if (z) {
                gameEngine.f6111bS.f5108f.m2102a("Auto Saved", 1000);
            } else {
                gameEngine.f6111bS.f5107e.m1952a(null, "Game saved");
            }
        }
    }

    /* renamed from: a */
    public void m453a(C0859ar c0859ar) {
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.m1144b("GameSaver", "saveCurrentMap took:" + (System.currentTimeMillis() - System.currentTimeMillis()));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            c0859ar.m1553c("rustedWarfareSave");
            c0859ar.mo1487a(gameEngine.m1135c(true));
            c0859ar.mo1487a(95);
            c0859ar.mo1482a(gameEngine.f6222ar);
            c0859ar.mo1484a("saveCompression", true);
            c0859ar.m1549e("customUnitsBlock");
            C0453l.m4761a(c0859ar);
            c0859ar.mo1485a("customUnitsBlock");
            c0859ar.m1549e("gameSetup");
            boolean z = gameEngine.networkEngine.f5564B || gameEngine.networkEngine.f5565F;
            c0859ar.mo1482a(gameEngine.networkEngine.f5564B);
            c0859ar.mo1482a(gameEngine.networkEngine.f5565F);
            c0859ar.mo1482a(z);
            if (z) {
                gameEngine.networkEngine.m1759a(c0859ar);
            }
            c0859ar.mo1485a("gameSetup");
            c0859ar.m1553c(gameEngine.f6159dk);
            boolean z2 = gameEngine.f6160dl != null;
            c0859ar.mo1482a(z2);
            if (z2) {
                GameEngine.PrintLog("Writing remote map steam into save");
                c0859ar.m1570a(gameEngine.f6160dl);
            }
            c0859ar.mo1487a(gameEngine.f6096by);
            c0859ar.mo1488a(gameEngine.f6140cx + gameEngine.f6150cH);
            c0859ar.mo1488a(gameEngine.f6141cy + gameEngine.f6151cI);
            c0859ar.mo1488a(gameEngine.f6248cU);
            c0859ar.mo1487a(gameEngine.f6114bV.f4067a);
            c0859ar.mo1487a(0);
            c0859ar.m1550e();
            gameEngine.f6104bL.m6634a(c0859ar);
            c0859ar.mo1482a(gameEngine.f6094bv);
            c0859ar.mo1482a(gameEngine.f6104bL.f840E);
            c0859ar.mo1482a(gameEngine.f6104bL.f841F);
            c0859ar.mo1482a(gameEngine.f6104bL.f842G);
            c0859ar.mo1482a(gameEngine.f6123ce != null);
            if (gameEngine.f6123ce != null) {
                gameEngine.f6123ce.mo466a(c0859ar);
            }
            c0859ar.m1550e();
            int i = -1;
            if (gameEngine.f6093bs != null) {
                i = gameEngine.f6093bs.f1305k;
            }
            c0859ar.mo1487a(i);
            c0859ar.mo1487a(Team.f1364c);
            for (int i2 = 0; i2 < Team.f1364c; i2++) {
                Team m6317k = Team.m6317k(i2);
                c0859ar.mo1482a(m6317k instanceof C0136a);
                c0859ar.mo1482a(m6317k instanceof C0185c);
                c0859ar.mo1482a(m6317k != null);
                if (m6317k != null) {
                    m6317k.m6364b(c0859ar);
                }
            }
            if (!gameEngine.f6111bS.f5191b) {
            }
            c0859ar.m1551d("Section: unit shells");
            c0859ar.mo1487a(AbstractC1120w.f6956en.size());
            Iterator it = AbstractC1120w.f6956en.iterator();
            while (it.hasNext()) {
                AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
                if (abstractC1120w == null) {
                    throw new RuntimeException("Found null in fastGameObjectList");
                }
                if (abstractC1120w instanceof Unit) {
                    Unit unit = (Unit) abstractC1120w;
                    if (unit.getUnitType() instanceof UnitType) {
                        c0859ar.m1554c(1);
                        c0859ar.m1564a((Enum) ((UnitType) unit.getUnitType()));
                    } else if (unit.getUnitType() instanceof C0453l) {
                        c0859ar.m1554c(3);
                        c0859ar.m1553c(((C0453l) unit.getUnitType()).f2920L);
                    } else {
                        throw new IOException("Unhandled getUnitType on save:" + unit.getUnitType().getClass().toString());
                    }
                } else {
                    c0859ar.m1554c(2);
                    if (abstractC1120w instanceof C0195l) {
                        c0859ar.m1554c(1);
                    } else if (abstractC1120w instanceof Projectile) {
                        c0859ar.m1554c(2);
                    } else if (abstractC1120w instanceof C0746f) {
                        c0859ar.m1554c(3);
                    } else {
                        String str = null;
                        if (abstractC1120w.getClass() != null) {
                            str = abstractC1120w.getClass().toString();
                        }
                        throw new IOException("Unhandled class on save: " + str);
                    }
                }
                c0859ar.m1577a(abstractC1120w.f6945ed);
            }
            c0859ar.m1551d("Section: CurrentUnitId");
            c0859ar.m1577a(gameEngine.networkEngine.m1612z());
            gameEngine.f6114bV.mo466a(c0859ar);
            gameEngine.f6111bS.mo466a(c0859ar);
            gameEngine.f6117bY.m2618a(c0859ar);
            for (int i3 = 0; i3 < Team.f1364c; i3++) {
                Team m6317k2 = Team.m6317k(i3);
                if (m6317k2 != null) {
                    m6317k2.mo466a(c0859ar);
                }
            }
            c0859ar.m1550e();
            Iterator it2 = AbstractC1120w.f6956en.iterator();
            while (it2.hasNext()) {
                AbstractC1120w abstractC1120w2 = (AbstractC1120w) it2.next();
                if (c0859ar.m1548f()) {
                    String simpleName = abstractC1120w2.getClass().getSimpleName();
                    if (abstractC1120w2 instanceof Unit) {
                        simpleName = ((Unit) abstractC1120w2).getUnitType().mo5706i();
                    }
                    c0859ar.m1551d("Saving unit:" + simpleName + " (id" + abstractC1120w2.f6945ed + ")");
                }
                abstractC1120w2.mo466a(c0859ar);
                c0859ar.m1550e();
            }
            c0859ar.mo1485a("saveCompression");
            c0859ar.m1550e();
            c0859ar.m1553c("<SAVE END>");
        } catch (Exception e) {
            e.printStackTrace();
            gameEngine.m1192a("Error saving game to SD card, please email the logs.", 1);
        }
        GameEngine.m1144b("GameSaver", "saveGame took:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: a */
    public String m451a(String str) {
        if (str == null) {
            return null;
        }
        return str.equals("maps/normal/l010;mission_1__-__Dividing_River.tmx") ? "maps/normal/l010;[demo]mission_1__-__Dividing_River.tmx" : str.equals("maps/normal/l030;mission_3__-__Crossfire.tmx") ? "maps/normal/l030;[demo]mission_3__-__Crossfire.tmx" : str;
    }

    /* renamed from: c */
    public boolean m442c(String str, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            File m448a = m448a(str, false);
            if (m448a.isDirectory()) {
                gameEngine.m1192a("Could not load, is a directory", 1);
                return false;
            }
            C1098j m2441j = C0750a.m2441j(m448a.getAbsolutePath());
            if (m2441j == null) {
                gameEngine.m1192a("Could not load, failed to open: " + C0750a.m2449d(m448a.getAbsolutePath()), 1);
                return false;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(m2441j);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            boolean m452a = m452a(new C0876k(dataInputStream), z, false, false);
            dataInputStream.close();
            bufferedInputStream.close();
            m2441j.close();
            return m452a;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m450a(String str, C0859ar c0859ar) {
        File m448a = m448a(str, false);
        if (m448a == null) {
            throw new IOException("Failed to get game save: " + str);
        }
        c0859ar.m1566a(m448a);
    }

    /* renamed from: a */
    public synchronized boolean m452a(C0876k c0876k, boolean z, boolean z2, boolean z3) {
        AbstractC1120w abstractC1120w;
        AbstractC1120w c0746f;
        Team m6317k;
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            C0727bl c0727bl = gameEngine.f6122cd;
            if (this.f6958b) {
                c0727bl.m2608a(EnumC0729bm.f4596y);
            }
            ArrayList arrayList = null;
            if (z3) {
                arrayList = new ArrayList();
                Iterator it = gameEngine.f6111bS.f5255bL.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((Unit) it.next()).f6945ed));
                }
            }
            try {
                try {
                    String m1448l = c0876k.m1448l();
                    if (!m1448l.equals("rustedWarfareSave")) {
                        GameEngine.m1145b("Map Load: Header is not correct:" + m1448l.substring(0, Math.min(m1448l.length(), 50)));
                        String str = "Failed to load save. (Could not find correct header)";
                        if (m1448l.equals("rustedWarfareReplay")) {
                            str = "Failed to load save. (This file appears to be a replay file, not a save file)";
                        }
                        GameEngine.m1145b(str);
                        gameEngine.m1192a(str, 1);
                        return false;
                    }
                    c0876k.m1454f();
                    int m1454f = c0876k.m1454f();
                    GameEngine.m1144b("gameSaver", "Loading save from version: " + m1454f);
                    c0876k.m1471a(m1454f);
                    if (m1454f > 95) {
                        gameEngine.m1192a("Cannot load: This save was made with a newer game", 1);
                        return false;
                    }
                    if (m1454f >= 5) {
                        c0876k.m1455e();
                    }
                    if (m1454f >= 23) {
                        c0727bl.m2608a(EnumC0729bm.f4599B);
                        c0876k.m1466a("saveCompression", true);
                        c0727bl.m2603b(EnumC0729bm.f4599B);
                    }
                    if (m1454f >= 54) {
                        c0876k.m1460b("customUnitsBlock");
                        if (gameEngine.f6120cb.m2635h() && !z3) {
                            GameEngine.PrintLog("Loading mods from replay");
                            try {
                                C0453l.m4760a(c0876k);
                                C0348af.m5391d();
                            } catch (C0401bb e) {
                                GameEngine.PrintLog("Replay load: Missing unit:" + e.getMessage() + " d:" + e.f2630b);
                                gameEngine.m1116i(e.getMessage() + ", this is likely to cause the replay to desync (reverting to default units & mods)");
                                C0348af.m5396b(true);
                            }
                        }
                        c0876k.m1456d("customUnitsBlock");
                    }
                    Integer num = null;
                    Integer num2 = null;
                    if (gameEngine.f6120cb.m2635h() && z3) {
                        num = Integer.valueOf(gameEngine.f6099bB);
                        num2 = Integer.valueOf(gameEngine.f6100bC);
                    }
                    if (m1454f >= 56) {
                        c0876k.m1460b("gameSetup");
                        boolean m1455e = c0876k.m1455e();
                        boolean z4 = m1455e;
                        boolean z5 = false;
                        if (m1454f >= 94) {
                            z5 = c0876k.m1455e();
                            z4 = c0876k.m1455e();
                        }
                        if ((gameEngine.f6120cb.m2635h() || !gameEngine.networkEngine.f5564B) && !z3 && z4) {
                            GameEngine.PrintLog("Using game rules from save");
                            gameEngine.f6120cb.f4502M = true;
                            gameEngine.networkEngine.m1746a(c0876k);
                            num = Integer.valueOf(gameEngine.f6099bB);
                            num2 = Integer.valueOf(gameEngine.f6100bC);
                            if ((m1455e || z5) && !gameEngine.networkEngine.f5565F && !gameEngine.networkEngine.f5564B && !gameEngine.f6120cb.m2635h()) {
                                GameEngine.PrintLog("Enabling use of singlePlayer rules from saved game.");
                                gameEngine.networkEngine.f5565F = true;
                            }
                        }
                        c0876k.m1456d("gameSetup");
                    }
                    gameEngine.f6160dl = null;
                    gameEngine.f6159dk = m451a(C0750a.m2437n(c0876k.m1448l()));
                    boolean z6 = false;
                    if (m1454f >= 72) {
                        z6 = c0876k.m1455e();
                        if (z6) {
                            GameEngine.PrintLog("Reading remote map stream");
                            gameEngine.f6160dl = c0876k.m1439u();
                        }
                    }
                    if (gameEngine.networkEngine.f5564B && !gameEngine.networkEngine.f5485C && z3 && gameEngine.networkEngine.f5519aR != null && !z6) {
                        gameEngine.f6159dk = VariableScope.nullOrMissingString;
                        gameEngine.f6160dl = gameEngine.networkEngine.f5519aR;
                    }
                    c0727bl.m2608a(EnumC0729bm.f4597z);
                    if (z3) {
                        gameEngine.m1183a(true, true, EnumC1063s.f6735c);
                        if (GameEngine.m1159as()) {
                            gameEngine.f6266du = true;
                        }
                    } else {
                        gameEngine.m1184a(true, EnumC1063s.f6735c);
                    }
                    if (!gameEngine.f6104bL.f802W) {
                        GameEngine.PrintLog("Not loading save because map failed to load");
                        return false;
                    }
                    if (num != null) {
                        gameEngine.f6099bB = num.intValue();
                    }
                    if (num2 != null) {
                        Integer.valueOf(gameEngine.f6100bC);
                    }
                    synchronized (gameEngine) {
                        c0727bl.m2603b(EnumC0729bm.f4597z);
                        gameEngine.f6096by = c0876k.m1454f();
                        float m1453g = c0876k.m1453g();
                        float m1453g2 = c0876k.m1453g();
                        float m1453g3 = c0876k.m1453g();
                        if (!z3) {
                            gameEngine.m1150b(m1453g, m1453g2);
                            gameEngine.f6248cU = m1453g3;
                        }
                        if (m1454f >= 18) {
                            gameEngine.f6114bV.f4067a = c0876k.m1454f();
                        }
                        c0876k.m1454f();
                        if (m1454f >= 19) {
                            c0876k.m1467a("end of setup");
                        }
                        gameEngine.f6104bL.m6633a(c0876k);
                        if (m1454f >= 86) {
                            boolean m1455e2 = c0876k.m1455e();
                            boolean m1455e3 = c0876k.m1455e();
                            boolean m1455e4 = c0876k.m1455e();
                            boolean m1455e5 = c0876k.m1455e();
                            if (!z && !m1455e2) {
                                gameEngine.f6104bL.f840E = m1455e3;
                                gameEngine.f6104bL.f841F = m1455e4;
                                gameEngine.f6104bL.f842G = m1455e5;
                            }
                        }
                        if (c0876k.m1455e()) {
                            if (gameEngine.f6123ce == null) {
                                GameEngine.m1144b("gameSaver", "making new mission engine on load, this shouldn't happen");
                                gameEngine.f6123ce = new C1049f();
                                gameEngine.f6123ce.m821a(false);
                            }
                            gameEngine.f6123ce.m828a(c0876k);
                        }
                        if (m1454f >= 19) {
                            c0876k.m1467a("start of teams");
                        }
                        GameEngine.m1144b("gameSaver", "loading teams");
                        Team[] teamArr = new Team[Team.f1366e];
                        int i = -1;
                        if (m1454f >= 36) {
                            i = c0876k.m1454f();
                        }
                        int i2 = 8;
                        if (m1454f >= 49) {
                            i2 = c0876k.m1454f();
                            Team.m6371b(i2, false);
                            for (int i3 = 0; i3 < Team.f1364c; i3++) {
                                if (i3 >= i2 && !z && (m6317k = Team.m6317k(i3)) != null) {
                                    m6317k.m6414G();
                                }
                            }
                        }
                        for (int i4 = 0; i4 < i2; i4++) {
                            C0136a m6317k2 = Team.m6317k(i4);
                            boolean m1455e6 = c0876k.m1455e();
                            boolean z7 = false;
                            if (m1454f >= 7) {
                                z7 = c0876k.m1455e();
                            }
                            if (c0876k.m1455e()) {
                                if (m1455e6) {
                                    if (m6317k2 == null || !(m6317k2 instanceof C0136a)) {
                                        if (z && !z3 && m6317k2 != null) {
                                            GameEngine.m1145b("Would replace team:" + i4 + " with AI, writing to dummy AI");
                                            m6317k2 = new C0136a(i4, false);
                                            teamArr[i4] = m6317k2;
                                        } else {
                                            if (z3) {
                                                GameEngine.m1145b("Adding new AI " + i4 + " on resync");
                                            }
                                            m6317k2 = new C0136a(i4);
                                        }
                                    }
                                } else if (z7) {
                                    if (m6317k2 == null || !(m6317k2 instanceof C0185c)) {
                                        if (z) {
                                            GameEngine.m1145b("Replacing team:" + i4 + " with NetworkedPlayer");
                                        }
                                        m6317k2 = new C0185c(i4);
                                    }
                                } else if (m6317k2 == null || !(m6317k2 instanceof C0187e)) {
                                    if (z) {
                                        GameEngine.m1145b("Replacing team:" + i4 + " with Player");
                                        if (m6317k2 != null) {
                                            m6317k2.m6347c("Existing");
                                        }
                                    }
                                    m6317k2 = new C0187e(i4);
                                }
                                Integer num3 = m6317k2.f1319y;
                                if (m1454f >= 2) {
                                    m6317k2.m6363b(c0876k);
                                } else {
                                    m6317k2.m6348c(c0876k);
                                }
                                if (!z3) {
                                    m6317k2.m6322i();
                                    if (z) {
                                        m6317k2.f1319y = num3;
                                        m6317k2.m6347c("networkLoad aiDifficultyOverride=" + num3);
                                        gameEngine.networkEngine.m1766a(m6317k2);
                                        gameEngine.networkEngine.m1699b(m6317k2);
                                    }
                                    if (m6317k2 != null && m6317k2 != m6317k2) {
                                        m6317k2.m6347c("Transfering team stats");
                                        m6317k2.f1309o = m6317k2.f1309o;
                                        m6317k2.m6402S().m5121a(m6317k2.m6402S());
                                    }
                                }
                            } else if (z && !gameEngine.f6120cb.m2635h()) {
                                GameEngine.m1145b("GameSaver: Would normally remove team:" + i4 + VariableScope.nullOrMissingString);
                                teamArr[i4] = Team.f1368g;
                            } else {
                                Team m6317k3 = Team.m6317k(i4);
                                if (m6317k3 != null) {
                                    m6317k3.m6414G();
                                }
                            }
                        }
                        boolean z8 = false;
                        gameEngine.networkEngine.m1712aq();
                        if (gameEngine.f6120cb.m2635h()) {
                            gameEngine.f6093bs = Team.f1370i;
                        } else if (gameEngine.networkEngine.f5564B) {
                            if (gameEngine.networkEngine.f5483z != null) {
                                int i5 = gameEngine.networkEngine.f5483z.f1305k;
                                if (i5 != -3) {
                                    Team m6317k4 = Team.m6317k(i5);
                                    if (m6317k4 == null) {
                                        throw new RuntimeException("GameSaver: Cannot relink player team: " + i5);
                                    }
                                    gameEngine.f6093bs = m6317k4;
                                }
                            }
                        } else if (i != -1 && i != -3) {
                            gameEngine.f6093bs = Team.m6317k(i);
                        } else {
                            for (int i6 = 0; i6 < Team.f1364c; i6++) {
                                if (Team.m6317k(i6) instanceof C0187e) {
                                    gameEngine.f6093bs = Team.m6317k(i6);
                                }
                            }
                        }
                        Iterator it2 = AbstractC1120w.m460dI().iterator();
                        while (it2.hasNext()) {
                            ((AbstractC1120w) it2.next()).mo2880a();
                        }
                        if (gameEngine.m1209Z()) {
                            Iterator it3 = AbstractC1120w.m460dI().iterator();
                            while (it3.hasNext()) {
                                AbstractC1120w abstractC1120w2 = (AbstractC1120w) it3.next();
                                if (abstractC1120w2.f6945ed == 0) {
                                    if (abstractC1120w2 instanceof Unit) {
                                        GameEngine.PrintLog("object: " + ((Unit) abstractC1120w2).m5845cA());
                                    }
                                    throw new RuntimeException("GameLoad preload: Found object in list with id:0");
                                }
                            }
                        }
                        boolean z9 = false;
                        int m1454f2 = c0876k.m1454f();
                        for (int i7 = 0; i7 < m1454f2; i7++) {
                            byte m1457d = c0876k.m1457d();
                            if (m1457d == 1) {
                                UnitType unitType = (UnitType) c0876k.m1461b(UnitType.class);
                                if (unitType == UnitType.f1784Y) {
                                    if (gameEngine.f6120cb.m2635h() || gameEngine.f6094bv) {
                                        GameEngine.PrintLog("Creating DebugEditorBuilder for replay");
                                        c0746f = new EditorOrBuilder(false);
                                        EditorOrBuilder m1983i = gameEngine.f6111bS.m1983i();
                                        if (m1983i == null || m1983i.f6946ef) {
                                            GameEngine.PrintLog("Relinking editor");
                                            gameEngine.f6111bS.m2036a((EditorOrBuilder) c0746f);
                                        }
                                    } else {
                                        GameEngine.PrintLog("Creating DebugEditorBuilder for load");
                                        c0746f = new EditorOrBuilder(false);
                                        z8 = true;
                                    }
                                } else {
                                    c0746f = unitType.mo5717a();
                                }
                            } else if (m1457d == 3) {
                                String m1448l2 = c0876k.m1448l();
                                C0453l m4713n = C0453l.m4713n(m1448l2);
                                if (m4713n == null) {
                                    String str2 = "Could not find custom unit:" + m1448l2;
                                    GameEngine.PrintLog(str2);
                                    if (!z9) {
                                        z9 = true;
                                        C0831ad.m1648g(str2);
                                    }
                                    m4713n = C0453l.f2901b;
                                    if (m4713n == null) {
                                        throw new RuntimeException("Could not find custom unit:" + m1448l2 + " and missingPlaceHolder is null");
                                    }
                                }
                                InterfaceC0303as m4738c = C0453l.m4738c(m4713n);
                                if (m4738c != null) {
                                    if (m4738c instanceof C0453l) {
                                        m4713n = (C0453l) m4738c;
                                    } else {
                                        GameEngine.m1145b("replacement not a custom unit:" + m4738c.mo5706i());
                                    }
                                }
                                c0746f = m4713n.m4774a();
                            } else if (m1457d == 2) {
                                byte m1457d2 = c0876k.m1457d();
                                if (m1457d2 == 1) {
                                    c0746f = new C0195l();
                                } else if (m1457d2 == 2) {
                                    c0746f = new Projectile(false);
                                } else if (m1457d2 == 3) {
                                    c0746f = new C0746f(gameEngine.effects);
                                } else {
                                    throw new IOException("Unhandled gameType on load:" + ((int) m1457d2));
                                }
                            } else {
                                throw new IOException("Unhandled basic type on load:" + ((int) m1457d));
                            }
                            c0746f.f6945ed = c0876k.m1451i();
                            if (c0746f.f6945ed == 0) {
                                GameEngine.m1145b("GameSaver: Adding object with id==0");
                                if (c0746f instanceof Unit) {
                                    GameEngine.m1145b(((Unit) c0746f).m5844cB());
                                }
                            }
                            AbstractC1120w.m459dJ();
                        }
                        if (m1454f >= 3) {
                            long m1451i = c0876k.m1451i();
                            if (m1451i <= 0) {
                                GameEngine.m1193a("GameLoad: Trying to set next unit id <= 0: " + m1451i);
                                m1451i = 100000;
                            }
                            gameEngine.networkEngine.m1770a(m1451i);
                        } else {
                            gameEngine.networkEngine.m1770a(100000L);
                        }
                        if (m1454f >= 24) {
                            gameEngine.f6114bV.m2982a(c0876k);
                        }
                        if (m1454f >= 4) {
                            gameEngine.f6111bS.m2029a(c0876k, z3);
                        }
                        if (m1454f >= 57) {
                            gameEngine.f6117bY.m2617a(c0876k, z3);
                        }
                        if (m1454f >= 7) {
                            for (int i8 = 0; i8 < i2; i8++) {
                                Team m6317k5 = Team.m6317k(i8);
                                if (teamArr[i8] != null) {
                                    m6317k5 = teamArr[i8];
                                    if (m6317k5 == Team.f1368g) {
                                        m6317k5 = null;
                                    }
                                }
                                if (m6317k5 != null) {
                                    Integer num4 = m6317k5.f1319y;
                                    m6317k5.m6348c(c0876k);
                                    if (!z3) {
                                        if (z) {
                                            m6317k5.f1319y = num4;
                                            m6317k5.m6347c("networkLoad2 aiDifficultyOverride=" + num4);
                                        }
                                        gameEngine.networkEngine.m1766a(m6317k5);
                                        gameEngine.networkEngine.m1699b(m6317k5);
                                    }
                                }
                            }
                        } else if (m1454f >= 2) {
                        }
                        if (m1454f >= 10) {
                            c0876k.m1467a("Pre-unit data");
                        }
                        c0727bl.m2608a(EnumC0729bm.f4598A);
                        C1104o m460dI = AbstractC1120w.m460dI();
                        GameEngine.m1144b("gameSaver", "Loading unit data for " + m460dI.size() + " objects.");
                        Iterator it4 = m460dI.iterator();
                        while (it4.hasNext()) {
                            ((AbstractC1120w) it4.next()).mo2877a(c0876k);
                            if (m1454f >= 10) {
                                c0876k.m1467a("post unit: " + abstractC1120w.getClass().toString() + " with id:" + abstractC1120w.f6945ed);
                            }
                        }
                        GameEngine.m1144b("gameSaver", "Loading unit data done.");
                        c0727bl.m2603b(EnumC0729bm.f4598A);
                        if (z8) {
                            Iterator it5 = AbstractC1120w.m460dI().iterator();
                            while (it5.hasNext()) {
                                AbstractC1120w abstractC1120w3 = (AbstractC1120w) it5.next();
                                if (abstractC1120w3 instanceof Unit) {
                                    Unit unit = (Unit) abstractC1120w3;
                                    if (!gameEngine.f6120cb.m2635h() && !gameEngine.f6094bv && unit.getUnitType() == UnitType.f1784Y) {
                                        unit.m5812ch();
                                    }
                                }
                            }
                        }
                        if (m1454f >= 23) {
                            c0876k.m1456d("saveCompression");
                        }
                        if (m1454f >= 19) {
                            c0876k.m1467a("End of Save");
                            c0876k.m1448l();
                        }
                        GameEngine.m1144b("gameSaver", "Checking for ID overlaps");
                        int i9 = 0;
                        if (1 != 0) {
                            AbstractC1120w[] m539a = AbstractC1120w.f6956en.m539a();
                            int size = AbstractC1120w.f6956en.size();
                            for (int i10 = 0; i10 < size; i10++) {
                                AbstractC1120w abstractC1120w4 = m539a[i10];
                                if (abstractC1120w4.f6945ed == 0) {
                                    GameEngine.m1145b("GameSaver: Fixing object with zero id.");
                                    abstractC1120w4.f6945ed = gameEngine.networkEngine.m1613y();
                                }
                                for (int i11 = i10 + 1; i11 < size; i11++) {
                                    AbstractC1120w abstractC1120w5 = m539a[i11];
                                    if (abstractC1120w4 != abstractC1120w5 && abstractC1120w4.f6945ed == abstractC1120w5.f6945ed) {
                                        i9++;
                                        abstractC1120w5.f6945ed = gameEngine.networkEngine.m1613y();
                                    }
                                }
                            }
                        }
                        GameEngine.m1144b("gameSaver", "clearing out dead units.");
                        GameEngine.PrintLog("Unit.fastLiveUnitList before:" + Unit.f1589bD.size());
                        Iterator it6 = Unit.f1589bD.iterator();
                        while (it6.hasNext()) {
                            if (((Unit) it6.next()).isDead) {
                                it6.remove();
                            }
                        }
                        GameEngine.PrintLog("Unit.fastLiveUnitList after:" + Unit.f1589bD.size());
                        if (i9 > 0) {
                            if (m1454f <= 2) {
                                gameEngine.m1192a("Warning: " + i9 + " errors were found in this save, this is due to a bug in the old version", 1);
                            } else {
                                gameEngine.m1192a("Warning: " + i9 + " errors were found in this save", 1);
                            }
                        }
                        GameEngine.m1144b("gameSaver", "Fixing map cost.");
                        gameEngine.f6113bU.m1312a((AbstractC0623y) null);
                        gameEngine.f6113bU.m1303b();
                        GameEngine.m1144b("gameSaver", "Fixing map cost done.");
                        Team.m6409L();
                        for (int i12 = 0; i12 < Team.f1364c; i12++) {
                            Team m6317k6 = Team.m6317k(i12);
                            if (m6317k6 != null) {
                                m6317k6.m6337d(false);
                            }
                        }
                        Team.m6336e();
                        GameEngine.m1144b("gameSaver", "Rebuilt unit caches");
                        Team.m6409L();
                        Team.m6400U();
                        for (int i13 = 0; i13 < Team.f1364c; i13++) {
                            Team m6317k7 = Team.m6317k(i13);
                            if (m6317k7 != null && (m6317k7 instanceof C0136a)) {
                                ((C0136a) m6317k7).m6853am();
                            }
                        }
                        if (arrayList != null) {
                            gameEngine.f6111bS.m1958x();
                            Iterator it7 = arrayList.iterator();
                            while (it7.hasNext()) {
                                Unit m467a = AbstractC1120w.m467a(((Long) it7.next()).longValue(), true);
                                if (m467a != null) {
                                    gameEngine.f6111bS.m1978k(m467a);
                                }
                            }
                        }
                        if (gameEngine.m1209Z()) {
                            Iterator it8 = AbstractC1120w.m460dI().iterator();
                            while (it8.hasNext()) {
                                AbstractC1120w abstractC1120w6 = (AbstractC1120w) it8.next();
                                if (abstractC1120w6.f6945ed == 0) {
                                    if (abstractC1120w6 instanceof Unit) {
                                        GameEngine.PrintLog("object: " + ((Unit) abstractC1120w6).m5845cA());
                                    }
                                    throw new RuntimeException("GameLoad postload: Found object in list with id:0");
                                }
                            }
                        }
                        GameEngine.PrintLog("--- Save file load complete ---");
                        GameEngine.PrintLog("GameObject.fastGameObjectList:" + AbstractC1120w.f6956en.size());
                        GameEngine.PrintLog("Unit.fastLiveUnitList:" + Unit.f1589bD.size());
                        if (!z3) {
                            gameEngine.f6120cb.m2647a(z3);
                        }
                        if (this.f6958b) {
                            c0727bl.m2603b(EnumC0729bm.f4596y);
                            c0727bl.m2606a(true, true);
                        }
                    }
                    return true;
                } catch (EOFException e2) {
                    e2.printStackTrace();
                    GameEngine.m1145b("Failed to load save. (End of file trying to read header)");
                    gameEngine.m1192a("Failed to load save. (End of file trying to read header)", 1);
                    return false;
                }
            } catch (IOException e3) {
                e3.printStackTrace();
                String str3 = "Failed to load save. (Failed to read header: " + e3.getMessage() + ")";
                GameEngine.m1145b(str3);
                gameEngine.m1192a(str3, 1);
                return false;
            }
        } catch (Exception e4) {
            e4.printStackTrace();
            GameEngine.PrintLog("Save load error, clearing all units");
            Iterator it9 = AbstractC1120w.m460dI().iterator();
            while (it9.hasNext()) {
                AbstractC1120w abstractC1120w7 = (AbstractC1120w) it9.next();
                if (abstractC1120w7.f6945ed == 0) {
                    abstractC1120w7.f6945ed = gameEngine.networkEngine.m1613y();
                }
                abstractC1120w7.mo2880a();
            }
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: b */
    public boolean m445b(String str) {
        GameEngine.PrintLog("Deleting: " + str);
        String m2437n = C0750a.m2437n(str);
        if (m2437n.contains("\\") || m2437n.contains("/")) {
            GameEngine.PrintLog("Cannot get save with path: " + str);
            return false;
        }
        File m448a = m448a(str, true);
        boolean m2457b = C0750a.m2457b(m448a);
        C0750a.m2457b(m448a(str + ".map", true));
        if (!m2457b) {
            GameEngine.PrintLog("Failed to delete: " + m448a.getAbsolutePath());
            GameEngine.getInstance().m1116i("Failed to delete: " + m448a.getAbsolutePath());
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m447a(boolean z) {
        GameEngine.getInstance();
        if (!z) {
            this.f6959c = -9999;
            this.f6960d = -9999;
        }
    }

    /* renamed from: a */
    public boolean m454a() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!gameEngine.f6109bQ.autosaving || GameEngine.m1155aw() || !gameEngine.f6236bG || gameEngine.f6237bH || gameEngine.f6120cb.m2635h() || gameEngine.m1223L()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m446b() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!m454a()) {
            return;
        }
        if (this.f6960d == -9999) {
            this.f6959c = gameEngine.f6096by;
            this.f6960d = gameEngine.f6096by;
        }
        if (this.f6960d + 300000 < gameEngine.f6096by) {
            this.f6960d = gameEngine.f6096by;
            long m2612a = C0727bl.m2612a();
            m443c();
            GameEngine.PrintLog("Autosaved (" + C0727bl.m2611a(C0727bl.m2610a(m2612a)) + ")");
        }
    }

    /* renamed from: c */
    public void m443c() {
        m444b("autosave", true);
    }
}
