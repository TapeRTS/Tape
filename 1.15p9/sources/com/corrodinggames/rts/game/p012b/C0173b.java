package com.corrodinggames.rts.game.p012b;

import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.PointF;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.os.Build;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.C0195l;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.EnumC0246ao;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Tree;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.buildings.AbstractC0488d;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p018b.C0399m;
import com.corrodinggames.rts.gameFramework.AbstractC1120w;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.p045m.C1049f;
import com.corrodinggames.rts.gameFramework.utility.AbstractC1076af;
import com.corrodinggames.rts.gameFramework.utility.C1075ae;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Properties;
import java.util.concurrent.locks.ReentrantLock;
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
public final class C0173b {

    /* renamed from: f */
    static boolean f781f;

    /* renamed from: l */
    public static C0181h f782l;

    /* renamed from: m */
    public static C0181h f783m;

    /* renamed from: n */
    public int f784n;

    /* renamed from: o */
    public int f785o;

    /* renamed from: p */
    public int f786p;

    /* renamed from: q */
    public int f787q;

    /* renamed from: r */
    public float f788r;

    /* renamed from: s */
    public float f789s;

    /* renamed from: x */
    public C0178e f790x;

    /* renamed from: C */
    public int f791C;

    /* renamed from: D */
    public int f792D;

    /* renamed from: K */
    public static BitmapOrTexture f793K;

    /* renamed from: L */
    public static InterfaceC1027y f794L;

    /* renamed from: M */
    public byte[][] f795M;

    /* renamed from: N */
    public byte[][] f796N;

    /* renamed from: Q */
    public C0182i f797Q;

    /* renamed from: R */
    public boolean f798R;

    /* renamed from: S */
    public boolean f799S;

    /* renamed from: T */
    public int f800T;

    /* renamed from: U */
    public int f801U;

    /* renamed from: W */
    public boolean f802W;

    /* renamed from: X */
    public boolean f803X;

    /* renamed from: Y */
    public int f804Y;

    /* renamed from: Z */
    public int f805Z;

    /* renamed from: ab */
    Paint f806ab;

    /* renamed from: ac */
    Paint f807ac;

    /* renamed from: ad */
    Paint f808ad;

    /* renamed from: ae */
    Paint f809ae;

    /* renamed from: af */
    Paint f810af;

    /* renamed from: ag */
    Paint f811ag;

    /* renamed from: ah */
    HashMap f812ah;

    /* renamed from: ai */
    float f813ai;

    /* renamed from: ap */
    long f814ap;

    /* renamed from: aq */
    float f815aq;

    /* renamed from: ar */
    float f816ar;

    /* renamed from: a */
    static final boolean f817a = false;

    /* renamed from: b */
    static final boolean f818b = false;

    /* renamed from: c */
    static final boolean f819c = false;

    /* renamed from: d */
    public static boolean f820d = false;

    /* renamed from: e */
    static ReentrantLock f821e = new ReentrantLock();

    /* renamed from: g */
    static Paint f822g = new Paint();

    /* renamed from: h */
    static Paint f823h = new Paint();

    /* renamed from: i */
    static Paint f824i = new Paint();

    /* renamed from: j */
    static Paint f825j = new Paint();

    /* renamed from: H */
    public static boolean f826H = false;

    /* renamed from: I */
    public static boolean f827I = false;

    /* renamed from: J */
    public static boolean f828J = false;

    /* renamed from: al */
    public static C0176c f829al = new C0176c();

    /* renamed from: k */
    boolean[] f830k = new boolean[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];

    /* renamed from: t */
    public ArrayList f831t = new ArrayList();

    /* renamed from: u */
    public C0178e f832u = null;

    /* renamed from: v */
    public C0178e f833v = null;

    /* renamed from: w */
    public C0178e f834w = null;

    /* renamed from: y */
    public C0178e f835y = null;

    /* renamed from: z */
    public ArrayList f836z = new ArrayList();

    /* renamed from: A */
    public ArrayList f837A = new ArrayList();

    /* renamed from: as */
    private int f838as = 1;

    /* renamed from: B */
    public C0180g[] f839B = new C0180g[0];

    /* renamed from: E */
    public boolean f840E = true;

    /* renamed from: F */
    public boolean f841F = false;

    /* renamed from: G */
    public boolean f842G = false;

    /* renamed from: O */
    Rect f843O = new Rect();

    /* renamed from: P */
    protected ArrayList f844P = new ArrayList();

    /* renamed from: V */
    public PointF f845V = new PointF();

    /* renamed from: aa */
    float f846aa = 0.0f;

    /* renamed from: aj */
    float f847aj = 1.0f;

    /* renamed from: ak */
    int f848ak = 0;

    /* renamed from: am */
    Paint f849am = new Paint();

    /* renamed from: an */
    Rect f850an = new Rect();

    /* renamed from: ao */
    Rect f851ao = new Rect();

    /* renamed from: a */
    public static void m6654a() {
        if (f781f) {
            return;
        }
        f821e.lock();
    }

    /* renamed from: b */
    public static void m6619b() {
        if (f781f) {
            return;
        }
        f821e.unlock();
    }

    /* renamed from: c */
    public static void m6611c() {
        GameEngine gameEngine = GameEngine.getInstance();
        f822g.m7267a(150, 255, 255, 255);
        f822g.m7260a(Paint.Style.STROKE);
        f822g.m7270a(1.0f);
        gameEngine.m1197a(f822g, 16.0f);
        f823h.m7267a(150, 255, 0, 0);
        f823h.m7260a(Paint.Style.STROKE);
        f823h.m7270a(1.0f);
        f824i.m7267a(150, 0, 255, 0);
        f824i.m7260a(Paint.Style.STROKE);
        f824i.m7270a(1.0f);
        f825j.m7267a(150, 255, 0, 0);
        long m2612a = C0727bl.m2612a();
        BitmapOrTexture loadImage = gameEngine.graphics.loadImage(R.drawable.fog_smooth);
        f793K = gameEngine.graphics.mo893b(((20 + 2) * 16) + 1, ((20 + 2) * 16) + 1, true);
        f793K.f6394m = true;
        f793K.m1040b(true);
        f794L = gameEngine.graphics.mo891b(f793K);
        BitmapOrTexture mo893b = gameEngine.graphics.mo893b(20 + 1, 20 + 1, true);
        InterfaceC1027y mo891b = gameEngine.graphics.mo891b(mo893b);
        m6621a(m6615b(1), 2, 5, true, mo893b, mo891b, loadImage);
        m6621a(m6615b(2), 0, 5, true, mo893b, mo891b, loadImage);
        m6621a(m6615b(4), 0, 3, true, mo893b, mo891b, loadImage);
        m6621a(m6615b(8), 2, 3, true, mo893b, mo891b, loadImage);
        m6621a(m6643a(16, 1, 2), 1, 0, true, mo893b, mo891b, loadImage);
        m6621a(m6643a(32, 2, 4), 2, 1, true, mo893b, mo891b, loadImage);
        m6621a(m6643a(64, 8, 4), 1, 2, true, mo893b, mo891b, loadImage);
        m6621a(m6643a(-128, 1, 8), 0, 1, true, mo893b, mo891b, loadImage);
        m6621a(m6643a(16 + 32, 2, 1, 4), 2, 0, true, mo893b, mo891b, loadImage);
        m6621a(m6643a(32 + 64, 4, 8, 2), 2, 2, true, mo893b, mo891b, loadImage);
        m6621a(m6643a(64 - 128, 8, 4, 1), 0, 2, true, mo893b, mo891b, loadImage);
        m6621a(m6643a((-128) + 16, 1, 8, 2), 0, 0, true, mo893b, mo891b, loadImage);
        m6620a(m6615b(1 + 2), m6622a(2, 5, 0, 5), true, mo893b, mo891b, loadImage);
        m6620a(m6615b(2 + 4), m6622a(0, 5, 0, 3), true, mo893b, mo891b, loadImage);
        m6620a(m6615b(4 + 8), m6622a(0, 3, 2, 3), true, mo893b, mo891b, loadImage);
        m6620a(m6615b(8 + 1), m6622a(2, 3, 2, 5), true, mo893b, mo891b, loadImage);
        m6620a(m6643a(16 + 32 + 64, 1, 2, 4, 8), m6622a(2, 0, 2, 2), true, mo893b, mo891b, loadImage);
        m6620a(m6643a((32 + 64) - 128, 1, 2, 4, 8), m6622a(2, 2, 0, 2), true, mo893b, mo891b, loadImage);
        m6620a(m6643a((64 - 128) + 16, 1, 2, 4, 8), m6622a(0, 2, 0, 0), true, mo893b, mo891b, loadImage);
        m6620a(m6643a((-128) + 16 + 32, 1, 2, 4, 8), m6622a(0, 0, 2, 0), true, mo893b, mo891b, loadImage);
        m6620a(m6615b(16 + 64), m6622a(1, 0, 1, 2), true, mo893b, mo891b, loadImage);
        m6620a(m6615b((-128) + 32), m6622a(0, 1, 2, 1), true, mo893b, mo891b, loadImage);
        m6620a(m6615b(1 + 4), m6622a(2, 5, 0, 3), true, mo893b, mo891b, loadImage);
        m6620a(m6615b(2 + 8), m6622a(0, 5, 2, 3), true, mo893b, mo891b, loadImage);
        m6620a(m6643a(16 + 4, 2, 1), m6622a(1, 0, 0, 3), true, mo893b, mo891b, loadImage);
        m6620a(m6643a(64 + 2, 4, 8), m6622a(1, 2, 0, 5), true, mo893b, mo891b, loadImage);
        m6620a(m6643a((-128) + 2, 1, 8), m6622a(0, 1, 0, 5), true, mo893b, mo891b, loadImage);
        m6620a(m6643a(32 + 1, 2, 4), m6622a(2, 1, 2, 5), true, mo893b, mo891b, loadImage);
        m6620a(m6643a(16 + 8, 2, 1), m6622a(1, 0, 2, 3), true, mo893b, mo891b, loadImage);
        m6620a(m6643a(64 + 1, 4, 8), m6622a(1, 2, 2, 5), true, mo893b, mo891b, loadImage);
        m6620a(m6643a((-128) + 4, 1, 8), m6622a(0, 1, 0, 3), true, mo893b, mo891b, loadImage);
        m6620a(m6643a(32 + 8, 2, 4), m6622a(2, 1, 2, 3), true, mo893b, mo891b, loadImage);
        m6620a(m6643a(16 + 4 + 8, 2, 1), m6622a(1, 0, 0, 3, 2, 3), true, mo893b, mo891b, loadImage);
        m6620a(m6643a(64 + 2 + 1, 4, 8), m6622a(1, 2, 0, 5, 2, 5), true, mo893b, mo891b, loadImage);
        m6620a(m6643a((-128) + 2 + 4, 1, 8), m6622a(0, 1, 2, 5, 2, 3), true, mo893b, mo891b, loadImage);
        m6620a(m6643a(32 + 1 + 8, 2, 4), m6622a(2, 1, 0, 5, 0, 3), true, mo893b, mo891b, loadImage);
        m6620a(m6615b(-1), m6622a(1, 4), true, mo893b, mo891b, loadImage);
        f794L.mo873p();
        f794L.mo872q();
        f794L = null;
        mo891b.mo872q();
        C0727bl.m2607a("smoothFog load took:", m2612a);
        m6605d();
        f782l = new C0181h(1.0f, false);
        f782l.m6547a();
        f783m = new C0181h(0.5f, false);
        f783m.m6547a();
    }

    /* renamed from: d */
    public static void m6605d() {
        if (f826H) {
            return;
        }
        f826H = true;
        f827I = GameEngine.getInstance().f6109bQ.softFogFading;
        if (GameEngine.m1159as() && Build.VERSION.SDK_INT > 26) {
            long maxMemory = Runtime.getRuntime().maxMemory() / 1048576;
            GameEngine.PrintLog("MaxHeapSizeInMB:" + maxMemory);
            if (maxMemory > 200) {
                GameEngine.PrintLog("enabling softFades");
                f827I = true;
            }
        }
    }

    /* renamed from: b */
    private static int[] m6615b(int i) {
        return new int[]{i};
    }

