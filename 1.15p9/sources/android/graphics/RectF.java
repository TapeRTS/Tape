package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: game-lib.jar:android/graphics/RectF.class */
public class RectF implements Parcelable {

    /* renamed from: a */
    public float f234a;

    /* renamed from: b */
    public float f235b;

    /* renamed from: c */
    public float f236c;

    /* renamed from: d */
    public float f237d;

    /* renamed from: e */
    public static final Parcelable.Creator f238e = new Parcelable.Creator() { // from class: android.graphics.RectF.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RectF mo6750createFromParcel(Parcel parcel) {
            RectF rectF = new RectF();
            rectF.m6430a(parcel);
            return rectF;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public RectF[] mo6749newArray(int i) {
            return new RectF[i];
        }
    };

    public RectF() {
    }

    public RectF(float f, float f2, float f3, float f4) {
        this.f234a = f;
        this.f235b = f2;
        this.f236c = f3;
        this.f237d = f4;
    }

    public RectF(RectF rectF) {
        this.f234a = rectF.f234a;
        this.f235b = rectF.f235b;
        this.f236c = rectF.f236c;
        this.f237d = rectF.f237d;
    }

    public RectF(Rect rect) {
        this.f234a = rect.f230a;
        this.f235b = rect.f231b;
        this.f236c = rect.f232c;
        this.f237d = rect.f233d;
    }

    public String toString() {
        return "RectF(" + this.f234a + ", " + this.f235b + ", " + this.f236c + ", " + this.f237d + ")";
    }

    /* renamed from: a */
    public final boolean m6436a() {
        return this.f234a >= this.f236c || this.f235b >= this.f237d;
    }

    /* renamed from: b */
    public final float m6429b() {
        return this.f236c - this.f234a;
    }

    /* renamed from: c */
    public final float m6425c() {
        return this.f237d - this.f235b;
    }

    /* renamed from: d */
    public final float m6423d() {
        return (this.f234a + this.f236c) * 0.5f;
    }

    /* renamed from: e */
    public final float m6422e() {
        return (this.f235b + this.f237d) * 0.5f;
    }

    /* renamed from: f */
    public void m6421f() {
        this.f237d = 0.0f;
        this.f235b = 0.0f;
        this.f236c = 0.0f;
        this.f234a = 0.0f;
    }

    /* renamed from: a */
    public void m6434a(float f, float f2, float f3, float f4) {
        this.f234a = f;
        this.f235b = f2;
        this.f236c = f3;
        this.f237d = f4;
    }

    /* renamed from: a */
    public void m6432a(RectF rectF) {
        this.f234a = rectF.f234a;
        this.f235b = rectF.f235b;
        this.f236c = rectF.f236c;
        this.f237d = rectF.f237d;
    }

    /* renamed from: a */
    public void m6433a(Rect rect) {
        this.f234a = rect.f230a;
        this.f235b = rect.f231b;
        this.f236c = rect.f232c;
        this.f237d = rect.f233d;
    }

    /* renamed from: a */
    public void m6435a(float f, float f2) {
        this.f234a += f;
        this.f235b += f2;
        this.f236c += f;
        this.f237d += f2;
    }

    /* renamed from: b */
    public boolean m6428b(float f, float f2) {
        return this.f234a < this.f236c && this.f235b < this.f237d && f >= this.f234a && f < this.f236c && f2 >= this.f235b && f2 < this.f237d;
    }

    /* renamed from: b */
    public boolean m6427b(float f, float f2, float f3, float f4) {
        if (this.f234a < f3 && f < this.f236c && this.f235b < f4 && f2 < this.f237d) {
            if (this.f234a < f) {
                this.f234a = f;
            }
            if (this.f235b < f2) {
                this.f235b = f2;
            }
            if (this.f236c > f3) {
                this.f236c = f3;
            }
            if (this.f237d > f4) {
                this.f237d = f4;
                return true;
            }
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean m6426b(RectF rectF) {
        return m6427b(rectF.f234a, rectF.f235b, rectF.f236c, rectF.f237d);
    }

    /* renamed from: a */
    public static boolean m6431a(RectF rectF, RectF rectF2) {
        return rectF.f234a < rectF2.f236c && rectF2.f234a < rectF.f236c && rectF.f235b < rectF2.f237d && rectF2.f235b < rectF.f237d;
    }

    /* renamed from: c */
    public void m6424c(float f, float f2) {
        if (f < this.f234a) {
            this.f234a = f;
        } else if (f > this.f236c) {
            this.f236c = f;
        }
        if (f2 < this.f235b) {
            this.f235b = f2;
        } else if (f2 > this.f237d) {
            this.f237d = f2;
        }
    }

    /* renamed from: g */
    public void m6420g() {
        if (this.f234a > this.f236c) {
            float f = this.f234a;
            this.f234a = this.f236c;
            this.f236c = f;
        }
        if (this.f235b > this.f237d) {
            float f2 = this.f235b;
            this.f235b = this.f237d;
            this.f237d = f2;
        }
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f234a);
        parcel.writeFloat(this.f235b);
        parcel.writeFloat(this.f236c);
        parcel.writeFloat(this.f237d);
    }

    /* renamed from: a */
    public void m6430a(Parcel parcel) {
        this.f234a = parcel.readFloat();
        this.f235b = parcel.readFloat();
        this.f236c = parcel.readFloat();
        this.f237d = parcel.readFloat();
    }
}
