package com.corrodinggames.rts.game.map;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.C0433j;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.water.MissileShip;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.draw.Graphics;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Properties;

/* renamed from: com.corrodinggames.rts.game.b.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/g.class */
public final class MapTile {

    /* renamed from: a */
    public TileSet f892a;

    /* renamed from: b */
    public int f893b;

    /* renamed from: c */
    public int f894c = -2;

    /* renamed from: d */
    public short f895d = -1;

    /* renamed from: e */
    public boolean water;

    /* renamed from: f */
    public boolean waterBridge;

    /* renamed from: g */
    public boolean f898g;

    /* renamed from: h */
    public boolean cliff;

    /* renamed from: i */
    public boolean nresPool;

    /* renamed from: j */
    public byte pathCost;

    /* renamed from: k */
    public boolean largeCliff;

    /* renamed from: l */
    public boolean f903l;

    /* renamed from: m */
    public MapTile[] f904m;

    /* renamed from: n */
    static final Rect f891n = new Rect();

    /* renamed from: a */
    public MapTile clone() {
        MapTile tile = new MapTile();
        tile.f892a = this.f892a;
        tile.f893b = this.f893b;
        tile.water = this.water;
        tile.waterBridge = this.waterBridge;
        tile.f898g = this.f898g;
        tile.cliff = this.cliff;
        tile.nresPool = this.nresPool;
        tile.pathCost = this.pathCost;
        tile.largeCliff = this.largeCliff;
        tile.f903l = this.f903l;
        return tile;
    }

    /* renamed from: a */
    public static void m4069a(String str) {
        GameEngine.log(str);
        GameEngine.getInstance().alert("Missing unit data while loading map: " + str, 1);
        try {
            Thread.sleep(2L);
        } catch (InterruptedException e) {
        }
    }

