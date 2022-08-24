package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamNativeHandle;
import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamResult;
import com.codedisaster.steamworks.SteamUGCCallback;
import com.codedisaster.steamworks.SteamUGCDetails;
import com.codedisaster.steamworks.SteamUGCQuery;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;

/* renamed from: com.corrodinggames.rts.java.c.j */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/j.class */
public class C1166j implements SteamUGCCallback {

    /* renamed from: a */
    final /* synthetic */ C1163g f7127a;

    public C1166j(C1163g c1163g) {
        this.f7127a = c1163g;
    }

    public void onUGCQueryCompleted(SteamUGCQuery steamUGCQuery, int i, int i2, boolean z, SteamResult steamResult) {
        GameEngine.PrintLog("Got workshop callback: onUGCQueryCompleted (" + steamResult + ") numResultsReturned:" + i);
        if (steamResult != SteamResult.OK) {
            return;
        }
        for (int i3 = 0; i3 < i; i3++) {
            SteamUGCDetails steamUGCDetails = new SteamUGCDetails();
            if (!this.f7127a.f7113d.getQueryUGCResult(steamUGCQuery, i3, steamUGCDetails)) {
                GameEngine.PrintLog("getQueryUGCResult failed for index: " + i3);
            } else {
                SteamPublishedFileID publishedFileID = steamUGCDetails.getPublishedFileID();
                GameEngine.PrintLog("getQueryUGCResult: " + publishedFileID);
                C1164h m272a = this.f7127a.m272a(publishedFileID);
                m272a.f7124d = steamUGCDetails.getTitle();
                m272a.f7123c = true;
                this.f7127a.f7110a = true;
            }
        }
    }

    public void onSubscribeItem(SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        m256a("onSubscribeItem", steamResult);
        GameEngine.m1228A();
    }

    public void onUnsubscribeItem(SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        m256a("onUnsubscribeItem", steamResult);
        GameEngine.m1228A();
    }

    public void onRequestUGCDetails(SteamUGCDetails steamUGCDetails, SteamResult steamResult) {
        m256a("onRequestUGCDetails", steamResult);
    }

    public void onCreateItem(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        m256a("onCreateItem", steamResult);
        if (this.f7127a.f7114e == null) {
            this.f7127a.m269a((C0824b) null, "Error no mod pending creation!", false);
        } else if (this.f7127a.f7114e.f5420k != 0) {
            this.f7127a.m269a(this.f7127a.f7114e, "This mod has already been published", true);
        } else {
            this.f7127a.f7114e.m1839a(SteamNativeHandle.getNativeHandle(steamPublishedFileID));
            this.f7127a.m268a(this.f7127a.f7114e, true, "Created.");
            this.f7127a.f7114e = null;
            GameEngine.m1228A().f6118bZ.m1842m();
        }
    }

    public void onSubmitItemUpdate(boolean z, SteamResult steamResult) {
        String str;
        C0824b c0824b = this.f7127a.f7116g;
        this.f7127a.f7116g = null;
        m256a("onSubmitItemUpdate", steamResult);
        if (steamResult == SteamResult.OK) {
            str = "Workshop item updated.";
        } else if (this.f7127a.f7115f) {
            str = "Error. Workshop returned: " + steamResult + " while trying to upload workshop data.";
        } else {
            str = "Error. Workshop returned: " + steamResult + " while trying to update existing workshop item.";
            if (steamResult == SteamResult.FileNotFound) {
                str = str + " (If you want to create a new workshop item instead of updating, delete steam.dat from this mod.)";
            }
        }
        if (z) {
            str = str + "WLA agreement needs to be accepted on the workshop site.";
        }
        GameEngine.m1228A().m1110i(str);
        GameEngine.m1228A().f6118bZ.m1842m();
    }

    public void onDownloadItemResult(int i, SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        m256a("onDownloadItemResult", steamResult);
        synchronized (this.f7127a.f7117h) {
            C1165i m263c = this.f7127a.m263c(steamPublishedFileID);
            if (m263c != null) {
                m263c.m257a(steamResult);
                this.f7127a.f7117h.remove(m263c);
            }
        }
        GameEngine.m1228A().f6118bZ.m1842m();
    }

    public void onUserFavoriteItemsListChanged(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        m256a("onUserFavoriteItemsListChanged", steamResult);
    }

    public void onSetUserItemVote(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        m256a("onSetUserItemVote", steamResult);
    }

    public void onGetUserItemVote(SteamPublishedFileID steamPublishedFileID, boolean z, boolean z2, boolean z3, SteamResult steamResult) {
        m256a("onGetUserItemVote", steamResult);
    }

    public void onStartPlaytimeTracking(SteamResult steamResult) {
        m256a("onStartPlaytimeTracking", steamResult);
    }

    public void onStopPlaytimeTracking(SteamResult steamResult) {
        m256a("onStopPlaytimeTracking", steamResult);
    }

    public void onStopPlaytimeTrackingForAllItems(SteamResult steamResult) {
        m256a("onStopPlaytimeTrackingForAllItems", steamResult);
    }

    /* renamed from: a */
    public void m256a(String str, SteamResult steamResult) {
        GameEngine.PrintLog("Got workshop callback: " + str + " (" + steamResult + ")");
    }
}
