package com.corrodinggames.rts.game.units.p024d;

import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.C0305au;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.InterfaceC0469d;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.p013a.C0218m;
import com.corrodinggames.rts.game.units.p013a.C0219n;
import com.corrodinggames.rts.game.units.p026e.Builder;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.d.r */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/d/r.class */
public class Repairbay extends AbstractC0488d implements InterfaceC0469d {

    /* renamed from: d */
    float f3530d;

    /* renamed from: f */
    Rect f3531f;

    /* renamed from: g */
    Rect f3532g;

    /* renamed from: i */
    PointF[] f3533i;

    /* renamed from: j */
    PointF[] f3534j;

    /* renamed from: a */
    static C0934e f3535a = null;

    /* renamed from: b */
    static C0934e[] f3536b = new C0934e[10];

    /* renamed from: c */
    static C0934e f3537c = null;

    /* renamed from: e */
    public static C0511s f3538e = new C0511s(true);

    /* renamed from: h */
    static ArrayList f3539h = new ArrayList();

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w, com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo829a(C0859ar c0859ar) {
        super.mo829a(c0859ar);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC0668az, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo2872a(C0876k c0876k) {
        super.mo2872a(c0876k);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: L */
    public UnitType mo6760r() {
        return UnitType.repairbay;
    }

    static {
        f3539h.add(new C0218m(true));
        f3539h.add(new C0219n());
    }

    /* renamed from: dr */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3535a = m1234A.f6107bO.mo930a(C0067R.drawable.repair_bay);
        f3537c = m1234A.f6107bO.mo930a(C0067R.drawable.repair_bay_dead);
        f3536b = AbstractC0197n.m5635a(f3535a);
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d
    /* renamed from: K */
    public boolean mo3909K() {
        this.f3880L = f3537c;
        m472S(0);
        this.f1605bS = false;
        m3199a(EnumC0233ab.f1503c);
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3265d() {
        if (this.f1606bT) {
            return f3537c;
        }
        if (this.f1608bV == null) {
            return f3536b[f3536b.length - 1];
        }
        return f3536b[this.f1608bV.m5658O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3256k() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3907a(int i) {
    }

    public Repairbay(boolean z) {
        super(z);
        this.f3531f = new Rect();
        this.f3532g = new Rect();
        this.f3533i = new PointF[6];
        this.f3534j = new PointF[this.f3533i.length];
        this.f3880L = f3535a;
        m2873b(f3535a);
        this.f1620ch = 30.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 1000.0f;
        this.f1631cs = this.f1632ct;
        this.f3421n.m6444a(-1, -1, 1, 1);
        this.f3422o.m6444a(-1, -1, 1, 1);
        for (int i = 0; i < this.f3533i.length; i++) {
            this.f3533i[i] = new PointF();
            this.f3534j[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: y */
    public int mo3442y() {
        return SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public float mo3633c(Unit unit) {
        return 0.2f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public boolean mo3455a(Unit unit) {
        if (unit.mo5176q()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C0305au m3912a(AbstractC0623y abstractC0623y, float f, float f2, boolean z) {
        GameEngine m1234A = GameEngine.m1234A();
        f3538e.m3910a(abstractC0623y.mo3442y() + f2, z);
        m1234A.f6121cc.m3650a(abstractC0623y.f6951ek, abstractC0623y.f6952el, abstractC0623y.mo3442y() + f2, abstractC0623y, f, f3538e);
        Unit unit = f3538e.f3544e;
        if (unit != null) {
            C0305au m3131ao = abstractC0623y.m3131ao();
            m3131ao.m5068b(unit);
            if (m3131ao != null) {
                m3131ao.f1808k = f2;
                m3131ao.f1803m = true;
                return m3131ao;
            }
            return null;
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo4989a(f);
        if (!m5143bS() || this.f1606bT) {
            return;
        }
        this.f3530d += f;
        if (m3129aq() && this.f3530d > 40.0f) {
            this.f3530d = 0.0f;
            m3912a((AbstractC0623y) this, f, 0.0f, false);
        }
        if (!this.f1606bT) {
            Builder.m3842a(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.p024d.AbstractC0488d, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: c */
    public boolean mo462c(float f) {
        return super.mo462c(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo469a(float f, boolean z) {
        super.mo469a(f, z);
        if (!this.f1606bT) {
            Builder.m3840b(f, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo5178l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3269a(Unit unit, int i) {
        throw new RuntimeException("Unit cannot shoot");
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3268b(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3267c(int i) {
        return 0.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public PointF mo3437E(int i) {
        PointF G = mo5039G(i);
        f3980bf.m6449a(G.f227a + 0.0f, G.f228b - 33.0f);
        return f3980bf;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: N */
    public ArrayList mo3457N() {
        return f3539h;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: b */
    public PointF[] mo3453b() {
        return this.f3533i;
    }

    @Override // com.corrodinggames.rts.game.units.InterfaceC0469d
    /* renamed from: c */
    public PointF[] mo3450c() {
        return this.f3534j;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3254m() {
        return mo3442y();
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        super.mo5015e(f);
        C1117y.m495a(this, mo3442y());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: g */
    public boolean mo3448g(Unit unit, boolean z) {
        return true;
    }
}
