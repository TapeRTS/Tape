package android.graphics;

import java.util.Locale;

/* loaded from: game-lib.jar:android/graphics/Paint.class */
public class Paint {

    /* renamed from: a */
    public int f168a;

    /* renamed from: r */
    private ColorFilter f169r;

    /* renamed from: s */
    private MaskFilter f170s;

    /* renamed from: t */
    private PathEffect f171t;

    /* renamed from: u */
    private Rasterizer f172u;

    /* renamed from: v */
    private Shader f173v;

    /* renamed from: w */
    private Typeface f174w;

    /* renamed from: x */
    private Xfermode f175x;

    /* renamed from: y */
    private boolean f176y;

    /* renamed from: z */
    private float f177z;

    /* renamed from: A */
    private float f178A;

    /* renamed from: B */
    private Locale f179B;

    /* renamed from: b */
    public boolean f180b;

    /* renamed from: c */
    public float f181c;

    /* renamed from: d */
    public float f182d;

    /* renamed from: e */
    public float f183e;

    /* renamed from: f */
    public int f184f;

    /* renamed from: g */
    public int f185g;

    /* renamed from: h */
    static final Style[] f186h = {Style.FILL, Style.STROKE, Style.FILL_AND_STROKE};

    /* renamed from: i */
    static final Cap[] f187i = {Cap.BUTT, Cap.ROUND, Cap.SQUARE};

    /* renamed from: j */
    static final Join[] f188j = {Join.MITER, Join.ROUND, Join.BEVEL};

    /* renamed from: k */
    static final Align[] f189k = {Align.LEFT, Align.CENTER, Align.RIGHT};

    /* renamed from: l */
    int f190l;

    /* renamed from: m */
    Style f191m;

    /* renamed from: n */
    int f192n;

    /* renamed from: o */
    float f193o;

    /* renamed from: p */
    Align f194p;

    /* renamed from: q */
    float f195q;

    /* loaded from: game-lib.jar:android/graphics/Paint$FontMetrics.class */
    public class FontMetrics {
    }

    /* loaded from: game-lib.jar:android/graphics/Paint$Style.class */
    public enum Style {
        FILL(0),
        STROKE(1),
        FILL_AND_STROKE(2);
        

        /* renamed from: d */
        final int f219d;

        Style(int i) {
            this.f219d = i;
        }
    }

    /* loaded from: game-lib.jar:android/graphics/Paint$Cap.class */
    public enum Cap {
        BUTT(0),
        ROUND(1),
        SQUARE(2);
        

        /* renamed from: d */
        final int f204d;

        Cap(int i) {
            this.f204d = i;
        }
    }

    /* loaded from: game-lib.jar:android/graphics/Paint$Join.class */
    public enum Join {
        MITER(0),
        ROUND(1),
        BEVEL(2);
        

        /* renamed from: d */
        final int f214d;

        Join(int i) {
            this.f214d = i;
        }
    }

    /* loaded from: game-lib.jar:android/graphics/Paint$Align.class */
    public enum Align {
        LEFT(0),
        CENTER(1),
        RIGHT(2);
        

        /* renamed from: d */
        final int f199d;

        Align(int i) {
            this.f199d = i;
        }
    }

    public Paint() {
        this(0);
    }

    public Paint(int i) {
        this.f185g = 2;
        this.f191m = Style.FILL;
        this.f193o = 0.0f;
        this.f195q = 16.0f;
        this.f168a = m4146n();
        m4193a();
        m4191a(i | 1280);
        this.f178A = 1.0f;
        this.f177z = 1.0f;
        m4174a(Locale.getDefault());
    }

    public Paint(Paint paint) {
        this.f185g = 2;
        this.f191m = Style.FILL;
        this.f193o = 0.0f;
        this.f195q = 16.0f;
        this.f168a = m4160d(paint.f168a);
        m4167b(paint);
    }

    /* renamed from: a */
    public void m4193a() {
        m4156e(this.f168a);
        m4191a(1280);
        this.f192n = -1;
        this.f191m = Style.FILL;
        this.f195q = 16.0f;
        this.f194p = Align.LEFT;
        this.f169r = null;
        this.f170s = null;
        this.f171t = null;
        this.f172u = null;
        this.f173v = null;
        this.f174w = null;
        this.f175x = null;
        this.f176y = false;
        this.f177z = 1.0f;
        this.f178A = 1.0f;
        this.f180b = false;
        this.f181c = 0.0f;
        this.f182d = 0.0f;
        this.f183e = 0.0f;
        this.f184f = 0;
        this.f185g = 2;
        m4174a(Locale.getDefault());
    }

    /* renamed from: a */
    public void m4183a(Paint paint) {
        if (this != paint) {
            m4190a(this.f168a, paint.f168a);
            m4167b(paint);
        }
    }

    /* renamed from: b */
    private void m4167b(Paint paint) {
        this.f191m = paint.f191m;
        this.f192n = paint.f192n;
        this.f195q = paint.f195q;
        this.f194p = paint.f194p;
        this.f169r = paint.f169r;
        this.f170s = paint.f170s;
        this.f171t = paint.f171t;
        this.f172u = paint.f172u;
        this.f174w = paint.f174w;
        this.f175x = paint.f175x;
        this.f176y = paint.f176y;
        this.f177z = paint.f177z;
        this.f178A = paint.f178A;
        this.f180b = paint.f180b;
        this.f181c = paint.f181c;
        this.f182d = paint.f182d;
        this.f183e = paint.f183e;
        this.f184f = paint.f184f;
        this.f185g = paint.f185g;
        this.f179B = paint.f179B;
        this.f193o = paint.f193o;
    }

    /* renamed from: b */
    public int m4170b() {
        return this.f190l;
    }

    /* renamed from: a */
    public void m4191a(int i) {
        this.f190l = i;
    }

    /* renamed from: c */
    public final boolean m4165c() {
        return (m4170b() & 1) != 0;
    }

    /* renamed from: a */
    public void m4173a(boolean z) {
        if (z) {
            m4191a(this.f190l | 1);
        } else {
            m4191a(this.f190l & (-2));
        }
    }

    /* renamed from: b */
    public void m4166b(boolean z) {
    }

    /* renamed from: c */
    public void m4162c(boolean z) {
    }

    /* renamed from: d */
    public void m4158d(boolean z) {
    }

    /* renamed from: d */
    public Style m4161d() {
        return this.f191m;
    }

    /* renamed from: a */
    public void m4184a(Style style) {
        this.f191m = style;
    }

    /* renamed from: e */
    public int m4157e() {
        return this.f192n;
    }

    /* renamed from: b */
    public void m4169b(int i) {
        this.f192n = i;
    }

    /* renamed from: f */
    public int m4155f() {
        return Color.m4215a(this.f192n);
    }

    /* renamed from: c */
    public void m4164c(int i) {
        this.f192n = Color.m4213a(i, Color.m4211b(this.f192n), Color.m4210c(this.f192n), Color.m4209d(this.f192n));
    }

    /* renamed from: a */
    public void m4189a(int i, int i2, int i3, int i4) {
        m4169b((i << 24) | (i2 << 16) | (i3 << 8) | i4);
    }

    /* renamed from: g */
    public float m4153g() {
        return this.f193o;
    }

    /* renamed from: a */
    public void m4192a(float f) {
        this.f193o = f;
    }

    /* renamed from: a */
    public void m4185a(Cap cap) {
        m4168b(this.f168a, cap.f204d);
    }

    /* renamed from: h */
    public ColorFilter m4152h() {
        return this.f169r;
    }

    /* renamed from: a */
    public ColorFilter m4187a(ColorFilter colorFilter) {
        m4163c(this.f168a, 0);
        this.f169r = colorFilter;
        return colorFilter;
    }

    /* renamed from: a */
    public Xfermode m4182a(Xfermode xfermode) {
        m4159d(this.f168a, 0);
        this.f175x = xfermode;
        return xfermode;
    }

    /* renamed from: i */
    public Typeface m4151i() {
        return this.f174w;
    }

    /* renamed from: a */
    public Typeface mo837a(Typeface typeface) {
        this.f174w = typeface;
        return typeface;
    }

    /* renamed from: j */
    public Align m4150j() {
        return this.f194p;
    }

    /* renamed from: a */
    public void m4186a(Align align) {
        this.f194p = align;
    }

    /* renamed from: a */
    public void m4174a(Locale locale) {
        if (locale == null) {
            throw new IllegalArgumentException("locale cannot be null");
        } else if (!locale.equals(this.f179B)) {
            this.f179B = locale;
            m4188a(this.f168a, locale.toString());
        }
    }

    /* renamed from: k */
    public float m4149k() {
        return this.f195q;
    }

    /* renamed from: b */
    public void mo836b(float f) {
        this.f195q = f;
    }

    /* renamed from: l */
    public float m4148l() {
        return -this.f195q;
    }

    /* renamed from: m */
    public float m4147m() {
        return 0.0f;
    }

    /* loaded from: game-lib.jar:android/graphics/Paint$FontMetricsInt.class */
    public class FontMetricsInt {

        /* renamed from: a */
        public int f206a;

        /* renamed from: b */
        public int f207b;

        /* renamed from: c */
        public int f208c;

        /* renamed from: d */
        public int f209d;

        /* renamed from: e */
        public int f210e;

        public String toString() {
            return "FontMetricsInt: top=" + this.f206a + " ascent=" + this.f207b + " descent=" + this.f208c + " bottom=" + this.f209d + " leading=" + this.f210e;
        }
    }

    /* renamed from: a */
    public float m4179a(String str) {
        if (str == null) {
            throw new IllegalArgumentException("text cannot be null");
        } else if (str.length() == 0) {
            return 0.0f;
        } else {
            if (!this.f176y) {
                return (float) Math.ceil(m4178a(str, this.f185g));
            }
            float k = m4149k();
            mo836b(k * this.f177z);
            float a = m4178a(str, this.f185g);
            mo836b(k);
            return (float) Math.ceil(a * this.f178A);
        }
    }

