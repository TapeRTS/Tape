package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.units.EditorOrBuilder;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.n */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n.class */
public abstract class AbstractC0596n extends Enum {

    /* renamed from: a */
    public static final AbstractC0596n f3853a = new C05971("all", 0);

    /* renamed from: b */
    public static final AbstractC0596n f3854b = new C05982("types", 1);

    /* renamed from: c */
    public static final AbstractC0596n f3855c = new C05993("terrain", 2);

    /* renamed from: d */
    public static final AbstractC0596n f3856d = new C06004("modded", 3);

    /* renamed from: e */
    public static final AbstractC0596n f3857e = new C06015("search", 4);

    /* renamed from: f */
    public static final AbstractC0596n f3858f = new C06026("actions", 5);

    /* renamed from: g */
    private static final /* synthetic */ AbstractC0596n[] f3859g = {f3853a, f3854b, f3855c, f3856d, f3857e, f3858f};

    /* renamed from: a */
    public abstract boolean m3355a(InterfaceC0303as interfaceC0303as);

    public static AbstractC0596n[] values() {
        return (AbstractC0596n[]) f3859g.clone();
    }

    public static AbstractC0596n valueOf(String str) {
        return (AbstractC0596n) Enum.valueOf(AbstractC0596n.class, str);
    }

    private AbstractC0596n(String str, int i) {
        super(str, i);
    }

    /* synthetic */ AbstractC0596n(String str, int i, EditorOrBuilder.C05561 c05561) {
        this(str, i);
    }

    /* renamed from: com.corrodinggames.rts.game.units.n$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n$1.class */
    final class C05971 extends AbstractC0596n {
        C05971(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3352a(InterfaceC0303as interfaceC0303as) {
            return true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.n$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n$2.class */
    final class C05982 extends AbstractC0596n {
        C05982(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3351a(InterfaceC0303as interfaceC0303as) {
            EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
            if (m3709L != null && m3709L.f3787E != null) {
                return m3709L.f3787E.m3342a(interfaceC0303as);
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.n$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n$3.class */
    final class C05993 extends AbstractC0596n {
        C05993(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3350a(InterfaceC0303as interfaceC0303as) {
            return false;
        }

        /* renamed from: b */
        public boolean m3349b() {
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.n$4 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n$4.class */
    final class C06004 extends AbstractC0596n {
        C06004(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3348a(InterfaceC0303as interfaceC0303as) {
            if (interfaceC0303as != null && (interfaceC0303as instanceof C0453l)) {
                C0453l c0453l = (C0453l) interfaceC0303as;
                if (c0453l.f2917I == null) {
                    return false;
                }
                EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
                if (m3709L != null && m3709L.f3786D != null && c0453l.f2917I != m3709L.f3786D) {
                    return false;
                }
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.n$5 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n$5.class */
    final class C06015 extends AbstractC0596n {
        C06015(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3347a(InterfaceC0303as interfaceC0303as) {
            EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
            if (m3709L == null || m3709L.f3789G == null) {
                return false;
            }
            if (m3709L.f3790H) {
                m3709L.f3790H = false;
                m3709L.f3791I = m3709L.f3789G.toLowerCase().trim();
            }
            if (interfaceC0303as == null) {
                return false;
            }
            if (interfaceC0303as.mo5706i() != null && interfaceC0303as.mo5706i().toLowerCase(Locale.ROOT).contains(m3709L.f3791I)) {
                return true;
            }
            if (interfaceC0303as.mo5706i() != null && interfaceC0303as.mo5710e().toLowerCase(Locale.ROOT).contains(m3709L.f3791I)) {
                return true;
            }
            return false;
        }

        /* renamed from: b */
        public boolean m3346b() {
            EditorOrBuilder m3709L = EditorOrBuilder.m3709L();
            return (m3709L == null || m3709L.f3789G == null) ? false : true;
        }
    }

    /* renamed from: com.corrodinggames.rts.game.units.n$6 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/n$6.class */
    final class C06026 extends AbstractC0596n {
        C06026(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: a */
        public boolean m3345a(InterfaceC0303as interfaceC0303as) {
            return interfaceC0303as == null;
        }
    }

    /* renamed from: a */
    public String m3357a() {
        return name();
    }

    /* renamed from: b */
    public boolean m3353b() {
        return true;
    }

    /* renamed from: a */
    public AbstractC0596n m3354a(boolean z) {
        if (!z) {
            return m3356a(1, 0);
        }
        return m3356a(-1, 0);
    }

    /* renamed from: a */
    public AbstractC0596n m3356a(int i, int i2) {
        int ordinal = (ordinal() + i) % values().length;
        if (ordinal < 0) {
            ordinal += values().length;
        }
        AbstractC0596n abstractC0596n = values()[ordinal];
        if (!abstractC0596n.m3353b()) {
            if (i2 > 30) {
                GameEngine.PrintLog("jumpBy recursion limit hit");
                return abstractC0596n;
            }
            abstractC0596n = abstractC0596n.m3356a(i, i2 + 1);
        }
        return abstractC0596n;
    }
}
