package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.game.units.custom.p021e.C0428a;
import com.corrodinggames.rts.game.units.custom.p021e.EnumC0435b;
import com.corrodinggames.rts.game.units.custom.p023f.C0443b;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0753d;
import com.corrodinggames.rts.gameFramework.p036e.C0754e;
import com.corrodinggames.rts.gameFramework.p040h.C0823a;
import com.corrodinggames.rts.gameFramework.utility.C1072ab;
import com.corrodinggames.rts.gameFramework.utility.C1077ag;
import com.corrodinggames.rts.gameFramework.utility.C1098j;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Random;
import java.util.regex.Pattern;

/* renamed from: com.corrodinggames.rts.a.a.e */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/e.class */
public class C0076e extends AbstractC0083l {

    /* renamed from: a */
    int f393a = 1;

    /* renamed from: a */
    public void m6249a() {
        GameEngine.PrintLog("separator regex test");
        "first".split(Pattern.quote(File.separator));
        C0085n.m6229a("first\\second".split(Pattern.quote("\\"))[0], "first");
        C0085n.m6229a("first/second".split(Pattern.quote("/"))[0], "first");
        GameEngine.PrintLog("Test for dis sq ranges");
        C0085n.m6228a(50 < 850000 * 850000);
        C0085n.m6228a(50.0f < ((float) (850000 * 850000)));
        C0085n.m6228a(50 < 8500000 * 8500000);
        C0085n.m6228a(50.0f < ((float) (8500000 * 8500000)));
        Random random = new Random();
        float[] fArr = new float[10000];
        for (int i = 1; i < 5; i++) {
            int i2 = 0;
            for (int i3 = 0; i3 < fArr.length; i3++) {
                fArr[i3] = random.nextFloat() * 50.0f;
            }
            long m2610a = C0727bl.m2610a();
            for (int i4 = 0; i4 < 1000; i4++) {
                for (float f : fArr) {
                    i2 += C0758f.m2358a((int) f);
                }
            }
            GameEngine.PrintLog("sum:" + i2);
            GameEngine.PrintLog("fastSquareRootInt took:" + C0727bl.m2609a(C0727bl.m2608a(m2610a)));
            for (int i5 = 0; i5 < fArr.length; i5++) {
                fArr[i5] = random.nextFloat() * 50.0f;
            }
            long m2610a2 = C0727bl.m2610a();
            int i6 = 0;
            for (int i7 = 0; i7 < 1000; i7++) {
                for (float f2 : fArr) {
                    i6 = (int) (i6 + C0758f.m2366a((int) f2));
                }
            }
            GameEngine.PrintLog("sum:" + i6);
            GameEngine.PrintLog("squareRoot took:" + C0727bl.m2609a(C0727bl.m2608a(m2610a2)));
        }
        GameEngine.PrintLog("CommonUtils.fastSplit");
        String[] m2284c = C0758f.m2284c("testA|testB", '|');
        C0085n.m6231a(m2284c.length, 2);
        C0085n.m6229a(m2284c[0], "testA");
        C0085n.m6229a(m2284c[1], "testB");
        String[] m2284c2 = C0758f.m2284c("test|", '|');
        C0085n.m6231a(m2284c2.length, "test|".split("\\|").length);
        C0085n.m6229a(m2284c2[0], "test");
        String[] m2284c3 = C0758f.m2284c("|test", '|');
        C0085n.m6231a(m2284c3.length, 2);
        C0085n.m6229a(m2284c3[0], VariableScope.nullOrMissingString);
        C0085n.m6229a(m2284c3[1], "test");
        C0085n.m6231a(C0758f.m2284c("|", '|').length, 0);
        GameEngine.PrintLog("VariableReplacement");
        C0443b c0443b = new C0443b();
        c0443b.f2825b.m4417a("a", "5");
        c0443b.f2825b.m4417a("b", "10");
        c0443b.f2825b.m4417a("abc_foo", "7");
        C0453l c0453l = C0453l.f2901b;
        try {
            C1072ab c1072ab = new C1072ab("assets/" + c0453l.f2912C);
            try {
                C0085n.m6229a(c0443b.m4430a(c0453l, c1072ab, "core", "123"), "123");
                C0085n.m6229a(c0443b.m4430a(c0453l, c1072ab, "core", "1+1"), "2");
                C0085n.m6229a(c0443b.m4430a(c0453l, c1072ab, "core", "(1+1)*2"), "4");
                C0085n.m6229a(c0443b.m4430a(c0453l, c1072ab, "core", "a+b"), "15");
                C0085n.m6229a(c0443b.m4430a(c0453l, c1072ab, "core", "a+a+abc_foo"), "17");
                C0085n.m6229a(c0443b.m4430a(c0453l, c1072ab, "core", "(2+2)*(2+2)"), "16");
                C0085n.m6229a(c0443b.m4430a(c0453l, c1072ab, "core", "10/5"), "2");
                C0085n.m6229a(c0443b.m4430a(c0453l, c1072ab, "core", "10-5"), "5");
                C0085n.m6225c(c0443b.m4430a(c0453l, c1072ab, "core", "cos(60)"), "0.5");
                C0085n.m6225c(c0443b.m4430a(c0453l, c1072ab, "core", "sin(b+20+(2-2)+(5*0))"), "0.5");
                GameEngine.PrintLog("PassthroughZipReader");
                C0085n.m6229a(C1077ag.m605l("/first/second/zip.rwmod/test1/test2"), "test1/test2");
                C0085n.m6229a(C1077ag.m605l("\\first\\second\\zip.rwmod\\test1\\test2"), "test1/test2");
                m6248a("A", "B");
                m6248a("AA=11", "BB=22");
                m6248a("AA='11'", "BB='22'");
                m6248a("AA=(11)", "BB=22");
                m6248a("(AA)=(11)", "BB=22");
                m6248a("(AA)=('11')", "BB=22");
                m6248a("(AA)=('11')", "BB=((22))");
                m6248a("(A,A)=('1,1')", "BB=((2,2))");
                m6248a("(A,A)=('1,,1')", "BB=((2,2))");
                GameEngine.PrintLog("splitWithEscaping");
                m6245a(C0758f.m2274d("hello world", ' '), "hello", "world");
                m6246a(C0758f.m2274d("hello world", 'X'), "hello world");
                m6245a(C0758f.m2274d("hello,world", ','), "hello", "world");
                m6245a(C0758f.m2274d("he\\,llo,world", ','), "he,llo", "world");
                m6246a(VariableScope.nullOrMissingString.split(" "), VariableScope.nullOrMissingString);
                m6246a(C0758f.m2274d(VariableScope.nullOrMissingString, ' '), VariableScope.nullOrMissingString);
                m6245a(C0758f.m2274d("hello\\\\,World", ','), "hello\\", "World");
                m6245a(C0758f.m2274d("Hello\\A,world", ','), "HelloA", "world");
                m6246a(C0758f.m2274d("h\\ello\\,world", ','), "hello,world");
                m6245a(C0758f.m2274d("h\\ello\\,w,orld", ','), "hello,w", "orld");
                m6245a(C0758f.m2274d("h\\ello\\,w,orld", ','), "hello,w", "orld");
                C0085n.m6229a(C0758f.m2319a(new String[]{"Hello"}), "Hello");
                C0085n.m6229a(C0758f.m2319a(new String[]{"Hello", "World"}), "Hello,World");
                C0085n.m6229a(C0758f.m2319a(new String[]{"Hel,lo", "World"}), "Hel\\,lo,World");
                C0085n.m6229a(C0758f.m2319a(new String[]{"Hel,lo,", "Wor,ld"}), "Hel\\,lo\\,,Wor\\,ld");
                C0085n.m6229a(C0758f.m2319a(new String[]{"Hel\\,lo,", "Wor,ld"}), "Hel\\\\\\,lo\\,,Wor\\,ld");
                C0085n.m6229a(C0758f.m2319a(new String[]{"H\\el\\,lo,", "Wor,ld"}), "H\\\\el\\\\\\,lo\\,,Wor\\,ld");
                GameEngine.PrintLog("FileLoaderBackend");
                C0753d c0753d = new C0753d("/tmp/rustedWarfareTests/", "test1");
                c0753d.f4867a = "fileLoader1: ";
                c0753d.f4868b = true;
                C0753d c0753d2 = new C0753d("/tmp/rustedWarfareTestsSec2/", "test2");
                c0753d2.f4867a = "fileLoader2: ";
                c0753d2.f4868b = true;
                C0754e c0754e = new C0754e(c0753d, "primary-PATH/", c0753d2, "[ALT-PATH]/");
                c0754e.f4867a = "mergedFileLoader: ";
                c0754e.f4868b = true;
                C0085n.m6227b(c0753d.m2419f("/SD/rustedWarfare/"), "/tmp/rustedWarfareTests/");
                C0085n.m6227b(c0753d.m2419f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/mods/maps/coolMap.tmx");
                C0085n.m6227b(c0753d.m2419f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/mods/maps/coolMap.tmx");
                C0085n.m6227b(c0753d.m2419f("units/test.ini"), "assets/units/test.ini");
                GameEngine.PrintLog("FileLoaderBackend - merged");
                C0085n.m6227b(c0754e.m2398f("/SD/rustedWarfare/"), "/tmp/rustedWarfareTests/");
                C0085n.m6227b(c0754e.m2398f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/mods/maps/coolMap.tmx");
                GameEngine.PrintLog("FileLoaderBackend - android fake");
                boolean z = GameEngine.f6199aU;
                GameEngine.f6199aU = false;
                try {
                    C0085n.m6227b(c0753d.m2419f("/SD/rustedWarfare/"), "/tmp/rustedWarfareTests/");
                    C0085n.m6227b(c0753d.m2419f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/maps/coolMap.tmx");
                    C0085n.m6227b(c0753d.m2419f("/SD/rustedWarfare/maps/coolMap.tmx"), "/tmp/rustedWarfareTests/maps/coolMap.tmx");
                    C0085n.m6227b(c0753d.m2419f("units/test.ini"), "units/test.ini");
                    GameEngine.f6199aU = z;
                    if (1 == 0) {
                        return;
                    }
                    GameEngine.PrintLog("FileLoaderBackend - real file tests");
                    File file = new File(c0753d.m2419f("/SD/rustedWarfare/testDir"));
                    file.mkdirs();
                    new File(c0753d2.m2419f("/SD/rustedWarfare/testDir")).mkdirs();
                    try {
                        try {
                            File file2 = new File(c0753d.m2419f("/SD/rustedWarfare/testDir/map1.tmx"));
                            file2.createNewFile();
                            FileWriter fileWriter = new FileWriter(file2);
                            fileWriter.write("map1");
                            fileWriter.close();
                            new File(c0753d.m2419f("/SD/rustedWarfare/testDir/map2.tmx")).createNewFile();
                            File file3 = new File(c0753d2.m2419f("/SD/rustedWarfare/testDir/map3.tmx"));
                            file3.createNewFile();
                            FileWriter fileWriter2 = new FileWriter(file3);
                            fileWriter2.write("map3");
                            fileWriter2.close();
                            String[] a = c0753d.mo2388a("/SD/rustedWarfare/testDir", false);
                            C0085n.m6231a(a.length, 2);
                            C0085n.m6227b(a[0], "map1.tmx");
                            C0085n.m6227b(a[1], "map2.tmx");
                            String[] mo2388a = c0754e.mo2388a("/SD/rustedWarfare/testDir", false);
                            C0085n.m6231a(mo2388a.length, 3);
                            C0085n.m6227b(mo2388a[0], "primary-PATH/map1.tmx");
                            C0085n.m6227b(mo2388a[1], "primary-PATH/map2.tmx");
                            C0085n.m6227b(mo2388a[2], "[ALT-PATH]/map3.tmx");
                            String str = mo2388a[2];
                            C1098j m2394k = c0754e.m2394k("/SD/rustedWarfare/testDir/" + str);
                            if (m2394k == null) {
                                throw new RuntimeException("Null for: /SD/rustedWarfare/testDir/" + str);
                            }
                            C0085n.m6227b(C0758f.m2302b(m2394k), "map3");
                            GameEngine.PrintLog("FileLoaderBackend - clean up");
                            for (String str2 : file.list()) {
                                new File(file.getPath(), str2).delete();
                            }
                            file.delete();
                            GameEngine.PrintLog("isSameOrHigherVersion..");
                            m6247a("v1.13", "v1.14", true);
                            m6247a("v1.13", "v2.14", true);
                            m6247a("v1.13", "v2.11", true);
                            m6247a("v1.13", "v1.13p5", false);
                            m6247a("v1.13", "v1.13.2", true);
                            m6247a("v1.13.2", "v1.13", false);
                            m6247a("v1.13", "v1.13b", true);
                            m6247a("v1.13", "v1.13.2p6", true);
                            m6247a("v1.13", "v1.14.2p6", true);
                            m6247a("v1.13p9", "v1.14.2p6", true);
                            m6247a("v1.13p9", "v1.14p6", true);
                            m6247a("v1.14p3", "v1.14p6", true);
                            m6247a("v1.14p3", "v1.14p6b", true);
                            m6247a("v1.14p8", "v1.14p3", false);
                            m6247a("v1", "v2", true);
                            m6247a("v1.5", "v2", true);
                            m6247a("v2", "v1.15", false);
                            m6247a("v2.0.5", "v1.15", false);
                            m6247a("v1.15", "v2.0.5", true);
                            m6247a("v1.15.6", "v2.0.5", true);
                            m6247a("v1.15.6", "v1.16.5", true);
                            m6247a("v1.13", "v1.13.2p5", true);
                            m6247a("v1.14", "v1.14p3", false);
                            m6247a("v1.14b", "v1.14p3", false);
                            m6247a("v1.14.2", "v1.14p3", false);
                            m6247a("v1.14.2b", "v1.14p3", false);
                            try {
                                C0823a.m1868a("v1.11p1");
                                C0085n.m6229a(C0428a.m4507a("10000", EnumC0435b.none), "10000");
                                C0085n.m6229a(C0428a.m4507a(VariableScope.nullOrMissingString, EnumC0435b.space), VariableScope.nullOrMissingString);
                                C0085n.m6229a(C0428a.m4507a("1", EnumC0435b.comma), "1");
                                C0085n.m6229a(C0428a.m4507a("10", EnumC0435b.comma), "10");
                                C0085n.m6229a(C0428a.m4507a("100", EnumC0435b.comma), "100");
                                C0085n.m6229a(C0428a.m4507a("1000", EnumC0435b.comma), "1,000");
                                C0085n.m6229a(C0428a.m4507a(".", EnumC0435b.comma), ".");
                                C0085n.m6229a(C0428a.m4507a(".2", EnumC0435b.comma), ".2");
                                C0085n.m6229a(C0428a.m4507a(".22", EnumC0435b.comma), ".22");
                                C0085n.m6229a(C0428a.m4507a(".223", EnumC0435b.comma), ".223");
                                C0085n.m6229a(C0428a.m4507a(".2234", EnumC0435b.comma), ".2234");
                                C0085n.m6229a(C0428a.m4507a("100.2234", EnumC0435b.comma), "100.2234");
                                C0085n.m6229a(C0428a.m4507a("1000.2234", EnumC0435b.comma), "1,000.2234");
                                C0085n.m6229a(C0428a.m4507a("10000", EnumC0435b.comma), "10,000");
                                C0085n.m6229a(C0428a.m4507a("9800000", EnumC0435b.comma), "9,800,000");
                                C0085n.m6229a(C0428a.m4507a("9800000.67", EnumC0435b.comma), "9,800,000.67");
                                C0085n.m6229a(C0428a.m4507a("98000000.67", EnumC0435b.comma), "98,000,000.67");
                                C0085n.m6229a(C0428a.m4507a("980000000.67", EnumC0435b.comma), "980,000,000.67");
                                C0085n.m6229a(C0428a.m4507a("9800000001.67", EnumC0435b.comma), "9,800,000,001.67");
                                C0085n.m6229a(C0428a.m4507a("9800000001.6", EnumC0435b.comma), "9,800,000,001.6");
                                C0085n.m6229a(C0428a.m4507a("9800000001.", EnumC0435b.comma), "9,800,000,001.");
                                C0085n.m6229a(C0428a.m4507a("9800000001", EnumC0435b.comma), "9,800,000,001");
                                C0085n.m6229a(C0428a.m4510a(9800000L, EnumC0435b.comma), "9,800,000");
                            } catch (C0412bm e) {
                                throw new RuntimeException(e);
                            }
                        } catch (IOException e2) {
                            throw new RuntimeException(e2);
                        }
                    } catch (Throwable th) {
                        GameEngine.PrintLog("FileLoaderBackend - clean up");
                        for (String str3 : file.list()) {
                            new File(file.getPath(), str3).delete();
                        }
                        file.delete();
                        throw th;
                    }
                } catch (Throwable th2) {
                    GameEngine.f6199aU = z;
                    throw th2;
                }
            } catch (C0412bm e3) {
                throw new RuntimeException(e3);
            }
        } catch (IOException e4) {
            throw new RuntimeException(e4);
        }
    }

    /* renamed from: a */
    public void m6248a(String str, String str2) {
        ArrayList m2323a = C0758f.m2323a(str + "," + str2, ",", false, false);
        C0085n.m6229a((String) m2323a.get(0), str);
        C0085n.m6229a((String) m2323a.get(1), str2);
    }

    /* renamed from: a */
    public void m6246a(String[] strArr, String str) {
        C0085n.m6231a(strArr.length, 1);
        C0085n.m6229a(strArr[0], str);
    }

    /* renamed from: a */
    public void m6245a(String[] strArr, String str, String str2) {
        C0085n.m6231a(strArr.length, 2);
        C0085n.m6229a(strArr[0], str);
        C0085n.m6229a(strArr[1], str2);
    }

    /* renamed from: a */
    public void m6247a(String str, String str2, boolean z) {
        boolean z2;
        try {
            C0823a.m1865a(str, str2);
            z2 = true;
        } catch (C0412bm e) {
            if (z) {
                GameEngine.m1139b(e.getMessage());
            }
            z2 = false;
        }
        if (z2 != z) {
            throw new RuntimeException("isSameOrHigherVersion(" + str + "," + str2 + "): Asset failed got: " + z2);
        }
    }
}
