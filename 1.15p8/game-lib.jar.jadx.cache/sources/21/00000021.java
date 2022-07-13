package com.corrodinggames.rts.gameFramework.path;

import android.graphics.Paint;
import android.os.Debug;
import android.util.Log;
import com.corrodinggames.rts.game.map.Map;
import com.corrodinggames.rts.game.units.MovementType;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Iterator;
import java.util.LinkedList;

/* renamed from: com.corrodinggames.rts.gameFramework.i.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/o.class */
public final class RunnableC0828o implements Runnable {

    /* renamed from: C */
    private final PathEngine f5591C;

    /* renamed from: b */
    public byte[] f5593b;

    /* renamed from: c */
    public byte[] f5594c;

    /* renamed from: d */
    public byte[] f5595d;

    /* renamed from: e */
    public short[] f5596e;

    /* renamed from: f */
    public byte[] f5597f;

    /* renamed from: D */
    private C0824k f5592D;

    /* renamed from: g */
    int f5598g;

    /* renamed from: h */
    int f5599h;

    /* renamed from: l */
    int[][] f5600l;

    /* renamed from: m */
    byte[][] f5601m;

    /* renamed from: n */
    C0822i currentMapCosts;

    /* renamed from: t */
    static LinkedList f5589t = new LinkedList();

    /* renamed from: u */
    static int f5590u = 0;

    /* renamed from: v */
    int f5603v;

    /* renamed from: w */
    Thread f5604w;

    /* renamed from: y */
    long startTime;

    /* renamed from: z */
    long f5606z;

    /* renamed from: a */
    boolean f5607a = true;

    /* renamed from: i */
    int f5608i = 5;

    /* renamed from: j */
    int f5609j = 0;

    /* renamed from: k */
    int f5610k = 0;

    /* renamed from: o */
    final C0826m f5611o = new C0826m();

    /* renamed from: p */
    final C0826m f5612p = new C0826m();

    /* renamed from: q */
    final C0829p f5613q = new C0829p();

    /* renamed from: r */
    final C0829p f5614r = new C0829p();

    /* renamed from: s */
    volatile boolean f5615s = true;

    /* renamed from: x */
    Object f5616x = new Object();

    /* renamed from: A */
    Object f5617A = new Object();

    /* renamed from: B */
    Paint f5618B = new Paint();

    /* renamed from: a */
    public void m1061a(C0824k c0824k) {
        if (!this.f5615s) {
            throw new RuntimeException("setupNewPath: last path not yet finished");
        }
        this.f5615s = false;
        m1063a(c0824k.f5532o, c0824k);
        c0824k.f5539v = true;
        this.f5592D = c0824k;
    }

    /* renamed from: a */
    public void m1067a() {
        if (this.f5604w == null) {
            throw new RuntimeException("thread==null");
        }
        synchronized (this.f5616x) {
            this.f5616x.notifyAll();
        }
    }

