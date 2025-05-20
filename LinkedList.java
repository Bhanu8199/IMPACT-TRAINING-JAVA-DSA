public class LinkedList{
  public static void main (String[] args) {
    
    MyLinkedList ml=new MyLinkedList();
    ml.add(12);
    ml.add(13);
    ml.add(14);
    ml.add(15);
    
    ml.removeLastElement();
    ml.printKaro();
    
  }
}
class MyLinkedList{
  
  Node head;
  void add(int xyz){
    if(head==null){   //if first element do this
      head=new Node(xyz);
      return;
    }
    // if not the first elements do this
    Node temp=head;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=new Node(xyz);
  }
  void printKaro(){
    if(head==null){
      System.out.println("No Element Found");
      return;
    }
    Node temp=head;
    while(temp.next!=null){
      System.out.println(temp.data);
      temp=temp.next;
    }
    System.out.println(temp.data);
  }
  void removeLastElement(){
    if(head==null){  // no element
      System.out.println("No Element to be removed");
      return;
    }
    if(head.next==null){  // if list has 1 elements
      head=null;
      return;
    }
    Node temp=head;
    while(temp.next!=null){
      temp=temp.next;
    }
    temp.next=null;
  }
}

class Node{
  int data;
  Node next;
  
  Node(int data){
    this.data=data;
    this.next=null;
  }
}