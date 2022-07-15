package com.corrodinggames.rts.game.units;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.draw.C0853s;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.effect.EffectType;
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/f.class */
public class ZoneMarkerOrDamagingBorder extends DummyUnit {

    /* renamed from: e */
    public float f3502e;

    /* renamed from: f */
    public float f3503f;

    /* renamed from: i */
    public boolean f3504i;

    /* renamed from: j */
    public float f3505j;

    /* renamed from: q */
    boolean isZoneMarker;

    /* renamed from: k */
    static Paint f3507k = new Paint();

    /* renamed from: m */
    static Paint f3508m = new Paint();

    /* renamed from: l */
    static Paint f3509l = new Paint();

    /* renamed from: n */
    static Paint f3510n = new Paint();

    /* renamed from: o */
    static Paint f3511o = new Paint();

    /* renamed from: p */
    static Paint f3512p = new Paint(f3511o);

    /* renamed from: r */
    static final PointF f3513r = new PointF();

    /* renamed from: a */
    public float f3514a = 2000.0f;

    /* renamed from: b */
    public float f3515b = 0.0f;

    /* renamed from: c */
    public float f3516c = 0.0f;

    /* renamed from: d */
    public float f3517d = 2000.0f;

    /* renamed from: g */
    public boolean f3518g = true;

    /* renamed from: h */
    public float f3519h = 1.0f;

    static {
        f3507k.setStrokeWidth(10.0f);
        f3507k.setColor(Color.argb(100, 160, 0, 0));
        f3507k.setStyle(Paint.Style.f217b);
        f3508m.m4711a(f3507k);
        f3508m.setColor(Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3509l.setStrokeWidth(2.0f);
        f3509l.setColor(Color.argb(100, 160, 0, 0));
        f3509l.setStyle(Paint.Style.f217b);
        f3510n.m4711a(f3509l);
        f3510n.setColor(Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, 160, 0, 0));
        f3511o.setStrokeWidth(2.0f);
        f3511o.setColor(Color.argb(50, 255, 255, 255));
        f3511o.setStyle(Paint.Style.f217b);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeByte(0);
        outputNetStream.writeFloat(this.f3514a);
        outputNetStream.writeFloat(this.f3515b);
        outputNetStream.writeFloat(this.f3516c);
        outputNetStream.writeFloat(this.f3517d);
        outputNetStream.writeFloat(this.f3502e);
        outputNetStream.writeFloat(this.f3503f);
        outputNetStream.writeBoolean(this.f3518g);
        outputNetStream.writeFloat(this.f3519h);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        inputNetStream.readByte();
        this.f3514a = inputNetStream.readFloat();
        this.f3515b = inputNetStream.readFloat();
        this.f3516c = inputNetStream.readFloat();
        this.f3517d = inputNetStream.readFloat();
        this.f3502e = inputNetStream.readFloat();
        this.f3503f = inputNetStream.readFloat();
        this.f3518g = inputNetStream.readBoolean();
        this.f3519h = inputNetStream.readFloat();
        super.mo427a(inputNetStream);
        if (!this.dead) {
            GameEngine.getInstance().f5836bW.m1796a(this);
        }
    }

    /* renamed from: b */
    public UnitType getUnitType() {
        if (this.isZoneMarker) {
            return UnitType.zoneMarker;
        }
        return UnitType.damagingBorder;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine.getInstance();
    }

    public ZoneMarkerOrDamagingBorder(boolean z) {
        super(z);
    }

