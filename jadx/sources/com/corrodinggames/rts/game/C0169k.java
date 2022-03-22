package com.corrodinggames.rts.game;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0851y;

/* renamed from: com.corrodinggames.rts.game.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/k.class */
public class C0169k extends AbstractC0854w {

    /* renamed from: a */
    int f1213a;

    /* renamed from: b */
    int f1214b;

    /* renamed from: e */
    EnumC0170l f1217e;

    /* renamed from: f */
    int f1218f;

    /* renamed from: h */
    static final Rect f1220h = new Rect();

    /* renamed from: i */
    static final Rect f1221i = new Rect();

    /* renamed from: j */
    static final Paint f1222j = C0851y.m416b();

    /* renamed from: k */
    static C0748e f1223k = null;

    /* renamed from: l */
    static C0748e f1224l = null;

    /* renamed from: m */
    static C0748e f1225m = null;

    /* renamed from: n */
    static final RectF f1226n = new RectF();

    /* renamed from: c */
    int f1215c = 50;

    /* renamed from: d */
    int f1216d = 40;

    /* renamed from: g */
    int f1219g = -1;

    /* renamed from: b */
    public static void m3534b() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f1223k = u.f5514bw.mo189a(C0063R.drawable.scorch_mark, true);
        f1223k.f5243i = true;
        f1224l = u.f5514bw.mo189a(C0063R.drawable.scorch_mark_nuke, true);
        f1224l.f5243i = true;
        f1225m = u.f5514bw.mo189a(C0063R.drawable.blood_mark, true);
        f1225m.f5243i = true;
    }

    public C0169k() {
        AbstractC0789l u = AbstractC0789l.m638u();
        m406R(-1);
        this.f1218f = u.f5499bh;
    }

    /* renamed from: a */
    public static void m3538a(float f, float f2) {
        m3537a(f, f2, EnumC0170l.normal);
    }

    /* renamed from: a */
    public static void m3537a(float f, float f2, EnumC0170l lVar) {
        if (m3533b(f, f2, lVar)) {
            C0169k kVar = new C0169k();
            kVar.f5842dH = f;
            kVar.f5843dI = f2;
            if (lVar == EnumC0170l.normal) {
                kVar.f1213a = 0;
                kVar.f1214b = C0654f.m1499a(kVar, 0, 3, 0);
            } else {
                kVar.f1213a = 2;
            }
            if (kVar.f1213a == 2) {
                kVar.f1215c = f1224l.mo349l();
                kVar.f1216d = f1224l.mo350k();
            }
            kVar.f1217e = lVar;
            kVar.m3531d();
        }
    }

    /* renamed from: a */
    public static void m3536a(AbstractC0515r rVar, int i) {
        if (!rVar.m3299ct()) {
            EnumC0170l lVar = i == 2 ? EnumC0170l.nuke : EnumC0170l.normal;
            if (m3533b(rVar.f5842dH, rVar.f5843dI, lVar)) {
                C0169k kVar = new C0169k();
                kVar.f1213a = i;
                if (kVar.f1213a == 2) {
                    kVar.f1215c = f1224l.mo349l();
                    kVar.f1216d = f1224l.mo350k();
                }
                kVar.f5842dH = rVar.f5842dH;
                kVar.f5843dI = rVar.f5843dI;
                kVar.f1217e = lVar;
                kVar.f1214b = C0654f.m1499a(kVar, 0, 3, 0);
                kVar.m3531d();
            }
        }
    }

    /* renamed from: b */
    public static boolean m3533b(float f, float f2, EnumC0170l lVar) {
        int i = 0;
        int i2 = 0;
        int i3 = 25;
        if (lVar == EnumC0170l.nuke) {
            i3 = 45;
        }
        AbstractC0854w[] a = AbstractC0854w.f5846dK.m472a();
        int size = AbstractC0854w.f5846dK.size();
        for (int i4 = 0; i4 < size; i4++) {
            AbstractC0854w wVar = a[i4];
            if (wVar instanceof C0169k) {
                C0169k kVar = (C0169k) wVar;
                if (C0654f.m1459c(kVar.f5842dH - f) < i3 && C0654f.m1459c(kVar.f5843dI - f2) < i3 && kVar.f1217e == lVar) {
                    i++;
                    if (C0654f.m1459c(kVar.f5842dH - f) < 5 && C0654f.m1459c(kVar.f5843dI - f2) < 5) {
                        i2++;
                    }
                }
            }
        }
        if (i < 3 && i2 < 1) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public boolean mo398a(AbstractC0789l lVar) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: f */
    public boolean mo391f(float f) {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: c */
    public boolean mo396c(float f) {
        return true;
    }

    /* renamed from: c */
    public RectF m3532c() {
        f1226n.f231a = this.f5842dH - (this.f1215c * 0.5f);
        f1226n.f233c = this.f5842dH + (this.f1215c * 0.5f);
        f1226n.f232b = this.f5843dI - (this.f1216d * 0.5f);
        f1226n.f234d = this.f5843dI + (this.f1216d * 0.5f);
        return f1226n;
    }

    /* renamed from: a */
    public void m3535a(AbstractC0755l lVar, int i, int i2, float f) {
        int i3;
        int i4 = this.f1214b * this.f1215c;
        C0748e eVar = null;
        int i5 = this.f1215c;
        int i6 = this.f1216d;
        if (this.f1213a == 0) {
            eVar = f1223k;
        } else if (this.f1213a == 1) {
            eVar = f1225m;
        } else if (this.f1213a == 2) {
            eVar = f1224l;
        }
        Rect rect = f1220h;
        Rect rect2 = f1221i;
        rect2.f227a = i4;
        rect2.f228b = 0;
        rect2.f229c = i4 + i5;
        rect2.f230d = 0 + i6;
        int i7 = ((int) this.f5842dH) - i;
        int i8 = i5 >> 1;
        int i9 = i6 >> 1;
        float f2 = i7 - i8;
        rect.f227a = (int) (f2 * f);
        rect.f228b = (int) (((((int) this.f5843dI) - i2) - i9) * f);
        rect.f229c = (int) ((i7 + i8) * f);
        rect.f230d = (int) ((i3 + i9) * f);
        lVar.mo139b(eVar, rect2, rect, f1222j);
    }

    /* renamed from: d */
    private void m3531d() {
        AbstractC0789l.m638u().f5511bt.m3690a(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: e */
    public void mo392e(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo403a(float f, boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: d */
    public void mo395d(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo404a(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w, com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo400a(C0690ap apVar) {
        apVar.mo1096a(this.f5842dH);
        apVar.mo1096a(this.f5843dI);
        apVar.mo1095a(this.f1213a);
        apVar.mo1095a(this.f1214b);
        apVar.mo1095a(this.f1215c);
        apVar.mo1095a(this.f1216d);
        apVar.mo1138a(this.f1217e);
        apVar.mo1095a(this.f1218f);
        super.mo400a(apVar);
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0854w
    /* renamed from: a */
    public void mo399a(C0707k kVar) {
        this.f5842dH = kVar.m1061g();
        this.f5843dI = kVar.m1061g();
        this.f1213a = kVar.m1062f();
        this.f1214b = kVar.m1062f();
        this.f1215c = kVar.m1062f();
        this.f1216d = kVar.m1062f();
        if (kVar.m1071b() >= 87) {
            this.f1217e = (EnumC0170l) kVar.m1069b(EnumC0170l.class);
            this.f1218f = kVar.m1062f();
        } else {
            this.f1217e = this.f1213a == 2 ? EnumC0170l.nuke : EnumC0170l.normal;
            if (this.f1213a == 2) {
                this.f1215c = f1224l.mo349l();
                this.f1216d = f1224l.mo350k();
            }
        }
        super.mo399a(kVar);
    }
}
