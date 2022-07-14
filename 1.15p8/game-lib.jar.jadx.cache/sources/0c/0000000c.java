package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.ai.AI;
import com.corrodinggames.rts.game.units.C0579n;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.custom.C0432i;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.ValueList;
import com.corrodinggames.rts.game.units.custom.ValueListSource;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020e.C0411a;
import com.corrodinggames.rts.game.units.custom.p020e.C0418b;
import com.corrodinggames.rts.game.units.custom.p020e.C0421e;
import com.corrodinggames.rts.gameFramework.C0651bl;
import com.corrodinggames.rts.gameFramework.C0678e;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.Enum_draw;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.SyncedObject;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.C0842h;
import com.corrodinggames.rts.gameFramework.draw.C0853s;
import com.corrodinggames.rts.gameFramework.draw.UniquePaint;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/n.class */
public abstract class Team extends SyncedObject implements Comparable {

    /* renamed from: i */
    public int teamID;
    // 游戏篡改提示 修改者注意：更改启动资金将不允许你在多人游戏中作弊，但它只会破坏同步

    /* renamed from: j */
    public final String Tips_Modifier = "Note to modifiers: Changing credits will not allow you to cheat in multiplayer games, but it will only break sync";

    /* renamed from: k */
    public boolean f1324k;

    /* renamed from: l */
    public boolean f1325l;

    /* renamed from: m */
    public double credits;

    /* renamed from: n */
    public double f1327n;

    /* renamed from: o */
    public int allyGroup;

    /* renamed from: p */
    public OrderableUnit f1329p;

    /* renamed from: q */
    public OrderableUnit f1330q;

    /* renamed from: r */
    public boolean f1331r;
    // 身份/队伍名

    /* renamed from: s */
    public String playerName;

    /* renamed from: t */
    public boolean f1333t;

    /* renamed from: u */
    public int f1334u;

    /* renamed from: v */
    public boolean aiDifficultyLocked;

    /* renamed from: w */
    public Integer aiDifficultyOverride;

    /* renamed from: x */
    public Integer startingUnitOverride;

    /* renamed from: y */
    public Integer f1338y;

    /* renamed from: z */
    public Integer playerColor;

    /* renamed from: A */
    public int id;

    /* renamed from: aq */
    private boolean f1319aq;

    /* renamed from: ar */
    private int f1320ar;

    /* renamed from: B */
    public boolean f1284B;

    /* renamed from: as */
    private int f1321as;

    /* renamed from: C */
    public boolean f1285C;

    /* renamed from: D */
    public boolean f1286D;

    /* renamed from: E */
    public boolean f1287E;

    /* renamed from: F */
    public boolean f1288F;

    /* renamed from: G */
    public boolean f1289G;

    /* renamed from: H */
    public final Object f1290H;

    /* renamed from: I */
    public int fogWidth;

    /* renamed from: J */
    public int fogHeight;

    /* renamed from: K */
    public byte[][] fogOfWar_map;

    /* renamed from: L */
    public String f1294L;

    /* renamed from: M */
    public String f1295M;

    /* renamed from: N */
    public int f1296N;

    /* renamed from: O */
    public int f1297O;

    /* renamed from: P */
    public boolean f1298P;

    /* renamed from: Q */
    public C0196s f1299Q;

    /* renamed from: R */
    public boolean isSurvival;

    /* renamed from: S */
    public byte f1301S;

    /* renamed from: T */
    public int f1302T;

    /* renamed from: U */
    public long nowTime_ms;

    /* renamed from: V */
    public long f1304V;

    /* renamed from: W */
    public int f1305W;

    /* renamed from: X */
    public boolean f1306X;

    /* renamed from: Y */
    public boolean f1307Y;

    /* renamed from: Z */
    public int f1308Z;

    /* renamed from: aa */
    int fails;

    /* renamed from: ab */
    public Paint f1310ab;

    /* renamed from: ac */
    public Paint mapPaint;

    /* renamed from: af */
    int f1312af;

    /* renamed from: ah */
    ValueList f1313ah;

    /* renamed from: ai */
    C0421e f1314ai;

    /* renamed from: aj */
    public C0418b f1315aj;

    /* renamed from: ak */
    public float f1316ak;

    /* renamed from: an */
    long currentTimeMillis_HcatA;

    /* renamed from: ao */
    double f1318ao;
    // 人数上限

    /* renamed from: a */
    public static int playerNumMax = 10;

    /* renamed from: b */
    public static int playerNumEx = 0;
    // 队伍ID上限

    /* renamed from: c */
    public static int MaxTeamIdLimit = 100;
    // 房间总人数

    /* renamed from: d */
    public static int MAX_TEAMS = playerNumMax + playerNumEx;

    /* renamed from: e */
    public static final Team f1344e = new Player(-1, false, "<blank>");

    /* renamed from: f */
    public static final Team f1345f = new C0180d(-2);

    /* renamed from: g */
    public static final Team f1346g = new C0180d(-1);

    /* renamed from: ap */
    private static Team[] teamList = new Team[MAX_TEAMS];

    /* renamed from: h */
    public static Team f1348h = new C0198u(-99);
    // hex颜色值数组

    /* renamed from: ad */
    static int[] teamColorHexArr = new int[10];
    // 队伍颜色名数组

    /* renamed from: ae */
    static String[] teamColorNameArr = new String[10];

    /* renamed from: ag */
    static int aiDifficulty = -99;
    // 1.15新增，单位资金相关

    /* renamed from: al */
    public static float f1352al = 40.0f;

    /* renamed from: am */
    public static float f1353am = 10.0f;

    /* renamed from: a */
    public int compareTo(Team team) {
        int i = this.f1308Z - team.f1308Z;
        if (i != 0) {
            return i;
        }
        int i2 = this.teamID - team.teamID;
        if (i2 != 0) {
            return i2;
        }
        if (this.playerName != null && team.playerName != null) {
            return this.playerName.compareTo(team.playerName);
        }
        return 0;
    }

    /* renamed from: b */
    public void teamWriteOut(OutputNetStream stream) {
        stream.writeByte(this.teamID);
        stream.writeInt((int) this.credits);
        stream.writeInt(this.allyGroup);
        stream.m_writeString(this.playerName);
        stream.writeBoolean(this.isSurvival);
        if (stream.getLastPingTimeReceived() > 26) {
            stream.writeInt(m3877v());
            stream.mo1293d("lastPingTimeReceivedAt");
            stream.writeLong(this.nowTime_ms);
        }
        if (stream.getLastPingTimeReceived() >= 55) {
            stream.writeBoolean(this.f1333t);
            stream.writeInt(this.f1334u);
        }
        if (stream.getLastPingTimeReceived() >= 91) {
            stream.writeInt(this.f1308Z);
            stream.writeByte(0);
        }
        if (stream.getLastPingTimeReceived() >= 97) {
            stream.writeBoolean(this.f1288F);
            stream.writeBoolean(this.f1289G);
        }
        if (stream.getLastPingTimeReceived() >= 125) {
            stream.writeBoolean(this.f1284B);
            stream.writeBoolean(this.f1319aq);
            stream.writeInt(this.f1320ar);
        }
        if (stream.getLastPingTimeReceived() >= 149) {
            stream.m_writeString(this.f1295M);
            stream.writeInt(this.f1296N);
        }
        if (stream.getLastPingTimeReceived() >= 156) {
            stream.m_WriteInt(this.aiDifficultyOverride);
            stream.m_WriteInt(this.startingUnitOverride);
            stream.m_WriteInt(this.f1338y);
            stream.m_WriteInt(this.playerColor);
            stream.writeInt(this.id);
        }
    }

    /* renamed from: c */
    public void m3920c(OutputNetStream stream) {
        stream.writeByte(0);
        stream.writeInt(m3877v());
        stream.writeBoolean(this.f1288F);
        stream.writeBoolean(this.f1289G);
    }

    /* renamed from: a */
    public void m3955a(InputNetStream stream) {
        stream.readByte();
        this.f1302T = stream.readInt();
        this.nowTime_ms = System.currentTimeMillis();
        this.f1288F = stream.readBoolean();
        this.f1289G = stream.readBoolean();
    }

