/*    */ package com.corrodinggames.rts.java;
/*    */ 
/*    */ import com.corrodinggames.rts.gameFramework.g.r;
/*    */ import org.apache.http.client.HttpClient;
/*    */ import org.apache.http.client.config.RequestConfig;
/*    */ import org.apache.http.impl.client.HttpClientBuilder;
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
/*    */ public class j
/*    */   extends r
/*    */ {
/*    */   public HttpClient a(int paramInt, boolean paramBoolean) {
/* 24 */     RequestConfig.Builder builder = RequestConfig.custom();
/* 25 */     builder = builder.setConnectTimeout(paramInt);
/* 26 */     builder = builder.setConnectionRequestTimeout(paramInt);
/*    */     
/* 28 */     HttpClientBuilder httpClientBuilder = HttpClientBuilder.create();
/* 29 */     httpClientBuilder.setDefaultRequestConfig(builder.build());
/* 30 */     return (HttpClient)httpClientBuilder.build();
/*    */   }
/*    */   
/*    */   public void a(HttpClient paramHttpClient) {}
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\j.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */