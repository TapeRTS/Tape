package com.corrodinggames.rts.gameFramework.p037f;

import android.graphics.Paint;
import android.graphics.Rect;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p044l.BitmapOrTexture;
import com.corrodinggames.rts.gameFramework.p044l.C0930ag;
import com.corrodinggames.rts.gameFramework.utility.C1101m;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.gameFramework.f.u */
/* loaded from: game-lib.jar:com/corrodinggames/rts/gameFramework/f/u.class */
public class C0813u {

    /* renamed from: h */
    static Paint f5375h;

    /* renamed from: a */
    static C0930ag f5368a = new C0930ag();

    /* renamed from: b */
    static C0930ag f5369b = new C0930ag();

    /* renamed from: c */
    static C0930ag f5370c = new C0930ag();

    /* renamed from: f */
    static Paint f5373f = new Paint();

    /* renamed from: d */
    public Paint f5371d = f5368a;

    /* renamed from: e */
    public Paint f5372e = f5368a;

    /* renamed from: g */
    public Paint f5374g = this.f5371d;

    /* renamed from: i */
    C1101m f5376i = new C1101m();

    static {
        f5370c.m1053a(true);
        f5375h = new Paint();
        f5375h.m7242b(-65536);
        f5375h.m7260a(Paint.Style.STROKE);
    }

    /* renamed from: a */
    public void m1911a(Paint paint) {
        if (paint == null) {
            this.f5374g = this.f5371d;
        } else {
            this.f5374g = paint;
        }
    }

    /* renamed from: a */
    public void m1904a(boolean z) {
        if (z) {
            this.f5374g = this.f5372e;
        } else {
            this.f5374g = this.f5371d;
        }
    }

    /* renamed from: a */
    public String m1913a() {
        StringBuilder sb = new StringBuilder();
        Iterator it = this.f5376i.iterator();
        while (it.hasNext()) {
            C0814v c0814v = (C0814v) it.next();
            if (c0814v instanceof C0817y) {
                sb.append(((C0817y) c0814v).f5385d);
            }
        }
        return sb.toString();
    }

    /* renamed from: a */
    public void m1908a(String str) {
        if (this.f5376i.size() > 0) {
            int size = this.f5376i.size() - 1;
            C0814v c0814v = (C0814v) this.f5376i.get(size);
            if (c0814v instanceof C0817y) {
                C0817y c0817y = (C0817y) c0814v;
                String m2331a = CommonUtils.m2331a(c0817y.f5385d, str);
                if (!c0817y.f5385d.equals(m2331a)) {
                    this.f5376i.set(size, c0817y.mo7520b(m2331a));
                }
            }
        }
    }

    /* renamed from: b */
    public void m1903b() {
        this.f5376i.clear();
    }

    /* renamed from: a */
    public void m1910a(C0814v c0814v) {
        this.f5376i.add(c0814v);
    }

    /* renamed from: b */
    public void m1902b(String str) {
        if (this.f5374g != null && this.f5374g != this.f5371d) {
            m1905a(str, this.f5374g);
        } else {
            m1910a(new C0817y(this, str));
        }
    }

    /* renamed from: a */
    public void m1905a(String str, Paint paint) {
        m1910a(new C0815w(this, str, paint));
    }

    /* renamed from: a */
    public void m1907a(String str, int i) {
        if (this.f5374g != null && this.f5374g != this.f5371d) {
            m1910a(new C0815w(this, str, this.f5374g, i));
        } else {
            m1910a(new C0815w(this, str, null, i));
        }
    }

    /* renamed from: a */
    public void m1906a(String str, int i, boolean z) {
        Paint paint = this.f5371d;
        if (z) {
            paint = this.f5372e;
        }
        m1910a(new C0815w(this, str, paint, i));
    }

    /* renamed from: a */
    public void m1909a(BitmapOrTexture bitmapOrTexture, int i, int i2) {
        C0816x c0816x = new C0816x(this);
        c0816x.f5380a = bitmapOrTexture;
        float m2084a = C0795d.m2084a(bitmapOrTexture, i, i2);
        c0816x.f5382c = (int) (bitmapOrTexture.f6396p * m2084a);
        c0816x.f5383d = (int) (bitmapOrTexture.f6397q * m2084a);
        c0816x.f5381b = m2084a;
        this.f5376i.add(c0816x);
    }

