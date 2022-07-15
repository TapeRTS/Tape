package com.corrodinggames.rts.game.map;

import android.graphics.RectF;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0373az;
import com.corrodinggames.rts.game.units.custom.C0433j;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.TextWrapper;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.utility.EmptyArray;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
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
public class GroupObject {

    /* renamed from: a */
    public int index;

    /* renamed from: b */
    public String name;

    /* renamed from: c */
    public String f750c;

    /* renamed from: d */
    public String type;

    /* renamed from: e */
    public float x;

    /* renamed from: f */
    public float y;

    /* renamed from: g */
    public float f754g;

    /* renamed from: h */
    public float f755h;

    /* renamed from: i */
    public float f756i;

    /* renamed from: p */
    private String image;

    /* renamed from: j */
    public RectF f757j;

    /* renamed from: k */
    public int tile_gid;

    /* renamed from: l */
    public TileSet f759l;

    /* renamed from: m */
    public int f760m;

    /* renamed from: n */
    public Properties props;

    /* renamed from: o */
    public ObjectVector f762o = new ObjectVector();

    /* renamed from: a */
    static float m4175a(Element element, String str) {
        String attribute = element.getAttribute(str);
        try {
            return Float.parseFloat(attribute);
        } catch (NumberFormatException e) {
            throw new C0173f("Invalid map: Error reading '" + str + "' invalid float: " + attribute, e);
        }
    }

