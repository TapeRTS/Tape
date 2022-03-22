package android.graphics;

import java.util.HashMap;
import java.util.Locale;

/* loaded from: game-lib.jar:android/graphics/Color.class */
public class Color {

    /* renamed from: a */
    private static final HashMap f157a = new HashMap();

    /* renamed from: a */
    public static int m4215a(int i) {
        return i >>> 24;
    }

    /* renamed from: b */
    public static int m4211b(int i) {
        return (i >> 16) & 255;
    }

    /* renamed from: c */
    public static int m4210c(int i) {
        return (i >> 8) & 255;
    }

    /* renamed from: d */
    public static int m4209d(int i) {
        return i & 255;
    }

    /* renamed from: a */
    public static int m4214a(int i, int i2, int i3) {
        return (-16777216) | (i << 16) | (i2 << 8) | i3;
    }

    /* renamed from: a */
    public static int m4213a(int i, int i2, int i3, int i4) {
        return (i << 24) | (i2 << 16) | (i3 << 8) | i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v20, types: [long] */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v3 */
    /* JADX WARN: Type inference failed for: r6v4 */
    /* JADX WARN: Unknown variable types count: 1 */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static int m4212a(String str) {
        ?? r6;
        if (str.charAt(0) == '#') {
            long parseLong = Long.parseLong(str.substring(1), 16);
            if (str.length() == 7) {
                r6 = parseLong | (-16777216);
            } else {
                r6 = parseLong;
                if (str.length() != 9) {
                    throw new IllegalArgumentException("Unknown color");
                }
            }
            return r6 == true ? 1 : 0;
        }
        Integer num = (Integer) f157a.get(str.toLowerCase(Locale.ROOT));
        if (num != null) {
            return num.intValue();
        }
        throw new IllegalArgumentException("Unknown color");
    }

    static {
        f157a.put("black", -16777216);
        f157a.put("darkgray", -12303292);
        f157a.put("gray", -7829368);
        f157a.put("lightgray", -3355444);
        f157a.put("white", -1);
        f157a.put("red", -65536);
        f157a.put("green", -16711936);
        f157a.put("blue", -16776961);
        f157a.put("yellow", -256);
        f157a.put("cyan", -16711681);
        f157a.put("magenta", -65281);
        f157a.put("aqua", -16711681);
        f157a.put("fuchsia", -65281);
        f157a.put("darkgrey", -12303292);
        f157a.put("grey", -7829368);
        f157a.put("lightgrey", -3355444);
        f157a.put("lime", -16711936);
        f157a.put("maroon", -8388608);
        f157a.put("navy", -16777088);
        f157a.put("olive", -8355840);
        f157a.put("purple", -8388480);
        f157a.put("silver", -4144960);
        f157a.put("teal", -16744320);
    }
}
