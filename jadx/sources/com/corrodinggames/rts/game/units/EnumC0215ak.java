package com.corrodinggames.rts.game.units;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.C0163f;
import com.corrodinggames.rts.game.units.custom.C0314aj;
import com.corrodinggames.rts.game.units.custom.C0363g;
import com.corrodinggames.rts.game.units.custom.C0365i;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.p013a.AbstractC0197s;
import com.corrodinggames.rts.game.units.p013a.C0181c;
import com.corrodinggames.rts.game.units.p013a.C0204z;
import com.corrodinggames.rts.game.units.p014b.C0273a;
import com.corrodinggames.rts.game.units.p014b.C0275c;
import com.corrodinggames.rts.game.units.p014b.C0278d;
import com.corrodinggames.rts.game.units.p014b.C0281e;
import com.corrodinggames.rts.game.units.p014b.C0282f;
import com.corrodinggames.rts.game.units.p015c.C0284a;
import com.corrodinggames.rts.game.units.p023d.C0385a;
import com.corrodinggames.rts.game.units.p023d.C0400b;
import com.corrodinggames.rts.game.units.p023d.C0404d;
import com.corrodinggames.rts.game.units.p023d.C0405e;
import com.corrodinggames.rts.game.units.p023d.C0407f;
import com.corrodinggames.rts.game.units.p023d.C0410g;
import com.corrodinggames.rts.game.units.p023d.C0417l;
import com.corrodinggames.rts.game.units.p023d.C0420n;
import com.corrodinggames.rts.game.units.p023d.C0422o;
import com.corrodinggames.rts.game.units.p023d.C0425p;
import com.corrodinggames.rts.game.units.p023d.C0427r;
import com.corrodinggames.rts.game.units.p023d.C0429s;
import com.corrodinggames.rts.game.units.p023d.C0431t;
import com.corrodinggames.rts.game.units.p023d.p024a.C0387a;
import com.corrodinggames.rts.game.units.p023d.p024a.C0389b;
import com.corrodinggames.rts.game.units.p025e.C0433a;
import com.corrodinggames.rts.game.units.p025e.C0434b;
import com.corrodinggames.rts.game.units.p025e.C0435c;
import com.corrodinggames.rts.game.units.p025e.C0436d;
import com.corrodinggames.rts.game.units.p025e.C0437e;
import com.corrodinggames.rts.game.units.p025e.C0438f;
import com.corrodinggames.rts.game.units.p025e.C0439g;
import com.corrodinggames.rts.game.units.p025e.C0441i;
import com.corrodinggames.rts.game.units.p025e.C0445k;
import com.corrodinggames.rts.game.units.p025e.C0446l;
import com.corrodinggames.rts.game.units.p025e.C0447m;
import com.corrodinggames.rts.game.units.p025e.C0448n;
import com.corrodinggames.rts.game.units.p025e.C0449o;
import com.corrodinggames.rts.game.units.p028h.C0490a;
import com.corrodinggames.rts.game.units.p028h.C0491b;
import com.corrodinggames.rts.game.units.p028h.C0492c;
import com.corrodinggames.rts.game.units.p028h.C0493d;
import com.corrodinggames.rts.game.units.p028h.C0494e;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p034e.C0652a;
import com.corrodinggames.rts.gameFramework.p039j.AbstractC0755l;
import com.corrodinggames.rts.gameFramework.p039j.C0748e;
import java.io.File;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.game.units.ak */
/* loaded from: game-lib.jar:com/corrodinggames/rts/game/units/ak.class */
public enum EnumC0215ak implements AbstractC0268al {
    extractor { // from class: com.corrodinggames.rts.game.units.ak.1
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0407f(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0407f.m2630c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 700;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: c */
        public int mo3264c(int i) {
            if (i == 2) {
                return 1200;
            }
            if (i == 3) {
                return 2500;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: p */
        public boolean mo2740p() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: a */
        public int mo2796a(AbstractC0210af afVar) {
            if (afVar.m3299ct()) {
                return 110;
            }
            return 0;
        }
    },
    landFactory { // from class: com.corrodinggames.rts.game.units.ak.12
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0417l(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0417l.m2579b();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 700;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: c */
        public int mo3264c(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public void mo3261a(ArrayList arrayList, int i) {
            C0417l.m2580a(arrayList, i);
        }
    },
    airFactory { // from class: com.corrodinggames.rts.game.units.ak.23
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0385a(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0385a.m2705b();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: c */
        public int mo3264c(int i) {
            if (i == 2) {
                return 1500;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public void mo3261a(ArrayList arrayList, int i) {
            C0385a.m2706a(arrayList, i);
        }
    },
    seaFactory { // from class: com.corrodinggames.rts.game.units.ak.34
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0427r(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0427r.m2555b();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: c */
        public int mo3264c(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 7.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public void mo3261a(ArrayList arrayList, int i) {
            C0427r.m2556a(arrayList, i);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: a */
        public int mo2796a(AbstractC0210af afVar) {
            return 110;
        }
    },
    commandCenter { // from class: com.corrodinggames.rts.game.units.ak.45
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0404d(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0404d.m2639b();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 3000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 5.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public void mo3261a(ArrayList arrayList, int i) {
            C0404d.m2640a(arrayList, i);
        }
    },
    turret { // from class: com.corrodinggames.rts.game.units.ak.49
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0389b(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0389b.m2687dh();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 6.0E-4f;
        }
    },
    antiAirTurret { // from class: com.corrodinggames.rts.game.units.ak.50
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0387a(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0387a.m2702b();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 8.0E-4f;
        }
    },
    builder { // from class: com.corrodinggames.rts.game.units.ak.51
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0434b(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0434b.m2530K();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: l */
        public boolean mo2748l() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: m */
        public boolean mo2746m() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: n */
        public boolean mo2744n() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public void mo3261a(ArrayList arrayList, int i) {
            C0434b.m2528a(arrayList, i);
            C0465h.m2427a((ArrayList) null, i);
        }
    },
    tank { // from class: com.corrodinggames.rts.game.units.ak.52
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0448n(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0448n.m2477c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 350;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.002f;
        }
    },
    hoverTank { // from class: com.corrodinggames.rts.game.units.ak.2
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0439g(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0439g.m2512c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 450;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.002f;
        }
    },
    artillery { // from class: com.corrodinggames.rts.game.units.ak.3
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0433a(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0433a.m2531c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 900;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.0014f;
        }
    },
    helicopter { // from class: com.corrodinggames.rts.game.units.ak.4
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0282f(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0282f.m3211c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 650;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.0012f;
        }
    },
    airShip { // from class: com.corrodinggames.rts.game.units.ak.5
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0273a(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0273a.m3229c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.002f;
        }
    },
    gunShip { // from class: com.corrodinggames.rts.game.units.ak.6
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0281e(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0281e.m3213c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: g */
        public int mo2758g() {
            return 2;
        }
    },
    missileShip { // from class: com.corrodinggames.rts.game.units.ak.7
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0493d(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0493d.m2392c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 900;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }
    },
    gunBoat { // from class: com.corrodinggames.rts.game.units.ak.8
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0492c(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0492c.m2394c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 300;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.005f;
        }
    },
    megaTank { // from class: com.corrodinggames.rts.game.units.ak.9
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0447m(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0447m.m2480c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.0015f;
        }
    },
    laserTank { // from class: com.corrodinggames.rts.game.units.ak.10
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0445k(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0445k.m2484c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 1300;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.0013f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: g */
        public int mo2758g() {
            return 2;
        }
    },
    hovercraft { // from class: com.corrodinggames.rts.game.units.ak.11
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0441i(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0441i.m2501c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 600;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.003f;
        }
    },
    ladybug { // from class: com.corrodinggames.rts.game.units.ak.13
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0284a(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0284a.m3209c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 400;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.004f;
        }
    },
    battleShip { // from class: com.corrodinggames.rts.game.units.ak.14
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0490a(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0490a.m2407c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }
    },
    tankDestroyer { // from class: com.corrodinggames.rts.game.units.ak.15
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0449o(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0449o.m2474c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.003f;
        }
    },
    heavyTank { // from class: com.corrodinggames.rts.game.units.ak.16
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0438f(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0438f.m2515c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.0011f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: g */
        public int mo2758g() {
            return 2;
        }
    },
    heavyHoverTank { // from class: com.corrodinggames.rts.game.units.ak.17
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0437e(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0437e.m2517c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: g */
        public int mo2758g() {
            return 2;
        }
    },
    laserDefence { // from class: com.corrodinggames.rts.game.units.ak.18
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0420n(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0420n.m2574b();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 1200;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: c */
        public int mo3264c(int i) {
            if (i == 2) {
                return 2000;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }
    },
    dropship { // from class: com.corrodinggames.rts.game.units.ak.19
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0278d(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0278d.m3218c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: g */
        public int mo2758g() {
            return 2;
        }
    },
    tree { // from class: com.corrodinggames.rts.game.units.ak.20
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0209ae(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0209ae.m3348b();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.0025f;
        }
    },
    repairbay { // from class: com.corrodinggames.rts.game.units.ak.21
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0425p(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0425p.m2558da();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }
    },
    NukeLaucher { // from class: com.corrodinggames.rts.game.units.ak.22
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0422o(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0422o.m2565b();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 45000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 1.0E-4f;
        }
    },
    AntiNukeLaucher { // from class: com.corrodinggames.rts.game.units.ak.24
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0400b(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0400b.m2657b();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 15000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 7.0E-4f;
        }
    },
    mammothTank { // from class: com.corrodinggames.rts.game.units.ak.25
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0446l(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0446l.m2482c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 3900;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 9.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: g */
        public int mo2758g() {
            return 3;
        }
    },
    experimentalTank { // from class: com.corrodinggames.rts.game.units.ak.26
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0436d(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0436d.m2521c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 14000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 2.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: g */
        public int mo2758g() {
            return 3;
        }
    },
    experimentalLandFactory { // from class: com.corrodinggames.rts.game.units.ak.27
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0405e(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0405e.m2634b();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 11000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 3.5E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public void mo3261a(ArrayList arrayList, int i) {
            C0405e.m2635a(arrayList, i);
        }
    },
    crystalResource { // from class: com.corrodinggames.rts.game.units.ak.28
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0432e(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0432e.m2539c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 5000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }
    },
    wall_v { // from class: com.corrodinggames.rts.game.units.ak.29
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0431t(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0431t.m2542b();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 100;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.003f;
        }
    },
    fabricator { // from class: com.corrodinggames.rts.game.units.ak.30
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0410g(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0410g.m2624c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 1500;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: c */
        public int mo3264c(int i) {
            if (i == 2) {
                return 3000;
            }
            if (i == 3) {
                return 5000;
            }
            return 0;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 6.0E-4f;
        }
    },
    attackSubmarine { // from class: com.corrodinggames.rts.game.units.ak.31
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0494e(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0494e.m2388b();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 800;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }
    },
    builderShip { // from class: com.corrodinggames.rts.game.units.ak.32
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0491b(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0491b.m2406K();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: l */
        public boolean mo2748l() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: m */
        public boolean mo2746m() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public void mo3261a(ArrayList arrayList, int i) {
            C0491b.m2405a(arrayList, i);
        }
    },
    amphibiousJet { // from class: com.corrodinggames.rts.game.units.ak.33
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0275c(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0275c.m3222f();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 2000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: g */
        public int mo2758g() {
            return 2;
        }
    },
    supplyDepot { // from class: com.corrodinggames.rts.game.units.ak.35
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0429s(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0429s.m2545c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.001f;
        }
    },
    experimentalHoverTank { // from class: com.corrodinggames.rts.game.units.ak.36
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0435c(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0435c.m2524c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 21000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 2.0E-4f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: g */
        public int mo2758g() {
            return 3;
        }
    },
    turret_artillery { // from class: com.corrodinggames.rts.game.units.ak.37
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            C0389b bVar = new C0389b(z);
            bVar.mo2696a_("artillery");
            return bVar;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return EnumC0215ak.turret.mo2769c() + C0389b.f2943dw.mo2415c();
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 6.0E-4f;
        }
    },
    turret_flamethrower { // from class: com.corrodinggames.rts.game.units.ak.38
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            C0389b bVar = new C0389b(z);
            bVar.mo2696a_("flamethrower");
            return bVar;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return EnumC0215ak.turret.mo2769c() + C0389b.f2944dx.mo2415c();
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 6.0E-4f;
        }
    },
    fogRevealer { // from class: com.corrodinggames.rts.game.units.ak.39
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0511n(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0511n.m2366c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 6.0E-4f;
        }
    },
    spreadingFire { // from class: com.corrodinggames.rts.game.units.ak.40
        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0206ab(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0206ab.m3355b();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 6.0E-4f;
        }
    },
    antiAirTurretT2 { // from class: com.corrodinggames.rts.game.units.ak.41
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            C0387a aVar = new C0387a(z);
            aVar.mo2310a(2);
            return aVar;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return EnumC0215ak.turret.mo2769c() + C0387a.f2913e.mo2415c();
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 6.0E-4f;
        }
    },
    turretT2 { // from class: com.corrodinggames.rts.game.units.ak.42
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            C0389b bVar = new C0389b(z);
            bVar.mo2696a_("gunT2");
            return bVar;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return EnumC0215ak.turret.mo2769c() + C0389b.f2941du.mo2415c();
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 6.0E-4f;
        }
    },
    turretT3 { // from class: com.corrodinggames.rts.game.units.ak.43
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: j */
        public boolean mo2752j() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            C0389b bVar = new C0389b(z);
            bVar.mo2696a_("gunT3");
            return bVar;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return EnumC0215ak.turret.mo2769c() + C0389b.f2941du.mo2415c() + C0389b.f2942dv.mo2415c();
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 3.0E-4f;
        }
    },
    damagingBorder { // from class: com.corrodinggames.rts.game.units.ak.44
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: A */
        public boolean mo3263A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0450f(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0450f.m2469c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 6.0E-4f;
        }
    },
    zoneMarker { // from class: com.corrodinggames.rts.game.units.ak.46
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: A */
        public boolean mo3263A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            C0450f fVar = new C0450f(z);
            fVar.f3238q = true;
            return fVar;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
            C0450f.m2469c();
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 1000;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 6.0E-4f;
        }
    },
    editorOrBuilder { // from class: com.corrodinggames.rts.game.units.ak.47
        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: A */
        public boolean mo3263A() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: B */
        public boolean mo2802B() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public AbstractC0210af mo3260a(boolean z) {
            return new C0465h(z);
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: b */
        public void mo3259b() {
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: c */
        public int mo2769c() {
            return 500;
        }

        @Override // com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: C */
        public float mo2801C() {
            return 0.002f;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: l */
        public boolean mo2748l() {
            return true;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: m */
        public boolean mo2746m() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak, com.corrodinggames.rts.game.units.AbstractC0268al
        /* renamed from: n */
        public boolean mo2744n() {
            return false;
        }

        @Override // com.corrodinggames.rts.game.units.EnumC0215ak
        /* renamed from: a */
        public void mo3261a(ArrayList arrayList, int i) {
        }
    };
    

    /* renamed from: Z */
    C0204z f1635Z;

    /* renamed from: aa */
    int f1636aa;

    /* renamed from: ab */
    String f1637ab;

    /* renamed from: ac */
    String f1638ac;

    /* renamed from: ad */
    public static ArrayList f1639ad;

    /* renamed from: ae */
    C0269am[] f1640ae;

    /* renamed from: af */
    public static boolean f1641af;

    /* renamed from: ag */
    C0363g f1642ag;

    /* renamed from: a */
    public abstract AbstractC0210af mo3260a(boolean z);

    /* renamed from: b */
    public abstract void mo3259b();

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: c */
    public abstract int mo2769c();

    EnumC0215ak() {
        this.f1635Z = new C0204z(this);
        this.f1636aa = -1;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: a */
    public AbstractC0210af mo2799a() {
        return mo3260a(false);
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: d */
    public C0204z mo2765d() {
        return this.f1635Z;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: e */
    public String mo2762e() {
        if (this.f1636aa != C0652a.f4580c || this.f1637ab == null) {
            this.f1636aa = C0652a.f4580c;
            String str = "units." + name() + ".name";
            this.f1637ab = C0652a.m1539a(str, null, new Object[0]);
            if (this.f1637ab == null) {
                if (!AbstractC0789l.m638u().m700ai() || mo3263A()) {
                    this.f1637ab = name();
                } else {
                    throw new RuntimeException("Can't find translation text for: " + str);
                }
            }
        }
        return this.f1637ab;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: f */
    public String mo2760f() {
        if (this.f1636aa != C0652a.f4580c || this.f1638ac == null) {
            this.f1636aa = C0652a.f4580c;
            String str = "units." + name() + ".description";
            this.f1638ac = C0652a.m1539a(str, null, new Object[0]);
            if (this.f1638ac == null) {
                if (!AbstractC0789l.m638u().m700ai() || mo3263A()) {
                    this.f1638ac = "";
                } else {
                    throw new RuntimeException("Can't find translation text for: " + str);
                }
            }
        }
        return this.f1638ac;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: g */
    public int mo2758g() {
        return 1;
    }

    /* renamed from: a */
    public void mo3261a(ArrayList arrayList, int i) {
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: h */
    public void mo2756h() {
        C0269am[] amVarArr = new C0269am[3];
        for (int i = 1; i <= 3; i++) {
            C0269am amVar = new C0269am();
            mo3261a(amVar.f1644a, i);
            amVarArr[i - 1] = amVar;
        }
        this.f1640ae = amVarArr;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: a */
    public ArrayList mo2798a(int i) {
        if (i <= 3) {
            return this.f1640ae[i - 1].f1644a;
        }
        throw new RuntimeException("Tech level:" + i + " greater than maxTechLevel");
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: i */
    public String mo2754i() {
        return name();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: j */
    public boolean mo2752j() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: k */
    public boolean mo2750k() {
        return mo2752j();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: l */
    public boolean mo2748l() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: m */
    public boolean mo2746m() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: n */
    public boolean mo2744n() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: o */
    public EnumC0212ah mo2742o() {
        AbstractC0210af a = AbstractC0210af.m3333a(this);
        if (a != null) {
            return a.mo2358h();
        }
        throw new RuntimeException("Shared unit is null for:" + name());
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: p */
    public boolean mo2740p() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: q */
    public C0314aj mo2739q() {
        return null;
    }

    /* renamed from: a */
    public static AbstractC0268al m3273a(String str) {
        return m3269a(str, true);
    }

    /* renamed from: a */
    public static AbstractC0268al m3269a(String str, boolean z) {
        EnumC0215ak[] values;
        AbstractC0268al k;
        if (z && (k = C0368l.m2749k(str)) != null) {
            return k;
        }
        for (EnumC0215ak akVar : values()) {
            if (akVar.name().equalsIgnoreCase(str)) {
                return akVar;
            }
        }
        C0368l l = C0368l.m2747l(str);
        if (l != null) {
            return l;
        }
        return null;
    }

    /* renamed from: a */
    private static String m3272a(String str, float f) {
        return m3271a(str, f, "");
    }

    /* renamed from: a */
    private static String m3271a(String str, float f, String str2) {
        String str3 = "" + f;
        if (f % 1.0f == 0.0f) {
            str3 = "" + ((int) f);
        }
        return m3270a(str, str3, str2);
    }

    /* renamed from: a */
    private static String m3270a(String str, String str2, String str3) {
        return str + ": " + str2 + str3 + "\n";
    }

    /* renamed from: a */
    private static int m3274a(AbstractC0515r rVar) {
        AbstractC0197s a;
        C0181c bX = rVar.mo2546bX();
        if (bX == null || (a = rVar.mo2880a(bX)) == null) {
            return 0;
        }
        return a.mo2415c();
    }

    /* renamed from: r */
    public static void m3267r() {
        new File("output_all_unit_images/").mkdirs();
        for (int i = 0; i < 50; i++) {
            AbstractC0789l.m719a("running outputUnitImages()");
        }
        String[] strArr = {"carrier", "experimentalGunship", "experimentalGunshipLanded", "mech_gun", "ladybug", "spiderBot", "wall_v", "crystalResource", "test_tank", "missing", "fogRevealer", "supplyDepot", "tankDestroyer", "megaTank", "crystal_mid", "mechFlyingLanded"};
        Iterator it = f1639ad.iterator();
        while (it.hasNext()) {
            AbstractC0268al alVar = (AbstractC0268al) it.next();
            AbstractC0210af a = AbstractC0210af.m3333a(alVar);
            if ((a instanceof AbstractC0515r) && !alVar.mo2754i().startsWith("bug") && C0368l.m2768c(alVar) == null && (!(alVar instanceof C0368l) || ((C0368l) alVar).f2555au)) {
                AbstractC0515r rVar = (AbstractC0515r) a;
                boolean z = false;
                for (String str : strArr) {
                    if (str.equals(alVar.mo2754i())) {
                        z = true;
                    }
                }
                if (!z) {
                    String str2 = "output_all_unit_images/" + alVar.mo2754i().replace("/", "_").replace("\\", "_") + ".png";
                    AbstractC0789l u = AbstractC0789l.m638u();
                    C0748e b = u.f5514bw.mo145b(100, 100, true);
                    AbstractC0755l a2 = u.f5514bw.mo177a(b);
                    AbstractC0755l lVar = u.f5514bw;
                    u.f5514bw = a2;
                    m3275a(alVar, b.f5247m, b.f5248n, 0.0f, 0.0f, AbstractC0171m.m3436n(0), 20.0f, 100, false, false, 1, true);
                    u.f5514bw = lVar;
                    a2.mo122m();
                    u.f5514bw.mo167a(b, new File(str2));
                }
            }
        }
    }

    /* renamed from: s */
    public static void m3266s() {
        int a;
        int a2;
        for (int i = 0; i < 50; i++) {
            AbstractC0789l.m719a("running printForHelp()");
        }
        String[] strArr = {"carrier", "experimentalGunship", "experimentalGunshipLanded", "mech_gun", "ladybug", "spiderBot", "wall_v", "crystalResource", "test_tank", "missing", "fogRevealer", "supplyDepot", "tankDestroyer", "megaTank", "crystal_mid", "mechFlyingLanded"};
        String str = "";
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(f1639ad);
        Collections.sort(arrayList, new Comparator() { // from class: com.corrodinggames.rts.game.units.ak.48
            /* renamed from: a */
            public int compare(AbstractC0268al alVar, AbstractC0268al alVar2) {
                return alVar.mo2735u().compareTo(alVar2.mo2735u());
            }
        });
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            AbstractC0268al alVar = (AbstractC0268al) it.next();
            AbstractC0210af a3 = AbstractC0210af.m3333a(alVar);
            if ((a3 instanceof AbstractC0515r) && !alVar.mo2754i().startsWith("bug") && C0368l.m2768c(alVar) == null && (!(alVar instanceof C0368l) || ((C0368l) alVar).f2555au)) {
                if (alVar != editorOrBuilder) {
                    AbstractC0515r rVar = (AbstractC0515r) a3;
                    boolean z = false;
                    for (String str2 : strArr) {
                        if (str2.equals(alVar.mo2754i())) {
                            z = true;
                        }
                    }
                    if (!z) {
                        String str3 = ((((((str + "\n") + "<div class=\"unit\">\n") + "<img src=\"unit:" + alVar.mo2754i() + "\" />\n") + "<h4>" + alVar.mo2762e() + "</h4>\n") + "<p>" + alVar.mo2760f().replace("\n", "<br/>") + "</p>\n") + "<pre>") + m3270a("Price", "$" + alVar.mo2769c(), "");
                        if (m3274a(rVar) > 0) {
                            str3 = str3 + m3270a("T2 Upgrade Price", "$" + a, "");
                            AbstractC0515r rVar2 = (AbstractC0515r) alVar.mo2799a();
                            rVar2.mo2310a(2);
                            if (rVar2.mo2329T() == 2 && (a2 = m3274a(rVar2)) > 0) {
                                str3 = str3 + m3270a("T3 Upgrade Price", "$" + a2, "");
                            }
                        }
                        String str4 = (((str3 + m3272a("Hp", rVar.f1485bZ)) + m3272a("Speed", rVar.mo2130z())) + m3272a("Turn speed", rVar.mo2354A())) + m3272a("Mass", rVar.mo2395bB());
                        if (rVar.mo2356l()) {
                            str4 = (str4 + m3272a("Shoot Delay", rVar.mo2222b(0))) + m3272a("Attack Range", rVar.mo2152m());
                            float f = 0.0f;
                            float f2 = 0.0f;
                            float f3 = 0.0f;
                            float f4 = 0.0f;
                            int bg = rVar.mo2205bg();
                            for (int i2 = 0; i2 < bg; i2++) {
                                int i3 = C0163f.f915a.f5778a;
                                rVar.mo2299a((AbstractC0210af) rVar, i2);
                                if (i3 != C0163f.f915a.f5778a) {
                                    C0163f fVar = (C0163f) C0163f.f915a.get(C0163f.f915a.f5778a - 1);
                                    if (fVar.f962U > f) {
                                        f = fVar.f962U;
                                    }
                                    if (fVar.f966Y > f2) {
                                        f2 = fVar.f966Y;
                                    }
                                    f3 += fVar.f962U;
                                    f4 += fVar.f966Y;
                                }
                            }
                            if (f3 != 0.0f) {
                                String str5 = "";
                                if (f3 != f) {
                                    str5 = " (total:" + f3 + ")";
                                }
                                str4 = str4 + m3271a("Direct Damage", f, str5);
                            }
                            if (f4 != 0.0f) {
                                String str6 = "";
                                if (f4 != f2) {
                                    str6 = " (total:" + f4 + ")";
                                }
                                str4 = str4 + m3271a("Area Damage", f2, str6);
                            }
                        }
                        str = (str4 + "</pre>") + "</div>\n";
                    }
                }
            }
        }
        AbstractC0789l.m670d(str);
    }

    /* renamed from: t */
    public static void m3265t() {
        EnumC0215ak[] values;
        for (EnumC0215ak akVar : values()) {
            akVar.name();
            akVar.mo2762e();
            akVar.mo2760f();
        }
    }

    /* renamed from: a */
    public static boolean m3277a(AbstractC0268al alVar, float f, float f2, float f3, float f4, AbstractC0171m mVar) {
        AbstractC0789l.m638u();
        AbstractC0210af a = AbstractC0210af.m3333a(alVar);
        if (a == null) {
            AbstractC0789l.m670d("isValidHere: Failed to get unit from type:" + alVar);
            return false;
        }
        a.mo2305a(mVar);
        a.f5844dJ = f4;
        a.f5842dH = f;
        a.f5843dI = f2;
        if (!a.mo2643bw()) {
            a.f1471bL = f3;
            if (a instanceof AbstractC0515r) {
                ((AbstractC0515r) a).m2162j(f3);
            }
        }
        boolean z = true;
        if (a instanceof AbstractC0515r) {
            z = ((AbstractC0515r) a).mo2198bn();
        }
        a.f5844dJ = 0.0f;
        a.f1471bL = 0.0f;
        return z;
    }

    /* renamed from: a */
    public static void m3276a(AbstractC0268al alVar, float f, float f2, float f3, float f4, AbstractC0171m mVar, float f5, float f6, boolean z, boolean z2, int i) {
        m3275a(alVar, f, f2, f3, f4, mVar, f5, f6, z, z2, i, true);
    }

    /* renamed from: a */
    public static void m3275a(AbstractC0268al alVar, float f, float f2, float f3, float f4, AbstractC0171m mVar, float f5, float f6, boolean z, boolean z2, int i, boolean z3) {
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0210af c = AbstractC0210af.m3310c(alVar);
        boolean bw = c.mo2643bw();
        c.mo2305a(mVar);
        if (c instanceof AbstractC0515r) {
            ((AbstractC0515r) c).mo2310a(i);
        }
        c.f5844dJ = f4;
        if (c.mo2358h() == EnumC0212ah.HOVER || c.mo2358h() == EnumC0212ah.OVER_CLIFF || c.mo2358h() == EnumC0212ah.OVER_CLIFF_WATER) {
            c.f5844dJ += 4.0f;
        }
        if (c.mo2358h() == EnumC0212ah.AIR) {
            c.f5844dJ += 10.0f;
        }
        if (!bw) {
            c.f1471bL = f3;
            if (c instanceof AbstractC0515r) {
                ((AbstractC0515r) c).m2162j(f3);
            }
        } else {
            c.f1471bL = -90.0f;
        }
        boolean z4 = true;
        boolean z5 = c.f1479bT;
        c.f1479bT = true;
        c.f1482bW = false;
        c.f1483bX = false;
        if (!z3) {
            c.f1483bX = true;
        }
        c.f1478bS = false;
        c.f1480bU = false;
        c.f1481bV = false;
        if (z || z2) {
            c.f1480bU = z2;
            c.f1481bV = z;
            z4 = false;
        } else {
            c.f1478bS = true;
        }
        if (!z4) {
            c.f5842dH = f;
            c.f5843dI = f2;
        } else {
            c.f5842dH = u.f5547cd + f;
            c.f5843dI = u.f5548ce + f2;
        }
        float f7 = c.f1474bO * 2.0f * 0.8f;
        if (c instanceof AbstractC0515r) {
            AbstractC0515r rVar = (AbstractC0515r) c;
            if (rVar.f3387D != null) {
                float cn = rVar.f3753dM * rVar.mo2831cn();
                if (cn > f7) {
                    f7 = cn;
                }
            }
        }
        float f8 = 1.0f;
        if (f7 < f5) {
            f8 = f5 / f7;
        }
        if (f7 > f6) {
            f8 = f6 / f7;
        }
        u.f5514bw.mo125j();
        if (z4) {
        }
        if (f8 != 1.0f) {
            u.f5514bw.mo198a(f8, f8, f, f2);
        }
        if (f8 < 1.0f) {
            f1641af = true;
        } else {
            f1641af = false;
        }
        c.mo395d(0.0f);
        c.mo396c(0.0f);
        c.mo403a(0.0f, false);
        u.f5514bw.mo124k();
        c.f5844dJ = 0.0f;
        if (!bw) {
            c.f1471bL = 0.0f;
        } else {
            c.f1471bL = -90.0f;
        }
        if (c instanceof AbstractC0515r) {
            AbstractC0515r rVar2 = (AbstractC0515r) c;
            rVar2.m2162j(0.0f);
            rVar2.mo2310a(1);
        }
        c.f1480bU = false;
        c.f1481bV = false;
        c.f1479bT = z5;
        c.f1478bS = false;
    }

    /* renamed from: b */
    public int m3268b(int i) {
        int c = mo2769c();
        if (i >= 2) {
            c += mo3264c(2);
        }
        if (i >= 3) {
            c += mo3264c(2);
        }
        return c;
    }

    /* renamed from: c */
    public int mo3264c(int i) {
        return 0;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: u */
    public C0363g mo2735u() {
        int c = mo2769c();
        if (c == 0) {
            return C0363g.f2422a;
        }
        if (this.f1642ag == null || this.f1642ag.m2942a() != c) {
            this.f1642ag = C0363g.m2941a(c);
        }
        return this.f1642ag;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: d */
    public C0363g mo2764d(int i) {
        return C0363g.m2941a(m3268b(i));
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: v */
    public String mo2734v() {
        return name();
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: w */
    public boolean mo2733w() {
        return false;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: x */
    public C0365i mo2732x() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: y */
    public boolean mo2731y() {
        return true;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: z */
    public C0748e mo2730z() {
        return null;
    }

    @Override // com.corrodinggames.rts.game.units.AbstractC0268al
    /* renamed from: a */
    public int mo2796a(AbstractC0210af afVar) {
        return 0;
    }

    /* renamed from: A */
    public boolean mo3263A() {
        return false;
    }
}
