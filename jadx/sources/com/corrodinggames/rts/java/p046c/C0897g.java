package com.corrodinggames.rts.java.p046c;

import com.codedisaster.steamworks.SteamNativeHandle;
import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamRemoteStorage;
import com.codedisaster.steamworks.SteamUGC;
import com.codedisaster.steamworks.SteamUGCCallback;
import com.codedisaster.steamworks.SteamUGCUpdateHandle;
import com.corrodinggames.rts.gameFramework.AbstractC0789l;
import com.corrodinggames.rts.gameFramework.p035f.C0657b;
import java.util.Collection;

/* renamed from: com.corrodinggames.rts.java.c.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/g.class */
public class C0897g {

    /* renamed from: a */
    C0891b f5997a;

    /* renamed from: b */
    SteamUGCCallback f5998b = new C0898h(this);

    /* renamed from: c */
    SteamUGC f5999c;

    /* renamed from: d */
    C0657b f6000d;

    public C0897g(C0891b bVar) {
        this.f5997a = bVar;
    }

    /* renamed from: a */
    public void m235a(SteamUGC steamUGC) {
        this.f5999c = steamUGC;
    }

    /* renamed from: a */
    public SteamUGCCallback m237a() {
        return this.f5998b;
    }

    /* renamed from: a */
    public void m233a(C0657b bVar, String str, boolean z) {
        AbstractC0789l.m670d("workshop: " + str);
        if (z) {
            AbstractC0789l.m638u().m657h(str);
        }
    }

    /* renamed from: a */
    public boolean m234a(C0657b bVar) {
        if (bVar.f4618h != null) {
            return true;
        }
        m233a(bVar, "A title is required in the file 'mod-info.txt'", true);
        return false;
    }

    /* renamed from: b */
    public void m230b(C0657b bVar) {
        if (this.f6000d != null) {
            m233a(bVar, "A mod is already pending publishing", false);
        } else if (bVar.f4614d != 0) {
            m233a(bVar, "This mod has already been published", false);
        } else if (m234a(bVar)) {
            if (!bVar.m1387a(0L)) {
                m233a(bVar, "Failed to write metadata to mod, check file permissions", true);
                return;
            }
            this.f6000d = bVar;
            this.f5999c.createItem(this.f5997a.f5984j.getAppID(), SteamRemoteStorage.WorkshopFileType.Community);
        }
    }

    /* renamed from: a */
    public void m232a(C0657b bVar, boolean z, String str) {
        if (m234a(bVar)) {
            SteamUGCUpdateHandle startItemUpdate = this.f5999c.startItemUpdate(this.f5997a.f5984j.getAppID(), new SteamPublishedFileID(bVar.f4614d));
            if (z) {
                if (bVar.f4618h != null) {
                    this.f5999c.setItemTitle(startItemUpdate, bVar.f4618h);
                }
                if (bVar.f4619i != null) {
                    this.f5999c.setItemDescription(startItemUpdate, bVar.f4619i);
                }
            }
            if (z) {
                this.f5999c.setItemVisibility(startItemUpdate, SteamRemoteStorage.PublishedFileVisibility.Public);
            }
            String n = bVar.m1370n();
            if (n != null) {
                this.f5999c.setItemPreview(startItemUpdate, n);
            }
            String c = bVar.m1381c("tags");
            if (c != null) {
                String[] split = c.split(",");
                for (int i = 0; i < split.length; i++) {
                    split[i] = split[i].trim();
                    AbstractC0789l.m670d("Adding tag:" + split[i]);
                }
                this.f5999c.setItemTags(startItemUpdate, split);
            }
            String g = bVar.m1377g();
            AbstractC0789l.m670d("convertedAbsolutePath:" + g);
            this.f5999c.setItemContent(startItemUpdate, g);
            bVar.f4637A = "Uploading to workshop";
            this.f5999c.submitItemUpdate(startItemUpdate, str);
            AbstractC0789l.m670d("submitted item update for:" + bVar.f4614d);
        }
    }

    /* renamed from: b */
    public void m231b() {
        this.f5997a.f5977c.activateGameOverlayToWebPage("http://steamcommunity.com/workshop/browse/?appid=" + this.f5997a.f5984j.getAppID());
    }

    /* renamed from: c */
    public void m228c(C0657b bVar) {
        this.f5997a.f5977c.activateGameOverlayToWebPage("steam://url/CommunityFilePage/" + bVar.f4614d);
    }

    /* renamed from: a */
    public long m236a(SteamPublishedFileID steamPublishedFileID) {
        return SteamNativeHandle.getNativeHandle(steamPublishedFileID);
    }

    /* renamed from: c */
    public void m229c() {
        AbstractC0789l u = AbstractC0789l.m638u();
        AbstractC0789l.m670d("--------------");
        AbstractC0789l.m670d("Steam: loadWorkshopMods");
        SteamPublishedFileID[] steamPublishedFileIDArr = new SteamPublishedFileID[this.f5999c.getNumSubscribedItems()];
        this.f5999c.getSubscribedItems(steamPublishedFileIDArr);
        for (SteamPublishedFileID steamPublishedFileID : steamPublishedFileIDArr) {
            Collection<SteamUGC.ItemState> itemState = this.f5999c.getItemState(steamPublishedFileID);
            long a = m236a(steamPublishedFileID);
            AbstractC0789l.m670d("Found workshop item " + a);
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            for (SteamUGC.ItemState itemState2 : itemState) {
                AbstractC0789l.m670d("itemState: " + itemState2);
                if (itemState2 == SteamUGC.ItemState.Downloading || itemState2 == SteamUGC.ItemState.DownloadPending) {
                    z2 = true;
                }
                if (itemState2 == SteamUGC.ItemState.Installed) {
                    z = true;
                }
                if (itemState2 == SteamUGC.ItemState.NeedsUpdate) {
                    z3 = true;
                }
                if (itemState2 == SteamUGC.ItemState.Subscribed) {
                    z4 = true;
                }
            }
            String str = "sw" + a;
            String str2 = null;
            String str3 = null;
            if (!z4) {
                AbstractC0789l.m670d("Skipping: " + a + " as it is not subscribed");
            } else {
                if (z) {
                    SteamUGC.ItemInstallInfo itemInstallInfo = new SteamUGC.ItemInstallInfo();
                    this.f5999c.getItemInstallInfo(steamPublishedFileID, itemInstallInfo);
                    str2 = itemInstallInfo.getFolder();
                    AbstractC0789l.m670d("Installed at:" + str2);
                } else {
                    str3 = "Not installed";
                    if (z3) {
                        str3 = "Update needed";
                    }
                    if (z2) {
                        str3 = "Downloading files";
                    }
                }
                C0657b a2 = u.f5525bH.m1406a(str, str2, str, true, true, false);
                if (a2.f4636z == null) {
                    a2.f4636z = str3;
                }
                if ((!z || z3) && !z2) {
                    AbstractC0789l.m670d("Queuing download");
                    this.f5999c.downloadItem(steamPublishedFileID, false);
                }
            }
        }
    }
}
