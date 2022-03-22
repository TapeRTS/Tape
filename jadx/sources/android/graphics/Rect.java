package android.graphics;

/* loaded from: game-lib.jar:android/graphics/Rect.class */
public final class Rect {

    /* renamed from: a */
    public int f227a;

    /* renamed from: b */
    public int f228b;

    /* renamed from: c */
    public int f229c;

    /* renamed from: d */
    public int f230d;

    public Rect() {
    }

    public Rect(int i, int i2, int i3, int i4) {
        this.f227a = i;
        this.f228b = i2;
        this.f229c = i3;
        this.f230d = i4;
    }

    public Rect(Rect rect) {
        this.f227a = rect.f227a;
        this.f228b = rect.f228b;
        this.f229c = rect.f229c;
        this.f230d = rect.f230d;
    }

    public boolean equals(Object obj) {
        Rect rect = (Rect) obj;
        return rect != null && this.f227a == rect.f227a && this.f228b == rect.f228b && this.f229c == rect.f229c && this.f230d == rect.f230d;
    }

    public String toString() {
        return "Rect(" + this.f227a + ", " + this.f228b + ", " + this.f229c + ", " + this.f230d + ")";
    }

    /* renamed from: a */
    public final boolean m4138a() {
        return this.f227a >= this.f229c || this.f228b >= this.f230d;
    }

    /* renamed from: b */
    public final int m4134b() {
        return this.f229c - this.f227a;
    }

    /* renamed from: c */
    public final int m4130c() {
        return this.f230d - this.f228b;
    }

    /* renamed from: d */
    public final int m4129d() {
        return (this.f227a + this.f229c) >> 1;
    }

    /* renamed from: e */
    public final int m4128e() {
        return (this.f228b + this.f230d) >> 1;
    }

    /* renamed from: f */
    public final float m4127f() {
        return (this.f227a + this.f229c) * 0.5f;
    }

    /* renamed from: g */
    public final float m4126g() {
        return (this.f228b + this.f230d) * 0.5f;
    }

    /* renamed from: h */
    public void m4125h() {
        this.f230d = 0;
        this.f228b = 0;
        this.f229c = 0;
        this.f227a = 0;
    }

    /* renamed from: a */
    public void m4136a(int i, int i2, int i3, int i4) {
        this.f227a = i;
        this.f228b = i2;
        this.f229c = i3;
        this.f230d = i4;
    }

    /* renamed from: a */
    public void m4135a(Rect rect) {
        this.f227a = rect.f227a;
        this.f228b = rect.f228b;
        this.f229c = rect.f229c;
        this.f230d = rect.f230d;
    }

    /* renamed from: a */
    public void m4137a(int i, int i2) {
        this.f227a += i;
        this.f228b += i2;
        this.f229c += i;
        this.f230d += i2;
    }

    /* renamed from: b */
    public boolean m4133b(int i, int i2) {
        return this.f227a < this.f229c && this.f228b < this.f230d && i >= this.f227a && i < this.f229c && i2 >= this.f228b && i2 < this.f230d;
    }

    /* renamed from: b */
    public boolean m4131b(Rect rect) {
        return this.f227a < this.f229c && this.f228b < this.f230d && this.f227a <= rect.f227a && this.f228b <= rect.f228b && this.f229c >= rect.f229c && this.f230d >= rect.f230d;
    }

    /* renamed from: b */
    public boolean m4132b(int i, int i2, int i3, int i4) {
        return this.f227a < i3 && i < this.f229c && this.f228b < i4 && i2 < this.f230d;
    }
}
