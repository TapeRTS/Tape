/*     */ package com;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.util.ArrayList;
/*     */ import java.util.Arrays;
/*     */ import java.util.HashMap;
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
/*     */ public class LibRocket
/*     */ {
/*     */   public boolean debug = false;
/*     */   String currentDocumentPath;
/*     */   ElementDocument currentDocument;
/*     */   
/*     */   static {
/*  24 */     boolean bool1 = false;
/*  25 */     String str1 = System.getProperty("os.name");
/*  26 */     if (str1.startsWith("Windows")) {
/*  27 */       bool1 = true;
/*     */     }
/*     */     
/*  30 */     String str2 = System.getProperty("os.arch");
/*  31 */     boolean bool2 = (str2.contains("64") || str2.startsWith("armv8")) ? true : false;
/*     */     
/*  33 */     String str3 = "rocketConnector";
/*     */     
/*  35 */     if (bool1)
/*     */     {
/*  37 */       if (bool2)
/*     */       {
/*  39 */         str3 = "rocketConnector64";
/*     */       }
/*     */     }
/*     */     
/*  43 */     System.loadLibrary(str3);
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
/*  57 */   ArrayList lastDocuments = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void backToLastDocument() {
/*  65 */     if (this.lastDocuments.size() == 0) {
/*     */       
/*  67 */       closeActiveDocument();
/*     */ 
/*     */       
/*     */       return;
/*     */     } 
/*     */ 
/*     */     
/*  74 */     ElementDocument elementDocument = this.lastDocuments.remove(this.lastDocuments.size() - 1);
/*     */     
/*  76 */     setDocument(elementDocument.documentPath, elementDocument.metadata, false);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void clearHistory() {
/*  83 */     this.lastDocuments.clear();
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public ElementDocument setDocument(String paramString) {
/*  89 */     return setDocument(paramString, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public ElementDocument setDocument(String paramString, HashMap paramHashMap) {
/*  94 */     return setDocument(paramString, paramHashMap, true);
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
/*     */   public ElementDocument setDocument(String paramString, HashMap<Object, Object> paramHashMap, boolean paramBoolean) {
/* 106 */     if (this.currentDocument != null) {
/*     */       
/* 108 */       if (paramBoolean)
/*     */       {
/* 110 */         this.lastDocuments.add(this.currentDocument);
/*     */       }
/*     */       
/* 113 */       closeDocument(this.currentDocument);
/* 114 */       this.currentDocument = null;
/*     */     } 
/*     */ 
/*     */     
/* 118 */     this.currentDocumentPath = paramString;
/*     */ 
/*     */ 
/*     */     
/* 122 */     ElementDocument elementDocument = new ElementDocument();
/*     */     
/* 124 */     if (paramHashMap == null)
/*     */     {
/* 126 */       paramHashMap = new HashMap<>();
/*     */     }
/* 128 */     elementDocument.metadata = paramHashMap;
/* 129 */     elementDocument.documentPath = paramString;
/* 130 */     this.currentDocument = elementDocument;
/* 131 */     this.longLastModified = getLastModified();
/*     */     
/* 133 */     loadDocumentWithContainer(getDocumentPath(this.currentDocumentPath), elementDocument);
/*     */ 
/*     */     
/* 136 */     newDocumentLoaded(elementDocument);
/*     */     
/* 138 */     elementDocument.show();
/*     */     
/* 140 */     newDocumentShown(elementDocument);
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 146 */     return elementDocument;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void newDocumentLoaded(ElementDocument paramElementDocument) {}
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void newDocumentShown(ElementDocument paramElementDocument) {}
/*     */ 
/*     */ 
/*     */   
/*     */   public ElementDocument createPopup(String paramString, Object paramObject) {
/* 162 */     ElementDocument elementDocument = loadDocument(getDocumentPath(paramString));
/*     */     
/* 164 */     if (elementDocument != null)
/*     */     {
/* 166 */       elementDocument.setMetadata("mode", paramObject);
/*     */     }
/*     */     
/* 169 */     return elementDocument;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void closeDocument(ElementDocument paramElementDocument) {
/* 177 */     paramElementDocument.closeDocument();
/*     */ 
/*     */     
/* 180 */     this.queueExtraUpdate = true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public void closeActiveDocument() {
/* 186 */     if (this.currentDocument != null) {
/*     */ 
/*     */       
/* 189 */       closeDocument(this.currentDocument);
/*     */       
/* 191 */       this.currentDocument = null;
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public ElementDocument getActiveDocument() {
/* 200 */     return this.currentDocument;
/*     */   }
/*     */ 
/*     */   
/*     */   public HashMap getActiveDocumentMetadata() {
/* 205 */     if (this.currentDocument != null)
/*     */     {
/* 207 */       return this.currentDocument.metadata;
/*     */     }
/*     */     
/* 210 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   public Element getActiveElementById(String paramString) {
/* 215 */     if (this.currentDocument == null) {
/*     */       
/* 217 */       System.out.println("currentDocument==null on getActiveElementById:" + paramString);
/* 218 */       return null;
/*     */     } 
/*     */ 
/*     */     
/* 222 */     return this.currentDocument.getElementById(paramString);
/*     */   }
/*     */   
/* 225 */   long longLastModified = -1L;
/* 226 */   long longLastModifiedNewestCss = -1L;
/*     */   
/*     */   String[] activeDocumentCss;
/*     */   int reloadSkip;
/*     */   
/*     */   public String[] getActiveDocumentCss() {
/* 232 */     if (this.activeDocumentCss == null) {
/*     */       
/* 234 */       ArrayList<String> arrayList = new ArrayList();
/*     */       
/* 236 */       String str = "assets/gui";
/* 237 */       File file = new File(str);
/* 238 */       File[] arrayOfFile = file.listFiles();
/* 239 */       for (byte b = 0; b < arrayOfFile.length; b++) {
/*     */         
/* 241 */         File file1 = arrayOfFile[b];
/*     */         
/* 243 */         if (file1.getName().toLowerCase(Locale.ENGLISH).endsWith(".rcss")) {
/*     */           
/* 245 */           String str1 = str + "/" + file1.getName();
/* 246 */           arrayList.add(str1);
/* 247 */           System.out.println("getActiveDocumentCss: " + str1);
/*     */         } 
/*     */       } 
/*     */       
/* 251 */       this.activeDocumentCss = arrayList.<String>toArray(new String[0]);
/*     */     } 
/* 253 */     return this.activeDocumentCss;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public long getFileLastModified(String paramString) {
/* 259 */     File file = new File(paramString);
/* 260 */     return file.lastModified();
/*     */   }
/*     */ 
/*     */   
/*     */   public long getLastModifiedNewestCss() {
/* 265 */     if (this.currentDocumentPath == null)
/*     */     {
/* 267 */       return -2L;
/*     */     }
/*     */     
/* 270 */     long l = -1L;
/*     */     
/* 272 */     for (String str : getActiveDocumentCss()) {
/*     */ 
/*     */ 
/*     */       
/* 276 */       long l1 = getFileLastModified(str);
/*     */       
/* 278 */       if (l1 > l)
/*     */       {
/* 280 */         l = l1;
/*     */       }
/*     */     } 
/*     */     
/* 284 */     return l;
/*     */   }
/*     */ 
/*     */   
/*     */   public long getLastModified() {
/* 289 */     if (this.currentDocumentPath == null)
/*     */     {
/* 291 */       return -2L;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 296 */     return getFileLastModified("assets/gui/" + this.currentDocumentPath);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void detectChangesAndReload() {
/* 303 */     this.reloadSkip++;
/* 304 */     if (this.reloadSkip < 20) {
/*     */       return;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 310 */     this.reloadSkip = 0;
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 315 */     if (getActiveDocument() != null) {
/*     */       
/* 317 */       boolean bool = false;
/*     */       
/* 319 */       long l1 = getLastModified();
/*     */ 
/*     */ 
/*     */       
/* 323 */       if (this.longLastModified == -1L) {
/*     */ 
/*     */ 
/*     */         
/* 327 */         this.longLastModified = l1;
/*     */       }
/* 329 */       else if (this.longLastModified != l1) {
/*     */         
/* 331 */         System.out.println("reloadDocument: '" + this.currentDocumentPath + "' current now:" + l1);
/*     */         
/* 333 */         bool = true;
/*     */         
/* 335 */         this.longLastModified = l1;
/*     */       } 
/*     */ 
/*     */       
/* 339 */       long l2 = getLastModifiedNewestCss();
/* 340 */       if (this.longLastModifiedNewestCss == -1L) {
/*     */ 
/*     */         
/* 343 */         this.longLastModifiedNewestCss = l2;
/*     */       }
/* 345 */       else if (this.longLastModifiedNewestCss != l2) {
/*     */         
/* 347 */         System.out.println("reloadDocument from css: '" + this.currentDocumentPath + "' current now:" + l1);
/* 348 */         bool = true;
/* 349 */         this.longLastModifiedNewestCss = l2;
/*     */       } 
/*     */       
/* 352 */       if (bool) {
/*     */         
/* 354 */         boolean bool1 = false;
/* 355 */         setDocument(this.currentDocumentPath, getActiveDocumentMetadata(), bool1);
/*     */       } 
/*     */     } 
/*     */   }
/*     */ 
/*     */ 
/*     */   
/* 362 */   public String documentPrefix = "assets/gui/";
/*     */ 
/*     */   
/*     */   public String getDocumentPath(String paramString) {
/* 366 */     return this.documentPrefix + paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void loadFont(String paramString) {
/* 377 */     loadFont(paramString, null);
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   protected boolean queueExtraUpdate = false;
/*     */ 
/*     */ 
/*     */   
/*     */   public void postUpdate() {
/* 387 */     if (this.queueExtraUpdate) {
/*     */       
/* 389 */       this.queueExtraUpdate = false;
/* 390 */       update();
/*     */       
/* 392 */       render();
/*     */ 
/*     */       
/* 395 */       processMouseMove(-1, -1, 0);
/* 396 */       processMouseMove(this.lastMouseX, this.lastMouseY, 0);
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
/* 418 */   public int lastMouseX = 0;
/* 419 */   public int lastMouseY = 0;
/*     */ 
/*     */   
/*     */   public void mouseMove(int paramInt1, int paramInt2, int paramInt3) {
/* 423 */     this.lastMouseX = paramInt1;
/* 424 */     this.lastMouseY = paramInt2;
/* 425 */     processMouseMove(paramInt1, paramInt2, paramInt3);
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
/*     */   public void RenderGeometry(float[] paramArrayOffloat1, float[] paramArrayOffloat2, int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt, float paramFloat1, float paramFloat2) {
/* 445 */     RenderGeometryPossiblyCompiled(paramArrayOffloat1, paramArrayOffloat2, paramArrayOfint1, paramArrayOfint2, paramInt, paramFloat1, paramFloat2, null);
/*     */   }
/*     */ 
/*     */   
/*     */   public void RenderGeometryPossiblyCompiled(float[] paramArrayOffloat1, float[] paramArrayOffloat2, int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt, float paramFloat1, float paramFloat2, LibRocket$CompiledGeometry paramLibRocket$CompiledGeometry) {
/* 450 */     System.out.println("RenderGeometryPossiblyCompiled(" + paramArrayOfint2.length + ")");
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
/* 468 */   ArrayList compiledGeometryList = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public int CompileGeometry(float[] paramArrayOffloat1, float[] paramArrayOffloat2, int[] paramArrayOfint1, int[] paramArrayOfint2, int paramInt) {
/* 476 */     LibRocket$CompiledGeometry libRocket$CompiledGeometry = null;
/*     */ 
/*     */     
/* 479 */     boolean bool1 = true;
/*     */ 
/*     */ 
/*     */     
/* 483 */     if (bool1)
/*     */     {
/* 485 */       for (byte b1 = 1; b1 < this.compiledGeometryList.size(); b1++) {
/*     */         
/* 487 */         LibRocket$CompiledGeometry libRocket$CompiledGeometry1 = this.compiledGeometryList.get(b1);
/* 488 */         if (libRocket$CompiledGeometry1 != null) {
/*     */           
/* 490 */           boolean bool = true;
/*     */           
/* 492 */           if (libRocket$CompiledGeometry1.verticesXY != paramArrayOffloat1)
/*     */           {
/* 494 */             if (!Arrays.equals(libRocket$CompiledGeometry1.verticesXY, paramArrayOffloat1)) {
/*     */               
/* 496 */               bool = false;
/*     */             
/*     */             }
/*     */             else {
/*     */               
/* 501 */               paramArrayOffloat1 = libRocket$CompiledGeometry1.verticesXY;
/*     */             } 
/*     */           }
/* 504 */           if (libRocket$CompiledGeometry1.verticesUV != paramArrayOffloat2)
/*     */           {
/* 506 */             if (!Arrays.equals(libRocket$CompiledGeometry1.verticesUV, paramArrayOffloat2)) {
/*     */               
/* 508 */               bool = false;
/*     */             
/*     */             }
/*     */             else {
/*     */               
/* 513 */               paramArrayOffloat2 = libRocket$CompiledGeometry1.verticesUV;
/*     */             } 
/*     */           }
/* 516 */           if (libRocket$CompiledGeometry1.verticesColors != paramArrayOfint1)
/*     */           {
/* 518 */             if (!Arrays.equals(libRocket$CompiledGeometry1.verticesColors, paramArrayOfint1)) {
/*     */               
/* 520 */               bool = false;
/*     */             
/*     */             }
/*     */             else {
/*     */               
/* 525 */               paramArrayOfint1 = libRocket$CompiledGeometry1.verticesColors;
/*     */             } 
/*     */           }
/* 528 */           if (libRocket$CompiledGeometry1.indices != paramArrayOfint2)
/*     */           {
/* 530 */             if (!Arrays.equals(libRocket$CompiledGeometry1.indices, paramArrayOfint2)) {
/*     */               
/* 532 */               bool = false;
/*     */             
/*     */             }
/*     */             else {
/*     */               
/* 537 */               paramArrayOfint2 = libRocket$CompiledGeometry1.indices;
/*     */             } 
/*     */           }
/*     */           
/* 541 */           if (bool);
/*     */         } 
/*     */       } 
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 551 */     if (libRocket$CompiledGeometry == null) {
/*     */       
/* 553 */       libRocket$CompiledGeometry = new LibRocket$CompiledGeometry();
/*     */ 
/*     */       
/* 556 */       libRocket$CompiledGeometry.verticesXY = paramArrayOffloat1;
/* 557 */       libRocket$CompiledGeometry.verticesUV = paramArrayOffloat2;
/* 558 */       libRocket$CompiledGeometry.verticesColors = paramArrayOfint1;
/* 559 */       libRocket$CompiledGeometry.indices = paramArrayOfint2;
/* 560 */       libRocket$CompiledGeometry.textureId = paramInt;
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 568 */     if (this.compiledGeometryList.size() == 0)
/*     */     {
/* 570 */       this.compiledGeometryList.add(null);
/*     */     }
/* 572 */     boolean bool2 = false;
/* 573 */     for (byte b = 1; b < this.compiledGeometryList.size(); b++) {
/*     */       
/* 575 */       if (this.compiledGeometryList.get(b) == null) {
/*     */         
/* 577 */         libRocket$CompiledGeometry.id = b;
/* 578 */         this.compiledGeometryList.set(b, libRocket$CompiledGeometry);
/*     */         
/* 580 */         bool2 = true;
/*     */         break;
/*     */       } 
/*     */     } 
/* 584 */     if (!bool2) {
/*     */       
/* 586 */       libRocket$CompiledGeometry.id = this.compiledGeometryList.size();
/* 587 */       this.compiledGeometryList.add(libRocket$CompiledGeometry);
/*     */     } 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 597 */     return libRocket$CompiledGeometry.id;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void RenderCompiledGeometry(int paramInt, float paramFloat1, float paramFloat2) {
/* 605 */     LibRocket$CompiledGeometry libRocket$CompiledGeometry = this.compiledGeometryList.get(paramInt);
/* 606 */     if (libRocket$CompiledGeometry == null) {
/*     */       
/* 608 */       warn("CompileGeometry null for " + paramInt);
/*     */       
/*     */       return;
/*     */     } 
/*     */     
/* 613 */     RenderGeometryPossiblyCompiled(libRocket$CompiledGeometry.verticesXY, libRocket$CompiledGeometry.verticesUV, libRocket$CompiledGeometry.verticesColors, libRocket$CompiledGeometry.indices, libRocket$CompiledGeometry.textureId, paramFloat1, paramFloat2, libRocket$CompiledGeometry);
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
/*     */   public void ReleaseCompiledGeometry(int paramInt) {
/* 631 */     this.compiledGeometryList.set(paramInt, null);
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
/*     */   public void ReleaseCompiledGeometryForTexture(int paramInt) {
/* 652 */     for (byte b = 1; b < this.compiledGeometryList.size(); b++) {
/*     */       
/* 654 */       LibRocket$CompiledGeometry libRocket$CompiledGeometry = this.compiledGeometryList.get(b);
/* 655 */       if (libRocket$CompiledGeometry != null)
/*     */       {
/* 657 */         if (libRocket$CompiledGeometry.textureId == paramInt) {
/*     */           
/* 659 */           log("ReleaseCompiledGeometryForTexture:" + libRocket$CompiledGeometry.textureId);
/*     */           
/* 661 */           this.compiledGeometryList.set(b, null);
/*     */         } 
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
/*     */   public void EnableScissorRegion(boolean paramBoolean) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void SetScissorRegion(int paramInt1, int paramInt2, int paramInt3, int paramInt4) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean LoadTexture(int paramInt, String paramString) {
/* 703 */     log("JavaMethod:LoadTexture()");
/* 704 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean GenerateTexture(int paramInt, byte[] paramArrayOfbyte) {
/* 710 */     log("JavaMethod:GenerateTexture()");
/* 711 */     return true;
/*     */   }
/*     */ 
/*     */   
/*     */   public void ReleaseTexture(int paramInt) {
/* 716 */     log("JavaMethod:ReleaseTexture");
/*     */     
/* 718 */     ReleaseCompiledGeometryForTexture(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public void HandleEvent(String paramString) {
/* 726 */     log("JavaMethod:HandleEvent:" + paramString);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public String TranslateString(String paramString) {
/* 735 */     return paramString;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private void callback(String paramString) {
/* 742 */     System.out.println("In Java with: " + paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void test() {
/* 747 */     LibRocket libRocket = new LibRocket();
/*     */ 
/*     */ 
/*     */     
/* 751 */     libRocket.setup();
/* 752 */     libRocket.loadDocument(libRocket.getDocumentPath("test.rml"));
/*     */     
/* 754 */     libRocket.update();
/* 755 */     libRocket.render();
/*     */   }
/*     */ 
/*     */   
/*     */   public static void main(String[] paramArrayOfString) {
/* 760 */     test();
/*     */   }
/*     */   
/* 763 */   ArrayList textureHolderList = new ArrayList();
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LibRocket$TextureHolder getNewTextureHolder() {
/* 769 */     if (this.textureHolderList.size() == 0)
/*     */     {
/* 771 */       this.textureHolderList.add(null);
/*     */     }
/*     */     
/* 774 */     LibRocket$TextureHolder libRocket$TextureHolder = getFromTextureHolderFactory();
/*     */     
/* 776 */     boolean bool = false;
/*     */     
/* 778 */     for (byte b = 1; b < this.textureHolderList.size(); b++) {
/*     */       
/* 780 */       if (this.textureHolderList.get(b) == null) {
/*     */         
/* 782 */         libRocket$TextureHolder.index = b;
/* 783 */         this.textureHolderList.set(b, libRocket$TextureHolder);
/* 784 */         System.out.println("getNewTextureHolder: set:" + libRocket$TextureHolder.index);
/* 785 */         bool = true;
/*     */         
/*     */         break;
/*     */       } 
/*     */     } 
/* 790 */     if (!bool) {
/*     */       
/* 792 */       libRocket$TextureHolder.index = this.textureHolderList.size();
/* 793 */       this.textureHolderList.add(libRocket$TextureHolder);
/*     */       
/* 795 */       System.out.println("getNewTextureHolder: append:" + libRocket$TextureHolder.index);
/*     */     } 
/*     */ 
/*     */ 
/*     */     
/* 800 */     return libRocket$TextureHolder;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LibRocket$TextureHolder findTextureHolder(int paramInt) {
/* 808 */     return this.textureHolderList.get(paramInt);
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public boolean removeTextureHolder(int paramInt) {
/* 816 */     if (this.textureHolderList.size() <= paramInt) {
/*     */       
/* 818 */       warn("removeTextureHolder: cannot remove:" + paramInt + " it is out of range");
/*     */       
/* 820 */       return false;
/*     */     } 
/*     */ 
/*     */     
/* 824 */     LibRocket$TextureHolder libRocket$TextureHolder = findTextureHolder(paramInt);
/*     */     
/* 826 */     if (libRocket$TextureHolder != null)
/*     */     {
/* 828 */       libRocket$TextureHolder.remove();
/*     */     }
/*     */     
/* 831 */     this.textureHolderList.set(paramInt, null);
/*     */     
/* 833 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   public LibRocket$TextureHolder getFromTextureHolderFactory() {
/* 841 */     return new LibRocket$TextureHolder(this);
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
/*     */   public static void log(String paramString) {
/* 860 */     System.out.println(paramString);
/*     */   }
/*     */ 
/*     */   
/*     */   public static void warn(String paramString) {
/* 865 */     System.out.println(paramString);
/*     */   }
/*     */   
/*     */   public native void setup();
/*     */   
/*     */   private native ElementDocument loadDocument(String paramString);
/*     */   
/*     */   private native void loadDocumentWithContainer(String paramString, ElementDocument paramElementDocument);
/*     */   
/*     */   public native void loadFont(String paramString1, String paramString2);
/*     */   
/*     */   public native void update();
/*     */   
/*     */   public native void render();
/*     */   
/*     */   public native void setDimensions(int paramInt1, int paramInt2);
/*     */   
/*     */   public native void processMouseMove(int paramInt1, int paramInt2, int paramInt3);
/*     */   
/*     */   public native void processMouseButtonDown(int paramInt1, int paramInt2);
/*     */   
/*     */   public native void processMouseButtonUp(int paramInt1, int paramInt2);
/*     */   
/*     */   public native void processMouseWheel(int paramInt1, int paramInt2);
/*     */   
/*     */   public native void processTextInput(String paramString);
/*     */   
/*     */   public native void processTextInputChar(int paramInt);
/*     */   
/*     */   public native void processKeyDown(int paramInt1, int paramInt2);
/*     */   
/*     */   public native void processKeyUp(int paramInt1, int paramInt2);
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\LibRocket.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */