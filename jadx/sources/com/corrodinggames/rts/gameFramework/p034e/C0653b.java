package com.corrodinggames.rts.gameFramework.p034e;

import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import java.util.Collections;
import java.util.Enumeration;
import java.util.Iterator;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.util.Vector;

/* renamed from: com.corrodinggames.rts.gameFramework.e.b */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/e/b.class */
class C0653b extends ResourceBundle {

    /* renamed from: a */
    ResourceBundle f4584a;

    /* renamed from: b */
    ResourceBundle f4585b;

    public C0653b(ResourceBundle resourceBundle, ResourceBundle resourceBundle2) {
        this.f4584a = resourceBundle;
        this.f4585b = resourceBundle2;
    }

    @Override // java.util.ResourceBundle
    public Enumeration getKeys() {
        AbstractC0789l.m670d("MultipleResourceBundle: Slow get keys");
        Vector vector = new Vector();
        vector.addAll(Collections.list(this.f4584a.getKeys()));
        if (this.f4585b != null) {
            Iterator it = Collections.list(this.f4585b.getKeys()).iterator();
            while (it.hasNext()) {
                String str = (String) it.next();
                if (!vector.contains(str)) {
                    vector.add(str);
                }
            }
        }
        return vector.elements();
    }

    @Override // java.util.ResourceBundle
    protected Object handleGetObject(String str) {
        Object obj;
        try {
            obj = this.f4584a.getObject(str);
        } catch (MissingResourceException e) {
            obj = null;
        }
        if (obj == null && this.f4585b != null) {
            try {
                obj = this.f4585b.getObject(str);
            } catch (MissingResourceException e2) {
                obj = null;
            }
        }
        return obj;
    }
}
