public class PetRock {
  private String name;
  private Boolean happy = false;
  private  double mass;

  public PetRock(String name, double mass){
    if(name.isEmpty()){
      throw new IllegalStateException("Name cannot be empty");
    }
    if (mass <= 0) {
      throw new IllegalStateException("Mass must be positive");
    }
    this.name = name;
    this.mass = mass;
  }
  public String getName() {
    return name;
  }

  public Boolean isHappy() {
    return happy;
  }
  public void playWithRock(){
    happy = true;
  }
  public String getHappyMessage(){
    if (!happy){
      throw new IllegalStateException("Rock is not happy");
    }
    return "I'm happy!";
  }
  public int getFavNumber(){
    return 42;
  }

  public double getMass(){
    return mass;
  }
  public void waitTillHappy(int i){
    while (!happy) {
      // do thing!
    }
  }
  public String toString() {
    return "PetRock{" +
        "name='" + name + '\'' +
        ", happy=" + happy +
        ", mass=" + mass +
        '}';
  }
}
