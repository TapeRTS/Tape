package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.EnumC0306av;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.game.units.custom.p019c.C0416a;
import com.corrodinggames.rts.game.units.custom.p020d.C0424b;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.p027f.AbstractC0544i;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1084am;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.C1117y;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions.class */
public class LogicBooleanGameFunctions {
    static void addBooleanType(LogicBoolean logicBoolean, String... strArr) {
        LogicBoolean.addBooleanType(logicBoolean, strArr);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void loadTypes() {
        addBooleanType(new HeightBoolean().mo5336with("underwater=true"), "self.underwater", "self.isUnderwater");
        addBooleanType(new HeightBoolean().mo5336with("ground=true"), "self.gound", "self.ground", "self.isAtGroundHeight");
        addBooleanType(new HeightValueBoolean(), "self.height", "self.z");
        addBooleanType(new HeightBoolean().mo5336with("flying=true"), "self.flying", "self.isFlying");
        addBooleanType(new MovingBoolean(), "self.isMoving");
        addBooleanType(new HasActiveWaypoint(), "self.hasActiveWaypoint");
        addBooleanType(new SpeedValueBoolean(), "self.speed");
        addBooleanType(new SpeedBoolean().mo5336with("atTopSpeed=true"), "self.maxspeed", "self.isAtTopSpeed");
        addBooleanType(new InMapBoolean(), "self.isInMap");
        addBooleanType(new TouchWaterBoolean(), "self.inwater", "self.isInWater");
        addBooleanType(new OverWaterBoolean(), "self.overwater", "self.isOverwater");
        addBooleanType(new OverLiquidBoolean(), "self.isOverLiquid");
        addBooleanType(new OverCliftBoolean(), "self.isOverClift", "self.isOverCliff");
        addBooleanType(new OverPassableTileBoolean(), "self.isOverPassableTile");
        addBooleanType(new OverPassableTileBoolean().mo5336with("type='LAND'").createLocked(), "self.isOverOpenLand");
        addBooleanType(new TagsBoolean(), "self.tags", "self.hasTags");
        addBooleanType(new TeamTagBoolean(), "self.globalTeamTags", "self.hasGlobalTeamTags");
        addBooleanType(new HasFlagDynamicBoolean(), "self.hasFlag");
        addBooleanType(new EnergyBoolean(), "self.energy");
        addBooleanType(new EnergyIncludingQueuedBoolean(), "self.energyIncludingQueued");
        addBooleanType(new EnergyBoolean().mo5336with("full=true"), "self.isEnergyFull");
        addBooleanType(new EnergyBoolean().mo5336with("empty=true"), "self.isEnergyEmpty");
        addBooleanType(new TransportingCountBoolean(), "self.transportingCount");
        addBooleanType(new TransportingUnitWithTagsBoolean(), "self.transportingUnitWithTags");
        addBooleanType(new isTransportUnloading(), "self.isTransportUnloading");
        addBooleanType(new PriceCreditsBoolean(), "self.priceCredits");
        addBooleanType(new HpBoolean(), "self.hp");
        addBooleanType(new MaxHpBoolean(), "self.maxHp");
        addBooleanType(new UnitIdBoolean(), "self.id");
        addBooleanType(new TeamIdBoolean(), "self.teamId");
        addBooleanType(new TeamDefeatedTechBoolean(), "self.teamDefeatedTech");
        addBooleanType(new TeamWipedOutBoolean(), "self.teamWipedOut");
        addBooleanType(new TeamVictoryBoolean(), "self.teamVictory");
        addBooleanType(new PositionXBoolean(), "self.x");
        addBooleanType(new PositionYBoolean(), "self.y");
        addBooleanType(new RotationBoolean(), "self.dir");
        addBooleanType(new MaxMoveSpeedBoolean(), "self.maxMoveSpeed");
        addBooleanType(new BuiltAmountBoolean(), "self.builtAmount");
        addBooleanType(new CompletedBoolean(), "self.completed");
        addBooleanType(new ShieldBoolean(), "self.shield");
        addBooleanType(new AmmoBoolean(), "self.ammo");
        addBooleanType(new AmmoBoolean().mo5336with("empty=true"), "self.isAmmoEmpty");
        addBooleanType(new AmmoIncludingQueuedBoolean(), "self.ammoIncludingQueued");
        addBooleanType(new ResourceCountBoolean(), "self.resource");
        addBooleanType(new QueueSize(), "self.queueSize");
        addBooleanType(new NumberOfConnectionsBoolean(), "self.numberOfConnections");
        addBooleanType(new NumberOfAttachedUnitsBoolean(), "self.numberOfAttachedUnits");
        addBooleanType(new HasParent(), "self.hasParent");
        addBooleanType(new HasResourcesBoolean(), "self.hasResources");
        addBooleanType(new IsResourceLargerThan(), "self.isResourceLargerThan");
        addBooleanType(new KillsBoolean(), "self.kills");
        addBooleanType(new TimeAliveBoolean(), "self.timeAlive");
        addBooleanType(new LastConvertedBoolean(), "self.lastConverted");
        addBooleanType(new CustomTimerBoolean(), "self.customTimer");
        addBooleanType(new HasTakenDamage(), "self.hasTakenDamage");
        addBooleanType(new IsAttackingBoolean(), "self.isAttacking");
        addBooleanType(new IsReversingBoolean(), "self.isReversing");
        addBooleanType(new IsOnTeam().mo5336with("team=-1").createLocked(), "self.isOnNeutralTeam");
        addBooleanType(new IsControlledByAI(), "self.isControlledByAI");
        addBooleanType(new NumberOfUnitsInTeam(), "numberOfUnitsInTeam", "self.numberOfUnitsInTeam");
        addBooleanType(new NumberOfUnitsInTeam().mo5336with("greaterThan=0, lessThan=-1"), "hasUnitInTeam", "self.hasUnitInTeam");
        addBooleanType(new NumberOfUnitsInTeam().mo5336with("greaterThan=-1, lessThan=1"), "noUnitInTeam", "self.noUnitInTeam");
        addBooleanType(new NumberOfUnitsInTeam().mo5336with("neutralTeam=true"), "numberOfUnitsInNeutralTeam", "self.numberOfUnitsInNeutralTeam");
        addBooleanType(new NumberOfUnitsInTeam().mo5336with("aggressiveTeam=true"), "numberOfUnitsInAggressiveTeam", "self.numberOfUnitsInAggressiveTeam");
        addBooleanType(new NumberOfUnitsInTeam().mo5336with("allTeams=true"), "numberOfUnitsInAllTeams", "self.numberOfUnitsInAllTeams");
        addBooleanType(new NumberOfUnitsInEnemyOrAllyTeam().mo5336with("ally=false"), "numberOfUnitsInEnemyTeam", "self.numberOfUnitsInEnemyTeam");
        addBooleanType(new NumberOfUnitsInEnemyOrAllyTeam().mo5336with("ally=true"), "numberOfUnitsInAllyTeam", "self.numberOfUnitsInAllyTeam", "numberOfUnitsInAllyNotOwnTeam", "self.numberOfUnitsInAllyNotOwnTeam");
        addBooleanType(new GameModeBoolean().mo5336with("nukesEnabled=true").createLocked(), "game.nukesEnabled");
        addBooleanType(new GameMapWidthBoolean(), "game.mapWidth");
        addBooleanType(new GameMapHeightBoolean(), "game.mapHeight");
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$GameModeBoolean.class */
    public class GameModeBoolean extends LogicBoolean.LogicBooleanCommonLocking {
        @LogicBoolean.Parameter
        public boolean nukesEnabled;

        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = true;
            GameEngine m1228A = GameEngine.m1228A();
            if (this.nukesEnabled && m1228A.m1215N() && m1228A.networkEngine.f5597aO.f5656i) {
                z = false;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "GameMode(" + (this.nukesEnabled ? "Nukes enabled" : "Nukes disabled") + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$GameMapWidthBoolean.class */
    public class GameMapWidthBoolean extends LogicNumberFunction {
        public String getName() {
            return "game.mapWidth";
        }

        public float readNumber(AbstractC0623y abstractC0623y) {
            return GameEngine.m1228A().f6104bL.m5833i();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$GameMapHeightBoolean.class */
    public class GameMapHeightBoolean extends LogicNumberFunction {
        public String getName() {
            return "game.mapHeight";
        }

        public float readNumber(AbstractC0623y abstractC0623y) {
            return GameEngine.m1228A().f6104bL.m5832j();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsGameFrameBoolean.class */
    public class IsGameFrameBoolean extends LogicBoolean {
        @LogicBoolean.Parameter
        public int mod;
        @LogicBoolean.Parameter
        public int equalTo;
        @LogicBoolean.Parameter
        public boolean offset;

        @LogicBoolean.Parameter
        public void mod(int i) {
            this.mod = i;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z;
            GameEngine m1228A = GameEngine.m1228A();
            if (this.mod >= 0) {
                if (this.offset) {
                    z = (((long) m1228A.f6233bx) + abstractC0623y.f6945ed) % ((long) this.mod) == ((long) this.equalTo);
                } else {
                    z = m1228A.f6233bx % this.mod == this.equalTo;
                }
            } else if (this.offset) {
                z = ((long) m1228A.f6233bx) + abstractC0623y.f6945ed == ((long) this.equalTo);
            } else {
                z = m1228A.f6233bx == this.equalTo;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "IsGameFrame(mod=" + this.mod + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HeightBoolean.class */
    public class HeightBoolean extends LogicBoolean {
        @LogicBoolean.Parameter
        public boolean underwater;
        @LogicBoolean.Parameter
        public boolean ground;
        @LogicBoolean.Parameter
        public boolean flying;

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            String str = VariableScope.nullOrMissingString;
            if (this.underwater) {
                str = str + "underwater";
            }
            if (this.ground) {
                str = str + "ground";
            }
            if (this.flying) {
                str = str + "flying";
            }
            if (str.equals(VariableScope.nullOrMissingString)) {
                str = str + "height";
            }
            return str;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (this.underwater && abstractC0623y.f6953em < -2.0f) {
                z = true;
            }
            if (this.ground && abstractC0623y.f6953em > -2.0f && abstractC0623y.f6953em < 5.0f) {
                z = true;
            }
            if (this.flying && abstractC0623y.f6953em > 5.0f) {
                z = true;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$SpeedValueBoolean.class */
    public class SpeedValueBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "Speed";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.m3095bi()) {
                return C0758f.m2311b(0.0f, 0.0f, abstractC0623y.f1613ca, abstractC0623y.f1614cb);
            }
            float f = abstractC0623y.f1616cd;
            return f < 0.0f ? -f : f;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$SpeedBoolean.class */
    public class SpeedBoolean extends LogicBoolean {
        @LogicBoolean.Parameter
        public boolean atTopSpeed;

        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            float mo3258z = abstractC0623y.mo3258z() - 0.1f;
            if (abstractC0623y.m3095bi()) {
                float m2363a = C0758f.m2363a(0.0f, 0.0f, abstractC0623y.f1613ca, abstractC0623y.f1614cb);
                if (m2363a != 0.0f && m2363a > mo3258z * mo3258z) {
                    z = true;
                }
            } else if (abstractC0623y.f1616cd != 0.0f && abstractC0623y.f1616cd > mo3258z) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "Speed";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MovingBoolean.class */
    public class MovingBoolean extends LogicBoolean {
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.f1647cI) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "Moving";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasActiveWaypoint.class */
    public class HasActiveWaypoint extends LogicBoolean {
        EnumC0306av type;

        @LogicBoolean.Parameter
        public void type(String str) {
            try {
                this.type = (EnumC0306av) C1072ab.m702a(str, (Enum) null, EnumC0306av.class);
            } catch (C0412bm e) {
                throw new C1084am(e.getMessage(), e);
            }
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            C0305au m3134ar = abstractC0623y.m3134ar();
            if (m3134ar != null) {
                if (this.type == null) {
                    z = true;
                } else {
                    z = m3134ar.m4946d() == this.type;
                }
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "HasActiveWaypoint(type=" + this.type + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$InMapBoolean.class */
    public class InMapBoolean extends LogicBoolean {
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (C1117y.m497a(abstractC0623y.f6951ek, abstractC0623y.f6952el)) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "InMap";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TouchWaterBoolean.class */
    public class TouchWaterBoolean extends LogicBoolean {
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.m5246cG()) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "TouchWater";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverWaterBoolean.class */
    public class OverWaterBoolean extends LogicBoolean {
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.m5244cI()) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "OverWater";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverLiquidBoolean.class */
    public class OverLiquidBoolean extends LogicBoolean {
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.m5243cJ()) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "overLiquid";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverCliftBoolean.class */
    public class OverCliftBoolean extends LogicBoolean {
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.m5245cH()) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "OverClift";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$OverPassableTileBoolean.class */
    public class OverPassableTileBoolean extends LogicBoolean.LogicBooleanCommonLocking {
        EnumC0246ao movementType = EnumC0246ao.LAND;

        @LogicBoolean.Parameter
        public void type(String str) {
            this.movementType = EnumC0246ao.m5142a(str, "isOverPassableTile()");
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            GameEngine.m1228A();
            if (!C1117y.m495a(abstractC0623y.f6951ek, abstractC0623y.f6952el, this.movementType)) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "OverLand";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$CompletedBoolean.class */
    public class CompletedBoolean extends LogicBoolean.LogicBooleanCommonLocking {
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.f1623ck >= 1.0f) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "isComplete";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TransportingCountBoolean.class */
    public class TransportingCountBoolean extends LogicBoolean.AbstractNumberBoolean {
        public C0448g _withTag;
        public boolean filtered;
        @LogicBoolean.Parameter
        public int slot = -1;

        public String getName() {
            return "TransportingCount";
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m4407c(str);
        }

        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this._withTag != null || this.slot != -1) {
                this.filtered = true;
            }
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            int i;
            if (!this.filtered) {
                i = abstractC0623y.mo5349bB();
            } else {
                i = 0;
                C1101m m3078bz = abstractC0623y.m3078bz();
                if (m3078bz != null) {
                    Object[] m553a = m3078bz.m553a();
                    for (int i2 = m3078bz.f6888a - 1; i2 >= 0; i2--) {
                        AbstractC0623y abstractC0623y2 = (AbstractC0623y) m553a[i2];
                        if (abstractC0623y2 != null && (this.slot == -1 || i2 == this.slot)) {
                            if (this._withTag != null) {
                                if (!C0448g.m4415a(this._withTag, abstractC0623y2.m5192dc())) {
                                }
                            }
                            i++;
                        }
                    }
                }
            }
            return i;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasFlagDynamicBoolean.class */
    public class HasFlagDynamicBoolean extends LogicBoolean {
        @LogicBoolean.Parameter(type = LogicBoolean.ReturnType.number, positional = 0)

        /* renamed from: id */
        public LogicBoolean f3279id;

        public LogicBoolean validateAndOptimize(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            validate(str, str2, str3, logicBooleanContext, z);
            if (this.f3279id == null) {
                throw new BooleanParseException("Flag id must be set");
            }
            Float staticNumber = getStaticNumber(this.f3279id);
            if (staticNumber != null) {
                HasFlagBoolean hasFlagBoolean = new HasFlagBoolean();
                hasFlagBoolean.m4075id((int) staticNumber.floatValue());
                return hasFlagBoolean;
            }
            return this;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            int readNumber = (int) this.f3279id.readNumber(getParameterContext(abstractC0623y));
            if (readNumber >= 0 && readNumber <= 31) {
                if (HasFlagBoolean.isFlagSet(abstractC0623y.f1642cD, 1 << readNumber)) {
                    return true;
                }
                return false;
            }
            return false;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "HasFlag(id:" + this.f3279id.getMatchFailReasonForPlayer(getParameterContext(abstractC0623y)) + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasFlagBoolean.class */
    public class HasFlagBoolean extends LogicBoolean {
        public int flagMask = 0;
        public int flagId = -1;

        @LogicBoolean.Parameter(positional = 0)
        /* renamed from: id */
        public void m4075id(int i) {
            if (i < 0 || i > 31) {
                throw new BooleanParseException("Flag id must be between 0-31");
            }
            this.flagId = i;
            this.flagMask = 1 << i;
        }

        public static boolean isFlagSet(int i, int i2) {
            return (i2 & i) == i2;
        }

        public static byte setFlag(int i, int i2) {
            return (byte) (i2 | i);
        }

        public static byte unsetFlag(int i, int i2) {
            return (byte) (i2 & (i ^ (-1)));
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "HasFlag(id:" + this.flagId + ")";
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = true;
            if (this.flagMask != 0 && !isFlagSet(abstractC0623y.f1642cD, this.flagMask)) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsOnTeam.class */
    public class IsOnTeam extends LogicBoolean.LogicBooleanCommonLocking {
        int teamId = -99;

        @LogicBoolean.Parameter
        public void team(int i) {
            if (i < -1 || i > AbstractC0197n.f1364c) {
                throw new BooleanParseException("Flag id must be between 0-" + AbstractC0197n.f1364c);
            }
            this.teamId = i;
        }

        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.teamId == -99) {
                throw new BooleanParseException("Expended teamId argument for function:" + str);
            }
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "Team(id:" + this.teamId + ")";
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = true;
            if (abstractC0623y.f1608bV.f1305k != this.teamId) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TagsBoolean.class */
    public class TagsBoolean extends LogicBoolean {
        public C0448g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = C0448g.m4407c(str);
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            String str = "Tag";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            C0449h dc;
            boolean z = true;
            if (this.includesTag != null && ((dc = abstractC0623y.m5192dc()) == null || !C0448g.m4415a(this.includesTag, dc))) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamTagBoolean.class */
    public class TeamTagBoolean extends LogicBoolean {
        public C0448g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = C0448g.m4407c(str);
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            String str = "Team Tag ";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            C0449h m5654R;
            boolean z = true;
            if (this.includesTag != null && ((m5654R = abstractC0623y.f1608bV.m5654R()) == null || !C0448g.m4415a(this.includesTag, m5654R))) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$EventTagsBoolean.class */
    public class EventTagsBoolean extends LogicBoolean {
        public C0448g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = C0448g.m4407c(str);
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            String str = "EventTag";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = true;
            if (this.includesTag != null) {
                C0449h c0449h = null;
                if (LogicBoolean.activeEvent != null) {
                    c0449h = LogicBoolean.activeEvent.f2899d;
                }
                if (c0449h == null || !C0448g.m4415a(this.includesTag, c0449h)) {
                    z = false;
                }
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TransportingUnitWithTagsBoolean.class */
    public class TransportingUnitWithTagsBoolean extends LogicBoolean {
        public C0448g includesTag;

        @LogicBoolean.Parameter
        public void includes(String str) {
            this.includesTag = C0448g.m4407c(str);
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            String str = "TransportingUnitWithTags ";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            C1101m m3078bz;
            boolean z = false;
            if (this.includesTag != null && (m3078bz = abstractC0623y.m3078bz()) != null) {
                Object[] m553a = m3078bz.m553a();
                for (int i = 0; i < m3078bz.f6888a; i++) {
                    C0449h m5192dc = ((AbstractC0244am) m553a[i]).m5192dc();
                    if (m5192dc != null && C0448g.m4415a(this.includesTag, m5192dc)) {
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$isTransportUnloading.class */
    public class isTransportUnloading extends LogicBoolean {
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.mo5350bA()) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "IsTransportUnloading";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$isDead.class */
    public class isDead extends LogicBoolean {
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.f1606bT) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "IsDead";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HeightValueBoolean.class */
    public final class HeightValueBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "Height";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f6953em;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$EnergyBoolean.class */
    public final class EnergyBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "Energy";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1638cz;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.m3100bd();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$EnergyIncludingQueuedBoolean.class */
    public final class EnergyIncludingQueuedBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "EnergyIncludingQueued";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1638cz + abstractC0623y.m3079by().f2699c;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.m3100bd();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$PriceCreditsBoolean.class */
    public final class PriceCreditsBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "PriceCredits";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.m5242cK();
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HpBoolean.class */
    public final class HpBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "Hp";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1631cs;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1632ct;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MaxHpBoolean.class */
    public final class MaxHpBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "maxHp";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1632ct;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$UnitIdBoolean.class */
    public final class UnitIdBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "id";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return (float) abstractC0623y.f6945ed;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamDefeatedTechBoolean.class */
    public final class TeamDefeatedTechBoolean extends LogicBoolean.LogicBooleanCommon {
        public String getName() {
            return "teamDefeatedTech";
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1608bV.f1328E;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamWipedOutBoolean.class */
    public final class TeamWipedOutBoolean extends LogicBoolean.LogicBooleanCommon {
        public String getName() {
            return "teamWipedOut";
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1608bV.f1329F;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamVictoryBoolean.class */
    public final class TeamVictoryBoolean extends LogicBoolean.LogicBooleanCommon {
        public String getName() {
            return "teamVictory";
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1608bV.f1330G;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TeamIdBoolean.class */
    public final class TeamIdBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "teamId";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1608bV.f1305k;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$PositionXBoolean.class */
    public final class PositionXBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "x";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f6951ek;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$PositionYBoolean.class */
    public final class PositionYBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "y";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f6952el;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$RotationBoolean.class */
    public final class RotationBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "dir";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1617ce;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$MaxMoveSpeedBoolean.class */
    public final class MaxMoveSpeedBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "MaxMoveSpeed";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.mo3258z();
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$BuiltAmountBoolean.class */
    public final class BuiltAmountBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "BuiltAmount";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1623ck;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 1.0f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$ShieldBoolean.class */
    public final class ShieldBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "Shield";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1634cv;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1637cy;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$AmmoBoolean.class */
    public final class AmmoBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "Ammo";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1641cC;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$ResourceCountBoolean.class */
    public final class ResourceCountBoolean extends LogicBoolean.AbstractNumberBoolean {
        C0453l meta;
        C0428a type;

        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new BooleanParseException("ResourceCountBoolean requires metadata");
            }
            this.meta = c0453l;
        }

        @LogicBoolean.Parameter(positional = 0)
        public void type(String str) {
            this.type = this.meta.m4101j(str);
            if (this.type == null) {
                throw new BooleanParseException("Could not find resource type: '" + str + "'");
            }
        }

        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.type == null) {
            }
        }

        public String getName() {
            return this.type + VariableScope.nullOrMissingString;
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            if (this.type == null) {
                return 0.0f;
            }
            return (float) this.type.mo4493a(abstractC0623y);
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }

        public LogicBooleanLoader.LogicBooleanContext createContext() {
            return new ResourceScope();
        }

        public LogicBoolean.ReturnType getReturnType() {
            if (this.type == null) {
                return LogicBoolean.ReturnType.voidReturn;
            }
            if (this.greaterThan == -1.0f && this.lessThan == -1.0f && !this.full && !this.empty) {
                return LogicBoolean.ReturnType.number;
            }
            return LogicBoolean.ReturnType.bool;
        }

        public void throwVoidReturnError(String str) {
            throw new RuntimeException("'" + str + "' requires type");
        }

        public LogicBoolean setChild(LogicBoolean logicBoolean) {
            return logicBoolean;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$ResourceScope.class */
    public class ResourceScope extends LogicBooleanLoader.LogicBooleanScopeOnly {
        public LogicBoolean parseNextElementInChain(String str, C0453l c0453l, String str2, boolean z, String str3, String str4) {
            C0428a m4101j = c0453l.m4101j(str2);
            if (m4101j == null) {
                throw new BooleanParseException("'" + str3 + "': Could not find resource: '" + str2 + "'");
            }
            ResourceCountBoolean resourceCountBoolean = new ResourceCountBoolean();
            resourceCountBoolean.meta = c0453l;
            resourceCountBoolean.type = m4101j;
            return resourceCountBoolean;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfConnectionsBoolean.class */
    public final class NumberOfConnectionsBoolean extends LogicBoolean.AbstractNumberBoolean {
        C0453l meta;
        C0416a connectionMetadata;

        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new BooleanParseException("NumberOfConnectionsBoolean requires metadata");
            }
            this.meta = c0453l;
        }

        @LogicBoolean.Parameter
        public void name(String str) {
            this.connectionMetadata = this.meta.m4097l(str);
            if (this.connectionMetadata == null) {
                throw new BooleanParseException("Could not find connection type with name: " + str);
            }
        }

        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (logicBooleanContext != null && logicBooleanContext != LogicBooleanLoader.defaultContextReader) {
                throw new BooleanParseException("Function:" + str + " only supports use with 'self.'");
            }
            if (this.connectionMetadata == null) {
                throw new BooleanParseException("requires connection name");
            }
        }

        public String getName() {
            return "NumberOfConnections";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1697dG.m4591a(this.connectionMetadata);
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasResourcesBoolean.class */
    public final class HasResourcesBoolean extends LogicBoolean {
        C0424b requiredResources;
        C0453l meta;

        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new BooleanParseException("HasResourcesBoolean requires metadata");
            }
            this.meta = c0453l;
        }

        public void setArgumentsRaw(String str, C0453l c0453l, String str2) {
            try {
                this.requiredResources = C0424b.m4553b(this.meta, str);
            } catch (C0412bm e) {
                throw new BooleanParseException(e.getMessage(), e);
            }
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (this.requiredResources.mo4559b(abstractC0623y)) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "HasResources(" + this.requiredResources.m4563a(false, true, 8, true) + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsResourceLargerThan.class */
    public final class IsResourceLargerThan extends LogicBoolean {
        C0453l meta;
        C0428a source;
        C0428a compareTarget;
        @LogicBoolean.Parameter
        public float byMoreThan = 0.0f;
        @LogicBoolean.Parameter
        public float multiplyTargetBy = 1.0f;

        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new BooleanParseException("IsResourceLargerThan requires metadata");
            }
            this.meta = c0453l;
        }

        @LogicBoolean.Parameter
        public void source(String str) {
            this.source = this.meta.m4101j(str);
            if (this.source == null) {
                throw new BooleanParseException("Could not find custom resource type of:" + this.source);
            }
        }

        @LogicBoolean.Parameter
        public void compareTarget(String str) {
            this.compareTarget = this.meta.m4101j(str);
            if (this.compareTarget == null) {
                throw new BooleanParseException("Could not find custom resource type of:" + this.compareTarget);
            }
        }

        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.source == null) {
                throw new BooleanParseException("Requires 'source'");
            }
            if (this.compareTarget == null) {
                throw new BooleanParseException("Requires 'compareTarget'");
            }
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (this.source.mo4493a(abstractC0623y) > (this.compareTarget.mo4493a(abstractC0623y) + this.byMoreThan) * this.multiplyTargetBy) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "IsResourceLargerThan(" + this.source.m4496i() + " vs " + this.compareTarget.m4496i() + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$KillsBoolean.class */
    public final class KillsBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "Kills";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1657cS;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInTeam.class */
    public final class NumberOfUnitsInTeam extends LogicBoolean.AbstractNumberBoolean {
        public C0448g _withTag;
        @LogicBoolean.Parameter
        public float withinRange = -1.0f;
        public float withinRangeSq = -1.0f;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;
        @LogicBoolean.Parameter
        public boolean factoryQueue;
        @LogicBoolean.Parameter
        public boolean neutralTeam;
        @LogicBoolean.Parameter
        public boolean allTeams;
        public boolean useAggressiveTeamInsteadOfNeutralTeam;
        public static final HandleCallbackCount handleCallbackCount = new HandleCallbackCount();

        @LogicBoolean.Parameter
        public void aggressiveTeam(boolean z) {
            if (z) {
                this.neutralTeam = true;
                this.useAggressiveTeamInsteadOfNeutralTeam = true;
            }
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m4407c(str);
        }

        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.withinRange > 1000.0f) {
                throw new BooleanParseException("For CPU reasons withinRange argument cannot be over 1000 (but unlimited range is fine) in function:" + str);
            }
            if (this.withinRange > 0.0f) {
                this.withinRangeSq = this.withinRange * this.withinRange;
                if (this.factoryQueue) {
                    throw new BooleanParseException("'factoryQueue' and 'withinRange' are not supported at the same time in function:" + str);
                }
            }
        }

        public String getName() {
            return "Unit count of " + this._withTag + (this.withinRange < 0.0f ? VariableScope.nullOrMissingString : " (within range " + this.withinRange + ")");
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            AbstractC0197n abstractC0197n;
            int m5639a;
            AbstractC0197n[] m5597d;
            int i;
            int m5639a2;
            C0448g c0448g = this._withTag;
            if (this.allTeams) {
                abstractC0197n = null;
            } else if (this.neutralTeam) {
                if (!this.useAggressiveTeamInsteadOfNeutralTeam) {
                    abstractC0197n = AbstractC0197n.f1370i;
                } else {
                    abstractC0197n = AbstractC0197n.f1369h;
                }
            } else {
                abstractC0197n = abstractC0623y.f1608bV;
            }
            if (abstractC0197n == null) {
                m5639a = 0;
                for (AbstractC0197n abstractC0197n2 : AbstractC0197n.m5597d()) {
                    if (c0448g == null) {
                        i = m5639a;
                        m5639a2 = abstractC0197n2.m5627a(this.incompleteBuildings, this.factoryQueue);
                    } else {
                        i = m5639a;
                        m5639a2 = abstractC0197n2.m5639a(c0448g, this.incompleteBuildings, this.factoryQueue);
                    }
                    m5639a = i + m5639a2;
                }
            } else if (c0448g == null) {
                m5639a = abstractC0197n.m5627a(this.incompleteBuildings, this.factoryQueue);
            } else {
                m5639a = abstractC0197n.m5639a(c0448g, this.incompleteBuildings, this.factoryQueue);
            }
            if (this.withinRange < 0.0f || m5639a == 0) {
                return m5639a;
            }
            handleCallbackCount.withinRangeSq = this.withinRangeSq;
            handleCallbackCount.count = 0;
            handleCallbackCount.tag = c0448g;
            handleCallbackCount.incompleteBuildings = this.incompleteBuildings;
            handleCallbackCount.targetTeam = abstractC0197n;
            GameEngine.m1228A().f6121cc.m3505a(abstractC0623y.f6951ek, abstractC0623y.f6952el, this.withinRange, abstractC0623y, 0.0f, handleCallbackCount);
            return handleCallbackCount.count;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInTeam$HandleCallbackCount.class */
        public class HandleCallbackCount extends AbstractC0544i {
            public C0448g tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;
            public AbstractC0197n targetTeam;

            public void setup(AbstractC0623y abstractC0623y, float f) {
            }

            public int excludeTeam(AbstractC0623y abstractC0623y) {
                return -1;
            }

            public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
                return null;
            }

            public AbstractC0197n onlyTeam(AbstractC0623y abstractC0623y) {
                return this.targetTeam;
            }

            public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
                C0449h m5192dc = abstractC0244am.m5192dc();
                if ((this.tag == null || (m5192dc != null && C0448g.m4415a(this.tag, m5192dc))) && C0758f.m2363a(abstractC0623y.f6951ek, abstractC0623y.f6952el, abstractC0244am.f6951ek, abstractC0244am.f6952el) < this.withinRangeSq) {
                    if (abstractC0244am.f1623ck < 1.0f && !this.incompleteBuildings) {
                        return;
                    }
                    this.count++;
                }
            }
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam.class */
    public final class NumberOfUnitsInEnemyOrAllyTeam extends LogicBoolean.AbstractNumberBoolean {
        public C0448g _withTag;
        @LogicBoolean.Parameter
        public float withinRange = -1.0f;
        public float withinRangeSq = -1.0f;
        @LogicBoolean.Parameter
        public boolean incompleteBuildings;
        @LogicBoolean.Parameter
        public boolean factoryQueue;
        @LogicBoolean.Parameter
        public boolean ally;
        public static final HandleCallbackCountEnemies handleCallbackCountEnemies = new HandleCallbackCountEnemies();
        public static final HandleCallbackCountAlly handleCallbackCountAlly = new HandleCallbackCountAlly();

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m4407c(str);
        }

        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.withinRange > 1000.0f) {
                throw new BooleanParseException("For CPU reasons withinRange argument cannot be over 1000 (but unlimited range is fine) in function:" + str);
            }
            if (this.withinRange > 0.0f) {
                this.withinRangeSq = this.withinRange * this.withinRange;
                if (this.factoryQueue) {
                    throw new BooleanParseException("'factoryQueue' and 'withinRange' are not supported at the same time in function:" + str);
                }
            }
        }

        public String getName() {
            return "Enemy Unit count of " + this._withTag + (this.withinRange < 0.0f ? VariableScope.nullOrMissingString : " (within range " + this.withinRange + ")");
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            int m5603c;
            AbstractC0197n abstractC0197n = abstractC0623y.f1608bV;
            if (!this.ally) {
                m5603c = 0 + abstractC0197n.m5619b(this._withTag, this.incompleteBuildings, this.factoryQueue);
            } else {
                m5603c = 0 + abstractC0197n.m5603c(this._withTag, this.incompleteBuildings, this.factoryQueue);
            }
            if (this.withinRange < 0.0f || m5603c == 0) {
                return m5603c;
            }
            if (!this.ally) {
                handleCallbackCountEnemies.withinRangeSq = this.withinRangeSq;
                handleCallbackCountEnemies.count = 0;
                handleCallbackCountEnemies.tag = this._withTag;
                handleCallbackCountEnemies.incompleteBuildings = this.incompleteBuildings;
                GameEngine.m1228A().f6121cc.m3505a(abstractC0623y.f6951ek, abstractC0623y.f6952el, this.withinRange, abstractC0623y, 0.0f, handleCallbackCountEnemies);
                return handleCallbackCountEnemies.count;
            }
            handleCallbackCountAlly.withinRangeSq = this.withinRangeSq;
            handleCallbackCountAlly.count = 0;
            handleCallbackCountAlly.tag = this._withTag;
            handleCallbackCountAlly.incompleteBuildings = this.incompleteBuildings;
            handleCallbackCountAlly.ally = abstractC0623y.f1608bV;
            GameEngine.m1228A().f6121cc.m3505a(abstractC0623y.f6951ek, abstractC0623y.f6952el, this.withinRange, abstractC0623y, 0.0f, handleCallbackCountAlly);
            return handleCallbackCountAlly.count;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountEnemies.class */
        public class HandleCallbackCountEnemies extends AbstractC0544i {
            public C0448g tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;

            public void setup(AbstractC0623y abstractC0623y, float f) {
            }

            public int excludeTeam(AbstractC0623y abstractC0623y) {
                return -1;
            }

            public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
                return abstractC0623y.f1608bV;
            }

            public AbstractC0197n onlyTeam(AbstractC0623y abstractC0623y) {
                return null;
            }

            public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
                C0449h m5192dc = abstractC0244am.m5192dc();
                if ((this.tag == null || (m5192dc != null && C0448g.m4415a(this.tag, m5192dc))) && C0758f.m2363a(abstractC0623y.f6951ek, abstractC0623y.f6952el, abstractC0244am.f6951ek, abstractC0244am.f6952el) < this.withinRangeSq) {
                    if (abstractC0244am.f1623ck < 1.0f && !this.incompleteBuildings) {
                        return;
                    }
                    this.count++;
                }
            }
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountAlly.class */
        public class HandleCallbackCountAlly extends AbstractC0544i {
            public AbstractC0197n ally;
            public C0448g tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;

            public void setup(AbstractC0623y abstractC0623y, float f) {
            }

            public int excludeTeam(AbstractC0623y abstractC0623y) {
                return -1;
            }

            public AbstractC0197n onlyEnemiesOfTeam(AbstractC0623y abstractC0623y) {
                return null;
            }

            public AbstractC0197n onlyTeam(AbstractC0623y abstractC0623y) {
                return null;
            }

            public void callback(AbstractC0623y abstractC0623y, float f, AbstractC0244am abstractC0244am) {
                if (this.ally == abstractC0244am.f1608bV || !this.ally.m5594d(abstractC0244am.f1608bV)) {
                    return;
                }
                C0449h m5192dc = abstractC0244am.m5192dc();
                if ((this.tag == null || (m5192dc != null && C0448g.m4415a(this.tag, m5192dc))) && C0758f.m2363a(abstractC0623y.f6951ek, abstractC0623y.f6952el, abstractC0244am.f6951ek, abstractC0244am.f6952el) < this.withinRangeSq) {
                    if (abstractC0244am.f1623ck < 1.0f && !this.incompleteBuildings) {
                        return;
                    }
                    this.count++;
                }
            }
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$AmmoIncludingQueuedBoolean.class */
    public final class AmmoIncludingQueuedBoolean extends LogicBoolean.AbstractNumberBoolean {
        public String getName() {
            return "AmmoIncludingQueued";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1641cC + abstractC0623y.m3079by().f2702f;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$QueueSize.class */
    public final class QueueSize extends LogicBoolean.AbstractNumberBoolean {
        public C0448g _withActionTag;

        @LogicBoolean.Parameter
        public void withActionTag(String str) {
            this._withActionTag = C0448g.m4407c(str);
        }

        public String getName() {
            return "QueueSize";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            return abstractC0623y.m5305a(this._withActionTag);
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$TimeAliveBoolean.class */
    public final class TimeAliveBoolean extends LogicBoolean.TimeBoolean {
        public String getName() {
            return "TimeAlive";
        }

        public int getTime(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1584by;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$LastConvertedBoolean.class */
    public final class LastConvertedBoolean extends LogicBoolean.TimeBoolean {
        public String getName() {
            return "LastConverted";
        }

        public int getTime(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1586bA;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$CustomTimerBoolean.class */
    public final class CustomTimerBoolean extends LogicBoolean.TimeBoolean {
        public String getName() {
            return "CustomTimer";
        }

        public int getTime(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1585bz;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasTakenDamage.class */
    public class HasTakenDamage extends LogicBoolean.TimeBoolean {
        public int getTime(AbstractC0623y abstractC0623y) {
            return abstractC0623y.f1577br;
        }

        public String getName() {
            return "HasTakenDamage";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsAttackingBoolean.class */
    public class IsAttackingBoolean extends LogicBoolean {
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.m3151aa()) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "Attacking";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsReversingBoolean.class */
    public class IsReversingBoolean extends LogicBoolean {
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.f1619cg) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "IsReversing";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$IsControlledByAI.class */
    public class IsControlledByAI extends LogicBoolean {
        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            if (abstractC0623y.f1608bV.f1316v) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "IsControlledByAI";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$CompareUnitsBroken.class */
    public class CompareUnitsBroken extends LogicBoolean {
        C0453l meta;
        UnitReference sameUnitAs;

        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new BooleanParseException("SameUnitAs requires metadata");
            }
            this.meta = c0453l;
        }

        @LogicBoolean.Parameter
        public void sameUnitAs(String str) {
            try {
                this.sameUnitAs = UnitReference.parseUnitReference(this.meta, str, VariableScope.nullOrMissingString, VariableScope.nullOrMissingString, null, false);
            } catch (C0412bm e) {
                throw new BooleanParseException(e.getMessage(), e);
            }
        }

        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (this.sameUnitAs == null) {
                throw new BooleanParseException("Missing required parameters (Possible parameters:" + getParameters().allParametersString + ")");
            }
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            return true;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "SameUnitAs";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$HasParent.class */
    public final class HasParent extends LogicBoolean {
        public C0448g _withTag;

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m4407c(str);
        }

        public boolean read(AbstractC0623y abstractC0623y) {
            boolean z = false;
            AbstractC0244am dp = abstractC0623y.m5179dp();
            if (dp != null) {
                z = true;
                if (this._withTag != null) {
                    if (!C0448g.m4415a(this._withTag, dp.m5192dc())) {
                        z = false;
                    }
                }
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(AbstractC0623y abstractC0623y) {
            return "HasParent";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBooleanGameFunctions$NumberOfAttachedUnitsBoolean.class */
    public final class NumberOfAttachedUnitsBoolean extends LogicBoolean.AbstractNumberBoolean {
        public C0448g _withTag;
        short attachmentId = -1;
        C0453l meta;

        public void forMeta(C0453l c0453l) {
            if (c0453l == null) {
                throw new C1084am("NumberOfAttachedUnitsBoolean requires metadata");
            }
            this.meta = c0453l;
        }

        public void validate(String str, String str2, String str3, LogicBooleanLoader.LogicBooleanContext logicBooleanContext, boolean z) {
            super.validate(str, str2, str3, logicBooleanContext, z);
            if (logicBooleanContext != null && logicBooleanContext != LogicBooleanLoader.defaultContextReader && this.attachmentId != -1) {
                throw new BooleanParseException("Function:" + str + " only supports use with 'self.' when using 'slot'");
            }
        }

        @LogicBoolean.Parameter
        public void withTag(String str) {
            this._withTag = C0448g.m4407c(str);
        }

        @LogicBoolean.Parameter
        public void slot(String str) {
            C0399m m4103i = this.meta.m4103i(str);
            if (m4103i == null) {
                throw new C1084am("No attachment slot with name: " + str + " found");
            }
            this.attachmentId = m4103i.m4642a();
        }

        public String getName() {
            String str = VariableScope.nullOrMissingString;
            if (this._withTag != null) {
                str = str + "tag=" + this._withTag;
            }
            if (this.attachmentId != -1) {
                str = str + " attachmentId=" + ((int) this.attachmentId);
            }
            return "NumberOfAttachedUnits(" + str + ")";
        }

        public float getValue(AbstractC0623y abstractC0623y) {
            if (!(abstractC0623y instanceof C0451j)) {
                return 0.0f;
            }
            C0451j c0451j = (C0451j) abstractC0623y;
            if (c0451j.f2866B == null) {
                return 0.0f;
            }
            int i = 0;
            Object[] m553a = c0451j.f2866B.m553a();
            for (int i2 = c0451j.f2866B.f6888a - 1; i2 >= 0; i2--) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) m553a[i2];
                if (abstractC0623y2 != null && (this.attachmentId == -1 || i2 == this.attachmentId)) {
                    if (this._withTag != null) {
                        if (!C0448g.m4415a(this._withTag, abstractC0623y2.m5192dc())) {
                        }
                    }
                    i++;
                }
            }
            return i;
        }

        public float getMaxValue(AbstractC0623y abstractC0623y) {
            return 2.14748365E9f;
        }
    }
}
