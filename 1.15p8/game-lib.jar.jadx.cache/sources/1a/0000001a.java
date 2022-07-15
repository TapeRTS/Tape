package com.corrodinggames.rts.game;

import android.graphics.Color;
import android.graphics.LightingColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.R;
import com.corrodinggames.rts.game.units.FogRevealer;
import com.corrodinggames.rts.game.units.MovementType;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.game.units.custom.C0396bm;
import com.corrodinggames.rts.game.units.custom.C0433j;
import com.corrodinggames.rts.game.units.custom.C0449y;
import com.corrodinggames.rts.game.units.custom.Effect;
import com.corrodinggames.rts.game.units.custom.EnumC0334ad;
import com.corrodinggames.rts.game.units.custom.EnumC0370aw;
import com.corrodinggames.rts.game.units.custom.ValueList;
import com.corrodinggames.rts.game.units.custom.ValueListSource;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.RenderedObject;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.Graphics;
import com.corrodinggames.rts.gameFramework.draw.UniquePaint;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.effect.EffectType;
import com.corrodinggames.rts.gameFramework.effect.Emitter;
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.effect.ImageStrip;
import com.corrodinggames.rts.gameFramework.network.EnumC0796m;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0918ai;
import com.corrodinggames.rts.gameFramework.utility.C0950u;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.f */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/f.class */
public class Projectile extends RenderedObject {

    /* renamed from: h */
    public float lifeTimer;

    /* renamed from: i */
    public float f1012i;

    /* renamed from: j */
    public Unit source;

    /* renamed from: l */
    public Unit target;

    /* renamed from: m */
    public boolean f1015m;

    /* renamed from: n */
    public float f1016n;

    /* renamed from: o */
    public float f1017o;

    /* renamed from: p */
    public float f1018p;

    /* renamed from: q */
    public Projectile f1019q;

    /* renamed from: t */
    public float speed;

    /* renamed from: u */
    public float f1021u;

    /* renamed from: v */
    public float f1022v;

    /* renamed from: w */
    public float f1023w;

    /* renamed from: A */
    public boolean f957A;

    /* renamed from: B */
    public boolean f958B;

    /* renamed from: C */
    public boolean f959C;

    /* renamed from: D */
    public boolean f960D;

    /* renamed from: E */
    public boolean f961E;

    /* renamed from: F */
    public float f962F;

    /* renamed from: G */
    public boolean f963G;

    /* renamed from: I */
    public float f964I;

    /* renamed from: J */
    public float f965J;

    /* renamed from: K */
    public float x;

    /* renamed from: L */
    public float y;

    /* renamed from: M */
    public boolean f968M;

    /* renamed from: N */
    public float f969N;

    /* renamed from: O */
    public float[] f970O;

    /* renamed from: T */
    public boolean f971T;

    /* renamed from: U */
    public float directDamage;

    /* renamed from: Y */
    public float f973Y;

    /* renamed from: Z */
    public float f974Z;

    /* renamed from: aa */
    public boolean f995aa;

    /* renamed from: af */
    public boolean f996af;

    /* renamed from: ag */
    public float f997ag;

    /* renamed from: ah */
    public float f998ah;

    /* renamed from: an */
    public float f999an;

    /* renamed from: ao */
    public boolean f1000ao;

    /* renamed from: ap */
    public ObjectVector f1001ap;

    /* renamed from: as */
    public boolean f1002as;

    /* renamed from: at */
    public boolean f1003at;

    /* renamed from: au */
    public GameObject f1004au;

    /* renamed from: aw */
    public float f1005aw;

    /* renamed from: ax */
    public float f1006ax;

    /* renamed from: ay */
    public float f1007ay;

    /* renamed from: az */
    public float f1008az;

    /* renamed from: aA */
    public float f975aA;

    /* renamed from: aB */
    public boolean f976aB;

    /* renamed from: aC */
    public boolean f977aC;

    /* renamed from: aD */
    public int f978aD;

    /* renamed from: aE */
    public ValueList f979aE;

    /* renamed from: aF */
    public float f980aF;

    /* renamed from: aG */
    public boolean f981aG;

    /* renamed from: aH */
    public boolean f982aH;

    /* renamed from: aM */
    public boolean f983aM;

    /* renamed from: aN */
    public float trailEffect_delay;

    /* renamed from: aO */
    public float f985aO;

    /* renamed from: aP */
    public EffectObject f986aP;

    /* renamed from: aQ */
    public boolean f987aQ;

    /* renamed from: bn */
    private boolean f1010bn;

    /* renamed from: aS */
    public boolean f988aS;

    /* renamed from: aU */
    public boolean f989aU;

    /* renamed from: aV */
    float f990aV;

    /* renamed from: aW */
    float f991aW;

    /* renamed from: aX */
    float f992aX;

    /* renamed from: aY */
    public boolean f993aY;

    /* renamed from: aZ */
    public boolean f994aZ;

    /* renamed from: bj */
    public UniquePaint f1009bj;

    /* renamed from: a */
    public static final ObjectVector f1024a = new ObjectVector();

    /* renamed from: bm */
    private static final Projectile f1025bm = new Projectile(true);

    /* renamed from: b */
    static BitmapOrTexture f1026b = null;

    /* renamed from: c */
    static BitmapOrTexture f1027c = null;

    /* renamed from: d */
    static BitmapOrTexture f1028d = null;

    /* renamed from: e */
    static final Rect f1029e = new Rect();

    /* renamed from: f */
    static final RectF f1030f = new RectF();

    /* renamed from: aq */
    static final int f1031aq = Color.argb(255, 255, 255, 255);

    /* renamed from: ba */
    public static final UniquePaint f1032ba = new UniquePaint();

    /* renamed from: bb */
    public static final Paint f1033bb = new Paint();

    /* renamed from: bd */
    public static final Paint f1034bd = new Paint();

    /* renamed from: be */
    public static final Paint f1035be = new Paint();

    /* renamed from: bf */
    public static final Paint f1036bf = new Paint();

    /* renamed from: bg */
    public static final Paint f1037bg = new Paint();

    /* renamed from: bh */
    public static final Paint f1038bh = new Paint();

    /* renamed from: bc */
    public static final Paint f1039bc = new UniquePaint();

    /* renamed from: bi */
    public static final C0950u f1040bi = new C0950u();

    /* renamed from: bk */
    public static UniquePaint f1041bk = null;

    /* renamed from: bl */
    public static int f1042bl = 0;

    /* renamed from: g */
    public C0183g f1043g = C0183g.f1075a;

    /* renamed from: k */
    public short f1044k = -1;

    /* renamed from: r */
    public float f1045r = -1.0f;

    /* renamed from: s */
    public float f1046s = 0.1f;

    /* renamed from: x */
    public float f1047x = 2.0f;

    /* renamed from: y */
    public float f1048y = -1.0f;

    /* renamed from: z */
    public boolean f1049z = true;

    /* renamed from: H */
    public float f1050H = 1.0f;

    /* renamed from: P */
    public short f1051P = -1;

    /* renamed from: Q */
    public short f1052Q = -1;

    /* renamed from: R */
    public short f1053R = 0;

    /* renamed from: S */
    public boolean visible = true;

    /* renamed from: V */
    public boolean f1055V = false;

    /* renamed from: W */
    public float f1056W = 0.0f;

    /* renamed from: X */
    public float f1057X = 0.0f;

    /* renamed from: ab */
    public boolean f1058ab = false;

    /* renamed from: ac */
    public boolean f1059ac = false;

    /* renamed from: ad */
    public boolean f1060ad = false;

    /* renamed from: ae */
    public boolean f1061ae = true;

    /* renamed from: ai */
    public float f1062ai = 1.0f;

    /* renamed from: aj */
    public float f1063aj = 1.0f;

    /* renamed from: ak */
    public float f1064ak = 1.0f;

    /* renamed from: al */
    public float f1065al = 1.0f;

    /* renamed from: am */
    public float f1066am = 1.0f;

    /* renamed from: ar */
    public int color = f1031aq;

    /* renamed from: av */
    public int f1068av = -1;

    /* renamed from: aI */
    public float f1069aI = 40.0f;

    /* renamed from: aJ */
    public float f1070aJ = 60.0f;

    /* renamed from: aK */
    public boolean f1071aK = false;

    /* renamed from: aL */
    public float f1072aL = 2.0f;

    /* renamed from: aR */
    public boolean f1073aR = true;

    /* renamed from: aT */
    public float f1074aT = 0.0f;

    static {
        f1039bc.setColor(-16777216);
        f1039bc.setAlpha(108);
        f1034bd.m4717a(80, 255, 0, 0);
        f1034bd.mo935a(true);
        f1034bd.setStrokeWidth(5.0f);
        f1035be.m4717a(30, 255, 0, 0);
        f1035be.mo935a(true);
        f1035be.setStrokeWidth(8.0f);
        f1036bf.m4717a(80, 128, 166, 255);
        f1036bf.mo935a(true);
        f1036bf.setStrokeWidth(5.0f);
        f1037bg.m4717a(150, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        f1037bg.mo935a(true);
        f1037bg.setStrokeWidth(3.0f);
        f1038bh.m4717a(110, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_WAKEUP, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS, 255);
        f1038bh.mo935a(true);
        f1038bh.setStrokeWidth(8.0f);
    }

    public Projectile(boolean z) {
        super(z);
        if (!z) {
            f1024a.add(this);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void remove() {
        f1024a.remove(this);
        super.remove();
    }

    /* renamed from: a */
    public static Projectile m4039a(Projectile projectile) {
        Projectile projectile2 = f1025bm;
        projectile2.f978aD = -1;
        if (projectile == null) {
            projectile2.f1066am = 1.0f;
            projectile2.f1064ak = 1.0f;
            projectile2.f1065al = 1.0f;
            projectile2.f999an = 0.0f;
        } else {
            projectile2.f1066am = projectile.f1066am;
            projectile2.f1064ak = projectile.f1064ak;
            projectile2.f1065al = projectile.f1065al;
            projectile2.f999an = projectile.f999an;
        }
        return projectile2;
    }

    /* renamed from: a */
    public void m4036a(Unit unit, float f, float f2, float f3) {
        this.source = unit;
        this.x = f;
        this.y = f2;
        this.height = f3;
        this.f1010bn = false;
        this.f1055V = false;
    }

    /* renamed from: b */
    public void m4033b() {
        if (this.f960D) {
            GameEngine game = GameEngine.getInstance();
            EffectObject m2205d = game.effects.m2205d(this.x, this.y, this.height, 0);
            if (m2205d != null) {
                m2205d.f4287H = 0.7f;
                m2205d.f4286G = 2.1f;
                m2205d.drawLayer = (short) 2;
                m2205d.timer = 90.0f;
                m2205d.startTimer = m2205d.timer;
            }
            game.audio.playSound(AudioEngine.buiding_explode, 0.8f, this.x, this.y);
        }
        remove();
    }

    @Override // com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream stream) {
        stream.writeFloat(this.lifeTimer);
        stream.mo1260a(this.source);
        stream.mo1260a(this.target);
        stream.writeFloat(this.speed);
        stream.writeInt(99);
        stream.writeBoolean(this.f957A);
        stream.writeBoolean(this.f958B);
        stream.writeBoolean(this.visible);
        stream.writeBoolean(this.f971T);
        stream.writeFloat(this.directDamage);
        stream.writeFloat(this.f973Y);
        stream.writeFloat(this.f974Z);
        stream.writeInt(this.color);
        stream.writeBoolean(this.f982aH);
        stream.writeFloat(this.f1069aI);
        stream.writeFloat(this.f1070aJ);
        stream.writeBoolean(this.f1071aK);
        stream.writeFloat(this.f1072aL);
        stream.writeBoolean(this.f983aM);
        stream.writeFloat(this.trailEffect_delay);
        stream.writeBoolean(this.f987aQ);
        stream.writeBoolean(this.f1073aR);
        stream.writeBoolean(this.f1010bn);
        stream.writeBoolean(this.f988aS);
        stream.writeBoolean(this.f968M);
        stream.mo1257a(this.f1051P);
        stream.writeFloat(this.f1045r);
        stream.writeFloat(this.f1046s);
        stream.writeBoolean(this.f1002as);
        stream.writeBoolean(this.f1003at);
        stream.writeFloat(this.f1008az);
        stream.writeFloat(this.f975aA);
        stream.writeBoolean(this.f976aB);
        stream.writeBoolean(this.f977aC);
        stream.writeBoolean(false);
        stream.writeFloat(0.0f);
        stream.writeFloat(0.0f);
        stream.writeBoolean(this.f961E);
        stream.writeFloat(this.f962F);
        stream.writeFloat(this.f965J);
        stream.writeFloat(this.x);
        stream.writeFloat(this.y);
        stream.writeBoolean(this.f1015m);
        stream.writeFloat(this.f1016n);
        stream.writeFloat(this.f1017o);
        stream.writeBoolean(this.f959C);
        stream.writeBoolean(this.f960D);
        stream.writeGameObject(this.f1019q);
        stream.writeFloat(this.f990aV);
        stream.writeFloat(this.f991aW);
        stream.writeFloat(this.f992aX);
        stream.writeBoolean(this.f1055V);
        stream.writeFloat(this.f1056W);
        stream.writeFloat(this.f1057X);
        stream.writeBoolean(this.f989aU);
        stream.mo1257a(this.f1053R);
        stream.writeBoolean(this.f1000ao);
        stream.m1323a(this.f1001ap);
        stream.mo1257a(this.f1052Q);
        stream.writeFloat(this.f1047x);
        stream.writeBoolean(this.f995aa);
        stream.writeBoolean(this.f1060ad);
        stream.writeBoolean(this.f963G);
        stream.writeFloat(this.f1050H);
        stream.writeBoolean(this.f1061ae);
        stream.writeBoolean(this.f981aG);
        stream.writeBoolean(this.f1049z);
        stream.writeFloat(this.f1048y);
        stream.writeFloat(this.f985aO);
        stream.writeFloat(this.f1012i);
        stream.writeBoolean(this.f993aY);
        stream.writeBoolean(this.f996af);
        stream.writeFloat(this.f997ag);
        stream.writeFloat(this.f998ah);
        stream.writeFloat(this.f1062ai);
        stream.writeFloat(this.f1063aj);
        stream.writeInt(0);
        stream.writeFloat(0.0f);
        stream.writeFloat(0.0f);
        stream.mo1311a((UnitType) null);
        stream.writeInt(0);
        stream.writeBoolean(false);
        ValueListSource.m3247a(this.f979aE, stream);
        stream.writeFloat(this.f1064ak);
        stream.writeFloat(this.f1065al);
        stream.writeBoolean(this.f1058ab);
        stream.writeBoolean(this.f1059ac);
        stream.writeFloat(this.f999an);
        stream.writeBoolean(false);
        C0183g.m4026a(this.f1043g, stream);
        boolean z = this.f1004au != null && !this.f1004au.deleted;
        stream.writeBoolean(z);
        if (z) {
            stream.writeGameObject(this.f1004au);
            stream.writeFloat(this.f1005aw);
            stream.writeFloat(this.f1006ax);
            stream.writeFloat(this.f1007ay);
        }
        stream.mo1257a(this.f1044k);
        stream.writeInt(this.f978aD);
        stream.writeFloat(this.f1066am);
        stream.writeFloat(this.f1018p);
        stream.writeInt(this.f1068av);
        super.writeOut(stream);
    }

    @Override // com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        this.lifeTimer = inputNetStream.readFloat();
        this.source = inputNetStream.m1219o();
        this.target = inputNetStream.m1244a(EnumC0796m.f5416a);
        this.speed = inputNetStream.readFloat();
        this.f1047x = inputNetStream.readInt();
        this.f957A = inputNetStream.readBoolean();
        this.f958B = inputNetStream.readBoolean();
        this.visible = inputNetStream.readBoolean();
        this.f971T = inputNetStream.readBoolean();
        this.directDamage = inputNetStream.readFloat();
        this.f973Y = inputNetStream.readFloat();
        this.f974Z = inputNetStream.readFloat();
        this.color = inputNetStream.readInt();
        this.f982aH = inputNetStream.readBoolean();
        this.f1069aI = inputNetStream.readFloat();
        this.f1070aJ = inputNetStream.readFloat();
        this.f1071aK = inputNetStream.readBoolean();
        this.f1072aL = inputNetStream.readFloat();
        this.f983aM = inputNetStream.readBoolean();
        this.trailEffect_delay = inputNetStream.readFloat();
        this.f987aQ = inputNetStream.readBoolean();
        this.f1073aR = inputNetStream.readBoolean();
        this.f1010bn = inputNetStream.readBoolean();
        if (inputNetStream.m1237b() >= 7) {
            this.f988aS = inputNetStream.readBoolean();
        }
        if (inputNetStream.m1237b() >= 13) {
            this.f968M = inputNetStream.readBoolean();
            this.f1051P = inputNetStream.m1212v();
        }
        if (inputNetStream.m1237b() >= 16) {
            this.f1045r = inputNetStream.readFloat();
            this.f1046s = inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 17) {
            this.f1002as = inputNetStream.readBoolean();
            this.f1003at = inputNetStream.readBoolean();
            this.f1008az = inputNetStream.readFloat();
            this.f975aA = inputNetStream.readFloat();
            this.f976aB = inputNetStream.readBoolean();
            this.f977aC = inputNetStream.readBoolean();
        }
        if (inputNetStream.m1237b() >= 18) {
            inputNetStream.readBoolean();
            inputNetStream.readFloat();
            inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 28) {
            this.f961E = inputNetStream.readBoolean();
            this.f962F = inputNetStream.readFloat();
            this.f965J = inputNetStream.readFloat();
            this.x = inputNetStream.readFloat();
            this.y = inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 29) {
            this.f1015m = inputNetStream.readBoolean();
            this.f1016n = inputNetStream.readFloat();
            this.f1017o = inputNetStream.readFloat();
            this.f959C = inputNetStream.readBoolean();
            this.f960D = inputNetStream.readBoolean();
            this.f1019q = (Projectile) inputNetStream.readGameObject(Projectile.class);
            this.f990aV = inputNetStream.readFloat();
            this.f991aW = inputNetStream.readFloat();
            this.f992aX = inputNetStream.readFloat();
            this.f1055V = inputNetStream.readBoolean();
            this.f1056W = inputNetStream.readFloat();
            this.f1057X = inputNetStream.readFloat();
            this.f989aU = inputNetStream.readBoolean();
            this.f1053R = inputNetStream.m1212v();
            this.f1000ao = inputNetStream.readBoolean();
            ObjectVector objectVector = new ObjectVector();
            inputNetStream.m1243a(objectVector, Unit.class);
            if (objectVector.size() > 0) {
                this.f1001ap = objectVector;
            }
            this.f1052Q = inputNetStream.m1212v();
        }
        if (inputNetStream.m1237b() >= 35) {
            this.f1047x = inputNetStream.readFloat();
            this.f995aa = inputNetStream.readBoolean();
            this.f1060ad = inputNetStream.readBoolean();
            this.f963G = inputNetStream.readBoolean();
        }
        if (inputNetStream.m1237b() >= 38) {
            this.f1050H = inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 39) {
            this.f1061ae = inputNetStream.readBoolean();
        }
        if (inputNetStream.m1237b() >= 41) {
            this.f981aG = inputNetStream.readBoolean();
        }
        if (inputNetStream.m1237b() >= 43) {
            this.f1049z = inputNetStream.readBoolean();
            this.f1048y = inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 44) {
            this.f985aO = inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 47) {
            this.f1012i = inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 48) {
            this.f993aY = inputNetStream.readBoolean();
        }
        if (inputNetStream.m1237b() >= 59) {
            this.f996af = inputNetStream.readBoolean();
            this.f997ag = inputNetStream.readFloat();
            this.f998ah = inputNetStream.readFloat();
            this.f1062ai = inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 60) {
            this.f1063aj = inputNetStream.readFloat();
            inputNetStream.readInt();
            inputNetStream.readFloat();
            inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 62) {
            inputNetStream.readUnitType();
            inputNetStream.readInt();
            inputNetStream.readBoolean();
        }
        if (inputNetStream.m1237b() >= 63) {
            this.f979aE = ValueListSource.m3246a(inputNetStream);
        }
        if (inputNetStream.m1237b() >= 64) {
            this.f1064ak = inputNetStream.readFloat();
            this.f1065al = inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 66) {
            this.f1058ab = inputNetStream.readBoolean();
            this.f1059ac = inputNetStream.readBoolean();
        }
        if (inputNetStream.m1237b() >= 67 && inputNetStream.m1237b() < 78) {
            C0396bm.m3429a(inputNetStream, true);
        }
        if (inputNetStream.m1237b() >= 68) {
            this.f999an = inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 77) {
            inputNetStream.readBoolean();
        }
        if (inputNetStream.m1237b() >= 78) {
            this.f1043g = C0183g.m4023a(inputNetStream);
        }
        if (inputNetStream.m1237b() >= 81 && inputNetStream.readBoolean()) {
            this.f1004au = inputNetStream.readGameObject(GameObject.class);
            this.f1005aw = inputNetStream.readFloat();
            this.f1006ax = inputNetStream.readFloat();
            this.f1007ay = inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 83) {
            this.f1044k = inputNetStream.m1212v();
            this.f978aD = inputNetStream.readInt();
        }
        if (inputNetStream.m1237b() >= 88) {
            this.f1066am = inputNetStream.readFloat();
        }
        if (inputNetStream.m1237b() >= 89) {
            this.f1018p = inputNetStream.readFloat();
            this.f1068av = inputNetStream.readInt();
        }
        super.mo427a(inputNetStream);
    }

    /* renamed from: c */
    public static void load() {
        GameEngine gameEngine = GameEngine.getInstance();
        f1026b = gameEngine.graphics.loadImage(R.drawable.projectiles);
        f1027c = gameEngine.graphics.loadImage(R.drawable.projectiles2);
        f1028d = gameEngine.graphics.loadImage(R.drawable.projectiles_large);
    }

    /* renamed from: d */
    public void m4029d() {
        this.f988aS = true;
    }

    /* renamed from: a */
    public static Projectile createProjectile(Unit source, float x, float y) {
        Projectile p = new Projectile(false);
        p.source = source;
        p.x = x;
        p.y = y;
        p.color = Color.argb(255, 100, 30, 30);
        p.f6367ee = source.f6367ee + 1;
        p.f6366ed = 4;
        return p;
    }

    /* renamed from: a */
    public static Projectile createProjectile(Unit source, float f, float f2, float f3, int i) {
        Projectile createProjectile = createProjectile(source, f, f2);
        createProjectile.height = f3;
        createProjectile.f1044k = (short) i;
        createProjectile.f964I = CommonUtils.m1683b(source, 0.0f, 1.0f, source.f1530bu);
        source.f1530bu++;
        return createProjectile;
    }

    /* renamed from: a */
    public void m4038a(Unit unit) {
        float f;
        if ((this.f997ag == 0.0f && this.f998ah == 0.0f) || unit.mo2975bH()) {
            return;
        }
        if (CommonUtils.distanceSq(this.f990aV, this.f991aW, unit.x, unit.y) > 100.0f) {
            f = CommonUtils.m1659d(this.f990aV, this.f991aW, unit.x, unit.y);
        } else {
            f = this.f1008az;
        }
        float mass = this.f998ah + (this.f997ag / unit.getMass());
        unit.f1614bT += CommonUtils.cos(f) * mass;
        unit.f1615bU += CommonUtils.sin(f) * mass;
    }

    /* renamed from: a */
    public static void damageUnit(Unit source, Unit target, float damage, Projectile proj, boolean z) {
        GameEngine game = GameEngine.getInstance();
        if (game.InvincibleUnits && damage > 0.0f) {
            damage = 0.0f;
        }
        if (target != null && !target.dead) {
            if (proj != null && proj.f1043g.f1118bc && source != null) {
                target.mo3151e(source.team);
            }
            if (proj != null) {
                if (proj.f1062ai != 1.0f && target.mo2975bH()) {
                    damage *= proj.f1062ai;
                }
                if (proj.f1063aj != 1.0f && target.mo2676i()) {
                    damage *= proj.f1063aj;
                }
            }
            if (damage < 0.0f) {
                target.m3769b(source, -damage, proj);
            } else {
                boolean isTargetSur = !target.dead && target.hp > 0.0f;
                boolean z2 = isTargetSur;
                target.mo2681a(source, damage, proj);
                float f = damage;
                if (target.mo2684J()) {
                    f = 0.0f;
                }
                if (f > 0.0f) {
                    game.StatsHandler.m2286a(source, target, f);
                }
                if (source != null) {
                    source.f1538cM += f;
                    if (z2 && (target.dead || target.hp < 0.0f)) {
                        source.f1537cL++;
                        source.m3775a(EnumC0334ad.f2107d, target);
                    }
                }
            }
            if (proj != null && !target.dead) {
                float m3761bP = target.m3761bP();
                if (m3761bP != -1.0f) {
                    float m1659d = CommonUtils.m1659d(proj.x, proj.y, target.x, target.y);
                    float f2 = 100.0f / m3761bP;
                    target.f1614bT += CommonUtils.cos(m1659d) * f2;
                    target.f1615bU += CommonUtils.sin(m1659d) * f2;
                }
            }
        }
    }

    /* renamed from: e */
    public float m4028e() {
        float f = 1.0f;
        if (this.f965J < this.f962F) {
            f = this.f965J / this.f962F;
        }
        return f;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float deltaSpeed) {
        float f;
        float f2;
        float f3;
        float f4;
        EffectObject m2205d;
        EffectObject m2205d2;
        C0449y m4025a;
        EffectObject emitEffect;
        float f5;
        float f6;
        float f7;
        float f8;
        GameEngine game = GameEngine.getInstance();
        if (this.f988aS) {
            remove();
        }
        if (this.target == null && !this.f977aC) {
            remove();
            return;
        }
        if (this.f1012i > 0.0f) {
            this.f1012i = CommonUtils.toZero(this.f1012i, deltaSpeed);
            if (this.f1012i > 0.0f) {
                return;
            }
        }
        C0183g c0183g = this.f1043g;
        if (this.f1012i == 0.0f) {
            this.f1012i = -1.0f;
            if (c0183g.f1111al != null) {
                c0183g.f1111al.m3448a(this.x, this.y, this.height, this.f1008az, this.source, null, false, this.f978aD + 1, this, null);
            }
        }
        this.lifeTimer = CommonUtils.toZero(this.lifeTimer, deltaSpeed);
        boolean z = false;
        if (this.f981aG) {
            if (this.target == null) {
                z = true;
            } else if (this.target.dead) {
                z = true;
            }
        }
        if (z) {
            m4042a(c0183g.f1168ax, c0183g.f1169ay, (ValueList) null);
        }
        if (c0183g.f1114az) {
            this.f980aF = CommonUtils.toZero(this.f980aF, deltaSpeed);
            if (this.f980aF == 0.0f) {
                this.f980aF = c0183g.f1170aA;
                m4042a(c0183g.f1171aB, c0183g.f1172aC, c0183g.f1090aD);
            }
        }
        if (c0183g.f1085R != 0.0f || c0183g.f1086S != 0.0f) {
            float f9 = c0183g.f1085R;
            if (this.target != null) {
                f9 += this.target.radius * c0183g.f1086S;
            }
            this.x = CommonUtils.sin(((360.0f * this.f964I) + (this.f965J * 1.0f)) % 360.0f) * f9;
            this.y = CommonUtils.sin(((360.0f * this.f964I) + (this.f965J * 1.5f)) % 360.0f) * f9;
        }
        if (this.f961E && this.target != null) {
            this.x = CommonUtils.sin((this.f965J * 1.0f) % 360.0f) * this.target.radius * 0.4f;
            this.y = CommonUtils.sin((this.f965J * 1.5f) % 360.0f) * this.target.radius * 0.4f;
            float x = this.target.x + this.x;
            float y = this.target.y + this.y;
            if (this.trailEffect) {
                this.trailEffect_delay += deltaSpeed;
                this.f985aO += deltaSpeed;
                if (this.trailEffect_delay > 11.0f) {
                    this.trailEffect_delay = CommonUtils.rnd(1.0f, 4.0f);
                    EffectObject effect = game.effects.emitEffect(x, y, this.target.height, EffectType.f4274a, false, EnumC0668h.f4398b);
                    if (effect != null) {
                        effect.stripIndex = 0;
                        effect.frameIndex = 0;
                        effect.drawLayer = (short) 2;
                        effect.fadeOut = true;
                        effect.startingAlpha = 0.5f;
                        effect.startTimer = 60.0f;
                        effect.timer = 60.0f;
                        effect.f4287H = 0.7f;
                        effect.f4286G = 0.3f;
                        effect.f4358ar = false;
                        effect.f4296Q = CommonUtils.rnd(-0.3f, 0.3f);
                        effect.ySpeed = (-0.9f) + CommonUtils.rnd(-0.3f, 0.3f);
                    }
                }
                if (this.f985aO > 75.0f) {
                    this.f985aO = CommonUtils.rnd(1.0f, 20.0f);
                    game.effects.emitSmalExplosion(x, y, this.target.height);
                }
            }
        }
        float f10 = 5.0f;
        boolean z2 = false;
        boolean z3 = false;
        if (!this.f977aC) {
            float f11 = this.target.x + this.x;
            float f12 = this.target.y + this.y;
            float f13 = this.target.height;
            f4 = CommonUtils.m1659d(this.x, this.y, f11, f12);
            f3 = CommonUtils.distanceSq(this.x, this.y, f11, f12);
            f = f13;
            f2 = f - this.height;
            f10 = this.target.radius;
            z2 = this.target instanceof Building;
            z3 = this.target.shield > 10.0f + this.directDamage;
        } else {
            float f14 = this.f1008az;
            if (this.f1019q != null) {
                float f15 = this.f1019q.x + this.x;
                float f16 = this.f1019q.y + this.y;
                float f17 = this.f1019q.height;
                f4 = CommonUtils.m1659d(this.x, this.y, f15, f16);
                f3 = CommonUtils.distanceSq(this.x, this.y, f15, f16);
                f = f17;
                f2 = f - this.height;
            } else if (this.target != null) {
                float f18 = this.target.x + this.x;
                float f19 = this.target.y + this.y;
                float f20 = this.target.height;
                f4 = CommonUtils.m1659d(this.x, this.y, f18, f19);
                f3 = CommonUtils.distanceSq(this.x, this.y, f18, f19);
                f = f20;
                f2 = f - this.height;
                f10 = this.target.radius;
                z2 = this.target instanceof Building;
                z3 = this.target.shield > 10.0f + this.directDamage;
            } else if (this.f1015m) {
                float f21 = this.f1016n + this.x;
                float f22 = this.f1017o + this.y;
                float f23 = this.f1018p;
                f4 = CommonUtils.m1659d(this.x, this.y, f21, f22);
                f3 = CommonUtils.distanceSq(this.x, this.y, f21, f22);
                f = f23;
                f2 = f - this.height;
            } else {
                float f24 = this.f1016n + this.x;
                float f25 = this.f1017o + this.y;
                f4 = CommonUtils.m1659d(this.x, this.y, f24, f25);
                f3 = CommonUtils.distanceSq(this.x, this.y, f24, f25);
                f = 0.0f;
                f2 = 0.0f - this.height;
            }
        }
        float f26 = c0183g.f1150O;
        if (f3 < 225.0f) {
            f26 = c0183g.f1151P;
        }
        if (f26 >= 0.0f) {
            this.f1008az += CommonUtils.m1670c(this.f1008az, f4, f26 * deltaSpeed);
            f4 = this.f1008az;
        } else {
            this.f1008az = f4;
        }
        boolean z4 = false;
        boolean z5 = false;
        float f27 = f4;
        if (this.f1004au != null && !this.f1004au.deleted) {
            if (this.f1068av >= 0) {
                OrderableUnit orderableUnit = (OrderableUnit) this.f1004au;
                if (this.f1068av >= orderableUnit.mo2512bk()) {
                    this.f1068av = 0;
                }
                C0918ai mo2666D = orderableUnit.mo2666D(this.f1068av);
                f8 = mo2666D.f6260a;
                f7 = mo2666D.f6261b;
                f6 = this.source.height + mo2666D.f6262c;
            } else {
                f8 = this.f1004au.x;
                f7 = this.f1004au.y;
                f6 = this.f1004au.height;
            }
            float f28 = f8 - this.f1005aw;
            float f29 = f7 - this.f1006ax;
            float f30 = f6 - this.f1007ay;
            this.x += f28;
            this.y += f29;
            this.height += f30;
            this.f1005aw = f8;
            this.f1006ax = f7;
            this.f1007ay = f6;
        }
        if (!this.f957A) {
            this.x += this.f1021u * deltaSpeed;
            this.y += this.f1022v * deltaSpeed;
            if (this.f1023w != 0.0f) {
                this.height += this.f1023w * deltaSpeed;
                f2 = f - this.height;
            }
            if (this.height > 0.0f) {
                if (c0183g.f1082G != 0.0f) {
                    this.height -= c0183g.f1082G * deltaSpeed;
                    f2 = f - this.height;
                }
                if (c0183g.f1083H != 0.0f) {
                    this.f1023w -= c0183g.f1083H * deltaSpeed;
                }
            }
            if (!this.f982aH || this.f1069aI < this.height || this.f1071aK) {
                float f31 = this.speed * deltaSpeed;
                z4 = true;
                if (f3 < f31 * f31) {
                    f31 = CommonUtils.m1746a(f3);
                    f3 = 0.0f;
                }
                this.x += CommonUtils.cos(f4) * f31;
                this.y += CommonUtils.sin(f4) * f31;
            }
            if (this.f982aH) {
                if (this.f1072aL < 0.0f) {
                    f5 = this.speed * deltaSpeed;
                    z4 = true;
                } else {
                    f5 = this.f1072aL * deltaSpeed;
                }
                if (!this.f1071aK) {
                    this.height = CommonUtils.m1744a(this.height, this.f1070aJ, f5);
                    if (this.height < this.f1069aI) {
                        f27 = -90.0f;
                    }
                    if (this.height >= this.f1070aJ) {
                        this.f1071aK = true;
                    }
                } else if (f3 < 400.0f) {
                    this.height = CommonUtils.m1744a(this.height, f, f5);
                    if (CommonUtils.absf(this.height - f) > 0.5f) {
                        f27 = 90.0f;
                        z5 = true;
                    }
                }
            } else {
                float f32 = f2;
                float f33 = this.speed * deltaSpeed;
                z4 = true;
                if (f32 != 0.0f) {
                    if (f3 > 0.1d) {
                        f33 = CommonUtils.m1693b((CommonUtils.absf(f32) / CommonUtils.m1746a(f3)) * this.speed * deltaSpeed, this.speed * deltaSpeed);
                    }
                    this.height += CommonUtils.m1693b(f2, f33);
                    f2 = f - this.height;
                }
            }
        }
        if (z4 && this.f1045r > 0.0f) {
            this.speed = CommonUtils.m1744a(this.speed, this.f1045r, this.f1046s * deltaSpeed);
        }
        if (c0183g.f1112am != 0.0f) {
            float sin = CommonUtils.sin((((this.f965J * 360.0f) / c0183g.f1159an) + (360.0f * this.f964I)) % 360.0f) * c0183g.f1112am * deltaSpeed;
            this.x += CommonUtils.cos(f4 + 90.0f) * sin;
            this.y += CommonUtils.sin(f4 + 90.0f) * sin;
        }
        if (this.trailEffect && ((this.f983aM || c0183g.f1107ah != null) && !this.f1010bn)) {
            this.trailEffect_delay += deltaSpeed;
            if (this.trailEffect_delay > c0183g.f1158ag) {
                this.trailEffect_delay = 0.0f;
                boolean z6 = false;
                if (this.f960D) {
                    z6 = true;
                }
                if (c0183g.f1107ah != null) {
                    c0183g.f1107ah.m3043a(this.x, this.y, this.height, this.f1074aT, this);
                }
                if (this.f983aM && (emitEffect = game.effects.emitEffect(this.x, this.y, this.height, EffectType.f4274a, z6, EnumC0668h.f4398b)) != null) {
                    if (this.height >= 0.0f) {
                        emitEffect.stripIndex = 0;
                        emitEffect.frameIndex = 0;
                        emitEffect.drawLayer = (short) 2;
                        emitEffect.fadeOut = true;
                        emitEffect.startingAlpha = 0.5f;
                        emitEffect.timer = 70.0f;
                        emitEffect.startTimer = emitEffect.timer;
                        emitEffect.f4358ar = true;
                        if (z5) {
                            emitEffect.f4358ar = false;
                        }
                        emitEffect.ySpeed = 0.1f;
                        emitEffect.f4332t = true;
                        emitEffect.f4333u = 5.0f;
                        emitEffect.f4287H = 0.5f;
                        emitEffect.f4286G = 1.2f;
                        emitEffect.f4304Y = CommonUtils.rnd(-180.0f, 180.0f);
                        if (this.f960D) {
                            emitEffect.f4287H = 0.5f;
                            emitEffect.f4286G = 2.1f;
                        }
                    } else {
                        emitEffect.stripIndex = 9;
                        emitEffect.frameIndex = 1;
                        emitEffect.drawLayer = (short) 1;
                        emitEffect.fadeOut = true;
                        emitEffect.startingAlpha = 0.5f;
                        emitEffect.startTimer = 60.0f;
                        emitEffect.timer = 60.0f;
                        emitEffect.ySpeed = 0.1f;
                    }
                }
            }
        }
        if (!this.f1010bn) {
            boolean z7 = false;
            Unit unit = null;
            boolean z8 = false;
            float f34 = 6.0f;
            if (z2) {
                f34 = f10 * 0.8f;
                if (f34 < 6.0f) {
                    f34 = 6.0f;
                }
            }
            if (z3) {
                f34 = f10 * 1.1f;
            }
            float f35 = 3.0f;
            if (this.f1023w != 0.0f || c0183g.f1082G != 0.0f) {
                f35 = 3.0f + CommonUtils.absf(this.f1023w * deltaSpeed) + CommonUtils.absf(c0183g.f1082G * deltaSpeed);
            }
            if (f3 < f34 * f34 && CommonUtils.absf(f2) < f35) {
                z7 = true;
                unit = this.target;
            }
            if (this.f957A) {
                z7 = true;
                unit = this.target;
            }
            if (this.f996af && this.lifeTimer == 0.0f) {
                z7 = true;
            }
            if (this.f1002as) {
                float f36 = this.f975aA + 50.0f;
                Unit[] m485a = Unit.fastUnitList.m485a();
                int size = Unit.fastUnitList.size();
                for (int i = 0; i < size; i++) {
                    Unit unit2 = m485a[i];
                    if (unit2.x + f36 > this.x && unit2.x - f36 < this.x && unit2.y + f36 > this.y && unit2.y - f36 < this.y && unit2.collidable && false == unit2.mo2676i() && unit2.transportedBy == null) {
                        float distanceSq = CommonUtils.distanceSq(this.x, this.y, unit2.x, unit2.y);
                        float f37 = this.f975aA + unit2.radius;
                        if (distanceSq < f37 * f37) {
                            z7 = true;
                            unit = unit2;
                        }
                    }
                }
            }
            if (this.f1003at) {
                game.map.m4168a(this.x, this.y);
                if (game.PathEngine.m1103a(MovementType.f1648f, game.map.returnX, game.map.returnY)) {
                    z7 = true;
                    z8 = true;
                }
            }
            if (this.f977aC) {
            }
            if (this.f993aY && (((this.f982aH && z5 && this.height < 30.0f) || z7) && this.source != null)) {
                this.f993aY = false;
                FogRevealer fogRevealer = new FogRevealer(false);
                fogRevealer.x = this.x;
                fogRevealer.y = this.y;
                fogRevealer.mo2537b(this.source.team);
                fogRevealer.f3669a = 15;
                fogRevealer.f3670b = 360.0f;
                Team.m3924c(fogRevealer);
            }
            if (z7) {
                this.f1010bn = true;
                this.f990aV = this.x;
                this.f991aW = this.y;
                this.f992aX = this.height;
                if (this.f957A) {
                    if (this.f977aC) {
                        this.f990aV = this.f1016n;
                        this.f991aW = this.f1017o;
                        this.f992aX = 0.0f;
                    }
                    if (this.target != null) {
                        this.f990aV = this.target.x + this.x;
                        this.f991aW = this.target.y + this.y;
                        this.f992aX = this.target.height;
                    }
                }
                if (!this.f958B && !this.f968M && !c0183g.f1155X) {
                    this.visible = false;
                }
                boolean z9 = false;
                if (this.target != null) {
                    z9 = this.target.shield > 10.0f;
                }
                C0449y c0449y = c0183g.f1100aX;
                if (z9) {
                    c0449y = c0183g.f1101aY;
                }
                if (this.target != null && (m4025a = c0183g.m4025a(this.target)) != null) {
                    c0449y = m4025a;
                }
                if (c0449y != null) {
                    c0449y.m3043a(this.f990aV, this.f991aW, this.f992aX, this.f1074aT, this.target);
                }
                if (c0183g.f1109aj != null) {
                    c0183g.f1109aj.m3448a(this.x, this.y, this.height, this.f1008az, this.source, null, false, this.f978aD + 1, this, this.target);
                }
                if (c0183g.f1102aZ != null && this.source != null) {
                    c0183g.f1102aZ.m3433a(this.f990aV, this.f991aW, 0.0f, this.f1008az, this.source.team, false, this.source);
                }
                if (c0183g.f1116ba > 0 && this.source != null && (this.source instanceof C0433j)) {
                    C0433j c0433j = (C0433j) this.source;
                    for (int i2 = 0; i2 < c0183g.f1116ba; i2++) {
                        if (c0433j.f2718A != null && c0433j.f2718A.size() > 0) {
                            Unit unit3 = (Unit) c0433j.f2718A.remove(c0433j.f2718A.size() - 1);
                            C0955y.m451a(unit3, c0433j);
                            unit3.x = this.f990aV;
                            unit3.y = this.f991aW;
                            unit3.direction = this.f1008az;
                            unit3.f1615bU = 0.0f;
                            unit3.f1614bT = 0.0f;
                            unit3.f1611bQ = 0.0f;
                            unit3.f1612bR = 0.0f;
                            if (unit3 instanceof OrderableUnit) {
                                OrderableUnit orderableUnit2 = (OrderableUnit) unit3;
                                orderableUnit2.m2545ay();
                                orderableUnit2.m2467j(unit3.direction);
                                if (unit3 instanceof C0433j) {
                                    ((C0433j) unit3).m3172dA();
                                }
                            }
                            c0433j.m3230F(unit3);
                        }
                    }
                }
                if (c0183g.f1117bb && this.source != null) {
                    this.source.x = this.f990aV;
                    this.source.y = this.f991aW;
                    this.source.mo2491c(true);
                    if (this.source instanceof C0433j) {
                        ((C0433j) this.source).m3776a(EnumC0334ad.f2111h);
                    }
                }
                if (!z8 && unit != null) {
                    if (this.f961E) {
                        this.f1010bn = false;
                        float m4028e = (this.directDamage / 60.0f) * deltaSpeed * m4028e();
                        if (this.f974Z == 0.0f) {
                            m4038a(unit);
                        }
                        damageUnit(this.source, unit, c0183g.m4024a(unit, m4028e, true), this, false);
                    } else {
                        if (this.f974Z == 0.0f) {
                            m4038a(unit);
                        }
                        damageUnit(this.source, unit, c0183g.m4024a(unit, this.directDamage, false), this, false);
                    }
                }
                if (this.f1019q != null) {
                    if (c0183g.f1121d) {
                        this.f1019q.lifeTimer = 0.0f;
                    } else {
                        this.f1019q.m4033b();
                    }
                    remove();
                }
                if (!this.f961E) {
                    boolean z10 = true;
                    if (this.target != null && this.target.shield > 10.0f) {
                        z10 = false;
                        if (c0183g.f1101aY == null && (m2205d2 = game.effects.m2205d(this.f990aV, this.f991aW, this.f992aX, -1127220)) != null) {
                            m2205d2.timer = 10.0f;
                            m2205d2.f4286G = 0.5f;
                            if (this.f987aQ) {
                                m2205d2.timer = 25.0f;
                                m2205d2.f4286G = 1.0f;
                            }
                            m2205d2.drawLayer = (short) 2;
                            m2205d2.startTimer = m2205d2.timer;
                        }
                    }
                    if (this.f963G) {
                        z10 = false;
                        Emitter.m2191b(this.x, this.y).f4362a = 21.0f;
                    }
                    if (z10) {
                        if (!this.f987aQ) {
                            if (c0183g.f1100aX == null) {
                                game.effects.m2209c(this.f990aV, this.f991aW, this.f992aX);
                            }
                        } else if (c0183g.f1100aX == null) {
                            if (this.f974Z > 10.0f && (m2205d = game.effects.m2205d(this.f990aV, this.f991aW, this.f992aX, 0)) != null) {
                                m2205d.f4286G = this.f974Z / 25.0f;
                                m2205d.startingAlpha = 0.7f;
                                if (this.f992aX > 5.0f) {
                                    m2205d.drawLayer = (short) 2;
                                }
                            }
                            game.effects.emitSmalExplosion(this.f990aV, this.f991aW, this.f992aX);
                            if (this.f1073aR && !this.f960D) {
                                game.audio.m2416a(AudioEngine.f3868n, 0.5f, 1.0f + CommonUtils.rnd(-0.06f, 0.06f), this.f990aV, this.f991aW);
                            }
                        }
                        if (this.f960D && c0183g.f1100aX == null) {
                            game.audio.m2416a(AudioEngine.f3853C, 1.6f, 0.7f, this.f990aV, this.f991aW);
                            game.effects.m2210b(EnumC0668h.f4401e);
                            EffectObject emitLight = game.effects.emitLight(this.f990aV, this.f991aW, this.height, Color.argb(255, 255, 255, 255));
                            if (emitLight != null) {
                                emitLight.f4287H = 14.0f;
                                emitLight.f4286G = 8.0f;
                                emitLight.startingAlpha = 0.9f;
                                emitLight.timer = 35.0f;
                                emitLight.startTimer = emitLight.timer;
                                emitLight.fadeOut = true;
                            }
                            game.effects.m2210b(EnumC0668h.f4401e);
                            EffectObject m2207c = game.effects.m2207c(this.f990aV, this.f991aW, this.f992aX, -1127220);
                            if (m2207c != null) {
                                m2207c.f4287H = 1.5f;
                                m2207c.f4286G = 3.0f;
                                m2207c.drawLayer = (short) 2;
                                m2207c.timer = 20.0f;
                                m2207c.startTimer = m2207c.timer;
                                m2207c.f4301V = 0.0f;
                            }
                            game.effects.m2210b(EnumC0668h.f4401e);
                            EffectObject m2207c2 = game.effects.m2207c(this.f990aV, this.f991aW, this.f992aX, -1127220);
                            if (m2207c2 != null) {
                                m2207c2.f4287H = 0.2f;
                                m2207c2.f4286G = 5.0f;
                                m2207c2.drawLayer = (short) 2;
                                m2207c2.timer = 65.0f;
                                m2207c2.startTimer = m2207c2.timer;
                                m2207c2.f4301V = 0.0f;
                            }
                            game.effects.m2210b(EnumC0668h.f4401e);
                            EffectObject emitLight2 = game.effects.emitLight(this.f990aV, this.f991aW, this.height, Color.argb(255, 255, 255, 255));
                            if (emitLight2 != null) {
                                emitLight2.f4287H = 3.0f;
                                emitLight2.f4286G = 6.0f;
                                emitLight2.startingAlpha = 0.9f;
                                emitLight2.timer = 290.0f;
                                emitLight2.startTimer = emitLight2.timer;
                            }
                            game.effects.m2210b(EnumC0668h.f4401e);
                            EffectObject emitLight3 = game.effects.emitLight(this.f990aV, this.f991aW, this.height, Color.argb(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                            if (emitLight3 != null) {
                                emitLight3.f4287H = 2.0f;
                                emitLight3.f4286G = 6.0f;
                                emitLight3.startingAlpha = 0.5f;
                                emitLight3.timer = 370.0f;
                                emitLight3.startTimer = emitLight3.timer;
                                emitLight3.f4301V = 10.0f;
                            }
                            for (int i3 = 0; i3 < 1; i3++) {
                                game.effects.m2210b(EnumC0668h.f4401e);
                                EffectObject emitLight4 = game.effects.emitLight(this.f990aV, this.f991aW, this.height, Color.argb(255, 255, 244, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_DATA_SERVICE));
                                if (emitLight4 != null) {
                                    emitLight4.f4287H = 0.2f;
                                    emitLight4.f4286G = 9.0f;
                                    emitLight4.startingAlpha = 0.7f;
                                    emitLight4.timer = 210.0f;
                                    emitLight4.startTimer = emitLight4.timer;
                                    emitLight4.f4301V = 20 + (i3 * 110);
                                }
                            }
                            game.effects.m2210b(EnumC0668h.f4401e);
                            EffectObject emitLight5 = game.effects.emitLight(this.f990aV, this.f991aW, this.height, Color.argb(255, 255, 255, 255));
                            if (emitLight5 != null) {
                                emitLight5.f4287H = 3.0f;
                                emitLight5.f4286G = 4.0f;
                                emitLight5.startingAlpha = 0.2f;
                                emitLight5.timer = 870.0f;
                                emitLight5.startTimer = emitLight5.timer;
                                emitLight5.fadeOut = true;
                                emitLight5.f4301V = 70.0f;
                            }
                            game.effects.m2210b(EnumC0668h.f4401e);
                            EffectObject emitLight6 = game.effects.emitLight(this.f990aV, this.f991aW, this.height, Color.argb(255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_3D_MODE, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_SATELLITE_CS));
                            if (emitLight6 != null) {
                                emitLight6.f4287H = 4.0f;
                                emitLight6.f4286G = 1.0f;
                                emitLight6.startingAlpha = 0.9f;
                                emitLight6.timer = 320.0f;
                                emitLight6.startTimer = emitLight6.timer;
                            }
                            game.effects.m2210b(EnumC0668h.f4401e);
                            EffectObject emitLight7 = game.effects.emitLight(this.f990aV, this.f991aW, this.height, Color.argb(255, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                            if (emitLight7 != null) {
                                emitLight7.f4287H = 2.0f;
                                emitLight7.f4286G = 1.0f;
                                emitLight7.startingAlpha = 1.0f;
                                emitLight7.timer = 340.0f;
                                emitLight7.startTimer = emitLight7.timer;
                                emitLight7.f4332t = true;
                                emitLight7.f4333u = 20.0f;
                            }
                            game.effects.m2210b(EnumC0668h.f4401e);
                            EffectObject emitLight8 = game.effects.emitLight(this.f990aV, this.f991aW, this.height, Color.argb(245, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_AVR_INPUT, 110));
                            if (emitLight8 != null) {
                                emitLight8.f4287H = 1.5f;
                                emitLight8.f4286G = 1.5f;
                                emitLight8.startingAlpha = 0.3f;
                                emitLight8.timer = 1340.0f;
                                emitLight8.startTimer = emitLight8.timer;
                                emitLight8.f4332t = true;
                                emitLight8.f4333u = 40.0f;
                                emitLight8.f4301V = 140.0f;
                            }
                            for (int i4 = 0; i4 < 4; i4++) {
                                game.effects.m2210b(EnumC0668h.f4401e);
                                EffectObject emitLight9 = game.effects.emitLight(this.f990aV, this.f991aW, this.height, Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PAIRING, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                if (emitLight9 != null) {
                                    emitLight9.f4287H = 1.5f;
                                    emitLight9.f4286G = 1.4f;
                                    emitLight9.startingAlpha = 1.3f;
                                    emitLight9.timer = 340.0f;
                                    emitLight9.startTimer = emitLight9.timer;
                                    emitLight9.ySpeed = -0.29f;
                                    emitLight9.f4332t = true;
                                    emitLight9.f4333u = 50.0f;
                                    emitLight9.f4301V = 30 + (i4 * 40);
                                }
                            }
                            for (int i5 = 0; i5 < 2; i5++) {
                                game.effects.m2210b(EnumC0668h.f4401e);
                                EffectObject emitLight10 = game.effects.emitLight(this.f990aV, this.f991aW, this.height, Color.argb(SlickToAndroidKeycodes.AndroidCodes.KEYCODE_PROG_YELLOW, 255, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_ANTENNA_CABLE, 129));
                                if (emitLight10 != null) {
                                    emitLight10.f4287H = 1.3f;
                                    emitLight10.f4286G = 1.0f;
                                    emitLight10.startingAlpha = 1.0f;
                                    emitLight10.timer = 340.0f;
                                    emitLight10.startTimer = emitLight10.timer;
                                    emitLight10.ySpeed = -0.14f;
                                    emitLight10.f4332t = true;
                                    emitLight10.f4333u = 50.0f;
                                    emitLight10.f4301V = 70 + (i5 * 70);
                                }
                            }
                            for (int i6 = 0; i6 < 4; i6++) {
                                game.effects.m2210b(EnumC0668h.f4401e);
                                EffectObject emitLight11 = game.effects.emitLight(this.f990aV, this.f991aW - 30.0f, this.height, -16711936);
                                if (emitLight11 != null) {
                                    emitLight11.f4287H = 1.5f;
                                    emitLight11.f4286G = 2.6f;
                                    emitLight11.startingAlpha = 1.3f;
                                    emitLight11.timer = 510.0f;
                                    emitLight11.startTimer = emitLight11.timer;
                                    emitLight11.ySpeed = -0.2f;
                                    emitLight11.f4332t = true;
                                    emitLight11.f4333u = 50.0f;
                                    emitLight11.lightingColorFilter = null;
                                    emitLight11.f4336y = Color.argb(175, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG);
                                    emitLight11.f4301V = 20 + (i6 * 40);
                                }
                            }
                            for (int i7 = 0; i7 < 2; i7++) {
                                game.effects.m2210b(EnumC0668h.f4401e);
                                EffectObject emitLight12 = game.effects.emitLight(this.f990aV, this.f991aW - 30.0f, this.height, -16711936);
                                if (emitLight12 != null) {
                                    emitLight12.f4287H = 1.5f;
                                    emitLight12.f4286G = 3.8f;
                                    emitLight12.startingAlpha = 0.8f;
                                    emitLight12.timer = 590.0f;
                                    emitLight12.startTimer = emitLight12.timer;
                                    emitLight12.ySpeed = -0.2f;
                                    emitLight12.f4332t = true;
                                    emitLight12.f4333u = 50.0f;
                                    emitLight12.lightingColorFilter = null;
                                    emitLight12.f4336y = Color.argb(105, 115, 115, 115);
                                    emitLight12.f4301V = 20 + (i7 * 40);
                                }
                            }
                            for (int i8 = 0; i8 < 1; i8++) {
                                Emitter m2195a = Emitter.m2195a(this.f990aV + CommonUtils.m1741a(-10.0f, 10.0f, (int) this.GameObjectID), this.f991aW + CommonUtils.m1741a(-10.0f, 10.0f, ((int) this.GameObjectID) + i8));
                                if (m2195a != null) {
                                    m2195a.f4377t = 200 + (i8 * 70);
                                    m2195a.f4362a = 980 + (i8 * 800);
                                }
                            }
                            if (!C0955y.m436d(this.f990aV, this.f991aW)) {
                                ScorchMark.m3994a(this.f990aV, this.f991aW, NukeNormal.f1281b);
                            }
                            if (game.f5968dd) {
                                if (game.effects.f4258m == null) {
                                    game.effects.f4258m = game.graphics.loadImage(R.drawable.shockwave_normal_128, true);
                                }
                                game.effects.m2210b(EnumC0668h.f4401e);
                                EffectObject emitLight13 = game.effects.emitLight(this.f990aV, this.f991aW, this.height, -1);
                                if (emitLight13 != null && game.effects.f4258m != null) {
                                    emitLight13.f4348a = new Effect((EnumC0370aw) null);
                                    emitLight13.f4348a.imageStrip = new ImageStrip();
                                    emitLight13.f4348a.imageStrip.f4396k = true;
                                    emitLight13.f4348a.imageStrip.image = game.effects.f4258m;
                                    emitLight13.f4348a.imageStrip.tileWidth = emitLight13.f4348a.imageStrip.image.getWidth();
                                    emitLight13.f4348a.imageStrip.tileHeight = emitLight13.f4348a.imageStrip.image.getHeight();
                                    emitLight13.drawLayer = (short) 101;
                                    emitLight13.f4287H = 1.0f;
                                    emitLight13.f4286G = 7.0f;
                                    emitLight13.startingAlpha = 0.5f;
                                    emitLight13.timer = 60.0f;
                                    emitLight13.startTimer = emitLight13.timer;
                                    emitLight13.ySpeed = -0.2f;
                                    emitLight13.f4332t = true;
                                    emitLight13.f4333u = 1.0f;
                                    emitLight13.lightingColorFilter = null;
                                    emitLight13.f4301V = 0.0f;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (this.f1010bn && !this.f1055V) {
            this.f1056W = CommonUtils.toZero(this.f1056W, deltaSpeed);
            if (this.f1000ao) {
                m4032b(1.0f - (this.f1056W / this.f1057X));
            }
            if (this.f1056W == 0.0f) {
                this.f1055V = true;
                m4032b(1.0f);
                if (!this.f958B && !this.f968M && !c0183g.f1155X) {
                    remove();
                }
            }
        }
        this.f965J += deltaSpeed;
        if (this.lifeTimer == 0.0f && (!this.f1010bn || this.f1055V)) {
            if (c0183g.f1110ak != null) {
                c0183g.f1110ak.m3448a(this.x, this.y, this.height, this.f1008az, this.source, null, false, this.f978aD + 1, this, null);
            }
            remove();
        }
        if (!this.f989aU) {
            this.f1074aT = f27;
            this.f989aU = true;
        }
        this.f1074aT += CommonUtils.m1670c(this.f1074aT, f27, 12.0f * deltaSpeed);
    }

    /* renamed from: b */
    public void m4032b(float f) {
        boolean z = false;
        if (this.f1043g.f1123f) {
            return;
        }
        if (this.f1043g.f1122e) {
            z = true;
        }
        if (!z) {
            if (this.f973Y != 0.0f && this.f974Z > 0.0f) {
                z = true;
            }
            if ((this.f997ag != 0.0f || this.f998ah != 0.0f) && this.f974Z > 0.0f) {
                z = true;
            }
        }
        if (!z) {
            return;
        }
        float f2 = this.f974Z * f;
        float f3 = f2;
        if (this.f1043g.f1125h) {
            f3 += 150.0f;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        f1040bi.clear();
        gameEngine.UnitGeoIndex.m2777b(this.f990aV, this.f991aW, f3, f1040bi);
        Unit[] m485a = f1040bi.m485a();
        int size = f1040bi.size();
        for (int i = 0; i < size; i++) {
            m4031b(m485a[i], f, f2);
        }
        f1040bi.clear();
    }

    /* renamed from: b */
    public void m4031b(Unit unit, float f, float f2) {
        if (unit.transportedBy != null) {
            return;
        }
        if (this.f1001ap != null && this.f1001ap.contains(unit)) {
            return;
        }
        if (this.source != null) {
            Team team = this.source.team;
            Team team2 = unit.team;
            if (team2 != team && team.m3913d(team2)) {
                return;
            }
            if (this.f995aa && !team.m3925c(team2)) {
                return;
            }
            if (this.f1058ab && team.m3925c(team2)) {
                return;
            }
        }
        if (unit.height < -5.0f && this.f992aX >= -2.0f && !this.f1059ac) {
            return;
        }
        if (this.f1061ae) {
            if (unit.mo2676i() != (this.f992aX >= 5.0f)) {
                return;
            }
        } else if (!this.f1060ad && unit.mo2676i()) {
            return;
        }
        float distanceSq = CommonUtils.distanceSq(this.f990aV, this.f991aW, unit.x, unit.y);
        if (distanceSq > f2 * f2 && !this.f1043g.f1125h) {
            return;
        }
        float sqrt = (float) StrictMath.sqrt(distanceSq);
        if (this.f1043g.f1125h) {
            sqrt -= unit.radius;
            if (sqrt < 0.0f) {
                sqrt = 0.0f;
            }
        }
        if (sqrt > f2 || sqrt < this.f1043g.f1130j) {
            return;
        }
        m4041a(f, unit, sqrt);
    }

    /* renamed from: a */
    public void m4041a(float f, Unit unit, float f2) {
        float f3 = (float) ((1.0f - (f2 / this.f974Z)) + 0.1d);
        if (f3 > 1.0f) {
            f3 = 1.0f;
        }
        if (this.f1043g.f1124g) {
            f3 = 1.0f;
        }
        float f4 = f3 * this.f973Y;
        m4038a(unit);
        damageUnit(this.source, unit, this.f1043g.m4024a(unit, f4, true), this, true);
        if (this.f1000ao) {
            if (this.f1001ap == null) {
                this.f1001ap = new ObjectVector();
            }
            this.f1001ap.add(unit);
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public boolean mo426a(GameEngine gameEngine) {
        if (gameEngine.f5959cN.m4646b(this.x, this.y)) {
            return true;
        }
        if ((this.f958B || this.f961E || this.f1043g.f1155X) && this.target != null && gameEngine.f5959cN.m4646b(this.target.x, this.target.y)) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        float f2;
        float f3;
        float f4;
        if (!this.visible || this.f1012i > 0.0f) {
            return false;
        }
        C0183g c0183g = this.f1043g;
        GameEngine game = GameEngine.getInstance();
        Graphics graphics = game.graphics;
        float drawX = this.x - game.viewpointX_rounded;
        float drawY = this.y - game.viewpointY_rounded;
        if (this.target != null) {
            f4 = this.target.x;
            f3 = this.target.y;
            f2 = this.target.height;
        } else {
            f4 = this.f1016n;
            f3 = this.f1017o;
            f2 = this.f1018p;
        }
        if (!this.f994aZ && !this.f960D) {
            boolean z = false;
            if (this.f957A) {
                if (this.target != null) {
                    if (!game.map.m4166a(this.target.x, this.target.y, game.playerTeam)) {
                        z = true;
                    }
                } else if (this.f1015m && !game.map.m4166a(this.f1016n, this.f1017o, game.playerTeam)) {
                    z = true;
                }
            }
            if (!game.map.m4166a(this.x, this.y, game.playerTeam) && !z) {
                return false;
            }
            this.f994aZ = true;
        }
        if (this.f961E || c0183g.f1155X) {
            if (c0183g.f1088Y != null) {
                Paint m4027f = m4027f();
                float f5 = 0.0f;
                if (c0183g.f1106ad != 0.0f) {
                    f5 = 0.0f + (c0183g.f1106ad * this.f965J);
                }
                float f6 = this.x - game.viewpointX_rounded;
                float f7 = (this.y - game.viewpointY_rounded) - this.height;
                float f8 = (f4 - game.viewpointX_rounded) + this.x;
                float f9 = ((f3 - f2) - game.viewpointY_rounded) + this.y;
                float f10 = (f8 + f6) * 0.5f;
                float f11 = (f9 + f7) * 0.5f;
                float m1691b = CommonUtils.m1691b(f10, f11, f8, f9);
                float m1659d = CommonUtils.m1659d(f10, f11, f8, f9);
                graphics.mo135j();
                f1030f.m4652a(f10 - c0183g.f1088Y.f5668q, f11 - m1691b, f10 + c0183g.f1088Y.f5668q, f11 + m1691b);
                graphics.mo223a(m1659d + 90.0f, f10, f11);
                graphics.mo189a(c0183g.f1088Y, f1030f, m4027f, 0.0f, f5, 0, 0);
                graphics.mo134k();
                if (c0183g.f1089Z != null) {
                    if (c0183g.f1103aa) {
                        graphics.mo135j();
                        graphics.mo223a(m1659d + 90.0f, f6, f7);
                        graphics.mo196a(c0183g.f1089Z, f6, f7, m4027f);
                        graphics.mo134k();
                    } else {
                        graphics.mo196a(c0183g.f1089Z, f6, f7, m4027f);
                    }
                }
                if (c0183g.f1104ab != null) {
                    if (c0183g.f1105ac) {
                        graphics.mo135j();
                        graphics.mo223a(m1659d + 90.0f, f8, f9);
                        graphics.mo196a(c0183g.f1104ab, f8, f9, m4027f);
                        graphics.mo134k();
                        return true;
                    }
                    graphics.mo196a(c0183g.f1104ab, f8, f9, m4027f);
                    return true;
                }
                return true;
            }
            f1036bf.setAlpha((int) (60.0f + (m4028e() * 60.0f)));
            float f12 = (f4 - game.viewpointX_rounded) + this.x;
            float f13 = ((f3 - f2) - game.viewpointY_rounded) + this.y;
            f1036bf.setStrokeWidth(6.0f);
            graphics.mo221a(this.x - game.viewpointX_rounded, (this.y - game.viewpointY_rounded) - this.height, f12, f13, f1036bf);
            f1036bf.setStrokeWidth(3.0f);
            graphics.mo221a(this.x - game.viewpointX_rounded, (this.y - game.viewpointY_rounded) - this.height, f12, f13, f1036bf);
            graphics.mo219a(f12, f13, 8.0f, f1036bf);
            graphics.mo219a(f12, f13, 5.0f, f1036bf);
            return true;
        } else if (this.f958B) {
            float f14 = (f4 - game.viewpointX_rounded) + this.x;
            float f15 = ((f3 - f2) - game.viewpointY_rounded) + this.y;
            f1034bd.setColor(this.color);
            f1035be.setColor(this.color);
            f1035be.setAlpha((int) (f1035be.m4684f() * 0.5f));
            graphics.mo221a(this.x - game.viewpointX_rounded, (this.y - game.viewpointY_rounded) - this.height, f14, f15, f1035be);
            graphics.mo221a(this.x - game.viewpointX_rounded, (this.y - game.viewpointY_rounded) - this.height, f14, f15, f1034bd);
            graphics.mo219a(f14, f15, 5.0f, f1034bd);
            return true;
        } else if (this.f968M) {
            this.f969N = CommonUtils.toZero(this.f969N, f);
            if (this.f970O == null) {
                this.f970O = new float[20];
                this.f969N = 0.0f;
            }
            if (this.f969N == 0.0f) {
                this.f969N = 4.0f;
                for (int i = 0; i < this.f970O.length; i++) {
                    this.f970O[i] = CommonUtils.rnd(-10.0f, 10.0f);
                }
            }
            float f16 = this.x - game.viewpointX_rounded;
            float f17 = (this.y - game.viewpointY_rounded) - this.height;
            float f18 = f4 - game.viewpointX_rounded;
            float f19 = (f3 - f2) - game.viewpointY_rounded;
            float m1669c = CommonUtils.m1669c(f16, f17, f18, f19);
            int length = this.f970O.length;
            if (m1669c < 200.0f) {
                length = CommonUtils.maxi(0, length - 5);
            } else if (m1669c < 100.0f) {
                length = CommonUtils.maxi(0, length - 10);
            }
            float f20 = m1669c / (length - 1);
            float m1659d2 = CommonUtils.m1659d(f16, f17, f18, f19);
            float f21 = f16;
            float f22 = f17;
            float cos = CommonUtils.cos(m1659d2);
            float sin = CommonUtils.sin(m1659d2);
            for (int i2 = 0; i2 < length; i2++) {
                float f23 = this.f970O[i2];
                float f24 = f16 + (cos * i2 * f20);
                float f25 = f17 + (sin * i2 * f20);
                if (i2 != length - 1) {
                    f24 -= sin * f23;
                    f25 += cos * f23;
                }
                graphics.mo221a(f21, f22, f24, f25, f1037bg);
                f21 = f24;
                f22 = f25;
            }
            return true;
        } else if (this.f1051P != -1) {
            BitmapOrTexture bitmapOrTexture = f1026b;
            int i3 = 20;
            int i4 = 20;
            if (this.f1053R == 1) {
                bitmapOrTexture = f1028d;
                i3 = 60;
                i4 = 60;
            } else if (this.f1053R == 2) {
                bitmapOrTexture = f1027c;
                i3 = 20;
                i4 = 20;
            }
            if (c0183g.f1078C != null) {
                C0955y.m446a(c0183g.f1078C, drawX, drawY, 0.0f, this.f1074aT, this.f1047x, f1039bc, c0183g.f1078C.width, c0183g.f1078C.height, 0);
            } else if (this.f1052Q != -1 && this.f1049z) {
                C0955y.m446a(bitmapOrTexture, drawX, drawY, 0.0f, this.f1074aT, this.f1047x, f1039bc, i3, i4, this.f1052Q);
            }
            if (c0183g.f1077B != null) {
                bitmapOrTexture = c0183g.f1077B;
                i3 = c0183g.f1077B.width;
                i4 = c0183g.f1077B.height;
            }
            C0955y.m446a(bitmapOrTexture, drawX, drawY, this.height, this.f1074aT, this.f1047x, m4027f(), i3, i4, this.f1051P);
            return true;
        } else {
            f1033bb.setColor(this.color);
            if (this.height > 0.0f && this.f1049z) {
                graphics.mo219a(drawX, drawY, this.f1047x, f1039bc);
            }
            graphics.mo219a(drawX, drawY - this.height, this.f1047x, f1033bb);
            if (this.f1048y > 0.0f) {
                f1033bb.setAlpha(f1033bb.m4684f() / 3);
                graphics.mo219a(drawX, drawY - this.height, this.f1048y, f1033bb);
                return true;
            }
            return true;
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo431a(float f, boolean z) {
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: d */
    public void mo423d(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: e */
    public void mo420e(float f) {
    }

    @Override // com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: f */
    public boolean mo419f(float f) {
        return false;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v5, types: [android.graphics.Paint] */
    /* renamed from: f */
    public Paint m4027f() {
        UniquePaint uniquePaint;
        if (this.color != f1031aq) {
            if (GameEngine.isNonDedicatedServer()) {
                uniquePaint = m4040a(this.color);
            } else {
                uniquePaint = f1033bb;
                uniquePaint.setColor(this.color);
            }
        } else {
            uniquePaint = f1032ba;
        }
        return uniquePaint;
    }

    /* renamed from: a */
    public UniquePaint m4040a(int i) {
        if (this.f1009bj != null) {
            return this.f1009bj;
        }
        if (f1041bk != null && f1042bl == i) {
            this.f1009bj = f1041bk;
            return this.f1009bj;
        }
        UniquePaint uniquePaint = new UniquePaint();
        uniquePaint.m4715a(new LightingColorFilter(i, 0));
        uniquePaint.setColor(i);
        f1041bk = uniquePaint;
        f1042bl = i;
        this.f1009bj = uniquePaint;
        return this.f1009bj;
    }

    /* renamed from: a */
    public void m4042a(float f, float f2, ValueList valueList) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.source == null) {
            GameEngine.log("Projectile: cannot Retarget: source==null");
            return;
        }
        float cos = this.x + (CommonUtils.cos(this.f1008az) * f2);
        float sin = this.y + (CommonUtils.sin(this.f1008az) * f2);
        float f3 = f * f;
        float f4 = -1.0f;
        OrderableUnit orderableUnit = null;
        Unit unit = null;
        if (this.source instanceof OrderableUnit) {
            orderableUnit = (OrderableUnit) this.source;
            unit = orderableUnit.m2569aa();
        }
        Iterator it = gameEngine.UnitGeoIndex.m2787a(cos, sin, f).iterator();
        while (it.hasNext()) {
            Unit unit2 = (Unit) it.next();
            if (this.source.team != unit2.team) {
                boolean z = true;
                if (orderableUnit != null) {
                    z = orderableUnit.m2534b(unit2, true);
                }
                if (z && this.f1044k >= 0 && orderableUnit != null && this.f1044k < orderableUnit.mo2512bk() && !orderableUnit.mo2625a((int) this.f1044k, unit2, true, false)) {
                    z = false;
                }
                if (valueList != null && !ValueListSource.m3248a(valueList, unit2.mo3167da())) {
                    z = false;
                }
                if (z) {
                    float distanceSq = CommonUtils.distanceSq(cos, sin, unit2.x, unit2.y);
                    boolean z2 = false;
                    if (f4 == -1.0f || distanceSq < f4) {
                        z2 = true;
                    }
                    if (unit == unit2) {
                        z2 = true;
                    }
                    if (z2 && distanceSq < f3) {
                        f4 = distanceSq;
                        this.target = unit2;
                    }
                }
            }
        }
    }
}