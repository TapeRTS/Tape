package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.BufferedReader;
import java.net.UnknownHostException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.i.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/u.class */
public class RunnableC0888u implements Runnable {

    /* renamed from: a */
    int f5890a;

    /* renamed from: b */
    List f5891b;

    /* renamed from: c */
    AbstractC0886s f5892c;

    /* renamed from: d */
    String f5893d;

    /* renamed from: e */
    boolean f5894e;

    public RunnableC0888u(List list, AbstractC0886s abstractC0886s, String str, boolean z, int i) {
        this.f5890a = i;
        this.f5891b = list;
        this.f5892c = abstractC0886s;
        this.f5893d = str;
        this.f5894e = z;
    }

    public void run() {
        GameEngine m1228A = GameEngine.m1228A();
        try {
            if (C0879n.f5869a) {
                GameEngine.m1138b("LoadFromMasterServer", this.f5890a + ": Started doSingleRequest");
            }
            BufferedReader bufferedReader = C0879n.m1417a(this.f5891b, this.f5893d, this.f5894e).f5887a;
            if (C0879n.f5869a) {
                GameEngine.m1138b("LoadFromMasterServer", this.f5890a + ": Ended doSingleRequest");
            }
            this.f5892c.mo1400a(bufferedReader, this.f5890a, this.f5893d);
        } catch (Exception e) {
            e.printStackTrace();
            String m2335a = C0758f.m2335a(e, true);
            if (e instanceof UnknownHostException) {
                m2335a = "DNS lookup failed, check your internet connection";
            }
            if (m2335a != null && m2335a.contains("Cleartext HTTP traffic")) {
                m2335a = m2335a + " ( Broken apk file? - " + m1228A.mo5702k() + ")";
            }
            this.f5892c.f5884d = "#" + this.f5890a + ": " + m2335a;
            GameEngine.PrintLog("Error getting game list from server #" + this.f5890a);
            if (m1228A.mo5698o()) {
                m1228A.m1186a("Error getting game list from server #" + this.f5890a, 1);
            }
        }
        synchronized (this.f5892c) {
            this.f5892c.f5886f--;
            if (this.f5892c.f5886f == 0) {
                this.f5892c.mo1401a();
            }
        }
    }
}
