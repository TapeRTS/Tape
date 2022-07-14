package com.corrodinggames.rts.game.units.custom;

import android.graphics.Color;
import android.graphics.PointF;
import android.graphics.Rect;
import com.corrodinggames.rts.game.HueColor;
import com.corrodinggames.rts.game.Team;
import com.corrodinggames.rts.game.units.EnumC0295b;
import com.corrodinggames.rts.game.units.EnumC0588v;
import com.corrodinggames.rts.game.units.MovementType;
import com.corrodinggames.rts.game.units.OrderableUnit;
import com.corrodinggames.rts.game.units.Unit;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.air.AbstractC0297b;
import com.corrodinggames.rts.game.units.buildings.Building;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.UnitReference;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p015a.C0325b;
import com.corrodinggames.rts.game.units.custom.p015a.C0326c;
import com.corrodinggames.rts.game.units.custom.p015a.C0327d;
import com.corrodinggames.rts.game.units.custom.p015a.C0330g;
import com.corrodinggames.rts.game.units.custom.p015a.EnumC0328e;
import com.corrodinggames.rts.game.units.custom.p015a.EnumC0329f;
import com.corrodinggames.rts.game.units.custom.p015a.p016a.C0310a;
import com.corrodinggames.rts.game.units.custom.p015a.p016a.C0311b;
import com.corrodinggames.rts.game.units.custom.p015a.p016a.C0313d;
import com.corrodinggames.rts.game.units.custom.p015a.p016a.C0314e;
import com.corrodinggames.rts.game.units.custom.p015a.p016a.C0315f;
import com.corrodinggames.rts.game.units.custom.p015a.p016a.C0316g;
import com.corrodinggames.rts.game.units.custom.p015a.p016a.C0317h;
import com.corrodinggames.rts.game.units.custom.p015a.p016a.C0318i;
import com.corrodinggames.rts.game.units.custom.p015a.p016a.C0319j;
import com.corrodinggames.rts.game.units.custom.p015a.p016a.C0320k;
import com.corrodinggames.rts.game.units.custom.p015a.p016a.C0321l;
import com.corrodinggames.rts.game.units.custom.p015a.p016a.C0322m;
import com.corrodinggames.rts.game.units.custom.p015a.p016a.C0324o;
import com.corrodinggames.rts.game.units.custom.p017b.C0376b;
import com.corrodinggames.rts.game.units.custom.p017b.C0377c;
import com.corrodinggames.rts.game.units.custom.p017b.C0379e;
import com.corrodinggames.rts.game.units.custom.p017b.C0381g;
import com.corrodinggames.rts.game.units.custom.p017b.C0382h;
import com.corrodinggames.rts.game.units.custom.p019d.C0407b;
import com.corrodinggames.rts.game.units.custom.p020e.C0411a;
import com.corrodinggames.rts.game.units.custom.p020e.C0419c;
import com.corrodinggames.rts.game.units.custom.p020e.C0420d;
import com.corrodinggames.rts.game.units.custom.p020e.C0421e;
import com.corrodinggames.rts.game.units.custom.p022f.C0424a;
import com.corrodinggames.rts.game.units.land.AbstractC0507h;
import com.corrodinggames.rts.game.units.land.AbstractC0511j;
import com.corrodinggames.rts.game.units.land.Builder;
import com.corrodinggames.rts.game.units.land.ExperimentalHovertank;
import com.corrodinggames.rts.game.units.p012a.Action;
import com.corrodinggames.rts.game.units.p012a.C0211l;
import com.corrodinggames.rts.game.units.p012a.C0212m;
import com.corrodinggames.rts.game.units.p012a.C0213n;
import com.corrodinggames.rts.game.units.p012a.C0214o;
import com.corrodinggames.rts.game.units.p012a.C0221v;
import com.corrodinggames.rts.game.units.p012a.EnumC0219t;
import com.corrodinggames.rts.game.units.p012a.EnumC0220u;
import com.corrodinggames.rts.game.units.water.WaterUnit;
import com.corrodinggames.rts.gameFramework.C0651bl;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameAudio.AbstractC0602i;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.ModLoader.Mod;
import com.corrodinggames.rts.gameFramework.draw.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.draw.C0842h;
import com.corrodinggames.rts.gameFramework.file.C0670a;
import com.corrodinggames.rts.gameFramework.utility.C0911ac;
import com.corrodinggames.rts.gameFramework.utility.C0936j;
import com.corrodinggames.rts.gameFramework.utility.ObjectVector;
import com.corrodinggames.rts.gameFramework.utility.UnitConfig;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.ae */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ae.class */
public class CustomUnitMetadataFactory {

    /* renamed from: a */
    static int loadNumber;

    /* renamed from: b */
    static int f2123b;

    /* renamed from: c */
    public static int f2124c;

    /* renamed from: d */
    static Mod f2125d;

    /* renamed from: e */
    static boolean f2126e;

    /* renamed from: h */
    static int f2127h;

    /* renamed from: i */
    static int f2128i;

    /* renamed from: j */
    static boolean f2129j;

    /* renamed from: k */
    static int f2130k;

    /* renamed from: f */
    public static HashMap f2131f = new HashMap();

    /* renamed from: g */
    public static HashMap f2132g = new HashMap();

    /* renamed from: l */
    public static ObjectVector f2133l = new ObjectVector();

    /* renamed from: m */
    static HashMap f2134m = new HashMap();

    /* renamed from: n */
    static final Object f2135n = new Object();

    /* renamed from: o */
    static Mod f2136o = null;

    /* renamed from: p */
    static String f2137p = null;

    /* renamed from: a */
    public static void m3582a(int i) {
        if (f2125d != null) {
            f2125d.f5015z += i;
        }
    }

    /* renamed from: a */
    public static void m3583a() {
        m3535h();
        m3534i();
    }

    /* renamed from: a */
    public static void m3570a(BitmapOrTexture bitmapOrTexture) {
        if (bitmapOrTexture != null && !bitmapOrTexture.f5672u) {
            if (GameEngine.teamShaders && (bitmapOrTexture instanceof C0842h)) {
                return;
            }
            bitmapOrTexture.f5672u = true;
            m3582a(bitmapOrTexture.mo373t());
        }
    }

    /* renamed from: a */
    public static void m3551a(BitmapOrTexture[] bitmapOrTextureArr) {
        if (bitmapOrTextureArr != null) {
            BitmapOrTexture bitmapOrTexture = null;
            for (BitmapOrTexture bitmapOrTexture2 : bitmapOrTextureArr) {
                if (bitmapOrTexture2 != bitmapOrTexture) {
                    m3570a(bitmapOrTexture2);
                }
                if (bitmapOrTexture == null) {
                    bitmapOrTexture = bitmapOrTexture2;
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3572a(AbstractC0602i abstractC0602i) {
        if (!abstractC0602i.f3885g) {
            abstractC0602i.f3885g = true;
            if (f2125d != null) {
                f2125d.f4982A += abstractC0602i.mo75a();
            }
        }
    }

    /* renamed from: a */
    public static boolean m3568a(ObjectVector objectVector) {
        CustomUnitMetadata customUnitMetadata;
        GameEngine instance = GameEngine.getInstance();
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        ArrayList arrayList = new ArrayList(CustomUnitMetadata.f3009c);
        ArrayList arrayList2 = new ArrayList(CustomUnitMetadata.instances);
        ObjectVector objectVector2 = new ObjectVector();
        Iterator it = objectVector.iterator();
        while (it.hasNext()) {
            CustomUnitMetadata m3578a = m3578a((CustomUnitMetadata) it.next());
            if (m3578a == null) {
                GameEngine.PrintLOG("Failed to apply changes to unit type: " + customUnitMetadata.core_name);
                z = true;
            } else {
                GameEngine.PrintLOG("Changes applied to unit type: " + customUnitMetadata.core_name);
                z2 = true;
                objectVector2.add(m3578a);
            }
        }
        if (z2 && !m3540c(false)) {
            z = true;
        }
        if (z2 && !z) {
            CustomUnitMetadata.f3011e = null;
            m3538e();
            f2137p = null;
            Team.m3978J();
            z3 = true;
            if (!z) {
                Iterator it2 = objectVector2.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        break;
                    }
                    CustomUnitMetadata customUnitMetadata2 = (CustomUnitMetadata) it2.next();
                    if (customUnitMetadata2.f3101gh.size() > 0) {
                        instance.alert(customUnitMetadata2.f3101gh.size() + " Warning(s) loading: " + customUnitMetadata2.m3108b() + " \n" + ((String) customUnitMetadata2.f3101gh.get(0)), 1);
                        customUnitMetadata2.f3101gh.clear();
                        z3 = false;
                        break;
                    }
                }
            }
        }
        if (z) {
            GameEngine.PrintLOG("Failed to load some units, keeping old config");
            synchronized (CustomUnitMetadata.f3009c) {
                CustomUnitMetadata.f3009c.clear();
                CustomUnitMetadata.f3009c.addAll(arrayList);
            }
            CustomUnitMetadata.instances = arrayList2;
        }
        return z3;
    }

    /* renamed from: b */
    public static void m3550b() {
        ObjectVector objectVector = new ObjectVector();
        loadNumber = 0;
        f2123b = 0;
        f2124c = 0;
        Iterator it = Unit.m3767bE().iterator();
        while (it.hasNext()) {
            UnitType unitType = ((Unit) it.next()).getUnitType();
            if ((unitType instanceof CustomUnitMetadata) && !objectVector.contains(unitType)) {
                objectVector.add((CustomUnitMetadata) unitType);
            }
        }
        if (objectVector.size() > 0) {
            m3568a(objectVector);
        }
    }

    /* renamed from: c */
    public static void m3543c() {
        boolean z = false;
        ObjectVector objectVector = new ObjectVector();
        Iterator it = CustomUnitMetadata.f3009c.iterator();
        while (it.hasNext()) {
            CustomUnitMetadata customUnitMetadata = (CustomUnitMetadata) it.next();
            boolean z2 = false;
            Iterator it2 = customUnitMetadata.f3021k.iterator();
            while (it2.hasNext()) {
                C0450z c0450z = (C0450z) it2.next();
                long m3039a = c0450z.m3039a(false);
                if (m3039a != c0450z.f3177a) {
                    z2 = true;
                    c0450z.f3177a = m3039a;
                }
            }
            if (z2) {
                if (!z) {
                    GameEngine.PrintLOG("Detected unit changes");
                    z = true;
                }
                objectVector.add(customUnitMetadata);
            }
        }
        if (objectVector.size() > 0) {
            m3568a(objectVector);
        }
    }

    /* renamed from: d */
    public static void m3539d() {
        if (CustomUnitMetadata.f3011e != null) {
            GameEngine.PrintLOG("applyPendingNetworkUnits: Applying new network units from server (" + CustomUnitMetadata.f3011e.size() + " units)");
            CustomUnitMetadata.instances = CustomUnitMetadata.f3011e;
            CustomUnitMetadata.f3011e = null;
            m3538e();
            return;
        }
        GameEngine.PrintLOG("applyPendingNetworkUnits: no server units list found");
    }

    /* renamed from: a */
    public static ArrayList m3552a(boolean z) {
        ArrayList arrayList = new ArrayList();
        synchronized (CustomUnitMetadata.f3009c) {
            Iterator it = CustomUnitMetadata.f3009c.iterator();
            while (it.hasNext()) {
                CustomUnitMetadata customUnitMetadata = (CustomUnitMetadata) it.next();
                if (customUnitMetadata.f2736G == null || (customUnitMetadata.f2736G.m1551l() && z)) {
                    arrayList.add(customUnitMetadata);
                }
            }
        }
        return arrayList;
    }

    /* renamed from: a */
    public static UnitConfig m3567a(String str) {
        synchronized (f2134m) {
            UnitConfig unitConfig = (UnitConfig) f2134m.get(str);
            if (unitConfig != null) {
                return unitConfig;
            }
            C0936j m3547b = m3547b(str);
            if (m3547b == null) {
                return null;
            }
            try {
                UnitConfig unitConfig2 = new UnitConfig(new BufferedInputStream(m3547b), str);
                unitConfig2.m669a();
                unitConfig2.ioFilename = m3547b.m526d();
                f2134m.put(str, unitConfig2);
                return unitConfig2;
            } catch (IOException e) {
                e.printStackTrace();
                throw new C0395bl("Conf load failed", "IOException: " + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public static void m3573a(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2, boolean z) {
        UnitConfig m3567a = m3567a(str);
        if (m3567a == null) {
            if (z) {
                return;
            }
            throw new C0395bl("[" + str2 + "] Could not find conf target:" + str);
        }
        customUnitMetadata.m3078m(m3567a.ioFilename);
        unitConfig.m661a(m3567a);
        m3577a(customUnitMetadata, unitConfig, m3567a, str, 1);
    }

    /* renamed from: a */
    public static void m3577a(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, UnitConfig unitConfig2, String str, int i) {
        String str2;
        String str3;
        if (i > 10) {
            throw new C0395bl("copyFrom can only be 10 levels deep, maybe you have a loop?");
        }
        String staticStringValue = unitConfig2.getStaticStringValue("core", "copyFrom", (String) null);
        if (staticStringValue != null) {
            String[] split = staticStringValue.split(",");
            Collections.reverse(Arrays.asList(split));
            for (String str4 : split) {
                String trim = str4.trim();
                if (!trim.equals(VariableScope.nullOrMissingString)) {
                    if (trim.contains("..")) {
                        throw new C0395bl("'..' not supported in copyFrom");
                    }
                    if (trim.startsWith("ROOT:")) {
                        String substring = trim.substring("ROOT:".length());
                        if (customUnitMetadata.f2736G == null) {
                            str3 = "units/common.ini";
                        } else {
                            str3 = customUnitMetadata.f2736G.f5004m + "/common.ini";
                        }
                        str2 = m3560a(CommonUtils.m1631h(str3), substring);
                    } else {
                        str2 = m3560a(CommonUtils.m1631h(str), trim);
                    }
                    UnitConfig m3567a = m3567a(str2);
                    if (m3567a == null) {
                        String str5 = "Could not find copyFrom target:" + str2;
                        if (i != 0) {
                            str5 = str5 + " (while loading: " + str + ")";
                        }
                        throw new C0395bl(str5);
                    }
                    customUnitMetadata.m3078m(m3567a.ioFilename);
                    unitConfig.m661a(m3567a);
                    m3577a(customUnitMetadata, unitConfig, m3567a, str2, i + 1);
                }
            }
        }
    }

    /* renamed from: a */
    public static void m3576a(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2, int i) {
        if (i > 10) {
            throw new C0395bl("@copyFromSection can only be 10 levels deep, maybe you have a loop?");
        }
        String staticStringValue = unitConfig.getStaticStringValue(str2, "@copyFromSection", (String) null);
        if (staticStringValue == null || staticStringValue.equals(VariableScope.nullOrMissingString)) {
            return;
        }
        String[] split = staticStringValue.split(",");
        Collections.reverse(Arrays.asList(split));
        for (String str3 : split) {
            String trim = str3.trim();
            if (!trim.equals(VariableScope.nullOrMissingString)) {
                ObjectVector propertiesStartingWith = unitConfig.getPropertiesStartingWith(trim, VariableScope.nullOrMissingString);
                if (propertiesStartingWith.size() == 0) {
                    throw new C0395bl("[" + str2 + "]@copyFromSection: Could not find keys in target section: " + trim);
                }
                Iterator it = propertiesStartingWith.iterator();
                while (it.hasNext()) {
                    String str4 = (String) it.next();
                    String m632b = unitConfig.m632b(trim, str4);
                    if (m632b != null) {
                        unitConfig.m619d(str, str4, m632b);
                    }
                }
                m3576a(customUnitMetadata, unitConfig, str, trim, i + 1);
            }
        }
    }

    /* renamed from: a */
    public static TextWrapper getTextWrapper(UnitConfig unitConfig, String str, String str2, String str3) {
        return unitConfig.m639a(str, str2, str3, false);
    }

    /* renamed from: a */
    public static C0338ah m3575a(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2, String str3) {
        return unitConfig.m662a(customUnitMetadata, str, str2, str3);
    }

    /* renamed from: a */
    public static CustomUnitMetadata m3578a(CustomUnitMetadata customUnitMetadata) {
        String str = customUnitMetadata.f2732B;
        GameEngine instance = GameEngine.getInstance();
        CustomUnitMetadata customUnitMetadata2 = null;
        String str2 = null;
        if (customUnitMetadata.f2736G != null) {
            str2 = customUnitMetadata.f2736G.f4990K;
        }
        synchronized (f2134m) {
            f2134m.clear();
        }
        f2137p = null;
        try {
            customUnitMetadata2 = m3565a(str, customUnitMetadata.f2736G, customUnitMetadata.f2737H, customUnitMetadata.root);
        } catch (RuntimeException e) {
            e.printStackTrace();
            if (f2137p == null) {
                instance.alert("Error loading unit:" + m3571a(customUnitMetadata.f2736G, str, true) + "\n" + e.getMessage(), 1);
            }
        }
        if (customUnitMetadata2 == null && customUnitMetadata.f2736G != null) {
            customUnitMetadata.f2736G.f4990K = str2;
        }
        if (customUnitMetadata2 != null) {
            synchronized (CustomUnitMetadata.f3009c) {
                CustomUnitMetadata.f3009c.remove(customUnitMetadata);
            }
            m3579a((UnitType) customUnitMetadata, customUnitMetadata2, true);
            if (CustomUnitMetadata.instances.remove(customUnitMetadata)) {
                CustomUnitMetadata.instances.add(customUnitMetadata2);
                if (customUnitMetadata.f2734E != customUnitMetadata2.f2734E) {
                    f2124c++;
                }
            } else {
                GameEngine.PrintLOG("Changed unit was not enabled (original not found in customUnitTypes)");
            }
            Team.m3978J();
        }
        return customUnitMetadata2;
    }

    /* renamed from: a */
    public static void m3579a(UnitType unitType, CustomUnitMetadata customUnitMetadata, boolean z) {
        Iterator it = Unit.m3767bE().iterator();
        while (it.hasNext()) {
            Unit unit = (Unit) it.next();
            if (unit instanceof C0433j) {
                C0433j c0433j = (C0433j) unit;
                if (c0433j.customUnitMetadataA == unitType) {
                    Team.m3940b((Unit) c0433j);
                    c0433j.m3207a(customUnitMetadata, false, z);
                    c0433j.mo2650R();
                    if (c0433j.m3736dc() != null) {
                        c0433j.m3736dc().m3411a(customUnitMetadata);
                    }
                    Team.m3924c(c0433j);
                }
                if (c0433j.customUnitMetadataB == unitType) {
                    c0433j.customUnitMetadataB = customUnitMetadata;
                }
            }
        }
    }

    /* renamed from: b */
    public static String m3544b(boolean z) {
        ArrayList m3552a = m3552a(z);
        CustomUnitMetadata.f3011e = null;
        CustomUnitMetadata.instances = m3552a;
        f2137p = null;
        m3538e();
        return f2137p;
    }

    /* renamed from: c */
    public static boolean m3540c(boolean z) {
        ArrayList arrayList;
        ArrayList arrayList2 = CustomUnitMetadata.instances;
        if (z) {
            arrayList = m3552a(true);
        } else {
            arrayList = CustomUnitMetadata.instances;
        }
        boolean z2 = true;
        f2137p = null;
        CustomUnitMetadata.instances = arrayList;
        m3537f();
        if (f2137p != null) {
            z2 = false;
        }
        CustomUnitMetadata.instances = arrayList2;
        m3537f();
        return z2;
    }

    /* renamed from: e */
    public static void m3538e() {
        synchronized (f2135n) {
            m3530m();
        }
    }

    /* renamed from: m */
    private static void m3530m() {
        CustomUnitMetadata customUnitMetadata = null;
        ArrayList arrayList = new ArrayList();
        if (GameEngine.getInstance().m863ao()) {
            for (com.corrodinggames.rts.game.units.UnitType unitType : com.corrodinggames.rts.game.units.UnitType.values()) {
                arrayList.add(unitType);
            }
        }
        Iterator it = CustomUnitMetadata.instances.iterator();
        while (it.hasNext()) {
            CustomUnitMetadata customUnitMetadata2 = (CustomUnitMetadata) it.next();
            arrayList.add(customUnitMetadata2);
            if (customUnitMetadata2.core_name.equals("missing") && customUnitMetadata2.f2736G == null) {
                customUnitMetadata = customUnitMetadata2;
            }
        }
        com.corrodinggames.rts.game.units.UnitType.f1702ae = arrayList;
        Unit.m3763bK();
        m3537f();
        C0411a.m3334d();
        if (customUnitMetadata == null) {
            GameEngine.PrintLOG("missingPlaceHolder is not an active unit, searching for new target");
            Iterator it2 = CustomUnitMetadata.instances.iterator();
            while (it2.hasNext()) {
                CustomUnitMetadata customUnitMetadata3 = (CustomUnitMetadata) it2.next();
                if (customUnitMetadata3.core_name.equals("missing")) {
                    GameEngine.PrintLOG("Found a missing placeholder");
                    customUnitMetadata = customUnitMetadata3;
                }
            }
        }
        CustomUnitMetadata.frontCustomUnitMetadata = customUnitMetadata;
    }

    /* renamed from: b */
    public static C0936j m3547b(String str) {
        return C0670a.m2156j(VariableScope.nullOrMissingString + str);
    }

    /* renamed from: a */
    public static void m3553a(ArrayList arrayList) {
        Collections.sort(arrayList);
    }

    /* renamed from: a */
    public static void m3580a(UnitType unitType) {
        C0211l c0211l;
        C0211l c0211l2;
        GameEngine gameEngine = GameEngine.getInstance();
        try {
            unitType.mo3089h();
            if (unitType instanceof CustomUnitMetadata) {
                CustomUnitMetadata customUnitMetadata = (CustomUnitMetadata) unitType;
                if (customUnitMetadata.f2993fx != null) {
                    UnitType m3709a = com.corrodinggames.rts.game.units.UnitType.m3709a(customUnitMetadata.f2993fx);
                    if (m3709a == null) {
                        throw new C0395bl("Could not find [ai]upgradedFrom target:" + customUnitMetadata.f2993fx);
                    }
                    customUnitMetadata.m3106b(m3709a);
                }
                Iterator it = customUnitMetadata.f3026p.iterator();
                while (it.hasNext()) {
                    ((C0445u) it.next()).mo3047a();
                }
                if (customUnitMetadata.core_isPickableStartingUnit) {
                    CustomUnitMetadata.f3013g.add(customUnitMetadata);
                }
            }
            Iterator it2 = CustomUnitMetadata.instances.iterator();
            while (it2.hasNext()) {
                CustomUnitMetadata customUnitMetadata2 = (CustomUnitMetadata) it2.next();
                if (unitType instanceof CustomUnitMetadata) {
                    CustomUnitMetadata customUnitMetadata3 = (CustomUnitMetadata) unitType;
                    if (customUnitMetadata2.f2993fx != null && customUnitMetadata2.f2993fx.equalsIgnoreCase(customUnitMetadata3.mo3087i())) {
                        customUnitMetadata3.m3106b(customUnitMetadata2);
                    }
                }
                Iterator it3 = customUnitMetadata2.f3095fU.iterator();
                while (it3.hasNext()) {
                    C0440p c0440p = (C0440p) it3.next();
                    if (c0440p.f3146a.equalsIgnoreCase(unitType.mo3087i())) {
                        c0440p.f3150e = true;
                        boolean z = false;
                        for (int i = customUnitMetadata2.f2857ce; i <= 3; i++) {
                            ArrayList mo3132a = unitType.mo3132a(i);
                            if (customUnitMetadata2.f2751aB || c0440p.f3148c) {
                                c0211l2 = new C0221v(customUnitMetadata2);
                            } else {
                                c0211l2 = new C0211l(customUnitMetadata2, null);
                            }
                            if (c0440p.f3147b != -999.0f) {
                                c0211l2.f1435f = c0440p.f3147b;
                            }
                            if (c0440p.f3151f != null) {
                                boolean z2 = false;
                                if (!(unitType instanceof CustomUnitMetadata) && !(Unit.m3777a(unitType) instanceof OrderableUnit)) {
                                    z2 = true;
                                }
                                if (!z2) {
                                    c0211l2.f1436g = C0326c.m3621a(c0440p);
                                } else if (!z) {
                                    z = true;
                                    customUnitMetadata2.m3072p("builtFrom isLocked currently cannot be used when targeting old-style unit:" + unitType.mo3087i());
                                }
                            }
                            boolean z3 = false;
                            Iterator it4 = mo3132a.iterator();
                            while (it4.hasNext()) {
                                if (c0211l2.equals((Action) it4.next())) {
                                    z3 = true;
                                }
                            }
                            if (!z3) {
                                mo3132a.add(c0211l2);
                            }
                            m3553a(mo3132a);
                        }
                    }
                }
            }
            if (unitType instanceof CustomUnitMetadata) {
                CustomUnitMetadata customUnitMetadata4 = (CustomUnitMetadata) unitType;
                Iterator it5 = customUnitMetadata4.f3096fV.iterator();
                while (it5.hasNext()) {
                    C0327d c0327d = (C0327d) it5.next();
                    if (c0327d.f2042j != null && c0327d.f2042j.equalsIgnoreCase("setRally")) {
                        for (int i2 = 1; i2 <= 3; i2++) {
                            ArrayList mo3132a2 = unitType.mo3132a(i2);
                            C0214o c0214o = new C0214o();
                            if (c0327d.f2059o != -999.0f) {
                                c0214o.f1435f = c0327d.f2059o;
                            }
                            mo3132a2.add(c0214o);
                            customUnitMetadata4.f2845cR = true;
                            m3553a(mo3132a2);
                        }
                    } else if (c0327d.f2042j != null && c0327d.f2042j.equalsIgnoreCase("reclaim")) {
                        for (int i3 = 1; i3 <= 3; i3++) {
                            ArrayList mo3132a3 = unitType.mo3132a(i3);
                            C0212m c0212m = new C0212m(true);
                            if (c0327d.f2059o != -999.0f) {
                                c0212m.f1435f = c0327d.f2059o;
                            }
                            mo3132a3.add(c0212m);
                            m3553a(mo3132a3);
                        }
                    } else if (c0327d.f2042j != null && c0327d.f2042j.equalsIgnoreCase("repair")) {
                        for (int i4 = 1; i4 <= 3; i4++) {
                            ArrayList mo3132a4 = unitType.mo3132a(i4);
                            C0213n c0213n = new C0213n();
                            if (c0327d.f2059o != -999.0f) {
                                c0213n.f1435f = c0327d.f2059o;
                            }
                            mo3132a4.add(c0213n);
                            m3553a(mo3132a4);
                        }
                    } else {
                        UnitType unitType2 = null;
                        if (c0327d.f2042j != null) {
                            unitType2 = com.corrodinggames.rts.game.units.UnitType.m3709a(c0327d.f2042j);
                            if (unitType2 == null) {
                                throw new C0395bl("Could not find canBuild target:" + c0327d.f2042j);
                            }
                        } else if (c0327d.f2071aG != EnumC0329f.f2082b) {
                            throw new C0395bl("'Target' required for action:" + c0327d.m3617a());
                        }
                        for (int i5 = 1; i5 <= 3; i5++) {
                            ArrayList mo3132a5 = unitType.mo3132a(i5);
                            if (c0327d.f2071aG == EnumC0329f.f2081a) {
                                if (unitType2.mo3085j() || c0327d.f2007aE) {
                                    c0211l = new C0221v(unitType2, c0327d.f2006aD, null);
                                    c0211l.f1436g = C0326c.m3622a(c0327d);
                                } else {
                                    c0211l = new C0211l(unitType2, null);
                                    c0211l.f1436g = C0326c.m3622a(c0327d);
                                }
                            } else if (c0327d.f2071aG == EnumC0329f.f2082b) {
                                c0211l = new C0330g(c0327d, CustomUnitMetadata.m3129a(unitType2));
                            } else {
                                throw new C0395bl("Could not find actionType:" + c0327d.f2071aG);
                            }
                            if (c0327d.f2059o != -999.0f) {
                                c0211l.f1435f = c0327d.f2059o;
                            }
                            boolean z4 = false;
                            Iterator it6 = mo3132a5.iterator();
                            while (it6.hasNext()) {
                                if (c0211l.equals((Action) it6.next())) {
                                    z4 = true;
                                }
                            }
                            if (!z4) {
                                mo3132a5.add(c0211l);
                            }
                            m3553a(mo3132a5);
                        }
                    }
                }
            }
            if (unitType instanceof CustomUnitMetadata) {
                CustomUnitMetadata customUnitMetadata5 = (CustomUnitMetadata) unitType;
                customUnitMetadata5.f2979fj = false;
                for (int i6 = 1; i6 <= 3; i6++) {
                    Iterator it7 = unitType.mo3132a(i6).iterator();
                    while (it7.hasNext()) {
                        Action action = (Action) it7.next();
                        if (!(action instanceof C0330g) && action.mo2734i() != null) {
                            customUnitMetadata5.f2979fj = true;
                        }
                    }
                }
                Iterator it8 = customUnitMetadata5.f3026p.iterator();
                while (it8.hasNext()) {
                    ((C0445u) it8.next()).mo3046b();
                }
            }
            boolean z5 = gameEngine.m919K() && gameEngine.networkEngine.setup.f5215k;
            for (int i7 = 1; i7 <= 3; i7++) {
                Iterator it9 = unitType.mo3132a(i7).iterator();
                while (it9.hasNext()) {
                    Action action2 = (Action) it9.next();
                    if (action2.f1436g instanceof C0325b) {
                        GameEngine.PrintLOG_err("=== ChainedActionConfig already on: " + unitType.mo3087i() + " action:" + action2.getText());
                        action2.f1436g = ((C0325b) action2.f1436g).f1973b;
                    }
                    if (z5) {
                        C0407b mo3586z = action2.mo3586z();
                        C0407b mo3595o_ = action2.mo3595o_();
                        if (!mo3586z.m3388b() && mo3595o_ == null) {
                            C0325b c0325b = new C0325b(action2.f1436g);
                            action2.f1436g = c0325b;
                            c0325b.f1974c = C0407b.f2549a;
                            c0325b.f1975d = mo3586z;
                        }
                    }
                }
            }
        } catch (C0395bl e) {
            m3562a(unitType.mo3087i(), e, unitType);
        } catch (RuntimeException e2) {
            m3562a(unitType.mo3087i(), e2, unitType);
        }
    }

    /* renamed from: f */
    public static void m3537f() {
        synchronized (f2135n) {
            m3529n();
        }
    }

    /* renamed from: n */
    private static void m3529n() {
        C0440p c0440p;
        CustomUnitMetadata.f3013g.clear();
        CustomUnitMetadata.f3012f.clear();
        Iterator it = CustomUnitMetadata.instances.iterator();
        while (it.hasNext()) {
            CustomUnitMetadata customUnitMetadata = (CustomUnitMetadata) it.next();
            Iterator it2 = customUnitMetadata.f3095fU.iterator();
            while (it2.hasNext()) {
                ((C0440p) it2.next()).f3150e = false;
            }
            customUnitMetadata.f3086fA.clear();
        }
        Iterator it3 = CustomUnitMetadata.instances.iterator();
        while (it3.hasNext()) {
            CustomUnitMetadata customUnitMetadata2 = (CustomUnitMetadata) it3.next();
            try {
                if (customUnitMetadata2.f2742N != null) {
                    for (String str : customUnitMetadata2.f2742N.split(",")) {
                        String trim = str.trim();
                        UnitType m3705a = com.corrodinggames.rts.game.units.UnitType.m3705a(trim, false);
                        if (m3705a == null) {
                            throw new C0395bl("Could not find overrideAndReplace target:" + trim);
                            break;
                        }
                        if (m3705a instanceof CustomUnitMetadata) {
                            GameEngine.PrintLOG("Replacing:" + m3705a.mo3087i() + " with " + customUnitMetadata2.mo3087i());
                        }
                        CustomUnitMetadata.f3012f.put(m3705a, customUnitMetadata2);
                    }
                }
            } catch (C0395bl e) {
                m3562a(customUnitMetadata2.mo3087i(), e, customUnitMetadata2);
            }
        }
        for (com.corrodinggames.rts.game.units.UnitType unitType : com.corrodinggames.rts.game.units.UnitType.values()) {
            m3580a(unitType);
        }
        Iterator it4 = CustomUnitMetadata.instances.iterator();
        while (it4.hasNext()) {
            m3580a((UnitType) ((CustomUnitMetadata) it4.next()));
        }
        Iterator it5 = CustomUnitMetadata.instances.iterator();
        while (it5.hasNext()) {
            CustomUnitMetadata customUnitMetadata3 = (CustomUnitMetadata) it5.next();
            Iterator it6 = customUnitMetadata3.f3095fU.iterator();
            while (it6.hasNext()) {
                if (!((C0440p) it6.next()).f3150e) {
                    String str2 = c0440p.f3149d + " failed to find target:" + c0440p.f3146a;
                    customUnitMetadata3.m3074o(str2);
                    if (customUnitMetadata3.core_strictLevel >= 1) {
                        GameEngine.PrintLOG("Converting warning to error (meta.strictLevel=" + customUnitMetadata3.core_strictLevel + ")");
                        customUnitMetadata3.m3076n(str2);
                    }
                }
            }
            if (customUnitMetadata3.f3099gd != null && customUnitMetadata3.f3099gd.size() > 0) {
                Iterator it7 = customUnitMetadata3.f3099gd.iterator();
                while (it7.hasNext()) {
                    try {
                        ((C0444t) it7.next()).m3051b(customUnitMetadata3);
                    } catch (C0395bl e2) {
                        m3562a(customUnitMetadata3.mo3087i(), e2, customUnitMetadata3);
                    }
                }
            }
        }
        Iterator it8 = CustomUnitMetadata.instances.iterator();
        while (it8.hasNext()) {
            ((CustomUnitMetadata) it8.next()).m3070r();
        }
        Collections.sort(CustomUnitMetadata.f3013g, new C0441q());
    }

    /* renamed from: a */
    public static CustomUnitMetadata m3565a(String filename, Mod mod, String str, String str2) {
        try {
            long tookTime = C0651bl.getTookTime();
            C0936j m3547b = m3547b(filename);
            if (m3547b == null) {
                throw new RuntimeException("Failed to open unit config file:" + filename);
            }
            BufferedInputStream bufferedInputStream = new BufferedInputStream(m3547b);
            m3581a(tookTime, EnumC0336af.f2144g);
            loadNumber++;
            if (mod != null) {
                f2123b++;
            }
            GameEngine instance = GameEngine.getInstance();
            String str3 = "core units";
            if (mod != null) {
                str3 = mod.getCurMods();
            }
            instance.m819h("Loading units - " + loadNumber + " (" + str3 + ")");
            CustomUnitMetadata readUnitConfig = readUnitConfig(filename, bufferedInputStream, m3547b.m527c(), mod, m3547b, str, str2);
            long tookTime2 = C0651bl.getTookTime();
            try {
                bufferedInputStream.close();
                m3547b.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            m3581a(tookTime2, EnumC0336af.f2145h);
            return readUnitConfig;
        } catch (RuntimeException e2) {
            m3561a(filename, e2, mod);
            return null;
        }
    }

    /* renamed from: g */
    public static void m3536g() {
        GameEngine gameEngine = GameEngine.getInstance();
        ArrayList m1571j = gameEngine.ModEngine.m1571j();
        f2128i = 0;
        f2127h = 0;
        f2130k = 0;
        f2129j = false;
        long tookTime = C0651bl.getTookTime();
        for (BitmapOrTexture bitmapOrTexture : f2131f.values()) {
            bitmapOrTexture.f5672u = false;
            if (bitmapOrTexture.f5655a != null) {
                for (BitmapOrTexture bitmapOrTexture2 : bitmapOrTexture.f5655a) {
                    bitmapOrTexture2.f5672u = false;
                }
            }
            if (bitmapOrTexture.f5656b != null) {
                for (BitmapOrTexture bitmapOrTexture3 : bitmapOrTexture.f5656b) {
                    bitmapOrTexture3.f5672u = false;
                }
            }
            if (bitmapOrTexture.f5657c != null) {
                for (BitmapOrTexture bitmapOrTexture4 : bitmapOrTexture.f5657c) {
                    bitmapOrTexture4.f5672u = false;
                }
            }
        }
        for (AbstractC0602i abstractC0602i : f2132g.values()) {
            abstractC0602i.f3885g = false;
        }
        byte[] bArr = null;
        ByteBuffer[] byteBufferArr = null;
        try {
            bArr = new byte[8000000];
            bArr[0] = gameEngine.f5995dZ;
            gameEngine.f5996ea = bArr[1];
            if (!GameEngine.isNonDedicatedServer()) {
                byteBufferArr = new ByteBuffer[]{ByteBuffer.allocateDirect(5000000), ByteBuffer.allocateDirect(5000000)};
            }
        } catch (OutOfMemoryError e) {
            System.gc();
            GameEngine.PrintLOG("Failed to reserve memory pre-mod load");
        }
        synchronized (CustomUnitMetadata.f3009c) {
            CustomUnitMetadata.f3009c.clear();
        }
        CustomUnitMetadata.instances.clear();
        CustomUnitMetadata.f3011e = null;
        CustomUnitMetadata.f3012f.clear();
        gameEngine.ModEngine.m1568m();
        loadNumber = 0;
        f2123b = 0;
        synchronized (f2134m) {
            f2134m.clear();
        }
        m3566a(C0670a.m2151o("units"), 1, false, (Mod) null, C0670a.m2151o("units"), (String) null);
        if (!GameEngine.noMods && !gameEngine.f5936at) {
            m3554a(m3533j(), true, (Mod) null);
            m3554a(m3532k(), true, (Mod) null);
            String m3531l = m3531l();
            if (!C0670a.m2160f(m3531l)) {
                GameEngine.PrintLOG("Modded Custom '" + m3531l + "' directory not found");
            }
            Iterator it = m1571j.iterator();
            while (it.hasNext()) {
                Mod mod = (Mod) it.next();
                if (!mod.f5009r && mod.f5004m != null) {
                    String m1554i = mod.m1554i();
                    if (mod.f5000i) {
                        m1554i = C0670a.m2151o(m1554i);
                    }
                    GameEngine.PrintLOG("Loading mod at:" + m1554i);
                    m3566a(m1554i, 2, true, mod, m1554i, (String) null);
                }
            }
            Iterator it2 = m1571j.iterator();
            while (it2.hasNext()) {
                Mod mod2 = (Mod) it2.next();
                if (mod2.f5009r && mod2.f5004m != null) {
                    String m1555h = mod2.m1555h();
                    GameEngine.PrintLOG("Loading workshop mod at:" + m1555h);
                    m3566a(m1555h, 2, true, mod2, m1555h, (String) null);
                }
            }
        }
        m3583a();
        m3544b(true);
        GameEngine.PrintLOG("Done loading custom units. image cacheHits:" + f2128i + " image cacheMisses:" + f2127h + " (in: " + C0651bl.m2277a(tookTime) + "ms)");
        GameEngine.PrintLOG("========= Mods data loaded ===========");
        GameEngine.PrintLOG("Number of mods:" + m1571j.size());
        Iterator it3 = m1571j.iterator();
        while (it3.hasNext()) {
            ((Mod) it3.next()).m1544s();
        }
        GameEngine.PrintLOG("================================");
        if (byteBufferArr != null) {
            byteBufferArr[0] = null;
            byteBufferArr[1] = null;
        }
        if (bArr != null) {
            bArr[1] = gameEngine.f5995dZ;
            gameEngine.f5996ea = bArr[1];
            System.gc();
            System.gc();
        }
    }

    /* renamed from: a */
    public static void m3554a(String str, boolean z, Mod mod) {
        m3566a(str, 1, z, mod, (String) null, (String) null);
    }

    /* renamed from: a */
    public static void m3566a(String str, int i, boolean z, Mod mod, String str2, String str3) {
        boolean z2 = z && i == 1;
        GameEngine gameEngine = GameEngine.getInstance();
        if (mod != null) {
            if (mod.f4995d && !gameEngine.curSettings.loadDisabledModData) {
                mod.f5011v = true;
                GameEngine.PrintLOG("unitDataSkipped for: " + str);
                return;
            }
            mod.f5011v = false;
        }
        C0670a.m2168c();
        String[] m2159g = C0670a.m2159g(str);
        if (m2159g == null) {
            String m2168c = C0670a.m2168c();
            GameEngine.log("readAllCustomUnitConfigs: ERROR");
            GameEngine.log("readAllCustomUnitConfigs: Failed to load:" + str);
            if (mod != null) {
                if (!mod.f5012w) {
                    if (m2168c == null) {
                        mod.f4990K = "Failed to list directory, check file permissions";
                        return;
                    } else {
                        mod.f4990K = "Failed to list directory: " + m2168c;
                        return;
                    }
                }
                mod.f4991L = "Failed to list subdirectory: '" + str + "' check file permissions";
                if (m2168c != null) {
                    mod.f4991L += ": " + m2168c;
                    return;
                }
                return;
            }
            return;
        }
        if (mod != null) {
            mod.f5012w = true;
        }
        if (!z2) {
            for (String str4 : m2159g) {
                if (str4.equalsIgnoreCase("all-units.template")) {
                    str3 = str;
                }
            }
        }
        for (String str5 : m2159g) {
            if (!str5.equals("custom_units_here.txt") && !str5.equals("mods_here_will_be_enabled_by_default.txt") && !str5.equals("__MACOSX")) {
                boolean z3 = false;
                Mod mod2 = mod;
                if (z && i == 1 && mod2 == null) {
                    mod2 = gameEngine.ModEngine.m1580d(str5);
                    if (mod2 == null) {
                        GameEngine.log("readAllCustomUnitConfigs: Could not find linked mod:" + str5);
                        mod2 = gameEngine.ModEngine.f4977c;
                    }
                    z3 = true;
                }
                if (str5.toLowerCase(Locale.ENGLISH).endsWith(".ini") && !z2) {
                    String str6 = str + "/" + str5;
                    if (f2136o != mod2 && mod2 != null) {
                        f2136o = mod2;
                        m3583a();
                        GameEngine.PrintLOG("Loading units from mod: " + mod2.f4992a);
                    }
                    if (str5.equalsIgnoreCase("desktop.ini")) {
                        GameEngine.PrintLOG("Skipping possible system file: " + str6);
                    } else {
                        long tookTime = C0651bl.getTookTime();
                        m3565a(str6, mod2, str2, str3);
                        m3581a(tookTime, EnumC0336af.f2143f);
                    }
                } else if (str5.toLowerCase(Locale.ENGLISH).endsWith(".tmx")) {
                    String str7 = str + "/" + str5;
                    GameEngine.PrintLOG("Found map: " + str7);
                    if (mod2 != null && mod2.f5017u) {
                        gameEngine.ModEngine.m1591a(str7, mod2);
                    } else {
                        GameEngine.PrintLOG("Skipping map due to mod settings");
                    }
                } else {
                    String str8 = str + "/" + str5;
                    if (i < 10) {
                        if (C0670a.m2160f(str8)) {
                            String str9 = str2;
                            if (str9 == null) {
                                str9 = str8;
                            }
                            long j = -1;
                            if (z3) {
                                j = C0651bl.getTookTime();
                                GameEngine.PrintLOG("============");
                                GameEngine.PrintLOG(">>> Mod '" + mod2.m1561c() + "'" + (mod2.m1551l() ? VariableScope.nullOrMissingString : " (disabled)"));
                            }
                            m3566a(str8, i + 1, z, mod2, str9, str3);
                            if (z3 && mod2 != null && mod2.m1551l()) {
                                GameEngine.PrintLOG("Mod '" + mod2.m1561c() + "' load took:" + C0651bl.m2278a(C0651bl.m2277a(j)));
                            }
                        }
                    } else {
                        GameEngine.PrintLOG("Too many levels:" + str8);
                    }
                }
            }
        }
    }

    // 似乎是用来读取单位数据的
    /* renamed from: a */
    public static CustomUnitMetadata readUnitConfig(String filename, InputStream inputStream, long j, Mod mod, C0936j c0936j, String str, String modRoot) {
        boolean z;
        C0346ap c0346ap;
        boolean z2;
        String str2;
        GameEngine instance = GameEngine.getInstance();
        try {
            instance.graphics.mo144d();
            long tookTime = C0651bl.getTookTime();
            try {
                UnitConfig unitConfig = new UnitConfig(inputStream, filename);
                m3581a(tookTime, EnumC0336af.f2142e);
                CustomUnitMetadata customUnitMetadata = new CustomUnitMetadata();
                if (unitConfig.getStaticBooleanValue("core", "dont_load", (Boolean) false).booleanValue()) {
                    return null;
                }
                customUnitMetadata.f2732B = filename;
                customUnitMetadata.f2733C = c0936j.m526d();
                customUnitMetadata.f2736G = mod;
                customUnitMetadata.f2737H = str;
                customUnitMetadata.root = modRoot;
                f2125d = mod;
                f2126e = false;
                if (customUnitMetadata.f2736G != null) {
                }
                long tookTime2 = C0651bl.getTookTime();
                m3577a(customUnitMetadata, unitConfig, unitConfig, filename, 0);
                if (customUnitMetadata.root != null) {
                    m3573a(customUnitMetadata, unitConfig, customUnitMetadata.root + "/all-units.template", "AUTO units.template", true);
                }
                unitConfig.addTrack("core", "copyFrom");
                customUnitMetadata.core_strictLevel = unitConfig.getStaticIntegerValue("core", "strictLevel", (Integer) 0).intValue();
                if (customUnitMetadata.core_strictLevel < 0) {
                    throw new C0395bl("[core]strictLevel cannot be < 0");
                }
                if (customUnitMetadata.core_strictLevel > 1) {
                    throw new C0395bl("[core]strictLevel cannot yet be > 1");
                }
                customUnitMetadata.core_logIfCreditResourceUsed = unitConfig.getStaticBooleanValue("core", "logIfCreditResourceUsed", (Boolean) false).booleanValue();
                unitConfig.addTrack("core", "dont_load");
                unitConfig.getStaticStringValue("core", "class", "CustomUnitMetadata");
                Iterator it = unitConfig.getValueList2("@copyFrom_skipThisSection").iterator();
                while (it.hasNext()) {
                    unitConfig.addTrack((String) it.next(), "@copyFrom_skipThisSection");
                }
                Iterator it2 = unitConfig.getValueList2("@copyFromSection").iterator();
                while (it2.hasNext()) {
                    String str3 = (String) it2.next();
                    m3576a(customUnitMetadata, unitConfig, str3, str3, 0);
                }
                C0424a.m3266a(customUnitMetadata, unitConfig);
                m3581a(tookTime2, EnumC0336af.f2146i);
                customUnitMetadata.core_name = unitConfig.getStaticStringValueNoNull("core", "name");
                customUnitMetadata.f2734E = unitConfig.m628c();
                if (customUnitMetadata.core_name.equals("self")) {
                    throw new C0395bl("Unit name: " + customUnitMetadata.core_name + " is reserved");
                }
                if (customUnitMetadata.core_name.startsWith("self.")) {
                    throw new C0395bl("Unit name cannot start with self.");
                }
                String staticStringValue = unitConfig.getStaticStringValue("core", "altNames", (String) null);
                if (staticStringValue != null && !staticStringValue.equalsIgnoreCase("NONE")) {
                    for (String str4 : staticStringValue.split(",")) {
                        customUnitMetadata.core_altNames.add(str4.trim());
                    }
                }
                customUnitMetadata.core_tags = ValueListSource.splitToValueListDefaultNull(unitConfig.getStaticStringValue("core", "tags", (String) null));
                if (customUnitMetadata.core_strictLevel >= 1 && customUnitMetadata.core_tags != null) {
                    for (ValueListSource valueListSource : customUnitMetadata.core_tags.f2670a) {
                        if (valueListSource.name.contains(" ")) {
                            throw new C0395bl("(strictLevel 1) [core]tags: space in tag: '" + valueListSource.name + "'");
                        }
                    }
                }
                customUnitMetadata.f2742N = unitConfig.getStaticStringValue("core", "overrideAndReplace", (String) null);
                if (customUnitMetadata.f2742N != null && customUnitMetadata.f2742N.equalsIgnoreCase("NONE")) {
                    customUnitMetadata.f2742N = null;
                }
                String staticStringValue2 = unitConfig.getStaticStringValue("core", "defineUnitMemory", (String) null);
                if (staticStringValue2 != null) {
                    customUnitMetadata.f3027q.addDefineValue(customUnitMetadata, "core", "defineUnitMemory", staticStringValue2);
                }
                Iterator core_memoryIterator = unitConfig.getPropertiesStartingWith("core", "@memory ").iterator();
                while (core_memoryIterator.hasNext()) {
                    String str5 = (String) core_memoryIterator.next();
                    String trim = str5.substring("@memory ".length()).trim();
                    String staticStringValue3 = unitConfig.getStaticStringValue("core", str5, (String) null);
                    if (staticStringValue3 != null) {
                        if (!staticStringValue3.contains(",")) {
                            customUnitMetadata.f3027q.addSingleDefine(customUnitMetadata, trim, staticStringValue3, "core", str5);
                        } else {
                            throw new C0395bl("[core]" + str5 + ": Only a single variable can be defined per @memory");
                        }
                    }
                }
                customUnitMetadata.core_onNewMapSpawn = (OnMapSpawnType) unitConfig.getEnumValue("core", "onNewMapSpawn", (Enum) null, OnMapSpawnType.class);
                customUnitMetadata.core_globalScale = unitConfig.getStaticFloatValue("core", "globalScale", Float.valueOf(1.0f)).floatValue();
                customUnitMetadata.m3078m(customUnitMetadata.f2733C);
                if (customUnitMetadata.core_name.equals("missing")) {
                    if (mod == null) {
                        GameEngine.PrintLOG("Setting missingPlaceHolder");
                        CustomUnitMetadata.frontCustomUnitMetadata = customUnitMetadata;
                    } else {
                        GameEngine.PrintLOG("Not setting missingPlaceHolder, as we are in a mod");
                    }
                }
                customUnitMetadata.core_displayLocaleKey = unitConfig.getStaticStringValue("core", "displayLocaleKey", (String) null);
                customUnitMetadata.core_displayText = getTextWrapper(unitConfig, "core", "displayText", (String) null);
                customUnitMetadata.core_displayDescription = getTextWrapper(unitConfig, "core", "displayDescription", (String) null);
                customUnitMetadata.core_isBio = unitConfig.getStaticBooleanValue("core", "isBio", (Boolean) false).booleanValue();
                customUnitMetadata.core_isBug = unitConfig.getStaticBooleanValue("core", "isBug", (Boolean) false).booleanValue();
                customUnitMetadata.core_isPickableStartingUnit = unitConfig.getStaticBooleanValue("core", "isPickableStartingUnit", (Boolean) false).booleanValue();
                customUnitMetadata.core_startFallingWhenStartingUnit = unitConfig.getStaticBooleanValue("core", "startFallingWhenStartingUnit", (Boolean) false).booleanValue();
                customUnitMetadata.core_stayNeutral = unitConfig.getStaticBooleanValue("core", "stayNeutral", (Boolean) false).booleanValue();
                customUnitMetadata.core_createNeutral = unitConfig.getStaticBooleanValue("core", "createNeutral", (Boolean) false).booleanValue();
                if (unitConfig.getStaticBooleanValue("core", "createOnNeutralTeam", (Boolean) false).booleanValue()) {
                    customUnitMetadata.core_createNeutral = true;
                }
                customUnitMetadata.core_whileNeutralTransportAnyTeam = unitConfig.getStaticBooleanValue("core", "whileNeutralTransportAnyTeam", (Boolean) false).booleanValue();
                customUnitMetadata.core_whileNeutralConvertToTransportedTeam = unitConfig.getStaticBooleanValue("core", "whileNeutralConvertToTransportedTeam", (Boolean) false).booleanValue();
                customUnitMetadata.core_convertToNeutralIfNotTransporting = unitConfig.getStaticBooleanValue("core", "convertToNeutralIfNotTransporting", (Boolean) false).booleanValue();
                if (customUnitMetadata.core_convertToNeutralIfNotTransporting) {
                    customUnitMetadata.core_stayNeutral = true;
                }
                customUnitMetadata.core_createOnAggressiveTeam = unitConfig.getStaticBooleanValue("core", "createOnAggressiveTeam", (Boolean) false).booleanValue();
                customUnitMetadata.core_showInEditor = unitConfig.getStaticBooleanValue("core", "showInEditor", (Boolean) true).booleanValue();
                customUnitMetadata.graphics_total_frames = unitConfig.getStaticIntegerValue("graphics", "total_frames", (Integer) 1).intValue();
                if (customUnitMetadata.graphics_total_frames < 1) {
                    throw new C0395bl("TOTAL_FRAMES cannot be: " + customUnitMetadata.graphics_total_frames + " (must be 1 or more)");
                }
                customUnitMetadata.graphics_frame_width = unitConfig.getStaticIntegerValue("graphics", "frame_width", (Integer) (-1)).intValue();
                customUnitMetadata.graphics_frame_height = unitConfig.getStaticIntegerValue("graphics", "frame_height", (Integer) (-1)).intValue();
                customUnitMetadata.graphics_default_frame = unitConfig.getStaticIntegerValue("graphics", "default_frame", (Integer) 0).intValue();
                customUnitMetadata.graphics_image_offsetX = unitConfig.getStaticIntegerValue("graphics", "image_offsetX", (Integer) 0).intValue();
                customUnitMetadata.graphics_image_offsetY = unitConfig.getStaticIntegerValue("graphics", "image_offsetY", (Integer) 0).intValue();
                customUnitMetadata.hueColor = HueColor.PureGreen;
                if (unitConfig.getStaticBooleanValue("graphics", "teamColorsUseHue", (Boolean) false).booleanValue()) {
                    customUnitMetadata.hueColor = HueColor.HueAdd;
                }
                String staticStringValue4 = unitConfig.getStaticStringValue("graphics", "teamColoringMode", (String) null);
                if (staticStringValue4 != null) {
                    if (unitConfig.getStaticBooleanValue("graphics", "teamColorsUseHue", (Boolean) null) != null) {
                        throw new C0395bl("Cannot use teamColoringMode and teamColorsUseHue at the same time");
                    }
                    if (staticStringValue4.equalsIgnoreCase("pureGreen")) {
                        customUnitMetadata.hueColor = HueColor.PureGreen;
                    } else if (staticStringValue4.equalsIgnoreCase("hueAdd")) {
                        customUnitMetadata.hueColor = HueColor.HueAdd;
                    } else if (staticStringValue4.equalsIgnoreCase("hueShift")) {
                        customUnitMetadata.hueColor = HueColor.HueShift;
                    } else if (staticStringValue4.equalsIgnoreCase("disabled")) {
                        customUnitMetadata.hueColor = HueColor.Disabled;
                    } else {
                        throw new C0395bl("Unknown teamColoringMode:" + staticStringValue4);
                    }
                }
                customUnitMetadata.graphics_imageSmoothing = unitConfig.getStaticBooleanValue("graphics", "imageSmoothing", (Boolean) false).booleanValue();
                customUnitMetadata.graphics_imageSmoothingWhenZoomedIn = unitConfig.getStaticBooleanValue("graphics", "imageSmoothingWhenZoomedIn", (Boolean) false).booleanValue();
                customUnitMetadata.graphics_isVisible = unitConfig.getLogicBooleanValue(customUnitMetadata, "graphics", "isVisible", (LogicBoolean) null);
                if (customUnitMetadata.graphics_isVisible == LogicBoolean.trueBoolean) {
                    customUnitMetadata.graphics_isVisible = null;
                }
                customUnitMetadata.f3064cA.graphics_isVisibleToEnemies = unitConfig.getStaticBooleanValue("graphics", "isVisibleToEnemies", (Boolean) true).booleanValue();
                customUnitMetadata.graphics_image = customUnitMetadata.m3112a(filename, unitConfig.getStaticStringValueNoNull("graphics", "image"), customUnitMetadata.graphics_imageSmoothing, "graphics", "image");
                if (customUnitMetadata.graphics_image == null) {
                    throw new C0395bl("Main unit image must be set on custom unit");
                }
                customUnitMetadata.imageWidth = customUnitMetadata.graphics_image.getWidth() / customUnitMetadata.graphics_total_frames;
                customUnitMetadata.imageHeight = customUnitMetadata.graphics_image.getHeight();
                if (customUnitMetadata.graphics_frame_width > 0) {
                    customUnitMetadata.imageWidth = customUnitMetadata.graphics_frame_width;
                }
                if (customUnitMetadata.graphics_frame_height > 0) {
                    customUnitMetadata.imageHeight = customUnitMetadata.graphics_frame_height;
                    if (customUnitMetadata.imageHeight < customUnitMetadata.graphics_image.getHeight()) {
                        customUnitMetadata.f3031S = customUnitMetadata.graphics_image.getWidth() / customUnitMetadata.imageWidth;
                        if (customUnitMetadata.f3031S < 1) {
                            customUnitMetadata.f3031S = 1;
                        }
                    }
                }
                customUnitMetadata.graphics_image_back = customUnitMetadata.getImage(unitConfig, "graphics", "image_back");
                customUnitMetadata.graphics_image_back_always_use_full_image = unitConfig.getStaticBooleanValue("graphics", "image_back_always_use_full_image", (Boolean) false).booleanValue();
                customUnitMetadata.graphics_image_wreak = customUnitMetadata.getImage(unitConfig, "graphics", "image_wreak");
                customUnitMetadata.graphics_image_turret = customUnitMetadata.getImage(unitConfig, "graphics", "image_turret");
                customUnitMetadata.f2779am = AbstractC0511j.f3465dE;
                String staticStringValue5 = unitConfig.getStaticStringValue("graphics", "image_shadow", "NONE");
                if (staticStringValue5.equalsIgnoreCase("AUTO")) {
                    String str6 = "[autoShadow:" + customUnitMetadata.imageWidth + "," + customUnitMetadata.imageHeight + "]" + customUnitMetadata.graphics_image.f5658d + "-" + customUnitMetadata.graphics_image.f5675e;
                    BitmapOrTexture m3542c = m3542c(str6);
                    if (m3542c != null) {
                        customUnitMetadata.f3038aj = m3542c;
                    } else {
                        customUnitMetadata.f3038aj = Unit.m3772a(customUnitMetadata.graphics_image, customUnitMetadata.imageWidth, customUnitMetadata.imageHeight);
                        m3570a(customUnitMetadata.f3038aj);
                        if (customUnitMetadata.f3038aj != null) {
                            m3564a(str6, customUnitMetadata.f3038aj);
                        }
                    }
                } else if (staticStringValue5.equalsIgnoreCase("AUTO_ANIMATED")) {
                    String str7 = "[autoShadowAnimated:" + customUnitMetadata.imageWidth + "," + customUnitMetadata.imageHeight + "]" + customUnitMetadata.graphics_image.f5658d + "-" + customUnitMetadata.graphics_image.f5675e;
                    BitmapOrTexture m3542c2 = m3542c(str7);
                    if (m3542c2 != null) {
                        customUnitMetadata.f3038aj = m3542c2;
                    } else {
                        customUnitMetadata.f3038aj = Unit.m3772a(customUnitMetadata.graphics_image, customUnitMetadata.graphics_image.getWidth(), customUnitMetadata.graphics_image.getHeight());
                        m3570a(customUnitMetadata.f3038aj);
                        if (customUnitMetadata.f3038aj != null) {
                            m3564a(str7, customUnitMetadata.f3038aj);
                        }
                    }
                    customUnitMetadata.graphics_image_shadow_frames = true;
                } else {
                    customUnitMetadata.f3038aj = customUnitMetadata.m3112a(filename, staticStringValue5, customUnitMetadata.graphics_imageSmoothing, "graphics", "image_shadow");
                }
                if (unitConfig.getStaticBooleanValue("graphics", "image_shadow_frames", (Boolean) false).booleanValue()) {
                    customUnitMetadata.graphics_image_shadow_frames = true;
                }
                customUnitMetadata.f3039al = customUnitMetadata.m3119a(customUnitMetadata.graphics_image, customUnitMetadata.hueColor);
                customUnitMetadata.f2999r = unitConfig.getStaticBooleanValue("graphics", "teamColorsOnTurret", (Boolean) false).booleanValue();
                if (customUnitMetadata.f2999r && customUnitMetadata.graphics_image_turret != null) {
                    customUnitMetadata.f3040an = customUnitMetadata.m3119a(customUnitMetadata.graphics_image_turret, customUnitMetadata.hueColor);
                }
                float floatValue = unitConfig.getStaticFloatValue("graphics", "scaleImagesTo", Float.valueOf(-1.0f)).floatValue();
                if (floatValue > 0.0f) {
                    customUnitMetadata.f3053bC = (floatValue * customUnitMetadata.core_globalScale) / customUnitMetadata.imageWidth;
                }
                float floatValue2 = unitConfig.getStaticFloatValue("graphics", "imageScale", Float.valueOf(1.0f)).floatValue();
                if (floatValue2 != 1.0f) {
                    customUnitMetadata.f3053bC *= floatValue2;
                }
                float floatValue3 = unitConfig.getStaticFloatValue("graphics", "scaleTurretImagesTo", Float.valueOf(-1.0f)).floatValue();
                if (floatValue3 > 0.0f) {
                    float f = floatValue3 * customUnitMetadata.core_globalScale;
                    if (customUnitMetadata.graphics_image_turret == null) {
                        throw new RuntimeException("scaleTurretImagesTo needs image_turret set");
                    }
                    customUnitMetadata.f3054bD = f / customUnitMetadata.graphics_image_turret.width;
                }
                float floatValue4 = unitConfig.getStaticFloatValue("graphics", "turretImageScale", Float.valueOf(1.0f)).floatValue();
                if (floatValue4 != 1.0f) {
                    customUnitMetadata.f3054bD *= floatValue4;
                }
                customUnitMetadata.f3041ao = ExperimentalHovertank.f3415e;
                BitmapOrTexture image = customUnitMetadata.getImage(unitConfig, "graphics", "image_shield");
                if (image != null) {
                    customUnitMetadata.f3041ao = image;
                    customUnitMetadata.f3042ap = true;
                }
                customUnitMetadata.f2780aq = customUnitMetadata.m3117a(unitConfig, "graphics", "icon_build", false);
                float width = customUnitMetadata.graphics_image.getWidth() * customUnitMetadata.f3053bC;
                float height = customUnitMetadata.graphics_image.getHeight() * customUnitMetadata.f3053bC;
                if (width / 2.0f > 90.0f || height / 2.0f > 90.0f) {
                    customUnitMetadata.f2731A = new Rect();
                    customUnitMetadata.f2731A.left = (int) ((-width) / 2.0f);
                    customUnitMetadata.f2731A.right = (int) (width / 2.0f);
                    customUnitMetadata.f2731A.top = (int) ((-height) / 2.0f);
                    customUnitMetadata.f2731A.bottom = (int) (height / 2.0f);
                    customUnitMetadata.f3007z = true;
                }
                Iterator it3 = unitConfig.m601m("resource_", "global_resource_").iterator();
                while (it3.hasNext()) {
                    String str8 = (String) it3.next();
                    if (str8.startsWith("resource_")) {
                        str2 = str8.substring("resource_".length());
                        z2 = false;
                    } else {
                        str2 = str8.substring("global_resource_".length());
                        z2 = true;
                    }
                    String trim2 = str2.trim();
                    if (trim2.contains(" ")) {
                        throw new RuntimeException("[" + str8 + "] resource codename cannot contain a space");
                    }
                    if (trim2.contains("=") || trim2.contains("|") || trim2.contains(":") || trim2.contains(",") || trim2.contains("(") || trim2.contains(")") || trim2.contains("<") || trim2.contains(">") || trim2.contains("$")) {
                        throw new RuntimeException("[" + str8 + "] resource codename cannot contain the symbols: =|:,()<>$");
                    }
                    C0419c c0419c = new C0419c(z2);
                    c0419c.m3316a(customUnitMetadata, unitConfig, str8, trim2);
                    if (customUnitMetadata.m3086i(c0419c.f2606a) != null) {
                        throw new RuntimeException("[" + str8 + "] resource with name:" + c0419c.f2606a + " already exists in this file");
                    }
                    customUnitMetadata.f3020j.add(c0419c);
                }
                Iterator it4 = customUnitMetadata.f3020j.iterator();
                while (it4.hasNext()) {
                    ((C0419c) it4.next()).m3317a(customUnitMetadata);
                }
                if (instance.mo809l()) {
                    C0381g.m3478a(customUnitMetadata, unitConfig);
                    C0379e.m3482a(customUnitMetadata, unitConfig);
                }
                C0382h.m3467a(customUnitMetadata, unitConfig);
                customUnitMetadata.f3055bV = unitConfig.m631b("core", "autoTriggerCooldownTime", Float.valueOf(60.0f)).floatValue();
                if (customUnitMetadata.f3055bV < 0.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be < 0");
                }
                if (customUnitMetadata.f3055bV > 120.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be more than 2 seconds");
                }
                if (!unitConfig.getStaticBooleanValue("core", "autoTriggerCooldownTime_allowDangerousHighCPU", (Boolean) false).booleanValue() && customUnitMetadata.f3055bV < 5.0f) {
                    throw new RuntimeException("autoTriggerCooldownTime cannot be this low (without override). Note this cooldown is only applied after triggering an action not for the detection.");
                }
                customUnitMetadata.f3056bW = (EnumC0443s) unitConfig.getEnumValue("core", "autoTriggerCheckRate", EnumC0443s.f3157a, EnumC0443s.class);
                customUnitMetadata.f3064cA.f2169b = unitConfig.m611g("core", "mass");
                customUnitMetadata.f2805bX = unitConfig.getStaticBooleanValue("core", "availableInDemo", (Boolean) true).booleanValue();
                customUnitMetadata.f2806bY = unitConfig.getStaticBooleanValue("core", "isLocked", (Boolean) false).booleanValue();
                customUnitMetadata.f2807bZ = unitConfig.getStaticBooleanValue("core", "isLockedIfGameModeNoNuke", (Boolean) false).booleanValue();
                customUnitMetadata.f2854ca = C0407b.m3395a(customUnitMetadata, unitConfig, "core", "price", false);
                customUnitMetadata.f2855cb = C0407b.m3396a(customUnitMetadata, unitConfig, "core", "reclaimPrice", (C0407b) null);
                customUnitMetadata.f2856cc = C0407b.m3383b(customUnitMetadata, unitConfig, "core", "streamingCost", (C0407b) null);
                boolean booleanValue = unitConfig.getStaticBooleanValue("core", "switchPriceWithStreamingCost", (Boolean) false).booleanValue();
                if (booleanValue) {
                    if (customUnitMetadata.f2856cc != null) {
                        throw new RuntimeException("[core]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                    }
                    customUnitMetadata.f2856cc = C0407b.m3383b(customUnitMetadata, unitConfig, "core", "price", (C0407b) null);
                    customUnitMetadata.f2854ca = C0407b.f2549a;
                }
                customUnitMetadata.f3057cd = unitConfig.m620d("core", "buildSpeed", Float.valueOf(1.0f)).floatValue();
                customUnitMetadata.f2857ce = unitConfig.getStaticIntegerValue("core", "techLevel", (Integer) 1).intValue();
                if (customUnitMetadata.f2857ce > 3) {
                    throw new RuntimeException("techLevel cannot be greater than max tech level of:3");
                }
                if (customUnitMetadata.f2857ce < 1) {
                    throw new RuntimeException("techLevel cannot be less than 1, it is:" + customUnitMetadata.f2857ce);
                }
                customUnitMetadata.f2858cf = unitConfig.getStaticBooleanValue("core", "experimental", (Boolean) false).booleanValue();
                customUnitMetadata.f3061cl = C0407b.m3395a(customUnitMetadata, unitConfig, "core", "borrowResourcesWhileAlive", true);
                customUnitMetadata.f3062cm = C0407b.m3395a(customUnitMetadata, unitConfig, "core", "borrowResourcesWhileBuilt", true);
                customUnitMetadata.f3058cg = C0407b.m3395a(customUnitMetadata, unitConfig, "core", "generation_resources", true);
                int intValue = unitConfig.getStaticIntegerValue("core", "generation_credits", (Integer) 0).intValue();
                if (intValue != 0) {
                    customUnitMetadata.f3058cg = C0407b.m3397a(customUnitMetadata.f3058cg, C0407b.m3405a(intValue));
                }
                customUnitMetadata.f2859cj = unitConfig.getStaticIntegerValue("core", "generation_delay", (Integer) 40).intValue();
                if (customUnitMetadata.f2859cj == 0) {
                    customUnitMetadata.f2859cj = 1;
                }
                if (customUnitMetadata.f2859cj < 0) {
                    throw new RuntimeException("[core]generation_delay cannot be < 0");
                }
                customUnitMetadata.f2860ck = 40.0f / customUnitMetadata.f2859cj;
                if (!customUnitMetadata.f3058cg.m3388b()) {
                    customUnitMetadata.f3059ch = new C0421e();
                    customUnitMetadata.f3059ch.m3312a(customUnitMetadata.f3058cg);
                    customUnitMetadata.f3059ch.m3314a(customUnitMetadata.f2860ck);
                }
                if (!customUnitMetadata.f3059ch.m3287c()) {
                    Iterator it5 = customUnitMetadata.f3059ch.f2635b.iterator();
                    while (it5.hasNext()) {
                        C0420d c0420d = (C0420d) it5.next();
                        if (!c0420d.f2632a.m3338b() && c0420d.f2632a.m3335c()) {
                            if (customUnitMetadata.f3060ci == C0421e.f2634a) {
                                customUnitMetadata.f3060ci = new C0421e();
                            }
                            customUnitMetadata.f3060ci.m3294b(c0420d.f2632a, c0420d.f2633b);
                        }
                    }
                }
                customUnitMetadata.f2861cn = unitConfig.getLogicBooleanValue(customUnitMetadata, "core", "generation_active", LogicBoolean.trueBoolean);
                customUnitMetadata.m3127a(customUnitMetadata.f3058cg);
                customUnitMetadata.f2868cu = unitConfig.getStaticFloatValue("core", "resourceRate", Float.valueOf(0.0f)).floatValue();
                if (booleanValue && customUnitMetadata.f2868cu != 0.0f) {
                    throw new RuntimeException("To avoid mistakes [core]resourceRate cannot be used with switchPriceWithStreamingCost=true");
                }
                customUnitMetadata.f2869cv = unitConfig.getStaticIntegerValue("core", "resourceMaxConcurrentReclaimingThis", (Integer) Integer.MAX_VALUE).intValue();
                customUnitMetadata.f2870cw = unitConfig.m666a(customUnitMetadata, "core", "similarResourcesHaveTag", (ValueList) null);
                customUnitMetadata.f2898dd = C0392bi.m3439a(customUnitMetadata, unitConfig.getStaticStringValue("core", "soundOnAttackOrder", (String) null));
                customUnitMetadata.f2899de = C0392bi.m3439a(customUnitMetadata, unitConfig.getStaticStringValue("core", "soundOnMoveOrder", (String) null));
                customUnitMetadata.f2900df = C0392bi.m3439a(customUnitMetadata, unitConfig.getStaticStringValue("core", "soundOnNewSelection", (String) null));
                String staticStringValue6 = unitConfig.getStaticStringValue("graphics", "drawLayer", (String) null);
                if (staticStringValue6 != null) {
                    if (staticStringValue6.equals("experimentals")) {
                        customUnitMetadata.f3063cx = 4;
                    } else if (staticStringValue6.equals("underwater")) {
                        customUnitMetadata.f3063cx = 1;
                    } else if (staticStringValue6.equals("bottom")) {
                        customUnitMetadata.f3063cx = 1;
                    } else if (staticStringValue6.equals("ground")) {
                        customUnitMetadata.f3063cx = 2;
                    } else if (staticStringValue6.equals("ground2")) {
                        customUnitMetadata.f3063cx = 3;
                    } else if (staticStringValue6.equals("air")) {
                        customUnitMetadata.f3063cx = 5;
                    } else if (staticStringValue6.equals("top")) {
                        customUnitMetadata.f3063cx = 10;
                    } else if (staticStringValue6.equals("wreaks")) {
                        customUnitMetadata.f3063cx = 0;
                    } else {
                        throw new RuntimeException("unknown drawLayer:" + staticStringValue6);
                    }
                }
                customUnitMetadata.f2871cy = unitConfig.getStaticFloatValue("graphics", "shadowOffsetX", Float.valueOf(0.0f)).floatValue();
                customUnitMetadata.f2872cz = unitConfig.getStaticFloatValue("graphics", "shadowOffsetY", Float.valueOf(0.0f)).floatValue();
                customUnitMetadata.f2907dq = unitConfig.getStaticBooleanValue("graphics", "rotate_with_direction", (Boolean) true).booleanValue();
                customUnitMetadata.f2908dr = unitConfig.getStaticBooleanValue("graphics", "lock_body_rotation_with_main_turret", (Boolean) false).booleanValue();
                customUnitMetadata.f2909ds = unitConfig.getStaticBooleanValue("graphics", "lock_shadow_rotation_with_main_turret", Boolean.valueOf(customUnitMetadata.f2908dr)).booleanValue();
                customUnitMetadata.f2910dt = unitConfig.getStaticBooleanValue("graphics", "lock_leg_rotation_with_main_turret", (Boolean) false).booleanValue();
                customUnitMetadata.f2912dv = unitConfig.getStaticFloatValue("graphics", "whenBeingBuiltMakeTransparentTill", Float.valueOf(1.0f)).floatValue();
                customUnitMetadata.f2913dw = C0437m.m3060a(customUnitMetadata, unitConfig, "graphics", "animation_", false);
                Iterator it6 = unitConfig.m618e("effect_").iterator();
                while (it6.hasNext()) {
                    String str9 = (String) it6.next();
                    C0369av c0369av = new C0369av(str9.substring("effect_".length()));
                    c0369av.m3494a(customUnitMetadata, unitConfig, str9);
                    customUnitMetadata.f3094fR.add(c0369av);
                }
                Iterator it7 = customUnitMetadata.f3094fR.iterator();
                while (it7.hasNext()) {
                    C0369av c0369av2 = (C0369av) it7.next();
                    if (c0369av2.alsoEmitEffects != null) {
                        c0369av2.alsoEmitEffects.m3040c();
                    }
                    if (c0369av2.alsoEmitEffectsOnDeath != null) {
                        c0369av2.alsoEmitEffectsOnDeath.m3040c();
                    }
                    if (c0369av2.ifSpawnFailsEmitEffects != null) {
                        c0369av2.ifSpawnFailsEmitEffects.m3040c();
                    }
                }
                customUnitMetadata.f2788bE = unitConfig.getStaticBooleanValue("graphics", "splastEffect", (Boolean) false).booleanValue();
                customUnitMetadata.f2791bH = unitConfig.getStaticBooleanValue("graphics", "dustEffect", (Boolean) false).booleanValue();
                customUnitMetadata.f2789bF = unitConfig.getStaticBooleanValue("graphics", "splastEffectReverse", (Boolean) true).booleanValue();
                customUnitMetadata.f2792bI = unitConfig.getStaticBooleanValue("graphics", "dustEffectReverse", (Boolean) true).booleanValue();
                customUnitMetadata.f2790bG = customUnitMetadata.f2791bH || customUnitMetadata.f2788bE;
                String staticStringValue7 = unitConfig.getStaticStringValue("graphics", "movementEffect", (String) null);
                if (staticStringValue7 != null) {
                    customUnitMetadata.f2793bJ = customUnitMetadata.m3114a(staticStringValue7, (C0449y) null);
                    if (customUnitMetadata.f2793bJ != null && customUnitMetadata.f2793bJ.m3044a()) {
                        customUnitMetadata.f2790bG = true;
                    }
                }
                String staticStringValue8 = unitConfig.getStaticStringValue("graphics", "movementEffectReverse", (String) null);
                if (staticStringValue8 != null) {
                    customUnitMetadata.f2794bK = customUnitMetadata.m3114a(staticStringValue8, (C0449y) null);
                    if (customUnitMetadata.f2794bK != null && customUnitMetadata.f2794bK.m3044a()) {
                        customUnitMetadata.f2790bG = true;
                    }
                }
                customUnitMetadata.f2796bM = unitConfig.getStaticFloatValue("graphics", "movementEffectRate", Float.valueOf(11.0f)).floatValue();
                customUnitMetadata.f2795bL = unitConfig.getStaticBooleanValue("graphics", "movementEffectReverseFlipEffects", (Boolean) false).booleanValue();
                customUnitMetadata.f2798bO = unitConfig.getStaticFloatValue("graphics", "repairEffectRate", Float.valueOf(5.0f)).floatValue();
                String staticStringValue9 = unitConfig.getStaticStringValue("graphics", "repairEffect", (String) null);
                if (staticStringValue9 != null) {
                    customUnitMetadata.f2799bP = customUnitMetadata.m3114a(staticStringValue9, (C0449y) null);
                    if (customUnitMetadata.f2799bP != null && customUnitMetadata.f2799bP.m3041b()) {
                        customUnitMetadata.f2797bN = true;
                    }
                }
                String staticStringValue10 = unitConfig.getStaticStringValue("graphics", "repairEffectAtTarget", (String) null);
                if (staticStringValue10 != null) {
                    customUnitMetadata.f2800bQ = customUnitMetadata.m3114a(staticStringValue10, (C0449y) null);
                    if (customUnitMetadata.f2800bQ != null && customUnitMetadata.f2800bQ.m3041b()) {
                        customUnitMetadata.f2797bN = true;
                    }
                }
                customUnitMetadata.f2802bS = unitConfig.getStaticFloatValue("graphics", "reclaimEffectRate", Float.valueOf(5.0f)).floatValue();
                String staticStringValue11 = unitConfig.getStaticStringValue("graphics", "reclaimEffect", (String) null);
                if (staticStringValue11 != null) {
                    customUnitMetadata.f2803bT = customUnitMetadata.m3114a(staticStringValue11, (C0449y) null);
                    if (customUnitMetadata.f2803bT != null && customUnitMetadata.f2803bT.m3041b()) {
                        customUnitMetadata.f2801bR = true;
                    }
                }
                String staticStringValue12 = unitConfig.getStaticStringValue("graphics", "reclaimEffectAtTarget", (String) null);
                if (staticStringValue12 != null) {
                    customUnitMetadata.f2804bU = customUnitMetadata.m3114a(staticStringValue12, (C0449y) null);
                    if (customUnitMetadata.f2804bU != null && customUnitMetadata.f2804bU.m3041b()) {
                        customUnitMetadata.f2801bR = true;
                    }
                }
                customUnitMetadata.f3069dh.m3270a(customUnitMetadata, unitConfig, "graphics", "animation_" + customUnitMetadata.f3069dh.f2638a + "_");
                customUnitMetadata.f3070di.m3270a(customUnitMetadata, unitConfig, "graphics", "animation_" + customUnitMetadata.f3070di.f2638a + "_");
                customUnitMetadata.f3071dj.m3270a(customUnitMetadata, unitConfig, "graphics", "animation_" + customUnitMetadata.f3071dj.f2638a + "_");
                Iterator it8 = unitConfig.m618e("animation_").iterator();
                while (it8.hasNext()) {
                    String str10 = (String) it8.next();
                    C0423f c0423f = new C0423f(str10.substring("animation_".length()));
                    c0423f.m3270a(customUnitMetadata, unitConfig, str10, VariableScope.nullOrMissingString);
                    customUnitMetadata.f3068dg.add(c0423f);
                }
                customUnitMetadata.f3069dh = customUnitMetadata.m3122a(EnumC0438n.f3133a, customUnitMetadata.f3069dh, true);
                customUnitMetadata.f3070di = customUnitMetadata.m3122a(EnumC0438n.f3135c, customUnitMetadata.f3070di, true);
                customUnitMetadata.f3071dj = customUnitMetadata.m3122a(EnumC0438n.f3134b, customUnitMetadata.f3071dj, true);
                customUnitMetadata.f2902dl = customUnitMetadata.m3123a(EnumC0438n.f3137e);
                customUnitMetadata.f2903dm = customUnitMetadata.m3123a(EnumC0438n.f3138f);
                if (customUnitMetadata.f2902dl != null && customUnitMetadata.f2903dm != null) {
                    throw new RuntimeException("Cannot use underConstruction and underConstructionWithLinkedBuiltTime animations at the same time");
                }
                customUnitMetadata.f2901dk = customUnitMetadata.m3123a(EnumC0438n.f3136d);
                customUnitMetadata.f2904dn = customUnitMetadata.m3123a(EnumC0438n.f3139g);
                if (customUnitMetadata.f2904dn != null) {
                    customUnitMetadata.f2809bb = true;
                }
                customUnitMetadata.f2905do = customUnitMetadata.m3123a(EnumC0438n.f3140h);
                customUnitMetadata.f2906dp = customUnitMetadata.m3123a(EnumC0438n.f3141i);
                customUnitMetadata.f3064cA.maxhp = unitConfig.m611g("core", "maxHp");
                customUnitMetadata.f3064cA.maxshield = unitConfig.getStaticIntegerValue("core", "maxShield", (Integer) 0).intValue();
                customUnitMetadata.f2832cB = unitConfig.getStaticBooleanValue("core", "startShieldAtZero", (Boolean) false).booleanValue();
                customUnitMetadata.f3064cA.shieldregen = unitConfig.getStaticFloatValue("core", "shieldRegen", Float.valueOf(0.25f)).floatValue();
                customUnitMetadata.f2840cJ = unitConfig.getStaticBooleanValue("core", "shieldDisplayOnlyDeflection", (Boolean) false).booleanValue();
                customUnitMetadata.f2841cK = unitConfig.getStaticFloatValue("core", "shieldDeflectionDisplayRate", Float.valueOf(4.0f)).floatValue();
                customUnitMetadata.f3064cA.armour = unitConfig.getStaticFloatValue("core", "armour", Float.valueOf(0.0f)).floatValue();
                customUnitMetadata.f2833cC = unitConfig.getStaticFloatValue("core", "armourMinDamageToKeep", Float.valueOf(1.0f)).floatValue();
                customUnitMetadata.f3064cA.f2171d = unitConfig.getStaticFloatValue("core", "energyMax", Float.valueOf(0.0f)).floatValue();
                customUnitMetadata.f2834cD = unitConfig.getStaticBooleanValue("core", "startEnergyAtZero", (Boolean) false).booleanValue();
                customUnitMetadata.f2835cE = unitConfig.getStaticFloatValue("core", "energyRegen", Float.valueOf(0.0f)).floatValue();
                customUnitMetadata.f2838cH = unitConfig.getStaticFloatValue("core", "energyStartingPercentage", Float.valueOf(1.0f)).floatValue();
                customUnitMetadata.f2837cG = unitConfig.getStaticBooleanValue("core", "energyNeedsToRechargeToFull", (Boolean) false).booleanValue();
                customUnitMetadata.f2836cF = unitConfig.getStaticFloatValue("core", "energyRegenWhenRecharging", Float.valueOf(customUnitMetadata.f2835cE)).floatValue();
                customUnitMetadata.f2839cI = getTextWrapper(unitConfig, "core", "energyDisplayName", (String) null);
                customUnitMetadata.f2842cL = unitConfig.m611g("core", "radius");
                customUnitMetadata.f2846cS = unitConfig.getStaticIntegerValue("core", "displayRadius", Integer.valueOf(customUnitMetadata.f2842cL)).intValue();
                float f2 = customUnitMetadata.f2842cL;
                if (f2 < 6.0f) {
                    f2 = 6.0f;
                }
                customUnitMetadata.f2847cT = unitConfig.getStaticFloatValue("core", "uiTargetRadius", Float.valueOf(f2)).floatValue();
                customUnitMetadata.f2848cU = unitConfig.getStaticIntegerValue("core", "shieldRenderRadius", Integer.valueOf(customUnitMetadata.f2842cL)).intValue();
                customUnitMetadata.f2849cV = unitConfig.getStaticIntegerValue("core", "buildingSelectionOffset", (Integer) 0).intValue();
                customUnitMetadata.f3065cM = unitConfig.m649a("core", "footprint", customUnitMetadata.f3065cM);
                customUnitMetadata.f3066cN = unitConfig.m649a("core", "constructionFootprint", customUnitMetadata.f3066cN);
                customUnitMetadata.f3067cO.m4664a(customUnitMetadata.f3065cM);
                customUnitMetadata.f3067cO = unitConfig.m649a("core", "displayFootprint", customUnitMetadata.f3067cO);
                customUnitMetadata.f2843cP = unitConfig.getStaticFloatValue("core", "buildingToFootprintOffsetX", Float.valueOf(10.0f)).floatValue();
                customUnitMetadata.f2844cQ = unitConfig.getStaticFloatValue("core", "buildingToFootprintOffsetY", Float.valueOf(10.0f)).floatValue();
                customUnitMetadata.f2842cL = (int) (customUnitMetadata.f2842cL * customUnitMetadata.core_globalScale);
                customUnitMetadata.f2846cS = (int) (customUnitMetadata.f2846cS * customUnitMetadata.core_globalScale);
                customUnitMetadata.f3064cA.f2181n = unitConfig.getStaticIntegerValue("core", "fogOfWarSightRange", (Integer) 15).intValue();
                customUnitMetadata.f2850cW = unitConfig.getStaticIntegerValue("core", "fogOfWarSightRangeWhileNotBuilt", (Integer) (-1)).intValue();
                customUnitMetadata.f2851cX = unitConfig.getStaticFloatValue("core", "exit_x", Float.valueOf(0.0f)).floatValue();
                customUnitMetadata.f2852cY = unitConfig.getStaticFloatValue("core", "exit_y", Float.valueOf(9.0f)).floatValue();
                customUnitMetadata.f2853cZ = unitConfig.getStaticFloatValue("core", "exit_dirOffset", (Float) null);
                customUnitMetadata.f2895da = unitConfig.getStaticFloatValue("core", "exit_heightOffset", Float.valueOf(0.0f)).floatValue();
                customUnitMetadata.f2896db = unitConfig.getStaticBooleanValue("core", "exitHeightIgnoreParent", (Boolean) false).booleanValue();
                customUnitMetadata.f2897dc = unitConfig.getStaticFloatValue("core", "exit_moveAwayAmount", Float.valueOf(70.0f));
                customUnitMetadata.f2950eq = unitConfig.getStaticIntegerValue("core", "softCollisionOnAll", (Integer) 0).intValue();
                customUnitMetadata.f2951er = unitConfig.getStaticBooleanValue("core", "disableAllUnitCollisions", (Boolean) false).booleanValue();
                if (customUnitMetadata.f2951er) {
                    customUnitMetadata.f3065cM.set(0, 0, -1, -1);
                }
                customUnitMetadata.f3078ey = unitConfig.getStaticBooleanValue("core", "hideScorchMark", (Boolean) false).booleanValue();
                customUnitMetadata.f3079ez = unitConfig.getStaticBooleanValue("graphics", "disableLowHpFire", Boolean.valueOf(customUnitMetadata.core_isBio)).booleanValue();
                customUnitMetadata.f3080eA = unitConfig.getStaticBooleanValue("graphics", "disableLowHpSmoke", Boolean.valueOf(customUnitMetadata.core_isBio)).booleanValue();
                customUnitMetadata.f2751aB = unitConfig.getStaticBooleanValue("core", "isBuilding", (Boolean) false).booleanValue();
                customUnitMetadata.f2752aC = unitConfig.getStaticBooleanValue("core", "ignoreInUnitCapCalculation", Boolean.valueOf(customUnitMetadata.f2751aB)).booleanValue();
                customUnitMetadata.f2753aD = unitConfig.getStaticBooleanValue("core", "placeOnlyOnResPool", (Boolean) false).booleanValue();
                customUnitMetadata.f2754aE = unitConfig.getStaticBooleanValue("core", "isUnrepairableUnit", (Boolean) false).booleanValue();
                customUnitMetadata.f2755aF = unitConfig.getStaticFloatValue("core", "extraBuildRangeWhenBuildingThis", Float.valueOf(0.0f)).floatValue();
                customUnitMetadata.f2756aG = unitConfig.getStaticBooleanValue("core", "isUnselectable", (Boolean) false).booleanValue();
                customUnitMetadata.f2757aH = unitConfig.getStaticBooleanValue("core", "isUnselectableAsTarget", Boolean.valueOf(customUnitMetadata.f2756aG)).booleanValue();
                customUnitMetadata.f2960fD = unitConfig.m666a(customUnitMetadata, "core", "showActionsWithMixedSelectionIfOtherUnitsHaveTag", (ValueList) null);
                customUnitMetadata.f2758aI = unitConfig.getStaticBooleanValue("core", "canNotBeDirectlyAttacked", (Boolean) false).booleanValue();
                customUnitMetadata.f2759aJ = unitConfig.getStaticBooleanValue("core", "canNotBeDamaged", Boolean.valueOf(customUnitMetadata.f2758aI)).booleanValue();
                customUnitMetadata.f2760aK = unitConfig.getStaticBooleanValue("core", "showOnMinimap", (Boolean) true).booleanValue();
                customUnitMetadata.f2761aL = unitConfig.getStaticBooleanValue("core", "showOnMinimapToEnemies", Boolean.valueOf(customUnitMetadata.f3064cA.graphics_isVisibleToEnemies)).booleanValue();
                customUnitMetadata.f2762aM = unitConfig.m666a(customUnitMetadata, "core", "canOnlyBeAttackedByUnitsWithTags", (ValueList) null);
                if (customUnitMetadata.f2758aI && customUnitMetadata.f2762aM != null) {
                    throw new RuntimeException("canNotBeDirectlyAttacked and canOnlyBeAttackedByUnitsWithTags cannot be used at the same time");
                }
                customUnitMetadata.f2763aN = unitConfig.getStaticBooleanValue("core", "canNotBeGivenOrdersByPlayer", (Boolean) false).booleanValue();
                customUnitMetadata.f2764aO = unitConfig.getStaticBooleanValue("core", "canRepairBuildings", (Boolean) false).booleanValue();
                customUnitMetadata.f2765aP = unitConfig.getStaticBooleanValue("core", "canRepairUnits", (Boolean) false).booleanValue();
                customUnitMetadata.f2766aQ = unitConfig.getStaticBooleanValue("core", "autoRepair", (Boolean) false).booleanValue();
                if (customUnitMetadata.f2766aQ) {
                    customUnitMetadata.m3128a(C0376b.f2253a);
                }
                customUnitMetadata.f3064cA.f2182o = unitConfig.getStaticIntegerValue("core", "nanoRange", (Integer) (-1)).intValue();
                if (customUnitMetadata.f3064cA.f2182o != -1) {
                    customUnitMetadata.f3064cA.f2182o = (int) (c0346ap.f2182o * customUnitMetadata.core_globalScale);
                }
                customUnitMetadata.f2767aS = unitConfig.getStaticBooleanValue("core", "nanoRangeForRepairIsMelee", (Boolean) false).booleanValue();
                if (customUnitMetadata.f2767aS) {
                    customUnitMetadata.f3048aR = 5;
                }
                int intValue2 = unitConfig.getStaticIntegerValue("core", "nanoRangeForRepair", (Integer) (-1)).intValue();
                if (intValue2 != -1) {
                    customUnitMetadata.f3048aR = intValue2;
                    customUnitMetadata.f3048aR = (int) (customUnitMetadata.f3048aR * customUnitMetadata.core_globalScale);
                }
                customUnitMetadata.f2768aU = unitConfig.getStaticBooleanValue("core", "nanoRangeForReclaimIsMelee", (Boolean) false).booleanValue();
                if (customUnitMetadata.f2768aU) {
                    customUnitMetadata.f3049aT = 5;
                }
                int intValue3 = unitConfig.getStaticIntegerValue("core", "nanoRangeForReclaim", (Integer) (-1)).intValue();
                if (intValue3 != -1) {
                    customUnitMetadata.f3049aT = intValue3;
                    customUnitMetadata.f3049aT = (int) (customUnitMetadata.f3049aT * customUnitMetadata.core_globalScale);
                }
                customUnitMetadata.f2769aV = unitConfig.getStaticFloatValue("core", "nanoRepairSpeed", Float.valueOf(0.2f)).floatValue();
                customUnitMetadata.f2770aW = unitConfig.getStaticFloatValue("core", "nanoReclaimSpeed", Float.valueOf(customUnitMetadata.f2769aV * 5.1f)).floatValue();
                customUnitMetadata.f3050aX = unitConfig.getStaticFloatValue("core", "resourceReclaimMultiplier", Float.valueOf(1.0f)).floatValue();
                customUnitMetadata.f2771aY = unitConfig.getStaticFloatValue("core", "nanoUnbuildSpeed", Float.valueOf(1.0f)).floatValue() * 0.001f * 5.1f;
                customUnitMetadata.f2772aZ = unitConfig.getStaticFloatValue("core", "nanoBuildSpeed", Float.valueOf(1.0f)).floatValue();
                customUnitMetadata.f2808ba = unitConfig.getStaticFloatValue("core", "nanoFactorySpeed", Float.valueOf(1.0f)).floatValue();
                customUnitMetadata.f3064cA.f2183p = unitConfig.getStaticFloatValue("core", "selfRegenRate", Float.valueOf(0.0f)).floatValue();
                customUnitMetadata.f2810bc = unitConfig.m620d("core", "selfBuildRate", Float.valueOf(0.0f)).floatValue();
                customUnitMetadata.f2811bd = unitConfig.getStaticBooleanValue("core", "dieOnConstruct", (Boolean) false).booleanValue();
                customUnitMetadata.f2813bf = unitConfig.getStaticBooleanValue("core", "dieOnZeroEnergy", (Boolean) false).booleanValue();
                int i = 4;
                if (customUnitMetadata.f3064cA.f2169b > 30000.0f) {
                    i = 8;
                }
                if (customUnitMetadata.f2751aB) {
                    i = 7;
                }
                customUnitMetadata.f2819bl = unitConfig.getStaticIntegerValue("core", "numBitsOnDeath", Integer.valueOf(i)).intValue();
                customUnitMetadata.f2816bi = unitConfig.getStaticBooleanValue("core", "nukeOnDeath", (Boolean) false).booleanValue();
                customUnitMetadata.f2817bj = unitConfig.getStaticFloatValue("core", "nukeOnDeathRange", Float.valueOf(250.0f)).floatValue();
                customUnitMetadata.f2818bk = unitConfig.getStaticFloatValue("core", "nukeOnDeathDamage", Float.valueOf(5400.0f)).floatValue();
                customUnitMetadata.f2820bm = unitConfig.getStaticBooleanValue("core", "nukeOnDeathDisableWhenNoNuke", (Boolean) false).booleanValue();
                customUnitMetadata.f2815bh = unitConfig.getStaticIntegerValue("core", "fireOnDeath", (Integer) 0).intValue();
                customUnitMetadata.f2822bo = (EnumC0588v) unitConfig.getEnumValue("core", "explodeTypeOnDeath", (Enum) null, EnumC0588v.class);
                customUnitMetadata.f2823bp = unitConfig.getStaticBooleanValue("core", "explodeOnDeath", (Boolean) true).booleanValue();
                customUnitMetadata.f2821bn = unitConfig.getStaticBooleanValue("core", "disableDeathOnZeroHp", (Boolean) false).booleanValue();
                customUnitMetadata.f2824bq = unitConfig.getStaticBooleanValue("core", "explodeOnDeathGroundCollision", Boolean.valueOf(unitConfig.getStaticBooleanValue("core", "explodeOnDeathGroundCollosion", (Boolean) true).booleanValue())).booleanValue();
                customUnitMetadata.f2827bt = customUnitMetadata.m3114a(unitConfig.getStaticStringValue("core", "effectOnDeath", (String) null), (C0449y) null);
                customUnitMetadata.f2826bs = customUnitMetadata.m3114a(unitConfig.getStaticStringValue("core", "effectOnDeathIfUnbuilt", (String) null), (C0449y) null);
                customUnitMetadata.f2828bu = C0392bi.m3439a(customUnitMetadata, unitConfig.getStaticStringValue("core", "soundOnDeath", (String) null));
                customUnitMetadata.f2825br = customUnitMetadata.m3114a(unitConfig.getStaticStringValue("core", "effectOnDeathGroundCollision", unitConfig.getStaticStringValue("core", "effectOnDeathGroundCollosion", (String) null)), (C0449y) null);
                customUnitMetadata.f2829bx = C0396bm.m3431a(customUnitMetadata, unitConfig, "core", "unitsSpawnedOnDeath");
                customUnitMetadata.f2830by = unitConfig.getStaticBooleanValue("core", "unitsSpawnedOnDeath_setToTeamOfLastAttacker", (Boolean) false).booleanValue();
                customUnitMetadata.f2935eZ = unitConfig.getStaticBooleanValue("core", "canReclaimResources", (Boolean) false).booleanValue();
                customUnitMetadata.f2970fa = unitConfig.m666a(customUnitMetadata, "core", "canReclaimResourcesOnlyWithTags", (ValueList) null);
                customUnitMetadata.f2971fb = unitConfig.getStaticIntegerValue("core", "canReclaimResourcesNextSearchRange", (Integer) 500).intValue();
                customUnitMetadata.f2972fc = unitConfig.m666a(customUnitMetadata, "core", "canReclaimUnitsOnlyWithTags", (ValueList) null);
                customUnitMetadata.f2973fd = unitConfig.m666a(customUnitMetadata, "core", "canRepairUnitsOnlyWithTags", (ValueList) null);
                if (customUnitMetadata.f2972fc != null && !customUnitMetadata.f2765aP && !customUnitMetadata.f2764aO) {
                    throw new RuntimeException("canReclaimUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                }
                if (customUnitMetadata.f2973fd != null && !customUnitMetadata.f2765aP && !customUnitMetadata.f2764aO) {
                    throw new RuntimeException("canRepairUnitsOnlyWithTags requires canRepairUnits:true or canRepairBuildings:true");
                }
                customUnitMetadata.f3081eB = unitConfig.getStaticIntegerValue("core", "maxTransportingUnits", (Integer) 0).intValue();
                if (customUnitMetadata.f3081eB < 0) {
                    throw new RuntimeException("maxTransportingUnits cannot be < 0");
                }
                customUnitMetadata.f2917eC = unitConfig.m631b("core", "transportUnitsUnloadDelayBetweenEachUnit", Float.valueOf(30.0f)).floatValue();
                customUnitMetadata.f2919eE = ValueListSource.splitToValueListDefaultNull(unitConfig.getStaticStringValue("core", "transportUnitsRequireTag", (String) null));
                String staticStringValue13 = unitConfig.getStaticStringValue("core", "transportUnitsRequireMovementType", (String) null);
                if (staticStringValue13 != null) {
                    for (String str11 : staticStringValue13.split(",")) {
                        customUnitMetadata.f3082eF.add(MovementType.m3725a(str11.trim(), "transportUnitsRequireMovementType"));
                    }
                }
                customUnitMetadata.f2918eD = unitConfig.getStaticBooleanValue("core", "transportUnitsEachUnitAlwaysUsesSingleSlot", (Boolean) false).booleanValue();
                customUnitMetadata.f2920eG = unitConfig.getStaticBooleanValue("core", "transportUnitsBlockAirAndWaterUnits", Boolean.valueOf(customUnitMetadata.f3082eF.size() == 0)).booleanValue();
                customUnitMetadata.f2921eH = unitConfig.getStaticBooleanValue("core", "transportUnitsBlockOtherTransports", (Boolean) true).booleanValue();
                customUnitMetadata.f2923eJ = unitConfig.getLogicBooleanValue(customUnitMetadata, "core", "transportUnitsKeepBuiltUnits", LogicBoolean.falseBoolean);
                customUnitMetadata.f2924eK = unitConfig.getLogicBooleanValue(customUnitMetadata, "core", "transportUnitsKillOnDeath", LogicBoolean.trueBoolean);
                customUnitMetadata.f2925eL = unitConfig.getLogicBooleanValue(customUnitMetadata, "core", "transportUnitsKeepWaypoints", LogicBoolean.falseBoolean);
                customUnitMetadata.f2927eN = unitConfig.getStaticFloatValue("core", "transportUnitsHealBy", Float.valueOf(0.0f)).floatValue();
                customUnitMetadata.f2928eR = unitConfig.getLogicBooleanValue(customUnitMetadata, "core", "transportUnitsCanUnloadUnits", (LogicBoolean) null);
                if (customUnitMetadata.f2928eR != null) {
                    customUnitMetadata.f2929eS = customUnitMetadata.f2928eR;
                } else {
                    customUnitMetadata.f2928eR = CustomUnitMetadata.f3014eP;
                    customUnitMetadata.f2929eS = CustomUnitMetadata.f3015eQ;
                }
                customUnitMetadata.f2922eI = unitConfig.getStaticBooleanValue("core", "transportUnitsAddUnloadOption", Boolean.valueOf(customUnitMetadata.f2928eR != LogicBoolean.falseBoolean)).booleanValue();
                customUnitMetadata.f2926eM = unitConfig.getStaticBooleanValue("core", "transportUnitsOnTeamChangeKeepCurrentTeam", Boolean.valueOf(customUnitMetadata.f2926eM)).booleanValue();
                customUnitMetadata.f3083eO = unitConfig.getStaticIntegerValue("core", "transportSlotsNeeded", (Integer) 1).intValue();
                for (int i2 = -1; i2 <= 29; i2++) {
                    String str12 = "builtFrom_" + i2 + "_";
                    if (i2 == -1) {
                        str12 = "builtFrom_";
                    }
                    String str13 = str12 + "name";
                    String staticStringValue14 = unitConfig.getStaticStringValue("core", str13, (String) null);
                    if (staticStringValue14 != null) {
                        for (String str14 : staticStringValue14.split(",")) {
                            String trim3 = str14.trim();
                            if (!trim3.equals(VariableScope.nullOrMissingString)) {
                                C0440p c0440p = new C0440p();
                                c0440p.f3146a = trim3;
                                c0440p.f3147b = unitConfig.getStaticFloatValue("core", str12 + "pos", Float.valueOf(999.0f)).floatValue();
                                c0440p.f3148c = unitConfig.getStaticBooleanValue("core", str12 + "forceNano", (Boolean) false).booleanValue();
                                c0440p.f3149d = "[core]" + str13;
                                c0440p.f3151f = unitConfig.getLogicBooleanValue(customUnitMetadata, "core", str12 + "isLocked", (LogicBoolean) null);
                                c0440p.f3152g = getTextWrapper(unitConfig, "core", str12 + "isLockedMessage", (String) null);
                                if (c0440p.f3151f == LogicBoolean.falseBoolean) {
                                    c0440p.f3151f = null;
                                }
                                if (!"NONE".equalsIgnoreCase(trim3)) {
                                    customUnitMetadata.f3095fU.add(c0440p);
                                }
                            }
                        }
                    }
                }
                for (int i3 = 0; i3 <= 50; i3++) {
                    if (unitConfig.getStaticStringValue("core", "canBuild_" + i3 + "_name", (String) null) != null) {
                        m3548b(customUnitMetadata, unitConfig, "core", "canBuild_" + i3 + "_", false);
                    }
                }
                Iterator it9 = unitConfig.m618e("canBuild_").iterator();
                while (it9.hasNext()) {
                    m3548b(customUnitMetadata, unitConfig, (String) it9.next(), VariableScope.nullOrMissingString, true);
                }
                customUnitMetadata.f2930eU = C0385bb.m3461a(customUnitMetadata, unitConfig);
                customUnitMetadata.f2931eV = MovementType.m3725a(unitConfig.getStaticStringValueNoNull("movement", "movementType"), "movementType");
                if (!customUnitMetadata.f2751aB) {
                    customUnitMetadata.f2932eW = customUnitMetadata.f2931eV;
                } else {
                    customUnitMetadata.f2932eW = MovementType.f1643a;
                }
                Boolean staticBooleanValue = unitConfig.getStaticBooleanValue("ai", "useAsBuilder", (Boolean) null);
                customUnitMetadata.f2977fh = unitConfig.getStaticBooleanValue("ai", "useAsAttacker", (Boolean) true).booleanValue();
                Boolean staticBooleanValue2 = unitConfig.getStaticBooleanValue("core", "isBuilder", (Boolean) null);
                if (staticBooleanValue2 == null) {
                    staticBooleanValue2 = staticBooleanValue == null ? false : staticBooleanValue;
                } else if (staticBooleanValue == null) {
                    staticBooleanValue = staticBooleanValue2;
                }
                if (staticBooleanValue == null) {
                    staticBooleanValue = false;
                }
                customUnitMetadata.f2974fe = staticBooleanValue2.booleanValue();
                customUnitMetadata.f2975ff = staticBooleanValue.booleanValue();
                if (!customUnitMetadata.f2974fe && customUnitMetadata.f2975ff) {
                    throw new RuntimeException("Cannot tell AI to use a non-builder as builder [ai]useAsBuilder:" + customUnitMetadata.f2975ff + " [core]isBuilder:" + customUnitMetadata.f2974fe);
                }
                if (customUnitMetadata.f2935eZ) {
                    customUnitMetadata.f2976fg = true;
                }
                Boolean staticBooleanValue3 = unitConfig.getStaticBooleanValue("ai", "useAsHarvester", (Boolean) null);
                if (staticBooleanValue3 != null) {
                    customUnitMetadata.f2976fg = staticBooleanValue3.booleanValue();
                }
                Boolean staticBooleanValue4 = unitConfig.getStaticBooleanValue("ai", "useAsTransport", (Boolean) null);
                if (staticBooleanValue4 == null) {
                    staticBooleanValue4 = Boolean.valueOf(customUnitMetadata.f3081eB > 0 && !customUnitMetadata.f2975ff && !customUnitMetadata.f2751aB);
                    if (!customUnitMetadata.f2922eI) {
                        staticBooleanValue4 = false;
                    }
                }
                customUnitMetadata.f2978fi = staticBooleanValue4.booleanValue();
                if (customUnitMetadata.f2751aB) {
                    customUnitMetadata.f2779am = Building.IMAGE_ICON_TEAMS;
                } else if (customUnitMetadata.f2931eV == MovementType.f1646d) {
                    customUnitMetadata.f2779am = AbstractC0297b.f1782n;
                } else if (customUnitMetadata.f2931eV == MovementType.f1647e) {
                    customUnitMetadata.f2779am = WaterUnit.IMAGE_TEAMS;
                } else if (customUnitMetadata.f2931eV == MovementType.f1648f) {
                    if (customUnitMetadata.f2858cf) {
                        customUnitMetadata.f2779am = AbstractC0511j.f3466dF;
                    } else if (customUnitMetadata.mo3081l()) {
                        customUnitMetadata.f2779am = Builder.f3409h;
                    } else {
                        customUnitMetadata.f2779am = AbstractC0507h.f3450n;
                    }
                } else if (customUnitMetadata.f2858cf) {
                    customUnitMetadata.f2779am = AbstractC0511j.f3466dF;
                } else if (customUnitMetadata.mo3081l()) {
                    customUnitMetadata.f2779am = Builder.f3409h;
                } else {
                    customUnitMetadata.f2779am = AbstractC0511j.f3465dE;
                }
                BitmapOrTexture m3117a = customUnitMetadata.m3117a(unitConfig, "graphics", "icon_zoomed_out", false);
                if (m3117a != null) {
                    customUnitMetadata.f2779am = customUnitMetadata.m3119a(m3117a, customUnitMetadata.hueColor);
                }
                if (unitConfig.getStaticBooleanValue("graphics", "icon_zoomed_out_neverShow", (Boolean) false).booleanValue()) {
                    customUnitMetadata.f2779am = null;
                }
                customUnitMetadata.f3000s = unitConfig.getStaticBooleanValue("graphics", "showHealthBar", (Boolean) true).booleanValue();
                customUnitMetadata.f3001t = unitConfig.getStaticBooleanValue("graphics", "showHealthBarChanges", (Boolean) true).booleanValue();
                customUnitMetadata.f3002u = unitConfig.getStaticBooleanValue("graphics", "showEnergyBar", (Boolean) true).booleanValue();
                customUnitMetadata.f3003v = unitConfig.getStaticBooleanValue("graphics", "showShotDelayBar", (Boolean) true).booleanValue();
                customUnitMetadata.f3004w = unitConfig.getStaticBooleanValue("graphics", "showTransportBar", (Boolean) true).booleanValue();
                customUnitMetadata.f3005x = unitConfig.getStaticBooleanValue("graphics", "showShieldBar", (Boolean) true).booleanValue();
                customUnitMetadata.f3006y = unitConfig.getStaticBooleanValue("graphics", "showQueueBar", (Boolean) true).booleanValue();
                customUnitMetadata.f2933eX = unitConfig.getStaticBooleanValue("movement", "slowDeathFall", (Boolean) false).booleanValue();
                customUnitMetadata.f2934eY = unitConfig.getStaticBooleanValue("movement", "slowDeathFallSmoke", (Boolean) true).booleanValue();
                customUnitMetadata.f3064cA.movespeed = unitConfig.getStaticFloatValue("movement", "moveSpeed", Float.valueOf(1.0f)).floatValue() * customUnitMetadata.core_globalScale;
                customUnitMetadata.f2874dB = unitConfig.getStaticFloatValue("movement", "moveAccelerationSpeed", Float.valueOf(1.0f)).floatValue() * customUnitMetadata.core_globalScale;
                customUnitMetadata.f2875dC = unitConfig.getStaticFloatValue("movement", "moveDecelerationSpeed", Float.valueOf(1.0f)).floatValue() * customUnitMetadata.core_globalScale;
                Boolean staticBooleanValue5 = unitConfig.getStaticBooleanValue("movement", "ignoreMoveOrders", (Boolean) null);
                if (customUnitMetadata.f2751aB) {
                    customUnitMetadata.f2876dD = true;
                }
                if (staticBooleanValue5 != null) {
                    if (staticBooleanValue5.booleanValue()) {
                        customUnitMetadata.f2876dD = true;
                        if (customUnitMetadata.f3064cA.movespeed > 0.0f) {
                            throw new RuntimeException("[movement]ignoreMoveOrders expects moveSpeed=0");
                        }
                    } else if (customUnitMetadata.f2751aB) {
                        throw new RuntimeException("[movement]ignoreMoveOrders=false not yet supported on buildings");
                    }
                }
                customUnitMetadata.f2893dY = unitConfig.getStaticFloatValue("movement", "moveYAxisScaling", Float.valueOf(1.0f)).floatValue();
                if (customUnitMetadata.f2893dY <= 0.0f) {
                    throw new RuntimeException("[movement]moveYAxisScaling must be > 0");
                }
                customUnitMetadata.f2894dZ = 1.0f / customUnitMetadata.f2893dY;
                customUnitMetadata.f2936ea = unitConfig.getStaticFloatValue("movement", "reverseSpeedPercentage", Float.valueOf(0.6f)).floatValue();
                String staticStringValue15 = unitConfig.getStaticStringValue("movement", "landOnGround", "false");
                if (staticStringValue15.equalsIgnoreCase("false")) {
                    customUnitMetadata.f2877dE = false;
                } else if (staticStringValue15.equalsIgnoreCase("onlyIdle")) {
                    customUnitMetadata.f2877dE = true;
                    customUnitMetadata.f2878dF = true;
                } else if (staticStringValue15.equalsIgnoreCase("true")) {
                    customUnitMetadata.f2877dE = true;
                } else {
                    throw new RuntimeException("landOnGround expected:true, false, onlyIdle, not:" + staticStringValue15);
                }
                float f3 = 0.0f;
                float f4 = 0.0f;
                if (customUnitMetadata.f2931eV == MovementType.f1646d) {
                    f3 = 35.0f;
                    f4 = 1.5f;
                }
                customUnitMetadata.f3072dG = unitConfig.getStaticFloatValue("movement", "startingHeightOffset", Float.valueOf(0.0f)).floatValue();
                customUnitMetadata.f2879dH = unitConfig.getStaticFloatValue("movement", "targetHeight", Float.valueOf(f3)).floatValue();
                customUnitMetadata.f2880dI = unitConfig.getStaticFloatValue("movement", "targetHeightDrift", Float.valueOf(f4)).floatValue();
                if (customUnitMetadata.f2879dH > 80.0f) {
                    customUnitMetadata.f3007z = true;
                }
                customUnitMetadata.f3073dJ = unitConfig.getStaticFloatValue("movement", "heightChangeRate", Float.valueOf(customUnitMetadata.f3073dJ)).floatValue();
                customUnitMetadata.f3074dK = unitConfig.getStaticFloatValue("movement", "fallingAcceleration", Float.valueOf(customUnitMetadata.f3074dK)).floatValue();
                customUnitMetadata.f3075dL = unitConfig.getStaticFloatValue("movement", "fallingAccelerationDead", Float.valueOf(customUnitMetadata.f3075dL)).floatValue();
                customUnitMetadata.f3064cA.maxturnspeed = unitConfig.getStaticFloatValue("movement", "maxTurnSpeed", Float.valueOf(1.0f)).floatValue();
                customUnitMetadata.f2937ed = unitConfig.getStaticFloatValue("movement", "turnAcceleration", Float.valueOf(1.0f)).floatValue();
                customUnitMetadata.f2881dM = unitConfig.getStaticBooleanValue("movement", "moveSlidingMode", (Boolean) false).booleanValue();
                customUnitMetadata.f2882dN = unitConfig.getStaticBooleanValue("movement", "moveIgnoringBody", (Boolean) false).booleanValue();
                customUnitMetadata.f2883dO = unitConfig.getStaticIntegerValue("movement", "moveSlidingDir", (Integer) (-1)).intValue();
                customUnitMetadata.f2892dX = unitConfig.getStaticBooleanValue("movement", "joinsGroupFormations", (Boolean) true).booleanValue();
                customUnitMetadata.f2884dP = unitConfig.getStaticFloatValue("attack", "turretSize", Float.valueOf(1.0f)).floatValue() * customUnitMetadata.core_globalScale;
                customUnitMetadata.f2885dQ = unitConfig.getStaticFloatValue("attack", "turretTurnSpeed", Float.valueOf(8.0f)).floatValue();
                customUnitMetadata.f2916dz = unitConfig.getStaticBooleanValue("attack", "turretRotateWithBody", (Boolean) true).booleanValue();
                String staticStringValue16 = unitConfig.getStaticStringValue("attack", "attackMovement", "normal");
                customUnitMetadata.f2886dR = EnumC0295b.f1769a;
                if (staticStringValue16.equalsIgnoreCase("normal")) {
                    customUnitMetadata.f2886dR = EnumC0295b.f1769a;
                }
                if (staticStringValue16.equalsIgnoreCase("strafing")) {
                    customUnitMetadata.f2886dR = EnumC0295b.f1770b;
                }
                if (staticStringValue16.equalsIgnoreCase("bomber")) {
                    customUnitMetadata.f2886dR = EnumC0295b.f1772d;
                }
                customUnitMetadata.f2889dU = unitConfig.getStaticBooleanValue("attack", "disablePassiveTargeting", (Boolean) false).booleanValue();
                customUnitMetadata.f2890dV = unitConfig.getStaticBooleanValue("attack", "stopTargetingAfterFiring", (Boolean) false).booleanValue();
                customUnitMetadata.f2891dW = unitConfig.getStaticBooleanValue("attack", "turretMultiTargeting", (Boolean) false).booleanValue();
                customUnitMetadata.f2887dS = unitConfig.getStaticFloatValue("attack", "attackMovementSpeed", Float.valueOf(1.0f)).floatValue();
                customUnitMetadata.f2888dT = unitConfig.getStaticFloatValue("attack", "attackMovementSpread", Float.valueOf(1.0f)).floatValue();
                Float staticFloatValue = unitConfig.getStaticFloatValue("attack", "maxAttackRange", (Float) null);
                if (staticFloatValue != null) {
                    z = true;
                    customUnitMetadata.f3064cA.maxattackrange = staticFloatValue.floatValue() * customUnitMetadata.core_globalScale;
                } else {
                    z = false;
                    customUnitMetadata.f3064cA.maxattackrange = 100.0f * customUnitMetadata.core_globalScale;
                }
                customUnitMetadata.f2948eo = unitConfig.getStaticFloatValue("attack", "aimOffsetSpread", Float.valueOf(0.6f)).floatValue();
                customUnitMetadata.f2873dA = unitConfig.m631b("attack", "shootDelay", Float.valueOf(50.0f)).floatValue();
                customUnitMetadata.f3064cA.shootdelaymultiplier = unitConfig.getStaticFloatValue("attack", "shootDelayMultiplier", Float.valueOf(1.0f)).floatValue();
                customUnitMetadata.f3064cA.shootdamagemultiplier = unitConfig.getStaticFloatValue("attack", "shootDamageMultiplier", Float.valueOf(1.0f)).floatValue();
                customUnitMetadata.f2915dy = unitConfig.getStaticBooleanValue("attack", "showRangeUIGuide", (Boolean) null);
                customUnitMetadata.f2954eu = unitConfig.getStaticBooleanValue("attack", "isMelee", (Boolean) false).booleanValue();
                customUnitMetadata.f2955ev = 0.0f;
                Float staticFloatValue2 = unitConfig.getStaticFloatValue("attack", "meleeEngangementDistance", (Float) null);
                if (customUnitMetadata.f2954eu) {
                    customUnitMetadata.f2955ev = 250.0f;
                    if (staticFloatValue2 != null) {
                        customUnitMetadata.f2955ev = staticFloatValue2.floatValue();
                    }
                } else if (staticFloatValue2 != null) {
                    throw new RuntimeException("[attack]meleeEngangementDistance can only be used with isMelee:true");
                }
                m3581a(tookTime, EnumC0336af.f2148k);
                Iterator it10 = unitConfig.m618e("projectile_").iterator();
                while (it10.hasNext()) {
                    String str15 = (String) it10.next();
                    String substring = str15.substring("projectile_".length());
                    if (customUnitMetadata.m3096d(substring) != null) {
                        throw new RuntimeException("Two projectiles found with the same name:" + substring);
                    }
                    C0388be c0388be = new C0388be();
                    c0388be.f2355bh = substring;
                    c0388be.f2357bj = customUnitMetadata;
                    C0388be.m3452a(c0388be, customUnitMetadata, unitConfig, str15);
                }
                int size = customUnitMetadata.f3089fI.size();
                if (size < 1) {
                    size = 1;
                }
                customUnitMetadata.f2962fG = new C0388be[size];
                for (int i4 = 0; i4 < customUnitMetadata.f3089fI.size(); i4++) {
                    C0388be c0388be2 = (C0388be) customUnitMetadata.f3089fI.get(i4);
                    c0388be2.f2356bi = i4;
                    customUnitMetadata.f2962fG[i4] = c0388be2;
                }
                for (int i5 = 0; i5 < customUnitMetadata.f2962fG.length; i5++) {
                    C0388be c0388be3 = customUnitMetadata.f2962fG[i5];
                    if (c0388be3 != null) {
                        c0388be3.f1141w *= customUnitMetadata.core_globalScale;
                        c0388be3.f1165au *= customUnitMetadata.core_globalScale;
                        c0388be3.f1174aF *= customUnitMetadata.core_globalScale;
                    }
                }
                if (customUnitMetadata.f2962fG[0] == null) {
                    C0388be c0388be4 = new C0388be();
                    c0388be4.f2356bi = 0;
                    c0388be4.f2355bh = "1";
                    c0388be4.f1115b = 10;
                    customUnitMetadata.f3089fI.add(c0388be4);
                    customUnitMetadata.f2962fG[0] = c0388be4;
                }
                ArrayList arrayList = customUnitMetadata.f3088fH;
                Iterator it11 = unitConfig.m618e("turret_").iterator();
                while (it11.hasNext()) {
                    String str16 = (String) it11.next();
                    String substring2 = str16.substring("turret_".length());
                    if (customUnitMetadata.m3100c(substring2) != null) {
                        throw new RuntimeException("Two turrets found with the same name:" + substring2);
                    }
                    C0394bk c0394bk = new C0394bk();
                    c0394bk.f2403a = substring2;
                    c0394bk.f2426b = str16;
                    arrayList.add(c0394bk);
                }
                Iterator it12 = arrayList.iterator();
                while (it12.hasNext()) {
                    C0394bk c0394bk2 = (C0394bk) it12.next();
                    C0394bk.m3436a(c0394bk2, customUnitMetadata, unitConfig, c0394bk2.f2426b);
                }
                if (arrayList.size() == 0) {
                    C0394bk c0394bk3 = new C0394bk();
                    c0394bk3.f2430f = 0.0f;
                    c0394bk3.f2431g = 0.0f;
                    c0394bk3.f2403a = "1";
                    c0394bk3.f2441l = customUnitMetadata.f2873dA;
                    arrayList.add(c0394bk3);
                }
                for (int size2 = arrayList.size() - 1; size2 >= 0; size2--) {
                    if (arrayList.get(size2) != null) {
                        ((C0394bk) arrayList.get(size2)).f2429e = size2;
                    }
                }
                for (int size3 = arrayList.size() - 1; size3 >= 0; size3--) {
                    if (arrayList.get(size3) != null) {
                        C0394bk c0394bk4 = (C0394bk) arrayList.get(size3);
                        if (c0394bk4.f2437x != null) {
                            c0394bk4.f2449v = c0394bk4.f2437x.f2429e;
                            if (c0394bk4.f2437x.f2437x != null) {
                                throw new RuntimeException(c0394bk4.f2403a + ": Turret can not be attached to turret that is also attached to a turret");
                            }
                        }
                        if (c0394bk4.f2438y != null) {
                            c0394bk4.f2450w = c0394bk4.f2438y.f2429e;
                        }
                        if (c0394bk4.f2456V < 0.0f) {
                            c0394bk4.f2456V = c0394bk4.f2455U;
                        }
                    }
                }
                if (arrayList.size() > 31) {
                    throw new RuntimeException("Turret max count per unit is: 31");
                }
                customUnitMetadata.f3087fF = (C0394bk[]) arrayList.toArray(new C0394bk[0]);
                customUnitMetadata.f2914dx = customUnitMetadata.f3064cA.maxattackrange;
                float f5 = -1.0f;
                boolean z3 = true;
                boolean z4 = false;
                Iterator it13 = arrayList.iterator();
                while (it13.hasNext()) {
                    C0394bk c0394bk5 = (C0394bk) it13.next();
                    c0394bk5.f2400W *= customUnitMetadata.core_globalScale;
                    c0394bk5.f2430f *= customUnitMetadata.core_globalScale;
                    c0394bk5.f2431g *= customUnitMetadata.core_globalScale;
                    c0394bk5.f2401X *= customUnitMetadata.core_globalScale;
                    c0394bk5.f2457Y *= customUnitMetadata.core_globalScale;
                    boolean z5 = false;
                    if (c0394bk5.f2451A) {
                        if (c0394bk5.f2458aa >= 99999.0f) {
                            z3 = false;
                        } else {
                            z4 = true;
                            if (customUnitMetadata.f2914dx > c0394bk5.f2458aa) {
                                customUnitMetadata.f2914dx = c0394bk5.f2458aa;
                            }
                            if (f5 < c0394bk5.f2458aa) {
                                f5 = c0394bk5.f2458aa;
                            }
                            if (CommonUtils.absf(c0394bk5.f2458aa - customUnitMetadata.f3064cA.maxattackrange) > 5.0f) {
                                boolean z6 = false;
                                Iterator it14 = customUnitMetadata.f3025o.iterator();
                                while (it14.hasNext()) {
                                    if (CommonUtils.absf(c0394bk5.f2458aa - ((C0448x) it14.next()).f3173a) < 5.0f) {
                                        z6 = true;
                                    }
                                }
                                if (!z6) {
                                    z5 = true;
                                }
                            }
                        }
                    }
                    if (c0394bk5.f2413ab != null) {
                        z5 = c0394bk5.f2413ab.booleanValue();
                    }
                    if (z5) {
                        C0448x c0448x = new C0448x();
                        c0448x.f3173a = c0394bk5.f2458aa;
                        customUnitMetadata.f3025o.add(c0448x);
                    }
                }
                if (z4 && z3) {
                    if (!z) {
                        customUnitMetadata.f3064cA.maxattackrange = f5;
                    } else if (f5 < customUnitMetadata.f3064cA.maxattackrange) {
                        throw new RuntimeException("limitingRange as been applied to all turrets but is less than maxAttackRange (hint: unset maxAttackRange or a limitingRange, or make values match)");
                    }
                }
                String staticStringValue17 = unitConfig.getStaticStringValue("attack", "setMainTurretAs", (String) null);
                if (staticStringValue17 != null) {
                    customUnitMetadata.f2911du = customUnitMetadata.m3100c(staticStringValue17);
                    if (customUnitMetadata.f2911du == null) {
                        throw new RuntimeException("[attack] Could not find setMainTurretAs with name: " + staticStringValue17);
                    }
                } else {
                    customUnitMetadata.f2911du = customUnitMetadata.m3100c("1");
                    if (customUnitMetadata.f2911du == null) {
                        customUnitMetadata.f2911du = customUnitMetadata.f3087fF[0];
                    }
                }
                m3581a(tookTime, EnumC0336af.f2149l);
                long tookTime3 = C0651bl.getTookTime();
                if (unitConfig.m602l("core", "action_")) {
                    for (int i6 = 0; i6 <= 50; i6++) {
                        m3574a(customUnitMetadata, unitConfig, "core", "action_" + i6 + "_", VariableScope.nullOrMissingString + i6, false, false);
                    }
                }
                Iterator it15 = unitConfig.m618e("action_").iterator();
                while (it15.hasNext()) {
                    String str17 = (String) it15.next();
                    String substring3 = str17.substring("action_".length());
                    if (customUnitMetadata.m3094e(substring3) != null) {
                        throw new RuntimeException("Two actions found with the same name:" + substring3);
                    }
                    m3574a(customUnitMetadata, unitConfig, str17, VariableScope.nullOrMissingString, substring3, true, false);
                }
                Iterator it16 = unitConfig.m618e("hiddenAction_").iterator();
                while (it16.hasNext()) {
                    String str18 = (String) it16.next();
                    String substring4 = str18.substring("hiddenAction_".length());
                    if (customUnitMetadata.m3094e(substring4) != null) {
                        throw new RuntimeException("Two actions found with the same name:" + substring4);
                    }
                    m3574a(customUnitMetadata, unitConfig, str18, VariableScope.nullOrMissingString, substring4, true, true);
                }
                m3581a(tookTime3, EnumC0336af.f2147j);
                ArrayList arrayList2 = new ArrayList();
                ArrayList arrayList3 = new ArrayList();
                int i7 = 0;
                while (i7 <= 1) {
                    boolean z7 = i7 == 0;
                    ArrayList arrayList4 = z7 ? arrayList2 : arrayList3;
                    for (int i8 = 1; i8 < 21; i8++) {
                        String str19 = z7 ? "leg_" + i8 : "arm_" + i8;
                        if (unitConfig.m612g(str19)) {
                            C0371ax c0371ax = new C0371ax();
                            C0371ax.m3492a(c0371ax, customUnitMetadata, unitConfig, str19, z7, arrayList4);
                            arrayList4.add(c0371ax);
                        } else {
                            arrayList4.add(null);
                        }
                    }
                    i7++;
                }
                ArrayList arrayList5 = new ArrayList();
                Iterator it17 = arrayList2.iterator();
                while (it17.hasNext()) {
                    C0371ax c0371ax2 = (C0371ax) it17.next();
                    if (c0371ax2 != null) {
                        arrayList5.add(c0371ax2);
                    }
                }
                Iterator it18 = arrayList3.iterator();
                while (it18.hasNext()) {
                    C0371ax c0371ax3 = (C0371ax) it18.next();
                    if (c0371ax3 != null) {
                        arrayList5.add(c0371ax3);
                    }
                }
                for (int size4 = arrayList5.size() - 1; size4 >= 0; size4--) {
                    ((C0371ax) arrayList5.get(size4)).f2204a = size4;
                }
                customUnitMetadata.f3043ar = (C0371ax[]) arrayList5.toArray(new C0371ax[0]);
                if (customUnitMetadata.f3043ar.length > 0) {
                    customUnitMetadata.m3128a(C0377c.f2254a);
                }
                Iterator it19 = customUnitMetadata.f3068dg.iterator();
                while (it19.hasNext()) {
                    ((C0423f) it19.next()).m3271a(customUnitMetadata);
                }
                m3549b(customUnitMetadata);
                String staticStringValue18 = unitConfig.getStaticStringValue("core", "fireTurretXAtSelfOnDeath", (String) null);
                if (staticStringValue18 != null && !"NONE".equalsIgnoreCase(staticStringValue18)) {
                    C0394bk m3100c = customUnitMetadata.m3100c(staticStringValue18);
                    if (m3100c == null) {
                        throw new RuntimeException("Cannot find turret:" + staticStringValue18 + " for [core]fireTurretXAtSelfOnDeath");
                    }
                    customUnitMetadata.f3052bw = m3100c.f2429e;
                }
                customUnitMetadata.f2812be = unitConfig.getStaticBooleanValue("attack", "dieOnAttack", (Boolean) false).booleanValue();
                customUnitMetadata.f2814bg = unitConfig.getStaticBooleanValue("attack", "removeOnAttack", (Boolean) false).booleanValue();
                customUnitMetadata.f2938ee = unitConfig.m621d("attack", "canAttack");
                if (customUnitMetadata.f2938ee) {
                    customUnitMetadata.f2939ef = unitConfig.m668a(customUnitMetadata, "attack", "canAttackFlyingUnits");
                    customUnitMetadata.f2940eg = unitConfig.m668a(customUnitMetadata, "attack", "canAttackLandUnits");
                    customUnitMetadata.f2941eh = unitConfig.m668a(customUnitMetadata, "attack", "canAttackUnderwaterUnits");
                } else {
                    customUnitMetadata.f2939ef = unitConfig.getLogicBooleanValue(customUnitMetadata, "attack", "canAttackFlyingUnits", LogicBoolean.falseBoolean);
                    customUnitMetadata.f2940eg = unitConfig.getLogicBooleanValue(customUnitMetadata, "attack", "canAttackLandUnits", LogicBoolean.falseBoolean);
                    customUnitMetadata.f2941eh = unitConfig.getLogicBooleanValue(customUnitMetadata, "attack", "canAttackUnderwaterUnits", LogicBoolean.falseBoolean);
                }
                customUnitMetadata.f2942ei = unitConfig.getLogicBooleanValue(customUnitMetadata, "attack", "canAttackNotTouchingWaterUnits", (LogicBoolean) null);
                if (LogicBoolean.isStaticTrue(customUnitMetadata.f2942ei)) {
                    customUnitMetadata.f2942ei = null;
                }
                customUnitMetadata.f2944ek = unitConfig.m666a(customUnitMetadata, "attack", "canOnlyAttackUnitsWithTags", (ValueList) null);
                customUnitMetadata.f2945el = unitConfig.m666a(customUnitMetadata, "attack", "canOnlyAttackUnitsWithoutTags", (ValueList) null);
                if (customUnitMetadata.f2944ek != null || customUnitMetadata.f2945el != null) {
                    customUnitMetadata.f2943ej = true;
                }
                boolean z8 = false;
                boolean z9 = false;
                Iterator it20 = arrayList.iterator();
                while (it20.hasNext()) {
                    C0394bk c0394bk6 = (C0394bk) it20.next();
                    if (c0394bk6.f2396N != null && c0394bk6.f2396N.m3239a(customUnitMetadata.f2944ek)) {
                        c0394bk6.f2396N = null;
                    }
                    if (c0394bk6.f2397O != null && c0394bk6.f2397O.m3239a(customUnitMetadata.f2945el)) {
                        c0394bk6.f2397O = null;
                    }
                    if (c0394bk6.f2451A) {
                        if (c0394bk6.f2396N != null || c0394bk6.f2397O != null) {
                            z8 = true;
                        } else {
                            z9 = true;
                        }
                    }
                }
                if (z8 && !z9) {
                    customUnitMetadata.f2946em = true;
                    customUnitMetadata.f2943ej = true;
                }
                customUnitMetadata.f2947en = unitConfig.getStaticBooleanValue("attack", "isFixedFiring", (Boolean) false).booleanValue();
                customUnitMetadata.f2958fB = unitConfig.getStaticBooleanValue("ai", "lowPriorityTargetForOtherUnits", (Boolean) false).booleanValue();
                customUnitMetadata.f2959fC = unitConfig.getStaticBooleanValue("ai", "notPassivelyTargetedByOtherUnits", (Boolean) false).booleanValue();
                if (customUnitMetadata.f2938ee && customUnitMetadata.f2959fC) {
                    throw new RuntimeException("[ai]notPassivelyTargetedByOtherUnits is cannot currently supported on units that can attack");
                }
                customUnitMetadata.f2980fk = unitConfig.m666a(customUnitMetadata, "ai", "aiTags", (ValueList) null);
                customUnitMetadata.f2981fl = unitConfig.getStaticBooleanValue("ai", "disableUse", (Boolean) false).booleanValue();
                customUnitMetadata.f2984fo = unitConfig.getStaticFloatValue("ai", "buildPriority", Float.valueOf(0.05f)).floatValue();
                customUnitMetadata.f2985fp = unitConfig.getStaticIntegerValue("ai", "recommendedInEachBaseNum", (Integer) 0).intValue();
                customUnitMetadata.f2986fq = unitConfig.getStaticFloatValue("ai", "recommendedInEachBasePriorityIfUnmet", Float.valueOf(0.5f)).floatValue();
                customUnitMetadata.f2983fn = unitConfig.getStaticIntegerValue("ai", "maxEachBase", Integer.valueOf(CommonUtils.maxi(2, customUnitMetadata.f2985fp))).intValue();
                customUnitMetadata.f2982fm = unitConfig.getStaticIntegerValue("ai", "maxGlobal", (Integer) (-1)).intValue();
                if (customUnitMetadata.f2983fn < customUnitMetadata.f2985fp) {
                    throw new RuntimeException("[ai]recommendedInEachBaseNum is smaller than maxEachBase");
                }
                if (!customUnitMetadata.f2751aB) {
                    if (unitConfig.m600n("ai", "recommendedInEachBaseNum")) {
                        throw new RuntimeException("[ai]recommendedInEachBaseNum currently only applies to buildings");
                    }
                    if (unitConfig.m600n("ai", "recommendedInEachBasePriorityIfUnmet")) {
                        throw new RuntimeException("[ai]recommendedInEachBasePriorityIfUnmet currently only applies to buildings");
                    }
                }
                customUnitMetadata.f2989ft = unitConfig.getStaticIntegerValue("ai", "whenUsingAsHarvester_recommendedInEachBase", (Integer) (-1)).intValue();
                customUnitMetadata.f2990fu = unitConfig.getStaticIntegerValue("ai", "whenUsingAsHarvester_recommendedGlobal", (Integer) (-1)).intValue();
                customUnitMetadata.f2991fv = unitConfig.getStaticBooleanValue("ai", "whenUsingAsHarvester_includeOtherHarvesterCounts", (Boolean) false).booleanValue();
                customUnitMetadata.f2992fw = unitConfig.m666a(customUnitMetadata, "ai", "onlyUseAsHarvester_ifBaseHasUnitTagged", (ValueList) null);
                customUnitMetadata.f2987fr = unitConfig.getStaticFloatValue("ai", "nonInBaseExtraPriority", Float.valueOf(0.04f)).floatValue();
                customUnitMetadata.f2987fr = unitConfig.getStaticFloatValue("ai", "noneInBaseExtraPriority", Float.valueOf(customUnitMetadata.f2987fr)).floatValue();
                customUnitMetadata.f2988fs = unitConfig.getStaticFloatValue("ai", "nonGlobalExtraPriority", Float.valueOf(0.0f)).floatValue();
                customUnitMetadata.f2988fs = unitConfig.getStaticFloatValue("ai", "noneGlobalExtraPriority", Float.valueOf(customUnitMetadata.f2988fs)).floatValue();
                customUnitMetadata.f2993fx = unitConfig.getStaticStringValue("ai", "upgradedFrom", (String) null);
                Float staticFloatValue3 = unitConfig.getStaticFloatValue("ai", "ai_upgradePriority", (Float) null);
                if (staticFloatValue3 != null && staticFloatValue3.floatValue() != -1.0f) {
                    if (staticFloatValue3.floatValue() >= 0.0f && staticFloatValue3.floatValue() <= 1.0f) {
                        customUnitMetadata.f3085fz = staticFloatValue3.floatValue() * 100.0f;
                    } else {
                        throw new RuntimeException("[ai]ai_upgradePriority: " + customUnitMetadata.f3085fz + " must be between 0-1 or -1 for default");
                    }
                }
                if (customUnitMetadata.f2938ee) {
                    for (int i9 = 0; i9 < customUnitMetadata.f3087fF.length; i9++) {
                        C0394bk c0394bk7 = customUnitMetadata.f3087fF[i9];
                        if (c0394bk7.f2451A && c0394bk7.f2419an == null && customUnitMetadata.f3003v) {
                            if (c0394bk7.f2441l > 140.0f && (customUnitMetadata.f3076eb == -1 || customUnitMetadata.f3087fF[customUnitMetadata.f3076eb].f2441l < c0394bk7.f2441l)) {
                                customUnitMetadata.f3076eb = i9;
                            }
                            if (c0394bk7.f2442m > 80.0f) {
                                customUnitMetadata.f3077ec = i9;
                            }
                        }
                    }
                }
                if (customUnitMetadata.f3063cx == -2) {
                    if (customUnitMetadata.f2931eV == MovementType.f1646d) {
                        customUnitMetadata.f3063cx = 5;
                    } else if (customUnitMetadata.mo3085j()) {
                        if (customUnitMetadata.graphics_image_back != null) {
                            customUnitMetadata.f3063cx = 3;
                        } else {
                            customUnitMetadata.f3063cx = 2;
                        }
                    } else if (customUnitMetadata.f2879dH < -2.0f) {
                        customUnitMetadata.f3063cx = 1;
                    } else if (customUnitMetadata.f3081eB > 0) {
                        customUnitMetadata.f3063cx = 3;
                    } else {
                        customUnitMetadata.f3063cx = 2;
                    }
                }
                if (customUnitMetadata.f3092fL.size() > 0) {
                    customUnitMetadata.f2963fM = true;
                    ObjectVector objectVector = new ObjectVector();
                    ObjectVector objectVector2 = new ObjectVector();
                    ObjectVector objectVector3 = new ObjectVector();
                    Iterator it21 = customUnitMetadata.f3092fL.iterator();
                    while (it21.hasNext()) {
                        C0442r c0442r = (C0442r) it21.next();
                        if (c0442r.f3155c == EnumC0443s.f3157a) {
                            objectVector.add(c0442r);
                        } else if (c0442r.f3155c == EnumC0443s.f3158b) {
                            objectVector2.add(c0442r);
                        } else if (c0442r.f3155c == EnumC0443s.f3159c) {
                            objectVector3.add(c0442r);
                        } else {
                            throw new RuntimeException("Unknown check rate:" + c0442r.f3155c);
                        }
                    }
                    customUnitMetadata.f2964fN = (C0442r[]) objectVector.toArray(new C0442r[0]);
                    customUnitMetadata.f2965fO = (C0442r[]) objectVector2.toArray(new C0442r[0]);
                    customUnitMetadata.f2966fP = (C0442r[]) objectVector3.toArray(new C0442r[0]);
                }
                if (customUnitMetadata.f3099gd != null && customUnitMetadata.f3099gd.size() > 0) {
                    Iterator it22 = customUnitMetadata.f3099gd.iterator();
                    while (it22.hasNext()) {
                        ((C0444t) it22.next()).m3052a(customUnitMetadata);
                    }
                }
                m3581a(tookTime, EnumC0336af.f2150m);
                unitConfig.m635b();
                Iterator it23 = unitConfig.f6242d.iterator();
                while (it23.hasNext()) {
                    C0911ac c0911ac = (C0911ac) it23.next();
                    if (c0911ac.m599a() != null && (c0911ac.m599a().startsWith("hiddenAction_") || c0911ac.m599a().startsWith("canBuild_"))) {
                        throw new RuntimeException("Error [" + c0911ac.m599a() + "]" + c0911ac.m598b() + " has been repeated");
                    }
                    String str20 = "Repeated key " + c0911ac;
                    customUnitMetadata.m3072p(str20);
                    if (customUnitMetadata.core_strictLevel >= 1) {
                        GameEngine.PrintLOG("Converting warning to error (meta.strictLevel=" + customUnitMetadata.core_strictLevel + ")");
                        throw new C0395bl(str20);
                    }
                }
                Iterator it24 = unitConfig.f6243e.iterator();
                while (it24.hasNext()) {
                    String str21 = "Skipping line, unexpected format: '" + ((String) it24.next()) + "'";
                    customUnitMetadata.m3072p(str21);
                    if (customUnitMetadata.core_strictLevel >= 1) {
                        GameEngine.PrintLOG("Converting warning to error (meta.strictLevel=" + customUnitMetadata.core_strictLevel + ")");
                        throw new C0395bl(str21);
                    }
                }
                if (mod != null) {
                    mod.f5013x++;
                }
                synchronized (CustomUnitMetadata.f3009c) {
                    CustomUnitMetadata.f3009c.add(customUnitMetadata);
                }
                m3581a(tookTime, EnumC0336af.f2151n);
                return customUnitMetadata;
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } catch (C0395bl e2) {
            m3561a(filename, e2, mod);
            return null;
        } catch (OutOfMemoryError e3) {
            f2130k++;
            m3561a(filename, new RuntimeException(e3), mod);
            return null;
        } catch (RuntimeException e4) {
            m3561a(filename, e4, mod);
            return null;
        }
    }

    /* renamed from: a */
    public static void m3562a(String str, Exception exc, UnitType unitType) {
        Mod mod = null;
        if (unitType instanceof CustomUnitMetadata) {
            mod = ((CustomUnitMetadata) unitType).f2736G;
        }
        m3561a(str, exc, mod);
    }

    /* renamed from: a */
    public static String m3571a(Mod mod, String str, boolean z) {
        if (mod != null) {
            String m2152n = C0670a.m2152n(mod.f5004m);
            str = C0670a.m2152n(str);
            if (str.startsWith(m2152n)) {
                str = str.substring(m2152n.length());
                if (str.startsWith("/")) {
                    str = str.substring(1);
                }
                if (str.startsWith("\\")) {
                    str = str.substring(1);
                }
            }
            if (z) {
                str = str + " (in mod " + mod.getCurMods() + ")";
            }
        }
        return str;
    }

    /* renamed from: a */
    public static void m3561a(String str, Exception exc, Mod mod) {
        String str2;
        String str3;
        GameEngine.log("Error while loading unit:" + str);
        GameEngine.m836c(exc);
        if (str == null) {
            str = "<null>";
        }
        if (exc instanceof C0395bl) {
            str2 = exc.getMessage();
        } else {
            str2 = CommonUtils.m1681b(exc);
        }
        if (str2 == null) {
            str2 = "<No error cause>";
        }
        if (!str2.contains("unit config file")) {
            str2 = str2.replace(str + ": ", VariableScope.nullOrMissingString).replace(str, VariableScope.nullOrMissingString);
        }
        String m3571a = m3571a(mod, str, true);
        if (mod != null) {
            str3 = "Error loading unit: " + m3571a + ": \n" + str2;
        } else if (str2.contains("Error loading core unit")) {
            str3 = str2;
        } else {
            str3 = "Error loading core unit: " + m3571a + ": \n" + str2 + " (This might be from placing a mod in 'assets/', they should go under 'mods/')";
        }
        if (exc instanceof C0395bl) {
            C0395bl c0395bl = (C0395bl) exc;
            if (c0395bl.f2472b != null || c0395bl.f2473c != null) {
                str3 = str3 + " (section:" + c0395bl.f2472b + ", key:" + c0395bl.f2473c + ")";
            }
        }
        boolean z = false;
        if (mod != null) {
            z = mod.f4995d;
        }
        if (!z) {
        }
        if (f2137p != null) {
            f2137p = str3;
        }
        if (mod != null) {
            mod.m1565a(str3);
        } else {
            try {
                Thread.sleep(2L);
            } catch (InterruptedException e) {
            }
            throw new RuntimeException(str3, exc);
        }
    }

    /* renamed from: b */
    public static void m3548b(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2, boolean z) {
        String staticStringValue = unitConfig.getStaticStringValue(str, str2 + "name", (String) null);
        if (staticStringValue == null) {
            return;
        }
        for (String str3 : staticStringValue.split(",")) {
            String trim = str3.trim();
            C0327d c0327d = new C0327d();
            c0327d.f2042j = trim;
            c0327d.f2046n = unitConfig.getStaticBooleanValue(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
            c0327d.f2059o = unitConfig.getStaticFloatValue(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
            c0327d.f2006aD = unitConfig.getStaticIntegerValue(str, str2 + "tech", (Integer) 1).intValue();
            c0327d.f2007aE = unitConfig.getStaticBooleanValue(str, str2 + "forceNano", (Boolean) false).booleanValue();
            c0327d.f2008aF = unitConfig.getStaticStringValue(str, str2 + "type", (String) null);
            c0327d.f2047p = C0407b.m3396a(customUnitMetadata, unitConfig, str, str2 + "price", (C0407b) null);
            c0327d.f2034az = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "isGuiBlinking", (LogicBoolean) null);
            c0327d.f2051t = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "isVisible", (LogicBoolean) null);
            c0327d.f2054w = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "isLocked", (LogicBoolean) null);
            c0327d.f2055x = m3575a(customUnitMetadata, unitConfig, str, str2 + "isLockedMessage", (String) null);
            if (c0327d.f2054w == LogicBoolean.falseBoolean) {
                c0327d.f2054w = null;
            }
            c0327d.f2056y = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "isLockedAlt", (LogicBoolean) null);
            c0327d.f2057z = m3575a(customUnitMetadata, unitConfig, str, str2 + "isLockedAltMessage", (String) null);
            if (c0327d.f2056y == LogicBoolean.falseBoolean) {
                c0327d.f2056y = null;
            }
            c0327d.f1987A = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "isLockedAlt2", (LogicBoolean) null);
            c0327d.f1988B = m3575a(customUnitMetadata, unitConfig, str, str2 + "isLockedAlt2Message", (String) null);
            if (c0327d.f1987A == LogicBoolean.falseBoolean) {
                c0327d.f1987A = null;
            }
            C0407b m3395a = C0407b.m3395a(customUnitMetadata, unitConfig, str, str2 + "addResources", true);
            if (m3395a != null && m3395a.m3379c()) {
                c0327d.f2010ab = m3395a;
            }
            c0327d.f2071aG = EnumC0329f.f2081a;
            if (!"NONE".equalsIgnoreCase(trim)) {
                customUnitMetadata.f3096fV.add(c0327d);
            }
        }
    }

    /* renamed from: a */
    public static void m3574a(CustomUnitMetadata customUnitMetadata, UnitConfig unitConfig, String str, String str2, String str3, boolean z, boolean z2) {
        C0327d c0327d = new C0327d();
        String staticStringValue = unitConfig.getStaticStringValue(str, str2 + "convertTo", (String) null);
        String staticStringValue2 = unitConfig.getStaticStringValue(str, str2 + "whenBuilding_temporarilyConvertTo", (String) null);
        AbstractC0364aq[] m3511a = C0346ap.m3511a(unitConfig, str, str2 + "whenBuilding_temporarilyConvertTo_keepFields", (AbstractC0364aq[]) null);
        Float staticFloatValue = unitConfig.getStaticFloatValue(str, str2 + "addEnergy", (Float) null);
        C0407b m3395a = C0407b.m3395a(customUnitMetadata, unitConfig, str, str2 + "addResources", true);
        customUnitMetadata.m3127a(m3395a);
        C0407b m3395a2 = C0407b.m3395a(customUnitMetadata, unitConfig, str, str2 + "addResourcesScaledByAIHandicaps", true);
        customUnitMetadata.m3127a(m3395a2);
        String staticStringValue3 = unitConfig.getStaticStringValue(str, str2 + "fireTurretXAtGround", (String) null);
        LogicBoolean logicBooleanValue = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "alsoTriggerOrQueueActionConditional", (LogicBoolean) null);
        String staticStringValue4 = unitConfig.getStaticStringValue(str, str2 + "alsoTriggerAction", (String) null);
        String staticStringValue5 = unitConfig.getStaticStringValue(str, str2 + "alsoQueueAction", (String) null);
        String staticStringValue6 = unitConfig.getStaticStringValue(str, str2 + "spawnEffects", (String) null);
        String staticStringValue7 = unitConfig.getStaticStringValue(str, str2 + "spawnEffectsOnQueue", (String) null);
        String staticStringValue8 = unitConfig.getStaticStringValue(str, str2 + "playSoundAtUnit", (String) null);
        String staticStringValue9 = unitConfig.getStaticStringValue(str, str2 + "playSoundGlobally", (String) null);
        String staticStringValue10 = unitConfig.getStaticStringValue(str, str2 + "playSoundToPlayer", (String) null);
        String staticStringValue11 = unitConfig.getStaticStringValue(str, str2 + "playSoundToPlayerOnQueue", (String) null);
        C0324o.m3628a(customUnitMetadata, unitConfig, str, str2, c0327d, str3, z);
        C0314e.m3639a(customUnitMetadata, unitConfig, str, str2, c0327d, str3, z);
        C0317h.m3635a(customUnitMetadata, unitConfig, str, str2, c0327d, str3, z);
        C0310a.m3643a(customUnitMetadata, unitConfig, str, str2, c0327d, str3, z);
        C0320k.m3632a(customUnitMetadata, unitConfig, str, str2, c0327d, str3, z);
        C0311b.m3641a(customUnitMetadata, unitConfig, str, str2, c0327d, str3, z);
        C0313d.m3640a(customUnitMetadata, unitConfig, str, str2, c0327d, str3, z);
        C0321l.m3631a(customUnitMetadata, unitConfig, str, str2, c0327d, str3, z);
        C0316g.m3636a(customUnitMetadata, unitConfig, str, str2, c0327d, str3, z);
        C0322m.m3630a(customUnitMetadata, unitConfig, str, str2, c0327d, str3, z);
        C0315f.m3637a(customUnitMetadata, unitConfig, str, str2, c0327d, str3, z);
        C0319j.m3633a(customUnitMetadata, unitConfig, str, str2, c0327d, str3, z);
        C0318i.m3634a(customUnitMetadata, unitConfig, str, str2, c0327d, str3, z);
        LogicBoolean logicBooleanValue2 = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "resetCustomTimer", (LogicBoolean) null);
        boolean z3 = false;
        if (z) {
            z3 = true;
        } else {
            if (staticStringValue != null || staticStringValue2 != null || staticFloatValue != null || staticStringValue3 != null) {
                z3 = true;
            }
            if (m3395a.m3379c() || m3395a2.m3379c()) {
                z3 = true;
            }
            if (staticStringValue4 != null || staticStringValue5 != null || staticStringValue6 != null) {
                z3 = true;
            }
            if (staticStringValue8 != null || staticStringValue9 != null || staticStringValue10 != null || staticStringValue11 != null) {
                z3 = true;
            }
            if (c0327d.f2069Z.size() > 0) {
                z3 = true;
            }
        }
        if (z3) {
            if ("NONE".equalsIgnoreCase(staticStringValue)) {
                staticStringValue = null;
            }
            if ("NONE".equalsIgnoreCase(staticStringValue2)) {
                staticStringValue2 = null;
            }
            if (staticStringValue3 != null && staticStringValue3.equalsIgnoreCase("NONE")) {
                staticStringValue3 = null;
            }
            c0327d.f2003a = customUnitMetadata.f3096fV.size();
            c0327d.f2035b = str3;
            c0327d.f2046n = unitConfig.getStaticBooleanValue(str, str2 + "extraLagHidingInUI", (Boolean) false).booleanValue();
            c0327d.f2059o = unitConfig.getStaticFloatValue(str, str2 + "pos", Float.valueOf(999.0f)).floatValue();
            c0327d.f2047p = C0407b.m3395a(customUnitMetadata, unitConfig, str, str2 + "price", true);
            c0327d.f2048q = C0407b.m3383b(customUnitMetadata, unitConfig, str, str2 + "streamingCost", (C0407b) null);
            if (unitConfig.getStaticBooleanValue(str, str2 + "switchPriceWithStreamingCost", (Boolean) false).booleanValue()) {
                if (c0327d.f2048q != null) {
                    throw new RuntimeException("[" + str + "]streamingCost and switchPriceWithStreamingCost=true cannot be used at the same time");
                }
                c0327d.f2048q = C0407b.m3383b(customUnitMetadata, unitConfig, str, str2 + "price", (C0407b) null);
                c0327d.f2047p = C0407b.f2549a;
            }
            customUnitMetadata.m3127a(c0327d.f2047p);
            if (c0327d.f2048q != null) {
                customUnitMetadata.m3127a(c0327d.f2048q);
            }
            c0327d.f2060H = unitConfig.getStaticBooleanValue(str, str2 + "highPriorityQueue", (Boolean) false).booleanValue();
            c0327d.f2061I = unitConfig.getStaticBooleanValue(str, str2 + "onlyOneUnitAtATime", (Boolean) false).booleanValue();
            c0327d.f2062J = unitConfig.getStaticBooleanValue(str, str2 + "canPlayerCancel", (Boolean) true).booleanValue();
            c0327d.f2064L = unitConfig.getStaticBooleanValue(str, str2 + "alwaysSinglePress", (Boolean) false).booleanValue();
            c0327d.f2063K = unitConfig.getStaticBooleanValue(str, str2 + "allowMultipleInQueue", (Boolean) true).booleanValue();
            if (!c0327d.f2062J && !c0327d.f2063K && c0327d.f2064L) {
                c0327d.f2065M = true;
            }
            if (!c0327d.f2062J) {
                c0327d.f2058i = EnumC0220u.f1447a;
            } else {
                c0327d.f2058i = EnumC0220u.f1449c;
            }
            c0327d.f2049r = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "requireConditional", (LogicBoolean) null);
            c0327d.f2050s = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "isActive", (LogicBoolean) null);
            c0327d.f2051t = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "isVisible", (LogicBoolean) null);
            c0327d.f2053v = unitConfig.getStaticBooleanValue(str, str2 + "isAlsoViewableByEnemies", (Boolean) false).booleanValue();
            c0327d.f2052u = unitConfig.getStaticBooleanValue(str, str2 + "isAlsoViewableByAllies", Boolean.valueOf(c0327d.f2053v)).booleanValue();
            if (z2) {
                if (c0327d.f2051t != null && !LogicBoolean.isStaticFalse(c0327d.f2051t)) {
                    throw new RuntimeException("[" + str + "]isVisible doesn't make sense to use in hidden actions");
                }
                c0327d.f2051t = LogicBoolean.falseBoolean;
            }
            c0327d.f2054w = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "isLocked", (LogicBoolean) null);
            c0327d.f2055x = m3575a(customUnitMetadata, unitConfig, str, str2 + "isLockedMessage", (String) null);
            if (c0327d.f2054w == LogicBoolean.falseBoolean) {
                c0327d.f2054w = null;
            }
            c0327d.f2056y = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "isLockedAlt", (LogicBoolean) null);
            c0327d.f2057z = m3575a(customUnitMetadata, unitConfig, str, str2 + "isLockedAltMessage", (String) null);
            if (c0327d.f2056y == LogicBoolean.falseBoolean) {
                c0327d.f2056y = null;
            }
            c0327d.f1987A = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "isLockedAlt2", (LogicBoolean) null);
            c0327d.f1988B = m3575a(customUnitMetadata, unitConfig, str, str2 + "isLockedAlt2Message", (String) null);
            if (c0327d.f1987A == LogicBoolean.falseBoolean) {
                c0327d.f1987A = null;
            }
            c0327d.f1989C = LogicBoolean.create(customUnitMetadata, unitConfig.getStaticStringValue(str, str2 + "ai_isHighPriority", (String) null), null);
            if (c0327d.f1989C == LogicBoolean.falseBoolean) {
                c0327d.f1989C = null;
            }
            if (c0327d.f1989C != null) {
                customUnitMetadata.f2994fy = true;
            }
            c0327d.f1990D = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "ai_isDisabled", LogicBoolean.falseBoolean);
            c0327d.f2072aH = (EnumC0328e) unitConfig.getEnumValue(str, str2 + "aiUse", c0327d.f2072aH, EnumC0328e.class);
            c0327d.f1993G = customUnitMetadata.m3113a(unitConfig.getStaticStringValue(str, str2 + "guiBuildUnit", (String) null), str2 + "guiBuildUnit", str);
            if (c0327d.f1993G != null) {
                c0327d.f2058i = EnumC0220u.f1448b;
                if (staticStringValue != null) {
                    throw new RuntimeException("[" + str + "]guiBuildUnit and convertTo cannot currently be used the same action");
                }
            }
            c0327d.f1992F = customUnitMetadata.m3113a(unitConfig.getStaticStringValue(str, str2 + "ai_considerSameAsBuilding", (String) null), str2 + "ai_considerSameAsBuilding", str);
            c0327d.f2034az = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "isGuiBlinking", (LogicBoolean) null);
            c0327d.f2027as = m3555a(customUnitMetadata.f2732B, unitConfig.getStaticStringValue(str, str2 + "iconImage", "NONE"), customUnitMetadata.graphics_imageSmoothing, customUnitMetadata, str, str2 + "iconImage");
            c0327d.f2030av = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "iconExtraIsVisible", (LogicBoolean) null);
            if (c0327d.f2030av == LogicBoolean.trueBoolean) {
                c0327d.f2030av = null;
            }
            c0327d.f2028at = customUnitMetadata.getImage(unitConfig, str, str2 + "iconExtraImage");
            c0327d.f2029au = unitConfig.m642a(str, str2 + "iconExtraColor", Integer.valueOf(Color.argb(100, 255, 255, 255))).intValue();
            c0327d.f2031aw = UnitReference.parseUnitTypeOrReferenceFromConf(customUnitMetadata, unitConfig, str, str2 + "unitShownInUI", null);
            if (c0327d.f2031aw != null && c0327d.f2027as != null) {
                throw new RuntimeException("[" + str + "]unitShownInUI and iconImage: doesn't make sense to use both at the same time");
            }
            c0327d.f2032ax = unitConfig.getStaticBooleanValue(str, str2 + "unitShownInUIWithHpBar", (Boolean) true).booleanValue();
            c0327d.f2033ay = unitConfig.getStaticBooleanValue(str, str2 + "unitShownInUIWithProgressBar", (Boolean) true).booleanValue();
            c0327d.f2070aA = (EnumC0219t) unitConfig.getEnumValue(str, str2 + "displayType", c0327d.f2070aA, EnumC0219t.class);
            c0327d.f2005aC = unitConfig.getStaticBooleanValue(str, str2 + "displayRemainingStockpile", (Boolean) false).booleanValue();
            c0327d.f2036c = m3575a(customUnitMetadata, unitConfig, str, str2 + "text", VariableScope.nullOrMissingString);
            c0327d.f2037d = UnitReference.parseUnitTypeOrReferenceFromConf(customUnitMetadata, unitConfig, str, str2 + "textAddUnitName", null);
            c0327d.f2040g = getTextWrapper(unitConfig, str, str2 + "textPostFix", (String) null);
            c0327d.f2038e = UnitReference.parseUnitTypeOrReferenceFromConf(customUnitMetadata, unitConfig, str, str2 + "descriptionAddFromUnit", null);
            c0327d.f2039f = UnitReference.parseUnitTypeOrReferenceFromConf(customUnitMetadata, unitConfig, str, str2 + "descriptionAddUnitStats", null);
            c0327d.f2041h = m3575a(customUnitMetadata, unitConfig, str, str2 + "description", VariableScope.nullOrMissingString);
            c0327d.f2066P = unitConfig.m620d(str, str2 + "buildSpeed", Float.valueOf(c0327d.f2066P)).floatValue();
            if (c0327d.f2066P == 0.0f) {
                c0327d.f2066P = 50.0f;
            }
            c0327d.f2067Q = unitConfig.getStaticBooleanValue(str, str2 + "buildSpeed_ignoreFactorySpeedModifiers", Boolean.valueOf(c0327d.f2067Q)).booleanValue();
            boolean z4 = false;
            c0327d.f2068R = unitConfig.getStaticBooleanValue(str, str2 + "whenBuilding_cannotMove", Boolean.valueOf(c0327d.f2068R)).booleanValue();
            c0327d.f1996S = customUnitMetadata.m3115a(unitConfig.getStaticStringValue(str, str2 + "whenBuilding_playAnimation", (String) null), c0327d.f1996S);
            c0327d.f1997T = unitConfig.getStaticFloatValue(str, str2 + "whenBuilding_rotateTo", c0327d.f1997T);
            c0327d.f1998U = unitConfig.getStaticBooleanValue(str, str2 + "whenBuilding_rotateTo_orBackwards", Boolean.valueOf(c0327d.f1998U)).booleanValue();
            c0327d.f1999V = unitConfig.getStaticBooleanValue(str, str2 + "whenBuilding_rotateTo_waitTillRotated", Boolean.valueOf(c0327d.f1999V)).booleanValue();
            c0327d.f2000W = unitConfig.getStaticBooleanValue(str, str2 + "whenBuilding_rotateTo_aimAtActionTarget", Boolean.valueOf(c0327d.f2000W)).booleanValue();
            String staticStringValue12 = unitConfig.getStaticStringValue(str, str2 + "whenBuilding_rotateTo_rotateTurretX", (String) null);
            if (staticStringValue12 != null) {
                c0327d.f2001X = customUnitMetadata.m3100c(staticStringValue12);
                if (c0327d.f2001X == null) {
                    throw new RuntimeException("Cannot find turret:" + staticStringValue12 + " for [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                }
                if (c0327d.f1998U) {
                    throw new RuntimeException("whenBuilding_rotateTo_orBackwards:true not supported with [" + str + "]" + str2 + "whenBuilding_rotateTo_rotateTurretX");
                }
            }
            if (c0327d.f2000W && c0327d.f1997T == null) {
                c0327d.f1997T = Float.valueOf(0.0f);
            }
            c0327d.f2002Y = unitConfig.m663a(customUnitMetadata, str, str2 + "whenBuilding_triggerAction", (C0444t) null);
            c0327d.f1994N = unitConfig.getStaticBooleanValue(str, str2 + "convertTo_keepCurrentTags", Boolean.valueOf(c0327d.f1994N)).booleanValue();
            c0327d.f1995O = C0346ap.m3511a(unitConfig, str, str2 + "convertTo_keepCurrentFields", (AbstractC0364aq[]) null);
            if (staticStringValue2 != null && !"NONE".equalsIgnoreCase(staticStringValue2)) {
                c0327d.f2043k = customUnitMetadata.m3113a(staticStringValue2, str2 + "whenBuilding_temporarilyConvertTo", str);
                c0327d.f2044l = m3511a;
                z4 = true;
            }
            if (c0327d.f2068R || c0327d.f1996S != null || c0327d.f1997T != null || c0327d.f2043k != null || c0327d.f2002Y != null) {
                customUnitMetadata.f2809bb = true;
            }
            c0327d.f2071aG = EnumC0329f.f2082b;
            if (staticStringValue != null && !"NONE".equalsIgnoreCase(staticStringValue)) {
                c0327d.f1991E = customUnitMetadata.m3113a(staticStringValue, str2 + "convertTo", str);
                c0327d.f2042j = staticStringValue;
                c0327d.f2063K = false;
                z4 = true;
            }
            if (staticFloatValue != null) {
                c0327d.f2009aa = staticFloatValue;
                z4 = true;
            }
            if (m3395a != null && m3395a.m3379c()) {
                c0327d.f2010ab = m3395a;
                z4 = true;
            }
            if (m3395a2 != null && m3395a2.m3379c()) {
                c0327d.f2011ac = m3395a2;
                z4 = true;
            }
            c0327d.f2013ae = unitConfig.m650a(str, str2 + "fireTurretXAtGround_withOffset", (PointF) null);
            c0327d.f2014af = unitConfig.m634b(customUnitMetadata, str, str2 + "fireTurretXAtGround_withTarget", null);
            c0327d.f2016ah = unitConfig.getStaticIntegerValue(str, str2 + "fireTurretXAtGround_count", (Integer) 1).intValue();
            if (c0327d.f2014af != null && c0327d.f2013ae == null) {
                c0327d.f2013ae = new PointF(0.0f, 0.0f);
            }
            String staticStringValue13 = unitConfig.getStaticStringValue(str, str2 + "fireTurretXAtGround_withProjectile", (String) null);
            if (staticStringValue13 != null) {
                c0327d.f2015ag = customUnitMetadata.m3096d(staticStringValue13);
                if (c0327d.f2015ag == null) {
                    throw new RuntimeException("Cannot find projectile:" + staticStringValue13 + " for [" + str + "]" + str2 + "fireTurretXAtGround_withProjectile");
                }
            }
            String staticStringValue14 = unitConfig.getStaticStringValue(str, str2 + "fireTurretXAtGround_onlyOverPassableTileOf", (String) null);
            if (staticStringValue14 != null) {
                c0327d.f2017ai = MovementType.m3725a(staticStringValue14, str2 + "fireTurretXAtGround_overPassableTileOf");
            }
            if (staticStringValue3 != null) {
                C0394bk m3100c = customUnitMetadata.m3100c(staticStringValue3);
                if (m3100c == null) {
                    throw new RuntimeException("Cannot find turret:" + staticStringValue3 + " for [" + str + "]" + str2 + "fireTurretXAtGround");
                }
                c0327d.f2012ad = Integer.valueOf(m3100c.f2429e);
                if (c0327d.f2013ae == null) {
                    c0327d.f2058i = EnumC0220u.f1453g;
                    if (c0327d.f1993G != null) {
                        throw new RuntimeException("[" + str + "]guiBuildUnit and fireTurretXAtGround (without withOffset) cannot be used in the same action");
                    }
                }
                z4 = true;
            }
            c0327d.f2018aj = logicBooleanValue;
            if (staticStringValue4 != null && !"NONE".equalsIgnoreCase(staticStringValue4)) {
                c0327d.f2019ak = customUnitMetadata.m3099c(staticStringValue4, "alsoTriggerAction", str);
                z4 = true;
            }
            if (staticStringValue5 != null && !"NONE".equalsIgnoreCase(staticStringValue5)) {
                c0327d.f2020al = customUnitMetadata.m3099c(staticStringValue5, "alsoQueueAction", str);
                z4 = true;
            }
            if (staticStringValue6 != null) {
                c0327d.f2021am = customUnitMetadata.m3114a(staticStringValue6, (C0449y) null);
                z4 = true;
            }
            if (staticStringValue7 != null) {
                c0327d.f2022an = customUnitMetadata.m3114a(staticStringValue7, (C0449y) null);
                z4 = true;
            }
            if (staticStringValue8 != null) {
                c0327d.f2023ao = C0392bi.m3439a(customUnitMetadata, staticStringValue8);
                z4 = true;
            }
            if (staticStringValue9 != null) {
                c0327d.f2024ap = C0392bi.m3439a(customUnitMetadata, staticStringValue9);
                z4 = true;
            }
            if (staticStringValue10 != null) {
                c0327d.f2025aq = C0392bi.m3439a(customUnitMetadata, staticStringValue10);
                z4 = true;
            }
            if (staticStringValue11 != null) {
                c0327d.f2026ar = C0392bi.m3439a(customUnitMetadata, staticStringValue11);
                z4 = true;
            }
            if (logicBooleanValue2 != null) {
                c0327d.f2004aB = logicBooleanValue2;
                z4 = true;
            }
            if (c0327d.f2069Z.size() > 0) {
                z4 = true;
            }
            C0333ac c0333ac = null;
            String staticStringValue15 = unitConfig.getStaticStringValue(str, str2 + "autoTriggerOnEvent", (String) null);
            if (staticStringValue15 != null) {
                ArrayList m3558a = m3558a(str, str2 + "autoTriggerOnEvent", staticStringValue15);
                if (m3558a.size() != 1) {
                    throw new C0395bl("[" + str + "]" + str2 + "autoTriggerOnEvent: Expected 1 option, got:" + m3558a.size());
                }
                C0337ag c0337ag = (C0337ag) m3558a.get(0);
                try {
                    EnumC0334ad enumC0334ad = (EnumC0334ad) UnitConfig.m654a(c0337ag.f2154a, (Enum) null, EnumC0334ad.class);
                    c0333ac = new C0333ac();
                    c0333ac.f2100a = enumC0334ad;
                    if (c0337ag.f2155b != null) {
                        for (String str4 : c0337ag.f2155b.keySet()) {
                            String str5 = (String) c0337ag.f2155b.get(str4);
                            if (str4.equalsIgnoreCase("withtag")) {
                                if (c0333ac.f2100a != EnumC0334ad.f2117n && c0333ac.f2100a != EnumC0334ad.f2120q) {
                                    throw new C0395bl("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0333ac.f2100a.name() + " doesn't support parameter: " + str4);
                                }
                                String m1619p = CommonUtils.m1619p(str5);
                                if (m1619p == null) {
                                    throw new C0395bl("[" + str + "]" + str2 + "autoTriggerOnEvent: " + c0333ac.f2100a.name() + " expected quoted string, got: " + str5);
                                }
                                c0333ac.f2103d = UnitConfig.m604j(str, str2 + "autoTriggerOnEvent", m1619p);
                            } else {
                                throw new C0395bl("[" + str + "]" + str2 + "autoTriggerOnEvent: Unknown parameter: " + str4);
                            }
                        }
                    }
                } catch (C0395bl e) {
                    throw new C0395bl("[" + str + "]" + str2 + "autoTriggerOnEvent: " + e.getMessage(), e);
                }
            }
            LogicBoolean logicBooleanValue3 = unitConfig.getLogicBooleanValue(customUnitMetadata, str, str2 + "autoTrigger", (LogicBoolean) null);
            String staticStringValue16 = unitConfig.getStaticStringValue(str, str2 + "autoTrigger", (String) null);
            EnumC0443s enumC0443s = (EnumC0443s) unitConfig.getEnumValue(str, str2 + "autoTriggerCheckRate", customUnitMetadata.f3056bW, EnumC0443s.class);
            c0327d.f2045m = z4;
            if (z4 || c0327d.f2051t != null) {
                if (logicBooleanValue3 != null && z4) {
                    C0442r c0442r = new C0442r();
                    c0442r.f3153a = logicBooleanValue3;
                    c0442r.f3154b = staticStringValue16;
                    c0442r.f3155c = enumC0443s;
                    c0442r.f3156d = new C0330g(c0327d, customUnitMetadata.m3113a(c0327d.f2042j, "[" + str + "]" + str2, str));
                    customUnitMetadata.f3092fL.add(c0442r);
                }
                if (c0333ac != null && z4) {
                    c0333ac.f2101b = new C0330g(c0327d, customUnitMetadata.m3113a(c0327d.f2042j, "[" + str + "]" + str2, str));
                    c0333ac.f2102c = customUnitMetadata;
                    customUnitMetadata.f3100ge.add(c0333ac);
                }
                if (c0327d.f2042j != null && c0327d.f2047p != null && c0327d.f2047p.f2538b > 0) {
                    customUnitMetadata.f2967fW = true;
                }
                customUnitMetadata.f3096fV.add(c0327d);
            }
        }
    }

    /* renamed from: a */
    public static void m3581a(long j, EnumC0336af enumC0336af) {
        enumC0336af.f2153o += C0651bl.m2277a(j);
    }

    /* renamed from: h */
    public static void m3535h() {
        EnumC0336af[] values;
        GameEngine.PrintLOG("==Timing==");
        for (EnumC0336af enumC0336af : EnumC0336af.values()) {
            GameEngine.PrintLOG(enumC0336af.name() + ": " + C0651bl.m2278a(enumC0336af.f2153o));
        }
    }

    /* renamed from: i */
    public static void m3534i() {
        for (EnumC0336af enumC0336af : EnumC0336af.values()) {
            enumC0336af.f2153o = 0.0d;
        }
    }

    /* renamed from: a */
    public static BitmapOrTexture m3555a(String str, String str2, boolean z, CustomUnitMetadata customUnitMetadata, String str3, String str4) {
        try {
            return m3556a(str, str2, z, customUnitMetadata);
        } catch (RuntimeException e) {
            e.printStackTrace();
            throw new RuntimeException("[" + str3 + "]" + str4 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static BitmapOrTexture m3556a(String str, String str2, boolean z, CustomUnitMetadata customUnitMetadata) {
        long tookTime = C0651bl.getTookTime();
        BitmapOrTexture m3545b = m3545b(str, str2, z, customUnitMetadata);
        m3581a(tookTime, EnumC0336af.f2139b);
        return m3545b;
    }

    /* renamed from: b */
    public static BitmapOrTexture m3545b(String str, String str2, boolean z, CustomUnitMetadata customUnitMetadata) {
        BitmapOrTexture bitmapOrTexture;
        if (str2 == null || str2.equalsIgnoreCase("NONE") || str2.equals(VariableScope.nullOrMissingString)) {
            return null;
        }
        boolean z2 = false;
        if (str2.startsWith("SHADOW:")) {
            str2 = str2.substring("SHADOW:".length());
            z2 = true;
        }
        if (str2.startsWith("SHARED:")) {
            str2 = str2.substring("SHARED:".length());
            str = "units/shared/common.ini";
        }
        if (str2.startsWith("CORE:")) {
            str2 = str2.substring("CORE:".length());
            str = "units/common.ini";
        }
        if (str2.startsWith("ROOT:")) {
            str2 = str2.substring("ROOT:".length());
            if (customUnitMetadata.f2736G == null) {
                str = "units/common.ini";
            } else {
                str = customUnitMetadata.f2736G.f5004m + "/common.ini";
            }
        }
        if (str2.startsWith("SHADOW:")) {
            str2 = str2.substring("SHADOW:".length());
            z2 = true;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        String str3 = CommonUtils.m1631h(str) + "/";
        String str4 = "[" + z + "," + z2 + "]" + str3 + str2;
        BitmapOrTexture m3542c = m3542c(str4);
        if (m3542c != null) {
            return m3542c;
        }
        C0936j m3541c = m3541c(str3, str2, customUnitMetadata);
        int i = 0;
        if (f2125d != null) {
            i = f2125d.f4983B;
        }
        if (i > 5) {
            GameEngine.PrintLOG("Fast failing to oom image for this mod");
            bitmapOrTexture = gameEngine.graphics.mo128q();
        } else {
            long tookTime = C0651bl.getTookTime();
            try {
                bitmapOrTexture = gameEngine.graphics.mo179a((InputStream) m3541c, true);
                m3581a(tookTime, EnumC0336af.f2138a);
                if (bitmapOrTexture.mo370z()) {
                    GameEngine.PrintLOG("oomErrors:" + f2130k);
                    f2130k++;
                    if (f2125d != null) {
                        f2125d.f4983B++;
                        f2125d.f4984C++;
                    }
                } else if (f2125d != null && !f2125d.f5010s && GameEngine.isIOS_Device) {
                    bitmapOrTexture.m1014y();
                }
            } catch (RuntimeException e) {
                GameEngine.PrintLOG("imageStream:" + m3541c);
                throw new RuntimeException("Error decode image from: " + C0670a.m2164d(str3 + str2), e);
            }
        }
        try {
            m3541c.close();
        } catch (Exception e2) {
            e2.printStackTrace();
        }
        if (bitmapOrTexture == null) {
            throw new RuntimeException("Failed to decode image: " + C0670a.m2162e(str3 + str2));
        }
        bitmapOrTexture.mo379a(z);
        if (z2) {
            bitmapOrTexture = Unit.m3772a(bitmapOrTexture, bitmapOrTexture.width, bitmapOrTexture.height);
        }
        m3570a(bitmapOrTexture);
        m3564a(str4, bitmapOrTexture);
        return bitmapOrTexture;
    }

    /* renamed from: a */
    public static void m3564a(String str, BitmapOrTexture bitmapOrTexture) {
        f2131f.put(str, bitmapOrTexture);
    }

    /* renamed from: c */
    public static BitmapOrTexture m3542c(String str) {
        BitmapOrTexture bitmapOrTexture = (BitmapOrTexture) f2131f.get(str);
        if (bitmapOrTexture != null) {
            f2128i++;
            m3570a(bitmapOrTexture);
            bitmapOrTexture.mo44s();
            return bitmapOrTexture;
        }
        if (f2129j) {
            GameEngine.PrintLOG("loadImageInConf: cache miss: " + str);
        }
        f2127h++;
        return null;
    }

    /* renamed from: a */
    public static AbstractC0602i m3559a(String str, String str2, CustomUnitMetadata customUnitMetadata) {
        long tookTime = C0651bl.getTookTime();
        AbstractC0602i m3546b = m3546b(str, str2, customUnitMetadata);
        m3581a(tookTime, EnumC0336af.f2141d);
        return m3546b;
    }

    /* renamed from: b */
    public static AbstractC0602i m3546b(String str, String str2, CustomUnitMetadata customUnitMetadata) {
        if (str2 == null || str2.equalsIgnoreCase("NONE")) {
            return null;
        }
        GameEngine gameEngine = GameEngine.getInstance();
        if (!str2.contains(".")) {
            return gameEngine.audio.m2415a(str2);
        }
        if (str2.startsWith("ROOT:")) {
            str2 = str2.substring("ROOT:".length());
            if (customUnitMetadata.f2736G == null) {
                str = "units/common.ini";
            } else {
                str = customUnitMetadata.f2736G.f5004m + "/common.ini";
            }
        }
        if (str2.startsWith("CORE:")) {
            str2 = str2.substring("CORE:".length());
            str = "units/common.ini";
        }
        if (str2.startsWith("SHARED:")) {
            str2 = str2.substring("SHARED:".length());
            str = "units/shared/common.ini";
        }
        String str3 = CommonUtils.m1631h(str) + "/";
        String str4 = str3 + str2;
        AbstractC0602i abstractC0602i = (AbstractC0602i) f2132g.get(str4);
        if (abstractC0602i != null) {
            m3572a(abstractC0602i);
            return abstractC0602i;
        } else if (!str2.toLowerCase(Locale.ROOT).endsWith(".ogg") && !str2.toLowerCase(Locale.ROOT).endsWith(".wav")) {
            throw new RuntimeException("Failed to open sound: " + str3 + VariableScope.nullOrMissingString + str2 + " only the ogg & wav sound formats are supported.");
        } else {
            C0936j m3541c = m3541c(str3, str2, customUnitMetadata);
            long tookTime = C0651bl.getTookTime();
            AbstractC0602i m2414a = gameEngine.audio.m2414a(str2, m3541c, false);
            try {
                m3541c.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
            m3581a(tookTime, EnumC0336af.f2140c);
            if (m2414a == null) {
                String str5 = "Sound file found but failed to load: " + str4;
                if (str2.toLowerCase(Locale.ROOT).endsWith(".ogg")) {
                    str5 = str5 + " - Check if this file is truly a ogg";
                }
                customUnitMetadata.m3072p(str5);
                return gameEngine.audio.m2410b("Failed to load");
            }
            m3572a(m2414a);
            f2132g.put(str4, m2414a);
            return m2414a;
        }
    }

    /* renamed from: a */
    public static boolean m3557a(String str, String str2, String str3, Mod mod) {
        if (str2 == null || !str2.contains("..") || GameEngine.isNonDedicatedServer()) {
            return true;
        }
        String canonicalPath = new File(C0670a.m2162e(str3)).getCanonicalPath();
        if (canonicalPath.startsWith(new File(C0670a.m2162e("units")).getCanonicalPath())) {
            return true;
        }
        String m1553j = mod.m1553j();
        boolean startsWith = canonicalPath.startsWith(m1553j);
        if (!startsWith) {
            GameEngine.log("File: '" + canonicalPath + "' is not within mod: '" + m1553j + "'");
        }
        return startsWith;
    }

    /* renamed from: a */
    public static String m3560a(String str, String str2) {
        if (!str.endsWith("/")) {
            str = str + "/";
        }
        while (true) {
            if (str2.startsWith("/") || str2.startsWith("\\")) {
                str2 = str2.substring(1);
            } else {
                return str + str2;
            }
        }
    }

    /* renamed from: c */
    public static C0936j m3541c(String str, String str2, CustomUnitMetadata customUnitMetadata) {
        String m3560a = m3560a(str, str2);
        Mod mod = null;
        if (customUnitMetadata != null) {
            mod = customUnitMetadata.f2736G;
        } else {
            GameEngine.LogTrace("findAssetSteam meta==null");
        }
        if (mod != null) {
            try {
                if (!m3557a(str, str2, m3560a, mod)) {
                    throw new RuntimeException("File is outside mod: " + m3560a);
                }
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        C0936j m2156j = C0670a.m2156j(m3560a);
        if (m2156j == null) {
            GameEngine.PrintLOG("Orginal path: " + m3560a);
            throw new RuntimeException("IO Error: Failed to open: " + m3571a(mod, m3560a, true));
        }
        return m2156j;
    }

    /* renamed from: b */
    public static void m3549b(CustomUnitMetadata customUnitMetadata) {
        C0371ax[] c0371axArr = customUnitMetadata.f3043ar;
        for (C0371ax c0371ax : c0371axArr) {
            float f = -1.0f;
            C0371ax c0371ax2 = null;
            float f2 = 1.0f;
            if (c0371ax.f2224l) {
                f2 = 0.1f;
            }
            for (C0371ax c0371ax3 : c0371axArr) {
                if (c0371ax != c0371ax3 && !c0371ax3.f2212i) {
                    float distanceSq = CommonUtils.distanceSq(c0371ax.f2207d * f2, c0371ax.f2208e, c0371ax3.f2207d * f2, c0371ax3.f2208e);
                    if (c0371ax2 == null || distanceSq < f) {
                        f = distanceSq;
                        c0371ax2 = c0371ax3;
                    }
                }
            }
            float m1746a = CommonUtils.m1746a(f) + 2.0f;
            float f3 = m1746a * m1746a;
            ArrayList arrayList = new ArrayList();
            for (C0371ax c0371ax4 : c0371axArr) {
                if (c0371ax != c0371ax4 && !c0371ax4.f2212i && CommonUtils.distanceSq(c0371ax.f2207d * f2, c0371ax.f2208e, c0371ax4.f2207d * f2, c0371ax4.f2208e) <= f3) {
                    arrayList.add(Integer.valueOf(c0371ax4.f2204a));
                }
            }
            c0371ax.f2202O = new int[arrayList.size()];
            for (int i = 0; i < arrayList.size(); i++) {
                c0371ax.f2202O[i] = ((Integer) arrayList.get(i)).intValue();
            }
        }
    }

    /* renamed from: j */
    public static String m3533j() {
        return "builtin_mods";
    }

    /* renamed from: k */
    public static String m3532k() {
        return "builtin_mods_enabled";
    }

    /* renamed from: l */
    public static String m3531l() {
        String str;
        if (GameEngine.isDedicatedServer) {
            str = "/SD/mods/units";
        } else {
            str = "/SD/rustedWarfare/units";
        }
        return str;
    }

    /* renamed from: a */
    public static ArrayList m3558a(String str, String str2, String str3) {
        if (str3 == null || VariableScope.nullOrMissingString.equals(str3) || "NONE".equalsIgnoreCase(str3)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator it = CommonUtils.m1675b(str3, ",", false).iterator();
        while (it.hasNext()) {
            String trim = ((String) it.next()).trim();
            if (!VariableScope.nullOrMissingString.equals(trim)) {
                String str4 = null;
                if (trim.contains("(") && trim.contains(")")) {
                    String[] m1639f = CommonUtils.m1639f(trim, "(");
                    if (m1639f == null) {
                        throw new C0395bl("[" + str + "]" + str2 + ": Unexpected format for '" + trim + "' of " + str3);
                    }
                    trim = m1639f[0];
                    str4 = m1639f[1].trim();
                }
                C0337ag c0337ag = new C0337ag();
                c0337ag.f2154a = trim;
                if (str4 != null) {
                    if (!str4.endsWith(")")) {
                        throw new C0395bl("[" + str + "]" + str2 + ": Expected ')' in '" + trim + "' of " + str3);
                    }
                    Iterator it2 = CommonUtils.m1703a(str4.substring(0, str4.length() - 1), ",", false, false).iterator();
                    while (it2.hasNext()) {
                        String str5 = (String) it2.next();
                        if (!str5.trim().equals(VariableScope.nullOrMissingString)) {
                            String[] m1639f2 = CommonUtils.m1639f(str5, "=");
                            if (m1639f2 == null) {
                                throw new RuntimeException("[" + str + "]" + str2 + ": Unexpected key format for '" + trim + "' of " + str3);
                            }
                            String trim2 = m1639f2[0].trim();
                            String trim3 = m1639f2[1].trim();
                            if (c0337ag.f2155b == null) {
                                c0337ag.f2155b = new HashMap();
                            }
                            c0337ag.f2155b.put(trim2, trim3);
                        }
                    }
                }
                arrayList.add(c0337ag);
            }
        }
        return arrayList;
    }
}