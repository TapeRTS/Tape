package com.corrodinggames.librocket;

import android.graphics.Rect;
import android.graphics.RectF;
import com.Element;
import com.ElementDocument;
import com.LibRocket;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0734bn;
import com.corrodinggames.rts.gameFramework.C0894j;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.librocket.b */
/* loaded from: game-lib.jar:com/corrodinggames/librocket/b.class */
public abstract class AbstractC0048b extends LibRocket {

    /* renamed from: a */
    public static C0734bn f356a = new C0734bn("LoadResources");

    /* renamed from: b */
    public static String f357b = VariableScope.nullOrMissingString;

    /* renamed from: i */
    private C0050d f358i;

    /* renamed from: j */
    private C0050d f359j;

    /* renamed from: d */
    protected int f360d = 0;

    /* renamed from: e */
    protected Rect f361e = new Rect();

    /* renamed from: f */
    protected RectF f362f = new RectF();

    /* renamed from: g */
    protected boolean f363g = false;

    /* renamed from: h */
    Pattern f364h = Pattern.compile("\\$\\{([^\\}]*?)\\}");

    /* renamed from: c */
    public ScriptEngine f365c = ScriptEngine.createScriptEngine(this);

    public abstract void EnableScissorRegion(boolean z);

    /* renamed from: a */
    public void m7064a() {
        this.f360d = 0;
    }

    /* renamed from: a */
    public static String m7059a(String str) {
        GameEngine.PrintLog("convertTexturePath for: " + str);
        String m2240o = CommonUtils.m2240o(str);
        if (m2240o.startsWith("base:")) {
            return f357b + m2240o.substring("base:".length());
        }
        if (m2240o.startsWith("drawable:")) {
            return f357b + "res/drawable/" + m2240o.substring("drawable:".length());
        }
        if (m2240o.startsWith("assets:")) {
            String substring = m2240o.substring("assets:".length());
            String m2447e = C0750a.m2447e(substring);
            boolean z = true;
            if (GameEngine.f6204aZ && m2447e != null && m2447e.startsWith(f357b)) {
                z = false;
            }
            if (GameEngine.f6204aZ && m2447e != null && m2447e.startsWith("/private")) {
                z = false;
            }
            GameEngine.PrintLog("convertTexturePath  (basePath:" + z + "):" + substring + " > " + m2447e);
            if (z) {
                return f357b + m2447e;
            }
            return m2447e;
        } else if (m2240o.startsWith(f357b + "assets/gui/")) {
            GameEngine.PrintLog("convertTexturePath already had path:" + m2240o);
            return m2240o;
        } else {
            return f357b + "assets/gui/" + m2240o;
        }
    }

