package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p030b.C0571c;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import com.corrodinggames.rts.gameFramework.p030b.C0574f;
import com.corrodinggames.rts.gameFramework.p030b.C0575g;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0572d;
import com.corrodinggames.rts.gameFramework.p030b.EnumC0576h;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ad.class */
public class C0308ad {
    public static final C0308ad defaultEffectTemplate = new C0308ad("default");
    public String name;
    private EnumC0309ae builtInEffect;
    public C0575g imageStrip;
    public boolean createWhenOffscreen;
    public boolean createWhenZoomedOut;
    public boolean createWhenOverLiquid;
    public boolean createWhenOverLand;
    public float spawnChance;
    C0381x ifSpawnFailsEmitEffects;
    public float life;
    public float lifeRandom;
    public boolean showInFog;
    public float xOffsetRelative;
    public float yOffsetRelative;
    public float hOffset;
    public boolean alwayStartDirAtZero;
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
    public EnumC0576h priority;
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
    public C0381x alsoEmitEffects;
    public C0381x alsoEmitEffectsOnDeath;
    public C0321aq alsoPlaySound;
    public static ArrayList fields;

    public C0308ad(EnumC0309ae aeVar) {
        this.builtInEffect = null;
        this.spawnChance = 1.0f;
        this.life = 200.0f;
        this.priority = EnumC0576h.high;
        this.scaleTo = 1.0f;
        this.scaleFrom = 1.0f;
        this.alpha = 1.0f;
        this.color = -1;
        this.teamColorRatio = 0.0f;
        this.drawLayer = (short) 2;
        this.physicsGravity = 1.0f;
        this.builtInEffect = aeVar;
    }

