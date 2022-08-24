package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.p039g.C0820a;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.ai */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ai.class */
public class C0351ai {

    /* renamed from: a */
    public static final C0351ai f2227a = m5376a(VariableScope.nullOrMissingString);

    /* renamed from: b */
    public AbstractC0352aj[] f2228b;

    /* renamed from: c */
    public C0400ba[] f2229c;

    /* renamed from: d */
    public String f2230d;

    /* renamed from: e */
    public int f2231e = -1;

    /* renamed from: f */
    public String f2232f;

    /* renamed from: g */
    public String f2233g;

    /* renamed from: h */
    C0453l f2234h;

    /* renamed from: a */
    public static C0351ai m5376a(String str) {
        C0351ai c0351ai = new C0351ai();
        ArrayList arrayList = new ArrayList();
        C0400ba c0400ba = new C0400ba();
        c0400ba.f2485a = null;
        c0400ba.f2486b = str;
        arrayList.add(c0400ba);
        c0351ai.f2229c = (C0400ba[]) arrayList.toArray(new C0400ba[0]);
        c0351ai.m5379a();
        return c0351ai;
    }

    /* renamed from: a */
    public static C0351ai m5377a(C0385az c0385az) {
        if (c0385az == null) {
            return null;
        }
        C0351ai c0351ai = new C0351ai();
        c0351ai.f2234h = C0453l.f2901b;
        c0351ai.f2229c = c0385az.f2318b;
        c0351ai.f2232f = c0385az.f2321e;
        if (c0351ai.f2229c != null) {
            C0400ba[] c0400baArr = c0351ai.f2229c;
            int length = c0400baArr.length;
            int i = 0;
            while (i < length) {
                C0400ba c0400ba = c0400baArr[i];
                i = (c0400ba.f2486b == null || c0400ba.f2486b.contains("%{")) ? i + 1 : i + 1;
            }
        }
        c0351ai.m5371c();
        return c0351ai;
    }

    public C0351ai() {
    }

    public C0351ai(C0453l c0453l, C0385az c0385az) {
        C0400ba[] c0400baArr;
        this.f2234h = c0453l;
        this.f2229c = c0385az.f2318b;
        this.f2232f = c0385az.f2321e;
        if (this.f2229c != null) {
            for (C0400ba c0400ba : this.f2229c) {
                if (c0400ba.f2486b != null && c0400ba.f2486b.contains("%{")) {
                    m5375a(c0400ba.f2486b, true);
                }
            }
        }
        m5379a();
    }

    /* renamed from: a */
    public void m5379a() {
        m5374a(true);
    }

    /* renamed from: a */
    public void m5374a(boolean z) {
        m5371c();
        if (this.f2230d != null && this.f2230d.contains("%{")) {
            this.f2228b = m5375a(this.f2230d, z);
        } else {
            this.f2228b = null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:211:0x012f, code lost:
        return (com.corrodinggames.rts.game.units.custom.AbstractC0352aj[]) r0.toArray(new com.corrodinggames.rts.game.units.custom.AbstractC0352aj[0]);
     */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public com.corrodinggames.rts.game.units.custom.AbstractC0352aj[] m5375a(java.lang.String r7, boolean r8) {
        /*
            Method dump skipped, instructions count: 304
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.units.custom.C0351ai.m5375a(java.lang.String, boolean):com.corrodinggames.rts.game.units.custom.aj[]");
    }

    /* renamed from: a */
    public String m5378a(Unit unit) {
        if (!(unit instanceof AbstractC0623y)) {
            return "<No unit>:" + this.f2230d;
        }
        AbstractC0623y abstractC0623y = (AbstractC0623y) unit;
        StringBuffer stringBuffer = new StringBuffer();
        for (AbstractC0352aj abstractC0352aj : this.f2228b) {
            stringBuffer.append(abstractC0352aj.mo5369a(abstractC0623y));
        }
        return stringBuffer.toString();
    }

    /* renamed from: b */
    public String m5372b(Unit unit) {
        if (this.f2231e == C0820a.f5395c) {
            if (this.f2228b != null) {
                return m5378a(unit);
            }
            return this.f2230d;
        }
        m5374a(false);
        if (this.f2228b != null) {
            return m5378a(unit);
        }
        return this.f2230d;
    }

    /* renamed from: b */
    public String m5373b() {
        if (this.f2231e == C0820a.f5395c) {
            return this.f2230d;
        }
        m5374a(false);
        return this.f2230d;
    }

    /* renamed from: c */
    public void m5371c() {
        C0400ba[] c0400baArr;
        C0400ba[] c0400baArr2;
        if (this.f2232f != null) {
            this.f2231e = C0820a.f5395c;
            this.f2230d = C0820a.m1886a(this.f2232f, new Object[0]);
            return;
        }
        String m1883c = C0820a.m1883c();
        for (C0400ba c0400ba : this.f2229c) {
            if (m1883c.equals(c0400ba.f2485a)) {
                this.f2231e = C0820a.f5395c;
                this.f2230d = c0400ba.f2486b;
                return;
            }
        }
        for (C0400ba c0400ba2 : this.f2229c) {
            if (c0400ba2.f2485a == null) {
                this.f2231e = C0820a.f5395c;
                this.f2230d = c0400ba2.f2486b;
                return;
            }
        }
        this.f2231e = C0820a.f5395c;
        this.f2230d = "<NO DEFAULT TEXT FOUND>";
    }
}
