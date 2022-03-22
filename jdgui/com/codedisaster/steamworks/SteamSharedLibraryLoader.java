/*     */ package com.codedisaster.steamworks;
/*     */ 
/*     */ import java.io.File;
/*     */ import java.io.FileOutputStream;
/*     */ import java.io.IOException;
/*     */ import java.io.InputStream;
/*     */ import java.util.UUID;
/*     */ import java.util.zip.CRC32;
/*     */ import java.util.zip.ZipEntry;
/*     */ import java.util.zip.ZipFile;
/*     */ 
/*     */ class SteamSharedLibraryLoader {
/*     */   private final String libraryPath;
/*     */   static boolean alreadyLoaded = false;
/*     */   
/*     */   private SteamSharedLibraryLoader(String paramString) {
/*  17 */     this.libraryPath = paramString;
/*     */   }
/*     */   static File librarySystemPath; private static final String extractSubFolder = "steamworks4j/";
/*     */   private String getLibNameWindows(String paramString, boolean paramBoolean) {
/*  21 */     return paramString + (paramBoolean ? "64" : "") + ".dll";
/*     */   }
/*     */   
/*     */   private String getLibNameLinux(String paramString, boolean paramBoolean) {
/*  25 */     return "lib" + paramString + (paramBoolean ? "64" : "") + ".so";
/*     */   }
/*     */   
/*     */   private String getLibNameMac(String paramString) {
/*  29 */     return "lib" + paramString + ".dylib";
/*     */   }
/*     */   
/*     */   private void loadLibraries(String... paramVarArgs) {
/*  33 */     String str1 = System.getProperty("os.name");
/*  34 */     String str2 = System.getProperty("os.arch");
/*     */     
/*  36 */     boolean bool1 = str1.contains("Windows");
/*  37 */     boolean bool2 = str1.contains("Linux");
/*  38 */     boolean bool3 = str1.contains("Mac");
/*     */     
/*  40 */     boolean bool = (str2.equals("amd64") || str2.equals("x86_64")) ? true : false;
/*     */     
/*  42 */     String[] arrayOfString = new String[paramVarArgs.length];
/*     */     
/*  44 */     for (byte b = 0; b < paramVarArgs.length; b++) {
/*  45 */       if (bool1) {
/*  46 */         arrayOfString[b] = getLibNameWindows(paramVarArgs[b], bool);
/*  47 */       } else if (bool2) {
/*  48 */         arrayOfString[b] = getLibNameLinux(paramVarArgs[b], bool);
/*  49 */       } else if (bool3) {
/*  50 */         arrayOfString[b] = getLibNameMac(paramVarArgs[b]);
/*     */       } else {
/*  52 */         throw new IOException("Unrecognized system architecture: " + str1 + ", " + str2);
/*     */       } 
/*     */     } 
/*     */     
/*  56 */     if (this.libraryPath == null) {
/*     */       
/*  58 */       String str = ".nohash";
/*  59 */       CRC32 cRC32 = new CRC32();
/*     */       
/*  61 */       for (String str3 : arrayOfString) {
/*  62 */         str = crc(cRC32, getClass().getResourceAsStream("/" + str3));
/*     */       }
/*     */       
/*  65 */       librarySystemPath = discoverExtractLocation("steamworks4j/" + str, 
/*  66 */           UUID.randomUUID().toString());
/*     */       
/*  68 */       System.out.println("steam librarySystemPath name:" + librarySystemPath);
/*     */ 
/*     */       
/*  71 */       if (librarySystemPath == null) {
/*  72 */         throw new IOException("Failed to create temp folder to extract native libraries");
/*     */       }
/*     */       
/*  75 */       librarySystemPath = librarySystemPath.getParentFile();
/*     */     } else {
/*  77 */       librarySystemPath = new File(this.libraryPath);
/*     */     } 
/*     */     
/*  80 */     for (String str3 : arrayOfString) {
/*     */       String str4;
/*     */ 
/*     */       
/*  84 */       if (this.libraryPath == null) {
/*     */         
/*  86 */         str4 = extractLibrary(librarySystemPath, str3);
/*     */       } else {
/*     */         
/*  89 */         str4 = librarySystemPath + "/" + str3;
/*     */       } 
/*     */       
/*  92 */       String str5 = (new File(str4)).getCanonicalPath();
/*     */       
/*  94 */       System.load(str5);
/*     */     } 
/*     */   }
/*     */   
/*     */   private String extractLibrary(File paramFile, String paramString) {
/*     */     InputStream inputStream;
/* 100 */     File file = new File(paramFile, paramString);
/*     */ 
/*     */     
/* 103 */     ZipFile zipFile = null;
/*     */     
/* 105 */     if (this.libraryPath != null) {
/* 106 */       System.out.println("steam extractLibrary zip:" + paramString);
/*     */       
/* 108 */       zipFile = new ZipFile(this.libraryPath);
/* 109 */       ZipEntry zipEntry = zipFile.getEntry(paramString);
/* 110 */       inputStream = zipFile.getInputStream(zipEntry);
/*     */     } else {
/* 112 */       System.out.println("steam extractLibrary name:" + paramString);
/*     */       
/* 114 */       inputStream = SteamSharedLibraryLoader.class.getResourceAsStream("/" + paramString);
/*     */     } 
/*     */     
/* 117 */     if (inputStream == null) {
/* 118 */       throw new IOException("Error extracting " + paramString + " from " + ((this.libraryPath != null) ? this.libraryPath : "resources"));
/*     */     }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 129 */       FileOutputStream fileOutputStream = new FileOutputStream(file);
/*     */       
/* 131 */       byte[] arrayOfByte = new byte[4096];
/*     */       while (true) {
/* 133 */         int i = inputStream.read(arrayOfByte);
/* 134 */         if (i == -1)
/* 135 */           break;  fileOutputStream.write(arrayOfByte, 0, i);
/*     */       } 
/*     */       
/* 138 */       fileOutputStream.close();
/*     */     }
/* 140 */     catch (IOException iOException) {
/* 141 */       if (!file.exists()) {
/* 142 */         throw iOException;
/*     */       }
/*     */     } 
/*     */     
/* 146 */     inputStream.close();
/*     */     
/* 148 */     if (zipFile != null) {
/* 149 */       zipFile.close();
/*     */     }
/*     */     
/* 152 */     return file.getAbsolutePath();
/*     */   }
/*     */   
/*     */   private String crc(CRC32 paramCRC32, InputStream paramInputStream) {
/* 156 */     byte[] arrayOfByte = new byte[4096];
/*     */     try {
/*     */       while (true) {
/* 159 */         int i = paramInputStream.read(arrayOfByte);
/* 160 */         if (i == -1)
/* 161 */           break;  paramCRC32.update(arrayOfByte, 0, i);
/*     */       } 
/* 163 */     } catch (IOException iOException) {
/* 164 */       iOException.printStackTrace();
/*     */     } finally {
/*     */       try {
/* 167 */         paramInputStream.close();
/* 168 */       } catch (IOException iOException) {}
/*     */     } 
/*     */     
/* 171 */     return Long.toHexString(paramCRC32.getValue());
/*     */   }
/*     */ 
/*     */   
/*     */   static boolean loadLibraries(String paramString) {
/* 176 */     if (alreadyLoaded) {
/* 177 */       return true;
/*     */     }
/*     */     
/* 180 */     SteamSharedLibraryLoader steamSharedLibraryLoader = new SteamSharedLibraryLoader(paramString);
/*     */     
/*     */     try {
/* 183 */       steamSharedLibraryLoader.loadLibraries(new String[] { "steam_api", "steamworks4j" });
/* 184 */     } catch (Throwable throwable) {
/* 185 */       throw new SteamException(throwable);
/*     */     } 
/*     */     
/* 188 */     alreadyLoaded = true;
/* 189 */     return true;
/*     */   }
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */   
/*     */   private static File discoverExtractLocation(String paramString1, String paramString2) {
/* 198 */     File file = new File(System.getProperty("java.io.tmpdir") + "/" + paramString1, paramString2);
/* 199 */     if (canWrite(file)) {
/* 200 */       return file;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/*     */     try {
/* 206 */       File file1 = File.createTempFile(paramString1, null);
/* 207 */       if (file1.delete()) {
/*     */         
/* 209 */         file = new File(file1, paramString2);
/* 210 */         if (canWrite(file)) {
/* 211 */           return file;
/*     */         }
/*     */       } 
/* 214 */     } catch (IOException iOException) {}
/*     */ 
/*     */ 
/*     */ 
/*     */ 
/*     */     
/* 220 */     file = new File(System.getProperty("user.home") + "/." + paramString1, paramString2);
/* 221 */     if (canWrite(file)) {
/* 222 */       return file;
/*     */     }
/*     */ 
/*     */ 
/*     */     
/* 227 */     file = new File(".tmp/" + paramString1, paramString2);
/* 228 */     if (canWrite(file)) {
/* 229 */       return file;
/*     */     }
/*     */     
/* 232 */     return null;
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean canWrite(File paramFile) {
/* 237 */     File file1 = paramFile.getParentFile();
/*     */     
/* 239 */     if (paramFile.exists()) {
/* 240 */       if (!paramFile.canWrite() || !canExecute(paramFile)) {
/* 241 */         return false;
/*     */       }
/*     */     } else {
/* 244 */       if (!file1.exists() && 
/* 245 */         !file1.mkdirs()) {
/* 246 */         return false;
/*     */       }
/*     */       
/* 249 */       if (!file1.isDirectory()) {
/* 250 */         return false;
/*     */       }
/*     */     } 
/*     */     
/* 254 */     File file2 = new File(file1, UUID.randomUUID().toString());
/*     */     
/*     */     try {
/* 257 */       (new FileOutputStream(file2)).close();
/* 258 */       return canExecute(file2);
/* 259 */     } catch (IOException iOException) {
/* 260 */       return false;
/*     */     } finally {
/* 262 */       file2.delete();
/*     */     } 
/*     */   }
/*     */ 
/*     */   
/*     */   private static boolean canExecute(File paramFile) {
/*     */     try {
/* 269 */       if (paramFile.canExecute()) {
/* 270 */         return true;
/*     */       }
/*     */       
/* 273 */       if (paramFile.setExecutable(true)) {
/* 274 */         return paramFile.canExecute();
/*     */       }
/* 276 */     } catch (Exception exception) {}
/*     */ 
/*     */ 
/*     */     
/* 280 */     return false;
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamSharedLibraryLoader.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */