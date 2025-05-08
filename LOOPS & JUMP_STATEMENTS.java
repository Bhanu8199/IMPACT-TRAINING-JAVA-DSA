public class NewClass2 {

  public static void main(String[]args){
    
    // loops
    // used to do a repatative task
    // initial value
    // condition
    // increment //decrememnt
    
    // while loop
    int num=5;
    while(num<10){
      System.out.println("hello");
      num++;
    }
    
    // do while loop
    int a=12;
    do{
      System.out.println("hi");
      a++;
    }while(a<1);
    
    // for loops
    for(int n=1;n<=10;n++){
      System.out.println("Bye");
    }
    
    
    // jump statements
    // break 
    
    for(int i=1;i<10;i++){
      if(i==5){
        break;
      }
      System.out.println(i);
    }
    
    // continue
    for(int i=1;i<=10;i++){
      if(i==5){
        continue;
      }
      System.out.println(i);
    }
    
    // exit
    for(int i=1;i<10;i++){
      if(i==5){
        System.exit(0);
      }
      System.out.println(i);
    }

  }
}