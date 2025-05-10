public class May2 {
  public static void main(String[] args){
    
    // fibonaaci series
    
    int num = 10;
      int a = 0;
      int b = 1;
      for(int i=1;i<=num;i++){
        System.out.println(a);
        int c = a+b;
        a = b;
        b = c;
    }
  }
}
