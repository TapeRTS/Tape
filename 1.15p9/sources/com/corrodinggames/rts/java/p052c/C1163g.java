package com.corrodinggames.rts.java.p052c;

import com.codedisaster.steamworks.SteamAPI;
import com.codedisaster.steamworks.SteamNativeHandle;
import com.codedisaster.steamworks.SteamPublishedFileID;
import com.codedisaster.steamworks.SteamRemoteStorage;
import com.codedisaster.steamworks.SteamUGC;
import com.codedisaster.steamworks.SteamUGCCallback;
import com.codedisaster.steamworks.SteamUGCQuery;
import com.codedisaster.steamworks.SteamUGCUpdateHandle;
import com.corrodinggames.rts.game.units.custom.logicBooleans.VariableScope;
import com.corrodinggames.rts.gameFramework.CommonUtils;
import com.corrodinggames.rts.gameFramework.GameEngine;
import com.corrodinggames.rts.gameFramework.p036e.C0750a;
import com.corrodinggames.rts.gameFramework.p040h.C0824b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;

/* renamed from: com.corrodinggames.rts.java.c.g */
/* loaded from: game-lib.jar:com/corrodinggames/rts/java/c/g.class */
public class C1163g {

    /* renamed from: b */
    C1157b f7111b;

    /* renamed from: d */
    SteamUGC f7113d;

    /* renamed from: e */
    C0824b f7114e;

    /* renamed from: f */
    boolean f7115f;

    /* renamed from: g */
    C0824b f7116g;

    /* renamed from: k */
    int f7120k;

    /* renamed from: a */
    boolean f7110a = false;

    /* renamed from: h */
    ArrayList f7117h = new ArrayList();

    /* renamed from: i */
    HashMap f7118i = new HashMap();

    /* renamed from: j */
    ArrayList f7119j = new ArrayList();

    /* renamed from: c */
    SteamUGCCallback f7112c = new C1166j(this);

    /* renamed from: e */
    private void m265e() {
        if (this.f7119j.size() == 0) {
            return;
        }
        SteamUGCQuery createQueryUGCDetailsRequest = this.f7113d.createQueryUGCDetailsRequest(this.f7119j);
        this.f7119j.clear();
        this.f7113d.sendQueryUGCRequest(createQueryUGCDetailsRequest);
        this.f7113d.releaseQueryUserUGCRequest(createQueryUGCDetailsRequest);
        SteamAPI.runCallbacks();
    }

    /* renamed from: e */
    private void m264e(SteamPublishedFileID steamPublishedFileID) {
        GameEngine.PrintLog("Adding request for workshop details: " + steamPublishedFileID);
        this.f7119j.add(steamPublishedFileID);
    }

    /* renamed from: a */
    public C1164h m278a(SteamPublishedFileID steamPublishedFileID) {
        C1164h c1164h = (C1164h) this.f7118i.get(steamPublishedFileID);
        if (c1164h == null) {
            GameEngine.PrintLog("New ItemInfo: " + steamPublishedFileID);
            c1164h = new C1164h();
            c1164h.f7121a = steamPublishedFileID;
            this.f7118i.put(steamPublishedFileID, c1164h);
        }
        return c1164h;
    }

    /* renamed from: b */
    public String m272b(SteamPublishedFileID steamPublishedFileID) {
        C1164h m278a = m278a(steamPublishedFileID);
        if (m278a.f7122b == 0 && !m278a.f7123c) {
            m278a.f7122b = System.currentTimeMillis();
            m264e(steamPublishedFileID);
        }
        if (m278a.f7123c) {
            GameEngine.PrintLog("Got data for: " + steamPublishedFileID + " - " + m278a.f7124d);
            return m278a.f7124d;
        }
        GameEngine.PrintLog("No data for: " + steamPublishedFileID);
        return null;
    }

    /* renamed from: c */
    public C1165i m269c(SteamPublishedFileID steamPublishedFileID) {
        Iterator it = this.f7117h.iterator();
        while (it.hasNext()) {
            C1165i c1165i = (C1165i) it.next();
            if (c1165i.f7125a.equals(steamPublishedFileID)) {
                return c1165i;
            }
        }
        return null;
    }

    public C1163g(C1157b c1157b) {
        this.f7111b = c1157b;
    }

    /* renamed from: a */
    public void m277a(SteamUGC steamUGC) {
        this.f7113d = steamUGC;
    }

