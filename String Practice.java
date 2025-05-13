public class Practice{
  public static void main (String[] args) {
    Student s=new Student();
    s.st_name="Bhanu";
    s.st_address="Vadodara";
    s.clg=new College();
    s.clg.col_name="ParulUniversity";
    System.out.println(s.st_name+" "+s.st_address+" "+s.clg.col_name);
  }
}
class College{
  String col_name;
}
class Student{
  String st_name;
  String st_address;
  College clg;
}