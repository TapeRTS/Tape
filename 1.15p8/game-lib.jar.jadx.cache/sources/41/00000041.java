package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.air.AirShip;
import com.corrodinggames.rts.game.units.air.AmphibiousJet;
import com.corrodinggames.rts.game.units.air.DropShip;
import com.corrodinggames.rts.game.units.air.GunShip;
import com.corrodinggames.rts.game.units.air.Helicopter;
import com.corrodinggames.rts.game.units.alien.LadyBug;
import com.corrodinggames.rts.game.units.buildings.AirFactory;
import com.corrodinggames.rts.game.units.buildings.AntinukeLauncher;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.buildings.ExperimentalLandFactory;
import com.corrodinggames.rts.game.units.buildings.Extractor;
import com.corrodinggames.rts.game.units.buildings.Fabricator;
import com.corrodinggames.rts.game.units.buildings.LandFactory;
import com.corrodinggames.rts.game.units.buildings.LaserDefence;
import com.corrodinggames.rts.game.units.buildings.NukeLauncher;
import com.corrodinggames.rts.game.units.buildings.Repairbay;
import com.corrodinggames.rts.game.units.buildings.SeaFactory;
import com.corrodinggames.rts.game.units.buildings.SupplyDepot;
import com.corrodinggames.rts.game.units.buildings.Turrets.AntiAir;
import com.corrodinggames.rts.game.units.buildings.Turrets.Turret;
import com.corrodinggames.rts.game.units.buildings.Wall;
import com.corrodinggames.rts.game.units.custom.C0385bb;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.ValueList;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.land.Artillery;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.land.ExperimentalHovertank;
import com.corrodinggames.rts.game.units.land.ExperimentalTank;
import com.corrodinggames.rts.game.units.land.HeavyHovertank;
import com.corrodinggames.rts.game.units.land.HeavyTank;
import com.corrodinggames.rts.game.units.land.HoverTank;
import com.corrodinggames.rts.game.units.land.LandingCraft;
import com.corrodinggames.rts.game.units.land.LaserTank;
import com.corrodinggames.rts.game.units.land.MammothTank;
import com.corrodinggames.rts.game.units.land.MegaTank;
import com.corrodinggames.rts.game.units.land.Tank;
import com.corrodinggames.rts.game.units.land.TankDestroyer;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.game.units.p012a.C0225z;
import com.corrodinggames.rts.game.units.water.AttackSubmarine;
import com.corrodinggames.rts.game.units.water.BattleShip;
import com.corrodinggames.rts.game.units.water.BuilderShip;
import com.corrodinggames.rts.game.units.water.GunBoat;
import com.corrodinggames.rts.game.units.water.MissileShip;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.Graphics;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.al */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/al.class */
public enum UnitType implements com.corrodinggames.rts.game.units.UnitType {
    extractor { // from class: com.corrodinggames.rts.game.units.al.1
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Extractor(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Extractor.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 700;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getUpgradePrice(int i) {
            if (i == 2) {
                return 1200;
            }
            if (i == 3) {
                return 2500;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: p */
        public boolean mo3073p() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public int mo3130a(Unit unit) {
            if (unit.m3750cH()) {
                return 110;
            }
            return 0;
        }
    },
    landFactory { // from class: com.corrodinggames.rts.game.units.al.12
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new LandFactory(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            LandFactory.m2904b();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 700;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getUpgradePrice(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo3698a(ArrayList arrayList, int i) {
            LandFactory.m2905a(arrayList, i);
        }
    },
    airFactory { // from class: com.corrodinggames.rts.game.units.al.23
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new AirFactory(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            AirFactory.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getUpgradePrice(int i) {
            if (i == 2) {
                return 1500;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo3698a(ArrayList arrayList, int i) {
            AirFactory.m3038a(arrayList, i);
        }
    },
    seaFactory { // from class: com.corrodinggames.rts.game.units.al.34
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new SeaFactory(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            SeaFactory.m2880b();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getUpgradePrice(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 7.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo3698a(ArrayList arrayList, int i) {
            SeaFactory.m2881a(arrayList, i);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public int mo3130a(Unit unit) {
            return 110;
        }
    },
    commandCenter { // from class: com.corrodinggames.rts.game.units.al.45
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new CommandCenter(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            CommandCenter.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 3000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 5.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo3698a(ArrayList arrayList, int i) {
            CommandCenter.m2970a(arrayList, i);
        }
    },
    turret { // from class: com.corrodinggames.rts.game.units.al.50
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Turret(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Turret.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 6.0E-4f;
        }
    },
    antiAirTurret { // from class: com.corrodinggames.rts.game.units.al.51
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new AntiAir(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            AntiAir.m3035b();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 8.0E-4f;
        }
    },
    builder { // from class: com.corrodinggames.rts.game.units.al.52
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Builder(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Builder.m2855K();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: l */
        public boolean mo3081l() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: m */
        public boolean mo3079m() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: n */
        public boolean mo3077n() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo3698a(ArrayList arrayList, int i) {
            Builder.m2853a(arrayList, i);
            SandBoxAct.m2750a((ArrayList) null, i);
        }
    },
    tank { // from class: com.corrodinggames.rts.game.units.al.53
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Tank(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Tank.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 350;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.002f;
        }
    },
    hoverTank { // from class: com.corrodinggames.rts.game.units.al.2
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new HoverTank(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            HoverTank.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 450;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.002f;
        }
    },
    artillery { // from class: com.corrodinggames.rts.game.units.al.3
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Artillery(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Artillery.m2856c();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 900;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.0014f;
        }
    },
    helicopter { // from class: com.corrodinggames.rts.game.units.al.4
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Helicopter(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Helicopter.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 650;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.0012f;
        }
    },
    airShip { // from class: com.corrodinggames.rts.game.units.al.5
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new AirShip(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            AirShip.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.002f;
        }
    },
    gunShip { // from class: com.corrodinggames.rts.game.units.al.6
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new GunShip(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            GunShip.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: g */
        public int mo3091g() {
            return 2;
        }
    },
    missileShip { // from class: com.corrodinggames.rts.game.units.al.7
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new MissileShip(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            MissileShip.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 900;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }
    },
    gunBoat { // from class: com.corrodinggames.rts.game.units.al.8
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new GunBoat(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            GunBoat.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 300;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.005f;
        }
    },
    megaTank { // from class: com.corrodinggames.rts.game.units.al.9
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new MegaTank(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            MegaTank.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.0015f;
        }
    },
    laserTank { // from class: com.corrodinggames.rts.game.units.al.10
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new LaserTank(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            LaserTank.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 1300;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.0013f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: g */
        public int mo3091g() {
            return 2;
        }
    },
    hovercraft { // from class: com.corrodinggames.rts.game.units.al.11
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new LandingCraft(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            LandingCraft.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.003f;
        }
    },
    ladybug { // from class: com.corrodinggames.rts.game.units.al.13
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new LadyBug(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            LadyBug.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 400;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.004f;
        }
    },
    battleShip { // from class: com.corrodinggames.rts.game.units.al.14
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new BattleShip(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            BattleShip.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }
    },
    tankDestroyer { // from class: com.corrodinggames.rts.game.units.al.15
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new TankDestroyer(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            TankDestroyer.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.003f;
        }
    },
    heavyTank { // from class: com.corrodinggames.rts.game.units.al.16
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new HeavyTank(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            HeavyTank.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.0011f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: g */
        public int mo3091g() {
            return 2;
        }
    },
    heavyHoverTank { // from class: com.corrodinggames.rts.game.units.al.17
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new HeavyHovertank(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            HeavyHovertank.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: g */
        public int mo3091g() {
            return 2;
        }
    },
    laserDefence { // from class: com.corrodinggames.rts.game.units.al.18
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new LaserDefence(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            LaserDefence.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 1200;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getUpgradePrice(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }
    },
    dropship { // from class: com.corrodinggames.rts.game.units.al.19
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new DropShip(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            DropShip.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: g */
        public int mo3091g() {
            return 2;
        }
    },
    tree { // from class: com.corrodinggames.rts.game.units.al.20
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Tree(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Tree.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.0025f;
        }
    },
    repairbay { // from class: com.corrodinggames.rts.game.units.al.21
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Repairbay(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Repairbay.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }
    },
    NukeLaucher { // from class: com.corrodinggames.rts.game.units.al.22
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new NukeLauncher(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            NukeLauncher.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 45000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 1.0E-4f;
        }
    },
    AntiNukeLaucher { // from class: com.corrodinggames.rts.game.units.al.24
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new AntinukeLauncher(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            AntinukeLauncher.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 15000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 7.0E-4f;
        }
    },
    mammothTank { // from class: com.corrodinggames.rts.game.units.al.25
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new MammothTank(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            MammothTank.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 3900;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 9.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: g */
        public int mo3091g() {
            return 3;
        }
    },
    experimentalTank { // from class: com.corrodinggames.rts.game.units.al.26
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new ExperimentalTank(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            ExperimentalTank.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 14000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 2.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: g */
        public int mo3091g() {
            return 3;
        }
    },
    experimentalLandFactory { // from class: com.corrodinggames.rts.game.units.al.27
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new ExperimentalLandFactory(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            ExperimentalLandFactory.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 11000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 3.5E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo3698a(ArrayList arrayList, int i) {
            ExperimentalLandFactory.m2965a(arrayList, i);
        }
    },
    crystalResource { // from class: com.corrodinggames.rts.game.units.al.28
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Crystal(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Crystal.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 5000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }
    },
    wall_v { // from class: com.corrodinggames.rts.game.units.al.29
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Wall(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Wall.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 100;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.003f;
        }
    },
    fabricator { // from class: com.corrodinggames.rts.game.units.al.30
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Fabricator(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Fabricator.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getUpgradePrice(int i) {
            if (i == 2) {
                return 3000;
            }
            if (i == 3) {
                return 5000;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 6.0E-4f;
        }
    },
    attackSubmarine { // from class: com.corrodinggames.rts.game.units.al.31
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new AttackSubmarine(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            AttackSubmarine.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }
    },
    builderShip { // from class: com.corrodinggames.rts.game.units.al.32
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new BuilderShip(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            BuilderShip.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: l */
        public boolean mo3081l() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: m */
        public boolean mo3079m() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo3698a(ArrayList arrayList, int i) {
            BuilderShip.m2726a(arrayList, i);
        }
    },
    amphibiousJet { // from class: com.corrodinggames.rts.game.units.al.33
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new AmphibiousJet(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            AmphibiousJet.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 2000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: g */
        public int mo3091g() {
            return 2;
        }
    },
    supplyDepot { // from class: com.corrodinggames.rts.game.units.al.35
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new SupplyDepot(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            SupplyDepot.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.001f;
        }
    },
    experimentalHoverTank { // from class: com.corrodinggames.rts.game.units.al.36
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new ExperimentalHovertank(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            ExperimentalHovertank.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 21000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 2.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: g */
        public int mo3091g() {
            return 3;
        }
    },
    turret_artillery { // from class: com.corrodinggames.rts.game.units.al.37
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            Turret turret = new Turret(z);
            turret.type("artillery");
            return turret;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return UnitType.turret.getPrice() + Turret.f3218dL.getPrice();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 6.0E-4f;
        }
    },
    turret_flamethrower { // from class: com.corrodinggames.rts.game.units.al.38
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            Turret turret = new Turret(z);
            turret.type("flamethrower");
            return turret;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return UnitType.turret.getPrice() + Turret.f3219dM.getPrice();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 6.0E-4f;
        }
    },
    fogRevealer { // from class: com.corrodinggames.rts.game.units.al.39
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new FogRevealer(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            FogRevealer.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 6.0E-4f;
        }
    },
    spreadingFire { // from class: com.corrodinggames.rts.game.units.al.40
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Fire(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Fire.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 6.0E-4f;
        }
    },
    antiAirTurretT2 { // from class: com.corrodinggames.rts.game.units.al.41
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            AntiAir antiAir = new AntiAir(z);
            antiAir.upgrade(2);
            return antiAir;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return UnitType.turret.getPrice() + AntiAir.f3191e.getPrice();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 6.0E-4f;
        }
    },
    turretT2 { // from class: com.corrodinggames.rts.game.units.al.42
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            Turret turret = new Turret(z);
            turret.type("gunT2");
            return turret;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return UnitType.turret.getPrice() + Turret.f3216dJ.getPrice();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 6.0E-4f;
        }
    },
    turretT3 { // from class: com.corrodinggames.rts.game.units.al.43
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: j */
        public boolean mo3085j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            Turret turret = new Turret(z);
            turret.type("gunT3");
            return turret;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return UnitType.turret.getPrice() + Turret.f3216dJ.getPrice() + Turret.f3217dK.getPrice();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 3.0E-4f;
        }
    },
    damagingBorder { // from class: com.corrodinggames.rts.game.units.al.44
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: A */
        public boolean mo3700A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new ZoneMarkerOrDamagingBorder(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            ZoneMarkerOrDamagingBorder.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 6.0E-4f;
        }
    },
    zoneMarker { // from class: com.corrodinggames.rts.game.units.al.46
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: A */
        public boolean mo3700A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            ZoneMarkerOrDamagingBorder zoneMarkerOrDamagingBorder = new ZoneMarkerOrDamagingBorder(z);
            zoneMarkerOrDamagingBorder.isZoneMarker = true;
            return zoneMarkerOrDamagingBorder;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            ZoneMarkerOrDamagingBorder.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 6.0E-4f;
        }
    },
    editorOrBuilder { // from class: com.corrodinggames.rts.game.units.al.47
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: A */
        public boolean mo3700A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new SandBoxAct(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: l */
        public boolean mo3081l() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: m */
        public boolean mo3079m() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: n */
        public boolean mo3077n() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo3698a(ArrayList arrayList, int i) {
        }
    },
    dummyNonUnitWithTeam { // from class: com.corrodinggames.rts.game.units.al.48
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: e */
        public String mo3095e() {
            return mo3087i();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: i */
        public String mo3087i() {
            return "marker";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: A */
        public boolean mo3700A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: C */
        public boolean mo3136C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new DummyNonUnitWithTeam(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            DummyNonUnitWithTeam.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.UnitType
        /* renamed from: c */
        public int getPrice() {
            return 9999;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: D */
        public float mo3135D() {
            return 1.0f;
        }
    };
    

    /* renamed from: aa */
    C0225z f1730aa;

    /* renamed from: ab */
    int f1731ab;

    /* renamed from: ac */
    String f1732ac;

    /* renamed from: ad */
    String f1733ad;

    /* renamed from: ae */
    public static ArrayList f1702ae;

    /* renamed from: af */
    C0292an[] f1734af;

    /* renamed from: ag */
    public static boolean f1703ag;

    /* renamed from: ah */
    C0407b f1735ah;

    /* renamed from: a */
    public abstract Unit createInstance(boolean z);

    /* renamed from: b */
    public abstract void load();

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: c */
    public abstract int getPrice();

    UnitType() {
        this.f1730aa = new C0225z(this);
        this.f1731ab = -1;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: a */
    public Unit createUnit() {
        return createInstance(false);
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: d */
    public C0225z mo3098d() {
        return this.f1730aa;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: e */
    public String mo3095e() {
        if (this.f1731ab != LangLocale.f4969c || this.f1732ac == null) {
            this.f1731ab = LangLocale.f4969c;
            String str = "units." + name() + ".name";
            this.f1732ac = LangLocale.getI18NTextOrDefault(str, null, new Object[0]);
            if (this.f1732ac == null) {
                if (GameEngine.getInstance().m863ao() && !mo3700A()) {
                    throw new RuntimeException("Can't find translation text for: " + str);
                }
                this.f1732ac = name();
            }
        }
        return this.f1732ac;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: f */
    public String mo3093f() {
        if (this.f1731ab != LangLocale.f4969c || this.f1733ad == null) {
            this.f1731ab = LangLocale.f4969c;
            String str = "units." + name() + ".description";
            this.f1733ad = LangLocale.getI18NTextOrDefault(str, null, new Object[0]);
            if (this.f1733ad == null) {
                if (GameEngine.getInstance().m863ao() && !mo3700A()) {
                    throw new RuntimeException("Can't find translation text for: " + str);
                }
                this.f1733ad = VariableScope.nullOrMissingString;
            }
        }
        return this.f1733ad;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: g */
    public int mo3091g() {
        return 1;
    }

    /* renamed from: a */
    public void mo3698a(ArrayList arrayList, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: h */
    public void mo3089h() {
        C0292an[] c0292anArr = new C0292an[3];
        for (int i = 1; i <= 3; i++) {
            C0292an c0292an = new C0292an();
            mo3698a(c0292an.f1736a, i);
            c0292anArr[i - 1] = c0292an;
        }
        this.f1734af = c0292anArr;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: a */
    public ArrayList mo3132a(int level) {
        if (level > 3) {
            throw new RuntimeException("Tech level:" + level + " greater than maxTechLevel");
        }
        return this.f1734af[level - 1].f1736a;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: i */
    public String mo3087i() {
        return name();
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: j */
    public boolean mo3085j() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: k */
    public boolean mo3083k() {
        return mo3085j();
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: l */
    public boolean mo3081l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: m */
    public boolean mo3079m() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: n */
    public boolean mo3077n() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: o */
    public MovementType mo3075o() {
        Unit m3777a = Unit.m3777a(this);
        if (m3777a == null) {
            throw new RuntimeException("Shared unit is null for:" + name());
        }
        return m3777a.getMovementType();
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: p */
    public boolean mo3073p() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: q */
    public C0385bb mo3071q() {
        return null;
    }

    /* renamed from: a */
    public static com.corrodinggames.rts.game.units.UnitType m3709a(String str) {
        return m3705a(str, true);
    }

    /* renamed from: a */
    public static com.corrodinggames.rts.game.units.UnitType m3705a(String str, boolean z) {
        UnitType[] values;
        com.corrodinggames.rts.game.units.UnitType m3082k;
        if (z && (m3082k = CustomUnitMetadata.m3082k(str)) != null) {
            return m3082k;
        }
        for (UnitType unitType : values()) {
            if (unitType.name().equalsIgnoreCase(str)) {
                return unitType;
            }
        }
        CustomUnitMetadata m3080l = CustomUnitMetadata.m3080l(str);
        if (m3080l != null) {
            return m3080l;
        }
        return null;
    }

    /* renamed from: a */
    private static String m3708a(String str, float f) {
        return m3707a(str, f, VariableScope.nullOrMissingString);
    }

    /* renamed from: a */
    private static String m3707a(String str, float f, String str2) {
        String str3 = VariableScope.nullOrMissingString + f;
        if (f % 1.0f == 0.0f) {
            str3 = VariableScope.nullOrMissingString + ((int) f);
        }
        return m3706a(str, str3, str2);
    }

    /* renamed from: a */
    private static String m3706a(String str, String str2, String str3) {
        return str + ": " + str2 + str3 + "\n";
    }

    /* renamed from: a */
    private static int m3710a(OrderableUnit orderableUnit) {
        Action a;
        C0202c ck = orderableUnit.mo2870ck();
        if (ck != null && (a = orderableUnit.mo3219a(ck)) != null) {
            return a.getPrice();
        }
        return 0;
    }

    /* renamed from: r */
    public static void m3704r() {
        new File("output_all_unit_images/").mkdirs();
        for (int i = 0; i < 50; i++) {
            GameEngine.PrintLOG_err("running outputUnitImages()");
        }
        String[] strArr = {"carrier", "experimentalGunship", "experimentalGunshipLanded", "mech_gun", "ladybug", "spiderBot", "wall_v", "crystalResource", "test_tank", "missing", "fogRevealer", "supplyDepot", "tankDestroyer", "megaTank", "crystal_mid", "mechFlyingLanded"};
        Iterator it = f1702ae.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.UnitType unitType = (com.corrodinggames.rts.game.units.UnitType) it.next();
            Unit m3777a = Unit.m3777a(unitType);
            if ((m3777a instanceof OrderableUnit) && !unitType.mo3087i().startsWith("bug") && CustomUnitMetadata.m3101c(unitType) == null && (!(unitType instanceof CustomUnitMetadata) || ((CustomUnitMetadata) unitType).core_showInEditor)) {
                OrderableUnit orderableUnit = (OrderableUnit) m3777a;
                boolean z = false;
                for (String str : strArr) {
                    if (str.equals(unitType.mo3087i())) {
                        z = true;
                    }
                }
                if (!z) {
                    String str2 = "output_all_unit_images/" + unitType.mo3087i().replace("/", "_").replace("\\", "_") + ".png";
                    GameEngine gameEngine = GameEngine.getInstance();
                    BitmapOrTexture mo161b = gameEngine.graphics.mo161b(100, 100, true);
                    Graphics mo199a = gameEngine.graphics.mo199a(mo161b);
                    Graphics graphics = gameEngine.graphics;
                    gameEngine.graphics = mo199a;
                    m3711a(unitType, mo161b.f5668q, mo161b.f5669r, 0.0f, 0.0f, Team.getTeam(0), 20.0f, 100, false, false, 1, true);
                    gameEngine.graphics = graphics;
                    mo199a.mo130o();
                    gameEngine.graphics.mo188a(mo161b, new File(str2));
                }
            }
        }
    }

    /* renamed from: s */
    public static void m3703s() {
        int m3710a;
        int m3710a2;
        for (int i = 0; i < 50; i++) {
            GameEngine.PrintLOG_err("running printForHelp()");
        }
        String[] strArr = {"carrier", "experimentalGunship", "experimentalGunshipLanded", "mech_gun", "ladybug", "spiderBot", "wall_v", "crystalResource", "test_tank", "missing", "fogRevealer", "supplyDepot", "tankDestroyer", "megaTank", "crystal_mid", "mechFlyingLanded"};
        String str = VariableScope.nullOrMissingString;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f1702ae);
        Collections.sort(arrayList, new Comparator() { // from class: com.corrodinggames.rts.game.units.al.49
            /* renamed from: a */
            public int compare(com.corrodinggames.rts.game.units.UnitType unitType, com.corrodinggames.rts.game.units.UnitType unitType2) {
                return unitType.mo3067u().m3399a(unitType2.mo3067u());
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            com.corrodinggames.rts.game.units.UnitType unitType = (com.corrodinggames.rts.game.units.UnitType) it.next();
            Unit m3777a = Unit.m3777a(unitType);
            if ((m3777a instanceof OrderableUnit) && !unitType.mo3087i().startsWith("bug") && CustomUnitMetadata.m3101c(unitType) == null && (!(unitType instanceof CustomUnitMetadata) || ((CustomUnitMetadata) unitType).core_showInEditor)) {
                if (unitType != editorOrBuilder) {
                    OrderableUnit orderableUnit = (OrderableUnit) m3777a;
                    boolean z = false;
                    for (String str2 : strArr) {
                        if (str2.equals(unitType.mo3087i())) {
                            z = true;
                        }
                    }
                    if (!z) {
                        String str3 = ((((((str + "\n") + "<div class=\"unit\">\n") + "<img src=\"unit:" + unitType.mo3087i() + "\" />\n") + "<h4>" + unitType.mo3095e() + "</h4>\n") + "<p>" + unitType.mo3093f().replace("\n", "<br/>") + "</p>\n") + "<pre>") + m3706a("Price", "$" + unitType.getPrice(), VariableScope.nullOrMissingString);
                        if (m3710a(orderableUnit) > 0) {
                            str3 = str3 + m3706a("T2 Upgrade Price", "$" + m3710a, VariableScope.nullOrMissingString);
                            OrderableUnit orderableUnit2 = (OrderableUnit) unitType.createUnit();
                            orderableUnit2.upgrade(2);
                            if (orderableUnit2.mo2647U() == 2 && (m3710a2 = m3710a(orderableUnit2)) > 0) {
                                str3 = str3 + m3706a("T3 Upgrade Price", "$" + m3710a2, VariableScope.nullOrMissingString);
                            }
                        }
                        String str4 = (((str3 + m3708a("Hp", orderableUnit.maxHp)) + m3708a("Speed", orderableUnit.getMoveSpeed())) + m3708a("Turn speed", orderableUnit.getTurnSpeed())) + m3708a("Mass", orderableUnit.getMass());
                        if (orderableUnit.canAttack()) {
                            str4 = (str4 + m3708a("Shoot Delay", orderableUnit.getShootDelay(0))) + m3708a("Attack Range", orderableUnit.getMaxAttackRange());
                            float f = 0.0f;
                            float f2 = 0.0f;
                            float f3 = 0.0f;
                            float f4 = 0.0f;
                            int mo2512bk = orderableUnit.mo2512bk();
                            for (int i2 = 0; i2 < mo2512bk; i2++) {
                                int i3 = Projectile.f1024a.size;
                                orderableUnit.fireProjectile((Unit) orderableUnit, i2);
                                if (i3 != Projectile.f1024a.size) {
                                    Projectile projectile = (Projectile) Projectile.f1024a.get(Projectile.f1024a.size - 1);
                                    if (projectile.directDamage > f) {
                                        f = projectile.directDamage;
                                    }
                                    if (projectile.f973Y > f2) {
                                        f2 = projectile.f973Y;
                                    }
                                    f3 += projectile.directDamage;
                                    f4 += projectile.f973Y;
                                }
                            }
                            if (f3 != 0.0f) {
                                String str5 = VariableScope.nullOrMissingString;
                                if (f3 != f) {
                                    str5 = " (total:" + f3 + ")";
                                }
                                str4 = str4 + m3707a("Direct Damage", f, str5);
                            }
                            if (f4 != 0.0f) {
                                String str6 = VariableScope.nullOrMissingString;
                                if (f4 != f2) {
                                    str6 = " (total:" + f4 + ")";
                                }
                                str4 = str4 + m3707a("Area Damage", f2, str6);
                            }
                        }
                        str = (str4 + "</pre>") + "</div>\n";
                    }
                }
            }
        }
        GameEngine.PrintLOG(str);
    }

    /* renamed from: t */
    public static void m3702t() {
        UnitType[] values;
        for (UnitType unitType : values()) {
            unitType.name();
            unitType.mo3095e();
            unitType.mo3093f();
        }
    }

    /* renamed from: a */
    public static boolean m3713a(com.corrodinggames.rts.game.units.UnitType unitType, float f, float f2, float f3, float f4, Team team) {
        GameEngine.getInstance();
        Unit m3777a = Unit.m3777a(unitType);
        if (m3777a == null) {
            GameEngine.PrintLOG("isValidHere: Failed to get unit from type:" + unitType);
            return false;
        }
        m3777a.mo2537b(team);
        m3777a.height = f4;
        m3777a.x = f;
        m3777a.y = f2;
        if (!m3777a.mo2975bH()) {
            m3777a.direction = f3;
            if (m3777a instanceof OrderableUnit) {
                ((OrderableUnit) m3777a).m2467j(f3);
            }
        }
        boolean z = true;
        if (m3777a instanceof OrderableUnit) {
            z = ((OrderableUnit) m3777a).mo2493c(team);
        }
        m3777a.height = 0.0f;
        m3777a.direction = 0.0f;
        return z;
    }

    /* renamed from: a */
    public static void m3712a(com.corrodinggames.rts.game.units.UnitType unitType, float f, float f2, float f3, float f4, Team team, float f5, float f6, boolean z, boolean z2, int i) {
        m3711a(unitType, f, f2, f3, f4, team, f5, f6, z, z2, i, true);
    }

    /* renamed from: a */
    public static void m3711a(com.corrodinggames.rts.game.units.UnitType unitType, float f, float f2, float f3, float f4, Team team, float f5, float f6, boolean z, boolean z2, int i, boolean z3) {
        GameEngine gameEngine = GameEngine.getInstance();
        Unit m3756c = Unit.m3756c(unitType);
        boolean mo2975bH = m3756c.mo2975bH();
        m3756c.mo2537b(team);
        if (m3756c instanceof OrderableUnit) {
            ((OrderableUnit) m3756c).upgrade(i);
        }
        m3756c.height = f4;
        if (m3756c.getMovementType() == MovementType.f1648f || m3756c.getMovementType() == MovementType.f1649g || m3756c.getMovementType() == MovementType.f1650h) {
            m3756c.height += 4.0f;
        }
        if (m3756c.getMovementType() == MovementType.f1646d) {
            m3756c.height += 10.0f;
        }
        if (!mo2975bH) {
            m3756c.direction = f3;
            if (m3756c instanceof OrderableUnit) {
                ((OrderableUnit) m3756c).m2467j(f3);
            }
        } else {
            m3756c.direction = -90.0f;
        }
        boolean z4 = true;
        boolean z5 = m3756c.f1621cg;
        m3756c.f1621cg = true;
        m3756c.f1624cj = false;
        m3756c.f1625ck = false;
        if (!z3) {
            m3756c.f1625ck = true;
        }
        m3756c.f1620cf = false;
        m3756c.f1622ch = false;
        m3756c.f1623ci = false;
        if (z || z2) {
            m3756c.f1622ch = z2;
            m3756c.f1623ci = z;
            z4 = false;
        } else {
            m3756c.f1620cf = true;
        }
        if (!z4) {
            m3756c.x = f;
            m3756c.y = f2;
        } else {
            m3756c.x = gameEngine.viewpointX_rounded + f;
            m3756c.y = gameEngine.viewpointY_rounded + f2;
        }
        float f7 = m3756c.radius * 2.0f * 0.8f;
        if (m3756c instanceof OrderableUnit) {
            OrderableUnit orderableUnit = (OrderableUnit) m3756c;
            if (orderableUnit.image != null) {
                float cB = orderableUnit.objectHeight * orderableUnit.mo3194cB();
                if (cB > f7) {
                    f7 = cB;
                }
            }
        }
        float f8 = 1.0f;
        if (f7 < f5) {
            f8 = f5 / f7;
        }
        if (f7 > f6) {
            f8 = f6 / f7;
        }
        gameEngine.graphics.mo135j();
        if (z4) {
        }
        if (f8 != 1.0f) {
            gameEngine.graphics.mo222a(f8, f8, f, f2);
        }
        if (f8 < 1.0f) {
            f1703ag = true;
        } else {
            f1703ag = false;
        }
        m3756c.mo423d(0.0f);
        m3756c.draw(0.0f);
        m3756c.mo431a(0.0f, false);
        gameEngine.graphics.mo134k();
        m3756c.height = 0.0f;
        if (!mo2975bH) {
            m3756c.direction = 0.0f;
        } else {
            m3756c.direction = -90.0f;
        }
        if (m3756c instanceof OrderableUnit) {
            OrderableUnit orderableUnit2 = (OrderableUnit) m3756c;
            orderableUnit2.m2467j(0.0f);
            orderableUnit2.upgrade(1);
        }
        m3756c.f1622ch = false;
        m3756c.f1623ci = false;
        m3756c.f1621cg = z5;
        m3756c.f1620cf = false;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: b */
    public int mo3107b(int i) {
        int price = getPrice();
        if (i >= 2) {
            price += getUpgradePrice(2);
        }
        if (i >= 3) {
            price += getUpgradePrice(2);
        }
        return price;
    }

    /* renamed from: c */
    public int getUpgradePrice(int i) {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: u */
    public C0407b mo3067u() {
        int price = getPrice();
        if (price == 0) {
            return C0407b.f2549a;
        }
        if (this.f1735ah == null || this.f1735ah.m3406a() != price) {
            this.f1735ah = C0407b.m3405a(price);
        }
        return this.f1735ah;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: d */
    public C0407b mo3097d(int i) {
        return C0407b.m3405a(mo3107b(i));
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: v */
    public String mo3066v() {
        return name();
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: w */
    public boolean mo3065w() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: x */
    public ValueList mo3064x() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: y */
    public boolean mo3063y() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: z */
    public BitmapOrTexture mo3062z() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: a */
    public int mo3130a(Unit unit) {
        return 0;
    }

    /* renamed from: A */
    public boolean mo3700A() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.UnitType
    /* renamed from: B */
    public C0407b mo3137B() {
        return null;
    }
}