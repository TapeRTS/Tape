package com.corrodinggames.rts.game;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.gameFramework.EnumC1065u;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.C0928ae;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.p044l.C0934e;
import com.corrodinggames.rts.gameFramework.p044l.InterfaceC1027y;
import java.io.IOException;

/* renamed from: com.corrodinggames.rts.game.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/j.class */
public class C0193j {

    /* renamed from: a */
    public C0934e f1278a;

    /* renamed from: b */
    InterfaceC1027y f1279b;

    /* renamed from: c */
    C0930ag f1280c;

    /* renamed from: d */
    C0928ae f1281d;

    /* renamed from: e */
    Paint f1282e;

    /* renamed from: f */
    Rect f1283f;

    /* renamed from: g */
    boolean f1284g;

    public C0193j() {
        this.f1282e = new Paint();
        this.f1283f = new Rect(-101, 0, -1, 100);
        this.f1280c = new C0930ag();
    }

    public C0193j(String str) {
        this();
        try {
            this.f1281d = new C0928ae(str);
            this.f1280c.m1048a(this.f1281d);
            if (this.f1281d.f6354o != 0) {
                this.f1284g = true;
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: a */
    public boolean m5687a() {
        if ((this.f1281d != null && this.f1281d.f6354o != 0) || this.f1284g) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public void m5686a(InterfaceC1027y interfaceC1027y) {
        m5685a(interfaceC1027y, interfaceC1027y.mo870m(), interfaceC1027y.mo869n(), 10);
    }

    /* renamed from: a */
    public void m5685a(InterfaceC1027y interfaceC1027y, int i, int i2, int i3) {
        if (this.f1284g) {
            return;
        }
        if (this.f1278a != null && (i > this.f1278a.mo390m() || i2 > this.f1278a.mo391l())) {
            this.f1278a.mo388o();
            this.f1278a = null;
            this.f1279b = null;
        }
        if (this.f1278a == null) {
            try {
                this.f1278a = interfaceC1027y.mo922a(i + i3, i2 + i3, true);
                this.f1279b = interfaceC1027y.mo911a(this.f1278a);
            } catch (OutOfMemoryError e) {
                this.f1284g = true;
                GameEngine.m1189a(EnumC1065u.gameImageCreate, e);
                return;
            }
        }
        this.f1279b.mo923a(i, i2);
    }

    /* renamed from: b */
    public void m5684b() {
        GameEngine m1228A = GameEngine.m1228A();
        m1228A.f6107bO.mo886b(this.f1283f, this.f1282e);
        m1228A.f6107bO.mo884b(this.f1278a, 0.0f, 0.0f, this.f1280c);
    }
}
