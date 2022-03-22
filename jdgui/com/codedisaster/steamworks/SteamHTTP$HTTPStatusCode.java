/*    */ package com.codedisaster.steamworks;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public enum SteamHTTP$HTTPStatusCode
/*    */ {
/*    */   private final int code;
/*    */   private static final SteamHTTP$HTTPStatusCode[] values;
/* 23 */   Invalid(0),
/*    */   
/* 25 */   Continue(100),
/* 26 */   SwitchingProtocols(101),
/*    */   
/* 28 */   OK(200),
/* 29 */   Created(201),
/* 30 */   Accepted(202),
/* 31 */   NonAuthoritative(203),
/* 32 */   NoContent(204),
/* 33 */   ResetContent(205),
/* 34 */   PartialContent(206),
/*    */   
/* 36 */   MultipleChoices(300),
/* 37 */   MovedPermanently(301),
/* 38 */   Found(302),
/* 39 */   SeeOther(303),
/* 40 */   NotModified(304),
/* 41 */   UseProxy(305),
/* 42 */   TemporaryRedirect(307),
/*    */   
/* 44 */   BadRequest(400),
/* 45 */   Unauthorized(401),
/* 46 */   PaymentRequired(402),
/* 47 */   Forbidden(403),
/* 48 */   NotFound(404),
/* 49 */   MethodNotAllowed(405),
/* 50 */   NotAcceptable(406),
/* 51 */   ProxyAuthRequired(407),
/* 52 */   RequestTimeout(408),
/* 53 */   Conflict(409),
/* 54 */   Gone(410),
/* 55 */   LengthRequired(411),
/* 56 */   PreconditionFailed(412),
/* 57 */   RequestEntityTooLarge(413),
/* 58 */   RequestURITooLong(414),
/* 59 */   UnsupportedMediaType(415),
/* 60 */   RequestedRangeNotSatisfiable(416),
/* 61 */   ExpectationFailed(417),
/* 62 */   Unknown4xx(418),
/* 63 */   TooManyRequests(429),
/*    */   
/* 65 */   InternalServerError(500),
/* 66 */   NotImplemented(501),
/* 67 */   BadGateway(502),
/* 68 */   ServiceUnavailable(503),
/* 69 */   GatewayTimeout(504),
/* 70 */   HTTPVersionNotSupported(505),
/* 71 */   Unknown5xx(599);
/*    */   
/*    */   static {
/* 74 */     values = values();
/*    */   }
/*    */   SteamHTTP$HTTPStatusCode(int paramInt1) {
/* 77 */     this.code = paramInt1;
/*    */   }
/*    */   
/*    */   static SteamHTTP$HTTPStatusCode byValue(int paramInt) {
/* 81 */     for (SteamHTTP$HTTPStatusCode steamHTTP$HTTPStatusCode : values) {
/* 82 */       if (steamHTTP$HTTPStatusCode.code == paramInt) {
/* 83 */         return steamHTTP$HTTPStatusCode;
/*    */       }
/*    */     } 
/* 86 */     return Invalid;
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\codedisaster\steamworks\SteamHTTP$HTTPStatusCode.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */