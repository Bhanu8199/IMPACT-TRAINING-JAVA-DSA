import java.util.Arrays;
public class May10 {
  
  // Anagram
  public static void main(String[] args){
    String s1="silent";
    String s2="listen";
    
    char arr1[]=s1.toCharArray();
    System.out.println(Arrays.toString(arr1));
    
    char arr2[]=s2.toCharArray();
    System.out.println(Arrays.toString(arr2));
    
    
    Arrays.sort(arr1);
    Arrays.sort(arr2);
    System.out.println(Arrays.toString(arr1));
    System.out.println(Arrays.toString(arr2));
    
    String newS1=new String(arr1);
    String newS2=new String(arr2);
    
    if(newS1.equals(newS2)){
      System.out.println("Anagram");
    }else{
      System.out.println("Not Anagram");
    }
  }
}