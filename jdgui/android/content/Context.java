package android.content;

import android.content.pm.PackageManager;
import android.content.res.AssetManager;
import android.content.res.Resources;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public abstract class Context {
  public abstract AssetManager d();
  
  public abstract Resources e();
  
  public abstract PackageManager f();
  
  public abstract Context g();
  
  public abstract String h();
  
  public abstract SharedPreferences a(String paramString, int paramInt);
  
  public abstract FileInputStream a(String paramString);
  
  public abstract FileOutputStream b(String paramString, int paramInt);
  
  public abstract void a(Intent paramIntent);
  
  public abstract Object b(String paramString);
}


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\android\content\Context.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */