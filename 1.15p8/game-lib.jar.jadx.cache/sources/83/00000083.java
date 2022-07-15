package com.corrodinggames.rts.game.units.custom.p015a.p016a;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0338ah;
import com.corrodinggames.rts.game.units.custom.C0433j;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadata;
import com.corrodinggames.rts.game.units.custom.CustomUnitMetadataFactory;
import com.corrodinggames.rts.game.units.custom.p015a.AbstractC0309a;
import com.corrodinggames.rts.game.units.custom.p015a.C0327d;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.utility.UnitConfig;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.game.units.custom.a.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/a/a/f.class */
public class C0315f extends AbstractC0309a {

    /* renamed from: a */
    C0338ah f1902a;

    /* renamed from: b */
    C0338ah f1903b;

    /* renamed from: c */
    C0338ah f1904c;

    /* renamed from: d */
    C0338ah f1905d;

    /* renamed from: e */
    C0338ah f1906e;

    /* renamed from: f */
    C0338ah f1907f;

    /* renamed from: g */
    static final Pattern f1901g = Pattern.compile("%\\{([^\\]]*?)\\}");

    /* renamed from: a */
    public static void m3637a(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2, C0327d c0327d, String str3, boolean z) {
        C0338ah m3575a = CustomUnitMetadataFactory.m3575a(customUnitMetadata, unitConfig, str, "showMessageToPlayer", (String) null);
        C0338ah m3575a2 = CustomUnitMetadataFactory.m3575a(customUnitMetadata, unitConfig, str, "showMessageToAllPlayers", (String) null);
        C0338ah m3575a3 = CustomUnitMetadataFactory.m3575a(customUnitMetadata, unitConfig, str, "showMessageToAllEnemyPlayers", (String) null);
        C0338ah m3575a4 = CustomUnitMetadataFactory.m3575a(customUnitMetadata, unitConfig, str, "showQuickWarLogToPlayer", (String) null);
        C0338ah m3575a5 = CustomUnitMetadataFactory.m3575a(customUnitMetadata, unitConfig, str, "showQuickWarLogToAllPlayers", (String) null);
        C0338ah m3575a6 = CustomUnitMetadataFactory.m3575a(customUnitMetadata, unitConfig, str, "debugMessage", (String) null);
        if (m3575a != null || m3575a2 != null || m3575a3 != null || m3575a4 != null || m3575a5 != null || m3575a6 != null) {
            C0315f c0315f = new C0315f();
            c0315f.f1902a = m3575a;
            c0315f.f1903b = m3575a2;
            c0315f.f1904c = m3575a3;
            c0315f.f1905d = m3575a4;
            c0315f.f1906e = m3575a5;
            c0315f.f1907f = m3575a6;
            c0327d.f2069Z.add(c0315f);
        }
    }

    /* renamed from: a */
    public String m3638a(C0433j c0433j, String str) {
        if (str == null) {
            str = null;
        }
        return str;
    }

    @Override // com.corrodinggames.rts.game.units.custom.p015a.AbstractC0309a
    /* renamed from: a */
    public boolean mo3629a(C0433j c0433j, Action action, PointF pointF, Unit unit, int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.f1902a != null && c0433j.team == gameEngine.playerTeam) {
            NetworkEngine.m1468a((String) null, m3638a(c0433j, this.f1902a.m3521b(c0433j)));
        }
        if (this.f1903b != null) {
            NetworkEngine.m1468a((String) null, m3638a(c0433j, this.f1903b.m3521b(c0433j)));
        }
        if (this.f1904c != null && gameEngine.playerTeam != null && c0433j.team.m3925c(gameEngine.playerTeam)) {
            NetworkEngine.m1468a((String) null, m3638a(c0433j, this.f1904c.m3521b(c0433j)));
        }
        if (this.f1905d != null && c0433j.team == gameEngine.playerTeam) {
            gameEngine.interfaceEngine.f4737f.m1956a(m3638a(c0433j, this.f1905d.m3521b(c0433j)));
        }
        if (this.f1906e != null) {
            gameEngine.interfaceEngine.f4737f.m1956a(m3638a(c0433j, this.f1906e.m3521b(c0433j)));
        }
        if (this.f1907f != null && gameEngine.editorMode && gameEngine.debugTempMode) {
            NetworkEngine.m1468a((String) null, c0433j.m3157dp().mo3087i() + "(" + c0433j.GameObjectID + ") Debug: " + m3638a(c0433j, this.f1907f.m3521b(c0433j)));
            return true;
        }
        return true;
    }
}