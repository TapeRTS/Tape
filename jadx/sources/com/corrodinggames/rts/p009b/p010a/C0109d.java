package com.corrodinggames.rts.p009b.p010a;

import com.corrodinggames.rts.game.units.custom.C0324at;
import com.corrodinggames.rts.game.units.custom.C0368l;
import com.corrodinggames.rts.game.units.custom.p022e.C0357b;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.C0586bj;
import com.corrodinggames.rts.gameFramework.C0654f;
import com.corrodinggames.rts.gameFramework.utility.C0809ab;
import com.corrodinggames.rts.gameFramework.utility.C0812ae;
import java.io.File;
import java.io.IOException;
import java.util.Random;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.b.a.d */
/* loaded from: game-lib.jar:com/corrodinggames/rts/b/a/d.class */
public class C0109d extends AbstractC0113h {

    /* renamed from: a */
    int f486a = 1;

    /* renamed from: a */
    public void m3896a() {
        AbstractC0789l.m670d("separator regex test");
        "first".split(Pattern.quote(File.separator));
        C0114i.m3887a("first\\second".split(Pattern.quote("\\"))[0], "first");
        C0114i.m3887a("first/second".split(Pattern.quote("/"))[0], "first");
        AbstractC0789l.m670d("Test for dis sq ranges");
        C0114i.m3886a(50 < 850000 * 850000);
        C0114i.m3886a(50.0f < ((float) (850000 * 850000)));
        C0114i.m3886a(50 < 8500000 * 8500000);
        C0114i.m3886a(50.0f < ((float) (8500000 * 8500000)));
        Random random = new Random();
        float[] fArr = new float[10000];
        for (int i = 1; i < 5; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < fArr.length; i3++) {
                fArr[i3] = random.nextFloat() * 50.0f;
            }
            long a = C0586bj.m1919a();
            for (int i4 = 0; i4 < 1000; i4++) {
                for (float f : fArr) {
                    i2 += C0654f.m1515a((int) f);
                }
            }
            AbstractC0789l.m670d("sum:" + i2);
            AbstractC0789l.m670d("fastSquareRootInt took:" + C0586bj.m1918a(C0586bj.m1917a(a)));
            for (int i5 = 0; i5 < fArr.length; i5++) {
                fArr[i5] = random.nextFloat() * 50.0f;
            }
            long a2 = C0586bj.m1919a();
            int i6 = 0;
            for (int i7 = 0; i7 < 1000; i7++) {
                for (float f2 : fArr) {
                    i6 = (int) (i6 + C0654f.m1523a((int) f2));
                }
            }
            AbstractC0789l.m670d("sum:" + i6);
            AbstractC0789l.m670d("squareRoot took:" + C0586bj.m1918a(C0586bj.m1917a(a2)));
        }
        AbstractC0789l.m670d("CommonUtils.fastSplit");
        String[] b = C0654f.m1464b("testA|testB", '|');
        C0114i.m3889a(b.length, 2);
        C0114i.m3887a(b[0], "testA");
        C0114i.m3887a(b[1], "testB");
        String[] b2 = C0654f.m1464b("test|", '|');
        C0114i.m3889a(b2.length, "test|".split("\\|").length);
        C0114i.m3887a(b2[0], "test");
        String[] b3 = C0654f.m1464b("|test", '|');
        C0114i.m3889a(b3.length, 2);
        C0114i.m3887a(b3[0], "");
        C0114i.m3887a(b3[1], "test");
        C0114i.m3889a(C0654f.m1464b("|", '|').length, 0);
        AbstractC0789l.m670d("VariableReplacement");
        C0357b bVar = new C0357b();
        bVar.f2397b.m2949a("a", "5");
        bVar.f2397b.m2949a("b", "10");
        bVar.f2397b.m2949a("abc_foo", "7");
        C0368l lVar = C0368l.f2484b;
        try {
            C0809ab abVar = new C0809ab("assets/" + lVar.f2506x);
            try {
                C0114i.m3887a(bVar.m2963a(lVar, abVar, "core", "123"), "123");
                C0114i.m3887a(bVar.m2963a(lVar, abVar, "core", "1+1"), "2");
                C0114i.m3887a(bVar.m2963a(lVar, abVar, "core", "(1+1)*2"), "4");
                C0114i.m3887a(bVar.m2963a(lVar, abVar, "core", "a+b"), "15");
                C0114i.m3887a(bVar.m2963a(lVar, abVar, "core", "a+a+abc_foo"), "17");
                C0114i.m3887a(bVar.m2963a(lVar, abVar, "core", "(2+2)*(2+2)"), "16");
                C0114i.m3887a(bVar.m2963a(lVar, abVar, "core", "10/5"), "2");
                C0114i.m3887a(bVar.m2963a(lVar, abVar, "core", "10-5"), "5");
                C0114i.m3885b(bVar.m2963a(lVar, abVar, "core", "cos(60)"), "0.5");
                C0114i.m3885b(bVar.m2963a(lVar, abVar, "core", "sin(b+20+(2-2)+(5*0))"), "0.5");
                AbstractC0789l.m670d("PassthroughZipReader");
                C0114i.m3887a(C0812ae.m539g("/first/second/zip.rwmod/test1/test2"), "test1/test2");
                C0114i.m3887a(C0812ae.m539g("\\first\\second\\zip.rwmod\\test1\\test2"), "test1/test2");
            } catch (C0324at e) {
                throw new RuntimeException(e);
            }
        } catch (IOException e2) {
            throw new RuntimeException(e2);
        }
    }
}
