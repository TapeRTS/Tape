package com.corrodinggames.rts.game.p012b;

import android.graphics.RectF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0400ba;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1116x;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* renamed from: com.corrodinggames.rts.game.b.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/a.class */
public class C0172a {

    /* renamed from: a */
    public int f765a;

    /* renamed from: b */
    public String f766b;

    /* renamed from: c */
    public String f767c;

    /* renamed from: d */
    public String f768d;

    /* renamed from: e */
    public float f769e;

    /* renamed from: f */
    public float f770f;

    /* renamed from: g */
    public float f771g;

    /* renamed from: h */
    public float f772h;

    /* renamed from: i */
    public float f773i;

    /* renamed from: p */
    private String f774p;

    /* renamed from: j */
    public RectF f775j;

    /* renamed from: k */
    public int f776k;

    /* renamed from: l */
    public C0183j f777l;

    /* renamed from: m */
    public int f778m;

    /* renamed from: n */
    public Properties f779n;

    /* renamed from: o */
    public C1101m f780o = new C1101m();

    /* renamed from: a */
    static float m6659a(Element element, String str) {
        String attribute = element.getAttribute(str);
        try {
            return Float.parseFloat(attribute);
        } catch (NumberFormatException e) {
            throw new C0179f("Invalid map: Error reading '" + str + "' invalid float: " + attribute, e);
        }
    }

    public C0172a(Element element, C0173b c0173b, C0182i c0182i) {
        Team m6317k;
        C0451j mo5717a;
        NodeList elementsByTagName;
        String textContent;
        this.f776k = -1;
        this.f778m = -1;
        this.f766b = element.getAttribute("name");
        if (this.f766b != null) {
            this.f767c = this.f766b.trim().toLowerCase(Locale.ENGLISH);
        }
        this.f768d = element.getAttribute("type");
        this.f769e = Float.parseFloat(element.getAttribute("x"));
        this.f770f = Float.parseFloat(element.getAttribute("y"));
        if (element.hasAttribute("rotation")) {
            this.f773i = Float.parseFloat(element.getAttribute("rotation")) - 90.0f;
        }
        if (!element.getAttribute("width").equals(VariableScope.nullOrMissingString)) {
            this.f771g = m6659a(element, "width");
        }
        if (!element.getAttribute("height").equals(VariableScope.nullOrMissingString)) {
            this.f772h = m6659a(element, "height");
        }
        Element element2 = (Element) element.getElementsByTagName("image").item(0);
        if (element2 != null) {
            this.f774p = element2.getAttribute("source");
        }
        Element element3 = (Element) element.getElementsByTagName("properties").item(0);
        if (element3 != null && (elementsByTagName = element3.getElementsByTagName("property")) != null) {
            this.f779n = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element4 = (Element) elementsByTagName.item(i);
                String attribute = element4.getAttribute("name");
                if (element4.hasAttribute("value")) {
                    textContent = element4.getAttribute("value");
                } else {
                    textContent = element4.getTextContent();
                }
                this.f779n.setProperty(attribute, textContent);
            }
        }
        if (element.hasAttribute("gid")) {
            this.f776k = Integer.parseInt(element.getAttribute("gid"));
            this.f777l = c0173b.m6649a(this.f776k);
            if (this.f777l != null) {
                this.f777l.f964p = true;
                this.f777l.f966r = true;
                this.f778m = this.f776k - this.f777l.f960l;
            } else {
                throw new RuntimeException("Unable to decode base 64 block, could not find tileId:" + this.f776k);
            }
        }
        Properties properties = this.f779n;
        this.f775j = new RectF(this.f769e, this.f770f, this.f769e + this.f771g, this.f770f + this.f772h);
        c0173b.m6641a(this.f775j);
        this.f769e = this.f775j.f234a;
        this.f770f = this.f775j.f235b;
        this.f771g = this.f775j.m7190b();
        this.f772h = this.f775j.m7186c();
        float m7184d = this.f775j.m7184d();
        float m7183e = this.f775j.m7183e();
        String attribute2 = element.getAttribute("type");
        if (attribute2 != null && !attribute2.equals(VariableScope.nullOrMissingString) && !attribute2.equals("unit") && !attribute2.equals("comment") && !c0182i.f944b.equalsIgnoreCase("triggers")) {
            m6655d("Triggers should be on triggers layer");
        }
        if (properties != null) {
            String property = properties.getProperty("unit");
            String property2 = properties.getProperty("customUnit");
            if (property != null || property2 != null) {
                String property3 = properties.getProperty("team");
                if (property3 == null) {
                    throw new C0179f("Unit object team missing for:" + (property != null ? property : property2));
                }
                if ("none".equalsIgnoreCase(property3)) {
                    m6317k = Team.m6317k(-1);
                } else {
                    try {
                        m6317k = Team.m6317k(Integer.valueOf(property3).intValue());
                        if (m6317k == null) {
                            GameEngine.m1144b("map", "Unit object without team:" + property + " (skipping unit)");
                            return;
                        } else if (m6317k.m6374b()) {
                            GameEngine.m1144b("map", "Unit team is marked as spectator:" + property + " (skipping unit)");
                            return;
                        }
                    } catch (NumberFormatException e) {
                        throw new C0179f("Unit object team invalid: " + e.getMessage(), e);
                    }
                }
                if (property2 != null) {
                    C0453l m4713n = C0453l.m4713n(property2);
                    if (m4713n == null) {
                        throw new C0179f("Could not find custom unit of:" + property2 + " at x:" + this.f769e + ", y:" + this.f770f);
                    }
                    InterfaceC0303as m4738c = C0453l.m4738c(m4713n);
                    if (m4738c != null) {
                        if (m4738c instanceof C0453l) {
                            m4713n = (C0453l) m4738c;
                        } else {
                            GameEngine.m1145b("replacement not a custom unit:" + m4738c.mo5706i());
                        }
                    }
                    mo5717a = C0453l.m4747a(false, m4713n);
                    if (mo5717a == null) {
                        throw new RuntimeException("Metadata unit is null for:" + property2);
                    }
                } else {
                    InterfaceC0303as m5734a = UnitType.m5734a(property);
                    if (m5734a != null) {
                        mo5717a = m5734a.mo5717a();
                    } else {
                        throw new C0179f("Could not find unit type of:" + property + " at x:" + this.f769e + ", y:" + this.f770f);
                    }
                }
                mo5717a.f6951ek = m7184d;
                mo5717a.f6952el = m7183e;
                if (!mo5717a.m5867bI()) {
                    mo5717a.mo3057h(this.f773i);
                }
                if (m6317k != null) {
                    mo5717a.mo3120b(m6317k);
                    if (properties.getProperty("type") != null) {
                        mo5717a.setType(properties.getProperty("type"));
                    }
                    if (properties.getProperty("randomRotate") != null && !mo5717a.m5867bI()) {
                        mo5717a.mo3057h(CommonUtils.m2346a(mo5717a, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    }
                    mo5717a.f1600bN = "builder".equalsIgnoreCase(property) || "builder".equalsIgnoreCase(property2);
                    mo5717a.f1601bO = "commandCenter".equalsIgnoreCase(property) || "commandCenter".equalsIgnoreCase(property2);
                    mo5717a.f1598bL = true;
                    mo5717a.mo4207n();
                    Team.m6353c(mo5717a);
                    AbstractC1120w.m459dJ();
                    return;
                }
                throw new C0179f("team is null:" + property);
            }
        }
    }

    /* renamed from: a */
    public boolean m6663a(Unit unit) {
        return this.f775j.m7189b((int) unit.f6951ek, (int) unit.f6952el);
    }

    /* renamed from: a */
    public void m6662a(String str) {
        if (!this.f780o.contains(str)) {
            this.f780o.add(str);
        }
    }

    /* renamed from: a */
    public String[] m6664a() {
        if (this.f779n == null) {
            return C1116x.f6931h;
        }
        C1101m c1101m = new C1101m();
        Enumeration<?> propertyNames = this.f779n.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            if (!this.f780o.contains(str)) {
                c1101m.add(str);
            }
        }
        return (String[]) c1101m.toArray(C1116x.f6931h);
    }

