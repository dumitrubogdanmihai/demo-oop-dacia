import static org.junit.Assert.assertTrue;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;

import org.junit.Test;

public class DaciaTest {
  @Test
  public void testSpeed() throws InterruptedException {
    assertTrue(false);
    
    
    DaciaEngine mockedEngine = mock(DaciaEngine.class);
    mockedEngine.setAcceleration(100);
    when(mockedEngine.getSpeedIncrement())
      .thenReturn(1.0);
    
    Dacia dacia = new Dacia(mockedEngine);
    dacia.startEngine();
    dacia.setAcceleration(100);
    Thread.sleep(4000);
    assertTrue(dacia.getSpeed() > 0);
  }
}
