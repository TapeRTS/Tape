package com.corrodinggames.rts.game.units.custom;

import android.graphics.PointF;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.p012a.AbstractC0222w;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.t */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/t.class */
public class C0444t {

    /* renamed from: a */
    ObjectVector f3161a = new ObjectVector();

    /* renamed from: b */
    ObjectVector f3162b;

    /* renamed from: c */
    String f3163c;

    /* renamed from: d */
    String f3164d;

    /* renamed from: a */
    public void m3052a(CustomUnitMetadata customUnitMetadata) {
    }

    /* renamed from: b */
    public void m3051b(CustomUnitMetadata customUnitMetadata) {
        ObjectVector objectVector = new ObjectVector();
        Iterator it = this.f3161a.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            Action m3092f = customUnitMetadata.m3092f(str);
            if (m3092f == null) {
                throw new C0395bl("[" + this.f3164d + "]" + this.f3163c + " Could not find action:" + str + " on unit: " + customUnitMetadata.m3108b());
            }
            if (m3092f instanceof AbstractC0222w) {
                objectVector.add((AbstractC0222w) m3092f);
            } else {
                throw new C0395bl("[" + this.f3164d + "]" + this.f3163c + " Action:" + str + " on unit: " + customUnitMetadata.m3108b() + " doesn't have the right type");
            }
        }
        this.f3162b = objectVector;
    }

    /* renamed from: a */
    public void m3053a(C0433j c0433j, PointF pointF, Unit unit, int i) {
        if (this.f3162b == null) {
            NetworkEngine.reportDesync("Action on " + c0433j.m3157dp().mo3087i() + " has not been linked");
            return;
        }
        Iterator it = this.f3162b.iterator();
        while (it.hasNext()) {
            c0433j.m3218a((Action) it.next(), pointF, unit, i);
        }
    }

    /* renamed from: a */
    public ObjectVector m3055a() {
        if (this.f3162b == null) {
            NetworkEngine.reportDesync("Action on [" + this.f3164d + "]" + this.f3163c + " has not been linked");
            return new ObjectVector();
        }
        return this.f3162b;
    }

    /* renamed from: a */
    public void m3054a(C0433j c0433j, PointF pointF, Unit unit) {
        if (this.f3162b == null) {
            NetworkEngine.reportDesync("Action on " + c0433j.m3157dp().mo3087i() + " has not been linked");
            return;
        }
        Iterator it = this.f3162b.iterator();
        while (it.hasNext()) {
            c0433j.f2722dG.m2936a((AbstractC0222w) ((Action) it.next()), false, pointF, unit);
        }
    }
}