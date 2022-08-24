package com.corrodinggames.rts.game.p012b;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.io.BufferedInputStream;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Properties;
import java.util.zip.GZIPInputStream;
import java.util.zip.InflaterInputStream;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

/* renamed from: com.corrodinggames.rts.game.b.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/b/e.class */
public class C0178e {

    /* renamed from: x */
    private static byte[] f889x = new byte[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];

    /* renamed from: a */
    static C0930ag f890a;

    /* renamed from: b */
    static C0930ag[] f891b;

    /* renamed from: c */
    static C0930ag f892c;

    /* renamed from: d */
    static C0930ag f893d;

    /* renamed from: e */
    static C0930ag f894e;

    /* renamed from: f */
    static C0930ag f895f;

    /* renamed from: g */
    static C0930ag f896g;

    /* renamed from: h */
    static C0930ag[] f897h;

    /* renamed from: i */
    public C0173b f898i;

    /* renamed from: j */
    public int f899j;

    /* renamed from: k */
    public String f900k;

    /* renamed from: l */
    public String f901l;

    /* renamed from: m */
    public boolean f902m;

    /* renamed from: n */
    public int f903n;

    /* renamed from: o */
    public int f904o;

    /* renamed from: p */
    public Properties f905p;

    /* renamed from: q */
    public short[] f906q;

    /* renamed from: r */
    public boolean f907r;

    /* renamed from: s */
    public boolean f908s;

    /* renamed from: t */
    final Rect f909t = new Rect();

    /* renamed from: u */
    final Rect f910u = new Rect();

    /* renamed from: v */
    final RectF f911v = new RectF();

    /* renamed from: w */
    public boolean f912w;

