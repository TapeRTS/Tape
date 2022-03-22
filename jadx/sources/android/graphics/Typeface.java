package android.graphics;

import android.util.SparseArray;

/* loaded from: game-lib.jar:android/graphics/Typeface.class */
public class Typeface {

    /* renamed from: g */
    int f244g;

    /* renamed from: j */
    private int f245j;

    /* renamed from: h */
    String f246h;

    /* renamed from: i */
    private static final SparseArray f243i = new SparseArray(3);

    /* renamed from: a */
    public static final Typeface f237a = m4100a((String) null, 0);

    /* renamed from: b */
    public static final Typeface f238b = m4100a((String) null, 1);

    /* renamed from: c */
    public static final Typeface f239c = m4100a("sans-serif", 0);

    /* renamed from: d */
    public static final Typeface f240d = m4100a("serif", 0);

    /* renamed from: e */
    public static final Typeface f241e = m4100a("monospace", 0);

    /* renamed from: f */
    static Typeface[] f242f = {f237a, f238b, m4100a((String) null, 2), m4100a((String) null, 3)};

    /* renamed from: a */
    public final boolean m4103a() {
        return (this.f245j & 1) != 0;
    }

    /* renamed from: a */
    public static Typeface m4100a(String str, int i) {
        Typeface typeface = new Typeface(0);
        typeface.f245j = i;
        typeface.f246h = str;
        return typeface;
    }

    /* renamed from: a */
    public static Typeface m4101a(Typeface typeface, int i) {
        Typeface typeface2;
        int i2 = 0;
        if (typeface != null) {
            if (typeface.f245j == i) {
                return typeface;
            }
            i2 = typeface.f244g;
        }
        SparseArray sparseArray = (SparseArray) f243i.m4030a(i2);
        if (sparseArray != null && (typeface2 = (Typeface) sparseArray.m4030a(i)) != null) {
            return typeface2;
        }
        Typeface typeface3 = new Typeface(0);
        typeface3.f245j = i;
        typeface3.f246h = typeface.f246h;
        if (sparseArray == null) {
            sparseArray = new SparseArray(4);
            f243i.m4026b(i2, sparseArray);
        }
        sparseArray.m4026b(i, typeface3);
        return typeface3;
    }

    private Typeface(int i) {
        this.f245j = 0;
        this.f244g = i;
        this.f245j = m4099b(i);
    }

    protected void finalize() {
        try {
            m4102a(this.f244g);
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
        return this.f245j == typeface.f245j && this.f244g == typeface.f244g;
    }

    public int hashCode() {
        return (31 * this.f244g) + this.f245j;
    }

    /* renamed from: a */
    private static void m4102a(int i) {
    }

    /* renamed from: b */
    private static int m4099b(int i) {
        return 0;
    }
}