    /* renamed from: a */
    public static MapTile createMapTile(Map map, MapLayer map2, TileSet layer, int tileset, short index, short x, boolean y) {
        String str;
        Team team;
        Properties properties = layer.getProperties(layer.firstGID + tileset);
        if (properties != null) {
            String showFogString = properties.getProperty("showFog");
            if (showFogString != null) {
                int parseInt = Integer.parseInt(showFogString);
                GameEngine gameEngine = GameEngine.getInstance();
                map.fromGrid((int) index, (int) x);
                float f = map.returnX + map.f792p;
                float f2 = map.returnY + map.f793q;
                Map map3 = gameEngine.map;
                Team game = gameEngine.playerTeam;
                map3.m4167a(f, f2, parseInt, game, false);
                return null;
            }
            String property = properties.getProperty("unit");
            String property2 = properties.getProperty("customUnit");
            if (property != null || property2 != null) {
                String property3 = properties.getProperty("team");
                if ("none".equalsIgnoreCase(property3)) {
                    team = Team.getTeam(-1);
                } else if (property3 == null) {
                    GameEngine.log("map", "warning: unit has no team property:" + property + " at: " + ((int) index) + "," + ((int) x));
                    return null;
                } else {
                    team = Team.getTeam(Integer.valueOf(property3).intValue());
                    if (team == null) {
                        GameEngine.log("map", "skipping unit without player:" + property + " at: " + ((int) index) + "," + ((int) x) + " team:" + property3);
                        return null;
                    } else if (team.m3945b()) {
                        GameEngine.log("map", "Unit team is marked as spectator:" + property + " (skipping unit)");
                        return null;
                    }
                }
                C0433j c0433j = null;
                if (property2 != null) {
                    CustomUnitMetadata m3080l = CustomUnitMetadata.m3080l(property2);
                    if (m3080l == null) {
                        String str2 = "Could not find custom unit of:" + property2 + " at x:" + ((int) index) + ", y:" + ((int) x);
                        m4069a(str2);
                        throw new C0173f(str2);
                    }
                    UnitType m3101c = CustomUnitMetadata.m3101c(m3080l);
                    if (m3101c != null) {
                        if (m3101c instanceof CustomUnitMetadata) {
                            m3080l = (CustomUnitMetadata) m3101c;
                        } else {
                            GameEngine.log("replacement not a custom unit:" + m3101c.mo3087i());
                        }
                    }
                    c0433j = CustomUnitMetadata.m3109a(false, m3080l);
                    if (c0433j == null) {
                        String str3 = "Metadata unit is null for:" + property2;
                        m4069a(str3);
                        throw new C0173f(str3);
                    }
                } else {
                    UnitType m3709a = com.corrodinggames.rts.game.units.UnitType.m3709a(property);
                    if (m3709a != null) {
                        c0433j = m3709a.createUnit();
                    }
                    if (c0433j == null && "scoutShip".equalsIgnoreCase(property)) {
                        c0433j = new MissileShip(false);
                    }
                    if (c0433j == null) {
                        String str4 = "Could not find unit:" + property + " at: " + ((int) index) + "," + ((int) x);
                        m4069a(str4);
                        throw new C0173f(str4);
                    }
                }
                map.fromGrid((int) index, (int) x);
                c0433j.x = map.returnX + c0433j.mo2897cV();
                c0433j.y = map.returnY + c0433j.mo2896cW();
                if (team != null) {
                    c0433j.mo2537b(team);
                    if (properties.getProperty("type") != null) {
                        c0433j.type(properties.getProperty("type"));
                    }
                    if (properties.getProperty("randomRotate") != null) {
                        c0433j.direction = CommonUtils.m1723a(c0433j, -180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT);
                    }
                    c0433j.f1605bG = "builder".equalsIgnoreCase(property) || "builder".equalsIgnoreCase(property2);
                    c0433j.f1606bH = "commandCenter".equalsIgnoreCase(property) || "commandCenter".equalsIgnoreCase(property2);
                    c0433j.f1603bE = true;
                    c0433j.mo2861n();
                    Team.m3924c(c0433j);
                    GameObject.m421dG();
                    return null;
                }
                throw new C0173f("team has not been set for:" + property);
            } else if (map2 != null && map2.nameLower.equals("units")) {
                Log.e("RustedWarfare", "non unit on units layer at:" + ((int) index) + "," + ((int) x));
                return null;
            }
        }
        MapTile mapTile = new MapTile();
        mapTile.f892a = layer;
        layer.f944o = true;
        if (map2 != null && !map2.f885r) {
            layer.f946q = true;
        }
        if (y) {
            layer.f945p = true;
        }
        mapTile.f893b = tileset;
        if (properties != null) {
            if (properties.getProperty("water") != null) {
                mapTile.water = true;
            }
            if (properties.getProperty("water-bridge") != null) {
                mapTile.waterBridge = true;
            }
            if (properties.getProperty("lava") != null || properties.getProperty("lava-cliff") != null) {
                mapTile.f898g = true;
                if (properties.getProperty("lava-cliff") != null) {
                    mapTile.cliff = true;
                }
            }
            if (properties.getProperty("cliff-soft") != null) {
                mapTile.cliff = true;
            }
            if (properties.getProperty("cliff") != null) {
                mapTile.cliff = true;
            }
            if (properties.getProperty("large-cliff") != null) {
                mapTile.largeCliff = true;
            }
            if (properties.getProperty("trees") != null) {
                mapTile.largeCliff = true;
            }
            if (properties.getProperty("res_pool") != null) {
                mapTile.nresPool = true;
            }
            if (properties.getProperty("tree") != null) {
            }
            if (properties.getProperty("small-rock") != null) {
                mapTile.pathCost = (byte) 40;
            }
            if (properties.getProperty("large-rock") != null) {
                mapTile.pathCost = (byte) -1;
            }
            if (properties.getProperty("block-land") != null) {
                mapTile.pathCost = (byte) -1;
            }
            if (properties.getProperty("block-buildings") != null) {
                mapTile.f903l = true;
            }
        }
        int i = 0;
        int i2 = 0;
        if (mapTile.f892a != null && (str = mapTile.f892a.f930b) != null) {
            if (mapTile.f893b == 0 && str.equals("shallowwater.png")) {
                i = 5;
            }
            if (mapTile.f893b == 0 && str.equals("deepwater.png")) {
                i = 2;
            }
            if (mapTile.f893b == 0 && str.equals("water.png")) {
                i = 2;
            }
            if (mapTile.f893b == 0 && str.equals("longgrass.png")) {
                i = 3;
            }
            if (mapTile.f893b == 0 && str.equals("mountain.png")) {
                i = 3;
            }
            if (mapTile.f893b == 7 && str.equals("stone.png")) {
                i = 4;
                i2 = 23;
            }
            if (mapTile.f893b != 0 || str.equals("lava.png")) {
            }
            if (mapTile.f893b == 0 && str.equals("snow.png")) {
                i = 2;
            }
        }
        if (properties != null && properties.getProperty("randomTileBy") != null) {
            try {
                i = Integer.parseInt(properties.getProperty("randomTileBy"));
                if (properties.getProperty("randomTileFixedOffset") != null) {
                    try {
                        i2 = Integer.parseInt(properties.getProperty("randomTileFixedOffset"));
                    } catch (NumberFormatException e) {
                        throw new C0173f("(x:" + ((int) index) + "y:" + ((int) x) + ") - randomTileFixedOffset: Unexpected integer value:'" + properties.getProperty("randomTileBy") + "'");
                    }
                }
            } catch (NumberFormatException e2) {
                throw new C0173f("(x:" + ((int) index) + "y:" + ((int) x) + ") - randomTileBy: Unexpected integer value:'" + properties.getProperty("randomTileBy") + "'");
            }
        }
        if (i > 0) {
            MapTile[] mapTileArr = new MapTile[i];
            for (int i3 = 0; i3 < i; i3++) {
                mapTileArr[i3] = mapTile.clone();
                mapTileArr[i3].f893b += i3 + 1 + i2;
            }
            mapTile.f904m = mapTileArr;
        }
        return mapTile;
    }

    MapTile() {
    }

    /* renamed from: a */
    public void m4070a(Graphics graphics, RectF rectF, float f, Paint paint) {
        TileSet tileSet = this.f892a;
        graphics.mo190a(tileSet.f929a, tileSet.m4048b(this.f893b), rectF, paint);
    }
}