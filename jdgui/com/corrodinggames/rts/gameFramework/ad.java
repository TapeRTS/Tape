/*     */ package com.corrodinggames.rts.gameFramework;
/*     */ 
/*     */ import com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Locale;
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
/*     */ public class ad
/*     */ {
/*     */   public String a;
/*     */   public boolean b = false;
/* 537 */   public ArrayList c = new ArrayList();
/*     */   
/* 539 */   public ArrayList d = new ArrayList();
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
/*     */   public boolean a() {
/* 562 */     for (af af : this.c) {
/*     */       
/* 564 */       if (af.a == -1 && af.a())
/*     */       {
/* 566 */         return true;
/*     */       }
/*     */     } 
/* 569 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean b() {
/* 574 */     for (af af : this.c) {
/*     */       
/* 576 */       if (af != null)
/*     */       {
/* 578 */         if (af.a == -1 && af.b())
/*     */         {
/* 580 */           return true;
/*     */         }
/*     */       }
/*     */     } 
/* 584 */     return false;
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
/*     */   public String c() {
/* 618 */     for (af af : this.c) {
/*     */       
/* 620 */       if (af != null)
/*     */       {
/* 622 */         return af.c().toUpperCase();
/*     */       }
/*     */     } 
/* 625 */     return "";
/*     */   }
/*     */ 
/*     */   
/*     */   public String a(int paramInt) {
/* 630 */     if (this.c.size() > paramInt) {
/*     */       
/* 632 */       af af = this.c.get(paramInt);
/* 633 */       if (af == null)
/*     */       {
/* 635 */         return "<null>";
/*     */       }
/*     */ 
/*     */       
/* 639 */       return af.c().toUpperCase();
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 644 */     return "";
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
/*     */   public ad b(int paramInt) {
/* 660 */     boolean bool = false;
/* 661 */     return a(paramInt, 0, bool, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ad a(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 668 */     ag ag = new ag();
/* 669 */     ag.e = paramInt1;
/* 670 */     ag.a = -1;
/*     */     
/* 672 */     ag.b = paramInt3;
/*     */     
/* 674 */     if (paramBoolean)
/*     */     {
/* 676 */       ag.d = true;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 681 */     if (this.c.size() <= paramInt2)
/*     */     {
/* 683 */       this.c.add(new ak());
/*     */     }
/* 685 */     if (this.c.size() <= paramInt2)
/*     */     {
/* 687 */       this.c.add(new ak());
/*     */     }
/*     */     
/* 690 */     this.c.set(paramInt2, ag);
/*     */ 
/*     */     
/* 693 */     return this;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ad a(String paramString) {
/* 700 */     return a(paramString, -1);
/*     */   }
/*     */ 
/*     */   
/*     */   public ad a(String paramString, int paramInt) {
/* 705 */     if (paramString == null)
/*     */     {
/* 707 */       throw new RuntimeException("key==null");
/*     */     }
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
/* 720 */     return a(-1, paramString, paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ad a(int paramInt1, String paramString, int paramInt2) {
/* 726 */     if (paramString == null)
/*     */     {
/* 728 */       throw new RuntimeException("key==null");
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 734 */     ag ag = new ag();
/*     */     
/* 736 */     ag.a = paramInt1;
/*     */     
/* 738 */     ag.b = 0;
/*     */ 
/*     */     
/* 741 */     paramString = paramString.toLowerCase(Locale.ENGLISH);
/*     */     
/* 743 */     if (paramString.contains("alt+")) {
/*     */       
/* 745 */       paramString = paramString.replace("alt+", "");
/* 746 */       ag.b += 4;
/*     */     } 
/*     */     
/* 749 */     if (paramString.contains("ctrl+")) {
/*     */       
/* 751 */       paramString = paramString.replace("ctrl+", "");
/* 752 */       ag.b++;
/*     */     } 
/*     */ 
/*     */     
/* 756 */     if (paramString.contains("shift+")) {
/*     */       
/* 758 */       paramString = paramString.replace("shift+", "");
/* 759 */       ag.b += 2;
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/* 764 */       ag.e = ac.d(paramString);
/*     */       
/* 766 */       if (paramInt2 == -1)
/*     */       {
/* 768 */         this.c.add(ag);
/*     */       
/*     */       }
/*     */       else
/*     */       {
/* 773 */         if (this.c.size() <= paramInt2)
/*     */         {
/* 775 */           this.c.add(new ak());
/*     */         }
/* 777 */         if (this.c.size() <= paramInt2)
/*     */         {
/* 779 */           this.c.add(new ak());
/*     */         }
/*     */         
/* 782 */         this.c.set(paramInt2, ag);
/*     */       
/*     */       }
/*     */     
/*     */     }
/* 787 */     catch (com.corrodinggames.rts.gameFramework.utility.SlickToAndroidKeycodes.MissingKey missingKey) {
/*     */       
/* 789 */       missingKey.printStackTrace();
/*     */       
/* 791 */       l l = l.u();
/* 792 */       if (l != null)
/*     */       {
/* 794 */         l.a(missingKey.getMessage(), 1);
/*     */       }
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 800 */     return this;
/*     */   }
/*     */ 
/*     */   
/*     */   public ad b(int paramInt1, int paramInt2, int paramInt3, boolean paramBoolean) {
/* 805 */     ah ah = new ah();
/*     */     
/* 807 */     ah.a = paramInt1;
/* 808 */     ah.e = paramInt2;
/* 809 */     ah.f = paramInt3;
/* 810 */     ah.g = paramBoolean;
/*     */ 
/*     */     
/*     */     try {
/* 814 */       ah.i = ah.a(true);
/*     */     }
/* 816 */     catch (IndexOutOfBoundsException indexOutOfBoundsException) {
/*     */       
/* 818 */       l.b("Failed to bind Axis:" + paramInt3 + " on joystick:" + paramInt2);
/* 819 */       return this;
/*     */     } 
/*     */     
/* 822 */     this.c.add(ah);
/* 823 */     return this;
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
/*     */   public boolean d() {
/* 836 */     return false;
/*     */   }
/*     */ 
/*     */   
/*     */   public String e() {
/* 841 */     return this.a
/* 842 */       .replace("-", "")
/* 843 */       .replace("  ", " ")
/* 844 */       .replace("  ", " ")
/* 845 */       .replace(" ", "_").toLowerCase(Locale.ENGLISH);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\ad.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */