package com.corrodinggames.rts.game.units.custom;

import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.lang.LangLocale;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.game.units.custom.ay */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/custom/ay.class */
public class TextWrapper {

    /* renamed from: a */
    public static final TextWrapper f2242a = m3490a(VariableScope.nullOrMissingString);

    /* renamed from: b */
    public C0373az[] f2243b;

    /* renamed from: c */
    public String f2244c;

    /* renamed from: d */
    public int f2245d = -1;

    /* renamed from: e */
    public String f2246e;

    /* renamed from: a */
    public static TextWrapper m3490a(String str) {
        TextWrapper textWrapper = new TextWrapper();
        ArrayList arrayList = new ArrayList();
        C0373az c0373az = new C0373az();
        c0373az.f2247a = null;
        c0373az.f2248b = str;
        arrayList.add(c0373az);
        textWrapper.f2243b = (C0373az[]) arrayList.toArray(new C0373az[0]);
        textWrapper.m3488b();
        return textWrapper;
    }

    public TextWrapper() {
    }

    public TextWrapper(C0373az[] c0373azArr) {
        this.f2243b = c0373azArr;
    }

    /* renamed from: a */
    public boolean m3491a() {
        C0373az[] c0373azArr;
        if (this.f2243b != null) {
            for (C0373az c0373az : this.f2243b) {
                if (c0373az.f2248b != null && !VariableScope.nullOrMissingString.equals(c0373az.f2248b)) {
                    return false;
                }
            }
            return true;
        }
        return true;
    }

    /* renamed from: a */
    public void m3489a(String str, String str2) {
        if (this.f2243b != null) {
            for (C0373az c0373az : this.f2243b) {
                c0373az.m3487a(str, str2);
            }
        } else {
            GameEngine.log("LocaleString: replaceAll with null strings");
        }
        this.f2245d = -1;
    }

    /* renamed from: b */
    public String m3488b() {
        C0373az[] c0373azArr;
        C0373az[] c0373azArr2;
        if (this.f2245d == LangLocale.f4969c) {
            return this.f2244c;
        }
        if (this.f2246e != null) {
            this.f2245d = LangLocale.f4969c;
            this.f2244c = LangLocale.getI18NText(this.f2246e, new Object[0]);
            return this.f2244c;
        }
        String localLanguage = LangLocale.getLocalLanguage();
        for (C0373az c0373az : this.f2243b) {
            if (localLanguage.equals(c0373az.f2247a)) {
                this.f2245d = LangLocale.f4969c;
                this.f2244c = c0373az.f2248b;
                return this.f2244c;
            }
        }
        for (C0373az c0373az2 : this.f2243b) {
            if (c0373az2.f2247a == null) {
                this.f2245d = LangLocale.f4969c;
                this.f2244c = c0373az2.f2248b;
                return this.f2244c;
            }
        }
        this.f2245d = LangLocale.f4969c;
        this.f2244c = "<NO DEFAULT TEXT FOUND>";
        return this.f2244c;
    }
}