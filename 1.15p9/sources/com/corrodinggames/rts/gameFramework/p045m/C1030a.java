package com.corrodinggames.rts.gameFramework.p045m;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.p012b.C0172a;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.InterfaceC0242ak;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0385az;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0831ad;
import com.corrodinggames.rts.gameFramework.p045m.p046a.AbstractC1031a;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.m.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/a.class */
public class C1030a {

    /* renamed from: a */
    public String f6591a;

    /* renamed from: b */
    public String f6592b;

    /* renamed from: c */
    public String f6593c;

    /* renamed from: g */
    public EnumC1037e f6594g;

    /* renamed from: h */
    public boolean f6595h;

    /* renamed from: i */
    public boolean f6596i;

    /* renamed from: j */
    public boolean f6597j;

    /* renamed from: k */
    public int f6598k;

    /* renamed from: l */
    public int f6599l;

    /* renamed from: m */
    public boolean f6600m;

    /* renamed from: p */
    public int f6601p;

    /* renamed from: t */
    public C0172a f6602t;

    /* renamed from: v */
    public C0413bn f6603v;

    /* renamed from: w */
    public float f6604w;

    /* renamed from: x */
    public float f6605x;

    /* renamed from: y */
    public Team f6606y;

    /* renamed from: z */
    public C0385az f6607z;

    /* renamed from: A */
    public C0385az f6608A;

    /* renamed from: B */
    public Paint f6609B;

    /* renamed from: C */
    public boolean f6610C;

    /* renamed from: d */
    public C1034b f6611d = new C1034b();

    /* renamed from: e */
    public C1034b f6612e = new C1034b();

    /* renamed from: f */
    public C1101m f6613f = new C1101m();

    /* renamed from: n */
    public int f6614n = -1;

    /* renamed from: o */
    public int f6615o = Integer.MAX_VALUE;

    /* renamed from: q */
    public int f6616q = -1;

    /* renamed from: r */
    public int f6617r = -1;

    /* renamed from: s */
    public int f6618s = -1;

    /* renamed from: u */
    public boolean f6619u = false;

    /* renamed from: a */
    public void m867a(AbstractC1031a abstractC1031a) {
        this.f6613f.add(abstractC1031a);
    }

    /* renamed from: a */
    public void m866a(String str) {
        this.f6602t.m6657b(str);
    }

    /* renamed from: b */
    public String m856b(String str) {
        return this.f6602t.m6657b(str);
    }

    /* renamed from: a */
    public String m861a(String str, String str2) {
        return this.f6602t.m6660a(str, str2);
    }

    /* renamed from: c */
    public boolean m853c(String str) {
        return this.f6602t.m6657b(str) != null;
    }

    /* renamed from: a */
    public int m864a(String str, int i) {
        String m861a = m861a(str, (String) null);
        if (m861a == null) {
            return i;
        }
        try {
            return Integer.parseInt(m861a);
        } catch (NumberFormatException e) {
            throw m848f(str + ": Unexpected integer value:'" + m861a + "'");
        }
    }

    /* renamed from: b */
    public int m855b(String str, int i) {
        double d;
        String m856b = m856b(str);
        if (m856b == null) {
            return i;
        }
        if (m856b.endsWith("ms")) {
            m856b = m856b.substring(0, m856b.length() - 2);
            d = 1.0d;
        } else if (m856b.endsWith("s")) {
            m856b = m856b.substring(0, m856b.length() - 1);
            d = 1000.0d;
        } else {
            d = 1.0d;
        }
        try {
            return (int) (Double.parseDouble(m856b) * d);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw m848f(str + ": Unexpected time:'" + m856b + "'");
        }
    }

    /* renamed from: a */
    public float m865a(String str, float f) {
        String m861a = m861a(str, (String) null);
        if (m861a == null) {
            return f;
        }
        try {
            return Float.parseFloat(m861a);
        } catch (NumberFormatException e) {
            throw m848f(str + ": Unexpected float value:'" + m861a + "'");
        }
    }

