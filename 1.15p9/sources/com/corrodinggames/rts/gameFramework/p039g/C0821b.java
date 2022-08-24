package com.corrodinggames.rts.gameFramework.p039g;

import com.corrodinggames.rts.gameFramework.GameEngine;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Vector;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: com.corrodinggames.rts.gameFramework.g.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/g/b.class */
public class C0821b extends ResourceBundle {

    /* renamed from: a */
    ResourceBundle f5398a;

    /* renamed from: b */
    ResourceBundle f5399b;

    public C0821b(ResourceBundle resourceBundle, ResourceBundle resourceBundle2) {
        this.f5398a = resourceBundle;
        this.f5399b = resourceBundle2;
    }

    public Enumeration getKeys() {
        GameEngine.PrintLog("MultipleResourceBundle: Slow get keys");
        Vector vector = new Vector();
        vector.addAll(Collections.list(this.f5398a.getKeys()));
        if (this.f5399b != null) {
            Iterator it = Collections.list(this.f5399b.getKeys()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!vector.contains(str)) {
                    vector.add(str);
                }
            }
        }
        return vector.elements();
    }

    protected Object handleGetObject(String str) {
        Object obj;
        try {
            obj = this.f5398a.getObject(str);
        } catch (MissingResourceException e) {
            obj = null;
        }
        if (obj == null && this.f5399b != null) {
            try {
                obj = this.f5399b.getObject(str);
            } catch (MissingResourceException e2) {
                obj = null;
            }
        }
        return obj;
    }
}
