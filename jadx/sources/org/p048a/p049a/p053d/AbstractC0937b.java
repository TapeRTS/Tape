package org.p048a.p049a.p053d;

import org.p048a.p049a.p050a.AbstractC0926b;
import org.p048a.p049a.p052c.AbstractC0933b;
import org.p048a.p049a.p054e.AbstractC0941b;

/* renamed from: org.a.a.d.b */
/* loaded from: game-lib.jar:org/a/a/d/b.class */
public interface AbstractC0937b extends AbstractC0926b, AbstractC0938c {
    @Override // org.p048a.p049a.p050a.AbstractC0926b, org.p048a.p049a.p051b.AbstractC0930b
    /* renamed from: a */
    AbstractC0933b iterator();

    /* renamed from: b */
    AbstractC0941b listIterator();

    /* renamed from: a */
    AbstractC0941b listIterator(int i);

    /* renamed from: a */
    AbstractC0937b subList(int i, int i2);

    @Deprecated
    /* renamed from: b */
    Integer remove(int i);
}
