package com.corrodinggames.rts.p008a;

import android.view.ContextMenu;
import android.view.View;
import android.widget.Button;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p031c.C0596a;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.corrodinggames.rts.a.o */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/o.class */
public class ActivityC0100o extends ActivityC0066b {
    @Override // android.app.Activity
    /* renamed from: b */
    public void mo3909b() {
        super.mo3909b();
        C0067c.m3961a(this, true);
    }

    /* renamed from: j */
    public static String[] m3908j() {
        String[] e = C0596a.m1887e("/SD/rustedWarfare/replays/");
        if (e == null) {
            AbstractC0789l.m670d("failed to find replay folder");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : e) {
            if (!str.endsWith(".map")) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList, new C0101p());
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
