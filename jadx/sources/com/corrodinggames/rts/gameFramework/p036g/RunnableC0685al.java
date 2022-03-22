package com.corrodinggames.rts.gameFramework.p036g;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.io.IOException;
import java.net.Socket;

/* renamed from: com.corrodinggames.rts.gameFramework.g.al */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/al.class */
public class RunnableC0685al implements Runnable {

    /* renamed from: a */
    String f4837a;

    /* renamed from: b */
    boolean f4838b;

    /* renamed from: c */
    boolean f4839c;

    /* renamed from: d */
    Thread f4840d;

    /* renamed from: e */
    public String f4841e;

    /* renamed from: f */
    Runnable f4842f;

    /* renamed from: g */
    public Socket f4843g;

    /* renamed from: h */
    boolean f4844h = false;

    public RunnableC0685al(String str, boolean z, Runnable runnable) {
        this.f4837a = str;
        this.f4838b = z;
        this.f4842f = runnable;
    }

    /* renamed from: a */
    public boolean m1210a() {
        if (!this.f4839c) {
            return false;
        }
        this.f4844h = true;
        return true;
    }

    /* renamed from: b */
    public void m1209b() {
        this.f4839c = true;
        this.f4840d = new Thread(this);
        this.f4840d.start();
    }

    public void run() {
        try {
            try {
                try {
                    this.f4843g = Hcat_Multiplaye.m1293b(this.f4837a, this.f4838b);
                    this.f4839c = false;
                    if (!this.f4844h) {
                        this.f4842f.run();
                    } else if (this.f4843g != null) {
                        try {
                            this.f4843g.close();
                            this.f4843g = null;
                            this.f4841e = "cancelled";
                        } catch (IOException e) {
                            e.printStackTrace();
                        }
                    }
                } catch (C0677ag e2) {
                    AbstractC0789l.m683d("Cancelled connectSocketToServer");
                    this.f4841e = "CANCELLED";
                    this.f4839c = false;
                    if (!this.f4844h) {
                        this.f4842f.run();
                    } else if (this.f4843g != null) {
                        try {
                            this.f4843g.close();
                            this.f4843g = null;
                            this.f4841e = "cancelled";
                        } catch (IOException e3) {
                            e3.printStackTrace();
                        }
                    }
                }
            } catch (IOException e4) {
                this.f4841e = e4.getMessage();
                e4.printStackTrace();
                this.f4839c = false;
                if (!this.f4844h) {
                    this.f4842f.run();
                } else if (this.f4843g != null) {
                    try {
                        this.f4843g.close();
                        this.f4843g = null;
                        this.f4841e = "cancelled";
                    } catch (IOException e5) {
                        e5.printStackTrace();
                    }
                }
            }
        } catch (Throwable th) {
            this.f4839c = false;
            if (!this.f4844h) {
                this.f4842f.run();
            } else if (this.f4843g != null) {
                try {
                    this.f4843g.close();
                    this.f4843g = null;
                    this.f4841e = "cancelled";
                } catch (IOException e6) {
                    e6.printStackTrace();
                }
            }
            throw th;
        }
    }
}
