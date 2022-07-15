package com.corrodinggames.rts.game.units;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.game.map.MapTile;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;

/* renamed from: com.corrodinggames.rts.game.units.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ac.class */
public class Fire extends AbstractC0581p {

    /* renamed from: b */
    BitmapOrTexture f1483b;

    /* renamed from: c */
    int type;

    /* renamed from: e */
    float f1485e;

    /* renamed from: f */
    float f1486f;

    /* renamed from: i */
    float f1487i;

    /* renamed from: j */
    float f1488j;

    /* renamed from: l */
    float f1489l;

    /* renamed from: m */
    float f1490m;

    /* renamed from: n */
    float f1491n;

    /* renamed from: q */
    float f1492q;

    /* renamed from: r */
    boolean f1493r;

    /* renamed from: a */
    static BitmapOrTexture[] fire = new BitmapOrTexture[2];

    /* renamed from: s */
    static Point f1481s = new Point();

    /* renamed from: t */
    public static C0229ad f1482t = new C0229ad();

    /* renamed from: d */
    int f1494d = 0;

    /* renamed from: g */
    int f1495g = 0;

    /* renamed from: h */
    int f1496h = 0;

    /* renamed from: k */
    boolean f1497k = false;

    /* renamed from: u */
    Rect f1498u = new Rect();

    /* renamed from: o */
    float f1499o = 0.05f;

    /* renamed from: p */
    float f1500p = 120.0f;

    /* renamed from: b */
    public static void load() {
        fire[0] = GameEngine.getInstance().graphics.loadImage(R.drawable.fire);
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeInt(this.type);
        outputNetStream.writeInt(this.f1494d);
        outputNetStream.writeFloat(this.f1485e);
        outputNetStream.writeByte(0);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        this.type = inputNetStream.readInt();
        this.f1494d = inputNetStream.readInt();
        this.f1485e = inputNetStream.readFloat();
        inputNetStream.readByte();
        super.mo427a(inputNetStream);
    }

    /* renamed from: c */
    public BitmapOrTexture m3798c() {
        return this.f1483b;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        return false;
    }

