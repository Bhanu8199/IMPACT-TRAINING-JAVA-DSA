class parul{
  //main function
  public static void main(String[] args){
    //condition statements
    int a = 12;
    int b = 13;
    //if statements
    if(a>10){
      System.out.println("Hello world");
    }
    // else  
    if (b>2){
      System.out.println("b is greater then 2");
    }else{
      System.out.println("b is less then 2");
    }
    //else if
    if(a<b){
      System.out.println("a is less then 2");
    }else if(b>a){
      System.out.println("b is less then 2");
    }else{
      System.out.println("a is less then b");
    }
    
    //switch
    int c = 11;
    switch(c){
      case 11:
        System.out.println("Hello");
        break;
      case 12:
        System.out.println("Hola");
        break;
      case 13:
        System.out.println("Hi");
        break;
      case 34:
        System.out.println("sayonara");
        break;
      default:
       System.out.println("not found");   
    }
  }
}
