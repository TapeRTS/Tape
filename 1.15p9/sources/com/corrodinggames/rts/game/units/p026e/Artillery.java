package com.corrodinggames.rts.game.units.p026e;

import android.graphics.Color;
import android.graphics.PointF;
import com.corrodinggames.rts.C0067R;
import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.C0188f;
import com.corrodinggames.rts.game.units.EnumC0233ab;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p030a.C0631e;
import com.corrodinggames.rts.gameFramework.p035d.C0745e;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.utility.C1117y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.game.units.e.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/e/a.class */
public class Artillery extends AbstractC0529j {

    /* renamed from: a */
    static C0934e f3572a = null;

    /* renamed from: b */
    static C0934e f3573b = null;

    /* renamed from: c */
    static C0934e f3574c = null;

    /* renamed from: d */
    static C0934e[] f3575d = new C0934e[10];

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public UnitType mo6891r() {
        return UnitType.artillery;
    }

    /* renamed from: c */
    public static void load() {
        GameEngine m1234A = GameEngine.m1234A();
        f3572a = m1234A.f6107bO.mo930a(C0067R.drawable.artillery2);
        f3573b = m1234A.f6107bO.mo930a(C0067R.drawable.artillery1_dead);
        f3575d = AbstractC0197n.m5767a(f3572a);
        f3574c = m5290a(f3572a);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3065d() {
        if (this.f1606bT) {
            return f3573b;
        }
        return f3575d[this.f1608bV.m5790O()];
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: k */
    public C0934e mo3039k() {
        return f3574c;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: F */
    public boolean mo3240F() {
        return GameEngine.m1234A().f6109bQ.renderExtraShadows && !this.f1606bT;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: G */
    public float mo3238G() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: H */
    public float mo3236H() {
        return 3.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: d */
    public C0934e mo3062d(int i) {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo3630e() {
        GameEngine.m1234A();
        this.f3880L = f3573b;
        m472S(0);
        this.f1605bS = false;
        m3199a(EnumC0233ab.f1503c);
        return true;
    }

    public Artillery(boolean z) {
        super(z);
        m2879T(28);
        m2878U(50);
        this.f1620ch = 18.0f;
        this.f1621ci = this.f1620ch;
        this.f1632ct = 140.0f;
        this.f1631cs = this.f1632ct;
        this.f3880L = f3572a;
    }

    @Override // com.corrodinggames.rts.game.units.p026e.AbstractC0529j, com.corrodinggames.rts.game.units.AbstractC0623y, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: a */
    public void mo470a(float f) {
        super.mo470a(f);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: a */
    public void mo3193a(Unit unit, int i) {
        PointF E = mo3241E(i);
        C0188f m5894a = C0188f.m5894a(this, E.f227a, E.f228b);
        PointF K = mo3231K(i);
        m5894a.f1010K = K.f227a;
        m5894a.f1011L = K.f228b;
        m5894a.f981h = 150.0f;
        m5894a.f993t = 4.0f;
        m5894a.f1067aQ = true;
        m5894a.f1042ar = Color.m6650a(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_BUTTON_3, 80);
        m5894a.f1017R = (short) 2;
        m5894a.f1015P = (short) 1;
        m5894a.f997x = 0.9f;
        PointF m5302a = unit.m5302a(E.f227a, E.f228b, m5894a.f993t, m5894a.f981h, mo3032m());
        m5894a.f1053aC = true;
        m5894a.f986m = true;
        m5894a.f987n = m5302a.f227a;
        m5894a.f988o = m5302a.f228b;
        m5894a.f1024Y = 80.0f;
        m5894a.f1025Z = 45.0f;
        m5894a.f1026aa = true;
        GameEngine m1234A = GameEngine.m1234A();
        m1234A.f6105bM.m2997a(C0631e.f4047r, 0.3f, E.f227a, E.f228b);
        m1234A.f6110bR.m2557a(E.f227a, E.f228b, this.f6953em, this.f1648cJ[i].f1711a);
        C0745e m2552a = m1234A.f6110bR.m2552a(E.f227a, E.f228b, this.f6953em, -1118482);
        if (m2552a != null) {
            m2552a.f4745W = 15.0f;
            m2552a.f4746X = m2552a.f4745W;
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bV */
    public float mo3917bV() {
        if (this.f1648cJ[0].f1715e > 0.0f) {
            return 1.0f - (this.f1648cJ[0].f1715e / mo3115b(0));
        }
        return super.mo4495bV();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: m */
    public float mo3032m() {
        return 290.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: b */
    public float mo3115b(int i) {
        return 240.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: z */
    public float mo3007z() {
        return 0.9f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: A */
    public float mo3250A() {
        return 1.7f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: B */
    public float mo3248B() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: c */
    public float mo3069c(int i) {
        return 99.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean mo3628l() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: af */
    public boolean mo3140af() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: E */
    public boolean mo3242E() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: g */
    public float mo3052g(int i) {
        return 20.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: C */
    public float mo3246C() {
        return 0.05f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0623y
    /* renamed from: D */
    public float mo3244D() {
        return 0.12f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.AbstractC1120w
    /* renamed from: e */
    public void mo458e(float f) {
        super.mo3484e(f);
        C1117y.m495a(this, mo3032m());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bN */
    public float mo3918bN() {
        return 14000.0f;
    }
}
