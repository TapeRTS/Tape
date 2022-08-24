package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Rect;
import android.graphics.RectF;
import javax.microedition.khronos.opengles.GL10;

/* renamed from: com.corrodinggames.rts.gameFramework.l.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/b.class */
public class C0931b {

    /* renamed from: a */
    EnumC0933d f6370a;

    /* renamed from: b */
    C0934e f6371b;

    /* renamed from: c */
    float f6372c;

    /* renamed from: d */
    float f6373d;

    /* renamed from: e */
    Rect f6374e;

    /* renamed from: f */
    RectF f6375f;

    /* renamed from: g */
    final /* synthetic */ C0923a f6376g;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public void m1040a(GL10 gl10) {
        if (this.f6376g.f6299i != this.f6371b.f6390h.intValue()) {
            gl10.glBindTexture(3553, this.f6371b.f6390h.intValue());
            this.f6376g.f6299i = this.f6371b.f6390h.intValue();
        }
        gl10.glPushMatrix();
        gl10.glLoadIdentity();
        if (this.f6370a == EnumC0933d.Rect) {
            gl10.glTranslatef(this.f6375f.f234a, (this.f6376g.f6293c - this.f6375f.f235b) - this.f6374e.m6441c(), 0.0f);
            C0926ac c0926ac = this.f6376g.f6298h;
            float mo390m = this.f6374e.f230a / this.f6371b.mo390m();
            float mo390m2 = this.f6374e.f232c / this.f6371b.mo390m();
            float mo391l = this.f6374e.f231b / this.f6371b.mo391l();
            float mo391l2 = this.f6374e.f233d / this.f6371b.mo391l();
            if (this.f6376g.f6300j == this.f6374e.m6441c() && this.f6376g.f6301k == this.f6374e.m6445b()) {
                c0926ac.m1074a(0, 0, mo390m, mo391l2);
                c0926ac.m1074a(1, 0, mo390m2, mo391l2);
                c0926ac.m1074a(0, 1, mo390m, mo391l);
                c0926ac.m1074a(1, 1, mo390m2, mo391l);
            } else {
                this.f6376g.f6300j = this.f6374e.m6441c();
                this.f6376g.f6301k = this.f6374e.m6445b();
                c0926ac.m1073a(0, 0, 0.0f, 0.0f, 0.0f, mo390m, mo391l2, null);
                c0926ac.m1073a(1, 0, this.f6374e.m6445b(), 0.0f, 0.0f, mo390m2, mo391l2, null);
                c0926ac.m1073a(0, 1, 0.0f, this.f6374e.m6441c(), 0.0f, mo390m, mo391l, null);
                c0926ac.m1073a(1, 1, this.f6374e.m6445b(), this.f6374e.m6441c(), 0.0f, mo390m2, mo391l, null);
            }
            c0926ac.m1070b(gl10, true, false);
            gl10.glPopMatrix();
            return;
        }
        gl10.glTranslatef(this.f6372c, (this.f6376g.f6293c - this.f6373d) - this.f6371b.mo391l(), 0.0f);
        throw new RuntimeException("Not supported");
    }
}
