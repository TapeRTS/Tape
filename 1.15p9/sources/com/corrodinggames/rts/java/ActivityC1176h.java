package com.corrodinggames.rts.java;

import com.corrodinggames.librocket.AbstractC0043a;
import com.corrodinggames.librocket.scripts.ScriptEngine;
import com.corrodinggames.rts.appFramework.ActivityC0097g;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.java.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/h.class */
public class ActivityC1176h extends ActivityC0097g {
    /* renamed from: c */
    public void m115c(int i) {
        GameEngine.PrintLog("InGameActivityJava selectMenuOption: " + i);
        m114d(i);
    }

    /* renamed from: e */
    private void m113e(String str) {
        ScriptEngine.getInstance().getRoot().makeSaveGamePopup(str);
    }

    /* renamed from: f */
    private void m112f(String str) {
        ScriptEngine.getInstance().getRoot().makeExportMapGamePopup(str);
    }

    /* renamed from: d */
    public void m114d(int i) {
        switch (i) {
            case 2:
                AbstractC0043a.m6322a().m6311d();
                return;
            case 3:
                GameEngine.PrintLog("TODO");
                return;
            case 4:
                GameEngine.m1228A().f6239cg = !GameEngine.m1228A().f6239cg;
                return;
            case 5:
                GameEngine.PrintLog("TODO");
                return;
            case 6:
                GameEngine m1228A = GameEngine.m1228A();
                m1228A.f6225bl = !m1228A.f6225bl;
                return;
            case 7:
            case 8:
            default:
                return;
            case 9:
                GameEngine m1228A2 = GameEngine.m1228A();
                if (!m1228A2.f6228bo) {
                    m1228A2.f6228bo = true;
                    return;
                } else {
                    m1228A2.f6228bo = false;
                    return;
                }
            case 10:
                ScriptEngine.getInstance().addScriptToQueue("mp.multiplayerExitPrompt();");
                return;
            case 11:
                GameEngine m1228A3 = GameEngine.m1228A();
                if (m1228A3.f6123ce != null && m1228A3.f6123ce.f6657h != null) {
                    m1228A3.m1185a("Briefing", m1228A3.f6123ce.f6657h);
                    return;
                }
                return;
            case 12:
                m113e(null);
                return;
            case 13:
                ScriptEngine.getInstance().addScriptToQueue("makeSendMessagePopup();");
                return;
            case 14:
                GameEngine m1228A4 = GameEngine.m1228A();
                if (m1228A4.networkEngine != null) {
                    m1228A4.networkEngine.m1789H();
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
                m112f(null);
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
                GameEngine m1228A5 = GameEngine.m1228A();
                m1228A5.f6155cT = true;
                m1228A5.f6111bS.f5201p = false;
                return;
        }
    }

    /* renamed from: m */
    public void m111m() {
        ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
    }
}
