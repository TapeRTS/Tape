/*     */ package com.corrodinggames.rts.gameFramework.g;
/*     */ 
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
/*     */ public class g
/*     */ {
/*     */   public boolean a;
/*     */   public String b;
/*     */   public String c;
/*     */   public String d;
/*     */   public String e;
/*     */   public String f;
/*     */   public int g;
/*     */   public boolean h;
/*  28 */   public long i = -1L;
/*     */   
/*     */   public String j;
/*     */   
/*     */   public String k;
/*     */   
/*     */   public boolean l;
/*     */   
/*     */   public String m;
/*     */   
/*     */   public long n;
/*     */   
/*     */   public int o;
/*     */   
/*     */   public String p;
/*     */   
/*     */   public String q;
/*     */   
/*     */   public String r;
/*     */   
/*     */   public String s;
/*     */   
/*     */   public String t;
/*  51 */   public int u = -1;
/*  52 */   public int v = 8;
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean w;
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean x;
/*     */ 
/*     */ 
/*     */   
/*     */   public String y;
/*     */ 
/*     */   
/*     */   public int z;
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean a() {
/*  72 */     l l = l.u();
/*     */ 
/*     */     
/*  75 */     String str = l.bF.by;
/*     */     
/*  77 */     if (str != null) {
/*     */       
/*  79 */       if (str.equals(this.b))
/*     */       {
/*  81 */         return true;
/*     */       }
/*     */ 
/*     */       
/*  85 */       return false;
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
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 102 */     return false;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public String b() {
/* 108 */     String str1 = c();
/* 109 */     if (str1 != null) {
/*     */       
/* 111 */       String str4 = "";
/* 112 */       String str5 = this.f;
/* 113 */       if (str5 != null)
/*     */       {
/* 115 */         str5 = str5.replace("\\n", "\n");
/*     */       }
/* 117 */       str4 = str4 + str5 + "\n";
/* 118 */       str4 = str4 + "Url: " + str1 + "\n";
/* 119 */       return str4;
/*     */     } 
/*     */     
/* 122 */     String str2 = "";
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 127 */     if (this.a)
/*     */     {
/* 129 */       str2 = str2 + "Lan: " + this.d + ":" + this.g + "\n";
/*     */     }
/* 131 */     str2 = str2 + "User: " + this.m + "\n";
/*     */     
/* 133 */     String str3 = com.corrodinggames.rts.a.g.d(this.p);
/*     */     
/* 135 */     str2 = str2 + "Map: " + str3 + "\n";
/*     */     
/* 137 */     if (this.l)
/*     */     {
/* 139 */       str2 = str2 + "Password Required\n";
/*     */     }
/*     */     
/* 142 */     if (!this.h && !this.a)
/*     */     {
/* 144 */       str2 = str2 + "Port: not open (Connecting over the internet may fail)\n";
/*     */     }
/*     */     
/* 147 */     if ("ANY".equalsIgnoreCase(this.k)) {
/*     */       
/* 149 */       str2 = str2 + "Version: " + this.k + "\n";
/*     */     }
/*     */     else {
/*     */       
/* 153 */       str2 = str2 + "Version: v" + this.k + (g() ? "" : " (different game version!)") + "\n";
/*     */     } 
/*     */     
/* 156 */     if (this.y != null && !this.y.equals(""))
/*     */     {
/* 158 */       str2 = str2 + "Mods Needed: " + this.y + "\n";
/*     */     }
/*     */     
/* 161 */     return str2;
/*     */   }
/*     */ 
/*     */   
/*     */   public String c() {
/* 166 */     return this.e;
/*     */   }
/*     */ 
/*     */   
/*     */   public boolean d() {
/* 171 */     return (this.e != null);
/*     */   }
/*     */ 
/*     */   
/*     */   public String e() {
/* 176 */     if (this.z == 0)
/*     */     {
/* 178 */       return this.c + ":" + this.g;
/*     */     }
/* 180 */     return "get|" + this.b.replace("|", ".") + "|" + this.z + "|" + this.l + "|" + this.g;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String f() {
/* 187 */     return this.d + ":" + this.g;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean g() {
/* 193 */     l l = l.u();
/* 194 */     if (this.w && "ANY".equals(this.k))
/*     */     {
/* 196 */       return true;
/*     */     }
/* 198 */     return ("" + l.c(true)).equals(this.j);
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\g.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */