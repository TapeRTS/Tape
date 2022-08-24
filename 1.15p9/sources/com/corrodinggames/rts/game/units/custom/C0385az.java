package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.az */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/az.class */
public class C0385az {

    /* renamed from: a */
    public static final C0385az f2317a = m4690a(VariableScope.nullOrMissingString);

    /* renamed from: b */
    public C0400ba[] f2318b;

    /* renamed from: c */
    public String f2319c;

    /* renamed from: d */
    public int f2320d = -1;

    /* renamed from: e */
    public String f2321e;

    /* renamed from: a */
    public static C0385az m4690a(String str) {
        C0385az c0385az = new C0385az();
        ArrayList arrayList = new ArrayList();
        C0400ba c0400ba = new C0400ba();
        c0400ba.f2485a = null;
        c0400ba.f2486b = str;
        arrayList.add(c0400ba);
        c0385az.f2318b = (C0400ba[]) arrayList.toArray(new C0400ba[0]);
        c0385az.m4688b();
        return c0385az;
    }

    /* renamed from: b */
    public static C0385az m4687b(String str) {
        C0385az c0385az = new C0385az();
        c0385az.f2321e = str;
        c0385az.m4688b();
        return c0385az;
    }

    public C0385az() {
    }

    public C0385az(C0400ba[] c0400baArr) {
        this.f2318b = c0400baArr;
    }

    /* renamed from: a */
    public boolean m4691a() {
        C0400ba[] c0400baArr;
        if (this.f2318b != null) {
            for (C0400ba c0400ba : this.f2318b) {
                if (c0400ba.f2486b != null && !VariableScope.nullOrMissingString.equals(c0400ba.f2486b)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m4689a(String str, String str2) {
        if (this.f2318b != null) {
            for (C0400ba c0400ba : this.f2318b) {
                c0400ba.m4640a(str, str2);
            }
        } else {
            GameEngine.m1139b("LocaleString: replaceAll with null strings");
        }
        this.f2320d = -1;
    }

    /* renamed from: b */
    public String m4688b() {
        C0400ba[] c0400baArr;
        C0400ba[] c0400baArr2;
        if (this.f2320d == C0820a.f5395c) {
            return this.f2319c;
        }
        if (this.f2321e != null) {
            this.f2320d = C0820a.f5395c;
            this.f2319c = C0820a.m1880a(this.f2321e, new Object[0]);
            return this.f2319c;
        }
        String m1877c = C0820a.m1877c();
        for (C0400ba c0400ba : this.f2318b) {
            if (m1877c.equals(c0400ba.f2485a)) {
                this.f2320d = C0820a.f5395c;
                this.f2319c = c0400ba.f2486b;
                return this.f2319c;
            }
        }
        for (C0400ba c0400ba2 : this.f2318b) {
            if (c0400ba2.f2485a == null) {
                this.f2320d = C0820a.f5395c;
                this.f2319c = c0400ba2.f2486b;
                return this.f2319c;
            }
        }
        this.f2320d = C0820a.f5395c;
        this.f2319c = "<NO DEFAULT TEXT FOUND>";
        return this.f2319c;
    }
}
