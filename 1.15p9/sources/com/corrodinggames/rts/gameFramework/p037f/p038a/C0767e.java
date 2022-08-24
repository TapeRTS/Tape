package com.corrodinggames.rts.gameFramework.p037f.p038a;

import android.graphics.Color;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/e.class */
public class C0767e extends C0775l {

    /* renamed from: a */
    C0769f f5009a;

    /* renamed from: a */
    public static C0767e m2171a(String str, boolean z) {
        C0767e c0767e = new C0767e();
        c0767e.f5051b = C0770g.f5015e;
        c0767e.f5041i = 200.0f;
        c0767e.f5042j = 200.0f;
        C0771h c0771h = new C0771h();
        c0771h.m2161a(str);
        c0771h.m2138e(5.0f);
        c0771h.m2136f(5.0f);
        c0771h.m2162a(-1);
        c0767e.m2150a(c0771h);
        c0767e.f5009a = new C0769f(EnumC0774k.horizontal);
        c0767e.m2150a(c0767e.f5009a);
        if (z) {
            c0767e.m2170b(C0820a.m1886a("menus.common.cancel", new Object[0])).m2151a(new C07681());
        }
        return c0767e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: com.corrodinggames.rts.gameFramework.f.a.e$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a/e$1.class */
    public final class C07681 extends AbstractC0772i {
        C07681() {
        }

        /* renamed from: a */
        public boolean mo2158a(C0765c c0765c) {
            C0767e.this.m2133i();
            return true;
        }
    }

    /* renamed from: a */
    public C0764b m2173a(String str) {
        C0764b c0764b = new C0764b();
        c0764b.m2161a(str);
        c0764b.m2138e(5.0f);
        c0764b.m2136f(5.0f);
        c0764b.m2162a(Color.argb(255, 30, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_SERVICE, 30));
        return c0764b;
    }

    /* renamed from: b */
    public C0764b m2170b(String str) {
        return m2172a(str, (AbstractC0772i) null);
    }

    /* renamed from: a */
    public C0764b m2172a(String str, AbstractC0772i abstractC0772i) {
        C0764b m2173a = m2173a(str);
        m2173a.m2151a(abstractC0772i);
        this.f5009a.m2150a(m2173a);
        return m2173a;
    }

    /* renamed from: r_ */
    public void m2169r_() {
        if (!this.f5043s) {
            return;
        }
        mo2168b();
    }

    /* renamed from: b */
    public void mo2168b() {
        super.mo2168b();
        m2141d();
        this.f5041i = this.f5036z;
        this.f5042j = this.f5035y;
        this.f5041i += this.f5027m + this.f5028n;
        this.f5042j += this.f5025k + this.f5026l;
    }
}