    /* renamed from: c */
    public int m1901c() {
        return GameEngine.getInstance().graphics.mo901a("A", this.f5374g);
    }

    /* renamed from: a */
    public C0818z m1912a(int i, boolean z) {
        int lastIndexOf;
        GameEngine.getInstance();
        Rect rect = new Rect((-i) / 2, 0, i / 2, 10);
        C1101m c1101m = new C1101m();
        C0776aa c0776aa = new C0776aa();
        Paint paint = this.f5371d;
        int i2 = i - 5;
        Iterator it = this.f5376i.iterator();
        while (it.hasNext()) {
            C0814v c0814v = (C0814v) it.next();
            if (c0776aa.f5053b >= i2 - 5) {
                if (c0776aa.f5052a.size() > 0) {
                    c1101m.add(c0776aa);
                }
                c0776aa = new C0776aa();
            }
            if (!(c0814v instanceof C0817y)) {
                c0776aa.m2131a(c0814v);
                c0776aa.f5053b += c0814v.mo1897a(this.f5371d);
            } else {
                C0817y c0817y = (C0817y) c0814v;
                String str = c0817y.f5385d;
                int i3 = 0;
                while (i3 < str.length()) {
                    if (str.charAt(i3) == '\n') {
                        i3++;
                        c1101m.add(c0776aa);
                        c0776aa = new C0776aa();
                    } else {
                        int m7256a = paint.m7256a((CharSequence) str, i3, str.length(), true, i2 - c0776aa.f5053b, (float[]) null);
                        if (m7256a == 0) {
                            break;
                        }
                        boolean z2 = true;
                        int indexOf = str.indexOf("\n", i3 + 1);
                        if (indexOf != -1 && indexOf < i3 + m7256a) {
                            m7256a = indexOf - i3;
                        } else {
                            if (i3 + m7256a < str.length() && (lastIndexOf = str.substring(i3, i3 + m7256a).lastIndexOf(" ")) != -1 && lastIndexOf != 0) {
                                m7256a = lastIndexOf;
                            }
                            if (i3 + m7256a == str.length()) {
                                z2 = false;
                            }
                        }
                        String substring = str.substring(i3, i3 + m7256a);
                        if (CommonUtils.m2285c(substring, "\\n")) {
                            substring = substring.replaceAll("(\\n)", VariableScope.nullOrMissingString);
                        }
                        C0817y mo7520b = c0817y.mo7520b(substring);
                        c0776aa.m2131a(mo7520b);
                        c0776aa.f5053b += mo7520b.mo1897a(this.f5371d);
                        i3 += m7256a;
                        if (i3 < str.length() && str.charAt(i3) == '\n') {
                            i3++;
                        }
                        if (z2 || c0776aa.f5053b >= i2 - 5) {
                            if (c0776aa.f5052a.size() > 0) {
                                c1101m.add(c0776aa);
                            }
                            c0776aa = new C0776aa();
                        }
                    }
                }
            }
        }
        if (c0776aa.f5052a.size() > 0) {
            c1101m.add(c0776aa);
        }
        if (c1101m.size() > 0 && ((C0776aa) c1101m.get(c1101m.size() - 1)).f5052a.size() == 0) {
            c1101m.remove(c1101m.size() - 1);
        }
        rect.f233d = rect.f231b + (c1101m.size() * C0795d.m2085a(paint));
        if (z) {
            float m7201d = rect.m7201d();
            float f = 0.0f;
            Iterator it2 = c1101m.iterator();
            while (it2.hasNext()) {
                C0776aa c0776aa2 = (C0776aa) it2.next();
                if (c0776aa2.f5053b > f) {
                    f = c0776aa2.f5053b;
                }
            }
            float f2 = f;
            if (f2 < rect.m7206b()) {
                rect.f230a = (int) (m7201d - (f2 / 2.0f));
                rect.f232c = (int) (m7201d + (f2 / 2.0f));
            }
        }
        C0818z c0818z = new C0818z();
        c0818z.f5387a = c1101m;
        c0818z.f5388b = rect;
        c0818z.f5389c = this.f5371d;
        c0818z.f5390d = this.f5372e;
        return c0818z;
    }
}