    @Override // java.lang.Runnable
    public void run() {
        GameEngine.m865am();
        while (this.f5607a) {
            synchronized (this.f5616x) {
                if (this.f5592D == null) {
                    try {
                        this.f5616x.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            if (this.f5592D != null) {
                m1058b();
            }
        }
    }

    static {
        f5589t.add(new C0829p((short) -9, (short) -9));
        f5589t.add(new C0829p((short) -9, (short) -9));
        f5589t.add(new C0829p((short) -9, (short) -9));
    }

    /* renamed from: b */
    public void m1058b() {
        LinkedList linkedList;
        if (this.f5592D instanceof C0819f) {
            m1052f();
            linkedList = f5589t;
        } else {
            linkedList = m1053e();
        }
        synchronized (this.f5591C.f5576G) {
            this.f5592D.m1111f();
            this.f5593b = null;
            this.f5594c = null;
            this.f5595d = null;
            this.f5596e = null;
            this.f5597f = null;
            this.f5592D.m1116a(linkedList);
            this.f5592D = null;
            this.f5615s = true;
            this.f5591C.f5576G.notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public RunnableC0828o(PathEngine pathEngine) {
        this.f5591C = pathEngine;
        int i = f5590u;
        f5590u = i + 1;
        this.f5603v = i;
    }

    /* renamed from: c */
    public synchronized void m1056c() {
        if (this.f5604w != null) {
            throw new RuntimeException("thread!=null");
        }
        this.f5604w = new Thread(this);
        this.f5604w.setName("PathSolver-" + this.f5603v);
        this.f5604w.setPriority(10);
        this.f5604w.setDaemon(true);
        this.f5604w.start();
    }

    /* renamed from: a */
    public void m1064a(Map map) {
        this.f5598g = map.mainLayer.width;
        this.f5599h = map.mainLayer.height;
        this.f5600l = new int[2][this.f5598g * this.f5599h];
        this.f5601m = new byte[2][this.f5598g * this.f5599h];
        m1054d();
    }

    /* renamed from: d */
    public void m1054d() {
        int i = (this.f5598g * this.f5599h * 42) + 1;
        this.f5608i += i;
        if (this.f5608i > Integer.MAX_VALUE - i || this.f5608i < 0 || 0 != 0) {
            this.f5608i = 5;
            for (int i2 = 0; i2 < 2; i2++) {
                for (int i3 = 0; i3 < this.f5598g; i3++) {
                    for (int i4 = 0; i4 < this.f5599h; i4++) {
                        this.f5600l[i2][(i3 * this.f5599h) + i4] = -1;
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final int m1065a(int i, int i2) {
        if (this.f5593b[(i * this.f5599h) + i2] == -1 || this.f5594c[(i * this.f5599h) + i2] == -1 || this.f5595d[(i * this.f5599h) + i2] == -1) {
            return -1;
        }
        return this.f5593b[(i * this.f5599h) + i2] + this.f5594c[(i * this.f5599h) + i2] + (this.f5595d[(i * this.f5599h) + i2] * 10);
    }

    /* renamed from: a */
    public void m1063a(MovementType movementType, C0824k c0824k) {
        if (movementType == null) {
            throw new RuntimeException("MovementType is null");
        }
        C0822i m1104a = this.f5591C.m1104a(movementType);
        if (m1104a == null) {
            throw new RuntimeException("Could not get costs for:" + movementType.toString());
        }
        this.currentMapCosts = m1104a;
        this.f5593b = c0824k.f5542y;
        this.f5594c = c0824k.f5543z;
        this.f5595d = c0824k.f5519A;
        this.f5596e = c0824k.f5520B;
        this.f5597f = c0824k.f5521C;
        if (this.f5593b == null) {
            throw new RuntimeException("linkToPath failed mapCosts_mapCosts is null");
        }
        if (this.f5594c == null) {
            throw new RuntimeException("linkToPath failed mapCosts_buildingCosts is null");
        }
        if (this.f5595d == null) {
            throw new RuntimeException("linkToPath failed mapCosts_objectCosts is null");
        }
    }

    /* renamed from: a */
    public void m1062a(MovementType movementType, short s, short s2, Float f) {
        if (PathEngine.logging) {
            Log.e("RustedWarfare", "path start is:" + ((int) s) + "," + ((int) s2));
        }
        C0829p c0829p = new C0829p(s, s2);
        c0829p.m1045a(this, (byte) 0, this.f5608i);
        if (f == null) {
            c0829p.m1047a(this, (byte) 0, (byte) 0);
            c0829p.m1039b(this, (byte) 0, true);
        } else {
            c0829p.m1046a(this, (byte) 0, f.floatValue());
            c0829p.m1039b(this, (byte) 0, true);
        }
        c0829p.m1043a(this, (byte) 0, false);
    }

    /* renamed from: a */
    public void m1059a(short s, short s2, short s3) {
        if (PathEngine.logging) {
            Log.e("RustedWarfare", "path end is:" + ((int) s) + "," + ((int) s2) + " size:" + ((int) s3));
        }
        C0829p c0829p = new C0829p(s, s2);
        c0829p.m1047a(this, (byte) 1, (byte) 0);
        c0829p.m1039b(this, (byte) 1, true);
        c0829p.m1045a(this, (byte) 1, this.f5608i);
        c0829p.m1043a(this, (byte) 1, false);
    }

    /* renamed from: b */
    static int m1057b(int i, int i2) {
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
    static int m1055c(int i, int i2) {
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

    /* JADX WARN: Code restructure failed: missing block: B:231:0x067e, code lost:
        r0.m1042a(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:232:0x0688, code lost:
        if (r0 != false) goto L237;
     */
    /* JADX WARN: Code restructure failed: missing block: B:234:0x068e, code lost:
        if (com.corrodinggames.rts.gameFramework.path.PathEngine.logging == false) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:235:0x0691, code lost:
        android.util.Log.e("RustedWarfare", "Not closedOnOtherSide");
     */
    /* JADX WARN: Code restructure failed: missing block: B:236:0x0699, code lost:
        r27 = r0.f5619a;
        r28 = r0.f5620b;
        r25 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:237:0x06ad, code lost:
        r0 = r0.m1035f(r6, r33);
     */
    /* JADX WARN: Code restructure failed: missing block: B:238:0x06b9, code lost:
        if (r0 != null) goto L241;
     */
    /* JADX WARN: Code restructure failed: missing block: B:239:0x06bc, code lost:
        android.util.Log.e("RustedWarfare", "findPath: otherConnection==null");
        android.util.Log.e("RustedWarfare", "currentNode:" + ((int) r0.f5619a) + "," + ((int) r0.f5620b));
        android.util.Log.e("RustedWarfare", "currentNode cost normal:" + r0.m1048a(r6, (byte) 0));
        android.util.Log.e("RustedWarfare", "currentNode cost opposite:" + r0.m1048a(r6, (byte) 1));
        r0.clear();
     */
    /* JADX WARN: Code restructure failed: missing block: B:240:0x0733, code lost:
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:242:0x0736, code lost:
        if (r26 != false) goto L247;
     */
    /* JADX WARN: Code restructure failed: missing block: B:244:0x073c, code lost:
        if (com.corrodinggames.rts.gameFramework.path.PathEngine.logging == false) goto L246;
     */
    /* JADX WARN: Code restructure failed: missing block: B:245:0x073f, code lost:
        android.util.Log.e("RustedWarfare", "closing path runFromOppositeSide=false");
     */
    /* JADX WARN: Code restructure failed: missing block: B:246:0x0747, code lost:
        r29 = r0.f5619a;
        r30 = r0.f5620b;
        r27 = r0.f5619a;
        r28 = r0.f5620b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:248:0x0769, code lost:
        if (com.corrodinggames.rts.gameFramework.path.PathEngine.logging == false) goto L250;
     */
    /* JADX WARN: Code restructure failed: missing block: B:249:0x076c, code lost:
        android.util.Log.e("RustedWarfare", "closing path runFromOppositeSide=true");
     */
    /* JADX WARN: Code restructure failed: missing block: B:250:0x0774, code lost:
        r29 = r0.f5619a;
        r30 = r0.f5620b;
        r27 = r0.f5619a;
        r28 = r0.f5620b;
     */
    /* JADX WARN: Code restructure failed: missing block: B:251:0x0790, code lost:
        r25 = true;
     */
    /* renamed from: e */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public java.util.LinkedList m1053e() {
        /*
            Method dump skipped, instructions count: 3104
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.gameFramework.path.RunnableC0828o.m1053e():java.util.LinkedList");
    }

    /* renamed from: a */
    public LinkedList m1066a(byte b, short s, short s2) {
        LinkedList linkedList = new LinkedList();
        C0829p c0829p = new C0829p(s, s2);
        linkedList.add(c0829p);
        while (true) {
            C0829p m1035f = c0829p.m1035f(this, b);
            if (m1035f != null) {
                linkedList.add(m1035f);
                c0829p = m1035f;
            } else {
                return linkedList;
            }
        }
    }

    /* renamed from: a */
    public LinkedList m1060a(LinkedList linkedList) {
        LinkedList linkedList2 = new LinkedList();
        Iterator it = linkedList.iterator();
        while (it.hasNext()) {
            linkedList2.addFirst((C0829p) it.next());
        }
        return linkedList2;
    }

    /* renamed from: f */
    public void m1052f() {
        m1051g();
    }

    /* renamed from: g */
    public void m1051g() {
        byte b;
        byte b2;
        int m1049a;
        int i;
        C0819f c0819f = (C0819f) this.f5592D;
        C0820g c0820g = new C0820g(this.f5598g, this.f5599h);
        if (PathEngine.f5555l && !GameEngine.getInstance().f5951bH) {
            Debug.startMethodTracing("pathTrace", 110000000);
        }
        if (PathEngine.logging) {
            Log.e("RustedWarfare", "starting path for:" + this.currentMapCosts.type.toString());
        }
        C0829p c0829p = this.f5614r;
        C0829p c0829p2 = this.f5613q;
        int height = this.f5599h;
        int width = this.f5598g;
        this.startTime = GameEngine.curTimeMs();
        short s = c0819f.f5525h;
        short s2 = c0819f.f5526i;
        boolean z = c0819f.f5528k;
        m1054d();
        m1062a(c0819f.f5532o, c0819f.f5525h, c0819f.f5526i, c0819f.f5527j);
        short endX = c0819f.f5529l;
        short endY = c0819f.f5530m;
        short s3 = c0819f.f5531n;
        new LinkedList();
        if (this.currentMapCosts.type.equals(MovementType.f1643a)) {
            if (PathEngine.logging) {
                Log.e("RustedWarfare", "no point pathing for none");
                return;
            }
            return;
        }
        int i2 = 0;
        short fakeEndX = endX;
        short fakeEndY = endY;
        short s4 = s3;
        if (this.f5596e != null) {
            short[] sArr = this.f5596e;
            short s5 = sArr[(s * height) + s2];
            boolean z2 = true;
            if (s5 == -1) {
                z2 = false;
            } else {
                int i3 = endX - s3;
                while (true) {
                    short s6 = (short) i3;
                    if (s6 > endX + s3) {
                        break;
                    }
                    int i4 = endY - s3;
                    while (true) {
                        short s7 = (short) i4;
                        if (s7 <= endY + s3) {
                            if (s6 >= 0 && s6 < width && s7 >= 0 && s7 < height && s5 == sArr[(s6 * height) + s7]) {
                                z2 = false;
                            }
                            i4 = s7 + 1;
                        }
                    }
                    i3 = s6 + 1;
                }
            }
            if (z2) {
                if (PathEngine.logging) {
                    Log.e("RustedWarfare", "end is blocked on isolated groups");
                }
                short newEndX = fakeEndX;
                short newEndY = fakeEndY;
                float currentMinDisSq = -1.0f;
                int i5 = endX - 25;
                while (true) {
                    short x2 = (short) i5;
                    if (x2 > endX + 25) {
                        break;
                    }
                    int i6 = endY - 25;
                    while (true) {
                        short y2 = (short) i6;
                        if (y2 <= endY + 25) {
                            if (x2 >= 0 && x2 < width && y2 >= 0 && y2 < height && (s5 == sArr[(x2 * height) + y2] || sArr[(x2 * height) + y2] == 0)) {
                                float distanceSq = CommonUtils.distanceSq(x2, y2, endX, endY);
                                if (currentMinDisSq == -1.0f || distanceSq < currentMinDisSq) {
                                    currentMinDisSq = distanceSq;
                                    newEndX = x2;
                                    newEndY = y2;
                                    s4 = 0;
                                }
                            }
                            i6 = y2 + 1;
                        }
                    }
                    i5 = x2 + 1;
                }
                if (currentMinDisSq == -1.0f) {
                    short x3 = 0;
                    while (true) {
                        short s8 = x3;
                        if (s8 >= width) {
                            break;
                        }
                        short y3 = 0;
                        while (true) {
                            short s9 = y3;
                            if (s9 < height) {
                                if (s5 == sArr[(s8 * height) + s9] || sArr[(s8 * height) + s9] == 0) {
                                    float disSq2 = CommonUtils.distanceSq(s8, s9, endX, endY);
                                    if (currentMinDisSq == -1.0f || disSq2 < currentMinDisSq) {
                                        currentMinDisSq = disSq2;
                                        newEndX = s8;
                                        newEndY = s9;
                                        s4 = 0;
                                    }
                                }
                                y3 = (short) (s9 + 1);
                            }
                        }
                        x3 = (short) (s8 + 1);
                    }
                }
                fakeEndX = newEndX;
                fakeEndY = newEndY;
                if (PathEngine.logging) {
                    Log.e("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.startTime));
                }
            }
        }
        boolean z3 = true;
        int i7 = fakeEndX - s4;
        loop6: while (true) {
            short s10 = (short) i7;
            if (s10 > fakeEndX + s4) {
                break;
            }
            int i8 = fakeEndY - s4;
            while (true) {
                short s11 = (short) i8;
                if (s11 <= fakeEndY + s4) {
                    if (s10 < 0 || s10 >= width || s11 < 0 || s11 >= height || m1065a(s10, s11) == -1) {
                        i8 = s11 + 1;
                    } else {
                        z3 = false;
                        break loop6;
                    }
                }
            }
            i7 = s10 + 1;
        }
        if (z3) {
            short newEndX2 = fakeEndX;
            short newEndY2 = fakeEndY;
            float f = -1.0f;
            if (PathEngine.logging) {
                Log.e("RustedWarfare", "end is blocked on non isolated groups");
            }
            int i9 = fakeEndX - 9;
            while (true) {
                short s12 = (short) i9;
                if (s12 > fakeEndX + 9) {
                    break;
                }
                int i10 = fakeEndY - 9;
                while (true) {
                    short s13 = (short) i10;
                    if (s13 <= fakeEndY + 9) {
                        if (s12 >= 0 && s12 < width && s13 >= 0 && s13 < height && m1065a(s12, s13) != -1) {
                            float distanceSq2 = CommonUtils.distanceSq(s12, s13, fakeEndX, fakeEndY);
                            if (f == -1.0f || distanceSq2 < f) {
                                f = distanceSq2;
                                newEndX2 = s12;
                                newEndY2 = s13;
                                s4 = 0;
                            }
                        }
                        i10 = s13 + 1;
                    }
                }
                i9 = s12 + 1;
            }
            if (f == -1.0f) {
                short s14 = 0;
                while (true) {
                    short s15 = s14;
                    if (s15 >= width) {
                        break;
                    }
                    short s16 = 0;
                    while (true) {
                        short s17 = s16;
                        if (s17 < height) {
                            if (m1065a(s15, s17) != -1) {
                                float distanceSq3 = CommonUtils.distanceSq(s15, s17, fakeEndX, fakeEndY);
                                if (f == -1.0f || distanceSq3 < f) {
                                    f = distanceSq3;
                                    newEndX2 = s15;
                                    newEndY2 = s17;
                                    s4 = 0;
                                }
                            }
                            s16 = (short) (s17 + 1);
                        }
                    }
                    s14 = (short) (s15 + 1);
                }
            }
            fakeEndX = newEndX2;
            fakeEndY = newEndY2;
            if (PathEngine.logging) {
                Log.e("RustedWarfare", "fakeNode search was:" + (System.currentTimeMillis() - this.startTime));
            }
        }
        if (PathEngine.logging && (fakeEndX != endX || fakeEndY != endY)) {
            Log.e("RustedWarfare", "Moved end to fakeEndX:" + ((int) fakeEndX) + " fakeEndY:" + ((int) fakeEndY));
        }
        this.f5611o.m1075a(fakeEndX, fakeEndY);
        this.f5611o.m1074a(0, s, s2);
        this.f5612p.m1075a(s, s2);
        m1059a(fakeEndX, fakeEndY, s4);
        this.f5612p.m1074a(0, fakeEndX, fakeEndY);
        int i11 = 0;
        while (0 == 0) {
            i11++;
            if (c0819f.f5540w) {
                return;
            }
            i2++;
            C0826m c0826m = this.f5612p;
            C0827n m1071c = c0826m.m1071c();
            if (m1071c == null) {
                break;
            }
            C0829p m1050a = c0829p2.m1050a(m1071c);
            int m1048a = m1050a.m1048a(this, (byte) 1);
            byte m1149a = (byte) (c0820g.m1149a(m1050a) - 1);
            boolean m1146b = c0820g.m1146b(m1050a);
            c0820g.m1147a(m1050a, true);
            if (m1146b) {
                b2 = 0;
                b = 7;
            } else {
                byte b3 = 2;
                if (this.f5597f != null && this.f5597f[(m1050a.f5619a * height) + m1050a.f5620b] > 1) {
                    b3 = 1;
                }
                b2 = (byte) (m1149a - b3);
                b = (byte) (m1149a + b3);
            }
            byte b4 = b2;
            while (true) {
                byte b5 = b4;
                if (b5 <= b) {
                    c0829p.m1042a(m1050a);
                    byte b6 = b5;
                    if (b6 > 7) {
                        b6 = (byte) (b6 - 8);
                    }
                    if (b6 < 0) {
                        b6 = (byte) (b6 + 8);
                    }
                    if (b6 == 0) {
                        c0829p.f5619a = (short) (c0829p.f5619a + 1);
                    }
                    if (b6 == 1) {
                        c0829p.f5619a = (short) (c0829p.f5619a + 1);
                        c0829p.f5620b = (short) (c0829p.f5620b + 1);
                    }
                    if (b6 == 2) {
                        c0829p.f5620b = (short) (c0829p.f5620b + 1);
                    }
                    if (b6 == 3) {
                        c0829p.f5620b = (short) (c0829p.f5620b + 1);
                        c0829p.f5619a = (short) (c0829p.f5619a - 1);
                    }
                    if (b6 == 4) {
                        c0829p.f5619a = (short) (c0829p.f5619a - 1);
                    }
                    if (b6 == 5) {
                        c0829p.f5619a = (short) (c0829p.f5619a - 1);
                        c0829p.f5620b = (short) (c0829p.f5620b - 1);
                    }
                    if (b6 == 6) {
                        c0829p.f5620b = (short) (c0829p.f5620b - 1);
                    }
                    if (b6 == 7) {
                        c0829p.f5620b = (short) (c0829p.f5620b - 1);
                        c0829p.f5619a = (short) (c0829p.f5619a + 1);
                    }
                    if (c0829p.f5619a >= 0 && c0829p.f5619a < width && c0829p.f5620b >= 0 && c0829p.f5620b < height && (m1049a = c0829p.m1049a(this)) != -1) {
                        int m1048a2 = c0829p.m1048a(this, (byte) 1);
                        if (!c0820g.m1145c(c0829p)) {
                            if (c0829p.f5619a != m1050a.f5619a && c0829p.f5620b != m1050a.f5620b) {
                                if (m1065a(c0829p.f5619a, m1050a.f5620b) != -1 && m1065a(m1050a.f5619a, c0829p.f5620b) != -1) {
                                    i = m1048a + 14 + m1049a + 1;
                                }
                            } else {
                                i = m1048a + 10 + m1049a + 1;
                            }
                            if (m1149a != b6 && !m1146b) {
                                i += m1057b(m1149a, b6);
                            }
                            if (this.f5597f != null) {
                                i += (4 - this.f5597f[(c0829p.f5619a * height) + c0829p.f5620b]) * 7;
                            }
                            if (0 > 0 && this.f5597f != null && this.f5597f[(c0829p.f5619a * height) + c0829p.f5620b] <= 0) {
                                i += 100;
                            }
                            if (m1048a2 < this.f5608i || i < m1048a2) {
                                c0820g.m1148a(c0829p, (byte) (b6 + 1));
                                c0820g.m1147a(c0829p, false);
                                c0829p.m1045a(this, (byte) 1, i);
                                c0826m.m1074a(i - this.f5608i, c0829p.f5619a, c0829p.f5620b);
                            }
                        }
                    }
                    b4 = (byte) (b5 + 1);
                }
            }
        }
        if (PathEngine.logging) {
            Log.e("RustedWarfare", "grid path finshed in :" + i11 + " ticks");
            Log.e("RustedWarfare", "grid path done in:" + (System.currentTimeMillis() - this.startTime));
        }
        System.currentTimeMillis();
        c0820g.f5494c = fakeEndX;
        c0820g.f5495d = fakeEndY;
        c0819f.f5491b = c0820g;
        PathEngine.f5548e = c0819f;
        this.f5606z = GameEngine.curTimeMs();
        if (PathEngine.logging) {
            Log.e("RustedWarfare", "path(" + c0819f.f5523e + ") finished in:" + (this.f5606z - this.startTime));
        }
        if (PathEngine.f5555l && !GameEngine.getInstance().f5951bH) {
            Debug.stopMethodTracing();
            PathEngine.f5555l = false;
        }
    }
}