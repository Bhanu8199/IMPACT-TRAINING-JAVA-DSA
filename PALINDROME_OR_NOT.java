public class May9 {
    public static void main(String[] args) {
      
      // checkingPalindrome or not
      
      String name="abcdcba";
      String another="";
      for(int i=name.length()-1;i>=0;i--){
        another=another+name.charAt(i);
          
      }
        if(name.equals(another)){
          System.out.println("Palindrome");
        }else{
          System.out.println("NOT A Pa;lindrome");
        }
  }    
}