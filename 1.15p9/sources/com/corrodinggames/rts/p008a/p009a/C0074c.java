package com.corrodinggames.rts.p008a.p009a;

import com.corrodinggames.rts.game.AbstractC0197n;
import com.corrodinggames.rts.game.units.AbstractC0244am;
import com.corrodinggames.rts.game.units.AbstractC0623y;
import com.corrodinggames.rts.game.units.custom.C0412bm;
import com.corrodinggames.rts.game.units.custom.C0448g;
import com.corrodinggames.rts.game.units.custom.C0451j;
import com.corrodinggames.rts.game.units.custom.C0453l;
import com.corrodinggames.rts.game.units.custom.logicBooleans.BooleanParseException;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBooleanLoader;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.C0727bl;
import com.corrodinggames.rts.gameFramework.C0758f;
import com.corrodinggames.rts.gameFramework.GameEngine;

/* renamed from: com.corrodinggames.rts.a.a.c */
/* loaded from: game-lib.jar:com/corrodinggames/rts/a/a/c.class */
public class C0074c extends AbstractC0083l {
    /* renamed from: a */
    public void m6264a() {
        GameEngine.PrintLog("Logic boolean tests");
        C0453l c0453l = C0453l.f2901b;
        m6262a(c0453l, "number numA");
        m6262a(c0453l, "number numB");
        AbstractC0244am m4127a = C0453l.m4127a(false, c0453l);
        AbstractC0623y m4127a2 = C0453l.m4127a(false, c0453l);
        m4127a2.m3119b(AbstractC0197n.f1370i);
        AbstractC0623y m4127a3 = C0453l.m4127a(false, c0453l);
        m4127a3.m3119b(AbstractC0197n.f1370i);
        m4127a3.f1631cs = 44.0f;
        m6263a(m4127a3, "numA=5");
        m6263a(m4127a3, "numB=7");
        C0451j m4127a4 = C0453l.m4127a(false, c0453l);
        m4127a4.m3119b(AbstractC0197n.f1370i);
        m4127a4.f6951ek = 10.0f;
        m4127a4.f1631cs = 55.0f;
        m4127a4.f1632ct = 500.0f;
        m4127a3.f1579bt = m4127a4;
        m6263a(m4127a4, "numA=309");
        m6263a(m4127a4, "numB=409");
        C0451j m4127a5 = C0453l.m4127a(false, c0453l);
        m4127a5.m3119b(AbstractC0197n.f1370i);
        m4127a5.f6952el = 5.0f;
        m4127a5.f1631cs = 66.0f;
        m4127a5.f1632ct = 1000.0f;
        m4127a4.f1580bu = m4127a5;
        C0451j m4127a6 = C0453l.m4127a(false, c0453l);
        m4127a6.m3119b(AbstractC0197n.f1370i);
        m4127a6.f6951ek = 2.0f;
        m6263a(m4127a6, "numA=99");
        m6263a(m4127a6, "numB=88");
        C0451j m4127a7 = C0453l.m4127a(false, c0453l);
        m4127a7.m3119b(AbstractC0197n.f1370i);
        m4127a7.f6951ek = 3.0f;
        m6263a(m4127a7, "numA=239");
        m6263a(m4127a7, "numB=268");
        C0451j m4127a8 = C0453l.m4127a(false, c0453l);
        m4127a8.m3119b(AbstractC0197n.f1370i);
        m4127a8.f6951ek = 3.0f;
        m4127a6.m4395C(m4127a7);
        m4127a6.m4395C(m4127a8);
        C0451j m4127a9 = C0453l.m4127a(false, c0453l);
        m4127a9.m3119b(AbstractC0197n.f1370i);
        m4127a9.m4347a(C0448g.m4411a("globalTag1, globalTag2"), false);
        m4127a9.f6951ek = 2.0f;
        GameEngine.PrintLog("=== logic boolean tests == (runs:50)");
        Long valueOf = Long.valueOf(C0727bl.m2610a());
        for (int i = 0; i < 50; i++) {
            if (i == 1) {
            }
            m6254b(m4127a3, m6253b("true"));
            m6251c(m4127a3, m6253b("false"));
            m6254b(m4127a3, m6253b("not false"));
            m6254b(m4127a3, m6253b("not not true"));
            m6260a(m4127a3, m6253b("5"), 5.0f);
            m6260a(m4127a3, m6253b("5+5"), 10.0f);
            m6260a(m4127a3, m6253b("1+2+3"), 6.0f);
            m6260a(m4127a3, m6253b("2.5+2.5"), 5.0f);
            m6260a(m4127a3, m6253b("10-2"), 8.0f);
            m6260a(m4127a3, m6253b("((5+5)-2)*3"), 24.0f);
            m6260a(m4127a3, m6253b("10/2+10*2"), 25.0f);
            m6260a(m4127a3, m6253b("-5"), -5.0f);
            m6260a(m4127a3, m6253b("--5"), 5.0f);
            m6260a(m4127a3, m6253b("9--5"), 14.0f);
            m6260a(m4127a3, m6253b("-9--5"), -4.0f);
            m6260a(m4127a3, m6253b("+5"), 5.0f);
            m6260a(m4127a3, m6253b("+ 5"), 5.0f);
            m6260a(m4127a3, m6253b(" + 5"), 5.0f);
            m6260a(m4127a3, m6253b(" ++ 5"), 5.0f);
            m6260a(m4127a3, m6253b("-+5"), -5.0f);
            m6260a(m4127a3, m6253b("--+5"), 5.0f);
            m6260a(m4127a3, m6253b("++-5"), -5.0f);
            m6260a(m4127a3, m6253b(" - - +5"), 5.0f);
            m6260a(m4127a3, m6253b("9++5"), 14.0f);
            m6257a("5 - ");
            m6257a("5 -- ");
            m6257a("5 + ");
            m6257a("5 ++ ");
            m6257a("5 ** 9 ");
            m6257a("5 -/ 9 ");
            m6257a("5 * 5 -");
            m6257a(" - ");
            m6257a(" -- ");
            m6257a(" + ");
            m6257a(" ++ ");
            m6258a(m4127a3, m6253b(" 'hello'"), "hello");
            m6258a(m4127a3, m6253b(" \"hello\" "), "hello");
            m6260a(m4127a3, m6253b("self.hp+1"), m4127a3.f1631cs + 1.0f);
            m6260a(m4127a3, m6253b("self.x+1"), m4127a3.f6951ek + 1.0f);
            m6260a(m4127a3, m6253b("self.y+1"), m4127a3.f6952el + 1.0f);
            m6260a(m4127a3, m6253b("self.z+1"), m4127a3.f6953em + 1.0f);
            m6260a(m4127a3, m6253b("int( 5.5+0.1 )"), 5.0f);
            m6260a(m4127a3, m6253b("-5 * 5"), -25.0f);
            m6260a(m4127a3, m6253b("-5 * self.hp"), (-5.0f) * m4127a3.f1631cs);
            m6260a(m4127a3, m6253b("self.hp + -5"), m4127a3.f1631cs - 5.0f);
            m6260a(m4127a3, m6253b("self.hp * -5"), (-5.0f) * m4127a3.f1631cs);
            m6260a(m4127a3, m6253b("(self.hp ) * -5 "), (-5.0f) * m4127a3.f1631cs);
            m6260a(m4127a3, m6253b("-self.hp * -5"), (-5.0f) * (-m4127a3.f1631cs));
            m6260a(m4127a3, m6253b("-(self.hp ) * -5 "), (-5.0f) * (-m4127a3.f1631cs));
            m6260a(m4127a3, m6253b("-5 * -self.hp"), (-5.0f) * (-m4127a3.f1631cs));
            m6260a(m4127a3, m6253b("(-5 * -self.hp)/2"), ((-5.0f) * (-m4127a3.f1631cs)) / 2.0f);
            m6260a(m4127a3, m6253b("-(self.hp )"), -m4127a3.f1631cs);
            m6260a(m4127a3, m6253b("--(self.hp )"), m4127a3.f1631cs);
            m6260a(m4127a3, m6253b("-((self.hp ))"), -m4127a3.f1631cs);
            m6260a(m4127a3, m6253b("-self.hp"), -m4127a3.f1631cs);
            m6260a(m4127a3, m6253b("-0"), 0.0f);
            m6260a(m4127a3, m6253b("-  1"), -1.0f);
            m6260a(m4127a3, m6253b(" -  1"), -1.0f);
            m6260a(m4127a3, m6253b("-0*-0"), 0.0f);
            m6260a(m4127a3, m6253b("-2*2"), -4.0f);
            m6260a(m4127a3, m6253b("-2-3-2"), -7.0f);
            m6251c(m4127a3, m6253b("10>10"));
            m6251c(m4127a3, m6253b("10<10"));
            m6254b(m4127a3, m6253b("10>=10"));
            m6254b(m4127a3, m6253b("10<=10"));
            m6254b(m4127a3, m6253b("'hello'=='hello'"));
            m6254b(m4127a3, m6253b("'hello'!='bye'"));
            m6257a("'hello'<'bye'");
            m6257a("'hello'>'bye'");
            m6257a("'hello'<='bye'");
            m6257a("'hello'>='bye'");
            m6257a("'hello'55'bye'");
            m6257a("'hello'><'bye'");
            m6257a("6><8");
            m6251c(m4127a3, m6253b("not (10>5 and true)"));
            m6251c(m4127a3, m6253b("not true and false"));
            m6254b(m4127a3, m6253b("not false and true"));
            m6254b(m4127a3, m6253b("not (false and true)"));
            m6251c(m4127a3, m6253b("not (1>2 or 5>2)"));
            m6254b(m4127a3, m6253b("(true and (false or true))"));
            m6254b(m4127a3, m6253b(" true and   (false   or   true  )"));
            m6254b(m4127a3, m6253b("true and((false)or(true) )"));
            m6254b(m4127a3, m6253b("100>50+20"));
            m6254b(m4127a3, m6253b("100>50*1.5"));
            m6254b(m4127a3, m6253b("not (100<50*1.5)"));
            m6254b(m4127a3, m6253b("5 < 10 < 15"));
            m6254b(m4127a3, m6253b("false==false"));
            m6254b(m4127a3, m6253b("true==true"));
            m6254b(m4127a3, m6253b("false==false==false"));
            m6254b(m4127a3, m6253b("true==true==true"));
            m6254b(m4127a3, m6253b("false!=true!=false"));
            m6254b(m4127a3, m6253b("true!=false!=true"));
            m6251c(m4127a3, m6253b("'test'==null"));
            m6254b(m4127a3, m6253b("'test'!=null"));
            m6251c(m4127a3, m6253b("'test'==null==null"));
            m6254b(m4127a3, m6253b("'test'!=null!='test2'"));
            m6254b(m4127a3, m6253b("self!=null"));
            m6251c(m4127a3, m6253b("self==null"));
            m6254b(m4127a3, m6253b("10==10"));
            m6254b(m4127a3, m6253b("10.5==10.5"));
            m6254b(m4127a3, m6253b("1/3==1/3"));
            m6251c(m4127a3, m6253b("10!=10"));
            m6254b(m4127a3, m6253b("10!=5"));
            m6257a("true - true");
            m6257a("true + true");
            m6257a("true * true");
            m6257a("true / true");
            m6257a("true < 10");
            m6257a("true == 10");
            m6257a("true != 10");
            m6257a("'text' == 10");
            m6257a("10 == ");
            m6257a("10 != ");
            m6257a("10 > ");
            m6257a("10 < ");
            m6257a("10 >= ");
            m6257a("10 <= ");
            m6257a("10 ==");
            m6257a("10 !=");
            m6257a("10 >");
            m6257a("10 <");
            m6257a("10 >=");
            m6257a("10 <=");
            m6257a("==10");
            m6257a("!=10");
            m6257a(">10");
            m6257a("<10");
            m6257a(">=10");
            m6257a("<=10");
            m6257a("10.6.6");
            m6258a(m4127a3, m6253b("select(true, 'A','B')"), "A");
            m6258a(m4127a3, m6253b("select(false, 'A','B')"), "B");
            m6258a(m4127a3, m6253b("str(5.5)"), "5.5");
            m6258a(m4127a3, m6253b("str(5)"), "5");
            m6258a(m4127a3, m6253b("lowercase('HELlo')"), "hello");
            m6258a(m4127a3, m6253b("uppercase('heLLo')"), "HELLO");
            m6258a(m4127a3, m6253b("lowercase(str('HELlo'))"), "hello");
            m6254b(m4127a3, m6253b("self.hp(lessThan=9999)"));
            m6257a("self.hp(lessThan=9999, lessThan=9998)");
            m6257a("self..hp(lessThan=9999)");
            m6257a("self...hp(lessThan=9999)");
            m6253b("game.nukesEnabled()");
            m6257a("game.nukesEnabled(nukesEnabled=true)");
            m6257a("game.nukesEnabled(nukesEnabled=false)");
            m6257a("game.nukesEnabled()==0");
            m6257a("game.nukesEnabled()!=0");
            m6257a("game.nukesEnabled()<0");
            m6257a("game.nukesEnabled()>0");
            m6257a("game.nukesEnabled()=='true'");
            m6257a("game.nukesEnabled()!='true'");
            m6257a("self.nukesEnabled()");
            m6257a("parent.nukesEnabled()");
            m6257a("hp==44");
            m6257a("5=44");
            if (m4127a3 == AbstractC0197n.f1370i.f1312r) {
                GameEngine.PrintLog("skipping for placeholderTeamUnit");
            } else {
                m6254b(m4127a3, m6253b("self.hp==44"));
                m6254b(m4127a3, m6253b("self.customTarget1.hp==55"));
                m6257a("self.memory1.hp=55");
                m6254b(m4127a3, m6253b("self.customTarget1.maxhp==500"));
                m6254b(m4127a3, m6253b("customTarget1.hp==55"));
                m6254b(m4127a3, m6253b("self.customTarget1.customTarget2.hp==66"));
                m6254b(m4127a3, m6253b("self.customTarget1==self.customTarget1"));
                m6254b(m4127a3, m6253b("self.customTarget1!=self"));
                m6254b(m4127a2, m6253b("self.customTarget1==null"));
                m6254b(m4127a2, m6253b("self.customTarget1!=self"));
                m6254b(m4127a2, m6253b("self.parent==null"));
                m6254b(m4127a2, m6253b("self.parent.customTarget1==null"));
                m6254b(m4127a2, m6253b("self.parent.customTarget1==self.parent"));
                m6254b(m4127a2, m6253b("self.parent.customTarget1!=self"));
            }
            m6260a(m4127a3, m6253b("self.getOffsetAbsolute(y=10).y"), m4127a3.f6952el + 10.0f);
            m6254b(m4127a3, m6253b("self.getOffsetAbsolute(y=10).y==self.y+10"));
            m6254b(m4127a3, m6253b("self.getOffsetRelative(y=10, height=5).height==self.height+5"));
            m6260a(m4127a3, m6253b("self.getOffsetRelative(y=10, height=5).height"), m4127a3.f6953em + 5.0f);
            m6260a(m4127a3, m6253b("self.getOffsetAbsolute(y=10).getOffsetAbsolute(y=10).y"), m4127a3.f6952el + 10.0f + 10.0f);
            m6260a(m4127a6, m6253b("self.transporting().getOffsetAbsolute(x=5).x"), m4127a7.f6951ek + 5.0f);
            m6260a(m4127a6, m6253b("self.transporting(slot=1).getOffsetAbsolute(x=5).x"), m4127a8.f6951ek + 5.0f);
            m6260a(m4127a6, m6253b("self.transporting().parent.transporting().parent.id"), (float) m4127a6.f6945ed);
            m6260a(m4127a6, m6253b("self.transporting().getOffsetAbsolute(x=memory.numA).x-memory.numA"), m4127a7.f6951ek);
            m6260a(m4127a6, m6253b("self.transporting().getOffsetAbsolute(x=self.id).x-self.id"), m4127a7.f6951ek);
            m6260a(m4127a6, m6253b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).x-self.id"), m4127a7.f6951ek);
            m6260a(m4127a6, m6253b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).getOffsetAbsolute().x-self.id"), m4127a7.f6951ek);
            m6260a(m4127a6, m6253b("self.transporting().parent.transporting().getOffsetAbsolute(x=self.id).getOffsetAbsolute(x=self.id+1).x"), m4127a7.f6951ek + ((float) m4127a6.f6945ed) + ((float) m4127a6.f6945ed) + 1.0f);
            m6254b(m4127a3, m6253b("numberOfUnitsInTeam(greaterThan=-2)"));
            m6254b(m4127a3, m6253b("NumberOfUnitsInTeam(greaterTHAN=-2)"));
            m6261a(m4127a3, m6253b("self.noUnitInTeam()"));
            m6261a(m4127a3, m6253b("self.hasUnitInTeam()"));
            m6261a(m4127a3, m6253b("self.hasUnitInTeam(neutralTeam=true)"));
            m6261a(m4127a3, m6253b("self.shield()+self.ammo()+self.hp()>-1"));
            m6261a(m4127a3, m6253b("parent.shield()+parent.ammo()+parent.hp()>-1"));
            m6258a(m4127a3, m6253b("'hello'+'a'"), "helloa");
            m6258a(m4127a3, m6253b("'hello'+5"), "hello5");
            m6258a(m4127a3, m6253b("substring('hello',0,3)"), "hel");
            m6258a(m4127a3, m6253b("substring('hello',0,100)"), "hello");
            m6258a(m4127a3, m6253b("substring('HEllo',0,100)"), "HEllo");
            m6258a(m4127a3, m6253b("'HEllo'"), "HEllo");
            m6258a(m4127a3, m6253b("substring('aa',0,2)+substring('bb',0,2)"), "aabb");
            m6254b(m4127a3, m6253b(" true AND true"));
            m6254b(m4127a3, m6253b(" true aNd true"));
            m6254b(m4127a3, m6253b(" true OR false"));
            m6254b(m4127a3, m6253b(" true OR TRUE"));
            m6254b(m4127a3, m6253b(" True OR  False "));
            m6254b(m4127a3, m6253b(" True OR  (False) "));
            m6254b(m4127a3, m6253b(" NOT FALSE "));
            m6254b(m4127a3, m6253b(" NOT NOT NOT FALSE "));
            m6254b(m4127a3, m6253b(" game.nukesEnabled "));
            m6254b(m4127a3, m6253b(" GAME.NukesEnabled "));
            m6260a(m4127a3, m6253b("squareRoot( 100 )"), 10.0f);
            m6260a(m4127a3, m6253b("max(+1,2)"), 2.0f);
            m6260a(m4127a3, m6253b("min(+1,2)"), 1.0f);
            m6260a(m4127a3, m6253b("max(1,2)"), 2.0f);
            m6260a(m4127a3, m6253b("min(1,2)"), 1.0f);
            m6260a(m4127a3, m6253b("max( 1,2 )"), 2.0f);
            m6260a(m4127a3, m6253b("min( 1,2 )"), 1.0f);
            m6260a(m4127a3, m6253b("max(-1,2)"), 2.0f);
            m6260a(m4127a3, m6253b("min(-1,2)"), -1.0f);
            m6260a(m4127a3, m6253b("max( -1,2 )"), 2.0f);
            m6260a(m4127a3, m6253b("min( -1,2 )"), -1.0f);
            m6260a(m4127a3, m6253b("max( 3,1 )"), 3.0f);
            m6260a(m4127a3, m6253b("min( 3,1 )"), 1.0f);
            m6260a(m4127a3, m6253b("max( 3+3,4 )"), 6.0f);
            m6260a(m4127a3, m6253b("min( 3+3,4 )"), 4.0f);
            m6260a(m4127a3, m6253b("distanceSquared( 1,1,1,6 )"), 25.0f);
            m6260a(m4127a3, m6253b("max(distanceSquared( 1,1,1,6 ), 4)"), 25.0f);
            m6260a(m4127a3, m6253b("min(  distanceSquared( 1,1,1 , 6 )  , 4)"), 4.0f);
            m6254b(m4127a3, m6253b("distanceSquared( 1,1,1,6 )>=5*5"));
            m6254b(m4127a3, m6253b("distanceSquared( 1,1,1,6 )>4*5"));
            m6254b(m4127a3, m6253b("distanceSquared( 1,1,6,1 )<6*5"));
            m6254b(m4127a3, m6253b("distance( 0,0,5,0 )==5"));
            m6254b(m4127a3, m6253b("distance( 0,1,0,6 )==5"));
            m6259a(m4127a3, m6253b("customTarget1"), m4127a4);
            m6259a(m4127a3, m6253b("customTarget1.self"), m4127a4);
            m6259a(m4127a3, m6253b("self.customTarget1.self"), m4127a4);
            m6259a(m4127a3, m6253b("customTarget1.customTarget2"), m4127a4.f1580bu);
            m6260a(m4127a3, m6253b(" distanceBetween(customTarget1.customTarget2, customTarget1 ) "), C0758f.m2311b(m4127a4.f6951ek, m4127a4.f6952el, m4127a5.f6951ek, m4127a5.f6952el));
            m6260a(m4127a3, m6253b(" distanceBetweenSquared(customTarget1.customTarget2, customTarget1 ) "), C0758f.m2363a(m4127a4.f6951ek, m4127a4.f6952el, m4127a5.f6951ek, m4127a5.f6952el));
            m6254b(m4127a3, m6253b(" distanceBetween(self, nullUnit ) == 0 "));
            m6260a(m4127a3, m6253b(" distanceBetween(customTarget1.customTarget2, nullUnit ) "), 0.0f);
            m6260a(m4127a3, m6253b(" distanceBetween(nullUnit, nullUnit ) "), 0.0f);
            m6260a(m4127a3, m6253b(" distanceBetween( self.getOffsetAbsolute(x=5), self.getOffsetAbsolute(x=-5) ) "), 10.0f);
            m6260a(m4127a3, m6253b(" distanceBetweenSquared( self.getOffsetAbsolute(x=5), self.getOffsetAbsolute(x=-5) ) "), 100.0f);
            m6254b(m4127a3, m6252b(" self.energy < 0.5 and customTarget2==nullUnit ", true));
            m6254b(m4127a3, m6252b(" self.energy < 0.5 and customTarget2 == nullUnit ", true));
            m6254b(m4127a3, m6252b(" self.energy < 0.5 and customTarget1 != nullUnit ", true));
            m6254b(m4127a3, m6252b("parent==nullUnit and customTarget1!= nullUnit ", true));
            m6254b(m4127a3, m6252b("parent == nullUnit and customTarget1!=nullUnit ", true));
            m6257a("distanceBetween( self )");
            m6257a("distanceBetween( self, 5 )");
            m6257a("distanceBetween( self, nullUnit, nullUnit )");
            m6257a("distanceBetween(  )");
            m6254b(m4127a3, m6253b("'and'=='and'"));
            m6254b(m4127a3, m6253b("'and'!='and true'"));
            m6254b(m4127a3, m6253b("'hello.test'!='bye'"));
            m6254b(m4127a3, m6253b("'hel.lo.test'!='b.ye'"));
            m6254b(m4127a3, m6253b("'hel.lo.(test'!='b.ye'"));
            m6254b(m4127a3, m6253b("'hel.\"lo.(test'!='b.ye \"and '"));
            m6254b(m4127a3, m6253b("\"hel.lo.'(test2\"!='b.ye \"and '"));
            m6254b(m4127a3, m6253b("5==5"));
            m6254b(m4127a3, m6253b("'hel.lo.(test'!='b.ye' and 5==5"));
            m6257a("distanceSquared(  )");
            m6257a("distanceSquared( 1 )");
            m6257a("distanceSquared( 1,1 )");
            m6257a("distanceSquared( 1,1,1 )");
            m6257a("distanceSquared( 1,1,1,'test' )");
            m6257a("distanceSquared( 1,1,1,true )");
            m6257a("distanceSquared( 1,1,1,null )");
            m6257a("distanceSquared( 1,1,1, )");
            m6257a("distanceSquared( 1,1,1,'test' )");
            m6257a("distanceSquared( x1=1,1,1,'test' )");
            m6257a("distanceSquared( 1,1,1,1, x1=1 )");
            m6257a("distanceSquared( 1,1,1,1,1 )");
            m6257a("distanceSquared( 1,1,1, x1=1 )");
            m6257a("distanceSquared( 1,1,1, 1 ");
            m6257a("distanceSquared( 1,1,1, 1 ))");
            m6254b(m4127a3, m6253b("SELF.HP(lessThan=9999)"));
            m6251c(m4127a3, m6253b("Self.Parent.HP(lessThan=9999)"));
            m6257a("self.hasFlag( id=35 )");
            m6257a("self.hasFlag( 35 )");
            m6251c(m4127a3, m6253b("self.hasFlag(id=30)"));
            m6251c(m4127a3, m6253b("self.hasFlag(30)"));
            m6251c(m4127a3, m6253b("self.hasFlag(15+15)"));
            m6251c(m4127a3, m6253b("self.hasFlag(id=15*2)"));
        }
        GameEngine.PrintLog("Took: " + C0727bl.m2607a(valueOf.longValue(), Long.valueOf(C0727bl.m2610a()).longValue()));
        GameEngine.PrintLog("=== logic boolean memory tests ==");
        m6262a(c0453l, "unit testUnit1, float testFloat1");
        m6262a(c0453l, "unit testUnit2, float testFloat2");
        m6262a(c0453l, "bool testBool1");
        m6262a(c0453l, "number testNumber1");
        m6262a(c0453l, "float  testNumber2");
        m6262a(c0453l, "String testString");
        m6262a(c0453l, "String nullString");
        m6263a(m4127a3, "testString='(,,((', testFloat1=5, testFloat2=8, testBool1=true, testUnit1=self");
        m6263a(m4127a3, "nullString=null");
        m6255b(m4127a, "testNumber1=null");
        m6255b(m4127a, "testNumber2=null");
        m6255b(m4127a, "testBool1=null");
        m6255b(m4127a, "testNumber1=self");
        m6255b(m4127a, "testBool1=5");
        GameEngine.PrintLog(m4127a3.f1581bv.debugMemory(false, true));
        m6260a(m4127a3, m6253b("memory.testFloat1"), 5.0f);
        m6260a(m4127a3, m6253b("memory.testFloat2"), 8.0f);
        m6254b(m4127a3, m6253b("memory.testFloat1==5"));
        m6254b(m4127a3, m6253b("memory.testString=='(,,(('"));
        m6254b(m4127a3, m6253b("memory.testBool1"));
        m6254b(m4127a3, m6253b("memory.testBool1==true"));
        m6254b(m4127a3, m6253b("memory.testUnit1==self"));
        m6254b(m4127a3, m6253b("memory.testUnit1!=nullUnit"));
        m6256a("memory.testUnit1==5", true);
        m6260a(m4127a3, m6253b("self.readUnitMemory('testFloat1', type='float')"), 5.0f);
        m6263a(m4127a3, "testFloat1=distance( 0,0,6,0 ), testFloat2=16");
        m6254b(m4127a3, m6253b("memory.testFloat1==6"));
        m6254b(m4127a3, m6253b("memory.testFloat2==16"));
        m6263a(m4127a3, "testUnit1=self.getOffsetAbsolute(y=10), testUnit2=self.getOffsetAbsolute(y=-10)");
        GameEngine.PrintLog(m4127a3.f1581bv.debugMemory(false, true));
        m6260a(m4127a3, m6253b("distanceBetween( memory.testUnit1, memory.testUnit2)"), 20.0f);
        m6254b(m4127a3, m6253b("distanceBetweenSquared( memory.testUnit1, memory.testUnit2)==20*20"));
        m6259a(m4127a3, m6253b("globalSearchForFirstUnit(withTag='globalTag1')"), m4127a9);
        m6259a(m4127a3, m6253b("globalSearchForFirstUnit(withTag='globalTag2')"), m4127a9);
        m6254b(m4127a3, m6253b("globalSearchForFirstUnit()!=null"));
        m6254b(m4127a3, m6253b("globalSearchForFirstUnit(withTag='globalTag1', relation='enemy')==null"));
        m6254b(m4127a3, m6253b("globalSearchForFirstUnit(withTag='globalTagNo')==null"));
        m6256a("globalSearchForFirstUnit(withTag='globalTag1', relation='XYZ')", true);
    }

