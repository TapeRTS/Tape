package com.corrodinggames.rts.gameFramework.utility.p048a;

import android.content.Context;
import android.net.Uri;
import com.corrodinggames.rts.appFramework.C0090c;
import com.corrodinggames.rts.appFramework.common.SAFInterface;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.utility.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/utility/a/c.class */
public class C1070c {

    /* renamed from: a */
    String f6802a;

    /* renamed from: b */
    Uri f6803b;

    /* renamed from: c */
    boolean f6804c;

    /* renamed from: d */
    HashMap f6805d;

    /* renamed from: e */
    HashMap f6806e;

    /* renamed from: f */
    boolean f6807f;

    /* renamed from: g */
    int f6808g;

    /* renamed from: h */
    final /* synthetic */ C1069b f6809h;

    public C1070c(C1069b c1069b, String str, Uri uri, boolean z) {
        this.f6809h = c1069b;
        this.f6802a = str;
        this.f6803b = uri;
        this.f6804c = z;
    }

    /* renamed from: a */
    public HashMap m719a() {
        if (this.f6805d == null || this.f6807f || this.f6808g != this.f6809h.f6801g) {
            synchronized (this) {
                if (this.f6805d == null || this.f6807f || this.f6808g != this.f6809h.f6801g) {
                    m718a(C0090c.m6223a());
                }
            }
        }
        return this.f6805d;
    }

    /* renamed from: a */
    public void m718a(Context context) {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        if (this.f6804c) {
            Iterator it = C1068a.f6792a.listWithDetails(context, this.f6803b).iterator();
            while (it.hasNext()) {
                SAFInterface.FileRow fileRow = (SAFInterface.FileRow) it.next();
                Uri childUri = C1068a.f6792a.getChildUri(this.f6803b, fileRow.id);
                String str = fileRow.name;
                boolean z = fileRow.isDirectory;
                if (str.contains("/")) {
                    C1068a.m743h("Name contains symbols: " + str);
                    str = str.replace("/", "_");
                }
                C1070c c1070c = new C1070c(this.f6809h, this.f6802a + "/" + str, childUri, z);
                hashMap.put(str, c1070c);
                String lowerCase = str.toLowerCase(Locale.ROOT);
                if (hashMap2.get(lowerCase) == null) {
                    hashMap2.put(lowerCase, c1070c);
                }
            }
        }
        this.f6805d = hashMap;
        this.f6806e = hashMap2;
        this.f6807f = false;
        this.f6808g = this.f6809h.f6801g;
    }
}
