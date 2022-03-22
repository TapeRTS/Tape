/*    */ package android.os;
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ 
/*    */ public abstract class IMessenger$Stub
/*    */   extends Binder
/*    */   implements IMessenger
/*    */ {
/*    */   public IMessenger$Stub() {
/* 16 */     attachInterface(this, "android.os.IMessenger");
/*    */   }
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
/*    */   public IBinder asBinder() {
/* 35 */     return (IBinder)this;
/*    */   }
/*    */   public boolean onTransact(int paramInt1, Parcel paramParcel1, Parcel paramParcel2, int paramInt2) {
/*    */     Message message;
/* 39 */     switch (paramInt1) {
/*    */ 
/*    */       
/*    */       case 1598968902:
/* 43 */         paramParcel2.writeString("android.os.IMessenger");
/* 44 */         return true;
/*    */ 
/*    */       
/*    */       case 1:
/* 48 */         paramParcel1.enforceInterface("android.os.IMessenger");
/*    */         
/* 50 */         if (0 != paramParcel1.readInt()) {
/* 51 */           message = (Message)Message.m.createFromParcel(paramParcel1);
/*    */         } else {
/*    */           
/* 54 */           message = null;
/*    */         } 
/* 56 */         a(message);
/* 57 */         return true;
/*    */     } 
/*    */     
/* 60 */     return super.onTransact(paramInt1, paramParcel1, paramParcel2, paramInt2);
/*    */   }
/*    */ }


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\os\IMessenger$Stub.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */