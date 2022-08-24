package com.codedisaster.steamworks;

import java.io.PrintStream;

/* loaded from: game-lib.jar:com/codedisaster/steamworks/SteamAPI.class */
public class SteamAPI {
    private static boolean isRunning = false;

    public static native boolean restartAppIfNecessary(int i);

    public static native void releaseCurrentThreadMemory();

    private static native boolean nativeInit();

    private static native void nativeShutdown();

    public static native void runCallbacks();

    private static native boolean isSteamRunningNative();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamAppsPointer();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamControllerPointer();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamFriendsPointer();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamHTTPPointer();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamMatchmakingPointer();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamNetworkingPointer();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamRemoteStoragePointer();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamUGCPointer();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamUserPointer();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamUserStatsPointer();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static native long getSteamUtilsPointer();

    public static boolean init() {
        return init(null);
    }

    public static boolean init(String str) {
        SteamSharedLibraryLoader.loadLibraries(str);
        isRunning = nativeInit();
        return isRunning;
    }

    public static void shutdown() {
        isRunning = false;
        nativeShutdown();
    }

    public static boolean isSteamRunning() {
        return isSteamRunning(false);
    }

    public static boolean isSteamRunning(boolean z) {
        return isRunning && (!z || isSteamRunningNative());
    }

    public static void printDebugInfo(PrintStream printStream) {
        if (SteamSharedLibraryLoader.alreadyLoaded) {
            printStream.println("  shared libraries loaded from: " + SteamSharedLibraryLoader.librarySystemPath);
        } else {
            printStream.println("  shared libraries not loaded");
        }
        printStream.println("  Steam API initialized: " + isRunning);
        printStream.println("  Steam client active: " + isSteamRunning());
    }
}
