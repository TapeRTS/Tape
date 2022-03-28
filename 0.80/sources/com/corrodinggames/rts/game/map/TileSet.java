package com.corrodinggames.rts.game.map;

import android.content.res.AssetManager;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.util.HashMap;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/* loaded from: classes.jar:com/corrodinggames/rts/game/map/TileSet.class */
public class TileSet {
    public int firstGID;
    public short index;
    public Map map;
    int maxX;
    public BitmapOrTexture tilesetBitmap;
    public String tilesetBitmapFileName;
    int tileWidth = 20;
    int tileHeight = 20;
    int tileStrideX = 20;
    int tileStrideY = 20;
    int globalOffsetX = 0;
    int globalOffsetY = 0;
    public int lastGID = Integer.MAX_VALUE;
    public boolean usedByTile = false;
    private HashMap<Integer, Properties> props = new HashMap<>();

    public TileSet(Map map, Element element) {
        this.map = map;
        this.firstGID = Integer.parseInt(element.getAttribute("firstgid"));
        String attribute = element.getAttribute("source");
        AssetManager assets = GameEngine.getInstance().context.getAssets();
        Element element2 = element;
        if (attribute != null) {
            element2 = element;
            if (!attribute.equals("")) {
                try {
                    element2 = DocumentBuilderFactory.newInstance().newDocumentBuilder().parse(assets.open("tilesets/" + attribute)).getDocumentElement();
                } catch (Exception e) {
                    throw new RuntimeException("Unable to load or parse sourced tileset: tilesets/" + attribute);
                }
            }
        }
        this.tilesetBitmapFileName = GameEngine.getFilename(((Element) element2.getElementsByTagName("image").item(0)).getAttribute("source"));
        NodeList elementsByTagName = element2.getElementsByTagName("tile");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element3 = (Element) elementsByTagName.item(i);
            int parseInt = Integer.parseInt(element3.getAttribute("id"));
            int i2 = this.firstGID;
            Properties properties = new Properties();
            NodeList elementsByTagName2 = ((Element) element3.getElementsByTagName("properties").item(0)).getElementsByTagName("property");
            for (int i3 = 0; i3 < elementsByTagName2.getLength(); i3++) {
                Element element4 = (Element) elementsByTagName2.item(i3);
                properties.setProperty(element4.getAttribute("name"), element4.getAttribute("value"));
            }
            this.props.put(new Integer(parseInt + i2), properties);
        }
    }

    public boolean contains(int i) {
        return i >= this.firstGID && i <= this.lastGID;
    }

    public Rect getBitmapRect(short s) {
        Rect rect = new Rect();
        setBitmapRect(s, rect);
        return rect;
    }

    public int getMaxX() {
        return this.maxX;
    }

    public Properties getProperties(int i) {
        return this.props.get(new Integer(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public void loadBitmap() {
        try {
            this.tilesetBitmap = GameEngine.getInstance().graphics.loadImage(GameEngine.getInstance().context.getAssets().open("tilesets/bitmaps/" + this.tilesetBitmapFileName), false);
            if (this.tilesetBitmap == null) {
                throw new RuntimeException("tilesetBitmap is null");
            }
            int width = this.tilesetBitmap.getWidth();
            this.map.getClass();
            this.maxX = width / 20;
            this.tilesetBitmap.name = "tilesets/" + this.tilesetBitmapFileName;
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void remove() {
        if (this.tilesetBitmap != null) {
            this.tilesetBitmap.remove();
            this.tilesetBitmap = null;
        }
        this.map = null;
        this.props = null;
    }

    public void setBitmapRect(int i, Rect rect) {
        int i2 = this.maxX;
        int i3 = i / this.maxX;
        int i4 = this.globalOffsetX + (this.tileStrideX * (i % i2));
        int i5 = this.globalOffsetY + (this.tileStrideY * i3);
        rect.set(i4, i5, this.tileWidth + i4, this.tileHeight + i5);
    }

    public void setLimit(int i) {
        this.lastGID = i;
    }
}