    /* renamed from: a */
    public Matcher m7057a(String str, String str2) {
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    public void ReleaseTexture(int i) {
        removeTextureHolder(i);
    }

    public boolean LoadTexture(int i, String str) {
        f356a.m2601a();
        AbstractC0049c abstractC0049c = (AbstractC0049c) findTextureHolder(i);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        InterfaceC0303as interfaceC0303as = null;
        if (str.startsWith("lazy:")) {
            str = str.substring("lazy:".length());
            z = true;
        }
        if (str.startsWith("nocolor:")) {
            str = str.substring("nocolor:".length());
            z2 = true;
        }
        if (str.startsWith("unit:")) {
            str = str.substring("unit:".length());
            interfaceC0303as = UnitType.m5734a(str);
            z = true;
        }
        if (str.startsWith("thumbnail:")) {
            str = str.substring("thumbnail:".length());
            z3 = true;
        }
        Matcher m7057a = m7057a("^(alpha\\((.*)\\):).*", str);
        if (m7057a != null) {
            String group = m7057a.group(1);
            String group2 = m7057a.group(2);
            GameEngine.PrintLog("alpha=" + group2);
            abstractC0049c.f370e = Float.parseFloat(group2);
            str = str.substring(group.length());
        }
        String m7059a = m7059a(str);
        abstractC0049c.f367b = z;
        abstractC0049c.f368c = z3;
        abstractC0049c.f369d = z2;
        abstractC0049c.f371f = interfaceC0303as;
        abstractC0049c.f366a = m7059a;
        if (!z && !abstractC0049c.mo7036a()) {
            f356a.m2600b();
            return false;
        }
        f356a.m2600b();
        return true;
    }

    public void SetScissorRegion(int i, int i2, int i3, int i4) {
        this.f361e.m7208a(i, i2, i + i3, i2 + i4);
        this.f362f.m7195a(i, i2, i + i3, i2 + i4);
        EnableScissorRegion(true);
    }

    /* renamed from: b */
    public boolean m7053b() {
        if (getActiveDocument() != null || this.f359j != null || this.f358i != null) {
            return false;
        }
        return true;
    }

    public void HandleEvent(String str) {
        this.f365c.processScript(str);
    }

    /* renamed from: b */
    public Object m7050b(String str) {
        HashMap activeDocumentMetadata = getActiveDocumentMetadata();
        if (activeDocumentMetadata == null) {
            return null;
        }
        return activeDocumentMetadata.get(str);
    }

    public void newDocumentLoaded(ElementDocument elementDocument) {
        this.f365c.getRootNoCheck().convertTextOnPage();
    }

    public void newDocumentShown(ElementDocument elementDocument) {
        if (this.f359j != null) {
            this.f359j.f373a.pullToFront();
        }
        if (this.f358i != null) {
            this.f358i.f373a.pullToFront();
        }
    }

    /* renamed from: c */
    public ElementDocument m7048c() {
        if (this.f359j != null) {
            return this.f359j.f373a;
        }
        return null;
    }

    /* renamed from: d */
    public ElementDocument m7045d() {
        if (this.f358i != null) {
            return this.f358i.f373a;
        }
        return null;
    }

    /* renamed from: e */
    public ElementDocument m7043e() {
        ElementDocument m7045d = m7045d();
        if (m7045d != null) {
            return m7045d;
        }
        return m7048c();
    }

    /* renamed from: f */
    public ElementDocument m7042f() {
        ElementDocument m7048c = m7048c();
        if (m7048c != null) {
            return m7048c;
        }
        return getActiveDocument();
    }

    /* renamed from: g */
    public ElementDocument m7041g() {
        ElementDocument m7045d = m7045d();
        if (m7045d != null) {
            return m7045d;
        }
        ElementDocument m7048c = m7048c();
        if (m7048c != null) {
            return m7048c;
        }
        return getActiveDocument();
    }

    /* renamed from: c */
    public void m7046c(String str) {
        C0050d c0050d = new C0050d();
        c0050d.f374b = null;
        c0050d.f375c = str;
        m7060a(c0050d);
    }

    /* renamed from: b */
    public void m7049b(String str, String str2) {
        C0050d c0050d = new C0050d();
        c0050d.f374b = str;
        c0050d.f375c = str2;
        m7060a(c0050d);
    }

    /* renamed from: a */
    public void m7054a(String str, String str2, String str3, String str4, String str5, boolean z) {
        C0050d c0050d = new C0050d();
        c0050d.f374b = str;
        c0050d.f375c = str2;
        c0050d.f376d = str3;
        c0050d.f377e = str4;
        c0050d.f378f = str5;
        c0050d.f380h = z;
        m7060a(c0050d);
    }

    /* renamed from: a */
    public void m7056a(String str, String str2, String str3, C0051e c0051e, C0051e c0051e2, boolean z) {
        C0050d c0050d = new C0050d();
        c0050d.f374b = str;
        c0050d.f375c = str2;
        c0050d.f376d = str3;
        c0050d.f377e = c0051e;
        c0050d.f378f = c0051e2;
        c0050d.f380h = z;
        m7060a(c0050d);
    }

    /* renamed from: a */
    public ElementDocument m7055a(String str, String str2, String str3, Object obj, Object obj2, boolean z, boolean z2) {
        C0050d c0050d = new C0050d();
        c0050d.f374b = str;
        c0050d.f375c = str2;
        c0050d.f376d = str3;
        c0050d.f377e = obj;
        c0050d.f378f = obj2;
        c0050d.f379g = z;
        c0050d.f380h = z2;
        return m7060a(c0050d);
    }

    /* renamed from: a */
    public ElementDocument m7060a(C0050d c0050d) {
        ScriptEngine.checkThreadAccess();
        ElementDocument createPopup = createPopup("messagebox.rml", null);
        HashMap metadataMap = createPopup.getMetadataMap();
        createPopup.getElementById("message").setTextWithNewlines(c0050d.f375c);
        if (c0050d.f374b == null) {
            c0050d.f374b = VariableScope.nullOrMissingString;
        }
        createPopup.getElementById("title").setText(c0050d.f374b);
        m7061a(createPopup, "button_1", c0050d.f377e, metadataMap);
        m7061a(createPopup, "button_2", c0050d.f378f, metadataMap);
        Element elementById = createPopup.getElementById("button_back");
        elementById.loadCharsetIfNeededWithCurrentText();
        String str = "closePopup();";
        if (c0050d.f376d != null) {
            str = str + "hideKeyboard();";
        }
        elementById.setAttribute("onclick", str);
        if (!c0050d.f380h) {
            elementById.hide();
        }
        if (c0050d.f377e == null && c0050d.f378f == null) {
            elementById.setText(C0820a.m1886a("menus.common.ok", new Object[0]));
            elementById.focus();
        }
        if (c0050d.f376d != null) {
            createPopup.getElementById("textInputWrapper").show();
            Element elementById2 = createPopup.getElementById("textInput");
            elementById2.setAttribute("value", c0050d.f376d);
            elementById2.focus();
        }
        c0050d.f373a = createPopup;
        if (c0050d.f379g) {
            if (m7051b(c0050d)) {
                return createPopup;
            }
            closeDocument(createPopup);
            return null;
        }
        return createPopup;
    }

    /* renamed from: b */
    public boolean m7051b(C0050d c0050d) {
        if (this.f358i != null) {
            GameEngine.PrintLog("AlertPopup already visible closing");
            closeDocument(this.f358i.f373a);
            this.f358i = null;
        }
        this.f358i = c0050d;
        c0050d.f373a.show(4);
        return true;
    }

    /* renamed from: a */
    public boolean m7062a(ElementDocument elementDocument) {
        return m7047c(new C0050d(elementDocument));
    }

    /* renamed from: c */
    public boolean m7047c(C0050d c0050d) {
        if (this.f359j != null) {
            GameEngine.PrintLog("Popup already visible, cannot show: " + c0050d.f373a.getMetadata("sourceDocumentId"));
            if (this.f358i != null) {
                this.f358i.f373a.pullToFront();
                return false;
            }
            this.f359j.f373a.pullToFront();
            return false;
        }
        this.f359j = c0050d;
        c0050d.f373a.show(4);
        return true;
    }

    /* renamed from: a */
    public ElementDocument m7058a(String str, Object obj, String str2, boolean z) {
        ScriptEngine.checkThreadAccess();
        ElementDocument createPopup = createPopup("messagebox.rml", obj);
        createPopup.setMetadata("sourceDocumentId", str);
        String m2344a = CommonUtils.m2344a(new File(m7059a(str)));
        createPopup.getElementById("mainButtons").hide();
        Element elementById = createPopup.getElementById("message");
        elementById.setInnerRML(m2344a);
        m7063a(elementById, false);
        if (str2 == null) {
            str2 = VariableScope.nullOrMissingString;
        }
        createPopup.getElementById("title").setText(str2);
        if (z) {
            if (m7052b(createPopup)) {
                return createPopup;
            }
            return null;
        }
        return createPopup;
    }

    /* renamed from: b */
    public boolean m7052b(ElementDocument elementDocument) {
        if (m7047c(new C0050d(elementDocument))) {
            return true;
        }
        closeDocument(elementDocument);
        return false;
    }

    /* renamed from: a */
    public void m7063a(Element element, boolean z) {
        if (element == null) {
            GameEngine.PrintLog("loadCharsetIfNeededOnChildren: root is null");
            return;
        }
        Iterator it = element.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element2 = (Element) it.next();
            boolean z2 = false;
            String tagName = element2.getTagName();
            if (tagName.equals("p") || tagName.startsWith("h") || tagName.startsWith("label") || tagName.startsWith("button") || tagName.startsWith("select")) {
                z2 = true;
            }
            if (z && tagName.equals("option")) {
                z2 = true;
            }
            if (z2) {
                element2.loadCharsetIfNeededWithCurrentText();
            }
        }
    }