    /* renamed from: a */
    public SteamUGCCallback m279a() {
        return this.f7112c;
    }

    /* renamed from: a */
    public void m275a(C0824b c0824b, String str, boolean z) {
        GameEngine.PrintLog("workshop: " + str);
        if (z) {
            GameEngine.getInstance().m1116i(str);
        }
    }

    /* renamed from: a */
    public boolean m276a(C0824b c0824b) {
        if (c0824b.f5428s == null) {
            m275a(c0824b, "A title is required in the file 'mod-info.txt'", true);
            return false;
        }
        String m1825p = c0824b.m1825p();
        if (m1825p != null && !C0750a.m2443h(m1825p)) {
            m275a(c0824b, "Could not find thumbnail file: " + m1825p + " referenced mod-info.txt", true);
            return false;
        }
        return true;
    }

    /* renamed from: b */
    public void m271b(C0824b c0824b) {
        if (this.f7114e != null) {
            m275a(c0824b, "A mod is already pending publishing", false);
        } else if (c0824b.f5420k != 0) {
            m275a(c0824b, "This mod has already been published", false);
        } else if (!m276a(c0824b)) {
        } else {
            if (!c0824b.m1845a(0L)) {
                m275a(c0824b, "Failed to write metadata to mod, check file permissions", true);
                return;
            }
            this.f7114e = c0824b;
            this.f7113d.createItem(this.f7111b.f7097j.getAppID(), SteamRemoteStorage.WorkshopFileType.Community);
        }
    }

    /* renamed from: a */
    public void m274a(C0824b c0824b, boolean z, String str) {
        if (!m276a(c0824b)) {
            return;
        }
        SteamUGCUpdateHandle startItemUpdate = this.f7113d.startItemUpdate(this.f7111b.f7097j.getAppID(), new SteamPublishedFileID(c0824b.f5420k));
        if (z) {
            if (c0824b.f5428s != null) {
                this.f7113d.setItemTitle(startItemUpdate, c0824b.f5428s);
            }
            if (c0824b.f5430u != null) {
                this.f7113d.setItemDescription(startItemUpdate, c0824b.f5430u);
            }
        }
        if (z) {
            this.f7113d.setItemVisibility(startItemUpdate, SteamRemoteStorage.PublishedFileVisibility.Public);
        }
        String m1825p = c0824b.m1825p();
        if (m1825p != null) {
            this.f7113d.setItemPreview(startItemUpdate, m1825p);
        }
        String m1838c = c0824b.m1838c("tags");
        if (m1838c != null) {
            String[] split = m1838c.split(",");
            for (int i = 0; i < split.length; i++) {
                split[i] = split[i].trim();
                GameEngine.PrintLog("Adding tag:" + split[i]);
            }
            this.f7113d.setItemTags(startItemUpdate, split);
        }
        String m1832i = c0824b.m1832i();
        GameEngine.PrintLog("convertedAbsolutePath:" + m1832i);
        this.f7113d.setItemContent(startItemUpdate, m1832i);
        c0824b.f5453S = "Uploading to workshop";
        this.f7115f = z;
        this.f7116g = c0824b;
        this.f7113d.submitItemUpdate(startItemUpdate, str);
        GameEngine.PrintLog("submitted item update for:" + c0824b.f5420k);
    }

    /* renamed from: b */
    public void m273b() {
        this.f7111b.f7090c.activateGameOverlayToWebPage("http://steamcommunity.com/workshop/browse/?appid=" + this.f7111b.f7097j.getAppID());
    }

    /* renamed from: c */
    public void m268c(C0824b c0824b) {
        this.f7111b.f7090c.activateGameOverlayToWebPage("steam://url/CommunityFilePage/" + c0824b.f5420k);
    }

    /* renamed from: d */
    public long m266d(SteamPublishedFileID steamPublishedFileID) {
        return SteamNativeHandle.getNativeHandle(steamPublishedFileID);
    }

    /* renamed from: c */
    public void m270c() {
        if (this.f7110a) {
            this.f7110a = false;
            GameEngine.getInstance().f6118bZ.m1848m();
        }
        int numSubscribedItems = this.f7113d.getNumSubscribedItems();
        if (numSubscribedItems != this.f7120k) {
            GameEngine.PrintLog("Number of subscribed items changed from: " + this.f7120k + " to: " + numSubscribedItems);
            this.f7120k = numSubscribedItems;
            GameEngine.getInstance();
            m267d();
            this.f7110a = true;
        }
    }

