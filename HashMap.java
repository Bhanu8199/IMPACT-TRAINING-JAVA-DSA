import java.util.HashMap;
public class MyMapExample {
  public static void main (String[] args) {
    HashMap<String, Integer> map = new HashMap<>();
    map.put("One", 1);
    map.put("Two", 2);
    map.put("Three", 3);
    map.put("Four", 4);
    System.err.println(map);
  }
}
