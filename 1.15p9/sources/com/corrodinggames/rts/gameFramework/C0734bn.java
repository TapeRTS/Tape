package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.bn */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bn.class */
public class C0734bn {

    /* renamed from: a */
    boolean f4603a;

    /* renamed from: b */
    int f4604b;

    /* renamed from: c */
    double f4605c;

    /* renamed from: d */
    double f4606d;

    /* renamed from: e */
    long f4607e;

    /* renamed from: f */
    String f4608f;

    public C0734bn(String str) {
        this.f4603a = true;
        this.f4608f = str;
    }

    public C0734bn(String str, boolean z) {
        this.f4603a = true;
        this.f4608f = str;
        this.f4603a = z;
    }

    /* renamed from: a */
    public void m2601a() {
        if (!this.f4603a) {
            return;
        }
        if (this.f4607e != 0) {
            this.f4607e = Long.MIN_VALUE;
        } else {
            this.f4607e = C0727bl.m2612a();
        }
    }

    /* renamed from: b */
    public void m2600b() {
        if (!this.f4603a) {
            return;
        }
        double m2609a = C0727bl.m2609a(this.f4607e, C0727bl.m2612a());
        this.f4605c += m2609a;
        this.f4604b++;
        if (m2609a > this.f4606d) {
            this.f4606d = m2609a;
        }
        this.f4607e = 0L;
    }

    /* renamed from: c */
    public String m2599c() {
        String str;
        if (!this.f4603a) {
            return "{ Not enabled }";
        }
        if (this.f4604b > 0) {
            str = ((("{ #" + this.f4604b + " = ") + "peak:" + CommonUtils.m2370a(this.f4606d, 2) + "ms ") + "avg:" + CommonUtils.m2370a(this.f4605c / this.f4604b, 2) + "ms ") + "total:" + CommonUtils.m2370a(this.f4605c, 2) + "ms ";
        } else {
            str = "{ #0 = NA";
        }
        return str + "}";
    }

    /* renamed from: d */
    public void m2598d() {
        if (!this.f4603a) {
            return;
        }
        m2600b();
        m2597e();
    }

    /* renamed from: e */
    public void m2597e() {
        if (this.f4603a && this.f4604b > 0) {
            GameEngine.PrintLog(GameEngine.m1189a(this.f4608f + " - " + m2599c(), "\u001b[36m"));
            m2596f();
        }
    }

    /* renamed from: f */
    public void m2596f() {
        this.f4604b = 0;
        this.f4605c = 0.0d;
        this.f4606d = 0.0d;
    }
}
