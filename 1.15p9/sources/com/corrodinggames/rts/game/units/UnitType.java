package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.air.AirShip;
import com.corrodinggames.rts.game.units.air.AmphibiousJet;
import com.corrodinggames.rts.game.units.air.Dropship;
import com.corrodinggames.rts.game.units.air.GunShip;
import com.corrodinggames.rts.game.units.air.Helicopter;
import com.corrodinggames.rts.game.units.alien.Ladybug;
import com.corrodinggames.rts.game.units.buildings.AirFactory;
import com.corrodinggames.rts.game.units.buildings.AntiNukeLaucher;
import com.corrodinggames.rts.game.units.buildings.CommandCenter;
import com.corrodinggames.rts.game.units.buildings.ExperimentalLandFactory;
import com.corrodinggames.rts.game.units.buildings.Extractor;
import com.corrodinggames.rts.game.units.buildings.Fabricator;
import com.corrodinggames.rts.game.units.buildings.LandFactory;
import com.corrodinggames.rts.game.units.buildings.LaserDefence;
import com.corrodinggames.rts.game.units.buildings.NukeLaucher;
import com.corrodinggames.rts.game.units.buildings.Repairbay;
import com.corrodinggames.rts.game.units.buildings.SeaFactory;
import com.corrodinggames.rts.game.units.buildings.SupplyDepot;
import com.corrodinggames.rts.game.units.buildings.WallV;
import com.corrodinggames.rts.game.units.buildings.p025a.AntiAirTurret;
import com.corrodinggames.rts.game.units.buildings.p025a.Turret;
import com.corrodinggames.rts.game.units.custom.C0402bc;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0439f;
import com.corrodinggames.rts.game.units.land.Artillery;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.land.ExperimentalHoverTank;
import com.corrodinggames.rts.game.units.land.ExperimentalTank;
import com.corrodinggames.rts.game.units.land.HeavyTank;
import com.corrodinggames.rts.game.units.land.HoverTank;
import com.corrodinggames.rts.game.units.land.Hovercraft;
import com.corrodinggames.rts.game.units.land.LaserTank;
import com.corrodinggames.rts.game.units.land.MammothTank;
import com.corrodinggames.rts.game.units.land.MegaTank;
import com.corrodinggames.rts.game.units.land.Tank;
import com.corrodinggames.rts.game.units.land.TankDestroyer;
import com.corrodinggames.rts.game.units.land.heavyHoverTank;
import com.corrodinggames.rts.game.units.p013a.Action;
import com.corrodinggames.rts.game.units.p013a.C0208c;
import com.corrodinggames.rts.game.units.p013a.C0231z;
import com.corrodinggames.rts.game.units.water.AttackSubmarine;
import com.corrodinggames.rts.game.units.water.Battleship;
import com.corrodinggames.rts.game.units.water.BuilderShip;
import com.corrodinggames.rts.game.units.water.GunBoat;
import com.corrodinggames.rts.game.units.water.MissileShip;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.ar */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ar.class */
public enum UnitType implements InterfaceC0303as {
    extractor { // from class: com.corrodinggames.rts.game.units.ar.1
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: p */
        public boolean mo5692p() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: a */
        public int mo5708a(Unit unit) {
            if (unit.m5829cI()) {
                return 110;
            }
            return 0;
        }
    },
    landFactory { // from class: com.corrodinggames.rts.game.units.ar.12
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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
            LandFactory.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
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

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo5716a(ArrayList arrayList, int i) {
            LandFactory.m4357a(arrayList, i);
        }
    },
    airFactory { // from class: com.corrodinggames.rts.game.units.ar.23
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
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

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo5716a(ArrayList arrayList, int i) {
            AirFactory.m4666a(arrayList, i);
        }
    },
    seaFactory { // from class: com.corrodinggames.rts.game.units.ar.34
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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
            SeaFactory.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
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

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 7.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo5716a(ArrayList arrayList, int i) {
            SeaFactory.m4257a(arrayList, i);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: a */
        public int mo5708a(Unit unit) {
            return 110;
        }
    },
    commandCenter { // from class: com.corrodinggames.rts.game.units.ar.45
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 3000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 5.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo5716a(ArrayList arrayList, int i) {
            CommandCenter.m4497a(arrayList, i);
        }
    },
    turret { // from class: com.corrodinggames.rts.game.units.ar.50
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 6.0E-4f;
        }
    },
    antiAirTurret { // from class: com.corrodinggames.rts.game.units.ar.51
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new AntiAirTurret(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            AntiAirTurret.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 8.0E-4f;
        }
    },
    builder { // from class: com.corrodinggames.rts.game.units.ar.52
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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
            Builder.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: l */
        public boolean mo5696l() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: m */
        public boolean mo5695m() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: n */
        public boolean mo5694n() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo5716a(ArrayList arrayList, int i) {
            Builder.m4152a(arrayList, i);
            EditorOrBuilder.m3688a((ArrayList) null, i);
        }
    },
    tank { // from class: com.corrodinggames.rts.game.units.ar.53
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 350;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.002f;
        }
    },
    hoverTank { // from class: com.corrodinggames.rts.game.units.ar.2
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 450;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.002f;
        }
    },
    artillery { // from class: com.corrodinggames.rts.game.units.ar.3
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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
            Artillery.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 900;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.0014f;
        }
    },
    helicopter { // from class: com.corrodinggames.rts.game.units.ar.4
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 650;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.0012f;
        }
    },
    airShip { // from class: com.corrodinggames.rts.game.units.ar.5
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.002f;
        }
    },
    gunShip { // from class: com.corrodinggames.rts.game.units.ar.6
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: g */
        public int mo5701g() {
            return 2;
        }
    },
    missileShip { // from class: com.corrodinggames.rts.game.units.ar.7
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 900;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }
    },
    gunBoat { // from class: com.corrodinggames.rts.game.units.ar.8
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 300;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.005f;
        }
    },
    megaTank { // from class: com.corrodinggames.rts.game.units.ar.9
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.0015f;
        }
    },
    laserTank { // from class: com.corrodinggames.rts.game.units.ar.10
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 1300;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.0013f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: g */
        public int mo5701g() {
            return 2;
        }
    },
    hovercraft { // from class: com.corrodinggames.rts.game.units.ar.11
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Hovercraft(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Hovercraft.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.003f;
        }
    },
    ladybug { // from class: com.corrodinggames.rts.game.units.ar.13
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Ladybug(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Ladybug.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 400;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.004f;
        }
    },
    battleShip { // from class: com.corrodinggames.rts.game.units.ar.14
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Battleship(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Battleship.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }
    },
    tankDestroyer { // from class: com.corrodinggames.rts.game.units.ar.15
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.003f;
        }
    },
    heavyTank { // from class: com.corrodinggames.rts.game.units.ar.16
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.0011f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: g */
        public int mo5701g() {
            return 2;
        }
    },
    heavyHoverTank { // from class: com.corrodinggames.rts.game.units.ar.17
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new heavyHoverTank(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            heavyHoverTank.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: g */
        public int mo5701g() {
            return 2;
        }
    },
    laserDefence { // from class: com.corrodinggames.rts.game.units.ar.18
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
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

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }
    },
    dropship { // from class: com.corrodinggames.rts.game.units.ar.19
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new Dropship(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            Dropship.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: g */
        public int mo5701g() {
            return 2;
        }
    },
    tree { // from class: com.corrodinggames.rts.game.units.ar.20
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.0025f;
        }
    },
    repairbay { // from class: com.corrodinggames.rts.game.units.ar.21
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }
    },
    NukeLaucher { // from class: com.corrodinggames.rts.game.units.ar.22
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new NukeLaucher(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            NukeLaucher.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 45000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 1.0E-4f;
        }
    },
    AntiNukeLaucher { // from class: com.corrodinggames.rts.game.units.ar.24
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new AntiNukeLaucher(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            AntiNukeLaucher.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 15000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 7.0E-4f;
        }
    },
    mammothTank { // from class: com.corrodinggames.rts.game.units.ar.25
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 3900;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 9.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: g */
        public int mo5701g() {
            return 3;
        }
    },
    experimentalTank { // from class: com.corrodinggames.rts.game.units.ar.26
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 14000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 2.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: g */
        public int mo5701g() {
            return 3;
        }
    },
    experimentalLandFactory { // from class: com.corrodinggames.rts.game.units.ar.27
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 11000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 3.5E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo5716a(ArrayList arrayList, int i) {
            ExperimentalLandFactory.m4481a(arrayList, i);
        }
    },
    crystalResource { // from class: com.corrodinggames.rts.game.units.ar.28
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new CrystalResource(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            CrystalResource.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 5000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }
    },
    wall_v { // from class: com.corrodinggames.rts.game.units.ar.29
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new WallV(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            WallV.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 100;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.003f;
        }
    },
    fabricator { // from class: com.corrodinggames.rts.game.units.ar.30
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
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

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 6.0E-4f;
        }
    },
    attackSubmarine { // from class: com.corrodinggames.rts.game.units.ar.31
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }
    },
    builderShip { // from class: com.corrodinggames.rts.game.units.ar.32
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: l */
        public boolean mo5696l() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: m */
        public boolean mo5695m() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo5716a(ArrayList arrayList, int i) {
            BuilderShip.m3510a(arrayList, i);
        }
    },
    amphibiousJet { // from class: com.corrodinggames.rts.game.units.ar.33
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 2000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: g */
        public int mo5701g() {
            return 2;
        }
    },
    supplyDepot { // from class: com.corrodinggames.rts.game.units.ar.35
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.001f;
        }
    },
    experimentalHoverTank { // from class: com.corrodinggames.rts.game.units.ar.36
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new ExperimentalHoverTank(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            ExperimentalHoverTank.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 21000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 2.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: g */
        public int mo5701g() {
            return 3;
        }
    },
    turret_artillery { // from class: com.corrodinggames.rts.game.units.ar.37
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            Turret turret = new Turret(z);
            turret.setType("artillery");
            return turret;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return UnitType.turret.getPrice() + Turret.f3399dM.mo6175c();
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 6.0E-4f;
        }
    },
    turret_flamethrower { // from class: com.corrodinggames.rts.game.units.ar.38
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            Turret turret = new Turret(z);
            turret.setType("flamethrower");
            return turret;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return UnitType.turret.getPrice() + Turret.f3400dN.mo6175c();
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 6.0E-4f;
        }
    },
    fogRevealer { // from class: com.corrodinggames.rts.game.units.ar.39
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 6.0E-4f;
        }
    },
    spreadingFire { // from class: com.corrodinggames.rts.game.units.ar.40
        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new SpreadingFire(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            SpreadingFire.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 6.0E-4f;
        }
    },
    antiAirTurretT2 { // from class: com.corrodinggames.rts.game.units.ar.41
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            AntiAirTurret antiAirTurret = new AntiAirTurret(z);
            antiAirTurret.setTech(2);
            return antiAirTurret;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return UnitType.turret.getPrice() + AntiAirTurret.f3369e.mo6175c();
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 6.0E-4f;
        }
    },
    turretT2 { // from class: com.corrodinggames.rts.game.units.ar.42
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            Turret turret = new Turret(z);
            turret.setType("gunT2");
            return turret;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return UnitType.turret.getPrice() + Turret.f3397dK.mo6175c();
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 6.0E-4f;
        }
    },
    turretT3 { // from class: com.corrodinggames.rts.game.units.ar.43
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: j */
        public boolean mo5698j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            Turret turret = new Turret(z);
            turret.setType("gunT3");
            return turret;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return UnitType.turret.getPrice() + Turret.f3397dK.mo6175c() + Turret.f3398dL.mo6175c();
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 3.0E-4f;
        }
    },
    damagingBorder { // from class: com.corrodinggames.rts.game.units.ar.44
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: A */
        public boolean mo5718A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new DamagingBorder(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            DamagingBorder.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 6.0E-4f;
        }
    },
    zoneMarker { // from class: com.corrodinggames.rts.game.units.ar.46
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: A */
        public boolean mo5718A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            DamagingBorder damagingBorder = new DamagingBorder(z);
            damagingBorder.noDamage = true;
            return damagingBorder;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            DamagingBorder.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 6.0E-4f;
        }
    },
    editorOrBuilder { // from class: com.corrodinggames.rts.game.units.ar.47
        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: A */
        public boolean mo5718A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public Unit createInstance(boolean z) {
            return new EditorOrBuilder(z);
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: b */
        public void load() {
            EditorOrBuilder.load();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: l */
        public boolean mo5696l() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: m */
        public boolean mo5695m() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: n */
        public boolean mo5694n() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: a */
        public void mo5716a(ArrayList arrayList, int i) {
        }
    },
    dummyNonUnitWithTeam { // from class: com.corrodinggames.rts.game.units.ar.48
        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: e */
        public String mo5703e() {
            return mo5699i();
        }

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: i */
        public String mo5699i() {
            return "marker";
        }

        @Override // com.corrodinggames.rts.game.units.UnitType
        /* renamed from: A */
        public boolean mo5718A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: C */
        public boolean mo5712C() {
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

        @Override // com.corrodinggames.rts.game.units.UnitType, com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: c */
        public int getPrice() {
            return 9999;
        }

        @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
        /* renamed from: D */
        public float mo5711D() {
            return 1.0f;
        }
    };
    

    /* renamed from: aa */
    C0231z f1786aa;

    /* renamed from: ab */
    int f1787ab;

    /* renamed from: ac */
    String f1788ac;

    /* renamed from: ad */
    String f1789ad;

    /* renamed from: ae */
    public static ArrayList f1790ae;

    /* renamed from: af */
    C0304at[] f1791af;

    /* renamed from: ag */
    public static boolean f1792ag;

    /* renamed from: ah */
    C0424b f1793ah;

    /* renamed from: a */
    public abstract Unit createInstance(boolean z);

    /* renamed from: b */
    public abstract void load();

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: c */
    public abstract int getPrice();

    UnitType() {
        this.f1786aa = new C0231z(this);
        this.f1787ab = -1;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: a */
    public Unit mo5710a() {
        return createInstance(false);
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: d */
    public C0231z mo5705d() {
        return this.f1786aa;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: e */
    public String mo5703e() {
        if (this.f1787ab != C0820a.f5395c || this.f1788ac == null) {
            this.f1787ab = C0820a.f5395c;
            String str = "units." + name() + ".name";
            this.f1788ac = C0820a.m1889a(str, null, new Object[0]);
            if (this.f1788ac == null) {
                if (GameEngine.getInstance().m1160ar() && !mo5718A()) {
                    throw new RuntimeException("Can't find translation text for: " + str);
                }
                this.f1788ac = name();
            }
        }
        return this.f1788ac;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: f */
    public String mo5702f() {
        if (this.f1787ab != C0820a.f5395c || this.f1789ad == null) {
            this.f1787ab = C0820a.f5395c;
            String str = "units." + name() + ".description";
            this.f1789ad = C0820a.m1889a(str, null, new Object[0]);
            if (this.f1789ad == null) {
                if (GameEngine.getInstance().m1160ar() && !mo5718A()) {
                    throw new RuntimeException("Can't find translation text for: " + str);
                }
                this.f1789ad = VariableScope.nullOrMissingString;
            }
        }
        return this.f1789ad;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: g */
    public int mo5701g() {
        return 1;
    }

    /* renamed from: a */
    public void mo5716a(ArrayList arrayList, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: h */
    public void mo5700h() {
        C0304at[] c0304atArr = new C0304at[3];
        for (int i = 1; i <= 3; i++) {
            C0304at c0304at = new C0304at();
            mo5716a(c0304at.f1795a, i);
            c0304atArr[i - 1] = c0304at;
        }
        this.f1791af = c0304atArr;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: a */
    public ArrayList mo5709a(int i) {
        if (i > 3) {
            throw new RuntimeException("Tech level:" + i + " greater than maxTechLevel");
        }
        return this.f1791af[i - 1].f1795a;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: i */
    public String mo5699i() {
        return name();
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: j */
    public boolean mo5698j() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: k */
    public boolean mo5697k() {
        return mo5698j();
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: l */
    public boolean mo5696l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: m */
    public boolean mo5695m() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: n */
    public boolean mo5694n() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: o */
    public EnumC0246ao mo5693o() {
        Unit m5880a = Unit.m5880a(this);
        if (m5880a == null) {
            throw new RuntimeException("Shared unit is null for:" + name());
        }
        return m5880a.mo5638h();
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: p */
    public boolean mo5692p() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: q */
    public C0402bc mo5691q() {
        return null;
    }

    /* renamed from: a */
    public static InterfaceC0303as m5727a(String str) {
        return m5723a(str, true);
    }

    /* renamed from: a */
    public static InterfaceC0303as m5723a(String str, boolean z) {
        UnitType[] values;
        InterfaceC0303as m4714m;
        if (z && (m4714m = C0453l.m4714m(str)) != null) {
            return m4714m;
        }
        for (UnitType unitType : values()) {
            if (unitType.name().equalsIgnoreCase(str)) {
                return unitType;
            }
        }
        C0453l m4712n = C0453l.m4712n(str);
        if (m4712n != null) {
            return m4712n;
        }
        return null;
    }

    /* renamed from: a */
    private static String m5726a(String str, float f) {
        return m5725a(str, f, VariableScope.nullOrMissingString);
    }

    /* renamed from: a */
    private static String m5725a(String str, float f, String str2) {
        String str3 = VariableScope.nullOrMissingString + f;
        if (f % 1.0f == 0.0f) {
            str3 = VariableScope.nullOrMissingString + ((int) f);
        }
        return m5724a(str, str3, str2);
    }

    /* renamed from: a */
    private static String m5724a(String str, String str2, String str3) {
        return str + ": " + str2 + str3 + "\n";
    }

    /* renamed from: a */
    private static int m5728a(AbstractC0623y abstractC0623y) {
        Action a;
        C0208c cl = abstractC0623y.m5799cl();
        if (cl != null && (a = abstractC0623y.m5883a(cl)) != null) {
            return a.mo6175c();
        }
        return 0;
    }

    /* renamed from: r */
    public static void m5722r() {
        new File("output_all_unit_images/").mkdirs();
        for (int i = 0; i < 50; i++) {
            GameEngine.m1193a("running outputUnitImages()");
        }
        String[] strArr = {"carrier", "experimentalGunship", "experimentalGunshipLanded", "mech_gun", "ladybug", "spiderBot", "wall_v", "crystalResource", "test_tank", "missing", "fogRevealer", "supplyDepot", "tankDestroyer", "megaTank", "crystal_mid", "mechFlyingLanded"};
        Iterator it = f1790ae.iterator();
        while (it.hasNext()) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) it.next();
            Unit m5880a = Unit.m5880a(interfaceC0303as);
            if ((m5880a instanceof AbstractC0623y) && !interfaceC0303as.mo5699i().startsWith("bug") && C0453l.m4737c(interfaceC0303as) == null && (!(interfaceC0303as instanceof C0453l) || ((C0453l) interfaceC0303as).f2946aE)) {
                AbstractC0623y abstractC0623y = (AbstractC0623y) m5880a;
                boolean z = false;
                for (String str : strArr) {
                    if (str.equals(interfaceC0303as.mo5699i())) {
                        z = true;
                    }
                }
                if (!z) {
                    String str2 = "output_all_unit_images/" + interfaceC0303as.mo5699i().replace("/", "_").replace("\\", "_") + ".png";
                    GameEngine gameEngine = GameEngine.getInstance();
                    BitmapOrTexture mo893b = gameEngine.graphics.mo893b(100, 100, true);
                    InterfaceC1027y mo891b = gameEngine.graphics.mo891b(mo893b);
                    InterfaceC1027y interfaceC1027y = gameEngine.graphics;
                    gameEngine.graphics = mo891b;
                    m5729a(interfaceC0303as, mo893b.f6398r, mo893b.f6399s, 0.0f, 0.0f, Team.m6307k(0), 20.0f, 100, false, false, 1, true, null);
                    gameEngine.graphics = interfaceC1027y;
                    mo891b.mo873p();
                    gameEngine.graphics.mo907a(mo893b, new File(str2));
                }
            }
        }
    }

    /* renamed from: s */
    public static void m5721s() {
        int m5728a;
        int m5728a2;
        for (int i = 0; i < 50; i++) {
            GameEngine.m1193a("running printForHelp()");
        }
        String[] strArr = {"carrier", "experimentalGunship", "experimentalGunshipLanded", "mech_gun", "ladybug", "spiderBot", "wall_v", "crystalResource", "test_tank", "missing", "fogRevealer", "supplyDepot", "tankDestroyer", "megaTank", "crystal_mid", "mechFlyingLanded"};
        String str = VariableScope.nullOrMissingString;
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f1790ae);
        Collections.sort(arrayList, new Comparator() { // from class: com.corrodinggames.rts.game.units.ar.49
            @Override // java.util.Comparator
            /* renamed from: a */
            public int mo5717a(InterfaceC0303as interfaceC0303as, InterfaceC0303as interfaceC0303as2) {
                return interfaceC0303as.mo5690u().m5214a(interfaceC0303as2.mo5690u());
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            InterfaceC0303as interfaceC0303as = (InterfaceC0303as) it.next();
            Unit m5880a = Unit.m5880a(interfaceC0303as);
            if ((m5880a instanceof AbstractC0623y) && !interfaceC0303as.mo5699i().startsWith("bug") && C0453l.m4737c(interfaceC0303as) == null && (!(interfaceC0303as instanceof C0453l) || ((C0453l) interfaceC0303as).f2946aE)) {
                if (interfaceC0303as != editorOrBuilder) {
                    AbstractC0623y abstractC0623y = (AbstractC0623y) m5880a;
                    boolean z = false;
                    for (String str2 : strArr) {
                        if (str2.equals(interfaceC0303as.mo5699i())) {
                            z = true;
                        }
                    }
                    if (!z) {
                        String str3 = ((((((str + "\n") + "<div class=\"unit\">\n") + "<img src=\"unit:" + interfaceC0303as.mo5699i() + "\" />\n") + "<h4>" + interfaceC0303as.mo5703e() + "</h4>\n") + "<p>" + interfaceC0303as.mo5702f().replace("\n", "<br/>") + "</p>\n") + "<pre>") + m5724a("Price", "$" + interfaceC0303as.getPrice(), VariableScope.nullOrMissingString);
                        if (m5728a(abstractC0623y) > 0) {
                            str3 = str3 + m5724a("T2 Upgrade Price", "$" + m5728a, VariableScope.nullOrMissingString);
                            AbstractC0623y abstractC0623y2 = (AbstractC0623y) interfaceC0303as.mo5710a();
                            abstractC0623y2.mo4211a(2);
                            if (abstractC0623y2.mo3230V() == 2 && (m5728a2 = m5728a(abstractC0623y2)) > 0) {
                                str3 = str3 + m5724a("T3 Upgrade Price", "$" + m5728a2, VariableScope.nullOrMissingString);
                            }
                        }
                        String str4 = (((str3 + m5726a("Hp", abstractC0623y.f1632ct)) + m5726a("Speed", abstractC0623y.getMoveSpeed())) + m5726a("Turn speed", abstractC0623y.getTurnSpeed())) + m5726a("Mass", abstractC0623y.mo3507bN());
                        if (abstractC0623y.mo3495l()) {
                            str4 = (str4 + m5726a("Shoot Delay", abstractC0623y.getShootDelay(0))) + m5726a("Attack Range", abstractC0623y.getMaxAttackRange());
                            float f = 0.0f;
                            float f2 = 0.0f;
                            float f3 = 0.0f;
                            float f4 = 0.0f;
                            int mo3093bl = abstractC0623y.mo3093bl();
                            for (int i2 = 0; i2 < mo3093bl; i2++) {
                                int i3 = Projectile.f1082a.f6888a;
                                abstractC0623y.fireProjectile((Unit) abstractC0623y, i2);
                                if (i3 != Projectile.f1082a.f6888a) {
                                    Projectile projectile = (Projectile) Projectile.f1082a.get(Projectile.f1082a.f6888a - 1);
                                    if (projectile.directDamage > f) {
                                        f = projectile.directDamage;
                                    }
                                    if (projectile.f1024Y > f2) {
                                        f2 = projectile.f1024Y;
                                    }
                                    f3 += projectile.directDamage;
                                    f4 += projectile.f1024Y;
                                }
                            }
                            if (f3 != 0.0f) {
                                String str5 = VariableScope.nullOrMissingString;
                                if (f3 != f) {
                                    str5 = " (total:" + f3 + ")";
                                }
                                str4 = str4 + m5725a("Direct Damage", f, str5);
                            }
                            if (f4 != 0.0f) {
                                String str6 = VariableScope.nullOrMissingString;
                                if (f4 != f2) {
                                    str6 = " (total:" + f4 + ")";
                                }
                                str4 = str4 + m5725a("Area Damage", f2, str6);
                            }
                        }
                        str = (str4 + "</pre>") + "</div>\n";
                    }
                }
            }
        }
        GameEngine.PrintLog(str);
    }

    /* renamed from: t */
    public static void m5720t() {
        UnitType[] values;
        for (UnitType unitType : values()) {
            unitType.name();
            unitType.mo5703e();
            unitType.mo5702f();
        }
    }

    /* renamed from: a */
    public static boolean m5731a(InterfaceC0303as interfaceC0303as, float f, float f2, float f3, float f4, Team team) {
        GameEngine.getInstance();
        Unit m5880a = Unit.m5880a(interfaceC0303as);
        if (m5880a == null) {
            GameEngine.PrintLog("isValidHere: Failed to get unit from type:" + interfaceC0303as);
            return false;
        }
        m5880a.mo3120b(team);
        m5880a.height = f4;
        m5880a.f6951ek = f;
        m5880a.f6952el = f2;
        if (!m5880a.m5858bI()) {
            m5880a.direction = f3;
            if (m5880a instanceof AbstractC0623y) {
                ((AbstractC0623y) m5880a).m3049j(f3);
            }
        }
        boolean z = true;
        if (m5880a instanceof AbstractC0623y) {
            z = ((AbstractC0623y) m5880a).m3075c(team);
        }
        m5880a.height = 0.0f;
        m5880a.direction = 0.0f;
        return z;
    }

    /* renamed from: a */
    public static void m5730a(InterfaceC0303as interfaceC0303as, float f, float f2, float f3, float f4, Team team, float f5, float f6, boolean z, boolean z2, int i, Unit unit) {
        m5729a(interfaceC0303as, f, f2, f3, f4, team, f5, f6, z, z2, i, true, unit);
    }

    /* renamed from: a */
    public static void m5729a(InterfaceC0303as interfaceC0303as, float f, float f2, float f3, float f4, Team team, float f5, float f6, boolean z, boolean z2, int i, boolean z3, Unit unit) {
        GameEngine gameEngine = GameEngine.getInstance();
        Unit m5838c = Unit.m5838c(interfaceC0303as);
        boolean m5858bI = m5838c.m5858bI();
        m5838c.mo3120b(team);
        if (m5838c instanceof AbstractC0623y) {
            ((AbstractC0623y) m5838c).mo4211a(i);
        }
        m5838c.height = f4;
        if (m5838c.mo5638h() == EnumC0246ao.f1707f || m5838c.mo5638h() == EnumC0246ao.f1708g || m5838c.mo5638h() == EnumC0246ao.f1709h) {
            m5838c.height += 4.0f;
        }
        if (m5838c.mo5638h() == EnumC0246ao.f1705d) {
            m5838c.height += 10.0f;
        }
        if (!m5858bI) {
            m5838c.direction = f3;
            if (m5838c instanceof AbstractC0623y) {
                ((AbstractC0623y) m5838c).m3049j(f3);
            }
        } else {
            m5838c.direction = -90.0f;
        }
        boolean z4 = true;
        boolean z5 = m5838c.f1626cn;
        m5838c.f1626cn = true;
        m5838c.f1629cq = false;
        m5838c.f1630cr = false;
        if (!z3) {
            m5838c.f1630cr = true;
        }
        m5838c.f1625cm = false;
        m5838c.f1627co = false;
        m5838c.f1628cp = false;
        if (z || z2) {
            m5838c.f1627co = z2;
            m5838c.f1628cp = z;
            z4 = false;
        } else {
            m5838c.f1625cm = true;
        }
        if (!z4) {
            m5838c.f6951ek = f;
            m5838c.f6952el = f2;
        } else {
            m5838c.f6951ek = gameEngine.f6138cv + f;
            m5838c.f6952el = gameEngine.f6139cw + f2;
        }
        float f7 = m5838c.radius * 2.0f * 0.8f;
        if (m5838c instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) m5838c;
            if (abstractC0623y.image != null) {
                float cC = abstractC0623y.f4224ep * abstractC0623y.m5834cC();
                if (cC > f7) {
                    f7 = cC;
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
        gameEngine.graphics.mo878k();
        if (z4) {
        }
        if (f8 != 1.0f) {
            gameEngine.graphics.mo933a(f8, f8, f, f2);
        }
        if (f8 < 1.0f) {
            f1792ag = true;
        } else {
            f1792ag = false;
        }
        if (unit != null) {
            C0439f c0439f = m5838c.f1696dF;
            m5838c.f1696dF = unit.f1696dF;
            int i2 = m5838c.f1641cC;
            m5838c.f1641cC = unit.f1641cC;
            float f9 = m5838c.f1631cs;
            m5838c.f1631cs = unit.f1631cs;
            float f10 = m5838c.f1638cz;
            m5838c.f1638cz = unit.f1638cz;
            VariableScope variableScope = m5838c.f1581bv;
            m5838c.f1581bv = unit.f1581bv;
            m5838c.mo461d(0.0f);
            m5838c.mo462c(0.0f);
            m5838c.mo469a(0.0f, false);
            m5838c.f1696dF = c0439f;
            m5838c.f1641cC = i2;
            m5838c.f1631cs = f9;
            m5838c.f1638cz = f10;
            m5838c.f1581bv = variableScope;
        } else {
            m5838c.mo461d(0.0f);
            m5838c.mo462c(0.0f);
            m5838c.mo469a(0.0f, false);
        }
        gameEngine.graphics.mo877l();
        m5838c.height = 0.0f;
        if (!m5858bI) {
            m5838c.direction = 0.0f;
        } else {
            m5838c.direction = -90.0f;
        }
        if (m5838c instanceof AbstractC0623y) {
            AbstractC0623y abstractC0623y2 = (AbstractC0623y) m5838c;
            abstractC0623y2.m3049j(0.0f);
            abstractC0623y2.mo4211a(1);
        }
        m5838c.f1627co = false;
        m5838c.f1628cp = false;
        m5838c.f1626cn = z5;
        m5838c.f1625cm = false;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: b */
    public int mo5707b(int i) {
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

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: u */
    public C0424b mo5690u() {
        int price = getPrice();
        if (price == 0) {
            return C0424b.f2709a;
        }
        if (this.f1793ah == null || this.f1793ah.m5224a() != price) {
            this.f1793ah = C0424b.m5223a(price);
        }
        return this.f1793ah;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: d */
    public C0424b mo5704d(int i) {
        return C0424b.m5223a(mo5707b(i));
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: v */
    public String mo5689v() {
        return name();
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: w */
    public boolean mo5688w() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: x */
    public C0449h mo5687x() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: y */
    public boolean mo5686y() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: z */
    public BitmapOrTexture mo5685z() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: a */
    public int mo5708a(Unit unit) {
        return 0;
    }

    /* renamed from: A */
    public boolean mo5718A() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0303as
    /* renamed from: B */
    public C0424b mo5713B() {
        return null;
    }
}
