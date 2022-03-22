package org.p048a.p049a.p053d;

import org.p048a.p049a.p050a.AbstractC0925a;
import org.p048a.p049a.p052c.AbstractC0932a;
import org.p048a.p049a.p054e.AbstractC0940a;

/* renamed from: org.a.a.d.a */
/* loaded from: game-lib.jar:org/a/a/d/a.class */
public interface AbstractC0936a extends AbstractC0925a, AbstractC0938c {
    @Override // org.p048a.p049a.p050a.AbstractC0925a, org.p048a.p049a.p051b.AbstractC0929a
    /* renamed from: a */
    AbstractC0932a iterator();

    /* renamed from: b */
    AbstractC0940a listIterator();

    /* renamed from: a */
    AbstractC0940a listIterator(int i);

    /* renamed from: a */
    AbstractC0936a subList(int i, int i2);

    @Deprecated
    /* renamed from: b */
    Float remove(int i);
}
