package com.corrodinggames.rts.game.map;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.zip.GZIPInputStream;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
/* loaded from: classes.jar:com/corrodinggames/rts/game/map/MapLayer.class */
public class MapLayer {
    static Paint _fogPaint;
    static Paint _fullFogPaint;
    private static byte[] baseCodes = new byte[256];
    public short height;
    public int index;
    public boolean mainLayer;
    public Map map;
    public String name;
    public String nameLower;
    public Properties props;
    public MapTile[][] tiles;
    public short width;
    Paint tempPaint = new Paint();
    Rect srcRect = new Rect();
    Rect dstRect = new Rect();

    static {
        for (int i = 0; i < 256; i++) {
            baseCodes[i] = (byte) (-1);
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            baseCodes[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            baseCodes[i3] = (byte) ((i3 + 26) - 97);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            baseCodes[i4] = (byte) ((i4 + 52) - 48);
        }
        baseCodes[43] = (byte) 62;
        baseCodes[47] = (byte) 63;
        _fullFogPaint = new Paint();
        _fullFogPaint.setColor(-16777216);
        _fullFogPaint.setStyle(Paint.Style.FILL);
        _fogPaint = new Paint();
        _fogPaint.setColor(-16777216);
        _fogPaint.setStyle(Paint.Style.FILL);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public MapLayer(Map map, Element element) {
        int i;
        NodeList elementsByTagName;
        Log.e(GameEngine.TAG, "MapLayer create");
        this.map = map;
        this.name = element.getAttribute("name");
        if (this.name != null) {
            this.nameLower = this.name.toLowerCase();
        }
        this.width = Short.parseShort(element.getAttribute("width"));
        this.height = Short.parseShort(element.getAttribute("height"));
        this.tiles = new MapTile[this.width][this.height];
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (!(element2 == null || (elementsByTagName = element2.getElementsByTagName("property")) == null)) {
            this.props = new Properties();
            for (int i2 = 0; i2 < elementsByTagName.getLength(); i2++) {
                Element element3 = (Element) elementsByTagName.item(i2);
                this.props.setProperty(element3.getAttribute("name"), element3.getAttribute("value"));
            }
        }
        Element element4 = (Element) element.getElementsByTagName("data").item(0);
        String attribute = element4.getAttribute("encoding");
        String attribute2 = element4.getAttribute("compression");
        if (attribute.equals("base64") && attribute2.equals("gzip")) {
            try {
                GZIPInputStream gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(decodeBase64(element4.getFirstChild().getNodeValue().trim().toCharArray())));
                byte[] bArr = new byte[this.height * this.width * 4];
                int i3 = 0;
                int i4 = this.height * this.width * 4;
                do {
                    int read = gZIPInputStream.read(bArr, i3, i4);
                    Log.e(GameEngine.TAG, "read:" + read + " (" + i3 + "," + i4 + ")");
                    if (read != 0) {
                        i3 = i3;
                        i = i4;
                        if (read != -1) {
                            i3 += read;
                            i = i4 - read;
                        }
                        if (read == -1) {
                            break;
                        }
                        i4 = i;
                    } else {
                        throw new RuntimeException("read 0 bytes");
                    }
                } while (i > 0);
                ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(bArr);
                loadLayerFromData(byteArrayInputStream);
                byteArrayInputStream.close();
                gZIPInputStream.close();
            } catch (IOException e) {
                throw new RuntimeException("Unable to decode base 64 block");
            }
        } else if (!attribute.equals("base64") || !attribute2.equals("")) {
            throw new RuntimeException("Unsupport tiled map type: " + attribute + "," + attribute2 + " (only gzip base64 supported)");
        } else {
            ByteArrayInputStream byteArrayInputStream2 = new ByteArrayInputStream(decodeBase64(element4.getFirstChild().getNodeValue().trim().toCharArray()));
            loadLayerFromData(byteArrayInputStream2);
            try {
                byteArrayInputStream2.close();
            } catch (IOException e2) {
                throw new RuntimeException("Unable to decode base 64 block");
            }
        }
    }

    private byte[] decodeBase64(char[] cArr) {
        int length = cArr.length;
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] <= 255) {
                length = length;
                if (baseCodes[cArr[i]] >= 0) {
                }
            }
            length--;
        }
        int i2 = (length / 4) * 3;
        int i3 = i2;
        if (length % 4 == 3) {
            i3 = i2 + 2;
        }
        int i4 = i3;
        if (length % 4 == 2) {
            i4 = i3 + 1;
        }
        byte[] bArr = new byte[i4];
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < cArr.length; i8++) {
            byte b = cArr[i8] > 255 ? (byte) -1 : baseCodes[cArr[i8]];
            i6 = i6;
            i7 = i7;
            i5 = i5;
            if (b >= 0) {
                int i9 = i5 + 6;
                int i10 = (i6 << 6) | b;
                i6 = i10;
                i7 = i7;
                i5 = i9;
                if (i9 >= 8) {
                    i5 = i9 - 8;
                    bArr[i7] = (byte) ((i10 >> i5) & 255);
                    i7++;
                    i6 = i10;
                }
            }
        }
        if (i7 == bArr.length) {
            return bArr;
        }
        throw new RuntimeException("Data length appears to be wrong (wrote " + i7 + " should be " + bArr.length + ")");
    }

    public void draw(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z) {
        byte b;
        boolean z2 = (f7 == 1.0f && f8 == 1.0f) ? false : true;
        canvas.save();
        if (z2) {
            canvas.scale(f7, f8);
        }
        this.map.getClass();
        int i = (int) (0.05f * f3);
        int i2 = i;
        if (i < 0) {
            i2 = 0;
        }
        this.map.getClass();
        int i3 = (int) (0.05f * f4);
        int i4 = i3;
        if (i3 < 0) {
            i4 = 0;
        }
        this.map.getClass();
        int i5 = (int) ((f3 + f5) * 0.05f);
        int i6 = i5;
        if (i5 > this.width - 1) {
            i6 = this.width - 1;
        }
        this.map.getClass();
        int i7 = (int) ((f4 + f6) * 0.05f);
        int i8 = i7;
        if (i7 > this.height - 1) {
            i8 = this.height - 1;
        }
        byte[][] bArr = this.map.fogOfWar_map;
        int i9 = (int) f;
        int i10 = (int) f2;
        while (i2 < i6 + 1) {
            while (i4 < i8 + 1) {
                MapTile mapTile = this.tiles[i2][i4];
                if (mapTile != null && (!z || bArr[i2][i4] != 10)) {
                    TileSet tileset = mapTile.getTileset();
                    tileset.setBitmapRect(mapTile.index, this.srcRect);
                    this.map.getClass();
                    int i11 = i2 * 20;
                    this.map.getClass();
                    int i12 = i4 * 20;
                    Rect rect = this.dstRect;
                    this.map.getClass();
                    this.map.getClass();
                    rect.set(i11 - i9, i12 - i10, (i11 + 20) - i9, (i12 + 20) - i10);
                    canvas.drawBitmap(tileset.tilesetBitmap.bitmap, this.srcRect, this.dstRect, (Paint) null);
                    if (z && this.mainLayer && (b = bArr[i2][i4]) != 0) {
                        _fogPaint.setAlpha(b * 25);
                        canvas.drawRect(this.dstRect, _fogPaint);
                    }
                }
                i4++;
            }
            i2++;
        }
        canvas.restore();
    }

    public void drawNoCache(boolean z) {
        GameEngine instance = GameEngine.getInstance();
        drawNoScale(instance.graphics.getCanvas(), instance.viewpointX_rounded, instance.viewpointY_rounded, instance.viewpointX_rounded, instance.viewpointY_rounded, instance.viewpointWidth, instance.viewpointHeight, z);
    }

    public void drawNoScale(Canvas canvas, float f, float f2, float f3, float f4, float f5, float f6, boolean z) {
        draw(canvas, f, f2, f3, f4, f5, f6, 1.0f, 1.0f, z);
    }

    void loadLayerFromData(ByteArrayInputStream byteArrayInputStream) {
        for (short s = 0; s < this.height; s = (short) (s + 1)) {
            for (short s2 = 0; s2 < this.width; s2 = (short) (s2 + 1)) {
                int read = 0 | byteArrayInputStream.read() | (byteArrayInputStream.read() << 8) | (byteArrayInputStream.read() << 16) | (byteArrayInputStream.read() << 24);
                if (read != 0) {
                    TileSet findTileSet = this.map.findTileSet(read);
                    if (findTileSet != null) {
                        this.tiles[s2][s] = MapTile.createMapTile(this.map, this, findTileSet, read - findTileSet.firstGID, s2, s);
                    } else {
                        throw new RuntimeException("Unable to decode base 64 block");
                    }
                }
            }
        }
    }

    public void remove() {
        this.tiles = null;
        this.props = null;
        this.map = null;
    }
}
