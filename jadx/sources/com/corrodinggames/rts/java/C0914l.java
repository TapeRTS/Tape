package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0556ar;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import com.corrodinggames.rts.java.audio.Music;
import com.corrodinggames.rts.java.audio.p044a.C0864a;

/* renamed from: com.corrodinggames.rts.java.l */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/l.class */
public class C0914l extends AbstractC0556ar {

    /* renamed from: a */
    C0913k f6082a;

    /* renamed from: c */
    Music f6083c;

    public C0914l(String str, C0913k kVar) {
        super(str, kVar);
        this.f6082a = kVar;
        synchronized (kVar.m89f()) {
            this.f6082a = kVar;
            String c = C0596a.m1889c(str);
            if (c.contains(".rwmod")) {
                this.f6083c = kVar.f6080b.newMusic(new C0864a(C0596a.m1884h(str), c));
            } else {
                this.f6083c = kVar.f6080b.newMusic(new C0864a(c));
            }
        }
    }
}
