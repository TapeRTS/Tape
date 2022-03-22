package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Rect;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.gameFramework.p030b.C0571c;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/j.class */
public class C0188j extends AbstractC0197s {

    /* renamed from: a */
    public EnumC0189k f1337a;

    /* renamed from: b */
    static ArrayList f1338b = new ArrayList();

    /* renamed from: c */
    static Rect f1339c;

    public C0188j() {
        this(EnumC0189k.normal);
    }

    public C0188j(EnumC0189k kVar) {
        super("c_6_" + kVar.name());
        this.f1337a = kVar;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public int mo2416b(AbstractC0210af afVar, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public int mo2415c() {
        return 0;
    }

    /* renamed from: t */
    public EnumC0215ak mo2412i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: e */
    public EnumC0199u mo2377e() {
        return EnumC0199u.pingMap;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: f */
    public EnumC0198t mo2376f() {
        return EnumC0198t.none;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: g */
    public boolean mo2413g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: a */
    public String mo2380a() {
        return "Ping Map" + this.f1337a.m3396a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: b */
    public String mo2379b() {
        return this.f1337a.m3395b();
    }

    /* renamed from: H */
    public String m3399H() {
        return this.f1337a.m3394c();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: c */
    public String mo2414c(AbstractC0210af afVar) {
        return mo2380a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: o */
    public boolean mo3361o() {
        return true;
    }

    static {
        for (EnumC0189k kVar : EnumC0189k.values()) {
            f1338b.add(new C0188j(kVar));
        }
        f1339c = new Rect();
    }

    /* renamed from: a */
    public static C0188j m3398a(C0181c cVar) {
        Iterator it = f1338b.iterator();
        while (it.hasNext()) {
            AbstractC0197s sVar = (AbstractC0197s) it.next();
            if (sVar.m3379d(cVar)) {
                return (C0188j) sVar;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: r */
    public ArrayList mo3375r(AbstractC0210af afVar) {
        return f1338b;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: r */
    public C0748e mo3160r() {
        return C0571c.f3810n[9].f3934i;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0197s
    /* renamed from: s */
    public Rect mo3374s() {
        int ordinal = 7 + this.f1337a.ordinal();
        f1339c.m4136a(29 * ordinal, 0, (29 * ordinal) + 28, 28);
        return f1339c;
    }
}
