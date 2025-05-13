public class Componentsinheritancewithconstructor{
  public static void main (String[] args) {
    
    
    // inheritance with constructor
    
    Keyboard kb=new Keyboard();
    System.out.println(kb.price);
    System.out.println(kb.width);
  }
}
class Component{
  double price;
  double width;
  Component(double price,double width){
    this.price=price;
    this.width=width;
  }
}
class Keyboard extends Component{
  Keyboard(){
    super(1200,34.56);
  }
}
