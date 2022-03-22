package com.corrodinggames.rts.gameFramework.p040k;

import android.graphics.PointF;
import com.corrodinggames.rts.game.p012b.C0154f;
import com.corrodinggames.rts.game.units.AbstractC0268al;
import com.corrodinggames.rts.game.units.EnumC0215ak;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.gameFramework.k.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/k/g.class */
public class C0782g {

    /* renamed from: a */
    public ArrayList f5417a = new ArrayList();

    /* renamed from: b */
    public boolean f5418b;

    /* renamed from: c */
    public boolean f5419c;

    /* renamed from: d */
    public float f5420d;

    /* renamed from: e */
    public int f5421e;

    /* renamed from: f */
    public String f5422f;

    /* renamed from: g */
    public boolean f5423g;

    /* renamed from: h */
    public boolean f5424h;

    /* renamed from: i */
    final /* synthetic */ C0781f f5425i;

    public C0782g(C0781f fVar) {
        this.f5425i = fVar;
    }

    /* renamed from: a */
    public boolean m766a(String str) {
        String str2;
        String str3;
        String trim = str.trim();
        AbstractC0789l.m670d("Got:" + trim);
        if (trim.length() == 0) {
            return false;
        }
        AbstractC0789l.m670d("..");
        String str4 = null;
        String str5 = null;
        String str6 = null;
        if (trim.startsWith("+")) {
            Matcher matcher = Pattern.compile("\\+([^ ]*)([^\\[-]*)(\\[(.*?)\\])? *(-.*)?").matcher(trim);
            if (matcher.matches()) {
                str4 = matcher.group(1);
                str5 = matcher.group(2);
                str2 = matcher.group(4);
                str6 = matcher.group(5);
                AbstractC0789l.m670d("Got o:" + str2 + " d:" + str4 + " dn:" + str5 + " units:" + str6);
            } else {
                throw new C0154f("Unknown wave line in map: " + trim);
            }
        } else if (trim.startsWith("!")) {
            Matcher matcher2 = Pattern.compile("\\!(.*)").matcher(trim);
            if (matcher2.matches()) {
                str2 = matcher2.group(1);
            } else {
                throw new C0154f("Unknown wave line in map: " + trim);
            }
        } else {
            throw new C0154f("Unknown wave format: " + trim);
        }
        if (str4 != null) {
            String[] split = str4.trim().split(":");
            String str7 = "0";
            if (split.length == 1) {
                str3 = split[0];
            } else if (split.length == 2) {
                str7 = split[0];
                str3 = split[1];
            } else {
                throw new C0154f("Unknown time format in wave: " + trim);
            }
            try {
                this.f5420d = Integer.parseInt(str3) + (Integer.parseInt(str7) * 60);
            } catch (NumberFormatException e) {
                throw new C0154f("Failed to parse time on: " + trim, e);
            }
        }
        if (str5 != null) {
            this.f5422f = str5.trim();
            this.f5424h = true;
        }
        if (str2 != null) {
            for (String str8 : str2.split(",")) {
                String[] split2 = str8.split(":");
                String trim2 = split2[0].trim();
                if (split2.length > 1) {
                    split2[1].trim();
                }
                if ("lockSpawn".equalsIgnoreCase(trim2)) {
                    this.f5418b = true;
                } else if ("unlockSpawn".equalsIgnoreCase(trim2)) {
                    this.f5419c = true;
                } else if ("noTimer".equalsIgnoreCase(trim2)) {
                    this.f5423g = true;
                } else if (!"paused".equalsIgnoreCase(trim2) && !"win".equalsIgnoreCase(trim2) && !"".equalsIgnoreCase(trim2)) {
                    throw new C0154f("Unknown wave option '" + trim2 + "' in: " + trim);
                }
            }
        }
        if (str6 == null) {
            return true;
        }
        String trim3 = str6.trim();
        if (trim3.startsWith("-")) {
            trim3 = trim3.substring(1);
        }
        for (String str9 : trim3.split(",")) {
            String trim4 = str9.trim();
            if (!trim4.contains(" ")) {
                throw new C0154f("Unknown wave format '" + trim4 + "' in: " + trim);
            }
            int indexOf = trim4.indexOf(" ");
            String trim5 = trim4.substring(0, indexOf).trim();
            String trim6 = trim4.substring(indexOf + 1).trim();
            try {
                int parseInt = Integer.parseInt(trim5);
                AbstractC0268al a = EnumC0215ak.m3273a(trim6);
                if (a == null) {
                    throw new C0154f("Could not find unit '" + trim6 + "' in: " + trim);
                }
                C0784i iVar = new C0784i(this.f5425i);
                iVar.m763b(a, parseInt);
                this.f5417a.add(iVar);
            } catch (NumberFormatException e2) {
                throw new C0154f("Expected starting number in wave format '" + trim4 + "' in: " + trim);
            }
        }
        return true;
    }

    /* renamed from: a */
    public void m767a() {
        AbstractC0789l.m670d("Activating wave");
        if (!this.f5425i.f5414R) {
            this.f5425i.m776e();
        }
        PointF pointF = this.f5425i.f5412P;
        Iterator it = this.f5417a.iterator();
        while (it.hasNext()) {
            ((C0784i) it.next()).m765a(pointF.f224a, pointF.f225b);
        }
        if (!this.f5425i.f5413Q) {
            this.f5425i.m776e();
        }
        if (this.f5418b) {
            this.f5425i.f5413Q = true;
        }
        if (this.f5419c) {
            this.f5425i.f5413Q = false;
        }
    }
}
