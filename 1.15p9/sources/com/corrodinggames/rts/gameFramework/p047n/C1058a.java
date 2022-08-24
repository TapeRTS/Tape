package com.corrodinggames.rts.gameFramework.p047n;

import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;

/* renamed from: com.corrodinggames.rts.gameFramework.n.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/n/a.class */
public class C1058a {

    /* renamed from: a */
    public static C1058a f6727a = new C1058a();

    /* renamed from: a */
    public static C1058a m786a() {
        return f6727a;
    }

    /* renamed from: b */
    public void m782b() {
        GameEngine.PrintLog("SteamEngine - blank init");
    }

    /* renamed from: a */
    public void m785a(float f) {
    }

    /* renamed from: c */
    public String m780c() {
        return null;
    }

    /* renamed from: d */
    public void m779d() {
        GameEngine.PrintLog("SteamEngine - disableSteam - already disabled");
    }

    /* renamed from: e */
    public boolean m778e() {
        return !m777f();
    }

    /* renamed from: f */
    public boolean m777f() {
        return true;
    }

    /* renamed from: g */
    public void m776g() {
        GameEngine.PrintLog("disabledSteam - showInviteDialog");
        GameEngine.getInstance().m1116i("steam API not connected");
    }

    /* renamed from: h */
    public void m775h() {
        GameEngine.PrintLog("Steam: alertNotEnabled");
        GameEngine gameEngine = GameEngine.getInstance();
        if (gameEngine != null) {
            gameEngine.m1116i("steam API not connected");
        }
    }

    /* renamed from: i */
    public void m774i() {
    }

    /* renamed from: j */
    public void m773j() {
    }

    /* renamed from: k */
    public void m772k() {
    }

    /* renamed from: l */
    public void m771l() {
        GameEngine.PrintLog("disabledSteam - loadWorkshopMods");
    }

    /* renamed from: m */
    public void m770m() {
        GameEngine.PrintLog("disabledSteam - showWorkshop");
    }

    /* renamed from: a */
    public void m784a(C0824b c0824b) {
        GameEngine.PrintLog("disabledSteam - showWorkshopMod");
    }

    /* renamed from: b */
    public void m781b(C0824b c0824b) {
        GameEngine.PrintLog("disabledSteam - publishWorkshopMod");
    }

    /* renamed from: a */
    public void m783a(C0824b c0824b, boolean z, String str) {
        GameEngine.PrintLog("disabledSteam - uploadWorkshopMod");
    }
}
