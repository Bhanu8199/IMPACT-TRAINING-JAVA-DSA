public class circleconstructor{
  public static void main (String[] args) {
    
    // create a class called circle with property radius and find the area and perimeter using function
    
    Circle c=new Circle(12);
    c.findArea();
    c.circumferance();
    Circle c1=new Circle(55);
    c1.findArea();
    c1.circumferance();
    
  }
}
class Circle{
  double radius;
  Circle(double r){
    radius=r;
  }
  void findArea(){
    System.out.println(3.14*radius*radius);
  }
  void circumferance(){
    System.out.println(2*3.14*radius);
  }
}
