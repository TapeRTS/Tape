package com.corrodinggames.rts.gameFramework.utility;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ac.class */
public final class C1073ac {

    /* renamed from: a */
    String f6827a;

    /* renamed from: b */
    String f6828b;

    public C1073ac(String str, String str2) {
        this.f6827a = str;
        this.f6828b = str2;
    }

    public String toString() {
        return "[" + this.f6827a + "]" + this.f6828b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C1073ac)) {
            return false;
        }
        C1073ac c1073ac = (C1073ac) obj;
        return this.f6828b.equals(c1073ac.f6828b) && this.f6827a.equals(c1073ac.f6827a);
    }

    /* renamed from: a */
    public String m644a() {
        return this.f6827a;
    }

    /* renamed from: b */
    public String m643b() {
        return this.f6828b;
    }
}
