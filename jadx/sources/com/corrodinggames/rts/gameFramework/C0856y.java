package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0160c;
import com.corrodinggames.rts.game.C0162e;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.C0169k;
import com.corrodinggames.rts.game.p011a.C0118a;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0465h;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.custom.C0307ac;
import com.corrodinggames.rts.game.units.custom.C0313ai;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.p030b.C0574f;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0694at;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.p040k.C0781f;
import com.corrodinggames.rts.gameFramework.utility.C0838o;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/y.class */
public class C0856y {

    /* renamed from: b */
    public static boolean f5847b = false;

    /* renamed from: a */
    String f5848a = "saves/";

    /* renamed from: c */
    final boolean f5849c = false;

    public C0856y() {
        if (!AbstractC0789l.f5548an) {
        }
    }

    /* renamed from: a */
    public File m382a(String str, boolean z) {
        return m383a(str, this.f5848a, z);
    }

    /* renamed from: a */
    public static String m384a(String str, String str2) {
        String str3;
        if (AbstractC0789l.f5556aF) {
            str3 = C0596a.m1946b() + str2 + str;
        } else {
            str3 = C0596a.m1946b() + str2 + str;
        }
        return str3;
    }

    /* renamed from: a */
    public static File m383a(String str, String str2, boolean z) {
        File file = new File(m384a(str, str2));
        if (z) {
            File parentFile = file.getParentFile();
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                AbstractC0789l.m695b("getRWFile: Could not create parent directory");
            }
        }
        return file;
    }

    /* renamed from: a */
    public void m386a(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        File file = null;
        try {
            File a = m382a(str + ".tmp", true);
            if (a.exists()) {
                a = m382a(str + ".tmp2", true);
            }
            File a2 = m382a(str, true);
            AbstractC0789l.m683d("Saving game to: " + a2.getAbsolutePath());
            FileOutputStream fileOutputStream = new FileOutputStream(a);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(fileOutputStream);
            if (!f5847b) {
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
                try {
                    m388a(new C0690ap(dataOutputStream));
                    dataOutputStream.close();
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                } catch (Throwable th) {
                    dataOutputStream.close();
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                    throw th;
                }
            } else {
                PrintStream printStream = new PrintStream(bufferedOutputStream);
                try {
                    m388a(new C0694at(printStream));
                    printStream.close();
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                    AbstractC0789l.m657m("DEBUG plain text save created");
                } catch (Throwable th2) {
                    printStream.close();
                    bufferedOutputStream.close();
                    fileOutputStream.close();
                    throw th2;
                }
            }
            AbstractC0789l.m683d("Finished writing save, renaming to final filename");
            a.renameTo(a2);
        } catch (Exception e) {
            e.printStackTrace();
            u.m731a("Error saving game to SD card, please check permissions, disk space, etc. (" + C0654f.m1519b(e) + ")", 1);
            if (0 != 0 && file.exists()) {
                AbstractC0789l.m683d("saveGame: Removing temp save file after crash");
                file.delete();
            }
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            u.m731a("Error. Run out of memory error while saving game to SD card.", 1);
            if (0 != 0 && file.exists()) {
                AbstractC0789l.m683d("saveGame: Removing temp save file after crash");
                file.delete();
            }
        }
        u.f5481bA.f4278e.m1697a(null, "Game saved");
    }

    /* renamed from: a */
    public void m388a(C0690ap apVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m694b("GameSaver", "saveCurrentMap took:" + (System.currentTimeMillis() - System.currentTimeMillis()));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            apVar.m1174c("rustedWarfareSave");
            apVar.mo1109a(u.m686c(true));
            apVar.mo1109a(90);
            apVar.mo1104a(u.f5575am);
            apVar.mo1106a("saveCompression", true);
            apVar.m1170e("customUnitsBlock");
            C0368l.m2952a(apVar);
            apVar.mo1107a("customUnitsBlock");
            apVar.m1170e("gameSetup");
            apVar.mo1104a(u.f5486bF.f4734z);
            if (u.f5486bF.f4734z) {
                u.f5486bF.m1351a(apVar);
            }
            apVar.mo1107a("gameSetup");
            apVar.m1174c(u.f5529cS);
            boolean z = u.f5530cT != null;
            apVar.mo1104a(z);
            if (z) {
                AbstractC0789l.m683d("Writing remote map steam into save");
                apVar.m1190a(u.f5530cT);
            }
            apVar.mo1109a(u.f5467bh);
            apVar.mo1110a(u.f5510cf + u.f5520cp);
            apVar.mo1110a(u.f5511cg + u.f5521cq);
            apVar.mo1110a(u.f5600cC);
            apVar.mo1109a(u.f5484bD.f3598a);
            apVar.mo1109a(0);
            apVar.m1171e();
            u.f5474bt.m4012a(apVar);
            apVar.mo1104a(u.f5465be);
            apVar.mo1104a(u.f5474bt.f776A);
            apVar.mo1104a(u.f5474bt.f777B);
            apVar.mo1104a(u.f5474bt.f778C);
            apVar.mo1104a(u.f5493bM != null);
            if (u.f5493bM != null) {
                u.f5493bM.mo1654a(apVar);
            }
            apVar.m1171e();
            int i = -1;
            if (u.f5464bb != null) {
                i = u.f5464bb.f1230i;
            }
            apVar.mo1109a(i);
            apVar.mo1109a(AbstractC0171m.f1275a);
            for (int i2 = 0; i2 < AbstractC0171m.f1275a; i2++) {
                AbstractC0171m n = AbstractC0171m.m3740n(i2);
                apVar.mo1104a(n instanceof C0118a);
                apVar.mo1104a(n instanceof C0160c);
                apVar.mo1104a(n != null);
                if (n != null) {
                    n.m3788b(apVar);
                }
            }
            if (!u.f5481bA.f4353b) {
                u.f5481bA.m1730h();
            }
            apVar.m1172d("Section: unit shells");
            apVar.mo1109a(AbstractC0854w.f5846dK.size());
            Iterator it = AbstractC0854w.f5846dK.iterator();
            while (it.hasNext()) {
                AbstractC0854w wVar = (AbstractC0854w) it.next();
                if (wVar == null) {
                    throw new RuntimeException("Found null in fastGameObjectList");
                }
                if (wVar instanceof AbstractC0210af) {
                    AbstractC0210af afVar = (AbstractC0210af) wVar;
                    if (afVar.mo1660r() instanceof EnumC0215ak) {
                        apVar.m1175c(1);
                        apVar.m1184a((Enum) ((EnumC0215ak) afVar.mo1660r()));
                    } else if (afVar.mo1660r() instanceof C0368l) {
                        apVar.m1175c(3);
                        apVar.m1174c(((C0368l) afVar.mo1660r()).f2498E);
                    } else {
                        throw new IOException("Unhandled getUnitType on save:" + afVar.mo1660r().getClass().toString());
                    }
                } else {
                    apVar.m1175c(2);
                    if (wVar instanceof C0169k) {
                        apVar.m1175c(1);
                    } else if (wVar instanceof C0163f) {
                        apVar.m1175c(2);
                    } else if (wVar instanceof C0574f) {
                        apVar.m1175c(3);
                    } else {
                        String str = null;
                        if (wVar.getClass() != null) {
                            str = wVar.getClass().toString();
                        }
                        throw new IOException("Unhandled class on save: " + str);
                    }
                }
                apVar.m1197a(wVar.f5835dA);
            }
            apVar.m1172d("Section: CurrentUnitId");
            apVar.m1197a(u.f5486bF.m1229u());
            u.f5484bD.mo1654a(apVar);
            u.f5481bA.mo1654a(apVar);
            u.f5487bG.m1978a(apVar);
            for (int i3 = 0; i3 < AbstractC0171m.f1275a; i3++) {
                AbstractC0171m n2 = AbstractC0171m.m3740n(i3);
                if (n2 != null) {
                    n2.mo1654a(apVar);
                }
            }
            apVar.m1171e();
            Iterator it2 = AbstractC0854w.f5846dK.iterator();
            while (it2.hasNext()) {
                AbstractC0854w wVar2 = (AbstractC0854w) it2.next();
                if (apVar.m1169f()) {
                    String simpleName = wVar2.getClass().getSimpleName();
                    if (wVar2 instanceof AbstractC0210af) {
                        simpleName = ((AbstractC0210af) wVar2).mo1660r().mo3494i();
                    }
                    apVar.m1172d("Saving unit:" + simpleName + " (id" + wVar2.f5835dA + ")");
                }
                wVar2.mo1654a(apVar);
                apVar.m1171e();
            }
            apVar.mo1107a("saveCompression");
            apVar.m1171e();
            apVar.m1174c("<SAVE END>");
        } catch (Exception e) {
            e.printStackTrace();
            u.m731a("Error saving game to SD card, please email the logs.", 1);
        }
        AbstractC0789l.m694b("GameSaver", "saveGame took:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: b */
    public String m381b(String str) {
        if (str == null) {
            return null;
        }
        return str.equals("maps/normal/l010;mission_1__-__Dividing_River.tmx") ? "maps/normal/l010;[demo]mission_1__-__Dividing_River.tmx" : str.equals("maps/normal/l030;mission_3__-__Crossfire.tmx") ? "maps/normal/l030;[demo]mission_3__-__Crossfire.tmx" : str;
    }

    /* renamed from: b */
    public boolean m380b(String str, boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        try {
            File a = m382a(str, false);
            if (a.isDirectory()) {
                u.m731a("Could not load, is a directory", 1);
                return false;
            }
            FileInputStream fileInputStream = new FileInputStream(a);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(fileInputStream);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            boolean a2 = m387a(new C0707k(dataInputStream), z, false, false);
            dataInputStream.close();
            bufferedInputStream.close();
            fileInputStream.close();
            return a2;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m385a(String str, C0690ap apVar) {
        try {
            apVar.m1186a(m382a(str, false));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public synchronized boolean m387a(C0707k kVar, boolean z, boolean z2, boolean z3) {
        AbstractC0854w wVar;
        C0465h hVar;
        AbstractC0171m n;
        AbstractC0789l u = AbstractC0789l.m651u();
        try {
            C0586bj bjVar = u.f5492bL;
            if (this.f5849c) {
                bjVar.m1970a(EnumC0588bk.f4071y);
            }
            ArrayList arrayList = null;
            if (z3) {
                arrayList = new ArrayList();
                Iterator it = u.f5481bA.f4413bF.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((AbstractC0210af) it.next()).f5835dA));
                }
            }
            String k = kVar.m1071k();
            if (!k.equals("rustedWarfareSave")) {
                AbstractC0789l.m695b("Map Load: Header is not correct:" + k.substring(0, Math.min(k.length(), 50)));
                String str = "Failed to load save. (Could not find correct header)";
                if (k.equals("rustedWarfareReplay")) {
                    str = "Failed to load save. (This file appears to be a replay file, not a save file)";
                }
                AbstractC0789l.m695b(str);
                u.m731a(str, 1);
                return false;
            }
            kVar.m1076f();
            int f = kVar.m1076f();
            AbstractC0789l.m694b("gameSaver", "Loading save from version: " + f);
            kVar.m1093a(f);
            if (f > 90) {
                u.m731a("Cannot load: This save was made with a newer game", 1);
                return false;
            }
            if (f >= 5) {
                kVar.m1077e();
            }
            if (f >= 23) {
                bjVar.m1970a(EnumC0588bk.f4074B);
                kVar.m1088a("saveCompression", true);
                bjVar.m1965b(EnumC0588bk.f4074B);
            }
            if (f >= 54) {
                kVar.m1082b("customUnitsBlock");
                if (u.f5490bJ.m1995h() && !z3) {
                    AbstractC0789l.m683d("Loading mods from replay");
                    try {
                        C0368l.m2951a(kVar);
                        C0307ac.m3333c();
                    } catch (C0313ai e) {
                        AbstractC0789l.m683d("Replay load: Missing unit:" + e.getMessage() + " d:" + e.f2199a);
                        u.m670h(e.getMessage() + ", this is likely to cause the replay to desync (reverting to default units & mods)");
                        C0307ac.m3334b(true);
                    }
                }
                kVar.m1078d("customUnitsBlock");
            }
            Integer num = null;
            Integer num2 = null;
            if (u.f5490bJ.m1995h() && z3) {
                num = Integer.valueOf(u.f5470bk);
                num2 = Integer.valueOf(u.f5471bl);
            }
            if (f >= 56) {
                kVar.m1082b("gameSetup");
                boolean e2 = kVar.m1077e();
                if (u.f5490bJ.m1995h() && !z3 && e2) {
                    u.f5490bJ.f3979M = true;
                    u.f5486bF.m1338a(kVar);
                    num = Integer.valueOf(u.f5470bk);
                    num2 = Integer.valueOf(u.f5471bl);
                }
                kVar.m1078d("gameSetup");
            }
            u.f5530cT = null;
            u.f5529cS = m381b(kVar.m1071k());
            boolean z4 = false;
            if (f >= 72) {
                z4 = kVar.m1077e();
                if (z4) {
                    AbstractC0789l.m683d("Reading remote map stream");
                    u.f5530cT = kVar.m1063s();
                }
            }
            if (u.f5486bF.f4734z && !u.f5486bF.f4664A && z3 && u.f5486bF.f4697aK != null && !z4) {
                u.f5529cS = "";
                u.f5530cT = u.f5486bF.f4697aK;
            }
            bjVar.m1970a(EnumC0588bk.f4072z);
            if (z3) {
                u.m722a(true, true, EnumC0803s.f5653c);
                if (AbstractC0789l.m712aj()) {
                    u.f5618dc = true;
                }
            } else {
                u.m723a(true, EnumC0803s.f5653c);
            }
            if (!u.f5474bt.f743P) {
                AbstractC0789l.m683d("Not loading save because map failed to load");
                return false;
            }
            if (num != null) {
                u.f5470bk = num.intValue();
            }
            if (num2 != null) {
                Integer.valueOf(u.f5471bl);
            }
            synchronized (u) {
                bjVar.m1965b(EnumC0588bk.f4072z);
                u.f5467bh = kVar.m1076f();
                float g = kVar.m1075g();
                float g2 = kVar.m1075g();
                float g3 = kVar.m1075g();
                if (!z3) {
                    u.m701b(g, g2);
                    u.f5600cC = g3;
                }
                if (f >= 18) {
                    u.f5484bD.f3598a = kVar.m1076f();
                }
                kVar.m1076f();
                if (f >= 19) {
                    kVar.m1089a("end of setup");
                }
                u.f5474bt.m4011a(kVar);
                if (f >= 86) {
                    boolean e3 = kVar.m1077e();
                    boolean e4 = kVar.m1077e();
                    boolean e5 = kVar.m1077e();
                    boolean e6 = kVar.m1077e();
                    if (!z && !e3) {
                        u.f5474bt.f776A = e4;
                        u.f5474bt.f777B = e5;
                        u.f5474bt.f778C = e6;
                    }
                }
                if (kVar.m1077e()) {
                    if (u.f5493bM == null) {
                        AbstractC0789l.m694b("gameSaver", "making new mission engine on load, this shouldn't happen");
                        u.f5493bM = new C0781f();
                        u.f5493bM.m800a(false);
                    }
                    u.f5493bM.m807a(kVar);
                }
                if (f >= 19) {
                    kVar.m1089a("start of teams");
                }
                AbstractC0789l.m694b("gameSaver", "loading teams");
                AbstractC0171m[] mVarArr = new AbstractC0171m[AbstractC0171m.f1277c];
                int i = -1;
                if (f >= 36) {
                    i = kVar.m1076f();
                }
                int i2 = 8;
                if (f >= 49) {
                    i2 = kVar.m1076f();
                    AbstractC0171m.m3794b(i2, false);
                    for (int i3 = 0; i3 < AbstractC0171m.f1275a; i3++) {
                        if (i3 >= i2 && !z && (n = AbstractC0171m.m3740n(i3)) != null) {
                            n.m3830E();
                        }
                    }
                }
                for (int i4 = 0; i4 < i2; i4++) {
                    C0118a n2 = AbstractC0171m.m3740n(i4);
                    boolean e7 = kVar.m1077e();
                    boolean z5 = false;
                    if (f >= 7) {
                        z5 = kVar.m1077e();
                    }
                    if (kVar.m1077e()) {
                        if (e7) {
                            if (n2 == null || !(n2 instanceof C0118a)) {
                                if (!z || z3 || n2 == null) {
                                    if (z3) {
                                        AbstractC0789l.m695b("Adding new AI " + i4 + " on resync");
                                    }
                                    n2 = new C0118a(i4);
                                } else {
                                    AbstractC0789l.m695b("Would replace team:" + i4 + " with AI, writing to dummy AI");
                                    n2 = new C0118a(i4, false);
                                    mVarArr[i4] = n2;
                                }
                            }
                        } else if (z5) {
                            if (n2 == null || !(n2 instanceof C0160c)) {
                                if (z) {
                                    AbstractC0789l.m695b("Replacing team:" + i4 + " with NetworkedPlayer");
                                }
                                n2 = new C0160c(i4);
                            }
                        } else if (n2 == null || !(n2 instanceof C0162e)) {
                            if (z) {
                                AbstractC0789l.m695b("Replacing team:" + i4 + " with Player");
                                if (n2 != null) {
                                    n2.m3773c("Existing");
                                }
                            }
                            n2 = new C0162e(i4);
                        }
                        if (f >= 2) {
                            n2.m3787b(kVar);
                        } else {
                            n2.m3774c(kVar);
                        }
                        if (!z3) {
                            n2.m3755g();
                        }
                    } else if (!z || u.f5490bJ.m1995h()) {
                        AbstractC0171m n3 = AbstractC0171m.m3740n(i4);
                        if (n3 != null) {
                            n3.m3830E();
                        }
                    } else {
                        AbstractC0789l.m695b("GameSaver: Would normally remove team:" + i4 + "");
                        mVarArr[i4] = AbstractC0171m.f1279e;
                    }
                }
                boolean z6 = false;
                u.f5486bF.m1318ah();
                if (u.f5490bJ.m1995h()) {
                    u.f5464bb = AbstractC0171m.f1281g;
                } else if (u.f5486bF.f4734z) {
                    if (u.f5486bF.f4662x != null) {
                        int i5 = u.f5486bF.f4662x.f1230i;
                        if (i5 != -3) {
                            AbstractC0171m n4 = AbstractC0171m.m3740n(i5);
                            if (n4 == null) {
                                throw new RuntimeException("GameSaver: Cannot relink player team: " + i5);
                            }
                            u.f5464bb = n4;
                        }
                    }
                } else if (i == -1 || i == -3) {
                    for (int i6 = 0; i6 < AbstractC0171m.f1275a; i6++) {
                        if (AbstractC0171m.m3740n(i6) instanceof C0162e) {
                            u.f5464bb = AbstractC0171m.m3740n(i6);
                        }
                    }
                } else {
                    u.f5464bb = AbstractC0171m.m3740n(i);
                }
                Iterator it2 = AbstractC0854w.m394dp().iterator();
                while (it2.hasNext()) {
                    ((AbstractC0854w) it2.next()).mo2099a();
                }
                boolean z7 = false;
                int f2 = kVar.m1076f();
                for (int i7 = 0; i7 < f2; i7++) {
                    byte d = kVar.m1079d();
                    if (d == 1) {
                        EnumC0215ak akVar = (EnumC0215ak) kVar.m1083b(EnumC0215ak.class);
                        if (akVar != EnumC0215ak.f1634Y) {
                            hVar = akVar.mo3504a();
                        } else if (u.f5490bJ.m1995h() || u.f5465be) {
                            AbstractC0789l.m683d("Creating DebugEditorBuilder for replay");
                            hVar = new C0465h(false);
                            C0465h i8 = u.f5481bA.m1728i();
                            if (i8 == null || i8.f5836dC) {
                                AbstractC0789l.m683d("Relinking editor");
                                u.f5481bA.m1779a(hVar);
                            }
                        } else {
                            AbstractC0789l.m683d("Creating DebugEditorBuilder for load");
                            hVar = new C0465h(false);
                            z6 = true;
                        }
                    } else if (d == 3) {
                        String k2 = kVar.m1071k();
                        C0368l l = C0368l.m2912l(k2);
                        if (l == null) {
                            String str2 = "Could not find custom unit:" + k2;
                            AbstractC0789l.m683d(str2);
                            if (!z7) {
                                z7 = true;
                                Hcat_Multiplaye.m1261f(str2);
                            }
                            l = C0368l.f2483b;
                            if (l == null) {
                                throw new RuntimeException("Could not find custom unit:" + k2 + " and missingPlaceHolder is null");
                            }
                        }
                        AbstractC0268al c = C0368l.m2933c(l);
                        if (c != null) {
                            if (c instanceof C0368l) {
                                l = (C0368l) c;
                            } else {
                                AbstractC0789l.m695b("replacement not a custom unit:" + c.mo3494i());
                            }
                        }
                        hVar = l.mo3504a();
                    } else if (d == 2) {
                        byte d2 = kVar.m1079d();
                        if (d2 == 1) {
                            hVar = new C0169k();
                        } else if (d2 == 2) {
                            hVar = new C0163f(false);
                        } else if (d2 == 3) {
                            hVar = new C0574f(u.f5480bz);
                        } else {
                            throw new IOException("Unhandled gameType on load:" + ((int) d2));
                        }
                    } else {
                        throw new IOException("Unhandled basic type on load:" + ((int) d));
                    }
                    hVar.f5835dA = kVar.m1073i();
                    AbstractC0854w.m393dq();
                }
                if (f >= 3) {
                    u.f5486bF.m1362a(kVar.m1073i());
                } else {
                    u.f5486bF.m1362a(100000L);
                }
                if (f >= 24) {
                    u.f5484bD.m2166a(kVar);
                }
                if (f >= 4) {
                    u.f5481bA.m1770a(kVar, z3);
                }
                if (f >= 57) {
                    u.f5487bG.m1977a(kVar, z3);
                }
                if (f >= 7) {
                    for (int i9 = 0; i9 < i2; i9++) {
                        AbstractC0171m n5 = AbstractC0171m.m3740n(i9);
                        if (mVarArr[i9] != null) {
                            n5 = mVarArr[i9];
                            if (n5 == AbstractC0171m.f1279e) {
                                n5 = null;
                            }
                        }
                        if (n5 != null) {
                            n5.m3774c(kVar);
                        }
                    }
                } else if (f >= 2) {
                }
                if (f >= 10) {
                    kVar.m1089a("Pre-unit data");
                }
                bjVar.m1970a(EnumC0588bk.f4073A);
                C0838o dp = AbstractC0854w.m394dp();
                AbstractC0789l.m694b("gameSaver", "Loading unit data for " + dp.size() + " objects.");
                Iterator it3 = dp.iterator();
                while (it3.hasNext()) {
                    ((AbstractC0854w) it3.next()).mo2031a(kVar);
                    if (f >= 10) {
                        kVar.m1089a("post unit: " + wVar.getClass().toString() + " with id:" + wVar.f5835dA);
                    }
                }
                AbstractC0789l.m694b("gameSaver", "Loading unit data done.");
                bjVar.m1965b(EnumC0588bk.f4073A);
                if (z6) {
                    Iterator it4 = AbstractC0854w.m394dp().iterator();
                    while (it4.hasNext()) {
                        AbstractC0854w wVar2 = (AbstractC0854w) it4.next();
                        if (wVar2 instanceof AbstractC0210af) {
                            AbstractC0210af afVar = (AbstractC0210af) wVar2;
                            if (!u.f5490bJ.m1995h() && !u.f5465be && afVar.mo1660r() == EnumC0215ak.f1634Y) {
                                afVar.m3608bU();
                            }
                        }
                    }
                }
                if (f >= 23) {
                    kVar.m1078d("saveCompression");
                }
                if (f >= 19) {
                    kVar.m1089a("End of Save");
                    kVar.m1071k();
                }
                AbstractC0789l.m694b("gameSaver", "Checking for ID overlaps");
                int i10 = 0;
                if (1 != 0) {
                    AbstractC0854w[] a = AbstractC0854w.f5846dK.m472a();
                    int size = AbstractC0854w.f5846dK.size();
                    for (int i11 = 0; i11 < size; i11++) {
                        AbstractC0854w wVar3 = a[i11];
                        for (int i12 = i11 + 1; i12 < size; i12++) {
                            AbstractC0854w wVar4 = a[i12];
                            if (wVar3 != wVar4 && wVar3.f5835dA == wVar4.f5835dA) {
                                i10++;
                                wVar4.f5835dA = u.f5486bF.m1230t();
                            }
                        }
                    }
                }
                AbstractC0789l.m694b("gameSaver", "clearing out dead units.");
                AbstractC0789l.m683d("Unit.fastLiveUnitList before:" + AbstractC0210af.f1473bj.size());
                Iterator it5 = AbstractC0210af.f1473bj.iterator();
                while (it5.hasNext()) {
                    if (((AbstractC0210af) it5.next()).f1520bz) {
                        it5.remove();
                    }
                }
                AbstractC0789l.m683d("Unit.fastLiveUnitList after:" + AbstractC0210af.f1473bj.size());
                if (i10 > 0) {
                    if (f <= 2) {
                        u.m731a("Warning: " + i10 + " errors were found in this save, this is due to a bug in the old version", 1);
                    } else {
                        u.m731a("Warning: " + i10 + " errors were found in this save", 1);
                    }
                }
                AbstractC0789l.m694b("gameSaver", "Fixing map cost.");
                u.f5483bC.m971a((AbstractC0515r) null);
                u.f5483bC.m962b();
                AbstractC0789l.m694b("gameSaver", "Fixing map cost done.");
                AbstractC0171m.m3825J();
                for (int i13 = 0; i13 < AbstractC0171m.f1275a; i13++) {
                    AbstractC0171m n6 = AbstractC0171m.m3740n(i13);
                    if (n6 != null) {
                        n6.m3763d(false);
                    }
                }
                AbstractC0789l.m694b("gameSaver", "Rebuilt unit caches");
                AbstractC0171m.m3825J();
                for (int i14 = 0; i14 < AbstractC0171m.f1275a; i14++) {
                    AbstractC0171m n7 = AbstractC0171m.m3740n(i14);
                    if (n7 != null && (n7 instanceof C0118a)) {
                        ((C0118a) n7).m4174af();
                    }
                }
                if (arrayList != null) {
                    u.f5481bA.m1704w();
                    Iterator it6 = arrayList.iterator();
                    while (it6.hasNext()) {
                        AbstractC0210af a2 = AbstractC0854w.m401a(((Long) it6.next()).longValue(), true);
                        if (a2 != null) {
                            u.f5481bA.m1723k(a2);
                        }
                    }
                }
                AbstractC0789l.m683d("--- Save file load complete ---");
                AbstractC0789l.m683d("GameObject.fastGameObjectList:" + AbstractC0854w.f5846dK.size());
                AbstractC0789l.m683d("Unit.fastLiveUnitList:" + AbstractC0210af.f1473bj.size());
                if (!z3) {
                    u.f5490bJ.m2007a(z3);
                }
                if (this.f5849c) {
                    bjVar.m1965b(EnumC0588bk.f4071y);
                    bjVar.m1968a(true, true);
                }
            }
            return true;
        } catch (Exception e8) {
            throw new RuntimeException(e8);
        }
    }

    /* renamed from: c */
    public void m379c(String str) {
        if (str.contains("\\") || str.contains("/")) {
            AbstractC0789l.m683d("Cannot get save with path: " + str);
            return;
        }
        m382a(str, true).delete();
        m382a(str + ".map", true).delete();
    }
}
