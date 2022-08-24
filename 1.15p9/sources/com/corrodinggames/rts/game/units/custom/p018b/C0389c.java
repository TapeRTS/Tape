package com.corrodinggames.rts.game.units.custom.p018b;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.EnumC0200q;
import com.corrodinggames.rts.game.units.custom.C0411bl;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.b.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/b/c.class */
public class C0389c extends AbstractC0387a {

    /* renamed from: c */
    C1101m f2329c = new C1101m();

    /* renamed from: d */
    C1101m f2330d = new C1101m();

    /* renamed from: e */
    C1101m f2331e = new C1101m();

    /* renamed from: f */
    C1101m f2332f = new C1101m();

    /* renamed from: g */
    C1101m f2333g = new C1101m();

    /* renamed from: h */
    boolean f2334h;

    /* renamed from: a */
    static Paint f2327a = new Paint();

    /* renamed from: b */
    static C0930ag f2328b = new C0930ag();

    /* renamed from: i */
    static final Rect f2335i = new Rect();

    /* renamed from: j */
    static final RectF f2336j = new RectF();

    /* renamed from: a */
    public static void m5322a(C0453l c0453l, C1072ab c1072ab) {
        String str;
        C1101m c1101m;
        C0389c c0389c = null;
        Iterator it = c1072ab.m669e("decal_").iterator();
        while (it.hasNext()) {
            String str2 = (String) it.next();
            c0453l.m4755a("1.15p9", 115009, str2, "decals");
            str2.substring("decal_".length());
            C0390d c0390d = new C0390d();
            c0390d.f2364F = (EnumC0392f) c1072ab.m699a(str2, "layer", EnumC0392f.f2406d, EnumC0392f.class);
            c0390d.f2365G = c1072ab.m698a(str2, "order", Float.valueOf(0.0f)).floatValue();
            c0390d.f2337b = c1072ab.m700a(str2, "onlyWhenSelectedByOwnPlayer", (Boolean) false).booleanValue();
            c0390d.f2338c = c1072ab.m700a(str2, "onlyWhenSelectedByEnemyPlayer", (Boolean) false).booleanValue();
            c0390d.f2339d = c1072ab.m700a(str2, "onlyWhenSelectedByAllyNotOwnPlayer", (Boolean) false).booleanValue();
            c0390d.f2340e = c1072ab.m700a(str2, "onlyWhenSelectedByAnyPlayer", (Boolean) false).booleanValue();
            int i = 0;
            if (c0390d.f2337b) {
                i = 0 + 1;
            }
            if (c0390d.f2338c) {
                i++;
            }
            if (c0390d.f2339d) {
                i++;
            }
            if (c0390d.f2340e) {
                i++;
            }
            if (i >= 2) {
                throw new C0412bm("[" + str2 + "]Doesn't make sense to set more than one onlyWhenSelectedBy* to true at a time.");
            }
            if (i > 0) {
                c0390d.f2388a = true;
            } else {
                c0390d.f2388a = false;
            }
            c0390d.f2341f = c1072ab.m700a(str2, "includeParentsSelection", (Boolean) false).booleanValue();
            c0390d.f2389g = (EnumC0200q) c1072ab.m699a(str2, "onlyTeam", EnumC0200q.f1394f, EnumC0200q.class);
            c0390d.f2342h = c1072ab.m700a(str2, "onlyPlayersWithUnitControl", (Boolean) false).booleanValue();
            c0390d.f2343i = c1072ab.m698a(str2, "onlyWithZoomLevelOrMore", Float.valueOf(0.0f)).floatValue();
            boolean z = false;
            if (c0390d.f2364F == EnumC0392f.f2407e) {
                z = true;
            }
            c0390d.f2344j = c1072ab.m700a(str2, "onlyWhileActive", (Boolean) false).booleanValue();
            c0390d.f2345k = c1072ab.m700a(str2, "onlyWhileAlive", Boolean.valueOf(z)).booleanValue();
            c0390d.f2346l = c1072ab.m700a(str2, "onlyInPreview", (Boolean) false).booleanValue();
            c0390d.f2347m = c1072ab.m700a(str2, "onlyOnNonPreview", (Boolean) false).booleanValue();
            if (c0390d.f2346l && c0390d.f2347m) {
                throw new C0412bm("[" + str2 + "]decal with both onlyInPreview and onlyOnNonPreview will never be visible");
            }
            if (c0390d.f2343i > 5.0f) {
                throw new C0412bm("[" + str2 + "]decal with onlyWithZoomLevelOrMore:" + c0390d.f2343i + " will never be visible");
            }
            if (c0390d.f2343i < 0.0f) {
                throw new C0412bm("[" + str2 + "]onlyWithZoomLevelOrMore:" + c0390d.f2343i + " cannot be less than zero");
            }
            Integer m682b = c1072ab.m682b(str2, "onlyOnBodyFrameOf", (Integer) null);
            if (m682b != null) {
                c0390d.f2390n = m682b.intValue();
                if (c0390d.f2390n < 0) {
                    throw new C0412bm("[" + str2 + "]onlyOnBodyFrameOf cannot be: " + c0390d.f2390n);
                }
            }
            LogicBoolean m679c = c1072ab.m679c(c0453l, str2, "imageScale", null);
            if (m679c != null) {
                if (LogicBoolean.isStaticNumber(m679c)) {
                    c0390d.f2391o = LogicBoolean.getKnownStaticNumber(m679c);
                } else {
                    c0390d.f2348p = true;
                    c0390d.f2349q = m679c;
                }
            }
            LogicBoolean m679c2 = c1072ab.m679c(c0453l, str2, "imageScaleX", null);
            LogicBoolean m679c3 = c1072ab.m679c(c0453l, str2, "imageScaleY", null);
            if (m679c2 != null || m679c3 != null) {
                c0390d.f2348p = true;
                c0390d.f2350r = m679c2;
                c0390d.f2351s = m679c3;
            }
            Integer m682b2 = c1072ab.m682b(str2, "total_frames", (Integer) null);
            if (m682b2 != null) {
                c0390d.f2392I = m682b2.intValue();
                if (c0390d.f2392I < 1) {
                    throw new C0412bm("[" + str2 + "] TOTAL_FRAMES cannot be: " + c0390d.f2392I + " (must be 1 or more)");
                }
            }
            c0390d.f2393J = c1072ab.m682b(str2, "frame_width", (Integer) (-1)).intValue();
            c0390d.f2394K = c1072ab.m682b(str2, "frame_height", (Integer) (-1)).intValue();
            if (c0390d.f2393J != -1 && c0390d.f2392I != -1) {
                throw new C0412bm("[" + str2 + "]TOTAL_FRAMES and frame_width cannot be both set");
            }
            if (c0390d.f2394K != -1 && c0390d.f2394K <= 0) {
                throw new C0412bm("[" + str2 + "]frame_height cannot be: " + c0390d.f2394K);
            }
            if (c0390d.f2393J != -1 && c0390d.f2393J <= 0) {
                throw new C0412bm("[" + str2 + "]frame_width cannot be: " + c0390d.f2393J);
            }
            if (c0390d.f2392I != -1 && c0390d.f2392I <= 0) {
                throw new C0412bm("[" + str2 + "]TOTAL_FRAMES cannot be: " + c0390d.f2392I);
            }
            if (c0390d.f2394K != -1 || c0390d.f2393J != -1 || c0390d.f2392I != -1) {
                c0390d.f2366H = true;
            }
            boolean booleanValue = c1072ab.m700a(str2, "teamColors", (Boolean) false).booleanValue();
            BitmapOrTexture m4758a = c0453l.m4758a(c1072ab, str2, "image");
            if (m4758a != null) {
                C0391e c0391e = new C0391e();
                c0391e.f2397a = m4758a;
                if (c0391e.f2397a != null && booleanValue) {
                    c0391e.f2398b = c0453l.m4759a(m4758a, c0453l.f2931ab);
                }
                c0391e.m5316a(c0390d);
                c0390d.f2353u = c0391e;
                c0390d.f2352t = true;
            }
            String m681b = c1072ab.m681b(str2, "imageStack", (String) null);
            if (m681b != null && !m681b.equals(VariableScope.nullOrMissingString)) {
                c0390d.f2352t = true;
                ArrayList arrayList = new ArrayList();
                for (String str3 : m681b.split(",")) {
                    String trim = str3.trim();
                    boolean z2 = booleanValue;
                    String str4 = null;
                    if (trim.contains("(") && trim.contains(")")) {
                        String[] m2260f = CommonUtils.m2260f(trim, "(");
                        if (m2260f == null) {
                            throw new C0412bm("[" + str2 + "]imageStack: Unexpected format for: " + m681b);
                        }
                        trim = m2260f[0];
                        str4 = m2260f[1].trim();
                    }
                    String[] split = trim.split("\\*");
                    String str5 = split[0];
                    int i2 = 1;
                    if (split.length >= 2) {
                        i2 = Integer.parseInt(split[1]);
                    }
                    if (str4 != null) {
                        if (!str4.endsWith(")")) {
                            throw new C0412bm("[" + str2 + "]imageStack: Missing ')' in: " + m681b);
                        }
                        Iterator it2 = CommonUtils.m2326a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                        while (it2.hasNext()) {
                            String str6 = (String) it2.next();
                            if (!str6.trim().equals(VariableScope.nullOrMissingString)) {
                                String[] m2260f2 = CommonUtils.m2260f(str6, "=");
                                if (m2260f2 == null) {
                                    throw new RuntimeException("[" + str2 + "]imageStack: Unexpected key format for: " + m681b);
                                }
                                String trim2 = m2260f2[0].trim();
                                String trim3 = m2260f2[1].trim();
                                if (trim2.equalsIgnoreCase("teamColors")) {
                                    z2 = C1072ab.m661g(str2, "imageStack", trim3);
                                } else if (trim2.equalsIgnoreCase("teamColor")) {
                                    z2 = C1072ab.m661g(str2, "imageStack", trim3);
                                } else {
                                    throw new RuntimeException("[" + str2 + "]imageStack: Unknown parameter: " + trim2);
                                }
                            }
                        }
                    }
                    C0391e c0391e2 = new C0391e();
                    c0391e2.f2397a = c0453l.m4751a(c0453l.f2914E, str5, c0453l.f2930aa, str2, "imageStack");
                    if (c0391e2.f2397a == null) {
                        throw new C0412bm("[" + str2 + "]failed to load image " + str5);
                    }
                    if (z2) {
                        c0391e2.f2398b = c0453l.m4759a(c0391e2.f2397a, c0453l.f2931ab);
                    }
                    c0391e2.m5316a(c0390d);
                    for (int i3 = 0; i3 < i2; i3++) {
                        arrayList.add(c0391e2);
                    }
                }
                if (arrayList.size() > 0) {
                    c0390d.f2354v = (C0391e[]) arrayList.toArray(new C0391e[0]);
                }
            }
            c0390d.f2355w = c1072ab.m698a(str2, "stack_hOffset", Float.valueOf(1.0f)).floatValue();
            c0390d.f2356x = c1072ab.m682b(str2, "stack_frameOffset", (Integer) 0).intValue();
            c0390d.f2358z = c1072ab.m679c(c0453l, str2, "stack_indexStart", null);
            c0390d.f2359A = c1072ab.m679c(c0453l, str2, "stack_indexCount", null);
            Boolean m700a = c1072ab.m700a(str2, "stack_drawInReverseOrder", (Boolean) null);
            if ((m700a != null && m700a.booleanValue()) || (m700a == null && c0390d.f2355w < 0.0f)) {
                c0390d.f2357y = true;
            }
            c0390d.f2368M = c1072ab.m718a(c0453l, str2, "frame", (LogicBoolean) null, LogicBoolean.ReturnType.number);
            c0390d.f2369N = c1072ab.m682b(str2, "addBodyFrameMultipliedBy", (Integer) 0).intValue();
            c0390d.f2363E = c1072ab.m719a(c0453l, str2, "isVisible", (LogicBoolean) null);
            c0390d.f2372Q = c1072ab.m698a(str2, "xOffsetRelative", Float.valueOf(0.0f)).floatValue();
            c0390d.f2373R = c1072ab.m698a(str2, "yOffsetRelative", Float.valueOf(0.0f)).floatValue();
            c0390d.f2377V = c1072ab.m679c(c0453l, str2, "xOffsetAbsolute", null);
            c0390d.f2378W = c1072ab.m679c(c0453l, str2, "yOffsetAbsolute", null);
            if (LogicBoolean.isStaticNumber(c0390d.f2377V)) {
                c0390d.f2374S = LogicBoolean.getKnownStaticNumber(c0390d.f2377V);
                c0390d.f2377V = null;
            }
            if (LogicBoolean.isStaticNumber(c0390d.f2378W)) {
                c0390d.f2375T = LogicBoolean.getKnownStaticNumber(c0390d.f2378W);
                c0390d.f2378W = null;
            }
            c0390d.f2376U = c1072ab.m698a(str2, "hOffset", Float.valueOf(0.0f)).floatValue();
            c0390d.f2381Z = c1072ab.m698a(str2, "dirOffset", Float.valueOf(0.0f)).floatValue();
            c0390d.f2382aa = c1072ab.m698a(str2, "pivotOffset", Float.valueOf(0.0f)).floatValue();
            c0390d.f2379X = c1072ab.m693a(str2, "alwaysStartDirAtZero", "alwayStartDirAtZero", (Boolean) false).booleanValue();
            c0390d.f2380Y = c1072ab.m700a(str2, "alwaysStartHeightAtZero", (Boolean) false).booleanValue();
            if (c0390d.f2372Q != 0.0f) {
            }
            c0390d.f2383ab = c1072ab.m686b(c0453l, str2, "basePosition", null);
            c0390d.f2384ac = c1072ab.m686b(c0453l, str2, "drawLineTo", null);
            String m681b2 = c1072ab.m681b(str2, "basePositionFromLegEnd", (String) null);
            if (m681b2 != null || 0 != 0) {
                if (m681b2 != null && 0 != 0) {
                    throw new C0412bm("[" + str2 + "]basePositionFromLegEnd and basePositionFromLegMiddle cannot be used at the same time");
                }
                if (0 != 0) {
                    str = null;
                    c0390d.f2385ae = true;
                } else {
                    str = m681b2;
                }
                c0390d.f2395ad = c0453l.m4742b(str);
                if (c0390d.f2395ad == -1) {
                    throw new C0412bm("[" + str2 + "]basePositionFromLeg* failed to find: " + str);
                }
            }
            String m681b3 = c1072ab.m681b(str2, "basePositionFromTurret", (String) null);
            if (m681b3 != null) {
                C0411bl m4731e = c0453l.m4731e(m681b3);
                if (m4731e == null) {
                    throw new C0412bm("[" + str2 + "]basePositionFromTurret failed to find: " + m681b3);
                }
                c0390d.f2396af = m4731e.f2546e;
            }
            if (c0390d.f2395ad != -1 && c0390d.f2396af != -1) {
                throw new C0412bm("[" + str2 + "]basePositionFromTurret and basePositionFromLeg cannot be used at the same time");
            }
            if ((c0390d.f2395ad != -1 || c0390d.f2396af != -1) && c0390d.f2383ab != null) {
                throw new C0412bm("[" + str2 + "]basePositionFromTurret/basePositionFromLeg cannot be used at the same time as basePosition");
            }
            c0390d.f2360B = c0453l.m4758a(c1072ab, str2, "image_shadow");
            c0390d.f2361C = c1072ab.m698a(str2, "shadowOffsetX", Float.valueOf(1.0f)).floatValue();
            c0390d.f2362D = c1072ab.m698a(str2, "shadowOffsetY", Float.valueOf(1.0f)).floatValue();
            c0390d.f2370O = c1072ab.m696a(str2, "color", (Integer) (-1)).intValue();
            c0390d.f2371P = c1072ab.m698a(str2, "lineWidth", Float.valueOf(1.0f)).floatValue();
            float f = 1.0f;
            LogicBoolean m679c4 = c1072ab.m679c(c0453l, str2, "alpha", null);
            if (m679c4 != null) {
                if (LogicBoolean.isStaticNumber(m679c4)) {
                    float knownStaticNumber = LogicBoolean.getKnownStaticNumber(m679c4);
                    if (knownStaticNumber < 0.0f || knownStaticNumber > 1.0f) {
                        throw new C0412bm("[" + str2 + "]alpha should be between 0-1");
                    }
                    f = knownStaticNumber;
                } else {
                    c0390d.f2387ah = m679c4;
                }
            }
            if (c0390d.f2370O != -1 || c0390d.f2371P != 1.0f || f != 1.0f) {
                c0390d.f2386ag = new C0930ag();
                c0390d.f2386ag.m7242b(c0390d.f2370O);
                int f2 = (int) (c0390d.f2386ag.m7228f() * f);
                if (f2 < 0) {
                    f2 = 0;
                }
                if (f2 > 255) {
                    f2 = 255;
                }
                c0390d.f2386ag.m7237c(f2);
                c0390d.f2386ag.m7270a(c0390d.f2371P);
            }
            boolean z3 = true;
            if (LogicBoolean.isStaticFalse(c0390d.f2363E)) {
                z3 = false;
            }
            if (c0390d.f2384ac == null && !c0390d.f2352t) {
                z3 = false;
            }
            if (f == 0.0f) {
                z3 = false;
            }
            if (z3) {
                if (c0389c == null) {
                    c0389c = new C0389c();
                    c0453l.m4743b(c0389c);
                }
                if (!c0390d.f2388a) {
                    c0389c.f2334h = true;
                }
                if (c0390d.f2360B != null && c0390d.f2364F != EnumC0392f.f2403a) {
                    c0389c.f2329c.add(c0390d);
                }
                if (c0390d.f2364F == EnumC0392f.f2405c) {
                    c1101m = c0389c.f2332f;
                } else if (c0390d.f2364F == EnumC0392f.f2404b) {
                    c1101m = c0389c.f2331e;
                } else if (c0390d.f2364F == EnumC0392f.f2407e) {
                    c1101m = c0389c.f2333g;
                } else if (c0390d.f2364F == EnumC0392f.f2403a) {
                    c1101m = c0389c.f2329c;
                } else {
                    c1101m = c0389c.f2330d;
                }
                C1101m c1101m2 = c1101m;
                c1101m2.add(c0390d);
                Collections.sort(c1101m2);
            }
        }
    }

    /* renamed from: b */
    public void mo5310b(C0451j c0451j, float f) {
        GameEngine.getInstance();
    }

    /* renamed from: a */
    public void mo5335a(C0451j c0451j) {
    }

    /* renamed from: d */
    public void mo5329d(C0451j c0451j, float f) {
        m5323a(c0451j, f, EnumC0392f.f2403a, this.f2329c);
        m5323a(c0451j, f, EnumC0392f.f2404b, this.f2331e);
    }

    /* renamed from: e */
    public void mo5328e(C0451j c0451j, float f) {
        m5323a(c0451j, f, EnumC0392f.f2405c, this.f2332f);
    }

    /* renamed from: c */
    public void mo5330c(C0451j c0451j, float f) {
        m5323a(c0451j, f, EnumC0392f.f2406d, this.f2330d);
    }

    /* renamed from: f */
    public void mo5327f(C0451j c0451j, float f) {
        m5323a(c0451j, f, EnumC0392f.f2407e, this.f2333g);
    }

    /* renamed from: a */
    public Rect m5325a(C0390d c0390d, C0391e c0391e, BitmapOrTexture bitmapOrTexture, int i) {
        int i2 = c0391e.f2399c;
        int i3 = c0391e.f2400d;
        int i4 = 0;
        int i5 = 0;
        if (i > 0) {
            if (!c0390d.f2367L) {
                int i6 = 0;
                int i7 = i;
                int i8 = c0391e.f2402f;
                if (i >= i8) {
                    i6 = 0 + (i / i8);
                    i7 = i % i8;
                }
                i4 = i7 * i2;
                i5 = i6 * i3;
            } else {
                int i9 = i;
                int i10 = 0;
                int i11 = c0391e.f2401e;
                if (i >= i11) {
                    i10 = 0 + (i / i11);
                    i9 = i % i11;
                }
                i4 = i10 * i2;
                i5 = i9 * i3;
            }
        }
        Rect rect = f2335i;
        rect.f230a = i4;
        rect.f231b = i5;
        rect.f232c = i4 + i2;
        rect.f233d = i5 + i3;
        return rect;
    }

    /* renamed from: a */
    public RectF m5326a(C0390d c0390d, C0391e c0391e, BitmapOrTexture bitmapOrTexture, float f, float f2) {
        int i = c0391e.f2399c;
        int i2 = c0391e.f2400d;
        float f3 = f - (i / 2);
        float f4 = f2 - (i2 / 2);
        RectF rectF = f2336j;
        rectF.f234a = f3;
        rectF.f236c = f3 + i;
        rectF.f235b = f4;
        rectF.f237d = f4 + i2;
        return rectF;
    }

    /* JADX WARN: Removed duplicated region for block: B:148:0x03fb  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x0406  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x0439  */
    /* JADX WARN: Removed duplicated region for block: B:157:0x044f  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0467  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x051f  */
    /* JADX WARN: Removed duplicated region for block: B:282:0x04bc A[SYNTHETIC] */
    /* renamed from: a */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void m5323a(com.corrodinggames.rts.game.units.custom.C0451j r9, float r10, com.corrodinggames.rts.game.units.custom.p018b.EnumC0392f r11, com.corrodinggames.rts.gameFramework.utility.C1101m r12) {
        /*
            Method dump skipped, instructions count: 2407
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.corrodinggames.rts.game.units.custom.p018b.C0389c.m5323a(com.corrodinggames.rts.game.units.custom.j, float, com.corrodinggames.rts.game.units.custom.b.f, com.corrodinggames.rts.gameFramework.utility.m):void");
    }
}
