package com.corrodinggames.rts.game.map;

import android.graphics.Rect;
import com.corrodinggames.rts.game.units.Unit;
import java.util.Properties;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/* loaded from: classes.jar:com/corrodinggames/rts/game/map/GroupObject.class */
public class GroupObject {
    public boolean activated = false;
    public int height;
    private String image;
    public int index;
    public String name;
    public Properties props;
    public Rect rect;
    public String type;
    public int width;
    public int x;
    public int y;

    public GroupObject(Element element) {
        NodeList elementsByTagName;
        this.name = element.getAttribute("name");
        this.type = element.getAttribute("type");
        this.x = Integer.parseInt(element.getAttribute("x"));
        this.y = Integer.parseInt(element.getAttribute("y"));
        if (!element.getAttribute("width").equals("")) {
            this.width = Integer.parseInt(element.getAttribute("width"));
        }
        if (!element.getAttribute("height").equals("")) {
            this.height = Integer.parseInt(element.getAttribute("height"));
        }
        Element element2 = (Element) element.getElementsByTagName("image").item(0);
        if (element2 != null) {
            this.image = element2.getAttribute("source");
        }
        Element element3 = (Element) element.getElementsByTagName("properties").item(0);
        if (!(element3 == null || (elementsByTagName = element3.getElementsByTagName("property")) == null)) {
            this.props = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element4 = (Element) elementsByTagName.item(i);
                this.props.setProperty(element4.getAttribute("name"), element4.getAttribute("value"));
            }
        }
        this.rect = new Rect(this.x, this.y, this.x + this.width, this.y + this.height);
    }

    public boolean unitIn(Unit unit) {
        return this.rect.contains((int) unit.x, (int) unit.y);
    }
}
