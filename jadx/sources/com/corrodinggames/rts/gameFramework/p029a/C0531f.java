package com.corrodinggames.rts.gameFramework.p029a;

import android.content.Context;
import com.corrodinggames.rts.C0063R;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0832j;

/* renamed from: com.corrodinggames.rts.gameFramework.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/f.class */
public class C0531f extends AbstractC0533h {
    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0533h
    /* renamed from: a */
    public void mo77a(Context context) {
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0533h
    /* renamed from: a */
    public AbstractC0534i mo78a(int i) {
        return new C0532g(C0654f.m1494a(C0063R.raw.class, i), this);
    }

    @Override // com.corrodinggames.rts.gameFramework.p029a.AbstractC0533h
    /* renamed from: a */
    public AbstractC0534i mo76a(String str, C0832j jVar, boolean z) {
        return new C0532g(str, this);
    }

    /* renamed from: b */
    public static AbstractC0534i m2107b() {
        return new C0532g("Null (from out of memory)", null);
    }
}
