package com.corrodinggames.rts.gameFramework.p032d.p033a;

/* renamed from: com.corrodinggames.rts.gameFramework.d.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/a/c.class */
public class C0604c {

    /* renamed from: a */
    public int f4202a;

    /* renamed from: b */
    public int f4203b;

    /* renamed from: c */
    public EnumC0605d f4204c;

    /* renamed from: d */
    public int f4205d = -1;

    /* renamed from: a */
    public static C0604c m1815a(int i, int i2) {
        C0604c cVar = new C0604c();
        cVar.f4202a = i;
        cVar.f4203b = i2;
        cVar.f4204c = EnumC0605d.mouseClick;
        cVar.f4205d = 1;
        return cVar;
    }

    /* renamed from: b */
    public static C0604c m1813b(int i, int i2) {
        C0604c cVar = new C0604c();
        cVar.f4202a = i;
        cVar.f4203b = i2;
        cVar.f4204c = EnumC0605d.mouseMove;
        cVar.f4205d = 1;
        return cVar;
    }

    /* renamed from: a */
    public boolean m1816a() {
        return this.f4204c == EnumC0605d.mouseClick;
    }

    /* renamed from: b */
    public boolean m1814b() {
        return this.f4204c == EnumC0605d.mouseMove;
    }
}
