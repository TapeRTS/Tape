package com.codedisaster.steamworks;

public interface SteamUGCCallback {
  void onUGCQueryCompleted(SteamUGCQuery paramSteamUGCQuery, int paramInt1, int paramInt2, boolean paramBoolean, SteamResult paramSteamResult);
  
  void onSubscribeItem(SteamPublishedFileID paramSteamPublishedFileID, SteamResult paramSteamResult);
  
  void onUnsubscribeItem(SteamPublishedFileID paramSteamPublishedFileID, SteamResult paramSteamResult);
  
  void onRequestUGCDetails(SteamUGCDetails paramSteamUGCDetails, SteamResult paramSteamResult);
  
  void onCreateItem(SteamPublishedFileID paramSteamPublishedFileID, boolean paramBoolean, SteamResult paramSteamResult);
  
  void onSubmitItemUpdate(boolean paramBoolean, SteamResult paramSteamResult);
  
  void onDownloadItemResult(int paramInt, SteamPublishedFileID paramSteamPublishedFileID, SteamResult paramSteamResult);
  
  void onUserFavoriteItemsListChanged(SteamPublishedFileID paramSteamPublishedFileID, boolean paramBoolean, SteamResult paramSteamResult);
  
  void onSetUserItemVote(SteamPublishedFileID paramSteamPublishedFileID, boolean paramBoolean, SteamResult paramSteamResult);
  
  void onGetUserItemVote(SteamPublishedFileID paramSteamPublishedFileID, boolean paramBoolean1, boolean paramBoolean2, boolean paramBoolean3, SteamResult paramSteamResult);
  
  void onStartPlaytimeTracking(SteamResult paramSteamResult);
  
  void onStopPlaytimeTracking(SteamResult paramSteamResult);
  
  void onStopPlaytimeTrackingForAllItems(SteamResult paramSteamResult);
}


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamUGCCallback.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */