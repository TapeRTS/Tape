package com.corrodinggames.rts.gameFramework;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.file.C0670a;
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
import java.util.Locale;
import java.util.Random;
import java.util.UUID;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f.class */
public final class CommonUtils {

    /* renamed from: a */
    static final Random f4962a = new Random();

    /* renamed from: b */
    static final Random f4963b = new Random();

    /* renamed from: c */
    public static final PointF f4964c = new PointF();

    /* renamed from: j */
    private static final byte[] f4965j = new byte[1001];

    /* renamed from: d */
    static final PointF f4945d;

    /* renamed from: e */
    static final PointF f4946e;

    /* renamed from: f */
    static final PointF f4947f;

    /* renamed from: g */
    static final PointF f4948g;

    /* renamed from: h */
    static final PointF f4949h;

    /* renamed from: k */
    private static final char[] f4951k;

    /* renamed from: l */
    private static final float[] f4952l;

    /* renamed from: m */
    private static final float[] f4953m;

    /* renamed from: n */
    private static final float[] f4954n;

    /* renamed from: o */
    private static final float[] f4955o;

    /* renamed from: p */
    private static final float[] f4956p;

    /* renamed from: q */
    private static final float[] f4957q;

    /* renamed from: r */
    private static final float[] f4958r;

    /* renamed from: s */
    private static final float[] f4959s;

    /* renamed from: i */
    static int f4950i;

    /* renamed from: t */
    private static final float[] f4960t;

    /* renamed from: u */
    private static final float[] f4961u;

    static {
        for (int i = 0; i < f4965j.length; i++) {
            f4965j[i] = (byte) StrictMath.round(m1746a(i));
        }
        f4945d = new PointF();
        f4946e = new PointF();
        f4947f = new PointF();
        f4948g = new PointF();
        f4949h = new PointF();
        f4951k = new char[36];
        for (int i2 = 0; i2 < 10; i2++) {
            f4951k[i2] = (char) (48 + i2);
        }
        for (int i3 = 10; i3 < 36; i3++) {
            f4951k[i3] = (char) ((97 + i3) - 10);
        }
        f4952l = new float[1025];
        f4953m = new float[1025];
        f4954n = new float[1025];
        f4955o = new float[1025];
        f4956p = new float[1025];
        f4957q = new float[1025];
        f4958r = new float[1025];
        f4959s = new float[1025];
        for (int i4 = 0; i4 <= 1024; i4++) {
            f4952l[i4] = (float) ((StrictMath.atan(i4 / 1024.0f) * 3.1415927410125732d) / 3.141592653589793d);
            f4953m[i4] = 1.5707964f - f4952l[i4];
            f4954n[i4] = -f4952l[i4];
            f4955o[i4] = f4952l[i4] - 1.5707964f;
            f4956p[i4] = 3.1415927f - f4952l[i4];
            f4957q[i4] = f4952l[i4] + 1.5707964f;
            f4958r[i4] = f4952l[i4] - 3.1415927f;
            f4959s[i4] = (-1.5707964f) - f4952l[i4];
        }
        f4950i = 0;
        f4960t = new float[4096];
        f4961u = new float[4096];
        for (int i5 = 0; i5 < 4096; i5++) {
            f4960t[i5] = (float) StrictMath.sin(((i5 + 0.5f) / 4096.0f) * 6.2831855f);
            f4961u[i5] = (float) StrictMath.cos(((i5 + 0.5f) / 4096.0f) * 6.2831855f);
        }
    }

    /* renamed from: a */
    public static final void m1750a() {
        f4963b.setSeed(0L);
    }

    /* renamed from: a */
    public static final int m1723a(Unit unit, int i, int i2) {
        return m1722a((GameObject) unit, i, i2, 0);
    }

    /* renamed from: a */
    public static final float m1724a(Unit unit, float f, float f2, int i) {
        if (unit == null) {
            return m1735a((int) (f * 1000.0f), (int) (f2 * 1000.0f), i) * 0.001f;
        }
        return m1722a((GameObject) unit, (int) (f * 1000.0f), (int) (f2 * 1000.0f), i) * 0.001f;
    }

    /* renamed from: b */
    public static final float m1683b(Unit unit, float f, float f2, int i) {
        return m1722a((GameObject) unit, (int) (f * 1000.0f), (int) (f2 * 1000.0f), i) * 0.001f;
    }

    /* renamed from: a */
    public static final int m1722a(GameObject gameObject, int min, int max, int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (min >= max) {
            if (min > max) {
                GameEngine.log("min>max");
            }
            return min;
        }
        int i2 = gameEngine.frameNumber + 1;
        int i3 = (int) (((int) (((int) (((int) (((int) (gameEngine.globalSeed + (gameObject.GameObjectID * 1313))) + (gameObject.x * 13.0f))) + (gameObject.y * 13.0f))) + (gameObject.x * 130.0f))) + (gameObject.y * 130.0f));
        if (gameObject instanceof Unit) {
            int i4 = ((Unit) gameObject).f1530bu;
            i3 = i3 + (i4 * 13131) + (i4 * i2);
        }
        int i5 = ((((int) ((i3 + ((i * 133) * max)) + ((i * gameObject.GameObjectID) + i))) + (i * (i2 * 1313))) + ((i2 * 13) + (i2 % 10))) % (max - min);
        if (i5 < 0) {
            i5 = -i5;
        }
        return i5 + min;
    }

