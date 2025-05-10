public class May2 {
  public static void main(String[] args){
    // find all the prime numbers 1 to 100 (task)
    for (int num = 2; num <= 100; num++) {
      boolean isPrime = true;
      for (int i = 2; i <= Math.sqrt(num); i++) {
        if (num % i == 0) {
          isPrime = false;
          break;
        }
      }
      if (isPrime) {
        System.out.println(num + " ");
      }
    }
    
  }
}
