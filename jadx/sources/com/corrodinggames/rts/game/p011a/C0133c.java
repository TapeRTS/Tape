package com.corrodinggames.rts.game.p011a;

import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.game.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/c.class */
public class C0133c {

    /* renamed from: a */
    HashMap f593a = new HashMap();

    /* renamed from: b */
    HashMap f594b = new HashMap();

    /* renamed from: c */
    HashMap f595c = new HashMap();

    /* renamed from: a */
    public Integer m3817a(boolean z, AbstractC0268al alVar, boolean z2) {
        if (z) {
            return (Integer) this.f595c.get(alVar);
        }
        if (!z2) {
            return (Integer) this.f594b.get(alVar);
        }
        return (Integer) this.f593a.get(alVar);
    }

    /* renamed from: a */
    public void m3816a(boolean z, AbstractC0268al alVar, boolean z2, Integer num) {
        if (z) {
            this.f595c.put(alVar, num);
        } else if (!z2) {
            this.f594b.put(alVar, num);
        } else {
            this.f593a.put(alVar, num);
        }
    }

    /* renamed from: a */
    public void m3820a() {
        this.f593a.clear();
        this.f594b.clear();
    }

    /* renamed from: a */
    public void m3819a(AbstractC0268al alVar) {
        this.f593a.put(alVar, null);
        this.f594b.put(alVar, null);
    }

    /* renamed from: a */
    public void m3818a(AbstractC0515r rVar) {
        this.f595c.put(rVar.f1539db, null);
    }

    /* renamed from: b */
    public void m3815b() {
        this.f595c.clear();
    }
}
