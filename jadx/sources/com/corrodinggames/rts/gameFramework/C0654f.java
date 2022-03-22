package com.corrodinggames.rts.gameFramework;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileFilter;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.io.PrintWriter;
import java.io.StringWriter;
import java.io.UnsupportedEncodingException;
import java.lang.reflect.Field;
import java.math.BigInteger;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f.class */
public final class C0654f {

    /* renamed from: a */
    static final Random f4586a = new Random();

    /* renamed from: b */
    static final Random f4587b = new Random();

    /* renamed from: c */
    public static final PointF f4588c = new PointF();

    /* renamed from: j */
    private static final byte[] f4589j = new byte[1001];

    /* renamed from: d */
    static final PointF f4590d;

    /* renamed from: e */
    static final PointF f4591e;

    /* renamed from: f */
    static final PointF f4592f;

    /* renamed from: g */
    static final PointF f4593g;

    /* renamed from: h */
    static final PointF f4594h;

    /* renamed from: k */
    private static final char[] f4595k;

    /* renamed from: l */
    private static final float[] f4596l;

    /* renamed from: m */
    private static final float[] f4597m;

    /* renamed from: n */
    private static final float[] f4598n;

    /* renamed from: o */
    private static final float[] f4599o;

    /* renamed from: p */
    private static final float[] f4600p;

    /* renamed from: q */
    private static final float[] f4601q;

    /* renamed from: r */
    private static final float[] f4602r;

    /* renamed from: s */
    private static final float[] f4603s;

    /* renamed from: i */
    static int f4604i;

    /* renamed from: t */
    private static final float[] f4605t;

    /* renamed from: u */
    private static final float[] f4606u;

    static {
        for (int i = 0; i < f4589j.length; i++) {
            f4589j[i] = (byte) StrictMath.round(m1523a(i));
        }
        f4590d = new PointF();
        f4591e = new PointF();
        f4592f = new PointF();
        f4593g = new PointF();
        f4594h = new PointF();
        f4595k = new char[36];
        for (int i2 = 0; i2 < 10; i2++) {
            f4595k[i2] = (char) (48 + i2);
        }
        for (int i3 = 10; i3 < 36; i3++) {
            f4595k[i3] = (char) ((97 + i3) - 10);
        }
        f4596l = new float[1025];
        f4597m = new float[1025];
        f4598n = new float[1025];
        f4599o = new float[1025];
        f4600p = new float[1025];
        f4601q = new float[1025];
        f4602r = new float[1025];
        f4603s = new float[1025];
        for (int i4 = 0; i4 <= 1024; i4++) {
            f4596l[i4] = (float) ((StrictMath.atan(i4 / 1024.0f) * 3.1415927410125732d) / 3.141592653589793d);
            f4597m[i4] = 1.5707964f - f4596l[i4];
            f4598n[i4] = -f4596l[i4];
            f4599o[i4] = f4596l[i4] - 1.5707964f;
            f4600p[i4] = 3.1415927f - f4596l[i4];
            f4601q[i4] = f4596l[i4] + 1.5707964f;
            f4602r[i4] = f4596l[i4] - 3.1415927f;
            f4603s[i4] = (-1.5707964f) - f4596l[i4];
        }
        f4604i = 0;
        f4605t = new float[4096];
        f4606u = new float[4096];
        for (int i5 = 0; i5 < 4096; i5++) {
            f4605t[i5] = (float) StrictMath.sin(((i5 + 0.5f) / 4096.0f) * 6.2831855f);
            f4606u[i5] = (float) StrictMath.cos(((i5 + 0.5f) / 4096.0f) * 6.2831855f);
        }
    }

    /* renamed from: a */
    public static final void m1527a() {
        f4587b.setSeed(0L);
    }

    /* renamed from: a */
    public static final int m1500a(AbstractC0210af afVar, int i, int i2) {
        return m1499a((AbstractC0854w) afVar, i, i2, 0);
    }

    /* renamed from: a */
    public static final float m1501a(AbstractC0210af afVar, float f, float f2, int i) {
        if (afVar == null) {
            return m1512a((int) (f * 1000.0f), (int) (f2 * 1000.0f), i) * 0.001f;
        }
        return m1499a((AbstractC0854w) afVar, (int) (f * 1000.0f), (int) (f2 * 1000.0f), i) * 0.001f;
    }

