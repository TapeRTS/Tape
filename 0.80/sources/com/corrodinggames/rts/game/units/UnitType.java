package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.air.AirShip;
import com.corrodinggames.rts.game.units.air.GunShip;
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
import com.corrodinggames.rts.game.units.land.HoverTank;
import com.corrodinggames.rts.game.units.land.Hovercraft;
import com.corrodinggames.rts.game.units.land.LaserTank;
import com.corrodinggames.rts.game.units.land.MegaTank;
import com.corrodinggames.rts.game.units.land.Tank;
import com.corrodinggames.rts.game.units.water.GunBoat;
import com.corrodinggames.rts.game.units.water.MissileShip;
/* loaded from: classes.jar:com/corrodinggames/rts/game/units/UnitType.class */
public enum UnitType {
    extractor { // from class: com.corrodinggames.rts.game.units.UnitType.1
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new Extractor();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Extractor";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            Extractor.load();
        }
    },
    landFactory { // from class: com.corrodinggames.rts.game.units.UnitType.2
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new LandFactory();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Land Factory";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            LandFactory.load();
        }
    },
    airFactory { // from class: com.corrodinggames.rts.game.units.UnitType.3
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new AirFactory();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Air Factory";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            AirFactory.load();
        }
    },
    seaFactory { // from class: com.corrodinggames.rts.game.units.UnitType.4
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new SeaFactory();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Sea Factory";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            SeaFactory.load();
        }
    },
    commandCenter { // from class: com.corrodinggames.rts.game.units.UnitType.5
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new CommandCenter();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Command";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            CommandCenter.load();
        }
    },
    turret { // from class: com.corrodinggames.rts.game.units.UnitType.6
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new Turret();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Turret";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            Turret.load();
        }
    },
    antiAirTurret { // from class: com.corrodinggames.rts.game.units.UnitType.7
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new AntiAirTurret();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Anti-air Turret";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            AntiAirTurret.load();
        }
    },
    builder { // from class: com.corrodinggames.rts.game.units.UnitType.8
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new Builder();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Builder";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            Builder.load();
        }
    },
    tank { // from class: com.corrodinggames.rts.game.units.UnitType.9
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new Tank();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Tank";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            Tank.load();
        }
    },
    hoverTank { // from class: com.corrodinggames.rts.game.units.UnitType.10
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new HoverTank();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Hover Tank";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            HoverTank.load();
        }
    },
    artillery { // from class: com.corrodinggames.rts.game.units.UnitType.11
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new ArtilleryTank();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Artillery";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            ArtilleryTank.load();
        }
    },
    helicopter { // from class: com.corrodinggames.rts.game.units.UnitType.12
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new Helicopter();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Helicopter";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            Helicopter.load();
        }
    },
    airShip { // from class: com.corrodinggames.rts.game.units.UnitType.13
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new AirShip();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Interceptor";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            AirShip.load();
        }
    },
    gunShip { // from class: com.corrodinggames.rts.game.units.UnitType.14
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new GunShip();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Gun Ship";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            GunShip.load();
        }
    },
    missileShip { // from class: com.corrodinggames.rts.game.units.UnitType.15
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new MissileShip();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Missile Ship";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            MissileShip.load();
        }
    },
    gunBoat { // from class: com.corrodinggames.rts.game.units.UnitType.16
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new GunBoat();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Gun Boat";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            GunBoat.load();
        }
    },
    megaTank { // from class: com.corrodinggames.rts.game.units.UnitType.17
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new MegaTank();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Mega Tank";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            MegaTank.load();
        }
    },
    laserTank { // from class: com.corrodinggames.rts.game.units.UnitType.18
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new LaserTank();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Laser Tank";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            LaserTank.load();
        }
    },
    hovercraft { // from class: com.corrodinggames.rts.game.units.UnitType.19
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new Hovercraft();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Hovercraft";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            Hovercraft.load();
        }
    },
    ladybug { // from class: com.corrodinggames.rts.game.units.UnitType.20
        @Override // com.corrodinggames.rts.game.units.UnitType
        public Unit createInstance() {
            return new LadyBug();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public String getText() {
            return "Ladybug";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        public void load() {
            LadyBug.load();
        }
    };

    /* synthetic */ UnitType(UnitType unitType) {
        this();
    }

    public static UnitType getFromString(String str) {
        UnitType unitType;
        UnitType[] values = values();
        int length = values.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                unitType = null;
                break;
            }
            UnitType unitType2 = values[i];
            if (unitType2.name().equalsIgnoreCase(str)) {
                unitType = unitType2;
                break;
            }
            i++;
        }
        return unitType;
    }

    public abstract Unit createInstance();

    public abstract String getText();

    public abstract void load();
}
