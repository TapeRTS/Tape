package com.corrodinggames.rts.game.units.custom.logicBooleans;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0270an;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.EnumC0271ao;
import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0367k;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.p018b.C0336i;
import com.corrodinggames.rts.game.units.custom.p019c.C0338a;
import com.corrodinggames.rts.game.units.custom.p020d.C0345a;
import com.corrodinggames.rts.game.units.p026f.AbstractC0459i;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0818ak;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean.class */
public abstract class LogicBoolean implements Cloneable {
    public static final boolean not = false;
    boolean locked = false;
    public static final StaticBoolean trueBoolean = new StaticBooleanTrue();
    public static final StaticBoolean falseBoolean = new StaticBooleanFalse();
    static CallContext_self callContext_self = new CallContext_self();
    static CallContext_selfAndTarget callContext_selfAndTarget = new CallContext_selfAndTarget();
    static final HashMap parameterMappings = new HashMap();
    static HashMap booleans = new HashMap();

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$CallContext.class */
    public class CallContext {
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$CallContext_self.class */
    public class CallContext_self extends CallContext {
        public C0367k self;
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$CallContext_selfAndTarget.class */
    public class CallContext_selfAndTarget extends CallContext_self {
        public AbstractC0210af target;
    }

    @Retention(RetentionPolicy.RUNTIME)
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$Parameter.class */
    public @interface Parameter {
    }

    public abstract boolean read(C0367k kVar);

    public abstract String getMatchFailReasonForPlayer(C0367k kVar);

    static {
        addBooleanType(new HeightBoolean().with("underwater=true"), "self.underwater", "self.isUnderwater");
        addBooleanType(new HeightBoolean().with("ground=true"), "self.gound", "self.ground", "self.isAtGroundHeight");
        addBooleanType(new HeightValueBoolean(), "self.height");
        addBooleanType(new HeightBoolean().with("flying=true"), "self.flying", "self.isFlying");
        addBooleanType(new MovingBoolean(), "self.isMoving");
        addBooleanType(new HasActiveWaypoint(), "self.hasActiveWaypoint");
        addBooleanType(new SpeedBoolean().with("atTopSpeed=true"), "self.maxspeed", "self.isAtTopSpeed");
        addBooleanType(new TouchWaterBoolean(), "self.inwater", "self.isInWater");
        addBooleanType(new OverWaterBoolean(), "self.overwater", "self.isOverwater");
        addBooleanType(new OverLiquidBoolean(), "self.isOverLiquid");
        addBooleanType(new OverCliftBoolean(), "self.isOverClift", "self.isOverCliff");
        addBooleanType(new OverPassableTileBoolean(), "self.isOverPassableTile");
        addBooleanType(new OverPassableTileBoolean().with("type='LAND'").lock(), "self.isOverOpenLand");
        addBooleanType(new TagsBoolean(), "self.tags", "self.hasTags");
        addBooleanType(new TeamTagBoolean(), "self.globalTeamTags", "self.hasGlobalTeamTags");
        addBooleanType(new HasFlagBoolean(), "self.hasFlag");
        addBooleanType(new EnergyBoolean(), "self.energy");
        addBooleanType(new EnergyIncludingQueuedBoolean(), "self.energyIncludingQueued");
        addBooleanType(new EnergyBoolean().with("full=true"), "self.isEnergyFull");
        addBooleanType(new EnergyBoolean().with("empty=true"), "self.isEnergyEmpty");
        addBooleanType(new TransportingCountBoolean(), "self.transportingCount");
        addBooleanType(new TransportingUnitWithTagsBoolean(), "self.transportingUnitWithTags");
        addBooleanType(new isTransportUnloading(), "self.isTransportUnloading");
        addBooleanType(new HpBoolean(), "self.hp");
        addBooleanType(new ShieldBoolean(), "self.shield");
        addBooleanType(new AmmoBoolean(), "self.ammo");
        addBooleanType(new AmmoBoolean().with("empty=true"), "self.isAmmoEmpty");
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
        addBooleanType(new IsOnTeam().with("team=-1").lock(), "self.isOnNeutralTeam");
        addBooleanType(new IsControlledByAI(), "self.isControlledByAI");
        addBooleanType(new NumberOfUnitsInTeam(), "numberOfUnitsInTeam", "self.numberOfUnitsInTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("greaterThan=0, lessThan=-1"), "hasUnitInTeam", "self.hasUnitInTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("greaterThan=-1, lessThan=1"), "noUnitInTeam", "self.noUnitInTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("neutralTeam=true"), "numberOfUnitsInNeutralTeam", "self.numberOfUnitsInNeutralTeam");
        addBooleanType(new NumberOfUnitsInTeam().with("aggressiveTeam=true"), "numberOfUnitsInAggressiveTeam", "self.numberOfUnitsInAggressiveTeam");
        addBooleanType(new NumberOfUnitsInEnemyOrAllyTeam().with("ally=false"), "numberOfUnitsInEnemyTeam", "self.numberOfUnitsInEnemyTeam");
        addBooleanType(new NumberOfUnitsInEnemyOrAllyTeam().with("ally=true"), "numberOfUnitsInAllyTeam", "self.numberOfUnitsInAllyTeam", "numberOfUnitsInAllyNotOwnTeam", "self.numberOfUnitsInAllyNotOwnTeam");
        addBooleanType(new GameModeBoolean().with("nukesEnabled=true").lock(), "game.nukesEnabled");
        addBooleanType(trueBoolean, "true");
        addBooleanType(falseBoolean, "false");
    }

    static void addBooleanType(LogicBoolean logicBoolean, String... strArr) {
        for (String str : strArr) {
            booleans.put(str, logicBoolean);
            if (!str.replace("self.", "subject.").equals(str)) {
            }
        }
    }

    public void setArgumentsRaw(String str) {
        LogicBooleanLoader.ParameterMapping parameterMapping = (LogicBooleanLoader.ParameterMapping) parameterMappings.get(getClass());
        if (parameterMapping == null) {
            parameterMapping = new LogicBooleanLoader.ParameterMapping(getClass());
            parameterMappings.put(parameterMapping.type, parameterMapping);
        }
        LogicBooleanLoader.setArgumentsWithMapping(parameterMapping, this, str);
    }

    public LogicBoolean lock() {
        try {
            LogicBoolean logicBoolean = (LogicBoolean) clone();
            logicBoolean.locked = true;
            return logicBoolean;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public void forMeta(C0368l lVar) {
    }

    public LogicBoolean with(String str) {
        return with(null, str);
    }

    public LogicBoolean with(C0368l lVar, String str) {
        try {
            LogicBoolean logicBoolean = (LogicBoolean) clone();
            logicBoolean.forMeta(lVar);
            if (!this.locked) {
                logicBoolean.setArgumentsRaw(str);
            } else if (str != null && !str.trim().equals("")) {
                throw new BooleanParseException("No parameters accepted for " + getClass().getSimpleName());
            }
            return logicBoolean;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    public static LogicBoolean convertAlwaysTrueToNull(LogicBoolean logicBoolean) {
        if (logicBoolean == trueBoolean) {
            return null;
        }
        return logicBoolean;
    }

    public static boolean isStaticFalse(LogicBoolean logicBoolean) {
        return logicBoolean == falseBoolean;
    }

    public static boolean isStaticTrue(LogicBoolean logicBoolean) {
        return logicBoolean == trueBoolean;
    }

    public static LogicBoolean create(C0368l lVar, String str) {
        return create(lVar, str, null);
    }

    public static LogicBoolean create(C0368l lVar, String str, LogicBoolean logicBoolean) {
        if (str == null) {
            return logicBoolean;
        }
        try {
            String lowerCase = str.toLowerCase(Locale.ENGLISH);
            if (lowerCase.equalsIgnoreCase("true")) {
                return trueBoolean;
            }
            if (lowerCase.equalsIgnoreCase("false")) {
                return falseBoolean;
            }
            if (lowerCase.startsWith("if ")) {
                return LogicBooleanLoader.parseBooleanBlock(lVar, lowerCase.substring("if ".length()));
            }
            throw new BooleanParseException("Cannot parse:'" + str + "' expected true, false or statement starting with 'if'");
        } catch (RuntimeException e) {
            throw new RuntimeException("LogicBoolean - Error: " + e.getMessage() + ", [parsing: '" + str + "']", e);
        }
    }

    public void validateArguments(String str, String str2, String str3) {
    }

    public String getDebugDetails(C0367k kVar) {
        return getMatchFailReasonForPlayer(kVar) + "==" + (read(kVar) ? "true" : "false");
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$StaticBoolean.class */
    public abstract class StaticBoolean extends LogicBoolean {
        public LogicBoolean with(String str) {
            return this;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$StaticBooleanTrue.class */
    public final class StaticBooleanTrue extends StaticBoolean {
        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "true";
        }

        public boolean read(C0367k kVar) {
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$StaticBooleanFalse.class */
    public final class StaticBooleanFalse extends StaticBoolean {
        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "false";
        }

        public boolean read(C0367k kVar) {
            return false;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$JoinerBoolean.class */
    public abstract class JoinerBoolean extends LogicBoolean {
        LogicBoolean[] children;

        public abstract String type();

        public static LogicBoolean createJoiner(String str, LogicBoolean[] logicBooleanArr) {
            OrBoolean orBoolean;
            if (str.equals("or")) {
                orBoolean = new OrBoolean();
            } else if (str.equals("and")) {
                orBoolean = new AndBoolean();
            } else {
                throw new BooleanParseException("Unknown joiner:'" + str + "'");
            }
            orBoolean.children = logicBooleanArr;
            return orBoolean;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            String str = "(";
            boolean z = true;
            for (LogicBoolean logicBoolean : this.children) {
                if (!logicBoolean.read(kVar)) {
                    if (z) {
                        z = false;
                    } else {
                        str = str + " " + type() + " ";
                    }
                    str = str + logicBoolean.getMatchFailReasonForPlayer(kVar);
                }
            }
            return str + ")";
        }

        public String getDebugDetails(C0367k kVar) {
            LogicBoolean[] logicBooleanArr;
            String str = "(";
            boolean z = true;
            for (LogicBoolean logicBoolean : this.children) {
                if (z) {
                    z = false;
                } else {
                    str = str + " " + type() + " ";
                }
                str = str + logicBoolean.getDebugDetails(kVar);
            }
            return str + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$OrBoolean.class */
    public final class OrBoolean extends JoinerBoolean {
        public String type() {
            return "or";
        }

        public boolean read(C0367k kVar) {
            for (LogicBoolean logicBoolean : this.children) {
                if (logicBoolean.read(kVar)) {
                    return true;
                }
            }
            return false;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$AndBoolean.class */
    public final class AndBoolean extends JoinerBoolean {
        public String type() {
            return "and";
        }

        public boolean read(C0367k kVar) {
            for (LogicBoolean logicBoolean : this.children) {
                if (!logicBoolean.read(kVar)) {
                    return false;
                }
            }
            return true;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$NotBoolean.class */
    public final class NotBoolean extends LogicBoolean {
        LogicBoolean child;

        public NotBoolean(LogicBoolean logicBoolean) {
            this.child = logicBoolean;
        }

        public boolean read(C0367k kVar) {
            return !this.child.read(kVar);
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "not(" + this.child.getMatchFailReasonForPlayer(kVar) + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$GameModeBoolean.class */
    public class GameModeBoolean extends LogicBoolean {
        @Parameter
        public boolean nukesEnabled;

        public boolean read(C0367k kVar) {
            boolean z = true;
            AbstractC0789l u = AbstractC0789l.m651u();
            if (this.nukesEnabled && u.m766H() && u.f5486bF.f4763aH.f4818i) {
                z = false;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "GameMode(" + (this.nukesEnabled ? "Nukes enabled" : "Nukes disabled") + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$IsGameFrameBoolean.class */
    public class IsGameFrameBoolean extends LogicBoolean {
        @Parameter
        public int mod;
        @Parameter
        public int equalTo;
        @Parameter
        public boolean offset;

        @Parameter
        public void mod(int i) {
            this.mod = i;
        }

        public boolean read(C0367k kVar) {
            boolean z;
            AbstractC0789l u = AbstractC0789l.m651u();
            if (this.mod >= 0) {
                if (this.offset) {
                    z = (((long) u.f5585bg) + kVar.f5835dA) % ((long) this.mod) == ((long) this.equalTo);
                } else {
                    z = u.f5585bg % this.mod == this.equalTo;
                }
            } else if (this.offset) {
                z = ((long) u.f5585bg) + kVar.f5835dA == ((long) this.equalTo);
            } else {
                z = u.f5585bg == this.equalTo;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "IsGameFrame(mod=" + this.mod + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$HeightBoolean.class */
    public class HeightBoolean extends LogicBoolean {
        @Parameter
        public boolean underwater;
        @Parameter
        public boolean ground;
        @Parameter
        public boolean flying;

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            String str = "";
            if (this.underwater) {
                str = str + "underwater";
            }
            if (this.ground) {
                str = str + "ground";
            }
            if (this.flying) {
                str = str + "flying";
            }
            if (str.equals("")) {
                str = str + "height";
            }
            return str;
        }

        public boolean read(C0367k kVar) {
            boolean z = false;
            if (this.underwater && kVar.f5843dJ < -2.0f) {
                z = true;
            }
            if (this.ground && kVar.f5843dJ > -2.0f && kVar.f5843dJ < 5.0f) {
                z = true;
            }
            if (this.flying && kVar.f5843dJ > 5.0f) {
                z = true;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$SpeedBoolean.class */
    public class SpeedBoolean extends LogicBoolean {
        @Parameter
        public boolean atTopSpeed;

        public boolean read(C0367k kVar) {
            boolean z = false;
            float z2 = kVar.mo2418z() - 0.1f;
            if (kVar.mo2648bd()) {
                float a = C0654f.m1573a(0.0f, 0.0f, kVar.f1525bH, kVar.f1526bI);
                if (a != 0.0f && a > z2 * z2) {
                    z = true;
                }
            } else if (kVar.f1528bK != 0.0f && kVar.f1528bK > z2) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "Speed";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$MovingBoolean.class */
    public class MovingBoolean extends LogicBoolean {
        public boolean read(C0367k kVar) {
            boolean z = false;
            if (kVar.f1538cm) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "Moving";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$HasActiveWaypoint.class */
    public class HasActiveWaypoint extends LogicBoolean {
        EnumC0271ao type;

        @Parameter
        public void type(String str) {
            this.type = (EnumC0271ao) C0809ab.m602a(str, (Enum) null, EnumC0271ao.class);
        }

        public boolean read(C0367k kVar) {
            boolean z = false;
            C0270an ap = kVar.m2300ap();
            if (ap != null) {
                if (this.type == null) {
                    z = true;
                } else {
                    z = ap.m3464d() == this.type;
                }
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "HasActiveWaypoint(type=" + this.type + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$TouchWaterBoolean.class */
    public class TouchWaterBoolean extends LogicBoolean {
        public boolean read(C0367k kVar) {
            boolean z = false;
            if (kVar.m3562cr()) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "TouchWater";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$OverWaterBoolean.class */
    public class OverWaterBoolean extends LogicBoolean {
        public boolean read(C0367k kVar) {
            boolean z = false;
            if (kVar.m3560ct()) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "OverWater";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$OverLiquidBoolean.class */
    public class OverLiquidBoolean extends LogicBoolean {
        public boolean read(C0367k kVar) {
            boolean z = false;
            if (kVar.m3559cu()) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "overLiquid";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$OverCliftBoolean.class */
    public class OverCliftBoolean extends LogicBoolean {
        public boolean read(C0367k kVar) {
            boolean z = false;
            if (kVar.m3561cs()) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "OverClift";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$OverPassableTileBoolean.class */
    public class OverPassableTileBoolean extends LogicBoolean {
        EnumC0212ah movementType = EnumC0212ah.f1553b;

        @Parameter
        public void type(String str) {
            this.movementType = EnumC0212ah.m3537a(str, "isOverPassableTile()");
        }

        public boolean read(C0367k kVar) {
            boolean z = false;
            AbstractC0789l.m651u();
            if (!C0851y.m434a(kVar.f5841dH, kVar.f5842dI, this.movementType)) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "OverLand";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$TransportingCountBoolean.class */
    public class TransportingCountBoolean extends AbstractNumberBoolean {
        public C0364h _withTag;
        public boolean filtered;
        @Parameter
        public int slot = -1;

        public String getName() {
            return "TransportingCount";
        }

        @Parameter
        public void withTag(String str) {
            this._withTag = C0364h.m3111c(str);
        }

        public void validateArguments(String str, String str2, String str3) {
            super.validateArguments(str, str2, str3);
            if (this._withTag != null || this.slot != -1) {
                this.filtered = true;
            }
        }

        public float getValue(C0367k kVar) {
            int i;
            if (!this.filtered) {
                i = kVar.mo2627f();
            } else {
                i = 0;
                C0835m mVar = kVar.f2476x;
                Object[] a = mVar.m490a();
                for (int i2 = mVar.f5778a - 1; i2 >= 0; i2--) {
                    AbstractC0515r rVar = (AbstractC0515r) a[i2];
                    if (rVar != null && (this.slot == -1 || i2 == this.slot)) {
                        if (this._withTag != null) {
                            if (!C0364h.m3119a(this._withTag, rVar.mo3582cM())) {
                            }
                        }
                        i++;
                    }
                }
            }
            return i;
        }

        public float getMaxValue(C0367k kVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$HasFlagBoolean.class */
    public class HasFlagBoolean extends LogicBoolean {
        public int flagMask = 0;
        public int flagId = -1;

        @Parameter
        /* renamed from: id */
        public void m2894id(int i) {
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

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "HasFlag(id:" + this.flagId + ")";
        }

        public boolean read(C0367k kVar) {
            boolean z = true;
            if (this.flagMask != 0 && !isFlagSet(kVar.f1459ch, this.flagMask)) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$IsOnTeam.class */
    public class IsOnTeam extends LogicBoolean {
        int teamId = -99;

        @Parameter
        public void team(int i) {
            if (i < -1 || i > AbstractC0171m.f1275a) {
                throw new BooleanParseException("Flag id must be between 0-" + AbstractC0171m.f1275a);
            }
            this.teamId = i;
        }

        public void validateArguments(String str, String str2, String str3) {
            LogicBoolean.super.validateArguments(str, str2, str3);
            if (this.teamId == -99) {
                throw new BooleanParseException("Expended teamId argument for function:" + str);
            }
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "Team(id:" + this.teamId + ")";
        }

        public boolean read(C0367k kVar) {
            boolean z = true;
            if (kVar.f1441bB.f1230i != this.teamId) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$TagsBoolean.class */
    public class TagsBoolean extends LogicBoolean {
        public C0364h includesTag;

        @Parameter
        public void includes(String str) {
            this.includesTag = C0364h.m3111c(str);
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            String str = "Tag";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        public boolean read(C0367k kVar) {
            C0365i cM;
            boolean z = true;
            if (this.includesTag != null && ((cM = kVar.mo3582cM()) == null || !C0364h.m3119a(this.includesTag, cM))) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$TeamTagBoolean.class */
    public class TeamTagBoolean extends LogicBoolean {
        public C0364h includesTag;

        @Parameter
        public void includes(String str) {
            this.includesTag = C0364h.m3111c(str);
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            String str = "Team Tag ";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        public boolean read(C0367k kVar) {
            C0365i O;
            boolean z = true;
            if (this.includesTag != null && ((O = kVar.f1441bB.m3820O()) == null || !C0364h.m3119a(this.includesTag, O))) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$TransportingUnitWithTagsBoolean.class */
    public class TransportingUnitWithTagsBoolean extends LogicBoolean {
        public C0364h includesTag;

        @Parameter
        public void includes(String str) {
            this.includesTag = C0364h.m3111c(str);
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            String str = "TransportingUnitWithTags ";
            if (this.includesTag != null) {
                str = str + " includes " + this.includesTag;
            }
            return str;
        }

        public boolean read(C0367k kVar) {
            boolean z = false;
            if (this.includesTag != null) {
                Object[] a = kVar.f2476x.m490a();
                for (int i = 0; i < kVar.f2476x.f5778a; i++) {
                    C0365i cM = ((AbstractC0210af) a[i]).mo3582cM();
                    if (cM != null && C0364h.m3119a(this.includesTag, cM)) {
                        z = true;
                    }
                }
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$isTransportUnloading.class */
    public class isTransportUnloading extends LogicBoolean {
        public boolean read(C0367k kVar) {
            boolean z = false;
            if (kVar.mo2625m_()) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "IsTransportUnloading";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$AbstractNumberBoolean.class */
    public abstract class AbstractNumberBoolean extends LogicBoolean {
        @Parameter
        public boolean full;
        @Parameter
        public boolean empty;
        @Parameter
        public float greaterThan = -1.0f;
        @Parameter
        public float lessThan = -1.0f;

        public abstract String getName();

        public abstract float getValue(C0367k kVar);

        public abstract float getMaxValue(C0367k kVar);

        @Parameter
        public void equalTo(float f) {
            this.greaterThan = f - 1.0E-4f;
            this.lessThan = f + 1.0E-4f;
        }

        public void validateArguments(String str, String str2, String str3) {
            LogicBoolean.super.validateArguments(str, str2, str3);
            if (this.greaterThan == -1.0f && this.lessThan == -1.0f && !this.full && !this.empty) {
                throw new BooleanParseException("Expected greaterThan, lessThan, full, and/or empty to be set for function:" + str);
            }
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            String str = getName() + "=" + C0654f.m1570a(getValue(kVar), 3) + "";
            if (this.full) {
                str = str + "(full)";
            }
            if (this.empty) {
                str = str + "(empty)";
            }
            if (this.greaterThan != -1.0f) {
                str = str + ">" + C0654f.m1570a(this.greaterThan, 3);
            }
            if (this.lessThan != -1.0f) {
                str = str + "<" + C0654f.m1570a(this.lessThan, 3);
            }
            return str;
        }

        public boolean read(C0367k kVar) {
            float value = getValue(kVar);
            boolean z = true;
            if (this.full && value < getMaxValue(kVar)) {
                z = false;
            }
            if (this.empty && value > 0.0f) {
                z = false;
            }
            if (this.greaterThan != -1.0f && value <= this.greaterThan) {
                z = false;
            }
            if (this.lessThan != -1.0f && value >= this.lessThan) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$TimeBoolean.class */
    public abstract class TimeBoolean extends LogicBoolean {
        @Parameter
        public float laterThanSeconds = -1.0f;
        @Parameter
        public float withinSeconds = -1.0f;

        public abstract String getName();

        public abstract int getTime(C0367k kVar);

        public void validateArguments(String str, String str2, String str3) {
            LogicBoolean.super.validateArguments(str, str2, str3);
            if (this.laterThanSeconds == -1.0f && this.withinSeconds == -1.0f) {
                throw new BooleanParseException("Expended laterThanSeconds, or withinSeconds argument for function:" + str);
            }
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            String str = getName() + "=" + msToSecondsString(AbstractC0789l.m651u().f5467bh - getTime(kVar));
            if (this.laterThanSeconds != -1.0f) {
                str = str + ">" + msToSecondsString(this.laterThanSeconds * 1000.0f);
            }
            if (this.withinSeconds != -1.0f) {
                str = str + "<" + msToSecondsString(this.withinSeconds * 1000.0f);
            }
            return str;
        }

        private String msToSecondsString(float f) {
            return C0654f.m1488f(f / 1000.0f) + "s";
        }

        public boolean read(C0367k kVar) {
            int time = getTime(kVar);
            boolean z = true;
            AbstractC0789l u = AbstractC0789l.m651u();
            if (this.withinSeconds > 0.0f && u.f5467bh - (this.withinSeconds * 1000.0f) > time) {
                z = false;
            }
            if (this.laterThanSeconds > 0.0f && u.f5467bh - (this.laterThanSeconds * 1000.0f) < time) {
                z = false;
            }
            return z;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$HeightValueBoolean.class */
    public final class HeightValueBoolean extends AbstractNumberBoolean {
        public String getName() {
            return "Height";
        }

        public float getValue(C0367k kVar) {
            return kVar.f5843dJ;
        }

        public float getMaxValue(C0367k kVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$EnergyBoolean.class */
    public final class EnergyBoolean extends AbstractNumberBoolean {
        public String getName() {
            return "Energy";
        }

        public float getValue(C0367k kVar) {
            return kVar.f1457cf;
        }

        public float getMaxValue(C0367k kVar) {
            return kVar.mo2725aY();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$EnergyIncludingQueuedBoolean.class */
    public final class EnergyIncludingQueuedBoolean extends AbstractNumberBoolean {
        public String getName() {
            return "EnergyIncludingQueued";
        }

        public float getValue(C0367k kVar) {
            return kVar.f1457cf + kVar.m2999db().f2424c;
        }

        public float getMaxValue(C0367k kVar) {
            return kVar.mo2725aY();
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$HpBoolean.class */
    public final class HpBoolean extends AbstractNumberBoolean {
        public String getName() {
            return "Hp";
        }

        public float getValue(C0367k kVar) {
            return kVar.f1450bY;
        }

        public float getMaxValue(C0367k kVar) {
            return kVar.f1451bZ;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$ShieldBoolean.class */
    public final class ShieldBoolean extends AbstractNumberBoolean {
        public String getName() {
            return "Shield";
        }

        public float getValue(C0367k kVar) {
            return kVar.f1453cb;
        }

        public float getMaxValue(C0367k kVar) {
            return kVar.f1456ce;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$AmmoBoolean.class */
    public final class AmmoBoolean extends AbstractNumberBoolean {
        public String getName() {
            return "Ammo";
        }

        public float getValue(C0367k kVar) {
            return kVar.f1458cg;
        }

        public float getMaxValue(C0367k kVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$ResourceCountBoolean.class */
    public final class ResourceCountBoolean extends AbstractNumberBoolean {
        C0368l meta;
        C0345a type;

        public void forMeta(C0368l lVar) {
            if (lVar == null) {
                throw new BooleanParseException("NumberOfConnectionsBoolean requires metadata");
            }
            this.meta = lVar;
        }

        @Parameter
        public void type(String str) {
            this.type = this.meta.m2920h(str);
            if (this.type == null) {
                throw new BooleanParseException("Could not find custom resource type of:" + this.type);
            }
        }

        public void validateArguments(String str, String str2, String str3) {
            super.validateArguments(str, str2, str3);
            if (this.type == null) {
                throw new BooleanParseException("Requires 'type'");
            }
        }

        public String getName() {
            return this.type + "";
        }

        public float getValue(C0367k kVar) {
            return (float) this.type.mo3221a(kVar);
        }

        public float getMaxValue(C0367k kVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$NumberOfConnectionsBoolean.class */
    public final class NumberOfConnectionsBoolean extends AbstractNumberBoolean {
        C0368l meta;
        C0338a connectionMetadata;

        public void forMeta(C0368l lVar) {
            if (lVar == null) {
                throw new BooleanParseException("NumberOfConnectionsBoolean requires metadata");
            }
            this.meta = lVar;
        }

        @Parameter
        public void name(String str) {
            this.connectionMetadata = this.meta.m2916j(str);
            if (this.connectionMetadata == null) {
                throw new BooleanParseException("Could not find connection type with name: " + str);
            }
        }

        public void validateArguments(String str, String str2, String str3) {
            super.validateArguments(str, str2, str3);
            if (this.connectionMetadata == null) {
                throw new BooleanParseException("requires connection name");
            }
        }

        public String getName() {
            return "NumberOfConnections";
        }

        public float getValue(C0367k kVar) {
            return kVar.f1548dk.m3239a(this.connectionMetadata);
        }

        public float getMaxValue(C0367k kVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$HasResourcesBoolean.class */
    public final class HasResourcesBoolean extends LogicBoolean {
        C0363g requiredResources;
        C0368l meta;

        public void forMeta(C0368l lVar) {
            if (lVar == null) {
                throw new BooleanParseException("HasResourcesBoolean requires metadata");
            }
            this.meta = lVar;
        }

        public void setArgumentsRaw(String str) {
            try {
                this.requiredResources = C0363g.m3143a(this.meta, str);
            } catch (C0324at e) {
                throw new BooleanParseException(e.getMessage(), e);
            }
        }

        public boolean read(C0367k kVar) {
            boolean z = false;
            if (this.requiredResources.m3135b((AbstractC0210af) kVar, false)) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "HasResources(" + this.requiredResources.m3140a(false, true, 8, true) + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$IsResourceLargerThan.class */
    public final class IsResourceLargerThan extends LogicBoolean {
        C0368l meta;
        C0345a source;
        C0345a compareTarget;
        @Parameter
        public float byMoreThan = 0.0f;
        @Parameter
        public float multiplyTargetBy = 1.0f;

        public void forMeta(C0368l lVar) {
            if (lVar == null) {
                throw new BooleanParseException("IsResourceLargerThan requires metadata");
            }
            this.meta = lVar;
        }

        @Parameter
        public void source(String str) {
            this.source = this.meta.m2920h(str);
            if (this.source == null) {
                throw new BooleanParseException("Could not find custom resource type of:" + this.source);
            }
        }

        @Parameter
        public void compareTarget(String str) {
            this.compareTarget = this.meta.m2920h(str);
            if (this.compareTarget == null) {
                throw new BooleanParseException("Could not find custom resource type of:" + this.compareTarget);
            }
        }

        public void validateArguments(String str, String str2, String str3) {
            LogicBoolean.super.validateArguments(str, str2, str3);
            if (this.source == null) {
                throw new BooleanParseException("Requires 'source'");
            } else if (this.compareTarget == null) {
                throw new BooleanParseException("Requires 'compareTarget'");
            }
        }

        public boolean read(C0367k kVar) {
            boolean z = false;
            if (this.source.mo3221a(kVar) > (this.compareTarget.mo3221a(kVar) + this.byMoreThan) * this.multiplyTargetBy) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "IsResourceLargerThan(" + this.source.m3222h() + " vs " + this.compareTarget.m3222h() + ")";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$KillsBoolean.class */
    public final class KillsBoolean extends AbstractNumberBoolean {
        public String getName() {
            return "Kills";
        }

        public float getValue(C0367k kVar) {
            return kVar.f1467cw;
        }

        public float getMaxValue(C0367k kVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$NumberOfUnitsInTeam.class */
    public final class NumberOfUnitsInTeam extends AbstractNumberBoolean {
        public C0364h _withTag;
        @Parameter
        public float withinRange = -1.0f;
        public float withinRangeSq = -1.0f;
        @Parameter
        public boolean incompleteBuildings;
        @Parameter
        public boolean factoryQueue;
        @Parameter
        public boolean neutralTeam;
        public boolean useAggressiveTeamInsteadOfNeutralTeam;
        public static final HandleCallbackCount handleCallbackCount = new HandleCallbackCount();

        @Parameter
        public void aggressiveTeam(boolean z) {
            if (z) {
                this.neutralTeam = true;
                this.useAggressiveTeamInsteadOfNeutralTeam = true;
            }
        }

        @Parameter
        public void withTag(String str) {
            this._withTag = C0364h.m3111c(str);
        }

        public void validateArguments(String str, String str2, String str3) {
            super.validateArguments(str, str2, str3);
            if (this.withinRange > 1000.0f) {
                throw new BooleanParseException("For CPU reasons withinRange argument cannot be over 1000 (but unlimited range is fine) in function:" + str);
            } else if (this.withinRange > 0.0f) {
                this.withinRangeSq = this.withinRange * this.withinRange;
                if (this.factoryQueue) {
                    throw new BooleanParseException("'factoryQueue' and 'withinRange' are not supported at the same time in function:" + str);
                }
            }
        }

        public String getName() {
            return "Unit count of " + this._withTag + (this.withinRange < 0.0f ? "" : " (within range " + this.withinRange + ")");
        }

        public float getValue(C0367k kVar) {
            int i;
            AbstractC0171m mVar = kVar.f1441bB;
            if (this.neutralTeam) {
                if (!this.useAggressiveTeamInsteadOfNeutralTeam) {
                    mVar = AbstractC0171m.f1281g;
                } else {
                    mVar = AbstractC0171m.f1280f;
                }
            }
            if (this._withTag == null) {
                i = mVar.m3798a(this.incompleteBuildings, this.factoryQueue);
            } else {
                i = mVar.m3810a(this._withTag, this.incompleteBuildings, this.factoryQueue);
            }
            if (this.withinRange < 0.0f || i == 0) {
                return i;
            }
            handleCallbackCount.withinRangeSq = this.withinRangeSq;
            handleCallbackCount.count = 0;
            handleCallbackCount.tag = this._withTag;
            handleCallbackCount.incompleteBuildings = this.incompleteBuildings;
            handleCallbackCount.targetTeam = mVar;
            AbstractC0789l.m651u().f5491bK.m2593a(kVar.f5841dH, kVar.f5842dI, this.withinRange, kVar, 0.0f, handleCallbackCount);
            return handleCallbackCount.count;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$NumberOfUnitsInTeam$HandleCallbackCount.class */
        public class HandleCallbackCount extends AbstractC0459i {
            public C0364h tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;
            public AbstractC0171m targetTeam;

            public void setup(AbstractC0515r rVar, float f) {
            }

            public int excludeTeam(AbstractC0515r rVar) {
                return -1;
            }

            public AbstractC0171m onlyEnemiesOfTeam(AbstractC0515r rVar) {
                return null;
            }

            public AbstractC0171m onlyTeam(AbstractC0515r rVar) {
                return this.targetTeam;
            }

            public void callback(AbstractC0515r rVar, float f, AbstractC0210af afVar) {
                C0365i cM = afVar.mo3582cM();
                if ((this.tag != null && (cM == null || !C0364h.m3119a(this.tag, cM))) || C0654f.m1573a(rVar.f5841dH, rVar.f5842dI, afVar.f5841dH, afVar.f5842dI) >= this.withinRangeSq) {
                    return;
                }
                if (afVar.f1529bR >= 1.0f || this.incompleteBuildings) {
                    this.count++;
                }
            }
        }

        public float getMaxValue(C0367k kVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$NumberOfUnitsInEnemyOrAllyTeam.class */
    public final class NumberOfUnitsInEnemyOrAllyTeam extends AbstractNumberBoolean {
        public C0364h _withTag;
        @Parameter
        public float withinRange = -1.0f;
        public float withinRangeSq = -1.0f;
        @Parameter
        public boolean incompleteBuildings;
        @Parameter
        public boolean factoryQueue;
        @Parameter
        public boolean ally;
        public static final HandleCallbackCountEnemies handleCallbackCountEnemies = new HandleCallbackCountEnemies();
        public static final HandleCallbackCountAlly handleCallbackCountAlly = new HandleCallbackCountAlly();

        @Parameter
        public void withTag(String str) {
            this._withTag = C0364h.m3111c(str);
        }

        public void validateArguments(String str, String str2, String str3) {
            super.validateArguments(str, str2, str3);
            if (this.withinRange > 1000.0f) {
                throw new BooleanParseException("For CPU reasons withinRange argument cannot be over 1000 (but unlimited range is fine) in function:" + str);
            } else if (this.withinRange > 0.0f) {
                this.withinRangeSq = this.withinRange * this.withinRange;
                if (this.factoryQueue) {
                    throw new BooleanParseException("'factoryQueue' and 'withinRange' are not supported at the same time in function:" + str);
                }
            }
        }

        public String getName() {
            return "Enemy Unit count of " + this._withTag + (this.withinRange < 0.0f ? "" : " (within range " + this.withinRange + ")");
        }

        public float getValue(C0367k kVar) {
            AbstractC0171m mVar = kVar.f1441bB;
            int i = 0;
            if (!this.ally) {
                for (int i2 = 0; i2 < AbstractC0171m.f1275a; i2++) {
                    AbstractC0171m n = AbstractC0171m.m3740n(i2);
                    if (!(n == null || mVar == n || !mVar.m3778c(n))) {
                        if (this._withTag == null) {
                            i += n.m3798a(this.incompleteBuildings, this.factoryQueue);
                        } else {
                            i += n.m3810a(this._withTag, this.incompleteBuildings, this.factoryQueue);
                        }
                    }
                }
            } else {
                for (int i3 = 0; i3 < AbstractC0171m.f1275a; i3++) {
                    AbstractC0171m n2 = AbstractC0171m.m3740n(i3);
                    if (!(n2 == null || mVar == n2 || !mVar.m3768d(n2))) {
                        if (this._withTag == null) {
                            i += n2.m3798a(this.incompleteBuildings, this.factoryQueue);
                        } else {
                            i += n2.m3810a(this._withTag, this.incompleteBuildings, this.factoryQueue);
                        }
                    }
                }
            }
            if (this.withinRange < 0.0f || i == 0) {
                return i;
            }
            if (!this.ally) {
                handleCallbackCountEnemies.withinRangeSq = this.withinRangeSq;
                handleCallbackCountEnemies.count = 0;
                handleCallbackCountEnemies.tag = this._withTag;
                handleCallbackCountEnemies.incompleteBuildings = this.incompleteBuildings;
                AbstractC0789l.m651u().f5491bK.m2593a(kVar.f5841dH, kVar.f5842dI, this.withinRange, kVar, 0.0f, handleCallbackCountEnemies);
                return handleCallbackCountEnemies.count;
            }
            handleCallbackCountAlly.withinRangeSq = this.withinRangeSq;
            handleCallbackCountAlly.count = 0;
            handleCallbackCountAlly.tag = this._withTag;
            handleCallbackCountAlly.incompleteBuildings = this.incompleteBuildings;
            handleCallbackCountAlly.ally = kVar.f1441bB;
            AbstractC0789l.m651u().f5491bK.m2593a(kVar.f5841dH, kVar.f5842dI, this.withinRange, kVar, 0.0f, handleCallbackCountAlly);
            return handleCallbackCountAlly.count;
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountEnemies.class */
        public class HandleCallbackCountEnemies extends AbstractC0459i {
            public C0364h tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;

            public void setup(AbstractC0515r rVar, float f) {
            }

            public int excludeTeam(AbstractC0515r rVar) {
                return -1;
            }

            public AbstractC0171m onlyEnemiesOfTeam(AbstractC0515r rVar) {
                return rVar.f1441bB;
            }

            public AbstractC0171m onlyTeam(AbstractC0515r rVar) {
                return null;
            }

            public void callback(AbstractC0515r rVar, float f, AbstractC0210af afVar) {
                C0365i cM = afVar.mo3582cM();
                if ((this.tag != null && (cM == null || !C0364h.m3119a(this.tag, cM))) || C0654f.m1573a(rVar.f5841dH, rVar.f5842dI, afVar.f5841dH, afVar.f5842dI) >= this.withinRangeSq) {
                    return;
                }
                if (afVar.f1529bR >= 1.0f || this.incompleteBuildings) {
                    this.count++;
                }
            }
        }

        /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$NumberOfUnitsInEnemyOrAllyTeam$HandleCallbackCountAlly.class */
        public class HandleCallbackCountAlly extends AbstractC0459i {
            public AbstractC0171m ally;
            public C0364h tag;
            public int count;
            public float withinRangeSq;
            public boolean incompleteBuildings;

            public void setup(AbstractC0515r rVar, float f) {
            }

            public int excludeTeam(AbstractC0515r rVar) {
                return -1;
            }

            public AbstractC0171m onlyEnemiesOfTeam(AbstractC0515r rVar) {
                return null;
            }

            public AbstractC0171m onlyTeam(AbstractC0515r rVar) {
                return null;
            }

            public void callback(AbstractC0515r rVar, float f, AbstractC0210af afVar) {
                if (this.ally != afVar.f1441bB && this.ally.m3768d(afVar.f1441bB)) {
                    C0365i cM = afVar.mo3582cM();
                    if ((this.tag != null && (cM == null || !C0364h.m3119a(this.tag, cM))) || C0654f.m1573a(rVar.f5841dH, rVar.f5842dI, afVar.f5841dH, afVar.f5842dI) >= this.withinRangeSq) {
                        return;
                    }
                    if (afVar.f1529bR >= 1.0f || this.incompleteBuildings) {
                        this.count++;
                    }
                }
            }
        }

        public float getMaxValue(C0367k kVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$AmmoIncludingQueuedBoolean.class */
    public final class AmmoIncludingQueuedBoolean extends AbstractNumberBoolean {
        public String getName() {
            return "AmmoIncludingQueued";
        }

        public float getValue(C0367k kVar) {
            return kVar.f1458cg + kVar.m2999db().f2427f;
        }

        public float getMaxValue(C0367k kVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$QueueSize.class */
    public final class QueueSize extends AbstractNumberBoolean {
        public String getName() {
            return "QueueSize";
        }

        public float getValue(C0367k kVar) {
            return kVar.mo2769cW();
        }

        public float getMaxValue(C0367k kVar) {
            return 2.14748365E9f;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$TimeAliveBoolean.class */
    public final class TimeAliveBoolean extends TimeBoolean {
        public String getName() {
            return "TimeAlive";
        }

        public int getTime(C0367k kVar) {
            return kVar.f1436bf;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$LastConvertedBoolean.class */
    public final class LastConvertedBoolean extends TimeBoolean {
        public String getName() {
            return "LastConverted";
        }

        public int getTime(C0367k kVar) {
            return kVar.f1513bh;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$CustomTimerBoolean.class */
    public final class CustomTimerBoolean extends TimeBoolean {
        public String getName() {
            return "CustomTimer";
        }

        public int getTime(C0367k kVar) {
            return kVar.f1512bg;
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$HasTakenDamage.class */
    public class HasTakenDamage extends TimeBoolean {
        public int getTime(C0367k kVar) {
            return kVar.f1510bd;
        }

        public String getName() {
            return "HasTakenDamage";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$IsAttackingBoolean.class */
    public class IsAttackingBoolean extends LogicBoolean {
        public boolean read(C0367k kVar) {
            boolean z = false;
            if (kVar.m2387Y()) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "Attacking";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$IsControlledByAI.class */
    public class IsControlledByAI extends LogicBoolean {
        public boolean read(C0367k kVar) {
            boolean z = false;
            if (kVar.f1441bB.f1239r) {
                z = true;
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "IsControlledByAI";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$HasParent.class */
    public final class HasParent extends LogicBoolean {
        public C0364h _withTag;

        @Parameter
        public void withTag(String str) {
            this._withTag = C0364h.m3111c(str);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r0v18, types: [com.corrodinggames.rts.game.units.af] */
        public boolean read(C0367k kVar) {
            boolean z = false;
            AbstractC0515r rVar = kVar.f1540cq;
            if (rVar == null && kVar.f1539cp != null) {
                rVar = kVar.f1539cp;
            }
            if (rVar != null) {
                z = true;
                if (this._withTag != null) {
                    if (!C0364h.m3119a(this._withTag, rVar.mo3582cM())) {
                        z = false;
                    }
                }
            }
            return z;
        }

        public String getMatchFailReasonForPlayer(C0367k kVar) {
            return "HasParent";
        }
    }

    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/logicBooleans/LogicBoolean$NumberOfAttachedUnitsBoolean.class */
    public final class NumberOfAttachedUnitsBoolean extends AbstractNumberBoolean {
        public C0364h _withTag;
        short attachmentId = -1;
        C0368l meta;

        public void forMeta(C0368l lVar) {
            if (lVar == null) {
                throw new C0818ak("NumberOfAttachedUnitsBoolean requires metadata");
            }
            this.meta = lVar;
        }

        @Parameter
        public void withTag(String str) {
            this._withTag = C0364h.m3111c(str);
        }

        @Parameter
        public void slot(String str) {
            C0336i g = this.meta.m2922g(str);
            if (g == null) {
                throw new C0818ak("No attachment slot with name: " + str + " found");
            }
            this.attachmentId = g.m3251a();
        }

        public String getName() {
            String str = "";
            if (this._withTag != null) {
                str = str + "tag=" + this._withTag;
            }
            if (this.attachmentId != -1) {
                str = str + " attachmentId=" + ((int) this.attachmentId);
            }
            return "NumberOfAttachedUnits(" + str + ")";
        }

        public float getValue(C0367k kVar) {
            if (kVar.f2477y == null) {
                return 0.0f;
            }
            int i = 0;
            Object[] a = kVar.f2477y.m490a();
            for (int i2 = kVar.f2477y.f5778a - 1; i2 >= 0; i2--) {
                AbstractC0515r rVar = (AbstractC0515r) a[i2];
                if (rVar != null && (this.attachmentId == -1 || i2 == this.attachmentId)) {
                    if (this._withTag != null) {
                        if (!C0364h.m3119a(this._withTag, rVar.mo3582cM())) {
                        }
                    }
                    i++;
                }
            }
            return i;
        }

        public float getMaxValue(C0367k kVar) {
            return 2.14748365E9f;
        }
    }
}
