package com.corrodinggames.rts.gameFramework.p037f.p038a;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p037f.C0795d;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/h.class */
public class C0771h extends AbstractC0773j {

    /* renamed from: a */
    String f5019a;

    /* renamed from: b */
    Paint f5020b = new C0930ag();

    /* renamed from: c */
    C0770g f5021c = C0770g.f5013c;

    /* renamed from: d */
    ArrayList f5022d;

    public C0771h() {
        this.f5020b.m6502a(Paint.Align.CENTER);
        this.f5020b.m6481b(-16777216);
        m2159a(18.0f);
    }

    /* renamed from: a */
    public void m2159a(float f) {
        GameEngine.m1228A().m1191a(this.f5020b, f);
        m2135e();
    }

    /* renamed from: a */
    public void m2158a(int i) {
        this.f5020b.m6481b(i);
    }

    /* renamed from: a */
    public String m2160a() {
        return super.m2153a() + " (text:" + this.f5019a + ")";
    }

    /* renamed from: a */
    public void mo2128a(float f, float f2) {
        int m2080a;
        super.mo2128a(f, f2);
        InterfaceC1027y d = m2137d();
        RectF a = m2149a(new RectF(), f, f2);
        this.f5021c.m2162a(d, a);
        if (this.f5019a == null) {
            return;
        }
        if (this.f5022d == null) {
            d.mo897a(this.f5019a, a.m6423d(), a.f237d - this.f5030l, this.f5020b);
            return;
        }
        int i = 0;
        Iterator it = this.f5022d.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Paint paint = this.f5020b;
            d.mo897a(str, a.m6423d(), a.f235b + this.f5029k + C0795d.m2080a(paint) + (i * m2080a), paint);
            i++;
        }
    }

    /* renamed from: a */
    public void m2157a(String str) {
        this.f5019a = str;
        m2135e();
    }

    /* renamed from: c */
    public Rect m2155c() {
        RectF a = m2149a(new RectF(), 0.0f, 0.0f);
        Rect rect = new Rect();
        rect.f233d = (int) a.f237d;
        rect.f231b = (int) a.f235b;
        rect.f230a = (int) a.f234a;
        rect.f232c = (int) a.f236c;
        rect.f232c = 10000;
        return rect;
    }

    /* renamed from: b */
    public void mo2164b() {
        Rect m2155c;
        super.mo2164b();
        m2137d();
        this.f5022d = new ArrayList(C0795d.m2076a(this.f5019a, m2155c(), this.f5020b, this.f5020b, true));
        this.f5027i = m2155c.m6445b();
        this.f5028j = m2155c.m6441c();
        this.f5027i += this.f5031m + this.f5032n;
        this.f5028j += this.f5029k + this.f5030l;
    }
}
