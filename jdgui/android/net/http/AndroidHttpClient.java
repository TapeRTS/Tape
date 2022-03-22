/*     */ package android.net.http;
/*     */ 
/*     */ import android.content.Context;
/*     */ import android.net.SSLCertificateSocketFactory;
/*     */ import android.net.SSLSessionCache;
/*     */ import android.util.Base64;
/*     */ import android.util.Log;
/*     */ import java.io.ByteArrayOutputStream;
/*     */ import java.net.URI;
/*     */ import org.apache.http.Header;
/*     */ import org.apache.http.HttpEntity;
/*     */ import org.apache.http.HttpEntityEnclosingRequest;
/*     */ import org.apache.http.HttpHost;
/*     */ import org.apache.http.HttpRequest;
/*     */ import org.apache.http.HttpRequestInterceptor;
/*     */ import org.apache.http.HttpResponse;
/*     */ import org.apache.http.client.HttpClient;
/*     */ import org.apache.http.client.ResponseHandler;
/*     */ import org.apache.http.client.methods.HttpUriRequest;
/*     */ import org.apache.http.client.params.HttpClientParams;
/*     */ import org.apache.http.conn.ClientConnectionManager;
/*     */ import org.apache.http.conn.scheme.PlainSocketFactory;
/*     */ import org.apache.http.conn.scheme.Scheme;
/*     */ import org.apache.http.conn.scheme.SchemeRegistry;
/*     */ import org.apache.http.conn.scheme.SocketFactory;
/*     */ import org.apache.http.impl.client.RequestWrapper;
/*     */ import org.apache.http.impl.conn.tsccm.ThreadSafeClientConnManager;
/*     */ import org.apache.http.params.BasicHttpParams;
/*     */ import org.apache.http.params.HttpConnectionParams;
/*     */ import org.apache.http.params.HttpParams;
/*     */ import org.apache.http.params.HttpProtocolParams;
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
/*     */ public final class AndroidHttpClient
/*     */   implements HttpClient
/*     */ {
/*  82 */   public static long a = 256L;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  89 */   private static String[] b = new String[] { "text/", "application/xml", "application/json" };
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*  96 */   private static final HttpRequestInterceptor c = new AndroidHttpClient$1();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private final HttpClient d;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static AndroidHttpClient a(String paramString, Context paramContext) {
/* 115 */     BasicHttpParams basicHttpParams = new BasicHttpParams();
/*     */ 
/*     */ 
/*     */     
/* 119 */     HttpConnectionParams.setStaleCheckingEnabled((HttpParams)basicHttpParams, false);
/*     */     
/* 121 */     HttpConnectionParams.setConnectionTimeout((HttpParams)basicHttpParams, 60000);
/* 122 */     HttpConnectionParams.setSoTimeout((HttpParams)basicHttpParams, 60000);
/* 123 */     HttpConnectionParams.setSocketBufferSize((HttpParams)basicHttpParams, 8192);
/*     */ 
/*     */ 
/*     */     
/* 127 */     HttpClientParams.setRedirecting((HttpParams)basicHttpParams, false);
/*     */ 
/*     */     
/* 130 */     SSLSessionCache sSLSessionCache = (paramContext == null) ? null : new SSLSessionCache(paramContext);
/*     */ 
/*     */     
/* 133 */     HttpProtocolParams.setUserAgent((HttpParams)basicHttpParams, paramString);
/* 134 */     SchemeRegistry schemeRegistry = new SchemeRegistry();
/* 135 */     schemeRegistry.register(new Scheme("http", 
/* 136 */           (SocketFactory)PlainSocketFactory.getSocketFactory(), 80));
/* 137 */     schemeRegistry.register(new Scheme("https", 
/* 138 */           (SocketFactory)SSLCertificateSocketFactory.getHttpSocketFactory(60000, sSLSessionCache), 443));
/*     */ 
/*     */     
/* 141 */     ThreadSafeClientConnManager threadSafeClientConnManager = new ThreadSafeClientConnManager((HttpParams)basicHttpParams, schemeRegistry);
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 146 */     return new AndroidHttpClient((ClientConnectionManager)threadSafeClientConnManager, (HttpParams)basicHttpParams);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static AndroidHttpClient a(String paramString) {
/* 155 */     return a(paramString, (Context)null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 160 */   private RuntimeException e = new IllegalStateException("AndroidHttpClient created and never closed");
/*     */   private volatile b f;
/*     */   
/*     */   private AndroidHttpClient(ClientConnectionManager paramClientConnectionManager, HttpParams paramHttpParams) {
/* 164 */     this.d = (HttpClient)new AndroidHttpClient$2(this, paramClientConnectionManager, paramHttpParams);
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
/*     */   protected void finalize() {
/* 196 */     super.finalize();
/* 197 */     if (this.e != null) {
/* 198 */       Log.b("AndroidHttpClient", "Leak found", this.e);
/* 199 */       this.e = null;
/*     */     } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void a() {
/* 239 */     if (this.e != null) {
/* 240 */       getConnectionManager().shutdown();
/* 241 */       this.e = null;
/*     */     } 
/*     */   }
/*     */   
/*     */   public HttpParams getParams() {
/* 246 */     return this.d.getParams();
/*     */   }
/*     */   
/*     */   public ClientConnectionManager getConnectionManager() {
/* 250 */     return this.d.getConnectionManager();
/*     */   }
/*     */   
/*     */   public HttpResponse execute(HttpUriRequest paramHttpUriRequest) {
/* 254 */     return this.d.execute(paramHttpUriRequest);
/*     */   }
/*     */ 
/*     */   
/*     */   public HttpResponse execute(HttpUriRequest paramHttpUriRequest, HttpContext paramHttpContext) {
/* 259 */     return this.d.execute(paramHttpUriRequest, paramHttpContext);
/*     */   }
/*     */ 
/*     */   
/*     */   public HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest) {
/* 264 */     return this.d.execute(paramHttpHost, paramHttpRequest);
/*     */   }
/*     */ 
/*     */   
/*     */   public HttpResponse execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, HttpContext paramHttpContext) {
/* 269 */     return this.d.execute(paramHttpHost, paramHttpRequest, paramHttpContext);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object execute(HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler) {
/* 275 */     return this.d.execute(paramHttpUriRequest, paramResponseHandler);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object execute(HttpUriRequest paramHttpUriRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext) {
/* 281 */     return this.d.execute(paramHttpUriRequest, paramResponseHandler, paramHttpContext);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler) {
/* 287 */     return this.d.execute(paramHttpHost, paramHttpRequest, paramResponseHandler);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Object execute(HttpHost paramHttpHost, HttpRequest paramHttpRequest, ResponseHandler paramResponseHandler, HttpContext paramHttpContext) {
/* 293 */     return this.d.execute(paramHttpHost, paramHttpRequest, paramResponseHandler, paramHttpContext);
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static String b(HttpUriRequest paramHttpUriRequest, boolean paramBoolean) {
/* 406 */     StringBuilder stringBuilder = new StringBuilder();
/*     */     
/* 408 */     stringBuilder.append("curl ");
/*     */ 
/*     */     
/* 411 */     stringBuilder.append("-X ");
/* 412 */     stringBuilder.append(paramHttpUriRequest.getMethod());
/* 413 */     stringBuilder.append(" ");
/*     */     
/* 415 */     for (Header header : paramHttpUriRequest.getAllHeaders()) {
/* 416 */       if (paramBoolean || (
/* 417 */         !header.getName().equals("Authorization") && 
/* 418 */         !header.getName().equals("Cookie"))) {
/*     */ 
/*     */         
/* 421 */         stringBuilder.append("--header \"");
/* 422 */         stringBuilder.append(header.toString().trim());
/* 423 */         stringBuilder.append("\" ");
/*     */       } 
/*     */     } 
/* 426 */     URI uRI = paramHttpUriRequest.getURI();
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 431 */     if (paramHttpUriRequest instanceof RequestWrapper) {
/* 432 */       HttpRequest httpRequest = ((RequestWrapper)paramHttpUriRequest).getOriginal();
/* 433 */       if (httpRequest instanceof HttpUriRequest) {
/* 434 */         uRI = ((HttpUriRequest)httpRequest).getURI();
/*     */       }
/*     */     } 
/*     */     
/* 438 */     stringBuilder.append("\"");
/* 439 */     stringBuilder.append(uRI);
/* 440 */     stringBuilder.append("\"");
/*     */     
/* 442 */     if (paramHttpUriRequest instanceof HttpEntityEnclosingRequest) {
/* 443 */       HttpEntityEnclosingRequest httpEntityEnclosingRequest = (HttpEntityEnclosingRequest)paramHttpUriRequest;
/*     */       
/* 445 */       HttpEntity httpEntity = httpEntityEnclosingRequest.getEntity();
/* 446 */       if (httpEntity != null && httpEntity.isRepeatable()) {
/* 447 */         if (httpEntity.getContentLength() < 1024L) {
/* 448 */           ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/* 449 */           httpEntity.writeTo(byteArrayOutputStream);
/*     */           
/* 451 */           if (a(paramHttpUriRequest)) {
/* 452 */             String str = Base64.encodeToString(byteArrayOutputStream.toByteArray(), 2);
/* 453 */             stringBuilder.insert(0, "echo '" + str + "' | base64 -d > /tmp/$$.bin; ");
/* 454 */             stringBuilder.append(" --data-binary @/tmp/$$.bin");
/*     */           } else {
/* 456 */             String str = byteArrayOutputStream.toString();
/* 457 */             stringBuilder.append(" --data-ascii \"")
/* 458 */               .append(str)
/* 459 */               .append("\"");
/*     */           } 
/*     */         } else {
/* 462 */           stringBuilder.append(" [TOO MUCH DATA TO INCLUDE]");
/*     */         } 
/*     */       }
/*     */     } 
/*     */     
/* 467 */     return stringBuilder.toString();
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean a(HttpUriRequest paramHttpUriRequest) {
/* 472 */     Header[] arrayOfHeader = paramHttpUriRequest.getHeaders("content-encoding");
/* 473 */     if (arrayOfHeader != null) {
/* 474 */       for (Header header : arrayOfHeader) {
/* 475 */         if ("gzip".equalsIgnoreCase(header.getValue())) {
/* 476 */           return true;
/*     */         }
/*     */       } 
/*     */     }
/*     */     
/* 481 */     arrayOfHeader = paramHttpUriRequest.getHeaders("content-type");
/* 482 */     if (arrayOfHeader != null) {
/* 483 */       for (Header header : arrayOfHeader) {
/* 484 */         for (String str : b) {
/* 485 */           if (header.getValue().startsWith(str)) {
/* 486 */             return false;
/*     */           }
/*     */         } 
/*     */       } 
/*     */     }
/* 491 */     return true;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\net\http\AndroidHttpClient.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */