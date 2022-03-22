/*      */ package com.corrodinggames.rts.gameFramework.g;
/*      */ 
/*      */ import com.corrodinggames.rts.game.m;
/*      */ import com.corrodinggames.rts.gameFramework.bj;
/*      */ import com.corrodinggames.rts.gameFramework.e.a;
/*      */ import com.corrodinggames.rts.gameFramework.f;
/*      */ import com.corrodinggames.rts.gameFramework.l;
/*      */ import java.io.BufferedReader;
/*      */ import java.io.ByteArrayInputStream;
/*      */ import java.io.ByteArrayOutputStream;
/*      */ import java.io.IOException;
/*      */ import java.io.InputStream;
/*      */ import java.io.InputStreamReader;
/*      */ import java.util.ArrayList;
/*      */ import java.util.Iterator;
/*      */ import java.util.List;
/*      */ import java.util.concurrent.ExecutionException;
/*      */ import java.util.concurrent.ExecutorCompletionService;
/*      */ import java.util.concurrent.ExecutorService;
/*      */ import java.util.concurrent.Executors;
/*      */ import java.util.concurrent.Future;
/*      */ import java.util.concurrent.TimeUnit;
/*      */ import org.apache.http.HttpEntity;
/*      */ import org.apache.http.HttpResponse;
/*      */ import org.apache.http.NameValuePair;
/*      */ import org.apache.http.client.HttpClient;
/*      */ import org.apache.http.client.entity.UrlEncodedFormEntity;
/*      */ import org.apache.http.client.methods.HttpGet;
/*      */ import org.apache.http.client.methods.HttpPost;
/*      */ import org.apache.http.client.methods.HttpUriRequest;
/*      */ import org.apache.http.client.utils.URLEncodedUtils;
/*      */ import org.apache.http.message.BasicNameValuePair;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ public class n
/*      */ {
/*   81 */   public static final String[] a = new String[] { "http://gs1.corrodinggames.com/masterserver/1.4", "http://gs4.corrodinggames.net/masterserver/1.4" };
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  204 */   public static r b = new r();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static int c;
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void a(List paramList, boolean paramBoolean, s params) {
/*  264 */     a(paramList, paramBoolean, params, a);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void a(List paramList, boolean paramBoolean, s params, String[] paramArrayOfString) {
/*  278 */     params.f = paramArrayOfString.length;
/*      */ 
/*      */     
/*  281 */     byte b = 0;
/*  282 */     for (String str : paramArrayOfString) {
/*      */       
/*  284 */       b++;
/*  285 */       u u = new u(paramList, params, str, paramBoolean, b);
/*  286 */       (new Thread(u)).start();
/*      */ 
/*      */ 
/*      */       
/*  290 */       l.b("LoadFromMasterServer", b + ": Started RequestsParallelRunnable thread");
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String a(List paramList, String paramString) {
/*  413 */     if (paramList != null)
/*      */     {
/*  415 */       for (NameValuePair nameValuePair : paramList) {
/*      */         
/*  417 */         if (paramString.equals(nameValuePair.getName()))
/*      */         {
/*  419 */           return nameValuePair.getValue();
/*      */         }
/*      */       } 
/*      */     }
/*  423 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static BufferedReader a(List paramList) {
/*  429 */     return a(paramList, true, a, 10);
/*      */   }
/*      */ 
/*      */   
/*      */   public static BufferedReader a(List paramList, int paramInt) {
/*  434 */     return a(paramList, true, a, paramInt);
/*      */   }
/*      */ 
/*      */   
/*      */   public static BufferedReader a(List paramList, boolean paramBoolean, String[] paramArrayOfString, int paramInt) {
/*  439 */     String str = a(paramList, "action");
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  449 */     ExecutorService executorService = Executors.newFixedThreadPool(paramArrayOfString.length);
/*      */ 
/*      */     
/*      */     try {
/*  453 */       ExecutorCompletionService executorCompletionService = new ExecutorCompletionService(executorService);
/*  454 */       ArrayList<Future> arrayList = new ArrayList();
/*      */ 
/*      */       
/*  457 */       for (String str1 : paramArrayOfString) {
/*      */         
/*  459 */         List list = paramList;
/*      */         
/*  461 */         n$1 n$1 = new n$1(str1, list, paramBoolean);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */         
/*  483 */         Future future = executorCompletionService.submit(n$1);
/*      */         
/*  485 */         arrayList.add(future);
/*      */       } 
/*      */       
/*  488 */       int i = paramArrayOfString.length;
/*      */       
/*  490 */       t t1 = null;
/*  491 */       t t2 = null;
/*  492 */       t t3 = null;
/*      */ 
/*      */ 
/*      */       
/*  496 */       for (byte b = 0; b < i; b++) {
/*      */ 
/*      */         
/*      */         try {
/*  500 */           Future<t> future = executorCompletionService.poll(10L, TimeUnit.SECONDS);
/*  501 */           if (future == null) {
/*      */             
/*  503 */             l.b("MULTI_MASTERSERVERS: poll timed out (" + str + ")");
/*      */             
/*      */             break;
/*      */           } 
/*  507 */           t t = future.get();
/*  508 */           if (t != null) {
/*      */             
/*  510 */             t1 = t;
/*  511 */             if (t.b)
/*      */             {
/*  513 */               if (t.c) {
/*      */                 
/*  515 */                 t3 = t;
/*      */               }
/*      */               else {
/*      */                 
/*  519 */                 t2 = t;
/*      */                 
/*      */                 break;
/*      */               } 
/*      */             }
/*      */           } 
/*  525 */         } catch (ExecutionException executionException) {
/*      */           
/*  527 */           executionException.printStackTrace();
/*  528 */           if (executionException.getCause() != null)
/*      */           {
/*  530 */             executionException.getCause().printStackTrace();
/*      */           }
/*      */         }
/*  533 */         catch (InterruptedException interruptedException) {}
/*      */       } 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */       
/*  608 */       if (t2 == null && t3 != null) {
/*      */         
/*  610 */         l.b("All masterserver results included an error message (" + str + ")");
/*  611 */         t2 = t3;
/*      */       } 
/*      */       
/*  614 */       if (t2 == null) {
/*      */         
/*  616 */         l.b("No valid result found on any masterserver (" + str + ")");
/*  617 */         t2 = t1;
/*      */       } 
/*      */       
/*  620 */       if (t2 != null)
/*      */       {
/*  622 */         return t2.a;
/*      */       }
/*      */       
/*  625 */       throw new IOException("No results found (" + str + ")");
/*      */     
/*      */     }
/*      */     finally {
/*      */       
/*  630 */       executorService.shutdown();
/*      */     } 
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static t a(List paramList, String paramString, boolean paramBoolean) {
/*      */     HttpGet httpGet;
/*      */     HttpResponse httpResponse;
/*  651 */     String str1 = a(paramList, "action");
/*      */     
/*  653 */     long l = bj.a();
/*      */ 
/*      */ 
/*      */     
/*  657 */     String str2 = paramString + "/interface";
/*      */     
/*  659 */     l l1 = l.u();
/*      */     
/*  661 */     if (paramBoolean) {
/*      */       
/*  663 */       HttpPost httpPost2 = new HttpPost(str2);
/*  664 */       httpPost2.setEntity((HttpEntity)new UrlEncodedFormEntity(paramList));
/*  665 */       HttpPost httpPost1 = httpPost2;
/*      */     }
/*      */     else {
/*      */       
/*  669 */       str2 = str2 + "?" + URLEncodedUtils.format(paramList, "utf-8");
/*  670 */       HttpGet httpGet1 = new HttpGet(str2);
/*      */       
/*  672 */       httpGet = httpGet1;
/*      */     } 
/*      */ 
/*      */     
/*  676 */     String str3 = "rw ";
/*  677 */     if (l.an()) {
/*      */       
/*  679 */       str3 = str3 + "server";
/*      */     }
/*      */     else {
/*      */       
/*  683 */       str3 = str3 + (l.al() ? "pc" : "android");
/*      */     } 
/*      */     
/*  686 */     String str4 = a.c();
/*      */     
/*  688 */     str3 = str3 + " " + l1.c(true) + " " + str4;
/*      */     
/*  690 */     httpGet.setHeader("User-Agent", str3);
/*  691 */     httpGet.setHeader("Language", str4);
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  702 */     HttpClient httpClient = b.a();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*      */     try {
/*  709 */       httpResponse = httpClient.execute((HttpUriRequest)httpGet);
/*      */     }
/*  711 */     catch (NullPointerException nullPointerException) {
/*      */       
/*  713 */       l.b("doRequest: httpclient.execute threw NullPointerException, running workaround");
/*  714 */       httpClient = b.b();
/*  715 */       httpResponse = httpClient.execute((HttpUriRequest)httpGet);
/*      */     } 
/*      */ 
/*      */ 
/*      */     
/*  720 */     float f = bj.a(l);
/*      */ 
/*      */     
/*  723 */     HttpEntity httpEntity = httpResponse.getEntity();
/*      */ 
/*      */     
/*  726 */     InputStream inputStream = httpEntity.getContent();
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  731 */     ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
/*      */     
/*  733 */     byte[] arrayOfByte1 = new byte[16384]; int i;
/*  734 */     while ((i = inputStream.read(arrayOfByte1, 0, arrayOfByte1.length)) != -1) {
/*  735 */       byteArrayOutputStream.write(arrayOfByte1, 0, i);
/*      */     }
/*  737 */     byteArrayOutputStream.flush();
/*      */     
/*  739 */     inputStream.close();
/*  740 */     httpEntity.consumeContent();
/*      */ 
/*      */     
/*  743 */     byte[] arrayOfByte2 = byteArrayOutputStream.toByteArray();
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  749 */     String str5 = "CORRODINGGAMES";
/*      */     
/*  751 */     t t = new t();
/*      */ 
/*      */     
/*  754 */     String str6 = a(arrayOfByte2);
/*      */     
/*  756 */     t.b = str6.startsWith(str5);
/*      */     
/*  758 */     t.c = str6.contains("[FAILED]");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  763 */     if (!t.b || t.c) {
/*      */       
/*  765 */       String str = str2 + ((str1 != null) ? ("?action=" + str1) : "") + " (" + f + "ms)";
/*      */       
/*  767 */       if (!"list".equals(str1))
/*      */       {
/*  769 */         str = str + ":\n" + new String(arrayOfByte2);
/*      */       }
/*      */       
/*  772 */       l.d(str);
/*      */     } 
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  778 */     ByteArrayInputStream byteArrayInputStream = new ByteArrayInputStream(arrayOfByte2);
/*  779 */     BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(byteArrayInputStream));
/*      */     
/*  781 */     b.a(httpClient);
/*      */     
/*  783 */     t.a = bufferedReader;
/*      */     
/*  785 */     return t;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String a(byte[] paramArrayOfbyte) {
/*  803 */     int i = paramArrayOfbyte.length;
/*      */     
/*  805 */     for (byte b = 0; b < paramArrayOfbyte.length; b++) {
/*  806 */       if (paramArrayOfbyte[b] == 10 || paramArrayOfbyte[b] == 13) {
/*  807 */         i = b;
/*      */         
/*      */         break;
/*      */       } 
/*      */     } 
/*  812 */     return new String(paramArrayOfbyte, 0, i);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static g a(String paramString) {
/*  819 */     l l = l.u();
/*      */     
/*  821 */     if (paramString == null)
/*      */     {
/*  823 */       throw new IOException("findOrCreateServer id cannot be null");
/*      */     }
/*      */     
/*  826 */     for (g g : l.bF.bm) {
/*      */       
/*  828 */       if (paramString.equals(g.b))
/*      */       {
/*  830 */         return g;
/*      */       }
/*      */     } 
/*  833 */     return null;
/*      */   }
/*      */ 
/*      */ 
/*      */   
/*      */   public static g b(String paramString) {
/*  839 */     l l = l.u();
/*      */     
/*  841 */     if (paramString == null)
/*      */     {
/*  843 */       throw new IOException("findOrCreateServer id cannot be null");
/*      */     }
/*      */     
/*  846 */     g g1 = a(paramString);
/*  847 */     if (g1 != null)
/*      */     {
/*  849 */       return g1;
/*      */     }
/*      */     
/*  852 */     g g2 = new g();
/*  853 */     g2.b = paramString;
/*  854 */     g2.a = false;
/*  855 */     g2.n = l.bF.l();
/*  856 */     return g2;
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(Runnable paramRunnable) {
/*  865 */     l.b("LoadFromMasterServer", "Load requested");
/*      */ 
/*      */ 
/*      */ 
/*      */     
/*  870 */     q q = new q(paramRunnable);
/*  871 */     Thread thread = new Thread(q);
/*  872 */     thread.start();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*  878 */   public static Object d = new Object();
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void a(int paramInt1, int paramInt2) {
/*  884 */     l l = l.u();
/*      */     
/*  886 */     boolean bool = false;
/*      */     
/*  888 */     synchronized (d) {
/*      */ 
/*      */       
/*  891 */       Iterator<g> iterator = l.bF.bm.iterator();
/*  892 */       while (iterator.hasNext()) {
/*      */         
/*  894 */         g g = iterator.next();
/*  895 */         if (g.o < paramInt1) {
/*      */           
/*  897 */           l.b("LoadFromMasterServer", paramInt2 + ": Removing stale server with id:" + g.b);
/*      */           
/*  899 */           iterator.remove();
/*      */           
/*  901 */           bool = true;
/*      */         } 
/*      */       } 
/*      */     } 
/*      */     
/*  906 */     if (bool)
/*      */     {
/*  908 */       com.corrodinggames.rts.a.n.j();
/*      */     }
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a() {
/* 1272 */     l.b("GetOwnInfoRunnable", "getOwnInfoFromMasterServer");
/*      */     
/* 1274 */     ao.e = 6;
/*      */     
/* 1276 */     p p = new p();
/* 1277 */     Thread thread = new Thread(p);
/* 1278 */     thread.start();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   static void a(List<BasicNameValuePair> paramList, String paramString1, String paramString2) {
/* 1396 */     paramList.add(new BasicNameValuePair(paramString1, paramString2));
/*      */   }
/*      */ 
/*      */   
/*      */   static void b(List paramList) {
/* 1401 */     l l = l.u();
/*      */ 
/*      */     
/* 1404 */     a(paramList, "password_required", f.a((l.bF.m != null)));
/* 1405 */     a(paramList, "created_by", l.bF.w);
/* 1406 */     a(paramList, "private_ip", l.bF.Y());
/* 1407 */     a(paramList, "port_number", Integer.toString(l.bF.l));
/*      */     
/* 1409 */     if (l.bF.s != null) {
/*      */       
/* 1411 */       a(paramList, "game_map", l.bF.s);
/*      */     }
/*      */     else {
/*      */       
/* 1415 */       a(paramList, "game_map", l.bF.aH.b);
/*      */     } 
/*      */ 
/*      */     
/* 1419 */     ai ai = l.bF.aH.a;
/* 1420 */     if (ai == null)
/*      */     {
/* 1422 */       ai = ai.a;
/*      */     }
/*      */ 
/*      */     
/* 1426 */     a(paramList, "game_mode", ai.name());
/*      */ 
/*      */ 
/*      */     
/* 1430 */     if (!l.bF.t) {
/*      */       String str1;
/*      */ 
/*      */ 
/*      */       
/* 1435 */       if (l.bF.bf) {
/*      */         
/* 1437 */         str1 = "ingame";
/*      */ 
/*      */       
/*      */       }
/* 1441 */       else if (l.bF.aH.o) {
/*      */         
/* 1443 */         str1 = "locked";
/*      */       }
/*      */       else {
/*      */         
/* 1447 */         str1 = "battleroom";
/*      */       } 
/*      */ 
/*      */       
/* 1451 */       a(paramList, "game_status", str1);
/*      */     }
/*      */     else {
/*      */       
/* 1455 */       a(paramList, "game_status", "chat");
/*      */     } 
/*      */     
/* 1458 */     a(paramList, "player_count", Integer.toString(l.bF.x()));
/*      */ 
/*      */ 
/*      */     
/* 1462 */     String str = Integer.toString(m.a);
/*      */     
/* 1464 */     if (l.bF.t);
/*      */ 
/*      */ 
/*      */     
/* 1468 */     a(paramList, "max_player_count", str);
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void b() {
/* 1477 */     l.b("StartCreateOnMasterServer", "Create requested");
/*      */     
/* 1479 */     ao.b = 5;
/*      */     
/* 1481 */     y y = new y();
/*      */     
/* 1483 */     Thread thread = new Thread(y);
/* 1484 */     thread.start();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void c() {
/* 1617 */     aa aa = new aa();
/*      */     
/* 1619 */     Thread thread = new Thread(aa);
/* 1620 */     thread.start();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void d() {
/* 1686 */     l.b("startRemoveOnMasterServer", "Remove requested");
/*      */     
/* 1688 */     z z = new z();
/*      */     
/* 1690 */     Thread thread = new Thread(z);
/* 1691 */     thread.start();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(String paramString1, String paramString2) {
/* 1752 */     l.b("startErrorReport", "ErrorReport requested");
/*      */     
/* 1754 */     v v = new v();
/* 1755 */     v.b = paramString2;
/* 1756 */     v.a = paramString1;
/*      */     
/* 1758 */     Thread thread = new Thread(v);
/* 1759 */     thread.start();
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static String a(int paramInt) {
/* 1891 */     if (paramInt == 0)
/*      */     {
/* 1893 */       return "";
/*      */     }
/* 1895 */     if (paramInt > 0) {
/*      */       
/* 1897 */       if (paramInt < 100000)
/*      */       {
/* 1899 */         return f.a(f.b("x" + paramInt), 10);
/*      */       }
/* 1901 */       if (paramInt < 200000)
/*      */       {
/* 1903 */         return f.a(f.b("y" + paramInt), 11);
/*      */       }
/* 1905 */       if (paramInt < 300000)
/*      */       {
/* 1907 */         return f.a(f.b("z" + paramInt), 12);
/*      */       }
/*      */       
/* 1910 */       if (paramInt < 1000000)
/*      */       {
/* 1912 */         return f.a(f.b("xx" + paramInt), 13) + "-" + (l.u()).bF.f(paramInt - 300000);
/*      */       }
/*      */       
/* 1915 */       if (paramInt < 2000000)
/*      */       {
/* 1917 */         return f.a(f.b("yy" + paramInt), 14) + "-" + (l.u()).bF.f(paramInt - 1000000);
/*      */       }
/*      */     } 
/* 1920 */     return "NA";
/*      */   }
/*      */ 
/*      */ 
/*      */ 
/*      */ 
/*      */   
/*      */   public static void a(w paramw, String paramString1, int paramInt, String paramString2) {
/* 1928 */     l.d("getGameServerInfoFromMasterServer");
/*      */     
/* 1930 */     ab ab = new ab();
/*      */ 
/*      */     
/* 1933 */     ab.a = paramw;
/*      */     
/* 1935 */     ab.b = paramString1;
/*      */     
/* 1937 */     ab.c = paramInt;
/* 1938 */     ab.d = paramString2;
/*      */ 
/*      */     
/* 1941 */     Thread thread = new Thread(ab);
/* 1942 */     thread.start();
/*      */   }
/*      */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\gameFramework\g\n.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */