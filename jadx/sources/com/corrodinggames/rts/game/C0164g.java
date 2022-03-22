package com.corrodinggames.rts.game;

import android.graphics.Color;
import com.corrodinggames.rts.game.units.AbstractC0210af;
import com.corrodinggames.rts.game.units.custom.C0317am;
import com.corrodinggames.rts.game.units.custom.C0318an;
import com.corrodinggames.rts.game.units.custom.C0325au;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0381x;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p036g.C0690ap;
import com.corrodinggames.rts.gameFramework.p036g.C0707k;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import com.corrodinggames.rts.gameFramework.utility.C0835m;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/g.class */
public class C0164g {

    /* renamed from: a */
    public static final C0164g f1033a = new C0164g();

    /* renamed from: b */
    public int f1034b;

    /* renamed from: c */
    public int f1035c;

    /* renamed from: d */
    public boolean f1036d;

    /* renamed from: e */
    public boolean f1037e;

    /* renamed from: f */
    public boolean f1038f;

    /* renamed from: g */
    public boolean f1039g;

    /* renamed from: h */
    public boolean f1040h;

    /* renamed from: u */
    public float f1053u;

    /* renamed from: v */
    public float f1054v;

    /* renamed from: y */
    public short f1057y;

    /* renamed from: A */
    public boolean f1059A;

    /* renamed from: B */
    public C0748e f1060B;

    /* renamed from: C */
    public C0748e f1061C;

    /* renamed from: D */
    public float f1062D;

    /* renamed from: E */
    public float f1063E;

    /* renamed from: F */
    public float f1064F;

    /* renamed from: G */
    public float f1065G;

    /* renamed from: P */
    public float f1074P;

    /* renamed from: Q */
    public float f1075Q;

    /* renamed from: R */
    public float f1076R;

    /* renamed from: S */
    public boolean f1077S;

    /* renamed from: X */
    public C0748e f1082X;

    /* renamed from: Y */
    public C0748e f1083Y;

    /* renamed from: Z */
    public boolean f1084Z;

    /* renamed from: aa */
    public C0748e f1085aa;

    /* renamed from: ab */
    public boolean f1086ab;

    /* renamed from: ac */
    public float f1087ac;

    /* renamed from: ag */
    public C0381x f1091ag;

    /* renamed from: ah */
    public C0381x f1092ah;

    /* renamed from: ai */
    public C0318an f1093ai;

    /* renamed from: aj */
    public C0318an f1094aj;

    /* renamed from: ak */
    public C0318an f1095ak;

    /* renamed from: al */
    public float f1096al;

    /* renamed from: ap */
    public boolean f1100ap;

    /* renamed from: ay */
    public boolean f1109ay;

    /* renamed from: aC */
    public C0365i f1113aC;

    /* renamed from: aH */
    public boolean f1118aH;

    /* renamed from: aJ */
    public float f1120aJ;

    /* renamed from: aK */
    public float f1121aK;

    /* renamed from: aL */
    public float f1122aL;

    /* renamed from: aM */
    public boolean f1123aM;

    /* renamed from: aN */
    public float f1124aN;

    /* renamed from: aO */
    public float f1125aO;

    /* renamed from: aT */
    public float f1130aT;

    /* renamed from: aV */
    public C0381x f1132aV;

    /* renamed from: aW */
    public C0381x f1133aW;

    /* renamed from: aX */
    public C0325au f1134aX;

    /* renamed from: aY */
    public int f1135aY;

    /* renamed from: aZ */
    public boolean f1136aZ;

    /* renamed from: ba */
    public boolean f1137ba;

    /* renamed from: bb */
    public C0365i f1138bb;

    /* renamed from: i */
    public int f1041i = 35;

    /* renamed from: j */
    public float f1042j = -1.0f;

    /* renamed from: k */
    public boolean f1043k = false;

    /* renamed from: l */
    public boolean f1044l = false;

    /* renamed from: m */
    public boolean f1045m = false;

    /* renamed from: n */
    public boolean f1046n = false;

    /* renamed from: o */
    public float f1047o = 1.0f;

    /* renamed from: p */
    public boolean f1048p = false;

    /* renamed from: q */
    public boolean f1049q = false;

    /* renamed from: r */
    public boolean f1050r = false;

    /* renamed from: s */
    public boolean f1051s = false;

    /* renamed from: t */
    public boolean f1052t = false;

    /* renamed from: w */
    public float f1055w = 5.0f;

    /* renamed from: x */
    public short f1056x = -1;

    /* renamed from: z */
    public short f1058z = -1;

    /* renamed from: H */
    public boolean f1066H = false;

    /* renamed from: I */
    public boolean f1067I = false;

    /* renamed from: J */
    public float f1068J = -1.0f;

    /* renamed from: K */
    public boolean f1069K = false;

