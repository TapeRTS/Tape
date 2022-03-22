package com.corrodinggames.rts.p008a;

import android.p003os.Handler;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p036g.C0703g;
import com.corrodinggames.rts.gameFramework.p036g.C0710n;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.a.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/n.class */
public class ActivityC0098n extends ActivityC0066b {

    /* renamed from: b */
    static ActivityC0098n f474b;

    /* renamed from: c */
    final Handler f475c;

    /* renamed from: d */
    private Runnable f476d;

    /* renamed from: j */
    public static void m4243j() {
        if (f474b != null) {
            f474b.f475c.m4415a(f474b.f476d);
        }
    }

    /* renamed from: k */
    public static ArrayList m4242k() {
        ArrayList arrayList;
        synchronized (C0710n.f5020d) {
            AbstractC0789l u = AbstractC0789l.m651u();
            arrayList = new ArrayList();
            Iterator it = u.f5486bF.f4772bm.iterator();
            while (it.hasNext()) {
                arrayList.add((C0703g) it.next());
            }
            Collections.sort(arrayList, new C00991());
        }
        return arrayList;
    }

    /* renamed from: com.corrodinggames.rts.a.n$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/a/n$1.class */
    final class C00991 implements Comparator {
        C00991() {
        }

        /* renamed from: a */
        public int m4241a(C0703g gVar) {
            if (gVar.m1100d()) {
                return 0;
            }
            if (gVar.f4984r.equals("chat")) {
                return 1;
            }
            if (gVar.f4968a) {
                return 2;
            }
            if (!gVar.f4984r.equals("battleroom")) {
                return 99;
            }
            if (gVar.f4992u == -1 || gVar.f4992u >= gVar.f4993v) {
                if (gVar.f4987w) {
                    return 6;
                }
                if (!gVar.f4975h || gVar.f4987w) {
                    return 9;
                }
                return 8;
            } else if (gVar.f4987w) {
                if (gVar.f4992u != 0) {
                    return 3;
                }
                return 4;
            } else if (!gVar.f4975h || gVar.f4987w) {
                return 9;
            } else {
                return 7;
            }
        }

        /* renamed from: a */
        public int compare(C0703g gVar, C0703g gVar2) {
            Integer valueOf = Integer.valueOf(m4241a(gVar));
            Integer valueOf2 = Integer.valueOf(m4241a(gVar2));
            if (!gVar.m1097g()) {
                valueOf = Integer.valueOf(valueOf.intValue() + 20);
            }
            if (!gVar2.m1097g()) {
                valueOf2 = Integer.valueOf(valueOf2.intValue() + 20);
            }
            int compareTo = valueOf.compareTo(valueOf2);
            if (compareTo != 0) {
                return compareTo;
            }
            return gVar.f4982p.compareTo(gVar2.f4982p);
        }
    }
}
