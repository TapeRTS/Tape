package com.corrodinggames.rts.gameFramework.p031b;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.List;

/* renamed from: com.corrodinggames.rts.gameFramework.b.i */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/b/i.class */
public class C0698i extends C0691c {

    /* renamed from: a */
    protected List f4369a;

    /* renamed from: b */
    private final List f4370b;

    /* renamed from: c */
    private AbstractC0690b f4371c;

    /* renamed from: d */
    private AbstractC0690b f4372d;

    /* renamed from: a */
    private void m2778a(AbstractC0690b abstractC0690b) {
        m2779a();
        for (int i = 0; i < this.f4369a.size(); i++) {
            this.f4370b.add(new C0713x(abstractC0690b.mo2807b(), abstractC0690b.mo2806c(), false));
        }
    }

    /* renamed from: a */
    private void m2779a() {
        for (C0713x c0713x : this.f4370b) {
            c0713x.mo2801j();
        }
        this.f4370b.clear();
    }

    /* renamed from: a */
    public AbstractC0690b m2777a(AbstractC0690b abstractC0690b, InterfaceC0700k interfaceC0700k, InterfaceC0699j interfaceC0699j) {
        if (abstractC0690b instanceof C0713x) {
            if (!((C0713x) abstractC0690b).m2667k()) {
                return this.f4371c;
            }
        } else if (this.f4372d == abstractC0690b && this.f4371c != null) {
            return this.f4371c;
        }
        if (this.f4370b.size() != this.f4369a.size() || this.f4372d != abstractC0690b) {
            m2778a(abstractC0690b);
        }
        this.f4372d = abstractC0690b;
        C0713x c0713x = abstractC0690b;
        int i = 0;
        int size = this.f4370b.size();
        while (i < size) {
            C0713x c0713x2 = (C0713x) this.f4370b.get(i);
            InterfaceC0685af interfaceC0685af = (InterfaceC0685af) this.f4369a.get(i);
            interfaceC0700k.mo2760c(c0713x2);
            interfaceC0699j.mo2776a(c0713x, interfaceC0685af, i == 0);
            interfaceC0700k.mo2759d();
            c0713x = c0713x2;
            GameEngine.PrintLog("FilterGroup: renderTarget");
            i++;
        }
        this.f4371c = c0713x;
        return c0713x;
    }
}
