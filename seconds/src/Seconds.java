import java.util.ArrayList;
import java.util.List;

public class Seconds {
  private List<Integer> intList = new ArrayList<>();

  public List<Integer> everySecond(){
    List<Integer> everySecond = new ArrayList<>();
    for (int i = 1; i < intList.size(); i+=2) {
      everySecond.add(intList.get(i));
    }
    return everySecond;
  }

  public List<Integer> listFiller() {
    for (int i = 0; i < 12; i++) {
      intList.add((int)(Math.random()*10));
    }
    return intList;
  }

  public List<Integer> getIntList() {
    return intList;
  }
}
