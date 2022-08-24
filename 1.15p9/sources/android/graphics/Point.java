package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: game-lib.jar:android/graphics/Point.class */
public class Point implements Parcelable {

    /* renamed from: a */
    public int f224a;

    /* renamed from: b */
    public int f225b;

    /* renamed from: c */
    public static final Parcelable.Creator f226c = new Parcelable.Creator() { // from class: android.graphics.Point.1
        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Point mo6748createFromParcel(Parcel parcel) {
            Point point = new Point();
            point.m6455a(parcel);
            return point;
        }

        @Override // android.os.Parcelable.Creator
        /* renamed from: a */
        public Point[] mo6747newArray(int i) {
            return new Point[i];
        }
    };

    public Point() {
    }

    public Point(int i, int i2) {
        this.f224a = i;
        this.f225b = i2;
    }

    /* renamed from: a */
    public void m6456a(int i, int i2) {
        this.f224a = i;
        this.f225b = i2;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        Point point = (Point) obj;
        return this.f224a == point.f224a && this.f225b == point.f225b;
    }

    public int hashCode() {
        return (31 * this.f224a) + this.f225b;
    }

    public String toString() {
        return "Point(" + this.f224a + ", " + this.f225b + ")";
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeInt(this.f224a);
        parcel.writeInt(this.f225b);
    }

    /* renamed from: a */
    public void m6455a(Parcel parcel) {
        this.f224a = parcel.readInt();
        this.f225b = parcel.readInt();
    }
}
