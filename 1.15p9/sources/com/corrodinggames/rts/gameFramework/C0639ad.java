package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.gameFramework.ad */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/ad.class */
public class C0639ad {

    /* renamed from: a */
    public String f4144a;

    /* renamed from: b */
    public boolean f4145b = false;

    /* renamed from: c */
    public ArrayList f4146c = new ArrayList();

    /* renamed from: d */
    public ArrayList f4147d = new ArrayList();

    /* renamed from: a */
    public boolean m2958a() {
        Iterator it = this.f4146c.iterator();
        while (it.hasNext()) {
            AbstractC0641af abstractC0641af = (AbstractC0641af) it.next();
            if (abstractC0641af.f4148a == -1 && abstractC0641af.mo2938a()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public boolean m2952b() {
        Iterator it = this.f4146c.iterator();
        while (it.hasNext()) {
            AbstractC0641af abstractC0641af = (AbstractC0641af) it.next();
            if (abstractC0641af != null && abstractC0641af.f4148a == -1 && abstractC0641af.mo2936b()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public String m2949c() {
        Iterator it = this.f4146c.iterator();
        while (it.hasNext()) {
            AbstractC0641af abstractC0641af = (AbstractC0641af) it.next();
            if (abstractC0641af != null) {
                return abstractC0641af.mo2935c().toUpperCase();
            }
        }
        return VariableScope.nullOrMissingString;
    }

    /* renamed from: a */
    public AbstractC0641af m2957a(int i) {
        if (this.f4146c.size() > i) {
            return (AbstractC0641af) this.f4146c.get(i);
        }
        return null;
    }

    /* renamed from: b */
    public String m2951b(int i) {
        if (this.f4146c.size() > i) {
            AbstractC0641af abstractC0641af = (AbstractC0641af) this.f4146c.get(i);
            if (abstractC0641af == null) {
                return "<null>";
            }
            return abstractC0641af.mo2935c().toUpperCase();
        }
        return VariableScope.nullOrMissingString;
    }

    /* renamed from: c */
    public C0639ad m2948c(int i) {
        return m2956a(i, 0, 0, false);
    }

    /* renamed from: a */
    public C0639ad m2956a(int i, int i2, int i3, boolean z) {
        C0642ag c0642ag = new C0642ag();
        c0642ag.f4152e = i;
        c0642ag.f4148a = -1;
        c0642ag.f4149b = i3;
        if (z) {
            c0642ag.f4151d = true;
        }
        if (this.f4146c.size() <= i2) {
            this.f4146c.add(new C0646ak());
        }
        if (this.f4146c.size() <= i2) {
            this.f4146c.add(new C0646ak());
        }
        this.f4146c.set(i2, c0642ag);
        return this;
    }

    /* renamed from: a */
    public C0639ad m2954a(String str) {
        return m2953a(str, -1);
    }

    /* renamed from: a */
    public C0639ad m2953a(String str, int i) {
        if (str == null) {
            throw new RuntimeException("key==null");
        }
        return m2955a(-1, str, i);
    }

    /* renamed from: a */
    public C0639ad m2955a(int i, String str, int i2) {
        if (str == null) {
            throw new RuntimeException("key==null");
        }
        C0642ag c0642ag = new C0642ag();
        c0642ag.f4148a = i;
        c0642ag.f4149b = 0;
        String lowerCase = str.toLowerCase(Locale.ENGLISH);
        if (lowerCase.contains("alt+")) {
            lowerCase = lowerCase.replace("alt+", VariableScope.nullOrMissingString);
            c0642ag.f4149b += 4;
        }
        if (lowerCase.contains("ctrl+")) {
            lowerCase = lowerCase.replace("ctrl+", VariableScope.nullOrMissingString);
            c0642ag.f4149b++;
        }
        if (lowerCase.contains("shift+")) {
            lowerCase = lowerCase.replace("shift+", VariableScope.nullOrMissingString);
            c0642ag.f4149b += 2;
        }
        try {
            c0642ag.f4152e = C0638ac.m2959d(lowerCase);
            if (i2 == -1) {
                this.f4146c.add(c0642ag);
            } else {
                if (this.f4146c.size() <= i2) {
                    this.f4146c.add(new C0646ak());
                }
                if (this.f4146c.size() <= i2) {
                    this.f4146c.add(new C0646ak());
                }
                this.f4146c.set(i2, c0642ag);
            }
        } catch (SlickToAndroidKeycodes.MissingKey e) {
            e.printStackTrace();
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine != null) {
                gameEngine.m1192a(e.getMessage(), 1);
            }
        }
        return this;
    }

    /* renamed from: b */
    public C0639ad m2950b(int i, int i2, int i3, boolean z) {
        C0643ah c0643ah = new C0643ah();
        c0643ah.f4148a = i;
        c0643ah.f4155e = i2;
        c0643ah.f4156f = i3;
        c0643ah.f4153g = z;
        try {
            c0643ah.f4154i = c0643ah.m2945a(true);
            this.f4146c.add(c0643ah);
            return this;
        } catch (IndexOutOfBoundsException e) {
            GameEngine.m1145b("Failed to bind Axis:" + i3 + " on joystick:" + i2);
            return this;
        }
    }

    /* renamed from: d */
    public boolean mo2946d() {
        return false;
    }

    /* renamed from: e */
    public String m2947e() {
        return this.f4144a.replace("-", VariableScope.nullOrMissingString).replace("  ", " ").replace("  ", " ").replace(" ", "_").toLowerCase(Locale.ENGLISH);
    }
}
