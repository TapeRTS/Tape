package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0851ak;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.ba */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ba.class */
public class C0716ba {

    /* renamed from: b */
    public static boolean f4468b = true;

    /* renamed from: c */
    public static boolean f4469c = true;

    /* renamed from: d */
    public static boolean f4470d = true;

    /* renamed from: e */
    public static boolean f4471e = true;

    /* renamed from: f */
    public boolean f4472f;

    /* renamed from: g */
    int f4473g;

    /* renamed from: h */
    int f4474h;

    /* renamed from: i */
    boolean f4475i;

    /* renamed from: j */
    int f4476j;

    /* renamed from: k */
    boolean f4477k;

    /* renamed from: m */
    public int f4478m;

    /* renamed from: n */
    public int f4479n;

    /* renamed from: o */
    public int f4480o;

    /* renamed from: p */
    public String f4481p;

    /* renamed from: q */
    boolean f4482q;

    /* renamed from: N */
    private volatile boolean f4483N;

    /* renamed from: r */
    String f4484r;

    /* renamed from: s */
    boolean f4485s;

    /* renamed from: u */
    C0719bd f4486u;

    /* renamed from: v */
    C0719bd f4487v;

    /* renamed from: w */
    int f4488w;

    /* renamed from: x */
    int f4489x;

    /* renamed from: y */
    int f4490y;

    /* renamed from: z */
    int f4491z;

    /* renamed from: A */
    InputStream f4492A;

    /* renamed from: B */
    BufferedInputStream f4493B;

    /* renamed from: C */
    DataInputStream f4494C;

    /* renamed from: D */
    C0876k f4495D;

    /* renamed from: E */
    OutputStream f4496E;

    /* renamed from: F */
    BufferedOutputStream f4497F;

    /* renamed from: G */
    DataOutputStream f4498G;

    /* renamed from: H */
    C0859ar f4499H;

    /* renamed from: I */
    RunnableC0717bb f4500I;

    /* renamed from: J */
    Thread f4501J;

    /* renamed from: M */
    public boolean f4502M;

    /* renamed from: a */
    String f4503a = "replays/";

    /* renamed from: l */
    public boolean f4504l = false;

    /* renamed from: t */
    public int f4505t = 1;

    /* renamed from: K */
    Object f4506K = new Object();

    /* renamed from: L */
    public boolean f4507L = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m2654a(C0716ba c0716ba) {
        return c0716ba.f4483N;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static /* synthetic */ boolean m2653a(C0716ba c0716ba, boolean z) {
        c0716ba.f4483N = z;
        return z;
    }

    /* renamed from: a */
    public static void m2651a(String str) {
        GameEngine.PrintLog("Replay: " + str);
    }

    /* renamed from: b */
    public static void m2644b(String str) {
        GameEngine.m1145b("Replay: " + str);
    }

    /* renamed from: a */
    public static void m2649a(String str, Exception exc) {
        GameEngine.m1188a("Replay: " + str, (Throwable) exc);
    }

    /* renamed from: a */
    public File m2648a(String str, boolean z) {
        return C0750a.m2461a(str, this.f4503a, z);
    }

    /* renamed from: a */
    public void m2655a(Context context) {
    }

    /* renamed from: a */
    public void m2658a() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6231bt != 0.0f) {
            gameEngine.f6231bt = 0.0f;
        } else {
            gameEngine.f6231bt = 1.0f;
        }
    }

    /* renamed from: b */
    public void m2645b() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6231bt == 1.0f) {
            gameEngine.f6231bt = 2.0f;
        } else if (gameEngine.f6231bt == 2.0f) {
            gameEngine.f6231bt = 4.0f;
        } else if (gameEngine.f6231bt == 4.0f) {
            gameEngine.f6231bt = 8.0f;
        } else if (gameEngine.f6231bt == 8.0f) {
            gameEngine.f6231bt = 16.0f;
        } else if (gameEngine.f6231bt == 16.0f) {
            gameEngine.f6231bt = 32.0f;
        } else if (gameEngine.f6231bt == 32.0f) {
            gameEngine.f6231bt = 64.0f;
        } else if (gameEngine.f6231bt == 64.0f) {
            gameEngine.f6231bt = 1.0f;
        } else {
            gameEngine.f6231bt = 1.0f;
        }
    }

    /* renamed from: a */
    public void m2656a(int i, String str, String str2, int i2) {
        RunnableC0717bb runnableC0717bb = this.f4500I;
        if (this.f4483N && !this.f4485s) {
            if (str2.startsWith("-t ")) {
            }
            C0719bd c0719bd = new C0719bd();
            c0719bd.f4522a = i2;
            c0719bd.f4528g = new C0718bc();
            c0719bd.f4528g.f4519a = i;
            c0719bd.f4528g.f4520b = str;
            c0719bd.f4528g.f4521c = str2;
            if (runnableC0717bb == null) {
                GameEngine.m1120g("Failed to record chat message, replay might have already stopped");
            } else {
                runnableC0717bb.m2631a(c0719bd);
            }
        }
    }

    /* renamed from: a */
    public void m2646a(byte[] bArr, int i, int i2, int i3, float f, float f2) {
        RunnableC0717bb runnableC0717bb = this.f4500I;
        if (this.f4483N && !this.f4485s) {
            C0719bd c0719bd = new C0719bd();
            c0719bd.f4522a = i;
            c0719bd.f4527f = bArr;
            c0719bd.f4529h = i2;
            c0719bd.f4530i = i3;
            c0719bd.f4531j = f;
            c0719bd.f4532k = f2;
            if (runnableC0717bb == null) {
                GameEngine.m1120g("Failed to save resync, replay might have already stopped");
            } else {
                runnableC0717bb.m2631a(c0719bd);
            }
        }
    }

    /* renamed from: a */
    public void m2652a(C0749e c0749e, int i) {
        RunnableC0717bb runnableC0717bb = this.f4500I;
        if (this.f4483N && !this.f4485s) {
            if (runnableC0717bb == null) {
                GameEngine.m1120g("Failed to record command, replay might have already stopped");
                return;
            }
            C0719bd c0719bd = new C0719bd();
            c0719bd.f4526e = c0749e.m2477f();
            c0719bd.f4522a = i;
            runnableC0717bb.m2631a(c0719bd);
            this.f4474h++;
            if (this.f4474h > 5) {
                this.f4474h = 0;
                GameEngine gameEngine = GameEngine.getInstance();
                C0719bd c0719bd2 = new C0719bd();
                c0719bd2.f4524c = Long.valueOf(m2639e());
                c0719bd2.f4522a = gameEngine.f6233bx;
                runnableC0717bb.m2631a(c0719bd2);
            }
        }
    }

    /* renamed from: c */
    public void m2643c() {
        if (this.f4483N && !this.f4485s) {
            GameEngine gameEngine = GameEngine.getInstance();
            C0719bd c0719bd = new C0719bd();
            C0859ar c0859ar = new C0859ar();
            try {
                c0859ar.m1554c(0);
                c0859ar.mo1487a(gameEngine.networkEngine.f5577an.size());
                Iterator it = gameEngine.networkEngine.f5577an.iterator();
                while (it.hasNext()) {
                    c0859ar.m1577a(((C0851ak) it.next()).f5671b);
                }
                c0719bd.f4525d = c0859ar.m1552d();
                c0719bd.f4522a = gameEngine.f6233bx;
                this.f4500I.m2631a(c0719bd);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: d */
    public void m2641d() {
        synchronized (this.f4506K) {
            try {
                if (this.f4500I != null) {
                    this.f4500I.m2632a();
                    try {
                        this.f4501J.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.f4483N = false;
                    this.f4500I = null;
                    this.f4501J = null;
                }
                if (this.f4496E != null) {
                    this.f4498G.flush();
                    this.f4498G.close();
                    this.f4497F.flush();
                    this.f4497F.close();
                    this.f4496E.flush();
                    this.f4496E.close();
                }
                this.f4496E = null;
                this.f4497F = null;
                this.f4498G = null;
                this.f4499H = null;
            } catch (IOException e2) {
                e2.printStackTrace();
                this.f4496E = null;
                this.f4497F = null;
                this.f4498G = null;
                this.f4499H = null;
            }
            this.f4482q = false;
            this.f4483N = false;
            this.f4485s = false;
            this.f4484r = null;
            this.f4473g = 0;
            this.f4474h = 0;
            this.f4475i = false;
            this.f4476j = 0;
            this.f4477k = false;
            this.f4488w = 0;
            this.f4505t = 1;
            this.f4489x = 0;
            this.f4490y = 0;
            this.f4491z = 0;
            this.f4478m = -1;
            this.f4479n = 0;
            this.f4480o = -1;
            this.f4481p = null;
            try {
                if (this.f4492A != null) {
                    this.f4494C.close();
                    this.f4493B.close();
                    this.f4492A.close();
                }
                this.f4492A = null;
                this.f4493B = null;
                this.f4494C = null;
                this.f4495D = null;
            } catch (IOException e3) {
                e3.printStackTrace();
                this.f4492A = null;
                this.f4493B = null;
                this.f4494C = null;
                this.f4495D = null;
            }
        }
    }

    /* renamed from: e */
    public long m2639e() {
        AbstractC0623y abstractC0623y;
        long j = 0;
        Iterator it = AbstractC1120w.f6956en.iterator();
        while (it.hasNext()) {
            AbstractC1120w abstractC1120w = (AbstractC1120w) it.next();
            if (abstractC1120w instanceof AbstractC0623y) {
                j = ((float) j) + (abstractC0623y.f6951ek * 1000.0f) + (abstractC0623y.f6952el * 1000.0f) + (abstractC0623y.f1631cs * 1.0f) + ((AbstractC0623y) abstractC1120w).f6945ed;
            }
        }
        return j;
    }

    /* renamed from: f */
    public void m2637f() {
        if (!this.f4507L) {
            m2641d();
        }
    }

    /* renamed from: c */
    public boolean m2642c(String str) {
        return m2650a(str, m2648a(str, false));
    }

    /* renamed from: j */
    private void m2633j() {
        for (int i = 0; i < Team.f1364c; i++) {
            Team m6317k = Team.m6317k(i);
            if (m6317k != null && (m6317k instanceof C0136a)) {
                ((C0136a) m6317k).f583aW = true;
            }
        }
    }

    /* renamed from: a */
    public boolean m2650a(String str, File file) {
        if (this.f4483N) {
            if (this.f4485s) {
                GameEngine.m1145b("startReplayingFile: A replay is already playing");
            } else {
                GameEngine.m1145b("startReplayingFile: A replay is already saving");
            }
        }
        m2641d();
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.m1129e();
        gameEngine.networkEngine.m1621q();
        this.f4486u = null;
        this.f4482q = false;
        this.f4483N = true;
        this.f4485s = true;
        this.f4484r = str;
        try {
            if (file.isDirectory()) {
                GameEngine.PrintLog("File is a directory: " + file.getAbsolutePath());
                GameEngine.PrintLog("Cannot load replay: Target is a folder, instead of a file");
                gameEngine.m1192a("Cannot load replay: Target is a folder, instead of a file", 1);
                return false;
            }
            this.f4492A = C0750a.m2466a(file);
            if (this.f4492A == null) {
                GameEngine.PrintLog("Cannot load replay: Failed to read replay file");
                gameEngine.m1192a("Cannot load replay: Failed to read replay file", 1);
                return false;
            }
            this.f4493B = new BufferedInputStream(this.f4492A);
            this.f4494C = new DataInputStream(this.f4493B);
            this.f4495D = new C0876k(this.f4494C);
            String m1448l = this.f4495D.m1448l();
            if (!m1448l.equals("rustedWarfareReplay")) {
                GameEngine.PrintLog("Header is not correct:" + m1448l);
                GameEngine.PrintLog("Cannot load replay: File is missing header (check if this file is a replay)");
                gameEngine.m1192a("Cannot load replay: File is missing header (check if this file is a replay)", 1);
                return false;
            }
            int m1454f = this.f4495D.m1454f();
            int m1454f2 = this.f4495D.m1454f();
            m2651a("Loading save from version: " + m1454f2);
            this.f4495D.m1471a(m1454f2);
            String m1448l2 = this.f4495D.m1448l();
            if ((m1454f2 != 95 || m1454f != gameEngine.m1135c(true)) && !this.f4504l) {
                String str2 = "Cannot load replay: This replay was recording with a different version: " + m1448l2;
                if (GameEngine.m1157au()) {
                    str2 = str2 + " (You can use the beta tab in steam to switch to old versions)";
                }
                gameEngine.m1192a(str2, 1);
                m2651a("Replay version: " + m1454f2 + " (" + m1454f + ")");
                m2651a("GameSaver.thisSaveVersion: 95 (" + gameEngine.m1135c(true) + ")");
                if (!GameEngine.f6085aG) {
                    this.f4483N = false;
                    return false;
                }
            }
            this.f4480o = m1454f2;
            this.f4481p = m1448l2;
            this.f4495D.m1455e();
            this.f4495D.m1460b("gamesave");
            this.f4502M = false;
            this.f4507L = true;
            m2651a("Loading replay initial save");
            gameEngine.f6119ca.m452a(this.f4495D, false, false, false);
            this.f4507L = false;
            this.f4495D.m1456d("gamesave");
            if (!this.f4502M) {
                m2651a("ReplayEngine: --- No game setup read ----");
                gameEngine.networkEngine.f5597aO.f5656i = true;
                gameEngine.f6100bC = gameEngine.f6109bQ.teamUnitCapHostedGame;
                gameEngine.f6099bB = gameEngine.f6100bC;
            }
            if (!this.f4472f) {
                m2633j();
            }
            m2651a("--- Reply settings ---");
            m2651a("Unit cap: " + gameEngine.f6100bC);
            m2651a(gameEngine.networkEngine.f5597aO.m1599b());
            m2651a("Starting frame:" + gameEngine.f6233bx);
            if (!this.f4472f) {
                for (int i = 0; i < Team.f1364c; i++) {
                    Team m6317k = Team.m6317k(i);
                    if (m6317k != null && m6317k.f1315u != null) {
                        gameEngine.f6111bS.f5107e.m1952a(VariableScope.nullOrMissingString, "Player '" + m6317k.f1315u + "' playing as " + m6317k.m6410K().toLowerCase() + " (team:" + m6317k.m6325h() + ")");
                    }
                }
            }
            if (GameEngine.f6187aw) {
                C0831ad.m1648g("Warning: editor will desync checksums.");
                gameEngine.f6094bv = true;
                gameEngine.f6225bl = true;
                gameEngine.f6227bn = true;
            }
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m2647a(boolean z) {
        if (GameEngine.f6201aW) {
            if (!GameEngine.f6208bd) {
                return;
            }
        } else if (!GameEngine.f6207bc) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.f5564B && !z && !this.f4507L && gameEngine.f6109bQ.saveMultiplayerReplays) {
            m2640d(gameEngine.m1167ak() + " [v" + gameEngine.m1098u() + "] (" + CommonUtils.m2336a("d MMM yyyy HH.mm.ss") + ").replay");
        }
    }

    /* renamed from: d */
    public void m2640d(String str) {
        m2651a("Recording replay to: " + str);
        if (this.f4483N) {
            if (this.f4485s) {
                m2644b("startSaving: A replay is already playing");
            } else {
                m2644b("startSaving: A replay is already saving");
            }
        }
        m2641d();
        GameEngine gameEngine = GameEngine.getInstance();
        this.f4482q = false;
        this.f4483N = true;
        this.f4485s = false;
        this.f4484r = str;
        try {
            File m2648a = m2648a(str, true);
            this.f4496E = C0750a.m2464a(m2648a, false);
            if (this.f4496E == null) {
                m2644b("Failed to create replay file at:" + m2648a.getAbsolutePath());
                GameEngine.getInstance().m1116i("Failed to create replay file (Replay recording will be disabled)");
                m2641d();
                return;
            }
            this.f4497F = new BufferedOutputStream(this.f4496E);
            this.f4498G = new DataOutputStream(this.f4497F);
            this.f4499H = new C0859ar(this.f4498G);
            this.f4499H.m1553c("rustedWarfareReplay");
            this.f4499H.mo1487a(gameEngine.m1135c(true));
            this.f4499H.mo1487a(95);
            this.f4499H.m1553c(gameEngine.m1098u());
            this.f4499H.mo1482a(gameEngine.f6222ar);
            this.f4499H.m1549e("gamesave");
            gameEngine.f6119ca.m453a(this.f4499H);
            this.f4499H.mo1485a("gamesave");
            this.f4498G.flush();
            this.f4500I = new RunnableC0717bb(this);
            this.f4501J = new Thread(this.f4500I);
            this.f4501J.start();
        } catch (IOException e) {
            m2649a("Failed to start recording replay", e);
            GameEngine.getInstance().m1116i("Failed to start recording replay: " + e.getMessage());
            m2641d();
        } catch (Exception e2) {
            m2649a("Failed to start recording replay (Non IOException)", e2);
            GameEngine.getInstance().m1116i("Failed to start recording replay (Non IOException): " + e2.getMessage());
            m2641d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x05fe, code lost:
        r0.f6093bs = r0.team;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0607, code lost:
        r6.f4495D.m1456d("end");
        com.corrodinggames.rts.gameFramework.GameEngine.PrintLog("number of replay commands issued:" + r6.f4489x);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0629, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x05b6, code lost:
        com.corrodinggames.rts.gameFramework.GameEngine.m1144b("replay:updateGameFrame", "end of replay block found");
        r0.f6111bS.f5109e.m1952a(com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.nullOrMissingString, "Replay has ended");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x05d0, code lost:
        if (r0.f6094bv != false) goto L200;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x05d3, code lost:
        r6.f4482q = true;
        r0.f6231bt = 0.25f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x05e1, code lost:
        r6.f4482q = false;
        r6.f4483N = false;
        r6.f4485s = false;
        r0 = r0.f6111bS.m1983i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x05fb, code lost:
        if (r0 == null) goto L197;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2657a(float r7) {
        /*
            Method dump skipped, instructions count: 2432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.C0716ba.m2657a(float):void");
    }

    /* renamed from: e */
    public void m2638e(String str) {
        GameEngine.PrintLog("ReplayEngine deleteGame: " + str);
        String m2437n = C0750a.m2437n(str);
        if (m2437n.contains("\\") || m2437n.contains("/")) {
            GameEngine.PrintLog("Cannot get replay with path: " + str);
            return;
        }
        File m2648a = m2648a(str, true);
        GameEngine.PrintLog("ReplayEngine path: " + m2648a.getAbsolutePath());
        if (!m2648a.exists()) {
            GameEngine.PrintLog("ReplayEngine deleteGame: file doesn't exist");
        }
        if (!C0750a.m2457b(m2648a)) {
            GameEngine.PrintLog("ReplayEngine deleteGame: failed to delete: " + m2648a.getAbsolutePath());
        }
        File m2648a2 = m2648a(str + ".map", true);
        if (m2648a2.exists()) {
            C0750a.m2457b(m2648a2);
        }
    }

    /* renamed from: g */
    public boolean m2636g() {
        return this.f4483N;
    }

    /* renamed from: h */
    public boolean m2635h() {
        return this.f4483N && this.f4485s;
    }

    /* renamed from: i */
    public boolean m2634i() {
        return this.f4483N && !this.f4485s;
    }
}
