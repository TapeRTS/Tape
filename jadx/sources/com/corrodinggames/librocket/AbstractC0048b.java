package com.corrodinggames.librocket;

import android.graphics.Rect;
import android.graphics.RectF;
import com.Element;
import com.ElementDocument;
import com.LibRocket;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0593bl;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.C0743j;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.librocket.b */
/* loaded from: game-lib.jar:com/corrodinggames/librocket/b.class */
public abstract class AbstractC0048b extends LibRocket {

    /* renamed from: a */
    public static C0593bl f353a = new C0593bl("LoadResources");

    /* renamed from: b */
    public static String f354b = "";

    /* renamed from: i */
    private C0050d f360i;

    /* renamed from: j */
    private C0050d f361j;

    /* renamed from: d */
    protected int f356d = 0;

    /* renamed from: e */
    protected Rect f357e = new Rect();

    /* renamed from: f */
    protected RectF f358f = new RectF();

    /* renamed from: g */
    protected boolean f359g = false;

    /* renamed from: h */
    Pattern f362h = Pattern.compile("\\$\\{([^\\}]*?)\\}");

    /* renamed from: c */
    public ScriptEngine f355c = ScriptEngine.createScriptEngine(this);

    @Override // com.LibRocket
    public abstract void EnableScissorRegion(boolean z);

    /* renamed from: a */
    public void mo205a() {
        this.f356d = 0;
    }

    /* renamed from: a */
    public static String m3987a(String str) {
        AbstractC0789l.m670d("convertTexturePath for: " + str);
        String n = C0654f.m1413n(str);
        if (n.startsWith("base:")) {
            return f354b + n.substring("base:".length());
        }
        if (n.startsWith("drawable:")) {
            return f354b + "res/drawable/" + n.substring("drawable:".length());
        }
        if (n.startsWith("assets:")) {
            String substring = n.substring("assets:".length());
            String c = C0596a.m1889c(substring);
            AbstractC0789l.m670d("convertTexturePath: " + substring + " > " + c);
            return f354b + c;
        } else if (!n.startsWith(f354b + "assets/gui/")) {
            return f354b + "assets/gui/" + n;
        } else {
            AbstractC0789l.m670d("convertTexturePath already had path:" + n);
            return n;
        }
    }

    /* renamed from: a */
    public Matcher m3985a(String str, String str2) {
        Matcher matcher = Pattern.compile(str).matcher(str2);
        if (matcher.matches()) {
            return matcher;
        }
        return null;
    }

    @Override // com.LibRocket
    public void ReleaseTexture(int i) {
        removeTextureHolder(i);
    }

