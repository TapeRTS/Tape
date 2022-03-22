package com.corrodinggames.rts.java.audio.p044a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.java.audio.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/f.class */
public class C0869f extends C0871h implements Iterable, Iterator {

    /* renamed from: f */
    private C0870g f5909f = new C0870g();

    @Override // com.corrodinggames.rts.java.audio.p044a.C0871h
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo314b() {
        super.mo314b();
    }

    public C0869f(C0868e eVar) {
        super(eVar);
    }

    /* renamed from: a */
    public C0870g next() {
        if (!this.f5912a) {
            throw new NoSuchElementException();
        } else if (!this.f5916e) {
            throw new C0866c("#iterator() cannot be used nested.");
        } else {
            int[] iArr = this.f5913b.f5895b;
            if (this.f5914c == -1) {
                this.f5909f.f5910a = 0;
                this.f5909f.f5911b = this.f5913b.f5899f;
            } else {
                this.f5909f.f5910a = iArr[this.f5914c];
                this.f5909f.f5911b = this.f5913b.f5896c[this.f5914c];
            }
            this.f5915d = this.f5914c;
            m313c();
            return this.f5909f;
        }
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (this.f5916e) {
            return this.f5912a;
        }
        throw new C0866c("#iterator() cannot be used nested.");
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    @Override // com.corrodinggames.rts.java.audio.p044a.C0871h, java.util.Iterator
    public void remove() {
        super.remove();
    }
}
