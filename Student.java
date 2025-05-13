public class student {
    public static void main(String[] args) {
      student s = new student(21,"Bhanu");
      // s.roll = 21;
      // s.name = "Bhanu";
      s.study();
      System.out.println(s.roll+" "+s.name);
      
      student s1 = new student(2004,"Vardhan");
      System.out.println(s1.roll+" "+s1.name);
  }
}
class student{
  int roll;
  String name;
  void study(){
    System.out.println("student is studing");
  }
  student(int r, String n){
    roll = r;
    name = n;
  }
}