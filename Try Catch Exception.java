public class TryCatchException{
  public static void main (String[] args) {
    System.out.println("Start of program");
   try{
     System.out.println(12/0);
   }catch(Exception e){
     System.out.println("can not divide with zero");
   }
    System.out.println("End of program");
  }
}