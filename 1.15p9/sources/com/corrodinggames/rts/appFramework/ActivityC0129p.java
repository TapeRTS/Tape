package com.corrodinggames.rts.appFramework;

import android.p003os.Handler;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0872g;
import com.corrodinggames.rts.gameFramework.p041i.C0879n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.appFramework.p */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/p.class */
public class ActivityC0129p extends ActivityC0089b {

    /* renamed from: c */
    static ActivityC0129p f538c;

    /* renamed from: d */
    final Handler f539d;

    /* renamed from: e */
    private Runnable f540e;

    /* renamed from: l */
    public static void m6143l() {
        if (f538c != null) {
            f538c.f539d.m6394a(f538c.f540e);
        }
    }

    /* renamed from: m */
    public static ArrayList m6142m() {
        ArrayList arrayList;
        synchronized (C0879n.f5873f) {
            GameEngine m1228A = GameEngine.m1228A();
            arrayList = new ArrayList();
            Iterator it = m1228A.networkEngine.f5608by.iterator();
            while (it.hasNext()) {
                arrayList.add((C0872g) it.next());
            }
            Collections.sort(arrayList, new C01301());
        }
        return arrayList;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.appFramework.p$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/p$1.class */
    public final class C01301 implements Comparator {
        C01301() {
        }

        /* renamed from: a */
        public int m6141a(C0872g c0872g) {
            if (c0872g.m1472d()) {
                return 0;
            }
            if (c0872g.f5837x && c0872g.f5834s.equals("chat")) {
                return 1;
            }
            if (c0872g.f5817a) {
                return 2;
            }
            if (c0872g.f5834s.equals("battleroom")) {
                if (c0872g.f5842v != -1 && c0872g.f5842v < c0872g.f5843w) {
                    if (c0872g.f5837x) {
                        if (c0872g.f5842v != 0) {
                            return 3;
                        }
                        return 4;
                    } else if (c0872g.f5824h && !c0872g.f5837x) {
                        return 7;
                    } else {
                        return 9;
                    }
                } else if (c0872g.f5837x) {
                    return 6;
                } else {
                    if (c0872g.f5824h && !c0872g.f5837x) {
                        return 8;
                    }
                    return 9;
                }
            }
            return 99;
        }

        /* renamed from: a */
        public int compare(C0872g c0872g, C0872g c0872g2) {
            Integer valueOf = Integer.valueOf(m6141a(c0872g));
            Integer valueOf2 = Integer.valueOf(m6141a(c0872g2));
            if (!c0872g.m1469g()) {
                valueOf = Integer.valueOf(valueOf.intValue() + 20);
            }
            if (!c0872g2.m1469g()) {
                valueOf2 = Integer.valueOf(valueOf2.intValue() + 20);
            }
            int compareTo = valueOf.compareTo(valueOf2);
            if (compareTo != 0) {
                return compareTo;
            }
            return c0872g.f5832q.compareTo(c0872g2.f5832q);
        }
    }
}
