package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.C0654f;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.g.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/a.class */
public class C0660a {

    /* renamed from: a */
    private ConcurrentLinkedQueue f4643a = new ConcurrentLinkedQueue();

    /* renamed from: a */
    public String m1360a(String str) {
        return C0654f.m1419i(str);
    }

    /* renamed from: a */
    public void m1362a(int i, String str, String str2, C0698c cVar) {
        this.f4643a.add(new C0697b(this, i, str, str2.trim(), cVar));
        if (this.f4643a.size() > 45) {
            this.f4643a.poll();
        }
    }

    /* renamed from: a */
    public int m1361a(C0698c cVar, int i) {
        int i2 = 0;
        Iterator it = this.f4643a.iterator();
        while (it.hasNext()) {
            C0697b bVar = (C0697b) it.next();
            if (bVar.f4912d == cVar && C0654f.m1509a(bVar.f4913e, System.nanoTime()) < i && !bVar.f4911c.startsWith("-i ") && !bVar.f4911c.startsWith("-qc ")) {
                i2++;
                if (bVar.f4911c != null) {
                    if (C0654f.m1489a(bVar.f4911c, '\n') >= 3) {
                        i2 += 2;
                    }
                    if (C0654f.m1489a(bVar.f4911c, '\n') >= 6) {
                        i2 += 2;
                    }
                    if (C0654f.m1489a(bVar.f4911c, '\n') >= 9) {
                        i2 += 2;
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    public String m1363a() {
        Iterator it;
        String str = "";
        while (this.f4643a.iterator().hasNext()) {
            str = str + ((C0697b) it.next()).m1121a() + "\n";
        }
        return str;
    }

    /* renamed from: b */
    public ConcurrentLinkedQueue m1359b() {
        return this.f4643a;
    }

    /* renamed from: c */
    public void m1358c() {
        this.f4643a.clear();
    }
}
