package com.corrodinggames.rts.game.p010a.p011a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.p010a.C0161f;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.p016a.EnumC0340e;
import com.corrodinggames.rts.game.units.p013a.AbstractC0224s;
import com.corrodinggames.rts.game.units.p024d.InterfaceC0501l;

/* renamed from: com.corrodinggames.rts.game.a.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/a/a/d.class */
public class C0156d extends AbstractC0155c {

    /* renamed from: b */
    public final boolean f640b = true;

    /* renamed from: c */
    static final C0448g f641c = C0448g.m4407c("nukeLauncher");

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: a */
    public EnumC0152b mo6041a() {
        return EnumC0152b.nuking;
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0155c
    /* renamed from: c */
    public boolean mo6038c(C0136a c0136a, AbstractC0623y abstractC0623y) {
        return m6040a(abstractC0623y);
    }

    /* renamed from: d */
    public PointF m6037d(C0136a c0136a, AbstractC0623y abstractC0623y) {
        return c0136a.m6090ap();
    }

    /* renamed from: e */
    public void m6036e(C0136a c0136a, AbstractC0623y abstractC0623y) {
        AbstractC0224s m6019a = C0161f.m6019a(c0136a, abstractC0623y, EnumC0340e.launch);
        if (m6019a != null) {
            if (m6019a.mo3314b(abstractC0623y) && m6019a.mo3316a((AbstractC0244am) abstractC0623y, false)) {
                PointF m6037d = m6037d(c0136a, abstractC0623y);
                if (m6037d != null) {
                    c0136a.m5599c("nuke: launching at:" + m6037d.f227a + ", " + m6037d.f228b);
                    c0136a.m6107a(abstractC0623y, m6019a, m6037d, (AbstractC0244am) null);
                    return;
                }
                c0136a.m5599c("nuke: no target");
                return;
            }
            c0136a.m5599c("nuke: not ready");
        }
    }

    /* renamed from: f */
    public void m6035f(C0136a c0136a, AbstractC0623y abstractC0623y) {
        AbstractC0224s m6019a;
        if ((abstractC0623y instanceof InterfaceC0501l) && ((InterfaceC0501l) abstractC0623y).mo3766dv() && (m6019a = C0161f.m6019a(c0136a, abstractC0623y, EnumC0340e.launchAmmo)) != null && c0136a.m6112a(m6019a.mo5477B(), abstractC0623y)) {
            c0136a.m5599c("ai nuke building");
            c0136a.m6108a(abstractC0623y, m6019a);
        }
    }

    /* renamed from: a */
    public boolean m6040a(AbstractC0623y abstractC0623y) {
        if (C0161f.m6017a(abstractC0623y, f641c)) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.p010a.p011a.AbstractC0150a
    /* renamed from: b */
    public void mo6039b(float f, C0136a c0136a) {
        AbstractC0244am[] m517a = this.f639a.m517a();
        int size = this.f639a.size();
        for (int i = 0; i < size; i++) {
            AbstractC0623y abstractC0623y = (AbstractC0623y) m517a[i];
            m6035f(c0136a, abstractC0623y);
            m6036e(c0136a, abstractC0623y);
        }
    }
}
