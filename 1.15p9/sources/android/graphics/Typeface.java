package android.graphics;

import android.util.SparseArray;

/* loaded from: game-lib.jar:android/graphics/Typeface.class */
public class Typeface {

    /* renamed from: g */
    int f240g;

    /* renamed from: j */
    private int f241j;

    /* renamed from: h */
    String f242h;

    /* renamed from: i */
    private static final SparseArray f243i = new SparseArray(3);

    /* renamed from: a */
    public static final Typeface f244a = m6412a((String) null, 0);

    /* renamed from: b */
    public static final Typeface f245b = m6412a((String) null, 1);

    /* renamed from: c */
    public static final Typeface f246c = m6412a("sans-serif", 0);

    /* renamed from: d */
    public static final Typeface f247d = m6412a("serif", 0);

    /* renamed from: e */
    public static final Typeface f248e = m6412a("monospace", 0);

    /* renamed from: f */
    static Typeface[] f249f = {f244a, f245b, m6412a((String) null, 2), m6412a((String) null, 3)};

    /* renamed from: a */
    public final boolean m6415a() {
        return (this.f241j & 1) != 0;
    }

    /* renamed from: a */
    public static Typeface m6412a(String str, int i) {
        Typeface typeface = new Typeface(0);
        typeface.f241j = i;
        typeface.f242h = str;
        return typeface;
    }

    /* renamed from: a */
    public static Typeface m6413a(Typeface typeface, int i) {
        Typeface typeface2;
        int i2 = 0;
        if (typeface != null) {
            if (typeface.f241j == i) {
                return typeface;
            }
            i2 = typeface.f240g;
        }
        SparseArray sparseArray = (SparseArray) f243i.m6342a(i2);
        if (sparseArray != null && (typeface2 = (Typeface) sparseArray.m6342a(i)) != null) {
            return typeface2;
        }
        Typeface typeface3 = new Typeface(0);
        typeface3.f241j = i;
        typeface3.f242h = typeface.f242h;
        if (sparseArray == null) {
            sparseArray = new SparseArray(4);
            f243i.m6338b(i2, sparseArray);
        }
        sparseArray.m6338b(i, typeface3);
        return typeface3;
    }

    private Typeface(int i) {
        this.f241j = 0;
        this.f240g = i;
        this.f241j = m6411b(i);
    }

    protected void finalize() {
        try {
            m6414a(this.f240g);
        } finally {
            super.finalize();
        }
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Typeface typeface = (Typeface) obj;
        return this.f241j == typeface.f241j && this.f240g == typeface.f240g;
    }

    public int hashCode() {
        return (31 * this.f240g) + this.f241j;
    }

    /* renamed from: a */
    private static void m6414a(int i) {
    }

    /* renamed from: b */
    private static int m6411b(int i) {
        return 0;
    }
}