    C0308ad(String str) {
        this.builtInEffect = null;
        this.spawnChance = 1.0f;
        this.life = 200.0f;
        this.priority = EnumC0576h.high;
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
    public C0573e m3107a(float f, float f2, float f3, float f4, AbstractC0854w wVar, int i, short s) {
        AbstractC0210af afVar;
        C0573e eVar;
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.spawnChance >= 1.0f || C0654f.m1458c(0.0f, 1.0f) <= this.spawnChance) {
            if (this.builtInEffect != null) {
                if (this.builtInEffect == EnumC0309ae.small) {
                    eVar = u.f5517bz.m2014a(f, f2, f3, f4);
                } else if (this.builtInEffect == EnumC0309ae.medium) {
                    eVar = u.f5517bz.m1991b(f, f2, f3, f4, 0);
                    if (eVar != null) {
                        eVar.f3860H = 0.75f;
                        eVar.f3859G = 0.75f;
                    }
                } else if (this.builtInEffect == EnumC0309ae.large) {
                    eVar = u.f5517bz.m1991b(f, f2, f3, f4, 0);
                } else if (this.builtInEffect == EnumC0309ae.smoke) {
                    eVar = u.f5517bz.m1986c(f, f2, f3, f4, 0);
                } else if (this.builtInEffect == EnumC0309ae.shockwave) {
                    eVar = u.f5517bz.m1983d(f, f2, f3, 0);
                } else if (this.builtInEffect == EnumC0309ae.largeExplosion) {
                    u.f5517bz.m2015a(f, f2, f3);
                    eVar = null;
                } else if (this.builtInEffect == EnumC0309ae.smallExplosion) {
                    eVar = u.f5517bz.m1994b(f, f2, f3);
                } else if (this.builtInEffect == EnumC0309ae.resourcePoolSmoke) {
                    C0574f.m1973a(f, f2).f3911j = -6684775;
                    C0574f b = C0574f.m1969b(f, f2);
                    b.f3902a = 500.0f;
                    b.f3911j = -6684775;
                    u.f5517bz.m1988b(EnumC0576h.critical);
                    C0573e c = u.f5517bz.m1985c(f, f2, f3, -1127220);
                    if (c != null) {
                        c.f3860H = 0.15f;
                        c.f3859G = 1.0f;
                        c.f3895aq = (short) 2;
                        c.f3875W = 35.0f;
                        c.f3876X = c.f3875W;
                        c.f3874V = 0.0f;
                        c.f3851y = -13378253;
                    }
                    eVar = null;
                } else if (this.builtInEffect == EnumC0309ae.noneExplosion) {
                    return null;
                } else {
                    throw new RuntimeException("Unhandled built-in type:" + this.builtInEffect);
                }
                if (eVar == null) {
                    return null;
                }
                eVar.f3895aq = (short) 2;
                if (wVar != null) {
                    C0571c.m2003a(eVar, wVar);
                }
                return eVar;
            } else if (!this.createWhenZoomedOut && !u.f5579cJ) {
                return null;
            } else {
                if (!this.createWhenOverLiquid && C0851y.m409c(f, f2)) {
                    return null;
                }
                if (!this.createWhenOverLand && !C0851y.m409c(f, f2)) {
                    return null;
                }
                if (this.createWhenOffscreen) {
                    u.f5517bz.m1996b();
                } else {
                    u.f5517bz.m2018a();
                }
                boolean z = this.showInFog;
                boolean z2 = false;
                if (!z && this.attachedToUnit) {
                    z2 = true;
                    z = true;
                }
                C0573e b2 = u.f5517bz.m1989b(f, f2, f3, EnumC0572d.custom, z, this.priority);
                if (b2 == null) {
                    return null;
                }
                b2.f3827a = this;
                b2.f3854B = (short) (s + 1);
                if (z2 && !this.showInFog) {
                    b2.f3831e = false;
                }
                b2.f3875W = this.life;
                b2.f3875W += m3109a(this.lifeRandom);
                b2.f3876X = b2.f3875W;
                b2.f3894ap = this.stripIndex;
                if (this.imageStrip != null) {
                }
                b2.f3893ao = this.frameIndex;
                if (this.frameIndexRandom != 0) {
                    b2.f3893ao += C0654f.m1514a(-this.frameIndexRandom, this.frameIndexRandom);
                    if (b2.f3893ao < 0) {
                        b2.f3893ao = 0;
                    }
                }
                if (this.alwayStartDirAtZero) {
                    b2.f3877Y = 0.0f;
                } else {
                    b2.f3877Y = f4;
                }
                b2.f3877Y += this.dirOffset;
                b2.f3877Y += m3109a(this.dirOffsetRandom);
                if (!(this.xOffsetAbsoluteRandom == 0.0f && this.yOffsetAbsoluteRandom == 0.0f && this.xOffsetAbsolute == 0.0f && this.yOffsetAbsolute == 0.0f)) {
                    float a = this.xOffsetAbsolute + m3109a(this.xOffsetAbsoluteRandom);
                    float a2 = this.yOffsetAbsolute + m3109a(this.yOffsetAbsoluteRandom);
                    b2.f3862J += a;
                    b2.f3863K += a2;
                }
                if (!(this.xOffsetRelativeRandom == 0.0f && this.yOffsetRelativeRandom == 0.0f && this.xOffsetRelative == 0.0f && this.yOffsetRelative == 0.0f)) {
                    float i2 = C0654f.m1421i(f4);
                    float h = C0654f.m1425h(f4);
                    float a3 = this.xOffsetRelative + m3109a(this.xOffsetRelativeRandom);
                    float a4 = this.yOffsetRelative + m3109a(this.yOffsetRelativeRandom);
                    b2.f3862J += (i2 * a4) - (h * a3);
                    b2.f3863K += (h * a4) + (i2 * a3);
                }
                b2.f3864L += this.hOffset + m3108a(-this.hOffsetRandom, this.hOffsetRandom);
                b2.f3891am = true;
                b2.f3845s = true;
                b2.f3895aq = this.drawLayer;
                b2.f3860H = this.scaleFrom;
                b2.f3859G = this.scaleTo;
                b2.f3858F = this.alpha;
                b2.f3851y = this.color;
                b2.f3855C = this.cachedLightingColorFilter;
                if (!(this.teamColorRatio == 0.0f || wVar == null)) {
                    AbstractC0171m mVar = null;
                    if (wVar instanceof AbstractC0210af) {
                        mVar = ((AbstractC0210af) wVar).f1461bB;
                    }
                    if ((wVar instanceof C0163f) && (afVar = ((C0163f) wVar).f925j) != null) {
                        mVar = afVar.f1461bB;
                    }
                    if (mVar != null) {
                        float f5 = 1.0f - this.teamColorRatio;
                        int a5 = Color.m4215a(b2.f3851y);
                        int b3 = (int) (Color.m4211b(b2.f3851y) * f5);
                        int c2 = (int) (Color.m4210c(b2.f3851y) * f5);
                        int d = (int) (Color.m4209d(b2.f3851y) * f5);
                        int F = mVar.m3525F();
                        b2.f3851y = Color.m4213a(a5, C0654f.m1471b((int) (b3 + (Color.m4211b(F) * this.teamColorRatio)), 0, 255), C0654f.m1471b((int) (c2 + (Color.m4210c(F) * this.teamColorRatio)), 0, 255), C0654f.m1471b((int) (d + (Color.m4209d(F) * this.teamColorRatio)), 0, 255));
                        if (AbstractC0789l.m699aj()) {
                            b2.f3855C = new LightingColorFilter(b2.f3851y, 0);
                        }
                    }
                }
                if (this.fadeInTime != 0.0f) {
                    b2.f3846t = true;
                    b2.f3847u = this.fadeInTime;
                }
                b2.f3896ar = this.shadow;
                b2.f3845s = this.fadeOut;
                b2.f3874V = this.delayedStartTimer;
                b2.f3874V += m3108a(-this.delayedStartTimerRandom, this.delayedStartTimerRandom);
                b2.f3848v = this.atmospheric;
                b2.f3849w = this.physics;
                b2.f3850x = this.physicsGravity;
                b2.f3844r = this.priority;
                b2.f3869Q = this.xSpeedAbsolute + m3109a(this.xSpeedAbsoluteRandom);
                b2.f3870R = this.ySpeedAbsolute + m3109a(this.ySpeedAbsoluteRandom);
                if (!(this.xSpeedRelative == 0.0f && this.ySpeedRelative == 0.0f && this.xSpeedRelativeRandom == 0.0f && this.ySpeedRelativeRandom == 0.0f)) {
                    float i3 = C0654f.m1421i(f4);
                    float h2 = C0654f.m1425h(f4);
                    float a6 = this.xSpeedRelative + m3109a(this.xSpeedRelativeRandom);
                    float a7 = this.ySpeedRelative + m3109a(this.ySpeedRelativeRandom);
                    b2.f3869Q += (i3 * a7) - (h2 * a6);
                    b2.f3870R += (h2 * a7) + (i3 * a6);
                }
                b2.f3871S = this.hSpeed + m3109a(this.hSpeedRandom);
                b2.f3878Z = this.dirSpeed + m3109a(this.dirSpeedRandom);
                if (this.animateFrameStart != this.animateFrameEnd) {
                    b2.f3883ae = true;
                }
                b2.f3884af = this.animateFrameStart;
                if (this.animateFrameStartRandomAdd != 0) {
                    b2.f3884af += C0654f.m1514a(0, this.animateFrameStartRandomAdd);
                }
                b2.f3885ag = this.animateFrameEnd;
                b2.f3889ak = this.animateFrameStart;
                b2.f3886ah = this.animateFramePingPong;
                b2.f3887ai = this.animateFrameLooping;
                b2.f3888aj = this.animateFrameSpeed;
                b2.f3888aj += m3109a(this.animateFrameSpeedRandom);
                if (wVar != null && this.attachedToUnit) {
                    C0571c.m2003a(b2, wVar);
                }
                if (this.alsoPlaySound != null) {
                    this.alsoPlaySound.m3078a(f, f2, 1.0f);
                }
                if (i < 5 && this.alsoEmitEffects != null) {
                    this.alsoEmitEffects.m2710a(f, f2, f3, f4, wVar, i + 1, (short) 0);
                }
                return b2;
            }
        } else if (i >= 5 || this.ifSpawnFailsEmitEffects == null) {
            return null;
        } else {
            this.ifSpawnFailsEmitEffects.m2710a(f, f2, f3, f4, wVar, i + 1, s);
            return null;
        }
    }

    /* renamed from: a */
    public final float m3109a(float f) {
        if (f == 0.0f) {
            return 0.0f;
        }
        return C0654f.m1458c(-f, f);
    }

    /* renamed from: a */
    public final float m3108a(float f, float f2) {
        if (f == f2) {
            return f;
        }
        return C0654f.m1458c(f, f2);
    }

    /* renamed from: a */
    public void m3106a(C0368l lVar, C0809ab abVar, String str) {
        AbstractC0789l u = AbstractC0789l.m638u();
        this.createWhenOffscreen = abVar.m594a(str, "createWhenOffscreen", (Boolean) false).booleanValue();
        this.createWhenZoomedOut = abVar.m594a(str, "createWhenZoomedOut", (Boolean) true).booleanValue();
        this.createWhenOverLiquid = abVar.m594a(str, "createWhenOverLiquid", (Boolean) true).booleanValue();
        this.createWhenOverLand = abVar.m594a(str, "createWhenOverLand", (Boolean) true).booleanValue();
        if (this.createWhenOverLiquid || this.createWhenOverLand) {
            this.spawnChance = abVar.m592a(str, "spawnChance", Float.valueOf(1.0f)).floatValue();
            this.life = abVar.m592a(str, "life", Float.valueOf(200.0f)).floatValue();
            this.lifeRandom = abVar.m592a(str, "lifeRandom", Float.valueOf(0.0f)).floatValue();
            this.showInFog = abVar.m594a(str, "showInFog", (Boolean) false).booleanValue();
            this.xOffsetRelative = abVar.m592a(str, "xOffsetRelative", Float.valueOf(0.0f)).floatValue();
            this.yOffsetRelative = abVar.m592a(str, "yOffsetRelative", Float.valueOf(0.0f)).floatValue();
            this.hOffset = abVar.m592a(str, "hOffset", Float.valueOf(0.0f)).floatValue();
            this.alwayStartDirAtZero = abVar.m594a(str, "alwayStartDirAtZero", (Boolean) false).booleanValue();
            this.dirOffset = abVar.m592a(str, "dirOffset", Float.valueOf(0.0f)).floatValue();
            this.xOffsetRelativeRandom = abVar.m592a(str, "xOffsetRelativeRandom", Float.valueOf(0.0f)).floatValue();
            this.yOffsetRelativeRandom = abVar.m592a(str, "yOffsetRelativeRandom", Float.valueOf(0.0f)).floatValue();
            this.hOffsetRandom = abVar.m592a(str, "hOffsetRandom", Float.valueOf(0.0f)).floatValue();
            this.dirOffsetRandom = abVar.m592a(str, "dirOffsetRandom", Float.valueOf(0.0f)).floatValue();
            this.xOffsetAbsolute = abVar.m592a(str, "xOffsetAbsolute", Float.valueOf(0.0f)).floatValue();
            this.yOffsetAbsolute = abVar.m592a(str, "yOffsetAbsolute", Float.valueOf(0.0f)).floatValue();
            this.xOffsetAbsoluteRandom = abVar.m592a(str, "xOffsetAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
            this.yOffsetAbsoluteRandom = abVar.m592a(str, "yOffsetAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
            this.xSpeedRelative = abVar.m592a(str, "xSpeedRelative", Float.valueOf(0.0f)).floatValue();
            this.ySpeedRelative = abVar.m592a(str, "ySpeedRelative", Float.valueOf(0.0f)).floatValue();
            this.hSpeed = abVar.m592a(str, "hSpeed", Float.valueOf(0.0f)).floatValue();
            this.dirSpeed = abVar.m592a(str, "dirSpeed", Float.valueOf(0.0f)).floatValue();
            this.xSpeedRelativeRandom = abVar.m592a(str, "xSpeedRelativeRandom", Float.valueOf(0.0f)).floatValue();
            this.ySpeedRelativeRandom = abVar.m592a(str, "ySpeedRelativeRandom", Float.valueOf(0.0f)).floatValue();
            this.hSpeedRandom = abVar.m592a(str, "hSpeedRandom", Float.valueOf(0.0f)).floatValue();
            this.dirSpeedRandom = abVar.m592a(str, "dirSpeedRandom", Float.valueOf(0.0f)).floatValue();
            this.xSpeedAbsolute = abVar.m592a(str, "xSpeedAbsolute", Float.valueOf(0.0f)).floatValue();
            this.ySpeedAbsolute = abVar.m592a(str, "ySpeedAbsolute", Float.valueOf(0.0f)).floatValue();
            this.xSpeedAbsoluteRandom = abVar.m592a(str, "xSpeedAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
            this.ySpeedAbsoluteRandom = abVar.m592a(str, "ySpeedAbsoluteRandom", Float.valueOf(0.0f)).floatValue();
            this.scaleTo = abVar.m592a(str, "scaleTo", Float.valueOf(this.scaleTo)).floatValue();
            this.scaleFrom = abVar.m592a(str, "scaleFrom", Float.valueOf(this.scaleFrom)).floatValue();
            this.alpha = abVar.m592a(str, "alpha", Float.valueOf(this.alpha)).floatValue();
            this.color = abVar.m590a(str, "color", Integer.valueOf(this.color)).intValue();
            if (!(!AbstractC0789l.m699aj() || this.color == 0 || this.color == -1)) {
                this.cachedLightingColorFilter = new LightingColorFilter(this.color, 0);
            }
            this.teamColorRatio = abVar.m592a(str, "teamColorRatio", Float.valueOf(this.teamColorRatio)).floatValue();
            if (this.teamColorRatio < 0.0f || this.teamColorRatio > 1.0f) {
                throw new RuntimeException(str + " teamColorRatio should be between 0-1 got:" + this.teamColorRatio);
            }
            this.shadow = abVar.m594a(str, "shadow", (Boolean) false).booleanValue();
            this.drawLayer = (short) 2;
            if (abVar.m594a(str, "drawUnderUnits", (Boolean) false).booleanValue()) {
                this.drawLayer = (short) 1;
            }
            this.fadeInTime = abVar.m592a(str, "fadeInTime", Float.valueOf(0.0f)).floatValue();
            this.fadeOut = abVar.m594a(str, "fadeOut", (Boolean) true).booleanValue();
            this.delayedStartTimer = abVar.m592a(str, "delayedStartTimer", Float.valueOf(0.0f)).floatValue();
            this.delayedStartTimerRandom = abVar.m592a(str, "delayedStartTimerRandom", Float.valueOf(0.0f)).floatValue();
            this.frameIndex = abVar.m580b(str, "frameIndex", (Integer) 0).intValue();
            this.frameIndexRandom = abVar.m580b(str, "frameIndexRandom", (Integer) 0).intValue();
            String b = abVar.m579b(str, "stripIndex", "0");
            this.stripIndex = u.f5517bz.m1999a(b);
            if (this.stripIndex == -1) {
                throw new RuntimeException("Failed to find stripIndex with name:" + b);
            }
            this.attachedToUnit = abVar.m594a(str, "attachedToUnit", (Boolean) true).booleanValue();
            this.liveAfterAttachedDies = abVar.m594a(str, "liveAfterAttachedDies", (Boolean) true).booleanValue();
            this.atmospheric = abVar.m594a(str, "atmospheric", (Boolean) false).booleanValue();
            this.physics = abVar.m594a(str, "physics", (Boolean) false).booleanValue();
            this.physicsGravity = abVar.m592a(str, "physicsGravity", Float.valueOf(1.0f)).floatValue();
            String b2 = abVar.m579b(str, "priority", (String) null);
            if (b2 != null) {
                try {
                    this.priority = EnumC0576h.valueOf(b2);
                } catch (IllegalArgumentException e) {
                    throw new RuntimeException("Unknown priority:" + b2);
                }
            }
            int intValue = abVar.m580b(str, "total_frames", (Integer) 1).intValue();
            if (intValue < 1) {
                throw new C0324at("TOTAL_FRAMES cannot be: " + intValue + " (must be 1 or more)");
            }
            C0748e a = lVar.m2784a(abVar, str, "image");
            if (a != null) {
                this.imageStrip = new C0575g();
                this.imageStrip.f3934i = a;
                this.imageStrip.f3927b = this.imageStrip.f3934i.mo349l() / intValue;
                this.imageStrip.f3928c = this.imageStrip.f3934i.mo350k();
                this.imageStrip.f3927b = abVar.m580b(str, "frame_width", Integer.valueOf(this.imageStrip.f3927b)).intValue();
                this.imageStrip.f3928c = abVar.m580b(str, "frame_height", Integer.valueOf(this.imageStrip.f3928c)).intValue();
                if (intValue == 1 && this.imageStrip.f3927b >= this.imageStrip.f3934i.mo349l()) {
                    this.imageStrip.f3936k = true;
                } else if (this.imageStrip.f3928c < this.imageStrip.f3934i.mo350k()) {
                    this.imageStrip.f3933h = this.imageStrip.f3934i.mo349l() / this.imageStrip.f3927b;
                    if (this.imageStrip.f3933h < 1) {
                        this.imageStrip.f3933h = 1;
                    }
                }
                this.imageStrip.f3929d = 0;
                this.imageStrip.f3930e = 0;
                this.imageStrip.f3931f = this.imageStrip.f3927b;
                this.imageStrip.f3932g = this.imageStrip.f3928c;
                String b3 = abVar.m579b(str, "imageShadow", (String) null);
                if (b3 != null) {
                    this.imageStrip.f3935j = C0307ac.m3130a(lVar.f2506x, b3, lVar.f2528T, lVar, str, "imageShadow");
                    this.shadow = true;
                }
                if (this.shadow && this.imageStrip.f3935j == null) {
                    throw new C0324at("imageShadow is required if image and shadow:true is used");
                }
            }
            this.animateFrameStart = abVar.m580b(str, "animateFrameStart", (Integer) 0).intValue();
            this.animateFrameStartRandomAdd = abVar.m580b(str, "animateFrameStartRandomAdd", (Integer) 0).intValue();
            this.animateFrameEnd = abVar.m580b(str, "animateFrameEnd", (Integer) 0).intValue();
            this.animateFramePingPong = abVar.m594a(str, "animateFramePingPong", (Boolean) false).booleanValue();
            this.animateFrameLooping = abVar.m594a(str, "animateFrameLooping", (Boolean) false).booleanValue();
            this.animateFrameSpeed = abVar.m581b(str, "animateFrameSpeed", Float.valueOf(0.5f)).floatValue();
            this.animateFrameSpeedRandom = abVar.m581b(str, "animateFrameSpeedRandom", Float.valueOf(0.0f)).floatValue();
            if (a == null || ((this.imageStrip.f3927b < this.imageStrip.f3934i.mo349l() && intValue == 1) || this.animateFrameEnd <= intValue)) {
                this.alsoEmitEffects = lVar.m2782a(abVar.m579b(str, "alsoEmitEffects", (String) null));
                this.alsoEmitEffectsOnDeath = lVar.m2782a(abVar.m579b(str, "alsoEmitEffectsOnDeath", (String) null));
                this.ifSpawnFailsEmitEffects = lVar.m2782a(abVar.m579b(str, "ifSpawnFailsEmitEffects", (String) null));
                this.alsoPlaySound = C0321aq.m3075a(lVar, abVar.m579b(str, "alsoPlaySound", (String) null), (C0321aq) null);
                return;
            }
            throw new C0324at("animateFrameEnd:" + this.animateFrameEnd + " cannot be larger than TOTAL_FRAMES: " + intValue + " (when using custom image)");
        }
        throw new RuntimeException(str + " effect cannot have both createWhenOverLiquid and createWhenOverLand set to false, it would never be created");
    }
}
