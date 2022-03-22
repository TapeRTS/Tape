package com.codedisaster.steamworks;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.UUID;
import java.util.zip.CRC32;
import java.util.zip.ZipFile;

/* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamSharedLibraryLoader.class */
class SteamSharedLibraryLoader {
    private final String libraryPath;
    static boolean alreadyLoaded = false;
    static File librarySystemPath;
    private static final String extractSubFolder = "steamworks4j/";

    private SteamSharedLibraryLoader(String str) {
        this.libraryPath = str;
    }

    private String getLibNameWindows(String str, boolean z) {
        return str + (z ? "64" : "") + ".dll";
    }

    private String getLibNameLinux(String str, boolean z) {
        return "lib" + str + (z ? "64" : "") + ".so";
    }

    private String getLibNameMac(String str) {
        return "lib" + str + ".dylib";
    }

    private void loadLibraries(String... strArr) {
        String str;
        String property = System.getProperty("os.name");
        String property2 = System.getProperty("os.arch");
        boolean contains = property.contains("Windows");
        boolean contains2 = property.contains("Linux");
        boolean contains3 = property.contains("Mac");
        boolean z = property2.equals("amd64") || property2.equals("x86_64");
        String[] strArr2 = new String[strArr.length];
        for (int i = 0; i < strArr.length; i++) {
            if (contains) {
                strArr2[i] = getLibNameWindows(strArr[i], z);
            } else if (contains2) {
                strArr2[i] = getLibNameLinux(strArr[i], z);
            } else if (contains3) {
                strArr2[i] = getLibNameMac(strArr[i]);
            } else {
                throw new IOException("Unrecognized system architecture: " + property + ", " + property2);
            }
        }
        if (this.libraryPath == null) {
            String str2 = ".nohash";
            CRC32 crc32 = new CRC32();
            int length = strArr2.length;
            for (int i2 = 0; i2 < length; i2++) {
                str2 = crc(crc32, getClass().getResourceAsStream("/" + strArr2[i2]));
            }
            librarySystemPath = discoverExtractLocation(extractSubFolder + str2, UUID.randomUUID().toString());
            System.out.println("steam librarySystemPath name:" + librarySystemPath);
            if (librarySystemPath == null) {
                throw new IOException("Failed to create temp folder to extract native libraries");
            }
            librarySystemPath = librarySystemPath.getParentFile();
        } else {
            librarySystemPath = new File(this.libraryPath);
        }
        for (String str3 : strArr2) {
            if (this.libraryPath == null) {
                str = extractLibrary(librarySystemPath, str3);
            } else {
                str = librarySystemPath + "/" + str3;
            }
            System.load(new File(str).getCanonicalPath());
        }
    }

    private String extractLibrary(File file, String str) {
        InputStream inputStream;
        File file2 = new File(file, str);
        ZipFile zipFile = null;
        if (this.libraryPath != null) {
            System.out.println("steam extractLibrary zip:" + str);
            zipFile = new ZipFile(this.libraryPath);
            inputStream = zipFile.getInputStream(zipFile.getEntry(str));
        } else {
            System.out.println("steam extractLibrary name:" + str);
            inputStream = SteamSharedLibraryLoader.class.getResourceAsStream("/" + str);
        }
        if (inputStream == null) {
            throw new IOException("Error extracting " + str + " from " + (this.libraryPath != null ? this.libraryPath : "resources"));
        }
        try {
            FileOutputStream fileOutputStream = new FileOutputStream(file2);
            byte[] bArr = new byte[4096];
            while (true) {
                int read = inputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                fileOutputStream.write(bArr, 0, read);
            }
            fileOutputStream.close();
        } catch (IOException e) {
            if (!file2.exists()) {
                throw e;
            }
        }
        inputStream.close();
        if (zipFile != null) {
            zipFile.close();
        }
        return file2.getAbsolutePath();
    }

    private String crc(CRC32 crc32, InputStream inputStream) {
        byte[] bArr = new byte[4096];
        while (true) {
            try {
                try {
                    int read = inputStream.read(bArr);
                    if (read == -1) {
                        break;
                    }
                    crc32.update(bArr, 0, read);
                } catch (Throwable th) {
                    try {
                        inputStream.close();
                    } catch (IOException e) {
                    }
                    throw th;
                }
            } catch (IOException e2) {
                e2.printStackTrace();
                try {
                    inputStream.close();
                } catch (IOException e3) {
                }
            }
        }
        try {
            inputStream.close();
        } catch (IOException e4) {
        }
        return Long.toHexString(crc32.getValue());
    }

    static boolean loadLibraries(String str) {
        if (alreadyLoaded) {
            return true;
        }
        try {
            new SteamSharedLibraryLoader(str).loadLibraries("steam_api", "steamworks4j");
            alreadyLoaded = true;
            return true;
        } catch (Throwable th) {
            throw new SteamException(th);
        }
    }

    private static File discoverExtractLocation(String str, String str2) {
        File file = new File(System.getProperty("java.io.tmpdir") + "/" + str, str2);
        if (canWrite(file)) {
            return file;
        }
        try {
            File createTempFile = File.createTempFile(str, null);
            if (createTempFile.delete()) {
                File file2 = new File(createTempFile, str2);
                if (canWrite(file2)) {
                    return file2;
                }
            }
        } catch (IOException e) {
        }
        File file3 = new File(System.getProperty("user.home") + "/." + str, str2);
        if (canWrite(file3)) {
            return file3;
        }
        File file4 = new File(".tmp/" + str, str2);
        if (canWrite(file4)) {
            return file4;
        }
        return null;
    }

    private static boolean canWrite(File file) {
        File parentFile = file.getParentFile();
        if (file.exists()) {
            if (!file.canWrite() || !canExecute(file)) {
                return false;
            }
        } else if ((!parentFile.exists() && !parentFile.mkdirs()) || !parentFile.isDirectory()) {
            return false;
        }
        File file2 = new File(parentFile, UUID.randomUUID().toString());
        try {
            new FileOutputStream(file2).close();
            boolean canExecute = canExecute(file2);
            file2.delete();
            return canExecute;
        } catch (IOException e) {
            file2.delete();
            return false;
        } catch (Throwable th) {
            file2.delete();
            throw th;
        }
    }

    private static boolean canExecute(File file) {
        try {
            if (file.canExecute()) {
                return true;
            }
            if (file.setExecutable(true)) {
                return file.canExecute();
            }
            return false;
        } catch (Exception e) {
            return false;
        }
    }
}
