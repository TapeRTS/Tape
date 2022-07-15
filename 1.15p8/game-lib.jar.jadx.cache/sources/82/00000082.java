package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.C0179c;
import com.corrodinggames.rts.game.Player;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.ai.AI;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.SandBoxAct;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0384ba;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadataFactory;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.effect.Emitter;
import com.corrodinggames.rts.gameFramework.file.C0670a;
import com.corrodinggames.rts.gameFramework.mission.MissionEngine;
import com.corrodinggames.rts.gameFramework.network.C0781at;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0936j;
import com.corrodinggames.rts.gameFramework.utility.C0942o;
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
public class GameSaver {

    /* renamed from: a */
    public static boolean f6374a = false;

    /* renamed from: b */
    final boolean f6375b = false;

    /* renamed from: c */
    int f6376c = -9999;

    /* renamed from: d */
    int f6377d = -9999;

    public GameSaver() {
        if (!GameEngine.isReleaseVersion) {
        }
    }

    /* renamed from: a */
    public File m410a(String str, boolean z) {
        return m411a(str, "saves/", z);
    }

    /* renamed from: a */
    public static File m411a(String str, String str2, boolean z) {
        return C0670a.m2175a(str, str2, z);
    }

    /* renamed from: b */
    public void m406b(String str, boolean z) {
        File m410a;
        File m410a2;
        GameEngine game = GameEngine.getInstance();
        String str2 = str;
        if (str2 != null && !str2.endsWith(".rwsave")) {
            str2 = str2 + ".rwsave";
        }
        File file = null;
        boolean z2 = false;
        try {
            m410a = m410a(str2 + ".tmp", true);
            if (m410a.exists()) {
                m410a = m410a(str2 + ".tmp2", true);
            }
            m410a2 = m410a(str2, true);
            GameEngine.PrintLOG("Saving game to: " + m410a2.getAbsolutePath());
            OutputStream m2178a = C0670a.m2178a(m410a, false);
            BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(m2178a);
            if (!f6374a) {
                DataOutputStream dataOutputStream = new DataOutputStream(bufferedOutputStream);
                try {
                    m415a(new OutputNetStream(dataOutputStream));
                    dataOutputStream.close();
                    bufferedOutputStream.close();
                    m2178a.close();
                } catch (Throwable th) {
                    dataOutputStream.close();
                    bufferedOutputStream.close();
                    m2178a.close();
                    throw th;
                }
            } else {
                PrintStream printStream = new PrintStream(bufferedOutputStream);
                try {
                    m415a(new C0781at(printStream));
                    printStream.close();
                    bufferedOutputStream.close();
                    m2178a.close();
                    GameEngine.m805n("DEBUG plain text save created");
                } catch (Throwable th2) {
                    printStream.close();
                    bufferedOutputStream.close();
                    m2178a.close();
                    throw th2;
                }
            }
            if (z && GameEngine.isNonDedicatedServer() && C0670a.m2158h(m410a2.getAbsolutePath())) {
                GameEngine.PrintLOG("Autosave file already exists: " + m410a2.getAbsolutePath());
                if (!C0670a.m2171b(m410a2)) {
                    GameEngine.PrintLOG("Old autosave failed to delete");
                }
            }
            GameEngine.PrintLOG("Finished writing save, renaming to final filename");
        } catch (Exception e) {
            if (z) {
                GameEngine.PrintLOG("Auto save failed: " + e.getMessage());
                return;
            }
            e.printStackTrace();
            game.alert("Error saving game to SD card, please check permissions, disk space, etc. (" + CommonUtils.m1681b(e) + ")", 1);
            if (0 != 0 && C0670a.m2158h(file.getAbsolutePath())) {
                GameEngine.PrintLOG("saveGame: Removing temp save file after crash");
                C0670a.m2171b((File) null);
            }
        } catch (OutOfMemoryError e2) {
            e2.printStackTrace();
            game.alert("Error. Run out of memory error while saving game to SD card.", 1);
            if (0 != 0 && C0670a.m2158h(file.getAbsolutePath())) {
                GameEngine.PrintLOG("saveGame: Removing temp save file after crash");
                C0670a.m2171b((File) null);
            }
        }
        if (!C0670a.m2179a(m410a, m410a2)) {
            GameEngine.PrintLOG("Failed to rename to final file");
            throw new IOException("Failed to rename to final file. Check file permissions of storage.");
        }
        C0670a.m2167c(m410a2);
        z2 = true;
        if (z2) {
            if (z) {
                game.interfaceEngine.f4737f.m1955a("Auto Saved", 1000);
            } else {
                game.interfaceEngine.messageInterface.m1810a(null, "Game saved");
            }
        }
    }

