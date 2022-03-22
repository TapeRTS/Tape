package com.corrodinggames.rts.gameFramework.p035f;

import com.corrodinggames.rts.game.AbstractC0171m;
import com.corrodinggames.rts.game.units.custom.C0307ac;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import com.corrodinggames.rts.gameFramework.p042l.C0796a;
import java.util.ArrayList;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.a */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/a.class */
public class C0656a {

    /* renamed from: a */
    public C0657b f4607a = new C0657b();

    /* renamed from: b */
    Object f4608b = new Object();

    /* renamed from: c */
    ArrayList f4609c = new ArrayList();

    /* renamed from: d */
    ArrayList f4610d = new ArrayList();

    /* renamed from: a */
    public void m1409a() {
        m1392i();
        m1398d();
    }

    /* renamed from: b */
    public int m1402b() {
        int i = 0;
        Iterator it = this.f4609c.iterator();
        while (it.hasNext()) {
            C0657b bVar = (C0657b) it.next();
            if (!bVar.f4613c && !bVar.f4625o) {
                i++;
            }
        }
        return i;
    }

    /* renamed from: c */
    public void m1400c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        String str = "";
        Iterator it = this.f4609c.iterator();
        while (it.hasNext()) {
            C0657b bVar = (C0657b) it.next();
            String replace = bVar.f4611a.replace(",", " ").replace("|", " ");
            if (replace.length() > 15) {
                replace = replace.substring(12) + "...";
            }
            if (str.length() != 0) {
                str = str + ",";
            }
            str = str + replace + "|" + bVar.f4612b + "|" + (bVar.f4613c ? "disabled" : "enabled");
        }
        u.f5516by.modSettings = str;
    }

    /* renamed from: d */
    public void m1398d() {
        String[] split;
        boolean z;
        AbstractC0789l.m670d("Loading mod selection");
        for (String str : AbstractC0789l.m638u().f5516by.modSettings.split(",")) {
            String[] split2 = str.split("\\|");
            if (split2.length != 3) {
                AbstractC0789l.m670d("loadSelection: wrong count (" + split2.length + "):" + str);
            } else {
                String str2 = split2[0];
                String str3 = split2[1];
                String str4 = split2[2];
                if (str4.equals("enabled")) {
                    z = false;
                } else if (str4.equals("disabled")) {
                    z = true;
                } else {
                    AbstractC0789l.m670d("loadSelection: Unknown option:" + str);
                }
                C0657b a = m1408a(str3);
                if (a == null) {
                    AbstractC0789l.m670d("loadSelection: Did not find mod in settings:" + str2);
                } else {
                    a.f4613c = z;
                }
            }
        }
    }

    /* renamed from: a */
    public C0657b m1408a(String str) {
        Iterator it = this.f4609c.iterator();
        while (it.hasNext()) {
            C0657b bVar = (C0657b) it.next();
            if (bVar.f4612b.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: e */
    public void m1396e() {
        Iterator it = this.f4609c.iterator();
        while (it.hasNext()) {
            ((C0657b) it.next()).f4613c = true;
        }
    }

    /* renamed from: f */
    public int m1395f() {
        return this.f4609c.size();
    }

    /* renamed from: b */
    public C0657b m1401b(String str) {
        Iterator it = this.f4609c.iterator();
        while (it.hasNext()) {
            C0657b bVar = (C0657b) it.next();
            if (bVar.f4611a.equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: c */
    public C0657b m1399c(String str) {
        Iterator it = this.f4609c.iterator();
        while (it.hasNext()) {
            C0657b bVar = (C0657b) it.next();
            if (bVar.m1388a().equals(str)) {
                return bVar;
            }
        }
        return null;
    }

    /* renamed from: a */
    public C0657b m1406a(String str, String str2, String str3, boolean z, boolean z2, boolean z3) {
        C0657b a = m1408a(str3);
        if (a == null) {
            a = new C0657b();
            a.f4611a = str;
            a.f4612b = str3;
            a.f4616f = str2;
            a.m1372l();
            a.f4613c = !z;
        }
        a.f4615e = true;
        a.f4620j = z2;
        a.f4621k = z3;
        a.m1368p();
        synchronized (this.f4608b) {
            if (!this.f4609c.contains(a)) {
                ArrayList arrayList = new ArrayList();
                arrayList.addAll(this.f4609c);
                arrayList.add(a);
                this.f4609c = arrayList;
            }
        }
        return a;
    }

    /* renamed from: a */
    public void m1405a(String str, boolean z, boolean z2) {
        AbstractC0789l.m670d("loading mod custom units at:" + str);
        String[] e = C0596a.m1887e(str);
        if (e == null) {
            AbstractC0789l.m682b("getAllModList: ERROR");
            AbstractC0789l.m682b("getAllModList: Failed to load:" + str);
            return;
        }
        for (String str2 : e) {
            String str3 = str + "/" + str2;
            if (C0596a.m1888d(str3) || str2.endsWith(".ini")) {
                m1406a(str2, str3, C0654f.m1437e(str2), z, false, z2);
            }
        }
    }

    /* renamed from: g */
    public ArrayList m1394g() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f4609c.iterator();
        while (it.hasNext()) {
            C0657b bVar = (C0657b) it.next();
            if (bVar.m1373k()) {
                arrayList.addAll(bVar.m1369o());
            }
        }
        return arrayList;
    }

    /* renamed from: h */
    public ArrayList m1393h() {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f4609c.iterator();
        while (it.hasNext()) {
            C0657b bVar = (C0657b) it.next();
            if (bVar.m1373k()) {
                arrayList.add(bVar);
            }
        }
        return arrayList;
    }

    /* renamed from: i */
    public ArrayList m1392i() {
        C0796a a = C0796a.m632a();
        if (a != null) {
            a.mo240k();
        } else {
            AbstractC0789l.m670d("getAllModList: SteamEngine==null");
        }
        Iterator it = this.f4609c.iterator();
        while (it.hasNext()) {
            ((C0657b) it.next()).f4615e = false;
        }
        String i = C0307ac.m3112i();
        if (!C0596a.m1888d(i)) {
            AbstractC0789l.m670d("Modded Custom '" + i + "' directory not found");
        } else {
            m1405a(i, true, false);
        }
        String g = C0307ac.m3114g();
        if (!C0596a.m1888d(g)) {
            AbstractC0789l.m670d("Modded Custom '" + g + "' directory not found");
        } else {
            m1405a(g, false, true);
        }
        String h = C0307ac.m3113h();
        if (!C0596a.m1888d(h)) {
            AbstractC0789l.m670d("Modded Custom '" + h + "' directory not found");
        } else {
            m1405a(h, true, true);
        }
        AbstractC0789l.m670d("========= Mods ===========");
        AbstractC0789l.m670d("Number of mods:" + this.f4609c.size());
        Iterator it2 = this.f4609c.iterator();
        while (it2.hasNext()) {
            AbstractC0789l.m670d("Mod: '" + ((C0657b) it2.next()).m1388a());
        }
        AbstractC0789l.m670d("================================");
        AbstractC0789l u = AbstractC0789l.m638u();
        if (u.f5516by.lastModCount == -1) {
            AbstractC0789l.m670d("Disabling all new mods for first load");
            Iterator it3 = this.f4609c.iterator();
            while (it3.hasNext()) {
                ((C0657b) it3.next()).f4613c = true;
            }
            m1400c();
        }
        u.f5516by.lastModCount = this.f4609c.size();
        return this.f4609c;
    }

    /* renamed from: j */
    public void m1391j() {
        AbstractC0789l u = AbstractC0789l.m638u();
        u.mo679c();
        m1404a(false);
        u.mo641q();
    }

    /* renamed from: a */
    public void m1404a(boolean z) {
        AbstractC0789l.m638u();
        Iterator it = this.f4609c.iterator();
        while (it.hasNext()) {
            C0657b bVar = (C0657b) it.next();
            bVar.f4636z = null;
            bVar.f4637A = null;
            bVar.f4624n = false;
            bVar.f4625o = false;
            bVar.f4626p = 0;
            bVar.f4627q = 0;
            bVar.f4628r = 0;
            bVar.f4629s = 0;
            bVar.f4630t = 0;
        }
        m1392i();
        ArrayList arrayList = new ArrayList(C0368l.f2486d);
        C0307ac.m3115f();
        if (z) {
            int i = 0;
            Iterator it2 = arrayList.iterator();
            while (it2.hasNext()) {
                C0368l lVar = (C0368l) it2.next();
                if (lVar.f2510B != null && !lVar.f2510B.f4613c && lVar.f2510B.f4636z != null && C0368l.m2790a(lVar) == null) {
                    AbstractC0789l.m670d("Was missing: " + lVar.f2513E);
                    C0368l.f2486d.add(lVar);
                    i++;
                }
            }
            if (i > 0) {
                C0307ac.m3117d();
            }
        }
        C0368l.m2803A();
        AbstractC0171m.m3520K();
    }

    /* renamed from: k */
    public void m1390k() {
    }

    /* renamed from: a */
    public String[] m1403a(String[] strArr, String str) {
        String[] a;
        AbstractC0789l.m670d("addExtraMapsForPath: " + str);
        ArrayList arrayList = new ArrayList();
        if (strArr != null) {
            for (String str2 : strArr) {
                arrayList.add(str2);
            }
        }
        if (AbstractC0789l.m699aj() && "/SD/rusted_warfare_maps".equals(str) && (a = C0596a.m1892a("/SD/rustedWarfare/maps", true)) != null) {
            int length = a.length;
            for (int i = 0; i < length; i++) {
                arrayList.add("NEW_PATH|maps2/" + a[i]);
            }
        }
        Iterator it = m1397d(str).iterator();
        while (it.hasNext()) {
            C0658c cVar = (C0658c) it.next();
            arrayList.add("MOD|" + cVar.f4640c.f4612b + "/" + cVar.f4639b);
        }
        if (strArr == null && arrayList.size() == 0) {
            return null;
        }
        return (String[]) arrayList.toArray(new String[0]);
    }

    /* renamed from: d */
    public ArrayList m1397d(String str) {
        ArrayList arrayList = new ArrayList();
        Iterator it = this.f4610d.iterator();
        while (it.hasNext()) {
            C0658c cVar = (C0658c) it.next();
            boolean z = false;
            if (str.startsWith("mod/") && str.startsWith("mod/" + cVar.f4640c.f4612b)) {
                z = true;
            }
            if (!cVar.f4640c.f4613c && str.startsWith("/SD/rusted_warfare_maps")) {
                z = true;
            }
            if (z) {
                AbstractC0789l.m670d("Adding extra map:" + cVar.f4638a);
                arrayList.add(cVar);
            }
        }
        return arrayList;
    }

    /* renamed from: l */
    public void m1389l() {
        this.f4610d.clear();
    }

    /* renamed from: a */
    public void m1407a(String str, C0657b bVar) {
        C0658c cVar = new C0658c(this);
        cVar.f4638a = str;
        cVar.f4640c = bVar;
        if (bVar.f4616f == null) {
            AbstractC0789l.m719a("Skipping:" + str + " as mod sourceFolder is null");
            return;
        }
        String str2 = str;
        String str3 = bVar.f4616f;
        if (str2.startsWith(str3)) {
            str2 = str2.substring(str3.length());
        } else {
            AbstractC0789l.m719a("Mod path:" + bVar.f4616f + " not in map path:" + str2);
        }
        cVar.f4639b = str2;
        bVar.f4622l = true;
        bVar.f4627q++;
        this.f4610d.add(cVar);
    }
}
