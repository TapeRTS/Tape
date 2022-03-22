package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0169k;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.game.units.C0209ae;
import com.corrodinggames.rts.game.units.EnumC0212ah;
import com.corrodinggames.rts.game.units.custom.p018b.C0336i;
import com.corrodinggames.rts.game.units.p023d.AbstractC0403c;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.AbstractC0854w;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import com.corrodinggames.rts.gameFramework.p040k.C0781f;
import com.corrodinggames.rts.gameFramework.utility.C0812ae;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Properties;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.EntityResolver;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;

/* renamed from: com.corrodinggames.rts.game.b.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/b.class */
public final class C0148b {

    /* renamed from: i */
    public static C0156h f733i;

    /* renamed from: j */
    public static C0156h f734j;

    /* renamed from: k */
    public int f735k;

    /* renamed from: l */
    public int f736l;

    /* renamed from: m */
    public int f737m;

    /* renamed from: n */
    public int f738n;

    /* renamed from: o */
    public float f739o;

    /* renamed from: p */
    public float f740p;

    /* renamed from: t */
    public C0153e f744t;

    /* renamed from: y */
    public int f750y;

    /* renamed from: z */
    public int f751z;

    /* renamed from: F */
    public static C0748e f757F;

    /* renamed from: G */
    public static AbstractC0755l f758G;

    /* renamed from: H */
    public byte[][] f759H;

    /* renamed from: I */
    public byte[][] f760I;

    /* renamed from: L */
    public C0157i f763L;

    /* renamed from: M */
    public int f764M;

    /* renamed from: N */
    public int f765N;

    /* renamed from: P */
    public boolean f767P;

    /* renamed from: Q */
    public boolean f768Q;

    /* renamed from: R */
    public int f769R;

    /* renamed from: S */
    public int f770S;

    /* renamed from: U */
    Paint f772U;

    /* renamed from: V */
    Paint f773V;

    /* renamed from: W */
    Paint f774W;

    /* renamed from: X */
    Paint f775X;

    /* renamed from: Y */
    Paint f776Y;

    /* renamed from: Z */
    Paint f777Z;

    /* renamed from: aa */
    float f778aa;

    /* renamed from: ah */
    long f785ah;

    /* renamed from: ai */
    float f786ai;

    /* renamed from: aj */
    float f787aj;

    /* renamed from: a */
    static final boolean f725a = false;

    /* renamed from: b */
    static final boolean f726b = false;

    /* renamed from: c */
    static final boolean f727c = false;

    /* renamed from: d */
    static Paint f728d = new Paint();

    /* renamed from: e */
    static Paint f729e = new Paint();

    /* renamed from: f */
    static Paint f730f = new Paint();

    /* renamed from: g */
    static Paint f731g = new Paint();

    /* renamed from: D */
    public static boolean f755D = false;

    /* renamed from: E */
    public static boolean f756E = false;

    /* renamed from: ad */
    public static C0151c f781ad = new C0151c();

    /* renamed from: h */
    boolean[] f732h = new boolean[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];

    /* renamed from: q */
    public ArrayList f741q = new ArrayList();

    /* renamed from: r */
    public C0153e f742r = null;

    /* renamed from: s */
    public C0153e f743s = null;

    /* renamed from: u */
    public C0153e f745u = null;

    /* renamed from: v */
    public ArrayList f746v = new ArrayList();

    /* renamed from: w */
    public ArrayList f747w = new ArrayList();

    /* renamed from: ak */
    private int f748ak = 1;

    /* renamed from: x */
    public C0155g[] f749x = new C0155g[0];

    /* renamed from: A */
    public boolean f752A = true;

    /* renamed from: B */
    public boolean f753B = false;

    /* renamed from: C */
    public boolean f754C = false;

    /* renamed from: J */
    Rect f761J = new Rect();

    /* renamed from: K */
    protected ArrayList f762K = new ArrayList();

    /* renamed from: O */
    public PointF f766O = new PointF();

    /* renamed from: T */
    float f771T = 0.0f;

    /* renamed from: ab */
    float f779ab = 1.0f;

    /* renamed from: ac */
    int f780ac = 0;

    /* renamed from: ae */
    Paint f782ae = new Paint();

    /* renamed from: af */
    Rect f783af = new Rect();

    /* renamed from: ag */
    Rect f784ag = new Rect();

    /* renamed from: a */
    public static void m3705a() {
        AbstractC0789l u = AbstractC0789l.m638u();
        f728d.m4189a(150, 255, 255, 255);
        f728d.m4184a(Paint.Style.STROKE);
        f728d.m4192a(1.0f);
        u.m723a(f728d, 16.0f);
        f729e.m4189a(150, 255, 0, 0);
        f729e.m4184a(Paint.Style.STROKE);
        f729e.m4192a(1.0f);
        f730f.m4189a(150, 0, 255, 0);
        f730f.m4184a(Paint.Style.STROKE);
        f730f.m4192a(1.0f);
        f731g.m4189a(150, 255, 0, 0);
        long a = C0586bj.m1919a();
        C0748e a2 = u.f5514bw.mo194a(C0063R.drawable.fog_smooth);
        f757F = u.f5514bw.mo145b(((20 + 2) * 16) + 1, ((20 + 2) * 16) + 1, true);
        f757F.f5243i = true;
        f758G = u.f5514bw.mo177a(f757F);
        C0748e b = u.f5514bw.mo145b(20 + 1, 20 + 1, true);
        AbstractC0755l a3 = u.f5514bw.mo177a(b);
        m3674a(m3668b(1), 2, 5, true, b, a3, a2);
        m3674a(m3668b(2), 0, 5, true, b, a3, a2);
        m3674a(m3668b(4), 0, 3, true, b, a3, a2);
        m3674a(m3668b(8), 2, 3, true, b, a3, a2);
        m3674a(m3695a(16, 1, 2), 1, 0, true, b, a3, a2);
        m3674a(m3695a(32, 2, 4), 2, 1, true, b, a3, a2);
        m3674a(m3695a(64, 8, 4), 1, 2, true, b, a3, a2);
        m3674a(m3695a(-128, 1, 8), 0, 1, true, b, a3, a2);
        m3674a(m3695a(16 + 32, 2, 1, 4), 2, 0, true, b, a3, a2);
        m3674a(m3695a(32 + 64, 4, 8, 2), 2, 2, true, b, a3, a2);
        m3674a(m3695a(64 - 128, 8, 4, 1), 0, 2, true, b, a3, a2);
        m3674a(m3695a((-128) + 16, 1, 8, 2), 0, 0, true, b, a3, a2);
        m3673a(m3668b(1 + 2), m3675a(2, 5, 0, 5), true, b, a3, a2);
        m3673a(m3668b(2 + 4), m3675a(0, 5, 0, 3), true, b, a3, a2);
        m3673a(m3668b(4 + 8), m3675a(0, 3, 2, 3), true, b, a3, a2);
        m3673a(m3668b(8 + 1), m3675a(2, 3, 2, 5), true, b, a3, a2);
        m3673a(m3695a(16 + 32 + 64, 1, 2, 4, 8), m3675a(2, 0, 2, 2), true, b, a3, a2);
        m3673a(m3695a((32 + 64) - 128, 1, 2, 4, 8), m3675a(2, 2, 0, 2), true, b, a3, a2);
        m3673a(m3695a((64 - 128) + 16, 1, 2, 4, 8), m3675a(0, 2, 0, 0), true, b, a3, a2);
        m3673a(m3695a((-128) + 16 + 32, 1, 2, 4, 8), m3675a(0, 0, 2, 0), true, b, a3, a2);
        m3673a(m3668b(16 + 64), m3675a(1, 0, 1, 2), true, b, a3, a2);
        m3673a(m3668b((-128) + 32), m3675a(0, 1, 2, 1), true, b, a3, a2);
        m3673a(m3668b(1 + 4), m3675a(2, 5, 0, 3), true, b, a3, a2);
        m3673a(m3668b(2 + 8), m3675a(0, 5, 2, 3), true, b, a3, a2);
        m3673a(m3695a(16 + 4, 2, 1), m3675a(1, 0, 0, 3), true, b, a3, a2);
        m3673a(m3695a(64 + 2, 4, 8), m3675a(1, 2, 0, 5), true, b, a3, a2);
        m3673a(m3695a((-128) + 2, 1, 8), m3675a(0, 1, 0, 5), true, b, a3, a2);
        m3673a(m3695a(32 + 1, 2, 4), m3675a(2, 1, 2, 5), true, b, a3, a2);
        m3673a(m3695a(16 + 8, 2, 1), m3675a(1, 0, 2, 3), true, b, a3, a2);
        m3673a(m3695a(64 + 1, 4, 8), m3675a(1, 2, 2, 5), true, b, a3, a2);
        m3673a(m3695a((-128) + 4, 1, 8), m3675a(0, 1, 0, 3), true, b, a3, a2);
        m3673a(m3695a(32 + 8, 2, 4), m3675a(2, 1, 2, 3), true, b, a3, a2);
        m3673a(m3695a(16 + 4 + 8, 2, 1), m3675a(1, 0, 0, 3, 2, 3), true, b, a3, a2);
        m3673a(m3695a(64 + 2 + 1, 4, 8), m3675a(1, 2, 0, 5, 2, 5), true, b, a3, a2);
        m3673a(m3695a((-128) + 2 + 4, 1, 8), m3675a(0, 1, 2, 5, 2, 3), true, b, a3, a2);
        m3673a(m3695a(32 + 1 + 8, 2, 4), m3675a(2, 1, 0, 5, 0, 3), true, b, a3, a2);
        m3673a(m3668b(-1), m3675a(1, 4), true, b, a3, a2);
        f758G.mo122m();
        f758G.mo121n();
        f758G = null;
        a3.mo121n();
        C0586bj.m1914a("smoothFog load took:", a);
        f755D = u.f5516by.softFogFading;
        if (AbstractC0789l.m699aj()) {
        }
        f733i = new C0156h(1.0f, false);
        f733i.m3606a();
        f734j = new C0156h(0.5f, false);
        f734j.m3606a();
    }

    /* renamed from: b */
    private static int[] m3668b(int i) {
        return new int[]{i};
    }

