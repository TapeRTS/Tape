/*     */ package android.net.http;
/*     */ 
/*     */ import org.apache.http.conn.ClientConnectionManager;
/*     */ import org.apache.http.impl.client.DefaultHttpClient;
/*     */ import org.apache.http.params.HttpParams;
/*     */ import org.apache.http.protocol.BasicHttpContext;
/*     */ import org.apache.http.protocol.BasicHttpProcessor;
/*     */ import org.apache.http.protocol.HttpContext;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ class AndroidHttpClient$2
/*     */   extends DefaultHttpClient
/*     */ {
/*     */   AndroidHttpClient$2(AndroidHttpClient paramAndroidHttpClient, ClientConnectionManager paramClientConnectionManager, HttpParams paramHttpParams) {
/* 164 */     super(paramClientConnectionManager, paramHttpParams);
/*     */   }
/*     */   
/*     */   protected BasicHttpProcessor createHttpProcessor() {
/* 168 */     BasicHttpProcessor basicHttpProcessor = super.createHttpProcessor();
/* 169 */     basicHttpProcessor.addRequestInterceptor(AndroidHttpClient.b());
/* 170 */     basicHttpProcessor.addRequestInterceptor(new a(this.a, null));
/*     */     
/* 172 */     return basicHttpProcessor;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   protected HttpContext createHttpContext() {
/* 179 */     BasicHttpContext basicHttpContext = new BasicHttpContext();
/* 180 */     basicHttpContext.setAttribute("http.authscheme-registry", 
/*     */         
/* 182 */         getAuthSchemes());
/* 183 */     basicHttpContext.setAttribute("http.cookiespec-registry", 
/*     */         
/* 185 */         getCookieSpecs());
/* 186 */     basicHttpContext.setAttribute("http.auth.credentials-provider", 
/*     */         
/* 188 */         getCredentialsProvider());
/* 189 */     return (HttpContext)basicHttpContext;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\net\http\AndroidHttpClient$2.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */