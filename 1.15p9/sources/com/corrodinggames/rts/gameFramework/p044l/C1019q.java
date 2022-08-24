package com.corrodinggames.rts.gameFramework.p044l;

import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.RectF;
import com.corrodinggames.rts.gameFramework.utility.C1101m;

/* renamed from: com.corrodinggames.rts.gameFramework.l.q */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/l/q.class */
public final class C1019q {

    /* renamed from: a */
    public final C1101m f6541a = new C1101m();

    /* renamed from: b */
    public int f6542b;

    /* renamed from: c */
    public Class f6543c;

    public C1019q(Class cls) {
        this.f6543c = cls;
    }

    /* renamed from: a */
    public final Rect m941a(Rect rect) {
        if (this.f6542b >= this.f6541a.f6888a) {
            this.f6541a.add(new Rect());
        }
        Rect rect2 = (Rect) this.f6541a.m552a(this.f6542b);
        rect2.f231b = rect.f231b;
        rect2.f233d = rect.f233d;
        rect2.f230a = rect.f230a;
        rect2.f232c = rect.f232c;
        this.f6542b++;
        return rect2;
    }

    /* renamed from: a */
    public final RectF m940a(RectF rectF) {
        if (this.f6542b >= this.f6541a.f6888a) {
            this.f6541a.add(new RectF());
        }
        RectF rectF2 = (RectF) this.f6541a.m552a(this.f6542b);
        rectF2.f235b = rectF.f235b;
        rectF2.f237d = rectF.f237d;
        rectF2.f234a = rectF.f234a;
        rectF2.f236c = rectF.f236c;
        this.f6542b++;
        return rectF2;
    }

    /* renamed from: a */
    public final Paint m942a(Paint paint) {
        if (paint == null) {
            return null;
        }
        if (this.f6542b >= this.f6541a.f6888a) {
            this.f6541a.add(new Paint());
        }
        Paint paint2 = (Paint) this.f6541a.m552a(this.f6542b);
        paint2.m6498a(paint);
        this.f6542b++;
        return paint2;
    }
}
