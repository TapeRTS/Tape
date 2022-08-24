package com.corrodinggames.librocket.scripts;

import com.Element;
import com.ElementDocument;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.appFramework.ActivityC0118j;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0845ah;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0846ai;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0852al;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
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
            this.currentDropdownRawArray = C0750a.m2460a("maps/skirmish", true);
            Arrays.sort(this.currentDropdownRawArray);
            for (String str3 : this.currentDropdownRawArray) {
                arrayList.add(ActivityC0117i.m6932e(str3));
            }
        } else if (intValue == 1) {
            this.currentDropdownRawArray = C0750a.m2460a("/SD/rusted_warfare_maps", true);
            if (this.currentDropdownRawArray == null) {
                gameEngine.m1192a("Could not find folder: /SD/rusted_warfare_maps", 1);
                this.currentDropdownRawArray = new String[0];
            }
            Arrays.sort(this.currentDropdownRawArray);
            for (String str4 : this.currentDropdownRawArray) {
                arrayList.add(ActivityC0117i.m6932e(str4));
            }
        } else if (intValue == 2) {
            this.currentDropdownRawArray = ActivityC0118j.m6928l();
            if (this.currentDropdownRawArray == null) {
                gameEngine.m1192a("Could not find a save folder on SD card", 1);
                this.currentDropdownRawArray = new String[0];
            }
            for (String str5 : this.currentDropdownRawArray) {
                arrayList.add(ActivityC0117i.m6932e(str5));
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
        GameEngine.PrintLog("mapList:" + str6);
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
            str4 = str4 + " style='color:" + CommonUtils.m2252h(num.intValue()) + ";'";
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
        return this.libRocket.m7048c().findByClassName("mapsSelector");
    }

    String getMapDropdownSelected() {
        return getMapDropdown().getAttribute("value");
    }

    void readInterfaceIntoNetworkSettings() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.f5485C) {
            String mapDropdownSelected = getMapDropdownSelected();
            if (mapDropdownSelected == null) {
                mapDropdownSelected = "<No Map>";
            }
            gameEngine.networkEngine.f5597aO.f5649b = mapDropdownSelected;
            gameEngine.networkEngine.f5597aO.f5648a = EnumC0846ai.values()[0];
        }
    }

    public void multiplayerStart() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.f5485C) {
            if (gameEngine.networkEngine.f5597aO.f5648a == EnumC0846ai.f5663a) {
                gameEngine.networkEngine.f5598aP = "maps/skirmish/" + gameEngine.networkEngine.f5597aO.f5649b;
            } else if (gameEngine.networkEngine.f5597aO.f5648a == EnumC0846ai.f5664b) {
                gameEngine.networkEngine.f5598aP = "/SD/rusted_warfare_maps/" + gameEngine.networkEngine.f5597aO.f5649b;
            } else if (gameEngine.networkEngine.f5597aO.f5648a == EnumC0846ai.f5665c) {
                gameEngine.networkEngine.f5598aP = null;
            } else {
                this.libRocket.m7046c("Error: No map type selected");
                return;
            }
            if (gameEngine.networkEngine.f5597aO.f5649b == null || VariableScope.nullOrMissingString.equals(gameEngine.networkEngine.f5597aO.f5649b) || gameEngine.networkEngine.f5597aO.f5649b.equals("<No Map>")) {
                this.libRocket.m7046c("Error: No map selected");
            } else {
                gameEngine.networkEngine.m1724ae();
            }
        } else if (gameEngine.networkEngine.f5489H) {
            gameEngine.networkEngine.m1632k("-start");
        } else {
            GameEngine.m1144b("startNetButton.setOnClickListener", "Clicked but not server or proxy controller");
        }
    }

    public void battleroomSetup() {
        GameEngine gameEngine = GameEngine.getInstance();
        this.lastPlayerTable = null;
        refreshUI();
        this.root.refreshChat();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument != null && gameEngine.networkEngine.f5565F) {
            activeDocument.addClass("singlePlayer");
        }
        gameEngine.networkEngine.m1710as();
    }

    public void refreshUI() {
        GameEngine gameEngine = GameEngine.getInstance();
        Element activeElementById = this.libRocket.getActiveElementById("infoDiv");
        if (activeElementById == null) {
            GameEngine.PrintLog("refreshUI: infoTextElement==null");
            return;
        }
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        boolean z = gameEngine.networkEngine.f5485C || gameEngine.networkEngine.f5489H;
        boolean z2 = gameEngine.networkEngine.f5485C;
        boolean z3 = !z && !gameEngine.networkEngine.f5597aO.f5659m;
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
        if (gameEngine.m1220O()) {
            Iterator it4 = activeDocument.findElementsByClassName("forRealNetworkOnly").iterator();
            while (it4.hasNext()) {
                ((Element) it4.next()).show(false);
            }
        }
        activeElementById.compareAndSetText(gameEngine.networkEngine.m1709at());
        String m1707av = gameEngine.networkEngine.m1707av();
        if (gameEngine.networkEngine.f5597aO.f5648a == EnumC0846ai.f5665c) {
            m1707av = "saves/" + gameEngine.networkEngine.f5597aO.f5649b;
        }
        Element activeElementById2 = this.libRocket.getActiveElementById("mapImage");
        if (gameEngine.networkEngine.f5560v) {
            activeElementById2.hide();
        }
        String attribute = activeElementById2.getAttribute("src");
        if (m1707av == null) {
            if (!VariableScope.nullOrMissingString.equals(attribute)) {
                activeElementById2.setAttribute("src", VariableScope.nullOrMissingString);
            }
        } else {
            String mapThumbnail = this.root.getMapThumbnail(m1707av);
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
        GameEngine gameEngine = GameEngine.getInstance();
        Root.TableData tableData = new Root.TableData();
        ArrayList arrayList = tableData.rows;
        int i = -1;
        int i2 = 0;
        ArrayList m6376a = Team.m6376a(true);
        Iterator it = m6376a.iterator();
        while (it.hasNext()) {
            Team team = (Team) it.next();
            if (team != null) {
                if (i != -1 && i != team.f1311q) {
                    i2++;
                }
                i = team.f1311q;
            }
        }
        int i3 = -1;
        Iterator it2 = m6376a.iterator();
        while (it2.hasNext()) {
            Team team2 = (Team) it2.next();
            if (team2 != null) {
                if (i3 != -1 && i3 != team2.f1311q && i2 <= 3) {
                    Root.TableRow tableRow = new Root.TableRow();
                    for (int i4 = 0; i4 < 4; i4++) {
                        tableRow.addCell(VariableScope.nullOrMissingString).addClass("spacer");
                    }
                    arrayList.add(tableRow);
                }
                i3 = team2.f1311q;
                String str = "unnamed";
                if (team2.f1315u != null) {
                    str = team2.f1315u;
                }
                String m6304x = team2.m6304x();
                String num = Integer.toString(team2.f1305k + 1);
                boolean m6374b = team2.m6374b();
                if (m6374b) {
                    num = "S";
                }
                if (!m6374b && team2.f1320z != null && team2.f1320z.intValue() != gameEngine.networkEngine.f5597aO.f5654g) {
                    num = num + " - " + gameEngine.networkEngine.m1673d(team2.f1320z.intValue());
                }
                String m6325h = team2.m6325h();
                Root.TableRow tableRow2 = new Root.TableRow();
                Root.TableCell addCell = tableRow2.addCell(str);
                if (team2.f1322B != null) {
                    addCell.color = Integer.valueOf(Team.m6321i(team2.f1322B.intValue()));
                }
                if (team2 == gameEngine.networkEngine.f5483z) {
                    addCell.addClass("boldText");
                }
                tableRow2.addCell(num).color = Integer.valueOf(team2.m6411J());
                tableRow2.addCell(m6325h).color = Integer.valueOf(Team.m6321i(team2.f1311q));
                tableRow2.addCell(m6304x);
                tableRow2.setLibrocketOnClick("mp.showPlayerConfig('" + team2.f1305k + "')");
                arrayList.add(tableRow2);
            }
        }
        if (!gameEngine.networkEngine.f5485C && gameEngine.networkEngine.f5497S == null) {
            arrayList.clear();
            String str2 = "Connecting...";
            if (gameEngine.networkEngine.f5600bc.size() == 0) {
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
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.f5483z != null) {
            showPlayerConfig(VariableScope.nullOrMissingString + gameEngine.networkEngine.f5483z.f1305k);
        }
    }

    public void showPlayerConfig(String str) {
        GameEngine.getInstance();
        this.scriptEngine.addRunnableToQueue(new RunnableC00541(str));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.librocket.scripts.Multiplayer$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Multiplayer$1.class */
    public class RunnableC00541 implements Runnable {
        final /* synthetic */ String val$teamIdString;

        RunnableC00541(String str) {
            this.val$teamIdString = str;
        }

        public void run() {
            Multiplayer.this.showPlayerConfigNow(this.val$teamIdString);
        }
    }

    public void showPlayerConfigNow(String str) {
        ElementDocument createAndShowPopup;
        GameEngine gameEngine = GameEngine.getInstance();
        Team m6317k = Team.m6317k(Integer.parseInt(str));
        if (m6317k == null) {
            this.root.logWarn("showPlayerConfig: " + str + "==null");
        } else if ((gameEngine.networkEngine.m1706aw() || (gameEngine.networkEngine.f5483z == m6317k && !gameEngine.networkEngine.f5597aO.f5659m)) && (createAndShowPopup = this.root.createAndShowPopup("battleroom_player.rml", m6317k, m6317k.f1315u)) != null) {
            Element elementById = createAndShowPopup.getElementById("team_id");
            Element elementById2 = createAndShowPopup.getElementById("spawnPoint");
            Element elementById3 = createAndShowPopup.getElementById("allyTeam");
            Element elementById4 = createAndShowPopup.getElementById("aiDifficulty");
            Element elementById5 = createAndShowPopup.getElementById("startingUnits");
            Element elementById6 = createAndShowPopup.getElementById("playerColor");
            Element elementById7 = createAndShowPopup.getElementById("playerOverridesSection");
            Element elementById8 = createAndShowPopup.getElementById("aiDifficultySelection");
            if (!GameEngine.m1104o("sd")) {
                setupStartingUnitDropDown(elementById5, true);
                setupPlayerColorDropDown(elementById6, true, true, m6317k);
            } else {
                GameEngine.PrintLog("sd");
            }
            elementById.setValue(VariableScope.nullOrMissingString + m6317k.f1305k);
            String str2 = VariableScope.nullOrMissingString + (m6317k.f1305k + 1);
            if (m6317k.m6374b()) {
                str2 = "-2";
            }
            elementById2.setValue(str2);
            if (m6317k.f1314t) {
                elementById3.setValue(VariableScope.nullOrMissingString + (m6317k.f1311q + 1));
            } else {
                elementById3.setValue("fromSpawn2");
            }
            if (elementById7 == null) {
                throw new RuntimeException("playerOverridesSection==null");
            }
            if (!gameEngine.networkEngine.f5485C) {
                elementById7.hide();
            }
            if (elementById8 == null) {
                throw new RuntimeException("aiDifficultySelection==null");
            }
            if (!GameEngine.m1104o("s1")) {
                if (m6317k.f1316v) {
                    if (m6317k.f1319y == null) {
                        elementById4.setValue("-99");
                    } else {
                        elementById4.setValue(VariableScope.nullOrMissingString + m6317k.f1319y);
                    }
                } else {
                    elementById8.hide();
                }
            } else {
                GameEngine.PrintLog("s1");
            }
            if (!GameEngine.m1104o("s2")) {
                if (m6317k.f1320z == null) {
                    elementById5.setValue("-99");
                } else {
                    GameEngine.PrintLog("startingUnitOverride: " + m6317k.f1320z);
                    elementById5.setValue(VariableScope.nullOrMissingString + m6317k.f1320z);
                }
            } else {
                GameEngine.PrintLog("s2");
            }
            if (!GameEngine.m1104o("s3")) {
                if (m6317k.f1322B == null) {
                    elementById6.setValue("-99");
                    return;
                }
                GameEngine.PrintLog("playerColor: " + m6317k.f1322B);
                elementById6.setValue(VariableScope.nullOrMissingString + m6317k.f1322B);
                return;
            }
            GameEngine.PrintLog("s3");
        }
    }

    public void teamsSet_apply() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!gameEngine.networkEngine.f5485C) {
            GameEngine.PrintLog("Not server");
            return;
        }
        GameEngine.PrintLog("playerConfig_kick");
        String value = this.libRocket.m7048c().getElementById("teamLayout").getValue();
        if ("2t".equalsIgnoreCase(value)) {
            gameEngine.networkEngine.m1760a(EnumC0852al.layout_2sides);
        } else if ("3t".equalsIgnoreCase(value)) {
            gameEngine.networkEngine.m1760a(EnumC0852al.layout_3sides);
        } else if ("FFA".equalsIgnoreCase(value)) {
            gameEngine.networkEngine.m1760a(EnumC0852al.layout_ffa);
        } else if ("spectators".equalsIgnoreCase(value)) {
            gameEngine.networkEngine.m1760a(EnumC0852al.layout_spectators);
        } else {
            GameEngine.m1145b("teamsSet_apply: unknown layout: " + value);
        }
        refreshUI();
    }

    public void playerConfig_kick() {
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.PrintLog("playerConfig_kick");
        String value = this.libRocket.m7048c().getElementById("team_id").getValue();
        Team m6317k = Team.m6317k(Integer.parseInt(value));
        if (m6317k == null) {
            this.root.logWarn("playerConfig_kick: " + value + "==null");
        } else {
            gameEngine.networkEngine.m1664e(m6317k);
        }
    }

    public void playerConfig_apply() {
        boolean z;
        int i;
        Integer valueOf;
        Integer valueOf2;
        Integer valueOf3;
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.PrintLog("playerConfig_kick");
        String value = this.libRocket.m7048c().getElementById("team_id").getValue();
        Team m6317k = Team.m6317k(Integer.parseInt(value));
        if (m6317k == null) {
            this.root.logWarn("playerConfig_apply: " + value + "==null");
            return;
        }
        ElementDocument m7048c = this.libRocket.m7048c();
        Element elementById = m7048c.getElementById("spawnPoint");
        Element elementById2 = m7048c.getElementById("allyTeam");
        Element elementById3 = m7048c.getElementById("aiDifficulty");
        Element elementById4 = m7048c.getElementById("startingUnits");
        Element elementById5 = m7048c.getElementById("playerColor");
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
            if (intValue > Team.f1364c - 1) {
                intValue = Team.f1364c - 1;
            }
        }
        boolean z3 = false;
        if (z2) {
            i = -3;
            z = true;
        } else if (value3.equals("fromSpawn2")) {
            i = intValue % 2;
            m6317k.f1314t = false;
            z = true;
        } else {
            z = false;
            i = m6317k.f1311q;
            try {
                i = Integer.valueOf(value3).intValue() - 1;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            m6317k.f1314t = true;
        }
        if (m6317k.f1311q != i) {
            if (gameEngine.networkEngine.f5485C) {
                z3 = true;
            } else if (gameEngine.networkEngine.f5489H || gameEngine.networkEngine.f5483z == m6317k) {
                z3 = true;
            } else {
                GameEngine.m1144b("row.setOnClickListener", "Clicked but not server or proxy controller");
            }
        }
        try {
            if (m6317k.f1305k != intValue) {
                if (gameEngine.networkEngine.f5485C) {
                    z3 = false;
                    gameEngine.networkEngine.m1765a(m6317k, intValue);
                    m6317k.f1311q = i;
                } else if (gameEngine.networkEngine.f5489H || gameEngine.networkEngine.f5483z == m6317k) {
                    z3 = false;
                    int i2 = i;
                    if (z) {
                        i2 = -1;
                    }
                    gameEngine.networkEngine.m1764a(m6317k, intValue, Integer.valueOf(i2));
                } else {
                    GameEngine.m1144b("row.setOnClickListener", "Clicked but not server or proxy controller");
                }
            }
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
        if (m6317k.f1316v) {
            int intValue2 = elementById3.getValueAsInt(-99).intValue();
            if (intValue2 == -99) {
                valueOf3 = null;
            } else {
                valueOf3 = Integer.valueOf(intValue2);
            }
            if (m6317k.f1319y != valueOf3) {
                if (gameEngine.networkEngine.f5485C) {
                    m6317k.f1319y = valueOf3;
                } else {
                    GameEngine.PrintLog("aiDifficultyOverride: not server or proxy controller");
                }
            }
        }
        int intValue3 = elementById4.getValueAsInt(-99).intValue();
        GameEngine.PrintLog("startingUnits now: " + intValue3);
        if (intValue3 == -99) {
            valueOf = null;
        } else {
            valueOf = Integer.valueOf(intValue3);
        }
        if (m6317k.f1320z != valueOf) {
            if (gameEngine.networkEngine.f5485C) {
                m6317k.f1320z = valueOf;
            } else {
                GameEngine.PrintLog("startingUnitOverride: not server or proxy controller");
            }
        }
        int intValue4 = elementById5.getValueAsInt(-99).intValue();
        GameEngine.PrintLog("playerColor now: " + intValue4);
        if (intValue4 == -99) {
            valueOf2 = null;
        } else {
            valueOf2 = Integer.valueOf(intValue4);
        }
        if (m6317k.f1322B != valueOf2) {
            if (gameEngine.networkEngine.f5485C) {
                m6317k.f1322B = valueOf2;
            } else {
                GameEngine.PrintLog("colorOverride: not server or proxy controller");
            }
        }
        if (z3) {
            if (gameEngine.networkEngine.f5485C) {
                m6317k.f1311q = i;
            } else if (z) {
                gameEngine.networkEngine.m1698b(m6317k, -1);
            } else {
                gameEngine.networkEngine.m1698b(m6317k, i);
            }
        }
        gameEngine.networkEngine.m1659f();
        gameEngine.networkEngine.m1790M();
        refreshUI();
    }

    public void disconnect(String str) {
        GameEngine.getInstance().networkEngine.m1690b(str);
    }

    public void multiplayerBackPrompt() {
        this.root.showPopup(C0820a.m1886a("menus.ingame.multiplayerClose.title", new Object[0]), "What would you like to do?", true, (C0820a.m1886a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]) + ":") + "closePopup(); mp.disconnect('exited'); back();", null);
    }

    public void surrenderPrompt() {
        this.root.showPopup(C0820a.m1886a("menus.ingame.surrender.title", new Object[0]), C0820a.m1886a("menus.ingame.surrender.message", new Object[0]), true, (C0820a.m1886a("menus.ingame.surrender.surrenderButton", new Object[0]) + ":") + "closePopup(); mp.surrender();", null);
    }

    public void surrender() {
        GameEngine.PrintLog("Surrender requested");
        this.root.sendChatMessage("-surrender");
    }

    public void multiplayerExitPrompt() {
        String m1886a = C0820a.m1886a("menus.ingame.multiplayerClose.titleDisconnect", new Object[0]);
        String m1886a2 = C0820a.m1886a("menus.ingame.multiplayerClose.messageDisconnect", new Object[0]);
        String str = (C0820a.m1886a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]) + ":") + "closePopup(); mp.disconnect('exited'); showMainMenu();";
        String str2 = null;
        if (GameEngine.getInstance().networkEngine.f5485C) {
            m1886a = C0820a.m1886a("menus.ingame.multiplayerClose.title", new Object[0]);
            m1886a2 = C0820a.m1886a("menus.ingame.multiplayerClose.messageEndGame", new Object[0]);
            str = (C0820a.m1886a("menus.ingame.exitGame", new Object[0]) + ":") + "closePopup(); mp.disconnect('exited'); showMainMenu();";
            str2 = (C0820a.m1886a("menus.ingame.multiplayerClose.returnToBattleroom", new Object[0]) + ":") + "closePopup(); mp.sendReturnToBattleroomEvent();";
        }
        this.root.showPopup(m1886a, m1886a2, true, str, str2);
    }

    public void sendReturnToBattleroomEvent() {
        GameEngine.PrintLog("mp.sendReturnToBattleroomEvent()");
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.networkEngine.m1722ag();
        gameEngine.f6111bS.f5201p = false;
    }

    public void addAI() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.f5485C) {
            gameEngine.networkEngine.m1713ap();
        } else if (gameEngine.networkEngine.f5489H) {
            gameEngine.networkEngine.m1632k("-addai");
        } else {
            this.root.logWarn("addAI(): Clicked but not server or proxy controller");
        }
    }

    public String _getRandomDefaultPlayerName() {
        return "Unnamed" + CommonUtils.m2360a(0, 999);
    }

    public void loadUsername() {
        GameEngine.PrintLog("mp.loadUsername()");
        String str = GameEngine.getInstance().f6109bQ.lastNetworkPlayerName;
        Element activeElementById = this.libRocket.getActiveElementById("username");
        String m780c = C1058a.m786a().m780c();
        GameEngine.PrintLog("steamName:" + m780c);
        if (m780c != null && str == null) {
            str = m780c;
        }
        if (str == null || VariableScope.nullOrMissingString.equals(str)) {
            str = _getRandomDefaultPlayerName();
        }
        activeElementById.loadCharsetIfNeeded(str);
        activeElementById.setAttribute("value", str);
    }

    public void getUsernameFromInterface() {
        GameEngine gameEngine = GameEngine.getInstance();
        String valueById = this.root.getValueById("username");
        if (valueById == null) {
            GameEngine.m1145b("getUsernameFromInterface: Cannot find username");
            return;
        }
        String trim = valueById.trim();
        GameEngine.PrintLog("set username:" + trim);
        if (trim.equals(VariableScope.nullOrMissingString)) {
            trim = _getRandomDefaultPlayerName();
        }
        gameEngine.networkEngine.m1745a(trim);
    }

    public void gameOptionsGet() {
        gameOptionsGetOrPush(false);
    }

    public void gameOptionsPush() {
        gameOptionsGetOrPush(true);
    }

    public void gameOptionsRefreshTypes() {
        GameEngine.getInstance();
        ElementDocument m7048c = this.libRocket.m7048c();
        if (this.useMapDropdown) {
            updateMapDropdown(m7048c, "mapsSelector", "typeSelector");
        }
    }

    public void gameOptionsGetOrPush(boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        ElementDocument m7048c = this.libRocket.m7048c();
        Element elementById = m7048c.getElementById("fogMode");
        Element elementById2 = m7048c.getElementById("startingCredits");
        Element elementById3 = m7048c.getElementById("incomeMultiplier");
        Element elementById4 = m7048c.getElementById("noNukes");
        Element elementById5 = m7048c.getElementById("sharedControl");
        Element elementById6 = m7048c.getElementById("aiDifficulty");
        Element elementById7 = m7048c.getElementById("startingUnits");
        if (!z) {
            setupStartingUnitDropDown(elementById7, false);
        }
        Element elementById8 = m7048c.getElementById("typeSelector");
        Element mapDropdown = getMapDropdown();
        if (!z) {
            if (gameEngine.networkEngine.f5597aO.f5648a == null) {
                GameEngine.PrintLog("gameOptionsGetOrPush: game.network.setup.currentType==null");
            } else {
                elementById8.setValue(VariableScope.nullOrMissingString + gameEngine.networkEngine.f5597aO.f5648a.ordinal());
            }
            if (this.useMapDropdown) {
                updateMapDropdown(m7048c, "mapsSelector", "typeSelector");
                Element mapDropdown2 = getMapDropdown();
                GameEngine.PrintLog("new currentMapSelection=" + gameEngine.networkEngine.f5597aO.f5649b);
                mapDropdown2.setValue(VariableScope.nullOrMissingString + gameEngine.networkEngine.f5597aO.f5649b);
            }
            m7048c.getElementById("typeSelector");
            elementById.setValue(VariableScope.nullOrMissingString + gameEngine.networkEngine.f5597aO.f5651d);
            elementById2.setValue(VariableScope.nullOrMissingString + gameEngine.networkEngine.f5597aO.f5650c);
            elementById7.setValue(VariableScope.nullOrMissingString + gameEngine.networkEngine.f5597aO.f5654g);
            gameEngine.networkEngine.f5597aO.f5652e = true;
            elementById4.setCheckbox(gameEngine.networkEngine.f5597aO.f5656i);
            elementById5.setCheckbox(gameEngine.networkEngine.f5597aO.f5646l);
            elementById3.setValue(VariableScope.nullOrMissingString + CommonUtils.m2363a(gameEngine.networkEngine.f5597aO.f5655h, 1) + "x");
            elementById6.setValue(VariableScope.nullOrMissingString + gameEngine.networkEngine.f5597aO.f5653f);
            return;
        }
        C0845ah m1666e = gameEngine.networkEngine.m1666e();
        if (m1666e != null) {
            String str = null;
            if (this.useMapDropdown) {
                str = mapDropdown.getValue();
                if (str == null) {
                    GameEngine.PrintLog("gameOptionsGetOrPush: mapDropdownSelected==null");
                    str = "<No Map>";
                }
            }
            int intValue = elementById8.getValueAsInt(0).intValue();
            EnumC0846ai enumC0846ai = m1666e.f5648a;
            m1666e.f5648a = EnumC0846ai.values()[intValue];
            if (this.useMapDropdown) {
                m1666e.f5649b = str;
            } else if (enumC0846ai != m1666e.f5648a) {
                m1666e.f5649b = null;
            }
            m1666e.f5651d = elementById.getValueAsInt(null).intValue();
            m1666e.f5650c = elementById2.getValueAsInt(null).intValue();
            float f = 1.0f;
            try {
                f = Float.parseFloat(elementById3.getValue().replace("x", VariableScope.nullOrMissingString));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            m1666e.f5655h = f;
            m1666e.f5656i = elementById4.getCheckbox();
            m1666e.f5646l = elementById5.getCheckbox();
            m1666e.f5653f = elementById6.getValueAsInt(null).intValue();
            m1666e.f5654g = elementById7.getValueAsInt(1).intValue();
            gameEngine.networkEngine.m1761a(m1666e);
        }
    }

    public void closeBattleroomIfOpen() {
        GameEngine.getInstance();
        if (this.libRocket.getActiveElementById("battleroomPage") == null) {
            GameEngine.PrintLog("closeBattleroomIfOpen: battleroomPage==null");
        } else {
            this.libRocket.backToLastDocument();
        }
    }

    public void reinviteAsk() {
        this.root.showPopup(C0820a.m1886a("menus.ingame.multiplayerReinvite.title", new Object[0]), "While in-game you can only reinvite players who were in-game before but dropped out", true, "reInvite:closePopup(); mp.showSteamInviteDialog();", null);
    }

    public void showSteamInviteDialog() {
        C1058a.m786a().m776g();
    }

    public void setMapFromPopup(String str) {
        if (!isInControlOfServer()) {
            this.root.sendChatMessage("clicked on '" + this.root.getMapNameFromPath(str) + "'");
            this.root.closePopup();
            return;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        C0845ah m1666e = gameEngine.networkEngine.m1666e();
        if (m1666e != null) {
            String str2 = str;
            if (!str2.contains("MOD|")) {
                str2 = CommonUtils.m2244k(str2);
            }
            m1666e.f5649b = str2;
            gameEngine.networkEngine.m1761a(m1666e);
        }
        this.root.closePopup();
    }

    public void showMapSelect() {
        this.root.showMapPopup(this.root.getModeMapPath(null, null), "mp.setMapFromPopup");
    }

    public boolean isInControlOfServer() {
        GameEngine gameEngine = GameEngine.getInstance();
        return gameEngine.networkEngine.f5485C || gameEngine.networkEngine.f5489H;
    }

    public void askPassword() {
        GameEngine.PrintLog("mp.askPassword()");
        GameEngine.getInstance();
        this.root.showInputPopupNonClose("Password Required", "This server requires a password to join", VariableScope.nullOrMissingString, "Close:mp.cancelPaswordAsk()", "[onenter]Join:mp.askPasswordEntered(getPopupText())");
    }

    public void askPasswordEntered(String str) {
        GameEngine.PrintLog("mp.askPasswordEntered()");
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.networkEngine.f5475n = str;
        gameEngine.networkEngine.m1779X();
        this.root.closePopup();
    }

    public void cancelPaswordAsk() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.f5485C) {
            this.root.logWarn("cancelPaswordAsk: we are the server");
        } else {
            gameEngine.networkEngine.m1690b("Cancel password");
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
            str = str + generateOption("-99", C0820a.m1886a("menus.settings.option.default", new Object[0]), false);
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
            str = str + generateOption("-99", C0820a.m1886a("menus.settings.option.default", new Object[0]), false);
        }
        for (int i = 0; i < 10; i++) {
            boolean z3 = false;
            if (z2 && gameEngine.networkEngine.m1771a(i, team)) {
                z3 = true;
            }
            String m2232w = CommonUtils.m2232w(Team.m6319j(i));
            int i2 = i;
            int i3 = i;
            if (z3) {
                m2232w = m2232w + " (used)";
                i2 = -7829368;
                i3 = -99;
            }
            str = str + generateOption(VariableScope.nullOrMissingString + i3, m2232w, false, Integer.valueOf(Team.m6321i(i2)), z3);
        }
        element.setInnerRML(str);
    }

    public ArrayList getStartingUnitOptions() {
        GameEngine gameEngine = GameEngine.getInstance();
        ArrayList arrayList = new ArrayList();
        Iterator it = gameEngine.networkEngine.m1641i().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            arrayList.add(new DropdownOption(num.toString(), gameEngine.networkEngine.m1673d(num.intValue())));
        }
        return arrayList;
    }
}