    static {
        for (int i = 0; i < 256; i++) {
            f889x[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f889x[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            f889x[i3] = (byte) ((26 + i3) - 97);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            f889x[i4] = (byte) ((52 + i4) - 48);
        }
        f889x[43] = 62;
        f889x[47] = 63;
        f890a = new C0930ag();
        f890a.m7242b(-16777216);
        f890a.m7260a(Paint.Style.FILL);
        f891b = new C0930ag[11];
        for (int i5 = 0; i5 <= 10; i5++) {
            f891b[i5] = new C0930ag();
            f891b[i5].m7242b(-16777216);
            f891b[i5].m7260a(Paint.Style.FILL);
            f891b[i5].m7237c(i5 * 25);
        }
        f892c = new C0930ag();
        f892c.m7242b(-16777216);
        f892c.m7260a(Paint.Style.FILL);
        f893d = new C0930ag();
        f893d.m1053a(false);
        f893d.m7231d(false);
        f893d.m7239b(false);
        f894e = new C0930ag();
        f894e.m1053a(true);
        f895f = new C0930ag();
        f895f.m1053a(false);
        f895f.m7231d(false);
        f895f.m7239b(false);
        f896g = new C0930ag();
        f896g.m1053a(true);
        f897h = new C0930ag[11];
        for (int i6 = 0; i6 <= 10; i6++) {
            C0930ag c0930ag = new C0930ag();
            c0930ag.m7264a(new LightingColorFilter(Color.m7283a(255 - (i6 * 25), 255 - (i6 * 25), 255 - (i6 * 25)), 0));
            f897h[i6] = c0930ag;
        }
    }

    /* renamed from: a */
    public final C0180g m6560a(int i, int i2) {
        if (this.f906q == null) {
            this.f906q = new short[this.f903n * this.f904o];
        }
        return this.f898i.m6623a(this.f906q[(i * this.f904o) + i2]);
    }

    /* renamed from: a */
    public short[] m6561a() {
        if (this.f906q == null) {
            this.f906q = new short[this.f903n * this.f904o];
        }
        return this.f906q;
    }

    /* renamed from: a */
    public void m6559a(int i, int i2, C0180g c0180g, boolean z) {
        if (this.f906q == null) {
            this.f906q = new short[this.f903n * this.f904o];
        }
        if (c0180g == null) {
            this.f906q[(i * this.f904o) + i2] = 0;
            return;
        }
        if (z) {
            c0180g = this.f898i.m6639a(c0180g, i, i2);
        }
        if (c0180g.f921i) {
            boolean z2 = false;
            Iterator it = this.f898i.f837A.iterator();
            while (it.hasNext()) {
                Point point = (Point) it.next();
                if (point.f224a == i && point.f225b == i2) {
                    GameEngine.PrintLog("resPools point:" + i + ", " + i2 + " already exists");
                    z2 = true;
                }
            }
            if (!z2) {
                this.f898i.f837A.add(new Point(i, i2));
            }
        }
        if (c0180g.f916d == -1) {
            c0180g.f916d = this.f898i.m6640a(c0180g);
        }
        this.f906q[(i * this.f904o) + i2] = c0180g.f916d;
    }

    /* renamed from: a */
    public void m6558a(InterfaceC1027y interfaceC1027y, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2, boolean z3) {
        C0930ag c0930ag;
        C0181h c0181h;
        C0930ag c0930ag2;
        GameEngine gameEngine = GameEngine.getInstance();
        C0173b c0173b = this.f898i;
        int i = (int) (f3 * c0173b.f788r);
        if (i < 0) {
            i = 0;
        }
        int i2 = (int) (f4 * c0173b.f789s);
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = (int) ((f3 + f5) * c0173b.f788r);
        if (i3 > this.f903n - 1) {
            i3 = this.f903n - 1;
        }
        int i4 = (int) ((f4 + f6) * c0173b.f789s);
        if (i4 > this.f904o - 1) {
            i4 = this.f904o - 1;
        }
        byte[][] bArr = gameEngine.f6093bs.f1336M;
        float f9 = f * f7;
        float f10 = f2 * f8;
        float f11 = c0173b.f784n * f7;
        float f12 = c0173b.f785o * f8;
        byte b = 15;
        if (!z2) {
            b = 10;
        }
        boolean z4 = c0173b.f842G;
        if (z4) {
            b = 15;
        }
        if (z && bArr == null) {
            z = false;
        }
        C0930ag c0930ag3 = f891b[5];
        C0930ag c0930ag4 = f890a;
        C0930ag c0930ag5 = f892c;
        c0930ag5.m7237c(255);
        if (z4) {
            c0930ag4 = f891b[7];
            c0930ag5.m7237c((int) ((1.0f - ((1.0f - (c0930ag3.m7228f() / 255.0f)) * (1.0f - (c0930ag4.m7228f() / 255.0f)))) * 255.0f));
        }
        boolean z5 = false;
        if (GameEngine.m1157au() && f7 < 1.0f && f8 < 1.0f) {
            z5 = true;
        }
        if (z3) {
        }
        if (!this.f907r) {
            c0930ag = f895f;
            if (z5) {
                c0930ag = f896g;
            }
        } else {
            c0930ag = f893d;
            if (z5) {
                c0930ag = f894e;
            }
        }
        C0930ag c0930ag6 = c0930ag;
        float f13 = 0.0f;
        boolean z6 = false;
        if (!GameEngine.m1157au()) {
            z6 = true;
        } else if (!z3) {
            if (f7 < 1.0f || f8 < 1.0f) {
                f13 = 0.5f * f7;
            }
        } else if (f7 < 1.0f || f8 >= 1.0f) {
        }
        if (f7 < 0.5f) {
            c0181h = C0173b.f783m;
        } else {
            c0181h = C0173b.f782l;
        }
        short[] m6561a = m6561a();
        C0180g[] c0180gArr = c0173b.f839B;
        RectF rectF = this.f911v;
        Rect rect = this.f910u;
        int i5 = this.f904o;
        boolean z7 = this.f907r;
        Rect rect2 = this.f909t;
        c0173b.m6586l();
        byte[][] bArr2 = c0173b.f795M;
        byte[][] bArr3 = c0173b.f796N;
        BitmapOrTexture bitmapOrTexture = C0173b.f793K;
        for (int i6 = i; i6 < i3 + 1; i6++) {
            int i7 = i2;
            while (i7 < i4 + 1) {
                C0180g c0180g = c0180gArr[m6561a[(i6 * i5) + i7]];
                if (c0180g != null) {
                    byte b2 = 0;
                    if (z) {
                        b2 = bArr[i6][i7];
                    }
                    if (b2 != b) {
                        float f14 = (i6 * f11) + 0.0f;
                        float f15 = (i7 * f12) + 0.0f;
                        float f16 = ((i6 + 1) * f11) + f13;
                        float f17 = ((i7 + 1) * f12) + f13;
                        rectF.m7195a(f14 - f9, f15 - f10, f16 - f9, f17 - f10);
                        if (z5 && !z3) {
                            rectF.f235b = (int) rectF.f235b;
                            rectF.f234a = (int) rectF.f234a;
                        }
                        if (!z3) {
                            C0183j c0183j = c0180g.f913a;
                            if (!z6) {
                                if (c0180g.f915c >= 0) {
                                    interfaceC1027y.mo909a(c0181h.m6546a(c0180g.f915c), c0181h.m6537b(c0180g.f915c), rectF, c0930ag6);
                                } else {
                                    c0180g.m6549a(interfaceC1027y, rectF, f7, c0930ag6);
                                }
                            } else {
                                rect.m7208a((int) (f14 - f9), (int) (f15 - f10), (int) (f16 - f9), (int) (f17 - f10));
                                if (c0180g.f915c >= 0) {
                                    interfaceC1027y.mo889b(c0181h.m6546a(c0180g.f915c), c0181h.m6537b(c0180g.f915c), rect, c0930ag6);
                                } else {
                                    interfaceC1027y.mo910a(c0183j.f950b, c0183j.m6524b(c0180g.f914b), rect, c0930ag6);
                                }
                            }
                        }
                        if (z && z7 && z2 && (b2 != 0 || bArr3[i6][i7] != 0 || bArr2[i6][i7] != 0)) {
                            if (b2 >= 5) {
                                if (z3 && (b2 == 10 || bArr2[i6][i7] == 0)) {
                                    int i8 = i7 + 1;
                                    while (i8 < i4) {
                                        if (b2 != bArr[i6][i8] || (b2 != 10 && bArr2[i6][i8] != 0)) {
                                            break;
                                        }
                                        i8++;
                                    }
                                    int i9 = i8 - 1;
                                    if (i9 > i7) {
                                        rectF.f237d += (i9 - i7) * f12;
                                        i7 = i9;
                                    }
                                }
                                if (b2 == 10) {
                                    c0930ag2 = c0930ag5;
                                } else {
                                    c0930ag2 = c0930ag3;
                                }
                                rect.f230a = (int) rectF.f234a;
                                rect.f232c = (int) rectF.f236c;
                                rect.f231b = (int) rectF.f235b;
                                rect.f233d = (int) rectF.f237d;
                                interfaceC1027y.mo922a(rect, c0930ag2);
                            } else {
                                byte b3 = bArr3[i6][i7];
                                if (b3 == Byte.MAX_VALUE) {
                                    b3 = c0173b.m6646a(i6, i7, bArr, (byte) 5);
                                    bArr3[i6][i7] = b3;
                                }
                                if (b3 != 0) {
                                    int i10 = b3 + 128;
                                    if (bitmapOrTexture != null) {
                                        C0173b.m6645a(i10, rect2);
                                        rect.m7208a((int) (f14 - f9), (int) (f15 - f10), (int) (f16 - f9), (int) (f17 - f10));
                                        interfaceC1027y.mo889b(bitmapOrTexture, rect2, rect, c0930ag3);
                                    } else if (!c0173b.f830k[b3 + 128]) {
                                        GameEngine.PrintLog("SmoothFog, missing: " + ((int) b3));
                                        c0173b.f830k[b3 + 128] = true;
                                    }
                                }
                            }
                            if (b2 != 10) {
                                byte b4 = bArr2[i6][i7];
                                if (b4 == Byte.MAX_VALUE) {
                                    b4 = c0173b.m6646a(i6, i7, bArr, (byte) 10);
                                    bArr2[i6][i7] = b4;
                                }
                                if (b4 != 0) {
                                    int i11 = b4 + 128;
                                    if (bitmapOrTexture != null) {
                                        C0173b.m6645a(i11, rect2);
                                        rect.m7208a((int) (f14 - f9), (int) (f15 - f10), (int) (f16 - f9), (int) (f17 - f10));
                                        interfaceC1027y.mo889b(bitmapOrTexture, rect2, rect, c0930ag4);
                                    } else if (!c0173b.f830k[b4 + 128]) {
                                        GameEngine.PrintLog("SmoothFog, missing: " + ((int) b4));
                                        c0173b.f830k[b4 + 128] = true;
                                    }
                                }
                            }
                        }
                    }
                }
                i7++;
            }
        }
    }

    /* renamed from: b */
    public void m6553b() {
        this.f906q = null;
        this.f905p = null;
        this.f898i = null;
    }

    public C0178e(C0173b c0173b, String str, int i, int i2) {
        this.f898i = c0173b;
        m6556a(str);
        this.f903n = i;
        this.f904o = i2;
        m6561a();
    }

    /* renamed from: a */
    void m6556a(String str) {
        this.f900k = str;
        Log.m7106d("RustedWarfare", "MapLayer create: " + str);
        if (str != null) {
            this.f901l = str.toLowerCase(Locale.ENGLISH);
        }
        this.f902m = this.f901l.contains("items");
        this.f907r = this.f901l.equalsIgnoreCase("ground");
        if (this.f902m || this.f907r) {
            this.f908s = true;
        }
        if (str != null && str.equalsIgnoreCase("grounddetails")) {
            this.f908s = true;
        }
    }

    public C0178e(C0173b c0173b, Element element) {
        NodeList elementsByTagName;
        this.f898i = c0173b;
        m6556a(element.getAttribute("name"));
        this.f903n = Short.parseShort(element.getAttribute("width"));
        this.f904o = Short.parseShort(element.getAttribute("height"));
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (element2 != null && (elementsByTagName = element2.getElementsByTagName("property")) != null) {
            this.f905p = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element3 = (Element) elementsByTagName.item(i);
                this.f905p.setProperty(element3.getAttribute("name"), element3.getAttribute("value"));
            }
        }
        Element element4 = (Element) element.getElementsByTagName("data").item(0);
        if (element4 == null) {
            throw new C0179f("Map is missing <data> element");
        }
        try {
            InputStream m6555a = m6555a(element4.getFirstChild().getNodeValue(), element4.getAttribute("encoding"), element4.getAttribute("compression"));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(m6555a);
            m6557a(bufferedInputStream);
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (m6555a != null) {
                m6555a.close();
            }
        } catch (IOException e) {
            throw new C0179f("Unable to decompress base64 block", e);
        }
    }

    /* renamed from: a */
    void m6557a(InputStream inputStream) {
        C0173b c0173b = this.f898i;
        C0180g c0180g = null;
        int i = -1;
        boolean z = this.f908s;
        HashMap hashMap = new HashMap();
        short s = 0;
        while (true) {
            short s2 = s;
            if (s2 < this.f904o) {
                short s3 = 0;
                while (true) {
                    short s4 = s3;
                    if (s4 < this.f903n) {
                        int read = 0 | inputStream.read() | (inputStream.read() << 8) | (inputStream.read() << 16) | (inputStream.read() << 24);
                        boolean z2 = (read & Integer.MIN_VALUE) != 0;
                        boolean z3 = (read & 1073741824) != 0;
                        boolean z4 = (read & 536870912) != 0;
                        int i2 = read & 536870911;
                        if (z2 || z3 || z4) {
                        }
                        if (i2 != 0) {
                            if (i == i2 && c0180g != null) {
                                m6559a(s4, s2, c0180g, true);
                            } else {
                                C0180g c0180g2 = (C0180g) hashMap.get(Integer.valueOf(i2));
                                if (c0180g2 != null) {
                                    c0180g = c0180g2;
                                    i = i2;
                                    m6559a(s4, s2, c0180g, true);
                                } else {
                                    C0183j m6649a = c0173b.m6649a(i2);
                                    if (m6649a != null) {
                                        c0180g = C0180g.m6551a(c0173b, this, m6649a, i2 - m6649a.f960l, s4, s2, z);
                                        if (c0180g != null) {
                                            m6559a(s4, s2, c0180g, true);
                                            hashMap.put(Integer.valueOf(i2), c0180g);
                                        }
                                        i = i2;
                                    } else {
                                        throw new C0179f("Unable to decode base64 block, could not find tileId: " + i2);
                                    }
                                }
                            }
                        }
                        s3 = (short) (s4 + 1);
                    }
                }
            } else {
                return;
            }
            s = (short) (s2 + 1);
        }
    }

    /* renamed from: a */
    public static InputStream m6555a(String str, String str2, String str3) {
        InputStream gZIPInputStream;
        if (str2.equals("base64")) {
            byte[] m6554a = m6554a(str.toCharArray());
            if ("gzip".equals(str3)) {
                try {
                    gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(m6554a));
                } catch (IOException e) {
                    throw new C0179f("Unable to decode block in map", e);
                }
            } else if (VariableScope.nullOrMissingString.equals(str3)) {
                gZIPInputStream = new ByteArrayInputStream(m6554a);
            } else if ("zlib".equals(str3)) {
                gZIPInputStream = new InflaterInputStream(new ByteArrayInputStream(m6554a));
            } else {
                throw new C0179f("Unsupport tiled map compression: " + str2 + "," + str3 + " (only gzip base64 is supported, this can be set in Tiled's Preferences)");
            }
            return gZIPInputStream;
        }
        throw new C0179f("Unsupport tiled map encoding: " + str2 + "," + str3 + " (only gzip base64 is supported, this can be set in Tiled's Preferences)");
    }

    /* renamed from: a */
    public static byte[] m6554a(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = f889x;
        for (int i = 0; i < cArr.length; i++) {
            if (cArr[i] > 255 || bArr[cArr[i]] < 0) {
                length--;
            }
        }
        int i2 = (length / 4) * 3;
        if (length % 4 == 3) {
            i2 += 2;
        }
        if (length % 4 == 2) {
            i2++;
        }
        byte[] bArr2 = new byte[i2];
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        for (int i6 = 0; i6 < cArr.length; i6++) {
            byte b = cArr[i6] > 255 ? (byte) -1 : bArr[cArr[i6]];
            if (b >= 0) {
                i3 += 6;
                i4 = (i4 << 6) | b;
                if (i3 >= 8) {
                    i3 -= 8;
                    int i7 = i5;
                    i5++;
                    bArr2[i7] = (byte) ((i4 >> i3) & 255);
                }
            }
        }
        if (i5 != bArr2.length) {
            throw new RuntimeException("Data length appears to be wrong (wrote " + i5 + " should be " + bArr2.length + ")");
        }
        return bArr2;
    }
}