    /* renamed from: a */
    public void m7061a(ElementDocument elementDocument, String str, Object obj, HashMap hashMap) {
        Element elementById = elementDocument.getElementById(str);
        if (obj == null) {
            elementById.hide();
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            int indexOf = str2.indexOf(":");
            String substring = str2.substring(0, indexOf);
            String str3 = VariableScope.nullOrMissingString;
            if (indexOf + 1 < str2.length()) {
                str3 = str2.substring(indexOf + 1);
            }
            if (substring.startsWith("[onenter]")) {
                substring = substring.substring("[onenter]".length());
                elementDocument.getElementById("textInput").setAttribute("onenter", str3);
            }
            elementById.setText(substring);
            elementById.setAttribute("onclick", str3);
        } else if (obj instanceof C0051e) {
            C0051e c0051e = (C0051e) obj;
            String str4 = "action_" + str;
            hashMap.put(str4, c0051e.f383b);
            elementById.setText(c0051e.f382a);
            elementById.setAttribute("onclick", "runRunnable(" + str4 + ");");
            if (c0051e.f384c) {
                elementDocument.getElementById("textInput").setAttribute("onenter", "runRunnable(" + str4 + ");");
            }
        } else {
            GameEngine.m1120g("Unhandled type:" + obj);
        }
    }

