package com.corrodinggames.rts.gameFramework.p030a;

import android.content.Context;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.utility.C1098j;

/* renamed from: com.corrodinggames.rts.gameFramework.a.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/f.class */
public class C0632f extends AbstractC0634h {
    /* renamed from: a */
    public void mo2989a(Context context) {
    }

    /* renamed from: a */
    public AbstractC0635i mo2990a(int i) {
        return new C0633g(CommonUtils.m2340a(R.raw.class, i), this);
    }

    /* renamed from: a */
    public AbstractC0635i mo2988a(String str, C1098j c1098j, boolean z) {
        return new C0633g(str, this);
    }

    /* renamed from: b */
    public static AbstractC0635i m2994b() {
        return new C0633g("Null (from out of memory)", null);
    }

    /* renamed from: a */
    public static AbstractC0635i m2995a(String str) {
        return new C0633g("Null sound - " + str, null);
    }
}
