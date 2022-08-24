package android.graphics;

import android.os.Parcel;
import android.os.Parcelable;

/* loaded from: game-lib.jar:android/graphics/PointF.class */
public class PointF implements Parcelable {

    /* renamed from: a */
    public float x;

    /* renamed from: b */
    public float y;

    public PointF() {
    }

    public PointF(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    /* renamed from: a */
    public final void m7213a(float f, float f2) {
        this.x = f;
        this.y = f2;
    }

    /* renamed from: a */
    public final void m7212a(PointF pointF) {
        this.x = pointF.x;
        this.y = pointF.y;
    }

    /* renamed from: b */
    public final void m7211b(float f, float f2) {
        this.x += f;
        this.y += f2;
    }

    public int describeContents() {
        return 0;
    }

    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
    }
}
