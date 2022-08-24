package com.corrodinggames.rts.game.p012b;

import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

/* renamed from: com.corrodinggames.rts.game.b.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/j.class */
public class C0183j {

    /* renamed from: a */
    public String f949a;

    /* renamed from: b */
    public BitmapOrTexture f950b;

    /* renamed from: c */
    public String f951c;

    /* renamed from: d */
    int f952d;

    /* renamed from: e */
    int f953e;

    /* renamed from: f */
    int f954f;

    /* renamed from: g */
    int f955g;

    /* renamed from: j */
    int f958j;

    /* renamed from: k */
    float f959k;

    /* renamed from: l */
    public int f960l;

    /* renamed from: n */
    public short f962n;

    /* renamed from: o */
    public C0173b f963o;

    /* renamed from: t */
    static String f969t = "[EMBED]";

    /* renamed from: u */
    static ArrayList f970u = new ArrayList();

    /* renamed from: h */
    int f956h = 0;

    /* renamed from: i */
    int f957i = 0;

    /* renamed from: m */
    public int f961m = Integer.MAX_VALUE;

    /* renamed from: p */
    public boolean f964p = false;

    /* renamed from: q */
    public boolean f965q = false;

    /* renamed from: r */
    public boolean f966r = false;

    /* renamed from: s */
    public boolean f967s = false;

    /* renamed from: x */
    private HashMap f968x = new HashMap();

    /* renamed from: v */
    Rect f971v = new Rect();

    /* renamed from: w */
    int f972w = -1;