    public GroupObject(Element element, Map map, ObjectGroup objectGroup) {
        Team team;
        C0433j c0433j;
        NodeList properties;
        String str;
        this.tile_gid = -1;
        this.f760m = -1;
        this.name = element.getAttribute("name");
        if (this.name != null) {
            this.f750c = this.name.trim().toLowerCase(Locale.ENGLISH);
        }
        this.type = element.getAttribute("type");
        this.x = Float.parseFloat(element.getAttribute("x"));
        this.y = Float.parseFloat(element.getAttribute("y"));
        if (element.hasAttribute("rotation")) {
            this.f756i = Float.parseFloat(element.getAttribute("rotation")) - 90.0f;
        }
        if (!element.getAttribute("width").equals(VariableScope.nullOrMissingString)) {
            this.f754g = m4175a(element, "width");
        }
        if (!element.getAttribute("height").equals(VariableScope.nullOrMissingString)) {
            this.f755h = m4175a(element, "height");
        }
        Element imageElement = (Element) element.getElementsByTagName("image").item(0);
        if (imageElement != null) {
            this.image = imageElement.getAttribute("source");
        }
        Element propsElement = (Element) element.getElementsByTagName("properties").item(0);
        if (propsElement != null && (properties = propsElement.getElementsByTagName("property")) != null) {
            this.props = new Properties();
            for (int i = 0; i < properties.getLength(); i++) {
                Element element2 = (Element) properties.item(i);
                String attribute = element2.getAttribute("name");
                if (element2.hasAttribute("value")) {
                    str = element2.getAttribute("value");
                } else {
                    str = element2.getTextContent();
                }
                this.props.setProperty(attribute, str);
            }
        }
        if (element.hasAttribute("gid")) {
            this.tile_gid = Integer.parseInt(element.getAttribute("gid"));
            this.f759l = map.m4165a(this.tile_gid);
            if (this.f759l != null) {
                this.f759l.f944o = true;
                this.f759l.f946q = true;
                this.f760m = this.tile_gid - this.f759l.firstGID;
            } else {
                throw new RuntimeException("Unable to decode base 64 block, could not find tileId:" + this.tile_gid);
            }
        }
        Properties properties2 = this.props;
        this.f757j = new RectF(this.x, this.y, this.x + this.f754g, this.y + this.f755h);
        map.m4157a(this.f757j);
        this.x = this.f757j.left;
        this.y = this.f757j.top;
        this.f754g = this.f757j.m4647b();
        this.f755h = this.f757j.m4643c();
        float m4641d = this.f757j.m4641d();
        float m4640e = this.f757j.m4640e();
        String attribute2 = element.getAttribute("type");
        if (attribute2 != null && !attribute2.equals(VariableScope.nullOrMissingString) && !attribute2.equals("unit") && !attribute2.equals("comment") && !objectGroup.name.equalsIgnoreCase("triggers")) {
            m4171d("Triggers should be on triggers layer");
        }
        if (properties2 != null) {
            String property = properties2.getProperty("unit");
            String property2 = properties2.getProperty("customUnit");
            if (property != null || property2 != null) {
                String property3 = properties2.getProperty("team");
                if (property3 == null) {
                    throw new C0173f("Unit object team missing for:" + (property != null ? property : property2));
                }
                if ("none".equalsIgnoreCase(property3)) {
                    team = Team.getTeam(-1);
                } else {
                    try {
                        team = Team.getTeam(Integer.valueOf(property3).intValue());
                        if (team == null) {
                            GameEngine.log("map", "Unit object without team:" + property + " (skipping unit)");
                            return;
                        } else if (team.m3945b()) {
                            GameEngine.log("map", "Unit team is marked as spectator:" + property + " (skipping unit)");
                            return;
                        }
                    } catch (NumberFormatException e) {
                        throw new C0173f("Unit object team invalid: " + e.getMessage(), e);
                    }
                }
                if (property2 != null) {
                    CustomUnitMetadata m3080l = CustomUnitMetadata.m3080l(property2);
                    if (m3080l == null) {
                        throw new C0173f("Could not find custom unit of:" + property2 + " at x:" + this.x + ", y:" + this.y);
                    }
                    UnitType m3101c = CustomUnitMetadata.m3101c(m3080l);
                    if (m3101c != null) {
                        if (m3101c instanceof CustomUnitMetadata) {
                            m3080l = (CustomUnitMetadata) m3101c;
                        } else {
                            GameEngine.log("replacement not a custom unit:" + m3101c.mo3087i());
                        }
                    }
                    c0433j = CustomUnitMetadata.m3109a(false, m3080l);
                    if (c0433j == null) {
                        throw new RuntimeException("Metadata unit is null for:" + property2);
                    }
                } else {
                    UnitType m3709a = com.corrodinggames.rts.game.units.UnitType.m3709a(property);
                    if (m3709a != null) {
                        c0433j = m3709a.createUnit();
                    } else {
                        throw new C0173f("Could not find unit type of:" + property + " at x:" + this.x + ", y:" + this.y);
                    }
                }
                c0433j.x = m4641d;
                c0433j.y = m4640e;
                if (!c0433j.mo2975bH()) {
                    c0433j.mo2475h(this.f756i);
                }
                if (team != null) {
                    c0433j.mo2537b(team);
                    if (properties2.getProperty("type") != null) {
                        c0433j.type(properties2.getProperty("type"));
                    }
                    if (properties2.getProperty("randomRotate") != null && !c0433j.mo2975bH()) {
                        c0433j.mo2475h(CommonUtils.m1723a(c0433j, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    }
                    c0433j.f1605bG = "builder".equalsIgnoreCase(property) || "builder".equalsIgnoreCase(property2);
                    c0433j.f1606bH = "commandCenter".equalsIgnoreCase(property) || "commandCenter".equalsIgnoreCase(property2);
                    c0433j.f1603bE = true;
                    c0433j.mo2861n();
                    Team.m3924c(c0433j);
                    GameObject.m421dG();
                    return;
                }
                throw new C0173f("team is null:" + property);
            }
        }
    }

    /* renamed from: a */
    public boolean m4179a(Unit unit) {
        return this.f757j.m4646b((int) unit.x, (int) unit.y);
    }

    /* renamed from: a */
    public void m4178a(String str) {
        if (!this.f762o.contains(str)) {
            this.f762o.add(str);
        }
    }

    /* renamed from: a */
    public String[] m4180a() {
        if (this.props == null) {
            return EmptyArray.STRING;
        }
        ObjectVector objectVector = new ObjectVector();
        Enumeration<?> propertyNames = this.props.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            if (!this.f762o.contains(str)) {
                objectVector.add(str);
            }
        }
        return (String[]) objectVector.toArray(EmptyArray.STRING);
    }

    /* renamed from: b */
    public String getProperty(String str) {
        m4178a(str);
        if (this.props == null) {
            return null;
        }
        return this.props.getProperty(str);
    }

    /* renamed from: a */
    public String m4176a(String str, String str2) {
        m4178a(str);
        if (this.props == null) {
            return null;
        }
        return this.props.getProperty(str, str2);
    }

    /* renamed from: c */
    public Integer m4172c(String str) {
        String m4176a = m4176a(str, (String) null);
        if (m4176a == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m4176a));
        } catch (NumberFormatException e) {
            throw new C0173f(str + ": Unexpected integer value:'" + m4176a + "'");
        }
    }

    /* renamed from: a */
    public TextWrapper m4177a(String str, TextWrapper textWrapper) {
        String m4176a = m4176a(str, (String) null);
        if (m4176a == null) {
            return textWrapper;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0373az(null, m4176a));
        String str2 = str + "_";
        ObjectVector objectVector = new ObjectVector();
        for (Object obj : this.props.keySet()) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (str3.startsWith(str2)) {
                    objectVector.add(str3);
                }
            } else {
                GameEngine.log("createLocaleStringFromProperty: Non string:" + obj);
            }
        }
        Iterator it = objectVector.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            String lowerCase = str4.substring(str2.length()).toLowerCase(Locale.ROOT);
            GameEngine.log("createLocaleStringFromProperty checking: " + str4);
            if (lowerCase.length() <= 4) {
                String property = getProperty(str4);
                GameEngine.log("createLocaleStringFromProperty got: " + property);
                GameEngine.log("createLocaleStringFromProperty code: " + lowerCase);
                arrayList.add(new C0373az(lowerCase, property));
            }
        }
        TextWrapper textWrapper2 = new TextWrapper((C0373az[]) arrayList.toArray(new C0373az[0]));
        textWrapper2.m3488b();
        GameEngine.log("createLocaleStringFromProperty final: " + textWrapper2.m3488b());
        GameEngine.log("createLocaleStringFromProperty locate: " + LangLocale.getLocalLanguage());
        return textWrapper2;
    }

    /* renamed from: d */
    public void m4171d(String str) {
        NetworkEngine.reportDesync("(Map trigger: " + this.name + ", type:" + this.type + "): " + str);
    }

    /* renamed from: b */
    public String m4174b() {
        return "(Map trigger: " + this.name + ", type:" + this.type + ")";
    }
}