package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.AbstractC0515r;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.utility.C0838o;
import com.corrodinggames.rts.gameFramework.utility.C0843s;

/* renamed from: com.corrodinggames.rts.gameFramework.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/w.class */
public abstract class AbstractC0854w extends AbstractC0585bi {

    /* renamed from: dA */
    public long f5835dA;

    /* renamed from: dC */
    public boolean f5836dC;

    /* renamed from: dD */
    public boolean f5837dD;

    /* renamed from: dE */
    public boolean f5838dE;

    /* renamed from: dF */
    public int f5839dF;

    /* renamed from: dG */
    public int f5840dG;

    /* renamed from: dH */
    public float f5841dH;

    /* renamed from: dI */
    public float f5842dI;

    /* renamed from: dJ */
    public float f5843dJ;

    /* renamed from: dB */
    public static C0855x f5844dB = new C0855x();

    /* renamed from: a */
    private static final C0838o f5845a = new C0838o();

    /* renamed from: dK */
    public static final C0843s f5846dK = new C0843s("fastGameObjectList");

    /* renamed from: a */
    public abstract void mo1665a(float f);

    /* renamed from: a */
    public abstract void mo2033a(float f, boolean z);

    /* renamed from: d */
    public abstract void mo2024d(float f);

    /* renamed from: e */
    public abstract void mo2023e(float f);

    /* renamed from: c */
    public abstract boolean mo2025c(float f);

    /* renamed from: f */
    public abstract boolean mo2022f(float f);

    /* renamed from: R */
    public void m406R(int i) {
        this.f5839dF = i;
    }

    /* renamed from: a */
    public void mo1654a(C0690ap apVar) {
        apVar.mo1104a(this.f5836dC);
        apVar.mo1104a(this.f5837dD);
        apVar.mo1109a(this.f5839dF);
    }

    /* renamed from: a */
    public void mo2031a(C0707k kVar) {
        this.f5836dC = kVar.m1077e();
        this.f5837dD = kVar.m1077e();
        this.f5839dF = kVar.m1076f();
    }

    public AbstractC0854w() {
        this(false);
    }

    public AbstractC0854w(boolean z) {
        this.f5836dC = false;
        this.f5837dD = false;
        this.f5839dF = 2;
        this.f5840dG = 0;
        this.f5843dJ = 0.0f;
        if (!z) {
            AbstractC0789l u = AbstractC0789l.m651u();
            if (this.f5835dA != 0) {
                throw new RuntimeException("ID for GameObject is already set at:" + this.f5835dA);
            }
            this.f5835dA = u.f5486bF.m1230t();
            f5845a.m478a(this);
            f5846dK.m467a(this);
            return;
        }
        this.f5835dA = 0L;
    }

    /* renamed from: o */
    public void mo3545o(float f) {
    }

    /* renamed from: a */
    public boolean mo2030a(AbstractC0789l lVar) {
        return true;
    }

    /* renamed from: a */
    public void mo2099a() {
        f5845a.m475b(this);
        f5846dK.remove(this);
        this.f5836dC = true;
    }

    /* renamed from: a */
    public static AbstractC0854w m402a(long j, Class cls, boolean z) {
        if (j == -1) {
            return null;
        }
        AbstractC0854w[] a = f5846dK.m472a();
        int size = f5846dK.size();
        for (int i = 0; i < size; i++) {
            AbstractC0854w wVar = a[i];
            if (wVar.f5835dA == j) {
                if (cls.isInstance(wVar)) {
                    return wVar;
                }
                String name = wVar.getClass().getName();
                String name2 = cls.getName();
                Hcat_Multiplaye.m1261f("object id:" + j + " was found, but with type " + name.replace("com.corrodinggames.rts.", "") + " instead of " + name2.replace("com.corrodinggames.rts.", ""));
            }
        }
        if (z) {
            return null;
        }
        Hcat_Multiplaye.m1261f("getFromId:" + j + " was not found");
        return null;
    }

    /* renamed from: a */
    public static AbstractC0210af m401a(long j, boolean z) {
        return (AbstractC0210af) m402a(j, AbstractC0210af.class, z);
    }

    /* renamed from: b */
    public static AbstractC0515r m397b(long j, boolean z) {
        return (AbstractC0515r) m402a(j, AbstractC0515r.class, z);
    }

    /* renamed from: dp */
    public static C0838o m394dp() {
        f5845a.m482a();
        return f5845a;
    }

    /* renamed from: dq */
    public static void m393dq() {
        f5845a.m482a();
        AbstractC0210af.m3600bu();
    }
}
