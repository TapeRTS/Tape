/*    */ package com.corrodinggames.rts.java;
/*    */ 
/*    */ import com.corrodinggames.rts.gameFramework.ar;
/*    */ import com.corrodinggames.rts.gameFramework.c.a;
/*    */ import com.corrodinggames.rts.java.audio.Music;
/*    */ import com.corrodinggames.rts.java.audio.a.a;
/*    */ import java.io.InputStream;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class l
/*    */   extends ar
/*    */ {
/*    */   k a;
/*    */   Music c;
/*    */   
/*    */   public l(String paramString, k paramk) {
/* 45 */     super(paramString, paramk);
/*    */     
/* 47 */     this.a = paramk;
/*    */     
/* 49 */     synchronized (paramk.f()) {
/*    */ 
/*    */       
/* 52 */       this.a = paramk;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 63 */       String str = a.c(paramString);
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 68 */       if (str.contains(".rwmod")) {
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */         
/* 74 */         this.c = (Music)paramk.b.newMusic(new a((InputStream)a.h(paramString), str));
/*    */       }
/*    */       else {
/*    */         
/* 78 */         this.c = (Music)paramk.b.newMusic(new a(str));
/*    */       } 
/*    */     } 
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\l.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */