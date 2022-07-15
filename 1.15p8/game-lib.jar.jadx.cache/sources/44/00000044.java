package com.corrodinggames.librocket.scripts;

import com.Element;
import com.ElementDocument;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.rts.appFramework.ActivityC0112i;
import com.corrodinggames.rts.appFramework.ActivityC0113j;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.file.C0670a;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.Setup;
import com.corrodinggames.rts.gameFramework.network.layout_multeam;
import com.corrodinggames.rts.gameFramework.network.mapType;
import com.corrodinggames.rts.gameFramework.steam.SteamEngine;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Multiplayer.class */
public class Multiplayer extends ScriptContext {
    Root root;
    String[] currentDropdownRawArray;
    Root.TableData lastPlayerTable;
    boolean useMapDropdown = false;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Multiplayer(Root root) {
        this.root = root;
    }

    void updateMapDropdown(Element element, String str, String str2) {
        String[] strArr;
        String[] strArr2;
        GameEngine gameEngine = GameEngine.getInstance();
        int intValue = element.getElementById(str2).getValueAsInt(0).intValue();
        this.currentDropdownRawArray = null;
        ArrayList arrayList = new ArrayList();
        if (intValue == 0) {
            this.currentDropdownRawArray = C0670a.m2174a("maps/skirmish", true);
            Arrays.sort(this.currentDropdownRawArray);
            for (String str3 : this.currentDropdownRawArray) {
                arrayList.add(ActivityC0112i.m4415e(str3));
            }
        } else if (intValue == 1) {
            this.currentDropdownRawArray = C0670a.m2174a("/SD/rusted_warfare_maps", true);
            if (this.currentDropdownRawArray == null) {
                gameEngine.alert("Could not find folder: /SD/rusted_warfare_maps", 1);
                this.currentDropdownRawArray = new String[0];
            }
            Arrays.sort(this.currentDropdownRawArray);
            for (String str4 : this.currentDropdownRawArray) {
                arrayList.add(ActivityC0112i.m4415e(str4));
            }
        } else if (intValue == 2) {
            this.currentDropdownRawArray = ActivityC0113j.m4412l();
            if (this.currentDropdownRawArray == null) {
                gameEngine.alert("Could not find a save folder on SD card", 1);
                this.currentDropdownRawArray = new String[0];
            }
            for (String str5 : this.currentDropdownRawArray) {
                arrayList.add(ActivityC0112i.m4415e(str5));
            }
        } else {
            throw new RuntimeException("Unknown typeIndex:" + intValue);
        }
        String str6 = VariableScope.nullOrMissingString;
        int i = 0;
        int i2 = 1;
        for (String str7 : this.currentDropdownRawArray) {
            i++;
            if (intValue == 0 && str7.equalsIgnoreCase("[p8]Many Islands (8p).tmx")) {
                i2 = i;
            }
        }
        int i3 = 0;
        for (String str8 : this.currentDropdownRawArray) {
            i3++;
            str6 = str6 + generateOption(str8, this.root.convertMapName(str8), i3 == i2) + "\n";
        }
        GameEngine.PrintLOG("mapList:" + str6);
        if (intValue != 2) {
        }
        element.getElementById("mapsSelectorParent").setInnerRML("<p data-workaround='this stops disappearing select'></p><select id='mapsSelector' class='mapsSelector'><option value='0'>...</option></select>");
        getMapDropdown().setInnerRML(str6);
    }

    String generateOption(String str, String str2, boolean z) {
        return generateOption(str, str2, z, null, false);
    }

    String generateOption(String str, String str2, boolean z, Integer num, boolean z2) {
        String str3 = VariableScope.nullOrMissingString;
        if (z) {
            str3 = str3 + " selected='selected'";
        }
        String htmlString = this.root.htmlString(str2);
        String str4 = VariableScope.nullOrMissingString;
        if (num != null) {
            str4 = str4 + " style='color:" + CommonUtils.m1636g(num.intValue()) + ";'";
        }
        if (z2) {
            str4 = str4 + " class='disabled-option'";
        }
        if (str4 != null && !VariableScope.nullOrMissingString.equals(str4)) {
            htmlString = "<span " + str4 + ">" + htmlString + "</span>";
        }
        return "<option value=" + this.root.escapedString(str) + " " + str3 + ">" + htmlString + "</option>";
    }

    Element getMapDropdown() {
        return this.libRocket.m4506c().findByClassName("mapsSelector");
    }

    String getMapDropdownSelected() {
        return getMapDropdown().getAttribute("value");
    }

    void readInterfaceIntoNetworkSettings() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.isServer) {
            String mapDropdownSelected = getMapDropdownSelected();
            if (mapDropdownSelected == null) {
                mapDropdownSelected = "<No Map>";
            }
            gameEngine.networkEngine.setup.mapFileName = mapDropdownSelected;
            gameEngine.networkEngine.setup.currentType = mapType.values()[0];
        }
    }

    public void multiplayerStart() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.isServer) {
            if (gameEngine.networkEngine.setup.currentType == mapType.skirmishMap) {
                gameEngine.networkEngine.mapFilePath = "maps/skirmish/" + gameEngine.networkEngine.setup.mapFileName;
            } else if (gameEngine.networkEngine.setup.currentType == mapType.customMap) {
                gameEngine.networkEngine.mapFilePath = "/SD/rusted_warfare_maps/" + gameEngine.networkEngine.setup.mapFileName;
            } else if (gameEngine.networkEngine.setup.currentType == mapType.savedGame) {
                gameEngine.networkEngine.mapFilePath = null;
            } else {
                this.libRocket.m4504c("Error: No map type selected");
                return;
            }
            if (gameEngine.networkEngine.setup.mapFileName == null || VariableScope.nullOrMissingString.equals(gameEngine.networkEngine.setup.mapFileName) || gameEngine.networkEngine.setup.mapFileName.equals("<No Map>")) {
                this.libRocket.m4504c("Error: No map selected");
            } else {
                gameEngine.networkEngine.m1458aa();
            }
        } else if (gameEngine.networkEngine.f5042H) {
            gameEngine.networkEngine.Sendpara2Server("-start");
        } else {
            GameEngine.log("startNetButton.setOnClickListener", "Clicked but not server or proxy controller");
        }
    }

    public void battleroomSetup() {
        GameEngine gameEngine = GameEngine.getInstance();
        this.lastPlayerTable = null;
        refreshUI();
        this.root.refreshChat();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument != null && gameEngine.networkEngine.f5126F) {
            activeDocument.addClass("singlePlayer");
        }
        gameEngine.networkEngine.m1445an();
    }

    public void refreshUI() {
        GameEngine game = GameEngine.getInstance();
        Element activeElementById = this.libRocket.getActiveElementById("infoDiv");
        if (activeElementById == null) {
            GameEngine.PrintLOG("refreshUI: infoTextElement==null");
            return;
        }
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        boolean z = game.networkEngine.isServer || game.networkEngine.f5042H;
        boolean z2 = game.networkEngine.isServer;
        boolean z3 = !z && !game.networkEngine.setup.teamLocked;
        Iterator it = activeDocument.findElementsByClassName("forHostOnly").iterator();
        while (it.hasNext()) {
            ((Element) it.next()).show(z);
        }
        Iterator it2 = activeDocument.findElementsByClassName("forLocalHostOnly").iterator();
        while (it2.hasNext()) {
            ((Element) it2.next()).show(z2);
        }
        Iterator it3 = activeDocument.findElementsByClassName("forUnlockedTeamsNonHost").iterator();
        while (it3.hasNext()) {
            ((Element) it3.next()).show(z3);
        }
        if (game.m918L()) {
            Iterator it4 = activeDocument.findElementsByClassName("forRealNetworkOnly").iterator();
            while (it4.hasNext()) {
                ((Element) it4.next()).show(false);
            }
        }
        activeElementById.compareAndSetText(game.networkEngine.m1444ao());
        String m1442aq = game.networkEngine.m1442aq();
        if (game.networkEngine.setup.currentType == mapType.savedGame) {
            m1442aq = "saves/" + game.networkEngine.setup.mapFileName;
        }
        Element activeElementById2 = this.libRocket.getActiveElementById("mapImage");
        if (game.networkEngine.isChatRoom) {
            activeElementById2.hide();
        }
        String attribute = activeElementById2.getAttribute("src");
        if (m1442aq == null) {
            if (!VariableScope.nullOrMissingString.equals(attribute)) {
                activeElementById2.setAttribute("src", VariableScope.nullOrMissingString);
            }
        } else {
            String mapThumbnail = this.root.getMapThumbnail(m1442aq);
            if (mapThumbnail == null) {
                mapThumbnail = VariableScope.nullOrMissingString;
            }
            if (!mapThumbnail.equals(attribute)) {
                activeElementById2.setAttribute("src", mapThumbnail);
            }
        }
        refreshPlayerTable();
    }

    public void refreshPlayerTable() {
        Root.TableData playerTable = getPlayerTable();
        if (this.lastPlayerTable != null) {
            if (this.lastPlayerTable.same(playerTable, false)) {
                return;
            }
            if (this.lastPlayerTable.same(playerTable, true)) {
                this.root.updateTableTextOnly("playersDiv", playerTable, this.lastPlayerTable);
                return;
            }
        }
        this.root.refreshTable("playersDiv", playerTable);
        this.lastPlayerTable = playerTable;
    }

    public Root.TableData getPlayerTable() {
        GameEngine game = GameEngine.getInstance();
        Root.TableData tableData = new Root.TableData();
        ArrayList arrayList = tableData.rows;
        int i = -1;
        int i2 = 0;
        ArrayList m3947a = Team.m3947a(true);
        Iterator it = m3947a.iterator();
        while (it.hasNext()) {
            Team team = (Team) it.next();
            if (team != null) {
                if (i != -1 && i != team.allyGroup) {
                    i2++;
                }
                i = team.allyGroup;
            }
        }
        int i3 = -1;
        Iterator team2 = m3947a.iterator();
        while (team2.hasNext()) {
            Team team3 = (Team) team2.next();
            if (team3 != null) {
                if (i3 != -1 && i3 != team3.allyGroup && i2 <= 3) {
                    Root.TableRow tableRow = new Root.TableRow();
                    for (int i4 = 0; i4 < 4; i4++) {
                        tableRow.addCell(VariableScope.nullOrMissingString).addClass("spacer");
                    }
                    arrayList.add(tableRow);
                }
                i3 = team3.allyGroup;
                String str = "unnamed";
                if (team3.playerName != null) {
                    str = team3.playerName;
                }
                String hostStatus = team3.getHostStatus();
                String num = Integer.toString(team3.teamID + 1);
                boolean m3945b = team3.m3945b();
                if (m3945b) {
                    num = "S";
                }
                if (!m3945b && team3.startingUnitOverride != null && team3.startingUnitOverride.intValue() != game.networkEngine.setup.startingUnits) {
                    num = num + " - " + game.networkEngine.m1409d(team3.startingUnitOverride.intValue());
                }
                String team4 = team3.getTeam();
                Root.TableRow tableRow2 = new Root.TableRow();
                Root.TableCell addCell = tableRow2.addCell(str);
                if (team3.playerColor != null) {
                    addCell.color = Integer.valueOf(Team.m3892i(team3.playerColor.intValue()));
                }
                if (team3 == game.networkEngine.f5111z) {
                    addCell.addClass("boldText");
                }
                tableRow2.addCell(num).color = Integer.valueOf(team3.m3981G());
                tableRow2.addCell(team4).color = Integer.valueOf(Team.m3892i(team3.allyGroup));
                tableRow2.addCell(hostStatus);
                tableRow2.setLibrocketOnClick("mp.showPlayerConfig('" + team3.teamID + "')");
                arrayList.add(tableRow2);
            }
        }
        if (!game.networkEngine.isServer && game.networkEngine.serverUUID == null) {
            arrayList.clear();
            String str2 = "Connecting...";
            if (game.networkEngine.connections.size() == 0) {
                str2 = "Disconnected";
            }
            Root.TableRow tableRow3 = new Root.TableRow();
            tableRow3.addCell(str2);
            tableRow3.addCell(VariableScope.nullOrMissingString);
            tableRow3.addCell(VariableScope.nullOrMissingString);
            tableRow3.addCell(VariableScope.nullOrMissingString);
            arrayList.add(tableRow3);
        }
        return tableData;
    }

    public void showSetTeamsDialog() {
        GameEngine.getInstance();
        if (this.root.createAndShowPopup("battleroom_setTeams.rml", null, "Set Teams") != null) {
        }
    }

    public void showPlayerConfigForSelf() {
        GameEngine game = GameEngine.getInstance();
        if (game.networkEngine.f5111z != null) {
            showPlayerConfig(VariableScope.nullOrMissingString + game.networkEngine.f5111z.teamID);
        }
    }

    public void showPlayerConfig(final String str) {
        GameEngine.getInstance();
        this.scriptEngine.addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.librocket.scripts.Multiplayer.1
            @Override // java.lang.Runnable
            public void run() {
                Multiplayer.this.showPlayerConfigNow(str);
            }
        });
    }

    public void showPlayerConfigNow(String str) {
        ElementDocument createAndShowPopup;
        GameEngine game = GameEngine.getInstance();
        Team team = Team.getTeam(Integer.parseInt(str));
        if (team == null) {
            this.root.logWarn("showPlayerConfig: " + str + "==null");
        } else if ((game.networkEngine.m1441ar() || (game.networkEngine.f5111z == team && !game.networkEngine.setup.teamLocked)) && (createAndShowPopup = this.root.createAndShowPopup("battleroom_player.rml", team, team.playerName)) != null) {
            Element elementById = createAndShowPopup.getElementById("team_id");
            Element elementById2 = createAndShowPopup.getElementById("spawnPoint");
            Element elementById3 = createAndShowPopup.getElementById("allyTeam");
            Element elementById4 = createAndShowPopup.getElementById("aiDifficulty");
            Element elementById5 = createAndShowPopup.getElementById("startingUnits");
            Element elementById6 = createAndShowPopup.getElementById("playerColor");
            Element elementById7 = createAndShowPopup.getElementById("playerOverridesSection");
            Element elementById8 = createAndShowPopup.getElementById("aiDifficultySelection");
            if (!GameEngine.m803o("sd")) {
                setupStartingUnitDropDown(elementById5, true);
                setupPlayerColorDropDown(elementById6, true, true, team);
            } else {
                GameEngine.PrintLOG("sd");
            }
            elementById.setValue(VariableScope.nullOrMissingString + team.teamID);
            String str2 = VariableScope.nullOrMissingString + (team.teamID + 1);
            if (team.m3945b()) {
                str2 = "-2";
            }
            elementById2.setValue(str2);
            if (team.f1331r) {
                elementById3.setValue(VariableScope.nullOrMissingString + (team.allyGroup + 1));
            } else {
                elementById3.setValue("fromSpawn2");
            }
            if (elementById7 == null) {
                throw new RuntimeException("playerOverridesSection==null");
            }
            if (!game.networkEngine.isServer) {
                elementById7.hide();
            }
            if (elementById8 == null) {
                throw new RuntimeException("aiDifficultySelection==null");
            }
            if (!GameEngine.m803o("s1")) {
                if (team.f1333t) {
                    if (team.aiDifficultyOverride == null) {
                        elementById4.setValue("-99");
                    } else {
                        elementById4.setValue(VariableScope.nullOrMissingString + team.aiDifficultyOverride);
                    }
                } else {
                    elementById8.hide();
                }
            } else {
                GameEngine.PrintLOG("s1");
            }
            if (!GameEngine.m803o("s2")) {
                if (team.startingUnitOverride == null) {
                    elementById5.setValue("-99");
                } else {
                    GameEngine.PrintLOG("startingUnitOverride: " + team.startingUnitOverride);
                    elementById5.setValue(VariableScope.nullOrMissingString + team.startingUnitOverride);
                }
            } else {
                GameEngine.PrintLOG("s2");
            }
            if (!GameEngine.m803o("s3")) {
                if (team.playerColor == null) {
                    elementById6.setValue("-99");
                    return;
                }
                GameEngine.PrintLOG("playerColor: " + team.playerColor);
                elementById6.setValue(VariableScope.nullOrMissingString + team.playerColor);
                return;
            }
            GameEngine.PrintLOG("s3");
        }
    }

    public void teamsSet_apply() {
        GameEngine game = GameEngine.getInstance();
        if (!game.networkEngine.isServer) {
            GameEngine.PrintLOG("Not server");
            return;
        }
        GameEngine.PrintLOG("playerConfig_kick");
        String value = this.libRocket.m4506c().getElementById("teamLayout").getValue();
        if ("2t".equalsIgnoreCase(value)) { // 2 Team
            game.networkEngine.m1485a(layout_multeam.layout_2sides);
        } else if ("3t".equalsIgnoreCase(value)) {
            game.networkEngine.m1485a(layout_multeam.layout_3sides);
        } else if ("FFA".equalsIgnoreCase(value)) {
            game.networkEngine.m1485a(layout_multeam.layout_ffa);
        } else if ("spectators".equalsIgnoreCase(value)) {
            game.networkEngine.m1485a(layout_multeam.layout_spectators);
        } else {
            GameEngine.log("teamsSet_apply: unknown layout: " + value);
        }
        refreshUI();
    }

    public void playerConfig_kick() {
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.PrintLOG("playerConfig_kick");
        String value = this.libRocket.m4506c().getElementById("team_id").getValue();
        Team team = Team.getTeam(Integer.parseInt(value));
        if (team == null) {
            this.root.logWarn("playerConfig_kick: " + value + "==null");
        } else {
            gameEngine.networkEngine.m1400e(team);
        }
    }

    public void playerConfig_apply() {
        boolean z;
        int i;
        Integer num;
        Integer num2;
        Integer num3;
        GameEngine game = GameEngine.getInstance();
        GameEngine.PrintLOG("playerConfig_kick");
        String value = this.libRocket.m4506c().getElementById("team_id").getValue();
        Team team = Team.getTeam(Integer.parseInt(value));
        if (team == null) {
            this.root.logWarn("playerConfig_apply: " + value + "==null");
            return;
        }
        ElementDocument m4506c = this.libRocket.m4506c();
        Element elementById = m4506c.getElementById("spawnPoint");
        Element elementById2 = m4506c.getElementById("allyTeam");
        Element elementById3 = m4506c.getElementById("aiDifficulty");
        Element elementById4 = m4506c.getElementById("startingUnits");
        Element elementById5 = m4506c.getElementById("playerColor");
        String value2 = elementById.getValue();
        String value3 = elementById2.getValue();
        int intValue = Integer.valueOf(value2).intValue() - 1;
        boolean z2 = false;
        if (intValue == -3) {
            z2 = true;
        } else {
            if (intValue < 0) {
                intValue = 1;
            }
            if (intValue > Team.playerNumMax - 1) {
                intValue = Team.playerNumMax - 1;
            }
        }
        boolean z3 = false;
        if (z2) {
            i = -3;
            z = true;
        } else if (value3.equals("fromSpawn2")) {
            i = intValue % 2;
            team.f1331r = false;
            z = true;
        } else {
            z = false;
            i = team.allyGroup;
            try {
                i = Integer.valueOf(value3).intValue() - 1;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            team.f1331r = true;
        }
        if (team.allyGroup != i) {
            if (game.networkEngine.isServer) {
                z3 = true;
            } else if (game.networkEngine.f5042H || game.networkEngine.f5111z == team) {
                z3 = true;
            } else {
                GameEngine.log("row.setOnClickListener", "Clicked but not server or proxy controller");
            }
        }
        try {
            if (team.teamID != intValue) {
                if (game.networkEngine.isServer) {
                    z3 = false;
                    int spawnPoint = intValue;
                    game.networkEngine.m1490a(team, spawnPoint);
                    team.allyGroup = i;
                } else if (game.networkEngine.f5042H || game.networkEngine.f5111z == team) {
                    z3 = false;
                    int i2 = i;
                    if (z) {
                        i2 = -1;
                    }
                    game.networkEngine.m1489a(team, intValue, Integer.valueOf(i2));
                } else {
                    GameEngine.log("row.setOnClickListener", "Clicked but not server or proxy controller");
                }
            }
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
        if (team.f1333t) {
            int intValue2 = elementById3.getValueAsInt(-99).intValue();
            if (intValue2 == -99) {
                num3 = null;
            } else {
                num3 = Integer.valueOf(intValue2);
            }
            if (team.aiDifficultyOverride != num3) {
                if (game.networkEngine.isServer) {
                    team.aiDifficultyOverride = num3;
                } else {
                    GameEngine.PrintLOG("aiDifficultyOverride: not server or proxy controller");
                }
            }
        }
        int intValue3 = elementById4.getValueAsInt(-99).intValue();
        GameEngine.PrintLOG("startingUnits now: " + intValue3);
        if (intValue3 == -99) {
            num = null;
        } else {
            num = Integer.valueOf(intValue3);
        }
        if (team.startingUnitOverride != num) {
            if (game.networkEngine.isServer) {
                team.startingUnitOverride = num;
            } else {
                GameEngine.PrintLOG("startingUnitOverride: not server or proxy controller");
            }
        }
        int intValue4 = elementById5.getValueAsInt(-99).intValue();
        GameEngine.PrintLOG("playerColor now: " + intValue4);
        if (intValue4 == -99) {
            num2 = null;
        } else {
            num2 = Integer.valueOf(intValue4);
        }
        if (team.playerColor != num2) {
            if (game.networkEngine.isServer) {
                team.playerColor = num2;
            } else {
                GameEngine.PrintLOG("colorOverride: not server or proxy controller");
            }
        }
        if (z3) {
            if (game.networkEngine.isServer) {
                team.allyGroup = i;
            } else if (z) {
                game.networkEngine.m1430b(team, -1);
            } else {
                game.networkEngine.m1430b(team, i);
            }
        }
        game.networkEngine.m1410d();
        game.networkEngine.m1519I();
        refreshUI();
    }

    public void disconnect(String str) {
        GameEngine.getInstance().networkEngine.disconnect(str);
    }

    public void multiplayerBackPrompt() {
        this.root.showPopup(LangLocale.getI18NText("menus.ingame.multiplayerClose.title", new Object[0]), "What would you like to do?", true, (LangLocale.getI18NText("menus.ingame.multiplayerClose.disconnectButton", new Object[0]) + ":") + "closePopup(); mp.disconnect('exited'); back();", null);
    }

    public void surrenderPrompt() {
        this.root.showPopup(LangLocale.getI18NText("menus.ingame.surrender.title", new Object[0]), LangLocale.getI18NText("menus.ingame.surrender.message", new Object[0]), true, (LangLocale.getI18NText("menus.ingame.surrender.surrenderButton", new Object[0]) + ":") + "closePopup(); mp.surrender();", null);
    }

    public void surrender() {
        GameEngine.PrintLOG("Surrender requested");
        this.root.sendChatMessage("-surrender");
    }

    public void multiplayerExitPrompt() {
        this.root.showPopup(LangLocale.getI18NText("menus.ingame.multiplayerClose.title", new Object[0]), "Are you sure you want to disconnect, and end this game?", true, (LangLocale.getI18NText("menus.ingame.multiplayerClose.disconnectButton", new Object[0]) + ":") + "closePopup(); mp.disconnect('exited'); showMainMenu();", null);
    }

    public void addAI() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.isServer) {
            gameEngine.networkEngine.m1448ak();
        } else if (gameEngine.networkEngine.f5042H) {
            gameEngine.networkEngine.Sendpara2Server("-addai");
        } else {
            this.root.logWarn("addAI(): Clicked but not server or proxy controller");
        }
    }

    public String _getRandomDefaultPlayerName() {
        return "Unnamed" + CommonUtils.m1737a(0, 999);
    }

    public void loadUsername() {
        GameEngine.PrintLOG("mp.loadUsername()");
        String str = GameEngine.getInstance().curSettings.lastNetworkPlayerName;
        Element activeElementById = this.libRocket.getActiveElementById("username");
        String mo272c = SteamEngine.m718a().mo272c();
        GameEngine.PrintLOG("steamName:" + mo272c);
        if (mo272c != null && str == null) {
            str = mo272c;
        }
        if (str == null || VariableScope.nullOrMissingString.equals(str)) {
            str = _getRandomDefaultPlayerName();
        }
        activeElementById.loadCharsetIfNeeded(str);
        activeElementById.setAttribute("value", str);
    }

    public void getUsernameFromInterface() {
        GameEngine game = GameEngine.getInstance();
        String valueById = this.root.getValueById("username");
        if (valueById == null) {
            GameEngine.log("getUsernameFromInterface: Cannot find username");
            return;
        }
        String trim = valueById.trim();
        GameEngine.PrintLOG("set username:" + trim);
        if (trim.equals(VariableScope.nullOrMissingString)) {
            trim = _getRandomDefaultPlayerName();
        }
        game.networkEngine.m1470a(trim);
    }

    public void gameOptionsGet() {
        gameOptionsGetOrPush(false);
    }

    public void gameOptionsPush() {
        gameOptionsGetOrPush(true);
    }

    public void gameOptionsRefreshTypes() {
        GameEngine.getInstance();
        ElementDocument m4506c = this.libRocket.m4506c();
        if (this.useMapDropdown) {
            updateMapDropdown(m4506c, "mapsSelector", "typeSelector");
        }
    }

    public void gameOptionsGetOrPush(boolean z) {
        GameEngine game = GameEngine.getInstance();
        ElementDocument m4506c = this.libRocket.m4506c();
        Element elementById = m4506c.getElementById("fogMode");
        Element elementById2 = m4506c.getElementById("startingCredits");
        Element elementById3 = m4506c.getElementById("incomeMultiplier");
        Element elementById4 = m4506c.getElementById("noNukes");
        Element elementById5 = m4506c.getElementById("sharedControl");
        Element elementById6 = m4506c.getElementById("aiDifficulty");
        Element elementById7 = m4506c.getElementById("startingUnits");
        if (!z) {
            setupStartingUnitDropDown(elementById7, false);
        }
        Element elementById8 = m4506c.getElementById("typeSelector");
        Element mapDropdown = getMapDropdown();
        if (!z) {
            if (game.networkEngine.setup.currentType == null) {
                GameEngine.PrintLOG("gameOptionsGetOrPush: game.network.setup.currentType==null");
            } else {
                elementById8.setValue(VariableScope.nullOrMissingString + game.networkEngine.setup.currentType.ordinal());
            }
            if (this.useMapDropdown) {
                updateMapDropdown(m4506c, "mapsSelector", "typeSelector");
                Element mapDropdown2 = getMapDropdown();
                GameEngine.PrintLOG("new currentMapSelection=" + game.networkEngine.setup.mapFileName);
                mapDropdown2.setValue(VariableScope.nullOrMissingString + game.networkEngine.setup.mapFileName);
            }
            m4506c.getElementById("typeSelector");
            elementById.setValue(VariableScope.nullOrMissingString + game.networkEngine.setup.fogMode);
            elementById2.setValue(VariableScope.nullOrMissingString + game.networkEngine.setup.startingCreditsLev);
            elementById7.setValue(VariableScope.nullOrMissingString + game.networkEngine.setup.startingUnits);
            game.networkEngine.setup.revealedMap = true;
            elementById4.setCheckbox(game.networkEngine.setup.noNukes);
            elementById5.setCheckbox(game.networkEngine.setup.sharedControl);
            elementById3.setValue(VariableScope.nullOrMissingString + CommonUtils.m1740a(game.networkEngine.setup.incomeMultiplier, 1) + "x");
            elementById6.setValue(VariableScope.nullOrMissingString + game.networkEngine.setup.aiDifficulty);
            return;
        }
        Setup m1420c = game.networkEngine.m1420c();
        if (m1420c != null) {
            String mapDropdownSelected = null;
            if (this.useMapDropdown) {
                mapDropdownSelected = mapDropdown.getValue();
                if (mapDropdownSelected == null) {
                    GameEngine.PrintLOG("gameOptionsGetOrPush: mapDropdownSelected==null");
                    mapDropdownSelected = "<No Map>";
                }
            }
            int intValue = elementById8.getValueAsInt(0).intValue();
            mapType maptype = m1420c.currentType;
            m1420c.currentType = mapType.values()[intValue];
            if (this.useMapDropdown) {
                m1420c.mapFileName = mapDropdownSelected;
            } else if (maptype != m1420c.currentType) {
                m1420c.mapFileName = null;
            }
            m1420c.fogMode = elementById.getValueAsInt(null).intValue();
            m1420c.startingCreditsLev = elementById2.getValueAsInt(null).intValue();
            float f = 1.0f;
            try {
                f = Float.parseFloat(elementById3.getValue().replace("x", VariableScope.nullOrMissingString));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            m1420c.incomeMultiplier = f;
            m1420c.noNukes = elementById4.getCheckbox();
            m1420c.sharedControl = elementById5.getCheckbox();
            m1420c.aiDifficulty = elementById6.getValueAsInt(null).intValue();
            m1420c.startingUnits = elementById7.getValueAsInt(1).intValue();
            game.networkEngine.m1486a(m1420c);
        }
    }

    public void closeBattleroomIfOpen() {
        GameEngine.getInstance();
        if (this.libRocket.getActiveElementById("battleroomPage") == null) {
            GameEngine.PrintLOG("closeBattleroomIfOpen: battleroomPage==null");
        } else {
            this.libRocket.backToLastDocument();
        }
    }

    public void reinviteAsk() {
        this.root.showPopup(LangLocale.getI18NText("menus.ingame.multiplayerReinvite.title", new Object[0]), "While in-game you can only reinvite players who were in-game before but dropped out", true, "reInvite:closePopup(); mp.showSteamInviteDialog();", null);
    }

    public void showSteamInviteDialog() {
        SteamEngine.m718a().mo268g();
    }

    public void setMapFromPopup(String str) {
        if (!isInControlOfServer()) {
            this.root.sendChatMessage("clicked on '" + this.root.getMapNameFromPath(str) + "'");
            this.root.closePopup();
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        Setup m1420c = gameEngine.networkEngine.m1420c();
        if (m1420c != null) {
            String str2 = str;
            if (!str2.contains("MOD|")) {
                str2 = CommonUtils.m1624k(str2);
            }
            m1420c.mapFileName = str2;
            gameEngine.networkEngine.m1486a(m1420c);
        }
        this.root.closePopup();
    }

    public void showMapSelect() {
        this.root.showMapPopup(this.root.getModeMapPath(null, null), "mp.setMapFromPopup");
    }

    public boolean isInControlOfServer() {
        GameEngine gameEngine = GameEngine.getInstance();
        return gameEngine.networkEngine.isServer || gameEngine.networkEngine.f5042H;
    }

    public void askPassword() {
        GameEngine.PrintLOG("mp.askPassword()");
        GameEngine.getInstance();
        this.root.showInputPopupNonClose("Password Required", "This server requires a password to join", VariableScope.nullOrMissingString, "Close:mp.cancelPaswordAsk()", "[onenter]Join:mp.askPasswordEntered(getPopupText())");
    }

    public void askPasswordEntered(String str) {
        GameEngine.PrintLOG("mp.askPasswordEntered()");
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.networkEngine.f5104n = str;
        gameEngine.networkEngine.m1508T();
        this.root.closePopup();
    }

    public void cancelPaswordAsk() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.isServer) {
            this.root.logWarn("cancelPaswordAsk: we are the server");
        } else {
            gameEngine.networkEngine.disconnect("Cancel password");
            closeBattleroomIfOpen();
        }
        this.root.closePopup();
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Multiplayer$DropdownOption.class */
    public class DropdownOption {
        String key;
        String value;

        public DropdownOption(String str, String str2) {
            this.key = str;
            this.value = str2;
        }
    }

    public void setupStartingUnitDropDown(Element element, boolean z) {
        String str = VariableScope.nullOrMissingString;
        if (z) {
            str = str + generateOption("-99", LangLocale.getI18NText("menus.settings.option.default", new Object[0]), false);
        }
        Iterator it = getStartingUnitOptions().iterator();
        while (it.hasNext()) {
            DropdownOption dropdownOption = (DropdownOption) it.next();
            str = str + generateOption(dropdownOption.key, dropdownOption.value, false);
        }
        element.setInnerRML(str);
    }

    public void setupPlayerColorDropDown(Element element, boolean z, boolean z2, Team team) {
        GameEngine gameEngine = GameEngine.getInstance();
        String str = VariableScope.nullOrMissingString;
        if (z) {
            str = str + generateOption("-99", LangLocale.getI18NText("menus.settings.option.default", new Object[0]), false);
        }
        for (int i = 0; i < 10; i++) {
            boolean z3 = false;
            if (z2 && gameEngine.networkEngine.m1496a(i, team)) {
                z3 = true;
            }
            String m1612w = CommonUtils.m1612w(Team.m3890j(i));
            int i2 = i;
            int i3 = i;
            if (z3) {
                m1612w = m1612w + " (used)";
                i2 = -7829368;
                i3 = -99;
            }
            str = str + generateOption(VariableScope.nullOrMissingString + i3, m1612w, false, Integer.valueOf(Team.m3892i(i2)), z3);
        }
        element.setInnerRML(str);
    }

    public ArrayList getStartingUnitOptions() {
        GameEngine gameEngine = GameEngine.getInstance();
        ArrayList arrayList = new ArrayList();
        Iterator it = gameEngine.networkEngine.m1389g().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            arrayList.add(new DropdownOption(num.toString(), gameEngine.networkEngine.m1409d(num.intValue())));
        }
        return arrayList;
    }
}