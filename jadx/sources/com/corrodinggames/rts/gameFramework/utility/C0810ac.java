package com.corrodinggames.rts.gameFramework.utility;

/* renamed from: com.corrodinggames.rts.gameFramework.utility.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/ac.class */
public final class C0810ac {

    /* renamed from: a */
    String f5725a;

    /* renamed from: b */
    String f5726b;

    public C0810ac(String str, String str2) {
        this.f5725a = str;
        this.f5726b = str2;
    }

    public String toString() {
        return "[" + this.f5725a + "]" + this.f5726b;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof C0810ac)) {
            return false;
        }
        C0810ac acVar = (C0810ac) obj;
        return this.f5726b.equals(acVar.f5726b) && this.f5725a.equals(acVar.f5725a);
    }

    /* renamed from: a */
    public String m552a() {
        return this.f5725a;
    }

    /* renamed from: b */
    public String m551b() {
        return this.f5726b;
    }
}
