package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.p008a.ActivityC0069e;

/* renamed from: com.corrodinggames.rts.java.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/g.class */
public class ActivityC0907g extends ActivityC0069e {
    /* renamed from: c */
    public void m111c(int i) {
        AbstractC0789l.m683d("InGameActivityJava selectMenuOption: " + i);
        m110d(i);
    }

    /* renamed from: d */
    private void m109d(String str) {
        ScriptEngine.getInstance().getRoot().makeSaveGamePopup(str);
    }

    /* renamed from: e */
    private void m108e(String str) {
        ScriptEngine.getInstance().getRoot().makeExportMapGamePopup(str);
    }

    /* renamed from: d */
    public void m110d(int i) {
        switch (i) {
            case 2:
                AbstractC0043a.m4343a().m4332d();
                return;
            case 3:
                AbstractC0789l.m683d("TODO");
                return;
            case 4:
                AbstractC0789l.m651u().f5591bO = !AbstractC0789l.m651u().f5591bO;
                return;
            case 5:
                AbstractC0789l.m683d("TODO");
                return;
            case 6:
                AbstractC0789l u = AbstractC0789l.m651u();
                u.f5578aV = !u.f5578aV;
                return;
            case 7:
            case 8:
            default:
                return;
            case 9:
                AbstractC0789l u2 = AbstractC0789l.m651u();
                if (!u2.f5581aY) {
                    u2.f5581aY = true;
                    return;
                } else {
                    u2.f5581aY = false;
                    return;
                }
            case 10:
                ScriptEngine.getInstance().addScriptToQueue("mp.multiplayerExitPrompt();");
                return;
            case 11:
                AbstractC0789l u3 = AbstractC0789l.m651u();
                if (u3.f5493bM != null && u3.f5493bM.f5376h != null) {
                    u3.m730a("Briefing", u3.f5493bM.f5376h);
                    return;
                }
                return;
            case 12:
                m109d((String) null);
                return;
            case 13:
                ScriptEngine.getInstance().addScriptToQueue("makeSendMessagePopup();");
                return;
            case 14:
                AbstractC0789l u4 = AbstractC0789l.m651u();
                if (u4.f5486bF != null) {
                    u4.f5486bF.m1392B();
                    return;
                }
                return;
            case 15:
                ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
                return;
            case 16:
                ScriptEngine.getInstance().addScriptToQueue("makeSendTeamMessagePopup();");
                return;
            case 17:
                ScriptEngine.getInstance().addScriptToQueue("mp.reinviteAsk();");
                return;
            case 18:
                m108e(null);
                return;
            case 19:
                ScriptEngine.getInstance().addScriptToQueue("mp.surrenderPrompt();");
                return;
            case 20:
                ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
                return;
            case 21:
                ScriptEngine.getInstance().addScriptToQueue("showBattleroom();");
                return;
            case 22:
                AbstractC0789l u5 = AbstractC0789l.m651u();
                u5.f5525cB = true;
                u5.f5481bA.f4363p = false;
                return;
        }
    }

    /* renamed from: k */
    public void m107k() {
        ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
    }
}
