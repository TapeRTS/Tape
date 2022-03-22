package com.corrodinggames.rts.gameFramework.p042l;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p035f.C0657b;

/* renamed from: com.corrodinggames.rts.gameFramework.l.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/a.class */
public class C0796a {

    /* renamed from: a */
    public static C0796a f5642a = new C0796a();

    /* renamed from: a */
    public static C0796a m632a() {
        return f5642a;
    }

    /* renamed from: b */
    public void mo251b() {
        AbstractC0789l.m670d("SteamEngine - blank init");
    }

    /* renamed from: a */
    public void mo256a(float f) {
    }

    /* renamed from: c */
    public String mo247c() {
        return null;
    }

    /* renamed from: d */
    public void mo245d() {
        AbstractC0789l.m670d("SteamEngine - disableSteam - already disabled");
    }

    /* renamed from: e */
    public boolean m631e() {
        return !mo244f();
    }

    /* renamed from: f */
    public boolean mo244f() {
        return true;
    }

    /* renamed from: g */
    public void mo243g() {
        AbstractC0789l.m670d("disabledSteam - showInviteDialog");
        AbstractC0789l.m638u().m657h("steam API not connected");
    }

    /* renamed from: h */
    public void m630h() {
        AbstractC0789l.m670d("Steam: alertNotEnabled");
        AbstractC0789l u = AbstractC0789l.m638u();
        if (u != null) {
            u.m657h("steam API not connected");
        }
    }

    /* renamed from: i */
    public void mo242i() {
    }

    /* renamed from: j */
    public void mo241j() {
    }

    /* renamed from: k */
    public void mo240k() {
        AbstractC0789l.m670d("disabledSteam - loadWorkshopMods");
    }

    /* renamed from: l */
    public void mo239l() {
        AbstractC0789l.m670d("disabledSteam - showWorkshop");
    }

    /* renamed from: a */
    public void mo254a(C0657b bVar) {
        AbstractC0789l.m670d("disabledSteam - showWorkshopMod");
    }

    /* renamed from: b */
    public void mo249b(C0657b bVar) {
        AbstractC0789l.m670d("disabledSteam - publishWorkshopMod");
    }

    /* renamed from: a */
    public void mo253a(C0657b bVar, boolean z, String str) {
        AbstractC0789l.m670d("disabledSteam - uploadWorkshopMod");
    }
}
