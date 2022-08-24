package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0249ar;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.f.ab */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab.class */
public abstract class AbstractC0777ab {

    /* renamed from: a */
    static AbstractC0777ab f5054a = new C07781();

    /* renamed from: b */
    static AbstractC0777ab f5055b = new C07792();

    /* renamed from: c */
    static AbstractC0777ab f5056c = new C07803();

    /* renamed from: d */
    static AbstractC0777ab f5057d = new C07814();

    /* renamed from: e */
    static AbstractC0777ab f5058e = new C07825();

    /* renamed from: f */
    static AbstractC0777ab f5059f = new C07836();

    /* renamed from: a */
    public abstract boolean m2126a(AbstractC0623y abstractC0623y);

    AbstractC0777ab() {
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.f.ab$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab$1.class */
    final class C07781 extends AbstractC0777ab {
        C07781() {
        }

        /* renamed from: a */
        public boolean m2123a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.m3142aj() && !abstractC0623y.mo3260u() && abstractC0623y.m3135aq()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.f.ab$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab$2.class */
    final class C07792 extends AbstractC0777ab {
        C07792() {
        }

        /* renamed from: a */
        public boolean m2122a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.m3142aj() && !abstractC0623y.mo3260u()) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.f.ab$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab$3.class */
    final class C07803 extends AbstractC0777ab {
        C07803() {
        }

        /* renamed from: a */
        public boolean m2121a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo3298r() == AbstractC0249ar.f1742a) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.f.ab$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab$4.class */
    final class C07814 extends AbstractC0777ab {
        C07814() {
        }

        /* renamed from: a */
        public boolean m2120a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo3298r() == AbstractC0249ar.f1777J && abstractC0623y.m3230V() < 3) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.f.ab$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab$5.class */
    final class C07825 extends AbstractC0777ab {
        C07825() {
        }

        /* renamed from: a */
        public boolean m2119a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo3298r() == AbstractC0249ar.f1743b) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.gameFramework.f.ab$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/ab$6.class */
    final class C07836 extends AbstractC0777ab {
        C07836() {
        }

        /* renamed from: a */
        public boolean m2118a(AbstractC0623y abstractC0623y) {
            if (abstractC0623y.mo3298r() == AbstractC0249ar.f1744c) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: a */
    public static void m2124a(ArrayList arrayList, AbstractC0777ab abstractC0777ab, AbstractC0777ab abstractC0777ab2) {
        GameEngine m1228A = GameEngine.m1228A();
        if (m1228A.f6111bS.m1963p() != 1) {
            arrayList.clear();
        }
        AbstractC0623y m1957s = m1228A.f6111bS.m1957s();
        if (m1957s != null) {
            if (abstractC0777ab.m2126a(m1957s) || (abstractC0777ab2 != null && abstractC0777ab2.m2126a(m1957s))) {
                if (!arrayList.contains(m1957s)) {
                    arrayList.add(m1957s);
                }
            } else {
                arrayList.clear();
            }
        }
        AbstractC0623y m2125a = m2125a(arrayList, abstractC0777ab);
        if (m2125a == null && abstractC0777ab2 != null) {
            m2125a = m2125a(arrayList, abstractC0777ab2);
        }
        if (m2125a == null) {
            arrayList.clear();
            if (m1957s != null) {
                arrayList.add(m1957s);
            }
            m2125a = m2125a(arrayList, abstractC0777ab);
            if (m2125a == null && abstractC0777ab2 != null) {
                m2125a = m2125a(arrayList, abstractC0777ab2);
            }
        }
        if (m2125a != null) {
            m1228A.f6111bS.m1952x();
            m1228A.f6111bS.m1974j(m2125a);
            m1228A.m1144b(m2125a.f6951ek, m2125a.f6952el);
            arrayList.add(m2125a);
        }
    }

    /* renamed from: a */
    public static AbstractC0623y m2125a(ArrayList arrayList, AbstractC0777ab abstractC0777ab) {
        GameEngine m1228A = GameEngine.m1228A();
        AbstractC0623y abstractC0623y = null;
        float f = -1.0f;
        Iterator it = AbstractC0244am.f1589bD.iterator();
        while (it.hasNext()) {
            AbstractC0244am abstractC0244am = (AbstractC0244am) it.next();
            if (abstractC0244am instanceof AbstractC0623y) {
                AbstractC0623y abstractC0623y2 = (AbstractC0623y) abstractC0244am;
                if (m1228A.f6111bS.m1968m(abstractC0623y2) && abstractC0777ab.m2126a(abstractC0623y2) && !arrayList.contains(abstractC0623y2)) {
                    float m2363a = C0758f.m2363a(m1228A.f6140cx + m1228A.f6150cH, m1228A.f6141cy + m1228A.f6151cI, abstractC0623y2.f6951ek, abstractC0623y2.f6952el);
                    if (abstractC0623y == null || m2363a < f) {
                        f = m2363a;
                        abstractC0623y = abstractC0623y2;
                    }
                }
            }
        }
        return abstractC0623y;
    }
}
