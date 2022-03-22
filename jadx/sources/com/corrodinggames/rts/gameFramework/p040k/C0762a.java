package com.corrodinggames.rts.gameFramework.p040k;

import android.graphics.Color;
import android.graphics.Paint;
import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.p012b.C0147a;
import com.corrodinggames.rts.game.p012b.C0154f;
import com.corrodinggames.rts.game.units.AbstractC0208ad;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0311ag;
import com.corrodinggames.rts.game.units.custom.C0325au;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p036g.Hcat_Multiplaye;
import com.corrodinggames.rts.gameFramework.p040k.p041a.AbstractC0763a;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.k.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/a.class */
public class C0762a {

    /* renamed from: a */
    public String f5312a;

    /* renamed from: b */
    public String f5313b;

    /* renamed from: c */
    public String f5314c;

    /* renamed from: g */
    public EnumC0769e f5315g;

    /* renamed from: h */
    public boolean f5316h;

    /* renamed from: i */
    public boolean f5317i;

    /* renamed from: j */
    public boolean f5318j;

    /* renamed from: k */
    public int f5319k;

    /* renamed from: l */
    public int f5320l;

    /* renamed from: m */
    public boolean f5321m;

    /* renamed from: p */
    public int f5322p;

    /* renamed from: t */
    public C0147a f5323t;

    /* renamed from: v */
    public C0325au f5324v;

    /* renamed from: w */
    public float f5325w;

    /* renamed from: x */
    public float f5326x;

    /* renamed from: y */
    public AbstractC0171m f5327y;

    /* renamed from: z */
    public C0311ag f5328z;

    /* renamed from: A */
    public Paint f5329A;

    /* renamed from: B */
    public boolean f5330B;

    /* renamed from: d */
    public C0766b f5331d = new C0766b();

    /* renamed from: e */
    public C0766b f5332e = new C0766b();

    /* renamed from: f */
    public C0835m f5333f = new C0835m();

    /* renamed from: n */
    public int f5334n = -1;

    /* renamed from: o */
    public int f5335o = Integer.MAX_VALUE;

    /* renamed from: q */
    public int f5336q = -1;

    /* renamed from: r */
    public int f5337r = -1;

    /* renamed from: s */
    public int f5338s = -1;

    /* renamed from: u */
    public boolean f5339u = false;

    /* renamed from: a */
    public void m844a(AbstractC0763a aVar) {
        this.f5333f.add(aVar);
    }

    /* renamed from: a */
    public void m843a(String str) {
        this.f5323t.m4034b(str);
    }

    /* renamed from: b */
    public String m833b(String str) {
        return this.f5323t.m4034b(str);
    }

    /* renamed from: a */
    public String m838a(String str, String str2) {
        return this.f5323t.m4036a(str, str2);
    }

    /* renamed from: c */
    public boolean m830c(String str) {
        return this.f5323t.m4034b(str) != null;
    }

    /* renamed from: a */
    public int m841a(String str, int i) {
        String a = m838a(str, (String) null);
        if (a == null) {
            return i;
        }
        try {
            return Integer.parseInt(a);
        } catch (NumberFormatException e) {
            throw m825f(str + ": Unexpected integer value:'" + a + "'");
        }
    }

    /* renamed from: b */
    public int m832b(String str, int i) {
        char c;
        String b = m833b(str);
        if (b == null) {
            return i;
        }
        if (b.endsWith("ms")) {
            b = b.substring(0, b.length() - 2);
            c = 0;
        } else if (b.endsWith("s")) {
            b = b.substring(0, b.length() - 1);
            c = 0;
        } else {
            c = 0;
        }
        try {
            return (int) (Double.parseDouble(b) * c);
        } catch (NumberFormatException e) {
            e.printStackTrace();
            throw m825f(str + ": Unexpected time:'" + b + "'");
        }
    }

    /* renamed from: a */
    public float m842a(String str, float f) {
        String a = m838a(str, (String) null);
        if (a == null) {
            return f;
        }
        try {
            return Float.parseFloat(a);
        } catch (NumberFormatException e) {
            throw m825f(str + ": Unexpected float value:'" + a + "'");
        }
    }

    /* renamed from: d */
    public Integer m827d(String str) {
        String a = m838a(str, (String) null);
        if (a == null) {
            return null;
        }
        try {
            return Integer.valueOf(Integer.parseInt(a));
        } catch (NumberFormatException e) {
            throw m825f(str + ": Unexpected integer value:'" + a + "'");
        }
    }

    /* renamed from: e */
    public Boolean m826e(String str) {
        String a = m838a(str, (String) null);
        if (a == null) {
            return null;
        }
        if (a.equalsIgnoreCase("true")) {
            return true;
        }
        if (a.equalsIgnoreCase("false")) {
            return false;
        }
        throw m825f(str + ": Unexpected boolean value:'" + a + "'");
    }

    /* renamed from: a */
    public boolean m837a(String str, String str2, boolean z) {
        Boolean e = m826e(str);
        if (e != null) {
            return e.booleanValue();
        }
        Boolean e2 = m826e(str2);
        if (e2 != null) {
            return e2.booleanValue();
        }
        return z;
    }

    /* renamed from: a */
    public boolean m836a(String str, boolean z) {
        String a = m838a(str, (String) null);
        if (a == null) {
            return z;
        }
        if (a.equalsIgnoreCase("true")) {
            return true;
        }
        if (a.equalsIgnoreCase("false")) {
            return false;
        }
        throw m825f(str + ": Unexpected boolean value:'" + a + "'");
    }

    /* renamed from: c */
    public int m829c(String str, int i) {
        String b = m833b(str);
        if (b == null) {
            return i;
        }
        try {
            return Color.m4545a(b);
        } catch (IllegalArgumentException e) {
            throw m825f(str + ": Unknown color:" + b);
        }
    }

    /* renamed from: a */
    public C0311ag m840a(String str, C0311ag agVar) {
        return this.f5323t.m4037a(str, agVar);
    }

    /* renamed from: a */
    public boolean m845a(AbstractC0210af afVar) {
        return this.f5323t.m4039a(afVar);
    }

    /* renamed from: f */
    public C0154f m825f(String str) {
        return m839a(str, (Exception) null);
    }

    /* renamed from: a */
    public C0154f m839a(String str, Exception exc) {
        String str2 = "MapTrigger-Error (" + this.f5312a + " id:" + this.f5313b + "): " + str;
        Hcat_Multiplaye.m1261f(str2);
        if (exc == null) {
            return new C0154f(str2);
        }
        return new C0154f(str2, exc);
    }

    /* renamed from: g */
    public void m824g(String str) {
        Hcat_Multiplaye.m1261f("MapTrigger-Error (" + this.f5312a + " id:" + this.f5313b + "): " + str);
    }

    /* renamed from: h */
    public void m823h(String str) {
        AbstractC0789l.m683d("MapTrigger-Debug (" + this.f5313b + "): " + str);
    }

    /* renamed from: a */
    public AbstractC0171m m846a() {
        return this.f5327y;
    }

    /* renamed from: b */
    public int m835b() {
        return (int) this.f5323t.f719j.m4444d();
    }

    /* renamed from: c */
    public int m831c() {
        return (int) this.f5323t.f719j.m4443e();
    }

    /* renamed from: b */
    public boolean m834b(AbstractC0210af afVar) {
        AbstractC0171m a = m846a();
        if (a != null && afVar.f1441bB != a) {
            return false;
        }
        if (!m830c("onlyIfEmpty") || !afVar.mo2631cc() || !(afVar instanceof AbstractC0208ad) || ((AbstractC0208ad) afVar).mo2627f() <= 0) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public boolean m828d() {
        boolean z;
        int i = AbstractC0789l.m651u().f5467bh;
        boolean z2 = true;
        boolean z3 = false;
        if (!this.f5321m && this.f5337r != -1) {
            if (this.f5337r <= i) {
                z3 = true;
                this.f5321m = true;
            } else {
                z2 = false;
            }
        }
        if (this.f5331d.m818a()) {
            if (this.f5331d.m816b()) {
                z3 = true;
            } else {
                z2 = false;
            }
        }
        if (this.f5333f.f5778a > 0) {
            Iterator it = this.f5333f.iterator();
            while (it.hasNext()) {
                if (((AbstractC0763a) it.next()).mo821a(this)) {
                    z3 = true;
                } else {
                    z2 = false;
                }
            }
        }
        if (this.f5316h) {
            z = z3 && z2;
        } else {
            z = z3;
            if (z2) {
                z = true;
            }
        }
        if (z) {
            if (this.f5334n == -1) {
                this.f5334n = i;
            }
            if (this.f5338s > 0 && i < this.f5334n + this.f5338s) {
                return false;
            }
            return true;
        }
        this.f5334n = -1;
        return false;
    }
}