    /* renamed from: L */
    public boolean f1070L = false;

    /* renamed from: M */
    public boolean f1071M = false;

    /* renamed from: N */
    public float f1072N = -1.0f;

    /* renamed from: O */
    public float f1073O = -1.0f;

    /* renamed from: T */
    public boolean f1078T = false;

    /* renamed from: U */
    public boolean f1079U = false;

    /* renamed from: V */
    public boolean f1080V = false;

    /* renamed from: W */
    public boolean f1081W = false;

    /* renamed from: ad */
    public boolean f1088ad = false;

    /* renamed from: ae */
    public boolean f1089ae = false;

    /* renamed from: af */
    public float f1090af = 3.0f;

    /* renamed from: am */
    public float f1097am = 5.0f;

    /* renamed from: an */
    public int f1098an = -1;

    /* renamed from: ao */
    public float f1099ao = 0.5f;

    /* renamed from: aq */
    public boolean f1101aq = false;

    /* renamed from: ar */
    public float f1102ar = -1.0f;

    /* renamed from: as */
    public float f1103as = -1.0f;

    /* renamed from: at */
    public float f1104at = -1.0f;

    /* renamed from: au */
    public float f1105au = 0.1f;

    /* renamed from: av */
    public boolean f1106av = false;

    /* renamed from: aw */
    public float f1107aw = 120.0f;

    /* renamed from: ax */
    public float f1108ax = 15.0f;

    /* renamed from: az */
    public float f1110az = 5.0f;

    /* renamed from: aA */
    public float f1111aA = 120.0f;

    /* renamed from: aB */
    public float f1112aB = 15.0f;

    /* renamed from: aD */
    public int f1114aD = Color.m4213a(255, 255, 255, 255);

    /* renamed from: aE */
    public float f1115aE = 1.0f;

    /* renamed from: aF */
    public float f1116aF = 0.0f;

    /* renamed from: aG */
    public float f1117aG = 1.0f;

    /* renamed from: aI */
    public boolean f1119aI = true;

    /* renamed from: aP */
    public float f1126aP = 1.0f;

    /* renamed from: aQ */
    public float f1127aQ = 1.0f;

    /* renamed from: aR */
    public float f1128aR = 1.0f;

    /* renamed from: aS */
    public float f1129aS = 1.0f;

    /* renamed from: aU */
    public float f1131aU = -1.0f;

    /* renamed from: bc */
    public C0835m f1139bc = null;

    /* renamed from: bd */
    public C0835m f1140bd = null;

    /* renamed from: be */
    public C0835m f1141be = null;

    /* renamed from: a */
    public C0381x m3563a(AbstractC0210af afVar) {
        C0835m mVar = this.f1141be;
        if (mVar == null || mVar.f5778a <= 0) {
            return null;
        }
        Iterator it = mVar.iterator();
        while (it.hasNext()) {
            C0165h hVar = (C0165h) it.next();
            if (hVar.m3560a(afVar) && hVar.f1148g != null) {
                return hVar.f1148g;
            }
        }
        return null;
    }

    /* renamed from: a */
    public float m3562a(AbstractC0210af afVar, float f, boolean z) {
        C0835m mVar;
        float f2;
        if (!z) {
            mVar = this.f1139bc;
        } else {
            mVar = this.f1140bd;
        }
        if (mVar != null && mVar.f5778a > 0) {
            Iterator it = mVar.iterator();
            while (it.hasNext()) {
                C0165h hVar = (C0165h) it.next();
                if (hVar.m3560a(afVar)) {
                    if (!z) {
                        if (hVar.f1146e != null) {
                            hVar.f1146e.m2909f(afVar);
                        }
                        f2 = hVar.f1144c;
                    } else {
                        if (hVar.f1147f != null) {
                            hVar.f1147f.m2909f(afVar);
                        }
                        f2 = hVar.f1145d;
                    }
                    f *= f2;
                }
            }
        }
        return f;
    }

    /* renamed from: a */
    public static void m3564a(C0164g gVar, C0690ap apVar) {
        if (gVar == f1033a) {
            apVar.mo1130c(0);
        } else if (gVar instanceof C0317am) {
            apVar.mo1130c(1);
            C0317am.m3088a((C0317am) gVar, apVar);
        } else {
            AbstractC0789l.m663f("writeOutLink: Unhandled projectile type");
            apVar.mo1130c(0);
        }
    }

    /* renamed from: a */
    public static C0164g m3561a(C0707k kVar) {
        byte d = kVar.m1065d();
        if (d == 0) {
            return f1033a;
        }
        if (d == 1) {
            C0164g b = C0317am.m3087b(kVar);
            if (b == null) {
                return f1033a;
            }
            return b;
        }
        throw new IOException("Unknown projectile type:" + ((int) d));
    }
}
