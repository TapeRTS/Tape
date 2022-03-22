package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import java.util.ArrayList;

/* renamed from: com.corrodinggames.rts.gameFramework.at */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/at.class */
enum EnumC0558at {
    starting { // from class: com.corrodinggames.rts.gameFramework.at.1
        @Override // com.corrodinggames.rts.gameFramework.EnumC0558at
        /* renamed from: d */
        String mo2039d() {
            return "music/starting";
        }
    },
    buildup { // from class: com.corrodinggames.rts.gameFramework.at.2
        @Override // com.corrodinggames.rts.gameFramework.EnumC0558at
        /* renamed from: d */
        String mo2039d() {
            return "music/buildup";
        }
    },
    attacked { // from class: com.corrodinggames.rts.gameFramework.at.3
        @Override // com.corrodinggames.rts.gameFramework.EnumC0558at
        /* renamed from: d */
        String mo2039d() {
            return "music/attacked";
        }
    };
    

    /* renamed from: d */
    String[] f3745d;

    /* renamed from: d */
    abstract String mo2039d();

    /* renamed from: a */
    void m2043a() {
        String[] strArr;
        this.f3745d = C0596a.m1892a(mo2039d(), false);
        AbstractC0789l u = AbstractC0789l.m638u();
        ArrayList arrayList = new ArrayList();
        for (String str : this.f3745d) {
            if (C0547am.m2056a(m2042a(str), true) != null) {
                AbstractC0789l.m670d("Loaded track:" + str);
                arrayList.add(str);
            } else {
                AbstractC0789l.m682b("Skipping track:" + str);
            }
            u.m713a("music", false);
        }
        this.f3745d = (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: b */
    String[] m2041b() {
        return this.f3745d;
    }

    /* renamed from: c */
    static void m2040c() {
        starting.m2043a();
        buildup.m2043a();
        attacked.m2043a();
    }

    /* renamed from: a */
    String m2042a(String str) {
        return mo2039d() + "/" + str;
    }
}
