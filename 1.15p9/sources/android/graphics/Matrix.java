package android.graphics;

/* loaded from: game-lib.jar:android/graphics/Matrix.class */
public class Matrix {

    /* renamed from: a */
    public static Matrix f159a = new Matrix() { // from class: android.graphics.Matrix.1
    };

    /* renamed from: b */
    public int f160b = m6516a(0);

    public boolean equals(Object obj) {
        if (!(obj instanceof Matrix)) {
            return false;
        }
        return m6515a(this.f160b, ((Matrix) obj).f160b);
    }

    public int hashCode() {
        return 44;
    }

    /* loaded from: game-lib.jar:android/graphics/Matrix$ScaleToFit.class */
    public enum ScaleToFit {
        f161a(0),
        f162b(1),
        f163c(2),
        f164d(3);
        

        /* renamed from: e */
        final int f165e;

        ScaleToFit(int i) {
            this.f165e = i;
        }
    }

    /* renamed from: a */
    public void m6512a(float[] fArr) {
        if (fArr.length < 9) {
            throw new ArrayIndexOutOfBoundsException();
        }
        m6514a(this.f160b, fArr);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(64);
        sb.append("Matrix{");
        m6513a(sb);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public void m6513a(StringBuilder sb) {
        float[] fArr = new float[9];
        m6512a(fArr);
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
            m6511b(this.f160b);
        } finally {
            super.finalize();
        }
    }

    /* renamed from: a */
    private static int m6516a(int i) {
        return 0;
    }

    /* renamed from: a */
    private static void m6514a(int i, float[] fArr) {
    }

    /* renamed from: a */
    private static boolean m6515a(int i, int i2) {
        return false;
    }

    /* renamed from: b */
    private static void m6511b(int i) {
    }
}