    @Override // com.LibRocket
    public boolean LoadTexture(int i, String str) {
        f353a.m1908a();
        AbstractC0049c cVar = (AbstractC0049c) findTextureHolder(i);
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        AbstractC0268al alVar = null;
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
            alVar = EnumC0215ak.m3273a(str);
            z = true;
        }
        if (str.startsWith("thumbnail:")) {
            str = str.substring("thumbnail:".length());
            z3 = true;
        }
        Matcher a = m3985a("^(alpha\\((.*)\\):).*", str);
        if (a != null) {
            String group = a.group(1);
            String group2 = a.group(2);
            AbstractC0789l.m670d("alpha=" + group2);
            cVar.f367e = Float.parseFloat(group2);
            str = str.substring(group.length());
        }
        String a2 = m3987a(str);
        cVar.f364b = z;
        cVar.f365c = z3;
        cVar.f366d = z2;
        cVar.f368f = alVar;
        cVar.f363a = a2;
        if (z || cVar.mo203a()) {
            f353a.m1907b();
            return true;
        }
        f353a.m1907b();
        return false;
    }

    @Override // com.LibRocket
    public void SetScissorRegion(int i, int i2, int i3, int i4) {
        this.f357e.m4136a(i, i2, i + i3, i2 + i4);
        this.f358f.m4122a(i, i2, i + i3, i2 + i4);
        EnableScissorRegion(true);
    }

    /* renamed from: b */
    public boolean m3981b() {
        if (getActiveDocument() == null && this.f361j == null && this.f360i == null) {
            return true;
        }
        return false;
    }

    @Override // com.LibRocket
    public void HandleEvent(String str) {
        this.f355c.processScript(str);
    }

    /* renamed from: b */
    public Object m3979b(String str) {
        HashMap activeDocumentMetadata = getActiveDocumentMetadata();
        if (activeDocumentMetadata == null) {
            return null;
        }
        return activeDocumentMetadata.get(str);
    }

    @Override // com.LibRocket
    public void newDocumentLoaded(ElementDocument elementDocument) {
        this.f355c.getRootNoCheck().convertTextOnPage();
    }

    @Override // com.LibRocket
    public void newDocumentShown(ElementDocument elementDocument) {
        if (this.f361j != null) {
            this.f361j.f370a.pullToFront();
        }
        if (this.f360i != null) {
            this.f360i.f370a.pullToFront();
        }
    }

    /* renamed from: c */
    public ElementDocument m3977c() {
        if (this.f361j != null) {
            return this.f361j.f370a;
        }
        return null;
    }

    /* renamed from: d */
    public ElementDocument m3974d() {
        if (this.f360i != null) {
            return this.f360i.f370a;
        }
        return null;
    }

    /* renamed from: e */
    public ElementDocument m3972e() {
        ElementDocument d = m3974d();
        if (d != null) {
            return d;
        }
        return m3977c();
    }

    /* renamed from: f */
    public ElementDocument m3971f() {
        ElementDocument c = m3977c();
        if (c != null) {
            return c;
        }
        return getActiveDocument();
    }

    /* renamed from: g */
    public ElementDocument m3970g() {
        ElementDocument d = m3974d();
        if (d != null) {
            return d;
        }
        ElementDocument c = m3977c();
        if (c != null) {
            return c;
        }
        return getActiveDocument();
    }

    /* renamed from: c */
    public void m3975c(String str) {
        C0050d dVar = new C0050d();
        dVar.f371b = null;
        dVar.f372c = str;
        m3988a(dVar);
    }

    /* renamed from: b */
    public void m3978b(String str, String str2) {
        C0050d dVar = new C0050d();
        dVar.f371b = str;
        dVar.f372c = str2;
        m3988a(dVar);
    }

    /* renamed from: a */
    public void m3982a(String str, String str2, String str3, String str4, String str5) {
        C0050d dVar = new C0050d();
        dVar.f371b = str;
        dVar.f372c = str2;
        dVar.f373d = str3;
        dVar.f374e = str4;
        dVar.f375f = str5;
        m3988a(dVar);
    }

    /* renamed from: a */
    public void m3984a(String str, String str2, String str3, C0051e eVar, C0051e eVar2) {
        C0050d dVar = new C0050d();
        dVar.f371b = str;
        dVar.f372c = str2;
        dVar.f373d = str3;
        dVar.f374e = eVar;
        dVar.f375f = eVar2;
        m3988a(dVar);
    }

    /* renamed from: a */
    public ElementDocument m3983a(String str, String str2, String str3, Object obj, Object obj2, boolean z, boolean z2) {
        C0050d dVar = new C0050d();
        dVar.f371b = str;
        dVar.f372c = str2;
        dVar.f373d = str3;
        dVar.f374e = obj;
        dVar.f375f = obj2;
        dVar.f376g = z;
        dVar.f377h = z2;
        return m3988a(dVar);
    }

    /* renamed from: a */
    public ElementDocument m3988a(C0050d dVar) {
        ScriptEngine.checkThreadAccess();
        ElementDocument createPopup = createPopup("messagebox.rml", null);
        HashMap metadataMap = createPopup.getMetadataMap();
        createPopup.getElementById("message").setTextWithNewlines(dVar.f372c);
        if (dVar.f371b == null) {
            dVar.f371b = "";
        }
        createPopup.getElementById("title").setText(dVar.f371b);
        m3989a(createPopup, "button_1", dVar.f374e, metadataMap);
        m3989a(createPopup, "button_2", dVar.f375f, metadataMap);
        Element elementById = createPopup.getElementById("button_back");
        elementById.loadCharsetIfNeededWithCurrentText();
        String str = "closePopup();";
        if (dVar.f373d != null) {
            str = str + "hideKeyboard();";
        }
        elementById.setAttribute("onclick", str);
        if (!dVar.f377h) {
            elementById.hide();
        }
        if (dVar.f374e == null && dVar.f375f == null) {
            elementById.setText(C0652a.m1536a("menus.common.ok", new Object[0]));
            elementById.focus();
        }
        if (dVar.f373d != null) {
            createPopup.getElementById("textInputWrapper").show();
            Element elementById2 = createPopup.getElementById("textInput");
            elementById2.setAttribute("value", dVar.f373d);
            elementById2.focus();
        }
        dVar.f370a = createPopup;
        if (!dVar.f376g) {
            return createPopup;
        }
        if (m3980b(dVar)) {
            return createPopup;
        }
        closeDocument(createPopup);
        return null;
    }

    /* renamed from: b */
    public boolean m3980b(C0050d dVar) {
        if (this.f360i != null) {
            AbstractC0789l.m670d("AlertPopup already visible closing");
            closeDocument(this.f360i.f370a);
            this.f360i = null;
        }
        this.f360i = dVar;
        dVar.f370a.show(4);
        return true;
    }

    /* renamed from: a */
    public boolean m3990a(ElementDocument elementDocument) {
        return m3976c(new C0050d(elementDocument));
    }

    /* renamed from: c */
    public boolean m3976c(C0050d dVar) {
        if (this.f361j != null) {
            AbstractC0789l.m670d("Popup already visible, cannot show: " + dVar.f370a.getMetadata("sourceDocumentId"));
            if (this.f360i != null) {
                this.f360i.f370a.pullToFront();
                return false;
            }
            this.f361j.f370a.pullToFront();
            return false;
        }
        this.f361j = dVar;
        dVar.f370a.show(4);
        return true;
    }

    /* renamed from: a */
    public ElementDocument m3986a(String str, Object obj, String str2, boolean z) {
        ScriptEngine.checkThreadAccess();
        ElementDocument createPopup = createPopup("messagebox.rml", obj);
        createPopup.setMetadata("sourceDocumentId", str);
        String a = C0654f.m1498a(new File(m3987a(str)));
        createPopup.getElementById("mainButtons").hide();
        Element elementById = createPopup.getElementById("message");
        elementById.setInnerRML(a);
        m3991a(elementById);
        if (str2 == null) {
            str2 = "";
        }
        createPopup.getElementById("title").setText(str2);
        if (!z) {
            return createPopup;
        }
        if (m3976c(new C0050d(createPopup))) {
            return createPopup;
        }
        closeDocument(createPopup);
        return null;
    }

    /* renamed from: a */
    public void m3991a(Element element) {
        if (element == null) {
            AbstractC0789l.m670d("loadCharsetIfNeededOnChildren: root is null");
            return;
        }
        Iterator it = element.getAllNestedChildren().iterator();
        while (it.hasNext()) {
            Element element2 = (Element) it.next();
            String tagName = element2.getTagName();
            if (tagName.equals("p") || tagName.startsWith("h") || tagName.startsWith("label") || tagName.startsWith("button") || tagName.startsWith("select")) {
                element2.loadCharsetIfNeededWithCurrentText();
            }
        }
    }

    /* renamed from: a */
    public void m3989a(ElementDocument elementDocument, String str, Object obj, HashMap hashMap) {
        Element elementById = elementDocument.getElementById(str);
        if (obj == null) {
            elementById.hide();
        } else if (obj instanceof String) {
            String str2 = (String) obj;
            int indexOf = str2.indexOf(":");
            String substring = str2.substring(0, indexOf);
            String str3 = "";
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
            C0051e eVar = (C0051e) obj;
            String str4 = "action_" + str;
            hashMap.put(str4, eVar.f380b);
            elementById.setText(eVar.f379a);
            elementById.setAttribute("onclick", "runRunnable(" + str4 + ");");
            if (eVar.f381c) {
                elementDocument.getElementById("textInput").setAttribute("onenter", "runRunnable(" + str4 + ");");
            }
        } else {
            AbstractC0789l.m663f("Unhandled type:" + obj);
        }
    }

    /* renamed from: h */
    public boolean m3969h() {
        if (!m3968i() && !m3967j()) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public boolean m3968i() {
        C0050d dVar = this.f360i;
        if (dVar == null) {
            return false;
        }
        AbstractC0789l.m670d("Closing alert");
        closeDocument(dVar.f370a);
        this.f360i = null;
        if (dVar.f378i == null) {
            return true;
        }
        dVar.f378i.run();
        return true;
    }

    /* renamed from: j */
    public boolean m3967j() {
        C0050d dVar = this.f361j;
        if (dVar == null) {
            return false;
        }
        AbstractC0789l.m670d("Closing popup");
        closeDocument(dVar.f370a);
        this.f361j = null;
        if (dVar.f378i == null) {
            return true;
        }
        dVar.f378i.run();
        return true;
    }

    /* renamed from: k */
    public String m3966k() {
        return m3972e().getElementById("textInput").getAttribute("value");
    }

    /* renamed from: d */
    public String m3973d(String str) {
        String str2;
        Object processArg;
        String str3 = null;
        if (str == null || !str.contains("class=\"log-entry\"")) {
            int i = 0;
            Matcher matcher = this.f362h.matcher(str);
            while (matcher.find()) {
                i++;
                if (i > 100) {
                    System.out.println("parseText too many loops!!");
                    return null;
                }
                String group = matcher.group(1);
                String str4 = null;
                if (this.debug) {
                    System.out.println("parseText:" + group);
                }
                if (group.startsWith("i:")) {
                    str4 = C0652a.m1536a(group.substring(2), new Object[0]);
                }
                if (str4 == null && (processArg = this.f355c.processArg(group)) != null) {
                    str4 = processArg.toString();
                }
                if (str4 == null) {
                    str2 = matcher.replaceFirst("(unhandled:" + group + ")");
                } else {
                    str2 = matcher.replaceFirst(str4);
                }
                if (str4 != null) {
                    ElementDocument activeDocument = getActiveDocument();
                    if (activeDocument != null && !activeDocument.translatedToUnicode && C0654f.m1414m(str4)) {
                        activeDocument.translatedToUnicode = true;
                    }
                    ElementDocument g = m3970g();
                    if (g != null && !g.translatedToUnicode && C0654f.m1414m(str4)) {
                        g.translatedToUnicode = true;
                    }
                }
                matcher = this.f362h.matcher(str2);
                str3 = str2;
            }
            return str3;
        }
        System.out.println("parseText: skipping log line:" + str);
        return null;
    }

    @Override // com.LibRocket
    public String TranslateString(String str) {
        try {
            String d = m3973d(str);
            if (d != null) {
                return d;
            }
            return null;
        } catch (Exception e) {
            ScriptEngine.throwDelayedException("TranslateString exception on: " + str, e);
            AbstractC0789l.m714a("Exception in TranslateString", (Throwable) e);
            AbstractC0789l.m682b("start");
            e.printStackTrace();
            AbstractC0789l.m682b("end");
            AbstractC0789l.m682b("start logStack");
            AbstractC0789l.m748M();
            AbstractC0789l.m682b("end logStack");
            System.err.flush();
            System.out.flush();
            return null;
        }
    }

    @Override // com.LibRocket
    public long getFileLastModified(String str) {
        return C0743j.m881a(str, false);
    }

    @Override // com.LibRocket
    public void postUpdate() {
        boolean z = this.queueExtraUpdate;
        super.postUpdate();
        if (z) {
            this.f355c.checkForErrors();
        }
    }
}
