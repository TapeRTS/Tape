package com.corrodinggames.rts.gameFramework.p031b.p032a.p033a;

import com.corrodinggames.rts.gameFramework.p031b.p032a.C0678f;
import com.corrodinggames.rts.gameFramework.p031b.p032a.EnumC0671a;

/* renamed from: com.corrodinggames.rts.gameFramework.b.a.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/a/a/b.class */
public abstract class AbstractC0673b {

    /* renamed from: a */
    private int f4237a;

    /* renamed from: b */
    private int f4238b;

    /* renamed from: c */
    private int f4239c;

    /* renamed from: d */
    private boolean f4240d = false;

    /* renamed from: a */
    public void mo2872a() {
        m2871a(null, null, null);
    }

    /* renamed from: a */
    public void m2871a(String str, String str2, EnumC0671a[] enumC0671aArr) {
        this.f4238b = C0678f.m2839a(35633, str);
        this.f4239c = C0678f.m2839a(35632, str2);
        this.f4237a = C0678f.m2840a(this.f4238b, this.f4239c, enumC0671aArr);
        this.f4240d = true;
    }

    /* renamed from: b */
    public int m2870b() {
        return this.f4237a;
    }
}
