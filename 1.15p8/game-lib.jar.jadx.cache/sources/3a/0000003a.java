package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.effect.EffectEngine;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.effect.EffectType;
import com.corrodinggames.rts.gameFramework.effect.Emitter;
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.effect.ImageStrip;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.UnitConfig;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.av */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/av.class */
public class C0369av {
    public static final C0369av defaultEffectTemplate = new C0369av("default");
    public String name;
    private EnumC0370aw builtInEffect;
    public ImageStrip imageStrip;
    public boolean createWhenOffscreen;
    public boolean createWhenZoomedOut;
    public boolean createWhenOverLiquid;
    public boolean createWhenOverLand;
    public float spawnChance;
    C0449y ifSpawnFailsEmitEffects;
    public float life;
    public float lifeRandom;
    public boolean showInFog;
    public float xOffsetRelative;
    public float yOffsetRelative;
    public float hOffset;
    public boolean alwayStartDirAtZero;
    public float pivotOffset;
    public float pivotOffsetRandom;
    public float dirOffset;
    public float xOffsetRelativeRandom;
    public float yOffsetRelativeRandom;
    public float hOffsetRandom;
    public float dirOffsetRandom;
    public float xOffsetAbsolute;
    public float yOffsetAbsolute;
    public float xOffsetAbsoluteRandom;
    public float yOffsetAbsoluteRandom;
    public float xSpeedRelative;
    public float ySpeedRelative;
    public float hSpeed;
    public float dirSpeed;
    public float xSpeedRelativeRandom;
    public float ySpeedRelativeRandom;
    public float hSpeedRandom;
    public float dirSpeedRandom;
    public float xSpeedAbsolute;
    public float ySpeedAbsolute;
    public float xSpeedAbsoluteRandom;
    public float ySpeedAbsoluteRandom;
    public EnumC0668h priority;
    public float scaleTo;
    public float scaleFrom;
    public float alpha;
    public int color;
    public LightingColorFilter cachedLightingColorFilter;
    public float teamColorRatio;
    public boolean shadow;
    public short drawLayer;
    public float fadeInTime;
    public boolean fadeOut;
    public float delayedStartTimer;
    public float delayedStartTimerRandom;
    public int frameIndex;
    public int frameIndexRandom;
    public int stripIndex;
    public boolean attachedToUnit;
    public boolean liveAfterAttachedDies;
    public boolean atmospheric;
    public boolean physics;
    public float physicsGravity;
    public int animateFrameStart;
    public int animateFrameEnd;
    public int animateFrameStartRandomAdd;
    public boolean animateFramePingPong;
    public boolean animateFrameLooping;
    public float animateFrameSpeed;
    public float animateFrameSpeedRandom;
    public C0449y alsoEmitEffects;
    public C0449y alsoEmitEffectsOnDeath;
    public C0392bi alsoPlaySound;
    public static ArrayList fields;

    public C0369av(EnumC0370aw enumC0370aw) {
        this.builtInEffect = null;
        this.spawnChance = 1.0f;
        this.life = 200.0f;
        this.priority = EnumC0668h.f4399c;
        this.scaleTo = 1.0f;
        this.scaleFrom = 1.0f;
        this.alpha = 1.0f;
        this.color = -1;
        this.teamColorRatio = 0.0f;
        this.drawLayer = (short) 2;
        this.physicsGravity = 1.0f;
        this.builtInEffect = enumC0370aw;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0369av(String str) {
        this.builtInEffect = null;
        this.spawnChance = 1.0f;
        this.life = 200.0f;
        this.priority = EnumC0668h.f4399c;
        this.scaleTo = 1.0f;
        this.scaleFrom = 1.0f;
        this.alpha = 1.0f;
        this.color = -1;
        this.teamColorRatio = 0.0f;
        this.drawLayer = (short) 2;
        this.physicsGravity = 1.0f;
        this.name = str;
    }

    /* renamed from: a */
    public EffectObject m3495a(float f, float f2, float f3, float f4, GameObject gameObject, int i, short s) {
        Unit unit;
        EffectObject effectObject;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.spawnChance < 1.0f && CommonUtils.rnd(0.0f, 1.0f) > this.spawnChance) {
            if (i < 5 && this.ifSpawnFailsEmitEffects != null) {
                this.ifSpawnFailsEmitEffects.m3042a(f, f2, f3, f4, gameObject, i + 1, s);
                return null;
            }
            return null;
        } else if (this.builtInEffect != null) {
            if (this.builtInEffect == EnumC0370aw.f2190a) {
                effectObject = gameEngine.effects.emitSmalFlame(f, f2, f3, f4);
            } else if (this.builtInEffect == EnumC0370aw.f2191b) {
                effectObject = gameEngine.effects.m2213b(f, f2, f3, f4, 0);
                if (effectObject != null) {
                    effectObject.f4287H = 0.75f;
                    effectObject.f4286G = 0.75f;
                }
            } else if (this.builtInEffect == EnumC0370aw.f2192c) {
                effectObject = gameEngine.effects.m2213b(f, f2, f3, f4, 0);
            } else if (this.builtInEffect == EnumC0370aw.f2193d) {
                effectObject = gameEngine.effects.m2208c(f, f2, f3, f4, 0);
            } else if (this.builtInEffect == EnumC0370aw.f2194e) {
                effectObject = gameEngine.effects.m2205d(f, f2, f3, 0);
            } else if (this.builtInEffect == EnumC0370aw.f2195f) {
                gameEngine.effects.m2237a(f, f2, f3);
                effectObject = null;
            } else if (this.builtInEffect == EnumC0370aw.f2196g) {
                effectObject = gameEngine.effects.emitSmalExplosion(f, f2, f3);
            } else if (this.builtInEffect == EnumC0370aw.f2197h) {
                Emitter.m2195a(f, f2).f4380j = -6684775;
                Emitter m2191b = Emitter.m2191b(f, f2);
                m2191b.f4362a = 500.0f;
                m2191b.f4380j = -6684775;
                gameEngine.effects.m2210b(EnumC0668h.f4401e);
                EffectObject m2207c = gameEngine.effects.m2207c(f, f2, f3, -1127220);
                if (m2207c != null) {
                    m2207c.f4287H = 0.15f;
                    m2207c.f4286G = 1.0f;
                    m2207c.drawLayer = (short) 2;
                    m2207c.timer = 35.0f;
                    m2207c.startTimer = m2207c.timer;
                    m2207c.f4301V = 0.0f;
                    m2207c.f4336y = -13378253;
                }
                effectObject = null;
            } else if (this.builtInEffect == EnumC0370aw.f2198i) {
                return null;
            } else {
                throw new RuntimeException("Unhandled built-in type:" + this.builtInEffect);
            }
            if (effectObject == null) {
                return null;
            }
            effectObject.drawLayer = (short) 2;
            if (gameObject != null) {
                EffectEngine.m2225a(effectObject, gameObject);
            }
            return effectObject;
        } else if (!this.createWhenZoomedOut && !gameEngine.f5966db) {
            return null;
        } else {
            if (!this.createWhenOverLiquid && C0955y.m436d(f, f2)) {
                return null;
            }
            if (!this.createWhenOverLand && !C0955y.m436d(f, f2)) {
                return null;
            }
            if (this.createWhenOffscreen) {
                gameEngine.effects.m2218b();
            } else {
                gameEngine.effects.m2240a();
            }
            boolean z = this.showInFog;
            boolean z2 = false;
            if (!z && this.attachedToUnit) {
                z2 = true;
                z = true;
            }
            EffectObject emitEffect = gameEngine.effects.emitEffect(f, f2, f3, EffectType.f4274a, z, this.priority);
            if (emitEffect == null) {
                return null;
            }
            emitEffect.f4348a = this;
            emitEffect.f4284B = (short) (s + 1);
            if (z2 && !this.showInFog) {
                emitEffect.f4349e = false;
            }
            emitEffect.timer = this.life;
            emitEffect.timer += m3497a(this.lifeRandom);
            emitEffect.startTimer = emitEffect.timer;
            emitEffect.stripIndex = this.stripIndex;
            if (this.imageStrip != null) {
            }
            emitEffect.frameIndex = this.frameIndex;
            if (this.frameIndexRandom != 0) {
                emitEffect.frameIndex += CommonUtils.m1737a(-this.frameIndexRandom, this.frameIndexRandom);
                if (emitEffect.frameIndex < 0) {
                    emitEffect.frameIndex = 0;
                }
            }
            float m3497a = f4 + this.pivotOffset + m3497a(this.pivotOffsetRandom);
            if (this.alwayStartDirAtZero) {
                emitEffect.f4304Y = 0.0f;
            } else {
                emitEffect.f4304Y = m3497a;
            }
            emitEffect.f4304Y += this.dirOffset;
            emitEffect.f4304Y += m3497a(this.dirOffsetRandom);
            if (this.xOffsetAbsoluteRandom != 0.0f || this.yOffsetAbsoluteRandom != 0.0f || this.xOffsetAbsolute != 0.0f || this.yOffsetAbsolute != 0.0f) {
                float m3497a2 = this.xOffsetAbsolute + m3497a(this.xOffsetAbsoluteRandom);
                float m3497a3 = this.yOffsetAbsolute + m3497a(this.yOffsetAbsoluteRandom);
                emitEffect.f4289J += m3497a2;
                emitEffect.f4290K += m3497a3;
            }
            if (this.xOffsetRelativeRandom != 0.0f || this.yOffsetRelativeRandom != 0.0f || this.xOffsetRelative != 0.0f || this.yOffsetRelative != 0.0f) {
                float cos = CommonUtils.cos(m3497a);
                float sin = CommonUtils.sin(m3497a);
                float m3497a4 = this.xOffsetRelative + m3497a(this.xOffsetRelativeRandom);
                float m3497a5 = this.yOffsetRelative + m3497a(this.yOffsetRelativeRandom);
                emitEffect.f4289J += (cos * m3497a5) - (sin * m3497a4);
                emitEffect.f4290K += (sin * m3497a5) + (cos * m3497a4);
            }
            emitEffect.f4291L += this.hOffset + m3496a(-this.hOffsetRandom, this.hOffsetRandom);
            emitEffect.f4355am = true;
            emitEffect.fadeOut = true;
            emitEffect.drawLayer = this.drawLayer;
            emitEffect.f4287H = this.scaleFrom;
            emitEffect.f4286G = this.scaleTo;
            emitEffect.startingAlpha = this.alpha;
            emitEffect.f4336y = this.color;
            emitEffect.lightingColorFilter = this.cachedLightingColorFilter;
            if (this.teamColorRatio != 0.0f && gameObject != null) {
                Team team = null;
                if (gameObject instanceof Unit) {
                    team = ((Unit) gameObject).team;
                }
                if ((gameObject instanceof Projectile) && (unit = ((Projectile) gameObject).source) != null) {
                    team = unit.team;
                }
                if (team != null) {
                    float f5 = 1.0f - this.teamColorRatio;
                    int m4734a = Color.m4734a(emitEffect.f4336y);
                    int m4730b = (int) (Color.m4730b(emitEffect.f4336y) * f5);
                    int m4729c = (int) (Color.m4729c(emitEffect.f4336y) * f5);
                    int m4728d = (int) (Color.m4728d(emitEffect.f4336y) * f5);
                    int m3983E = team.m3983E();
                    emitEffect.f4336y = Color.argb(m4734a, CommonUtils.m1687b((int) (m4730b + (Color.m4730b(m3983E) * this.teamColorRatio)), 0, 255), CommonUtils.m1687b((int) (m4729c + (Color.m4729c(m3983E) * this.teamColorRatio)), 0, 255), CommonUtils.m1687b((int) (m4728d + (Color.m4728d(m3983E) * this.teamColorRatio)), 0, 255));
                    if (GameEngine.isNonDedicatedServer()) {
                        emitEffect.lightingColorFilter = new LightingColorFilter(emitEffect.f4336y, 0);
                    }
                }
            }
            if (this.fadeInTime != 0.0f) {
                emitEffect.f4332t = true;
                emitEffect.f4333u = this.fadeInTime;
            }
            emitEffect.f4358ar = this.shadow;
            emitEffect.fadeOut = this.fadeOut;
            emitEffect.f4301V = this.delayedStartTimer;
            emitEffect.f4301V += m3496a(-this.delayedStartTimerRandom, this.delayedStartTimerRandom);
            emitEffect.f4334v = this.atmospheric;
            emitEffect.f4335w = this.physics;
            emitEffect.f4352x = this.physicsGravity;
            emitEffect.f4351r = this.priority;
            emitEffect.f4296Q = this.xSpeedAbsolute + m3497a(this.xSpeedAbsoluteRandom);
            emitEffect.ySpeed = this.ySpeedAbsolute + m3497a(this.ySpeedAbsoluteRandom);
            if (this.xSpeedRelative != 0.0f || this.ySpeedRelative != 0.0f || this.xSpeedRelativeRandom != 0.0f || this.ySpeedRelativeRandom != 0.0f) {
                float cos2 = CommonUtils.cos(m3497a);
                float sin2 = CommonUtils.sin(m3497a);
                float m3497a6 = this.xSpeedRelative + m3497a(this.xSpeedRelativeRandom);
                float m3497a7 = this.ySpeedRelative + m3497a(this.ySpeedRelativeRandom);
                emitEffect.f4296Q += (cos2 * m3497a7) - (sin2 * m3497a6);
                emitEffect.ySpeed += (sin2 * m3497a7) + (cos2 * m3497a6);
            }
            emitEffect.f4298S = this.hSpeed + m3497a(this.hSpeedRandom);
            emitEffect.f4305Z = this.dirSpeed + m3497a(this.dirSpeedRandom);
            if (this.animateFrameStart != this.animateFrameEnd) {
                emitEffect.f4310ae = true;
            }
            emitEffect.f4311af = this.animateFrameStart;
            if (this.animateFrameStartRandomAdd != 0) {
                emitEffect.f4311af += CommonUtils.m1737a(0, this.animateFrameStartRandomAdd);
            }
            emitEffect.f4312ag = this.animateFrameEnd;
            emitEffect.f4316ak = this.animateFrameStart;
            emitEffect.f4313ah = this.animateFramePingPong;
            emitEffect.f4314ai = this.animateFrameLooping;
            emitEffect.f4315aj = this.animateFrameSpeed;
            emitEffect.f4315aj += m3497a(this.animateFrameSpeedRandom);
            if (gameObject != null && this.attachedToUnit) {
                EffectEngine.m2225a(emitEffect, gameObject);
            }
            if (this.alsoPlaySound != null) {
                this.alsoPlaySound.m3441a(f, f2, 1.0f);
            }
            if (i < 5 && this.alsoEmitEffects != null) {
                this.alsoEmitEffects.m3042a(f, f2, f3, m3497a, gameObject, i + 1, (short) 0);
            }
            return emitEffect;
        }
    }

    /* renamed from: a */
    public final float m3497a(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return CommonUtils.rnd(-f, f);
    }

    /* renamed from: a */
    public final float m3496a(float f, float f2) {
        if (f == f2) {
            return f;
        }
        return CommonUtils.rnd(f, f2);
    }

    /* renamed from: a */
    public void m3494a(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        this.createWhenOffscreen = unitConfig.getStaticBooleanValue(str, "createWhenOffscreen", (Boolean) false).booleanValue();
        this.createWhenZoomedOut = unitConfig.getStaticBooleanValue(str, "createWhenZoomedOut", (Boolean) true).booleanValue();
        this.createWhenOverLiquid = unitConfig.getStaticBooleanValue(str, "createWhenOverLiquid", (Boolean) true).booleanValue();
        this.createWhenOverLand = unitConfig.getStaticBooleanValue(str, "createWhenOverLand", (Boolean) true).booleanValue();
        if (!this.createWhenOverLiquid && !this.createWhenOverLand) {
            throw new RuntimeException(str + " effect cannot have both createWhenOverLiquid and createWhenOverLand set to false, it would never be created");
        }
        this.spawnChance = unitConfig.getStaticFloatValue(str, "spawnChance", Float.valueOf(1.0f)).floatValue();
        this.life = unitConfig.getStaticFloatValue(str, "life", Float.valueOf(200.0f)).floatValue();
        this.lifeRandom = unitConfig.getStaticFloatValue(str, "lifeRandom", Float.valueOf(0.0f)).floatValue();
        this.showInFog = unitConfig.getStaticBooleanValue(str, "showInFog", (Boolean) false).booleanValue();
        this.xOffsetRelative = unitConfig.getStaticFloatValue(str, "xOffsetRelative", Float.valueOf(0.0f)).floatValue();
        this.yOffsetRelative = unitConfig.getStaticFloatValue(str, "yOffsetRelative", Float.valueOf(0.0f)).floatValue();
        this.hOffset = unitConfig.getStaticFloatValue(str, "hOffset", Float.valueOf(0.0f)).floatValue();
        this.alwayStartDirAtZero = unitConfig.getStaticBooleanValue(str, "alwayStartDirAtZero", (Boolean) false).booleanValue();
        this.pivotOffset = unitConfig.getStaticFloatValue(str, "pivotOffset", Float.valueOf(0.0f)).floatValue();
        this.pivotOffsetRandom = unitConfig.getStaticFloatValue(str, "pivotOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.dirOffset = unitConfig.getStaticFloatValue(str, "dirOffset", Float.valueOf(0.0f)).floatValue();
        this.xOffsetRelativeRandom = unitConfig.getStaticFloatValue(str, "xOffsetRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.yOffsetRelativeRandom = unitConfig.getStaticFloatValue(str, "yOffsetRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.hOffsetRandom = unitConfig.getStaticFloatValue(str, "hOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.dirOffsetRandom = unitConfig.getStaticFloatValue(str, "dirOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.xOffsetAbsolute = unitConfig.getStaticFloatValue(str, "xOffsetAbsolute", Float.valueOf(0.0f)).floatValue();
        this.yOffsetAbsolute = unitConfig.getStaticFloatValue(str, "yOffsetAbsolute", Float.valueOf(0.0f)).floatValue();
        this.xOffsetAbsoluteRandom = unitConfig.getStaticFloatValue(str, "xOffsetAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.yOffsetAbsoluteRandom = unitConfig.getStaticFloatValue(str, "yOffsetAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.xSpeedRelative = unitConfig.getStaticFloatValue(str, "xSpeedRelative", Float.valueOf(0.0f)).floatValue();
        this.ySpeedRelative = unitConfig.getStaticFloatValue(str, "ySpeedRelative", Float.valueOf(0.0f)).floatValue();
        this.hSpeed = unitConfig.getStaticFloatValue(str, "hSpeed", Float.valueOf(0.0f)).floatValue();
        this.dirSpeed = unitConfig.getStaticFloatValue(str, "dirSpeed", Float.valueOf(0.0f)).floatValue();
        this.xSpeedRelativeRandom = unitConfig.getStaticFloatValue(str, "xSpeedRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.ySpeedRelativeRandom = unitConfig.getStaticFloatValue(str, "ySpeedRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.hSpeedRandom = unitConfig.getStaticFloatValue(str, "hSpeedRandom", Float.valueOf(0.0f)).floatValue();
        this.dirSpeedRandom = unitConfig.getStaticFloatValue(str, "dirSpeedRandom", Float.valueOf(0.0f)).floatValue();
        this.xSpeedAbsolute = unitConfig.getStaticFloatValue(str, "xSpeedAbsolute", Float.valueOf(0.0f)).floatValue();
        this.ySpeedAbsolute = unitConfig.getStaticFloatValue(str, "ySpeedAbsolute", Float.valueOf(0.0f)).floatValue();
        this.xSpeedAbsoluteRandom = unitConfig.getStaticFloatValue(str, "xSpeedAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.ySpeedAbsoluteRandom = unitConfig.getStaticFloatValue(str, "ySpeedAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.scaleTo = unitConfig.getStaticFloatValue(str, "scaleTo", Float.valueOf(this.scaleTo)).floatValue();
        this.scaleFrom = unitConfig.getStaticFloatValue(str, "scaleFrom", Float.valueOf(this.scaleFrom)).floatValue();
        this.alpha = unitConfig.getStaticFloatValue(str, "alpha", Float.valueOf(this.alpha)).floatValue();
        this.color = unitConfig.m642a(str, "color", Integer.valueOf(this.color)).intValue();
        if (GameEngine.isNonDedicatedServer() && this.color != 0 && this.color != -1) {
            this.cachedLightingColorFilter = new LightingColorFilter(this.color, 0);
        }
        this.teamColorRatio = unitConfig.getStaticFloatValue(str, "teamColorRatio", Float.valueOf(this.teamColorRatio)).floatValue();
        if (this.teamColorRatio < 0.0f || this.teamColorRatio > 1.0f) {
            throw new RuntimeException(str + " teamColorRatio should be between 0-1 got:" + this.teamColorRatio);
        }
        this.shadow = unitConfig.getStaticBooleanValue(str, "shadow", (Boolean) false).booleanValue();
        this.drawLayer = (short) 2;
        if (unitConfig.getStaticBooleanValue(str, "drawUnderUnits", (Boolean) false).booleanValue()) {
            this.drawLayer = (short) 1;
        }
        String staticStringValue = unitConfig.getStaticStringValue(str, "drawType", (String) null);
        if (staticStringValue != null && !staticStringValue.equals("normal")) {
            if (staticStringValue.equals("displacement")) {
                this.drawLayer = (short) 101;
            } else {
                throw new C0395bl("Unknown drawType: " + staticStringValue);
            }
        }
        this.fadeInTime = unitConfig.getStaticFloatValue(str, "fadeInTime", Float.valueOf(0.0f)).floatValue();
        this.fadeOut = unitConfig.getStaticBooleanValue(str, "fadeOut", (Boolean) true).booleanValue();
        this.delayedStartTimer = unitConfig.m631b(str, "delayedStartTimer", Float.valueOf(0.0f)).floatValue();
        this.delayedStartTimerRandom = unitConfig.getStaticFloatValue(str, "delayedStartTimerRandom", Float.valueOf(0.0f)).floatValue();
        this.frameIndex = unitConfig.getStaticIntegerValue(str, "frameIndex", (Integer) 0).intValue();
        this.frameIndexRandom = unitConfig.getStaticIntegerValue(str, "frameIndexRandom", (Integer) 0).intValue();
        String staticStringValue2 = unitConfig.getStaticStringValue(str, "stripIndex", "0");
        this.stripIndex = gameEngine.effects.m2221a(staticStringValue2);
        if (this.stripIndex == -1) {
            throw new RuntimeException("Failed to find stripIndex with name:" + staticStringValue2);
        }
        this.attachedToUnit = unitConfig.getStaticBooleanValue(str, "attachedToUnit", (Boolean) true).booleanValue();
        this.liveAfterAttachedDies = unitConfig.getStaticBooleanValue(str, "liveAfterAttachedDies", (Boolean) true).booleanValue();
        this.atmospheric = unitConfig.getStaticBooleanValue(str, "atmospheric", (Boolean) false).booleanValue();
        this.physics = unitConfig.getStaticBooleanValue(str, "physics", (Boolean) false).booleanValue();
        this.physicsGravity = unitConfig.getStaticFloatValue(str, "physicsGravity", Float.valueOf(1.0f)).floatValue();
        String staticStringValue3 = unitConfig.getStaticStringValue(str, "priority", (String) null);
        if (staticStringValue3 != null) {
            try {
                this.priority = EnumC0668h.valueOf(staticStringValue3);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException("Unknown priority:" + staticStringValue3);
            }
        }
        int intValue = unitConfig.getStaticIntegerValue(str, "total_frames", (Integer) 1).intValue();
        if (intValue < 1) {
            throw new C0395bl("TOTAL_FRAMES cannot be: " + intValue + " (must be 1 or more)");
        }
        BitmapOrTexture image = customUnitMetadata.getImage(unitConfig, str, "image");
        if (image != null) {
            this.imageStrip = new ImageStrip();
            this.imageStrip.image = image;
            this.imageStrip.tileWidth = this.imageStrip.image.getWidth() / intValue;
            this.imageStrip.tileHeight = this.imageStrip.image.getHeight();
            this.imageStrip.tileWidth = unitConfig.getStaticIntegerValue(str, "frame_width", Integer.valueOf(this.imageStrip.tileWidth)).intValue();
            this.imageStrip.tileHeight = unitConfig.getStaticIntegerValue(str, "frame_height", Integer.valueOf(this.imageStrip.tileHeight)).intValue();
            if (intValue == 1 && this.imageStrip.tileWidth >= this.imageStrip.image.getWidth()) {
                this.imageStrip.f4396k = true;
            } else if (this.imageStrip.tileHeight < this.imageStrip.image.getHeight()) {
                this.imageStrip.f4393h = this.imageStrip.image.getWidth() / this.imageStrip.tileWidth;
                if (this.imageStrip.f4393h < 1) {
                    this.imageStrip.f4393h = 1;
                }
            }
            this.imageStrip.globalOffsetX = 0;
            this.imageStrip.globalOffsetY = 0;
            this.imageStrip.tileStrideX = this.imageStrip.tileWidth;
            this.imageStrip.tileStrideY = this.imageStrip.tileHeight;
            String staticStringValue4 = unitConfig.getStaticStringValue(str, "imageShadow", (String) null);
            if (staticStringValue4 != null) {
                this.imageStrip.f4395j = CustomUnitMetadataFactory.m3555a(customUnitMetadata.f2732B, staticStringValue4, customUnitMetadata.graphics_imageSmoothing, customUnitMetadata, str, "imageShadow");
                this.shadow = true;
            }
            if (this.shadow && this.imageStrip.f4395j == null) {
                throw new C0395bl("imageShadow is required if image and shadow:true is used");
            }
        }
        this.animateFrameStart = unitConfig.getStaticIntegerValue(str, "animateFrameStart", (Integer) 0).intValue();
        this.animateFrameStartRandomAdd = unitConfig.getStaticIntegerValue(str, "animateFrameStartRandomAdd", (Integer) 0).intValue();
        this.animateFrameEnd = unitConfig.getStaticIntegerValue(str, "animateFrameEnd", (Integer) 0).intValue();
        this.animateFramePingPong = unitConfig.getStaticBooleanValue(str, "animateFramePingPong", (Boolean) false).booleanValue();
        this.animateFrameLooping = unitConfig.getStaticBooleanValue(str, "animateFrameLooping", (Boolean) false).booleanValue();
        this.animateFrameSpeed = unitConfig.m631b(str, "animateFrameSpeed", Float.valueOf(0.5f)).floatValue();
        this.animateFrameSpeedRandom = unitConfig.m631b(str, "animateFrameSpeedRandom", Float.valueOf(0.0f)).floatValue();
        if (image != null && ((this.imageStrip.tileWidth >= this.imageStrip.image.getWidth() || intValue != 1) && this.animateFrameEnd > intValue)) {
            throw new C0395bl("animateFrameEnd:" + this.animateFrameEnd + " cannot be larger than TOTAL_FRAMES: " + intValue + " (when using custom image)");
        }
        this.alsoEmitEffects = customUnitMetadata.m3116a(unitConfig.getStaticStringValue(str, "alsoEmitEffects", (String) null));
        this.alsoEmitEffectsOnDeath = customUnitMetadata.m3116a(unitConfig.getStaticStringValue(str, "alsoEmitEffectsOnDeath", (String) null));
        this.ifSpawnFailsEmitEffects = customUnitMetadata.m3116a(unitConfig.getStaticStringValue(str, "ifSpawnFailsEmitEffects", (String) null));
        this.alsoPlaySound = C0392bi.m3438a(customUnitMetadata, unitConfig.getStaticStringValue(str, "alsoPlaySound", (String) null), (C0392bi) null);
    }
}