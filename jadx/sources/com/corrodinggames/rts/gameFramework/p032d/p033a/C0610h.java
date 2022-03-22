package com.corrodinggames.rts.gameFramework.p032d.p033a;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p032d.C0621d;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0760q;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/a/h.class */
public class C0610h extends AbstractC0612j {

    /* renamed from: a */
    String f4221a;

    /* renamed from: b */
    Paint f4222b = new C0760q();

    /* renamed from: c */
    C0609g f4223c = C0609g.f4215c;

    /* renamed from: d */
    ArrayList f4224d;

    public C0610h() {
        this.f4222b.m4186a(Paint.Align.CENTER);
        this.f4222b.m4169b(-16777216);
        m1804a(18.0f);
    }

    /* renamed from: a */
    public void m1804a(float f) {
        AbstractC0789l.m638u().m723a(this.f4222b, f);
        m1782e();
    }

    /* renamed from: a */
    public void m1803a(int i) {
        this.f4222b.m4169b(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.p032d.p033a.AbstractC0612j
    /* renamed from: a */
    public String mo1800a() {
        return super.mo1800a() + " (text:" + this.f4221a + ")";
    }

    @Override // com.corrodinggames.rts.gameFramework.p032d.p033a.AbstractC0612j
    /* renamed from: a */
    public void mo1775a(float f, float f2) {
        int a;
        super.mo1775a(f, f2);
        AbstractC0755l d = m1784d();
        RectF a2 = m1796a(new RectF(), f, f2);
        this.f4223c.m1806a(d, a2);
        if (this.f4221a != null) {
            if (this.f4224d == null) {
                d.mo158a(this.f4221a, a2.m4111d(), a2.f234d - this.f4232l, this.f4222b);
                return;
            }
            int i = 0;
            Iterator it = this.f4224d.iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                Paint paint = this.f4222b;
                d.mo158a(str, a2.m4111d(), a2.f232b + this.f4231k + C0621d.m1766a(paint) + (i * a), paint);
                i++;
            }
        }
    }

    /* renamed from: a */
    public void m1802a(String str) {
        this.f4221a = str;
        m1782e();
    }

    /* renamed from: c */
    public Rect m1801c() {
        RectF a = m1796a(new RectF(), 0.0f, 0.0f);
        Rect rect = new Rect();
        rect.f230d = (int) a.f234d;
        rect.f228b = (int) a.f232b;
        rect.f227a = (int) a.f231a;
        rect.f229c = (int) a.f233c;
        rect.f229c = 10000;
        return rect;
    }

    @Override // com.corrodinggames.rts.gameFramework.p032d.p033a.AbstractC0612j
    /* renamed from: b */
    public void mo1791b() {
        Rect c;
        super.mo1791b();
        m1784d();
        this.f4224d = new ArrayList(C0621d.m1765a(this.f4221a, m1801c(), this.f4222b, this.f4222b, true));
        this.f4229i = c.m4134b();
        this.f4230j = c.m4130c();
        this.f4229i += this.f4233m + this.f4234n;
        this.f4230j += this.f4231k + this.f4232l;
    }
}
