package com.corrodinggames.librocket.scripts;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0243al;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0749e;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.C1122y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0845ah;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p041i.Connection;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0846ai;
import com.corrodinggames.rts.gameFramework.p041i.RunnableC0854an;
import com.corrodinggames.rts.gameFramework.p042j.C0899d;
import com.corrodinggames.rts.gameFramework.p042j.C0906k;
import com.corrodinggames.rts.gameFramework.p042j.C0908m;
import com.corrodinggames.rts.gameFramework.p042j.C0911p;
import com.corrodinggames.rts.p008a.RunnableC0069a;
import com.corrodinggames.rts.p008a.p009a.C0073b;
import com.corrodinggames.rts.p008a.p009a.C0085n;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;
import net.rudp.C0017h;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Debug.class */
public class Debug extends ScriptContext {
    Root root;
    boolean allFeatures;
    ConcurrentLinkedQueue backgroundClientConnections;
    Thread backgroundConnectionThread;
    Runnable backgroundConnectionRunnable = new RunnableC00521();
    boolean forceNonThreaded = true;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Debug(Root root) {
        this.root = root;
    }

    public void setLocalPlayerName(String str) {
        GameEngine.m1228A().networkEngine.m1739a(str);
    }

    public void setDdosProtection(boolean z) {
        RunnableC0854an.f5688b = z;
    }

    public void lookAt(float f, float f2) {
        GameEngine.m1228A().m1144b(f, f2);
    }

    public void createManyUnits(String str, float f, float f2, int i, boolean z, int i2) {
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i5 < i2) {
            i3 += 9;
            if (i3 > 400) {
                i3 = 0;
                i4 += 9;
            }
            createUnit(str, f + i3, f2 + i4, i, i5 == 0 ? z : false);
            i5++;
        }
    }

    public Long createUnit(String str, float f, float f2, int i, boolean z) {
        GameEngine m1228A = GameEngine.m1228A();
        InterfaceC0303as m5125a = AbstractC0249ar.m5125a(str);
        if (m5125a == null) {
            this.root.logWarn("Could not find type:" + str);
            return null;
        }
        AbstractC0244am mo4987a = m5125a.mo4987a();
        mo4987a.f6951ek = f;
        mo4987a.f6952el = f2;
        try {
            mo4987a.m5323Q(i);
            AbstractC0197n.m5605c(mo4987a);
            mo4987a.f1647cI = true;
            if (z) {
                m1228A.m1144b(f, f2);
            }
            return Long.valueOf(mo4987a.f6945ed);
        } catch (C0179f e) {
            throw new RuntimeException(e);
        }
    }

    public int getMaxCustomUnitTypeId() {
        return C0453l.f3185d.size();
    }

    public Long createCustomUnitFromTypeId(int i, float f, float f2, int i2, boolean z) {
        GameEngine m1228A = GameEngine.m1228A();
        AbstractC0244am mo4987a = ((C0453l) C0453l.f3185d.get(i)).mo4987a();
        mo4987a.f6951ek = f;
        mo4987a.f6952el = f2;
        try {
            mo4987a.m5323Q(i2);
            AbstractC0197n.m5605c(mo4987a);
            mo4987a.f1647cI = true;
            if (z) {
                m1228A.m1144b(f, f2);
            }
            return Long.valueOf(mo4987a.f6945ed);
        } catch (C0179f e) {
            throw new RuntimeException(e);
        }
    }

    public void enableFeatures(String str) {
        if (C0758f.m2267e(str).startsWith("221FC410BD29D786")) {
            this.allFeatures = true;
            RunnableC0069a.f388d = true;
            return;
        }
        throw new RuntimeException("unknown");
    }

    public void selectNextUnit() {
        GameEngine m1228A = GameEngine.m1228A();
        AbstractC0244am abstractC0244am = null;
        boolean z = false;
        Iterator it = AbstractC0244am.m5286bF().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0244am abstractC0244am2 = (AbstractC0244am) it.next();
            if ((abstractC0244am2 instanceof AbstractC0244am) && !(abstractC0244am2 instanceof C0243al) && !abstractC0244am2.m5151t()) {
                if (abstractC0244am == null) {
                    abstractC0244am = abstractC0244am2;
                }
                if (z) {
                    abstractC0244am = abstractC0244am2;
                    break;
                }
                z = abstractC0244am2.f1643cE;
            }
        }
        m1228A.f6111bS.m1952x();
        if (abstractC0244am != null) {
            m1228A.f6111bS.m1974j(abstractC0244am);
        }
    }

    public void removeAllUnits() {
        Iterator it = AbstractC1120w.m454dI().iterator();
        while (it.hasNext()) {
            ((AbstractC1120w) it.next()).mo2879a();
        }
    }

    public void killAllUnits() {
        Iterator it = AbstractC0244am.m5286bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0244am) {
                abstractC0244am.f1631cs = -1.0f;
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.librocket.scripts.Debug$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Debug$1.class */
    public class RunnableC00521 implements Runnable {
        RunnableC00521() {
        }

        public void run() {
            Iterator it = Debug.this.backgroundClientConnections.iterator();
            while (it.hasNext()) {
                Connection connection = (Connection) it.next();
            }
        }
    }

    public boolean backgroundCurrentClientConnection() {
        if (!this.allFeatures) {
            return false;
        }
        GameEngine m1228A = GameEngine.m1228A();
        if (!m1228A.networkEngine.f5564B) {
            GameEngine.PrintLog("Not networked");
            return false;
        } else if (m1228A.networkEngine.f5485C) {
            throw new RuntimeException("server=true");
        } else {
            if (this.backgroundConnectionThread == null) {
                this.backgroundConnectionThread = new Thread(this.backgroundConnectionRunnable);
                this.backgroundConnectionThread.start();
            }
            if (this.backgroundClientConnections == null) {
                this.backgroundClientConnections = new ConcurrentLinkedQueue();
            }
            Iterator it = m1228A.networkEngine.f5600bc.iterator();
            while (it.hasNext()) {
                Connection connection = (Connection) it.next();
                connection.f5775t = true;
                this.backgroundClientConnections.add(connection);
                m1228A.networkEngine.f5600bc.remove(connection);
            }
            m1228A.networkEngine.m1684b("backgrounded");
            m1228A.networkEngine.f5564B = true;
            return true;
        }
    }

    public boolean isTeamWipedOut(int i) {
        AbstractC0197n m5569k = AbstractC0197n.m5569k(i);
        if (m5569k == null) {
            this.root.logWarn("Could not find team:" + i);
            return true;
        }
        return m5569k.f1329F;
    }

    public boolean isTeamDefeated(int i) {
        AbstractC0197n m5569k = AbstractC0197n.m5569k(i);
        if (m5569k == null) {
            this.root.logWarn("Could not find team:" + i);
            return true;
        }
        return m5569k.f1329F;
    }

    public boolean isTeamInVictory(int i) {
        AbstractC0197n m5569k = AbstractC0197n.m5569k(i);
        if (m5569k == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        return m5569k.f1330G;
    }

    public String getPlayerName(int i) {
        AbstractC0197n m5569k = AbstractC0197n.m5569k(i);
        if (m5569k == null) {
            this.root.logWarn("Could not find team:" + i);
            return null;
        }
        return m5569k.f1315u;
    }

    public String getQueryStringOfPlayer(int i) {
        GameEngine m1228A = GameEngine.m1228A();
        AbstractC0197n m5569k = AbstractC0197n.m5569k(i);
        if (m5569k == null) {
            this.root.logWarn("Could not find team:" + i);
            return null;
        }
        Connection m1677c = m1228A.networkEngine.m1677c(m5569k);
        if (m1677c == null) {
            this.root.logWarn("Found team but could not find connection for team:" + i);
            return null;
        }
        return m1677c.f5770o;
    }

    public boolean setTeamCredits(int i, int i2) {
        AbstractC0197n m5569k = AbstractC0197n.m5569k(i);
        if (m5569k == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        m5569k.f1309o = i2;
        return true;
    }

    public boolean setTeamAllyGroup(int i, int i2) {
        AbstractC0197n m5569k = AbstractC0197n.m5569k(i);
        if (m5569k == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        m5569k.f1311q = i2;
        return true;
    }

    public void giveUpgradeToAllUnits() {
        Iterator it = AbstractC0244am.m5286bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                AbstractC0224s a = abstractC0623y.m5314a(abstractC0623y.m5215cl());
                if (a != null) {
                    abstractC0623y.m5313a(a, false);
                }
            }
        }
    }

    public void giveAllActionsToAllUnits() {
        Iterator it = AbstractC0244am.m5286bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                Iterator it2 = abstractC0623y.m5327N().iterator();
                while (it2.hasNext()) {
                    abstractC0623y.m5313a((AbstractC0224s) it2.next(), false);
                }
            }
        }
    }

    public void completeAllUnitsQueues() {
        Iterator it = AbstractC0244am.m5286bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof InterfaceC0501l) {
                ((InterfaceC0501l) abstractC0244am).mo3765dw();
            }
        }
    }

    public boolean moveAllUnitsOnTeam(int i, float f, float f2) {
        AbstractC0197n m5569k = AbstractC0197n.m5569k(i);
        if (m5569k == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        C0749e m2589b = GameEngine.m1228A().f6124cf.m2589b(m5569k);
        Iterator it = AbstractC0244am.m5286bF().iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC0244am;
                if (abstractC0623y.f1608bV == m5569k) {
                    m2589b.m2488a(abstractC0623y);
                }
            }
        }
        m2589b.m2498a(f, f2);
        return true;
    }

    public void showMessage(String str) {
        GameEngine m1228A = GameEngine.m1228A();
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return;
        }
        m1228A.networkEngine.m1622m(str.replace("\\n", "\n"));
    }

    public String unicodeTest1() {
        return "start ¥123 \u061c end";
    }

    public void setZoom(float f) {
        GameEngine.m1228A().f6248cU = f;
    }

    public boolean isNetworkGameActive() {
        return GameEngine.m1228A().m1216M();
    }

    public int getLocalPlayerId() {
        return GameEngine.m1228A().networkEngine.f5483z.f1305k;
    }

    public int numberOfHumanPlayers() {
        return GameEngine.m1228A().networkEngine.m1709an();
    }

    public int numberOfPlayersPlusAI() {
        return GameEngine.m1228A().networkEngine.m1708ao();
    }

    public int numberOfPlayerConnections() {
        return GameEngine.m1228A().networkEngine.m1796A();
    }

    public boolean enableFastSync() {
        GameEngine.m1228A().networkEngine.f5576ai = 30;
        return true;
    }

    public boolean enableExtraNetworkDebug() {
        GameEngine.m1228A().networkEngine.f5470g = true;
        return true;
    }

    public boolean throwIfAnyPlayerNotInSync() {
        GameEngine.m1228A().networkEngine.m1608x();
        return true;
    }

    public boolean enableFastResyncTimer() {
        C0831ad.f5553c = true;
        return true;
    }

    public boolean enablePauseOnDesync() {
        GameEngine.m1228A().networkEngine.f5507aj = true;
        return true;
    }

    public boolean networkSetIncomeMultiplier(float f) {
        GameEngine m1228A = GameEngine.m1228A();
        C0845ah m1660e = m1228A.networkEngine.m1660e();
        m1660e.f5655h = f;
        m1228A.networkEngine.m1755a(m1660e);
        return true;
    }

    public boolean networkSetPortNumber(int i) {
        GameEngine.m1228A().f6109bQ.networkPort = i;
        return true;
    }

    public boolean networkSetUdp(boolean z) {
        GameEngine.m1228A().f6109bQ.udpInMultiplayer = z;
        return true;
    }

    public boolean networkDisconnect() {
        GameEngine.m1228A().networkEngine.m1684b("debug");
        return true;
    }

    public boolean networkAbort() {
        GameEngine m1228A = GameEngine.m1228A();
        Iterator it = m1228A.networkEngine.f5600bc.iterator();
        while (it.hasNext()) {
            Connection connection = (Connection) it.next();
            if (connection.f5761d instanceof C0017h) {
                GameEngine.PrintLog("Closing: " + connection.m1490g());
                ((C0017h) connection.f5761d).m6665d();
            }
        }
        m1228A.networkEngine.m1684b("debug");
        return true;
    }

    public boolean disableNetworkOwnInfo() {
        C0831ad.f5554r = false;
        return true;
    }

    public boolean networkPause() {
        GameEngine m1228A = GameEngine.m1228A();
        m1228A.networkEngine.f5507aj = true;
        m1228A.networkEngine.f5508ak = true;
        return true;
    }

    public boolean plainTextDebugSave(boolean z) {
        GameEngine.m1228A();
        C1122y.f6957a = z;
        return true;
    }

    public boolean checkDesync(int i) {
        GameEngine m1228A = GameEngine.m1228A();
        if (m1228A.networkEngine.f5512aF != 0) {
            throw new RuntimeException("numberOfDesyncErrors==" + m1228A.networkEngine.f5512aF);
        }
        if (m1228A.networkEngine.f5513aG < i) {
            throw new RuntimeException("game.network.numberOfDesyncPasses:" + m1228A.networkEngine.f5513aG + "<" + i);
        }
        this.root.logDebug("numberOfDesyncPasses:" + m1228A.networkEngine.f5513aG);
        return true;
    }

    public int getNumberOfDesyncErrors() {
        return GameEngine.m1228A().networkEngine.f5512aF;
    }

    public int getNumberOfDesyncPasses() {
        return GameEngine.m1228A().networkEngine.f5513aG;
    }

    public int getNumberOfResyncSendsOrRecv() {
        return GameEngine.m1228A().networkEngine.f5514aH;
    }

    public boolean setMultiplayerMap(int i, String str) {
        C0845ah c0845ah = GameEngine.m1228A().networkEngine.f5597aO;
        c0845ah.f5648a = EnumC0846ai.values()[i];
        c0845ah.f5649b = str;
        return true;
    }

    public boolean setMultiplayerSave(String str) {
        C0845ah c0845ah = GameEngine.m1228A().networkEngine.f5597aO;
        c0845ah.f5648a = EnumC0846ai.savedGame;
        c0845ah.f5649b = str;
        return true;
    }

    public void generateNewClientId() {
        GameEngine.m1228A().networkEngine.m1772Y();
    }

    public void disableFog() {
        GameEngine.m1228A();
    }

    public void overrideDeltaSpeed(float f) {
        GameEngine.m1228A().f6232bu = f;
    }

    public void setGameSetting(String str, String str2) {
        GameEngine.m1228A().f6109bQ.setValueDynamic(str, str2);
    }

    public void setNetworkaiDifficulty(int i) {
        GameEngine m1228A = GameEngine.m1228A();
        C0845ah m1660e = m1228A.networkEngine.m1660e();
        m1660e.f5653f = i;
        m1228A.networkEngine.m1755a(m1660e);
    }

    public void setNetworkStartingUnits(int i) {
        GameEngine m1228A = GameEngine.m1228A();
        C0845ah m1660e = m1228A.networkEngine.m1660e();
        m1660e.f5654g = i;
        m1228A.networkEngine.m1755a(m1660e);
    }

    public void startRandomUnitDesyncTest() {
        GameEngine m1228A = GameEngine.m1228A();
        C0749e m2590b = m1228A.f6124cf.m2590b();
        m2590b.f4840i = AbstractC0197n.f1370i;
        m2590b.f4850r = true;
        m2590b.f4853u = 1;
        m1228A.networkEngine.m1757a(m2590b);
    }

    public void startRandomUnitStressTest() {
        GameEngine m1228A = GameEngine.m1228A();
        C0749e m2590b = m1228A.f6124cf.m2590b();
        m2590b.f4840i = AbstractC0197n.f1370i;
        m2590b.f4850r = true;
        m2590b.f4853u = 2;
        m1228A.networkEngine.m1757a(m2590b);
    }

    public void runAllUnitTests() {
        this.root.logWarn("Running unit tests..");
        new C0085n().m6233a();
    }

    public void runAllLeakTests() {
        this.root.logWarn("Running leak tests..");
        new C0073b().m6266a();
    }

    public boolean loadSaveFromSystemPath(String str) {
        GameEngine m1228A = GameEngine.m1228A();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            boolean m446a = m1228A.f6119ca.m446a(new C0876k(dataInputStream), false, false, false);
            dataInputStream.close();
            bufferedInputStream.close();
            fileInputStream.close();
            return m446a;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void checkTeamCaches() {
        Iterator it = AbstractC0197n.m5610c().iterator();
        while (it.hasNext()) {
            AbstractC0197n abstractC0197n = (AbstractC0197n) it.next();
            if (abstractC0197n.m5560t()) {
                throw new RuntimeException("Team cache difference on team:" + abstractC0197n.f1305k);
            }
        }
    }

    public void setPathSpeedConf(boolean z) {
        this.forceNonThreaded = z;
    }

    public float getPathSpeed(int i, float f, float f2, float f3, float f4) {
        GameEngine m1228A = GameEngine.m1228A();
        C0173b c0173b = m1228A.f6104bL;
        ArrayList arrayList = new ArrayList();
        c0173b.m5896a(f3, f4);
        int i2 = c0173b.f800T;
        int i3 = c0173b.f801U;
        long m2610a = C0727bl.m2610a();
        C0899d.f5912a = 0;
        C0899d.f5913b = 0;
        C0899d.f5914c = 0;
        C0899d.f5915d = 0;
        C0899d.f5916e = 0;
        C0899d.f5917f = 0;
        C0899d.f5918g = 0;
        C0899d.f5919h = 0.0d;
        C0899d.f5920i = 0.0d;
        C0908m.f6032c = 0;
        C0899d.f5932u = 0;
        for (int i4 = 0; i4 < i; i4++) {
            C0906k m1298a = m1228A.f6113bU.m1298a(false);
            c0173b.m5896a(f, f2);
            m1298a.m1324a(EnumC0246ao.LAND, (short) c0173b.f800T, (short) c0173b.f801U, null, false);
            c0173b.m5896a(f3, f4);
            m1298a.m1319a((short) c0173b.f800T, (short) c0173b.f801U, (short) 0);
            m1298a.f5979p = true;
            m1298a.f5980q = 0;
            m1298a.f5981r = false;
            m1228A.f6113bU.m1300a(m1298a, false, this.forceNonThreaded);
            arrayList.add(m1298a);
        }
        if (!this.forceNonThreaded) {
            return -1.0f;
        }
        float m2608a = C0727bl.m2608a(m2610a);
        int i5 = -1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LinkedList m1326a = ((C0906k) it.next()).m1326a();
            int i6 = 0;
            Iterator it2 = m1326a.iterator();
            while (it2.hasNext()) {
                C0911p c0911p = (C0911p) it2.next();
                i6++;
            }
            if (i5 != -1 && i5 != i6) {
                GameEngine.m1139b("pathDistance inconsistency detected:" + i5 + "!=" + i6);
            }
            C0911p c0911p2 = (C0911p) m1326a.getLast();
            if (c0911p2.f6068a != i2 || c0911p2.f6069b != i3) {
                GameEngine.m1139b("path did not react goal, got to:" + ((int) c0911p2.f6068a) + "," + ((int) c0911p2.f6069b) + " (vs " + i2 + ", " + i3 + ")");
            }
            i5 = i6;
        }
        GameEngine.m1139b("hotBufferWatermark:" + C0899d.f5912a + ", nodesAdded:" + C0899d.f5915d + ", mainQueueWatermark:" + C0899d.f5913b + ", backlogWatermark:" + C0899d.f5914c + ", scannedA:" + C0899d.f5916e + ", scannedB:" + C0899d.f5917f + ", scannedC:" + C0899d.f5918g + ", time:" + C0727bl.m2609a(C0899d.f5920i) + "/" + C0727bl.m2609a(C0899d.f5919h) + ", dirtyPeak:" + C0899d.f5932u + ", dis:" + i5);
        if (C0908m.f6032c != 0) {
            GameEngine.m1139b("newNodesCreated:" + C0908m.f6032c);
        }
        return m2608a;
    }

    public void muteSounds() {
        GameEngine m1228A = GameEngine.m1228A();
        m1228A.f6105bM.f4031b = true;
        m1228A.f6106bN.m2918f();
    }

    public void pong() {
    }
}
