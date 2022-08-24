package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;

/* renamed from: com.corrodinggames.rts.gameFramework.i.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/f.class */
public class C0871f extends C0859ar {

    /* renamed from: a */
    public String f5816a = VariableScope.nullOrMissingString;

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1481a(int i) {
        this.f5816a += "|" + i;
        super.mo1481a(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1482a(float f) {
        this.f5816a += "|" + f;
        super.mo1482a(f);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1477a(short s) {
        this.f5816a += "|" + ((int) s);
        super.mo1477a(s);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1476a(boolean z) {
        this.f5816a += "|" + z;
        super.mo1476a(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1478a(String str, boolean z) {
        this.f5816a += "<" + str + ">";
        super.mo1478a(str, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1479a(String str) {
        this.f5816a += "</" + str + ">";
        super.mo1479a(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.p041i.C0859ar
    /* renamed from: a */
    public void mo1480a(AbstractC0244am abstractC0244am) {
        this.f5816a += "|u:" + abstractC0244am;
        super.mo1480a(abstractC0244am);
    }
}
