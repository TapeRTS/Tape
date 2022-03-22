package com.corrodinggames.rts.gameFramework.p037h;

import android.graphics.Paint;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.h.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/g.class */
public class C0733g {

    /* renamed from: y */
    private C0734h f5101y;

    /* renamed from: a */
    protected int f5102a;

    /* renamed from: b */
    protected static int f5103b;

    /* renamed from: c */
    protected int f5104c;

    /* renamed from: d */
    protected short f5105d;

    /* renamed from: e */
    protected short f5106e;

    /* renamed from: f */
    protected Float f5107f;

    /* renamed from: g */
    protected boolean f5108g;

    /* renamed from: h */
    protected short f5109h;

    /* renamed from: i */
    protected short f5110i;

    /* renamed from: j */
    protected short f5111j;

    /* renamed from: k */
    protected EnumC0212ah f5112k;

    /* renamed from: l */
    public boolean f5113l;

    /* renamed from: m */
    public int f5114m;

    /* renamed from: n */
    public boolean f5115n;

    /* renamed from: o */
    public float f5116o;

    /* renamed from: p */
    public float f5117p;

    /* renamed from: q */
    public boolean f5118q;

    /* renamed from: r */
    protected boolean f5119r;

    /* renamed from: s */
    protected boolean f5120s;

    /* renamed from: z */
    private LinkedList f5121z;

    /* renamed from: t */
    public byte[] f5122t;

    /* renamed from: u */
    public byte[] f5123u;

    /* renamed from: v */
    public byte[] f5124v;

    /* renamed from: w */
    public short[] f5125w;

    /* renamed from: x */
    public byte[] f5126x;

    public C0733g(C0734h hVar, boolean z) {
        this.f5101y = hVar;
        if (z) {
            int i = f5103b;
            f5103b = i + 1;
            this.f5102a = i;
        }
        this.f5104c = AbstractC0789l.m651u().f5585bg;
    }

    /* renamed from: a */
    public void m986a(C0690ap apVar) {
        int i;
        if (this.f5121z == null) {
            apVar.mo1104a(false);
            return;
        }
        apVar.mo1104a(true);
        apVar.mo1106a("p", true);
        apVar.mo1109a(this.f5121z.size());
        if (this.f5121z.size() != 0) {
            C0738l lVar = (C0738l) this.f5121z.get(0);
            apVar.mo1105a(lVar.f5198a);
            apVar.mo1105a(lVar.f5199b);
            for (int i2 = 1; i2 < this.f5121z.size(); i2++) {
                C0738l lVar2 = (C0738l) this.f5121z.get(i2);
                int i3 = lVar2.f5198a - lVar.f5198a;
                int i4 = lVar2.f5199b - lVar.f5199b;
                boolean z = C0654f.m1508c(i3) > 1 || C0654f.m1508c(i4) > 1;
                if (z) {
                    AbstractC0789l.m683d("writeOutCompressedPath: out of range:" + i3 + "," + i4);
                    i = 128;
                } else {
                    i = i3 + 1 + ((i4 + 1) << 2);
                }
                apVar.m1175c(i);
                if (z) {
                    apVar.mo1105a(lVar2.f5198a);
                    apVar.mo1105a(lVar2.f5199b);
                }
                lVar = lVar2;
            }
        }
        apVar.mo1107a("p");
    }

    /* renamed from: a */
    public void m985a(C0707k kVar) {
        if (!kVar.m1077e()) {
            this.f5121z = null;
            return;
        }
        kVar.m1088a("p", true);
        int f = kVar.m1076f();
        if (f > 160000 || f < 0) {
            AbstractC0789l.m683d("readInCompressedPath: Path too big at:" + f);
            f = -1;
        }
        if (f != -1) {
            this.f5118q = true;
            if (this.f5121z == null) {
                this.f5121z = new LinkedList();
            }
            this.f5121z.clear();
        }
        if (f > 0) {
            short t = kVar.m1062t();
            short t2 = kVar.m1062t();
            this.f5121z.add(new C0738l(t, t2));
            for (int i = 1; i < f; i++) {
                byte d = kVar.m1079d();
                if (d < 128) {
                    int i2 = (d & 3) - 1;
                    int i3 = ((d & 12) >> 2) - 1;
                    if (C0654f.m1508c(i2) > 1 || C0654f.m1508c(i3) > 1) {
                        AbstractC0789l.m683d("readInCompressedPath: out of range but shouldn't be:" + i2 + "," + i3 + " for: " + ((int) d));
                    }
                    t = (short) (t + i2);
                    t2 = (short) (t2 + i3);
                    this.f5121z.add(new C0738l(t, t2));
                } else {
                    AbstractC0789l.m683d("readInCompressedPath: out of range unpack:" + ((int) t) + "," + ((int) t2));
                    t = kVar.m1062t();
                    t2 = kVar.m1062t();
                    this.f5121z.add(new C0738l(t, t2));
                }
            }
        }
        kVar.m1078d("p");
    }

    /* renamed from: a */
    public void m988a() {
        C0731e a = this.f5101y.m973a(this.f5112k);
        if (a == null) {
            throw new RuntimeException("Could not get costs for:" + this.f5112k.toString());
        }
        this.f5122t = a.f5090d;
        this.f5123u = a.f5091e;
        this.f5124v = a.f5092f;
        this.f5125w = a.f5093g;
        this.f5126x = a.f5096j;
    }

    /* renamed from: b */
    public void m982b() {
        this.f5122t = null;
        this.f5123u = null;
        this.f5124v = null;
        this.f5125w = null;
        this.f5126x = null;
    }

    /* renamed from: a */
    public void m987a(EnumC0212ah ahVar, short s, short s2, Float f, boolean z) {
        if (ahVar == null) {
            throw new RuntimeException("MovementType is null");
        }
        this.f5112k = ahVar;
        this.f5105d = s;
        this.f5106e = s2;
        this.f5107f = f;
        this.f5108g = z;
        if (this.f5105d < 0) {
            this.f5105d = (short) 0;
        }
        if (this.f5106e < 0) {
            this.f5106e = (short) 0;
        }
        if (this.f5105d > this.f5101y.f5139p - 1) {
            this.f5105d = (short) (this.f5101y.f5139p - 1);
        }
        if (this.f5106e > this.f5101y.f5140q - 1) {
            this.f5106e = (short) (this.f5101y.f5140q - 1);
        }
        if (this.f5101y.m973a(ahVar) == null) {
            throw new RuntimeException("Could not get costs for:" + ahVar.toString());
        }
    }

    /* renamed from: a */
    public void m983a(short s, short s2, short s3) {
        if (s < 0) {
            s = 0;
        }
        if (s2 < 0) {
            s2 = 0;
        }
        if (s > this.f5101y.f5139p - 1) {
            s = (short) (this.f5101y.f5139p - 1);
        }
        if (s2 > this.f5101y.f5140q - 1) {
            s2 = (short) (this.f5101y.f5140q - 1);
        }
        this.f5109h = s;
        this.f5110i = s2;
        this.f5111j = s3;
    }

    /* renamed from: c */
    public LinkedList m981c() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!u.f5486bF.f4734z && !u.f5490bJ.m1996g()) {
            return this.f5121z;
        }
        if (this.f5118q) {
            return this.f5121z;
        }
        return null;
    }

    /* renamed from: d */
    protected boolean m980d() {
        return this.f5121z != null;
    }

    /* renamed from: a */
    protected void m984a(LinkedList linkedList) {
        this.f5121z = linkedList;
    }

    /* renamed from: e */
    public void m979e() {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0148b bVar = u.f5474bt;
        Paint paint = new Paint();
        paint.m4525a(2.0f);
        paint.m4522a(100, 0, 100, 0);
        u.f5477bw.mo195a(((this.f5109h * bVar.f727k) + bVar.f729m) - AbstractC0789l.m651u().f5506cb, ((this.f5110i * bVar.f728l) + bVar.f730n) - AbstractC0789l.m651u().f5507cc, this.f5111j * bVar.f727k, paint);
        paint.m4522a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 0, 0, 255);
        u.f5477bw.mo197a(((this.f5105d * bVar.f727k) + bVar.f729m) - AbstractC0789l.m651u().f5506cb, ((this.f5106e * bVar.f728l) + bVar.f730n) - AbstractC0789l.m651u().f5507cc, ((this.f5109h * bVar.f727k) + bVar.f729m) - AbstractC0789l.m651u().f5506cb, ((this.f5110i * bVar.f728l) + bVar.f730n) - AbstractC0789l.m651u().f5507cc, paint);
    }

    /* renamed from: f */
    public void m978f() {
        if (this.f5121z != null) {
            AbstractC0789l u = AbstractC0789l.m651u();
            C0148b bVar = u.f5474bt;
            if (this.f5121z.size() >= 1) {
                for (int i = 1; i < this.f5121z.size(); i++) {
                    C0738l lVar = (C0738l) this.f5121z.get(i);
                    C0738l lVar2 = (C0738l) this.f5121z.get(i - 1);
                    Paint paint = new Paint();
                    paint.m4522a(255, 0, 255, 0);
                    paint.m4525a(2.0f);
                    u.f5477bw.mo197a(((lVar.f5198a * bVar.f727k) + bVar.f729m) - AbstractC0789l.m651u().f5506cb, ((lVar.f5199b * bVar.f728l) + bVar.f730n) - AbstractC0789l.m651u().f5507cc, ((lVar2.f5198a * bVar.f727k) + bVar.f729m) - AbstractC0789l.m651u().f5506cb, ((lVar2.f5199b * bVar.f728l) + bVar.f730n) - AbstractC0789l.m651u().f5507cc, paint);
                }
            }
        }
    }
}
