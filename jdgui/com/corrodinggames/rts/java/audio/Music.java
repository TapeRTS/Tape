package com.corrodinggames.rts.java.audio;

public interface Music {
  void play();
  
  void pause();
  
  void stop();
  
  boolean isPlaying();
  
  void setLooping(boolean paramBoolean);
  
  boolean isLooping();
  
  void setVolume(float paramFloat);
  
  float getVolume();
  
  void setPan(float paramFloat1, float paramFloat2);
  
  void setPosition(float paramFloat);
  
  float getPosition();
  
  void dispose();
  
  void setOnCompletionListener(Music$OnCompletionListener paramMusic$OnCompletionListener);
}


/* Location:              D:\Rusted Warfare\Rusted Warfare\game-lib.jar!\com\corrodinggames\rts\java\audio\Music.class
 * Java compiler version: 8 (52.0)
 * JD-Core Version:       1.1.3
 */