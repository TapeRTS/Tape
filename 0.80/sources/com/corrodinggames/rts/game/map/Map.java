package com.corrodinggames.rts.game.map;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.os.Environment;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.MissionEngine;
import java.io.ByteArrayInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
/* loaded from: classes.jar:com/corrodinggames/rts/game/map/Map.class */
public final class Map {
    public static final String TAG = "FoxPlatformer";
    public static final byte fogOfWar_fullFog = 10;
    public boolean fogDirtyDelayActive;
    public float fogDirtyDelayTimer;
    public byte[][] fogOfWar_map;
    public boolean[][] fogOfWar_map_changedTiles;
    int layerBufferScaledSize;
    int layerBufferSize;
    int layerBufferX;
    int layerBufferY;
    public boolean mapEditorOn;
    public int mapHeight;
    public boolean mapLoaded;
    public int mapWidth;
    public ObjectGroup objectGroup_triggers;
    float restartZoomDelay;
    public int returnX;
    public int returnY;
    public int selectedTileX;
    public int selectedTileY;
    boolean tileSelected;
    public final short tileWidth = (short) 20;
    public final short tileHeight = (short) 20;
    public final int tileWidthHalf = 10;
    public final int tileHeightHalf = 10;
    public final float tileWidthInv = 0.05f;
    public final float tileHeightInv = 0.05f;
    public ArrayList<TileSet> tilesets = new ArrayList<>();
    public MapLayer mainLayer = null;
    public MapLayer objectLayer = null;
    public ArrayList<MapLayer> layers = new ArrayList<>();
    public ArrayList<Point> resPools = new ArrayList<>();
    public boolean fogOfWar_active = true;
    public boolean fogOfWar_map_changed = false;
    protected ArrayList<ObjectGroup> objectGroups = new ArrayList<>();
    float selectedTileDelay = 0.0f;
    Rect _tileRect = new Rect();
    Rect _testRect = new Rect();
    ArrayList<MapTile> _overlappingTiles = new ArrayList<>();
    final int layerBufferCount = 7;
    LayerBitmapBuffer[][] layerBuffers = null;
    float layerBufferZoom = 1.0f;
    float restartZoomDelayLastZoom = 1.0f;
    Paint _paint = new Paint();
    Rect _rect = new Rect();
    Paint selectedTilePaint = new Paint();
    Paint paintBuildValid = new Paint();
    Paint paintBuildNotValid = new Paint();

    /* loaded from: classes.jar:com/corrodinggames/rts/game/map/Map$LayerBitmapBuffer.class */
    public class LayerBitmapBuffer {
        public Bitmap bitmap;
        public Canvas canvas;
        public int x;
        public int y;
        public boolean dirty = true;
        public boolean delayableDirty = true;
        public int delayableDirtyCounter = 0;
        public Rect srcRect = new Rect();
        public Rect dstRect = new Rect();

        public LayerBitmapBuffer(int i, int i2) {
            this.x = i;
            this.y = i2;
        }

        public int getHeight() {
            return this.bitmap.getHeight();
        }

        public int getScreenX() {
            return Map.this.layerBufferX + (this.x * Map.this.layerBufferScaledSize);
        }

        public int getScreenY() {
            return Map.this.layerBufferY + (this.y * Map.this.layerBufferScaledSize);
        }

        public int getWidth() {
            return this.bitmap.getWidth();
        }
    }

    public Map() {
        this.selectedTilePaint.setARGB(100, 255, 0, 0);
        this.selectedTilePaint.setTextSize(16.0f);
        this.paintBuildValid.setStyle(Paint.Style.STROKE);
        this.paintBuildValid.setStrokeWidth(1.0f);
        this.paintBuildValid.setARGB(255, 0, 255, 0);
        this.paintBuildNotValid.setStyle(Paint.Style.STROKE);
        this.paintBuildNotValid.setStrokeWidth(1.0f);
        this.paintBuildNotValid.setARGB(255, 255, 0, 0);
    }

    public static void load() {
    }

    public void addBuildingGridToBuffer() {
        GameEngine.getInstance();
        for (int i = 0; i < 7; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                drawBuildingGrid(i, i2);
            }
        }
    }

    public void addScorchMark(ScorchMark scorchMark) {
        for (int i = 0; i < 7; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                LayerBitmapBuffer layerBitmapBuffer = this.layerBuffers[i][i2];
                boolean z = this.layerBufferZoom != 1.0f;
                if (z) {
                    layerBitmapBuffer.canvas.save();
                    layerBitmapBuffer.canvas.scale(this.layerBufferZoom, this.layerBufferZoom);
                }
                scorchMark.bake(layerBitmapBuffer.canvas, layerBitmapBuffer.getScreenX(), layerBitmapBuffer.getScreenY());
                if (z) {
                    layerBitmapBuffer.canvas.restore();
                }
            }
        }
    }

    public void bakeScorchMarks(int i, int i2) {
        LayerBitmapBuffer layerBitmapBuffer = this.layerBuffers[i][i2];
        boolean z = this.layerBufferZoom != 1.0f;
        if (z) {
            layerBitmapBuffer.canvas.save();
            layerBitmapBuffer.canvas.scale(this.layerBufferZoom, this.layerBufferZoom);
        }
        Iterator<GameObject> it = GameObject.fastGameObjectList.iterator();
        while (it.hasNext()) {
            GameObject next = it.next();
            if (next instanceof ScorchMark) {
                ((ScorchMark) next).bake(layerBitmapBuffer.canvas, layerBitmapBuffer.getScreenX(), layerBitmapBuffer.getScreenY());
            }
        }
        if (z) {
            layerBitmapBuffer.canvas.restore();
        }
    }

    public void drawBackground(float f) {
    }

    public void drawBackgroundAndMain(float f) {
        GameEngine instance = GameEngine.getInstance();
        if (this.layerBuffers == null) {
            int max = Math.max((int) instance.viewpointWidthUnscaled, (int) instance.viewpointHeightUnscaled);
            this.layerBuffers = new LayerBitmapBuffer[7][7];
            this.layerBufferSize = (max / 3) + 5;
            this.layerBufferSize = ((int) (this.layerBufferSize * 0.05f)) * 20;
            for (int i = 0; i < 7; i++) {
                for (int i2 = 0; i2 < 7; i2++) {
                    LayerBitmapBuffer layerBitmapBuffer = new LayerBitmapBuffer(i, i2);
                    this.layerBuffers[i][i2] = layerBitmapBuffer;
                    layerBitmapBuffer.bitmap = Bitmap.createBitmap(this.layerBufferSize, this.layerBufferSize, Bitmap.Config.RGB_565);
                    layerBitmapBuffer.canvas = new Canvas();
                    layerBitmapBuffer.canvas.setBitmap(layerBitmapBuffer.bitmap);
                }
            }
            resetBufferLayers();
        }
        float f2 = instance.viewpointZoom / this.layerBufferZoom;
        float f3 = f2;
        if (CommonUtils.abs(f2 - 1.0f) < 0.01f) {
            f3 = 1.0f;
        }
        float f4 = this.layerBufferSize;
        float f5 = instance.viewpointWidthUnscaled;
        float f6 = instance.viewpointHeightUnscaled;
        boolean z = false;
        if (f3 != 1.0f) {
            if (CommonUtils.close(this.restartZoomDelayLastZoom, instance.viewpointZoom)) {
                this.restartZoomDelay += f;
            } else {
                this.restartZoomDelay = 0.0f;
                this.restartZoomDelayLastZoom = instance.viewpointZoom;
            }
            z = false;
            if (this.restartZoomDelay > 10.0f) {
                this.restartZoomDelay = 0.0f;
                z = true;
            }
        }
        if (instance.viewpointXAsInt + instance.viewpointWidth > this.layerBufferX + (this.layerBufferScaledSize * 7)) {
            this.layerBufferX += this.layerBufferScaledSize;
            moveLayerBufferH(1);
        }
        if (instance.viewpointXAsInt < this.layerBufferX) {
            this.layerBufferX -= this.layerBufferScaledSize;
            moveLayerBufferH(-1);
        }
        if (instance.viewpointYAsInt + instance.viewpointHeight > this.layerBufferY + (this.layerBufferScaledSize * 7)) {
            this.layerBufferY += this.layerBufferScaledSize;
            moveLayerBufferV(1);
        }
        if (instance.viewpointYAsInt < this.layerBufferY) {
            this.layerBufferY -= this.layerBufferScaledSize;
            moveLayerBufferV(-1);
        }
        if (instance.viewpointXAsInt + instance.viewpointWidth > this.layerBufferX + (this.layerBufferScaledSize * 7)) {
            z = true;
        }
        if (instance.viewpointXAsInt < this.layerBufferX) {
            z = true;
        }
        if (instance.viewpointYAsInt + instance.viewpointHeight > this.layerBufferY + (this.layerBufferScaledSize * 7)) {
            z = true;
        }
        if (instance.viewpointYAsInt < this.layerBufferY) {
            z = true;
        }
        if (z) {
            resetBufferLayers();
        }
        float f7 = instance.viewpointZoom / this.layerBufferZoom;
        float f8 = f7;
        if (CommonUtils.abs(f7 - 1.0f) < 1.0E-4f) {
            f8 = 1.0f;
        }
        float f9 = this.layerBufferSize;
        float f10 = instance.viewpointWidthUnscaled / f8;
        float f11 = instance.viewpointHeightUnscaled / f8;
        if (f8 != 1.0f) {
            instance.graphics.getCanvas().save();
            instance.graphics.getCanvas().scale(f8, f8);
        }
        float f12 = this.layerBufferX;
        float f13 = instance.viewpointX_rounded;
        float f14 = this.layerBufferZoom;
        float f15 = this.layerBufferY;
        float f16 = instance.viewpointY_rounded;
        float f17 = this.layerBufferZoom;
        for (int i3 = 0; i3 < 7; i3++) {
            for (int i4 = 0; i4 < 7; i4++) {
                LayerBitmapBuffer layerBitmapBuffer2 = this.layerBuffers[i3][i4];
                int i5 = (int) ((this.layerBufferSize * i3) + ((f12 - f13) * f14));
                int i6 = (int) ((this.layerBufferSize * i4) + ((f15 - f16) * f17));
                layerBitmapBuffer2.dstRect.set(i5, i6, this.layerBufferSize + i5, this.layerBufferSize + i6);
                if (layerBitmapBuffer2.dstRect.left <= f10 && layerBitmapBuffer2.dstRect.top <= f11) {
                    if (layerBitmapBuffer2.dstRect.right > f10) {
                        layerBitmapBuffer2.dstRect.right = (int) f10;
                    }
                    if (layerBitmapBuffer2.dstRect.bottom > f11) {
                        layerBitmapBuffer2.dstRect.bottom = (int) f11;
                    }
                    int i7 = (int) ((0.0f - instance.viewpointX_rounded) * this.layerBufferZoom);
                    int i8 = (int) ((0.0f - instance.viewpointY_rounded) * this.layerBufferZoom);
                    int widthInPixels = (int) ((getWidthInPixels() - instance.viewpointX_rounded) * this.layerBufferZoom);
                    int heightInPixels = (int) ((getHeightInPixels() - instance.viewpointY_rounded) * this.layerBufferZoom);
                    if (layerBitmapBuffer2.dstRect.left < i7) {
                        layerBitmapBuffer2.dstRect.left = i7;
                    }
                    if (layerBitmapBuffer2.dstRect.top < i8) {
                        layerBitmapBuffer2.dstRect.top = i8;
                    }
                    if (layerBitmapBuffer2.dstRect.right > widthInPixels) {
                        layerBitmapBuffer2.dstRect.right = widthInPixels;
                    }
                    if (layerBitmapBuffer2.dstRect.bottom > heightInPixels) {
                        layerBitmapBuffer2.dstRect.bottom = heightInPixels;
                    }
                    if (!layerBitmapBuffer2.dstRect.isEmpty()) {
                        boolean z2 = false;
                        if (layerBitmapBuffer2.dirty) {
                            z2 = true;
                        }
                        boolean z3 = z2;
                        if (layerBitmapBuffer2.delayableDirty) {
                            layerBitmapBuffer2.delayableDirtyCounter++;
                            z3 = z2;
                            if (layerBitmapBuffer2.delayableDirtyCounter > 10) {
                                layerBitmapBuffer2.delayableDirtyCounter = 0;
                                z3 = true;
                            }
                        }
                        if (z3) {
                            drawTile(i3, i4);
                        }
                        layerBitmapBuffer2.srcRect.set(layerBitmapBuffer2.dstRect);
                        layerBitmapBuffer2.srcRect.offset(-i5, -i6);
                        instance.graphics.getCanvas().drawBitmap(layerBitmapBuffer2.bitmap, layerBitmapBuffer2.srcRect, layerBitmapBuffer2.dstRect, (Paint) null);
                    }
                }
            }
        }
        if (f8 != 1.0f) {
            instance.graphics.getCanvas().restore();
        }
    }

    public void drawBuildingGrid(int i, int i2) {
        GameEngine instance = GameEngine.getInstance();
        if (instance.interfaceEngine.orderBuilding != null) {
            LayerBitmapBuffer layerBitmapBuffer = this.layerBuffers[i][i2];
            int i3 = this.layerBufferX + (this.layerBufferScaledSize * i);
            int i4 = this.layerBufferY + (this.layerBufferScaledSize * i2);
            int i5 = this.layerBufferScaledSize;
            int i6 = this.layerBufferScaledSize;
            short s = this.mainLayer.width;
            short s2 = this.mainLayer.height;
            int i7 = (int) (i3 * 0.05f);
            int i8 = i7;
            if (i7 < 0) {
                i8 = 0;
            }
            int i9 = (int) (i4 * 0.05f);
            int i10 = i9;
            if (i9 < 0) {
                i10 = 0;
            }
            int i11 = (int) ((i3 + i5) * 0.05f);
            int i12 = i11;
            if (i11 > s - 1) {
                i12 = s - 1;
            }
            int i13 = (int) ((i4 + i6) * 0.05f);
            int i14 = i13;
            if (i13 > s2 - 1) {
                i14 = s2 - 1;
            }
            while (i8 <= i12) {
                while (i10 <= i14) {
                    boolean isTileValidForInterface = Building.isTileValidForInterface(instance.interfaceEngine.orderBuilding, i8, i10);
                    this._rect.set((i8 * 20) - i3, (i10 * 20) - i4, (((i8 + 1) * 20) - 1) - i3, (((i10 + 1) * 20) - 1) - i4);
                    boolean z = this.layerBufferZoom != 1.0f;
                    if (z) {
                        layerBitmapBuffer.canvas.save();
                        layerBitmapBuffer.canvas.scale(this.layerBufferZoom, this.layerBufferZoom);
                    }
                    if (isTileValidForInterface) {
                        layerBitmapBuffer.canvas.drawRect(this._rect, this.paintBuildValid);
                    } else {
                        layerBitmapBuffer.canvas.drawRect(this._rect, this.paintBuildNotValid);
                    }
                    if (z) {
                        layerBitmapBuffer.canvas.restore();
                    }
                    i10++;
                }
                i8++;
            }
        }
    }

    public void drawMain(float f) {
        drawBackgroundAndMain(f);
        if (this.mapEditorOn) {
            new Rect();
            Rect rect = new Rect();
            int i = this.selectedTileX * 20;
            int i2 = this.selectedTileY * 20;
            rect.set(i, i2, i + 20, i2 + 20);
            rect.offset(-GameEngine.getInstance().viewpointXAsInt, -GameEngine.getInstance().viewpointYAsInt);
        }
    }

    public void drawTile(int i, int i2) {
        LayerBitmapBuffer layerBitmapBuffer = this.layerBuffers[i][i2];
        if (this.fogOfWar_active) {
            layerBitmapBuffer.canvas.drawColor(0, PorterDuff.Mode.CLEAR);
        }
        int i3 = this.layerBufferX + (this.layerBufferScaledSize * i);
        int i4 = this.layerBufferY + (this.layerBufferScaledSize * i2);
        this.mainLayer.draw(layerBitmapBuffer.canvas, i3, i4, i3, i4, this.layerBufferScaledSize, this.layerBufferScaledSize, this.layerBufferZoom, this.layerBufferZoom, this.fogOfWar_active);
        Iterator<MapLayer> it = this.layers.iterator();
        while (it.hasNext()) {
            MapLayer next = it.next();
            if (next.nameLower.contains("items")) {
                next.draw(layerBitmapBuffer.canvas, i3, i4, i3, i4, this.layerBufferScaledSize, this.layerBufferScaledSize, this.layerBufferZoom, this.layerBufferZoom, this.fogOfWar_active);
            }
        }
        bakeScorchMarks(i, i2);
        if (GameEngine.getInstance().interfaceEngine.orderBuilding != null) {
            drawBuildingGrid(i, i2);
        }
        layerBitmapBuffer.dirty = false;
        layerBitmapBuffer.delayableDirty = false;
    }

    public TileSet findTileSet(int i) {
        TileSet tileSet;
        int i2 = 0;
        while (true) {
            if (i2 >= this.tilesets.size()) {
                tileSet = null;
                break;
            }
            tileSet = this.tilesets.get(i2);
            if (tileSet.contains(i)) {
                break;
            }
            i2++;
        }
        return tileSet;
    }

    public void fixXYonLayers() {
        for (int i = 0; i < 7; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                LayerBitmapBuffer layerBitmapBuffer = this.layerBuffers[i][i2];
                layerBitmapBuffer.x = i;
                layerBitmapBuffer.y = i2;
            }
        }
    }

    public void fromGrid(int i, int i2) {
        this.returnX = i * 20;
        this.returnY = i2 * 20;
    }

    public LayerBitmapBuffer getBitmapBuffer(int i, int i2) {
        return (i < 0 || i >= 7) ? null : (i2 < 0 || i2 >= 7) ? null : this.layerBuffers[i][i2];
    }

    public float getHeightInPixels() {
        return this.mainLayer.height * 20;
    }

    public ObjectGroup getObjectGroupByName(String str) {
        ObjectGroup objectGroup;
        Iterator<ObjectGroup> it = this.objectGroups.iterator();
        while (true) {
            if (it.hasNext()) {
                ObjectGroup next = it.next();
                if (str.equalsIgnoreCase(next.name)) {
                    objectGroup = next;
                    break;
                }
            } else {
                objectGroup = null;
                break;
            }
        }
        return objectGroup;
    }

    public ArrayList<MapTile> getOverlappingTilesReuse(int i, int i2, int i3, int i4) {
        this._overlappingTiles.clear();
        this._testRect.set(i, i2, i + i3, i2 + i4);
        int i5 = (int) ((this._testRect.left * 0.05f) - 1.0f);
        int i6 = i5;
        if (i5 < 0) {
            i6 = 0;
        }
        int i7 = (int) ((this._testRect.top * 0.05f) - 1.0f);
        int i8 = i7;
        if (i7 < 0) {
            i8 = 0;
        }
        int i9 = (int) ((this._testRect.right * 0.05f) + 1.0f);
        int i10 = i9;
        if (i9 > this.mainLayer.width - 2) {
            i10 = this.mainLayer.width - 2;
        }
        int i11 = (int) ((this._testRect.bottom * 0.05f) + 1.0f);
        int i12 = i11;
        if (i11 > this.mainLayer.height - 2) {
            i12 = this.mainLayer.height - 2;
        }
        while (i6 < i10 + 1) {
            while (i8 < i12 + 1) {
                MapTile mapTile = this.mainLayer.tiles[i6][i8];
                if (mapTile != null) {
                    int i13 = i6 * 20;
                    int i14 = i8 * 20;
                    this._tileRect.set(i13, i14, i13 + 20, i14 + 20);
                    if (Rect.intersects(this._testRect, this._tileRect)) {
                        this._overlappingTiles.add(mapTile);
                    }
                }
                i8++;
            }
            i6++;
        }
        return this._overlappingTiles;
    }

    public MapTile getTileFromMainLayer(int i, int i2) {
        return !isInMap(i, i2) ? null : this.mainLayer.tiles[i][i2];
    }

    public MapTile getTileFromObjectLayer(int i, int i2) {
        return !isInMap(i, i2) ? null : this.objectLayer == null ? null : this.objectLayer.tiles[i][i2];
    }

    public short getTileHeight() {
        return (short) 20;
    }

    public short getTileWidth() {
        return (short) 20;
    }

    public float getWidthInPixels() {
        return this.mainLayer.width * 20;
    }

    public final boolean isInMap(int i, int i2) {
        return i >= 0 && i < this.mapWidth && i2 >= 0 && i2 < this.mapHeight;
    }

    public void loadMap(String str) {
        InputStream inputStream;
        NodeList elementsByTagName;
        this.resPools.clear();
        String str2 = str;
        if (str2.startsWith("/SD/rusted_warfare_maps")) {
            try {
                inputStream = new FileInputStream(new File(Environment.getExternalStorageDirectory() + "/rusted_warfare_maps/" + str2.substring("/SD/rusted_warfare_maps".length())));
            } catch (FileNotFoundException e) {
                throw new RuntimeException(e);
            }
        } else {
            try {
                inputStream = GameEngine.getInstance().context.getAssets().open(str2);
            } catch (IOException e2) {
                throw new RuntimeException(e2);
            }
        }
        try {
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setValidating(false);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            newDocumentBuilder.setEntityResolver(new EntityResolver() { // from class: com.corrodinggames.rts.game.map.Map.1
                @Override // org.xml.sax.EntityResolver
                public InputSource resolveEntity(String str3, String str4) throws SAXException, IOException {
                    return new InputSource(new ByteArrayInputStream(new byte[0]));
                }
            });
            Element documentElement = newDocumentBuilder.parse(inputStream).getDocumentElement();
            String attribute = documentElement.getAttribute("orientation");
            if (!attribute.equals("orthogonal")) {
                throw new RuntimeException("Only orthogonal maps supported, found: " + attribute);
            }
            int parseInt = Integer.parseInt(documentElement.getAttribute("width"));
            int parseInt2 = Integer.parseInt(documentElement.getAttribute("height"));
            this.mapWidth = parseInt;
            this.mapHeight = parseInt2;
            if (this.fogOfWar_active) {
                this.fogOfWar_map = new byte[this.mapWidth][this.mapHeight];
                this.fogOfWar_map_changedTiles = new boolean[this.mapWidth][this.mapHeight];
                for (int i = 0; i < this.mapWidth; i++) {
                    for (int i2 = 0; i2 < this.mapHeight; i2++) {
                        this.fogOfWar_map[i][i2] = (byte) 10;
                    }
                }
            } else {
                this.fogOfWar_map = null;
            }
            Element element = (Element) documentElement.getElementsByTagName("properties").item(0);
            if (!(element == null || (elementsByTagName = element.getElementsByTagName("property")) == null)) {
                Properties properties = new Properties();
                for (int i3 = 0; i3 < elementsByTagName.getLength(); i3++) {
                    Element element2 = (Element) elementsByTagName.item(i3);
                    properties.setProperty(element2.getAttribute("name"), element2.getAttribute("value"));
                }
            }
            TileSet tileSet = null;
            NodeList elementsByTagName2 = documentElement.getElementsByTagName("tileset");
            for (short s = 0; s < elementsByTagName2.getLength(); s = (short) (s + 1)) {
                TileSet tileSet2 = new TileSet(this, (Element) elementsByTagName2.item(s));
                tileSet2.index = s;
                if (tileSet != null) {
                    tileSet.setLimit(tileSet2.firstGID - 1);
                }
                tileSet = tileSet2;
                this.tilesets.add(tileSet2);
            }
            NodeList elementsByTagName3 = documentElement.getElementsByTagName("layer");
            for (int i4 = 0; i4 < elementsByTagName3.getLength(); i4++) {
                MapLayer mapLayer = new MapLayer(this, (Element) elementsByTagName3.item(i4));
                mapLayer.index = i4;
                this.layers.add(mapLayer);
            }
            Iterator<MapLayer> it = this.layers.iterator();
            while (it.hasNext()) {
                MapLayer next = it.next();
                if (next.name.equalsIgnoreCase("Ground")) {
                    this.mainLayer = next;
                    this.mainLayer.mainLayer = true;
                }
                if (next.name.equalsIgnoreCase("Items") || next.name.equalsIgnoreCase("Objects")) {
                    this.objectLayer = next;
                }
            }
            if (this.mainLayer == null) {
                throw new RuntimeException("mainLayer is null, not found in layers");
            } else if (this.objectLayer == null) {
                throw new RuntimeException("objectLayer is null, not found in layers");
            } else {
                Iterator<TileSet> it2 = this.tilesets.iterator();
                while (it2.hasNext()) {
                    TileSet next2 = it2.next();
                    if (next2.usedByTile) {
                        next2.loadBitmap();
                    }
                }
                NodeList elementsByTagName4 = documentElement.getElementsByTagName("objectgroup");
                for (int i5 = 0; i5 < elementsByTagName4.getLength(); i5++) {
                    ObjectGroup objectGroup = new ObjectGroup((Element) elementsByTagName4.item(i5));
                    objectGroup.index = i5;
                    this.objectGroups.add(objectGroup);
                }
                this.objectGroup_triggers = getObjectGroupByName("triggers");
                GroupObject groupObject = null;
                if (this.objectGroup_triggers != null) {
                    groupObject = this.objectGroup_triggers.getGroupObjectByName("map_info");
                }
                GameEngine instance = GameEngine.getInstance();
                instance.mission = null;
                boolean z = false;
                if (groupObject != null) {
                    String property = groupObject.props.getProperty("type");
                    if (property != null && (property.equalsIgnoreCase("mission") || property.equalsIgnoreCase("survival") || property.equalsIgnoreCase("challenge") || property.equalsIgnoreCase("skirmish"))) {
                        instance.mission = new MissionEngine();
                        instance.mission.init();
                    }
                    String property2 = groupObject.props.getProperty("fog");
                    z = false;
                    if (property2 != null) {
                        z = false;
                        if (!property2.equalsIgnoreCase("none")) {
                            z = true;
                        }
                    }
                }
                if (!z) {
                    this.fogOfWar_active = false;
                    for (int i6 = 0; i6 < this.mapWidth; i6++) {
                        for (int i7 = 0; i7 < this.mapHeight; i7++) {
                            this.fogOfWar_map[i6][i7] = (byte) 0;
                        }
                    }
                }
                this.mapLoaded = true;
            }
        } catch (Exception e3) {
            throw new RuntimeException("Failed to parse map", e3);
        }
    }

    public void moveLayerBufferH(int i) {
        LayerBitmapBuffer[] layerBitmapBufferArr = new LayerBitmapBuffer[7];
        if (i > 0) {
            for (int i2 = 0; i2 < 7; i2++) {
                layerBitmapBufferArr[i2] = this.layerBuffers[0][i2];
            }
            for (int i3 = 1; i3 < 7; i3++) {
                for (int i4 = 0; i4 < 7; i4++) {
                    this.layerBuffers[i3 - 1][i4] = this.layerBuffers[i3][i4];
                }
            }
            for (int i5 = 0; i5 < 7; i5++) {
                this.layerBuffers[6][i5] = layerBitmapBufferArr[i5];
            }
            for (int i6 = 0; i6 < 7; i6++) {
                this.layerBuffers[6][i6].dirty = true;
            }
        } else {
            for (int i7 = 0; i7 < 7; i7++) {
                layerBitmapBufferArr[i7] = this.layerBuffers[6][i7];
            }
            for (int i8 = 5; i8 >= 0; i8--) {
                for (int i9 = 0; i9 < 7; i9++) {
                    this.layerBuffers[i8 + 1][i9] = this.layerBuffers[i8][i9];
                }
            }
            for (int i10 = 0; i10 < 7; i10++) {
                this.layerBuffers[0][i10] = layerBitmapBufferArr[i10];
            }
            for (int i11 = 0; i11 < 7; i11++) {
                this.layerBuffers[0][i11].dirty = true;
            }
        }
        fixXYonLayers();
    }

    public void moveLayerBufferV(int i) {
        LayerBitmapBuffer[] layerBitmapBufferArr = new LayerBitmapBuffer[7];
        if (i > 0) {
            for (int i2 = 0; i2 < 7; i2++) {
                layerBitmapBufferArr[i2] = this.layerBuffers[i2][0];
            }
            for (int i3 = 1; i3 < 7; i3++) {
                for (int i4 = 0; i4 < 7; i4++) {
                    this.layerBuffers[i4][i3 - 1] = this.layerBuffers[i4][i3];
                }
            }
            for (int i5 = 0; i5 < 7; i5++) {
                this.layerBuffers[i5][6] = layerBitmapBufferArr[i5];
            }
            for (int i6 = 0; i6 < 7; i6++) {
                this.layerBuffers[i6][6].dirty = true;
            }
        } else {
            for (int i7 = 0; i7 < 7; i7++) {
                layerBitmapBufferArr[i7] = this.layerBuffers[i7][6];
            }
            for (int i8 = 5; i8 >= 0; i8--) {
                for (int i9 = 0; i9 < 7; i9++) {
                    this.layerBuffers[i9][i8 + 1] = this.layerBuffers[i9][i8];
                }
            }
            for (int i10 = 0; i10 < 7; i10++) {
                this.layerBuffers[i10][0] = layerBitmapBufferArr[i10];
            }
            for (int i11 = 0; i11 < 7; i11++) {
                this.layerBuffers[i11][0].dirty = true;
            }
        }
        fixXYonLayers();
    }

    public void remove() {
        Iterator<TileSet> it = this.tilesets.iterator();
        while (it.hasNext()) {
            it.next().remove();
        }
        this.tilesets.clear();
        Iterator<MapLayer> it2 = this.layers.iterator();
        while (it2.hasNext()) {
            it2.next().remove();
        }
        this.layers.clear();
        this.objectGroups.clear();
        this.objectGroup_triggers = null;
        if (this.layerBuffers != null) {
            for (int i = 0; i < 7; i++) {
                for (int i2 = 0; i2 < 7; i2++) {
                    LayerBitmapBuffer layerBitmapBuffer = this.layerBuffers[i][i2];
                    layerBitmapBuffer.canvas = null;
                    if (layerBitmapBuffer.bitmap != null) {
                        layerBitmapBuffer.bitmap.recycle();
                        layerBitmapBuffer.bitmap = null;
                    }
                }
            }
        }
    }

    public void resetBufferLayers() {
        GameEngine instance = GameEngine.getInstance();
        this.layerBufferZoom = instance.viewpointZoom;
        this.layerBufferScaledSize = (int) (this.layerBufferSize / this.layerBufferZoom);
        this.layerBufferX = instance.viewpointXAsInt - (this.layerBufferScaledSize / 2);
        this.layerBufferY = instance.viewpointYAsInt - (this.layerBufferScaledSize / 2);
        this.layerBufferX = ((int) (this.layerBufferX * 0.05f)) * 20;
        this.layerBufferY = ((int) (this.layerBufferY * 0.05f)) * 20;
        for (int i = 0; i < 7; i++) {
            for (int i2 = 0; i2 < 7; i2++) {
                this.layerBuffers[i][i2].dirty = true;
            }
        }
    }

    public float restrictXInPixels(float f) {
        float f2 = f;
        if (f < 0.0f) {
            f2 = 0.0f;
        }
        float f3 = f2;
        if (f2 > getWidthInPixels()) {
            f3 = getWidthInPixels();
        }
        return f3;
    }

    public float restrictYInPixels(float f) {
        float f2 = f;
        if (f < 0.0f) {
            f2 = 0.0f;
        }
        float f3 = f2;
        if (f2 > getHeightInPixels()) {
            f3 = getHeightInPixels();
        }
        return f3;
    }

    void saveMap() {
        try {
            DataOutputStream dataOutputStream = new DataOutputStream(GameEngine.getInstance().context.openFileOutput("samplemap.fpmap", 1));
            dataOutputStream.writeChars("FPMAP100");
            dataOutputStream.writeInt(40);
            dataOutputStream.writeChars("MAP   ");
            dataOutputStream.writeInt(14);
            dataOutputStream.writeChars("MAPSET");
            dataOutputStream.writeInt(getTileWidth());
            dataOutputStream.writeInt(getTileHeight());
            dataOutputStream.writeInt(14);
            dataOutputStream.writeChars("MAPDAT");
            dataOutputStream.writeShort(0);
            dataOutputStream.writeShort(0);
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public void seeThoughFogOfWar(float f, float f2, int i) {
        byte b;
        byte b2;
        GameEngine instance = GameEngine.getInstance();
        float f3 = (i - 2) * (i - 2);
        float f4 = i * i;
        toGrid(f, f2);
        int i2 = this.returnX;
        int i3 = this.returnY;
        getClass();
        getClass();
        byte[][] bArr = this.fogOfWar_map;
        if (this.fogOfWar_active) {
            for (int i4 = i2 - i; i4 <= i2 + i; i4++) {
                for (int i5 = i3 - i; i5 <= i3 + i; i5++) {
                    if (isInMap(i4, i5) && (b = bArr[i4][i5]) != 0) {
                        float distanceSq = CommonUtils.distanceSq(f * 0.05f, f2 * 0.05f, i4, i5);
                        if (distanceSq <= f3) {
                            if (b > 0) {
                                bArr[i4][i5] = (byte) 0;
                                setDirty(i4, i5, true);
                                instance.minimapHandler.fogNeedsUpdating = true;
                            }
                        } else if (distanceSq <= f4 && b > (b2 = (byte) (((distanceSq - f3) / (f4 - f3)) * 10.0f))) {
                            bArr[i4][i5] = b2;
                            setDirty(i4, i5, true);
                            instance.minimapHandler.fogNeedsUpdating = true;
                        }
                    }
                }
            }
        }
    }

    public void setDirty(int i, int i2, int i3, int i4, boolean z) {
        LayerBitmapBuffer bitmapBuffer;
        LayerBitmapBuffer bitmapBuffer2;
        LayerBitmapBuffer bitmapBuffer3;
        int i5 = (int) (i / this.layerBufferScaledSize);
        int i6 = (int) (i2 / this.layerBufferScaledSize);
        LayerBitmapBuffer bitmapBuffer4 = getBitmapBuffer(i5, i6);
        if (bitmapBuffer4 != null) {
            if (z) {
                bitmapBuffer4.delayableDirty = true;
            } else {
                bitmapBuffer4.dirty = true;
            }
            boolean z2 = false;
            boolean z3 = false;
            if (i + i3 > bitmapBuffer4.x + this.layerBufferScaledSize) {
                z2 = true;
            }
            if (i2 + i4 > bitmapBuffer4.y + this.layerBufferScaledSize) {
                z3 = true;
            }
            if (z2 && (bitmapBuffer3 = getBitmapBuffer(i5 + 1, i6)) != null) {
                if (z) {
                    bitmapBuffer3.delayableDirty = true;
                } else {
                    bitmapBuffer3.dirty = true;
                }
            }
            if (z3 && (bitmapBuffer2 = getBitmapBuffer(i5, i6 + 1)) != null) {
                if (z) {
                    bitmapBuffer2.delayableDirty = true;
                } else {
                    bitmapBuffer2.dirty = true;
                }
            }
            if (z2 && z3 && (bitmapBuffer = getBitmapBuffer(i5 + 1, i6 + 1)) != null) {
                if (z) {
                    bitmapBuffer.delayableDirty = true;
                } else {
                    bitmapBuffer.dirty = true;
                }
            }
        }
    }

    public void setDirty(int i, int i2, boolean z) {
        setDirty((i * 20) - this.layerBufferX, (i2 * 20) - this.layerBufferY, 20, 20, z);
    }

    public void snapToGrid(float f, float f2) {
        toGrid(f, f2);
        fromGrid(this.returnX, this.returnY);
    }

    public void toGrid(float f, float f2) {
        this.returnX = (int) (f * 0.05f);
        this.returnY = (int) (f2 * 0.05f);
    }

    public void update(float f) {
        GameEngine.getInstance().displayText = null;
    }
}
