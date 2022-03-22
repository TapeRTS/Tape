package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.p032d.C0623f;
import com.corrodinggames.rts.gameFramework.p035f.C0657b;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.am */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/am.class */
public class C0547am {

    /* renamed from: e */
    C0562au f3689e;

    /* renamed from: k */
    AbstractC0557as f3690k;

    /* renamed from: l */
    boolean f3691l;

    /* renamed from: m */
    String f3692m;

    /* renamed from: n */
    boolean f3693n;

    /* renamed from: o */
    boolean f3694o;

    /* renamed from: p */
    float f3695p;

    /* renamed from: q */
    float f3696q;

    /* renamed from: r */
    float f3697r;

    /* renamed from: s */
    public boolean f3698s;

    /* renamed from: t */
    public String f3699t;

    /* renamed from: u */
    public boolean f3700u;

    /* renamed from: v */
    String f3701v;

    /* renamed from: w */
    Context f3702w;

    /* renamed from: x */
    boolean f3703x;

    /* renamed from: y */
    boolean f3704y;

    /* renamed from: z */
    int f3705z;

    /* renamed from: A */
    AbstractC0557as f3706A;

    /* renamed from: B */
    boolean f3707B;

    /* renamed from: C */
    boolean f3708C;

    /* renamed from: D */
    float f3709D;

    /* renamed from: G */
    float f3710G;

    /* renamed from: K */
    boolean f3711K;

    /* renamed from: L */
    boolean f3712L;

    /* renamed from: a */
    public static AbstractC0555aq f3713a = new C0550an();

    /* renamed from: I */
    static HashMap f3714I = new HashMap();

    /* renamed from: J */
    static int f3715J = 0;

    /* renamed from: b */
    Object f3716b = new Object();

    /* renamed from: c */
    Object f3717c = new Object();

    /* renamed from: d */
    volatile float f3718d = 1.0f;

    /* renamed from: f */
    volatile boolean f3719f = false;

    /* renamed from: g */
    volatile boolean f3720g = true;

    /* renamed from: h */
    float f3721h = 0.0f;

    /* renamed from: i */
    int f3722i = 0;

    /* renamed from: j */
    boolean f3723j = false;

    /* renamed from: E */
    boolean f3724E = false;

    /* renamed from: F */
    boolean f3725F = false;

    /* renamed from: H */
    ArrayList f3726H = new ArrayList();

    /* renamed from: M */
    long f3727M = -1;

    /* renamed from: a */
    public float m2125a() {
        AbstractC0789l u = AbstractC0789l.m651u();
        return u.f5479by.musicVolume * u.f5479by.masterVolume;
    }

    /* renamed from: b */
    public boolean m2118b() {
        return !AbstractC0789l.m708an() && !this.f3700u && m2125a() > 0.01f;
    }

    /* renamed from: a */
    public void m2123a(Context context) {
        this.f3702w = context;
        if (!AbstractC0789l.m708an()) {
            f3713a.mo95a(this);
            this.f3690k = f3713a.mo98a();
            this.f3706A = f3713a.mo98a();
            EnumC0558at.m2103c();
            if (f3713a.mo91d()) {
                this.f3689e = new C0562au(this);
                this.f3689e.start();
            }
        }
    }

    /* renamed from: c */
    public void m2115c() {
        if (!AbstractC0789l.m710al()) {
            this.f3691l = false;
            this.f3692m = null;
            this.f3703x = true;
            this.f3707B = false;
        }
        this.f3704y = true;
        this.f3700u = false;
    }

    /* renamed from: a */
    static AbstractC0556ar m2119a(String str, boolean z) {
        AbstractC0556ar arVar = (AbstractC0556ar) f3714I.get(str);
        if (arVar != null) {
            return arVar;
        }
        try {
            AbstractC0556ar a = f3713a.mo94a(str);
            if (z) {
                f3714I.put(str, a);
            }
            return a;
        } catch (ArithmeticException e) {
            f3715J++;
            AbstractC0789l.m727a("Error loading:" + str, (Throwable) e);
            if (f3715J > 2 && f3715J <= 4) {
                AbstractC0789l.m651u().m670h("Failed to load music track:" + str + ". Music track skipped.");
            }
            if (z) {
                return null;
            }
            throw new RuntimeException(e);
        } catch (Exception e2) {
            f3715J++;
            AbstractC0789l.m727a("Exception loading:" + str, (Throwable) e2);
            if (f3715J > 2 && f3715J <= 4) {
                AbstractC0789l.m651u().m670h("Unknown error loading music track:" + str + ". Music track skipped.");
            }
            if (z) {
                return null;
            }
            throw new RuntimeException(e2);
        } catch (OutOfMemoryError e3) {
            f3715J++;
            AbstractC0789l.m727a("OutOfMemoryError loading:" + str, e3);
            AbstractC0789l.m706ap();
            System.gc();
            AbstractC0789l.m706ap();
            if (f3715J < 3) {
                AbstractC0789l.m651u().m670h("Ran out of memory loading music track:" + str + ". Music track skipped.");
            }
            if (z) {
                return null;
            }
            throw new RuntimeException(e3);
        }
    }

