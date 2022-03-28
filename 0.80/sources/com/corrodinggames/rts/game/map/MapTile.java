package com.corrodinggames.rts.game.map;

import android.graphics.Point;
import android.util.Log;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.air.AirShip;
import com.corrodinggames.rts.game.units.air.Helicopter;
import com.corrodinggames.rts.game.units.alien.LadyBug;
import com.corrodinggames.rts.game.units.buildings.AirFactory;
import com.corrodinggames.rts.game.units.buildings.AntiAirTurret;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.buildings.Extractor;
import com.corrodinggames.rts.game.units.buildings.LandFactory;
import com.corrodinggames.rts.game.units.buildings.SeaFactory;
import com.corrodinggames.rts.game.units.buildings.Turret;
import com.corrodinggames.rts.game.units.land.ArtilleryTank;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.land.Hovercraft;
import com.corrodinggames.rts.game.units.land.MegaTank;
import com.corrodinggames.rts.game.units.land.Tank;
import com.corrodinggames.rts.game.units.water.GunBoat;
import com.corrodinggames.rts.game.units.water.MissileShip;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Properties;
/* loaded from: classes.jar:com/corrodinggames/rts/game/map/MapTile.class */
public final class MapTile {
    public boolean cliff;
    public boolean climbable;
    public boolean collideable;
    public int index;
    public boolean largeCliff;
    public Map map;
    public short pathCost;
    public boolean resPool;
    public short tilesetIndex;
    public boolean water;
    public short xIndex;
    public short yIndex;

    MapTile() {
    }

    public static MapTile createMapTile(Map map, MapLayer mapLayer, TileSet tileSet, int i, short s, short s2) {
        MapTile mapTile;
        short s3 = tileSet.index;
        Properties properties = tileSet.getProperties(tileSet.firstGID + i);
        if (properties != null) {
            String property = properties.getProperty("showFog");
            if (property != null) {
                int parseInt = Integer.parseInt(property);
                GameEngine instance = GameEngine.getInstance();
                map.fromGrid(s, s2);
                int i2 = map.returnX;
                map.getClass();
                float f = i2 + 10;
                int i3 = map.returnY;
                map.getClass();
                instance.map.seeThoughFogOfWar(f, i3 + 10, parseInt);
                mapTile = null;
            } else {
                String property2 = properties.getProperty("unit");
                if (property2 != null) {
                    Team team = Team.getTeam(Integer.valueOf(properties.getProperty("team")).intValue());
                    if (team == null) {
                        GameEngine.getInstance();
                        GameEngine.log("map", "skipping unit without team:" + property2);
                        mapTile = null;
                    } else {
                        Unit unit = null;
                        if ("builder".equalsIgnoreCase(property2)) {
                            unit = new Builder();
                        }
                        if ("tank".equalsIgnoreCase(property2)) {
                            unit = new Tank();
                        }
                        if ("artillery".equalsIgnoreCase(property2)) {
                            unit = new ArtilleryTank();
                        }
                        if ("megaTank".equalsIgnoreCase(property2)) {
                            unit = new MegaTank();
                        }
                        if ("helicopter".equalsIgnoreCase(property2)) {
                            unit = new Helicopter();
                        }
                        if ("airShip".equalsIgnoreCase(property2)) {
                            unit = new AirShip();
                        }
                        if ("landFactory".equalsIgnoreCase(property2)) {
                            unit = new LandFactory();
                        }
                        if ("airFactory".equalsIgnoreCase(property2)) {
                            unit = new AirFactory();
                        }
                        if ("commandCenter".equalsIgnoreCase(property2)) {
                            unit = new CommandCenter();
                        }
                        if ("turret".equalsIgnoreCase(property2)) {
                            unit = new Turret();
                        }
                        if ("antiAirTurret".equalsIgnoreCase(property2)) {
                            unit = new AntiAirTurret();
                        }
                        if ("extractor".equalsIgnoreCase(property2)) {
                            unit = new Extractor();
                        }
                        if ("scoutShip".equalsIgnoreCase(property2)) {
                            unit = new MissileShip();
                        }
                        if ("gunShip".equalsIgnoreCase(property2)) {
                            unit = new GunBoat();
                        }
                        if ("hovercraft".equalsIgnoreCase(property2)) {
                            unit = new Hovercraft();
                        }
                        if ("seaFactory".equalsIgnoreCase(property2)) {
                            unit = new SeaFactory();
                        }
                        if ("ladyBug".equalsIgnoreCase(property2)) {
                            unit = new LadyBug();
                        }
                        if (unit == null) {
                            throw new RuntimeException("Could not find match for:" + property2);
                        }
                        map.fromGrid(s, s2);
                        int i4 = map.returnX;
                        map.getClass();
                        unit.x = i4 + 10;
                        int i5 = map.returnY;
                        map.getClass();
                        unit.y = i5 + 10;
                        unit.setTeam(team);
                        unit.createdFromMap = true;
                        unit.fromLoadedMap();
                        mapTile = null;
                    }
                } else if (mapLayer.nameLower.equalsIgnoreCase("units")) {
                    Log.e(GameEngine.TAG, "non unit on units layer at:" + ((int) s) + "," + ((int) s2));
                    mapTile = null;
                }
            }
            return mapTile;
        }
        MapTile mapTile2 = new MapTile();
        mapTile2.map = map;
        mapTile2.tilesetIndex = s3;
        tileSet.usedByTile = true;
        mapTile2.index = i;
        mapTile2.xIndex = s;
        mapTile2.yIndex = s2;
        mapTile2.collideable = true;
        mapTile2.climbable = false;
        if (properties != null) {
            if (properties.getProperty("climbUp") != null) {
                mapTile2.collideable = false;
                mapTile2.climbable = true;
            }
            if (properties.getProperty("water") != null) {
                mapTile2.water = true;
            }
            if (properties.getProperty("cliff-soft") != null) {
                mapTile2.cliff = true;
            }
            if (properties.getProperty("cliff") != null) {
                mapTile2.cliff = true;
            }
            if (properties.getProperty("large-cliff") != null) {
                mapTile2.largeCliff = true;
            }
            if (properties.getProperty("res_pool") != null) {
                mapTile2.resPool = true;
                map.resPools.add(new Point(s, s2));
            }
            if (properties.getProperty("tree") != null) {
                mapTile2.pathCost = (short) 40;
            }
            if (properties.getProperty("small-rock") != null) {
                mapTile2.pathCost = (short) 40;
            }
            if (properties.getProperty("large-rock") != null) {
                mapTile2.pathCost = (short) (-1);
            }
        }
        mapTile = mapTile2;
        return mapTile;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public TileSet getTileset() {
        return this.map.tilesets.get(this.tilesetIndex);
    }

    public int getX() {
        return this.xIndex * this.map.getTileWidth();
    }

    public int getY() {
        return this.yIndex * this.map.getTileHeight();
    }
}
