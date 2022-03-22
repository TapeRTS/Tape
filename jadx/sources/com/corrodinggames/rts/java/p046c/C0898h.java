package com.corrodinggames.rts.java.p046c;

import com.codedisaster.steamworks.SteamNativeHandle;
import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamResult;
import com.codedisaster.steamworks.SteamUGCCallback;
import com.codedisaster.steamworks.SteamUGCDetails;
import com.codedisaster.steamworks.SteamUGCQuery;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p035f.C0657b;

/* renamed from: com.corrodinggames.rts.java.c.h */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/h.class */
public class C0898h implements SteamUGCCallback {

    /* renamed from: a */
    final /* synthetic */ C0897g f6001a;

    public C0898h(C0897g gVar) {
        this.f6001a = gVar;
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onUGCQueryCompleted(SteamUGCQuery steamUGCQuery, int i, int i2, boolean z, SteamResult steamResult) {
        m227a("onUGCQueryCompleted", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onSubscribeItem(SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        m227a("onSubscribeItem", steamResult);
        AbstractC0789l.m638u().f5525bH.m1390k();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onUnsubscribeItem(SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        m227a("onUnsubscribeItem", steamResult);
        AbstractC0789l.m638u().f5525bH.m1390k();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onRequestUGCDetails(SteamUGCDetails steamUGCDetails, SteamResult steamResult) {
        m227a("onRequestUGCDetails", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onCreateItem(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        m227a("onCreateItem", steamResult);
        if (this.f6001a.f6000d == null) {
            this.f6001a.m233a((C0657b) null, "Error no mod pending creation!", false);
        } else if (this.f6001a.f6000d.f4614d != 0) {
            this.f6001a.m233a(this.f6001a.f6000d, "This mod has already been published", true);
        } else {
            this.f6001a.f6000d.m1387a(SteamNativeHandle.getNativeHandle(steamPublishedFileID));
            this.f6001a.m232a(this.f6001a.f6000d, true, "Created.");
            this.f6001a.f6000d = null;
            AbstractC0789l.m638u().f5525bH.m1390k();
        }
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onSubmitItemUpdate(boolean z, SteamResult steamResult) {
        String str;
        m227a("onSubmitItemUpdate", steamResult);
        if (steamResult == SteamResult.OK) {
            str = "Workshop item updated.";
        } else {
            str = "Workshop returned: " + steamResult;
        }
        if (z) {
            str = str + "WLA agreement needs to be accepted on the workshop site.";
        }
        AbstractC0789l.m638u().m657h(str);
        AbstractC0789l.m638u().f5525bH.m1390k();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onDownloadItemResult(int i, SteamPublishedFileID steamPublishedFileID, SteamResult steamResult) {
        m227a("onDownloadItemResult", steamResult);
        AbstractC0789l.m638u().f5525bH.m1390k();
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onUserFavoriteItemsListChanged(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        m227a("onUserFavoriteItemsListChanged", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onSetUserItemVote(SteamPublishedFileID steamPublishedFileID, boolean z, SteamResult steamResult) {
        m227a("onSetUserItemVote", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onGetUserItemVote(SteamPublishedFileID steamPublishedFileID, boolean z, boolean z2, boolean z3, SteamResult steamResult) {
        m227a("onGetUserItemVote", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onStartPlaytimeTracking(SteamResult steamResult) {
        m227a("onStartPlaytimeTracking", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onStopPlaytimeTracking(SteamResult steamResult) {
        m227a("onStopPlaytimeTracking", steamResult);
    }

    @Override // com.codedisaster.steamworks.SteamUGCCallback
    public void onStopPlaytimeTrackingForAllItems(SteamResult steamResult) {
        m227a("onStopPlaytimeTrackingForAllItems", steamResult);
    }

    /* renamed from: a */
    public void m227a(String str, SteamResult steamResult) {
        AbstractC0789l.m670d("Got workshop callback: " + str + " (" + steamResult + ")");
    }
}
