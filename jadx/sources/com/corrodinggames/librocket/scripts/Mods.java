package com.corrodinggames.librocket.scripts;

import com.Element;
import com.ElementDocument;
import com.corrodinggames.rts.game.units.custom.C0307ac;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p035f.C0657b;
import com.corrodinggames.rts.gameFramework.p042l.C0796a;
import java.util.ArrayList;
import java.util.Iterator;

/* loaded from: game-lib.jar:com/corrodinggames/librocket/scripts/Mods.class */
public class Mods extends ScriptContext {
    Root root;

    Mods(Root root) {
        this.root = root;
    }

    public C0796a getSteam() {
        C0796a a = C0796a.m645a();
        if (a.m637e()) {
            return a;
        }
        a.m634h();
        return null;
    }

    public void openWorkshop() {
        AbstractC0789l.m651u();
        C0796a steam = getSteam();
        if (steam != null) {
            steam.mo630l();
        }
    }

    public void uploadModAsk(String str) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.m666j()) {
            this.root.showAlert("Workshop uploading is disabled in BETA versions to ensure compatibility for others. Please test and upload this mod with a released version or wait till beta finishes.");
        } else if (u.f5488bH.m1461a(str) == null) {
            this.root.showAlert("Could not find mod:" + str);
        } else if (getSteam() != null) {
            this.root.showPopup("Are you sure you want to upload to the workshop?", "", true, "[onenter]Upload:closePopup(); mods.uploadMod('" + str + "');", null);
        }
    }

    public void uploadMod(String str) {
        C0657b a = AbstractC0789l.m651u().f5488bH.m1461a(str);
        if (a == null) {
            this.root.showAlert("Could not find mod:" + str);
            return;
        }
        C0796a steam = getSteam();
        if (steam != null) {
            if (a.f4614d == 0) {
                steam.mo640b(a);
            } else {
                steam.mo642a(a, false, "Changes.");
            }
        }
    }

    public void viewMod(String str) {
        C0657b a = AbstractC0789l.m651u().f5488bH.m1461a(str);
        if (a == null) {
            this.root.showAlert("Could not find mod:" + str);
            return;
        }
        C0796a steam = getSteam();
        if (steam != null) {
            steam.mo643a(a);
        }
    }

    public void loadMods() {
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m683d("loadMods");
        Element elementById = activeDocument.getElementById("modTemplate");
        Element elementById2 = activeDocument.getElementById("modList");
        String innerRML = elementById.getInnerRML();
        String str = "";
        ArrayList i = u.f5488bH.m1445i();
        int i2 = 0;
        Iterator it = i.iterator();
        while (it.hasNext()) {
            C0657b bVar = (C0657b) it.next();
            String str2 = "";
            String replace = innerRML.replace("_NAME_", this.root.htmlString(bVar.m1441a())).replace("_ID_", bVar.f4612b);
            String str3 = bVar.f4633z;
            if (str3 == null) {
                str3 = "";
            } else {
                str2 = str2 + " modItemError";
            }
            if (bVar.f4614d != 0) {
                if (!bVar.f4620j) {
                    str2 = str2 + " modItemIsOwner";
                }
                str2 = str2 + " modItemIsPublished";
            } else if (!bVar.f4620j && !bVar.f4621k) {
                str2 = str2 + " modItemCanBePublished";
            }
            if (bVar.f4635l) {
                str2 = str2 + " modItemHasMaps";
            }
            String j = bVar.m1427j();
            if (j == null) {
                j = "";
            }
            i2++;
            str = str + replace.replace("_ERROR_", this.root.htmlString(str3)).replace("_MESSAGE_", this.root.htmlString(j)).replace("_DESCRIPTION_", this.root.htmlString(bVar.m1433d())).replace("_CLASS_", str2);
        }
        elementById2.setInnerRML(str);
        elementById2.loadCharsetIfNeeded(str);
        Iterator it2 = i.iterator();
        while (it2.hasNext()) {
            C0657b bVar2 = (C0657b) it2.next();
            Element elementById3 = activeDocument.getElementById(bVar2.f4612b);
            if (elementById3 == null) {
                AbstractC0789l.m695b("Could not find:" + bVar2.f4611a);
            } else {
                elementById3.setCheckbox(!bVar2.f4613c);
            }
        }
    }

    public void saveMods() {
        _saveModsCommon(true);
    }

    private void _saveModsCommon(boolean z) {
        boolean z2 = false;
        ElementDocument activeDocument = this.libRocket.getActiveDocument();
        AbstractC0789l u = AbstractC0789l.m651u();
        AbstractC0789l.m683d("savesMods");
        Iterator it = activeDocument.findElementsByClassName("modSelection").iterator();
        while (it.hasNext()) {
            Element element = (Element) it.next();
            String id = element.getId();
            if (!id.equals("_ID_")) {
                C0657b a = u.f5488bH.m1461a(id);
                if (a == null) {
                    this.root.showAlert("Could not find mod:" + element.getInnerRML());
                } else {
                    boolean z3 = !element.getCheckbox();
                    if (a.f4613c != z3) {
                        z2 = true;
                    }
                    a.f4613c = z3;
                }
            }
        }
        if (z2) {
            AbstractC0789l.m683d("mod changes made");
        } else {
            AbstractC0789l.m683d("no mod changes made");
        }
        u.f5488bH.m1453c();
        u.f5479by.save();
        if (z) {
            _saveModsMessages();
        }
    }

    private void _saveModsMessages() {
        AbstractC0789l u = AbstractC0789l.m651u();
        int b = u.f5488bH.m1455b();
        if (u.f5486bF.f4734z) {
            AbstractC0789l.m683d("savesMods: in network game");
            this.root.showAlert("You are currently in a network game, changes will be checked and applied on next game");
        } else if (!C0307ac.m3332c(true)) {
            AbstractC0789l.m683d("Errors found");
        } else if (b == 0) {
            this.root.showAlert("Mod changes saved. Will be used in the next game.");
        } else {
            String str = "Mod selection saved. But " + b + " mod(s) aren't loaded. Load them now?";
            if (!u.m772B()) {
                str = str + " (This will end your current game).";
            }
            this.root.showPopup("Reload needed", str, true, "[onenter]Reload:closePopup(); mods.reloadModData();", null);
        }
    }

    public void disableAllAsk() {
        this.root.showPopup("Disable all mods?", "", true, "[onenter]Disable All:closePopup(); mods.disableAll();", null);
    }

    public void disableAll() {
        AbstractC0789l u = AbstractC0789l.m651u();
        u.f5488bH.m1449e();
        u.f5488bH.m1453c();
        u.f5479by.save();
        u.f5488bH.m1444j();
        loadMods();
    }

    public void reloadModDataAsk() {
        if (AbstractC0789l.m651u().m772B()) {
            AbstractC0789l.m683d("Menu active, reloading without asking");
            reloadModData();
            return;
        }
        this.root.showPopup("Reload all mod data?", "Warning! this will end your current game.", true, "[onenter]Reload:closePopup(); mods.reloadModData();", null);
    }

    public void reloadModData() {
        AbstractC0789l u = AbstractC0789l.m651u();
        _saveModsCommon(false);
        u.f5488bH.m1444j();
        _saveModsMessages();
        loadMods();
    }
}
