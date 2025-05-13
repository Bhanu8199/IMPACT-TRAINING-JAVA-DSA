import java.util.HashSet;
public class HashSet{
  public static void main (String[] args) {
    HashSet<Integer> set=new HashSet<>();
    set.add(11);
    set.add(24);
    set.add(99);
    set.add(4);
    set.add(66);
    set.add(21);
    System.out.println(set);
  }
}