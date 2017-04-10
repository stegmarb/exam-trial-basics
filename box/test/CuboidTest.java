import org.junit.Before;
import org.junit.Test;
import static org.junit.Assert.*;

public class CuboidTest {
  Cuboid cuboid;

  @Before
  public void instantiation() {
    cuboid = new  Cuboid(12, 10,5);
  }

  @Test
  public void testGetSurface() {
    assertTrue(cuboid.getSurface() == 460);
  }

  @Test
  public void testGetVolume() {
    assertTrue(cuboid.getVolume() == 600);
  }
}