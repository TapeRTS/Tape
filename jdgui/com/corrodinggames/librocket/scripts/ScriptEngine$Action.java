/*     */ package com.corrodinggames.librocket.scripts;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.f;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ScriptEngine$Action
/*     */ {
/*     */   public String script;
/*     */   public boolean tryToCatchCrash;
/*     */   public String caughtCrash;
/*     */   public boolean completed;
/*     */   public int framesDelay;
/*     */   
/*     */   public void run(ScriptEngine paramScriptEngine) {
/*     */     try {
/* 169 */       paramScriptEngine.processScript(this.script);
/*     */     }
/* 171 */     catch (Exception exception) {
/*     */       
/* 173 */       if (this.tryToCatchCrash)
/*     */       {
/* 175 */         l.a("caught script crash", exception);
/*     */         
/* 177 */         this.caughtCrash = f.a(exception);
/*     */       }
/*     */       else
/*     */       {
/* 181 */         throw new RuntimeException(exception);
/*     */       }
/*     */     
/*     */     } finally {
/*     */       
/* 186 */       this.completed = true;
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public String waitForCompletionOrCrash(boolean paramBoolean) {
/* 192 */     for (byte b = 0; b < 'ஸ'; b++) {
/*     */       
/* 194 */       if (this.completed)
/*     */       {
/* 196 */         return this.caughtCrash;
/*     */       }
/*     */ 
/*     */       
/*     */       try {
/* 201 */         Thread.sleep(10L);
/*     */       }
/* 203 */       catch (InterruptedException interruptedException) {
/*     */         
/* 205 */         interruptedException.printStackTrace();
/*     */       } 
/*     */       
/* 208 */       if (paramBoolean)
/*     */       {
/* 210 */         b = 0;
/*     */       }
/*     */     } 
/*     */     
/* 214 */     return "Time Out";
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\librocket\scripts\ScriptEngine$Action.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */