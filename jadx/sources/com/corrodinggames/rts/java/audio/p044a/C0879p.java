package com.corrodinggames.rts.java.audio.p044a;

import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.java.audio.a.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/p.class */
public class C0879p extends AbstractC0881r {

    /* renamed from: a */
    C0880q f5955a = new C0880q();

    @Override // com.corrodinggames.rts.java.audio.p044a.AbstractC0881r, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // com.corrodinggames.rts.java.audio.p044a.AbstractC0881r
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo270c() {
        super.mo270c();
    }

    public C0879p(C0878o oVar) {
        super(oVar);
    }

    /* renamed from: a */
    public C0880q next() {
        if (!this.f5958b) {
            throw new NoSuchElementException();
        } else if (!this.f5962f) {
            throw new C0866c("#iterator() cannot be used nested.");
        } else {
            Object[] objArr = this.f5959c.f5943b;
            this.f5955a.f5956a = objArr[this.f5960d];
            this.f5955a.f5957b = this.f5959c.f5944c[this.f5960d];
            this.f5961e = this.f5960d;
            m269d();
            return this.f5955a;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f5962f) {
            return this.f5958b;
        }
        throw new C0866c("#iterator() cannot be used nested.");
    }

    /* renamed from: b */
    public C0879p iterator() {
        return this;
    }
}
