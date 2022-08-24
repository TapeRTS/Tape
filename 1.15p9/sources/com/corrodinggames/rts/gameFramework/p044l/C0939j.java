package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.l.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/j.class */
public class C0939j implements InterfaceC0941l {

    /* renamed from: a */
    public Canvas f6439a;

    /* renamed from: b */
    boolean f6440b = false;

    public C0939j(Canvas canvas) {
        this.f6439a = canvas;
    }

    /* renamed from: a */
    public void mo991a(Rect rect) {
        this.f6439a.m6532a(rect);
    }

    /* renamed from: a */
    public void mo989a(RectF rectF) {
        this.f6439a.m6530a(rectF);
    }

    /* renamed from: a */
    public void mo985a(C0934e c0934e, float f, float f2, Paint paint) {
        this.f6439a.m6535a(C0924aa.m1085a(c0934e), f, f2, paint);
    }

    /* renamed from: a */
    public void mo984a(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        this.f6439a.m6534a(C0924aa.m1085a(c0934e), rect, rect2, paint);
    }

    /* renamed from: a */
    public void mo983a(C0934e c0934e, Rect rect, RectF rectF, Paint paint) {
        this.f6439a.m6533a(C0924aa.m1085a(c0934e), rect, rectF, paint);
    }

    /* renamed from: a */
    public void mo995a(float f, float f2, float f3, Paint paint) {
        this.f6439a.m6539a(f, f2, f3, paint);
    }

    /* renamed from: a */
    public void mo993a(int i, PorterDuff.Mode mode) {
        this.f6439a.m6537a(i, mode);
    }

    /* renamed from: a */
    public void mo994a(int i) {
        this.f6439a.m6538a(i);
    }

    /* renamed from: a */
    public void mo996a(float f, float f2, float f3, float f4, Paint paint) {
        this.f6439a.m6540a(f, f2, f3, f4, paint);
    }

    /* renamed from: a */
    public void mo978a(float[] fArr, int i, int i2, Paint paint) {
        this.f6439a.m6526a(fArr, i, i2, paint);
    }

    /* renamed from: a */
    public void mo990a(Rect rect, Paint paint) {
        this.f6439a.m6531a(rect, paint);
    }

    /* renamed from: a */
    public void mo988a(RectF rectF, Paint paint) {
        this.f6439a.m6529a(rectF, paint);
    }

    /* renamed from: a */
    public void mo981a(String str, float f, float f2, Paint paint) {
        this.f6439a.m6528a(str, f, f2, paint);
    }

    public boolean equals(Object obj) {
        return this.f6439a.equals(obj);
    }

    public int hashCode() {
        return this.f6439a.hashCode();
    }

    /* renamed from: a */
    public void mo1000a() {
        this.f6439a.m6525b();
    }

    /* renamed from: a */
    public void mo998a(float f, float f2, float f3) {
        this.f6439a.m6542a(f, f2, f3);
    }

    /* renamed from: b */
    public void mo977b() {
        this.f6439a.m6544a();
    }

    /* renamed from: a */
    public void mo997a(float f, float f2, float f3, float f4) {
        this.f6439a.m6541a(f, f2, f3, f4);
    }

    /* renamed from: a */
    public void mo999a(float f, float f2) {
        this.f6439a.m6524b(f, f2);
    }

    /* renamed from: a */
    public void mo986a(C0934e c0934e) {
        this.f6439a.m6536a(c0934e.mo398b());
    }

    public String toString() {
        return this.f6439a.toString();
    }

    /* renamed from: b */
    public void mo976b(float f, float f2) {
        this.f6439a.m6543a(f, f2);
    }

    /* renamed from: a */
    public void mo979a(boolean z) {
        this.f6440b = z;
    }

    /* renamed from: c */
    public boolean mo974c() {
        return this.f6440b;
    }

    /* renamed from: a */
    public void mo982a(AbstractC0942m abstractC0942m) {
        abstractC0942m.mo1001a(GameEngine.m1228A().f6107bO);
    }

    /* renamed from: a */
    public void mo992a(Bitmap bitmap) {
    }

    /* renamed from: a */
    public void mo980a(Lock lock) {
    }

    /* renamed from: b */
    public void mo975b(Lock lock) {
    }

    /* renamed from: a */
    public boolean mo987a(C0928ae c0928ae) {
        return false;
    }
}
