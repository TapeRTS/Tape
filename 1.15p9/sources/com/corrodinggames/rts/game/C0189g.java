package com.corrodinggames.rts.game;

import android.graphics.Color;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.custom.C0405bf;
import com.corrodinggames.rts.game.units.custom.C0406bg;
import com.corrodinggames.rts.game.units.custom.C0413bn;
import com.corrodinggames.rts.game.units.custom.C0449h;
import com.corrodinggames.rts.game.units.custom.C0467y;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p041i.C0859ar;
import com.corrodinggames.rts.gameFramework.p041i.C0876k;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.io.IOException;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/g.class */
public class C0189g {

    /* renamed from: a */
    public static final C0189g f1098a = new C0189g();

    /* renamed from: b */
    public int f1099b;

    /* renamed from: c */
    public int f1100c;

    /* renamed from: d */
    public boolean f1101d;

    /* renamed from: e */
    public boolean f1102e;

    /* renamed from: f */
    public boolean f1103f;

    /* renamed from: g */
    public boolean f1104g;

    /* renamed from: h */
    public boolean f1105h;

    /* renamed from: u */
    public float f1106u;

    /* renamed from: v */
    public float f1107v;

    /* renamed from: y */
    public short f1108y;

    /* renamed from: A */
    public boolean f1109A;

    /* renamed from: B */
    public BitmapOrTexture f1110B;

    /* renamed from: C */
    public BitmapOrTexture f1111C;

    /* renamed from: D */
    public float f1112D;

    /* renamed from: E */
    public float f1113E;

    /* renamed from: F */
    public float f1114F;

    /* renamed from: G */
    public float f1115G;

    /* renamed from: H */
    public float f1116H;

    /* renamed from: Q */
    public float f1117Q;

    /* renamed from: R */
    public float f1118R;

    /* renamed from: S */
    public float f1119S;

    /* renamed from: T */
    public boolean f1120T;

    /* renamed from: Y */
    public BitmapOrTexture f1121Y;

    /* renamed from: Z */
    public BitmapOrTexture f1122Z;

    /* renamed from: aa */
    public boolean f1123aa;

    /* renamed from: ab */
    public BitmapOrTexture f1124ab;

    /* renamed from: ac */
    public boolean f1125ac;

    /* renamed from: ad */
    public float f1126ad;

    /* renamed from: ah */
    public C0467y f1127ah;

    /* renamed from: ai */
    public C0467y f1128ai;

    /* renamed from: aj */
    public C0406bg f1129aj;

    /* renamed from: ak */
    public C0406bg f1130ak;

    /* renamed from: al */
    public C0406bg f1131al;

    /* renamed from: am */
    public float f1132am;

    /* renamed from: aq */
    public boolean f1133aq;

    /* renamed from: az */
    public boolean f1134az;

    /* renamed from: aD */
    public C0449h f1135aD;

    /* renamed from: aI */
    public boolean f1136aI;

    /* renamed from: aK */
    public float f1137aK;

    /* renamed from: aL */
    public float f1138aL;

    /* renamed from: aM */
    public float f1139aM;

    /* renamed from: aN */
    public boolean f1140aN;

    /* renamed from: aO */
    public boolean f1141aO;

    /* renamed from: aP */
    public float f1142aP;

    /* renamed from: aQ */
    public float f1143aQ;

    /* renamed from: aV */
    public float f1144aV;

    /* renamed from: aX */
    public C0467y f1145aX;

    /* renamed from: aY */
    public C0467y f1146aY;

    /* renamed from: aZ */
    public C0413bn f1147aZ;

    /* renamed from: ba */
    public int f1148ba;

    /* renamed from: bb */
    public boolean f1149bb;

    /* renamed from: bc */
    public boolean f1150bc;

    /* renamed from: bd */
    public C0449h f1151bd;

    /* renamed from: i */
    public int f1152i = 35;

    /* renamed from: j */
    public float f1153j = -1.0f;

    /* renamed from: k */
    public boolean f1154k = false;

    /* renamed from: l */
    public boolean f1155l = false;

    /* renamed from: m */
    public boolean f1156m = false;

    /* renamed from: n */
    public boolean f1157n = false;

    /* renamed from: o */
    public float f1158o = 1.0f;

    /* renamed from: p */
    public boolean f1159p = false;

    /* renamed from: q */
    public boolean f1160q = false;

    /* renamed from: r */
    public boolean f1161r = false;

    /* renamed from: s */
    public boolean f1162s = false;

    /* renamed from: t */
    public boolean f1163t = false;

    /* renamed from: w */
    public float f1164w = 5.0f;

    /* renamed from: x */
    public short f1165x = -1;

    /* renamed from: z */
    public short f1166z = -1;

    /* renamed from: I */
    public boolean f1167I = false;

    /* renamed from: J */
    public boolean f1168J = false;

    /* renamed from: K */
    public float f1169K = -1.0f;

