package org.p054a.p055a.p059d;

import org.p054a.p055a.p056a.InterfaceC1197d;
import org.p054a.p055a.p058c.InterfaceC1204d;
import org.p054a.p055a.p060e.InterfaceC1212d;

/* renamed from: org.a.a.d.d */
/* loaded from: game-lib.jar:org/a/a/d/d.class */
public interface InterfaceC1208d extends InterfaceC1197d, InterfaceC1207c {
    @Override // org.p054a.p055a.p056a.InterfaceC1197d, java.util.Collection, java.lang.Iterable, org.p054a.p055a.p057b.InterfaceC1200c
    /* renamed from: a */
    InterfaceC1204d iterator();

    @Override // java.util.List
    /* renamed from: b */
    InterfaceC1212d listIterator();

    @Override // java.util.List
    /* renamed from: a */
    InterfaceC1212d listIterator(int i);

    @Override // java.util.List
    /* renamed from: a */
    InterfaceC1208d subList(int i, int i2);

    @Override // java.util.List
    @Deprecated
    /* renamed from: b */
    Short remove(int i);
}
