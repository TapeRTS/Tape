package com.corrodinggames.rts.gameFramework;

import android.content.Context;
import android.util.Log;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p037f.C0797f;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.am */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/am.class */
public class C0648am {

    /* renamed from: e */
    C0663au f4159e;

    /* renamed from: k */
    AbstractC0658as f4160k;

    /* renamed from: l */
    boolean f4161l;

    /* renamed from: m */
    String f4162m;

    /* renamed from: n */
    boolean f4163n;

    /* renamed from: o */
    boolean f4164o;

    /* renamed from: p */
    float f4165p;

    /* renamed from: q */
    float f4166q;

    /* renamed from: r */
    float f4167r;

    /* renamed from: s */
    public boolean f4168s;

    /* renamed from: t */
    public String f4169t;

    /* renamed from: u */
    public boolean f4170u;

    /* renamed from: v */
    String f4171v;

    /* renamed from: w */
    Context f4172w;

    /* renamed from: x */
    boolean f4173x;

    /* renamed from: y */
    boolean f4174y;

    /* renamed from: z */
    int f4175z;

    /* renamed from: A */
    AbstractC0658as f4176A;

    /* renamed from: B */
    boolean f4177B;

    /* renamed from: C */
    boolean f4178C;

    /* renamed from: D */
    float f4179D;

    /* renamed from: H */
    float f4180H;

    /* renamed from: L */
    boolean f4181L;

    /* renamed from: M */
    boolean f4182M;

    /* renamed from: a */
    public static AbstractC0656aq f4183a = new C0651an();

    /* renamed from: J */
    static HashMap f4184J = new HashMap();

    /* renamed from: K */
    static int f4185K = 0;

    /* renamed from: b */
    Object f4186b = new Object();

    /* renamed from: c */
    Object f4187c = new Object();

    /* renamed from: d */
    volatile float f4188d = 1.0f;

    /* renamed from: f */
    volatile boolean f4189f = false;

    /* renamed from: g */
    volatile boolean f4190g = true;

    /* renamed from: h */
    float f4191h = 0.0f;

    /* renamed from: i */
    int f4192i = 0;

    /* renamed from: j */
    boolean f4193j = false;

    /* renamed from: E */
    boolean f4194E = false;

    /* renamed from: F */
    public boolean f4195F = false;

    /* renamed from: G */
    boolean f4196G = false;

    /* renamed from: I */
    ArrayList f4197I = new ArrayList();

    /* renamed from: N */
    long f4198N = -1;

    /* renamed from: a */
    public float m2933a() {
        GameEngine gameEngine = GameEngine.getInstance();
        return gameEngine.f6109bQ.musicVolume * gameEngine.f6109bQ.masterVolume;
    }

    /* renamed from: b */
    public boolean m2926b() {
        return !GameEngine.m1155aw() && !this.f4170u && m2933a() > 0.01f;
    }

    /* renamed from: a */
    public void m2931a(Context context) {
        this.f4172w = context;
        if (GameEngine.m1155aw()) {
            return;
        }
        f4183a.mo2911a(this);
        this.f4160k = f4183a.mo2914a();
        this.f4176A = f4183a.mo2914a();
        AbstractC0659at.m2901c();
        if (f4183a.mo2907d()) {
            this.f4159e = new C0663au(this);
            this.f4159e.start();
        }
    }

    /* renamed from: c */
    public void m2923c() {
        if (!GameEngine.m1157au()) {
            this.f4161l = false;
            this.f4162m = null;
            this.f4173x = true;
            this.f4177B = false;
        }
        this.f4174y = true;
        this.f4170u = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public static AbstractC0657ar m2927a(String str, boolean z) {
        AbstractC0657ar abstractC0657ar = (AbstractC0657ar) f4184J.get(str);
        if (abstractC0657ar != null) {
            return abstractC0657ar;
        }
        try {
            AbstractC0657ar mo2910a = f4183a.mo2910a(str);
            if (z) {
                f4184J.put(str, mo2910a);
            }
            return mo2910a;
        } catch (ArithmeticException e) {
            f4185K++;
            GameEngine.m1188a("Error loading:" + str, (Throwable) e);
            if (f4185K > 2 && f4185K <= 4) {
                GameEngine.getInstance().m1116i("Failed to load music track:" + str + ". Music track skipped.");
            }
            if (!z) {
                throw new RuntimeException(e);
            }
            return null;
        } catch (Exception e2) {
            f4185K++;
            GameEngine.m1188a("Exception loading:" + str, (Throwable) e2);
            if (f4185K > 2 && f4185K <= 4) {
                GameEngine.getInstance().m1116i("Unknown error loading music track:" + str + ". Music track skipped.");
            }
            if (!z) {
                throw new RuntimeException(e2);
            }
            return null;
        } catch (OutOfMemoryError e3) {
            f4185K++;
            GameEngine.m1188a("OutOfMemoryError loading:" + str, e3);
            GameEngine.m1181aB();
            System.gc();
            GameEngine.m1181aB();
            if (f4185K < 3) {
                GameEngine.getInstance().m1116i("Ran out of memory loading music track:" + str + ". Music track skipped.");
            }
            if (!z) {
                throw new RuntimeException(e3);
            }
            return null;
        }
    }

    /* renamed from: d */
    public ArrayList m2921d() {
        ArrayList arrayList = new ArrayList();
        for (String str : AbstractC0659at.f4214a.m2902b()) {
            arrayList.add(str);
        }
        for (String str2 : AbstractC0659at.f4215b.m2902b()) {
            arrayList.add(str2);
        }
        for (String str3 : AbstractC0659at.f4214a.m2902b()) {
            arrayList.add(str3);
        }
        return arrayList;
    }

    /* renamed from: a */
    public String m2930a(AbstractC0659at abstractC0659at) {
        return m2929a(abstractC0659at, abstractC0659at);
    }

    /* renamed from: a */
    public String m2929a(AbstractC0659at abstractC0659at, AbstractC0659at abstractC0659at2) {
        AbstractC0659at abstractC0659at3;
        GameEngine.getInstance();
        if (CommonUtils.m2290c(abstractC0659at.m2902b().length + abstractC0659at2.m2902b().length) < abstractC0659at.m2902b().length) {
            abstractC0659at3 = abstractC0659at;
        } else {
            abstractC0659at3 = abstractC0659at2;
        }
        String[] m2902b = abstractC0659at3.m2902b();
        return abstractC0659at3.m2903a(m2902b[CommonUtils.m2290c(m2902b.length)]);
    }

    /* renamed from: e */
    public synchronized void m2920e() {
        this.f4168s = true;
        this.f4170u = false;
        this.f4169t = null;
    }

    /* renamed from: a */
    public synchronized void m2928a(String str) {
        this.f4168s = true;
        this.f4170u = false;
        this.f4169t = str;
    }

    /* renamed from: a */
    public synchronized void m2932a(float f) {
        if (GameEngine.m1155aw()) {
            return;
        }
        if (!f4183a.mo2907d()) {
            if (!this.f4181L) {
                m2925b(f);
            }
            this.f4190g = true;
        }
        this.f4198N = GameEngine.m1214U();
        if (GameEngine.getInstance().f6112bT.f4110H.m2958a()) {
            m2920e();
        }
        if (this.f4171v != null) {
            C0831ad.m1743a((String) null, this.f4171v);
            this.f4171v = null;
        }
        if (this.f4165p != m2933a()) {
            this.f4165p = m2933a();
            this.f4164o = true;
        }
        synchronized (this.f4187c) {
            this.f4188d = f;
            if (this.f4181L) {
                if (!this.f4182M) {
                    this.f4182M = true;
                    GameEngine.m1106n("Music subsystem crashed, music has been disabled to keep your game running. Please send your logs.");
                }
                return;
            }
            if (!this.f4190g) {
                this.f4191h += f;
                this.f4192i++;
                if (this.f4191h > 320.0f && this.f4192i > 80 && !this.f4193j) {
                    this.f4193j = true;
                    GameEngine.m1106n("Lockup detected in music subsystem");
                }
            } else {
                this.f4191h = 0.0f;
                this.f4192i = 0;
            }
            this.f4190g = false;
            this.f4189f = true;
            this.f4187c.notifyAll();
        }
    }

    /* renamed from: b */
    public String m2924b(String str) {
        return CommonUtils.m2256g(CommonUtils.m2244k(str)).replace("[noloop]", VariableScope.nullOrMissingString).replace("_", " ");
    }

    /* renamed from: b */
    public boolean m2925b(float f) {
        try {
            m2922c(f);
            return true;
        } catch (Exception e) {
            GameEngine.m1188a("Music system crashed", (Throwable) e);
            this.f4181L = true;
            GameEngine.PrintLog("Stopping music");
            try {
                m2918g();
                return false;
            } catch (Exception e2) {
                GameEngine.m1188a("crash stopping music", (Throwable) e2);
                return false;
            }
        }
    }

    /* renamed from: c */
    public void m2922c(float f) {
        float m2933a;
        float m2933a2;
        if (GameEngine.m1155aw()) {
            return;
        }
        f4183a.mo2913a(f);
        if (!m2926b()) {
            if (this.f4161l && this.f4160k.mo2887c()) {
                m2918g();
                this.f4161l = false;
                this.f4177B = false;
                return;
            }
            return;
        }
        boolean z = false;
        if (!this.f4161l) {
            z = true;
        }
        if (this.f4163n) {
            if (!this.f4178C) {
                this.f4166q += f;
            }
            if (this.f4166q > 600.0f) {
                this.f4167r += f;
                if (this.f4167r > 100.0f) {
                    this.f4167r = 0.0f;
                    if (!this.f4161l || !this.f4160k.mo2887c()) {
                        z = true;
                        this.f4166q = 0.0f;
                    }
                }
            }
        } else {
            this.f4166q += f;
            if (this.f4166q > 3600.0f) {
                GameEngine.PrintLog("Next music track, timer:" + this.f4166q);
                z = true;
                this.f4166q = 0.0f;
            }
        }
        if (this.f4174y) {
            C0824b m1957y = C0797f.m1957y();
            if (m1957y != null && m1957y.f5448N) {
                z = true;
            }
            this.f4174y = false;
        }
        if (z || this.f4168s) {
            boolean z2 = this.f4168s;
            String str = this.f4169t;
            if (this.f4168s) {
                GameEngine.PrintLog("Next music track requested");
                this.f4168s = false;
                this.f4166q = 0.0f;
                this.f4169t = null;
            }
            String str2 = null;
            boolean z3 = false;
            C0824b c0824b = null;
            if (str != null) {
                ArrayList m1852i = GameEngine.getInstance().f6118bZ.m1852i();
                m1852i.addAll(m2921d());
                if (str.endsWith(".ogg") || str.endsWith(".wav")) {
                    m2924b(str);
                }
                Iterator it = m1852i.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str3 = (String) it.next();
                    if (m2924b(str3).equalsIgnoreCase(str)) {
                        z3 = true;
                        str2 = str3;
                        break;
                    }
                }
                if (str2 == null) {
                    GameEngine.PrintLog("Failed to find requested music: " + str);
                }
            }
            C0824b m1957y2 = C0797f.m1957y();
            if (str2 == null && m1957y2 != null && m1957y2.f5450P < 10 && m1957y2.f5448N) {
                ArrayList m1824q = m1957y2.m1824q();
                if (m1824q.size() > 0) {
                    z3 = true;
                    c0824b = m1957y2;
                    str2 = (String) m1824q.get(CommonUtils.m2360a(0, m1824q.size() - 1));
                    if (z2 || this.f4197I.contains(str2)) {
                        for (int i = 0; i < 30 && (str2.equals(this.f4162m) || this.f4197I.contains(str2)); i++) {
                            str2 = (String) m1824q.get(CommonUtils.m2360a(0, m1824q.size() - 1));
                            if (i > 20) {
                                this.f4197I.clear();
                            }
                        }
                    }
                    GameEngine.PrintLog("Playing music from mod:" + m1957y2.m1846a() + " - '" + str2 + "'");
                }
            }
            if (str2 == null) {
                if (this.f4173x) {
                    str2 = m2930a(AbstractC0659at.f4214a);
                } else {
                    str2 = m2929a(AbstractC0659at.f4215b, AbstractC0659at.f4214a);
                }
                if (z2 || this.f4197I.contains(str2)) {
                    for (int i2 = 0; i2 < 30 && (str2.equals(this.f4162m) || this.f4197I.contains(str2)); i2++) {
                        str2 = m2929a(AbstractC0659at.f4215b, AbstractC0659at.f4214a);
                        if (i2 > 20) {
                            this.f4197I.clear();
                        }
                    }
                }
            }
            if (!str2.equals(this.f4162m)) {
                this.f4162m = str2;
                this.f4173x = false;
                this.f4166q = 0.0f;
                this.f4163n = z3 || str2.contains("[noloop]");
                this.f4197I.add(str2);
                if (this.f4197I.size() > 4) {
                    this.f4197I.remove(0);
                }
                if (z2) {
                    this.f4171v = "Now playing: " + m2924b(str2);
                }
                AbstractC0658as abstractC0658as = this.f4160k;
                this.f4160k = this.f4176A;
                this.f4176A = abstractC0658as;
                try {
                    try {
                        this.f4160k.mo2890a(m2927a(str2, false));
                        this.f4160k.mo2889a(!this.f4163n);
                        this.f4194E = false;
                        if (!z2 && this.f4177B) {
                            this.f4194E = true;
                        }
                        if (this.f4161l) {
                            this.f4177B = true;
                        }
                        this.f4178C = true;
                        this.f4196G = false;
                        this.f4179D = 1.0f;
                        this.f4161l = true;
                    } catch (RuntimeException e) {
                        e.printStackTrace();
                        if (this.f4175z < 3) {
                            this.f4171v = "Failed to play music track: " + str2;
                            this.f4175z++;
                        }
                        if (c0824b != null) {
                            c0824b.f5450P++;
                            return;
                        }
                        return;
                    }
                } catch (RuntimeException e2) {
                    e2.printStackTrace();
                    if (this.f4175z < 3) {
                        this.f4171v = "Failed to open music track: " + str2;
                        this.f4175z++;
                    }
                    if (c0824b != null) {
                        c0824b.f5450P++;
                        return;
                    }
                    return;
                }
            } else if (z2) {
                GameEngine.PrintLog("Same music found");
            }
        }
        if (this.f4178C || this.f4164o) {
            boolean mo2908c = f4183a.mo2908c();
            if (!mo2908c) {
                if (this.f4195F) {
                    this.f4179D -= f * 0.1f;
                } else {
                    this.f4179D -= f * 0.006f;
                }
            } else if (this.f4195F) {
                this.f4179D -= f * 0.1f;
            } else if (this.f4194E) {
                this.f4179D -= f * 0.003f;
            } else {
                this.f4179D -= f * 0.008f;
            }
            if (!mo2908c) {
                m2933a = this.f4179D * m2933a();
                m2933a2 = (1.0f - this.f4179D) * m2933a();
            } else {
                m2933a = ((this.f4179D * 2.0f) - 1.0f) * m2933a();
                m2933a2 = (1.0f - (this.f4179D * 2.0f)) * m2933a();
            }
            float m2315b = CommonUtils.m2315b(m2933a, 0.0f, 1.0f);
            float m2315b2 = CommonUtils.m2315b(m2933a2, 0.0f, 1.0f);
            if (this.f4178C) {
                if (this.f4179D <= 0.0f) {
                    this.f4178C = false;
                    this.f4194E = false;
                    if (this.f4177B && !this.f4196G) {
                        this.f4196G = true;
                        this.f4176A.mo2886d();
                    }
                    if (this.f4161l) {
                        this.f4160k.m2905a(m2933a(), m2933a());
                    }
                } else {
                    this.f4180H += f;
                    if (this.f4180H > 10.0f) {
                        this.f4180H = 0.0f;
                        if (this.f4177B && !this.f4196G) {
                            this.f4176A.m2905a(m2315b, m2315b);
                            if (m2315b < 0.02f) {
                                this.f4196G = true;
                                this.f4176A.mo2886d();
                            }
                        }
                        if (this.f4161l) {
                            this.f4160k.m2905a(m2315b2, m2315b2);
                        }
                    }
                }
            } else if (this.f4161l) {
                this.f4160k.m2905a(m2315b2, m2315b2);
            }
        }
        this.f4164o = false;
    }

