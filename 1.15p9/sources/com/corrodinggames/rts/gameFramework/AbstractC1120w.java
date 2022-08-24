package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.utility.C1104o;
import com.corrodinggames.rts.gameFramework.utility.C1109s;

/* renamed from: com.corrodinggames.rts.gameFramework.w */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/w.class */
public abstract class AbstractC1120w extends AbstractC0726bk {

    /* renamed from: ed */
    public long f6945ed;

    /* renamed from: ef */
    public boolean f6946ef;

    /* renamed from: eg */
    public boolean f6947eg;

    /* renamed from: eh */
    public boolean f6948eh;

    /* renamed from: ei */
    public int f6949ei;

    /* renamed from: ej */
    public int f6950ej;

    /* renamed from: ek */
    public float f6951ek;

    /* renamed from: el */
    public float f6952el;

    /* renamed from: em */
    public float height;

    /* renamed from: ee */
    public static C1121x f6954ee = new C1121x();

    /* renamed from: a */
    private static final C1104o f6955a = new C1104o();

    /* renamed from: en */
    public static final C1109s f6956en = new C1109s("fastGameObjectList");

    /* renamed from: a */
    public abstract void update(float f);

    /* renamed from: a */
    public abstract void mo469a(float f, boolean z);

    /* renamed from: d */
    public abstract void mo461d(float f);

    /* renamed from: e */
    public abstract void mo458e(float f);

    /* renamed from: c */
    public abstract boolean draw(float f);

    /* renamed from: f */
    public abstract boolean mo457f(float f);

    /* renamed from: S */
    public void setDrawLayer(int i) {
        this.f6949ei = i;
    }

    @Override // com.corrodinggames.rts.gameFramework.AbstractC0726bk
    /* renamed from: a */
    public void mo466a(C0859ar c0859ar) {
        c0859ar.mo1482a(this.f6946ef);
        c0859ar.mo1482a(this.f6947eg);
        c0859ar.mo1487a(this.f6949ei);
    }

    /* renamed from: a */
    public void mo2877a(C0876k c0876k) {
        this.f6946ef = c0876k.m1455e();
        this.f6947eg = c0876k.m1455e();
        this.f6949ei = c0876k.m1454f();
    }

    public AbstractC1120w() {
        this(false);
    }

    public AbstractC1120w(boolean z) {
        this.f6946ef = false;
        this.f6947eg = false;
        this.f6949ei = 2;
        this.f6950ej = 0;
        this.height = 0.0f;
        if (!z) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (this.f6945ed != 0) {
                throw new RuntimeException("ID for GameObject is already set at:" + this.f6945ed);
            }
            this.f6945ed = gameEngine.networkEngine.m1613y();
            if (this.f6945ed == 0) {
                throw new RuntimeException("Adding object with id:0 class:" + getClass().getSimpleName());
            }
            f6955a.m545a(this);
            f6956en.mo534a(this);
            return;
        }
        this.f6945ed = 0L;
    }

    /* renamed from: p */
    public void mo456p(float f) {
    }

    /* renamed from: a */
    public boolean mo464a(GameEngine gameEngine) {
        return true;
    }

    /* renamed from: a */
    public void mo2880a() {
        if (this.f6945ed != 0) {
            f6955a.m542b(this);
            f6956en.remove(this);
        }
        this.f6946ef = true;
    }

    /* renamed from: a */
    public static AbstractC1120w m468a(long j, Class cls, boolean z) {
        if (j == -1) {
            return null;
        }
        AbstractC1120w[] m539a = f6956en.m539a();
        int size = f6956en.size();
        for (int i = 0; i < size; i++) {
            AbstractC1120w abstractC1120w = m539a[i];
            if (abstractC1120w.f6945ed == j) {
                if (cls.isInstance(abstractC1120w)) {
                    return abstractC1120w;
                }
                String name = abstractC1120w.getClass().getName();
                String name2 = cls.getName();
                C0831ad.m1648g("object id:" + j + " was found, but with type " + name.replace("com.corrodinggames.rts.", VariableScope.nullOrMissingString) + " instead of " + name2.replace("com.corrodinggames.rts.", VariableScope.nullOrMissingString));
            }
        }
        if (!z) {
            C0831ad.m1648g("getFromId:" + j + " was not found");
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public static Unit m467a(long j, boolean z) {
        return (Unit) m468a(j, Unit.class, z);
    }

    /* renamed from: b */
    public static AbstractC0623y m463b(long j, boolean z) {
        return (AbstractC0623y) m468a(j, AbstractC0623y.class, z);
    }

    /* renamed from: dI */
    public static C1104o m460dI() {
        f6955a.m549a();
        return f6955a;
    }

    /* renamed from: dJ */
    public static void m459dJ() {
        f6955a.m549a();
        Unit.m5849bG();
    }
}
