package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.i.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/ah.class */
public class C0845ah implements Cloneable {

    /* renamed from: l */
    public boolean f5646l;

    /* renamed from: q */
    public int f5647q;

    /* renamed from: a */
    public EnumC0846ai f5648a = EnumC0846ai.skirmishMap;

    /* renamed from: b */
    public String f5649b = "[z;p10]Crossing Large (10p).tmx";

    /* renamed from: c */
    public int f5650c = 0;

    /* renamed from: d */
    public int f5651d = 2;

    /* renamed from: e */
    public boolean f5652e = true;

    /* renamed from: f */
    public int f5653f = 1;

    /* renamed from: g */
    public int f5654g = 1;

    /* renamed from: h */
    public float f5655h = 1.0f;

    /* renamed from: i */
    public boolean f5656i = false;

    /* renamed from: j */
    public boolean f5657j = false;

    /* renamed from: k */
    public boolean f5658k = false;

    /* renamed from: m */
    public boolean f5659m = false;

    /* renamed from: n */
    public boolean f5660n = false;

    /* renamed from: o */
    public boolean f5661o = true;

    /* renamed from: p */
    public boolean f5662p = false;

    /* renamed from: a */
    public void m1596a() {
        this.f5648a = EnumC0846ai.skirmishMap;
        this.f5649b = "[z;p10]Crossing Large (10p).tmx";
    }

    /* renamed from: b */
    public String m1593b() {
        return ((((((((((VariableScope.nullOrMissingString + "startingCredits: " + this.f5650c + "\n") + "fogMode: " + this.f5651d + "\n") + "revealedMap: " + this.f5652e + "\n") + "aiDifficulty: " + this.f5653f + "\n") + "startingUnits: " + this.f5654g + "\n") + "incomeMultiplier: " + this.f5655h + "\n") + "noNukes: " + this.f5656i + "\n") + "sharedControl: " + this.f5646l + "\n") + "allowSpectators: " + this.f5661o + "\n") + "lockedRoom: " + this.f5662p + "\n") + "randomSeed: " + this.f5647q + "\n";
    }

    /* renamed from: c */
    public C0845ah clone() {
        try {
            return (C0845ah) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m1595a(C0859ar c0859ar) {
        c0859ar.m1548c(4);
        c0859ar.mo1481a(this.f5651d);
        c0859ar.mo1481a(this.f5650c);
        c0859ar.mo1476a(this.f5652e);
        c0859ar.mo1481a(this.f5653f);
        c0859ar.mo1481a(this.f5654g);
        c0859ar.mo1482a(this.f5655h);
        c0859ar.mo1476a(this.f5656i);
        c0859ar.mo1476a(this.f5657j);
        c0859ar.mo1476a(this.f5646l);
        c0859ar.mo1476a(this.f5659m);
        c0859ar.mo1476a(this.f5660n);
        c0859ar.mo1476a(this.f5661o);
        c0859ar.mo1476a(this.f5662p);
        c0859ar.mo1481a(this.f5647q);
    }

    /* renamed from: a */
    public void m1594a(C0876k c0876k) {
        byte m1451d = c0876k.m1451d();
        this.f5651d = c0876k.m1448f();
        this.f5650c = c0876k.m1448f();
        this.f5652e = c0876k.m1449e();
        this.f5653f = c0876k.m1448f();
        this.f5654g = c0876k.m1448f();
        this.f5655h = c0876k.m1447g();
        this.f5656i = c0876k.m1449e();
        this.f5657j = c0876k.m1449e();
        this.f5646l = c0876k.m1449e();
        if (m1451d >= 1) {
            this.f5659m = c0876k.m1449e();
        }
        if (m1451d >= 2) {
            this.f5660n = c0876k.m1449e();
        }
        if (m1451d >= 3) {
            this.f5661o = c0876k.m1449e();
            this.f5662p = c0876k.m1449e();
        }
        if (m1451d >= 4) {
            this.f5647q = c0876k.m1448f();
        }
    }
}
