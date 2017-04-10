import org.junit.Test;
import static org.junit.Assert.*;

public class CountAsTest {
  CountAs count;

  @Test
  public void testGetAsNumber() {
    count = new CountAs("afile.txt");
    assertTrue(count.getAsNumber() == 28);
  }

  @Test
  public void testGetAsNumberWrongFile() {
    count = new CountAs("not-a-file.txt");
    assertTrue(count.getAsNumber() == 0);
  }
}