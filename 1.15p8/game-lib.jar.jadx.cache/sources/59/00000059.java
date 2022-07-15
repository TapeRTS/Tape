package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.Graphics;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.effect.EffectType;
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;

/* renamed from: com.corrodinggames.rts.game.units.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/af.class */
public class Tree extends AbstractC0581p {

    /* renamed from: a */
    static BitmapOrTexture[] trees = new BitmapOrTexture[3];

    /* renamed from: b */
    static BitmapOrTexture f1505b = null;

    /* renamed from: c */
    BitmapOrTexture f1506c;

    /* renamed from: d */
    int f1507d;

    /* renamed from: e */
    int f1508e;

    /* renamed from: g */
    float f1509g;

    /* renamed from: h */
    boolean f1510h;

    /* renamed from: i */
    float f1511i;

    /* renamed from: f */
    int f1512f = 0;

    /* renamed from: j */
    int f1513j = 0;

    /* renamed from: k */
    int f1514k = 0;

    /* renamed from: l */
    float f1515l = 1.0f;

    /* renamed from: m */
    boolean f1516m = false;

    /* renamed from: b */
    public static void load() {
        GameEngine game = GameEngine.getInstance();
        trees[0] = game.graphics.loadImage(R.drawable.palm_tree);
        trees[1] = game.graphics.loadImage(R.drawable.trees);
        trees[2] = game.graphics.loadImage(R.drawable.trees_snow);
        f1505b = game.graphics.loadImage(R.drawable.palm_leaves);
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeInt(this.f1507d);
        outputNetStream.writeInt(this.f1512f);
        outputNetStream.writeFloat(this.f1509g);
        outputNetStream.writeBoolean(this.f1510h);
        outputNetStream.writeFloat(this.f1511i);
        outputNetStream.writeByte(2);
        outputNetStream.writeFloat(this.f1515l);
        outputNetStream.writeInt(this.f1508e);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        this.f1507d = inputNetStream.readInt();
        this.f1512f = inputNetStream.readInt();
        this.f1509g = inputNetStream.readFloat();
        this.f1510h = inputNetStream.readBoolean();
        this.f1511i = inputNetStream.readFloat();
        byte readByte = inputNetStream.readByte();
        if (readByte >= 1) {
            this.f1515l = inputNetStream.readFloat();
        } else {
            this.f1515l = 1.0f;
        }
        if (readByte >= 2) {
            this.f1508e = inputNetStream.readInt();
        } else {
            this.f1508e = 0;
        }
        m3792b(this.f1507d, this.f1508e);
        super.mo427a(inputNetStream);
        if (this.dead) {
            this.f1516m = false;
        }
    }

    /* renamed from: c */
    public BitmapOrTexture m3791c() {
        return this.f1506c;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        m3789f();
        return true;
    }

    public Tree(boolean z) {
        super(z);
        m3792b(1, -1);
        this.radius = 3.0f;
        this.displayRadius = this.radius + 1.0f;
        this.maxHp = 100.0f;
        this.hp = this.maxHp;
        this.direction = -90.0f;
        setDrawLayer(3);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public void mo3029a_(String str) {
        int i = -1;
        String[] split = str.split("\\.");
        if (split.length != 0 && split.length != 1) {
            if (split.length == 2) {
                str = split[0];
                try {
                    i = Integer.parseInt(split[1]);
                } catch (NumberFormatException e) {
                    throw new RuntimeException("Tree sub type format error:" + split[1]);
                }
            } else {
                throw new RuntimeException("Tree sub unknown format with parts:" + split.length);
            }
        }
        try {
            m3792b(Integer.parseInt(str), i);
        } catch (NumberFormatException e2) {
            throw new RuntimeException("Tree type format error:" + str);
        }
    }

    /* renamed from: b */
    public void m3792b(int i, int i2) {
        this.f1507d = i;
        this.f1508e = i2;
        if (this.f1507d == 0) {
            setObjectWidth(27);
            setObjectHeight(41);
            this.f1513j = 1;
            this.f1514k = 1;
            this.f1506c = trees[0];
        } else if (this.f1507d == 1 || this.f1507d == 2) {
            if (i2 == -1) {
                i2 = CommonUtils.m1735a(0, 4, (int) this.GameObjectID);
            }
            if (i2 < 0 || i2 > 4) {
                throw new RuntimeException("Tree subType out of range:" + i2);
            }
            setObjectWidth(25);
            setObjectHeight(30);
            if (this.f1507d == 1) {
                this.f1506c = trees[1];
            } else {
                this.f1506c = trees[2];
            }
            this.f1513j = 0;
            this.f1514k = 30 * i2;
            if (i2 == 0) {
                this.f1515l = CommonUtils.m1741a(1.0f, 1.2f, ((int) this.GameObjectID) + 1);
            } else {
                this.f1515l = CommonUtils.m1741a(1.0f, 2.0f, ((int) this.GameObjectID) + 1);
            }
            this.f1516m = true;
        } else {
            throw new RuntimeException("Tree type:" + this.f1507d + " is not supported");
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        if (this.f1507d == 0) {
            if (this.f1510h) {
                if (this.f1512f < 4) {
                    this.f1509g += f;
                    if (this.f1509g > 5.0f) {
                        this.f1509g = 0.0f;
                        this.f1512f++;
                    }
                }
            } else if (this.f1511i != 0.0f) {
                this.f1511i = CommonUtils.toZero(this.f1511i, 0.1f * f);
                this.f1512f = 2;
            } else if (this.f1512f > 1) {
                this.f1512f = 1;
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public Rect getImageSrcRect(boolean z) {
        int i = this.f1513j;
        int i2 = this.f1514k;
        int i3 = i + (this.f1512f * (this.objectWidth + 1));
        f1593dt.set(i3, i2, i3 + this.objectWidth, i2 + this.objectHeight);
        return f1593dt;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        BitmapOrTexture m3791c = m3791c();
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.viewpointZoom < 0.15d) {
            return false;
        }
        f1586dl.m4650a(mo2967cD());
        f1586dl.m4653a(0.0f, (int) (-this.height));
        float m4641d = f1586dl.m4641d();
        float m4640e = f1586dl.m4640e();
        f1587dm.m4664a(getImageSrcRect(false));
        Graphics graphics = gameEngine.graphics;
        graphics.mo135j();
        if (this.f1515l != 1.0f) {
            graphics.mo222a(this.f1515l, this.f1515l, m4641d, m4640e);
        }
        if (this.f1516m) {
            f1587dm.m4666a(this.objectWidth, 0);
            gameEngine.graphics.mo190a(m3791c, f1587dm, f1586dl, (Paint) null);
            f1587dm.m4666a(-this.objectWidth, 0);
        }
        graphics.mo223a(mo2836d(false), m4641d, m4640e);
        graphics.mo190a(m3791c, f1587dm, f1586dl, (Paint) null);
        graphics.mo134k();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: h */
    public MovementType getMovementType() {
        return MovementType.f1643a;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: i */
    public boolean mo2676i() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: P */
    public boolean isUnderwater() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ai */
    public boolean mo2561ai() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: aj */
    public boolean mo2560aj() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: p_ */
    public boolean isOnScreen() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b_ */
    public boolean mo3195b_() {
        return false;
    }

    /* renamed from: d */
    public UnitType mo1775r() {
        return UnitType.tree;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public boolean mo3778a(Unit unit, float f) {
        if (!this.f1510h) {
            if (this.f1511i == 0.0f) {
            }
            this.hp -= (((unit.getMass() / 3000.0f) * this.maxHp) * 0.06f) * f;
            this.f1511i = 1.0f;
            this.f1557dg = 1000.0f;
            if (this.hp <= 0.0f) {
                this.direction = CommonUtils.m1659d(this.x, this.y, unit.x, unit.y) + 180.0f;
                m3789f();
            }
            if (!this.f1510h) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: f */
    public void m3789f() {
        if (!this.f1510h) {
            GameEngine game = GameEngine.getInstance();
            this.f1512f = 2;
            this.f1509g = 0.0f;
            setDrawLayer(0);
            this.collidable = false;
            this.dead = true;
            this.f1610bN = game.f5845by;
            this.f1510h = true;
            this.f1516m = false;
            for (int i = 0; i < 1; i++) {
                game.effects.m2240a();
                EffectObject effectObject = game.effects.emitEffect(this.x + CommonUtils.rnd(-12.0f, 12.0f), this.y + CommonUtils.rnd(-12.0f, 12.0f), this.height, EffectType.f4274a, false, EnumC0668h.f4399c);
                if (effectObject != null) {
                    effectObject.stripIndex = 9;
                    effectObject.frameIndex = CommonUtils.m1737a(4, 5);
                    effectObject.f4304Y = CommonUtils.rnd(-180.0f, 180.0f);
                    effectObject.f4355am = true;
                    effectObject.f4291L = 5.0f + CommonUtils.rnd(0.0f, 3.0f);
                    effectObject.f4296Q = CommonUtils.rnd(-0.05f, 0.05f) + (CommonUtils.cos(this.direction) * 0.4f);
                    effectObject.ySpeed = CommonUtils.rnd(-0.05f, 0.05f) + (CommonUtils.sin(this.direction) * 0.4f);
                    effectObject.f4335w = true;
                    effectObject.f4352x = 0.2f;
                    effectObject.f4287H = 0.4f * this.f1515l;
                    effectObject.f4286G = 0.4f * this.f1515l;
                    effectObject.timer = 90 + CommonUtils.m1737a(0, 40);
                    effectObject.startTimer = effectObject.timer;
                    effectObject.fadeOut = true;
                    effectObject.drawLayer = (short) 2;
                }
            }
            float cos = this.x + (CommonUtils.cos(this.direction) * (this.objectHeight - 5));
            float sin = this.y + (CommonUtils.sin(this.direction) * (this.objectHeight - 5));
            boolean z = true;
            for (int i2 = 0; i2 < 1; i2++) {
                game.effects.m2240a();
                EffectObject emitEffect = game.effects.emitEffect(cos + CommonUtils.rnd(-17, 17), sin + CommonUtils.rnd(-17, 17), this.height, EffectType.f4274a, false, EnumC0668h.f4399c);
                if (emitEffect != null) {
                    emitEffect.stripIndex = 9;
                    emitEffect.frameIndex = CommonUtils.m1737a(4, 5);
                    if (z) {
                        z = false;
                        emitEffect.frameIndex = 3;
                    }
                    emitEffect.f4304Y = CommonUtils.rnd(-180.0f, 180.0f);
                    emitEffect.f4355am = true;
                    if (emitEffect.frameIndex == 3) {
                        emitEffect.f4296Q = CommonUtils.rnd(-0.05f, 0.05f);
                        emitEffect.ySpeed = CommonUtils.rnd(-0.05f, 0.05f);
                        emitEffect.f4287H = 1.5f * this.f1515l;
                        emitEffect.f4286G = 2.2f * this.f1515l;
                        emitEffect.timer = 90 + CommonUtils.m1737a(0, 40);
                        emitEffect.drawLayer = (short) 2;
                    } else {
                        emitEffect.f4296Q = CommonUtils.rnd(-0.05f, 0.05f);
                        emitEffect.ySpeed = CommonUtils.rnd(-0.05f, 0.0f);
                        emitEffect.f4287H = 1.3f;
                        emitEffect.f4286G = 1.3f;
                        emitEffect.timer = 60 + CommonUtils.m1737a(0, 40);
                        emitEffect.drawLayer = (short) 1;
                    }
                    emitEffect.startTimer = emitEffect.timer;
                    emitEffect.fadeOut = true;
                }
            }
            if (this.f1507d == 1 || this.f1507d == 2) {
                this.x += CommonUtils.cos(this.direction) * ((this.objectHeight / 2) - 3);
                this.y += CommonUtils.sin(this.direction) * ((this.objectHeight / 2) - 3);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: n */
    public void mo2861n() {
        super.mo2861n();
        this.direction = CommonUtils.m1739a((this.y * 5.0f) + (this.x * 3.0f), false);
        if (this.f1507d == 0) {
            this.f1512f = ((int) ((this.y * 5.0f) + (this.x * 3.0f))) % 1;
        }
        if (this.f1507d == 1) {
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public float getHpBar() {
        return -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public float mo2681a(Unit unit, float f, Projectile projectile) {
        boolean dead = this.dead;
        float a = super.mo2681a(unit, f, projectile);
        if (!dead && this.dead && projectile != null) {
            this.direction = CommonUtils.m1659d(this.x, this.y, projectile.x, projectile.y) + 180.0f;
        }
        return a;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: q */
    public boolean mo2858q() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: t */
    public boolean mo1774t() {
        return true;
    }
}