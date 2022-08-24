package com.corrodinggames.rts.appFramework;

import android.app.Activity;
import android.view.ContextMenu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import java.util.ArrayList;
import java.util.Collections;

/* renamed from: com.corrodinggames.rts.appFramework.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/appFramework/q.class */
public class ActivityC0131q extends ActivityC0089b {

    /* renamed from: c */
    String[] f541c;

    /* renamed from: b */
    public void mo6168b() {
        super.mo6168b();
        C0090c.m6218a((Activity) this, true);
    }

    /* renamed from: l */
    public static String[] m6138l() {
        String[] m2441g = C0750a.m2441g("/SD/rustedWarfare/replays/");
        if (m2441g == null) {
            GameEngine.PrintLog("failed to find replay folder");
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (String str : m2441g) {
            if (!str.endsWith(".map")) {
                arrayList.add(str);
            }
        }
        Collections.sort(arrayList, new C0132r());
        return (String[]) arrayList.toArray(new String[0]);
    }

    public void onCreateContextMenu(ContextMenu contextMenu, View view, ContextMenu.ContextMenuInfo contextMenuInfo) {
        super.onCreateContextMenu(contextMenu, view, contextMenuInfo);
        contextMenu.setHeaderTitle(((Button) view).getText());
        contextMenu.add(0, view.getId(), 0, "Share");
        contextMenu.add(1, view.getId(), 0, "Rename");
        contextMenu.add(2, view.getId(), 0, "Delete");
        if (this.f541c != null && this.f541c.length > 0) {
            MenuItem add = contextMenu.add(3, view.getId(), 0, "Storage: " + C0750a.m2435m(this.f541c[view.getId()]));
            if (add != null) {
                add.setEnabled(false);
            }
        }
    }
}
