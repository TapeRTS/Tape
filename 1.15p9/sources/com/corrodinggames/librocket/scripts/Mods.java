package com.corrodinggames.librocket.scripts;

import com.Element;
import com.ElementDocument;
import com.corrodinggames.rts.game.units.custom.C0348af;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p047n.C1058a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Mods.class */
public class Mods extends ScriptContext {
    Root root;
    Runnable updateModsRunnable = new RunnableC00531();
    int checkWorkshopSkip = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public Mods(Root root) {
        this.root = root;
    }

    public C1058a getSteam() {
        C1058a m786a = C1058a.m786a();
        if (!m786a.m778e()) {
            m786a.m775h();
            return null;
        }
        return m786a;
    }

    public void openWorkshop() {
        GameEngine.getInstance();
        C1058a steam = getSteam();
        if (steam == null) {
            return;
        }
        steam.m770m();
    }

    public void uploadModAsk(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.m1108m()) {
            this.root.showAlert("Workshop uploading is disabled in BETA versions to ensure compatibility for others. Please test and upload this mod with a released version or wait till beta finishes.");
        } else if (gameEngine.f6118bZ.m1862c(str) == null) {
            this.root.showAlert("Could not find mod:" + str);
        } else if (getSteam() == null) {
        } else {
            this.root.showPopup("Are you sure you want to upload to the workshop?", VariableScope.nullOrMissingString, true, "[onenter]Upload:closePopup(); mods.uploadMod('" + str + "');", null);
        }
    }

    public void uploadMod(String str) {
        C0824b m1862c = GameEngine.getInstance().f6118bZ.m1862c(str);
        if (m1862c == null) {
            this.root.showAlert("Could not find mod:" + str);
            return;
        }
        C1058a steam = getSteam();
        if (steam == null) {
            return;
        }
        if (m1862c.f5420k == 0) {
            steam.m781b(m1862c);
        } else {
            steam.m783a(m1862c, false, "Changes.");
        }
    }

    public void viewMod(String str) {
        C0824b m1862c = GameEngine.getInstance().f6118bZ.m1862c(str);
        if (m1862c == null) {
            this.root.showAlert("Could not find mod:" + str);
            return;
        }
        C1058a steam = getSteam();
        if (steam == null) {
            return;
        }
        steam.m784a(m1862c);
    }

    public void deleteModPopup(String str) {
        C0824b m1862c = GameEngine.getInstance().f6118bZ.m1862c(str);
        if (m1862c == null) {
            this.root.showAlert("Could not find mod:" + str);
            return;
        }
        this.root.showPopup(VariableScope.nullOrMissingString, "Are you sure you want to permanently delete '" + m1862c.m1841b() + "'? (Note: You can instead disable the mod by unticking it)", true, "[onenter]Delete:closePopup(); mods.deleteMod('" + str + "');", null);
    }

    public void deleteMod(String str) {
        C0824b m1862c = GameEngine.getInstance().f6118bZ.m1862c(str);
        if (m1862c == null) {
            this.root.showAlert("Could not find mod:" + str);
        } else if (m1862c.m1820u()) {
            reloadModData();
        } else {
            this.root.showAlert("Error failed to delete mod");
        }
    }

    public void setModFilter(String str) {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            GameEngine.PrintLog("loadMods: No Active Document");
            return;
        }
        activeDocument.setMetadata("modFilter", str);
        applyModFilter();
    }

    public void applyModFilter() {
        GameEngine gameEngine = GameEngine.getInstance();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            GameEngine.PrintLog("loadMods: No Active Document");
            return;
        }
        String str = (String) activeDocument.getMetadata("modFilter");
        Element elementById = activeDocument.getElementById("modList");
        if (elementById == null) {
            GameEngine.PrintLog("loadMods: Failed to find modList, wrong page?");
            return;
        }
        boolean checkbox = activeDocument.getElementById("onlyEnabledMods").getCheckbox();
        ArrayList findElementsByClassName = elementById.findElementsByClassName("modItem");
        if (str == null || str.trim().equals(VariableScope.nullOrMissingString)) {
            str = null;
        }
        if (str != null) {
            str = str.toLowerCase(Locale.ROOT).trim();
        }
        int i = 0;
        int i2 = 0;
        Iterator it = findElementsByClassName.iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            boolean z = false;
            int intValue = CommonUtils.m2243l(element.getAttribute("data_sessionid")).intValue();
            C0824b m1876a = gameEngine.f6118bZ.m1876a(intValue);
            if (m1876a == null) {
                GameEngine.PrintLog("Could not find mod with mod session id: " + intValue);
            } else {
                if (str != null) {
                    boolean z2 = false;
                    if (m1876a.m1846a() != null && m1876a.m1846a().toLowerCase(Locale.ROOT).contains(str)) {
                        z2 = true;
                    }
                    if (m1876a.m1836e() != null && m1876a.m1836e().toLowerCase(Locale.ROOT).contains(str)) {
                        z2 = true;
                    }
                    if (!z2) {
                        z = true;
                    }
                }
                if (checkbox && m1876a.f5415f) {
                    z = true;
                }
            }
            if (z) {
                i++;
                element.compareAndAddClass("modItemFilteredOut");
            } else {
                i2++;
                element.removeClass("modItemFilteredOut");
            }
        }
        String str2 = VariableScope.nullOrMissingString;
        if (i > 0 && i2 == 0) {
            str2 = "< No mods found with active filter (" + i + " hidden) >";
        } else if (i > 0) {
            str2 = "< " + i + " mods hidden with active filter >";
        }
        activeDocument.getElementById("filterStatus").setText(str2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.librocket.scripts.Mods$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Mods$1.class */
    public class RunnableC00531 implements Runnable {
        RunnableC00531() {
        }

        public void run() {
            Mods.this.updateMods();
        }
    }

    public void updateMods() {
        this.checkWorkshopSkip++;
        if (this.checkWorkshopSkip > 100) {
            this.checkWorkshopSkip = 0;
            C1058a m786a = C1058a.m786a();
            if (m786a != null) {
                m786a.m772k();
            }
        }
    }

    public void refreshModList() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            GameEngine.PrintLog("refreshModList: No Active Document");
            return;
        }
        GameEngine.PrintLog("refreshModList");
        if (activeDocument.getElementById("modTemplate") == null) {
            GameEngine.PrintLog("refreshModList: Failed to find modTemplate, wrong page?");
            return;
        }
        GameEngine.getInstance().f6118bZ.m1861d();
        _rememberTempModSelection();
        loadMods();
        _restoreTempModSelection();
    }

    public void loadMods() {
        ArrayList m1850k = GameEngine.getInstance().f6118bZ.m1850k();
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        if (activeDocument == null) {
            GameEngine.PrintLog("loadMods: No Active Document");
            return;
        }
        GameEngine.PrintLog("loadMods");
        Element elementById = activeDocument.getElementById("modTemplate");
        Element elementById2 = activeDocument.getElementById("modList");
        if (elementById == null) {
            GameEngine.PrintLog("loadMods: Failed to find modTemplate, wrong page?");
        } else if (elementById2 == null) {
            GameEngine.PrintLog("loadMods: Failed to find modList, wrong page?");
        } else {
            this.root.setDocumentUpdate(activeDocument, this.updateModsRunnable);
            String innerRML = elementById.getInnerRML();
            String str = VariableScope.nullOrMissingString;
            int i = 0;
            Iterator it = m1850k.iterator();
            while (it.hasNext()) {
                C0824b c0824b = (C0824b) it.next();
                String m1846a = c0824b.m1846a();
                String str2 = VariableScope.nullOrMissingString;
                String replace = innerRML.replace("_NAME_", this.root.htmlString(m1846a)).replace("_ID_", c0824b.f5414e);
                String str3 = c0824b.f5452R;
                if (str3 == null) {
                    str3 = VariableScope.nullOrMissingString;
                } else {
                    str2 = str2 + " modItemError";
                }
                if (c0824b.m1819v()) {
                    str2 = str2 + " modItemCanBeDeleted";
                }
                if (c0824b.f5420k == 0) {
                    if (!c0824b.f5434y && !c0824b.f5435z) {
                        str2 = str2 + " modItemCanBePublished";
                    }
                } else {
                    if (!c0824b.f5434y) {
                        str2 = str2 + " modItemIsOwner";
                    }
                    str2 = str2 + " modItemIsPublished";
                }
                if (c0824b.f5436A) {
                    str2 = str2 + " modItemHasMaps";
                }
                String m1829l = c0824b.m1829l();
                if (m1829l == null) {
                    m1829l = VariableScope.nullOrMissingString;
                }
                i++;
                str = str + replace.replace("_ERROR_", this.root.htmlString(str3)).replace("_MESSAGE_", this.root.htmlStringWithNewlines(m1829l)).replace("_DESCRIPTION_", this.root.htmlString(c0824b.m1836e())).replace("_CLASS_", str2).replace("_SESSIONID_", VariableScope.nullOrMissingString + c0824b.m1837d());
            }
            elementById2.setInnerRML(str);
            elementById2.loadCharsetIfNeeded(str);
            Iterator it2 = m1850k.iterator();
            while (it2.hasNext()) {
                C0824b c0824b2 = (C0824b) it2.next();
                Element elementById3 = activeDocument.getElementById(c0824b2.f5414e);
                if (elementById3 == null) {
                    GameEngine.m1145b("Could not find:" + c0824b2.f5412c);
                } else {
                    elementById3.setCheckbox(!c0824b2.f5415f);
                }
            }
            applyModFilter();
        }
    }

    public void saveMods() {
        _saveModsCommon(true);
    }

    private void _rememberTempModSelection() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.PrintLog("temp save");
        Iterator it = activeDocument.findElementsByClassName("modSelection").iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String id = element.getId();
            if (!id.equals("_ID_")) {
                C0824b m1862c = gameEngine.f6118bZ.m1862c(id);
                if (m1862c == null) {
                    GameEngine.m1193a("Could not find mod:" + element.getInnerRML());
                } else {
                    boolean z = !element.getCheckbox();
                    if (m1862c.f5416g != z) {
                    }
                    m1862c.f5416g = z;
                    m1862c.f5417h = true;
                }
            }
        }
    }

    private void _restoreTempModSelection() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.PrintLog("temp restore");
        Iterator it = activeDocument.findElementsByClassName("modSelection").iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String id = element.getId();
            if (id != null && !id.equals(VariableScope.nullOrMissingString) && !id.equals("_ID_")) {
                C0824b m1862c = gameEngine.f6118bZ.m1862c(id);
                if (m1862c == null) {
                    GameEngine.m1193a("Could not find mod:" + element.getInnerRML() + " id:" + id);
                } else if (m1862c.f5417h) {
                    if (m1862c.f5416g != (!element.getCheckbox())) {
                        element.setCheckbox(!m1862c.f5416g);
                    }
                }
            }
        }
    }

    private void _saveModsCommon(boolean z) {
        boolean z2 = false;
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        GameEngine gameEngine = GameEngine.getInstance();
        GameEngine.PrintLog("savesMods");
        Iterator it = activeDocument.findElementsByClassName("modSelection").iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String id = element.getId();
            if (!id.equals("_ID_")) {
                C0824b m1862c = gameEngine.f6118bZ.m1862c(id);
                if (m1862c == null) {
                    this.root.showAlert("Could not find mod:" + element.getInnerRML());
                } else {
                    boolean z3 = !element.getCheckbox();
                    if (m1862c.f5415f != z3) {
                        z2 = true;
                    }
                    m1862c.f5415f = z3;
                    m1862c.f5416g = z3;
                }
            }
        }
        if (z2) {
            GameEngine.PrintLog("mod changes made");
        } else {
            GameEngine.PrintLog("no mod changes made");
        }
        gameEngine.f6118bZ.m1859e();
        gameEngine.f6109bQ.save();
        if (z) {
            _saveModsMessages(false);
        }
    }

    private void _saveModsMessages(boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        int m1868a = gameEngine.f6118bZ.m1868a(false);
        int m1865b = gameEngine.f6118bZ.m1865b();
        if (gameEngine.networkEngine.f5564B) {
            GameEngine.PrintLog("savesMods: in network game");
            this.root.showAlert("You are currently in a network game, changes will be checked and applied on next game");
        } else if (C0348af.m5392c(true)) {
            if (m1868a == 0) {
                this.root.showAlert("Mod changes saved. Will be used in the next game.");
            } else if (z) {
                String str = "Note: " + m1868a + " selected mods are still not loaded after reload";
                if (m1865b > 0) {
                    str = "Warning: " + m1865b + " selected mods had errors after reload";
                }
                this.root.showAlert(str);
            } else {
                String str2 = "Mod selection saved. But " + m1868a + " mod(s) aren't loaded. Load them now?";
                if (!gameEngine.m1227H()) {
                    str2 = str2 + " (This will end your current game).";
                }
                this.root.showPopup("Reload needed", str2, true, "[onenter]Reload:closePopup(); mods.reloadModData();", null);
            }
        } else {
            GameEngine.PrintLog("Errors found");
        }
    }

    public void disableAllAsk() {
        this.root.showPopup("Disable all mods?", VariableScope.nullOrMissingString, true, "[onenter]Disable All:closePopup(); mods.disableAll();", null);
    }

    public void disableAll() {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.f6118bZ.m1855g();
        gameEngine.f6118bZ.m1859e();
        gameEngine.f6109bQ.save();
        gameEngine.f6118bZ.m1849l();
        loadMods();
    }

    public void reloadModDataAsk() {
        if (GameEngine.getInstance().m1227H()) {
            GameEngine.PrintLog("Menu active, reloading without asking");
            reloadModData();
            return;
        }
        this.root.showPopup("Reload all mod data?", VariableScope.nullOrMissingString + "Warning! this will end your current game.", true, "[onenter]Reload:closePopup(); mods.reloadModData();", null);
    }

    public void reloadModData() {
        GameEngine gameEngine = GameEngine.getInstance();
        _saveModsCommon(false);
        gameEngine.f6118bZ.m1849l();
        _saveModsMessages(true);
        loadMods();
    }
}
