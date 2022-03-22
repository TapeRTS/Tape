package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: game-lib.jar:android/graphics/PointF.class */
public class PointF implements Parcelable {

    /* renamed from: a */
    public float f224a;

    /* renamed from: b */
    public float f225b;

    public PointF() {
    }

    public PointF(float f, float f2) {
        this.f224a = f;
        this.f225b = f2;
    }

    /* renamed from: a */
    public final void m4141a(float f, float f2) {
        this.f224a = f;
        this.f225b = f2;
    }

    /* renamed from: a */
    public final void m4140a(PointF pointF) {
        this.f224a = pointF.f224a;
        this.f225b = pointF.f225b;
    }

    /* renamed from: b */
    public final void m4139b(float f, float f2) {
        this.f224a += f;
        this.f225b += f2;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.f224a);
        parcel.writeFloat(this.f225b);
    }
}