    /* renamed from: a */
    public static final float m1741a(float f, float f2, int i) {
        return m1735a((int) (f * 100.0f), (int) (f2 * 100.0f), i) / 100.0f;
    }

    /* renamed from: b */
    public static final float m1690b(float f, float f2, int i) {
        return m1735a((int) (f * 1000.0f), (int) (f2 * 1000.0f), i) / 1000.0f;
    }

    /* renamed from: a */
    public static final int m1735a(int min, int max, int i) {
        GameEngine game = GameEngine.getInstance();
        if (min >= max) {
            if (min > max) {
                GameEngine.log("min>max");
            }
            return min;
        }
        int i2 = max - min;
        int i3 = ((((game.globalSeed + ((i * 133333333) * i2)) + (i * 13131313)) + (i * (game.frameNumber * 13131313))) + ((game.frameNumber * 1313131313) + (game.frameNumber % 10))) % i2;
        if (i3 < 0) {
            i3 = -i3;
        }
        int range = i3 + min;
        if (range < min || range > max) {
            GameEngine.log("notRandInt number not in range: " + range + " min:" + min + " max:" + max);
        }
        return range;
    }

    /* renamed from: a */
    public static String SimpleDateFormatStr(String str) {
        return new SimpleDateFormat(str).format(Calendar.getInstance().getTime());
    }

