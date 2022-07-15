package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;

/* renamed from: com.corrodinggames.rts.game.units.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o.class */
public class FogRevealer extends DummyUnit {

    /* renamed from: a */
    public int f3669a = 14;

    /* renamed from: b */
    public float f3670b = 60.0f;

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeByte(0);
        outputNetStream.writeInt(this.f3669a);
        outputNetStream.writeFloat(this.f3670b);
        super.writeOut(outputNetStream);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        inputNetStream.readByte();
        this.f3669a = inputNetStream.readInt();
        this.f3670b = inputNetStream.readFloat();
        super.mo427a(inputNetStream);
    }

    /* renamed from: b */
    public UnitType getUnitType() {
        return UnitType.fogRevealer;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine.getInstance();
    }

    public FogRevealer(boolean z) {
        super(z);
    }

    @Override // com.corrodinggames.rts.game.units.DummyUnit, com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        super.update(f);
        this.f3670b -= f;
        if (this.f3670b < 0.0f) {
            m3745cg();
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: s */
    public int mo2441s() {
        return this.f3669a;
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
}