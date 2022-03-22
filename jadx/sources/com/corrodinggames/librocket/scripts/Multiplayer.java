package com.corrodinggames.librocket.scripts;

import com.Element;
import com.ElementDocument;
import com.corrodinggames.librocket.scripts.Root;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0678ah;
import com.corrodinggames.rts.gameFramework.p036g.EnumC0679ai;
import com.corrodinggames.rts.gameFramework.p036g.EnumC0684ak;
import com.corrodinggames.rts.gameFramework.p042l.C0796a;
import com.corrodinggames.rts.p008a.ActivityC0087g;
import com.corrodinggames.rts.p008a.ActivityC0088h;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Multiplayer.class */
public class Multiplayer extends ScriptContext {
    Root root;
    String[] currentDropdownRawArray;
    Root.TableData lastPlayerTable;
    boolean useMapDropdown = false;

    Multiplayer(Root root) {
        this.root = root;
    }

    void updateMapDropdown(Element element, String str, String str2) {
        String[] strArr;
        String[] strArr2;
        AbstractC0789l u = AbstractC0789l.m651u();
        int intValue = element.getElementById(str2).getValueAsInt(0).intValue();
        this.currentDropdownRawArray = null;
        ArrayList arrayList = new ArrayList();
        if (intValue == 0) {
            this.currentDropdownRawArray = C0596a.m1947a("maps/skirmish", true);
            Arrays.sort(this.currentDropdownRawArray);
            for (String str3 : this.currentDropdownRawArray) {
                arrayList.add(ActivityC0087g.m4268d(str3));
            }
        } else if (intValue == 1) {
            this.currentDropdownRawArray = C0596a.m1947a("/SD/rusted_warfare_maps", true);
            if (this.currentDropdownRawArray == null) {
                u.m731a("Could not find folder: /SD/rusted_warfare_maps", 1);
                this.currentDropdownRawArray = new String[0];
            }
            Arrays.sort(this.currentDropdownRawArray);
            for (String str4 : this.currentDropdownRawArray) {
                arrayList.add(ActivityC0087g.m4268d(str4));
            }
        } else if (intValue == 2) {
            this.currentDropdownRawArray = ActivityC0088h.m4265j();
            if (this.currentDropdownRawArray == null) {
                u.m731a("Could not find a save folder on SD card", 1);
                this.currentDropdownRawArray = new String[0];
            }
            for (String str5 : this.currentDropdownRawArray) {
                arrayList.add(ActivityC0087g.m4268d(str5));
            }
        } else {
            throw new RuntimeException("Unknown typeIndex:" + intValue);
        }
        String str6 = "";
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
        AbstractC0789l.m683d("mapList:" + str6);
        if (intValue != 2) {
        }
        element.getElementById("mapsSelectorParent").setInnerRML("<p data-workaround='this stops disappearing select'></p><select id='mapsSelector' class='mapsSelector'><option value='0'>...</option></select>");
        getMapDropdown().setInnerRML(str6);
    }

    String generateOption(String str, String str2, boolean z) {
        String str3 = "";
        if (z) {
            str3 = str3 + " selected='selected'";
        }
        return "<option value=" + this.root.escapedString(str) + " " + str3 + ">" + this.root.htmlString(str2) + "</option>";
    }

    Element getMapDropdown() {
        return this.libRocket.m4310c().findByClassName("mapsSelector");
    }

    String getMapDropdownSelected() {
        return getMapDropdown().getAttribute("value");
    }

