/*     */ package com.codedisaster.steamworks;
/*     */ 
/*     */ 
/*     */ public enum SteamResult
/*     */ {
/*   6 */   OK(1),
/*   7 */   Fail(2),
/*   8 */   NoConnection(3),
/*     */   
/*  10 */   InvalidPassword(5),
/*  11 */   LoggedInElsewhere(6),
/*  12 */   InvalidProtocolVer(7),
/*  13 */   InvalidParam(8),
/*  14 */   FileNotFound(9),
/*  15 */   Busy(10),
/*  16 */   InvalidState(11),
/*  17 */   InvalidName(12),
/*  18 */   InvalidEmail(13),
/*  19 */   DuplicateName(14),
/*  20 */   AccessDenied(15),
/*  21 */   Timeout(16),
/*  22 */   Banned(17),
/*  23 */   AccountNotFound(18),
/*  24 */   InvalidSteamID(19),
/*  25 */   ServiceUnavailable(20),
/*  26 */   NotLoggedOn(21),
/*  27 */   Pending(22),
/*  28 */   EncryptionFailure(23),
/*  29 */   InsufficientPrivilege(24),
/*  30 */   LimitExceeded(25),
/*  31 */   Revoked(26),
/*  32 */   Expired(27),
/*  33 */   AlreadyRedeemed(28),
/*  34 */   DuplicateRequest(29),
/*  35 */   AlreadyOwned(30),
/*  36 */   IPNotFound(31),
/*  37 */   PersistFailed(32),
/*  38 */   LockingFailed(33),
/*  39 */   LogonSessionReplaced(34),
/*  40 */   ConnectFailed(35),
/*  41 */   HandshakeFailed(36),
/*  42 */   IOFailure(37),
/*  43 */   RemoteDisconnect(38),
/*  44 */   ShoppingCartNotFound(39),
/*  45 */   Blocked(40),
/*  46 */   Ignored(41),
/*  47 */   NoMatch(42),
/*  48 */   AccountDisabled(43),
/*  49 */   ServiceReadOnly(44),
/*  50 */   AccountNotFeatured(45),
/*  51 */   AdministratorOK(46),
/*  52 */   ContentVersion(47),
/*  53 */   TryAnotherCM(48),
/*  54 */   PasswordRequiredToKickSession(49),
/*  55 */   AlreadyLoggedInElsewhere(50),
/*  56 */   Suspended(51),
/*  57 */   Cancelled(52),
/*  58 */   DataCorruption(53),
/*  59 */   DiskFull(54),
/*  60 */   RemoteCallFailed(55),
/*  61 */   PasswordUnset(56),
/*  62 */   ExternalAccountUnlinked(57),
/*  63 */   PSNTicketInvalid(58),
/*  64 */   ExternalAccountAlreadyLinked(59),
/*  65 */   RemoteFileConflict(60),
/*  66 */   IllegalPassword(61),
/*  67 */   SameAsPreviousValue(62),
/*  68 */   AccountLogonDenied(63),
/*  69 */   CannotUseOldPassword(64),
/*  70 */   InvalidLoginAuthCode(65),
/*  71 */   AccountLogonDeniedNoMail(66),
/*  72 */   HardwareNotCapableOfIPT(67),
/*  73 */   IPTInitError(68),
/*  74 */   ParentalControlRestricted(69),
/*  75 */   FacebookQueryError(70),
/*  76 */   ExpiredLoginAuthCode(71),
/*  77 */   IPLoginRestrictionFailed(72),
/*  78 */   AccountLockedDown(73),
/*  79 */   AccountLogonDeniedVerifiedEmailRequired(74),
/*  80 */   NoMatchingURL(75),
/*  81 */   BadResponse(76),
/*  82 */   RequirePasswordReEntry(77),
/*  83 */   ValueOutOfRange(78),
/*  84 */   UnexpectedError(79),
/*  85 */   Disabled(80),
/*  86 */   InvalidCEGSubmission(81),
/*  87 */   RestrictedDevice(82),
/*  88 */   RegionLocked(83),
/*  89 */   RateLimitExceeded(84),
/*  90 */   AccountLoginDeniedNeedTwoFactor(85),
/*  91 */   ItemDeleted(86),
/*  92 */   AccountLoginDeniedThrottle(87),
/*  93 */   TwoFactorCodeMismatch(88),
/*  94 */   TwoFactorActivationCodeMismatch(89),
/*  95 */   AccountAssociatedToMultiplePartners(90),
/*  96 */   NotModified(91),
/*  97 */   NoMobileDevice(92),
/*  98 */   TimeNotSynced(93),
/*  99 */   SmsCodeFailed(94),
/* 100 */   AccountLimitExceeded(95),
/* 101 */   AccountActivityLimitExceeded(96),
/* 102 */   PhoneActivityLimitExceeded(97),
/* 103 */   RefundToWallet(98),
/* 104 */   EmailSendFailure(99),
/* 105 */   NotSettled(100),
/* 106 */   NeedCaptcha(101),
/* 107 */   GSLTDenied(102),
/* 108 */   GSOwnerDenied(103),
/* 109 */   InvalidItemType(104),
/* 110 */   IPBanned(105),
/* 111 */   GLSTExpired(106),
/*     */ 
/*     */   
/* 114 */   UnknownErrorCode_NotImplementedByAPI(0);
/*     */   
/*     */   private final int code;
/*     */   private static final SteamResult[] valuesLookupTable;
/*     */   
/*     */   SteamResult(int paramInt1) {
/* 120 */     this.code = paramInt1;
/*     */   }
/*     */   
/*     */   public static SteamResult byValue(int paramInt) {
/* 124 */     if (paramInt < valuesLookupTable.length) {
/* 125 */       return valuesLookupTable[paramInt];
/*     */     }
/* 127 */     return UnknownErrorCode_NotImplementedByAPI;
/*     */   }
/*     */ 
/*     */   
/*     */   static {
/* 132 */     SteamResult[] arrayOfSteamResult = values();
/* 133 */     int i = 0;
/*     */     
/* 135 */     for (SteamResult steamResult : arrayOfSteamResult) {
/* 136 */       i = Math.max(i, steamResult.code);
/*     */     }
/*     */     
/* 139 */     valuesLookupTable = new SteamResult[i + 1];
/*     */     
/* 141 */     for (SteamResult steamResult : arrayOfSteamResult)
/* 142 */       valuesLookupTable[steamResult.code] = steamResult; 
/*     */   }
/*     */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamResult.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */