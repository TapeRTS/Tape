package com.corrodinggames.rts.gameFramework.p030a;

import com.corrodinggames.rts.gameFramework.CommonUtils;

/* renamed from: com.corrodinggames.rts.gameFramework.a.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/a/i.class */
public abstract class AbstractC0635i {

    /* renamed from: e */
    public String f4063e;

    /* renamed from: g */
    public boolean f4064g;

    /* renamed from: d */
    public float f4065d = 1.0f;

    /* renamed from: f */
    public boolean f4066f = false;

    /* renamed from: a */
    public abstract void mo2992a(float f, float f2, int i, int i2, float f3);

    /* renamed from: a */
    public abstract int mo2993a();

    public AbstractC0635i(String str, AbstractC0634h abstractC0634h) {
        this.f4063e = CommonUtils.m2256g(str);
        if (abstractC0634h != null) {
            abstractC0634h.f4062h.put(this.f4063e, this);
        }
    }
}
