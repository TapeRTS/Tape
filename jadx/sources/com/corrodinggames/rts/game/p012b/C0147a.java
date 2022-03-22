package com.corrodinggames.rts.game.p012b;

import android.graphics.RectF;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.game.units.custom.C0311ag;
import com.corrodinggames.rts.game.units.custom.C0312ah;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0850x;
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
public class C0147a {

    /* renamed from: a */
    public int f709a;

    /* renamed from: b */
    public String f710b;

    /* renamed from: c */
    public String f711c;

    /* renamed from: d */
    public String f712d;

    /* renamed from: e */
    public float f713e;

    /* renamed from: f */
    public float f714f;

    /* renamed from: g */
    public float f715g;

    /* renamed from: h */
    public float f716h;

    /* renamed from: i */
    public float f717i;

    /* renamed from: p */
    private String f718p;

    /* renamed from: j */
    public RectF f719j;

    /* renamed from: k */
    public int f720k;

    /* renamed from: l */
    public C0158j f721l;

    /* renamed from: m */
    public int f722m;

    /* renamed from: n */
    public Properties f723n;

    /* renamed from: o */
    public C0835m f724o = new C0835m();

    public C0147a(Element element, C0148b bVar, C0157i iVar) {
        AbstractC0171m n;
        AbstractC0210af afVar;
        NodeList elementsByTagName;
        String str;
        this.f720k = -1;
        this.f722m = -1;
        this.f710b = element.getAttribute("name");
        if (this.f710b != null) {
            this.f711c = this.f710b.trim().toLowerCase(Locale.ENGLISH);
        }
        this.f712d = element.getAttribute("type");
        this.f713e = Float.parseFloat(element.getAttribute("x"));
        this.f714f = Float.parseFloat(element.getAttribute("y"));
        if (element.hasAttribute("rotation")) {
            this.f717i = Float.parseFloat(element.getAttribute("rotation")) - 90.0f;
        }
        if (!element.getAttribute("width").equals("")) {
            this.f715g = Float.parseFloat(element.getAttribute("width"));
        }
        if (!element.getAttribute("height").equals("")) {
            this.f716h = Float.parseFloat(element.getAttribute("height"));
        }
        Element element2 = (Element) element.getElementsByTagName("image").item(0);
        if (element2 != null) {
            this.f718p = element2.getAttribute("source");
        }
        Element element3 = (Element) element.getElementsByTagName("properties").item(0);
        if (!(element3 == null || (elementsByTagName = element3.getElementsByTagName("property")) == null)) {
            this.f723n = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element4 = (Element) elementsByTagName.item(i);
                String attribute = element4.getAttribute("name");
                if (element4.hasAttribute("value")) {
                    str = element4.getAttribute("value");
                } else {
                    str = element4.getTextContent();
                }
                this.f723n.setProperty(attribute, str);
            }
        }
        if (element.hasAttribute("gid")) {
            this.f720k = Integer.parseInt(element.getAttribute("gid"));
            this.f721l = bVar.m4026a(this.f720k);
            if (this.f721l != null) {
                this.f721l.f902o = true;
                this.f721l.f904q = true;
                this.f722m = this.f720k - this.f721l.f893k;
            } else {
                throw new RuntimeException("Unable to decode base 64 block, could not find tileId:" + this.f720k);
            }
        }
        Properties properties = this.f723n;
        this.f719j = new RectF(this.f713e, this.f714f, this.f713e + this.f715g, this.f714f + this.f716h);
        bVar.m4019a(this.f719j);
        this.f713e = this.f719j.f231a;
        this.f714f = this.f719j.f232b;
        this.f715g = this.f719j.m4450b();
        this.f716h = this.f719j.m4446c();
        float d = this.f719j.m4444d();
        float e = this.f719j.m4443e();
        String attribute2 = element.getAttribute("type");
        if (attribute2 != null && !attribute2.equals("") && !attribute2.equals("unit") && !attribute2.equals("comment") && !iVar.f880b.equalsIgnoreCase("triggers")) {
            m4032d("Triggers should be on triggers layer");
        }
        if (properties != null) {
            String property = properties.getProperty("unit");
            String property2 = properties.getProperty("customUnit");
            if (!(property == null && property2 == null)) {
                String property3 = properties.getProperty("team");
                if (property3 == null) {
                    throw new C0154f("Unit object team missing for:" + (property != null ? property : property2));
                }
                if ("none".equalsIgnoreCase(property3)) {
                    n = AbstractC0171m.m3740n(-1);
                } else {
                    try {
                        n = AbstractC0171m.m3740n(Integer.valueOf(property3).intValue());
                        if (n == null) {
                            AbstractC0789l.m694b("map", "Unit object without team:" + property + " (skipping unit)");
                            return;
                        } else if (n.m3797b()) {
                            AbstractC0789l.m694b("map", "Unit team is marked as spectator:" + property + " (skipping unit)");
                            return;
                        }
                    } catch (NumberFormatException e2) {
                        throw new C0154f("Unit object team invalid: " + e2.getMessage(), e2);
                    }
                }
                if (property2 != null) {
                    C0368l l = C0368l.m2912l(property2);
                    if (l == null) {
                        throw new C0154f("Could not find custom unit of:" + property2 + " at x:" + this.f713e + ", y:" + this.f714f);
                    }
                    AbstractC0268al c = C0368l.m2933c(l);
                    if (c != null) {
                        if (c instanceof C0368l) {
                            l = (C0368l) c;
                        } else {
                            AbstractC0789l.m695b("replacement not a custom unit:" + c.mo3494i());
                        }
                    }
                    afVar = C0368l.m2940a(false, l);
                    if (afVar == null) {
                        throw new RuntimeException("Metadata unit is null for:" + property2);
                    }
                } else {
                    AbstractC0268al a = EnumC0215ak.m3521a(property);
                    if (a != null) {
                        afVar = a.mo3504a();
                    } else {
                        throw new C0154f("Could not find unit type of:" + property + " at x:" + this.f713e + ", y:" + this.f714f);
                    }
                }
                afVar.f5841dH = d;
                afVar.f5842dI = e;
                if (!afVar.mo2797bw()) {
                    afVar.mo3547h(this.f717i);
                }
                if (n != null) {
                    afVar.mo3633a(n);
                    if (properties.getProperty("type") != null) {
                        afVar.mo3622a_(properties.getProperty("type"));
                    }
                    if (properties.getProperty("randomRotate") != null && !afVar.mo2797bw()) {
                        afVar.mo3547h(C0654f.m1553a(afVar, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT));
                    }
                    afVar.f1516bt = "builder".equalsIgnoreCase(property) || "builder".equalsIgnoreCase(property2);
                    afVar.f1517bu = "commandCenter".equalsIgnoreCase(property) || "commandCenter".equalsIgnoreCase(property2);
                    afVar.f1514br = true;
                    afVar.mo2677n();
                    AbstractC0171m.m3777c(afVar);
                    AbstractC0854w.m393dq();
                    return;
                }
                throw new C0154f("team is null:" + property);
            }
        }
    }

    /* renamed from: a */
    public boolean m4039a(AbstractC0210af afVar) {
        return this.f719j.m4449b((int) afVar.f5841dH, (int) afVar.f5842dI);
    }

    /* renamed from: a */
    public void m4038a(String str) {
        if (!this.f724o.contains(str)) {
            this.f724o.add(str);
        }
    }

    /* renamed from: a */
    public String[] m4040a() {
        if (this.f723n == null) {
            return C0850x.f5821h;
        }
        C0835m mVar = new C0835m();
        Enumeration<?> propertyNames = this.f723n.propertyNames();
        while (propertyNames.hasMoreElements()) {
            String str = (String) propertyNames.nextElement();
            if (!this.f724o.contains(str)) {
                mVar.add(str);
            }
        }
        return (String[]) mVar.toArray(C0850x.f5821h);
    }

    /* renamed from: b */
    public String m4034b(String str) {
        m4038a(str);
        if (this.f723n == null) {
            return null;
        }
        return this.f723n.getProperty(str);
    }

    /* renamed from: a */
    public String m4036a(String str, String str2) {
        m4038a(str);
        if (this.f723n == null) {
            return null;
        }
        return this.f723n.getProperty(str, str2);
    }

    /* renamed from: c */
    public Integer m4033c(String str) {
        String a = m4036a(str, (String) null);
        if (a == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a));
        } catch (NumberFormatException e) {
            throw new C0154f(str + ": Unexpected integer value:'" + a + "'");
        }
    }

    /* renamed from: a */
    public C0311ag m4037a(String str, C0311ag agVar) {
        String a = m4036a(str, (String) null);
        if (a == null) {
            return agVar;
        }
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C0312ah(null, a));
        String str2 = str + "_";
        C0835m mVar = new C0835m();
        for (Object obj : this.f723n.keySet()) {
            if (obj instanceof String) {
                String str3 = (String) obj;
                if (str3.startsWith(str2)) {
                    mVar.add(str3);
                }
            }
        }
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            String str4 = (String) it.next();
            arrayList.add(new C0312ah(str4.substring(str2.length()).toLowerCase(Locale.ROOT), m4034b(str4)));
        }
        C0311ag agVar2 = new C0311ag((C0312ah[]) arrayList.toArray(new C0312ah[0]));
        agVar2.m3314b();
        return agVar2;
    }

    /* renamed from: d */
    public void m4032d(String str) {
        Hcat_Multiplaye.m1261f("(Map trigger: " + this.f710b + ", type:" + this.f712d + "): " + str);
    }

    /* renamed from: b */
    public String m4035b() {
        return "(Map trigger: " + this.f710b + ", type:" + this.f712d + ")";
    }
}