    /* renamed from: a */
    public void m415a(OutputNetStream outputNetStream) {
        GameEngine game = GameEngine.getInstance();
        GameEngine.log("GameSaver", "saveCurrentMap took:" + (System.currentTimeMillis() - System.currentTimeMillis()));
        long currentTimeMillis = System.currentTimeMillis();
        try {
            outputNetStream.writeString("rustedWarfareSave");
            outputNetStream.writeInt(game.gameVersionInternal(true));
            outputNetStream.writeInt(94);
            outputNetStream.writeBoolean(game.f5936at);
            outputNetStream.mo1258a("saveCompression", true);
            outputNetStream.mo1291e("customUnitsBlock");
            CustomUnitMetadata.m3121a(outputNetStream);
            outputNetStream.endBlock("customUnitsBlock");
            outputNetStream.mo1291e("gameSetup");
            boolean z = game.networkEngine.networked || game.networkEngine.f5126F;
            outputNetStream.writeBoolean(game.networkEngine.networked);
            outputNetStream.writeBoolean(game.networkEngine.f5126F);
            outputNetStream.writeBoolean(z);
            if (z) {
                game.networkEngine.m1484a(outputNetStream);
            }
            outputNetStream.endBlock("gameSetup");
            outputNetStream.writeString(game.f5892dl);
            boolean z2 = game.inputNetStream != null;
            outputNetStream.writeBoolean(z2);
            if (z2) {
                GameEngine.PrintLOG("Writing remote map steam into save");
                outputNetStream.m1324a(game.inputNetStream);
            }
            outputNetStream.writeInt(game.f5845by);
            outputNetStream.writeFloat(game.f5882cx + game.f5854cH);
            outputNetStream.writeFloat(game.f5883cy + game.f5855cI);
            outputNetStream.writeFloat(game.f5962cU);
            outputNetStream.writeInt(game.groupController.f3888a);
            outputNetStream.writeInt(0);
            outputNetStream.mo1292e();
            game.map.m4150a(outputNetStream);
            outputNetStream.writeBoolean(game.editorMode);
            outputNetStream.writeBoolean(game.map.f818D);
            outputNetStream.writeBoolean(game.map.f819E);
            outputNetStream.writeBoolean(game.map.f820F);
            outputNetStream.writeBoolean(game.f5866ce != null);
            if (game.f5866ce != null) {
                game.f5866ce.writeOut(outputNetStream);
            }
            outputNetStream.mo1292e();
            int i = -1;
            if (game.playerTeam != null) {
                i = game.playerTeam.teamID;
            }
            outputNetStream.writeInt(i);
            outputNetStream.writeInt(Team.playerNumMax);
            for (int i2 = 0; i2 < Team.playerNumMax; i2++) {
                Team team = Team.getTeam(i2);
                outputNetStream.writeBoolean(team instanceof AI);
                outputNetStream.writeBoolean(team instanceof C0179c);
                outputNetStream.writeBoolean(team != null);
                if (team != null) {
                    team.teamWriteOut(outputNetStream);
                }
            }
            if (!game.interfaceEngine.f4746b) {
            }
            outputNetStream.mo1293d("Section: unit shells");
            outputNetStream.writeInt(GameObject.fastGameObjectList.size());
            Iterator it = GameObject.fastGameObjectList.iterator();
            while (it.hasNext()) {
                GameObject gameObject = (GameObject) it.next();
                if (gameObject == null) {
                    throw new RuntimeException("Found null in fastGameObjectList");
                }
                if (gameObject instanceof Unit) {
                    Unit unit = (Unit) gameObject;
                    if (unit.getUnitType() instanceof UnitType) {
                        outputNetStream.writeByte(1);
                        outputNetStream.writeEnum((Enum) ((UnitType) unit.getUnitType()));
                    } else if (unit.getUnitType() instanceof CustomUnitMetadata) {
                        outputNetStream.writeByte(3);
                        outputNetStream.writeString(((CustomUnitMetadata) unit.getUnitType()).core_name);
                    } else {
                        throw new IOException("Unhandled getUnitType on save:" + unit.getUnitType().getClass().toString());
                    }
                } else {
                    outputNetStream.writeByte(2);
                    if (gameObject instanceof ScorchMark) {
                        outputNetStream.writeByte(1);
                    } else if (gameObject instanceof Projectile) {
                        outputNetStream.writeByte(2);
                    } else if (gameObject instanceof Emitter) {
                        outputNetStream.writeByte(3);
                    } else {
                        String str = null;
                        if (gameObject.getClass() != null) {
                            str = gameObject.getClass().toString();
                        }
                        throw new IOException("Unhandled class on save: " + str);
                    }
                }
                outputNetStream.writeLong(gameObject.GameObjectID);
            }
            outputNetStream.mo1293d("Section: CurrentUnitId");
            outputNetStream.writeLong(game.networkEngine.getUnitId());
            game.groupController.writeOut(outputNetStream);
            game.interfaceEngine.writeOut(outputNetStream);
            game.StatsHandler.m2285a(outputNetStream);
            for (int i3 = 0; i3 < Team.playerNumMax; i3++) {
                Team team2 = Team.getTeam(i3);
                if (team2 != null) {
                    team2.writeOut(outputNetStream);
                }
            }
            outputNetStream.mo1292e();
            Iterator it2 = GameObject.fastGameObjectList.iterator();
            while (it2.hasNext()) {
                GameObject gameObject2 = (GameObject) it2.next();
                if (outputNetStream.mo1290f()) {
                    String simpleName = gameObject2.getClass().getSimpleName();
                    if (gameObject2 instanceof Unit) {
                        simpleName = ((Unit) gameObject2).getUnitType().mo3087i();
                    }
                    outputNetStream.mo1293d("Saving unit:" + simpleName + " (id" + gameObject2.GameObjectID + ")");
                }
                gameObject2.writeOut(outputNetStream);
                outputNetStream.mo1292e();
            }
            outputNetStream.endBlock("saveCompression");
            outputNetStream.mo1292e();
            outputNetStream.writeString("<SAVE END>");
        } catch (Exception e) {
            e.printStackTrace();
            game.alert("Error saving game to SD card, please email the logs.", 1);
        }
        GameEngine.log("GameSaver", "saveGame took:" + (System.currentTimeMillis() - currentTimeMillis));
    }

