package com.corrodinggames.rts.java.audio.p044a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.java.audio.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/j.class */
public class C0873j extends C0875l implements Iterable, Iterator {

    /* renamed from: f */
    private C0874k f5932f = new C0874k();

    @Override // com.corrodinggames.rts.java.audio.p044a.C0875l
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo295b() {
        super.mo295b();
    }

    public C0873j(C0872i iVar) {
        super(iVar);
    }

    /* renamed from: a */
    public C0874k next() {
        if (!this.f5935a) {
            throw new NoSuchElementException();
        } else if (!this.f5939e) {
            throw new C0866c("#iterator() cannot be used nested.");
        } else {
            long[] jArr = this.f5936b.f5918b;
            if (this.f5937c == -1) {
                this.f5932f.f5933a = 0L;
                this.f5932f.f5934b = this.f5936b.f5922f;
            } else {
                this.f5932f.f5933a = jArr[this.f5937c];
                this.f5932f.f5934b = this.f5936b.f5919c[this.f5937c];
            }
            this.f5938d = this.f5937c;
            m294c();
            return this.f5932f;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f5939e) {
            return this.f5935a;
        }
        throw new C0866c("#iterator() cannot be used nested.");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    @Override // com.corrodinggames.rts.java.audio.p044a.C0875l, java.util.Iterator
    public void remove() {
        super.remove();
    }
}