    /* renamed from: b */
    public static final float m1467b(AbstractC0210af afVar, float f, float f2, int i) {
        return m1499a((AbstractC0854w) afVar, (int) (f * 1000.0f), (int) (f2 * 1000.0f), i) * 0.001f;
    }

    /* renamed from: a */
    public static final int m1499a(AbstractC0854w wVar, int i, int i2, int i3) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (i >= i2) {
            if (i > i2) {
                AbstractC0789l.m682b("min>max");
            }
            return i;
        }
        int i4 = u.f5498bg + 1;
        int i5 = (int) (((int) (((int) (((int) (((int) (0 + (wVar.f5835dA * 1313))) + (wVar.f5842dH * 13.0f))) + (wVar.f5843dI * 13.0f))) + (wVar.f5842dH * 130.0f))) + (wVar.f5843dI * 130.0f));
        if (wVar instanceof AbstractC0210af) {
            int i6 = ((AbstractC0210af) wVar).f1441bi;
            i5 = i5 + (i6 * 13131) + (i6 * i4);
        }
        int i7 = ((((int) ((i5 + ((i3 * 133) * i2)) + ((i3 * wVar.f5835dA) + i3))) + (i3 * (i4 * 1313))) + ((i4 * 13) + (i4 % 10))) % (i2 - i);
        if (i7 < 0) {
            i7 = -i7;
        }
        return i7 + i;
    }

    /* renamed from: a */
    public static final float m1518a(float f, float f2, int i) {
        return m1512a((int) (f * 100.0f), (int) (f2 * 100.0f), i) / 100.0f;
    }

    /* renamed from: a */
    public static final int m1512a(int i, int i2, int i3) {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (i >= i2) {
            if (i > i2) {
                AbstractC0789l.m682b("min>max");
            }
            return i;
        }
        int i4 = ((((0 + ((i3 * 133) * i2)) + (i3 * 13)) + (i3 * (u.f5498bg * 1313))) + ((u.f5498bg * 13) + (u.f5498bg % 10))) % (i2 - i);
        if (i4 < 0) {
            i4 = -i4;
        }
        int i5 = i4 + i;
        if (i5 < i || i5 > i2) {
            AbstractC0789l.m682b("notRandInt number not in range: " + i5 + " min:" + i + " max:" + i2);
        }
        return i5;
    }

    /* renamed from: a */
    public static String m1490a(String str) {
        return new SimpleDateFormat(str).format(Calendar.getInstance().getTime());
    }

    /* renamed from: a */
    public static final void m1496a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[1024];
        while (true) {
            int read = inputStream.read(bArr);
            if (read != -1) {
                outputStream.write(bArr, 0, read);
            } else {
                return;
            }
        }
    }

    /* renamed from: a */
    public static final String m1497a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[1024];
        while (true) {
            try {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                byteArrayOutputStream.write(bArr, 0, read);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        byteArrayOutputStream.close();
        inputStream.close();
        return byteArrayOutputStream.toString();
    }

    /* renamed from: a */
    public static final float m1523a(float f) {
        return (float) StrictMath.sqrt(f);
    }

    /* renamed from: a */
    public static final int m1515a(int i) {
        if (i > 1000 || i < 0) {
            return StrictMath.round(m1523a(i));
        }
        return f4589j[i];
    }

    /* renamed from: a */
    public static final float m1522a(float f, float f2) {
        if (f > f2) {
            return f - f2;
        }
        if (f < (-f2)) {
            return f + f2;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static final float m1521a(float f, float f2, float f3) {
        if (f > f2 + f3) {
            return f - f3;
        }
        if (f < f2 - f3) {
            return f + f3;
        }
        return f2;
    }

    /* renamed from: b */
    public static final float m1476b(float f, float f2) {
        if (f > f2) {
            return f2;
        }
        if (f < (-f2)) {
            return -f2;
        }
        return f;
    }

    /* renamed from: b */
    public static final float m1475b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* renamed from: b */
    public static final int m1471b(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < i2) {
            return i2;
        }
        return i;
    }

    /* renamed from: a */
    public static final void m1519a(float f, float f2, float f3, PointF pointF) {
        float h = m1425h(f3);
        float i = m1421i(f3);
        pointF.f224a -= f;
        pointF.f225b -= f2;
        float f4 = (pointF.f224a * i) - (pointF.f225b * h);
        float f5 = (pointF.f224a * h) + (pointF.f225b * i);
        pointF.f224a = f4 + f;
        pointF.f225b = f5 + f2;
    }

    /* renamed from: a */
    public static final float m1520a(float f, float f2, float f3, float f4) {
        return ((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4));
    }

    /* renamed from: b */
    public static final float m1474b(float f, float f2, float f3, float f4) {
        return (float) StrictMath.sqrt(((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4)));
    }

    /* renamed from: c */
    public static final int m1456c(float f, float f2, float f3, float f4) {
        return m1515a((int) (((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4))));
    }

    /* renamed from: a */
    public static final int m1511a(int i, int i2, int i3, int i4) {
        int i5 = i - i3;
        int i6 = i2 - i4;
        if (i5 < 0) {
            i5 = -i5;
        }
        if (i6 < 0) {
            i6 = -i6;
        }
        return i5 > i6 ? i5 : i6;
    }

    /* renamed from: a */
    public static final float m1516a(float f, boolean z) {
        if (!z) {
            while (true) {
                if (f <= 180.0f && f >= -180.0f) {
                    break;
                }
                if (f > 180.0f) {
                    f -= 360.0f;
                }
                if (f < -180.0f) {
                    f += 360.0f;
                }
            }
        } else {
            while (true) {
                if (f <= 360.0f && f >= 0.0f) {
                    break;
                }
                if (f > 360.0f) {
                    f -= 360.0f;
                }
                if (f < 0.0f) {
                    f += 360.0f;
                }
            }
        }
        return f;
    }

    /* renamed from: c */
    public static final float m1457c(float f, float f2, float f3) {
        float f4 = (f2 % 360.0f) - (f % 360.0f);
        if (f4 > 180.0f) {
            f4 -= 360.0f;
        }
        if (f4 < -180.0f) {
            f4 += 360.0f;
        }
        return f4 > f3 ? f3 : f4 < (-f3) ? -f3 : f4;
    }

    /* renamed from: d */
    public static final float m1446d(float f, float f2, float f3, float f4) {
        return m1477b(m1420i(f4 - f2, f3 - f));
    }

    /* renamed from: a */
    public static final boolean m1508a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        float f = ((pointF4.f225b - pointF3.f225b) * (pointF2.f224a - pointF.f224a)) - ((pointF4.f224a - pointF3.f224a) * (pointF2.f225b - pointF.f225b));
        float f2 = ((pointF4.f224a - pointF3.f224a) * (pointF.f225b - pointF3.f225b)) - ((pointF4.f225b - pointF3.f225b) * (pointF.f224a - pointF3.f224a));
        float f3 = ((pointF2.f224a - pointF.f224a) * (pointF.f225b - pointF3.f225b)) - ((pointF2.f225b - pointF.f225b) * (pointF.f224a - pointF3.f224a));
        if (f != 0.0f) {
            float f4 = f2 / f;
            float f5 = f3 / f;
            return f4 >= 0.0f && f4 <= 1.0f && f5 >= 0.0f && f5 <= 1.0f;
        } else if (f2 != 0.0f || f3 == 0.0f) {
            return false;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public static final float m1458c(float f, float f2) {
        return (f4586a.nextFloat() * (f2 - f)) + f;
    }

    /* renamed from: d */
    public static final float m1448d(float f, float f2) {
        return (f4586a.nextFloat() * (f2 - f)) + f;
    }

    /* renamed from: b */
    public static final int m1473b(int i) {
        if (i == 0) {
            return 0;
        }
        return f4586a.nextInt(i);
    }

    /* renamed from: a */
    public static int m1514a(int i, int i2) {
        int i3;
        if (i2 == i) {
            i3 = 0;
        } else {
            i3 = f4586a.nextInt((i2 - i) + 1);
        }
        return i + i3;
    }

    /* renamed from: a */
    public static final void m1507a(Rect rect) {
        if (rect.f229c < rect.f227a) {
            int i = rect.f229c;
            rect.f229c = rect.f227a;
            rect.f227a = i;
        }
        if (rect.f230d < rect.f228b) {
            int i2 = rect.f230d;
            rect.f230d = rect.f228b;
            rect.f228b = i2;
        }
    }

    /* renamed from: a */
    public static final void m1504a(RectF rectF) {
        if (rectF.f233c < rectF.f231a) {
            float f = rectF.f233c;
            rectF.f233c = rectF.f231a;
            rectF.f231a = f;
        }
        if (rectF.f234d < rectF.f232b) {
            float f2 = rectF.f234d;
            rectF.f234d = rectF.f232b;
            rectF.f232b = f2;
        }
    }

    /* renamed from: d */
    public static final PointF m1447d(float f, float f2, float f3) {
        f4594h.m4141a(f, f2 - f3);
        return f4594h;
    }

    /* renamed from: b */
    public static final float m1477b(float f) {
        return f * 57.29578f;
    }

    /* renamed from: e */
    public static final float m1440e(float f, float f2) {
        return (float) StrictMath.pow(f, f2);
    }

    /* renamed from: a */
    public static final double m1526a(double d) {
        return d < 0.0d ? -d : d;
    }

    /* renamed from: c */
    public static final float m1459c(float f) {
        return f < 0.0f ? -f : f;
    }

    /* renamed from: c */
    public static final int m1455c(int i) {
        return i < 0 ? -i : i;
    }

    /* renamed from: b */
    public static final int m1472b(int i, int i2) {
        return i > i2 ? i : i2;
    }

    /* renamed from: c */
    public static final int m1454c(int i, int i2) {
        return i < i2 ? i : i2;
    }

    /* renamed from: f */
    public static final float m1434f(float f, float f2) {
        return f > f2 ? f : f2;
    }

    /* renamed from: g */
    public static final float m1428g(float f, float f2) {
        return f < f2 ? f : f2;
    }

    /* renamed from: h */
    public static final boolean m1424h(float f, float f2) {
        return m1459c(f - f2) < 0.05f;
    }

    /* renamed from: a */
    public static final double m1525a(double d, double d2) {
        return d < d2 ? d : d2;
    }

    /* renamed from: e */
    public static boolean m1439e(float f, float f2, float f3) {
        if (m1459c(m1459c(f) - m1459c(f2)) < f3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static float m1449d(float f) {
        return (int) (f + 0.5f);
    }

    /* renamed from: e */
    public static final int m1441e(float f) {
        if (f > 0.0f) {
            return (int) f;
        }
        if (f < 0.0f) {
            return ((int) f) - 1;
        }
        return 0;
    }

    /* renamed from: a */
    public static void m1503a(RectF rectF, float f) {
        rectF.f231a -= f;
        rectF.f232b -= f;
        rectF.f233c += f;
        rectF.f234d += f;
    }

    /* renamed from: a */
    public static void m1506a(Rect rect, float f) {
        rect.f227a = (int) (rect.f227a - f);
        rect.f228b = (int) (rect.f228b - f);
        rect.f229c = (int) (rect.f229c + f);
        rect.f230d = (int) (rect.f230d + f);
    }

    /* renamed from: b */
    public static void m1468b(Rect rect, float f) {
        rect.f227a = (int) (rect.f227a - f);
        rect.f228b = (int) (rect.f228b - f);
        rect.f229c = (int) (rect.f229c + (f * 2.0f));
        rect.f230d = (int) (rect.f230d + (f * 2.0f));
    }

    /* renamed from: d */
    public static String m1445d(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(f4595k[f4586a.nextInt(f4595k.length)]);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m1480b() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static String m1483a(boolean z) {
        return z ? "true" : "false";
    }

    /* renamed from: b */
    public static String m1479b(double d) {
        if (d == ((int) d)) {
            return "" + ((int) d);
        }
        return "" + d;
    }

    /* renamed from: f */
    public static String m1435f(float f) {
        return m1517a(f, 2);
    }

    /* renamed from: c */
    public static String m1460c(double d) {
        if (d == ((int) d)) {
            return "" + ((int) d);
        }
        return String.format("%.2f", Double.valueOf(d));
    }

    /* renamed from: a */
    public static String m1517a(float f, int i) {
        return f == ((float) ((int) f)) ? "" + ((int) f) : String.format("%." + i + "f", Float.valueOf(f));
    }

    /* renamed from: a */
    public static String m1524a(double d, int i) {
        return d == ((double) ((int) d)) ? "" + ((int) d) : String.format("%." + i + "f", Double.valueOf(d));
    }

    /* renamed from: g */
    public static String m1429g(float f) {
        if (f == ((int) f)) {
            return "" + ((int) f) + "s";
        }
        return String.format("%.1fs", Float.valueOf(f));
    }

    /* renamed from: a */
    public static String m1488a(String str, int i) {
        if (str == null) {
            return null;
        }
        if (str.length() < i) {
            return str;
        }
        return str.substring(0, Math.min(str.length(), i));
    }

    /* renamed from: b */
    public static String m1463b(String str, int i) {
        if (str == null) {
            return null;
        }
        if (str.length() < i) {
            return str;
        }
        int i2 = i - 3;
        if (i2 < 1) {
            i2 = 1;
        }
        return str.substring(0, Math.min(str.length(), i2)) + "...";
    }

    /* renamed from: b */
    public static String m1465b(String str) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(str.getBytes("UTF-8"));
            StringBuilder sb = new StringBuilder(digest.length * 2);
            for (byte b : digest) {
                int i = b & 255;
                if (i < 16) {
                    sb.append('0');
                }
                sb.append(Integer.toHexString(i));
            }
            return sb.toString();
        } catch (UnsupportedEncodingException e) {
            throw new RuntimeException("UTF-8 should be supported", e);
        } catch (NoSuchAlgorithmException e2) {
            throw new RuntimeException("MD5 should be supported", e2);
        }
    }

    /* renamed from: c */
    public static String m1453c(String str) {
        return m1488a(m1482a(m1431f(str)), 14);
    }

    /* renamed from: d */
    public static String m1444d(String str) {
        return m1488a(m1482a(m1431f(str)), 4);
    }

    /* renamed from: c */
    public static String m1451c(String str, int i) {
        String a = m1482a(m1431f(str));
        for (int i2 = 0; i2 < i; i2++) {
            a = m1482a(m1431f(a));
        }
        return a;
    }

    /* renamed from: e */
    public static String m1437e(String str) {
        return m1482a(m1431f(str));
    }

    /* renamed from: f */
    static byte[] m1431f(String str) {
        try {
            MessageDigest instance = MessageDigest.getInstance("SHA-256");
            instance.reset();
            return instance.digest(str.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    static String m1482a(byte[] bArr) {
        return String.format("%0" + (bArr.length * 2) + "X", new BigInteger(1, bArr));
    }

    /* renamed from: c */
    public static int m1461c() {
        int availableProcessors;
        int i = 1;
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists()) {
                i = file.listFiles(new C0655a()).length;
            }
        } catch (Exception e) {
            e.printStackTrace();
            i = 1;
        }
        if (i == 1 && (availableProcessors = Runtime.getRuntime().availableProcessors()) > 1) {
            i = availableProcessors;
        }
        return i;
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.f$a */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f$a.class */
    class C0655a implements FileFilter {
        C0655a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            if (file == null || !Pattern.matches("cpu[0-9]+", file.getName())) {
                return false;
            }
            return true;
        }
    }

    /* renamed from: a */
    public static void m1481a(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    /* renamed from: f */
    public static float m1433f(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public static int m1513a(int i, int i2, float f) {
        int a = Color.m4215a(i);
        int b = Color.m4211b(i);
        int c = Color.m4210c(i);
        int d = Color.m4209d(i);
        return Color.m4213a((int) m1433f(a, Color.m4215a(i2), f), (int) m1433f(b, Color.m4211b(i2), f), (int) m1433f(c, Color.m4210c(i2), f), (int) m1433f(d, Color.m4209d(i2), f));
    }

    /* renamed from: d */
    public static String m1443d(String str, int i) {
        String str2 = "";
        for (int i2 = 0; i2 <= i; i2++) {
            str2 = str2 + str;
        }
        return str2;
    }

    /* renamed from: e */
    public static String m1436e(String str, int i) {
        for (int length = str.length(); length < i; length++) {
            str = str + " ";
        }
        return str;
    }

    /* renamed from: a */
    public static String m1487a(String str, int i, String str2) {
        for (int length = str.length(); length < i; length++) {
            str = str2 + str;
        }
        return str;
    }

    /* renamed from: f */
    public static String m1430f(String str, int i) {
        return String.format("%1$-" + i + "s", str);
    }

    /* renamed from: a */
    public static String m1494a(Class cls, int i) {
        Field[] fields;
        try {
            for (Field field : cls.getFields()) {
                if (field.getInt(null) == i) {
                    return field.getName();
                }
            }
            return null;
        } catch (IllegalAccessException e) {
            throw new RuntimeException(e);
        } catch (IllegalArgumentException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: e */
    public static String m1438e(int i) {
        String a = m1494a(C0063R.drawable.class, i);
        if (a != null) {
            return C0596a.m1893a("res/drawable", a);
        }
        String a2 = m1494a(C0063R.raw.class, i);
        if (a2 != null) {
            return C0596a.m1893a("res/raw", a2);
        }
        return null;
    }

    /* renamed from: f */
    public static final String m1432f(int i) {
        return String.format("#%06X", Integer.valueOf(16777215 & i));
    }

    /* renamed from: g */
    public static final String m1427g(String str) {
        if (str == null) {
            return null;
        }
        return new File(str).getName().replaceFirst("[.][^.]+$", "");
    }

    /* renamed from: h */
    public static final String m1423h(String str) {
        if (str.contains("\\")) {
            str = str.replace('\\', '/');
        }
        return new File(str).getParent();
    }

    /* renamed from: a */
    public static final boolean m1505a(Rect rect, RectF rectF) {
        return ((float) rect.f227a) < rectF.f233c && rectF.f231a < ((float) rect.f229c) && ((float) rect.f228b) < rectF.f234d && rectF.f232b < ((float) rect.f230d);
    }

    /* renamed from: a */
    public static final boolean m1502a(RectF rectF, RectF rectF2) {
        return rectF.f231a < rectF2.f233c && rectF2.f231a < rectF.f233c && rectF.f232b < rectF2.f234d && rectF2.f232b < rectF.f234d;
    }

    /* renamed from: b */
    public static final int m1470b(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: a */
    public static final long m1509a(long j, long j2) {
        return (j2 - j) / 1000000;
    }

    /* renamed from: a */
    public static final int m1489a(String str, char c) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    public static final String m1419i(String str) {
        return str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("${", "$ {");
    }

    /* renamed from: a */
    public static String m1498a(File file) {
        int read;
        try {
            FileInputStream fileInputStream = new FileInputStream(file);
            try {
                byte[] bArr = new byte[(int) file.length()];
                int length = bArr.length;
                int i = 0;
                while (i < length && (read = fileInputStream.read(bArr, i, length - i)) != -1) {
                    i += read;
                }
                String str = new String(bArr, Charset.forName("UTF-8"));
                fileInputStream.close();
                return str;
            } catch (Throwable th) {
                fileInputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public static final String m1493a(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    public static final String m1466b(Exception exc) {
        return m1492a(exc, false);
    }

    /* renamed from: a */
    public static final String m1492a(Exception exc, boolean z) {
        String message = exc.getMessage();
        if (message == 0) {
            message = exc.getClass().getName();
        } else {
            boolean z2 = false;
            if (exc instanceof NumberFormatException) {
                z2 = true;
            }
            if (exc instanceof ArrayIndexOutOfBoundsException) {
                z2 = true;
            }
            if (z2 || z) {
                message = exc.getClass().getName() + " - " + message;
            }
        }
        Throwable th = exc;
        while (th != null) {
            Throwable cause = th.getCause();
            if (cause == null || cause == exc || cause == th) {
                break;
            }
            th = cause;
        }
        if (!(th == null || th == exc)) {
            String message2 = th.getMessage();
            if (message2 == null) {
                message2 = th.getClass().getName();
            }
            boolean z3 = true;
            if (message2.equals(message)) {
                z3 = false;
            }
            if (message != null && message.contains(message2)) {
                z3 = false;
            }
            if (z3) {
                message = message + " caused by (" + message2 + ")";
            }
        }
        return message;
    }

    /* renamed from: j */
    public static String m1417j(String str) {
        if (str.endsWith("\n")) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    /* renamed from: a */
    public static String m1486a(String str, String str2) {
        if (str.endsWith(str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    /* renamed from: k */
    public static String m1416k(String str) {
        return new File(str).getName();
    }

    /* renamed from: b */
    public static String m1462b(String str, String str2) {
        if (str2.startsWith("/") || str2.startsWith("\\")) {
            str2 = str2.substring(1);
        }
        if (str.endsWith("/")) {
            return str + str2;
        }
        if (str.endsWith("\\")) {
            str = str.substring(0, str.length() - 1);
        }
        return str + "/" + str2;
    }

    /* renamed from: a */
    public static String m1495a(CharSequence charSequence, Iterable iterable) {
        StringBuilder sb = new StringBuilder();
        boolean z = true;
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (z) {
                z = false;
            } else {
                sb.append(charSequence);
            }
            sb.append(str);
        }
        return sb.toString();
    }

    /* renamed from: l */
    public static Integer m1415l(String str) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            AbstractC0789l.m670d(e.toString());
            return null;
        }
    }

    /* renamed from: m */
    public static boolean m1414m(String str) {
        int length = str.length();
        int i = 0;
        while (i < length) {
            int codePointAt = str.codePointAt(i);
            if (codePointAt > 128) {
                return true;
            }
            i += Character.charCount(codePointAt);
        }
        return false;
    }

    /* renamed from: a */
    public static String m1510a(long j) {
        int[] b;
        String str;
        if (m1469b(j)[0] == 0) {
            str = m1487a("" + b[1], 2, "0") + ":" + m1487a("" + b[2], 2, "0");
        } else {
            str = m1487a("" + b[0], 2, "0") + ":" + m1487a("" + b[1], 2, "0") + ":" + m1487a("" + b[2], 2, "0");
        }
        return str;
    }

    /* renamed from: b */
    public static int[] m1469b(long j) {
        int i = ((int) j) / 3600;
        int i2 = ((int) j) - (i * 3600);
        int i3 = i2 / 60;
        return new int[]{i, i3, i2 - (i3 * 60)};
    }

    /* renamed from: i */
    public static final float m1420i(float f, float f2) {
        try {
            if (f2 >= 0.0f) {
                if (f >= 0.0f) {
                    if (f2 >= f) {
                        return f4596l[(int) (((1024.0f * f) / f2) + 0.5d)];
                    }
                    return f4597m[(int) (((1024.0f * f2) / f) + 0.5d)];
                } else if (f2 >= (-f)) {
                    return f4598n[(int) ((((-1024.0f) * f) / f2) + 0.5d)];
                } else {
                    return f4599o[(int) ((((-1024.0f) * f2) / f) + 0.5d)];
                }
            } else if (f >= 0.0f) {
                if ((-f2) >= f) {
                    return f4600p[(int) ((((-1024.0f) * f) / f2) + 0.5d)];
                }
                return f4601q[(int) ((((-1024.0f) * f2) / f) + 0.5d)];
            } else if (f2 <= f) {
                return f4602r[(int) (((1024.0f * f) / f2) + 0.5d)];
            } else {
                return f4603s[(int) (((1024.0f * f2) / f) + 0.5d)];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            if (f4604i < 100) {
                AbstractC0789l.m670d("atan2 slow fallback for y:" + f + " x:" + f2);
                f4604i++;
            }
            return (float) StrictMath.atan2(f, f2);
        }
    }

    /* renamed from: h */
    public static final float m1425h(float f) {
        return f4605t[((int) (f * 11.377778f)) & 4095];
    }

    /* renamed from: i */
    public static final float m1421i(float f) {
        return f4606u[((int) (f * 11.377778f)) & 4095];
    }

    /* renamed from: n */
    public static String m1413n(String str) {
        if (str.contains("&")) {
            str = str.replace("&lt;", "<").replace("&gt;", ">").replace("&apos;", "'").replace("&quot;", "\"").replace("&amp;", "&");
        }
        return str;
    }

    /* renamed from: o */
    public static String m1412o(String str) {
        char[] charArray;
        boolean z = false;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            z = false;
            if (z || c != '\\') {
                sb.append(c);
            } else {
                z = true;
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m1485a(String str, String str2, String str3) {
        if (!m1450c(str, str2)) {
            return str;
        }
        return str.replace(str2, str3);
    }

    /* renamed from: c */
    public static final boolean m1450c(String str, String str2) {
        return str.indexOf(str2) > -1;
    }

    /* renamed from: b */
    public static String[] m1464b(String str, char c) {
        if (str.length() == 0) {
            return new String[]{""};
        }
        int i = 0;
        int i2 = 0;
        while (true) {
            int indexOf = str.indexOf(c, i2);
            if (indexOf == -1) {
                break;
            }
            i++;
            i2 = indexOf + 1;
        }
        if (i == 0) {
            return new String[]{str};
        }
        int length = str.length();
        if (i2 == length) {
            if (i == length) {
                return new String[0];
            }
            do {
                i2--;
            } while (str.charAt(i2 - 1) == c);
            i -= str.length() - i2;
            length = i2;
        }
        String[] strArr = new String[i + 1];
        int i3 = 0;
        for (int i4 = 0; i4 != i; i4++) {
            int indexOf2 = str.indexOf(c, i3);
            strArr[i4] = str.substring(i3, indexOf2);
            i3 = indexOf2 + 1;
        }
        strArr[i] = str.substring(i3, length);
        return strArr;
    }

    /* renamed from: c */
    public static String[] m1452c(String str, char c) {
        char[] charArray;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        StringBuilder sb = new StringBuilder();
        for (char c2 : str.toCharArray()) {
            z = false;
            if (!z) {
                if (c2 == '\\') {
                    z = true;
                }
                if (!z3 && c2 == '\'') {
                    z2 = !z2;
                }
                if (!z2 && c2 == '\"') {
                    z3 = !z3;
                }
            }
            if (c2 != c || z2 || z3 || z2) {
                sb.append(c2);
            } else {
                arrayList.add(sb.toString());
                sb.setLength(0);
            }
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
            sb.setLength(0);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: p */
    public static int m1411p(String str) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            char charAt = str.charAt(i2);
            if (charAt == '(') {
                i++;
            } else if (charAt == ')') {
                i--;
            }
        }
        return i;
    }

    /* renamed from: g */
    public static int m1426g(String str, int i) {
        if (str.charAt(i) != '(') {
            AbstractC0789l.m682b("getBracketEnd: Did not start on a bracket");
            return -1;
        } else if (i + 1 >= str.length()) {
            return -1;
        } else {
            int i2 = 1;
            for (int i3 = i + 1; i3 < str.length(); i3++) {
                char charAt = str.charAt(i3);
                if (charAt == '(') {
                    i2++;
                } else if (charAt == ')') {
                    i2--;
                }
                if (i2 == 0) {
                    return i3;
                }
            }
            return -1;
        }
    }

    /* renamed from: a */
    public static ArrayList m1484a(String str, String str2, boolean z) {
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        char charAt = str2.charAt(0);
        int length = str2.length();
        int i2 = 0;
        while (i2 < str.length()) {
            char charAt2 = str.charAt(i2);
            if (charAt2 == '(') {
                i++;
            } else if (charAt2 == ')') {
                i--;
            }
            if (i == 0) {
                boolean z2 = false;
                if (charAt == charAt2 && (length == 1 || str.indexOf(str2, i2) == i2)) {
                    z2 = true;
                }
                if (z2 && (!z || (!m1422h(str, i2 - 1) && !m1422h(str, i2 + str2.length())))) {
                    arrayList.add(stringBuffer.toString());
                    stringBuffer = new StringBuffer();
                    i2 += str2.length() - 1;
                    i2++;
                }
            }
            stringBuffer.append(charAt2);
            i2++;
        }
        arrayList.add(stringBuffer.toString());
        new StringBuffer();
        return arrayList;
    }

    /* renamed from: h */
    public static boolean m1422h(String str, int i) {
        if (i < 0 || i >= str.length()) {
            return false;
        }
        char charAt = str.charAt(i);
        return Character.isLetter(charAt) || Character.isDigit(charAt);
    }

    /* renamed from: q */
    public static boolean m1410q(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!(Character.isDigit(charAt) || charAt == '.' || (charAt == '-' && i == 0))) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m1418j(float f, float f2) {
        return m1459c(f - f2) < 1.0E-7f;
    }

    /* renamed from: b */
    public static boolean m1478b(double d, double d2) {
        return m1526a(d - d2) < 1.0000000116860974E-7d;
    }

    /* renamed from: d */
    public static final boolean m1442d(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* renamed from: a */
    public static final boolean m1491a(Integer num, Integer num2) {
        if (num == null) {
            return num2 == null;
        }
        return num.equals(num2);
    }
}
