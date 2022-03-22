/*     */ package com.corrodinggames.librocket.scripts;
/*     */ 
/*     */ import com.corrodinggames.librocket.a;
/*     */ import com.corrodinggames.librocket.b;
/*     */ import com.corrodinggames.rts.b.a;
/*     */ import com.corrodinggames.rts.gameFramework.f;
/*     */ import com.corrodinggames.rts.gameFramework.l;
/*     */ import java.lang.reflect.InvocationTargetException;
/*     */ import java.lang.reflect.Method;
/*     */ import java.util.ArrayList;
/*     */ import java.util.HashMap;
/*     */ import java.util.Iterator;
/*     */ import java.util.regex.Matcher;
/*     */ import java.util.regex.Pattern;
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ public class ScriptEngine
/*     */ {
/*     */   b slickLibRocket;
/*     */   private Root root;
/*     */   static ScriptEngine scriptEngine;
/*     */   static boolean mainScriptThreadMarked;
/*     */   
/*     */   public static boolean isStrict() {
/*  35 */     if (a.a())
/*     */     {
/*  37 */       return true;
/*     */     }
/*  39 */     return false;
/*     */   }
/*     */   
/*  42 */   static ThreadLocal isMainScriptThread = new ScriptEngine$1();
/*     */   
/*     */   ArrayList queuedScripts;
/*     */   ArrayList runningScripts;
/*     */   static Throwable scriptError;
/*     */   static String scriptErrorMessage;
/*     */   HashMap globals;
/*     */   
/*     */   public static void checkThreadAccess() {
/*  51 */     if (!((Boolean)isMainScriptThread.get()).booleanValue()) {
/*     */       
/*  53 */       l.b("ScriptEngine: thread is not marked as main script thread!");
/*  54 */       l.M();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   public Root getRoot() {
/*  60 */     checkThreadAccess();
/*  61 */     return this.root;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public Root getRootNoCheck() {
/*  67 */     return this.root;
/*     */   }
/*     */ 
/*     */   
/*     */   public static ScriptEngine getInstance() {
/*  72 */     return scriptEngine;
/*     */   }
/*     */ 
/*     */   
/*     */   public static ScriptEngine createScriptEngine(b paramb) {
/*  77 */     if (scriptEngine != null)
/*     */     {
/*  79 */       throw new RuntimeException("scriptEngine already exists");
/*     */     }
/*     */     
/*  82 */     scriptEngine = new ScriptEngine(paramb);
/*  83 */     return scriptEngine;
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
/*     */   public void setupScriptContext(ScriptContext paramScriptContext) {
/*     */     paramScriptContext.libRocket = this.slickLibRocket;
/*     */     paramScriptContext.guiEngine = a.a();
/*     */     paramScriptContext.scriptEngine = this;
/*     */     Method[] arrayOfMethod = paramScriptContext.getClass().getMethods();
/*     */     for (Method method : arrayOfMethod) {
/*     */       String str = method.getName();
/*     */       if (!str.equals("wait") && !str.equals("getClass")) {
/*     */         if (paramScriptContext.methods.get(str) != null) {
/*     */           logError("method: " + str + " already exists");
/*     */         }
/*     */         paramScriptContext.methods.put(str, method);
/*     */       } 
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void update(float paramFloat) {
/*     */     if (!mainScriptThreadMarked) {
/*     */       mainScriptThreadMarked = true;
/*     */       isMainScriptThread.set(Boolean.valueOf(true));
/*     */     } 
/*     */     if (this.queuedScripts.size() != 0) {
/*     */       synchronized (this.queuedScripts) {
/*     */         for (Iterator<ScriptEngine$Action> iterator = this.queuedScripts.iterator(); iterator.hasNext(); ) {
/*     */           ScriptEngine$Action scriptEngine$Action = iterator.next();
/*     */           if (scriptEngine$Action.framesDelay > 0) {
/*     */             scriptEngine$Action.framesDelay--;
/*     */             continue;
/*     */           } 
/*     */           this.runningScripts.add(scriptEngine$Action);
/*     */           iterator.remove();
/*     */         } 
/*     */       } 
/*     */       for (ScriptEngine$Action scriptEngine$Action : this.runningScripts) {
/*     */         scriptEngine$Action.run(this);
/*     */       }
/*     */       this.runningScripts.clear();
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ScriptEngine$Action addScriptToQueue(String paramString, boolean paramBoolean) {
/*     */     synchronized (this.queuedScripts) {
/*     */       ScriptEngine$Action scriptEngine$Action = new ScriptEngine$Action();
/*     */       scriptEngine$Action.script = paramString;
/*     */       scriptEngine$Action.tryToCatchCrash = paramBoolean;
/*     */       this.queuedScripts.add(scriptEngine$Action);
/*     */       return scriptEngine$Action;
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
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private ScriptEngine(b paramb) {
/* 302 */     this.queuedScripts = new ArrayList();
/* 303 */     this.runningScripts = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 564 */     this.globals = new HashMap<>(); this.slickLibRocket = paramb; this.root = new Root(); setupScriptContext(this.root); setGlobalVariable("root", this.root); Multiplayer multiplayer = new Multiplayer(this.root); setupScriptContext(multiplayer); setGlobalVariable("multiplayer", multiplayer); setGlobalVariable("mp", multiplayer); this.root.multiplayer = multiplayer; Mods mods = new Mods(this.root); setupScriptContext(mods); setGlobalVariable("mods", mods); if (a.a()) { Debug debug = new Debug(this.root); setupScriptContext(debug); setGlobalVariable("debug", debug); }
/*     */   
/*     */   } public ScriptEngine$Action addScriptToQueueIfNotAlreadyQueued(String paramString) { synchronized (this.queuedScripts) { for (ScriptEngine$Action scriptEngine$Action : this.queuedScripts) { if (paramString.equals(scriptEngine$Action.script))
/*     */           return null;  }
/*     */        return addScriptToQueue(paramString, false); }
/*     */      } public ScriptEngine$Action addScriptToQueue(String paramString) { return addScriptToQueue(paramString, false); }
/* 570 */   public void printMetadata(HashMap paramHashMap) { if (paramHashMap == null)
/*     */     
/* 572 */     { System.out.println("No metadata"); }
/*     */     
/*     */     else
/*     */     
/* 576 */     { String str = "";
/* 577 */       for (String str1 : paramHashMap.keySet())
/*     */       {
/* 579 */         str = str + str1 + ",";
/*     */       }
/* 581 */       System.out.println("metadata:" + str); }  } public ScriptEngine$Action addRunnableToQueue(Runnable paramRunnable) { synchronized (this.queuedScripts) { ScriptEngine$RunnableAction scriptEngine$RunnableAction = new ScriptEngine$RunnableAction(paramRunnable); this.queuedScripts.add(scriptEngine$RunnableAction); return scriptEngine$RunnableAction; }  }
/*     */   public void processScript(String paramString) { if (!"mp.refreshUI()".equals(paramString))
/*     */       System.out.println("ScriptEngine:HandleEvent:" + paramString);  try { String[] arrayOfString = f.c(paramString, ';'); for (String str : arrayOfString)
/*     */         processArg(str);  } catch (Exception exception) { throwDelayedException("Found error running:" + paramString, exception); throw new RuntimeException(exception); }
/*     */      }
/*     */   public static void throwDelayedException(String paramString, Throwable paramThrowable) { l.a("throwDelayedException", paramThrowable); if (scriptError == null) { scriptError = paramThrowable; scriptErrorMessage = paramString; }
/*     */      }
/* 588 */   public Object getScriptVariable(String paramString, boolean paramBoolean) { if (this.slickLibRocket.d() != null) {
/*     */ 
/*     */       
/* 591 */       Object object1 = this.slickLibRocket.d().getMetadata(paramString);
/* 592 */       if (object1 != null)
/*     */       {
/* 594 */         return object1;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 599 */       if (paramBoolean) {
/*     */         
/* 601 */         System.out.println("getScriptVariable: alert");
/* 602 */         printMetadata((this.slickLibRocket.d()).metadata);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 608 */     if (this.slickLibRocket.c() != null) {
/*     */ 
/*     */       
/* 611 */       Object object1 = this.slickLibRocket.c().getMetadata(paramString);
/* 612 */       if (object1 != null)
/*     */       {
/* 614 */         return object1;
/*     */       }
/*     */ 
/*     */ 
/*     */       
/* 619 */       if (paramBoolean) {
/*     */         
/* 621 */         System.out.println("getScriptVariable: popup");
/* 622 */         printMetadata((this.slickLibRocket.c()).metadata);
/*     */       } 
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 629 */     Object object = this.slickLibRocket.b(paramString);
/* 630 */     if (object != null)
/*     */     {
/* 632 */       return object;
/*     */     }
/*     */ 
/*     */     
/* 636 */     if (paramBoolean) {
/*     */       
/* 638 */       System.out.println("getScriptVariable: document");
/* 639 */       printMetadata(this.slickLibRocket.getActiveDocumentMetadata());
/*     */     } 
/*     */ 
/*     */     
/* 643 */     object = this.globals.get(paramString);
/* 644 */     if (object != null)
/*     */     {
/* 646 */       return object;
/*     */     }
/*     */ 
/*     */     
/* 650 */     if (paramBoolean) {
/*     */       
/* 652 */       System.out.println("getScriptVariable: globals");
/* 653 */       printMetadata(this.globals);
/*     */     } 
/*     */ 
/*     */     
/* 657 */     return null; }
/*     */    public void checkForErrors() {
/*     */     if (scriptError != null)
/*     */       throw new RuntimeException(scriptErrorMessage, scriptError); 
/*     */   }
/* 662 */   public void setLocalVariable(String paramString, Object paramObject) { HashMap<String, Object> hashMap = this.slickLibRocket.getActiveDocumentMetadata();
/* 663 */     hashMap.put(paramString, paramObject); } public Matcher match(String paramString1, String paramString2) { Pattern pattern = Pattern.compile(paramString1);
/*     */     Matcher matcher = pattern.matcher(paramString2);
/*     */     if (matcher.matches())
/*     */       return matcher; 
/*     */     return null; }
/* 668 */   public void setGlobalVariable(String paramString, Object paramObject) { HashMap<String, Object> hashMap = this.globals;
/* 669 */     hashMap.put(paramString, paramObject); }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public Object processFunction(String paramString, Matcher paramMatcher) {
/*     */     String[] arrayOfString;
/* 682 */     l l = l.u();
/*     */     
/* 684 */     String str1 = paramMatcher.group(1);
/* 685 */     String str2 = paramMatcher.group(2);
/*     */ 
/*     */ 
/*     */     
/* 689 */     if (str2.equals("")) {
/*     */       
/* 691 */       arrayOfString = new String[0];
/*     */     
/*     */     }
/*     */     else {
/*     */ 
/*     */       
/* 697 */       arrayOfString = f.c(str2, ',');
/*     */     } 
/*     */ 
/*     */     
/* 701 */     Object[] arrayOfObject = new Object[arrayOfString.length];
/* 702 */     for (byte b1 = 0; b1 < arrayOfObject.length; b1++)
/*     */     {
/* 704 */       arrayOfObject[b1] = processArg(arrayOfString[b1]);
/*     */     }
/*     */     
/* 707 */     return runFunction(str1, arrayOfObject);
/*     */   } public Object processArg(String paramString) { paramString = paramString.trim(); if (paramString.length() == 0) return null;  if (paramString.equals("null")) return null;  Matcher matcher = match("'(.*)'", paramString); if (matcher != null) return f.n(matcher.group(1));  matcher = match("(-?\\d*)", paramString); if (matcher != null)
/*     */       return Integer.valueOf(Integer.parseInt(matcher.group(1)));  matcher = match("(-?\\d*\\.\\d*)", paramString); if (matcher != null)
/*     */       return Float.valueOf(Float.parseFloat(matcher.group(1)));  matcher = match("\\s*([^\\s\"']*)\\s*=(.*)", paramString); if (matcher != null) { String str1 = matcher.group(1); String str2 = matcher.group(2); System.out.println("processArg: setting: " + str1 + "=" + str2); Object object1 = processArg(str2); setLocalVariable(str1, object1); return object1; }  matcher = match("\\s*([\\w\\.]+)\\((.*)\\)\\s*", paramString); if (matcher != null)
/*     */       return processFunction(paramString, matcher);  if ("false".equalsIgnoreCase(paramString))
/*     */       return Boolean.FALSE;  if ("true".equalsIgnoreCase(paramString))
/*     */       return Boolean.TRUE;  Object object = getScriptVariable(paramString, false); if (object != null)
/* 714 */       return object;  System.out.println("processArg: no variable:" + paramString); getScriptVariable(paramString, true); System.out.println("SlickLibRocket:HandleEvent: failed to match:" + paramString); return null; } public Object runFunction(String paramString, Object[] paramArrayOfObject) { String[] arrayOfString = paramString.split("\\.");
/*     */     
/* 716 */     ScriptContext scriptContext = this.root;
/* 717 */     if (arrayOfString.length > 2) {
/*     */       
/* 719 */       logCritical("Unsupported nameParts: " + paramString);
/* 720 */       return null;
/*     */     } 
/* 722 */     if (arrayOfString.length == 2) {
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 727 */       Object object = getScriptVariable(arrayOfString[0], false);
/* 728 */       if (!(object instanceof ScriptContext)) {
/*     */         
/* 730 */         logCritical("Could not find context for: " + paramString);
/* 731 */         return null;
/*     */       } 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 737 */       scriptContext = (ScriptContext)object;
/* 738 */       paramString = arrayOfString[1];
/*     */     } 
/*     */ 
/*     */     
/* 742 */     Method method = (Method)scriptContext.methods.get(paramString);
/* 743 */     if (method == null) {
/*     */       
/* 745 */       logCritical("Could not find function: " + paramString);
/* 746 */       return null;
/*     */     } 
/*     */     
/* 749 */     Class[] arrayOfClass = method.getParameterTypes();
/*     */     
/* 751 */     ArrayList<Object> arrayList = new ArrayList();
/*     */     
/* 753 */     if (paramArrayOfObject.length > arrayOfClass.length)
/*     */     {
/* 755 */       logCritical("function: " + paramString + " does not accept " + paramArrayOfObject.length + " parameters");
/*     */     }
/*     */     
/* 758 */     for (byte b1 = 0; b1 < arrayOfClass.length; b1++) {
/*     */       
/* 760 */       Class clazz = arrayOfClass[b1];
/*     */       
/* 762 */       Object object = null;
/* 763 */       if (b1 < paramArrayOfObject.length)
/*     */       {
/* 765 */         object = paramArrayOfObject[b1];
/*     */       }
/*     */       
/* 768 */       if (object != null)
/*     */       {
/* 770 */         if (!clazz.isInstance(object))
/*     */         {
/*     */ 
/*     */           
/* 774 */           if (clazz.equals(Float.class));
/*     */         }
/*     */       }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */       
/* 782 */       arrayList.add(object);
/*     */     } 
/*     */ 
/*     */     
/*     */     try {
/* 787 */       return method.invoke(scriptContext, arrayList.toArray());
/*     */ 
/*     */     
/*     */     }
/* 791 */     catch (IllegalAccessException illegalAccessException) {
/*     */       
/* 793 */       illegalAccessException.printStackTrace();
/* 794 */       throw new RuntimeException(illegalAccessException);
/*     */     }
/* 796 */     catch (IllegalArgumentException illegalArgumentException) {
/*     */       
/* 798 */       l.b("convertedParameters:");
/* 799 */       for (Object object : arrayList) {
/*     */         
/* 801 */         if (object == null) {
/*     */           
/* 803 */           l.b("=null");
/*     */           
/*     */           continue;
/*     */         } 
/* 807 */         l.b("=" + object.getClass().getName());
/*     */       } 
/*     */       
/* 810 */       l.b("-----");
/*     */       
/* 812 */       illegalArgumentException.printStackTrace();
/* 813 */       throw new RuntimeException(illegalArgumentException);
/*     */     }
/* 815 */     catch (InvocationTargetException invocationTargetException) {
/*     */       
/* 817 */       invocationTargetException.printStackTrace();
/* 818 */       throw new RuntimeException(invocationTargetException);
/*     */     }  }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public static void logError(String paramString) {
/* 838 */     l.d("ScriptEngine - error: " + paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void logCritical(String paramString) {
/* 843 */     l.d("ScriptEngine - critical: " + paramString);
/* 844 */     if (isStrict())
/*     */     {
/* 846 */       throw new RuntimeException("ScriptEngine - critical:" + paramString);
/*     */     }
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\librocket\scripts\ScriptEngine.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */