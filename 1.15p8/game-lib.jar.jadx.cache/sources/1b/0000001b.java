package com.corrodinggames.librocket.scripts;

import android.graphics.Color;
import com.Element;
import com.ElementDocument;
import com.corrodinggames.librocket.AbstractC0048b;
import com.corrodinggames.librocket.C0051e;
import com.corrodinggames.librocket.Main;
import com.corrodinggames.rts.appFramework.ActivityC0112i;
import com.corrodinggames.rts.appFramework.ActivityC0113j;
import com.corrodinggames.rts.appFramework.ActivityC0123p;
import com.corrodinggames.rts.appFramework.ActivityC0125q;
import com.corrodinggames.rts.appFramework.C0086c;
import com.corrodinggames.rts.game.System_Hcat;
import com.corrodinggames.rts.game.map.C0173f;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0658bn;
import com.corrodinggames.rts.gameFramework.C0742g;
import com.corrodinggames.rts.gameFramework.C0830j;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.Enum_System;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.InputControllerB;
import com.corrodinggames.rts.gameFramework.file.C0670a;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.C0784b;
import com.corrodinggames.rts.gameFramework.network.C0790g;
import com.corrodinggames.rts.gameFramework.network.C0797n;
import com.corrodinggames.rts.gameFramework.network.Connection;
import com.corrodinggames.rts.gameFramework.network.RunnableC0772al;
import com.corrodinggames.rts.gameFramework.network.Setup;
import com.corrodinggames.rts.gameFramework.network.mapType;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0832b;
import com.corrodinggames.rts.gameFramework.p039j.C0831a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root.class */
public class Root extends ScriptContext {
    public static final boolean DEBUG_TIMING = true;
    public Multiplayer multiplayer;
    public Mods mods;
    C0658bn openDocumentTimer = new C0658bn("openDocument", true);
    RunnableC0772al threadedGameConnector;
    ElementDocument lastConnectingPopup;
    static C0658bn convertTextStopwatch = new C0658bn("ConvertText", true);
    static C0658bn loadSettingsStopwatch = new C0658bn("LoadSettings", true);
    ArrayList lastSortedDiscoveredServers;

    public void logDebug(String str) {
        GameEngine.PrintLOG("ui[debug]: " + str);
    }

    public void logWarn(String str) {
        GameEngine.PrintLOG("ui[warn]: " + str);
    }

    public void back() {
        this.libRocket.backToLastDocument();
        if (this.libRocket.getActiveDocument() == null) {
            GameEngine.log("back: libRocket.getActiveDocument()==null");
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine == null || !gameEngine.gameRunning) {
                GameEngine.log("back: showing main menu!");
                showMainMenu();
                return;
            }
            GameEngine.log("back: resuming game");
            this.guiEngine.m4535a(false);
        }
    }

    public void backOrClose() {
        if (closePopup()) {
            return;
        }
        this.libRocket.backToLastDocument();
    }

    public String fullVersionOnlyStyle() {
        if (GameEngine.getInstance().f5936at) {
            return "notInDemo";
        }
        return VariableScope.nullOrMissingString;
    }

    public void openIfNotDemo(String str, Object obj, String str2) {
        if (GameEngine.getInstance().f5936at) {
            alert(str2);
        } else {
            open(str, obj);
        }
    }

    public String getVersionName() {
        return GameEngine.getInstance().getCurGameVersion();
    }

    public void delayedOpenNoHistory(final String str, Object obj) {
        this.scriptEngine.addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.1
            @Override // java.lang.Runnable
            public void run() {
                Root.this.libRocket.setDocument(str, null, false);
                Root.this.onShowNewScreen();
            }
        }).framesDelay = 1;
    }

    public void openAfterHelpPopup(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (GameEngine.isIOS() && !gameEngine.curSettings.hasPlayedGameOrSeenHelp) {
            gameEngine.curSettings.hasPlayedGameOrSeenHelp = true;
            gameEngine.curSettings.save();
            showPopup(VariableScope.nullOrMissingString, "First time playing? Would you like to view the quick help slides?", false, "[onenter]View Help:closePopup(); open('help_quick_mobile.rml');", "Skip:closePopup(); open(" + restrictedString(str) + ");");
            return;
        }
        open(str, null);
    }

    public void open(String str, Object obj) {
        this.openDocumentTimer.m2268a();
        AbstractC0048b.f353a.m2263f();
        HashMap hashMap = null;
        if (obj != null) {
            hashMap = new HashMap();
            hashMap.put("mode", obj);
        }
        this.libRocket.setDocument(str, hashMap);
        onShowNewScreen();
        this.openDocumentTimer.m2265d();
        AbstractC0048b.f353a.m2264e();
    }

    public void onShowNewScreen() {
        this.guiEngine.m4535a(true);
    }

    public void resume() {
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
        this.guiEngine.resumeGame();
    }

    public void resumeNonMenu() {
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
        this.guiEngine.m4535a(false);
    }

    public void startNew(String str) {
        this.guiEngine.m4536a(str);
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void showRangeValue(String str, String str2, boolean z) {
        String str3;
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            logWarn("Could not find:" + str);
            return;
        }
        String attribute = activeElementById.getAttribute("value");
        if (z) {
            str3 = new Float(attribute).toString();
        } else {
            str3 = Integer.toString((int) Float.parseFloat(attribute));
        }
        Element activeElementById2 = this.libRocket.getActiveElementById(str2);
        if (activeElementById2 == null) {
            logWarn("Could not find:" + str2);
        } else {
            activeElementById2.setText(str3);
        }
    }

    public String getValueById(String str) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            logWarn("Could not find:" + str);
            return null;
        }
        return activeElementById.getAttribute("value");
    }

    public void setValueById(String str, String str2) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            logWarn("Could not find:" + str);
        } else {
            activeElementById.setAttribute("value", str2);
        }
    }

    public Element getElementById(String str) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            logWarn("Could not find:" + str);
            return null;
        }
        return activeElementById;
    }

    public boolean clickElement(Element element) {
        if (element == null) {
            logWarn("element is null");
            return false;
        }
        element.click();
        return true;
    }

    public void directJoinPopup() {
        GameEngine gameEngine = GameEngine.getInstance();
        String str = VariableScope.nullOrMissingString;
        if (gameEngine.curSettings.lastNetworkIP != null) {
            str = gameEngine.curSettings.lastNetworkIP;
        }
        showInputPopup("Direct Join", "Enter IP address or host name", str, "[onenter]Join:joinServerFromPopup(getPopupText())", null);
    }

    public void joinServerFromPopup(String str) {
        closePopup();
        hideKeyboard();
        if (str == null) {
            logDebug("joinAddress==null");
            return;
        }
        String trim = str.trim();
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.curSettings.lastNetworkIP = trim;
        gameEngine.curSettings.save();
        joinServerWithId(trim, null);
    }

    public void joinServerWithId(String str, String str2) {
        GameEngine.getInstance().networkEngine.f5172bE = str2;
        joinServer(str);
    }

    public void joinServer(String str) {
        logDebug("joinAddress=" + str);
        this.threadedGameConnector = GameEngine.getInstance().networkEngine.m1466a(str, false, new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.2
            @Override // java.lang.Runnable
            public void run() {
                ScriptEngine.getInstance().addScriptToQueue("joinServerCallback();");
            }
        });
        this.lastConnectingPopup = createAndShowPopup("multiplayerLobby_connecting.rml", null, "Please wait");
    }

    public void joinServerCallback() {
        logDebug("joinServerCallback");
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.threadedGameConnector == null) {
            logDebug("threadedGameConnector==null");
            return;
        }
        closePopupOnly();
        if (this.threadedGameConnector.f5237e != null) {
            if (this.threadedGameConnector.f5237e.equals("CANCELLED")) {
                logDebug("Server join cancelled");
                return;
            } else {
                logWarn("Server join failed");
                showPopup("Connection failed", this.threadedGameConnector.f5237e, true, null, null);
            }
        } else {
            try {
                gameEngine.networkEngine.disconnect("starting new");
                gameEngine.networkEngine.m1465a(this.threadedGameConnector.f5239g);
                logDebug("connected");
                showBattleroom();
            } catch (IOException e) {
                gameEngine.showMessageBox(e.getMessage(), "Connection failed");
                e.printStackTrace();
            }
        }
        this.threadedGameConnector = null;
    }

    public void cancelJoinServer() {
        if (this.threadedGameConnector != null) {
            if (this.threadedGameConnector.m1337a()) {
                closePopup();
                return;
            }
            return;
        }
        closePopup();
    }

    public void alert(String str) {
        showAlert(str);
    }

    public void showAlert(String str) {
        logDebug("alert:" + str);
        if (str == null) {
            str = "null";
        }
        this.libRocket.m4504c(str);
    }

    public void showPopupWithButtons(String str, String str2, boolean z, C0051e c0051e, C0051e c0051e2) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        this.libRocket.m4514a(str, str2, (String) null, c0051e, c0051e2, z);
    }

    public void showPopupWithButtonsAndInput(String str, String str2, boolean z, String str3, C0051e c0051e, C0051e c0051e2) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        if (str3 == null) {
            str3 = VariableScope.nullOrMissingString;
        }
        if (VariableScope.nullOrMissingString.equals(str3)) {
            this.guiEngine.m4525k();
        }
        this.libRocket.m4513a(str, str2, str3, c0051e, c0051e2, true, z);
    }

    public void showPopup(String str, String str2, boolean z, String str3, String str4) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        this.libRocket.m4512a(str, str2, (String) null, str3, str4, z);
    }

    public void showInputPopup(String str, String str2, String str3, String str4, String str5) {
        logDebug("showInputPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        String str6 = str3;
        if (str6 == null) {
            str6 = VariableScope.nullOrMissingString;
        }
        if (VariableScope.nullOrMissingString.equals(str6)) {
            this.guiEngine.m4525k();
        }
        this.libRocket.m4512a(str, str2, str6, str4, str5, true);
    }

    public void showInputPopupNonClose(String str, String str2, String str3, String str4, String str5) {
        logDebug("showInputPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        String str6 = str3;
        if (str6 == null) {
            str6 = VariableScope.nullOrMissingString;
        }
        if (VariableScope.nullOrMissingString.equals(str6)) {
            this.guiEngine.m4525k();
        }
        this.libRocket.m4513a(str, str2, str6, str4, str5, true, false);
    }

    public ElementDocument getPopup() {
        return this.libRocket.m4506c();
    }

    public ElementDocument getAlertOrPopup() {
        return this.libRocket.m4501e();
    }

    public boolean closePopup() {
        return this.libRocket.m4498h();
    }

    public boolean closePopupOnly() {
        return this.libRocket.m4496j();
    }

    public boolean closeAlertOnly() {
        return this.libRocket.m4497i();
    }

    public String getPopupText() {
        return this.libRocket.m4495k();
    }

    public void showHostOptions() {
        this.libRocket.m4512a("Host game", m4494i("menus.hostgame.info_pc"), (String) null, "Host Private:closePopup();hostStart(false);", "Host Public:closePopup();hostStart(true);", true);
    }

    public void hostStartFromPopup(boolean z) {
        ElementDocument m4499g = this.libRocket.m4499g();
        Element elementById = m4499g.getElementById("password");
        String str = null;
        if (elementById == null) {
            logWarn("hostStartFromPopup: password==null");
        } else {
            String value = elementById.getValue();
            if (value != null && !value.trim().equals(VariableScope.nullOrMissingString)) {
                str = value;
            }
        }
        boolean checkbox = m4499g.getElementById("useMods").getCheckbox();
        closePopup();
        hostStartWithPasswordAndMods(z, str, checkbox);
    }

    public void hostStart(boolean z) {
        GameEngine.log("old version of hostStart");
        hostStartWithPassword(z, null);
    }

    public void hostStartWithPassword(boolean z, String str) {
        GameEngine.log("old version of hostStartWithPassword");
        hostStartWithPasswordAndMods(z, str, true);
    }

    public void hostStartWithPasswordAndMods(boolean z, String str, boolean z2) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.networkEngine.disconnect("starting new");
        gameEngine.networkEngine.f5104n = str;
        gameEngine.networkEngine.mods = z2;
        gameEngine.networkEngine.f5107q = z;
        if (gameEngine.networkEngine.m1421b(false)) {
            logDebug("-Hosting-");
            logDebug("using password: " + (gameEngine.networkEngine.f5104n != null));
            logDebug("using mods: " + (gameEngine.networkEngine.mods));
            logDebug("public: " + (gameEngine.networkEngine.f5107q));
            String m1442aq = gameEngine.networkEngine.m1442aq();
            if (m1442aq != null && !C0670a.m2158h(m1442aq)) {
                GameEngine.log("hostStart: map does not exist: " + m1442aq + " reseting");
                m1442aq = null;
            }
            if (m1442aq == null) {
                gameEngine.networkEngine.setup.currentType = mapType.values()[0];
                gameEngine.networkEngine.mapFilePath = "maps/skirmish/[p8]Many Islands (8p).tmx";
                gameEngine.networkEngine.setup.mapFileName = "[p8]Many Islands (8p).tmx";
            }
            this.libRocket.setDocument("battleroom.rml", null);
            return;
        }
        logWarn("hosting failed");
    }

    public void exit() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.curSettings.numLoadsSinceRunningGameOrNormalExit != 0) {
            gameEngine.curSettings.numLoadsSinceRunningGameOrNormalExit = 0;
            gameEngine.curSettings.save();
        }
        this.scriptEngine.addRunnableToQueue(new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.3
            @Override // java.lang.Runnable
            public void run() {
                Root.this.guiEngine.mo287d(true);
            }
        });
    }

    public String getMapDetails(String str) {
        return "hello 123";
    }

    public String getHTMLMapNameFromPath(String str) {
        return htmlString(getMapNameFromPath(str));
    }

    public String getMapNameFromPath(String str) {
        return convertMapName(new File(str).getName());
    }

    public String convertMapName(String str) {
        return LangLocale.m1603b(convertMapNameWithoutTranslation(str));
    }

    public String convertMapNameWithoutTranslation(String str) {
        return ActivityC0112i.m4415e(str);
    }

    public String getHTMLMapThumbnail(String str) {
        return escapedString(getMapThumbnail(str));
    }

    public String getMapThumbnail(String str) {
        if (str.startsWith("saves/")) {
        }
        String findTmxMapImg = C0086c.findTmxMapImg(str);
        String str2 = "thumbnail:assets:" + findTmxMapImg;
        if (!C0670a.m2158h(findTmxMapImg)) {
            if (GameEngine.isIOS_Device) {
                GameEngine.PrintLOG_err("getMapThumbnail: Failed to find: " + findTmxMapImg);
                return "drawable:error_missingmap.png";
            }
            return "drawable:error_missingmap.png";
        }
        return str2;
    }

    public boolean isMapSkirmish(String str) {
        return ActivityC0112i.m4414f(str);
    }

    public void showLevelOptions() {
        GameEngine gameEngine = GameEngine.getInstance();
        String str = (String) this.libRocket.m4508b("mode");
        if (str == null) {
            GameEngine.LogTrace("levelPath==null");
            return;
        }
        boolean z = true;
        if (!isMapSkirmish(str)) {
            z = false;
        }
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        Iterator it = activeDocument.findElementsByClassName("skirmishOnly").iterator();
        while (it.hasNext()) {
            ((Element) it.next()).show(z);
        }
        Element elementById = activeDocument.getElementById("advancedButton");
        if (elementById != null) {
            elementById.show(z || ActivityC0112i.m4413g(str));
        }
        activeDocument.getElementById("aiDifficulty").setValue(VariableScope.nullOrMissingString + gameEngine.curSettings.aiDifficulty);
    }

    public void loadConfigAndStartSwitchToAdvanced(String str) {
        GameEngine.getInstance().editorMode = false;
        loadConfigCommon(str, true);
        _startAdvancedMode(false);
    }

    private void _startAdvancedMode(boolean z) {
        boolean z2;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.networkEngine.disconnect("starting singleplayer");
        gameEngine.networkEngine.f5110y = "You";
        gameEngine.networkEngine.mods = true;
        if (z) {
            z2 = gameEngine.networkEngine.m1514N();
        } else {
            z2 = gameEngine.networkEngine.m1513O();
        }
        if (z2) {
            logDebug("started startSinglePlayerServer");
            Setup m1420c = gameEngine.networkEngine.m1420c();
            if (m1420c != null) {
                m1420c.aiDifficulty = gameEngine.curSettings.aiDifficulty;
                gameEngine.networkEngine.m1486a(m1420c);
            }
            this.libRocket.setDocument("battleroom.rml", null);
            return;
        }
        logWarn("failed startSinglePlayerServer");
    }

    public void loadConfigAndStartNewSandbox(String str) {
        _loadConfigAndStartNewSandboxCommon(str, true);
    }

    public void loadConfigAndStartNewSandboxInAdvanced(String str) {
        GameEngine.PrintLOG("loadConfigAndStartNewSandboxInAdvanced");
        _loadConfigAndStartNewSandboxCommon(str, false);
        _startAdvancedMode(true);
        GameEngine.PrintLOG("editorMode:" + GameEngine.getInstance().editorMode);
    }

    private void _loadConfigAndStartNewSandboxCommon(String str, boolean z) {
        if (str.startsWith("saves/")) {
            GameEngine.PrintLOG("Starting sandbox from save: " + str);
            loadGame(str.substring("saves/".length()));
        } else {
            GameEngine.PrintLOG("Starting sandbox from map: " + str);
            loadConfigCommon(str, false);
        }
        GameEngine game = GameEngine.getInstance();
        game.map.f818D = false;
        game.interfaceEngine.m1817w();
        game.editorMode = true;
        if (z) {
            this.guiEngine.resumeGame();
        }
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void loadConfigAndStartNew(String str) {
        GameEngine game = GameEngine.getInstance();
        game.editorMode = false;
        game.networkEngine.disconnect("starting singleplayer");
        loadConfigCommon(str, false);
        this.guiEngine.resumeGame();
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void loadConfigCommon(String str, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        gameEngine.curSettings.aiDifficulty = activeDocument.getElementById("aiDifficulty").getValueAsInt(0).intValue();
        gameEngine.curSettings.save();
        this.guiEngine.endGame(true);
        this.guiEngine.m4530c(false);
        boolean isMapSkirmish = isMapSkirmish(str);
        int intValue = activeDocument.getElementById("numberOfAIs").getValueAsInt(4).intValue();
        boolean z2 = true;
        int intValue2 = activeDocument.getElementById("aiTeams").getValueAsInt(1).intValue();
        int i = intValue2 - 1;
        if (intValue2 == 5) {
            i = 0;
            z2 = false;
        }
        ActivityC0112i.m4417a(str, isMapSkirmish, intValue, i, z2, z);
    }

    public void showMapPopup(String str, String str2) {
        ElementDocument m4516a = this.libRocket.m4516a("levelSelect.rml", (Object) str, "Map Select", false);
        if (m4516a != null) {
            m4516a.setMetadata("mapClickFunction", str2);
            Iterator it = m4516a.findElementsByClassName("noStyleInPopup").iterator();
            while (it.hasNext()) {
                ((Element) it.next()).setAttribute("class", VariableScope.nullOrMissingString);
            }
            if (showMapsWithDoc(m4516a)) {
                GameEngine.PrintLOG("showMapsWithDoc passed");
                this.libRocket.m4498h();
                this.libRocket.m4520a(m4516a);
            }
        }
    }

    public void refreshAfterFileImport() {
        GameEngine.PrintLOG("refreshAfterFileImport");
        GameEngine.getInstance().ModEngine.m1571j();
        this.libRocket.reloadDocument();
    }

    public boolean showMaps() {
        return showMapsWithDoc(this.libRocket.m4500f());
    }

    public boolean showMapsWithDoc(ElementDocument elementDocument) {
        String[] strArr;
        String[] strArr2;
        String str;
        String str2;
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.PrintLOG("showMaps");
        if (elementDocument == null) {
            GameEngine.PrintLOG("showMaps: elementDocument==null");
            return false;
        }
        Element elementById = elementDocument.getElementById("mapTemplateHolder");
        Element elementById2 = elementDocument.getElementById("mapHolder");
        String innerRML = elementById.getInnerRML();
        String str3 = VariableScope.nullOrMissingString;
        String str4 = (String) elementDocument.getMetadata("mode");
        String str5 = (String) elementDocument.getMetadata("mapClickFunction");
        boolean equals = str4.equals("saves");
        boolean equals2 = str4.equals("replays");
        boolean startsWith = str4.startsWith("/SD/");
        if (equals) {
            strArr = ActivityC0113j.m4412l();
            if (strArr == null) {
                gameEngine.alert("No saves", 1);
                return false;
            }
        } else if (equals2) {
            strArr = ActivityC0125q.m4385l();
            if (!gameEngine.curSettings.saveMultiplayerReplays) {
                alert("Note: Multiplayer replay recordings are not turned on. You can enable them in the settings.");
            }
            if (strArr == null) {
                if (gameEngine.curSettings.saveMultiplayerReplays) {
                    gameEngine.alert("No replays yet", 1);
                    return false;
                }
                return false;
            }
        } else {
            strArr = gameEngine.ModEngine.m1586a(C0670a.m2174a(str4, true), str4);
            if (strArr == null) {
                gameEngine.alert("Could not find folder: " + C0670a.m2162e(str4), 1);
                return false;
            }
        }
        String str6 = str4 + "/";
        int i = 0;
        for (String str7 : strArr) {
            String convertMapName = convertMapName(str7);
            boolean m4418a = ActivityC0112i.m4418a(str7, str6 + str7);
            String str8 = convertMapName + VariableScope.nullOrMissingString;
            if (gameEngine.f5936at && !m4418a) {
                str8 = "[LOCKED] " + str8;
            }
            String replace = innerRML.replace("_NAME_", htmlString(str8));
            if (equals) {
                str2 = "loadGame(" + escapedString(str7) + ")";
                str = "loadGameEdit(" + escapedString(str7) + ")";
            } else if (equals2) {
                str2 = "loadReplay(" + escapedString(str7) + ")";
                str = "loadReplayEdit(" + escapedString(str7) + ")";
            } else {
                str2 = "open('levelOptions.rml', " + escapedString(str6 + str7) + ")";
                str = VariableScope.nullOrMissingString;
            }
            if (str5 != null) {
                str2 = str5 + "(" + escapedString(str6 + str7) + ")";
                str = VariableScope.nullOrMissingString;
            }
            String replace2 = replace.replace("_ONCLICK_", str2).replace("_ONCLICKEDIT_", str);
            String str9 = "thumbnail:assets:";
            int i2 = 18;
            if (startsWith) {
                i2 = 2;
            }
            if (i > i2) {
                str9 = "lazy:" + str9;
            }
            String findTmxMapImg = C0086c.findTmxMapImg(str6 + str7);
            if (GameEngine.isIOS_Device) {
            }
            String str10 = str9 + findTmxMapImg;
            if (!C0670a.m2158h(findTmxMapImg)) {
                if (GameEngine.isIOS_Device) {
                    GameEngine.PrintLOG_err("List: Failed to find: " + findTmxMapImg + " after converting:" + findTmxMapImg + " ( " + str10 + " )");
                }
                str10 = "drawable:error_missingmap.png";
            }
            if (equals || equals2) {
                str10 = VariableScope.nullOrMissingString;
            }
            i++;
            str3 = str3 + replace2.replace("_IMG_", htmlString(str10));
        }
        elementById2.setInnerRML(str3);
        elementById2.loadCharsetIfNeeded(str3);
        if (equals || equals2) {
            elementById2.addClass("savesOnly");
        }
        if (startsWith && str5 == null && GameEngine.isIOS()) {
            elementDocument.addClass("showImportButton");
            return true;
        }
        return true;
    }

    public void convertTextOnPage() {
        GameEngine.getInstance();
        logDebug("convertTextOnPage");
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (isMobile()) {
            activeDocument.addClass("mobile");
        }
        convertTextStopwatch.m2268a();
        Iterator it = activeDocument.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            int numAttributes = element.getNumAttributes();
            for (int i = 0; i < numAttributes; i++) {
                String attributeKey = element.getAttributeKey(i);
                String attributeValue = element.getAttributeValue(i);
                if (attributeKey != null) {
                    if (attributeKey.equals("nestedclone") && !attributeValue.equalsIgnoreCase("false")) {
                        GameEngine.PrintLOG("nested clone:" + element.getId());
                        element.setAttribute(attributeKey, "false");
                        Element clone = element.clone();
                        element.prependChild(clone);
                        clone.removeReference();
                    } else if (attributeKey.equals("childclone") && !attributeValue.equalsIgnoreCase("false")) {
                        element.setAttribute(attributeKey, "false");
                        if (element.getNumChildren() < 1) {
                            GameEngine.PrintLOG("child clone failed no children:" + element.getId());
                        }
                        Element clone2 = element.getChild(0).clone();
                        clone2.addClass("clone");
                        element.prependChild(clone2);
                        clone2.removeReference();
                    } else {
                        String m4502d = this.libRocket.m4502d(attributeValue);
                        if (m4502d != null) {
                            GameEngine.PrintLOG("convertTextOnPage:" + attributeKey + ": '" + attributeValue + "' to '" + m4502d + "'");
                            if (attributeKey.equals("_html")) {
                                GameEngine.PrintLOG("setting html:" + attributeKey);
                                element.setInnerRML(m4502d);
                            } else {
                                if (attributeKey.startsWith("_")) {
                                    attributeKey = attributeKey.substring("_".length());
                                    GameEngine.PrintLOG("converted key to:" + attributeKey);
                                }
                                element.setAttribute(attributeKey, m4502d);
                            }
                        }
                    }
                }
            }
            if (activeDocument.translatedToUnicode) {
                String tagName = element.getTagName();
                if (tagName.equals("p") || tagName.startsWith("h") || tagName.startsWith("label") || tagName.startsWith("button") || tagName.startsWith("select")) {
                    element.loadCharsetIfNeededWithCurrentText();
                }
            }
        }
        convertTextStopwatch.m2265d();
    }

    public void keyBindingPopup_apply(boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        ElementDocument m4506c = this.libRocket.m4506c();
        if (m4506c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        String[] split = ((String) m4506c.getMetadata("mode")).split(":");
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        InputControllerB inputControllerB = (InputControllerB) gameEngine.f5833bT.f3904ak.get(parseInt);
        if (!z) {
            Object metadata = m4506c.getMetadata("lastKeyPressed");
            if (metadata == null) {
                logWarn("keyBindingPopup_apply: no last key entered");
                return;
            }
            int intValue = ((Integer) metadata).intValue();
            int i = 0;
            Object metadata2 = m4506c.getMetadata("lastKeyModifiersPressed");
            if (metadata2 != null) {
                i = ((Integer) metadata2).intValue();
            }
            inputControllerB.m2377a(intValue, parseInt2, i, true);
        } else {
            inputControllerB.m2377a(0, parseInt2, 0, true);
        }
        showKeyBinding();
        closePopup();
    }

    public void keyBindingPopup_onKeydown(int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        ElementDocument m4506c = this.libRocket.m4506c();
        if (m4506c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        Element elementById = m4506c.getElementById("keyBindMessage");
        if (elementById == null) {
            logWarn("showKeyBindingActionPopup: keyBindMessage==null");
            return;
        }
        int mo284h = this.guiEngine.mo284h();
        String str = VariableScope.nullOrMissingString + GameEngine.m814j(mo284h);
        if (i == 111) {
        }
        if (i == 0) {
            logWarn("keyBindingPopup_onKeydown: skipping keycode 0");
        } else if (!gameEngine.m817i(i)) {
            m4506c.setMetadata("lastKeyPressed", Integer.valueOf(i));
            m4506c.setMetadata("lastKeyModifiersPressed", Integer.valueOf(mo284h));
            String str2 = str + SlickToAndroidKeycodes.m710a(i);
            keyBindingPopup_apply(false);
        } else {
            elementById.setText("Key: " + str);
        }
    }

    public void showKeyBindingPopup() {
        GameEngine gameEngine = GameEngine.getInstance();
        ElementDocument m4506c = this.libRocket.m4506c();
        if (m4506c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        Element elementById = m4506c.getElementById("keyBindMessage");
        if (elementById == null) {
            logWarn("showKeyBindingActionPopup: keyBindMessage==null");
            return;
        }
        String[] split = ((String) m4506c.getMetadata("mode")).split(":");
        int parseInt = Integer.parseInt(split[0]);
        Integer.parseInt(split[1]);
        InputControllerB inputControllerB = (InputControllerB) gameEngine.f5833bT.f3904ak.get(parseInt);
        elementById.setText("Press a key..");
    }

    public String getKeyBindingAction(int i, InputControllerB inputControllerB, int i2) {
        return "createAndShowPopup('settingsKeyBindingSet.rml', " + escapedString(i + ":" + i2) + ", " + escapedString(inputControllerB.f3964a) + "); showKeyBindingPopup();";
    }

    public void backWarnIfOverlappingKeyBinding() {
        if (((Boolean) this.libRocket.getActiveDocument().getMetadata("hasOverlappingKeys", false)).booleanValue()) {
            showPopupWithButtons(null, "One or more keys are overlapping and have been highlighted in red. These can cause problems.", false, new C0051e("Ignore", new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.4
                @Override // java.lang.Runnable
                public void run() {
                    Root.this.closePopup();
                    Root.this.back();
                }
            }), new C0051e("Fix", new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.5
                @Override // java.lang.Runnable
                public void run() {
                    Root.this.closePopup();
                }
            }));
        } else {
            back();
        }
    }

    public void showKeyBinding() {
        GameEngine gameEngine = GameEngine.getInstance();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        activeDocument.setMetadata("event_onkeydown", "keyBindingPopup_onKeydown");
        TableData tableData = new TableData();
        ArrayList arrayList = tableData.rows;
        ArrayList arrayList2 = gameEngine.f5833bT.f3904ak;
        boolean z = false;
        for (int i = 0; i < arrayList2.size(); i++) {
            InputControllerB inputControllerB = (InputControllerB) arrayList2.get(i);
            if (inputControllerB.f3965b) {
                TableRow tableRow = new TableRow();
                tableRow.addCell(inputControllerB.f3964a);
                if (inputControllerB.mo2367d()) {
                    tableRow.addClass("rowHeader");
                } else {
                    for (int i2 = 0; i2 <= 1; i2++) {
                        boolean m2386a = gameEngine.f5833bT.m2386a(inputControllerB, i2);
                        TableCell addCell = tableRow.addCell(inputControllerB.m2372b(i2));
                        addCell.setLibrocketOnClick(getKeyBindingAction(i, inputControllerB, i2));
                        if (m2386a) {
                            addCell.color = -65536;
                            z = true;
                        }
                    }
                }
                arrayList.add(tableRow);
            }
        }
        activeDocument.setMetadata("hasOverlappingKeys", Boolean.valueOf(z));
        refreshTable("keysDiv", tableData);
    }

    public void loadSettings() {
        GameEngine gameEngine = GameEngine.getInstance();
        loadSettingsStopwatch.m2268a();
        logDebug("loadSettings");
        Iterator it = this.libRocket.getActiveElementById("body").getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.getAttribute("data-settings") != null) {
                String id = element.getId();
                String attribute = element.getAttribute("type", "unknown");
                String valueDynamic = gameEngine.curSettings.getValueDynamic(id);
                if (attribute.equals("checkbox")) {
                    if (Boolean.parseBoolean(valueDynamic)) {
                        element.setAttribute("checked", VariableScope.nullOrMissingString);
                    } else {
                        element.setAttribute("checked", null);
                    }
                } else {
                    element.setAttribute("value", valueDynamic);
                }
            }
        }
        loadSettingsStopwatch.m2265d();
    }

    public void applyResolution() {
        this.guiEngine.mo286f();
    }

    public void updateRenderScaleInSettings(boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        Element activeElementById = this.libRocket.getActiveElementById("uiRenderScale");
        if (activeElementById == null) {
            logDebug("updateRenderScaleInSettings: uiRenderScale==null");
            return;
        }
        Float valueAsFloat = activeElementById.getValueAsFloat(Float.valueOf(1.0f));
        this.libRocket.getActiveElementById("uiRenderScaleDisplay").compareAndSetText("x" + CommonUtils.m1695b(valueAsFloat.floatValue() + 0.01f, 1));
        if (z) {
            float f = gameEngine.curSettings.uiRenderScale;
            gameEngine.curSettings.uiRenderScale = valueAsFloat.floatValue();
            try {
                applyResolution();
                gameEngine.curSettings.uiRenderScale = f;
            } catch (Throwable th) {
                gameEngine.curSettings.uiRenderScale = f;
                throw th;
            }
        }
    }

    public void closeSettings() {
        applyResolution();
    }

    public void saveSettings() {
        String str;
        GameEngine gameEngine = GameEngine.getInstance();
        logDebug("saveSettings");
        Iterator it = this.libRocket.getActiveElementById("body").getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.getAttribute("data-settings") != null) {
                String id = element.getId();
                if (element.getAttribute("type", "unknown").equals("checkbox")) {
                    String attribute = element.getAttribute("checked");
                    if (attribute == null || "false".equals(attribute)) {
                        str = "false";
                    } else {
                        str = "true";
                    }
                } else {
                    str = element.getAttribute("value");
                }
                try {
                    gameEngine.curSettings.setValueDynamic(id, str);
                } catch (NumberFormatException e) {
                    alert("Error:" + e.getMessage());
                }
            }
        }
        this.guiEngine.mo286f();
        C0830j.m1034a();
        LangLocale.m1598e();
        this.guiEngine.mo285g();
    }

    public String hideStyle(boolean z) {
        if (z) {
            return VariableScope.nullOrMissingString;
        }
        return "display:none;";
    }

    public String hideIf(boolean z) {
        return hideClass(!z);
    }

    public String hideUnless(boolean z) {
        return hideClass(z);
    }

    public String hideClass(boolean z) {
        if (z) {
            return VariableScope.nullOrMissingString;
        }
        return "hide";
    }

    public String hideIfMobile() {
        if (GameEngine.isIOS()) {
            return "hide";
        }
        return VariableScope.nullOrMissingString;
    }

    public boolean canResume() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine != null && gameEngine.f5950bG && !gameEngine.f5951bH) {
            return true;
        }
        return false;
    }

    public boolean isMobile() {
        return GameEngine.isIOS();
    }

    public boolean isIOS() {
        return GameEngine.isIOS_Device;
    }

    public boolean isDesktop() {
        return GameEngine.isPC();
    }

    public boolean isMac() {
        return System_Hcat.isMacOS;
    }

    public boolean hasModSupport() {
        return !GameEngine.isIOS_Device;
    }

    public boolean usingMods() {
        if (!GameEngine.isIOS_Device || GameEngine.getInstance().ModEngine.m1583c() > 0) {
            return true;
        }
        return false;
    }

    public boolean hasWorkshopSupport() {
        return GameEngine.isPC();
    }

    public boolean hasReloadSupport() {
        return !GameEngine.isIOS_Device;
    }

    String restrictedString(String str) {
        if (str == null) {
            return null;
        }
        return "'" + str.replace("'", ".").replace("\"", ".").replace("(", ".").replace(")", ".").replace(",", ".").replace("<", ".").replace(">", ".") + "'";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String escapedString(String str) {
        return "'" + str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("'", "&apos;").replace("\"", "&quot;").replace("${", "$ {") + "'";
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String htmlString(String str) {
        return VariableScope.nullOrMissingString + str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("${", "$ {") + VariableScope.nullOrMissingString;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public String htmlStringWithNewlines(String str) {
        return VariableScope.nullOrMissingString + htmlString(str).replace("\n", "<br/>") + VariableScope.nullOrMissingString;
    }

    public void refreshServerList(final String str, final String str2, final String str3) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (str3 != null) {
            this.libRocket.getActiveElementById(str3).setText("Refreshing");
        }
        Runnable runnable = new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.6
            @Override // java.lang.Runnable
            public void run() {
                Root.this.scriptEngine.addScriptToQueue("displayServerList(" + Root.this.restrictedString(str) + "," + Root.this.restrictedString(str2) + "," + Root.this.restrictedString(str3) + ")");
            }
        };
        gameEngine.networkEngine.f5165br = null;
        C0797n.m1204a(runnable);
    }

    public void displayServerList(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        GameEngine gameEngine = GameEngine.getInstance();
        Element activeElementById = this.libRocket.getActiveElementById(str);
        Element activeElementById2 = this.libRocket.getActiveElementById(str2);
        if (activeElementById == null) {
            GameEngine.log("serverListData is null, we may have changed page");
            return;
        }
        ArrayList m4389m = ActivityC0123p.m4389m();
        this.lastSortedDiscoveredServers = m4389m;
        String i18NText = LangLocale.getI18NText("menus.lobby.gameState.battleroom", new Object[0]);
        String i18NText2 = LangLocale.getI18NText("menus.lobby.gameState.ingame", new Object[0]);
        String i18NText3 = LangLocale.getI18NText("menus.lobby.gameState.chat", new Object[0]);
        if (activeElementById.getNumChildren() > m4389m.size()) {
            for (int numChildren = activeElementById.getNumChildren() - 1; numChildren >= m4389m.size(); numChildren--) {
                GameEngine.PrintLOG("removing rowIndex:" + numChildren);
                activeElementById.removeChild(activeElementById.getChild(numChildren));
            }
            if (activeElementById.getNumChildren() != m4389m.size()) {
                GameEngine.log("-- Non matching size after clean up:" + activeElementById.getNumChildren() + " vs " + m4389m.size());
            }
        }
        int i = 0;
        Iterator it = m4389m.iterator();
        while (it.hasNext()) {
            C0790g c0790g = (C0790g) it.next();
            Element element = null;
            if (i < activeElementById.getNumChildren()) {
                element = activeElementById.getChild(i);
            }
            if (element != null && element.hasClassName("serverRowMessage")) {
                GameEngine.PrintLOG("removing non rowIndex:" + i);
                activeElementById.removeChild(element);
                element = null;
            }
            if (element != null && element.findByClassName("rState") == null) {
                GameEngine.PrintLOG("removing non rowIndex with no rState:" + i);
                activeElementById.removeChild(element);
                element = null;
            }
            if (element == null) {
                element = activeElementById2.clone();
                activeElementById.appendChild(element);
                element.removeReference();
                element.setAttribute("onclick", "clickedServerRow(" + i + ")");
            }
            String str7 = c0790g.f5387s;
            if (str7 != null) {
                str7 = str7.replace("battleroom", i18NText).replace("ingame", i18NText2).replace("chat", i18NText3);
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            if (c0790g != null && c0790g.f5390x) {
                z = true;
                if ("chat".equalsIgnoreCase(c0790g.f5387s)) {
                    z2 = true;
                }
                if (c0790g.m1252d()) {
                    z4 = true;
                }
            }
            int argb = Color.argb(255, 255, 255, 255);
            String str8 = "serverRow serverRowData realServerRow ";
            if (c0790g != null) {
                if (z) {
                    str8 = str8 + "dedicatedServerRow ";
                    if (z2 || z4) {
                        argb = Color.argb(255, 152, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_DIGITAL, 249);
                        str8 = str8 + "chatRow ";
                    }
                } else {
                    if (c0790g.f5377h) {
                        argb = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
                        str8 = str8 + "openRow ";
                    }
                    if (c0790g.f5370a) {
                        argb = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LAST_CHANNEL, 149, 35);
                        str8 = str8 + "lanRow ";
                    }
                }
                if (c0790g.m1255a()) {
                    str8 = str8 + "lastConnectedRow ";
                }
                if (!z2 && !z4 && !(VariableScope.nullOrMissingString + gameEngine.gameVersionInternal(true)).equals(c0790g.f5378j)) {
                    z3 = true;
                }
            }
            String str9 = VariableScope.nullOrMissingString + "color:" + CommonUtils.m1636g(argb) + ";";
            if (0 != 0) {
                String str10 = str9 + "font-weight: bold;";
                str8 = str8 + "boldRow ";
            }
            element.compareAndSetClassNames(str8);
            element.findByClassName("rState").compareAndSetText(str7);
            element.findByClassName("rHost").compareAndSetText(CommonUtils.m1711a(c0790g.serverUser, 15));
            if (c0790g.f5388t == "?") {
                str4 = "?";
            } else {
                str4 = c0790g.f5388t + "\\" + c0790g.f5389u;
            }
            element.findByClassName("rPlayers").compareAndSetText(CommonUtils.m1711a(str4, 15));
            String m1711a = CommonUtils.m1711a(ActivityC0112i.m4415e(c0790g.f5385q), 40);
            if (m1711a == null) {
                m1711a = VariableScope.nullOrMissingString;
            }
            element.findByClassName("rMap").compareAndSetText(m1711a);
            if ("ANY".equalsIgnoreCase(c0790g.f5379k)) {
                str5 = c0790g.f5379k;
            } else {
                str5 = "v" + CommonUtils.m1711a(c0790g.f5379k, 8);
            }
            Element findByClassName = element.findByClassName("rVersion");
            findByClassName.compareAndSetText(str5);
            String str11 = "cell rVersion ";
            if (z3) {
                String str12 = "color:" + CommonUtils.m1636g(Color.argb(255, 155, 147, 147)) + ";";
                str11 = str11 + "nonMatchingRow ";
            } else {
                String str13 = "color:" + CommonUtils.m1636g(argb) + ";";
            }
            findByClassName.compareAndSetClassNames(str11);
            if (c0790g.f5377h) {
                if (c0790g.f5381m) {
                    str6 = "P";
                } else {
                    str6 = "Y";
                }
            } else {
                str6 = "N";
            }
            if (c0790g.f5370a) {
                str6 = "L";
            }
            Element findByClassName2 = element.findByClassName("rOpen");
            findByClassName2.compareAndSetText(str6);
            String str14 = "cell rOpen ";
            if (!c0790g.f5377h && !c0790g.f5370a) {
                String str15 = "color:" + CommonUtils.m1636g(Color.argb(255, 155, 147, 147)) + ";";
                str14 = str14 + "notOpenRow ";
            } else {
                String str16 = "color:" + CommonUtils.m1636g(argb) + ";";
            }
            findByClassName2.compareAndSetClassNames(str14);
            i++;
        }
        if (m4389m.size() == 0 && gameEngine.networkEngine.f5165br != null) {
            String str17 = "ERROR: " + gameEngine.networkEngine.f5165br;
            Element clone = activeElementById2.clone();
            activeElementById.appendChild(clone);
            clone.removeReference();
            clone.setText(str17);
        }
        if (str3 != null) {
            this.libRocket.getActiveElementById(str3).setText("Refresh");
        }
        GameEngine.log("DONE");
    }

    public void clickedServerRow(int i) {
        clickedServer(((C0790g) this.lastSortedDiscoveredServers.get(i)).f5371b);
    }

    public void clickedServer(String str) {
        String str2;
        if (getAlertOrPopup() != null) {
            logWarn("clickedServer: getAlertOrPopup!=null");
            return;
        }
        try {
            C0790g m1191b = C0797n.m1191b(str);
            if (m1191b == null) {
                logWarn("clickedServer: server==null");
                alert("That server no longer exists");
                return;
            }
            String m1254b = m1191b.m1254b();
            if (m1191b.m1252d()) {
                str2 = "[onenter]Open Link:closePopup(); openWhitelistedLink(" + restrictedString(m1191b.m1253c()) + ");";
            } else if (!m1191b.f5370a) {
                str2 = "[onenter]Join:closePopup(); joinServerWithId(" + restrictedString(m1191b.m1251e()) + "," + restrictedString(m1191b.f5371b) + ");";
            } else {
                str2 = "[onenter]Join over LAN:closePopup(); joinServerWithId(" + restrictedString(m1191b.m1250f()) + "," + restrictedString(m1191b.f5371b) + ");";
            }
            showPopup(null, m1254b, true, str2, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void hideKeyboard() {
        this.guiEngine.m4524l();
    }

    public void saveGame(String str) {
        closePopup();
        hideKeyboard();
        GameEngine.getInstance().f5862ca.m406b(str.replace(".", "_").replace("/", "_").replace("\\", "_"), false);
    }

    public void exportMap(String str) {
        closePopup();
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            gameEngine.map.m4129b(gameEngine.f5892dl, "/SD/rusted_warfare_maps/" + str.replace(".", "_").replace("/", "_").replace("\\", "_").replace("|", "_").replace("?", "_") + ".tmx");
            showAlert("Map exported");
        } catch (C0173f e) {
            showAlert("Failed to export map. error: " + e.getMessage());
        } catch (IOException e2) {
            showAlert("Failed to export map. IO error: " + e2.getMessage());
        }
    }

    public void loadGame(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.networkEngine.disconnect("loading new save");
        gameEngine.editorMode = false;
        if (gameEngine.f5862ca.m404c(str, false)) {
            resumeNonMenu();
        }
    }

    public void loadGameEdit(final String str) {
        final GameEngine gameEngine = GameEngine.getInstance();
        C0051e c0051e = null;
        if (C0831a.m1026b()) {
            c0051e = new C0051e("Share", new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.7
                @Override // java.lang.Runnable
                public void run() {
                    Root.this.closePopup();
                    C0831a.m1027a(gameEngine.f5862ca.m410a(str, false));
                }
            });
        }
        showPopupWithButtons(null, str, true, c0051e, new C0051e("Delete", new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.8
            @Override // java.lang.Runnable
            public void run() {
                gameEngine.f5862ca.m407b(str);
                Root.this.closePopup();
                Root.this.showMaps();
            }
        }));
    }

    public void loadReplay(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.editorMode = false;
        if (gameEngine.replayEngine.m2309c(str)) {
            resumeNonMenu();
        }
    }

    public void loadReplayEdit(final String str) {
        final GameEngine gameEngine = GameEngine.getInstance();
        C0051e c0051e = null;
        if (C0831a.m1026b()) {
            c0051e = new C0051e("Share", new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.9
                @Override // java.lang.Runnable
                public void run() {
                    Root.this.closePopup();
                    C0831a.m1027a(gameEngine.replayEngine.saveReplays(str, false));
                }
            });
        }
        showPopupWithButtons(null, str, true, c0051e, new C0051e("Delete", new Runnable() { // from class: com.corrodinggames.librocket.scripts.Root.10
            @Override // java.lang.Runnable
            public void run() {
                gameEngine.replayEngine.m2305e(str);
                Root.this.closePopup();
                Root.this.showMaps();
            }
        }));
    }

    public void makeSaveGamePopup(String str) {
        String str2;
        GameEngine gameEngine = GameEngine.getInstance();
        if (str == null) {
            str2 = (gameEngine.getMapNameE() + " (" + CommonUtils.SimpleDateFormatStr("d MMM yyyy HH-mm-ss") + ")").replace("  ", " ");
        } else {
            str2 = str;
        }
        showInputPopup("Save Game", "Enter a name to save the game under", str2, "[onenter]Save:saveGame(getPopupText())", null);
    }

    public void makeExportMapGamePopup(String str) {
        String str2;
        GameEngine gameEngine = GameEngine.getInstance();
        if (str == null) {
            str2 = ("New " + gameEngine.getMapNameE() + " - " + CommonUtils.SimpleDateFormatStr("d MMM yyyy")).replace("  ", " ");
        } else {
            str2 = str;
        }
        showInputPopup("Export Map", "Enter a name to export the map as", str2, "[onenter]Export:exportMap(getPopupText())", null);
    }

    public void makeSendMessagePopup() {
        GameEngine.getInstance();
        showInputPopup("Send Message", VariableScope.nullOrMissingString, VariableScope.nullOrMissingString, "[onenter]Send: sendChatMessage(getPopupText()); closePopup();", "Switch - Team only: makeSendTeamMessagePopupWithDefaultText(getPopupText()); ");
    }

    public void makeSendTeamMessagePopup() {
        makeSendTeamMessagePopupWithDefaultText(VariableScope.nullOrMissingString);
    }

    public void makeSendTeamMessagePopupWithDefaultText(String str) {
        GameEngine.getInstance();
        showInputPopup("Send Team Message", VariableScope.nullOrMissingString, str, "[onenter]Send Team:sendTeamChatMessage(getPopupText()); closePopup();", "+ Ping Map:sendTeamChatMessageAndPing(getPopupText()); closePopup();");
    }

    public void sendChatMessage(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        this.guiEngine.m4524l();
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return;
        }
        gameEngine.networkEngine.sendChatMessage(str);
        gameEngine.interfaceEngine.f4756p = false;
    }

    public void sendTeamChatMessageAndPing(String str) {
        sendTeamChatMessage(str);
        GameEngine.getInstance().interfaceEngine.m1925G();
    }

    public void sendTeamChatMessage(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        this.guiEngine.m4524l();
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return;
        }
        gameEngine.networkEngine.m1370j(str);
    }

    public void receiveChatMessage(int i, String str, String str2, Connection connection) {
        refreshChat();
    }

    public void refreshChat() {
        Element activeElementById;
        GameEngine gameEngine = GameEngine.getInstance();
        Element activeElementById2 = this.libRocket.getActiveElementById("chatLogHistory");
        if (activeElementById2 == null) {
            return;
        }
        boolean attributeBoolean = activeElementById2.getAttributeBoolean("reversed", false);
        if (gameEngine.networkEngine.f5126F && (activeElementById = this.libRocket.getActiveElementById("chatBox")) != null) {
            activeElementById.hide();
        }
        activeElementById2.setInnerRML(VariableScope.nullOrMissingString);
        ConcurrentLinkedQueue m1536b = gameEngine.networkEngine.f5159aR.m1536b();
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = m1536b.iterator();
        while (it.hasNext()) {
            C0784b c0784b = (C0784b) it.next();
            if (attributeBoolean) {
                stringBuffer.insert(0, "<div>" + c0784b.m1286b() + "</div>");
            } else {
                stringBuffer.append("<div>" + c0784b.m1286b() + "</div>");
            }
        }
        stringBuffer.append("<div id='chatLastRowSpacer'></div>");
        activeElementById2.setInnerRML(stringBuffer.toString());
        activeElementById2.loadCharsetIfNeededWithCurrentText();
        Element activeElementById3 = this.libRocket.getActiveElementById("chatLastRowSpacer");
        if (activeElementById3 != null) {
            activeElementById3.scrollIntoView(false);
        }
    }

    public void trace(String str) {
        GameEngine.PrintLOG("Trace:" + str);
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$TableData.class */
    public class TableData {
        public ArrayList rows = new ArrayList();

        public boolean same(TableData tableData, boolean z) {
            if (this.rows.size() != tableData.rows.size()) {
                return false;
            }
            for (int i = 0; i < this.rows.size(); i++) {
                if (!((TableRow) this.rows.get(i)).same((TableRow) tableData.rows.get(i), z)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$TableRow.class */
    public class TableRow {
        public ArrayList tableCells = new ArrayList();
        public Runnable androidOnclick;
        public String librocketOnClick;
        public String extraClasses;

        public void addClass(String str) {
            if (this.extraClasses == null) {
                this.extraClasses = str;
            } else {
                this.extraClasses += " " + str;
            }
        }

        public TableCell addCell(String str) {
            TableCell tableCell = new TableCell(str);
            this.tableCells.add(tableCell);
            return tableCell;
        }

        public void setLibrocketOnClick(String str) {
            this.librocketOnClick = str;
        }

        public void setAndroidOnClick(Runnable runnable) {
            this.androidOnclick = runnable;
        }

        public boolean same(TableRow tableRow, boolean z) {
            if (!CommonUtils.m1646e(this.librocketOnClick, tableRow.librocketOnClick) || !CommonUtils.m1646e(this.extraClasses, tableRow.extraClasses) || this.tableCells.size() != tableRow.tableCells.size()) {
                return false;
            }
            for (int i = 0; i < this.tableCells.size(); i++) {
                if (!((TableCell) this.tableCells.get(i)).same((TableCell) tableRow.tableCells.get(i), z)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$TableCell.class */
    public class TableCell {
        public String text;
        public String classes;
        public String librocketOnClick;
        public Integer color;

        public void setLibrocketOnClick(String str) {
            this.librocketOnClick = str;
        }

        public TableCell(String str) {
            this.text = str;
        }

        public void addClass(String str) {
            if (this.classes != null) {
                this.classes += " " + str;
            } else {
                this.classes = str;
            }
        }

        public boolean same(TableCell tableCell, boolean z) {
            if (!CommonUtils.m1646e(this.classes, tableCell.classes) || !CommonUtils.m1646e(this.librocketOnClick, tableCell.librocketOnClick) || !CommonUtils.m1714a(this.color, tableCell.color)) {
                return false;
            }
            if (!z && !CommonUtils.m1646e(this.text, tableCell.text)) {
                return false;
            }
            return true;
        }
    }

    public void updateTableTextOnly(String str, TableData tableData, TableData tableData2) {
        ArrayList arrayList = tableData.rows;
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            GameEngine.log("updateTableText: tableElement:" + str + " is null, we may have changed page");
            return;
        }
        Element elementById = activeElementById.getElementById("tableListData");
        for (int i = 0; i < arrayList.size(); i++) {
            TableRow tableRow = (TableRow) arrayList.get(i);
            for (int i2 = 0; i2 < tableRow.tableCells.size(); i2++) {
                TableCell tableCell = (TableCell) tableRow.tableCells.get(i2);
                Element child = elementById.getChild(i);
                if (child == null) {
                    GameEngine.log("updateTableText failed to get row " + i);
                    return;
                }
                Element child2 = child.getChild(i2);
                if (child2 == null) {
                    GameEngine.log("updateTableText failed to get cell " + i2);
                    return;
                }
                child2.compareAndSetText(tableCell.text);
            }
        }
    }

    public void refreshTable(String str, TableData tableData) {
        ArrayList arrayList = tableData.rows;
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            GameEngine.log("refreshTable: tableElement:" + str + " is null, we may have changed page");
            return;
        }
        Element elementById = activeElementById.getElementById("tableRowTemplateHolder");
        Element elementById2 = activeElementById.getElementById("tableListData");
        Element child = elementById.findByClassName("rowTemplate").getChild(0);
        Element child2 = elementById.findByClassName("cellTemplate").getChild(0);
        elementById2.setInnerRML(VariableScope.nullOrMissingString);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            TableRow tableRow = (TableRow) it.next();
            Element cloneAndFix = child.cloneAndFix();
            if (tableRow.librocketOnClick != null) {
                cloneAndFix.setAttribute("onclick", tableRow.librocketOnClick);
            }
            if (tableRow.extraClasses != null) {
                cloneAndFix.addClass(tableRow.extraClasses);
            }
            Iterator it2 = tableRow.tableCells.iterator();
            while (it2.hasNext()) {
                TableCell tableCell = (TableCell) it2.next();
                Element cloneAndFix2 = child2.cloneAndFix();
                cloneAndFix2.compareAndSetText(tableCell.text);
                if (tableCell.librocketOnClick != null) {
                    cloneAndFix2.setAttribute("onclick", tableCell.librocketOnClick);
                    cloneAndFix2.addClass("clickablecell");
                }
                if (tableCell.classes != null) {
                    cloneAndFix2.addClass(tableCell.classes);
                }
                if (tableCell.color != null) {
                    cloneAndFix2.setAttribute("style", "color:" + CommonUtils.m1636g(tableCell.color.intValue()) + ";");
                }
                cloneAndFix.appendChild(cloneAndFix2);
                cloneAndFix2.removeReference();
            }
            elementById2.appendChild(cloneAndFix);
            cloneAndFix.removeReference();
        }
    }

    public ElementDocument createAndShowPopup(String str, Object obj, String str2) {
        return this.libRocket.m4516a(str, obj, str2, true);
    }

    public ElementDocument createPopupHidden(String str, Object obj, String str2) {
        return this.libRocket.m4516a(str, obj, str2, false);
    }

    public boolean tryToShowPopupDocument(ElementDocument elementDocument) {
        return this.libRocket.m4510b(elementDocument);
    }

    public void showMainMenu() {
        GameEngine.getInstance().interfaceEngine.f4756p = false;
        Main.m4540a().showMainMenu();
    }

    public void onEnter() {
        ElementDocument m4499g = this.libRocket.m4499g();
        if (m4499g == null) {
            GameEngine.PrintLOG("onEnter: elementDocument==null");
            return;
        }
        Iterator it = m4499g.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String attribute = element.getAttribute("onenter");
            if (attribute != null && element.isFocused()) {
                this.scriptEngine.processScript(attribute);
            }
        }
    }

    public void scrollFromFocusedElement(float f) {
        ElementDocument m4499g = this.libRocket.m4499g();
        if (m4499g == null) {
            GameEngine.PrintLOG("onEnter: elementDocument==null");
            return;
        }
        Element topLevelFocusedElement = m4499g.getTopLevelFocusedElement();
        if (topLevelFocusedElement == null) {
            GameEngine.PrintLOG("focusedElement: Not found");
            return;
        }
        ArrayList chainFromChildElement = m4499g.getChainFromChildElement(topLevelFocusedElement);
        if (chainFromChildElement == null) {
            GameEngine.PrintLOG("scrollFromFocusedElement: Failed to find chain");
            return;
        }
        Iterator it = chainFromChildElement.iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            boolean z = false;
            if ("scrollDiv".equals(element.getId())) {
                z = true;
            }
            if (element.hasClassName("slider")) {
                z = true;
            }
            if (z) {
                element.setScrollTop(element.getScrollTop() + f);
                return;
            }
        }
        GameEngine.PrintLOG("Found no slider element to offset");
    }

    public boolean isSliderOrUIElementSelected() {
        ElementDocument m4499g = this.libRocket.m4499g();
        if (m4499g == null) {
            GameEngine.PrintLOG("onEnter: elementDocument==null");
            return false;
        }
        Element topLevelFocusedElement = m4499g.getTopLevelFocusedElement();
        if (topLevelFocusedElement != null) {
            String tagName = topLevelFocusedElement.getTagName();
            boolean z = false;
            if ("scrollDiv".equals(topLevelFocusedElement.getId())) {
                z = true;
            }
            if (topLevelFocusedElement.hasClassName("slider")) {
                z = true;
            }
            if ("input".equals(tagName) && "range".equals(topLevelFocusedElement.getAttribute("type", "text"))) {
                z = true;
            }
            if (z) {
                GameEngine.PrintLOG("Slider element: true");
                return true;
            }
            GameEngine.PrintLOG("Slider element: false");
        }
        GameEngine.PrintLOG("Slider element: no element focused");
        return false;
    }

    public void onTouch() {
        ElementDocument m4499g = this.libRocket.m4499g();
        if (m4499g == null) {
            GameEngine.PrintLOG("onEnter: elementDocument==null");
            return;
        }
        Iterator it = m4499g.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if ("text".equals(element.getAttribute("type")) && element.isFocused()) {
                this.guiEngine.m4525k();
            }
        }
    }

    public void onEscape() {
        ElementDocument m4499g = this.libRocket.m4499g();
        if (m4499g == null) {
            GameEngine.PrintLOG("onEscape: elementDocument==null");
            return;
        }
        boolean z = false;
        Iterator it = m4499g.getAllNestedChildren().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Element element = (Element) it.next();
            if (element.getAttribute("click_on_escape") != null) {
                element.click();
                z = true;
                break;
            }
        }
        if (!z && closePopup()) {
        }
    }

    public void askQuitGame() {
        closePopup();
        showPopup("Are you sure you want to quit?", VariableScope.nullOrMissingString, true, "[onenter]Quit:closePopup(); exit();", null);
    }

    public String getCurrentDocumentPath() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            return null;
        }
        return activeDocument.documentPath;
    }

    public String getCurrentPopupPath() {
        ElementDocument m4506c = this.libRocket.m4506c();
        if (m4506c == null) {
            return null;
        }
        return m4506c.documentPath;
    }

    public String getCreditsText() {
        return "Credits goes here";
    }

    public void runRunnable(Runnable runnable) {
        logDebug("runRunnable");
        if (runnable == null) {
            logDebug("runnable==null");
        }
        runnable.run();
    }

    public boolean isLinux() {
        return C0742g.m1596a() == Enum_System.f5027c;
    }

    public boolean not(boolean z) {
        return !z;
    }

    public boolean and(boolean z, boolean z2) {
        return z && z2;
    }

    /* renamed from: or */
    public boolean m4493or(boolean z, boolean z2) {
        return z || z2;
    }

    public void showBattleroom() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        boolean z = true;
        if (activeDocument != null && "battleroom.rml".equals(activeDocument.documentPath)) {
            GameEngine.PrintLOG("Already on battleroom page");
            z = false;
        }
        this.libRocket.setDocument("battleroom.rml", null, z);
    }

    public void setDocument(String str) {
        this.libRocket.setDocument(str);
    }

    public void playNextMusicTrack() {
        GameEngine.getInstance().musicController.m2346e();
    }

    public void toggleMusic() {
        GameEngine.getInstance().musicController.f3997u = !GameEngine.getInstance().musicController.f3997u;
    }

    public void updateMusicButton(String str) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById != null) {
            if (GameEngine.getInstance().musicController.f3997u) {
                activeElementById.setText(">");
            } else {
                activeElementById.setText("||");
            }
        }
    }

    public void setSandboxMapFromPopup(String str) {
        GameEngine.getInstance();
        closePopup();
        this.libRocket.getActiveDocument().setMetadata("mode", str);
        showLevelOptions();
        this.libRocket.getActiveDocument().findByClassName("mapImage").setAttribute("src", getMapThumbnail(str));
        this.libRocket.getActiveDocument().findByClassName("mapText").setText(getMapNameFromPath(str));
    }

    public void showSandboxMapSelectOnChange() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        int parseInt = Integer.parseInt(activeDocument.getElementById("typeSelector").getValue());
        int intValue = ((Integer) activeDocument.getMetadata("lastTypeSelector", 0)).intValue();
        this.libRocket.getActiveDocument().setMetadata("lastTypeSelector", Integer.valueOf(parseInt));
        if (parseInt != intValue) {
            showSandboxMapSelect();
        }
    }

    public void showSandboxMapSelect() {
        showMapPopup(getModeMapPath(this.libRocket.getActiveDocument(), "typeSelector"), "setSandboxMapFromPopup");
    }

    public String getModeMapPath(Element element, String str) {
        int i;
        GameEngine gameEngine = GameEngine.getInstance();
        if (str == null) {
            if (gameEngine.networkEngine.setup.currentType == null) {
                GameEngine.log("getModeMapPath: currentType==0");
                i = 0;
            } else {
                i = gameEngine.networkEngine.setup.currentType.ordinal();
            }
        } else {
            Element elementById = element.getElementById(str);
            if (elementById == null) {
                GameEngine.LogTrace("getModeMapPath: typeSelector==null");
                i = 0;
            } else {
                i = elementById.getValueAsInt(0).intValue();
            }
        }
        if (i == 0) {
            return "maps/skirmish";
        }
        if (i == 1) {
            return "/SD/rusted_warfare_maps";
        }
        if (i == 2) {
            return "saves";
        }
        throw new RuntimeException("Unknown typeIndex:" + i);
    }

    public void event_unicodeEntered() {
        ElementDocument m4499g = this.libRocket.m4499g();
        if (m4499g != null) {
            Element findByClassName = m4499g.findByClassName("textinputUnicodeWrap");
            if (findByClassName != null) {
                findByClassName.compareAndAddClass("unicodeWasTyped");
                return;
            } else {
                GameEngine.PrintLOG("event_unicodeEntered: missing textinput");
                return;
            }
        }
        GameEngine.PrintLOG("event_unicodeEntered: missing document");
    }

    public boolean isVersionBeta() {
        return GameEngine.getInstance().isBetaVersion();
    }

    public Object ifCondition(boolean z, Object obj, Object obj2) {
        return z ? obj : obj2;
    }

    /* renamed from: i */
    public String m4494i(String str) {
        return LangLocale.getI18NText(str, new Object[0]);
    }

    public void openLinkToCG(String str) {
        openWhitelistedLink("http://corrodinggames.com/" + str);
    }

    public void openWhitelistedLink(String str) {
        GameEngine.PrintLOG("Opening link:" + str);
        if (!str.startsWith("http://corrodinggames.com/") && !str.startsWith("https://corrodinggames.com/") && !str.startsWith("http://corrodinggames.net/") && !str.startsWith("https://corrodinggames.net/")) {
            GameEngine.PrintLOG("Not in whitelist");
        } else if (this.guiEngine.openBrowser(str)) {
            alert("Opened link: " + str);
        } else {
            alert("Sorry couldn't load browser to: " + str + " please navigate manually");
        }
    }

    public void writeGameLog(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        LinkedList m4526j = Main.m4540a().m4526j();
        if (m4526j == null) {
            z = true;
        } else {
            synchronized (m4526j) {
                ListIterator listIterator = m4526j.listIterator(CommonUtils.maxi(0, m4526j.size() - 3000));
                while (listIterator.hasNext()) {
                    stringBuffer.append(Element.excapeHTML((String) listIterator.next()));
                    stringBuffer.append("<br/>");
                }
            }
        }
        if (z) {
            alert("Internal game logging not active");
            return;
        }
        GameEngine.PrintLOG("writeGameLog ready");
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            GameEngine.PrintLOG("Failed to find: " + str);
        } else {
            activeElementById.setInnerRML(stringBuffer.toString());
        }
    }

    public void exportGameLog() {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        LinkedList m4526j = Main.m4540a().m4526j();
        if (m4526j == null) {
            z = true;
        } else {
            synchronized (m4526j) {
                ListIterator listIterator = m4526j.listIterator(CommonUtils.maxi(0, m4526j.size() - 3000));
                while (listIterator.hasNext()) {
                    stringBuffer.append(Element.excapeHTML((String) listIterator.next()));
                    stringBuffer.append("\n");
                }
            }
        }
        if (z) {
            alert("Internal game logging not active");
            return;
        }
        try {
            File file = new File(C0670a.m2162e("/SD/rustedWarfare/RustedWarfareLog-" + CommonUtils.SimpleDateFormatStr("d_MMM_yyyy_HH.mm.ss") + ".txt"));
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.append((CharSequence) stringBuffer.toString());
            fileWriter.flush();
            fileWriter.close();
            C0831a.m1027a(file);
            file.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
            alert("Failed to export logs: " + e.getMessage());
        }
    }

    public void setPageMinWidthAndHeight(float f, float f2) {
        GameEngine.PrintLOG("setPageMinWidthAndHeight(" + f + ", " + f2 + ")");
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            GameEngine.PrintLOG("setPageMinWidthAndHeight - no page");
            return;
        }
        activeDocument.setMetadataFloat("minWidth", Float.valueOf(f));
        activeDocument.setMetadataFloat("minHeight", Float.valueOf(f2));
        this.guiEngine.m4523m();
    }

    public void importFilePopup() {
        C0831a.m1028a(new AbstractC0832b() { // from class: com.corrodinggames.librocket.scripts.Root.11
            @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0832b
            public void onFileSelected() {
                GameEngine.PrintLOG("importFilePopup: onFileSelected");
            }

            @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0832b
            public void onCancelled() {
                GameEngine.PrintLOG("importFilePopup: onCancelled");
            }
        });
    }
}