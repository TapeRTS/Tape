package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.EditorOrBuilder;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.game.units.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o.class */
public abstract class AbstractC0603o extends Enum {

    /* renamed from: a */
    public static final AbstractC0603o f3860a = new C06041("land", 0);

    /* renamed from: b */
    public static final AbstractC0603o f3861b = new C06052("air", 1);

    /* renamed from: c */
    public static final AbstractC0603o f3862c = new C06063("sea", 2);

    /* renamed from: d */
    public static final AbstractC0603o f3863d = new C06074("buildings", 3);

    /* renamed from: e */
    public static final AbstractC0603o f3864e = new C06085("bio", 4);

    /* renamed from: f */
    private static final /* synthetic */ AbstractC0603o[] f3865f = {f3860a, f3861b, f3862c, f3863d, f3864e};

    /* renamed from: a */
    public abstract boolean m3342a(InterfaceC0303as interfaceC0303as);

    public static AbstractC0603o[] values() {
        return (AbstractC0603o[]) f3865f.clone();
    }

    public static AbstractC0603o valueOf(String str) {
        return (AbstractC0603o) Enum.valueOf(AbstractC0603o.class, str);
    }

    private AbstractC0603o(String str, int i) {
        super(str, i);
    }

    /* synthetic */ AbstractC0603o(String str, int i, EditorOrBuilder.C05561 c05561) {
        this(str, i);
    }

    /* renamed from: com.corrodinggames.rts.game.units.o$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o$1.class */
    final class C06041 extends AbstractC0603o {
        C06041(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3339a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            Unit m5847c = Unit.m5847c(interfaceC0303as);
            return !m5847c.m5863bO() && !interfaceC0303as.mo5705j() && m5847c.mo5645h() != EnumC0246ao.f1705d && m5847c.mo5645h() != EnumC0246ao.f1706e;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.o$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o$2.class */
    final class C06052 extends AbstractC0603o {
        C06052(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3338a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            Unit m5847c = Unit.m5847c(interfaceC0303as);
            return !m5847c.m5863bO() && !interfaceC0303as.mo5705j() && m5847c.mo5645h() == EnumC0246ao.f1705d;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.o$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o$3.class */
    final class C06063 extends AbstractC0603o {
        C06063(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3337a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            Unit m5847c = Unit.m5847c(interfaceC0303as);
            return !m5847c.m5863bO() && !interfaceC0303as.mo5705j() && m5847c.mo5645h() == EnumC0246ao.f1706e;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.o$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o$4.class */
    final class C06074 extends AbstractC0603o {
        C06074(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3336a(InterfaceC0303as interfaceC0303as) {
            return interfaceC0303as != null && !Unit.m5847c(interfaceC0303as).m5863bO() && interfaceC0303as.mo5705j();
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.o$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/o$5.class */
    final class C06085 extends AbstractC0603o {
        C06085(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3335a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as == null) {
                return false;
            }
            return Unit.m5847c(interfaceC0303as).m5863bO();
        }
    }

    /* renamed from: a */
    public String m3344a() {
        return name();
    }

    /* renamed from: a */
    public AbstractC0603o m3341a(boolean z) {
        if (!z) {
            return m3343a(1, 0);
        }
        return m3343a(-1, 0);
    }

    /* renamed from: a */
    public AbstractC0603o m3343a(int i, int i2) {
        int ordinal = (ordinal() + i) % values().length;
        if (ordinal < 0) {
            ordinal += values().length;
        }
        AbstractC0603o abstractC0603o = values()[ordinal];
        if (!abstractC0603o.m3340b()) {
            if (i2 > 30) {
                GameEngine.PrintLog("jumpBy recursion limit hit");
                return abstractC0603o;
            }
            abstractC0603o = abstractC0603o.m3343a(i, i2 + 1);
        }
        return abstractC0603o;
    }

    /* renamed from: b */
    public boolean m3340b() {
        return true;
    }
}