    /* renamed from: a */
    private static int[] m3695a(int i, int... iArr) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(Integer.valueOf(i));
        if (iArr.length == 1) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
        } else if (iArr.length == 2) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
        } else if (iArr.length == 3) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2]));
        } else if (iArr.length == 4) {
            arrayList.add(Integer.valueOf(i + iArr[0]));
            arrayList.add(Integer.valueOf(i + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[1]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[0] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[2]));
            arrayList.add(Integer.valueOf(i + iArr[1] + iArr[3]));
            arrayList.add(Integer.valueOf(i + iArr[2] + iArr[3]));
        } else {
            throw new RuntimeException("unhandled:" + iArr.length);
        }
        int[] iArr2 = new int[arrayList.size()];
        for (int i2 = 0; i2 < arrayList.size(); i2++) {
            if (arrayList.get(i2) != null) {
                iArr2[i2] = ((Integer) arrayList.get(i2)).intValue();
            }
        }
        return iArr2;
    }

    /* renamed from: a */
    private static int[] m3675a(int... iArr) {
        return iArr;
    }

    /* renamed from: a */
    private static void m3674a(int[] iArr, int i, int i2, boolean z, C0748e eVar, AbstractC0755l lVar, C0748e eVar2) {
        m3673a(iArr, m3675a(i, i2), z, eVar, lVar, eVar2);
    }

    /* renamed from: a */
    private static void m3673a(int[] iArr, int[] iArr2, boolean z, C0748e eVar, AbstractC0755l lVar, C0748e eVar2) {
        if (z) {
            lVar.mo123l();
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        rect.m4136a(0, 0, 20, 20);
        for (int i = 0; i < iArr2.length; i += 2) {
            int i2 = iArr2[i + 0] * 20;
            int i3 = iArr2[i + 1] * 20;
            rect2.m4136a(i2, i3, i2 + 20, i3 + 20);
            lVar.mo170a(eVar2, rect2, rect, (Paint) null);
            rect4.m4136a(rect2.f229c - 1, rect2.f228b, rect2.f229c, rect2.f230d);
            rect3.m4136a(rect.f229c, rect.f228b, rect.f229c + 1, rect.f230d);
            lVar.mo170a(eVar2, rect4, rect3, (Paint) null);
            rect4.m4136a(rect2.f227a, rect2.f230d - 1, rect2.f229c, rect2.f230d);
            rect3.m4136a(rect.f227a, rect.f230d, rect.f229c, rect.f230d + 1);
            lVar.mo170a(eVar2, rect4, rect3, (Paint) null);
        }
        lVar.mo122m();
        for (int i4 : iArr) {
            m3696a(i4 + 128, eVar);
        }
    }

    /* renamed from: a */
    public static void m3696a(int i, C0748e eVar) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        rect2.m4136a(0, 0, 20, 20);
        m3697a(i, rect);
        C0156h.m3598a(f758G, eVar, rect2, rect, (Paint) null);
    }

    /* renamed from: a */
    public static void m3697a(int i, Rect rect) {
        int i2 = ((i % 16) * (20 + 2)) + 1;
        int i3 = (((int) (i * 0.0625f)) * (20 + 2)) + 1;
        rect.f227a = i2;
        rect.f228b = i3;
        rect.f229c = i2 + 20;
        rect.f230d = i3 + 20;
    }

    /* renamed from: a */
    public final short m3692a(C0155g gVar) {
        if (this.f748ak >= this.f749x.length) {
            C0155g[] gVarArr = new C0155g[C0654f.m1454c(this.f749x.length + 100, 32767)];
            System.arraycopy(this.f749x, 0, gVarArr, 0, this.f749x.length);
            this.f749x = gVarArr;
        }
        int i = this.f748ak;
        this.f748ak++;
        this.f749x[i] = gVar;
        return (short) i;
    }

    /* renamed from: a */
    public final C0155g m3676a(short s) {
        return this.f749x[s];
    }

    /* renamed from: a */
    public C0155g m3691a(C0155g gVar, int i, int i2) {
        int length;
        if (gVar.f861m == null || (((i * 13) + (i2 * 1313)) % (gVar.f861m.length + 1)) - 1 < 0) {
            return gVar;
        }
        return gVar.f861m[length];
    }

    /* renamed from: a */
    public boolean m3701a(float f, float f2, AbstractC0171m mVar) {
        if (!this.f752A) {
            return true;
        }
        int i = (int) (f * this.f739o);
        int i2 = (int) (f2 * this.f740p);
        if (mVar.f1262C == null || !m3661c(i, i2) || mVar.f1262C[i][i2] < 5) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m3703a(float f, float f2) {
        this.f764M = (int) (f * this.f739o);
        this.f765N = (int) (f2 * this.f740p);
    }

    /* renamed from: a */
    public void m3699a(int i, int i2) {
        this.f764M = i * this.f735k;
        this.f765N = i2 * this.f736l;
    }

    /* renamed from: b */
    public void m3667b(int i, int i2) {
        this.f764M = (i * this.f735k) + this.f737m;
        this.f765N = (i2 * this.f736l) + this.f738n;
    }

    /* renamed from: a */
    public PointF m3694a(Point point) {
        this.f766O.m4141a(point.f221a * this.f735k, point.f222b * this.f736l);
        return this.f766O;
    }

    /* renamed from: b */
    public void m3670b(float f, float f2) {
        m3703a(f, f2);
        m3699a(this.f764M, this.f765N);
    }

    /* renamed from: a */
    public float m3704a(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > m3649f()) {
            f = m3649f();
        }
        return f;
    }

    /* renamed from: b */
    public float m3671b(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > m3646g()) {
            f = m3646g();
        }
        return f;
    }

    /* renamed from: c */
    public final boolean m3661c(int i, int i2) {
        return i >= 0 && i < this.f750y && i2 >= 0 && i2 < this.f751z;
    }

    /* renamed from: c */
    public C0155g m3662c(float f, float f2) {
        int i = (int) (f * this.f739o);
        int i2 = (int) (f2 * this.f740p);
        if (i < 0 || i >= this.f750y || i2 < 0 || i2 >= this.f751z) {
            return null;
        }
        return this.f742r.m3617a(i, i2);
    }

    /* renamed from: d */
    public C0155g m3656d(int i, int i2) {
        if (!m3661c(i, i2)) {
            return null;
        }
        return this.f742r.m3617a(i, i2);
    }

    /* renamed from: e */
    public C0155g m3651e(int i, int i2) {
        if (m3661c(i, i2) && this.f745u != null) {
            return this.f745u.m3617a(i, i2);
        }
        return null;
    }

    /* renamed from: a */
    void m3693a(RectF rectF) {
        if (AbstractC0789l.m637v()) {
            rectF.f231a *= this.f735k / 20;
            rectF.f233c *= this.f735k / 20;
            rectF.f232b *= this.f736l / 20;
            rectF.f234d *= this.f736l / 20;
        }
    }

    public C0148b() {
        this.f735k = 20;
        this.f736l = 20;
        if (AbstractC0789l.m637v()) {
            this.f735k = 60;
            this.f736l = 60;
        }
        this.f737m = this.f735k / 2;
        this.f738n = this.f736l / 2;
        this.f739o = 1.0f / this.f735k;
        this.f740p = 1.0f / this.f736l;
        this.f772U = new C0760q();
        this.f772U.m4189a(100, 255, 0, 0);
        this.f772U.mo836b(16.0f);
        this.f773V = new C0760q();
        this.f773V.m4184a(Paint.Style.STROKE);
        this.f773V.m4192a(1.0f);
        this.f773V.m4189a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 0);
        this.f774W = new C0760q();
        this.f774W.m4184a(Paint.Style.STROKE);
        this.f774W.m4192a(1.0f);
        this.f774W.m4189a(100, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 0);
        this.f775X = new C0760q();
        this.f775X.m4184a(Paint.Style.STROKE);
        this.f775X.m4192a(1.0f);
        this.f775X.m4189a(255, 175, 0, 0);
        this.f776Y = new C0760q();
        this.f776Y.m4189a(155, 175, 0, 0);
        this.f777Z = new C0760q();
        this.f777Z.m4182a(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* renamed from: a */
    public static void m3681a(String str, C0690ap apVar) {
        InputStream b = m3666b(str);
        if (b == null) {
            throw new IOException("writeMapStream: Could not find map:" + str);
        }
        int a = (int) m3682a(str);
        AbstractC0789l.m670d("Sending map stream of size: " + a);
        apVar.mo1139a(b, a);
    }

    /* renamed from: a */
    public static long m3682a(String str) {
        String str2 = "" + str;
        String c = C0596a.m1889c(str2);
        if (C0812ae.m544c(c) && !c.endsWith(".rwmod")) {
            long a = C0812ae.m547a(c, false);
            if (a == -1) {
            }
            return a;
        } else if (!C0596a.m1890b(str2)) {
            return new File(c).length();
        } else {
            try {
                return AbstractC0789l.m638u().f5447ah.mo4277d().m4264b(c).getLength();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }

    /* renamed from: b */
    public static InputStream m3666b(String str) {
        InputStream d;
        InputStream d2 = m3655d(str);
        if (d2 == null && (d = m3655d(str.replace(".tmx", "") + "_moved")) != null) {
            String trim = C0654f.m1497a(d).trim();
            AbstractC0789l.m670d("Found moved map at:" + trim);
            d2 = m3655d(trim);
        }
        return d2;
    }

    /* renamed from: c */
    public static String m3660c(String str) {
        if (str == null) {
            return null;
        }
        return C0596a.m1889c(str);
    }

    /* renamed from: d */
    public static InputStream m3655d(String str) {
        String c = m3660c("" + str);
        AbstractC0789l.m670d("Mapfile: " + c);
        return C0596a.m1884h(c);
    }

    /* renamed from: a */
    public void m3677a(Document document, OutputStream outputStream) {
        Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
        newTransformer.setOutputProperty("indent", "yes");
        newTransformer.transform(new DOMSource(document), new StreamResult(outputStream));
    }

    /* renamed from: a */
    public void m3684a(InputStream inputStream, OutputStream outputStream) {
        float f;
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setValidating(false);
        DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
        newDocumentBuilder.setEntityResolver(new EntityResolver() { // from class: com.corrodinggames.rts.game.b.b.1
            @Override // org.xml.sax.EntityResolver
            public InputSource resolveEntity(String str, String str2) {
                return new InputSource(new ByteArrayInputStream(new byte[0]));
            }
        });
        Document parse = newDocumentBuilder.parse(inputStream);
        Element documentElement = parse.getDocumentElement();
        String attribute = documentElement.getAttribute("orientation");
        if (!attribute.equals("orthogonal")) {
            throw new C0154f("Only orthogonal maps are supported, found: " + attribute);
        }
        NodeList elementsByTagName = documentElement.getElementsByTagName("SOMETHING");
        for (int i = 0; i < elementsByTagName.getLength(); i++) {
            Element element = (Element) elementsByTagName.item(i);
        }
        NodeList elementsByTagName2 = documentElement.getElementsByTagName("layer");
        for (int i2 = 0; i2 < elementsByTagName2.getLength(); i2++) {
            Element element2 = (Element) elementsByTagName2.item(i2);
            if ("units".equalsIgnoreCase(element2.getAttribute("name"))) {
                element2.getParentNode().removeChild(element2);
            }
        }
        NodeList elementsByTagName3 = documentElement.getElementsByTagName("objectgroup");
        for (int i3 = 0; i3 < elementsByTagName3.getLength(); i3++) {
            Element element3 = (Element) elementsByTagName3.item(i3);
            if ("UnitObjects".equalsIgnoreCase(element3.getAttribute("name"))) {
                element3.getParentNode().removeChild(element3);
            }
        }
        Element createElement = parse.createElement("objectgroup");
        createElement.setAttribute("name", "UnitObjects");
        Iterator it = AbstractC0210af.m3317bt().iterator();
        while (it.hasNext()) {
            AbstractC0210af afVar = (AbstractC0210af) it.next();
            if ((afVar instanceof AbstractC0210af) && (!(afVar instanceof C0209ae) || !((C0209ae) afVar).f1451br)) {
                if (!afVar.f1459bz && !afVar.mo1607o_()) {
                    C0336i cV = afVar.m3306cV();
                    if (afVar.f1502cq == null || cV == null) {
                        Element createElement2 = parse.createElement("object");
                        int i4 = 20;
                        if (20 < afVar.f1474bO) {
                            i4 = (int) afVar.f1474bO;
                        }
                        createElement2.setAttribute("name", afVar.mo1606r().mo2754i() + " (t:" + afVar.f1461bB.f1239i + ")");
                        createElement2.setAttribute("x", "" + (afVar.f5842dH - (i4 / 2)));
                        createElement2.setAttribute("y", "" + (afVar.f5843dI - (i4 / 2)));
                        createElement2.setAttribute("width", "" + i4);
                        createElement2.setAttribute("height", "" + i4);
                        if (afVar.mo2643bw()) {
                            f = afVar.f1471bL;
                        } else {
                            f = afVar.f1471bL + 90.0f;
                        }
                        createElement2.setAttribute("rotation", "" + f);
                        Integer a = m3688a(afVar.mo1606r());
                        if (a != null) {
                            createElement2.setAttribute("gid", "" + a);
                        }
                        Element createElement3 = parse.createElement("properties");
                        Element createElement4 = parse.createElement("property");
                        createElement4.setAttribute("name", "unit");
                        createElement4.setAttribute("value", afVar.mo1606r().mo2754i());
                        createElement3.appendChild(createElement4);
                        Element createElement5 = parse.createElement("property");
                        createElement5.setAttribute("name", "team");
                        createElement5.setAttribute("value", "" + afVar.f1461bB.f1239i);
                        createElement3.appendChild(createElement5);
                        createElement2.appendChild(createElement3);
                        createElement.appendChild(createElement2);
                    } else if (!cV.f2292D) {
                    }
                }
            }
        }
        documentElement.appendChild(createElement);
        m3677a(parse, outputStream);
    }

    /* renamed from: a */
    public boolean m3680a(String str, String str2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        try {
            m3665b(str, str2);
            u.f5518bA.f4280e.m1642a(null, "Map exported.");
            return true;
        } catch (C0154f e) {
            u.m674c("Error exporting map", "Failed to export map. error: " + e.getMessage());
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            u.m674c("Error exporting map", "Failed to export map. IO error: " + e2.getMessage());
            return false;
        } catch (NoClassDefFoundError e3) {
            e3.printStackTrace();
            u.m674c("Error exporting map", "Failed to export map. Class not found: " + e3.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public void m3665b(String str, String str2) {
        AbstractC0789l.m670d(" --- Saving map:" + str + " to: " + str2);
        InputStream b = m3666b(str);
        if (b == null) {
            throw new IOException("Could not find orginal map: " + str);
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(b);
        String c = C0596a.m1889c(str2);
        File parentFile = new File(c).getParentFile();
        parentFile.mkdirs();
        if (!parentFile.isDirectory()) {
            AbstractC0789l.m682b("Save Map: Could not create parent directory");
        }
        try {
            OutputStream fileOutputStream = new FileOutputStream(c);
            try {
                m3684a(bufferedInputStream, fileOutputStream);
                try {
                    fileOutputStream.close();
                    bufferedInputStream.close();
                    b.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            } catch (IOException e2) {
                throw new IOException(e2);
            } catch (ParserConfigurationException e3) {
                throw new IOException(e3);
            } catch (TransformerException e4) {
                throw new IOException(e4);
            } catch (SAXException e5) {
                throw new IOException(e5);
            }
        } catch (FileNotFoundException e6) {
            throw new IOException("Failed to open save target:" + c);
        }
    }

    /* renamed from: a */
    public void m3678a(String str, boolean z) {
        AbstractC0789l.m670d(" --- Loading map ---");
        InputStream b = m3666b(str);
        if (b == null) {
            throw new C0154f("Could not find map: " + m3660c(str));
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(b);
        m3683a(bufferedInputStream, z);
        try {
            bufferedInputStream.close();
            b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: a */
    public void m3683a(InputStream inputStream, boolean z) {
        int a;
        NodeList elementsByTagName;
        this.f747w.clear();
        f733i.m3597b();
        f734j.m3597b();
        try {
            AbstractC0789l.m670d("---- Loading map data ----");
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setValidating(false);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            newDocumentBuilder.setEntityResolver(new EntityResolver() { // from class: com.corrodinggames.rts.game.b.b.2
                @Override // org.xml.sax.EntityResolver
                public InputSource resolveEntity(String str, String str2) {
                    return new InputSource(new ByteArrayInputStream(new byte[0]));
                }
            });
            Element documentElement = newDocumentBuilder.parse(inputStream).getDocumentElement();
            String attribute = documentElement.getAttribute("orientation");
            if (!attribute.equals("orthogonal")) {
                throw new C0154f("Only orthogonal maps are supported, found: " + attribute);
            }
            int parseInt = Integer.parseInt(documentElement.getAttribute("width"));
            int parseInt2 = Integer.parseInt(documentElement.getAttribute("height"));
            this.f750y = parseInt;
            this.f751z = parseInt2;
            AbstractC0789l.m670d("Map size: " + this.f750y + ", " + this.f751z);
            this.f787aj = 150.0f;
            if (this.f752A) {
                AbstractC0789l.m670d("Setting up team fog..");
                for (int i = 0; i < AbstractC0171m.f1230a; i++) {
                    AbstractC0171m n = AbstractC0171m.m3436n(i);
                    if (n != null) {
                        n.f1260A = this.f750y;
                        n.f1261B = this.f751z;
                        n.f1262C = new byte[this.f750y][this.f751z];
                        for (int i2 = 0; i2 < this.f750y; i2++) {
                            for (int i3 = 0; i3 < this.f751z; i3++) {
                                n.f1262C[i2][i3] = 10;
                            }
                        }
                    }
                }
            } else {
                AbstractC0789l.m670d("No team fog on this map..");
                for (int i4 = 0; i4 < AbstractC0171m.f1230a; i4++) {
                    AbstractC0171m n2 = AbstractC0171m.m3436n(i4);
                    if (n2 != null) {
                        n2.f1262C = null;
                    }
                }
            }
            Element element = (Element) documentElement.getElementsByTagName("properties").item(0);
            if (!(element == null || (elementsByTagName = element.getElementsByTagName("property")) == null)) {
                Properties properties = new Properties();
                for (int i5 = 0; i5 < elementsByTagName.getLength(); i5++) {
                    Element element2 = (Element) elementsByTagName.item(i5);
                    properties.setProperty(element2.getAttribute("name"), element2.getAttribute("value"));
                }
            }
            C0158j jVar = null;
            NodeList elementsByTagName2 = documentElement.getElementsByTagName("tileset");
            for (short s = 0; s < elementsByTagName2.getLength(); s = (short) (s + 1)) {
                C0158j jVar2 = new C0158j(this, (Element) elementsByTagName2.item(s));
                jVar2.f897m = s;
                if (jVar != null) {
                    jVar.m3583c(jVar2.f895k - 1);
                }
                jVar = jVar2;
                this.f741q.add(jVar2);
            }
            NodeList elementsByTagName3 = documentElement.getElementsByTagName("layer");
            for (int i6 = 0; i6 < elementsByTagName3.getLength(); i6++) {
                Element element3 = (Element) elementsByTagName3.item(i6);
                String attribute2 = element3.getAttribute("name");
                if (!"set".equalsIgnoreCase(attribute2) && !"set-disabled".equalsIgnoreCase(attribute2)) {
                    C0153e eVar = new C0153e(this, element3);
                    eVar.f835j = i6;
                    this.f746v.add(eVar);
                }
            }
            Iterator it = this.f746v.iterator();
            while (it.hasNext()) {
                C0153e eVar2 = (C0153e) it.next();
                if (eVar2.f843r) {
                    this.f742r = eVar2;
                }
                if (eVar2.f836k.equalsIgnoreCase("grounddetails")) {
                    this.f743s = eVar2;
                }
                if (eVar2.f836k.equalsIgnoreCase("Items") || eVar2.f836k.equalsIgnoreCase("Objects")) {
                    this.f745u = eVar2;
                }
                if (eVar2.f836k.equalsIgnoreCase("PathingOverride")) {
                    this.f744t = eVar2;
                }
            }
            if (this.f742r == null) {
                throw new C0154f("'Ground' layer was not found in map, this layer is required");
            }
            if (!AbstractC0789l.m637v() && !AbstractC0789l.m636w()) {
                for (int i7 = 0; i7 < this.f750y; i7++) {
                    for (int i8 = 0; i8 < this.f751z; i8++) {
                        if (this.f742r.m3617a(i7, i8) == null) {
                            throw new C0154f("An empty tile on the Ground layer at " + i7 + "," + i8 + " all tiles must be filled");
                        }
                    }
                }
            }
            if (this.f745u == null) {
                throw new C0154f("'Items' layer was not found in map, this layer is required");
            }
            NodeList elementsByTagName4 = documentElement.getElementsByTagName("objectgroup");
            for (int i9 = 0; i9 < elementsByTagName4.getLength(); i9++) {
                C0157i iVar = new C0157i((Element) elementsByTagName4.item(i9), this);
                iVar.f879a = i9;
                this.f762K.add(iVar);
            }
            C0158j.m3593a();
            Iterator it2 = this.f741q.iterator();
            while (it2.hasNext()) {
                C0158j jVar3 = (C0158j) it2.next();
                if (jVar3.f900p) {
                    jVar3.m3584c();
                }
            }
            C0158j.m3587b();
            int i10 = 0;
            while (i10 <= 1) {
                Iterator it3 = this.f746v.iterator();
                while (it3.hasNext()) {
                    C0153e eVar3 = (C0153e) it3.next();
                    if ((eVar3 == this.f742r) == (i10 == 0)) {
                        eVar3.f848w = false;
                        if (eVar3.f844s) {
                            for (int i11 = 0; i11 < this.f750y; i11++) {
                                for (int i12 = 0; i12 < this.f751z; i12++) {
                                    C0155g a2 = eVar3.m3617a(i11, i12);
                                    if (a2 != null && a2.f851c == -2) {
                                        a2.f851c = f733i.m3600a(a2.f849a, a2.f850b);
                                        if (a2.f851c >= 0 && (a = f734j.m3600a(a2.f849a, a2.f850b)) != a2.f851c) {
                                            throw new RuntimeException("Meta index mismatch: " + a + " vs " + a2.f851c);
                                        } else if (a2.f851c < 0) {
                                            eVar3.f848w = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i10++;
            }
            f733i.m3595c();
            f734j.m3595c();
            this.f763L = m3650e("triggers");
            C0147a aVar = null;
            if (this.f763L != null) {
                aVar = this.f763L.m3594a("map_info");
            }
            boolean z2 = false;
            boolean z3 = false;
            AbstractC0789l u = AbstractC0789l.m638u();
            u.f5530bM = null;
            String str = null;
            String str2 = null;
            if (aVar != null) {
                String b = aVar.m3708b("type");
                str2 = aVar.m3708b("fog");
                if ("mission".equalsIgnoreCase(b) || "survival".equalsIgnoreCase(b) || "challenge".equalsIgnoreCase(b) || "skirmish".equalsIgnoreCase(b)) {
                    str = b;
                } else {
                    AbstractC0789l.m682b("Unknown map type:" + b);
                }
            } else {
                AbstractC0789l.m682b("Map type not found on mapInfo");
            }
            if (str == null) {
                AbstractC0789l.m682b("Defaulting to skirmish map type");
                str = "skirmish";
            } else {
                AbstractC0789l.m682b("Map type: " + str);
            }
            u.f5530bM = new C0781f();
            u.f5530bM.m787a(z);
            if (str2 == null || "".equals(str2)) {
                if (AbstractC0789l.m697al() && !u.m754G()) {
                    z2 = true;
                    if (str != null && str.equalsIgnoreCase("skirmish")) {
                        z3 = true;
                    }
                }
            } else if (!str2.equalsIgnoreCase("none")) {
                z2 = true;
                if (str2.equalsIgnoreCase("los")) {
                    z3 = true;
                } else if (!str2.equalsIgnoreCase("map")) {
                    AbstractC0789l.m670d("Unknown map fog type: " + str2);
                }
            }
            if (!z2) {
                this.f752A = false;
            }
            if (z2 && z3) {
                this.f753B = true;
            }
            this.f767P = true;
        } catch (IOException e) {
            throw new C0154f("Failed to parse map", e);
        } catch (ParserConfigurationException e2) {
            throw new RuntimeException("Failed to parse map", e2);
        } catch (SAXException e3) {
            AbstractC0789l.m670d(" --- SAXException: Failed to parse map - " + e3.getMessage() + " ---");
            try {
                AbstractC0789l.m670d("available:" + inputStream.available());
                inputStream.reset();
                AbstractC0789l.m670d("after reset:" + inputStream.available());
            } catch (IOException e4) {
                AbstractC0789l.m670d("-- error writing debug info --");
                e4.printStackTrace();
            }
            throw new C0154f("Failed to parse map - " + e3.getMessage(), e3);
        }
    }

    /* renamed from: b */
    public void m3672b() {
    }

    /* renamed from: a */
    public void m3690a(C0169k kVar) {
        if (!AbstractC0789l.f5471aF || AbstractC0789l.f5472aG) {
            f781ad.m3635a(kVar);
        }
    }

    /* renamed from: a */
    public void m3687a(AbstractC0515r rVar, int i, int i2, int i3, int i4, int i5, int i6, AbstractC0755l lVar, boolean z, int i7) {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0148b bVar = u.f5511bt;
        AbstractC0268al i8 = u.f5518bA.f4324W.mo2412i();
        EnumC0212ah o = i8.mo2742o();
        for (int i9 = i; i9 <= i3; i9++) {
            for (int i10 = i2; i10 <= i4; i10++) {
                boolean a = AbstractC0403c.m2649a(rVar, i8, o, i9, i10, i7);
                int i11 = (i9 * bVar.f735k) - i5;
                int i12 = (i10 * bVar.f736l) - i6;
                this.f783af.m4136a(i11, i12, (i11 + bVar.f735k) - 1, (i12 + bVar.f736l) - 1);
                if (z) {
                    if (a) {
                        lVar.mo142b(this.f783af, bVar.f774W);
                    } else {
                        lVar.mo142b(this.f783af, bVar.f776Y);
                        lVar.mo142b(this.f783af, bVar.f775X);
                    }
                } else if (a) {
                    lVar.mo142b(this.f783af, bVar.f773V);
                } else {
                    lVar.mo142b(this.f783af, bVar.f775X);
                }
            }
        }
    }

    /* renamed from: c */
    public static void m3664c() {
        f781ad.m3626d();
    }

    /* renamed from: c */
    public void m3663c(float f) {
        f781ad.m3641a(f);
    }

    /* renamed from: d */
    public void m3658d() {
        f781ad.m3630c();
    }

    /* renamed from: d */
    public void m3657d(float f) {
        m3663c(f);
        if (this.f768Q) {
            new Rect();
            Rect rect = new Rect();
            int i = this.f769R * this.f735k;
            int i2 = this.f770S * this.f736l;
            rect.m4136a(i, i2, i + this.f735k, i2 + this.f736l);
            rect.m4137a(-AbstractC0789l.m638u().f5545cb, -AbstractC0789l.m638u().f5546cc);
        }
    }

    /* renamed from: e */
    public void m3652e(float f) {
        AbstractC0789l.m638u();
        m3648f(f);
    }

    /* renamed from: e */
    public void m3653e() {
        Iterator it = this.f741q.iterator();
        while (it.hasNext()) {
            ((C0158j) it.next()).m3582d();
        }
        this.f741q.clear();
        Iterator it2 = this.f746v.iterator();
        while (it2.hasNext()) {
            ((C0153e) it2.next()).m3611b();
        }
        this.f746v.clear();
        this.f762K.clear();
        this.f763L = null;
        f781ad.m3630c();
    }

    /* renamed from: a */
    public C0158j m3700a(int i) {
        for (int i2 = 0; i2 < this.f741q.size(); i2++) {
            C0158j jVar = (C0158j) this.f741q.get(i2);
            if (jVar.m3581d(i)) {
                return jVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Integer m3688a(AbstractC0268al alVar) {
        String i = alVar.mo2754i();
        Integer c = m3659c("unit", i);
        if (c == null) {
            c = m3659c("customUnit", i);
        }
        return c;
    }

    /* renamed from: c */
    public Integer m3659c(String str, String str2) {
        for (int i = 0; i < this.f741q.size(); i++) {
            Integer b = ((C0158j) this.f741q.get(i)).m3585b(str, str2);
            if (b != null) {
                return b;
            }
        }
        return null;
    }

    /* renamed from: e */
    public C0157i m3650e(String str) {
        Iterator it = this.f762K.iterator();
        while (it.hasNext()) {
            C0157i iVar = (C0157i) it.next();
            if (str.equalsIgnoreCase(iVar.f880b)) {
                return iVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public float m3649f() {
        return this.f742r.f839n * this.f735k;
    }

    /* renamed from: g */
    public float m3646g() {
        return this.f742r.f840o * this.f736l;
    }

    /* JADX WARN: Type inference failed for: r0v34, types: [long] */
    /* renamed from: a */
    public void m3702a(float f, float f2, int i, AbstractC0171m mVar, boolean z) {
        C0781f fVar;
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f752A) {
            char c = 0;
            if (f725a) {
                c = C0586bj.m1919a();
            }
            boolean z2 = true;
            boolean z3 = mVar.f1253u;
            if (!u.m694ao() && (fVar = u.f5530bM) != null && !fVar.m797a() && !fVar.m786b()) {
                z2 = false;
            }
            if (!z2) {
                m3669b(f, f2, i, mVar, z);
            } else {
                for (int i2 = 0; i2 < AbstractC0171m.f1230a; i2++) {
                    AbstractC0171m n = AbstractC0171m.m3436n(i2);
                    if (n != null && (n == mVar || (!n.f1248r && (n.m3464d(mVar) || z3)))) {
                        m3669b(f, f2, i, n, z);
                    }
                }
            }
            if (f725a) {
                this.f785ah += C0586bj.m1919a() - c;
            }
        }
    }

    /* renamed from: a */
    public byte m3698a(int i, int i2, byte[][] bArr, byte b) {
        byte b2 = 0;
        int i3 = this.f750y;
        int i4 = this.f751z;
        if (i >= 1) {
            if (bArr[i - 1][i2] >= b) {
                b2 = (byte) (0 - 128);
            }
            if (i2 >= 1 && bArr[i - 1][i2 - 1] >= b) {
                b2 = (byte) (b2 + 1);
            }
            if (i2 < i4 - 1 && bArr[i - 1][i2 + 1] >= b) {
                b2 = (byte) (b2 + 8);
            }
        }
        if (i2 >= 1) {
            if (bArr[i][i2 - 1] >= b) {
                b2 = (byte) (b2 + 16);
            }
            if (i < i3 - 1 && bArr[i + 1][i2 - 1] >= b) {
                b2 = (byte) (b2 + 2);
            }
        }
        if (i < i3 - 1 && bArr[i + 1][i2] >= b) {
            b2 = (byte) (b2 + 32);
        }
        if (i2 < i4 - 1) {
            if (bArr[i][i2 + 1] >= b) {
                b2 = (byte) (b2 + 64);
            }
            if (i < i3 - 1 && bArr[i + 1][i2 + 1] >= b) {
                b2 = (byte) (b2 + 4);
            }
        }
        if (b2 == Byte.MAX_VALUE) {
            b2 = -1;
        }
        return b2;
    }

    /* renamed from: h */
    public void m3644h() {
        m3643i();
        for (int i = 0; i < this.f750y; i++) {
            for (int i2 = 0; i2 < this.f751z; i2++) {
                this.f759H[i][i2] = 0;
                this.f760I[i][i2] = 0;
            }
        }
    }

    /* renamed from: f */
    public void m3647f(int i, int i2) {
        this.f759H[i][i2] = 0;
        this.f760I[i][i2] = 0;
    }

    /* renamed from: g */
    public void m3645g(int i, int i2) {
        int i3 = i - 1;
        int i4 = i2 - 1;
        if (i3 < 0) {
            i3 = 0;
        }
        if (i4 < 0) {
            i4 = 0;
        }
        int i5 = i + 1;
        int i6 = i2 + 1;
        if (i5 > this.f750y - 1) {
            i5 = this.f750y - 1;
        }
        if (i6 > this.f751z - 1) {
            i6 = this.f751z - 1;
        }
        for (int i7 = i3; i7 <= i5; i7++) {
            for (int i8 = i4; i8 <= i6; i8++) {
                if (this.f759H[i7][i8] != 0) {
                    this.f759H[i7][i8] = Byte.MAX_VALUE;
                }
                if (this.f760I[i7][i8] != 0) {
                    this.f760I[i7][i8] = Byte.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: i */
    public void m3643i() {
        boolean z = false;
        if (this.f759H == null) {
            z = true;
        } else if (!(this.f759H.length == this.f750y && this.f759H[0].length == this.f751z)) {
            AbstractC0789l.m670d("smoothFog_cache: Size mismatch");
            z = true;
        }
        if (z) {
            AbstractC0789l.m670d("Building smoothFog_cache");
            this.f759H = new byte[this.f750y][this.f751z];
            this.f760I = new byte[this.f750y][this.f751z];
            for (int i = 0; i < this.f750y; i++) {
                for (int i2 = 0; i2 < this.f751z; i2++) {
                    this.f759H[i][i2] = Byte.MAX_VALUE;
                    this.f760I[i][i2] = Byte.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: b */
    public void m3669b(float f, float f2, int i, AbstractC0171m mVar, boolean z) {
        byte b;
        AbstractC0789l u = AbstractC0789l.m638u();
        if (this.f752A && mVar.f1262C != null) {
            m3643i();
            float f3 = (i - 5) * (i - 5);
            float f4 = (i - 3) * (i - 3);
            float f5 = i * i;
            float f6 = (1.0f / (f5 - f4)) * 10.0f;
            m3703a(f, f2);
            int i2 = this.f764M;
            int i3 = this.f765N;
            float f7 = f * this.f739o;
            float f8 = f2 * this.f740p;
            byte[][] bArr = mVar.f1262C;
            int i4 = i - 1;
            int i5 = i2 - i4;
            int i6 = i3 - i4;
            if (i5 < 0) {
                i5 = 0;
            }
            if (i6 < 0) {
                i6 = 0;
            }
            int i7 = i2 + i4;
            int i8 = i3 + i4;
            if (i7 > this.f750y - 1) {
                i7 = this.f750y - 1;
            }
            if (i8 > this.f751z - 1) {
                i8 = this.f751z - 1;
            }
            C0151c cVar = f781ad;
            boolean z2 = false;
            boolean n = mVar.m3437n();
            for (int i9 = i5; i9 <= i7; i9++) {
                for (int i10 = i6; i10 <= i8; i10++) {
                    byte b2 = bArr[i9][i10];
                    if (b2 != 0) {
                        float a = C0654f.m1520a(f7, f8, i9, i10);
                        if (a <= f4) {
                            if (b2 > 0) {
                                bArr[i9][i10] = 0;
                                if (n) {
                                    cVar.m3636a(i9, i10, true);
                                    z2 = true;
                                    if (a > f3 || !z) {
                                        m3645g(i9, i10);
                                    } else {
                                        m3647f(i9, i10);
                                    }
                                }
                            }
                        } else if (a <= f5 && b2 > (b = (byte) ((a - f4) * f6))) {
                            bArr[i9][i10] = b;
                            if (n) {
                                cVar.m3636a(i9, i10, true);
                                z2 = true;
                                m3645g(i9, i10);
                            }
                        }
                    }
                }
            }
            if (z2) {
                u.f5522bE.f4472O = true;
            }
        }
    }

    /* renamed from: f */
    public void m3648f(float f) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (f725a) {
            this.f786ai += f;
            if (this.f786ai > 60.0f) {
                this.f786ai = 0.0f;
                if (this.f785ah > 0) {
                    AbstractC0789l.m670d("seeThoughFogOfWarTimes: " + C0586bj.m1911b(this.f785ah));
                    this.f785ah = 0L;
                }
                if (this.f785ah < 0) {
                    AbstractC0789l.m670d("seeThoughFogOfWarTimes negative: " + C0586bj.m1911b(this.f785ah));
                    this.f785ah = 0L;
                }
            }
        }
        if (this.f752A && this.f753B) {
            m3643i();
            this.f787aj += f;
            if (this.f787aj > 260.0f) {
                this.f787aj = 0.0f;
                AbstractC0854w[] a = AbstractC0210af.f5846dK.m472a();
                int size = AbstractC0854w.f5846dK.size();
                boolean z = false;
                for (int i = 0; i < AbstractC0171m.f1230a; i++) {
                    AbstractC0171m n = AbstractC0171m.m3436n(i);
                    if (n != null && !n.f1256w) {
                        z = true;
                        for (int i2 = 0; i2 < size; i2++) {
                            AbstractC0854w wVar = a[i2];
                            if (wVar instanceof AbstractC0515r) {
                                AbstractC0515r rVar = (AbstractC0515r) wVar;
                                if (rVar.mo2643bw()) {
                                    rVar.m3294e(n);
                                }
                            }
                        }
                        if (n.f1262C == null) {
                            AbstractC0789l.m682b("fogOfWar_map==null for:" + i);
                        }
                        boolean z2 = false;
                        boolean n2 = n.m3437n();
                        byte[][] bArr = n.f1262C;
                        byte[][] bArr2 = this.f760I;
                        for (int i3 = 0; i3 < this.f750y; i3++) {
                            for (int i4 = 0; i4 < this.f751z; i4++) {
                                if (bArr[i3][i4] < 5) {
                                    bArr[i3][i4] = 5;
                                    if (n2) {
                                        f781ad.m3636a(i3, i4, true);
                                        z2 = true;
                                        bArr2[i3][i4] = Byte.MAX_VALUE;
                                    }
                                }
                            }
                        }
                        if (z2) {
                            u.f5522bE.f4472O = true;
                        }
                    }
                }
                for (int i5 = 0; i5 < size; i5++) {
                    AbstractC0854w wVar2 = a[i5];
                    if (wVar2 instanceof AbstractC0515r) {
                        AbstractC0515r rVar2 = (AbstractC0515r) wVar2;
                        if (!rVar2.f1459bz) {
                            rVar2.mo2188c(false);
                        }
                    }
                }
                if (z) {
                    for (int i6 = 0; i6 < size; i6++) {
                        AbstractC0854w wVar3 = a[i6];
                        if (wVar3 instanceof AbstractC0515r) {
                            AbstractC0515r rVar3 = (AbstractC0515r) wVar3;
                            if (rVar3.mo2643bw()) {
                                rVar3.m3308cF();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m3686a(C0690ap apVar) {
        apVar.mo1090a(false);
    }

    /* renamed from: a */
    public void m3685a(C0707k kVar) {
        if (kVar.m1063e()) {
            int f = kVar.m1062f();
            int f2 = kVar.m1062f();
            for (int i = 0; i < f; i++) {
                for (int i2 = 0; i2 < f2; i2++) {
                    kVar.m1065d();
                }
            }
        }
    }

    /* renamed from: a */
    private InputStream m3679a(String str, String str2, int i) {
        String[] split = str2.split("/");
        if (split.length < i) {
            return null;
        }
        String str3 = "";
        boolean z = true;
        for (int length = split.length - i; length < split.length; length++) {
            if (!z) {
                str3 = str3 + "/";
            }
            z = false;
            str3 = str3 + split[length];
        }
        return C0596a.m1885g(str + str3);
    }

    /* renamed from: d */
    public InputStream m3654d(String str, String str2) {
        InputStream g = C0596a.m1885g(str + str2);
        if (g == null) {
            g = m3679a(str, str2, 3);
        }
        if (g == null) {
            g = m3679a(str, str2, 2);
        }
        if (g == null) {
            g = m3679a(str, str2, 1);
        }
        if (g != null) {
            return g;
        }
        throw new IOException("File could not be found:" + str + str2);
    }

    /* renamed from: a */
    public boolean m3689a(AbstractC0171m mVar, int i, int i2) {
        if (this.f754C || !this.f752A || mVar.f1262C == null || !m3661c(i, i2) || mVar.f1262C[i][i2] != 10) {
            return true;
        }
        return false;
    }
}
