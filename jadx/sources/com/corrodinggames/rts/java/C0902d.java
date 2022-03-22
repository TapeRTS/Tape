package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0751h;
import com.corrodinggames.rts.gameFramework.p039j.C0744a;
import com.corrodinggames.rts.gameFramework.p039j.C0753j;
import com.corrodinggames.rts.p008a.AbstractC0068d;
import com.corrodinggames.rts.p008a.ActivityC0069e;
import com.corrodinggames.rts.p008a.C0091k;

/* renamed from: com.corrodinggames.rts.java.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/d.class */
public class C0902d implements AbstractC0068d {

    /* renamed from: a */
    public int f6013a;

    /* renamed from: b */
    public int f6014b;

    /* renamed from: d */
    C0091k f6016d;

    /* renamed from: e */
    public Object f6017e = new Object();

    /* renamed from: f */
    public Object f6018f = new Object();

    /* renamed from: g */
    C0753j f6019g = new C0753j();

    /* renamed from: c */
    ActivityC0907g f6015c = new ActivityC0907g();

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: l */
    public void mo210l() {
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: a */
    public void mo225a() {
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: b */
    public boolean mo221b() {
        return true;
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: c */
    public boolean mo219c() {
        return false;
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: d */
    public C0744a mo218d() {
        return null;
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: e */
    public boolean mo217e() {
        return false;
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: f */
    public boolean mo216f() {
        AbstractC0789l u = AbstractC0789l.m638u();
        if (u == null || !u.f5516by.slick2dFullScreen) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: g */
    public Object mo215g() {
        return null;
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: h */
    public int mo214h() {
        return this.f6013a;
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: i */
    public int mo213i() {
        return this.f6014b;
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: j */
    public void mo212j() {
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: k */
    public ActivityC0069e mo211k() {
        return this.f6015c;
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: m */
    public C0091k mo209m() {
        return this.f6016d;
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: a */
    public void mo224a(float f, int i) {
        synchronized (this.f6018f) {
            this.f6018f.notifyAll();
        }
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: b */
    public void mo220b(float f, int i) {
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: n */
    public void mo208n() {
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: a */
    public AbstractC0751h mo222a(boolean z) {
        return this.f6019g;
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: a */
    public void mo223a(AbstractC0751h hVar, boolean z) {
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: o */
    public void mo207o() {
    }

    @Override // com.corrodinggames.rts.p008a.AbstractC0068d
    /* renamed from: p */
    public boolean mo206p() {
        return true;
    }
}
