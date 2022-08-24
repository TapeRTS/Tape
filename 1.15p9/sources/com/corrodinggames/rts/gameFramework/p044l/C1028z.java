package com.corrodinggames.rts.gameFramework.p044l;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.l.z */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/z.class */
public class C1028z implements InterfaceC1027y {

    /* renamed from: a */
    C0934e f6586a;

    /* renamed from: b */
    C0934e f6587b;

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public InterfaceC1027y mo911a(C0934e c0934e) {
        return mo885b(c0934e);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public InterfaceC1027y mo885b(C0934e c0934e) {
        return new C1028z();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public boolean mo930a() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo919a(Context context) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo891b() {
        this.f6586a = new C0934e();
        this.f6587b = new C0934e();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: d */
    public InterfaceC0941l mo879d() {
        return null;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo900a(InterfaceC0941l interfaceC0941l) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo913a(C0923a c0923a) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public C0934e mo924a(int i) {
        return mo920a(i, true);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public C0934e mo920a(int i, boolean z) {
        return new C0934e();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public C0934e mo898a(InputStream inputStream, boolean z) {
        return new C0934e();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public C0934e mo922a(int i, int i2, boolean z) {
        return mo887b(i, i2, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public C0934e mo887b(int i, int i2, boolean z) {
        return new C0934e();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: e */
    public void mo878e() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo910a(C0934e c0934e, float f, float f2, float f3, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo907a(C0934e c0934e, Rect rect, float f, float f2, float f3, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo904a(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo883b(C0934e c0934e, Rect rect, Rect rect2, Paint paint) {
        mo904a(c0934e, rect, rect2, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo916a(Rect rect, Paint paint) {
        mo886b(rect, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo893a(boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: f */
    public void mo877f() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo903a(C0934e c0934e, Rect rect, RectF rectF, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo909a(C0934e c0934e, float f, float f2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo908a(C0934e c0934e, float f, float f2, Paint paint, float f3, float f4) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo884b(C0934e c0934e, float f, float f2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo906a(C0934e c0934e, Rect rect, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo905a(C0934e c0934e, Rect rect, Paint paint, int i, int i2, int i3, int i4) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo902a(C0934e c0934e, RectF rectF, Paint paint, float f, float f2, int i, int i2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo888b(int i) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo921a(int i, PorterDuff.Mode mode) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo896a(String str, float f, float f2, Paint paint, Paint paint2, float f3) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo897a(String str, float f, float f2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo886b(Rect rect, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo914a(RectF rectF, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: g */
    public void mo876g() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: h */
    public void mo875h() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: c */
    public void mo880c(Rect rect, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo917a(Rect rect) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo915a(RectF rectF) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo925a(float f, float f2, float f3, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo889b(float f, float f2, float f3, Paint paint) {
        mo925a(f, f2, f3, paint);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo892a(float[] fArr, int i, int i2, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: i */
    public void mo874i() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: j */
    public void mo873j() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: k */
    public void mo872k() {
        mo874i();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: l */
    public void mo871l() {
        mo873j();
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo928a(float f, float f2, float f3) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo929a(float f, float f2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo927a(float f, float f2, float f3, float f4) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo890b(float f, float f2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo899a(AbstractC0942m abstractC0942m) {
        abstractC0942m.mo1001a(this);
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo926a(float f, float f2, float f3, float f4, Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: m */
    public int mo870m() {
        return 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: n */
    public int mo869n() {
        return 0;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo923a(int i, int i2) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: o */
    public void mo868o() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo918a(Paint paint) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo912a(C0928ae c0928ae) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: p */
    public void mo867p() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: q */
    public void mo866q() {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public int mo895a(String str, Paint paint) {
        return 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public int mo882b(String str, Paint paint) {
        return 1;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: r */
    public C0934e mo865r() {
        return this.f6587b;
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo901a(C0934e c0934e, File file) {
        throw new RuntimeException("writeImageToFile not yet supported");
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: a */
    public void mo894a(Lock lock) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y
    /* renamed from: b */
    public void mo881b(Lock lock) {
    }
}