    /* renamed from: b */
    public void m3934b(InputNetStream inputNetStream) {
        m3954a(inputNetStream, false);
    }

    /* renamed from: a */
    public void m3954a(InputNetStream stream, boolean z) {
        if (!z) {
            m3900f((int) stream.readByte());
            this.credits = stream.readInt();
            this.f1327n = 0.0d;
            this.allyGroup = stream.readInt();
            this.playerName = stream.m1224j();
            this.isSurvival = stream.readBoolean();
        } else {
            stream.readByte();
            stream.readInt();
            stream.readInt();
            stream.m1224j();
            stream.readBoolean();
        }
        if (stream.m1237b() >= 14) {
            this.f1302T = stream.readInt();
            stream.readLong();
            this.nowTime_ms = System.currentTimeMillis();
        }
        if (stream.m1237b() >= 34 && stream.getStreamVersion() >= 55) {
            boolean readBoolean = stream.readBoolean();
            int readInt = stream.readInt();
            if (!z) {
                this.f1333t = readBoolean;
                this.f1334u = readInt;
            }
        } else if (GameEngine.getInstance().networkEngine.networked) {
            NetworkEngine.reportDesync("AI was skipping in networked game, steam version:" + stream.getStreamVersion());
        }
        if (stream.m1237b() >= 50 && stream.getStreamVersion() >= 91) {
            this.f1308Z = stream.readInt();
            stream.readByte();
        }
        if (stream.m1237b() >= 52 && stream.getStreamVersion() >= 97) {
            this.f1288F = stream.readBoolean();
            this.f1289G = stream.readBoolean();
        }
        if (stream.m1237b() >= 70 && stream.getStreamVersion() >= 125) {
            boolean readBoolean2 = stream.readBoolean();
            boolean readBoolean3 = stream.readBoolean();
            int readInt2 = stream.readInt();
            if (!z) {
                this.f1284B = readBoolean2;
                this.f1319aq = readBoolean3;
                this.f1320ar = readInt2;
            }
        }
        if (stream.m1237b() >= 90 && stream.getStreamVersion() >= 149) {
            String m1224j = stream.m1224j();
            int readInt3 = stream.readInt();
            if (!z) {
                this.f1295M = m1224j;
                this.f1296N = readInt3;
            }
        }
        if (stream.m1237b() >= 93 && stream.getStreamVersion() >= 156) {
            Integer ai = stream.m1223k();
            Integer startUnit = stream.m1223k();
            Integer m1223k = stream.m1223k();
            Integer m1223k2 = stream.m1223k();
            int readInt4 = stream.readInt();
            if (!z) {
                if (this.aiDifficultyOverride != ai) {
                    log("readIn aiDifficultyOverride was:" + this.aiDifficultyOverride + " now:  " + ai);
                }
                this.aiDifficultyOverride = ai;
                this.startingUnitOverride = startUnit;
                this.f1338y = m1223k;
                this.playerColor = m1223k2;
                this.id = readInt4;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream stream) {
        stream.mo1293d("Writing team: " + this.playerName);
        teamWriteOut(stream);
        if (stream.getLastPingTimeReceived() >= 44) {
            stream.writeByte(4);
            stream.writeBoolean(this.f1286D);
            stream.writeBoolean(this.f1285C);
            stream.writeBoolean(true);
            if (1 != 0) {
                m3911d(stream);
            }
            this.f1314ai.m3300a(stream);
            ValueListSource.m3247a(this.f1313ah, stream);
            stream.writeBoolean(this.aiDifficultyLocked);
        }
    }

    /* renamed from: c */
    public void mo3919c(InputNetStream stream) {
        m3934b(stream);
        if (stream.m1237b() >= 26) {
            byte readByte = stream.readByte();
            this.f1286D = stream.readBoolean();
            if (readByte >= 1) {
                this.f1285C = stream.readBoolean();
            }
            if (stream.readBoolean()) {
                m3910d(stream);
            }
            if (readByte >= 2) {
                this.f1314ai.m3299a(stream);
            }
            if (readByte >= 3) {
                m3957a(ValueListSource.m3246a(stream));
            }
            if (readByte >= 4) {
                this.aiDifficultyLocked = stream.readBoolean();
            }
        }
    }

    /* renamed from: d */
    public void m3911d(OutputNetStream stream) {
        GameEngine.getInstance();
        stream.mo1293d("-- Saving fog --");
        stream.writeBoolean(this.fogOfWar_map != null);
        if (this.fogOfWar_map != null) {
            stream.writeInt(this.fogWidth);
            stream.writeInt(this.fogHeight);
            for (int i = 0; i < this.fogWidth; i++) {
                for (int i2 = 0; i2 < this.fogHeight; i2++) {
                    stream.writeByte(this.fogOfWar_map[i][i2]);
                }
            }
        }
        stream.mo1293d("--End fog--");
    }

    /* renamed from: d */
    public void m3910d(InputNetStream stream) {
        GameEngine game = GameEngine.getInstance();
        if (stream.readBoolean()) {
            this.fogWidth = stream.readInt();
            this.fogHeight = stream.readInt();
            int mapWidth = this.fogWidth;
            int mapHeight = this.fogHeight;
            if (game.map != null) {
                mapWidth = game.map.mapWidth;
                mapHeight = game.map.mapHeight;
                if (this.fogWidth != mapWidth || this.fogHeight != mapHeight) {
                    GameEngine.log("Map size does not match fog size: " + this.fogWidth + "!=" + mapWidth + "|" + this.fogHeight + "!=" + mapHeight);
                }
            }
            if (1 != 0) {
                this.fogOfWar_map = new byte[mapWidth][mapHeight];
            } else {
                this.fogOfWar_map = null;
            }
            for (int i = 0; i < this.fogWidth; i++) {
                for (int i2 = 0; i2 < this.fogHeight; i2++) {
                    if (1 != 0) {
                        this.fogOfWar_map[i][i2] = stream.readByte();
                    } else {
                        stream.readByte();
                    }
                }
            }
            return;
        }
        this.fogOfWar_map = null;
    }

    /* renamed from: a */
    public void m3966a() {
        if (this.fogOfWar_map != null) {
            for (int i = 0; i < this.fogWidth; i++) {
                for (int i2 = 0; i2 < this.fogHeight; i2++) {
                    this.fogOfWar_map[i][i2] = 0;
                }
            }
        }
        GameEngine game = GameEngine.getInstance();
        if (game.playerTeam == this) {
            game.f5836bW.f4874O = true;
            if (game.map != null) {
                game.map.m4106j();
                game.map.m4113f();
            }
        }
    }

    /* renamed from: b */
    public boolean m3945b() {
        return this.allyGroup == -3;
    }

    /* renamed from: a */
    public static ArrayList m3947a(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < MAX_TEAMS; i++) {
            Team team = teamList[i];
            if (team != null && (z || team.m3945b())) {
                arrayList.add(team);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static ArrayList m3929c() {
        return m3930b(false);
    }

    /* renamed from: b */
    public static ArrayList m3930b(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < MAX_TEAMS; i++) {
            Team team = teamList[i];
            if (team != null && (z || !team.m3945b())) {
                arrayList.add(team);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static ArrayList m3916d() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < playerNumMax; i++) {
            Team team = teamList[i];
            if (team != null && !team.m3945b()) {
                arrayList.add(Integer.valueOf(team.allyGroup));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m3963a(int i, boolean z) {
        int i2 = 0;
        for (int i3 = 0; i3 < playerNumMax; i3++) {
            Team team = teamList[i3];
            if (team != null && team.allyGroup == i && !team.m3945b() && (!z || !team.f1333t)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: e */
    public static int m3907e() {
        int i = 0;
        for (int i2 = 0; i2 < playerNumMax; i2++) {
            Team team = teamList[i2];
            if (team != null && !team.m3945b() && !team.f1285C && !team.f1286D) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m3942b(int MaxTeamId, boolean z) {
        if (MaxTeamId < 10 || MaxTeamId == playerNumMax) {
            return;
        }
        if (MaxTeamId > MaxTeamIdLimit) {
            throw new IOException("setMaxTeamId: " + MaxTeamId + " is over limit of:" + MaxTeamIdLimit);
        }
        if (!z && MaxTeamId <= playerNumMax) {
            return;
        }
        int i = MaxTeamId + playerNumEx;
        Team[] teamArr = new Team[i];
        for (int i2 = 0; i2 < teamList.length; i2++) {
            Team team = teamList[i2];
            if (i2 < teamArr.length) {
                teamArr[i2] = team;
            }
        }
        teamList = teamArr;
        playerNumMax = MaxTeamId;
        MAX_TEAMS = i;
    }

    // 格式化客户端UI给定值 -3旁观者
    /* renamed from: a */
    public static String m3964a(int i) {
        return i == 0 ? "A" : i == 1 ? "B" : i == 2 ? "C" : i == 3 ? "D" : i == 4 ? "E" : i == 5 ? "F" : i == 6 ? "G" : i == 7 ? "H" : i == 8 ? "I" : i == 9 ? "J" : i == 10 ? "K" : i == -3 ? "S" : VariableScope.nullOrMissingString + i;
    }

    /* renamed from: f */
    public String getTeam() {
        return m3964a(this.allyGroup);
    }

    /* renamed from: g */
    public void m3899g() {
        this.f1284B = false;
        this.f1319aq = false;
        this.f1320ar = -9999;
    }

    /* renamed from: h */
    public boolean m3896h() {
        return this.f1284B;
    }

    /* renamed from: i */
    public boolean m3893i() {
        return this.f1320ar >= 0;
    }

    /* renamed from: j */
    public void m3891j() {
        this.f1320ar = GameEngine.getInstance().f5845by;
    }

    /* renamed from: k */
    public boolean m3889k() {
        GameEngine game = GameEngine.getInstance();
        if (((this.f1285C || this.f1286D) && !game.networkEngine.setup.sharedControl) || this.f1333t || m3876w() || this.f1307Y) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int getVotedPlayerNum(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < playerNumMax; i3++) {
            Team team = teamList[i3];
            if (team != null && team.allyGroup == i && team.m3893i() && team.m3889k()) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: c */
    public static int getVotePlayerMax(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < playerNumMax; i3++) {
            Team team = teamList[i3];
            if (team != null && team.allyGroup == i && team.m3889k()) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: l */
    public static void m3887l() {
        for (int i = 0; i < playerNumMax; i++) {
            Team team = teamList[i];
            if (team != null) {
                team.f1320ar = -9999;
            }
        }
    }

    /* renamed from: d */
    public static void m3914d(int i) {
        GameEngine game = GameEngine.getInstance();
        if (!game.networkEngine.isServer || game.replayEngine.isPlaying()) {
            return;
        }
        for (int i2 = 0; i2 < playerNumMax; i2++) {
            Team team = teamList[i2];
            if (team != null && team.allyGroup == i && !team.f1319aq) {
                team.f1319aq = true;
                C0678e m2260b = game.f5867cf.m2260b();
                m2260b.team = team;
                m2260b.f4445r = true;
                m2260b.f4448u = 100;
                game.networkEngine.m1488a(m2260b);
            }
        }
    }

    /* renamed from: e */
    public static void m3905e(int i) {
        Team[] teamArr;
        int i2 = -9999;
        for (int i3 = 0; i3 < playerNumMax; i3++) {
            Team team = teamList[i3];
            if (team != null && team.allyGroup == i && team.m3893i() && team.m3889k() && team.f1320ar > i2) {
                i2 = team.f1320ar;
            }
        }
        if (i2 >= 0 && C0955y.m462a(i2, 120000)) {
            for (Team team2 : teamList) {
                if (team2 != null && team2.allyGroup == i) {
                    team2.f1320ar = -9999;
                }
            }
        }
    }

    /* renamed from: b */
    public boolean m3941b(Team team) {
        if (m3886m() && team != null && m3913d(team)) {
            return true;
        }
        return false;
    }

    /* renamed from: m */
    public boolean m3886m() {
        if (this.f1288F || this.f1289G) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m3885n() {
        if (GameEngine.getInstance().playerTeam == this) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m3917c(boolean z) {
        if (z) {
            this.f1296N = 1;
        } else {
            this.f1296N = 0;
        }
    }

    /* renamed from: o */
    public boolean m3884o() {
        return this.f1296N == 1;
    }

    /* renamed from: a */
    public final int getUnitCounts(boolean z, boolean z2) {
        C0196s c0196s = this.f1299Q;
        int i = c0196s.unitCountOfAllTypesOnlyCompleted;
        if (z) {
            i += c0196s.incompleteUnitCountOfAllTypes;
        }
        if (z2) {
            i += c0196s.queuedCountOfAllTypes;
        }
        return i;
    }

    /* renamed from: p */
    public final int m3883p() {
        return this.f1299Q.unitCountOfAllTypesOnlyCompleted + this.f1299Q.incompleteUnitCountOfAllTypes + this.f1299Q.queuedCountOfAllTypes;
    }

    /* renamed from: a */
    public final int m3958a(ValueListSource valueListSource, boolean z, boolean z2) {
        C0196s c0196s = this.f1299Q;
        if (c0196s.f1376d == 0) {
            return 0;
        }
        C0193p c0193p = null;
        C0197t c0197t = c0196s.f1387n;
        C0193p[] c0193pArr = c0197t.f1390b;
        int i = 0;
        int i2 = c0197t.f1391c;
        while (true) {
            if (i >= i2) {
                break;
            }
            C0193p c0193p2 = c0193pArr[i];
            if (c0193p2.f1360a != valueListSource) {
                i++;
            } else {
                c0193p = c0193p2;
                break;
            }
        }
        if (c0193p == null) {
            c0193p = c0196s.m3871a(valueListSource);
            if (c0193p.f1364e > 50) {
                c0197t.m3865a(c0193p);
            }
            c0193p.f1364e = (short) (c0193p.f1364e + 1);
        }
        int i3 = c0193p.f1361b;
        if (z) {
            i3 += c0193p.f1362c;
        }
        if (z2) {
            i3 += c0193p.f1363d;
        }
        return i3;
    }

    /* renamed from: q */
    public boolean m3882q() {
        boolean z = false;
        C0196s m3903e = m3903e(false);
        if (this.f1299Q.f1374b != m3903e.f1374b) {
            GameEngine.log("unitCountExcludingBuildingsIncludingQueued: " + this.f1299Q.f1374b + "!=" + m3903e.f1374b + " (team:" + this.teamID + " fails: " + this.fails + ")");
            this.fails++;
            z = true;
        }
        if (this.f1299Q.unitsMax != m3903e.unitsMax) {
            GameEngine.log("unitsMax: " + this.f1299Q.unitsMax + "!=" + m3903e.unitsMax + " (team:" + this.teamID + " fails: " + this.fails + ")");
            this.fails++;
            z = true;
        }
        if (this.f1299Q.incomeRate != m3903e.incomeRate) {
            GameEngine.log("incomeRate: " + this.f1299Q.incomeRate + "!=" + m3903e.incomeRate + " (team:" + this.teamID + " fails: " + this.fails + ")");
            this.fails++;
            z = true;
        }
        if (this.f1299Q.incompleteUnitCountOfAllTypes != m3903e.incompleteUnitCountOfAllTypes) {
            GameEngine.log("incompleteUnitCountOfAllTypes: " + this.f1299Q.incompleteUnitCountOfAllTypes + "!=" + m3903e.incompleteUnitCountOfAllTypes + " (team:" + this.teamID + " fails: " + this.fails + ")");
            this.fails++;
            z = true;
        }
        if (this.f1299Q.queuedCountOfAllTypes != m3903e.queuedCountOfAllTypes) {
            GameEngine.log("queuedCountOfAllTypes: " + this.f1299Q.queuedCountOfAllTypes + "!=" + m3903e.queuedCountOfAllTypes + " (team:" + this.teamID + " fails: " + this.fails + ")");
            this.fails++;
            z = true;
        }
        if (this.f1299Q.unitCountOfAllTypesOnlyCompleted != m3903e.unitCountOfAllTypesOnlyCompleted) {
            GameEngine.log("unitCountOfAllTypesOnlyCompleted: " + this.f1299Q.unitCountOfAllTypesOnlyCompleted + "!=" + m3903e.unitCountOfAllTypesOnlyCompleted + " (team:" + this.teamID + " fails: " + this.fails + ")");
            this.fails++;
            z = true;
        }
        if (!this.f1299Q.customIncomeRate.m3276e(m3903e.customIncomeRate)) {
            GameEngine.log("customIncomeRate: " + this.f1299Q.customIncomeRate + "!=" + m3903e.customIncomeRate + " (team:" + this.teamID + " fails: " + this.fails + ")");
            GameEngine.log("currentCaches:" + this.f1299Q.customIncomeRate.m3298a(false, true, 30, true, true));
            GameEngine.log("targetUnitCache:" + m3903e.customIncomeRate.m3298a(false, true, 30, true, true));
            this.fails++;
            z = true;
        }
        if (!this.f1299Q.f1386l.m3276e(m3903e.f1386l)) {
            GameEngine.log("streamingRateNegative (team:" + this.teamID + " fails: " + this.fails + ")");
            GameEngine.log("currentCaches:" + this.f1299Q.f1386l.m3298a(false, true, 30, true, true));
            GameEngine.log("targetUnitCache:" + m3903e.f1386l.m3298a(false, true, 30, true, true));
            this.fails++;
            z = true;
        }
        if (!this.f1299Q.f1385k.m3276e(m3903e.f1385k)) {
            GameEngine.log("streamingRatePositive (team:" + this.teamID + " fails: " + this.fails + ")");
            GameEngine.log("currentCaches:" + this.f1299Q.f1385k.m3298a(false, true, 30, true, true));
            GameEngine.log("targetUnitCache:" + m3903e.f1385k.m3298a(false, true, 30, true, true));
            this.fails++;
            z = true;
        }
        if (z) {
        }
        return z;
    }

    /* renamed from: e */
    private C0196s m3903e(boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0196s c0196s = new C0196s();
        c0196s.unitsMax = gameEngine.f5820bB;
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m485a[i];
            if (unit.team == this) {
                c0196s.m3872a(unit);
                if (z) {
                    unit.f1521bP = true;
                }
            }
        }
        if (c0196s.unitsMax > gameEngine.f5821bC) {
            c0196s.unitsMax = gameEngine.f5821bC;
        }
        return c0196s;
    }

    /* renamed from: d */
    public void m3908d(boolean z) {
        if (!z && !this.f1298P) {
            return;
        }
        this.f1299Q = m3903e(true);
        this.f1298P = false;
        if (this.f1297O < this.f1299Q.f1374b) {
            this.f1297O = this.f1299Q.f1374b;
        }
        if (!this.f1325l && this.f1299Q.f1380m) {
            this.f1325l = true;
        }
        if (!this.f1324k && m3883p() > 0) {
            this.f1324k = true;
        }
        mo3974N();
    }

    /* renamed from: a */
    public int m3959a(C0411a c0411a) {
        return 0 - ((int) this.f1299Q.f1386l.m3310a(c0411a));
    }

    /* renamed from: b */
    public int m3939b(C0411a c0411a) {
        int i;
        if (c0411a == C0411a.f2600A) {
            i = this.f1299Q.incomeRate;
        } else {
            i = (int) this.f1299Q.customIncomeRate.m3310a(c0411a);
        }
        int m3310a = i + ((int) this.f1299Q.f1385k.m3310a(c0411a));
        GameEngine.getInstance();
        boolean z = false;
        if (c0411a == C0411a.f2600A) {
            z = true;
        }
        if (z) {
            m3310a = (int) (m3310a * m3874y());
        }
        return m3310a;
    }

    /* renamed from: r */
    public int m3881r() {
        return this.f1299Q.f1374b;
    }

    /* renamed from: s */
    public int m3880s() {
        return this.f1299Q.unitsMax;
    }

    /* renamed from: t */
    public String ingame_getNetPing() {
        int m3877v = m3877v();
        if (m3877v == -99) {
            return VariableScope.nullOrMissingString;
        }
        if (this.f1333t) {
            return VariableScope.nullOrMissingString;
        }
        if (m3877v == -2 || m3877v == -1) {
            return "(disconnected)";
        }
        return "(" + m3877v + ")";
    }

    /* renamed from: u */
    public String getHostStatus() {
        int m3877v = m3877v();
        if (m3877v == -99) {
            return "HOST";
        }
        if (this.f1333t) {
            return "-";
        }
        if (m3877v == -1) {
            return "N/A";
        }
        if (m3877v == -2) {
            return "-";
        }
        if (m3884o()) {
            return m3877v + " (HOST)";
        }
        return VariableScope.nullOrMissingString + m3877v;
    }

    /* renamed from: v */
    public int m3877v() {
        if (this.nowTime_ms == -1) {
            return -2;
        }
        if (this.nowTime_ms < System.currentTimeMillis() - 5000) {
            return -1;
        }
        return this.f1302T;
    }

    /* renamed from: w */
    public boolean m3876w() {
        if (this.nowTime_ms != -1 && this.nowTime_ms < System.currentTimeMillis() - 15000) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void mo3864a(float f) {
        this.f1316ak += f;
        if (this.f1316ak > 90.0f) {
            this.f1316ak = 0.0f;
            this.f1315aj.m3323a();
        }
    }

    /* renamed from: x */
    public final int m3875x() {
        if (this.aiDifficultyLocked) {
            return this.f1334u;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if ((gameEngine.networkEngine.networked || gameEngine.replayEngine.m2303g()) && !gameEngine.networkEngine.f5126F) {
            if (this.aiDifficultyOverride != null && this.aiDifficultyOverride.intValue() != this.f1334u) {
                log("aiDifficultyOverride:  " + this.aiDifficultyOverride + "!=" + this.f1334u);
            }
            return this.f1334u;
        } else if (this.aiDifficultyOverride != null) {
            return this.aiDifficultyOverride.intValue();
        } else {
            return GameEngine.getInstance().curSettings.aiDifficulty;
        }
    }

    /* renamed from: y */
    public final float m3874y() {
        GameEngine game = GameEngine.getInstance();
        if (game.m919K()) {
            return game.networkEngine.setup.incomeMultiplier;
        }
        return 1.0f;
    }

    /* renamed from: z */
    public final float m3873z() {
        float f;
        if (!this.f1333t) {
            return 1.0f;
        }
        int m3875x = m3875x();
        if (m3875x > 0) {
            f = 1.0f + (m3875x * 0.4f);
        } else {
            f = 1.0f + (m3875x * 0.3f);
        }
        if (m3875x == 3) {
            f += 1.5f;
        }
        if (f < 0.1f) {
            f = 0.1f;
        }
        return f;
    }

    /* renamed from: b */
    public final void m3944b(float f) {
        if (!this.f1333t) {
            m3928c(f);
        } else {
            m3928c(m3873z() * f);
        }
    }

    /* renamed from: c */
    public final void m3928c(float f) {
        checkMoneyMaxLimit(f * m3874y());
    }

    // 1.15版本中允许更高的资金上限了
    /* renamed from: d */
    public final void checkMoneyMaxLimit(float curCredits) {
        this.credits += curCredits;
        if (this.credits > 9.99999999E8d) {
            this.credits = 9.99999999E8d;
        }
    }

    /* renamed from: A */
    public static void m3987A() {
        try {
            m3942b(10, true);
            for (int i = 0; i < teamList.length; i++) {
                teamList[i] = null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static Player findExistingPlayer(String str) {
        if (str == null || str.equals(VariableScope.nullOrMissingString)) {
            GameEngine.log("findExistingPlayer: No clientId id");
            return null;
        }
        for (int clientId = 0; clientId < teamList.length; clientId++) {
            Team team = teamList[clientId];
            if (team != null && str.equals(team.f1294L)) {
                if (team instanceof Player) {
                    return (Player) team;
                }
                GameEngine.log("Player:" + clientId + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    /* renamed from: b */
    public static Player m3931b(String id) {
        if (id == null || id.equals(VariableScope.nullOrMissingString)) {
            GameEngine.log("No id");
            return null;
        }
        for (int i = 0; i < teamList.length; i++) {
            Team team = teamList[i];
            if (team != null && id.equals(team.f1295M)) {
                if (team instanceof Player) {
                    return (Player) team;
                }
                GameEngine.log("Player:" + i + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    // 取房间空闲位置，无位置返回-1
    /* renamed from: B */
    public static int nextFreeSlot() {
        for (int i = 0; i < playerNumMax; i++) {
            if (teamList[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: C */
    public static int m3985C() {
        for (int i = playerNumMax; i < MAX_TEAMS; i++) {
            if (teamList[i] == null) {
                return i;
            }
        }
        for (int i2 = playerNumMax - 1; i2 >= 0; i2--) {
            if (teamList[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: D */
    public void removeSelfFromList() {
        for (int i = 0; i < teamList.length; i++) {
            if (teamList[i] == this) {
                teamList[i] = null;
            }
        }
    }

    public Team() {
        this.teamID = -1;
        this.Tips_Modifier = "Note to modifiers: Changing credits will not allow you to cheat in multiplayer games, but it will only break sync";
        this.credits = 4000.0d;
        this.f1327n = 0.0d;
        this.f1329p = C0579n.m2688a(this);
        this.f1330q = C0579n.m2688a(this);
        this.f1331r = false;
        this.id = -1;
        this.f1320ar = -9999;
        this.f1321as = -9999;
        this.f1290H = new Object();
        this.f1298P = true;
        this.f1299Q = new C0196s();
        this.f1302T = -1;
        this.nowTime_ms = -1L;
        this.f1304V = -1L;
        this.f1305W = -1;
        this.f1308Z = 0;
        this.f1310ab = new UniquePaint();
        this.mapPaint = new UniquePaint();
        this.f1312af = -2;
        this.f1313ah = ValueListSource.f2668d;
        this.f1314ai = new C0421e();
        this.f1315aj = new C0418b();
        this.currentTimeMillis_HcatA = -9999L;
        this.f1333t = this instanceof AI;
    }

    public Team(int id) {
        this(id, true);
    }

    public Team(int id, boolean z) {
        this();
        setTeam(id, z);
    }

    /* renamed from: f */
    public void m3900f(int id) {
        setTeam(id, true);
    }

    /* renamed from: c */
    public void setTeam(int id, boolean z) {
        if (this.teamID != id) {
            if (z) {
                removeSelfFromList();
            }
            this.teamID = id;
            this.allyGroup = id;
            if (z && id != -3) { // -3 spectator
                Team team = teamList[id];
                if (team != null) {
                    team.log("Being replaced");
                }
                teamList[id] = this;
            }
            int m3983E = m3983E();
            this.f1310ab.setColor(m3983E);
            this.mapPaint.setColor(Color.argb(Color.m4734a(m3983E), (int) (Color.m4730b(m3983E) * 0.5f), (int) (Color.m4729c(m3983E) * 0.5f), (int) (Color.m4728d(m3983E) * 0.5f)));
        }
    }

    /* renamed from: a */
    public boolean canBuy(double price) {
        if (this.credits >= price || price == 0.0d) {
            return true;
        }
        return false;
    }

    /* renamed from: g */
    public boolean tryToBuy(int i) {
        if (this.credits + this.f1327n >= i || i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m3925c(Team team) {
        return (team == f1346g || this == f1346g || this.allyGroup == team.allyGroup) ? false : true;
    }

    /* renamed from: d */
    public final boolean m3913d(Team team) {
        if (team == f1346g && this == f1346g) {
            return true;
        }
        return (team == f1346g || this == f1346g || this.allyGroup != team.allyGroup) ? false : true;
    }

    /* renamed from: E */
    public int m3983E() {
        return m3892i(getId());
    }

    /* renamed from: F */
    public static void initColors() {
        GameEngine game = GameEngine.getInstance();
        try { // 先尝试读取客户端设置中的颜色，无效則初始化
            setColorHex(game.curSettings.teamColors); // 先尝试读取客户端设置中的颜色，无效則初始化
        } catch (IllegalArgumentException e) {
            GameEngine.LogThrowable("initColors: Failed to read setting: '" + game.curSettings.teamColors + "': " + e.getMessage(), (Throwable) e);
            setColorHex("#00ff00,#d02013,#0463f3,#ffff40,#00ffff,#d0f8f7,#000000,#ff00ea,#ff7f18,#9368c4");
        }
        try {
            setColorName(game.curSettings.teamColorsNames);
        } catch (IllegalArgumentException e2) {
            GameEngine.LogThrowable("initColors: Failed to read setting: '" + game.curSettings.teamColorsNames + "': " + e2.getMessage(), (Throwable) e2);
            setColorName("GREEN,RED,BLUE,YELLOW,CYAN,WHITE,BLACK,PINK,ORANGE,PURPLE");
        }
    }

    /* renamed from: d */
    private static void setColorHex(String str) {
        String[] split = str.split(",");
        if (split.length != 10) { // Modifier: Note!
            throw new IllegalArgumentException("Expected 10 hex colors"); // 致修改者：注意此处
        }
        for (int i = 0; i < 10; i++) {
            teamColorHexArr[i] = Color.m4731a(split[i]);
        }
    }

    /* renamed from: e */
    private static void setColorName(String str) {
        String[] split = str.split(",");
        if (split.length != 10) {
            throw new IllegalArgumentException("Expected 10 team color names");
        }
        for (int i = 0; i < 10; i++) {
            teamColorNameArr[i] = split[i];
        }
    }

    /* renamed from: G */
    public int m3981G() {
        if (this.allyGroup == -3) {
            return m3892i(-3);
        }
        return m3894h(this.teamID);
    }

    /* renamed from: h */
    public static int m3894h(int i) {
        if (i >= playerNumMax) {
            return m3892i(-3);
        }
        return m3892i(i % 2);
    }

    /* renamed from: i */
    public static int m3892i(int id) {
        if (id >= 0 && id < 10) { // Modifier: Note!
            return teamColorHexArr[id];
        }
        if (id == -3) {
            return Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 90, 90, 90);
        }
        return -7829368;
    }

    /* renamed from: H */
    public String m3980H() {
        if (this.teamID == -1 || this.teamID == -2) {
            return "GRAY";
        }
        return m3890j(getId());
    }

    // 超过10的队伍颜色都是灰色，可以修改颜色数组
    /* renamed from: j */
    public static String m3890j(int i) {
        if (i >= 0 && i < 10) { // Modifier: Note!
            return teamColorNameArr[i];
        }
        return "GRAY";
    }

    /* renamed from: a */
    public static BitmapOrTexture[] createBitmapForTeam(BitmapOrTexture bitmap) {
        return m3951a(bitmap, HueColor.pureGreen, false);
    }

    /* renamed from: a */
    public static BitmapOrTexture[] m3951a(BitmapOrTexture bitmap, HueColor hueColor, boolean z) {
        if (!z || bitmap.mo370z()) {
            return m3933b(bitmap, hueColor);
        }
        return m3952a(bitmap, hueColor);
    }

    /* renamed from: a */
    public static BitmapOrTexture[] m3952a(BitmapOrTexture bitmapOrTexture, HueColor hueColor) {
        BitmapOrTexture[] bitmapOrTextureArr = new BitmapOrTexture[10]; // Modifier: Note!
        if ((GameEngine.isDedicatedServer && !GameEngine.isPC_Device) || hueColor == HueColor.disabled) {
            for (int i = 0; i < bitmapOrTextureArr.length; i++) {
                bitmapOrTextureArr[i] = bitmapOrTexture;
            }
            return bitmapOrTextureArr;
        }
        BitmapOrTexture[] m1018a = bitmapOrTexture.m1018a(hueColor);
        if (m1018a != null) {
            return m1018a;
        }
        C0651bl c0651bl = GameEngine.getInstance().f5865cd;
        c0651bl.m2275a(Enum_draw.f4171D);
        for (int i2 = 0; i2 < bitmapOrTextureArr.length; i2++) {
            int m3892i = m3892i(i2);
            if (i2 == 0) {
                bitmapOrTextureArr[i2] = bitmapOrTexture;
            } else {
                bitmapOrTextureArr[i2] = new C0842h(bitmapOrTexture, m3892i, hueColor, i2);
            }
        }
        c0651bl.m2270b(Enum_draw.f4171D);
        bitmapOrTexture.m1017a(hueColor, bitmapOrTextureArr);
        return bitmapOrTextureArr;
    }

    // 若修改了颜色数组务必修改此函数，否则会数组越界无法启动
    /* renamed from: b */
    public static BitmapOrTexture[] m3933b(BitmapOrTexture bitmapOrTexture, HueColor hueColor) {
        BitmapOrTexture[] bitmapOrTextureArr = new BitmapOrTexture[10];
        if ((GameEngine.isDedicatedServer && !GameEngine.isPC_Device) || hueColor == HueColor.disabled || bitmapOrTexture.mo370z()) {
            for (int i = 0; i < bitmapOrTextureArr.length; i++) {
                bitmapOrTextureArr[i] = bitmapOrTexture;
            }
            return bitmapOrTextureArr;
        }
        BitmapOrTexture[] m1018a = bitmapOrTexture.m1018a(hueColor);
        if (m1018a != null) {
            return m1018a;
        }
        C0651bl c0651bl = GameEngine.getInstance().f5865cd;
        c0651bl.m2275a(Enum_draw.f4171D);
        int[] iArr = new int[10];
        int[] iArr2 = new int[10];
        for (int i2 = 0; i2 < iArr.length; i2++) {
            iArr[i2] = m3892i(i2);
            iArr2[i2] = i2;
        }
        for (int i3 = 0; i3 < bitmapOrTextureArr.length; i3++) {
            if (i3 != 0) {
                bitmapOrTextureArr[i3] = bitmapOrTexture.copy();
                bitmapOrTextureArr[i3].m1016a("color(" + i3 + "):" + bitmapOrTexture.mo64a());
                bitmapOrTextureArr[i3].mo52i();
            }
        }
        bitmapOrTexture.mo52i();
        if (hueColor == HueColor.hueAdd) {
            m3932b(bitmapOrTexture, bitmapOrTextureArr, iArr);
        } else if (hueColor == HueColor.hueShift) {
            m3949a(bitmapOrTexture, bitmapOrTextureArr, iArr, iArr2);
        } else {
            m3950a(bitmapOrTexture, bitmapOrTextureArr, iArr);
        }
        for (int i4 = 0; i4 < bitmapOrTextureArr.length; i4++) {
            if (bitmapOrTextureArr[i4] != null) {
                bitmapOrTextureArr[i4].mo48o();
                bitmapOrTextureArr[i4].mo45r();
            }
        }
        bitmapOrTexture.mo46q();
        bitmapOrTextureArr[0] = bitmapOrTexture;
        c0651bl.m2270b(Enum_draw.f4171D);
        bitmapOrTexture.m1017a(hueColor, bitmapOrTextureArr);
        return bitmapOrTextureArr;
    }

    // 改了颜色数组要调用此函数 务必先修改上面函数数组，否则会数组越界无法启动
    /* renamed from: a */
    public static void m3950a(BitmapOrTexture bitmapOrTexture, BitmapOrTexture[] bitmapOrTextureArr, int[] iArr) {
        int m964b;
        int width = bitmapOrTexture.getWidth();
        int height = bitmapOrTexture.getHeight();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = Color.m4730b(iArr[i]);
            iArr3[i] = Color.m4729c(iArr[i]);
            iArr4[i] = Color.m4728d(iArr[i]);
        }
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                int mo63a = bitmapOrTexture.mo63a(i3, i2);
                int m972a = C0853s.m972a(mo63a);
                if (m972a == 0) {
                    if (mo63a != 0) {
                        for (int i4 = 0; i4 < bitmapOrTextureArr.length; i4++) {
                            if (bitmapOrTextureArr[i4] != null) {
                                bitmapOrTextureArr[i4].mo62a(i3, i2, 0);
                            }
                        }
                    }
                } else {
                    int m963c = C0853s.m963c(mo63a);
                    if (m963c > 0 && (m964b = C0853s.m964b(mo63a)) == C0853s.m962d(mo63a)) {
                        if (m964b == 0) {
                            for (int i5 = 0; i5 < bitmapOrTextureArr.length; i5++) {
                                if (bitmapOrTextureArr[i5] != null) {
                                    bitmapOrTextureArr[i5].mo62a(i3, i2, Color.argb(m972a, (iArr2[i5] * m963c) >> 8, (iArr3[i5] * m963c) >> 8, (iArr4[i5] * m963c) >> 8));
                                }
                            }
                        } else if (m963c != m964b) {
                            float f = (m963c * 0.003921569f) - (m964b * 0.003921569f);
                            for (int i6 = 0; i6 < bitmapOrTextureArr.length; i6++) {
                                if (bitmapOrTextureArr[i6] != null) {
                                    bitmapOrTextureArr[i6].mo62a(i3, i2, Color.argb(m972a, CommonUtils.m1687b((int) (m964b + (iArr2[i6] * f)), 0, 255), CommonUtils.m1687b((int) (m964b + (iArr3[i6] * f)), 0, 255), CommonUtils.m1687b((int) (m964b + (iArr4[i6] * f)), 0, 255)));
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3949a(BitmapOrTexture bitmapOrTexture, BitmapOrTexture[] bitmapOrTextureArr, int[] iArr, int[] iArr2) {
        int m4728d;
        int width = bitmapOrTexture.getWidth();
        int height = bitmapOrTexture.getHeight();
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        int[] iArr5 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr3[i] = Color.m4730b(iArr[i]);
            iArr4[i] = Color.m4729c(iArr[i]);
            iArr5[i] = Color.m4728d(iArr[i]);
        }
        for (int i2 = 0; i2 < height; i2++) {
            for (int i3 = 0; i3 < width; i3++) {
                int mo63a = bitmapOrTexture.mo63a(i3, i2);
                int m4734a = Color.m4734a(mo63a);
                if (m4734a == 0) {
                    if (Color.m4730b(mo63a) > 0 || Color.m4729c(mo63a) > 0 || Color.m4728d(mo63a) > 0) {
                        for (int i4 = 0; i4 < bitmapOrTextureArr.length; i4++) {
                            if (bitmapOrTextureArr[i4] != null) {
                                bitmapOrTextureArr[i4].mo62a(i3, i2, Color.argb(0, 0, 0, 0));
                            }
                        }
                    }
                } else {
                    int m4729c = Color.m4729c(mo63a);
                    int m4730b = Color.m4730b(mo63a);
                    float mini = CommonUtils.mini(CommonUtils.mini(m4730b, m4729c), Color.m4728d(mo63a));
                    float maxf = CommonUtils.maxf(CommonUtils.maxf(CommonUtils.absi(m4730b - m4729c), CommonUtils.absi(m4729c - m4728d)), CommonUtils.absi(m4728d - m4730b));
                    if (maxf > 15.0f) {
                        for (int i5 = 0; i5 < bitmapOrTextureArr.length; i5++) {
                            if (bitmapOrTextureArr[i5] != null) {
                                float f = maxf / 255.0f;
                                bitmapOrTextureArr[i5].mo62a(i3, i2, Color.argb(m4734a, CommonUtils.m1687b((int) (mini + (iArr3[i5] * f)), 0, 255), CommonUtils.m1687b((int) (mini + (iArr4[i5] * f)), 0, 255), CommonUtils.m1687b((int) (mini + (iArr5[i5] * f)), 0, 255)));
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m3932b(BitmapOrTexture bitmapOrTexture, BitmapOrTexture[] bitmapOrTextureArr, int[] iArr) {
        int width = bitmapOrTexture.getWidth();
        int height = bitmapOrTexture.getHeight();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = Color.m4730b(iArr[i]);
            iArr3[i] = Color.m4729c(iArr[i]);
            iArr4[i] = Color.m4728d(iArr[i]);
        }
        for (int i2 = 0; i2 < width; i2++) {
            for (int i3 = 0; i3 < height; i3++) {
                int mo63a = bitmapOrTexture.mo63a(i2, i3);
                int m4734a = Color.m4734a(mo63a);
                if (m4734a > 0) {
                    int m4730b = Color.m4730b(mo63a);
                    int m4729c = Color.m4729c(mo63a);
                    int m4728d = Color.m4728d(mo63a);
                    for (int i4 = 0; i4 < bitmapOrTextureArr.length; i4++) {
                        int i5 = (int) (m4730b + (iArr2[i4] * 0.15f));
                        int i6 = (int) (m4729c + (iArr3[i4] * 0.15f));
                        int i7 = (int) (m4728d + (iArr4[i4] * 0.15f));
                        int m1687b = CommonUtils.m1687b(i5, 0, 255);
                        int m1687b2 = CommonUtils.m1687b(i6, 0, 255);
                        int m1687b3 = CommonUtils.m1687b(i7, 0, 255);
                        if (bitmapOrTextureArr[i4] != null) {
                            bitmapOrTextureArr[i4].mo62a(i2, i3, Color.argb(m4734a, m1687b, m1687b2, m1687b3));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: k */
    public static Team getTeam(int TeamIndex) {
        if (TeamIndex == -1) {
            return f1346g;
        }
        if (TeamIndex == -2) {
            return f1345f;
        }
        if (TeamIndex >= MAX_TEAMS) {
            GameEngine.LogTrace("team index too high: " + TeamIndex);
            return null;
        } else if (TeamIndex < 0) {
            GameEngine.LogTrace("team index too low: " + TeamIndex);
            return null;
        } else {
            return teamList[TeamIndex];
        }
    }

    /* renamed from: e */
    public void m3906e(float f) {
        GameEngine game = GameEngine.getInstance();
        if (this.f1312af > 0) {
            this.f1312af--;
            return;
        }
        if (this.f1312af == -2) {
            this.f1312af = this.teamID;
        } else {
            this.f1312af = 10;
        }
        if (!this.f1286D && !game.replayEngine.isPlaying()) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = game.networkEngine.setup.sharedControl;
            boolean z5 = false;
            Unit[] m485a = Unit.fastUnitList.m485a();
            int size = Unit.fastUnitList.size();
            for (int i = 0; i < size; i++) {
                Unit unit = m485a[i];
                if (unit.team == this) {
                    if (!unit.mo3187cQ()) {
                        z = true;
                        if (!this.f1285C && (unit.mo2879bI() || unit.mo2560aj())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        z5 = true;
                    }
                } else if (z4 && unit.team != null && unit.team.m3913d(this) && !unit.mo3187cQ()) {
                    z3 = true;
                }
            }
            if (!z && !z3) {
                boolean z6 = false;
                if (z5 && game.frameNumber < 100 && game.editorMode) {
                    z6 = true;
                }
                this.f1286D = true;
                m3966a();
                Iterator it = Unit.fastUnitList.iterator();
                while (it.hasNext()) {
                    Unit unit2 = (Unit) it.next();
                    if (unit2.team == this && !unit2.mo1773u()) {
                        if (z6 && !unit2.dead && unit2.mo3187cQ()) {
                            UnitType unitType = unit2.getUnitType();
                            String str = unit2.m3740cz() + " Warning: This unit got ignored in defeated check and now being removed";
                            if ((unitType instanceof CustomUnitMetadata) && ((CustomUnitMetadata) unitType).f2758aI) {
                                str = str + " (Likely due to canNotBeDirectlyAttacked:true)";
                            }
                            NetworkEngine.m1468a((String) null, str);
                        }
                        unit2.m3744ch();
                    }
                }
                game.networkEngine.m1375i(this);
            }
            if (!z2 && !this.f1285C && !this.f1286D) {
                this.f1285C = true;
                game.networkEngine.m1381h(this);
            }
        }
    }

    /* renamed from: a */
    public void mo3956a(OrderableUnit orderableUnit) {
    }

    /* renamed from: b */
    public static void m3936b(OrderableUnit orderableUnit) {
        for (int i = 0; i < playerNumMax; i++) {
            Team team = teamList[i];
            if (team != null) {
                team.mo3956a(orderableUnit);
            }
        }
    }

    /* renamed from: a */
    public static void m3960a(Unit unit) {
        if (unit.team != null && unit.f1521bP && unit.f1517bD) {
            Team team = unit.team;
            unit.f1521bP = false;
            team.f1299Q.m3869b(unit);
            unit.mo3164df();
        }
    }

    /* renamed from: b */
    public static void m3940b(Unit unit) {
        m3960a(unit);
    }

    /* renamed from: c */
    public static void m3924c(Unit unit) {
        if (unit.team != null && !unit.f1521bP && unit.f1517bD && !unit.dead) {
            unit.f1521bP = true;
            Team team = unit.team;
            team.f1299Q.m3872a(unit);
            unit.mo3165de();
            if (!team.f1325l && team.f1299Q.f1380m) {
                team.f1325l = true;
            }
            if (!team.f1324k) {
                team.f1324k = true;
            }
            team.mo3974N();
        }
    }

    /* renamed from: I */
    public static void m3979I() {
        f1346g.f1298P = true;
        f1345f.f1298P = true;
        Iterator it = m3929c().iterator();
        while (it.hasNext()) {
            ((Team) it.next()).f1298P = true;
        }
    }

    /* renamed from: J */
    public static void m3978J() {
        if (GameEngine.getInstance().m921I()) {
            GameEngine.PrintLOG("Skipping updateAllCachesFromChangedMetadata due to desync risk");
            return;
        }
        for (int i = 0; i < playerNumMax; i++) {
            Team team = teamList[i];
            if (team != null) {
                team.f1298P = true;
            }
        }
    }

    /* renamed from: f */
    public static void m3901f(float f) {
        int votedPlayerNum;
        GameEngine gameEngine = GameEngine.getInstance();
        f1346g.mo3864a(f);
        f1345f.mo3864a(f);
        for (int i = 0; i < playerNumMax; i++) {
            Team team = teamList[i];
            if (team != null) {
                team.mo3864a(f);
                team.m3906e(f);
                if (!team.f1319aq && (votedPlayerNum = getVotedPlayerNum(team.allyGroup)) > 0) {
                    if (votedPlayerNum >= getVotePlayerMax(team.allyGroup)) {
                        m3914d(team.allyGroup);
                        m3887l();
                    } else {
                        m3905e(team.allyGroup);
                    }
                }
                if (team.f1284B) {
                    if (team.f1321as < 0) {
                        team.f1321as = gameEngine.f5845by;
                    }
                    if (!team.f1286D) {
                        int game = 0;
                        Iterator it = Unit.fastUnitList.iterator();
                        while (it.hasNext()) {
                            Unit unit = (Unit) it.next();
                            if (unit.team == team && !unit.mo1773u()) {
                                boolean z = false;
                                int i2 = 1;
                                if (C0955y.m462a(team.f1321as, 16000)) {
                                    z = true;
                                    i2 = 50;
                                } else if (C0955y.m462a(team.f1321as, 6000)) {
                                    z = CommonUtils.m1723a(unit, 0, 100) > 90;
                                    i2 = 20;
                                } else if (C0955y.m462a(team.f1321as, 2000)) {
                                    z = CommonUtils.m1723a(unit, 0, 100) > 98;
                                    i2 = 2;
                                }
                                if (unit instanceof CommandCenter) {
                                    z = true;
                                }
                                if (z) {
                                    unit.hp = -1.0f;
                                    game++;
                                    if (game > i2) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (gameEngine.m918L() && gameEngine.curSettings.aiDifficulty != aiDifficulty) {
            gameEngine.networkEngine.updateNamesOfAI();
            aiDifficulty = gameEngine.curSettings.aiDifficulty;
        }
    }

    /* renamed from: g */
    public static void m3898g(float f) {
        f1346g.m3908d(false);
        f1345f.m3908d(false);
        for (int i = 0; i < playerNumMax; i++) {
            Team team = teamList[i];
            if (team != null) {
                team.m3908d(false);
            }
        }
    }

    /* renamed from: K */
    public static void m3977K() {
        f1346g.m3908d(false);
        for (int i = 0; i < playerNumMax; i++) {
            Team team = teamList[i];
            if (team != null && !team.m3945b() && !team.f1286D && !team.f1285C && !team.f1284B) {
                GameEngine.getInstance().networkEngine.m1387g(team);
            }
        }
    }

    /* renamed from: h */
    public static void m3895h(float f) {
        for (int i = 0; i < playerNumMax; i++) {
            Team team = teamList[i];
            if (team != null && (team instanceof AI)) {
                ((AI) team).m4321i(f);
            }
        }
    }

    /* renamed from: L */
    public int getId() {
        if (this.id == -1) {
            return m3975M();
        }
        return this.id;
    }

    /* renamed from: M */
    public int m3975M() {
        Team team;
        if (this.teamID == -1 || this.teamID == -2) {
            return 5;
        }
        int i = this.teamID;
        if (i >= 10) {
            i %= 10;
        }
        if (playerNumMax > 10 && (team = GameEngine.getInstance().networkEngine.f5111z) != null && team != this && team.getId() == i) {
            if (i != 5) {
                i = 5;
            } else {
                i = 4;
            }
        }
        return i;
    }

    /* renamed from: N */
    public void mo3974N() {
    }

    /* renamed from: a */
    public void m3957a(ValueList valueList) {
        this.f1313ah = valueList;
    }

    /* renamed from: O */
    public ValueList m3973O() {
        return this.f1313ah;
    }

    /* renamed from: b */
    public void m3937b(ValueList valueList) {
        ValueList m3973O = m3973O();
        if (m3973O == null || m3973O.m3238b() == 0) {
            m3957a(valueList);
        } else if (ValueListSource.m3243b(m3973O, valueList)) {
        } else {
            C0432i c0432i = new C0432i(m3973O);
            if (c0432i.m3235a(valueList)) {
                m3957a(c0432i.m3237a());
            }
        }
    }

    /* renamed from: c */
    public void m3921c(ValueList valueList) {
        ValueList m3973O = m3973O();
        if (m3973O == null || m3973O.m3238b() == 0 || !ValueListSource.m3248a(valueList, m3973O)) {
            return;
        }
        C0432i c0432i = new C0432i(m3973O);
        if (c0432i.m3234b(valueList)) {
            m3957a(c0432i.m3237a());
        }
    }

    /* renamed from: P */
    public C0421e m3972P() {
        return this.f1314ai;
    }

    /* renamed from: c */
    public double m3923c(C0411a c0411a) {
        return this.f1314ai.m3310a(c0411a);
    }

    /* renamed from: a */
    public boolean m3961a(TeamCamp type, Team team) {
        if (type == TeamCamp.f1365a) {
            return team == this;
        } else if (type == TeamCamp.f1370f) {
            return true;
        } else {
            if (type == TeamCamp.f1366b) {
                return m3913d(team);
            }
            if (type == TeamCamp.f1367c) {
                return team != this && m3913d(team);
            } else if (type == TeamCamp.f1368d) {
                return m3925c(team);
            } else {
                if (type != TeamCamp.f1369e) {
                    throw new RuntimeException("Unsupported type: " + type);
                }
                return team == f1346g;
            }
        }
    }

    /* renamed from: d */
    public void mo3912d(Unit unit) {
    }

    /* renamed from: Q */
    public void m3971Q() {
        GameEngine.PrintLOG("debugUnitCountByType for team:" + this.teamID);
        ObjectVector objectVector = new ObjectVector();
        Unit[] m485a = Unit.fastUnitList.m485a();
        int size = Unit.fastUnitList.size();
        for (int i = 0; i < size; i++) {
            Unit unit = m485a[i];
            if (unit.team == this && !unit.dead) {
                UnitType unitType = unit.unitType;
                boolean z = false;
                Iterator it = objectVector.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0195r c0195r = (C0195r) it.next();
                    if (c0195r.f1372a == unitType) {
                        c0195r.f1373b++;
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    C0195r c0195r2 = new C0195r();
                    c0195r2.f1372a = unitType;
                    c0195r2.f1373b = 1;
                    objectVector.add(c0195r2);
                }
            }
        }
        GameEngine.PrintLOG("--- Units ---");
        int i2 = 0;
        Iterator it2 = objectVector.iterator();
        while (it2.hasNext()) {
            C0195r c0195r3 = (C0195r) it2.next();
            if (!c0195r3.f1372a.mo3083k()) {
                GameEngine.PrintLOG(c0195r3.f1372a.mo3087i() + " - count:" + c0195r3.f1373b);
                i2 += c0195r3.f1373b;
            }
        }
        GameEngine.PrintLOG("total:" + i2);
        GameEngine.PrintLOG("--- Buildings/Ignored in count ---");
        int i3 = 0;
        Iterator it3 = objectVector.iterator();
        while (it3.hasNext()) {
            C0195r c0195r4 = (C0195r) it3.next();
            if (c0195r4.f1372a.mo3083k()) {
                GameEngine.PrintLOG(c0195r4.f1372a.mo3087i() + " - count:" + c0195r4.f1373b);
                i3 += c0195r4.f1373b;
            }
        }
        GameEngine.PrintLOG("total:" + i3);
    }

    /* renamed from: c */
    public void log(String str) {
        GameEngine.PrintLOG("Team(id: " + this.teamID + ", name:" + this.playerName + "):" + str);
    }

    /* renamed from: b */
    public int m3938b(ValueListSource valueListSource, boolean z, boolean z2) {
        int i = 0;
        if (this == f1346g) {
            return 0;
        }
        Team[] teamArr = teamList;
        int i2 = playerNumMax;
        for (int i3 = 0; i3 < i2; i3++) {
            Team team = teamArr[i3];
            if (team != null && this != team && this.allyGroup != team.allyGroup) {
                if (valueListSource == null) {
                    i += team.getUnitCounts(z, z2);
                } else {
                    i += team.m3958a(valueListSource, z, z2);
                }
            }
        }
        return i;
    }

    /* renamed from: c */
    public int m3922c(ValueListSource valueListSource, boolean z, boolean z2) {
        int i = 0;
        Team[] teamArr = teamList;
        int i2 = playerNumMax;
        for (int i3 = 0; i3 < i2; i3++) {
            Team team = teamArr[i3];
            if (team != null && this != team && m3913d(team)) {
                if (valueListSource == null) {
                    i += team.getUnitCounts(z, z2);
                } else {
                    i += team.m3958a(valueListSource, z, z2);
                }
            }
        }
        return i;
    }

    /* renamed from: R */
    public static void m3970R() {
        f1346g.m3969S();
        f1345f.m3969S();
    }

    /* renamed from: S */
    public void m3969S() {
        this.f1324k = false;
        this.f1325l = false;
        this.credits = 4000.0d;
        this.f1327n = 0.0d;
        this.f1319aq = false;
        this.f1320ar = -9999;
        this.f1284B = false;
        this.f1321as = -9999;
        this.f1285C = false;
        this.f1286D = false;
        this.f1287E = false;
        this.f1288F = false;
        this.f1289G = false;
        this.f1315aj.m3323a();
        this.f1316ak = 0.0f;
        this.fails = 0;
        this.f1297O = 0;
        this.f1298P = true;
        this.f1299Q = new C0196s();
        this.f1313ah = ValueListSource.f2668d;
        this.f1314ai = new C0421e();
    }

    /* renamed from: T */
    public double m3968T() {
        long currentTimeMillis = System.currentTimeMillis();
        if (CommonUtils.absf((float) (this.currentTimeMillis_HcatA - currentTimeMillis)) > 166.66666f) {
            this.currentTimeMillis_HcatA = currentTimeMillis;
            this.f1318ao = this.credits;
        }
        return this.f1318ao;
    }

    /* renamed from: U */
    public C0421e m3967U() {
        return m3972P();
    }
}