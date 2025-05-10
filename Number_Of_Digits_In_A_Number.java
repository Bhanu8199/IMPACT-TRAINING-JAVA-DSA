public class May2 {
  public static void main(String[] args){

    // find the number of digits in a number
    
    //logic 
    //12345/10=1234 
    // 1234/10=123
    // 123/10=12
    // 12/10=1
    // 1/10=0
    
    int num=12345;
    int counter=0;
    while(num!=0){
      num=num/10;
      counter++;
    }
    System.out.println("Digit is=> "+counter);
  }
}
