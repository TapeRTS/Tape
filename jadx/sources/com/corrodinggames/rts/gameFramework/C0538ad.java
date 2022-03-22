package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ad.class */
public class C0538ad {

    /* renamed from: a */
    public String f3674a;

    /* renamed from: b */
    public boolean f3675b = false;

    /* renamed from: c */
    public ArrayList f3676c = new ArrayList();

    /* renamed from: d */
    public ArrayList f3677d = new ArrayList();

    /* renamed from: a */
    public boolean m2080a() {
        Iterator it = this.f3676c.iterator();
        while (it.hasNext()) {
            AbstractC0540af afVar = (AbstractC0540af) it.next();
            if (afVar.f3678a == -1 && afVar.mo2066a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m2074b() {
        Iterator it = this.f3676c.iterator();
        while (it.hasNext()) {
            AbstractC0540af afVar = (AbstractC0540af) it.next();
            if (afVar != null && afVar.f3678a == -1 && afVar.mo2065b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public String m2071c() {
        Iterator it = this.f3676c.iterator();
        while (it.hasNext()) {
            AbstractC0540af afVar = (AbstractC0540af) it.next();
            if (afVar != null) {
                return afVar.mo2064c().toUpperCase();
            }
        }
        return "";
    }

    /* renamed from: a */
    public String m2079a(int i) {
        if (this.f3676c.size() <= i) {
            return "";
        }
        AbstractC0540af afVar = (AbstractC0540af) this.f3676c.get(i);
        if (afVar == null) {
            return "<null>";
        }
        return afVar.mo2064c().toUpperCase();
    }

    /* renamed from: b */
    public C0538ad m2073b(int i) {
        return m2078a(i, 0, 0, false);
    }

    /* renamed from: a */
    public C0538ad m2078a(int i, int i2, int i3, boolean z) {
        C0541ag agVar = new C0541ag();
        agVar.f3682e = i;
        agVar.f3678a = -1;
        agVar.f3679b = i3;
        if (z) {
            agVar.f3681d = true;
        }
        if (this.f3676c.size() <= i2) {
            this.f3676c.add(new C0545ak());
        }
        if (this.f3676c.size() <= i2) {
            this.f3676c.add(new C0545ak());
        }
        this.f3676c.set(i2, agVar);
        return this;
    }

    /* renamed from: a */
    public C0538ad m2076a(String str) {
        return m2075a(str, -1);
    }

    /* renamed from: a */
    public C0538ad m2075a(String str, int i) {
        if (str != null) {
            return m2077a(-1, str, i);
        }
        throw new RuntimeException("key==null");
    }

    /* renamed from: a */
    public C0538ad m2077a(int i, String str, int i2) {
        if (str == null) {
            throw new RuntimeException("key==null");
        }
        C0541ag agVar = new C0541ag();
        agVar.f3678a = i;
        agVar.f3679b = 0;
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.contains("alt+")) {
            lowerCase = lowerCase.replace("alt+", "");
            agVar.f3679b += 4;
        }
        if (lowerCase.contains("ctrl+")) {
            lowerCase = lowerCase.replace("ctrl+", "");
            agVar.f3679b++;
        }
        if (lowerCase.contains("shift+")) {
            lowerCase = lowerCase.replace("shift+", "");
            agVar.f3679b += 2;
        }
        try {
            agVar.f3682e = C0537ac.m2081d(lowerCase);
            if (i2 == -1) {
                this.f3676c.add(agVar);
            } else {
                if (this.f3676c.size() <= i2) {
                    this.f3676c.add(new C0545ak());
                }
                if (this.f3676c.size() <= i2) {
                    this.f3676c.add(new C0545ak());
                }
                this.f3676c.set(i2, agVar);
            }
        } catch (SlickToAndroidKeycodes.MissingKey e) {
            e.printStackTrace();
            AbstractC0789l u = AbstractC0789l.m638u();
            if (u != null) {
                u.m718a(e.getMessage(), 1);
            }
        }
        return this;
    }

    /* renamed from: b */
    public C0538ad m2072b(int i, int i2, int i3, boolean z) {
        C0542ah ahVar = new C0542ah();
        ahVar.f3678a = i;
        ahVar.f3683e = i2;
        ahVar.f3684f = i3;
        ahVar.f3685g = z;
        try {
            ahVar.f3687i = ahVar.m2068a(true);
            this.f3676c.add(ahVar);
            return this;
        } catch (IndexOutOfBoundsException e) {
            AbstractC0789l.m682b("Failed to bind Axis:" + i3 + " on joystick:" + i2);
            return this;
        }
    }

    /* renamed from: d */
    public boolean mo2069d() {
        return false;
    }

    /* renamed from: e */
    public String m2070e() {
        return this.f3674a.replace("-", "").replace("  ", " ").replace("  ", " ").replace(" ", "_").toLowerCase(Locale.ENGLISH);
    }
}