    void readInterfaceIntoNetworkSettings() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5486bF.f4664A) {
            String mapDropdownSelected = getMapDropdownSelected();
            if (mapDropdownSelected == null) {
                mapDropdownSelected = "<No Map>";
            }
            u.f5486bF.f4763aH.f4811b = mapDropdownSelected;
            u.f5486bF.f4763aH.f4810a = EnumC0679ai.values()[0];
        }
    }

    public void multiplayerStart() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5486bF.f4664A) {
            if (u.f5486bF.f4763aH.f4810a == EnumC0679ai.f4824a) {
                u.f5486bF.f4764aI = "maps/skirmish/" + u.f5486bF.f4763aH.f4811b;
            } else if (u.f5486bF.f4763aH.f4810a == EnumC0679ai.f4825b) {
                u.f5486bF.f4764aI = "/SD/rusted_warfare_maps/" + u.f5486bF.f4763aH.f4811b;
            } else if (u.f5486bF.f4763aH.f4810a == EnumC0679ai.f4826c) {
                u.f5486bF.f4764aI = null;
            } else {
                this.libRocket.m4308c("Error: No map type selected");
                return;
            }
            if (u.f5486bF.f4763aH.f4811b == null || "".equals(u.f5486bF.f4763aH.f4811b) || u.f5486bF.f4763aH.f4811b.equals("<No Map>")) {
                this.libRocket.m4308c("Error: No map selected");
            } else {
                u.f5486bF.m1371W();
            }
        } else if (u.f5486bF.f4668F) {
            u.f5486bF.m1247i("-start");
        } else {
            AbstractC0789l.m694b("startNetButton.setOnClickListener", "Clicked but not server or proxy controller");
        }
    }

    public void battleroomSetup() {
        AbstractC0789l u = AbstractC0789l.m651u();
        this.lastPlayerTable = null;
        refreshUI();
        this.root.refreshChat();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument != null && u.f5486bF.f4735D) {
            activeDocument.addClass("singlePlayer");
        }
        u.f5486bF.m1316aj();
    }

    public void refreshUI() {
        AbstractC0789l u = AbstractC0789l.m651u();
        Element activeElementById = this.libRocket.getActiveElementById("infoDiv");
        if (activeElementById == null) {
            AbstractC0789l.m683d("refreshUI: infoTextElement==null");
            return;
        }
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        boolean z = u.f5486bF.f4664A || u.f5486bF.f4668F;
        boolean z2 = u.f5486bF.f4664A;
        boolean z3 = !z && !u.f5486bF.f4763aH.f4820l;
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
        if (u.m765I()) {
            Iterator it4 = activeDocument.findElementsByClassName("forRealNetworkOnly").iterator();
            while (it4.hasNext()) {
                ((Element) it4.next()).show(false);
            }
        }
        activeElementById.compareAndSetText(u.f5486bF.m1315ak());
        String am = u.f5486bF.m1313am();
        if (u.f5486bF.f4763aH.f4810a == EnumC0679ai.f4826c) {
            am = "saves/" + u.f5486bF.f4763aH.f4811b;
        }
        Element activeElementById2 = this.libRocket.getActiveElementById("mapImage");
        if (u.f5486bF.f4730t) {
            activeElementById2.hide();
        }
        String attribute = activeElementById2.getAttribute("src");
        if (am != null) {
            String mapThumbnail = this.root.getMapThumbnail(am);
            if (mapThumbnail == null) {
                mapThumbnail = "";
            }
            if (!mapThumbnail.equals(attribute)) {
                activeElementById2.setAttribute("src", mapThumbnail);
            }
        } else if (!"".equals(attribute)) {
            activeElementById2.setAttribute("src", "");
        }
        refreshPlayerTable();
    }

    public void refreshPlayerTable() {
        Root.TableData playerTable = getPlayerTable();
        if (this.lastPlayerTable != null) {
            if (!this.lastPlayerTable.same(playerTable, false)) {
                if (this.lastPlayerTable.same(playerTable, true)) {
                    this.root.updateTableTextOnly("playersDiv", playerTable, this.lastPlayerTable);
                    return;
                }
            } else {
                return;
            }
        }
        this.root.refreshTable("playersDiv", playerTable);
        this.lastPlayerTable = playerTable;
    }

    public Root.TableData getPlayerTable() {
        AbstractC0789l u = AbstractC0789l.m651u();
        Root.TableData tableData = new Root.TableData();
        ArrayList arrayList = tableData.rows;
        int i = -1;
        int i2 = 0;
        ArrayList a = AbstractC0171m.m3799a(true);
        Iterator it = a.iterator();
        while (it.hasNext()) {
            AbstractC0171m mVar = (AbstractC0171m) it.next();
            if (mVar != null) {
                if (!(i == -1 || i == mVar.f1236o)) {
                    i2++;
                }
                i = mVar.f1236o;
            }
        }
        int i3 = -1;
        Iterator it2 = a.iterator();
        while (it2.hasNext()) {
            AbstractC0171m mVar2 = (AbstractC0171m) it2.next();
            if (mVar2 != null) {
                if (!(i3 == -1 || i3 == mVar2.f1236o || i2 > 3)) {
                    Root.TableRow tableRow = new Root.TableRow();
                    for (int i4 = 0; i4 < 4; i4++) {
                        tableRow.addCell("").addClass("spacer");
                    }
                    arrayList.add(tableRow);
                }
                i3 = mVar2.f1236o;
                String str = "unnamed";
                if (mVar2.f1238q != null) {
                    str = mVar2.f1238q;
                }
                String v = mVar2.m3732v();
                String num = Integer.toString(mVar2.f1230i + 1);
                if (mVar2.m3797b()) {
                    num = "S";
                }
                String f = mVar2.m3757f();
                Root.TableRow tableRow2 = new Root.TableRow();
                Root.TableCell addCell = tableRow2.addCell(str);
                if (mVar2 == u.f5486bF.f4662x) {
                    addCell.addClass("boldText");
                }
                tableRow2.addCell(num).color = Integer.valueOf(mVar2.m3827H());
                tableRow2.addCell(f).color = Integer.valueOf(AbstractC0171m.m3742m(mVar2.f1236o));
                tableRow2.addCell(v);
                tableRow2.setLibrocketOnClick("mp.showPlayerConfig('" + mVar2.f1230i + "')");
                arrayList.add(tableRow2);
            }
        }
        if (!u.f5486bF.f4664A && u.f5486bF.f4676P == null) {
            arrayList.clear();
            String str2 = "Connecting...";
            if (u.f5486bF.f4766aV.size() == 0) {
                str2 = "Disconnected";
            }
            Root.TableRow tableRow3 = new Root.TableRow();
            tableRow3.addCell(str2);
            tableRow3.addCell("");
            tableRow3.addCell("");
            tableRow3.addCell("");
            arrayList.add(tableRow3);
        }
        return tableData;
    }

    public void showSetTeamsDialog() {
        AbstractC0789l.m651u();
        if (this.root.createAndShowPopup("battleroom_setTeams.rml", null, "Set Teams") != null) {
        }
    }

    public void showPlayerConfigForSelf() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5486bF.f4662x != null) {
            showPlayerConfig("" + u.f5486bF.f4662x.f1230i);
        }
    }

    public void showPlayerConfig(String str) {
        ElementDocument createAndShowPopup;
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0171m n = AbstractC0171m.m3740n(Integer.parseInt(str));
        if (n == null) {
            this.root.logWarn("showPlayerConfig: " + str + "==null");
        } else if ((u.f5486bF.m1312an() || (u.f5486bF.f4662x == n && !u.f5486bF.f4763aH.f4820l)) && (createAndShowPopup = this.root.createAndShowPopup("battleroom_player.rml", n, n.f1238q)) != null) {
            createAndShowPopup.getElementById("team_id").setValue("" + n.f1230i);
            Element elementById = createAndShowPopup.getElementById("spawnPoint");
            Element elementById2 = createAndShowPopup.getElementById("allyTeam");
            String str2 = "" + (n.f1230i + 1);
            if (n.m3797b()) {
                str2 = "-2";
            }
            elementById.setValue(str2);
            if (n.f1237p) {
                elementById2.setValue("" + (n.f1236o + 1));
            } else {
                elementById2.setValue("fromSpawn2");
            }
        }
    }

    public void teamsSet_apply() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!u.f5486bF.f4664A) {
            AbstractC0789l.m683d("Not server");
            return;
        }
        AbstractC0789l.m683d("playerConfig_kick");
        String value = this.libRocket.m4310c().getElementById("teamLayout").getValue();
        if ("2t".equalsIgnoreCase(value)) {
            u.f5486bF.m1352a(EnumC0684ak.f4832a);
        } else if ("3t".equalsIgnoreCase(value)) {
            u.f5486bF.m1352a(EnumC0684ak.f4833b);
        } else if ("FFA".equalsIgnoreCase(value)) {
            u.f5486bF.m1352a(EnumC0684ak.f4834c);
        } else if ("spectators".equalsIgnoreCase(value)) {
            u.f5486bF.m1352a(EnumC0684ak.f4835d);
        } else {
            AbstractC0789l.m695b("teamsSet_apply: unknown layout: " + value);
        }
        refreshUI();
    }

    public void playerConfig_kick() {
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m683d("playerConfig_kick");
        String value = this.libRocket.m4310c().getElementById("team_id").getValue();
        AbstractC0171m n = AbstractC0171m.m3740n(Integer.parseInt(value));
        if (n == null) {
            this.root.logWarn("playerConfig_kick: " + value + "==null");
        } else {
            u.f5486bF.m1288c(n);
        }
    }

    public void playerConfig_apply() {
        boolean z;
        int i;
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m683d("playerConfig_kick");
        String value = this.libRocket.m4310c().getElementById("team_id").getValue();
        AbstractC0171m n = AbstractC0171m.m3740n(Integer.parseInt(value));
        if (n == null) {
            this.root.logWarn("playerConfig_apply: " + value + "==null");
            return;
        }
        Element elementById = this.libRocket.m4310c().getElementById("spawnPoint");
        Element elementById2 = this.libRocket.m4310c().getElementById("allyTeam");
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
            if (intValue > AbstractC0171m.f1275a - 1) {
                intValue = AbstractC0171m.f1275a - 1;
            }
        }
        boolean z3 = false;
        if (z2) {
            i = -3;
            z = true;
        } else if (value3.equals("fromSpawn2")) {
            i = intValue % 2;
            n.f1237p = false;
            z = true;
        } else {
            z = false;
            i = n.f1236o;
            try {
                i = Integer.valueOf(value3).intValue() - 1;
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            n.f1237p = true;
        }
        if (n.f1236o != i) {
            if (u.f5486bF.f4664A) {
                z3 = true;
            } else if (u.f5486bF.f4668F || u.f5486bF.f4662x == n) {
                z3 = true;
            } else {
                AbstractC0789l.m694b("row.setOnClickListener", "Clicked but not server or proxy controller");
            }
        }
        try {
            if (n.f1230i != intValue) {
                if (u.f5486bF.f4664A) {
                    z3 = false;
                    u.f5486bF.m1357a(n, intValue);
                    n.f1236o = i;
                } else if (u.f5486bF.f4668F || u.f5486bF.f4662x == n) {
                    z3 = false;
                    int i2 = i;
                    if (z) {
                        i2 = -1;
                    }
                    u.f5486bF.m1356a(n, intValue, Integer.valueOf(i2));
                } else {
                    AbstractC0789l.m694b("row.setOnClickListener", "Clicked but not server or proxy controller");
                }
            }
        } catch (NumberFormatException e2) {
            e2.printStackTrace();
        }
        if (z3) {
            if (u.f5486bF.f4664A) {
                n.f1236o = i;
            } else if (z) {
                u.f5486bF.m1301b(n, -1);
            } else {
                u.f5486bF.m1301b(n, i);
            }
        }
        u.f5486bF.m1388F();
        refreshUI();
    }

    public void disconnect(String str) {
        AbstractC0789l.m651u().f5486bF.m1295b(str);
    }

    public void multiplayerBackPrompt() {
        this.root.showPopup(C0652a.m1589a("menus.ingame.multiplayerClose.title", new Object[0]), "What would you like to do?", true, (C0652a.m1589a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]) + ":") + "closePopup(); mp.disconnect('exited'); back();", null);
    }

    public void surrenderPrompt() {
        this.root.showPopup(C0652a.m1589a("menus.ingame.surrender.title", new Object[0]), C0652a.m1589a("menus.ingame.surrender.message", new Object[0]), true, (C0652a.m1589a("menus.ingame.surrender.surrenderButton", new Object[0]) + ":") + "closePopup(); mp.surrender();", null);
    }

    public void surrender() {
        AbstractC0789l.m683d("Surrender requested");
        this.root.sendChatMessage("-surrender");
    }

    public void multiplayerExitPrompt() {
        this.root.showPopup(C0652a.m1589a("menus.ingame.multiplayerClose.title", new Object[0]), "Are you sure you want to disconnect, and end this game?", true, (C0652a.m1589a("menus.ingame.multiplayerClose.disconnectButton", new Object[0]) + ":") + "closePopup(); mp.disconnect('exited'); showMainMenu();", null);
    }

    public void addAI() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5486bF.f4664A) {
            u.f5486bF.m1319ag();
        } else if (u.f5486bF.f4668F) {
            u.f5486bF.m1247i("-addai");
        } else {
            this.root.logWarn("addAI(): Clicked but not server or proxy controller");
        }
    }

    public String _getRandomDefaultPlayerName() {
        return "Unnamed" + C0654f.m1567a(0, 999);
    }

    public void loadUsername() {
        AbstractC0789l.m683d("mp.loadUsername()");
        String str = AbstractC0789l.m651u().f5479by.lastNetworkPlayerName;
        Element activeElementById = this.libRocket.getActiveElementById("username");
        String c = C0796a.m645a().mo639c();
        AbstractC0789l.m683d("steamName:" + c);
        if (c != null && str == null) {
            str = c;
        }
        if (str == null || "".equals(str)) {
            str = _getRandomDefaultPlayerName();
        }
        activeElementById.loadCharsetIfNeeded(str);
        activeElementById.setAttribute("value", str);
    }

    public void getUsernameFromInterface() {
        AbstractC0789l u = AbstractC0789l.m651u();
        String valueById = this.root.getValueById("username");
        if (valueById == null) {
            AbstractC0789l.m695b("getUsernameFromInterface: Cannot find username");
            return;
        }
        String trim = valueById.trim();
        AbstractC0789l.m683d("set username:" + trim);
        if (trim.equals("")) {
            trim = _getRandomDefaultPlayerName();
        }
        u.f5486bF.m1337a(trim);
    }

    public void gameOptionsGet() {
        gameOptionsGetOrPush(false);
    }

    public void gameOptionsPush() {
        gameOptionsGetOrPush(true);
    }

    public void gameOptionsRefreshTypes() {
        AbstractC0789l.m651u();
        ElementDocument c = this.libRocket.m4310c();
        if (this.useMapDropdown) {
            updateMapDropdown(c, "mapsSelector", "typeSelector");
        }
    }

    public void gameOptionsGetOrPush(boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        ElementDocument c = this.libRocket.m4310c();
        Element elementById = c.getElementById("fogMode");
        Element elementById2 = c.getElementById("startingCredits");
        Element elementById3 = c.getElementById("incomeMultiplier");
        Element elementById4 = c.getElementById("noNukes");
        Element elementById5 = c.getElementById("sharedControl");
        Element elementById6 = c.getElementById("aiDifficulty");
        Element elementById7 = c.getElementById("startingUnits");
        if (!z) {
            setupStartingUnitDropDown(elementById7);
        }
        Element elementById8 = c.getElementById("typeSelector");
        Element mapDropdown = getMapDropdown();
        if (!z) {
            if (u.f5486bF.f4763aH.f4810a == null) {
                AbstractC0789l.m683d("gameOptionsGetOrPush: game.network.setup.currentType==null");
            } else {
                elementById8.setValue("" + u.f5486bF.f4763aH.f4810a.ordinal());
            }
            if (this.useMapDropdown) {
                updateMapDropdown(c, "mapsSelector", "typeSelector");
                Element mapDropdown2 = getMapDropdown();
                AbstractC0789l.m683d("new currentMapSelection=" + u.f5486bF.f4763aH.f4811b);
                mapDropdown2.setValue("" + u.f5486bF.f4763aH.f4811b);
            }
            c.getElementById("typeSelector");
            elementById.setValue("" + u.f5486bF.f4763aH.f4813d);
            elementById2.setValue("" + u.f5486bF.f4763aH.f4812c);
            elementById7.setValue("" + u.f5486bF.f4763aH.f4816g);
            u.f5486bF.f4763aH.f4814e = true;
            elementById4.setCheckbox(u.f5486bF.f4763aH.f4818i);
            elementById5.setCheckbox(u.f5486bF.f4763aH.f4809k);
            elementById3.setValue("" + C0654f.m1570a(u.f5486bF.f4763aH.f4817h, 1) + "x");
            elementById6.setValue("" + u.f5486bF.f4763aH.f4815f);
            return;
        }
        C0678ah c2 = u.f5486bF.m1291c();
        if (c2 != null) {
            String str = null;
            if (this.useMapDropdown) {
                str = mapDropdown.getValue();
                if (str == null) {
                    AbstractC0789l.m683d("gameOptionsGetOrPush: mapDropdownSelected==null");
                    str = "<No Map>";
                }
            }
            int intValue = elementById8.getValueAsInt(0).intValue();
            EnumC0679ai aiVar = c2.f4810a;
            c2.f4810a = EnumC0679ai.values()[intValue];
            if (this.useMapDropdown) {
                c2.f4811b = str;
            } else if (aiVar != c2.f4810a) {
                c2.f4811b = null;
            }
            c2.f4813d = elementById.getValueAsInt(null).intValue();
            c2.f4812c = elementById2.getValueAsInt(null).intValue();
            float f = 1.0f;
            try {
                f = Float.parseFloat(elementById3.getValue().replace("x", ""));
            } catch (NumberFormatException e) {
                e.printStackTrace();
            }
            c2.f4817h = f;
            c2.f4818i = elementById4.getCheckbox();
            c2.f4809k = elementById5.getCheckbox();
            c2.f4815f = elementById6.getValueAsInt(null).intValue();
            c2.f4816g = elementById7.getValueAsInt(1).intValue();
            u.f5486bF.m1353a(c2);
        }
    }

    public void closeBattleroomIfOpen() {
        AbstractC0789l.m651u();
        if (this.libRocket.getActiveElementById("battleroomPage") == null) {
            AbstractC0789l.m683d("closeBattleroomIfOpen: battleroomPage==null");
        } else {
            this.libRocket.backToLastDocument();
        }
    }

    public void reinviteAsk() {
        this.root.showPopup(C0652a.m1589a("menus.ingame.multiplayerReinvite.title", new Object[0]), "While in-game you can only reinvite players who were in-game before but dropped out", true, "reInvite:closePopup(); mp.showSteamInviteDialog();", null);
    }

    public void showSteamInviteDialog() {
        C0796a.m645a().mo635g();
    }

    public void setMapFromPopup(String str) {
        if (!isInControlOfServer()) {
            this.root.sendChatMessage("clicked on '" + this.root.getMapNameFromPath(str) + "'");
            this.root.closePopup();
            return;
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        C0678ah c = u.f5486bF.m1291c();
        if (c != null) {
            String str2 = str;
            if (!str2.contains("MOD|")) {
                str2 = C0654f.m1469k(str2);
            }
            c.f4811b = str2;
            u.f5486bF.m1353a(c);
        }
        this.root.closePopup();
    }

    public void showMapSelect() {
        this.root.showMapPopup(this.root.getModeMapPath(null, null), "mp.setMapFromPopup");
    }

    public boolean isInControlOfServer() {
        AbstractC0789l u = AbstractC0789l.m651u();
        return u.f5486bF.f4664A || u.f5486bF.f4668F;
    }

    public void askPassword() {
        AbstractC0789l.m683d("mp.askPassword()");
        AbstractC0789l.m651u();
        this.root.showInputPopupNonClose("Password Required", "This server requires a password to join", "", "Close:mp.cancelPaswordAsk()", "[onenter]Join:mp.askPasswordEntered(getPopupText())");
    }

    public void askPasswordEntered(String str) {
        AbstractC0789l.m683d("mp.askPasswordEntered()");
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5486bF.f4654m = str;
        u.f5486bF.m1378P();
        this.root.closePopup();
    }

    public void cancelPaswordAsk() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5486bF.f4664A) {
            this.root.logWarn("cancelPaswordAsk: we are the server");
        } else {
            u.f5486bF.m1295b("Cancel password");
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

    public void setupStartingUnitDropDown(Element element) {
        String str = "";
        Iterator it = getStartingUnitOptions().iterator();
        while (it.hasNext()) {
            DropdownOption dropdownOption = (DropdownOption) it.next();
            str = str + generateOption(dropdownOption.key, dropdownOption.value, false);
        }
        element.setInnerRML(str);
    }

    public ArrayList getStartingUnitOptions() {
        AbstractC0789l u = AbstractC0789l.m651u();
        ArrayList arrayList = new ArrayList();
        Iterator it = u.f5486bF.m1260g().iterator();
        while (it.hasNext()) {
            Integer num = (Integer) it.next();
            arrayList.add(new DropdownOption(num.toString(), u.f5486bF.m1280d(num.intValue())));
        }
        return arrayList;
    }
}
