package com.corrodinggames.rts.gameFramework.p037h;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.p012b.C0153e;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.h.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/h.class */
public final class C0734h {

    /* renamed from: a */
    static final boolean f5127a = false;

    /* renamed from: b */
    static boolean f5128b;

    /* renamed from: c */
    static boolean f5129c;

    /* renamed from: d */
    static boolean f5130d;

    /* renamed from: e */
    static boolean f5131e;

    /* renamed from: f */
    static int f5132f;

    /* renamed from: g */
    static boolean f5133g;

    /* renamed from: h */
    static ArrayList f5134h;

    /* renamed from: i */
    static boolean f5135i;

    /* renamed from: j */
    public static final boolean f5136j;

    /* renamed from: n */
    C0148b f5137n;

    /* renamed from: o */
    int f5138o;

    /* renamed from: p */
    short f5139p;

    /* renamed from: q */
    short f5140q;

    /* renamed from: u */
    public C0731e f5141u;

    /* renamed from: v */
    public C0731e f5142v;

    /* renamed from: w */
    public C0731e f5143w;

    /* renamed from: x */
    public C0731e f5144x;

    /* renamed from: y */
    public C0731e f5145y;

    /* renamed from: z */
    public C0731e f5146z;

    /* renamed from: A */
    public C0731e f5147A;

    /* renamed from: B */
    public C0731e f5148B;

    /* renamed from: k */
    public boolean f5149k = true;

    /* renamed from: l */
    RunnableC0737k f5150l = new RunnableC0737k(this);

    /* renamed from: m */
    boolean f5151m = true;

    /* renamed from: r */
    ArrayList f5152r = new ArrayList();

    /* renamed from: s */
    C0731e[] f5153s = new C0731e[0];

    /* renamed from: t */
    public Paint f5154t = new Paint();

    /* renamed from: C */
    Paint f5155C = new Paint();

    /* renamed from: D */
    Object f5156D = new Object();

    /* renamed from: F */
    LinkedList f5157F = new LinkedList();

    /* renamed from: G */
    LinkedList f5158G = new LinkedList();

    /* renamed from: H */
    Object f5159H = new Object();

    /* renamed from: E */
    ArrayList f5160E = new ArrayList();

    static {
        f5128b = !AbstractC0789l.f5548an;
        f5129c = false;
        f5130d = false;
        f5131e = false;
        f5132f = 20;
        f5133g = false;
        f5134h = new ArrayList();
        f5135i = false;
        f5136j = false;
    }

    /* renamed from: a */
    public C0731e m973a(EnumC0212ah ahVar) {
        C0731e[] eVarArr;
        for (C0731e eVar : this.f5153s) {
            if (eVar.f5087a == ahVar) {
                return eVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public boolean m972a(EnumC0212ah ahVar, int i, int i2) {
        return m970a(m973a(ahVar), i, i2);
    }

    /* renamed from: b */
    public boolean m959b(EnumC0212ah ahVar, int i, int i2) {
        return m969a(m973a(ahVar), i, i2, true);
    }

    /* renamed from: a */
    public boolean m970a(C0731e eVar, int i, int i2) {
        return m969a(eVar, i, i2, false);
    }

    /* renamed from: a */
    public boolean m969a(C0731e eVar, int i, int i2, boolean z) {
        if (!this.f5137n.m3987c(i, i2)) {
            return true;
        }
        if (eVar.f5087a == EnumC0212ah.f1555d) {
            return false;
        }
        int i3 = (i * this.f5140q) + i2;
        if ((!z && eVar.f5091e[i3] == -1) || eVar.f5090d[i3] == -1 || eVar.f5092f[i3] == -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final int m958b(C0731e eVar, int i, int i2) {
        if (!this.f5137n.m3987c(i, i2)) {
            return -1;
        }
        if (eVar.f5087a == EnumC0212ah.f1555d) {
            return 0;
        }
        int i3 = (i * this.f5140q) + i2;
        if (eVar.f5090d[i3] == -1 || eVar.f5091e[i3] == -1 || eVar.f5092f[i3] == -1) {
            return -1;
        }
        return eVar.f5090d[i3] + eVar.f5091e[i3] + (eVar.f5092f[i3] * 10);
    }

    /* renamed from: c */
    public final int m954c(C0731e eVar, int i, int i2) {
        if (!this.f5137n.m3987c(i, i2)) {
            return -1;
        }
        if (eVar.f5087a == EnumC0212ah.f1555d) {
            return 4;
        }
        if (eVar.f5096j == null) {
            return -1;
        }
        return eVar.f5096j[(i * this.f5140q) + i2];
    }

    /* renamed from: a */
    public boolean m975a(int i, int i2) {
        if (!this.f5137n.m3987c(i, i2)) {
            return true;
        }
        int i3 = (i * this.f5140q) + i2;
        if (this.f5147A.f5090d[i3] == -1 && this.f5144x.f5090d[i3] != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m960b(int i, int i2) {
        if (!this.f5137n.m3987c(i, i2)) {
            return true;
        }
        int i3 = (i * this.f5140q) + i2;
        if (this.f5146z.f5090d[i3] == -1 && this.f5148B.f5090d[i3] != -1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public synchronized void m974a(C0148b bVar, boolean z) {
        m953d();
        AbstractC0789l.m683d("PathEngine: Setting up map costs");
        boolean z2 = false;
        if (z && this.f5137n != null && this.f5137n == bVar && this.f5139p == bVar.f769r.f839n && this.f5140q == bVar.f769r.f840o) {
            if (this.f5138o == C0731e.m1003a(bVar)) {
                AbstractC0789l.m683d("PathEngine: Keeping existing map costs");
                z2 = true;
            } else {
                AbstractC0789l.m683d("PathEngine: Error: Map checksum does not match!!!");
            }
        }
        if (z2) {
        }
        this.f5137n = bVar;
        this.f5138o = C0731e.m1003a(bVar);
        this.f5139p = (short) bVar.f769r.f839n;
        this.f5140q = (short) bVar.f769r.f840o;
        this.f5152r.clear();
        this.f5153s = new C0731e[0];
        this.f5141u = new C0731e(this, EnumC0212ah.f1552a, this.f5139p, this.f5140q);
        this.f5142v = new C0731e(this, EnumC0212ah.f1553b, this.f5139p, this.f5140q);
        this.f5142v.m997b();
        this.f5142v.m1000a((AbstractC0515r) null);
        this.f5143w = new C0731e(this, EnumC0212ah.f1554c, this.f5139p, this.f5140q);
        this.f5144x = new C0731e(this, EnumC0212ah.f1556e, this.f5139p, this.f5140q);
        this.f5144x.m997b();
        this.f5144x.m1000a((AbstractC0515r) null);
        this.f5145y = new C0731e(this, EnumC0212ah.f1555d, this.f5139p, this.f5140q);
        this.f5146z = new C0731e(this, EnumC0212ah.f1557f, this.f5139p, this.f5140q);
        this.f5146z.m997b();
        this.f5146z.m1000a((AbstractC0515r) null);
        this.f5147A = new C0731e(this, EnumC0212ah.f1558g, this.f5139p, this.f5140q);
        this.f5147A.m997b();
        this.f5147A.m1000a((AbstractC0515r) null);
        this.f5148B = new C0731e(this, EnumC0212ah.f1559h, this.f5139p, this.f5140q);
        this.f5148B.m997b();
        this.f5148B.m1000a((AbstractC0515r) null);
        Iterator it = this.f5160E.iterator();
        while (it.hasNext()) {
            ((RunnableC0737k) it.next()).m933a(bVar);
        }
        this.f5150l.m933a(bVar);
        AbstractC0789l.m683d("PathEngine: Ready");
    }

    /* renamed from: a */
    public void m977a() {
        int i;
        int i2;
        int i3;
        AbstractC0789l u = AbstractC0789l.m651u();
        C0731e eVar = this.f5142v;
        Rect rect = new Rect();
        float f = u.f5508cd;
        float f2 = u.f5509ce;
        float f3 = u.f5512ch;
        float f4 = u.f5513ci;
        C0153e eVar2 = u.f5474bt.f769r;
        int i4 = (int) ((f * this.f5137n.f731o) - 1.0f);
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = (int) ((f2 * this.f5137n.f732p) - 1.0f);
        if (i5 < 0) {
            i5 = 0;
        }
        int i6 = (int) (((f + f3) * this.f5137n.f731o) + 1.0f);
        if (i6 > this.f5139p - 1) {
            i6 = this.f5139p - 1;
        }
        int i7 = (int) (((f2 + f4) * this.f5137n.f732p) + 1.0f);
        if (i7 > this.f5140q - 1) {
            i7 = this.f5140q - 1;
        }
        for (int i8 = i4; i8 < i6 + 1; i8++) {
            for (int i9 = i5; i9 < i7 + 1; i9++) {
                if (eVar2.m3943a(i8, i9) != null) {
                    int i10 = i8 * this.f5137n.f727k;
                    int i11 = i9 * this.f5137n.f728l;
                    rect.m4469a(i10, i11, i10 + this.f5137n.f727k, i11 + this.f5137n.f728l);
                    rect.m4470a((int) (-f), (int) (-f2));
                    boolean b = rect.m4466b((int) (u.f5481bA.f4365s / u.f5602cE), (int) (u.f5481bA.f4366t / u.f5602cE));
                    if (!f5131e || b) {
                        byte b2 = eVar.f5090d[(i8 * this.f5140q) + i9];
                        byte b3 = eVar.f5091e[(i8 * this.f5140q) + i9];
                        byte b4 = eVar.f5092f[(i8 * this.f5140q) + i9];
                        if (b2 == -1) {
                            i = 255;
                        } else {
                            i = b2 * 2;
                        }
                        if (b3 == -1) {
                            i2 = 255;
                        } else {
                            i2 = b3 * 2;
                        }
                        if (b4 == -1) {
                            i3 = 255;
                        } else {
                            int i12 = b4;
                            if (b4 != 0) {
                                i12 = b4 + 30;
                            }
                            i3 = (i12 == 1 ? 1 : 0) * 2;
                        }
                        this.f5155C.m4522a(128, i, i2, i3);
                        u.f5477bw.mo142b(rect, this.f5155C);
                        if (b && eVar.f5092f != null) {
                            u.f5477bw.mo158a("o:" + ((int) eVar.f5092f[(i8 * this.f5140q) + i9]), rect.m4462d(), rect.m4461e(), u.f5533cW);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m971a(AbstractC0515r rVar) {
        if (rVar != null) {
            AbstractC0171m.m3789b(rVar);
        }
        for (C0731e eVar : this.f5153s) {
            eVar.m993e();
        }
        this.f5142v.m1000a(rVar);
        this.f5146z.m1000a(rVar);
        this.f5147A.m1000a(rVar);
        this.f5148B.m1000a(rVar);
    }

    /* renamed from: b */
    public void m962b() {
        for (C0731e eVar : this.f5153s) {
            eVar.m992f();
        }
    }

    public C0734h() {
        this.f5160E.add(new RunnableC0737k(this));
        int c = C0654f.m1514c();
        if (c > 1) {
            AbstractC0789l.m694b("PathEngine", "We have " + c + " cores, creating extra solvers");
            this.f5160E.add(new RunnableC0737k(this));
        } else {
            AbstractC0789l.m694b("PathEngine", "We only have one core, using single solver");
        }
        Iterator it = this.f5160E.iterator();
        while (it.hasNext()) {
            ((RunnableC0737k) it.next()).m925c();
        }
    }

    /* renamed from: c */
    public void m956c() {
        Iterator it = this.f5157F.iterator();
        while (it.hasNext()) {
            ((C0733g) it.next()).f5120s = true;
        }
        this.f5157F.clear();
        m948h();
    }

    /* renamed from: d */
    public void m953d() {
        Iterator it = this.f5157F.iterator();
        while (it.hasNext()) {
            m967a((C0733g) it.next());
        }
        this.f5157F.clear();
        m948h();
    }

    /* renamed from: a */
    public void m968a(C0731e eVar, boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!z) {
            if (eVar.f5098k + 50 < u.f5585bg) {
                eVar.f5098k = u.f5585bg - 40;
                eVar.m992f();
            }
            eVar.m998a(z);
            return;
        }
        if (eVar.f5098k + 30 < u.f5585bg) {
            eVar.f5098k = u.f5585bg;
            eVar.m992f();
        }
        eVar.m998a(z);
    }

    /* renamed from: a */
    public C0733g m963a(boolean z) {
        return new C0733g(this, z);
    }

    /* renamed from: a */
    public void m966a(C0733g gVar, boolean z) {
        m965a(gVar, z, false);
    }

    /* renamed from: a */
    public void m965a(C0733g gVar, boolean z, boolean z2) {
        if (!this.f5151m) {
            AbstractC0789l.m694b("PathEngine", "Cannot start new path, not running");
            return;
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        m968a(m973a(gVar.f5112k), z);
        gVar.m988a();
        gVar.f5117p = 300.0f;
        int c = C0654f.m1508c(gVar.f5105d - gVar.f5109h);
        int c2 = C0654f.m1508c(gVar.f5106e - gVar.f5110i);
        if (c < 15 && c2 < 15) {
            gVar.f5117p = 12.0f;
        } else if (c < 50 && c2 < 50) {
            gVar.f5117p = 16.0f;
        } else if (c < 200 && c2 < 200) {
            gVar.f5117p = 24.0f;
        } else if (c < 400 && c2 < 400) {
            gVar.f5117p = 50.0f;
        } else if (c < 1000 && c2 < 1000) {
            gVar.f5117p = 100.0f;
        } else if (c < 2000 && c2 < 2000) {
            gVar.f5117p = 200.0f;
        }
        if (!u.f5486bF.f4734z && !u.f5490bJ.m1996g()) {
            if (c >= 1000 || c2 >= 1000) {
                gVar.f5117p = 360.0f;
            } else {
                gVar.f5117p = 180.0f;
            }
        }
        if (gVar.f5115n) {
            gVar.f5117p *= 2.0f;
            gVar.f5117p += 50.0f;
        }
        gVar.f5116o = gVar.f5117p;
        if (!this.f5149k || z2) {
            this.f5150l.m930a(gVar);
            this.f5150l.m927b();
            this.f5157F.add(gVar);
            return;
        }
        m957b(gVar);
        this.f5157F.add(gVar);
    }

    /* renamed from: a */
    public void m976a(float f) {
        m947i();
    }

    /* renamed from: b */
    public void m961b(float f) {
        m947i();
        m952d(f);
    }

    /* renamed from: c */
    public void m955c(float f) {
        if (f5133g) {
            Iterator it = f5134h.iterator();
            while (it.hasNext()) {
                C0733g gVar = (C0733g) it.next();
                gVar.m978f();
                gVar.m979e();
            }
        }
        if (f5130d) {
            m977a();
        }
    }

    /* renamed from: e */
    public boolean m951e() {
        Iterator it = this.f5157F.iterator();
        while (it.hasNext()) {
            C0733g gVar = (C0733g) it.next();
            if (gVar.f5117p <= 0.0f && !gVar.m980d()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: f */
    public String m950f() {
        Iterator it = this.f5157F.iterator();
        String str = null;
        int i = 0;
        while (it.hasNext()) {
            C0733g gVar = (C0733g) it.next();
            if (gVar.f5117p <= 0.0f && !gVar.m980d()) {
                if (str == null) {
                    str = "[distance:" + C0654f.m1527b(gVar.f5105d, gVar.f5106e, gVar.f5109h, gVar.f5110i) + ", allowedDelay:" + gVar.f5116o + " lowPriority:" + gVar.f5115n + "]";
                }
                i++;
            }
        }
        String str2 = "(total:" + i + ") ";
        if (str != null) {
            str2 = str2 + str;
        }
        return str2;
    }

    /* renamed from: d */
    private void m952d(float f) {
        Iterator it = this.f5157F.iterator();
        while (it.hasNext()) {
            C0733g gVar = (C0733g) it.next();
            if (gVar.f5117p <= 0.0f) {
                gVar.f5117p = 0.0f;
                gVar.f5118q = true;
                if (f5133g) {
                    f5134h.add(gVar);
                    if (f5134h.size() > 10) {
                        f5134h.remove(0);
                    }
                }
                if (!gVar.m980d()) {
                    if (AbstractC0789l.m651u().m707ao()) {
                        AbstractC0789l.m694b("PathEngine", "updateUnfinishedPaths: path wasn't solved, isGoingToBlockThisFrame did not protect");
                    }
                    m967a(gVar);
                }
                if (gVar.m980d()) {
                    it.remove();
                }
            } else {
                gVar.f5117p -= f;
            }
        }
    }

    /* renamed from: g */
    private C0733g m949g() {
        C0733g gVar = null;
        Iterator it = this.f5158G.iterator();
        while (it.hasNext()) {
            C0733g gVar2 = (C0733g) it.next();
            if (gVar == null || gVar.f5117p > gVar2.f5117p) {
                gVar = gVar2;
            }
        }
        if (gVar == null) {
            throw new RuntimeException("Failed to find any paths");
        } else if (this.f5158G.remove(gVar)) {
            return gVar;
        } else {
            throw new RuntimeException("Failed remove found path");
        }
    }

    /* renamed from: b */
    private void m957b(C0733g gVar) {
        synchronized (this.f5159H) {
            this.f5158G.add(gVar);
        }
    }

    /* renamed from: h */
    private void m948h() {
        synchronized (this.f5159H) {
            this.f5158G.clear();
        }
    }

    /* renamed from: i */
    private void m947i() {
        RunnableC0737k j;
        LinkedList linkedList = this.f5158G;
        if (linkedList.size() > 0) {
            synchronized (this.f5159H) {
                while (linkedList.size() > 0 && (j = m946j()) != null) {
                    C0733g g = m949g();
                    if (!g.f5119r) {
                        m964a(j, g);
                    }
                }
            }
        }
    }

    /* renamed from: j */
    private RunnableC0737k m946j() {
        Iterator it = this.f5160E.iterator();
        while (it.hasNext()) {
            RunnableC0737k kVar = (RunnableC0737k) it.next();
            if (kVar.f5194s) {
                return kVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public void m967a(C0733g gVar) {
        RunnableC0737k j;
        if (!gVar.f5119r) {
            while (true) {
                synchronized (this.f5156D) {
                    j = m946j();
                    if (j != null) {
                        break;
                    }
                    try {
                        this.f5156D.wait(2000L);
                    } catch (InterruptedException e) {
                    }
                }
            }
            m964a(j, gVar);
        }
        boolean z = false;
        long N = AbstractC0789l.m760N();
        while (true) {
            synchronized (this.f5156D) {
                if (gVar.m980d()) {
                    break;
                }
                z = true;
                m947i();
                try {
                    this.f5156D.wait(2000L);
                } catch (InterruptedException e2) {
                }
            }
            if (z && f5128b) {
                AbstractC0789l.m694b("PathEngine", "We were blocked path(" + gVar.f5102a + ") for:" + (AbstractC0789l.m760N() - N));
                return;
            }
        }
        if (z) {
        }
    }

    /* renamed from: a */
    private void m964a(RunnableC0737k kVar, C0733g gVar) {
        synchronized (gVar) {
            if (!gVar.f5119r) {
                kVar.m930a(gVar);
                kVar.m936a();
            }
        }
    }
}
