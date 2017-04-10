import org.junit.Test;
import static org.junit.Assert.*;

public class SecondsTest {
  Seconds seconds = new Seconds();

  @Test
  public void testListFiller() {
    seconds.listFiller();
    assertTrue(seconds.getIntList().size() == 12);
  }

  @Test
  public void testEverySecond() {
    seconds.listFiller();
    assertTrue(seconds.getIntList().get(1) == seconds.everySecond().get(0) && seconds.getIntList().get(3) == seconds.everySecond().get(1));
  }
}