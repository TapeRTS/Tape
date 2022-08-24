package org.p054a.p055a.p059d;

import org.p054a.p055a.p056a.InterfaceC1195b;
import org.p054a.p055a.p058c.InterfaceC1202b;
import org.p054a.p055a.p060e.InterfaceC1210b;

/* renamed from: org.a.a.d.b */
/* loaded from: game-lib.jar:org/a/a/d/b.class */
public interface InterfaceC1206b extends InterfaceC1195b, InterfaceC1207c {
    @Override // org.p054a.p055a.p056a.InterfaceC1195b, java.util.Collection, java.lang.Iterable, org.p054a.p055a.p057b.InterfaceC1199b
    /* renamed from: a */
    InterfaceC1202b iterator();

    @Override // java.util.List
    /* renamed from: b */
    InterfaceC1210b listIterator();

    @Override // java.util.List
    /* renamed from: a */
    InterfaceC1210b listIterator(int i);

    @Override // java.util.List
    /* renamed from: a */
    InterfaceC1206b subList(int i, int i2);

    @Override // java.util.List
    @Deprecated
    /* renamed from: b */
    Integer remove(int i);
}
