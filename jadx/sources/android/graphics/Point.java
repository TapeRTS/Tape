package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: game-lib.jar:android/graphics/Point.class */
public class Point implements Parcelable {

    /* renamed from: a */
    public int f221a;

    /* renamed from: b */
    public int f222b;

    /* renamed from: c */
    public static final Parcelable.Creator f223c = new Parcelable.Creator() { // from class: android.graphics.Point.1
        /* renamed from: a */
        public Point createFromParcel(Parcel parcel) {
            Point point = new Point();
            point.m4144a(parcel);
            return point;
        }

        /* renamed from: a */
        public Point[] newArray(int i) {
            return new Point[i];
        }
    };

    public Point() {
    }

    public Point(int i, int i2) {
        this.f221a = i;
        this.f222b = i2;
    }

    /* renamed from: a */
    public void m4145a(int i, int i2) {
        this.f221a = i;
        this.f222b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return this.f221a == point.f221a && this.f222b == point.f222b;
    }

    public int hashCode() {
        return (31 * this.f221a) + this.f222b;
    }

    public String toString() {
        return "Point(" + this.f221a + ", " + this.f222b + ")";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f221a);
        parcel.writeInt(this.f222b);
    }

    /* renamed from: a */
    public void m4144a(Parcel parcel) {
        this.f221a = parcel.readInt();
        this.f222b = parcel.readInt();
    }
}
