package com.corrodinggames.rts.game.p012b;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.RectF;
import android.util.Log;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
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
public class C0153e {

    /* renamed from: x */
    private static byte[] f825x = new byte[SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_CONTENTS_MENU];

    /* renamed from: a */
    static C0760q f826a;

    /* renamed from: b */
    static C0760q[] f827b;

    /* renamed from: c */
    static C0760q f828c;

    /* renamed from: d */
    static C0760q f829d;

    /* renamed from: e */
    static C0760q f830e;

    /* renamed from: f */
    static C0760q f831f;

    /* renamed from: g */
    static C0760q f832g;

    /* renamed from: h */
    static C0760q[] f833h;

    /* renamed from: i */
    public C0148b f834i;

    /* renamed from: j */
    public int f835j;

    /* renamed from: k */
    public String f836k;

    /* renamed from: l */
    public String f837l;

    /* renamed from: m */
    public boolean f838m;

    /* renamed from: n */
    public int f839n;

    /* renamed from: o */
    public int f840o;

    /* renamed from: p */
    public Properties f841p;

    /* renamed from: q */
    public short[] f842q;

    /* renamed from: r */
    public boolean f843r;

    /* renamed from: s */
    public boolean f844s;

    /* renamed from: t */
    final Rect f845t = new Rect();

    /* renamed from: u */
    final Rect f846u = new Rect();

    /* renamed from: v */
    final RectF f847v = new RectF();

    /* renamed from: w */
    public boolean f848w;

    static {
        for (int i = 0; i < 256; i++) {
            f825x[i] = -1;
        }
        for (int i2 = 65; i2 <= 90; i2++) {
            f825x[i2] = (byte) (i2 - 65);
        }
        for (int i3 = 97; i3 <= 122; i3++) {
            f825x[i3] = (byte) ((26 + i3) - 97);
        }
        for (int i4 = 48; i4 <= 57; i4++) {
            f825x[i4] = (byte) ((52 + i4) - 48);
        }
        f825x[43] = 62;
        f825x[47] = 63;
        f826a = new C0760q();
        f826a.m4169b(-16777216);
        f826a.m4184a(Paint.Style.FILL);
        f827b = new C0760q[11];
        for (int i5 = 0; i5 <= 10; i5++) {
            f827b[i5] = new C0760q();
            f827b[i5].m4169b(-16777216);
            f827b[i5].m4184a(Paint.Style.FILL);
            f827b[i5].m4164c(i5 * 25);
        }
        f828c = new C0760q();
        f828c.m4169b(-16777216);
        f828c.m4184a(Paint.Style.FILL);
        f829d = new C0760q();
        f829d.m4173a(false);
        f829d.m4158d(false);
        f829d.m4166b(false);
        f830e = new C0760q();
        f830e.m4173a(true);
        f831f = new C0760q();
        f831f.m4173a(false);
        f831f.m4158d(false);
        f831f.m4166b(false);
        f832g = new C0760q();
        f832g.m4173a(true);
        f833h = new C0760q[11];
        for (int i6 = 0; i6 <= 10; i6++) {
            C0760q qVar = new C0760q();
            qVar.m4187a(new LightingColorFilter(Color.m4214a(255 - (i6 * 25), 255 - (i6 * 25), 255 - (i6 * 25)), 0));
            f833h[i6] = qVar;
        }
    }

    /* renamed from: a */
    public final C0155g m3617a(int i, int i2) {
        if (this.f842q == null) {
            this.f842q = new short[this.f839n * this.f840o];
        }
        return this.f834i.m3676a(this.f842q[(i * this.f840o) + i2]);
    }

    /* renamed from: a */
    public short[] m3618a() {
        if (this.f842q == null) {
            this.f842q = new short[this.f839n * this.f840o];
        }
        return this.f842q;
    }

    /* renamed from: a */
    public void m3616a(int i, int i2, C0155g gVar) {
        if (this.f842q == null) {
            this.f842q = new short[this.f839n * this.f840o];
        }
        C0155g a = this.f834i.m3691a(gVar, i, i2);
        if (a.f857i) {
            boolean z = false;
            Iterator it = this.f834i.f747w.iterator();
            while (it.hasNext()) {
                Point point = (Point) it.next();
                if (point.f221a == i && point.f222b == i2) {
                    AbstractC0789l.m670d("resPools point:" + i + ", " + i2 + " already exists");
                    z = true;
                }
            }
            if (!z) {
                this.f834i.f747w.add(new Point(i, i2));
            }
        }
        if (a.f852d == -1) {
            a.f852d = this.f834i.m3692a(a);
        }
        this.f842q[(i * this.f840o) + i2] = a.f852d;
    }

    /* renamed from: a */
    public void m3615a(AbstractC0755l lVar, float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, boolean z, boolean z2, boolean z3) {
        C0760q qVar;
        C0156h hVar;
        C0760q qVar2;
        AbstractC0789l u = AbstractC0789l.m638u();
        C0148b bVar = this.f834i;
        int i = (int) (f3 * bVar.f739o);
        if (i < 0) {
            i = 0;
        }
        int i2 = (int) (f4 * bVar.f740p);
        if (i2 < 0) {
            i2 = 0;
        }
        int i3 = (int) ((f3 + f5) * bVar.f739o);
        if (i3 > this.f839n - 1) {
            i3 = this.f839n - 1;
        }
        int i4 = (int) ((f4 + f6) * bVar.f740p);
        if (i4 > this.f840o - 1) {
            i4 = this.f840o - 1;
        }
        byte[][] bArr = u.f5493bb.f1262C;
        float f9 = f * f7;
        float f10 = f2 * f8;
        float f11 = bVar.f735k * f7;
        float f12 = bVar.f736l * f8;
        byte b = 15;
        if (!z2) {
            b = 10;
        }
        boolean z4 = bVar.f754C;
        if (z4) {
            b = 15;
        }
        if (z && bArr == null) {
            z = false;
        }
        C0760q qVar3 = f827b[5];
        C0760q qVar4 = f826a;
        C0760q qVar5 = f828c;
        qVar5.m4164c(255);
        if (z4) {
            qVar4 = f827b[7];
            qVar5.m4164c((int) ((1.0f - ((1.0f - (qVar3.m4155f() / 255.0f)) * (1.0f - (qVar4.m4155f() / 255.0f)))) * 255.0f));
        }
        boolean z5 = false;
        if (AbstractC0789l.m697al() && f7 < 1.0f && f8 < 1.0f) {
            z5 = true;
        }
        if (z3) {
        }
        if (!this.f843r) {
            qVar = f831f;
            if (z5) {
                qVar = f832g;
            }
        } else {
            qVar = f829d;
            if (z5) {
                qVar = f830e;
            }
        }
        float f13 = 0.0f;
        boolean z6 = false;
        if (!AbstractC0789l.m697al()) {
            z6 = true;
        } else if (!z3) {
            if (f7 < 1.0f || f8 < 1.0f) {
                f13 = 0.5f * f7;
            }
        } else if (f7 < 1.0f || f8 >= 1.0f) {
        }
        if (f7 < 0.5f) {
            hVar = C0148b.f734j;
        } else {
            hVar = C0148b.f733i;
        }
        short[] a = m3618a();
        C0155g[] gVarArr = bVar.f749x;
        RectF rectF = this.f847v;
        Rect rect = this.f846u;
        int i5 = this.f840o;
        boolean z7 = this.f843r;
        Rect rect2 = this.f845t;
        byte[][] bArr2 = bVar.f759H;
        byte[][] bArr3 = bVar.f760I;
        C0748e eVar = C0148b.f757F;
        for (int i6 = i; i6 < i3 + 1; i6++) {
            int i7 = i2;
            while (i7 < i4 + 1) {
                C0155g gVar = gVarArr[a[(i6 * i5) + i7]];
                if (gVar != null) {
                    byte b2 = 0;
                    if (z) {
                        b2 = bArr[i6][i7];
                    }
                    if (b2 != b) {
                        float f14 = (i6 * f11) + 0.0f;
                        float f15 = (i7 * f12) + 0.0f;
                        float f16 = ((i6 + 1) * f11) + f13;
                        float f17 = ((i7 + 1) * f12) + f13;
                        rectF.m4122a(f14 - f9, f15 - f10, f16 - f9, f17 - f10);
                        if (z5 && !z3) {
                            rectF.f232b = (int) rectF.f232b;
                            rectF.f231a = (int) rectF.f231a;
                        }
                        if (!z3) {
                            C0158j jVar = gVar.f849a;
                            if (z6) {
                                rect.m4136a((int) (f14 - f9), (int) (f15 - f10), (int) (f16 - f9), (int) (f17 - f10));
                                if (gVar.f851c >= 0) {
                                    lVar.mo139b(hVar.m3605a(gVar.f851c), hVar.m3596b(gVar.f851c), rect, qVar);
                                } else {
                                    lVar.mo170a(jVar.f885a, jVar.m3586b(gVar.f850b), rect, qVar);
                                }
                            } else if (gVar.f851c >= 0) {
                                lVar.mo169a(hVar.m3605a(gVar.f851c), hVar.m3596b(gVar.f851c), rectF, qVar);
                            } else {
                                gVar.m3608a(lVar, rectF, f7, qVar);
                            }
                        }
                        if (z && z7 && z2 && !(b2 == 0 && bArr3[i6][i7] == 0 && bArr2[i6][i7] == 0)) {
                            if (b2 >= 5) {
                                if (z3 && (b2 == 10 || bArr2[i6][i7] == 0)) {
                                    int i8 = i7 + 1;
                                    while (i8 < i4 && b2 == bArr[i6][i8] && (b2 == 10 || bArr2[i6][i8] == 0)) {
                                        i8++;
                                    }
                                    int i9 = i8 - 1;
                                    if (i9 > i7) {
                                        rectF.f234d += (i9 - i7) * f12;
                                        i7 = i9;
                                    }
                                }
                                if (b2 == 10) {
                                    qVar2 = qVar5;
                                } else {
                                    qVar2 = qVar3;
                                }
                                rect.f227a = (int) rectF.f231a;
                                rect.f229c = (int) rectF.f233c;
                                rect.f228b = (int) rectF.f232b;
                                rect.f230d = (int) rectF.f234d;
                                lVar.mo181a(rect, qVar2);
                            } else {
                                byte b3 = bArr3[i6][i7];
                                if (b3 == Byte.MAX_VALUE) {
                                    b3 = bVar.m3698a(i6, i7, bArr, (byte) 5);
                                    bArr3[i6][i7] = b3;
                                }
                                if (b3 != 0) {
                                    int i10 = b3 + 128;
                                    if (eVar != null) {
                                        C0148b.m3697a(i10, rect2);
                                        rect.m4136a((int) (f14 - f9), (int) (f15 - f10), (int) (f16 - f9), (int) (f17 - f10));
                                        lVar.mo139b(eVar, rect2, rect, qVar3);
                                    } else if (!bVar.f732h[b3 + 128]) {
                                        AbstractC0789l.m670d("SmoothFog, missing: " + ((int) b3));
                                        bVar.f732h[b3 + 128] = true;
                                    }
                                }
                            }
                            if (b2 != 10) {
                                byte b4 = bArr2[i6][i7];
                                if (b4 == Byte.MAX_VALUE) {
                                    b4 = bVar.m3698a(i6, i7, bArr, (byte) 10);
                                    bArr2[i6][i7] = b4;
                                }
                                if (b4 != 0) {
                                    int i11 = b4 + 128;
                                    if (eVar != null) {
                                        C0148b.m3697a(i11, rect2);
                                        rect.m4136a((int) (f14 - f9), (int) (f15 - f10), (int) (f16 - f9), (int) (f17 - f10));
                                        lVar.mo139b(eVar, rect2, rect, qVar4);
                                    } else if (!bVar.f732h[b4 + 128]) {
                                        AbstractC0789l.m670d("SmoothFog, missing: " + ((int) b4));
                                        bVar.f732h[b4 + 128] = true;
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
    public void m3611b() {
        this.f842q = null;
        this.f841p = null;
        this.f834i = null;
    }

    C0153e(C0148b bVar, Element element) {
        NodeList elementsByTagName;
        this.f834i = bVar;
        this.f836k = element.getAttribute("name");
        Log.m4033d("RustedWarfare", "MapLayer create: " + this.f836k);
        if (this.f836k != null) {
            this.f837l = this.f836k.toLowerCase(Locale.ENGLISH);
        }
        this.f838m = this.f837l.contains("items");
        this.f843r = this.f837l.equalsIgnoreCase("ground");
        if (this.f838m || this.f843r) {
            this.f844s = true;
        }
        if (this.f836k != null && this.f836k.equalsIgnoreCase("grounddetails")) {
            this.f844s = true;
        }
        this.f839n = Short.parseShort(element.getAttribute("width"));
        this.f840o = Short.parseShort(element.getAttribute("height"));
        Element element2 = (Element) element.getElementsByTagName("properties").item(0);
        if (!(element2 == null || (elementsByTagName = element2.getElementsByTagName("property")) == null)) {
            this.f841p = new Properties();
            for (int i = 0; i < elementsByTagName.getLength(); i++) {
                Element element3 = (Element) elementsByTagName.item(i);
                this.f841p.setProperty(element3.getAttribute("name"), element3.getAttribute("value"));
            }
        }
        Element element4 = (Element) element.getElementsByTagName("data").item(0);
        try {
            InputStream a = m3613a(element4.getFirstChild().getNodeValue(), element4.getAttribute("encoding"), element4.getAttribute("compression"));
            BufferedInputStream bufferedInputStream = new BufferedInputStream(a);
            m3614a(bufferedInputStream);
            if (bufferedInputStream != null) {
                bufferedInputStream.close();
            }
            if (a != null) {
                a.close();
            }
        } catch (IOException e) {
            throw new C0154f("Unable to decompress base64 block", e);
        }
    }

    /* renamed from: a */
    void m3614a(InputStream inputStream) {
        C0148b bVar = this.f834i;
        C0155g gVar = null;
        int i = -1;
        boolean z = this.f844s;
        HashMap hashMap = new HashMap();
        for (short s = 0; s < this.f840o; s = (short) (s + 1)) {
            for (short s2 = 0; s2 < this.f839n; s2 = (short) (s2 + 1)) {
                int read = 0 | inputStream.read() | (inputStream.read() << 8) | (inputStream.read() << 16) | (inputStream.read() << 24);
                boolean z2 = (read & Integer.MIN_VALUE) != 0;
                boolean z3 = (read & 1073741824) != 0;
                boolean z4 = (read & 536870912) != 0;
                int i2 = read & 536870911;
                if (z2 || z3 || z4) {
                }
                if (i2 != 0) {
                    if (i != i2 || gVar == null) {
                        C0155g gVar2 = (C0155g) hashMap.get(Integer.valueOf(i2));
                        if (gVar2 != null) {
                            gVar = gVar2;
                            i = i2;
                            m3616a(s2, s, gVar);
                        } else {
                            C0158j a = bVar.m3700a(i2);
                            if (a != null) {
                                gVar = C0155g.m3609a(bVar, this, a, i2 - a.f895k, s2, s, z);
                                if (gVar != null) {
                                    m3616a(s2, s, gVar);
                                    hashMap.put(Integer.valueOf(i2), gVar);
                                }
                                i = i2;
                            } else {
                                throw new C0154f("Unable to decode base64 block, could not find tileId: " + i2);
                            }
                        }
                    } else {
                        m3616a(s2, s, gVar);
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public static InputStream m3613a(String str, String str2, String str3) {
        InputStream gZIPInputStream;
        if (str2.equals("base64")) {
            byte[] a = m3612a(str.toCharArray());
            if ("gzip".equals(str3)) {
                try {
                    gZIPInputStream = new GZIPInputStream(new ByteArrayInputStream(a));
                } catch (IOException e) {
                    throw new C0154f("Unable to decode block in map", e);
                }
            } else if ("".equals(str3)) {
                gZIPInputStream = new ByteArrayInputStream(a);
            } else if ("zlib".equals(str3)) {
                gZIPInputStream = new InflaterInputStream(new ByteArrayInputStream(a));
            } else {
                throw new C0154f("Unsupport tiled map compression: " + str2 + "," + str3 + " (only gzip base64 is supported, this can be set in Tiled's Preferences)");
            }
            return gZIPInputStream;
        }
        throw new C0154f("Unsupport tiled map encoding: " + str2 + "," + str3 + " (only gzip base64 is supported, this can be set in Tiled's Preferences)");
    }

    /* renamed from: a */
    public static byte[] m3612a(char[] cArr) {
        int length = cArr.length;
        byte[] bArr = f825x;
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
                    i5++;
                    bArr2[i5] = (byte) ((i4 >> i3) & 255);
                }
            }
        }
        if (i5 == bArr2.length) {
            return bArr2;
        }
        throw new RuntimeException("Data length appears to be wrong (wrote " + i5 + " should be " + bArr2.length + ")");
    }
}
