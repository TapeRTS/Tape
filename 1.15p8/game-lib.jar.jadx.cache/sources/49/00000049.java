package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.ai.AI;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.file.C0670a;
import com.corrodinggames.rts.gameFramework.network.C0770aj;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
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
public class ReplayEngine {

    /* renamed from: b */
    public static boolean f4064b = true;

    /* renamed from: c */
    public static boolean f4065c = true;

    /* renamed from: d */
    public static boolean f4066d = true;

    /* renamed from: e */
    public static boolean f4067e = true;

    /* renamed from: f */
    public boolean f4080f;

    /* renamed from: g */
    int f4081g;

    /* renamed from: h */
    int f4082h;

    /* renamed from: i */
    boolean f4083i;

    /* renamed from: j */
    int f4084j;

    /* renamed from: k */
    boolean f4085k;

    /* renamed from: m */
    public int f4086m;

    /* renamed from: n */
    public int f4087n;

    /* renamed from: o */
    public int f4088o;

    /* renamed from: p */
    public String f4089p;

    /* renamed from: q */
    boolean f4090q;

    /* renamed from: N */
    private volatile boolean f4079N;

    /* renamed from: r */
    String f4091r;

    /* renamed from: s */
    boolean replayPlaying;

    /* renamed from: u */
    C0643bd f4093u;

    /* renamed from: v */
    C0643bd f4094v;

    /* renamed from: w */
    int f4095w;

    /* renamed from: x */
    int f4096x;

    /* renamed from: y */
    int f4097y;

    /* renamed from: z */
    int f4098z;

    /* renamed from: A */
    InputStream f4068A;

    /* renamed from: B */
    BufferedInputStream f4069B;

    /* renamed from: C */
    DataInputStream f4070C;

    /* renamed from: D */
    InputNetStream stream;

    /* renamed from: E */
    OutputStream f4072E;

    /* renamed from: F */
    BufferedOutputStream f4073F;

    /* renamed from: G */
    DataOutputStream f4074G;

    /* renamed from: H */
    OutputNetStream f4075H;

    /* renamed from: I */
    ReplayFrame f4076I;

    /* renamed from: J */
    Thread f4077J;

    /* renamed from: M */
    public boolean f4078M;

    /* renamed from: a */
    String replaysFolder = "replays/";

    /* renamed from: l */
    public boolean f4100l = false;

    /* renamed from: t */
    public int f4101t = 1;

    /* renamed from: K */
    Object f4102K = new Object();

    /* renamed from: L */
    public boolean f4103L = false;

    /* renamed from: a */
    public static void m2318a(String str) {
        GameEngine.PrintLOG("Replay: " + str);
    }

    /* renamed from: b */
    public static void m2311b(String str) {
        GameEngine.log("Replay: " + str);
    }

    /* renamed from: a */
    public static void m2316a(String str, Exception exc) {
        GameEngine.LogThrowable("Replay: " + str, (Throwable) exc);
    }

    /* renamed from: a */
    public File saveReplays(String str, boolean z) {
        return C0670a.m2175a(str, this.replaysFolder, z);
    }

    /* renamed from: a */
    public void init(Context context) {
    }

    /* renamed from: a */
    public void pause() {
        GameEngine game = GameEngine.getInstance();
        if (game.gameSpeed != 0.0f) {
            game.gameSpeed = 0.0f;
        } else {
            game.gameSpeed = 1.0f;
        }
    }

    /* renamed from: b */
    public void m2312b() {
        GameEngine game = GameEngine.getInstance();
        if (game.gameSpeed == 1.0f) {
            game.gameSpeed = 2.0f;
        } else if (game.gameSpeed == 2.0f) {
            game.gameSpeed = 4.0f;
        } else if (game.gameSpeed == 4.0f) {
            game.gameSpeed = 8.0f;
        } else if (game.gameSpeed == 8.0f) {
            game.gameSpeed = 16.0f;
        } else if (game.gameSpeed == 16.0f) {
            game.gameSpeed = 32.0f;
        } else if (game.gameSpeed == 32.0f) {
            game.gameSpeed = 64.0f;
        } else if (game.gameSpeed == 64.0f) {
            game.gameSpeed = 1.0f;
        } else {
            game.gameSpeed = 1.0f;
        }
    }

