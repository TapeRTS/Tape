package com.corrodinggames.rts.java.audio.p050a;

import java.util.NoSuchElementException;

/* renamed from: com.corrodinggames.rts.java.audio.a.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/audio/a/p.class */
public class C1145p extends AbstractC1147r {

    /* renamed from: a */
    C1146q f7067a;

    @Override // com.corrodinggames.rts.java.audio.p050a.AbstractC1147r, java.util.Iterator
    public /* bridge */ /* synthetic */ void remove() {
        super.remove();
    }

    @Override // com.corrodinggames.rts.java.audio.p050a.AbstractC1147r
    /* renamed from: c */
    public /* bridge */ /* synthetic */ void mo307c() {
        super.mo307c();
    }

    public C1145p(C1144o c1144o) {
        super(c1144o);
        this.f7067a = new C1146q();
    }

    @Override // java.util.Iterator
    /* renamed from: a */
    public C1146q next() {
        if (!this.f7070b) {
            throw new NoSuchElementException();
        }
        if (!this.f7074f) {
            throw new C1132c("#iterator() cannot be used nested.");
        }
        Object[] objArr = this.f7071c.f7055b;
        this.f7067a.f7068a = objArr[this.f7072d];
        this.f7067a.f7069b = this.f7071c.f7056c[this.f7072d];
        this.f7073e = this.f7072d;
        m306d();
        return this.f7067a;
    }

    @Override // java.util.Iterator
    public boolean hasNext() {
        if (!this.f7074f) {
            throw new C1132c("#iterator() cannot be used nested.");
        }
        return this.f7070b;
    }

    @Override // java.lang.Iterable
    /* renamed from: b */
    public C1145p iterator() {
        return this;
    }
}
