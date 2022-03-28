package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
/* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/EffectEngine.class */
public class EffectEngine {
    public static final EffectObject[] effectList = new EffectObject[50];
    public static ImageStrip[] imageStrips;
    RectF _dst = new RectF();
    Rect _src = new Rect();
    Paint _paint = new Paint();

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/EffectEngine$EffectObject.class */
    public final class EffectObject {
        public boolean active;
        public float animateFrameCurrent;
        public int animateFrameEnd;
        public float animateFrameSpeed;
        public int animateFrameStart;
        public boolean animateFrames;
        public float delayedStartTimer;
        public float dir;
        public boolean fadeOut;
        public int frameIndex;
        public float height;
        public float startTimer;
        public float startingAlpha;
        public int stripIndex;
        public float timer;
        public float x;
        public float xSpeed;
        public float y;
        public float ySpeed;
        public LightingColorFilter lightingColorFilter = null;
        public boolean centered = false;
        public int drawLayer = 2;

        public EffectObject() {
        }

        public void clear() {
            this.height = 0.0f;
            this.drawLayer = 2;
            this.active = false;
            this.centered = false;
            this.animateFrames = false;
            this.animateFrameCurrent = 0.0f;
            this.animateFrameSpeed = 0.0f;
            this.animateFrameEnd = 0;
            this.frameIndex = 0;
            this.stripIndex = 0;
            this.delayedStartTimer = 0.0f;
            this.timer = 15.0f;
            this.startTimer = this.timer;
            this.fadeOut = false;
            this.startingAlpha = 1.0f;
            this.dir = 0.0f;
            this.xSpeed = 0.0f;
            this.ySpeed = 0.0f;
            this.lightingColorFilter = null;
        }

        public void draw() {
            if (this.delayedStartTimer <= 0.0f) {
                ImageStrip imageStrip = EffectEngine.imageStrips[this.stripIndex];
                if (!imageStrip.singleImage) {
                    int i = imageStrip.globalOffsetX + (this.frameIndex * imageStrip.tileStrideX);
                    int i2 = imageStrip.globalOffsetY + (imageStrip.tileStrideY * 0);
                    EffectEngine.this._src.set(i, i2, imageStrip.tileWidth + i, imageStrip.tileHeight + i2);
                } else {
                    EffectEngine.this._src.set(0, 0, imageStrip.image.getWidth(), imageStrip.image.getHeight());
                }
                GameEngine instance = GameEngine.getInstance();
                PointF convert3Dto2D = CommonUtils.convert3Dto2D(this.x, this.y, this.height);
                EffectEngine.this._dst.set(convert3Dto2D.x, convert3Dto2D.y, convert3Dto2D.x + EffectEngine.this._src.width(), convert3Dto2D.y + EffectEngine.this._src.height());
                if (this.centered) {
                    EffectEngine.this._dst.offset((-EffectEngine.this._dst.width()) / 2.0f, (-EffectEngine.this._dst.height()) / 2.0f);
                }
                EffectEngine.this._dst.offset(-instance.viewpointX_rounded, -instance.viewpointY_rounded);
                EffectEngine.this._paint.reset();
                if (this.fadeOut) {
                    float f = (this.timer / this.startTimer) * this.startingAlpha;
                    float f2 = f;
                    if (f > 1.0f) {
                        f2 = 1.0f;
                    }
                    float f3 = f2;
                    if (f2 < 0.0f) {
                        f3 = 0.0f;
                    }
                    EffectEngine.this._paint.setAlpha((int) (255.0f * f3));
                }
                if (this.lightingColorFilter != null) {
                    EffectEngine.this._paint.setColorFilter(this.lightingColorFilter);
                }
                instance.graphics.getCanvas().save();
                if (this.dir != 0.0f) {
                    instance.graphics.getCanvas().rotate(this.dir + 90.0f, EffectEngine.this._dst.centerX(), EffectEngine.this._dst.centerY());
                }
                instance.graphics.drawImage(imageStrip.image, EffectEngine.this._src, EffectEngine.this._dst, EffectEngine.this._paint);
                instance.graphics.getCanvas().restore();
            }
        }

        public void update(float f) {
            this.delayedStartTimer = CommonUtils.toZero(this.delayedStartTimer, f);
            if (this.delayedStartTimer <= 0.0f) {
                this.timer -= f;
                if (this.timer < 0.0f) {
                    this.active = false;
                    return;
                }
                if (this.animateFrames) {
                    this.animateFrameCurrent += this.animateFrameSpeed * f;
                    this.frameIndex = (int) this.animateFrameCurrent;
                    if (this.animateFrameCurrent > this.animateFrameEnd) {
                        this.active = false;
                    }
                }
                this.x += this.xSpeed * f;
                this.y += this.ySpeed * f;
            }
        }
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/EffectEngine$EffectType.class */
    public enum EffectType {
        custom,
        smoke,
        teleport,
        hitGround,
        playerLand,
        playerJump,
        gemCollect,
        keyDoorOpen,
        blood
    }

    /* loaded from: classes.jar:com/corrodinggames/rts/gameFramework/EffectEngine$ImageStrip.class */
    public final class ImageStrip {
        public int tileWidth = 25;
        public int tileHeight = 25;
        public int globalOffsetX = 1;
        public int globalOffsetY = 1;
        public int tileStrideX = 26;
        public int tileStrideY = 26;
        BitmapOrTexture image = null;
        public boolean singleImage = false;

        public ImageStrip() {
        }
    }

    public void draw(float f, int i) {
        EffectObject[] effectObjectArr;
        for (EffectObject effectObject : effectList) {
            if (effectObject.active && effectObject.drawLayer == i) {
                effectObject.draw();
            }
        }
    }

    public EffectObject emitEffect(float f, float f2, float f3, EffectType effectType, boolean z) {
        EffectObject effectObject;
        EffectObject freeEffect = getFreeEffect();
        if (freeEffect == null) {
            effectObject = null;
        } else {
            GameEngine instance = GameEngine.getInstance();
            if (!z && instance.map.fogOfWar_active) {
                instance.map.toGrid(f, f2);
                int i = instance.map.returnX;
                int i2 = instance.map.returnY;
                if (instance.map.isInMap(i, i2) && instance.map.fogOfWar_map[i][i2] == 10) {
                    effectObject = null;
                }
            }
            freeEffect.clear();
            freeEffect.active = true;
            freeEffect.stripIndex = 0;
            ImageStrip imageStrip = imageStrips[freeEffect.stripIndex];
            freeEffect.centered = true;
            freeEffect.x = f;
            freeEffect.y = f2;
            freeEffect.height = f3;
            freeEffect.xSpeed = 0.0f;
            freeEffect.ySpeed = 0.0f;
            freeEffect.startingAlpha = 1.0f;
            if (effectType == EffectType.hitGround || effectType == EffectType.playerLand || effectType == EffectType.playerJump) {
                freeEffect.frameIndex = 7;
                freeEffect.timer = 12.0f;
                freeEffect.fadeOut = true;
                freeEffect.ySpeed = -0.3f;
                freeEffect.startingAlpha = 0.7f;
                if (effectType == EffectType.playerJump) {
                    freeEffect.frameIndex = 3;
                    freeEffect.ySpeed = -0.7f;
                    freeEffect.timer = 24.0f;
                    freeEffect.startingAlpha = 0.7f;
                }
                if (effectType == EffectType.playerLand) {
                    freeEffect.frameIndex = 4;
                    freeEffect.timer = 15.0f;
                    freeEffect.startingAlpha = 0.4f;
                }
            }
            if (effectType == EffectType.teleport) {
                freeEffect.frameIndex = 1;
                freeEffect.timer = 25.0f;
                freeEffect.fadeOut = true;
            }
            if (effectType == EffectType.gemCollect) {
                freeEffect.frameIndex = 5;
                freeEffect.timer = 42.0f;
                freeEffect.fadeOut = true;
                freeEffect.ySpeed = 0.1f;
                freeEffect.startingAlpha = 2.0f;
            }
            if (effectType == EffectType.keyDoorOpen) {
                freeEffect.frameIndex = 6;
                freeEffect.timer = 39.0f;
                freeEffect.fadeOut = true;
                freeEffect.ySpeed = 0.1f;
                freeEffect.startingAlpha = 2.0f;
            }
            if (effectType == EffectType.blood) {
                freeEffect.frameIndex = 14;
                freeEffect.timer = 39.0f;
                freeEffect.fadeOut = true;
                freeEffect.ySpeed = 0.1f;
                freeEffect.startingAlpha = 0.7f;
            }
            freeEffect.startTimer = freeEffect.timer;
            effectObject = freeEffect;
        }
        return effectObject;
    }

    public void emitLargeExplosion(float f, float f2, float f3) {
        for (int i = 0; i < 7; i++) {
            EffectObject emitSmallExplosion = emitSmallExplosion(CommonUtils.rnd(-20.0f, 20.0f) + f, CommonUtils.rnd(-20.0f, 20.0f) + f2, f3);
            if (emitSmallExplosion != null) {
                emitSmallExplosion.delayedStartTimer = CommonUtils.rnd(0.0f, 20.0f);
                emitSmallExplosion.animateFrameSpeed = CommonUtils.rnd(0.3f, 0.6f);
            }
        }
    }

    public EffectObject emitLight(float f, float f2, float f3, int i) {
        EffectObject emitEffect = emitEffect(f, f2, f3, EffectType.custom, false);
        if (emitEffect != null) {
            emitEffect.stripIndex = 2;
            emitEffect.timer = 10.0f;
            emitEffect.startTimer = emitEffect.timer;
            emitEffect.fadeOut = true;
            emitEffect.startingAlpha = 0.5f;
            emitEffect.drawLayer = 2;
            if (i != 0) {
                emitEffect.lightingColorFilter = new LightingColorFilter(i, 0);
            }
        }
        return emitEffect;
    }

    public EffectObject emitSmallExplosion(float f, float f2, float f3) {
        EffectObject emitEffect = emitEffect(f, f2, f3, EffectType.custom, false);
        if (emitEffect != null) {
            emitEffect.stripIndex = 1;
            emitEffect.animateFrames = true;
            emitEffect.animateFrameCurrent = 0.0f;
            emitEffect.animateFrameSpeed = 0.5f;
            emitEffect.animateFrameEnd = 12;
            emitEffect.frameIndex = 0;
            emitEffect.timer = 30.0f;
            emitEffect.startTimer = emitEffect.timer;
            emitEffect.fadeOut = true;
            emitEffect.startingAlpha = 1.0f;
        }
        return emitEffect;
    }

    public EffectObject emitSmallFlame(float f, float f2, float f3, float f4) {
        return emitSmallFlame(f, f2, f3, f4, 0);
    }

    public EffectObject emitSmallFlame(float f, float f2, float f3, float f4, int i) {
        EffectObject emitEffect = emitEffect(f, f2, f3, EffectType.custom, false);
        if (emitEffect != null) {
            emitEffect.stripIndex = 3;
            emitEffect.animateFrames = true;
            emitEffect.animateFrameCurrent = 0.0f;
            emitEffect.animateFrameSpeed = 0.5f;
            emitEffect.animateFrameEnd = 3;
            emitEffect.dir = f4;
            emitEffect.frameIndex = 0;
            emitEffect.timer = 20.0f;
            emitEffect.startTimer = emitEffect.timer;
            emitEffect.fadeOut = false;
            if (i != 0) {
                emitEffect.lightingColorFilter = new LightingColorFilter(i, 0);
            }
        }
        return emitEffect;
    }

    public EffectObject getFreeEffect() {
        EffectObject effectObject;
        EffectObject[] effectObjectArr = effectList;
        int length = effectObjectArr.length;
        int i = 0;
        while (true) {
            if (i >= length) {
                effectObject = null;
                break;
            }
            effectObject = effectObjectArr[i];
            if (!effectObject.active) {
                break;
            }
            i++;
        }
        return effectObject;
    }

    public void init(Context context) {
        GameEngine instance = GameEngine.getInstance();
        imageStrips = new ImageStrip[10];
        ImageStrip imageStrip = new ImageStrip();
        imageStrip.tileWidth = 25;
        imageStrip.tileHeight = 25;
        imageStrip.globalOffsetX = 1;
        imageStrip.globalOffsetY = 1;
        imageStrip.tileStrideX = 26;
        imageStrip.tileStrideY = 26;
        imageStrip.image = instance.graphics.loadImage(R.drawable.effects, true);
        imageStrips[0] = imageStrip;
        ImageStrip imageStrip2 = new ImageStrip();
        imageStrip2.tileWidth = 39;
        imageStrip2.tileHeight = 40;
        imageStrip2.globalOffsetX = 1;
        imageStrip2.globalOffsetY = 1;
        imageStrip2.tileStrideX = 40;
        imageStrip2.tileStrideY = 41;
        imageStrip2.image = instance.graphics.loadImage(R.drawable.explode_big, true);
        imageStrips[1] = imageStrip2;
        ImageStrip imageStrip3 = new ImageStrip();
        imageStrip3.singleImage = true;
        imageStrip3.image = instance.graphics.loadImage(R.drawable.light_50, true);
        imageStrips[2] = imageStrip3;
        ImageStrip imageStrip4 = new ImageStrip();
        imageStrip4.tileWidth = 20;
        imageStrip4.tileHeight = 25;
        imageStrip4.globalOffsetX = 0;
        imageStrip4.globalOffsetY = 0;
        imageStrip4.tileStrideX = 20;
        imageStrip4.tileStrideY = 25;
        imageStrip4.image = instance.graphics.loadImage(R.drawable.flame, true);
        imageStrips[3] = imageStrip4;
        for (int i = 0; i < effectList.length; i++) {
            effectList[i] = new EffectObject();
        }
    }

    public void removeAll() {
        for (EffectObject effectObject : effectList) {
            effectObject.active = false;
        }
    }

    public void update(float f) {
        EffectObject[] effectObjectArr;
        for (EffectObject effectObject : effectList) {
            if (effectObject.active) {
                effectObject.update(f);
            }
        }
    }
}
