public class May9 {
    public static void main(String[] args) {

      // check the frequency of character in a string.
      String data="Programming";
      char ch='m';
      int counter=0;
      
      for(int i=0;i<data.length();i++){
        char element=data.charAt(i);
        if(ch==element){
          counter++;
        }
      }
      System.out.println(counter);
  }    
}