    /* renamed from: a */
    private static int[] m6643a(int i, int... iArr) {
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
    private static int[] m6622a(int... iArr) {
        return iArr;
    }

    /* renamed from: a */
    private static void m6621a(int[] iArr, int i, int i2, boolean z, BitmapOrTexture bitmapOrTexture, InterfaceC1027y interfaceC1027y, BitmapOrTexture bitmapOrTexture2) {
        m6620a(iArr, m6622a(i, i2), z, bitmapOrTexture, interfaceC1027y, bitmapOrTexture2);
    }

    /* renamed from: a */
    private static void m6620a(int[] iArr, int[] iArr2, boolean z, BitmapOrTexture bitmapOrTexture, InterfaceC1027y interfaceC1027y, BitmapOrTexture bitmapOrTexture2) {
        if (z) {
            interfaceC1027y.mo874o();
        }
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        Rect rect3 = new Rect();
        Rect rect4 = new Rect();
        rect.m7208a(0, 0, 20, 20);
        for (int i = 0; i < iArr2.length; i += 2) {
            int i2 = iArr2[i + 0] * 20;
            int i3 = iArr2[i + 1] * 20;
            rect2.m7208a(i2, i3, i2 + 20, i3 + 20);
            interfaceC1027y.mo910a(bitmapOrTexture2, rect2, rect, (Paint) null);
            rect4.m7208a(rect2.f232c - 1, rect2.f231b, rect2.f232c, rect2.f233d);
            rect3.m7208a(rect.f232c, rect.f231b, rect.f232c + 1, rect.f233d);
            interfaceC1027y.mo910a(bitmapOrTexture2, rect4, rect3, (Paint) null);
            rect4.m7208a(rect2.f230a, rect2.f233d - 1, rect2.f232c, rect2.f233d);
            rect3.m7208a(rect.f230a, rect.f233d, rect.f232c, rect.f233d + 1);
            interfaceC1027y.mo910a(bitmapOrTexture2, rect4, rect3, (Paint) null);
        }
        interfaceC1027y.mo873p();
        for (int i4 : iArr) {
            m6644a(i4 + 128, bitmapOrTexture);
        }
    }

    /* renamed from: a */
    public static void m6644a(int i, BitmapOrTexture bitmapOrTexture) {
        Rect rect = new Rect();
        Rect rect2 = new Rect();
        rect2.m7208a(0, 0, 20, 20);
        m6645a(i, rect);
        C0181h.m6539a(f794L, bitmapOrTexture, rect2, rect, (Paint) null);
    }

    /* renamed from: a */
    public static void m6645a(int i, Rect rect) {
        int i2 = ((i % 16) * (20 + 2)) + 1;
        int i3 = (((int) (i * 0.0625f)) * (20 + 2)) + 1;
        rect.f230a = i2;
        rect.f231b = i3;
        rect.f232c = i2 + 20;
        rect.f233d = i3 + 20;
    }

    /* renamed from: a */
    public final short m6640a(C0180g c0180g) {
        if (this.f838as >= this.f839B.length) {
            C0180g[] c0180gArr = new C0180g[CommonUtils.m2289c(this.f839B.length + 100, 32767)];
            System.arraycopy(this.f839B, 0, c0180gArr, 0, this.f839B.length);
            this.f839B = c0180gArr;
        }
        int i = this.f838as;
        if (this.f838as < 32766) {
            this.f838as++;
        } else {
            GameEngine.m1145b("Max unique tile limit reached at: " + this.f838as);
        }
        this.f839B[i] = c0180g;
        return (short) i;
    }

    /* renamed from: a */
    public final C0180g m6623a(short s) {
        return this.f839B[s];
    }

    /* renamed from: a */
    public C0180g m6639a(C0180g c0180g, int i, int i2) {
        int length;
        if (c0180g != null && c0180g.f925m != null && (((i * 13) + (i2 * 1313)) % (c0180g.f925m.length + 1)) - 1 >= 0) {
            return c0180g.f925m[length];
        }
        return c0180g;
    }

    /* renamed from: a */
    public boolean m6650a(float f, float f2, Team team) {
        if (this.f840E) {
            int i = (int) (f * this.f788r);
            int i2 = (int) (f2 * this.f789s);
            if (team.f1336M != null && m6608c(i, i2) && team.f1336M[i][i2] >= 5) {
                return false;
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public boolean m6647a(int i, int i2, Team team) {
        if (this.f840E && team.f1336M != null && m6608c(i, i2) && team.f1336M[i][i2] >= 5) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public void m6652a(float f, float f2) {
        this.f800T = (int) (f * this.f788r);
        this.f801U = (int) (f2 * this.f789s);
    }

    /* renamed from: a */
    public void m6648a(int i, int i2) {
        this.f800T = i * this.f784n;
        this.f801U = i2 * this.f785o;
    }

    /* renamed from: b */
    public void m6614b(int i, int i2) {
        this.f800T = (i * this.f784n) + this.f786p;
        this.f801U = (i2 * this.f785o) + this.f787q;
    }

    /* renamed from: a */
    public PointF m6642a(Point point) {
        this.f845V.m7213a(point.f224a * this.f784n, point.f225b * this.f785o);
        return this.f845V;
    }

    /* renamed from: b */
    public void m6617b(float f, float f2) {
        m6652a(f, f2);
        m6648a(this.f800T, this.f801U);
    }

    /* renamed from: a */
    public float m6653a(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > m6589i()) {
            f = m6589i();
        }
        return f;
    }

    /* renamed from: b */
    public float m6618b(float f) {
        if (f < 0.0f) {
            f = 0.0f;
        }
        if (f > m6588j()) {
            f = m6588j();
        }
        return f;
    }

    /* renamed from: c */
    public final boolean m6608c(int i, int i2) {
        return i >= 0 && i < this.f791C && i2 >= 0 && i2 < this.f792D;
    }

    /* renamed from: c */
    public C0180g m6609c(float f, float f2) {
        int i = (int) (f * this.f788r);
        int i2 = (int) (f2 * this.f789s);
        if (i < 0 || i >= this.f791C || i2 < 0 || i2 >= this.f792D) {
            return null;
        }
        return this.f832u.m6560a(i, i2);
    }

    /* renamed from: d */
    public C0180g m6603d(int i, int i2) {
        if (!m6608c(i, i2)) {
            return null;
        }
        return this.f832u.m6560a(i, i2);
    }

    /* renamed from: e */
    public C0180g m6598e(int i, int i2) {
        if (!m6608c(i, i2) || this.f835y == null) {
            return null;
        }
        return this.f835y.m6560a(i, i2);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m6641a(RectF rectF) {
        if (GameEngine.m1233B()) {
            rectF.f234a *= this.f784n / 20;
            rectF.f236c *= this.f784n / 20;
            rectF.f235b *= this.f785o / 20;
            rectF.f237d *= this.f785o / 20;
        }
    }

    public C0173b() {
        this.f784n = 20;
        this.f785o = 20;
        if (GameEngine.m1233B()) {
            this.f784n = 60;
            this.f785o = 60;
        }
        this.f786p = this.f784n / 2;
        this.f787q = this.f785o / 2;
        this.f788r = 1.0f / this.f784n;
        this.f789s = 1.0f / this.f785o;
        this.f806ab = new C0930ag();
        this.f806ab.m7267a(100, 255, 0, 0);
        this.f806ab.m7243b(16.0f);
        this.f807ac = new C0930ag();
        this.f807ac.m7260a(Paint.Style.STROKE);
        this.f807ac.m7270a(1.0f);
        this.f807ac.m7267a(255, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 0);
        this.f808ad = new C0930ag();
        this.f808ad.m7260a(Paint.Style.STROKE);
        this.f808ad.m7270a(1.0f);
        this.f808ad.m7267a(100, 0, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 0);
        this.f809ae = new C0930ag();
        this.f809ae.m7260a(Paint.Style.STROKE);
        this.f809ae.m7270a(1.0f);
        this.f809ae.m7267a(255, 175, 0, 0);
        this.f810af = new C0930ag();
        this.f810af.m7267a(155, 175, 0, 0);
        this.f811ag = new C0930ag();
        this.f811ag.m7257a(new PorterDuffXfermode(PorterDuff.Mode.CLEAR));
    }

    /* renamed from: a */
    public static void m6628a(String str, C0859ar c0859ar) {
        InputStream m6613b = m6613b(str);
        if (m6613b == null) {
            throw new IOException("writeMapStream: Could not find map:" + str);
        }
        int m6630a = (int) m6630a(str);
        if (m6630a == -1) {
            new IOException("writeMapStream: Failed to get map size");
        }
        if (m6630a == 0) {
            new IOException("writeMapStream: Got empty map size");
        }
        GameEngine.PrintLog("Sending map stream of size: " + m6630a);
        c0859ar.m1565a(m6613b, m6630a);
    }

    /* renamed from: a */
    public static long m6630a(String str) {
        String str2 = VariableScope.nullOrMissingString + str;
        String m2447e = C0750a.m2447e(str2);
        AbstractC1076af m645a = C1075ae.m645a(m2447e);
        if (m645a != null && !m2447e.endsWith(".rwmod")) {
            long mo638a = m645a.mo638a(m2447e, false);
            if (mo638a == -1) {
            }
            return mo638a;
        } else if (C0750a.m2451c(str2)) {
            try {
                return GameEngine.getInstance().f6221am.mo7347d().m7332b(m2447e).getLength();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else {
            return new File(m2447e).length();
        }
    }

    /* renamed from: b */
    public static InputStream m6613b(String str) {
        InputStream m6602d;
        InputStream m6602d2 = m6602d(str);
        if (m6602d2 == null && (m6602d = m6602d(str.replace(".tmx", VariableScope.nullOrMissingString) + "_moved")) != null) {
            String trim = CommonUtils.m2343a(m6602d).trim();
            GameEngine.PrintLog("Found moved map at:" + trim);
            m6602d2 = m6602d(trim);
        }
        return m6602d2;
    }

    /* renamed from: c */
    public static String m6607c(String str) {
        if (str == null) {
            return null;
        }
        return C0750a.m2447e(str);
    }

    /* renamed from: d */
    public static InputStream m6602d(String str) {
        String m6607c = m6607c(VariableScope.nullOrMissingString + str);
        GameEngine.PrintLog("Mapfile: " + m6607c);
        return C0750a.m2441j(m6607c);
    }

    /* renamed from: a */
    public void m6624a(Document document, OutputStream outputStream) {
        Transformer newTransformer = TransformerFactory.newInstance().newTransformer();
        newTransformer.setOutputProperty("indent", "yes");
        newTransformer.transform(new DOMSource(document), new StreamResult(outputStream));
    }

    /* renamed from: a */
    public void m6632a(InputStream inputStream, OutputStream outputStream) {
        float f;
        DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
        newInstance.setValidating(false);
        DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
        newDocumentBuilder.setEntityResolver(new C01741());
        Document parse = newDocumentBuilder.parse(inputStream);
        Element documentElement = parse.getDocumentElement();
        String attribute = documentElement.getAttribute("orientation");
        if (!attribute.equals("orthogonal")) {
            throw new C0179f("Only orthogonal maps are supported, found: " + attribute);
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
        Iterator it = Unit.m5870bF().iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if ((unit instanceof Unit) && (!(unit instanceof Tree) || !((Tree) unit).f1598bL)) {
                if (!unit.isDead && !unit.m5755u()) {
                    C0399m m5778dl = unit.m5778dl();
                    if (unit.f1651cM != null && m5778dl != null) {
                        if (!m5778dl.f2480D) {
                        }
                    } else {
                        Element createElement2 = parse.createElement("object");
                        int i4 = 20;
                        if (20 < unit.radius) {
                            i4 = (int) unit.radius;
                        }
                        createElement2.setAttribute("name", unit.getUnitType().mo5706i() + " (t:" + unit.team.f1305k + ")");
                        createElement2.setAttribute("x", VariableScope.nullOrMissingString + (unit.f6951ek - (i4 / 2)));
                        createElement2.setAttribute("y", VariableScope.nullOrMissingString + (unit.f6952el - (i4 / 2)));
                        createElement2.setAttribute("width", VariableScope.nullOrMissingString + i4);
                        createElement2.setAttribute("height", VariableScope.nullOrMissingString + i4);
                        if (unit.m5867bI()) {
                            f = unit.direction;
                        } else {
                            f = unit.direction + 90.0f;
                        }
                        createElement2.setAttribute("rotation", VariableScope.nullOrMissingString + f);
                        Integer m6636a = m6636a(unit.getUnitType());
                        if (m6636a != null) {
                            createElement2.setAttribute("gid", VariableScope.nullOrMissingString + m6636a);
                        }
                        Element createElement3 = parse.createElement("properties");
                        Element createElement4 = parse.createElement("property");
                        createElement4.setAttribute("name", "unit");
                        createElement4.setAttribute("value", unit.getUnitType().mo5706i());
                        createElement3.appendChild(createElement4);
                        Element createElement5 = parse.createElement("property");
                        createElement5.setAttribute("name", "team");
                        createElement5.setAttribute("value", VariableScope.nullOrMissingString + unit.team.f1305k);
                        createElement3.appendChild(createElement5);
                        createElement2.appendChild(createElement3);
                        createElement.appendChild(createElement2);
                    }
                }
            }
        }
        documentElement.appendChild(createElement);
        m6624a(parse, outputStream);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.b.b$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/b$1.class */
    public class C01741 implements EntityResolver {
        C01741() {
        }

        public InputSource resolveEntity(String str, String str2) {
            return new InputSource(new ByteArrayInputStream(new byte[0]));
        }
    }

    /* renamed from: a */
    public boolean m6627a(String str, String str2) {
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            m6612b(str, str2);
            gameEngine.f6111bS.f5107e.m1952a(null, "Map exported.");
            return true;
        } catch (C0179f e) {
            gameEngine.m1137c("Error exporting map", "Failed to export map. error: " + e.getMessage());
            return false;
        } catch (IOException e2) {
            e2.printStackTrace();
            gameEngine.m1137c("Error exporting map", "Failed to export map. IO error: " + e2.getMessage());
            return false;
        } catch (NoClassDefFoundError e3) {
            e3.printStackTrace();
            gameEngine.m1137c("Error exporting map", "Failed to export map. Class not found: " + e3.getMessage());
            return false;
        }
    }

    /* renamed from: b */
    public void m6612b(String str, String str2) {
        GameEngine.PrintLog(" --- Saving map:" + str + " to: " + str2);
        InputStream m6613b = m6613b(str);
        if (m6613b == null) {
            throw new IOException("Could not find orginal map: " + str);
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(m6613b);
        String m2447e = C0750a.m2447e(str2);
        File parentFile = new File(m2447e).getParentFile();
        if (!C0750a.m2443h(parentFile.getAbsolutePath())) {
            C0750a.m2440k(parentFile.getAbsolutePath());
        }
        if (!C0750a.m2445f(parentFile.getAbsolutePath())) {
            GameEngine.m1145b("Save Map: Could not create parent directory");
        }
        try {
            OutputStream m2454b = C0750a.m2454b(m2447e, false);
            if (m2454b == null) {
                throw new IOException("Failed to get save target:" + m2447e);
            }
            try {
                m6632a(bufferedInputStream, m2454b);
                try {
                    m2454b.close();
                    bufferedInputStream.close();
                    m6613b.close();
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
            throw new IOException("Failed to open save target:" + m2447e);
        }
    }

    /* renamed from: a */
    public void m6625a(String str, boolean z) {
        GameEngine.PrintLog(" --- Loading map ---");
        InputStream m6613b = m6613b(str);
        if (m6613b == null) {
            throw new C0179f("Could not find map: " + C0750a.m2449d(m6607c(str)));
        }
        BufferedInputStream bufferedInputStream = new BufferedInputStream(m6613b);
        m6631a(bufferedInputStream, z);
        try {
            bufferedInputStream.close();
            m6613b.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    /* renamed from: e */
    public C0183j m6597e(String str) {
        C0183j c0183j = null;
        Iterator it = this.f831t.iterator();
        while (it.hasNext()) {
            C0183j c0183j2 = (C0183j) it.next();
            if (str.equals(c0183j2.f949a)) {
                c0183j = c0183j2;
            }
        }
        if (c0183j == null) {
            int i = 1;
            if (this.f831t.size() > 0) {
                C0183j c0183j3 = (C0183j) this.f831t.get(this.f831t.size() - 1);
                i = c0183j3.f960l + 100;
                c0183j3.m6521c(i);
            }
            C0183j c0183j4 = new C0183j(this, str, i + 1);
            this.f831t.add(c0183j4);
            c0183j = c0183j4;
        }
        if (c0183j.f950b == null) {
            c0183j.m6522c();
        }
        return c0183j;
    }

    /* renamed from: a */
    public C0180g m6629a(String str, int i, int i2) {
        C0183j m6597e = m6597e(str);
        if (this.f812ah == null) {
            this.f812ah = new HashMap();
        }
        int m6532a = m6597e.f960l + m6597e.m6532a(i, i2);
        C0180g c0180g = (C0180g) this.f812ah.get(Integer.valueOf(m6532a));
        if (c0180g != null) {
            return c0180g;
        }
        C0180g m6551a = C0180g.m6551a(this, this.f832u, m6597e, m6532a - m6597e.f960l, (short) 0, (short) 0, true);
        this.f812ah.put(Integer.valueOf(m6532a), m6551a);
        return m6551a;
    }

    /* renamed from: a */
    public void m6631a(InputStream inputStream, boolean z) {
        int m6541a;
        NodeList elementsByTagName;
        this.f837A.clear();
        f782l.m6538b();
        f783m.m6538b();
        try {
            GameEngine.PrintLog("---- Loading map data ----");
            DocumentBuilderFactory newInstance = DocumentBuilderFactory.newInstance();
            newInstance.setValidating(false);
            DocumentBuilder newDocumentBuilder = newInstance.newDocumentBuilder();
            newDocumentBuilder.setEntityResolver(new C01752());
            Element documentElement = newDocumentBuilder.parse(inputStream).getDocumentElement();
            String attribute = documentElement.getAttribute("orientation");
            if (!attribute.equals("orthogonal")) {
                throw new C0179f("Only orthogonal maps are supported, found: " + attribute);
            }
            int parseInt = Integer.parseInt(documentElement.getAttribute("width"));
            int parseInt2 = Integer.parseInt(documentElement.getAttribute("height"));
            this.f791C = parseInt;
            this.f792D = parseInt2;
            GameEngine.PrintLog("Map size: " + this.f791C + ", " + this.f792D);
            this.f816ar = 150.0f;
            if (this.f840E) {
                GameEngine.PrintLog("Setting up team fog..");
                for (int i = 0; i < Team.f1364c; i++) {
                    Team m6317k = Team.m6317k(i);
                    if (m6317k != null) {
                        m6317k.f1334K = this.f791C;
                        m6317k.f1335L = this.f792D;
                        m6317k.f1336M = new byte[this.f791C][this.f792D];
                        for (int i2 = 0; i2 < this.f791C; i2++) {
                            for (int i3 = 0; i3 < this.f792D; i3++) {
                                m6317k.f1336M[i2][i3] = 10;
                            }
                        }
                    }
                }
            } else {
                GameEngine.PrintLog("No team fog on this map..");
                for (int i4 = 0; i4 < Team.f1364c; i4++) {
                    Team m6317k2 = Team.m6317k(i4);
                    if (m6317k2 != null) {
                        m6317k2.f1336M = null;
                    }
                }
            }
            Element element = (Element) documentElement.getElementsByTagName("properties").item(0);
            if (element != null && (elementsByTagName = element.getElementsByTagName("property")) != null) {
                Properties properties = new Properties();
                for (int i5 = 0; i5 < elementsByTagName.getLength(); i5++) {
                    Element element2 = (Element) elementsByTagName.item(i5);
                    properties.setProperty(element2.getAttribute("name"), element2.getAttribute("value"));
                }
            }
            C0183j c0183j = null;
            NodeList elementsByTagName2 = documentElement.getElementsByTagName("tileset");
            for (short s = 0; s < elementsByTagName2.getLength(); s = (short) (s + 1)) {
                C0183j c0183j2 = new C0183j(this, (Element) elementsByTagName2.item(s));
                c0183j2.f962n = s;
                if (c0183j != null) {
                    c0183j.m6521c(c0183j2.f960l - 1);
                }
                c0183j = c0183j2;
                this.f831t.add(c0183j2);
            }
            NodeList elementsByTagName3 = documentElement.getElementsByTagName("layer");
            for (int i6 = 0; i6 < elementsByTagName3.getLength(); i6++) {
                Element element3 = (Element) elementsByTagName3.item(i6);
                String attribute2 = element3.getAttribute("name");
                if (!"set".equalsIgnoreCase(attribute2) && !"set-disabled".equalsIgnoreCase(attribute2)) {
                    C0178e c0178e = new C0178e(this, element3);
                    c0178e.f899j = i6;
                    this.f836z.add(c0178e);
                }
            }
            Iterator it = this.f836z.iterator();
            while (it.hasNext()) {
                C0178e c0178e2 = (C0178e) it.next();
                if (c0178e2.f907r) {
                    this.f832u = c0178e2;
                }
                if (c0178e2.f900k.equalsIgnoreCase("grounddetails")) {
                    this.f833v = c0178e2;
                }
                if (c0178e2.f900k.equalsIgnoreCase("grounddetails2")) {
                    this.f834w = c0178e2;
                }
                if (c0178e2.f900k.equalsIgnoreCase("Items") || c0178e2.f900k.equalsIgnoreCase("Objects")) {
                    this.f835y = c0178e2;
                }
                if (c0178e2.f900k.equalsIgnoreCase("PathingOverride")) {
                    this.f790x = c0178e2;
                }
            }
            if (this.f832u == null) {
                throw new C0179f("'Ground' layer was not found in map, this layer is required");
            }
            if (this.f839B == null || this.f839B.length == 0) {
                throw new C0179f("Invalid map, no tiles have been set");
            }
            if (!GameEngine.m1233B() && !GameEngine.m1232C()) {
                for (int i7 = 0; i7 < this.f791C; i7++) {
                    for (int i8 = 0; i8 < this.f792D; i8++) {
                        if (this.f832u.m6560a(i7, i8) == null) {
                            throw new C0179f("An empty tile on the Ground layer at " + i7 + "," + i8 + " all tiles must be filled");
                        }
                    }
                }
            }
            if (this.f835y == null) {
                throw new C0179f("'Items' layer was not found in map, this layer is required");
            }
            NodeList elementsByTagName4 = documentElement.getElementsByTagName("objectgroup");
            for (int i9 = 0; i9 < elementsByTagName4.getLength(); i9++) {
                C0182i c0182i = new C0182i((Element) elementsByTagName4.item(i9), this);
                c0182i.f943a = i9;
                this.f844P.add(c0182i);
            }
            C0183j.m6534a();
            Iterator it2 = this.f831t.iterator();
            while (it2.hasNext()) {
                C0183j c0183j3 = (C0183j) it2.next();
                if (c0183j3.f965q) {
                    c0183j3.m6522c();
                }
            }
            C0183j.m6525b();
            int i10 = 0;
            while (i10 <= 1) {
                Iterator it3 = this.f836z.iterator();
                while (it3.hasNext()) {
                    C0178e c0178e3 = (C0178e) it3.next();
                    if ((c0178e3 == this.f832u) == (i10 == 0)) {
                        c0178e3.f912w = false;
                        if (c0178e3.f908s) {
                            for (int i11 = 0; i11 < this.f791C; i11++) {
                                for (int i12 = 0; i12 < this.f792D; i12++) {
                                    C0180g m6560a = c0178e3.m6560a(i11, i12);
                                    if (m6560a != null && m6560a.f915c == -2) {
                                        m6560a.f915c = f782l.m6541a(m6560a.f913a, m6560a.f914b);
                                        if (m6560a.f915c >= 0 && (m6541a = f783m.m6541a(m6560a.f913a, m6560a.f914b)) != m6560a.f915c) {
                                            throw new RuntimeException("Meta index mismatch: " + m6541a + " vs " + m6560a.f915c);
                                        }
                                        if (m6560a.f915c < 0) {
                                            c0178e3.f912w = true;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                i10++;
            }
            f782l.m6536c();
            f783m.m6536c();
            this.f797Q = m6593f("triggers");
            C0172a c0172a = null;
            if (this.f797Q != null) {
                c0172a = this.f797Q.m6535a("map_info");
            }
            boolean z2 = false;
            boolean z3 = false;
            GameEngine gameEngine = GameEngine.getInstance();
            gameEngine.f6123ce = null;
            String str = null;
            String str2 = null;
            if (c0172a != null) {
                String m6657b = c0172a.m6657b("type");
                str2 = c0172a.m6657b("fog");
                if ("mission".equalsIgnoreCase(m6657b) || "survival".equalsIgnoreCase(m6657b) || "challenge".equalsIgnoreCase(m6657b) || "skirmish".equalsIgnoreCase(m6657b)) {
                    str = m6657b;
                } else {
                    GameEngine.m1145b("Unknown map type:" + m6657b);
                }
            } else {
                GameEngine.m1145b("Map type not found on mapInfo");
            }
            if (str == null) {
                GameEngine.m1145b("Defaulting to skirmish map type");
                str = "skirmish";
            } else {
                GameEngine.m1145b("Map type: " + str);
            }
            gameEngine.f6123ce = new C1049f();
            gameEngine.f6123ce.m821a(z);
            if (str2 != null && !VariableScope.nullOrMissingString.equals(str2)) {
                if (!str2.equalsIgnoreCase("none")) {
                    z2 = true;
                    if (str2.equalsIgnoreCase("los")) {
                        z3 = true;
                    } else if (!str2.equalsIgnoreCase("map")) {
                        GameEngine.PrintLog("Unknown map fog type: " + str2);
                    }
                }
            } else if (GameEngine.m1157au() && !gameEngine.m1222M()) {
                z2 = true;
                if (str != null && str.equalsIgnoreCase("skirmish")) {
                    z3 = true;
                }
            }
            if (!z2) {
                this.f840E = false;
            }
            if (z2 && z3) {
                this.f841F = true;
            }
            this.f802W = true;
        } catch (IOException e) {
            throw new C0179f("Failed to parse map", e);
        } catch (ParserConfigurationException e2) {
            throw new RuntimeException("Failed to parse map", e2);
        } catch (SAXException e3) {
            GameEngine.PrintLog(" --- SAXException: Failed to parse map - " + e3.getMessage() + " ---");
            try {
                GameEngine.PrintLog("available:" + inputStream.available());
                inputStream.reset();
                GameEngine.PrintLog("after reset:" + inputStream.available());
            } catch (IOException e4) {
                GameEngine.PrintLog("-- error writing debug info --");
                e4.printStackTrace();
            }
            throw new C0179f("Failed to parse map - " + e3.getMessage(), e3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.game.b.b$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/b$2.class */
    public class C01752 implements EntityResolver {
        C01752() {
        }

        public InputSource resolveEntity(String str, String str2) {
            return new InputSource(new ByteArrayInputStream(new byte[0]));
        }
    }

    /* renamed from: e */
    public void m6600e() {
    }

    /* renamed from: a */
    public void m6638a(C0195l c0195l) {
        if (GameEngine.f6199aU && !GameEngine.f6201aW) {
            return;
        }
        f829al.m6578a(c0195l);
    }

    /* renamed from: a */
    public void m6635a(AbstractC0623y abstractC0623y, int i, int i2, int i3, int i4, int i5, int i6, InterfaceC1027y interfaceC1027y, boolean z, int i7) {
        GameEngine gameEngine = GameEngine.getInstance();
        C0173b c0173b = gameEngine.f6104bL;
        InterfaceC0303as mo7517i = gameEngine.f6111bS.f5120W.mo7517i();
        EnumC0246ao mo5700o = mo7517i.mo5700o();
        for (int i8 = i; i8 <= i3; i8++) {
            for (int i9 = i2; i9 <= i4; i9++) {
                boolean m4517a = AbstractC0488d.m4517a(abstractC0623y, mo7517i, mo5700o, i8, i9, i7);
                int i10 = (i8 * c0173b.f784n) - i5;
                int i11 = (i9 * c0173b.f785o) - i6;
                this.f850an.m7208a(i10, i11, (i10 + c0173b.f784n) - 1, (i11 + c0173b.f785o) - 1);
                if (z) {
                    if (m4517a) {
                        interfaceC1027y.mo892b(this.f850an, c0173b.f808ad);
                    } else {
                        interfaceC1027y.mo892b(this.f850an, c0173b.f810af);
                        interfaceC1027y.mo892b(this.f850an, c0173b.f809ae);
                    }
                } else if (m4517a) {
                    interfaceC1027y.mo892b(this.f850an, c0173b.f807ac);
                } else {
                    interfaceC1027y.mo892b(this.f850an, c0173b.f809ae);
                }
            }
        }
    }

    /* renamed from: f */
    public static void m6596f() {
        f829al.m6569d();
    }

    /* renamed from: c */
    public void m6610c(float f) {
        f829al.m6584a(f);
    }

    /* renamed from: g */
    public void m6592g() {
        f829al.m6573c();
    }

    /* renamed from: d */
    public void m6604d(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        boolean m1159as = GameEngine.m1159as();
        if (m1159as) {
            gameEngine.graphics.mo900a(f821e);
        }
        m6610c(f);
        if (m1159as) {
            gameEngine.graphics.mo887b(f821e);
        }
        if (this.f803X) {
            new Rect();
            Rect rect = new Rect();
            int i = this.f804Y * this.f784n;
            int i2 = this.f805Z * this.f785o;
            rect.m7208a(i, i2, i + this.f784n, i2 + this.f785o);
            rect.m7209a(-GameEngine.getInstance().f6136ct, -GameEngine.getInstance().f6137cu);
        }
    }

    /* renamed from: e */
    public void m6599e(float f) {
        GameEngine.getInstance();
        m6595f(f);
    }

    /* renamed from: h */
    public void m6590h() {
        Iterator it = this.f831t.iterator();
        while (it.hasNext()) {
            ((C0183j) it.next()).m6520d();
        }
        this.f831t.clear();
        Iterator it2 = this.f836z.iterator();
        while (it2.hasNext()) {
            ((C0178e) it2.next()).m6553b();
        }
        this.f836z.clear();
        this.f844P.clear();
        this.f797Q = null;
        f829al.m6573c();
    }

    /* renamed from: a */
    public C0183j m6649a(int i) {
        for (int i2 = 0; i2 < this.f831t.size(); i2++) {
            C0183j c0183j = (C0183j) this.f831t.get(i2);
            if (c0183j.m6519d(i)) {
                return c0183j;
            }
        }
        return null;
    }

    /* renamed from: a */
    public Integer m6636a(InterfaceC0303as interfaceC0303as) {
        String mo5706i = interfaceC0303as.mo5706i();
        Integer m6606c = m6606c("unit", mo5706i);
        if (m6606c == null) {
            m6606c = m6606c("customUnit", mo5706i);
        }
        return m6606c;
    }

    /* renamed from: c */
    public Integer m6606c(String str, String str2) {
        for (int i = 0; i < this.f831t.size(); i++) {
            Integer m6523b = ((C0183j) this.f831t.get(i)).m6523b(str, str2);
            if (m6523b != null) {
                return m6523b;
            }
        }
        return null;
    }

    /* renamed from: f */
    public C0182i m6593f(String str) {
        Iterator it = this.f844P.iterator();
        while (it.hasNext()) {
            C0182i c0182i = (C0182i) it.next();
            if (str.equalsIgnoreCase(c0182i.f944b)) {
                return c0182i;
            }
        }
        return null;
    }

    /* renamed from: i */
    public float m6589i() {
        return this.f791C * this.f784n;
    }

    /* renamed from: j */
    public float m6588j() {
        return this.f792D * this.f785o;
    }

    /* renamed from: a */
    public void m6651a(float f, float f2, int i, Team team, boolean z) {
        C1049f c1049f;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f840E) {
            long j = 0;
            if (f817a) {
                j = C0727bl.m2612a();
            }
            boolean z2 = true;
            boolean z3 = team.f1326D;
            if (!gameEngine.m1154ax() && (c1049f = gameEngine.f6123ce) != null && !c1049f.m831a() && !c1049f.m820b()) {
                z2 = false;
            }
            if (!z2) {
                m6616b(f, f2, i, team, z);
            } else {
                for (int i2 = 0; i2 < Team.f1364c; i2++) {
                    Team m6317k = Team.m6317k(i2);
                    if (m6317k != null && (m6317k == team || (!m6317k.f1316v && (m6317k.m6342d(team) || z3)))) {
                        m6616b(f, f2, i, m6317k, z);
                    }
                }
            }
            if (f817a) {
                this.f814ap += C0727bl.m2612a() - j;
            }
        }
    }

    /* renamed from: a */
    public byte m6646a(int i, int i2, byte[][] bArr, byte b) {
        byte b2 = 0;
        int i3 = this.f791C;
        int i4 = this.f792D;
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

    /* renamed from: k */
    public void m6587k() {
        m6586l();
        for (int i = 0; i < this.f791C; i++) {
            for (int i2 = 0; i2 < this.f792D; i2++) {
                this.f795M[i][i2] = 0;
                this.f796N[i][i2] = 0;
            }
        }
    }

    /* renamed from: f */
    public void m6594f(int i, int i2) {
        this.f795M[i][i2] = 0;
        this.f796N[i][i2] = 0;
    }

    /* renamed from: g */
    public void m6591g(int i, int i2) {
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
        if (i5 > this.f791C - 1) {
            i5 = this.f791C - 1;
        }
        if (i6 > this.f792D - 1) {
            i6 = this.f792D - 1;
        }
        for (int i7 = i3; i7 <= i5; i7++) {
            for (int i8 = i4; i8 <= i6; i8++) {
                if (this.f795M[i7][i8] != 0) {
                    this.f795M[i7][i8] = Byte.MAX_VALUE;
                }
                if (this.f796N[i7][i8] != 0) {
                    this.f796N[i7][i8] = Byte.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: l */
    public void m6586l() {
        boolean z = false;
        if (this.f795M == null) {
            z = true;
        } else if (this.f795M.length != this.f791C || this.f795M[0].length != this.f792D) {
            GameEngine.PrintLog("smoothFog_cache: Size mismatch");
            z = true;
        }
        if (z) {
            GameEngine.PrintLog("Building smoothFog_cache");
            this.f795M = new byte[this.f791C][this.f792D];
            this.f796N = new byte[this.f791C][this.f792D];
            for (int i = 0; i < this.f791C; i++) {
                for (int i2 = 0; i2 < this.f792D; i2++) {
                    this.f795M[i][i2] = Byte.MAX_VALUE;
                    this.f796N[i][i2] = Byte.MAX_VALUE;
                }
            }
        }
    }

    /* renamed from: b */
    public void m6616b(float f, float f2, int i, Team team, boolean z) {
        byte b;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f840E && team.f1336M != null) {
            m6586l();
            float f3 = (i - 5) * (i - 5);
            float f4 = (i - 3) * (i - 3);
            float f5 = i * i;
            float f6 = (1.0f / (f5 - f4)) * 10.0f;
            m6652a(f, f2);
            int i2 = this.f800T;
            int i3 = this.f801U;
            float f7 = f * this.f788r;
            float f8 = f2 * this.f789s;
            byte[][] bArr = team.f1336M;
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
            if (i7 > this.f791C - 1) {
                i7 = this.f791C - 1;
            }
            if (i8 > this.f792D - 1) {
                i8 = this.f792D - 1;
            }
            C0176c c0176c = f829al;
            boolean z2 = false;
            boolean m6311q = team.m6311q();
            for (int i9 = i5; i9 <= i7; i9++) {
                for (int i10 = i6; i10 <= i8; i10++) {
                    byte b2 = bArr[i9][i10];
                    if (b2 != 0) {
                        float m2366a = CommonUtils.m2366a(f7, f8, i9, i10);
                        if (m2366a <= f4) {
                            if (b2 > 0) {
                                bArr[i9][i10] = 0;
                                if (m6311q) {
                                    c0176c.m6579a(i9, i10, true);
                                    z2 = true;
                                    if (m2366a <= f3 && z) {
                                        m6594f(i9, i10);
                                    } else {
                                        m6591g(i9, i10);
                                    }
                                }
                            }
                        } else if (m2366a <= f5 && b2 > (b = (byte) ((m2366a - f4) * f6))) {
                            bArr[i9][i10] = b;
                            if (m6311q) {
                                c0176c.m6579a(i9, i10, true);
                                z2 = true;
                                m6591g(i9, i10);
                            }
                        }
                    }
                }
            }
            if (z2) {
                gameEngine.f6115bW.f5320O = true;
            }
        }
    }

    /* renamed from: f */
    public void m6595f(float f) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (f817a) {
            this.f815aq += f;
            if (this.f815aq > 60.0f) {
                this.f815aq = 0.0f;
                if (this.f814ap > 0) {
                    GameEngine.PrintLog("seeThoughFogOfWarTimes: " + C0727bl.m2604b(this.f814ap));
                    this.f814ap = 0L;
                }
                if (this.f814ap < 0) {
                    GameEngine.PrintLog("seeThoughFogOfWarTimes negative: " + C0727bl.m2604b(this.f814ap));
                    this.f814ap = 0L;
                }
            }
        }
        if (this.f840E && this.f841F) {
            m6586l();
            this.f816ar += f;
            if (this.f816ar > 260.0f) {
                this.f816ar = 0.0f;
                AbstractC1120w[] m539a = Unit.f6956en.m539a();
                int size = AbstractC1120w.f6956en.size();
                boolean z = false;
                for (int i = 0; i < Team.f1364c; i++) {
                    Team m6317k = Team.m6317k(i);
                    if (m6317k != null && !m6317k.f1329F) {
                        z = true;
                        for (int i2 = 0; i2 < size; i2++) {
                            AbstractC1120w abstractC1120w = m539a[i2];
                            if (abstractC1120w instanceof AbstractC0623y) {
                                AbstractC0623y abstractC0623y = (AbstractC0623y) abstractC1120w;
                                if (abstractC0623y.m5867bI()) {
                                    abstractC0623y.m5764g(m6317k);
                                }
                            }
                        }
                        if (m6317k.f1336M == null) {
                            GameEngine.m1145b("fogOfWar_map==null for:" + i);
                        }
                        boolean z2 = false;
                        boolean m6311q = m6317k.m6311q();
                        byte[][] bArr = m6317k.f1336M;
                        byte[][] bArr2 = this.f796N;
                        for (int i3 = 0; i3 < this.f791C; i3++) {
                            for (int i4 = 0; i4 < this.f792D; i4++) {
                                if (bArr[i3][i4] < 5) {
                                    bArr[i3][i4] = 5;
                                    if (m6311q) {
                                        f829al.m6579a(i3, i4, true);
                                        z2 = true;
                                        bArr2[i3][i4] = Byte.MAX_VALUE;
                                    }
                                }
                            }
                        }
                        if (z2) {
                            gameEngine.f6115bW.f5320O = true;
                        }
                    }
                }
                for (int i5 = 0; i5 < size; i5++) {
                    AbstractC1120w abstractC1120w2 = m539a[i5];
                    if (abstractC1120w2 instanceof AbstractC0623y) {
                        AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC1120w2;
                        if (!abstractC0623y2.isDead) {
                            abstractC0623y2.mo3073c(false);
                        }
                    }
                }
                if (z) {
                    for (int i6 = 0; i6 < size; i6++) {
                        AbstractC1120w abstractC1120w3 = m539a[i6];
                        if (abstractC1120w3 instanceof AbstractC0623y) {
                            AbstractC0623y abstractC0623y3 = (AbstractC0623y) abstractC1120w3;
                            if (abstractC0623y3.m5867bI()) {
                                abstractC0623y3.m5825cV();
                            }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public void m6634a(C0859ar c0859ar) {
        c0859ar.mo1482a(false);
    }

    /* renamed from: a */
    public void m6633a(C0876k c0876k) {
        if (c0876k.m1455e()) {
            int m1454f = c0876k.m1454f();
            int m1454f2 = c0876k.m1454f();
            for (int i = 0; i < m1454f; i++) {
                for (int i2 = 0; i2 < m1454f2; i2++) {
                    c0876k.m1457d();
                }
            }
        }
    }

    /* renamed from: a */
    private InputStream m6626a(String str, String str2, int i) {
        String[] split = str2.split("/");
        if (split.length >= i) {
            String str3 = VariableScope.nullOrMissingString;
            boolean z = true;
            for (int length = split.length - i; length < split.length; length++) {
                if (!z) {
                    str3 = str3 + "/";
                }
                z = false;
                str3 = str3 + split[length];
            }
            return C0750a.m2442i(str + str3);
        }
        return null;
    }

    /* renamed from: d */
    public InputStream m6601d(String str, String str2) {
        C1098j m2442i = C0750a.m2442i(str + str2);
        if (m2442i == null) {
            m2442i = m6626a(str, str2, 3);
        }
        if (m2442i == null) {
            m2442i = m6626a(str, str2, 2);
        }
        if (m2442i == null) {
            m2442i = m6626a(str, str2, 1);
        }
        if (m2442i == null) {
            throw new IOException("File could not be found:" + str + str2);
        }
        return m2442i;
    }

    /* renamed from: a */
    public boolean m6637a(Team team, int i, int i2) {
        if (!this.f842G && this.f840E && team.f1336M != null && m6608c(i, i2) && team.f1336M[i][i2] == 10) {
            return false;
        }
        return true;
    }
}
