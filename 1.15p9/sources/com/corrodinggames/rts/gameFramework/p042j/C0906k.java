package com.corrodinggames.rts.gameFramework.p042j;

import android.graphics.Paint;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/k.class */
public class C0906k {

    /* renamed from: a */
    private C0907l f5967a;

    /* renamed from: e */
    protected int f5968e;

    /* renamed from: f */
    protected static int f5969f;

    /* renamed from: g */
    public int f5970g;

    /* renamed from: h */
    protected short f5971h;

    /* renamed from: i */
    protected short f5972i;

    /* renamed from: j */
    protected Float f5973j;

    /* renamed from: k */
    protected boolean f5974k;

    /* renamed from: l */
    protected short f5975l;

    /* renamed from: m */
    protected short f5976m;

    /* renamed from: n */
    protected short f5977n;

    /* renamed from: o */
    protected EnumC0246ao f5978o;

    /* renamed from: p */
    public boolean f5979p;

    /* renamed from: q */
    public int f5980q;

    /* renamed from: r */
    public boolean f5981r;

    /* renamed from: s */
    public float f5982s;

    /* renamed from: t */
    public float f5983t;

    /* renamed from: u */
    public boolean f5984u;

    /* renamed from: v */
    protected boolean f5985v;

    /* renamed from: w */
    protected boolean f5986w;

    /* renamed from: x */
    protected LinkedList f5987x;

    /* renamed from: y */
    public byte[] f5988y;

    /* renamed from: z */
    public byte[] f5989z;

    /* renamed from: A */
    public byte[] f5990A;

    /* renamed from: B */
    public short[] f5991B;

    /* renamed from: C */
    public byte[] f5992C;

    public C0906k(C0907l c0907l, boolean z) {
        this.f5967a = c0907l;
        if (z) {
            int i = f5969f;
            f5969f = i + 1;
            this.f5968e = i;
        }
        this.f5970g = GameEngine.getInstance().f6233bx;
    }

    /* renamed from: a */
    public void m1329a(C0859ar c0859ar) {
        int i;
        if (this.f5987x == null) {
            c0859ar.mo1482a(false);
            return;
        }
        c0859ar.mo1482a(true);
        c0859ar.mo1484a("p", true);
        c0859ar.mo1487a(this.f5987x.size());
        if (this.f5987x.size() != 0) {
            C0911p c0911p = (C0911p) this.f5987x.get(0);
            c0859ar.mo1483a(c0911p.f6068a);
            c0859ar.mo1483a(c0911p.f6069b);
            for (int i2 = 1; i2 < this.f5987x.size(); i2++) {
                C0911p c0911p2 = (C0911p) this.f5987x.get(i2);
                int i3 = c0911p2.f6068a - c0911p.f6068a;
                int i4 = c0911p2.f6069b - c0911p.f6069b;
                boolean z = CommonUtils.m2279d(i3) > 1 || CommonUtils.m2279d(i4) > 1;
                if (z) {
                    GameEngine.PrintLog("writeOutCompressedPath: out of range:" + i3 + "," + i4);
                    i = 128;
                } else {
                    i = i3 + 1 + ((i4 + 1) << 2);
                }
                c0859ar.m1554c(i);
                if (z) {
                    c0859ar.mo1483a(c0911p2.f6068a);
                    c0859ar.mo1483a(c0911p2.f6069b);
                }
                c0911p = c0911p2;
            }
        }
        c0859ar.mo1485a("p");
    }

    /* renamed from: a */
    public void m1328a(C0876k c0876k) {
        if (!c0876k.m1455e()) {
            this.f5987x = null;
            return;
        }
        c0876k.m1466a("p", true);
        int m1454f = c0876k.m1454f();
        if (m1454f > 160000 || m1454f < 0) {
            GameEngine.PrintLog("readInCompressedPath: Path too big at:" + m1454f);
            m1454f = -1;
        }
        if (m1454f != -1) {
            this.f5984u = true;
            if (this.f5987x == null) {
                this.f5987x = new LinkedList();
            }
            this.f5987x.clear();
        }
        if (m1454f > 0) {
            short m1438v = c0876k.m1438v();
            short m1438v2 = c0876k.m1438v();
            this.f5987x.add(new C0911p(m1438v, m1438v2));
            for (int i = 1; i < m1454f; i++) {
                byte m1457d = c0876k.m1457d();
                if (m1457d < 128) {
                    int i2 = (m1457d & 3) - 1;
                    int i3 = ((m1457d & 12) >> 2) - 1;
                    if (CommonUtils.m2279d(i2) > 1 || CommonUtils.m2279d(i3) > 1) {
                        GameEngine.PrintLog("readInCompressedPath: out of range but shouldn't be:" + i2 + "," + i3 + " for: " + ((int) m1457d));
                    }
                    m1438v = (short) (m1438v + i2);
                    m1438v2 = (short) (m1438v2 + i3);
                    this.f5987x.add(new C0911p(m1438v, m1438v2));
                } else {
                    GameEngine.PrintLog("readInCompressedPath: out of range unpack:" + ((int) m1438v) + "," + ((int) m1438v2));
                    m1438v = c0876k.m1438v();
                    m1438v2 = c0876k.m1438v();
                    this.f5987x.add(new C0911p(m1438v, m1438v2));
                }
            }
        }
        c0876k.m1456d("p");
    }

    /* renamed from: e */
    public void m1322e() {
        C0904i m1314a = this.f5967a.m1314a(this.f5978o);
        if (m1314a == null) {
            throw new RuntimeException("Could not get costs for:" + this.f5978o.toString());
        }
        this.f5988y = m1314a.f5954d;
        this.f5989z = m1314a.f5955e;
        this.f5990A = m1314a.f5956f;
        this.f5991B = m1314a.f5957g;
        this.f5992C = m1314a.f5960j;
    }

    /* renamed from: f */
    public void m1321f() {
        this.f5988y = null;
        this.f5989z = null;
        this.f5990A = null;
        this.f5991B = null;
        this.f5992C = null;
    }

    /* renamed from: a */
    public void m1330a(EnumC0246ao enumC0246ao, short s, short s2, Float f, boolean z) {
        if (enumC0246ao == null) {
            throw new RuntimeException("MovementType is null");
        }
        this.f5978o = enumC0246ao;
        this.f5971h = s;
        this.f5972i = s2;
        this.f5973j = f;
        this.f5974k = z;
        if (this.f5971h < 0) {
            this.f5971h = (short) 0;
        }
        if (this.f5972i < 0) {
            this.f5972i = (short) 0;
        }
        if (this.f5971h > this.f5967a.f6008s - 1) {
            this.f5971h = (short) (this.f5967a.f6008s - 1);
        }
        if (this.f5972i > this.f5967a.f6009t - 1) {
            this.f5972i = (short) (this.f5967a.f6009t - 1);
        }
        if (this.f5967a.m1314a(enumC0246ao) == null) {
            throw new RuntimeException("Could not get costs for:" + enumC0246ao.toString());
        }
    }

    /* renamed from: a */
    public void m1325a(short s, short s2, short s3) {
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s > this.f5967a.f6008s - 1) {
            s = (short) (this.f5967a.f6008s - 1);
        }
        if (s2 > this.f5967a.f6009t - 1) {
            s2 = (short) (this.f5967a.f6009t - 1);
        }
        this.f5975l = s;
        this.f5976m = s2;
        this.f5977n = s3;
    }

    /* renamed from: b */
    public boolean m1324b() {
        return false;
    }

    /* renamed from: a */
    public boolean m1327a(C0906k c0906k) {
        return this == c0906k;
    }

    /* renamed from: a */
    public AbstractC0898c m1331a(Unit unit) {
        return null;
    }

    /* renamed from: a */
    public LinkedList m1332a() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine.networkEngine.f5564B || gameEngine.f6120cb.m2636g()) {
            if (this.f5984u) {
                return this.f5987x;
            }
            return null;
        }
        return this.f5987x;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: c */
    public boolean m1323c() {
        return this.f5987x != null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    /* renamed from: a */
    public void m1326a(LinkedList linkedList) {
        this.f5987x = linkedList;
    }

    /* renamed from: g */
    public void m1320g() {
        GameEngine gameEngine = GameEngine.getInstance();
        C0173b c0173b = gameEngine.f6104bL;
        Paint paint = new Paint();
        paint.m7270a(2.0f);
        paint.m7267a(100, 0, 100, 0);
        gameEngine.graphics.mo931a(((this.f5975l * c0173b.f784n) + c0173b.f786p) - GameEngine.getInstance().f6136ct, ((this.f5976m * c0173b.f785o) + c0173b.f787q) - GameEngine.getInstance().f6137cu, this.f5977n * c0173b.f784n, paint);
        paint.m7267a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 0, 0, 255);
        gameEngine.graphics.mo932a(((this.f5971h * c0173b.f784n) + c0173b.f786p) - GameEngine.getInstance().f6136ct, ((this.f5972i * c0173b.f785o) + c0173b.f787q) - GameEngine.getInstance().f6137cu, ((this.f5975l * c0173b.f784n) + c0173b.f786p) - GameEngine.getInstance().f6136ct, ((this.f5976m * c0173b.f785o) + c0173b.f787q) - GameEngine.getInstance().f6137cu, paint);
    }

    /* renamed from: h */
    public void m1319h() {
        if (this.f5987x != null) {
            GameEngine gameEngine = GameEngine.getInstance();
            C0173b c0173b = gameEngine.f6104bL;
            if (this.f5987x.size() >= 1) {
                for (int i = 1; i < this.f5987x.size(); i++) {
                    C0911p c0911p = (C0911p) this.f5987x.get(i);
                    C0911p c0911p2 = (C0911p) this.f5987x.get(i - 1);
                    Paint paint = new Paint();
                    paint.m7267a(255, 0, 255, 0);
                    paint.m7270a(2.0f);
                    gameEngine.graphics.mo932a(((c0911p.f6068a * c0173b.f784n) + c0173b.f786p) - GameEngine.getInstance().f6136ct, ((c0911p.f6069b * c0173b.f785o) + c0173b.f787q) - GameEngine.getInstance().f6137cu, ((c0911p2.f6068a * c0173b.f784n) + c0173b.f786p) - GameEngine.getInstance().f6136ct, ((c0911p2.f6069b * c0173b.f785o) + c0173b.f787q) - GameEngine.getInstance().f6137cu, paint);
                }
            }
        }
    }
}