    /* renamed from: f */
    public void m2919f() {
        Log.m7113a("RustedWarfare", "Music:pause()");
        new C06491().start();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.am$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/am$1.class */
    public class C06491 extends Thread {
        C06491() {
        }

        public void run() {
            if (C0648am.this.f4193j) {
                Log.m7113a("RustedWarfare", "Music:pause() unsynchronized");
                C0648am.this.m2918g();
                return;
            }
            synchronized (C0648am.this.f4186b) {
                Log.m7113a("RustedWarfare", "Music:pause() synchronized");
                C0648am.this.m2918g();
            }
        }
    }

    /* renamed from: g */
    public void m2918g() {
        if (this.f4161l) {
            this.f4160k.mo2892a();
        }
        if (this.f4177B) {
            this.f4176A.mo2892a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.am$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/am$2.class */
    public class C06502 extends Thread {
        C06502() {
        }

        public void run() {
            synchronized (C0648am.this.f4186b) {
                if (C0648am.this.f4161l) {
                    C0648am.this.f4160k.mo2888b();
                    if (!C0648am.this.f4178C) {
                        C0648am.this.f4160k.m2905a(C0648am.this.m2933a(), C0648am.this.m2933a());
                    }
                }
                if (C0648am.this.f4177B) {
                    C0648am.this.f4176A.mo2888b();
                }
            }
        }
    }

    /* renamed from: h */
    public void m2917h() {
        new C06502().start();
    }

    /* renamed from: i */
    public void m2916i() {
        f4183a.mo2909b();
        if (this.f4177B) {
            this.f4176A.mo2886d();
            this.f4176A.mo2885e();
        }
        if (this.f4160k != null) {
            this.f4160k.mo2886d();
            this.f4160k.mo2885e();
        }
        this.f4160k = null;
        this.f4162m = null;
        this.f4161l = false;
    }

    /* renamed from: j */
    public boolean m2915j() {
        if (this.f4178C) {
            return true;
        }
        return false;
    }
}
