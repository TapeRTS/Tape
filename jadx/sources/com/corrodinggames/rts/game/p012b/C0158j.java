package com.corrodinggames.rts.game.p012b;

import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
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
public class C0158j {

    /* renamed from: a */
    public C0748e f885a;

    /* renamed from: b */
    public String f886b;

    /* renamed from: c */
    int f887c;

    /* renamed from: d */
    int f888d;

    /* renamed from: e */
    int f889e;

    /* renamed from: f */
    int f890f;

    /* renamed from: i */
    int f893i;

    /* renamed from: j */
    float f894j;

    /* renamed from: k */
    public int f895k;

    /* renamed from: m */
    public short f897m;

    /* renamed from: n */
    public C0148b f898n;

    /* renamed from: r */
    public boolean f902r;

    /* renamed from: s */
    static String f904s = "[EMBED]";

    /* renamed from: t */
    static ArrayList f905t = new ArrayList();

    /* renamed from: g */
    int f891g = 0;

    /* renamed from: h */
    int f892h = 0;

    /* renamed from: l */
    public int f896l = Integer.MAX_VALUE;

    /* renamed from: o */
    public boolean f899o = false;

    /* renamed from: p */
    public boolean f900p = false;

    /* renamed from: q */
    public boolean f901q = false;

    /* renamed from: w */
    private HashMap f903w = new HashMap();

    /* renamed from: u */
    Rect f906u = new Rect();

    /* renamed from: v */
    int f907v = -1;

    /* renamed from: a */
    public String m3590a(C0148b bVar, Element element) {
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (element2 == null) {
            return null;
        }
        NodeList elementsByTagName = element2.getElementsByTagName("property");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element3 = (Element) elementsByTagName.item(i);
            if (element3.getAttribute("name").equals("embedded_png")) {
                String attribute = element3.getAttribute("value");
                if (!(attribute == null || attribute.equals(""))) {
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

    public C0158j(C0148b bVar, Element element) {
        this.f902r = false;
        this.f898n = bVar;
        this.f895k = Integer.parseInt(element.getAttribute("firstgid"));
        String attribute = element.getAttribute("source");
        if (attribute != null && !attribute.equals("")) {
            try {
                element = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(bVar.m3654d("tilesets/", attribute)).getDocumentElement();
            } catch (Exception e) {
                AbstractC0789l.m638u().m718a("Unable to load or parse sourced tileset: tilesets/" + attribute, 1);
                throw new C0154f("Unable to load or parse sourced tileset: tilesets/" + attribute, e);
            }
        }
        NodeList elementsByTagName = element.getElementsByTagName("image");
        if (elementsByTagName.getLength() > 0) {
            this.f886b = AbstractC0789l.m651j(((Element) elementsByTagName.item(0)).getAttribute("source").trim());
        }
        String a = m3590a(bVar, element);
        if (a != null) {
            this.f886b = m3588a(a, this.f886b);
        }
        if (this.f886b == null) {
            throw new C0154f("Map tileset is missing an image tag or embedded image data");
        }
        this.f887c = bVar.f735k;
        this.f888d = bVar.f736l;
        if (element.hasAttribute("tilewidth")) {
            this.f887c = Integer.parseInt(element.getAttribute("tilewidth"));
            this.f888d = Integer.parseInt(element.getAttribute("tileheight"));
        }
        if (AbstractC0789l.m637v()) {
            this.f887c = bVar.f735k;
            this.f888d = bVar.f736l;
        }
        int parseInt = element.hasAttribute("spacing") ? Integer.parseInt(element.getAttribute("spacing")) : 0;
        this.f889e = this.f887c + parseInt;
        this.f890f = this.f888d + parseInt;
        NodeList elementsByTagName2 = element.getElementsByTagName("tile");
        for (int i = 0; i < elementsByTagName2.getLength(); i++) {
            Element element2 = (Element) elementsByTagName2.item(i);
            int parseInt2 = Integer.parseInt(element2.getAttribute("id")) + this.f895k;
            Properties properties = new Properties();
            Element element3 = (Element) element2.getElementsByTagName("properties").item(0);
            if (element3 != null) {
                NodeList elementsByTagName3 = element3.getElementsByTagName("property");
                for (int i2 = 0; i2 < elementsByTagName3.getLength(); i2++) {
                    Element element4 = (Element) elementsByTagName3.item(i2);
                    String attribute2 = element4.getAttribute("name");
                    String attribute3 = element4.getAttribute("value");
                    if ("unit".equalsIgnoreCase(attribute2) || "customUnit".equalsIgnoreCase(attribute2)) {
                        this.f902r = true;
                    }
                    properties.setProperty(attribute2, attribute3);
                }
            }
            this.f903w.put(new Integer(parseInt2), properties);
        }
    }

    /* renamed from: a */
    public static String m3588a(String str, String str2) {
        Iterator it = f905t.iterator();
        while (it.hasNext()) {
            C0159k kVar = (C0159k) it.next();
            if (str.equalsIgnoreCase(kVar.f913f)) {
                return kVar.f911d;
            }
        }
        C0159k kVar2 = new C0159k();
        kVar2.f909b = false;
        kVar2.f912e = null;
        kVar2.f913f = str;
        kVar2.f910c = f904s;
        kVar2.f911d = f904s + C0159k.f908a;
        kVar2.f914g = str2;
        C0159k.f908a++;
        f905t.add(kVar2);
        return kVar2.f911d;
    }

    /* renamed from: a */
    public static C0748e m3589a(String str) {
        AbstractC0789l u = AbstractC0789l.m638u();
        String str2 = "tilesets/bitmaps/";
        if (str.startsWith(f904s)) {
            str2 = f904s;
        }
        C0159k kVar = null;
        Iterator it = f905t.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            C0159k kVar2 = (C0159k) it.next();
            if (str.equalsIgnoreCase(kVar2.f911d) && str2.equalsIgnoreCase(kVar2.f910c)) {
                kVar = kVar2;
                break;
            }
        }
        if (kVar != null) {
            if (kVar.f913f != null) {
                try {
                    C0748e a = u.f5514bw.mo160a((InputStream) new BufferedInputStream(C0153e.m3613a(kVar.f913f, "base64", "")), false);
                    if (a == null) {
                        throw new C0154f("Embedded tilesetBitmap is null for: " + str);
                    }
                    kVar.f912e = a;
                    kVar.f913f = null;
                } catch (RuntimeException e) {
                    e.printStackTrace();
                    throw new C0154f("Error loading embedded base64 image:" + kVar.f914g + " - " + e.getMessage());
                }
            }
            kVar.f909b = true;
            return kVar.f912e;
        }
        try {
            C0748e a2 = u.f5514bw.mo160a(u.f5511bt.m3654d(str2, str), false);
            if (a2 == null) {
                throw new RuntimeException("tilesetBitmap is null for: " + str);
            }
            a2.f5238d = "tilesets/" + str;
            C0159k kVar3 = new C0159k();
            kVar3.f909b = true;
            kVar3.f912e = a2;
            kVar3.f910c = str2;
            kVar3.f911d = str;
            f905t.add(kVar3);
            return kVar3.f912e;
        } catch (IOException e2) {
            throw new C0154f("Image file could not be found or loaded: " + str2 + str, e2);
        }
    }

    /* renamed from: a */
    public static void m3593a() {
        Iterator it = f905t.iterator();
        while (it.hasNext()) {
            ((C0159k) it.next()).f909b = false;
        }
    }

    /* renamed from: b */
    public static void m3587b() {
        Iterator it = f905t.iterator();
        while (it.hasNext()) {
            C0159k kVar = (C0159k) it.next();
            if (!kVar.f909b) {
                if (kVar.f912e != null) {
                    kVar.f912e.mo48n();
                    kVar.f912e = null;
                }
                kVar.f913f = null;
                it.remove();
            }
        }
    }

    /* renamed from: c */
    void m3584c() {
        this.f885a = m3589a(this.f886b);
        this.f893i = this.f885a.mo349l() / this.f889e;
        if (this.f893i == 0) {
            this.f893i = 1;
        }
        this.f894j = 1.0f / this.f893i;
    }

    /* renamed from: a */
    public Properties m3592a(int i) {
        return (Properties) this.f903w.get(new Integer(i));
    }

    /* renamed from: a */
    public final void m3591a(int i, Rect rect) {
        int i2 = i % this.f893i;
        int i3 = (int) (i * this.f894j);
        int i4 = this.f891g + (i2 * this.f889e);
        int i5 = this.f892h + (i3 * this.f890f);
        rect.f227a = i4;
        rect.f228b = i5;
        rect.f229c = i4 + this.f887c;
        rect.f230d = i5 + this.f888d;
    }

    /* renamed from: b */
    public final Rect m3586b(int i) {
        if (this.f907v == i) {
            return this.f906u;
        }
        this.f907v = i;
        m3591a(i, this.f906u);
        return this.f906u;
    }

    /* renamed from: c */
    public void m3583c(int i) {
        this.f896l = i;
    }

    /* renamed from: d */
    public boolean m3581d(int i) {
        return i >= this.f895k && i <= this.f896l;
    }

    /* renamed from: d */
    public void m3582d() {
        this.f885a = null;
        this.f898n = null;
        this.f903w = null;
    }

    /* renamed from: b */
    public Integer m3585b(String str, String str2) {
        for (Map.Entry entry : this.f903w.entrySet()) {
            Integer num = (Integer) entry.getKey();
            String property = ((Properties) entry.getValue()).getProperty(str);
            if (property != null && property.equals(str2)) {
                return num;
            }
        }
        return null;
    }
}
