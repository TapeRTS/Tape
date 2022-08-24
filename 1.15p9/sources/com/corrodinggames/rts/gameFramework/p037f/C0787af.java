package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Typeface;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.af */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/af.class */
public class C0787af {

    /* renamed from: a */
    private GameEngine f5076a;

    /* renamed from: b */
    private Paint f5077b;

    /* renamed from: c */
    private ArrayList f5078c = new ArrayList();

    public C0787af(GameEngine gameEngine) {
        this.f5076a = gameEngine;
        m2107a();
    }

    /* renamed from: a */
    public void m2107a() {
        this.f5077b = new Paint();
        this.f5077b.m7267a(255, 255, 255, 255);
        this.f5077b.m7248a(true);
        this.f5077b.m7235c(true);
        this.f5077b.m7258a(Typeface.m7174a(Typeface.f246c, 1));
        this.f5076a.m1197a(this.f5077b, 14.0f);
    }

    /* renamed from: b */
    public synchronized void m2101b() {
        this.f5078c.clear();
    }

    /* renamed from: a */
    public synchronized void m2105a(Unit unit) {
        C0789ah c0789ah = new C0789ah(unit.f6951ek, unit.f6952el, unit.getUnitType());
        c0789ah.f5082c = GameEngine.m1214U();
        m2104a(c0789ah);
    }

    /* renamed from: b */
    public synchronized void m2100b(Unit unit) {
        C0791aj c0791aj = new C0791aj(unit.f6951ek, unit.f6952el, unit.getUnitType());
        c0791aj.f5082c = GameEngine.m1214U();
        m2104a(c0791aj);
    }

    /* renamed from: c */
    public synchronized void m2098c(Unit unit) {
        C0790ai c0790ai = new C0790ai(unit.f6951ek, unit.f6952el, unit.m5867bI());
        c0790ai.f5082c = GameEngine.m1214U();
        m2104a(c0790ai);
    }

    /* renamed from: a */
    public synchronized void m2103a(String str) {
        C0788ag c0788ag = new C0788ag(str);
        c0788ag.f5082c = GameEngine.m1214U();
        m2104a(c0788ag);
    }

    /* renamed from: a */
    public synchronized void m2102a(String str, int i) {
        C0788ag c0788ag = new C0788ag(str);
        c0788ag.f5082c = GameEngine.m1214U();
        c0788ag.f5083d = i;
        c0788ag.f5088i = true;
        m2104a(c0788ag);
    }

    /* renamed from: a */
    private void m2104a(AbstractC0792ak abstractC0792ak) {
        boolean z = false;
        Iterator it = this.f5078c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            AbstractC0792ak abstractC0792ak2 = (AbstractC0792ak) it.next();
            if (abstractC0792ak2.mo2095a(abstractC0792ak)) {
                abstractC0792ak2.mo2093b(abstractC0792ak);
                z = true;
                break;
            }
        }
        if (z) {
            Collections.sort(this.f5078c);
        } else {
            this.f5078c.add(0, abstractC0792ak);
        }
    }

    /* renamed from: a */
    public synchronized void m2106a(float f) {
        m2099c();
        GameEngine gameEngine = GameEngine.getInstance();
        int i = (int) (gameEngine.f6129cl - (130.0f * gameEngine.f6126ci));
        int i2 = (int) (20.0f * gameEngine.f6126ci);
        Iterator it = this.f5078c.iterator();
        while (it.hasNext()) {
            AbstractC0792ak abstractC0792ak = (AbstractC0792ak) it.next();
            String mo2096a = abstractC0792ak.mo2096a();
            if (gameEngine.f6109bQ.showWarLogOnScreen || abstractC0792ak.f5088i) {
                if (abstractC0792ak.f5082c + abstractC0792ak.f5083d >= System.currentTimeMillis()) {
                    if (abstractC0792ak.f5087h) {
                        this.f5077b.m7267a(255, 160, 160, 160);
                    } else {
                        this.f5077b.m7267a(255, 255, 255, 255);
                    }
                    gameEngine.graphics.mo903a(mo2096a, 20, i, this.f5077b);
                    i -= i2;
                } else {
                    return;
                }
            }
        }
    }

    /* renamed from: c */
    public synchronized void m2099c() {
        Iterator it = this.f5078c.iterator();
        while (it.hasNext()) {
            if (((AbstractC0792ak) it.next()).f5082c + 20000 < System.currentTimeMillis()) {
                it.remove();
            }
        }
    }

    /* renamed from: d */
    public synchronized void m2097d() {
        if (this.f5078c.isEmpty()) {
            return;
        }
        Iterator it = this.f5078c.iterator();
        while (it.hasNext()) {
            AbstractC0792ak abstractC0792ak = (AbstractC0792ak) it.next();
            if (!abstractC0792ak.f5087h) {
                abstractC0792ak.f5087h = true;
                this.f5076a.m1150b(abstractC0792ak.f5084e, abstractC0792ak.f5085f);
                return;
            }
        }
    }
}
