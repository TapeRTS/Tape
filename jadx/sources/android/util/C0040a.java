package android.util;

/* renamed from: android.util.a */
/* loaded from: game-lib.jar:android/util/a.class */
class C0040a {

    /* renamed from: a */
    static final boolean[] f305a = new boolean[0];

    /* renamed from: b */
    static final int[] f306b = new int[0];

    /* renamed from: c */
    static final long[] f307c = new long[0];

    /* renamed from: d */
    static final Object[] f308d = new Object[0];

    /* renamed from: a */
    static int m4281a(int[] iArr, int i, int i2) {
        int i3 = 0;
        int i4 = i - 1;
        while (i3 <= i4) {
            int i5 = (i3 + i4) >>> 1;
            int i6 = iArr[i5];
            if (i6 < i2) {
                i3 = i5 + 1;
            } else if (i6 <= i2) {
                return i5;
            } else {
                i4 = i5 - 1;
            }
        }
        return i3 ^ (-1);
    }
}