    /* renamed from: d */
    public ArrayList m2113d() {
        ArrayList arrayList = new ArrayList();
        for (String str : EnumC0558at.f3742a.m2104b()) {
            arrayList.add(str);
        }
        for (String str2 : EnumC0558at.f3743b.m2104b()) {
            arrayList.add(str2);
        }
        for (String str3 : EnumC0558at.f3742a.m2104b()) {
            arrayList.add(str3);
        }
        return arrayList;
    }

    /* renamed from: a */
    public String m2122a(EnumC0558at atVar) {
        return m2121a(atVar, atVar);
    }

    /* renamed from: a */
    public String m2121a(EnumC0558at atVar, EnumC0558at atVar2) {
        EnumC0558at atVar3;
        AbstractC0789l.m651u();
        if (C0654f.m1526b(atVar.m2104b().length + atVar2.m2104b().length) < atVar.m2104b().length) {
            atVar3 = atVar;
        } else {
            atVar3 = atVar2;
        }
        String[] b = atVar3.m2104b();
        return atVar3.m2105a(b[C0654f.m1526b(b.length)]);
    }

    /* renamed from: e */
    public synchronized void m2112e() {
        this.f3698s = true;
        this.f3700u = false;
        this.f3699t = null;
    }

    /* renamed from: a */
    public synchronized void m2120a(String str) {
        this.f3698s = true;
        this.f3700u = false;
        this.f3699t = str;
    }

    /* renamed from: a */
    public synchronized void m2124a(float f) {
        if (!AbstractC0789l.m708an()) {
            if (!f3713a.mo91d()) {
                if (!this.f3711K) {
                    m2117b(f);
                }
                this.f3720g = true;
            }
            this.f3727M = AbstractC0789l.m760N();
            if (AbstractC0789l.m651u().f5482bB.f3641H.m2143a()) {
                m2112e();
            }
            if (this.f3701v != null) {
                Hcat_Multiplaye.m1335a((String) null, this.f3701v);
                this.f3701v = null;
            }
            if (this.f3695p != m2125a()) {
                this.f3695p = m2125a();
                this.f3694o = true;
            }
            synchronized (this.f3717c) {
                this.f3718d = f;
                if (this.f3711K) {
                    if (!this.f3712L) {
                        this.f3712L = true;
                        AbstractC0789l.m657m("Music subsystem crashed, music has been disabled to keep your game running. Please send your logs.");
                    }
                    return;
                }
                if (!this.f3720g) {
                    this.f3721h += f;
                    this.f3722i++;
                    if (this.f3721h > 320.0f && this.f3722i > 80 && !this.f3723j) {
                        this.f3723j = true;
                        AbstractC0789l.m657m("Lockup detected in music subsystem");
                    }
                } else {
                    this.f3721h = 0.0f;
                    this.f3722i = 0;
                }
                this.f3720g = false;
                this.f3719f = true;
                this.f3717c.notifyAll();
            }
        }
    }

    /* renamed from: b */
    public String m2116b(String str) {
        return C0654f.m1480g(C0654f.m1469k(str)).replace("[noloop]", "").replace("_", " ");
    }

    /* renamed from: b */
    public boolean m2117b(float f) {
        try {
            m2114c(f);
            return true;
        } catch (Exception e) {
            AbstractC0789l.m727a("Music system crashed", (Throwable) e);
            this.f3711K = true;
            AbstractC0789l.m683d("Stopping music");
            try {
                m2110g();
                return false;
            } catch (Exception e2) {
                AbstractC0789l.m727a("crash stopping music", (Throwable) e2);
                return false;
            }
        }
    }

