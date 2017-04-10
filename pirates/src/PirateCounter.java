import java.util.ArrayList;
import java.util.List;

public class PirateCounter {
  public static void main(String... args){
    ArrayList<Pirate> pirates = new ArrayList<>();
    pirates.add(new Pirate("Olaf", false, 12));
    pirates.add(new Pirate("Uwe", true, 9));
    pirates.add(new Pirate("Jack", true, 16));
    pirates.add(new Pirate("Morgan", false, 17));
    pirates.add(new Pirate("Hook", true, 20));
    System.out.println(getGivenPirates(pirates));
  }

  public static List<String> getGivenPirates(List<Pirate> pirates) {
    List<String> names = new ArrayList<>();
    for (Pirate pirate : pirates) {
      if (pirate.hasWoodenLeg && pirate.gold > 15) {
        names.add(pirate.name);
      }
    }
    return names;
  }
}
