package com.corrodinggames.rts.java.audio.p050a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.java.audio.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/f.class */
public class C1135f extends C1137h implements Iterable, Iterator {

    /* renamed from: f */
    private C1136g f7021f;

    @Override // com.corrodinggames.rts.java.audio.p050a.C1137h
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo351b() {
        super.mo351b();
    }

    public C1135f(C1134e c1134e) {
        super(c1134e);
        this.f7021f = new C1136g();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public C1136g next() {
        if (!this.f7024a) {
            throw new NoSuchElementException();
        }
        if (!this.f7028e) {
            throw new C1132c("#iterator() cannot be used nested.");
        }
        int[] iArr = this.f7025b.f7007b;
        if (this.f7026c == -1) {
            this.f7021f.f7022a = 0;
            this.f7021f.f7023b = this.f7025b.f7011f;
        } else {
            this.f7021f.f7022a = iArr[this.f7026c];
            this.f7021f.f7023b = this.f7025b.f7008c[this.f7026c];
        }
        this.f7027d = this.f7026c;
        m350c();
        return this.f7021f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f7028e) {
            throw new C1132c("#iterator() cannot be used nested.");
        }
        return this.f7024a;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    @Override // com.corrodinggames.rts.java.audio.p050a.C1137h, java.util.Iterator
    public void remove() {
        super.remove();
    }
}
