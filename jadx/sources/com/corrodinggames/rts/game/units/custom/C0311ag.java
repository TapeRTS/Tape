package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.ag */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ag.class */
public class C0311ag {

    /* renamed from: a */
    public static final C0311ag f2051a = m3102a("");

    /* renamed from: b */
    public C0312ah[] f2052b;

    /* renamed from: c */
    public String f2053c;

    /* renamed from: d */
    public int f2054d = -1;

    /* renamed from: e */
    public String f2055e;

    /* renamed from: a */
    public static C0311ag m3102a(String str) {
        C0311ag agVar = new C0311ag();
        ArrayList arrayList = new ArrayList();
        C0312ah ahVar = new C0312ah();
        ahVar.f2056a = null;
        ahVar.f2057b = str;
        arrayList.add(ahVar);
        agVar.f2052b = (C0312ah[]) arrayList.toArray(new C0312ah[0]);
        agVar.m3100b();
        return agVar;
    }

    public C0311ag() {
    }

    public C0311ag(C0312ah[] ahVarArr) {
        this.f2052b = ahVarArr;
    }

    /* renamed from: a */
    public boolean m3103a() {
        C0312ah[] ahVarArr;
        if (this.f2052b == null) {
            return true;
        }
        for (C0312ah ahVar : this.f2052b) {
            if (!(ahVar.f2057b == null || "".equals(ahVar.f2057b))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: a */
    public void m3101a(String str, String str2) {
        if (this.f2052b != null) {
            for (C0312ah ahVar : this.f2052b) {
                ahVar.m3099a(str, str2);
            }
        } else {
            AbstractC0789l.m682b("LocaleString: replaceAll with null strings");
        }
        this.f2054d = -1;
    }

    /* renamed from: b */
    public String m3100b() {
        C0312ah[] ahVarArr;
        C0312ah[] ahVarArr2;
        if (this.f2054d == C0652a.f4580c) {
            return this.f2053c;
        }
        if (this.f2055e != null) {
            this.f2054d = C0652a.f4580c;
            this.f2053c = C0652a.m1536a(this.f2055e, new Object[0]);
            return this.f2053c;
        }
        String c = C0652a.m1533c();
        for (C0312ah ahVar : this.f2052b) {
            if (c.equals(ahVar.f2056a)) {
                this.f2054d = C0652a.f4580c;
                this.f2053c = ahVar.f2057b;
                return this.f2053c;
            }
        }
        for (C0312ah ahVar2 : this.f2052b) {
            if (ahVar2.f2056a == null) {
                this.f2054d = C0652a.f4580c;
                this.f2053c = ahVar2.f2057b;
                return this.f2053c;
            }
        }
        return "<NO DEFAULT TEXT FOUND>";
    }
}
