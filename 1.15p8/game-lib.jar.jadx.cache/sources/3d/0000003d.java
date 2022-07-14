package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.network.InputNetStream;
import com.corrodinggames.rts.gameFramework.network.OutputNetStream;
import com.corrodinggames.rts.gameFramework.utility.UnitConfig;
import java.io.IOException;
import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Locale;

/* renamed from: com.corrodinggames.rts.game.units.custom.ap */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ap.class */
public class C0346ap implements Cloneable {

    /* renamed from: a */
    public boolean f2168a;

    /* renamed from: b */
    public float f2169b;

    /* renamed from: c */
    public int maxhp;

    /* renamed from: d */
    public float f2171d;

    /* renamed from: e */
    public float shootdelaymultiplier = 1.0f;

    /* renamed from: f */
    public float shootdamagemultiplier = 1.0f;

    /* renamed from: g */
    public int maxshield;

    /* renamed from: h */
    public float shieldregen;

    /* renamed from: i */
    public float maxattackrange;

    /* renamed from: j */
    public float movespeed;

    /* renamed from: k */
    public float maxturnspeed;

    /* renamed from: l */
    public float armour;

    /* renamed from: m */
    public boolean graphics_isVisibleToEnemies;

    /* renamed from: n */
    public int f2181n;

    /* renamed from: o */
    public int f2182o;

    /* renamed from: p */
    public float f2183p;

    /* renamed from: q */
    static LinkedHashMap f2166q = new LinkedHashMap();

    /* renamed from: r */
    static LinkedHashMap f2167r = new LinkedHashMap();

    public C0346ap(boolean z) {
        this.f2168a = z;
    }

    /* renamed from: a */
    public static VariableScope.CachedWriter m3510a(String str, CustomUnitMetadata customUnitMetadata, String str2, String str3) {
        try {
            return VariableScope.CachedWriter.create(str, new C0365ar(customUnitMetadata));
        } catch (C0395bl e) {
            throw new RuntimeException("[" + str2 + "]" + str3 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public C0346ap clone() {
        try {
            C0346ap c0346ap = (C0346ap) super.clone();
            c0346ap.f2168a = false;
            return c0346ap;
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    static void m3508a(LinkedHashMap linkedHashMap, AbstractC0364aq abstractC0364aq) {
        linkedHashMap.put(abstractC0364aq.f2185b, abstractC0364aq);
    }

    static {
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "mass") { // from class: com.corrodinggames.rts.game.units.custom.ap.1
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.f2169b;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.f2169b = (float) d;
            }
        });
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "maxenergy") { // from class: com.corrodinggames.rts.game.units.custom.ap.10
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.f2171d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.f2171d = (float) d;
            }
        });
        m3508a(f2166q, new AbstractC0368au(f2166q.size(), "energy") { // from class: com.corrodinggames.rts.game.units.custom.ap.11
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0368au
            /* renamed from: a */
            public double mo3502a(C0433j c0433j) {
                return c0433j.f1549cs;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0368au
            /* renamed from: b */
            public void mo3498b(C0433j c0433j, double d) {
                c0433j.f1549cs = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0368au, com.corrodinggames.rts.game.units.custom.AbstractC0364aq
            /* renamed from: a */
            public void mo3501a(C0433j c0433j, double d) {
                super.mo3501a(c0433j, d);
                c0433j.f1549cs = (float) d;
            }
        });
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "maxhp") { // from class: com.corrodinggames.rts.game.units.custom.ap.12
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.maxhp;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.maxhp = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at, com.corrodinggames.rts.game.units.custom.AbstractC0364aq
            /* renamed from: a */
            public void mo3501a(C0433j c0433j, double d) {
                super.mo3501a(c0433j, d);
                c0433j.maxHp = (float) d;
            }
        });
        m3508a(f2166q, new AbstractC0368au(f2166q.size(), "hp") { // from class: com.corrodinggames.rts.game.units.custom.ap.13
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0368au
            /* renamed from: a */
            public double mo3502a(C0433j c0433j) {
                return c0433j.hp;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0368au
            /* renamed from: b */
            public void mo3498b(C0433j c0433j, double d) {
                c0433j.hp = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0368au, com.corrodinggames.rts.game.units.custom.AbstractC0364aq
            /* renamed from: a */
            public void mo3501a(C0433j c0433j, double d) {
                super.mo3501a(c0433j, d);
                c0433j.m3730o((float) d);
            }
        });
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "maxshield") { // from class: com.corrodinggames.rts.game.units.custom.ap.14
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.maxshield;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.maxshield = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at, com.corrodinggames.rts.game.units.custom.AbstractC0364aq
            /* renamed from: a */
            public void mo3501a(C0433j c0433j, double d) {
                super.mo3501a(c0433j, d);
                c0433j.maxShield = (float) d;
            }
        });
        m3508a(f2166q, new AbstractC0368au(f2166q.size(), "shield") { // from class: com.corrodinggames.rts.game.units.custom.ap.15
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0368au
            /* renamed from: a */
            public double mo3502a(C0433j c0433j) {
                return c0433j.shield;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0368au
            /* renamed from: b */
            public void mo3498b(C0433j c0433j, double d) {
                c0433j.shield = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0368au, com.corrodinggames.rts.game.units.custom.AbstractC0364aq
            /* renamed from: a */
            public void mo3501a(C0433j c0433j, double d) {
                super.mo3501a(c0433j, d);
                c0433j.shield = (float) d;
            }
        });
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "shieldregen") { // from class: com.corrodinggames.rts.game.units.custom.ap.16
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.shieldregen;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.shieldregen = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at, com.corrodinggames.rts.game.units.custom.AbstractC0364aq
            /* renamed from: a */
            public void mo3501a(C0433j c0433j, double d) {
                super.mo3501a(c0433j, d);
            }
        });
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "armour") { // from class: com.corrodinggames.rts.game.units.custom.ap.17
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.armour;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.armour = (float) d;
            }
        });
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "maxattackrange") { // from class: com.corrodinggames.rts.game.units.custom.ap.2
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.maxattackrange;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.maxattackrange = (float) d;
            }
        });
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "shootdelaymultiplier") { // from class: com.corrodinggames.rts.game.units.custom.ap.3
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.shootdelaymultiplier;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.shootdelaymultiplier = (float) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at, com.corrodinggames.rts.game.units.custom.AbstractC0364aq
            /* renamed from: a */
            public void mo3501a(C0433j c0433j, double d) {
                super.mo3501a(c0433j, d);
                c0433j.m2575aV();
            }
        });
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "shootdamagemultiplier") { // from class: com.corrodinggames.rts.game.units.custom.ap.4
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.shootdamagemultiplier;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.shootdamagemultiplier = (float) d;
            }
        });
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "movespeed") { // from class: com.corrodinggames.rts.game.units.custom.ap.5
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.movespeed;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.movespeed = (float) d;
            }
        });
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "maxturnspeed") { // from class: com.corrodinggames.rts.game.units.custom.ap.6
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.maxturnspeed;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.maxturnspeed = (float) d;
            }
        });
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "fogofwarsightrange") { // from class: com.corrodinggames.rts.game.units.custom.ap.7
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.f2181n;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.f2181n = (int) d;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at, com.corrodinggames.rts.game.units.custom.AbstractC0364aq
            /* renamed from: a */
            public void mo3501a(C0433j c0433j, double d) {
                int mo2441s = c0433j.mo2441s();
                super.mo3501a(c0433j, d);
                if (c0433j.mo2441s() > mo2441s && !c0433j.f3778aq) {
                    c0433j.mo2491c(false);
                }
            }
        });
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "nanorange") { // from class: com.corrodinggames.rts.game.units.custom.ap.8
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.f2182o;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.f2182o = (int) d;
            }
        });
        m3508a(f2166q, new AbstractC0367at(f2166q.size(), "selfregenrate") { // from class: com.corrodinggames.rts.game.units.custom.ap.9
            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public double mo3504a(C0346ap c0346ap) {
                return c0346ap.f2183p;
            }

            @Override // com.corrodinggames.rts.game.units.custom.AbstractC0367at
            /* renamed from: a */
            public void mo3503a(C0346ap c0346ap, double d) {
                c0346ap.f2183p = (float) d;
            }
        });
        for (String str : f2166q.keySet()) {
            if (!str.equals(str.toLowerCase(Locale.ROOT))) {
                throw new RuntimeException(str);
            }
            AbstractC0364aq abstractC0364aq = (AbstractC0364aq) f2166q.get(str);
            if (!abstractC0364aq.mo3499b()) {
                f2167r.put(str, abstractC0364aq);
            }
        }
    }

    /* renamed from: b */
    public C0346ap m3507b() {
        C0346ap clone = clone();
        clone.f2168a = false;
        return clone;
    }

    /* renamed from: a */
    public static AbstractC0364aq m3516a(int i) {
        for (AbstractC0364aq abstractC0364aq : f2166q.values()) {
            if (i == abstractC0364aq.f2184a) {
                return abstractC0364aq;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static void m3513a(C0433j c0433j, C0346ap c0346ap, AbstractC0364aq[] abstractC0364aqArr) {
        for (AbstractC0364aq abstractC0364aq : abstractC0364aqArr) {
            double mo3500a = abstractC0364aq.mo3500a(c0433j, c0433j.f2703x);
            double mo3500a2 = abstractC0364aq.mo3500a(c0433j, c0346ap);
            if (mo3500a != mo3500a2) {
                c0433j.m3168dE();
                abstractC0364aq.mo3501a(c0433j, mo3500a2);
            }
        }
    }

    /* renamed from: a */
    public static void m3514a(C0433j c0433j, C0346ap c0346ap, CustomUnitMetadata customUnitMetadata) {
        if (!(c0346ap != customUnitMetadata.f3064cA)) {
            return;
        }
        for (String str : f2167r.keySet()) {
            AbstractC0364aq abstractC0364aq = (AbstractC0364aq) f2167r.get(str);
            double mo3500a = abstractC0364aq.mo3500a(c0433j, customUnitMetadata.f3064cA);
            double mo3500a2 = abstractC0364aq.mo3500a(c0433j, c0346ap);
            if (mo3500a != mo3500a2) {
                c0433j.m3168dE();
                abstractC0364aq.mo3501a(c0433j, mo3500a2);
            }
        }
    }

    /* renamed from: a */
    public static void m3515a(C0346ap c0346ap, C0433j c0433j, OutputNetStream outputNetStream) {
        CustomUnitMetadata customUnitMetadata = c0433j.customUnitMetadataA;
        if (!(c0346ap != customUnitMetadata.f3064cA)) {
            outputNetStream.writeBoolean(true);
            return;
        }
        outputNetStream.writeBoolean(false);
        short s = 0;
        for (String str : f2167r.keySet()) {
            AbstractC0364aq abstractC0364aq = (AbstractC0364aq) f2167r.get(str);
            if (abstractC0364aq.mo3500a(c0433j, customUnitMetadata.f3064cA) != abstractC0364aq.mo3500a(c0433j, c0346ap)) {
                s = (short) (s + 1);
            }
        }
        outputNetStream.mo1257a(s);
        int i = 0;
        for (String str2 : f2167r.keySet()) {
            AbstractC0364aq abstractC0364aq2 = (AbstractC0364aq) f2167r.get(str2);
            double mo3500a = abstractC0364aq2.mo3500a(c0433j, customUnitMetadata.f3064cA);
            double mo3500a2 = abstractC0364aq2.mo3500a(c0433j, c0346ap);
            if (mo3500a != mo3500a2) {
                i++;
                if (s < i) {
                    throw new IOException("numberOfChangedFields>fieldsWritten: " + ((int) s) + ">" + i);
                }
                outputNetStream.mo1257a((short) abstractC0364aq2.f2184a);
                outputNetStream.writeDouble(mo3500a2);
                outputNetStream.writeDouble(mo3500a);
            }
        }
    }

    /* renamed from: a */
    public static void m3512a(C0433j c0433j, InputNetStream inputNetStream, int i) {
        CustomUnitMetadata customUnitMetadata = c0433j.customUnitMetadataA;
        if (inputNetStream.readBoolean()) {
            return;
        }
        int m1212v = inputNetStream.m1212v();
        for (int i2 = 0; i2 < m1212v; i2++) {
            short m1212v2 = inputNetStream.m1212v();
            double readDouble = inputNetStream.readDouble();
            inputNetStream.readDouble();
            AbstractC0364aq m3516a = m3516a(m1212v2);
            if (m3516a == null) {
                throw new IOException("Field " + ((int) m1212v2) + " doesn't exist");
            }
            c0433j.m3168dE();
            m3516a.mo3501a(c0433j, readDouble);
        }
    }

    /* renamed from: a */
    public static AbstractC0364aq[] m3511a(UnitConfig unitConfig, String str, String str2, AbstractC0364aq[] abstractC0364aqArr) {
        try {
            return m3509a(unitConfig.getStaticStringValue(str, str2, (String) null), abstractC0364aqArr);
        } catch (RuntimeException e) {
            throw new RuntimeException("[" + str + "]" + str2 + ": " + e.getMessage(), e);
        }
    }

    /* renamed from: a */
    public static AbstractC0364aq[] m3509a(String str, AbstractC0364aq[] abstractC0364aqArr) {
        if (str == null) {
            return abstractC0364aqArr;
        }
        ArrayList arrayList = new ArrayList();
        for (String str2 : CommonUtils.m1665c(str, ',')) {
            String lowerCase = str2.trim().toLowerCase(Locale.ROOT);
            AbstractC0364aq abstractC0364aq = (AbstractC0364aq) f2167r.get(lowerCase);
            if (arrayList.contains(abstractC0364aq)) {
                throw new RuntimeException("Value: " + lowerCase + " is repeated");
            }
            if (abstractC0364aq == null) {
                String str3 = VariableScope.nullOrMissingString;
                for (String str4 : f2167r.keySet()) {
                    if (!str3.equals(VariableScope.nullOrMissingString)) {
                        str3 = str3 + ", ";
                    }
                    str3 = str3 + str4;
                }
                throw new RuntimeException("Unknown value: " + lowerCase + " (Expected: " + CommonUtils.m1678b(str3, 100) + ")");
            }
            arrayList.add(abstractC0364aq);
        }
        return (AbstractC0364aq[]) arrayList.toArray(new AbstractC0364aq[0]);
    }
}