    /* renamed from: b */
    public String m6657b(String str) {
        m6662a(str);
        if (this.f779n == null) {
            return null;
        }
        return this.f779n.getProperty(str);
    }

    /* renamed from: a */
    public String m6660a(String str, String str2) {
        m6662a(str);
        if (this.f779n == null) {
            return null;
        }
        return this.f779n.getProperty(str, str2);
    }

    /* renamed from: c */
    public Integer m6656c(String str) {
        String m6660a = m6660a(str, (String) null);
        if (m6660a == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m6660a));
        } catch (NumberFormatException e) {
            throw new C0179f(str + ": Unexpected integer value:'" + m6660a + "'");
        }
    }

    /* renamed from: a */
    public C0385az m6661a(String str, C0385az c0385az) {
        String m6660a = m6660a(str, (String) null);
        if (m6660a == null) {
            return c0385az;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0400ba(null, m6660a));
        String str2 = str + "_";
        C1101m c1101m = new C1101m();
        for (Object obj : this.f779n.keySet()) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (str3.startsWith(str2)) {
                    c1101m.add(str3);
                }
            } else {
                GameEngine.m1145b("createLocaleStringFromProperty: Non string:" + obj);
            }
        }
        Iterator it = c1101m.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            String lowerCase = str4.substring(str2.length()).toLowerCase(Locale.ROOT);
            GameEngine.m1145b("createLocaleStringFromProperty checking: " + str4);
            if (lowerCase.length() <= 4) {
                String m6657b = m6657b(str4);
                GameEngine.m1145b("createLocaleStringFromProperty got: " + m6657b);
                GameEngine.m1145b("createLocaleStringFromProperty code: " + lowerCase);
                arrayList.add(new C0400ba(lowerCase, m6657b));
            }
        }
        C0385az c0385az2 = new C0385az((C0400ba[]) arrayList.toArray(new C0400ba[0]));
        c0385az2.m5339b();
        GameEngine.m1145b("createLocaleStringFromProperty final: " + c0385az2.m5339b());
        GameEngine.m1145b("createLocaleStringFromProperty locate: " + C0820a.m1883c());
        return c0385az2;
    }

    /* renamed from: d */
    public void m6655d(String str) {
        C0831ad.m1648g("(Map trigger: " + this.f766b + ", type:" + this.f768d + "): " + str);
    }

    /* renamed from: b */
    public String m6658b() {
        return "(Map trigger: " + this.f766b + ", type:" + this.f768d + ")";
    }
}
