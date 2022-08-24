package com.corrodinggames.rts.gameFramework;

import com.corrodinggames.rts.gameFramework.C0648am;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import java.util.ArrayList;

/* JADX INFO: Access modifiers changed from: package-private */
/* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
/* renamed from: com.corrodinggames.rts.gameFramework.at */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/at.class */
public abstract class EnumC0659at extends Enum {

    /* renamed from: d */
    String[] f4216d;

    /* renamed from: a */
    public static final EnumC0659at f4213a = new C06601("starting", 0);

    /* renamed from: b */
    public static final EnumC0659at f4214b = new C06612("buildup", 1);

    /* renamed from: c */
    public static final EnumC0659at f4215c = new C06623("attacked", 2);

    /* renamed from: e */
    private static final /* synthetic */ EnumC0659at[] f4217e = {f4213a, f4214b, f4215c};

    /* renamed from: d */
    abstract String m2899d();

    public static EnumC0659at[] values() {
        return (EnumC0659at[]) f4217e.clone();
    }

    public static EnumC0659at valueOf(String str) {
        return (EnumC0659at) Enum.valueOf(EnumC0659at.class, str);
    }

    private EnumC0659at(String str, int i) {
    }

    /* synthetic */ EnumC0659at(String str, int i, C0648am.C06491 c06491) {
        this(str, i);
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.corrodinggames.rts.gameFramework.at$1 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/at$1.class */
    final class C06601 extends EnumC0659at {
        C06601(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: d */
        String m2898d() {
            return "music/starting";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.corrodinggames.rts.gameFramework.at$2 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/at$2.class */
    final class C06612 extends EnumC0659at {
        C06612(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: d */
        String m2897d() {
            return "music/buildup";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: com.corrodinggames.rts.gameFramework.at$3 */
    /* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/at$3.class */
    final class C06623 extends EnumC0659at {
        C06623(String str, int i) {
            super(str, i, null);
        }

        /* renamed from: d */
        String m2896d() {
            return "music/attacked";
        }
    }

    /* renamed from: a */
    void m2903a() {
        this.f4216d = C0750a.m2457a(m2899d(), false);
        if (this.f4216d == null) {
            this.f4216d = new String[0];
            GameEngine.m1100n("Failed to open music folder: " + m2899d());
            return;
        }
        GameEngine m1228A = GameEngine.m1228A();
        ArrayList arrayList = new ArrayList();
        for (String str : this.f4216d) {
            String m2434n = C0750a.m2434n(str);
            if (C0648am.m2926a(m2902a(m2434n), true) != null) {
                GameEngine.PrintLog("Loaded track:" + m2434n);
                arrayList.add(m2434n);
            } else {
                GameEngine.m1139b("Skipping track:" + m2434n);
            }
            m1228A.m1181a("music", false);
        }
        this.f4216d = (String[]) arrayList.toArray(new String[0]);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: b */
    public String[] m2901b() {
        return this.f4216d;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: c */
    public static void m2900c() {
        f4213a.m2903a();
        f4214b.m2903a();
        f4215c.m2903a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: a */
    public String m2902a(String str) {
        return m2899d() + "/" + str;
    }
}
