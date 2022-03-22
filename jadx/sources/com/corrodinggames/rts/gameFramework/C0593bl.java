package com.corrodinggames.rts.gameFramework;

/* renamed from: com.corrodinggames.rts.gameFramework.bl */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/bl.class */
public class C0593bl {

    /* renamed from: a */
    boolean f4078a;

    /* renamed from: b */
    int f4079b;

    /* renamed from: c */
    double f4080c;

    /* renamed from: d */
    double f4081d;

    /* renamed from: e */
    long f4082e;

    /* renamed from: f */
    String f4083f;

    public C0593bl(String str) {
        this.f4078a = true;
        this.f4083f = str;
    }

    public C0593bl(String str, boolean z) {
        this.f4078a = true;
        this.f4083f = str;
        this.f4078a = z;
    }

    /* renamed from: a */
    public void m1908a() {
        if (this.f4078a) {
            if (this.f4082e != 0) {
                this.f4082e = Long.MIN_VALUE;
            } else {
                this.f4082e = C0586bj.m1919a();
            }
        }
    }

    /* renamed from: b */
    public void m1907b() {
        if (this.f4078a) {
            double a = C0586bj.m1916a(this.f4082e, C0586bj.m1919a());
            this.f4080c += a;
            this.f4079b++;
            if (a > this.f4081d) {
                this.f4081d = a;
            }
            this.f4082e = 0L;
        }
    }

    /* renamed from: c */
    public String m1906c() {
        String str;
        if (!this.f4078a) {
            return "{ Not enabled }";
        }
        if (this.f4079b > 0) {
            str = ((("{ #" + this.f4079b + " = ") + "peak:" + C0654f.m1524a(this.f4081d, 2) + "ms ") + "avg:" + C0654f.m1524a(this.f4080c / this.f4079b, 2) + "ms ") + "total:" + C0654f.m1524a(this.f4080c, 2) + "ms ";
        } else {
            str = "{ #0 = NA";
        }
        return str + "}";
    }

    /* renamed from: d */
    public void m1905d() {
        if (this.f4078a) {
            m1907b();
            m1904e();
        }
    }

    /* renamed from: e */
    public void m1904e() {
        if (this.f4078a && this.f4079b > 0) {
            AbstractC0789l.m670d(AbstractC0789l.m715a(this.f4083f + " - " + m1906c(), "\u001b[36m"));
            m1903f();
        }
    }

    /* renamed from: f */
    public void m1903f() {
        this.f4079b = 0;
        this.f4080c = 0.0d;
        this.f4081d = 0.0d;
    }
}
