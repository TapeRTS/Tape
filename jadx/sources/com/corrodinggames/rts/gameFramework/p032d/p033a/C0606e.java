package com.corrodinggames.rts.gameFramework.p032d.p033a;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.gameFramework.d.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/d/a/e.class */
public class C0606e extends C0614l {

    /* renamed from: a */
    C0608f f4211a;

    /* renamed from: a */
    public static C0606e m1810a(String str, boolean z) {
        C0606e eVar = new C0606e();
        eVar.f4253b = C0609g.f4217e;
        eVar.f4229i = 200.0f;
        eVar.f4230j = 200.0f;
        C0610h hVar = new C0610h();
        hVar.m1802a(str);
        hVar.m1781e(5.0f);
        hVar.m1779f(5.0f);
        hVar.m1803a(-1);
        eVar.m1793a(hVar);
        eVar.f4211a = new C0608f(EnumC0613k.horizontal);
        eVar.m1793a(eVar.f4211a);
        if (z) {
            eVar.m1809b(C0652a.m1536a("menus.common.cancel", new Object[0])).m1794a(new AbstractC0611i() { // from class: com.corrodinggames.rts.gameFramework.d.a.e.1
                @Override // com.corrodinggames.rts.gameFramework.p032d.p033a.AbstractC0611i
                /* renamed from: a */
                public boolean mo1180a(C0604c cVar) {
                    C0606e.this.m1776i();
                    return true;
                }
            });
        }
        return eVar;
    }

    /* renamed from: a */
    public C0603b m1812a(String str) {
        C0603b bVar = new C0603b();
        bVar.m1802a(str);
        bVar.m1781e(5.0f);
        bVar.m1779f(5.0f);
        bVar.m1803a(Color.m4213a(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30));
        return bVar;
    }

    /* renamed from: b */
    public C0603b m1809b(String str) {
        return m1811a(str, (AbstractC0611i) null);
    }

    /* renamed from: a */
    public C0603b m1811a(String str, AbstractC0611i iVar) {
        C0603b a = m1812a(str);
        a.m1794a(iVar);
        this.f4211a.m1793a(a);
        return a;
    }

    /* renamed from: q_ */
    public void m1808q_() {
        if (this.f4239s) {
            mo1791b();
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p032d.p033a.AbstractC0612j
    /* renamed from: b */
    public void mo1791b() {
        super.mo1791b();
        m1784d();
        this.f4229i = this.f4246z;
        this.f4230j = this.f4245y;
        this.f4229i += this.f4233m + this.f4234n;
        this.f4230j += this.f4231k + this.f4232l;
    }
}
