package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/q.class */
public class C1061q {

    /* renamed from: a */
    C1101m f6730a = new C1101m();

    /* renamed from: a */
    public void m761a(Runnable runnable) {
        this.f6730a.add(runnable);
    }

    /* renamed from: a */
    public void m762a() {
        if (this.f6730a.f6888a > 0) {
            Iterator it = this.f6730a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    /* renamed from: b */
    public void m760b() {
        if (this.f6730a.f6888a > 0) {
            Iterator it = this.f6730a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f6730a.clear();
        }
    }
}
