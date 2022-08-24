package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p042j.AbstractC0905j;
import com.corrodinggames.rts.gameFramework.p042j.C0899d;
import com.corrodinggames.rts.gameFramework.p042j.C0900e;
import com.corrodinggames.rts.gameFramework.p042j.C0909n;

/* renamed from: com.corrodinggames.rts.a.a.k */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/k.class */
public class C0082k extends AbstractC0083l {
    /* renamed from: a */
    public C0909n m6240a(int i) {
        C0909n c0909n = new C0909n();
        c0909n.m1272a((short) i, (short) 0);
        c0909n.m1274a(0, 0, 0);
        return c0909n;
    }

    /* renamed from: a */
    public void m6241a() {
        GameEngine.PrintLog("== Testing FastNodeQueue ==");
        m6239a(new C0899d());
        GameEngine.PrintLog("== Testing FastNodeQueue2 ==");
        m6239a(new C0900e());
    }

    /* renamed from: a */
    public void m6239a(AbstractC0905j abstractC0905j) {
        C0909n m6240a = m6240a(1);
        C0909n m6240a2 = m6240a(2);
        C0909n m6240a3 = m6240a(3);
        C0909n m6240a4 = m6240a(4);
        GameEngine.PrintLog("sequential");
        abstractC0905j.mo1327b();
        abstractC0905j.mo1328a(m6240a);
        abstractC0905j.mo1328a(m6240a2);
        abstractC0905j.mo1328a(m6240a3);
        abstractC0905j.mo1328a(m6240a4);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a2);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a3);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a4);
        GameEngine.PrintLog("reverse sequence");
        abstractC0905j.mo1327b();
        abstractC0905j.mo1328a(m6240a4);
        abstractC0905j.mo1328a(m6240a3);
        abstractC0905j.mo1328a(m6240a2);
        abstractC0905j.mo1328a(m6240a);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a2);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a3);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a4);
        GameEngine.PrintLog("sequential with noise");
        abstractC0905j.mo1327b();
        abstractC0905j.mo1328a(m6240a);
        for (int i = 0; i < 1000; i++) {
            abstractC0905j.mo1328a(m6240a(100 + i));
        }
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a);
        abstractC0905j.mo1328a(m6240a2);
        abstractC0905j.mo1328a(m6240a3);
        for (int i2 = 0; i2 < 1000; i2++) {
            abstractC0905j.mo1328a(m6240a(100 + i2));
        }
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a2);
        abstractC0905j.mo1328a(m6240a4);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a3);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a4);
        GameEngine.PrintLog("reverse sequence with noise");
        abstractC0905j.mo1327b();
        abstractC0905j.mo1328a(m6240a4);
        abstractC0905j.mo1328a(m6240a3);
        for (int i3 = 0; i3 < 1000; i3++) {
            abstractC0905j.mo1328a(m6240a(100 + i3));
        }
        abstractC0905j.mo1328a(m6240a2);
        for (int i4 = 0; i4 < 1000; i4++) {
            abstractC0905j.mo1328a(m6240a(100 + i4));
        }
        abstractC0905j.mo1328a(m6240a);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a2);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a3);
        C0085n.m6230a(abstractC0905j.mo1329a(), m6240a4);
    }
}
