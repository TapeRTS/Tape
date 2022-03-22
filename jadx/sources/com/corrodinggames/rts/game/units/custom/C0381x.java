package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.p030b.C0573e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.x */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/x.class */
public class C0381x {

    /* renamed from: a */
    public String f2890a;

    /* renamed from: b */
    public C0308ad[] f2891b;

    /* renamed from: c */
    final /* synthetic */ C0368l f2892c;

    /* renamed from: a */
    public boolean m2712a() {
        return (this.f2891b == null || this.f2891b.length == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean m2709b() {
        return this.f2891b != null && (this.f2891b.length != 0 || this.f2891b == C0368l.f2836fP);
    }

    private C0381x(C0368l lVar, String str) {
        this.f2892c = lVar;
        this.f2890a = str;
        lVar.f2833fM.add(this);
    }

    /* renamed from: c */
    public void m2708c() {
        if (this.f2890a == null || this.f2890a.equals("")) {
            this.f2891b = C0368l.f2835fO;
        } else if (this.f2890a.equalsIgnoreCase("NONE")) {
            this.f2891b = C0368l.f2836fP;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f2890a.split(",")) {
                String[] split = str.trim().split("\\*");
                String str2 = split[0];
                int i = 1;
                if (split.length >= 2) {
                    i = Integer.parseInt(split[1]);
                }
                C0308ad b = this.f2892c.m2771b(str2);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(b);
                }
            }
            this.f2891b = (C0308ad[]) arrayList.toArray(C0368l.f2835fO);
        }
    }

    /* renamed from: a */
    public C0573e m2711a(float f, float f2, float f3, float f4, AbstractC0854w wVar) {
        return m2710a(f, f2, f3, f4, wVar, 0, (short) 0);
    }

    /* renamed from: a */
    public C0573e m2710a(float f, float f2, float f3, float f4, AbstractC0854w wVar, int i, short s) {
        C0573e eVar = null;
        for (C0308ad adVar : this.f2891b) {
            C0573e a = adVar.m3107a(f, f2, f3, f4, wVar, i, s);
            if (a != null && eVar == null) {
                eVar = a;
            }
        }
        return eVar;
    }
}
