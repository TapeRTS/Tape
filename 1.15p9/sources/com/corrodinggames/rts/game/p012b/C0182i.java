package com.corrodinggames.rts.game.p012b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* renamed from: com.corrodinggames.rts.game.b.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/i.class */
public class C0182i {

    /* renamed from: a */
    public int f943a;

    /* renamed from: b */
    public String f944b;

    /* renamed from: c */
    public ArrayList f945c;

    /* renamed from: d */
    public int f946d;

    /* renamed from: e */
    public int f947e;

    /* renamed from: f */
    public Properties f948f;

    /* renamed from: a */
    public C0172a m5779a(String str) {
        if (this.f945c != null) {
            Iterator it = this.f945c.iterator();
            while (it.hasNext()) {
                C0172a c0172a = (C0172a) it.next();
                if (str.equalsIgnoreCase(c0172a.f766b)) {
                    return c0172a;
                }
            }
            return null;
        }
        return null;
    }

    public C0182i(Element element, C0173b c0173b) {
        NodeList elementsByTagName;
        this.f944b = element.getAttribute("name");
        if (element.hasAttribute("width")) {
            this.f946d = Integer.parseInt(element.getAttribute("width"));
        }
        if (element.hasAttribute("height")) {
            this.f947e = Integer.parseInt(element.getAttribute("height"));
        }
        this.f945c = new ArrayList();
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (element2 != null && (elementsByTagName = element2.getElementsByTagName("property")) != null) {
            this.f948f = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element3 = (Element) elementsByTagName.item(i);
                this.f948f.setProperty(element3.getAttribute("name"), element3.getAttribute("value"));
            }
        }
        NodeList elementsByTagName2 = element.getElementsByTagName("object");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            C0172a c0172a = new C0172a((Element) elementsByTagName2.item(i2), c0173b, this);
            c0172a.f765a = i2;
            this.f945c.add(c0172a);
        }
    }
}
