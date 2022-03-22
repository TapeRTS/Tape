/*      */ package com.corrodinggames.rts.gameFramework.h;
/*      */ 
/*      */ import android.graphics.Point;
/*      */ import android.graphics.Rect;
/*      */ import android.util.Log;
/*      */ import com.corrodinggames.rts.game.b.b;
/*      */ import com.corrodinggames.rts.game.b.g;
/*      */ import com.corrodinggames.rts.game.units.af;
/*      */ import com.corrodinggames.rts.game.units.ah;
/*      */ import com.corrodinggames.rts.game.units.r;
/*      */ import com.corrodinggames.rts.gameFramework.bj;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import com.corrodinggames.rts.gameFramework.utility.ai;
/*      */ import com.corrodinggames.rts.gameFramework.utility.g;
/*      */ import java.util.HashMap;
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
/*      */ public final class e
/*      */ {
/*      */   private final h o;
/*      */   ah a;
/*      */   public final int b;
/*      */   public final int c;
/*      */   public byte[] d;
/*      */   public byte[] e;
/*      */   public byte[] f;
/*      */   public short[] g;
/*      */   public HashMap h;
/*      */   
/*      */   strictfp e(h paramh, ah paramah, int paramInt1, int paramInt2) {
/*   58 */     this.k = -99;
/*      */ 
/*      */     
/*   61 */     this.l = 0;
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
/*  779 */     this.n = new Point(); this.b = paramInt1; this.c = paramInt2; this.o = paramh; this.a = paramah; this.d = new byte[paramInt1 * paramInt2]; this.o.r.add(this); this.o.s = (e[])this.o.r.toArray((Object[])new e[0]); a();
/*      */   }
/*      */   public int i;
/*      */   public byte[] j;
/*      */   public int k;
/*      */   public int l; public boolean m; Point n; strictfp void a() { d(); e(); f(); } strictfp void a(r paramr) { if (paramr != null) { this.l++; if (this.l > 50) { if (!this.m) l.d("buildAndReplaceClearanceCost being skipped");  this.m = true; return; }  }  if (paramr != null) { b(paramr); return; }  long l = 0L; if (paramr == null) l = bj.a();  b b = this.o.n; byte[] arrayOfByte = this.j; if (this.j == null) paramr = null;  this.j = new byte[this.b * this.c]; short s1 = 0; short s2 = 0; short s3 = this.o.p; short s4 = this.o.q; if (paramr != null) { if (arrayOfByte != null) f.a(arrayOfByte, this.j);  b.a(paramr.dH, paramr.dI); Rect rect = paramr.bO(); short s6 = (short)b.M; short s7 = (short)b.N; s1 = (short)(s6 - 5 + rect.a); s2 = (short)(s7 - 5 + rect.b); s3 = (short)(s6 + 5 + rect.c); s4 = (short)(s7 + 5 + rect.d); }  if (s1 < 0) s1 = 0;  if (s2 < 0) s2 = 0;  if (s3 > this.o.p) s3 = this.o.p;  if (s4 > this.o.q) s4 = this.o.q;  short s5; for (s5 = s1; s5 < s3; s5 = (short)(s5 + 1)) { short s; for (s = s2; s < s4; s = (short)(s + 1)) { boolean bool = false; if (this.d[s5 * this.c + s] == -1) bool = true;  if (this.e[s5 * this.c + s] == -1) bool = true;  if (bool) { this.j[s5 * this.c + s] = 0; } else { this.j[s5 * this.c + s] = 4; }  }  }  for (s5 = s1; s5 < s3; s5 = (short)(s5 + 1)) { short s; for (s = s2; s < s4; s = (short)(s + 1)) { if (this.j[s5 * this.c + s] == 0) a(b, s5, s, this.j);  }  }  for (s5 = s1; s5 < s3; s5 = (short)(s5 + 1)) { a(b, s5, (short)-1, this.j); a(b, s5, (short)(this.o.q + 1), this.j); }  for (s5 = s2; s5 < s4; s5 = (short)(s5 + 1)) { a(b, (short)-1, s5, this.j); a(b, (short)(this.o.p + 1), s5, this.j); }  if (paramr == null) { double d = bj.a(l); if (d > 30.0D) l.d("buildAndReplaceClearanceCostNew took:" + bj.a(d) + " for:" + this.a);  }  } final strictfp void a(b paramb, short paramShort1, short paramShort2, byte[] paramArrayOfbyte) { int i = paramShort1 - 3; int j = paramShort2 - 3; int k = paramShort1 + 3; int m = paramShort2 + 3; if (i < 0) i = 0;  if (j < 0) j = 0;  if (k > paramb.y - 1) k = paramb.y - 1;  if (m > paramb.z - 1) m = paramb.z - 1;  for (int n = i; n <= k; n++) { for (int i1 = j; i1 <= m; i1++) { byte b1 = paramArrayOfbyte[n * this.c + i1]; if (b1 != 0) { int i2 = f.a(paramShort1, paramShort2, n, i1); if (i2 < b1) paramArrayOfbyte[n * this.c + i1] = (byte)i2;  }  }  }  } strictfp void b(r paramr) { long l = 0L; if (paramr == null) l = bj.a();  b b = this.o.n; byte[] arrayOfByte = this.j; if (this.j == null) paramr = null;  this.j = new byte[this.b * this.c]; short s1 = 0; short s2 = 0; short s3 = this.o.p; short s4 = this.o.q; if (paramr != null) { if (arrayOfByte != null) f.a(arrayOfByte, this.j);  b.a(paramr.dH, paramr.dI); Rect rect = paramr.bO(); short s6 = (short)b.M; short s7 = (short)b.N; s1 = (short)(s6 - 5 + rect.a); s2 = (short)(s7 - 5 + rect.b); s3 = (short)(s6 + 5 + rect.c); s4 = (short)(s7 + 5 + rect.d); }  if (s1 < 0) s1 = 0;  if (s2 < 0)
/*      */       s2 = 0;  if (s3 > this.o.p)
/*      */       s3 = this.o.p;  if (s4 > this.o.q)
/*      */       s4 = this.o.q;  short s5; for (s5 = s1; s5 < s3; s5 = (short)(s5 + 1)) { short s; for (s = s2; s < s4; s = (short)(s + 1))
/*      */         this.j[s5 * this.c + s] = a(b, s5, s);  }  if (paramr == null) { double d = bj.a(l); l.d("buildAndReplaceClearanceCost took:" + bj.a(d) + " for:" + this.a); }  } final strictfp byte a(b paramb, short paramShort1, short paramShort2) { if (this.d[paramShort1 * this.c + paramShort2] == -1)
/*      */       return 0;  int i = paramShort1 - 3; int j = paramShort2 - 3; int k = paramShort1 + 3; int m = paramShort2 + 3; int n = 4; for (int i1 = i; i1 <= k; i1++) { for (int i2 = j; i2 <= m; i2++) { boolean bool = false; if (paramb.c(i1, i2)) { if (this.d[i1 * this.c + i2] == -1)
/*      */             bool = true;  if (this.e[i1 * this.c + i2] == -1)
/*      */             bool = true;  } else { bool = true; }  if (bool) { int i3 = f.a(paramShort1, paramShort2, i1, i2); if (i3 < n)
/*  792 */             n = i3;  }  }  }  return (byte)n; } public strictfp void e() { long l = l.N();
/*      */     
/*  794 */     this.e = new byte[this.b * this.c];
/*      */     
/*  796 */     byte[] arrayOfByte = this.e;
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
/*  808 */     if (this.a.equals(ah.d)) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  819 */     b b = this.o.n;
/*      */ 
/*      */     
/*  822 */     af[] arrayOfAf = af.bj.a(); byte b1; int i;
/*  823 */     for (b1 = 0, i = af.bj.size(); b1 < i; b1++) {
/*      */       
/*  825 */       af af = arrayOfAf[b1];
/*      */       
/*  827 */       if (af.bw())
/*      */       {
/*  829 */         if (!af.bz) {
/*      */           Rect rect;
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
/*  841 */           Point point = af.a(b, this.n);
/*  842 */           int j = point.a;
/*  843 */           int k = point.b;
/*      */ 
/*      */ 
/*      */           
/*  847 */           if (this.a.equals(ah.c)) {
/*      */             
/*  849 */             rect = af.bP();
/*      */           }
/*      */           else {
/*      */             
/*  853 */             rect = af.bO();
/*      */           } 
/*      */           
/*  856 */           for (int m = j + rect.a; m <= j + rect.c; m++) {
/*      */             
/*  858 */             for (int n = k + rect.b; n <= k + rect.d; n++) {
/*      */               
/*  860 */               if (b.c(m, n))
/*      */               {
/*  862 */                 arrayOfByte[m * this.c + n] = -1; } 
/*      */             } 
/*      */           } 
/*      */         }  } 
/*      */     }  } strictfp void b() { int i = this.b; int j = this.c; this.g = new short[i * j]; this.h = new HashMap<>(); short s1 = 1; short s2; for (s2 = 0; s2 < i; s2 = (short)(s2 + 1)) { short s; for (s = 0; s < j; s = (short)(s + 1)) { if (this.g[s2 * j + s] == 0) { if (s1) { Log.d("RustedWarfare", "warning buildIsolatedGroups looped, ending"); return; }
/*      */            int k = a(s2, s, s1); if (k > 0) { this.h.put(Short.valueOf(s1), Integer.valueOf(k)); if (this.i < k)
/*      */               this.i = k;  s1 = (short)(s1 + 1); }
/*      */            }
/*      */          }
/*      */        }
/*      */      }
/*      */   strictfp int a(short paramShort1, short paramShort2, short paramShort3) { int i = this.c; b b = this.o.n; short[] arrayOfShort = this.g; byte[] arrayOfByte = this.d; if (arrayOfByte[paramShort1 * i + paramShort2] == -1) { arrayOfShort[paramShort1 * i + paramShort2] = -1; return 0; }
/*      */      if (paramShort3 == 0)
/*      */       throw new RuntimeException("id cannot be 0 is will cause can endless loop");  byte b1 = 0; g g = new g(); ai ai = new ai(paramShort1, paramShort2); g.add(ai); while (!g.isEmpty()) { ai ai1 = (ai)g.a(); short s1 = ai1.a; short s2 = ai1.b; if (b.c(s1, s2)) { int j = s1 * i + s2; if (arrayOfShort[j] == 0 && arrayOfByte[j] != -1) {
/*      */           arrayOfShort[j] = paramShort3; b1++; g.add(new ai((short)(s1 - 1), (short)s2)); g.add(new ai((short)(s1 + 1), (short)s2)); g.add(new ai((short)s1, (short)(s2 - 1))); g.add(new ai((short)s1, (short)(s2 + 1)));
/*      */         }  }
/*      */        }
/*      */      return b1; }
/*  880 */   public strictfp void f() { long l = l.N();
/*      */     
/*  882 */     int i = this.c;
/*      */     
/*  884 */     this.f = new byte[this.b * i];
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
/*  896 */     if (this.a.equals(ah.d)) {
/*      */       return;
/*      */     }
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  903 */     b b = this.o.n;
/*      */     
/*  905 */     int j = b.m;
/*  906 */     int k = b.n;
/*      */     
/*  908 */     af[] arrayOfAf = af.bj.a(); byte b1; int m;
/*  909 */     for (b1 = 0, m = af.bj.size(); b1 < m; b1++)
/*      */     
/*  911 */     { af af = arrayOfAf[b1];
/*      */       
/*  913 */       if (af.by && !af.bw() && !af.cm && !(af instanceof com.corrodinggames.rts.game.units.ae))
/*      */       {
/*  915 */         if (!af.bz && !af.i() && af.cp == null && !af.P())
/*      */         
/*  917 */         { byte b2 = 2;
/*      */           
/*  919 */           b.a(af.dH, af.dI);
/*      */           
/*  921 */           int n = b.M;
/*  922 */           int i1 = b.N;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */           
/*  931 */           float f1 = af.bO + 5.0F;
/*  932 */           float f2 = af.bO + 10.0F;
/*      */ 
/*      */           
/*  935 */           if (f2 < 10.0F) {
/*      */             
/*  937 */             b2 = 0;
/*      */           }
/*  939 */           else if (f2 < 20.0F) {
/*      */             
/*  941 */             b2 = 1;
/*      */           } 
/*      */           
/*  944 */           for (int i2 = n - b2; i2 <= n + b2; i2++)
/*      */           
/*  946 */           { for (int i3 = i1 - b2; i3 <= i1 + b2; i3++)
/*      */             
/*  948 */             { if (b.c(i2, i3))
/*      */               
/*      */               { 
/*  951 */                 b.a(i2, i3);
/*      */                 
/*  953 */                 float f3 = (b.M + j);
/*  954 */                 float f4 = (b.N + k);
/*      */                 
/*  956 */                 float f5 = f.a(f3, f4, af.dH, af.dI);
/*      */                 
/*  958 */                 byte b3 = 6;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */                 
/*  967 */                 int i4 = i2 * i + i3;
/*      */ 
/*      */                 
/*  970 */                 if (f5 < f1 * f1) {
/*      */                   
/*  972 */                   this.f[i4] = (byte)(this.f[i4] + b3);
/*      */                 }
/*  974 */                 else if (f5 < f2 * f2) {
/*      */                   
/*  976 */                   this.f[i4] = (byte)(int)(this.f[i4] + b3 * 0.333D);
/*      */                 } 
/*      */                 
/*  979 */                 if (this.f[i4] < -1)
/*      */                 {
/*  981 */                   this.f[i4] = Byte.MAX_VALUE; }  }  }  }  }  }  }  } strictfp boolean c() { return (!this.a.equals(ah.d) && !this.a.equals(ah.a)); }
/*      */   public static strictfp int a(b paramb) { com.corrodinggames.rts.game.b.e e1 = paramb.r; int i = 0; for (byte b1 = 0; b1 < e1.n; b1++) { for (byte b2 = 0; b2 < e1.o; b2++) { g g = e1.a(b1, b2); if (g != null) { int j = 0; j += g.e ? 1 : 0; j += g.h ? 2 : 0; j += g.k ? 4 : 0; j += g.g ? 8 : 0; j += g.f ? 16 : 0; i += j * (b1 + b2); }  }  }  return i; }
/*      */   strictfp void d() { b b = this.o.n; byte[] arrayOfByte = this.d; short[] arrayOfShort = b.r.a(); g[] arrayOfG = b.x; ah ah1 = this.a; int i = this.b; int j = this.c; boolean bool = c(); if (!bool) return;  boolean bool1 = (ah1.equals(ah.e) || ah1.equals(ah.f) || ah1.equals(ah.h)) ? true : false; boolean bool2 = (ah1.equals(ah.f) || ah1.equals(ah.g) || ah1.equals(ah.h)) ? true : false; boolean bool3 = (ah1.equals(ah.g) || ah1.equals(ah.h)) ? true : false; boolean bool4 = false; byte b1; for (b1 = 0; b1 < i; b1++) { for (byte b2 = 0; b2 < j; b2++) { int k = b1 * j + b2; arrayOfByte[k] = 0; short s = arrayOfShort[k]; g g1 = arrayOfG[s]; if (g1 != null) { if (g1.e && !bool1)
/*      */             arrayOfByte[k] = -1;  if (g1.h && !bool2)
/*      */             arrayOfByte[k] = -1;  if (g1.k && !bool3)
/*      */             arrayOfByte[k] = -1;  if (g1.g && !bool4)
/*      */             arrayOfByte[k] = -1;  if (ah1 == ah.e)
/*      */             if (!g1.e && !g1.f)
/*      */               arrayOfByte[k] = -1;   }  g g2 = b.e(b1, b2); if (g2 != null) { if (ah1 == ah.b)
/*      */             if (g2.i)
/*      */               arrayOfByte[k] = -1;   if (g2.k && !bool3)
/*      */             arrayOfByte[k] = -1;  if (arrayOfByte[k] == 0)
/*      */             arrayOfByte[k] = g2.j;  }  if (g1 != null)
/*      */           if (arrayOfByte[k] == 0)
/*      */             arrayOfByte[k] = g1.j;   }  }  if (b.t != null)
/*      */       for (b1 = 0; b1 < i; b1++) { for (byte b2 = 0; b2 < j; b2++) { g g = b.t.a(b1, b2); if (g != null) { arrayOfByte[b1 * j + b2] = 0; if (g.e && !bool1)
/*      */               arrayOfByte[b1 * j + b2] = -1;  if (g.h && !bool2)
/*      */               arrayOfByte[b1 * j + b2] = -1;  if (g.k && !bool3)
/*      */               arrayOfByte[b1 * j + b2] = -1;  if (g.g && !bool4)
/*      */               arrayOfByte[b1 * j + b2] = -1;  if (arrayOfByte[b1 * j + b2] == 0)
/*      */               arrayOfByte[b1 * j + b2] = g.j;  if (ah1 == ah.e)
/*      */               if (!g.e && !g.f)
/*      */                 arrayOfByte[b1 * j + b2] = -1;   }  }  }   }
/* 1004 */   public strictfp void a(boolean paramBoolean) { if (!paramBoolean) {
/*      */       return;
/*      */     }
/*      */ 
/*      */     
/* 1009 */     if (this.m) {
/*      */       
/* 1011 */       this.l = 0;
/* 1012 */       this.m = false;
/*      */       
/* 1014 */       e();
/*      */       
/* 1016 */       if (this.j != null)
/*      */       {
/* 1018 */         a((r)null);
/*      */       }
/*      */     } 
/* 1021 */     this.l = 0; }
/*      */ 
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\h\e.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */