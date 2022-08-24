package com.corrodinggames.rts.gameFramework.p045m;

import android.graphics.PointF;
import com.corrodinggames.rts.game.p012b.C0179f;
import com.corrodinggames.rts.game.units.InterfaceC0303as;
import com.corrodinggames.rts.game.units.UnitType;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.m.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/m/g.class */
public class C1050g {

    /* renamed from: a */
    public ArrayList f6698a = new ArrayList();

    /* renamed from: b */
    public boolean f6699b;

    /* renamed from: c */
    public boolean f6700c;

    /* renamed from: d */
    public float f6701d;

    /* renamed from: e */
    public int f6702e;

    /* renamed from: f */
    public String f6703f;

    /* renamed from: g */
    public boolean f6704g;

    /* renamed from: h */
    public boolean f6705h;

    /* renamed from: i */
    final /* synthetic */ C1049f f6706i;

    public C1050g(C1049f c1049f) {
        this.f6706i = c1049f;
    }

    /* renamed from: a */
    public boolean m800a(String str) {
        String group;
        String str2;
        String trim = str.trim();
        GameEngine.PrintLog("Got:" + trim);
        if (trim.length() == 0) {
            return false;
        }
        GameEngine.PrintLog("..");
        String str3 = null;
        String str4 = null;
        String str5 = null;
        if (trim.startsWith("+")) {
            Matcher matcher = Pattern.compile("\\+([^ ]*)([^\\[-]*)(\\[(.*?)\\])? *(-.*)?").matcher(trim);
            if (matcher.matches()) {
                str3 = matcher.group(1);
                str4 = matcher.group(2);
                group = matcher.group(4);
                str5 = matcher.group(5);
                GameEngine.PrintLog("Got o:" + group + " d:" + str3 + " dn:" + str4 + " units:" + str5);
            } else {
                throw new C0179f("Unknown wave line in map: " + trim);
            }
        } else if (trim.startsWith("!")) {
            Matcher matcher2 = Pattern.compile("\\!(.*)").matcher(trim);
            if (matcher2.matches()) {
                group = matcher2.group(1);
            } else {
                throw new C0179f("Unknown wave line in map: " + trim);
            }
        } else {
            throw new C0179f("Unknown wave format: " + trim);
        }
        if (str3 != null) {
            String[] split = str3.trim().split(":");
            String str6 = "0";
            if (split.length == 1) {
                str2 = split[0];
            } else if (split.length == 2) {
                str6 = split[0];
                str2 = split[1];
            } else {
                throw new C0179f("Unknown time format in wave: " + trim);
            }
            try {
                this.f6701d = Integer.parseInt(str2) + (Integer.parseInt(str6) * 60);
            } catch (NumberFormatException e) {
                throw new C0179f("Failed to parse time on: " + trim, e);
            }
        }
        if (str4 != null) {
            this.f6703f = str4.trim();
            this.f6705h = true;
        }
        if (group != null) {
            for (String str7 : group.split(",")) {
                String[] split2 = str7.split(":");
                String trim2 = split2[0].trim();
                if (split2.length > 1) {
                    split2[1].trim();
                }
                if ("lockSpawn".equalsIgnoreCase(trim2)) {
                    this.f6699b = true;
                } else if ("unlockSpawn".equalsIgnoreCase(trim2)) {
                    this.f6700c = true;
                } else if ("noTimer".equalsIgnoreCase(trim2)) {
                    this.f6704g = true;
                } else if (!"paused".equalsIgnoreCase(trim2) && !"win".equalsIgnoreCase(trim2) && !VariableScope.nullOrMissingString.equalsIgnoreCase(trim2)) {
                    throw new C0179f("Unknown wave option '" + trim2 + "' in: " + trim);
                }
            }
        }
        if (str5 != null) {
            String trim3 = str5.trim();
            if (trim3.startsWith("-")) {
                trim3 = trim3.substring(1);
            }
            for (String str8 : trim3.split(",")) {
                String trim4 = str8.trim();
                if (!trim4.contains(" ")) {
                    throw new C0179f("Unknown wave format '" + trim4 + "' in: " + trim);
                }
                int indexOf = trim4.indexOf(" ");
                String trim5 = trim4.substring(0, indexOf).trim();
                String trim6 = trim4.substring(indexOf + 1).trim();
                try {
                    int parseInt = Integer.parseInt(trim5);
                    InterfaceC0303as m5734a = UnitType.m5734a(trim6);
                    if (m5734a == null) {
                        throw new C0179f("Could not find unit '" + trim6 + "' in: " + trim);
                    }
                    C1052i c1052i = new C1052i(this.f6706i);
                    c1052i.m797b(m5734a, parseInt);
                    this.f6698a.add(c1052i);
                } catch (NumberFormatException e2) {
                    throw new C0179f("Expected starting number in wave format '" + trim4 + "' in: " + trim);
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m801a() {
        GameEngine.PrintLog("Activating wave");
        if (!this.f6706i.f6695R) {
            this.f6706i.m810e();
        }
        PointF pointF = this.f6706i.f6693P;
        Iterator it = this.f6698a.iterator();
        while (it.hasNext()) {
            ((C1052i) it.next()).m799a(pointF.x, pointF.y);
        }
        if (!this.f6706i.f6694Q) {
            this.f6706i.m810e();
        }
        if (this.f6699b) {
            this.f6706i.f6694Q = true;
        }
        if (this.f6700c) {
            this.f6706i.f6694Q = false;
        }
    }
}
