/*      */ package com.corrodinggames.rts.game.units.custom.b;
/*      */ 
/*      */ import com.corrodinggames.rts.game.units.a.g;
/*      */ import com.corrodinggames.rts.game.units.a.s;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.custom.at;
/*      */ import com.corrodinggames.rts.game.units.custom.au;
/*      */ import com.corrodinggames.rts.game.units.custom.k;
/*      */ import com.corrodinggames.rts.game.units.custom.l;
/*      */ import com.corrodinggames.rts.game.units.custom.logicBooleans.LogicBoolean;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.gameFramework.d.w;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.utility.ab;
/*      */ import com.corrodinggames.rts.gameFramework.utility.m;
/*      */ import com.corrodinggames.rts.gameFramework.utility.y;
/*      */ import java.util.ArrayList;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public final class h
/*      */   extends a
/*      */ {
/*   29 */   public static final h a = new h();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(l paraml, ab paramab) {
/*  171 */     String str = "attachment_";
/*      */     
/*  173 */     m m = paramab.e(str);
/*      */ 
/*      */     
/*  176 */     if (m.size() > 0) {
/*      */       
/*  178 */       paraml.a(a);
/*      */       
/*  180 */       short s = 0;
/*  181 */       for (String str1 : m) {
/*      */         
/*  183 */         String str2 = str1.substring(str.length());
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  188 */         i i = new i();
/*      */ 
/*      */         
/*  191 */         a(i, paraml, paramab, str1, str2);
/*      */ 
/*      */         
/*  194 */         i.b = str2;
/*  195 */         i.a = s;
/*  196 */         s = (short)(s + 1);
/*      */         
/*  198 */         paraml.ap.add(i);
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(i parami, l paraml, ab paramab, String paramString1, String paramString2) {
/*  215 */     parami.c = paramab.h(paramString1, "x");
/*  216 */     parami.d = paramab.h(paramString1, "y");
/*      */     
/*  218 */     parami.e = paramab.a(paramString1, "height", Float.valueOf(parami.e)).floatValue();
/*      */     
/*  220 */     parami.i = paramab.a(paramString1, "lockDir", Boolean.valueOf(parami.i)).booleanValue();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  226 */     parami.j = paramab.a(paramString1, "redirectDamageToParent", Boolean.valueOf(parami.j)).booleanValue();
/*  227 */     parami.k = paramab.a(paramString1, "redirectDamageToParent_shieldOnly", Boolean.valueOf(parami.k)).booleanValue();
/*      */     
/*  229 */     if (!parami.j && parami.k)
/*      */     {
/*  231 */       throw new at("[" + paramString1 + "] redirectDamageToParent_shieldOnly requires redirectDamageToParent");
/*      */     }
/*      */     
/*  234 */     parami.l = paramab.a(paramString1, "canBeAttackedAndDamaged", Boolean.valueOf(parami.l)).booleanValue();
/*      */ 
/*      */     
/*  237 */     parami.m = paramab.a(paramString1, "isUnselectable", Boolean.valueOf(parami.m)).booleanValue();
/*      */     
/*  239 */     parami.n = paramab.a(paramString1, "isUnselectableAsTarget", Boolean.valueOf(parami.m)).booleanValue();
/*      */ 
/*      */ 
/*      */     
/*  243 */     parami.o = paramab.a(paramString1, "isVisible", Boolean.valueOf(parami.o)).booleanValue();
/*      */     
/*  245 */     parami.p = paramab.a(paramString1, "showMiniHp", Boolean.valueOf(parami.p)).booleanValue();
/*  246 */     parami.q = paramab.a(paramString1, "hideHp", Boolean.valueOf(parami.q)).booleanValue();
/*      */ 
/*      */ 
/*      */     
/*  250 */     parami.N = paramab.a(paraml, paramString1, "showAllActionsFrom", null);
/*      */     
/*  252 */     if (LogicBoolean.isStaticFalse(parami.N))
/*      */     {
/*  254 */       parami.N = null;
/*      */     }
/*      */     
/*  257 */     Float float_1 = paramab.a(paramString1, "idleDir", null);
/*  258 */     Float float_2 = paramab.a(paramString1, "idleDirReversing", null);
/*      */ 
/*      */     
/*  261 */     if (float_1 != null) {
/*      */ 
/*      */       
/*  264 */       parami.f = float_1.floatValue();
/*  265 */       parami.g = float_1.floatValue();
/*      */     } 
/*      */     
/*  268 */     if (float_2 != null) {
/*      */ 
/*      */ 
/*      */       
/*  272 */       parami.g = float_2.floatValue();
/*      */     }
/*      */     else {
/*      */       
/*  276 */       parami.g = parami.f;
/*      */     } 
/*      */ 
/*      */     
/*  280 */     parami.h = paramab.a(paramString1, "resetRotationWhenNotAttacking", Boolean.valueOf(false)).booleanValue();
/*      */ 
/*      */     
/*  283 */     parami.r = paramab.a(paramString1, "rotateWithParent", Boolean.valueOf(parami.r)).booleanValue();
/*  284 */     parami.s = paramab.a(paramString1, "lockLegMovement", Boolean.valueOf(parami.s)).booleanValue();
/*  285 */     parami.t = paramab.a(paramString1, "freezeLegMovement", Boolean.valueOf(parami.t)).booleanValue();
/*      */ 
/*      */     
/*  288 */     parami.u = paramab.a(paramString1, "lockRotation", Boolean.valueOf(parami.u)).booleanValue();
/*      */     
/*  290 */     if (parami.u && parami.h)
/*      */     {
/*  292 */       throw new at("[" + paramString1 + "] Cannot use lockRotation and resetRotationWhenIdle at same time");
/*      */     }
/*      */ 
/*      */     
/*  296 */     parami.v = paramab.a(paramString1, "keepAliveWhenParentDies", Boolean.valueOf(parami.v)).booleanValue();
/*      */     
/*  298 */     parami.w = au.b(paraml, paramab, paramString1, "onCreateSpawnUnitOf");
/*      */     
/*  300 */     if (parami.w.b())
/*      */     {
/*  302 */       parami.w = null;
/*      */     }
/*      */     
/*  305 */     parami.x = paramab.a(paramString1, "createIncompleteIfParentIs", Boolean.valueOf(parami.x)).booleanValue();
/*      */ 
/*      */ 
/*      */     
/*  309 */     parami.y = paramab.a(paramString1, "onConvertKeepExistingUnitInSameSlot", Boolean.valueOf(parami.y)).booleanValue();
/*      */     
/*  311 */     parami.z = paramab.a(paramString1, "onParentTeamChangeKeepCurrentTeam", Boolean.valueOf(parami.z)).booleanValue();
/*      */     
/*  313 */     parami.B = paramab.a(paramString1, "setDrawLayerOnBottom", Boolean.valueOf(parami.B)).booleanValue();
/*  314 */     if (parami.B)
/*      */     {
/*  316 */       parami.A = false;
/*      */     }
/*      */     
/*  319 */     parami.A = paramab.a(paramString1, "setDrawLayerOnTop", Boolean.valueOf(parami.A)).booleanValue();
/*      */     
/*  321 */     if (parami.A && parami.B)
/*      */     {
/*  323 */       throw new at("[" + paramString1 + "] Cannot use setDrawLayerOnTop and setDrawLayerOnBottom at same time");
/*      */     }
/*      */     
/*  326 */     parami.D = paramab.a(paramString1, "addTransportedUnits", Boolean.valueOf(parami.D)).booleanValue();
/*      */     
/*  328 */     parami.E = paramab.a(paramString1, "unloadInCurrentPosition", Boolean.valueOf(parami.E)).booleanValue();
/*      */ 
/*      */     
/*  331 */     parami.F = paramab.a(paramString1, "smoothlyBlendPositionWhenExistingUnitAdded", Boolean.valueOf(parami.F)).booleanValue();
/*      */     
/*  333 */     if (parami.F) {
/*      */       
/*  335 */       parami.G = 500.0F;
/*      */     
/*      */     }
/*      */     else {
/*      */       
/*  340 */       parami.G = 0.0F;
/*      */     } 
/*      */     
/*  343 */     parami.H = paramab.a(paramString1, "deattachIfWantingToMove", Boolean.valueOf(parami.H)).booleanValue();
/*      */     
/*  345 */     parami.I = paramab.a(paramString1, "hidden", Boolean.valueOf(parami.I)).booleanValue();
/*      */ 
/*      */ 
/*      */     
/*  349 */     parami.J = paramab.a(paramString1, "prioritizeParentsMainTarget", Boolean.valueOf(parami.J)).booleanValue();
/*  350 */     parami.K = paramab.a(paramString1, "onlyAttackParentsMainTarget", Boolean.valueOf(parami.K)).booleanValue();
/*  351 */     parami.L = paramab.a(paramString1, "alwaysAllowedToAttackParentsMainTarget", Boolean.valueOf(parami.L)).booleanValue();
/*      */     
/*  353 */     parami.M = paramab.a(paramString1, "canAttack", Boolean.valueOf(parami.M)).booleanValue();
/*      */     
/*  355 */     parami.O = paramab.a(paramString1, "keepWaypointsNeedingMovement", Boolean.valueOf(parami.O)).booleanValue();
/*      */     
/*  357 */     if (parami.D)
/*      */     {
/*  359 */       paraml.aq = true;
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(k paramk, float paramFloat) {
/*  369 */     b(paramk, paramFloat);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void b(k paramk, float paramFloat) {
/*  375 */     l l = l.u();
/*      */     
/*  377 */     l l1 = paramk.v;
/*      */     
/*  379 */     m m1 = l1.ap;
/*      */     
/*  381 */     if (m1.a == 0) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*  387 */     if (l1.aq) {
/*      */ 
/*      */       
/*  390 */       Object[] arrayOfObject1 = m1.a();
/*  391 */       for (byte b = 0; b < m1.a; b++) {
/*      */         
/*  393 */         i i1 = (i)arrayOfObject1[b];
/*      */         
/*  395 */         if (i1.D && paramk.x.a > 0) {
/*      */           
/*  397 */           r r = a(paramk, i1);
/*      */           
/*  399 */           if (r == null)
/*      */           {
/*      */             
/*  402 */             for (af af : paramk.x) {
/*      */               
/*  404 */               if (af instanceof r && af.cq == null)
/*      */               {
/*  406 */                 if (paramk.a((r)af, i1)) {
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                   
/*  414 */                   af.cp = null;
/*      */ 
/*      */                   
/*      */                   break;
/*      */                 } 
/*      */               }
/*      */             } 
/*      */           }
/*      */         } 
/*      */       } 
/*      */     } 
/*      */ 
/*      */     
/*  427 */     m m2 = paramk.y;
/*  428 */     if (m2 == null) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  433 */     float f = paramk.bL - paramk.z;
/*  434 */     paramk.z = paramk.bL;
/*      */     
/*  436 */     Object[] arrayOfObject = m2.a();
/*  437 */     for (int i = m2.a - 1; i >= 0; i--) {
/*      */       
/*  439 */       r r = (r)arrayOfObject[i];
/*      */ 
/*      */ 
/*      */       
/*  443 */       if (r != null)
/*      */       {
/*      */ 
/*      */ 
/*      */         
/*  448 */         if (r.bz) {
/*      */           
/*  450 */           r.bs();
/*  451 */           arrayOfObject[i] = null;
/*      */         } else {
/*      */           float f6;
/*      */           
/*  455 */           if (paramk.cp != null) {
/*      */             
/*  457 */             if (r.cp == null)
/*      */             {
/*  459 */               r.cp = paramk.cp;
/*      */               
/*  461 */               l.bA.l((af)r);
/*      */             
/*      */             }
/*      */           
/*      */           }
/*  466 */           else if (r.cp != null && r.cp != paramk) {
/*      */ 
/*      */ 
/*      */             
/*  470 */             r.cp = null;
/*      */           } 
/*      */ 
/*      */ 
/*      */           
/*  475 */           i i1 = (i)m1.get(i);
/*      */ 
/*      */ 
/*      */           
/*  479 */           float f1 = f.i(paramk.bL);
/*  480 */           float f2 = f.h(paramk.bL);
/*      */           
/*  482 */           float f3 = f1 * i1.d - f2 * i1.c;
/*  483 */           float f4 = f2 * i1.d + f1 * i1.c;
/*      */           
/*  485 */           f3 += paramk.dH;
/*  486 */           f4 += paramk.dI;
/*  487 */           float f5 = paramk.dJ + i1.e;
/*      */ 
/*      */           
/*  490 */           if (y.b(r.cs, (int)i1.G)) {
/*      */ 
/*      */             
/*  493 */             f6 = 0.05F;
/*      */             
/*  495 */             r.dH += (f3 - r.dH) * f6;
/*  496 */             r.dI += (f4 - r.dI) * f6;
/*  497 */             r.dJ += (f5 - r.dJ) * f6;
/*      */           
/*      */           }
/*      */           else {
/*      */ 
/*      */             
/*  503 */             r.dH = f3;
/*  504 */             r.dI = f4;
/*  505 */             r.dJ = f5;
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  513 */           if (r.bR < 1.0F && i1.x)
/*      */           {
/*  515 */             r.q(paramk.bR);
/*      */           }
/*      */ 
/*      */ 
/*      */           
/*  520 */           if (i1.A) {
/*      */             
/*  522 */             if (r.dF <= paramk.dF)
/*      */             {
/*  524 */               int j = 0;
/*  525 */               if (r instanceof k)
/*      */               {
/*  527 */                 j = ((k)r).v.cp;
/*      */               }
/*      */               
/*  530 */               r.dF = paramk.dF;
/*  531 */               r.dG = paramk.dG + 1 + j;
/*      */             }
/*      */           
/*      */           }
/*  535 */           else if (i1.B) {
/*      */             
/*  537 */             if (r.dF >= paramk.dF) {
/*      */               
/*  539 */               r.dF = paramk.dF;
/*  540 */               r.dG = paramk.dG - 1;
/*      */             } 
/*      */           } 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  547 */           if (paramk.bN) {
/*      */             
/*  549 */             f6 = paramk.bL + i1.g;
/*      */           }
/*      */           else {
/*      */             
/*  553 */             f6 = paramk.bL + i1.f;
/*      */           } 
/*      */           
/*  556 */           if (!r.bw())
/*      */           {
/*  558 */             if (i1.u) {
/*      */               
/*  560 */               r.h(f6);
/*      */             
/*      */             }
/*      */             else {
/*      */               
/*  565 */               if (f != 0.0F && i1.r)
/*      */               {
/*  567 */                 r.i(f);
/*      */               }
/*      */               
/*  570 */               if (i1.h)
/*      */               {
/*  572 */                 if (r.I == null)
/*      */                 {
/*  574 */                   r.c(paramFloat, f6);
/*      */                 }
/*      */               }
/*      */             } 
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  583 */           if (i1.K) {
/*      */ 
/*      */             
/*  586 */             r.I = paramk.I;
/*  587 */             r.J = 5.0F;
/*      */           } 
/*      */ 
/*      */           
/*  591 */           if (i1.L)
/*      */           {
/*  593 */             if (r.I == null)
/*      */             {
/*      */               
/*  596 */               r.I = paramk.I;
/*      */             }
/*      */           }
/*      */ 
/*      */ 
/*      */           
/*  602 */           if (i1.J)
/*      */           {
/*  604 */             if (paramk.I != null)
/*      */             {
/*  606 */               if (r.I != paramk.I) {
/*      */                 
/*  608 */                 boolean bool = false;
/*      */                 
/*  610 */                 if (i1.L)
/*      */                 {
/*  612 */                   bool = true;
/*      */                 }
/*      */                 
/*  615 */                 if (r.a(paramk.I, bool)) {
/*      */ 
/*      */                   
/*  618 */                   r.I = paramk.I;
/*  619 */                   r.J = 5.0F;
/*      */                 } 
/*      */               } 
/*      */             }
/*      */           }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  635 */           if (r instanceof k) {
/*      */             
/*  637 */             k k1 = (k)r;
/*      */             
/*  639 */             if (i1.s) {
/*      */ 
/*      */               
/*  642 */               k1.dp = k1.dH;
/*  643 */               k1.dp = k1.dI;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(k paramk, boolean paramBoolean) {
/*  662 */     m m1 = paramk.y;
/*      */     
/*  664 */     if (m1 == null) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/*  669 */     m m2 = paramk.v.ap;
/*      */     
/*  671 */     Object[] arrayOfObject = m1.a();
/*  672 */     for (int i = m1.a - 1; i >= 0; i--) {
/*      */       
/*  674 */       r r = (r)arrayOfObject[i];
/*      */       
/*  676 */       if (r != null) {
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  681 */         i i1 = (i)m2.get(i);
/*      */         
/*  683 */         r.bs();
/*  684 */         arrayOfObject[i] = null;
/*      */         
/*  686 */         if (paramBoolean)
/*      */         {
/*  688 */           if (!i1.v)
/*      */           {
/*  690 */             r.bU();
/*      */           }
/*      */         }
/*      */       } 
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void b(k paramk) {
/*  704 */     a(paramk, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void c(k paramk) {
/*  713 */     a(paramk, true);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(k paramk) {
/*  724 */     boolean bool = false;
/*      */     
/*  726 */     m m = paramk.v.ap;
/*      */     
/*  728 */     Object[] arrayOfObject = m.a();
/*  729 */     for (int i = m.a - 1; i >= 0; i--) {
/*      */       
/*  731 */       i i1 = (i)arrayOfObject[i];
/*      */       
/*  733 */       if (i1.w != null) {
/*      */         
/*  735 */         r r = a(paramk, i1);
/*      */         
/*  737 */         if (r != null) {
/*      */           
/*  739 */           if (i1.y) {
/*      */             continue;
/*      */           }
/*      */ 
/*      */ 
/*      */           
/*  745 */           r.bU();
/*      */         } 
/*      */ 
/*      */         
/*  749 */         m m1 = new m();
/*      */         
/*  751 */         i1.w.a(m1, paramk.bB, (af)paramk, true);
/*      */         
/*  753 */         if (m1.size() > 1) {
/*      */           
/*  755 */           l.b("onCreateSpawnUnitOf: created an extra " + (m1.size() - 1) + " units");
/*      */           
/*  757 */           for (byte b = 1; b < m1.size(); b++)
/*      */           {
/*  759 */             ((af)m1.get(b)).bU();
/*      */           }
/*      */         } 
/*      */         
/*  763 */         if (m1.size() == 0) {
/*      */           
/*  765 */           l.b("onCreateSpawnUnitOf: Warning no units created");
/*      */         
/*      */         }
/*      */         else {
/*      */           
/*  770 */           af af = (af)m1.get(0);
/*      */ 
/*      */           
/*  773 */           if (!(af instanceof r)) {
/*      */             
/*  775 */             l.b("onCreateSpawnUnitOf: Warning " + af.r().i() + " not an orderable unit type, cannot attach");
/*      */             
/*  777 */             af.bU();
/*      */           }
/*      */           else {
/*      */             
/*  781 */             r r1 = (r)af;
/*      */             
/*  783 */             if (paramk.a(r1, i1)) {
/*      */ 
/*      */               
/*  786 */               r1.cs = -9999;
/*      */ 
/*      */               
/*  789 */               if (paramk.bR < 1.0F && i1.x)
/*      */               {
/*  791 */                 r1.q(paramk.bR);
/*      */               }
/*      */ 
/*      */ 
/*      */ 
/*      */               
/*  797 */               bool = true;
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */ 
/*      */ 
/*      */       
/*      */       continue;
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  810 */     if (bool)
/*      */     {
/*  812 */       b(paramk, 0.0F);
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public strictfp void a(k paramk, l paraml) {
/*  825 */     m m1 = paramk.y;
/*      */     
/*  827 */     m m2 = paramk.v.ap;
/*      */ 
/*      */     
/*  830 */     if (m2.size() == 0) {
/*      */       
/*  832 */       paramk.y = null;
/*      */       
/*      */       return;
/*      */     } 
/*  836 */     if (m1 == null) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */     
/*      */     int i;
/*      */ 
/*      */     
/*  845 */     for (i = m1.size() - 1; i >= 0; i--) {
/*      */       
/*  847 */       r r = (r)m1.get(i);
/*      */       
/*  849 */       if (r != null)
/*      */       {
/*  851 */         if (i >= m2.size()) {
/*      */           
/*  853 */           r.bU();
/*      */           
/*  855 */           m1.remove(i);
/*      */         } 
/*      */       }
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  865 */     for (i = m1.size() - 1; i >= 0; i--) {
/*      */       
/*  867 */       r r = (r)m1.get(i);
/*  868 */       if (r != null)
/*      */       {
/*  870 */         r.cr = (i)m2.get(i);
/*      */       }
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp i a(k paramk, short paramShort) {
/*  886 */     m m = paramk.v.ap;
/*      */     
/*  888 */     if (m.a <= paramShort)
/*      */     {
/*  890 */       return null;
/*      */     }
/*  892 */     return (i)m.get(paramShort);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp r a(k paramk, i parami) {
/*  900 */     m m = paramk.y;
/*  901 */     if (m == null)
/*      */     {
/*  903 */       return null;
/*      */     }
/*  905 */     short s = parami.a;
/*      */     
/*  907 */     if (m.a <= s)
/*      */     {
/*  909 */       return null;
/*      */     }
/*  911 */     return (r)m.get(s);
/*      */   }
/*      */ 
/*      */   
/*      */   public static strictfp r a(k paramk, int paramInt) {
/*  916 */     m m = paramk.y;
/*  917 */     if (m == null)
/*      */     {
/*  919 */       return null;
/*      */     }
/*  921 */     if (m.a <= paramInt)
/*      */     {
/*  923 */       return null;
/*      */     }
/*  925 */     return (r)m.get(paramInt);
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp boolean a(k paramk, i parami, r paramr) {
/*  931 */     l l = paramk.v;
/*      */     
/*  933 */     short s = parami.a;
/*      */     
/*  935 */     if (l.ap.a <= s && paramr != null) {
/*      */       
/*  937 */       l.b("setAttachedUnitLookup: slot:" + s + " larger than max slot size:" + l.ap.a);
/*  938 */       return false;
/*      */     } 
/*      */ 
/*      */     
/*  942 */     if (paramk.y == null)
/*      */     {
/*  944 */       paramk.y = new m();
/*      */     }
/*  946 */     m m = paramk.y;
/*      */     
/*  948 */     if (m.size() == 0)
/*      */     {
/*      */       
/*  951 */       paramk.z = paramk.bL;
/*      */     }
/*      */     
/*  954 */     if (paramr == null && s >= m.size())
/*      */     {
/*      */       
/*  957 */       return true;
/*      */     }
/*      */     
/*  960 */     while (m.size() <= s)
/*      */     {
/*  962 */       m.add(null);
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  969 */     m.set(s, paramr);
/*      */ 
/*      */     
/*  972 */     return true;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static strictfp void a(k paramk, m paramm, boolean paramBoolean) {
/*  984 */     m m1 = paramk.y;
/*      */     
/*  986 */     if (m1 != null)
/*      */     {
/*  988 */       for (af af : m1) {
/*      */         
/*  990 */         if (af != null && af instanceof r) {
/*      */           
/*  992 */           i i = af.cV();
/*  993 */           if (i != null && i.N != null) {
/*      */ 
/*      */ 
/*      */             
/*  997 */             ArrayList arrayList = af.M();
/*      */             
/*  999 */             for (s s : arrayList) {
/*      */               boolean bool;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */               
/* 1008 */               if (paramBoolean) {
/*      */                 
/* 1010 */                 bool = w.a(i.N, paramk);
/*      */               }
/*      */               else {
/*      */                 
/* 1014 */                 bool = i.N.read(paramk);
/*      */               } 
/*      */               
/* 1017 */               if (bool) {
/*      */                 
/* 1019 */                 g g = new g(s, (r)af, s.J());
/* 1020 */                 paramm.add(g);
/*      */               } 
/*      */             } 
/*      */           } 
/*      */         } 
/*      */       } 
/*      */     }
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gam\\units\custom\b\h.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */