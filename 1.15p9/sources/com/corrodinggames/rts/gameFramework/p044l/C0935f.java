package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Paint;
import android.graphics.PorterDuff;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.l.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/f.class */
public class C0935f {

    /* renamed from: a */
    public C0934e f6406a;

    /* renamed from: b */
    public InterfaceC1027y f6407b;

    /* renamed from: c */
    public Paint f6408c;

    /* renamed from: e */
    boolean f6410e;

    /* renamed from: f */
    int f6411f;

    /* renamed from: d */
    int f6409d = 0;

    /* renamed from: g */
    boolean f6412g = false;

    /* renamed from: h */
    int f6413h = 0;

    /* renamed from: i */
    int f6414i = 0;

    /* renamed from: j */
    int f6415j = 0;

    /* renamed from: k */
    int f6416k = 1;

    /* renamed from: l */
    HashMap f6417l = new HashMap();

    /* renamed from: m */
    ArrayList f6418m = new ArrayList();

    public C0935f(int i, int i2) {
        m1022a(i, i2);
    }

    /* renamed from: a */
    public void m1022a(int i, int i2) {
        GameEngine m1228A = GameEngine.m1228A();
        GameEngine.PrintLog("Creating BitmapOrTextureAlias: " + i + "x" + i2);
        this.f6406a = m1228A.f6107bO.mo922a(i, i2, true);
        this.f6407b = m1228A.f6107bO.mo885b(this.f6406a);
        this.f6408c = new C0930ag();
        this.f6408c.m6503a(new C1024v(EnumC1025w.copy));
    }

    /* renamed from: a */
    public void m1020a(C0934e c0934e, int i, int i2) {
        this.f6407b.mo884b(c0934e, i, i2, this.f6408c);
        this.f6407b.mo867p();
    }

    /* renamed from: a */
    public void m1023a() {
        this.f6407b.mo921a(0, PorterDuff.Mode.CLEAR);
    }

    /* renamed from: b */
    public void m1019b() {
        this.f6409d = 0;
        this.f6410e = false;
        this.f6411f = 0;
        this.f6413h = 0;
        this.f6414i = 0;
        this.f6415j = 0;
        this.f6417l.clear();
        m1023a();
    }

    /* renamed from: c */
    public void m1017c() {
        this.f6411f++;
        if (this.f6410e && this.f6411f > 600) {
            this.f6412g = true;
            this.f6418m.clear();
        }
    }

    /* renamed from: d */
    public void m1016d() {
        if (this.f6412g) {
            this.f6412g = false;
            m1019b();
            Iterator it = this.f6418m.iterator();
            while (it.hasNext()) {
                m1021a((C0934e) it.next());
            }
            this.f6418m.clear();
        }
    }

    /* renamed from: a */
    public C0936g m1021a(C0934e c0934e) {
        C0936g c0936g = (C0936g) this.f6417l.get(c0934e);
        if (c0936g != null) {
            if (this.f6412g) {
                this.f6418m.add(c0934e);
            }
            if (c0936g.f6424f != c0934e.f6387e) {
                GameEngine.PrintLog("BitmapOrTextureAlias: Image was updated: " + c0934e.mo407a());
                this.f6417l.remove(c0934e);
            } else {
                return c0936g;
            }
        }
        C0936g m1018b = m1018b(c0934e);
        if (m1018b != null) {
            return m1018b;
        }
        return null;
    }

    /* renamed from: b */
    public C0936g m1018b(C0934e c0934e) {
        int mo390m = c0934e.mo390m();
        int mo391l = c0934e.mo391l();
        int mo390m2 = this.f6406a.mo390m();
        int mo391l2 = this.f6406a.mo391l();
        if (this.f6413h + mo390m > mo390m2) {
            this.f6413h = 0;
            this.f6414i += this.f6415j + this.f6416k;
            this.f6415j = 0;
        }
        if (this.f6414i + mo391l > mo391l2) {
            if (!this.f6410e) {
                this.f6410e = true;
                return null;
            }
            return null;
        }
        C0936g c0936g = new C0936g();
        c0936g.f6419a = this.f6406a;
        int i = this.f6413h;
        int i2 = this.f6414i;
        this.f6413h += mo390m + this.f6416k;
        if (this.f6415j < mo391l) {
            this.f6415j = mo391l;
        }
        m1020a(c0934e, i, i2);
        c0936g.f6420b = i;
        c0936g.f6421c = i2;
        c0936g.f6422d = mo390m;
        c0936g.f6423e = mo391l;
        c0936g.f6424f = c0934e.f6387e;
        this.f6409d++;
        this.f6417l.put(c0934e, c0936g);
        return c0936g;
    }
}