    public Fire(boolean z) {
        super(z);
        m3801a(0);
        this.radius = 20.0f;
        this.displayRadius = this.radius + 1.0f;
        this.maxHp = 100.0f;
        this.hp = this.maxHp;
        this.direction = -90.0f;
        this.collidable = false;
        setDrawLayer(3);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c_ */
    public void mo2680c_() {
        this.collidable = false;
    }

    /* renamed from: a */
    public void m3801a(int i) {
        this.type = i;
        if (this.type == 0) {
            setObjectWidth(20);
            setObjectHeight(20);
            this.f1495g = 0;
            this.f1496h = 0;
            this.f1483b = fire[0];
            return;
        }
        throw new RuntimeException("Fire type:" + this.type + " is not supported");
    }

    /* renamed from: d */
    public void m3797d() {
        this.f1497k = true;
        this.f1487i = CommonUtils.m1722a((GameObject) this, -5, 5, 1);
        this.f1488j = CommonUtils.m1722a((GameObject) this, -5, 5, 2);
        this.f1485e = CommonUtils.m1722a((GameObject) this, 1, 10, 3);
        this.f1494d = CommonUtils.m1722a((GameObject) this, 0, 2, 4);
        this.f1486f = CommonUtils.m1722a((GameObject) this, 7, 13, 5);
        GameEngine gameEngine = GameEngine.getInstance();
        Map map = gameEngine.map;
        gameEngine.map.m4168a(this.x, this.y);
        int i = gameEngine.map.returnX;
        int i2 = gameEngine.map.returnY;
        if (!map.isInMap(i, i2)) {
            this.f1489l = 0.0f;
            this.f1490m = 0.0f;
            this.f1491n = 2.0f;
            return;
        }
        MapTile tiles = gameEngine.map.mainLayer.tiles(i, i2);
        boolean z = false;
        if (tiles.water || tiles.cliff || tiles.largeCliff || tiles.waterBridge) {
            z = true;
        }
        if (z) {
            this.f1489l = 0.0f;
            this.f1490m = 0.0f;
            this.f1491n = 2.0f;
            return;
        }
        this.f1489l = 5.0E-4f;
        this.f1490m = 1.0f;
        this.f1491n = 0.3f;
        this.f1499o += CommonUtils.m1722a((GameObject) this, 0, 10, 10) / 1000.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        if (!this.f1497k) {
            m3797d();
        }
        if (this.f1499o < this.f1490m) {
            this.f1499o += this.f1489l * f;
            if (this.f1499o > this.f1490m) {
                this.f1499o = this.f1490m;
            }
        }
        if (this.f1499o > this.f1491n) {
            this.f1492q = (float) (this.f1492q + (0.01d * f));
            if ((!this.f1493r && this.f1492q > 1.0f) || this.f1492q > 8.0f) {
                this.f1492q = CommonUtils.m1722a((GameObject) this, 0, 10, 10) / 1000.0f;
                m3796f();
            }
        }
        this.f1485e += f;
        if (this.f1485e > 10.0f) {
            this.f1485e = 0.0f;
            this.f1494d++;
            if (this.f1494d > 3) {
                this.f1494d = 0;
            }
        }
        if (this.f1499o < 0.0f) {
            mo2502bu();
        }
    }

    /* renamed from: f */
    public void m3796f() {
        this.f1493r = true;
        m3799b(-1, -1);
        m3799b(0, -1);
        m3799b(1, -1);
        m3799b(-1, 0);
        m3799b(1, 0);
        m3799b(-1, 1);
        m3799b(0, 1);
        m3799b(1, 1);
    }

    /* renamed from: b */
    public void m3799b(int i, int i2) {
        GameEngine game = GameEngine.getInstance();
        float f = (int) (this.x + (i * game.map.pixel_Width));
        float f2 = (int) (this.y + (i2 * game.map.pixel_Height));
        if (m3802a(f, f2) == null) {
            Fire fire2 = new Fire(false);
            fire2.x = f;
            fire2.y = f2;
            fire2.mo2537b(this.team);
            game.UnitGeoIndex.m2781a(fire2);
            Team.m3924c(fire2);
            this.f1493r = false;
        }
    }

    /* renamed from: a */
    public static Fire m3802a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        f1482t.m3794a(f, f2);
        gameEngine.UnitGeoIndex.m2786a(f, f2, 30.0f, null, 1.0f, f1482t);
        return f1482t.f1503c;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public Rect getImageSrcRect(boolean z) {
        int i = this.f1495g;
        int i2 = this.f1496h;
        int i3 = i + (this.f1494d * this.objectWidth);
        f1593dt.set(i3, i2, i3 + this.objectWidth, i2 + this.objectHeight);
        return f1593dt;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        BitmapOrTexture m3798c = m3798c();
        GameEngine gameEngine = GameEngine.getInstance();
        f1586dl.m4650a(mo2967cD());
        f1586dl.m4653a(0.0f, (int) (-this.height));
        f1586dl.m4653a(this.f1487i, this.f1488j);
        f1587dm.m4664a(getImageSrcRect(false));
        gameEngine.graphics.mo135j();
        float m4641d = f1586dl.m4641d();
        float m4640e = f1586dl.m4640e();
        gameEngine.graphics.mo223a(mo2836d(false), m4641d, m4640e);
        gameEngine.graphics.mo222a(this.f1499o * 2.7f, this.f1499o * 2.7f, m4641d, m4640e);
        gameEngine.graphics.mo190a(m3798c, f1587dm, f1586dl, (Paint) null);
        gameEngine.graphics.mo134k();
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
    /* renamed from: aj */
    public boolean mo2560aj() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ai */
    public boolean mo2561ai() {
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

    /* renamed from: m */
    public UnitType mo1775r() {
        return UnitType.spreadingFire;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: n */
    public void mo2861n() {
        super.mo2861n();
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
    /* renamed from: O */
    public boolean mo2683O() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public float mo2681a(Unit unit, float f, Projectile projectile) {
        this.f1499o -= f / 100.0f;
        return super.mo2681a(unit, 0.0f, projectile);
    }
}