    /* renamed from: d */
    public Integer m850d(String str) {
        String m861a = m861a(str, (String) null);
        if (m861a == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(m861a));
        } catch (NumberFormatException e) {
            throw m848f(str + ": Unexpected integer value:'" + m861a + "'");
        }
    }

    /* renamed from: e */
    public Boolean m849e(String str) {
        String m861a = m861a(str, (String) null);
        if (m861a == null) {
            return null;
        }
        if (m861a.equalsIgnoreCase("true")) {
            return true;
        }
        if (m861a.equalsIgnoreCase("false")) {
            return false;
        }
        throw m848f(str + ": Unexpected boolean value:'" + m861a + "'");
    }

    /* renamed from: a */
    public boolean m860a(String str, String str2, boolean z) {
        Boolean m849e = m849e(str);
        if (m849e != null) {
            return m849e.booleanValue();
        }
        Boolean m849e2 = m849e(str2);
        if (m849e2 != null) {
            return m849e2.booleanValue();
        }
        return z;
    }

    /* renamed from: a */
    public boolean m859a(String str, boolean z) {
        String m861a = m861a(str, (String) null);
        if (m861a == null) {
            return z;
        }
        if (m861a.equalsIgnoreCase("true")) {
            return true;
        }
        if (m861a.equalsIgnoreCase("false")) {
            return false;
        }
        throw m848f(str + ": Unexpected boolean value:'" + m861a + "'");
    }

    /* renamed from: c */
    public int m852c(String str, int i) {
        String m856b = m856b(str);
        if (m856b == null) {
            return i;
        }
        if (m856b.equals(VariableScope.nullOrMissingString)) {
            throw m848f(str + ": Unknown color:" + m856b);
        }
        try {
            return Color.m7281a(m856b);
        } catch (IllegalArgumentException e) {
            throw m848f(str + ": Unknown color:" + m856b);
        }
    }

    /* renamed from: a */
    public C0385az m863a(String str, C0385az c0385az) {
        return this.f6602t.m6661a(str, c0385az);
    }

    /* renamed from: a */
    public boolean m868a(Unit unit) {
        return this.f6602t.m6663a(unit);
    }

    /* renamed from: f */
    public C0179f m848f(String str) {
        return m862a(str, (Exception) null);
    }

    /* renamed from: a */
    public C0179f m862a(String str, Exception exc) {
        String str2 = "MapTrigger-Error (" + this.f6591a + " id:" + this.f6592b + "): " + str;
        C0831ad.m1648g(str2);
        if (exc == null) {
            return new C0179f(str2);
        }
        return new C0179f(str2, exc);
    }

    /* renamed from: g */
    public void m847g(String str) {
        C0831ad.m1648g("MapTrigger-Error (" + this.f6591a + " id:" + this.f6592b + " type:" + this.f6594g + "): " + str);
    }

    /* renamed from: h */
    public void m846h(String str) {
        GameEngine.PrintLog("MapTrigger-Debug (" + this.f6592b + " type:" + this.f6594g + "): " + str);
    }

    /* renamed from: a */
    public Team m869a() {
        return this.f6606y;
    }

    /* renamed from: b */
    public int m858b() {
        return (int) this.f6602t.f775j.m7184d();
    }

    /* renamed from: c */
    public int m854c() {
        return (int) this.f6602t.f775j.m7183e();
    }

    /* renamed from: b */
    public boolean m857b(Unit unit) {
        Team m869a = m869a();
        if (m869a != null && unit.team != m869a) {
            return false;
        }
        if (m853c("onlyIfEmpty") && unit.m5803cq() && (unit instanceof InterfaceC0242ak) && ((InterfaceC0242ak) unit).mo5935bB() > 0) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public boolean m851d() {
        boolean z;
        int i = GameEngine.getInstance().f6096by;
        boolean z2 = true;
        boolean z3 = false;
        if (!this.f6600m && this.f6617r != -1) {
            if (this.f6617r <= i) {
                z3 = true;
                this.f6600m = true;
            } else {
                z2 = false;
            }
        }
        if (this.f6611d.m838a()) {
            if (this.f6611d.m836b()) {
                z3 = true;
            } else {
                z2 = false;
            }
        }
        if (this.f6613f.f6888a > 0) {
            Iterator it = this.f6613f.iterator();
            while (it.hasNext()) {
                AbstractC1031a abstractC1031a = (AbstractC1031a) it.next();
                if (abstractC1031a.m845a(this)) {
                    if (abstractC1031a.mo843b(this)) {
                        z3 = true;
                    } else {
                        z2 = false;
                    }
                }
            }
        }
        if (this.f6595h) {
            z = z3 && z2;
        } else {
            z = z3;
            if (z2) {
                z = true;
            }
        }
        if (z) {
            if (this.f6614n == -1) {
                this.f6614n = i;
            }
            if (this.f6618s <= 0 || i >= this.f6614n + this.f6618s) {
                return true;
            }
            return false;
        }
        this.f6614n = -1;
        return false;
    }
}
