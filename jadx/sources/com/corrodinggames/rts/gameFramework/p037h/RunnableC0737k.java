package com.corrodinggames.rts.gameFramework.p037h;

import android.graphics.Paint;
import android.os.Debug;
import android.util.Log;
import com.corrodinggames.rts.game.p012b.C0148b;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.h.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/k.class */
public final class RunnableC0737k implements Runnable {

    /* renamed from: B */
    private final C0734h f5169B;

    /* renamed from: b */
    public byte[] f5171b;

    /* renamed from: c */
    public byte[] f5172c;

    /* renamed from: d */
    public byte[] f5173d;

    /* renamed from: e */
    public short[] f5174e;

    /* renamed from: f */
    public byte[] f5175f;

    /* renamed from: C */
    private C0733g f5176C;

    /* renamed from: g */
    int f5177g;

    /* renamed from: h */
    int f5178h;

    /* renamed from: l */
    int[][] f5182l;

    /* renamed from: m */
    byte[][] f5183m;

    /* renamed from: n */
    C0731e f5184n;

    /* renamed from: t */
    static int f5190t = 0;

    /* renamed from: u */
    int f5191u;

    /* renamed from: v */
    Thread f5192v;

    /* renamed from: x */
    long f5194x;

    /* renamed from: y */
    long f5195y;

    /* renamed from: a */
    boolean f5170a = true;

    /* renamed from: i */
    int f5179i = 5;

    /* renamed from: j */
    int f5180j = 0;

    /* renamed from: k */
    int f5181k = 0;

    /* renamed from: o */
    final C0735i f5185o = new C0735i();

    /* renamed from: p */
    final C0735i f5186p = new C0735i();

    /* renamed from: q */
    final C0738l f5187q = new C0738l();

    /* renamed from: r */
    final C0738l f5188r = new C0738l();

    /* renamed from: s */
    volatile boolean f5189s = true;

    /* renamed from: w */
    Object f5193w = new Object();

    /* renamed from: z */
    Object f5196z = new Object();

    /* renamed from: A */
    Paint f5197A = new Paint();

    /* renamed from: a */
    public void m916a(C0733g gVar) {
        if (!this.f5189s) {
            throw new RuntimeException("setupNewPath: last path not yet finished");
        }
        this.f5189s = false;
        m918a(gVar.f5112k, gVar);
        gVar.f5119r = true;
        this.f5176C = gVar;
    }

