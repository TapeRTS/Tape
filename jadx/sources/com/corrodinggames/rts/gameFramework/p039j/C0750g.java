package com.corrodinggames.rts.gameFramework.p039j;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;

/* renamed from: com.corrodinggames.rts.gameFramework.j.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/g.class */
public class C0750g implements AbstractC0751h {

    /* renamed from: a */
    public Canvas f5259a;

    /* renamed from: b */
    boolean f5260b = false;

    public C0750g(Canvas canvas) {
        this.f5259a = canvas;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo861a(Rect rect) {
        this.f5259a.m4223a(rect);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo859a(RectF rectF) {
        this.f5259a.m4221a(rectF);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo865a(Bitmap bitmap, float f, float f2, Paint paint) {
        this.f5259a.m4227a(bitmap, f, f2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo864a(Bitmap bitmap, Matrix matrix, Paint paint) {
        this.f5259a.m4226a(bitmap, matrix, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo863a(Bitmap bitmap, Rect rect, Rect rect2, Paint paint) {
        this.f5259a.m4225a(bitmap, rect, rect2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo862a(Bitmap bitmap, Rect rect, RectF rectF, Paint paint) {
        this.f5259a.m4224a(bitmap, rect, rectF, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo869a(float f, float f2, float f3, Paint paint) {
        this.f5259a.m4231a(f, f2, f3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo867a(int i, PorterDuff.Mode mode) {
        this.f5259a.m4229a(i, mode);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo868a(int i) {
        this.f5259a.m4230a(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo870a(float f, float f2, float f3, float f4, Paint paint) {
        this.f5259a.m4232a(f, f2, f3, f4, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo854a(float[] fArr, int i, int i2, Paint paint) {
        this.f5259a.m4218a(fArr, i, i2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo860a(Rect rect, Paint paint) {
        this.f5259a.m4222a(rect, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo858a(RectF rectF, Paint paint) {
        this.f5259a.m4220a(rectF, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo856a(String str, float f, float f2, Paint paint) {
        this.f5259a.m4219a(str, f, f2, paint);
    }

    public boolean equals(Object obj) {
        return this.f5259a.equals(obj);
    }

    public int hashCode() {
        return this.f5259a.hashCode();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo874a() {
        this.f5259a.m4217b();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo872a(float f, float f2, float f3) {
        this.f5259a.m4234a(f, f2, f3);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: b */
    public void mo853b() {
        this.f5259a.m4236a();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo871a(float f, float f2, float f3, float f4) {
        this.f5259a.m4233a(f, f2, f3, f4);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo873a(float f, float f2) {
        this.f5259a.m4216b(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo866a(Bitmap bitmap) {
        this.f5259a.m4228a(bitmap);
    }

    public String toString() {
        return this.f5259a.toString();
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: b */
    public void mo852b(float f, float f2) {
        this.f5259a.m4235a(f, f2);
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo855a(boolean z) {
        this.f5260b = z;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: c */
    public boolean mo851c() {
        return this.f5260b;
    }

    @Override // com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h
    /* renamed from: a */
    public void mo857a(AbstractC0752i iVar) {
        iVar.mo875a(AbstractC0789l.m638u().f5514bw);
    }
}
