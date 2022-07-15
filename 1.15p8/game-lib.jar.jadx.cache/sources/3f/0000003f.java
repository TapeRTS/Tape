package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.y */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/y.class */
public class C0449y {

    /* renamed from: a */
    public String f3174a;

    /* renamed from: b */
    public Effect[] f3175b;

    /* renamed from: c */
    final /* synthetic */ CustomUnitMetadata f3176c;

    /* renamed from: a */
    public boolean m3044a() {
        return (this.f3175b == null || this.f3175b.length == 0) ? false : true;
    }

    /* renamed from: b */
    public boolean m3041b() {
        return this.f3175b != null && (this.f3175b.length != 0 || this.f3175b == CustomUnitMetadata.f3017fT);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public C0449y(CustomUnitMetadata customUnitMetadata, String str) {
        this.f3176c = customUnitMetadata;
        this.f3174a = str;
        customUnitMetadata.f3093fQ.add(this);
    }

    /* renamed from: c */
    public void m3040c() {
        if (this.f3174a == null || this.f3174a.equals(VariableScope.nullOrMissingString)) {
            this.f3175b = CustomUnitMetadata.f3016fS;
        } else if (this.f3174a.equalsIgnoreCase("NONE")) {
            this.f3175b = CustomUnitMetadata.f3017fT;
        } else {
            ArrayList arrayList = new ArrayList();
            for (String str : this.f3174a.split(",")) {
                String[] split = str.trim().split("\\*");
                String str2 = split[0];
                int i = 1;
                if (split.length >= 2) {
                    i = Integer.parseInt(split[1]);
                }
                Effect effect = this.f3176c.getEffect(str2);
                for (int i2 = 0; i2 < i; i2++) {
                    arrayList.add(effect);
                }
            }
            this.f3175b = (Effect[]) arrayList.toArray(CustomUnitMetadata.f3016fS);
        }
    }

    /* renamed from: a */
    public EffectObject m3043a(float f, float f2, float f3, float f4, GameObject gameObject) {
        return m3042a(f, f2, f3, f4, gameObject, 0, (short) 0);
    }

    /* renamed from: a */
    public EffectObject m3042a(float f, float f2, float f3, float f4, GameObject gameObject, int i, short s) {
        EffectObject effectObject = null;
        for (Effect effect : this.f3175b) {
            EffectObject m3495a = effect.m3495a(f, f2, f3, f4, gameObject, i, s);
            if (m3495a != null && effectObject == null) {
                effectObject = m3495a;
            }
        }
        return effectObject;
    }
}