    /* renamed from: a */
    public static final void m1719a(InputStream inputStream, OutputStream outputStream) {
        byte[] bArr = new byte[8192];
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
    public static final String m1720a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        byte[] bArr = new byte[8192];
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
    public static final float m1746a(float f) {
        return (float) StrictMath.sqrt(f);
    }

    /* renamed from: a */
    public static final int m1738a(int i) {
        if (i > 1000 || i < 0) {
            return StrictMath.round(m1746a(i));
        }
        return f4965j[i];
    }

    /* renamed from: a */
    public static final float toZero(float f, float f2) {
        if (f > f2) {
            return f - f2;
        }
        if (f < (-f2)) {
            return f + f2;
        }
        return 0.0f;
    }

    /* renamed from: a */
    public static final float m1744a(float f, float f2, float f3) {
        if (f > f2 + f3) {
            return f - f3;
        }
        if (f < f2 - f3) {
            return f + f3;
        }
        return f2;
    }

    /* renamed from: b */
    public static final float m1693b(float f, float f2) {
        if (f > f2) {
            return f2;
        }
        if (f < (-f2)) {
            return -f2;
        }
        return f;
    }

    /* renamed from: b */
    public static final float m1692b(float f, float f2, float f3) {
        if (f > f3) {
            return f3;
        }
        if (f < f2) {
            return f2;
        }
        return f;
    }

    /* renamed from: b */
    public static final int m1687b(int i, int i2, int i3) {
        if (i > i3) {
            return i3;
        }
        if (i < i2) {
            return i2;
        }
        return i;
    }

    /* renamed from: a */
    public static final void m1742a(float f, float f2, float f3, PointF pointF) {
        float sin = sin(f3);
        float cos = cos(f3);
        pointF.x -= f;
        pointF.y -= f2;
        float f4 = (pointF.x * cos) - (pointF.y * sin);
        float f5 = (pointF.x * sin) + (pointF.y * cos);
        pointF.x = f4 + f;
        pointF.y = f5 + f2;
    }

    /* renamed from: a */
    public static final float distanceSq(float f, float f2, float f3, float f4) {
        return ((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4));
    }

    /* renamed from: b */
    public static final float m1691b(float f, float f2, float f3, float f4) {
        return (float) StrictMath.sqrt(((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4)));
    }

    /* renamed from: c */
    public static final int m1669c(float f, float f2, float f3, float f4) {
        return m1738a((int) (((f - f3) * (f - f3)) + ((f2 - f4) * (f2 - f4))));
    }

    /* renamed from: a */
    public static final int m1734a(int i, int i2, int i3, int i4) {
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
    public static final float m1739a(float f, boolean z) {
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
    public static final float m1670c(float f, float f2, float f3) {
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
    public static final float m1659d(float f, float f2, float f3, float f4) {
        return toArc(m1628i(f4 - f2, f3 - f));
    }

    /* renamed from: a */
    public static final boolean m1731a(PointF pointF, PointF pointF2, PointF pointF3, PointF pointF4) {
        float f = ((pointF4.y - pointF3.y) * (pointF2.x - pointF.x)) - ((pointF4.x - pointF3.x) * (pointF2.y - pointF.y));
        float f2 = ((pointF4.x - pointF3.x) * (pointF.y - pointF3.y)) - ((pointF4.y - pointF3.y) * (pointF.x - pointF3.x));
        float f3 = ((pointF2.x - pointF.x) * (pointF.y - pointF3.y)) - ((pointF2.y - pointF.y) * (pointF.x - pointF3.x));
        if (f == 0.0f) {
            if (f2 != 0.0f || f3 == 0.0f) {
                return false;
            }
            return false;
        }
        float f4 = f2 / f;
        float f5 = f3 / f;
        return f4 >= 0.0f && f4 <= 1.0f && f5 >= 0.0f && f5 <= 1.0f;
    }

    /* renamed from: c */
    public static final float rnd(float f, float f2) {
        return (f4962a.nextFloat() * (f2 - f)) + f;
    }

    /* renamed from: d */
    public static final float m1661d(float f, float f2) {
        return (f4962a.nextFloat() * (f2 - f)) + f;
    }

    /* renamed from: b */
    public static final int realRand(int i) {
        if (i == 0) {
            return 0;
        }
        return f4962a.nextInt(i);
    }

    /* renamed from: a */
    public static int m1737a(int i, int i2) {
        int i3;
        if (i2 == i) {
            i3 = 0;
        } else {
            i3 = f4962a.nextInt((i2 - i) + 1);
        }
        return i + i3;
    }

    /* renamed from: a */
    public static final void m1730a(Rect rect) {
        if (rect.right < rect.left) {
            int i = rect.right;
            rect.right = rect.left;
            rect.left = i;
        }
        if (rect.bottom < rect.top) {
            int i2 = rect.bottom;
            rect.bottom = rect.top;
            rect.top = i2;
        }
    }

    /* renamed from: a */
    public static final void m1727a(RectF rectF) {
        if (rectF.right < rectF.left) {
            float f = rectF.right;
            rectF.right = rectF.left;
            rectF.left = f;
        }
        if (rectF.bottom < rectF.top) {
            float f2 = rectF.bottom;
            rectF.bottom = rectF.top;
            rectF.top = f2;
        }
    }

    /* renamed from: d */
    public static final PointF m1660d(float f, float f2, float f3) {
        f4949h.set(f, f2 - f3);
        return f4949h;
    }

    /* renamed from: b */
    public static final float toArc(float degree) {
        return degree * 57.29578f;
    }

    /* renamed from: e */
    public static final float pow(float f, float f2) {
        return (float) StrictMath.pow(f, f2);
    }

    /* renamed from: a */
    public static final double absd(double d) {
        return d < 0.0d ? -d : d;
    }

    /* renamed from: c */
    public static final float absf(float f) {
        return f < 0.0f ? -f : f;
    }

    /* renamed from: c */
    public static final int absi(int i) {
        return i < 0 ? -i : i;
    }

    /* renamed from: b */
    public static final int maxi(int i, int i2) {
        return i > i2 ? i : i2;
    }

    /* renamed from: c */
    public static final int mini(int i, int i2) {
        return i < i2 ? i : i2;
    }

    /* renamed from: f */
    public static final float maxf(float f, float f2) {
        return f > f2 ? f : f2;
    }

    /* renamed from: g */
    public static final float minf(float f, float f2) {
        return f < f2 ? f : f2;
    }

    /* renamed from: h */
    public static final boolean roughlyEqual(float f, float f2) {
        return absf(f - f2) < 0.05f;
    }

    /* renamed from: a */
    public static final double mind(double d, double d2) {
        return d < d2 ? d : d2;
    }

    /* renamed from: e */
    public static boolean m1651e(float f, float f2, float f3) {
        if (absf(absf(f) - absf(f2)) < f3) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public static float ceil(float f) {
        return (int) (f + 0.5f);
    }

    /* renamed from: e */
    public static final int floor(float f) {
        if (f > 0.0f) {
            return (int) f;
        }
        if (f >= 0.0f) {
            return 0;
        }
        return ((int) f) - 1;
    }

    /* renamed from: a */
    public static void m1726a(RectF rectF, float f) {
        rectF.left -= f;
        rectF.top -= f;
        rectF.right += f;
        rectF.bottom += f;
    }

    /* renamed from: a */
    public static void m1729a(Rect rect, float f) {
        rect.left = (int) (rect.left - f);
        rect.top = (int) (rect.top - f);
        rect.right = (int) (rect.right + f);
        rect.bottom = (int) (rect.bottom + f);
    }

    /* renamed from: b */
    public static void m1684b(Rect rect, float f) {
        rect.left = (int) (rect.left - f);
        rect.top = (int) (rect.top - f);
        rect.right = (int) (rect.right + (f * 2.0f));
        rect.bottom = (int) (rect.bottom + (f * 2.0f));
    }

    /* renamed from: d */
    public static String m1658d(int i) {
        StringBuilder sb = new StringBuilder();
        for (int i2 = 0; i2 < i; i2++) {
            sb.append(f4951k[f4962a.nextInt(f4951k.length)]);
        }
        return sb.toString();
    }

    /* renamed from: b */
    public static String m1698b() {
        return UUID.randomUUID().toString();
    }

    /* renamed from: a */
    public static String booleanToString(boolean z) {
        return z ? "true" : "false";
    }

    /* renamed from: b */
    public static String m1697b(double d) {
        if (d == ((int) d)) {
            return VariableScope.nullOrMissingString + ((int) d);
        }
        return VariableScope.nullOrMissingString + d;
    }

    /* renamed from: f */
    public static String m1645f(float f) {
        return m1740a(f, 2);
    }

    /* renamed from: c */
    public static String m1673c(double d) {
        if (d == ((int) d)) {
            return VariableScope.nullOrMissingString + ((int) d);
        }
        return m1695b(d, 2);
    }

    /* renamed from: a */
    public static String m1740a(float f, int i) {
        if (f == ((int) f)) {
            return VariableScope.nullOrMissingString + ((int) f);
        }
        return m1695b(f, i);
    }

    /* renamed from: a */
    public static String m1747a(double d, int i) {
        if (d == ((int) d)) {
            return VariableScope.nullOrMissingString + ((int) d);
        }
        return m1695b(d, i);
    }

    /* renamed from: g */
    public static String m1638g(float f) {
        if (f == ((int) f)) {
            return VariableScope.nullOrMissingString + ((int) f) + "s";
        }
        return m1695b(f, 1);
    }

    /* renamed from: b */
    public static String m1695b(double d, int i) {
        String str = VariableScope.nullOrMissingString + d;
        int indexOf = str.indexOf(".");
        if (indexOf == -1) {
            return str;
        }
        if (str.indexOf("E") != -1) {
            return String.format("%." + i + "f", Double.valueOf(d));
        }
        int i2 = indexOf + i + 1;
        if (i2 > str.length()) {
            i2 = str.length();
        }
        return str.substring(0, i2);
    }

    /* renamed from: a */
    public static String m1711a(String str, int i) {
        if (str == null) {
            return null;
        }
        if (str.length() < i) {
            return str;
        }
        return str.substring(0, Math.min(str.length(), i));
    }

    /* renamed from: b */
    public static String m1678b(String str, int i) {
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
    public static String m1680b(String str) {
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
    public static String m1666c(String str) {
        return m1711a(getEncode_Zra(getSHA256Byte(str)), 14);
    }

    /* renamed from: d */
    public static String m1657d(String str) {
        return m1711a(getEncode_Zra(getSHA256Byte(str)), 4);
    }

    /* renamed from: c */
    public static String m1664c(String str, int i) {
        String encode_Zra = getEncode_Zra(getSHA256Byte(str));
        for (int i2 = 0; i2 < i; i2++) {
            encode_Zra = getEncode_Zra(getSHA256Byte(encode_Zra));
        }
        return encode_Zra;
    }

    /* renamed from: e */
    public static String getEncode_Zra_SHA256(String str) {
        return getEncode_Zra(getSHA256Byte(str));
    }

    /* renamed from: f */
    static byte[] getSHA256Byte(String str) {
        try {
            MessageDigest messageDigest = MessageDigest.getInstance("SHA-256");
            messageDigest.reset();
            return messageDigest.digest(str.getBytes());
        } catch (NoSuchAlgorithmException e) {
            throw new RuntimeException(e);
        }
    }

    // 字节数组长度*2 +"X" 补零
    /* renamed from: a */
    static String getEncode_Zra(byte[] bArr) {
        return String.format("%0" + (bArr.length * 2) + "X", new BigInteger(1, bArr));
    }

    /* renamed from: c */
    public static int getAvailableProcessorsCount() {
        int availableProcessors;
        int i = 1;
        try {
            File file = new File("/sys/devices/system/cpu/");
            if (file.exists()) {
                i = file.listFiles(new C0739a()).length;
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

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.f$a */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f$a.class */
    public class C0739a implements FileFilter {
        C0739a() {
        }

        @Override // java.io.FileFilter
        public boolean accept(File file) {
            if (file != null && Pattern.matches("cpu[0-9]+", file.getName())) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m1700a(byte[] bArr, byte[] bArr2) {
        System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
    }

    /* renamed from: f */
    public static float m1643f(float f, float f2, float f3) {
        return f + ((f2 - f) * f3);
    }

    /* renamed from: a */
    public static int m1736a(int i, int i2, float f) {
        int m4734a = Color.m4734a(i);
        int m4730b = Color.m4730b(i);
        int m4729c = Color.m4729c(i);
        int m4728d = Color.m4728d(i);
        return Color.argb((int) m1643f(m4734a, Color.m4734a(i2), f), (int) m1643f(m4730b, Color.m4730b(i2), f), (int) m1643f(m4729c, Color.m4729c(i2), f), (int) m1643f(m4728d, Color.m4728d(i2), f));
    }

    /* renamed from: d */
    public static String m1655d(String str, int i) {
        String str2 = VariableScope.nullOrMissingString;
        for (int i2 = 0; i2 <= i; i2++) {
            str2 = str2 + str;
        }
        return str2;
    }

    /* renamed from: e */
    public static String m1647e(String str, int i) {
        for (int length = str.length(); length < i; length++) {
            str = str + " ";
        }
        return str;
    }

    /* renamed from: a */
    public static String m1710a(String str, int i, String str2) {
        for (int length = str.length(); length < i; length++) {
            str = str2 + str;
        }
        return str;
    }

    /* renamed from: f */
    public static String m1640f(String str, int i) {
        return String.format("%1$-" + i + "s", str);
    }

    /* renamed from: a */
    public static String m1717a(Class cls, int i) {
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
    public static String m1650e(int i) {
        String m1717a = m1717a(R.drawable.class, i);
        if (m1717a != null) {
            return C0670a.m2176a("res/drawable", m1717a);
        }
        String m1717a2 = m1717a(R.raw.class, i);
        if (m1717a2 != null) {
            return C0670a.m2176a("res/raw", m1717a2);
        }
        return null;
    }

    /* renamed from: f */
    public static final String m1642f(int i) {
        if (-1000 < i && i < 1000) {
            return i + " B";
        }
        int i2 = 0;
        while (i2 < "kMGTPE".length() && (i <= -999950 || i >= 999950)) {
            i /= 1000;
            i2++;
        }
        return String.format("%.1f %cB", Double.valueOf(i / 1000.0d), Character.valueOf("kMGTPE".charAt(i2)));
    }

    /* renamed from: g */
    public static final String m1636g(int i) {
        return String.format("#%06X", Integer.valueOf(16777215 & i));
    }

    /* renamed from: g */
    public static final String m1635g(String str) {
        if (str == null) {
            return null;
        }
        return new File(str).getName().replaceFirst("[.][^.]+$", VariableScope.nullOrMissingString);
    }

    /* renamed from: h */
    public static final String m1631h(String str) {
        if (str.contains("\\")) {
            str = str.replace('\\', '/');
        }
        return new File(str).getParent();
    }

    /* renamed from: a */
    public static final boolean m1728a(Rect rect, RectF rectF) {
        return ((float) rect.left) < rectF.right && rectF.left < ((float) rect.right) && ((float) rect.top) < rectF.bottom && rectF.top < ((float) rect.bottom);
    }

    /* renamed from: a */
    public static final boolean m1725a(RectF rectF, RectF rectF2) {
        return rectF.left < rectF2.right && rectF2.left < rectF.right && rectF.top < rectF2.bottom && rectF2.top < rectF.bottom;
    }

    /* renamed from: b */
    public static final int m1686b(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: a */
    public static final long m1732a(long j, long j2) {
        return (j2 - j) / 1000000;
    }

    /* renamed from: a */
    public static final int m1712a(String str, char c) {
        int i = 0;
        for (int i2 = 0; i2 < str.length(); i2++) {
            if (str.charAt(i2) == c) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: i */
    public static final String m1627i(String str) {
        return str.replace("&", "&amp;").replace("<", "&lt;").replace(">", "&gt;").replace("${", "$ {");
    }

    /* renamed from: a */
    public static String m1721a(File file) {
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

    /* renamed from: b */
    public static String m1682b(InputStream inputStream) {
        int read;
        try {
            try {
                byte[] bArr = new byte[inputStream.available()];
                int length = bArr.length;
                int i = 0;
                while (i < length && (read = inputStream.read(bArr, i, length - i)) != -1) {
                    i += read;
                }
                String str = new String(bArr, Charset.forName("UTF-8"));
                inputStream.close();
                return str;
            } catch (Throwable th) {
                inputStream.close();
                throw th;
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }

    /* renamed from: a */
    public static final String m1716a(Exception exc) {
        StringWriter stringWriter = new StringWriter();
        exc.printStackTrace(new PrintWriter(stringWriter));
        return stringWriter.toString();
    }

    /* renamed from: b */
    public static final String m1681b(Exception exc) {
        return m1715a(exc, false);
    }

    /* renamed from: a */
    public static final String m1715a(Exception exc, boolean z) {
        Throwable th;
        String message = exc.getMessage();
        if (message == null) {
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
        Throwable th2 = exc;
        while (true) {
            th = th2;
            if (th != null) {
                Throwable cause = th.getCause();
                if (cause == null || cause == exc || cause == th) {
                    break;
                }
                th2 = cause;
            } else {
                break;
            }
        }
        if (th != null && th != exc) {
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
    public static String m1625j(String str) {
        if (str.endsWith("\n")) {
            return str.substring(0, str.length() - 1);
        }
        return str;
    }

    /* renamed from: a */
    public static String m1708a(String str, String str2) {
        if (str.endsWith(str2)) {
            return str.substring(0, str.length() - str2.length());
        }
        return str;
    }

    /* renamed from: k */
    public static String m1624k(String str) {
        return new File(str).getName();
    }

    /* renamed from: b */
    public static String m1677b(String str, String str2) {
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
    public static String m1718a(CharSequence charSequence, Iterable iterable) {
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
    public static Integer m1623l(String str) {
        try {
            return Integer.valueOf(str);
        } catch (NumberFormatException e) {
            GameEngine.PrintLOG(e.toString());
            return null;
        }
    }

    /* renamed from: m */
    public static Long m1622m(String str) {
        try {
            return Long.valueOf(str);
        } catch (NumberFormatException e) {
            GameEngine.PrintLOG(e.toString());
            return null;
        }
    }

    /* renamed from: n */
    public static boolean m1621n(String str) {
        int length = str.length();
        int i = 0;
        while (true) {
            int i2 = i;
            if (i2 < length) {
                int codePointAt = str.codePointAt(i2);
                if (codePointAt > 128) {
                    return true;
                }
                i = i2 + Character.charCount(codePointAt);
            } else {
                return false;
            }
        }
    }

    /* renamed from: a */
    public static String m1733a(long j) {
        int[] m1685b;
        String str;
        if (m1685b(j)[0] == 0) {
            str = m1710a(VariableScope.nullOrMissingString + m1685b[1], 2, "0") + ":" + m1710a(VariableScope.nullOrMissingString + m1685b[2], 2, "0");
        } else {
            str = m1710a(VariableScope.nullOrMissingString + m1685b[0], 2, "0") + ":" + m1710a(VariableScope.nullOrMissingString + m1685b[1], 2, "0") + ":" + m1710a(VariableScope.nullOrMissingString + m1685b[2], 2, "0");
        }
        return str;
    }

    /* renamed from: b */
    public static int[] m1685b(long j) {
        int i = ((int) j) / 3600;
        int i2 = ((int) j) - (i * 3600);
        int i3 = i2 / 60;
        return new int[]{i, i3, i2 - (i3 * 60)};
    }

    /* renamed from: i */
    public static final float m1628i(float f, float f2) {
        try {
            if (f2 >= 0.0f) {
                if (f >= 0.0f) {
                    if (f2 >= f) {
                        return f4952l[(int) (((1024.0f * f) / f2) + 0.5d)];
                    }
                    return f4953m[(int) (((1024.0f * f2) / f) + 0.5d)];
                } else if (f2 >= (-f)) {
                    return f4954n[(int) ((((-1024.0f) * f) / f2) + 0.5d)];
                } else {
                    return f4955o[(int) ((((-1024.0f) * f2) / f) + 0.5d)];
                }
            } else if (f >= 0.0f) {
                if ((-f2) >= f) {
                    return f4956p[(int) ((((-1024.0f) * f) / f2) + 0.5d)];
                }
                return f4957q[(int) ((((-1024.0f) * f2) / f) + 0.5d)];
            } else if (f2 <= f) {
                return f4958r[(int) (((1024.0f * f) / f2) + 0.5d)];
            } else {
                return f4959s[(int) (((1024.0f * f2) / f) + 0.5d)];
            }
        } catch (ArrayIndexOutOfBoundsException e) {
            if (f4950i < 100) {
                GameEngine.PrintLOG("atan2 slow fallback for y:" + f + " x:" + f2);
                f4950i++;
            }
            return (float) StrictMath.atan2(f, f2);
        }
    }

    /* renamed from: h */
    public static final float sin(float f) {
        return f4960t[((int) (f * 11.377778f)) & 4095];
    }

    /* renamed from: i */
    public static final float cos(float f) {
        return f4961u[((int) (f * 11.377778f)) & 4095];
    }

    /* renamed from: o */
    public static String m1620o(String str) {
        if (str.contains("&")) {
            str = str.replace("&lt;", "<").replace("&gt;", ">").replace("&apos;", "'").replace("&quot;", "\"").replace("&amp;", "&");
        }
        return str;
    }

    /* renamed from: p */
    public static String m1619p(String str) {
        if (str == null || str.length() < 2) {
            return null;
        }
        char charAt = str.charAt(0);
        if ((charAt != '\"' && charAt != '\'') || str.charAt(str.length() - 1) != charAt) {
            return null;
        }
        boolean z = false;
        StringBuilder sb = new StringBuilder();
        for (int i = 1; i < str.length() - 1; i++) {
            char charAt2 = str.charAt(i);
            boolean z2 = z;
            z = false;
            if (!z2) {
                if (charAt2 == '\\') {
                    z = true;
                } else if (charAt2 == charAt) {
                    return null;
                }
            }
            sb.append(charAt2);
        }
        return sb.toString();
    }

    /* renamed from: q */
    public static String m1618q(String str) {
        char[] charArray;
        boolean z = false;
        StringBuilder sb = new StringBuilder();
        for (char c : str.toCharArray()) {
            boolean z2 = z;
            z = false;
            if (!z2 && c == '\\') {
                z = true;
            } else {
                sb.append(c);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public static final String m1706a(String str, String str2, String str3) {
        if (!m1663c(str, str2)) {
            return str;
        }
        return str.replace(str2, str3);
    }

    /* renamed from: c */
    public static final boolean m1663c(String str, String str2) {
        return str.indexOf(str2) > -1;
    }

    /* renamed from: b */
    public static final boolean m1679b(String str, char c) {
        return str.indexOf(c) > -1;
    }

    /* renamed from: c */
    public static String[] m1665c(String str, char c) {
        int i;
        if (str.length() == 0) {
            return new String[]{VariableScope.nullOrMissingString};
        }
        int i2 = 0;
        int i3 = 0;
        while (true) {
            i = i3;
            int indexOf = str.indexOf(c, i);
            if (indexOf == -1) {
                break;
            }
            i2++;
            i3 = indexOf + 1;
        }
        if (i2 == 0) {
            return new String[]{str};
        }
        int length = str.length();
        if (i == length) {
            if (i2 == length) {
                return new String[0];
            }
            do {
                i--;
            } while (str.charAt(i - 1) == c);
            i2 -= str.length() - i;
            length = i;
        }
        String[] strArr = new String[i2 + 1];
        int i4 = 0;
        for (int i5 = 0; i5 != i2; i5++) {
            int indexOf2 = str.indexOf(c, i4);
            strArr[i5] = str.substring(i4, indexOf2);
            i4 = indexOf2 + 1;
        }
        strArr[i2] = str.substring(i4, length);
        return strArr;
    }

    /* renamed from: a */
    public static String m1699a(String[] strArr) {
        StringBuffer stringBuffer = new StringBuffer();
        boolean z = true;
        int length = strArr.length;
        for (int i = 0; i < length; i++) {
            String str = strArr[i];
            if (z) {
                z = false;
            } else {
                stringBuffer.append(",");
            }
            if (str.contains("\\")) {
                str = str.replace("\\", "\\\\");
            }
            if (str.contains(",")) {
                str = str.replace(",", "\\,");
            }
            stringBuffer.append(str);
        }
        return stringBuffer.toString();
    }

    /* renamed from: r */
    public static String[] m1617r(String str) {
        return m1656d(str, ',');
    }

    /* renamed from: d */
    public static String[] m1656d(String str, char c) {
        char[] charArray;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        StringBuilder sb = new StringBuilder();
        for (char c2 : str.toCharArray()) {
            boolean z2 = z;
            z = false;
            if (!z2) {
                if (c2 == '\\') {
                    z = true;
                } else if (c2 == c) {
                    arrayList.add(sb.toString());
                    sb.setLength(0);
                }
            }
            sb.append(c2);
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
            sb.setLength(0);
        }
        if (arrayList.size() == 0) {
            arrayList.add(VariableScope.nullOrMissingString);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: e */
    public static String[] m1648e(String str, char c) {
        char[] charArray;
        ArrayList arrayList = new ArrayList();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        StringBuilder sb = new StringBuilder();
        for (char c2 : str.toCharArray()) {
            boolean z4 = z;
            z = false;
            if (!z4) {
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
            if (c2 == c && !z2 && !z3 && !z2) {
                arrayList.add(sb.toString());
                sb.setLength(0);
            } else {
                sb.append(c2);
            }
        }
        if (sb.length() != 0) {
            arrayList.add(sb.toString());
            sb.setLength(0);
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: s */
    public static int m1616s(String str) {
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

    /* renamed from: t */
    public static int m1615t(String str) {
        char[] charArray;
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        for (char c : str.toCharArray()) {
            boolean z4 = z;
            z = false;
            if (!z4) {
                if (c == '\\') {
                    z = true;
                }
                if (!z3 && c == '\'') {
                    z2 = !z2;
                }
                if (!z2 && c == '\"') {
                    z3 = !z3;
                }
            }
            if (!z2 && !z3) {
                if (c == '(') {
                    i++;
                } else if (c == ')') {
                    i--;
                }
            }
        }
        return i;
    }

    /* renamed from: g */
    public static int m1634g(String str, int i) {
        if (str.charAt(i) != '(') {
            GameEngine.log("getBracketEnd: Did not start on a bracket");
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
    public static String[] m1704a(String str, String str2, boolean z) {
        return !str.contains(str2) ? new String[]{str} : (String[]) m1675b(str, str2, z).toArray(new String[0]);
    }

    /* renamed from: b */
    public static ArrayList m1675b(String str, String str2, boolean z) {
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        char charAt = str2.charAt(0);
        int length = str2.length();
        int length2 = str.length();
        int i2 = 0;
        while (i2 < length2) {
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
                if (z2 && (!z || (!m1630h(str, i2 - 1) && !m1630h(str, i2 + str2.length())))) {
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
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList m1703a(String str, String str2, boolean z, boolean z2) {
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        char charAt = str2.charAt(0);
        int length = str2.length();
        int length2 = str.length();
        boolean z3 = false;
        boolean z4 = false;
        boolean z5 = false;
        String str3 = str;
        if (z2) {
            str3 = str.toLowerCase(Locale.ROOT);
        }
        int i2 = 0;
        while (i2 < length2) {
            char charAt2 = str3.charAt(i2);
            char charAt3 = str.charAt(i2);
            boolean z6 = z3;
            z3 = false;
            if (!z6) {
                if (charAt2 == '\\') {
                    z3 = true;
                }
                if (!z5 && charAt2 == '\'') {
                    z4 = !z4;
                }
                if (!z4 && charAt2 == '\"') {
                    z5 = !z5;
                }
            }
            if (!(z4 || z5)) {
                if (charAt2 == '(') {
                    i++;
                } else if (charAt2 == ')') {
                    i--;
                }
                if (i == 0 && charAt == charAt2 && ((length == 1 || str3.indexOf(str2, i2) == i2) && (!z || (!m1630h(str, i2 - 1) && !m1630h(str, i2 + str2.length()))))) {
                    arrayList.add(stringBuffer.toString());
                    stringBuffer.setLength(0);
                    i2 += str2.length() - 1;
                    i2++;
                }
            }
            stringBuffer.append(charAt3);
            i2++;
        }
        arrayList.add(stringBuffer.toString());
        return arrayList;
    }

    /* renamed from: a */
    public static ArrayList m1705a(String str, String str2, String str3, boolean z) {
        int i = 0;
        StringBuffer stringBuffer = new StringBuffer();
        ArrayList arrayList = new ArrayList();
        char charAt = str2.charAt(0);
        char charAt2 = str3.charAt(0);
        int length = str2.length();
        int length2 = str3.length();
        int length3 = str.length();
        int i2 = 0;
        while (i2 < length3) {
            char charAt3 = str.charAt(i2);
            if (charAt3 == '(') {
                i++;
            } else if (charAt3 == ')') {
                i--;
            }
            if (i == 0) {
                if (charAt == charAt3 && ((length == 1 || str.indexOf(str2, i2) == i2) && (!z || (!m1630h(str, i2 - 1) && !m1630h(str, i2 + str2.length()))))) {
                    arrayList.add(stringBuffer.toString());
                    stringBuffer = new StringBuffer();
                    i2 += str2.length() - 1;
                } else if (charAt2 == charAt3 && ((length2 == 1 || str.indexOf(str3, i2) == i2) && (!z || (!m1630h(str, i2 - 1) && !m1630h(str, i2 + str3.length()))))) {
                    arrayList.add(stringBuffer.toString());
                    stringBuffer = new StringBuffer();
                    i2 += str3.length() - 1;
                }
                i2++;
            }
            stringBuffer.append(charAt3);
            i2++;
        }
        arrayList.add(stringBuffer.toString());
        return arrayList;
    }

    /* renamed from: d */
    public static int m1654d(String str, String str2) {
        return m1707a(str, str2, 0);
    }

    /* renamed from: a */
    public static int m1707a(String str, String str2, int i) {
        int i2 = 0;
        char charAt = str2.charAt(0);
        int length = str2.length();
        for (int i3 = i; i3 < str.length(); i3++) {
            char charAt2 = str.charAt(i3);
            if (charAt2 == '(') {
                i2++;
            } else if (charAt2 == ')') {
                i2--;
            }
            if (i2 == 0 && charAt == charAt2 && (length == 1 || str.indexOf(str2, i3) == i3)) {
                return i3;
            }
        }
        return -1;
    }

    /* renamed from: h */
    public static boolean m1630h(String str, int i) {
        if (i < 0 || i >= str.length()) {
            return false;
        }
        char charAt = str.charAt(i);
        return Character.isLetter(charAt) || Character.isDigit(charAt);
    }

    /* renamed from: u */
    public static boolean m1614u(String str) {
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isDigit(charAt) && charAt != '.' && (charAt != '-' || i != 0)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: v */
    public static boolean m1613v(String str) {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (!Character.isDigit(charAt) && (charAt != '-' || i != 0)) {
                if (!z && charAt == '.') {
                    z = true;
                } else {
                    return false;
                }
            }
        }
        return true;
    }

    /* renamed from: j */
    public static boolean m1626j(float f, float f2) {
        return absf(f - f2) < 1.0E-7f;
    }

    /* renamed from: b */
    public static boolean m1696b(double d, double d2) {
        return absd(d - d2) < 1.0000000116860974E-7d;
    }

    /* renamed from: e */
    public static final boolean m1646e(String str, String str2) {
        if (str == null) {
            return str2 == null;
        }
        return str.equals(str2);
    }

    /* renamed from: a */
    public static final boolean m1714a(Integer num, Integer num2) {
        if (num == null) {
            return num2 == null;
        }
        return num.equals(num2);
    }

    /* renamed from: w */
    public static final String m1612w(String str) {
        if (str == null) {
            return null;
        }
        if (str.length() < 1) {
            return str.toUpperCase();
        }
        return str.substring(0, 1).toUpperCase(Locale.ROOT) + str.substring(1).toLowerCase(Locale.ROOT);
    }

    /* renamed from: b */
    public static int m1676b(String str, String str2, String str3) {
        int indexOf = str.indexOf(str2);
        int indexOf2 = str.indexOf(str3);
        if (indexOf == -1) {
            return indexOf2;
        }
        if (indexOf2 != -1 && indexOf >= indexOf2) {
            return indexOf2;
        }
        return indexOf;
    }

    /* renamed from: a */
    public static int m1709a(String str, int i, String[] strArr) {
        int i2 = -1;
        for (String str2 : strArr) {
            int m1707a = m1707a(str, str2, i);
            if (m1707a != -1 && (i2 > m1707a || i2 == -1)) {
                i2 = m1707a;
            }
        }
        return i2;
    }

    /* renamed from: x */
    public static String m1611x(String str) {
        boolean z = false;
        for (int i = 0; i < str.length(); i++) {
            char charAt = str.charAt(i);
            if (charAt == '-') {
                z = !z;
            } else if (charAt != '+' && charAt != ' ') {
                if (z) {
                    return "-" + str.substring(i);
                }
                if (i == 0) {
                    return str;
                }
                return str.substring(i);
            }
        }
        return str;
    }

    /* renamed from: f */
    public static String[] m1639f(String str, String str2) {
        int indexOf = str.indexOf(str2);
        if (indexOf == -1) {
            return null;
        }
        return new String[]{str.substring(0, indexOf), str.substring(indexOf + str2.length())};
    }
}