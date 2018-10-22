class Chick implements Animal{
  private String myType;
  private String mySound;
  private String mySoundB;
  private boolean twoSounds;
  public Chick(String type,String sound){
    myType = type;
    mySound = sound;
    twoSounds = false;
  }
  public Chick(){
    myType = "unknown";
    mySound = "unknown";
    twoSounds = false;
  }
  public Chick(String type, String sound, String soundB){
    myType = type;
    mySound = sound;
    mySoundB = soundB;
    twoSounds = true;
  }
  public String getSound(){
    if(twoSounds == true){
      if(Math.random()<0.5){
        return mySound;
      }else{
        return mySoundB; 
      }
    }else{
      return mySound; 
    }
  }
  public String getType(){
    return myType; 
  }
}