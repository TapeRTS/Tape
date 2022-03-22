package com.corrodinggames.rts.gameFramework.p040k;

import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.k.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/b.class */
public class C0766b {

    /* renamed from: a */
    C0835m f5357a = new C0835m();

    /* renamed from: b */
    boolean f5358b;

    /* renamed from: a */
    public void m803a(C0762a aVar) {
        this.f5357a.add(aVar);
    }

    /* renamed from: a */
    public boolean m804a() {
        return this.f5357a.f5778a > 0;
    }

    /* renamed from: b */
    public boolean m802b() {
        boolean z = false;
        boolean z2 = true;
        Iterator it = this.f5357a.iterator();
        while (it.hasNext()) {
            if (((C0762a) it.next()).f5321j) {
                z = true;
            } else {
                z2 = false;
            }
        }
        if (this.f5358b && !z2) {
            z = false;
        }
        return z;
    }
}