    /* renamed from: a */
    public void m922a() {
        if (this.f5192v == null) {
            throw new RuntimeException("thread==null");
        }
        synchronized (this.f5193w) {
            this.f5193w.notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        AbstractC0789l.m702ag();
        while (this.f5170a) {
            synchronized (this.f5193w) {
                if (this.f5176C == null) {
                    try {
                        this.f5193w.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (this.f5176C != null) {
                m913b();
            }
        }
    }

    /* renamed from: b */
    public void m913b() {
        LinkedList e = m908e();
        synchronized (this.f5169B.f5156D) {
            this.f5176C.m968b();
            this.f5171b = null;
            this.f5172c = null;
            this.f5173d = null;
            this.f5174e = null;
            this.f5175f = null;
            this.f5176C.m970a(e);
            this.f5176C = null;
            this.f5189s = true;
            this.f5169B.f5156D.notifyAll();
        }
    }

    RunnableC0737k(C0734h hVar) {
        this.f5169B = hVar;
        int i = f5190t;
        f5190t = i + 1;
        this.f5191u = i;
    }

    /* renamed from: c */
    public synchronized void m911c() {
        if (this.f5192v != null) {
            throw new RuntimeException("thread!=null");
        }
        this.f5192v = new Thread(this);
        this.f5192v.setName("PathSolver-" + this.f5191u);
        this.f5192v.setPriority(10);
        this.f5192v.setDaemon(true);
        this.f5192v.start();
    }

    /* renamed from: a */
    public void m919a(C0148b bVar) {
        this.f5177g = bVar.f742r.f839n;
        this.f5178h = bVar.f742r.f840o;
        this.f5182l = new int[2][this.f5177g * this.f5178h];
        this.f5183m = new byte[2][this.f5177g * this.f5178h];
        m909d();
    }

    /* renamed from: d */
    public void m909d() {
        int i = (this.f5177g * this.f5178h * 42) + 1;
        this.f5179i += i;
        if (this.f5179i > Integer.MAX_VALUE - i || this.f5179i < 0 || 0 != 0) {
            this.f5179i = 5;
            for (int i2 = 0; i2 < 2; i2++) {
                for (int i3 = 0; i3 < this.f5177g; i3++) {
                    for (int i4 = 0; i4 < this.f5178h; i4++) {
                        this.f5182l[i2][(i3 * this.f5178h) + i4] = -1;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final int m920a(int i, int i2) {
        if (this.f5171b[(i * this.f5178h) + i2] == -1 || this.f5172c[(i * this.f5178h) + i2] == -1 || this.f5173d[(i * this.f5178h) + i2] == -1) {
            return -1;
        }
        return this.f5171b[(i * this.f5178h) + i2] + this.f5172c[(i * this.f5178h) + i2] + (this.f5173d[(i * this.f5178h) + i2] * 10);
    }

    /* renamed from: a */
    public void m918a(EnumC0212ah ahVar, C0733g gVar) {
        if (ahVar == null) {
            throw new RuntimeException("MovementType is null");
        }
        C0731e a = this.f5169B.m959a(ahVar);
        if (a == null) {
            throw new RuntimeException("Could not get costs for:" + ahVar.toString());
        }
        this.f5184n = a;
        this.f5171b = gVar.f5122t;
        this.f5172c = gVar.f5123u;
        this.f5173d = gVar.f5124v;
        this.f5174e = gVar.f5125w;
        this.f5175f = gVar.f5126x;
        if (this.f5171b == null) {
            throw new RuntimeException("linkToPath failed mapCosts_mapCosts is null");
        } else if (this.f5172c == null) {
            throw new RuntimeException("linkToPath failed mapCosts_buildingCosts is null");
        } else if (this.f5173d == null) {
            throw new RuntimeException("linkToPath failed mapCosts_objectCosts is null");
        }
    }

    /* renamed from: a */
    public void m917a(EnumC0212ah ahVar, short s, short s2, Float f) {
        if (C0734h.f5127a) {
            Log.m4033d("RustedWarfare", "path start is:" + ((int) s) + "," + ((int) s2));
        }
        C0738l lVar = new C0738l(s, s2);
        lVar.m902a(this, (byte) 0, this.f5179i);
        if (f == null) {
            lVar.m904a(this, (byte) 0, (byte) 0);
            lVar.m896b(this, (byte) 0, true);
        } else {
            lVar.m903a(this, (byte) 0, f.floatValue());
            lVar.m896b(this, (byte) 0, true);
        }
        lVar.m900a(this, (byte) 0, false);
    }

    /* renamed from: a */
    public void m914a(short s, short s2, short s3) {
        if (C0734h.f5127a) {
            Log.m4033d("RustedWarfare", "path end is:" + ((int) s) + "," + ((int) s2) + " size:" + ((int) s3));
        }
        C0738l lVar = new C0738l(s, s2);
        lVar.m904a(this, (byte) 1, (byte) 0);
        lVar.m896b(this, (byte) 1, true);
        lVar.m902a(this, (byte) 1, this.f5179i);
        lVar.m900a(this, (byte) 1, false);
    }

    /* renamed from: b */
    static int m912b(int i, int i2) {
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
    static int m910c(int i, int i2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:231:0x069f, code lost:
        r0.m899a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x06a8, code lost:
        if (r0 != false) goto L_0x06cd;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x06ae, code lost:
        if (com.corrodinggames.rts.gameFramework.p037h.C0734h.f5127a == false) goto L_0x06b9;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x06b1, code lost:
        android.util.Log.m4033d("RustedWarfare", "Not closedOnOtherSide");
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x06b9, code lost:
        r26 = r0.f5198a;
        r27 = r0.f5199b;
        r24 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x06cd, code lost:
        r0 = r0.m892f(r6, r32);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x06d8, code lost:
        if (r0 != null) goto L_0x0753;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x06db, code lost:
        android.util.Log.m4033d("RustedWarfare", "findPath: otherConnection==null");
        android.util.Log.m4033d("RustedWarfare", "currentNode:" + ((int) r0.f5198a) + "," + ((int) r0.f5199b));
        android.util.Log.m4033d("RustedWarfare", "currentNode cost normal:" + r0.m905a(r6, (byte) 0));
        android.util.Log.m4033d("RustedWarfare", "currentNode cost opposite:" + r0.m905a(r6, (byte) 1));
        r0.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0752, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0755, code lost:
        if (r25 != false) goto L_0x0785;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x075b, code lost:
        if (com.corrodinggames.rts.gameFramework.p037h.C0734h.f5127a == false) goto L_0x0766;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x075e, code lost:
        android.util.Log.m4033d("RustedWarfare", "closing path runFromOppositeSide=false");
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0766, code lost:
        r28 = r0.f5198a;
        r29 = r0.f5199b;
        r26 = r0.f5198a;
        r27 = r0.f5199b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0788, code lost:
        if (com.corrodinggames.rts.gameFramework.p037h.C0734h.f5127a == false) goto L_0x0793;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x078b, code lost:
        android.util.Log.m4033d("RustedWarfare", "closing path runFromOppositeSide=true");
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0793, code lost:
        r28 = r0.f5198a;
        r29 = r0.f5199b;
        r26 = r0.f5198a;
        r27 = r0.f5199b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x07af, code lost:
        r24 = true;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public LinkedList m908e() {
        C0735i iVar;
        byte b;
        byte b2;
        int a;
        int i;
        if (C0734h.f5135i && !AbstractC0789l.m638u().f5508bq) {
            Debug.startMethodTracing("pathTrace", 110000000);
        }
        int i2 = this.f5176C.f5113l ? 7 : 1;
        int i3 = this.f5176C.f5114m;
        if (C0734h.f5127a) {
            Log.m4033d("RustedWarfare", "starting path for:" + this.f5184n.f5087a.toString());
        }
        C0738l lVar = this.f5188r;
        C0738l lVar2 = this.f5187q;
        int i4 = this.f5178h;
        int i5 = this.f5177g;
        this.f5194x = AbstractC0789l.m747N();
        short s = this.f5176C.f5105d;
        short s2 = this.f5176C.f5106e;
        boolean z = this.f5176C.f5108g;
        m909d();
        m917a(this.f5176C.f5112k, this.f5176C.f5105d, this.f5176C.f5106e, this.f5176C.f5107f);
        short s3 = this.f5176C.f5109h;
        short s4 = this.f5176C.f5110i;
        short s5 = this.f5176C.f5111j;
        LinkedList linkedList = new LinkedList();
        if (s == s3 && s2 == s4) {
            if (C0734h.f5127a) {
                Log.m4033d("RustedWarfare", "no point pathing when start=end");
            }
            linkedList.clear();
            linkedList.add(new C0738l(s3, s4));
            return linkedList;
        } else if (this.f5184n.f5087a.equals(EnumC0212ah.NONE)) {
            if (C0734h.f5127a) {
                Log.m4033d("RustedWarfare", "no point pathing for none");
            }
            linkedList.clear();
            return linkedList;
        } else {
            int i6 = 0;
            short s6 = s3;
            short s7 = s4;
            short s8 = s5;
            if (this.f5174e != null) {
                short[] sArr = this.f5174e;
                short s9 = sArr[(s * i4) + s2];
                boolean z2 = true;
                if (s9 != -1) {
                    int i7 = s3 - s5;
                    while (true) {
                        short s10 = (short) i7;
                        if (s10 > s3 + s5) {
                            break;
                        }
                        int i8 = s4 - s5;
                        while (true) {
                            short s11 = (short) i8;
                            if (s11 <= s4 + s5) {
                                if (s10 >= 0 && s10 < i5 && s11 >= 0 && s11 < i4 && s9 == sArr[(s10 * i4) + s11]) {
                                    z2 = false;
                                }
                                i8 = s11 + 1;
                            }
                        }
                        i7 = s10 + 1;
                    }
                } else {
                    z2 = false;
                }
                if (z2) {
                    if (C0734h.f5127a) {
                        Log.m4033d("RustedWarfare", "end is blocked on isolated groups");
                    }
                    short s12 = s6;
                    short s13 = s7;
                    float f = -1.0f;
                    int i9 = s3 - 25;
                    while (true) {
                        short s14 = (short) i9;
                        if (s14 > s3 + 25) {
                            break;
                        }
                        int i10 = s4 - 25;
                        while (true) {
                            short s15 = (short) i10;
                            if (s15 <= s4 + 25) {
                                if (s14 >= 0 && s14 < i5 && s15 >= 0 && s15 < i4 && (s9 == sArr[(s14 * i4) + s15] || sArr[(s14 * i4) + s15] == 0)) {
                                    float a2 = C0654f.m1520a(s14, s15, s3, s4);
                                    if (f == -1.0f || a2 < f) {
                                        f = a2;
                                        s12 = s14;
                                        s13 = s15;
                                        s8 = 0;
                                    }
                                }
                                i10 = s15 + 1;
                            }
                        }
                        i9 = s14 + 1;
                    }
                    if (f == -1.0f) {
                        for (short s16 = 0; s16 < i5; s16 = (short) (s16 + 1)) {
                            for (short s17 = 0; s17 < i4; s17 = (short) (s17 + 1)) {
                                if (s9 == sArr[(s16 * i4) + s17] || sArr[(s16 * i4) + s17] == 0) {
                                    float a3 = C0654f.m1520a(s16, s17, s3, s4);
                                    if (f == -1.0f || a3 < f) {
                                        f = a3;
                                        s12 = s16;
                                        s13 = s17;
                                        s8 = 0;
                                    }
                                }
                            }
                        }
                    }
                    s6 = s12;
                    s7 = s13;
                    if (C0734h.f5127a) {
                        Log.m4033d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.f5194x));
                    }
                }
            }
            boolean z3 = true;
            int i11 = s6 - s8;
            loop6: while (true) {
                short s18 = (short) i11;
                if (s18 > s6 + s8) {
                    break;
                }
                int i12 = s7 - s8;
                while (true) {
                    short s19 = (short) i12;
                    if (s19 <= s7 + s8) {
                        if (s18 >= 0 && s18 < i5 && s19 >= 0 && s19 < i4 && m920a(s18, s19) != -1) {
                            z3 = false;
                            break loop6;
                        }
                        i12 = s19 + 1;
                    }
                }
                i11 = s18 + 1;
            }
            if (z3) {
                short s20 = s6;
                short s21 = s7;
                float f2 = -1.0f;
                if (C0734h.f5127a) {
                    Log.m4033d("RustedWarfare", "end is blocked on non isolated groups");
                }
                int i13 = s6 - 9;
                while (true) {
                    short s22 = (short) i13;
                    if (s22 > s6 + 9) {
                        break;
                    }
                    int i14 = s7 - 9;
                    while (true) {
                        short s23 = (short) i14;
                        if (s23 <= s7 + 9) {
                            if (s22 >= 0 && s22 < i5 && s23 >= 0 && s23 < i4 && m920a(s22, s23) != -1) {
                                float a4 = C0654f.m1520a(s22, s23, s6, s7);
                                if (f2 == -1.0f || a4 < f2) {
                                    f2 = a4;
                                    s20 = s22;
                                    s21 = s23;
                                    s8 = 0;
                                }
                            }
                            i14 = s23 + 1;
                        }
                    }
                    i13 = s22 + 1;
                }
                if (f2 == -1.0f) {
                    for (short s24 = 0; s24 < i5; s24 = (short) (s24 + 1)) {
                        for (short s25 = 0; s25 < i4; s25 = (short) (s25 + 1)) {
                            if (m920a(s24, s25) != -1) {
                                float a5 = C0654f.m1520a(s24, s25, s6, s7);
                                if (f2 == -1.0f || a5 < f2) {
                                    f2 = a5;
                                    s20 = s24;
                                    s21 = s25;
                                    s8 = 0;
                                }
                            }
                        }
                    }
                }
                s6 = s20;
                s7 = s21;
                if (C0734h.f5127a) {
                    Log.m4033d("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.f5194x));
                }
            }
            if (C0734h.f5127a && !(s6 == s3 && s7 == s4)) {
                Log.m4033d("RustedWarfare", "Moved end to fakeEndX:" + ((int) s6) + " fakeEndY:" + ((int) s7));
            }
            this.f5185o.m930a(s6, s7);
            this.f5185o.m929a(0, s, s2);
            this.f5186p.m930a(s, s2);
            m914a(s6, s7, s8);
            this.f5186p.m929a(0, s6, s7);
            boolean z4 = false;
            boolean z5 = false;
            short s26 = -1;
            short s27 = -1;
            short s28 = -1;
            short s29 = -1;
            int i15 = 400;
            int i16 = 0;
            while (true) {
                if (0 != 0) {
                    break;
                }
                i16++;
                if (this.f5176C.f5120s) {
                    linkedList.clear();
                    return linkedList;
                }
                i6++;
                if (i15 > 0) {
                    i15--;
                } else {
                    z5 = !z5;
                }
                byte b3 = 0;
                if (z5) {
                    b3 = 1;
                }
                if (!z5) {
                    iVar = this.f5185o;
                } else {
                    iVar = this.f5186p;
                }
                C0736j c = iVar.m926c();
                if (c != null) {
                    C0738l a6 = lVar2.m907a(c);
                    int a7 = a6.m905a(this, b3);
                    byte c2 = a6.m895c(this, b3);
                    boolean d = a6.m894d(this, b3);
                    boolean z6 = false;
                    if (!z5) {
                        if (a6.f5198a == s6 && a6.f5199b == s7) {
                            if (C0734h.f5127a) {
                                Log.m4033d("RustedWarfare", "Over goal: fakeEnd");
                            }
                            z6 = true;
                        }
                        if (C0654f.m1455c(a6.f5198a - s3) <= s5 && C0654f.m1455c(a6.f5199b - s4) <= s5) {
                            if (C0734h.f5127a) {
                                Log.m4033d("RustedWarfare", "Over goal: real end");
                            }
                            z6 = true;
                        }
                    }
                    boolean b4 = a6.m897b(this, (byte) (1 - b3));
                    if (b4 || z6) {
                        break;
                    }
                    a6.m900a(this, b3, true);
                    if (d) {
                        b2 = 0;
                        b = 7;
                    } else {
                        byte b5 = 2;
                        if (this.f5175f != null && this.f5175f[(a6.f5198a * i4) + a6.f5199b] > 1) {
                            b5 = 1;
                        }
                        b2 = (byte) (c2 - b5);
                        b = (byte) (c2 + b5);
                    }
                    for (byte b6 = b2; b6 <= b; b6 = (byte) (b6 + 1)) {
                        lVar.m899a(a6);
                        byte b7 = b6;
                        if (b7 > 7) {
                            b7 = (byte) (b7 - 8);
                        }
                        if (b7 < 0) {
                            b7 = (byte) (b7 + 8);
                        }
                        if (b7 == 0) {
                            lVar.f5198a = (short) (lVar.f5198a + 1);
                        }
                        if (b7 == 1) {
                            lVar.f5198a = (short) (lVar.f5198a + 1);
                            lVar.f5199b = (short) (lVar.f5199b + 1);
                        }
                        if (b7 == 2) {
                            lVar.f5199b = (short) (lVar.f5199b + 1);
                        }
                        if (b7 == 3) {
                            lVar.f5199b = (short) (lVar.f5199b + 1);
                            lVar.f5198a = (short) (lVar.f5198a - 1);
                        }
                        if (b7 == 4) {
                            lVar.f5198a = (short) (lVar.f5198a - 1);
                        }
                        if (b7 == 5) {
                            lVar.f5198a = (short) (lVar.f5198a - 1);
                            lVar.f5199b = (short) (lVar.f5199b - 1);
                        }
                        if (b7 == 6) {
                            lVar.f5199b = (short) (lVar.f5199b - 1);
                        }
                        if (b7 == 7) {
                            lVar.f5199b = (short) (lVar.f5199b - 1);
                            lVar.f5198a = (short) (lVar.f5198a + 1);
                        }
                        if (lVar.f5198a >= 0 && lVar.f5198a < i5 && lVar.f5199b >= 0 && lVar.f5199b < i4 && (a = lVar.m906a(this)) != -1) {
                            int a8 = lVar.m905a(this, b3);
                            if (!lVar.m897b(this, b3)) {
                                if (lVar.f5198a == a6.f5198a || lVar.f5199b == a6.f5199b) {
                                    i = a7 + 10 + a + 1;
                                } else if (!(m920a(lVar.f5198a, a6.f5199b) == -1 || m920a(a6.f5198a, lVar.f5199b) == -1)) {
                                    i = a7 + 14 + a + 1;
                                }
                                if (c2 != b7) {
                                    if (!d) {
                                        i += m912b(c2, b7);
                                    } else if (!z5) {
                                        if (z) {
                                            i += m910c(c2, b7);
                                        } else {
                                            i += m912b(c2, b7);
                                        }
                                    }
                                }
                                if (this.f5175f != null) {
                                    i += (4 - this.f5175f[(lVar.f5198a * i4) + lVar.f5199b]) * i2;
                                }
                                if (i3 > 0 && this.f5175f != null && this.f5175f[(lVar.f5198a * i4) + lVar.f5199b] <= i3) {
                                    i += 100;
                                }
                                if (a8 < this.f5179i || i < a8) {
                                    lVar.m904a(this, b3, b7);
                                    lVar.m900a(this, b3, false);
                                    lVar.m902a(this, b3, i);
                                    iVar.m929a(i - this.f5179i, lVar.f5198a, lVar.f5199b);
                                }
                            }
                        }
                    }
                } else if (!z5) {
                    if (C0734h.f5127a) {
                        Log.m4033d("RustedWarfare", "listNode==null for normal side ending path");
                    }
                }
            }
            if (C0734h.f5127a) {
                Log.m4033d("RustedWarfare", "grid path finshed in :" + i16 + " ticks");
                Log.m4033d("RustedWarfare", "grid path done in:" + (System.currentTimeMillis() - this.f5194x));
            }
            System.currentTimeMillis();
            if (!z4) {
                if (C0734h.f5127a) {
                    Log.m4033d("RustedWarfare", "could not find end node");
                }
                long currentTimeMillis = System.currentTimeMillis();
                float f3 = -1.0f;
                C0738l lVar3 = new C0738l();
                for (short s30 = 0; s30 < i5; s30 = (short) (s30 + 1)) {
                    for (short s31 = 0; s31 < i4; s31 = (short) (s31 + 1)) {
                        lVar3.m898a(s30, s31);
                        if (lVar3.m893e(this, (byte) 0)) {
                            float a9 = C0654f.m1520a(s30, s31, s3, s4);
                            if (f3 == -1.0f || a9 < f3) {
                                f3 = a9;
                                s26 = s30;
                                s27 = s31;
                            }
                        }
                    }
                }
                if (C0734h.f5127a) {
                    Log.m4033d("RustedWarfare", "got closest node in:" + (System.currentTimeMillis() - currentTimeMillis));
                }
            }
            linkedList.clear();
            if (!(s26 == -1 || s27 == -1)) {
                linkedList.addAll(m915a(m921a((byte) 0, s26, s27)));
            }
            if (!(s28 == -1 || s29 == -1)) {
                linkedList.addAll(m921a((byte) 1, s28, s29));
            }
            if (linkedList.size() > 1) {
                linkedList.remove(0);
            }
            this.f5195y = AbstractC0789l.m747N();
            if (C0734h.f5127a) {
                Log.m4033d("RustedWarfare", "path(" + this.f5176C.f5102a + ") finished in:" + (this.f5195y - this.f5194x));
            }
            if (C0734h.f5135i && !AbstractC0789l.m638u().f5508bq) {
                Debug.stopMethodTracing();
                C0734h.f5135i = false;
            }
            return linkedList;
        }
    }

    /* renamed from: a */
    public LinkedList m921a(byte b, short s, short s2) {
        LinkedList linkedList = new LinkedList();
        C0738l lVar = new C0738l(s, s2);
        linkedList.add(lVar);
        while (true) {
            C0738l f = lVar.m892f(this, b);
            if (f == null) {
                return linkedList;
            }
            linkedList.add(f);
            lVar = f;
        }
    }

    /* renamed from: a */
    public LinkedList m915a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.addFirst((C0738l) it.next());
        }
        return linkedList2;
    }
}
