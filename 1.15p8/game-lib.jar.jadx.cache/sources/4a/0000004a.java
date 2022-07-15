package com.corrodinggames.rts.gameFramework.network;

import com.corrodinggames.rts.appFramework.ActivityC0112i;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.gameFramework.h.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/h/g.class */
public class C0790g {

    /* renamed from: a */
    public boolean f5370a;

    /* renamed from: b */
    public String f5371b;

    /* renamed from: c */
    public String f5372c;

    /* renamed from: d */
    public String f5373d;

    /* renamed from: e */
    public String f5374e;

    /* renamed from: f */
    public String f5375f;

    /* renamed from: g */
    public int f5376g;

    /* renamed from: h */
    public boolean f5377h;

    /* renamed from: j */
    public String f5378j;

    /* renamed from: k */
    public String f5379k;

    /* renamed from: l */
    public int f5380l;

    /* renamed from: m */
    public boolean f5381m;

    /* renamed from: n */
    public String serverUser;

    /* renamed from: o */
    public long f5383o;

    /* renamed from: p */
    public int f5384p;

    /* renamed from: q */
    public String f5385q;

    /* renamed from: r */
    public String f5386r;

    /* renamed from: s */
    public String f5387s;

    /* renamed from: t */
    public String f5388t;

    /* renamed from: u */
    public String f5389u;

    /* renamed from: x */
    public boolean f5390x;

    /* renamed from: y */
    public boolean f5391y;

    /* renamed from: z */
    public String f5392z;

    /* renamed from: A */
    public int f5369A;

    /* renamed from: i */
    public long f5393i = -1;

    /* renamed from: v */
    public int f5394v = -1;

    /* renamed from: w */
    public int f5395w = 8;

    /* renamed from: a */
    public boolean m1255a() {
        String str = GameEngine.getInstance().networkEngine.f5172bE;
        if (str != null && str.equals(this.f5371b)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public String m1254b() {
        String str;
        String m1253c = m1253c();
        if (m1253c != null) {
            String str2 = this.f5375f;
            if (str2 != null) {
                str2 = str2.replace("\\n", "\n");
            }
            return (VariableScope.nullOrMissingString + str2 + "\n") + "Url: " + m1253c + "\n";
        }
        String str3 = VariableScope.nullOrMissingString;
        if (this.f5370a) {
            str3 = str3 + "Lan: " + this.f5373d + ":" + this.f5376g + "\n";
        }
        String str4 = (str3 + "User: " + this.serverUser + "\n") + "Map: " + ActivityC0112i.m4415e(this.f5385q) + "\n";
        if (this.f5381m) {
            str4 = str4 + "Password Required\n";
        }
        if (!this.f5377h && !this.f5370a) {
            str4 = str4 + "Port: not open (Connecting over the internet may fail)\n";
        }
        if ("ANY".equalsIgnoreCase(this.f5379k)) {
            str = str4 + "Version: " + this.f5379k + "\n";
        } else {
            str = str4 + "Version: v" + this.f5379k + (m1249g() ? VariableScope.nullOrMissingString : " (different game version!)") + "\n";
        }
        if (this.f5392z != null && !this.f5392z.equals(VariableScope.nullOrMissingString)) {
            str = str + "Mods Needed: " + this.f5392z + "\n";
        }
        return str;
    }

    /* renamed from: c */
    public String m1253c() {
        return this.f5374e;
    }

    /* renamed from: d */
    public boolean m1252d() {
        return this.f5374e != null;
    }

    /* renamed from: e */
    public String m1251e() {
        if (this.f5369A == 0) {
            return this.f5372c + ":" + this.f5376g;
        }
        return "get|" + this.f5371b.replace("|", ".") + "|" + this.f5369A + "|" + this.f5381m + "|" + this.f5376g;
    }

    /* renamed from: f */
    public String m1250f() {
        return this.f5373d + ":" + this.f5376g;
    }

    /* renamed from: g */
    public boolean m1249g() {
        GameEngine gameEngine = GameEngine.getInstance();
        if (!this.f5390x || !"ANY".equals(this.f5379k)) {
            return (this.f5390x && this.f5379k != null && this.f5379k.contains("+") && gameEngine.gameVersionInternal(true) >= this.f5380l) || gameEngine.gameVersionInternal(true) == this.f5380l;
        }
        return true;
    }
}