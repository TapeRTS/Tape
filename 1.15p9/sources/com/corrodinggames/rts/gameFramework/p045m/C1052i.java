package com.corrodinggames.rts.gameFramework.p045m;

import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p010a.C0136a;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.m.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/i.class */
public class C1052i {

    /* renamed from: a */
    boolean f6709a;

    /* renamed from: b */
    C1101m f6710b = new C1101m();

    /* renamed from: c */
    final /* synthetic */ C1049f f6711c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public C1052i(C1049f c1049f) {
        this.f6711c = c1049f;
    }

    /* renamed from: a */
    public void m798a(InterfaceC0303as interfaceC0303as, int i) {
        InterfaceC0303as m4738c = C0453l.m4738c(interfaceC0303as);
        if (m4738c != null) {
            interfaceC0303as = m4738c;
        }
        m797b(interfaceC0303as, i);
    }

    /* renamed from: b */
    public void m797b(InterfaceC0303as interfaceC0303as, int i) {
        Iterator it = this.f6710b.iterator();
        while (it.hasNext()) {
            C1053j c1053j = (C1053j) it.next();
            if (c1053j.f6712a == interfaceC0303as) {
                c1053j.f6713b += i;
                return;
            }
        }
        C1053j c1053j2 = new C1053j(this);
        c1053j2.f6712a = interfaceC0303as;
        c1053j2.f6713b = i;
        this.f6710b.add(c1053j2);
    }

    /* renamed from: a */
    public void m799a(float f, float f2) {
        GameEngine gameEngine = GameEngine.getInstance();
        int i = 0;
        C0136a m6317k = Team.m6317k(1);
        if (m6317k == null) {
            GameEngine.PrintLog("Warning: Creating missing wave team AI");
            m6317k = new C0136a(1);
            m6317k.f1311q = 100;
            m6317k.f1343T = true;
        }
        Iterator it = this.f6710b.iterator();
        while (it.hasNext()) {
            C1053j c1053j = (C1053j) it.next();
            for (int i2 = 0; i2 < c1053j.f6713b; i2++) {
                Unit mo5717a = c1053j.f6712a.mo5717a();
                mo5717a.f6951ek = f + CommonUtils.m2358a(-85, 85, i + 0);
                mo5717a.f6952el = f2 + CommonUtils.m2358a(-85, 85, i + 1);
                mo5717a.direction = CommonUtils.m2358a(-180, (int) SlickToAndroidKeycodes.AndroidCodes.KEYCODE_STB_INPUT, i + 2);
                i += 3;
                mo5717a.mo3120b(m6317k);
                if (mo5717a.f6951ek < 0.0f) {
                    mo5717a.f6951ek = 0.0f;
                }
                if (mo5717a.f6952el < 0.0f) {
                    mo5717a.f6952el = 0.0f;
                }
                if (mo5717a.f6951ek > gameEngine.f6104bL.m6589i()) {
                    mo5717a.f6951ek = gameEngine.f6104bL.m6589i();
                }
                if (mo5717a.f6952el > gameEngine.f6104bL.m6588j()) {
                    mo5717a.f6952el = gameEngine.f6104bL.m6588j();
                }
                if (i2 == 0) {
                    gameEngine.f6115bW.m1938a(mo5717a);
                }
            }
        }
    }

    public String toString() {
        if (this.f6710b.size() == 0) {
            return "No units";
        }
        String str = VariableScope.nullOrMissingString;
        boolean z = true;
        Iterator it = this.f6710b.iterator();
        while (it.hasNext()) {
            C1053j c1053j = (C1053j) it.next();
            if (!z) {
                str = str + ", ";
            }
            z = false;
            str = (str + c1053j.f6713b + "x ") + c1053j.f6712a.mo5710e();
        }
        return str;
    }
}
