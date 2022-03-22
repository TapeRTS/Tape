/*    */ package com.corrodinggames.rts.gameFramework.d;
/*    */ 
/*    */ import com.corrodinggames.rts.gameFramework.bh;
/*    */ import com.corrodinggames.rts.gameFramework.f;
/*    */ import com.corrodinggames.rts.gameFramework.l;
/*    */ import java.util.ArrayList;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public class e
/*    */ {
/*    */   public String a;
/*    */   public String b;
/*    */   public float c;
/*    */   public float d;
/*    */   
/*    */   public e(String paramString1, String paramString2) {
/* 20 */     this.a = paramString1;
/* 21 */     this.b = paramString2;
/*    */   }
/*    */ 
/*    */   
/*    */   public e(String paramString, float paramFloat) {
/* 26 */     this.a = paramString;
/* 27 */     this.c = paramFloat;
/* 28 */     this.b = null;
/*    */   }
/*    */ 
/*    */ 
/*    */ 
/*    */   
/*    */   public static ArrayList a() {
/* 35 */     l l = l.u();
/*    */ 
/*    */     
/* 38 */     ArrayList<e> arrayList = new ArrayList();
/*    */     
/* 40 */     bh bh = null;
/* 41 */     if (l.bb != null)
/*    */     {
/* 43 */       bh = l.bG.a(l.bb);
/*    */     }
/*    */     
/* 46 */     if (bh != null) {
/*    */ 
/*    */ 
/*    */ 
/*    */       
/* 51 */       if (l.bM != null && l.bM.k) {
/*    */         
/* 53 */         e e2 = new e("Lasted till wave: " + l.bM.r, "");
/* 54 */         arrayList.add(e2);
/*    */         
/* 56 */         if (!l.bM.l) {
/*    */           
/* 58 */           e2 = new e("Wave difficulty: " + l.bF.c(l.bM.y), "");
/* 59 */           arrayList.add(e2);
/*    */         } 
/*    */       } 
/*    */       
/* 63 */       e e1 = new e("Game Time", f.a((l.bh / 1000)));
/* 64 */       arrayList.add(e1);
/*    */       
/* 66 */       e1 = new e("=============================", "");
/* 67 */       arrayList.add(e1);
/*    */       
/* 69 */       e1 = new e("Units Killed", bh.c);
/* 70 */       arrayList.add(e1);
/*    */       
/* 72 */       e1 = new e("Buildings Killed", bh.d);
/* 73 */       arrayList.add(e1);
/*    */       
/* 75 */       e1 = new e("Experimentals Killed", bh.e);
/* 76 */       arrayList.add(e1);
/*    */       
/* 78 */       e1 = new e("=============================", "");
/* 79 */       arrayList.add(e1);
/*    */       
/* 81 */       e1 = new e("Units Lost", bh.f);
/* 82 */       arrayList.add(e1);
/*    */       
/* 84 */       e1 = new e("Buildings Lost", bh.g);
/* 85 */       arrayList.add(e1);
/*    */       
/* 87 */       e1 = new e("Experimentals Lost", bh.h);
/* 88 */       arrayList.add(e1);
/*    */       
/* 90 */       e1 = new e("=============================", "");
/* 91 */       arrayList.add(e1);
/*    */     } 
/*    */     
/* 94 */     return arrayList;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\d\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */