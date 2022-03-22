package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.p008a.ActivityC0087g;

/* renamed from: com.corrodinggames.rts.gameFramework.g.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/g.class */
public class C0703g {

    /* renamed from: a */
    public boolean f4968a;

    /* renamed from: b */
    public String f4969b;

    /* renamed from: c */
    public String f4970c;

    /* renamed from: d */
    public String f4971d;

    /* renamed from: e */
    public String f4972e;

    /* renamed from: f */
    public String f4973f;

    /* renamed from: g */
    public int f4974g;

    /* renamed from: h */
    public boolean f4975h;

    /* renamed from: j */
    public String f4976j;

    /* renamed from: k */
    public String f4977k;

    /* renamed from: l */
    public boolean f4978l;

    /* renamed from: m */
    public String f4979m;

    /* renamed from: n */
    public long f4980n;

    /* renamed from: o */
    public int f4981o;

    /* renamed from: p */
    public String f4982p;

    /* renamed from: q */
    public String f4983q;

    /* renamed from: r */
    public String f4984r;

    /* renamed from: s */
    public String f4985s;

    /* renamed from: t */
    public String f4986t;

    /* renamed from: w */
    public boolean f4987w;

    /* renamed from: x */
    public boolean f4988x;

    /* renamed from: y */
    public String f4989y;

    /* renamed from: z */
    public int f4990z;

    /* renamed from: i */
    public long f4991i = -1;

    /* renamed from: u */
    public int f4992u = -1;

    /* renamed from: v */
    public int f4993v = 8;

    /* renamed from: a */
    public boolean m1103a() {
        String str = AbstractC0789l.m651u().f5486bF.f4778by;
        if (str == null || !str.equals(this.f4969b)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public String m1102b() {
        String str;
        String c = m1101c();
        if (c != null) {
            String str2 = this.f4973f;
            if (str2 != null) {
                str2 = str2.replace("\\n", "\n");
            }
            return ("" + str2 + "\n") + "Url: " + c + "\n";
        }
        String str3 = "";
        if (this.f4968a) {
            str3 = str3 + "Lan: " + this.f4971d + ":" + this.f4974g + "\n";
        }
        String str4 = (str3 + "User: " + this.f4979m + "\n") + "Map: " + ActivityC0087g.m4268d(this.f4982p) + "\n";
        if (this.f4978l) {
            str4 = str4 + "Password Required\n";
        }
        if (!this.f4975h && !this.f4968a) {
            str4 = str4 + "Port: not open (Connecting over the internet may fail)\n";
        }
        if ("ANY".equalsIgnoreCase(this.f4977k)) {
            str = str4 + "Version: " + this.f4977k + "\n";
        } else {
            str = str4 + "Version: v" + this.f4977k + (m1097g() ? "" : " (different game version!)") + "\n";
        }
        if (this.f4989y != null && !this.f4989y.equals("")) {
            str = str + "Mods Needed: " + this.f4989y + "\n";
        }
        return str;
    }

    /* renamed from: c */
    public String m1101c() {
        return this.f4972e;
    }

    /* renamed from: d */
    public boolean m1100d() {
        return this.f4972e != null;
    }

    /* renamed from: e */
    public String m1099e() {
        if (this.f4990z == 0) {
            return this.f4970c + ":" + this.f4974g;
        }
        return "get|" + this.f4969b.replace("|", ".") + "|" + this.f4990z + "|" + this.f4978l + "|" + this.f4974g;
    }

    /* renamed from: f */
    public String m1098f() {
        return this.f4971d + ":" + this.f4974g;
    }

    /* renamed from: g */
    public boolean m1097g() {
        AbstractC0789l u = AbstractC0789l.m651u();
        if (!this.f4987w || !"ANY".equals(this.f4977k)) {
            return ("" + u.m686c(true)).equals(this.f4976j);
        }
        return true;
    }
}
