package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.game.units.AbstractC0210af;

/* renamed from: com.corrodinggames.rts.gameFramework.g.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/f.class */
public class C0702f extends C0690ap {

    /* renamed from: a */
    public String f4967a = "";

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0690ap
    /* renamed from: a */
    public void mo1095a(int i) {
        this.f4967a += "|" + i;
        super.mo1095a(i);
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0690ap
    /* renamed from: a */
    public void mo1096a(float f) {
        this.f4967a += "|" + f;
        super.mo1096a(f);
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0690ap
    /* renamed from: a */
    public void mo1091a(short s) {
        this.f4967a += "|" + ((int) s);
        super.mo1091a(s);
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0690ap
    /* renamed from: a */
    public void mo1090a(boolean z) {
        this.f4967a += "|" + z;
        super.mo1090a(z);
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0690ap
    /* renamed from: a */
    public void mo1092a(String str, boolean z) {
        this.f4967a += "<" + str + ">";
        super.mo1092a(str, z);
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0690ap
    /* renamed from: a */
    public void mo1093a(String str) {
        this.f4967a += "</" + str + ">";
        super.mo1093a(str);
    }

    @Override // com.corrodinggames.rts.gameFramework.p036g.C0690ap
    /* renamed from: a */
    public void mo1094a(AbstractC0210af afVar) {
        this.f4967a += "|u:" + afVar;
        super.mo1094a(afVar);
    }
}
