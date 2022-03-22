/*     */ package com.corrodinggames.rts.java;
/*     */ 
/*     */ import com.corrodinggames.librocket.a;
/*     */ import com.corrodinggames.librocket.scripts.ScriptEngine;
/*     */ import com.corrodinggames.rts.a.e;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class g
/*     */   extends e
/*     */ {
/*     */   public void c(int paramInt) {
/*  21 */     l.d("InGameActivityJava selectMenuOption: " + paramInt);
/*     */     
/*  23 */     d(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void d(String paramString) {
/*  32 */     ScriptEngine.getInstance().getRoot().makeSaveGamePopup(paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void e(String paramString) {
/*  40 */     ScriptEngine.getInstance().getRoot().makeExportMapGamePopup(paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void d(int paramInt) {
/*     */     l l;
/*  58 */     switch (paramInt) {
/*     */       
/*     */       case 4:
/*  61 */         (l.u()).bO = !(l.u()).bO;
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 2:
/*  71 */         a.a().d();
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 3:
/*  78 */         l.d("TODO");
/*     */         break;
/*     */ 
/*     */ 
/*     */       
/*     */       case 6:
/*  84 */         l = l.u();
/*  85 */         l.aV = !l.aV;
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 5:
/*  93 */         l.d("TODO");
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 12:
/* 100 */         d((String)null);
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 18:
/* 108 */         e(null);
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 9:
/* 115 */         l = l.u();
/*     */         
/* 117 */         if (!l.aY) {
/*     */           
/* 119 */           l.aY = true;
/*     */           
/*     */           break;
/*     */         } 
/* 123 */         l.aY = false;
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 19:
/* 131 */         ScriptEngine.getInstance().addScriptToQueue("mp.surrenderPrompt();");
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 10:
/* 169 */         ScriptEngine.getInstance().addScriptToQueue("mp.multiplayerExitPrompt();");
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 17:
/* 178 */         ScriptEngine.getInstance().addScriptToQueue("mp.reinviteAsk();");
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 15:
/* 193 */         ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 11:
/* 201 */         l = l.u();
/*     */         
/* 203 */         if (l.bM != null)
/*     */         {
/* 205 */           if (l.bM.h != null)
/*     */           {
/* 207 */             l.a("Briefing", l.bM.h);
/*     */           }
/*     */         }
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 13:
/* 218 */         ScriptEngine.getInstance().addScriptToQueue("makeSendMessagePopup();");
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 16:
/* 229 */         ScriptEngine.getInstance().addScriptToQueue("makeSendTeamMessagePopup();");
/*     */         break;
/*     */ 
/*     */ 
/*     */       
/*     */       case 14:
/* 235 */         l = l.u();
/*     */         
/* 237 */         if (l.bF != null)
/*     */         {
/* 239 */           l.bF.B();
/*     */         }
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 20:
/* 247 */         ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 21:
/* 254 */         ScriptEngine.getInstance().addScriptToQueue("showBattleroom();");
/*     */         break;
/*     */ 
/*     */ 
/*     */ 
/*     */       
/*     */       case 22:
/* 261 */         l = l.u();
/* 262 */         l.cB = true;
/*     */         
/* 264 */         l.bA.p = false;
/*     */         break;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void k() {
/* 276 */     ScriptEngine.getInstance().addScriptToQueue("showMainMenu();");
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */