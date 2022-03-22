package com.corrodinggames.rts.gameFramework.p032d;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.gameFramework.d.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/j.class */
public class C0627j {

    /* renamed from: a */
    String f4426a;

    /* renamed from: b */
    String f4427b;

    /* renamed from: c */
    long f4428c;

    /* renamed from: d */
    String f4429d;

    /* renamed from: e */
    public int f4430e = -1;

    /* renamed from: f */
    public int f4431f = -1;

    /* renamed from: a */
    public int m1639a() {
        return (int) (System.currentTimeMillis() - this.f4428c);
    }

    /* renamed from: b */
    public boolean m1638b() {
        if (!AbstractC0789l.m638u().mo734a() && this.f4428c + 14000 <= System.currentTimeMillis()) {
            return false;
        }
        return true;
    }
}
