package com.corrodinggames.rts.p008a;

import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.corrodinggames.rts.a.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/h.class */
public class ActivityC0088h extends ActivityC0066b {
    @Override // android.app.Activity
    /* renamed from: b */
    public void mo3909b() {
        super.mo3909b();
        C0067c.m3961a(this, true);
    }

    /* renamed from: j */
    public static String[] m3935j() {
        String[] a = C0596a.m1892a("/SD/rustedWarfare/saves/", false);
        if (a == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : a) {
            if (!str.endsWith(".map") && !str.endsWith(".tmp")) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList, new C0089i());
        return (String[]) arrayList.toArray(new String[0]);
    }

    @Override // android.app.Activity, android.view.View.OnCreateContextMenuListener
    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.setHeaderTitle(((Button) view).getText());
        contextMenu.add(0, view.getId(), 0, "Share");
        contextMenu.add(1, view.getId(), 0, "Rename");
        contextMenu.add(2, view.getId(), 0, "Delete");
    }
}
