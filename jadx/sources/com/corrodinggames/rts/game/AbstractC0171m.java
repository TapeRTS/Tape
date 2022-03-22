package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.p011a.C0118a;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0366j;
import com.corrodinggames.rts.game.units.custom.p020d.C0345a;
import com.corrodinggames.rts.game.units.custom.p020d.C0354d;
import com.corrodinggames.rts.game.units.p023d.C0404d;
import com.corrodinggames.rts.gameFramework.AbstractC0585bi;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.C0651e;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.EnumC0588bk;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0749f;
import com.corrodinggames.rts.gameFramework.p039j.C0757n;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import com.corrodinggames.rts.gameFramework.utility.C0851y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/m.class */
public abstract class AbstractC0171m extends AbstractC0585bi implements Comparable {

    /* renamed from: i */
    public int f1230i;

    /* renamed from: j */
    public final String f1231j = "Note to modifiers: Changing credits will not allow you to cheat in multiplayer games, but it will only break sync";

    /* renamed from: k */
    public boolean f1232k;

    /* renamed from: l */
    public boolean f1233l;

    /* renamed from: m */
    public int money;

    /* renamed from: n */
    public int f1235n;

    /* renamed from: o */
    public int f1236o;

    /* renamed from: p */
    public boolean f1237p;

    /* renamed from: q */
    public String f1238q;

    /* renamed from: r */
    public boolean f1239r;

    /* renamed from: s */
    public int f1240s;

    /* renamed from: t */
    public boolean f1241t;

    /* renamed from: ac */
    private boolean f1242ac;

    /* renamed from: ad */
    private int f1243ad;

    /* renamed from: u */
    public boolean f1244u;

    /* renamed from: ae */
    private int f1245ae;

    /* renamed from: v */
    public boolean f1246v;

    /* renamed from: w */
    public boolean f1247w;

    /* renamed from: x */
    public boolean f1248x;

    /* renamed from: y */
    public boolean f1249y;

    /* renamed from: z */
    public boolean f1250z;

    /* renamed from: A */
    public int f1251A;

    /* renamed from: B */
    public int f1252B;

    /* renamed from: C */
    public byte[][] f1253C;

    /* renamed from: D */
    public String f1254D;

    /* renamed from: E */
    public String f1255E;

    /* renamed from: F */
    public int f1256F;

    /* renamed from: G */
    public int f1257G;

    /* renamed from: H */
    public boolean f1258H;

    /* renamed from: I */
    public C0176r f1259I;

    /* renamed from: J */
    public boolean f1260J;

    /* renamed from: K */
    public byte f1261K;

    /* renamed from: L */
    public int f1262L;

    /* renamed from: M */
    public long f1263M;

    /* renamed from: N */
    public long f1264N;

    /* renamed from: O */
    public int f1265O;

    /* renamed from: P */
    public boolean f1266P;

    /* renamed from: Q */
    public boolean f1267Q;

    /* renamed from: R */
    public int f1268R;

    /* renamed from: S */
    int f1269S;

    /* renamed from: T */
    public Paint f1270T;

    /* renamed from: U */
    public Paint f1271U;

    /* renamed from: X */
    int f1272X;

    /* renamed from: Z */
    C0365i f1273Z;

    /* renamed from: aa */
    C0354d f1274aa;

    /* renamed from: a */
    public static int f1275a = 10;

    /* renamed from: b */
    public static int f1276b = 0;

    /* renamed from: c */
    public static int f1277c = 100;

    /* renamed from: d */
    public static int f1278d = f1275a + f1276b;

    /* renamed from: e */
    public static final AbstractC0171m f1279e = new C0162e(-1, false, "<blank>");

    /* renamed from: f */
    public static final AbstractC0171m f1280f = new C0161d(-2);

    /* renamed from: g */
    public static final AbstractC0171m f1281g = new C0161d(-1);

    /* renamed from: ab */
    private static AbstractC0171m[] f1282ab = new AbstractC0171m[f1278d];

    /* renamed from: h */
    public static AbstractC0171m f1283h = new C0177s(-99);

    /* renamed from: V */
    static int[] f1284V = new int[10];

    /* renamed from: W */
    static String[] f1285W = new String[10];

    /* renamed from: Y */
    static int f1286Y = -99;

    /* renamed from: a */
    public abstract void mo3720a(float f);

    /* renamed from: a */
    public int compareTo(AbstractC0171m mVar) {
        int i = this.f1268R - mVar.f1268R;
        if (i != 0) {
            return i;
        }
        int i2 = this.f1230i - mVar.f1230i;
        if (i2 != 0) {
            return i2;
        }
        if (this.f1238q == null || mVar.f1238q == null) {
            return 0;
        }
        return this.f1238q.compareTo(mVar.f1238q);
    }

    /* renamed from: b */
    public void m3788b(C0690ap apVar) {
        apVar.m1175c(this.f1230i);
        apVar.mo1109a(this.money);
        apVar.mo1109a(this.f1236o);
        apVar.m1178b(this.f1238q);
        apVar.mo1104a(this.f1260J);
        if (apVar.m1168g() > 26) {
            apVar.mo1109a(m3731w());
            apVar.m1172d("lastPingTimeReceivedAt");
            apVar.m1197a(this.f1263M);
        }
        if (apVar.m1168g() >= 55) {
            apVar.mo1104a(this.f1239r);
            apVar.mo1109a(this.f1240s);
        }
        if (apVar.m1168g() >= 91) {
            apVar.mo1109a(this.f1268R);
            apVar.m1175c(0);
        }
        if (apVar.m1168g() >= 97) {
            apVar.mo1104a(this.f1249y);
            apVar.mo1104a(this.f1250z);
        }
        if (apVar.m1168g() >= 125) {
            apVar.mo1104a(this.f1244u);
            apVar.mo1104a(this.f1242ac);
            apVar.mo1109a(this.f1243ad);
        }
        if (apVar.m1168g() >= 149) {
            apVar.m1178b(this.f1255E);
            apVar.mo1109a(this.f1256F);
        }
    }

    /* renamed from: c */
    public void m3775c(C0690ap apVar) {
        apVar.m1175c(0);
        apVar.mo1109a(m3731w());
        apVar.mo1104a(this.f1249y);
        apVar.mo1104a(this.f1250z);
    }

    /* renamed from: a */
    public void m3807a(C0707k kVar) {
        kVar.m1079d();
        this.f1262L = kVar.m1076f();
        this.f1263M = System.currentTimeMillis();
        this.f1249y = kVar.m1077e();
        this.f1250z = kVar.m1077e();
    }

    /* renamed from: b */
    public void m3787b(C0707k kVar) {
        m3806a(kVar, false);
    }

