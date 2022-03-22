package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/c.class */
public final class C0337c {

    /* renamed from: a */
    EnumC0344d f2304a;

    /* renamed from: b */
    int f2305b;

    /* renamed from: c */
    String f2306c;

    /* renamed from: d */
    float f2307d;

    /* renamed from: e */
    public C0285a[] f2308e;

    /* renamed from: f */
    private C0835m f2309f = new C0835m();

    /* renamed from: a */
    public C0327b m3035a() {
        C0327b bVar = null;
        if (this.f2309f.size() > 0) {
            bVar = (C0327b) this.f2309f.get(this.f2309f.size() - 1);
            if (bVar.f2226h) {
                bVar = null;
            }
        }
        return bVar;
    }

    /* renamed from: a */
    public void m3032a(C0367k kVar, float f, float f2, boolean z) {
        int i;
        if (!z && f2 > f) {
            C0285a[] aVarArr = this.f2308e;
            int length = aVarArr.length;
            if (f <= aVarArr[0].f1755a) {
                i = -1;
            } else {
                i = 0;
                while (f > aVarArr[i].f1755a) {
                    i++;
                    if (i >= length) {
                        return;
                    }
                }
            }
            int i2 = i;
            if (i2 < 0) {
                i2 = 0;
            }
            while (true) {
                if (f2 <= aVarArr[i2].f1755a) {
                    break;
                }
                i2++;
                if (i2 >= length) {
                    i2 = length - 1;
                    break;
                }
            }
            if (i2 > i) {
                for (int i3 = i + 1; i3 <= i2; i3++) {
                    ((C0327b) aVarArr[i3]).m3060a(kVar);
                }
            }
        }
    }

    /* renamed from: b */
    public void m3030b() {
        C0327b a;
        if (this.f2304a == EnumC0344d.event && (a = m3035a()) != null) {
            a.finalize();
        }
    }

    /* renamed from: a */
    public void m3031a(C0368l lVar, float f, String str, String str2) {
        if (this.f2304a == EnumC0344d.event) {
            C0327b a = m3035a();
            if (a == null) {
                a = new C0327b(f, 0.0f);
                this.f2309f.add(a);
            }
            a.m3059a(lVar, str, str2);
            return;
        }
        try {
            m3033a(f, Float.parseFloat(str2));
        } catch (NumberFormatException e) {
            throw new C0324at("Failed to parse float:" + str2);
        }
    }

    /* renamed from: a */
    public void m3033a(float f, float f2) {
        if (this.f2304a == EnumC0344d.event) {
            throw new C0324at("Adding key frame value to event set");
        }
        if (this.f2309f.size() == 0 && f > 0.0f && f2 != 0.0f) {
            this.f2309f.add(new C0285a(0.0f, 0.0f));
        }
        this.f2309f.add(new C0285a(f, f2));
    }

    /* renamed from: a */
    public void m3034a(float f) {
        Iterator it = this.f2309f.iterator();
        while (it.hasNext()) {
            ((C0285a) it.next()).f1755a *= f;
        }
    }

    /* renamed from: c */
    public void m3028c() {
        Collections.sort(this.f2309f);
        C0285a aVar = null;
        Iterator it = this.f2309f.iterator();
        while (it.hasNext()) {
            C0285a aVar2 = (C0285a) it.next();
            if (aVar != null) {
                aVar2.f1757c = 1.0f / (aVar2.f1755a - aVar.f1755a);
                aVar2.f1758d = aVar2.f1756b - aVar.f1756b;
            }
            aVar = aVar2;
            this.f2307d = aVar2.f1755a;
        }
        this.f2308e = (C0285a[]) this.f2309f.toArray(new C0285a[0]);
        this.f2309f = null;
    }

    /* renamed from: b */
    public float m3029b(float f) {
        C0285a[] aVarArr = this.f2308e;
        int length = aVarArr.length;
        if (length == 1 || f <= aVarArr[0].f1755a) {
            return aVarArr[0].f1756b;
        }
        if (f >= this.f2307d) {
            return aVarArr[length - 1].f1756b;
        }
        int i = 1;
        while (f > aVarArr[i].f1755a) {
            i++;
            if (i >= length) {
                return aVarArr[length - 1].f1756b;
            }
        }
        C0285a aVar = aVarArr[i - 1];
        C0285a aVar2 = aVarArr[i];
        return aVar.f1756b + (aVar2.f1758d * (f - aVar.f1755a) * aVar2.f1757c);
    }
}
