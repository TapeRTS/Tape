package org.p054a.p055a.p059d;

import org.p054a.p055a.p056a.InterfaceC1194a;
import org.p054a.p055a.p058c.InterfaceC1201a;
import org.p054a.p055a.p060e.InterfaceC1209a;

/* renamed from: org.a.a.d.a */
/* loaded from: game-lib.jar:org/a/a/d/a.class */
public interface InterfaceC1205a extends InterfaceC1194a, InterfaceC1207c {
    @Override // org.p054a.p055a.p056a.InterfaceC1194a, java.util.Collection, java.lang.Iterable, org.p054a.p055a.p057b.InterfaceC1198a
    /* renamed from: a */
    InterfaceC1201a iterator();

    @Override // java.util.List
    /* renamed from: b */
    InterfaceC1209a listIterator();

    @Override // java.util.List
    /* renamed from: a */
    InterfaceC1209a listIterator(int i);

    @Override // java.util.List
    /* renamed from: a */
    InterfaceC1205a subList(int i, int i2);

    @Override // java.util.List
    @Deprecated
    /* renamed from: b */
    Float remove(int i);
}