    /* renamed from: a */
    public void m3806a(C0707k kVar, boolean z) {
        if (!z) {
            m3750i(kVar.m1079d());
            this.money = kVar.m1076f();
            this.f1235n = 0;
            this.f1236o = kVar.m1076f();
            this.f1238q = kVar.m1072j();
            this.f1260J = kVar.m1077e();
        } else {
            kVar.m1079d();
            kVar.m1076f();
            kVar.m1076f();
            kVar.m1072j();
            kVar.m1077e();
        }
        if (kVar.m1085b() >= 14) {
            this.f1262L = kVar.m1076f();
            kVar.m1073i();
            this.f1263M = System.currentTimeMillis();
        }
        if (kVar.m1085b() >= 34 && kVar.m1081c() >= 55) {
            boolean e = kVar.m1077e();
            int f = kVar.m1076f();
            if (!z) {
                this.f1239r = e;
                this.f1240s = f;
            }
        } else if (AbstractC0789l.m651u().f5486bF.f4734z) {
            Hcat_Multiplaye.m1261f("AI was skipping in networked game, steam version:" + kVar.m1081c());
        }
        if (kVar.m1085b() >= 50 && kVar.m1081c() >= 91) {
            this.f1268R = kVar.m1076f();
            kVar.m1079d();
        }
        if (kVar.m1085b() >= 52 && kVar.m1081c() >= 97) {
            this.f1249y = kVar.m1077e();
            this.f1250z = kVar.m1077e();
        }
        if (kVar.m1085b() >= 70 && kVar.m1081c() >= 125) {
            boolean e2 = kVar.m1077e();
            boolean e3 = kVar.m1077e();
            int f2 = kVar.m1076f();
            if (!z) {
                this.f1244u = e2;
                this.f1242ac = e3;
                this.f1243ad = f2;
            }
        }
        if (kVar.m1085b() >= 90 && kVar.m1081c() >= 149) {
            String j = kVar.m1072j();
            int f3 = kVar.m1076f();
            if (!z) {
                this.f1255E = j;
                this.f1256F = f3;
            }
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0585bi
    /* renamed from: a */
    public void mo1654a(C0690ap apVar) {
        apVar.m1172d("Writing team: " + this.f1238q);
        m3788b(apVar);
        if (apVar.m1168g() >= 44) {
            apVar.m1175c(4);
            apVar.mo1104a(this.f1247w);
            apVar.mo1104a(this.f1246v);
            apVar.mo1104a(true);
            if (1 != 0) {
                m3766d(apVar);
            }
            this.f1274aa.m3204a(apVar);
            C0364h.m3117a(this.f1273Z, apVar);
            apVar.mo1104a(this.f1241t);
        }
    }

    /* renamed from: c */
    public void m3774c(C0707k kVar) {
        m3787b(kVar);
        if (kVar.m1085b() >= 26) {
            byte d = kVar.m1079d();
            this.f1247w = kVar.m1077e();
            if (d >= 1) {
                this.f1246v = kVar.m1077e();
            }
            if (kVar.m1077e()) {
                m3765d(kVar);
            }
            if (d >= 2) {
                this.f1274aa.m3203a(kVar);
            }
            if (d >= 3) {
                m3809a(C0364h.m3116a(kVar));
            }
            if (d >= 4) {
                this.f1241t = kVar.m1077e();
            }
        }
    }

    /* renamed from: d */
    public void m3766d(C0690ap apVar) {
        AbstractC0789l.m651u();
        apVar.m1172d("-- Saving fog --");
        apVar.mo1104a(this.f1253C != null);
        if (this.f1253C != null) {
            apVar.mo1109a(this.f1251A);
            apVar.mo1109a(this.f1252B);
            for (int i = 0; i < this.f1251A; i++) {
                for (int i2 = 0; i2 < this.f1252B; i2++) {
                    apVar.m1175c(this.f1253C[i][i2]);
                }
            }
        }
        apVar.m1172d("--End fog--");
    }

    /* renamed from: d */
    public void m3765d(C0707k kVar) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (kVar.m1077e()) {
            this.f1251A = kVar.m1076f();
            this.f1252B = kVar.m1076f();
            int i = this.f1251A;
            int i2 = this.f1252B;
            if (u.f5474bt != null) {
                i = u.f5474bt.f734y;
                i2 = u.f5474bt.f735z;
                if (!(this.f1251A == i && this.f1252B == i2)) {
                    AbstractC0789l.m695b("Map size does not match fog size: " + this.f1251A + "!=" + i + "|" + this.f1252B + "!=" + i2);
                }
            }
            if (1 != 0) {
                this.f1253C = new byte[i][i2];
            } else {
                this.f1253C = null;
            }
            for (int i3 = 0; i3 < this.f1251A; i3++) {
                for (int i4 = 0; i4 < this.f1252B; i4++) {
                    if (1 != 0) {
                        this.f1253C[i3][i4] = kVar.m1079d();
                    } else {
                        kVar.m1079d();
                    }
                }
            }
            return;
        }
        this.f1253C = null;
    }

    /* renamed from: a */
    public void m3817a() {
        if (this.f1253C != null) {
            for (int i = 0; i < this.f1251A; i++) {
                for (int i2 = 0; i2 < this.f1252B; i2++) {
                    this.f1253C[i][i2] = 0;
                }
            }
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5464bb == this) {
            u.f5485bE.f4478O = true;
            if (u.f5474bt != null) {
                u.f5474bt.m3970h();
                u.f5474bt.m3984d();
            }
        }
    }

    /* renamed from: b */
    public boolean m3797b() {
        return this.f1236o == -3;
    }

    /* renamed from: a */
    public static ArrayList m3799a(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1278d; i++) {
            AbstractC0171m mVar = f1282ab[i];
            if (mVar != null && (z || mVar.m3797b())) {
                arrayList.add(mVar);
            }
        }
        Collections.sort(arrayList);
        return arrayList;
    }

    /* renamed from: c */
    public static ArrayList m3782c() {
        return m3783b(false);
    }

