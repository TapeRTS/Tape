package android.graphics;

import java.util.HashMap;
import java.util.Locale;

/* loaded from: game-lib.jar:android/graphics/Color.class */
public class Color {

    /* renamed from: a */
    private static final HashMap f156a = new HashMap();

    /* renamed from: a */
    public static int m7284a(int i) {
        return i >>> 24;
    }

    /* renamed from: b */
    public static int m7280b(int i) {
        return (i >> 16) & 255;
    }

    /* renamed from: c */
    public static int m7279c(int i) {
        return (i >> 8) & 255;
    }

    /* renamed from: d */
    public static int m7278d(int i) {
        return i & 255;
    }

    /* renamed from: a */
    public static int m7283a(int i, int i2, int i3) {
        return (-16777216) | (i << 16) | (i2 << 8) | i3;
    }

    /* renamed from: a */
    public static int argb(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* renamed from: a */
    public static int m7281a(String str) {
        if (str.charAt(0) == '#') {
            long parseLong = Long.parseLong(str.substring(1), 16);
            if (str.length() == 7) {
                parseLong |= -16777216;
            } else if (str.length() != 9) {
                throw new IllegalArgumentException("Unknown color");
            }
            return (int) parseLong;
        }
        Integer num = (Integer) f156a.get(str.toLowerCase(Locale.ROOT));
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("Unknown color");
    }

    static {
        f156a.put("black", -16777216);
        f156a.put("darkgray", -12303292);
        f156a.put("gray", -7829368);
        f156a.put("lightgray", -3355444);
        f156a.put("white", -1);
        f156a.put("red", -65536);
        f156a.put("green", -16711936);
        f156a.put("blue", -16776961);
        f156a.put("yellow", -256);
        f156a.put("cyan", -16711681);
        f156a.put("magenta", -65281);
        f156a.put("aqua", -16711681);
        f156a.put("fuchsia", -65281);
        f156a.put("darkgrey", -12303292);
        f156a.put("grey", -7829368);
        f156a.put("lightgrey", -3355444);
        f156a.put("lime", -16711936);
        f156a.put("maroon", -8388608);
        f156a.put("navy", -16777088);
        f156a.put("olive", -8355840);
        f156a.put("purple", -8388480);
        f156a.put("silver", -4144960);
        f156a.put("teal", -16744320);
    }
}
