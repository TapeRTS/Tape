package com.corrodinggames.rts.gameFramework.p036e;

/* renamed from: com.corrodinggames.rts.gameFramework.e.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/d.class */
public class C0753d extends C0752c {

    /* renamed from: g */
    String f4873g;

    /* renamed from: h */
    String f4874h;

    /* renamed from: i */
    String f4875i;

    public C0753d(String str, String str2) {
        this.f4873g = str;
        this.f4874h = str2;
        if (!this.f4873g.endsWith("/") && !this.f4873g.endsWith("\\")) {
            this.f4873g += "/";
        }
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: b */
    public String mo2387b() {
        return this.f4873g;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: d */
    public String mo2386d() {
        return this.f4874h;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: e */
    public boolean mo2385e() {
        return false;
    }

    @Override // com.corrodinggames.rts.gameFramework.p036e.C0752c
    /* renamed from: e */
    public String mo2407e(String str) {
        String mo2407e = super.mo2407e(str);
        if (this.f4875i != null && mo2407e != null && mo2407e.startsWith(this.f4873g)) {
            String substring = mo2407e.substring(this.f4873g.length());
            if (substring.startsWith("/") || substring.startsWith("\\")) {
                substring = substring.substring(1);
            }
            mo2407e = this.f4875i + substring;
        }
        return mo2407e;
    }
}