    /* renamed from: b */
    public static ArrayList m3783b(boolean z) {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1278d; i++) {
            AbstractC0171m mVar = f1282ab[i];
            if (mVar != null && (z || !mVar.m3797b())) {
                arrayList.add(mVar);
            }
        }
        return arrayList;
    }

    /* renamed from: d */
    public static ArrayList m3771d() {
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < f1275a; i++) {
            AbstractC0171m mVar = f1282ab[i];
            if (mVar != null && !mVar.m3797b()) {
                arrayList.add(Integer.valueOf(mVar.f1236o));
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static int m3815a(int i, boolean z) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1275a; i3++) {
            AbstractC0171m mVar = f1282ab[i3];
            if (mVar != null && mVar.f1236o == i && !mVar.m3797b() && (!z || !mVar.f1239r)) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: e */
    public static int m3762e() {
        int i = 0;
        for (int i2 = 0; i2 < f1275a; i2++) {
            AbstractC0171m mVar = f1282ab[i2];
            if (mVar != null && !mVar.m3797b() && !mVar.f1246v && !mVar.f1247w) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: b */
    public static void m3794b(int i, boolean z) {
        if (i < 10 || i == f1275a) {
            return;
        }
        if (i > f1277c) {
            throw new IOException("setMaxTeamId: " + i + " is over limit of:" + f1277c);
        } else if (z || i > f1275a) {
            int i2 = i + f1276b;
            AbstractC0171m[] mVarArr = new AbstractC0171m[i2];
            for (int i3 = 0; i3 < f1282ab.length; i3++) {
                AbstractC0171m mVar = f1282ab[i3];
                if (i3 < mVarArr.length) {
                    mVarArr[i3] = mVar;
                }
            }
            f1282ab = mVarArr;
            f1275a = i;
            f1278d = i2;
        }
    }

    /* renamed from: a */
    public static String m3816a(int i) {
        return i == 0 ? "A" : i == 1 ? "B" : i == 2 ? "C" : i == 3 ? "D" : i == 4 ? "E" : i == 5 ? "F" : i == 6 ? "G" : i == 7 ? "H" : i == 8 ? "I" : i == 9 ? "J" : i == 10 ? "K" : i == -3 ? "S" : "" + i;
    }

    /* renamed from: f */
    public String m3757f() {
        return m3816a(this.f1236o);
    }

    /* renamed from: g */
    public void m3755g() {
        this.f1244u = false;
        this.f1242ac = false;
        this.f1243ad = -9999;
    }

    /* renamed from: h */
    public boolean m3753h() {
        return this.f1244u;
    }

    /* renamed from: i */
    public boolean m3751i() {
        return this.f1243ad >= 0;
    }

    /* renamed from: j */
    public void m3749j() {
        this.f1243ad = AbstractC0789l.m651u().f5467bh;
    }

    /* renamed from: k */
    public boolean m3747k() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (((this.f1246v || this.f1247w) && !u.f5486bF.f4763aH.f4809k) || this.f1239r || m3730x() || this.f1267Q) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public static int m3795b(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1275a; i3++) {
            AbstractC0171m mVar = f1282ab[i3];
            if (mVar != null && mVar.f1236o == i && mVar.m3751i() && mVar.m3747k()) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: c */
    public static int m3780c(int i) {
        int i2 = 0;
        for (int i3 = 0; i3 < f1275a; i3++) {
            AbstractC0171m mVar = f1282ab[i3];
            if (mVar != null && mVar.f1236o == i && mVar.m3747k()) {
                i2++;
            }
        }
        return i2;
    }

    /* renamed from: l */
    public static void m3745l() {
        for (int i = 0; i < f1275a; i++) {
            AbstractC0171m mVar = f1282ab[i];
            if (mVar != null) {
                mVar.f1243ad = -9999;
            }
        }
    }

    /* renamed from: d */
    public static void m3769d(int i) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.f5486bF.f4664A && !u.f5490bJ.m1995h()) {
            for (int i2 = 0; i2 < f1275a; i2++) {
                AbstractC0171m mVar = f1282ab[i2];
                if (mVar != null && mVar.f1236o == i && !mVar.f1242ac) {
                    mVar.f1242ac = true;
                    C0651e b = u.f5494bN.m1955b();
                    b.f4555i = mVar;
                    b.f4563r = true;
                    b.f4566u = 100;
                    u.f5486bF.m1355a(b);
                }
            }
        }
    }

    /* renamed from: e */
    public static void m3760e(int i) {
        AbstractC0171m[] mVarArr;
        int i2 = -9999;
        for (int i3 = 0; i3 < f1275a; i3++) {
            AbstractC0171m mVar = f1282ab[i3];
            if (mVar != null && mVar.f1236o == i && mVar.m3751i() && mVar.m3747k() && mVar.f1243ad > i2) {
                i2 = mVar.f1243ad;
            }
        }
        if (i2 >= 0 && C0851y.m433a(i2, 120000)) {
            for (AbstractC0171m mVar2 : f1282ab) {
                if (mVar2 != null && mVar2.f1236o == i) {
                    mVar2.f1243ad = -9999;
                }
            }
        }
    }

    /* renamed from: b */
    public boolean m3793b(AbstractC0171m mVar) {
        if (!m3743m() || mVar == null || !m3768d(mVar)) {
            return false;
        }
        return true;
    }

    /* renamed from: m */
    public boolean m3743m() {
        if (this.f1249y || this.f1250z) {
            return true;
        }
        return false;
    }

    /* renamed from: n */
    public boolean m3741n() {
        if (AbstractC0789l.m651u().f5464bb == this) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public void m3772c(boolean z) {
        if (z) {
            this.f1256F = 1;
        } else {
            this.f1256F = 0;
        }
    }

    /* renamed from: o */
    public boolean m3739o() {
        return this.f1256F == 1;
    }

    /* renamed from: a */
    public final int m3798a(boolean z, boolean z2) {
        int i = this.f1259I.f1307c;
        if (z) {
            i += this.f1259I.f1309e;
        }
        if (z2) {
            i += this.f1259I.f1308d;
        }
        return i;
    }

    /* renamed from: p */
    public final int m3738p() {
        return this.f1259I.f1307c + this.f1259I.f1309e + this.f1259I.f1308d;
    }

    /* renamed from: a */
    public final int m3810a(C0364h hVar, boolean z, boolean z2) {
        Object[] a = this.f1259I.f1314i.m490a();
        int i = this.f1259I.f1314i.f5778a;
        for (int i2 = 0; i2 < i; i2++) {
            C0173o oVar = (C0173o) a[i2];
            if (oVar.f1293a == hVar) {
                int i3 = oVar.f1294b;
                if (z) {
                    i3 += oVar.f1295c;
                }
                if (z2) {
                    i3 += oVar.f1296d;
                }
                return i3;
            }
        }
        return 0;
    }

    /* renamed from: q */
    public boolean m3737q() {
        boolean z = false;
        C0176r e = m3758e(false);
        if (this.f1259I.f1306b != e.f1306b) {
            AbstractC0789l.m695b("unitCountExcludingBuildingsIncludingQueued: " + this.f1259I.f1306b + "!=" + e.f1306b + " (team:" + this.f1230i + " fails: " + this.f1269S + ")");
            this.f1269S++;
            z = true;
        }
        if (this.f1259I.f1312a != e.f1312a) {
            AbstractC0789l.m695b("unitsMax: " + this.f1259I.f1312a + "!=" + e.f1312a + " (team:" + this.f1230i + " fails: " + this.f1269S + ")");
            this.f1269S++;
            z = true;
        }
        if (this.f1259I.f1310f != e.f1310f) {
            AbstractC0789l.m695b("incomeRate: " + this.f1259I.f1310f + "!=" + e.f1310f + " (team:" + this.f1230i + " fails: " + this.f1269S + ")");
            this.f1269S++;
            z = true;
        }
        if (this.f1259I.f1309e != e.f1309e) {
            AbstractC0789l.m695b("incompleteUnitCountOfAllTypes: " + this.f1259I.f1309e + "!=" + e.f1309e + " (team:" + this.f1230i + " fails: " + this.f1269S + ")");
            this.f1269S++;
            z = true;
        }
        if (this.f1259I.f1308d != e.f1308d) {
            AbstractC0789l.m695b("queuedCountOfAllTypes: " + this.f1259I.f1308d + "!=" + e.f1308d + " (team:" + this.f1230i + " fails: " + this.f1269S + ")");
            this.f1269S++;
            z = true;
        }
        if (this.f1259I.f1307c != e.f1307c) {
            AbstractC0789l.m695b("unitCountOfAllTypesOnlyCompleted: " + this.f1259I.f1307c + "!=" + e.f1307c + " (team:" + this.f1230i + " fails: " + this.f1269S + ")");
            this.f1269S++;
            z = true;
        }
        if (!this.f1259I.f1313g.m3192c(e.f1313g)) {
            AbstractC0789l.m695b("customIncomeRate: " + this.f1259I.f1313g + "!=" + e.f1313g + " (team:" + this.f1230i + " fails: " + this.f1269S + ")");
            AbstractC0789l.m695b("currentCaches:" + this.f1259I.f1313g.m3202a(false, true, 30, true, true));
            AbstractC0789l.m695b("targetUnitCache:" + e.f1313g.m3202a(false, true, 30, true, true));
            this.f1269S++;
            z = true;
        }
        return z;
    }

    /* renamed from: e */
    private C0176r m3758e(boolean z) {
        AbstractC0789l u = AbstractC0789l.m651u();
        C0176r rVar = new C0176r();
        rVar.f1312a = u.f5470bk;
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar.f1441bB == this) {
                rVar.m3727a(afVar);
                if (z) {
                    afVar.f1442bC = true;
                }
            }
        }
        if (rVar.f1312a > u.f5471bl) {
            rVar.f1312a = u.f5471bl;
        }
        return rVar;
    }

    /* renamed from: d */
    public void m3763d(boolean z) {
        if (z || this.f1258H) {
            this.f1259I = m3758e(true);
            this.f1258H = false;
            if (this.f1257G < this.f1259I.f1306b) {
                this.f1257G = this.f1259I.f1306b;
            }
            if (!this.f1233l && this.f1259I.f1311h) {
                this.f1233l = true;
            }
            if (!this.f1232k && m3738p() > 0) {
                this.f1232k = true;
            }
            m3821N();
        }
    }

    /* renamed from: r */
    public int m3736r() {
        return (int) (this.f1259I.f1310f * m3728z());
    }

    /* renamed from: a */
    public int m3811a(C0345a aVar) {
        int a = (int) this.f1259I.f1313g.m3213a(aVar);
        AbstractC0789l.m651u();
        boolean z = false;
        if (aVar == C0345a.f2355l) {
            z = true;
        }
        if (z) {
            a = (int) (a * m3728z());
        }
        return a;
    }

    /* renamed from: s */
    public int m3735s() {
        return this.f1259I.f1306b;
    }

    /* renamed from: t */
    public int m3734t() {
        return this.f1259I.f1312a;
    }

    /* renamed from: u */
    public String m3733u() {
        int w = m3731w();
        if (w == -99 || this.f1239r) {
            return "";
        }
        if (w == -2 || w == -1) {
            return "(disconnected)";
        }
        return "(" + w + ")";
    }

    /* renamed from: v */
    public String m3732v() {
        int w = m3731w();
        if (w == -99) {
            return "HOST";
        }
        if (this.f1239r) {
            return "-";
        }
        if (w == -1) {
            return "N/A";
        }
        if (w == -2) {
            return "-";
        }
        if (m3739o()) {
            return w + " (HOST)";
        }
        return "" + w;
    }

    /* renamed from: w */
    public int m3731w() {
        if (this.f1263M == -1) {
            return -2;
        }
        if (this.f1263M < System.currentTimeMillis() - 5000) {
            return -1;
        }
        return this.f1262L;
    }

    /* renamed from: x */
    public boolean m3730x() {
        if (this.f1263M == -1 || this.f1263M >= System.currentTimeMillis() - 15000) {
            return false;
        }
        return true;
    }

    /* renamed from: y */
    public final int m3729y() {
        if (this.f1241t) {
            return this.f1240s;
        }
        AbstractC0789l u = AbstractC0789l.m651u();
        if ((u.f5486bF.f4734z || u.f5490bJ.m1996g()) && !u.f5486bF.f4735D) {
            return this.f1240s;
        }
        return AbstractC0789l.m651u().f5479by.aiDifficulty;
    }

    /* renamed from: z */
    public final float m3728z() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (u.m766H()) {
            return u.f5486bF.f4763aH.f4817h;
        }
        return 1.0f;
    }

    /* renamed from: A */
    public final float m3834A() {
        float f;
        if (!this.f1239r) {
            return 1.0f;
        }
        int y = m3729y();
        if (y > 0) {
            f = 1.0f + (y * 0.4f);
        } else {
            f = 1.0f + (y * 0.3f);
        }
        if (y == 3) {
            f += 1.5f;
        }
        if (f < 0.1f) {
            f = 0.1f;
        }
        return f;
    }

    /* renamed from: f */
    public final void m3756f(int i) {
        if (!this.f1239r) {
            m3754g(i);
        } else {
            m3754g((int) (m3834A() * i));
        }
    }

    /* renamed from: g */
    public final void m3754g(int i) {
        money_max((int) (i * m3728z()));
    }

    /* renamed from: h */
    public final void money_max(int i) {
        this.money += i;
        if (this.money > 999999999) {
            this.money = 999999999;
        }
    }

    /* renamed from: B */
    public static void m3833B() {
        try {
            m3794b(10, true);
            for (int i = 0; i < f1282ab.length; i++) {
                f1282ab[i] = null;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public static C0162e m3800a(String str) {
        if (str == null || str.equals("")) {
            AbstractC0789l.m695b("findExistingPlayer: No clientId id");
            return null;
        }
        for (int i = 0; i < f1282ab.length; i++) {
            AbstractC0171m mVar = f1282ab[i];
            if (mVar != null && str.equals(mVar.f1254D)) {
                if (mVar instanceof C0162e) {
                    return (C0162e) mVar;
                }
                AbstractC0789l.m695b("Player:" + i + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    /* renamed from: b */
    public static C0162e m3784b(String str) {
        if (str == null || str.equals("")) {
            AbstractC0789l.m695b("No id");
            return null;
        }
        for (int i = 0; i < f1282ab.length; i++) {
            AbstractC0171m mVar = f1282ab[i];
            if (mVar != null && str.equals(mVar.f1255E)) {
                if (mVar instanceof C0162e) {
                    return (C0162e) mVar;
                }
                AbstractC0789l.m695b("Player:" + i + " with matching clientId is not an instanceof player");
            }
        }
        return null;
    }

    /* renamed from: C */
    public static int m3832C() {
        for (int i = 0; i < f1275a; i++) {
            if (f1282ab[i] == null) {
                return i;
            }
        }
        return -1;
    }

    /* renamed from: D */
    public static int m3831D() {
        for (int i = f1275a; i < f1278d; i++) {
            if (f1282ab[i] == null) {
                return i;
            }
        }
        for (int i2 = f1275a - 1; i2 >= 0; i2--) {
            if (f1282ab[i2] == null) {
                return i2;
            }
        }
        return -1;
    }

    /* renamed from: E */
    public void m3830E() {
        for (int i = 0; i < f1282ab.length; i++) {
            if (f1282ab[i] == this) {
                f1282ab[i] = null;
            }
        }
    }

    public AbstractC0171m() {
        this.f1230i = -1;
        this.f1231j = "Note to modifiers: Changing credits will not allow you to cheat in multiplayer games, but it will only break sync";
        this.money = 4000;
        this.f1235n = 0;
        this.f1237p = false;
        this.f1243ad = -9999;
        this.f1245ae = -9999;
        this.f1258H = true;
        this.f1259I = new C0176r();
        this.f1262L = -1;
        this.f1263M = -1L;
        this.f1264N = -1L;
        this.f1265O = -1;
        this.f1268R = 0;
        this.f1270T = new C0760q();
        this.f1271U = new C0760q();
        this.f1272X = -2;
        this.f1273Z = C0364h.f2436d;
        this.f1274aa = new C0354d();
        this.f1239r = this instanceof C0118a;
    }

    public AbstractC0171m(int i) {
        this(i, true);
    }

    public AbstractC0171m(int i, boolean z) {
        this();
        m3779c(i, z);
    }

    /* renamed from: i */
    public void m3750i(int i) {
        m3779c(i, true);
    }

    /* renamed from: c */
    public void m3779c(int i, boolean z) {
        if (this.f1230i != i) {
            if (z) {
                m3830E();
            }
            this.f1230i = i;
            this.f1236o = i;
            if (z && i != -3) {
                AbstractC0171m mVar = f1282ab[i];
                if (mVar != null) {
                    mVar.m3773c("Being replaced");
                }
                f1282ab[i] = this;
            }
            int F = m3829F();
            this.f1270T.m4502b(F);
            this.f1271U.m4502b(Color.m4546a(Color.m4548a(F), (int) (Color.m4544b(F) * 0.5f), (int) (Color.m4543c(F) * 0.5f), (int) (Color.m4542d(F) * 0.5f)));
        }
    }

    /* renamed from: j */
    public boolean m3748j(int i) {
        if (this.money >= i || i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public boolean m3746k(int i) {
        if (this.money + this.f1235n >= i || i == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean m3778c(AbstractC0171m mVar) {
        return (mVar == f1281g || this == f1281g || this.f1236o == mVar.f1236o) ? false : true;
    }

    /* renamed from: d */
    public final boolean m3768d(AbstractC0171m mVar) {
        if (mVar == f1281g && this == f1281g) {
            return true;
        }
        return (mVar == f1281g || this == f1281g || this.f1236o != mVar.f1236o) ? false : true;
    }

    /* renamed from: F */
    public int m3829F() {
        return m3742m(this.f1230i);
    }

    /* renamed from: G */
    public static void m3828G() {
        AbstractC0789l u = AbstractC0789l.m651u();
        try {
            m3764d(u.f5479by.teamColors);
        } catch (IllegalArgumentException e) {
            AbstractC0789l.m727a("initColors: Failed to read setting: '" + u.f5479by.teamColors + "': " + e.getMessage(), (Throwable) e);
            m3764d("#00ff00,#d02013,#0463f3,#ffff40,#00ffff,#d0f8f7,#000000,#ff00ea,#ff7f18,#9368c4");
        }
        try {
            m3759e(u.f5479by.teamColorsNames);
        } catch (IllegalArgumentException e2) {
            AbstractC0789l.m727a("initColors: Failed to read setting: '" + u.f5479by.teamColorsNames + "': " + e2.getMessage(), (Throwable) e2);
            m3759e("GREEN,RED,BLUE,YELLOW,CYAN,WHITE,BLACK,PINK,ORANGE,PURPLE");
        }
    }

    /* renamed from: d */
    private static void m3764d(String str) {
        String[] split = str.split(",");
        if (split.length != 10) {
            throw new IllegalArgumentException("Expected 10 hex colors");
        }
        for (int i = 0; i < 10; i++) {
            f1284V[i] = Color.m4545a(split[i]);
        }
    }

    /* renamed from: e */
    private static void m3759e(String str) {
        String[] split = str.split(",");
        if (split.length != 10) {
            throw new IllegalArgumentException("Expected 10 team color names");
        }
        for (int i = 0; i < 10; i++) {
            f1285W[i] = split[i];
        }
    }

    /* renamed from: H */
    public int m3827H() {
        if (this.f1236o == -3) {
            return m3742m(-3);
        }
        return m3744l(this.f1230i);
    }

    /* renamed from: l */
    public static int m3744l(int i) {
        if (i >= f1275a) {
            return m3742m(-3);
        }
        return m3742m(i % 2);
    }

    /* renamed from: m */
    public static int m3742m(int i) {
        if (i >= 0 && i < 10) {
            return f1284V[i];
        }
        if (i == -3) {
            return Color.m4546a(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 90, 90, 90);
        }
        return -7829368;
    }

    /* renamed from: I */
    public String m3826I() {
        int M;
        if (this.f1230i != -1 && this.f1230i != -2 && (M = m3822M()) >= 0 && M < 10) {
            return f1285W[M];
        }
        return "GRAY";
    }

    /* renamed from: a */
    public static C0748e[] m3805a(C0748e eVar) {
        return m3803a(eVar, EnumC0172n.f1287a, false);
    }

    /* renamed from: a */
    public static C0748e[] m3803a(C0748e eVar, EnumC0172n nVar, boolean z) {
        if (!z) {
            return m3786b(eVar, nVar);
        }
        return m3804a(eVar, nVar);
    }

    /* renamed from: a */
    public static C0748e[] m3804a(C0748e eVar, EnumC0172n nVar) {
        C0748e[] eVarArr = new C0748e[10];
        if ((AbstractC0789l.f5556aF && !AbstractC0789l.f5557aG) || nVar == EnumC0172n.f1291e) {
            for (int i = 0; i < eVarArr.length; i++) {
                eVarArr[i] = eVar;
            }
            return eVarArr;
        } else if (eVar.f5233a != null) {
            return eVar.f5233a;
        } else {
            C0586bj bjVar = AbstractC0789l.m651u().f5492bL;
            bjVar.m1970a(EnumC0588bk.f4076D);
            for (int i2 = 0; i2 < eVarArr.length; i2++) {
                int m = m3742m(i2);
                if (i2 == 0) {
                    eVarArr[i2] = eVar;
                } else {
                    eVarArr[i2] = new C0749f(eVar, m, nVar, i2);
                }
            }
            bjVar.m1965b(EnumC0588bk.f4076D);
            eVar.f5233a = eVarArr;
            return eVarArr;
        }
    }

    /* renamed from: b */
    public static C0748e[] m3786b(C0748e eVar, EnumC0172n nVar) {
        C0748e[] eVarArr = new C0748e[10];
        if ((AbstractC0789l.f5556aF && !AbstractC0789l.f5557aG) || nVar == EnumC0172n.f1291e) {
            for (int i = 0; i < eVarArr.length; i++) {
                eVarArr[i] = eVar;
            }
            return eVarArr;
        } else if (eVar.f5233a != null) {
            return eVar.f5233a;
        } else {
            C0586bj bjVar = AbstractC0789l.m651u().f5492bL;
            bjVar.m1970a(EnumC0588bk.f4076D);
            int[] iArr = new int[10];
            int[] iArr2 = new int[10];
            for (int i2 = 0; i2 < iArr.length; i2++) {
                iArr[i2] = m3742m(i2);
                iArr2[i2] = i2;
            }
            for (int i3 = 0; i3 < eVarArr.length; i3++) {
                if (i3 != 0) {
                    eVarArr[i3] = eVar.mo53g();
                    eVarArr[i3].mo51i();
                }
            }
            eVar.mo51i();
            if (nVar == EnumC0172n.f1288b) {
                m3785b(eVar, eVarArr, iArr);
            } else if (nVar == EnumC0172n.f1290d) {
                m3801a(eVar, eVarArr, iArr, iArr2);
            } else {
                m3802a(eVar, eVarArr, iArr);
            }
            for (int i4 = 0; i4 < eVarArr.length; i4++) {
                if (eVarArr[i4] != null) {
                    eVarArr[i4].mo47o();
                    eVarArr[i4].mo44r();
                }
            }
            eVar.mo45q();
            eVarArr[0] = eVar;
            bjVar.m1965b(EnumC0588bk.f4076D);
            eVar.f5233a = eVarArr;
            return eVarArr;
        }
    }

    /* renamed from: a */
    public static void m3802a(C0748e eVar, C0748e[] eVarArr, int[] iArr) {
        int b;
        int l = eVar.mo349l();
        int k = eVar.mo350k();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = Color.m4544b(iArr[i]);
            iArr3[i] = Color.m4543c(iArr[i]);
            iArr4[i] = Color.m4542d(iArr[i]);
        }
        for (int i2 = 0; i2 < k; i2++) {
            for (int i3 = 0; i3 < l; i3++) {
                int a = eVar.mo62a(i3, i2);
                int a2 = C0757n.m863a(a);
                if (a2 != 0) {
                    int c = C0757n.m858c(a);
                    if (c > 0 && (b = C0757n.m859b(a)) == C0757n.m857d(a)) {
                        if (b == 0) {
                            for (int i4 = 0; i4 < eVarArr.length; i4++) {
                                if (eVarArr[i4] != null) {
                                    eVarArr[i4].mo61a(i3, i2, Color.m4546a(a2, (iArr2[i4] * c) >> 8, (iArr3[i4] * c) >> 8, (iArr4[i4] * c) >> 8));
                                }
                            }
                        } else if (c != b) {
                            float f = (c * 0.003921569f) - (b * 0.003921569f);
                            for (int i5 = 0; i5 < eVarArr.length; i5++) {
                                if (eVarArr[i5] != null) {
                                    eVarArr[i5].mo61a(i3, i2, Color.m4546a(a2, C0654f.m1524b((int) (b + (iArr2[i5] * f)), 0, 255), C0654f.m1524b((int) (b + (iArr3[i5] * f)), 0, 255), C0654f.m1524b((int) (b + (iArr4[i5] * f)), 0, 255)));
                                }
                            }
                        }
                    }
                } else if (a != 0) {
                    for (int i6 = 0; i6 < eVarArr.length; i6++) {
                        if (eVarArr[i6] != null) {
                            eVarArr[i6].mo61a(i3, i2, 0);
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3801a(C0748e eVar, C0748e[] eVarArr, int[] iArr, int[] iArr2) {
        int d;
        int l = eVar.mo349l();
        int k = eVar.mo350k();
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        int[] iArr5 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr3[i] = Color.m4544b(iArr[i]);
            iArr4[i] = Color.m4543c(iArr[i]);
            iArr5[i] = Color.m4542d(iArr[i]);
        }
        for (int i2 = 0; i2 < k; i2++) {
            for (int i3 = 0; i3 < l; i3++) {
                int a = eVar.mo62a(i3, i2);
                int a2 = Color.m4548a(a);
                if (a2 != 0) {
                    int c = Color.m4543c(a);
                    int b = Color.m4544b(a);
                    float c2 = C0654f.m1507c(C0654f.m1507c(b, c), Color.m4542d(a));
                    float f = C0654f.m1487f(C0654f.m1487f(C0654f.m1508c(b - c), C0654f.m1508c(c - d)), C0654f.m1508c(d - b));
                    if (f > 15.0f) {
                        for (int i4 = 0; i4 < eVarArr.length; i4++) {
                            if (eVarArr[i4] != null) {
                                float f2 = f / 255.0f;
                                eVarArr[i4].mo61a(i3, i2, Color.m4546a(a2, C0654f.m1524b((int) (c2 + (iArr3[i4] * f2)), 0, 255), C0654f.m1524b((int) (c2 + (iArr4[i4] * f2)), 0, 255), C0654f.m1524b((int) (c2 + (iArr5[i4] * f2)), 0, 255)));
                            }
                        }
                    }
                } else if (Color.m4544b(a) > 0 || Color.m4543c(a) > 0 || Color.m4542d(a) > 0) {
                    for (int i5 = 0; i5 < eVarArr.length; i5++) {
                        if (eVarArr[i5] != null) {
                            eVarArr[i5].mo61a(i3, i2, Color.m4546a(0, 0, 0, 0));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public static void m3785b(C0748e eVar, C0748e[] eVarArr, int[] iArr) {
        int l = eVar.mo349l();
        int k = eVar.mo350k();
        int[] iArr2 = new int[iArr.length];
        int[] iArr3 = new int[iArr.length];
        int[] iArr4 = new int[iArr.length];
        for (int i = 0; i < iArr.length; i++) {
            iArr2[i] = Color.m4544b(iArr[i]);
            iArr3[i] = Color.m4543c(iArr[i]);
            iArr4[i] = Color.m4542d(iArr[i]);
        }
        for (int i2 = 0; i2 < l; i2++) {
            for (int i3 = 0; i3 < k; i3++) {
                int a = eVar.mo62a(i2, i3);
                int a2 = Color.m4548a(a);
                if (a2 > 0) {
                    int b = Color.m4544b(a);
                    int c = Color.m4543c(a);
                    int d = Color.m4542d(a);
                    for (int i4 = 0; i4 < eVarArr.length; i4++) {
                        int i5 = (int) (b + (iArr2[i4] * 0.15f));
                        int i6 = (int) (c + (iArr3[i4] * 0.15f));
                        int i7 = (int) (d + (iArr4[i4] * 0.15f));
                        int b2 = C0654f.m1524b(i5, 0, 255);
                        int b3 = C0654f.m1524b(i6, 0, 255);
                        int b4 = C0654f.m1524b(i7, 0, 255);
                        if (eVarArr[i4] != null) {
                            eVarArr[i4].mo61a(i2, i3, Color.m4546a(a2, b2, b3, b4));
                        }
                    }
                }
            }
        }
    }

    /* renamed from: n */
    public static AbstractC0171m m3740n(int i) {
        if (i == -1) {
            return f1281g;
        }
        if (i == -2) {
            return f1280f;
        }
        if (i >= f1278d) {
            AbstractC0789l.m676f("team index too high: " + i);
            return null;
        } else if (i >= 0) {
            return f1282ab[i];
        } else {
            AbstractC0789l.m676f("team index too low: " + i);
            return null;
        }
    }

    /* renamed from: b */
    public void m3796b(float f) {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (this.f1272X > 0) {
            this.f1272X--;
            return;
        }
        if (this.f1272X == -2) {
            this.f1272X = this.f1230i;
        } else {
            this.f1272X = 10;
        }
        if (!(this.f1247w || u.f5490bJ.m1995h())) {
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = u.f5486bF.f4763aH.f4809k;
            AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
            int size = AbstractC0210af.f1473bj.size();
            for (int i = 0; i < size; i++) {
                AbstractC0210af afVar = a[i];
                if (afVar.f1441bB == this) {
                    if (!afVar.mo3588cC()) {
                        z = true;
                        if (!this.f1246v && (afVar.mo2699bx() || afVar.mo3620ai())) {
                            z2 = true;
                            break;
                        }
                    } else {
                        continue;
                    }
                } else if (z4 && afVar.f1441bB != null && afVar.f1441bB.m3768d(this) && !afVar.mo3588cC()) {
                    z3 = true;
                }
            }
            if (!z && !z3) {
                this.f1247w = true;
                m3817a();
                Iterator it = AbstractC0210af.f1473bj.iterator();
                while (it.hasNext()) {
                    AbstractC0210af afVar2 = (AbstractC0210af) it.next();
                    if (afVar2.f1441bB == this && !afVar2.mo1661o_()) {
                        afVar2.f1450bY = -1.0f;
                    }
                }
                u.f5486bF.m1258g(this);
            }
            if (!(z2 || this.f1246v || this.f1247w)) {
                this.f1246v = true;
                u.f5486bF.m1264f(this);
            }
        }
    }

    /* renamed from: a */
    public void m3808a(AbstractC0515r rVar) {
    }

    /* renamed from: b */
    public static void m3789b(AbstractC0515r rVar) {
        for (int i = 0; i < f1275a; i++) {
            AbstractC0171m mVar = f1282ab[i];
            if (mVar != null) {
                mVar.m3808a(rVar);
            }
        }
    }

    /* renamed from: a */
    public static void m3812a(AbstractC0210af afVar) {
        if (afVar.f1441bB != null && afVar.f1442bC && afVar.f1438bq) {
            AbstractC0171m mVar = afVar.f1441bB;
            afVar.f1442bC = false;
            mVar.f1259I.m3724b(afVar);
            afVar.mo3578cR();
        }
    }

    /* renamed from: b */
    public static void m3792b(AbstractC0210af afVar) {
        m3812a(afVar);
    }

    /* renamed from: c */
    public static void m3777c(AbstractC0210af afVar) {
        if (afVar.f1441bB != null && !afVar.f1442bC && afVar.f1438bq && !afVar.f1520bz) {
            afVar.f1442bC = true;
            AbstractC0171m mVar = afVar.f1441bB;
            mVar.f1259I.m3727a(afVar);
            afVar.mo3579cQ();
            if (!mVar.f1233l && mVar.f1259I.f1311h) {
                mVar.f1233l = true;
            }
            if (!mVar.f1232k) {
                mVar.f1232k = true;
            }
            mVar.m3821N();
        }
    }

    /* renamed from: J */
    public static void m3825J() {
        Iterator it = m3782c().iterator();
        while (it.hasNext()) {
            ((AbstractC0171m) it.next()).f1258H = true;
        }
    }

    /* renamed from: K */
    public static void m3824K() {
        if (AbstractC0789l.m651u().m768F()) {
            AbstractC0789l.m683d("Skipping updateAllCachesFromChangedMetadata due to desync risk");
            return;
        }
        for (int i = 0; i < f1275a; i++) {
            AbstractC0171m mVar = f1282ab[i];
            if (mVar != null) {
                mVar.f1258H = true;
            }
        }
    }

    /* renamed from: c */
    public static void m3781c(float f) {
        int b;
        AbstractC0789l u = AbstractC0789l.m651u();
        f1281g.mo3720a(f);
        for (int i = 0; i < f1275a; i++) {
            AbstractC0171m mVar = f1282ab[i];
            if (mVar != null) {
                mVar.mo3720a(f);
                mVar.m3796b(f);
                if (!mVar.f1242ac && (b = m3795b(mVar.f1236o)) > 0) {
                    if (b >= m3780c(mVar.f1236o)) {
                        m3769d(mVar.f1236o);
                        m3745l();
                    } else {
                        m3760e(mVar.f1236o);
                    }
                }
                if (mVar.f1244u) {
                    if (mVar.f1245ae < 0) {
                        mVar.f1245ae = u.f5467bh;
                    }
                    if (!mVar.f1247w) {
                        int i2 = 0;
                        Iterator it = AbstractC0210af.f1473bj.iterator();
                        while (it.hasNext()) {
                            AbstractC0210af afVar = (AbstractC0210af) it.next();
                            if (afVar.f1441bB == mVar && !afVar.mo1661o_()) {
                                boolean z = false;
                                int i3 = 1;
                                if (C0851y.m433a(mVar.f1245ae, 16000)) {
                                    z = true;
                                    i3 = 50;
                                } else if (C0851y.m433a(mVar.f1245ae, 6000)) {
                                    z = C0654f.m1553a(afVar, 0, 100) > 90;
                                    i3 = 20;
                                } else if (C0851y.m433a(mVar.f1245ae, 2000)) {
                                    z = C0654f.m1553a(afVar, 0, 100) > 98;
                                    i3 = 2;
                                }
                                if (afVar instanceof C0404d) {
                                    z = true;
                                }
                                if (z) {
                                    afVar.f1450bY = -1.0f;
                                    i2++;
                                    if (i2 > i3) {
                                        break;
                                    }
                                } else {
                                    continue;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (u.m765I() && u.f5479by.aiDifficulty != f1286Y) {
            u.f5486bF.m1318ah();
            f1286Y = u.f5479by.aiDifficulty;
        }
    }

    /* renamed from: d */
    public static void m3770d(float f) {
        f1281g.m3763d(false);
        for (int i = 0; i < f1275a; i++) {
            AbstractC0171m mVar = f1282ab[i];
            if (mVar != null) {
                mVar.m3763d(false);
            }
        }
    }

    /* renamed from: L */
    public static void m3823L() {
        f1281g.m3763d(false);
        for (int i = 0; i < f1275a; i++) {
            AbstractC0171m mVar = f1282ab[i];
            if (mVar != null && !mVar.m3797b() && !mVar.f1247w && !mVar.f1246v && !mVar.f1244u) {
                AbstractC0789l.m651u().f5486bF.m1271e(mVar);
            }
        }
    }

    /* renamed from: e */
    public static void m3761e(float f) {
        for (int i = 0; i < f1275a; i++) {
            AbstractC0171m mVar = f1282ab[i];
            if (mVar != null && (mVar instanceof C0118a)) {
                ((C0118a) mVar).m4157f(f);
            }
        }
    }

    /* renamed from: M */
    public int m3822M() {
        AbstractC0171m mVar;
        if (this.f1230i == -1 || this.f1230i == -2) {
            return 5;
        }
        int i = this.f1230i;
        if (i >= 10) {
            i %= 10;
        }
        if (f1275a > 10 && (mVar = AbstractC0789l.m651u().f5486bF.f4662x) != null && mVar != this && mVar.m3822M() == i) {
            if (i != 5) {
                i = 5;
            } else {
                i = 4;
            }
        }
        return i;
    }

    /* renamed from: N */
    public void m3821N() {
    }

    /* renamed from: a */
    public void m3809a(C0365i iVar) {
        this.f1273Z = iVar;
    }

    /* renamed from: O */
    public C0365i m3820O() {
        return this.f1273Z;
    }

    /* renamed from: b */
    public void m3790b(C0365i iVar) {
        C0365i O = m3820O();
        if (O == null || O.m3108b() == 0) {
            m3809a(iVar);
        } else if (!C0364h.m3113b(O, iVar)) {
            C0366j jVar = new C0366j(O);
            if (jVar.m3105a(iVar)) {
                m3809a(jVar.m3107a());
            }
        }
    }

    /* renamed from: c */
    public void m3776c(C0365i iVar) {
        C0365i O = m3820O();
        if (O != null && O.m3108b() != 0 && C0364h.m3118a(iVar, O)) {
            C0366j jVar = new C0366j(O);
            if (jVar.m3104b(iVar)) {
                m3809a(jVar.m3107a());
            }
        }
    }

    /* renamed from: P */
    public C0354d m3819P() {
        return this.f1274aa;
    }

    /* renamed from: b */
    public double m3791b(C0345a aVar) {
        return this.f1274aa.m3213a(aVar);
    }

    /* renamed from: a */
    public boolean m3813a(EnumC0174p pVar, AbstractC0171m mVar) {
        if (pVar == EnumC0174p.f1297a) {
            return mVar == this;
        }
        if (pVar == EnumC0174p.f1302f) {
            return true;
        }
        if (pVar == EnumC0174p.f1298b) {
            return m3768d(mVar);
        }
        if (pVar == EnumC0174p.f1299c) {
            return mVar != this && m3768d(mVar);
        }
        if (pVar == EnumC0174p.f1300d) {
            return m3778c(mVar);
        }
        if (pVar == EnumC0174p.f1301e) {
            return mVar == f1281g;
        }
        throw new RuntimeException("Unsupported type: " + pVar);
    }

    /* renamed from: d */
    public void m3767d(AbstractC0210af afVar) {
    }

    /* renamed from: Q */
    public void m3818Q() {
        AbstractC0789l.m683d("debugUnitCountByType for team:" + this.f1230i);
        C0835m mVar = new C0835m();
        AbstractC0210af[] a = AbstractC0210af.f1473bj.m456a();
        int size = AbstractC0210af.f1473bj.size();
        for (int i = 0; i < size; i++) {
            AbstractC0210af afVar = a[i];
            if (afVar.f1441bB == this && !afVar.f1520bz) {
                AbstractC0268al alVar = afVar.f1471db;
                boolean z = false;
                Iterator it = mVar.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    C0175q qVar = (C0175q) it.next();
                    if (qVar.f1304a == alVar) {
                        qVar.f1305b++;
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    C0175q qVar2 = new C0175q();
                    qVar2.f1304a = alVar;
                    qVar2.f1305b = 1;
                    mVar.add(qVar2);
                }
            }
        }
        AbstractC0789l.m683d("--- Units ---");
        int i2 = 0;
        Iterator it2 = mVar.iterator();
        while (it2.hasNext()) {
            C0175q qVar3 = (C0175q) it2.next();
            if (!qVar3.f1304a.mo3492k()) {
                AbstractC0789l.m683d(qVar3.f1304a.mo3494i() + " - count:" + qVar3.f1305b);
                i2 += qVar3.f1305b;
            }
        }
        AbstractC0789l.m683d("total:" + i2);
        AbstractC0789l.m683d("--- Buildings/Ignored in count ---");
        int i3 = 0;
        Iterator it3 = mVar.iterator();
        while (it3.hasNext()) {
            C0175q qVar4 = (C0175q) it3.next();
            if (qVar4.f1304a.mo3492k()) {
                AbstractC0789l.m683d(qVar4.f1304a.mo3494i() + " - count:" + qVar4.f1305b);
                i3 += qVar4.f1305b;
            }
        }
        AbstractC0789l.m683d("total:" + i3);
    }

    /* renamed from: c */
    public void m3773c(String str) {
        AbstractC0789l.m683d("Team(id: " + this.f1230i + ", name:" + this.f1238q + "):" + str);
    }
}
