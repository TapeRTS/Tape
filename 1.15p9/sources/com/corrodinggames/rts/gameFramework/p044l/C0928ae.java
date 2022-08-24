package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Paint;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0894j;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.IOException;
import java.util.Arrays;

/* renamed from: com.corrodinggames.rts.gameFramework.l.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/ae.class */
public class C0928ae {

    /* renamed from: c */
    public String f6342c;

    /* renamed from: d */
    public String f6343d;

    /* renamed from: e */
    public String f6344e;

    /* renamed from: f */
    public String f6345f;

    /* renamed from: g */
    public int f6346g;

    /* renamed from: h */
    public int f6347h;

    /* renamed from: i */
    String f6348i;

    /* renamed from: j */
    String f6349j;

    /* renamed from: k */
    long f6350k;

    /* renamed from: l */
    long f6351l;

    /* renamed from: m */
    public boolean f6352m;

    /* renamed from: n */
    public int f6353n;

    /* renamed from: o */
    public int f6354o;

    /* renamed from: p */
    public C0929af[] f6355p;

    /* renamed from: q */
    public Object f6356q;

    /* renamed from: r */
    public int f6357r;

    /* renamed from: s */
    int f6358s;

    /* renamed from: a */
    public void m1071a(String str, float f) {
        m1072a(str).m1060a(f);
    }

    /* renamed from: a */
    public void m1070a(String str, float f, float f2) {
        m1072a(str).m1059a(f, f2);
    }

    /* renamed from: a */
    public void m1069a(String str, int i) {
        m1072a(str).m1058a(((i >> 16) & 255) * 0.003921569f, ((i >> 8) & 255) * 0.003921569f, (i & 255) * 0.003921569f, (i >>> 24) * 0.003921569f);
    }

    /* renamed from: a */
    public void m1068a(String str, BitmapOrTexture bitmapOrTexture) {
        m1072a(str).m1057a(bitmapOrTexture);
    }

    /* renamed from: b */
    public void m1065b(String str, BitmapOrTexture bitmapOrTexture) {
        m1072a(str).m1056b(bitmapOrTexture);
    }

    /* renamed from: a */
    public C0929af m1072a(String str) {
        C0929af[] c0929afArr;
        for (C0929af c0929af : this.f6355p) {
            if (c0929af.f6359a.equals(str)) {
                return c0929af;
            }
        }
        C0929af c0929af2 = new C0929af();
        c0929af2.f6359a = str;
        C0929af[] c0929afArr2 = (C0929af[]) Arrays.copyOf(this.f6355p, this.f6355p.length + 1);
        c0929afArr2[c0929afArr2.length - 1] = c0929af2;
        this.f6355p = c0929afArr2;
        return c0929af2;
    }

    public C0928ae(String str) {
        this.f6343d = VariableScope.nullOrMissingString;
        this.f6355p = new C0929af[0];
        m1067a(GameEngine.f6203aY ? "assets/shaders/plainGDX.vert" : "assets/shaders/plain.vert", str);
    }

    /* renamed from: a */
    public void m1067a(String str, String str2) {
        this.f6342c = CommonUtils.m2256g(str2);
        this.f6348i = str;
        this.f6349j = str2;
        m1063d();
        m1062e();
    }

    public C0928ae() {
        this.f6343d = VariableScope.nullOrMissingString;
        this.f6355p = new C0929af[0];
        this.f6342c = "Invalid";
        this.f6354o = 1;
    }

    /* renamed from: d */
    public void m1063d() {
        C1098j m2441j = C0750a.m2441j(this.f6348i);
        if (m2441j == null) {
            throw new IOException("Cannot find: " + this.f6348i);
        }
        this.f6344e = CommonUtils.m2343a(m2441j);
        C1098j m2441j2 = C0750a.m2441j(this.f6349j);
        if (m2441j2 == null) {
            throw new IOException("Cannot find: " + this.f6349j);
        }
        this.f6345f = CommonUtils.m2343a(m2441j2);
    }

    /* renamed from: b */
    public void m1066b(String str) {
        GameEngine.PrintLog("shader(" + this.f6342c + "): " + str);
    }

    /* renamed from: c */
    public void m1064c(String str) {
        if (this.f6357r < 3) {
            this.f6357r++;
            GameEngine.m1103p("shader(" + this.f6342c + "): " + str);
        }
        GameEngine.m1193a("shader(" + this.f6342c + "): " + str);
        this.f6354o = 1;
    }

    /* renamed from: a */
    public boolean mo1018a() {
        return false;
    }

    /* renamed from: b */
    public boolean mo1016b() {
        return false;
    }

    /* renamed from: a */
    public boolean mo1017a(Paint paint, BitmapOrTexture bitmapOrTexture) {
        return false;
    }

    /* renamed from: e */
    public boolean m1062e() {
        long m1401a = C0894j.m1401a(this.f6348i, false);
        long m1401a2 = C0894j.m1401a(this.f6349j, false);
        boolean z = (m1401a == this.f6350k && m1401a2 == this.f6351l) ? false : true;
        this.f6350k = m1401a;
        this.f6351l = m1401a2;
        return z;
    }

    /* renamed from: f */
    public void m1061f() {
        C0929af[] c0929afArr;
        this.f6358s++;
        if (this.f6358s < 100) {
            return;
        }
        this.f6358s = 0;
        if (m1062e()) {
            m1066b("Reloading shader");
            try {
                m1063d();
                this.f6352m = true;
                this.f6354o = 0;
                for (C0929af c0929af : this.f6355p) {
                    c0929af.f6360c = true;
                    c0929af.f6364b = -1;
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /* renamed from: c */
    public void mo1015c() {
        GameEngine.getInstance().graphics.mo918a(this);
    }
}
