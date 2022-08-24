package com.corrodinggames.rts.gameFramework.p044l;

import android.content.Context;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.RectF;
import java.io.File;
import java.io.InputStream;
import java.util.concurrent.locks.Lock;

/* renamed from: com.corrodinggames.rts.gameFramework.l.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/y.class */
public interface InterfaceC1027y {
    /* renamed from: b */
    InterfaceC1027y mo891b(BitmapOrTexture bitmapOrTexture);

    /* renamed from: a */
    InterfaceC1027y mo917a(BitmapOrTexture bitmapOrTexture);

    /* renamed from: a */
    boolean mo936a();

    /* renamed from: a */
    void mo925a(Context context);

    /* renamed from: b */
    void mo897b();

    /* renamed from: d */
    InterfaceC0941l mo885d();

    /* renamed from: a */
    void mo906a(InterfaceC0941l interfaceC0941l);

    /* renamed from: a */
    void mo919a(C0923a c0923a);

    /* renamed from: a */
    BitmapOrTexture loadImage(int i);

    /* renamed from: a */
    BitmapOrTexture mo926a(int i, boolean z);

    /* renamed from: a */
    BitmapOrTexture mo904a(InputStream inputStream, boolean z);

    /* renamed from: a */
    BitmapOrTexture mo928a(int i, int i2, boolean z);

    /* renamed from: b */
    BitmapOrTexture mo893b(int i, int i2, boolean z);

    /* renamed from: e */
    void mo884e();

    /* renamed from: a */
    void mo916a(BitmapOrTexture bitmapOrTexture, float f, float f2, float f3, Paint paint);

    /* renamed from: a */
    void mo913a(BitmapOrTexture bitmapOrTexture, Rect rect, float f, float f2, float f3, Paint paint);

    /* renamed from: a */
    void mo910a(BitmapOrTexture bitmapOrTexture, Rect rect, Rect rect2, Paint paint);

    /* renamed from: a */
    void mo909a(BitmapOrTexture bitmapOrTexture, Rect rect, RectF rectF, Paint paint);

    /* renamed from: a */
    void mo915a(BitmapOrTexture bitmapOrTexture, float f, float f2, Paint paint);

    /* renamed from: a */
    void mo914a(BitmapOrTexture bitmapOrTexture, float f, float f2, Paint paint, float f3, float f4);

    /* renamed from: b */
    void mo890b(BitmapOrTexture bitmapOrTexture, float f, float f2, Paint paint);

    /* renamed from: b */
    void mo889b(BitmapOrTexture bitmapOrTexture, Rect rect, Rect rect2, Paint paint);

    /* renamed from: a */
    void mo922a(Rect rect, Paint paint);

    /* renamed from: a */
    void mo899a(boolean z);

    /* renamed from: f */
    void mo883f();

    /* renamed from: a */
    void mo912a(BitmapOrTexture bitmapOrTexture, Rect rect, Paint paint);

    /* renamed from: a */
    void mo911a(BitmapOrTexture bitmapOrTexture, Rect rect, Paint paint, int i, int i2, int i3, int i4);

    /* renamed from: a */
    void mo908a(BitmapOrTexture bitmapOrTexture, RectF rectF, Paint paint, float f, float f2, int i, int i2);

    /* renamed from: b */
    void mo894b(int i);

    /* renamed from: a */
    void mo927a(int i, PorterDuff.Mode mode);

    /* renamed from: a */
    void mo902a(String str, float f, float f2, Paint paint, Paint paint2, float f3);

    /* renamed from: a */
    void mo903a(String str, float f, float f2, Paint paint);

    /* renamed from: b */
    void mo892b(Rect rect, Paint paint);

    /* renamed from: a */
    void mo920a(RectF rectF, Paint paint);

    /* renamed from: g */
    void mo882g();

    /* renamed from: h */
    void mo881h();

    /* renamed from: c */
    void mo886c(Rect rect, Paint paint);

    /* renamed from: a */
    void mo923a(Rect rect);

    /* renamed from: a */
    void mo921a(RectF rectF);

    /* renamed from: a */
    void mo931a(float f, float f2, float f3, Paint paint);

    /* renamed from: b */
    void mo895b(float f, float f2, float f3, Paint paint);

    /* renamed from: a */
    void mo898a(float[] fArr, int i, int i2, Paint paint);

    /* renamed from: i */
    void mo880i();

    /* renamed from: j */
    void mo879j();

    /* renamed from: k */
    void mo878k();

    /* renamed from: l */
    void mo877l();

    /* renamed from: a */
    void mo934a(float f, float f2, float f3);

    /* renamed from: a */
    void mo935a(float f, float f2);

    /* renamed from: a */
    void mo933a(float f, float f2, float f3, float f4);

    /* renamed from: b */
    void mo896b(float f, float f2);

    /* renamed from: a */
    void mo905a(AbstractC0942m abstractC0942m);

    /* renamed from: a */
    void mo932a(float f, float f2, float f3, float f4, Paint paint);

    /* renamed from: m */
    int mo876m();

    /* renamed from: n */
    int mo875n();

    /* renamed from: a */
    void mo929a(int i, int i2);

    /* renamed from: o */
    void mo874o();

    /* renamed from: a */
    void mo924a(Paint paint);

    /* renamed from: p */
    void mo873p();

    /* renamed from: q */
    void mo872q();

    /* renamed from: a */
    int mo901a(String str, Paint paint);

    /* renamed from: b */
    int mo888b(String str, Paint paint);

    /* renamed from: r */
    BitmapOrTexture mo871r();

    /* renamed from: a */
    void mo907a(BitmapOrTexture bitmapOrTexture, File file);

    /* renamed from: a */
    void mo900a(Lock lock);

    /* renamed from: b */
    void mo887b(Lock lock);

    /* renamed from: a */
    void mo918a(C0928ae c0928ae);
}
