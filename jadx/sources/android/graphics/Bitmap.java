package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.DisplayMetrics;
import java.io.OutputStream;

/* loaded from: game-lib.jar:android/graphics/Bitmap.class */
public final class Bitmap implements Parcelable {

    /* renamed from: a */
    public final int f127a;

    /* renamed from: d */
    private final boolean f128d;

    /* renamed from: e */
    private boolean f129e;

    /* renamed from: f */
    private int f130f;

    /* renamed from: g */
    private int f131g;

    /* renamed from: h */
    private boolean f132h;

    /* renamed from: b */
    int f133b;

    /* renamed from: i */
    private static volatile int f134i = -1;

    /* renamed from: c */
    public static final Parcelable.Creator f135c = new Parcelable.Creator() { // from class: android.graphics.Bitmap.1
        /* renamed from: a */
        public Bitmap createFromParcel(Parcel parcel) {
            Bitmap nativeCreateFromParcel = Bitmap.nativeCreateFromParcel(parcel);
            if (nativeCreateFromParcel != null) {
                return nativeCreateFromParcel;
            }
            throw new RuntimeException("Failed to unparcel Bitmap");
        }

        /* renamed from: a */
        public Bitmap[] newArray(int i) {
            return new Bitmap[i];
        }
    };

    private static native Bitmap nativeCreate(int[] iArr, int i, int i2, int i3, int i4, int i5, boolean z);

    private static native Bitmap nativeCopy(int i, int i2, boolean z);

    private static native boolean nativeCompress(int i, int i2, int i3, OutputStream outputStream, byte[] bArr);

    private static native void nativeErase(int i, int i2);

    private static native int nativeConfig(int i);

    private static native int nativeGetPixel(int i, int i2, int i3, boolean z);

