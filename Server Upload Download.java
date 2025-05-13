import java.util.ArrayList;
public class ServerUploadDownload{
  public static void main (String[] args) {
    ArrayList<Person> personList=new ArrayList<>();
    personList.add(new Person("Bhanu","Eluru"));
    personList.add(new Person("Lavanya","vijayawada"));
    personList.add(new Person("Prudhvi","Hyderabad"));
    personList.add(new Person("Phani","Benguluru"));
    System.out.println(personList);
  }
}
class Person{
  String name;
  String address;
  Person(String name, String address){
    this.name=name;
    this.address=address;
  }
}