package com.corrodinggames.rts.java;

import com.corrodinggames.rts.gameFramework.AbstractC0657ar;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.java.audio.Music;
import com.corrodinggames.rts.java.audio.p050a.C1130a;

/* renamed from: com.corrodinggames.rts.java.m */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/m.class */
public class C1183m extends AbstractC0657ar {

    /* renamed from: a */
    C1182l f7227a;

    /* renamed from: c */
    Music f7228c;

    public C1183m(String str, C1182l c1182l) {
        super(str, c1182l);
        this.f7227a = c1182l;
        synchronized (c1182l.m91f()) {
            this.f7227a = c1182l;
            String m2444e = C0750a.m2444e(str);
            if (m2444e.contains(".rwmod")) {
                this.f7228c = c1182l.f7225b.mo6761newMusic(new C1130a(C0750a.m2438j(str), m2444e));
            } else {
                this.f7228c = c1182l.f7225b.mo6761newMusic(new C1130a(m2444e));
            }
        }
    }
}
