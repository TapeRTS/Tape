package com.corrodinggames.rts.game.units.p013a;

import android.graphics.Rect;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.gameFramework.p035d.C0743c;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/a/j.class */
public class C0215j extends AbstractC0224s {

    /* renamed from: a */
    public EnumC0216k f1442a;

    /* renamed from: b */
    static ArrayList f1443b = new ArrayList();

    /* renamed from: c */
    static Rect f1444c;

    public C0215j() {
        this(EnumC0216k.normal);
    }

    public C0215j(EnumC0216k enumC0216k) {
        super("c_6_" + enumC0216k.name());
        this.f1442a = enumC0216k;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public int mo3313b(AbstractC0244am abstractC0244am, boolean z) {
        return -1;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: c */
    public int mo3312c() {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: w */
    public AbstractC0249ar mo6754i() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e */
    public EnumC0226u mo3311e() {
        return EnumC0226u.pingMap;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: f */
    public EnumC0225t mo3309f() {
        return EnumC0225t.none;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: g */
    public boolean mo3308g() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: a */
    public String mo3318a() {
        return "Ping Map" + this.f1442a.m5480a();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: b */
    public String mo3315b() {
        return this.f1442a.m5479b();
    }

    /* renamed from: K */
    public String m5487K() {
        return this.f1442a.m5478c();
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: e_ */
    public boolean mo3310e_() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: s */
    public boolean mo5483s() {
        return true;
    }

    static {
        for (EnumC0216k enumC0216k : EnumC0216k.values()) {
            f1443b.add(new C0215j(enumC0216k));
        }
        f1444c = new Rect();
    }

    /* renamed from: a */
    public static C0215j m5486a(C0208c c0208c) {
        Iterator it = f1443b.iterator();
        while (it.hasNext()) {
            AbstractC0224s abstractC0224s = (AbstractC0224s) it.next();
            if (abstractC0224s.m5432d(c0208c)) {
                return (C0215j) abstractC0224s;
            }
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: q */
    public ArrayList mo5484q(AbstractC0244am abstractC0244am) {
        return f1443b;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: j */
    public C0934e mo5485j() {
        return C0743c.f4684s[9].f4821i;
    }

    @Override // com.corrodinggames.rts.game.units.p013a.AbstractC0224s
    /* renamed from: v */
    public Rect mo5482v() {
        int ordinal = 7 + this.f1442a.ordinal();
        f1444c.m6447a(29 * ordinal, 0, (29 * ordinal) + 28, 28);
        return f1444c;
    }
}