    /* renamed from: L */
    public boolean f1170L = false;

    /* renamed from: M */
    public boolean f1171M = false;

    /* renamed from: N */
    public boolean f1172N = false;

    /* renamed from: O */
    public float f1173O = -1.0f;

    /* renamed from: P */
    public float f1174P = -1.0f;

    /* renamed from: U */
    public boolean f1175U = false;

    /* renamed from: V */
    public boolean f1176V = false;

    /* renamed from: W */
    public boolean f1177W = false;

    /* renamed from: X */
    public boolean f1178X = false;

    /* renamed from: ae */
    public boolean f1179ae = false;

    /* renamed from: af */
    public boolean f1180af = false;

    /* renamed from: ag */
    public float f1181ag = 3.0f;

    /* renamed from: an */
    public float f1182an = 5.0f;

    /* renamed from: ao */
    public int f1183ao = -1;

    /* renamed from: ap */
    public float f1184ap = 0.5f;

    /* renamed from: ar */
    public boolean f1185ar = false;

    /* renamed from: as */
    public float f1186as = -1.0f;

    /* renamed from: at */
    public float f1187at = -1.0f;

    /* renamed from: au */
    public float f1188au = -1.0f;

    /* renamed from: av */
    public float f1189av = 0.1f;

    /* renamed from: aw */
    public boolean f1190aw = false;

    /* renamed from: ax */
    public float f1191ax = 120.0f;

    /* renamed from: ay */
    public float f1192ay = 15.0f;

    /* renamed from: aA */
    public float f1193aA = 5.0f;

    /* renamed from: aB */
    public float f1194aB = 120.0f;

    /* renamed from: aC */
    public float f1195aC = 15.0f;

    /* renamed from: aE */
    public int f1196aE = Color.argb(255, 255, 255, 255);

    /* renamed from: aF */
    public float f1197aF = 1.0f;

    /* renamed from: aG */
    public float f1198aG = 0.0f;

    /* renamed from: aH */
    public float f1199aH = 1.0f;

    /* renamed from: aJ */
    public boolean f1200aJ = true;

    /* renamed from: aR */
    public float f1201aR = 1.0f;

    /* renamed from: aS */
    public float f1202aS = 1.0f;

    /* renamed from: aT */
    public float f1203aT = 1.0f;

    /* renamed from: aU */
    public float f1204aU = 1.0f;

    /* renamed from: aW */
    public float f1205aW = -1.0f;

    /* renamed from: be */
    public C1101m f1206be = null;

    /* renamed from: bf */
    public C1101m f1207bf = null;

    /* renamed from: bg */
    public C1101m f1208bg = null;

    /* renamed from: a */
    public C0467y m6493a(Unit unit) {
        C1101m c1101m = this.f1208bg;
        if (c1101m != null && c1101m.f6888a > 0) {
            Iterator it = c1101m.iterator();
            while (it.hasNext()) {
                C0190h c0190h = (C0190h) it.next();
                if (c0190h.m6490a(unit) && c0190h.f1215g != null) {
                    return c0190h.f1215g;
                }
            }
            return null;
        }
        return null;
    }

    /* renamed from: a */
    public float m6492a(Unit unit, float f, boolean z) {
        C1101m c1101m;
        float f2;
        if (!z) {
            c1101m = this.f1206be;
        } else {
            c1101m = this.f1207bf;
        }
        if (c1101m != null && c1101m.f6888a > 0) {
            Iterator it = c1101m.iterator();
            while (it.hasNext()) {
                C0190h c0190h = (C0190h) it.next();
                if (c0190h.m6490a(unit)) {
                    if (!z) {
                        if (c0190h.f1213e != null) {
                            c0190h.f1213e.m5185h(unit);
                        }
                        f2 = c0190h.f1211c;
                    } else {
                        if (c0190h.f1214f != null) {
                            c0190h.f1214f.m5185h(unit);
                        }
                        f2 = c0190h.f1212d;
                    }
                    f *= f2;
                }
            }
        }
        return f;
    }

    /* renamed from: a */
    public static void m6494a(C0189g c0189g, C0859ar c0859ar) {
        if (c0189g == f1098a) {
            c0859ar.m1554c(0);
        } else if (c0189g instanceof C0405bf) {
            c0859ar.m1554c(1);
            C0405bf.m5280a((C0405bf) c0189g, c0859ar);
        } else {
            GameEngine.m1120g("writeOutLink: Unhandled projectile type");
            c0859ar.m1554c(0);
        }
    }

    /* renamed from: a */
    public static C0189g m6491a(C0876k c0876k) {
        byte m1457d = c0876k.m1457d();
        if (m1457d == 0) {
            return f1098a;
        }
        if (m1457d == 1) {
            C0189g m5279b = C0405bf.m5279b(c0876k);
            if (m5279b == null) {
                return f1098a;
            }
            return m5279b;
        }
        throw new IOException("Unknown projectile type:" + ((int) m1457d));
    }
}
