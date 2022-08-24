package com.corrodinggames.rts.gameFramework.p045m;

import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.m.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/b.class */
public class C1034b {

    /* renamed from: a */
    C1101m f6638a = new C1101m();

    /* renamed from: b */
    boolean f6639b;

    /* renamed from: a */
    public void m832a(C1030a c1030a) {
        this.f6638a.add(c1030a);
    }

    /* renamed from: a */
    public boolean m833a() {
        return this.f6638a.f6888a > 0;
    }

    /* renamed from: b */
    public boolean m831b() {
        boolean z = false;
        boolean z2 = true;
        Iterator it = this.f6638a.iterator();
        while (it.hasNext()) {
            if (((C1030a) it.next()).f6600j) {
                z = true;
            } else {
                z2 = false;
            }
        }
        if (this.f6639b && !z2) {
            z = false;
        }
        return z;
    }
}
