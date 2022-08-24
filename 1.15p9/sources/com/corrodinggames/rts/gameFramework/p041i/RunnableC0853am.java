package com.corrodinggames.rts.gameFramework.p041i;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.io.IOException;
import java.net.Socket;

/* renamed from: com.corrodinggames.rts.gameFramework.i.am */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/i/am.class */
public class RunnableC0853am implements Runnable {

    /* renamed from: a */
    String f5679a;

    /* renamed from: b */
    boolean f5680b;

    /* renamed from: c */
    boolean f5681c;

    /* renamed from: d */
    Thread f5682d;

    /* renamed from: e */
    public String f5683e;

    /* renamed from: f */
    Runnable f5684f;

    /* renamed from: g */
    public Socket f5685g;

    /* renamed from: h */
    boolean f5686h = false;

    public RunnableC0853am(String str, boolean z, Runnable runnable) {
        this.f5679a = str;
        this.f5680b = z;
        this.f5684f = runnable;
    }

    /* renamed from: a */
    public boolean m1588a() {
        if (!this.f5681c) {
            return false;
        }
        this.f5686h = true;
        return true;
    }

    /* renamed from: b */
    public void m1587b() {
        this.f5681c = true;
        this.f5682d = new Thread(this);
        this.f5682d.start();
    }

    public void run() {
        try {
            try {
                this.f5685g = C0831ad.m1682b(this.f5679a, this.f5680b);
                this.f5681c = false;
                if (!this.f5686h) {
                    this.f5684f.run();
                } else if (this.f5685g == null) {
                } else {
                    try {
                        this.f5685g.close();
                        this.f5685g = null;
                        this.f5683e = "cancelled";
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            } catch (C0844ag e2) {
                GameEngine.PrintLog("Cancelled connectSocketToServer");
                this.f5683e = "CANCELLED";
                this.f5681c = false;
                if (!this.f5686h) {
                    this.f5684f.run();
                } else if (this.f5685g == null) {
                } else {
                    try {
                        this.f5685g.close();
                        this.f5685g = null;
                        this.f5683e = "cancelled";
                    } catch (IOException e3) {
                        e3.printStackTrace();
                    }
                }
            } catch (IOException e4) {
                this.f5683e = e4.getMessage();
                e4.printStackTrace();
                this.f5681c = false;
                if (!this.f5686h) {
                    this.f5684f.run();
                } else if (this.f5685g == null) {
                } else {
                    try {
                        this.f5685g.close();
                        this.f5685g = null;
                        this.f5683e = "cancelled";
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        } catch (Throwable th) {
            this.f5681c = false;
            if (!this.f5686h) {
                this.f5684f.run();
            } else if (this.f5685g != null) {
                try {
                    this.f5685g.close();
                    this.f5685g = null;
                    this.f5683e = "cancelled";
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }
}
