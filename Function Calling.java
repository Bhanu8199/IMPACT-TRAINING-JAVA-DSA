public class FunctionCalling{
  public static void main (String[] args) {
    
    
    // function overloading
    // function overriding
    
    MeraClass mc=new MeraClass();
    mc.myfunc(12);
  }
}
class MeraClass{
  void myfunc(String a){
    System.out.println("Function calling 1");
  }
  void myfunc(int a){
    System.out.println("Function calling 2");
  }
}
