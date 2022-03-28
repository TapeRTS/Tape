package com.corrodinggames.rts.game.map;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/* loaded from: classes.jar:com/corrodinggames/rts/game/map/ObjectGroup.class */
public class ObjectGroup {
    public int height;
    public int index;
    public String name;
    public ArrayList<GroupObject> objects = new ArrayList<>();
    public Properties props;
    public int width;

    public ObjectGroup(Element element) {
        NodeList elementsByTagName;
        this.name = element.getAttribute("name");
        this.width = Integer.parseInt(element.getAttribute("width"));
        this.height = Integer.parseInt(element.getAttribute("height"));
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (!(element2 == null || (elementsByTagName = element2.getElementsByTagName("property")) == null)) {
            this.props = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element3 = (Element) elementsByTagName.item(i);
                this.props.setProperty(element3.getAttribute("name"), element3.getAttribute("value"));
            }
        }
        NodeList elementsByTagName2 = element.getElementsByTagName("object");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            GroupObject groupObject = new GroupObject((Element) elementsByTagName2.item(i2));
            groupObject.index = i2;
            this.objects.add(groupObject);
        }
    }

    public GroupObject getGroupObjectByName(String str) {
        GroupObject groupObject;
        if (this.objects != null) {
            Iterator<GroupObject> it = this.objects.iterator();
            while (it.hasNext()) {
                GroupObject next = it.next();
                if (str.equalsIgnoreCase(next.name)) {
                    groupObject = next;
                    break;
                }
            }
        }
        groupObject = null;
        return groupObject;
    }
}
