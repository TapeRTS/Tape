package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.AudioEngine;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.EffectEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.RenderedObject;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import java.io.IOException;
/* loaded from: classes.jar:com/corrodinggames/rts/game/Projectile.class */
public class Projectile extends RenderedObject {
    public float areaDamage;
    public float areaRadius;
    public boolean ballistic;
    public int color;
    public float directDamage;
    private boolean hasHit;
    public boolean homing;
    public boolean instant;
    public boolean largeHitEffect;
    public boolean laserEffect;
    public float lifeTimer;
    public Unit source;
    public float speed;
    public Unit target;
    public boolean trailEffect;
    public float trailEffect_delay;
    public static Paint laserPaint = new Paint();
    public static Paint tempPaint = new Paint();
    public static Paint shadowPaint = new Paint();
    public int drawSize = 2;
    public boolean visible = true;
    public float ballistic_delaymove_height = 40.0f;
    public float ballistic_height = 60.0f;
    public boolean ballistic_height_reached = false;
    public float ballistic_height_speed = 2.0f;
    public boolean hitSound = true;

    static {
        shadowPaint.setAlpha(128);
        laserPaint.setARGB(80, 255, 0, 0);
        laserPaint.setAntiAlias(true);
        laserPaint.setStrokeWidth(2.0f);
    }

    public static Projectile createProjectile(Unit unit, float f, float f2) {
        Projectile projectile = new Projectile();
        projectile.source = unit;
        projectile.x = f;
        projectile.y = f2;
        projectile.color = Color.argb(255, 100, 30, 30);
        return projectile;
    }

    public static void damageUnit(Unit unit, Unit unit2, int i) {
        GameEngine instance = GameEngine.getInstance();
        unit2.hp -= i;
        instance.stats.unitHit(i, unit, unit2);
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void draw(float f) {
        if (this.visible) {
            GameEngine instance = GameEngine.getInstance();
            int i = (int) (this.x - instance.viewpointX_rounded);
            int i2 = (int) (this.y - instance.viewpointY_rounded);
            if (!this.laserEffect) {
                tempPaint.setColor(this.color);
                if (this.height != 0.0f) {
                    instance.graphics.getCanvas().drawCircle(i, i2, this.drawSize, shadowPaint);
                }
                instance.graphics.getCanvas().drawCircle(i, i2 - this.height, this.drawSize, tempPaint);
                return;
            }
            instance.graphics.getCanvas().drawLine(this.x - instance.viewpointX_rounded, this.y - instance.viewpointY_rounded, this.target.x - instance.viewpointX_rounded, (this.target.y - this.target.height) - instance.viewpointY_rounded, laserPaint);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public boolean drawIcon(float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void drawInterface(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void drawOver(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void drawUnder(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.SyncedObject
    public void readIn(InputNetStream inputNetStream) throws IOException {
        throw new RuntimeException("not completed");
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    public void update(float f) {
        GameEngine instance = GameEngine.getInstance();
        float f2 = this.target.x;
        float f3 = this.target.y;
        float f4 = this.target.height;
        float direction = CommonUtils.getDirection(this.x, this.y, f2, f3);
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, f2, f3);
        if (!this.instant) {
            if (distanceSq > 25.0f && (!this.ballistic || this.ballistic_delaymove_height < this.height || this.ballistic_height_reached)) {
                this.x += CommonUtils.cos(direction) * this.speed * f;
                this.y += CommonUtils.sin(direction) * this.speed * f;
            }
            if (!this.ballistic) {
                float f5 = this.target.height;
                float f6 = this.height;
                float f7 = this.speed * f;
                if (distanceSq > 0.1d) {
                    f7 = CommonUtils.limit((CommonUtils.abs(f5 - f6) / CommonUtils.square(distanceSq)) * this.speed * f, this.speed * f);
                }
                this.height += CommonUtils.limit(this.target.height - this.height, f7);
            } else if (!this.ballistic_height_reached) {
                this.height += CommonUtils.limit(this.ballistic_height - this.height, this.ballistic_height_speed * f);
                if (this.height >= this.ballistic_height) {
                    this.ballistic_height_reached = true;
                }
            } else if (distanceSq < 400.0f) {
                this.height += CommonUtils.limit(this.target.height - this.height, this.ballistic_height_speed * f);
            }
        }
        if (this.trailEffect) {
            this.trailEffect_delay += f;
            if (this.trailEffect_delay > 7.0f) {
                this.trailEffect_delay = CommonUtils.rnd(0.0f, 3.0f);
                EffectEngine.EffectObject emitEffect = instance.effects.emitEffect(this.x, this.y, this.height, EffectEngine.EffectType.custom, false);
                if (emitEffect != null) {
                    emitEffect.stripIndex = 0;
                    emitEffect.frameIndex = 0;
                    emitEffect.drawLayer = 2;
                    emitEffect.fadeOut = true;
                    emitEffect.startingAlpha = 0.5f;
                    emitEffect.startTimer = 60.0f;
                    emitEffect.timer = 60.0f;
                    emitEffect.ySpeed = 0.1f;
                }
            }
        }
        if (!this.hasHit) {
            boolean z = false;
            if (distanceSq < 25.0f) {
                z = false;
                if (Math.abs(this.target.height - this.height) < 3.0f) {
                    z = true;
                }
            }
            if (this.instant) {
                z = true;
            }
            if (z) {
                this.hasHit = true;
                this.target.hp -= this.directDamage;
                instance.stats.unitHit(this.directDamage, this.source, this.target);
                if (this.instant) {
                }
                if (!this.largeHitEffect) {
                    EffectEngine.EffectObject emitEffect2 = instance.effects.emitEffect(this.target.x, this.target.y, this.target.height, EffectEngine.EffectType.custom, false);
                    if (emitEffect2 != null) {
                        emitEffect2.frameIndex = 0;
                        emitEffect2.timer = 15.0f;
                        emitEffect2.startTimer = emitEffect2.timer;
                        emitEffect2.fadeOut = true;
                        emitEffect2.startingAlpha = 1.0f;
                    }
                } else {
                    instance.effects.emitSmallExplosion(this.target.x, this.target.y, this.target.height);
                    if (this.hitSound) {
                        instance.audio.playSound(AudioEngine.missile_hit, 0.5f, this.target.x, this.target.y);
                    }
                }
                if (!this.laserEffect) {
                    remove();
                }
            }
        }
        this.lifeTimer = CommonUtils.toZero(this.lifeTimer, f);
        if (this.lifeTimer == 0.0f) {
            remove();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.SyncedObject
    public void writeOut(OutputNetStream outputNetStream) throws IOException {
        throw new RuntimeException("not completed");
    }
}
