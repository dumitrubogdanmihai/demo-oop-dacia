import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class DaciaEngineTest {
  @Test
  public void testSpeedIncrement() {
    DaciaEngine engine = new DaciaEngine();
    engine.setAcceleration(50);
    assertEquals(1.0, engine.getSpeedIncrement(), 0);
  }
}
