package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/y.class */
public class C0467y {

    /* renamed from: a */
    public String f3352a;

    /* renamed from: b */
    public C0382aw[] f3353b;

    /* renamed from: c */
    final /* synthetic */ C0453l f3354c;

    /* renamed from: a */
    public boolean m4058a() {
        return (this.f3353b == null || this.f3353b.length == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean m4055b() {
        return this.f3353b != null && (this.f3353b.length != 0 || this.f3353b == C0453l.f3192fZ);
    }

    private C0467y(C0453l c0453l, String str) {
        this.f3354c = c0453l;
        this.f3352a = str;
        c0453l.f3270fW.add(this);
    }

    /* renamed from: c */
    public void m4054c() {
        if (this.f3352a == null || this.f3352a.equals(VariableScope.nullOrMissingString)) {
            this.f3353b = C0453l.f3191fY;
        } else if (this.f3352a.equalsIgnoreCase("NONE")) {
            this.f3353b = C0453l.f3192fZ;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f3352a.split(",")) {
                String[] split = str.trim().split("\\*");
                String str2 = split[0];
                int i = 1;
                if (split.length >= 2) {
                    i = Integer.parseInt(split[1]);
                }
                C0382aw m4113d = this.f3354c.m4113d(str2);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(m4113d);
                }
            }
            this.f3353b = (C0382aw[]) arrayList.toArray(C0453l.f3191fY);
        }
    }

    /* renamed from: a */
    public C0745e m4057a(float f, float f2, float f3, float f4, AbstractC1120w abstractC1120w) {
        return m4056a(f, f2, f3, f4, abstractC1120w, 0, (short) 0);
    }

    /* renamed from: a */
    public C0745e m4056a(float f, float f2, float f3, float f4, AbstractC1120w abstractC1120w, int i, short s) {
        C0745e c0745e = null;
        for (C0382aw c0382aw : this.f3353b) {
            C0745e m4695a = c0382aw.m4695a(f, f2, f3, f4, abstractC1120w, i, s);
            if (m4695a != null && c0745e == null) {
                c0745e = m4695a;
            }
        }
        return c0745e;
    }
}
