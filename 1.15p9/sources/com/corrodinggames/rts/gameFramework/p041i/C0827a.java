package com.corrodinggames.rts.gameFramework.p041i;

import android.text.Html;
import android.text.Spanned;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import java.util.Iterator;
import java.util.concurrent.ConcurrentLinkedQueue;

/* renamed from: com.corrodinggames.rts.gameFramework.i.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/a.class */
public class C0827a {

    /* renamed from: a */
    private ConcurrentLinkedQueue f5464a = new ConcurrentLinkedQueue();

    /* renamed from: a */
    public String m1814a(String str) {
        return CommonUtils.m2247i(str);
    }

    /* renamed from: a */
    public void m1816a(int i, String str, String str2, Connection connection) {
        this.f5464a.add(new C0866b(this, i, str, str2.trim(), connection));
        if (this.f5464a.size() > 45) {
            this.f5464a.poll();
        }
    }

    /* renamed from: a */
    public int m1815a(Connection connection, int i) {
        int i2 = 0;
        Iterator it = this.f5464a.iterator();
        while (it.hasNext()) {
            C0866b c0866b = (C0866b) it.next();
            if (c0866b.f5756d == connection && CommonUtils.m2355a(c0866b.f5757e, System.nanoTime()) < i && !c0866b.f5755c.startsWith("-i ") && !c0866b.f5755c.startsWith("-qc ")) {
                i2++;
                if (c0866b.f5755c != null) {
                    if (CommonUtils.m2335a(c0866b.f5755c, '\n') >= 3) {
                        i2 += 2;
                    }
                    if (CommonUtils.m2335a(c0866b.f5755c, '\n') >= 6) {
                        i2 += 2;
                    }
                    if (CommonUtils.m2335a(c0866b.f5755c, '\n') >= 9) {
                        i2 += 2;
                    }
                }
            }
        }
        return i2;
    }

    /* renamed from: a */
    public String m1817a() {
        Iterator it;
        String str = VariableScope.nullOrMissingString;
        while (this.f5464a.iterator().hasNext()) {
            str = str + ((C0866b) it.next()).m1514a() + "\n";
        }
        return str;
    }

    /* renamed from: b */
    public ConcurrentLinkedQueue m1812b() {
        return this.f5464a;
    }

    /* renamed from: a */
    public String m1813a(boolean z) {
        Iterator it;
        Iterator it2;
        String str = VariableScope.nullOrMissingString;
        if (!z) {
            while (this.f5464a.iterator().hasNext()) {
                str = str + ((C0866b) it2.next()).m1513b() + "<br/>\n";
            }
        } else {
            while (this.f5464a.iterator().hasNext()) {
                str = ((C0866b) it.next()).m1513b() + "<br/>\n" + str;
            }
        }
        return "<pre>" + str + "</pre>";
    }

    /* renamed from: b */
    public Spanned m1811b(boolean z) {
        return Html.fromHtml(m1813a(z));
    }

    /* renamed from: c */
    public void m1810c() {
        this.f5464a.clear();
    }
}
