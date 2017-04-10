import java.util.ArrayList;
import java.util.List;

public class PirateCounter {
  private ArrayList<Pirate> pirates = new ArrayList<>();

  public void addPirates(Pirate pirate) {
    pirates.add(pirate);
  }

  public List<String> getGivenPirates() {
    List<String> names = new ArrayList<>();
    for (Pirate pirate : pirates) {
      if (pirate.hasWoodenLeg && pirate.gold > 15) {
        names.add(pirate.name);
      }
    }
    return names;
  }
}