    /* renamed from: a */
    public void m6257a(String str) {
        m6256a(str, false);
    }

    /* renamed from: a */
    public void m6256a(String str, boolean z) {
        try {
            LogicBooleanLoader.parseBooleanBlock(C0453l.f2901b, str, false);
            throw new RuntimeException("assertCreateError got no error for: " + str);
        } catch (RuntimeException e) {
            if (e.getClass() != RuntimeException.class && e.getClass() != BooleanParseException.class) {
                throw new RuntimeException(e);
            }
            if (z) {
                GameEngine.m1125d("assertCreateError: " + str + " error:" + e.getMessage());
            }
        }
    }

    /* renamed from: a */
    public void m6262a(C0453l c0453l, String str) {
        c0453l.f3202q.defineVariables(c0453l, str);
    }

    /* renamed from: a */
    public void m6263a(AbstractC0244am abstractC0244am, String str) {
        try {
            C0451j c0451j = (C0451j) abstractC0244am;
            VariableScope.createMemoryWriter(str, c0451j.f2861w, "testsection", "testkey").writeToUnit(c0451j);
        } catch (C0412bm e) {
            throw new RuntimeException(e);
        }
    }

    /* renamed from: b */
    public void m6255b(AbstractC0244am abstractC0244am, String str) {
        try {
            C0451j c0451j = (C0451j) abstractC0244am;
            VariableScope.createMemoryWriter(str, c0451j.f2861w, "testsection", "testkey").writeToUnit(c0451j);
            throw new RuntimeException("assertSetMemoryError got no error for: " + str);
        } catch (C0412bm e) {
        } catch (RuntimeException e2) {
        }
    }

    /* renamed from: b */
    public LogicBoolean m6253b(String str) {
        return m6252b(str, false);
    }

    /* renamed from: b */
    public LogicBoolean m6252b(String str, boolean z) {
        try {
            return LogicBooleanLoader.parseBooleanBlock(C0453l.f2901b, str, z);
        } catch (RuntimeException e) {
            throw new RuntimeException("Error: " + e.getMessage() + " parsing [" + str + "]", e);
        }
    }

    /* renamed from: a */
    public void m6261a(AbstractC0623y abstractC0623y, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.bool) {
            throw new RuntimeException("Asset assertBooleanTrue type ==" + logicBoolean.getReturnType());
        }
        logicBoolean.read(abstractC0623y);
    }

    /* renamed from: b */
    public void m6254b(AbstractC0623y abstractC0623y, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.bool) {
            throw new RuntimeException("Asset assertBooleanTrue type ==" + logicBoolean.getReturnType());
        }
        if (!logicBoolean.read(abstractC0623y)) {
            throw new RuntimeException("Asset assertBooleanTrue failed, got false for: " + logicBoolean.getMatchFailReasonForPlayer(abstractC0623y));
        }
    }

    /* renamed from: c */
    public void m6251c(AbstractC0623y abstractC0623y, LogicBoolean logicBoolean) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.bool) {
            throw new RuntimeException("Asset assertBooleanFalse type ==" + logicBoolean.getReturnType());
        }
        C0085n.m6226b(logicBoolean.read(abstractC0623y));
    }

    /* renamed from: a */
    public void m6260a(AbstractC0623y abstractC0623y, LogicBoolean logicBoolean, float f) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.number) {
            throw new RuntimeException("Asset assertBooleanNumber type ==" + logicBoolean.getReturnType());
        }
        float readNumber = logicBoolean.readNumber(abstractC0623y);
        if (C0758f.m2291c(readNumber - f) > 0.001f) {
            throw new RuntimeException("Asset failed (float):" + readNumber + "!=" + f + " for: " + logicBoolean.getMatchFailReasonForPlayer(abstractC0623y));
        }
    }

    /* renamed from: a */
    public void m6258a(AbstractC0623y abstractC0623y, LogicBoolean logicBoolean, String str) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.string) {
            throw new RuntimeException("Asset assertBooleanString type ==" + logicBoolean.getReturnType());
        }
        C0085n.m6229a(logicBoolean.readString(abstractC0623y), str);
    }

    /* renamed from: a */
    public void m6259a(AbstractC0623y abstractC0623y, LogicBoolean logicBoolean, AbstractC0244am abstractC0244am) {
        if (logicBoolean.getReturnType() != LogicBoolean.ReturnType.unit) {
            throw new RuntimeException("Asset assertBooleanUnit type ==" + logicBoolean.getReturnType());
        }
        AbstractC0244am readUnit = logicBoolean.readUnit(abstractC0623y);
        if (readUnit != abstractC0244am) {
            GameEngine.PrintLog("class: " + logicBoolean.getClass().getName());
            throw new RuntimeException("assertBooleanUnit failed:" + AbstractC0244am.m5329A(readUnit) + "!=" + AbstractC0244am.m5329A(abstractC0244am) + " for: " + logicBoolean.getMatchFailReasonForPlayer(abstractC0623y));
        }
    }
}