    /* renamed from: d */
    public void m267d() {
        SteamUGC.ItemDownloadInfo itemDownloadInfo;
        String m272b;
        GameEngine gameEngine = GameEngine.getInstance();
        SteamAPI.runCallbacks();
        GameEngine.PrintLog("--------------");
        GameEngine.PrintLog("Steam: loadWorkshopMods");
        int numSubscribedItems = this.f7113d.getNumSubscribedItems();
        this.f7120k = numSubscribedItems;
        SteamPublishedFileID[] steamPublishedFileIDArr = new SteamPublishedFileID[numSubscribedItems];
        this.f7113d.getSubscribedItems(steamPublishedFileIDArr);
        for (SteamPublishedFileID steamPublishedFileID : steamPublishedFileIDArr) {
            Collection<SteamUGC.ItemState> itemState = this.f7113d.getItemState(steamPublishedFileID);
            long m266d = m266d(steamPublishedFileID);
            boolean z = false;
            boolean z2 = false;
            boolean z3 = false;
            boolean z4 = false;
            boolean z5 = false;
            String str = null;
            for (SteamUGC.ItemState itemState2 : itemState) {
                if (itemState2 != SteamUGC.ItemState.None) {
                    if (str == null) {
                        str = VariableScope.nullOrMissingString + itemState2;
                    } else {
                        str = str + ", " + itemState2;
                    }
                    if (itemState2 == SteamUGC.ItemState.Downloading) {
                        z2 = true;
                    }
                    if (itemState2 == SteamUGC.ItemState.DownloadPending) {
                        z2 = true;
                        z3 = true;
                    }
                    if (itemState2 == SteamUGC.ItemState.Installed) {
                        z = true;
                    }
                    if (itemState2 == SteamUGC.ItemState.NeedsUpdate) {
                        z4 = true;
                    }
                    if (itemState2 == SteamUGC.ItemState.Subscribed) {
                        z5 = true;
                    }
                }
            }
            GameEngine.PrintLog("Found workshop item " + m266d + " with state: " + str + VariableScope.nullOrMissingString);
            String str2 = "sw" + m266d;
            String str3 = "(Workshop item - " + m266d + ")";
            if (!z && (m272b = m272b(steamPublishedFileID)) != null) {
                str3 = m272b;
            }
            String str4 = null;
            String str5 = null;
            if (!z5) {
                GameEngine.PrintLog("Skipping: " + m266d + " as it is not subscribed");
            } else {
                if (z) {
                    SteamUGC.ItemInstallInfo itemInstallInfo = new SteamUGC.ItemInstallInfo();
                    this.f7113d.getItemInstallInfo(steamPublishedFileID, itemInstallInfo);
                    str4 = itemInstallInfo.getFolder();
                    GameEngine.PrintLog(" Installed at: " + str4);
                } else {
                    GameEngine.PrintLog(" Not installed");
                    str5 = "Not installed.";
                    if (z4) {
                        str5 = "Update needed..";
                    }
                    if (z3) {
                        str5 = "Download pending in steam...";
                    } else if (z2) {
                        str5 = "Steam is downloading files..";
                        if (this.f7113d.getItemDownloadInfo(steamPublishedFileID, new SteamUGC.ItemDownloadInfo())) {
                            str5 = str5 + " " + CommonUtils.m2295c((itemDownloadInfo.getBytesDownloaded() / itemDownloadInfo.getBytesTotal()) * 100.0d) + "%";
                        }
                    }
                }
                int i = 0;
                if (!z) {
                    i = -1;
                }
                C0824b m1870a = gameEngine.f6118bZ.m1870a(str2, str2, str4, str2, true, true, false, i);
                if (m1870a.f5428s == null) {
                    m1870a.f5429t = str3;
                }
                if (str5 == null && z4) {
                    if (z3) {
                        str5 = "An update is pending download in Steam.";
                    } else if (z3) {
                        str5 = "An update is downloading...";
                    } else {
                        str5 = "An update is available.";
                    }
                }
                m1870a.f5454T = str5;
                if ((!z || z4) && (!z2 || z3)) {
                    GameEngine.PrintLog("Queuing download on: " + steamPublishedFileID);
                    this.f7113d.downloadItem(steamPublishedFileID, false);
                }
            }
        }
        m265e();
    }
}
