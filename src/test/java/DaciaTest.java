import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DaciaTest {
  @Test
  public void testSpeed() throws InterruptedException {
    DaciaEngine engine = new DaciaEngine();
    Dacia dacia = new Dacia(engine);
    dacia.setAcceleration(500);
    Thread.sleep(4000);
    assertTrue(dacia.getSpeed() > 0);
  }
}