    /* renamed from: a */
    private float m4178a(String str, int i) {
        return str.length() * m4149k();
    }

    /* renamed from: a */
    public int m4171a(char[] cArr, int i, int i2, float f, float[] fArr) {
        if (cArr == null) {
            throw new IllegalArgumentException("text cannot be null");
        } else if (i < 0 || cArr.length - i < Math.abs(i2)) {
            throw new ArrayIndexOutOfBoundsException();
        } else if (cArr.length == 0 || i2 == 0) {
            return 0;
        } else {
            if (!this.f176y) {
                return m4172a(cArr, i, i2, f, this.f185g, fArr);
            }
            float k = m4149k();
            mo836b(k * this.f177z);
            int a = m4172a(cArr, i, i2, f * this.f177z, this.f185g, fArr);
            mo836b(k);
            if (fArr != null) {
                fArr[0] = fArr[0] * this.f178A;
            }
            return a;
        }
    }

    /* renamed from: a */
    private int m4172a(char[] cArr, int i, int i2, float f, int i3, float[] fArr) {
        return i2;
    }

    /* renamed from: a */
    private int m4176a(String str, boolean z, float f, int i, float[] fArr) {
        return str.length();
    }

    /* renamed from: a */
    public int m4181a(CharSequence charSequence, int i, int i2, boolean z, float f, float[] fArr) {
        int i3;
        if (charSequence == null) {
            throw new IllegalArgumentException("text cannot be null");
        } else if ((i | i2 | (i2 - i) | (charSequence.length() - i2)) < 0) {
            throw new IndexOutOfBoundsException();
        } else if (charSequence.length() == 0 || i == i2) {
            return 0;
        } else {
            if (i == 0 && (charSequence instanceof String) && i2 == charSequence.length()) {
                return m4175a((String) charSequence, z, f, fArr);
            }
            char[] a = TemporaryBuffer.m4105a(i2 - i);
            m4180a(charSequence, i, i2, a, 0);
            if (z) {
                i3 = m4171a(a, 0, i2 - i, f, fArr);
            } else {
                i3 = m4171a(a, 0, -(i2 - i), f, fArr);
            }
            TemporaryBuffer.m4104a(a);
            return i3;
        }
    }

    /* renamed from: a */
    public static void m4180a(CharSequence charSequence, int i, int i2, char[] cArr, int i3) {
        Class<?> cls = charSequence.getClass();
        if (cls == String.class) {
            ((String) charSequence).getChars(i, i2, cArr, i3);
        } else if (cls == StringBuffer.class) {
            ((StringBuffer) charSequence).getChars(i, i2, cArr, i3);
        } else if (cls == StringBuilder.class) {
            ((StringBuilder) charSequence).getChars(i, i2, cArr, i3);
        } else {
            for (int i4 = i; i4 < i2; i4++) {
                i3++;
                cArr[i3] = charSequence.charAt(i4);
            }
        }
    }

    /* renamed from: a */
    public int m4175a(String str, boolean z, float f, float[] fArr) {
        if (str == null) {
            throw new IllegalArgumentException("text cannot be null");
        } else if (str.length() == 0) {
            return 0;
        } else {
            if (!this.f176y) {
                return m4176a(str, z, f, this.f185g, fArr);
            }
            float k = m4149k();
            mo836b(k * this.f177z);
            int a = m4176a(str, z, f * this.f177z, this.f185g, fArr);
            mo836b(k);
            if (fArr != null) {
                fArr[0] = fArr[0] * this.f178A;
            }
            return a;
        }
    }

    /* renamed from: a */
    public void m4177a(String str, int i, int i2, Rect rect) {
        if ((i | i2 | (i2 - i) | (str.length() - i2)) < 0) {
            throw new IndexOutOfBoundsException();
        } else if (rect == null) {
            throw new NullPointerException("need bounds Rect");
        } else {
            rect.m4136a(0, 0, 0, (int) this.f195q);
        }
    }

    protected void finalize() {
        try {
            m4154f(this.f168a);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: n */
    private static int m4146n() {
        return 0;
    }

    /* renamed from: d */
    private static int m4160d(int i) {
        return 0;
    }

    /* renamed from: e */
    private static void m4156e(int i) {
    }

    /* renamed from: a */
    private static void m4190a(int i, int i2) {
    }

    /* renamed from: b */
    private static void m4168b(int i, int i2) {
    }

    /* renamed from: c */
    private static int m4163c(int i, int i2) {
        return 0;
    }

    /* renamed from: d */
    private static int m4159d(int i, int i2) {
        return 0;
    }

    /* renamed from: a */
    private static void m4188a(int i, String str) {
    }

    /* renamed from: f */
    private static void m4154f(int i) {
    }
}