    /* renamed from: c */
    public void m2114c(float f) {
        float f2;
        float f3;
        if (!AbstractC0789l.m708an()) {
            f3713a.mo97a(f);
            if (m2118b()) {
                boolean z = false;
                if (!this.f3691l) {
                    z = true;
                }
                if (this.f3693n) {
                    if (!this.f3708C) {
                        this.f3696q += f;
                    }
                    if (this.f3696q > 600.0f) {
                        this.f3697r += f;
                        if (this.f3697r > 100.0f) {
                            this.f3697r = 0.0f;
                            if (!this.f3691l || !this.f3690k.mo83c()) {
                                z = true;
                                this.f3696q = 0.0f;
                            }
                        }
                    }
                } else {
                    this.f3696q += f;
                    if (this.f3696q > 3600.0f) {
                        AbstractC0789l.m683d("Next music track, timer:" + this.f3696q);
                        z = true;
                        this.f3696q = 0.0f;
                    }
                }
                if (this.f3704y) {
                    C0657b x = C0623f.m1703x();
                    if (x != null && x.f4630v) {
                        z = true;
                    }
                    this.f3704y = false;
                }
                if (z || this.f3698s) {
                    boolean z2 = this.f3698s;
                    String str = this.f3699t;
                    if (this.f3698s) {
                        AbstractC0789l.m683d("Next music track requested");
                        this.f3698s = false;
                        this.f3696q = 0.0f;
                        this.f3699t = null;
                    }
                    String str2 = null;
                    boolean z3 = false;
                    C0657b bVar = null;
                    if (str != null) {
                        ArrayList g = AbstractC0789l.m651u().f5488bH.m1447g();
                        g.addAll(m2113d());
                        if (str.endsWith(".ogg") || str.endsWith(".wav")) {
                            m2116b(str);
                        }
                        Iterator it = g.iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                break;
                            }
                            String str3 = (String) it.next();
                            if (m2116b(str3).equalsIgnoreCase(str)) {
                                z3 = true;
                                str2 = str3;
                                break;
                            }
                        }
                        if (str2 == null) {
                            AbstractC0789l.m683d("Failed to find requested music: " + str);
                        }
                    }
                    C0657b x2 = C0623f.m1703x();
                    if (str2 == null && x2 != null && x2.f4632x < 10 && x2.f4630v) {
                        ArrayList o = x2.m1422o();
                        if (o.size() > 0) {
                            z3 = true;
                            bVar = x2;
                            str2 = (String) o.get(C0654f.m1567a(0, o.size() - 1));
                            if (z2 || this.f3726H.contains(str2)) {
                                for (int i = 0; i < 30 && (str2.equals(this.f3692m) || this.f3726H.contains(str2)); i++) {
                                    str2 = (String) o.get(C0654f.m1567a(0, o.size() - 1));
                                    if (i > 20) {
                                        this.f3726H.clear();
                                    }
                                }
                            }
                            AbstractC0789l.m683d("Playing music from mod:" + x2.m1441a() + " - '" + str2 + "'");
                        }
                    }
                    if (str2 == null) {
                        if (this.f3703x) {
                            str2 = m2122a(EnumC0558at.f3742a);
                        } else {
                            str2 = m2121a(EnumC0558at.f3743b, EnumC0558at.f3742a);
                        }
                        if (z2 || this.f3726H.contains(str2)) {
                            for (int i2 = 0; i2 < 30 && (str2.equals(this.f3692m) || this.f3726H.contains(str2)); i2++) {
                                str2 = m2121a(EnumC0558at.f3743b, EnumC0558at.f3742a);
                                if (i2 > 20) {
                                    this.f3726H.clear();
                                }
                            }
                        }
                    }
                    if (!str2.equals(this.f3692m)) {
                        this.f3692m = str2;
                        this.f3703x = false;
                        this.f3696q = 0.0f;
                        this.f3693n = z3 || str2.contains("[noloop]");
                        this.f3726H.add(str2);
                        if (this.f3726H.size() > 4) {
                            this.f3726H.remove(0);
                        }
                        if (z2) {
                            this.f3701v = "Now playing: " + m2116b(str2);
                        }
                        AbstractC0557as asVar = this.f3690k;
                        this.f3690k = this.f3706A;
                        this.f3706A = asVar;
                        try {
                            this.f3690k.mo86a(m2119a(str2, false));
                            this.f3690k.mo85a(!this.f3693n);
                            this.f3724E = false;
                            if (!z2 && this.f3707B) {
                                this.f3724E = true;
                            }
                            if (this.f3691l) {
                                this.f3707B = true;
                            }
                            this.f3708C = true;
                            this.f3725F = false;
                            this.f3709D = 1.0f;
                            this.f3691l = true;
                        } catch (RuntimeException e) {
                            e.printStackTrace();
                            if (this.f3705z < 3) {
                                this.f3701v = "Failed to open music track: " + str2;
                                this.f3705z++;
                            }
                            bVar.f4632x++;
                            return;
                        }
                    } else if (z2) {
                        AbstractC0789l.m683d("Same music found");
                    }
                }
                if (this.f3708C || this.f3694o) {
                    boolean c = f3713a.mo92c();
                    if (!c) {
                        this.f3709D -= f * 0.006f;
                    } else if (this.f3724E) {
                        this.f3709D -= f * 0.003f;
                    } else {
                        this.f3709D -= f * 0.008f;
                    }
                    if (!c) {
                        f3 = this.f3709D * m2125a();
                        f2 = (1.0f - this.f3709D) * m2125a();
                    } else {
                        f3 = ((this.f3709D * 2.0f) - 1.0f) * m2125a();
                        f2 = (1.0f - (this.f3709D * 2.0f)) * m2125a();
                    }
                    float b = C0654f.m1528b(f3, 0.0f, 1.0f);
                    float b2 = C0654f.m1528b(f2, 0.0f, 1.0f);
                    if (this.f3708C) {
                        if (this.f3709D <= 0.0f) {
                            this.f3708C = false;
                            this.f3724E = false;
                            if (this.f3707B && !this.f3725F) {
                                this.f3725F = true;
                                this.f3706A.mo82d();
                            }
                            if (this.f3691l) {
                                this.f3690k.m2107a(m2125a(), m2125a());
                            }
                        } else {
                            this.f3710G += f;
                            if (this.f3710G > 10.0f) {
                                this.f3710G = 0.0f;
                                if (this.f3707B && !this.f3725F) {
                                    this.f3706A.m2107a(b, b);
                                    if (b < 0.02f) {
                                        this.f3725F = true;
                                        this.f3706A.mo82d();
                                    }
                                }
                                if (this.f3691l) {
                                    this.f3690k.m2107a(b2, b2);
                                }
                            }
                        }
                    } else if (this.f3691l) {
                        this.f3690k.m2107a(b2, b2);
                    }
                }
                this.f3694o = false;
            } else if (this.f3691l && this.f3690k.mo83c()) {
                m2110g();
                this.f3691l = false;
                this.f3707B = false;
            }
        }
    }

    /* renamed from: f */
    public void m2111f() {
        Log.m4373a("RustedWarfare", "Music:pause()");
        new C05481().start();
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.am$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/am$1.class */
    class C05481 extends Thread {
        C05481() {
        }

        public void run() {
            if (C0547am.this.f3723j) {
                Log.m4373a("RustedWarfare", "Music:pause() unsynchronized");
                C0547am.this.m2110g();
                return;
            }
            synchronized (C0547am.this.f3716b) {
                Log.m4373a("RustedWarfare", "Music:pause() synchronized");
                C0547am.this.m2110g();
            }
        }
    }

    /* renamed from: g */
    public void m2110g() {
        if (this.f3691l) {
            this.f3690k.mo88a();
        }
        if (this.f3707B) {
            this.f3706A.mo88a();
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.am$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/am$2.class */
    class C05492 extends Thread {
        C05492() {
        }

        public void run() {
            synchronized (C0547am.this.f3716b) {
                if (C0547am.this.f3691l) {
                    C0547am.this.f3690k.mo84b();
                    if (!C0547am.this.f3708C) {
                        C0547am.this.f3690k.m2107a(C0547am.this.m2125a(), C0547am.this.m2125a());
                    }
                }
                if (C0547am.this.f3707B) {
                    C0547am.this.f3706A.mo84b();
                }
            }
        }
    }

    /* renamed from: h */
    public void m2109h() {
        new C05492().start();
    }

    /* renamed from: i */
    public void m2108i() {
        f3713a.mo93b();
        if (this.f3707B) {
            this.f3706A.mo82d();
            this.f3706A.mo81e();
        }
        if (this.f3690k != null) {
            this.f3690k.mo82d();
            this.f3690k.mo81e();
        }
        this.f3690k = null;
        this.f3692m = null;
        this.f3691l = false;
    }
}