    /* renamed from: h */
    public boolean m7040h() {
        if (m7039i() || m7038j()) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public boolean m7039i() {
        C0050d c0050d = this.f358i;
        if (c0050d != null) {
            GameEngine.PrintLog("Closing alert");
            closeDocument(c0050d.f373a);
            this.f358i = null;
            if (c0050d.f381i != null) {
                c0050d.f381i.run();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public boolean m7038j() {
        C0050d c0050d = this.f359j;
        if (c0050d != null) {
            GameEngine.PrintLog("Closing popup");
            closeDocument(c0050d.f373a);
            this.f359j = null;
            if (c0050d.f381i != null) {
                c0050d.f381i.run();
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public String m7037k() {
        return m7043e().getElementById("textInput").getAttribute("value");
    }

    /* renamed from: d */
    public String m7044d(String str) {
        String replaceFirst;
        Object processArg;
        String str2 = null;
        if (str != null && str.contains("class=\"log-entry\"")) {
            System.out.println("parseText: skipping log line:" + str);
            return null;
        }
        int i = 0;
        Matcher matcher = this.f364h.matcher(str);
        while (matcher.find()) {
            i++;
            if (i > 100) {
                System.out.println("parseText too many loops!!");
                return null;
            }
            String group = matcher.group(1);
            String str3 = null;
            if (this.debug) {
                System.out.println("parseText:" + group);
            }
            if (group.startsWith("i:")) {
                str3 = C0820a.m1886a(group.substring(2), new Object[0]);
            }
            if (str3 == null && (processArg = this.f365c.processArg(group)) != null) {
                str3 = processArg.toString();
            }
            if (str3 == null) {
                replaceFirst = matcher.replaceFirst("(unhandled:" + group + ")");
            } else {
                replaceFirst = matcher.replaceFirst(str3);
            }
            if (str3 != null) {
                ElementDocument activeDocument = getActiveDocument();
                if (activeDocument != null && !activeDocument.translatedToUnicode && CommonUtils.m2241n(str3)) {
                    activeDocument.translatedToUnicode = true;
                }
                ElementDocument m7041g = m7041g();
                if (m7041g != null && !m7041g.translatedToUnicode && CommonUtils.m2241n(str3)) {
                    m7041g.translatedToUnicode = true;
                }
            }
            matcher = this.f364h.matcher(replaceFirst);
            str2 = replaceFirst;
        }
        return str2;
    }

    public String TranslateString(String str) {
        try {
            String m7044d = m7044d(str);
            if (m7044d != null) {
                return m7044d;
            }
            return null;
        } catch (Exception e) {
            ScriptEngine.throwDelayedException("TranslateString exception on: " + str, e);
            GameEngine.m1188a("Exception in TranslateString", (Throwable) e);
            GameEngine.m1145b("start");
            e.printStackTrace();
            GameEngine.m1145b("end");
            GameEngine.m1145b("start logStack");
            GameEngine.m1216S();
            GameEngine.m1145b("end logStack");
            System.err.flush();
            System.out.flush();
            return null;
        }
    }

    public long getFileLastModified(String str) {
        return C0894j.m1401a(str, false);
    }

    public void postUpdate() {
        boolean z = this.queueExtraUpdate;
        super.postUpdate();
        if (z) {
            this.f365c.checkForErrors();
        }
    }
}
