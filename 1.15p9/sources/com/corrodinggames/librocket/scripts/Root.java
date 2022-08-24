package com.corrodinggames.librocket.scripts;

import android.graphics.Color;
import com.Element;
import com.ElementDocument;
import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.AbstractC0048b;
import com.corrodinggames.librocket.C0051e;
import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.appFramework.ActivityC0118j;
import com.corrodinggames.rts.appFramework.ActivityC0129p;
import com.corrodinggames.rts.appFramework.ActivityC0131q;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.game.C0191i;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0639ad;
import com.corrodinggames.rts.gameFramework.C0734bn;
import com.corrodinggames.rts.gameFramework.C0819g;
import com.corrodinggames.rts.gameFramework.C0894j;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.EnumC0822h;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0845ah;
import com.corrodinggames.rts.gameFramework.p041i.C0866b;
import com.corrodinggames.rts.gameFramework.p041i.C0872g;
import com.corrodinggames.rts.gameFramework.p041i.C0879n;
import com.corrodinggames.rts.gameFramework.p041i.Connection;
import com.corrodinggames.rts.gameFramework.p041i.EnumC0846ai;
import com.corrodinggames.rts.gameFramework.p041i.RunnableC0853am;
import com.corrodinggames.rts.gameFramework.p043k.AbstractC0914b;
import com.corrodinggames.rts.gameFramework.p043k.C0913a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.p008a.RunnableC0069a;
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
    C0734bn openDocumentTimer = new C0734bn("openDocument", true);
    RunnableC0853am threadedGameConnector;
    ElementDocument lastConnectingPopup;
    static C0734bn convertTextStopwatch = new C0734bn("ConvertText", true);
    static C0734bn loadSettingsStopwatch = new C0734bn("LoadSettings", true);
    ArrayList lastSortedDiscoveredServers;

    public void logDebug(String str) {
        GameEngine.PrintLog("ui[debug]: " + str);
    }

    public void logWarn(String str) {
        GameEngine.PrintLog("ui[warn]: " + str);
    }

    public void back() {
        this.libRocket.backToLastDocument();
        if (this.libRocket.getActiveDocument() == null) {
            GameEngine.m1145b("back: libRocket.getActiveDocument()==null");
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine == null || !gameEngine.f6229bq) {
                GameEngine.m1145b("back: showing main menu!");
                showMainMenu();
                return;
            }
            GameEngine.m1145b("back: resuming game");
            this.guiEngine.m7078a(false);
        }
    }

    public void backOrClose() {
        if (closePopup()) {
            return;
        }
        this.libRocket.backToLastDocument();
    }

    public String fullVersionOnlyStyle() {
        if (GameEngine.getInstance().f6222ar) {
            return "notInDemo";
        }
        return VariableScope.nullOrMissingString;
    }

    public void openIfNotDemo(String str, Object obj, String str2) {
        if (GameEngine.getInstance().f6222ar) {
            alert(str2);
        } else {
            open(str, obj);
        }
    }

    public String getVersionName() {
        return GameEngine.getInstance().m1100s();
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$1.class */
    class RunnableC00551 implements Runnable {
        final /* synthetic */ String val$level;

        RunnableC00551(String str) {
            this.val$level = str;
        }

        public void run() {
            Root.this.libRocket.setDocument(this.val$level, null, false);
            Root.this.onShowNewScreen();
        }
    }

    public void delayedOpenNoHistory(String str, Object obj) {
        this.scriptEngine.addRunnableToQueue(new RunnableC00551(str)).framesDelay = 1;
    }

    public void openAfterHelpPopup(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (GameEngine.m1158at() && !gameEngine.f6109bQ.hasPlayedGameOrSeenHelp) {
            gameEngine.f6109bQ.hasPlayedGameOrSeenHelp = true;
            gameEngine.f6109bQ.save();
            showPopup(VariableScope.nullOrMissingString, "First time playing? Would you like to view the quick help slides?", false, "[onenter]View Help:closePopup(); open('help_quick_mobile.rml');", "Skip:closePopup(); open(" + restrictedString(str) + ");");
            return;
        }
        open(str, null);
    }

    public void open(String str, Object obj) {
        this.openDocumentTimer.m2601a();
        AbstractC0048b.f356a.m2596f();
        HashMap hashMap = null;
        if (obj != null) {
            hashMap = new HashMap();
            hashMap.put("mode", obj);
        }
        this.libRocket.setDocument(str, hashMap);
        onShowNewScreen();
        this.openDocumentTimer.m2598d();
        AbstractC0048b.f356a.m2597e();
    }

    public void onShowNewScreen() {
        this.guiEngine.m7078a(true);
    }

    public void resume() {
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
        this.guiEngine.m7071e();
    }

    public void resumeNonMenu() {
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
        this.guiEngine.m7078a(false);
    }

    public void startNew(String str) {
        this.guiEngine.m7079a(str);
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void showRangeValue(String str, String str2, boolean z) {
        String num;
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            logWarn("Could not find:" + str);
            return;
        }
        String attribute = activeElementById.getAttribute("value");
        if (z) {
            num = new Float(attribute).toString();
        } else {
            num = Integer.toString((int) Float.parseFloat(attribute));
        }
        Element activeElementById2 = this.libRocket.getActiveElementById(str2);
        if (activeElementById2 == null) {
            logWarn("Could not find:" + str2);
        } else {
            activeElementById2.setText(num);
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
        if (gameEngine.f6109bQ.lastNetworkIP != null) {
            str = gameEngine.f6109bQ.lastNetworkIP;
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
        gameEngine.f6109bQ.lastNetworkIP = trim;
        gameEngine.f6109bQ.save();
        joinServerWithId(trim, null);
    }

    public void joinServerWithId(String str, String str2) {
        GameEngine.getInstance().networkEngine.f5614bK = str2;
        joinServer(str);
    }

    public void joinServer(String str) {
        if (ScriptEngine.inDebugScript && !RunnableC0069a.f388d) {
            return;
        }
        logDebug("joinAddress=" + str);
        this.threadedGameConnector = GameEngine.getInstance().networkEngine.m1741a(str, false, (Runnable) new RunnableC00582());
        this.lastConnectingPopup = createAndShowPopup("multiplayerLobby_connecting.rml", null, "Please wait");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.librocket.scripts.Root$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$2.class */
    public class RunnableC00582 implements Runnable {
        RunnableC00582() {
        }

        public void run() {
            ScriptEngine.getInstance().addScriptToQueue("joinServerCallback();");
        }
    }

    public void joinServerCallback() {
        logDebug("joinServerCallback");
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.threadedGameConnector == null) {
            logDebug("threadedGameConnector==null");
            return;
        }
        closePopupOnly();
        if (this.threadedGameConnector.f5683e != null) {
            if (this.threadedGameConnector.f5683e.equals("CANCELLED")) {
                logDebug("Server join cancelled");
                return;
            } else {
                logWarn("Server join failed");
                showPopup("Connection failed", this.threadedGameConnector.f5683e, true, null, null);
            }
        } else {
            try {
                gameEngine.networkEngine.m1690b("starting new");
                gameEngine.networkEngine.m1740a(this.threadedGameConnector.f5685g);
                logDebug("connected");
                showBattleroom();
            } catch (IOException e) {
                gameEngine.m1137c(e.getMessage(), "Connection failed");
                e.printStackTrace();
            }
        }
        this.threadedGameConnector = null;
    }

    public void cancelJoinServer() {
        if (this.threadedGameConnector != null) {
            if (this.threadedGameConnector.m1594a()) {
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
        this.libRocket.m7046c(str);
    }

    public void showPopupWithButtons(String str, String str2, boolean z, C0051e c0051e, C0051e c0051e2) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        this.libRocket.m7056a(str, str2, (String) null, c0051e, c0051e2, z);
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
            this.guiEngine.m7068k();
        }
        this.libRocket.m7055a(str, str2, str3, c0051e, c0051e2, true, z);
    }

    public void showPopup(String str, String str2, boolean z, String str3, String str4) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        this.libRocket.m7054a(str, str2, (String) null, str3, str4, z);
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
            this.guiEngine.m7068k();
        }
        this.libRocket.m7054a(str, str2, str6, str4, str5, true);
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
            this.guiEngine.m7068k();
        }
        this.libRocket.m7055a(str, str2, str6, str4, str5, true, false);
    }

    public ElementDocument getPopup() {
        return this.libRocket.m7048c();
    }

    public ElementDocument getAlertOrPopup() {
        return this.libRocket.m7043e();
    }

    public boolean closePopup() {
        return this.libRocket.m7040h();
    }

    public boolean closePopupOnly() {
        return this.libRocket.m7038j();
    }

    public boolean closeAlertOnly() {
        return this.libRocket.m7039i();
    }

    public String getPopupText() {
        return this.libRocket.m7037k();
    }

    public void showHostOptions() {
        this.libRocket.m7054a("Host game", m7035i("menus.hostgame.info_pc"), (String) null, "Host Private:closePopup();hostStart(false);", "Host Public:closePopup();hostStart(true);", true);
    }

    public void hostStartFromPopup(boolean z) {
        ElementDocument m7041g = this.libRocket.m7041g();
        Element elementById = m7041g.getElementById("password");
        String str = null;
        if (elementById == null) {
            logWarn("hostStartFromPopup: password==null");
        } else {
            String value = elementById.getValue();
            if (value != null && !value.trim().equals(VariableScope.nullOrMissingString)) {
                str = value;
            }
        }
        boolean checkbox = m7041g.getElementById("useMods").getCheckbox();
        closePopup();
        hostStartWithPasswordAndMods(z, str, checkbox);
    }

    public void hostStart(boolean z) {
        GameEngine.m1145b("old version of hostStart");
        hostStartWithPassword(z, null);
    }

    public void hostStartWithPassword(boolean z, String str) {
        GameEngine.m1145b("old version of hostStartWithPassword");
        hostStartWithPasswordAndMods(z, str, true);
    }

    public void hostStartWithPasswordAndMods(boolean z, String str, boolean z2) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.networkEngine.m1690b("starting new");
        gameEngine.networkEngine.f5475n = str;
        gameEngine.networkEngine.f5476o = z2;
        gameEngine.networkEngine.f5478q = z;
        if (gameEngine.networkEngine.m1687b(false)) {
            logDebug("-Hosting-");
            logDebug("using password: " + (gameEngine.networkEngine.f5475n != null));
            logDebug("using mods: " + (gameEngine.networkEngine.f5476o));
            logDebug("public: " + (gameEngine.networkEngine.f5478q));
            String m1707av = gameEngine.networkEngine.m1707av();
            if (m1707av != null && !C0750a.m2443h(m1707av)) {
                GameEngine.m1145b("hostStart: map does not exist: " + m1707av + " reseting");
                m1707av = null;
            }
            if (m1707av == null) {
                gameEngine.networkEngine.f5597aO.f5648a = EnumC0846ai.values()[0];
                gameEngine.networkEngine.f5598aP = "maps/skirmish/[p8]Many Islands (8p).tmx";
                gameEngine.networkEngine.f5597aO.f5649b = "[p8]Many Islands (8p).tmx";
            }
            this.libRocket.setDocument("battleroom.rml", null);
            return;
        }
        logWarn("hosting failed");
    }

    public void exit() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.f6109bQ.numLoadsSinceRunningGameOrNormalExit != 0) {
            gameEngine.f6109bQ.numLoadsSinceRunningGameOrNormalExit = 0;
            gameEngine.f6109bQ.save();
        }
        this.scriptEngine.addRunnableToQueue(new RunnableC00593());
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$3.class */
    class RunnableC00593 implements Runnable {
        RunnableC00593() {
        }

        public void run() {
            Root.this.guiEngine.mo305d(true);
        }
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
        return C0820a.m1884b(convertMapNameWithoutTranslation(str));
    }

    public String convertMapNameWithoutTranslation(String str) {
        return ActivityC0117i.m6932e(str);
    }

    public String getHTMLMapThumbnail(String str) {
        return escapedString(getMapThumbnail(str));
    }

    public String getMapThumbnail(String str) {
        if (str.startsWith("saves/")) {
        }
        String m6969c = C0090c.m6969c(str);
        String str2 = "thumbnail:assets:" + m6969c;
        if (!C0750a.m2443h(m6969c)) {
            if (GameEngine.f6204aZ) {
                GameEngine.m1193a("getMapThumbnail: Failed to find: " + m6969c);
                return "drawable:error_missingmap.png";
            }
            return "drawable:error_missingmap.png";
        }
        return str2;
    }

    public boolean isMapSkirmish(String str) {
        return ActivityC0117i.m6931f(str);
    }

    public void showLevelOptions() {
        GameEngine gameEngine = GameEngine.getInstance();
        String str = (String) this.libRocket.m7050b("mode");
        if (str == null) {
            GameEngine.m1120g("levelPath==null");
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
            elementById.show(z || ActivityC0117i.m6930g(str));
        }
        activeDocument.getElementById("aiDifficulty").setValue(VariableScope.nullOrMissingString + gameEngine.f6109bQ.aiDifficulty);
    }

    public void loadConfigAndStartSwitchToAdvanced(String str) {
        GameEngine.getInstance().f6094bv = false;
        loadConfigCommon(str, true);
        _startAdvancedMode(false);
    }

    private void _startAdvancedMode(boolean z) {
        boolean m1784S;
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.networkEngine.m1690b("starting singleplayer");
        gameEngine.networkEngine.f5481y = "You";
        gameEngine.networkEngine.f5476o = true;
        if (z) {
            m1784S = gameEngine.networkEngine.m1785R();
        } else {
            m1784S = gameEngine.networkEngine.m1784S();
        }
        if (m1784S) {
            logDebug("started startSinglePlayerServer");
            C0845ah m1666e = gameEngine.networkEngine.m1666e();
            if (m1666e != null) {
                m1666e.f5653f = gameEngine.f6109bQ.aiDifficulty;
                gameEngine.networkEngine.m1761a(m1666e);
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
        GameEngine.PrintLog("loadConfigAndStartNewSandboxInAdvanced");
        _loadConfigAndStartNewSandboxCommon(str, false);
        _startAdvancedMode(true);
        GameEngine.PrintLog("editorMode:" + GameEngine.getInstance().f6094bv);
    }

    private void _loadConfigAndStartNewSandboxCommon(String str, boolean z) {
        if (str.startsWith("saves/")) {
            GameEngine.PrintLog("Starting sandbox from save: " + str);
            loadGame(str.substring("saves/".length()));
        } else {
            GameEngine.PrintLog("Starting sandbox from map: " + str);
            loadConfigCommon(str, false);
        }
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6104bL.f840E = false;
        gameEngine.f6111bS.m1958x();
        gameEngine.f6094bv = true;
        if (z) {
            this.guiEngine.m7071e();
        }
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void loadConfigAndStartNew(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6094bv = false;
        gameEngine.networkEngine.m1690b("starting singleplayer");
        loadConfigCommon(str, false);
        this.guiEngine.m7071e();
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void loadConfigCommon(String str, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        gameEngine.f6109bQ.aiDifficulty = activeDocument.getElementById("aiDifficulty").getValueAsInt(0).intValue();
        gameEngine.f6109bQ.save();
        this.guiEngine.m7075b(true);
        this.guiEngine.m7073c(false);
        boolean isMapSkirmish = isMapSkirmish(str);
        int intValue = activeDocument.getElementById("numberOfAIs").getValueAsInt(4).intValue();
        boolean z2 = true;
        int intValue2 = activeDocument.getElementById("aiTeams").getValueAsInt(1).intValue();
        int i = intValue2 - 1;
        if (intValue2 == 5) {
            i = 0;
            z2 = false;
        }
        ActivityC0117i.m6934a(str, isMapSkirmish, intValue, i, z2, z);
    }

    public void showMapPopup(String str, String str2) {
        ElementDocument m7058a = this.libRocket.m7058a("levelSelect.rml", (Object) str, "Map Select", false);
        if (m7058a != null) {
            m7058a.setMetadata("mapClickFunction", str2);
            Iterator it = m7058a.findElementsByClassName("noStyleInPopup").iterator();
            while (it.hasNext()) {
                ((Element) it.next()).setAttribute("class", VariableScope.nullOrMissingString);
            }
            if (showMapsWithDoc(m7058a)) {
                GameEngine.PrintLog("showMapsWithDoc passed");
                this.libRocket.m7040h();
                this.libRocket.m7062a(m7058a);
            }
        }
    }

    public void refreshAfterFileImport() {
        GameEngine.PrintLog("refreshAfterFileImport");
        GameEngine.getInstance().f6118bZ.m1850k();
        this.libRocket.reloadDocument();
    }

    public boolean showMaps() {
        return showMapsWithDoc(this.libRocket.m7042f());
    }

    public boolean showMapsWithDoc(ElementDocument elementDocument) {
        String[] m1866a;
        String[] strArr;
        String str;
        String str2;
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.PrintLog("showMaps");
        if (elementDocument == null) {
            GameEngine.PrintLog("showMaps: elementDocument==null");
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
            m1866a = ActivityC0118j.m6928l();
            if (m1866a == null) {
                gameEngine.m1192a("No saves", 1);
                return false;
            }
        } else if (equals2) {
            m1866a = ActivityC0131q.m6899l();
            if (!gameEngine.f6109bQ.saveMultiplayerReplays) {
                alert("Note: Multiplayer replay recordings are not turned on. You can enable them in the settings.");
            }
            if (m1866a == null) {
                if (gameEngine.f6109bQ.saveMultiplayerReplays) {
                    gameEngine.m1192a("No replays yet", 1);
                    return false;
                }
                return false;
            }
        } else {
            m1866a = gameEngine.f6118bZ.m1866a(C0750a.m2460a(str4, true), str4);
            if (m1866a == null) {
                gameEngine.m1192a("Could not find folder: " + C0750a.m2447e(str4), 1);
                return false;
            }
        }
        String str6 = str4 + "/";
        int i = 0;
        for (String str7 : m1866a) {
            String convertMapName = convertMapName(str7);
            boolean m6935a = ActivityC0117i.m6935a(str7, str6 + str7);
            String str8 = convertMapName + VariableScope.nullOrMissingString;
            if (gameEngine.f6222ar && !m6935a) {
                str8 = "[LOCKED] " + str8;
            }
            String replace = innerRML.replace("_NAME_", htmlString(str8));
            if (equals) {
                str = "loadGame(" + escapedString(str7) + ")";
                str2 = "loadGameEdit(" + escapedString(str7) + ")";
            } else if (equals2) {
                str = "loadReplay(" + escapedString(str7) + ")";
                str2 = "loadReplayEdit(" + escapedString(str7) + ")";
            } else {
                str = "open('levelOptions.rml', " + escapedString(str6 + str7) + ")";
                str2 = VariableScope.nullOrMissingString;
            }
            if (str5 != null) {
                str = str5 + "(" + escapedString(str6 + str7) + ")";
                str2 = VariableScope.nullOrMissingString;
            }
            String replace2 = replace.replace("_ONCLICK_", str).replace("_ONCLICKEDIT_", str2);
            String str9 = "thumbnail:assets:";
            int i2 = 18;
            if (startsWith) {
                i2 = 2;
            }
            if (i > i2) {
                str9 = "lazy:" + str9;
            }
            String m6969c = C0090c.m6969c(str6 + str7);
            if (GameEngine.f6204aZ) {
            }
            String str10 = str9 + m6969c;
            if (!C0750a.m2443h(m6969c)) {
                if (GameEngine.f6204aZ) {
                    GameEngine.m1193a("List: Failed to find: " + m6969c + " after converting:" + m6969c + " ( " + str10 + " )");
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
        } else {
            elementById2.addClass("notSavesOnly");
        }
        if (startsWith && str5 == null && GameEngine.m1158at()) {
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
        if (this.libRocket.getHeight() < 800) {
            activeDocument.addClass("smallScreen");
        }
        convertTextStopwatch.m2601a();
        Iterator it = activeDocument.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            int numAttributes = element.getNumAttributes();
            for (int i = 0; i < numAttributes; i++) {
                String attributeKey = element.getAttributeKey(i);
                String attributeValue = element.getAttributeValue(i);
                if (attributeKey != null) {
                    if (attributeKey.equals("nestedclone") && !attributeValue.equalsIgnoreCase("false")) {
                        GameEngine.PrintLog("nested clone:" + element.getId());
                        element.setAttribute(attributeKey, "false");
                        Element m5347clone = element.m5347clone();
                        element.prependChild(m5347clone);
                        m5347clone.removeReference();
                    } else if (attributeKey.equals("childclone") && !attributeValue.equalsIgnoreCase("false")) {
                        element.setAttribute(attributeKey, "false");
                        if (element.getNumChildren() < 1) {
                            GameEngine.PrintLog("child clone failed no children:" + element.getId());
                        }
                        Element m5347clone2 = element.getChild(0).m5347clone();
                        m5347clone2.addClass("clone");
                        element.prependChild(m5347clone2);
                        m5347clone2.removeReference();
                    } else {
                        String m7044d = this.libRocket.m7044d(attributeValue);
                        if (m7044d != null) {
                            GameEngine.PrintLog("convertTextOnPage:" + attributeKey + ": '" + attributeValue + "' to '" + m7044d + "'");
                            if (attributeKey.equals("_html")) {
                                GameEngine.PrintLog("setting html:" + attributeKey);
                                element.setInnerRML(m7044d);
                            } else {
                                if (attributeKey.startsWith("_")) {
                                    attributeKey = attributeKey.substring("_".length());
                                    GameEngine.PrintLog("converted key to:" + attributeKey);
                                }
                                element.setAttribute(attributeKey, m7044d);
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
        convertTextStopwatch.m2598d();
    }

    public void keyBindingPopup_apply(boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        ElementDocument m7048c = this.libRocket.m7048c();
        if (m7048c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        String[] split = ((String) m7048c.getMetadata("mode")).split(":");
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        C0639ad c0639ad = (C0639ad) gameEngine.f6112bT.f4140al.get(parseInt);
        if (!z) {
            Object metadata = m7048c.getMetadata("lastKeyPressed");
            if (metadata == null) {
                logWarn("keyBindingPopup_apply: no last key entered");
                return;
            }
            int intValue = ((Integer) metadata).intValue();
            int i = 0;
            Object metadata2 = m7048c.getMetadata("lastKeyModifiersPressed");
            if (metadata2 != null) {
                i = ((Integer) metadata2).intValue();
            }
            c0639ad.m2956a(intValue, parseInt2, i, true);
        } else {
            c0639ad.m2956a(0, parseInt2, 0, true);
        }
        showKeyBinding();
        closePopup();
    }

    public void keyBindingPopup_onKeydown(int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        ElementDocument m7048c = this.libRocket.m7048c();
        if (m7048c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        Element elementById = m7048c.getElementById("keyBindMessage");
        if (elementById == null) {
            logWarn("showKeyBindingActionPopup: keyBindMessage==null");
            return;
        }
        int mo302h = this.guiEngine.mo302h();
        String str = VariableScope.nullOrMissingString + GameEngine.m1115j(mo302h);
        if (i == 111) {
        }
        if (i == 0) {
            logWarn("keyBindingPopup_onKeydown: skipping keycode 0");
        } else if (!gameEngine.m1117i(i)) {
            m7048c.setMetadata("lastKeyPressed", Integer.valueOf(i));
            m7048c.setMetadata("lastKeyModifiersPressed", Integer.valueOf(mo302h));
            String str2 = str + SlickToAndroidKeycodes.m764a(i);
            keyBindingPopup_apply(false);
        } else {
            elementById.setText("Key: " + str);
        }
    }

    public void showKeyBindingPopup() {
        GameEngine gameEngine = GameEngine.getInstance();
        ElementDocument m7048c = this.libRocket.m7048c();
        if (m7048c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        Element elementById = m7048c.getElementById("keyBindMessage");
        if (elementById == null) {
            logWarn("showKeyBindingActionPopup: keyBindMessage==null");
            return;
        }
        String[] split = ((String) m7048c.getMetadata("mode")).split(":");
        int parseInt = Integer.parseInt(split[0]);
        Integer.parseInt(split[1]);
        C0639ad c0639ad = (C0639ad) gameEngine.f6112bT.f4140al.get(parseInt);
        elementById.setText("Press a key..");
    }

    public String getKeyBindingAction(int i, C0639ad c0639ad, int i2) {
        return "createAndShowPopup('settingsKeyBindingSet.rml', " + escapedString(i + ":" + i2) + ", " + escapedString(c0639ad.f4144a) + "); showKeyBindingPopup();";
    }

    public void backWarnIfOverlappingKeyBinding() {
        if (((Boolean) this.libRocket.getActiveDocument().getMetadata("hasOverlappingKeys", false)).booleanValue()) {
            showPopupWithButtons(null, "One or more keys are overlapping and have been highlighted in red. These can cause problems.", false, new C0051e("Ignore", new RunnableC00604()), new C0051e("Fix", new RunnableC00615()));
        } else {
            back();
        }
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$4.class */
    class RunnableC00604 implements Runnable {
        RunnableC00604() {
        }

        public void run() {
            Root.this.closePopup();
            Root.this.back();
        }
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$5.class */
    class RunnableC00615 implements Runnable {
        RunnableC00615() {
        }

        public void run() {
            Root.this.closePopup();
        }
    }

    public void showKeyBinding() {
        GameEngine gameEngine = GameEngine.getInstance();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        activeDocument.setMetadata("event_onkeydown", "keyBindingPopup_onKeydown");
        TableData tableData = new TableData();
        ArrayList arrayList = tableData.rows;
        ArrayList arrayList2 = gameEngine.f6112bT.f4140al;
        boolean z = false;
        for (int i = 0; i < arrayList2.size(); i++) {
            C0639ad c0639ad = (C0639ad) arrayList2.get(i);
            if (c0639ad.f4145b) {
                TableRow tableRow = new TableRow();
                tableRow.addCell(c0639ad.f4144a);
                if (c0639ad.mo2946d()) {
                    tableRow.addClass("rowHeader");
                } else {
                    for (int i2 = 0; i2 <= 1; i2++) {
                        boolean m2965a = gameEngine.f6112bT.m2965a(c0639ad, i2);
                        TableCell addCell = tableRow.addCell(c0639ad.m2951b(i2));
                        addCell.setLibrocketOnClick(getKeyBindingAction(i, c0639ad, i2));
                        if (m2965a) {
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
        loadSettingsStopwatch.m2601a();
        logDebug("loadSettings");
        Iterator it = this.libRocket.getActiveElementById("body").getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.getAttribute("data-settings") != null) {
                String id = element.getId();
                String attribute = element.getAttribute("type", "unknown");
                String valueDynamic = gameEngine.f6109bQ.getValueDynamic(id);
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
        loadSettingsStopwatch.m2598d();
    }

    public void applyResolution() {
        this.guiEngine.mo304f();
    }

    public void updateRenderScaleInSettings(boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        Element activeElementById = this.libRocket.getActiveElementById("uiRenderScale");
        if (activeElementById == null) {
            logDebug("updateRenderScaleInSettings: uiRenderScale==null");
            return;
        }
        Float valueAsFloat = activeElementById.getValueAsFloat(Float.valueOf(1.0f));
        this.libRocket.getActiveElementById("uiRenderScaleDisplay").compareAndSetText("x" + CommonUtils.m2318b(valueAsFloat.floatValue() + 0.01f, 1));
        if (z) {
            float f = gameEngine.f6109bQ.uiRenderScale;
            gameEngine.f6109bQ.uiRenderScale = valueAsFloat.floatValue();
            try {
                applyResolution();
                gameEngine.f6109bQ.uiRenderScale = f;
            } catch (Throwable th) {
                gameEngine.f6109bQ.uiRenderScale = f;
                throw th;
            }
        }
    }

    public void closeSettings() {
        applyResolution();
    }

    public void saveSettings() {
        String attribute;
        GameEngine gameEngine = GameEngine.getInstance();
        logDebug("saveSettings");
        Iterator it = this.libRocket.getActiveElementById("body").getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.getAttribute("data-settings") != null) {
                String id = element.getId();
                if (element.getAttribute("type", "unknown").equals("checkbox")) {
                    String attribute2 = element.getAttribute("checked");
                    if (attribute2 == null || "false".equals(attribute2)) {
                        attribute = "false";
                    } else {
                        attribute = "true";
                    }
                } else {
                    attribute = element.getAttribute("value");
                }
                try {
                    gameEngine.f6109bQ.setValueDynamic(id, attribute);
                } catch (NumberFormatException e) {
                    alert("Error:" + e.getMessage());
                }
            }
        }
        this.guiEngine.mo304f();
        C0894j.m1403a();
        C0820a.m1879e();
        this.guiEngine.mo303g();
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
        if (GameEngine.m1158at()) {
            return "hide";
        }
        return VariableScope.nullOrMissingString;
    }

    public boolean canResume() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine != null && gameEngine.f6236bG && !gameEngine.f6237bH) {
            return true;
        }
        return false;
    }

    public boolean isMobile() {
        return GameEngine.m1158at();
    }

    public boolean isIOS() {
        return GameEngine.f6204aZ;
    }

    public boolean isDesktop() {
        return GameEngine.m1157au();
    }

    public boolean isMac() {
        return C0191i.f1218c;
    }

    public boolean hasModSupport() {
        return !GameEngine.f6204aZ;
    }

    public boolean usingMods() {
        if (!GameEngine.f6204aZ || GameEngine.getInstance().f6118bZ.m1863c() > 0) {
            return true;
        }
        return false;
    }

    public boolean hasWorkshopSupport() {
        return GameEngine.m1157au();
    }

    public boolean hasReloadSupport() {
        return !GameEngine.f6204aZ;
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

    public void checkServerListScroll() {
        Element activeElementById = this.libRocket.getActiveElementById("serverScrollDiv");
        if (activeElementById == null) {
            logWarn("serverScrollDiv==null");
            return;
        }
        Boolean bool = (Boolean) this.libRocket.m7050b("showFullServerList");
        if (bool == null) {
            bool = false;
        }
        if (!bool.booleanValue() && activeElementById.getScrollTop() > 200.0f) {
            this.libRocket.getActiveDocument().setMetadata("showFullServerList", true);
            this.scriptEngine.addScriptToQueue("displayServerList()");
        }
    }

    public void refreshServerList() {
        refreshServerListRaw("serverListData", "serverRowTemplateHolder", "refreshButton");
    }

    public void displayServerList() {
        displayServerListRaw("serverListData", "serverRowTemplateHolder", "refreshButton");
    }

    public void refreshServerListRaw(String str, String str2, String str3) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (str3 != null) {
            this.libRocket.getActiveElementById(str3).setText("Refreshing");
        }
        RunnableC00626 runnableC00626 = new RunnableC00626(str, str2, str3);
        gameEngine.networkEngine.f5607bx = null;
        C0879n.m1430a(runnableC00626);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.librocket.scripts.Root$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$6.class */
    public class RunnableC00626 implements Runnable {
        final /* synthetic */ String val$serverListDataId;
        final /* synthetic */ String val$serverRowTemplateId;
        final /* synthetic */ String val$refreshButton;

        RunnableC00626(String str, String str2, String str3) {
            this.val$serverListDataId = str;
            this.val$serverRowTemplateId = str2;
            this.val$refreshButton = str3;
        }

        public void run() {
            Root.this.scriptEngine.addScriptToQueue("displayServerListRaw(" + Root.this.restrictedString(this.val$serverListDataId) + "," + Root.this.restrictedString(this.val$serverRowTemplateId) + "," + Root.this.restrictedString(this.val$refreshButton) + ")");
        }
    }

    public void displayServerListRaw(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        GameEngine gameEngine = GameEngine.getInstance();
        Element activeElementById = this.libRocket.getActiveElementById(str);
        Element activeElementById2 = this.libRocket.getActiveElementById(str2);
        if (activeElementById == null) {
            GameEngine.m1145b("serverListData is null, we may have changed page");
            return;
        }
        ArrayList m6903m = ActivityC0129p.m6903m();
        this.lastSortedDiscoveredServers = m6903m;
        String m1886a = C0820a.m1886a("menus.lobby.gameState.battleroom", new Object[0]);
        String m1886a2 = C0820a.m1886a("menus.lobby.gameState.ingame", new Object[0]);
        String m1886a3 = C0820a.m1886a("menus.lobby.gameState.chat", new Object[0]);
        if (activeElementById.getNumChildren() > m6903m.size()) {
            for (int numChildren = activeElementById.getNumChildren() - 1; numChildren >= m6903m.size(); numChildren--) {
                GameEngine.PrintLog("removing rowIndex:" + numChildren);
                activeElementById.removeChild(activeElementById.getChild(numChildren));
            }
            if (activeElementById.getNumChildren() != m6903m.size()) {
                GameEngine.m1145b("-- Non matching size after clean up:" + activeElementById.getNumChildren() + " vs " + m6903m.size());
            }
        }
        Boolean bool = (Boolean) this.libRocket.m7050b("showFullServerList");
        if (bool == null) {
            bool = false;
        }
        int i = 0;
        if (!bool.booleanValue() && m6903m.size() > 50) {
            ArrayList arrayList = new ArrayList();
            Iterator it = m6903m.iterator();
            while (it.hasNext()) {
                arrayList.add((C0872g) it.next());
                if (arrayList.size() > 50) {
                    break;
                }
            }
            i = m6903m.size() - arrayList.size();
            m6903m = arrayList;
        }
        int i2 = 0;
        Iterator it2 = m6903m.iterator();
        while (it2.hasNext()) {
            C0872g c0872g = (C0872g) it2.next();
            Element element = null;
            if (i2 < activeElementById.getNumChildren()) {
                element = activeElementById.getChild(i2);
            }
            if (element != null && element.hasClassName("serverRowMessage")) {
                GameEngine.PrintLog("removing non rowIndex:" + i2);
                activeElementById.removeChild(element);
                element = null;
            }
            if (element != null && element.findByClassName("rState") == null) {
                GameEngine.PrintLog("removing non rowIndex with no rState:" + i2);
                activeElementById.removeChild(element);
                element = null;
            }
            if (element == null) {
                element = activeElementById2.m5347clone();
                activeElementById.appendChild(element);
                element.removeReference();
                element.setAttribute("onclick", "clickedServerRow(" + i2 + ")");
            }
            String str7 = c0872g.f5834s;
            if (str7 != null) {
                str7 = str7.replace("battleroom", m1886a).replace("ingame", m1886a2).replace("chat", m1886a3);
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            if (c0872g != null && c0872g.f5837x) {
                z = true;
                if ("chat".equalsIgnoreCase(c0872g.f5834s)) {
                    z2 = true;
                }
                if (c0872g.m1478d()) {
                    z4 = true;
                }
            }
            int argb = Color.argb(255, 255, 255, 255);
            String str8 = "serverRow serverRowData realServerRow ";
            if (c0872g != null) {
                if (z) {
                    str8 = str8 + "dedicatedServerRow ";
                    if (z2 || z4) {
                        argb = Color.argb(255, 152, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_DIGITAL, 249);
                        str8 = str8 + "chatRow ";
                    }
                } else {
                    if (c0872g.f5824h) {
                        argb = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
                        str8 = str8 + "openRow ";
                    }
                    if (c0872g.f5817a) {
                        argb = Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LAST_CHANNEL, 149, 35);
                        str8 = str8 + "lanRow ";
                    }
                }
                if (c0872g.m1481a()) {
                    str8 = str8 + "lastConnectedRow ";
                }
                if (!z2 && !z4 && !(VariableScope.nullOrMissingString + gameEngine.m1135c(true)).equals(c0872g.f5825j)) {
                    z3 = true;
                }
            }
            String str9 = VariableScope.nullOrMissingString + "color:" + CommonUtils.m2252h(argb) + ";";
            if (0 != 0) {
                String str10 = str9 + "font-weight: bold;";
                str8 = str8 + "boldRow ";
            }
            element.compareAndSetClassNames(str8);
            element.findByClassName("rState").compareAndSetText(str7);
            element.findByClassName("rHost").compareAndSetText(CommonUtils.m2334a(c0872g.f5829n, 15));
            if (c0872g.f5835t == "?") {
                str4 = "?";
            } else {
                str4 = c0872g.f5835t + "\\" + c0872g.f5836u;
            }
            element.findByClassName("rPlayers").compareAndSetText(CommonUtils.m2334a(str4, 15));
            String m2334a = CommonUtils.m2334a(ActivityC0117i.m6932e(c0872g.f5832q), 40);
            if (m2334a == null) {
                m2334a = VariableScope.nullOrMissingString;
            }
            element.findByClassName("rMap").compareAndSetText(m2334a);
            if ("ANY".equalsIgnoreCase(c0872g.f5826k)) {
                str5 = c0872g.f5826k;
            } else {
                str5 = "v" + CommonUtils.m2334a(c0872g.f5826k, 8);
            }
            Element findByClassName = element.findByClassName("rVersion");
            findByClassName.compareAndSetText(str5);
            String str11 = "cell rVersion ";
            if (z3) {
                String str12 = "color:" + CommonUtils.m2252h(Color.argb(255, 155, 147, 147)) + ";";
                str11 = str11 + "nonMatchingRow ";
            } else {
                String str13 = "color:" + CommonUtils.m2252h(argb) + ";";
            }
            findByClassName.compareAndSetClassNames(str11);
            if (c0872g.f5824h) {
                if (c0872g.f5828m) {
                    str6 = "P";
                } else {
                    str6 = "Y";
                }
            } else {
                str6 = "N";
            }
            if (c0872g.f5817a) {
                str6 = "L";
            }
            Element findByClassName2 = element.findByClassName("rOpen");
            findByClassName2.compareAndSetText(str6);
            String str14 = "cell rOpen ";
            if (!c0872g.f5824h && !c0872g.f5817a) {
                String str15 = "color:" + CommonUtils.m2252h(Color.argb(255, 155, 147, 147)) + ";";
                str14 = str14 + "notOpenRow ";
            } else {
                String str16 = "color:" + CommonUtils.m2252h(argb) + ";";
            }
            findByClassName2.compareAndSetClassNames(str14);
            i2++;
        }
        if (m6903m.size() == 0 && gameEngine.networkEngine.f5607bx != null) {
            String str17 = "ERROR: " + gameEngine.networkEngine.f5607bx;
            Element m5347clone = activeElementById2.m5347clone();
            activeElementById.appendChild(m5347clone);
            m5347clone.removeReference();
            m5347clone.setText(str17);
        }
        Element activeElementById3 = this.libRocket.getActiveElementById("padding");
        if (activeElementById3 == null && i > 0) {
            activeElementById3 = activeElementById2.m5347clone();
            activeElementById.appendChild(activeElementById3);
            activeElementById3.removeReference();
            activeElementById3.setAttribute("id", "padding");
            activeElementById3.addClass("serverRowMessage");
        }
        if (activeElementById3 != null && i > 0) {
            activeElementById3.setStyle("height:" + (18 * i) + "px;");
        }
        if (str3 != null) {
            this.libRocket.getActiveElementById(str3).setText("Refresh");
        }
        GameEngine.m1145b("DONE");
    }

    public void clickedServerRow(int i) {
        clickedServer(((C0872g) this.lastSortedDiscoveredServers.get(i)).f5818b);
    }

    public void clickedServer(String str) {
        String str2;
        if (getAlertOrPopup() != null) {
            logWarn("clickedServer: getAlertOrPopup!=null");
            return;
        }
        try {
            C0872g m1417b = C0879n.m1417b(str);
            if (m1417b == null) {
                logWarn("clickedServer: server==null");
                alert("That server no longer exists");
                return;
            }
            String m1480b = m1417b.m1480b();
            if (m1417b.m1478d()) {
                str2 = "[onenter]Open Link:closePopup(); openWhitelistedLink(" + restrictedString(m1417b.m1479c()) + ");";
            } else if (!m1417b.f5817a) {
                str2 = "[onenter]Join:closePopup(); joinServerWithId(" + restrictedString(m1417b.m1477e()) + "," + restrictedString(m1417b.f5818b) + ");";
            } else {
                str2 = "[onenter]Join over LAN:closePopup(); joinServerWithId(" + restrictedString(m1417b.m1476f()) + "," + restrictedString(m1417b.f5818b) + ");";
            }
            showPopup(null, m1480b, true, str2, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void hideKeyboard() {
        this.guiEngine.m7067l();
    }

    public void saveGame(String str) {
        closePopup();
        hideKeyboard();
        GameEngine.getInstance().f6119ca.m444b(str.replace(".", "_").replace("/", "_").replace("\\", "_"), false);
    }

    public void exportMap(String str) {
        closePopup();
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            gameEngine.f6104bL.m6612b(gameEngine.f6159dk, "/SD/rusted_warfare_maps/" + str.replace(".", "_").replace("/", "_").replace("\\", "_").replace("|", "_").replace("?", "_") + ".tmx");
            showAlert("Map exported");
        } catch (C0179f e) {
            showAlert("Failed to export map. error: " + e.getMessage());
        } catch (IOException e2) {
            showAlert("Failed to export map. IO error: " + e2.getMessage());
        }
    }

    public void loadGame(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.networkEngine.m1690b("loading new save");
        gameEngine.f6094bv = false;
        if (gameEngine.f6119ca.m442c(str, false)) {
            resumeNonMenu();
        }
    }

    public void loadGameEdit(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0051e c0051e = null;
        if (C0913a.m1241b()) {
            c0051e = new C0051e("Share", new RunnableC00637(gameEngine, str));
        }
        showPopupWithButtons(null, str, true, c0051e, new C0051e("Delete", new RunnableC00648(gameEngine, str)));
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$7.class */
    class RunnableC00637 implements Runnable {
        final /* synthetic */ GameEngine val$game;
        final /* synthetic */ String val$saveName;

        RunnableC00637(GameEngine gameEngine, String str) {
            this.val$game = gameEngine;
            this.val$saveName = str;
        }

        public void run() {
            Root.this.closePopup();
            C0913a.m1242a(this.val$game.f6119ca.m448a(this.val$saveName, false));
        }
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$8.class */
    class RunnableC00648 implements Runnable {
        final /* synthetic */ GameEngine val$game;
        final /* synthetic */ String val$saveName;

        RunnableC00648(GameEngine gameEngine, String str) {
            this.val$game = gameEngine;
            this.val$saveName = str;
        }

        public void run() {
            this.val$game.f6119ca.m445b(this.val$saveName);
            Root.this.closePopup();
            Root.this.showMaps();
        }
    }

    public void loadReplay(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6094bv = false;
        if (gameEngine.f6120cb.m2642c(str)) {
            resumeNonMenu();
        }
    }

    public void loadReplayEdit(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0051e c0051e = null;
        if (C0913a.m1241b()) {
            c0051e = new C0051e("Share", new RunnableC00659(gameEngine, str));
        }
        showPopupWithButtons(null, str, true, c0051e, new C0051e("Delete", new RunnableC005610(gameEngine, str)));
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$9.class */
    class RunnableC00659 implements Runnable {
        final /* synthetic */ GameEngine val$game;
        final /* synthetic */ String val$replayName;

        RunnableC00659(GameEngine gameEngine, String str) {
            this.val$game = gameEngine;
            this.val$replayName = str;
        }

        public void run() {
            Root.this.closePopup();
            C0913a.m1242a(this.val$game.f6120cb.m2648a(this.val$replayName, false));
        }
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$10 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$10.class */
    class RunnableC005610 implements Runnable {
        final /* synthetic */ GameEngine val$game;
        final /* synthetic */ String val$replayName;

        RunnableC005610(GameEngine gameEngine, String str) {
            this.val$game = gameEngine;
            this.val$replayName = str;
        }

        public void run() {
            this.val$game.f6120cb.m2638e(this.val$replayName);
            Root.this.closePopup();
            Root.this.showMaps();
        }
    }

    public void makeSaveGamePopup(String str) {
        String str2;
        GameEngine gameEngine = GameEngine.getInstance();
        if (str == null) {
            str2 = (gameEngine.m1167ak() + " (" + CommonUtils.m2336a("d MMM yyyy HH-mm-ss") + ")").replace("  ", " ");
        } else {
            str2 = str;
        }
        showInputPopup("Save Game", "Enter a name to save the game under", str2, "[onenter]Save:saveGame(getPopupText())", null);
    }

    public void makeExportMapGamePopup(String str) {
        String str2;
        GameEngine gameEngine = GameEngine.getInstance();
        if (str == null) {
            str2 = ("New " + gameEngine.m1167ak() + " - " + CommonUtils.m2336a("d MMM yyyy")).replace("  ", " ");
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
        this.guiEngine.m7067l();
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return;
        }
        gameEngine.networkEngine.m1628m(str);
        gameEngine.f6111bS.f5201p = false;
    }

    public void sendTeamChatMessageAndPing(String str) {
        sendTeamChatMessage(str);
        GameEngine.getInstance().f6111bS.m2071H();
    }

    public void sendTeamChatMessage(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        this.guiEngine.m7067l();
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            return;
        }
        gameEngine.networkEngine.m1630l(str);
    }

    public void receiveChatMessage(int i, String str, String str2, Connection connection) {
        refreshChat();
    }

    public void refreshChat() {
        Element activeElementById;
        Element activeElementById2;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.libRocket.getActiveDocument() == null || (activeElementById = this.libRocket.getActiveElementById("chatLogHistory")) == null) {
            return;
        }
        boolean attributeBoolean = activeElementById.getAttributeBoolean("reversed", false);
        if (gameEngine.networkEngine.f5565F && (activeElementById2 = this.libRocket.getActiveElementById("chatBox")) != null) {
            activeElementById2.hide();
        }
        activeElementById.setInnerRML(VariableScope.nullOrMissingString);
        ConcurrentLinkedQueue m1812b = gameEngine.networkEngine.f5599aS.m1812b();
        StringBuffer stringBuffer = new StringBuffer();
        Iterator it = m1812b.iterator();
        while (it.hasNext()) {
            C0866b c0866b = (C0866b) it.next();
            if (attributeBoolean) {
                stringBuffer.insert(0, "<div>" + c0866b.m1513b() + "</div>");
            } else {
                stringBuffer.append("<div>" + c0866b.m1513b() + "</div>");
            }
        }
        stringBuffer.append("<div id='chatLastRowSpacer'></div>");
        activeElementById.setInnerRML(stringBuffer.toString());
        activeElementById.loadCharsetIfNeededWithCurrentText();
        Element activeElementById3 = this.libRocket.getActiveElementById("chatLastRowSpacer");
        if (activeElementById3 != null) {
            activeElementById3.scrollIntoView(false);
        }
    }

    public void trace(String str) {
        GameEngine.PrintLog("Trace:" + str);
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
            if (!CommonUtils.m2267e(this.librocketOnClick, tableRow.librocketOnClick) || !CommonUtils.m2267e(this.extraClasses, tableRow.extraClasses) || this.tableCells.size() != tableRow.tableCells.size()) {
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
            if (!CommonUtils.m2267e(this.classes, tableCell.classes) || !CommonUtils.m2267e(this.librocketOnClick, tableCell.librocketOnClick) || !CommonUtils.m2337a(this.color, tableCell.color)) {
                return false;
            }
            if (!z && !CommonUtils.m2267e(this.text, tableCell.text)) {
                return false;
            }
            return true;
        }
    }

    public void updateTableTextOnly(String str, TableData tableData, TableData tableData2) {
        ArrayList arrayList = tableData.rows;
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            GameEngine.m1145b("updateTableText: tableElement:" + str + " is null, we may have changed page");
            return;
        }
        Element elementById = activeElementById.getElementById("tableListData");
        for (int i = 0; i < arrayList.size(); i++) {
            TableRow tableRow = (TableRow) arrayList.get(i);
            for (int i2 = 0; i2 < tableRow.tableCells.size(); i2++) {
                TableCell tableCell = (TableCell) tableRow.tableCells.get(i2);
                Element child = elementById.getChild(i);
                if (child == null) {
                    GameEngine.m1145b("updateTableText failed to get row " + i);
                    return;
                }
                Element child2 = child.getChild(i2);
                if (child2 == null) {
                    GameEngine.m1145b("updateTableText failed to get cell " + i2);
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
            GameEngine.m1145b("refreshTable: tableElement:" + str + " is null, we may have changed page");
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
                    cloneAndFix2.setAttribute("style", "color:" + CommonUtils.m2252h(tableCell.color.intValue()) + ";");
                }
                cloneAndFix.appendChild(cloneAndFix2);
                cloneAndFix2.removeReference();
            }
            elementById2.appendChild(cloneAndFix);
            cloneAndFix.removeReference();
        }
    }

    public ElementDocument createAndShowPopup(String str, Object obj, String str2) {
        return this.libRocket.m7058a(str, obj, str2, true);
    }

    public ElementDocument createPopupHidden(String str, Object obj, String str2) {
        return this.libRocket.m7058a(str, obj, str2, false);
    }

    public boolean tryToShowPopupDocument(ElementDocument elementDocument) {
        return this.libRocket.m7052b(elementDocument);
    }

    public void showMainMenu() {
        GameEngine.getInstance().f6111bS.f5201p = false;
        AbstractC0043a.m7083a().m7077b();
    }

    public void onEnter() {
        ElementDocument m7041g = this.libRocket.m7041g();
        if (m7041g == null) {
            GameEngine.PrintLog("onEnter: elementDocument==null");
            return;
        }
        Iterator it = m7041g.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String attribute = element.getAttribute("onenter");
            if (attribute != null && element.isFocused()) {
                this.scriptEngine.processScript(attribute);
            }
        }
    }

    public void scrollFromFocusedElement(float f) {
        ElementDocument m7041g = this.libRocket.m7041g();
        if (m7041g == null) {
            GameEngine.PrintLog("onEnter: elementDocument==null");
            return;
        }
        Element topLevelFocusedElement = m7041g.getTopLevelFocusedElement();
        if (topLevelFocusedElement == null) {
            GameEngine.PrintLog("focusedElement: Not found");
            return;
        }
        ArrayList chainFromChildElement = m7041g.getChainFromChildElement(topLevelFocusedElement);
        if (chainFromChildElement == null) {
            GameEngine.PrintLog("scrollFromFocusedElement: Failed to find chain");
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
        GameEngine.PrintLog("Found no slider element to offset");
    }

    public boolean isSliderOrUIElementSelected() {
        ElementDocument m7041g = this.libRocket.m7041g();
        if (m7041g == null) {
            GameEngine.PrintLog("onEnter: elementDocument==null");
            return false;
        }
        Element topLevelFocusedElement = m7041g.getTopLevelFocusedElement();
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
                GameEngine.PrintLog("Slider element: true");
                return true;
            }
            GameEngine.PrintLog("Slider element: false");
        }
        GameEngine.PrintLog("Slider element: no element focused");
        return false;
    }

    public void onTouch() {
        ElementDocument m7041g = this.libRocket.m7041g();
        if (m7041g == null) {
            GameEngine.PrintLog("onEnter: elementDocument==null");
            return;
        }
        Iterator it = m7041g.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if ("text".equals(element.getAttribute("type")) && element.isFocused()) {
                this.guiEngine.m7068k();
            }
        }
    }

    public void onEscape() {
        ElementDocument m7041g = this.libRocket.m7041g();
        if (m7041g == null) {
            GameEngine.PrintLog("onEscape: elementDocument==null");
            return;
        }
        boolean z = false;
        Iterator it = m7041g.getAllNestedChildren().iterator();
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
        ElementDocument m7048c = this.libRocket.m7048c();
        if (m7048c == null) {
            return null;
        }
        return m7048c.documentPath;
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
        return C0819g.m1892a() == EnumC0822h.f5402c;
    }

    public boolean not(boolean z) {
        return !z;
    }

    public boolean and(boolean z, boolean z2) {
        return z && z2;
    }

    /* renamed from: or */
    public boolean m7034or(boolean z, boolean z2) {
        return z || z2;
    }

    public void showBattleroom() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        boolean z = true;
        if (activeDocument != null && "battleroom.rml".equals(activeDocument.documentPath)) {
            GameEngine.PrintLog("Already on battleroom page");
            z = false;
        }
        this.libRocket.setDocument("battleroom.rml", null, z);
    }

    public void setDocument(String str) {
        this.libRocket.setDocument(str);
    }

    public void playNextMusicTrack() {
        GameEngine.getInstance().f6106bN.m2920e();
    }

    public void toggleMusic() {
        GameEngine.getInstance().f6106bN.f4170u = !GameEngine.getInstance().f6106bN.f4170u;
    }

    public void updateMusicButton(String str) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById != null) {
            if (GameEngine.getInstance().f6106bN.f4170u) {
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
        int intValue;
        GameEngine gameEngine = GameEngine.getInstance();
        if (str == null) {
            if (gameEngine.networkEngine.f5597aO.f5648a == null) {
                GameEngine.m1145b("getModeMapPath: currentType==0");
                intValue = 0;
            } else {
                intValue = gameEngine.networkEngine.f5597aO.f5648a.ordinal();
            }
        } else {
            Element elementById = element.getElementById(str);
            if (elementById == null) {
                GameEngine.m1120g("getModeMapPath: typeSelector==null");
                intValue = 0;
            } else {
                intValue = elementById.getValueAsInt(0).intValue();
            }
        }
        if (intValue == 0) {
            return "maps/skirmish";
        }
        if (intValue == 1) {
            return "/SD/rusted_warfare_maps";
        }
        if (intValue == 2) {
            return "saves";
        }
        throw new RuntimeException("Unknown typeIndex:" + intValue);
    }

    public void event_unicodeEntered() {
        ElementDocument m7041g = this.libRocket.m7041g();
        if (m7041g != null) {
            Element findByClassName = m7041g.findByClassName("textinputUnicodeWrap");
            if (findByClassName != null) {
                findByClassName.compareAndAddClass("unicodeWasTyped");
                return;
            } else {
                GameEngine.PrintLog("event_unicodeEntered: missing textinput");
                return;
            }
        }
        GameEngine.PrintLog("event_unicodeEntered: missing document");
    }

    public boolean isVersionBeta() {
        return GameEngine.getInstance().m1108m();
    }

    public Object ifCondition(boolean z, Object obj, Object obj2) {
        return z ? obj : obj2;
    }

    /* renamed from: i */
    public String m7035i(String str) {
        return C0820a.m1886a(str, new Object[0]);
    }

    public void openLinkToCG(String str) {
        openWhitelistedLink("http://corrodinggames.com/" + str);
    }

    public void openWhitelistedLink(String str) {
        GameEngine.PrintLog("Opening link:" + str);
        if (!str.startsWith("http://corrodinggames.com/") && !str.startsWith("https://corrodinggames.com/") && !str.startsWith("http://corrodinggames.net/") && !str.startsWith("https://corrodinggames.net/")) {
            GameEngine.PrintLog("Not in whitelist");
        } else if (this.guiEngine.m7076b(str)) {
            alert("Opened link: " + str);
        } else {
            alert("Sorry couldn't load browser to: " + str + " please navigate manually");
        }
    }

    public void writeGameLog(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        LinkedList m7069j = AbstractC0043a.m7083a().m7069j();
        if (m7069j == null) {
            z = true;
        } else {
            synchronized (m7069j) {
                ListIterator listIterator = m7069j.listIterator(CommonUtils.m2311b(0, m7069j.size() - 3000));
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
        GameEngine.PrintLog("writeGameLog ready");
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            GameEngine.PrintLog("Failed to find: " + str);
        } else {
            activeElementById.setInnerRML(stringBuffer.toString());
        }
    }

    public void exportGameLog() {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        LinkedList m7069j = AbstractC0043a.m7083a().m7069j();
        if (m7069j == null) {
            z = true;
        } else {
            synchronized (m7069j) {
                ListIterator listIterator = m7069j.listIterator(CommonUtils.m2311b(0, m7069j.size() - 3000));
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
            File file = new File(C0750a.m2447e("/SD/rustedWarfare/RustedWarfareLog-" + CommonUtils.m2336a("d_MMM_yyyy_HH.mm.ss") + ".txt"));
            FileWriter fileWriter = new FileWriter(file);
            fileWriter.append((CharSequence) stringBuffer.toString());
            fileWriter.flush();
            fileWriter.close();
            C0913a.m1242a(file);
            file.deleteOnExit();
        } catch (Exception e) {
            e.printStackTrace();
            alert("Failed to export logs: " + e.getMessage());
        }
    }

    public void setPageMinWidthAndHeight(float f, float f2) {
        GameEngine.PrintLog("setPageMinWidthAndHeight(" + f + ", " + f2 + ")");
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            GameEngine.PrintLog("setPageMinWidthAndHeight - no page");
            return;
        }
        activeDocument.setMetadataFloat("minWidth", Float.valueOf(f));
        activeDocument.setMetadataFloat("minHeight", Float.valueOf(f2));
        this.guiEngine.m7066m();
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$11 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$11.class */
    class C005711 extends AbstractC0914b {
        C005711() {
        }

        public void onFileSelected() {
            GameEngine.PrintLog("importFilePopup: onFileSelected");
        }

        public void onCancelled() {
            GameEngine.PrintLog("importFilePopup: onCancelled");
        }
    }

    public void importFilePopup() {
        C0913a.m1243a(new C005711());
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public void setDocumentUpdate(ElementDocument elementDocument, Runnable runnable) {
        elementDocument.setMetadata("onUpdateFunction", runnable);
    }

    public void onFrameUpdate(float f) {
        Object metadata;
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument != null && (metadata = activeDocument.getMetadata("onUpdateFunction")) != null) {
            ((Runnable) metadata).run();
        }
    }
}
