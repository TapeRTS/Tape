package com.corrodinggames.rts.game.ai;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.CommonUtils;
/* loaded from: classes.jar:com/corrodinggames/rts/game/ai/Zone.class */
public class Zone {
    private final AI ai;
    public float radius;
    public float x;
    public float y;

    public Zone(AI ai) {
        this.ai = ai;
        this.ai.zones.add(this);
        this.ai.fastZones.add(this);
    }

    public Zone(AI ai, float f, float f2) {
        this(ai);
        this.x = f;
        this.y = f2;
    }

    public void clear() {
        this.x = 0.0f;
        this.y = 0.0f;
        this.radius = 0.0f;
    }

    public float getDisSq(Base base) {
        return CommonUtils.distanceSq(this.x, this.y, base.x, base.y);
    }

    public float getDisSq(Unit unit) {
        return CommonUtils.distanceSq(this.x, this.y, unit.x, unit.y);
    }

    public PointF getRandomPoint() {
        PointF pointF = new PointF();
        float random = (float) (Math.random() * 360.0d);
        float random2 = (float) (Math.random() * this.radius);
        pointF.set((float) (this.x + (Math.cos(Math.toRadians(random)) * random2)), (float) (this.y + (Math.sin(Math.toRadians(random)) * random2)));
        return pointF;
    }

    public boolean isNear(Unit unit) {
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, unit.x, unit.y);
        float f = this.radius + unit.radius + 150.0f;
        return distanceSq < f * f;
    }

    public boolean isOverlapping(float f, float f2) {
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, f, f2);
        float f3 = this.radius;
        return distanceSq < f3 * f3;
    }

    public boolean isOverlapping(Unit unit) {
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, unit.x, unit.y);
        float f = this.radius + unit.radius;
        return distanceSq < f * f;
    }

    public void remove() {
        this.ai.zones.remove(this);
        this.ai.fastZones.remove(this);
    }
}
