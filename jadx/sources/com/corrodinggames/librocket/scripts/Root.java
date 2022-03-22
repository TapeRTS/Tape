package com.corrodinggames.librocket.scripts;

import android.graphics.Color;
import com.Element;
import com.ElementDocument;
import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.AbstractC0048b;
import com.corrodinggames.librocket.C0051e;
import com.corrodinggames.rts.game.C0166i;
import com.corrodinggames.rts.game.p012b.C0154f;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0538ad;
import com.corrodinggames.rts.gameFramework.C0593bl;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.C0659g;
import com.corrodinggames.rts.gameFramework.C0743j;
import com.corrodinggames.rts.gameFramework.EnumC0725h;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p036g.C0678ah;
import com.corrodinggames.rts.gameFramework.p036g.C0697b;
import com.corrodinggames.rts.gameFramework.p036g.C0698c;
import com.corrodinggames.rts.gameFramework.p036g.C0703g;
import com.corrodinggames.rts.gameFramework.p036g.C0710n;
import com.corrodinggames.rts.gameFramework.p036g.EnumC0679ai;
import com.corrodinggames.rts.gameFramework.p036g.RunnableC0685al;
import com.corrodinggames.rts.gameFramework.p038i.AbstractC0741b;
import com.corrodinggames.rts.gameFramework.p038i.C0740a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import com.corrodinggames.rts.p008a.ActivityC0087g;
import com.corrodinggames.rts.p008a.ActivityC0088h;
import com.corrodinggames.rts.p008a.ActivityC0098n;
import com.corrodinggames.rts.p008a.ActivityC0100o;
import com.corrodinggames.rts.p008a.C0067c;
import java.io.File;
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
    C0593bl openDocumentTimer = new C0593bl("openDocument", true);
    RunnableC0685al threadedGameConnector;
    ElementDocument lastConnectingPopup;
    static C0593bl convertTextStopwatch = new C0593bl("ConvertText", true);
    static C0593bl loadSettingsStopwatch = new C0593bl("LoadSettings", true);
    ArrayList lastSortedDiscoveredServers;

    public void logDebug(String str) {
        AbstractC0789l.m683d("ui[debug]: " + str);
    }

    public void logWarn(String str) {
        AbstractC0789l.m683d("ui[warn]: " + str);
    }

    public void back() {
        this.libRocket.backToLastDocument();
        if (this.libRocket.getActiveDocument() == null) {
            AbstractC0789l.m695b("back: libRocket.getActiveDocument()==null");
            AbstractC0789l u = AbstractC0789l.m651u();
            if (u == null || !u.f5582ba) {
                AbstractC0789l.m695b("back: showing main menu!");
                showMainMenu();
                return;
            }
            AbstractC0789l.m695b("back: resuming game");
            this.guiEngine.m4338a(false);
        }
    }

    public void backOrClose() {
        if (!closePopup()) {
            this.libRocket.backToLastDocument();
        }
    }

    public String fullVersionOnlyStyle() {
        if (AbstractC0789l.m651u().f5575am) {
            return "notInDemo";
        }
        return "";
    }

    public void openIfNotDemo(String str, Object obj, String str2) {
        if (AbstractC0789l.m651u().f5575am) {
            alert(str2);
        } else {
            open(str, obj);
        }
    }

    public String getVersionName() {
        return AbstractC0789l.m651u().m658m();
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$1.class */
    class RunnableC00531 implements Runnable {
        final /* synthetic */ String val$level;

        RunnableC00531(String str) {
            this.val$level = str;
        }

        public void run() {
            Root.this.libRocket.setDocument(this.val$level, null, false);
            Root.this.onShowNewScreen();
        }
    }

    public void delayedOpenNoHistory(String str, Object obj) {
        this.scriptEngine.addRunnableToQueue(new RunnableC00531(str)).framesDelay = 1;
    }

    public void open(String str, Object obj) {
        this.openDocumentTimer.m1963a();
        AbstractC0048b.f353a.m1958f();
        HashMap hashMap = null;
        if (obj != null) {
            hashMap = new HashMap();
            hashMap.put("mode", obj);
        }
        this.libRocket.setDocument(str, hashMap);
        onShowNewScreen();
        this.openDocumentTimer.m1960d();
        AbstractC0048b.f353a.m1959e();
    }

    public void onShowNewScreen() {
        this.guiEngine.m4338a(true);
    }

    public void resume() {
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
        this.guiEngine.m4331e();
    }

    public void resumeNonMenu() {
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
        this.guiEngine.m4338a(false);
    }

    public void startNew(String str) {
        this.guiEngine.m4339a(str);
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
        if (activeElementById != null) {
            return activeElementById.getAttribute("value");
        }
        logWarn("Could not find:" + str);
        return null;
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
        if (activeElementById != null) {
            return activeElementById;
        }
        logWarn("Could not find:" + str);
        return null;
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
        AbstractC0789l u = AbstractC0789l.m651u();
        String str = "";
        if (u.f5479by.lastNetworkIP != null) {
            str = u.f5479by.lastNetworkIP;
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
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5479by.lastNetworkIP = trim;
        u.f5479by.save();
        joinServerWithId(trim, null);
    }

    public void joinServerWithId(String str, String str2) {
        AbstractC0789l.m651u().f5486bF.f4778by = str2;
        joinServer(str);
    }

    public void joinServer(String str) {
        logDebug("joinAddress=" + str);
        this.threadedGameConnector = AbstractC0789l.m651u().f5486bF.m1333a(str, false, (Runnable) new RunnableC00542());
        this.lastConnectingPopup = createAndShowPopup("multiplayerLobby_connecting.rml", null, "Please wait");
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$2.class */
    class RunnableC00542 implements Runnable {
        RunnableC00542() {
        }

        public void run() {
            ScriptEngine.getInstance().addScriptToQueue("joinServerCallback();");
        }
    }

    public void joinServerCallback() {
        logDebug("joinServerCallback");
        AbstractC0789l u = AbstractC0789l.m651u();
        if (this.threadedGameConnector == null) {
            logDebug("threadedGameConnector==null");
            return;
        }
        closePopupOnly();
        if (this.threadedGameConnector.f4841e == null) {
            try {
                u.f5486bF.m1295b("starting new");
                u.f5486bF.m1332a(this.threadedGameConnector.f4843g);
                logDebug("connected");
                showBattleroom();
            } catch (IOException e) {
                u.m687c(e.getMessage(), "Connection failed");
                e.printStackTrace();
            }
        } else if (this.threadedGameConnector.f4841e.equals("CANCELLED")) {
            logDebug("Server join cancelled");
            return;
        } else {
            logWarn("Server join failed");
            showPopup("Connection failed", this.threadedGameConnector.f4841e, true, null, null);
        }
        this.threadedGameConnector = null;
    }

    public void cancelJoinServer() {
        if (this.threadedGameConnector == null) {
            closePopup();
        } else if (this.threadedGameConnector.m1210a()) {
            closePopup();
        }
    }

    public void alert(String str) {
        showAlert(str);
    }

    public void showAlert(String str) {
        logDebug("alert:" + str);
        if (str == null) {
            str = "null";
        }
        this.libRocket.m4308c(str);
    }

    public void showPopupWithButtons(String str, String str2, boolean z, C0051e eVar, C0051e eVar2) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        this.libRocket.m4317a(str, str2, (String) null, eVar, eVar2);
    }

    public void showPopupWithButtonsAndInput(String str, String str2, boolean z, String str3, C0051e eVar, C0051e eVar2) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        if (str3 == null) {
            str3 = "";
        }
        if ("".equals(str3)) {
            this.guiEngine.m4328k();
        }
        this.libRocket.m4316a(str, str2, str3, eVar, eVar2, true, z);
    }

    public void showPopup(String str, String str2, boolean z, String str3, String str4) {
        logDebug("showPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        this.libRocket.m4315a(str, str2, (String) null, str3, str4);
    }

    public void showInputPopup(String str, String str2, String str3, String str4, String str5) {
        logDebug("showInputPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        String str6 = str3;
        if (str6 == null) {
            str6 = "";
        }
        if ("".equals(str6)) {
            this.guiEngine.m4328k();
        }
        this.libRocket.m4315a(str, str2, str6, str4, str5);
    }

    public void showInputPopupNonClose(String str, String str2, String str3, String str4, String str5) {
        logDebug("showInputPopup:" + str2);
        if (str2 == null) {
            str2 = "null";
        }
        String str6 = str3;
        if (str6 == null) {
            str6 = "";
        }
        if ("".equals(str6)) {
            this.guiEngine.m4328k();
        }
        this.libRocket.m4316a(str, str2, str6, str4, str5, true, false);
    }

    public ElementDocument getPopup() {
        return this.libRocket.m4310c();
    }

    public ElementDocument getAlertOrPopup() {
        return this.libRocket.m4305e();
    }

    public boolean closePopup() {
        return this.libRocket.m4302h();
    }

    public boolean closePopupOnly() {
        return this.libRocket.m4300j();
    }

    public boolean closeAlertOnly() {
        return this.libRocket.m4301i();
    }

    public String getPopupText() {
        return this.libRocket.m4299k();
    }

    public void showHostOptions() {
        this.libRocket.m4315a("Host game", m4298i("menus.hostgame.info_pc"), (String) null, "Host Private:closePopup();hostStart(false);", "Host Public:closePopup();hostStart(true);");
    }

    public void hostStartFromPopup(boolean z) {
        ElementDocument g = this.libRocket.m4303g();
        Element elementById = g.getElementById("password");
        String str = null;
        if (elementById == null) {
            logWarn("hostStartFromPopup: password==null");
        } else {
            String value = elementById.getValue();
            if (value != null && !value.trim().equals("")) {
                str = value;
            }
        }
        boolean checkbox = g.getElementById("useMods").getCheckbox();
        closePopup();
        hostStartWithPasswordAndMods(z, str, checkbox);
    }

    public void hostStart(boolean z) {
        AbstractC0789l.m695b("old version of hostStart");
        hostStartWithPassword(z, null);
    }

    public void hostStartWithPassword(boolean z, String str) {
        AbstractC0789l.m695b("old version of hostStartWithPassword");
        hostStartWithPasswordAndMods(z, str, true);
    }

    public void hostStartWithPasswordAndMods(boolean z, String str, boolean z2) {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5486bF.m1295b("starting new");
        u.f5486bF.f4654m = str;
        u.f5486bF.f4655n = z2;
        u.f5486bF.f4657p = z;
        if (u.f5486bF.m1292b(false)) {
            logDebug("hosting");
            String am = u.f5486bF.m1313am();
            if (am != null && !C0596a.m1941f(am)) {
                AbstractC0789l.m695b("hostStart: map does not exist: " + am + " reseting");
                am = null;
            }
            if (am == null) {
                u.f5486bF.f4763aH.f4810a = EnumC0679ai.values()[0];
                u.f5486bF.f4764aI = "maps/skirmish/[p8]Many Islands (8p).tmx";
                u.f5486bF.f4763aH.f4811b = "[p8]Many Islands (8p).tmx";
            }
            this.libRocket.setDocument("battleroom.rml", null);
            return;
        }
        logWarn("hosting failed");
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$3.class */
    class RunnableC00553 implements Runnable {
        RunnableC00553() {
        }

        public void run() {
            Root.this.guiEngine.mo262d(true);
        }
    }

    public void exit() {
        this.scriptEngine.addRunnableToQueue(new RunnableC00553());
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
        return C0652a.m1587b(convertMapNameWithoutTranslation(str));
    }

    public String convertMapNameWithoutTranslation(String str) {
        return ActivityC0087g.m4268d(str);
    }

    public String getHTMLMapThumbnail(String str) {
        return escapedString(getMapThumbnail(str));
    }

    public String getMapThumbnail(String str) {
        if (str.startsWith("saves/")) {
        }
        String c = C0067c.m4286c(str);
        String str2 = "thumbnail:assets:" + c;
        if (C0596a.m1941f(c)) {
            return str2;
        }
        if (!AbstractC0789l.f5560aJ) {
            return "drawable:error_missingmap.png";
        }
        AbstractC0789l.m732a("getMapThumbnail: Failed to find: " + c);
        return "drawable:error_missingmap.png";
    }

    public boolean isMapSkirmish(String str) {
        return ActivityC0087g.m4267e(str);
    }

    public void showLevelOptions() {
        AbstractC0789l u = AbstractC0789l.m651u();
        String str = (String) this.libRocket.m4312b("mode");
        if (str == null) {
            AbstractC0789l.m676f("levelPath==null");
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
            elementById.show(z || ActivityC0087g.m4266f(str));
        }
        activeDocument.getElementById("aiDifficulty").setValue("" + u.f5479by.aiDifficulty);
    }

    public void loadConfigAndStartSwitchToAdvanced(String str) {
        AbstractC0789l.m651u().f5465be = false;
        loadConfigCommon(str, true);
        _startAdvancedMode(false);
    }

    private void _startAdvancedMode(boolean z) {
        boolean z2;
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5486bF.m1295b("starting singleplayer");
        u.f5486bF.f4660w = "You";
        u.f5486bF.f4655n = true;
        if (z) {
            z2 = u.f5486bF.m1384J();
        } else {
            z2 = u.f5486bF.m1383K();
        }
        if (z2) {
            logDebug("started startSinglePlayerServer");
            C0678ah c = u.f5486bF.m1291c();
            if (c != null) {
                c.f4815f = u.f5479by.aiDifficulty;
                u.f5486bF.m1353a(c);
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
        AbstractC0789l.m683d("loadConfigAndStartNewSandboxInAdvanced");
        _loadConfigAndStartNewSandboxCommon(str, false);
        _startAdvancedMode(true);
        AbstractC0789l.m683d("editorMode:" + AbstractC0789l.m651u().f5465be);
    }

    private void _loadConfigAndStartNewSandboxCommon(String str, boolean z) {
        if (str.startsWith("saves/")) {
            AbstractC0789l.m683d("Starting sandbox from save: " + str);
            loadGame(str.substring("saves/".length()));
        } else {
            AbstractC0789l.m683d("Starting sandbox from map: " + str);
            loadConfigCommon(str, false);
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5474bt.f776A = false;
        u.f5481bA.m1704w();
        u.f5465be = true;
        if (z) {
            this.guiEngine.m4331e();
        }
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void loadConfigAndStartNew(String str) {
        AbstractC0789l.m651u().f5465be = false;
        loadConfigCommon(str, false);
        this.guiEngine.m4331e();
        this.libRocket.closeActiveDocument();
        this.libRocket.clearHistory();
    }

    public void loadConfigCommon(String str, boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        u.f5479by.aiDifficulty = activeDocument.getElementById("aiDifficulty").getValueAsInt(0).intValue();
        u.f5479by.save();
        this.guiEngine.m4335b(true);
        this.guiEngine.m4333c(false);
        boolean isMapSkirmish = isMapSkirmish(str);
        int intValue = activeDocument.getElementById("numberOfAIs").getValueAsInt(4).intValue();
        boolean z2 = true;
        int intValue2 = activeDocument.getElementById("aiTeams").getValueAsInt(1).intValue();
        int i = intValue2 - 1;
        if (intValue2 == 5) {
            i = 0;
            z2 = false;
        }
        ActivityC0087g.m4270a(str, isMapSkirmish, intValue, i, z2, z);
    }

    public void showMapPopup(String str, String str2) {
        ElementDocument a = this.libRocket.m4319a("levelSelect.rml", (Object) str, "Map Select", false);
        if (a != null) {
            a.setMetadata("mapClickFunction", str2);
            Iterator it = a.findElementsByClassName("noStyleInPopup").iterator();
            while (it.hasNext()) {
                ((Element) it.next()).setAttribute("class", "");
            }
            if (showMapsWithDoc(a)) {
                AbstractC0789l.m683d("showMapsWithDoc passed");
                this.libRocket.m4302h();
                this.libRocket.m4323a(a);
            }
        }
    }

    public boolean showMaps() {
        return showMapsWithDoc(this.libRocket.m4304f());
    }

    public boolean showMapsWithDoc(ElementDocument elementDocument) {
        String[] strArr;
        String str;
        String str2;
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m683d("showMaps");
        if (elementDocument == null) {
            AbstractC0789l.m683d("showMaps: elementDocument==null");
            return false;
        }
        Element elementById = elementDocument.getElementById("mapTemplateHolder");
        Element elementById2 = elementDocument.getElementById("mapHolder");
        String innerRML = elementById.getInnerRML();
        String str3 = "";
        String str4 = (String) elementDocument.getMetadata("mode");
        String str5 = (String) elementDocument.getMetadata("mapClickFunction");
        boolean equals = str4.equals("saves");
        boolean equals2 = str4.equals("replays");
        if (equals) {
            strArr = ActivityC0088h.m4265j();
            if (strArr == null) {
                u.m731a("No saves", 1);
                return false;
            }
        } else if (equals2) {
            strArr = ActivityC0100o.m4238j();
            if (!u.f5479by.saveMultiplayerReplays) {
                alert("Note: Multiplayer replay recordings are not turned on. You can enable them in the settings.");
            }
            if (strArr == null) {
                if (!u.f5479by.saveMultiplayerReplays) {
                    return false;
                }
                u.m731a("No replays yet", 1);
                return false;
            }
        } else {
            strArr = u.f5488bH.m1456a(C0596a.m1947a(str4, true), str4);
            if (strArr == null) {
                u.m731a("Could not find folder: " + C0596a.m1944c(str4), 1);
                return false;
            }
        }
        String str6 = str4 + "/";
        int i = 0;
        for (String str7 : strArr) {
            String convertMapName = convertMapName(str7);
            boolean a = ActivityC0087g.m4271a(str7, str6 + str7);
            String str8 = convertMapName + "";
            if (u.f5575am && !a) {
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
                str = "";
            }
            if (str5 != null) {
                str2 = str5 + "(" + escapedString(str6 + str7) + ")";
                str = "";
            }
            String replace2 = replace.replace("_ONCLICK_", str2).replace("_ONCLICKEDIT_", str);
            String str9 = "thumbnail:assets:";
            if (i > 18) {
                str9 = "lazy:" + str9;
            }
            String c = C0067c.m4286c(str6 + str7);
            if (AbstractC0789l.f5560aJ) {
            }
            String str10 = str9 + c;
            if (!C0596a.m1941f(c)) {
                if (AbstractC0789l.f5560aJ) {
                    AbstractC0789l.m732a("List: Failed to find: " + c + " after converting:" + c + " ( " + str10 + " )");
                }
                str10 = "drawable:error_missingmap.png";
            }
            if (equals || equals2) {
                str10 = "";
            }
            i++;
            str3 = str3 + replace2.replace("_IMG_", htmlString(str10));
        }
        elementById2.setInnerRML(str3);
        elementById2.loadCharsetIfNeeded(str3);
        if (!(equals || equals2)) {
            return true;
        }
        elementById2.addClass("savesOnly");
        return true;
    }

    public void convertTextOnPage() {
        AbstractC0789l.m651u();
        logDebug("convertTextOnPage");
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (isMobile()) {
            activeDocument.addClass("mobile");
        }
        convertTextStopwatch.m1963a();
        Iterator it = activeDocument.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            int numAttributes = element.getNumAttributes();
            for (int i = 0; i < numAttributes; i++) {
                String attributeKey = element.getAttributeKey(i);
                String attributeValue = element.getAttributeValue(i);
                if (attributeKey != null) {
                    if (attributeKey.equals("nestedclone") && !attributeValue.equalsIgnoreCase("false")) {
                        AbstractC0789l.m683d("nested clone:" + element.getId());
                        element.setAttribute(attributeKey, "false");
                        Element clone = element.clone();
                        element.prependChild(clone);
                        clone.removeReference();
                    } else if (!attributeKey.equals("childclone") || attributeValue.equalsIgnoreCase("false")) {
                        String d = this.libRocket.m4306d(attributeValue);
                        if (d != null) {
                            AbstractC0789l.m683d("convertTextOnPage:" + attributeKey + ": '" + attributeValue + "' to '" + d + "'");
                            if (attributeKey.equals("_html")) {
                                AbstractC0789l.m683d("setting html:" + attributeKey);
                                element.setInnerRML(d);
                            } else {
                                if (attributeKey.startsWith("_")) {
                                    attributeKey = attributeKey.substring("_".length());
                                    AbstractC0789l.m683d("converted key to:" + attributeKey);
                                }
                                element.setAttribute(attributeKey, d);
                            }
                        }
                    } else {
                        element.setAttribute(attributeKey, "false");
                        if (element.getNumChildren() < 1) {
                            AbstractC0789l.m683d("child clone failed no children:" + element.getId());
                        }
                        Element clone2 = element.getChild(0).clone();
                        clone2.addClass("clone");
                        element.prependChild(clone2);
                        clone2.removeReference();
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
        convertTextStopwatch.m1960d();
    }

    public void keyBindingPopup_apply(boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        ElementDocument c = this.libRocket.m4310c();
        if (c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        String[] split = ((String) c.getMetadata("mode")).split(":");
        int parseInt = Integer.parseInt(split[0]);
        int parseInt2 = Integer.parseInt(split[1]);
        C0538ad adVar = (C0538ad) u.f5482bB.f3670ak.get(parseInt);
        if (!z) {
            Object metadata = c.getMetadata("lastKeyPressed");
            if (metadata == null) {
                logWarn("keyBindingPopup_apply: no last key entered");
                return;
            }
            int intValue = ((Integer) metadata).intValue();
            int i = 0;
            Object metadata2 = c.getMetadata("lastKeyModifiersPressed");
            if (metadata2 != null) {
                i = ((Integer) metadata2).intValue();
            }
            adVar.m2141a(intValue, parseInt2, i, true);
        } else {
            adVar.m2141a(0, parseInt2, 0, true);
        }
        showKeyBinding();
        closePopup();
    }

    public void keyBindingPopup_onKeydown(int i) {
        AbstractC0789l u = AbstractC0789l.m651u();
        ElementDocument c = this.libRocket.m4310c();
        if (c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        Element elementById = c.getElementById("keyBindMessage");
        if (elementById == null) {
            logWarn("showKeyBindingActionPopup: keyBindMessage==null");
            return;
        }
        int h = this.guiEngine.mo259h();
        String str = "" + AbstractC0789l.m665j(h);
        if (i == 111) {
        }
        if (i == 0) {
            logWarn("keyBindingPopup_onKeydown: skipping keycode 0");
        } else if (!u.m668i(i)) {
            c.setMetadata("lastKeyPressed", Integer.valueOf(i));
            c.setMetadata("lastKeyModifiersPressed", Integer.valueOf(h));
            String str2 = str + SlickToAndroidKeycodes.m623a(i);
            keyBindingPopup_apply(false);
        } else {
            elementById.setText("Key: " + str);
        }
    }

    public void showKeyBindingPopup() {
        AbstractC0789l u = AbstractC0789l.m651u();
        ElementDocument c = this.libRocket.m4310c();
        if (c == null) {
            logWarn("showKeyBindingActionPopup: popup==null");
            return;
        }
        Element elementById = c.getElementById("keyBindMessage");
        if (elementById == null) {
            logWarn("showKeyBindingActionPopup: keyBindMessage==null");
            return;
        }
        String[] split = ((String) c.getMetadata("mode")).split(":");
        int parseInt = Integer.parseInt(split[0]);
        Integer.parseInt(split[1]);
        C0538ad adVar = (C0538ad) u.f5482bB.f3670ak.get(parseInt);
        elementById.setText("Press a key..");
    }

    public String getKeyBindingAction(int i, C0538ad adVar, int i2) {
        return "createAndShowPopup('settingsKeyBindingSet.rml', " + escapedString(i + ":" + i2) + ", " + escapedString(adVar.f3674a) + "); showKeyBindingPopup();";
    }

    public void showKeyBinding() {
        AbstractC0789l u = AbstractC0789l.m651u();
        this.libRocket.getActiveDocument().setMetadata("event_onkeydown", "keyBindingPopup_onKeydown");
        TableData tableData = new TableData();
        ArrayList arrayList = tableData.rows;
        ArrayList arrayList2 = u.f5482bB.f3670ak;
        for (int i = 0; i < arrayList2.size(); i++) {
            C0538ad adVar = (C0538ad) arrayList2.get(i);
            if (adVar.f3675b) {
                TableRow tableRow = new TableRow();
                tableRow.addCell(adVar.f3674a);
                if (adVar.mo2132d()) {
                    tableRow.addClass("rowHeader");
                } else {
                    tableRow.addCell(adVar.m2142a(0)).setLibrocketOnClick(getKeyBindingAction(i, adVar, 0));
                    tableRow.addCell(adVar.m2142a(1)).setLibrocketOnClick(getKeyBindingAction(i, adVar, 1));
                }
                arrayList.add(tableRow);
            }
        }
        refreshTable("keysDiv", tableData);
    }

    public void loadSettings() {
        AbstractC0789l u = AbstractC0789l.m651u();
        loadSettingsStopwatch.m1963a();
        logDebug("loadSettings");
        Iterator it = this.libRocket.getActiveElementById("body").getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if (element.getAttribute("data-settings") != null) {
                String id = element.getId();
                String attribute = element.getAttribute("type", "unknown");
                String valueDynamic = u.f5479by.getValueDynamic(id);
                if (!attribute.equals("checkbox")) {
                    element.setAttribute("value", valueDynamic);
                } else if (Boolean.parseBoolean(valueDynamic)) {
                    element.setAttribute("checked", "");
                } else {
                    element.setAttribute("checked", null);
                }
            }
        }
        loadSettingsStopwatch.m1960d();
    }

    public void applyResolution() {
        this.guiEngine.mo261f();
    }

    public void saveSettings() {
        String str;
        AbstractC0789l u = AbstractC0789l.m651u();
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
                    u.f5479by.setValueDynamic(id, str);
                } catch (NumberFormatException e) {
                    alert("Error:" + e.getMessage());
                }
            }
        }
        this.guiEngine.mo261f();
        C0743j.m897a();
        C0652a.m1582e();
        this.guiEngine.mo260g();
    }

    public String hideStyle(boolean z) {
        if (z) {
            return "";
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
            return "";
        }
        return "hide";
    }

    public String hideIfMobile() {
        if (AbstractC0789l.m711ak()) {
            return "hide";
        }
        return "";
    }

    public boolean canResume() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u == null || !u.f5588bp || u.f5589bq) {
            return false;
        }
        return true;
    }

    public boolean isMobile() {
        return AbstractC0789l.m711ak();
    }

    public boolean isIOS() {
        return AbstractC0789l.f5560aJ;
    }

    public boolean isDesktop() {
        return AbstractC0789l.m710al();
    }

    public boolean isMac() {
        return C0166i.f1151c;
    }

    public boolean hasModSupport() {
        return !AbstractC0789l.f5560aJ;
    }

    public boolean hasReloadSupport() {
        return !AbstractC0789l.f5560aJ;
    }

    String restrictedString(String str) {
        if (str == null) {
            return null;
        }
        return "'" + str.replace("'", ".").replace("\"", ".").replace("(", ".").replace(")", ".").replace(",", ".").replace("<", ".").replace(">", ".") + "'";
    }

    String escapedString(String str) {
        return "'" + str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("'", "&apos;").replace("\"", "&quot;").replace("${", "$ {") + "'";
    }

    String htmlString(String str) {
        return "" + str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("\"", "&quot;").replace("${", "$ {") + "";
    }

    public void refreshServerList(String str, String str2, String str3) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (str3 != null) {
            this.libRocket.getActiveElementById(str3).setText("Refreshing");
        }
        RunnableC00564 r0 = new RunnableC00564(str, str2, str3);
        u.f5486bF.f4771bl = null;
        C0710n.m1054a(r0);
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$4.class */
    class RunnableC00564 implements Runnable {
        final /* synthetic */ String val$serverListDataId;
        final /* synthetic */ String val$serverRowTemplateId;
        final /* synthetic */ String val$refreshButton;

        RunnableC00564(String str, String str2, String str3) {
            this.val$serverListDataId = str;
            this.val$serverRowTemplateId = str2;
            this.val$refreshButton = str3;
        }

        public void run() {
            Root.this.scriptEngine.addScriptToQueue("displayServerList(" + Root.this.restrictedString(this.val$serverListDataId) + "," + Root.this.restrictedString(this.val$serverRowTemplateId) + "," + Root.this.restrictedString(this.val$refreshButton) + ")");
        }
    }

    public void displayServerList(String str, String str2, String str3) {
        String str4;
        String str5;
        String str6;
        AbstractC0789l u = AbstractC0789l.m651u();
        Element activeElementById = this.libRocket.getActiveElementById(str);
        Element activeElementById2 = this.libRocket.getActiveElementById(str2);
        if (activeElementById == null) {
            AbstractC0789l.m695b("serverListData is null, we may have changed page");
            return;
        }
        ArrayList k = ActivityC0098n.m4242k();
        this.lastSortedDiscoveredServers = k;
        String a = C0652a.m1589a("menus.lobby.gameState.battleroom", new Object[0]);
        String a2 = C0652a.m1589a("menus.lobby.gameState.ingame", new Object[0]);
        String a3 = C0652a.m1589a("menus.lobby.gameState.chat", new Object[0]);
        if (activeElementById.getNumChildren() > k.size()) {
            for (int numChildren = activeElementById.getNumChildren() - 1; numChildren >= k.size(); numChildren--) {
                AbstractC0789l.m683d("removing rowIndex:" + numChildren);
                activeElementById.removeChild(activeElementById.getChild(numChildren));
            }
            if (activeElementById.getNumChildren() != k.size()) {
                AbstractC0789l.m695b("-- Non matching size after clean up:" + activeElementById.getNumChildren() + " vs " + k.size());
            }
        }
        int i = 0;
        Iterator it = k.iterator();
        while (it.hasNext()) {
            C0703g gVar = (C0703g) it.next();
            Element element = null;
            if (i < activeElementById.getNumChildren()) {
                element = activeElementById.getChild(i);
            }
            if (element != null && element.hasClassName("serverRowMessage")) {
                AbstractC0789l.m683d("removing non rowIndex:" + i);
                activeElementById.removeChild(element);
                element = null;
            }
            if (element != null && element.findByClassName("rState") == null) {
                AbstractC0789l.m683d("removing non rowIndex with no rState:" + i);
                activeElementById.removeChild(element);
                element = null;
            }
            if (element == null) {
                element = activeElementById2.clone();
                activeElementById.appendChild(element);
                element.removeReference();
                element.setAttribute("onclick", "clickedServerRow(" + i + ")");
            }
            String str7 = gVar.f4984r;
            if (str7 != null) {
                str7 = str7.replace("battleroom", a).replace("ingame", a2).replace("chat", a3);
            }
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            if (gVar != null && gVar.f4987w) {
                z = true;
                if ("chat".equalsIgnoreCase(gVar.f4984r)) {
                    z2 = true;
                }
                if (gVar.m1100d()) {
                    z4 = true;
                }
            }
            int a4 = Color.m4546a(255, 255, 255, 255);
            String str8 = "serverRow serverRowData realServerRow ";
            if (gVar != null) {
                if (z) {
                    str8 = str8 + "dedicatedServerRow ";
                    if (z2 || z4) {
                        a4 = Color.m4546a(255, 152, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_DIGITAL, 249);
                        str8 = str8 + "chatRow ";
                    }
                } else {
                    if (gVar.f4975h) {
                        a4 = Color.m4546a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE);
                        str8 = str8 + "openRow ";
                    }
                    if (gVar.f4968a) {
                        a4 = Color.m4546a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_LAST_CHANNEL, 149, 35);
                        str8 = str8 + "lanRow ";
                    }
                }
                if (gVar.m1103a()) {
                    str8 = str8 + "lastConnectedRow ";
                }
                if (!z2 && !z4 && !("" + u.m686c(true)).equals(gVar.f4976j)) {
                    z3 = true;
                }
            }
            String str9 = "color:" + C0654f.m1485f(a4) + ";";
            if (0 != 0) {
                String str10 = str9 + "font-weight: bold;";
                str8 = str8 + "boldRow ";
            }
            element.compareAndSetClassNames(str8);
            element.findByClassName("rState").compareAndSetText(str7);
            element.findByClassName("rHost").compareAndSetText(C0654f.m1541a(gVar.f4979m, 15));
            if (gVar.f4985s == "?") {
                str4 = "?";
            } else {
                str4 = gVar.f4985s + "\\" + gVar.f4986t;
            }
            element.findByClassName("rPlayers").compareAndSetText(C0654f.m1541a(str4, 15));
            String a5 = C0654f.m1541a(ActivityC0087g.m4268d(gVar.f4982p), 40);
            if (a5 == null) {
                a5 = "";
            }
            element.findByClassName("rMap").compareAndSetText(a5);
            if ("ANY".equalsIgnoreCase(gVar.f4977k)) {
                str5 = gVar.f4977k;
            } else {
                str5 = "v" + C0654f.m1541a(gVar.f4977k, 8);
            }
            Element findByClassName = element.findByClassName("rVersion");
            findByClassName.compareAndSetText(str5);
            String str11 = "cell rVersion ";
            if (z3) {
                String str12 = "color:" + C0654f.m1485f(Color.m4546a(255, 155, 147, 147)) + ";";
                str11 = str11 + "nonMatchingRow ";
            } else {
                String str13 = "color:" + C0654f.m1485f(a4) + ";";
            }
            findByClassName.compareAndSetClassNames(str11);
            if (!gVar.f4975h) {
                str6 = "N";
            } else if (gVar.f4978l) {
                str6 = "P";
            } else {
                str6 = "Y";
            }
            if (gVar.f4968a) {
                str6 = "L";
            }
            Element findByClassName2 = element.findByClassName("rOpen");
            findByClassName2.compareAndSetText(str6);
            String str14 = "cell rOpen ";
            if (gVar.f4975h || gVar.f4968a) {
                String str15 = "color:" + C0654f.m1485f(a4) + ";";
            } else {
                String str16 = "color:" + C0654f.m1485f(Color.m4546a(255, 155, 147, 147)) + ";";
                str14 = str14 + "notOpenRow ";
            }
            findByClassName2.compareAndSetClassNames(str14);
            i++;
        }
        if (k.size() == 0 && u.f5486bF.f4771bl != null) {
            String str17 = "ERROR: " + u.f5486bF.f4771bl;
            Element clone = activeElementById2.clone();
            activeElementById.appendChild(clone);
            clone.removeReference();
            clone.setText(str17);
        }
        if (str3 != null) {
            this.libRocket.getActiveElementById(str3).setText("Refresh");
        }
        AbstractC0789l.m695b("DONE");
    }

    public void clickedServerRow(int i) {
        clickedServer(((C0703g) this.lastSortedDiscoveredServers.get(i)).f4969b);
    }

    public void clickedServer(String str) {
        String str2;
        if (getAlertOrPopup() != null) {
            logWarn("clickedServer: getAlertOrPopup!=null");
            return;
        }
        try {
            C0703g a = C0710n.m1053a(str);
            if (a == null) {
                logWarn("clickedServer: server==null");
                alert("That server no longer exists");
                return;
            }
            String b = a.m1102b();
            if (a.m1100d()) {
                str2 = "[onenter]Open Link:closePopup(); openWhitelistedLink(" + restrictedString(a.m1101c()) + ");";
            } else if (!a.f4968a) {
                str2 = "[onenter]Join:closePopup(); joinServerWithId(" + restrictedString(a.m1099e()) + "," + restrictedString(a.f4969b) + ");";
            } else {
                str2 = "[onenter]Join over LAN:closePopup(); joinServerWithId(" + restrictedString(a.m1098f()) + "," + restrictedString(a.f4969b) + ");";
            }
            showPopup(null, b, true, str2, null);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void hideKeyboard() {
        this.guiEngine.m4327l();
    }

    public void saveGame(String str) {
        closePopup();
        hideKeyboard();
        AbstractC0789l.m651u().f5489bI.m386a(str.replace(".", "_").replace("/", "_").replace("\\", "_"));
    }

    public void exportMap(String str) {
        closePopup();
        AbstractC0789l u = AbstractC0789l.m651u();
        try {
            u.f5474bt.m3991b(u.f5529cS, "/SD/rusted_warfare_maps/" + str.replace(".", "_").replace("/", "_").replace("\\", "_").replace("|", "_").replace("?", "_") + ".tmx");
            showAlert("Map exported");
        } catch (C0154f e) {
            showAlert("Failed to export map. error: " + e.getMessage());
        } catch (IOException e2) {
            showAlert("Failed to export map. IO error: " + e2.getMessage());
        }
    }

    public void loadGame(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5465be = false;
        if (u.f5489bI.m380b(str, false)) {
            resumeNonMenu();
        }
    }

    public void loadGameEdit(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0051e eVar = null;
        if (C0740a.m902b()) {
            eVar = new C0051e("Share", new RunnableC00575(u, str));
        }
        showPopupWithButtons(null, str, true, eVar, new C0051e("Delete", new RunnableC00586(u, str)));
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$5.class */
    class RunnableC00575 implements Runnable {
        final /* synthetic */ AbstractC0789l val$game;
        final /* synthetic */ String val$saveName;

        RunnableC00575(AbstractC0789l lVar, String str) {
            this.val$game = lVar;
            this.val$saveName = str;
        }

        public void run() {
            Root.this.closePopup();
            C0740a.m903a(this.val$game.f5489bI.m382a(this.val$saveName, false));
        }
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$6.class */
    class RunnableC00586 implements Runnable {
        final /* synthetic */ AbstractC0789l val$game;
        final /* synthetic */ String val$saveName;

        RunnableC00586(AbstractC0789l lVar, String str) {
            this.val$game = lVar;
            this.val$saveName = str;
        }

        public void run() {
            this.val$game.f5489bI.m379c(this.val$saveName);
            Root.this.closePopup();
            Root.this.showMaps();
        }
    }

    public void loadReplay(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5465be = false;
        if (u.f5490bJ.m2002c(str)) {
            resumeNonMenu();
        }
    }

    public void loadReplayEdit(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0051e eVar = null;
        if (C0740a.m902b()) {
            eVar = new C0051e("Share", new RunnableC00597(u, str));
        }
        showPopupWithButtons(null, str, true, eVar, new C0051e("Delete", new RunnableC00608(u, str)));
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$7 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$7.class */
    class RunnableC00597 implements Runnable {
        final /* synthetic */ AbstractC0789l val$game;
        final /* synthetic */ String val$replayName;

        RunnableC00597(AbstractC0789l lVar, String str) {
            this.val$game = lVar;
            this.val$replayName = str;
        }

        public void run() {
            Root.this.closePopup();
            C0740a.m903a(this.val$game.f5490bJ.m2008a(this.val$replayName, false));
        }
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$8 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$8.class */
    class RunnableC00608 implements Runnable {
        final /* synthetic */ AbstractC0789l val$game;
        final /* synthetic */ String val$replayName;

        RunnableC00608(AbstractC0789l lVar, String str) {
            this.val$game = lVar;
            this.val$replayName = str;
        }

        public void run() {
            this.val$game.f5490bJ.m1998e(this.val$replayName);
            Root.this.closePopup();
            Root.this.showMaps();
        }
    }

    public void makeSaveGamePopup(String str) {
        String str2;
        AbstractC0789l u = AbstractC0789l.m651u();
        if (str == null) {
            str2 = (u.m719ac() + " (" + C0654f.m1543a("d MMM yyyy HH-mm-ss") + ")").replace("  ", " ");
        } else {
            str2 = str;
        }
        showInputPopup("Save Game", "Enter a name to save the game under", str2, "[onenter]Save:saveGame(getPopupText())", null);
    }

    public void makeExportMapGamePopup(String str) {
        String str2;
        AbstractC0789l u = AbstractC0789l.m651u();
        if (str == null) {
            str2 = ("New " + u.m719ac() + " - " + C0654f.m1543a("d MMM yyyy")).replace("  ", " ");
        } else {
            str2 = str;
        }
        showInputPopup("Export Map", "Enter a name to export the map as", str2, "[onenter]Export:exportMap(getPopupText())", null);
    }

    public void makeSendMessagePopup() {
        AbstractC0789l.m651u();
        showInputPopup("Send Message", "", "", "[onenter]Send: sendChatMessage(getPopupText()); closePopup();", "Switch - Team only: makeSendTeamMessagePopupWithDefaultText(getPopupText()); ");
    }

    public void makeSendTeamMessagePopup() {
        makeSendTeamMessagePopupWithDefaultText("");
    }

    public void makeSendTeamMessagePopupWithDefaultText(String str) {
        AbstractC0789l.m651u();
        showInputPopup("Send Team Message", "", str, "[onenter]Send Team:sendTeamChatMessage(getPopupText()); closePopup();", "+ Ping Map:sendTeamChatMessageAndPing(getPopupText()); closePopup();");
    }

    public void sendChatMessage(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        this.guiEngine.m4327l();
        if (str != null && !str.trim().equals("")) {
            u.f5486bF.m1243k(str);
            u.f5481bA.f4363p = false;
        }
    }

    public void sendTeamChatMessageAndPing(String str) {
        sendTeamChatMessage(str);
        AbstractC0789l.m651u().f5481bA.m1811G();
    }

    public void sendTeamChatMessage(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        this.guiEngine.m4327l();
        if (str != null && !str.trim().equals("")) {
            u.f5486bF.m1245j(str);
        }
    }

    public void receiveChatMessage(int i, String str, String str2, C0698c cVar) {
        refreshChat();
    }

    public void refreshChat() {
        Element activeElementById;
        AbstractC0789l u = AbstractC0789l.m651u();
        Element activeElementById2 = this.libRocket.getActiveElementById("chatLogHistory");
        if (activeElementById2 != null) {
            boolean attributeBoolean = activeElementById2.getAttributeBoolean("reversed", false);
            if (u.f5486bF.f4735D && (activeElementById = this.libRocket.getActiveElementById("chatBox")) != null) {
                activeElementById.hide();
            }
            activeElementById2.setInnerRML("");
            ConcurrentLinkedQueue b = u.f5486bF.f4765aL.m1412b();
            StringBuffer stringBuffer = new StringBuffer();
            Iterator it = b.iterator();
            while (it.hasNext()) {
                C0697b bVar = (C0697b) it.next();
                if (attributeBoolean) {
                    stringBuffer.insert(0, "<div>" + bVar.m1134b() + "</div>");
                } else {
                    stringBuffer.append("<div>" + bVar.m1134b() + "</div>");
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
    }

    public void trace(String str) {
        AbstractC0789l.m683d("Trace:" + str);
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
            if (!C0654f.m1495d(this.librocketOnClick, tableRow.librocketOnClick) || !C0654f.m1495d(this.extraClasses, tableRow.extraClasses) || this.tableCells.size() != tableRow.tableCells.size()) {
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
            if (!C0654f.m1495d(this.classes, tableCell.classes) || !C0654f.m1495d(this.librocketOnClick, tableCell.librocketOnClick) || !C0654f.m1544a(this.color, tableCell.color)) {
                return false;
            }
            if (z || C0654f.m1495d(this.text, tableCell.text)) {
                return true;
            }
            return false;
        }
    }

    public void updateTableTextOnly(String str, TableData tableData, TableData tableData2) {
        ArrayList arrayList = tableData.rows;
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            AbstractC0789l.m695b("updateTableText: tableElement:" + str + " is null, we may have changed page");
            return;
        }
        Element elementById = activeElementById.getElementById("tableListData");
        for (int i = 0; i < arrayList.size(); i++) {
            TableRow tableRow = (TableRow) arrayList.get(i);
            for (int i2 = 0; i2 < tableRow.tableCells.size(); i2++) {
                TableCell tableCell = (TableCell) tableRow.tableCells.get(i2);
                Element child = elementById.getChild(i);
                if (child == null) {
                    AbstractC0789l.m695b("updateTableText failed to get row " + i);
                    return;
                }
                Element child2 = child.getChild(i2);
                if (child2 == null) {
                    AbstractC0789l.m695b("updateTableText failed to get cell " + i2);
                    return;
                } else {
                    child2.compareAndSetText(tableCell.text);
                }
            }
        }
    }

    public void refreshTable(String str, TableData tableData) {
        ArrayList arrayList = tableData.rows;
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            AbstractC0789l.m695b("refreshTable: tableElement:" + str + " is null, we may have changed page");
            return;
        }
        Element elementById = activeElementById.getElementById("tableRowTemplateHolder");
        Element elementById2 = activeElementById.getElementById("tableListData");
        Element child = elementById.findByClassName("rowTemplate").getChild(0);
        Element child2 = elementById.findByClassName("cellTemplate").getChild(0);
        elementById2.setInnerRML("");
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
                    cloneAndFix2.setAttribute("style", "color:" + C0654f.m1485f(tableCell.color.intValue()) + ";");
                }
                cloneAndFix.appendChild(cloneAndFix2);
                cloneAndFix2.removeReference();
            }
            elementById2.appendChild(cloneAndFix);
            cloneAndFix.removeReference();
        }
    }

    public ElementDocument createAndShowPopup(String str, Object obj, String str2) {
        return this.libRocket.m4319a(str, obj, str2, true);
    }

    public void showMainMenu() {
        AbstractC0789l.m651u().f5481bA.f4363p = false;
        AbstractC0043a.m4343a().m4337b();
    }

    public void onEnter() {
        ElementDocument g = this.libRocket.m4303g();
        if (g == null) {
            AbstractC0789l.m683d("onEnter: elementDocument==null");
            return;
        }
        Iterator it = g.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String attribute = element.getAttribute("onenter");
            if (attribute != null && element.isFocused()) {
                this.scriptEngine.processScript(attribute);
            }
        }
    }

    public void scrollFromFocusedElement(float f) {
        ElementDocument g = this.libRocket.m4303g();
        if (g == null) {
            AbstractC0789l.m683d("onEnter: elementDocument==null");
            return;
        }
        Element topLevelFocusedElement = g.getTopLevelFocusedElement();
        if (topLevelFocusedElement == null) {
            AbstractC0789l.m683d("focusedElement: Not found");
            return;
        }
        ArrayList chainFromChildElement = g.getChainFromChildElement(topLevelFocusedElement);
        if (chainFromChildElement == null) {
            AbstractC0789l.m683d("scrollFromFocusedElement: Failed to find chain");
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
        AbstractC0789l.m683d("Found no slider element to offset");
    }

    public boolean isSliderOrUIElementSelected() {
        ElementDocument g = this.libRocket.m4303g();
        if (g == null) {
            AbstractC0789l.m683d("onEnter: elementDocument==null");
            return false;
        }
        Element topLevelFocusedElement = g.getTopLevelFocusedElement();
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
                AbstractC0789l.m683d("Slider element: true");
                return true;
            }
            AbstractC0789l.m683d("Slider element: false");
        }
        AbstractC0789l.m683d("Slider element: no element focused");
        return false;
    }

    public void onTouch() {
        ElementDocument g = this.libRocket.m4303g();
        if (g == null) {
            AbstractC0789l.m683d("onEnter: elementDocument==null");
            return;
        }
        Iterator it = g.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            if ("text".equals(element.getAttribute("type")) && element.isFocused()) {
                this.guiEngine.m4328k();
            }
        }
    }

    public void onEscape() {
        ElementDocument g = this.libRocket.m4303g();
        if (g == null) {
            AbstractC0789l.m683d("onEscape: elementDocument==null");
            return;
        }
        boolean z = false;
        Iterator it = g.getAllNestedChildren().iterator();
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
        if (z || !closePopup()) {
        }
    }

    public void askQuitGame() {
        closePopup();
        showPopup("Are you sure you want to quit?", "", true, "[onenter]Quit:closePopup(); exit();", null);
    }

    public String getCurrentDocumentPath() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            return null;
        }
        return activeDocument.documentPath;
    }

    public String getCurrentPopupPath() {
        ElementDocument c = this.libRocket.m4310c();
        if (c == null) {
            return null;
        }
        return c.documentPath;
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
        return C0659g.m1417a() == EnumC0725h.f5051c;
    }

    public boolean not(boolean z) {
        return !z;
    }

    public boolean and(boolean z, boolean z2) {
        return z && z2;
    }

    /* renamed from: or */
    public boolean m4297or(boolean z, boolean z2) {
        return z || z2;
    }

    public void showBattleroom() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        boolean z = true;
        if (activeDocument != null && "battleroom.rml".equals(activeDocument.documentPath)) {
            AbstractC0789l.m683d("Already on battleroom page");
            z = false;
        }
        this.libRocket.setDocument("battleroom.rml", null, z);
    }

    public void setDocument(String str) {
        this.libRocket.setDocument(str);
    }

    public void playNextMusicTrack() {
        AbstractC0789l.m651u().f5476bv.m2112e();
    }

    public void toggleMusic() {
        AbstractC0789l.m651u().f5476bv.f3700u = !AbstractC0789l.m651u().f5476bv.f3700u;
    }

    public void updateMusicButton(String str) {
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            return;
        }
        if (AbstractC0789l.m651u().f5476bv.f3700u) {
            activeElementById.setText(">");
        } else {
            activeElementById.setText("||");
        }
    }

    public void setSandboxMapFromPopup(String str) {
        AbstractC0789l.m651u();
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
        AbstractC0789l u = AbstractC0789l.m651u();
        if (str != null) {
            Element elementById = element.getElementById(str);
            if (elementById == null) {
                AbstractC0789l.m676f("getModeMapPath: typeSelector==null");
                i = 0;
            } else {
                i = elementById.getValueAsInt(0).intValue();
            }
        } else if (u.f5486bF.f4763aH.f4810a == null) {
            AbstractC0789l.m695b("getModeMapPath: currentType==0");
            i = 0;
        } else {
            i = u.f5486bF.f4763aH.f4810a.ordinal();
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
        ElementDocument g = this.libRocket.m4303g();
        if (g != null) {
            Element findByClassName = g.findByClassName("textinputUnicodeWrap");
            if (findByClassName != null) {
                findByClassName.compareAndAddClass("unicodeWasTyped");
            } else {
                AbstractC0789l.m683d("event_unicodeEntered: missing textinput");
            }
        } else {
            AbstractC0789l.m683d("event_unicodeEntered: missing document");
        }
    }

    public boolean isVersionBeta() {
        return AbstractC0789l.m651u().m666j();
    }

    public Object ifCondition(boolean z, Object obj, Object obj2) {
        return z ? obj : obj2;
    }

    /* renamed from: i */
    public String m4298i(String str) {
        return C0652a.m1589a(str, new Object[0]);
    }

    public void openLinkToCG(String str) {
        openWhitelistedLink("http://corrodinggames.com/" + str);
    }

    public void openWhitelistedLink(String str) {
        AbstractC0789l.m683d("Opening link:" + str);
        if (!str.startsWith("http://corrodinggames.com/") && !str.startsWith("https://corrodinggames.com/") && !str.startsWith("http://corrodinggames.net/") && !str.startsWith("https://corrodinggames.net/")) {
            AbstractC0789l.m683d("Not in whitelist");
        } else if (this.guiEngine.m4336b(str)) {
            alert("Opened link: " + str);
        } else {
            alert("Sorry couldn't load browser to: " + str + " please navigate manually");
        }
    }

    public void writeGameLog(String str) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = false;
        LinkedList j = AbstractC0043a.m4343a().m4329j();
        if (j == null) {
            z = true;
        } else {
            synchronized (j) {
                ListIterator listIterator = j.listIterator(C0654f.m1525b(0, j.size() - 3000));
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
        AbstractC0789l.m683d("writeGameLog ready");
        Element activeElementById = this.libRocket.getActiveElementById(str);
        if (activeElementById == null) {
            AbstractC0789l.m683d("Failed to find: " + str);
        } else {
            activeElementById.setInnerRML(stringBuffer.toString());
        }
    }

    public void setPageMinWidthAndHeight(float f, float f2) {
        AbstractC0789l.m683d("setPageMinWidthAndHeight(" + f + ", " + f2 + ")");
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            AbstractC0789l.m683d("setPageMinWidthAndHeight - no page");
            return;
        }
        activeDocument.setMetadataFloat("minWidth", Float.valueOf(f));
        activeDocument.setMetadataFloat("minHeight", Float.valueOf(f2));
        this.guiEngine.m4326m();
    }

    /* renamed from: com.corrodinggames.librocket.scripts.Root$9 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Root$9.class */
    class C00619 extends AbstractC0741b {
        C00619() {
        }

        public void onFileSelected() {
            AbstractC0789l.m683d("importFilePopup: onFileSelected");
        }

        public void onCancelled() {
            AbstractC0789l.m683d("importFilePopup: onCancelled");
        }
    }

    public void importFilePopup() {
        C0740a.m904a(new C00619());
    }
}
