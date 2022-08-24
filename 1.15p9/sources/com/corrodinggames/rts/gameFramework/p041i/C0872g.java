package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.appFramework.ActivityC0117i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.i.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/g.class */
public class C0872g {

    /* renamed from: a */
    public boolean f5817a;

    /* renamed from: b */
    public String f5818b;

    /* renamed from: c */
    public String f5819c;

    /* renamed from: d */
    public String f5820d;

    /* renamed from: e */
    public String f5821e;

    /* renamed from: f */
    public String f5822f;

    /* renamed from: g */
    public int f5823g;

    /* renamed from: h */
    public boolean f5824h;

    /* renamed from: j */
    public String f5825j;

    /* renamed from: k */
    public String f5826k;

    /* renamed from: l */
    public int f5827l;

    /* renamed from: m */
    public boolean f5828m;

    /* renamed from: n */
    public String f5829n;

    /* renamed from: o */
    public long f5830o;

    /* renamed from: p */
    public int f5831p;

    /* renamed from: q */
    public String f5832q;

    /* renamed from: r */
    public String f5833r;

    /* renamed from: s */
    public String f5834s;

    /* renamed from: t */
    public String f5835t;

    /* renamed from: u */
    public String f5836u;

    /* renamed from: x */
    public boolean f5837x;

    /* renamed from: y */
    public boolean f5838y;

    /* renamed from: z */
    public String f5839z;

    /* renamed from: A */
    public int f5840A;

    /* renamed from: i */
    public long f5841i = -1;

    /* renamed from: v */
    public int f5842v = -1;

    /* renamed from: w */
    public int f5843w = 8;

    /* renamed from: a */
    public boolean m1475a() {
        String str = GameEngine.m1228A().networkEngine.f5614bK;
        if (str != null && str.equals(this.f5818b)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public String m1474b() {
        String str;
        String m1473c = m1473c();
        if (m1473c != null) {
            String str2 = this.f5822f;
            if (str2 != null) {
                str2 = str2.replace("\\n", "\n");
            }
            return (VariableScope.nullOrMissingString + str2 + "\n") + "Url: " + m1473c + "\n";
        }
        String str3 = VariableScope.nullOrMissingString;
        if (this.f5817a) {
            str3 = str3 + "Lan: " + this.f5820d + ":" + this.f5823g + "\n";
        }
        String str4 = (str3 + "User: " + this.f5829n + "\n") + "Map: " + ActivityC0117i.m6171e(this.f5832q) + "\n";
        if (this.f5828m) {
            str4 = str4 + "Password Required\n";
        }
        if (!this.f5824h && !this.f5817a) {
            str4 = str4 + "Port: not open (Connecting over the internet may fail)\n";
        }
        if ("ANY".equalsIgnoreCase(this.f5826k)) {
            str = str4 + "Version: " + this.f5826k + "\n";
        } else {
            str = str4 + "Version: v" + this.f5826k + (m1469g() ? VariableScope.nullOrMissingString : " (different game version!)") + "\n";
        }
        if (this.f5839z != null && !this.f5839z.equals(VariableScope.nullOrMissingString)) {
            str = str + "Mods Needed: " + this.f5839z + "\n";
        }
        return str;
    }

    /* renamed from: c */
    public String m1473c() {
        return this.f5821e;
    }

    /* renamed from: d */
    public boolean m1472d() {
        return this.f5821e != null;
    }

    /* renamed from: e */
    public String m1471e() {
        if (this.f5840A == 0) {
            return this.f5819c + ":" + this.f5823g;
        }
        return "get|" + this.f5818b.replace("|", ".") + "|" + this.f5840A + "|" + this.f5828m + "|" + this.f5823g;
    }

    /* renamed from: f */
    public String m1470f() {
        return this.f5820d + ":" + this.f5823g;
    }

    /* renamed from: g */
    public boolean m1469g() {
        GameEngine m1228A = GameEngine.m1228A();
        if (!this.f5837x || !"ANY".equals(this.f5826k)) {
            return (this.f5837x && this.f5826k != null && this.f5826k.contains("+") && m1228A.mo5712c(true) >= this.f5827l) || m1228A.mo5712c(true) == this.f5827l;
        }
        return true;
    }
}
