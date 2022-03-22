package com.corrodinggames.rts.game.p012b;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* renamed from: com.corrodinggames.rts.game.b.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/i.class */
public class C0157i {

    /* renamed from: a */
    public int f879a;

    /* renamed from: b */
    public String f880b;

    /* renamed from: c */
    public ArrayList f881c;

    /* renamed from: d */
    public int f882d;

    /* renamed from: e */
    public int f883e;

    /* renamed from: f */
    public Properties f884f;

    /* renamed from: a */
    public C0147a m3594a(String str) {
        if (this.f881c == null) {
            return null;
        }
        Iterator it = this.f881c.iterator();
        while (it.hasNext()) {
            C0147a aVar = (C0147a) it.next();
            if (str.equalsIgnoreCase(aVar.f710b)) {
                return aVar;
            }
        }
        return null;
    }

    public C0157i(Element element, C0148b bVar) {
        NodeList elementsByTagName;
        this.f880b = element.getAttribute("name");
        if (element.hasAttribute("width")) {
            this.f882d = Integer.parseInt(element.getAttribute("width"));
        }
        if (element.hasAttribute("height")) {
            this.f883e = Integer.parseInt(element.getAttribute("height"));
        }
        this.f881c = new ArrayList();
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (!(element2 == null || (elementsByTagName = element2.getElementsByTagName("property")) == null)) {
            this.f884f = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element3 = (Element) elementsByTagName.item(i);
                this.f884f.setProperty(element3.getAttribute("name"), element3.getAttribute("value"));
            }
        }
        NodeList elementsByTagName2 = element.getElementsByTagName("object");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            C0147a aVar = new C0147a((Element) elementsByTagName2.item(i2), bVar, this);
            aVar.f709a = i2;
            this.f881c.add(aVar);
        }
    }
}
