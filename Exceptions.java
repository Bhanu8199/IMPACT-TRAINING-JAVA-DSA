public class Exceptions{
  public static void main (String[] args) {
    System.out.println("Hello World");
    
    int[] arr={1,2,3,4};
    System.out.println(arr[10]);
    
    String data="hello";
    System.out.println(data.charAt(10));
    
    System.out.println(12/0);
    
    String name=null;
    System.out.println(name.length());
  }
}