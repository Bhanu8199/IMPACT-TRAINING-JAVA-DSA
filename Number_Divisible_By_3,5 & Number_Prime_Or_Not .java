public class May2 {
  public static void main(String[] args){
    // check if the number is divisible by 3 and 5
    
    int a=15;
    if(a%3==0 && a%5==0){
      System.out.println("Number is divisible by 3 and 5");
    }else{
      System.out.println("Not divisible");
    }
    
    // check the number is prime or not
    int num= 13;
      int flag = 123;
      for(int i=2;i<num;i++){
        if(num%i==0){
          flag = 666;
          break;
        }
      }
      if(flag==123){
        System.out.println("prime number");
      }else{
        System.out.println("not prime");
      }
    
    
    
  }
}
