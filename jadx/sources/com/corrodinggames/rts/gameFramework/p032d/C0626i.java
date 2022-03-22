package com.corrodinggames.rts.gameFramework.p032d;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.d.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/i.class */
public class C0626i {

    /* renamed from: a */
    C0623f f4421a;

    /* renamed from: b */
    AbstractC0789l f4422b;

    /* renamed from: c */
    Paint f4423c;

    /* renamed from: d */
    boolean f4424d;

    /* renamed from: e */
    ArrayList f4425e = new ArrayList();

    C0626i(AbstractC0789l lVar, C0623f fVar) {
        this.f4421a = fVar;
        this.f4422b = lVar;
        m1644a();
    }

    /* renamed from: a */
    public void m1644a() {
        this.f4423c = new Paint();
        this.f4423c.m4189a(255, 255, 255, 255);
        this.f4423c.m4173a(true);
        this.f4423c.m4162c(true);
        this.f4423c.mo837a(Typeface.m4101a(Typeface.f239c, 1));
        this.f4422b.m723a(this.f4423c, 16.0f);
    }

    /* renamed from: b */
    public synchronized void m1641b() {
        this.f4424d = false;
        this.f4425e.clear();
    }

    /* renamed from: c */
    public synchronized void m1640c() {
        Iterator it = this.f4425e.iterator();
        while (it.hasNext()) {
            C0627j jVar = (C0627j) it.next();
            if (this.f4425e.size() > 15) {
                it.remove();
            }
        }
    }

    /* renamed from: a */
    public synchronized C0627j m1642a(String str, String str2) {
        AbstractC0789l u = AbstractC0789l.m638u();
        C0627j jVar = new C0627j();
        jVar.f4426a = str;
        jVar.f4427b = str2;
        jVar.f4428c = System.currentTimeMillis();
        jVar.f4429d = new SimpleDateFormat("HH:mm:ss").format(new Date());
        if (str == null || str.equals("") || u.f5516by.showPlayerChatInGame) {
            m1640c();
            this.f4425e.add(jVar);
            return jVar;
        }
        if (!this.f4424d) {
            this.f4424d = true;
            m1642a(null, "[WARNING: A player send a chat message, but you have chat muted in your settings]");
        }
        return jVar;
    }

    /* renamed from: a */
    public synchronized void m1643a(float f) {
        String str;
        AbstractC0789l u = AbstractC0789l.m638u();
        m1640c();
        int i = 95;
        int i2 = (int) (20.0f * u.f5534bQ);
        boolean a = u.mo734a();
        for (int size = this.f4425e.size() - 1; size >= 0; size--) {
            C0627j jVar = (C0627j) this.f4425e.get(size);
            if (jVar.m1638b()) {
                if (jVar.f4426a == null || jVar.f4426a.equals("")) {
                    str = jVar.f4427b;
                } else {
                    str = jVar.f4426a + ": " + jVar.f4427b;
                }
                if (a) {
                    str = jVar.f4429d + ": " + str;
                }
                if (jVar.f4430e > 0) {
                    int a2 = jVar.m1639a() / jVar.f4430e;
                    if (a2 < 0) {
                        a2 = 0;
                    }
                    if (a2 < str.length()) {
                        str = str.substring(0, a2);
                    }
                }
                this.f4423c.m4169b(jVar.f4431f);
                u.f5514bw.mo158a(str, 20, i, this.f4423c);
                i += i2;
            }
        }
    }
}
