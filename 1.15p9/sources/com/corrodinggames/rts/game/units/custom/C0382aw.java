package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p035d.C0746f;
import com.corrodinggames.rts.gameFramework.p035d.C0747g;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0744d;
import com.corrodinggames.rts.gameFramework.p035d.EnumC0748h;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.aw */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/aw.class */
public class C0382aw {
    public static final C0382aw defaultEffectTemplate = new C0382aw("default");
    public String name;
    private EnumC0383ax builtInEffect;
    public C0747g imageStrip;
    public boolean createWhenOffscreen;
    public boolean createWhenZoomedOut;
    public boolean createWhenOverLiquid;
    public boolean createWhenOverLand;
    public float spawnChance;
    C0467y ifSpawnFailsEmitEffects;
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
    public EnumC0748h priority;
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
    public C0467y alsoEmitEffects;
    public C0467y alsoEmitEffectsOnDeath;
    public C0409bj alsoPlaySound;
    public static ArrayList fields;

    public C0382aw(EnumC0383ax enumC0383ax) {
        this.builtInEffect = null;
        this.spawnChance = 1.0f;
        this.life = 200.0f;
        this.priority = EnumC0748h.f4828c;
        this.scaleTo = 1.0f;
        this.scaleFrom = 1.0f;
        this.alpha = 1.0f;
        this.color = -1;
        this.teamColorRatio = 0.0f;
        this.drawLayer = (short) 2;
        this.physicsGravity = 1.0f;
        this.builtInEffect = enumC0383ax;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C0382aw(String str) {
        this.builtInEffect = null;
        this.spawnChance = 1.0f;
        this.life = 200.0f;
        this.priority = EnumC0748h.f4828c;
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
    public C0745e m5346a(float f, float f2, float f3, float f4, AbstractC1120w abstractC1120w, int i, short s) {
        Unit unit;
        C0745e c0745e;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.spawnChance < 1.0f && CommonUtils.rnd(0.0f, 1.0f) > this.spawnChance) {
            if (i < 5 && this.ifSpawnFailsEmitEffects != null) {
                this.ifSpawnFailsEmitEffects.m4677a(f, f2, f3, f4, abstractC1120w, i + 1, s);
                return null;
            }
            return null;
        } else if (this.builtInEffect != null) {
            if (this.builtInEffect == EnumC0383ax.f2261a) {
                c0745e = gameEngine.effects.m2562a(f, f2, f3, f4);
            } else if (this.builtInEffect == EnumC0383ax.f2262b) {
                c0745e = gameEngine.effects.m2539b(f, f2, f3, f4, 0);
                if (c0745e != null) {
                    c0745e.f4730H = 0.75f;
                    c0745e.f4729G = 0.75f;
                }
            } else if (this.builtInEffect == EnumC0383ax.f2263c) {
                c0745e = gameEngine.effects.m2539b(f, f2, f3, f4, 0);
            } else if (this.builtInEffect == EnumC0383ax.f2264d) {
                c0745e = gameEngine.effects.m2534c(f, f2, f3, f4, 0);
            } else if (this.builtInEffect == EnumC0383ax.f2265e) {
                c0745e = gameEngine.effects.m2531d(f, f2, f3, 0);
            } else if (this.builtInEffect == EnumC0383ax.f2266f) {
                gameEngine.effects.m2563a(f, f2, f3);
                c0745e = null;
            } else if (this.builtInEffect == EnumC0383ax.f2267g) {
                c0745e = gameEngine.effects.m2542b(f, f2, f3);
            } else if (this.builtInEffect == EnumC0383ax.f2268h) {
                C0746f.m2519a(f, f2).f4809j = -6684775;
                C0746f m2512b = C0746f.m2512b(f, f2);
                m2512b.f4789a = 500.0f;
                m2512b.f4809j = -6684775;
                gameEngine.effects.m2536b(EnumC0748h.f4830e);
                C0745e m2533c = gameEngine.effects.m2533c(f, f2, f3, -1127220);
                if (m2533c != null) {
                    m2533c.f4730H = 0.15f;
                    m2533c.f4729G = 1.0f;
                    m2533c.f4786ar = (short) 2;
                    m2533c.f4745W = 35.0f;
                    m2533c.f4746X = m2533c.f4745W;
                    m2533c.f4744V = 0.0f;
                    m2533c.f4725y = -13378253;
                }
                c0745e = null;
            } else if (this.builtInEffect == EnumC0383ax.f2269i) {
                return null;
            } else {
                throw new RuntimeException("Unhandled built-in type:" + this.builtInEffect);
            }
            if (c0745e == null) {
                return null;
            }
            c0745e.f4786ar = (short) 2;
            if (abstractC1120w != null) {
                C0743c.m2551a(c0745e, abstractC1120w);
            }
            return c0745e;
        } else if (!this.createWhenZoomedOut && !gameEngine.f6252db) {
            return null;
        } else {
            if (!this.createWhenOverLiquid && C1117y.m474d(f, f2)) {
                return null;
            }
            if (!this.createWhenOverLand && !C1117y.m474d(f, f2)) {
                return null;
            }
            if (this.createWhenOffscreen) {
                gameEngine.effects.m2544b();
            } else {
                gameEngine.effects.m2566a();
            }
            boolean z = this.showInFog;
            boolean z2 = false;
            if (!z && this.attachedToUnit) {
                z2 = true;
                z = true;
            }
            C0745e m2537b = gameEngine.effects.m2537b(f, f2, f3, EnumC0744d.f4702a, z, this.priority);
            if (m2537b == null) {
                return null;
            }
            m2537b.f4777a = this;
            m2537b.f4727B = (short) (s + 1);
            if (z2 && !this.showInFog) {
                m2537b.f4778e = false;
            }
            m2537b.f4745W = this.life;
            m2537b.f4745W += m5348a(this.lifeRandom);
            m2537b.f4746X = m2537b.f4745W;
            m2537b.f4763aq = this.stripIndex;
            if (this.imageStrip != null) {
            }
            m2537b.f4762ap = this.frameIndex;
            if (this.frameIndexRandom != 0) {
                m2537b.f4762ap += CommonUtils.m2360a(-this.frameIndexRandom, this.frameIndexRandom);
                if (m2537b.f4762ap < 0) {
                    m2537b.f4762ap = 0;
                }
            }
            float m5348a = f4 + this.pivotOffset + m5348a(this.pivotOffsetRandom);
            if (this.alwayStartDirAtZero) {
                m2537b.f4747Y = 0.0f;
            } else {
                m2537b.f4747Y = m5348a;
            }
            m2537b.f4747Y += this.dirOffset;
            m2537b.f4747Y += m5348a(this.dirOffsetRandom);
            if (this.xOffsetAbsoluteRandom != 0.0f || this.yOffsetAbsoluteRandom != 0.0f || this.xOffsetAbsolute != 0.0f || this.yOffsetAbsolute != 0.0f) {
                float m5348a2 = this.xOffsetAbsolute + m5348a(this.xOffsetAbsoluteRandom);
                float m5348a3 = this.yOffsetAbsolute + m5348a(this.yOffsetAbsoluteRandom);
                m2537b.f4732J += m5348a2;
                m2537b.f4733K += m5348a3;
            }
            if (this.xOffsetRelativeRandom != 0.0f || this.yOffsetRelativeRandom != 0.0f || this.xOffsetRelative != 0.0f || this.yOffsetRelative != 0.0f) {
                float m2249i = CommonUtils.m2249i(m5348a);
                float sin = CommonUtils.sin(m5348a);
                float m5348a4 = this.xOffsetRelative + m5348a(this.xOffsetRelativeRandom);
                float m5348a5 = this.yOffsetRelative + m5348a(this.yOffsetRelativeRandom);
                m2537b.f4732J += (m2249i * m5348a5) - (sin * m5348a4);
                m2537b.f4733K += (sin * m5348a5) + (m2249i * m5348a4);
            }
            m2537b.f4734L += this.hOffset + m5347a(-this.hOffsetRandom, this.hOffsetRandom);
            m2537b.f4784an = true;
            m2537b.f4720s = true;
            m2537b.f4786ar = this.drawLayer;
            m2537b.f4730H = this.scaleFrom;
            m2537b.f4729G = this.scaleTo;
            m2537b.f4728F = this.alpha;
            m2537b.f4725y = this.color;
            m2537b.f4783C = this.cachedLightingColorFilter;
            if (this.teamColorRatio != 0.0f && abstractC1120w != null) {
                Team team = null;
                if (abstractC1120w instanceof Unit) {
                    team = ((Unit) abstractC1120w).team;
                }
                if ((abstractC1120w instanceof Projectile) && (unit = ((Projectile) abstractC1120w).f983j) != null) {
                    team = unit.team;
                }
                if (team != null) {
                    float f5 = 1.0f - this.teamColorRatio;
                    int m7284a = Color.m7284a(m2537b.f4725y);
                    int m7280b = (int) (Color.m7280b(m2537b.f4725y) * f5);
                    int m7279c = (int) (Color.m7279c(m2537b.f4725y) * f5);
                    int m7278d = (int) (Color.m7278d(m2537b.f4725y) * f5);
                    int m6413H = team.m6413H();
                    m2537b.f4725y = Color.argb(m7284a, CommonUtils.m2310b((int) (m7280b + (Color.m7280b(m6413H) * this.teamColorRatio)), 0, 255), CommonUtils.m2310b((int) (m7279c + (Color.m7279c(m6413H) * this.teamColorRatio)), 0, 255), CommonUtils.m2310b((int) (m7278d + (Color.m7278d(m6413H) * this.teamColorRatio)), 0, 255));
                    if (GameEngine.m1159as()) {
                        m2537b.f4783C = new LightingColorFilter(m2537b.f4725y, 0);
                    }
                }
            }
            if (this.fadeInTime != 0.0f) {
                m2537b.f4721t = true;
                m2537b.f4722u = this.fadeInTime;
            }
            m2537b.f4787as = this.shadow;
            m2537b.f4720s = this.fadeOut;
            m2537b.f4744V = this.delayedStartTimer;
            m2537b.f4744V += m5347a(-this.delayedStartTimerRandom, this.delayedStartTimerRandom);
            m2537b.f4723v = this.atmospheric;
            m2537b.f4724w = this.physics;
            m2537b.f4781x = this.physicsGravity;
            m2537b.f4780r = this.priority;
            m2537b.f4739Q = this.xSpeedAbsolute + m5348a(this.xSpeedAbsoluteRandom);
            m2537b.f4740R = this.ySpeedAbsolute + m5348a(this.ySpeedAbsoluteRandom);
            if (this.xSpeedRelative != 0.0f || this.ySpeedRelative != 0.0f || this.xSpeedRelativeRandom != 0.0f || this.ySpeedRelativeRandom != 0.0f) {
                float m2249i2 = CommonUtils.m2249i(m5348a);
                float sin2 = CommonUtils.sin(m5348a);
                float m5348a6 = this.xSpeedRelative + m5348a(this.xSpeedRelativeRandom);
                float m5348a7 = this.ySpeedRelative + m5348a(this.ySpeedRelativeRandom);
                m2537b.f4739Q += (m2249i2 * m5348a7) - (sin2 * m5348a6);
                m2537b.f4740R += (sin2 * m5348a7) + (m2249i2 * m5348a6);
            }
            m2537b.f4741S = this.hSpeed + m5348a(this.hSpeedRandom);
            m2537b.f4748Z = this.dirSpeed + m5348a(this.dirSpeedRandom);
            if (this.animateFrameStart != this.animateFrameEnd) {
                m2537b.f4753ae = true;
            }
            m2537b.f4754af = this.animateFrameStart;
            if (this.animateFrameStartRandomAdd != 0) {
                m2537b.f4754af += CommonUtils.m2360a(0, this.animateFrameStartRandomAdd);
            }
            m2537b.f4755ag = this.animateFrameEnd;
            m2537b.f4759ak = this.animateFrameStart;
            m2537b.f4756ah = this.animateFramePingPong;
            m2537b.f4757ai = this.animateFrameLooping;
            m2537b.f4758aj = this.animateFrameSpeed;
            m2537b.f4758aj += m5348a(this.animateFrameSpeedRandom);
            if (abstractC1120w != null && this.attachedToUnit) {
                C0743c.m2551a(m2537b, abstractC1120w);
            }
            if (this.alsoPlaySound != null) {
                this.alsoPlaySound.m5270a(f, f2, 1.0f);
            }
            if (i < 5 && this.alsoEmitEffects != null) {
                this.alsoEmitEffects.m4677a(f, f2, f3, m5348a, abstractC1120w, i + 1, (short) 0);
            }
            return m2537b;
        }
    }

    /* renamed from: a */
    public final float m5348a(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return CommonUtils.rnd(-f, f);
    }

    /* renamed from: a */
    public final float m5347a(float f, float f2) {
        if (f == f2) {
            return f;
        }
        return CommonUtils.rnd(f, f2);
    }

    /* renamed from: a */
    public void m5345a(C0453l c0453l, C1072ab c1072ab, String str) {
        GameEngine gameEngine = GameEngine.getInstance();
        this.createWhenOffscreen = c1072ab.m700a(str, "createWhenOffscreen", (Boolean) false).booleanValue();
        this.createWhenZoomedOut = c1072ab.m700a(str, "createWhenZoomedOut", (Boolean) true).booleanValue();
        this.createWhenOverLiquid = c1072ab.m700a(str, "createWhenOverLiquid", (Boolean) true).booleanValue();
        this.createWhenOverLand = c1072ab.m700a(str, "createWhenOverLand", (Boolean) true).booleanValue();
        if (!this.createWhenOverLiquid && !this.createWhenOverLand) {
            throw new RuntimeException(str + " effect cannot have both createWhenOverLiquid and createWhenOverLand set to false, it would never be created");
        }
        this.spawnChance = c1072ab.m698a(str, "spawnChance", Float.valueOf(1.0f)).floatValue();
        this.life = c1072ab.m698a(str, "life", Float.valueOf(200.0f)).floatValue();
        this.lifeRandom = c1072ab.m698a(str, "lifeRandom", Float.valueOf(0.0f)).floatValue();
        this.showInFog = c1072ab.m700a(str, "showInFog", (Boolean) false).booleanValue();
        this.xOffsetRelative = c1072ab.m698a(str, "xOffsetRelative", Float.valueOf(0.0f)).floatValue();
        this.yOffsetRelative = c1072ab.m698a(str, "yOffsetRelative", Float.valueOf(0.0f)).floatValue();
        this.hOffset = c1072ab.m698a(str, "hOffset", Float.valueOf(0.0f)).floatValue();
        this.alwayStartDirAtZero = c1072ab.m693a(str, "alwaysStartDirAtZero", "alwayStartDirAtZero", (Boolean) false).booleanValue();
        this.pivotOffset = c1072ab.m698a(str, "pivotOffset", Float.valueOf(0.0f)).floatValue();
        this.pivotOffsetRandom = c1072ab.m698a(str, "pivotOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.dirOffset = c1072ab.m698a(str, "dirOffset", Float.valueOf(0.0f)).floatValue();
        this.xOffsetRelativeRandom = c1072ab.m698a(str, "xOffsetRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.yOffsetRelativeRandom = c1072ab.m698a(str, "yOffsetRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.hOffsetRandom = c1072ab.m698a(str, "hOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.dirOffsetRandom = c1072ab.m698a(str, "dirOffsetRandom", Float.valueOf(0.0f)).floatValue();
        this.xOffsetAbsolute = c1072ab.m698a(str, "xOffsetAbsolute", Float.valueOf(0.0f)).floatValue();
        this.yOffsetAbsolute = c1072ab.m698a(str, "yOffsetAbsolute", Float.valueOf(0.0f)).floatValue();
        this.xOffsetAbsoluteRandom = c1072ab.m698a(str, "xOffsetAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.yOffsetAbsoluteRandom = c1072ab.m698a(str, "yOffsetAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.xSpeedRelative = c1072ab.m698a(str, "xSpeedRelative", Float.valueOf(0.0f)).floatValue();
        this.ySpeedRelative = c1072ab.m698a(str, "ySpeedRelative", Float.valueOf(0.0f)).floatValue();
        this.hSpeed = c1072ab.m698a(str, "hSpeed", Float.valueOf(0.0f)).floatValue();
        this.dirSpeed = c1072ab.m698a(str, "dirSpeed", Float.valueOf(0.0f)).floatValue();
        this.xSpeedRelativeRandom = c1072ab.m698a(str, "xSpeedRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.ySpeedRelativeRandom = c1072ab.m698a(str, "ySpeedRelativeRandom", Float.valueOf(0.0f)).floatValue();
        this.hSpeedRandom = c1072ab.m698a(str, "hSpeedRandom", Float.valueOf(0.0f)).floatValue();
        this.dirSpeedRandom = c1072ab.m698a(str, "dirSpeedRandom", Float.valueOf(0.0f)).floatValue();
        this.xSpeedAbsolute = c1072ab.m698a(str, "xSpeedAbsolute", Float.valueOf(0.0f)).floatValue();
        this.ySpeedAbsolute = c1072ab.m698a(str, "ySpeedAbsolute", Float.valueOf(0.0f)).floatValue();
        this.xSpeedAbsoluteRandom = c1072ab.m698a(str, "xSpeedAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.ySpeedAbsoluteRandom = c1072ab.m698a(str, "ySpeedAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
        this.scaleTo = c1072ab.m698a(str, "scaleTo", Float.valueOf(this.scaleTo)).floatValue();
        this.scaleFrom = c1072ab.m698a(str, "scaleFrom", Float.valueOf(this.scaleFrom)).floatValue();
        this.alpha = c1072ab.m698a(str, "alpha", Float.valueOf(this.alpha)).floatValue();
        this.color = c1072ab.m696a(str, "color", Integer.valueOf(this.color)).intValue();
        if (GameEngine.m1159as() && this.color != 0 && this.color != -1) {
            this.cachedLightingColorFilter = new LightingColorFilter(this.color, 0);
        }
        this.teamColorRatio = c1072ab.m698a(str, "teamColorRatio", Float.valueOf(this.teamColorRatio)).floatValue();
        if (this.teamColorRatio < 0.0f || this.teamColorRatio > 1.0f) {
            throw new RuntimeException(str + " teamColorRatio should be between 0-1 got:" + this.teamColorRatio);
        }
        this.shadow = c1072ab.m700a(str, "shadow", (Boolean) false).booleanValue();
        this.drawLayer = (short) 2;
        if (c1072ab.m700a(str, "drawUnderUnits", (Boolean) false).booleanValue()) {
            this.drawLayer = (short) 1;
        }
        String m681b = c1072ab.m681b(str, "drawType", (String) null);
        if (m681b != null && !m681b.equals("normal")) {
            if (m681b.equals("displacement")) {
                this.drawLayer = (short) 101;
            } else {
                throw new C0412bm("Unknown drawType: " + m681b);
            }
        }
        this.fadeInTime = c1072ab.m698a(str, "fadeInTime", Float.valueOf(0.0f)).floatValue();
        this.fadeOut = c1072ab.m700a(str, "fadeOut", (Boolean) true).booleanValue();
        this.delayedStartTimer = c1072ab.m683b(str, "delayedStartTimer", Float.valueOf(0.0f)).floatValue();
        this.delayedStartTimerRandom = c1072ab.m698a(str, "delayedStartTimerRandom", Float.valueOf(0.0f)).floatValue();
        this.frameIndex = c1072ab.m682b(str, "frameIndex", (Integer) 0).intValue();
        this.frameIndexRandom = c1072ab.m682b(str, "frameIndexRandom", (Integer) 0).intValue();
        String m681b2 = c1072ab.m681b(str, "stripIndex", "0");
        this.stripIndex = gameEngine.effects.m2547a(m681b2);
        if (this.stripIndex == -1) {
            throw new RuntimeException("Failed to find stripIndex with name:" + m681b2);
        }
        this.attachedToUnit = c1072ab.m700a(str, "attachedToUnit", (Boolean) true).booleanValue();
        this.liveAfterAttachedDies = c1072ab.m700a(str, "liveAfterAttachedDies", (Boolean) true).booleanValue();
        this.atmospheric = c1072ab.m700a(str, "atmospheric", (Boolean) false).booleanValue();
        this.physics = c1072ab.m700a(str, "physics", (Boolean) false).booleanValue();
        this.physicsGravity = c1072ab.m698a(str, "physicsGravity", Float.valueOf(1.0f)).floatValue();
        String m681b3 = c1072ab.m681b(str, "priority", (String) null);
        if (m681b3 != null) {
            try {
                this.priority = EnumC0748h.valueOf(m681b3);
            } catch (IllegalArgumentException e) {
                throw new RuntimeException("Unknown priority:" + m681b3);
            }
        }
        int intValue = c1072ab.m682b(str, "total_frames", (Integer) 1).intValue();
        if (intValue < 1) {
            throw new C0412bm("TOTAL_FRAMES cannot be: " + intValue + " (must be 1 or more)");
        }
        BitmapOrTexture m4758a = c0453l.m4758a(c1072ab, str, "image");
        if (m4758a != null) {
            this.imageStrip = new C0747g();
            this.imageStrip.f4821i = m4758a;
            this.imageStrip.f4814b = this.imageStrip.f4821i.mo396m() / intValue;
            this.imageStrip.f4815c = this.imageStrip.f4821i.mo397l();
            this.imageStrip.f4814b = c1072ab.m682b(str, "frame_width", Integer.valueOf(this.imageStrip.f4814b)).intValue();
            this.imageStrip.f4815c = c1072ab.m682b(str, "frame_height", Integer.valueOf(this.imageStrip.f4815c)).intValue();
            if (intValue == 1 && this.imageStrip.f4814b >= this.imageStrip.f4821i.mo396m()) {
                this.imageStrip.f4823k = true;
            } else if (this.imageStrip.f4815c < this.imageStrip.f4821i.mo397l()) {
                this.imageStrip.f4820h = this.imageStrip.f4821i.mo396m() / this.imageStrip.f4814b;
                if (this.imageStrip.f4820h < 1) {
                    this.imageStrip.f4820h = 1;
                }
            }
            this.imageStrip.f4816d = 0;
            this.imageStrip.f4817e = 0;
            this.imageStrip.f4818f = this.imageStrip.f4814b;
            this.imageStrip.f4819g = this.imageStrip.f4815c;
            String m681b4 = c1072ab.m681b(str, "imageShadow", (String) null);
            if (m681b4 != null) {
                this.imageStrip.f4822j = C0348af.m5406a(c0453l.f2914E, m681b4, c0453l.f2930aa, c0453l, str, "imageShadow");
                this.shadow = true;
            }
            if (this.shadow && this.imageStrip.f4822j == null) {
                throw new C0412bm("imageShadow is required if image and shadow:true is used");
            }
        }
        this.animateFrameStart = c1072ab.m682b(str, "animateFrameStart", (Integer) 0).intValue();
        this.animateFrameStartRandomAdd = c1072ab.m682b(str, "animateFrameStartRandomAdd", (Integer) 0).intValue();
        this.animateFrameEnd = c1072ab.m682b(str, "animateFrameEnd", (Integer) 0).intValue();
        this.animateFramePingPong = c1072ab.m700a(str, "animateFramePingPong", (Boolean) false).booleanValue();
        this.animateFrameLooping = c1072ab.m700a(str, "animateFrameLooping", (Boolean) false).booleanValue();
        this.animateFrameSpeed = c1072ab.m683b(str, "animateFrameSpeed", Float.valueOf(0.5f)).floatValue();
        this.animateFrameSpeedRandom = c1072ab.m683b(str, "animateFrameSpeedRandom", Float.valueOf(0.0f)).floatValue();
        if (m4758a != null && ((this.imageStrip.f4814b >= this.imageStrip.f4821i.mo396m() || intValue != 1) && this.animateFrameEnd > intValue)) {
            throw new C0412bm("animateFrameEnd:" + this.animateFrameEnd + " cannot be larger than TOTAL_FRAMES: " + intValue + " (when using custom image)");
        }
        this.alsoEmitEffects = c0453l.m4737c(c1072ab.m681b(str, "alsoEmitEffects", (String) null));
        this.alsoEmitEffectsOnDeath = c0453l.m4737c(c1072ab.m681b(str, "alsoEmitEffectsOnDeath", (String) null));
        this.ifSpawnFailsEmitEffects = c0453l.m4737c(c1072ab.m681b(str, "ifSpawnFailsEmitEffects", (String) null));
        this.alsoPlaySound = C0409bj.m5267a(c0453l, c1072ab.m681b(str, "alsoPlaySound", (String) null), (C0409bj) null);
    }
}
