package org.p048a.p049a.p053d;

import org.p048a.p049a.p050a.AbstractC0928d;
import org.p048a.p049a.p052c.AbstractC0935d;
import org.p048a.p049a.p054e.AbstractC0943d;

/* renamed from: org.a.a.d.d */
/* loaded from: game-lib.jar:org/a/a/d/d.class */
public interface AbstractC0939d extends AbstractC0928d, AbstractC0938c {
    @Override // org.p048a.p049a.p050a.AbstractC0928d, org.p048a.p049a.p051b.AbstractC0931c
    /* renamed from: a */
    AbstractC0935d iterator();

    /* renamed from: b */
    AbstractC0943d listIterator();

    /* renamed from: a */
    AbstractC0943d listIterator(int i);

    /* renamed from: a */
    AbstractC0939d subList(int i, int i2);

    @Deprecated
    /* renamed from: b */
    Short remove(int i);
}
