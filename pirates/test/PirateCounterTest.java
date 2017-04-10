import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class PirateCounterTest {
  PirateCounter pirates;

  @Before
  public void fillList() {
    pirates = new PirateCounter();
    pirates.addPirates(new Pirate("Olaf", false, 12));
    pirates.addPirates(new Pirate("Uwe", true, 9));
    pirates.addPirates(new Pirate("Jack", true, 16));
    pirates.addPirates(new Pirate("Morgan", false, 17));
    pirates.addPirates(new Pirate("Hook", true, 20));
  }

  @Test
  public void testGetGivenPirates() {
    assertTrue(pirates.getGivenPirates().get(0).equals("Jack") && pirates.getGivenPirates().get(1).equals("Hook"));
  }

}