    /* renamed from: f */
    public ZoneMarkerOrDamagingBorder m2795f() {
        Iterator it = Unit.m3767bE().iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if ((unit instanceof ZoneMarkerOrDamagingBorder) && !unit.dead && unit != this) {
                ZoneMarkerOrDamagingBorder zoneMarkerOrDamagingBorder = (ZoneMarkerOrDamagingBorder) unit;
                if (zoneMarkerOrDamagingBorder.isZoneMarker == this.isZoneMarker) {
                    return zoneMarkerOrDamagingBorder;
                }
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.DummyUnit, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (this.dead) {
            return;
        }
        if (this.f3518g) {
            this.f3518g = false;
            ZoneMarkerOrDamagingBorder m2795f = m2795f();
            if (m2795f != null) {
                m2795f.f3502e = this.x;
                m2795f.f3503f = this.y;
                m2795f.f3517d = this.f3517d;
                m3745cg();
            } else {
                this.f3502e = this.x;
                this.f3503f = this.y;
                if (!this.isZoneMarker) {
                    GameEngine.PrintLOG("DamagingBorder created " + this.f3502e + "," + this.f3503f + " size:" + this.f3517d);
                }
                GameEngine.getInstance().f5836bW.m1796a(this);
            }
        }
        if (this.isZoneMarker) {
            this.f3514a = this.f3517d;
            this.x = this.f3502e;
            this.y = this.f3503f;
        } else if (this.f3514a > this.f3517d) {
            this.f3515b += 2.5E-4f * f;
            this.f3514a -= this.f3515b;
            this.f3504i = true;
            float m1691b = CommonUtils.m1691b(this.x, this.y, this.f3502e, this.f3503f);
            float m1659d = CommonUtils.m1659d(this.x, this.y, this.f3502e, this.f3503f);
            if (m1691b > 1.0f) {
                float f2 = this.f3515b;
                if (f2 > m1691b * f) {
                    f2 = m1691b * f;
                }
                this.x += f2 * CommonUtils.cos(m1659d) * f;
                this.y += f2 * CommonUtils.sin(m1659d) * f;
            }
        } else {
            this.f3504i = false;
            this.x = (float) (this.x + ((this.f3502e - this.x) * 0.003d * f));
            this.y = (float) (this.y + ((this.f3503f - this.y) * 0.003d * f));
        }
        if (this.f3514a < this.f3517d) {
            this.f3514a = this.f3517d;
            this.f3515b = 0.0f;
        }
        if (this.f3517d < 0.0f) {
            m3745cg();
            return;
        }
        this.f3516c -= f;
        if (!this.dead && this.f3516c <= 0.0f && !this.isZoneMarker) {
            this.f3516c = 2.0f;
            float cos = this.f3514a * CommonUtils.cos(45.0f);
            float f3 = this.x - cos;
            float f4 = this.x + cos;
            float f5 = this.y - cos;
            float f6 = this.y + cos;
            float f7 = this.f3514a * this.f3514a;
            Iterator it = Unit.m3767bE().iterator();
            while (it.hasNext()) {
                Unit unit = (Unit) it.next();
                if (unit.x <= f3 || unit.x >= f4 || unit.y <= f5 || unit.y >= f6) {
                    if (CommonUtils.distanceSq(this.x, this.y, unit.x, unit.y) >= f7 && !unit.dead && !(unit instanceof Tree) && !unit.mo1773u() && unit.transportedBy == null) {
                        unit.mo2681a(this, (0.5f + (unit.hp * 0.002f) + (unit.maxHp * 0.001f)) * this.f3519h, (Projectile) null);
                    }
                }
            }
        }
        if (!this.isZoneMarker) {
            GameEngine gameEngine = GameEngine.getInstance();
            this.f3505j += f;
            if (this.f3505j > 3.0f) {
                this.f3505j = 0.0f;
                int m1737a = gameEngine.f5878ct + CommonUtils.m1737a(0, (int) gameEngine.f5884cz);
                int m1737a2 = gameEngine.f5879cu + CommonUtils.m1737a(0, (int) gameEngine.f5847cA);
                if (CommonUtils.distanceSq(this.x, this.y, m1737a, m1737a2) > (this.f3514a + 30.0f) * (this.f3514a + 30.0f)) {
                    gameEngine.map.m4168a(m1737a, m1737a2);
                    gameEngine.map.fromGrid(gameEngine.map.returnX, gameEngine.map.returnY);
                    EffectObject emitEffect = gameEngine.effects.emitEffect(gameEngine.map.returnX + 10, (gameEngine.map.returnY - 10) + 10, 0.0f, EffectType.f4274a, true, EnumC0668h.f4397a);
                    if (emitEffect != null) {
                        emitEffect.stripIndex = 19;
                        emitEffect.f4304Y = CommonUtils.rnd(-180.0f, 180.0f);
                        emitEffect.fadeOut = true;
                        emitEffect.drawLayer = (short) 1;
                        emitEffect.startingAlpha = 0.7f;
                        emitEffect.timer = 30.0f;
                        emitEffect.startTimer = emitEffect.timer;
                        emitEffect.f4287H = 0.2f;
                        emitEffect.f4286G = 1.2f;
                        emitEffect.f4336y = Color.argb(255, 173, 12, 12);
                    }
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: s */
    public int mo2441s() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: t */
    public boolean mo1774t() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.DummyUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: u */
    public boolean mo1773u() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public boolean mo426a(GameEngine gameEngine) {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.DummyUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo431a(float f, boolean z) {
        ZoneMarkerOrDamagingBorder m2795f;
        GameEngine gameEngine = GameEngine.getInstance();
        float f2 = this.x - gameEngine.viewpointX_rounded;
        float f3 = this.y - gameEngine.viewpointY_rounded;
        Paint paint = this.f3504i ? f3508m : f3507k;
        if (this.isZoneMarker) {
            paint = f3511o;
        }
        float f4 = this.f3514a;
        if (this.f3518g && (m2795f = m2795f()) != null) {
            f4 = m2795f.f3517d - 300.0f;
        }
        gameEngine.graphics.mo219a(f2, f3, f4, paint);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public boolean mo2798a(int i, int i2) {
        GameEngine gameEngine = GameEngine.getInstance();
        gameEngine.graphics.mo137h();
        gameEngine.graphics.mo204a(gameEngine.f5836bW.f4864w);
        float m1792b = gameEngine.f5836bW.m1792b(this.f3514a);
        Paint paint = this.f3504i ? f3510n : f3509l;
        if (this.isZoneMarker) {
            paint = f3512p;
        }
        C0853s.m969a(gameEngine.graphics, i, i2, m1792b, paint);
        gameEngine.graphics.mo136i();
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void upgrade(int i) {
        this.f3514a = i * 100;
        this.f3517d = i * 100;
    }

    /* renamed from: a */
    public boolean m2800a(float f, float f2) {
        return CommonUtils.distanceSq(this.f3502e, this.f3503f, f, f2) >= this.f3517d * this.f3517d;
    }

    /* renamed from: a */
    public PointF m2799a(float f, float f2, float f3) {
        if (f3 > this.f3517d) {
            f3 = this.f3517d;
        }
        float m1659d = CommonUtils.m1659d(this.x, this.y, f, f2);
        float f4 = this.f3517d - f3;
        float cos = this.x + (CommonUtils.cos(m1659d) * f4);
        float sin = this.y + (CommonUtils.sin(m1659d) * f4);
        f3513r.x = cos;
        f3513r.y = sin;
        return f3513r;
    }
}