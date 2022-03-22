/*     */ package com.corrodinggames.rts.gameFramework.g;
/*     */ 
/*     */ import android.net.http.AndroidHttpClient;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.util.concurrent.TimeUnit;
/*     */ import java.util.concurrent.locks.ReentrantLock;
/*     */ import org.apache.http.client.HttpClient;
/*     */ import org.apache.http.impl.client.DefaultHttpClient;
/*     */ import org.apache.http.params.HttpConnectionParams;
/*     */ import org.apache.http.params.HttpParams;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class r
/*     */ {
/* 118 */   ReentrantLock a = new ReentrantLock();
/*     */ 
/*     */   
/*     */   public HttpClient a() {
/* 122 */     return a(30000, false);
/*     */   }
/*     */ 
/*     */   
/*     */   public HttpClient b() {
/* 127 */     return a(30000, true);
/*     */   }
/*     */   
/*     */   public HttpClient a(int paramInt, boolean paramBoolean) {
/*     */     DefaultHttpClient defaultHttpClient;
/* 132 */     boolean bool = false;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 138 */       bool = this.a.tryLock(300L, TimeUnit.MILLISECONDS);
/*     */     }
/* 140 */     catch (InterruptedException interruptedException) {
/* 141 */       interruptedException.printStackTrace();
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/* 146 */       if (!bool)
/*     */       {
/* 148 */         l.b("LoadFromMasterServer", "Could not get getNewHttpClient lock! another thread maybe stuck in getNewHttpClient!");
/*     */       }
/*     */       
/* 151 */       if (!paramBoolean) {
/*     */         
/* 153 */         AndroidHttpClient androidHttpClient = AndroidHttpClient.a(null);
/*     */       }
/*     */       else {
/*     */         
/* 157 */         defaultHttpClient = new DefaultHttpClient();
/*     */       } 
/*     */       
/* 160 */       HttpParams httpParams = defaultHttpClient.getParams();
/* 161 */       HttpConnectionParams.setConnectionTimeout(httpParams, paramInt);
/* 162 */       HttpConnectionParams.setSoTimeout(httpParams, 20000);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     }
/*     */     finally {
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 185 */       if (bool)
/*     */       {
/* 187 */         this.a.unlock();
/*     */       }
/*     */     } 
/*     */     
/* 191 */     return (HttpClient)defaultHttpClient;
/*     */   }
/*     */ 
/*     */   
/*     */   public void a(HttpClient paramHttpClient) {
/* 196 */     if (paramHttpClient instanceof AndroidHttpClient) {
/*     */       
/* 198 */       AndroidHttpClient androidHttpClient = (AndroidHttpClient)paramHttpClient;
/* 199 */       androidHttpClient.a();
/*     */     } 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\r.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */