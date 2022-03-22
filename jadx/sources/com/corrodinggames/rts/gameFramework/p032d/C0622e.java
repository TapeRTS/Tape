package com.corrodinggames.rts.gameFramework.p032d;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0584bh;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.d.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/e.class */
public class C0622e {

    /* renamed from: a */
    public String f4272a;

    /* renamed from: b */
    public String f4273b;

    /* renamed from: c */
    public float f4274c;

    /* renamed from: d */
    public float f4275d;

    public C0622e(String str, String str2) {
        this.f4272a = str;
        this.f4273b = str2;
    }

    public C0622e(String str, float f) {
        this.f4272a = str;
        this.f4274c = f;
        this.f4273b = null;
    }

    /* renamed from: a */
    public static ArrayList m1806a() {
        AbstractC0789l u = AbstractC0789l.m651u();
        ArrayList arrayList = new ArrayList();
        C0584bh bhVar = null;
        if (u.f5464bb != null) {
            bhVar = u.f5487bG.m1969a(u.f5464bb);
        }
        if (bhVar != null) {
            if (u.f5493bM != null && u.f5493bM.f5379k) {
                arrayList.add(new C0622e("Lasted till wave: " + u.f5493bM.f5393r, ""));
                if (!u.f5493bM.f5380l) {
                    arrayList.add(new C0622e("Wave difficulty: " + u.f5486bF.AI_difficulty_Hcat(u.f5493bM.f5400y), ""));
                }
            }
            arrayList.add(new C0622e("Game Time", C0654f.m1551a(u.f5467bh / 1000)));
            arrayList.add(new C0622e("=============================", ""));
            arrayList.add(new C0622e("Units Killed", bhVar.f4029c));
            arrayList.add(new C0622e("Buildings Killed", bhVar.f4030d));
            arrayList.add(new C0622e("Experimentals Killed", bhVar.f4031e));
            arrayList.add(new C0622e("=============================", ""));
            arrayList.add(new C0622e("Units Lost", bhVar.f4032f));
            arrayList.add(new C0622e("Buildings Lost", bhVar.f4033g));
            arrayList.add(new C0622e("Experimentals Lost", bhVar.f4034h));
            arrayList.add(new C0622e("=============================", ""));
        }
        return arrayList;
    }
}