    private static native void nativeGetPixels(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    private static native void nativeSetPixel(int i, int i2, int i3, int i4, boolean z);

    private static native void nativeSetPixels(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, int i7, boolean z);

    /* JADX INFO: Access modifiers changed from: private */
    public static native Bitmap nativeCreateFromParcel(Parcel parcel);

    private static native boolean nativeWriteToParcel(int i, boolean z, int i2, Parcel parcel);

    private static native void nativePrepareToDraw(int i);

    private static native void nativeSetHasAlpha(int i, boolean z);

    /* renamed from: a */
    public void m4259a(int i) {
        this.f133b = i;
    }

    /* renamed from: a */
    private void m4249a(String str) {
        if (this.f132h) {
            throw new IllegalStateException(str);
        }
    }

    /* renamed from: b */
    private static void m4245b(int i, int i2) {
        if (i < 0) {
            throw new IllegalArgumentException("x must be >= 0");
        } else if (i2 < 0) {
            throw new IllegalArgumentException("y must be >= 0");
        }
    }

    /* loaded from: game-lib.jar:android/graphics/Bitmap$Config.class */
    public enum Config {
        ALPHA_8(2),
        RGB_565(4),
        ARGB_4444(5),
        ARGB_8888(6);
        

        /* renamed from: e */
        final int f145e;

        /* renamed from: f */
        private static Config[] f146f = {null, null, ALPHA_8, null, RGB_565, ARGB_4444, ARGB_8888};

        Config(int i) {
            this.f145e = i;
        }

        /* renamed from: a */
        static Config m4237a(int i) {
            return f146f[i];
        }
    }

    /* renamed from: a */
    public Bitmap m4252a(Config config, boolean z) {
        m4249a("Can't copy a recycled bitmap");
        Bitmap nativeCopy = nativeCopy(this.f127a, config.f145e, z);
        if (nativeCopy != null) {
            nativeCopy.f129e = this.f129e;
            nativeCopy.f133b = this.f133b;
        }
        return nativeCopy;
    }

    /* renamed from: a */
    public static Bitmap m4255a(int i, int i2, Config config) {
        return m4254a(i, i2, config, true);
    }

    /* renamed from: a */
    private static Bitmap m4254a(int i, int i2, Config config, boolean z) {
        return m4250a(null, i, i2, config, z);
    }

    /* renamed from: a */
    private static Bitmap m4250a(DisplayMetrics displayMetrics, int i, int i2, Config config, boolean z) {
        if (i <= 0 || i2 <= 0) {
            throw new IllegalArgumentException("width and height must be > 0");
        }
        Bitmap nativeCreate = nativeCreate(null, 0, i, i, i2, config.f145e, true);
        if (displayMetrics != null) {
            nativeCreate.f133b = displayMetrics.densityDpi;
        }
        if (config == Config.ARGB_8888 && !z) {
            nativeErase(nativeCreate.f127a, -16777216);
            nativeSetHasAlpha(nativeCreate.f127a, z);
        }
        return nativeCreate;
    }

    /* loaded from: game-lib.jar:android/graphics/Bitmap$CompressFormat.class */
    public enum CompressFormat {
        JPEG(0),
        PNG(1),
        WEBP(2);
        

        /* renamed from: d */
        final int f139d;

        CompressFormat(int i) {
            this.f139d = i;
        }
    }

    /* renamed from: a */
    public boolean m4253a(CompressFormat compressFormat, int i, OutputStream outputStream) {
        m4249a("Can't compress a recycled bitmap");
        if (outputStream == null) {
            throw new NullPointerException();
        } else if (i >= 0 && i <= 100) {
            return nativeCompress(this.f127a, compressFormat.f139d, i, outputStream, new byte[4096]);
        } else {
            throw new IllegalArgumentException("quality must be 0..100");
        }
    }

    /* renamed from: a */
    public final boolean m4260a() {
        return this.f128d;
    }

    /* renamed from: b */
    public final int m4246b() {
        return this.f130f;
    }

    /* renamed from: c */
    public final int m4243c() {
        return this.f131g;
    }

    /* renamed from: d */
    public final Config m4241d() {
        return Config.m4237a(nativeConfig(this.f127a));
    }

    /* renamed from: a */
    public void m4248a(boolean z) {
        nativeSetHasAlpha(this.f127a, z);
    }

    /* renamed from: a */
    public int m4258a(int i, int i2) {
        m4249a("Can't call getPixel() on a recycled bitmap");
        m4242c(i, i2);
        return nativeGetPixel(this.f127a, i, i2, this.f129e);
    }

    /* renamed from: a */
    public void m4247a(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        m4249a("Can't call getPixels() on a recycled bitmap");
        if (i5 != 0 && i6 != 0) {
            m4256a(i3, i4, i5, i6, i, i2, iArr);
            nativeGetPixels(this.f127a, iArr, i, i2, i3, i4, i5, i6, this.f129e);
        }
    }

    /* renamed from: c */
    private void m4242c(int i, int i2) {
        m4245b(i, i2);
        if (i >= m4246b()) {
            throw new IllegalArgumentException("x must be < bitmap.width()");
        } else if (i2 >= m4243c()) {
            throw new IllegalArgumentException("y must be < bitmap.height()");
        }
    }

    /* renamed from: a */
    private void m4256a(int i, int i2, int i3, int i4, int i5, int i6, int[] iArr) {
        m4245b(i, i2);
        if (i3 < 0) {
            throw new IllegalArgumentException("width must be >= 0");
        } else if (i4 < 0) {
            throw new IllegalArgumentException("height must be >= 0");
        } else if (i + i3 > m4246b()) {
            throw new IllegalArgumentException("x + width must be <= bitmap.width()");
        } else if (i2 + i4 > m4243c()) {
            throw new IllegalArgumentException("y + height must be <= bitmap.height()");
        } else if (Math.abs(i6) < i3) {
            throw new IllegalArgumentException("abs(stride) must be >= width");
        } else {
            int i7 = i5 + ((i4 - 1) * i6);
            int length = iArr.length;
            if (i5 < 0 || i5 + i3 > length || i7 < 0 || i7 + i3 > length) {
                throw new ArrayIndexOutOfBoundsException();
            }
        }
    }

    /* renamed from: a */
    public void m4257a(int i, int i2, int i3) {
        m4249a("Can't call setPixel() on a recycled bitmap");
        if (!m4260a()) {
            throw new IllegalStateException();
        }
        m4242c(i, i2);
        nativeSetPixel(this.f127a, i, i2, i3, this.f129e);
    }

    /* renamed from: b */
    public void m4244b(int[] iArr, int i, int i2, int i3, int i4, int i5, int i6) {
        m4249a("Can't call setPixels() on a recycled bitmap");
        if (!m4260a()) {
            throw new IllegalStateException();
        } else if (i5 != 0 && i6 != 0) {
            m4256a(i3, i4, i5, i6, i, i2, iArr);
            nativeSetPixels(this.f127a, iArr, i, i2, i3, i4, i5, i6, this.f129e);
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        m4249a("Can't parcel a recycled bitmap");
        if (!nativeWriteToParcel(this.f127a, this.f128d, this.f133b, parcel)) {
            throw new RuntimeException("native writeToParcel failed");
        }
    }

    /* renamed from: e */
    public void m4240e() {
        nativePrepareToDraw(this.f127a);
    }
}