    /* renamed from: a */
    public String m6529a(C0173b c0173b, Element element) {
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (element2 != null) {
            NodeList elementsByTagName = element2.getElementsByTagName("property");
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element3 = (Element) elementsByTagName.item(i);
                if (element3.getAttribute("name").equals("embedded_png")) {
                    String attribute = element3.getAttribute("value");
                    if (attribute != null && !attribute.equals(VariableScope.nullOrMissingString)) {
                        return attribute;
                    }
                    Node firstChild = element3.getFirstChild();
                    if (firstChild != null) {
                        return firstChild.getNodeValue();
                    }
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public static Element m6530a(C0173b c0173b, String str) {
        try {
            return DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(c0173b.m6601d("tilesets/", str)).getDocumentElement();
        } catch (Exception e) {
            GameEngine.getInstance().m1192a("Unable to load or parse sourced tileset: tilesets/" + str, 1);
            throw new C0179f("Unable to load or parse sourced tileset: tilesets/" + str, e);
        }
    }

    public C0183j(C0173b c0173b, String str, int i) {
        this.f963o = c0173b;
        this.f960l = i;
        Element m6530a = m6530a(c0173b, str);
        this.f949a = str;
        m6526a(m6530a);
    }

    public C0183j(C0173b c0173b, Element element) {
        this.f963o = c0173b;
        this.f960l = Integer.parseInt(element.getAttribute("firstgid"));
        String attribute = element.getAttribute("source");
        if (attribute != null && !attribute.equals(VariableScope.nullOrMissingString)) {
            element = m6530a(c0173b, attribute);
            this.f949a = attribute;
        }
        m6526a(element);
    }

    /* renamed from: a */
    public void m6526a(Element element) {
        NodeList elementsByTagName = element.getElementsByTagName("image");
        if (elementsByTagName.getLength() > 0) {
            this.f951c = GameEngine.m1111k(((Element) elementsByTagName.item(0)).getAttribute("source").trim());
        }
        String m6529a = m6529a(this.f963o, element);
        if (m6529a != null) {
            this.f951c = m6527a(m6529a, this.f951c);
        }
        if (this.f951c == null) {
            throw new C0179f("Map tileset is missing an image tag or embedded image data");
        }
        this.f952d = this.f963o.f784n;
        this.f953e = this.f963o.f785o;
        if (element.hasAttribute("tilewidth")) {
            this.f952d = Integer.parseInt(element.getAttribute("tilewidth"));
            this.f953e = Integer.parseInt(element.getAttribute("tileheight"));
        }
        if (GameEngine.m1233B()) {
            this.f952d = this.f963o.f784n;
            this.f953e = this.f963o.f785o;
        }
        int i = 0;
        if (element.hasAttribute("spacing")) {
            i = Integer.parseInt(element.getAttribute("spacing"));
        }
        this.f954f = this.f952d + i;
        this.f955g = this.f953e + i;
        NodeList elementsByTagName2 = element.getElementsByTagName("tile");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            Element element2 = (Element) elementsByTagName2.item(i2);
            int parseInt = Integer.parseInt(element2.getAttribute("id")) + this.f960l;
            Properties properties = new Properties();
            Element element3 = (Element) element2.getElementsByTagName("properties").item(0);
            if (element3 != null) {
                NodeList elementsByTagName3 = element3.getElementsByTagName("property");
                for (int i3 = 0; i3 < elementsByTagName3.getLength(); i3++) {
                    Element element4 = (Element) elementsByTagName3.item(i3);
                    String attribute = element4.getAttribute("name");
                    String attribute2 = element4.getAttribute("value");
                    if ("unit".equalsIgnoreCase(attribute) || "customUnit".equalsIgnoreCase(attribute)) {
                        this.f967s = true;
                    }
                    properties.setProperty(attribute, attribute2);
                }
            }
            this.f968x.put(new Integer(parseInt), properties);
        }
    }

    /* renamed from: a */
    public static String m6527a(String str, String str2) {
        Iterator it = f970u.iterator();
        while (it.hasNext()) {
            C0184k c0184k = (C0184k) it.next();
            if (str.equalsIgnoreCase(c0184k.f978f)) {
                return c0184k.f976d;
            }
        }
        C0184k c0184k2 = new C0184k();
        c0184k2.f974b = false;
        c0184k2.f977e = null;
        c0184k2.f978f = str;
        c0184k2.f975c = f969t;
        c0184k2.f976d = f969t + C0184k.f973a;
        c0184k2.f979g = str2;
        C0184k.f973a++;
        f970u.add(c0184k2);
        return c0184k2.f976d;
    }

    /* renamed from: a */
    public static BitmapOrTexture m6528a(String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        String str2 = "tilesets/bitmaps/";
        if (str.startsWith(f969t)) {
            str2 = f969t;
        }
        C0184k c0184k = null;
        Iterator it = f970u.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0184k c0184k2 = (C0184k) it.next();
            if (str.equalsIgnoreCase(c0184k2.f976d) && str2.equalsIgnoreCase(c0184k2.f975c)) {
                c0184k = c0184k2;
                break;
            }
        }
        if (c0184k != null) {
            if (c0184k.f978f != null) {
                try {
                    BitmapOrTexture mo904a = gameEngine.graphics.mo904a((InputStream) new BufferedInputStream(C0178e.m6555a(c0184k.f978f, "base64", VariableScope.nullOrMissingString)), false);
                    if (mo904a == null) {
                        throw new C0179f("Embedded tilesetBitmap is null for: " + str);
                    }
                    c0184k.f977e = mo904a;
                    c0184k.f978f = null;
                } catch (RuntimeException e) {
                    e.printStackTrace();
                    throw new C0179f("Error loading embedded base64 image:" + c0184k.f979g + " - " + e.getMessage());
                }
            }
            c0184k.f974b = true;
            return c0184k.f977e;
        }
        try {
            InputStream m6601d = gameEngine.f6104bL.m6601d(str2, str);
            BitmapOrTexture mo904a2 = gameEngine.graphics.mo904a(m6601d, false);
            if (m6601d != null) {
                try {
                    m6601d.close();
                } catch (IOException e2) {
                    e2.printStackTrace();
                }
            }
            if (mo904a2 == null) {
                throw new RuntimeException("tilesetBitmap is null for: " + str);
            }
            mo904a2.m1041a("tilesets/" + str);
            C0184k c0184k3 = new C0184k();
            c0184k3.f974b = true;
            c0184k3.f977e = mo904a2;
            c0184k3.f975c = str2;
            c0184k3.f976d = str;
            f970u.add(c0184k3);
            return c0184k3.f977e;
        } catch (IOException e3) {
            throw new C0179f("Image file could not be found or loaded: " + str2 + str, e3);
        }
    }

    /* renamed from: a */
    public static void m6534a() {
        Iterator it = f970u.iterator();
        while (it.hasNext()) {
            ((C0184k) it.next()).f974b = false;
        }
    }

    /* renamed from: b */
    public static void m6525b() {
        Iterator it = f970u.iterator();
        while (it.hasNext()) {
            C0184k c0184k = (C0184k) it.next();
            if (!c0184k.f974b) {
                if (c0184k.f977e != null) {
                    c0184k.f977e.mo394o();
                    c0184k.f977e = null;
                }
                c0184k.f978f = null;
                it.remove();
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public void m6522c() {
        this.f950b = m6528a(this.f951c);
        this.f958j = this.f950b.mo396m() / this.f954f;
        if (this.f958j == 0) {
            this.f958j = 1;
        }
        this.f959k = 1.0f / this.f958j;
    }

    /* renamed from: a */
    public Properties m6533a(int i) {
        return (Properties) this.f968x.get(new Integer(i));
    }

    /* renamed from: a */
    public final void m6531a(int i, Rect rect) {
        int i2 = i % this.f958j;
        int i3 = (int) (i * this.f959k);
        int i4 = this.f956h + (i2 * this.f954f);
        int i5 = this.f957i + (i3 * this.f955g);
        rect.f230a = i4;
        rect.f231b = i5;
        rect.f232c = i4 + this.f952d;
        rect.f233d = i5 + this.f953e;
    }

    /* renamed from: b */
    public final Rect m6524b(int i) {
        if (this.f972w == i) {
            return this.f971v;
        }
        this.f972w = i;
        m6531a(i, this.f971v);
        return this.f971v;
    }

    /* renamed from: c */
    public void m6521c(int i) {
        this.f961m = i;
    }

    /* renamed from: d */
    public boolean m6519d(int i) {
        return i >= this.f960l && i <= this.f961m;
    }

    /* renamed from: d */
    public void m6520d() {
        this.f950b = null;
        this.f963o = null;
        this.f968x = null;
    }

    /* renamed from: b */
    public Integer m6523b(String str, String str2) {
        for (Map.Entry entry : this.f968x.entrySet()) {
            Integer num = (Integer) entry.getKey();
            String property = ((Properties) entry.getValue()).getProperty(str);
            if (property != null && property.equals(str2)) {
                return num;
            }
        }
        return null;
    }

    /* renamed from: a */
    public int m6532a(int i, int i2) {
        int mo396m;
        if (this.f950b == null) {
            GameEngine.PrintLog("getIndexOffsetByPosition tilesetBitmap == null");
            mo396m = 3;
        } else if (this.f952d == 0) {
            GameEngine.PrintLog("getIndexOffsetByPosition tileWidth==0");
            mo396m = 3;
        } else {
            mo396m = this.f950b.mo396m() / this.f952d;
        }
        return i + (i2 * mo396m);
    }
}
