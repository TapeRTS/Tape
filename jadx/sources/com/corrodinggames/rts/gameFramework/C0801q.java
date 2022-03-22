package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/q.class */
public class C0801q {

    /* renamed from: a */
    C0835m f5648a = new C0835m();

    /* renamed from: a */
    public void m626a(Runnable runnable) {
        this.f5648a.add(runnable);
    }

    /* renamed from: a */
    public void m627a() {
        if (this.f5648a.f5778a > 0) {
            Iterator it = this.f5648a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
        }
    }

    /* renamed from: b */
    public void m625b() {
        if (this.f5648a.f5778a > 0) {
            Iterator it = this.f5648a.iterator();
            while (it.hasNext()) {
                ((Runnable) it.next()).run();
            }
            this.f5648a.clear();
        }
    }
}
