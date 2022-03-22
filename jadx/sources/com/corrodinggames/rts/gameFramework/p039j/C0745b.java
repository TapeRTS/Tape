package com.corrodinggames.rts.gameFramework.p039j;

import android.graphics.Rect;
import android.graphics.RectF;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.corrodinggames.rts.gameFramework.j.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/j/b.class */
public class C0745b {

    /* renamed from: a */
    EnumC0747d f5221a;

    /* renamed from: b */
    C0748e f5222b;

    /* renamed from: c */
    float f5223c;

    /* renamed from: d */
    float f5224d;

    /* renamed from: e */
    Rect f5225e;

    /* renamed from: f */
    RectF f5226f;

    /* renamed from: g */
    final /* synthetic */ C0744a f5227g;

    /* renamed from: a */
    void m878a(GL10 gl10) {
        if (this.f5227g.f5213i != this.f5222b.f5239e.intValue()) {
            gl10.glBindTexture(3553, this.f5222b.f5239e.intValue());
            this.f5227g.f5213i = this.f5222b.f5239e.intValue();
        }
        gl10.glPushMatrix();
        gl10.glLoadIdentity();
        if (this.f5221a == EnumC0747d.Rect) {
            gl10.glTranslatef(this.f5226f.f231a, (this.f5227g.f5207c - this.f5226f.f232b) - this.f5225e.m4130c(), 0.0f);
            C0758o oVar = this.f5227g.f5212h;
            float l = this.f5225e.f227a / this.f5222b.mo349l();
            float l2 = this.f5225e.f229c / this.f5222b.mo349l();
            float k = this.f5225e.f228b / this.f5222b.mo350k();
            float k2 = this.f5225e.f230d / this.f5222b.mo350k();
            if (this.f5227g.f5214j == this.f5225e.m4130c() && this.f5227g.f5215k == this.f5225e.m4134b()) {
                oVar.m842a(0, 0, l, k2);
                oVar.m842a(1, 0, l2, k2);
                oVar.m842a(0, 1, l, k);
                oVar.m842a(1, 1, l2, k);
            } else {
                this.f5227g.f5214j = this.f5225e.m4130c();
                this.f5227g.f5215k = this.f5225e.m4134b();
                oVar.m841a(0, 0, 0.0f, 0.0f, 0.0f, l, k2, null);
                oVar.m841a(1, 0, this.f5225e.m4134b(), 0.0f, 0.0f, l2, k2, null);
                oVar.m841a(0, 1, 0.0f, this.f5225e.m4130c(), 0.0f, l, k, null);
                oVar.m841a(1, 1, this.f5225e.m4134b(), this.f5225e.m4130c(), 0.0f, l2, k, null);
            }
            oVar.m838b(gl10, true, false);
            gl10.glPopMatrix();
            return;
        }
        gl10.glTranslatef(this.f5223c, (this.f5227g.f5207c - this.f5224d) - this.f5222b.mo350k(), 0.0f);
        throw new RuntimeException("Not supported");
    }
}
