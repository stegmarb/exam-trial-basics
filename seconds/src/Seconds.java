import java.util.ArrayList;
import java.util.List;

public class Seconds {
  public static void main(String[] args) {
    List<Integer> numbers = new ArrayList<>();
    listFiller(numbers);
    System.out.println(numbers);
    System.out.println(everySecond(numbers));
  }

  public static List<Integer> everySecond(List<Integer> list) {
    List<Integer> everySecond = new ArrayList<>();
    for (int i = 1; i < list.size(); i+=2) {
      everySecond.add(list.get(i));
    }
    return everySecond;
  }

  public static List<Integer> listFiller(List<Integer> list) {
    for (int i = 0; i < 12; i++) {
      list.add((int)(Math.random()*10));
    }
    return list;
  }
}
