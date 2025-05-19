public class SubStringProblem {
  public static void main(String[] args) {
    
    // print all the substring using loop
    
    String data="abcd";
    
    for(int i=0;i<=data.length();i++){
      for(int j=i+1;j<=data.length();j++){
        System.out.println(data.substring(i,j));
      }
    }
  }
}
