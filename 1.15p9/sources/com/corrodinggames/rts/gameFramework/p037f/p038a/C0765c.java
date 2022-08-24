package com.corrodinggames.rts.gameFramework.p037f.p038a;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/c.class */
public class C0765c {

    /* renamed from: a */
    public int f5000a;

    /* renamed from: b */
    public int f5001b;

    /* renamed from: c */
    public EnumC0766d f5002c;

    /* renamed from: d */
    public int f5003d = -1;

    /* renamed from: a */
    public static C0765c m2172a(int i, int i2) {
        C0765c c0765c = new C0765c();
        c0765c.f5000a = i;
        c0765c.f5001b = i2;
        c0765c.f5002c = EnumC0766d.mouseClick;
        c0765c.f5003d = 1;
        return c0765c;
    }

    /* renamed from: b */
    public static C0765c m2170b(int i, int i2) {
        C0765c c0765c = new C0765c();
        c0765c.f5000a = i;
        c0765c.f5001b = i2;
        c0765c.f5002c = EnumC0766d.mouseMove;
        c0765c.f5003d = 1;
        return c0765c;
    }

    /* renamed from: a */
    public boolean m2173a() {
        return this.f5002c == EnumC0766d.mouseClick;
    }

    /* renamed from: b */
    public boolean m2171b() {
        return this.f5002c == EnumC0766d.mouseMove;
    }
}
