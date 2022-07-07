
public class Dacia implements Car {
  private DaciaEngine engine;
  private double speed = 0;
  
  public Dacia(DaciaEngine engine) {
    this.engine = engine;
  }

  public void startEngine() {
    engine.start();
    
    Thread thread = new Thread(new Runnable() {
      public void run() {
        while(true) {
          if (speed < 120) {
            speed += engine.getSpeedIncrement();
          }
          try {
            Thread.sleep(1000);
          } catch (InterruptedException e) {
            e.printStackTrace();
          }
        }
      }
    });
    thread.start();
  }

  public void startFoglights() {
    throw new UnsupportedOperationException();
  }

  public double getSpeed() {
    return speed;
  }

  public void setAcceleration(int percentage) {
    if (percentage < 0 || percentage > 100) {
      throw new IllegalArgumentException();
    }
    engine.setAcceleration(percentage);
  }
}
