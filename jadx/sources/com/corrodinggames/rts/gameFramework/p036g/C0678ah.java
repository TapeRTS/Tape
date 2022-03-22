package com.corrodinggames.rts.gameFramework.p036g;

/* renamed from: com.corrodinggames.rts.gameFramework.g.ah */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/ah.class */
public class C0678ah implements Cloneable {

    /* renamed from: k */
    public boolean f4819k;

    /* renamed from: a */
    public EnumC0679ai f4809a = EnumC0679ai.skirmishMap;

    /* renamed from: b */
    public String f4810b = "[z;p10]Crossing Large (10p).tmx";

    /* renamed from: c */
    public int f4811c = 0;

    /* renamed from: d */
    public int f4812d = 2;

    /* renamed from: e */
    public boolean f4813e = true;

    /* renamed from: f */
    public int f4814f = 1;

    /* renamed from: g */
    public int f4815g = 1;

    /* renamed from: h */
    public float f4816h = 1.0f;

    /* renamed from: i */
    public boolean f4817i = false;

    /* renamed from: j */
    public boolean f4818j = false;

    /* renamed from: l */
    public boolean f4820l = false;

    /* renamed from: m */
    public boolean f4821m = false;

    /* renamed from: n */
    public boolean f4822n = true;

    /* renamed from: o */
    public boolean f4823o = false;

    /* renamed from: a */
    public void m1175a() {
        this.f4809a = EnumC0679ai.skirmishMap;
        this.f4810b = "[z;p10]Crossing Large (10p).tmx";
    }

    /* renamed from: b */
    public String m1172b() {
        return ((((((((("startingCredits: " + this.f4811c + "\n") + "fogMode: " + this.f4812d + "\n") + "revealedMap: " + this.f4813e + "\n") + "aiDifficulty: " + this.f4814f + "\n") + "startingUnits: " + this.f4815g + "\n") + "incomeMultiplier: " + this.f4816h + "\n") + "noNukes: " + this.f4817i + "\n") + "sharedControl: " + this.f4819k + "\n") + "allowSpectators: " + this.f4822n + "\n") + "lockedRoom: " + this.f4823o + "\n";
    }

    /* renamed from: c */
    public C0678ah clone() {
        try {
            return (C0678ah) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public void m1174a(C0690ap apVar) {
        apVar.mo1130c(3);
        apVar.mo1095a(this.f4812d);
        apVar.mo1095a(this.f4811c);
        apVar.mo1090a(this.f4813e);
        apVar.mo1095a(this.f4814f);
        apVar.mo1095a(this.f4815g);
        apVar.mo1096a(this.f4816h);
        apVar.mo1090a(this.f4817i);
        apVar.mo1090a(this.f4818j);
        apVar.mo1090a(this.f4819k);
        apVar.mo1090a(this.f4820l);
        apVar.mo1090a(this.f4821m);
        apVar.mo1090a(this.f4822n);
        apVar.mo1090a(this.f4823o);
    }

    /* renamed from: a */
    public void m1173a(C0707k kVar) {
        byte d = kVar.m1065d();
        this.f4812d = kVar.m1062f();
        this.f4811c = kVar.m1062f();
        this.f4813e = kVar.m1063e();
        this.f4814f = kVar.m1062f();
        this.f4815g = kVar.m1062f();
        this.f4816h = kVar.m1061g();
        this.f4817i = kVar.m1063e();
        this.f4818j = kVar.m1063e();
        this.f4819k = kVar.m1063e();
        if (d >= 1) {
            this.f4820l = kVar.m1063e();
        }
        if (d >= 2) {
            this.f4821m = kVar.m1063e();
        }
        if (d >= 3) {
            this.f4822n = kVar.m1063e();
            this.f4823o = kVar.m1063e();
        }
    }
}
