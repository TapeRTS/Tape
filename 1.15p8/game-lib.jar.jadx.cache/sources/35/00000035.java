package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.PointF;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.game.Projectile;
import com.corrodinggames.rts.game.ScorchMark;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.AbstractC0230ae;
import com.corrodinggames.rts.game.units.AbstractC0451d;
import com.corrodinggames.rts.game.units.AbstractC0582q;
import com.corrodinggames.rts.game.units.AttackMode;
import com.corrodinggames.rts.game.units.C0235aj;
import com.corrodinggames.rts.game.units.EnumC0226aa;
import com.corrodinggames.rts.game.units.EnumC0295b;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.Fire;
import com.corrodinggames.rts.game.units.MovementType;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.Waypoint;
import com.corrodinggames.rts.game.units.WaypointType;
import com.corrodinggames.rts.game.units.buildings.AbstractC0483l;
import com.corrodinggames.rts.game.units.buildings.C0482k;
import com.corrodinggames.rts.game.units.buildings.Factory;
import com.corrodinggames.rts.game.units.buildings.Item;
import com.corrodinggames.rts.game.units.buildings.NukeLauncher;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p015a.AbstractC0309a;
import com.corrodinggames.rts.game.units.custom.p015a.C0327d;
import com.corrodinggames.rts.game.units.custom.p015a.C0330g;
import com.corrodinggames.rts.game.units.custom.p015a.EnumC0328e;
import com.corrodinggames.rts.game.units.custom.p017b.AbstractC0375a;
import com.corrodinggames.rts.game.units.custom.p017b.C0377c;
import com.corrodinggames.rts.game.units.custom.p017b.C0378d;
import com.corrodinggames.rts.game.units.custom.p017b.C0382h;
import com.corrodinggames.rts.game.units.custom.p017b.C0383i;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.custom.p020e.C0421e;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.land.LandingCraft;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0202c;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AudioEngine;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.GameObject;
import com.corrodinggames.rts.gameFramework.GroupController.UnitGroup;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.effect.EffectObject;
import com.corrodinggames.rts.gameFramework.effect.EffectType;
import com.corrodinggames.rts.gameFramework.effect.Emitter;
import com.corrodinggames.rts.gameFramework.effect.EnumC0668h;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.NetworkEngine;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.C0918ai;
import com.corrodinggames.rts.gameFramework.utility.C0955y;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.custom.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/j.class */
public class C0433j extends AbstractC0582q implements AbstractC0230ae, AbstractC0451d, AbstractC0483l {

    /* renamed from: a */
    public int f2681a;

    /* renamed from: d */
    float f2682d;

    /* renamed from: e */
    float f2689e;

    /* renamed from: f */
    public float f2690f;

    /* renamed from: g */
    boolean f2691g;

    /* renamed from: l */
    boolean f2692l;

    /* renamed from: m */
    float f2693m;

    /* renamed from: n */
    boolean f2694n;

    /* renamed from: o */
    float f2695o;

    /* renamed from: q */
    boolean f2696q;

    /* renamed from: r */
    float f2697r;

    /* renamed from: s */
    float f2698s;

    /* renamed from: t */
    public float f2699t;

    /* renamed from: u */
    public boolean f2700u;

    /* renamed from: v */
    float f2701v;

    /* renamed from: w */
    public CustomUnitMetadata customUnitMetadataA;

    /* renamed from: x */
    public C0346ap f2703x;

    /* renamed from: y */
    public CustomUnitMetadata customUnitMetadataB;

    /* renamed from: z */
    public AbstractC0364aq[] f2705z;

    /* renamed from: C */
    public float f2680C;

    /* renamed from: dC */
    Projectile[] f2683dC;

    /* renamed from: dF */
    Paint f2684dF;

    /* renamed from: dH */
    public static PointF f2672dH;

    /* renamed from: dI */
    public static Unit f2673dI;

    /* renamed from: dJ */
    public float f2685dJ;

    /* renamed from: dK */
    public float f2686dK;

    /* renamed from: dL */
    public float f2687dL;

    /* renamed from: dQ */
    static boolean f2674dQ;

    /* renamed from: dR */
    static final HashMap f2675dR;

    /* renamed from: dS */
    static int f2676dS;

    /* renamed from: dT */
    static String f2677dT;

    /* renamed from: dU */
    static final PointF f2678dU;

    /* renamed from: dV */
    ValueList f2688dV;

    /* renamed from: dW */
    protected static final C0918ai f2679dW;

    /* renamed from: dD */
    static final PointF f2706dD = new PointF();

    /* renamed from: dE */
    static PointF f2707dE = new PointF();

    /* renamed from: dN */
    static ArrayList f2708dN = new ArrayList();

    /* renamed from: dO */
    public static ObjectVector f2709dO = new ObjectVector();

    /* renamed from: dP */
    public static ObjectVector f2710dP = new ObjectVector();

    /* renamed from: b */
    public final C0410e f2711b = new C0410e(this);

    /* renamed from: c */
    float f2712c = 1.0f;

    /* renamed from: h */
    public boolean f2713h = true;

    /* renamed from: i */
    public boolean f2714i = true;

    /* renamed from: j */
    float f2715j = 1.0f;

    /* renamed from: k */
    boolean f2716k = false;

    /* renamed from: p */
    public boolean f2717p = true;

    /* renamed from: A */
    public final ObjectVector f2718A = new ObjectVector();

    /* renamed from: B */
    public ObjectVector f2719B = null;

    /* renamed from: D */
    PointF[] f2720D = null;

    /* renamed from: dB */
    PointF[] f2721dB = null;

    /* renamed from: dG */
    final C0482k f2722dG = new C0482k(this);

    /* renamed from: dM */
    public C0378d[] f2723dM = null;

    /* renamed from: dX */
    ObjectVector f2724dX = new ObjectVector();

    /* renamed from: K */
    public void m3225K() {
        this.f2720D = new PointF[6];
        this.f2721dB = new PointF[this.f2720D.length];
        for (int i = 0; i < this.f2720D.length; i++) {
            this.f2720D[i] = new PointF();
            this.f2721dB[i] = new PointF();
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0451d
    /* renamed from: b */
    public PointF[] mo2725b() {
        if (this.f2720D == null) {
            m3225K();
        }
        return this.f2720D;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0451d
    /* renamed from: c */
    public PointF[] mo2724c() {
        if (this.f2720D == null) {
            m3225K();
        }
        return this.f2721dB;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject, com.corrodinggames.rts.gameFramework.SyncedObject
    /* renamed from: a */
    public void writeOut(OutputNetStream outputNetStream) {
        outputNetStream.writeInt(10);
        outputNetStream.writeFloat(this.f2689e);
        outputNetStream.writeFloat(this.f2693m);
        outputNetStream.writeBoolean(this.f2694n);
        outputNetStream.writeInt(this.f2718A.size());
        Iterator it = this.f2718A.iterator();
        while (it.hasNext()) {
            outputNetStream.mo1260a((Unit) it.next());
        }
        outputNetStream.writeBoolean(this.f2696q);
        outputNetStream.writeFloat(this.f2695o);
        outputNetStream.writeFloat(this.f2690f);
        outputNetStream.writeFloat(this.f2697r);
        outputNetStream.writeBoolean(this.f2700u);
        byte b = 0;
        if (this.f2723dM != null) {
            b = (byte) this.f2723dM.length;
        }
        outputNetStream.writeByte(b);
        if (this.f2723dM != null) {
            for (int i = 0; i < b; i++) {
                C0378d c0378d = this.f2723dM[i];
                outputNetStream.writeFloat(c0378d.f2259b);
                outputNetStream.writeFloat(c0378d.f2260c);
                outputNetStream.writeFloat(c0378d.f2271d);
                outputNetStream.writeFloat(c0378d.f2265i);
                outputNetStream.writeBoolean(c0378d.f2266k);
                outputNetStream.writeBoolean(c0378d.f2272j);
                outputNetStream.writeBoolean(c0378d.f2273m);
                outputNetStream.writeBoolean(c0378d.f2274n);
            }
        }
        this.f2722dG.m2930a(outputNetStream);
        outputNetStream.mo1311a(this.customUnitMetadataB);
        outputNetStream.writeBoolean(this.f2714i);
        outputNetStream.writeBoolean(this.f2713h);
        boolean z = this.f2688dV != this.customUnitMetadataA.core_tags;
        outputNetStream.writeBoolean(z);
        if (z) {
            ValueListSource.m3247a(this.f2688dV, outputNetStream);
        }
        C0346ap.m3515a(this.f2703x, this, outputNetStream);
        super.writeOut(outputNetStream);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r9v1, types: [int] */
    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.RenderedObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo427a(InputNetStream inputNetStream) {
        UnitType readUnitType;
        byte readByte;
        C0378d c0378d;
        if (inputNetStream.m1237b() >= 32) {
            int readInt = inputNetStream.readInt();
            this.f2689e = inputNetStream.readFloat();
            this.f2693m = inputNetStream.readFloat();
            this.f2694n = inputNetStream.readBoolean();
            this.f2718A.clear();
            int readInt2 = inputNetStream.readInt();
            for (int i = 0; i < readInt2; i++) {
                Unit m1219o = inputNetStream.m1219o();
                if (m1219o != null) {
                    this.f2718A.add(m1219o);
                }
            }
            if (readInt >= 1) {
                this.f2696q = inputNetStream.readBoolean();
            }
            if (readInt >= 2) {
                this.f2695o = inputNetStream.readFloat();
            }
            if (readInt >= 3) {
                this.f2690f = inputNetStream.readFloat();
                this.f2697r = inputNetStream.readFloat();
            }
            if (readInt >= 4) {
                this.f2700u = inputNetStream.readBoolean();
            }
            if (readInt >= 5 && (readByte = inputNetStream.readByte()) != 0) {
                m3156dq();
                if (this.f2723dM == null) {
                    GameEngine.PrintLOG("readIn: legs==null but leg data found in save, this might be due to missing or changed mods");
                }
                for (int i2 = 0; i2 < readByte; i2++) {
                    if (this.f2723dM == null) {
                        c0378d = new C0378d();
                    } else if (i2 >= this.f2723dM.length) {
                        GameEngine.PrintLOG("readIn: legs " + ((int) i2) + ">=" + this.f2723dM.length);
                        c0378d = new C0378d();
                    } else {
                        c0378d = this.f2723dM[i2];
                    }
                    C0378d c0378d2 = c0378d;
                    c0378d2.f2259b = inputNetStream.readFloat();
                    c0378d2.f2260c = inputNetStream.readFloat();
                    c0378d2.f2271d = inputNetStream.readFloat();
                    c0378d2.f2265i = inputNetStream.readFloat();
                    c0378d2.f2266k = inputNetStream.readBoolean();
                    c0378d2.f2275o = true;
                    c0378d2.f2272j = inputNetStream.readBoolean();
                    c0378d2.f2273m = inputNetStream.readBoolean();
                    c0378d2.f2274n = inputNetStream.readBoolean();
                }
            }
            if (readInt >= 6) {
                this.f2722dG.m2929a(inputNetStream);
            }
            if (readInt >= 7 && (readUnitType = inputNetStream.readUnitType()) != null) {
                if (readUnitType instanceof CustomUnitMetadata) {
                    this.customUnitMetadataB = (CustomUnitMetadata) readUnitType;
                } else {
                    GameEngine.log("Got non CustomUnitMetadata object of:" + readUnitType.mo3087i() + " loading real_meta");
                    this.customUnitMetadataB = CustomUnitMetadata.frontCustomUnitMetadata;
                }
            }
            if (readInt >= 8) {
                this.f2714i = inputNetStream.readBoolean();
                this.f2713h = inputNetStream.readBoolean();
            }
            if (readInt >= 9 && inputNetStream.readBoolean()) {
                m3208a(ValueListSource.m3246a(inputNetStream), true);
            }
            if (readInt >= 10) {
                C0346ap.m3512a(this, inputNetStream, readInt);
            }
        }
        super.mo427a(inputNetStream);
        if (this.f2723dM != null) {
            this.f2685dJ = this.x;
            this.f2686dK = this.y;
            this.f2687dL = this.direction;
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cp */
    public boolean mo2823cp() {
        return this.customUnitMetadataA.f3081eB > 0;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.AbstractC0230ae
    /* renamed from: bA */
    public int mo2526bA() {
        return this.f2718A.size();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.AbstractC0230ae
    /* renamed from: bz */
    public boolean mo2497bz() {
        return this.f2694n;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public boolean mo2822d(Unit unit, boolean z) {
        if (this.customUnitMetadataA.f3081eB == 0 || this.f2694n || this.built < 1.0f || !m3227I(unit) || unit == this) {
            return false;
        }
        if (this.team != unit.team && !z && (!this.customUnitMetadataA.core_whileNeutralTransportAnyTeam || this.team != Team.f1346g)) {
            return false;
        }
        if (this.customUnitMetadataA.f2919eE != null && !this.customUnitMetadataA.f2919eE.isEmpty() && !ValueListSource.m3248a(this.customUnitMetadataA.f2919eE, unit.mo3167da())) {
            return false;
        }
        if (this.customUnitMetadataA.f3082eF.size() > 0) {
            boolean z2 = false;
            Iterator it = this.customUnitMetadataA.f3082eF.iterator();
            while (true) {
                if (it.hasNext()) {
                    if (((MovementType) it.next()) == unit.getMovementType()) {
                        z2 = true;
                        break;
                    }
                } else {
                    break;
                }
            }
            if (!z2) {
                return false;
            }
        }
        return C0955y.m450a(unit, this.customUnitMetadataA.f2920eG, this.customUnitMetadataA.f2921eH);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean mo2819e(Unit unit, boolean z) {
        if (!mo2822d(unit, z)) {
            return false;
        }
        m3231E(unit);
        return true;
    }

    /* renamed from: E */
    public void m3231E(Unit unit) {
        unit.transportedBy = this;
        this.f2718A.add(unit);
        if (this.customUnitMetadataA.core_whileNeutralConvertToTransportedTeam && this.team == Team.f1346g) {
            mo3151e(unit.team);
        }
        m3775a(EnumC0334ad.f2115l, unit);
        unit.m3775a(EnumC0334ad.f2118o, this);
        GameEngine.getInstance().interfaceEngine.unselectUnit(unit);
    }

    /* renamed from: F */
    public void m3230F(Unit unit) {
        m3775a(EnumC0334ad.f2116m, unit);
        unit.m3775a(EnumC0334ad.f2119p, this);
        if (this.customUnitMetadataA.core_convertToNeutralIfNotTransporting && this.f2718A.size() == 0) {
            mo3151e(Team.f1346g);
        }
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0230ae
    /* renamed from: e */
    public void mo2820e(Unit unit) {
        if (unit.transportedBy == this) {
            this.f2718A.remove(unit);
            unit.transportedBy = null;
            m3230F(unit);
            return;
        }
        GameEngine.LogTrace("Unit is not being transported");
    }

    /* renamed from: L */
    public void m3224L() {
        if (this.customUnitMetadataA.f3081eB == 0) {
            return;
        }
        this.f2694n = true;
        this.f2693m = 30.0f;
    }

    /* renamed from: dn */
    public void m3159dn() {
        if (this.customUnitMetadataA.f3081eB == 0) {
            return;
        }
        this.f2694n = false;
    }

    /* renamed from: g */
    public boolean m3148g(boolean z) {
        if (this.f2718A.size() == 0) {
            return false;
        }
        return m3202b((Unit) this.f2718A.remove(this.f2718A.size() - 1), z, this.f2718A.size() % 2 == 0);
    }

    /* renamed from: a */
    public boolean m3215a(Unit unit, boolean z, boolean z2) {
        this.f2718A.remove(unit);
        return m3202b(unit, z, z2);
    }

    /* renamed from: b */
    private boolean m3202b(Unit unit, boolean z, boolean z2) {
        boolean z3;
        float f = 180.0f;
        if (this.customUnitMetadataA.f2853cZ != null) {
            f = this.customUnitMetadataA.f2853cZ.floatValue();
        }
        float f2 = 70.0f;
        if (this.customUnitMetadataA.f2897dc != null) {
            f2 = this.customUnitMetadataA.f2897dc.floatValue();
        }
        float f3 = this.customUnitMetadataA.f2851cX;
        float f4 = this.customUnitMetadataA.f2852cY;
        float cos = (this.x + (CommonUtils.cos(this.direction + f) * f4)) - (CommonUtils.sin(this.direction + f) * f3);
        float sin = this.y + (CommonUtils.sin(this.direction + f) * f4) + (CommonUtils.cos(this.direction + f) * f3);
        float cos2 = cos + (CommonUtils.cos(this.direction + 90.0f) * (z2 ? -7.0f : 7.0f));
        float sin2 = sin + (CommonUtils.sin(this.direction + 90.0f) * (z2 ? -7.0f : 7.0f));
        if (!z && !mo2975bH()) {
            if (!C0955y.m456a(unit, cos2, sin2)) {
                cos2 += 10.0f;
            }
            if (!C0955y.m456a(unit, cos2, sin2)) {
                cos2 -= 20.0f;
            }
            if (!C0955y.m456a(unit, cos2, sin2)) {
                cos2 -= 10.0f;
                sin2 += 10.0f;
            }
            if (!C0955y.m456a(unit, cos2, sin2)) {
                sin2 -= 20.0f;
            }
        }
        if (!z && !C0955y.m456a(unit, cos2, sin2) && !mo2975bH()) {
            z3 = false;
        } else {
            z3 = true;
            boolean z4 = false;
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit = (OrderableUnit) unit;
                if (orderableUnit.f1630cF == this) {
                    C0383i dj = orderableUnit.m3735dj();
                    if (dj == null) {
                        GameEngine.PrintLOG("Unload, attachment data is null");
                    }
                    if (dj != null) {
                        z4 = dj.f2289E;
                    }
                }
            }
            C0955y.m451a(unit, this);
            float f5 = this.direction + f;
            if (!z4) {
                unit.x = cos2;
                unit.y = sin2;
                unit.direction = f5;
                unit.f1615bU = 0.0f;
                unit.f1614bT = 0.0f;
                unit.f1611bQ = 0.0f;
                unit.f1612bR = 0.0f;
                unit.f1611bQ += 0.1f;
            }
            unit.f1518bJ = this;
            unit.f1519bK = 45.0f;
            if (z4) {
                unit.f1519bK = 85.0f;
            }
            if (unit instanceof OrderableUnit) {
                OrderableUnit orderableUnit2 = (OrderableUnit) unit;
                if (!z4) {
                    orderableUnit2.m2467j(unit.direction);
                }
                if (!this.customUnitMetadataA.f2925eL.read(this)) {
                    orderableUnit2.m2545ay();
                    if (f2 != 0.0f) {
                        orderableUnit2.m2489d(unit.x + (CommonUtils.cos(f5 + (z2 ? -7.0f : 7.0f)) * f2), unit.y + (CommonUtils.sin(f5 + (z2 ? -7.0f : 7.0f)) * f2));
                    }
                    orderableUnit2.f3685V = 0;
                } else {
                    orderableUnit2.m2590aG();
                }
            }
            if (!z4) {
                if (!this.customUnitMetadataA.f2896db) {
                    unit.height = this.height;
                }
                unit.height += this.customUnitMetadataA.f2895da;
            }
            if (unit instanceof C0433j) {
                ((C0433j) unit).m3172dA();
            }
        }
        if (!z3) {
            this.f2718A.add(unit);
        } else {
            m3230F(unit);
        }
        return z3;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bW */
    public int getBlockBar() {
        if (this.customUnitMetadataA.f3081eB == 0 || !this.customUnitMetadataA.f3004w) {
            return -1;
        }
        return m3169dD();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bX */
    public int getBlockBarMax() {
        if (this.customUnitMetadataA.f3081eB == 0 || !this.customUnitMetadataA.f3004w) {
            return -1;
        }
        return this.customUnitMetadataA.f3081eB;
    }

    /* renamed from: do */
    public void m3158do() {
        if (this.f2718A.size > 0) {
            m3147h(this.customUnitMetadataA.f2924eK.read(this));
        }
    }

    /* renamed from: h */
    public void m3147h(boolean z) {
        Iterator it = this.f2718A.iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            unit.transportedBy = null;
            unit.x = this.x + (CommonUtils.cos(this.direction) * (-9.0f));
            unit.y = this.y + (CommonUtils.sin(this.direction) * (-9.0f));
            if (z) {
                unit.m3744ch();
            }
        }
        this.f2718A.clear();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bt */
    public void mo2503bt() {
        if (!this.dead) {
            m3776a(EnumC0334ad.f2106c);
        }
        Object[] items = this.customUnitMetadataA.f3018h.getItems();
        for (int i = this.customUnitMetadataA.f3018h.size - 1; i >= 0; i--) {
            ((AbstractC0375a) items[i]).mo3466b(this);
        }
        super.mo2503bt();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.PhysicalObject, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void remove() {
        m3158do();
        Object[] items = this.customUnitMetadataA.f3018h.getItems();
        for (int i = this.customUnitMetadataA.f3018h.size - 1; i >= 0; i--) {
            ((AbstractC0375a) items[i]).mo3464c(this);
        }
        Team.m3960a((Unit) this);
        this.f2722dG.m2928a(true);
        super.remove();
    }

    /* renamed from: dp */
    public CustomUnitMetadata getUnitType() {
        return this.customUnitMetadataA;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0582q, com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: I */
    public boolean mo2657I() {
        if (this.customUnitMetadataA.f2751aB || this.f2691g || this.f1630cF != null) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: aQ */
    public boolean mo2580aQ() {
        if (this.customUnitMetadataA.f2876dD) {
            return false;
        }
        C0383i dj = m3735dj();
        if (dj != null && !dj.f2295O) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: aR */
    public boolean mo2579aR() {
        if (this.customUnitMetadataA.f2751aB) {
            return false;
        }
        C0383i dj = m3735dj();
        if (dj != null && !dj.f2291H) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: h */
    public MovementType getMovementType() {
        return this.customUnitMetadataA.f2932eW;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0582q, com.corrodinggames.rts.game.units.Unit
    /* renamed from: i */
    public boolean mo2676i() {
        return this.customUnitMetadataA.f2932eW == MovementType.f1646d && this.height >= 4.0f;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0582q, com.corrodinggames.rts.game.units.Unit
    /* renamed from: P */
    public boolean isUnderwater() {
        return this.height <= -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cs */
    public boolean mo2706cs() {
        if (getMovementType() == MovementType.f1647e) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cq */
    public boolean mo3177cq() {
        if (getMovementType() == MovementType.f1646d) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public BitmapOrTexture mo2674v() {
        if (this.team.teamID == -1 || this.customUnitMetadataA.f2779am == null) {
            return null;
        }
        return this.customUnitMetadataA.f2779am[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture getImage() {
        if (this.dead && this.customUnitMetadataA.graphics_image_wreak != null) {
            return this.customUnitMetadataA.graphics_image_wreak;
        }
        return this.customUnitMetadataA.f3039al[this.team.getId()];
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public BitmapOrTexture getShadowImage() {
        return this.customUnitMetadataA.f3038aj;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public boolean mo2663F() {
        return GameEngine.getInstance().curSettings.renderExtraShadows && (!this.dead || this.height >= 1.0f) && this.height >= -1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: d */
    public BitmapOrTexture mo2487d(int i) {
        C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
        if (c0394bk.f2384B != null && c0394bk.f2384B.read(this)) {
            return null;
        }
        if (c0394bk.f2407aD != null) {
            return c0394bk.f2407aD[this.team.getId()];
        }
        if (c0394bk.f2406aC != null) {
            return c0394bk.f2406aC;
        }
        if (this.customUnitMetadataA.f3040an != null) {
            return this.customUnitMetadataA.f3040an[this.team.getId()];
        }
        return this.customUnitMetadataA.graphics_image_turret;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: h */
    public float mo2473h(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2409aF;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: i */
    public float mo2469i(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2410aG;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public boolean destroyEffectAndWreak() {
        Team team;
        GameEngine game = GameEngine.getInstance();
        if (mo2975bH()) {
            game.PathEngine.m1102a(this);
        }
        if (this.built < 1.0f) {
            if (this.customUnitMetadataA.f2826bs != null && this.customUnitMetadataA.f2826bs.m3041b()) {
                this.customUnitMetadataA.f2826bs.m3043a(this.x, this.y, this.height, this.direction, null);
                return false;
            } else if (this.customUnitMetadataA.f2827bt != null && this.customUnitMetadataA.f2827bt.m3041b()) {
                this.customUnitMetadataA.f2827bt.m3043a(this.x, this.y, this.height, this.direction, null);
                return false;
            } else {
                m2605a(EnumC0588v.f3792a);
                return false;
            }
        }
        if (!this.customUnitMetadataA.f2933eX) {
            setDrawLayer(0);
        }
        if (this.customUnitMetadataA.f2827bt != null && this.customUnitMetadataA.f2827bt.m3041b()) {
            this.customUnitMetadataA.f2827bt.m3043a(this.x, this.y, this.height, this.direction, null);
        }
        if (this.customUnitMetadataA.f3052bw != -1) {
            m3217a((Unit) null, this.x, this.y, this.customUnitMetadataA.f3052bw, (C0388be) null, 0);
        }
        if (this.customUnitMetadataA.f2829bx != null) {
            if (this.customUnitMetadataA.f2830by && this.f1598bl != null && this.f1598bl.team != null) {
                team = this.f1598bl.team;
            } else {
                team = this.team;
            }
            if (!team.f1284B) {
                this.customUnitMetadataA.f2829bx.m3433a(this.x, this.y, this.height, this.direction, team, this.selected, this);
            }
        }
        this.collidable = false;
        if (!this.customUnitMetadataA.f2933eX) {
            m3158do();
        }
        if (this.customUnitMetadataA.f2816bi) {
            boolean z = false;
            if (this.customUnitMetadataA.f2820bm && game.m919K() && game.networkEngine.setup.noNukes) {
                z = true;
            }
            if (!z) {
                Projectile createNuke = NukeLauncher.createNuke(this, this.x, this.y, this.x, this.y);
                createNuke.f982aH = false;
                createNuke.f974Z = this.customUnitMetadataA.f2817bj;
                createNuke.f973Y = this.customUnitMetadataA.f2818bk;
            }
        }
        if (this.customUnitMetadataA.f2815bh != 0) {
            Fire fire = new Fire(false);
            fire.x = this.x;
            fire.y = this.y;
            fire.mo2537b(Team.f1345f);
            Team.m3924c(fire);
        }
        if (this.customUnitMetadataA.f2828bu != null) {
            this.customUnitMetadataA.f2828bu.m3441a(this.x, this.y, 1.0f);
        }
        if (this.customUnitMetadataA.core_isBio) {
            if (this.customUnitMetadataA.f2828bu == null) {
                game.audio.playSound(AudioEngine.bug_die, 0.8f, this.x, this.y);
            }
            if (this.customUnitMetadataA.f2823bp) {
                if (!mo2676i() && !this.customUnitMetadataA.f3078ey) {
                    ScorchMark.create(this, 1);
                }
                if (this.customUnitMetadataA.f2822bo != null) {
                    m2604a(this.customUnitMetadataA.f2822bo, true);
                } else if (this.customUnitMetadataA.f2812be) {
                    m2605a(EnumC0588v.f3795d);
                }
            }
            if (this.customUnitMetadataA.core_isBug) {
                for (int i = 0; i < mo2508bo(); i++) {
                    game.effects.m2206d(this.x, this.y, this.height);
                }
            }
        } else {
            if (this.f2723dM != null) {
                m3155dw();
                for (int i2 = 0; i2 < this.f2723dM.length; i2++) {
                    C0378d c0378d = this.f2723dM[i2];
                    C0371ax c0371ax = this.customUnitMetadataA.f3043ar[i2];
                    float f = this.x + c0378d.f2259b;
                    float f2 = this.y + c0378d.f2260c;
                    if (c0371ax.f2233F && !c0371ax.f2213m && (c0371ax.f2214n == null || !c0371ax.f2214n.read(this))) {
                        if (!C0955y.m436d(f, f2) && !this.customUnitMetadataA.f3078ey) {
                            ScorchMark.m3995a(f, f2);
                        }
                        game.effects.emitSmalExplosion(f, f2, 0.0f);
                    }
                }
            }
            if (!mo2676i()) {
                if (this.customUnitMetadataA.f2823bp) {
                    if (this.customUnitMetadataA.f2822bo != null) {
                        m2604a(this.customUnitMetadataA.f2822bo, true);
                    } else {
                        m2605a(EnumC0588v.f3793b);
                    }
                }
            } else {
                if (this.customUnitMetadataA.f2823bp) {
                    if (this.customUnitMetadataA.f2822bo != null) {
                        m2604a(this.customUnitMetadataA.f2822bo, false);
                    } else {
                        game.effects.emitSmalExplosion(this.x, this.y, this.height);
                    }
                }
                for (int i3 = 0; i3 < mo2508bo(); i3++) {
                    game.effects.m2204e(this.x, this.y, this.height);
                }
            }
        }
        if (this.customUnitMetadataA.f2933eX) {
            return true;
        }
        if (this.customUnitMetadataA.graphics_image_wreak != null) {
            this.image = this.customUnitMetadataA.graphics_image_wreak;
            this.f2681a = 0;
            this.f4047en = true;
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bp */
    public void mo2507bp() {
        if (!this.customUnitMetadataA.f3078ey) {
            super.mo2507bp();
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: T */
    public void mo2648T() {
        float mo2668C;
        super.mo2648T();
        for (int i = 0; i < this.customUnitMetadataA.f3087fF.length; i++) {
            C0235aj c0235aj = this.f1532cC[i];
            GameEngine.PrintLOG("Dir was:" + c0235aj.f1652a + " for name:" + this.customUnitMetadataA.f3087fF[i].f2403a);
            GameEngine.PrintLOG("lockDelay:" + c0235aj.f1655d + " shootCooldown:" + c0235aj.f1656e);
            GameEngine.PrintLOG("updateAndShouldResetTurret:" + mo2538b(i, 0.0f));
            GameEngine.PrintLOG("idleDir:" + mo2668C(i));
            GameEngine.PrintLOG("diffDir:" + CommonUtils.m1670c(c0235aj.f1652a, mo2668C, 360.0f));
        }
    }

    /* renamed from: a */
    public void m3207a(CustomUnitMetadata customUnitMetadata, boolean z, boolean z2) {
        m3206a(customUnitMetadata, z, z2, (AbstractC0364aq[]) null);
    }

    /* renamed from: a */
    public void m3206a(CustomUnitMetadata customUnitMetadata, boolean z, boolean z2, AbstractC0364aq[] abstractC0364aqArr) {
        GameEngine gameEngine = GameEngine.getInstance();
        CustomUnitMetadata customUnitMetadata2 = this.customUnitMetadataA;
        C0346ap c0346ap = this.f2703x;
        this.customUnitMetadataA = customUnitMetadata;
        this.unitType = this.customUnitMetadataA;
        this.f2703x = customUnitMetadata.f3064cA;
        if (z2) {
            C0346ap.m3514a(this, c0346ap, customUnitMetadata2);
        } else if (abstractC0364aqArr != null) {
            C0346ap.m3513a(this, c0346ap, abstractC0364aqArr);
        }
        m3760bQ();
        if (!z2) {
            m3145j(true);
        }
        if (!z) {
            if (customUnitMetadata.f3087fF.length > 1) {
                boolean z3 = true;
                if (customUnitMetadata.f3087fF.length != customUnitMetadata2.f3087fF.length) {
                    z3 = false;
                } else {
                    int i = 0;
                    while (true) {
                        if (i >= customUnitMetadata.f3087fF.length) {
                            break;
                        }
                        if (customUnitMetadata.f3087fF[i].f2403a.equalsIgnoreCase(customUnitMetadata2.f3087fF[i].f2403a)) {
                            i++;
                        } else {
                            z3 = false;
                            break;
                        }
                    }
                }
                if (!z3) {
                    C0235aj[] c0235ajArr = new C0235aj[customUnitMetadata.f3087fF.length];
                    for (int i2 = 0; i2 < customUnitMetadata.f3087fF.length; i2++) {
                        C0394bk c0394bk = customUnitMetadata.f3087fF[i2];
                        C0394bk m3100c = customUnitMetadata2.m3100c(c0394bk.f2403a);
                        if (m3100c != null) {
                            c0235ajArr[c0394bk.f2429e] = this.f1532cC[m3100c.f2429e];
                            this.f1532cC[m3100c.f2429e] = null;
                        }
                    }
                    for (int i3 = 0; i3 < customUnitMetadata.f3087fF.length; i3++) {
                        if (c0235ajArr[i3] == null) {
                            int i4 = 0;
                            while (true) {
                                if (i4 < customUnitMetadata.f3087fF.length) {
                                    if (this.f1532cC[i4] == null) {
                                        i4++;
                                    } else {
                                        c0235ajArr[i3] = this.f1532cC[i4];
                                        this.f1532cC[i4] = null;
                                        break;
                                    }
                                } else {
                                    break;
                                }
                            }
                            if (c0235ajArr[i3] == null) {
                                c0235ajArr[i3] = new C0235aj();
                            }
                            c0235ajArr[i3].m3723a(this.direction);
                        }
                    }
                    this.f1532cC = c0235ajArr;
                }
            }
        } else {
            for (int i5 = 0; i5 < customUnitMetadata.f3087fF.length; i5++) {
                this.f1532cC[i5].m3723a(this.direction + mo2670B(i5));
            }
        }
        setObjectWidth(this.customUnitMetadataA.imageWidth);
        setObjectHeight(this.customUnitMetadataA.imageHeight);
        this.f4047en = false;
        this.radius = this.customUnitMetadataA.f2842cL;
        this.displayRadius = this.customUnitMetadataA.f2846cS;
        if (this.dead) {
            this.f2681a = 0;
        } else {
            this.f2681a = this.customUnitMetadataA.graphics_default_frame;
        }
        this.f2691g = false;
        if (z) {
            this.height += this.customUnitMetadataA.f3072dG;
        }
        float f = this.maxHp;
        this.maxHp = this.f2703x.maxhp;
        if (z) {
            m3730o(this.maxHp);
        } else if (f == 0.0f) {
            m3730o(this.maxHp);
        } else {
            m3730o((this.hp / f) * this.maxHp);
        }
        float f2 = this.maxShield;
        this.maxShield = this.f2703x.maxshield;
        if (this.customUnitMetadataA.f2832cB) {
            if (this.shield > this.maxShield) {
                this.shield = this.maxShield;
            }
        } else if (z) {
            this.shield = this.maxShield;
        } else if (f2 == 0.0f) {
            this.shield = this.maxShield;
        } else {
            this.shield = (this.shield / f2) * this.maxShield;
        }
        if (this.customUnitMetadataA.f2834cD) {
            if (this.f1549cs > this.f2703x.f2171d) {
                this.f1549cs = this.f2703x.f2171d;
            }
        } else if (z) {
            this.f1549cs = this.f2703x.f2171d * this.customUnitMetadataA.f2838cH;
        } else if (c0346ap.f2171d == 0.0f) {
            this.f1549cs = this.f2703x.f2171d;
        } else {
            this.f1549cs = (this.f1549cs / c0346ap.f2171d) * this.f2703x.f2171d;
        }
        if (this.team == null) {
            this.image = this.customUnitMetadataA.graphics_image;
        } else {
            mo2650R();
        }
        if (this.customUnitMetadataA.f2751aB && z) {
            this.direction = -90.0f;
        }
        mo2680c_();
        if (!z) {
            boolean z4 = this.customUnitMetadataA.mo3085j() != customUnitMetadata2.mo3085j();
            if (this.customUnitMetadataA.mo3085j()) {
                this.f1615bU = 0.0f;
                this.f1614bT = 0.0f;
                if (customUnitMetadata2.mo3085j() && !this.customUnitMetadataA.f3065cM.equals(customUnitMetadata2.f3065cM)) {
                    z4 = true;
                }
            }
            if (z4) {
                gameEngine.PathEngine.m1102a(this);
            }
        }
        this.f2715j = 1.0f;
        if (this.customUnitMetadataA.f3063cx != -2) {
        }
        if (!this.dead) {
            m3172dA();
        }
        if (this.customUnitMetadataA.f2954eu) {
        }
        m3156dq();
        m3736dc().m3411a(this.customUnitMetadataA);
        if (!z) {
            int mo2512bk = mo2512bk();
            for (int i6 = 0; i6 < mo2512bk; i6++) {
                C0235aj c0235aj = this.f1532cC[i6];
                C0394bk c0394bk2 = this.customUnitMetadataA.f3087fF[i6];
                if (c0394bk2 != null) {
                    if (c0235aj.f1656e > c0394bk2.f2441l) {
                        c0235aj.f1656e = c0394bk2.f2441l;
                    }
                    if (c0235aj.f1657f > c0394bk2.f2442m) {
                        c0235aj.f1657f = c0394bk2.f2442m;
                    }
                }
            }
        }
        if (!z) {
            if (!this.customUnitMetadataA.f2845cR) {
                this.f2722dG.f3316b = null;
            }
            if (this.customUnitMetadataA.f2931eV != customUnitMetadata2.f2931eV) {
                m2590aG();
            }
        }
        if (this.customUnitMetadataA.core_convertToNeutralIfNotTransporting && this.f2718A.size() == 0) {
            mo2537b(Team.f1346g);
        }
        if (this.selected && !gameEngine.interfaceEngine.m1840i(this)) {
            gameEngine.interfaceEngine.unselectUnit(this);
        }
        if (!z) {
            Object[] items = this.customUnitMetadataA.f3018h.getItems();
            for (int i7 = this.customUnitMetadataA.f3018h.size - 1; i7 >= 0; i7--) {
                ((AbstractC0375a) items[i7]).mo3471a(this, customUnitMetadata2);
            }
            if (this.built >= 1.0f) {
                if (this.f2703x.f2181n > c0346ap.f2181n) {
                    mo2491c(false);
                }
            } else {
                if ((this.customUnitMetadataA.f2850cW != -1 ? this.customUnitMetadataA.f2850cW : this.f2703x.f2181n) > (customUnitMetadata2.f2850cW != -1 ? customUnitMetadata2.f2850cW : c0346ap.f2181n)) {
                    mo2491c(false);
                }
            }
        }
        if (this.f2714i && this.customUnitMetadataA.f2901dk != null) {
            this.f2711b.m3348a(this.customUnitMetadataA.f2901dk, 7, true);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c_ */
    public void mo2680c_() {
        if (this.customUnitMetadataA.f2751aB) {
            this.collidable = false;
        } else if (!this.dead) {
            this.collidable = true;
            if (this.customUnitMetadataA.f2951er) {
                this.collidable = false;
            }
        } else {
            this.collidable = false;
        }
        if (this.f1630cF != null) {
            this.collidable = false;
        }
    }

    public C0433j(boolean z, CustomUnitMetadata customUnitMetadata) {
        super(z);
        m3207a(customUnitMetadata, true, false);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void update(float f) {
        float f2;
        UnitType mo3049c;
        float f3;
        EffectObject m2207c;
        float f4;
        float f5;
        float f6;
        EffectObject m2215b;
        boolean z = this.f2714i;
        if (z) {
            this.f2714i = false;
            Object[] items = this.customUnitMetadataA.f3018h.getItems();
            for (int i = this.customUnitMetadataA.f3018h.size - 1; i >= 0; i--) {
                ((AbstractC0375a) items[i]).mo3475a(this);
            }
            m3201b(EnumC0334ad.f2104a);
        }
        CustomUnitMetadata customUnitMetadata = this.customUnitMetadataA;
        super.update(f);
        if (this.dead && !this.f2692l) {
            if (this.height > 0.0f) {
                if (customUnitMetadata.f2933eX && !(this.speed == 0.0f && this.f1614bT == 0.0f && this.f1615bU == 0.0f)) {
                    this.f2690f += 0.017f * f;
                    this.height -= this.f2690f * f;
                    PointF n = m2453n(f);
                    this.x += n.x;
                    this.y += n.y;
                    if (customUnitMetadata.f2931eV == MovementType.f1646d) {
                        GameEngine gameEngine = GameEngine.getInstance();
                        this.f1636dh += f;
                        this.f1556df += f;
                        if (customUnitMetadata.f2934eY && this.f1636dh > 9.0f) {
                            this.f1636dh = CommonUtils.rnd(1.0f, 3.0f);
                            EffectObject emitEffect = gameEngine.effects.emitEffect(this.x, this.y, this.height, EffectType.f4274a, false, EnumC0668h.f4398b);
                            if (emitEffect != null) {
                                emitEffect.stripIndex = 0;
                                emitEffect.frameIndex = 0;
                                emitEffect.drawLayer = (short) 2;
                                emitEffect.fadeOut = true;
                                emitEffect.startingAlpha = 0.5f;
                                emitEffect.startTimer = 60.0f;
                                emitEffect.timer = 60.0f;
                                emitEffect.f4287H = 0.9f;
                                emitEffect.f4286G = 1.2f;
                                emitEffect.f4358ar = false;
                                emitEffect.f4296Q = 0.0f;
                                emitEffect.ySpeed = 0.0f;
                            }
                        }
                        if (this.f1556df > 7.0f) {
                            this.f1556df = 0.0f;
                            EffectObject emitEffect2 = gameEngine.effects.emitEffect(this.x, this.y, this.height, EffectType.f4274a, false, EnumC0668h.f4397a);
                            if (emitEffect2 != null) {
                                Emitter.m2190b(emitEffect2, true);
                                emitEffect2.f4289J = this.x;
                                emitEffect2.f4290K = this.y;
                                emitEffect2.f4291L = this.height;
                                emitEffect2.f4296Q += CommonUtils.rnd(-0.1f, 0.1f) + this.f1614bT;
                                emitEffect2.ySpeed += CommonUtils.rnd(-0.1f, 0.1f) + this.f1615bU;
                                emitEffect2.f4289J += CommonUtils.rnd(-4.0f, 4.0f);
                                emitEffect2.f4290K += CommonUtils.rnd(-4.0f, 4.0f);
                            }
                        }
                    }
                } else {
                    this.f2690f += customUnitMetadata.f3075dL * f;
                    this.height -= this.f2690f * f;
                }
            } else if (!this.f2716k) {
                this.f2716k = true;
                if (customUnitMetadata.f2933eX) {
                    m3158do();
                    setDrawLayer(0);
                    if (customUnitMetadata.graphics_image_wreak != null) {
                        this.image = customUnitMetadata.graphics_image_wreak;
                        this.f2681a = 0;
                        this.f4047en = true;
                    } else {
                        m3745cg();
                    }
                }
                if (this.f2690f > 0.5d) {
                    if (customUnitMetadata.f2825br != null && customUnitMetadata.f2825br.m3044a()) {
                        customUnitMetadata.f2825br.m3043a(this.x, this.y, this.height, this.direction, null);
                    }
                    if (m3749cI()) {
                        if (customUnitMetadata.f2824bq) {
                            m2605a(EnumC0588v.f3792a);
                        }
                        if (m3750cH()) {
                            GameEngine.getInstance().effects.m2229a(this.x, this.y, 0.0f, 0, 0.0f, 0.0f, this.direction);
                        }
                    } else if (customUnitMetadata.f2824bq) {
                        m2605a(EnumC0588v.f3793b);
                    }
                }
                this.f2690f = 0.0f;
            } else if (m3749cI()) {
                if (this.height > -10.0f) {
                    this.f2690f += 8.0E-4f * f;
                    this.height -= this.f2690f * f;
                    if (m3750cH()) {
                        this.f2698s += f;
                        if (this.f2698s > 30.0f) {
                            this.f2698s = 0.0f;
                            if (isOnScreen() && (m2215b = GameEngine.getInstance().effects.m2215b(this.x, this.y, this.height, this.direction)) != null) {
                                m2215b.f4296Q = 0.0f;
                                m2215b.ySpeed = -0.1f;
                            }
                        }
                    }
                } else {
                    this.f2692l = true;
                }
            } else {
                this.height = 0.0f;
                this.f2692l = true;
            }
        }
        if (this.dead) {
            return;
        }
        GameEngine gameEngine2 = GameEngine.getInstance();
        if (customUnitMetadata.f2810bc != 0.0f && this.built < 1.0f) {
            float f7 = this.built + (customUnitMetadata.f2810bc * f);
            if (f7 >= 1.0f) {
                Team.m3940b((Unit) this);
                this.built = 1.0f;
                this.f1619ce = 1.0f;
                Team.m3924c(this);
            } else {
                this.built = f7;
                this.f1619ce = f7;
            }
        }
        if (!isActive()) {
            if (this.built < 1.0f) {
                if (customUnitMetadata.f2902dl != null) {
                    this.f2711b.m3349a(customUnitMetadata.f2902dl, 8);
                    this.f2711b.m3351a(f);
                } else if (customUnitMetadata.f2903dm != null) {
                    this.f2711b.m3349a(customUnitMetadata.f2903dm, 99);
                    this.f2711b.f2561b = this.built;
                    this.f2711b.f2569d = 0.0f;
                    this.f2711b.m3351a(f);
                }
            }
            Object[] items2 = customUnitMetadata.f3018h.getItems();
            for (int i2 = customUnitMetadata.f3018h.size - 1; i2 >= 0; i2--) {
                ((AbstractC0375a) items2[i2]).mo3474a(this, f);
            }
            return;
        }
        Object[] items3 = customUnitMetadata.f3018h.getItems();
        for (int i3 = customUnitMetadata.f3018h.size - 1; i3 >= 0; i3--) {
            ((AbstractC0375a) items3[i3]).mo3465b(this, f);
        }
        if (this.f2713h) {
            this.f2713h = false;
            m3776a(EnumC0334ad.f2105b);
        }
        if (this.f2703x.f2183p != 0.0f && (this.hp < this.maxHp || this.f2703x.f2183p < 0.0f)) {
            this.hp += this.f2703x.f2183p * f;
            if (this.hp > this.maxHp) {
                this.hp = this.maxHp;
            }
        }
        if (this.f2703x.f2171d != 0.0f) {
            if (!this.f2700u) {
                f6 = customUnitMetadata.f2835cE;
            } else {
                f6 = customUnitMetadata.f2836cF;
            }
            if (this.f1549cs < this.f2703x.f2171d || f6 < 0.0f) {
                this.f1549cs += f6 * f;
            }
            if (this.f1549cs >= this.f2703x.f2171d) {
                this.f1549cs = this.f2703x.f2171d;
                this.f2700u = false;
            }
            if (this.f1549cs <= 0.0f) {
                if (customUnitMetadata.f2813bf) {
                    mo2502bu();
                    return;
                }
                this.f1549cs = 0.0f;
            }
        }
        if (this.maxShield != 0.0f) {
            if (this.f2703x.shieldregen != 0.0f) {
                this.shield += this.f2703x.shieldregen * f;
                if (this.shield > this.maxShield) {
                    this.shield = this.maxShield;
                }
            }
            if (this.shield < 0.0f) {
                this.shield = 0.0f;
            }
            if (this.f1546cp != 0.0f) {
                this.f1546cp -= (this.f1546cp * 0.02f) * f;
                this.f1546cp = CommonUtils.m1744a(this.f1546cp, 0.0f, customUnitMetadata.f2841cK * f);
                if (this.f1546cp > 50.0f) {
                    this.f1546cp = 50.0f;
                }
            }
        }
        this.f2722dG.m2943a(f);
        CustomUnitMetadata customUnitMetadata2 = this.customUnitMetadataA;
        if (customUnitMetadata2.f2974fe) {
            Builder.m2854a(f, this);
        }
        if (!customUnitMetadata2.f3058cg.m3388b()) {
            this.f2695o += f;
            if (this.f2695o > customUnitMetadata2.f2859cj - 0.1f) {
                this.f2695o -= customUnitMetadata2.f2859cj;
                boolean read = customUnitMetadata2.f2861cn.read(this);
                if (this.f2717p != read) {
                    Team.m3960a((Unit) this);
                    this.f2717p = read;
                    Team.m3924c(this);
                }
                if (this.f2717p) {
                    customUnitMetadata2.f3058cg.m3368g(this);
                }
            }
        }
        if (this.moving) {
            this.f2711b.m3349a(customUnitMetadata2.f3069dh, 3);
        } else if (!this.f2711b.f2570e || this.f2711b.f2560a == customUnitMetadata2.f3070di) {
            this.f2711b.m3349a(customUnitMetadata2.f3070di, 2);
        }
        if (customUnitMetadata2.f2790bG) {
            if (customUnitMetadata2.f2788bE && gameEngine2.f5967dc) {
                if (this.speed > 0.0f || (this.speed < 0.0f && customUnitMetadata2.f2789bF)) {
                    this.f2698s += f;
                }
                if (this.f2698s > 10.0f) {
                    this.f2698s = 0.0f;
                    if (this.trailEffect && m3750cH()) {
                        float f8 = this.direction + 180.0f;
                        if (this.speed < 0.0f) {
                            f8 += 180.0f;
                        }
                        float f9 = this.radius - 6.0f;
                        if (f9 < 4.0f) {
                            f9 = 4.0f;
                        }
                        gameEngine2.effects.m2215b(this.x + (CommonUtils.cos(f8) * f9), this.y + (CommonUtils.sin(f8) * f9), 0.0f, f8);
                    }
                }
            }
            if (gameEngine2.f5966db && ((this.speed > 0.0f || this.speed < 0.0f) && this.trailEffect)) {
                this.f2682d += f;
                if (this.f2682d > customUnitMetadata2.f2796bM) {
                    this.f2682d = 0.0f;
                    if (this.speed > 0.0f) {
                        if (customUnitMetadata2.f2793bJ != null) {
                            customUnitMetadata2.f2793bJ.m3043a(this.x, this.y, this.height, this.direction, this);
                        }
                    } else if (customUnitMetadata2.f2794bK != null) {
                        float f10 = this.direction;
                        if (customUnitMetadata2.f2795bL) {
                            f10 += 180.0f;
                        }
                        customUnitMetadata2.f2794bK.m3043a(this.x, this.y, this.height, f10, this);
                    }
                    if (customUnitMetadata2.f2791bH && ((this.speed > 0.0f || customUnitMetadata2.f2792bI) && !m3750cH())) {
                        int i4 = 0;
                        while (i4 <= 1) {
                            float f11 = i4 == 0 ? -20 : 20;
                            float f12 = this.direction + 180.0f;
                            if (this.speed < 0.0f) {
                                f11 += 180.0f;
                                f12 += 180.0f;
                            }
                            EffectObject m2208c = gameEngine2.effects.m2208c(this.x + (CommonUtils.cos(this.direction + 180.0f + f11) * (this.radius - 1.0f)), this.y + (CommonUtils.sin(this.direction + 180.0f + f11) * (this.radius - 1.0f)), this.height, f12 + CommonUtils.rnd(-7.0f, 7.0f), 0);
                            if (m2208c != null) {
                                m2208c.f4296Q += CommonUtils.rnd(-0.15f, 0.15f);
                                m2208c.ySpeed += CommonUtils.rnd(-0.15f, 0.15f);
                            }
                            i4++;
                        }
                    }
                }
            }
        }
        if (customUnitMetadata2.f3081eB > 0) {
            if (customUnitMetadata2.f2927eN != 0.0f && this.f2718A.size > 0) {
                Object[] items4 = this.f2718A.getItems();
                for (int i5 = 0; i5 < this.f2718A.size; i5++) {
                    Unit unit = (Unit) items4[i5];
                    if (unit.hp < unit.maxHp || customUnitMetadata2.f2927eN < 0.0f) {
                        unit.hp += customUnitMetadata2.f2927eN * f;
                        if (unit.hp > unit.maxHp) {
                            unit.hp = unit.maxHp;
                        }
                    }
                }
            }
            if (this.f2694n && customUnitMetadata2.f2928eR.read(this)) {
                this.f2693m = CommonUtils.toZero(this.f2693m, f);
                if (this.f2693m == 0.0f) {
                    this.f2693m = customUnitMetadata2.f2917eC;
                    if (this.f2718A.size() == 0) {
                        this.f2694n = false;
                    } else {
                        m3148g(false);
                        if (this.f2718A.size() == 0) {
                            this.f2694n = false;
                        }
                    }
                }
            }
        }
        if (!this.moving) {
            this.f2697r += f;
        } else {
            this.f2697r = 0.0f;
        }
        if (customUnitMetadata2.f2931eV != MovementType.f1646d && this.f1630cF == null) {
            m3172dA();
        }
        if ((customUnitMetadata2.f2931eV == MovementType.f1649g || customUnitMetadata2.f2931eV == MovementType.f1650h) && this.moving) {
            if (m3751cG()) {
                this.f2715j = 0.7f;
            } else {
                this.f2715j = 1.0f;
            }
        }
        if (customUnitMetadata2.f2931eV == MovementType.f1646d) {
            this.f2689e += 2.0f * f;
            if (this.f2689e > 360.0f) {
                this.f2689e -= 360.0f;
            }
            boolean mo2676i = mo2676i();
            boolean z2 = false;
            if (customUnitMetadata2.f2877dE) {
                boolean cI = m3749cI();
                if (!this.moving && !cI && this.f2697r > 3.0f && (!customUnitMetadata2.f2878dF || m2554ap())) {
                    z2 = true;
                }
            }
            if (this.f1630cF == null) {
                if (z2) {
                    if (customUnitMetadata2.f3073dJ < 0.0f) {
                        f5 = (CommonUtils.absf(this.height - 2.0f) * 0.05f * 0.4f) + 0.2f;
                    } else {
                        f5 = customUnitMetadata2.f3073dJ;
                    }
                    this.height = CommonUtils.m1744a(this.height, 2.0f, f5 * f);
                } else {
                    float sin = customUnitMetadata2.f2879dH + (CommonUtils.sin(this.f2689e) * customUnitMetadata2.f2880dI);
                    if (customUnitMetadata2.f3073dJ < 0.0f) {
                        f4 = (CommonUtils.absf(this.height - 2.0f) * 0.05f * 0.4f) + 0.2f;
                    } else {
                        f4 = customUnitMetadata2.f3073dJ;
                    }
                    this.height = CommonUtils.m1744a(this.height, sin, CommonUtils.m1693b(f4, (CommonUtils.absf(this.height - sin) * 0.05f * 0.3f) + 0.1f) * f);
                }
                if (mo2676i != mo2676i()) {
                    this.f3699ar = true;
                    m3172dA();
                }
            }
        } else {
            float f13 = customUnitMetadata2.f2879dH - customUnitMetadata2.f2880dI;
            if (this.height < f13) {
                this.height += 0.2f * f;
                if (this.height >= f13) {
                    this.height = f13;
                }
            }
            if ((customUnitMetadata2.f2879dH != 0.0f || customUnitMetadata2.f2880dI != 0.0f || this.height > 0.0f) && this.f1630cF == null) {
                float f14 = customUnitMetadata2.f2879dH;
                if (customUnitMetadata2.f2880dI != 0.0f) {
                    this.f2689e += 2.0f * f;
                    if (this.f2689e > 360.0f) {
                        this.f2689e -= 360.0f;
                    }
                    f14 += CommonUtils.sin(this.f2689e) * customUnitMetadata2.f2880dI;
                }
                if (customUnitMetadata2.f3073dJ < 0.0f) {
                    f3 = (CommonUtils.absf(this.height - 2.0f) * 0.05f * 0.4f) + 0.2f;
                } else {
                    f3 = customUnitMetadata2.f3073dJ;
                }
                this.height = CommonUtils.m1744a(this.height, f14, CommonUtils.m1693b(f3, (CommonUtils.absf(this.height - f14) * 0.05f * 0.3f) + 0.1f) * f);
                boolean z3 = false;
                if (this.height > customUnitMetadata2.f2879dH + customUnitMetadata2.f2880dI + 1.0f) {
                    this.f2690f += customUnitMetadata2.f3074dK * f;
                    if (this.height < 0.0f) {
                        this.f2690f = CommonUtils.m1693b(this.f2690f, 0.2f);
                    }
                    this.height -= this.f2690f * f;
                    if (this.f2690f > 1.5d) {
                        this.f1636dh += f;
                        if (this.f1636dh > 0.5d) {
                            this.f1636dh = 0.0f;
                            EffectObject emitEffect3 = gameEngine2.effects.emitEffect(this.x + CommonUtils.rnd(-this.radius, this.radius), this.y + CommonUtils.rnd(-this.radius, this.radius), this.height, EffectType.f4274a, false, EnumC0668h.f4399c);
                            if (emitEffect3 != null) {
                                emitEffect3.stripIndex = 0;
                                emitEffect3.frameIndex = 0;
                                emitEffect3.drawLayer = (short) 2;
                                emitEffect3.fadeOut = true;
                                emitEffect3.f4332t = true;
                                emitEffect3.f4333u = 40.0f;
                                emitEffect3.f4355am = true;
                                emitEffect3.f4296Q = 0.1f;
                                emitEffect3.f4298S = 0.0f;
                                emitEffect3.f4334v = true;
                                emitEffect3.startingAlpha = 0.4f;
                                emitEffect3.startTimer = 380.0f;
                                emitEffect3.timer = emitEffect3.startTimer;
                                emitEffect3.f4287H = 0.8f;
                                emitEffect3.f4286G = 1.7f;
                                emitEffect3.f4358ar = false;
                                emitEffect3.f4296Q += CommonUtils.rnd(-0.04f, 0.04f);
                                emitEffect3.ySpeed += CommonUtils.rnd(-0.04f, 0.04f);
                            }
                        }
                    }
                    if (this.height <= customUnitMetadata2.f2879dH + customUnitMetadata2.f2880dI + 1.0f) {
                        if (this.f2690f > 2.0f) {
                            z3 = true;
                        }
                        if (this.height < customUnitMetadata2.f2879dH + customUnitMetadata2.f2880dI) {
                            this.height = customUnitMetadata2.f2879dH + customUnitMetadata2.f2880dI;
                        }
                        this.f2690f = 0.0f;
                    }
                } else {
                    if (this.f2690f > 2.0f) {
                        z3 = true;
                    }
                    this.f2690f = 0.0f;
                }
                if (z3 && (m2207c = gameEngine2.effects.m2207c(this.x, this.y, this.height, 0)) != null) {
                    m2207c.f4287H = 0.8f;
                    m2207c.f4286G = 1.4f;
                    m2207c.timer = 60.0f;
                    m2207c.startTimer = m2207c.timer;
                }
            }
        }
        boolean z4 = false;
        boolean z5 = false;
        if (customUnitMetadata2.f2809bb) {
            z5 = true;
        }
        if (this.customUnitMetadataB != null && this.customUnitMetadataB.f2809bb) {
            z5 = true;
        }
        if (z5) {
            Action m2921d = this.f2722dG.m2921d();
            boolean z6 = false;
            if (m2921d != null) {
                if (m2921d instanceof C0330g) {
                    C0330g c0330g = (C0330g) m2921d;
                    C0327d c0327d = c0330g.f2085a;
                    boolean z7 = false;
                    z6 = c0330g.m3611J();
                    if (c0327d.f2043k != null && (mo3049c = c0327d.f2043k.mo3049c()) != null && (mo3049c instanceof CustomUnitMetadata)) {
                        z4 = true;
                        if (mo3049c != customUnitMetadata2) {
                            if (this.customUnitMetadataB != null) {
                                Team.m3940b((Unit) this);
                                m3206a(this.customUnitMetadataB, false, false, this.f2705z);
                                this.customUnitMetadataB = null;
                                this.f2705z = null;
                                customUnitMetadata2 = this.customUnitMetadataA;
                                Team.m3924c(this);
                            }
                            Team.m3940b((Unit) this);
                            this.customUnitMetadataB = customUnitMetadata2;
                            this.f2705z = c0327d.f2044l;
                            m3206a((CustomUnitMetadata) mo3049c, false, false, c0327d.f2044l);
                            customUnitMetadata2 = this.customUnitMetadataA;
                            Team.m3924c(this);
                        }
                    }
                    if (c0327d.f1997T != null) {
                        float floatValue = c0327d.f1997T.floatValue();
                        if (c0327d.f2000W) {
                            float f15 = this.x;
                            float f16 = this.y;
                            Item m2927b = this.f2722dG.m2927b();
                            if (m2927b != null) {
                                float f17 = Float.MIN_VALUE;
                                float f18 = Float.MIN_VALUE;
                                if (m2927b.f3307h != null) {
                                    f17 = m2927b.f3307h.x;
                                    f18 = m2927b.f3307h.y;
                                } else if (m2927b.f3306g != null) {
                                    f17 = m2927b.f3306g.x;
                                    f18 = m2927b.f3306g.y;
                                }
                                if (f17 > Float.MIN_VALUE) {
                                    floatValue += CommonUtils.m1659d(f15, f16, f17, f18);
                                }
                            }
                        }
                        if (c0327d.f2001X == null) {
                            f2 = m2637a(f, floatValue, true, c0327d.f1998U);
                        } else {
                            int i6 = c0327d.f2001X.f2429e;
                            f2 = m2640a(f, floatValue, i6);
                            C0235aj c0235aj = this.f1532cC[i6];
                            c0235aj.m3720b(5);
                            c0235aj.f1653b = c0235aj.f1652a;
                        }
                        if (c0327d.f1999V && CommonUtils.absf(f2) > 5.0f) {
                            z7 = true;
                        }
                    }
                    if (c0327d.f1996S != null && !z7) {
                        this.f2711b.m3349a(c0327d.f1996S.m3057b(), 10);
                    }
                    if (z7) {
                        this.f2722dG.f3319e = 0.0f;
                    }
                }
                if (customUnitMetadata2.f2904dn != null && m2921d.mo2734i() != null && this.f2722dG.f3319e >= customUnitMetadata2.f2904dn.f2650p) {
                    this.f2711b.m3349a(customUnitMetadata2.f2904dn, 5);
                }
            }
            this.f2691g = z6;
            if (this.f2691g) {
                this.f1614bT = 0.0f;
                this.f1615bU = 0.0f;
                this.speed = 0.0f;
            }
        }
        if (this.customUnitMetadataB != null && !z4) {
            Team.m3940b((Unit) this);
            m3206a(this.customUnitMetadataB, false, false, this.f2705z);
            this.customUnitMetadataB = null;
            this.f2705z = null;
            CustomUnitMetadata customUnitMetadata3 = this.customUnitMetadataA;
            Team.m3924c(this);
        }
        this.f2711b.m3351a(f);
        m3204b(f, z);
        CustomUnitMetadata customUnitMetadata4 = this.customUnitMetadataA;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cv */
    public float getIncome() {
        int i = this.customUnitMetadataA.f3058cg.f2538b;
        if (!this.f2717p) {
            return 0.0f;
        }
        return i * this.customUnitMetadataA.f2860ck;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cw */
    public C0421e mo3174cw() {
        if (!this.f2717p) {
            return C0421e.f2634a;
        }
        return this.customUnitMetadataA.f3059ch;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cx */
    public C0421e mo3173cx() {
        if (!this.f2717p) {
            return C0421e.f2634a;
        }
        return this.customUnitMetadataA.f3060ci;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public boolean mo2625a(int i, Unit unit, boolean z, boolean z2) {
        return m3210a(this.customUnitMetadataA.f3087fF[i], i, unit, z, z2);
    }

    /* renamed from: a */
    public final boolean m3211a(C0394bk c0394bk, int i, float f, float f2, boolean z) {
        GameEngine gameEngine = GameEngine.getInstance();
        float distanceSq = CommonUtils.distanceSq(this.x, this.y, f, f2);
        if (distanceSq > c0394bk.f2415ad) {
            if (this.team == gameEngine.playerTeam) {
                gameEngine.interfaceEngine.m1879a("Location too far");
                return false;
            }
            return false;
        } else if (distanceSq < c0394bk.f2460ag) {
            if (this.team == gameEngine.playerTeam) {
                gameEngine.interfaceEngine.m1879a("Location too close");
                return false;
            }
            return false;
        } else {
            return true;
        }
    }

    /* renamed from: a */
    public final boolean m3210a(C0394bk c0394bk, int i, Unit unit, boolean z, boolean z2) {
        float f;
        if (!z && (c0394bk.f2390H || z2)) {
            float distanceSq = CommonUtils.distanceSq(this.x, this.y, unit.x, unit.y);
            if (distanceSq > c0394bk.f2415ad || distanceSq < c0394bk.f2460ag) {
                return false;
            }
        }
        if (!c0394bk.f2389G) {
            return true;
        }
        if (c0394bk.f2461ah != -1.0f) {
            if (c0394bk.f2449v != -1) {
                f = this.f1532cC[c0394bk.f2449v].f1652a + c0394bk.f2432i;
            } else {
                f = this.direction + c0394bk.f2432i;
            }
            if (CommonUtils.absf(CommonUtils.m1670c(f, CommonUtils.m1659d(this.x, this.y, unit.x, unit.y), 360.0f)) > c0394bk.f2461ah) {
                return false;
            }
        }
        if (c0394bk.f2395M != null && !c0394bk.f2395M.read(this)) {
            return false;
        }
        if (c0394bk.f2396N != null && !ValueListSource.m3248a(c0394bk.f2396N, unit.mo3167da())) {
            return false;
        }
        if (c0394bk.f2397O != null && ValueListSource.m3248a(c0394bk.f2397O, unit.mo3167da())) {
            return false;
        }
        if (unit.mo2676i()) {
            if (c0394bk.f2391I != null) {
                return c0394bk.f2391I.read(this);
            }
            return true;
        } else if (unit.isUnderwater()) {
            if (c0394bk.f2393K != null) {
                return c0394bk.f2393K.read(this);
            }
            return true;
        } else if (c0394bk.f2394L != null && !c0394bk.f2394L.read(this) && !unit.m3752cF()) {
            return false;
        } else {
            if (c0394bk.f2392J != null) {
                return c0394bk.f2392J.read(this);
            }
            return true;
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void fireProjectile(Unit unit, int i) {
        C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
        if (!c0394bk.f2451A || !m3210a(c0394bk, i, unit, false, false)) {
            return;
        }
        for (int i2 = 0; i2 < this.customUnitMetadataA.f3087fF.length; i2++) {
            C0394bk c0394bk2 = this.customUnitMetadataA.f3087fF[i2];
            if (c0394bk2 != null && i2 != i && c0394bk2.f2419an != null && c0394bk2.f2419an == c0394bk && this.f1532cC[i2].f1656e < 9000.0f - ((getShootDelay(i) * 0.5f) - c0394bk2.f2442m)) {
                this.f1532cC[i2].f1656e = 0.0f;
            }
        }
        if (c0394bk.f2449v != -1) {
            C0394bk c0394bk3 = this.customUnitMetadataA.f3087fF[c0394bk.f2449v];
            if (!c0394bk3.f2451A && c0394bk3.f2444o != 0.0f) {
                this.f1532cC[c0394bk.f2449v].f1656e = getShootDelay(c0394bk.f2449v) + mo2439t(c0394bk.f2449v);
            }
        }
        this.f2711b.m3348a(this.customUnitMetadataA.f3071dj, 11, true);
        m3200b(c0394bk);
        m3217a(unit, -1.0f, -1.0f, i, (C0388be) null, 0);
    }

    /* renamed from: a */
    public boolean m3212a(C0394bk c0394bk) {
        if (c0394bk.f2448t > 0.0f && (c0394bk.f2448t > this.f1549cs || this.f2700u)) {
            return false;
        }
        if (c0394bk.f2436u != null && !c0394bk.f2436u.mo3358b(this)) {
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m3200b(C0394bk c0394bk) {
        if (c0394bk.f2448t > 0.0f) {
            this.f1549cs -= c0394bk.f2448t;
            if (this.f1549cs < c0394bk.f2448t && this.customUnitMetadataA.f2837cG) {
                this.f2700u = true;
            }
        }
        if (c0394bk.f2436u != null) {
            c0394bk.f2436u.mo3364a(this);
        }
    }

    /* renamed from: a */
    public static Projectile m3216a(Unit unit, int i, C0388be c0388be, float f, float f2, float f3, float f4) {
        Projectile createProjectile = Projectile.createProjectile(unit, f, f2, f3, i);
        m3220a(createProjectile, unit, i, c0388be, f, f2, f3, f4);
        return createProjectile;
    }

    /* renamed from: a */
    public static void m3220a(Projectile projectile, Unit unit, int i, C0388be c0388be, float f, float f2, float f3, float f4) {
        EffectObject m2222a;
        GameEngine gameEngine = GameEngine.getInstance();
        projectile.f1008az = f4;
        projectile.f1074aT = f4;
        if (unit == null) {
            throw new RuntimeException("Source cannot be null");
        }
        projectile.f1043g = c0388be;
        projectile.f963G = c0388be.f1091aI;
        projectile.f1073aR = c0388be.f1177aJ;
        projectile.directDamage = c0388be.f1115b;
        projectile.f973Y = c0388be.f1120c;
        if (!c0388be.f1095aN && (unit instanceof C0433j)) {
            C0433j c0433j = (C0433j) unit;
            projectile.directDamage *= c0433j.f2703x.shootdamagemultiplier;
            projectile.f973Y *= c0433j.f2703x.shootdamagemultiplier;
        }
        projectile.f974Z = c0388be.f1129i;
        if (c0388be.f1132l) {
            projectile.f995aa = false;
            projectile.f1058ab = true;
        } else {
            projectile.f995aa = !c0388be.f1131k;
        }
        projectile.f1059ac = c0388be.f1134n;
        if (c0388be.f1133m) {
            projectile.f1060ad = true;
            projectile.f1061ae = false;
        }
        projectile.f960D = c0388be.f1136p;
        projectile.f993aY = c0388be.f1137q;
        projectile.f994aZ = c0388be.f1138r;
        if (c0388be.f1135o < 0.5d) {
            projectile.f959C = true;
        } else {
            projectile.f1050H = c0388be.f1135o;
        }
        projectile.lifeTimer = c0388be.f1127v;
        projectile.f1012i = c0388be.f1126u;
        projectile.speed = c0388be.f1141w;
        if (c0388be.f1094aM != 0.0f) {
            projectile.speed += CommonUtils.m1722a((GameObject) unit, (int) ((-c0388be.f1094aM) * 100.0f), (int) (c0388be.f1094aM * 100.0f), 1) / 100.0f;
        }
        if (c0388be.f1087T && i != -1) {
            projectile.f1004au = unit;
            if (unit instanceof OrderableUnit) {
                projectile.f1068av = i;
                C0918ai mo2666D = ((OrderableUnit) unit).mo2666D(i);
                projectile.f1005aw = mo2666D.f6260a;
                projectile.f1006ax = mo2666D.f6261b;
                projectile.f1007ay = unit.height + mo2666D.f6262c;
            } else {
                projectile.f1005aw = unit.x;
                projectile.f1006ax = unit.y;
                projectile.f1007ay = unit.height;
            }
        }
        projectile.f1023w = c0388be.f1079D;
        projectile.f1021u = c0388be.f1080E;
        projectile.f1022v = c0388be.f1081F;
        projectile.f996af = c0388be.f1096aO;
        projectile.f997ag = c0388be.f1097aP;
        projectile.f998ah = c0388be.f1098aQ;
        projectile.f1062ai = c0388be.f1178aR;
        projectile.f1064ak = c0388be.f1179aS;
        projectile.f1065al = c0388be.f1180aT;
        projectile.f1066am = c0388be.f1181aU;
        projectile.f999an = c0388be.f1099aV;
        if (c0388be.f1182aW > 0.0f) {
            projectile.f1000ao = true;
            projectile.f1056W = c0388be.f1182aW;
            projectile.f1057X = projectile.f1056W;
        }
        projectile.color = c0388be.f1173aE;
        if (c0388be.f1175aG != 0.0f) {
            float f5 = c0388be.f1176aH;
            int m4734a = Color.m4734a(projectile.color);
            int m4730b = (int) (Color.m4730b(projectile.color) * f5);
            int m4729c = (int) (Color.m4729c(projectile.color) * f5);
            int m4728d = (int) (Color.m4728d(projectile.color) * f5);
            int m3983E = unit.team.m3983E();
            projectile.color = Color.argb(m4734a, CommonUtils.m1687b((int) (m4730b + (Color.m4730b(m3983E) * c0388be.f1175aG)), 0, 255), CommonUtils.m1687b((int) (m4729c + (Color.m4729c(m3983E) * c0388be.f1175aG)), 0, 255), CommonUtils.m1687b((int) (m4728d + (Color.m4728d(m3983E) * c0388be.f1175aG)), 0, 255));
        }
        projectile.f1051P = c0388be.f1142x;
        projectile.f1053R = c0388be.f1128y;
        projectile.visible = !c0388be.f1076A;
        projectile.f1052Q = c0388be.f1143z;
        if (c0388be.f1077B != null) {
            projectile.f1051P = (short) 0;
            projectile.f1053R = (short) 0;
        }
        projectile.f1047x = c0388be.f1174aF;
        projectile.f1015m = c0388be.f1139s;
        projectile.f957A = c0388be.f1144I;
        projectile.f968M = c0388be.f1153V;
        projectile.f958B = c0388be.f1154W;
        projectile.f982aH = c0388be.f1156ae;
        projectile.f981aG = c0388be.f1167aw;
        projectile.f983aM = c0388be.f1157af;
        if (c0388be.f1108ai != null) {
            c0388be.f1108ai.m3043a(projectile.x, projectile.y, projectile.height, projectile.f1008az, projectile);
        }
        if (c0388be.f1160ao != -1) {
            boolean z = false;
            EffectObject effectObject = projectile.f986aP;
            if (effectObject != null && effectObject.f4324b == projectile && effectObject.f4326d && effectObject != null) {
                if (effectObject.timer < 150.0f) {
                    effectObject.timer = 200.0f;
                }
                z = true;
            }
            if (!z && (m2222a = gameEngine.effects.m2222a(projectile, c0388be.f1160ao, c0388be.f1161ap)) != null) {
                if (c0388be.f1113aq) {
                    m2222a.f4325c = true;
                }
                if (c0388be.f1147L) {
                    projectile.f986aP = m2222a;
                }
            }
        }
        projectile.f987aQ = c0388be.f1162ar;
        if (c0388be.f1163as != -1.0f) {
            projectile.f1069aI = c0388be.f1163as;
        }
        if (c0388be.f1164at != -1.0f) {
            projectile.f1070aJ = c0388be.f1164at;
        }
        projectile.f1072aL = -1.0f;
        if (c0388be.f1165au != -1.0f) {
            projectile.f1045r = c0388be.f1165au;
        }
        projectile.f1046s = c0388be.f1166av;
        if (c0388be.f1102aZ != null) {
        }
        projectile.f979aE = c0388be.f1119bd;
        projectile.f6366ed = unit.f6366ed;
        if (projectile.f6366ed < 4 && f3 >= -1.0f) {
            projectile.f6366ed = 4;
        }
        if (c0388be.f1152U) {
            projectile.f6366ed = 1;
        }
    }

    /* renamed from: a */
    public Projectile m3217a(Unit unit, float f, float f2, int i, C0388be c0388be, int i2) {
        C0388be c0388be2;
        GameEngine gameEngine = GameEngine.getInstance();
        C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
        if (c0394bk.f2425az != null) {
            this.f2711b.m3348a(c0394bk.f2425az.m3057b(), 6, true);
        }
        if (c0394bk.f2404aA > 0.0f) {
            m2543b(c0394bk.f2404aA);
        }
        if (c0394bk.f2405aB != null) {
            c0394bk.f2405aB.m3053a(this, new PointF(f, f2), unit, i2 + 1);
        }
        if (c0388be == null) {
            c0388be2 = this.customUnitMetadataA.f2962fG[c0394bk.m3435a(this)];
        } else {
            c0388be2 = c0388be;
        }
        PointF mo2655J = mo2655J(i);
        C0918ai mo2666D = mo2666D(i);
        if (c0394bk.f2411aH > 0) {
            for (int i3 = 0; i3 < c0394bk.f2411aH; i3++) {
                if (this.f2718A != null && this.f2718A.size() > 0) {
                    Unit unit2 = (Unit) this.f2718A.remove(this.f2718A.size() - 1);
                    C0235aj c0235aj = this.f1532cC[i];
                    C0955y.m451a(unit2, this);
                    unit2.x = mo2666D.f6260a;
                    unit2.y = mo2666D.f6261b;
                    unit2.direction = c0235aj.f1652a;
                    if (unit2 instanceof OrderableUnit) {
                        OrderableUnit orderableUnit = (OrderableUnit) unit2;
                        orderableUnit.m2545ay();
                        if (unit != null) {
                            orderableUnit.m2451n(unit);
                        } else {
                            orderableUnit.m2485e(f, f2);
                        }
                    }
                }
            }
        }
        Projectile projectile = null;
        if (c0388be2.f1147L && c0388be == null) {
            if (this.f2683dC == null) {
                this.f2683dC = new Projectile[31];
            }
            if (this.f2683dC[i] != null && !this.f2683dC[i].deleted) {
                projectile = this.f2683dC[i];
                projectile.m4036a(this, mo2666D.f6260a, mo2666D.f6261b, this.height + mo2666D.f6262c);
                if (!c0388be2.f1149N && projectile.f1001ap != null) {
                    projectile.f1001ap.clear();
                }
            }
        }
        this.f1530bu = (int) (this.f1530bu + 1 + this.GameObjectID);
        float f3 = this.f1532cC[i].f1652a;
        boolean z = false;
        if (projectile == null) {
            projectile = Projectile.createProjectile(this, mo2666D.f6260a, mo2666D.f6261b, this.height + mo2666D.f6262c, i);
            if (c0388be2.f1147L && c0388be == null) {
                this.f2683dC[i] = projectile;
            }
        } else {
            projectile.f1043g = c0388be2;
            z = true;
        }
        m3220a(projectile, this, i, c0388be2, mo2666D.f6260a, mo2666D.f6261b, this.height + mo2666D.f6262c, f3);
        c0388be2.m3453a(this, projectile, unit, f, f2, getMaxAttackRange());
        if (!z && c0388be2.f1085R == 0.0f && c0388be2.f1086S == 0.0f) {
            projectile.x = mo2655J.x;
            projectile.y = mo2655J.y;
        }
        if (c0394bk.f2388F != null) {
            gameEngine.effects.emitLight(mo2666D.f6260a, mo2666D.f6261b, this.height + mo2666D.f6262c, c0394bk.f2388F.intValue());
        }
        if (c0394bk.f2386D != null) {
            c0394bk.f2386D.m3043a(mo2666D.f6260a, mo2666D.f6261b, this.height + mo2666D.f6262c, this.f1532cC[i].f1652a, this);
        }
        if (c0394bk.f2385C != null) {
            c0394bk.f2385C.m3441a(mo2666D.f6260a, mo2666D.f6261b, 1.0f + CommonUtils.rnd(-0.07f, 0.07f));
        }
        if (this.customUnitMetadataA.f2890dV) {
            this.f3674K = null;
        }
        if (c0394bk.f2423ax) {
            this.f1532cC[i].f1661j = null;
        }
        if (this.customUnitMetadataA.f2812be && !this.dead) {
            mo2502bu();
        }
        if (this.customUnitMetadataA.f2814bg && !this.dead) {
            remove();
            this.dead = true;
        }
        return projectile;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public float getMaxAttackRange() {
        return this.f2703x.maxattackrange;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: y */
    public int mo2719y() {
        if (this.f2703x.f2182o != -1) {
            return this.f2703x.f2182o;
        }
        return super.mo2719y();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: u */
    public int mo2721u(Unit unit) {
        int mo3130a = unit.getUnitType().mo3130a(this);
        if (this.customUnitMetadataA.f3048aR != -1) {
            if (this.customUnitMetadataA.f2767aS) {
                int i = (int) (this.customUnitMetadataA.f3048aR + this.radius);
                if (unit != null) {
                    i = (int) (i + unit.radius);
                }
                return i + mo3130a;
            }
            return this.customUnitMetadataA.f3048aR + mo3130a;
        }
        return mo2719y() + mo3130a;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: v */
    public int mo2720v(Unit unit) {
        int mo3130a = unit.getUnitType().mo3130a(this);
        if (this.customUnitMetadataA.f3049aT != -1) {
            if (this.customUnitMetadataA.f2768aU) {
                int i = (int) (this.customUnitMetadataA.f3049aT + this.radius);
                if (unit != null) {
                    i = (int) (i + unit.radius);
                }
                return i + mo3130a;
            }
            return this.customUnitMetadataA.f3049aT + mo3130a;
        }
        return mo2719y() + mo3130a;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: w */
    public boolean mo3142w(Unit unit) {
        return this.customUnitMetadataA.f2768aU;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: x */
    public boolean mo3141x(Unit unit) {
        return this.customUnitMetadataA.f2767aS;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cu */
    public float mo3175cu() {
        return this.customUnitMetadataA.f2808ba;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public float mo2748c(Unit unit) {
        return this.customUnitMetadataA.f2769aV;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: z */
    public float mo3140z(Unit unit) {
        float f = this.customUnitMetadataA.f2770aW;
        if (unit.mo2862g() > 0.0f) {
            f = unit.mo2862g() * this.customUnitMetadataA.f3050aX;
        }
        return f;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: f */
    public float mo2480f(Unit unit) {
        return this.customUnitMetadataA.f2771aY;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public float mo2749b(Unit unit) {
        return this.customUnitMetadataA.f2772aZ;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float getMoveSpeed() {
        return this.f2703x.movespeed * this.f2715j;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: aY */
    public float mo2572aY() {
        return this.customUnitMetadataA.f2893dY;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: aZ */
    public float mo2571aZ() {
        return this.customUnitMetadataA.f2894dZ;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float getTurnSpeed() {
        return this.f2703x.maxturnspeed;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: c */
    public float getTurretTurnSpeed(int i) {
        C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
        if (c0394bk.f2399T != null) {
            return c0394bk.f2399T.floatValue();
        }
        return this.customUnitMetadataA.f2885dQ;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: x */
    public float mo2434x(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2452P;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: w */
    public float mo2436w(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2455U;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: y */
    public float mo2433y(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2456V;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2671B() {
        return this.customUnitMetadataA.f2937ed;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cB */
    public float mo3194cB() {
        return this.customUnitMetadataA.f3053bC * this.f2712c;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: p */
    public float mo2448p(int i) {
        return this.customUnitMetadataA.f3054bD;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public float mo2836d(boolean z) {
        if (!this.customUnitMetadataA.f2907dq) {
            return 0.0f;
        }
        if (z && this.customUnitMetadataA.f2909ds) {
            return this.f1532cC[this.customUnitMetadataA.f2911du.f2429e].f1652a + 90.0f;
        }
        if (this.customUnitMetadataA.f2908dr) {
            return this.f1532cC[this.customUnitMetadataA.f2911du.f2429e].f1652a + 90.0f;
        }
        return super.mo2836d(z);
    }

    static {
        for (int i = 0; i < 10; i++) {
            f2710dP.add(new C0434k());
        }
        f2674dQ = true;
        f2675dR = new HashMap();
        f2676dS = 0;
        f2677dT = VariableScope.nullOrMissingString;
        f2678dU = new PointF();
        f2679dW = new C0918ai();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cU */
    public PointF mo3184cU() {
        PointF pointF = f2706dD;
        CustomUnitMetadata customUnitMetadata = this.customUnitMetadataA;
        if (customUnitMetadata.f2908dr && this.f1532cC[customUnitMetadata.f2911du.f2429e].f1656e != 0.0f && customUnitMetadata.f2911du.f2444o != 0.0f) {
            pointF.m4669a(mo2662F(customUnitMetadata.f2911du.f2429e));
            pointF.m4668b(-this.x, -this.y);
            return pointF;
        }
        pointF.x = 0.0f;
        pointF.y = 0.0f;
        return pointF;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: aO */
    public PointF mo2582aO() {
        PointF mo3184cU = mo3184cU();
        f2707dE.set(mo3184cU.x + this.customUnitMetadataA.f2871cy, mo3184cU.y + this.customUnitMetadataA.f2872cz);
        return f2707dE;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: c */
    public boolean draw(float f) {
        BitmapOrTexture mo2649S;
        float f2;
        float f3;
        if (this.f2723dM != null && !this.dead) {
            C0377c.m3483a(this, f, false, false);
        }
        if (!super.draw(f)) {
            return false;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        C0955y.m449a((OrderableUnit) this);
        if (this.f2723dM != null && !this.dead && this.customUnitMetadataA.f3044as) {
            C0377c.m3483a(this, f, true, false);
        }
        if (mo2560aj() && this.customUnitMetadataA.f3091fK != null && !this.dead) {
            float mo2483e = this.f1532cC[this.customUnitMetadataA.f3091fK.f2429e].f1657f / mo2483e(this.customUnitMetadataA.f3091fK.f2429e);
            if (mo2483e != 0.0f) {
                boolean z = true;
                boolean X = m2644X();
                if (X && this.customUnitMetadataA.f2801bR) {
                    z = false;
                } else if (!X && this.customUnitMetadataA.f2797bN) {
                    z = false;
                }
                if (z && this.customUnitMetadataA.f3087fF[this.customUnitMetadataA.f3091fK.f2429e].f2408aE == null) {
                    C0918ai bm = m2510bm();
                    gameEngine.graphics.mo135j();
                    gameEngine.graphics.mo164b(bm.f6260a - gameEngine.viewpointX_rounded, ((bm.f6261b - bm.f6262c) - gameEngine.viewpointY_rounded) - this.height);
                    gameEngine.graphics.mo224a(mo2483e, mo2483e);
                    if (X) {
                        gameEngine.graphics.mo196a(Builder.f3407f, 0.0f, 0.0f, (Paint) null);
                    } else {
                        gameEngine.graphics.mo196a(Builder.f3406e, 0.0f, 0.0f, (Paint) null);
                    }
                    gameEngine.graphics.mo134k();
                }
            }
        }
        if (this.customUnitMetadataA.f2961fE && !this.dead) {
            int mo2512bk = mo2512bk();
            for (int i = 0; i < mo2512bk; i++) {
                float mo2483e2 = this.f1532cC[i].f1657f / mo2483e(i);
                C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
                if (c0394bk != null && mo2483e2 != 0.0f && c0394bk.f2408aE != null) {
                    C0955y.m447a(this, c0394bk.f2408aE, mo2483e2, i);
                }
            }
        }
        if (!this.dead && this.shield > 0.0f && this.f1547cq == 0.0f && (mo2649S = mo2649S()) != null) {
            if (!this.customUnitMetadataA.f2840cJ) {
                f2 = 0.0f + 0.09f + ((this.shield / this.maxShield) * 0.4f) + ((CommonUtils.m1693b(this.f1546cp, 50.0f) / 50.0f) * 0.5f);
            } else {
                float m1693b = 0.0f + ((CommonUtils.m1693b(this.f1546cp, 50.0f) / 50.0f) * 0.5f);
                float f4 = this.f1546cp;
                if (f4 > 5.0f) {
                    f4 = 5.0f;
                }
                f2 = m1693b + ((f4 / 5.0f) * 0.2f);
            }
            if (f2 > 0.0f) {
                if (f2 > 1.0f) {
                    f2 = 1.0f;
                }
                if (this.f2684dF == null) {
                    this.f2684dF = C0955y.m467a();
                }
                Paint paint = this.f2684dF;
                paint.m4717a((int) (f2 * 255.0f), 255, 255, 255);
                float f5 = this.x - gameEngine.viewpointX_rounded;
                float f6 = (this.y - gameEngine.viewpointY_rounded) - this.height;
                if (!this.customUnitMetadataA.f3042ap) {
                    f3 = ((this.customUnitMetadataA.f2848cU * 2) / 87.0f) * 1.25f;
                } else {
                    f3 = ((this.customUnitMetadataA.f2848cU * 2) / mo2649S.width) * 1.25f;
                }
                gameEngine.graphics.mo135j();
                gameEngine.graphics.mo222a(f3, f3, f5, f6);
                gameEngine.graphics.mo197a(mo2649S, f5, f6, mo2836d(false) - 90.0f, paint);
                gameEngine.graphics.mo134k();
            }
        }
        if (this.customUnitMetadataA.f3019i.size > 0) {
            Object[] items = this.customUnitMetadataA.f3019i.getItems();
            for (int i2 = this.customUnitMetadataA.f3019i.size - 1; i2 >= 0; i2--) {
                ((AbstractC0375a) items[i2]).m3484c(this, f);
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: S */
    public BitmapOrTexture mo2649S() {
        return this.customUnitMetadataA.f3041ao;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float getMoveAccelerationSpeed() {
        return this.customUnitMetadataA.f2874dB;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public float getMoveDecelerationSpeed() {
        return this.customUnitMetadataA.f2875dC;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bh */
    public boolean mo2515bh() {
        return this.customUnitMetadataA.f2881dM;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bi */
    public boolean mo2514bi() {
        return this.customUnitMetadataA.f2882dN;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: l */
    public boolean canAttack() {
        return this.customUnitMetadataA.f2938ee;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: af */
    public boolean mo2564af() {
        return this.customUnitMetadataA.f2940eg.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ae */
    public boolean canAttackFly() {
        return this.customUnitMetadataA.f2939ef.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ad */
    public boolean mo2566ad() {
        return this.customUnitMetadataA.f2941eh.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ag */
    public boolean mo2563ag() {
        if (this.customUnitMetadataA.f2942ei == null) {
            return true;
        }
        return this.customUnitMetadataA.f2942ei.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: k */
    public boolean mo2461k(Unit unit) {
        CustomUnitMetadata customUnitMetadata = this.customUnitMetadataA;
        if (customUnitMetadata.f2943ej) {
            if (customUnitMetadata.f2944ek != null && !ValueListSource.m3248a(customUnitMetadata.f2944ek, unit.mo3167da())) {
                return false;
            }
            if (customUnitMetadata.f2945el != null && ValueListSource.m3248a(customUnitMetadata.f2945el, unit.mo3167da())) {
                return false;
            }
            if (customUnitMetadata.f2946em) {
                boolean z = false;
                for (int i = 0; i < customUnitMetadata.f3087fF.length; i++) {
                    C0394bk c0394bk = customUnitMetadata.f3087fF[i];
                    if ((c0394bk.f2397O == null || !ValueListSource.m3248a(c0394bk.f2397O, unit.mo3167da())) && (c0394bk.f2396N == null || ValueListSource.m3248a(c0394bk.f2396N, unit.mo3167da()))) {
                        z = true;
                        break;
                    }
                }
                if (!z) {
                    return false;
                }
            }
        }
        if (unit.mo2676i()) {
            return canAttackFly();
        }
        if (unit.isUnderwater()) {
            return mo2566ad();
        }
        if (!mo2563ag() && !unit.m3752cF()) {
            return false;
        }
        return mo2564af();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public boolean isFixedFiring() {
        return this.customUnitMetadataA.f2947en;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: g */
    public float getTurretSize(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2400W;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: z */
    public float mo2431z(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2458aa;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: A */
    public float mo2672A(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2460ag;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: B */
    public float mo2670B(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2432i;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: C */
    public float mo2668C(int i) {
        float f;
        float f2;
        C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
        if (c0394bk.f2449v != -1) {
            f = this.f1532cC[c0394bk.f2449v].f1652a;
        } else {
            f = this.direction;
        }
        if (this.f1524bZ && mo2521bb() > 0.95d) {
            f2 = f + c0394bk.f2433j;
        } else {
            f2 = f + c0394bk.f2432i;
        }
        if (c0394bk.f2467aq != 0.0f) {
            return 999.0f;
        }
        return f2;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bl */
    public boolean mo2511bl() {
        return this.customUnitMetadataA.f2916dz;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: q */
    public float getDirectDamage(int i) {
        C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
        if (!c0394bk.f2451A) {
            return 0.0f;
        }
        C0388be c0388be = this.customUnitMetadataA.f2962fG[c0394bk.m3435a(this)];
        float f = 0.0f;
        if (!c0388be.f1139s) {
            f = 0.0f + c0388be.f1115b;
        }
        float f2 = f + c0388be.f1120c;
        if (!c0388be.f1095aN) {
            f2 *= this.f2703x.shootdamagemultiplier;
        }
        return f2;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public float getShootDelay(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2441l * this.f2703x.shootdelaymultiplier;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: e */
    public float mo2483e(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2442m;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: f */
    public float mo2481f(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2443n;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: s */
    public boolean mo2440s(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2447r;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: t */
    public float mo2439t(int i) {
        C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
        if (c0394bk.f2435s == 0.0f || c0394bk.f2442m == 0.0f) {
            return 0.0f;
        }
        return -(c0394bk.f2435s * (this.f1532cC[i].f1657f / c0394bk.f2442m));
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: r */
    public boolean mo2443r(int i) {
        if (this.customUnitMetadataA.f3087fF[i].f2451A) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public void mo2535b(Unit unit, int i) {
        C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
        if (c0394bk.f2387E != null) {
            PointF turretEnd = getTurretEnd(i);
            c0394bk.f2387E.m3043a(turretEnd.x, turretEnd.y, this.height, this.f1532cC[i].f1652a, this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: u */
    public boolean mo2438u(int i) {
        if (!m3212a(this.customUnitMetadataA.f3087fF[i])) {
            return false;
        }
        return super.mo2438u(i);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: s */
    public int mo3143s(Unit unit) {
        return this.customUnitMetadataA.f2950eq;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bN */
    public boolean mo3198bN() {
        return this.customUnitMetadataA.core_isBio;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bO */
    public boolean mo3197bO() {
        return this.customUnitMetadataA.core_isBug;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bM */
    public float getMass() {
        return this.f2703x.f2169b;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cE */
    public boolean mo3193cE() {
        return this.customUnitMetadataA.graphics_image_shadow_frames;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public Rect getImageSrcRect(boolean z) {
        float f;
        if (z && !this.customUnitMetadataA.graphics_image_shadow_frames) {
            return super.getImageSrcRect(z);
        }
        if (this.dead) {
            return super.getImageSrcRect(z);
        }
        CustomUnitMetadata customUnitMetadata = this.customUnitMetadataA;
        int i = this.f2681a;
        int i2 = 0;
        C0437m c0437m = customUnitMetadata.f2913dw;
        if (this.f2711b.f2560a != null && this.f2711b.f2560a.f2647j != null) {
            c0437m = this.f2711b.f2560a.f2647j;
        }
        if (c0437m != null) {
            float f2 = c0437m.f3129b;
            if (f2 < 0.0f) {
                f2 = -f2;
                f = -this.direction;
                if (c0437m.f3128a) {
                    f = -this.f1532cC[customUnitMetadata.f2911du.f2429e].f1652a;
                }
            } else {
                f = this.direction;
                if (c0437m.f3128a) {
                    f = this.f1532cC[customUnitMetadata.f2911du.f2429e].f1652a;
                }
            }
            int i3 = (int) (360.0f / f2);
            int i4 = ((int) (((f - c0437m.f3132e) - (f2 * 0.5f)) / f2)) % i3;
            if (i4 < 0) {
                i4 += i3;
            }
            if (c0437m.f3130c > 0) {
                i += i4 * c0437m.f3130c;
            }
            if (c0437m.f3131d > 0) {
                i2 = 0 + (i4 * c0437m.f3131d);
            }
        }
        if (i >= customUnitMetadata.f3031S) {
            i2 += i / customUnitMetadata.f3031S;
            i %= customUnitMetadata.f3031S;
        }
        return super.m3770a(z, i, i2);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cD */
    public RectF mo2967cD() {
        RectF cD = super.mo2967cD();
        if (this.customUnitMetadataA.graphics_image_offsetX != 0 || this.customUnitMetadataA.graphics_image_offsetY != 0) {
            cD.m4653a(this.customUnitMetadataA.graphics_image_offsetX, this.customUnitMetadataA.graphics_image_offsetY);
        }
        return cD;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bk */
    public int mo2512bk() {
        if (this.customUnitMetadataA == null) {
            return 1;
        }
        return this.customUnitMetadataA.f3087fF.length;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: v */
    public int mo2437v(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2450w;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: F */
    public PointF mo2662F(int i) {
        return m3221a(i, false);
    }

    /* renamed from: a */
    public PointF m3221a(int i, boolean z) {
        float f;
        float f2;
        float f3;
        C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
        if (c0394bk.f2449v == -1) {
            f3 = this.x;
            f2 = this.y;
            f = this.direction;
        } else if (z) {
            throw new RuntimeException("Turret can not be attached to turret that is not attached to the body");
        } else {
            PointF m3221a = m3221a(c0394bk.f2449v, true);
            f3 = m3221a.x;
            f2 = m3221a.y;
            f = this.f1532cC[c0394bk.f2449v].f1652a;
        }
        if (this.f1532cC[i].f1656e > 0.0f && c0394bk.f2444o != 0.0f) {
            float f4 = 0.0f;
            float shootDelay = (getShootDelay(i) + mo2439t(i)) - this.f1532cC[i].f1656e;
            if (shootDelay < c0394bk.f2445p) {
                f4 = (shootDelay / c0394bk.f2445p) * c0394bk.f2444o;
            } else if (shootDelay < c0394bk.f2445p + c0394bk.f2446q) {
                f4 = c0394bk.f2444o - (((shootDelay - c0394bk.f2445p) / c0394bk.f2446q) * c0394bk.f2444o);
            }
            if (f4 != 0.0f) {
                f3 += CommonUtils.cos(this.f1532cC[i].f1652a) * f4;
                f2 += CommonUtils.sin(this.f1532cC[i].f1652a) * f4;
            }
        }
        float f5 = c0394bk.f2430f;
        float f6 = c0394bk.f2431g;
        if (f5 != 0.0f || f6 != 0.0f) {
            float sin = CommonUtils.sin(f);
            float cos = CommonUtils.cos(f);
            f3 += (cos * f6) - (sin * f5);
            f2 += ((sin * f6) + (cos * f5)) * c0394bk.f2440h;
        }
        f3752ba.x = f3;
        f3752ba.y = f2;
        return f3752ba;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: M */
    public ArrayList mo2712M() {
        if (this.customUnitMetadataB != null) {
            return this.customUnitMetadataB.mo3132a(mo2647U());
        }
        return this.customUnitMetadataA.mo3132a(mo2647U());
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public Action mo3219a(C0202c c0202c) {
        CustomUnitMetadata customUnitMetadata;
        if (this.customUnitMetadataB != null) {
            customUnitMetadata = this.customUnitMetadataB;
        } else {
            customUnitMetadata = this.customUnitMetadataA;
        }
        return customUnitMetadata.m3131a(c0202c);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: U */
    public int mo2647U() {
        return this.customUnitMetadataA.f2857ce;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public Action getSpecialActionFor(UnitType unitType) {
        return this.f2722dG.m2925b(unitType);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo2752a(Action action, boolean z, PointF pointF, Unit unit) {
        if (action == LandingCraft.f3456i) {
            if (!z) {
                m3224L();
            } else {
                m3159dn();
            }
        } else if (action == LandingCraft.f3457j) {
            if (!z) {
                m3159dn();
            }
        } else {
            if (!z) {
                if (pointF != null && !mo2623a(action, pointF.x, pointF.y)) {
                    return;
                }
                if (action instanceof C0330g) {
                    C0330g c0330g = (C0330g) action;
                    if (c0330g.f2085a.f2026ar != null) {
                        GameEngine gameEngine = GameEngine.getInstance();
                        if (this.team == gameEngine.playerTeam && !gameEngine.m925E()) {
                            c0330g.f2085a.f2026ar.m3443a();
                        }
                    }
                    if (c0330g.f2085a.f2022an != null) {
                        c0330g.f2085a.f2022an.m3043a(this.x, this.y, this.height, this.direction, this);
                    }
                }
            }
            if (z && (action instanceof C0330g) && !((C0330g) action).f2085a.f2062J) {
                return;
            }
            Item m2938a = this.f2722dG.m2938a(action, z, pointF, unit);
            if (!z) {
                if (m2938a != null) {
                    m3776a(EnumC0334ad.f2109f);
                }
            } else if (m2938a != null) {
                m3776a(EnumC0334ad.f2110g);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo2711a(Action action, boolean z) {
        mo2752a(action, z, (PointF) null, (Unit) null);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public void mo2949b(Action action, boolean z) {
        this.f2722dG.m2939a(action, z);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b */
    public void mo2950b(Action action) {
        this.f2722dG.m2940a(action);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public boolean mo2623a(Action action, float f, float f2) {
        if (action instanceof C0330g) {
            GameEngine gameEngine = GameEngine.getInstance();
            C0330g c0330g = (C0330g) action;
            if (c0330g.f2085a.f2012ad != null && c0330g.f2085a.f2013ae == null) {
                if (c0330g.f2085a.f2012ad.intValue() >= this.customUnitMetadataA.f3087fF.length) {
                    m2600a("checkTargetedActionOrder: " + c0330g.f2085a.f2012ad + " larger than max turret size");
                    return true;
                } else if (!m3211a(this.customUnitMetadataA.f3087fF[c0330g.f2085a.f2012ad.intValue()], c0330g.f2085a.f2012ad.intValue(), f, f2, true)) {
                    return false;
                } else {
                    if (c0330g.f2085a.f2017ai != null && C0955y.m463a(f, f2, c0330g.f2085a.f2017ai)) {
                        if (this.team == gameEngine.playerTeam) {
                            gameEngine.interfaceEngine.m1879a("Invalid map location (Must be passable by " + c0330g.f2085a.f2017ai.name() + ")");
                            return false;
                        }
                        return false;
                    }
                    return true;
                }
            }
            return true;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void mo2624a(Action action) {
        Action mo3219a;
        if ((action instanceof C0330g) && (mo3219a = mo3219a(action.m3834L())) != null) {
            C0330g c0330g = (C0330g) mo3219a;
            Integer num = c0330g.f2085a.f2012ad;
            if (num != null && c0330g.f2085a.f2013ae == null && num.intValue() < this.customUnitMetadataA.f3087fF.length) {
                C0394bk c0394bk = this.customUnitMetadataA.f3087fF[num.intValue()];
                if (c0394bk.f2459af > 0.0f) {
                    C0955y.m439b((Unit) this, c0394bk.f2459af, true);
                }
                C0955y.m452a((Unit) this, c0394bk.f2414ac, true, true);
            }
        }
        super.mo2624a(action);
    }

    /* renamed from: a */
    public boolean m3218a(Action action, PointF pointF, Unit unit, int i) {
        PointF pointF2 = null;
        Unit unit2 = null;
        if (i > 0) {
            pointF2 = f2672dH;
            unit2 = f2673dI;
        }
        f2672dH = pointF;
        f2673dI = unit;
        boolean m3203b = m3203b(action, pointF, unit, i);
        f2672dH = pointF2;
        f2673dI = unit2;
        return m3203b;
    }

    /* renamed from: b */
    public boolean m3203b(Action action, PointF pointF, Unit unit, int i) {
        GameEngine gameEngine = GameEngine.getInstance();
        if (i > 10) {
            return false;
        }
        action.mo3830a(this, unit);
        if (action instanceof C0330g) {
            C0330g c0330g = (C0330g) action;
            C0327d c0327d = c0330g.f2085a;
            if (c0327d.f2049r != null && !c0327d.f2049r.read(this)) {
                return true;
            }
            boolean z = false;
            if (c0327d.f2009aa != null) {
                this.f1549cs += c0330g.f2085a.f2009aa.floatValue();
                z = true;
            }
            if (c0327d.f2010ab != null) {
                c0327d.f2010ab.m3367h(this);
                z = true;
            }
            if (c0327d.f2011ac != null) {
                c0327d.f2011ac.m3402a(this, this.team.m3873z(), true);
                z = true;
            }
            if (c0327d.f2004aB != null) {
                if (c0327d.f2004aB.read(this)) {
                    this.f1601bs = gameEngine.f5845by;
                }
                z = true;
            }
            if (c0327d.f2012ad != null) {
                PointF pointF2 = pointF;
                for (int i2 = 0; i2 < c0327d.f2016ah; i2++) {
                    if (c0327d.f2013ae != null) {
                        pointF2 = new PointF();
                        if (c0327d.f2014af == null) {
                            pointF2.set(this.x, this.y);
                        } else {
                            Unit readUnit = c0327d.f2014af.readUnit(this);
                            if (readUnit != null) {
                                pointF2.set(readUnit.x, readUnit.y);
                            } else {
                                pointF2.set(this.x, this.y);
                            }
                        }
                        float cos = CommonUtils.cos(this.direction);
                        float sin = CommonUtils.sin(this.direction);
                        float f = c0327d.f2013ae.x;
                        float f2 = c0327d.f2013ae.y;
                        pointF2.m4668b((cos * f2) - (sin * f), (sin * f2) + (cos * f));
                    }
                    if (pointF2 == null) {
                        NetworkEngine.reportDesync("completeQueueItem:" + c0330g.m3834L() + " for fireTurretXAtGround needs points but it is missing");
                    } else {
                        m3217a((Unit) null, pointF2.x, pointF2.y, c0330g.f2085a.f2012ad.intValue(), c0330g.f2085a.f2015ag, i);
                    }
                }
                z = true;
            }
            if (c0327d.f2021am != null) {
                c0327d.f2021am.m3043a(this.x, this.y, this.height, this.direction, this);
                z = true;
            }
            if (c0327d.f2023ao != null) {
                c0327d.f2023ao.m3441a(this.x, this.y, 1.0f);
                z = true;
            }
            if (c0327d.f2024ap != null && !gameEngine.m925E()) {
                c0327d.f2024ap.m3443a();
                z = true;
            }
            if (c0327d.f2025aq != null) {
                if (this.team == gameEngine.playerTeam && !gameEngine.m925E()) {
                    c0327d.f2025aq.m3443a();
                }
                z = true;
            }
            if (c0327d.f2069Z.size > 0) {
                Object[] items = c0327d.f2069Z.getItems();
                for (int i3 = 0; i3 < c0327d.f2069Z.size; i3++) {
                    if (((AbstractC0309a) items[i3]).mo3629a(this, action, pointF, unit, i)) {
                        z = true;
                    }
                }
            }
            if (c0327d.f2019ak != null) {
                if (c0327d.f2018aj == null || c0327d.f2018aj.read(this)) {
                    c0330g.f2085a.f2019ak.m3053a(this, pointF, unit, i + 1);
                }
                z = true;
            }
            if (c0330g.f2085a.f2020al != null) {
                if (c0327d.f2018aj == null || c0327d.f2018aj.read(this)) {
                    c0330g.f2085a.f2020al.m3054a(this, pointF, unit);
                }
                z = true;
            }
            CustomUnitMetadata customUnitMetadata = null;
            if (c0327d.f1991E != null) {
                customUnitMetadata = c0327d.f1991E.mo3049c();
            }
            if (customUnitMetadata != null) {
                if (GameEngine.Replay_Debug) {
                    GameEngine.log(m3740cz() + ": converting unit: " + action.m3833M());
                }
                if (!(customUnitMetadata instanceof CustomUnitMetadata)) {
                    Unit createUnit = customUnitMetadata.createUnit();
                    createUnit.x = this.x;
                    createUnit.y = this.y;
                    if (!createUnit.mo2975bH()) {
                        createUnit.direction = this.direction;
                    }
                    createUnit.mo3149f(this.team);
                    createUnit.mo3233B(null);
                    float f3 = this.maxHp;
                    float f4 = createUnit.maxHp;
                    if (f3 == 0.0f) {
                        createUnit.m3730o(createUnit.maxHp);
                    } else {
                        createUnit.m3730o((this.hp / f3) * f4);
                    }
                    if (this.selected) {
                        GameEngine.getInstance().interfaceEngine.m1836k(createUnit);
                    }
                    Team.m3924c(createUnit);
                    m3745cg();
                } else {
                    ValueList valueList = null;
                    if (c0327d.f1994N) {
                        valueList = mo3167da();
                    }
                    Team.m3940b((Unit) this);
                    this.customUnitMetadataB = null;
                    m3206a(customUnitMetadata, false, false, c0327d.f1995O);
                    if (valueList != null) {
                        m3208a(valueList, true);
                    }
                    mo2650R();
                    this.f2722dG.m2920e();
                    this.f1602bt = GameEngine.getInstance().f5845by;
                    Team.m3924c(this);
                }
                z = true;
                if (!c0330g.mo3586z().m3388b()) {
                    m2646V();
                }
            }
            if (!z && c0327d.f2045m) {
                GameEngine.PrintLOG("completeQueueItem:" + c0330g.m3834L() + " had no effect (but should have)");
                return true;
            }
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: b */
    public void mo2914b(Item item) {
        Action mo3219a = mo3219a(item.uIndex);
        if (mo3219a != null && (mo3219a instanceof C0330g)) {
            C0327d c0327d = ((C0330g) mo3219a).f2085a;
            if (c0327d.f2002Y != null) {
                f2678dU.x = this.x;
                f2678dU.y = this.y;
                c0327d.f2002Y.m3053a(this, f2678dU, null, 0);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: c */
    public boolean mo2913c(Item item) {
        return true;
    }

    /* renamed from: i */
    public void m3146i(boolean z) {
        this.f2722dG.m2928a(z);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2873a(Item item) {
        float f;
        Action mo3219a = mo3219a(item.uIndex);
        if (mo3219a != null && m3218a(mo3219a, item.f3306g, item.f3307h, 0)) {
            return;
        }
        float f2 = 0.0f;
        if (this.customUnitMetadataA.f2751aB && this.customUnitMetadataA.f2853cZ != null) {
            f2 = this.direction + this.customUnitMetadataA.f2853cZ.floatValue() + 90.0f;
        }
        if (this.customUnitMetadataA.f2897dc != null) {
            f = this.customUnitMetadataA.f2897dc.floatValue();
        } else if (this.f2722dG.f3316b != null) {
            f = this.radius * 3.0f;
        } else {
            f = this.radius * 2.0f;
        }
        Unit m2931a = this.f2722dG.m2931a(item, f, this.f2696q, f2);
        if (m2931a != null) {
            m3228H(m2931a);
            Team.m3924c(m2931a);
            m3775a(EnumC0334ad.f2108e, m2931a);
        }
    }

    /* renamed from: G */
    public void m3229G(Unit unit) {
        float f = 0.0f;
        if (this.customUnitMetadataA.f2751aB && this.customUnitMetadataA.f2853cZ != null) {
            f = this.direction + this.customUnitMetadataA.f2853cZ.floatValue() + 90.0f;
        }
        unit.direction = 90.0f + f;
        float f2 = 70.0f;
        if (this.customUnitMetadataA.f2897dc != null) {
            f2 = this.customUnitMetadataA.f2897dc.floatValue();
        }
        this.f2722dG.m2935a(unit, f2, this.f2696q);
    }

    /* renamed from: H */
    public void m3228H(Unit unit) {
        unit.x = this.x + this.customUnitMetadataA.f2851cX;
        unit.y = this.y + this.customUnitMetadataA.f2852cY;
        if (!this.customUnitMetadataA.f2751aB) {
            float f = 180.0f;
            if (this.customUnitMetadataA.f2853cZ != null) {
                f = this.customUnitMetadataA.f2853cZ.floatValue();
            }
            float f2 = 70.0f;
            if (this.customUnitMetadataA.f2897dc != null) {
                f2 = this.customUnitMetadataA.f2897dc.floatValue();
            }
            boolean m2831a = LandingCraft.m2831a(this, unit, this.f2696q, 7.0f, f, f2, this.customUnitMetadataA.f2851cX, this.customUnitMetadataA.f2852cY);
            if (!this.customUnitMetadataA.f2896db) {
                unit.height = this.height;
            }
            unit.height += this.customUnitMetadataA.f2895da;
            if (unit instanceof C0433j) {
                ((C0433j) unit).m3172dA();
            }
            if ((mo2676i() || !m2831a || this.customUnitMetadataA.f2923eJ.read(this)) && mo2823cp()) {
                m3231E(unit);
            }
        }
        this.f2696q = !this.f2696q;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bx */
    public C0407b mo2499bx() {
        ObjectVector m2917h = this.f2722dG.m2917h();
        int size = m2917h.size();
        if (size == 0) {
            return C0407b.f2549a;
        }
        C0407b c0407b = new C0407b();
        Object[] items = m2917h.getItems();
        for (int i = 0; i < size; i++) {
            Action mo3219a = mo3219a(((Item) items[i]).uIndex);
            if (mo3219a != null && (mo3219a instanceof C0330g)) {
                C0330g c0330g = (C0330g) mo3219a;
                if (c0330g.f2085a.f2009aa != null) {
                    c0407b.f2539c += c0330g.f2085a.f2009aa.floatValue();
                }
                if (c0330g.f2085a.f2010ab != null) {
                    C0407b c0407b2 = c0330g.f2085a.f2010ab;
                    if (!c0407b2.m3388b()) {
                        c0407b = C0407b.m3397a(c0407b, c0407b2);
                    }
                }
                if (c0330g.f2085a.f2011ac != null) {
                    C0407b c0407b3 = c0330g.f2085a.f2011ac;
                    if (!c0407b3.m3388b()) {
                        c0407b = C0407b.m3397a(c0407b, c0407b3);
                    }
                }
            }
        }
        return c0407b;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: dv */
    public boolean mo2908dv() {
        return this.customUnitMetadataA.f3081eB > 0 && m3169dD() > this.customUnitMetadataA.f3081eB;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: h */
    public int mo2906h(UnitType unitType) {
        return this.f2722dG.m2934a(unitType);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: f */
    public int mo2907f(boolean z) {
        return this.f2722dG.m2941a(Action.f1432h, z, true);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public int mo2915a(C0202c c0202c, boolean z) {
        return this.f2722dG.m2942a(c0202c, z);
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: dr */
    public Item mo2912dr() {
        return this.f2722dG.m2927b();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bC */
    public C0407b mo2524bC() {
        return this.f2722dG.m2923c();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: ds */
    public ObjectVector mo2911ds() {
        return this.f2722dG.f3317c;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: du */
    public void mo2909du() {
        this.f2722dG.f3319e = 1.0f;
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: dt */
    public boolean mo2910dt() {
        return this.f2722dG.m2944a();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: dk */
    public int mo2947dk() {
        return this.f2722dG.m2919f();
    }

    @Override // com.corrodinggames.rts.game.units.buildings.AbstractC0483l
    /* renamed from: a */
    public void mo2916a(PointF pointF) {
        if (this.customUnitMetadataA.f2845cR) {
            this.f2722dG.f3316b = pointF;
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a_ */
    public float getHpBar() {
        if (!this.customUnitMetadataA.f3000s) {
            return -1.0f;
        }
        return super.getHpBar();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bS */
    public boolean mo3196bS() {
        return this.customUnitMetadataA.f3001t;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bT */
    public float getSecBar() {
        if (isActive() && !this.f2722dG.m2944a() && this.customUnitMetadataA.f3006y) {
            return this.f2722dG.f3319e;
        }
        return super.getSecBar();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bU */
    public float mo2813bU() {
        if (this.f2703x.f2171d > 0.0f && this.f1549cs < this.f2703x.f2171d && this.customUnitMetadataA.f3002u) {
            return this.f1549cs / this.f2703x.f2171d;
        }
        if (this.maxShield > 0.0f && this.shield < this.maxShield && this.customUnitMetadataA.f3005x) {
            return this.shield / this.maxShield;
        }
        if (this.f2703x.f2171d == 0.0f && this.maxShield == 0.0f) {
            if (this.customUnitMetadataA.f3076eb != -1 && this.f1532cC[this.customUnitMetadataA.f3076eb].f1656e > 0.0f) {
                return 1.0f - (this.f1532cC[this.customUnitMetadataA.f3076eb].f1656e / getShootDelay(this.customUnitMetadataA.f3076eb));
            }
            if (this.customUnitMetadataA.f3077ec != -1 && this.f1532cC[this.customUnitMetadataA.f3077ec].f1657f != 0.0f) {
                return this.f1532cC[this.customUnitMetadataA.f3077ec].f1657f / mo2483e(this.customUnitMetadataA.f3077ec);
            }
        }
        return super.mo2813bU();
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: f */
    public boolean mo419f(float f) {
        return super.mo419f(f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bY */
    public void mo2948bY() {
        if (this.f2722dG.f3316b != null) {
            GameEngine gameEngine = GameEngine.getInstance();
            gameEngine.graphics.mo221a((int) (this.x - gameEngine.viewpointX_rounded), (int) (this.y - gameEngine.viewpointY_rounded), (int) (this.f2722dG.f3316b.x - gameEngine.viewpointX_rounded), (int) (this.f2722dG.f3316b.y - gameEngine.viewpointY_rounded), Factory.f3298y);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bZ */
    public void mo2985bZ() {
        boolean z = false;
        if ((this.f2703x.maxattackrange > 70.0f && this.customUnitMetadataA.f2938ee && this.customUnitMetadataA.f2915dy == null) || (this.customUnitMetadataA.f2915dy != null && this.customUnitMetadataA.f2915dy.booleanValue())) {
            C0955y.m454a((Unit) this, getMaxAttackRange(), true);
            z = true;
        } else if (this.customUnitMetadataA.f2751aB && this.f2703x.f2182o > 50 && !this.customUnitMetadataA.f2938ee) {
            C0955y.m454a((Unit) this, this.f2703x.f2182o, true);
            z = true;
        }
        if (this.customUnitMetadataA.f3025o.size() != 0) {
            Iterator it = this.customUnitMetadataA.f3025o.iterator();
            while (it.hasNext()) {
                C0955y.m454a((Unit) this, ((C0448x) it.next()).f3173a, true);
                z = true;
            }
        }
        if (this.customUnitMetadataA.f2786bA) {
            int mo2512bk = mo2512bk();
            for (int i = 0; i < mo2512bk; i++) {
                C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
                if (c0394bk.f2418aj != null && c0394bk.f2462ak > 0.0f) {
                    int i2 = 90;
                    if (z) {
                        i2 = 40;
                    }
                    C0955y.m455a((Unit) this, c0394bk.f2462ak, Color.argb(i2, 35, SlickToAndroidKeycodes.AndroidCodes.KEYCODE_TV_TERRESTRIAL_ANALOG, 35), 1, true);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: d */
    public void mo423d(float f) {
        super.mo423d(f);
        if (this.dead) {
            return;
        }
        this.f1638dz.m3415a(f, this);
        if (this.customUnitMetadataA.graphics_image_back != null) {
            GameEngine gameEngine = GameEngine.getInstance();
            float f2 = this.x - gameEngine.viewpointX_rounded;
            float f3 = (this.y - gameEngine.viewpointY_rounded) - this.height;
            float mo3194cB = mo3194cB();
            if (mo3194cB != 1.0f) {
                gameEngine.graphics.mo135j();
                gameEngine.graphics.mo222a(mo3194cB, mo3194cB, f2, f3);
            }
            if (this.customUnitMetadataA.graphics_image_back_always_use_full_image) {
                int i = this.customUnitMetadataA.graphics_image_back.width;
                int i2 = this.customUnitMetadataA.graphics_image_back.height;
                int i3 = i / 2;
                int i4 = i2 / 2;
                f1586dl.m4652a(f2 - i3, f3 - i4, f2 + i3, f3 + i4);
                f1587dm.set(0, 0, 0 + i, 0 + i2);
            } else {
                f1586dl.m4652a(f2 - this.halfObjectWidth, f3 - this.halfObjectHeight, f2 + this.halfObjectWidth, f3 + this.halfObjectHeight);
                f1587dm.set(0, 0, 0 + this.objectWidth, 0 + this.objectHeight);
            }
            gameEngine.graphics.mo190a(this.customUnitMetadataA.graphics_image_back, f1587dm, f1586dl, mo2584aM());
            if (mo3194cB != 1.0f) {
                gameEngine.graphics.mo134k();
            }
        }
        if (this.customUnitMetadataA.f3045at && this.f2723dM != null && !this.dead) {
            C0377c.m3483a(this, f, false, true);
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: aL */
    public float mo2585aL() {
        return this.customUnitMetadataA.f2912dv;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: aM */
    public Paint mo2584aM() {
        return super.mo2584aM();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: aU */
    public boolean mo2576aU() {
        return this.customUnitMetadataA.f2954eu;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bH */
    public boolean mo2975bH() {
        return this.customUnitMetadataA.f2751aB;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: q */
    public boolean mo2858q() {
        if (this.f1630cF != null && this.f1630cF.built < 1.0f) {
            return true;
        }
        return this.customUnitMetadataA.f2754aE;
    }

    /* renamed from: J */
    private boolean m3226J(Unit unit) {
        if (unit.mo2858q() || unit == this) {
            return false;
        }
        if (unit.mo2975bH()) {
            if (this.customUnitMetadataA.f2764aO) {
                return true;
            }
            return false;
        } else if (this.customUnitMetadataA.f2765aP) {
            return true;
        } else {
            return false;
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public boolean mo2621a(Unit unit) {
        if (this.customUnitMetadataA.f2973fd != null && !ValueListSource.m3248a(this.customUnitMetadataA.f2973fd, unit.mo3167da())) {
            return false;
        }
        return m3226J(unit);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: l */
    public boolean mo2458l(Unit unit) {
        if (unit.mo2862g() != 0.0f && mo3232D(unit)) {
            return true;
        }
        if (this.customUnitMetadataA.f2972fc != null && !ValueListSource.m3248a(this.customUnitMetadataA.f2972fc, unit.mo3167da())) {
            return false;
        }
        return m3226J(unit);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: m */
    public void mo2454m(Unit unit) {
        GroupController.UnitGroup r0;
        if (this.customUnitMetadataA.f2811bd) {
            Waypoint aq = getActiveWaypoint();
            if (aq != null && (r0 = aq.group) != null) {
                r0.m2396a(aq);
            }
            if (this.selected && unit != null) {
                GameEngine.getInstance().interfaceEngine.m1836k(unit);
            }
            m3745cg();
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ak */
    public boolean mo2559ak() {
        if (this.customUnitMetadataA.f2811bd) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: ai */
    public boolean mo2561ai() {
        return this.customUnitMetadataA.f2975ff;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cr */
    public boolean mo3176cr() {
        return this.customUnitMetadataA.f2959fC;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: aj */
    public boolean mo2560aj() {
        return this.customUnitMetadataA.f2974fe;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: C */
    public boolean mo2728C(Unit unit) {
        if (!mo3232D(unit) || unit.m3755c((OrderableUnit) this)) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: D */
    public boolean mo3232D(Unit unit) {
        if (!this.customUnitMetadataA.f2935eZ) {
            return false;
        }
        if (this.customUnitMetadataA.f2970fa != null && !ValueListSource.m3248a(this.customUnitMetadataA.f2970fa, unit.mo3167da())) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cP */
    public int mo3188cP() {
        return this.customUnitMetadataA.f2971fb;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bI */
    public boolean mo2879bI() {
        return this.customUnitMetadataA.f2979fj;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public void mo431a(float f, boolean z) {
        super.mo431a(f, z);
        if (!this.dead && mo2560aj()) {
            if (m2644X()) {
                if (!this.customUnitMetadataA.f2801bR) {
                    Builder.m2852b(f, this);
                }
            } else if (!this.customUnitMetadataA.f2797bN) {
                Builder.m2852b(f, this);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: o */
    public boolean mo2860o() {
        return this.customUnitMetadataA.core_stayNeutral;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: p */
    public boolean mo2859p() {
        return this.customUnitMetadataA.core_createNeutral;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: f */
    public void mo3149f(Team team) {
        if (this.customUnitMetadataA.core_createOnAggressiveTeam) {
            mo2537b(Team.f1345f);
        } else if (this.customUnitMetadataA.core_convertToNeutralIfNotTransporting && this.f2718A.size() == 0) {
            mo2537b(Team.f1346g);
        } else {
            super.mo3149f(team);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: B */
    public void mo3233B(Unit unit) {
        super.mo3233B(unit);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: g */
    public float mo2862g() {
        return this.customUnitMetadataA.f2868cu;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cN */
    public int mo3190cN() {
        return this.customUnitMetadataA.f2869cv;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cO */
    public ValueList mo3189cO() {
        return this.customUnitMetadataA.f2870cw;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cM */
    public void mo3191cM() {
        if (this.customUnitMetadataA.f2810bc == 0.0f && mo2862g() > 0.0f) {
            Team.m3940b((Unit) this);
            this.built = 1.0f;
            Team.m3924c(this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cn */
    public C0202c mo2824cn() {
        if (this.customUnitMetadataA.f3081eB != 0) {
            return LandingCraft.f3456i.m3834L();
        }
        return super.mo2824cn();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: K */
    public float mo2654K(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2416ae;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: J */
    public PointF mo2655J(int i) {
        Projectile projectile;
        PointF J = super.mo2655J(i);
        if (this.customUnitMetadataA.f2949ep) {
            if (this.customUnitMetadataA.f2962fG[this.customUnitMetadataA.f3087fF[i].m3435a(this)].f1148M && this.f2683dC != null && (projectile = this.f2683dC[i]) != null && !projectile.deleted) {
                J.x += projectile.x;
                J.y += projectile.y;
            }
        }
        return J;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bc */
    public float mo2520bc() {
        return this.f2703x.f2171d;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bd */
    public EnumC0295b mo2519bd() {
        return this.customUnitMetadataA.f2886dR;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: be */
    public boolean mo2518be() {
        if (this.customUnitMetadataA.f2889dU) {
            return false;
        }
        if (this.customUnitMetadataA.f2886dR == EnumC0295b.f1772d) {
            Waypoint aq = getActiveWaypoint();
            if ((aq != null && (aq.getType() == WaypointType.f1758h || aq.getType() == WaypointType.f1760j)) || this.f3762I == AttackMode.f1392a) {
                return true;
            }
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: bV */
    public boolean mo2812bV() {
        return this.f2700u;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bf */
    public boolean mo2517bf() {
        return this.customUnitMetadataA.f2892dX;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bb */
    public float mo2521bb() {
        return this.customUnitMetadataA.f2936ea;
    }

    /* renamed from: dq */
    public void m3156dq() {
        if (this.customUnitMetadataA.f3043ar == null && this.f2723dM == null) {
            return;
        }
        if (this.customUnitMetadataA.f3043ar == null || this.customUnitMetadataA.f3043ar.length == 0) {
            this.f2723dM = null;
        } else if (this.f2723dM == null || this.f2723dM.length != this.customUnitMetadataA.f3043ar.length) {
            this.f2723dM = new C0378d[this.customUnitMetadataA.f3043ar.length];
            for (int i = 0; i < this.customUnitMetadataA.f3043ar.length; i++) {
                C0378d c0378d = new C0378d();
                this.f2723dM[i] = c0378d;
                c0378d.f2258a = i;
                c0378d.f2276s = this.customUnitMetadataA.f3043ar[i].f2225o;
            }
            this.f2685dJ = this.x;
            this.f2686dK = this.y;
            this.f2687dL = this.direction;
            m3155dw();
            for (int i2 = 0; i2 < this.customUnitMetadataA.f3043ar.length; i2++) {
                this.f2723dM[i2].f2273m = true;
            }
        }
    }

    /* renamed from: dw */
    public void m3155dw() {
        C0377c.f2254a.mo3465b(this, 0.0f);
    }

    /* renamed from: dx */
    public void m3154dx() {
        if (this.f2723dM != null) {
            for (int i = 0; i < this.f2723dM.length; i++) {
                this.f2723dM[i].f2274n = true;
                this.f2723dM[i].f2273m = true;
            }
            m3155dw();
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: aS */
    public int mo2578aS() {
        if (this.customUnitMetadataA.f3091fK == null) {
            return -1;
        }
        return this.customUnitMetadataA.f3091fK.f2429e;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: s */
    public int mo2441s() {
        return this.f2703x.f2181n;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: c */
    public void mo2491c(boolean z) {
        CustomUnitMetadata customUnitMetadata = this.customUnitMetadataA;
        GameEngine gameEngine = GameEngine.getInstance();
        if (this.transportedBy != null || this.f1630cF != null) {
            return;
        }
        int i = this.f2703x.f2181n;
        if (this.built < 1.0f && customUnitMetadata.f2850cW != -1) {
            i = customUnitMetadata.f2850cW;
        }
        if (i > 0) {
            gameEngine.map.m4167a(this.x, this.y, i, this.team, z);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ca */
    public Rect mo2974ca() {
        return this.customUnitMetadataA.f3065cM;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cc */
    public Rect mo3182cc() {
        return this.customUnitMetadataA.f3067cO;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cb */
    public Rect mo2973cb() {
        return this.customUnitMetadataA.f3066cN;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public boolean mo2538b(int i, float f) {
        float f2;
        C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
        if (c0394bk.f2468ar != 0.0f) {
            boolean z = true;
            if (c0394bk.f2421au != null && !c0394bk.f2421au.read(this)) {
                z = false;
            }
            if (z) {
                C0235aj c0235aj = this.f1532cC[i];
                if (c0394bk.f2467aq != 0.0f) {
                    f2 = c0235aj.f1652a;
                } else if (!c0394bk.f2466ap) {
                    f2 = c0235aj.f1653b;
                } else {
                    f2 = mo2668C(i);
                }
                c0235aj.f1662k += f;
                float f3 = f * c0394bk.f2420at;
                if (c0235aj.f1663l > 0.0f) {
                    if (c0235aj.f1663l < Float.POSITIVE_INFINITY && m2640a(f3, f2 + c0235aj.f1663l, i) == 0.0f) {
                        c0235aj.f1663l = Float.POSITIVE_INFINITY;
                    }
                } else if (c0235aj.f1663l > Float.NEGATIVE_INFINITY && m2640a(f3, f2 + c0235aj.f1663l, i) == 0.0f) {
                    c0235aj.f1663l = Float.NEGATIVE_INFINITY;
                }
                if (c0235aj.f1662k > c0394bk.f2469as) {
                    c0235aj.f1662k = -CommonUtils.m1723a(this, 0, (int) c0394bk.f2470av);
                    float f4 = c0394bk.f2468ar;
                    if (c0394bk.f2422aw > 0.0f) {
                        f4 += CommonUtils.m1683b(this, 0.0f, c0394bk.f2422aw, i);
                    }
                    c0235aj.f1663l = c0235aj.f1663l > 0.0f ? -f4 : f4;
                    return false;
                }
                return false;
            }
        }
        if (c0394bk.f2467aq != 0.0f) {
            this.f1532cC[i].f1652a += c0394bk.f2467aq * f;
            if (this.f1532cC[i].f1652a > 180.0f) {
                this.f1532cC[i].f1652a -= 360.0f;
            }
            if (this.f1532cC[i].f1652a < -180.0f) {
                this.f1532cC[i].f1652a += 360.0f;
                return false;
            }
            return false;
        }
        return c0394bk.f2466ap;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ct */
    public int mo2844ct() {
        return this.customUnitMetadataA.f3083eO;
    }

    /* renamed from: dy */
    public ArrayList m3153dy() {
        f2708dN.clear();
        ArrayList mo2712M = mo2712M();
        if (mo2712M.size() != 0) {
            Iterator it = mo2712M.iterator();
            while (it.hasNext()) {
                Action action = (Action) it.next();
                if (action instanceof C0330g) {
                    C0330g c0330g = (C0330g) action;
                    if (c0330g.f2087c == EnumC0328e.f2075c) {
                        f2708dN.add(c0330g);
                    }
                }
            }
        }
        return f2708dN;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ck */
    public C0202c mo2870ck() {
        ArrayList m3153dy = m3153dy();
        if (m3153dy.size() > 0) {
            return ((Action) m3153dy.get(0)).m3834L();
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo3030a(ArrayList arrayList) {
        arrayList.clear();
        ArrayList m3153dy = m3153dy();
        if (m3153dy.size() < 2) {
            return;
        }
        m3153dy.remove(0);
        Iterator it = m3153dy.iterator();
        while (it.hasNext()) {
            arrayList.add(((Action) it.next()).m3834L());
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cV */
    public float mo2897cV() {
        return this.customUnitMetadataA.f2843cP;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cW */
    public float mo2896cW() {
        return this.customUnitMetadataA.f2844cQ;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit, com.corrodinggames.rts.game.units.Unit
    /* renamed from: bu */
    public void mo2502bu() {
        Team.m3960a((Unit) this);
        this.f2722dG.m2928a(true);
        super.mo2502bu();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cY */
    public void mo3183cY() {
        this.height = 170.0f;
        this.f2690f = 1.5f;
        m3154dx();
        super.mo3183cY();
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cZ */
    public boolean mo2845cZ() {
        return this.customUnitMetadataA.f2858cf;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: bo */
    public int mo2508bo() {
        return this.customUnitMetadataA.f2819bl;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void mo2628a(int i, float f) {
        this.f1532cC[i].f1652a += f;
        if (this.customUnitMetadataA.f3090fJ) {
            for (int i2 = 0; i2 < this.customUnitMetadataA.f3087fF.length; i2++) {
                if (this.customUnitMetadataA.f3087fF[i2].f2449v == i) {
                    this.f1532cC[i2].f1652a += f;
                    this.f1532cC[i2].m3722a(2);
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cX */
    public float mo2895cX() {
        return super.mo2895cX() + this.customUnitMetadataA.f2849cV;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: G */
    public float mo2660G(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2444o;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: H */
    public float mo2658H(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2445p;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: I */
    public float mo2656I(int i) {
        return this.customUnitMetadataA.f3087fF[i].f2446q;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public float mo2681a(Unit unit, float f, Projectile projectile) {
        C0383i dj = m3735dj();
        if (dj != null && this.f1630cF != null && dj.f2304j) {
            int i = 0;
            if (projectile != null) {
                i = projectile.f978aD;
            }
            if (i >= 0) {
                Projectile m4039a = Projectile.m4039a(projectile);
                if (dj.f2305k) {
                    m4039a.f1066am = 0.0f;
                }
                f = this.f1630cF.mo2681a(unit, f, m4039a);
                if (f < 0.0f) {
                    f = 0.0f;
                }
            }
        }
        if (mo2684J()) {
            f = 0.0f;
        }
        if (this.f2703x.armour > 0.0f && f > this.customUnitMetadataA.f2833cC) {
            float f2 = this.f2703x.armour;
            if (projectile != null) {
                f2 -= projectile.f999an;
            }
            if (f2 < 0.0f) {
                f2 = 0.0f;
            }
            f -= f2;
            if (f < this.customUnitMetadataA.f2833cC) {
                f = this.customUnitMetadataA.f2833cC;
            }
        }
        if (projectile != null) {
            mo3214a(EnumC0334ad.f2117n, unit, projectile.f979aE, (VariableScope) null);
        } else {
            m3775a(EnumC0334ad.f2117n, unit);
        }
        return super.mo2681a(unit, f, projectile);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: aT */
    public float mo2577aT() {
        return this.customUnitMetadataA.f2914dx;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: ab */
    public boolean mo2568ab() {
        if (!this.customUnitMetadataA.f2891dW) {
            return false;
        }
        return super.mo2568ab();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public boolean mo2622a(EnumC0226aa enumC0226aa) {
        if (enumC0226aa == EnumC0226aa.f1470a) {
            return this.customUnitMetadataA.f2898dd.m3443a();
        }
        if (enumC0226aa == EnumC0226aa.f1471b) {
            return this.customUnitMetadataA.f2899de.m3443a();
        }
        if (enumC0226aa == EnumC0226aa.f1472c) {
            return this.customUnitMetadataA.f2900df.m3443a();
        }
        return false;
    }

    /* renamed from: b */
    public void m3201b(EnumC0334ad enumC0334ad) {
        CustomUnitMetadata customUnitMetadata = this.customUnitMetadataA;
        if (customUnitMetadata.f3100ge.size == 0) {
            return;
        }
        Object[] items = customUnitMetadata.f3100ge.getItems();
        for (int i = customUnitMetadata.f3100ge.size - 1; i >= 0; i--) {
            C0333ac c0333ac = (C0333ac) items[i];
            if (c0333ac.f2100a == enumC0334ad) {
                f2678dU.x = this.x;
                f2678dU.y = this.y;
                m3218a(c0333ac.f2101b, f2678dU, (Unit) null, 0);
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: a */
    public void mo3214a(EnumC0334ad enumC0334ad, Unit unit, ValueList valueList, VariableScope variableScope) {
        C0434k c0434k;
        CustomUnitMetadata customUnitMetadata = this.customUnitMetadataA;
        if (customUnitMetadata.f3100ge.size == 0) {
            return;
        }
        Object[] items = customUnitMetadata.f3100ge.getItems();
        for (int i = customUnitMetadata.f3100ge.size - 1; i >= 0; i--) {
            C0333ac c0333ac = (C0333ac) items[i];
            if (c0333ac.f2100a == enumC0334ad && (c0333ac.f2103d == null || ValueListSource.m3249a(c0333ac.f2103d, valueList))) {
                if (f2710dP.size() > 0) {
                    c0434k = (C0434k) f2710dP.m516b();
                } else {
                    c0434k = new C0434k();
                }
                c0434k.f2725a = c0333ac;
                c0434k.f2726b = this;
                c0434k.f2727c = unit;
                c0434k.f2728d = valueList;
                c0434k.f2729e = variableScope;
                f2709dO.add(c0434k);
            }
        }
    }

    /* renamed from: s */
    public static void m3144s(float f) {
    }

    /* renamed from: a */
    public static void m3223a(float f, int i) {
        if (f2709dO.size == 0) {
            return;
        }
        Object[] items = f2709dO.getItems();
        int i2 = f2709dO.size;
        for (int i3 = i2 - 1; i3 >= 0; i3--) {
            C0434k c0434k = (C0434k) items[i3];
            C0333ac c0333ac = c0434k.f2725a;
            C0433j c0433j = c0434k.f2726b;
            if (c0333ac.f2102c == c0433j.customUnitMetadataA) {
                f2678dU.x = c0433j.x;
                f2678dU.y = c0433j.y;
                PointF pointF = f2678dU;
                LogicBoolean.setContextEventSource(c0434k);
                c0433j.m3218a(c0333ac.f2101b, pointF, (Unit) null, 0);
                LogicBoolean.clearContext();
            }
        }
        if (i < 1 && i2 != f2709dO.size) {
            for (int i4 = i2 - 1; i4 >= 0; i4--) {
                C0434k c0434k2 = (C0434k) f2709dO.remove(i4);
                c0434k2.m3139a();
                f2710dP.add(c0434k2);
            }
            m3223a(f, i + 1);
        }
        for (int i5 = f2709dO.size - 1; i5 >= 0; i5--) {
            C0434k c0434k3 = (C0434k) items[i5];
            c0434k3.m3139a();
            f2710dP.add(c0434k3);
        }
        f2709dO.clear();
    }

    /* renamed from: dz */
    public static void m3152dz() {
    }

    /* renamed from: b */
    public void m3204b(float f, boolean z) {
        CustomUnitMetadata customUnitMetadata = this.customUnitMetadataA;
        if (!customUnitMetadata.f2963fM) {
            return;
        }
        if (this.f2701v != 0.0f) {
            this.f2701v = CommonUtils.toZero(this.f2701v, f);
            if (this.f2701v == 0.0f) {
                z = true;
            } else {
                return;
            }
        }
        C0442r[] c0442rArr = customUnitMetadata.f2964fN;
        if (c0442rArr != null) {
            m3222a(f, c0442rArr);
            if (customUnitMetadata != this.customUnitMetadataA) {
                return;
            }
        }
        C0442r[] c0442rArr2 = customUnitMetadata.f2965fO;
        if (c0442rArr2 != null && (((int) (GameEngine.getInstance().frameNumber + this.GameObjectID)) % 4 == 0 || z)) {
            m3222a(f, c0442rArr2);
            if (customUnitMetadata != this.customUnitMetadataA) {
                return;
            }
        }
        C0442r[] c0442rArr3 = customUnitMetadata.f2966fP;
        if (c0442rArr3 != null) {
            if (((int) (GameEngine.getInstance().frameNumber + this.GameObjectID)) % 8 == 0 || z) {
                m3222a(f, c0442rArr3);
                if (customUnitMetadata != this.customUnitMetadataA) {
                }
            }
        }
    }

    /* renamed from: a */
    public void m3222a(float f, C0442r[] c0442rArr) {
        CustomUnitMetadata customUnitMetadata = this.customUnitMetadataA;
        GameEngine gameEngine = GameEngine.getInstance();
        for (C0442r c0442r : c0442rArr) {
            if (c0442r.f3153a.read(this)) {
                if (gameEngine.debugTempMode && gameEngine.triggerDebug && this.selected) {
                    if (c0442r.f3156d != null) {
                        String str = VariableScope.nullOrMissingString + c0442r.f3156d.m3833M();
                    }
                    String str2 = "autoTrigger fired on: " + m3741cy() + " details: " + c0442r.f3153a.getDebugDetails(this);
                    GameEngine.PrintLOG(str2);
                    gameEngine.interfaceEngine.f4737f.m1955a(str2, 2000);
                }
                f2678dU.x = this.x;
                f2678dU.y = this.y;
                m3218a(c0442r.f3156d, f2678dU, (Unit) null, 0);
                this.f2701v = this.customUnitMetadataA.f3055bV;
                if (customUnitMetadata != this.customUnitMetadataA) {
                    return;
                }
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: da */
    public ValueList mo3167da() {
        return this.f2688dV;
    }

    /* renamed from: a */
    public void m3208a(ValueList valueList, boolean z) {
        if (z) {
            this.f2688dV = valueList;
            return;
        }
        Team.m3940b((Unit) this);
        this.f2688dV = valueList;
        Team.m3924c(this);
    }

    /* renamed from: j */
    public void m3145j(boolean z) {
        m3208a(this.customUnitMetadataA.core_tags, z);
    }

    /* renamed from: a */
    public void m3209a(ValueList valueList) {
        ValueList mo3167da = mo3167da();
        if (mo3167da == null || mo3167da.m3238b() == 0) {
            m3208a(valueList, false);
        } else if (ValueListSource.m3243b(mo3167da, valueList)) {
        } else {
            C0432i c0432i = new C0432i(mo3167da);
            if (c0432i.m3235a(valueList)) {
                m3208a(c0432i.m3237a(), false);
            }
        }
    }

    /* renamed from: b */
    public void m3199b(ValueList valueList) {
        ValueList mo3167da = mo3167da();
        if (mo3167da == null || mo3167da.m3238b() == 0 || !ValueListSource.m3248a(valueList, mo3167da)) {
            return;
        }
        C0432i c0432i = new C0432i(mo3167da);
        if (c0432i.m3234b(valueList)) {
            m3208a(c0432i.m3237a(), false);
        }
    }

    /* renamed from: dA */
    public final void m3172dA() {
        if (this.customUnitMetadataA.f2931eV == MovementType.f1646d) {
            if (mo2676i()) {
                setDrawLayer(5);
            } else if (mo2823cp() && this.f1541cc == 0.0f) {
                setDrawLayer(3);
            } else {
                setDrawLayer(2);
            }
        } else if (this.f1541cc == 0.0f) {
            setDrawLayer(this.customUnitMetadataA.f3063cx);
        }
        this.f6367ee = 0;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ci */
    public boolean mo2983ci() {
        if (!this.customUnitMetadataA.f2967fW) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0230ae
    /* renamed from: f */
    public boolean mo2818f() {
        return this.customUnitMetadataA.f2929eS.read(this);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0230ae
    /* renamed from: j */
    public boolean mo2816j() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: D */
    public C0918ai mo2666D(int i) {
        f2679dW.m558a(getTurretEnd(i));
        C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
        f2679dW.f6262c += c0394bk.f2402Z;
        return f2679dW;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: E */
    public PointF getTurretEnd(int i) {
        C0235aj c0235aj = this.f1532cC[i];
        C0394bk c0394bk = this.customUnitMetadataA.f3087fF[i];
        float f = c0394bk.f2400W;
        float f2 = c0394bk.f2401X;
        if (c0394bk.f2457Y != 0.0f && c0235aj.f1664m) {
            f2 += c0394bk.f2457Y;
        }
        float f3 = isFixedFiring() ? this.direction : c0235aj.f1652a;
        PointF mo2662F = mo2662F(i);
        float cos = CommonUtils.cos(f3);
        float sin = CommonUtils.sin(f3);
        f3751aZ.set(mo2662F.x + ((cos * f) - (sin * f2)), mo2662F.y + (sin * f) + (cos * f2));
        return f3751aZ;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cj */
    public boolean mo3179cj() {
        return this.customUnitMetadataA.f2994fy;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cl */
    public float mo3178cl() {
        return this.customUnitMetadataA.f3085fz;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void mo2620a(Unit unit, float f, int i) {
        if (this.customUnitMetadataA.f2905do != null) {
            this.f2711b.m3349a(this.customUnitMetadataA.f2905do, 5);
        }
        if (this.customUnitMetadataA.f2797bN) {
            this.f3677N = CommonUtils.toZero(this.f3677N, f);
            if (this.f3677N == 0.0f) {
                this.f3677N = this.customUnitMetadataA.f2798bO;
                if (this.customUnitMetadataA.f2799bP != null) {
                    C0235aj c0235aj = this.f1532cC[i];
                    PointF turretEnd = getTurretEnd(i);
                    this.customUnitMetadataA.f2799bP.m3043a(turretEnd.x, turretEnd.y, this.height, c0235aj.f1652a, this);
                }
                if (this.customUnitMetadataA.f2800bQ != null) {
                    this.customUnitMetadataA.f2800bQ.m3043a(unit.x, unit.y, unit.height, unit.direction, unit);
                    return;
                }
                return;
            }
            return;
        }
        super.mo2620a(unit, f, i);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public void mo2536b(Unit unit, float f, int i) {
        if (this.customUnitMetadataA.f2906dp != null) {
            this.f2711b.m3349a(this.customUnitMetadataA.f2906dp, 5);
        }
        if (this.customUnitMetadataA.f2801bR) {
            this.f3677N = CommonUtils.toZero(this.f3677N, f);
            if (this.f3677N == 0.0f) {
                this.f3677N = this.customUnitMetadataA.f2802bS;
                if (this.customUnitMetadataA.f2803bT != null) {
                    C0235aj c0235aj = this.f1532cC[i];
                    PointF turretEnd = getTurretEnd(i);
                    this.customUnitMetadataA.f2803bT.m3043a(turretEnd.x, turretEnd.y, this.height, c0235aj.f1652a, this);
                }
                if (this.customUnitMetadataA.f2804bU != null) {
                    this.customUnitMetadataA.f2804bU.m3043a(unit.x, unit.y, unit.height, unit.direction, unit);
                    return;
                }
                return;
            }
            return;
        }
        super.mo2536b(unit, f, i);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: ce */
    public boolean mo3181ce() {
        return this.f2703x.graphics_isVisibleToEnemies;
    }

    /* renamed from: dB */
    public boolean m3171dB() {
        if (this.customUnitMetadataA.graphics_isVisible != null && !this.customUnitMetadataA.graphics_isVisible.read(this)) {
            return false;
        }
        if (!this.f2703x.graphics_isVisibleToEnemies) {
            GameEngine gameEngine = GameEngine.getInstance();
            if (gameEngine.playerTeam.m3925c(this.team) && !gameEngine.playerTeam.m3945b()) {
                return false;
            }
        }
        C0383i dj = m3735dj();
        if (dj != null && !dj.f2314o) {
            return false;
        }
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: t */
    public boolean mo1774t() {
        C0383i dj = m3735dj();
        if (dj != null && dj.f2312m) {
            return true;
        }
        return this.customUnitMetadataA.f2756aG;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cR */
    public boolean mo3186cR() {
        C0383i dj = m3735dj();
        if (dj != null && dj.f2313n) {
            return true;
        }
        return this.customUnitMetadataA.f2757aH;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: d */
    public boolean mo2679d(Unit unit) {
        CustomUnitMetadata customUnitMetadata = this.customUnitMetadataA;
        return (customUnitMetadata.f2762aM == null || ValueListSource.m3248a(customUnitMetadata.f2762aM, unit.mo3167da())) && !m3170dC() && !customUnitMetadata.f2758aI;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cS */
    public boolean mo3185cS() {
        return this.customUnitMetadataA.f2763aN;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cQ */
    public boolean mo3187cQ() {
        return this.customUnitMetadataA.f2758aI || mo1773u() || (this.built < 1.0f && this.customUnitMetadataA.f2810bc <= 0.0f);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: dd */
    public ValueList mo3166dd() {
        return this.customUnitMetadataA.f2741M;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: al */
    public float mo2558al() {
        return this.customUnitMetadataA.f2955ev;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: am */
    public boolean mo2557am() {
        return super.mo2557am() || this.customUnitMetadataA.f2954eu;
    }

    @Override // com.corrodinggames.rts.game.units.Unit, com.corrodinggames.rts.gameFramework.GameObject
    /* renamed from: a */
    public boolean mo426a(GameEngine gameEngine) {
        if (!gameEngine.f5959cN.m4646b(this.x, this.y)) {
            if (!this.customUnitMetadataA.f3007z) {
                return false;
            }
            boolean z = false;
            if (this.customUnitMetadataA.f2731A != null) {
                CustomUnitMetadata.f3008a.m4664a(this.customUnitMetadataA.f2731A);
                CustomUnitMetadata.f3008a.m4666a((int) this.x, (int) this.y);
                if (gameEngine.f5961cP.m4660b(CustomUnitMetadata.f3008a)) {
                    z = true;
                }
            }
            if (gameEngine.f5959cN.m4646b(this.x, this.y - this.height)) {
                z = true;
            }
            if (!z) {
                return false;
            }
        }
        if (this.transportedBy != null) {
            return false;
        }
        if ((this.f1631cG != null && this.f1631cG.f2327I) || !m3739d(gameEngine.playerTeam) || !m3171dB()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public OrderableUnit m3213a(C0383i c0383i) {
        return C0382h.m3473a(this, c0383i);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public C0383i mo2599a(short s) {
        return C0382h.m3469a(this, s);
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public boolean mo2607a(OrderableUnit orderableUnit, C0383i c0383i) {
        if (orderableUnit == this) {
            return false;
        }
        if (c0383i == null) {
            GameEngine.log("attachRequest: No attachedSlotData");
            return false;
        }
        OrderableUnit m3473a = C0382h.m3473a(this, c0383i);
        if (m3473a != null) {
            GameEngine.log("attachRequest: a unit is already in slot (parent:" + m3741cy() + " slot:" + c0383i.m3462b() + " existing:" + m3473a.m3754cA() + ")");
            return false;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        C0382h.m3472a(this, c0383i, orderableUnit);
        orderableUnit.f1630cF = this;
        orderableUnit.f1631cG = c0383i;
        orderableUnit.f1632cH = gameEngine.f5845by;
        orderableUnit.collidable = false;
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: b */
    public boolean mo2531b(OrderableUnit orderableUnit) {
        if (orderableUnit.f1630cF != this) {
            GameEngine.log("deattachRequest: unit is not attached");
            return false;
        }
        C0383i c0383i = orderableUnit.f1631cG;
        if (c0383i == null) {
            GameEngine.log("deattachRequest: unit has no attachedSlotData");
            return false;
        }
        OrderableUnit m3473a = C0382h.m3473a(this, c0383i);
        if (m3473a == null) {
            GameEngine.log("deattachRequest: Failed, no unit in slot");
            GameEngine.LogTrace("deattachRequest");
            return false;
        } else if (orderableUnit != m3473a) {
            String str = "null";
            if (m3473a != null) {
                str = m3473a.m3741cy();
            }
            GameEngine.log("deattachRequest: unit and slot don't match - requested:" + orderableUnit.m3741cy() + " current:" + str);
            return false;
        } else {
            if (this.f2718A.remove(orderableUnit)) {
                m3230F(orderableUnit);
            }
            C0382h.m3472a(this, c0383i, (OrderableUnit) null);
            orderableUnit.f1630cF = null;
            orderableUnit.f1631cG = null;
            orderableUnit.mo2680c_();
            return true;
        }
    }

    /* renamed from: dC */
    public boolean m3170dC() {
        C0383i dj = m3735dj();
        if (dj != null && !dj.f2311l) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: J */
    public boolean mo2684J() {
        if (m3170dC() || this.customUnitMetadataA.f2759aJ) {
            return true;
        }
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: de */
    public void mo3165de() {
        CustomUnitMetadata customUnitMetadata = this.customUnitMetadataA;
        if (!customUnitMetadata.f3061cl.m3388b()) {
            customUnitMetadata.f3061cl.mo3364a(this);
        }
        if (!customUnitMetadata.f3062cm.m3388b() && this.built >= 1.0f) {
            customUnitMetadata.f3062cm.mo3364a(this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: df */
    public void mo3164df() {
        CustomUnitMetadata customUnitMetadata = this.customUnitMetadataA;
        if (!customUnitMetadata.f3061cl.m3388b()) {
            customUnitMetadata.f3061cl.m3367h(this);
        }
        if (!customUnitMetadata.f3062cm.m3388b() && this.built >= 1.0f) {
            customUnitMetadata.f3062cm.m3367h(this);
        }
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: a */
    public void mo2612a(Waypoint waypoint) {
        m3776a(EnumC0334ad.f2113j);
        C0383i dj = m3735dj();
        if (dj != null && dj.f2291H) {
            WaypointType type = waypoint.getType();
            if (type == WaypointType.f1758h || type == WaypointType.f1751a) {
                m2500bw();
            }
        }
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: b_ */
    public boolean mo3195b_() {
        CustomUnitMetadata customUnitMetadata = this.customUnitMetadataA;
        if (!customUnitMetadata.f2761aL && GameEngine.getInstance().playerTeam.m3925c(this.team)) {
            return false;
        }
        return customUnitMetadata.f2760aK;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: dg */
    public boolean mo3163dg() {
        return this.customUnitMetadataA.graphics_imageSmoothingWhenZoomedIn;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: dh */
    public boolean mo3162dh() {
        return this.customUnitMetadataA.f3079ez;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: di */
    public boolean mo3161di() {
        return this.customUnitMetadataA.f3080eA;
    }

    /* renamed from: I */
    public boolean m3227I(Unit unit) {
        int m3169dD = m3169dD();
        int mo2844ct = unit.mo2844ct();
        if (this.customUnitMetadataA.f2918eD) {
            mo2844ct = 1;
        }
        if (m3169dD + mo2844ct <= this.customUnitMetadataA.f3081eB) {
            return true;
        }
        return false;
    }

    /* renamed from: dD */
    public int m3169dD() {
        int i = 0;
        if (this.customUnitMetadataA.f2918eD) {
            i = 0 + this.f2718A.size();
        } else if (this.f2718A.size > 0) {
            Iterator it = this.f2718A.iterator();
            while (it.hasNext()) {
                i += ((Unit) it.next()).mo2844ct();
            }
        }
        return i;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public void mo3151e(Team team) {
        C0383i m3735dj;
        if (this.team == team) {
            return;
        }
        super.mo3151e(team);
        if (this.f2718A != null && !this.customUnitMetadataA.f2926eM) {
            Iterator it = this.f2718A.iterator();
            while (it.hasNext()) {
                ((Unit) it.next()).mo3151e(team);
            }
        }
        if (this.f2719B != null) {
            Iterator it2 = this.f2719B.iterator();
            while (it2.hasNext()) {
                Unit unit = (Unit) it2.next();
                if (unit != null && (m3735dj = unit.m3735dj()) != null && !m3735dj.f2309z) {
                    unit.mo3151e(team);
                }
            }
        }
        m3776a(EnumC0334ad.f2114k);
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cL */
    public C0407b mo3192cL() {
        return this.customUnitMetadataA.f2855cb;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: cf */
    public void destroy() {
        if (this.customUnitMetadataA.f2821bn) {
            if (this.hp <= -1.0f) {
                this.hp = -1.0f;
                return;
            }
            return;
        }
        super.destroy();
    }

    @Override // com.corrodinggames.rts.game.units.OrderableUnit
    /* renamed from: by */
    public ObjectVector mo2498by() {
        return this.f2718A;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: e */
    public ObjectVector mo3150e(boolean z) {
        this.f2724dX.clear();
        if (this.customUnitMetadataA.f3046au.size > 0) {
            C0382h.m3470a(this, this.f2724dX, z);
        }
        if (this.f2724dX.size > 0) {
            return this.f2724dX;
        }
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.Unit
    /* renamed from: dl */
    public float mo3160dl() {
        return this.customUnitMetadataA.f2847cT;
    }

    /* renamed from: dE */
    public void m3168dE() {
        if (this.f2703x.f2168a) {
            this.f2703x = this.f2703x.m3507b();
        }
    }
}