package com.corrodinggames.rts.java.audio;

public interface AudioDevice {
  boolean isMono();
  
  void writeSamples(short[] paramArrayOfshort, int paramInt1, int paramInt2);
  
  void writeSamples(float[] paramArrayOffloat, int paramInt1, int paramInt2);
  
  int getLatency();
  
  void dispose();
  
  void setVolume(float paramFloat);
}


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\AudioDevice.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */