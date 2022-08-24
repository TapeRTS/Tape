package com.corrodinggames.rts.gameFramework.p042j;

import android.graphics.Paint;
import android.os.Debug;
import android.util.Log;
import com.corrodinggames.rts.game.p012b.C0173b;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.j.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/o.class */
public final class RunnableC0910o implements Runnable {

    /* renamed from: C */
    private final C0907l f6038C;

    /* renamed from: b */
    public byte[] f6040b;

    /* renamed from: c */
    public byte[] f6041c;

    /* renamed from: d */
    public byte[] f6042d;

    /* renamed from: e */
    public short[] f6043e;

    /* renamed from: f */
    public byte[] f6044f;

    /* renamed from: D */
    private C0906k f6045D;

    /* renamed from: g */
    int f6046g;

    /* renamed from: h */
    int f6047h;

    /* renamed from: l */
    int[][] f6051l;

    /* renamed from: m */
    byte[][] f6052m;

    /* renamed from: n */
    C0904i f6053n;

    /* renamed from: t */
    static LinkedList f6059t = new LinkedList();

    /* renamed from: u */
    static int f6060u;

    /* renamed from: v */
    int f6061v;

    /* renamed from: w */
    Thread f6062w;

    /* renamed from: y */
    long f6064y;

    /* renamed from: z */
    long f6065z;

    /* renamed from: a */
    boolean f6039a = true;

    /* renamed from: i */
    int f6048i = 5;

    /* renamed from: j */
    int f6049j = 0;

    /* renamed from: k */
    int f6050k = 0;

    /* renamed from: o */
    final C0908m f6054o = new C0908m();

    /* renamed from: p */
    final C0908m f6055p = new C0908m();

    /* renamed from: q */
    final C0911p f6056q = new C0911p();

    /* renamed from: r */
    final C0911p f6057r = new C0911p();

    /* renamed from: s */
    volatile boolean f6058s = true;

    /* renamed from: x */
    Object f6063x = new Object();

    /* renamed from: A */
    Object f6066A = new Object();

    /* renamed from: B */
    Paint f6067B = new Paint();

    /* renamed from: a */
    public void m1271a(C0906k c0906k) {
        if (!this.f6058s) {
            throw new RuntimeException("setupNewPath: last path not yet finished");
        }
        this.f6058s = false;
        m1273a(c0906k.f5978o, c0906k);
        c0906k.f5985v = true;
        this.f6045D = c0906k;
    }

    /* renamed from: a */
    public void m1277a() {
        if (this.f6062w == null) {
            throw new RuntimeException("thread==null");
        }
        synchronized (this.f6063x) {
            this.f6063x.notifyAll();
        }
    }

    public void run() {
        GameEngine.m1162ap();
        while (this.f6039a) {
            synchronized (this.f6063x) {
                if (this.f6045D == null) {
                    try {
                        this.f6063x.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (this.f6045D != null) {
                m1268b();
            }
        }
    }

    static {
        f6059t.add(new C0911p((short) -9, (short) -9));
        f6059t.add(new C0911p((short) -9, (short) -9));
        f6059t.add(new C0911p((short) -9, (short) -9));
        f6060u = 0;
    }

    /* renamed from: b */
    public void m1268b() {
        LinkedList m1263e;
        if (this.f6045D instanceof C0901f) {
            m1262f();
            m1263e = f6059t;
        } else {
            m1263e = m1263e();
        }
        synchronized (this.f6038C.f6025G) {
            this.f6045D.m1321f();
            this.f6040b = null;
            this.f6041c = null;
            this.f6042d = null;
            this.f6043e = null;
            this.f6044f = null;
            this.f6045D.m1326a(m1263e);
            this.f6045D = null;
            this.f6058s = true;
            this.f6038C.f6025G.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0910o(C0907l c0907l) {
        this.f6038C = c0907l;
        int i = f6060u;
        f6060u = i + 1;
        this.f6061v = i;
    }

    /* renamed from: c */
    public synchronized void m1266c() {
        if (this.f6062w != null) {
            throw new RuntimeException("thread!=null");
        }
        this.f6062w = new Thread(this);
        this.f6062w.setName("PathSolver-" + this.f6061v);
        this.f6062w.setPriority(10);
        this.f6062w.setDaemon(true);
        this.f6062w.start();
    }

    /* renamed from: a */
    public void m1274a(C0173b c0173b) {
        this.f6046g = c0173b.f832u.f903n;
        this.f6047h = c0173b.f832u.f904o;
        this.f6051l = new int[2][this.f6046g * this.f6047h];
        this.f6052m = new byte[2][this.f6046g * this.f6047h];
        m1264d();
    }

    /* renamed from: d */
    public void m1264d() {
        int i = (this.f6046g * this.f6047h * 42) + 1;
        this.f6048i += i;
        if (this.f6048i > Integer.MAX_VALUE - i || this.f6048i < 0 || 0 != 0) {
            this.f6048i = 5;
            for (int i2 = 0; i2 < 2; i2++) {
                for (int i3 = 0; i3 < this.f6046g; i3++) {
                    for (int i4 = 0; i4 < this.f6047h; i4++) {
                        this.f6051l[i2][(i3 * this.f6047h) + i4] = -1;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final int m1275a(int i, int i2) {
        if (this.f6040b[(i * this.f6047h) + i2] == -1 || this.f6041c[(i * this.f6047h) + i2] == -1 || this.f6042d[(i * this.f6047h) + i2] == -1) {
            return -1;
        }
        return this.f6040b[(i * this.f6047h) + i2] + this.f6041c[(i * this.f6047h) + i2] + (this.f6042d[(i * this.f6047h) + i2] * 10);
    }

    /* renamed from: a */
    public void m1273a(EnumC0246ao enumC0246ao, C0906k c0906k) {
        if (enumC0246ao == null) {
            throw new RuntimeException("MovementType is null");
        }
        C0904i m1314a = this.f6038C.m1314a(enumC0246ao);
        if (m1314a == null) {
            throw new RuntimeException("Could not get costs for:" + enumC0246ao.toString());
        }
        this.f6053n = m1314a;
        this.f6040b = c0906k.f5988y;
        this.f6041c = c0906k.f5989z;
        this.f6042d = c0906k.f5990A;
        this.f6043e = c0906k.f5991B;
        this.f6044f = c0906k.f5992C;
        if (this.f6040b == null) {
            throw new RuntimeException("linkToPath failed mapCosts_mapCosts is null");
        }
        if (this.f6041c == null) {
            throw new RuntimeException("linkToPath failed mapCosts_buildingCosts is null");
        }
        if (this.f6042d == null) {
            throw new RuntimeException("linkToPath failed mapCosts_objectCosts is null");
        }
    }

    /* renamed from: a */
    public void m1272a(EnumC0246ao enumC0246ao, short s, short s2, Float f) {
        if (C0907l.f5993a) {
            Log.m7106d("RustedWarfare", "path start is:" + ((int) s) + "," + ((int) s2));
        }
        C0911p c0911p = new C0911p(s, s2);
        c0911p.m1255a(this, (byte) 0, this.f6048i);
        if (f == null) {
            c0911p.m1257a(this, (byte) 0, (byte) 0);
            c0911p.m1249b(this, (byte) 0, true);
        } else {
            c0911p.m1256a(this, (byte) 0, f.floatValue());
            c0911p.m1249b(this, (byte) 0, true);
        }
        c0911p.m1253a(this, (byte) 0, false);
    }

    /* renamed from: a */
    public void m1269a(short s, short s2, short s3) {
        if (C0907l.f5993a) {
            Log.m7106d("RustedWarfare", "path end is:" + ((int) s) + "," + ((int) s2) + " size:" + ((int) s3));
        }
        C0911p c0911p = new C0911p(s, s2);
        c0911p.m1257a(this, (byte) 1, (byte) 0);
        c0911p.m1249b(this, (byte) 1, true);
        c0911p.m1255a(this, (byte) 1, this.f6048i);
        c0911p.m1253a(this, (byte) 1, false);
    }

    /* renamed from: b */
    static int m1267b(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        int i3 = i - i2;
        if (i3 < 0) {
            i3 = -i3;
        }
        if (i3 > 4) {
            i3 = 8 - i3;
        }
        if (i3 == 1) {
            return 4;
        }
        return i3 == 2 ? 21 : 25;
    }

    /* renamed from: c */
    static int m1265c(int i, int i2) {
        if (i == i2) {
            return 0;
        }
        int abs = Math.abs(i - i2);
        if (abs > 4) {
            abs = 8 - abs;
        }
        if (abs == 1) {
            return 4;
        }
        if (abs == 2) {
            return 21;
        }
        if (abs == 3) {
            return 4;
        }
        return (abs == 4 || abs == 5) ? 0 : 25;
    }

    /* JADX WARN: Code restructure failed: missing block: B:240:0x067e, code lost:
        r0.m1252a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:241:0x0688, code lost:
        if (r0 != false) goto L417;
     */
    /* JADX WARN: Code restructure failed: missing block: B:243:0x068e, code lost:
        if (com.corrodinggames.rts.gameFramework.p042j.C0907l.f5993a == false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x0691, code lost:
        android.util.Log.m7106d("RustedWarfare", "Not closedOnOtherSide");
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x0699, code lost:
        r27 = r0.f6068a;
        r28 = r0.f6069b;
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x06ad, code lost:
        r0 = r0.m1245f(r6, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:247:0x06b9, code lost:
        if (r0 != null) goto L421;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x06bc, code lost:
        android.util.Log.m7106d("RustedWarfare", "findPath: otherConnection==null");
        android.util.Log.m7106d("RustedWarfare", "currentNode:" + ((int) r0.f6068a) + "," + ((int) r0.f6069b));
        android.util.Log.m7106d("RustedWarfare", "currentNode cost normal:" + r0.m1258a(r6, (byte) 0));
        android.util.Log.m7106d("RustedWarfare", "currentNode cost opposite:" + r0.m1258a(r6, (byte) 1));
        r0.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x0733, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0736, code lost:
        if (r26 != false) goto L428;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x073c, code lost:
        if (com.corrodinggames.rts.gameFramework.p042j.C0907l.f5993a == false) goto L426;
     */
    /* JADX WARN: Code restructure failed: missing block: B:254:0x073f, code lost:
        android.util.Log.m7106d("RustedWarfare", "closing path runFromOppositeSide=false");
     */
    /* JADX WARN: Code restructure failed: missing block: B:255:0x0747, code lost:
        r29 = r0.f6068a;
        r30 = r0.f6069b;
        r27 = r0.f6068a;
        r28 = r0.f6069b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:257:0x0769, code lost:
        if (com.corrodinggames.rts.gameFramework.p042j.C0907l.f5993a == false) goto L431;
     */
    /* JADX WARN: Code restructure failed: missing block: B:258:0x076c, code lost:
        android.util.Log.m7106d("RustedWarfare", "closing path runFromOppositeSide=true");
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x0774, code lost:
        r29 = r0.f6068a;
        r30 = r0.f6069b;
        r27 = r0.f6068a;
        r28 = r0.f6069b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:260:0x0790, code lost:
        r25 = true;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.LinkedList m1263e() {
        /*
            Method dump skipped, instructions count: 3104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.p042j.RunnableC0910o.m1263e():java.util.LinkedList");
    }

    /* renamed from: a */
    public LinkedList m1276a(byte b, short s, short s2) {
        LinkedList linkedList = new LinkedList();
        C0911p c0911p = new C0911p(s, s2);
        linkedList.add(c0911p);
        while (true) {
            C0911p m1245f = c0911p.m1245f(this, b);
            if (m1245f != null) {
                linkedList.add(m1245f);
                c0911p = m1245f;
            } else {
                return linkedList;
            }
        }
    }

    /* renamed from: a */
    public LinkedList m1270a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.addFirst((C0911p) it.next());
        }
        return linkedList2;
    }

    /* renamed from: f */
    public void m1262f() {
        m1261g();
    }

    /* renamed from: g */
    public void m1261g() {
        byte b;
        byte b2;
        int m1259a;
        int i;
        C0901f c0901f = (C0901f) this.f6045D;
        C0902g c0902g = new C0902g(this.f6046g, this.f6047h);
        if (C0907l.f6004l && !GameEngine.getInstance().f6237bH) {
            Debug.startMethodTracing("pathTrace", 110000000);
        }
        if (C0907l.f5993a) {
            Log.m7106d("RustedWarfare", "starting path for:" + this.f6053n.f5951a.toString());
        }
        C0911p c0911p = this.f6057r;
        C0911p c0911p2 = this.f6056q;
        int i2 = this.f6047h;
        int i3 = this.f6046g;
        this.f6064y = GameEngine.m1214U();
        short s = c0901f.f5971h;
        short s2 = c0901f.f5972i;
        boolean z = c0901f.f5974k;
        m1264d();
        m1272a(c0901f.f5978o, c0901f.f5971h, c0901f.f5972i, c0901f.f5973j);
        short s3 = c0901f.f5975l;
        short s4 = c0901f.f5976m;
        short s5 = c0901f.f5977n;
        new LinkedList();
        if (this.f6053n.f5951a.equals(EnumC0246ao.f1702a)) {
            if (C0907l.f5993a) {
                Log.m7106d("RustedWarfare", "no point pathing for none");
                return;
            }
            return;
        }
        int i4 = 0;
        short s6 = s3;
        short s7 = s4;
        short s8 = s5;
        if (this.f6043e != null) {
            short[] sArr = this.f6043e;
            short s9 = sArr[(s * i2) + s2];
            boolean z2 = true;
            if (s9 == -1) {
                z2 = false;
            } else {
                int i5 = s3 - s5;
                while (true) {
                    short s10 = (short) i5;
                    if (s10 > s3 + s5) {
                        break;
                    }
                    int i6 = s4 - s5;
                    while (true) {
                        short s11 = (short) i6;
                        if (s11 <= s4 + s5) {
                            if (s10 >= 0 && s10 < i3 && s11 >= 0 && s11 < i2 && s9 == sArr[(s10 * i2) + s11]) {
                                z2 = false;
                            }
                            i6 = s11 + 1;
                        }
                    }
                    i5 = s10 + 1;
                }
            }
            if (z2) {
                if (C0907l.f5993a) {
                    Log.m7106d("RustedWarfare", "end is blocked on isolated groups");
                }
                short s12 = s6;
                short s13 = s7;
                float f = -1.0f;
                int i7 = s3 - 25;
                while (true) {
                    short s14 = (short) i7;
                    if (s14 > s3 + 25) {
                        break;
                    }
                    int i8 = s4 - 25;
                    while (true) {
                        short s15 = (short) i8;
                        if (s15 <= s4 + 25) {
                            if (s14 >= 0 && s14 < i3 && s15 >= 0 && s15 < i2 && (s9 == sArr[(s14 * i2) + s15] || sArr[(s14 * i2) + s15] == 0)) {
                                float m2366a = CommonUtils.m2366a(s14, s15, s3, s4);
                                if (f == -1.0f || m2366a < f) {
                                    f = m2366a;
                                    s12 = s14;
                                    s13 = s15;
                                    s8 = 0;
                                }
                            }
                            i8 = s15 + 1;
                        }
                    }
                    i7 = s14 + 1;
                }
                if (f == -1.0f) {
                    short s16 = 0;
                    while (true) {
                        short s17 = s16;
                        if (s17 >= i3) {
                            break;
                        }
                        short s18 = 0;
                        while (true) {
                            short s19 = s18;
                            if (s19 < i2) {
                                if (s9 == sArr[(s17 * i2) + s19] || sArr[(s17 * i2) + s19] == 0) {
                                    float m2366a2 = CommonUtils.m2366a(s17, s19, s3, s4);
                                    if (f == -1.0f || m2366a2 < f) {
                                        f = m2366a2;
                                        s12 = s17;
                                        s13 = s19;
                                        s8 = 0;
                                    }
                                }
                                s18 = (short) (s19 + 1);
                            }
                        }
                        s16 = (short) (s17 + 1);
                    }
                }
                s6 = s12;
                s7 = s13;
                if (C0907l.f5993a) {
                    Log.m7106d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.f6064y));
                }
            }
        }
        boolean z3 = true;
        int i9 = s6 - s8;
        loop6: while (true) {
            short s20 = (short) i9;
            if (s20 > s6 + s8) {
                break;
            }
            int i10 = s7 - s8;
            while (true) {
                short s21 = (short) i10;
                if (s21 <= s7 + s8) {
                    if (s20 < 0 || s20 >= i3 || s21 < 0 || s21 >= i2 || m1275a(s20, s21) == -1) {
                        i10 = s21 + 1;
                    } else {
                        z3 = false;
                        break loop6;
                    }
                }
            }
            i9 = s20 + 1;
        }
        if (z3) {
            short s22 = s6;
            short s23 = s7;
            float f2 = -1.0f;
            if (C0907l.f5993a) {
                Log.m7106d("RustedWarfare", "end is blocked on non isolated groups");
            }
            int i11 = s6 - 9;
            while (true) {
                short s24 = (short) i11;
                if (s24 > s6 + 9) {
                    break;
                }
                int i12 = s7 - 9;
                while (true) {
                    short s25 = (short) i12;
                    if (s25 <= s7 + 9) {
                        if (s24 >= 0 && s24 < i3 && s25 >= 0 && s25 < i2 && m1275a(s24, s25) != -1) {
                            float m2366a3 = CommonUtils.m2366a(s24, s25, s6, s7);
                            if (f2 == -1.0f || m2366a3 < f2) {
                                f2 = m2366a3;
                                s22 = s24;
                                s23 = s25;
                                s8 = 0;
                            }
                        }
                        i12 = s25 + 1;
                    }
                }
                i11 = s24 + 1;
            }
            if (f2 == -1.0f) {
                short s26 = 0;
                while (true) {
                    short s27 = s26;
                    if (s27 >= i3) {
                        break;
                    }
                    short s28 = 0;
                    while (true) {
                        short s29 = s28;
                        if (s29 < i2) {
                            if (m1275a(s27, s29) != -1) {
                                float m2366a4 = CommonUtils.m2366a(s27, s29, s6, s7);
                                if (f2 == -1.0f || m2366a4 < f2) {
                                    f2 = m2366a4;
                                    s22 = s27;
                                    s23 = s29;
                                    s8 = 0;
                                }
                            }
                            s28 = (short) (s29 + 1);
                        }
                    }
                    s26 = (short) (s27 + 1);
                }
            }
            s6 = s22;
            s7 = s23;
            if (C0907l.f5993a) {
                Log.m7106d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.f6064y));
            }
        }
        if (C0907l.f5993a && (s6 != s3 || s7 != s4)) {
            Log.m7106d("RustedWarfare", "Moved end to fakeEndX:" + ((int) s6) + " fakeEndY:" + ((int) s7));
        }
        this.f6054o.m1285a(s6, s7);
        this.f6054o.m1284a(0, s, s2);
        this.f6055p.m1285a(s, s2);
        m1269a(s6, s7, s8);
        this.f6055p.m1284a(0, s6, s7);
        int i13 = 0;
        while (0 == 0) {
            i13++;
            if (c0901f.f5986w) {
                return;
            }
            i4++;
            C0908m c0908m = this.f6055p;
            C0909n m1281c = c0908m.m1281c();
            if (m1281c == null) {
                break;
            }
            C0911p m1260a = c0911p2.m1260a(m1281c);
            int m1258a = m1260a.m1258a(this, (byte) 1);
            byte m1359a = (byte) (c0902g.m1359a(m1260a) - 1);
            boolean m1356b = c0902g.m1356b(m1260a);
            c0902g.m1357a(m1260a, true);
            if (m1356b) {
                b = 0;
                b2 = 7;
            } else {
                byte b3 = 2;
                if (this.f6044f != null && this.f6044f[(m1260a.f6068a * i2) + m1260a.f6069b] > 1) {
                    b3 = 1;
                }
                b = (byte) (m1359a - b3);
                b2 = (byte) (m1359a + b3);
            }
            byte b4 = b;
            while (true) {
                byte b5 = b4;
                if (b5 <= b2) {
                    c0911p.m1252a(m1260a);
                    byte b6 = b5;
                    if (b6 > 7) {
                        b6 = (byte) (b6 - 8);
                    }
                    if (b6 < 0) {
                        b6 = (byte) (b6 + 8);
                    }
                    if (b6 == 0) {
                        c0911p.f6068a = (short) (c0911p.f6068a + 1);
                    }
                    if (b6 == 1) {
                        c0911p.f6068a = (short) (c0911p.f6068a + 1);
                        c0911p.f6069b = (short) (c0911p.f6069b + 1);
                    }
                    if (b6 == 2) {
                        c0911p.f6069b = (short) (c0911p.f6069b + 1);
                    }
                    if (b6 == 3) {
                        c0911p.f6069b = (short) (c0911p.f6069b + 1);
                        c0911p.f6068a = (short) (c0911p.f6068a - 1);
                    }
                    if (b6 == 4) {
                        c0911p.f6068a = (short) (c0911p.f6068a - 1);
                    }
                    if (b6 == 5) {
                        c0911p.f6068a = (short) (c0911p.f6068a - 1);
                        c0911p.f6069b = (short) (c0911p.f6069b - 1);
                    }
                    if (b6 == 6) {
                        c0911p.f6069b = (short) (c0911p.f6069b - 1);
                    }
                    if (b6 == 7) {
                        c0911p.f6069b = (short) (c0911p.f6069b - 1);
                        c0911p.f6068a = (short) (c0911p.f6068a + 1);
                    }
                    if (c0911p.f6068a >= 0 && c0911p.f6068a < i3 && c0911p.f6069b >= 0 && c0911p.f6069b < i2 && (m1259a = c0911p.m1259a(this)) != -1) {
                        int m1258a2 = c0911p.m1258a(this, (byte) 1);
                        if (!c0902g.m1355c(c0911p)) {
                            if (c0911p.f6068a != m1260a.f6068a && c0911p.f6069b != m1260a.f6069b) {
                                if (m1275a(c0911p.f6068a, m1260a.f6069b) != -1 && m1275a(m1260a.f6068a, c0911p.f6069b) != -1) {
                                    i = m1258a + 14 + m1259a + 1;
                                }
                            } else {
                                i = m1258a + 10 + m1259a + 1;
                            }
                            if (m1359a != b6 && !m1356b) {
                                i += m1267b(m1359a, b6);
                            }
                            if (this.f6044f != null) {
                                i += (4 - this.f6044f[(c0911p.f6068a * i2) + c0911p.f6069b]) * 7;
                            }
                            if (0 > 0 && this.f6044f != null && this.f6044f[(c0911p.f6068a * i2) + c0911p.f6069b] <= 0) {
                                i += 100;
                            }
                            if (m1258a2 < this.f6048i || i < m1258a2) {
                                c0902g.m1358a(c0911p, (byte) (b6 + 1));
                                c0902g.m1357a(c0911p, false);
                                c0911p.m1255a(this, (byte) 1, i);
                                c0908m.m1284a(i - this.f6048i, c0911p.f6068a, c0911p.f6069b);
                            }
                        }
                    }
                    b4 = (byte) (b5 + 1);
                }
            }
        }
        if (C0907l.f5993a) {
            Log.m7106d("RustedWarfare", "grid path finshed in :" + i13 + " ticks");
            Log.m7106d("RustedWarfare", "grid path done in:" + (System.currentTimeMillis() - this.f6064y));
        }
        System.currentTimeMillis();
        c0902g.f5943c = s6;
        c0902g.f5944d = s7;
        c0901f.f5938b = c0902g;
        C0907l.f5997e = c0901f;
        this.f6065z = GameEngine.m1214U();
        if (C0907l.f5993a) {
            Log.m7106d("RustedWarfare", "path(" + c0901f.f5968e + ") finished in:" + (this.f6065z - this.f6064y));
        }
        if (C0907l.f6004l && !GameEngine.getInstance().f6237bH) {
            Debug.stopMethodTracing();
            C0907l.f6004l = false;
        }
    }
}
