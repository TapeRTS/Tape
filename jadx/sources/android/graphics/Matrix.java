package android.graphics;

/* loaded from: game-lib.jar:android/graphics/Matrix.class */
public class Matrix {

    /* renamed from: a */
    public static Matrix f160a = new Matrix() { // from class: android.graphics.Matrix.1
        /* renamed from: b */
        void m4195b() {
            throw new IllegalStateException("Matrix can not be modified");
        }

        @Override // android.graphics.Matrix
        /* renamed from: a */
        public void mo4198a() {
            m4195b();
        }

        @Override // android.graphics.Matrix
        /* renamed from: a */
        public void mo4196a(float f, float f2, float f3) {
            m4195b();
        }

        @Override // android.graphics.Matrix
        /* renamed from: a */
        public boolean mo4197a(float f, float f2) {
            m4195b();
            return false;
        }

        @Override // android.graphics.Matrix
        /* renamed from: b */
        public boolean mo4194b(float f, float f2) {
            m4195b();
            return false;
        }
    };

    /* renamed from: b */
    public int f161b = m4208a(0);

    public boolean equals(Object obj) {
        if (!(obj instanceof Matrix)) {
            return false;
        }
        return m4205a(this.f161b, ((Matrix) obj).f161b);
    }

    public int hashCode() {
        return 44;
    }

    /* renamed from: a */
    public void mo4198a() {
        m4201b(this.f161b);
    }

    /* renamed from: a */
    public void mo4196a(float f, float f2, float f3) {
        m4206a(this.f161b, f, f2, f3);
    }

    /* renamed from: a */
    public boolean mo4197a(float f, float f2) {
        return m4207a(this.f161b, f, f2);
    }

    /* renamed from: b */
    public boolean mo4194b(float f, float f2) {
        return m4200b(this.f161b, f, f2);
    }

    /* loaded from: game-lib.jar:android/graphics/Matrix$ScaleToFit.class */
    public enum ScaleToFit {
        FILL(0),
        START(1),
        CENTER(2),
        END(3);
        

        /* renamed from: e */
        final int f166e;

        ScaleToFit(int i) {
            this.f166e = i;
        }
    }

    /* renamed from: a */
    public void m4202a(float[] fArr) {
        if (fArr.length < 9) {
            throw new ArrayIndexOutOfBoundsException();
        }
        m4204a(this.f161b, fArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("Matrix{");
        m4203a(sb);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public void m4203a(StringBuilder sb) {
        float[] fArr = new float[9];
        m4202a(fArr);
        sb.append('[');
        sb.append(fArr[0]);
        sb.append(", ");
        sb.append(fArr[1]);
        sb.append(", ");
        sb.append(fArr[2]);
        sb.append("][");
        sb.append(fArr[3]);
        sb.append(", ");
        sb.append(fArr[4]);
        sb.append(", ");
        sb.append(fArr[5]);
        sb.append("][");
        sb.append(fArr[6]);
        sb.append(", ");
        sb.append(fArr[7]);
        sb.append(", ");
        sb.append(fArr[8]);
        sb.append(']');
    }

    protected void finalize() {
        try {
            m4199c(this.f161b);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: a */
    private static int m4208a(int i) {
        return 0;
    }

    /* renamed from: b */
    private static void m4201b(int i) {
    }

    /* renamed from: a */
    private static void m4206a(int i, float f, float f2, float f3) {
    }

    /* renamed from: a */
    private static boolean m4207a(int i, float f, float f2) {
        return false;
    }

    /* renamed from: b */
    private static boolean m4200b(int i, float f, float f2) {
        return false;
    }

    /* renamed from: a */
    private static void m4204a(int i, float[] fArr) {
    }

    /* renamed from: a */
    private static boolean m4205a(int i, int i2) {
        return false;
    }

    /* renamed from: c */
    private static void m4199c(int i) {
    }
}
