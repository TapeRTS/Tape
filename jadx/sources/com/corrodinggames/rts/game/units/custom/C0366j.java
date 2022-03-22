package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.gameFramework.utility.C0835m;

/* renamed from: com.corrodinggames.rts.game.units.custom.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/j.class */
public class C0366j {

    /* renamed from: a */
    public C0835m f2438a = new C0835m();

    public C0366j() {
    }

    public C0366j(C0365i iVar) {
        if (iVar != null) {
            for (C0364h hVar : iVar.f2437a) {
                this.f2438a.add(hVar);
            }
        }
    }

    /* renamed from: a */
    public boolean m2891a(C0365i iVar) {
        if (iVar == null) {
            return false;
        }
        boolean z = false;
        for (C0364h hVar : iVar.f2437a) {
            if (m2892a(hVar)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public boolean m2892a(C0364h hVar) {
        if (this.f2438a.contains(hVar)) {
            return false;
        }
        this.f2438a.add(hVar);
        return true;
    }

    /* renamed from: b */
    public boolean m2890b(C0365i iVar) {
        if (iVar == null) {
            return false;
        }
        boolean z = false;
        for (C0364h hVar : iVar.f2437a) {
            if (this.f2438a.remove(hVar)) {
                z = true;
            }
        }
        return z;
    }

    /* renamed from: a */
    public C0365i m2893a() {
        if (this.f2438a.size() == 0) {
            return C0364h.f2436d;
        }
        return new C0365i((C0364h[]) this.f2438a.toArray(C0364h.f2435c));
    }
}