    /* renamed from: a */
    public String m413a(String str) {
        if (str == null) {
            return null;
        }
        return str.equals("maps/normal/l010;mission_1__-__Dividing_River.tmx") ? "maps/normal/l010;[demo]mission_1__-__Dividing_River.tmx" : str.equals("maps/normal/l030;mission_3__-__Crossfire.tmx") ? "maps/normal/l030;[demo]mission_3__-__Crossfire.tmx" : str;
    }

    /* renamed from: c */
    public boolean m404c(String str, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            File m410a = m410a(str, false);
            if (m410a.isDirectory()) {
                gameEngine.alert("Could not load, is a directory", 1);
                return false;
            }
            C0936j m2156j = C0670a.m2156j(m410a.getAbsolutePath());
            if (m2156j == null) {
                gameEngine.alert("Could not load, failed to open: " + C0670a.m2164d(m410a.getAbsolutePath()), 1);
                return false;
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(m2156j);
            DataInputStream dataInputStream = new DataInputStream(bufferedInputStream);
            boolean m414a = m414a(new InputNetStream(dataInputStream), z, false, false);
            dataInputStream.close();
            bufferedInputStream.close();
            m2156j.close();
            return m414a;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m412a(String str, OutputNetStream outputNetStream) {
        File m410a = m410a(str, false);
        if (m410a == null) {
            throw new IOException("Failed to get game save: " + str);
        }
        outputNetStream.mo1306a(m410a);
    }

    /* renamed from: a */
    public synchronized boolean m414a(InputNetStream inputNetStream, boolean z, boolean z2, boolean z3) {
        GameObject gameObject;
        SandBoxAct sandBoxAct;
        Team team;
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            C0651bl c0651bl = gameEngine.f5865cd;
            if (this.f6375b) {
                c0651bl.m2275a(Enum_draw.load_total);
            }
            ArrayList arrayList = null;
            if (z3) {
                arrayList = new ArrayList();
                Iterator it = gameEngine.interfaceEngine.f4809bJ.iterator();
                while (it.hasNext()) {
                    arrayList.add(Long.valueOf(((Unit) it.next()).GameObjectID));
                }
            }
            try {
                String readString = inputNetStream.readString();
                if (!readString.equals("rustedWarfareSave")) {
                    GameEngine.log("Map Load: Header is not correct:" + readString.substring(0, Math.min(readString.length(), 50)));
                    String str = "Failed to load save. (Could not find correct header)";
                    if (readString.equals("rustedWarfareReplay")) {
                        str = "Failed to load save. (This file appears to be a replay file, not a save file)";
                    }
                    GameEngine.log(str);
                    gameEngine.alert(str, 1);
                    return false;
                }
                inputNetStream.readInt();
                int readInt = inputNetStream.readInt();
                GameEngine.log("gameSaver", "Loading save from version: " + readInt);
                inputNetStream.m1245a(readInt);
                if (readInt > 94) {
                    gameEngine.alert("Cannot load: This save was made with a newer game", 1);
                    return false;
                }
                if (readInt >= 5) {
                    inputNetStream.readBoolean();
                }
                if (readInt >= 23) {
                    c0651bl.m2275a(Enum_draw.load_compression);
                    inputNetStream.m1240a("saveCompression", true);
                    c0651bl.m2270b(Enum_draw.load_compression);
                }
                if (readInt >= 54) {
                    inputNetStream.m1234b("customUnitsBlock");
                    if (gameEngine.replayEngine.isPlaying() && !z3) {
                        GameEngine.PrintLOG("Loading mods from replay");
                        try {
                            CustomUnitMetadata.m3120a(inputNetStream);
                            CustomUnitMetadataFactory.m3539d();
                        } catch (C0384ba e) {
                            GameEngine.PrintLOG("Replay load: Missing unit:" + e.getMessage() + " d:" + e.f2471a);
                            gameEngine.alertA(e.getMessage() + ", this is likely to cause the replay to desync (reverting to default units & mods)");
                            CustomUnitMetadataFactory.m3544b(true);
                        }
                    }
                    inputNetStream.m1230d("customUnitsBlock");
                }
                Integer num = null;
                Integer num2 = null;
                if (gameEngine.replayEngine.isPlaying() && z3) {
                    num = Integer.valueOf(gameEngine.f5820bB);
                    num2 = Integer.valueOf(gameEngine.f5821bC);
                }
                if (readInt >= 56) {
                    inputNetStream.m1234b("gameSetup");
                    boolean readBoolean = inputNetStream.readBoolean();
                    boolean z4 = readBoolean;
                    boolean z5 = false;
                    if (readInt >= 94) {
                        z5 = inputNetStream.readBoolean();
                        z4 = inputNetStream.readBoolean();
                    }
                    if ((gameEngine.replayEngine.isPlaying() || !gameEngine.networkEngine.networked) && !z3 && z4) {
                        GameEngine.PrintLOG("Using game rules from save");
                        gameEngine.replayEngine.f4078M = true;
                        gameEngine.networkEngine.m1471a(inputNetStream);
                        num = Integer.valueOf(gameEngine.f5820bB);
                        num2 = Integer.valueOf(gameEngine.f5821bC);
                        if ((readBoolean || z5) && !gameEngine.networkEngine.f5126F && !gameEngine.networkEngine.networked && !gameEngine.replayEngine.isPlaying()) {
                            GameEngine.PrintLOG("Enabling use of singlePlayer rules from saved game.");
                            gameEngine.networkEngine.f5126F = true;
                        }
                    }
                    inputNetStream.m1230d("gameSetup");
                }
                gameEngine.inputNetStream = null;
                gameEngine.f5892dl = m413a(C0670a.m2152n(inputNetStream.readString()));
                boolean z6 = false;
                if (readInt >= 72) {
                    z6 = inputNetStream.readBoolean();
                    if (z6) {
                        GameEngine.PrintLOG("Reading remote map stream");
                        gameEngine.inputNetStream = inputNetStream.m1213u();
                    }
                }
                if (gameEngine.networkEngine.networked && !gameEngine.networkEngine.isServer && z3 && gameEngine.networkEngine.f5061aQ != null && !z6) {
                    gameEngine.f5892dl = VariableScope.nullOrMissingString;
                    gameEngine.inputNetStream = gameEngine.networkEngine.f5061aQ;
                }
                c0651bl.m2275a(Enum_draw.load_map);
                if (z3) {
                    gameEngine.mo878a(true, true, EnumC0901s.normalSave);
                    if (GameEngine.isNonDedicatedServer()) {
                        gameEngine.f5981dv = true;
                    }
                } else {
                    gameEngine.mo879a(true, EnumC0901s.normalSave);
                }
                if (!gameEngine.map.f776S) {
                    GameEngine.PrintLOG("Not loading save because map failed to load");
                    return false;
                }
                if (num != null) {
                    gameEngine.f5820bB = num.intValue();
                }
                if (num2 != null) {
                    Integer.valueOf(gameEngine.f5821bC);
                }
                synchronized (gameEngine) {
                    c0651bl.m2270b(Enum_draw.load_map);
                    gameEngine.f5845by = inputNetStream.readInt();
                    float readFloat = inputNetStream.readFloat();
                    float readFloat2 = inputNetStream.readFloat();
                    float readFloat3 = inputNetStream.readFloat();
                    if (!z3) {
                        gameEngine.m851b(readFloat, readFloat2);
                        gameEngine.f5962cU = readFloat3;
                    }
                    if (readInt >= 18) {
                        gameEngine.groupController.f3888a = inputNetStream.readInt();
                    }
                    inputNetStream.readInt();
                    if (readInt >= 19) {
                        inputNetStream.m1241a("end of setup");
                    }
                    gameEngine.map.m4149a(inputNetStream);
                    if (readInt >= 86) {
                        boolean readBoolean2 = inputNetStream.readBoolean();
                        boolean readBoolean3 = inputNetStream.readBoolean();
                        boolean readBoolean4 = inputNetStream.readBoolean();
                        boolean readBoolean5 = inputNetStream.readBoolean();
                        if (!z && !readBoolean2) {
                            gameEngine.map.f818D = readBoolean3;
                            gameEngine.map.f819E = readBoolean4;
                            gameEngine.map.f820F = readBoolean5;
                        }
                    }
                    if (inputNetStream.readBoolean()) {
                        if (gameEngine.f5866ce == null) {
                            GameEngine.log("gameSaver", "making new mission engine on load, this shouldn't happen");
                            gameEngine.f5866ce = new MissionEngine();
                            gameEngine.f5866ce.m746a(false);
                        }
                        gameEngine.f5866ce.m753a(inputNetStream);
                    }
                    if (readInt >= 19) {
                        inputNetStream.m1241a("start of teams");
                    }
                    GameEngine.log("gameSaver", "loading teams");
                    Team[] teamArr = new Team[Team.MaxTeamIdLimit];
                    int i = -1;
                    if (readInt >= 36) {
                        i = inputNetStream.readInt();
                    }
                    int i2 = 8;
                    if (readInt >= 49) {
                        i2 = inputNetStream.readInt();
                        Team.m3942b(i2, false);
                        for (int i3 = 0; i3 < Team.playerNumMax; i3++) {
                            if (i3 >= i2 && !z && (team = Team.getTeam(i3)) != null) {
                                team.removeSelfFromList();
                            }
                        }
                    }
                    for (int i4 = 0; i4 < i2; i4++) {
                        AI team2 = Team.getTeam(i4);
                        boolean readBoolean6 = inputNetStream.readBoolean();
                        boolean z7 = false;
                        if (readInt >= 7) {
                            z7 = inputNetStream.readBoolean();
                        }
                        if (inputNetStream.readBoolean()) {
                            if (readBoolean6) {
                                if (team2 == null || !(team2 instanceof AI)) {
                                    if (z && !z3 && team2 != null) {
                                        GameEngine.log("Would replace team:" + i4 + " with AI, writing to dummy AI");
                                        team2 = new AI(i4, false);
                                        teamArr[i4] = team2;
                                    } else {
                                        if (z3) {
                                            GameEngine.log("Adding new AI " + i4 + " on resync");
                                        }
                                        team2 = new AI(i4);
                                    }
                                }
                            } else if (z7) {
                                if (team2 == null || !(team2 instanceof C0179c)) {
                                    if (z) {
                                        GameEngine.log("Replacing team:" + i4 + " with NetworkedPlayer");
                                    }
                                    team2 = new C0179c(i4);
                                }
                            } else if (team2 == null || !(team2 instanceof Player)) {
                                if (z) {
                                    GameEngine.log("Replacing team:" + i4 + " with Player");
                                    if (team2 != null) {
                                        team2.log("Existing");
                                    }
                                }
                                team2 = new Player(i4);
                            }
                            Integer num3 = team2.aiDifficultyOverride;
                            if (readInt >= 2) {
                                team2.m3934b(inputNetStream);
                            } else {
                                team2.mo3919c(inputNetStream);
                            }
                            if (!z3) {
                                team2.m3899g();
                                if (z) {
                                    team2.aiDifficultyOverride = num3;
                                    team2.log("networkLoad aiDifficultyOverride=" + num3);
                                    gameEngine.networkEngine.m1491a(team2);
                                    gameEngine.networkEngine.setAIName(team2);
                                }
                                if (team2 != null && team2 != team2) {
                                    team2.log("Transfering team stats");
                                    team2.credits = team2.credits;
                                    team2.m3972P().m3308a(team2.m3972P());
                                }
                            }
                        } else if (z && !gameEngine.replayEngine.isPlaying()) {
                            GameEngine.log("GameSaver: Would normally remove team:" + i4 + VariableScope.nullOrMissingString);
                            teamArr[i4] = Team.f1344e;
                        } else {
                            Team team3 = Team.getTeam(i4);
                            if (team3 != null) {
                                team3.removeSelfFromList();
                            }
                        }
                    }
                    boolean z8 = false;
                    gameEngine.networkEngine.updateNamesOfAI();
                    if (gameEngine.replayEngine.isPlaying()) {
                        gameEngine.playerTeam = Team.f1346g;
                    } else if (gameEngine.networkEngine.networked) {
                        if (gameEngine.networkEngine.f5111z != null) {
                            int i5 = gameEngine.networkEngine.f5111z.teamID;
                            if (i5 != -3) {
                                Team team4 = Team.getTeam(i5);
                                if (team4 == null) {
                                    throw new RuntimeException("GameSaver: Cannot relink player team: " + i5);
                                }
                                gameEngine.playerTeam = team4;
                            }
                        }
                    } else if (i != -1 && i != -3) {
                        gameEngine.playerTeam = Team.getTeam(i);
                    } else {
                        for (int i6 = 0; i6 < Team.playerNumMax; i6++) {
                            if (Team.getTeam(i6) instanceof Player) {
                                gameEngine.playerTeam = Team.getTeam(i6);
                            }
                        }
                    }
                    Iterator it2 = GameObject.m422dF().iterator();
                    while (it2.hasNext()) {
                        ((GameObject) it2.next()).remove();
                    }
                    if (gameEngine.m907W()) {
                        Iterator it3 = GameObject.m422dF().iterator();
                        while (it3.hasNext()) {
                            GameObject gameObject2 = (GameObject) it3.next();
                            if (gameObject2.GameObjectID == 0) {
                                if (gameObject2 instanceof Unit) {
                                    GameEngine.PrintLOG("object: " + ((Unit) gameObject2).m3740cz());
                                }
                                throw new RuntimeException("GameLoad preload: Found object in list with id:0");
                            }
                        }
                    }
                    boolean z9 = false;
                    int readInt2 = inputNetStream.readInt();
                    for (int i7 = 0; i7 < readInt2; i7++) {
                        byte readByte = inputNetStream.readByte();
                        if (readByte == 1) {
                            UnitType unitType = (UnitType) inputNetStream.readEnum(UnitType.class);
                            if (unitType == UnitType.editorOrBuilder) {
                                if (gameEngine.replayEngine.isPlaying() || gameEngine.editorMode) {
                                    GameEngine.PrintLOG("Creating DebugEditorBuilder for replay");
                                    sandBoxAct = new SandBoxAct(false);
                                    SandBoxAct m1841i = gameEngine.interfaceEngine.m1841i();
                                    if (m1841i == null || m1841i.deleted) {
                                        GameEngine.PrintLOG("Relinking editor");
                                        gameEngine.interfaceEngine.m1891a(sandBoxAct);
                                    }
                                } else {
                                    GameEngine.PrintLOG("Creating DebugEditorBuilder for load");
                                    sandBoxAct = new SandBoxAct(false);
                                    z8 = true;
                                }
                            } else {
                                sandBoxAct = unitType.createUnit();
                            }
                        } else if (readByte == 3) {
                            String readString2 = inputNetStream.readString();
                            CustomUnitMetadata m3080l = CustomUnitMetadata.m3080l(readString2);
                            if (m3080l == null) {
                                String str2 = "Could not find custom unit:" + readString2;
                                GameEngine.PrintLOG(str2);
                                if (!z9) {
                                    z9 = true;
                                    NetworkEngine.reportDesync(str2);
                                }
                                m3080l = CustomUnitMetadata.frontCustomUnitMetadata;
                                if (m3080l == null) {
                                    throw new RuntimeException("Could not find custom unit:" + readString2 + " and missingPlaceHolder is null");
                                }
                            }
                            com.corrodinggames.rts.game.units.UnitType m3101c = CustomUnitMetadata.m3101c(m3080l);
                            if (m3101c != null) {
                                if (m3101c instanceof CustomUnitMetadata) {
                                    m3080l = (CustomUnitMetadata) m3101c;
                                } else {
                                    GameEngine.log("replacement not a custom unit:" + m3101c.mo3087i());
                                }
                            }
                            sandBoxAct = m3080l.createUnit();
                        } else if (readByte == 2) {
                            byte readByte2 = inputNetStream.readByte();
                            if (readByte2 == 1) {
                                sandBoxAct = new ScorchMark();
                            } else if (readByte2 == 2) {
                                sandBoxAct = new Projectile(false);
                            } else if (readByte2 == 3) {
                                sandBoxAct = new Emitter(gameEngine.effects);
                            } else {
                                throw new IOException("Unhandled gameType on load:" + ((int) readByte2));
                            }
                        } else {
                            throw new IOException("Unhandled basic type on load:" + ((int) readByte));
                        }
                        sandBoxAct.GameObjectID = inputNetStream.readLong();
                        if (sandBoxAct.GameObjectID == 0) {
                            GameEngine.log("GameSaver: Adding object with id==0");
                            if (sandBoxAct instanceof Unit) {
                                GameEngine.log(((Unit) sandBoxAct).m3754cA());
                            }
                        }
                        GameObject.m421dG();
                    }
                    if (readInt >= 3) {
                        long readLong = inputNetStream.readLong();
                        if (readLong <= 0) {
                            GameEngine.PrintLOG_err("GameLoad: Trying to set next unit id <= 0: " + readLong);
                            readLong = 100000;
                        }
                        gameEngine.networkEngine.m1495a(readLong);
                    } else {
                        gameEngine.networkEngine.m1495a(100000L);
                    }
                    if (readInt >= 24) {
                        gameEngine.groupController.m2403a(inputNetStream);
                    }
                    if (readInt >= 4) {
                        gameEngine.interfaceEngine.m1884a(inputNetStream, z3);
                    }
                    if (readInt >= 57) {
                        gameEngine.StatsHandler.m2284a(inputNetStream, z3);
                    }
                    if (readInt >= 7) {
                        for (int i8 = 0; i8 < i2; i8++) {
                            Team team5 = Team.getTeam(i8);
                            if (teamArr[i8] != null) {
                                team5 = teamArr[i8];
                                if (team5 == Team.f1344e) {
                                    team5 = null;
                                }
                            }
                            if (team5 != null) {
                                Integer num4 = team5.aiDifficultyOverride;
                                team5.mo3919c(inputNetStream);
                                if (!z3) {
                                    if (z) {
                                        team5.aiDifficultyOverride = num4;
                                        team5.log("networkLoad2 aiDifficultyOverride=" + num4);
                                    }
                                    gameEngine.networkEngine.m1491a(team5);
                                    gameEngine.networkEngine.setAIName(team5);
                                }
                            }
                        }
                    } else if (readInt >= 2) {
                    }
                    if (readInt >= 10) {
                        inputNetStream.m1241a("Pre-unit data");
                    }
                    c0651bl.m2275a(Enum_draw.load_units);
                    C0942o m422dF = GameObject.m422dF();
                    GameEngine.log("gameSaver", "Loading unit data for " + m422dF.size() + " objects.");
                    Iterator it4 = m422dF.iterator();
                    while (it4.hasNext()) {
                        ((GameObject) it4.next()).mo427a(inputNetStream);
                        if (readInt >= 10) {
                            inputNetStream.m1241a("post unit: " + gameObject.getClass().toString() + " with id:" + gameObject.GameObjectID);
                        }
                    }
                    GameEngine.log("gameSaver", "Loading unit data done.");
                    c0651bl.m2270b(Enum_draw.load_units);
                    if (z8) {
                        Iterator it5 = GameObject.m422dF().iterator();
                        while (it5.hasNext()) {
                            GameObject gameObject3 = (GameObject) it5.next();
                            if (gameObject3 instanceof Unit) {
                                Unit unit = (Unit) gameObject3;
                                if (!gameEngine.replayEngine.isPlaying() && !gameEngine.editorMode && unit.getUnitType() == UnitType.editorOrBuilder) {
                                    unit.m3745cg();
                                }
                            }
                        }
                    }
                    if (readInt >= 23) {
                        inputNetStream.m1230d("saveCompression");
                    }
                    if (readInt >= 19) {
                        inputNetStream.m1241a("End of Save");
                        inputNetStream.readString();
                    }
                    GameEngine.log("gameSaver", "Checking for ID overlaps");
                    int i9 = 0;
                    if (1 != 0) {
                        GameObject[] m501a = GameObject.fastGameObjectList.m501a();
                        int size = GameObject.fastGameObjectList.size();
                        for (int i10 = 0; i10 < size; i10++) {
                            GameObject gameObject4 = m501a[i10];
                            if (gameObject4.GameObjectID == 0) {
                                GameEngine.log("GameSaver: Fixing object with zero id.");
                                gameObject4.GameObjectID = gameEngine.networkEngine.getNextUnitId();
                            }
                            for (int i11 = i10 + 1; i11 < size; i11++) {
                                GameObject gameObject5 = m501a[i11];
                                if (gameObject4 != gameObject5 && gameObject4.GameObjectID == gameObject5.GameObjectID) {
                                    i9++;
                                    gameObject5.GameObjectID = gameEngine.networkEngine.getNextUnitId();
                                }
                            }
                        }
                    }
                    GameEngine.log("gameSaver", "clearing out dead units.");
                    GameEngine.PrintLOG("Unit.fastLiveUnitList before:" + Unit.fastUnitList.size());
                    Iterator it6 = Unit.fastUnitList.iterator();
                    while (it6.hasNext()) {
                        if (((Unit) it6.next()).dead) {
                            it6.remove();
                        }
                    }
                    GameEngine.PrintLOG("Unit.fastLiveUnitList after:" + Unit.fastUnitList.size());
                    if (i9 > 0) {
                        if (readInt <= 2) {
                            gameEngine.alert("Warning: " + i9 + " errors were found in this save, this is due to a bug in the old version", 1);
                        } else {
                            gameEngine.alert("Warning: " + i9 + " errors were found in this save", 1);
                        }
                    }
                    GameEngine.log("gameSaver", "Fixing map cost.");
                    gameEngine.PathEngine.m1102a((OrderableUnit) null);
                    gameEngine.PathEngine.m1093b();
                    GameEngine.log("gameSaver", "Fixing map cost done.");
                    Team.m3979I();
                    for (int i12 = 0; i12 < Team.playerNumMax; i12++) {
                        Team team6 = Team.getTeam(i12);
                        if (team6 != null) {
                            team6.m3908d(false);
                        }
                    }
                    GameEngine.log("gameSaver", "Rebuilt unit caches");
                    Team.m3979I();
                    Team.m3970R();
                    for (int i13 = 0; i13 < Team.playerNumMax; i13++) {
                        Team team7 = Team.getTeam(i13);
                        if (team7 != null && (team7 instanceof AI)) {
                            ((AI) team7).m4342aj();
                        }
                    }
                    if (arrayList != null) {
                        gameEngine.interfaceEngine.m1817w();
                        Iterator it7 = arrayList.iterator();
                        while (it7.hasNext()) {
                            Unit m429a = GameObject.m429a(((Long) it7.next()).longValue(), true);
                            if (m429a != null) {
                                gameEngine.interfaceEngine.m1836k(m429a);
                            }
                        }
                    }
                    if (gameEngine.m907W()) {
                        Iterator it8 = GameObject.m422dF().iterator();
                        while (it8.hasNext()) {
                            GameObject gameObject6 = (GameObject) it8.next();
                            if (gameObject6.GameObjectID == 0) {
                                if (gameObject6 instanceof Unit) {
                                    GameEngine.PrintLOG("object: " + ((Unit) gameObject6).m3740cz());
                                }
                                throw new RuntimeException("GameLoad postload: Found object in list with id:0");
                            }
                        }
                    }
                    GameEngine.PrintLOG("--- Save file load complete ---");
                    GameEngine.PrintLOG("GameObject.fastGameObjectList:" + GameObject.fastGameObjectList.size());
                    GameEngine.PrintLOG("Unit.fastLiveUnitList:" + Unit.fastUnitList.size());
                    if (!z3) {
                        gameEngine.replayEngine.m2314a(z3);
                    }
                    if (this.f6375b) {
                        c0651bl.m2270b(Enum_draw.load_total);
                        c0651bl.m2273a(true, true);
                    }
                }
                return true;
            } catch (EOFException e2) {
                e2.printStackTrace();
                GameEngine.log("Failed to load save. (End of file trying to read header)");
                gameEngine.alert("Failed to load save. (End of file trying to read header)", 1);
                return false;
            }
        } catch (Exception e3) {
            e3.printStackTrace();
            GameEngine.PrintLOG("Save load error, clearing all units");
            Iterator it9 = GameObject.m422dF().iterator();
            while (it9.hasNext()) {
                GameObject gameObject7 = (GameObject) it9.next();
                if (gameObject7.GameObjectID == 0) {
                    gameObject7.GameObjectID = gameEngine.networkEngine.getNextUnitId();
                }
                gameObject7.remove();
            }
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: b */
    public boolean m407b(String str) {
        GameEngine.PrintLOG("Deleting: " + str);
        String m2152n = C0670a.m2152n(str);
        if (m2152n.contains("\\") || m2152n.contains("/")) {
            GameEngine.PrintLOG("Cannot get save with path: " + str);
            return false;
        }
        File m410a = m410a(str, true);
        boolean m2171b = C0670a.m2171b(m410a);
        C0670a.m2171b(m410a(str + ".map", true));
        if (!m2171b) {
            GameEngine.PrintLOG("Failed to delete: " + m410a.getAbsolutePath());
            GameEngine.getInstance().alertA("Failed to delete: " + m410a.getAbsolutePath());
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m409a(boolean z) {
        GameEngine.getInstance();
        if (!z) {
            this.f6376c = -9999;
            this.f6377d = -9999;
        }
    }

    /* renamed from: a */
    public boolean m416a() {
        GameEngine game = GameEngine.getInstance();
        if (!game.curSettings.autosaving || GameEngine.m858at() || !game.f5950bG || game.f5951bH || game.replayEngine.isPlaying() || game.m921I()) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m408b() {
        GameEngine game = GameEngine.getInstance();
        if (!m416a()) {
            return;
        }
        if (this.f6377d == -9999) {
            this.f6376c = game.f5845by;
            this.f6377d = game.f5845by;
        }
        if (this.f6377d + 300000 < game.f5845by) {
            this.f6377d = game.f5845by;
            long tookTime = C0651bl.getTookTime();
            m405c();
            GameEngine.PrintLOG("Autosaved (" + C0651bl.m2278a(C0651bl.m2277a(tookTime)) + ")");
        }
    }

    /* renamed from: c */
    public void m405c() {
        m406b("autosave", true);
    }
}