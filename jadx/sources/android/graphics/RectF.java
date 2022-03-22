package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: game-lib.jar:android/graphics/RectF.class */
public class RectF implements Parcelable {

    /* renamed from: a */
    public float f231a;

    /* renamed from: b */
    public float f232b;

    /* renamed from: c */
    public float f233c;

    /* renamed from: d */
    public float f234d;

    /* renamed from: e */
    public static final Parcelable.Creator f235e = new Parcelable.Creator() { // from class: android.graphics.RectF.1
        /* renamed from: a */
        public RectF createFromParcel(Parcel parcel) {
            RectF rectF = new RectF();
            rectF.m4118a(parcel);
            return rectF;
        }

        /* renamed from: a */
        public RectF[] newArray(int i) {
            return new RectF[i];
        }
    };

    public RectF() {
    }

    public RectF(float f, float f2, float f3, float f4) {
        this.f231a = f;
        this.f232b = f2;
        this.f233c = f3;
        this.f234d = f4;
    }

    public RectF(RectF rectF) {
        this.f231a = rectF.f231a;
        this.f232b = rectF.f232b;
        this.f233c = rectF.f233c;
        this.f234d = rectF.f234d;
    }

    public String toString() {
        return "RectF(" + this.f231a + ", " + this.f232b + ", " + this.f233c + ", " + this.f234d + ")";
    }

    /* renamed from: a */
    public final boolean m4124a() {
        return this.f231a >= this.f233c || this.f232b >= this.f234d;
    }

    /* renamed from: b */
    public final float m4117b() {
        return this.f233c - this.f231a;
    }

    /* renamed from: c */
    public final float m4113c() {
        return this.f234d - this.f232b;
    }

    /* renamed from: d */
    public final float m4111d() {
        return (this.f231a + this.f233c) * 0.5f;
    }

    /* renamed from: e */
    public final float m4110e() {
        return (this.f232b + this.f234d) * 0.5f;
    }

    /* renamed from: f */
    public void m4109f() {
        this.f234d = 0.0f;
        this.f232b = 0.0f;
        this.f233c = 0.0f;
        this.f231a = 0.0f;
    }

    /* renamed from: a */
    public void m4122a(float f, float f2, float f3, float f4) {
        this.f231a = f;
        this.f232b = f2;
        this.f233c = f3;
        this.f234d = f4;
    }

    /* renamed from: a */
    public void m4120a(RectF rectF) {
        this.f231a = rectF.f231a;
        this.f232b = rectF.f232b;
        this.f233c = rectF.f233c;
        this.f234d = rectF.f234d;
    }

    /* renamed from: a */
    public void m4121a(Rect rect) {
        this.f231a = rect.f227a;
        this.f232b = rect.f228b;
        this.f233c = rect.f229c;
        this.f234d = rect.f230d;
    }

    /* renamed from: a */
    public void m4123a(float f, float f2) {
        this.f231a += f;
        this.f232b += f2;
        this.f233c += f;
        this.f234d += f2;
    }

    /* renamed from: b */
    public boolean m4116b(float f, float f2) {
        return this.f231a < this.f233c && this.f232b < this.f234d && f >= this.f231a && f < this.f233c && f2 >= this.f232b && f2 < this.f234d;
    }

    /* renamed from: b */
    public boolean m4115b(float f, float f2, float f3, float f4) {
        if (this.f231a >= f3 || f >= this.f233c || this.f232b >= f4 || f2 >= this.f234d) {
            return false;
        }
        if (this.f231a < f) {
            this.f231a = f;
        }
        if (this.f232b < f2) {
            this.f232b = f2;
        }
        if (this.f233c > f3) {
            this.f233c = f3;
        }
        if (this.f234d <= f4) {
            return true;
        }
        this.f234d = f4;
        return true;
    }

    /* renamed from: b */
    public boolean m4114b(RectF rectF) {
        return m4115b(rectF.f231a, rectF.f232b, rectF.f233c, rectF.f234d);
    }

    /* renamed from: a */
    public static boolean m4119a(RectF rectF, RectF rectF2) {
        return rectF.f231a < rectF2.f233c && rectF2.f231a < rectF.f233c && rectF.f232b < rectF2.f234d && rectF2.f232b < rectF.f234d;
    }

    /* renamed from: c */
    public void m4112c(float f, float f2) {
        if (f < this.f231a) {
            this.f231a = f;
        } else if (f > this.f233c) {
            this.f233c = f;
        }
        if (f2 < this.f232b) {
            this.f232b = f2;
        } else if (f2 > this.f234d) {
            this.f234d = f2;
        }
    }

    /* renamed from: g */
    public void m4108g() {
        if (this.f231a > this.f233c) {
            float f = this.f231a;
            this.f231a = this.f233c;
            this.f233c = f;
        }
        if (this.f232b > this.f234d) {
            float f2 = this.f232b;
            this.f232b = this.f234d;
            this.f234d = f2;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f231a);
        parcel.writeFloat(this.f232b);
        parcel.writeFloat(this.f233c);
        parcel.writeFloat(this.f234d);
    }

    /* renamed from: a */
    public void m4118a(Parcel parcel) {
        this.f231a = parcel.readFloat();
        this.f232b = parcel.readFloat();
        this.f233c = parcel.readFloat();
        this.f234d = parcel.readFloat();
    }
}
