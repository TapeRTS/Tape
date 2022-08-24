package com.corrodinggames.rts.gameFramework.p031b;

import android.graphics.Bitmap;
import java.util.ArrayList;
import java.util.HashMap;

/* renamed from: com.corrodinggames.rts.gameFramework.b.ac */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/ac.class */
public class C0682ac {

    /* renamed from: a */
    public InterfaceC0700k f4314a;

    /* renamed from: b */
    public C0683ad f4315b;

    /* renamed from: c */
    public static Bitmap f4316c = Bitmap.m6562a(64, 64, Bitmap.Config.ARGB_8888);

    /* renamed from: g */
    boolean f4317g;

    /* renamed from: d */
    HashMap f4318d = new HashMap();

    /* renamed from: e */
    ArrayList f4319e = new ArrayList();

    /* renamed from: f */
    int f4320f = 0;

    /* renamed from: h */
    boolean f4321h = false;

    /* renamed from: i */
    int f4322i = 0;

    /* renamed from: j */
    int f4323j = 0;

    /* renamed from: k */
    int f4324k = 0;

    /* renamed from: l */
    int f4325l = 1;

    public C0682ac(InterfaceC0700k interfaceC0700k, int i, int i2) {
        this.f4314a = interfaceC0700k;
        this.f4315b = new C0683ad(interfaceC0700k, i, i2);
    }

    /* renamed from: a */
    public AbstractC0690b m2826a(Bitmap bitmap) {
        C0684ae c0684ae = (C0684ae) this.f4318d.get(bitmap);
        if (c0684ae != null) {
            if (this.f4321h) {
                this.f4319e.add(bitmap);
            }
            return c0684ae;
        }
        int m6553b = bitmap.m6553b();
        int m6550c = bitmap.m6550c();
        int b = this.f4315b.mo2807b();
        int c = this.f4315b.mo2806c();
        if (this.f4322i + m6553b > b) {
            this.f4322i = 0;
            this.f4323j += this.f4324k + this.f4325l;
            this.f4324k = 0;
        }
        if (this.f4323j + m6550c > c) {
            if (!this.f4317g) {
                this.f4317g = true;
                return null;
            }
            return null;
        }
        C0684ae c0684ae2 = new C0684ae();
        c0684ae2.f4346a = this.f4315b.f4346a;
        c0684ae2.f4327l = this.f4315b;
        int i = this.f4322i;
        int i2 = this.f4323j;
        this.f4322i += m6553b + this.f4325l;
        if (this.f4324k < m6550c) {
            this.f4324k = m6550c;
        }
        this.f4315b.m2824a(this.f4314a, bitmap, i, i2);
        c0684ae2.f4330o = i;
        c0684ae2.f4331p = i2;
        c0684ae2.f4328m = i / this.f4315b.f4350e;
        c0684ae2.f4329n = i2 / this.f4315b.f4351f;
        c0684ae2.f4350e = this.f4315b.f4350e;
        c0684ae2.f4351f = this.f4315b.f4351f;
        c0684ae2.f4352g = this.f4315b.f4352g;
        c0684ae2.f4353h = this.f4315b.f4353h;
        c0684ae2.f4348c = m6553b;
        c0684ae2.f4349d = m6550c;
        this.f4320f++;
        this.f4318d.put(bitmap, c0684ae2);
        return c0684ae2;
    }

    /* renamed from: b */
    public void m2825b(Bitmap bitmap) {
        if (((C0684ae) this.f4318d.get(bitmap)) != null) {
            this.f4318d.remove(bitmap);
        }
    }
}
