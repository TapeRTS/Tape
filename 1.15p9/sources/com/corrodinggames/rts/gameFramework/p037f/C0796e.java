package com.corrodinggames.rts.gameFramework.p037f;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0725bj;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.f.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/e.class */
public class C0796e {

    /* renamed from: a */
    public String f5101a;

    /* renamed from: b */
    public String f5102b;

    /* renamed from: c */
    public float f5103c;

    /* renamed from: d */
    public float f5104d;

    public C0796e(String str, String str2) {
        this.f5101a = str;
        this.f5102b = str2;
    }

    public C0796e(String str, float f) {
        this.f5101a = str;
        this.f5103c = f;
        this.f5102b = null;
    }

    /* renamed from: a */
    public static ArrayList m2079a() {
        GameEngine gameEngine = GameEngine.getInstance();
        ArrayList arrayList = new ArrayList();
        C0725bj c0725bj = null;
        if (gameEngine.f6093bs != null) {
            c0725bj = gameEngine.f6117bY.m2621a(gameEngine.f6093bs);
        }
        if (c0725bj != null) {
            if (gameEngine.f6123ce != null && gameEngine.f6123ce.f6662k) {
                arrayList.add(new C0796e("Lasted till wave: " + gameEngine.f6123ce.f6669r, VariableScope.nullOrMissingString));
                if (!gameEngine.f6123ce.f6663l) {
                    arrayList.add(new C0796e("Wave difficulty: " + gameEngine.networkEngine.m1684c(gameEngine.f6123ce.f6676y), VariableScope.nullOrMissingString));
                }
            }
            arrayList.add(new C0796e("Game Time", CommonUtils.m2356a(gameEngine.f6096by / 1000)));
            arrayList.add(new C0796e("=============================", VariableScope.nullOrMissingString));
            arrayList.add(new C0796e("Units Killed", c0725bj.f4554c));
            arrayList.add(new C0796e("Buildings Killed", c0725bj.f4555d));
            arrayList.add(new C0796e("Experimentals Killed", c0725bj.f4556e));
            arrayList.add(new C0796e("=============================", VariableScope.nullOrMissingString));
            arrayList.add(new C0796e("Units Lost", c0725bj.f4557f));
            arrayList.add(new C0796e("Buildings Lost", c0725bj.f4558g));
            arrayList.add(new C0796e("Experimentals Lost", c0725bj.f4559h));
            arrayList.add(new C0796e("=============================", VariableScope.nullOrMissingString));
        }
        return arrayList;
    }
}