    /* renamed from: a */
    public void m2323a(int i, String str, String str2, int i2) {
        ReplayFrame replayFrame = this.f4076I;
        if (this.f4079N && !this.replayPlaying) {
            if (str2.startsWith("-t ")) {
            }
            C0643bd c0643bd = new C0643bd();
            c0643bd.f4118a = i2;
            c0643bd.f4124g = new C0642bc();
            c0643bd.f4124g.f4115a = i;
            c0643bd.f4124g.f4116b = str;
            c0643bd.f4124g.f4117c = str2;
            if (replayFrame == null) {
                GameEngine.LogTrace("Failed to record chat message, replay might have already stopped");
            } else {
                replayFrame.m2298a(c0643bd);
            }
        }
    }

    /* renamed from: a */
    public void m2313a(byte[] bArr, int i, int i2, int i3, float f, float f2) {
        ReplayFrame replayFrame = this.f4076I;
        if (this.f4079N && !this.replayPlaying) {
            C0643bd c0643bd = new C0643bd();
            c0643bd.f4118a = i;
            c0643bd.f4123f = bArr;
            c0643bd.f4125h = i2;
            c0643bd.f4126i = i3;
            c0643bd.f4127j = f;
            c0643bd.f4128k = f2;
            if (replayFrame == null) {
                GameEngine.LogTrace("Failed to save resync, replay might have already stopped");
            } else {
                replayFrame.m2298a(c0643bd);
            }
        }
    }

    /* renamed from: a */
    public void m2319a(C0678e c0678e, int i) {
        ReplayFrame replayFrame = this.f4076I;
        if (this.f4079N && !this.replayPlaying) {
            if (replayFrame == null) {
                GameEngine.LogTrace("Failed to record command, replay might have already stopped");
                return;
            }
            C0643bd c0643bd = new C0643bd();
            c0643bd.f4122e = c0678e.m2078f();
            c0643bd.f4118a = i;
            replayFrame.m2298a(c0643bd);
            this.f4082h++;
            if (this.f4082h > 5) {
                this.f4082h = 0;
                GameEngine gameEngine = GameEngine.getInstance();
                C0643bd c0643bd2 = new C0643bd();
                c0643bd2.f4120c = Long.valueOf(checksum());
                c0643bd2.f4118a = gameEngine.frameNumber;
                replayFrame.m2298a(c0643bd2);
            }
        }
    }

    /* renamed from: c */
    public void m2310c() {
        if (this.f4079N && !this.replayPlaying) {
            GameEngine gameEngine = GameEngine.getInstance();
            C0643bd c0643bd = new C0643bd();
            OutputNetStream outputNetStream = new OutputNetStream();
            try {
                outputNetStream.writeByte(0);
                outputNetStream.writeInt(gameEngine.networkEngine.f5137am.size());
                Iterator it = gameEngine.networkEngine.f5137am.iterator();
                while (it.hasNext()) {
                    outputNetStream.writeLong(((C0770aj) it.next()).f5225b);
                }
                c0643bd.f4121d = outputNetStream.mo1294d();
                c0643bd.f4118a = gameEngine.frameNumber;
                this.f4076I.m2298a(c0643bd);
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: d */
    public void m2308d() {
        synchronized (this.f4102K) {
            try {
                if (this.f4076I != null) {
                    this.f4076I.m2299a();
                    try {
                        this.f4077J.join();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    this.f4079N = false;
                    this.f4076I = null;
                    this.f4077J = null;
                }
                if (this.f4072E != null) {
                    this.f4074G.flush();
                    this.f4074G.close();
                    this.f4073F.flush();
                    this.f4073F.close();
                    this.f4072E.flush();
                    this.f4072E.close();
                }
                this.f4072E = null;
                this.f4073F = null;
                this.f4074G = null;
                this.f4075H = null;
            } catch (IOException e2) {
                e2.printStackTrace();
                this.f4072E = null;
                this.f4073F = null;
                this.f4074G = null;
                this.f4075H = null;
            }
            this.f4090q = false;
            this.f4079N = false;
            this.replayPlaying = false;
            this.f4091r = null;
            this.f4081g = 0;
            this.f4082h = 0;
            this.f4083i = false;
            this.f4084j = 0;
            this.f4085k = false;
            this.f4095w = 0;
            this.f4101t = 1;
            this.f4096x = 0;
            this.f4097y = 0;
            this.f4098z = 0;
            this.f4086m = -1;
            this.f4087n = 0;
            this.f4088o = -1;
            this.f4089p = null;
            try {
                if (this.f4068A != null) {
                    this.f4070C.close();
                    this.f4069B.close();
                    this.f4068A.close();
                }
                this.f4068A = null;
                this.f4069B = null;
                this.f4070C = null;
                this.stream = null;
            } catch (IOException e3) {
                e3.printStackTrace();
                this.f4068A = null;
                this.f4069B = null;
                this.f4070C = null;
                this.stream = null;
            }
        }
    }

    /* renamed from: e */
    public long checksum() {
        OrderableUnit orderableUnit;
        long j = 0;
        Iterator it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject gameObject = (GameObject) it.next();
            if (gameObject instanceof OrderableUnit) {
                j = ((float) j) + (orderableUnit.x * 1000.0f) + (orderableUnit.y * 1000.0f) + (orderableUnit.hp * 1.0f) + ((OrderableUnit) gameObject).GameObjectID;
            }
        }
        return j;
    }

    /* renamed from: f */
    public void m2304f() {
        if (!this.f4103L) {
            m2308d();
        }
    }

    /* renamed from: c */
    public boolean m2309c(String str) {
        return m2317a(str, saveReplays(str, false));
    }

    /* renamed from: j */
    private void m2300j() {
        for (int i = 0; i < Team.playerNumMax; i++) {
            Team team = Team.getTeam(i);
            if (team != null && (team instanceof AI)) {
                ((AI) team).f556aU = true;
            }
        }
    }

    /* renamed from: a */
    public boolean m2317a(String str, File file) {
        if (this.f4079N) {
            if (this.replayPlaying) {
                GameEngine.log("startReplayingFile: A replay is already playing");
            } else {
                GameEngine.log("startReplayingFile: A replay is already saving");
            }
        }
        m2308d();
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.mo834d();
        gameEngine.networkEngine.m1363n();
        this.f4093u = null;
        this.f4090q = false;
        this.f4079N = true;
        this.replayPlaying = true;
        this.f4091r = str;
        try {
            if (file.isDirectory()) {
                GameEngine.PrintLOG("File is a directory: " + file.getAbsolutePath());
                GameEngine.PrintLOG("Cannot load replay: Target is a folder, instead of a file");
                gameEngine.alert("Cannot load replay: Target is a folder, instead of a file", 1);
                return false;
            }
            this.f4068A = C0670a.m2180a(file);
            if (this.f4068A == null) {
                GameEngine.PrintLOG("Cannot load replay: Failed to read replay file");
                gameEngine.alert("Cannot load replay: Failed to read replay file", 1);
                return false;
            }
            this.f4069B = new BufferedInputStream(this.f4068A);
            this.f4070C = new DataInputStream(this.f4069B);
            this.stream = new InputNetStream(this.f4070C);
            String readString = this.stream.readString();
            if (!readString.equals("rustedWarfareReplay")) {
                GameEngine.PrintLOG("Header is not correct:" + readString);
                GameEngine.PrintLOG("Cannot load replay: File is missing header (check if this file is a replay)");
                gameEngine.alert("Cannot load replay: File is missing header (check if this file is a replay)", 1);
                return false;
            }
            int readInt = this.stream.readInt();
            int readInt2 = this.stream.readInt();
            m2318a("Loading save from version: " + readInt2);
            this.stream.m1245a(readInt2);
            String readString2 = this.stream.readString();
            if ((readInt2 != 94 || readInt != gameEngine.gameVersionInternal(true)) && !this.f4100l) {
                String str2 = "Cannot load replay: This replay was recording with a different version: " + readString2;
                if (GameEngine.isPC()) {
                    str2 = str2 + " (You can use the beta tab in steam to switch to old versions)";
                }
                gameEngine.alert(str2, 1);
                m2318a("Replay version: " + readInt2 + " (" + readInt + ")");
                m2318a("GameSaver.thisSaveVersion: 94 (" + gameEngine.gameVersionInternal(true) + ")");
                if (!GameEngine.oldReplays) {
                    this.f4079N = false;
                    return false;
                }
            }
            this.f4088o = readInt2;
            this.f4089p = readString2;
            this.stream.readBoolean();
            this.stream.m1234b("gamesave");
            this.f4078M = false;
            this.f4103L = true;
            m2318a("Loading replay initial save");
            gameEngine.f5862ca.m414a(this.stream, false, false, false);
            this.f4103L = false;
            this.stream.m1230d("gamesave");
            if (!this.f4078M) {
                m2318a("ReplayEngine: --- No game setup read ----");
                gameEngine.networkEngine.setup.noNukes = true;
                gameEngine.f5821bC = gameEngine.curSettings.teamUnitCapHostedGame;
                gameEngine.f5820bB = gameEngine.f5821bC;
            }
            if (!this.f4080f) {
                m2300j();
            }
            m2318a("--- Reply settings ---");
            m2318a("Unit cap: " + gameEngine.f5821bC);
            m2318a(gameEngine.networkEngine.setup.m1340b());
            m2318a("Starting frame:" + gameEngine.frameNumber);
            if (!this.f4080f) {
                for (int i = 0; i < Team.playerNumMax; i++) {
                    Team team = Team.getTeam(i);
                    if (team != null && team.playerName != null) {
                        gameEngine.interfaceEngine.messageInterface.m1810a(VariableScope.nullOrMissingString, "Player '" + team.playerName + "' playing as " + team.m3980H().toLowerCase() + " (team:" + team.getTeam() + ")");
                    }
                }
            }
            if (GameEngine.Replay_Debug) {
                NetworkEngine.reportDesync("Warning: editor will desync checksums.");
                gameEngine.editorMode = true;
                gameEngine.debugTempMode = true;
                gameEngine.triggerDebug = true;
            }
            return true;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m2314a(boolean z) {
        if (GameEngine.isPC_Device) {
            if (!GameEngine.f5922bd) {
                return;
            }
        } else if (!GameEngine.f5921bc) {
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.networked && !z && !this.f4103L && gameEngine.curSettings.saveMultiplayerReplays) {
            saveGameReplay(gameEngine.getMapNameE() + " [v" + gameEngine.gameVersion() + "] (" + CommonUtils.SimpleDateFormatStr("d MMM yyyy HH.mm.ss") + ").replay");
        }
    }

    /* renamed from: d */
    public void saveGameReplay(String savePath) {
        m2318a("Recording replay to: " + savePath);
        if (this.f4079N) {
            if (this.replayPlaying) {
                m2311b("startSaving: A replay is already playing");
            } else {
                m2311b("startSaving: A replay is already saving");
            }
        }
        m2308d();
        GameEngine gameEngine = GameEngine.getInstance();
        this.f4090q = false;
        this.f4079N = true;
        this.replayPlaying = false;
        this.f4091r = savePath;
        try {
            File saveReplays = saveReplays(savePath, true);
            this.f4072E = C0670a.m2178a(saveReplays, false);
            if (this.f4072E == null) {
                m2311b("Failed to create replay file at:" + saveReplays.getAbsolutePath());
                GameEngine.getInstance().alertA("Failed to create replay file (Replay recording will be disabled)");
                m2308d();
                return;
            }
            this.f4073F = new BufferedOutputStream(this.f4072E);
            this.f4074G = new DataOutputStream(this.f4073F);
            this.f4075H = new OutputNetStream(this.f4074G);
            this.f4075H.writeString("rustedWarfareReplay");
            this.f4075H.writeInt(gameEngine.gameVersionInternal(true));
            this.f4075H.writeInt(94);
            this.f4075H.writeString(gameEngine.gameVersion());
            this.f4075H.writeBoolean(gameEngine.f5936at);
            this.f4075H.mo1291e("gamesave");
            gameEngine.f5862ca.m415a(this.f4075H);
            this.f4075H.endBlock("gamesave");
            this.f4074G.flush();
            this.f4076I = new ReplayFrame(this);
            this.f4077J = new Thread(this.f4076I);
            this.f4077J.start();
        } catch (IOException e) {
            m2316a("Failed to start recording replay", e);
            GameEngine.getInstance().alertA("Failed to start recording replay: " + e.getMessage());
            m2308d();
        } catch (Exception e2) {
            m2316a("Failed to start recording replay (Non IOException)", e2);
            GameEngine.getInstance().alertA("Failed to start recording replay (Non IOException): " + e2.getMessage());
            m2308d();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x05fe, code lost:
        r0.playerTeam = r0.team;
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x0607, code lost:
        r6.stream.m1230d("end");
        com.corrodinggames.rts.gameFramework.GameEngine.PrintLOG("number of replay commands issued:" + r6.f4096x);
     */
    /* JADX WARN: Code restructure failed: missing block: B:102:0x0629, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:95:0x05b6, code lost:
        com.corrodinggames.rts.gameFramework.GameEngine.log("replay:updateGameFrame", "end of replay block found");
        r0.interfaceEngine.messageInterface.m1810a(com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope.nullOrMissingString, "Replay has ended");
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x05d0, code lost:
        if (r0.editorMode != false) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x05d3, code lost:
        r6.f4090q = true;
        r0.gameSpeed = 0.25f;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x05e1, code lost:
        r6.f4090q = false;
        r6.f4079N = false;
        r6.replayPlaying = false;
        r0 = r0.interfaceEngine.m1841i();
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x05fb, code lost:
        if (r0 == null) goto L101;
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void m2324a(float r7) {
        /*
            Method dump skipped, instructions count: 2432
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.ReplayEngine.m2324a(float):void");
    }

    /* renamed from: e */
    public void m2305e(String path) {
        GameEngine.PrintLOG("ReplayEngine deleteGame: " + path);
        String m2152n = C0670a.m2152n(path);
        if (m2152n.contains("\\") || m2152n.contains("/")) {
            GameEngine.PrintLOG("Cannot get replay with path: " + path);
            return;
        }
        File saveReplays = saveReplays(path, true);
        GameEngine.PrintLOG("ReplayEngine path: " + saveReplays.getAbsolutePath());
        if (!saveReplays.exists()) {
            GameEngine.PrintLOG("ReplayEngine deleteGame: file doesn't exist");
        }
        if (!C0670a.m2171b(saveReplays)) {
            GameEngine.PrintLOG("ReplayEngine deleteGame: failed to delete: " + saveReplays.getAbsolutePath());
        }
        File saveReplays2 = saveReplays(path + ".map", true);
        if (saveReplays2.exists()) {
            C0670a.m2171b(saveReplays2);
        }
    }

    /* renamed from: g */
    public boolean m2303g() {
        return this.f4079N;
    }

    /* renamed from: h */
    public boolean isPlaying() {
        return this.f4079N && this.replayPlaying;
    }

    /* renamed from: i */
    public boolean m2301i() {
        return this.f4079N && !this.replayPlaying;
    }
}