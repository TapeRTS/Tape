package com.corrodinggames.rts.gameFramework.p040k.p041a;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p012b.C0154f;
import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0364h;
import com.corrodinggames.rts.gameFramework.p040k.C0762a;

/* renamed from: com.corrodinggames.rts.gameFramework.k.a.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/a/b.class */
public class C0764b extends AbstractC0763a {

    /* renamed from: a */
    AbstractC0171m f5340a;

    /* renamed from: b */
    C0364h f5341b;

    /* renamed from: b */
    public static C0764b m808b(C0762a aVar) {
        C0764b bVar = new C0764b();
        bVar.f5340a = aVar.m832a();
        if (bVar.f5340a != null) {
            throw new C0154f("teamTagDetect requires a team set");
        }
        String b = aVar.m819b("teamTag");
        if (b == null || b.equals("")) {
            throw new C0154f("teamTagDetect requires a teamTag set");
        }
        try {
            bVar.f5341b = C0364h.m2898b(b);
            return bVar;
        } catch (C0324at e) {
            throw new C0154f(e.getMessage());
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p040k.p041a.AbstractC0763a
    /* renamed from: a */
    public boolean mo807a(C0762a aVar) {
        if (C0364h.m2905a(this.f5341b, this.f5340a.m3516O())) {
            return true;
        }
        return false;
    }
}
