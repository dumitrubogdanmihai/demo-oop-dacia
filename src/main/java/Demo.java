
public class Demo {
  public static void main(String[] args) {
    Dacia dacia = new Dacia(new DaciaEngine());
    dacia.startEngine();
    //dacia.startFoglights();
    dacia.getSpeed();
    dacia.setAcceleration(100);
    
    while(true) {
      System.out.println(dacia.getSpeed());
    }
  }
}
