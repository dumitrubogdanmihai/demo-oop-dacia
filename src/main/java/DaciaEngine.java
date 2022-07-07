
public class DaciaEngine {

  
  private boolean isEngineStarted = false;
  private double accelerationPercentage;
  public void start() {
  }
  public double getSpeedIncrement() {
    return accelerationPercentage / 50.0;
  }
  public void setAcceleration(int percentage) {
    this.accelerationPercentage = percentage;
  }
}
