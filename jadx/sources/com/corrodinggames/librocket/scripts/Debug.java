package com.corrodinggames.librocket.scripts;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.p012b.C0154f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0209ae;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p023d.AbstractC0416k;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.C0651e;
import com.corrodinggames.rts.gameFramework.C0856y;
import com.corrodinggames.rts.gameFramework.p036g.C0678ah;
import com.corrodinggames.rts.gameFramework.p036g.C0698c;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.EnumC0679ai;
import com.corrodinggames.rts.gameFramework.p036g.RunnableC0686am;
import com.corrodinggames.rts.gameFramework.p037h.C0729c;
import com.corrodinggames.rts.gameFramework.p037h.C0733g;
import com.corrodinggames.rts.gameFramework.p037h.C0735i;
import com.corrodinggames.rts.gameFramework.p037h.C0738l;
import com.corrodinggames.rts.p009b.p010a.C0107b;
import com.corrodinggames.rts.p009b.p010a.C0114i;
import java.io.BufferedInputStream;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Debug.class */
public class Debug extends ScriptContext {
    Root root;
    ConcurrentLinkedQueue backgroundClientConnections;
    Thread backgroundConnectionThread;
    Runnable backgroundConnectionRunnable = new RunnableC00521();
    boolean forceNonThreaded = true;

    Debug(Root root) {
        this.root = root;
    }

    public void setLocalPlayerName(String str) {
        AbstractC0789l.m651u().f5486bF.m1337a(str);
    }

    public void setDdosProtection(boolean z) {
        RunnableC0686am.f4845b = z;
    }

    public void lookAt(float f, float f2) {
        AbstractC0789l.m651u().m701b(f, f2);
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
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0268al a = EnumC0215ak.m3521a(str);
        if (a == null) {
            this.root.logWarn("Could not find type:" + str);
            return null;
        }
        AbstractC0210af a2 = a.mo3504a();
        a2.f5841dH = f;
        a2.f5842dI = f2;
        try {
            a2.m3640P(i);
            AbstractC0171m.m3777c(a2);
            a2.f1538cm = true;
            if (z) {
                u.m701b(f, f2);
            }
            return Long.valueOf(a2.f5835dA);
        } catch (C0154f e) {
            throw new RuntimeException(e);
        }
    }

    public int getMaxCustomUnitTypeId() {
        return C0368l.f2765d.size();
    }

    public Long createCustomUnitFromTypeId(int i, float f, float f2, int i2, boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0210af a = ((C0368l) C0368l.f2765d.get(i)).mo3504a();
        a.f5841dH = f;
        a.f5842dI = f2;
        try {
            a.m3640P(i2);
            AbstractC0171m.m3777c(a);
            a.f1538cm = true;
            if (z) {
                u.m701b(f, f2);
            }
            return Long.valueOf(a.f5835dA);
        } catch (C0154f e) {
            throw new RuntimeException(e);
        }
    }

    public void selectNextUnit() {
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0210af afVar = null;
        boolean z = false;
        Iterator it = AbstractC0210af.m3601bt().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0210af afVar2 = (AbstractC0210af) it.next();
            if ((afVar2 instanceof AbstractC0210af) && !(afVar2 instanceof C0209ae) && !afVar2.mo1659t()) {
                if (afVar == null) {
                    afVar = afVar2;
                }
                if (z) {
                    afVar = afVar2;
                    break;
                }
                z = afVar2.f1460ci;
            }
        }
        u.f5481bA.m1704w();
        if (afVar != null) {
            u.f5481bA.m1725j(afVar);
        }
    }

    public void removeAllUnits() {
        Iterator it = AbstractC0854w.m394dp().iterator();
        while (it.hasNext()) {
            ((AbstractC0854w) it.next()).mo2099a();
        }
    }

    public void killAllUnits() {
        Iterator it = AbstractC0210af.m3601bt().iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0210af) {
                afVar.f1450bY = -1.0f;
            }
        }
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Debug$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Debug$1.class */
    class RunnableC00521 implements Runnable {
        RunnableC00521() {
        }

        public void run() {
            Iterator it = Debug.this.backgroundClientConnections.iterator();
            while (it.hasNext()) {
                C0698c cVar = (C0698c) it.next();
            }
        }
    }

    public boolean backgroundCurrentClientConnection() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!u.f5486bF.f4734z) {
            AbstractC0789l.m683d("Not networked");
            return false;
        } else if (u.f5486bF.f4664A) {
            throw new RuntimeException("server=true");
        } else {
            if (this.backgroundConnectionThread == null) {
                this.backgroundConnectionThread = new Thread(this.backgroundConnectionRunnable);
                this.backgroundConnectionThread.start();
            }
            if (this.backgroundClientConnections == null) {
                this.backgroundClientConnections = new ConcurrentLinkedQueue();
            }
            Iterator it = u.f5486bF.f4766aV.iterator();
            while (it.hasNext()) {
                C0698c cVar = (C0698c) it.next();
                cVar.f4929r = true;
                this.backgroundClientConnections.add(cVar);
                u.f5486bF.f4766aV.remove(cVar);
            }
            u.f5486bF.m1295b("backgrounded");
            u.f5486bF.f4734z = true;
            return true;
        }
    }

    public boolean setTeamCredits(int i, int i2) {
        AbstractC0171m n = AbstractC0171m.m3740n(i);
        if (n == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        n.money = i2;
        return true;
    }

    public boolean setTeamAllyGroup(int i, int i2) {
        AbstractC0171m n = AbstractC0171m.m3740n(i);
        if (n == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        n.f1236o = i2;
        return true;
    }

    public void giveUpgradeToAllUnits() {
        Iterator it = AbstractC0210af.m3601bt().iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                AbstractC0197s a = rVar.mo3632a(rVar.mo2691bX());
                if (a != null) {
                    rVar.mo2479a(a, false);
                }
            }
        }
    }

    public void giveAllActionsToAllUnits() {
        Iterator it = AbstractC0210af.m3601bt().iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                Iterator it2 = rVar.mo2480M().iterator();
                while (it2.hasNext()) {
                    rVar.mo2479a((AbstractC0197s) it2.next(), false);
                }
            }
        }
    }

    public void completeAllUnitsQueues() {
        Iterator it = AbstractC0210af.m3601bt().iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0416k) {
                ((AbstractC0416k) afVar).mo2736df();
            }
        }
    }

    public boolean moveAllUnitsOnTeam(int i, float f, float f2) {
        AbstractC0171m n = AbstractC0171m.m3740n(i);
        if (n == null) {
            this.root.logWarn("Could not find team:" + i);
            return false;
        }
        C0651e b = AbstractC0789l.m651u().f5494bN.m1954b(n);
        Iterator it = AbstractC0210af.m3601bt().iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if (afVar instanceof AbstractC0515r) {
                AbstractC0515r rVar = (AbstractC0515r) afVar;
                if (rVar.f1441bB == n) {
                    b.m1616a(rVar);
                }
            }
        }
        b.m1626a(f, f2);
        return true;
    }

    public void showMessage(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (str != null && !str.trim().equals("")) {
            u.f5486bF.m1243k(str.replace("\\n", "\n"));
        }
    }

    public String unicodeTest1() {
        return "start ¥123 \u061c end";
    }

    public void setZoom(float f) {
        AbstractC0789l.m651u().f5600cC = f;
    }

    public boolean isNetworkGameActive() {
        return AbstractC0789l.m651u().m767G();
    }

    public int getLocalPlayerId() {
        return AbstractC0789l.m651u().f5486bF.f4662x.f1230i;
    }

    public int numberOfHumanPlayers() {
        return AbstractC0789l.m651u().f5486bF.m1321ae();
    }

    public int numberOfPlayersPlusAI() {
        return AbstractC0789l.m651u().f5486bF.m1320af();
    }

    public boolean enableFastSync() {
        AbstractC0789l.m651u().f5486bF.f4742ac = 30;
        return true;
    }

    public boolean enablePauseOnDesync() {
        AbstractC0789l.m651u().f5486bF.f4686ad = true;
        return true;
    }

    public boolean networkPause() {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5486bF.f4686ad = true;
        u.f5486bF.f4687ae = true;
        return true;
    }

    public boolean plainTextDebugSave(boolean z) {
        AbstractC0789l.m651u();
        C0856y.f5847b = z;
        return true;
    }

    public boolean checkDesync(int i) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5486bF.f4691az != 0) {
            throw new RuntimeException("numberOfDesyncErrors==" + u.f5486bF.f4691az);
        } else if (u.f5486bF.f4692aA < i) {
            throw new RuntimeException("game.network.numberOfDesyncPasses:" + u.f5486bF.f4692aA + "<" + i);
        } else {
            this.root.logDebug("numberOfDesyncPasses:" + u.f5486bF.f4692aA);
            return true;
        }
    }

    public int getNumberOfDesyncErrors() {
        return AbstractC0789l.m651u().f5486bF.f4691az;
    }

    public int getNumberOfDesyncPasses() {
        return AbstractC0789l.m651u().f5486bF.f4692aA;
    }

    public boolean setMultiplayerMap(int i, String str) {
        C0678ah ahVar = AbstractC0789l.m651u().f5486bF.f4763aH;
        ahVar.f4810a = EnumC0679ai.values()[i];
        ahVar.f4811b = str;
        return true;
    }

    public boolean setMultiplayerSave(String str) {
        C0678ah ahVar = AbstractC0789l.m651u().f5486bF.f4763aH;
        ahVar.f4810a = EnumC0679ai.f4826c;
        ahVar.f4811b = str;
        return true;
    }

    public void generateNewClientId() {
        AbstractC0789l.m651u().f5486bF.m1377Q();
    }

    public void disableFog() {
        AbstractC0789l.m651u();
    }

    public void overrideDeltaSpeed(float f) {
        AbstractC0789l.m651u().f5584bd = f;
    }

    public void setGameSetting(String str, String str2) {
        AbstractC0789l.m651u().f5479by.setValueDynamic(str, str2);
    }

    public void setNetworkaiDifficulty(int i) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0678ah c = u.f5486bF.m1291c();
        c.f4815f = i;
        u.f5486bF.m1353a(c);
    }

    public void setNetworkStartingUnits(int i) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0678ah c = u.f5486bF.m1291c();
        c.f4816g = i;
        u.f5486bF.m1353a(c);
    }

    public void startRandomUnitDesyncTest() {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e b = u.f5494bN.m1955b();
        b.f4555i = AbstractC0171m.f1281g;
        b.f4563r = true;
        b.f4566u = 1;
        u.f5486bF.m1355a(b);
    }

    public void startRandomUnitStressTest() {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0651e b = u.f5494bN.m1955b();
        b.f4555i = AbstractC0171m.f1281g;
        b.f4563r = true;
        b.f4566u = 2;
        u.f5486bF.m1355a(b);
    }

    public void runAllUnitTests() {
        this.root.logWarn("Running unit tests..");
        new C0114i().m4221a();
    }

    public void runAllLeakTests() {
        this.root.logWarn("Running leak tests..");
        new C0107b().m4229a();
    }

    public boolean loadSaveFromSystemPath(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        try {
            FileInputStream fileInputStream = new FileInputStream(new File(str));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            boolean a = u.f5489bI.m387a(new C0707k(dataInputStream), false, false, false);
            dataInputStream.close();
            bufferedInputStream.close();
            fileInputStream.close();
            return a;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void checkTeamCaches() {
        Iterator it = AbstractC0171m.m3782c().iterator();
        while (it.hasNext()) {
            AbstractC0171m mVar = (AbstractC0171m) it.next();
            if (mVar.m3737q()) {
                throw new RuntimeException("Team cache difference on team:" + mVar.f1230i);
            }
        }
    }

    public void setPathSpeedConf(boolean z) {
        this.forceNonThreaded = z;
    }

    public float getPathSpeed(int i, float f, float f2, float f3, float f4) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0148b bVar = u.f5474bt;
        ArrayList arrayList = new ArrayList();
        bVar.m4029a(f3, f4);
        int i2 = bVar.f741M;
        int i3 = bVar.f742N;
        long a = C0586bj.m1974a();
        C0729c.f5061a = 0;
        C0729c.f5062b = 0;
        C0729c.f5063c = 0;
        C0729c.f5064d = 0;
        C0729c.f5065e = 0;
        C0729c.f5066f = 0;
        C0729c.f5067g = 0;
        C0729c.f5068h = 0.0d;
        C0729c.f5069i = 0.0d;
        C0735i.f5163c = 0;
        C0729c.f5081u = 0;
        for (int i4 = 0; i4 < i; i4++) {
            C0733g a2 = u.f5483bC.m963a(false);
            bVar.m4029a(f, f2);
            a2.m987a(EnumC0212ah.f1553b, (short) bVar.f741M, (short) bVar.f742N, null, false);
            bVar.m4029a(f3, f4);
            a2.m983a((short) bVar.f741M, (short) bVar.f742N, (short) 0);
            a2.f5113l = true;
            a2.f5114m = 0;
            a2.f5115n = false;
            u.f5483bC.m965a(a2, false, this.forceNonThreaded);
            arrayList.add(a2);
        }
        if (!this.forceNonThreaded) {
            return -1.0f;
        }
        float a3 = C0586bj.m1972a(a);
        int i5 = -1;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            LinkedList c = ((C0733g) it.next()).m981c();
            int i6 = 0;
            Iterator it2 = c.iterator();
            while (it2.hasNext()) {
                C0738l lVar = (C0738l) it2.next();
                i6++;
            }
            if (!(i5 == -1 || i5 == i6)) {
                AbstractC0789l.m695b("pathDistance inconsistency detected:" + i5 + "!=" + i6);
            }
            C0738l lVar2 = (C0738l) c.getLast();
            if (lVar2.f5198a != i2 || lVar2.f5199b != i3) {
                AbstractC0789l.m695b("path did not react goal, got to:" + ((int) lVar2.f5198a) + "," + ((int) lVar2.f5199b) + " (vs " + i2 + ", " + i3 + ")");
            }
            i5 = i6;
        }
        AbstractC0789l.m695b("hotBufferWatermark:" + C0729c.f5061a + ", nodesAdded:" + C0729c.f5064d + ", mainQueueWatermark:" + C0729c.f5062b + ", backlogWatermark:" + C0729c.f5063c + ", scannedA:" + C0729c.f5065e + ", scannedB:" + C0729c.f5066f + ", scannedC:" + C0729c.f5067g + ", time:" + C0586bj.m1973a(C0729c.f5069i) + "/" + C0586bj.m1973a(C0729c.f5068h) + ", dirtyPeak:" + C0729c.f5081u + ", dis:" + i5);
        if (C0735i.f5163c != 0) {
            AbstractC0789l.m695b("newNodesCreated:" + C0735i.f5163c);
        }
        return a3;
    }

    public void muteSounds() {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5475bu.f3564b = true;
        u.f5476bv.m2111f();
    }

    public void pong() {
    }
}
