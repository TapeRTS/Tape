package com.corrodinggames.rts.java.audio.p050a;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.java.audio.a.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/j.class */
public class C1139j extends C1141l implements Iterable, Iterator {

    /* renamed from: f */
    private C1140k f7044f;

    @Override // com.corrodinggames.rts.java.audio.p050a.C1141l
    /* renamed from: b */
    public /* bridge */ /* synthetic */ void mo332b() {
        super.mo332b();
    }

    public C1139j(C1138i c1138i) {
        super(c1138i);
        this.f7044f = new C1140k();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public C1140k next() {
        if (!this.f7047a) {
            throw new NoSuchElementException();
        }
        if (!this.f7051e) {
            throw new C1132c("#iterator() cannot be used nested.");
        }
        long[] jArr = this.f7048b.f7030b;
        if (this.f7049c == -1) {
            this.f7044f.f7045a = 0L;
            this.f7044f.f7046b = this.f7048b.f7034f;
        } else {
            this.f7044f.f7045a = jArr[this.f7049c];
            this.f7044f.f7046b = this.f7048b.f7031c[this.f7049c];
        }
        this.f7050d = this.f7049c;
        m331c();
        return this.f7044f;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f7051e) {
            throw new C1132c("#iterator() cannot be used nested.");
        }
        return this.f7047a;
    }

    @Override // java.lang.Iterable
    public Iterator iterator() {
        return this;
    }

    @Override // com.corrodinggames.rts.java.audio.p050a.C1141l, java.util.Iterator
    public void remove() {
        super.remove();
    }
}
